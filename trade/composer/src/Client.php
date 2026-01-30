<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\TRADE\Models\BatchcancelOrderRequest;
use AntChain\TRADE\Models\BatchcancelOrderResponse;
use AntChain\TRADE\Models\BatchcreateOrderRequest;
use AntChain\TRADE\Models\BatchcreateOrderResponse;
use AntChain\TRADE\Models\CancelOrderRequest;
use AntChain\TRADE\Models\CancelOrderResponse;
use AntChain\TRADE\Models\CreateComboOrderRequest;
use AntChain\TRADE\Models\CreateComboOrderResponse;
use AntChain\TRADE\Models\CreateOrderAfterRequest;
use AntChain\TRADE\Models\CreateOrderAfterResponse;
use AntChain\TRADE\Models\CreateOrderRequest;
use AntChain\TRADE\Models\CreateOrderResponse;
use AntChain\TRADE\Models\CreateOrderWorkflowRequest;
use AntChain\TRADE\Models\CreateOrderWorkflowResponse;
use AntChain\TRADE\Models\ExecOrderRequest;
use AntChain\TRADE\Models\ExecOrderResponse;
use AntChain\TRADE\Models\ExistPricePersonalizedRequest;
use AntChain\TRADE\Models\ExistPricePersonalizedResponse;
use AntChain\TRADE\Models\GetComboOrderRequest;
use AntChain\TRADE\Models\GetComboOrderResponse;
use AntChain\TRADE\Models\GetComboRequest;
use AntChain\TRADE\Models\GetComboResponse;
use AntChain\TRADE\Models\PayComboOrderRequest;
use AntChain\TRADE\Models\PayComboOrderResponse;
use AntChain\TRADE\Models\QueryComboOrderRequest;
use AntChain\TRADE\Models\QueryComboOrderResponse;
use AntChain\TRADE\Models\QueryComboPriceRequest;
use AntChain\TRADE\Models\QueryComboPriceResponse;
use AntChain\TRADE\Models\QueryComboRequest;
use AntChain\TRADE\Models\QueryComboResponse;
use AntChain\TRADE\Models\QueryInstanceCapacityRequest;
use AntChain\TRADE\Models\QueryInstanceCapacityResponse;
use AntChain\TRADE\Models\QueryMarketingCouponRequest;
use AntChain\TRADE\Models\QueryMarketingCouponResponse;
use AntChain\TRADE\Models\QueryPriceRequest;
use AntChain\TRADE\Models\QueryPriceResponse;
use AntChain\TRADE\Models\QueryWareslifeInstanceRequest;
use AntChain\TRADE\Models\QueryWareslifeInstanceResponse;
use AntChain\TRADE\Models\RefundOrderRequest;
use AntChain\TRADE\Models\RefundOrderResponse;
use AntChain\TRADE\Models\SendMarketingCouponRequest;
use AntChain\TRADE\Models\SendMarketingCouponResponse;
use AntChain\TRADE\Models\SyncOfferCommonbuyRequest;
use AntChain\TRADE\Models\SyncOfferCommonbuyResponse;
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
            // 定价条件
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
                    'sdk_version'      => '3.15.4',
                    '_prod_code'       => 'TRADE',
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
     * Description: 查询租户实例容量信息
     * Summary: 查询租户实例容量信息.
     *
     * @param QueryInstanceCapacityRequest $request
     *
     * @return QueryInstanceCapacityResponse
     */
    public function queryInstanceCapacity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInstanceCapacityEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户实例容量信息
     * Summary: 查询租户实例容量信息.
     *
     * @param QueryInstanceCapacityRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryInstanceCapacityResponse
     */
    public function queryInstanceCapacityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInstanceCapacityResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.instance.capacity.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 优惠券列表查询接口
     * Summary: 优惠券列表查询接口.
     *
     * @param QueryMarketingCouponRequest $request
     *
     * @return QueryMarketingCouponResponse
     */
    public function queryMarketingCoupon($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMarketingCouponEx($request, $headers, $runtime);
    }

    /**
     * Description: 优惠券列表查询接口
     * Summary: 优惠券列表查询接口.
     *
     * @param QueryMarketingCouponRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryMarketingCouponResponse
     */
    public function queryMarketingCouponEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMarketingCouponResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.marketing.coupon.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 优惠券发放接口，基于模板ID发送优惠券
     * Summary: 优惠券发放接口.
     *
     * @param SendMarketingCouponRequest $request
     *
     * @return SendMarketingCouponResponse
     */
    public function sendMarketingCoupon($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendMarketingCouponEx($request, $headers, $runtime);
    }

    /**
     * Description: 优惠券发放接口，基于模板ID发送优惠券
     * Summary: 优惠券发放接口.
     *
     * @param SendMarketingCouponRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SendMarketingCouponResponse
     */
    public function sendMarketingCouponEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendMarketingCouponResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.marketing.coupon.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于线下sit调试完成的商品commonBuy信息一件上线
     * Summary: 商品commonBuy配置信息同步.
     *
     * @param SyncOfferCommonbuyRequest $request
     *
     * @return SyncOfferCommonbuyResponse
     */
    public function syncOfferCommonbuy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncOfferCommonbuyEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于线下sit调试完成的商品commonBuy信息一件上线
     * Summary: 商品commonBuy配置信息同步.
     *
     * @param SyncOfferCommonbuyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SyncOfferCommonbuyResponse
     */
    public function syncOfferCommonbuyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncOfferCommonbuyResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.offer.commonbuy.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
     * Summary: 开通类商品自动下单接口.
     *
     * @param CreateOrderAfterRequest $request
     *
     * @return CreateOrderAfterResponse
     */
    public function createOrderAfter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createOrderAfterEx($request, $headers, $runtime);
    }

    /**
     * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
     * Summary: 开通类商品自动下单接口.
     *
     * @param CreateOrderAfterRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateOrderAfterResponse
     */
    public function createOrderAfterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateOrderAfterResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.order.after.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流程编排，创建商品开通接口
     * Summary: 能力编排-商品开通.
     *
     * @param CreateOrderWorkflowRequest $request
     *
     * @return CreateOrderWorkflowResponse
     */
    public function createOrderWorkflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createOrderWorkflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 流程编排，创建商品开通接口
     * Summary: 能力编排-商品开通.
     *
     * @param CreateOrderWorkflowRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateOrderWorkflowResponse
     */
    public function createOrderWorkflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateOrderWorkflowResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.order.workflow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取套餐详情接口
     * Summary: 获取套餐详情.
     *
     * @param GetComboRequest $request
     *
     * @return GetComboResponse
     */
    public function getCombo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getComboEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取套餐详情接口
     * Summary: 获取套餐详情.
     *
     * @param GetComboRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return GetComboResponse
     */
    public function getComboEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetComboResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.combo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 套餐询价接口
     * Summary: 套餐询价接口.
     *
     * @param QueryComboPriceRequest $request
     *
     * @return QueryComboPriceResponse
     */
    public function queryComboPrice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComboPriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 套餐询价接口
     * Summary: 套餐询价接口.
     *
     * @param QueryComboPriceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryComboPriceResponse
     */
    public function queryComboPriceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComboPriceResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.combo.price.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 套餐下单接口，支持部分渠道的自动支付
     * Summary: 套餐下单接口.
     *
     * @param CreateComboOrderRequest $request
     *
     * @return CreateComboOrderResponse
     */
    public function createComboOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createComboOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 套餐下单接口，支持部分渠道的自动支付
     * Summary: 套餐下单接口.
     *
     * @param CreateComboOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateComboOrderResponse
     */
    public function createComboOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateComboOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.combo.order.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 套餐订单列表分页查询接口
     * Summary: 套餐订单列表分页查询接口.
     *
     * @param QueryComboOrderRequest $request
     *
     * @return QueryComboOrderResponse
     */
    public function queryComboOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComboOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 套餐订单列表分页查询接口
     * Summary: 套餐订单列表分页查询接口.
     *
     * @param QueryComboOrderRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryComboOrderResponse
     */
    public function queryComboOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComboOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.combo.order.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询套餐列表，支持分页查询
     * Summary: 查询套餐列表.
     *
     * @param QueryComboRequest $request
     *
     * @return QueryComboResponse
     */
    public function queryCombo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComboEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询套餐列表，支持分页查询
     * Summary: 查询套餐列表.
     *
     * @param QueryComboRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryComboResponse
     */
    public function queryComboEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComboResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.combo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 套餐订单支付接口
     * Summary: 套餐订单支付接口.
     *
     * @param PayComboOrderRequest $request
     *
     * @return PayComboOrderResponse
     */
    public function payComboOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->payComboOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 套餐订单支付接口
     * Summary: 套餐订单支付接口.
     *
     * @param PayComboOrderRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return PayComboOrderResponse
     */
    public function payComboOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PayComboOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.combo.order.pay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单商品通用下单接口
     * Summary: 通用下单接口.
     *
     * @param CreateOrderRequest $request
     *
     * @return CreateOrderResponse
     */
    public function createOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 单商品通用下单接口
     * Summary: 通用下单接口.
     *
     * @param CreateOrderRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CreateOrderResponse
     */
    public function createOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.order.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 套餐订单详情查询接口
     * Summary: 套餐订单详情查询接口.
     *
     * @param GetComboOrderRequest $request
     *
     * @return GetComboOrderResponse
     */
    public function getComboOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getComboOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 套餐订单详情查询接口
     * Summary: 套餐订单详情查询接口.
     *
     * @param GetComboOrderRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetComboOrderResponse
     */
    public function getComboOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetComboOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.combo.order.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消下单接口
     * Summary: 取消下单接口.
     *
     * @param CancelOrderRequest $request
     *
     * @return CancelOrderResponse
     */
    public function cancelOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消下单接口
     * Summary: 取消下单接口.
     *
     * @param CancelOrderRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CancelOrderResponse
     */
    public function cancelOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.order.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品通用批量下单接口
     * Summary: 通用批量下单接口.
     *
     * @param BatchcreateOrderRequest $request
     *
     * @return BatchcreateOrderResponse
     */
    public function batchcreateOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品通用批量下单接口
     * Summary: 通用批量下单接口.
     *
     * @param BatchcreateOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return BatchcreateOrderResponse
     */
    public function batchcreateOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.order.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用订单批量取消接口
     * Summary: 通用订单批量取消接口.
     *
     * @param BatchcancelOrderRequest $request
     *
     * @return BatchcancelOrderResponse
     */
    public function batchcancelOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcancelOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用订单批量取消接口
     * Summary: 通用订单批量取消接口.
     *
     * @param BatchcancelOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return BatchcancelOrderResponse
     */
    public function batchcancelOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcancelOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.order.batchcancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 在订单非自动履约场景，手动触发执行
     * Summary: 触发订单的履约执行.
     *
     * @param ExecOrderRequest $request
     *
     * @return ExecOrderResponse
     */
    public function execOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 在订单非自动履约场景，手动触发执行
     * Summary: 触发订单的履约执行.
     *
     * @param ExecOrderRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return ExecOrderResponse
     */
    public function execOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.order.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 在订单非自动履约场景，撤销订单并退款
     * Summary: 订单退款.
     *
     * @param RefundOrderRequest $request
     *
     * @return RefundOrderResponse
     */
    public function refundOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refundOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 在订单非自动履约场景，撤销订单并退款
     * Summary: 订单退款.
     *
     * @param RefundOrderRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return RefundOrderResponse
     */
    public function refundOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefundOrderResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.order.refund', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
     * Summary: 判断租户是否存在个性化定价.
     *
     * @param ExistPricePersonalizedRequest $request
     *
     * @return ExistPricePersonalizedResponse
     */
    public function existPricePersonalized($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->existPricePersonalizedEx($request, $headers, $runtime);
    }

    /**
     * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
     * Summary: 判断租户是否存在个性化定价.
     *
     * @param ExistPricePersonalizedRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ExistPricePersonalizedResponse
     */
    public function existPricePersonalizedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExistPricePersonalizedResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.price.personalized.exist', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
     * Summary: 商品询价接口.
     *
     * @param QueryPriceRequest $request
     *
     * @return QueryPriceResponse
     */
    public function queryPrice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
     * Summary: 商品询价接口.
     *
     * @param QueryPriceRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryPriceResponse
     */
    public function queryPriceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPriceResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.price.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 实例接口查询
     * Summary: 实例接口查询.
     *
     * @param QueryWareslifeInstanceRequest $request
     *
     * @return QueryWareslifeInstanceResponse
     */
    public function queryWareslifeInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWareslifeInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 实例接口查询
     * Summary: 实例接口查询.
     *
     * @param QueryWareslifeInstanceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryWareslifeInstanceResponse
     */
    public function queryWareslifeInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWareslifeInstanceResponse::fromMap($this->doRequest('1.0', 'antcloud.trade.wareslife.instance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
