<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff19a88a999c4b3587aa011598273c77;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\BatchcreateDemoSaasTestTestfRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\BatchcreateDemoSaasTestTestfResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\BindDemoDemoCheckEeeRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\BindDemoDemoCheckEeeResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\BindDemoGatewayAbcTestRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\BindDemoGatewayAbcTestResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\CreateDemoSaasTestTesthRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\CreateDemoSaasTestTesthResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\CreateDemoSaasTestTestiRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\CreateDemoSaasTestTestiResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\EchoDemoGatewayCheckRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\EchoDemoGatewayCheckResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\ImportDemoComCnTestRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\ImportDemoComCnTestResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\InitDemoBbpInsuranceUserRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\InitDemoBbpInsuranceUserResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\InitDemoGatewayRoadRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\InitDemoGatewayRoadResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\OperateDemoSaasTestTesteRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\OperateDemoSaasTestTesteResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\PublishDemoSaasTestTestcRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\PublishDemoSaasTestTestcResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\QueryDemoCjtestCjResRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\QueryDemoCjtestCjResResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\QueryDemoGatewayCheckEchotenRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\QueryDemoGatewayCheckEchotenResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\QueryDemoGatewayCheckEchotimeoutRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\QueryDemoGatewayCheckEchotimeoutResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\QueryDemoGatewayCheckRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\QueryDemoGatewayCheckResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\ResetDemoCjtestApiAuthorizeRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\ResetDemoCjtestApiAuthorizeResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\ResetDemoComCnCcRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\ResetDemoComCnCcResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\ResetDemoSaasTestTestdRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\ResetDemoSaasTestTestdResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\StatusDemoGatewayCheckRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\StatusDemoGatewayCheckResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\UpdateDemoCjtestCjRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\UpdateDemoCjtestCjResponse;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\UploadDemoCjtestSourceFileRequest;
use AntChain\Ak_ff19a88a999c4b3587aa011598273c77\Models\UploadDemoCjtestSourceFileResponse;
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
                    'sdk_version'      => '1.0.1',
                    '_prod_code'       => 'ak_ff19a88a999c4b3587aa011598273c77',
                    '_prod_channel'    => 'saas',
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
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     *
     * @param StatusDemoGatewayCheckRequest $request
     *
     * @return StatusDemoGatewayCheckResponse
     */
    public function statusDemoGatewayCheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->statusDemoGatewayCheckEx($request, $headers, $runtime);
    }

    /**
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     *
     * @param StatusDemoGatewayCheckRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return StatusDemoGatewayCheckResponse
     */
    public function statusDemoGatewayCheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StatusDemoGatewayCheckResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.status', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
     *
     * @param EchoDemoGatewayCheckRequest $request
     *
     * @return EchoDemoGatewayCheckResponse
     */
    public function echoDemoGatewayCheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->echoDemoGatewayCheckEx($request, $headers, $runtime);
    }

    /**
     * Description: Demo接口，返回当输入的值
     * Summary: 返回输入值
     *
     * @param EchoDemoGatewayCheckRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return EchoDemoGatewayCheckResponse
     */
    public function echoDemoGatewayCheckEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'demo.gateway.check.echo',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new EchoDemoGatewayCheckResponse([
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

        return EchoDemoGatewayCheckResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.echo', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ceshi
     * Summary: ss.
     *
     * @param QueryDemoGatewayCheckRequest $request
     *
     * @return QueryDemoGatewayCheckResponse
     */
    public function queryDemoGatewayCheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoGatewayCheckEx($request, $headers, $runtime);
    }

    /**
     * Description: ceshi
     * Summary: ss.
     *
     * @param QueryDemoGatewayCheckRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryDemoGatewayCheckResponse
     */
    public function queryDemoGatewayCheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoGatewayCheckResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: s
     * Summary: ss.
     *
     * @param BindDemoDemoCheckEeeRequest $request
     *
     * @return BindDemoDemoCheckEeeResponse
     */
    public function bindDemoDemoCheckEee($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindDemoDemoCheckEeeEx($request, $headers, $runtime);
    }

    /**
     * Description: s
     * Summary: ss.
     *
     * @param BindDemoDemoCheckEeeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return BindDemoDemoCheckEeeResponse
     */
    public function bindDemoDemoCheckEeeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindDemoDemoCheckEeeResponse::fromMap($this->doRequest('1.0', 'demo.demo.check.eee.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param BindDemoGatewayAbcTestRequest $request
     *
     * @return BindDemoGatewayAbcTestResponse
     */
    public function bindDemoGatewayAbcTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindDemoGatewayAbcTestEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param BindDemoGatewayAbcTestRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BindDemoGatewayAbcTestResponse
     */
    public function bindDemoGatewayAbcTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindDemoGatewayAbcTestResponse::fromMap($this->doRequest('1.0', 'demo.gateway.abc.test.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 超时测试
     * Summary: 超时.
     *
     * @param QueryDemoGatewayCheckEchotimeoutRequest $request
     *
     * @return QueryDemoGatewayCheckEchotimeoutResponse
     */
    public function queryDemoGatewayCheckEchotimeout($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoGatewayCheckEchotimeoutEx($request, $headers, $runtime);
    }

    /**
     * Description: 超时测试
     * Summary: 超时.
     *
     * @param QueryDemoGatewayCheckEchotimeoutRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryDemoGatewayCheckEchotimeoutResponse
     */
    public function queryDemoGatewayCheckEchotimeoutEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoGatewayCheckEchotimeoutResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.echotimeout.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s.
     *
     * @param QueryDemoGatewayCheckEchotenRequest $request
     *
     * @return QueryDemoGatewayCheckEchotenResponse
     */
    public function queryDemoGatewayCheckEchoten($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoGatewayCheckEchotenEx($request, $headers, $runtime);
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s.
     *
     * @param QueryDemoGatewayCheckEchotenRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryDemoGatewayCheckEchotenResponse
     */
    public function queryDemoGatewayCheckEchotenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoGatewayCheckEchotenResponse::fromMap($this->doRequest('1.0', 'demo.gateway.check.echoten.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点.
     *
     * @param InitDemoBbpInsuranceUserRequest $request
     *
     * @return InitDemoBbpInsuranceUserResponse
     */
    public function initDemoBbpInsuranceUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initDemoBbpInsuranceUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点.
     *
     * @param InitDemoBbpInsuranceUserRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return InitDemoBbpInsuranceUserResponse
     */
    public function initDemoBbpInsuranceUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitDemoBbpInsuranceUserResponse::fromMap($this->doRequest('1.0', 'demo.bbp.insurance.user.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试网关评审能力
     * Summary: 评审测试.
     *
     * @param UpdateDemoCjtestCjRequest $request
     *
     * @return UpdateDemoCjtestCjResponse
     */
    public function updateDemoCjtestCj($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDemoCjtestCjEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试网关评审能力
     * Summary: 评审测试.
     *
     * @param UpdateDemoCjtestCjRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateDemoCjtestCjResponse
     */
    public function updateDemoCjtestCjEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDemoCjtestCjResponse::fromMap($this->doRequest('1.0', 'demo.cjtest.cj.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试api描述
     * Summary: api简介.
     *
     * @param ResetDemoComCnCcRequest $request
     *
     * @return ResetDemoComCnCcResponse
     */
    public function resetDemoComCnCc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetDemoComCnCcEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试api描述
     * Summary: api简介.
     *
     * @param ResetDemoComCnCcRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ResetDemoComCnCcResponse
     */
    public function resetDemoComCnCcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetDemoComCnCcResponse::fromMap($this->doRequest('1.0', 'demo.com.cn.cc.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件测试
     * Summary: 文件测试.
     *
     * @param UploadDemoCjtestSourceFileRequest $request
     *
     * @return UploadDemoCjtestSourceFileResponse
     */
    public function uploadDemoCjtestSourceFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadDemoCjtestSourceFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件测试
     * Summary: 文件测试.
     *
     * @param UploadDemoCjtestSourceFileRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UploadDemoCjtestSourceFileResponse
     */
    public function uploadDemoCjtestSourceFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'demo.cjtest.source.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadDemoCjtestSourceFileResponse([
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

        return UploadDemoCjtestSourceFileResponse::fromMap($this->doRequest('1.0', 'demo.cjtest.source.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试返回值限制
     * Summary: dev测试返回值限制.
     *
     * @param QueryDemoCjtestCjResRequest $request
     *
     * @return QueryDemoCjtestCjResResponse
     */
    public function queryDemoCjtestCjRes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoCjtestCjResEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试返回值限制
     * Summary: dev测试返回值限制.
     *
     * @param QueryDemoCjtestCjResRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryDemoCjtestCjResResponse
     */
    public function queryDemoCjtestCjResEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoCjtestCjResResponse::fromMap($this->doRequest('1.0', 'demo.cjtest.cj.res.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param ResetDemoCjtestApiAuthorizeRequest $request
     *
     * @return ResetDemoCjtestApiAuthorizeResponse
     */
    public function resetDemoCjtestApiAuthorize($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetDemoCjtestApiAuthorizeEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param ResetDemoCjtestApiAuthorizeRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ResetDemoCjtestApiAuthorizeResponse
     */
    public function resetDemoCjtestApiAuthorizeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetDemoCjtestApiAuthorizeResponse::fromMap($this->doRequest('1.0', 'demo.cjtest.api.authorize.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）.
     *
     * @param InitDemoGatewayRoadRequest $request
     *
     * @return InitDemoGatewayRoadResponse
     */
    public function initDemoGatewayRoad($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initDemoGatewayRoadEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
     * Summary: road.init（Fr AutoT）.
     *
     * @param InitDemoGatewayRoadRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return InitDemoGatewayRoadResponse
     */
    public function initDemoGatewayRoadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitDemoGatewayRoadResponse::fromMap($this->doRequest('1.0', 'demo.gateway.road.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1
     * Summary: api简介.
     *
     * @param ImportDemoComCnTestRequest $request
     *
     * @return ImportDemoComCnTestResponse
     */
    public function importDemoComCnTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importDemoComCnTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 1
     * Summary: api简介.
     *
     * @param ImportDemoComCnTestRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ImportDemoComCnTestResponse
     */
    public function importDemoComCnTestEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'demo.com.cn.test.import',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ImportDemoComCnTestResponse([
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

        return ImportDemoComCnTestResponse::fromMap($this->doRequest('1.0', 'demo.com.cn.test.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: testc
     * Summary: 测试用api.
     *
     * @param PublishDemoSaasTestTestcRequest $request
     *
     * @return PublishDemoSaasTestTestcResponse
     */
    public function publishDemoSaasTestTestc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishDemoSaasTestTestcEx($request, $headers, $runtime);
    }

    /**
     * Description: testc
     * Summary: 测试用api.
     *
     * @param PublishDemoSaasTestTestcRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PublishDemoSaasTestTestcResponse
     */
    public function publishDemoSaasTestTestcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishDemoSaasTestTestcResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testc.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param ResetDemoSaasTestTestdRequest $request
     *
     * @return ResetDemoSaasTestTestdResponse
     */
    public function resetDemoSaasTestTestd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetDemoSaasTestTestdEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param ResetDemoSaasTestTestdRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ResetDemoSaasTestTestdResponse
     */
    public function resetDemoSaasTestTestdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetDemoSaasTestTestdResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testd.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param OperateDemoSaasTestTesteRequest $request
     *
     * @return OperateDemoSaasTestTesteResponse
     */
    public function operateDemoSaasTestTeste($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateDemoSaasTestTesteEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param OperateDemoSaasTestTesteRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return OperateDemoSaasTestTesteResponse
     */
    public function operateDemoSaasTestTesteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateDemoSaasTestTesteResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.teste.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param BatchcreateDemoSaasTestTestfRequest $request
     *
     * @return BatchcreateDemoSaasTestTestfResponse
     */
    public function batchcreateDemoSaasTestTestf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateDemoSaasTestTestfEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param BatchcreateDemoSaasTestTestfRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchcreateDemoSaasTestTestfResponse
     */
    public function batchcreateDemoSaasTestTestfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateDemoSaasTestTestfResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testf.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param CreateDemoSaasTestTesthRequest $request
     *
     * @return CreateDemoSaasTestTesthResponse
     */
    public function createDemoSaasTestTesth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDemoSaasTestTesthEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param CreateDemoSaasTestTesthRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateDemoSaasTestTesthResponse
     */
    public function createDemoSaasTestTesthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDemoSaasTestTesthResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testh.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param CreateDemoSaasTestTestiRequest $request
     *
     * @return CreateDemoSaasTestTestiResponse
     */
    public function createDemoSaasTestTesti($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDemoSaasTestTestiEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param CreateDemoSaasTestTestiRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateDemoSaasTestTestiResponse
     */
    public function createDemoSaasTestTestiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDemoSaasTestTestiResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testi.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
