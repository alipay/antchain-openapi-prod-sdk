<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BCCR\Models\AddHashregisterRequest;
use AntChain\BCCR\Models\AddHashregisterResponse;
use AntChain\BCCR\Models\AddRegisterRequest;
use AntChain\BCCR\Models\AddRegisterResponse;
use AntChain\BCCR\Models\CreateCertificateRequest;
use AntChain\BCCR\Models\CreateCertificateResponse;
use AntChain\BCCR\Models\CreateMonitorTaskRequest;
use AntChain\BCCR\Models\CreateMonitorTaskResponse;
use AntChain\BCCR\Models\CreateRecodescreenRequest;
use AntChain\BCCR\Models\CreateRecodescreenResponse;
use AntChain\BCCR\Models\CreateRecordscreenRequest;
use AntChain\BCCR\Models\CreateRecordscreenResponse;
use AntChain\BCCR\Models\CreateScreenshotRequest;
use AntChain\BCCR\Models\CreateScreenshotResponse;
use AntChain\BCCR\Models\GetCertificateRequest;
use AntChain\BCCR\Models\GetCertificateResponse;
use AntChain\BCCR\Models\GetUploadurlRequest;
use AntChain\BCCR\Models\GetUploadurlResponse;
use AntChain\BCCR\Models\ListMonitorProviderRequest;
use AntChain\BCCR\Models\ListMonitorProviderResponse;
use AntChain\BCCR\Models\ListNotaryRequest;
use AntChain\BCCR\Models\ListNotaryResponse;
use AntChain\BCCR\Models\QueryMonitorResultRequest;
use AntChain\BCCR\Models\QueryMonitorResultResponse;
use AntChain\BCCR\Models\QueryMonitorTaskRequest;
use AntChain\BCCR\Models\QueryMonitorTaskResponse;
use AntChain\BCCR\Models\QueryRecodescreenRequest;
use AntChain\BCCR\Models\QueryRecodescreenResponse;
use AntChain\BCCR\Models\QueryRecordscreenRequest;
use AntChain\BCCR\Models\QueryRecordscreenResponse;
use AntChain\BCCR\Models\QueryRegisterstatusRequest;
use AntChain\BCCR\Models\QueryRegisterstatusResponse;
use AntChain\BCCR\Models\QueryScreenshotRequest;
use AntChain\BCCR\Models\QueryScreenshotResponse;
use AntChain\BCCR\Models\QueryUserListRequest;
use AntChain\BCCR\Models\QueryUserListResponse;
use AntChain\BCCR\Models\QueryUserRequest;
use AntChain\BCCR\Models\QueryUserResponse;
use AntChain\BCCR\Models\StopMonitorTaskRequest;
use AntChain\BCCR\Models\StopMonitorTaskResponse;
use AntChain\BCCR\Models\VerifyBlockchainRequest;
use AntChain\BCCR\Models\VerifyBlockchainResponse;
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
            // 监测提供商能力
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
                    'sdk_version'      => '1.12.0',
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
     * Description: 调用接口获取版权开放平台授权访问oss链接
     * Summary: 获取授权访问oss链接.
     *
     * @param GetUploadurlRequest $request
     *
     * @return GetUploadurlResponse
     */
    public function getUploadurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getUploadurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用接口获取版权开放平台授权访问oss链接
     * Summary: 获取授权访问oss链接.
     *
     * @param GetUploadurlRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetUploadurlResponse
     */
    public function getUploadurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetUploadurlResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.uploadurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权开发平台hash登记
     * Summary: 新增HASH版权登记.
     *
     * @param AddHashregisterRequest $request
     *
     * @return AddHashregisterResponse
     */
    public function addHashregister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addHashregisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权开发平台hash登记
     * Summary: 新增HASH版权登记.
     *
     * @param AddHashregisterRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddHashregisterResponse
     */
    public function addHashregisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddHashregisterResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.hashregister.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权平台新增版权登记
     * Summary: 新增版权登记.
     *
     * @param AddRegisterRequest $request
     *
     * @return AddRegisterResponse
     */
    public function addRegister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addRegisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权平台新增版权登记
     * Summary: 新增版权登记.
     *
     * @param AddRegisterRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AddRegisterResponse
     */
    public function addRegisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddRegisterResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.register.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权平台查询版权登记状态
     * Summary: 查询版权登记状态
     *
     * @param QueryRegisterstatusRequest $request
     *
     * @return QueryRegisterstatusResponse
     */
    public function queryRegisterstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRegisterstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权平台查询版权登记状态
     * Summary: 查询版权登记状态
     *
     * @param QueryRegisterstatusRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryRegisterstatusResponse
     */
    public function queryRegisterstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRegisterstatusResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.registerstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权平台生成版权登记证书
     * Summary: 生成版权登记证书.
     *
     * @param CreateCertificateRequest $request
     *
     * @return CreateCertificateResponse
     */
    public function createCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权平台生成版权登记证书
     * Summary: 生成版权登记证书.
     *
     * @param CreateCertificateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateCertificateResponse
     */
    public function createCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCertificateResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.certificate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 版权平台获取版权登记证书
     * Summary: 获取版权登记证书.
     *
     * @param GetCertificateRequest $request
     *
     * @return GetCertificateResponse
     */
    public function getCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 版权平台获取版权登记证书
     * Summary: 获取版权登记证书.
     *
     * @param GetCertificateRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetCertificateResponse
     */
    public function getCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCertificateResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.certificate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增版权监测任务
     * Summary: 新增版权监测.
     *
     * @param CreateMonitorTaskRequest $request
     *
     * @return CreateMonitorTaskResponse
     */
    public function createMonitorTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMonitorTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增版权监测任务
     * Summary: 新增版权监测.
     *
     * @param CreateMonitorTaskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateMonitorTaskResponse
     */
    public function createMonitorTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMonitorTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 停止版权监测任务
     * Summary: 停止版权监测.
     *
     * @param StopMonitorTaskRequest $request
     *
     * @return StopMonitorTaskResponse
     */
    public function stopMonitorTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopMonitorTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 停止版权监测任务
     * Summary: 停止版权监测.
     *
     * @param StopMonitorTaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return StopMonitorTaskResponse
     */
    public function stopMonitorTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopMonitorTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.task.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询版权监测任务
     * Summary: 查询版权监测.
     *
     * @param QueryMonitorTaskRequest $request
     *
     * @return QueryMonitorTaskResponse
     */
    public function queryMonitorTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMonitorTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询版权监测任务
     * Summary: 查询版权监测.
     *
     * @param QueryMonitorTaskRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryMonitorTaskResponse
     */
    public function queryMonitorTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMonitorTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询版权任务监测结果
     * Summary: 查询版权监测结果.
     *
     * @param QueryMonitorResultRequest $request
     *
     * @return QueryMonitorResultResponse
     */
    public function queryMonitorResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMonitorResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询版权任务监测结果
     * Summary: 查询版权监测结果.
     *
     * @param QueryMonitorResultRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryMonitorResultResponse
     */
    public function queryMonitorResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMonitorResultResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.result.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取传播监测能力服务商列表
     * Summary: 获取传播监测能力服务商列表.
     *
     * @param ListMonitorProviderRequest $request
     *
     * @return ListMonitorProviderResponse
     */
    public function listMonitorProvider($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listMonitorProviderEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取传播监测能力服务商列表
     * Summary: 获取传播监测能力服务商列表.
     *
     * @param ListMonitorProviderRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListMonitorProviderResponse
     */
    public function listMonitorProviderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListMonitorProviderResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.monitor.provider.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建录屏取证(废弃)
     * Summary: 创建录屏取证(废弃).
     *
     * @param CreateRecodescreenRequest $request
     *
     * @return CreateRecodescreenResponse
     */
    public function createRecodescreen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRecodescreenEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建录屏取证(废弃)
     * Summary: 创建录屏取证(废弃).
     *
     * @param CreateRecodescreenRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateRecodescreenResponse
     */
    public function createRecodescreenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRecodescreenResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.recodescreen.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询录屏取证(废弃)
     * Summary: 查询录屏取证(废弃).
     *
     * @param QueryRecodescreenRequest $request
     *
     * @return QueryRecodescreenResponse
     */
    public function queryRecodescreen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRecodescreenEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询录屏取证(废弃)
     * Summary: 查询录屏取证(废弃).
     *
     * @param QueryRecodescreenRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryRecodescreenResponse
     */
    public function queryRecodescreenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRecodescreenResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.recodescreen.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户信息查询
     * Summary: 用户信息查询.
     *
     * @param QueryUserRequest $request
     *
     * @return QueryUserResponse
     */
    public function queryUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户信息查询
     * Summary: 用户信息查询.
     *
     * @param QueryUserRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryUserResponse
     */
    public function queryUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表.
     *
     * @param QueryUserListRequest $request
     *
     * @return QueryUserListResponse
     */
    public function queryUserList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserListEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表.
     *
     * @param QueryUserListRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryUserListResponse
     */
    public function queryUserListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserListResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.user.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建网页取证
     * Summary: 创建网页取证
     *
     * @param CreateScreenshotRequest $request
     *
     * @return CreateScreenshotResponse
     */
    public function createScreenshot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createScreenshotEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建网页取证
     * Summary: 创建网页取证
     *
     * @param CreateScreenshotRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateScreenshotResponse
     */
    public function createScreenshotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateScreenshotResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.screenshot.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询网页取证
     * Summary: 查询网页取证
     *
     * @param QueryScreenshotRequest $request
     *
     * @return QueryScreenshotResponse
     */
    public function queryScreenshot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryScreenshotEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询网页取证
     * Summary: 查询网页取证
     *
     * @param QueryScreenshotRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryScreenshotResponse
     */
    public function queryScreenshotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryScreenshotResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.screenshot.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上核验
     * Summary: 链上核验.
     *
     * @param VerifyBlockchainRequest $request
     *
     * @return VerifyBlockchainResponse
     */
    public function verifyBlockchain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyBlockchainEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上核验
     * Summary: 链上核验.
     *
     * @param VerifyBlockchainRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return VerifyBlockchainResponse
     */
    public function verifyBlockchainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyBlockchainResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.blockchain.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建录屏取证
     * Summary: 创建录屏取证
     *
     * @param CreateRecordscreenRequest $request
     *
     * @return CreateRecordscreenResponse
     */
    public function createRecordscreen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRecordscreenEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建录屏取证
     * Summary: 创建录屏取证
     *
     * @param CreateRecordscreenRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateRecordscreenResponse
     */
    public function createRecordscreenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRecordscreenResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.recordscreen.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询录屏取证
     * Summary: 查询录屏取证
     *
     * @param QueryRecordscreenRequest $request
     *
     * @return QueryRecordscreenResponse
     */
    public function queryRecordscreen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRecordscreenEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询录屏取证
     * Summary: 查询录屏取证
     *
     * @param QueryRecordscreenRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryRecordscreenResponse
     */
    public function queryRecordscreenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRecordscreenResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.recordscreen.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取支持的公证处列表
     * Summary: 获取支持的公证处列表.
     *
     * @param ListNotaryRequest $request
     *
     * @return ListNotaryResponse
     */
    public function listNotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listNotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取支持的公证处列表
     * Summary: 获取支持的公证处列表.
     *
     * @param ListNotaryRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListNotaryResponse
     */
    public function listNotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListNotaryResponse::fromMap($this->doRequest('1.0', 'blockchain.bccr.notary.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
