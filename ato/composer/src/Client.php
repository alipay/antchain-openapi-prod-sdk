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
use AntChain\ATO\Models\AllInnerTemplateRequest;
use AntChain\ATO\Models\AllInnerTemplateResponse;
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
use AntChain\ATO\Models\CancelSignFlowRequest;
use AntChain\ATO\Models\CancelSignFlowResponse;
use AntChain\ATO\Models\CancelWithholdActivepayRequest;
use AntChain\ATO\Models\CancelWithholdActivepayResponse;
use AntChain\ATO\Models\CancelWithholdPlanRequest;
use AntChain\ATO\Models\CancelWithholdPlanResponse;
use AntChain\ATO\Models\CloneInnerTemplatefileaddressRequest;
use AntChain\ATO\Models\CloneInnerTemplatefileaddressResponse;
use AntChain\ATO\Models\CloneInnerTemplateRequest;
use AntChain\ATO\Models\CloneInnerTemplateResponse;
use AntChain\ATO\Models\ConfirmWithholdSignasyncunsignRequest;
use AntChain\ATO\Models\ConfirmWithholdSignasyncunsignResponse;
use AntChain\ATO\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\ATO\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\ATO\Models\CreateInnerFunddividerelationRequest;
use AntChain\ATO\Models\CreateInnerFunddividerelationResponse;
use AntChain\ATO\Models\CreateInnerMerchantagreementRequest;
use AntChain\ATO\Models\CreateInnerMerchantagreementResponse;
use AntChain\ATO\Models\CreateInnerMerchantpayexpandRequest;
use AntChain\ATO\Models\CreateInnerMerchantpayexpandResponse;
use AntChain\ATO\Models\CreateInnerTemplateRequest;
use AntChain\ATO\Models\CreateInnerTemplateResponse;
use AntChain\ATO\Models\CreateInnerTemplatetextareaRequest;
use AntChain\ATO\Models\CreateInnerTemplatetextareaResponse;
use AntChain\ATO\Models\CreateRealpersonFacevrfRequest;
use AntChain\ATO\Models\CreateRealpersonFacevrfResponse;
use AntChain\ATO\Models\CreateWithholdActivepayRequest;
use AntChain\ATO\Models\CreateWithholdActivepayResponse;
use AntChain\ATO\Models\CreateWithholdRefundRequest;
use AntChain\ATO\Models\CreateWithholdRefundResponse;
use AntChain\ATO\Models\CreateWithholdSignRequest;
use AntChain\ATO\Models\CreateWithholdSignResponse;
use AntChain\ATO\Models\DeleteInnerTemplateRequest;
use AntChain\ATO\Models\DeleteInnerTemplateResponse;
use AntChain\ATO\Models\DetailInnerTemplateRequest;
use AntChain\ATO\Models\DetailInnerTemplateResponse;
use AntChain\ATO\Models\DownloadInnerFileRequest;
use AntChain\ATO\Models\DownloadInnerFileResponse;
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
use AntChain\ATO\Models\GetInnerProductRequest;
use AntChain\ATO\Models\GetInnerProductResponse;
use AntChain\ATO\Models\GetInnerTemplateofficeurlRequest;
use AntChain\ATO\Models\GetInnerTemplateofficeurlResponse;
use AntChain\ATO\Models\GetInnerTenantRequest;
use AntChain\ATO\Models\GetInnerTenantResponse;
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
use AntChain\ATO\Models\ListInnerTemplateRequest;
use AntChain\ATO\Models\ListInnerTemplateResponse;
use AntChain\ATO\Models\NotifyFundFlowRequest;
use AntChain\ATO\Models\NotifyFundFlowResponse;
use AntChain\ATO\Models\PagequeryInnerFunddividerelationRequest;
use AntChain\ATO\Models\PagequeryInnerFunddividerelationResponse;
use AntChain\ATO\Models\PagequeryInnerMerchantagentRequest;
use AntChain\ATO\Models\PagequeryInnerMerchantagentResponse;
use AntChain\ATO\Models\PagequeryInnerMerchantagreementRequest;
use AntChain\ATO\Models\PagequeryInnerMerchantagreementResponse;
use AntChain\ATO\Models\PagequeryInnerOrdermsgRequest;
use AntChain\ATO\Models\PagequeryInnerOrdermsgResponse;
use AntChain\ATO\Models\PreviewInnerTemplateRequest;
use AntChain\ATO\Models\PreviewInnerTemplateResponse;
use AntChain\ATO\Models\PublishInnerTemplateRequest;
use AntChain\ATO\Models\PublishInnerTemplateResponse;
use AntChain\ATO\Models\QueryFundCreditRequest;
use AntChain\ATO\Models\QueryFundCreditResponse;
use AntChain\ATO\Models\QueryInnerFunddividerelationRequest;
use AntChain\ATO\Models\QueryInnerFunddividerelationResponse;
use AntChain\ATO\Models\QueryInnerMerchantagreementRequest;
use AntChain\ATO\Models\QueryInnerMerchantagreementResponse;
use AntChain\ATO\Models\QueryInnerMerchantpayexpandRequest;
use AntChain\ATO\Models\QueryInnerMerchantpayexpandResponse;
use AntChain\ATO\Models\QueryInnerSignfieldsRequest;
use AntChain\ATO\Models\QueryInnerSignfieldsResponse;
use AntChain\ATO\Models\QueryInnerTemplateelementlinkRequest;
use AntChain\ATO\Models\QueryInnerTemplateelementlinkResponse;
use AntChain\ATO\Models\QueryInnerTemplateimageRequest;
use AntChain\ATO\Models\QueryInnerTemplateimageResponse;
use AntChain\ATO\Models\QueryInnerTemplateRequest;
use AntChain\ATO\Models\QueryInnerTemplateResponse;
use AntChain\ATO\Models\QueryInnerTemplateversionRequest;
use AntChain\ATO\Models\QueryInnerTemplateversionResponse;
use AntChain\ATO\Models\QueryMerchantexpandMerchantRequest;
use AntChain\ATO\Models\QueryMerchantexpandMerchantResponse;
use AntChain\ATO\Models\QueryRealpersonFacevrfRequest;
use AntChain\ATO\Models\QueryRealpersonFacevrfResponse;
use AntChain\ATO\Models\QueryRiskRequest;
use AntChain\ATO\Models\QueryRiskResponse;
use AntChain\ATO\Models\QuerySignCreditRequest;
use AntChain\ATO\Models\QuerySignCreditResponse;
use AntChain\ATO\Models\QueryWithholdActivepayRequest;
use AntChain\ATO\Models\QueryWithholdActivepayResponse;
use AntChain\ATO\Models\QueryWithholdRefundRequest;
use AntChain\ATO\Models\QueryWithholdRefundResponse;
use AntChain\ATO\Models\QueryWithholdSignRequest;
use AntChain\ATO\Models\QueryWithholdSignResponse;
use AntChain\ATO\Models\RefreshInnerTemplatetokenRequest;
use AntChain\ATO\Models\RefreshInnerTemplatetokenResponse;
use AntChain\ATO\Models\RefuseFundFlowRequest;
use AntChain\ATO\Models\RefuseFundFlowResponse;
use AntChain\ATO\Models\RegisterMerchantexpandMerchantRequest;
use AntChain\ATO\Models\RegisterMerchantexpandMerchantResponse;
use AntChain\ATO\Models\RepayWithholdPlanRequest;
use AntChain\ATO\Models\RepayWithholdPlanResponse;
use AntChain\ATO\Models\RetryInnerOrdermsgRequest;
use AntChain\ATO\Models\RetryInnerOrdermsgResponse;
use AntChain\ATO\Models\RetryWithholdPlanRequest;
use AntChain\ATO\Models\RetryWithholdPlanResponse;
use AntChain\ATO\Models\SaveInnerSignfieldsRequest;
use AntChain\ATO\Models\SaveInnerSignfieldsResponse;
use AntChain\ATO\Models\SaveInnerTemplateRequest;
use AntChain\ATO\Models\SaveInnerTemplateResponse;
use AntChain\ATO\Models\SubmitFrontSignRequest;
use AntChain\ATO\Models\SubmitFrontSignResponse;
use AntChain\ATO\Models\SubmitInnerFunddividerelationRequest;
use AntChain\ATO\Models\SubmitInnerFunddividerelationResponse;
use AntChain\ATO\Models\SubmitInnerMerchantpayexpandRequest;
use AntChain\ATO\Models\SubmitInnerMerchantpayexpandResponse;
use AntChain\ATO\Models\SubmitSignFlowRequest;
use AntChain\ATO\Models\SubmitSignFlowResponse;
use AntChain\ATO\Models\SyncFrontIndirectorderRequest;
use AntChain\ATO\Models\SyncFrontIndirectorderResponse;
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
use AntChain\ATO\Models\SyncInnerMeterforagsignRequest;
use AntChain\ATO\Models\SyncInnerMeterforagsignResponse;
use AntChain\ATO\Models\SyncInnerMeterforwholeorderRequest;
use AntChain\ATO\Models\SyncInnerMeterforwholeorderResponse;
use AntChain\ATO\Models\SyncInnerTemplateRequest;
use AntChain\ATO\Models\SyncInnerTemplateResponse;
use AntChain\ATO\Models\SyncTradeFinanceloanapplyRequest;
use AntChain\ATO\Models\SyncTradeFinanceloanapplyResponse;
use AntChain\ATO\Models\SyncTradeIndirectorderRequest;
use AntChain\ATO\Models\SyncTradeIndirectorderResponse;
use AntChain\ATO\Models\SyncTradeRequest;
use AntChain\ATO\Models\SyncTradeResponse;
use AntChain\ATO\Models\UnbindWithholdSignRequest;
use AntChain\ATO\Models\UnbindWithholdSignResponse;
use AntChain\ATO\Models\UpdateInnerTemplateRequest;
use AntChain\ATO\Models\UpdateInnerTemplateResponse;
use AntChain\ATO\Models\UpdateMerchantexpandMerchantRequest;
use AntChain\ATO\Models\UpdateMerchantexpandMerchantResponse;
use AntChain\ATO\Models\UpdateTradeUserpromisebatchRequest;
use AntChain\ATO\Models\UpdateTradeUserpromisebatchResponse;
use AntChain\ATO\Models\UpdateTradeUserpromiseRequest;
use AntChain\ATO\Models\UpdateTradeUserpromiseResponse;
use AntChain\ATO\Models\UploadFundCreditRequest;
use AntChain\ATO\Models\UploadFundCreditResponse;
use AntChain\ATO\Models\UploadFundFlowRequest;
use AntChain\ATO\Models\UploadFundFlowResponse;
use AntChain\ATO\Models\UploadInnerFileRequest;
use AntChain\ATO\Models\UploadInnerFileResponse;
use AntChain\ATO\Models\UploadMerchantexpandFileRequest;
use AntChain\ATO\Models\UploadMerchantexpandFileResponse;
use AntChain\ATO\Models\UploadSignCreditRequest;
use AntChain\ATO\Models\UploadSignCreditResponse;
use AntChain\ATO\Models\UploadSignFlowRequest;
use AntChain\ATO\Models\UploadSignFlowResponse;
use AntChain\ATO\Models\UploadSignTemplateRequest;
use AntChain\ATO\Models\UploadSignTemplateResponse;
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
            // 文件信息
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
                    'sdk_version'      => '1.8.98',
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
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口.
     *
     * @param NotifyFundFlowRequest $request
     *
     * @return NotifyFundFlowResponse
     */
    public function notifyFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口.
     *
     * @param NotifyFundFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return NotifyFundFlowResponse
     */
    public function notifyFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传.
     *
     * @param UploadFundCreditRequest $request
     *
     * @return UploadFundCreditResponse
     */
    public function uploadFundCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadFundCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传.
     *
     * @param UploadFundCreditRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UploadFundCreditResponse
     */
    public function uploadFundCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadFundCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.credit.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询.
     *
     * @param QueryFundCreditRequest $request
     *
     * @return QueryFundCreditResponse
     */
    public function queryFundCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFundCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询.
     *
     * @param QueryFundCreditRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryFundCreditResponse
     */
    public function queryFundCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFundCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.credit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部调用,商品信息获取
     * Summary: 商品信息获取.
     *
     * @param GetInnerProductRequest $request
     *
     * @return GetInnerProductResponse
     */
    public function getInnerProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部调用,商品信息获取
     * Summary: 商品信息获取.
     *
     * @param GetInnerProductRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetInnerProductResponse
     */
    public function getInnerProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerProductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.product.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ato内部服务，客户系统不可访问；租户信息获取
     * Summary: 租户信息获取.
     *
     * @param GetInnerTenantRequest $request
     *
     * @return GetInnerTenantResponse
     */
    public function getInnerTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: ato内部服务，客户系统不可访问；租户信息获取
     * Summary: 租户信息获取.
     *
     * @param GetInnerTenantRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetInnerTenantResponse
     */
    public function getInnerTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerTenantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.tenant.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
     * Summary: 上报整单结算计量信息.
     *
     * @param SyncInnerMeterforwholeorderRequest $request
     *
     * @return SyncInnerMeterforwholeorderResponse
     */
    public function syncInnerMeterforwholeorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerMeterforwholeorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
     * Summary: 上报整单结算计量信息.
     *
     * @param SyncInnerMeterforwholeorderRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SyncInnerMeterforwholeorderResponse
     */
    public function syncInnerMeterforwholeorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerMeterforwholeorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.meterforwholeorder.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部调用，合同签署计量上报接口
     * Summary: 合同签署计量上报同步接口.
     *
     * @param SyncInnerMeterforagsignRequest $request
     *
     * @return SyncInnerMeterforagsignResponse
     */
    public function syncInnerMeterforagsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerMeterforagsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部调用，合同签署计量上报接口
     * Summary: 合同签署计量上报同步接口.
     *
     * @param SyncInnerMeterforagsignRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncInnerMeterforagsignResponse
     */
    public function syncInnerMeterforagsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerMeterforagsignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.meterforagsign.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表.
     *
     * @param AllInnerTemplateRequest $request
     *
     * @return AllInnerTemplateResponse
     */
    public function allInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表.
     *
     * @param AllInnerTemplateRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AllInnerTemplateResponse
     */
    public function allInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表.
     *
     * @param ListInnerTemplateRequest $request
     *
     * @return ListInnerTemplateResponse
     */
    public function listInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表.
     *
     * @param ListInnerTemplateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListInnerTemplateResponse
     */
    public function listInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情.
     *
     * @param DetailInnerTemplateRequest $request
     *
     * @return DetailInnerTemplateResponse
     */
    public function detailInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情.
     *
     * @param DetailInnerTemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DetailInnerTemplateResponse
     */
    public function detailInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，创建魔法库模板
     * Summary: 创建模板
     *
     * @param CreateInnerTemplateRequest $request
     *
     * @return CreateInnerTemplateResponse
     */
    public function createInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，创建魔法库模板
     * Summary: 创建模板
     *
     * @param CreateInnerTemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateInnerTemplateResponse
     */
    public function createInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板
     *
     * @param SaveInnerTemplateRequest $request
     *
     * @return SaveInnerTemplateResponse
     */
    public function saveInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板
     *
     * @param SaveInnerTemplateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SaveInnerTemplateResponse
     */
    public function saveInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，保存魔法库模板签署区
     * Summary: 保存魔法库模板签署区.
     *
     * @param SaveInnerSignfieldsRequest $request
     *
     * @return SaveInnerSignfieldsResponse
     */
    public function saveInnerSignfields($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveInnerSignfieldsEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，保存魔法库模板签署区
     * Summary: 保存魔法库模板签署区.
     *
     * @param SaveInnerSignfieldsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SaveInnerSignfieldsResponse
     */
    public function saveInnerSignfieldsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveInnerSignfieldsResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.signfields.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板
     *
     * @param PublishInnerTemplateRequest $request
     *
     * @return PublishInnerTemplateResponse
     */
    public function publishInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板
     *
     * @param PublishInnerTemplateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PublishInnerTemplateResponse
     */
    public function publishInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板
     *
     * @param PreviewInnerTemplateRequest $request
     *
     * @return PreviewInnerTemplateResponse
     */
    public function previewInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->previewInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板
     *
     * @param PreviewInnerTemplateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PreviewInnerTemplateResponse
     */
    public function previewInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PreviewInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.preview', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板
     *
     * @param DeleteInnerTemplateRequest $request
     *
     * @return DeleteInnerTemplateResponse
     */
    public function deleteInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板
     *
     * @param DeleteInnerTemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteInnerTemplateResponse
     */
    public function deleteInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板
     *
     * @param CloneInnerTemplateRequest $request
     *
     * @return CloneInnerTemplateResponse
     */
    public function cloneInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cloneInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板
     *
     * @param CloneInnerTemplateRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CloneInnerTemplateResponse
     */
    public function cloneInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloneInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.clone', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ato文件上传
     * Summary: ato文件上传.
     *
     * @param UploadInnerFileRequest $request
     *
     * @return UploadInnerFileResponse
     */
    public function uploadInnerFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadInnerFileEx($request, $headers, $runtime);
    }

    /**
     * Description: ato文件上传
     * Summary: ato文件上传.
     *
     * @param UploadInnerFileRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UploadInnerFileResponse
     */
    public function uploadInnerFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadInnerFileResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ato文件下载
     * Summary: ato文件下载.
     *
     * @param DownloadInnerFileRequest $request
     *
     * @return DownloadInnerFileResponse
     */
    public function downloadInnerFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadInnerFileEx($request, $headers, $runtime);
    }

    /**
     * Description: ato文件下载
     * Summary: ato文件下载.
     *
     * @param DownloadInnerFileRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DownloadInnerFileResponse
     */
    public function downloadInnerFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadInnerFileResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.file.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取 webofficeURL（透传）
     * Summary: 获取 webofficeURL.
     *
     * @param GetInnerTemplateofficeurlRequest $request
     *
     * @return GetInnerTemplateofficeurlResponse
     */
    public function getInnerTemplateofficeurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerTemplateofficeurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取 webofficeURL（透传）
     * Summary: 获取 webofficeURL.
     *
     * @param GetInnerTemplateofficeurlRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetInnerTemplateofficeurlResponse
     */
    public function getInnerTemplateofficeurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerTemplateofficeurlResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateofficeurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 魔法库控制台刷新token
     * Summary: 刷新token.
     *
     * @param RefreshInnerTemplatetokenRequest $request
     *
     * @return RefreshInnerTemplatetokenResponse
     */
    public function refreshInnerTemplatetoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refreshInnerTemplatetokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 魔法库控制台刷新token
     * Summary: 刷新token.
     *
     * @param RefreshInnerTemplatetokenRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return RefreshInnerTemplatetokenResponse
     */
    public function refreshInnerTemplatetokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefreshInnerTemplatetokenResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templatetoken.refresh', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建文本域（组件）
     * Summary: 创建文本域
     *
     * @param CreateInnerTemplatetextareaRequest $request
     *
     * @return CreateInnerTemplatetextareaResponse
     */
    public function createInnerTemplatetextarea($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerTemplatetextareaEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建文本域（组件）
     * Summary: 创建文本域
     *
     * @param CreateInnerTemplatetextareaRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateInnerTemplatetextareaResponse
     */
    public function createInnerTemplatetextareaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerTemplatetextareaResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templatetextarea.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表.
     *
     * @param QueryInnerTemplateimageRequest $request
     *
     * @return QueryInnerTemplateimageResponse
     */
    public function queryInnerTemplateimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTemplateimageEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表.
     *
     * @param QueryInnerTemplateimageRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryInnerTemplateimageResponse
     */
    public function queryInnerTemplateimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTemplateimageResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateimage.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存/编辑分账关系信息
     * Summary: 保存/编辑分账关系信息.
     *
     * @param CreateInnerFunddividerelationRequest $request
     *
     * @return CreateInnerFunddividerelationResponse
     */
    public function createInnerFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存/编辑分账关系信息
     * Summary: 保存/编辑分账关系信息.
     *
     * @param CreateInnerFunddividerelationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateInnerFunddividerelationResponse
     */
    public function createInnerFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.funddividerelation.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交分账关系信息
     * Summary: 提交分账关系信息.
     *
     * @param SubmitInnerFunddividerelationRequest $request
     *
     * @return SubmitInnerFunddividerelationResponse
     */
    public function submitInnerFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交分账关系信息
     * Summary: 提交分账关系信息.
     *
     * @param SubmitInnerFunddividerelationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return SubmitInnerFunddividerelationResponse
     */
    public function submitInnerFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.funddividerelation.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询分账关系信息
     * Summary: 查询分账关系信息.
     *
     * @param QueryInnerFunddividerelationRequest $request
     *
     * @return QueryInnerFunddividerelationResponse
     */
    public function queryInnerFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询分账关系信息
     * Summary: 查询分账关系信息.
     *
     * @param QueryInnerFunddividerelationRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryInnerFunddividerelationResponse
     */
    public function queryInnerFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.funddividerelation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询分账关系分页列表
     * Summary: 查询分账关系分页列表.
     *
     * @param PagequeryInnerFunddividerelationRequest $request
     *
     * @return PagequeryInnerFunddividerelationResponse
     */
    public function pagequeryInnerFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询分账关系分页列表
     * Summary: 查询分账关系分页列表.
     *
     * @param PagequeryInnerFunddividerelationRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return PagequeryInnerFunddividerelationResponse
     */
    public function pagequeryInnerFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.funddividerelation.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存租户签约信息
     * Summary: 保存租户签约信息.
     *
     * @param CreateInnerMerchantagreementRequest $request
     *
     * @return CreateInnerMerchantagreementResponse
     */
    public function createInnerMerchantagreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerMerchantagreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存租户签约信息
     * Summary: 保存租户签约信息.
     *
     * @param CreateInnerMerchantagreementRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateInnerMerchantagreementResponse
     */
    public function createInnerMerchantagreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerMerchantagreementResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantagreement.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户签约信息
     * Summary: 查询租户签约信息.
     *
     * @param QueryInnerMerchantagreementRequest $request
     *
     * @return QueryInnerMerchantagreementResponse
     */
    public function queryInnerMerchantagreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerMerchantagreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户签约信息
     * Summary: 查询租户签约信息.
     *
     * @param QueryInnerMerchantagreementRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryInnerMerchantagreementResponse
     */
    public function queryInnerMerchantagreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerMerchantagreementResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantagreement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户签约协议分页列表
     * Summary: 查询租户签约协议分页列表.
     *
     * @param PagequeryInnerMerchantagreementRequest $request
     *
     * @return PagequeryInnerMerchantagreementResponse
     */
    public function pagequeryInnerMerchantagreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerMerchantagreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户签约协议分页列表
     * Summary: 查询租户签约协议分页列表.
     *
     * @param PagequeryInnerMerchantagreementRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return PagequeryInnerMerchantagreementResponse
     */
    public function pagequeryInnerMerchantagreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerMerchantagreementResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantagreement.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存/编辑进件信息
     * Summary: 保存/编辑进件信息.
     *
     * @param CreateInnerMerchantpayexpandRequest $request
     *
     * @return CreateInnerMerchantpayexpandResponse
     */
    public function createInnerMerchantpayexpand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerMerchantpayexpandEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存/编辑进件信息
     * Summary: 保存/编辑进件信息.
     *
     * @param CreateInnerMerchantpayexpandRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateInnerMerchantpayexpandResponse
     */
    public function createInnerMerchantpayexpandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerMerchantpayexpandResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantpayexpand.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交进件信息
     * Summary: 提交进件信息.
     *
     * @param SubmitInnerMerchantpayexpandRequest $request
     *
     * @return SubmitInnerMerchantpayexpandResponse
     */
    public function submitInnerMerchantpayexpand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerMerchantpayexpandEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交进件信息
     * Summary: 提交进件信息.
     *
     * @param SubmitInnerMerchantpayexpandRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return SubmitInnerMerchantpayexpandResponse
     */
    public function submitInnerMerchantpayexpandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerMerchantpayexpandResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantpayexpand.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询进件信息
     * Summary: 查询进件信息.
     *
     * @param QueryInnerMerchantpayexpandRequest $request
     *
     * @return QueryInnerMerchantpayexpandResponse
     */
    public function queryInnerMerchantpayexpand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerMerchantpayexpandEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询进件信息
     * Summary: 查询进件信息.
     *
     * @param QueryInnerMerchantpayexpandRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryInnerMerchantpayexpandResponse
     */
    public function queryInnerMerchantpayexpandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerMerchantpayexpandResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantpayexpand.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询代理商户分页列表-间连商户使用
     * Summary: 查询代理商户分页列表-间连商户使用.
     *
     * @param PagequeryInnerMerchantagentRequest $request
     *
     * @return PagequeryInnerMerchantagentResponse
     */
    public function pagequeryInnerMerchantagent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerMerchantagentEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询代理商户分页列表-间连商户使用
     * Summary: 查询代理商户分页列表-间连商户使用.
     *
     * @param PagequeryInnerMerchantagentRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return PagequeryInnerMerchantagentResponse
     */
    public function pagequeryInnerMerchantagentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerMerchantagentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantagent.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 拷贝模板文件，可用于保存模板的入参
     * Summary: 拷贝模板文件.
     *
     * @param CloneInnerTemplatefileaddressRequest $request
     *
     * @return CloneInnerTemplatefileaddressResponse
     */
    public function cloneInnerTemplatefileaddress($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cloneInnerTemplatefileaddressEx($request, $headers, $runtime);
    }

    /**
     * Description: 拷贝模板文件，可用于保存模板的入参
     * Summary: 拷贝模板文件.
     *
     * @param CloneInnerTemplatefileaddressRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CloneInnerTemplatefileaddressResponse
     */
    public function cloneInnerTemplatefileaddressEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloneInnerTemplatefileaddressResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templatefileaddress.clone', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询签署区
     * Summary: 查询签署区.
     *
     * @param QueryInnerSignfieldsRequest $request
     *
     * @return QueryInnerSignfieldsResponse
     */
    public function queryInnerSignfields($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerSignfieldsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询签署区
     * Summary: 查询签署区.
     *
     * @param QueryInnerSignfieldsRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryInnerSignfieldsResponse
     */
    public function queryInnerSignfieldsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerSignfieldsResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.signfields.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步已发布的模板
     * Summary: 同步已发布的模板
     *
     * @param SyncInnerTemplateRequest $request
     *
     * @return SyncInnerTemplateResponse
     */
    public function syncInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步已发布的模板
     * Summary: 同步已发布的模板
     *
     * @param SyncInnerTemplateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SyncInnerTemplateResponse
     */
    public function syncInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息.
     *
     * @param UpdateInnerTemplateRequest $request
     *
     * @return UpdateInnerTemplateResponse
     */
    public function updateInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息.
     *
     * @param UpdateInnerTemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateInnerTemplateResponse
     */
    public function updateInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息.
     *
     * @param QueryInnerTemplateRequest $request
     *
     * @return QueryInnerTemplateResponse
     */
    public function queryInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息.
     *
     * @param QueryInnerTemplateRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryInnerTemplateResponse
     */
    public function queryInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息.
     *
     * @param QueryInnerTemplateelementlinkRequest $request
     *
     * @return QueryInnerTemplateelementlinkResponse
     */
    public function queryInnerTemplateelementlink($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTemplateelementlinkEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息.
     *
     * @param QueryInnerTemplateelementlinkRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryInnerTemplateelementlinkResponse
     */
    public function queryInnerTemplateelementlinkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTemplateelementlinkResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateelementlink.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
     * Summary: 查询模板的版本详情.
     *
     * @param QueryInnerTemplateversionRequest $request
     *
     * @return QueryInnerTemplateversionResponse
     */
    public function queryInnerTemplateversion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTemplateversionEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
     * Summary: 查询模板的版本详情.
     *
     * @param QueryInnerTemplateversionRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryInnerTemplateversionResponse
     */
    public function queryInnerTemplateversionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTemplateversionResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateversion.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单消息查询
     * Summary: 订单消息查询.
     *
     * @param PagequeryInnerOrdermsgRequest $request
     *
     * @return PagequeryInnerOrdermsgResponse
     */
    public function pagequeryInnerOrdermsg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerOrdermsgEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单消息查询
     * Summary: 订单消息查询.
     *
     * @param PagequeryInnerOrdermsgRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PagequeryInnerOrdermsgResponse
     */
    public function pagequeryInnerOrdermsgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerOrdermsgResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.ordermsg.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单消息重试
     * Summary: 订单消息重试.
     *
     * @param RetryInnerOrdermsgRequest $request
     *
     * @return RetryInnerOrdermsgResponse
     */
    public function retryInnerOrdermsg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryInnerOrdermsgEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单消息重试
     * Summary: 订单消息重试.
     *
     * @param RetryInnerOrdermsgRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return RetryInnerOrdermsgResponse
     */
    public function retryInnerOrdermsgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryInnerOrdermsgResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.ordermsg.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻.
     *
     * @param RegisterMerchantexpandMerchantRequest $request
     *
     * @return RegisterMerchantexpandMerchantResponse
     */
    public function registerMerchantexpandMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerMerchantexpandMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻.
     *
     * @param RegisterMerchantexpandMerchantRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return RegisterMerchantexpandMerchantResponse
     */
    public function registerMerchantexpandMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterMerchantexpandMerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.merchant.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接.
     *
     * @param UploadMerchantexpandFileRequest $request
     *
     * @return UploadMerchantexpandFileResponse
     */
    public function uploadMerchantexpandFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadMerchantexpandFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接.
     *
     * @param UploadMerchantexpandFileRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UploadMerchantexpandFileResponse
     */
    public function uploadMerchantexpandFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadMerchantexpandFileResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询.
     *
     * @param QueryMerchantexpandMerchantRequest $request
     *
     * @return QueryMerchantexpandMerchantResponse
     */
    public function queryMerchantexpandMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantexpandMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询.
     *
     * @param QueryMerchantexpandMerchantRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryMerchantexpandMerchantResponse
     */
    public function queryMerchantexpandMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantexpandMerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.merchant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改.
     *
     * @param UpdateMerchantexpandMerchantRequest $request
     *
     * @return UpdateMerchantexpandMerchantResponse
     */
    public function updateMerchantexpandMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMerchantexpandMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改.
     *
     * @param UpdateMerchantexpandMerchantRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateMerchantexpandMerchantResponse
     */
    public function updateMerchantexpandMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMerchantexpandMerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.merchant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 发起风控分析，获取风险分
     * Summary: 发起风控分析，获取风险分.
     *
     * @param QueryRiskRequest $request
     *
     * @return QueryRiskResponse
     */
    public function queryRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起风控分析，获取风险分
     * Summary: 发起风控分析，获取风险分.
     *
     * @param QueryRiskRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryRiskResponse
     */
    public function queryRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRiskResponse::fromMap($this->doRequest('1.0', 'antchain.ato.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传.
     *
     * @param UploadSignTemplateRequest $request
     *
     * @return UploadSignTemplateResponse
     */
    public function uploadSignTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadSignTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传.
     *
     * @param UploadSignTemplateRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UploadSignTemplateResponse
     */
    public function uploadSignTemplateEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.ato.sign.template.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadSignTemplateResponse([
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

        return UploadSignTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.template.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传.
     *
     * @param UploadSignCreditRequest $request
     *
     * @return UploadSignCreditResponse
     */
    public function uploadSignCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadSignCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传.
     *
     * @param UploadSignCreditRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UploadSignCreditResponse
     */
    public function uploadSignCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadSignCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.credit.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询.
     *
     * @param QuerySignCreditRequest $request
     *
     * @return QuerySignCreditResponse
     */
    public function querySignCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySignCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询.
     *
     * @param QuerySignCreditRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QuerySignCreditResponse
     */
    public function querySignCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySignCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.credit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程.
     *
     * @param CancelSignFlowRequest $request
     *
     * @return CancelSignFlowResponse
     */
    public function cancelSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程.
     *
     * @param CancelSignFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CancelSignFlowResponse
     */
    public function cancelSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改.
     *
     * @param UpdateTradeUserpromiseRequest $request
     *
     * @return UpdateTradeUserpromiseResponse
     */
    public function updateTradeUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTradeUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改.
     *
     * @param UpdateTradeUserpromiseRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateTradeUserpromiseResponse
     */
    public function updateTradeUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTradeUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userpromise.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件.
     *
     * @param SyncFrontIndirectorderRequest $request
     *
     * @return SyncFrontIndirectorderResponse
     */
    public function syncFrontIndirectorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFrontIndirectorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件.
     *
     * @param SyncFrontIndirectorderRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncFrontIndirectorderResponse
     */
    public function syncFrontIndirectorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFrontIndirectorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.front.indirectorder.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件.
     *
     * @param SyncTradeIndirectorderRequest $request
     *
     * @return SyncTradeIndirectorderResponse
     */
    public function syncTradeIndirectorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradeIndirectorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件.
     *
     * @param SyncTradeIndirectorderRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncTradeIndirectorderResponse
     */
    public function syncTradeIndirectorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradeIndirectorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.indirectorder.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新.
     *
     * @param UpdateTradeUserpromisebatchRequest $request
     *
     * @return UpdateTradeUserpromisebatchResponse
     */
    public function updateTradeUserpromisebatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTradeUserpromisebatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新.
     *
     * @param UpdateTradeUserpromisebatchRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateTradeUserpromisebatchResponse
     */
    public function updateTradeUserpromisebatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTradeUserpromisebatchResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userpromisebatch.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约创建
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
     * Description: 代扣签约创建
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
     * Description: 重要说明：
     *     1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     *     2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期代扣取消.
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
     * Description: 重要说明：
     *     1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     *     2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期代扣取消.
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
