<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BILLING;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BILLING\Models\ChargeAccountBalanceRequest;
use AntChain\BILLING\Models\ChargeAccountBalanceResponse;
use AntChain\BILLING\Models\CreateAccountVerificationRequest;
use AntChain\BILLING\Models\CreateAccountVerificationResponse;
use AntChain\BILLING\Models\CreateAcfeewebInstanceRequest;
use AntChain\BILLING\Models\CreateAcfeewebInstanceResponse;
use AntChain\BILLING\Models\GetAccountBalanceRequest;
use AntChain\BILLING\Models\GetAccountBalanceResponse;
use AntChain\BILLING\Models\GetAccountUserRequest;
use AntChain\BILLING\Models\GetAccountUserResponse;
use AntChain\BILLING\Models\SyncAccountVerificationRequest;
use AntChain\BILLING\Models\SyncAccountVerificationResponse;
use AntChain\BILLING\Models\UpdateAcfeewebStateRequest;
use AntChain\BILLING\Models\UpdateAcfeewebStateResponse;
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
                    'sdk_version'      => '1.3.1',
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
     * Description: 提供金融云账户余额、可用余额查询接口
     * Summary: 金融云账户余额查询.
     *
     * @param GetAccountBalanceRequest $request
     *
     * @return GetAccountBalanceResponse
     */
    public function getAccountBalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAccountBalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供金融云账户余额、可用余额查询接口
     * Summary: 金融云账户余额查询.
     *
     * @param GetAccountBalanceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetAccountBalanceResponse
     */
    public function getAccountBalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAccountBalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.billing.account.balance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能科技资金帐号充值参数，返回唤起收银台充值参数
     * Summary: 智能科技资金帐号充值参数组装.
     *
     * @param ChargeAccountBalanceRequest $request
     *
     * @return ChargeAccountBalanceResponse
     */
    public function chargeAccountBalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->chargeAccountBalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能科技资金帐号充值参数，返回唤起收银台充值参数
     * Summary: 智能科技资金帐号充值参数组装.
     *
     * @param ChargeAccountBalanceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ChargeAccountBalanceResponse
     */
    public function chargeAccountBalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ChargeAccountBalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.billing.account.balance.charge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据托管子户ID查询租户信息
     * Summary: 根据托管子户ID查询租户信息.
     *
     * @param GetAccountUserRequest $request
     *
     * @return GetAccountUserResponse
     */
    public function getAccountUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAccountUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据托管子户ID查询租户信息
     * Summary: 根据托管子户ID查询租户信息.
     *
     * @param GetAccountUserRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetAccountUserResponse
     */
    public function getAccountUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAccountUserResponse::fromMap($this->doRequest('1.0', 'antcloud.billing.account.user.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 线下环境调用线上环境发起审批流
     * Summary: 创建审批流
     *
     * @param CreateAcfeewebInstanceRequest $request
     *
     * @return CreateAcfeewebInstanceResponse
     */
    public function createAcfeewebInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAcfeewebInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 线下环境调用线上环境发起审批流
     * Summary: 创建审批流
     *
     * @param CreateAcfeewebInstanceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateAcfeewebInstanceResponse
     */
    public function createAcfeewebInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAcfeewebInstanceResponse::fromMap($this->doRequest('1.0', 'antcloud.billing.acfeeweb.instance.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步线下接口(同步出账验证审批流状态)
     * Summary: 同步线下接口(同步出账验证审批流状态).
     *
     * @param UpdateAcfeewebStateRequest $request
     *
     * @return UpdateAcfeewebStateResponse
     */
    public function updateAcfeewebState($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAcfeewebStateEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步线下接口(同步出账验证审批流状态)
     * Summary: 同步线下接口(同步出账验证审批流状态).
     *
     * @param UpdateAcfeewebStateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateAcfeewebStateResponse
     */
    public function updateAcfeewebStateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAcfeewebStateResponse::fromMap($this->doRequest('1.0', 'antcloud.billing.acfeeweb.state.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认账单，线上环境使用(同步数据、创建审批流)
     * Summary: 确认账单线上使用(同步数据、创建审批流).
     *
     * @param CreateAccountVerificationRequest $request
     *
     * @return CreateAccountVerificationResponse
     */
    public function createAccountVerification($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAccountVerificationEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认账单，线上环境使用(同步数据、创建审批流)
     * Summary: 确认账单线上使用(同步数据、创建审批流).
     *
     * @param CreateAccountVerificationRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateAccountVerificationResponse
     */
    public function createAccountVerificationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAccountVerificationResponse::fromMap($this->doRequest('1.0', 'antcloud.billing.account.verification.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步线下接口(同步出账验证审批流状态)
     * Summary: 同步线下接口(同步出账验证审批流状态).
     *
     * @param SyncAccountVerificationRequest $request
     *
     * @return SyncAccountVerificationResponse
     */
    public function syncAccountVerification($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAccountVerificationEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步线下接口(同步出账验证审批流状态)
     * Summary: 同步线下接口(同步出账验证审批流状态).
     *
     * @param SyncAccountVerificationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncAccountVerificationResponse
     */
    public function syncAccountVerificationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAccountVerificationResponse::fromMap($this->doRequest('1.0', 'antcloud.billing.account.verification.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
