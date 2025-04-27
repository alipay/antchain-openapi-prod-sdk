<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DEMOSDK\Models\BindAaaBbbCccRequest;
use AntChain\DEMOSDK\Models\BindAaaBbbCccResponse;
use AntChain\DEMOSDK\Models\BindXxxRequest;
use AntChain\DEMOSDK\Models\BindXxxResponse;
use AntChain\DEMOSDK\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\DEMOSDK\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\DEMOSDK\Models\ImportAbcdOneRequest;
use AntChain\DEMOSDK\Models\ImportAbcdOneResponse;
use AntChain\DEMOSDK\Models\ImportBbbCciRequest;
use AntChain\DEMOSDK\Models\ImportBbbCciResponse;
use AntChain\DEMOSDK\Models\ImportCreateTestRequest;
use AntChain\DEMOSDK\Models\ImportCreateTestResponse;
use AntChain\DEMOSDK\Models\QueryAaaCcdRequest;
use AntChain\DEMOSDK\Models\QueryAaaCcdResponse;
use AntChain\DEMOSDK\Models\QueryAbcdOneRequest;
use AntChain\DEMOSDK\Models\QueryAbcdOneResponse;
use AntChain\DEMOSDK\Models\QueryBbbCccRequest;
use AntChain\DEMOSDK\Models\QueryBbbCccResponse;
use AntChain\DEMOSDK\Models\QueryCacheLimitRequest;
use AntChain\DEMOSDK\Models\QueryCacheLimitResponse;
use AntChain\DEMOSDK\Models\QueryCcXxRequest;
use AntChain\DEMOSDK\Models\QueryCcXxResponse;
use AntChain\DEMOSDK\Models\QueryTimeLimitRequest;
use AntChain\DEMOSDK\Models\QueryTimeLimitResponse;
use AntChain\DEMOSDK\Models\QueryWorkbenchTestRequest;
use AntChain\DEMOSDK\Models\QueryWorkbenchTestResponse;
use AntChain\DEMOSDK\Models\ResetBbbCccRequest;
use AntChain\DEMOSDK\Models\ResetBbbCccResponse;
use AntChain\DEMOSDK\Models\VerifyApiListRequest;
use AntChain\DEMOSDK\Models\VerifyApiListResponse;
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
            // Demo类1
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
                    'sdk_version'      => '1.3.16',
                    '_prod_code'       => 'DEMOSDK',
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
     * Description: 测试sdk打包用
     * Summary: shiyi.cj.
     *
     * @param QueryBbbCccRequest $request
     *
     * @return QueryBbbCccResponse
     */
    public function queryBbbCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试sdk打包用
     * Summary: shiyi.cj.
     *
     * @param QueryBbbCccRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryBbbCccResponse
     */
    public function queryBbbCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBbbCccResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.bbb.ccc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param ImportBbbCciRequest $request
     *
     * @return ImportBbbCciResponse
     */
    public function importBbbCci($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importBbbCciEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param ImportBbbCciRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ImportBbbCciResponse
     */
    public function importBbbCciEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.demosdk.bbb.cci.import',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ImportBbbCciResponse([
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

        return ImportBbbCciResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.bbb.cci.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期全链路测试接口1
     * Summary: 个人工作台二期全链路测试接口1.
     *
     * @param QueryTimeLimitRequest $request
     *
     * @return QueryTimeLimitResponse
     */
    public function queryTimeLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTimeLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期全链路测试接口1
     * Summary: 个人工作台二期全链路测试接口1.
     *
     * @param QueryTimeLimitRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryTimeLimitResponse
     */
    public function queryTimeLimitEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.demosdk.time.limit.query',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new QueryTimeLimitResponse([
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

        return QueryTimeLimitResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.time.limit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试接口2
     * Summary: 个人工作台二期测试接口2.
     *
     * @param QueryCacheLimitRequest $request
     *
     * @return QueryCacheLimitResponse
     */
    public function queryCacheLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCacheLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试接口2
     * Summary: 个人工作台二期测试接口2.
     *
     * @param QueryCacheLimitRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryCacheLimitResponse
     */
    public function queryCacheLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCacheLimitResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.cache.limit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param ResetBbbCccRequest $request
     *
     * @return ResetBbbCccResponse
     */
    public function resetBbbCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试接口
     * Summary: 测试接口.
     *
     * @param ResetBbbCccRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ResetBbbCccResponse
     */
    public function resetBbbCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetBbbCccResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.bbb.ccc.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param BindAaaBbbCccRequest $request
     *
     * @return BindAaaBbbCccResponse
     */
    public function bindAaaBbbCcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindAaaBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param BindAaaBbbCccRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return BindAaaBbbCccResponse
     */
    public function bindAaaBbbCccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindAaaBbbCccResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.aaa.bbb.ccc.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param QueryAaaCcdRequest $request
     *
     * @return QueryAaaCcdResponse
     */
    public function queryAaaCcd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAaaCcdEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param QueryAaaCcdRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryAaaCcdResponse
     */
    public function queryAaaCcdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAaaCcdResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.aaa.ccd.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param BindXxxRequest $request
     *
     * @return BindXxxResponse
     */
    public function bindXxx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindXxxEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test1.
     *
     * @param BindXxxRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return BindXxxResponse
     */
    public function bindXxxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindXxxResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.xxx.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试
     * Summary: 测试.
     *
     * @param QueryCcXxRequest $request
     *
     * @return QueryCcXxResponse
     */
    public function queryCcXx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCcXxEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试
     * Summary: 测试.
     *
     * @param QueryCcXxRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryCcXxResponse
     */
    public function queryCcXxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCcXxResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.cc.xx.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param VerifyApiListRequest $request
     *
     * @return VerifyApiListResponse
     */
    public function verifyApiList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyApiListEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param VerifyApiListRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return VerifyApiListResponse
     */
    public function verifyApiListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyApiListResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.api.list.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param QueryWorkbenchTestRequest $request
     *
     * @return QueryWorkbenchTestResponse
     */
    public function queryWorkbenchTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWorkbenchTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param QueryWorkbenchTestRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryWorkbenchTestResponse
     */
    public function queryWorkbenchTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWorkbenchTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.workbench.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param ImportCreateTestRequest $request
     *
     * @return ImportCreateTestResponse
     */
    public function importCreateTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importCreateTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于个人工作台二期测试使用
     * Summary: 用于个人工作台二期测试使用.
     *
     * @param ImportCreateTestRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportCreateTestResponse
     */
    public function importCreateTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportCreateTestResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.create.test.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口.
     *
     * @param QueryAbcdOneRequest $request
     *
     * @return QueryAbcdOneResponse
     */
    public function queryAbcdOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAbcdOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口.
     *
     * @param QueryAbcdOneRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryAbcdOneResponse
     */
    public function queryAbcdOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAbcdOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.abcd.one.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口.
     *
     * @param ImportAbcdOneRequest $request
     *
     * @return ImportAbcdOneResponse
     */
    public function importAbcdOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importAbcdOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口.
     *
     * @param ImportAbcdOneRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ImportAbcdOneResponse
     */
    public function importAbcdOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportAbcdOneResponse::fromMap($this->doRequest('1.0', 'antchain.demosdk.abcd.one.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
