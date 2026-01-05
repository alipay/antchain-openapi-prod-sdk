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
use AntChain\DEMOSDK\Models\BindAaaBbbCccRequest;
use AntChain\DEMOSDK\Models\BindAaaBbbCccResponse;
use AntChain\DEMOSDK\Models\BindXxxRequest;
use AntChain\DEMOSDK\Models\BindXxxResponse;
use AntChain\DEMOSDK\Models\ImportAbcdOneRequest;
use AntChain\DEMOSDK\Models\ImportAbcdOneResponse;
use AntChain\DEMOSDK\Models\ImportTwiceThreeRequest;
use AntChain\DEMOSDK\Models\ImportTwiceThreeResponse;
use AntChain\DEMOSDK\Models\PublishWorkbenchFourRequest;
use AntChain\DEMOSDK\Models\PublishWorkbenchFourResponse;
use AntChain\DEMOSDK\Models\PublishWorkbenchOneRequest;
use AntChain\DEMOSDK\Models\PublishWorkbenchOneResponse;
use AntChain\DEMOSDK\Models\PublishWorkbenchThreeRequest;
use AntChain\DEMOSDK\Models\PublishWorkbenchThreeResponse;
use AntChain\DEMOSDK\Models\PublishWorkbenchTwoRequest;
use AntChain\DEMOSDK\Models\PublishWorkbenchTwoResponse;
use AntChain\DEMOSDK\Models\QueryAaaCcdRequest;
use AntChain\DEMOSDK\Models\QueryAaaCcdResponse;
use AntChain\DEMOSDK\Models\QueryAaaSdkRequest;
use AntChain\DEMOSDK\Models\QueryAaaSdkResponse;
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
            // 1
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
                    'sdk_version'      => '1.3.40',
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
     * Description: 这是测试的
     * Summary: 这是测试的.
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
     * Summary: 这是测试的.
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
     * Summary: 自动化测试创建test，请勿修改、删除.
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
     * Summary: 自动化测试创建test，请勿修改、删除.
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
     * Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用.
     *
     * @param PublishWorkbenchOneRequest $request
     *
     * @return PublishWorkbenchOneResponse
     */
    public function publishWorkbenchOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishWorkbenchOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用.
     *
     * @param PublishWorkbenchOneRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PublishWorkbenchOneResponse
     */
    public function publishWorkbenchOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishWorkbenchOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.workbench.one.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台测试
     * Summary: 个人工作台测试.
     *
     * @param PublishWorkbenchTwoRequest $request
     *
     * @return PublishWorkbenchTwoResponse
     */
    public function publishWorkbenchTwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishWorkbenchTwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台测试
     * Summary: 个人工作台测试.
     *
     * @param PublishWorkbenchTwoRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PublishWorkbenchTwoResponse
     */
    public function publishWorkbenchTwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishWorkbenchTwoResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.workbench.two.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用.
     *
     * @param PublishWorkbenchThreeRequest $request
     *
     * @return PublishWorkbenchThreeResponse
     */
    public function publishWorkbenchThree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishWorkbenchThreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用.
     *
     * @param PublishWorkbenchThreeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PublishWorkbenchThreeResponse
     */
    public function publishWorkbenchThreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishWorkbenchThreeResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.workbench.three.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用.
     *
     * @param PublishWorkbenchFourRequest $request
     *
     * @return PublishWorkbenchFourResponse
     */
    public function publishWorkbenchFour($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishWorkbenchFourEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台测试使用
     * Summary: 个人工作台测试使用.
     *
     * @param PublishWorkbenchFourRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PublishWorkbenchFourResponse
     */
    public function publishWorkbenchFourEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishWorkbenchFourResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.workbench.four.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
