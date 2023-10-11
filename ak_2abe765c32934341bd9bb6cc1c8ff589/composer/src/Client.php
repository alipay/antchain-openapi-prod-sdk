<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\AllAntchainAtoSignTemplateRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\AllAntchainAtoSignTemplateResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\CreateAntchainAtoRealpersonFacevrfRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\CreateAntchainAtoRealpersonFacevrfResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\CreateAntchainAtoWithholdSignRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\CreateAntchainAtoWithholdSignResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoFundOrderfulfillmentRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoFundOrderfulfillmentResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoFundRepaymentplanRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoFundRepaymentplanResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoSignFlowRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoSignFlowResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoTradeRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\GetAntchainAtoTradeResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\QueryAntchainAtoRealpersonFacevrfRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\QueryAntchainAtoRealpersonFacevrfResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\QueryAntchainAtoWithholdSignRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\QueryAntchainAtoWithholdSignResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SubmitAntchainAtoSignFlowRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SubmitAntchainAtoSignFlowResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundOrderfinancialRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundOrderfinancialResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundOrderfulfillmentRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundOrderfulfillmentResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundSplittingRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundSplittingResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundWithholdingcontractRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoFundWithholdingcontractResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoTradeFullRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoTradeFullResponse;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoTradeRequest;
use AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models\SyncAntchainAtoTradeResponse;
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
            // 订单包含的单个商品模型
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
                    '_prod_code'       => 'ak_2abe765c32934341bd9bb6cc1c8ff589',
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
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口.
     *
     * @param SyncAntchainAtoTradeRequest $request
     *
     * @return SyncAntchainAtoTradeResponse
     */
    public function syncAntchainAtoTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口.
     *
     * @param SyncAntchainAtoTradeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SyncAntchainAtoTradeResponse
     */
    public function syncAntchainAtoTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoTradeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情.
     *
     * @param GetAntchainAtoTradeRequest $request
     *
     * @return GetAntchainAtoTradeResponse
     */
    public function getAntchainAtoTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情.
     *
     * @param GetAntchainAtoTradeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetAntchainAtoTradeResponse
     */
    public function getAntchainAtoTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoTradeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     *
     * @param CreateAntchainAtoRealpersonFacevrfRequest $request
     *
     * @return CreateAntchainAtoRealpersonFacevrfResponse
     */
    public function createAntchainAtoRealpersonFacevrf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainAtoRealpersonFacevrfEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     *
     * @param CreateAntchainAtoRealpersonFacevrfRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return CreateAntchainAtoRealpersonFacevrfResponse
     */
    public function createAntchainAtoRealpersonFacevrfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainAtoRealpersonFacevrfResponse::fromMap($this->doRequest('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果.
     *
     * @param QueryAntchainAtoRealpersonFacevrfRequest $request
     *
     * @return QueryAntchainAtoRealpersonFacevrfResponse
     */
    public function queryAntchainAtoRealpersonFacevrf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAtoRealpersonFacevrfEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果.
     *
     * @param QueryAntchainAtoRealpersonFacevrfRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryAntchainAtoRealpersonFacevrfResponse
     */
    public function queryAntchainAtoRealpersonFacevrfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAtoRealpersonFacevrfResponse::fromMap($this->doRequest('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     *
     * @param AllAntchainAtoSignTemplateRequest $request
     *
     * @return AllAntchainAtoSignTemplateResponse
     */
    public function allAntchainAtoSignTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allAntchainAtoSignTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     *
     * @param AllAntchainAtoSignTemplateRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return AllAntchainAtoSignTemplateResponse
     */
    public function allAntchainAtoSignTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllAntchainAtoSignTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交电子合同的签署流程
     * Summary: 提交电子合同的签署流程.
     *
     * @param SubmitAntchainAtoSignFlowRequest $request
     *
     * @return SubmitAntchainAtoSignFlowResponse
     */
    public function submitAntchainAtoSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAntchainAtoSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交电子合同的签署流程
     * Summary: 提交电子合同的签署流程.
     *
     * @param SubmitAntchainAtoSignFlowRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SubmitAntchainAtoSignFlowResponse
     */
    public function submitAntchainAtoSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAntchainAtoSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情.
     *
     * @param GetAntchainAtoSignFlowRequest $request
     *
     * @return GetAntchainAtoSignFlowResponse
     */
    public function getAntchainAtoSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情.
     *
     * @param GetAntchainAtoSignFlowRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetAntchainAtoSignFlowResponse
     */
    public function getAntchainAtoSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分账流水同步
     * Summary: 分账流水同步.
     *
     * @param SyncAntchainAtoFundSplittingRequest $request
     *
     * @return SyncAntchainAtoFundSplittingResponse
     */
    public function syncAntchainAtoFundSplitting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundSplittingEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账流水同步
     * Summary: 分账流水同步.
     *
     * @param SyncAntchainAtoFundSplittingRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return SyncAntchainAtoFundSplittingResponse
     */
    public function syncAntchainAtoFundSplittingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundSplittingResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 订单融资结果同步.
     *
     * @param SyncAntchainAtoFundOrderfinancialRequest $request
     *
     * @return SyncAntchainAtoFundOrderfinancialResponse
     */
    public function syncAntchainAtoFundOrderfinancial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundOrderfinancialEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 订单融资结果同步.
     *
     * @param SyncAntchainAtoFundOrderfinancialRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return SyncAntchainAtoFundOrderfinancialResponse
     */
    public function syncAntchainAtoFundOrderfinancialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundOrderfinancialResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将返回订单实人认证通过后的、商家同步的还款计划
     * Summary: 获取商家同步的还款计划.
     *
     * @param GetAntchainAtoFundRepaymentplanRequest $request
     *
     * @return GetAntchainAtoFundRepaymentplanResponse
     */
    public function getAntchainAtoFundRepaymentplan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoFundRepaymentplanEx($request, $headers, $runtime);
    }

    /**
     * Description: 将返回订单实人认证通过后的、商家同步的还款计划
     * Summary: 获取商家同步的还款计划.
     *
     * @param GetAntchainAtoFundRepaymentplanRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return GetAntchainAtoFundRepaymentplanResponse
     */
    public function getAntchainAtoFundRepaymentplanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoFundRepaymentplanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.repaymentplan.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 同步租赁订单的代扣协议.
     *
     * @param SyncAntchainAtoFundWithholdingcontractRequest $request
     *
     * @return SyncAntchainAtoFundWithholdingcontractResponse
     */
    public function syncAntchainAtoFundWithholdingcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundWithholdingcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 同步租赁订单的代扣协议.
     *
     * @param SyncAntchainAtoFundWithholdingcontractRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return SyncAntchainAtoFundWithholdingcontractResponse
     */
    public function syncAntchainAtoFundWithholdingcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundWithholdingcontractResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 同步订单还款履约信息.
     *
     * @param SyncAntchainAtoFundOrderfulfillmentRequest $request
     *
     * @return SyncAntchainAtoFundOrderfulfillmentResponse
     */
    public function syncAntchainAtoFundOrderfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundOrderfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 同步订单还款履约信息.
     *
     * @param SyncAntchainAtoFundOrderfulfillmentRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return SyncAntchainAtoFundOrderfulfillmentResponse
     */
    public function syncAntchainAtoFundOrderfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundOrderfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 获取订单的履约信息.
     *
     * @param GetAntchainAtoFundOrderfulfillmentRequest $request
     *
     * @return GetAntchainAtoFundOrderfulfillmentResponse
     */
    public function getAntchainAtoFundOrderfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoFundOrderfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 获取订单的履约信息.
     *
     * @param GetAntchainAtoFundOrderfulfillmentRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return GetAntchainAtoFundOrderfulfillmentResponse
     */
    public function getAntchainAtoFundOrderfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoFundOrderfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约
     * Summary: 代扣签约.
     *
     * @param CreateAntchainAtoWithholdSignRequest $request
     *
     * @return CreateAntchainAtoWithholdSignResponse
     */
    public function createAntchainAtoWithholdSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainAtoWithholdSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约
     * Summary: 代扣签约.
     *
     * @param CreateAntchainAtoWithholdSignRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateAntchainAtoWithholdSignResponse
     */
    public function createAntchainAtoWithholdSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainAtoWithholdSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询.
     *
     * @param QueryAntchainAtoWithholdSignRequest $request
     *
     * @return QueryAntchainAtoWithholdSignResponse
     */
    public function queryAntchainAtoWithholdSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAtoWithholdSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询.
     *
     * @param QueryAntchainAtoWithholdSignRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryAntchainAtoWithholdSignResponse
     */
    public function queryAntchainAtoWithholdSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAtoWithholdSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
     * Summary: 同步商家的订单信息.
     *
     * @param SyncAntchainAtoTradeFullRequest $request
     *
     * @return SyncAntchainAtoTradeFullResponse
     */
    public function syncAntchainAtoTradeFull($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoTradeFullEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
     * Summary: 同步商家的订单信息.
     *
     * @param SyncAntchainAtoTradeFullRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SyncAntchainAtoTradeFullResponse
     */
    public function syncAntchainAtoTradeFullEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoTradeFullResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.full.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
