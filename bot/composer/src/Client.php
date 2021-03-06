<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BOT\Models\AddAbnormalRequest;
use AntChain\BOT\Models\AddAbnormalResponse;
use AntChain\BOT\Models\AddLabelAssetRequest;
use AntChain\BOT\Models\AddLabelAssetResponse;
use AntChain\BOT\Models\ApplyMqtokenRequest;
use AntChain\BOT\Models\ApplyMqtokenResponse;
use AntChain\BOT\Models\CreateConsumerRequest;
use AntChain\BOT\Models\CreateConsumerResponse;
use AntChain\BOT\Models\CreateDeviceDatamodelRequest;
use AntChain\BOT\Models\CreateDeviceDatamodelResponse;
use AntChain\BOT\Models\CreateDistributedeviceBychainidRequest;
use AntChain\BOT\Models\CreateDistributedeviceBychainidResponse;
use AntChain\BOT\Models\CreateDistributedeviceBychainperipheralidRequest;
use AntChain\BOT\Models\CreateDistributedeviceBychainperipheralidResponse;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceidRequest;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceidResponse;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceRequest;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceResponse;
use AntChain\BOT\Models\CreateDistributedeviceByperipheralidRequest;
use AntChain\BOT\Models\CreateDistributedeviceByperipheralidResponse;
use AntChain\BOT\Models\CreateTaskRequest;
use AntChain\BOT\Models\CreateTaskResponse;
use AntChain\BOT\Models\CreateTenantProjectRequest;
use AntChain\BOT\Models\CreateTenantProjectResponse;
use AntChain\BOT\Models\ExecThingsdidOneapiRequest;
use AntChain\BOT\Models\ExecThingsdidOneapiResponse;
use AntChain\BOT\Models\ExecUnprocessedTaskRequest;
use AntChain\BOT\Models\ExecUnprocessedTaskResponse;
use AntChain\BOT\Models\GetDeviceBychainidRequest;
use AntChain\BOT\Models\GetDeviceBychainidResponse;
use AntChain\BOT\Models\GetDeviceBydeviceidRequest;
use AntChain\BOT\Models\GetDeviceBydeviceidResponse;
use AntChain\BOT\Models\GetDeviceDatamodelRequest;
use AntChain\BOT\Models\GetDeviceDatamodelResponse;
use AntChain\BOT\Models\GetDistributedeviceBychainidRequest;
use AntChain\BOT\Models\GetDistributedeviceBychainidResponse;
use AntChain\BOT\Models\GetDistributedeviceBydeviceidRequest;
use AntChain\BOT\Models\GetDistributedeviceBydeviceidResponse;
use AntChain\BOT\Models\GetDistributedeviceBydisidRequest;
use AntChain\BOT\Models\GetDistributedeviceBydisidResponse;
use AntChain\BOT\Models\GetDistributedeviceByperipheralidRequest;
use AntChain\BOT\Models\GetDistributedeviceByperipheralidResponse;
use AntChain\BOT\Models\GetPeripheralBychainperipheralidRequest;
use AntChain\BOT\Models\GetPeripheralBychainperipheralidResponse;
use AntChain\BOT\Models\GetPeripheralByperipheralidRequest;
use AntChain\BOT\Models\GetPeripheralByperipheralidResponse;
use AntChain\BOT\Models\ImportDeviceRequest;
use AntChain\BOT\Models\ImportDeviceResponse;
use AntChain\BOT\Models\ImportIotplatformMeshidRequest;
use AntChain\BOT\Models\ImportIotplatformMeshidResponse;
use AntChain\BOT\Models\ImportPeripheralRequest;
use AntChain\BOT\Models\ImportPeripheralResponse;
use AntChain\BOT\Models\ListDeviceBysceneRequest;
use AntChain\BOT\Models\ListDeviceBysceneResponse;
use AntChain\BOT\Models\ListDistributedeviceByperipheralsceneRequest;
use AntChain\BOT\Models\ListDistributedeviceByperipheralsceneResponse;
use AntChain\BOT\Models\ListDistributedeviceBysceneRequest;
use AntChain\BOT\Models\ListDistributedeviceBysceneResponse;
use AntChain\BOT\Models\ListPeripheralBysceneRequest;
use AntChain\BOT\Models\ListPeripheralBysceneResponse;
use AntChain\BOT\Models\LoadTsmCertificatetsmRequest;
use AntChain\BOT\Models\LoadTsmCertificatetsmResponse;
use AntChain\BOT\Models\LoadTsmResourcefileRequest;
use AntChain\BOT\Models\LoadTsmResourcefileResponse;
use AntChain\BOT\Models\OfflineDeviceByunregisterRequest;
use AntChain\BOT\Models\OfflineDeviceByunregisterResponse;
use AntChain\BOT\Models\OfflineDeviceRequest;
use AntChain\BOT\Models\OfflineDeviceResponse;
use AntChain\BOT\Models\OnlineDeviceRequest;
use AntChain\BOT\Models\OnlineDeviceResponse;
use AntChain\BOT\Models\PullConsumerDatasourceRequest;
use AntChain\BOT\Models\PullConsumerDatasourceResponse;
use AntChain\BOT\Models\QueryAnalysisRequest;
use AntChain\BOT\Models\QueryAnalysisResponse;
use AntChain\BOT\Models\QueryDataBytxhashRequest;
use AntChain\BOT\Models\QueryDataBytxhashResponse;
use AntChain\BOT\Models\QueryDeviceRegistrationRequest;
use AntChain\BOT\Models\QueryDeviceRegistrationResponse;
use AntChain\BOT\Models\QueryIotplatformPurchaseorderRequest;
use AntChain\BOT\Models\QueryIotplatformPurchaseorderResponse;
use AntChain\BOT\Models\QueryLabelTraceRequest;
use AntChain\BOT\Models\QueryLabelTraceResponse;
use AntChain\BOT\Models\QueryTaskRequest;
use AntChain\BOT\Models\QueryTaskResponse;
use AntChain\BOT\Models\QueryThingsdidAsyncprocessRequest;
use AntChain\BOT\Models\QueryThingsdidAsyncprocessResponse;
use AntChain\BOT\Models\QueryThingsdidDidRequest;
use AntChain\BOT\Models\QueryThingsdidDidResponse;
use AntChain\BOT\Models\ReplaceDistributedeviceBychainidRequest;
use AntChain\BOT\Models\ReplaceDistributedeviceBychainidResponse;
use AntChain\BOT\Models\ReplaceDistributedeviceBychainperipheralidRequest;
use AntChain\BOT\Models\ReplaceDistributedeviceBychainperipheralidResponse;
use AntChain\BOT\Models\SendCollectorBychainidmulRequest;
use AntChain\BOT\Models\SendCollectorBychainidmulResponse;
use AntChain\BOT\Models\SendCollectorBychainidRequest;
use AntChain\BOT\Models\SendCollectorBychainidResponse;
use AntChain\BOT\Models\SendCollectorDevicebizdataRequest;
use AntChain\BOT\Models\SendCollectorDevicebizdataResponse;
use AntChain\BOT\Models\SetConsumerSubscribeRequest;
use AntChain\BOT\Models\SetConsumerSubscribeResponse;
use AntChain\BOT\Models\SetConsumerUnsubscribeRequest;
use AntChain\BOT\Models\SetConsumerUnsubscribeResponse;
use AntChain\BOT\Models\StartEvidenceQueryRequest;
use AntChain\BOT\Models\StartEvidenceQueryResponse;
use AntChain\BOT\Models\StartEvidenceStoreRequest;
use AntChain\BOT\Models\StartEvidenceStoreResponse;
use AntChain\BOT\Models\StartTenantBindinfoRequest;
use AntChain\BOT\Models\StartTenantBindinfoResponse;
use AntChain\BOT\Models\StartThingsdidRegisterRequest;
use AntChain\BOT\Models\StartThingsdidRegisterResponse;
use AntChain\BOT\Models\SyncLabelTransferRequest;
use AntChain\BOT\Models\SyncLabelTransferResponse;
use AntChain\BOT\Models\UpdateDeviceInfobydeviceRequest;
use AntChain\BOT\Models\UpdateDeviceInfobydeviceResponse;
use AntChain\BOT\Models\UpdateDeviceInfoRequest;
use AntChain\BOT\Models\UpdateDeviceInfoResponse;
use AntChain\BOT\Models\UpdateThingsdidDevicespaceRequest;
use AntChain\BOT\Models\UpdateThingsdidDevicespaceResponse;
use AntChain\BOT\Models\UpdateThingsdidDidRequest;
use AntChain\BOT\Models\UpdateThingsdidDidResponse;
use AntChain\BOT\Models\UpdateThingsdidStatusRequest;
use AntChain\BOT\Models\UpdateThingsdidStatusResponse;
use AntChain\BOT\Models\UpdateThingsdidTenantRequest;
use AntChain\BOT\Models\UpdateThingsdidTenantResponse;
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
            // 原始数据包
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
                    'sdk_version'      => '1.5.13',
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
     * Description: 根据设备串号查询采购设备
     * Summary: 根据设备串号查询采购设备.
     *
     * @param QueryIotplatformPurchaseorderRequest $request
     *
     * @return QueryIotplatformPurchaseorderResponse
     */
    public function queryIotplatformPurchaseorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotplatformPurchaseorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据设备串号查询采购设备
     * Summary: 根据设备串号查询采购设备.
     *
     * @param QueryIotplatformPurchaseorderRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryIotplatformPurchaseorderResponse
     */
    public function queryIotplatformPurchaseorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotplatformPurchaseorderResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotplatform.purchaseorder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
     * Summary: 绑定MeshId及设备SN.
     *
     * @param ImportIotplatformMeshidRequest $request
     *
     * @return ImportIotplatformMeshidResponse
     */
    public function importIotplatformMeshid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importIotplatformMeshidEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
     * Summary: 绑定MeshId及设备SN.
     *
     * @param ImportIotplatformMeshidRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ImportIotplatformMeshidResponse
     */
    public function importIotplatformMeshidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportIotplatformMeshidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotplatform.meshid.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数据模型
     * Summary: 创建数据模型.
     *
     * @param CreateDeviceDatamodelRequest $request
     *
     * @return CreateDeviceDatamodelResponse
     */
    public function createDeviceDatamodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDeviceDatamodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数据模型
     * Summary: 创建数据模型.
     *
     * @param CreateDeviceDatamodelRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateDeviceDatamodelResponse
     */
    public function createDeviceDatamodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDeviceDatamodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.datamodel.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取数据模型
     * Summary: 获取数据模型.
     *
     * @param GetDeviceDatamodelRequest $request
     *
     * @return GetDeviceDatamodelResponse
     */
    public function getDeviceDatamodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDeviceDatamodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取数据模型
     * Summary: 获取数据模型.
     *
     * @param GetDeviceDatamodelRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetDeviceDatamodelResponse
     */
    public function getDeviceDatamodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDeviceDatamodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.datamodel.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册设备
     * Summary: 注册设备.
     *
     * @param ImportDeviceRequest $request
     *
     * @return ImportDeviceResponse
     */
    public function importDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册设备
     * Summary: 注册设备.
     *
     * @param ImportDeviceRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ImportDeviceResponse
     */
    public function importDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过chainId获取设备详情
     * Summary: 通过chainId获取设备详情.
     *
     * @param GetDeviceBychainidRequest $request
     *
     * @return GetDeviceBychainidResponse
     */
    public function getDeviceBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDeviceBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过chainId获取设备详情
     * Summary: 通过chainId获取设备详情.
     *
     * @param GetDeviceBychainidRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetDeviceBychainidResponse
     */
    public function getDeviceBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDeviceBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.bychainid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过deviceId获取设备详情
     * Summary: 通过deviceId获取设备详情.
     *
     * @param GetDeviceBydeviceidRequest $request
     *
     * @return GetDeviceBydeviceidResponse
     */
    public function getDeviceBydeviceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDeviceBydeviceidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过deviceId获取设备详情
     * Summary: 通过deviceId获取设备详情.
     *
     * @param GetDeviceBydeviceidRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetDeviceBydeviceidResponse
     */
    public function getDeviceBydeviceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDeviceBydeviceidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.bydeviceid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过场景码列举设备
     * Summary: 通过场景码列举设备.
     *
     * @param ListDeviceBysceneRequest $request
     *
     * @return ListDeviceBysceneResponse
     */
    public function listDeviceByscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDeviceBysceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过场景码列举设备
     * Summary: 通过场景码列举设备.
     *
     * @param ListDeviceBysceneRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListDeviceBysceneResponse
     */
    public function listDeviceBysceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDeviceBysceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.byscene.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新设备信息
     * Summary: 更新设备信息.
     *
     * @param UpdateDeviceInfoRequest $request
     *
     * @return UpdateDeviceInfoResponse
     */
    public function updateDeviceInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDeviceInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新设备信息
     * Summary: 更新设备信息.
     *
     * @param UpdateDeviceInfoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateDeviceInfoResponse
     */
    public function updateDeviceInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDeviceInfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.info.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过deviceId发行设备
     * Summary: 通过deviceId发行设备.
     *
     * @param CreateDistributedeviceBydeviceidRequest $request
     *
     * @return CreateDistributedeviceBydeviceidResponse
     */
    public function createDistributedeviceBydeviceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBydeviceidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过deviceId发行设备
     * Summary: 通过deviceId发行设备.
     *
     * @param CreateDistributedeviceBydeviceidRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateDistributedeviceBydeviceidResponse
     */
    public function createDistributedeviceBydeviceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBydeviceidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydeviceid.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过链上设备Id发行
     * Summary: 通过链上设备Id发行.
     *
     * @param CreateDistributedeviceBychainidRequest $request
     *
     * @return CreateDistributedeviceBychainidResponse
     */
    public function createDistributedeviceBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过链上设备Id发行
     * Summary: 通过链上设备Id发行.
     *
     * @param CreateDistributedeviceBychainidRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return CreateDistributedeviceBychainidResponse
     */
    public function createDistributedeviceBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainid.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 替换发行设备
     * Summary: 替换发行设备.
     *
     * @param ReplaceDistributedeviceBychainidRequest $request
     *
     * @return ReplaceDistributedeviceBychainidResponse
     */
    public function replaceDistributedeviceBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceDistributedeviceBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 替换发行设备
     * Summary: 替换发行设备.
     *
     * @param ReplaceDistributedeviceBychainidRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return ReplaceDistributedeviceBychainidResponse
     */
    public function replaceDistributedeviceBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceDistributedeviceBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainid.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传单个设备所产生的设备数据
     * Summary: 上传设备数据.
     *
     * @param SendCollectorBychainidRequest $request
     *
     * @return SendCollectorBychainidResponse
     */
    public function sendCollectorBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCollectorBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传单个设备所产生的设备数据
     * Summary: 上传设备数据.
     *
     * @param SendCollectorBychainidRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SendCollectorBychainidResponse
     */
    public function sendCollectorBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCollectorBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.bychainid.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过Id获取发行设备
     * Summary: 通过Id获取发行设备.
     *
     * @param GetDistributedeviceBychainidRequest $request
     *
     * @return GetDistributedeviceBychainidResponse
     */
    public function getDistributedeviceBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDistributedeviceBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过Id获取发行设备
     * Summary: 通过Id获取发行设备.
     *
     * @param GetDistributedeviceBychainidRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return GetDistributedeviceBychainidResponse
     */
    public function getDistributedeviceBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDistributedeviceBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过场景码列举发行设备
     * Summary: 通过场景码列举发行设备.
     *
     * @param ListDistributedeviceBysceneRequest $request
     *
     * @return ListDistributedeviceBysceneResponse
     */
    public function listDistributedeviceByscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDistributedeviceBysceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过场景码列举发行设备
     * Summary: 通过场景码列举发行设备.
     *
     * @param ListDistributedeviceBysceneRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ListDistributedeviceBysceneResponse
     */
    public function listDistributedeviceBysceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDistributedeviceBysceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.byscene.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建消费者
     * Summary: 创建消费者.
     *
     * @param CreateConsumerRequest $request
     *
     * @return CreateConsumerResponse
     */
    public function createConsumer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsumerEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建消费者
     * Summary: 创建消费者.
     *
     * @param CreateConsumerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateConsumerResponse
     */
    public function createConsumerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsumerResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.consumer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费者订阅
     * Summary: 消费者订阅.
     *
     * @param SetConsumerSubscribeRequest $request
     *
     * @return SetConsumerSubscribeResponse
     */
    public function setConsumerSubscribe($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumerSubscribeEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费者订阅
     * Summary: 消费者订阅.
     *
     * @param SetConsumerSubscribeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SetConsumerSubscribeResponse
     */
    public function setConsumerSubscribeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumerSubscribeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.consumer.subscribe.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费者取消订阅设备
     * Summary: 消费者取消订阅设备.
     *
     * @param SetConsumerUnsubscribeRequest $request
     *
     * @return SetConsumerUnsubscribeResponse
     */
    public function setConsumerUnsubscribe($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumerUnsubscribeEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费者取消订阅设备
     * Summary: 消费者取消订阅设备.
     *
     * @param SetConsumerUnsubscribeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SetConsumerUnsubscribeResponse
     */
    public function setConsumerUnsubscribeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumerUnsubscribeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.consumer.unsubscribe.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费者获取数据
     * Summary: 消费者获取数据.
     *
     * @param PullConsumerDatasourceRequest $request
     *
     * @return PullConsumerDatasourceResponse
     */
    public function pullConsumerDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullConsumerDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费者获取数据
     * Summary: 消费者获取数据.
     *
     * @param PullConsumerDatasourceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PullConsumerDatasourceResponse
     */
    public function pullConsumerDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullConsumerDatasourceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.consumer.datasource.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过设备id获取发行设备详情
     * Summary: 通过设备id获取发行设备详情.
     *
     * @param GetDistributedeviceBydeviceidRequest $request
     *
     * @return GetDistributedeviceBydeviceidResponse
     */
    public function getDistributedeviceBydeviceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDistributedeviceBydeviceidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过设备id获取发行设备详情
     * Summary: 通过设备id获取发行设备详情.
     *
     * @param GetDistributedeviceBydeviceidRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return GetDistributedeviceBydeviceidResponse
     */
    public function getDistributedeviceBydeviceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDistributedeviceBydeviceidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydeviceid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过发行id获取设备
     * Summary: 通过发行id获取设备.
     *
     * @param GetDistributedeviceBydisidRequest $request
     *
     * @return GetDistributedeviceBydisidResponse
     */
    public function getDistributedeviceBydisid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDistributedeviceBydisidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过发行id获取设备
     * Summary: 通过发行id获取设备.
     *
     * @param GetDistributedeviceBydisidRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetDistributedeviceBydisidResponse
     */
    public function getDistributedeviceBydisidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDistributedeviceBydisidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydisid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册外围设备
     * Summary: 注册外围设备.
     *
     * @param ImportPeripheralRequest $request
     *
     * @return ImportPeripheralResponse
     */
    public function importPeripheral($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importPeripheralEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册外围设备
     * Summary: 注册外围设备.
     *
     * @param ImportPeripheralRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportPeripheralResponse
     */
    public function importPeripheralEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportPeripheralResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.peripheral.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过链上外围设备ID获取详情
     * Summary: 通过链上外围设备ID获取详情.
     *
     * @param GetPeripheralBychainperipheralidRequest $request
     *
     * @return GetPeripheralBychainperipheralidResponse
     */
    public function getPeripheralBychainperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getPeripheralBychainperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过链上外围设备ID获取详情
     * Summary: 通过链上外围设备ID获取详情.
     *
     * @param GetPeripheralBychainperipheralidRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return GetPeripheralBychainperipheralidResponse
     */
    public function getPeripheralBychainperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetPeripheralBychainperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.peripheral.bychainperipheralid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过外围设备ID获取详情
     * Summary: 通过外围设备ID获取详情.
     *
     * @param GetPeripheralByperipheralidRequest $request
     *
     * @return GetPeripheralByperipheralidResponse
     */
    public function getPeripheralByperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getPeripheralByperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过外围设备ID获取详情
     * Summary: 通过外围设备ID获取详情.
     *
     * @param GetPeripheralByperipheralidRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetPeripheralByperipheralidResponse
     */
    public function getPeripheralByperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetPeripheralByperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.peripheral.byperipheralid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据场景列举外围设备
     * Summary: 根据场景列举外围设备.
     *
     * @param ListPeripheralBysceneRequest $request
     *
     * @return ListPeripheralBysceneResponse
     */
    public function listPeripheralByscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listPeripheralBysceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据场景列举外围设备
     * Summary: 根据场景列举外围设备.
     *
     * @param ListPeripheralBysceneRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListPeripheralBysceneResponse
     */
    public function listPeripheralBysceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListPeripheralBysceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.peripheral.byscene.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过外围设备Id发行
     * Summary: 通过外围设备Id发行.
     *
     * @param CreateDistributedeviceByperipheralidRequest $request
     *
     * @return CreateDistributedeviceByperipheralidResponse
     */
    public function createDistributedeviceByperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceByperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过外围设备Id发行
     * Summary: 通过外围设备Id发行.
     *
     * @param CreateDistributedeviceByperipheralidRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return CreateDistributedeviceByperipheralidResponse
     */
    public function createDistributedeviceByperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceByperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.byperipheralid.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过链上外围设备Id发行
     * Summary: 通过链上外围设备Id发行.
     *
     * @param CreateDistributedeviceBychainperipheralidRequest $request
     *
     * @return CreateDistributedeviceBychainperipheralidResponse
     */
    public function createDistributedeviceBychainperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBychainperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过链上外围设备Id发行
     * Summary: 通过链上外围设备Id发行.
     *
     * @param CreateDistributedeviceBychainperipheralidRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return CreateDistributedeviceBychainperipheralidResponse
     */
    public function createDistributedeviceBychainperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBychainperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 替换发行外围设备 by 链上外围设备ID
     * Summary: 替换发行外围设备 by 链上外围设备ID.
     *
     * @param ReplaceDistributedeviceBychainperipheralidRequest $request
     *
     * @return ReplaceDistributedeviceBychainperipheralidResponse
     */
    public function replaceDistributedeviceBychainperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceDistributedeviceBychainperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 替换发行外围设备 by 链上外围设备ID
     * Summary: 替换发行外围设备 by 链上外围设备ID.
     *
     * @param ReplaceDistributedeviceBychainperipheralidRequest $request
     * @param string[]                                          $headers
     * @param RuntimeOptions                                    $runtime
     *
     * @return ReplaceDistributedeviceBychainperipheralidResponse
     */
    public function replaceDistributedeviceBychainperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceDistributedeviceBychainperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据场景列举发行外围设备
     * Summary: 根据场景列举发行外围设备.
     *
     * @param ListDistributedeviceByperipheralsceneRequest $request
     *
     * @return ListDistributedeviceByperipheralsceneResponse
     */
    public function listDistributedeviceByperipheralscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDistributedeviceByperipheralsceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据场景列举发行外围设备
     * Summary: 根据场景列举发行外围设备.
     *
     * @param ListDistributedeviceByperipheralsceneRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return ListDistributedeviceByperipheralsceneResponse
     */
    public function listDistributedeviceByperipheralsceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDistributedeviceByperipheralsceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.byperipheralscene.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过外围设备ID获取发行外围设备信息
     * Summary: 通过外围设备ID获取发行外围设备信息.
     *
     * @param GetDistributedeviceByperipheralidRequest $request
     *
     * @return GetDistributedeviceByperipheralidResponse
     */
    public function getDistributedeviceByperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDistributedeviceByperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过外围设备ID获取发行外围设备信息
     * Summary: 通过外围设备ID获取发行外围设备信息.
     *
     * @param GetDistributedeviceByperipheralidRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return GetDistributedeviceByperipheralidResponse
     */
    public function getDistributedeviceByperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDistributedeviceByperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.byperipheralid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行设备by_devcie
     * Summary: 发行设备by_devcie.
     *
     * @param CreateDistributedeviceBydeviceRequest $request
     *
     * @return CreateDistributedeviceBydeviceResponse
     */
    public function createDistributedeviceBydevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBydeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行设备by_devcie
     * Summary: 发行设备by_devcie.
     *
     * @param CreateDistributedeviceBydeviceRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CreateDistributedeviceBydeviceResponse
     */
    public function createDistributedeviceBydeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBydeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydevice.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 远程任务创建
     * Summary: 远程任务创建.
     *
     * @param CreateTaskRequest $request
     *
     * @return CreateTaskResponse
     */
    public function createTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 远程任务创建
     * Summary: 远程任务创建.
     *
     * @param CreateTaskRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateTaskResponse
     */
    public function createTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 远程任务查询
     * Summary: 远程任务查询.
     *
     * @param QueryTaskRequest $request
     *
     * @return QueryTaskResponse
     */
    public function queryTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 远程任务查询
     * Summary: 远程任务查询.
     *
     * @param QueryTaskRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryTaskResponse
     */
    public function queryTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分析数据查询
     * Summary: 分析数据查询.
     *
     * @param QueryAnalysisRequest $request
     *
     * @return QueryAnalysisResponse
     */
    public function queryAnalysis($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAnalysisEx($request, $headers, $runtime);
    }

    /**
     * Description: 分析数据查询
     * Summary: 分析数据查询.
     *
     * @param QueryAnalysisRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryAnalysisResponse
     */
    public function queryAnalysisEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAnalysisResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.analysis.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
     * Summary: 上传设备数据mul.
     *
     * @param SendCollectorBychainidmulRequest $request
     *
     * @return SendCollectorBychainidmulResponse
     */
    public function sendCollectorBychainidmul($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCollectorBychainidmulEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
     * Summary: 上传设备数据mul.
     *
     * @param SendCollectorBychainidmulRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SendCollectorBychainidmulResponse
     */
    public function sendCollectorBychainidmulEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCollectorBychainidmulResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.bychainidmul.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传设备业务数据
     * Summary: 上传设备业务数据.
     *
     * @param SendCollectorDevicebizdataRequest $request
     *
     * @return SendCollectorDevicebizdataResponse
     */
    public function sendCollectorDevicebizdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCollectorDevicebizdataEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传设备业务数据
     * Summary: 上传设备业务数据.
     *
     * @param SendCollectorDevicebizdataRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SendCollectorDevicebizdataResponse
     */
    public function sendCollectorDevicebizdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCollectorDevicebizdataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.devicebizdata.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新设备信息by_devcie
     * Summary: 更新设备信息by_devcie.
     *
     * @param UpdateDeviceInfobydeviceRequest $request
     *
     * @return UpdateDeviceInfobydeviceResponse
     */
    public function updateDeviceInfobydevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDeviceInfobydeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新设备信息by_devcie
     * Summary: 更新设备信息by_devcie.
     *
     * @param UpdateDeviceInfobydeviceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateDeviceInfobydeviceResponse
     */
    public function updateDeviceInfobydeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDeviceInfobydeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.infobydevice.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 下线设备
     * Summary: 下线设备.
     *
     * @param OfflineDeviceRequest $request
     *
     * @return OfflineDeviceResponse
     */
    public function offlineDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 下线设备
     * Summary: 下线设备.
     *
     * @param OfflineDeviceRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return OfflineDeviceResponse
     */
    public function offlineDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 申请MQTT token
     * Summary: 申请MQTT token.
     *
     * @param ApplyMqtokenRequest $request
     *
     * @return ApplyMqtokenResponse
     */
    public function applyMqtoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyMqtokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 申请MQTT token
     * Summary: 申请MQTT token.
     *
     * @param ApplyMqtokenRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ApplyMqtokenResponse
     */
    public function applyMqtokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyMqtokenResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.mqtoken.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询设备所注册的公钥是否正确
     * Summary: 查询注册信息.
     *
     * @param QueryDeviceRegistrationRequest $request
     *
     * @return QueryDeviceRegistrationResponse
     */
    public function queryDeviceRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询设备所注册的公钥是否正确
     * Summary: 查询注册信息.
     *
     * @param QueryDeviceRegistrationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDeviceRegistrationResponse
     */
    public function queryDeviceRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.registration.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备异常上报
     * Summary: 设备异常上报.
     *
     * @param AddAbnormalRequest $request
     *
     * @return AddAbnormalResponse
     */
    public function addAbnormal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addAbnormalEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备异常上报
     * Summary: 设备异常上报.
     *
     * @param AddAbnormalRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AddAbnormalResponse
     */
    public function addAbnormalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddAbnormalResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.abnormal.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备下线后，可通过此接口重新上线
     * Summary: 设置设备状态为上线
     *
     * @param OnlineDeviceRequest $request
     *
     * @return OnlineDeviceResponse
     */
    public function onlineDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->onlineDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备下线后，可通过此接口重新上线
     * Summary: 设置设备状态为上线
     *
     * @param OnlineDeviceRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return OnlineDeviceResponse
     */
    public function onlineDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OnlineDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.online', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注销设备
     * Summary: 注销设备.
     *
     * @param OfflineDeviceByunregisterRequest $request
     *
     * @return OfflineDeviceByunregisterResponse
     */
    public function offlineDeviceByunregister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineDeviceByunregisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 注销设备
     * Summary: 注销设备.
     *
     * @param OfflineDeviceByunregisterRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return OfflineDeviceByunregisterResponse
     */
    public function offlineDeviceByunregisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineDeviceByunregisterResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.byunregister.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签状态查询
     * Summary: 标签状态查询.
     *
     * @param QueryLabelTraceRequest $request
     *
     * @return QueryLabelTraceResponse
     */
    public function queryLabelTrace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLabelTraceEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签状态查询
     * Summary: 标签状态查询.
     *
     * @param QueryLabelTraceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryLabelTraceResponse
     */
    public function queryLabelTraceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLabelTraceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.label.trace.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签流转状态同步
     * Summary: 标签流转状态同步.
     *
     * @param SyncLabelTransferRequest $request
     *
     * @return SyncLabelTransferResponse
     */
    public function syncLabelTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncLabelTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签流转状态同步
     * Summary: 标签流转状态同步.
     *
     * @param SyncLabelTransferRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SyncLabelTransferResponse
     */
    public function syncLabelTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncLabelTransferResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.label.transfer.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签资产绑定
     * Summary: 标签资产绑定.
     *
     * @param AddLabelAssetRequest $request
     *
     * @return AddLabelAssetResponse
     */
    public function addLabelAsset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addLabelAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签资产绑定
     * Summary: 标签资产绑定.
     *
     * @param AddLabelAssetRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AddLabelAssetResponse
     */
    public function addLabelAssetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddLabelAssetResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.label.asset.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过tx_hash查询上链信息
     * Summary: 链上信息查询.
     *
     * @param QueryDataBytxhashRequest $request
     *
     * @return QueryDataBytxhashResponse
     */
    public function queryDataBytxhash($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDataBytxhashEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过tx_hash查询上链信息
     * Summary: 链上信息查询.
     *
     * @param QueryDataBytxhashRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryDataBytxhashResponse
     */
    public function queryDataBytxhashEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDataBytxhashResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.data.bytxhash.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据taskId 执行未处理的任务
     * Summary: 执行未处理的任务
     *
     * @param ExecUnprocessedTaskRequest $request
     *
     * @return ExecUnprocessedTaskResponse
     */
    public function execUnprocessedTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execUnprocessedTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据taskId 执行未处理的任务
     * Summary: 执行未处理的任务
     *
     * @param ExecUnprocessedTaskRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecUnprocessedTaskResponse
     */
    public function execUnprocessedTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecUnprocessedTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.unprocessed.task.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链oneapi
     * Summary: 信物链oneapi.
     *
     * @param ExecThingsdidOneapiRequest $request
     *
     * @return ExecThingsdidOneapiResponse
     */
    public function execThingsdidOneapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execThingsdidOneapiEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链oneapi
     * Summary: 信物链oneapi.
     *
     * @param ExecThingsdidOneapiRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecThingsdidOneapiResponse
     */
    public function execThingsdidOneapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecThingsdidOneapiResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.oneapi.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链存证
     * Summary: 信物链存证
     *
     * @param StartEvidenceStoreRequest $request
     *
     * @return StartEvidenceStoreResponse
     */
    public function startEvidenceStore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startEvidenceStoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链存证
     * Summary: 信物链存证
     *
     * @param StartEvidenceStoreRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return StartEvidenceStoreResponse
     */
    public function startEvidenceStoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartEvidenceStoreResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.evidence.store.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链存证查询
     * Summary: 信物链存证查询.
     *
     * @param StartEvidenceQueryRequest $request
     *
     * @return StartEvidenceQueryResponse
     */
    public function startEvidenceQuery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startEvidenceQueryEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链存证查询
     * Summary: 信物链存证查询.
     *
     * @param StartEvidenceQueryRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return StartEvidenceQueryResponse
     */
    public function startEvidenceQueryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartEvidenceQueryResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.evidence.query.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链实体身份注册
     * Summary: 信物链实体身份注册.
     *
     * @param StartThingsdidRegisterRequest $request
     *
     * @return StartThingsdidRegisterResponse
     */
    public function startThingsdidRegister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startThingsdidRegisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链实体身份注册
     * Summary: 信物链实体身份注册.
     *
     * @param StartThingsdidRegisterRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return StartThingsdidRegisterResponse
     */
    public function startThingsdidRegisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartThingsdidRegisterResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.register.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链异步操作查询
     * 智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
     * Summary: 信物链异步操作查询.
     *
     * @param QueryThingsdidAsyncprocessRequest $request
     *
     * @return QueryThingsdidAsyncprocessResponse
     */
    public function queryThingsdidAsyncprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThingsdidAsyncprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链异步操作查询
     * 智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
     * Summary: 信物链异步操作查询.
     *
     * @param QueryThingsdidAsyncprocessRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryThingsdidAsyncprocessResponse
     */
    public function queryThingsdidAsyncprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThingsdidAsyncprocessResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.asyncprocess.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
     * Summary: 信物链身份状态更新.
     *
     * @param UpdateThingsdidStatusRequest $request
     *
     * @return UpdateThingsdidStatusResponse
     */
    public function updateThingsdidStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateThingsdidStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
     * Summary: 信物链身份状态更新.
     *
     * @param UpdateThingsdidStatusRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateThingsdidStatusResponse
     */
    public function updateThingsdidStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateThingsdidStatusResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.status.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
     * Summary: 信物链设备空间关联更新.
     *
     * @param UpdateThingsdidDevicespaceRequest $request
     *
     * @return UpdateThingsdidDevicespaceResponse
     */
    public function updateThingsdidDevicespace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateThingsdidDevicespaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
     * Summary: 信物链设备空间关联更新.
     *
     * @param UpdateThingsdidDevicespaceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateThingsdidDevicespaceResponse
     */
    public function updateThingsdidDevicespaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateThingsdidDevicespaceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.devicespace.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链实体did查询，根据dataFilter过滤输出
     * Summary: 信物链实体did查询.
     *
     * @param QueryThingsdidDidRequest $request
     *
     * @return QueryThingsdidDidResponse
     */
    public function queryThingsdidDid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThingsdidDidEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链实体did查询，根据dataFilter过滤输出
     * Summary: 信物链实体did查询.
     *
     * @param QueryThingsdidDidRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryThingsdidDidResponse
     */
    public function queryThingsdidDidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThingsdidDidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.did.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链实体身份更新，字段空则不更新。
     * Summary: 信物链实体身份更新.
     *
     * @param UpdateThingsdidDidRequest $request
     *
     * @return UpdateThingsdidDidResponse
     */
    public function updateThingsdidDid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateThingsdidDidEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链实体身份更新，字段空则不更新。
     * Summary: 信物链实体身份更新.
     *
     * @param UpdateThingsdidDidRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateThingsdidDidResponse
     */
    public function updateThingsdidDidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateThingsdidDidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.did.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链租户信息关联
     * Summary: 信物链租户信息关联.
     *
     * @param StartTenantBindinfoRequest $request
     *
     * @return StartTenantBindinfoResponse
     */
    public function startTenantBindinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startTenantBindinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链租户信息关联
     * Summary: 信物链租户信息关联.
     *
     * @param StartTenantBindinfoRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return StartTenantBindinfoResponse
     */
    public function startTenantBindinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartTenantBindinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tenant.bindinfo.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
     * Summary: 信物链租户项目创建.
     *
     * @param CreateTenantProjectRequest $request
     *
     * @return CreateTenantProjectResponse
     */
    public function createTenantProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTenantProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
     * Summary: 信物链租户项目创建.
     *
     * @param CreateTenantProjectRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateTenantProjectResponse
     */
    public function createTenantProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTenantProjectResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tenant.project.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链实体访问权限更新
     * 所有者/使用者/观察者权限更新
     * Summary: 信物链实体访问权限更新.
     *
     * @param UpdateThingsdidTenantRequest $request
     *
     * @return UpdateThingsdidTenantResponse
     */
    public function updateThingsdidTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateThingsdidTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链实体访问权限更新
     * 所有者/使用者/观察者权限更新
     * Summary: 信物链实体访问权限更新.
     *
     * @param UpdateThingsdidTenantRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateThingsdidTenantResponse
     */
    public function updateThingsdidTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateThingsdidTenantResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.tenant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: LoadCertificateTSMCmd，仅限内部使用api
     * Summary: TSM迁移内部使用.
     *
     * @param LoadTsmCertificatetsmRequest $request
     *
     * @return LoadTsmCertificatetsmResponse
     */
    public function loadTsmCertificatetsm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->loadTsmCertificatetsmEx($request, $headers, $runtime);
    }

    /**
     * Description: LoadCertificateTSMCmd，仅限内部使用api
     * Summary: TSM迁移内部使用.
     *
     * @param LoadTsmCertificatetsmRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return LoadTsmCertificatetsmResponse
     */
    public function loadTsmCertificatetsmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LoadTsmCertificatetsmResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tsm.certificatetsm.load', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: TSM迁移内部使用
     * Summary: loadResourceFile.
     *
     * @param LoadTsmResourcefileRequest $request
     *
     * @return LoadTsmResourcefileResponse
     */
    public function loadTsmResourcefile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->loadTsmResourcefileEx($request, $headers, $runtime);
    }

    /**
     * Description: TSM迁移内部使用
     * Summary: loadResourceFile.
     *
     * @param LoadTsmResourcefileRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return LoadTsmResourcefileResponse
     */
    public function loadTsmResourcefileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LoadTsmResourcefileResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tsm.resourcefile.load', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
