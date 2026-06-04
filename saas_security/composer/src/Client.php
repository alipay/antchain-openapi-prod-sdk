<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS_SECURITY;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\SAAS_SECURITY\Models\CheckInfosecHoloxcontentcheckserviceRequest;
use AntChain\SAAS_SECURITY\Models\CheckInfosecHoloxcontentcheckserviceResponse;
use AntChain\SAAS_SECURITY\Models\CheckInfosecOpencheckservicecheckRequest;
use AntChain\SAAS_SECURITY\Models\CheckInfosecOpencheckservicecheckResponse;
use AntChain\SAAS_SECURITY\Models\CheckRdsRdsserviceRequest;
use AntChain\SAAS_SECURITY\Models\CheckRdsRdsserviceResponse;
use AntChain\SAAS_SECURITY\Models\QueryDemoRequest;
use AntChain\SAAS_SECURITY\Models\QueryDemoResponse;
use AntChain\SAAS_SECURITY\Models\QueryGuardAskRequest;
use AntChain\SAAS_SECURITY\Models\QueryGuardAskResponse;
use AntChain\SAAS_SECURITY\Models\QueryInfosecHoloxcontentcheckqueryserviceRequest;
use AntChain\SAAS_SECURITY\Models\QueryInfosecHoloxcontentcheckqueryserviceResponse;
use AntChain\SAAS_SECURITY\Models\QueryInfosecOpencheckservicequeryRequest;
use AntChain\SAAS_SECURITY\Models\QueryInfosecOpencheckservicequeryResponse;
use AntChain\SAAS_SECURITY\Models\QuerySecuritycoreSecurityuniformserviceRequest;
use AntChain\SAAS_SECURITY\Models\QuerySecuritycoreSecurityuniformserviceResponse;
use AntChain\SAAS_SECURITY\Models\QueryTscenterUmidqueryserviceRequest;
use AntChain\SAAS_SECURITY\Models\QueryTscenterUmidqueryserviceResponse;
use AntChain\SAAS_SECURITY\Models\VerifyRdslibAntcaptchaserviceRequest;
use AntChain\SAAS_SECURITY\Models\VerifyRdslibAntcaptchaserviceResponse;
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
            // 123
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
                    'sdk_version'      => '1.0.28',
                    '_prod_code'       => 'SAAS_SECURITY',
                    '_prod_channel'    => 'undefined',
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
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param CheckInfosecHoloxcontentcheckserviceRequest $request
     *
     * @return CheckInfosecHoloxcontentcheckserviceResponse
     */
    public function checkInfosecHoloxcontentcheckservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkInfosecHoloxcontentcheckserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param CheckInfosecHoloxcontentcheckserviceRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return CheckInfosecHoloxcontentcheckserviceResponse
     */
    public function checkInfosecHoloxcontentcheckserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckInfosecHoloxcontentcheckserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.infosec.holoxcontentcheckservice.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param QuerySecuritycoreSecurityuniformserviceRequest $request
     *
     * @return QuerySecuritycoreSecurityuniformserviceResponse
     */
    public function querySecuritycoreSecurityuniformservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySecuritycoreSecurityuniformserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param QuerySecuritycoreSecurityuniformserviceRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return QuerySecuritycoreSecurityuniformserviceResponse
     */
    public function querySecuritycoreSecurityuniformserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySecuritycoreSecurityuniformserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.securitycore.securityuniformservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param CheckRdsRdsserviceRequest $request
     *
     * @return CheckRdsRdsserviceResponse
     */
    public function checkRdsRdsservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkRdsRdsserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param CheckRdsRdsserviceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CheckRdsRdsserviceResponse
     */
    public function checkRdsRdsserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckRdsRdsserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.rds.rdsservice.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 123
     * Summary: 大安全内容风控接口.
     *
     * @param QueryInfosecHoloxcontentcheckqueryserviceRequest $request
     *
     * @return QueryInfosecHoloxcontentcheckqueryserviceResponse
     */
    public function queryInfosecHoloxcontentcheckqueryservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInfosecHoloxcontentcheckqueryserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 123
     * Summary: 大安全内容风控接口.
     *
     * @param QueryInfosecHoloxcontentcheckqueryserviceRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return QueryInfosecHoloxcontentcheckqueryserviceResponse
     */
    public function queryInfosecHoloxcontentcheckqueryserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInfosecHoloxcontentcheckqueryserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.infosec.holoxcontentcheckqueryservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param VerifyRdslibAntcaptchaserviceRequest $request
     *
     * @return VerifyRdslibAntcaptchaserviceResponse
     */
    public function verifyRdslibAntcaptchaservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyRdslibAntcaptchaserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param VerifyRdslibAntcaptchaserviceRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return VerifyRdslibAntcaptchaserviceResponse
     */
    public function verifyRdslibAntcaptchaserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyRdslibAntcaptchaserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.rdslib.antcaptchaservice.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param QueryTscenterUmidqueryserviceRequest $request
     *
     * @return QueryTscenterUmidqueryserviceResponse
     */
    public function queryTscenterUmidqueryservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTscenterUmidqueryserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param QueryTscenterUmidqueryserviceRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryTscenterUmidqueryserviceResponse
     */
    public function queryTscenterUmidqueryserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTscenterUmidqueryserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.tscenter.umidqueryservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全检验内容安全接口
     * Summary: 大安全检验内容安全接口.
     *
     * @param CheckInfosecOpencheckservicecheckRequest $request
     *
     * @return CheckInfosecOpencheckservicecheckResponse
     */
    public function checkInfosecOpencheckservicecheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkInfosecOpencheckservicecheckEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全检验内容安全接口
     * Summary: 大安全检验内容安全接口.
     *
     * @param CheckInfosecOpencheckservicecheckRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return CheckInfosecOpencheckservicecheckResponse
     */
    public function checkInfosecOpencheckservicecheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckInfosecOpencheckservicecheckResponse::fromMap($this->doRequest('1.0', 'saas.security.infosec.opencheckservicecheck.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全内容检测结果查询接口
     * Summary: 大安全内容检测结果查询接口.
     *
     * @param QueryInfosecOpencheckservicequeryRequest $request
     *
     * @return QueryInfosecOpencheckservicequeryResponse
     */
    public function queryInfosecOpencheckservicequery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInfosecOpencheckservicequeryEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全内容检测结果查询接口
     * Summary: 大安全内容检测结果查询接口.
     *
     * @param QueryInfosecOpencheckservicequeryRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryInfosecOpencheckservicequeryResponse
     */
    public function queryInfosecOpencheckservicequeryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInfosecOpencheckservicequeryResponse::fromMap($this->doRequest('1.0', 'saas.security.infosec.opencheckservicequery.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param QueryDemoRequest $request
     *
     * @return QueryDemoResponse
     */
    public function queryDemo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param QueryDemoRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryDemoResponse
     */
    public function queryDemoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoResponse::fromMap($this->doRequest('1.0', 'saas.security.demo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天鉴ask接口
     * Summary: 天鉴ask接口.
     *
     * @param QueryGuardAskRequest $request
     *
     * @return QueryGuardAskResponse
     */
    public function queryGuardAsk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardAskEx($request, $headers, $runtime);
    }

    /**
     * Description: 天鉴ask接口
     * Summary: 天鉴ask接口.
     *
     * @param QueryGuardAskRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryGuardAskResponse
     */
    public function queryGuardAskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardAskResponse::fromMap($this->doRequest('1.0', 'saas.security.guard.ask.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
