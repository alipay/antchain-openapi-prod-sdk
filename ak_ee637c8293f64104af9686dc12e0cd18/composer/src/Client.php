<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ee637c8293f64104af9686dc12e0cd18;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\BindDemoSdfSssSssRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\BindDemoSdfSssSssResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\BindDemoSssSsSsRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\BindDemoSssSsSsResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\BindDemoTestTestTestRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\BindDemoTestTestTestResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\CreateDemoSaasTestTesthRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\CreateDemoSaasTestTesthResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\CreateDemoSaasTestTestiRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\CreateDemoSaasTestTestiResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\PublishDemoSaasTestTestcRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\PublishDemoSaasTestTestcResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoCjtestCjResRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoCjtestCjResResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoTestTestobjectBbbRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoTestTestobjectBbbResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoTestyyQRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoTestyyQResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoTestzzQRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoTestzzQResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoTestzzzQRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoTestzzzQResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoXyzDemoXxxRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoXyzDemoXxxResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoZolozFacecompareRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\QueryDemoZolozFacecompareResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\RegisterDemoTestBizeventMessageRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\RegisterDemoTestBizeventMessageResponse;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\ReplaceDemoSaasTestTestjRequest;
use AntChain\Ak_ee637c8293f64104af9686dc12e0cd18\Models\ReplaceDemoSaasTestTestjResponse;
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
            // 大安全佐罗测试接口结构体
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
                    'sdk_version'      => '1.0.178',
                    '_prod_code'       => 'ak_ee637c8293f64104af9686dc12e0cd18',
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
     * Description: sss
     * Summary: ss.
     *
     * @param BindDemoSssSsSsRequest $request
     *
     * @return BindDemoSssSsSsResponse
     */
    public function bindDemoSssSsSs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindDemoSssSsSsEx($request, $headers, $runtime);
    }

    /**
     * Description: sss
     * Summary: ss.
     *
     * @param BindDemoSssSsSsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return BindDemoSssSsSsResponse
     */
    public function bindDemoSssSsSsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindDemoSssSsSsResponse::fromMap($this->doRequest('1.0', 'demo.sss.ss.ss.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: testaaa
     * Summary: test.
     *
     * @param BindDemoTestTestTestRequest $request
     *
     * @return BindDemoTestTestTestResponse
     */
    public function bindDemoTestTestTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindDemoTestTestTestEx($request, $headers, $runtime);
    }

    /**
     * Description: testaaa
     * Summary: test.
     *
     * @param BindDemoTestTestTestRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return BindDemoTestTestTestResponse
     */
    public function bindDemoTestTestTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindDemoTestTestTestResponse::fromMap($this->doRequest('1.0', 'demo.test.test.test.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试添加api
     * Summary: 测试用api.
     *
     * @param QueryDemoTestTestobjectBbbRequest $request
     *
     * @return array|QueryDemoTestTestobjectBbbResponse
     */
    public function queryDemoTestTestobjectBbb($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoTestTestobjectBbbEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试添加api
     * Summary: 测试用api.
     *
     * @param QueryDemoTestTestobjectBbbRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return array|QueryDemoTestTestobjectBbbResponse
     */
    public function queryDemoTestTestobjectBbbEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoTestTestobjectBbbResponse::fromMap($this->doRequest('1.0', 'demo.test.testobject.bbb.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: sdf
     * Summary: sdf.
     *
     * @param BindDemoSdfSssSssRequest $request
     *
     * @return BindDemoSdfSssSssResponse
     */
    public function bindDemoSdfSssSss($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindDemoSdfSssSssEx($request, $headers, $runtime);
    }

    /**
     * Description: sdf
     * Summary: sdf.
     *
     * @param BindDemoSdfSssSssRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return BindDemoSdfSssSssResponse
     */
    public function bindDemoSdfSssSssEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindDemoSdfSssSssResponse::fromMap($this->doRequest('1.0', 'demo.sdf.sss.sss.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费.
     *
     * @param RegisterDemoTestBizeventMessageRequest $request
     *
     * @return RegisterDemoTestBizeventMessageResponse
     */
    public function registerDemoTestBizeventMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerDemoTestBizeventMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 随机测试
     * Summary: 消息发送及消费.
     *
     * @param RegisterDemoTestBizeventMessageRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return RegisterDemoTestBizeventMessageResponse
     */
    public function registerDemoTestBizeventMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterDemoTestBizeventMessageResponse::fromMap($this->doRequest('1.0', 'demo.test.bizevent.message.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cj test
     * Summary: cj test.
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
     * Description: cj test
     * Summary: cj test.
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
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param ReplaceDemoSaasTestTestjRequest $request
     *
     * @return ReplaceDemoSaasTestTestjResponse
     */
    public function replaceDemoSaasTestTestj($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceDemoSaasTestTestjEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param ReplaceDemoSaasTestTestjRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ReplaceDemoSaasTestTestjResponse
     */
    public function replaceDemoSaasTestTestjEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceDemoSaasTestTestjResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testj.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 2
     * Summary: 2.
     *
     * @param QueryDemoTestyyQRequest $request
     *
     * @return QueryDemoTestyyQResponse
     */
    public function queryDemoTestyyQ($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoTestyyQEx($request, $headers, $runtime);
    }

    /**
     * Description: 2
     * Summary: 2.
     *
     * @param QueryDemoTestyyQRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDemoTestyyQResponse
     */
    public function queryDemoTestyyQEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoTestyyQResponse::fromMap($this->doRequest('1.0', 'demo.testyy.q.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1
     * Summary: 1.
     *
     * @param QueryDemoTestzzQRequest $request
     *
     * @return QueryDemoTestzzQResponse
     */
    public function queryDemoTestzzQ($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoTestzzQEx($request, $headers, $runtime);
    }

    /**
     * Description: 1
     * Summary: 1.
     *
     * @param QueryDemoTestzzQRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDemoTestzzQResponse
     */
    public function queryDemoTestzzQEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoTestzzQResponse::fromMap($this->doRequest('1.0', 'demo.testzz.q.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1
     * Summary: 1.
     *
     * @param QueryDemoTestzzzQRequest $request
     *
     * @return QueryDemoTestzzzQResponse
     */
    public function queryDemoTestzzzQ($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoTestzzzQEx($request, $headers, $runtime);
    }

    /**
     * Description: 1
     * Summary: 1.
     *
     * @param QueryDemoTestzzzQRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryDemoTestzzzQResponse
     */
    public function queryDemoTestzzzQEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoTestzzzQResponse::fromMap($this->doRequest('1.0', 'demo.testzzz.q.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试佐罗接口
     * Summary: 测试佐罗接口.
     *
     * @param QueryDemoZolozFacecompareRequest $request
     *
     * @return QueryDemoZolozFacecompareResponse
     */
    public function queryDemoZolozFacecompare($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoZolozFacecompareEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试佐罗接口
     * Summary: 测试佐罗接口.
     *
     * @param QueryDemoZolozFacecompareRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryDemoZolozFacecompareResponse
     */
    public function queryDemoZolozFacecompareEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoZolozFacecompareResponse::fromMap($this->doRequest('1.0', 'demo.zoloz.facecompare.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryDemoXyzDemoXxxRequest $request
     *
     * @return QueryDemoXyzDemoXxxResponse
     */
    public function queryDemoXyzDemoXxx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoXyzDemoXxxEx($request, $headers, $runtime);
    }

    /**
     * Description: test
     * Summary: test.
     *
     * @param QueryDemoXyzDemoXxxRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDemoXyzDemoXxxResponse
     */
    public function queryDemoXyzDemoXxxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoXyzDemoXxxResponse::fromMap($this->doRequest('1.0', 'demo.xyz.demo.xxx.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
