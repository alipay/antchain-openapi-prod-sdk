<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAT;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\CAT\Models\BindHuanyuRequest;
use AntChain\CAT\Models\BindHuanyuResponse;
use AntChain\CAT\Models\BindTestRequest;
use AntChain\CAT\Models\BindTestResponse;
use AntChain\CAT\Models\GetAgeRequest;
use AntChain\CAT\Models\GetAgeResponse;
use AntChain\CAT\Models\ImportAbcdRequest;
use AntChain\CAT\Models\ImportAbcdResponse;
use AntChain\CAT\Models\QueryTestaTestbRequest;
use AntChain\CAT\Models\QueryTestaTestbResponse;
use AntChain\CAT\Models\QueryTestCccRequest;
use AntChain\CAT\Models\QueryTestCccResponse;
use AntChain\CAT\Models\WithdrawLoadtestTestRequest;
use AntChain\CAT\Models\WithdrawLoadtestTestResponse;
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
                    'sdk_version'      => '1.0.2',
                    '_prod_code'       => 'CAT',
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
     * Description: 这接口用于获取猫猫的年龄
     * Summary: 获取猫猫的年龄.
     *
     * @param GetAgeRequest $request
     *
     * @return GetAgeResponse
     */
    public function getAge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 这接口用于获取猫猫的年龄
     * Summary: 获取猫猫的年龄.
     *
     * @param GetAgeRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetAgeResponse
     */
    public function getAgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAgeResponse::fromMap($this->doRequest('1.0', 'antcloud.cat.age.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: s d
     * Summary: s d f.
     *
     * @param WithdrawLoadtestTestRequest $request
     *
     * @return WithdrawLoadtestTestResponse
     */
    public function withdrawLoadtestTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->withdrawLoadtestTestEx($request, $headers, $runtime);
    }

    /**
     * Description: s d
     * Summary: s d f.
     *
     * @param WithdrawLoadtestTestRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return WithdrawLoadtestTestResponse
     */
    public function withdrawLoadtestTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return WithdrawLoadtestTestResponse::fromMap($this->doRequest('1.0', 'antcloud.cat.loadtest.test.withdraw', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: huanyue
     * Summary: huanyu.
     *
     * @param BindHuanyuRequest $request
     *
     * @return BindHuanyuResponse
     */
    public function bindHuanyu($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindHuanyuEx($request, $headers, $runtime);
    }

    /**
     * Description: huanyue
     * Summary: huanyu.
     *
     * @param BindHuanyuRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return BindHuanyuResponse
     */
    public function bindHuanyuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindHuanyuResponse::fromMap($this->doRequest('1.0', 'antcloud.cat.huanyu.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: tests
     * Summary: test.
     *
     * @param BindTestRequest $request
     *
     * @return BindTestResponse
     */
    public function bindTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindTestEx($request, $headers, $runtime);
    }

    /**
     * Description: tests
     * Summary: test.
     *
     * @param BindTestRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return BindTestResponse
     */
    public function bindTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindTestResponse::fromMap($this->doRequest('1.0', 'antcloud.cat.test.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: testt
     * Summary: testt.
     *
     * @param QueryTestCccRequest $request
     *
     * @return QueryTestCccResponse
     */
    public function queryTestCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestCccEx($request, $headers, $runtime);
    }

    /**
     * Description: testt
     * Summary: testt.
     *
     * @param QueryTestCccRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryTestCccResponse
     */
    public function queryTestCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestCccResponse::fromMap($this->doRequest('1.0', 'antcloud.cat.test.ccc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1234
     * Summary: 1234.
     *
     * @param ImportAbcdRequest $request
     *
     * @return ImportAbcdResponse
     */
    public function importAbcd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importAbcdEx($request, $headers, $runtime);
    }

    /**
     * Description: 1234
     * Summary: 1234.
     *
     * @param ImportAbcdRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ImportAbcdResponse
     */
    public function importAbcdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportAbcdResponse::fromMap($this->doRequest('1.0', 'antcloud.cat.abcd.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cat测试适用，包含能力中心九期打标功能测试1
     * Summary: cat测试1.
     *
     * @param QueryTestaTestbRequest $request
     *
     * @return QueryTestaTestbResponse
     */
    public function queryTestaTestb($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTestaTestbEx($request, $headers, $runtime);
    }

    /**
     * Description: cat测试适用，包含能力中心九期打标功能测试1
     * Summary: cat测试1.
     *
     * @param QueryTestaTestbRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryTestaTestbResponse
     */
    public function queryTestaTestbEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTestaTestbResponse::fromMap($this->doRequest('1.0', 'antcloud.cat.testa.testb.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
