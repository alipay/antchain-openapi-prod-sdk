<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\AllAntchainAtoSignTemplateRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\AllAntchainAtoSignTemplateResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\ApplyAntchainAtoTradeFinanceprecheckRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\ApplyAntchainAtoTradeFinanceprecheckResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\AuthAntchainAtoFundFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\AuthAntchainAtoFundFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\AuthAntchainAtoSignFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\AuthAntchainAtoSignFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CallbackAntchainAtoFundNotifyRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CallbackAntchainAtoFundNotifyResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CancelAntchainAtoFundPlanRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CancelAntchainAtoFundPlanResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CancelAntchainAtoSignFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CancelAntchainAtoSignFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CancelAntchainAtoWithholdActivepayRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CancelAntchainAtoWithholdActivepayResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CancelAntchainAtoWithholdPlanRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CancelAntchainAtoWithholdPlanResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\ConfirmAntchainAtoWithholdSignasyncunsignRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\ConfirmAntchainAtoWithholdSignasyncunsignResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntchainAtoRealpersonFacevrfRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntchainAtoRealpersonFacevrfResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntchainAtoWithholdActivepayRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntchainAtoWithholdActivepayResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntchainAtoWithholdRefundRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntchainAtoWithholdRefundResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntchainAtoWithholdSignRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntchainAtoWithholdSignResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundMerchantperformanceRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundMerchantperformanceResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundOrderfullinfoRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundOrderfullinfoResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundUserperformanceRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundUserperformanceResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundUserpromiseRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoFundUserpromiseResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoSignContractcertificateRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoSignContractcertificateResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoSignFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoSignFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoTradeMerchantfulfillmentRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoTradeMerchantfulfillmentResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoTradeMerchantperformanceRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoTradeMerchantperformanceResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoTradeRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoTradeResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoTradeUserperformanceRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\GetAntchainAtoTradeUserperformanceResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\NotifyAntchainAtoFundFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\NotifyAntchainAtoFundFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoFundCompensateaccountRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoFundCompensateaccountResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoFundCreditRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoFundCreditResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoMerchantexpandMerchantRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoMerchantexpandMerchantResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoRealpersonFacevrfRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoRealpersonFacevrfResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoSignCreditRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoSignCreditResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoWithholdActivepayRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoWithholdActivepayResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoWithholdCompensateaccountRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoWithholdCompensateaccountResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoWithholdRefundRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoWithholdRefundResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoWithholdSignRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\QueryAntchainAtoWithholdSignResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\RefuseAntchainAtoFundFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\RefuseAntchainAtoFundFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\RegisterAntchainAtoMerchantexpandMerchantRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\RegisterAntchainAtoMerchantexpandMerchantResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\RepayAntchainAtoWithholdPlanRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\RepayAntchainAtoWithholdPlanResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\ReplaceAntchainAtoTradeUserpromiseRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\ReplaceAntchainAtoTradeUserpromiseResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\RetryAntchainAtoWithholdPlanRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\RetryAntchainAtoWithholdPlanResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SubmitAntchainAtoFrontSignRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SubmitAntchainAtoFrontSignResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SubmitAntchainAtoSignFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SubmitAntchainAtoSignFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFrontIndirectorderRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFrontIndirectorderResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFrontTradeRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFrontTradeResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFundFinanceloanresultsRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFundFinanceloanresultsResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFundFinanceprecheckresultRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFundFinanceprecheckresultResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFundMerchantpromiseRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoFundMerchantpromiseResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoTradeFinanceloanapplyRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoTradeFinanceloanapplyResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoTradeIndirectorderRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoTradeIndirectorderResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoTradeRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\SyncAntchainAtoTradeResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\TransferAntchainAtoTradeFinanceRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\TransferAntchainAtoTradeFinanceResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UnbindAntchainAtoWithholdSignRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UnbindAntchainAtoWithholdSignResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UpdateAntchainAtoMerchantexpandMerchantRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UpdateAntchainAtoMerchantexpandMerchantResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UpdateAntchainAtoTradeUserpromiseRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UpdateAntchainAtoTradeUserpromiseResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoFundCreditRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoFundCreditResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoFundFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoFundFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoMerchantexpandFileRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoMerchantexpandFileResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoSignCreditRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoSignCreditResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoSignFlowRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoSignFlowResponse;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoSignTemplateRequest;
use AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models\UploadAntchainAtoSignTemplateResponse;
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
                    'sdk_version'      => '1.3.10',
                    '_prod_code'       => 'ak_195dff03d395462ea294bafdba69df3f',
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
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）.
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
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）.
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
     * Description: 代扣签约创建
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
     * Description: 代扣签约创建
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
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作.
     *
     * @param AuthAntchainAtoSignFlowRequest $request
     *
     * @return AuthAntchainAtoSignFlowResponse
     */
    public function authAntchainAtoSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authAntchainAtoSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作.
     *
     * @param AuthAntchainAtoSignFlowRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return AuthAntchainAtoSignFlowResponse
     */
    public function authAntchainAtoSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthAntchainAtoSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑.
     *
     * @param UnbindAntchainAtoWithholdSignRequest $request
     *
     * @return UnbindAntchainAtoWithholdSignResponse
     */
    public function unbindAntchainAtoWithholdSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindAntchainAtoWithholdSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑.
     *
     * @param UnbindAntchainAtoWithholdSignRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UnbindAntchainAtoWithholdSignResponse
     */
    public function unbindAntchainAtoWithholdSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindAntchainAtoWithholdSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划.
     *
     * @param CancelAntchainAtoWithholdPlanRequest $request
     *
     * @return CancelAntchainAtoWithholdPlanResponse
     */
    public function cancelAntchainAtoWithholdPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelAntchainAtoWithholdPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划.
     *
     * @param CancelAntchainAtoWithholdPlanRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CancelAntchainAtoWithholdPlanResponse
     */
    public function cancelAntchainAtoWithholdPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelAntchainAtoWithholdPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重要说明：
     *     1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     *     2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期代扣取消.
     *
     * @param RepayAntchainAtoWithholdPlanRequest $request
     *
     * @return RepayAntchainAtoWithholdPlanResponse
     */
    public function repayAntchainAtoWithholdPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayAntchainAtoWithholdPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 重要说明：
     *     1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     *     2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期代扣取消.
     *
     * @param RepayAntchainAtoWithholdPlanRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return RepayAntchainAtoWithholdPlanResponse
     */
    public function repayAntchainAtoWithholdPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayAntchainAtoWithholdPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）.
     *
     * @param SubmitAntchainAtoFrontSignRequest $request
     *
     * @return SubmitAntchainAtoFrontSignResponse
     */
    public function submitAntchainAtoFrontSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAntchainAtoFrontSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）.
     *
     * @param SubmitAntchainAtoFrontSignRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SubmitAntchainAtoFrontSignResponse
     */
    public function submitAntchainAtoFrontSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAntchainAtoFrontSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.front.sign.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建.
     *
     * @param SyncAntchainAtoFrontTradeRequest $request
     *
     * @return SyncAntchainAtoFrontTradeResponse
     */
    public function syncAntchainAtoFrontTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFrontTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建.
     *
     * @param SyncAntchainAtoFrontTradeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SyncAntchainAtoFrontTradeResponse
     */
    public function syncAntchainAtoFrontTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFrontTradeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.front.trade.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试.
     *
     * @param RetryAntchainAtoWithholdPlanRequest $request
     *
     * @return RetryAntchainAtoWithholdPlanResponse
     */
    public function retryAntchainAtoWithholdPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryAntchainAtoWithholdPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试.
     *
     * @param RetryAntchainAtoWithholdPlanRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return RetryAntchainAtoWithholdPlanResponse
     */
    public function retryAntchainAtoWithholdPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryAntchainAtoWithholdPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认.
     *
     * @param ConfirmAntchainAtoWithholdSignasyncunsignRequest $request
     *
     * @return ConfirmAntchainAtoWithholdSignasyncunsignResponse
     */
    public function confirmAntchainAtoWithholdSignasyncunsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmAntchainAtoWithholdSignasyncunsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认.
     *
     * @param ConfirmAntchainAtoWithholdSignasyncunsignRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return ConfirmAntchainAtoWithholdSignasyncunsignResponse
     */
    public function confirmAntchainAtoWithholdSignasyncunsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmAntchainAtoWithholdSignasyncunsignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.signasyncunsign.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口.
     *
     * @param UploadAntchainAtoFundFlowRequest $request
     *
     * @return UploadAntchainAtoFundFlowResponse
     */
    public function uploadAntchainAtoFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAntchainAtoFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口.
     *
     * @param UploadAntchainAtoFundFlowRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UploadAntchainAtoFundFlowResponse
     */
    public function uploadAntchainAtoFundFlowEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.ato.fund.flow.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadAntchainAtoFundFlowResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadAntchainAtoFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口.
     *
     * @param GetAntchainAtoFundFlowRequest $request
     *
     * @return GetAntchainAtoFundFlowResponse
     */
    public function getAntchainAtoFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口.
     *
     * @param GetAntchainAtoFundFlowRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetAntchainAtoFundFlowResponse
     */
    public function getAntchainAtoFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知.
     *
     * @param RefuseAntchainAtoFundFlowRequest $request
     *
     * @return RefuseAntchainAtoFundFlowResponse
     */
    public function refuseAntchainAtoFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseAntchainAtoFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知.
     *
     * @param RefuseAntchainAtoFundFlowRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return RefuseAntchainAtoFundFlowResponse
     */
    public function refuseAntchainAtoFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseAntchainAtoFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口.
     *
     * @param AuthAntchainAtoFundFlowRequest $request
     *
     * @return AuthAntchainAtoFundFlowResponse
     */
    public function authAntchainAtoFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authAntchainAtoFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方调用，授权通过e签宝进行落签
     * Summary: 资方e签宝落签接口.
     *
     * @param AuthAntchainAtoFundFlowRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return AuthAntchainAtoFundFlowResponse
     */
    public function authAntchainAtoFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthAntchainAtoFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建.
     *
     * @param CreateAntchainAtoWithholdActivepayRequest $request
     *
     * @return CreateAntchainAtoWithholdActivepayResponse
     */
    public function createAntchainAtoWithholdActivepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainAtoWithholdActivepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣主动支付创建
     * Summary: 代扣主动支付创建.
     *
     * @param CreateAntchainAtoWithholdActivepayRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return CreateAntchainAtoWithholdActivepayResponse
     */
    public function createAntchainAtoWithholdActivepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainAtoWithholdActivepayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.activepay.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询.
     *
     * @param QueryAntchainAtoWithholdActivepayRequest $request
     *
     * @return QueryAntchainAtoWithholdActivepayResponse
     */
    public function queryAntchainAtoWithholdActivepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAtoWithholdActivepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣主动支付查询
     * Summary: 代扣主动支付查询.
     *
     * @param QueryAntchainAtoWithholdActivepayRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryAntchainAtoWithholdActivepayResponse
     */
    public function queryAntchainAtoWithholdActivepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAtoWithholdActivepayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.activepay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消.
     *
     * @param CancelAntchainAtoWithholdActivepayRequest $request
     *
     * @return CancelAntchainAtoWithholdActivepayResponse
     */
    public function cancelAntchainAtoWithholdActivepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelAntchainAtoWithholdActivepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣主动支付取消
     * Summary: 代扣主动支付取消.
     *
     * @param CancelAntchainAtoWithholdActivepayRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return CancelAntchainAtoWithholdActivepayResponse
     */
    public function cancelAntchainAtoWithholdActivepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelAntchainAtoWithholdActivepayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.activepay.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消.
     *
     * @param CancelAntchainAtoFundPlanRequest $request
     *
     * @return CancelAntchainAtoFundPlanResponse
     */
    public function cancelAntchainAtoFundPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelAntchainAtoFundPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消.
     *
     * @param CancelAntchainAtoFundPlanRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CancelAntchainAtoFundPlanResponse
     */
    public function cancelAntchainAtoFundPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelAntchainAtoFundPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.plan.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调.
     *
     * @param CallbackAntchainAtoFundNotifyRequest $request
     *
     * @return CallbackAntchainAtoFundNotifyResponse
     */
    public function callbackAntchainAtoFundNotify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackAntchainAtoFundNotifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调.
     *
     * @param CallbackAntchainAtoFundNotifyRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CallbackAntchainAtoFundNotifyResponse
     */
    public function callbackAntchainAtoFundNotifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackAntchainAtoFundNotifyResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.notify.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口.
     *
     * @param SyncAntchainAtoTradeFinanceloanapplyRequest $request
     *
     * @return SyncAntchainAtoTradeFinanceloanapplyResponse
     */
    public function syncAntchainAtoTradeFinanceloanapply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoTradeFinanceloanapplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口.
     *
     * @param SyncAntchainAtoTradeFinanceloanapplyRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return SyncAntchainAtoTradeFinanceloanapplyResponse
     */
    public function syncAntchainAtoTradeFinanceloanapplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoTradeFinanceloanapplyResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.financeloanapply.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询.
     *
     * @param GetAntchainAtoTradeMerchantfulfillmentRequest $request
     *
     * @return GetAntchainAtoTradeMerchantfulfillmentResponse
     */
    public function getAntchainAtoTradeMerchantfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoTradeMerchantfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询.
     *
     * @param GetAntchainAtoTradeMerchantfulfillmentRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return GetAntchainAtoTradeMerchantfulfillmentResponse
     */
    public function getAntchainAtoTradeMerchantfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoTradeMerchantfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.merchantfulfillment.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步.
     *
     * @param SyncAntchainAtoFundMerchantpromiseRequest $request
     *
     * @return SyncAntchainAtoFundMerchantpromiseResponse
     */
    public function syncAntchainAtoFundMerchantpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundMerchantpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步.
     *
     * @param SyncAntchainAtoFundMerchantpromiseRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return SyncAntchainAtoFundMerchantpromiseResponse
     */
    public function syncAntchainAtoFundMerchantpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundMerchantpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.merchantpromise.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步.
     *
     * @param SyncAntchainAtoFundFinanceloanresultsRequest $request
     *
     * @return SyncAntchainAtoFundFinanceloanresultsResponse
     */
    public function syncAntchainAtoFundFinanceloanresults($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundFinanceloanresultsEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步.
     *
     * @param SyncAntchainAtoFundFinanceloanresultsRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return SyncAntchainAtoFundFinanceloanresultsResponse
     */
    public function syncAntchainAtoFundFinanceloanresultsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundFinanceloanresultsResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.financeloanresults.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺.
     *
     * @param GetAntchainAtoFundUserpromiseRequest $request
     *
     * @return GetAntchainAtoFundUserpromiseResponse
     */
    public function getAntchainAtoFundUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoFundUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺.
     *
     * @param GetAntchainAtoFundUserpromiseRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return GetAntchainAtoFundUserpromiseResponse
     */
    public function getAntchainAtoFundUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoFundUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.userpromise.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）.
     *
     * @param GetAntchainAtoTradeUserperformanceRequest $request
     *
     * @return GetAntchainAtoTradeUserperformanceResponse
     */
    public function getAntchainAtoTradeUserperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoTradeUserperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）.
     *
     * @param GetAntchainAtoTradeUserperformanceRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return GetAntchainAtoTradeUserperformanceResponse
     */
    public function getAntchainAtoTradeUserperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoTradeUserperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetAntchainAtoTradeMerchantperformanceRequest $request
     *
     * @return GetAntchainAtoTradeMerchantperformanceResponse
     */
    public function getAntchainAtoTradeMerchantperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoTradeMerchantperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetAntchainAtoTradeMerchantperformanceRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return GetAntchainAtoTradeMerchantperformanceResponse
     */
    public function getAntchainAtoTradeMerchantperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoTradeMerchantperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.merchantperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetAntchainAtoFundUserperformanceRequest $request
     *
     * @return GetAntchainAtoFundUserperformanceResponse
     */
    public function getAntchainAtoFundUserperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoFundUserperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetAntchainAtoFundUserperformanceRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return GetAntchainAtoFundUserperformanceResponse
     */
    public function getAntchainAtoFundUserperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoFundUserperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.userperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetAntchainAtoFundMerchantperformanceRequest $request
     *
     * @return GetAntchainAtoFundMerchantperformanceResponse
     */
    public function getAntchainAtoFundMerchantperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoFundMerchantperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetAntchainAtoFundMerchantperformanceRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return GetAntchainAtoFundMerchantperformanceResponse
     */
    public function getAntchainAtoFundMerchantperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoFundMerchantperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.merchantperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情.
     *
     * @param GetAntchainAtoFundOrderfullinfoRequest $request
     *
     * @return GetAntchainAtoFundOrderfullinfoResponse
     */
    public function getAntchainAtoFundOrderfullinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoFundOrderfullinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方查询订单详情
     * Summary: 资方查询订单详情.
     *
     * @param GetAntchainAtoFundOrderfullinfoRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return GetAntchainAtoFundOrderfullinfoResponse
     */
    public function getAntchainAtoFundOrderfullinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoFundOrderfullinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfullinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口.
     *
     * @param UploadAntchainAtoSignFlowRequest $request
     *
     * @return UploadAntchainAtoSignFlowResponse
     */
    public function uploadAntchainAtoSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAntchainAtoSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口.
     *
     * @param UploadAntchainAtoSignFlowRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UploadAntchainAtoSignFlowResponse
     */
    public function uploadAntchainAtoSignFlowEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.ato.sign.flow.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadAntchainAtoSignFlowResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadAntchainAtoSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请.
     *
     * @param CreateAntchainAtoWithholdRefundRequest $request
     *
     * @return CreateAntchainAtoWithholdRefundResponse
     */
    public function createAntchainAtoWithholdRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainAtoWithholdRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请.
     *
     * @param CreateAntchainAtoWithholdRefundRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return CreateAntchainAtoWithholdRefundResponse
     */
    public function createAntchainAtoWithholdRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainAtoWithholdRefundResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.refund.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询.
     *
     * @param QueryAntchainAtoWithholdRefundRequest $request
     *
     * @return QueryAntchainAtoWithholdRefundResponse
     */
    public function queryAntchainAtoWithholdRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAtoWithholdRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询.
     *
     * @param QueryAntchainAtoWithholdRefundRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryAntchainAtoWithholdRefundResponse
     */
    public function queryAntchainAtoWithholdRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAtoWithholdRefundResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.refund.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改.
     *
     * @param UpdateAntchainAtoTradeUserpromiseRequest $request
     *
     * @return UpdateAntchainAtoTradeUserpromiseResponse
     */
    public function updateAntchainAtoTradeUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAntchainAtoTradeUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改.
     *
     * @param UpdateAntchainAtoTradeUserpromiseRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return UpdateAntchainAtoTradeUserpromiseResponse
     */
    public function updateAntchainAtoTradeUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAntchainAtoTradeUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userpromise.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口.
     *
     * @param NotifyAntchainAtoFundFlowRequest $request
     *
     * @return NotifyAntchainAtoFundFlowResponse
     */
    public function notifyAntchainAtoFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyAntchainAtoFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口.
     *
     * @param NotifyAntchainAtoFundFlowRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return NotifyAntchainAtoFundFlowResponse
     */
    public function notifyAntchainAtoFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyAntchainAtoFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件.
     *
     * @param SyncAntchainAtoFrontIndirectorderRequest $request
     *
     * @return SyncAntchainAtoFrontIndirectorderResponse
     */
    public function syncAntchainAtoFrontIndirectorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFrontIndirectorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件.
     *
     * @param SyncAntchainAtoFrontIndirectorderRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return SyncAntchainAtoFrontIndirectorderResponse
     */
    public function syncAntchainAtoFrontIndirectorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFrontIndirectorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.front.indirectorder.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件.
     *
     * @param SyncAntchainAtoTradeIndirectorderRequest $request
     *
     * @return SyncAntchainAtoTradeIndirectorderResponse
     */
    public function syncAntchainAtoTradeIndirectorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoTradeIndirectorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件.
     *
     * @param SyncAntchainAtoTradeIndirectorderRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return SyncAntchainAtoTradeIndirectorderResponse
     */
    public function syncAntchainAtoTradeIndirectorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoTradeIndirectorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.indirectorder.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻.
     *
     * @param RegisterAntchainAtoMerchantexpandMerchantRequest $request
     *
     * @return RegisterAntchainAtoMerchantexpandMerchantResponse
     */
    public function registerAntchainAtoMerchantexpandMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerAntchainAtoMerchantexpandMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻.
     *
     * @param RegisterAntchainAtoMerchantexpandMerchantRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return RegisterAntchainAtoMerchantexpandMerchantResponse
     */
    public function registerAntchainAtoMerchantexpandMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterAntchainAtoMerchantexpandMerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.merchant.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接.
     *
     * @param UploadAntchainAtoMerchantexpandFileRequest $request
     *
     * @return UploadAntchainAtoMerchantexpandFileResponse
     */
    public function uploadAntchainAtoMerchantexpandFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAntchainAtoMerchantexpandFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接.
     *
     * @param UploadAntchainAtoMerchantexpandFileRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return UploadAntchainAtoMerchantexpandFileResponse
     */
    public function uploadAntchainAtoMerchantexpandFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadAntchainAtoMerchantexpandFileResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询.
     *
     * @param QueryAntchainAtoMerchantexpandMerchantRequest $request
     *
     * @return QueryAntchainAtoMerchantexpandMerchantResponse
     */
    public function queryAntchainAtoMerchantexpandMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAtoMerchantexpandMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询.
     *
     * @param QueryAntchainAtoMerchantexpandMerchantRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return QueryAntchainAtoMerchantexpandMerchantResponse
     */
    public function queryAntchainAtoMerchantexpandMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAtoMerchantexpandMerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.merchant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传.
     *
     * @param UploadAntchainAtoSignTemplateRequest $request
     *
     * @return UploadAntchainAtoSignTemplateResponse
     */
    public function uploadAntchainAtoSignTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAntchainAtoSignTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传.
     *
     * @param UploadAntchainAtoSignTemplateRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UploadAntchainAtoSignTemplateResponse
     */
    public function uploadAntchainAtoSignTemplateEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.ato.sign.template.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadAntchainAtoSignTemplateResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadAntchainAtoSignTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.template.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传.
     *
     * @param UploadAntchainAtoFundCreditRequest $request
     *
     * @return UploadAntchainAtoFundCreditResponse
     */
    public function uploadAntchainAtoFundCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAntchainAtoFundCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传.
     *
     * @param UploadAntchainAtoFundCreditRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UploadAntchainAtoFundCreditResponse
     */
    public function uploadAntchainAtoFundCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadAntchainAtoFundCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.credit.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传.
     *
     * @param UploadAntchainAtoSignCreditRequest $request
     *
     * @return UploadAntchainAtoSignCreditResponse
     */
    public function uploadAntchainAtoSignCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAntchainAtoSignCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传.
     *
     * @param UploadAntchainAtoSignCreditRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UploadAntchainAtoSignCreditResponse
     */
    public function uploadAntchainAtoSignCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadAntchainAtoSignCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.credit.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询.
     *
     * @param QueryAntchainAtoFundCreditRequest $request
     *
     * @return QueryAntchainAtoFundCreditResponse
     */
    public function queryAntchainAtoFundCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAtoFundCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询.
     *
     * @param QueryAntchainAtoFundCreditRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryAntchainAtoFundCreditResponse
     */
    public function queryAntchainAtoFundCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAtoFundCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.credit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询.
     *
     * @param QueryAntchainAtoSignCreditRequest $request
     *
     * @return QueryAntchainAtoSignCreditResponse
     */
    public function queryAntchainAtoSignCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAtoSignCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询.
     *
     * @param QueryAntchainAtoSignCreditRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryAntchainAtoSignCreditResponse
     */
    public function queryAntchainAtoSignCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAtoSignCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.credit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改.
     *
     * @param UpdateAntchainAtoMerchantexpandMerchantRequest $request
     *
     * @return UpdateAntchainAtoMerchantexpandMerchantResponse
     */
    public function updateAntchainAtoMerchantexpandMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAntchainAtoMerchantexpandMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改.
     *
     * @param UpdateAntchainAtoMerchantexpandMerchantRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return UpdateAntchainAtoMerchantexpandMerchantResponse
     */
    public function updateAntchainAtoMerchantexpandMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAntchainAtoMerchantexpandMerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.merchant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程.
     *
     * @param CancelAntchainAtoSignFlowRequest $request
     *
     * @return CancelAntchainAtoSignFlowResponse
     */
    public function cancelAntchainAtoSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelAntchainAtoSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程.
     *
     * @param CancelAntchainAtoSignFlowRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CancelAntchainAtoSignFlowResponse
     */
    public function cancelAntchainAtoSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelAntchainAtoSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新.
     *
     * @param ReplaceAntchainAtoTradeUserpromiseRequest $request
     *
     * @return ReplaceAntchainAtoTradeUserpromiseResponse
     */
    public function replaceAntchainAtoTradeUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceAntchainAtoTradeUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新.
     *
     * @param ReplaceAntchainAtoTradeUserpromiseRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return ReplaceAntchainAtoTradeUserpromiseResponse
     */
    public function replaceAntchainAtoTradeUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceAntchainAtoTradeUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userpromise.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口.
     *
     * @param ApplyAntchainAtoTradeFinanceprecheckRequest $request
     *
     * @return ApplyAntchainAtoTradeFinanceprecheckResponse
     */
    public function applyAntchainAtoTradeFinanceprecheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyAntchainAtoTradeFinanceprecheckEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口.
     *
     * @param ApplyAntchainAtoTradeFinanceprecheckRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return ApplyAntchainAtoTradeFinanceprecheckResponse
     */
    public function applyAntchainAtoTradeFinanceprecheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyAntchainAtoTradeFinanceprecheckResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.financeprecheck.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资预审结果同步
     * Summary: 融资预审结果同步.
     *
     * @param SyncAntchainAtoFundFinanceprecheckresultRequest $request
     *
     * @return SyncAntchainAtoFundFinanceprecheckresultResponse
     */
    public function syncAntchainAtoFundFinanceprecheckresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAntchainAtoFundFinanceprecheckresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资预审结果同步
     * Summary: 融资预审结果同步.
     *
     * @param SyncAntchainAtoFundFinanceprecheckresultRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return SyncAntchainAtoFundFinanceprecheckresultResponse
     */
    public function syncAntchainAtoFundFinanceprecheckresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAntchainAtoFundFinanceprecheckresultResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.financeprecheckresult.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方查询代偿户余额
     * Summary: 代偿户查询.
     *
     * @param QueryAntchainAtoFundCompensateaccountRequest $request
     *
     * @return QueryAntchainAtoFundCompensateaccountResponse
     */
    public function queryAntchainAtoFundCompensateaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAtoFundCompensateaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方查询代偿户余额
     * Summary: 代偿户查询.
     *
     * @param QueryAntchainAtoFundCompensateaccountRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryAntchainAtoFundCompensateaccountResponse
     */
    public function queryAntchainAtoFundCompensateaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAtoFundCompensateaccountResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.compensateaccount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代偿户账户查询
     * Summary: 代偿户账户查询.
     *
     * @param QueryAntchainAtoWithholdCompensateaccountRequest $request
     *
     * @return QueryAntchainAtoWithholdCompensateaccountResponse
     */
    public function queryAntchainAtoWithholdCompensateaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainAtoWithholdCompensateaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 代偿户账户查询
     * Summary: 代偿户账户查询.
     *
     * @param QueryAntchainAtoWithholdCompensateaccountRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return QueryAntchainAtoWithholdCompensateaccountResponse
     */
    public function queryAntchainAtoWithholdCompensateaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainAtoWithholdCompensateaccountResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.compensateaccount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取合同存证证明
     * Summary: 获取合同存证证明.
     *
     * @param GetAntchainAtoSignContractcertificateRequest $request
     *
     * @return GetAntchainAtoSignContractcertificateResponse
     */
    public function getAntchainAtoSignContractcertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainAtoSignContractcertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取合同存证证明
     * Summary: 获取合同存证证明.
     *
     * @param GetAntchainAtoSignContractcertificateRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return GetAntchainAtoSignContractcertificateResponse
     */
    public function getAntchainAtoSignContractcertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainAtoSignContractcertificateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.contractcertificate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 非融转融资
     * Summary: 非融转融资.
     *
     * @param TransferAntchainAtoTradeFinanceRequest $request
     *
     * @return TransferAntchainAtoTradeFinanceResponse
     */
    public function transferAntchainAtoTradeFinance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->transferAntchainAtoTradeFinanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 非融转融资
     * Summary: 非融转融资.
     *
     * @param TransferAntchainAtoTradeFinanceRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return TransferAntchainAtoTradeFinanceResponse
     */
    public function transferAntchainAtoTradeFinanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return TransferAntchainAtoTradeFinanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.finance.transfer', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
