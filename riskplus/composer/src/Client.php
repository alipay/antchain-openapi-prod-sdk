<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\RISKPLUS\Models\ApplyDubbridgeCreditRequest;
use AntChain\RISKPLUS\Models\ApplyDubbridgeCreditResponse;
use AntChain\RISKPLUS\Models\ApplyDubheCreditRequest;
use AntChain\RISKPLUS\Models\ApplyDubheCreditResponse;
use AntChain\RISKPLUS\Models\ApplyDubheCustomerAgreementsignRequest;
use AntChain\RISKPLUS\Models\ApplyDubheCustomerAgreementsignResponse;
use AntChain\RISKPLUS\Models\ApplyDubheUsecreditRequest;
use AntChain\RISKPLUS\Models\ApplyDubheUsecreditResponse;
use AntChain\RISKPLUS\Models\BindDubbridgeCustomerBankcardRequest;
use AntChain\RISKPLUS\Models\BindDubbridgeCustomerBankcardResponse;
use AntChain\RISKPLUS\Models\CheckSecurityDataRequest;
use AntChain\RISKPLUS\Models\CheckSecurityDataResponse;
use AntChain\RISKPLUS\Models\CheckSecurityRdsRequest;
use AntChain\RISKPLUS\Models\CheckSecurityRdsResponse;
use AntChain\RISKPLUS\Models\ConfirmSecurityPolicyRequest;
use AntChain\RISKPLUS\Models\ConfirmSecurityPolicyResponse;
use AntChain\RISKPLUS\Models\CountDubheRepayReftrialRequest;
use AntChain\RISKPLUS\Models\CountDubheRepayReftrialResponse;
use AntChain\RISKPLUS\Models\CountDubheRepayTrialRequest;
use AntChain\RISKPLUS\Models\CountDubheRepayTrialResponse;
use AntChain\RISKPLUS\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\RISKPLUS\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\RISKPLUS\Models\CreateRbbApiGwtokenRequest;
use AntChain\RISKPLUS\Models\CreateRbbApiGwtokenResponse;
use AntChain\RISKPLUS\Models\CreateRbbTenantRequest;
use AntChain\RISKPLUS\Models\CreateRbbTenantResponse;
use AntChain\RISKPLUS\Models\CreateRbbTokenRequest;
use AntChain\RISKPLUS\Models\CreateRbbTokenResponse;
use AntChain\RISKPLUS\Models\CreateRbbUserRequest;
use AntChain\RISKPLUS\Models\CreateRbbUserResponse;
use AntChain\RISKPLUS\Models\CreateRtopTokenRequest;
use AntChain\RISKPLUS\Models\CreateRtopTokenResponse;
use AntChain\RISKPLUS\Models\ExecRbbCompanyGuardRequest;
use AntChain\RISKPLUS\Models\ExecRbbCompanyGuardResponse;
use AntChain\RISKPLUS\Models\ExecRtopGenericInvokeRequest;
use AntChain\RISKPLUS\Models\ExecRtopGenericInvokeResponse;
use AntChain\RISKPLUS\Models\ExecSecurityRiskdataserviceRequest;
use AntChain\RISKPLUS\Models\ExecSecurityRiskdataserviceResponse;
use AntChain\RISKPLUS\Models\GetRbbLoginTokenRequest;
use AntChain\RISKPLUS\Models\GetRbbLoginTokenResponse;
use AntChain\RISKPLUS\Models\GetRtopCompanyDetailRequest;
use AntChain\RISKPLUS\Models\GetRtopCompanyDetailResponse;
use AntChain\RISKPLUS\Models\GetRtopCompanyMonitorRequest;
use AntChain\RISKPLUS\Models\GetRtopCompanyMonitorResponse;
use AntChain\RISKPLUS\Models\ListRtopCompanyOpinionsRequest;
use AntChain\RISKPLUS\Models\ListRtopCompanyOpinionsResponse;
use AntChain\RISKPLUS\Models\ListRtopCompanyRelatedRequest;
use AntChain\RISKPLUS\Models\ListRtopCompanyRelatedResponse;
use AntChain\RISKPLUS\Models\ListRtopCrowdriskRequest;
use AntChain\RISKPLUS\Models\ListRtopCrowdriskResponse;
use AntChain\RISKPLUS\Models\ListRtopStarCompanyRequest;
use AntChain\RISKPLUS\Models\ListRtopStarCompanyResponse;
use AntChain\RISKPLUS\Models\NotifyDubbridgeDefininnerchannelRequest;
use AntChain\RISKPLUS\Models\NotifyDubbridgeDefininnerchannelResponse;
use AntChain\RISKPLUS\Models\NotifyRpgwUserSignresultRequest;
use AntChain\RISKPLUS\Models\NotifyRpgwUserSignresultResponse;
use AntChain\RISKPLUS\Models\PullRegtechNewsRequest;
use AntChain\RISKPLUS\Models\PullRegtechNewsResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRouterFundrouterRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRouterFundrouterResponse;
use AntChain\RISKPLUS\Models\QueryDubheCreditStatusRequest;
use AntChain\RISKPLUS\Models\QueryDubheCreditStatusResponse;
use AntChain\RISKPLUS\Models\QueryDubheCustomerAgreementsignRequest;
use AntChain\RISKPLUS\Models\QueryDubheCustomerAgreementsignResponse;
use AntChain\RISKPLUS\Models\QueryDubheReceiptOverdueRequest;
use AntChain\RISKPLUS\Models\QueryDubheReceiptOverdueResponse;
use AntChain\RISKPLUS\Models\QueryDubheRepayInfoRequest;
use AntChain\RISKPLUS\Models\QueryDubheRepayInfoResponse;
use AntChain\RISKPLUS\Models\QueryDubheRepayListRequest;
use AntChain\RISKPLUS\Models\QueryDubheRepayListResponse;
use AntChain\RISKPLUS\Models\QueryDubheRouterFundrouterRequest;
use AntChain\RISKPLUS\Models\QueryDubheRouterFundrouterResponse;
use AntChain\RISKPLUS\Models\QueryDubheSearchContractRequest;
use AntChain\RISKPLUS\Models\QueryDubheSearchContractResponse;
use AntChain\RISKPLUS\Models\QueryDubheTestRequest;
use AntChain\RISKPLUS\Models\QueryDubheTestResponse;
use AntChain\RISKPLUS\Models\QueryDubheUsecreditStatusRequest;
use AntChain\RISKPLUS\Models\QueryDubheUsecreditStatusResponse;
use AntChain\RISKPLUS\Models\QueryFinserviceZhimaIdentifyRequest;
use AntChain\RISKPLUS\Models\QueryFinserviceZhimaIdentifyResponse;
use AntChain\RISKPLUS\Models\QueryMdipDataserviceRequest;
use AntChain\RISKPLUS\Models\QueryMdipDataserviceResponse;
use AntChain\RISKPLUS\Models\QueryRbbGeneralRequest;
use AntChain\RISKPLUS\Models\QueryRbbGeneralResponse;
use AntChain\RISKPLUS\Models\QueryRbbGenericInvokeRequest;
use AntChain\RISKPLUS\Models\QueryRbbGenericInvokeResponse;
use AntChain\RISKPLUS\Models\QueryRpgwSignUrlRequest;
use AntChain\RISKPLUS\Models\QueryRpgwSignUrlResponse;
use AntChain\RISKPLUS\Models\QueryRpgwUserSignurlRequest;
use AntChain\RISKPLUS\Models\QueryRpgwUserSignurlResponse;
use AntChain\RISKPLUS\Models\QueryRpSecurityPolicyRequest;
use AntChain\RISKPLUS\Models\QueryRpSecurityPolicyResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyAlarmRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyAlarmResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyFeedbackRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyFeedbackResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyListRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyListResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyOpinionRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyOpinionResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskinfoRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskinfoResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskyRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskyResponse;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskDetailRequest;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskDetailResponse;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskStatisticRequest;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskStatisticResponse;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskSumRequest;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskSumResponse;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelConfigRequest;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelConfigResponse;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelFilterRequest;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelFilterResponse;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelRequest;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelResponse;
use AntChain\RISKPLUS\Models\QueryRtopRiskstormRequest;
use AntChain\RISKPLUS\Models\QueryRtopRiskstormResponse;
use AntChain\RISKPLUS\Models\QueryRtopTagImageRequest;
use AntChain\RISKPLUS\Models\QueryRtopTagImageResponse;
use AntChain\RISKPLUS\Models\QuerySecurityDataRequest;
use AntChain\RISKPLUS\Models\QuerySecurityDataResponse;
use AntChain\RISKPLUS\Models\QuerySecurityPolicyRequest;
use AntChain\RISKPLUS\Models\QuerySecurityPolicyResponse;
use AntChain\RISKPLUS\Models\QuerySnapshotEventRequest;
use AntChain\RISKPLUS\Models\QuerySnapshotEventResponse;
use AntChain\RISKPLUS\Models\RegisterRpgwUserEinvoiceRequest;
use AntChain\RISKPLUS\Models\RegisterRpgwUserEinvoiceResponse;
use AntChain\RISKPLUS\Models\RepayDubheRepayCheckstandRequest;
use AntChain\RISKPLUS\Models\RepayDubheRepayCheckstandResponse;
use AntChain\RISKPLUS\Models\RepayDubheRepayWithholdRequest;
use AntChain\RISKPLUS\Models\RepayDubheRepayWithholdResponse;
use AntChain\RISKPLUS\Models\SendDubbridgeSmsBatchRequest;
use AntChain\RISKPLUS\Models\SendDubbridgeSmsBatchResponse;
use AntChain\RISKPLUS\Models\SendDubbridgeSmsRequest;
use AntChain\RISKPLUS\Models\SendDubbridgeSmsResponse;
use AntChain\RISKPLUS\Models\SendSecurityDataRequest;
use AntChain\RISKPLUS\Models\SendSecurityDataResponse;
use AntChain\RISKPLUS\Models\SyncRpgwUserOrderinfoRequest;
use AntChain\RISKPLUS\Models\SyncRpgwUserOrderinfoResponse;
use AntChain\RISKPLUS\Models\UpdateDubheCustomerInfoRequest;
use AntChain\RISKPLUS\Models\UpdateDubheCustomerInfoResponse;
use AntChain\RISKPLUS\Models\UploadDubbridgeFileRequest;
use AntChain\RISKPLUS\Models\UploadDubbridgeFileResponse;
use AntChain\RISKPLUS\Models\UploadUmktParamsFileRequest;
use AntChain\RISKPLUS\Models\UploadUmktParamsFileResponse;
use AntChain\RISKPLUS\Models\VerifyDubbridgeCustomerBankcardRequest;
use AntChain\RISKPLUS\Models\VerifyDubbridgeCustomerBankcardResponse;
use AntChain\RISKPLUS\Models\VerifyFinserviceZhimaIdentifyRequest;
use AntChain\RISKPLUS\Models\VerifyFinserviceZhimaIdentifyResponse;
use AntChain\RISKPLUS\Models\WithdrawRpgwUserCommissionRequest;
use AntChain\RISKPLUS\Models\WithdrawRpgwUserCommissionResponse;
use AntChain\Util\UtilClient;
use Exception;

