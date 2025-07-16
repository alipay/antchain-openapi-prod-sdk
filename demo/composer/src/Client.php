<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DEMO\Models\BindAaaBbbCccRequest;
use AntChain\DEMO\Models\BindAaaBbbCccResponse;
use AntChain\DEMO\Models\BindAaaBbbCcdRequest;
use AntChain\DEMO\Models\BindAaaBbbCcdResponse;
use AntChain\DEMO\Models\CheckAicoguardcoreAicoguardrailsQuestionRequest;
use AntChain\DEMO\Models\CheckAicoguardcoreAicoguardrailsQuestionResponse;
use AntChain\DEMO\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\DEMO\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\DEMO\Models\EchoGatewayCheckRequest;
use AntChain\DEMO\Models\EchoGatewayCheckResponse;
use AntChain\DEMO\Models\ExecGatewayRoadRequest;
use AntChain\DEMO\Models\ExecGatewayRoadResponse;
use AntChain\DEMO\Models\InitGatewayRoadRequest;
use AntChain\DEMO\Models\InitGatewayRoadResponse;
use AntChain\DEMO\Models\MatchBusinessAndInstanceRequest;
use AntChain\DEMO\Models\MatchBusinessAndInstanceResponse;
use AntChain\DEMO\Models\QueryAaaBbbCccRequest;
use AntChain\DEMO\Models\QueryAaaBbbCccResponse;
use AntChain\DEMO\Models\QueryAasSaSaRequest;
use AntChain\DEMO\Models\QueryAasSaSaResponse;
use AntChain\DEMO\Models\QueryAbcAbcAbcRequest;
use AntChain\DEMO\Models\QueryAbcAbcAbcResponse;
use AntChain\DEMO\Models\QueryABCRequest;
use AntChain\DEMO\Models\QueryABCResponse;
use AntChain\DEMO\Models\QueryAdAsdAsdRequest;
use AntChain\DEMO\Models\QueryAdAsdAsdResponse;
use AntChain\DEMO\Models\QueryAgentFinancialRiskRequest;
use AntChain\DEMO\Models\QueryAgentFinancialRiskResponse;
use AntChain\DEMO\Models\QueryApiBlackListRequest;
use AntChain\DEMO\Models\QueryApiBlackListResponse;
use AntChain\DEMO\Models\QueryApiWhiteListRequest;
use AntChain\DEMO\Models\QueryApiWhiteListResponse;
use AntChain\DEMO\Models\QueryGatewayCheckEchotenRequest;
use AntChain\DEMO\Models\QueryGatewayCheckEchotenResponse;
use AntChain\DEMO\Models\QueryGatewayCheckEchotimeoutokRequest;
use AntChain\DEMO\Models\QueryGatewayCheckEchotimeoutokResponse;
use AntChain\DEMO\Models\QueryGatewayCheckEchotimeoutRequest;
use AntChain\DEMO\Models\QueryGatewayCheckEchotimeoutResponse;
use AntChain\DEMO\Models\QueryGatewayEmbedRequest;
use AntChain\DEMO\Models\QueryGatewayEmbedResponse;
use AntChain\DEMO\Models\QueryGatewayMyRequest;
use AntChain\DEMO\Models\QueryGatewayMyResponse;
use AntChain\DEMO\Models\QueryGatewayRoadRequest;
use AntChain\DEMO\Models\QueryGatewayRoadResponse;
use AntChain\DEMO\Models\QueryInstanceidRuleRequest;
use AntChain\DEMO\Models\QueryInstanceidRuleResponse;
use AntChain\DEMO\Models\QueryIpBlackListRequest;
use AntChain\DEMO\Models\QueryIpBlackListResponse;
use AntChain\DEMO\Models\QueryIpRetryRequest;
use AntChain\DEMO\Models\QueryIpRetryResponse;
use AntChain\DEMO\Models\QueryIpWhiteListRequest;
use AntChain\DEMO\Models\QueryIpWhiteListResponse;
use AntChain\DEMO\Models\QueryLoadtestTimeFiveRequest;
use AntChain\DEMO\Models\QueryLoadtestTimeFiveResponse;
use AntChain\DEMO\Models\QueryLoadtestTimeFourRequest;
use AntChain\DEMO\Models\QueryLoadtestTimeFourResponse;
use AntChain\DEMO\Models\QueryLoadtestTimeOneRequest;
use AntChain\DEMO\Models\QueryLoadtestTimeOneResponse;
use AntChain\DEMO\Models\QueryLoadtestTimeThreeRequest;
use AntChain\DEMO\Models\QueryLoadtestTimeThreeResponse;
use AntChain\DEMO\Models\QueryLoadtestTimeTwoRequest;
use AntChain\DEMO\Models\QueryLoadtestTimeTwoResponse;
use AntChain\DEMO\Models\QueryOasRestRequest;
use AntChain\DEMO\Models\QueryOasRestResponse;
use AntChain\DEMO\Models\QueryStreamNonjsonRequest;
use AntChain\DEMO\Models\QueryStreamNonjsonResponse;
use AntChain\DEMO\Models\QueryStreamNonstreamRequest;
use AntChain\DEMO\Models\QueryStreamNonstreamResponse;
use AntChain\DEMO\Models\QueryStreamSpecialCharactersRequest;
use AntChain\DEMO\Models\QueryStreamSpecialCharactersResponse;
use AntChain\DEMO\Models\QueryStreamTestmethodRequest;
use AntChain\DEMO\Models\QueryStreamTestmethodResponse;
use AntChain\DEMO\Models\QueryStreamTestRequest;
use AntChain\DEMO\Models\QueryStreamTestResponse;
use AntChain\DEMO\Models\QueryStreamTimeoutRequest;
use AntChain\DEMO\Models\QueryStreamTimeoutResponse;
use AntChain\DEMO\Models\QueryTestCatcheLimitRequest;
use AntChain\DEMO\Models\QueryTestCatcheLimitResponse;
use AntChain\DEMO\Models\QueryTestContentTypefiveRequest;
use AntChain\DEMO\Models\QueryTestContentTypefiveResponse;
use AntChain\DEMO\Models\QueryTestContentTypefourRequest;
use AntChain\DEMO\Models\QueryTestContentTypefourResponse;
use AntChain\DEMO\Models\QueryTestContentTypeoneRequest;
use AntChain\DEMO\Models\QueryTestContentTypeoneResponse;
use AntChain\DEMO\Models\QueryTestContentTypeRequest;
use AntChain\DEMO\Models\QueryTestContentTypeResponse;
use AntChain\DEMO\Models\QueryTestContentTypethreeRequest;
use AntChain\DEMO\Models\QueryTestContentTypethreeResponse;
use AntChain\DEMO\Models\QueryTestContentTypetwoRequest;
use AntChain\DEMO\Models\QueryTestContentTypetwoResponse;
use AntChain\DEMO\Models\QueryTestEmbedUserRequest;
use AntChain\DEMO\Models\QueryTestEmbedUserResponse;
use AntChain\DEMO\Models\QueryTestForLimitRequest;
use AntChain\DEMO\Models\QueryTestForLimitResponse;
use AntChain\DEMO\Models\QueryTestTestTestRequest;
use AntChain\DEMO\Models\QueryTestTestTestResponse;
use AntChain\DEMO\Models\QueryTestTimeMenhuRequest;
use AntChain\DEMO\Models\QueryTestTimeMenhuResponse;
use AntChain\DEMO\Models\QueryTestTimeTestaRequest;
use AntChain\DEMO\Models\QueryTestTimeTestaResponse;
use AntChain\DEMO\Models\StatusGatewayCheckRequest;
use AntChain\DEMO\Models\StatusGatewayCheckResponse;
use AntChain\DEMO\Models\UpdateGatewayRoadRequest;
use AntChain\DEMO\Models\UpdateGatewayRoadResponse;
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
            // host
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
                    'sdk_version'      => '1.1.51',
                    '_prod_code'       => 'DEMO',
                    '_prod_channel'    => 'undefined',
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query['security_token'] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    'host'       => Utils::defaultString($this->_endpoint, 'centre-openapi.antchain.antgroup.com'),
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
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     *
     * @param StatusGatewayCheckRequest $request
     *
     * @return StatusGatewayCheckResponse
     */
    public function statusGatewayCheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->statusGatewayCheckEx($request, $headers, $runtime);
    }

    /**
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     *
     * @param StatusGatewayCheckRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return StatusGatewayCheckResponse
     */
    public function statusGatewayCheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StatusGatewayCheckResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.status', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Demo接口，返回当前输入的值
     * Summary: 返回输入值1.
     *
     * @param EchoGatewayCheckRequest $request
     *
     * @return EchoGatewayCheckResponse
     */
    public function echoGatewayCheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->echoGatewayCheckEx($request, $headers, $runtime);
    }

    /**
     * Description: Demo接口，返回当前输入的值
     * Summary: 返回输入值1.
     *
     * @param EchoGatewayCheckRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return EchoGatewayCheckResponse
     */
    public function echoGatewayCheckEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'demo.gateway.check.echo',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'OK')) {
                return new EchoGatewayCheckResponse([
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

        return EchoGatewayCheckResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.echo', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aaa
     * Summary: 测试demo.
     *
     * @param QueryGatewayMyRequest $request
     *
     * @return QueryGatewayMyResponse
     */
    public function queryGatewayMy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayMyEx($request, $headers, $runtime);
    }

    /**
     * Description: aaa
     * Summary: 测试demo.
     *
     * @param QueryGatewayMyRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryGatewayMyResponse
     */
    public function queryGatewayMyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayMyResponse::fromMap($this->doRequest('1.0', 'demo.gateway.my.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 超时测试
     * Summary: 超时.
     *
     * @param QueryGatewayCheckEchotimeoutRequest $request
     *
     * @return QueryGatewayCheckEchotimeoutResponse
     */
    public function queryGatewayCheckEchotimeout($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayCheckEchotimeoutEx($request, $headers, $runtime);
    }

    /**
     * Description: 超时测试
     * Summary: 超时.
     *
     * @param QueryGatewayCheckEchotimeoutRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryGatewayCheckEchotimeoutResponse
     */
    public function queryGatewayCheckEchotimeoutEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayCheckEchotimeoutResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.echotimeout.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s.
     *
     * @param QueryGatewayCheckEchotenRequest $request
     *
     * @return QueryGatewayCheckEchotenResponse
     */
    public function queryGatewayCheckEchoten($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayCheckEchotenEx($request, $headers, $runtime);
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s.
     *
     * @param QueryGatewayCheckEchotenRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryGatewayCheckEchotenResponse
     */
    public function queryGatewayCheckEchotenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayCheckEchotenResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.echoten.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 简介简介简介s
     * Summary: 简介简介.
     *
     * @param QueryAdAsdAsdRequest $request
     *
     * @return QueryAdAsdAsdResponse
     */
    public function queryAdAsdAsd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAdAsdAsdEx($request, $headers, $runtime);
    }

    /**
     * Description: 简介简介简介s
     * Summary: 简介简介.
     *
     * @param QueryAdAsdAsdRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryAdAsdAsdResponse
     */
    public function queryAdAsdAsdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAdAsdAsdResponse::fromMap($this->doRequest('1.0', 'demo.ad.asd.asd.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）.
     *
     * @param InitGatewayRoadRequest $request
     *
     * @return InitGatewayRoadResponse
     */
    public function initGatewayRoad($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initGatewayRoadEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）.
     *
     * @param InitGatewayRoadRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return InitGatewayRoadResponse
     */
    public function initGatewayRoadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitGatewayRoadResponse::fromMap($this->doRequest('1.0', 'demo.gateway.road.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 近端网关测试接口
     * Summary: 近端网关测试接口（勿删）.
     *
     * @param QueryGatewayEmbedRequest $request
     *
     * @return QueryGatewayEmbedResponse
     */
    public function queryGatewayEmbed($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayEmbedEx($request, $headers, $runtime);
    }

    /**
     * Description: 近端网关测试接口
     * Summary: 近端网关测试接口（勿删）.
     *
     * @param QueryGatewayEmbedRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryGatewayEmbedResponse
     */
    public function queryGatewayEmbedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayEmbedResponse::fromMap($this->doRequest('1.0', 'demo.gateway.embed.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新入参后返回结果，Fr 自动化连通性测试。
     * Summary: road.upd（Fr AutoT）.
     *
     * @param UpdateGatewayRoadRequest $request
     *
     * @return UpdateGatewayRoadResponse
     */
    public function updateGatewayRoad($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGatewayRoadEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新入参后返回结果，Fr 自动化连通性测试。
     * Summary: road.upd（Fr AutoT）.
     *
     * @param UpdateGatewayRoadRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateGatewayRoadResponse
     */
    public function updateGatewayRoadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGatewayRoadResponse::fromMap($this->doRequest('1.0', 'demo.gateway.road.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询并返回结果，Fr 自动化连通性测试。
     * Summary: road.query（Fr AutoT）.
     *
     * @param QueryGatewayRoadRequest $request
     *
     * @return QueryGatewayRoadResponse
     */
    public function queryGatewayRoad($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayRoadEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询并返回结果，Fr 自动化连通性测试。
     * Summary: road.query（Fr AutoT）.
     *
     * @param QueryGatewayRoadRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryGatewayRoadResponse
     */
    public function queryGatewayRoadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayRoadResponse::fromMap($this->doRequest('1.0', 'demo.gateway.road.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 执行计算后返回，Fr 自动化连通性测试。
     * Summary: road.exec（Fr AutoT）.
     *
     * @param ExecGatewayRoadRequest $request
     *
     * @return ExecGatewayRoadResponse
     */
    public function execGatewayRoad($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execGatewayRoadEx($request, $headers, $runtime);
    }

    /**
     * Description: 执行计算后返回，Fr 自动化连通性测试。
     * Summary: road.exec（Fr AutoT）.
     *
     * @param ExecGatewayRoadRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecGatewayRoadResponse
     */
    public function execGatewayRoadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecGatewayRoadResponse::fromMap($this->doRequest('1.0', 'demo.gateway.road.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口3
     * Summary: 压测接口3.
     *
     * @param QueryLoadtestTimeThreeRequest $request
     *
     * @return QueryLoadtestTimeThreeResponse
     */
    public function queryLoadtestTimeThree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadtestTimeThreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口3
     * Summary: 压测接口3.
     *
     * @param QueryLoadtestTimeThreeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryLoadtestTimeThreeResponse
     */
    public function queryLoadtestTimeThreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadtestTimeThreeResponse::fromMap($this->doRequest('1.0', 'demo.loadtest.time.three.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: 自动化测试工程使用，勿删勿改.
     *
     * @param QueryInstanceidRuleRequest $request
     *
     * @return QueryInstanceidRuleResponse
     */
    public function queryInstanceidRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInstanceidRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: 自动化测试工程使用，勿删勿改.
     *
     * @param QueryInstanceidRuleRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryInstanceidRuleResponse
     */
    public function queryInstanceidRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInstanceidRuleResponse::fromMap($this->doRequest('1.0', 'demo.instanceid.rule.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置下游耗时
     * Summary: 超时（加密）.
     *
     * @param QueryGatewayCheckEchotimeoutokRequest $request
     *
     * @return QueryGatewayCheckEchotimeoutokResponse
     */
    public function queryGatewayCheckEchotimeoutok($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayCheckEchotimeoutokEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置下游耗时
     * Summary: 超时（加密）.
     *
     * @param QueryGatewayCheckEchotimeoutokRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryGatewayCheckEchotimeoutokResponse
     */
    public function queryGatewayCheckEchotimeoutokEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayCheckEchotimeoutokResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.echotimeoutok.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 双百&门户&网关，停服决策测试使用
     * Summary: 商业化规则测试.
     *
     * @param MatchBusinessAndInstanceRequest $request
     *
     * @return MatchBusinessAndInstanceResponse
     */
    public function matchBusinessAndInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->matchBusinessAndInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 双百&门户&网关，停服决策测试使用
     * Summary: 商业化规则测试.
     *
     * @param MatchBusinessAndInstanceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return MatchBusinessAndInstanceResponse
     */
    public function matchBusinessAndInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MatchBusinessAndInstanceResponse::fromMap($this->doRequest('1.0', 'demo.business.and.instance.match', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流失查询测试
     * Summary: 流失查询测试.
     *
     * @param QueryStreamTestRequest $request
     *
     * @return QueryStreamTestResponse
     */
    public function queryStreamTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStreamTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 流失查询测试
     * Summary: 流失查询测试.
     *
     * @param QueryStreamTestRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryStreamTestResponse
     */
    public function queryStreamTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStreamTestResponse::fromMap($this->doRequest('1.0', 'demo.stream.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 网关性能优化测试
     * Summary: 性能优化测试.
     *
     * @param QueryTestCatcheLimitRequest $request
     *
     * @return QueryTestCatcheLimitResponse
     */
    public function queryTestCatcheLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestCatcheLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 网关性能优化测试
     * Summary: 性能优化测试.
     *
     * @param QueryTestCatcheLimitRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTestCatcheLimitResponse
     */
    public function queryTestCatcheLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestCatcheLimitResponse::fromMap($this->doRequest('1.0', 'demo.test.catche.limit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用.
     *
     * @param QueryTestForLimitRequest $request
     *
     * @return QueryTestForLimitResponse
     */
    public function queryTestForLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestForLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用.
     *
     * @param QueryTestForLimitRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryTestForLimitResponse
     */
    public function queryTestForLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestForLimitResponse::fromMap($this->doRequest('1.0', 'demo.test.for.limit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryTestTestTestRequest $request
     *
     * @return QueryTestTestTestResponse
     */
    public function queryTestTestTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestTestTestEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryTestTestTestRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryTestTestTestResponse
     */
    public function queryTestTestTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestTestTestResponse::fromMap($this->doRequest('1.0', 'demo.test.test.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: a
     * Summary: abcde.
     *
     * @param QueryABCRequest $request
     *
     * @return QueryABCResponse
     */
    public function queryABC($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryABCEx($request, $headers, $runtime);
    }

    /**
     * Description: a
     * Summary: abcde.
     *
     * @param QueryABCRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return QueryABCResponse
     */
    public function queryABCEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryABCResponse::fromMap($this->doRequest('1.0', 'demo.a.b.c.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 近端接口测试
     * Summary: 近端接口测试.
     *
     * @param QueryTestEmbedUserRequest $request
     *
     * @return QueryTestEmbedUserResponse
     */
    public function queryTestEmbedUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestEmbedUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 近端接口测试
     * Summary: 近端接口测试.
     *
     * @param QueryTestEmbedUserRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryTestEmbedUserResponse
     */
    public function queryTestEmbedUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestEmbedUserResponse::fromMap($this->doRequest('1.0', 'demo.test.embed.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: sss
     * Summary: sss.
     *
     * @param QueryAasSaSaRequest $request
     *
     * @return QueryAasSaSaResponse
     */
    public function queryAasSaSa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAasSaSaEx($request, $headers, $runtime);
    }

    /**
     * Description: sss
     * Summary: sss.
     *
     * @param QueryAasSaSaRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryAasSaSaResponse
     */
    public function queryAasSaSaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAasSaSaResponse::fromMap($this->doRequest('1.0', 'demo.aas.sa.sa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】.
     *
     * @param QueryApiWhiteListRequest $request
     *
     * @return QueryApiWhiteListResponse
     */
    public function queryApiWhiteList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiWhiteListEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】.
     *
     * @param QueryApiWhiteListRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryApiWhiteListResponse
     */
    public function queryApiWhiteListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiWhiteListResponse::fromMap($this->doRequest('1.0', 'demo.api.white.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】.
     *
     * @param QueryApiBlackListRequest $request
     *
     * @return QueryApiBlackListResponse
     */
    public function queryApiBlackList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiBlackListEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
     * Summary: 自动化测试需要，【请勿做任何改动！】.
     *
     * @param QueryApiBlackListRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryApiBlackListResponse
     */
    public function queryApiBlackListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiBlackListResponse::fromMap($this->doRequest('1.0', 'demo.api.black.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip访问白名单测试
     * Summary: 【自动化】ip访问白名单测试.
     *
     * @param QueryIpWhiteListRequest $request
     *
     * @return QueryIpWhiteListResponse
     */
    public function queryIpWhiteList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpWhiteListEx($request, $headers, $runtime);
    }

    /**
     * Description: ip访问白名单测试
     * Summary: 【自动化】ip访问白名单测试.
     *
     * @param QueryIpWhiteListRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryIpWhiteListResponse
     */
    public function queryIpWhiteListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpWhiteListResponse::fromMap($this->doRequest('1.0', 'demo.ip.white.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip访问白名单测试
     * Summary: 【自动化】ip访问黑名单测试.
     *
     * @param QueryIpBlackListRequest $request
     *
     * @return QueryIpBlackListResponse
     */
    public function queryIpBlackList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpBlackListEx($request, $headers, $runtime);
    }

    /**
     * Description: ip访问白名单测试
     * Summary: 【自动化】ip访问黑名单测试.
     *
     * @param QueryIpBlackListRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryIpBlackListResponse
     */
    public function queryIpBlackListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpBlackListResponse::fromMap($this->doRequest('1.0', 'demo.ip.black.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试策略
     * Summary: 【自动化】重试策略.
     *
     * @param QueryIpRetryRequest $request
     *
     * @return QueryIpRetryResponse
     */
    public function queryIpRetry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpRetryEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试策略
     * Summary: 【自动化】重试策略.
     *
     * @param QueryIpRetryRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryIpRetryResponse
     */
    public function queryIpRetryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpRetryResponse::fromMap($this->doRequest('1.0', 'demo.ip.retry.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试.
     *
     * @param QueryTestTimeTestaRequest $request
     *
     * @return QueryTestTimeTestaResponse
     */
    public function queryTestTimeTesta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestTimeTestaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试.
     *
     * @param QueryTestTimeTestaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryTestTimeTestaResponse
     */
    public function queryTestTimeTestaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestTimeTestaResponse::fromMap($this->doRequest('1.0', 'demo.test.time.testa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: oas 测试使用
     * Summary: oas 测试使用.
     *
     * @param QueryOasRestRequest $request
     *
     * @return QueryOasRestResponse
     */
    public function queryOasRest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOasRestEx($request, $headers, $runtime);
    }

    /**
     * Description: oas 测试使用
     * Summary: oas 测试使用.
     *
     * @param QueryOasRestRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryOasRestResponse
     */
    public function queryOasRestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOasRestResponse::fromMap($this->doRequest('1.0', 'demo.oas.rest.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypeRequest $request
     *
     * @return QueryTestContentTypeResponse
     */
    public function queryTestContentType($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestContentTypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTestContentTypeResponse
     */
    public function queryTestContentTypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestContentTypeResponse::fromMap($this->doRequest('1.0', 'demo.test.content.type.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试contentType
     * Summary: 自动化测试contentType.
     *
     * @param QueryTestContentTypeoneRequest $request
     *
     * @return QueryTestContentTypeoneResponse
     */
    public function queryTestContentTypeone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestContentTypeoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试contentType
     * Summary: 自动化测试contentType.
     *
     * @param QueryTestContentTypeoneRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryTestContentTypeoneResponse
     */
    public function queryTestContentTypeoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestContentTypeoneResponse::fromMap($this->doRequest('1.0', 'demo.test.content.typeone.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypetwoRequest $request
     *
     * @return QueryTestContentTypetwoResponse
     */
    public function queryTestContentTypetwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestContentTypetwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypetwoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryTestContentTypetwoResponse
     */
    public function queryTestContentTypetwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestContentTypetwoResponse::fromMap($this->doRequest('1.0', 'demo.test.content.typetwo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypethreeRequest $request
     *
     * @return QueryTestContentTypethreeResponse
     */
    public function queryTestContentTypethree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestContentTypethreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypethreeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryTestContentTypethreeResponse
     */
    public function queryTestContentTypethreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestContentTypethreeResponse::fromMap($this->doRequest('1.0', 'demo.test.content.typethree.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypefourRequest $request
     *
     * @return QueryTestContentTypefourResponse
     */
    public function queryTestContentTypefour($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestContentTypefourEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypefourRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryTestContentTypefourResponse
     */
    public function queryTestContentTypefourEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestContentTypefourResponse::fromMap($this->doRequest('1.0', 'demo.test.content.typefour.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypefiveRequest $request
     *
     * @return QueryTestContentTypefiveResponse
     */
    public function queryTestContentTypefive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestContentTypefiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化contenttype兼容测试
     * Summary: 自动化contenttype兼容测试.
     *
     * @param QueryTestContentTypefiveRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryTestContentTypefiveResponse
     */
    public function queryTestContentTypefiveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestContentTypefiveResponse::fromMap($this->doRequest('1.0', 'demo.test.content.typefive.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 金融场景风险分析
     * Summary: 金融场景风险分析.
     *
     * @param QueryAgentFinancialRiskRequest $request
     *
     * @return QueryAgentFinancialRiskResponse
     */
    public function queryAgentFinancialRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAgentFinancialRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 金融场景风险分析
     * Summary: 金融场景风险分析.
     *
     * @param QueryAgentFinancialRiskRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryAgentFinancialRiskResponse
     */
    public function queryAgentFinancialRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAgentFinancialRiskResponse::fromMap($this->doRequest('1.0', 'demo.agent.financial.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流式处理
     * Summary: 流式处理.
     *
     * @param QueryStreamTestmethodRequest $request
     *
     * @return QueryStreamTestmethodResponse
     */
    public function queryStreamTestmethod($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStreamTestmethodEx($request, $headers, $runtime);
    }

    /**
     * Description: 流式处理
     * Summary: 流式处理.
     *
     * @param QueryStreamTestmethodRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryStreamTestmethodResponse
     */
    public function queryStreamTestmethodEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStreamTestmethodResponse::fromMap($this->doRequest('1.0', 'demo.stream.testmethod.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 模拟下游超时情况
     * Summary: 流式超时测试接口.
     *
     * @param QueryStreamTimeoutRequest $request
     *
     * @return QueryStreamTimeoutResponse
     */
    public function queryStreamTimeout($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStreamTimeoutEx($request, $headers, $runtime);
    }

    /**
     * Description: 模拟下游超时情况
     * Summary: 流式超时测试接口.
     *
     * @param QueryStreamTimeoutRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryStreamTimeoutResponse
     */
    public function queryStreamTimeoutEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStreamTimeoutResponse::fromMap($this->doRequest('1.0', 'demo.stream.timeout.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 模拟下游返回非json的情况
     * Summary: 流式下游返回非json.
     *
     * @param QueryStreamNonjsonRequest $request
     *
     * @return QueryStreamNonjsonResponse
     */
    public function queryStreamNonjson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStreamNonjsonEx($request, $headers, $runtime);
    }

    /**
     * Description: 模拟下游返回非json的情况
     * Summary: 流式下游返回非json.
     *
     * @param QueryStreamNonjsonRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryStreamNonjsonResponse
     */
    public function queryStreamNonjsonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStreamNonjsonResponse::fromMap($this->doRequest('1.0', 'demo.stream.nonjson.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流式出参包含特殊字符
     * Summary: 流式出参包含特殊字符.
     *
     * @param QueryStreamSpecialCharactersRequest $request
     *
     * @return QueryStreamSpecialCharactersResponse
     */
    public function queryStreamSpecialCharacters($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStreamSpecialCharactersEx($request, $headers, $runtime);
    }

    /**
     * Description: 流式出参包含特殊字符
     * Summary: 流式出参包含特殊字符.
     *
     * @param QueryStreamSpecialCharactersRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryStreamSpecialCharactersResponse
     */
    public function queryStreamSpecialCharactersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStreamSpecialCharactersResponse::fromMap($this->doRequest('1.0', 'demo.stream.special.characters.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 非流式返回
     * Summary: 非流式返回.
     *
     * @param QueryStreamNonstreamRequest $request
     *
     * @return QueryStreamNonstreamResponse
     */
    public function queryStreamNonstream($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStreamNonstreamEx($request, $headers, $runtime);
    }

    /**
     * Description: 非流式返回
     * Summary: 非流式返回.
     *
     * @param QueryStreamNonstreamRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryStreamNonstreamResponse
     */
    public function queryStreamNonstreamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStreamNonstreamResponse::fromMap($this->doRequest('1.0', 'demo.stream.nonstream.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口1
     * Summary: 压测接口1.
     *
     * @param QueryLoadtestTimeOneRequest $request
     *
     * @return QueryLoadtestTimeOneResponse
     */
    public function queryLoadtestTimeOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadtestTimeOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口1
     * Summary: 压测接口1.
     *
     * @param QueryLoadtestTimeOneRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryLoadtestTimeOneResponse
     */
    public function queryLoadtestTimeOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadtestTimeOneResponse::fromMap($this->doRequest('1.0', 'demo.loadtest.time.one.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口2
     * Summary: 压测接口2.
     *
     * @param QueryLoadtestTimeTwoRequest $request
     *
     * @return QueryLoadtestTimeTwoResponse
     */
    public function queryLoadtestTimeTwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadtestTimeTwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口2
     * Summary: 压测接口2.
     *
     * @param QueryLoadtestTimeTwoRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryLoadtestTimeTwoResponse
     */
    public function queryLoadtestTimeTwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadtestTimeTwoResponse::fromMap($this->doRequest('1.0', 'demo.loadtest.time.two.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口4，用于压测
     * Summary: 压测接口4.
     *
     * @param QueryLoadtestTimeFourRequest $request
     *
     * @return QueryLoadtestTimeFourResponse
     */
    public function queryLoadtestTimeFour($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadtestTimeFourEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口4，用于压测
     * Summary: 压测接口4.
     *
     * @param QueryLoadtestTimeFourRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryLoadtestTimeFourResponse
     */
    public function queryLoadtestTimeFourEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadtestTimeFourResponse::fromMap($this->doRequest('1.0', 'demo.loadtest.time.four.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口5，用于压测
     * Summary: 压测接口5.
     *
     * @param QueryLoadtestTimeFiveRequest $request
     *
     * @return QueryLoadtestTimeFiveResponse
     */
    public function queryLoadtestTimeFive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadtestTimeFiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口5，用于压测
     * Summary: 压测接口5.
     *
     * @param QueryLoadtestTimeFiveRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryLoadtestTimeFiveResponse
     */
    public function queryLoadtestTimeFiveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadtestTimeFiveResponse::fromMap($this->doRequest('1.0', 'demo.loadtest.time.five.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大模型护栏多轮对话提问检测 测试
     * Summary: 大模型护栏多轮对话提问检测.
     *
     * @param CheckAicoguardcoreAicoguardrailsQuestionRequest $request
     *
     * @return CheckAicoguardcoreAicoguardrailsQuestionResponse
     */
    public function checkAicoguardcoreAicoguardrailsQuestion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAicoguardcoreAicoguardrailsQuestionEx($request, $headers, $runtime);
    }

    /**
     * Description: 大模型护栏多轮对话提问检测 测试
     * Summary: 大模型护栏多轮对话提问检测.
     *
     * @param CheckAicoguardcoreAicoguardrailsQuestionRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return CheckAicoguardcoreAicoguardrailsQuestionResponse
     */
    public function checkAicoguardcoreAicoguardrailsQuestionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAicoguardcoreAicoguardrailsQuestionResponse::fromMap($this->doRequest('1.0', 'demo.aicoguardcore.aicoguardrails.question.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试.
     *
     * @param QueryTestTimeMenhuRequest $request
     *
     * @return QueryTestTimeMenhuResponse
     */
    public function queryTestTimeMenhu($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestTimeMenhuEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试.
     *
     * @param QueryTestTimeMenhuRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryTestTimeMenhuResponse
     */
    public function queryTestTimeMenhuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestTimeMenhuResponse::fromMap($this->doRequest('1.0', 'demo.test.time.menhu.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param BindAaaBbbCccRequest $request
     *
     * @return BindAaaBbbCccResponse
     */
    public function bindAaaBbbCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindAaaBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param BindAaaBbbCccRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return BindAaaBbbCccResponse
     */
    public function bindAaaBbbCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindAaaBbbCccResponse::fromMap($this->doRequest('1.0', 'demo.aaa.bbb.ccc.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建111
     * Summary: 自动化测试创建（勿动）.
     *
     * @param QueryAaaBbbCccRequest $request
     *
     * @return QueryAaaBbbCccResponse
     */
    public function queryAaaBbbCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAaaBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建111
     * Summary: 自动化测试创建（勿动）.
     *
     * @param QueryAaaBbbCccRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryAaaBbbCccResponse
     */
    public function queryAaaBbbCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAaaBbbCccResponse::fromMap($this->doRequest('1.0', 'demo.aaa.bbb.ccc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动.
     *
     * @param QueryAbcAbcAbcRequest $request
     *
     * @return QueryAbcAbcAbcResponse
     */
    public function queryAbcAbcAbc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAbcAbcAbcEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动.
     *
     * @param QueryAbcAbcAbcRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryAbcAbcAbcResponse
     */
    public function queryAbcAbcAbcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAbcAbcAbcResponse::fromMap($this->doRequest('1.0', 'demo.abc.abc.abc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 123
     * Summary: 测试用api.
     *
     * @param BindAaaBbbCcdRequest $request
     *
     * @return BindAaaBbbCcdResponse
     */
    public function bindAaaBbbCcd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindAaaBbbCcdEx($request, $headers, $runtime);
    }

    /**
     * Description: 123
     * Summary: 测试用api.
     *
     * @param BindAaaBbbCcdRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return BindAaaBbbCcdResponse
     */
    public function bindAaaBbbCcdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindAaaBbbCcdResponse::fromMap($this->doRequest('1.0', 'demo.aaa.bbb.ccd.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
