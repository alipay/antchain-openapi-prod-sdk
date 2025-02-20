<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BXPT_NEW;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BXPT_NEW\Models\ExecDataproductAsyncRequest;
use AntChain\BXPT_NEW\Models\ExecDataproductAsyncResponse;
use AntChain\BXPT_NEW\Models\ExecDataproductRequest;
use AntChain\BXPT_NEW\Models\ExecDataproductResponse;
use AntChain\BXPT_NEW\Models\PushDatapromotionTrafficRequest;
use AntChain\BXPT_NEW\Models\PushDatapromotionTrafficResponse;
use AntChain\BXPT_NEW\Models\QueryDataproductAsyncRequest;
use AntChain\BXPT_NEW\Models\QueryDataproductAsyncResponse;
use AntChain\BXPT_NEW\Models\QueryDatapromotionDecisionRequest;
use AntChain\BXPT_NEW\Models\QueryDatapromotionDecisionResponse;
use AntChain\BXPT_NEW\Models\ReceiveDrrdataTrackRequest;
use AntChain\BXPT_NEW\Models\ReceiveDrrdataTrackResponse;
use AntChain\BXPT_NEW\Models\SubmitDrrdataSubscriptionRequest;
use AntChain\BXPT_NEW\Models\SubmitDrrdataSubscriptionResponse;
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
                    'sdk_version'      => '1.2.16',
                    '_prod_code'       => 'BXPT_NEW',
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
     * Description: 保险数据产品服务调用
     * Summary: 保险数据产品服务调用.
     *
     * @param ExecDataproductRequest $request
     *
     * @return ExecDataproductResponse
     */
    public function execDataproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execDataproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险数据产品服务调用
     * Summary: 保险数据产品服务调用.
     *
     * @param ExecDataproductRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecDataproductResponse
     */
    public function execDataproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecDataproductResponse::fromMap($this->doRequest('1.0', 'antcloud.bxptnew.dataproduct.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险数据产品服务异步调用
     * Summary: 保险数据产品服务异步调用.
     *
     * @param ExecDataproductAsyncRequest $request
     *
     * @return ExecDataproductAsyncResponse
     */
    public function execDataproductAsync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execDataproductAsyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险数据产品服务异步调用
     * Summary: 保险数据产品服务异步调用.
     *
     * @param ExecDataproductAsyncRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExecDataproductAsyncResponse
     */
    public function execDataproductAsyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecDataproductAsyncResponse::fromMap($this->doRequest('1.0', 'antcloud.bxptnew.dataproduct.async.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险数据产品服务异步结果查询
     * Summary: 保险数据产品服务异步结果查询.
     *
     * @param QueryDataproductAsyncRequest $request
     *
     * @return QueryDataproductAsyncResponse
     */
    public function queryDataproductAsync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDataproductAsyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险数据产品服务异步结果查询
     * Summary: 保险数据产品服务异步结果查询.
     *
     * @param QueryDataproductAsyncRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryDataproductAsyncResponse
     */
    public function queryDataproductAsyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDataproductAsyncResponse::fromMap($this->doRequest('1.0', 'antcloud.bxptnew.dataproduct.async.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 退运险物理轨迹订阅提交
     * Summary: 退运险物理轨迹订阅提交.
     *
     * @param SubmitDrrdataSubscriptionRequest $request
     *
     * @return SubmitDrrdataSubscriptionResponse
     */
    public function submitDrrdataSubscription($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitDrrdataSubscriptionEx($request, $headers, $runtime);
    }

    /**
     * Description: 退运险物理轨迹订阅提交
     * Summary: 退运险物理轨迹订阅提交.
     *
     * @param SubmitDrrdataSubscriptionRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SubmitDrrdataSubscriptionResponse
     */
    public function submitDrrdataSubscriptionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitDrrdataSubscriptionResponse::fromMap($this->doRequest('1.0', 'antcloud.bxptnew.drrdata.subscription.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 退运险物理轨迹数据接收
     * Summary: 退运险物理轨迹数据接收.
     *
     * @param ReceiveDrrdataTrackRequest $request
     *
     * @return ReceiveDrrdataTrackResponse
     */
    public function receiveDrrdataTrack($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->receiveDrrdataTrackEx($request, $headers, $runtime);
    }

    /**
     * Description: 退运险物理轨迹数据接收
     * Summary: 退运险物理轨迹数据接收.
     *
     * @param ReceiveDrrdataTrackRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ReceiveDrrdataTrackResponse
     */
    public function receiveDrrdataTrackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReceiveDrrdataTrackResponse::fromMap($this->doRequest('1.0', 'antcloud.bxptnew.drrdata.track.receive', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险数据营销决策查询
     * Summary: 保险数据营销决策查询.
     *
     * @param QueryDatapromotionDecisionRequest $request
     *
     * @return QueryDatapromotionDecisionResponse
     */
    public function queryDatapromotionDecision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatapromotionDecisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险数据营销决策查询
     * Summary: 保险数据营销决策查询.
     *
     * @param QueryDatapromotionDecisionRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryDatapromotionDecisionResponse
     */
    public function queryDatapromotionDecisionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatapromotionDecisionResponse::fromMap($this->doRequest('1.0', 'antcloud.bxptnew.datapromotion.decision.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险数据营销流量推送
     * Summary: 保险数据营销流量推送
     *
     * @param PushDatapromotionTrafficRequest $request
     *
     * @return PushDatapromotionTrafficResponse
     */
    public function pushDatapromotionTraffic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushDatapromotionTrafficEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险数据营销流量推送
     * Summary: 保险数据营销流量推送
     *
     * @param PushDatapromotionTrafficRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PushDatapromotionTrafficResponse
     */
    public function pushDatapromotionTrafficEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushDatapromotionTrafficResponse::fromMap($this->doRequest('1.0', 'antcloud.bxptnew.datapromotion.traffic.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
