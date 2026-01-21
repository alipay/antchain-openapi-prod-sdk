<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\INTELLICAR\Models\BatchcreateNewcarRequest;
use AntChain\INTELLICAR\Models\BatchcreateNewcarResponse;
use AntChain\INTELLICAR\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\INTELLICAR\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\INTELLICAR\Models\ImportCarFileRequest;
use AntChain\INTELLICAR\Models\ImportCarFileResponse;
use AntChain\INTELLICAR\Models\PushCarloanRequest;
use AntChain\INTELLICAR\Models\PushCarloanResponse;
use AntChain\INTELLICAR\Models\QueryCarPriceRequest;
use AntChain\INTELLICAR\Models\QueryCarPriceResponse;
use AntChain\INTELLICAR\Models\RegisterCarownerCyRequest;
use AntChain\INTELLICAR\Models\RegisterCarownerCyResponse;
use AntChain\INTELLICAR\Models\RegisterCarownerRequest;
use AntChain\INTELLICAR\Models\RegisterCarownerResponse;
use AntChain\INTELLICAR\Models\SubmitNewcarRequest;
use AntChain\INTELLICAR\Models\SubmitNewcarResponse;
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
            // 用户信息
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
                    'sdk_version'      => '1.0.9',
                    '_prod_code'       => 'INTELLICAR',
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
     * Description: 推送星贷车信息
     * Summary: 推送星贷车信息.
     *
     * @param PushCarloanRequest $request
     *
     * @return PushCarloanResponse
     */
    public function pushCarloan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushCarloanEx($request, $headers, $runtime);
    }

    /**
     * Description: 推送星贷车信息
     * Summary: 推送星贷车信息.
     *
     * @param PushCarloanRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return PushCarloanResponse
     */
    public function pushCarloanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushCarloanResponse::fromMap($this->doRequest('1.0', 'antdigital.intellicar.carloan.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 车主信息提交
     * Summary:  车主信息提交.
     *
     * @param RegisterCarownerRequest $request
     *
     * @return RegisterCarownerResponse
     */
    public function registerCarowner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerCarownerEx($request, $headers, $runtime);
    }

    /**
     * Description: 车主信息提交
     * Summary:  车主信息提交.
     *
     * @param RegisterCarownerRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return RegisterCarownerResponse
     */
    public function registerCarownerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterCarownerResponse::fromMap($this->doRequest('1.0', 'antdigital.intellicar.carowner.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新车线索批量提交
     * Summary: 新车线索批量提交.
     *
     * @param BatchcreateNewcarRequest $request
     *
     * @return BatchcreateNewcarResponse
     */
    public function batchcreateNewcar($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateNewcarEx($request, $headers, $runtime);
    }

    /**
     * Description: 新车线索批量提交
     * Summary: 新车线索批量提交.
     *
     * @param BatchcreateNewcarRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return BatchcreateNewcarResponse
     */
    public function batchcreateNewcarEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateNewcarResponse::fromMap($this->doRequest('1.0', 'antdigital.intellicar.newcar.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交新车线索
     * Summary:  提交新车线索.
     *
     * @param SubmitNewcarRequest $request
     *
     * @return SubmitNewcarResponse
     */
    public function submitNewcar($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitNewcarEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交新车线索
     * Summary:  提交新车线索.
     *
     * @param SubmitNewcarRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return SubmitNewcarResponse
     */
    public function submitNewcarEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitNewcarResponse::fromMap($this->doRequest('1.0', 'antdigital.intellicar.newcar.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 常岳线索推送接口
     * Summary: 常岳线索推送
     *
     * @param RegisterCarownerCyRequest $request
     *
     * @return RegisterCarownerCyResponse
     */
    public function registerCarownerCy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerCarownerCyEx($request, $headers, $runtime);
    }

    /**
     * Description: 常岳线索推送接口
     * Summary: 常岳线索推送
     *
     * @param RegisterCarownerCyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return RegisterCarownerCyResponse
     */
    public function registerCarownerCyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterCarownerCyResponse::fromMap($this->doRequest('1.0', 'antdigital.intellicar.carowner.cy.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 车辆价格查询
     * Summary: 车辆价格查询.
     *
     * @param QueryCarPriceRequest $request
     *
     * @return QueryCarPriceResponse
     */
    public function queryCarPrice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCarPriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 车辆价格查询
     * Summary: 车辆价格查询.
     *
     * @param QueryCarPriceRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryCarPriceResponse
     */
    public function queryCarPriceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCarPriceResponse::fromMap($this->doRequest('1.0', 'antdigital.intellicar.car.price.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件引入
     * Summary: 文件引入.
     *
     * @param ImportCarFileRequest $request
     *
     * @return ImportCarFileResponse
     */
    public function importCarFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importCarFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件引入
     * Summary: 文件引入.
     *
     * @param ImportCarFileRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ImportCarFileResponse
     */
    public function importCarFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antdigital.intellicar.car.file.import',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ImportCarFileResponse([
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

        return ImportCarFileResponse::fromMap($this->doRequest('1.0', 'antdigital.intellicar.car.file.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
