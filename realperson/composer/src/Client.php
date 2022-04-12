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
use AntChain\REALPERSON\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\REALPERSON\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\REALPERSON\Models\CreateFacevrfServerRequest;
use AntChain\REALPERSON\Models\CreateFacevrfServerResponse;
use AntChain\REALPERSON\Models\CreateVoiceprintServermodeRequest;
use AntChain\REALPERSON\Models\CreateVoiceprintServermodeResponse;
use AntChain\REALPERSON\Models\DetailFacevrfServerRequest;
use AntChain\REALPERSON\Models\DetailFacevrfServerResponse;
use AntChain\REALPERSON\Models\ExecFacevrfServerRequest;
use AntChain\REALPERSON\Models\ExecFacevrfServerResponse;
use AntChain\REALPERSON\Models\GetFacevrfEvidenceRequest;
use AntChain\REALPERSON\Models\GetFacevrfEvidenceResponse;
use AntChain\REALPERSON\Models\QueryFacevrfServerRequest;
use AntChain\REALPERSON\Models\QueryFacevrfServerResponse;
use AntChain\REALPERSON\Models\QueryMobileRiskRequest;
use AntChain\REALPERSON\Models\QueryMobileRiskResponse;
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
                    'sdk_version'      => '1.6.4',
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
            $request->fileId = $uploadResp->fileId;
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
