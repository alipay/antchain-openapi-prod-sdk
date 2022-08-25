<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\CheckSaasSecurityInfosecOpencheckservicecheckRequest;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\CheckSaasSecurityInfosecOpencheckservicecheckResponse;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\CheckSaasSecurityRdsRdsserviceRequest;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\CheckSaasSecurityRdsRdsserviceResponse;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\QuerySaasSecurityInfosecOpencheckservicequeryRequest;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\QuerySaasSecurityInfosecOpencheckservicequeryResponse;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\QuerySaasSecurityTscenterUmidqueryserviceRequest;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\QuerySaasSecurityTscenterUmidqueryserviceResponse;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\RunAntchainSaasMarketServiceRequest;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\RunAntchainSaasMarketServiceResponse;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\VerifySaasSecurityRdslibAntcaptchaserviceRequest;
use AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models\VerifySaasSecurityRdslibAntcaptchaserviceResponse;
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
            // 大安全接口入参
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
                    '_prod_code'       => 'ak_6efc6591476e4813ac8f7c9b6359c0b7',
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
     * Description: SaaS服务调用
     * Summary: SaaS服务调用.
     *
     * @param RunAntchainSaasMarketServiceRequest $request
     *
     * @return RunAntchainSaasMarketServiceResponse
     */
    public function runAntchainSaasMarketService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->runAntchainSaasMarketServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: SaaS服务调用
     * Summary: SaaS服务调用.
     *
     * @param RunAntchainSaasMarketServiceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return RunAntchainSaasMarketServiceResponse
     */
    public function runAntchainSaasMarketServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RunAntchainSaasMarketServiceResponse::fromMap($this->doRequest('1.0', 'antchain.saas.market.service.run', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全检验内容安全接口
     * Summary: 大安全检验内容安全接口.
     *
     * @param CheckSaasSecurityInfosecOpencheckservicecheckRequest $request
     *
     * @return CheckSaasSecurityInfosecOpencheckservicecheckResponse
     */
    public function checkSaasSecurityInfosecOpencheckservicecheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSaasSecurityInfosecOpencheckservicecheckEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全检验内容安全接口
     * Summary: 大安全检验内容安全接口.
     *
     * @param CheckSaasSecurityInfosecOpencheckservicecheckRequest $request
     * @param string[]                                             $headers
     * @param RuntimeOptions                                       $runtime
     *
     * @return CheckSaasSecurityInfosecOpencheckservicecheckResponse
     */
    public function checkSaasSecurityInfosecOpencheckservicecheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSaasSecurityInfosecOpencheckservicecheckResponse::fromMap($this->doRequest('1.0', 'saas.security.infosec.opencheckservicecheck.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全内容检测结果查询接口
     * Summary: 大安全内容检测结果查询接口.
     *
     * @param QuerySaasSecurityInfosecOpencheckservicequeryRequest $request
     *
     * @return QuerySaasSecurityInfosecOpencheckservicequeryResponse
     */
    public function querySaasSecurityInfosecOpencheckservicequery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasSecurityInfosecOpencheckservicequeryEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全内容检测结果查询接口
     * Summary: 大安全内容检测结果查询接口.
     *
     * @param QuerySaasSecurityInfosecOpencheckservicequeryRequest $request
     * @param string[]                                             $headers
     * @param RuntimeOptions                                       $runtime
     *
     * @return QuerySaasSecurityInfosecOpencheckservicequeryResponse
     */
    public function querySaasSecurityInfosecOpencheckservicequeryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasSecurityInfosecOpencheckservicequeryResponse::fromMap($this->doRequest('1.0', 'saas.security.infosec.opencheckservicequery.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param CheckSaasSecurityRdsRdsserviceRequest $request
     *
     * @return CheckSaasSecurityRdsRdsserviceResponse
     */
    public function checkSaasSecurityRdsRdsservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSaasSecurityRdsRdsserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param CheckSaasSecurityRdsRdsserviceRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CheckSaasSecurityRdsRdsserviceResponse
     */
    public function checkSaasSecurityRdsRdsserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSaasSecurityRdsRdsserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.rds.rdsservice.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param VerifySaasSecurityRdslibAntcaptchaserviceRequest $request
     *
     * @return VerifySaasSecurityRdslibAntcaptchaserviceResponse
     */
    public function verifySaasSecurityRdslibAntcaptchaservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifySaasSecurityRdslibAntcaptchaserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param VerifySaasSecurityRdslibAntcaptchaserviceRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return VerifySaasSecurityRdslibAntcaptchaserviceResponse
     */
    public function verifySaasSecurityRdslibAntcaptchaserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifySaasSecurityRdslibAntcaptchaserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.rdslib.antcaptchaservice.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest $request
     *
     * @return QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse
     */
    public function querySaasSecuritySecuritycoreSecurityuniformservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasSecuritySecuritycoreSecurityuniformserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest $request
     * @param string[]                                                   $headers
     * @param RuntimeOptions                                             $runtime
     *
     * @return QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse
     */
    public function querySaasSecuritySecuritycoreSecurityuniformserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.securitycore.securityuniformservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param QuerySaasSecurityTscenterUmidqueryserviceRequest $request
     *
     * @return QuerySaasSecurityTscenterUmidqueryserviceResponse
     */
    public function querySaasSecurityTscenterUmidqueryservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasSecurityTscenterUmidqueryserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 大安全接口
     * Summary: 大安全接口.
     *
     * @param QuerySaasSecurityTscenterUmidqueryserviceRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return QuerySaasSecurityTscenterUmidqueryserviceResponse
     */
    public function querySaasSecurityTscenterUmidqueryserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasSecurityTscenterUmidqueryserviceResponse::fromMap($this->doRequest('1.0', 'saas.security.tscenter.umidqueryservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
