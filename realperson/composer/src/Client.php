<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\REALPERSON\Models\ApplyCutpaymentPaymentRequest;
use AntChain\REALPERSON\Models\ApplyCutpaymentPaymentResponse;
use AntChain\REALPERSON\Models\ApplyCutpaymentRefundRequest;
use AntChain\REALPERSON\Models\ApplyCutpaymentRefundResponse;
use AntChain\REALPERSON\Models\ApplyExtOrgdataRequest;
use AntChain\REALPERSON\Models\ApplyExtOrgdataResponse;
use AntChain\REALPERSON\Models\BindCarrierRepairmobileRequest;
use AntChain\REALPERSON\Models\BindCarrierRepairmobileResponse;
use AntChain\REALPERSON\Models\BindCutpaymentPreRequest;
use AntChain\REALPERSON\Models\BindCutpaymentPreResponse;
use AntChain\REALPERSON\Models\BindCutpaymentSignRequest;
use AntChain\REALPERSON\Models\BindCutpaymentSignResponse;
use AntChain\REALPERSON\Models\CaptureCutpaymentsubWithdrawalRequest;
use AntChain\REALPERSON\Models\CaptureCutpaymentsubWithdrawalResponse;
use AntChain\REALPERSON\Models\CheckAnticheatPersonalRequest;
use AntChain\REALPERSON\Models\CheckAnticheatPersonalResponse;
use AntChain\REALPERSON\Models\CheckBankcardTwometaRequest;
use AntChain\REALPERSON\Models\CheckBankcardTwometaResponse;
use AntChain\REALPERSON\Models\CheckCarrierTwometaRequest;
use AntChain\REALPERSON\Models\CheckCarrierTwometaResponse;
use AntChain\REALPERSON\Models\CheckCarTwometaRequest;
use AntChain\REALPERSON\Models\CheckCarTwometaResponse;
use AntChain\REALPERSON\Models\CheckIdcardFourmetaRequest;
use AntChain\REALPERSON\Models\CheckIdcardFourmetaResponse;
use AntChain\REALPERSON\Models\CheckIndividualidFourmetaRequest;
use AntChain\REALPERSON\Models\CheckIndividualidFourmetaResponse;
use AntChain\REALPERSON\Models\CheckIndividualidThreemetaRequest;
use AntChain\REALPERSON\Models\CheckIndividualidThreemetaResponse;
use AntChain\REALPERSON\Models\CheckIndividualidTwometaRequest;
use AntChain\REALPERSON\Models\CheckIndividualidTwometaResponse;
use AntChain\REALPERSON\Models\CheckRouteThreemetaRequest;
use AntChain\REALPERSON\Models\CheckRouteThreemetaResponse;
use AntChain\REALPERSON\Models\CheckRouteTwometaRequest;
use AntChain\REALPERSON\Models\CheckRouteTwometaResponse;
use AntChain\REALPERSON\Models\CheckThreemetaBankcardRequest;
use AntChain\REALPERSON\Models\CheckThreemetaBankcardResponse;
use AntChain\REALPERSON\Models\CheckTwometaHashRequest;
use AntChain\REALPERSON\Models\CheckTwometaHashResponse;
use AntChain\REALPERSON\Models\CreateAlipayverifyServerRequest;
use AntChain\REALPERSON\Models\CreateAlipayverifyServerResponse;
use AntChain\REALPERSON\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\REALPERSON\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\REALPERSON\Models\CreateConsoleDomainRequest;
use AntChain\REALPERSON\Models\CreateConsoleDomainResponse;
use AntChain\REALPERSON\Models\CreateFaceverifyServerRequest;
use AntChain\REALPERSON\Models\CreateFaceverifyServerResponse;
use AntChain\REALPERSON\Models\CreateFacevrfServerRequest;
use AntChain\REALPERSON\Models\CreateFacevrfServerResponse;
use AntChain\REALPERSON\Models\CreateNfcServerRequest;
use AntChain\REALPERSON\Models\CreateNfcServerResponse;
use AntChain\REALPERSON\Models\CreateVoiceprintServermodeRequest;
use AntChain\REALPERSON\Models\CreateVoiceprintServermodeResponse;
use AntChain\REALPERSON\Models\DeleteConsoleDomainRequest;
use AntChain\REALPERSON\Models\DeleteConsoleDomainResponse;
use AntChain\REALPERSON\Models\DetailFacevrfServerRequest;
use AntChain\REALPERSON\Models\DetailFacevrfServerResponse;
use AntChain\REALPERSON\Models\ExecFaceThreemetaRequest;
use AntChain\REALPERSON\Models\ExecFaceThreemetaResponse;
use AntChain\REALPERSON\Models\ExecFaceverifyServermodeRequest;
use AntChain\REALPERSON\Models\ExecFaceverifyServermodeResponse;
use AntChain\REALPERSON\Models\ExecFacevrfServermodeRequest;
use AntChain\REALPERSON\Models\ExecFacevrfServermodeResponse;
use AntChain\REALPERSON\Models\ExecFacevrfServerRequest;
use AntChain\REALPERSON\Models\ExecFacevrfServerResponse;
use AntChain\REALPERSON\Models\GetFacevrfEvidenceRequest;
use AntChain\REALPERSON\Models\GetFacevrfEvidenceResponse;
use AntChain\REALPERSON\Models\InitCarrierRepairmobileRequest;
use AntChain\REALPERSON\Models\InitCarrierRepairmobileResponse;
use AntChain\REALPERSON\Models\InitFacevrfZimRequest;
use AntChain\REALPERSON\Models\InitFacevrfZimResponse;
use AntChain\REALPERSON\Models\OpenCutpaymentsubAccountRequest;
use AntChain\REALPERSON\Models\OpenCutpaymentsubAccountResponse;
use AntChain\REALPERSON\Models\QueryAlipayverifyServerRequest;
use AntChain\REALPERSON\Models\QueryAlipayverifyServerResponse;
use AntChain\REALPERSON\Models\QueryBankLivenessfourRequest;
use AntChain\REALPERSON\Models\QueryBankLivenessfourResponse;
use AntChain\REALPERSON\Models\QueryBankLivenessplusRequest;
use AntChain\REALPERSON\Models\QueryBankLivenessplusResponse;
use AntChain\REALPERSON\Models\QueryBankLivenessRequest;
use AntChain\REALPERSON\Models\QueryBankLivenessResponse;
use AntChain\REALPERSON\Models\QueryCarinfoBriefRequest;
use AntChain\REALPERSON\Models\QueryCarinfoBriefResponse;
use AntChain\REALPERSON\Models\QueryCarinfoDetailRequest;
use AntChain\REALPERSON\Models\QueryCarinfoDetailResponse;
use AntChain\REALPERSON\Models\QueryCarinfoPlusRequest;
use AntChain\REALPERSON\Models\QueryCarinfoPlusResponse;
use AntChain\REALPERSON\Models\QueryCarinfoUltimateRequest;
use AntChain\REALPERSON\Models\QueryCarinfoUltimateResponse;
use AntChain\REALPERSON\Models\QueryCarrierNetstatusRequest;
use AntChain\REALPERSON\Models\QueryCarrierNetstatusResponse;
use AntChain\REALPERSON\Models\QueryCarrierRepairmobileRequest;
use AntChain\REALPERSON\Models\QueryCarrierRepairmobileResponse;
use AntChain\REALPERSON\Models\QueryCutpaymentBindRequest;
use AntChain\REALPERSON\Models\QueryCutpaymentBindResponse;
use AntChain\REALPERSON\Models\QueryCutpaymentPaymentRequest;
use AntChain\REALPERSON\Models\QueryCutpaymentPaymentResponse;
use AntChain\REALPERSON\Models\QueryCutpaymentRefundRequest;
use AntChain\REALPERSON\Models\QueryCutpaymentRefundResponse;
use AntChain\REALPERSON\Models\QueryCutpaymentStatementRequest;
use AntChain\REALPERSON\Models\QueryCutpaymentStatementResponse;
use AntChain\REALPERSON\Models\QueryCutpaymentsubAccountRequest;
use AntChain\REALPERSON\Models\QueryCutpaymentsubAccountResponse;
use AntChain\REALPERSON\Models\QueryCutpaymentsubBalanceRequest;
use AntChain\REALPERSON\Models\QueryCutpaymentsubBalanceResponse;
use AntChain\REALPERSON\Models\QueryCutpaymentsubRevenueRequest;
use AntChain\REALPERSON\Models\QueryCutpaymentsubRevenueResponse;
use AntChain\REALPERSON\Models\QueryCutpaymentsubTransactionRequest;
use AntChain\REALPERSON\Models\QueryCutpaymentsubTransactionResponse;
use AntChain\REALPERSON\Models\QueryCutpaymentsubWithdrawalRequest;
use AntChain\REALPERSON\Models\QueryCutpaymentsubWithdrawalResponse;
use AntChain\REALPERSON\Models\QueryDeepsecRiskRequest;
use AntChain\REALPERSON\Models\QueryDeepsecRiskResponse;
use AntChain\REALPERSON\Models\QueryDeepsecTsbmrqRequest;
use AntChain\REALPERSON\Models\QueryDeepsecTsbmrqResponse;
use AntChain\REALPERSON\Models\QueryDemoInfoRequest;
use AntChain\REALPERSON\Models\QueryDemoInfoResponse;
use AntChain\REALPERSON\Models\QueryEducationBackgroundRequest;
use AntChain\REALPERSON\Models\QueryEducationBackgroundResponse;
use AntChain\REALPERSON\Models\QueryEducationInfoRequest;
use AntChain\REALPERSON\Models\QueryEducationInfoResponse;
use AntChain\REALPERSON\Models\QueryFaceverifyServermaterialRequest;
use AntChain\REALPERSON\Models\QueryFaceverifyServermaterialResponse;
use AntChain\REALPERSON\Models\QueryFaceverifyServerRequest;
use AntChain\REALPERSON\Models\QueryFaceverifyServerResponse;
use AntChain\REALPERSON\Models\QueryFacevrfServerRequest;
use AntChain\REALPERSON\Models\QueryFacevrfServerResponse;
use AntChain\REALPERSON\Models\QueryMobileRiskRequest;
use AntChain\REALPERSON\Models\QueryMobileRiskResponse;
use AntChain\REALPERSON\Models\QueryNfcServerRequest;
use AntChain\REALPERSON\Models\QueryNfcServerResponse;
use AntChain\REALPERSON\Models\QueryRiskServerRequest;
use AntChain\REALPERSON\Models\QueryRiskServerResponse;
use AntChain\REALPERSON\Models\QuerySocialriskBriefRequest;
use AntChain\REALPERSON\Models\QuerySocialriskBriefResponse;
use AntChain\REALPERSON\Models\QuerySocialriskDetailRequest;
use AntChain\REALPERSON\Models\QuerySocialriskDetailResponse;
use AntChain\REALPERSON\Models\QuerySocialriskTobriskRequest;
use AntChain\REALPERSON\Models\QuerySocialriskTobriskResponse;
use AntChain\REALPERSON\Models\QueryThreemetaOnlinetimeRequest;
use AntChain\REALPERSON\Models\QueryThreemetaOnlinetimeResponse;
use AntChain\REALPERSON\Models\QueryThreemetaPhonereuseRequest;
use AntChain\REALPERSON\Models\QueryThreemetaPhonereuseResponse;
use AntChain\REALPERSON\Models\QueryTscenterDeviceRequest;
use AntChain\REALPERSON\Models\QueryTscenterDeviceResponse;
use AntChain\REALPERSON\Models\RecognizeDocIndividualcardRequest;
use AntChain\REALPERSON\Models\RecognizeDocIndividualcardResponse;
use AntChain\REALPERSON\Models\RecognizeOcrIndividualcardRequest;
use AntChain\REALPERSON\Models\RecognizeOcrIndividualcardResponse;
use AntChain\REALPERSON\Models\ScaleinImageRequest;
use AntChain\REALPERSON\Models\ScaleinImageResponse;
use AntChain\REALPERSON\Models\TransferCutpaymentsubRevenueRequest;
use AntChain\REALPERSON\Models\TransferCutpaymentsubRevenueResponse;
use AntChain\REALPERSON\Models\UnbindCutpaymentSignRequest;
use AntChain\REALPERSON\Models\UnbindCutpaymentSignResponse;
use AntChain\REALPERSON\Models\VerifyFacevrfZimRequest;
use AntChain\REALPERSON\Models\VerifyFacevrfZimResponse;
use AntChain\REALPERSON\Models\VerifyVoiceprintServermodeRequest;
use AntChain\REALPERSON\Models\VerifyVoiceprintServermodeResponse;
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
            // 卡证OCR图片坐标
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
                    'sdk_version'      => '1.22.21',
                    '_prod_code'       => 'REALPERSON',
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
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询.
     *
     * @param QueryFacevrfServerRequest $request
     *
     * @return QueryFacevrfServerResponse
     */
    public function queryFacevrfServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFacevrfServerEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询.
     *
     * @param QueryFacevrfServerRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryFacevrfServerResponse
     */
    public function queryFacevrfServerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFacevrfServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.facevrf.server.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建.
     *
     * @param CreateFacevrfServerRequest $request
     *
     * @return CreateFacevrfServerResponse
     */
    public function createFacevrfServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFacevrfServerEx($request, $headers, $runtime);
    }

    /**
     * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
     * Summary: 认证创建.
     *
     * @param CreateFacevrfServerRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateFacevrfServerResponse
     */
    public function createFacevrfServerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFacevrfServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.facevrf.server.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对.
     *
     * @param ExecFacevrfServerRequest $request
     *
     * @return ExecFacevrfServerResponse
     */
    public function execFacevrfServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execFacevrfServerEx($request, $headers, $runtime);
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对.
     *
     * @param ExecFacevrfServerRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExecFacevrfServerResponse
     */
    public function execFacevrfServerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecFacevrfServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.facevrf.server.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID.
     *
     * @param GetFacevrfEvidenceRequest $request
     *
     * @return GetFacevrfEvidenceResponse
     */
    public function getFacevrfEvidence($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFacevrfEvidenceEx($request, $headers, $runtime);
    }

    /**
     * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
     * Summary: 商户获取司法链上刷脸存证和统一证据ID.
     *
     * @param GetFacevrfEvidenceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetFacevrfEvidenceResponse
     */
    public function getFacevrfEvidenceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFacevrfEvidenceResponse::fromMap($this->doRequest('1.0', 'di.realperson.facevrf.evidence.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人二要素认证
     * Summary: 个人二要素认证
     *
     * @param CheckIndividualidTwometaRequest $request
     *
     * @return CheckIndividualidTwometaResponse
     */
    public function checkIndividualidTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkIndividualidTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人二要素认证
     * Summary: 个人二要素认证
     *
     * @param CheckIndividualidTwometaRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CheckIndividualidTwometaResponse
     */
    public function checkIndividualidTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckIndividualidTwometaResponse::fromMap($this->doRequest('1.0', 'di.realperson.individualid.twometa.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人三要素认证
     * Summary: 个人三要素认证
     *
     * @param CheckIndividualidThreemetaRequest $request
     *
     * @return CheckIndividualidThreemetaResponse
     */
    public function checkIndividualidThreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkIndividualidThreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人三要素认证
     * Summary: 个人三要素认证
     *
     * @param CheckIndividualidThreemetaRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CheckIndividualidThreemetaResponse
     */
    public function checkIndividualidThreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckIndividualidThreemetaResponse::fromMap($this->doRequest('1.0', 'di.realperson.individualid.threemeta.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人四要素认证
     * Summary: 个人四要素认证
     *
     * @param CheckIndividualidFourmetaRequest $request
     *
     * @return CheckIndividualidFourmetaResponse
     */
    public function checkIndividualidFourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkIndividualidFourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人四要素认证
     * Summary: 个人四要素认证
     *
     * @param CheckIndividualidFourmetaRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CheckIndividualidFourmetaResponse
     */
    public function checkIndividualidFourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckIndividualidFourmetaResponse::fromMap($this->doRequest('1.0', 'di.realperson.individualid.fourmeta.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人三要素认证（场景路由）
     * Summary: 个人三要素认证（场景路由）.
     *
     * @param CheckRouteThreemetaRequest $request
     *
     * @return CheckRouteThreemetaResponse
     */
    public function checkRouteThreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkRouteThreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人三要素认证（场景路由）
     * Summary: 个人三要素认证（场景路由）.
     *
     * @param CheckRouteThreemetaRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CheckRouteThreemetaResponse
     */
    public function checkRouteThreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckRouteThreemetaResponse::fromMap($this->doRequest('1.0', 'di.realperson.route.threemeta.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 纯服务端声纹注册
     * Summary: 纯服务端声纹注册.
     *
     * @param CreateVoiceprintServermodeRequest $request
     *
     * @return CreateVoiceprintServermodeResponse
     */
    public function createVoiceprintServermode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createVoiceprintServermodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 纯服务端声纹注册
     * Summary: 纯服务端声纹注册.
     *
     * @param CreateVoiceprintServermodeRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateVoiceprintServermodeResponse
     */
    public function createVoiceprintServermodeEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'di.realperson.voiceprint.servermode.create',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new CreateVoiceprintServermodeResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return CreateVoiceprintServermodeResponse::fromMap($this->doRequest('1.0', 'di.realperson.voiceprint.servermode.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 纯服务端声纹比对
     * Summary: 纯服务端声纹比对.
     *
     * @param VerifyVoiceprintServermodeRequest $request
     *
     * @return VerifyVoiceprintServermodeResponse
     */
    public function verifyVoiceprintServermode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyVoiceprintServermodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 纯服务端声纹比对
     * Summary: 纯服务端声纹比对.
     *
     * @param VerifyVoiceprintServermodeRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return VerifyVoiceprintServermodeResponse
     */
    public function verifyVoiceprintServermodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyVoiceprintServermodeResponse::fromMap($this->doRequest('1.0', 'di.realperson.voiceprint.servermode.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人二要素认证（场景路由）
     * Summary: 个人二要素认证（场景路由）.
     *
     * @param CheckRouteTwometaRequest $request
     *
     * @return CheckRouteTwometaResponse
     */
    public function checkRouteTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkRouteTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人二要素认证（场景路由）
     * Summary: 个人二要素认证（场景路由）.
     *
     * @param CheckRouteTwometaRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CheckRouteTwometaResponse
     */
    public function checkRouteTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckRouteTwometaResponse::fromMap($this->doRequest('1.0', 'di.realperson.route.twometa.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
     * Summary: 移动风险设备查询.
     *
     * @param QueryMobileRiskRequest $request
     *
     * @return QueryMobileRiskResponse
     */
    public function queryMobileRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMobileRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
     * Summary: 移动风险设备查询.
     *
     * @param QueryMobileRiskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryMobileRiskResponse
     */
    public function queryMobileRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMobileRiskResponse::fromMap($this->doRequest('1.0', 'di.realperson.mobile.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
     * Summary: 查询认证人、认证时间等相关信息.
     *
     * @param DetailFacevrfServerRequest $request
     *
     * @return DetailFacevrfServerResponse
     */
    public function detailFacevrfServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailFacevrfServerEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
     * Summary: 查询认证人、认证时间等相关信息.
     *
     * @param DetailFacevrfServerRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DetailFacevrfServerResponse
     */
    public function detailFacevrfServerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailFacevrfServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.facevrf.server.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
     * Summary: 个人反欺诈风险校验.
     *
     * @param CheckAnticheatPersonalRequest $request
     *
     * @return CheckAnticheatPersonalResponse
     */
    public function checkAnticheatPersonal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAnticheatPersonalEx($request, $headers, $runtime);
    }

    /**
     * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
     * Summary: 个人反欺诈风险校验.
     *
     * @param CheckAnticheatPersonalRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CheckAnticheatPersonalResponse
     */
    public function checkAnticheatPersonalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAnticheatPersonalResponse::fromMap($this->doRequest('1.0', 'di.realperson.anticheat.personal.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 二要素支持hash主体信息
     * Summary: 个人二要素核验支持hash的主体信息.
     *
     * @param CheckTwometaHashRequest $request
     *
     * @return CheckTwometaHashResponse
     */
    public function checkTwometaHash($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkTwometaHashEx($request, $headers, $runtime);
    }

    /**
     * Description: 二要素支持hash主体信息
     * Summary: 个人二要素核验支持hash的主体信息.
     *
     * @param CheckTwometaHashRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CheckTwometaHashResponse
     */
    public function checkTwometaHashEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckTwometaHashResponse::fromMap($this->doRequest('1.0', 'di.realperson.twometa.hash.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对接运营商等数据源查询手机号码的在网时长
     * Summary: 三要素在网时长查询接口.
     *
     * @param QueryThreemetaOnlinetimeRequest $request
     *
     * @return QueryThreemetaOnlinetimeResponse
     */
    public function queryThreemetaOnlinetime($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThreemetaOnlinetimeEx($request, $headers, $runtime);
    }

    /**
     * Description: 对接运营商等数据源查询手机号码的在网时长
     * Summary: 三要素在网时长查询接口.
     *
     * @param QueryThreemetaOnlinetimeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryThreemetaOnlinetimeResponse
     */
    public function queryThreemetaOnlinetimeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThreemetaOnlinetimeResponse::fromMap($this->doRequest('1.0', 'di.realperson.threemeta.onlinetime.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户端初始化认证(OEM专用)
     * Summary: 客户端初始化认证(OEM专用).
     *
     * @param InitFacevrfZimRequest $request
     *
     * @return InitFacevrfZimResponse
     */
    public function initFacevrfZim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFacevrfZimEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户端初始化认证(OEM专用)
     * Summary: 客户端初始化认证(OEM专用).
     *
     * @param InitFacevrfZimRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return InitFacevrfZimResponse
     */
    public function initFacevrfZimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFacevrfZimResponse::fromMap($this->doRequest('1.0', 'di.realperson.facevrf.zim.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户端人脸验证(OEM专用)
     * Summary: 客户端人脸验证(OEM专用).
     *
     * @param VerifyFacevrfZimRequest $request
     *
     * @return VerifyFacevrfZimResponse
     */
    public function verifyFacevrfZim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyFacevrfZimEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户端人脸验证(OEM专用)
     * Summary: 客户端人脸验证(OEM专用).
     *
     * @param VerifyFacevrfZimRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return VerifyFacevrfZimResponse
     */
    public function verifyFacevrfZimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyFacevrfZimResponse::fromMap($this->doRequest('1.0', 'di.realperson.facevrf.zim.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卡证OCR
     * Summary: 卡证OCR.
     *
     * @param RecognizeDocIndividualcardRequest $request
     *
     * @return RecognizeDocIndividualcardResponse
     */
    public function recognizeDocIndividualcard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeDocIndividualcardEx($request, $headers, $runtime);
    }

    /**
     * Description: 卡证OCR
     * Summary: 卡证OCR.
     *
     * @param RecognizeDocIndividualcardRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return RecognizeDocIndividualcardResponse
     */
    public function recognizeDocIndividualcardEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'di.realperson.doc.individualcard.recognize',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new RecognizeDocIndividualcardResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return RecognizeDocIndividualcardResponse::fromMap($this->doRequest('1.0', 'di.realperson.doc.individualcard.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人银行卡三要素
     * Summary: 个人银行卡三要素.
     *
     * @param CheckThreemetaBankcardRequest $request
     *
     * @return CheckThreemetaBankcardResponse
     */
    public function checkThreemetaBankcard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkThreemetaBankcardEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人银行卡三要素
     * Summary: 个人银行卡三要素.
     *
     * @param CheckThreemetaBankcardRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CheckThreemetaBankcardResponse
     */
    public function checkThreemetaBankcardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckThreemetaBankcardResponse::fromMap($this->doRequest('1.0', 'di.realperson.threemeta.bankcard.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: deepsec终端安全风险标签查询
     * Summary: deepsec终端安全风险标签查询.
     *
     * @param QueryDeepsecRiskRequest $request
     *
     * @return QueryDeepsecRiskResponse
     */
    public function queryDeepsecRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeepsecRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: deepsec终端安全风险标签查询
     * Summary: deepsec终端安全风险标签查询.
     *
     * @param QueryDeepsecRiskRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDeepsecRiskResponse
     */
    public function queryDeepsecRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeepsecRiskResponse::fromMap($this->doRequest('1.0', 'di.realperson.deepsec.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: deepsec终端安全api，用于apdid查询
     * Summary: tsbmrq设备id查询入口.
     *
     * @param QueryDeepsecTsbmrqRequest $request
     *
     * @return QueryDeepsecTsbmrqResponse
     */
    public function queryDeepsecTsbmrq($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeepsecTsbmrqEx($request, $headers, $runtime);
    }

    /**
     * Description: deepsec终端安全api，用于apdid查询
     * Summary: tsbmrq设备id查询入口.
     *
     * @param QueryDeepsecTsbmrqRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryDeepsecTsbmrqResponse
     */
    public function queryDeepsecTsbmrqEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeepsecTsbmrqResponse::fromMap($this->doRequest('1.0', 'di.realperson.deepsec.tsbmrq.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人运营商二次放号
     * Summary: 个人运营商二次放号.
     *
     * @param QueryThreemetaPhonereuseRequest $request
     *
     * @return QueryThreemetaPhonereuseResponse
     */
    public function queryThreemetaPhonereuse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThreemetaPhonereuseEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人运营商二次放号
     * Summary: 个人运营商二次放号.
     *
     * @param QueryThreemetaPhonereuseRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryThreemetaPhonereuseResponse
     */
    public function queryThreemetaPhonereuseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThreemetaPhonereuseResponse::fromMap($this->doRequest('1.0', 'di.realperson.threemeta.phonereuse.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询设备信息
     * Summary: 设备信息查询for蚁盾.
     *
     * @param QueryTscenterDeviceRequest $request
     *
     * @return QueryTscenterDeviceResponse
     */
    public function queryTscenterDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTscenterDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询设备信息
     * Summary: 设备信息查询for蚁盾.
     *
     * @param QueryTscenterDeviceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryTscenterDeviceResponse
     */
    public function queryTscenterDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTscenterDeviceResponse::fromMap($this->doRequest('1.0', 'di.realperson.tscenter.device.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 学历验证
     * Summary: 学历验证
     *
     * @param QueryEducationInfoRequest $request
     *
     * @return QueryEducationInfoResponse
     */
    public function queryEducationInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEducationInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 学历验证
     * Summary: 学历验证
     *
     * @param QueryEducationInfoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryEducationInfoResponse
     */
    public function queryEducationInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEducationInfoResponse::fromMap($this->doRequest('1.0', 'di.realperson.education.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: demo用记录查询
     * Summary: demo用记录查询.
     *
     * @param QueryDemoInfoRequest $request
     *
     * @return QueryDemoInfoResponse
     */
    public function queryDemoInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: demo用记录查询
     * Summary: demo用记录查询.
     *
     * @param QueryDemoInfoRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryDemoInfoResponse
     */
    public function queryDemoInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoInfoResponse::fromMap($this->doRequest('1.0', 'di.realperson.demo.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人银行卡二要素
     * Summary: 个人银行卡二要素.
     *
     * @param CheckBankcardTwometaRequest $request
     *
     * @return CheckBankcardTwometaResponse
     */
    public function checkBankcardTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkBankcardTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人银行卡二要素
     * Summary: 个人银行卡二要素.
     *
     * @param CheckBankcardTwometaRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CheckBankcardTwometaResponse
     */
    public function checkBankcardTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckBankcardTwometaResponse::fromMap($this->doRequest('1.0', 'di.realperson.bankcard.twometa.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人运营商二要素
     * Summary: 个人运营商二要素.
     *
     * @param CheckCarrierTwometaRequest $request
     *
     * @return CheckCarrierTwometaResponse
     */
    public function checkCarrierTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkCarrierTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人运营商二要素
     * Summary: 个人运营商二要素.
     *
     * @param CheckCarrierTwometaRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CheckCarrierTwometaResponse
     */
    public function checkCarrierTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckCarrierTwometaResponse::fromMap($this->doRequest('1.0', 'di.realperson.carrier.twometa.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: NFC实证
     * Summary: NFC实证
     *
     * @param CreateNfcServerRequest $request
     *
     * @return CreateNfcServerResponse
     */
    public function createNfcServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createNfcServerEx($request, $headers, $runtime);
    }

    /**
     * Description: NFC实证
     * Summary: NFC实证
     *
     * @param CreateNfcServerRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateNfcServerResponse
     */
    public function createNfcServerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateNfcServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.nfc.server.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: NFC实证
     * Summary: NFC实证
     *
     * @param QueryNfcServerRequest $request
     *
     * @return QueryNfcServerResponse
     */
    public function queryNfcServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNfcServerEx($request, $headers, $runtime);
    }

    /**
     * Description: NFC实证
     * Summary: NFC实证
     *
     * @param QueryNfcServerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryNfcServerResponse
     */
    public function queryNfcServerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNfcServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.nfc.server.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 社会安全风险
     * Summary: 社会安全风险.
     *
     * @param QuerySocialriskDetailRequest $request
     *
     * @return QuerySocialriskDetailResponse
     */
    public function querySocialriskDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySocialriskDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 社会安全风险
     * Summary: 社会安全风险.
     *
     * @param QuerySocialriskDetailRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QuerySocialriskDetailResponse
     */
    public function querySocialriskDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySocialriskDetailResponse::fromMap($this->doRequest('1.0', 'di.realperson.socialrisk.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 运营商在网状态查询
     * Summary: 运营商在网状态查询.
     *
     * @param QueryCarrierNetstatusRequest $request
     *
     * @return QueryCarrierNetstatusResponse
     */
    public function queryCarrierNetstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCarrierNetstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 运营商在网状态查询
     * Summary: 运营商在网状态查询.
     *
     * @param QueryCarrierNetstatusRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryCarrierNetstatusResponse
     */
    public function queryCarrierNetstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCarrierNetstatusResponse::fromMap($this->doRequest('1.0', 'di.realperson.carrier.netstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 社会安全风险（简版）
     * Summary: 社会安全风险（简版）.
     *
     * @param QuerySocialriskBriefRequest $request
     *
     * @return QuerySocialriskBriefResponse
     */
    public function querySocialriskBrief($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySocialriskBriefEx($request, $headers, $runtime);
    }

    /**
     * Description: 社会安全风险（简版）
     * Summary: 社会安全风险（简版）.
     *
     * @param QuerySocialriskBriefRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QuerySocialriskBriefResponse
     */
    public function querySocialriskBriefEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySocialriskBriefResponse::fromMap($this->doRequest('1.0', 'di.realperson.socialrisk.brief.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 社会安全风险（tob风控版）
     * Summary: 社会安全风险（tob风控版）.
     *
     * @param QuerySocialriskTobriskRequest $request
     *
     * @return QuerySocialriskTobriskResponse
     */
    public function querySocialriskTobrisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySocialriskTobriskEx($request, $headers, $runtime);
    }

    /**
     * Description: 社会安全风险（tob风控版）
     * Summary: 社会安全风险（tob风控版）.
     *
     * @param QuerySocialriskTobriskRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QuerySocialriskTobriskResponse
     */
    public function querySocialriskTobriskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySocialriskTobriskResponse::fromMap($this->doRequest('1.0', 'di.realperson.socialrisk.tobrisk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对V2版本.
     *
     * @param ExecFacevrfServermodeRequest $request
     *
     * @return ExecFacevrfServermodeResponse
     */
    public function execFacevrfServermode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execFacevrfServermodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对V2版本.
     *
     * @param ExecFacevrfServermodeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ExecFacevrfServermodeResponse
     */
    public function execFacevrfServermodeEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'di.realperson.facevrf.servermode.exec',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ExecFacevrfServermodeResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return ExecFacevrfServermodeResponse::fromMap($this->doRequest('1.0', 'di.realperson.facevrf.servermode.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行活跃度
     * Summary: 银行活跃度.
     *
     * @param QueryBankLivenessRequest $request
     *
     * @return QueryBankLivenessResponse
     */
    public function queryBankLiveness($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBankLivenessEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行活跃度
     * Summary: 银行活跃度.
     *
     * @param QueryBankLivenessRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryBankLivenessResponse
     */
    public function queryBankLivenessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBankLivenessResponse::fromMap($this->doRequest('1.0', 'di.realperson.bank.liveness.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于阿里云渠道小程序域名的绑定
     * Summary: 新增场景与域名映射.
     *
     * @param CreateConsoleDomainRequest $request
     *
     * @return CreateConsoleDomainResponse
     */
    public function createConsoleDomain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsoleDomainEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于阿里云渠道小程序域名的绑定
     * Summary: 新增场景与域名映射.
     *
     * @param CreateConsoleDomainRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateConsoleDomainResponse
     */
    public function createConsoleDomainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsoleDomainResponse::fromMap($this->doRequest('1.0', 'di.realperson.console.domain.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云控制台删除场景与域名映射
     * Summary: 删除场景与域名映射.
     *
     * @param DeleteConsoleDomainRequest $request
     *
     * @return DeleteConsoleDomainResponse
     */
    public function deleteConsoleDomain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteConsoleDomainEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云控制台删除场景与域名映射
     * Summary: 删除场景与域名映射.
     *
     * @param DeleteConsoleDomainRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteConsoleDomainResponse
     */
    public function deleteConsoleDomainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteConsoleDomainResponse::fromMap($this->doRequest('1.0', 'di.realperson.console.domain.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 失联修复初始化
     * Summary: 失联修复初始化.
     *
     * @param InitCarrierRepairmobileRequest $request
     *
     * @return InitCarrierRepairmobileResponse
     */
    public function initCarrierRepairmobile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initCarrierRepairmobileEx($request, $headers, $runtime);
    }

    /**
     * Description: 失联修复初始化
     * Summary: 失联修复初始化.
     *
     * @param InitCarrierRepairmobileRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return InitCarrierRepairmobileResponse
     */
    public function initCarrierRepairmobileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitCarrierRepairmobileResponse::fromMap($this->doRequest('1.0', 'di.realperson.carrier.repairmobile.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 失联修复查询修复结果
     * Summary: 失联修复查询修复结果.
     *
     * @param QueryCarrierRepairmobileRequest $request
     *
     * @return QueryCarrierRepairmobileResponse
     */
    public function queryCarrierRepairmobile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCarrierRepairmobileEx($request, $headers, $runtime);
    }

    /**
     * Description: 失联修复查询修复结果
     * Summary: 失联修复查询修复结果.
     *
     * @param QueryCarrierRepairmobileRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryCarrierRepairmobileResponse
     */
    public function queryCarrierRepairmobileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCarrierRepairmobileResponse::fromMap($this->doRequest('1.0', 'di.realperson.carrier.repairmobile.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 失联修复小号绑定
     * Summary: 失联修复小号绑定.
     *
     * @param BindCarrierRepairmobileRequest $request
     *
     * @return BindCarrierRepairmobileResponse
     */
    public function bindCarrierRepairmobile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindCarrierRepairmobileEx($request, $headers, $runtime);
    }

    /**
     * Description: 失联修复小号绑定
     * Summary: 失联修复小号绑定.
     *
     * @param BindCarrierRepairmobileRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return BindCarrierRepairmobileResponse
     */
    public function bindCarrierRepairmobileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindCarrierRepairmobileResponse::fromMap($this->doRequest('1.0', 'di.realperson.carrier.repairmobile.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部机构数据上报
     * Summary: 外部机构数据上报.
     *
     * @param ApplyExtOrgdataRequest $request
     *
     * @return ApplyExtOrgdataResponse
     */
    public function applyExtOrgdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyExtOrgdataEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部机构数据上报
     * Summary: 外部机构数据上报.
     *
     * @param ApplyExtOrgdataRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ApplyExtOrgdataResponse
     */
    public function applyExtOrgdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyExtOrgdataResponse::fromMap($this->doRequest('1.0', 'di.realperson.ext.orgdata.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数科刷脸服务端初始化接口
     * Summary: 数科刷脸服务端初始化接口.
     *
     * @param CreateFaceverifyServerRequest $request
     *
     * @return CreateFaceverifyServerResponse
     */
    public function createFaceverifyServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFaceverifyServerEx($request, $headers, $runtime);
    }

    /**
     * Description: 数科刷脸服务端初始化接口
     * Summary: 数科刷脸服务端初始化接口.
     *
     * @param CreateFaceverifyServerRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateFaceverifyServerResponse
     */
    public function createFaceverifyServerEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'di.realperson.faceverify.server.create',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new CreateFaceverifyServerResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return CreateFaceverifyServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.faceverify.server.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询.
     *
     * @param QueryFaceverifyServerRequest $request
     *
     * @return QueryFaceverifyServerResponse
     */
    public function queryFaceverifyServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceverifyServerEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 认证查询.
     *
     * @param QueryFaceverifyServerRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryFaceverifyServerResponse
     */
    public function queryFaceverifyServerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceverifyServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.faceverify.server.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人银行卡状态增强版
     * Summary: 个人银行卡状态增强版.
     *
     * @param QueryBankLivenessplusRequest $request
     *
     * @return QueryBankLivenessplusResponse
     */
    public function queryBankLivenessplus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBankLivenessplusEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人银行卡状态增强版
     * Summary: 个人银行卡状态增强版.
     *
     * @param QueryBankLivenessplusRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryBankLivenessplusResponse
     */
    public function queryBankLivenessplusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBankLivenessplusResponse::fromMap($this->doRequest('1.0', 'di.realperson.bank.livenessplus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对基础版.
     *
     * @param ExecFaceverifyServermodeRequest $request
     *
     * @return ExecFaceverifyServermodeResponse
     */
    public function execFaceverifyServermode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execFaceverifyServermodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
     * Summary: 纯服务端比对基础版.
     *
     * @param ExecFaceverifyServermodeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ExecFaceverifyServermodeResponse
     */
    public function execFaceverifyServermodeEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'di.realperson.faceverify.servermode.exec',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ExecFaceverifyServermodeResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return ExecFaceverifyServermodeResponse::fromMap($this->doRequest('1.0', 'di.realperson.faceverify.servermode.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付宝实人认证初始化接口
     * Summary: 支付宝实人认证初始化接口.
     *
     * @param CreateAlipayverifyServerRequest $request
     *
     * @return CreateAlipayverifyServerResponse
     */
    public function createAlipayverifyServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAlipayverifyServerEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付宝实人认证初始化接口
     * Summary: 支付宝实人认证初始化接口.
     *
     * @param CreateAlipayverifyServerRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateAlipayverifyServerResponse
     */
    public function createAlipayverifyServerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAlipayverifyServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.alipayverify.server.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付宝实人认证查询接口
     * Summary: 支付宝实人认证查询接口.
     *
     * @param QueryAlipayverifyServerRequest $request
     *
     * @return QueryAlipayverifyServerResponse
     */
    public function queryAlipayverifyServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlipayverifyServerEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付宝实人认证查询接口
     * Summary: 支付宝实人认证查询接口.
     *
     * @param QueryAlipayverifyServerRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryAlipayverifyServerResponse
     */
    public function queryAlipayverifyServerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlipayverifyServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.alipayverify.server.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 车辆资产验证
     * Summary: 车辆资产验证
     *
     * @param CheckCarTwometaRequest $request
     *
     * @return CheckCarTwometaResponse
     */
    public function checkCarTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkCarTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 车辆资产验证
     * Summary: 车辆资产验证
     *
     * @param CheckCarTwometaRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CheckCarTwometaResponse
     */
    public function checkCarTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckCarTwometaResponse::fromMap($this->doRequest('1.0', 'di.realperson.car.twometa.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 学历验证
     * Summary: 学历验证
     *
     * @param QueryEducationBackgroundRequest $request
     *
     * @return QueryEducationBackgroundResponse
     */
    public function queryEducationBackground($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEducationBackgroundEx($request, $headers, $runtime);
    }

    /**
     * Description: 学历验证
     * Summary: 学历验证
     *
     * @param QueryEducationBackgroundRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryEducationBackgroundResponse
     */
    public function queryEducationBackgroundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEducationBackgroundResponse::fromMap($this->doRequest('1.0', 'di.realperson.education.background.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人银行卡状态验证 V4.0
     * Summary: 个人银行卡状态验证 V4.0.
     *
     * @param QueryBankLivenessfourRequest $request
     *
     * @return QueryBankLivenessfourResponse
     */
    public function queryBankLivenessfour($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBankLivenessfourEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人银行卡状态验证 V4.0
     * Summary: 个人银行卡状态验证 V4.0.
     *
     * @param QueryBankLivenessfourRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryBankLivenessfourResponse
     */
    public function queryBankLivenessfourEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBankLivenessfourResponse::fromMap($this->doRequest('1.0', 'di.realperson.bank.livenessfour.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询认证的材料信息
     * Summary: 认证材料查询.
     *
     * @param QueryFaceverifyServermaterialRequest $request
     *
     * @return QueryFaceverifyServermaterialResponse
     */
    public function queryFaceverifyServermaterial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceverifyServermaterialEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询认证的材料信息
     * Summary: 认证材料查询.
     *
     * @param QueryFaceverifyServermaterialRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryFaceverifyServermaterialResponse
     */
    public function queryFaceverifyServermaterialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceverifyServermaterialResponse::fromMap($this->doRequest('1.0', 'di.realperson.faceverify.servermaterial.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 图片压缩接口
     * Summary: 图片压缩接口.
     *
     * @param ScaleinImageRequest $request
     *
     * @return ScaleinImageResponse
     */
    public function scaleinImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->scaleinImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 图片压缩接口
     * Summary: 图片压缩接口.
     *
     * @param ScaleinImageRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ScaleinImageResponse
     */
    public function scaleinImageEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'di.realperson.image.scalein',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ScaleinImageResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return ScaleinImageResponse::fromMap($this->doRequest('1.0', 'di.realperson.image.scalein', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 要素卡证OCR
     * Summary: 要素卡证OCR.
     *
     * @param RecognizeOcrIndividualcardRequest $request
     *
     * @return RecognizeOcrIndividualcardResponse
     */
    public function recognizeOcrIndividualcard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeOcrIndividualcardEx($request, $headers, $runtime);
    }

    /**
     * Description: 要素卡证OCR
     * Summary: 要素卡证OCR.
     *
     * @param RecognizeOcrIndividualcardRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return RecognizeOcrIndividualcardResponse
     */
    public function recognizeOcrIndividualcardEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'di.realperson.ocr.individualcard.recognize',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new RecognizeOcrIndividualcardResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return RecognizeOcrIndividualcardResponse::fromMap($this->doRequest('1.0', 'di.realperson.ocr.individualcard.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人四要素认证
     * Summary: 个人四要素认证
     *
     * @param CheckIdcardFourmetaRequest $request
     *
     * @return CheckIdcardFourmetaResponse
     */
    public function checkIdcardFourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkIdcardFourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人四要素认证
     * Summary: 个人四要素认证
     *
     * @param CheckIdcardFourmetaRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CheckIdcardFourmetaResponse
     */
    public function checkIdcardFourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckIdcardFourmetaResponse::fromMap($this->doRequest('1.0', 'di.realperson.idcard.fourmeta.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 车辆资产验证详版
     * Summary: 车辆资产验证详版.
     *
     * @param QueryCarinfoDetailRequest $request
     *
     * @return QueryCarinfoDetailResponse
     */
    public function queryCarinfoDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCarinfoDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 车辆资产验证详版
     * Summary: 车辆资产验证详版.
     *
     * @param QueryCarinfoDetailRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryCarinfoDetailResponse
     */
    public function queryCarinfoDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCarinfoDetailResponse::fromMap($this->doRequest('1.0', 'di.realperson.carinfo.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 车辆资产验证简版
     * Summary: 车辆资产验证简版.
     *
     * @param QueryCarinfoBriefRequest $request
     *
     * @return QueryCarinfoBriefResponse
     */
    public function queryCarinfoBrief($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCarinfoBriefEx($request, $headers, $runtime);
    }

    /**
     * Description: 车辆资产验证简版
     * Summary: 车辆资产验证简版.
     *
     * @param QueryCarinfoBriefRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryCarinfoBriefResponse
     */
    public function queryCarinfoBriefEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCarinfoBriefResponse::fromMap($this->doRequest('1.0', 'di.realperson.carinfo.brief.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣预绑定
     * Summary: 银行卡代扣预绑定.
     *
     * @param BindCutpaymentPreRequest $request
     *
     * @return BindCutpaymentPreResponse
     */
    public function bindCutpaymentPre($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindCutpaymentPreEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣预绑定
     * Summary: 银行卡代扣预绑定.
     *
     * @param BindCutpaymentPreRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return BindCutpaymentPreResponse
     */
    public function bindCutpaymentPreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindCutpaymentPreResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpayment.pre.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣绑卡签约
     * Summary: 银行卡代扣绑卡签约.
     *
     * @param BindCutpaymentSignRequest $request
     *
     * @return BindCutpaymentSignResponse
     */
    public function bindCutpaymentSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindCutpaymentSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣绑卡签约
     * Summary: 银行卡代扣绑卡签约.
     *
     * @param BindCutpaymentSignRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return BindCutpaymentSignResponse
     */
    public function bindCutpaymentSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindCutpaymentSignResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpayment.sign.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣解绑
     * Summary: 银行卡代扣解绑.
     *
     * @param UnbindCutpaymentSignRequest $request
     *
     * @return UnbindCutpaymentSignResponse
     */
    public function unbindCutpaymentSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindCutpaymentSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣解绑
     * Summary: 银行卡代扣解绑.
     *
     * @param UnbindCutpaymentSignRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UnbindCutpaymentSignResponse
     */
    public function unbindCutpaymentSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindCutpaymentSignResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpayment.sign.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣绑定结果查询
     * Summary: 银行卡代扣绑定结果查询.
     *
     * @param QueryCutpaymentBindRequest $request
     *
     * @return QueryCutpaymentBindResponse
     */
    public function queryCutpaymentBind($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCutpaymentBindEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣绑定结果查询
     * Summary: 银行卡代扣绑定结果查询.
     *
     * @param QueryCutpaymentBindRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryCutpaymentBindResponse
     */
    public function queryCutpaymentBindEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCutpaymentBindResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpayment.bind.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣支付分账扣款
     * Summary: 银行卡代扣支付分账扣款.
     *
     * @param ApplyCutpaymentPaymentRequest $request
     *
     * @return ApplyCutpaymentPaymentResponse
     */
    public function applyCutpaymentPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyCutpaymentPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣支付分账扣款
     * Summary: 银行卡代扣支付分账扣款.
     *
     * @param ApplyCutpaymentPaymentRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ApplyCutpaymentPaymentResponse
     */
    public function applyCutpaymentPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyCutpaymentPaymentResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpayment.payment.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣支付分账查询
     * Summary: 银行卡代扣支付分账查询.
     *
     * @param QueryCutpaymentPaymentRequest $request
     *
     * @return QueryCutpaymentPaymentResponse
     */
    public function queryCutpaymentPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCutpaymentPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣支付分账查询
     * Summary: 银行卡代扣支付分账查询.
     *
     * @param QueryCutpaymentPaymentRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryCutpaymentPaymentResponse
     */
    public function queryCutpaymentPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCutpaymentPaymentResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpayment.payment.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣退款申请
     * Summary: 银行卡代扣退款申请.
     *
     * @param ApplyCutpaymentRefundRequest $request
     *
     * @return ApplyCutpaymentRefundResponse
     */
    public function applyCutpaymentRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyCutpaymentRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣退款申请
     * Summary: 银行卡代扣退款申请.
     *
     * @param ApplyCutpaymentRefundRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ApplyCutpaymentRefundResponse
     */
    public function applyCutpaymentRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyCutpaymentRefundResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpayment.refund.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣退款查询
     * Summary: 银行卡代扣退款查询.
     *
     * @param QueryCutpaymentRefundRequest $request
     *
     * @return QueryCutpaymentRefundResponse
     */
    public function queryCutpaymentRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCutpaymentRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣退款查询
     * Summary: 银行卡代扣退款查询.
     *
     * @param QueryCutpaymentRefundRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryCutpaymentRefundResponse
     */
    public function queryCutpaymentRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCutpaymentRefundResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpayment.refund.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣对账
     * Summary: 银行卡代扣对账.
     *
     * @param QueryCutpaymentStatementRequest $request
     *
     * @return QueryCutpaymentStatementResponse
     */
    public function queryCutpaymentStatement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCutpaymentStatementEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣对账
     * Summary: 银行卡代扣对账.
     *
     * @param QueryCutpaymentStatementRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryCutpaymentStatementResponse
     */
    public function queryCutpaymentStatementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCutpaymentStatementResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpayment.statement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 人像、证件号、姓名比对接口
     * Summary: 人像、证件号、姓名比对.
     *
     * @param ExecFaceThreemetaRequest $request
     *
     * @return ExecFaceThreemetaResponse
     */
    public function execFaceThreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execFaceThreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 人像、证件号、姓名比对接口
     * Summary: 人像、证件号、姓名比对.
     *
     * @param ExecFaceThreemetaRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExecFaceThreemetaResponse
     */
    public function execFaceThreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecFaceThreemetaResponse::fromMap($this->doRequest('1.0', 'di.realperson.face.threemeta.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户资产验证-车辆资产验证旗舰版
     * Summary: 用户资产验证-车辆资产验证旗舰版.
     *
     * @param QueryCarinfoUltimateRequest $request
     *
     * @return QueryCarinfoUltimateResponse
     */
    public function queryCarinfoUltimate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCarinfoUltimateEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户资产验证-车辆资产验证旗舰版
     * Summary: 用户资产验证-车辆资产验证旗舰版.
     *
     * @param QueryCarinfoUltimateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryCarinfoUltimateResponse
     */
    public function queryCarinfoUltimateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCarinfoUltimateResponse::fromMap($this->doRequest('1.0', 'di.realperson.carinfo.ultimate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户资产验证-车辆资产验证增强版
     * Summary: 用户资产验证-车辆资产验证增强版.
     *
     * @param QueryCarinfoPlusRequest $request
     *
     * @return QueryCarinfoPlusResponse
     */
    public function queryCarinfoPlus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCarinfoPlusEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户资产验证-车辆资产验证增强版
     * Summary: 用户资产验证-车辆资产验证增强版.
     *
     * @param QueryCarinfoPlusRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryCarinfoPlusResponse
     */
    public function queryCarinfoPlusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCarinfoPlusResponse::fromMap($this->doRequest('1.0', 'di.realperson.carinfo.plus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣二级租户开户
     * Summary: 银行卡代扣二级租户开户.
     *
     * @param OpenCutpaymentsubAccountRequest $request
     *
     * @return OpenCutpaymentsubAccountResponse
     */
    public function openCutpaymentsubAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openCutpaymentsubAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣二级租户开户
     * Summary: 银行卡代扣二级租户开户.
     *
     * @param OpenCutpaymentsubAccountRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return OpenCutpaymentsubAccountResponse
     */
    public function openCutpaymentsubAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenCutpaymentsubAccountResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpaymentsub.account.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣二级租户查询开户状态
     * Summary: 银行卡代扣二级租户查询开户状态
     *
     * @param QueryCutpaymentsubAccountRequest $request
     *
     * @return QueryCutpaymentsubAccountResponse
     */
    public function queryCutpaymentsubAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCutpaymentsubAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣二级租户查询开户状态
     * Summary: 银行卡代扣二级租户查询开户状态
     *
     * @param QueryCutpaymentsubAccountRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryCutpaymentsubAccountResponse
     */
    public function queryCutpaymentsubAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCutpaymentsubAccountResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpaymentsub.account.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣二级租户分账
     * Summary: 银行卡代扣二级租户分账.
     *
     * @param TransferCutpaymentsubRevenueRequest $request
     *
     * @return TransferCutpaymentsubRevenueResponse
     */
    public function transferCutpaymentsubRevenue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->transferCutpaymentsubRevenueEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣二级租户分账
     * Summary: 银行卡代扣二级租户分账.
     *
     * @param TransferCutpaymentsubRevenueRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return TransferCutpaymentsubRevenueResponse
     */
    public function transferCutpaymentsubRevenueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return TransferCutpaymentsubRevenueResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpaymentsub.revenue.transfer', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣二级租户查询分账
     * Summary: 银行卡代扣二级租户查询分账.
     *
     * @param QueryCutpaymentsubRevenueRequest $request
     *
     * @return QueryCutpaymentsubRevenueResponse
     */
    public function queryCutpaymentsubRevenue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCutpaymentsubRevenueEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣二级租户查询分账
     * Summary: 银行卡代扣二级租户查询分账.
     *
     * @param QueryCutpaymentsubRevenueRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryCutpaymentsubRevenueResponse
     */
    public function queryCutpaymentsubRevenueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCutpaymentsubRevenueResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpaymentsub.revenue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣二级租户提现
     * Summary: 银行卡代扣二级租户提现.
     *
     * @param CaptureCutpaymentsubWithdrawalRequest $request
     *
     * @return CaptureCutpaymentsubWithdrawalResponse
     */
    public function captureCutpaymentsubWithdrawal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->captureCutpaymentsubWithdrawalEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣二级租户提现
     * Summary: 银行卡代扣二级租户提现.
     *
     * @param CaptureCutpaymentsubWithdrawalRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CaptureCutpaymentsubWithdrawalResponse
     */
    public function captureCutpaymentsubWithdrawalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CaptureCutpaymentsubWithdrawalResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpaymentsub.withdrawal.capture', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣二级租户提现查询
     * Summary: 银行卡代扣二级租户提现查询.
     *
     * @param QueryCutpaymentsubWithdrawalRequest $request
     *
     * @return QueryCutpaymentsubWithdrawalResponse
     */
    public function queryCutpaymentsubWithdrawal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCutpaymentsubWithdrawalEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣二级租户提现查询
     * Summary: 银行卡代扣二级租户提现查询.
     *
     * @param QueryCutpaymentsubWithdrawalRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryCutpaymentsubWithdrawalResponse
     */
    public function queryCutpaymentsubWithdrawalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCutpaymentsubWithdrawalResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpaymentsub.withdrawal.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣二级租户查询余额
     * Summary: 银行卡代扣二级租户查询余额.
     *
     * @param QueryCutpaymentsubBalanceRequest $request
     *
     * @return QueryCutpaymentsubBalanceResponse
     */
    public function queryCutpaymentsubBalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCutpaymentsubBalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣二级租户查询余额
     * Summary: 银行卡代扣二级租户查询余额.
     *
     * @param QueryCutpaymentsubBalanceRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryCutpaymentsubBalanceResponse
     */
    public function queryCutpaymentsubBalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCutpaymentsubBalanceResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpaymentsub.balance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行卡代扣二级租户查询收支明细
     * Summary: 银行卡代扣二级租户查询收支明细.
     *
     * @param QueryCutpaymentsubTransactionRequest $request
     *
     * @return QueryCutpaymentsubTransactionResponse
     */
    public function queryCutpaymentsubTransaction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCutpaymentsubTransactionEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行卡代扣二级租户查询收支明细
     * Summary: 银行卡代扣二级租户查询收支明细.
     *
     * @param QueryCutpaymentsubTransactionRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryCutpaymentsubTransactionResponse
     */
    public function queryCutpaymentsubTransactionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCutpaymentsubTransactionResponse::fromMap($this->doRequest('1.0', 'di.realperson.cutpaymentsub.transaction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供私有化刷脸的风险咨询
     * Summary: 人脸风险咨询服务
     *
     * @param QueryRiskServerRequest $request
     *
     * @return QueryRiskServerResponse
     */
    public function queryRiskServer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRiskServerEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供私有化刷脸的风险咨询
     * Summary: 人脸风险咨询服务
     *
     * @param QueryRiskServerRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryRiskServerResponse
     */
    public function queryRiskServerEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'di.realperson.risk.server.query',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new QueryRiskServerResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return QueryRiskServerResponse::fromMap($this->doRequest('1.0', 'di.realperson.risk.server.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
