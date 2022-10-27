<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEFINCASHIER;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DEFINCASHIER\Models\CancelSaasPaymentRequest;
use AntChain\DEFINCASHIER\Models\CancelSaasPaymentResponse;
use AntChain\DEFINCASHIER\Models\CaptureSaasPaymentRequest;
use AntChain\DEFINCASHIER\Models\CaptureSaasPaymentResponse;
use AntChain\DEFINCASHIER\Models\CheckSaasPaymentRequest;
use AntChain\DEFINCASHIER\Models\CheckSaasPaymentResponse;
use AntChain\DEFINCASHIER\Models\CreateSaasPaymentRequest;
use AntChain\DEFINCASHIER\Models\CreateSaasPaymentResponse;
use AntChain\DEFINCASHIER\Models\QuerySaasAccountRequest;
use AntChain\DEFINCASHIER\Models\QuerySaasAccountResponse;
use AntChain\DEFINCASHIER\Models\QuerySaasAgreementRequest;
use AntChain\DEFINCASHIER\Models\QuerySaasAgreementResponse;
use AntChain\DEFINCASHIER\Models\QuerySaasFunditemRequest;
use AntChain\DEFINCASHIER\Models\QuerySaasFunditemResponse;
use AntChain\DEFINCASHIER\Models\QuerySaasInstRequest;
use AntChain\DEFINCASHIER\Models\QuerySaasInstResponse;
use AntChain\DEFINCASHIER\Models\QuerySaasPaymentRequest;
use AntChain\DEFINCASHIER\Models\QuerySaasPaymentResponse;
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
            // 账号
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
                    'sdk_version'      => '1.0.5',
                    '_prod_code'       => 'DEFINCASHIER',
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
     * Description: 适用于创建交易后，查询交易详情。
     * Summary: B2B资金服务查询交易.
     *
     * @param QuerySaasPaymentRequest $request
     *
     * @return QuerySaasPaymentResponse
     */
    public function querySaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 适用于创建交易后，查询交易详情。
     * Summary: B2B资金服务查询交易.
     *
     * @param QuerySaasPaymentRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QuerySaasPaymentResponse
     */
    public function querySaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: B2B支付场景，创建交易前检查
     * Summary: B2B资金服务交易前检查.
     *
     * @param CheckSaasPaymentRequest $request
     *
     * @return CheckSaasPaymentResponse
     */
    public function checkSaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: B2B支付场景，创建交易前检查
     * Summary: B2B资金服务交易前检查.
     *
     * @param CheckSaasPaymentRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CheckSaasPaymentResponse
     */
    public function checkSaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: B2B支付场景，创建交易服务
     * Summary: B2B资金服务创建交易.
     *
     * @param CreateSaasPaymentRequest $request
     *
     * @return CreateSaasPaymentResponse
     */
    public function createSaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: B2B支付场景，创建交易服务
     * Summary: B2B资金服务创建交易.
     *
     * @param CreateSaasPaymentRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateSaasPaymentResponse
     */
    public function createSaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
     * Summary: B2B资金服务交易撤销
     *
     * @param CancelSaasPaymentRequest $request
     *
     * @return CancelSaasPaymentResponse
     */
    public function cancelSaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelSaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
     * Summary: B2B资金服务交易撤销
     *
     * @param CancelSaasPaymentRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CancelSaasPaymentResponse
     */
    public function cancelSaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelSaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于外部业务平台会员查询已绑定账号
     * Summary: B2B资金服务账号查询.
     *
     * @param QuerySaasAccountRequest $request
     *
     * @return QuerySaasAccountResponse
     */
    public function querySaasAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于外部业务平台会员查询已绑定账号
     * Summary: B2B资金服务账号查询.
     *
     * @param QuerySaasAccountRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QuerySaasAccountResponse
     */
    public function querySaasAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasAccountResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.account.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可以根据流水号查询请款，退款等资金操作明细
     * Summary: B2B资金服务交易资金操作明细查询.
     *
     * @param QuerySaasFunditemRequest $request
     *
     * @return QuerySaasFunditemResponse
     */
    public function querySaasFunditem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasFunditemEx($request, $headers, $runtime);
    }

    /**
     * Description: 可以根据流水号查询请款，退款等资金操作明细
     * Summary: B2B资金服务交易资金操作明细查询.
     *
     * @param QuerySaasFunditemRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QuerySaasFunditemResponse
     */
    public function querySaasFunditemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasFunditemResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.funditem.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询会员的产品签约协议
     * Summary: B2B资金服务签约查询.
     *
     * @param QuerySaasAgreementRequest $request
     *
     * @return QuerySaasAgreementResponse
     */
    public function querySaasAgreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasAgreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询会员的产品签约协议
     * Summary: B2B资金服务签约查询.
     *
     * @param QuerySaasAgreementRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QuerySaasAgreementResponse
     */
    public function querySaasAgreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasAgreementResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.agreement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
     * Summary: B2B资金服务交易请款.
     *
     * @param CaptureSaasPaymentRequest $request
     *
     * @return CaptureSaasPaymentResponse
     */
    public function captureSaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->captureSaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
     * Summary: B2B资金服务交易请款.
     *
     * @param CaptureSaasPaymentRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CaptureSaasPaymentResponse
     */
    public function captureSaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CaptureSaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.capture', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
     * Summary: B2B资金服务机构信息查询.
     *
     * @param QuerySaasInstRequest $request
     *
     * @return QuerySaasInstResponse
     */
    public function querySaasInst($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasInstEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
     * Summary: B2B资金服务机构信息查询.
     *
     * @param QuerySaasInstRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QuerySaasInstResponse
     */
    public function querySaasInstEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasInstResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.inst.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
