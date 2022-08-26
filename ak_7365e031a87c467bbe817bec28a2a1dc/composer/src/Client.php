<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\CreateBaasChainDataexportTaskRequest;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\CreateBaasChainDataexportTaskResponse;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\GetBaasPlusDataserviceBlockchainheightRequest;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\GetBaasPlusDataserviceBlockchainheightResponse;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\GetBaasPlusDataserviceTransactioncountRequest;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\GetBaasPlusDataserviceTransactioncountResponse;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\GetBaasPlusDataserviceTransactioninfoRequest;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\GetBaasPlusDataserviceTransactioninfoResponse;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\ListBaasPlusDataserviceLastblocksRequest;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\ListBaasPlusDataserviceLastblocksResponse;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\UpdateBaasChainDataexportStatusRequest;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\UpdateBaasChainDataexportStatusResponse;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\UpdateBaasChainDataexportTaskRequest;
use AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models\UpdateBaasChainDataexportTaskResponse;
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
            // 阿里云数据导出任务checkpoint类
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
                    '_prod_code'       => 'ak_7365e031a87c467bbe817bec28a2a1dc',
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
     * Description: 修改导出任务状态（启动、暂停、删除）
     * Summary: 修改导出任务状态（启动、暂停、删除）.
     *
     * @param UpdateBaasChainDataexportStatusRequest $request
     *
     * @return UpdateBaasChainDataexportStatusResponse
     */
    public function updateBaasChainDataexportStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBaasChainDataexportStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改导出任务状态（启动、暂停、删除）
     * Summary: 修改导出任务状态（启动、暂停、删除）.
     *
     * @param UpdateBaasChainDataexportStatusRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return UpdateBaasChainDataexportStatusResponse
     */
    public function updateBaasChainDataexportStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasChainDataexportStatusResponse::fromMap($this->doRequest('1.0', 'baas.chain.dataexport.status.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云数据导出需求创建数据导出任务
     * Summary: 创建数据导出任务
     *
     * @param CreateBaasChainDataexportTaskRequest $request
     *
     * @return CreateBaasChainDataexportTaskResponse
     */
    public function createBaasChainDataexportTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasChainDataexportTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云数据导出需求创建数据导出任务
     * Summary: 创建数据导出任务
     *
     * @param CreateBaasChainDataexportTaskRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateBaasChainDataexportTaskResponse
     */
    public function createBaasChainDataexportTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasChainDataexportTaskResponse::fromMap($this->doRequest('1.0', 'baas.chain.dataexport.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改导出任务（名称、描述、告警地址）
     * Summary: 修改导出任务（名称、描述、告警地址）.
     *
     * @param UpdateBaasChainDataexportTaskRequest $request
     *
     * @return UpdateBaasChainDataexportTaskResponse
     */
    public function updateBaasChainDataexportTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBaasChainDataexportTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改导出任务（名称、描述、告警地址）
     * Summary: 修改导出任务（名称、描述、告警地址）.
     *
     * @param UpdateBaasChainDataexportTaskRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UpdateBaasChainDataexportTaskResponse
     */
    public function updateBaasChainDataexportTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasChainDataexportTaskResponse::fromMap($this->doRequest('1.0', 'baas.chain.dataexport.task.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取区块链当前块高
     * Summary: 区块链数据服务-获取区块链当前块高.
     *
     * @param GetBaasPlusDataserviceBlockchainheightRequest $request
     *
     * @return GetBaasPlusDataserviceBlockchainheightResponse
     */
    public function getBaasPlusDataserviceBlockchainheight($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getBaasPlusDataserviceBlockchainheightEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取区块链当前块高
     * Summary: 区块链数据服务-获取区块链当前块高.
     *
     * @param GetBaasPlusDataserviceBlockchainheightRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return GetBaasPlusDataserviceBlockchainheightResponse
     */
    public function getBaasPlusDataserviceBlockchainheightEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetBaasPlusDataserviceBlockchainheightResponse::fromMap($this->doRequest('1.0', 'baas.plus.dataservice.blockchainheight.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取链最近n条块信息
     * Summary: 区块链数据服务-获取链最近n条块信息.
     *
     * @param ListBaasPlusDataserviceLastblocksRequest $request
     *
     * @return ListBaasPlusDataserviceLastblocksResponse
     */
    public function listBaasPlusDataserviceLastblocks($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listBaasPlusDataserviceLastblocksEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取链最近n条块信息
     * Summary: 区块链数据服务-获取链最近n条块信息.
     *
     * @param ListBaasPlusDataserviceLastblocksRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return ListBaasPlusDataserviceLastblocksResponse
     */
    public function listBaasPlusDataserviceLastblocksEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListBaasPlusDataserviceLastblocksResponse::fromMap($this->doRequest('1.0', 'baas.plus.dataservice.lastblocks.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取链交易总数
     * Summary: 区块链数据服务-获取链交易总数.
     *
     * @param GetBaasPlusDataserviceTransactioncountRequest $request
     *
     * @return GetBaasPlusDataserviceTransactioncountResponse
     */
    public function getBaasPlusDataserviceTransactioncount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getBaasPlusDataserviceTransactioncountEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取链交易总数
     * Summary: 区块链数据服务-获取链交易总数.
     *
     * @param GetBaasPlusDataserviceTransactioncountRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return GetBaasPlusDataserviceTransactioncountResponse
     */
    public function getBaasPlusDataserviceTransactioncountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetBaasPlusDataserviceTransactioncountResponse::fromMap($this->doRequest('1.0', 'baas.plus.dataservice.transactioncount.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据交易hash获取交易详情
     * Summary: 区块链数据服务-获取交易详情.
     *
     * @param GetBaasPlusDataserviceTransactioninfoRequest $request
     *
     * @return GetBaasPlusDataserviceTransactioninfoResponse
     */
    public function getBaasPlusDataserviceTransactioninfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getBaasPlusDataserviceTransactioninfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据交易hash获取交易详情
     * Summary: 区块链数据服务-获取交易详情.
     *
     * @param GetBaasPlusDataserviceTransactioninfoRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return GetBaasPlusDataserviceTransactioninfoResponse
     */
    public function getBaasPlusDataserviceTransactioninfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetBaasPlusDataserviceTransactioninfoResponse::fromMap($this->doRequest('1.0', 'baas.plus.dataservice.transactioninfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
