<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BCCR\Models\AddContentRequest;
use AntChain\BCCR\Models\AddContentResponse;
use AntChain\BCCR\Models\AddDciUsernocertRequest;
use AntChain\BCCR\Models\AddDciUsernocertResponse;
use AntChain\BCCR\Models\AddDciUserRequest;
use AntChain\BCCR\Models\AddDciUserResponse;
use AntChain\BCCR\Models\AddHashregisterRequest;
use AntChain\BCCR\Models\AddHashregisterResponse;
use AntChain\BCCR\Models\AddRegisterRequest;
use AntChain\BCCR\Models\AddRegisterResponse;
use AntChain\BCCR\Models\ApplyDciPromotionRequest;
use AntChain\BCCR\Models\ApplyDciPromotionResponse;
use AntChain\BCCR\Models\ApplyNotaryOrderRequest;
use AntChain\BCCR\Models\ApplyNotaryOrderResponse;
use AntChain\BCCR\Models\CallbackDciPayresultRequest;
use AntChain\BCCR\Models\CallbackDciPayresultResponse;
use AntChain\BCCR\Models\CancelTradeUsageRequest;
use AntChain\BCCR\Models\CancelTradeUsageResponse;
use AntChain\BCCR\Models\CloseDciRegistrationRequest;
use AntChain\BCCR\Models\CloseDciRegistrationResponse;
use AntChain\BCCR\Models\CreateCertificateRequest;
use AntChain\BCCR\Models\CreateCertificateResponse;
use AntChain\BCCR\Models\CreateDciPreregistrationRequest;
use AntChain\BCCR\Models\CreateDciPreregistrationResponse;
use AntChain\BCCR\Models\CreateDciRegistrationcertRequest;
use AntChain\BCCR\Models\CreateDciRegistrationcertResponse;
use AntChain\BCCR\Models\CreateDciRegistrationRequest;
use AntChain\BCCR\Models\CreateDciRegistrationResponse;
use AntChain\BCCR\Models\CreateDirectmonitorTaskRequest;
use AntChain\BCCR\Models\CreateDirectmonitorTaskResponse;
use AntChain\BCCR\Models\CreateEvidenceLiveRequest;
use AntChain\BCCR\Models\CreateEvidenceLiveResponse;
use AntChain\BCCR\Models\CreateEvidenceRecordscreenRequest;
use AntChain\BCCR\Models\CreateEvidenceRecordscreenResponse;
use AntChain\BCCR\Models\CreateEvidenceRegisterRequest;
use AntChain\BCCR\Models\CreateEvidenceRegisterResponse;
use AntChain\BCCR\Models\CreateEvidenceScreenshotRequest;
use AntChain\BCCR\Models\CreateEvidenceScreenshotResponse;
use AntChain\BCCR\Models\CreateEvidenceUserRequest;
use AntChain\BCCR\Models\CreateEvidenceUserResponse;
use AntChain\BCCR\Models\CreateEvidenceVodRequest;
use AntChain\BCCR\Models\CreateEvidenceVodResponse;
use AntChain\BCCR\Models\CreateMonitorTaskRequest;
use AntChain\BCCR\Models\CreateMonitorTaskResponse;
use AntChain\BCCR\Models\CreateOrderRequest;
use AntChain\BCCR\Models\CreateOrderResponse;
use AntChain\BCCR\Models\CreateRecodescreenRequest;
use AntChain\BCCR\Models\CreateRecodescreenResponse;
use AntChain\BCCR\Models\CreateRecordscreenRequest;
use AntChain\BCCR\Models\CreateRecordscreenResponse;
use AntChain\BCCR\Models\CreateScreenshotRequest;
use AntChain\BCCR\Models\CreateScreenshotResponse;
use AntChain\BCCR\Models\ExecTradeCoverRequest;
use AntChain\BCCR\Models\ExecTradeCoverResponse;
use AntChain\BCCR\Models\GetCertificateRequest;
use AntChain\BCCR\Models\GetCertificateResponse;
use AntChain\BCCR\Models\GetDciPayurlRequest;
use AntChain\BCCR\Models\GetDciPayurlResponse;
use AntChain\BCCR\Models\GetDciRegistrationcertRequest;
use AntChain\BCCR\Models\GetDciRegistrationcertResponse;
use AntChain\BCCR\Models\GetEvidenceInfoRequest;
use AntChain\BCCR\Models\GetEvidenceInfoResponse;
use AntChain\BCCR\Models\GetTradeUsageRequest;
use AntChain\BCCR\Models\GetTradeUsageResponse;
use AntChain\BCCR\Models\GetUploadurlRequest;
use AntChain\BCCR\Models\GetUploadurlResponse;
use AntChain\BCCR\Models\ListMonitorProviderRequest;
use AntChain\BCCR\Models\ListMonitorProviderResponse;
use AntChain\BCCR\Models\ListNotaryRequest;
use AntChain\BCCR\Models\ListNotaryResponse;
use AntChain\BCCR\Models\OperateNotaryOrderRequest;
use AntChain\BCCR\Models\OperateNotaryOrderResponse;
use AntChain\BCCR\Models\PublishGoodRequest;
use AntChain\BCCR\Models\PublishGoodResponse;
use AntChain\BCCR\Models\QueryContentBatchstatisticsRequest;
use AntChain\BCCR\Models\QueryContentBatchstatisticsResponse;
use AntChain\BCCR\Models\QueryContentStatisticsRequest;
use AntChain\BCCR\Models\QueryContentStatisticsResponse;
use AntChain\BCCR\Models\QueryContentStatusRequest;
use AntChain\BCCR\Models\QueryContentStatusResponse;
use AntChain\BCCR\Models\QueryDciContentsecurityRequest;
use AntChain\BCCR\Models\QueryDciContentsecurityResponse;
use AntChain\BCCR\Models\QueryDciFeedbackRequest;
use AntChain\BCCR\Models\QueryDciFeedbackResponse;
use AntChain\BCCR\Models\QueryDciPayRequest;
use AntChain\BCCR\Models\QueryDciPayResponse;
use AntChain\BCCR\Models\QueryDciPreregistrationRequest;
use AntChain\BCCR\Models\QueryDciPreregistrationResponse;
use AntChain\BCCR\Models\QueryDciPreregpublicationRequest;
use AntChain\BCCR\Models\QueryDciPreregpublicationResponse;
use AntChain\BCCR\Models\QueryDciPreviewRequest;
use AntChain\BCCR\Models\QueryDciPreviewResponse;
use AntChain\BCCR\Models\QueryDciRegistrationcertRequest;
use AntChain\BCCR\Models\QueryDciRegistrationcertResponse;
use AntChain\BCCR\Models\QueryDciRegistrationRequest;
use AntChain\BCCR\Models\QueryDciRegistrationResponse;
use AntChain\BCCR\Models\QueryDciRegistrationsubmitRequest;
use AntChain\BCCR\Models\QueryDciRegistrationsubmitResponse;
use AntChain\BCCR\Models\QueryDciSimilarfileRequest;
use AntChain\BCCR\Models\QueryDciSimilarfileResponse;
use AntChain\BCCR\Models\QueryDciUserbyphoneRequest;
use AntChain\BCCR\Models\QueryDciUserbyphoneResponse;
use AntChain\BCCR\Models\QueryDciUserRequest;
use AntChain\BCCR\Models\QueryDciUserResponse;
use AntChain\BCCR\Models\QueryDirectmonitorResultRequest;
use AntChain\BCCR\Models\QueryDirectmonitorResultResponse;
use AntChain\BCCR\Models\QueryGoodsPublishRequest;
use AntChain\BCCR\Models\QueryGoodsPublishResponse;
use AntChain\BCCR\Models\QueryGoodsRequest;
use AntChain\BCCR\Models\QueryGoodsResponse;
use AntChain\BCCR\Models\QueryMonitorResultRequest;
use AntChain\BCCR\Models\QueryMonitorResultResponse;
use AntChain\BCCR\Models\QueryMonitorTaskRequest;
use AntChain\BCCR\Models\QueryMonitorTaskResponse;
use AntChain\BCCR\Models\QueryNotaryBidreasonRequest;
use AntChain\BCCR\Models\QueryNotaryBidreasonResponse;
use AntChain\BCCR\Models\QueryNotaryDocumenttosignRequest;
use AntChain\BCCR\Models\QueryNotaryDocumenttosignResponse;
use AntChain\BCCR\Models\QueryNotaryFeedetailRequest;
use AntChain\BCCR\Models\QueryNotaryFeedetailResponse;
use AntChain\BCCR\Models\QueryNotaryOrderRequest;
use AntChain\BCCR\Models\QueryNotaryOrderResponse;
use AntChain\BCCR\Models\QueryNotaryPayurlRequest;
use AntChain\BCCR\Models\QueryNotaryPayurlResponse;
use AntChain\BCCR\Models\QueryOrderPayurlRequest;
use AntChain\BCCR\Models\QueryOrderPayurlResponse;
use AntChain\BCCR\Models\QueryRecodescreenRequest;
use AntChain\BCCR\Models\QueryRecodescreenResponse;
use AntChain\BCCR\Models\QueryRecordscreenRequest;
use AntChain\BCCR\Models\QueryRecordscreenResponse;
use AntChain\BCCR\Models\QueryRegisterstatusRequest;
use AntChain\BCCR\Models\QueryRegisterstatusResponse;
use AntChain\BCCR\Models\QueryScreenshotRequest;
use AntChain\BCCR\Models\QueryScreenshotResponse;
use AntChain\BCCR\Models\QueryTradeSaleRequest;
use AntChain\BCCR\Models\QueryTradeSaleResponse;
use AntChain\BCCR\Models\QueryUserListRequest;
use AntChain\BCCR\Models\QueryUserListResponse;
use AntChain\BCCR\Models\QueryUserRequest;
use AntChain\BCCR\Models\QueryUserResponse;
use AntChain\BCCR\Models\RefuseDciRegistrationRequest;
use AntChain\BCCR\Models\RefuseDciRegistrationResponse;
use AntChain\BCCR\Models\RegisterTradeUsageRequest;
use AntChain\BCCR\Models\RegisterTradeUsageResponse;
use AntChain\BCCR\Models\ReplaceDciRequest;
use AntChain\BCCR\Models\ReplaceDciResponse;
use AntChain\BCCR\Models\RetryDciPreregistrationRequest;
use AntChain\BCCR\Models\RetryDciPreregistrationResponse;
use AntChain\BCCR\Models\RetryDciRegistrationRequest;
use AntChain\BCCR\Models\RetryDciRegistrationResponse;
use AntChain\BCCR\Models\StopMonitorTaskRequest;
use AntChain\BCCR\Models\StopMonitorTaskResponse;
use AntChain\BCCR\Models\SubmitDciFeedbackRequest;
use AntChain\BCCR\Models\SubmitDciFeedbackResponse;
use AntChain\BCCR\Models\UpdateDciUserRequest;
use AntChain\BCCR\Models\UpdateDciUserResponse;
use AntChain\BCCR\Models\UpdateGoodsRequest;
use AntChain\BCCR\Models\UpdateGoodsResponse;
use AntChain\BCCR\Models\UploadNotaryAttachmentRequest;
use AntChain\BCCR\Models\UploadNotaryAttachmentResponse;
use AntChain\BCCR\Models\VerifyBlockchainRequest;
use AntChain\BCCR\Models\VerifyBlockchainResponse;
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
            // 相似位置信息
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
                    'sdk_version'      => '1.19.2',
                    '_prod_code'       => 'BCCR',
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
     * Description: 调用接口获取版权开放平台授权访问oss链接
     * Summary: 获取授权访问oss链接.
     *
     * @param GetUploadurlRequest $request
     *
     * @return GetUploadurlResponse
     */
    public function getUploadurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getUploadurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用接口获取版权开放平台授权访问oss链接
     * Summary: 获取授权访问oss链接.
     *
     * @param GetUploadurlRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetUploadurlResponse
     */
    public function getUploadurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetUploadurlResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.uploadurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权开发平台hash登记
     * Summary: 新增HASH版权登记.
     *
     * @param AddHashregisterRequest $request
     *
     * @return AddHashregisterResponse
     */
    public function addHashregister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addHashregisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权开发平台hash登记
     * Summary: 新增HASH版权登记.
     *
     * @param AddHashregisterRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddHashregisterResponse
     */
    public function addHashregisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddHashregisterResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.hashregister.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权平台新增版权登记
     * Summary: 新增版权登记.
     *
     * @param AddRegisterRequest $request
     *
     * @return AddRegisterResponse
     */
    public function addRegister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addRegisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权平台新增版权登记
     * Summary: 新增版权登记.
     *
     * @param AddRegisterRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AddRegisterResponse
     */
    public function addRegisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddRegisterResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.register.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权平台查询版权登记状态
     * Summary: 查询版权登记状态
     *
     * @param QueryRegisterstatusRequest $request
     *
     * @return QueryRegisterstatusResponse
     */
    public function queryRegisterstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRegisterstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权平台查询版权登记状态
     * Summary: 查询版权登记状态
     *
     * @param QueryRegisterstatusRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryRegisterstatusResponse
     */
    public function queryRegisterstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRegisterstatusResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.registerstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权平台生成版权登记证书
     * Summary: 生成版权登记证书.
     *
     * @param CreateCertificateRequest $request
     *
     * @return CreateCertificateResponse
     */
    public function createCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权平台生成版权登记证书
     * Summary: 生成版权登记证书.
     *
     * @param CreateCertificateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateCertificateResponse
     */
    public function createCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCertificateResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.certificate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权平台获取版权登记证书
     * Summary: 获取版权登记证书.
     *
     * @param GetCertificateRequest $request
     *
     * @return GetCertificateResponse
     */
    public function getCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权平台获取版权登记证书
     * Summary: 获取版权登记证书.
     *
     * @param GetCertificateRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetCertificateResponse
     */
    public function getCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCertificateResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.certificate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增版权监测任务
     * Summary: 新增版权监测.
     *
     * @param CreateMonitorTaskRequest $request
     *
     * @return CreateMonitorTaskResponse
     */
    public function createMonitorTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMonitorTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增版权监测任务
     * Summary: 新增版权监测.
     *
     * @param CreateMonitorTaskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateMonitorTaskResponse
     */
    public function createMonitorTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMonitorTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 停止版权监测任务
     * Summary: 停止版权监测.
     *
     * @param StopMonitorTaskRequest $request
     *
     * @return StopMonitorTaskResponse
     */
    public function stopMonitorTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopMonitorTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 停止版权监测任务
     * Summary: 停止版权监测.
     *
     * @param StopMonitorTaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return StopMonitorTaskResponse
     */
    public function stopMonitorTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopMonitorTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.task.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询版权监测任务
     * Summary: 查询版权监测.
     *
     * @param QueryMonitorTaskRequest $request
     *
     * @return QueryMonitorTaskResponse
     */
    public function queryMonitorTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMonitorTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询版权监测任务
     * Summary: 查询版权监测.
     *
     * @param QueryMonitorTaskRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryMonitorTaskResponse
     */
    public function queryMonitorTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMonitorTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询版权任务监测结果
     * Summary: 查询版权监测结果.
     *
     * @param QueryMonitorResultRequest $request
     *
     * @return QueryMonitorResultResponse
     */
    public function queryMonitorResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMonitorResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询版权任务监测结果
     * Summary: 查询版权监测结果.
     *
     * @param QueryMonitorResultRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryMonitorResultResponse
     */
    public function queryMonitorResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMonitorResultResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.result.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取传播监测能力服务商列表
     * Summary: 获取传播监测能力服务商列表.
     *
     * @param ListMonitorProviderRequest $request
     *
     * @return ListMonitorProviderResponse
     */
    public function listMonitorProvider($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listMonitorProviderEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取传播监测能力服务商列表
     * Summary: 获取传播监测能力服务商列表.
     *
     * @param ListMonitorProviderRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListMonitorProviderResponse
     */
    public function listMonitorProviderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListMonitorProviderResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.provider.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建录屏取证(废弃)
     * Summary: 创建录屏取证(废弃).
     *
     * @param CreateRecodescreenRequest $request
     *
     * @return CreateRecodescreenResponse
     */
    public function createRecodescreen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRecodescreenEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建录屏取证(废弃)
     * Summary: 创建录屏取证(废弃).
     *
     * @param CreateRecodescreenRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateRecodescreenResponse
     */
    public function createRecodescreenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRecodescreenResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.recodescreen.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询录屏取证(废弃)
     * Summary: 查询录屏取证(废弃).
     *
     * @param QueryRecodescreenRequest $request
     *
     * @return QueryRecodescreenResponse
     */
    public function queryRecodescreen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRecodescreenEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询录屏取证(废弃)
     * Summary: 查询录屏取证(废弃).
     *
     * @param QueryRecodescreenRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryRecodescreenResponse
     */
    public function queryRecodescreenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRecodescreenResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.recodescreen.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户信息查询
     * Summary: 用户信息查询.
     *
     * @param QueryUserRequest $request
     *
     * @return QueryUserResponse
     */
    public function queryUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户信息查询
     * Summary: 用户信息查询.
     *
     * @param QueryUserRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryUserResponse
     */
    public function queryUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表.
     *
     * @param QueryUserListRequest $request
     *
     * @return QueryUserListResponse
     */
    public function queryUserList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserListEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表.
     *
     * @param QueryUserListRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryUserListResponse
     */
    public function queryUserListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserListResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.user.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建网页取证
     * Summary: 创建网页取证
     *
     * @param CreateScreenshotRequest $request
     *
     * @return CreateScreenshotResponse
     */
    public function createScreenshot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createScreenshotEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建网页取证
     * Summary: 创建网页取证
     *
     * @param CreateScreenshotRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateScreenshotResponse
     */
    public function createScreenshotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateScreenshotResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.screenshot.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询网页取证
     * Summary: 查询网页取证
     *
     * @param QueryScreenshotRequest $request
     *
     * @return QueryScreenshotResponse
     */
    public function queryScreenshot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryScreenshotEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询网页取证
     * Summary: 查询网页取证
     *
     * @param QueryScreenshotRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryScreenshotResponse
     */
    public function queryScreenshotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryScreenshotResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.screenshot.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上核验
     * Summary: 链上核验.
     *
     * @param VerifyBlockchainRequest $request
     *
     * @return VerifyBlockchainResponse
     */
    public function verifyBlockchain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyBlockchainEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上核验
     * Summary: 链上核验.
     *
     * @param VerifyBlockchainRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return VerifyBlockchainResponse
     */
    public function verifyBlockchainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyBlockchainResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.blockchain.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建录屏取证
     * Summary: 创建录屏取证
     *
     * @param CreateRecordscreenRequest $request
     *
     * @return CreateRecordscreenResponse
     */
    public function createRecordscreen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRecordscreenEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建录屏取证
     * Summary: 创建录屏取证
     *
     * @param CreateRecordscreenRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateRecordscreenResponse
     */
    public function createRecordscreenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRecordscreenResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.recordscreen.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询录屏取证
     * Summary: 查询录屏取证
     *
     * @param QueryRecordscreenRequest $request
     *
     * @return QueryRecordscreenResponse
     */
    public function queryRecordscreen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRecordscreenEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询录屏取证
     * Summary: 查询录屏取证
     *
     * @param QueryRecordscreenRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryRecordscreenResponse
     */
    public function queryRecordscreenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRecordscreenResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.recordscreen.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取支持的公证处列表
     * Summary: 获取支持的公证处列表.
     *
     * @param ListNotaryRequest $request
     *
     * @return ListNotaryResponse
     */
    public function listNotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listNotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取支持的公证处列表
     * Summary: 获取支持的公证处列表.
     *
     * @param ListNotaryRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListNotaryResponse
     */
    public function listNotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListNotaryResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增版权定向监测任务
     * Summary: 新增版权定向监测.
     *
     * @param CreateDirectmonitorTaskRequest $request
     *
     * @return CreateDirectmonitorTaskResponse
     */
    public function createDirectmonitorTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDirectmonitorTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增版权定向监测任务
     * Summary: 新增版权定向监测.
     *
     * @param CreateDirectmonitorTaskRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateDirectmonitorTaskResponse
     */
    public function createDirectmonitorTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDirectmonitorTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.directmonitor.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询版权定向监测结果
     * Summary: 查询版权定向监测结果.
     *
     * @param QueryDirectmonitorResultRequest $request
     *
     * @return QueryDirectmonitorResultResponse
     */
    public function queryDirectmonitorResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDirectmonitorResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询版权定向监测结果
     * Summary: 查询版权定向监测结果.
     *
     * @param QueryDirectmonitorResultRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryDirectmonitorResultResponse
     */
    public function queryDirectmonitorResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDirectmonitorResultResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.directmonitor.result.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: DCI预登记
     * Summary: dci预登记.
     *
     * @param CreateDciPreregistrationRequest $request
     *
     * @return CreateDciPreregistrationResponse
     */
    public function createDciPreregistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDciPreregistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: DCI预登记
     * Summary: dci预登记.
     *
     * @param CreateDciPreregistrationRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateDciPreregistrationResponse
     */
    public function createDciPreregistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDciPreregistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.preregistration.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询dci预登记信息
     * Summary: 查询dci预登记信息.
     *
     * @param QueryDciPreregistrationRequest $request
     *
     * @return QueryDciPreregistrationResponse
     */
    public function queryDciPreregistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciPreregistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询dci预登记信息
     * Summary: 查询dci预登记信息.
     *
     * @param QueryDciPreregistrationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDciPreregistrationResponse
     */
    public function queryDciPreregistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciPreregistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.preregistration.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册dci账号
     * Summary: 注册dci账号.
     *
     * @param AddDciUserRequest $request
     *
     * @return AddDciUserResponse
     */
    public function addDciUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDciUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册dci账号
     * Summary: 注册dci账号.
     *
     * @param AddDciUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AddDciUserResponse
     */
    public function addDciUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDciUserResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.user.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dci预登记再确认
     * Summary: dci预登记再确认.
     *
     * @param RetryDciPreregistrationRequest $request
     *
     * @return RetryDciPreregistrationResponse
     */
    public function retryDciPreregistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryDciPreregistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: dci预登记再确认
     * Summary: dci预登记再确认.
     *
     * @param RetryDciPreregistrationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return RetryDciPreregistrationResponse
     */
    public function retryDciPreregistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryDciPreregistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.preregistration.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询dci账号信息
     * Summary: 查询dci账号信息.
     *
     * @param QueryDciUserRequest $request
     *
     * @return QueryDciUserResponse
     */
    public function queryDciUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询dci账号信息
     * Summary: 查询dci账号信息.
     *
     * @param QueryDciUserRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryDciUserResponse
     */
    public function queryDciUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciUserResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Dci预登记公示地址查询
     * Summary: Dci预登记公示地址查询.
     *
     * @param QueryDciPreregpublicationRequest $request
     *
     * @return QueryDciPreregpublicationResponse
     */
    public function queryDciPreregpublication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciPreregpublicationEx($request, $headers, $runtime);
    }

    /**
     * Description: Dci预登记公示地址查询
     * Summary: Dci预登记公示地址查询.
     *
     * @param QueryDciPreregpublicationRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryDciPreregpublicationResponse
     */
    public function queryDciPreregpublicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciPreregpublicationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.preregpublication.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新dci账号信息
     * Summary: 更新dci账号信息.
     *
     * @param UpdateDciUserRequest $request
     *
     * @return UpdateDciUserResponse
     */
    public function updateDciUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDciUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新dci账号信息
     * Summary: 更新dci账号信息.
     *
     * @param UpdateDciUserRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateDciUserResponse
     */
    public function updateDciUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDciUserResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.user.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起数登申请
     * Summary: 发起数登申请.
     *
     * @param CreateDciRegistrationRequest $request
     *
     * @return CreateDciRegistrationResponse
     */
    public function createDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起数登申请
     * Summary: 发起数登申请.
     *
     * @param CreateDciRegistrationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateDciRegistrationResponse
     */
    public function createDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口.
     *
     * @param QueryDciRegistrationsubmitRequest $request
     *
     * @return QueryDciRegistrationsubmitResponse
     */
    public function queryDciRegistrationsubmit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciRegistrationsubmitEx($request, $headers, $runtime);
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口.
     *
     * @param QueryDciRegistrationsubmitRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryDciRegistrationsubmitResponse
     */
    public function queryDciRegistrationsubmitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciRegistrationsubmitResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registrationsubmit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数登结果
     * Summary: 查询数登结果.
     *
     * @param QueryDciRegistrationRequest $request
     *
     * @return QueryDciRegistrationResponse
     */
    public function queryDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数登结果
     * Summary: 查询数登结果.
     *
     * @param QueryDciRegistrationRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryDciRegistrationResponse
     */
    public function queryDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接.
     *
     * @param GetDciRegistrationcertRequest $request
     *
     * @return GetDciRegistrationcertResponse
     */
    public function getDciRegistrationcert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDciRegistrationcertEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取数登证书下载链接
     * Summary: 获取数登证书下载链接.
     *
     * @param GetDciRegistrationcertRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetDciRegistrationcertResponse
     */
    public function getDciRegistrationcertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDciRegistrationcertResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registrationcert.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询内容安全审核详情
     * Summary: 查询内容安全审核详情.
     *
     * @param QueryDciContentsecurityRequest $request
     *
     * @return QueryDciContentsecurityResponse
     */
    public function queryDciContentsecurity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciContentsecurityEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询内容安全审核详情
     * Summary: 查询内容安全审核详情.
     *
     * @param QueryDciContentsecurityRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDciContentsecurityResponse
     */
    public function queryDciContentsecurityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciContentsecurityResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.contentsecurity.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数字登记证书
     * Summary: 创建数字登记证书.
     *
     * @param CreateDciRegistrationcertRequest $request
     *
     * @return CreateDciRegistrationcertResponse
     */
    public function createDciRegistrationcert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDciRegistrationcertEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数字登记证书
     * Summary: 创建数字登记证书.
     *
     * @param CreateDciRegistrationcertRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateDciRegistrationcertResponse
     */
    public function createDciRegistrationcertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDciRegistrationcertResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registrationcert.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口.
     *
     * @param QueryDciRegistrationcertRequest $request
     *
     * @return QueryDciRegistrationcertResponse
     */
    public function queryDciRegistrationcert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciRegistrationcertEx($request, $headers, $runtime);
    }

    /**
     * Description: 已废弃接口
     * Summary: 已废弃接口.
     *
     * @param QueryDciRegistrationcertRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryDciRegistrationcertResponse
     */
    public function queryDciRegistrationcertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciRegistrationcertResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registrationcert.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付.
     *
     * @param GetDciPayurlRequest $request
     *
     * @return GetDciPayurlResponse
     */
    public function getDciPayurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDciPayurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起支付，获取支付链接
     * Summary: 数登支付-发起支付.
     *
     * @param GetDciPayurlRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetDciPayurlResponse
     */
    public function getDciPayurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDciPayurlResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.payurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数登支付结果
     * Summary: 查询数登支付结果.
     *
     * @param QueryDciPayRequest $request
     *
     * @return QueryDciPayResponse
     */
    public function queryDciPay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciPayEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数登支付结果
     * Summary: 查询数登支付结果.
     *
     * @param QueryDciPayRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryDciPayResponse
     */
    public function queryDciPayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciPayResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.pay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付结果回调
     * Summary: 数登支付-支付结果回调.
     *
     * @param CallbackDciPayresultRequest $request
     *
     * @return CallbackDciPayresultResponse
     */
    public function callbackDciPayresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackDciPayresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付结果回调
     * Summary: 数登支付-支付结果回调.
     *
     * @param CallbackDciPayresultRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CallbackDciPayresultResponse
     */
    public function callbackDciPayresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackDciPayresultResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.payresult.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调.
     *
     * @param RefuseDciRegistrationRequest $request
     *
     * @return RefuseDciRegistrationResponse
     */
    public function refuseDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 数登审核失败结果回调
     * Summary: 数登审核失败结果回调.
     *
     * @param RefuseDciRegistrationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return RefuseDciRegistrationResponse
     */
    public function refuseDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权平台获取申办事由配置
     * Summary: 获取申办事由配置.
     *
     * @param QueryNotaryBidreasonRequest $request
     *
     * @return QueryNotaryBidreasonResponse
     */
    public function queryNotaryBidreason($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNotaryBidreasonEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权平台获取申办事由配置
     * Summary: 获取申办事由配置.
     *
     * @param QueryNotaryBidreasonRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryNotaryBidreasonResponse
     */
    public function queryNotaryBidreasonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNotaryBidreasonResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.bidreason.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取签署文件
     * Summary: 获取签署文件.
     *
     * @param QueryNotaryDocumenttosignRequest $request
     *
     * @return QueryNotaryDocumenttosignResponse
     */
    public function queryNotaryDocumenttosign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNotaryDocumenttosignEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取签署文件
     * Summary: 获取签署文件.
     *
     * @param QueryNotaryDocumenttosignRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryNotaryDocumenttosignResponse
     */
    public function queryNotaryDocumenttosignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNotaryDocumenttosignResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.documenttosign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交申办订单
     * Summary: 提交申办订单.
     *
     * @param ApplyNotaryOrderRequest $request
     *
     * @return ApplyNotaryOrderResponse
     */
    public function applyNotaryOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyNotaryOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交申办订单
     * Summary: 提交申办订单.
     *
     * @param ApplyNotaryOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ApplyNotaryOrderResponse
     */
    public function applyNotaryOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyNotaryOrderResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.order.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公证出证重新获取支付链接
     * Summary: 重新获取支付链接.
     *
     * @param QueryNotaryPayurlRequest $request
     *
     * @return QueryNotaryPayurlResponse
     */
    public function queryNotaryPayurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNotaryPayurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 公证出证重新获取支付链接
     * Summary: 重新获取支付链接.
     *
     * @param QueryNotaryPayurlRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryNotaryPayurlResponse
     */
    public function queryNotaryPayurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNotaryPayurlResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.payurl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公证出证获取收费标准和明细
     * Summary: 获取收费标准和明细.
     *
     * @param QueryNotaryFeedetailRequest $request
     *
     * @return QueryNotaryFeedetailResponse
     */
    public function queryNotaryFeedetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNotaryFeedetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 公证出证获取收费标准和明细
     * Summary: 获取收费标准和明细.
     *
     * @param QueryNotaryFeedetailRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryNotaryFeedetailResponse
     */
    public function queryNotaryFeedetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNotaryFeedetailResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.feedetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公证出证查询申办订单接口
     * Summary: 查询申办订单接口.
     *
     * @param QueryNotaryOrderRequest $request
     *
     * @return QueryNotaryOrderResponse
     */
    public function queryNotaryOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNotaryOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 公证出证查询申办订单接口
     * Summary: 查询申办订单接口.
     *
     * @param QueryNotaryOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryNotaryOrderResponse
     */
    public function queryNotaryOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNotaryOrderResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.order.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公证出证申请出证材料补齐
     * Summary: 申请出证材料补齐.
     *
     * @param UploadNotaryAttachmentRequest $request
     *
     * @return UploadNotaryAttachmentResponse
     */
    public function uploadNotaryAttachment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadNotaryAttachmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 公证出证申请出证材料补齐
     * Summary: 申请出证材料补齐.
     *
     * @param UploadNotaryAttachmentRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UploadNotaryAttachmentResponse
     */
    public function uploadNotaryAttachmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadNotaryAttachmentResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.attachment.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公证出证更新申办状态
     * Summary: 更新申办状态
     *
     * @param OperateNotaryOrderRequest $request
     *
     * @return OperateNotaryOrderResponse
     */
    public function operateNotaryOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateNotaryOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 公证出证更新申办状态
     * Summary: 更新申办状态
     *
     * @param OperateNotaryOrderRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return OperateNotaryOrderResponse
     */
    public function operateNotaryOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateNotaryOrderResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.order.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询DCI作品预览结果
     * Summary: 查询DCI作品预览结果.
     *
     * @param QueryDciPreviewRequest $request
     *
     * @return QueryDciPreviewResponse
     */
    public function queryDciPreview($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciPreviewEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询DCI作品预览结果
     * Summary: 查询DCI作品预览结果.
     *
     * @param QueryDciPreviewRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryDciPreviewResponse
     */
    public function queryDciPreviewEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciPreviewResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.preview.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 补正数登申请
     * Summary: 补正数登申请.
     *
     * @param RetryDciRegistrationRequest $request
     *
     * @return RetryDciRegistrationResponse
     */
    public function retryDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 补正数登申请
     * Summary: 补正数登申请.
     *
     * @param RetryDciRegistrationRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return RetryDciRegistrationResponse
     */
    public function retryDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数登停止申请
     * Summary: 数登停止申请.
     *
     * @param CloseDciRegistrationRequest $request
     *
     * @return CloseDciRegistrationResponse
     */
    public function closeDciRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->closeDciRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 数登停止申请
     * Summary: 数登停止申请.
     *
     * @param CloseDciRegistrationRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CloseDciRegistrationResponse
     */
    public function closeDciRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloseDciRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.registration.close', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dci用户无需证件注册
     * Summary: dci用户无需证件注册.
     *
     * @param AddDciUsernocertRequest $request
     *
     * @return AddDciUsernocertResponse
     */
    public function addDciUsernocert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDciUsernocertEx($request, $headers, $runtime);
    }

    /**
     * Description: dci用户无需证件注册
     * Summary: dci用户无需证件注册.
     *
     * @param AddDciUsernocertRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddDciUsernocertResponse
     */
    public function addDciUsernocertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDciUsernocertResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.usernocert.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询相似作品下载链接
     * Summary: 查询相似作品下载链接.
     *
     * @param QueryDciSimilarfileRequest $request
     *
     * @return QueryDciSimilarfileResponse
     */
    public function queryDciSimilarfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciSimilarfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询相似作品下载链接
     * Summary: 查询相似作品下载链接.
     *
     * @param QueryDciSimilarfileRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDciSimilarfileResponse
     */
    public function queryDciSimilarfileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciSimilarfileResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.similarfile.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 申请渠道推广
     * Summary: 申请渠道推广
     *
     * @param ApplyDciPromotionRequest $request
     *
     * @return ApplyDciPromotionResponse
     */
    public function applyDciPromotion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDciPromotionEx($request, $headers, $runtime);
    }

    /**
     * Description: 申请渠道推广
     * Summary: 申请渠道推广
     *
     * @param ApplyDciPromotionRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ApplyDciPromotionResponse
     */
    public function applyDciPromotionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDciPromotionResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.promotion.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据手机号查询dci用户
     * Summary: 根据手机号查询dci用户.
     *
     * @param QueryDciUserbyphoneRequest $request
     *
     * @return QueryDciUserbyphoneResponse
     */
    public function queryDciUserbyphone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciUserbyphoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据手机号查询dci用户
     * Summary: 根据手机号查询dci用户.
     *
     * @param QueryDciUserbyphoneRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDciUserbyphoneResponse
     */
    public function queryDciUserbyphoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciUserbyphoneResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.userbyphone.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支持交易的已进行用途登记的商品查询
     * Summary: 支持交易的商品查询.
     *
     * @param QueryTradeSaleRequest $request
     *
     * @return QueryTradeSaleResponse
     */
    public function queryTradeSale($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTradeSaleEx($request, $headers, $runtime);
    }

    /**
     * Description: 支持交易的已进行用途登记的商品查询
     * Summary: 支持交易的商品查询.
     *
     * @param QueryTradeSaleRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryTradeSaleResponse
     */
    public function queryTradeSaleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTradeSaleResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.trade.sale.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品交易用途登记
     * Summary: 商品交易用途登记.
     *
     * @param RegisterTradeUsageRequest $request
     *
     * @return RegisterTradeUsageResponse
     */
    public function registerTradeUsage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerTradeUsageEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品交易用途登记
     * Summary: 商品交易用途登记.
     *
     * @param RegisterTradeUsageRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return RegisterTradeUsageResponse
     */
    public function registerTradeUsageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterTradeUsageResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.trade.usage.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建取证用户
     * Summary: 创建取证用户.
     *
     * @param CreateEvidenceUserRequest $request
     *
     * @return CreateEvidenceUserResponse
     */
    public function createEvidenceUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createEvidenceUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建取证用户
     * Summary: 创建取证用户.
     *
     * @param CreateEvidenceUserRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateEvidenceUserResponse
     */
    public function createEvidenceUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateEvidenceUserResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.evidence.user.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建网页截图
     * Summary: 创建网页截图.
     *
     * @param CreateEvidenceScreenshotRequest $request
     *
     * @return CreateEvidenceScreenshotResponse
     */
    public function createEvidenceScreenshot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createEvidenceScreenshotEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建网页截图
     * Summary: 创建网页截图.
     *
     * @param CreateEvidenceScreenshotRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateEvidenceScreenshotResponse
     */
    public function createEvidenceScreenshotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateEvidenceScreenshotResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.evidence.screenshot.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建网页截图存证
     * Summary: 创建网页截图存证
     *
     * @param CreateEvidenceRegisterRequest $request
     *
     * @return CreateEvidenceRegisterResponse
     */
    public function createEvidenceRegister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createEvidenceRegisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建网页截图存证
     * Summary: 创建网页截图存证
     *
     * @param CreateEvidenceRegisterRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateEvidenceRegisterResponse
     */
    public function createEvidenceRegisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateEvidenceRegisterResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.evidence.register.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建录屏取证
     * Summary: 创建录屏取证
     *
     * @param CreateEvidenceRecordscreenRequest $request
     *
     * @return CreateEvidenceRecordscreenResponse
     */
    public function createEvidenceRecordscreen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createEvidenceRecordscreenEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建录屏取证
     * Summary: 创建录屏取证
     *
     * @param CreateEvidenceRecordscreenRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateEvidenceRecordscreenResponse
     */
    public function createEvidenceRecordscreenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateEvidenceRecordscreenResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.evidence.recordscreen.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品交易用途撤销
     * Summary: 商品交易用途撤销
     *
     * @param CancelTradeUsageRequest $request
     *
     * @return CancelTradeUsageResponse
     */
    public function cancelTradeUsage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelTradeUsageEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品交易用途撤销
     * Summary: 商品交易用途撤销
     *
     * @param CancelTradeUsageRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CancelTradeUsageResponse
     */
    public function cancelTradeUsageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelTradeUsageResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.trade.usage.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 录屏取证
     * Summary: 录屏.
     *
     * @param CreateEvidenceLiveRequest $request
     *
     * @return CreateEvidenceLiveResponse
     */
    public function createEvidenceLive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createEvidenceLiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 录屏取证
     * Summary: 录屏.
     *
     * @param CreateEvidenceLiveRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateEvidenceLiveResponse
     */
    public function createEvidenceLiveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateEvidenceLiveResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.evidence.live.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据点播网站url发起点播取证
     * Summary: 发起点播取证
     *
     * @param CreateEvidenceVodRequest $request
     *
     * @return CreateEvidenceVodResponse
     */
    public function createEvidenceVod($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createEvidenceVodEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据点播网站url发起点播取证
     * Summary: 发起点播取证
     *
     * @param CreateEvidenceVodRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateEvidenceVodResponse
     */
    public function createEvidenceVodEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateEvidenceVodResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.evidence.vod.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品交易用途登记结果查询，目前仅用于测试
     * Summary: 商品交易用途登记结果查询.
     *
     * @param GetTradeUsageRequest $request
     *
     * @return GetTradeUsageResponse
     */
    public function getTradeUsage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeUsageEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品交易用途登记结果查询，目前仅用于测试
     * Summary: 商品交易用途登记结果查询.
     *
     * @param GetTradeUsageRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetTradeUsageResponse
     */
    public function getTradeUsageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeUsageResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.trade.usage.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询取证信息
     * Summary: 查询取证信息.
     *
     * @param GetEvidenceInfoRequest $request
     *
     * @return GetEvidenceInfoResponse
     */
    public function getEvidenceInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getEvidenceInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询取证信息
     * Summary: 查询取证信息.
     *
     * @param GetEvidenceInfoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetEvidenceInfoResponse
     */
    public function getEvidenceInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetEvidenceInfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.evidence.info.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: DCI变更
     * Summary: DCI变更.
     *
     * @param ReplaceDciRequest $request
     *
     * @return ReplaceDciResponse
     */
    public function replaceDci($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceDciEx($request, $headers, $runtime);
    }

    /**
     * Description: DCI变更
     * Summary: DCI变更.
     *
     * @param ReplaceDciRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ReplaceDciResponse
     */
    public function replaceDciEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceDciResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交作品申诉
     * Summary: 提交作品申诉.
     *
     * @param SubmitDciFeedbackRequest $request
     *
     * @return SubmitDciFeedbackResponse
     */
    public function submitDciFeedback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitDciFeedbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交作品申诉
     * Summary: 提交作品申诉.
     *
     * @param SubmitDciFeedbackRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SubmitDciFeedbackResponse
     */
    public function submitDciFeedbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitDciFeedbackResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.feedback.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询申诉结果
     * Summary: 查询申诉结果.
     *
     * @param QueryDciFeedbackRequest $request
     *
     * @return QueryDciFeedbackResponse
     */
    public function queryDciFeedback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDciFeedbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询申诉结果
     * Summary: 查询申诉结果.
     *
     * @param QueryDciFeedbackRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDciFeedbackResponse
     */
    public function queryDciFeedbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDciFeedbackResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.dci.feedback.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 交易商品抽取封面
     * Summary: 交易商品抽取封面.
     *
     * @param ExecTradeCoverRequest $request
     *
     * @return ExecTradeCoverResponse
     */
    public function execTradeCover($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execTradeCoverEx($request, $headers, $runtime);
    }

    /**
     * Description: 交易商品抽取封面
     * Summary: 交易商品抽取封面.
     *
     * @param ExecTradeCoverRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecTradeCoverResponse
     */
    public function execTradeCoverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecTradeCoverResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.trade.cover.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单.
     *
     * @param CreateOrderRequest $request
     *
     * @return CreateOrderResponse
     */
    public function createOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建订单
     * Summary: 创建订单.
     *
     * @param CreateOrderRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CreateOrderResponse
     */
    public function createOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateOrderResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.order.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询订单支付链接
     * Summary: 查询订单支付链接.
     *
     * @param QueryOrderPayurlRequest $request
     *
     * @return QueryOrderPayurlResponse
     */
    public function queryOrderPayurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOrderPayurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询订单支付链接
     * Summary: 查询订单支付链接.
     *
     * @param QueryOrderPayurlRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryOrderPayurlResponse
     */
    public function queryOrderPayurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOrderPayurlResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.order.payurl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加发布视频内容
     * Summary: 发布视频内容.
     *
     * @param AddContentRequest $request
     *
     * @return AddContentResponse
     */
    public function addContent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addContentEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加发布视频内容
     * Summary: 发布视频内容.
     *
     * @param AddContentRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AddContentResponse
     */
    public function addContentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddContentResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.content.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询视频内容状态
     * Summary: 查询视频内容状态
     *
     * @param QueryContentStatusRequest $request
     *
     * @return QueryContentStatusResponse
     */
    public function queryContentStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContentStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询视频内容状态
     * Summary: 查询视频内容状态
     *
     * @param QueryContentStatusRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryContentStatusResponse
     */
    public function queryContentStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContentStatusResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.content.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询视频内容统计数据
     * Summary: 查询视频内容统计
     *
     * @param QueryContentStatisticsRequest $request
     *
     * @return QueryContentStatisticsResponse
     */
    public function queryContentStatistics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContentStatisticsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询视频内容统计数据
     * Summary: 查询视频内容统计
     *
     * @param QueryContentStatisticsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryContentStatisticsResponse
     */
    public function queryContentStatisticsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContentStatisticsResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.content.statistics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询视频内容统计数据
     * Summary: 批量查询视频统计信息.
     *
     * @param QueryContentBatchstatisticsRequest $request
     *
     * @return QueryContentBatchstatisticsResponse
     */
    public function queryContentBatchstatistics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContentBatchstatisticsEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询视频内容统计数据
     * Summary: 批量查询视频统计信息.
     *
     * @param QueryContentBatchstatisticsRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryContentBatchstatisticsResponse
     */
    public function queryContentBatchstatisticsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContentBatchstatisticsResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.content.batchstatistics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品发布
     * Summary: 商品发布.
     *
     * @param PublishGoodRequest $request
     *
     * @return PublishGoodResponse
     */
    public function publishGood($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishGoodEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品发布
     * Summary: 商品发布.
     *
     * @param PublishGoodRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return PublishGoodResponse
     */
    public function publishGoodEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishGoodResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.good.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品发布查询
     * Summary: 商品发布查询.
     *
     * @param QueryGoodsPublishRequest $request
     *
     * @return QueryGoodsPublishResponse
     */
    public function queryGoodsPublish($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGoodsPublishEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品发布查询
     * Summary: 商品发布查询.
     *
     * @param QueryGoodsPublishRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryGoodsPublishResponse
     */
    public function queryGoodsPublishEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGoodsPublishResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.goods.publish.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品更新
     * Summary: 商品更新.
     *
     * @param UpdateGoodsRequest $request
     *
     * @return UpdateGoodsResponse
     */
    public function updateGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品更新
     * Summary: 商品更新.
     *
     * @param UpdateGoodsRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return UpdateGoodsResponse
     */
    public function updateGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGoodsResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.goods.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品查询
     * Summary: 商品查询.
     *
     * @param QueryGoodsRequest $request
     *
     * @return QueryGoodsResponse
     */
    public function queryGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品查询
     * Summary: 商品查询.
     *
     * @param QueryGoodsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryGoodsResponse
     */
    public function queryGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGoodsResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.goods.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
