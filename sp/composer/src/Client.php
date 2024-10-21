<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\SP\Models\CheckSpProductOrderparameterRequest;
use AntChain\SP\Models\CheckSpProductOrderparameterResponse;
use AntChain\SP\Models\CreateSpProductLogicinstanceRequest;
use AntChain\SP\Models\CreateSpProductLogicinstanceResponse;
use AntChain\SP\Models\GetSpProductOrderRequest;
use AntChain\SP\Models\GetSpProductOrderResponse;
use AntChain\SP\Models\LoadSpProductOrderparameterRequest;
use AntChain\SP\Models\LoadSpProductOrderparameterResponse;
use AntChain\SP\Models\ModifySpProductRequest;
use AntChain\SP\Models\ModifySpProductResponse;
use AntChain\SP\Models\OpenSpProductRequest;
use AntChain\SP\Models\OpenSpProductResponse;
use AntChain\SP\Models\PreopenSpProductRequest;
use AntChain\SP\Models\PreopenSpProductResponse;
use AntChain\SP\Models\ProvisionSpProductRequest;
use AntChain\SP\Models\ProvisionSpProductResponse;
use AntChain\SP\Models\QueryDemoCccCccRequest;
use AntChain\SP\Models\QueryDemoCccCccResponse;
use AntChain\SP\Models\QueryDemoEchoRequest;
use AntChain\SP\Models\QueryDemoEchoResponse;
use AntChain\SP\Models\ReleaseSpProductRequest;
use AntChain\SP\Models\ReleaseSpProductResponse;
use AntChain\SP\Models\RenewSpProductRequest;
use AntChain\SP\Models\RenewSpProductResponse;
use AntChain\SP\Models\ResumeSpProductRequest;
use AntChain\SP\Models\ResumeSpProductResponse;
use AntChain\SP\Models\StopSpProductRequest;
use AntChain\SP\Models\StopSpProductResponse;
use AntChain\SP\Models\SyncAcpartnerProjectResultRequest;
use AntChain\SP\Models\SyncAcpartnerProjectResultResponse;
use AntChain\SP\Models\SyncAcpartnerSettleinResultRequest;
use AntChain\SP\Models\SyncAcpartnerSettleinResultResponse;
use AntChain\SP\Models\SyncIndustryTradeResultRequest;
use AntChain\SP\Models\SyncIndustryTradeResultResponse;
use AntChain\SP\Models\SyncMerchantAgreementResultRequest;
use AntChain\SP\Models\SyncMerchantAgreementResultResponse;
use AntChain\SP\Models\SyncMerchantSignResultRequest;
use AntChain\SP\Models\SyncMerchantSignResultResponse;
use AntChain\SP\Models\SyncPccCommodityStatusRequest;
use AntChain\SP\Models\SyncPccCommodityStatusResponse;
use AntChain\SP\Models\SyncTradeFulfillResultRequest;
use AntChain\SP\Models\SyncTradeFulfillResultResponse;
use AntChain\SP\Models\UpdateAbilityChainAccountRequest;
use AntChain\SP\Models\UpdateAbilityChainAccountResponse;
use AntChain\SP\Models\UpdateAbilityChainAssetRequest;
use AntChain\SP\Models\UpdateAbilityChainAssetResponse;
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
            // 支出配置单对象结果详情
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
                    'sdk_version'      => '4.9.0',
                    '_prod_code'       => 'SP',
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
     * Description: 更新链上账户余额
     * Summary: 更新链上账户余额.
     *
     * @param UpdateAbilityChainAccountRequest $request
     *
     * @return UpdateAbilityChainAccountResponse
     */
    public function updateAbilityChainAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAbilityChainAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新链上账户余额
     * Summary: 更新链上账户余额.
     *
     * @param UpdateAbilityChainAccountRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateAbilityChainAccountResponse
     */
    public function updateAbilityChainAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAbilityChainAccountResponse::fromMap($this->doRequest('1.0', 'antcloudspi.ability.chain.account.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上资产核销、确认核销成功
     * Summary: 链上资产核销确认.
     *
     * @param UpdateAbilityChainAssetRequest $request
     *
     * @return UpdateAbilityChainAssetResponse
     */
    public function updateAbilityChainAsset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAbilityChainAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上资产核销、确认核销成功
     * Summary: 链上资产核销确认.
     *
     * @param UpdateAbilityChainAssetRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateAbilityChainAssetResponse
     */
    public function updateAbilityChainAssetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAbilityChainAssetResponse::fromMap($this->doRequest('1.0', 'antcloudspi.ability.chain.asset.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
     * 停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
     * 注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
     * Summary: SPI-停止服务
     *
     * @param StopSpProductRequest $request
     *
     * @return StopSpProductResponse
     */
    public function stopSpProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopSpProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
     * 停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
     * 注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
     * Summary: SPI-停止服务
     *
     * @param StopSpProductRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return StopSpProductResponse
     */
    public function stopSpProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopSpProductResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
     * 恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
     * 注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
     * Summary: SPI-恢复服务
     *
     * @param ResumeSpProductRequest $request
     *
     * @return ResumeSpProductResponse
     */
    public function resumeSpProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resumeSpProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
     * 恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
     * 注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
     * Summary: SPI-恢复服务
     *
     * @param ResumeSpProductRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ResumeSpProductResponse
     */
    public function resumeSpProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResumeSpProductResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.resume', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
     * 创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
     * 异步接口，也支持通过参数指定同步返回。
     * 能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
     * 注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
     * Summary: SPI-创建产品实例.
     *
     * @param ProvisionSpProductRequest $request
     *
     * @return ProvisionSpProductResponse
     */
    public function provisionSpProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->provisionSpProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
     * 创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
     * 异步接口，也支持通过参数指定同步返回。
     * 能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
     * 注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
     * Summary: SPI-创建产品实例.
     *
     * @param ProvisionSpProductRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ProvisionSpProductResponse
     */
    public function provisionSpProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ProvisionSpProductResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.provision', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对已有的实例进行规格变更操作。
     * 支持同步、异步返回结果
     * 1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
     * 2.如果变更过程立即生效，则通过sync=true进行返回
     * 中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
     * Summary: SPI-变更产品实例配置.
     *
     * @param ModifySpProductRequest $request
     *
     * @return ModifySpProductResponse
     */
    public function modifySpProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->modifySpProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 对已有的实例进行规格变更操作。
     * 支持同步、异步返回结果
     * 1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
     * 2.如果变更过程立即生效，则通过sync=true进行返回
     * 中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
     * Summary: SPI-变更产品实例配置.
     *
     * @param ModifySpProductRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ModifySpProductResponse
     */
    public function modifySpProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ModifySpProductResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.modify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
     * 释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
     * 注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
     * Summary: SPI-释放产品实例.
     *
     * @param ReleaseSpProductRequest $request
     *
     * @return ReleaseSpProductResponse
     */
    public function releaseSpProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->releaseSpProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
     * 释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
     * 注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
     * Summary: SPI-释放产品实例.
     *
     * @param ReleaseSpProductRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ReleaseSpProductResponse
     */
    public function releaseSpProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReleaseSpProductResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.release', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
     * 注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
     * 接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
     * Summary: SPI-获取产品订单结果.
     *
     * @param GetSpProductOrderRequest $request
     *
     * @return GetSpProductOrderResponse
     */
    public function getSpProductOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSpProductOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
     * 注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
     * 接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
     * Summary: SPI-获取产品订单结果.
     *
     * @param GetSpProductOrderRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetSpProductOrderResponse
     */
    public function getSpProductOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSpProductOrderResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.order.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
     * Summary: 从产品方加载购买页参数.
     *
     * @param LoadSpProductOrderparameterRequest $request
     *
     * @return LoadSpProductOrderparameterResponse
     */
    public function loadSpProductOrderparameter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->loadSpProductOrderparameterEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
     * Summary: 从产品方加载购买页参数.
     *
     * @param LoadSpProductOrderparameterRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return LoadSpProductOrderparameterResponse
     */
    public function loadSpProductOrderparameterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LoadSpProductOrderparameterResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.orderparameter.load', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 交易结果通知
     * Summary: 交易结果通知.
     *
     * @param SyncIndustryTradeResultRequest $request
     *
     * @return SyncIndustryTradeResultResponse
     */
    public function syncIndustryTradeResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncIndustryTradeResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 交易结果通知
     * Summary: 交易结果通知.
     *
     * @param SyncIndustryTradeResultRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncIndustryTradeResultResponse
     */
    public function syncIndustryTradeResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncIndustryTradeResultResponse::fromMap($this->doRequest('1.0', 'antcloudspi.industry.trade.result.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家注册结果通知
     * Summary: 商家注册结果通知.
     *
     * @param SyncMerchantSignResultRequest $request
     *
     * @return SyncMerchantSignResultResponse
     */
    public function syncMerchantSignResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncMerchantSignResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家注册结果通知
     * Summary: 商家注册结果通知.
     *
     * @param SyncMerchantSignResultRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncMerchantSignResultResponse
     */
    public function syncMerchantSignResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncMerchantSignResultResponse::fromMap($this->doRequest('1.0', 'antcloudspi.merchant.sign.result.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 签约状态变更通知
     * Summary: 签约状态变更通知.
     *
     * @param SyncMerchantAgreementResultRequest $request
     *
     * @return SyncMerchantAgreementResultResponse
     */
    public function syncMerchantAgreementResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncMerchantAgreementResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 签约状态变更通知
     * Summary: 签约状态变更通知.
     *
     * @param SyncMerchantAgreementResultRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SyncMerchantAgreementResultResponse
     */
    public function syncMerchantAgreementResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncMerchantAgreementResultResponse::fromMap($this->doRequest('1.0', 'antcloudspi.merchant.agreement.result.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: pdf
     * Summary: test.
     *
     * @param QueryDemoCccCccRequest $request
     *
     * @return QueryDemoCccCccResponse
     */
    public function queryDemoCccCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoCccCccEx($request, $headers, $runtime);
    }

    /**
     * Description: pdf
     * Summary: test.
     *
     * @param QueryDemoCccCccRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryDemoCccCccResponse
     */
    public function queryDemoCccCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoCccCccResponse::fromMap($this->doRequest('1.0', 'antcloudspi.demo.ccc.ccc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）项目签约结果通知
     * Summary: 合作方（伙伴、商家等）项目签约结果通知.
     *
     * @param SyncAcpartnerProjectResultRequest $request
     *
     * @return SyncAcpartnerProjectResultResponse
     */
    public function syncAcpartnerProjectResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAcpartnerProjectResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）项目签约结果通知
     * Summary: 合作方（伙伴、商家等）项目签约结果通知.
     *
     * @param SyncAcpartnerProjectResultRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SyncAcpartnerProjectResultResponse
     */
    public function syncAcpartnerProjectResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAcpartnerProjectResultResponse::fromMap($this->doRequest('1.0', 'antcloudspi.acpartner.project.result.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻结果通知
     * Summary: 合作方（伙伴、商家等）入驻结果通知.
     *
     * @param SyncAcpartnerSettleinResultRequest $request
     *
     * @return SyncAcpartnerSettleinResultResponse
     */
    public function syncAcpartnerSettleinResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAcpartnerSettleinResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻结果通知
     * Summary: 合作方（伙伴、商家等）入驻结果通知.
     *
     * @param SyncAcpartnerSettleinResultRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SyncAcpartnerSettleinResultResponse
     */
    public function syncAcpartnerSettleinResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAcpartnerSettleinResultResponse::fromMap($this->doRequest('1.0', 'antcloudspi.acpartner.settlein.result.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 交易平台履约结果通知
     * Summary: 交易平台履约结果通知.
     *
     * @param SyncTradeFulfillResultRequest $request
     *
     * @return SyncTradeFulfillResultResponse
     */
    public function syncTradeFulfillResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradeFulfillResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 交易平台履约结果通知
     * Summary: 交易平台履约结果通知.
     *
     * @param SyncTradeFulfillResultRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncTradeFulfillResultResponse
     */
    public function syncTradeFulfillResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradeFulfillResultResponse::fromMap($this->doRequest('1.0', 'antcloudspi.trade.fulfill.result.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 目前仅通知商品上架状态变更事件
     * Summary: 商品状态变更通知.
     *
     * @param SyncPccCommodityStatusRequest $request
     *
     * @return SyncPccCommodityStatusResponse
     */
    public function syncPccCommodityStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncPccCommodityStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 目前仅通知商品上架状态变更事件
     * Summary: 商品状态变更通知.
     *
     * @param SyncPccCommodityStatusRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncPccCommodityStatusResponse
     */
    public function syncPccCommodityStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncPccCommodityStatusResponse::fromMap($this->doRequest('1.0', 'antcloudspi.pcc.commodity.status.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: spi测试
     * Summary: spi测试.
     *
     * @param QueryDemoEchoRequest $request
     *
     * @return QueryDemoEchoResponse
     */
    public function queryDemoEcho($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDemoEchoEx($request, $headers, $runtime);
    }

    /**
     * Description: spi测试
     * Summary: spi测试.
     *
     * @param QueryDemoEchoRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryDemoEchoResponse
     */
    public function queryDemoEchoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDemoEchoResponse::fromMap($this->doRequest('1.0', 'antcloudspi.demo.echo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 逻辑实例创建成功后回调
     * Summary: 逻辑实例创建成功后回调.
     *
     * @param CreateSpProductLogicinstanceRequest $request
     *
     * @return CreateSpProductLogicinstanceResponse
     */
    public function createSpProductLogicinstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSpProductLogicinstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 逻辑实例创建成功后回调
     * Summary: 逻辑实例创建成功后回调.
     *
     * @param CreateSpProductLogicinstanceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateSpProductLogicinstanceResponse
     */
    public function createSpProductLogicinstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSpProductLogicinstanceResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.logicinstance.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品实例续费，支持已经创建的商品，延长生效时间
     * Summary: SPI-商品实例续费.
     *
     * @param RenewSpProductRequest $request
     *
     * @return RenewSpProductResponse
     */
    public function renewSpProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->renewSpProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品实例续费，支持已经创建的商品，延长生效时间
     * Summary: SPI-商品实例续费.
     *
     * @param RenewSpProductRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RenewSpProductResponse
     */
    public function renewSpProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RenewSpProductResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.renew', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
     * Summary: 购买页参数传递给产品方校验.
     *
     * @param CheckSpProductOrderparameterRequest $request
     *
     * @return CheckSpProductOrderparameterResponse
     */
    public function checkSpProductOrderparameter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSpProductOrderparameterEx($request, $headers, $runtime);
    }

    /**
     * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
     * Summary: 购买页参数传递给产品方校验.
     *
     * @param CheckSpProductOrderparameterRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CheckSpProductOrderparameterResponse
     */
    public function checkSpProductOrderparameterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSpProductOrderparameterResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.orderparameter.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开通前通知
     * Summary: 开通前通知.
     *
     * @param PreopenSpProductRequest $request
     *
     * @return PreopenSpProductResponse
     */
    public function preopenSpProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->preopenSpProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 开通前通知
     * Summary: 开通前通知.
     *
     * @param PreopenSpProductRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return PreopenSpProductResponse
     */
    public function preopenSpProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PreopenSpProductResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.preopen', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
     * 开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
     * 目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
     * 注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
     * Summary: SPI-开通产品
     *
     * @param OpenSpProductRequest $request
     *
     * @return OpenSpProductResponse
     */
    public function openSpProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openSpProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
     * 开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
     * 目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
     * 注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
     * Summary: SPI-开通产品
     *
     * @param OpenSpProductRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return OpenSpProductResponse
     */
    public function openSpProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenSpProductResponse::fromMap($this->doRequest('1.0', 'antcloudspi.sp.product.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