class Client
{
    protected $_endpoint;

    protected $_regionId;

    protected $_accessKeyId;

    protected $_accessKeySecret;

    protected $_protocol;

    protected $_userAgent;

    protected $_readTimeout;

    protected $_connectTimeout;

    protected $_httpProxy;

    protected $_httpsProxy;

    protected $_socks5Proxy;

    protected $_socks5NetWork;

    protected $_noProxy;

    protected $_maxIdleConns;

    protected $_securityToken;

    protected $_maxIdleTimeMillis;

    protected $_keepAliveDurationMillis;

    protected $_maxRequests;

    protected $_maxRequestsPerHost;

    /**
     * Init client with Config.
     *
     * @param config config contains the necessary information to create a client
     * @param mixed $config
     */
    public function __construct($config)
    {
        if (Utils::isUnset($config)) {
            throw new TeaError([
                'code'    => 'ParameterMissing',
                'message' => "'config' can not be unset",
            ]);
        }
        $this->_accessKeyId             = $config->accessKeyId;
        $this->_accessKeySecret         = $config->accessKeySecret;
        $this->_securityToken           = $config->securityToken;
        $this->_endpoint                = $config->endpoint;
        $this->_protocol                = $config->protocol;
        $this->_userAgent               = $config->userAgent;
        $this->_readTimeout             = Utils::defaultNumber($config->readTimeout, 20000);
        $this->_connectTimeout          = Utils::defaultNumber($config->connectTimeout, 20000);
        $this->_httpProxy               = $config->httpProxy;
        $this->_httpsProxy              = $config->httpsProxy;
        $this->_noProxy                 = $config->noProxy;
        $this->_socks5Proxy             = $config->socks5Proxy;
        $this->_socks5NetWork           = $config->socks5NetWork;
        $this->_maxIdleConns            = Utils::defaultNumber($config->maxIdleConns, 60000);
        $this->_maxIdleTimeMillis       = Utils::defaultNumber($config->maxIdleTimeMillis, 5);
        $this->_keepAliveDurationMillis = Utils::defaultNumber($config->keepAliveDurationMillis, 5000);
        $this->_maxRequests             = Utils::defaultNumber($config->maxRequests, 100);
        $this->_maxRequestsPerHost      = Utils::defaultNumber($config->maxRequestsPerHost, 100);
    }

