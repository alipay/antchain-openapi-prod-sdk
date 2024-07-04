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
use AntChain\DEMO\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\DEMO\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\DEMO\Models\CreateAutoGenerateCodeRequest;
use AntChain\DEMO\Models\CreateAutoGenerateCodeResponse;
use AntChain\DEMO\Models\CreateAutoTestCodeRequest;
use AntChain\DEMO\Models\CreateAutoTestCodeResponse;
use AntChain\DEMO\Models\EchoGatewayCheckRequest;
use AntChain\DEMO\Models\EchoGatewayCheckResponse;
use AntChain\DEMO\Models\ExecGatewayRoadRequest;
use AntChain\DEMO\Models\ExecGatewayRoadResponse;
use AntChain\DEMO\Models\ImportPreObWriteRequest;
use AntChain\DEMO\Models\ImportPreObWriteResponse;
use AntChain\DEMO\Models\InitBbpInsuranceUserRequest;
use AntChain\DEMO\Models\InitBbpInsuranceUserResponse;
use AntChain\DEMO\Models\InitCjtestAcopmResRequest;
use AntChain\DEMO\Models\InitCjtestAcopmResResponse;
use AntChain\DEMO\Models\InitGatewayRoadRequest;
use AntChain\DEMO\Models\InitGatewayRoadResponse;
use AntChain\DEMO\Models\MatchBusinessAndInstanceRequest;
use AntChain\DEMO\Models\MatchBusinessAndInstanceResponse;
use AntChain\DEMO\Models\OperateShanghaiPreTestRequest;
use AntChain\DEMO\Models\OperateShanghaiPreTestResponse;
use AntChain\DEMO\Models\QueryAaaBbbCccRequest;
use AntChain\DEMO\Models\QueryAaaBbbCccResponse;
use AntChain\DEMO\Models\QueryAbcAbcAbcRequest;
use AntChain\DEMO\Models\QueryAbcAbcAbcResponse;
use AntChain\DEMO\Models\QueryAcopmAtoWithholdRequest;
use AntChain\DEMO\Models\QueryAcopmAtoWithholdResponse;
use AntChain\DEMO\Models\QueryAdAsdAsdRequest;
use AntChain\DEMO\Models\QueryAdAsdAsdResponse;
use AntChain\DEMO\Models\QueryApdevcenterTestobjectTestsubaRequest;
use AntChain\DEMO\Models\QueryApdevcenterTestobjectTestsubaResponse;
use AntChain\DEMO\Models\QueryApdevcenterTestobjectTestsubRequest;
use AntChain\DEMO\Models\QueryApdevcenterTestobjectTestsubResponse;
use AntChain\DEMO\Models\QueryBusinessCodeTestRequest;
use AntChain\DEMO\Models\QueryBusinessCodeTestResponse;
use AntChain\DEMO\Models\QueryBusinessTestRequest;
use AntChain\DEMO\Models\QueryBusinessTestResponse;
use AntChain\DEMO\Models\QueryCjtestCjResRequest;
use AntChain\DEMO\Models\QueryCjtestCjResResponse;
use AntChain\DEMO\Models\QueryDemoAbcAbcRequest;
use AntChain\DEMO\Models\QueryDemoAbcAbcResponse;
use AntChain\DEMO\Models\QueryDevelopTestUseRequest;
use AntChain\DEMO\Models\QueryDevelopTestUseResponse;
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
use AntChain\DEMO\Models\QueryLoadtestTimeOneRequest;
use AntChain\DEMO\Models\QueryLoadtestTimeOneResponse;
use AntChain\DEMO\Models\QueryLoadtestTimeThreeRequest;
use AntChain\DEMO\Models\QueryLoadtestTimeThreeResponse;
use AntChain\DEMO\Models\QueryLoadtestTimeTwoRequest;
use AntChain\DEMO\Models\QueryLoadtestTimeTwoResponse;
use AntChain\DEMO\Models\QueryPreTestUseRequest;
use AntChain\DEMO\Models\QueryPreTestUseResponse;
use AntChain\DEMO\Models\QueryTestFilesystemFileinfoRequest;
use AntChain\DEMO\Models\QueryTestFilesystemFileinfoResponse;
use AntChain\DEMO\Models\QueryTestGatewayTestRequest;
use AntChain\DEMO\Models\QueryTestGatewayTestResponse;
use AntChain\DEMO\Models\QueryTestproductTestobjectTestsubaaaRequest;
use AntChain\DEMO\Models\QueryTestproductTestobjectTestsubaaaResponse;
use AntChain\DEMO\Models\QueryTestTestaTestaRequest;
use AntChain\DEMO\Models\QueryTestTestaTestaResponse;
use AntChain\DEMO\Models\QueryXxxxTestxAaaRequest;
use AntChain\DEMO\Models\QueryXxxxTestxAaaResponse;
use AntChain\DEMO\Models\RegisterTestBizeventMessageRequest;
use AntChain\DEMO\Models\RegisterTestBizeventMessageResponse;
use AntChain\DEMO\Models\StatusGatewayCheckRequest;
use AntChain\DEMO\Models\StatusGatewayCheckResponse;
use AntChain\DEMO\Models\UpdateCjtestCjRequest;
use AntChain\DEMO\Models\UpdateCjtestCjResponse;
use AntChain\DEMO\Models\UpdateGatewayRoadRequest;
use AntChain\DEMO\Models\UpdateGatewayRoadResponse;
use AntChain\DEMO\Models\UploadCjtestSourceFileRequest;
use AntChain\DEMO\Models\UploadCjtestSourceFileResponse;
use AntChain\DEMO\Models\VerifyDevelopTestTestRequest;
use AntChain\DEMO\Models\VerifyDevelopTestTestResponse;
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
                    'sdk_version'      => '1.1.0',
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
            $request->fileId = $uploadResp->fileId;
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
     * Description: 测试网关评审能力
     * Summary: 评审测试.
     *
     * @param UpdateCjtestCjRequest $request
     *
     * @return UpdateCjtestCjResponse
     */
    public function updateCjtestCj($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCjtestCjEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试网关评审能力
     * Summary: 评审测试.
     *
     * @param UpdateCjtestCjRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateCjtestCjResponse
     */
    public function updateCjtestCjEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCjtestCjResponse::fromMap($this->doRequest('1.0', 'demo.cjtest.cj.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件测试1
     * Summary: 文件测试.
     *
     * @param UploadCjtestSourceFileRequest $request
     *
     * @return UploadCjtestSourceFileResponse
     */
    public function uploadCjtestSourceFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadCjtestSourceFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件测试1
     * Summary: 文件测试.
     *
     * @param UploadCjtestSourceFileRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UploadCjtestSourceFileResponse
     */
    public function uploadCjtestSourceFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'demo.cjtest.source.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'OK')) {
                return new UploadCjtestSourceFileResponse([
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

        return UploadCjtestSourceFileResponse::fromMap($this->doRequest('1.0', 'demo.cjtest.source.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: cj test
     * Summary: cj test1.
     *
     * @param InitCjtestAcopmResRequest $request
     *
     * @return InitCjtestAcopmResResponse
     */
    public function initCjtestAcopmRes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initCjtestAcopmResEx($request, $headers, $runtime);
    }

    /**
     * Description: cj test
     * Summary: cj test1.
     *
     * @param InitCjtestAcopmResRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return InitCjtestAcopmResResponse
     */
    public function initCjtestAcopmResEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitCjtestAcopmResResponse::fromMap($this->doRequest('1.0', 'demo.cjtest.acopm.res.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 测试自动生成回归测试代码
     * Summary: 测试自动生成回归测试代码
     *
     * @param CreateAutoTestCodeRequest $request
     *
     * @return CreateAutoTestCodeResponse
     */
    public function createAutoTestCode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAutoTestCodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试自动生成回归测试代码
     * Summary: 测试自动生成回归测试代码
     *
     * @param CreateAutoTestCodeRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateAutoTestCodeResponse
     */
    public function createAutoTestCodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAutoTestCodeResponse::fromMap($this->doRequest('1.0', 'demo.auto.test.code.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 123
     * Summary: 测试用api.
     *
     * @param QueryDemoAbcAbcRequest $request
     *
     * @return QueryDemoAbcAbcResponse
     */
    public function queryDemoAbcAbc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoAbcAbcEx($request, $headers, $runtime);
    }

    /**
     * Description: 123
     * Summary: 测试用api.
     *
     * @param QueryDemoAbcAbcRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryDemoAbcAbcResponse
     */
    public function queryDemoAbcAbcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoAbcAbcResponse::fromMap($this->doRequest('1.0', 'demo.demo.abc.abc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryXxxxTestxAaaRequest $request
     *
     * @return QueryXxxxTestxAaaResponse
     */
    public function queryXxxxTestxAaa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXxxxTestxAaaEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryXxxxTestxAaaRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryXxxxTestxAaaResponse
     */
    public function queryXxxxTestxAaaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXxxxTestxAaaResponse::fromMap($this->doRequest('1.0', 'demo.xxxx.testx.aaa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryTestTestaTestaRequest $request
     *
     * @return QueryTestTestaTestaResponse
     */
    public function queryTestTestaTesta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestTestaTestaEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryTestTestaTestaRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryTestTestaTestaResponse
     */
    public function queryTestTestaTestaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestTestaTestaResponse::fromMap($this->doRequest('1.0', 'demo.test.testa.testa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
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
     * Summary: test.
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
     * Description: test
     * Summary: test.
     *
     * @param QueryBusinessTestRequest $request
     *
     * @return QueryBusinessTestResponse
     */
    public function queryBusinessTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBusinessTestEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryBusinessTestRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryBusinessTestResponse
     */
    public function queryBusinessTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBusinessTestResponse::fromMap($this->doRequest('1.0', 'demo.business.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 测试使用
     * Summary: testuse1.
     *
     * @param QueryBusinessCodeTestRequest $request
     *
     * @return QueryBusinessCodeTestResponse
     */
    public function queryBusinessCodeTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBusinessCodeTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用
     * Summary: testuse1.
     *
     * @param QueryBusinessCodeTestRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryBusinessCodeTestResponse
     */
    public function queryBusinessCodeTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBusinessCodeTestResponse::fromMap($this->doRequest('1.0', 'demo.business.code.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 研发自测使用API
     * Summary: 研发自测使用API.
     *
     * @param QueryDevelopTestUseRequest $request
     *
     * @return QueryDevelopTestUseResponse
     */
    public function queryDevelopTestUse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDevelopTestUseEx($request, $headers, $runtime);
    }

    /**
     * Description: 研发自测使用API
     * Summary: 研发自测使用API.
     *
     * @param QueryDevelopTestUseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDevelopTestUseResponse
     */
    public function queryDevelopTestUseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDevelopTestUseResponse::fromMap($this->doRequest('1.0', 'demo.develop.test.use.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资损防控研发自测使用API
     * Summary: 研发自测使用API.
     *
     * @param VerifyDevelopTestTestRequest $request
     *
     * @return VerifyDevelopTestTestResponse
     */
    public function verifyDevelopTestTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyDevelopTestTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 资损防控研发自测使用API
     * Summary: 研发自测使用API.
     *
     * @param VerifyDevelopTestTestRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return VerifyDevelopTestTestResponse
     */
    public function verifyDevelopTestTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyDevelopTestTestResponse::fromMap($this->doRequest('1.0', 'demo.develop.test.test.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于测试预发环境RDS切OB之后的同步功能
     * Summary: 预发RDS切OB测试.
     *
     * @param ImportPreObWriteRequest $request
     *
     * @return ImportPreObWriteResponse
     */
    public function importPreObWrite($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importPreObWriteEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于测试预发环境RDS切OB之后的同步功能
     * Summary: 预发RDS切OB测试.
     *
     * @param ImportPreObWriteRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportPreObWriteResponse
     */
    public function importPreObWriteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportPreObWriteResponse::fromMap($this->doRequest('1.0', 'demo.pre.ob.write.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点.
     *
     * @param InitBbpInsuranceUserRequest $request
     *
     * @return InitBbpInsuranceUserResponse
     */
    public function initBbpInsuranceUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initBbpInsuranceUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点.
     *
     * @param InitBbpInsuranceUserRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return InitBbpInsuranceUserResponse
     */
    public function initBbpInsuranceUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitBbpInsuranceUserResponse::fromMap($this->doRequest('1.0', 'demo.bbp.insurance.user.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于上海非金生产环境的同步测试
     * Summary: 上海非金生产环境测试.
     *
     * @param OperateShanghaiPreTestRequest $request
     *
     * @return OperateShanghaiPreTestResponse
     */
    public function operateShanghaiPreTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateShanghaiPreTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于上海非金生产环境的同步测试
     * Summary: 上海非金生产环境测试.
     *
     * @param OperateShanghaiPreTestRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return OperateShanghaiPreTestResponse
     */
    public function operateShanghaiPreTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateShanghaiPreTestResponse::fromMap($this->doRequest('1.0', 'demo.shanghai.pre.test.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cj test
     * Summary: cj test1.
     *
     * @param QueryCjtestCjResRequest $request
     *
     * @return QueryCjtestCjResResponse
     */
    public function queryCjtestCjRes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCjtestCjResEx($request, $headers, $runtime);
    }

    /**
     * Description: cj test
     * Summary: cj test1.
     *
     * @param QueryCjtestCjResRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryCjtestCjResResponse
     */
    public function queryCjtestCjResEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCjtestCjResResponse::fromMap($this->doRequest('1.0', 'demo.cjtest.cj.res.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 测试使用1
     * Summary: 测试创建.
     *
     * @param QueryTestGatewayTestRequest $request
     *
     * @return QueryTestGatewayTestResponse
     */
    public function queryTestGatewayTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestGatewayTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用1
     * Summary: 测试创建.
     *
     * @param QueryTestGatewayTestRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTestGatewayTestResponse
     */
    public function queryTestGatewayTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestGatewayTestResponse::fromMap($this->doRequest('1.0', 'demo.test.gateway.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试
     * Summary: 测试ato异常.
     *
     * @param QueryAcopmAtoWithholdRequest $request
     *
     * @return QueryAcopmAtoWithholdResponse
     */
    public function queryAcopmAtoWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAcopmAtoWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试
     * Summary: 测试ato异常.
     *
     * @param QueryAcopmAtoWithholdRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryAcopmAtoWithholdResponse
     */
    public function queryAcopmAtoWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAcopmAtoWithholdResponse::fromMap($this->doRequest('1.0', 'demo.acopm.ato.withhold.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用).
     *
     * @param QueryApdevcenterTestobjectTestsubRequest $request
     *
     * @return array|QueryApdevcenterTestobjectTestsubResponse
     */
    public function queryApdevcenterTestobjectTestsub($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApdevcenterTestobjectTestsubEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用).
     *
     * @param QueryApdevcenterTestobjectTestsubRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return array|QueryApdevcenterTestobjectTestsubResponse
     */
    public function queryApdevcenterTestobjectTestsubEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApdevcenterTestobjectTestsubResponse::fromMap($this->doRequest('1.0', 'demo.apdevcenter.testobject.testsub.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: testtest
     * Summary: 新增API测试查询接口(只是测试使用).
     *
     * @param QueryApdevcenterTestobjectTestsubaRequest $request
     *
     * @return array|QueryApdevcenterTestobjectTestsubaResponse
     */
    public function queryApdevcenterTestobjectTestsuba($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApdevcenterTestobjectTestsubaEx($request, $headers, $runtime);
    }

    /**
     * Description: testtest
     * Summary: 新增API测试查询接口(只是测试使用).
     *
     * @param QueryApdevcenterTestobjectTestsubaRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return array|QueryApdevcenterTestobjectTestsubaResponse
     */
    public function queryApdevcenterTestobjectTestsubaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApdevcenterTestobjectTestsubaResponse::fromMap($this->doRequest('1.0', 'demo.apdevcenter.testobject.testsuba.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用).
     *
     * @param QueryTestFilesystemFileinfoRequest $request
     *
     * @return QueryTestFilesystemFileinfoResponse
     */
    public function queryTestFilesystemFileinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestFilesystemFileinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用).
     *
     * @param QueryTestFilesystemFileinfoRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryTestFilesystemFileinfoResponse
     */
    public function queryTestFilesystemFileinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestFilesystemFileinfoResponse::fromMap($this->doRequest('1.0', 'demo.test.filesystem.fileinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用).
     *
     * @param QueryTestproductTestobjectTestsubaaaRequest $request
     *
     * @return array|QueryTestproductTestobjectTestsubaaaResponse
     */
    public function queryTestproductTestobjectTestsubaaa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestproductTestobjectTestsubaaaEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: 新增API测试查询接口(只是测试使用).
     *
     * @param QueryTestproductTestobjectTestsubaaaRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return array|QueryTestproductTestobjectTestsubaaaResponse
     */
    public function queryTestproductTestobjectTestsubaaaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestproductTestobjectTestsubaaaResponse::fromMap($this->doRequest('1.0', 'demo.testproduct.testobject.testsubaaa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费.
     *
     * @param RegisterTestBizeventMessageRequest $request
     *
     * @return RegisterTestBizeventMessageResponse
     */
    public function registerTestBizeventMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerTestBizeventMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费.
     *
     * @param RegisterTestBizeventMessageRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return RegisterTestBizeventMessageResponse
     */
    public function registerTestBizeventMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterTestBizeventMessageResponse::fromMap($this->doRequest('1.0', 'demo.test.bizevent.message.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 用于测试自动化脚本自动生成的功能
     * Summary: 自动生成自动化脚本测试.
     *
     * @param CreateAutoGenerateCodeRequest $request
     *
     * @return CreateAutoGenerateCodeResponse
     */
    public function createAutoGenerateCode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAutoGenerateCodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于测试自动化脚本自动生成的功能
     * Summary: 自动生成自动化脚本测试.
     *
     * @param CreateAutoGenerateCodeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateAutoGenerateCodeResponse
     */
    public function createAutoGenerateCodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAutoGenerateCodeResponse::fromMap($this->doRequest('1.0', 'demo.auto.generate.code.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于测试预发环境ob数据同步
     * Summary: 用于测试ob数据同步.
     *
     * @param QueryPreTestUseRequest $request
     *
     * @return QueryPreTestUseResponse
     */
    public function queryPreTestUse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPreTestUseEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于测试预发环境ob数据同步
     * Summary: 用于测试ob数据同步.
     *
     * @param QueryPreTestUseRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryPreTestUseResponse
     */
    public function queryPreTestUseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPreTestUseResponse::fromMap($this->doRequest('1.0', 'demo.pre.test.use.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
