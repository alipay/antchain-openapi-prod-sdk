<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\ATO\Models\AllSignTemplateRequest;
use AntChain\ATO\Models\AllSignTemplateResponse;
use AntChain\ATO\Models\AuthFundFlowRequest;
use AntChain\ATO\Models\AuthFundFlowResponse;
use AntChain\ATO\Models\AuthSignFlowRequest;
use AntChain\ATO\Models\AuthSignFlowResponse;
use AntChain\ATO\Models\CallbackFundNotifyRequest;
use AntChain\ATO\Models\CallbackFundNotifyResponse;
use AntChain\ATO\Models\CancelFundPlanRequest;
use AntChain\ATO\Models\CancelFundPlanResponse;
use AntChain\ATO\Models\CancelWithholdActivepayRequest;
use AntChain\ATO\Models\CancelWithholdActivepayResponse;
use AntChain\ATO\Models\CancelWithholdPlanRequest;
use AntChain\ATO\Models\CancelWithholdPlanResponse;
use AntChain\ATO\Models\ConfirmWithholdSignasyncunsignRequest;
use AntChain\ATO\Models\ConfirmWithholdSignasyncunsignResponse;
use AntChain\ATO\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\ATO\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\ATO\Models\CreateRealpersonFacevrfRequest;
use AntChain\ATO\Models\CreateRealpersonFacevrfResponse;
use AntChain\ATO\Models\CreateWithholdActivepayRequest;
use AntChain\ATO\Models\CreateWithholdActivepayResponse;
use AntChain\ATO\Models\CreateWithholdRefundRequest;
use AntChain\ATO\Models\CreateWithholdRefundResponse;
use AntChain\ATO\Models\CreateWithholdSignRequest;
use AntChain\ATO\Models\CreateWithholdSignResponse;
use AntChain\ATO\Models\GetFundFlowRequest;
use AntChain\ATO\Models\GetFundFlowResponse;
use AntChain\ATO\Models\GetFundMerchantperformanceRequest;
use AntChain\ATO\Models\GetFundMerchantperformanceResponse;
use AntChain\ATO\Models\GetFundOrderfulfillmentRequest;
use AntChain\ATO\Models\GetFundOrderfulfillmentResponse;
use AntChain\ATO\Models\GetFundOrderfullinfoRequest;
use AntChain\ATO\Models\GetFundOrderfullinfoResponse;
use AntChain\ATO\Models\GetFundUserperformanceRequest;
use AntChain\ATO\Models\GetFundUserperformanceResponse;
use AntChain\ATO\Models\GetFundUserpromiseRequest;
use AntChain\ATO\Models\GetFundUserpromiseResponse;
use AntChain\ATO\Models\GetSignFlowRequest;
use AntChain\ATO\Models\GetSignFlowResponse;
use AntChain\ATO\Models\GetTradeMerchantfulfillmentRequest;
use AntChain\ATO\Models\GetTradeMerchantfulfillmentResponse;
use AntChain\ATO\Models\GetTradeMerchantperformanceRequest;
use AntChain\ATO\Models\GetTradeMerchantperformanceResponse;
use AntChain\ATO\Models\GetTradeRequest;
use AntChain\ATO\Models\GetTradeResponse;
use AntChain\ATO\Models\GetTradeUserperformanceRequest;
use AntChain\ATO\Models\GetTradeUserperformanceResponse;
use AntChain\ATO\Models\QueryRealpersonFacevrfRequest;
use AntChain\ATO\Models\QueryRealpersonFacevrfResponse;
use AntChain\ATO\Models\QueryWithholdActivepayRequest;
use AntChain\ATO\Models\QueryWithholdActivepayResponse;
use AntChain\ATO\Models\QueryWithholdRefundRequest;
use AntChain\ATO\Models\QueryWithholdRefundResponse;
use AntChain\ATO\Models\QueryWithholdSignRequest;
use AntChain\ATO\Models\QueryWithholdSignResponse;
use AntChain\ATO\Models\RefuseFundFlowRequest;
use AntChain\ATO\Models\RefuseFundFlowResponse;
use AntChain\ATO\Models\RepayWithholdPlanRequest;
use AntChain\ATO\Models\RepayWithholdPlanResponse;
use AntChain\ATO\Models\RetryWithholdPlanRequest;
use AntChain\ATO\Models\RetryWithholdPlanResponse;
use AntChain\ATO\Models\SubmitFrontSignRequest;
use AntChain\ATO\Models\SubmitFrontSignResponse;
use AntChain\ATO\Models\SubmitSignFlowRequest;
use AntChain\ATO\Models\SubmitSignFlowResponse;
use AntChain\ATO\Models\SyncFrontTradeRequest;
use AntChain\ATO\Models\SyncFrontTradeResponse;
use AntChain\ATO\Models\SyncFundFinanceloanresultsRequest;
use AntChain\ATO\Models\SyncFundFinanceloanresultsResponse;
use AntChain\ATO\Models\SyncFundMerchantpromiseRequest;
use AntChain\ATO\Models\SyncFundMerchantpromiseResponse;
use AntChain\ATO\Models\SyncFundOrderfinancialRequest;
use AntChain\ATO\Models\SyncFundOrderfinancialResponse;
use AntChain\ATO\Models\SyncFundOrderfulfillmentRequest;
use AntChain\ATO\Models\SyncFundOrderfulfillmentResponse;
use AntChain\ATO\Models\SyncFundSplittingRequest;
use AntChain\ATO\Models\SyncFundSplittingResponse;
use AntChain\ATO\Models\SyncFundWithholdingcontractRequest;
use AntChain\ATO\Models\SyncFundWithholdingcontractResponse;
use AntChain\ATO\Models\SyncTradeFinanceloanapplyRequest;
use AntChain\ATO\Models\SyncTradeFinanceloanapplyResponse;
use AntChain\ATO\Models\SyncTradeRequest;
use AntChain\ATO\Models\SyncTradeResponse;
use AntChain\ATO\Models\UnbindWithholdSignRequest;
use AntChain\ATO\Models\UnbindWithholdSignResponse;
use AntChain\ATO\Models\UploadFundFlowRequest;
use AntChain\ATO\Models\UploadFundFlowResponse;
use AntChain\ATO\Models\UploadSignFlowRequest;
use AntChain\ATO\Models\UploadSignFlowResponse;
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
            // 订单还款计划
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
                    'sdk_version'      => '1.7.14',
                    '_prod_code'       => 'ATO',
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
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步.
     *
     * @param SyncFundSplittingRequest $request
     *
     * @return SyncFundSplittingResponse
     */
    public function syncFundSplitting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundSplittingEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步.
     *
     * @param SyncFundSplittingRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SyncFundSplittingResponse
     */
    public function syncFundSplittingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundSplittingResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步.
     *
     * @param SyncFundOrderfinancialRequest $request
     *
     * @return SyncFundOrderfinancialResponse
     */
    public function syncFundOrderfinancial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundOrderfinancialEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步.
     *
     * @param SyncFundOrderfinancialRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncFundOrderfinancialResponse
     */
    public function syncFundOrderfinancialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundOrderfinancialResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议.
     *
     * @param SyncFundWithholdingcontractRequest $request
     *
     * @return SyncFundWithholdingcontractResponse
     */
    public function syncFundWithholdingcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundWithholdingcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议.
     *
     * @param SyncFundWithholdingcontractRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SyncFundWithholdingcontractResponse
     */
    public function syncFundWithholdingcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundWithholdingcontractResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息.
     *
     * @param SyncFundOrderfulfillmentRequest $request
     *
     * @return SyncFundOrderfulfillmentResponse
     */
    public function syncFundOrderfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundOrderfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息.
     *
     * @param SyncFundOrderfulfillmentRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SyncFundOrderfulfillmentResponse
     */
    public function syncFundOrderfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundOrderfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息.
     *
     * @param GetFundOrderfulfillmentRequest $request
     *
     * @return GetFundOrderfulfillmentResponse
     */
    public function getFundOrderfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundOrderfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息.
     *
     * @param GetFundOrderfulfillmentRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetFundOrderfulfillmentResponse
     */
    public function getFundOrderfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundOrderfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口.
     *
     * @param UploadFundFlowRequest $request
     *
     * @return UploadFundFlowResponse
     */
    public function uploadFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口.
     *
     * @param UploadFundFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UploadFundFlowResponse
     */
    public function uploadFundFlowEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.ato.fund.flow.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadFundFlowResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return UploadFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口.
     *
     * @param GetFundFlowRequest $request
     *
     * @return GetFundFlowResponse
     */
    public function getFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口.
     *
     * @param GetFundFlowRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetFundFlowResponse
     */
    public function getFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知.
     *
     * @param RefuseFundFlowRequest $request
     *
     * @return RefuseFundFlowResponse
     */
    public function refuseFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知.
     *
     * @param RefuseFundFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RefuseFundFlowResponse
     */
    public function refuseFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口.
     *
     * @param AuthFundFlowRequest $request
     *
     * @return AuthFundFlowResponse
     */
    public function authFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口.
     *
     * @param AuthFundFlowRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AuthFundFlowResponse
     */
    public function authFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消.
     *
     * @param CancelFundPlanRequest $request
     *
     * @return CancelFundPlanResponse
     */
    public function cancelFundPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelFundPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消.
     *
     * @param CancelFundPlanRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CancelFundPlanResponse
     */
    public function cancelFundPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelFundPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.plan.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调.
     *
     * @param CallbackFundNotifyRequest $request
     *
     * @return CallbackFundNotifyResponse
     */
    public function callbackFundNotify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackFundNotifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调.
     *
     * @param CallbackFundNotifyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CallbackFundNotifyResponse
     */
    public function callbackFundNotifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackFundNotifyResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.notify.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步.
     *
     * @param SyncFundMerchantpromiseRequest $request
     *
     * @return SyncFundMerchantpromiseResponse
     */
    public function syncFundMerchantpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundMerchantpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步.
     *
     * @param SyncFundMerchantpromiseRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncFundMerchantpromiseResponse
     */
    public function syncFundMerchantpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundMerchantpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.merchantpromise.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步.
     *
     * @param SyncFundFinanceloanresultsRequest $request
     *
     * @return SyncFundFinanceloanresultsResponse
     */
    public function syncFundFinanceloanresults($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundFinanceloanresultsEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步.
     *
     * @param SyncFundFinanceloanresultsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SyncFundFinanceloanresultsResponse
     */
    public function syncFundFinanceloanresultsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundFinanceloanresultsResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.financeloanresults.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺.
     *
     * @param GetFundUserpromiseRequest $request
     *
     * @return GetFundUserpromiseResponse
     */
    public function getFundUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺.
     *
     * @param GetFundUserpromiseRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetFundUserpromiseResponse
     */
    public function getFundUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.userpromise.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetFundUserperformanceRequest $request
     *
     * @return GetFundUserperformanceResponse
     */
    public function getFundUserperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundUserperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetFundUserperformanceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetFundUserperformanceResponse
     */
    public function getFundUserperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundUserperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.userperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetFundMerchantperformanceRequest $request
     *
     * @return GetFundMerchantperformanceResponse
     */
    public function getFundMerchantperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundMerchantperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetFundMerchantperformanceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetFundMerchantperformanceResponse
     */
    public function getFundMerchantperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundMerchantperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.merchantperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情.
     *
     * @param GetFundOrderfullinfoRequest $request
     *
     * @return GetFundOrderfullinfoResponse
     */
    public function getFundOrderfullinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundOrderfullinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情.
     *
     * @param GetFundOrderfullinfoRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetFundOrderfullinfoResponse
     */
    public function getFundOrderfullinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundOrderfullinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfullinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     *
     * @param CreateRealpersonFacevrfRequest $request
     *
     * @return CreateRealpersonFacevrfResponse
     */
    public function createRealpersonFacevrf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRealpersonFacevrfEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     *
     * @param CreateRealpersonFacevrfRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateRealpersonFacevrfResponse
     */
    public function createRealpersonFacevrfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRealpersonFacevrfResponse::fromMap($this->doRequest('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果.
     *
     * @param QueryRealpersonFacevrfRequest $request
     *
     * @return QueryRealpersonFacevrfResponse
     */
    public function queryRealpersonFacevrf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRealpersonFacevrfEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果.
     *
     * @param QueryRealpersonFacevrfRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryRealpersonFacevrfResponse
     */
    public function queryRealpersonFacevrfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRealpersonFacevrfResponse::fromMap($this->doRequest('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     *
     * @param AllSignTemplateRequest $request
     *
     * @return AllSignTemplateResponse
     */
    public function allSignTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allSignTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     *
     * @param AllSignTemplateRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AllSignTemplateResponse
     */
    public function allSignTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllSignTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）.
     *
     * @param SubmitSignFlowRequest $request
     *
     * @return SubmitSignFlowResponse
     */
    public function submitSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）.
     *
     * @param SubmitSignFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SubmitSignFlowResponse
     */
    public function submitSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情.
     *
     * @param GetSignFlowRequest $request
     *
     * @return GetSignFlowResponse
     */
    public function getSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情.
     *
     * @param GetSignFlowRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetSignFlowResponse
     */
    public function getSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作.
     *
     * @param AuthSignFlowRequest $request
     *
     * @return AuthSignFlowResponse
     */
    public function authSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作.
     *
     * @param AuthSignFlowRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AuthSignFlowResponse
     */
    public function authSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）.
     *
     * @param SubmitFrontSignRequest $request
     *
     * @return SubmitFrontSignResponse
     */
    public function submitFrontSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitFrontSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）.
     *
     * @param SubmitFrontSignRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SubmitFrontSignResponse
     */
    public function submitFrontSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitFrontSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.front.sign.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口.
     *
     * @param UploadSignFlowRequest $request
     *
     * @return UploadSignFlowResponse
     */
    public function uploadSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口.
     *
     * @param UploadSignFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UploadSignFlowResponse
     */
    public function uploadSignFlowEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.ato.sign.flow.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadSignFlowResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return UploadSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口.
     *
     * @param SyncTradeRequest $request
     *
     * @return SyncTradeResponse
     */
    public function syncTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口.
     *
     * @param SyncTradeRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return SyncTradeResponse
     */
    public function syncTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情.
     *
     * @param GetTradeRequest $request
     *
     * @return GetTradeResponse
     */
    public function getTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情.
     *
     * @param GetTradeRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return GetTradeResponse
     */
    public function getTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建.
     *
     * @param SyncFrontTradeRequest $request
     *
     * @return SyncFrontTradeResponse
     */
    public function syncFrontTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFrontTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建.
     *
     * @param SyncFrontTradeRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SyncFrontTradeResponse
     */
    public function syncFrontTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFrontTradeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.front.trade.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口.
     *
     * @param SyncTradeFinanceloanapplyRequest $request
     *
     * @return SyncTradeFinanceloanapplyResponse
     */
    public function syncTradeFinanceloanapply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradeFinanceloanapplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口.
     *
     * @param SyncTradeFinanceloanapplyRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SyncTradeFinanceloanapplyResponse
     */
    public function syncTradeFinanceloanapplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradeFinanceloanapplyResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.financeloanapply.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询.
     *
     * @param GetTradeMerchantfulfillmentRequest $request
     *
     * @return GetTradeMerchantfulfillmentResponse
     */
    public function getTradeMerchantfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeMerchantfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询.
     *
     * @param GetTradeMerchantfulfillmentRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetTradeMerchantfulfillmentResponse
     */
    public function getTradeMerchantfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeMerchantfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.merchantfulfillment.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）.
     *
     * @param GetTradeUserperformanceRequest $request
     *
     * @return GetTradeUserperformanceResponse
     */
    public function getTradeUserperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeUserperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）.
     *
     * @param GetTradeUserperformanceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetTradeUserperformanceResponse
     */
    public function getTradeUserperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeUserperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetTradeMerchantperformanceRequest $request
     *
     * @return GetTradeMerchantperformanceResponse
     */
    public function getTradeMerchantperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeMerchantperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetTradeMerchantperformanceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetTradeMerchantperformanceResponse
     */
    public function getTradeMerchantperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeMerchantperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.merchantperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约
     * Summary: 代扣签约.
     *
     * @param CreateWithholdSignRequest $request
     *
     * @return CreateWithholdSignResponse
     */
    public function createWithholdSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWithholdSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约
     * Summary: 代扣签约.
     *
     * @param CreateWithholdSignRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateWithholdSignResponse
     */
    public function createWithholdSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWithholdSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询.
     *
     * @param QueryWithholdSignRequest $request
     *
     * @return QueryWithholdSignResponse
     */
    public function queryWithholdSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询.
     *
     * @param QueryWithholdSignRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryWithholdSignResponse
     */
    public function queryWithholdSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑.
     *
     * @param UnbindWithholdSignRequest $request
     *
     * @return UnbindWithholdSignResponse
     */
    public function unbindWithholdSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindWithholdSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑.
     *
     * @param UnbindWithholdSignRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UnbindWithholdSignResponse
     */
    public function unbindWithholdSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindWithholdSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划.
     *
     * @param CancelWithholdPlanRequest $request
     *
     * @return CancelWithholdPlanResponse
     */
    public function cancelWithholdPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelWithholdPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划.
     *
     * @param CancelWithholdPlanRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CancelWithholdPlanResponse
     */
    public function cancelWithholdPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelWithholdPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
     * Summary: 代扣计划清偿/清欠.
     *
     * @param RepayWithholdPlanRequest $request
     *
     * @return RepayWithholdPlanResponse
     */
    public function repayWithholdPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayWithholdPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
     * Summary: 代扣计划清偿/清欠.
     *
     * @param RepayWithholdPlanRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return RepayWithholdPlanResponse
     */
    public function repayWithholdPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayWithholdPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试.
     *
     * @param RetryWithholdPlanRequest $request
     *
     * @return RetryWithholdPlanResponse
     */
    public function retryWithholdPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryWithholdPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试.
     *
     * @param RetryWithholdPlanRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return RetryWithholdPlanResponse
     */
    public function retryWithholdPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryWithholdPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认.
     *
     * @param ConfirmWithholdSignasyncunsignRequest $request
     *
     * @return ConfirmWithholdSignasyncunsignResponse
     */
    public function confirmWithholdSignasyncunsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmWithholdSignasyncunsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认.
     *
     * @param ConfirmWithholdSignasyncunsignRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ConfirmWithholdSignasyncunsignResponse
     */
    public function confirmWithholdSignasyncunsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmWithholdSignasyncunsignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.signasyncunsign.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建.
     *
     * @param CreateWithholdActivepayRequest $request
     *
     * @return CreateWithholdActivepayResponse
     */
    public function createWithholdActivepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWithholdActivepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建.
     *
     * @param CreateWithholdActivepayRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateWithholdActivepayResponse
     */
    public function createWithholdActivepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWithholdActivepayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.activepay.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询.
     *
     * @param QueryWithholdActivepayRequest $request
     *
     * @return QueryWithholdActivepayResponse
     */
    public function queryWithholdActivepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdActivepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询.
     *
     * @param QueryWithholdActivepayRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryWithholdActivepayResponse
     */
    public function queryWithholdActivepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdActivepayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.activepay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消.
     *
     * @param CancelWithholdActivepayRequest $request
     *
     * @return CancelWithholdActivepayResponse
     */
    public function cancelWithholdActivepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelWithholdActivepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消.
     *
     * @param CancelWithholdActivepayRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CancelWithholdActivepayResponse
     */
    public function cancelWithholdActivepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelWithholdActivepayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.activepay.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请.
     *
     * @param CreateWithholdRefundRequest $request
     *
     * @return CreateWithholdRefundResponse
     */
    public function createWithholdRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWithholdRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请.
     *
     * @param CreateWithholdRefundRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateWithholdRefundResponse
     */
    public function createWithholdRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWithholdRefundResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.refund.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询.
     *
     * @param QueryWithholdRefundRequest $request
     *
     * @return QueryWithholdRefundResponse
     */
    public function queryWithholdRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询.
     *
     * @param QueryWithholdRefundRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryWithholdRefundResponse
     */
    public function queryWithholdRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdRefundResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.refund.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUpload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntcloudGatewayxFileUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUploadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntcloudGatewayxFileUploadResponse::fromMap($this->doRequest('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
