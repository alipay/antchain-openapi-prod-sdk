<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DEMOSDK\Models\ApiFileUploadRequest;
use AntChain\DEMOSDK\Models\ApiFileUploadResponse;
use AntChain\DEMOSDK\Models\BindAaaBbbCccRequest;
use AntChain\DEMOSDK\Models\BindAaaBbbCccResponse;
use AntChain\DEMOSDK\Models\BindXxxRequest;
use AntChain\DEMOSDK\Models\BindXxxResponse;
use AntChain\DEMOSDK\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\DEMOSDK\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\DEMOSDK\Models\CTestLizAaaRequest;
use AntChain\DEMOSDK\Models\CTestLizAaaResponse;
use AntChain\DEMOSDK\Models\ImportAbcdOneRequest;
use AntChain\DEMOSDK\Models\ImportAbcdOneResponse;
use AntChain\DEMOSDK\Models\ImportBbbCciRequest;
use AntChain\DEMOSDK\Models\ImportBbbCciResponse;
use AntChain\DEMOSDK\Models\ImportCreateOneRequest;
use AntChain\DEMOSDK\Models\ImportCreateOneResponse;
use AntChain\DEMOSDK\Models\ImportCreateTestRequest;
use AntChain\DEMOSDK\Models\ImportCreateTestResponse;
use AntChain\DEMOSDK\Models\ImportCreateThreeRequest;
use AntChain\DEMOSDK\Models\ImportCreateThreeResponse;
use AntChain\DEMOSDK\Models\ImportTestRequest;
use AntChain\DEMOSDK\Models\ImportTestResponse;
use AntChain\DEMOSDK\Models\ImportTwiceOneRequest;
use AntChain\DEMOSDK\Models\ImportTwiceOneResponse;
use AntChain\DEMOSDK\Models\ImportTwiceThreeRequest;
use AntChain\DEMOSDK\Models\ImportTwiceThreeResponse;
use AntChain\DEMOSDK\Models\LyzaTestRequest;
use AntChain\DEMOSDK\Models\LyzaTestResponse;
use AntChain\DEMOSDK\Models\OperateTwiceOneRequest;
use AntChain\DEMOSDK\Models\OperateTwiceOneResponse;
use AntChain\DEMOSDK\Models\ParamLiuyzTestRequest;
use AntChain\DEMOSDK\Models\ParamLiuyzTestResponse;
use AntChain\DEMOSDK\Models\PublishTwiceOneRequest;
use AntChain\DEMOSDK\Models\PublishTwiceOneResponse;
use AntChain\DEMOSDK\Models\QueryAaaCcdRequest;
use AntChain\DEMOSDK\Models\QueryAaaCcdResponse;
use AntChain\DEMOSDK\Models\QueryAaaCciRequest;
use AntChain\DEMOSDK\Models\QueryAaaCciResponse;
use AntChain\DEMOSDK\Models\QueryAaaSdkRequest;
use AntChain\DEMOSDK\Models\QueryAaaSdkResponse;
use AntChain\DEMOSDK\Models\QueryAaaTestRequest;
use AntChain\DEMOSDK\Models\QueryAaaTestResponse;
use AntChain\DEMOSDK\Models\QueryAbcdOneRequest;
use AntChain\DEMOSDK\Models\QueryAbcdOneResponse;
use AntChain\DEMOSDK\Models\QueryBbbAatestRequest;
use AntChain\DEMOSDK\Models\QueryBbbAatestResponse;
use AntChain\DEMOSDK\Models\QueryBbbCccRequest;
use AntChain\DEMOSDK\Models\QueryBbbCccResponse;
use AntChain\DEMOSDK\Models\QueryBbbEeeRequest;
use AntChain\DEMOSDK\Models\QueryBbbEeeResponse;
use AntChain\DEMOSDK\Models\QueryCacheLimitRequest;
use AntChain\DEMOSDK\Models\QueryCacheLimitResponse;
use AntChain\DEMOSDK\Models\QueryCcXxRequest;
use AntChain\DEMOSDK\Models\QueryCcXxResponse;
use AntChain\DEMOSDK\Models\QueryCreateTwoRequest;
use AntChain\DEMOSDK\Models\QueryCreateTwoResponse;
use AntChain\DEMOSDK\Models\QueryMultiCccRequest;
use AntChain\DEMOSDK\Models\QueryMultiCccResponse;
use AntChain\DEMOSDK\Models\QueryMultiCciuRequest;
use AntChain\DEMOSDK\Models\QueryMultiCciuResponse;
use AntChain\DEMOSDK\Models\QueryQqqWwwRequest;
use AntChain\DEMOSDK\Models\QueryQqqWwwResponse;
use AntChain\DEMOSDK\Models\QueryTestRequest;
use AntChain\DEMOSDK\Models\QueryTestResponse;
use AntChain\DEMOSDK\Models\QueryTestSssRequest;
use AntChain\DEMOSDK\Models\QueryTestSssResponse;
use AntChain\DEMOSDK\Models\QueryTestSyaRequest;
use AntChain\DEMOSDK\Models\QueryTestSyaResponse;
use AntChain\DEMOSDK\Models\QueryTestXcRequest;
use AntChain\DEMOSDK\Models\QueryTestXcResponse;
use AntChain\DEMOSDK\Models\QueryTimeLimitRequest;
use AntChain\DEMOSDK\Models\QueryTimeLimitResponse;
use AntChain\DEMOSDK\Models\QueryTwiceOneRequest;
use AntChain\DEMOSDK\Models\QueryTwiceOneResponse;
use AntChain\DEMOSDK\Models\QueryTwiceThreeRequest;
use AntChain\DEMOSDK\Models\QueryTwiceThreeResponse;
use AntChain\DEMOSDK\Models\QueryTwiceTwoRequest;
use AntChain\DEMOSDK\Models\QueryTwiceTwoResponse;
use AntChain\DEMOSDK\Models\QueryWorkbenchTestRequest;
use AntChain\DEMOSDK\Models\QueryWorkbenchTestResponse;
use AntChain\DEMOSDK\Models\RegisterAbcdLimitRequest;
use AntChain\DEMOSDK\Models\RegisterAbcdLimitResponse;
use AntChain\DEMOSDK\Models\ResetAbcdLimitRequest;
use AntChain\DEMOSDK\Models\ResetAbcdLimitResponse;
use AntChain\DEMOSDK\Models\ResetBbbCccRequest;
use AntChain\DEMOSDK\Models\ResetBbbCccResponse;
use AntChain\DEMOSDK\Models\StabilizeBbbCccRequest;
use AntChain\DEMOSDK\Models\StabilizeBbbCccResponse;
use AntChain\DEMOSDK\Models\StabilizeTestRequest;
use AntChain\DEMOSDK\Models\StabilizeTestResponse;
use AntChain\DEMOSDK\Models\StabilizeTwiceThreeRequest;
use AntChain\DEMOSDK\Models\StabilizeTwiceThreeResponse;
use AntChain\DEMOSDK\Models\UnstabilizeTestRequest;
use AntChain\DEMOSDK\Models\UnstabilizeTestResponse;
use AntChain\DEMOSDK\Models\UnstabilizeTwiceThreeRequest;
use AntChain\DEMOSDK\Models\UnstabilizeTwiceThreeResponse;
use AntChain\DEMOSDK\Models\VerifyApiListRequest;
use AntChain\DEMOSDK\Models\VerifyApiListResponse;
use AntChain\DEMOSDK\Models\WithdrawTwiceOneRequest;
use AntChain\DEMOSDK\Models\WithdrawTwiceOneResponse;
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
                    'sdk_version'      => '1.3.33',
                    '_prod_code'       => 'DEMOSDK',
                    '_prod_channel'    => 'default',
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
     * Description: 测试sdk打包用
     * Summary: shiyi.cj.
     *
     * @param QueryBbbCccRequest $request
     *
     * @return QueryBbbCccResponse
     */
    public function queryBbbCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试sdk打包用
     * Summary: shiyi.cj.
     *
     * @param QueryBbbCccRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryBbbCccResponse
     */
    public function queryBbbCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBbbCccResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.bbb.ccc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param ImportBbbCciRequest $request
     *
     * @return ImportBbbCciResponse
     */
    public function importBbbCci($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importBbbCciEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param ImportBbbCciRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ImportBbbCciResponse
     */
    public function importBbbCciEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.demosdk.bbb.cci.import',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ImportBbbCciResponse([
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

        return ImportBbbCciResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.bbb.cci.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期全链路测试接口1
     * Summary: 个人工作台二期全链路测试接口1.
     *
     * @param QueryTimeLimitRequest $request
     *
     * @return QueryTimeLimitResponse
     */
    public function queryTimeLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTimeLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期全链路测试接口1
     * Summary: 个人工作台二期全链路测试接口1.
     *
     * @param QueryTimeLimitRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryTimeLimitResponse
     */
    public function queryTimeLimitEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.demosdk.time.limit.query',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new QueryTimeLimitResponse([
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

        return QueryTimeLimitResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.time.limit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试接口2
     * Summary: 个人工作台二期测试接口2.
     *
     * @param QueryCacheLimitRequest $request
     *
     * @return QueryCacheLimitResponse
     */
    public function queryCacheLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCacheLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试接口2
     * Summary: 个人工作台二期测试接口2.
     *
     * @param QueryCacheLimitRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryCacheLimitResponse
     */
    public function queryCacheLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCacheLimitResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.cache.limit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param QueryBbbEeeRequest $request
     *
     * @return QueryBbbEeeResponse
     */
    public function queryBbbEee($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBbbEeeEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param QueryBbbEeeRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryBbbEeeResponse
     */
    public function queryBbbEeeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBbbEeeResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.bbb.eee.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param QueryAaaTestRequest $request
     *
     * @return QueryAaaTestResponse
     */
    public function queryAaaTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAaaTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param QueryAaaTestRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryAaaTestResponse
     */
    public function queryAaaTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAaaTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.aaa.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试
     * Summary: 测试.
     *
     * @param StabilizeBbbCccRequest $request
     *
     * @return StabilizeBbbCccResponse
     */
    public function stabilizeBbbCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stabilizeBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试
     * Summary: 测试.
     *
     * @param StabilizeBbbCccRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return StabilizeBbbCccResponse
     */
    public function stabilizeBbbCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StabilizeBbbCccResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.bbb.ccc.stabilize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: r
     * Summary: 测试.
     *
     * @param QueryMultiCccRequest $request
     *
     * @return QueryMultiCccResponse
     */
    public function queryMultiCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMultiCccEx($request, $headers, $runtime);
    }

    /**
     * Description: r
     * Summary: 测试.
     *
     * @param QueryMultiCccRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryMultiCccResponse
     */
    public function queryMultiCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMultiCccResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.multi.ccc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: l
     * Summary: 测试.
     *
     * @param QueryAaaCciRequest $request
     *
     * @return QueryAaaCciResponse
     */
    public function queryAaaCci($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAaaCciEx($request, $headers, $runtime);
    }

    /**
     * Description: l
     * Summary: 测试.
     *
     * @param QueryAaaCciRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryAaaCciResponse
     */
    public function queryAaaCciEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAaaCciResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.aaa.cci.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 这是测试的
     * Summary: 测试.
     *
     * @param QueryAaaSdkRequest $request
     *
     * @return QueryAaaSdkResponse
     */
    public function queryAaaSdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAaaSdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 这是测试的
     * Summary: 测试.
     *
     * @param QueryAaaSdkRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryAaaSdkResponse
     */
    public function queryAaaSdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAaaSdkResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.aaa.sdk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: l
     * Summary: 测试.
     *
     * @param QueryMultiCciuRequest $request
     *
     * @return QueryMultiCciuResponse
     */
    public function queryMultiCciu($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMultiCciuEx($request, $headers, $runtime);
    }

    /**
     * Description: l
     * Summary: 测试.
     *
     * @param QueryMultiCciuRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryMultiCciuResponse
     */
    public function queryMultiCciuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMultiCciuResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.multi.cciu.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试使用
     * Summary: 个人工作台二期测试使用.
     *
     * @param ApiFileUploadRequest $request
     *
     * @return ApiFileUploadResponse
     */
    public function apiFileUpload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->apiFileUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试使用
     * Summary: 个人工作台二期测试使用.
     *
     * @param ApiFileUploadRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ApiFileUploadResponse
     */
    public function apiFileUploadEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.demosdk.file.upload.api',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ApiFileUploadResponse([
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

        return ApiFileUploadResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.file.upload.api', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param ResetBbbCccRequest $request
     *
     * @return ResetBbbCccResponse
     */
    public function resetBbbCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param ResetBbbCccRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ResetBbbCccResponse
     */
    public function resetBbbCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetBbbCccResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.bbb.ccc.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param QueryTestSssRequest $request
     *
     * @return QueryTestSssResponse
     */
    public function queryTestSss($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestSssEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param QueryTestSssRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryTestSssResponse
     */
    public function queryTestSssEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestSssResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.test.sss.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除.
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
     * Summary: 自动化测试创建test，请勿修改、删除.
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

        return BindAaaBbbCccResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.aaa.bbb.ccc.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param QueryAaaCcdRequest $request
     *
     * @return QueryAaaCcdResponse
     */
    public function queryAaaCcd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAaaCcdEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param QueryAaaCcdRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryAaaCcdResponse
     */
    public function queryAaaCcdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAaaCcdResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.aaa.ccd.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除.
     *
     * @param BindXxxRequest $request
     *
     * @return BindXxxResponse
     */
    public function bindXxx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindXxxEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除.
     *
     * @param BindXxxRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return BindXxxResponse
     */
    public function bindXxxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindXxxResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.xxx.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试
     * Summary: 测试.
     *
     * @param QueryCcXxRequest $request
     *
     * @return QueryCcXxResponse
     */
    public function queryCcXx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCcXxEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试
     * Summary: 测试.
     *
     * @param QueryCcXxRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryCcXxResponse
     */
    public function queryCcXxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCcXxResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.cc.xx.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param LyzaTestRequest $request
     *
     * @return LyzaTestResponse
     */
    public function lyzaTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->lyzaTestEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param LyzaTestRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return LyzaTestResponse
     */
    public function lyzaTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LyzaTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.test.lyza', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param CTestLizAaaRequest $request
     *
     * @return CTestLizAaaResponse
     */
    public function cTestLizAaa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cTestLizAaaEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param CTestLizAaaRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CTestLizAaaResponse
     */
    public function cTestLizAaaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CTestLizAaaResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.test.liz.aaa.c', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param VerifyApiListRequest $request
     *
     * @return VerifyApiListResponse
     */
    public function verifyApiList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyApiListEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param VerifyApiListRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return VerifyApiListResponse
     */
    public function verifyApiListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyApiListResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.api.list.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用测试test
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param QueryWorkbenchTestRequest $request
     *
     * @return QueryWorkbenchTestResponse
     */
    public function queryWorkbenchTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWorkbenchTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用测试test
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param QueryWorkbenchTestRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryWorkbenchTestResponse
     */
    public function queryWorkbenchTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWorkbenchTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.workbench.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param ImportCreateTestRequest $request
     *
     * @return ImportCreateTestResponse
     */
    public function importCreateTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importCreateTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param ImportCreateTestRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportCreateTestResponse
     */
    public function importCreateTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportCreateTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.create.test.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 哈哈哈个人工作台二期测试接口test
     * Summary: 个人工作台二期测试接口.
     *
     * @param QueryAbcdOneRequest $request
     *
     * @return QueryAbcdOneResponse
     */
    public function queryAbcdOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAbcdOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 哈哈哈个人工作台二期测试接口test
     * Summary: 个人工作台二期测试接口.
     *
     * @param QueryAbcdOneRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryAbcdOneResponse
     */
    public function queryAbcdOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAbcdOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.abcd.one.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口.
     *
     * @param ImportAbcdOneRequest $request
     *
     * @return ImportAbcdOneResponse
     */
    public function importAbcdOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importAbcdOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口.
     *
     * @param ImportAbcdOneRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ImportAbcdOneResponse
     */
    public function importAbcdOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportAbcdOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.abcd.one.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期分组路由灰度测试接口
     * Summary: 个人工作台二期分组路由灰度测试接口.
     *
     * @param ResetAbcdLimitRequest $request
     *
     * @return ResetAbcdLimitResponse
     */
    public function resetAbcdLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetAbcdLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期分组路由灰度测试接口
     * Summary: 个人工作台二期分组路由灰度测试接口.
     *
     * @param ResetAbcdLimitRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ResetAbcdLimitResponse
     */
    public function resetAbcdLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetAbcdLimitResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.abcd.limit.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期分组路由测试接口
     * Summary: 个人工作台二期分组路由测试接口.
     *
     * @param RegisterAbcdLimitRequest $request
     *
     * @return RegisterAbcdLimitResponse
     */
    public function registerAbcdLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerAbcdLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期分组路由测试接口
     * Summary: 个人工作台二期分组路由测试接口.
     *
     * @param RegisterAbcdLimitRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return RegisterAbcdLimitResponse
     */
    public function registerAbcdLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterAbcdLimitResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.abcd.limit.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台预发测试使用
     * Summary: 个人工作台预发测试使用.
     *
     * @param QueryTwiceOneRequest $request
     *
     * @return QueryTwiceOneResponse
     */
    public function queryTwiceOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTwiceOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台预发测试使用
     * Summary: 个人工作台预发测试使用.
     *
     * @param QueryTwiceOneRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryTwiceOneResponse
     */
    public function queryTwiceOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTwiceOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.one.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param ImportTwiceOneRequest $request
     *
     * @return ImportTwiceOneResponse
     */
    public function importTwiceOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importTwiceOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param ImportTwiceOneRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ImportTwiceOneResponse
     */
    public function importTwiceOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportTwiceOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.one.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param PublishTwiceOneRequest $request
     *
     * @return PublishTwiceOneResponse
     */
    public function publishTwiceOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishTwiceOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param PublishTwiceOneRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return PublishTwiceOneResponse
     */
    public function publishTwiceOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishTwiceOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.one.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param ImportCreateOneRequest $request
     *
     * @return ImportCreateOneResponse
     */
    public function importCreateOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importCreateOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param ImportCreateOneRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ImportCreateOneResponse
     */
    public function importCreateOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportCreateOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.create.one.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param QueryCreateTwoRequest $request
     *
     * @return QueryCreateTwoResponse
     */
    public function queryCreateTwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreateTwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param QueryCreateTwoRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryCreateTwoResponse
     */
    public function queryCreateTwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreateTwoResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.create.two.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param ImportCreateThreeRequest $request
     *
     * @return ImportCreateThreeResponse
     */
    public function importCreateThree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importCreateThreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param ImportCreateThreeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ImportCreateThreeResponse
     */
    public function importCreateThreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportCreateThreeResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.create.three.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param WithdrawTwiceOneRequest $request
     *
     * @return WithdrawTwiceOneResponse
     */
    public function withdrawTwiceOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->withdrawTwiceOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param WithdrawTwiceOneRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return WithdrawTwiceOneResponse
     */
    public function withdrawTwiceOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return WithdrawTwiceOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.one.withdraw', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param OperateTwiceOneRequest $request
     *
     * @return OperateTwiceOneResponse
     */
    public function operateTwiceOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateTwiceOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param OperateTwiceOneRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return OperateTwiceOneResponse
     */
    public function operateTwiceOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateTwiceOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.one.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param QueryTwiceTwoRequest $request
     *
     * @return QueryTwiceTwoResponse
     */
    public function queryTwiceTwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTwiceTwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param QueryTwiceTwoRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryTwiceTwoResponse
     */
    public function queryTwiceTwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTwiceTwoResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.two.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试刷新cachekey
     * Summary: 测试刷新cachekey.
     *
     * @param QueryTestRequest $request
     *
     * @return QueryTestResponse
     */
    public function queryTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试刷新cachekey
     * Summary: 测试刷新cachekey.
     *
     * @param QueryTestRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryTestResponse
     */
    public function queryTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试刷新cachekey
     * Summary: 测试刷新cachekey.
     *
     * @param ImportTestRequest $request
     *
     * @return ImportTestResponse
     */
    public function importTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试刷新cachekey
     * Summary: 测试刷新cachekey.
     *
     * @param ImportTestRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ImportTestResponse
     */
    public function importTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.test.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试灰度刷新缓存范围
     * Summary: 测试灰度刷新缓存范围.
     *
     * @param StabilizeTestRequest $request
     *
     * @return StabilizeTestResponse
     */
    public function stabilizeTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stabilizeTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试灰度刷新缓存范围
     * Summary: 测试灰度刷新缓存范围.
     *
     * @param StabilizeTestRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return StabilizeTestResponse
     */
    public function stabilizeTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StabilizeTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.test.stabilize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param QueryTwiceThreeRequest $request
     *
     * @return QueryTwiceThreeResponse
     */
    public function queryTwiceThree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTwiceThreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param QueryTwiceThreeRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryTwiceThreeResponse
     */
    public function queryTwiceThreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTwiceThreeResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.three.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param ImportTwiceThreeRequest $request
     *
     * @return ImportTwiceThreeResponse
     */
    public function importTwiceThree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importTwiceThreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param ImportTwiceThreeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportTwiceThreeResponse
     */
    public function importTwiceThreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportTwiceThreeResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.three.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试刷新cachekey
     * Summary: 测试刷新cachekey.
     *
     * @param UnstabilizeTestRequest $request
     *
     * @return UnstabilizeTestResponse
     */
    public function unstabilizeTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unstabilizeTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试刷新cachekey
     * Summary: 测试刷新cachekey.
     *
     * @param UnstabilizeTestRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UnstabilizeTestResponse
     */
    public function unstabilizeTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnstabilizeTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.test.unstabilize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试
     * Summary: 测试.
     *
     * @param QueryTestXcRequest $request
     *
     * @return QueryTestXcResponse
     */
    public function queryTestXc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestXcEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试
     * Summary: 测试.
     *
     * @param QueryTestXcRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryTestXcResponse
     */
    public function queryTestXcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestXcResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.test.xc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryTestSyaRequest $request
     *
     * @return QueryTestSyaResponse
     */
    public function queryTestSya($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestSyaEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryTestSyaRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryTestSyaResponse
     */
    public function queryTestSyaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestSyaResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.test.sya.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param QueryQqqWwwRequest $request
     *
     * @return QueryQqqWwwResponse
     */
    public function queryQqqWww($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQqqWwwEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param QueryQqqWwwRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryQqqWwwResponse
     */
    public function queryQqqWwwEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQqqWwwResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.qqq.www.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param StabilizeTwiceThreeRequest $request
     *
     * @return StabilizeTwiceThreeResponse
     */
    public function stabilizeTwiceThree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stabilizeTwiceThreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param StabilizeTwiceThreeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return StabilizeTwiceThreeResponse
     */
    public function stabilizeTwiceThreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StabilizeTwiceThreeResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.three.stabilize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param UnstabilizeTwiceThreeRequest $request
     *
     * @return UnstabilizeTwiceThreeResponse
     */
    public function unstabilizeTwiceThree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unstabilizeTwiceThreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param UnstabilizeTwiceThreeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UnstabilizeTwiceThreeResponse
     */
    public function unstabilizeTwiceThreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnstabilizeTwiceThreeResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.twice.three.unstabilize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param QueryBbbAatestRequest $request
     *
     * @return QueryBbbAatestResponse
     */
    public function queryBbbAatest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBbbAatestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param QueryBbbAatestRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryBbbAatestResponse
     */
    public function queryBbbAatestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBbbAatestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.bbb.aatest.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param ParamLiuyzTestRequest $request
     *
     * @return ParamLiuyzTestResponse
     */
    public function paramLiuyzTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->paramLiuyzTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param ParamLiuyzTestRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ParamLiuyzTestResponse
     */
    public function paramLiuyzTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ParamLiuyzTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.liuyz.test.param', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
