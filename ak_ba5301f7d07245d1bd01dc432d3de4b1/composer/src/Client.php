<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\BatchcreateDemoSaasTestTestfRequest;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\BatchcreateDemoSaasTestTestfResponse;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\CreateDemoSaasTestTesthRequest;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\CreateDemoSaasTestTesthResponse;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\CreateDemoSaasTestTestiRequest;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\CreateDemoSaasTestTestiResponse;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\OpenDemoSaasTestTestgRequest;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\OpenDemoSaasTestTestgResponse;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\OperateDemoSaasTestTesteRequest;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\OperateDemoSaasTestTesteResponse;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\PublishDemoSaasTestTestcRequest;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\PublishDemoSaasTestTestcResponse;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\ReplaceDemoSaasTestTestjRequest;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\ReplaceDemoSaasTestTestjResponse;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\ResetDemoSaasTestTestdRequest;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\ResetDemoSaasTestTestdResponse;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\SendDemoSaasTestTestkRequest;
use AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models\SendDemoSaasTestTestkResponse;
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
                    'sdk_version'      => '1.0.3',
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
     * @param OpenDemoSaasTestTestgRequest $request
     *
     * @return OpenDemoSaasTestTestgResponse
     */
    public function openDemoSaasTestTestg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openDemoSaasTestTestgEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param OpenDemoSaasTestTestgRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return OpenDemoSaasTestTestgResponse
     */
    public function openDemoSaasTestTestgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenDemoSaasTestTestgResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testg.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param SendDemoSaasTestTestkRequest $request
     *
     * @return SendDemoSaasTestTestkResponse
     */
    public function sendDemoSaasTestTestk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendDemoSaasTestTestkEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享能力租户流量测试
     * Summary: 共享能力租户流量测试.
     *
     * @param SendDemoSaasTestTestkRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SendDemoSaasTestTestkResponse
     */
    public function sendDemoSaasTestTestkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendDemoSaasTestTestkResponse::fromMap($this->doRequest('1.0', 'demo.saas.test.testk.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
