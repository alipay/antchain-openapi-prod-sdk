<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\CancelAntchainDefincashierSaasPaymentRequest;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\CancelAntchainDefincashierSaasPaymentResponse;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\CaptureAntchainDefincashierSaasPaymentRequest;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\CaptureAntchainDefincashierSaasPaymentResponse;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\CheckAntchainDefincashierSaasPaymentRequest;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\CheckAntchainDefincashierSaasPaymentResponse;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\CreateAntchainDefincashierSaasPaymentRequest;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\CreateAntchainDefincashierSaasPaymentResponse;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasAccountRequest;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasAccountResponse;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasAgreementRequest;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasAgreementResponse;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasFunditemRequest;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasFunditemResponse;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasInstRequest;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasInstResponse;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasPaymentRequest;
use AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models\QueryAntchainDefincashierSaasPaymentResponse;
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
            // 账号模型
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
                    'sdk_version'      => '1.0.0',
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
     * Description: 用于外部业务平台会员查询已绑定账号
     * Summary: B2B资金服务账号查询.
     *
     * @param QueryAntchainDefincashierSaasAccountRequest $request
     *
     * @return QueryAntchainDefincashierSaasAccountResponse
     */
    public function queryAntchainDefincashierSaasAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainDefincashierSaasAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于外部业务平台会员查询已绑定账号
     * Summary: B2B资金服务账号查询.
     *
     * @param QueryAntchainDefincashierSaasAccountRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return QueryAntchainDefincashierSaasAccountResponse
     */
    public function queryAntchainDefincashierSaasAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainDefincashierSaasAccountResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.account.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询会员的产品签约协议
     * Summary: B2B资金服务签约查询.
     *
     * @param QueryAntchainDefincashierSaasAgreementRequest $request
     *
     * @return QueryAntchainDefincashierSaasAgreementResponse
     */
    public function queryAntchainDefincashierSaasAgreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainDefincashierSaasAgreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询会员的产品签约协议
     * Summary: B2B资金服务签约查询.
     *
     * @param QueryAntchainDefincashierSaasAgreementRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return QueryAntchainDefincashierSaasAgreementResponse
     */
    public function queryAntchainDefincashierSaasAgreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainDefincashierSaasAgreementResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.agreement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可以根据流水号查询请款，退款等资金操作明细
     * Summary: B2B资金服务交易资金操作明细查询.
     *
     * @param QueryAntchainDefincashierSaasFunditemRequest $request
     *
     * @return QueryAntchainDefincashierSaasFunditemResponse
     */
    public function queryAntchainDefincashierSaasFunditem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainDefincashierSaasFunditemEx($request, $headers, $runtime);
    }

    /**
     * Description: 可以根据流水号查询请款，退款等资金操作明细
     * Summary: B2B资金服务交易资金操作明细查询.
     *
     * @param QueryAntchainDefincashierSaasFunditemRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryAntchainDefincashierSaasFunditemResponse
     */
    public function queryAntchainDefincashierSaasFunditemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainDefincashierSaasFunditemResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.funditem.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
     * Summary: B2B资金服务机构信息查询.
     *
     * @param QueryAntchainDefincashierSaasInstRequest $request
     *
     * @return QueryAntchainDefincashierSaasInstResponse
     */
    public function queryAntchainDefincashierSaasInst($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainDefincashierSaasInstEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
     * Summary: B2B资金服务机构信息查询.
     *
     * @param QueryAntchainDefincashierSaasInstRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryAntchainDefincashierSaasInstResponse
     */
    public function queryAntchainDefincashierSaasInstEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainDefincashierSaasInstResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.inst.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
     * Summary: B2B资金服务交易撤销
     *
     * @param CancelAntchainDefincashierSaasPaymentRequest $request
     *
     * @return CancelAntchainDefincashierSaasPaymentResponse
     */
    public function cancelAntchainDefincashierSaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelAntchainDefincashierSaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
     * Summary: B2B资金服务交易撤销
     *
     * @param CancelAntchainDefincashierSaasPaymentRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return CancelAntchainDefincashierSaasPaymentResponse
     */
    public function cancelAntchainDefincashierSaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelAntchainDefincashierSaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
     * Summary: B2B资金服务交易请款.
     *
     * @param CaptureAntchainDefincashierSaasPaymentRequest $request
     *
     * @return CaptureAntchainDefincashierSaasPaymentResponse
     */
    public function captureAntchainDefincashierSaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->captureAntchainDefincashierSaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
     * Summary: B2B资金服务交易请款.
     *
     * @param CaptureAntchainDefincashierSaasPaymentRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return CaptureAntchainDefincashierSaasPaymentResponse
     */
    public function captureAntchainDefincashierSaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CaptureAntchainDefincashierSaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.capture', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: B2B支付场景，创建交易前检查
     * Summary: B2B资金服务交易前检查.
     *
     * @param CheckAntchainDefincashierSaasPaymentRequest $request
     *
     * @return CheckAntchainDefincashierSaasPaymentResponse
     */
    public function checkAntchainDefincashierSaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAntchainDefincashierSaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: B2B支付场景，创建交易前检查
     * Summary: B2B资金服务交易前检查.
     *
     * @param CheckAntchainDefincashierSaasPaymentRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return CheckAntchainDefincashierSaasPaymentResponse
     */
    public function checkAntchainDefincashierSaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAntchainDefincashierSaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: B2B支付场景，创建交易服务
     * Summary: B2B资金服务创建交易.
     *
     * @param CreateAntchainDefincashierSaasPaymentRequest $request
     *
     * @return CreateAntchainDefincashierSaasPaymentResponse
     */
    public function createAntchainDefincashierSaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainDefincashierSaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: B2B支付场景，创建交易服务
     * Summary: B2B资金服务创建交易.
     *
     * @param CreateAntchainDefincashierSaasPaymentRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return CreateAntchainDefincashierSaasPaymentResponse
     */
    public function createAntchainDefincashierSaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainDefincashierSaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 适用于创建交易后，查询交易详情。
     * Summary: B2B资金服务查询交易.
     *
     * @param QueryAntchainDefincashierSaasPaymentRequest $request
     *
     * @return QueryAntchainDefincashierSaasPaymentResponse
     */
    public function queryAntchainDefincashierSaasPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainDefincashierSaasPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 适用于创建交易后，查询交易详情。
     * Summary: B2B资金服务查询交易.
     *
     * @param QueryAntchainDefincashierSaasPaymentRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return QueryAntchainDefincashierSaasPaymentResponse
     */
    public function queryAntchainDefincashierSaasPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainDefincashierSaasPaymentResponse::fromMap($this->doRequest('1.0', 'antchain.defincashier.saas.payment.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
