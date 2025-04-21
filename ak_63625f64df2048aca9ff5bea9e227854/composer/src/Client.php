<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_63625f64df2048aca9ff5bea9e227854;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models\CheckAntcloudAitechguardAicoguardrailsAnswerRequest;
use AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models\CheckAntcloudAitechguardAicoguardrailsAnswerResponse;
use AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models\CheckAntcloudAitechguardAicoguardrailsAskRequest;
use AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models\CheckAntcloudAitechguardAicoguardrailsAskResponse;
use AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models\CheckDemoAicoguardcoreAicoguardrailsQuestionRequest;
use AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models\CheckDemoAicoguardcoreAicoguardrailsQuestionResponse;
use AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models\QueryAitechCommGuardcoreRedgptRequest;
use AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models\QueryAitechCommGuardcoreRedgptResponse;
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
            // maya响应体
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
                    'sdk_version'      => '1.0.7',
                    '_prod_code'       => 'ak_63625f64df2048aca9ff5bea9e227854',
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
     * Description: 大模型护栏多轮对话提问检测 测试
     * Summary: 大模型护栏多轮对话提问检测.
     *
     * @param CheckDemoAicoguardcoreAicoguardrailsQuestionRequest $request
     *
     * @return CheckDemoAicoguardcoreAicoguardrailsQuestionResponse
     */
    public function checkDemoAicoguardcoreAicoguardrailsQuestion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkDemoAicoguardcoreAicoguardrailsQuestionEx($request, $headers, $runtime);
    }

    /**
     * Description: 大模型护栏多轮对话提问检测 测试
     * Summary: 大模型护栏多轮对话提问检测.
     *
     * @param CheckDemoAicoguardcoreAicoguardrailsQuestionRequest $request
     * @param string[]                                            $headers
     * @param RuntimeOptions                                      $runtime
     *
     * @return CheckDemoAicoguardcoreAicoguardrailsQuestionResponse
     */
    public function checkDemoAicoguardcoreAicoguardrailsQuestionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckDemoAicoguardcoreAicoguardrailsQuestionResponse::fromMap($this->doRequest('1.0', 'demo.aicoguardcore.aicoguardrails.question.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提问检测服务接口
     * Summary: 提问检测服务接口.
     *
     * @param CheckAntcloudAitechguardAicoguardrailsAskRequest $request
     *
     * @return CheckAntcloudAitechguardAicoguardrailsAskResponse
     */
    public function checkAntcloudAitechguardAicoguardrailsAsk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAntcloudAitechguardAicoguardrailsAskEx($request, $headers, $runtime);
    }

    /**
     * Description: 提问检测服务接口
     * Summary: 提问检测服务接口.
     *
     * @param CheckAntcloudAitechguardAicoguardrailsAskRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return CheckAntcloudAitechguardAicoguardrailsAskResponse
     */
    public function checkAntcloudAitechguardAicoguardrailsAskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAntcloudAitechguardAicoguardrailsAskResponse::fromMap($this->doRequest('1.0', 'antcloud.aitechguard.aicoguardrails.ask.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aicoguardcore对接天鉴回答检测服务接口
     * Summary: 天鉴回答检测服务接口.
     *
     * @param CheckAntcloudAitechguardAicoguardrailsAnswerRequest $request
     *
     * @return CheckAntcloudAitechguardAicoguardrailsAnswerResponse
     */
    public function checkAntcloudAitechguardAicoguardrailsAnswer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAntcloudAitechguardAicoguardrailsAnswerEx($request, $headers, $runtime);
    }

    /**
     * Description: aicoguardcore对接天鉴回答检测服务接口
     * Summary: 天鉴回答检测服务接口.
     *
     * @param CheckAntcloudAitechguardAicoguardrailsAnswerRequest $request
     * @param string[]                                            $headers
     * @param RuntimeOptions                                      $runtime
     *
     * @return CheckAntcloudAitechguardAicoguardrailsAnswerResponse
     */
    public function checkAntcloudAitechguardAicoguardrailsAnswerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAntcloudAitechguardAicoguardrailsAnswerResponse::fromMap($this->doRequest('1.0', 'antcloud.aitechguard.aicoguardrails.answer.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 红色GPT流式调用网关接口
     * Summary: 红色GPT网关方式调用接口.
     *
     * @param QueryAitechCommGuardcoreRedgptRequest $request
     *
     * @return QueryAitechCommGuardcoreRedgptResponse
     */
    public function queryAitechCommGuardcoreRedgpt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAitechCommGuardcoreRedgptEx($request, $headers, $runtime);
    }

    /**
     * Description: 红色GPT流式调用网关接口
     * Summary: 红色GPT网关方式调用接口.
     *
     * @param QueryAitechCommGuardcoreRedgptRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryAitechCommGuardcoreRedgptResponse
     */
    public function queryAitechCommGuardcoreRedgptEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAitechCommGuardcoreRedgptResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guardcore.redgpt.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
