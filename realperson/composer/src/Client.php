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
use AntChain\REALPERSON\Models\CheckAnticheatPersonalRequest;
use AntChain\REALPERSON\Models\CheckAnticheatPersonalResponse;
use AntChain\REALPERSON\Models\CheckBankcardTwometaRequest;
use AntChain\REALPERSON\Models\CheckBankcardTwometaResponse;
use AntChain\REALPERSON\Models\CheckCarrierTwometaRequest;
use AntChain\REALPERSON\Models\CheckCarrierTwometaResponse;
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
use AntChain\REALPERSON\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\REALPERSON\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\REALPERSON\Models\CreateFacevrfServerRequest;
use AntChain\REALPERSON\Models\CreateFacevrfServerResponse;
use AntChain\REALPERSON\Models\CreateNfcServerRequest;
use AntChain\REALPERSON\Models\CreateNfcServerResponse;
use AntChain\REALPERSON\Models\CreateVoiceprintServermodeRequest;
use AntChain\REALPERSON\Models\CreateVoiceprintServermodeResponse;
use AntChain\REALPERSON\Models\DetailFacevrfServerRequest;
use AntChain\REALPERSON\Models\DetailFacevrfServerResponse;
use AntChain\REALPERSON\Models\ExecFacevrfServermodeRequest;
use AntChain\REALPERSON\Models\ExecFacevrfServermodeResponse;
use AntChain\REALPERSON\Models\ExecFacevrfServerRequest;
use AntChain\REALPERSON\Models\ExecFacevrfServerResponse;
use AntChain\REALPERSON\Models\GetFacevrfEvidenceRequest;
use AntChain\REALPERSON\Models\GetFacevrfEvidenceResponse;
use AntChain\REALPERSON\Models\InitFacevrfZimRequest;
use AntChain\REALPERSON\Models\InitFacevrfZimResponse;
use AntChain\REALPERSON\Models\QueryCarrierNetstatusRequest;
use AntChain\REALPERSON\Models\QueryCarrierNetstatusResponse;
use AntChain\REALPERSON\Models\QueryDeepsecRiskRequest;
use AntChain\REALPERSON\Models\QueryDeepsecRiskResponse;
use AntChain\REALPERSON\Models\QueryDeepsecTsbmrqRequest;
use AntChain\REALPERSON\Models\QueryDeepsecTsbmrqResponse;
use AntChain\REALPERSON\Models\QueryDemoInfoRequest;
use AntChain\REALPERSON\Models\QueryDemoInfoResponse;
use AntChain\REALPERSON\Models\QueryEducationInfoRequest;
use AntChain\REALPERSON\Models\QueryEducationInfoResponse;
use AntChain\REALPERSON\Models\QueryFacevrfServerRequest;
use AntChain\REALPERSON\Models\QueryFacevrfServerResponse;
use AntChain\REALPERSON\Models\QueryMobileRiskRequest;
use AntChain\REALPERSON\Models\QueryMobileRiskResponse;
use AntChain\REALPERSON\Models\QueryNfcServerRequest;
use AntChain\REALPERSON\Models\QueryNfcServerResponse;
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
            // 音频元数据
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
                    'sdk_version'      => '1.15.27',
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
