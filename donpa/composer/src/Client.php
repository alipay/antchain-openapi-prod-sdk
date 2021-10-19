<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DONPA\Models\BindSlxfRequest;
use AntChain\DONPA\Models\BindSlxfResponse;
use AntChain\DONPA\Models\PullSlxfRequest;
use AntChain\DONPA\Models\PullSlxfResponse;
use AntChain\DONPA\Models\QueryPredictRequest;
use AntChain\DONPA\Models\QueryPredictResponse;
use AntChain\DONPA\Models\QuerySlxfRequest;
use AntChain\DONPA\Models\QuerySlxfResponse;
use AntChain\DONPA\Models\StartSlxfRequest;
use AntChain\DONPA\Models\StartSlxfResponse;
use AntChain\DONPA\Models\UnbindSlxfRequest;
use AntChain\DONPA\Models\UnbindSlxfResponse;
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
            // 修复数据
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
                    'sdk_version'      => '1.0.14',
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
     * Description: 资产定价处置预测
     * Summary: 资产定价处置预测.
     *
     * @param QueryPredictRequest $request
     *
     * @return QueryPredictResponse
     */
    public function queryPredict($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPredictEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产定价处置预测
     * Summary: 资产定价处置预测.
     *
     * @param QueryPredictRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryPredictResponse
     */
    public function queryPredictEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPredictResponse::fromMap($this->doRequest('1.0', 'antchain.donpa.predict.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 失联修复发起API接口
     * Summary: 失联修复发起API接口.
     *
     * @param StartSlxfRequest $request
     *
     * @return StartSlxfResponse
     */
    public function startSlxf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startSlxfEx($request, $headers, $runtime);
    }

    /**
     * Description: 失联修复发起API接口
     * Summary: 失联修复发起API接口.
     *
     * @param StartSlxfRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return StartSlxfResponse
     */
    public function startSlxfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartSlxfResponse::fromMap($this->doRequest('1.0', 'antchain.donpa.slxf.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过修复批次号获取修复结果，判断是否可以外呼。修复是异步的，一般需要 2 个小时。建议客户半小时 定时轮询一次，直至批次状态为终态（已修复或者修 复失败）
     * Summary: 获取修复结果接口.
     *
     * @param PullSlxfRequest $request
     *
     * @return PullSlxfResponse
     */
    public function pullSlxf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullSlxfEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过修复批次号获取修复结果，判断是否可以外呼。修复是异步的，一般需要 2 个小时。建议客户半小时 定时轮询一次，直至批次状态为终态（已修复或者修 复失败）
     * Summary: 获取修复结果接口.
     *
     * @param PullSlxfRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return PullSlxfResponse
     */
    public function pullSlxfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullSlxfResponse::fromMap($this->doRequest('1.0', 'antchain.donpa.slxf.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据身份证号查询修复的脱敏手机号码
     * Summary: 查询修复结果.
     *
     * @param QuerySlxfRequest $request
     *
     * @return QuerySlxfResponse
     */
    public function querySlxf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySlxfEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据身份证号查询修复的脱敏手机号码
     * Summary: 查询修复结果.
     *
     * @param QuerySlxfRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QuerySlxfResponse
     */
    public function querySlxfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySlxfResponse::fromMap($this->doRequest('1.0', 'antchain.donpa.slxf.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 绑定虚拟小号，绑定的虚拟小号失效时间为 1 个小时，1 个小时后自动解绑
     * Summary: 绑定虚拟小号接口.
     *
     * @param BindSlxfRequest $request
     *
     * @return BindSlxfResponse
     */
    public function bindSlxf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindSlxfEx($request, $headers, $runtime);
    }

    /**
     * Description: 绑定虚拟小号，绑定的虚拟小号失效时间为 1 个小时，1 个小时后自动解绑
     * Summary: 绑定虚拟小号接口.
     *
     * @param BindSlxfRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return BindSlxfResponse
     */
    public function bindSlxfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindSlxfResponse::fromMap($this->doRequest('1.0', 'antchain.donpa.slxf.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解绑虚拟小号
     * Summary: 解绑虚拟小号接口.
     *
     * @param UnbindSlxfRequest $request
     *
     * @return UnbindSlxfResponse
     */
    public function unbindSlxf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindSlxfEx($request, $headers, $runtime);
    }

    /**
     * Description: 解绑虚拟小号
     * Summary: 解绑虚拟小号接口.
     *
     * @param UnbindSlxfRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return UnbindSlxfResponse
     */
    public function unbindSlxfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindSlxfResponse::fromMap($this->doRequest('1.0', 'antchain.donpa.slxf.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
