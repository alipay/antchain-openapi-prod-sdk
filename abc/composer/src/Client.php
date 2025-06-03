<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABC;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\ABC\Models\ApiTestCreateRequest;
use AntChain\ABC\Models\ApiTestCreateResponse;
use AntChain\ABC\Models\APreCreateApiRequest;
use AntChain\ABC\Models\APreCreateApiResponse;
use AntChain\ABC\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\ABC\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\ABC\Models\CreateapiExistingProductsRequest;
use AntChain\ABC\Models\CreateapiExistingProductsResponse;
use AntChain\ABC\Models\ImportOneLimitRequest;
use AntChain\ABC\Models\ImportOneLimitResponse;
use AntChain\ABC\Models\MatchSecurityFaceRequest;
use AntChain\ABC\Models\MatchSecurityFaceResponse;
use AntChain\ABC\Models\PreviewDemoRequest;
use AntChain\ABC\Models\PreviewDemoResponse;
use AntChain\ABC\Models\QueryAbcdaAbcddaaRequest;
use AntChain\ABC\Models\QueryAbcdaAbcddaaResponse;
use AntChain\ABC\Models\QueryApprovalTestRequest;
use AntChain\ABC\Models\QueryApprovalTestResponse;
use AntChain\ABC\Models\QueryGatewayRequest;
use AntChain\ABC\Models\QueryGatewayResponse;
use AntChain\ABC\Models\QueryGongxiangTesttestRequest;
use AntChain\ABC\Models\QueryGongxiangTesttestResponse;
use AntChain\ABC\Models\QueryOneLimitRequest;
use AntChain\ABC\Models\QueryOneLimitResponse;
use AntChain\ABC\Models\QueryTimeFiveRequest;
use AntChain\ABC\Models\QueryTimeFiveResponse;
use AntChain\ABC\Models\QueryTimeFourRequest;
use AntChain\ABC\Models\QueryTimeFourResponse;
use AntChain\ABC\Models\QueryTimeOneRequest;
use AntChain\ABC\Models\QueryTimeOneResponse;
use AntChain\ABC\Models\QueryTimeThreeRequest;
use AntChain\ABC\Models\QueryTimeThreeResponse;
use AntChain\ABC\Models\QueryTimeTwoRequest;
use AntChain\ABC\Models\QueryTimeTwoResponse;
use AntChain\ABC\Models\StabilizeOneLimitRequest;
use AntChain\ABC\Models\StabilizeOneLimitResponse;
use AntChain\ABC\Models\UnstabilizeOneLimitRequest;
use AntChain\ABC\Models\UnstabilizeOneLimitResponse;
use AntChain\ABC\Models\UploadTestFileRequest;
use AntChain\ABC\Models\UploadTestFileResponse;
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
            // 子结构体
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
                    'sdk_version'      => '1.0.15',
                    '_prod_code'       => 'ABC',
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
     * Description: 录入演示111
     * Summary: 录入演示API.
     *
     * @param PreviewDemoRequest $request
     *
     * @return PreviewDemoResponse
     */
    public function previewDemo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->previewDemoEx($request, $headers, $runtime);
    }

    /**
     * Description: 录入演示111
     * Summary: 录入演示API.
     *
     * @param PreviewDemoRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return PreviewDemoResponse
     */
    public function previewDemoEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.abc.demo.preview',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new PreviewDemoResponse([
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

        return PreviewDemoResponse::fromMap($this->doRequest('1.0', 'antchain.abc.demo.preview', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试导入api1
     * Summary: 测试导入api1.
     *
     * @param QueryGatewayRequest $request
     *
     * @return QueryGatewayResponse
     */
    public function queryGateway($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试导入api1
     * Summary: 测试导入api1.
     *
     * @param QueryGatewayRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryGatewayResponse
     */
    public function queryGatewayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayResponse::fromMap($this->doRequest('1.0', 'antchain.abc.gateway.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调试a s dddd
     * Summary: 调试1.
     *
     * @param QueryAbcdaAbcddaaRequest $request
     *
     * @return QueryAbcdaAbcddaaResponse
     */
    public function queryAbcdaAbcddaa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAbcdaAbcddaaEx($request, $headers, $runtime);
    }

    /**
     * Description: 调试a s dddd
     * Summary: 调试1.
     *
     * @param QueryAbcdaAbcddaaRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryAbcdaAbcddaaResponse
     */
    public function queryAbcdaAbcddaaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAbcdaAbcddaaResponse::fromMap($this->doRequest('1.0', 'antchain.abc.abcda.abcddaa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试大安全接口
     * Summary: 测试大安全接口.
     *
     * @param MatchSecurityFaceRequest $request
     *
     * @return MatchSecurityFaceResponse
     */
    public function matchSecurityFace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->matchSecurityFaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试大安全接口
     * Summary: 测试大安全接口.
     *
     * @param MatchSecurityFaceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return MatchSecurityFaceResponse
     */
    public function matchSecurityFaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MatchSecurityFaceResponse::fromMap($this->doRequest('1.0', 'antchain.abc.security.face.match', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件上传测试接口
     * Summary: 文件上传测试接口.
     *
     * @param UploadTestFileRequest $request
     *
     * @return UploadTestFileResponse
     */
    public function uploadTestFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadTestFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件上传测试接口
     * Summary: 文件上传测试接口.
     *
     * @param UploadTestFileRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UploadTestFileResponse
     */
    public function uploadTestFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.abc.test.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadTestFileResponse([
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

        return UploadTestFileResponse::fromMap($this->doRequest('1.0', 'antchain.abc.test.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口1
     * Summary: 压测接口1.
     *
     * @param QueryTimeOneRequest $request
     *
     * @return QueryTimeOneResponse
     */
    public function queryTimeOne($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTimeOneEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口1
     * Summary: 压测接口1.
     *
     * @param QueryTimeOneRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryTimeOneResponse
     */
    public function queryTimeOneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTimeOneResponse::fromMap($this->doRequest('1.0', 'antchain.abc.time.one.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口2
     * Summary: 压测接口2.
     *
     * @param QueryTimeTwoRequest $request
     *
     * @return QueryTimeTwoResponse
     */
    public function queryTimeTwo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTimeTwoEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口2
     * Summary: 压测接口2.
     *
     * @param QueryTimeTwoRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryTimeTwoResponse
     */
    public function queryTimeTwoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTimeTwoResponse::fromMap($this->doRequest('1.0', 'antchain.abc.time.two.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口3
     * Summary: 压测接口3.
     *
     * @param QueryTimeThreeRequest $request
     *
     * @return QueryTimeThreeResponse
     */
    public function queryTimeThree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTimeThreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口3
     * Summary: 压测接口3.
     *
     * @param QueryTimeThreeRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryTimeThreeResponse
     */
    public function queryTimeThreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTimeThreeResponse::fromMap($this->doRequest('1.0', 'antchain.abc.time.three.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口4
     * Summary: 压测接口4.
     *
     * @param QueryTimeFourRequest $request
     *
     * @return QueryTimeFourResponse
     */
    public function queryTimeFour($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTimeFourEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口4
     * Summary: 压测接口4.
     *
     * @param QueryTimeFourRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryTimeFourResponse
     */
    public function queryTimeFourEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTimeFourResponse::fromMap($this->doRequest('1.0', 'antchain.abc.time.four.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口5
     * Summary: 压测接口5.
     *
     * @param QueryTimeFiveRequest $request
     *
     * @return QueryTimeFiveResponse
     */
    public function queryTimeFive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTimeFiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口5
     * Summary: 压测接口5.
     *
     * @param QueryTimeFiveRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryTimeFiveResponse
     */
    public function queryTimeFiveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTimeFiveResponse::fromMap($this->doRequest('1.0', 'antchain.abc.time.five.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已有产品创建api
     * Summary: 已有产品创建api.
     *
     * @param CreateapiExistingProductsRequest $request
     *
     * @return CreateapiExistingProductsResponse
     */
    public function createapiExistingProducts($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createapiExistingProductsEx($request, $headers, $runtime);
    }

    /**
     * Description: 已有产品创建api
     * Summary: 已有产品创建api.
     *
     * @param CreateapiExistingProductsRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateapiExistingProductsResponse
     */
    public function createapiExistingProductsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateapiExistingProductsResponse::fromMap($this->doRequest('1.0', 'antchain.abc.existing.products.createapi', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已有产品下创建的api
     * Summary: 已有产品下创建的api.
     *
     * @param APreCreateApiRequest $request
     *
     * @return APreCreateApiResponse
     */
    public function aPreCreateApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->aPreCreateApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 已有产品下创建的api
     * Summary: 已有产品下创建的api.
     *
     * @param APreCreateApiRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return APreCreateApiResponse
     */
    public function aPreCreateApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return APreCreateApiResponse::fromMap($this->doRequest('1.0', 'antchain.abc.pre.create.api.a', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试使用api
     * Summary: 测试使用api.
     *
     * @param ApiTestCreateRequest $request
     *
     * @return ApiTestCreateResponse
     */
    public function apiTestCreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->apiTestCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用api
     * Summary: 测试使用api.
     *
     * @param ApiTestCreateRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ApiTestCreateResponse
     */
    public function apiTestCreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApiTestCreateResponse::fromMap($this->doRequest('1.0', 'antchain.abc.test.create.api', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323.
     *
     * @param QueryApprovalTestRequest $request
     *
     * @return QueryApprovalTestResponse
     */
    public function queryApprovalTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApprovalTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323.
     *
     * @param QueryApprovalTestRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryApprovalTestResponse
     */
    public function queryApprovalTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApprovalTestResponse::fromMap($this->doRequest('1.0', 'antchain.abc.approval.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param QueryOneLimitRequest $request
     *
     * @return QueryOneLimitResponse
     */
    public function queryOneLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOneLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param QueryOneLimitRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryOneLimitResponse
     */
    public function queryOneLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOneLimitResponse::fromMap($this->doRequest('1.0', 'antchain.abc.one.limit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param ImportOneLimitRequest $request
     *
     * @return ImportOneLimitResponse
     */
    public function importOneLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importOneLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param ImportOneLimitRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ImportOneLimitResponse
     */
    public function importOneLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportOneLimitResponse::fromMap($this->doRequest('1.0', 'antchain.abc.one.limit.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param StabilizeOneLimitRequest $request
     *
     * @return StabilizeOneLimitResponse
     */
    public function stabilizeOneLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stabilizeOneLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试.
     *
     * @param StabilizeOneLimitRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return StabilizeOneLimitResponse
     */
    public function stabilizeOneLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StabilizeOneLimitResponse::fromMap($this->doRequest('1.0', 'antchain.abc.one.limit.stabilize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口.
     *
     * @param UnstabilizeOneLimitRequest $request
     *
     * @return UnstabilizeOneLimitResponse
     */
    public function unstabilizeOneLimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unstabilizeOneLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口.
     *
     * @param UnstabilizeOneLimitRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UnstabilizeOneLimitResponse
     */
    public function unstabilizeOneLimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnstabilizeOneLimitResponse::fromMap($this->doRequest('1.0', 'antchain.abc.one.limit.unstabilize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于共享能力中心六期接入rasp回归验证
     * Summary: 用于共享能力中心六期接入rasp回归验证
     *
     * @param QueryGongxiangTesttestRequest $request
     *
     * @return QueryGongxiangTesttestResponse
     */
    public function queryGongxiangTesttest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGongxiangTesttestEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于共享能力中心六期接入rasp回归验证
     * Summary: 用于共享能力中心六期接入rasp回归验证
     *
     * @param QueryGongxiangTesttestRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryGongxiangTesttestResponse
     */
    public function queryGongxiangTesttestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGongxiangTesttestResponse::fromMap($this->doRequest('1.0', 'antchain.abc.gongxiang.testtest.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
