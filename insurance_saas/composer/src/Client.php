<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\INSURANCE_SAAS\Models\ApplyClaimRequest;
use AntChain\INSURANCE_SAAS\Models\ApplyClaimResponse;
use AntChain\INSURANCE_SAAS\Models\ApplyEndorsementStrategyRequest;
use AntChain\INSURANCE_SAAS\Models\ApplyEndorsementStrategyResponse;
use AntChain\INSURANCE_SAAS\Models\ApplyInsureRequest;
use AntChain\INSURANCE_SAAS\Models\ApplyInsureResponse;
use AntChain\INSURANCE_SAAS\Models\ApplyInsureTestRequest;
use AntChain\INSURANCE_SAAS\Models\ApplyInsureTestResponse;
use AntChain\INSURANCE_SAAS\Models\ApplyUnderwritingRequest;
use AntChain\INSURANCE_SAAS\Models\ApplyUnderwritingResponse;
use AntChain\INSURANCE_SAAS\Models\CallbackMarketingEventRequest;
use AntChain\INSURANCE_SAAS\Models\CallbackMarketingEventResponse;
use AntChain\INSURANCE_SAAS\Models\CallbackMarketingPolicycancelRequest;
use AntChain\INSURANCE_SAAS\Models\CallbackMarketingPolicycancelResponse;
use AntChain\INSURANCE_SAAS\Models\CancelClaimRequest;
use AntChain\INSURANCE_SAAS\Models\CancelClaimResponse;
use AntChain\INSURANCE_SAAS\Models\ConfirmClaimSettleRequest;
use AntChain\INSURANCE_SAAS\Models\ConfirmClaimSettleResponse;
use AntChain\INSURANCE_SAAS\Models\FinishClaimSettleRequest;
use AntChain\INSURANCE_SAAS\Models\FinishClaimSettleResponse;
use AntChain\INSURANCE_SAAS\Models\GetEmbedcardUrlRequest;
use AntChain\INSURANCE_SAAS\Models\GetEmbedcardUrlResponse;
use AntChain\INSURANCE_SAAS\Models\GetEmbedoemautoinsuranceUrlRequest;
use AntChain\INSURANCE_SAAS\Models\GetEmbedoemautoinsuranceUrlResponse;
use AntChain\INSURANCE_SAAS\Models\GetInterestUrlRequest;
use AntChain\INSURANCE_SAAS\Models\GetInterestUrlResponse;
use AntChain\INSURANCE_SAAS\Models\GetMarketingInsureurlRequest;
use AntChain\INSURANCE_SAAS\Models\GetMarketingInsureurlResponse;
use AntChain\INSURANCE_SAAS\Models\GetRightplatformUrlRequest;
use AntChain\INSURANCE_SAAS\Models\GetRightplatformUrlResponse;
use AntChain\INSURANCE_SAAS\Models\IssueEmbedcardPaysucRequest;
use AntChain\INSURANCE_SAAS\Models\IssueEmbedcardPaysucResponse;
use AntChain\INSURANCE_SAAS\Models\NotifyInterestScenesubjectRequest;
use AntChain\INSURANCE_SAAS\Models\NotifyInterestScenesubjectResponse;
use AntChain\INSURANCE_SAAS\Models\NotifyInterestSupplierorderRequest;
use AntChain\INSURANCE_SAAS\Models\NotifyInterestSupplierorderResponse;
use AntChain\INSURANCE_SAAS\Models\NotifyInterestSupplierpolicyRequest;
use AntChain\INSURANCE_SAAS\Models\NotifyInterestSupplierpolicyResponse;
use AntChain\INSURANCE_SAAS\Models\NotifyPolicyResultRequest;
use AntChain\INSURANCE_SAAS\Models\NotifyPolicyResultResponse;
use AntChain\INSURANCE_SAAS\Models\QueryDataDisasterRequest;
use AntChain\INSURANCE_SAAS\Models\QueryDataDisasterResponse;
use AntChain\INSURANCE_SAAS\Models\QueryDataWeatherRequest;
use AntChain\INSURANCE_SAAS\Models\QueryDataWeatherResponse;
use AntChain\INSURANCE_SAAS\Models\QueryInquiryRequest;
use AntChain\INSURANCE_SAAS\Models\QueryInquiryResponse;
use AntChain\INSURANCE_SAAS\Models\QueryInsureResultRequest;
use AntChain\INSURANCE_SAAS\Models\QueryInsureResultResponse;
use AntChain\INSURANCE_SAAS\Models\QueryInterestSceneorderRequest;
use AntChain\INSURANCE_SAAS\Models\QueryInterestSceneorderResponse;
use AntChain\INSURANCE_SAAS\Models\QueryInterestSuppliersubjectRequest;
use AntChain\INSURANCE_SAAS\Models\QueryInterestSuppliersubjectResponse;
use AntChain\INSURANCE_SAAS\Models\QueryLeadMarketRequest;
use AntChain\INSURANCE_SAAS\Models\QueryLeadMarketResponse;
use AntChain\INSURANCE_SAAS\Models\QueryPolicyFileRequest;
use AntChain\INSURANCE_SAAS\Models\QueryPolicyFileResponse;
use AntChain\INSURANCE_SAAS\Models\QueryReverseCommissionRequest;
use AntChain\INSURANCE_SAAS\Models\QueryReverseCommissionResponse;
use AntChain\INSURANCE_SAAS\Models\QueryUnderwritingRequest;
use AntChain\INSURANCE_SAAS\Models\QueryUnderwritingResponse;
use AntChain\INSURANCE_SAAS\Models\ReceiveLeadMarketRequest;
use AntChain\INSURANCE_SAAS\Models\ReceiveLeadMarketResponse;
use AntChain\INSURANCE_SAAS\Models\SubmitInquiryRequest;
use AntChain\INSURANCE_SAAS\Models\SubmitInquiryResponse;
use AntChain\INSURANCE_SAAS\Models\SubmitInvestigateCaseRequest;
use AntChain\INSURANCE_SAAS\Models\SubmitInvestigateCaseResponse;
use AntChain\INSURANCE_SAAS\Models\SyncPolicyResultRequest;
use AntChain\INSURANCE_SAAS\Models\SyncPolicyResultResponse;
use AntChain\INSURANCE_SAAS\Models\SyncQuoteRequest;
use AntChain\INSURANCE_SAAS\Models\SyncQuoteResponse;
use AntChain\INSURANCE_SAAS\Models\UpdateClaimMaterialRequest;
use AntChain\INSURANCE_SAAS\Models\UpdateClaimMaterialResponse;
use AntChain\INSURANCE_SAAS\Models\UpdateRightplatformApplyinfoRequest;
use AntChain\INSURANCE_SAAS\Models\UpdateRightplatformApplyinfoResponse;
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
            'timeouted'          => 'retry',
            'readTimeout'        => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            'connectTimeout'     => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            'httpProxy'          => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            'httpsProxy'         => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            'noProxy'            => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            'maxIdleConns'       => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            'maxIdleTimeMillis'  => $this->_maxIdleTimeMillis,
            'keepAliveDuration'  => $this->_keepAliveDurationMillis,
            'maxRequests'        => $this->_maxRequests,
            'maxRequestsPerHost' => $this->_maxRequestsPerHost,
            'retry'              => [
                'retryable'   => $runtime->autoretry,
                'maxAttempts' => Utils::defaultNumber($runtime->maxAttempts, 3),
            ],
            'backoff' => [
                'policy' => Utils::defaultString($runtime->backoffPolicy, 'no'),
                'period' => Utils::defaultNumber($runtime->backoffPeriod, 1),
            ],
            'ignoreSSL' => $runtime->ignoreSSL,
            // 文件结构
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
                    'sdk_version'      => '1.11.3',
                    '_prod_code'       => 'INSURANCE_SAAS',
                    '_prod_channel'    => 'undefined',
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
     * Description: 保险询报价结果查询
     * Summary: 保险询报价结果查询.
     *
     * @param QueryInquiryRequest $request
     *
     * @return QueryInquiryResponse
     */
    public function queryInquiry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInquiryEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险询报价结果查询
     * Summary: 保险询报价结果查询.
     *
     * @param QueryInquiryRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryInquiryResponse
     */
    public function queryInquiryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInquiryResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.inquiry.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险产品询价
     * Summary: 保险产品询价.
     *
     * @param SubmitInquiryRequest $request
     *
     * @return SubmitInquiryResponse
     */
    public function submitInquiry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInquiryEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险产品询价
     * Summary: 保险产品询价.
     *
     * @param SubmitInquiryRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return SubmitInquiryResponse
     */
    public function submitInquiryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInquiryResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.inquiry.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 历史灾害查询
     * Summary: 历史灾害数据查询.
     *
     * @param QueryDataDisasterRequest $request
     *
     * @return QueryDataDisasterResponse
     */
    public function queryDataDisaster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDataDisasterEx($request, $headers, $runtime);
    }

    /**
     * Description: 历史灾害查询
     * Summary: 历史灾害数据查询.
     *
     * @param QueryDataDisasterRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryDataDisasterResponse
     */
    public function queryDataDisasterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDataDisasterResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.data.disaster.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 实时天气预警
     * Summary: 实时天气预警.
     *
     * @param QueryDataWeatherRequest $request
     *
     * @return QueryDataWeatherResponse
     */
    public function queryDataWeather($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDataWeatherEx($request, $headers, $runtime);
    }

    /**
     * Description: 实时天气预警
     * Summary: 实时天气预警.
     *
     * @param QueryDataWeatherRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDataWeatherResponse
     */
    public function queryDataWeatherEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDataWeatherResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.data.weather.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 报价接口同步接口
     * Summary: 报价接口同步接口.
     *
     * @param SyncQuoteRequest $request
     *
     * @return SyncQuoteResponse
     */
    public function syncQuote($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncQuoteEx($request, $headers, $runtime);
    }

    /**
     * Description: 报价接口同步接口
     * Summary: 报价接口同步接口.
     *
     * @param SyncQuoteRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return SyncQuoteResponse
     */
    public function syncQuoteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncQuoteResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.quote.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 承保自核申请接口
     * Summary: 承保自核申请接口.
     *
     * @param ApplyUnderwritingRequest $request
     *
     * @return ApplyUnderwritingResponse
     */
    public function applyUnderwriting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyUnderwritingEx($request, $headers, $runtime);
    }

    /**
     * Description: 承保自核申请接口
     * Summary: 承保自核申请接口.
     *
     * @param ApplyUnderwritingRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ApplyUnderwritingResponse
     */
    public function applyUnderwritingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyUnderwritingResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.underwriting.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 承保自核结果查询接口
     * Summary: 承保自核结果查询接口.
     *
     * @param QueryUnderwritingRequest $request
     *
     * @return QueryUnderwritingResponse
     */
    public function queryUnderwriting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnderwritingEx($request, $headers, $runtime);
    }

    /**
     * Description: 承保自核结果查询接口
     * Summary: 承保自核结果查询接口.
     *
     * @param QueryUnderwritingRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryUnderwritingResponse
     */
    public function queryUnderwritingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnderwritingResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.underwriting.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
     * Summary: 保险科技保单附件查询接口.
     *
     * @param QueryPolicyFileRequest $request
     *
     * @return QueryPolicyFileResponse
     */
    public function queryPolicyFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPolicyFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
     * Summary: 保险科技保单附件查询接口.
     *
     * @param QueryPolicyFileRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryPolicyFileResponse
     */
    public function queryPolicyFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPolicyFileResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.policy.file.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险SaaS投保申请接口
     * Summary: 投保申请接口.
     *
     * @param ApplyInsureRequest $request
     *
     * @return ApplyInsureResponse
     */
    public function applyInsure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsureEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险SaaS投保申请接口
     * Summary: 投保申请接口.
     *
     * @param ApplyInsureRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ApplyInsureResponse
     */
    public function applyInsureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsureResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.insure.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
     * Summary: 保单结果同步（依赖投保申请）.
     *
     * @param NotifyPolicyResultRequest $request
     *
     * @return NotifyPolicyResultResponse
     */
    public function notifyPolicyResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyPolicyResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
     * Summary: 保单结果同步（依赖投保申请）.
     *
     * @param NotifyPolicyResultRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return NotifyPolicyResultResponse
     */
    public function notifyPolicyResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyPolicyResultResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.policy.result.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 报案接口
     * Summary: 保险科技 报案接口.
     *
     * @param ApplyClaimRequest $request
     *
     * @return ApplyClaimResponse
     */
    public function applyClaim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyClaimEx($request, $headers, $runtime);
    }

    /**
     * Description: 报案接口
     * Summary: 保险科技 报案接口.
     *
     * @param ApplyClaimRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ApplyClaimResponse
     */
    public function applyClaimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyClaimResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.claim.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 报案撤销（场景端）
     * Summary: 报案撤销（场景端）.
     *
     * @param CancelClaimRequest $request
     *
     * @return CancelClaimResponse
     */
    public function cancelClaim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelClaimEx($request, $headers, $runtime);
    }

    /**
     * Description: 报案撤销（场景端）
     * Summary: 报案撤销（场景端）.
     *
     * @param CancelClaimRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CancelClaimResponse
     */
    public function cancelClaimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelClaimResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.claim.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 报案材料更新（场景端）
     * Summary: 报案材料更新（场景端）.
     *
     * @param UpdateClaimMaterialRequest $request
     *
     * @return UpdateClaimMaterialResponse
     */
    public function updateClaimMaterial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateClaimMaterialEx($request, $headers, $runtime);
    }

    /**
     * Description: 报案材料更新（场景端）
     * Summary: 报案材料更新（场景端）.
     *
     * @param UpdateClaimMaterialRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateClaimMaterialResponse
     */
    public function updateClaimMaterialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateClaimMaterialResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.claim.material.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 理赔结果确认（场景端）
     * Summary: 理赔结果确认（场景端）.
     *
     * @param ConfirmClaimSettleRequest $request
     *
     * @return ConfirmClaimSettleResponse
     */
    public function confirmClaimSettle($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmClaimSettleEx($request, $headers, $runtime);
    }

    /**
     * Description: 理赔结果确认（场景端）
     * Summary: 理赔结果确认（场景端）.
     *
     * @param ConfirmClaimSettleRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ConfirmClaimSettleResponse
     */
    public function confirmClaimSettleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmClaimSettleResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.claim.settle.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 理赔结案通知（保司端）
     * Summary: 理赔结案通知（保司端）.
     *
     * @param FinishClaimSettleRequest $request
     *
     * @return FinishClaimSettleResponse
     */
    public function finishClaimSettle($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishClaimSettleEx($request, $headers, $runtime);
    }

    /**
     * Description: 理赔结案通知（保司端）
     * Summary: 理赔结案通知（保司端）.
     *
     * @param FinishClaimSettleRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return FinishClaimSettleResponse
     */
    public function finishClaimSettleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishClaimSettleResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.claim.settle.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险批改自核接口
     * Summary: 保险批改自核接口.
     *
     * @param ApplyEndorsementStrategyRequest $request
     *
     * @return ApplyEndorsementStrategyResponse
     */
    public function applyEndorsementStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyEndorsementStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险批改自核接口
     * Summary: 保险批改自核接口.
     *
     * @param ApplyEndorsementStrategyRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ApplyEndorsementStrategyResponse
     */
    public function applyEndorsementStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyEndorsementStrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.endorsement.strategy.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保单信息离线同步
     * Summary: 保单信息离线同步.
     *
     * @param SyncPolicyResultRequest $request
     *
     * @return SyncPolicyResultResponse
     */
    public function syncPolicyResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncPolicyResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 保单信息离线同步
     * Summary: 保单信息离线同步.
     *
     * @param SyncPolicyResultRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SyncPolicyResultResponse
     */
    public function syncPolicyResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncPolicyResultResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.policy.result.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于通知单号查询保险投保结果
     * Summary: 保险投保结果查询.
     *
     * @param QueryInsureResultRequest $request
     *
     * @return QueryInsureResultResponse
     */
    public function queryInsureResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInsureResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于通知单号查询保险投保结果
     * Summary: 保险投保结果查询.
     *
     * @param QueryInsureResultRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryInsureResultResponse
     */
    public function queryInsureResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInsureResultResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.insure.result.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 投保测试接口
     * Summary: 投保测试接口.
     *
     * @param ApplyInsureTestRequest $request
     *
     * @return ApplyInsureTestResponse
     */
    public function applyInsureTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsureTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 投保测试接口
     * Summary: 投保测试接口.
     *
     * @param ApplyInsureTestRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ApplyInsureTestResponse
     */
    public function applyInsureTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsureTestResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.insure.test.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 本接口用于调查报案数据的提交
     * Summary: 调查报案提交接口.
     *
     * @param SubmitInvestigateCaseRequest $request
     *
     * @return SubmitInvestigateCaseResponse
     */
    public function submitInvestigateCase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInvestigateCaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 本接口用于调查报案数据的提交
     * Summary: 调查报案提交接口.
     *
     * @param SubmitInvestigateCaseRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SubmitInvestigateCaseResponse
     */
    public function submitInvestigateCaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInvestigateCaseResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.investigate.case.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 回销结果查询接口
     * Summary: 回销结果查询接口.
     *
     * @param QueryReverseCommissionRequest $request
     *
     * @return QueryReverseCommissionResponse
     */
    public function queryReverseCommission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryReverseCommissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 回销结果查询接口
     * Summary: 回销结果查询接口.
     *
     * @param QueryReverseCommissionRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryReverseCommissionResponse
     */
    public function queryReverseCommissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryReverseCommissionResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.reverse.commission.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 嵌入式保险服务卡片url链接获取
     * Summary: 嵌入式保险服务卡片url链接获取.
     *
     * @param GetEmbedcardUrlRequest $request
     *
     * @return GetEmbedcardUrlResponse
     */
    public function getEmbedcardUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getEmbedcardUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 嵌入式保险服务卡片url链接获取
     * Summary: 嵌入式保险服务卡片url链接获取.
     *
     * @param GetEmbedcardUrlRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetEmbedcardUrlResponse
     */
    public function getEmbedcardUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetEmbedcardUrlResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.embedcard.url.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 嵌入式保险服务打款成功出单接口
     * Summary: 嵌入式保险服务打款成功出单接口.
     *
     * @param IssueEmbedcardPaysucRequest $request
     *
     * @return IssueEmbedcardPaysucResponse
     */
    public function issueEmbedcardPaysuc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->issueEmbedcardPaysucEx($request, $headers, $runtime);
    }

    /**
     * Description: 嵌入式保险服务打款成功出单接口
     * Summary: 嵌入式保险服务打款成功出单接口.
     *
     * @param IssueEmbedcardPaysucRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return IssueEmbedcardPaysucResponse
     */
    public function issueEmbedcardPaysucEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return IssueEmbedcardPaysucResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.embedcard.paysuc.issue', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 嵌入式主机厂车险url链接获取
     * Summary: 嵌入式主机厂车险url链接获取.
     *
     * @param GetEmbedoemautoinsuranceUrlRequest $request
     *
     * @return GetEmbedoemautoinsuranceUrlResponse
     */
    public function getEmbedoemautoinsuranceUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getEmbedoemautoinsuranceUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 嵌入式主机厂车险url链接获取
     * Summary: 嵌入式主机厂车险url链接获取.
     *
     * @param GetEmbedoemautoinsuranceUrlRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetEmbedoemautoinsuranceUrlResponse
     */
    public function getEmbedoemautoinsuranceUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetEmbedoemautoinsuranceUrlResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.embedoemautoinsurance.url.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 场景方获取权益链接
     * Summary: 场景方获取权益链接.
     *
     * @param GetRightplatformUrlRequest $request
     *
     * @return GetRightplatformUrlResponse
     */
    public function getRightplatformUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRightplatformUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 场景方获取权益链接
     * Summary: 场景方获取权益链接.
     *
     * @param GetRightplatformUrlRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetRightplatformUrlResponse
     */
    public function getRightplatformUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRightplatformUrlResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.rightplatform.url.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新申请额度状态&投保人信息
     * Summary: 更新申请额度状态&投保人信息.
     *
     * @param UpdateRightplatformApplyinfoRequest $request
     *
     * @return UpdateRightplatformApplyinfoResponse
     */
    public function updateRightplatformApplyinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRightplatformApplyinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新申请额度状态&投保人信息
     * Summary: 更新申请额度状态&投保人信息.
     *
     * @param UpdateRightplatformApplyinfoRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateRightplatformApplyinfoResponse
     */
    public function updateRightplatformApplyinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRightplatformApplyinfoResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.rightplatform.applyinfo.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 场景方标的信息通知
     * Summary: 场景方标的信息通知.
     *
     * @param NotifyInterestScenesubjectRequest $request
     *
     * @return NotifyInterestScenesubjectResponse
     */
    public function notifyInterestScenesubject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyInterestScenesubjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 场景方标的信息通知
     * Summary: 场景方标的信息通知.
     *
     * @param NotifyInterestScenesubjectRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return NotifyInterestScenesubjectResponse
     */
    public function notifyInterestScenesubjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyInterestScenesubjectResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.interest.scenesubject.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 权益服务商标的信息查询
     * Summary: 权益服务商标的信息查询.
     *
     * @param QueryInterestSuppliersubjectRequest $request
     *
     * @return QueryInterestSuppliersubjectResponse
     */
    public function queryInterestSuppliersubject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInterestSuppliersubjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 权益服务商标的信息查询
     * Summary: 权益服务商标的信息查询.
     *
     * @param QueryInterestSuppliersubjectRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryInterestSuppliersubjectResponse
     */
    public function queryInterestSuppliersubjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInterestSuppliersubjectResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.interest.suppliersubject.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 权益服务商投保后通知保单信息
     * Summary: 权益服务商投保后通知保单信息.
     *
     * @param NotifyInterestSupplierpolicyRequest $request
     *
     * @return NotifyInterestSupplierpolicyResponse
     */
    public function notifyInterestSupplierpolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyInterestSupplierpolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 权益服务商投保后通知保单信息
     * Summary: 权益服务商投保后通知保单信息.
     *
     * @param NotifyInterestSupplierpolicyRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return NotifyInterestSupplierpolicyResponse
     */
    public function notifyInterestSupplierpolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyInterestSupplierpolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.interest.supplierpolicy.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 场景方获取权益链接
     * Summary: 场景方获取权益链接.
     *
     * @param GetInterestUrlRequest $request
     *
     * @return GetInterestUrlResponse
     */
    public function getInterestUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInterestUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 场景方获取权益链接
     * Summary: 场景方获取权益链接.
     *
     * @param GetInterestUrlRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetInterestUrlResponse
     */
    public function getInterestUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInterestUrlResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.interest.url.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 场景方订单信息查询
     * Summary: 场景方订单信息查询.
     *
     * @param QueryInterestSceneorderRequest $request
     *
     * @return QueryInterestSceneorderResponse
     */
    public function queryInterestSceneorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInterestSceneorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 场景方订单信息查询
     * Summary: 场景方订单信息查询.
     *
     * @param QueryInterestSceneorderRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryInterestSceneorderResponse
     */
    public function queryInterestSceneorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInterestSceneorderResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.interest.sceneorder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 权益服务商订单状态通知
     * Summary: 权益服务商订单状态通知.
     *
     * @param NotifyInterestSupplierorderRequest $request
     *
     * @return NotifyInterestSupplierorderResponse
     */
    public function notifyInterestSupplierorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyInterestSupplierorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 权益服务商订单状态通知
     * Summary: 权益服务商订单状态通知.
     *
     * @param NotifyInterestSupplierorderRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return NotifyInterestSupplierorderResponse
     */
    public function notifyInterestSupplierorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyInterestSupplierorderResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.interest.supplierorder.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 车险线索营销结果接收
     * Summary: 车险线索营销结果接收.
     *
     * @param ReceiveLeadMarketRequest $request
     *
     * @return ReceiveLeadMarketResponse
     */
    public function receiveLeadMarket($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->receiveLeadMarketEx($request, $headers, $runtime);
    }

    /**
     * Description: 车险线索营销结果接收
     * Summary: 车险线索营销结果接收.
     *
     * @param ReceiveLeadMarketRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ReceiveLeadMarketResponse
     */
    public function receiveLeadMarketEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReceiveLeadMarketResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.lead.market.receive', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销投保短链获取
     * Summary: 营销投保短链获取.
     *
     * @param GetMarketingInsureurlRequest $request
     *
     * @return GetMarketingInsureurlResponse
     */
    public function getMarketingInsureurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMarketingInsureurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销投保短链获取
     * Summary: 营销投保短链获取.
     *
     * @param GetMarketingInsureurlRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetMarketingInsureurlResponse
     */
    public function getMarketingInsureurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMarketingInsureurlResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.marketing.insureurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销保单出单信息事件回传
     * Summary: 营销保单出单信息事件回传.
     *
     * @param CallbackMarketingEventRequest $request
     *
     * @return CallbackMarketingEventResponse
     */
    public function callbackMarketingEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackMarketingEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销保单出单信息事件回传
     * Summary: 营销保单出单信息事件回传.
     *
     * @param CallbackMarketingEventRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CallbackMarketingEventResponse
     */
    public function callbackMarketingEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackMarketingEventResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.marketing.event.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销退保信息回传
     * Summary: 营销退保事件回传.
     *
     * @param CallbackMarketingPolicycancelRequest $request
     *
     * @return CallbackMarketingPolicycancelResponse
     */
    public function callbackMarketingPolicycancel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackMarketingPolicycancelEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销退保信息回传
     * Summary: 营销退保事件回传.
     *
     * @param CallbackMarketingPolicycancelRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CallbackMarketingPolicycancelResponse
     */
    public function callbackMarketingPolicycancelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackMarketingPolicycancelResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.marketing.policycancel.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 车险线索查询
     * Summary: 车险线索查询.
     *
     * @param QueryLeadMarketRequest $request
     *
     * @return QueryLeadMarketResponse
     */
    public function queryLeadMarket($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeadMarketEx($request, $headers, $runtime);
    }

    /**
     * Description: 车险线索查询
     * Summary: 车险线索查询.
     *
     * @param QueryLeadMarketRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryLeadMarketResponse
     */
    public function queryLeadMarketEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeadMarketResponse::fromMap($this->doRequest('1.0', 'antcloud.insurance.lead.market.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
