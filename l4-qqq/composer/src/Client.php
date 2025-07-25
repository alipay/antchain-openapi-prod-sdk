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
use AntChain\DEMOSDK\Models\ApiAntchainAbcTestCreateRequest;
use AntChain\DEMOSDK\Models\ApiAntchainAbcTestCreateResponse;
use AntChain\DEMOSDK\Models\ImportCreateOneRequest;
use AntChain\DEMOSDK\Models\ImportCreateOneResponse;
use AntChain\DEMOSDK\Models\QueryAntchainAbcApprovalTestRequest;
use AntChain\DEMOSDK\Models\QueryAntchainAbcApprovalTestResponse;
use AntChain\DEMOSDK\Models\QueryAntchainAbcTimeFiveRequest;
use AntChain\DEMOSDK\Models\QueryAntchainAbcTimeFiveResponse;
use AntChain\DEMOSDK\Models\QueryCcXxRequest;
use AntChain\DEMOSDK\Models\QueryCcXxResponse;
use AntChain\DEMOSDK\Models\ResetBbbCccRequest;
use AntChain\DEMOSDK\Models\ResetBbbCccResponse;
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
            // 子结构体
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
                    'sdk_version'      => '2.0.2',
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
     * Description: 压测接口5
     * Summary: 压测接口5.
     *
     * @param QueryAntchainAbcTimeFiveRequest $request
     *
     * @return QueryAntchainAbcTimeFiveResponse
     */
    public function queryAntchainAbcTimeFive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAbcTimeFiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口5
     * Summary: 压测接口5.
     *
     * @param QueryAntchainAbcTimeFiveRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryAntchainAbcTimeFiveResponse
     */
    public function queryAntchainAbcTimeFiveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAbcTimeFiveResponse::fromMap($this->doRequest('1.0', 'antchain.abc.time.five.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323.
     *
     * @param QueryAntchainAbcApprovalTestRequest $request
     *
     * @return QueryAntchainAbcApprovalTestResponse
     */
    public function queryAntchainAbcApprovalTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAbcApprovalTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323.
     *
     * @param QueryAntchainAbcApprovalTestRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryAntchainAbcApprovalTestResponse
     */
    public function queryAntchainAbcApprovalTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAbcApprovalTestResponse::fromMap($this->doRequest('1.0', 'antchain.abc.approval.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试使用api
     * Summary: 测试使用api.
     *
     * @param ApiAntchainAbcTestCreateRequest $request
     *
     * @return ApiAntchainAbcTestCreateResponse
     */
    public function apiAntchainAbcTestCreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->apiAntchainAbcTestCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用api
     * Summary: 测试使用api.
     *
     * @param ApiAntchainAbcTestCreateRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ApiAntchainAbcTestCreateResponse
     */
    public function apiAntchainAbcTestCreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApiAntchainAbcTestCreateResponse::fromMap($this->doRequest('1.0', 'antchain.abc.test.create.api', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
}
