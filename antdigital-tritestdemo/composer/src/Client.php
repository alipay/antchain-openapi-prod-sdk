<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRITESTDEMO;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\TRITESTDEMO\Models\BenchCreateTestForRequest;
use AntChain\TRITESTDEMO\Models\BenchCreateTestForResponse;
use AntChain\TRITESTDEMO\Models\OneCreateTestForBenchRequest;
use AntChain\TRITESTDEMO\Models\OneCreateTestForBenchResponse;
use AntChain\TRITESTDEMO\Models\QueryDebugPassedRequest;
use AntChain\TRITESTDEMO\Models\QueryDebugPassedResponse;
use AntChain\TRITESTDEMO\Models\QueryDemoTestsysyTesxXxxRequest;
use AntChain\TRITESTDEMO\Models\QueryDemoTestsysyTesxXxxResponse;
use AntChain\TRITESTDEMO\Models\QueryExternalFailureRequest;
use AntChain\TRITESTDEMO\Models\QueryExternalFailureResponse;
use AntChain\TRITESTDEMO\Models\QueryInternalFailureRequest;
use AntChain\TRITESTDEMO\Models\QueryInternalFailureResponse;
use AntChain\TRITESTDEMO\Models\QueryTrApiRequest;
use AntChain\TRITESTDEMO\Models\QueryTrApiResponse;
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
                    'sdk_version'      => '1.0.0',
                    '_prod_code'       => 'TRITESTDEMO',
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
     * Description: 测试流程使用
     * Summary: 测试流程使用.
     *
     * @param QueryDemoTestsysyTesxXxxRequest $request
     *
     * @return QueryDemoTestsysyTesxXxxResponse
     */
    public function queryDemoTestsysyTesxXxx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoTestsysyTesxXxxEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试流程使用
     * Summary: 测试流程使用.
     *
     * @param QueryDemoTestsysyTesxXxxRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryDemoTestsysyTesxXxxResponse
     */
    public function queryDemoTestsysyTesxXxxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoTestsysyTesxXxxResponse::fromMap($this->doRequest('1.0', 'demo.testsysy.tesx.xxx.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: tri测试，调试通过接口
     * Summary: tri测试，调试通过接口.
     *
     * @param QueryDebugPassedRequest $request
     *
     * @return QueryDebugPassedResponse
     */
    public function queryDebugPassed($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDebugPassedEx($request, $headers, $runtime);
    }

    /**
     * Description: tri测试，调试通过接口
     * Summary: tri测试，调试通过接口.
     *
     * @param QueryDebugPassedRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDebugPassedResponse
     */
    public function queryDebugPassedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDebugPassedResponse::fromMap($this->doRequest('1.0', 'antcloud.tritestdemo.debug.passed.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: tri测试，内部接口且调用失败
     * Summary: tri测试，内部接口且调用失败.
     *
     * @param QueryInternalFailureRequest $request
     *
     * @return QueryInternalFailureResponse
     */
    public function queryInternalFailure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInternalFailureEx($request, $headers, $runtime);
    }

    /**
     * Description: tri测试，内部接口且调用失败
     * Summary: tri测试，内部接口且调用失败.
     *
     * @param QueryInternalFailureRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryInternalFailureResponse
     */
    public function queryInternalFailureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInternalFailureResponse::fromMap($this->doRequest('1.0', 'antcloud.tritestdemo.internal.failure.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: tr协议测试使用，外部接口且调用不通过
     * Summary: tr协议测试使用，外部接口且调用不通过.
     *
     * @param QueryExternalFailureRequest $request
     *
     * @return QueryExternalFailureResponse
     */
    public function queryExternalFailure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryExternalFailureEx($request, $headers, $runtime);
    }

    /**
     * Description: tr协议测试使用，外部接口且调用不通过
     * Summary: tr协议测试使用，外部接口且调用不通过.
     *
     * @param QueryExternalFailureRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryExternalFailureResponse
     */
    public function queryExternalFailureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryExternalFailureResponse::fromMap($this->doRequest('1.0', 'antcloud.tritestdemo.external.failure.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: tr接口
     * Summary: tr接口.
     *
     * @param QueryTrApiRequest $request
     *
     * @return QueryTrApiResponse
     */
    public function queryTrApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTrApiEx($request, $headers, $runtime);
    }

    /**
     * Description: tr接口
     * Summary: tr接口.
     *
     * @param QueryTrApiRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryTrApiResponse
     */
    public function queryTrApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTrApiResponse::fromMap($this->doRequest('1.0', 'antcloud.tritestdemo.tr.api.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用.
     *
     * @param BenchCreateTestForRequest $request
     *
     * @return BenchCreateTestForResponse
     */
    public function benchCreateTestFor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->benchCreateTestForEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用.
     *
     * @param BenchCreateTestForRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return BenchCreateTestForResponse
     */
    public function benchCreateTestForEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BenchCreateTestForResponse::fromMap($this->doRequest('1.0', 'antcloud.tritestdemo.create.test.for.bench', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用.
     *
     * @param OneCreateTestForBenchRequest $request
     *
     * @return OneCreateTestForBenchResponse
     */
    public function oneCreateTestForBench($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->oneCreateTestForBenchEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用
     * Summary: 测试使用.
     *
     * @param OneCreateTestForBenchRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return OneCreateTestForBenchResponse
     */
    public function oneCreateTestForBenchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OneCreateTestForBenchResponse::fromMap($this->doRequest('1.0', 'antcloud.tritestdemo.create.test.for.bench.one', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
