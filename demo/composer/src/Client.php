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
use AntChain\DEMO\Models\BatchcreateSaasTestTestfRequest;
use AntChain\DEMO\Models\BatchcreateSaasTestTestfResponse;
use AntChain\DEMO\Models\BindAaaBbbCccRequest;
use AntChain\DEMO\Models\BindAaaBbbCccResponse;
use AntChain\DEMO\Models\BindAsdAsdAsdRequest;
use AntChain\DEMO\Models\BindAsdAsdAsdResponse;
use AntChain\DEMO\Models\BindAsdAsdRequest;
use AntChain\DEMO\Models\BindAsdAsdResponse;
use AntChain\DEMO\Models\BindDemoCheckEeeRequest;
use AntChain\DEMO\Models\BindDemoCheckEeeResponse;
use AntChain\DEMO\Models\BindGatewayAbcTestRequest;
use AntChain\DEMO\Models\BindGatewayAbcTestResponse;
use AntChain\DEMO\Models\BindGongxaingTestRequest;
use AntChain\DEMO\Models\BindGongxaingTestResponse;
use AntChain\DEMO\Models\BindQweQweRequest;
use AntChain\DEMO\Models\BindQweQweResponse;
use AntChain\DEMO\Models\BindSdfSssSssRequest;
use AntChain\DEMO\Models\BindSdfSssSssResponse;
use AntChain\DEMO\Models\BindSssSsSsRequest;
use AntChain\DEMO\Models\BindSssSsSsResponse;
use AntChain\DEMO\Models\BindTestTestTestRequest;
use AntChain\DEMO\Models\BindTestTestTestResponse;
use AntChain\DEMO\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\DEMO\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\DEMO\Models\CreateSaasTestTesthRequest;
use AntChain\DEMO\Models\CreateSaasTestTesthResponse;
use AntChain\DEMO\Models\CreateSaasTestTestiRequest;
use AntChain\DEMO\Models\CreateSaasTestTestiResponse;
use AntChain\DEMO\Models\EchoGatewayCheckRequest;
use AntChain\DEMO\Models\EchoGatewayCheckResponse;
use AntChain\DEMO\Models\ExecGatewayRoadRequest;
use AntChain\DEMO\Models\ExecGatewayRoadResponse;
use AntChain\DEMO\Models\ImportComCnTestRequest;
use AntChain\DEMO\Models\ImportComCnTestResponse;
use AntChain\DEMO\Models\ImportSaasTestTestbRequest;
use AntChain\DEMO\Models\ImportSaasTestTestbResponse;
use AntChain\DEMO\Models\InitBbpInsuranceUserRequest;
use AntChain\DEMO\Models\InitBbpInsuranceUserResponse;
use AntChain\DEMO\Models\InitGatewayRoadRequest;
use AntChain\DEMO\Models\InitGatewayRoadResponse;
use AntChain\DEMO\Models\OpenSaasTestTestgRequest;
use AntChain\DEMO\Models\OpenSaasTestTestgResponse;
use AntChain\DEMO\Models\OperateSaasTestTesteRequest;
use AntChain\DEMO\Models\OperateSaasTestTesteResponse;
use AntChain\DEMO\Models\PublishSaasTestTestcRequest;
use AntChain\DEMO\Models\PublishSaasTestTestcResponse;
use AntChain\DEMO\Models\QueryAaaBbbCccRequest;
use AntChain\DEMO\Models\QueryAaaBbbCccResponse;
use AntChain\DEMO\Models\QueryAbcAbcAbcRequest;
use AntChain\DEMO\Models\QueryAbcAbcAbcResponse;
use AntChain\DEMO\Models\QueryAdAsdAsdRequest;
use AntChain\DEMO\Models\QueryAdAsdAsdResponse;
use AntChain\DEMO\Models\QueryCjtestCjResRequest;
use AntChain\DEMO\Models\QueryCjtestCjResResponse;
use AntChain\DEMO\Models\QueryGatewayCheckEchotenRequest;
use AntChain\DEMO\Models\QueryGatewayCheckEchotenResponse;
use AntChain\DEMO\Models\QueryGatewayCheckEchotimeoutRequest;
use AntChain\DEMO\Models\QueryGatewayCheckEchotimeoutResponse;
use AntChain\DEMO\Models\QueryGatewayCheckRequest;
use AntChain\DEMO\Models\QueryGatewayCheckResponse;
use AntChain\DEMO\Models\QueryGatewayMyRequest;
use AntChain\DEMO\Models\QueryGatewayMyResponse;
use AntChain\DEMO\Models\QueryGatewayRoadRequest;
use AntChain\DEMO\Models\QueryGatewayRoadResponse;
use AntChain\DEMO\Models\QueryGatewayTestRequest;
use AntChain\DEMO\Models\QueryGatewayTestResponse;
use AntChain\DEMO\Models\QueryGongxiangTestDemoRequest;
use AntChain\DEMO\Models\QueryGongxiangTestDemoResponse;
use AntChain\DEMO\Models\QueryMasterstationMasterdataRequest;
use AntChain\DEMO\Models\QueryMasterstationMasterdataResponse;
use AntChain\DEMO\Models\QueryMasterstationMasterdataStatusRequest;
use AntChain\DEMO\Models\QueryMasterstationMasterdataStatusResponse;
use AntChain\DEMO\Models\QuerySaasTestTestaRequest;
use AntChain\DEMO\Models\QuerySaasTestTestaResponse;
use AntChain\DEMO\Models\QueryTestAaaBbbRequest;
use AntChain\DEMO\Models\QueryTestAaaBbbResponse;
use AntChain\DEMO\Models\QueryTestGatewayTestRequest;
use AntChain\DEMO\Models\QueryTestGatewayTestResponse;
use AntChain\DEMO\Models\QueryTestTestobjectBbbRequest;
use AntChain\DEMO\Models\QueryTestTestobjectBbbResponse;
use AntChain\DEMO\Models\RegisterTestBizeventMessageRequest;
use AntChain\DEMO\Models\RegisterTestBizeventMessageResponse;
use AntChain\DEMO\Models\ReplaceSaasTestTestjRequest;
use AntChain\DEMO\Models\ReplaceSaasTestTestjResponse;
use AntChain\DEMO\Models\ResetCjtestApiAuthorizeRequest;
use AntChain\DEMO\Models\ResetCjtestApiAuthorizeResponse;
use AntChain\DEMO\Models\ResetComCnCcRequest;
use AntChain\DEMO\Models\ResetComCnCcResponse;
use AntChain\DEMO\Models\ResetSaasTestTestdRequest;
use AntChain\DEMO\Models\ResetSaasTestTestdResponse;
use AntChain\DEMO\Models\SendSaasTestTestkRequest;
use AntChain\DEMO\Models\SendSaasTestTestkResponse;
use AntChain\DEMO\Models\StatusGatewayCheckRequest;
use AntChain\DEMO\Models\StatusGatewayCheckResponse;
use AntChain\DEMO\Models\UnstabilizeTestTestTestRequest;
use AntChain\DEMO\Models\UnstabilizeTestTestTestResponse;
use AntChain\DEMO\Models\UpdateCjtestCjRequest;
use AntChain\DEMO\Models\UpdateCjtestCjResponse;
use AntChain\DEMO\Models\UpdateGatewayRoadRequest;
use AntChain\DEMO\Models\UpdateGatewayRoadResponse;
use AntChain\DEMO\Models\UploadCjtestSourceFileRequest;
use AntChain\DEMO\Models\UploadCjtestSourceFileResponse;
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
            // Demo类1
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
                    'sdk_version'      => '1.0.139',
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
     * Description: 123
     * Summary: 123.
     *
     * @param BindQweQweRequest $request
     *
     * @return BindQweQweResponse
     */
    public function bindQweQwe($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindQweQweEx($request, $headers, $runtime);
    }

    /**
     * Description: 123
     * Summary: 123.
     *
     * @param BindQweQweRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return BindQweQweResponse
     */
    public function bindQweQweEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindQweQweResponse::fromMap($this->doRequest('1.0', 'demo.qwe.qwe.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: sdf
     * Summary: sdf.
     *
     * @param BindSdfSssSssRequest $request
     *
     * @return BindSdfSssSssResponse
     */
    public function bindSdfSssSss($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindSdfSssSssEx($request, $headers, $runtime);
    }

    /**
     * Description: sdf
     * Summary: sdf.
     *
     * @param BindSdfSssSssRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return BindSdfSssSssResponse
     */
    public function bindSdfSssSssEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindSdfSssSssResponse::fromMap($this->doRequest('1.0', 'demo.sdf.sss.sss.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
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
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
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
     * Description: ceshi
     * Summary: ss.
     *
     * @param QueryGatewayCheckRequest $request
     *
     * @return QueryGatewayCheckResponse
     */
    public function queryGatewayCheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayCheckEx($request, $headers, $runtime);
    }

    /**
     * Description: ceshi
     * Summary: ss.
     *
     * @param QueryGatewayCheckRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryGatewayCheckResponse
     */
    public function queryGatewayCheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayCheckResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试用aaa
     * Summary: 测试001.
     *
     * @param QueryGatewayTestRequest $request
     *
     * @return QueryGatewayTestResponse
     */
    public function queryGatewayTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试用aaa
     * Summary: 测试001.
     *
     * @param QueryGatewayTestRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryGatewayTestResponse
     */
    public function queryGatewayTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayTestResponse::fromMap($this->doRequest('1.0', 'demo.gateway.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: sss
     * Summary: ss.
     *
     * @param BindSssSsSsRequest $request
     *
     * @return BindSssSsSsResponse
     */
    public function bindSssSsSs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindSssSsSsEx($request, $headers, $runtime);
    }

    /**
     * Description: sss
     * Summary: ss.
     *
     * @param BindSssSsSsRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return BindSssSsSsResponse
     */
    public function bindSssSsSsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindSssSsSsResponse::fromMap($this->doRequest('1.0', 'demo.sss.ss.ss.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: s
     * Summary: ss.
     *
     * @param BindDemoCheckEeeRequest $request
     *
     * @return BindDemoCheckEeeResponse
     */
    public function bindDemoCheckEee($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindDemoCheckEeeEx($request, $headers, $runtime);
    }

    /**
     * Description: s
     * Summary: ss.
     *
     * @param BindDemoCheckEeeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return BindDemoCheckEeeResponse
     */
    public function bindDemoCheckEeeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindDemoCheckEeeResponse::fromMap($this->doRequest('1.0', 'demo.demo.check.eee.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param BindGatewayAbcTestRequest $request
     *
     * @return BindGatewayAbcTestResponse
     */
    public function bindGatewayAbcTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindGatewayAbcTestEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param BindGatewayAbcTestRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return BindGatewayAbcTestResponse
     */
    public function bindGatewayAbcTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindGatewayAbcTestResponse::fromMap($this->doRequest('1.0', 'demo.gateway.abc.test.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: testaaa
     * Summary: test.
     *
     * @param BindTestTestTestRequest $request
     *
     * @return BindTestTestTestResponse
     */
    public function bindTestTestTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindTestTestTestEx($request, $headers, $runtime);
    }

    /**
     * Description: testaaa
     * Summary: test.
     *
     * @param BindTestTestTestRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return BindTestTestTestResponse
     */
    public function bindTestTestTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindTestTestTestResponse::fromMap($this->doRequest('1.0', 'demo.test.test.test.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: asd
     * Summary: asd1.
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
     * Description: asd
     * Summary: asd1.
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
     * Description: 1·2
     * Summary: 测试.
     *
     * @param BindAsdAsdRequest $request
     *
     * @return BindAsdAsdResponse
     */
    public function bindAsdAsd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindAsdAsdEx($request, $headers, $runtime);
    }

    /**
     * Description: 1·2
     * Summary: 测试.
     *
     * @param BindAsdAsdRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return BindAsdAsdResponse
     */
    public function bindAsdAsdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindAsdAsdResponse::fromMap($this->doRequest('1.0', 'demo.asd.asd.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 文件测试
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
     * Description: 文件测试
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
     * Description: 测试返回值限制
     * Summary: dev测试返回值限制.
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
     * Description: 测试返回值限制
     * Summary: dev测试返回值限制.
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
     * Description: test
     * Summary: test.
     *
     * @param ResetCjtestApiAuthorizeRequest $request
     *
     * @return ResetCjtestApiAuthorizeResponse
     */
    public function resetCjtestApiAuthorize($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetCjtestApiAuthorizeEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param ResetCjtestApiAuthorizeRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ResetCjtestApiAuthorizeResponse
     */
    public function resetCjtestApiAuthorizeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetCjtestApiAuthorizeResponse::fromMap($this->doRequest('1.0', 'demo.cjtest.api.authorize.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 修改入参msg后返回，Fr 自动化连通性测试。
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
     * Description: 修改入参msg后返回，Fr 自动化连通性测试。
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
     * Description: 简单查询处理，Fr 自动化连通性测试。
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
     * Description: 简单查询处理，Fr 自动化连通性测试。
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
     * Description: 简单执行返回处理结果，Fr 自动化连通性测试。
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
     * Description: 简单执行返回处理结果，Fr 自动化连通性测试。
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
     * Description: test
     * Summary: 查询主数据.
     *
     * @param QueryMasterstationMasterdataStatusRequest $request
     *
     * @return QueryMasterstationMasterdataStatusResponse
     */
    public function queryMasterstationMasterdataStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMasterstationMasterdataStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: 查询主数据.
     *
     * @param QueryMasterstationMasterdataStatusRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryMasterstationMasterdataStatusResponse
     */
    public function queryMasterstationMasterdataStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMasterstationMasterdataStatusResponse::fromMap($this->doRequest('1.0', 'demo.masterstation.masterdata.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param UnstabilizeTestTestTestRequest $request
     *
     * @return UnstabilizeTestTestTestResponse
     */
    public function unstabilizeTestTestTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unstabilizeTestTestTestEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param UnstabilizeTestTestTestRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UnstabilizeTestTestTestResponse
     */
    public function unstabilizeTestTestTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnstabilizeTestTestTestResponse::fromMap($this->doRequest('1.0', 'demo.test.test.test.unstabilize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: asd
     * Summary: asd.
     *
     * @param BindAsdAsdAsdRequest $request
     *
     * @return BindAsdAsdAsdResponse
     */
    public function bindAsdAsdAsd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindAsdAsdAsdEx($request, $headers, $runtime);
    }

    /**
     * Description: asd
     * Summary: asd.
     *
     * @param BindAsdAsdAsdRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return BindAsdAsdAsdResponse
     */
    public function bindAsdAsdAsdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindAsdAsdAsdResponse::fromMap($this->doRequest('1.0', 'demo.asd.asd.asd.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力主链路回归验证
     * Summary: 共享能力回归验证
     *
     * @param QueryTestAaaBbbRequest $request
     *
     * @return QueryTestAaaBbbResponse
     */
    public function queryTestAaaBbb($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestAaaBbbEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力主链路回归验证
     * Summary: 共享能力回归验证
     *
     * @param QueryTestAaaBbbRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryTestAaaBbbResponse
     */
    public function queryTestAaaBbbEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestAaaBbbResponse::fromMap($this->doRequest('1.0', 'demo.test.aaa.bbb.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 测试添加api
     * Summary: 测试用api.
     *
     * @param QueryTestTestobjectBbbRequest $request
     *
     * @return array|QueryTestTestobjectBbbResponse
     */
    public function queryTestTestobjectBbb($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestTestobjectBbbEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试添加api
     * Summary: 测试用api.
     *
     * @param QueryTestTestobjectBbbRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return array|QueryTestTestobjectBbbResponse
     */
    public function queryTestTestobjectBbbEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestTestobjectBbbResponse::fromMap($this->doRequest('1.0', 'demo.test.testobject.bbb.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 共享能力中心六期回归验证创建使用
     * Summary: 共享能力中心六期回归验证创建.
     *
     * @param QueryGongxiangTestDemoRequest $request
     *
     * @return QueryGongxiangTestDemoResponse
     */
    public function queryGongxiangTestDemo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGongxiangTestDemoEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力中心六期回归验证创建使用
     * Summary: 共享能力中心六期回归验证创建.
     *
     * @param QueryGongxiangTestDemoRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryGongxiangTestDemoResponse
     */
    public function queryGongxiangTestDemoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGongxiangTestDemoResponse::fromMap($this->doRequest('1.0', 'demo.gongxiang.test.demo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: testa
     * Summary: 测试用api.
     *
     * @param QuerySaasTestTestaRequest $request
     *
     * @return QuerySaasTestTestaResponse
     */
    public function querySaasTestTesta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasTestTestaEx($request, $headers, $runtime);
    }

    /**
     * Description: testa
     * Summary: 测试用api.
     *
     * @param QuerySaasTestTestaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QuerySaasTestTestaResponse
     */
    public function querySaasTestTestaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasTestTestaResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: testB
     * Summary: 测试用api.
     *
     * @param ImportSaasTestTestbRequest $request
     *
     * @return ImportSaasTestTestbResponse
     */
    public function importSaasTestTestb($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importSaasTestTestbEx($request, $headers, $runtime);
    }

    /**
     * Description: testB
     * Summary: 测试用api.
     *
     * @param ImportSaasTestTestbRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ImportSaasTestTestbResponse
     */
    public function importSaasTestTestbEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportSaasTestTestbResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testb.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: testc
     * Summary: 测试用api.
     *
     * @param PublishSaasTestTestcRequest $request
     *
     * @return PublishSaasTestTestcResponse
     */
    public function publishSaasTestTestc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishSaasTestTestcEx($request, $headers, $runtime);
    }

    /**
     * Description: testc
     * Summary: 测试用api.
     *
     * @param PublishSaasTestTestcRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PublishSaasTestTestcResponse
     */
    public function publishSaasTestTestcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishSaasTestTestcResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testc.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param ResetSaasTestTestdRequest $request
     *
     * @return ResetSaasTestTestdResponse
     */
    public function resetSaasTestTestd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetSaasTestTestdEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param ResetSaasTestTestdRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ResetSaasTestTestdResponse
     */
    public function resetSaasTestTestdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetSaasTestTestdResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testd.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param OperateSaasTestTesteRequest $request
     *
     * @return OperateSaasTestTesteResponse
     */
    public function operateSaasTestTeste($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateSaasTestTesteEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param OperateSaasTestTesteRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return OperateSaasTestTesteResponse
     */
    public function operateSaasTestTesteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateSaasTestTesteResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.teste.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param BatchcreateSaasTestTestfRequest $request
     *
     * @return BatchcreateSaasTestTestfResponse
     */
    public function batchcreateSaasTestTestf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateSaasTestTestfEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param BatchcreateSaasTestTestfRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return BatchcreateSaasTestTestfResponse
     */
    public function batchcreateSaasTestTestfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateSaasTestTestfResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testf.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param OpenSaasTestTestgRequest $request
     *
     * @return OpenSaasTestTestgResponse
     */
    public function openSaasTestTestg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openSaasTestTestgEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param OpenSaasTestTestgRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return OpenSaasTestTestgResponse
     */
    public function openSaasTestTestgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenSaasTestTestgResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testg.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param CreateSaasTestTesthRequest $request
     *
     * @return CreateSaasTestTesthResponse
     */
    public function createSaasTestTesth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSaasTestTesthEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param CreateSaasTestTesthRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateSaasTestTesthResponse
     */
    public function createSaasTestTesthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSaasTestTesthResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testh.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param CreateSaasTestTestiRequest $request
     *
     * @return CreateSaasTestTestiResponse
     */
    public function createSaasTestTesti($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSaasTestTestiEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param CreateSaasTestTestiRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateSaasTestTestiResponse
     */
    public function createSaasTestTestiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSaasTestTestiResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testi.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param ReplaceSaasTestTestjRequest $request
     *
     * @return ReplaceSaasTestTestjResponse
     */
    public function replaceSaasTestTestj($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceSaasTestTestjEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param ReplaceSaasTestTestjRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ReplaceSaasTestTestjResponse
     */
    public function replaceSaasTestTestjEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceSaasTestTestjResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testj.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param SendSaasTestTestkRequest $request
     *
     * @return SendSaasTestTestkResponse
     */
    public function sendSaasTestTestk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendSaasTestTestkEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param SendSaasTestTestkRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SendSaasTestTestkResponse
     */
    public function sendSaasTestTestkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendSaasTestTestkResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testk.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 共享能力六期回归验证
     * Summary: 共享能力六期回归验证
     *
     * @param BindGongxaingTestRequest $request
     *
     * @return BindGongxaingTestResponse
     */
    public function bindGongxaingTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindGongxaingTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力六期回归验证
     * Summary: 共享能力六期回归验证
     *
     * @param BindGongxaingTestRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return BindGongxaingTestResponse
     */
    public function bindGongxaingTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindGongxaingTestResponse::fromMap($this->doRequest('1.0', 'demo.gongxaing.test.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建
     * Summary: 自动化测试创建.
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
     * Description: 自动化测试创建
     * Summary: 自动化测试创建.
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
     * Description: 查询主数据
     * Summary: 查询主数据.
     *
     * @param QueryMasterstationMasterdataRequest $request
     *
     * @return QueryMasterstationMasterdataResponse
     */
    public function queryMasterstationMasterdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMasterstationMasterdataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询主数据
     * Summary: 查询主数据.
     *
     * @param QueryMasterstationMasterdataRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryMasterstationMasterdataResponse
     */
    public function queryMasterstationMasterdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMasterstationMasterdataResponse::fromMap($this->doRequest('1.0', 'demo.masterstation.masterdata.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建1
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
     * Description: 自动化测试创建1
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
     * Description: 测试api描述
     * Summary: api简介.
     *
     * @param ResetComCnCcRequest $request
     *
     * @return ResetComCnCcResponse
     */
    public function resetComCnCc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetComCnCcEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试api描述
     * Summary: api简介.
     *
     * @param ResetComCnCcRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ResetComCnCcResponse
     */
    public function resetComCnCcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetComCnCcResponse::fromMap($this->doRequest('1.0', 'demo.com.cn.cc.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 长捷,qiujianglong.qjl
     * Summary: api简介.
     *
     * @param ImportComCnTestRequest $request
     *
     * @return ImportComCnTestResponse
     */
    public function importComCnTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importComCnTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 长捷,qiujianglong.qjl
     * Summary: api简介.
     *
     * @param ImportComCnTestRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ImportComCnTestResponse
     */
    public function importComCnTestEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'demo.com.cn.test.import',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'OK')) {
                return new ImportComCnTestResponse([
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

        return ImportComCnTestResponse::fromMap($this->doRequest('1.0', 'demo.com.cn.test.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
