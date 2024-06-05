<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\ApplyAntsecuritytechGatewayIifaaDevicekeyRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\ApplyAntsecuritytechGatewayIifaaDevicekeyResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\CancelBlockchainBotDigitalkeyWithholdRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\CancelBlockchainBotDigitalkeyWithholdResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\CreateBlockchainBotDevicecorpThingmodelRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\CreateBlockchainBotDevicecorpThingmodelResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\DeleteBlockchainBotDevicecorpThingmodelRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\DeleteBlockchainBotDevicecorpThingmodelResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\NotifyBlockchainBotDigitalkeyWithholdRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\NotifyBlockchainBotDigitalkeyWithholdResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\OperateBlockchainBotIotbasicBatchcollectRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\OperateBlockchainBotIotbasicBatchcollectResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\OperateBlockchainBotIotbasicDevicecollectRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\OperateBlockchainBotIotbasicDevicecollectResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\PayBlockchainBotDigitalkeyWithholdRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\PayBlockchainBotDigitalkeyWithholdResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\PublishBlockchainBotDevicecorpThingmodelRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\PublishBlockchainBotDevicecorpThingmodelResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\QueryAntsecuritytechGatewayEkytDriverRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\QueryAntsecuritytechGatewayEkytDriverResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\QueryBlockchainBotDigitalkeyWithholdRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\QueryBlockchainBotDigitalkeyWithholdResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\QueryBlockchainBotIotbasicDevicecollectRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\QueryBlockchainBotIotbasicDevicecollectResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\RefuseBlockchainBotDigitalkeyWithholdRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\RefuseBlockchainBotDigitalkeyWithholdResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\SignBlockchainBotDigitalkeyWithholdRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\SignBlockchainBotDigitalkeyWithholdResponse;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\UnbindBlockchainBotDigitalkeyWithholdRequest;
use AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models\UnbindBlockchainBotDigitalkeyWithholdResponse;
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
            // ekyt响应头
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
                    '_prod_code'       => 'ak_dc040d759c7a442f89b4b6590b1e39a0',
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
     * Description: IoT设备平台-设备上链
     * Summary: IoT设备平台-设备上链.
     *
     * @param OperateBlockchainBotIotbasicDevicecollectRequest $request
     *
     * @return OperateBlockchainBotIotbasicDevicecollectResponse
     */
    public function operateBlockchainBotIotbasicDevicecollect($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateBlockchainBotIotbasicDevicecollectEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备上链
     * Summary: IoT设备平台-设备上链.
     *
     * @param OperateBlockchainBotIotbasicDevicecollectRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return OperateBlockchainBotIotbasicDevicecollectResponse
     */
    public function operateBlockchainBotIotbasicDevicecollectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateBlockchainBotIotbasicDevicecollectResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.devicecollect.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-批量数据上链
     * Summary: IoT设备平台-批量数据上链.
     *
     * @param OperateBlockchainBotIotbasicBatchcollectRequest $request
     *
     * @return OperateBlockchainBotIotbasicBatchcollectResponse
     */
    public function operateBlockchainBotIotbasicBatchcollect($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateBlockchainBotIotbasicBatchcollectEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-批量数据上链
     * Summary: IoT设备平台-批量数据上链.
     *
     * @param OperateBlockchainBotIotbasicBatchcollectRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return OperateBlockchainBotIotbasicBatchcollectResponse
     */
    public function operateBlockchainBotIotbasicBatchcollectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateBlockchainBotIotbasicBatchcollectResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.batchcollect.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上链数据分页查询
     * Summary: 上链数据分页查询.
     *
     * @param QueryBlockchainBotIotbasicDevicecollectRequest $request
     *
     * @return QueryBlockchainBotIotbasicDevicecollectResponse
     */
    public function queryBlockchainBotIotbasicDevicecollect($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockchainBotIotbasicDevicecollectEx($request, $headers, $runtime);
    }

    /**
     * Description: 上链数据分页查询
     * Summary: 上链数据分页查询.
     *
     * @param QueryBlockchainBotIotbasicDevicecollectRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return QueryBlockchainBotIotbasicDevicecollectResponse
     */
    public function queryBlockchainBotIotbasicDevicecollectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockchainBotIotbasicDevicecollectResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.devicecollect.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机.
     *
     * @param QueryAntsecuritytechGatewayEkytDriverRequest $request
     *
     * @return QueryAntsecuritytechGatewayEkytDriverResponse
     */
    public function queryAntsecuritytechGatewayEkytDriver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntsecuritytechGatewayEkytDriverEx($request, $headers, $runtime);
    }

    /**
     * Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机.
     *
     * @param QueryAntsecuritytechGatewayEkytDriverRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryAntsecuritytechGatewayEkytDriverResponse
     */
    public function queryAntsecuritytechGatewayEkytDriverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntsecuritytechGatewayEkytDriverResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.ekyt.driver.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 申请设备设备密钥
     * Summary: 申请设备设备密钥.
     *
     * @param ApplyAntsecuritytechGatewayIifaaDevicekeyRequest $request
     *
     * @return ApplyAntsecuritytechGatewayIifaaDevicekeyResponse
     */
    public function applyAntsecuritytechGatewayIifaaDevicekey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyAntsecuritytechGatewayIifaaDevicekeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 申请设备设备密钥
     * Summary: 申请设备设备密钥.
     *
     * @param ApplyAntsecuritytechGatewayIifaaDevicekeyRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return ApplyAntsecuritytechGatewayIifaaDevicekeyResponse
     */
    public function applyAntsecuritytechGatewayIifaaDevicekeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyAntsecuritytechGatewayIifaaDevicekeyResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.iifaa.devicekey.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商创建物模型
     * Summary: iotbasic-设备厂商创建物模型.
     *
     * @param CreateBlockchainBotDevicecorpThingmodelRequest $request
     *
     * @return CreateBlockchainBotDevicecorpThingmodelResponse
     */
    public function createBlockchainBotDevicecorpThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBlockchainBotDevicecorpThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商创建物模型
     * Summary: iotbasic-设备厂商创建物模型.
     *
     * @param CreateBlockchainBotDevicecorpThingmodelRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return CreateBlockchainBotDevicecorpThingmodelResponse
     */
    public function createBlockchainBotDevicecorpThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBlockchainBotDevicecorpThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.thingmodel.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商删除物模型
     * Summary: iotbasic-设备厂商删除物模型.
     *
     * @param DeleteBlockchainBotDevicecorpThingmodelRequest $request
     *
     * @return DeleteBlockchainBotDevicecorpThingmodelResponse
     */
    public function deleteBlockchainBotDevicecorpThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteBlockchainBotDevicecorpThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商删除物模型
     * Summary: iotbasic-设备厂商删除物模型.
     *
     * @param DeleteBlockchainBotDevicecorpThingmodelRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return DeleteBlockchainBotDevicecorpThingmodelResponse
     */
    public function deleteBlockchainBotDevicecorpThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteBlockchainBotDevicecorpThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.thingmodel.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商发布物模型
     * Summary: iotbasic-设备厂商发布物模型.
     *
     * @param PublishBlockchainBotDevicecorpThingmodelRequest $request
     *
     * @return PublishBlockchainBotDevicecorpThingmodelResponse
     */
    public function publishBlockchainBotDevicecorpThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishBlockchainBotDevicecorpThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商发布物模型
     * Summary: iotbasic-设备厂商发布物模型.
     *
     * @param PublishBlockchainBotDevicecorpThingmodelRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return PublishBlockchainBotDevicecorpThingmodelResponse
     */
    public function publishBlockchainBotDevicecorpThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishBlockchainBotDevicecorpThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.thingmodel.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约链接获取
     * Summary: 代扣签约链接获取.
     *
     * @param SignBlockchainBotDigitalkeyWithholdRequest $request
     *
     * @return SignBlockchainBotDigitalkeyWithholdResponse
     */
    public function signBlockchainBotDigitalkeyWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->signBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约链接获取
     * Summary: 代扣签约链接获取.
     *
     * @param SignBlockchainBotDigitalkeyWithholdRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return SignBlockchainBotDigitalkeyWithholdResponse
     */
    public function signBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SignBlockchainBotDigitalkeyWithholdResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withhold.sign', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约解除
     * Summary: 代扣签约解除.
     *
     * @param UnbindBlockchainBotDigitalkeyWithholdRequest $request
     *
     * @return UnbindBlockchainBotDigitalkeyWithholdResponse
     */
    public function unbindBlockchainBotDigitalkeyWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约解除
     * Summary: 代扣签约解除.
     *
     * @param UnbindBlockchainBotDigitalkeyWithholdRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return UnbindBlockchainBotDigitalkeyWithholdResponse
     */
    public function unbindBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindBlockchainBotDigitalkeyWithholdResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withhold.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣支付
     * Summary: 代扣支付.
     *
     * @param PayBlockchainBotDigitalkeyWithholdRequest $request
     *
     * @return PayBlockchainBotDigitalkeyWithholdResponse
     */
    public function payBlockchainBotDigitalkeyWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->payBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣支付
     * Summary: 代扣支付.
     *
     * @param PayBlockchainBotDigitalkeyWithholdRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return PayBlockchainBotDigitalkeyWithholdResponse
     */
    public function payBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PayBlockchainBotDigitalkeyWithholdResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withhold.pay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣支付退款
     * Summary: 代扣支付退款.
     *
     * @param RefuseBlockchainBotDigitalkeyWithholdRequest $request
     *
     * @return RefuseBlockchainBotDigitalkeyWithholdResponse
     */
    public function refuseBlockchainBotDigitalkeyWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣支付退款
     * Summary: 代扣支付退款.
     *
     * @param RefuseBlockchainBotDigitalkeyWithholdRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return RefuseBlockchainBotDigitalkeyWithholdResponse
     */
    public function refuseBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseBlockchainBotDigitalkeyWithholdResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withhold.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣协议查询
     * Summary: 代扣协议查询.
     *
     * @param QueryBlockchainBotDigitalkeyWithholdRequest $request
     *
     * @return QueryBlockchainBotDigitalkeyWithholdResponse
     */
    public function queryBlockchainBotDigitalkeyWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣协议查询
     * Summary: 代扣协议查询.
     *
     * @param QueryBlockchainBotDigitalkeyWithholdRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return QueryBlockchainBotDigitalkeyWithholdResponse
     */
    public function queryBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockchainBotDigitalkeyWithholdResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withhold.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣撤销
     * Summary: 代扣撤销
     *
     * @param CancelBlockchainBotDigitalkeyWithholdRequest $request
     *
     * @return CancelBlockchainBotDigitalkeyWithholdResponse
     */
    public function cancelBlockchainBotDigitalkeyWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣撤销
     * Summary: 代扣撤销
     *
     * @param CancelBlockchainBotDigitalkeyWithholdRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return CancelBlockchainBotDigitalkeyWithholdResponse
     */
    public function cancelBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelBlockchainBotDigitalkeyWithholdResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withhold.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣扣款前预通知
     * Summary: 代扣扣款前预通知.
     *
     * @param NotifyBlockchainBotDigitalkeyWithholdRequest $request
     *
     * @return NotifyBlockchainBotDigitalkeyWithholdResponse
     */
    public function notifyBlockchainBotDigitalkeyWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣扣款前预通知
     * Summary: 代扣扣款前预通知.
     *
     * @param NotifyBlockchainBotDigitalkeyWithholdRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return NotifyBlockchainBotDigitalkeyWithholdResponse
     */
    public function notifyBlockchainBotDigitalkeyWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyBlockchainBotDigitalkeyWithholdResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withhold.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