    /**
     * Encapsulate the request and invoke the network.
     *
     * @param string         $version
     * @param string         $action   api name
     * @param string         $protocol http or https
     * @param string         $method   e.g. GET
     * @param string         $pathname pathname of every api
     * @param mixed[]        $request  which contains request params
     * @param string[]       $headers
     * @param RuntimeOptions $runtime  which controls some details of call api, such as retry times
     *
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     *
     * @return array the response
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $headers, $runtime)
    {
        $runtime->validate();
        $_runtime = [
            'timeouted'               => 'retry',
            'readTimeout'             => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            'connectTimeout'          => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            'httpProxy'               => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            'httpsProxy'              => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            'noProxy'                 => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            'maxIdleConns'            => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            'maxIdleTimeMillis'       => $this->_maxIdleTimeMillis,
            'keepAliveDurationMillis' => $this->_keepAliveDurationMillis,
            'maxRequests'             => $this->_maxRequests,
            'maxRequestsPerHost'      => $this->_maxRequestsPerHost,
            'retry'                   => [
                'retryable'   => $runtime->autoretry,
                'maxAttempts' => Utils::defaultNumber($runtime->maxAttempts, 3),
            ],
            'backoff' => [
                'policy' => Utils::defaultString($runtime->backoffPolicy, 'no'),
                'period' => Utils::defaultNumber($runtime->backoffPeriod, 1),
            ],
            'ignoreSSL' => $runtime->ignoreSSL,
            // 删除参数
        ];
        $_lastRequest   = null;
        $_lastException = null;
        $_now           = time();
        $_retryTimes    = 0;
        while (Tea::allowRetry(@$_runtime['retry'], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime(@$_runtime['backoff'], $_retryTimes);
                if ($_backoffTime > 0) {
                    Tea::sleep($_backoffTime);
                }
            }
            $_retryTimes = $_retryTimes + 1;

            try {
                $_request           = new Request();
                $_request->protocol = Utils::defaultString($this->_protocol, $protocol);
                $_request->method   = $method;
                $_request->pathname = $pathname;
                $_request->query    = [
                    'method'           => $action,
                    'version'          => $version,
                    'sign_type'        => 'HmacSHA1',
                    'req_time'         => UtilClient::getTimestamp(),
                    'req_msg_id'       => UtilClient::getNonce(),
                    'access_key'       => $this->_accessKeyId,
                    'base_sdk_version' => 'TeaSDK-2.0',
                    'sdk_version'      => '1.8.9',
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query['security_token'] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    'host'       => Utils::defaultString($this->_endpoint, 'openapi.antchain.antgroup.com'),
                    'user-agent' => Utils::getUserAgent($this->_userAgent),
                ], $headers);
                $tmp                               = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body                    = Utils::toFormString($tmp);
                $_request->headers['content-type'] = 'application/x-www-form-urlencoded';
                $signedParam                       = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query['sign']           = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest                      = $_request;
                $_response                         = Tea::send($_request, $_runtime);
                $raw                               = Utils::readAsString($_response->body);
                $obj                               = Utils::parseJSON($raw);
                $res                               = Utils::assertAsMap($obj);
                $resp                              = Utils::assertAsMap(@$res['response']);
                if (UtilClient::hasError($raw, $this->_accessKeySecret)) {
                    throw new TeaError([
                        'message' => @$resp['result_msg'],
                        'data'    => $resp,
                        'code'    => @$resp['result_code'],
                    ]);
                }

                return $resp;
            } catch (Exception $e) {
                if (!($e instanceof TeaError)) {
                    $e = new TeaError([], $e->getMessage(), $e->getCode(), $e);
                }
                if (Tea::isRetryable($e)) {
                    $_lastException = $e;

                    continue;
                }

                throw $e;
            }
        }

        throw new TeaUnableRetryError($_lastRequest, $_lastException);
    }

    /**
     * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
     * Summary: 策略咨询服务输出.
     *
     * @param QuerySecurityPolicyRequest $request
     *
     * @return QuerySecurityPolicyResponse
     */
    public function querySecurityPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
     * Summary: 策略咨询服务输出.
     *
     * @param QuerySecurityPolicyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QuerySecurityPolicyResponse
     */
    public function querySecurityPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySecurityPolicyResponse::fromMap($this->doRequest('1.0', 'riskplus.security.policy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据.
     *
     * @param SendSecurityDataRequest $request
     *
     * @return SendSecurityDataResponse
     */
    public function sendSecurityData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendSecurityDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据.
     *
     * @param SendSecurityDataRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SendSecurityDataResponse
     */
    public function sendSecurityDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendSecurityDataResponse::fromMap($this->doRequest('1.0', 'riskplus.security.data.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出.
     *
     * @param ConfirmSecurityPolicyRequest $request
     *
     * @return ConfirmSecurityPolicyResponse
     */
    public function confirmSecurityPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmSecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出.
     *
     * @param ConfirmSecurityPolicyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ConfirmSecurityPolicyResponse
     */
    public function confirmSecurityPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmSecurityPolicyResponse::fromMap($this->doRequest('1.0', 'riskplus.security.policy.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出.
     *
     * @param CheckSecurityRdsRequest $request
     *
     * @return CheckSecurityRdsResponse
     */
    public function checkSecurityRds($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSecurityRdsEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出.
     *
     * @param CheckSecurityRdsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CheckSecurityRdsResponse
     */
    public function checkSecurityRdsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSecurityRdsResponse::fromMap($this->doRequest('1.0', 'riskplus.security.rds.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出.
     *
     * @param QuerySecurityDataRequest $request
     *
     * @return QuerySecurityDataResponse
     */
    public function querySecurityData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySecurityDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出.
     *
     * @param QuerySecurityDataRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QuerySecurityDataResponse
     */
    public function querySecurityDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySecurityDataResponse::fromMap($this->doRequest('1.0', 'riskplus.security.data.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验.
     *
     * @param CheckSecurityDataRequest $request
     *
     * @return CheckSecurityDataResponse
     */
    public function checkSecurityData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSecurityDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验.
     *
     * @param CheckSecurityDataRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CheckSecurityDataResponse
     */
    public function checkSecurityDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSecurityDataResponse::fromMap($this->doRequest('1.0', 'riskplus.security.data.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 反欺诈风险数据服务请求执行
     * Summary: 反欺诈风险数据服务请求执行.
     *
     * @param ExecSecurityRiskdataserviceRequest $request
     *
     * @return ExecSecurityRiskdataserviceResponse
     */
    public function execSecurityRiskdataservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execSecurityRiskdataserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 反欺诈风险数据服务请求执行
     * Summary: 反欺诈风险数据服务请求执行.
     *
     * @param ExecSecurityRiskdataserviceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ExecSecurityRiskdataserviceResponse
     */
    public function execSecurityRiskdataserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecSecurityRiskdataserviceResponse::fromMap($this->doRequest('1.0', 'riskplus.security.riskdataservice.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢信贷业务系统线下测试环境测试接口
     * Summary: 天枢信贷业务系统线下测试接口.
     *
     * @param QueryDubheTestRequest $request
     *
     * @return QueryDubheTestResponse
     */
    public function queryDubheTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢信贷业务系统线下测试环境测试接口
     * Summary: 天枢信贷业务系统线下测试接口.
     *
     * @param QueryDubheTestRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryDubheTestResponse
     */
    public function queryDubheTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheTestResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过客户三要素信息查询资金方代码(资金路由)
     * Summary: 天枢系统资金方代码(资金路由)查询.
     *
     * @param QueryDubheRouterFundrouterRequest $request
     *
     * @return QueryDubheRouterFundrouterResponse
     */
    public function queryDubheRouterFundrouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheRouterFundrouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过客户三要素信息查询资金方代码(资金路由)
     * Summary: 天枢系统资金方代码(资金路由)查询.
     *
     * @param QueryDubheRouterFundrouterRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryDubheRouterFundrouterResponse
     */
    public function queryDubheRouterFundrouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheRouterFundrouterResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.router.fundrouter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口.
     *
     * @param ApplyDubheCreditRequest $request
     *
     * @return ApplyDubheCreditResponse
     */
    public function applyDubheCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubheCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口.
     *
     * @param ApplyDubheCreditRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ApplyDubheCreditResponse
     */
    public function applyDubheCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubheCreditResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.credit.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口.
     *
     * @param QueryDubheCreditStatusRequest $request
     *
     * @return QueryDubheCreditStatusResponse
     */
    public function queryDubheCreditStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheCreditStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口.
     *
     * @param QueryDubheCreditStatusRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryDubheCreditStatusResponse
     */
    public function queryDubheCreditStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheCreditStatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.credit.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算.
     *
     * @param CountDubheRepayReftrialRequest $request
     *
     * @return CountDubheRepayReftrialResponse
     */
    public function countDubheRepayReftrial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countDubheRepayReftrialEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算.
     *
     * @param CountDubheRepayReftrialRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CountDubheRepayReftrialResponse
     */
    public function countDubheRepayReftrialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountDubheRepayReftrialResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.reftrial.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询.
     *
     * @param QueryDubheRepayListRequest $request
     *
     * @return QueryDubheRepayListResponse
     */
    public function queryDubheRepayList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheRepayListEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询.
     *
     * @param QueryDubheRepayListRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDubheRepayListResponse
     */
    public function queryDubheRepayListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheRepayListResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口.
     *
     * @param ApplyDubheUsecreditRequest $request
     *
     * @return ApplyDubheUsecreditResponse
     */
    public function applyDubheUsecredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubheUsecreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口.
     *
     * @param ApplyDubheUsecreditRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ApplyDubheUsecreditResponse
     */
    public function applyDubheUsecreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubheUsecreditResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.usecredit.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询.
     *
     * @param QueryDubheUsecreditStatusRequest $request
     *
     * @return QueryDubheUsecreditStatusResponse
     */
    public function queryDubheUsecreditStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheUsecreditStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询.
     *
     * @param QueryDubheUsecreditStatusRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryDubheUsecreditStatusResponse
     */
    public function queryDubheUsecreditStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheUsecreditStatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.usecredit.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算.
     *
     * @param CountDubheRepayTrialRequest $request
     *
     * @return CountDubheRepayTrialResponse
     */
    public function countDubheRepayTrial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countDubheRepayTrialEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算.
     *
     * @param CountDubheRepayTrialRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CountDubheRepayTrialResponse
     */
    public function countDubheRepayTrialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountDubheRepayTrialResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.trial.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口.
     *
     * @param RepayDubheRepayCheckstandRequest $request
     *
     * @return RepayDubheRepayCheckstandResponse
     */
    public function repayDubheRepayCheckstand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayDubheRepayCheckstandEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口.
     *
     * @param RepayDubheRepayCheckstandRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return RepayDubheRepayCheckstandResponse
     */
    public function repayDubheRepayCheckstandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayDubheRepayCheckstandResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.checkstand.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询.
     *
     * @param QueryDubheRepayInfoRequest $request
     *
     * @return QueryDubheRepayInfoResponse
     */
    public function queryDubheRepayInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheRepayInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询.
     *
     * @param QueryDubheRepayInfoRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDubheRepayInfoResponse
     */
    public function queryDubheRepayInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheRepayInfoResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口.
     *
     * @param UpdateDubheCustomerInfoRequest $request
     *
     * @return UpdateDubheCustomerInfoResponse
     */
    public function updateDubheCustomerInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDubheCustomerInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口.
     *
     * @param UpdateDubheCustomerInfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateDubheCustomerInfoResponse
     */
    public function updateDubheCustomerInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDubheCustomerInfoResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.customer.info.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝
     * Summary: 天枢系统协议签约申请(支付宝).
     *
     * @param ApplyDubheCustomerAgreementsignRequest $request
     *
     * @return ApplyDubheCustomerAgreementsignResponse
     */
    public function applyDubheCustomerAgreementsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubheCustomerAgreementsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝
     * Summary: 天枢系统协议签约申请(支付宝).
     *
     * @param ApplyDubheCustomerAgreementsignRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return ApplyDubheCustomerAgreementsignResponse
     */
    public function applyDubheCustomerAgreementsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubheCustomerAgreementsignResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.customer.agreementsign.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝).
     *
     * @param QueryDubheCustomerAgreementsignRequest $request
     *
     * @return QueryDubheCustomerAgreementsignResponse
     */
    public function queryDubheCustomerAgreementsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheCustomerAgreementsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝).
     *
     * @param QueryDubheCustomerAgreementsignRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryDubheCustomerAgreementsignResponse
     */
    public function queryDubheCustomerAgreementsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheCustomerAgreementsignResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.customer.agreementsign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口.
     *
     * @param RepayDubheRepayWithholdRequest $request
     *
     * @return RepayDubheRepayWithholdResponse
     */
    public function repayDubheRepayWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayDubheRepayWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口.
     *
     * @param RepayDubheRepayWithholdRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return RepayDubheRepayWithholdResponse
     */
    public function repayDubheRepayWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayDubheRepayWithholdResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.withhold.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取.
     *
     * @param QueryDubheSearchContractRequest $request
     *
     * @return QueryDubheSearchContractResponse
     */
    public function queryDubheSearchContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheSearchContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取.
     *
     * @param QueryDubheSearchContractRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryDubheSearchContractResponse
     */
    public function queryDubheSearchContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheSearchContractResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.search.contract.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询.
     *
     * @param QueryDubheReceiptOverdueRequest $request
     *
     * @return QueryDubheReceiptOverdueResponse
     */
    public function queryDubheReceiptOverdue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheReceiptOverdueEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询.
     *
     * @param QueryDubheReceiptOverdueRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryDubheReceiptOverdueResponse
     */
    public function queryDubheReceiptOverdueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheReceiptOverdueResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.receipt.overdue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢发送短信接口，适用于一个模板相同参数
     * Summary: 天枢发送短信接口.
     *
     * @param SendDubbridgeSmsRequest $request
     *
     * @return SendDubbridgeSmsResponse
     */
    public function sendDubbridgeSms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendDubbridgeSmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢发送短信接口，适用于一个模板相同参数
     * Summary: 天枢发送短信接口.
     *
     * @param SendDubbridgeSmsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SendDubbridgeSmsResponse
     */
    public function sendDubbridgeSmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendDubbridgeSmsResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.sms.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
     * Summary: 天枢批量发送短信接口.
     *
     * @param SendDubbridgeSmsBatchRequest $request
     *
     * @return SendDubbridgeSmsBatchResponse
     */
    public function sendDubbridgeSmsBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendDubbridgeSmsBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
     * Summary: 天枢批量发送短信接口.
     *
     * @param SendDubbridgeSmsBatchRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SendDubbridgeSmsBatchResponse
     */
    public function sendDubbridgeSmsBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendDubbridgeSmsBatchResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.sms.batch.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资金路由接口，获取资金方编号
     * Summary: 天枢系统资金方代码(资金路由)查询.
     *
     * @param QueryDubbridgeRouterFundrouterRequest $request
     *
     * @return QueryDubbridgeRouterFundrouterResponse
     */
    public function queryDubbridgeRouterFundrouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRouterFundrouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 资金路由接口，获取资金方编号
     * Summary: 天枢系统资金方代码(资金路由)查询.
     *
     * @param QueryDubbridgeRouterFundrouterRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryDubbridgeRouterFundrouterResponse
     */
    public function queryDubbridgeRouterFundrouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRouterFundrouterResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.router.fundrouter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口.
     *
     * @param ApplyDubbridgeCreditRequest $request
     *
     * @return ApplyDubbridgeCreditResponse
     */
    public function applyDubbridgeCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubbridgeCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口.
     *
     * @param ApplyDubbridgeCreditRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ApplyDubbridgeCreditResponse
     */
    public function applyDubbridgeCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubbridgeCreditResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.credit.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
     * Summary: 天枢文件上传.
     *
     * @param UploadDubbridgeFileRequest $request
     *
     * @return UploadDubbridgeFileResponse
     */
    public function uploadDubbridgeFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadDubbridgeFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
     * Summary: 天枢文件上传.
     *
     * @param UploadDubbridgeFileRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UploadDubbridgeFileResponse
     */
    public function uploadDubbridgeFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.dubbridge.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadDubbridgeFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return UploadDubbridgeFileResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约绑卡接口
     * Summary: 代扣协议签约申请(银行卡绑卡).
     *
     * @param BindDubbridgeCustomerBankcardRequest $request
     *
     * @return BindDubbridgeCustomerBankcardResponse
     */
    public function bindDubbridgeCustomerBankcard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindDubbridgeCustomerBankcardEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约绑卡接口
     * Summary: 代扣协议签约申请(银行卡绑卡).
     *
     * @param BindDubbridgeCustomerBankcardRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BindDubbridgeCustomerBankcardResponse
     */
    public function bindDubbridgeCustomerBankcardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindDubbridgeCustomerBankcardResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.customer.bankcard.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣协议签约提交(银行卡绑卡)
     * Summary: 代扣协议签约校验(银行卡绑卡).
     *
     * @param VerifyDubbridgeCustomerBankcardRequest $request
     *
     * @return VerifyDubbridgeCustomerBankcardResponse
     */
    public function verifyDubbridgeCustomerBankcard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyDubbridgeCustomerBankcardEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣协议签约提交(银行卡绑卡)
     * Summary: 代扣协议签约校验(银行卡绑卡).
     *
     * @param VerifyDubbridgeCustomerBankcardRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return VerifyDubbridgeCustomerBankcardResponse
     */
    public function verifyDubbridgeCustomerBankcardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyDubbridgeCustomerBankcardResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.customer.bankcard.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于机构通道通用回调
     * Summary: 机构通道回调通用接口.
     *
     * @param NotifyDubbridgeDefininnerchannelRequest $request
     *
     * @return NotifyDubbridgeDefininnerchannelResponse
     */
    public function notifyDubbridgeDefininnerchannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyDubbridgeDefininnerchannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于机构通道通用回调
     * Summary: 机构通道回调通用接口.
     *
     * @param NotifyDubbridgeDefininnerchannelRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return NotifyDubbridgeDefininnerchannelResponse
     */
    public function notifyDubbridgeDefininnerchannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyDubbridgeDefininnerchannelResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.defininnerchannel.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口.
     *
     * @param VerifyFinserviceZhimaIdentifyRequest $request
     *
     * @return VerifyFinserviceZhimaIdentifyResponse
     */
    public function verifyFinserviceZhimaIdentify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyFinserviceZhimaIdentifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口.
     *
     * @param VerifyFinserviceZhimaIdentifyRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return VerifyFinserviceZhimaIdentifyResponse
     */
    public function verifyFinserviceZhimaIdentifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyFinserviceZhimaIdentifyResponse::fromMap($this->doRequest('1.0', 'riskplus.finservice.zhima.identify.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: 芝麻四要素认证结果查询.
     *
     * @param QueryFinserviceZhimaIdentifyRequest $request
     *
     * @return QueryFinserviceZhimaIdentifyResponse
     */
    public function queryFinserviceZhimaIdentify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFinserviceZhimaIdentifyEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: 芝麻四要素认证结果查询.
     *
     * @param QueryFinserviceZhimaIdentifyRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryFinserviceZhimaIdentifyResponse
     */
    public function queryFinserviceZhimaIdentifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFinserviceZhimaIdentifyResponse::fromMap($this->doRequest('1.0', 'riskplus.finservice.zhima.identify.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 多源融合平台的数据服务查询接口
     * Summary: 多源融合平台的数据服务查询接口.
     *
     * @param QueryMdipDataserviceRequest $request
     *
     * @return QueryMdipDataserviceResponse
     */
    public function queryMdipDataservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMdipDataserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 多源融合平台的数据服务查询接口
     * Summary: 多源融合平台的数据服务查询接口.
     *
     * @param QueryMdipDataserviceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryMdipDataserviceResponse
     */
    public function queryMdipDataserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMdipDataserviceResponse::fromMap($this->doRequest('1.0', 'riskplus.mdip.dataservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】.
     *
     * @param QueryRbbGenericInvokeRequest $request
     *
     * @return QueryRbbGenericInvokeResponse
     */
    public function queryRbbGenericInvoke($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRbbGenericInvokeEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】.
     *
     * @param QueryRbbGenericInvokeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRbbGenericInvokeResponse
     */
    public function queryRbbGenericInvokeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRbbGenericInvokeResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.generic.invoke.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】.
     *
     * @param CreateRbbTokenRequest $request
     *
     * @return CreateRbbTokenResponse
     */
    public function createRbbToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRbbTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】.
     *
     * @param CreateRbbTokenRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateRbbTokenResponse
     */
    public function createRbbTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRbbTokenResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.token.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】.
     *
     * @param CreateRbbApiGwtokenRequest $request
     *
     * @return CreateRbbApiGwtokenResponse
     */
    public function createRbbApiGwtoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRbbApiGwtokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】.
     *
     * @param CreateRbbApiGwtokenRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateRbbApiGwtokenResponse
     */
    public function createRbbApiGwtokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRbbApiGwtokenResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.api.gwtoken.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI.
     *
     * @param QueryRbbGeneralRequest $request
     *
     * @return QueryRbbGeneralResponse
     */
    public function queryRbbGeneral($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRbbGeneralEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI.
     *
     * @param QueryRbbGeneralRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryRbbGeneralResponse
     */
    public function queryRbbGeneralEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRbbGeneralResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.general.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token.
     *
     * @param GetRbbLoginTokenRequest $request
     *
     * @return GetRbbLoginTokenResponse
     */
    public function getRbbLoginToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRbbLoginTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token.
     *
     * @param GetRbbLoginTokenRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetRbbLoginTokenResponse
     */
    public function getRbbLoginTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRbbLoginTokenResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.login.token.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户.
     *
     * @param CreateRbbTenantRequest $request
     *
     * @return CreateRbbTenantResponse
     */
    public function createRbbTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRbbTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户.
     *
     * @param CreateRbbTenantRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateRbbTenantResponse
     */
    public function createRbbTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRbbTenantResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.tenant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户.
     *
     * @param CreateRbbUserRequest $request
     *
     * @return CreateRbbUserResponse
     */
    public function createRbbUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRbbUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户.
     *
     * @param CreateRbbUserRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateRbbUserResponse
     */
    public function createRbbUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRbbUserResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.user.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业准入接口
     * Summary: 企业准入.
     *
     * @param ExecRbbCompanyGuardRequest $request
     *
     * @return ExecRbbCompanyGuardResponse
     */
    public function execRbbCompanyGuard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execRbbCompanyGuardEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业准入接口
     * Summary: 企业准入.
     *
     * @param ExecRbbCompanyGuardRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecRbbCompanyGuardResponse
     */
    public function execRbbCompanyGuardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecRbbCompanyGuardResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.company.guard.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取签约接口
     * Summary: 获取签约接口.
     *
     * @param QueryRpgwSignUrlRequest $request
     *
     * @return QueryRpgwSignUrlResponse
     */
    public function queryRpgwSignUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRpgwSignUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取签约接口
     * Summary: 获取签约接口.
     *
     * @param QueryRpgwSignUrlRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryRpgwSignUrlResponse
     */
    public function queryRpgwSignUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRpgwSignUrlResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.sign.url.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建报税用户接口
     * Summary: 创建报税用户接口.
     *
     * @param RegisterRpgwUserEinvoiceRequest $request
     *
     * @return RegisterRpgwUserEinvoiceResponse
     */
    public function registerRpgwUserEinvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerRpgwUserEinvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建报税用户接口
     * Summary: 创建报税用户接口.
     *
     * @param RegisterRpgwUserEinvoiceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return RegisterRpgwUserEinvoiceResponse
     */
    public function registerRpgwUserEinvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterRpgwUserEinvoiceResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.einvoice.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询签约接口
     * Summary: 获取签约接口.
     *
     * @param QueryRpgwUserSignurlRequest $request
     *
     * @return QueryRpgwUserSignurlResponse
     */
    public function queryRpgwUserSignurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRpgwUserSignurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询签约接口
     * Summary: 获取签约接口.
     *
     * @param QueryRpgwUserSignurlRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRpgwUserSignurlResponse
     */
    public function queryRpgwUserSignurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRpgwUserSignurlResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.signurl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提现
     * Summary: 提现.
     *
     * @param WithdrawRpgwUserCommissionRequest $request
     *
     * @return WithdrawRpgwUserCommissionResponse
     */
    public function withdrawRpgwUserCommission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->withdrawRpgwUserCommissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 提现
     * Summary: 提现.
     *
     * @param WithdrawRpgwUserCommissionRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return WithdrawRpgwUserCommissionResponse
     */
    public function withdrawRpgwUserCommissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return WithdrawRpgwUserCommissionResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.commission.withdraw', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信息同步
     * Summary: 下单等信息同步.
     *
     * @param SyncRpgwUserOrderinfoRequest $request
     *
     * @return SyncRpgwUserOrderinfoResponse
     */
    public function syncRpgwUserOrderinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncRpgwUserOrderinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 信息同步
     * Summary: 下单等信息同步.
     *
     * @param SyncRpgwUserOrderinfoRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SyncRpgwUserOrderinfoResponse
     */
    public function syncRpgwUserOrderinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncRpgwUserOrderinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.orderinfo.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 签约结果通知
     * Summary: 签约结果通知.
     *
     * @param NotifyRpgwUserSignresultRequest $request
     *
     * @return NotifyRpgwUserSignresultResponse
     */
    public function notifyRpgwUserSignresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyRpgwUserSignresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 签约结果通知
     * Summary: 签约结果通知.
     *
     * @param NotifyRpgwUserSignresultRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return NotifyRpgwUserSignresultResponse
     */
    public function notifyRpgwUserSignresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyRpgwUserSignresultResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.signresult.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表.
     *
     * @param QueryRtopCompanyOpinionRequest $request
     *
     * @return QueryRtopCompanyOpinionResponse
     */
    public function queryRtopCompanyOpinion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyOpinionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表.
     *
     * @param QueryRtopCompanyOpinionRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryRtopCompanyOpinionResponse
     */
    public function queryRtopCompanyOpinionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyOpinionResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.opinion.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息.
     *
     * @param ListRtopCompanyOpinionsRequest $request
     *
     * @return ListRtopCompanyOpinionsResponse
     */
    public function listRtopCompanyOpinions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRtopCompanyOpinionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息.
     *
     * @param ListRtopCompanyOpinionsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListRtopCompanyOpinionsResponse
     */
    public function listRtopCompanyOpinionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRtopCompanyOpinionsResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.opinions.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情.
     *
     * @param GetRtopCompanyMonitorRequest $request
     *
     * @return GetRtopCompanyMonitorResponse
     */
    public function getRtopCompanyMonitor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRtopCompanyMonitorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情.
     *
     * @param GetRtopCompanyMonitorRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetRtopCompanyMonitorResponse
     */
    public function getRtopCompanyMonitorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRtopCompanyMonitorResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.monitor.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息.
     *
     * @param QueryRtopCrowdriskStatisticRequest $request
     *
     * @return QueryRtopCrowdriskStatisticResponse
     */
    public function queryRtopCrowdriskStatistic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCrowdriskStatisticEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息.
     *
     * @param QueryRtopCrowdriskStatisticRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryRtopCrowdriskStatisticResponse
     */
    public function queryRtopCrowdriskStatisticEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCrowdriskStatisticResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.crowdrisk.statistic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表.
     *
     * @param ListRtopCrowdriskRequest $request
     *
     * @return ListRtopCrowdriskResponse
     */
    public function listRtopCrowdrisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRtopCrowdriskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表.
     *
     * @param ListRtopCrowdriskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListRtopCrowdriskResponse
     */
    public function listRtopCrowdriskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRtopCrowdriskResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.crowdrisk.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息.
     *
     * @param QueryRtopCrowdriskDetailRequest $request
     *
     * @return QueryRtopCrowdriskDetailResponse
     */
    public function queryRtopCrowdriskDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCrowdriskDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息.
     *
     * @param QueryRtopCrowdriskDetailRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopCrowdriskDetailResponse
     */
    public function queryRtopCrowdriskDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCrowdriskDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.crowdrisk.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息.
     *
     * @param QueryRtopRiskstormRequest $request
     *
     * @return QueryRtopRiskstormResponse
     */
    public function queryRtopRiskstorm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopRiskstormEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息.
     *
     * @param QueryRtopRiskstormRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryRtopRiskstormResponse
     */
    public function queryRtopRiskstormEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopRiskstormResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.riskstorm.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额.
     *
     * @param QueryRtopCrowdriskSumRequest $request
     *
     * @return QueryRtopCrowdriskSumResponse
     */
    public function queryRtopCrowdriskSum($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCrowdriskSumEx($request, $headers, $runtime);
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额.
     *
     * @param QueryRtopCrowdriskSumRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRtopCrowdriskSumResponse
     */
    public function queryRtopCrowdriskSumEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCrowdriskSumResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.crowdrisk.sum.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取.
     *
     * @param GetRtopCompanyDetailRequest $request
     *
     * @return GetRtopCompanyDetailResponse
     */
    public function getRtopCompanyDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRtopCompanyDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取.
     *
     * @param GetRtopCompanyDetailRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetRtopCompanyDetailResponse
     */
    public function getRtopCompanyDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRtopCompanyDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.detail.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口.
     *
     * @param QueryRtopCompanyRiskinfoRequest $request
     *
     * @return QueryRtopCompanyRiskinfoResponse
     */
    public function queryRtopCompanyRiskinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyRiskinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口.
     *
     * @param QueryRtopCompanyRiskinfoRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopCompanyRiskinfoResponse
     */
    public function queryRtopCompanyRiskinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyRiskinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.riskinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口.
     *
     * @param ExecRtopGenericInvokeRequest $request
     *
     * @return ExecRtopGenericInvokeResponse
     */
    public function execRtopGenericInvoke($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execRtopGenericInvokeEx($request, $headers, $runtime);
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口.
     *
     * @param ExecRtopGenericInvokeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ExecRtopGenericInvokeResponse
     */
    public function execRtopGenericInvokeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecRtopGenericInvokeResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.generic.invoke.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token.
     *
     * @param CreateRtopTokenRequest $request
     *
     * @return CreateRtopTokenResponse
     */
    public function createRtopToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRtopTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token.
     *
     * @param CreateRtopTokenRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateRtopTokenResponse
     */
    public function createRtopTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRtopTokenResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.token.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取.
     *
     * @param QueryRtopRisklabelRequest $request
     *
     * @return QueryRtopRisklabelResponse
     */
    public function queryRtopRisklabel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopRisklabelEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取.
     *
     * @param QueryRtopRisklabelRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryRtopRisklabelResponse
     */
    public function queryRtopRisklabelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopRisklabelResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.risklabel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取.
     *
     * @param QueryRtopCompanyRequest $request
     *
     * @return QueryRtopCompanyResponse
     */
    public function queryRtopCompany($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取.
     *
     * @param QueryRtopCompanyRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryRtopCompanyResponse
     */
    public function queryRtopCompanyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签配置全量信息获取
     * rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取.
     *
     * @param QueryRtopRisklabelFilterRequest $request
     *
     * @return QueryRtopRisklabelFilterResponse
     */
    public function queryRtopRisklabelFilter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopRisklabelFilterEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签配置全量信息获取
     * rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取.
     *
     * @param QueryRtopRisklabelFilterRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopRisklabelFilterResponse
     */
    public function queryRtopRisklabelFilterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopRisklabelFilterResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.risklabel.filter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步.
     *
     * @param PullRegtechNewsRequest $request
     *
     * @return PullRegtechNewsResponse
     */
    public function pullRegtechNews($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullRegtechNewsEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步.
     *
     * @param PullRegtechNewsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return PullRegtechNewsResponse
     */
    public function pullRegtechNewsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullRegtechNewsResponse::fromMap($this->doRequest('1.0', 'riskplus.regtech.news.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈.
     *
     * @param QueryRtopCompanyFeedbackRequest $request
     *
     * @return QueryRtopCompanyFeedbackResponse
     */
    public function queryRtopCompanyFeedback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyFeedbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈.
     *
     * @param QueryRtopCompanyFeedbackRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopCompanyFeedbackResponse
     */
    public function queryRtopCompanyFeedbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyFeedbackResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.feedback.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询.
     *
     * @param QueryRtopCompanyAlarmRequest $request
     *
     * @return QueryRtopCompanyAlarmResponse
     */
    public function queryRtopCompanyAlarm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyAlarmEx($request, $headers, $runtime);
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询.
     *
     * @param QueryRtopCompanyAlarmRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRtopCompanyAlarmResponse
     */
    public function queryRtopCompanyAlarmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyAlarmResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.alarm.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表.
     *
     * @param QueryRtopCompanyRiskyRequest $request
     *
     * @return QueryRtopCompanyRiskyResponse
     */
    public function queryRtopCompanyRisky($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyRiskyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表.
     *
     * @param QueryRtopCompanyRiskyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRtopCompanyRiskyResponse
     */
    public function queryRtopCompanyRiskyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyRiskyResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.risky.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表.
     *
     * @param QueryRtopCompanyListRequest $request
     *
     * @return QueryRtopCompanyListResponse
     */
    public function queryRtopCompanyList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyListEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表.
     *
     * @param QueryRtopCompanyListRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRtopCompanyListResponse
     */
    public function queryRtopCompanyListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyListResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取.
     *
     * @param QueryRtopRisklabelConfigRequest $request
     *
     * @return QueryRtopRisklabelConfigResponse
     */
    public function queryRtopRisklabelConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopRisklabelConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取.
     *
     * @param QueryRtopRisklabelConfigRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopRisklabelConfigResponse
     */
    public function queryRtopRisklabelConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopRisklabelConfigResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.risklabel.config.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询.
     *
     * @param QueryRtopCompanyRiskRequest $request
     *
     * @return QueryRtopCompanyRiskResponse
     */
    public function queryRtopCompanyRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询.
     *
     * @param QueryRtopCompanyRiskRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRtopCompanyRiskResponse
     */
    public function queryRtopCompanyRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyRiskResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业.
     *
     * @param ListRtopCompanyRelatedRequest $request
     *
     * @return ListRtopCompanyRelatedResponse
     */
    public function listRtopCompanyRelated($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRtopCompanyRelatedEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业.
     *
     * @param ListRtopCompanyRelatedRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListRtopCompanyRelatedResponse
     */
    public function listRtopCompanyRelatedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRtopCompanyRelatedResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.related.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询.
     *
     * @param QueryRtopTagImageRequest $request
     *
     * @return QueryRtopTagImageResponse
     */
    public function queryRtopTagImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopTagImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询.
     *
     * @param QueryRtopTagImageRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryRtopTagImageResponse
     */
    public function queryRtopTagImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopTagImageResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.tag.image.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表.
     *
     * @param ListRtopStarCompanyRequest $request
     *
     * @return ListRtopStarCompanyResponse
     */
    public function listRtopStarCompany($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRtopStarCompanyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表.
     *
     * @param ListRtopStarCompanyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListRtopStarCompanyResponse
     */
    public function listRtopStarCompanyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRtopStarCompanyResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.star.company.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas).
     *
     * @param QueryRpSecurityPolicyRequest $request
     *
     * @return QueryRpSecurityPolicyResponse
     */
    public function queryRpSecurityPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRpSecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas).
     *
     * @param QueryRpSecurityPolicyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRpSecurityPolicyResponse
     */
    public function queryRpSecurityPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRpSecurityPolicyResponse::fromMap($this->doRequest('1.0', 'riskplus.rp.security.policy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风控快照查询
     * Summary: 风控事件快照查询.
     *
     * @param QuerySnapshotEventRequest $request
     *
     * @return QuerySnapshotEventResponse
     */
    public function querySnapshotEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySnapshotEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 风控快照查询
     * Summary: 风控事件快照查询.
     *
     * @param QuerySnapshotEventRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QuerySnapshotEventResponse
     */
    public function querySnapshotEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySnapshotEventResponse::fromMap($this->doRequest('1.0', 'riskplus.snapshot.event.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾批量参数文件上传接口
     * Summary: 营销盾参数文件上传.
     *
     * @param UploadUmktParamsFileRequest $request
     *
     * @return UploadUmktParamsFileResponse
     */
    public function uploadUmktParamsFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadUmktParamsFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾批量参数文件上传接口
     * Summary: 营销盾参数文件上传.
     *
     * @param UploadUmktParamsFileRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UploadUmktParamsFileResponse
     */
    public function uploadUmktParamsFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.umkt.params.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadUmktParamsFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return UploadUmktParamsFileResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.params.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUpload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntcloudGatewayxFileUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUploadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntcloudGatewayxFileUploadResponse::fromMap($this->doRequest('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
