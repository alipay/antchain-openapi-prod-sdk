<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\COMMERCIAL\Models\AddBillingcoreInvoiceaddressRequest;
use AntChain\COMMERCIAL\Models\AddBillingcoreInvoiceaddressResponse;
use AntChain\COMMERCIAL\Models\AddBillingcoreInvoiceemailRequest;
use AntChain\COMMERCIAL\Models\AddBillingcoreInvoiceemailResponse;
use AntChain\COMMERCIAL\Models\AddBillingcoreInvoiceRequest;
use AntChain\COMMERCIAL\Models\AddBillingcoreInvoiceResponse;
use AntChain\COMMERCIAL\Models\AddCommercialcoreCommodityRequest;
use AntChain\COMMERCIAL\Models\AddCommercialcoreCommodityResponse;
use AntChain\COMMERCIAL\Models\AddCommercialcoreProductRequest;
use AntChain\COMMERCIAL\Models\AddCommercialcoreProductResponse;
use AntChain\COMMERCIAL\Models\AddCommercialcoreSpecRequest;
use AntChain\COMMERCIAL\Models\AddCommercialcoreSpecResponse;
use AntChain\COMMERCIAL\Models\AddPartnercoreSignRequest;
use AntChain\COMMERCIAL\Models\AddPartnercoreSignResponse;
use AntChain\COMMERCIAL\Models\AllCommercialcoreCatalogRequest;
use AntChain\COMMERCIAL\Models\AllCommercialcoreCatalogResponse;
use AntChain\COMMERCIAL\Models\ApplyBillingcoreMerchantinvoiceRequest;
use AntChain\COMMERCIAL\Models\ApplyBillingcoreMerchantinvoiceResponse;
use AntChain\COMMERCIAL\Models\ApplyBillingcoreSpinvoiceRequest;
use AntChain\COMMERCIAL\Models\ApplyBillingcoreSpinvoiceResponse;
use AntChain\COMMERCIAL\Models\AuthCommercialcoreSpecRequest;
use AntChain\COMMERCIAL\Models\AuthCommercialcoreSpecResponse;
use AntChain\COMMERCIAL\Models\BatchqueryCommercialcoreProductRequest;
use AntChain\COMMERCIAL\Models\BatchqueryCommercialcoreProductResponse;
use AntChain\COMMERCIAL\Models\BatchqueryCommercialcoreSpecRequest;
use AntChain\COMMERCIAL\Models\BatchqueryCommercialcoreSpecResponse;
use AntChain\COMMERCIAL\Models\BatchqueryTradecorePaidspecinstanceRequest;
use AntChain\COMMERCIAL\Models\BatchqueryTradecorePaidspecinstanceResponse;
use AntChain\COMMERCIAL\Models\BatchqueryTradecoreSoldspecinstanceRequest;
use AntChain\COMMERCIAL\Models\BatchqueryTradecoreSoldspecinstanceResponse;
use AntChain\COMMERCIAL\Models\CancelTradecoreOrderRequest;
use AntChain\COMMERCIAL\Models\CancelTradecoreOrderResponse;
use AntChain\COMMERCIAL\Models\CheckCommercialcoreProductRequest;
use AntChain\COMMERCIAL\Models\CheckCommercialcoreProductResponse;
use AntChain\COMMERCIAL\Models\CheckTradecoreSpRequest;
use AntChain\COMMERCIAL\Models\CheckTradecoreSpResponse;
use AntChain\COMMERCIAL\Models\CreateTradecoreOrderRequest;
use AntChain\COMMERCIAL\Models\CreateTradecoreOrderResponse;
use AntChain\COMMERCIAL\Models\CreateTradecorePayRequest;
use AntChain\COMMERCIAL\Models\CreateTradecorePayResponse;
use AntChain\COMMERCIAL\Models\ListCommercialcoreCommodityRequest;
use AntChain\COMMERCIAL\Models\ListCommercialcoreCommodityResponse;
use AntChain\COMMERCIAL\Models\ListCommercialcoreProductRequest;
use AntChain\COMMERCIAL\Models\ListCommercialcoreProductResponse;
use AntChain\COMMERCIAL\Models\ListCommercialcoreSpecRequest;
use AntChain\COMMERCIAL\Models\ListCommercialcoreSpecResponse;
use AntChain\COMMERCIAL\Models\PagequeryBillingcoreSpbillRequest;
use AntChain\COMMERCIAL\Models\PagequeryBillingcoreSpbillResponse;
use AntChain\COMMERCIAL\Models\PagequeryPartnercorePolicyRequest;
use AntChain\COMMERCIAL\Models\PagequeryPartnercorePolicyResponse;
use AntChain\COMMERCIAL\Models\PagequeryTradecoreOrderRequest;
use AntChain\COMMERCIAL\Models\PagequeryTradecoreOrderResponse;
use AntChain\COMMERCIAL\Models\QueryBillingcoreInvoicelocRequest;
use AntChain\COMMERCIAL\Models\QueryBillingcoreInvoicelocResponse;
use AntChain\COMMERCIAL\Models\QueryBillingcoreInvoiceRequest;
use AntChain\COMMERCIAL\Models\QueryBillingcoreInvoiceResponse;
use AntChain\COMMERCIAL\Models\QueryBillingcoreMerchantinvoiceRequest;
use AntChain\COMMERCIAL\Models\QueryBillingcoreMerchantinvoiceResponse;
use AntChain\COMMERCIAL\Models\QueryBillingcoreSpbillRequest;
use AntChain\COMMERCIAL\Models\QueryBillingcoreSpbillResponse;
use AntChain\COMMERCIAL\Models\QueryCommercialcoreCommodityRequest;
use AntChain\COMMERCIAL\Models\QueryCommercialcoreCommodityResponse;
use AntChain\COMMERCIAL\Models\QueryCommercialcoreProductRequest;
use AntChain\COMMERCIAL\Models\QueryCommercialcoreProductResponse;
use AntChain\COMMERCIAL\Models\QueryCommercialcoreSpecRequest;
use AntChain\COMMERCIAL\Models\QueryCommercialcoreSpecResponse;
use AntChain\COMMERCIAL\Models\QueryPartnercorePolicyRequest;
use AntChain\COMMERCIAL\Models\QueryPartnercorePolicyResponse;
use AntChain\COMMERCIAL\Models\QueryPartnercoreSignRequest;
use AntChain\COMMERCIAL\Models\QueryPartnercoreSignResponse;
use AntChain\COMMERCIAL\Models\QueryTradecoreMerchantinfoRequest;
use AntChain\COMMERCIAL\Models\QueryTradecoreMerchantinfoResponse;
use AntChain\COMMERCIAL\Models\QueryTradecoreOrderRequest;
use AntChain\COMMERCIAL\Models\QueryTradecoreOrderResponse;
use AntChain\COMMERCIAL\Models\ReceiveTradecorePayRequest;
use AntChain\COMMERCIAL\Models\ReceiveTradecorePayResponse;
use AntChain\COMMERCIAL\Models\UpdateBillingcoreInvoiceaddressRequest;
use AntChain\COMMERCIAL\Models\UpdateBillingcoreInvoiceaddressResponse;
use AntChain\COMMERCIAL\Models\UpdateBillingcoreInvoiceemailRequest;
use AntChain\COMMERCIAL\Models\UpdateBillingcoreInvoiceemailResponse;
use AntChain\COMMERCIAL\Models\UpdateBillingcoreInvoiceRequest;
use AntChain\COMMERCIAL\Models\UpdateBillingcoreInvoiceResponse;
use AntChain\COMMERCIAL\Models\UpdateCommercialcoreCommodityRequest;
use AntChain\COMMERCIAL\Models\UpdateCommercialcoreCommodityResponse;
use AntChain\COMMERCIAL\Models\UpdateCommercialcoreProductRequest;
use AntChain\COMMERCIAL\Models\UpdateCommercialcoreProductResponse;
use AntChain\COMMERCIAL\Models\UpdateCommercialcoreSpecRequest;
use AntChain\COMMERCIAL\Models\UpdateCommercialcoreSpecResponse;
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
            // 定价约束信息VO
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
                    'sdk_version'      => '1.0.26',
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
     * Description: 发票信息查询
     * Summary: 发票信息查询.
     *
     * @param QueryBillingcoreInvoiceRequest $request
     *
     * @return QueryBillingcoreInvoiceResponse
     */
    public function queryBillingcoreInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBillingcoreInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 发票信息查询
     * Summary: 发票信息查询.
     *
     * @param QueryBillingcoreInvoiceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryBillingcoreInvoiceResponse
     */
    public function queryBillingcoreInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBillingcoreInvoiceResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.invoice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发票地址信息查询
     * Summary: 发票地址信息查询.
     *
     * @param QueryBillingcoreInvoicelocRequest $request
     *
     * @return QueryBillingcoreInvoicelocResponse
     */
    public function queryBillingcoreInvoiceloc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBillingcoreInvoicelocEx($request, $headers, $runtime);
    }

    /**
     * Description: 发票地址信息查询
     * Summary: 发票地址信息查询.
     *
     * @param QueryBillingcoreInvoicelocRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryBillingcoreInvoicelocResponse
     */
    public function queryBillingcoreInvoicelocEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBillingcoreInvoicelocResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.invoiceloc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增发票信息
     * Summary: 新增发票信息.
     *
     * @param AddBillingcoreInvoiceRequest $request
     *
     * @return AddBillingcoreInvoiceResponse
     */
    public function addBillingcoreInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addBillingcoreInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增发票信息
     * Summary: 新增发票信息.
     *
     * @param AddBillingcoreInvoiceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AddBillingcoreInvoiceResponse
     */
    public function addBillingcoreInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddBillingcoreInvoiceResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.invoice.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新发票信息
     * Summary: 更新发票信息.
     *
     * @param UpdateBillingcoreInvoiceRequest $request
     *
     * @return UpdateBillingcoreInvoiceResponse
     */
    public function updateBillingcoreInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBillingcoreInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新发票信息
     * Summary: 更新发票信息.
     *
     * @param UpdateBillingcoreInvoiceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateBillingcoreInvoiceResponse
     */
    public function updateBillingcoreInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBillingcoreInvoiceResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.invoice.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增发票地址
     * Summary: 新增发票地址
     *
     * @param AddBillingcoreInvoiceaddressRequest $request
     *
     * @return AddBillingcoreInvoiceaddressResponse
     */
    public function addBillingcoreInvoiceaddress($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addBillingcoreInvoiceaddressEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增发票地址
     * Summary: 新增发票地址
     *
     * @param AddBillingcoreInvoiceaddressRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return AddBillingcoreInvoiceaddressResponse
     */
    public function addBillingcoreInvoiceaddressEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddBillingcoreInvoiceaddressResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.invoiceaddress.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新发票地址信息
     * Summary: 更新发票地址信息.
     *
     * @param UpdateBillingcoreInvoiceaddressRequest $request
     *
     * @return UpdateBillingcoreInvoiceaddressResponse
     */
    public function updateBillingcoreInvoiceaddress($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBillingcoreInvoiceaddressEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新发票地址信息
     * Summary: 更新发票地址信息.
     *
     * @param UpdateBillingcoreInvoiceaddressRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return UpdateBillingcoreInvoiceaddressResponse
     */
    public function updateBillingcoreInvoiceaddressEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBillingcoreInvoiceaddressResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.invoiceaddress.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增发票电子邮箱
     * Summary: 新增发票电子邮箱.
     *
     * @param AddBillingcoreInvoiceemailRequest $request
     *
     * @return AddBillingcoreInvoiceemailResponse
     */
    public function addBillingcoreInvoiceemail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addBillingcoreInvoiceemailEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增发票电子邮箱
     * Summary: 新增发票电子邮箱.
     *
     * @param AddBillingcoreInvoiceemailRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return AddBillingcoreInvoiceemailResponse
     */
    public function addBillingcoreInvoiceemailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddBillingcoreInvoiceemailResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.invoiceemail.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新发票电子邮箱
     * Summary: 更新发票电子邮箱.
     *
     * @param UpdateBillingcoreInvoiceemailRequest $request
     *
     * @return UpdateBillingcoreInvoiceemailResponse
     */
    public function updateBillingcoreInvoiceemail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBillingcoreInvoiceemailEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新发票电子邮箱
     * Summary: 更新发票电子邮箱.
     *
     * @param UpdateBillingcoreInvoiceemailRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UpdateBillingcoreInvoiceemailResponse
     */
    public function updateBillingcoreInvoiceemailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBillingcoreInvoiceemailResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.invoiceemail.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户开票申请
     * Summary: 商户开票申请.
     *
     * @param ApplyBillingcoreMerchantinvoiceRequest $request
     *
     * @return ApplyBillingcoreMerchantinvoiceResponse
     */
    public function applyBillingcoreMerchantinvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyBillingcoreMerchantinvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户开票申请
     * Summary: 商户开票申请.
     *
     * @param ApplyBillingcoreMerchantinvoiceRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return ApplyBillingcoreMerchantinvoiceResponse
     */
    public function applyBillingcoreMerchantinvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyBillingcoreMerchantinvoiceResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.merchantinvoice.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户开票查询
     * Summary: 商户开票查询.
     *
     * @param QueryBillingcoreMerchantinvoiceRequest $request
     *
     * @return QueryBillingcoreMerchantinvoiceResponse
     */
    public function queryBillingcoreMerchantinvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBillingcoreMerchantinvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户开票查询
     * Summary: 商户开票查询.
     *
     * @param QueryBillingcoreMerchantinvoiceRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryBillingcoreMerchantinvoiceResponse
     */
    public function queryBillingcoreMerchantinvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBillingcoreMerchantinvoiceResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.merchantinvoice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询服务商账单
     * Summary: 查询服务商账单.
     *
     * @param QueryBillingcoreSpbillRequest $request
     *
     * @return QueryBillingcoreSpbillResponse
     */
    public function queryBillingcoreSpbill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBillingcoreSpbillEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询服务商账单
     * Summary: 查询服务商账单.
     *
     * @param QueryBillingcoreSpbillRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryBillingcoreSpbillResponse
     */
    public function queryBillingcoreSpbillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBillingcoreSpbillResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.spbill.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询服务商账单
     * Summary: 分页查询服务商账单.
     *
     * @param PagequeryBillingcoreSpbillRequest $request
     *
     * @return PagequeryBillingcoreSpbillResponse
     */
    public function pagequeryBillingcoreSpbill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryBillingcoreSpbillEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询服务商账单
     * Summary: 分页查询服务商账单.
     *
     * @param PagequeryBillingcoreSpbillRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryBillingcoreSpbillResponse
     */
    public function pagequeryBillingcoreSpbillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryBillingcoreSpbillResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.spbill.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 服务商结算申请
     * Summary: 服务商结算申请.
     *
     * @param ApplyBillingcoreSpinvoiceRequest $request
     *
     * @return ApplyBillingcoreSpinvoiceResponse
     */
    public function applyBillingcoreSpinvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyBillingcoreSpinvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 服务商结算申请
     * Summary: 服务商结算申请.
     *
     * @param ApplyBillingcoreSpinvoiceRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ApplyBillingcoreSpinvoiceResponse
     */
    public function applyBillingcoreSpinvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyBillingcoreSpinvoiceResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.billingcore.spinvoice.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所有类目树
     * Summary: 查询所有类目树.
     *
     * @param AllCommercialcoreCatalogRequest $request
     *
     * @return AllCommercialcoreCatalogResponse
     */
    public function allCommercialcoreCatalog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allCommercialcoreCatalogEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所有类目树
     * Summary: 查询所有类目树.
     *
     * @param AllCommercialcoreCatalogRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AllCommercialcoreCatalogResponse
     */
    public function allCommercialcoreCatalogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllCommercialcoreCatalogResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.catalog.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据类目id查询产品列表
     * Summary: 查询产品列表.
     *
     * @param ListCommercialcoreProductRequest $request
     *
     * @return ListCommercialcoreProductResponse
     */
    public function listCommercialcoreProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCommercialcoreProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据类目id查询产品列表
     * Summary: 查询产品列表.
     *
     * @param ListCommercialcoreProductRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListCommercialcoreProductResponse
     */
    public function listCommercialcoreProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCommercialcoreProductResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.product.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据产品Code查询商品列表
     * Summary: 查询商品列表.
     *
     * @param ListCommercialcoreCommodityRequest $request
     *
     * @return ListCommercialcoreCommodityResponse
     */
    public function listCommercialcoreCommodity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCommercialcoreCommodityEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据产品Code查询商品列表
     * Summary: 查询商品列表.
     *
     * @param ListCommercialcoreCommodityRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ListCommercialcoreCommodityResponse
     */
    public function listCommercialcoreCommodityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCommercialcoreCommodityResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.commodity.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据商品code查询规格列表
     * Summary: 查询规格列表.
     *
     * @param ListCommercialcoreSpecRequest $request
     *
     * @return ListCommercialcoreSpecResponse
     */
    public function listCommercialcoreSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCommercialcoreSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据商品code查询规格列表
     * Summary: 查询规格列表.
     *
     * @param ListCommercialcoreSpecRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListCommercialcoreSpecResponse
     */
    public function listCommercialcoreSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCommercialcoreSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.spec.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据规格code查询规格定价计划
     * Summary: 查询规格定价计划.
     *
     * @param QueryCommercialcoreSpecRequest $request
     *
     * @return QueryCommercialcoreSpecResponse
     */
    public function queryCommercialcoreSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCommercialcoreSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据规格code查询规格定价计划
     * Summary: 查询规格定价计划.
     *
     * @param QueryCommercialcoreSpecRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryCommercialcoreSpecResponse
     */
    public function queryCommercialcoreSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCommercialcoreSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.spec.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增产品
     * Summary: 新增产品
     *
     * @param AddCommercialcoreProductRequest $request
     *
     * @return AddCommercialcoreProductResponse
     */
    public function addCommercialcoreProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCommercialcoreProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增产品
     * Summary: 新增产品
     *
     * @param AddCommercialcoreProductRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AddCommercialcoreProductResponse
     */
    public function addCommercialcoreProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCommercialcoreProductResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.product.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新产品
     * Summary: 更新产品
     *
     * @param UpdateCommercialcoreProductRequest $request
     *
     * @return UpdateCommercialcoreProductResponse
     */
    public function updateCommercialcoreProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCommercialcoreProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新产品
     * Summary: 更新产品
     *
     * @param UpdateCommercialcoreProductRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateCommercialcoreProductResponse
     */
    public function updateCommercialcoreProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCommercialcoreProductResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.product.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询产品code列表
     * Summary: 查询产品code列表.
     *
     * @param BatchqueryCommercialcoreProductRequest $request
     *
     * @return BatchqueryCommercialcoreProductResponse
     */
    public function batchqueryCommercialcoreProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryCommercialcoreProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询产品code列表
     * Summary: 查询产品code列表.
     *
     * @param BatchqueryCommercialcoreProductRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return BatchqueryCommercialcoreProductResponse
     */
    public function batchqueryCommercialcoreProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryCommercialcoreProductResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.product.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据产品code查询产品信息
     * Summary: 查询产品
     *
     * @param QueryCommercialcoreProductRequest $request
     *
     * @return QueryCommercialcoreProductResponse
     */
    public function queryCommercialcoreProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCommercialcoreProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据产品code查询产品信息
     * Summary: 查询产品
     *
     * @param QueryCommercialcoreProductRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryCommercialcoreProductResponse
     */
    public function queryCommercialcoreProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCommercialcoreProductResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.product.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据产品code查询商品来源
     * Summary: 查询商品来源.
     *
     * @param QueryCommercialcoreCommodityRequest $request
     *
     * @return QueryCommercialcoreCommodityResponse
     */
    public function queryCommercialcoreCommodity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCommercialcoreCommodityEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据产品code查询商品来源
     * Summary: 查询商品来源.
     *
     * @param QueryCommercialcoreCommodityRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryCommercialcoreCommodityResponse
     */
    public function queryCommercialcoreCommodityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCommercialcoreCommodityResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.commodity.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增商品
     * Summary: 新增商品
     *
     * @param AddCommercialcoreCommodityRequest $request
     *
     * @return AddCommercialcoreCommodityResponse
     */
    public function addCommercialcoreCommodity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCommercialcoreCommodityEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增商品
     * Summary: 新增商品
     *
     * @param AddCommercialcoreCommodityRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return AddCommercialcoreCommodityResponse
     */
    public function addCommercialcoreCommodityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCommercialcoreCommodityResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.commodity.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新商品
     * Summary: 更新商品
     *
     * @param UpdateCommercialcoreCommodityRequest $request
     *
     * @return UpdateCommercialcoreCommodityResponse
     */
    public function updateCommercialcoreCommodity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCommercialcoreCommodityEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新商品
     * Summary: 更新商品
     *
     * @param UpdateCommercialcoreCommodityRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UpdateCommercialcoreCommodityResponse
     */
    public function updateCommercialcoreCommodityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCommercialcoreCommodityResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.commodity.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据商品code查询规格售卖模式
     * Summary: 查询规格售卖模式.
     *
     * @param BatchqueryCommercialcoreSpecRequest $request
     *
     * @return BatchqueryCommercialcoreSpecResponse
     */
    public function batchqueryCommercialcoreSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryCommercialcoreSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据商品code查询规格售卖模式
     * Summary: 查询规格售卖模式.
     *
     * @param BatchqueryCommercialcoreSpecRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchqueryCommercialcoreSpecResponse
     */
    public function batchqueryCommercialcoreSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryCommercialcoreSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.spec.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增规格与定价计划
     * Summary: 新增规格与定价计划.
     *
     * @param AddCommercialcoreSpecRequest $request
     *
     * @return AddCommercialcoreSpecResponse
     */
    public function addCommercialcoreSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCommercialcoreSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增规格与定价计划
     * Summary: 新增规格与定价计划.
     *
     * @param AddCommercialcoreSpecRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AddCommercialcoreSpecResponse
     */
    public function addCommercialcoreSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCommercialcoreSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.spec.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新规格
     * Summary: 更新规格
     *
     * @param UpdateCommercialcoreSpecRequest $request
     *
     * @return UpdateCommercialcoreSpecResponse
     */
    public function updateCommercialcoreSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCommercialcoreSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新规格
     * Summary: 更新规格
     *
     * @param UpdateCommercialcoreSpecRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateCommercialcoreSpecResponse
     */
    public function updateCommercialcoreSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCommercialcoreSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.spec.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改规格状态
     * Summary: 修改规格状态
     *
     * @param AuthCommercialcoreSpecRequest $request
     *
     * @return AuthCommercialcoreSpecResponse
     */
    public function authCommercialcoreSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authCommercialcoreSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改规格状态
     * Summary: 修改规格状态
     *
     * @param AuthCommercialcoreSpecRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return AuthCommercialcoreSpecResponse
     */
    public function authCommercialcoreSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthCommercialcoreSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.spec.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 产品code查重校验
     * Summary: 产品code查重校验.
     *
     * @param CheckCommercialcoreProductRequest $request
     *
     * @return CheckCommercialcoreProductResponse
     */
    public function checkCommercialcoreProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkCommercialcoreProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 产品code查重校验
     * Summary: 产品code查重校验.
     *
     * @param CheckCommercialcoreProductRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CheckCommercialcoreProductResponse
     */
    public function checkCommercialcoreProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckCommercialcoreProductResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.commercialcore.product.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增签约接口
     * Summary: 新增签约接口.
     *
     * @param AddPartnercoreSignRequest $request
     *
     * @return AddPartnercoreSignResponse
     */
    public function addPartnercoreSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addPartnercoreSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增签约接口
     * Summary: 新增签约接口.
     *
     * @param AddPartnercoreSignRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AddPartnercoreSignResponse
     */
    public function addPartnercoreSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddPartnercoreSignResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.partnercore.sign.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 政策详情查询
     * Summary: 政策详情查询.
     *
     * @param QueryPartnercorePolicyRequest $request
     *
     * @return QueryPartnercorePolicyResponse
     */
    public function queryPartnercorePolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPartnercorePolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 政策详情查询
     * Summary: 政策详情查询.
     *
     * @param QueryPartnercorePolicyRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryPartnercorePolicyResponse
     */
    public function queryPartnercorePolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPartnercorePolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.partnercore.policy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 政策分页查询
     * Summary: 政策分页查询.
     *
     * @param PagequeryPartnercorePolicyRequest $request
     *
     * @return PagequeryPartnercorePolicyResponse
     */
    public function pagequeryPartnercorePolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryPartnercorePolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 政策分页查询
     * Summary: 政策分页查询.
     *
     * @param PagequeryPartnercorePolicyRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryPartnercorePolicyResponse
     */
    public function pagequeryPartnercorePolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryPartnercorePolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.partnercore.policy.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 签约信息查询
     * Summary: 签约信息查询.
     *
     * @param QueryPartnercoreSignRequest $request
     *
     * @return QueryPartnercoreSignResponse
     */
    public function queryPartnercoreSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPartnercoreSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 签约信息查询
     * Summary: 签约信息查询.
     *
     * @param QueryPartnercoreSignRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryPartnercoreSignResponse
     */
    public function queryPartnercoreSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPartnercoreSignResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.partnercore.sign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
     * Summary: 批量获取商户已购规格实例信息-控制台用.
     *
     * @param BatchqueryTradecorePaidspecinstanceRequest $request
     *
     * @return BatchqueryTradecorePaidspecinstanceResponse
     */
    public function batchqueryTradecorePaidspecinstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTradecorePaidspecinstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
     * Summary: 批量获取商户已购规格实例信息-控制台用.
     *
     * @param BatchqueryTradecorePaidspecinstanceRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return BatchqueryTradecorePaidspecinstanceResponse
     */
    public function batchqueryTradecorePaidspecinstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTradecorePaidspecinstanceResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.paidspecinstance.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
     * Summary: 获取已售给商户的规格实例信息-开发商用.
     *
     * @param BatchqueryTradecoreSoldspecinstanceRequest $request
     *
     * @return BatchqueryTradecoreSoldspecinstanceResponse
     */
    public function batchqueryTradecoreSoldspecinstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTradecoreSoldspecinstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
     * Summary: 获取已售给商户的规格实例信息-开发商用.
     *
     * @param BatchqueryTradecoreSoldspecinstanceRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return BatchqueryTradecoreSoldspecinstanceResponse
     */
    public function batchqueryTradecoreSoldspecinstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTradecoreSoldspecinstanceResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.soldspecinstance.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
     * Summary: 获取商户信息-开发商用.
     *
     * @param QueryTradecoreMerchantinfoRequest $request
     *
     * @return QueryTradecoreMerchantinfoResponse
     */
    public function queryTradecoreMerchantinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTradecoreMerchantinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
     * Summary: 获取商户信息-开发商用.
     *
     * @param QueryTradecoreMerchantinfoRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryTradecoreMerchantinfoResponse
     */
    public function queryTradecoreMerchantinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTradecoreMerchantinfoResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.merchantinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建支付单，调用支付宝接口获取收银台触发表单
     * Summary: 支付创建.
     *
     * @param CreateTradecorePayRequest $request
     *
     * @return CreateTradecorePayResponse
     */
    public function createTradecorePay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTradecorePayEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建支付单，调用支付宝接口获取收银台触发表单
     * Summary: 支付创建.
     *
     * @param CreateTradecorePayRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateTradecorePayResponse
     */
    public function createTradecorePayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTradecorePayResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.pay.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付宝支付结果回调
     * Summary: 支付结果回调.
     *
     * @param ReceiveTradecorePayRequest $request
     *
     * @return ReceiveTradecorePayResponse
     */
    public function receiveTradecorePay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->receiveTradecorePayEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付宝支付结果回调
     * Summary: 支付结果回调.
     *
     * @param ReceiveTradecorePayRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ReceiveTradecorePayResponse
     */
    public function receiveTradecorePayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReceiveTradecorePayResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.pay.receive', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单取消
     * Summary: 订单取消.
     *
     * @param CancelTradecoreOrderRequest $request
     *
     * @return CancelTradecoreOrderResponse
     */
    public function cancelTradecoreOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelTradecoreOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单取消
     * Summary: 订单取消.
     *
     * @param CancelTradecoreOrderRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CancelTradecoreOrderResponse
     */
    public function cancelTradecoreOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelTradecoreOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.order.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单创建
     * Summary: 订单创建.
     *
     * @param CreateTradecoreOrderRequest $request
     *
     * @return CreateTradecoreOrderResponse
     */
    public function createTradecoreOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTradecoreOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单创建
     * Summary: 订单创建.
     *
     * @param CreateTradecoreOrderRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateTradecoreOrderResponse
     */
    public function createTradecoreOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTradecoreOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.order.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单查询
     * Summary: 订单查询.
     *
     * @param QueryTradecoreOrderRequest $request
     *
     * @return QueryTradecoreOrderResponse
     */
    public function queryTradecoreOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTradecoreOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单查询
     * Summary: 订单查询.
     *
     * @param QueryTradecoreOrderRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryTradecoreOrderResponse
     */
    public function queryTradecoreOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTradecoreOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.order.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单分页查询
     * Summary: 订单分页查询.
     *
     * @param PagequeryTradecoreOrderRequest $request
     *
     * @return PagequeryTradecoreOrderResponse
     */
    public function pagequeryTradecoreOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTradecoreOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单分页查询
     * Summary: 订单分页查询.
     *
     * @param PagequeryTradecoreOrderRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return PagequeryTradecoreOrderResponse
     */
    public function pagequeryTradecoreOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTradecoreOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.order.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 服务商信息校验
     * Summary: 服务商信息校验.
     *
     * @param CheckTradecoreSpRequest $request
     *
     * @return CheckTradecoreSpResponse
     */
    public function checkTradecoreSp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkTradecoreSpEx($request, $headers, $runtime);
    }

    /**
     * Description: 服务商信息校验
     * Summary: 服务商信息校验.
     *
     * @param CheckTradecoreSpRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CheckTradecoreSpResponse
     */
    public function checkTradecoreSpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckTradecoreSpResponse::fromMap($this->doRequest('1.0', 'antcloud.commercial.tradecore.sp.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
