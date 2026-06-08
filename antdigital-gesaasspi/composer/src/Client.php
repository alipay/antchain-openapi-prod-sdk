<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\GESAASSPI\Models\BatchqueryAntchainSdsScenedataTaskresultRequest;
use AntChain\GESAASSPI\Models\BatchqueryAntchainSdsScenedataTaskresultResponse;
use AntChain\GESAASSPI\Models\CallbackAntdigitalGesaasspiRightsprodOperationRequest;
use AntChain\GESAASSPI\Models\CallbackAntdigitalGesaasspiRightsprodOperationResponse;
use AntChain\GESAASSPI\Models\CallbackAntdigitalGesaasspiRightsprodStatusRequest;
use AntChain\GESAASSPI\Models\CallbackAntdigitalGesaasspiRightsprodStatusResponse;
use AntChain\GESAASSPI\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\GESAASSPI\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\GESAASSPI\Models\DownloadAntchainSdsStockRefundflowRequest;
use AntChain\GESAASSPI\Models\DownloadAntchainSdsStockRefundflowResponse;
use AntChain\GESAASSPI\Models\DownloadAntchainSdsStockUseflowRequest;
use AntChain\GESAASSPI\Models\DownloadAntchainSdsStockUseflowResponse;
use AntChain\GESAASSPI\Models\QueryAntchainSdsFavorStocksRequest;
use AntChain\GESAASSPI\Models\QueryAntchainSdsFavorStocksResponse;
use AntChain\GESAASSPI\Models\QueryAntchainSdsScenedataTaskinfoRequest;
use AntChain\GESAASSPI\Models\QueryAntchainSdsScenedataTaskinfoResponse;
use AntChain\GESAASSPI\Models\SubmitAntchainSdsScenedataTaskRequest;
use AntChain\GESAASSPI\Models\SubmitAntchainSdsScenedataTaskResponse;
use AntChain\GESAASSPI\Models\UpdateAntchainSdsScenedataTaskRequest;
use AntChain\GESAASSPI\Models\UpdateAntchainSdsScenedataTaskResponse;
use AntChain\GESAASSPI\Models\UploadAntchainSdsScenedataFileRequest;
use AntChain\GESAASSPI\Models\UploadAntchainSdsScenedataFileResponse;
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
            // 【固定折扣特定信息】
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
                    'sdk_version'      => '1.5.0',
                    '_prod_code'       => 'GESAASSPI',
                    '_prod_channel'    => 'default',
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
     * Description: 创建任务，获取批次号。
     * Summary: 创建任务，获取批次号。
     *
     * @param SubmitAntchainSdsScenedataTaskRequest $request
     *
     * @return SubmitAntchainSdsScenedataTaskResponse
     */
    public function submitAntchainSdsScenedataTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAntchainSdsScenedataTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建任务，获取批次号。
     * Summary: 创建任务，获取批次号。
     *
     * @param SubmitAntchainSdsScenedataTaskRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return SubmitAntchainSdsScenedataTaskResponse
     */
    public function submitAntchainSdsScenedataTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAntchainSdsScenedataTaskResponse::fromMap($this->doRequest('1.0', 'antchain.sds.scenedata.task.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批次数据文件上传
     * Summary: 批次数据文件上传.
     *
     * @param UploadAntchainSdsScenedataFileRequest $request
     *
     * @return UploadAntchainSdsScenedataFileResponse
     */
    public function uploadAntchainSdsScenedataFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAntchainSdsScenedataFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 批次数据文件上传
     * Summary: 批次数据文件上传.
     *
     * @param UploadAntchainSdsScenedataFileRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return UploadAntchainSdsScenedataFileResponse
     */
    public function uploadAntchainSdsScenedataFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.sds.scenedata.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadAntchainSdsScenedataFileResponse([
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

        return UploadAntchainSdsScenedataFileResponse::fromMap($this->doRequest('1.0', 'antchain.sds.scenedata.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 任务结果查询
     * Summary: 任务结果查询.
     *
     * @param BatchqueryAntchainSdsScenedataTaskresultRequest $request
     *
     * @return BatchqueryAntchainSdsScenedataTaskresultResponse
     */
    public function batchqueryAntchainSdsScenedataTaskresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryAntchainSdsScenedataTaskresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 任务结果查询
     * Summary: 任务结果查询.
     *
     * @param BatchqueryAntchainSdsScenedataTaskresultRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return BatchqueryAntchainSdsScenedataTaskresultResponse
     */
    public function batchqueryAntchainSdsScenedataTaskresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryAntchainSdsScenedataTaskresultResponse::fromMap($this->doRequest('1.0', 'antchain.sds.scenedata.taskresult.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过批次号查询任务详细信息
     * Summary: 通过批次号查询任务详细信息.
     *
     * @param QueryAntchainSdsScenedataTaskinfoRequest $request
     *
     * @return QueryAntchainSdsScenedataTaskinfoResponse
     */
    public function queryAntchainSdsScenedataTaskinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainSdsScenedataTaskinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过批次号查询任务详细信息
     * Summary: 通过批次号查询任务详细信息.
     *
     * @param QueryAntchainSdsScenedataTaskinfoRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryAntchainSdsScenedataTaskinfoResponse
     */
    public function queryAntchainSdsScenedataTaskinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainSdsScenedataTaskinfoResponse::fromMap($this->doRequest('1.0', 'antchain.sds.scenedata.taskinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
     * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
     *
     * @param QueryAntchainSdsFavorStocksRequest $request
     *
     * @return QueryAntchainSdsFavorStocksResponse
     */
    public function queryAntchainSdsFavorStocks($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainSdsFavorStocksEx($request, $headers, $runtime);
    }

    /**
     * Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
     * Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
     *
     * @param QueryAntchainSdsFavorStocksRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryAntchainSdsFavorStocksResponse
     */
    public function queryAntchainSdsFavorStocksEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainSdsFavorStocksResponse::fromMap($this->doRequest('1.0', 'antchain.sds.favor.stocks.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微信核销账单接口
     * Summary: 微信核销账单接口.
     *
     * @param DownloadAntchainSdsStockUseflowRequest $request
     *
     * @return DownloadAntchainSdsStockUseflowResponse
     */
    public function downloadAntchainSdsStockUseflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadAntchainSdsStockUseflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 微信核销账单接口
     * Summary: 微信核销账单接口.
     *
     * @param DownloadAntchainSdsStockUseflowRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return DownloadAntchainSdsStockUseflowResponse
     */
    public function downloadAntchainSdsStockUseflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadAntchainSdsStockUseflowResponse::fromMap($this->doRequest('1.0', 'antchain.sds.stock.useflow.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微信退款账单接口
     * Summary: 微信退款账单接口.
     *
     * @param DownloadAntchainSdsStockRefundflowRequest $request
     *
     * @return DownloadAntchainSdsStockRefundflowResponse
     */
    public function downloadAntchainSdsStockRefundflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadAntchainSdsStockRefundflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 微信退款账单接口
     * Summary: 微信退款账单接口.
     *
     * @param DownloadAntchainSdsStockRefundflowRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return DownloadAntchainSdsStockRefundflowResponse
     */
    public function downloadAntchainSdsStockRefundflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadAntchainSdsStockRefundflowResponse::fromMap($this->doRequest('1.0', 'antchain.sds.stock.refundflow.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
     * Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
     *
     * @param UpdateAntchainSdsScenedataTaskRequest $request
     *
     * @return UpdateAntchainSdsScenedataTaskResponse
     */
    public function updateAntchainSdsScenedataTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAntchainSdsScenedataTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
     * Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
     *
     * @param UpdateAntchainSdsScenedataTaskRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return UpdateAntchainSdsScenedataTaskResponse
     */
    public function updateAntchainSdsScenedataTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAntchainSdsScenedataTaskResponse::fromMap($this->doRequest('1.0', 'antchain.sds.scenedata.task.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 权益中心券状态变更回调通知
     * Summary: 权益中心券状态变更回调通知.
     *
     * @param CallbackAntdigitalGesaasspiRightsprodStatusRequest $request
     *
     * @return CallbackAntdigitalGesaasspiRightsprodStatusResponse
     */
    public function callbackAntdigitalGesaasspiRightsprodStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackAntdigitalGesaasspiRightsprodStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 权益中心券状态变更回调通知
     * Summary: 权益中心券状态变更回调通知.
     *
     * @param CallbackAntdigitalGesaasspiRightsprodStatusRequest $request
     * @param string[]                                           $headers
     * @param RuntimeOptions                                     $runtime
     *
     * @return CallbackAntdigitalGesaasspiRightsprodStatusResponse
     */
    public function callbackAntdigitalGesaasspiRightsprodStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackAntdigitalGesaasspiRightsprodStatusResponse::fromMap($this->doRequest('1.0', 'antdigital.gesaasspi.rightsprod.status.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 券操作回调通知
     * Summary: 券操作回调通知.
     *
     * @param CallbackAntdigitalGesaasspiRightsprodOperationRequest $request
     *
     * @return CallbackAntdigitalGesaasspiRightsprodOperationResponse
     */
    public function callbackAntdigitalGesaasspiRightsprodOperation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackAntdigitalGesaasspiRightsprodOperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 券操作回调通知
     * Summary: 券操作回调通知.
     *
     * @param CallbackAntdigitalGesaasspiRightsprodOperationRequest $request
     * @param string[]                                              $headers
     * @param RuntimeOptions                                        $runtime
     *
     * @return CallbackAntdigitalGesaasspiRightsprodOperationResponse
     */
    public function callbackAntdigitalGesaasspiRightsprodOperationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackAntdigitalGesaasspiRightsprodOperationResponse::fromMap($this->doRequest('1.0', 'antdigital.gesaasspi.rightsprod.operation.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
