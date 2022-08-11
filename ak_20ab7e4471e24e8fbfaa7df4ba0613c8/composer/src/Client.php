<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidCorporateWithfourmetaRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidCorporateWithfourmetaResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidCorporateWiththreemetaRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidCorporateWiththreemetaResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidCorporateWithtwometaRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidCorporateWithtwometaResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidPersonWithfourmetaRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidPersonWithfourmetaResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidPersonWiththreemetaRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidPersonWiththreemetaResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidPersonWithtwometaRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\CreateBaasDidPersonWithtwometaResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\QueryBaasDidAgentServicetypeRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\QueryBaasDidAgentServicetypeResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\QueryBaasDidCorporateFaceauthRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\QueryBaasDidCorporateFaceauthResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\QueryBaasDidIdentificationFaceauthRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\QueryBaasDidIdentificationFaceauthResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\QueryBaasDidVcRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\QueryBaasDidVcResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidAgentServicetypeRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidAgentServicetypeResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidCorporateAgentcreateRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidCorporateAgentcreateResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidCorporateFaceauthRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidCorporateFaceauthResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidCorporateSelfcreateRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidCorporateSelfcreateResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidIdentificationFaceauthRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidIdentificationFaceauthResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidPersonAgentcreateRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidPersonAgentcreateResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidVcrepositoryIssueRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidVcrepositoryIssueResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidVerifiableclaimIssureRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidVerifiableclaimIssureResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidVerifiableclaimVerifierRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\StartBaasDidVerifiableclaimVerifierResponse;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\UpdateBaasDidServicesRequest;
use AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models\UpdateBaasDidServicesResponse;
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
            // Did Doc中的服务字段描述
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
                    'sdk_version'      => '1.0.3',
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
     * Description: 通过代理模式为企业创建did
     * Summary: 通过代理模式为企业创建did.
     *
     * @param StartBaasDidCorporateAgentcreateRequest $request
     *
     * @return StartBaasDidCorporateAgentcreateResponse
     */
    public function startBaasDidCorporateAgentcreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startBaasDidCorporateAgentcreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过代理模式为企业创建did
     * Summary: 通过代理模式为企业创建did.
     *
     * @param StartBaasDidCorporateAgentcreateRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return StartBaasDidCorporateAgentcreateResponse
     */
    public function startBaasDidCorporateAgentcreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartBaasDidCorporateAgentcreateResponse::fromMap($this->doRequest('1.0', 'baas.did.corporate.agentcreate.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过代理模式为个人创建did
     * Summary: 通过代理模式为个人创建did.
     *
     * @param StartBaasDidPersonAgentcreateRequest $request
     *
     * @return StartBaasDidPersonAgentcreateResponse
     */
    public function startBaasDidPersonAgentcreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startBaasDidPersonAgentcreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过代理模式为个人创建did
     * Summary: 通过代理模式为个人创建did.
     *
     * @param StartBaasDidPersonAgentcreateRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return StartBaasDidPersonAgentcreateResponse
     */
    public function startBaasDidPersonAgentcreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartBaasDidPersonAgentcreateResponse::fromMap($this->doRequest('1.0', 'baas.did.person.agentcreate.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 直接创建自己的企业did
     * Summary: 直接创建自己的企业did.
     *
     * @param StartBaasDidCorporateSelfcreateRequest $request
     *
     * @return StartBaasDidCorporateSelfcreateResponse
     */
    public function startBaasDidCorporateSelfcreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startBaasDidCorporateSelfcreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 直接创建自己的企业did
     * Summary: 直接创建自己的企业did.
     *
     * @param StartBaasDidCorporateSelfcreateRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return StartBaasDidCorporateSelfcreateResponse
     */
    public function startBaasDidCorporateSelfcreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartBaasDidCorporateSelfcreateResponse::fromMap($this->doRequest('1.0', 'baas.did.corporate.selfcreate.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书
     * Summary: 为指定did颁发证书.
     *
     * @param StartBaasDidVerifiableclaimIssureRequest $request
     *
     * @return StartBaasDidVerifiableclaimIssureResponse
     */
    public function startBaasDidVerifiableclaimIssure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startBaasDidVerifiableclaimIssureEx($request, $headers, $runtime);
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书
     * Summary: 为指定did颁发证书.
     *
     * @param StartBaasDidVerifiableclaimIssureRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return StartBaasDidVerifiableclaimIssureResponse
     */
    public function startBaasDidVerifiableclaimIssureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartBaasDidVerifiableclaimIssureResponse::fromMap($this->doRequest('1.0', 'baas.did.verifiableclaim.issure.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 验证可验证声明
     * Summary: 验证可验证声明.
     *
     * @param StartBaasDidVerifiableclaimVerifierRequest $request
     *
     * @return StartBaasDidVerifiableclaimVerifierResponse
     */
    public function startBaasDidVerifiableclaimVerifier($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startBaasDidVerifiableclaimVerifierEx($request, $headers, $runtime);
    }

    /**
     * Description: 验证可验证声明
     * Summary: 验证可验证声明.
     *
     * @param StartBaasDidVerifiableclaimVerifierRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return StartBaasDidVerifiableclaimVerifierResponse
     */
    public function startBaasDidVerifiableclaimVerifierEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartBaasDidVerifiableclaimVerifierResponse::fromMap($this->doRequest('1.0', 'baas.did.verifiableclaim.verifier.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过vcid查询vc内容
     * Summary: 通过vcid查询vc内容.
     *
     * @param QueryBaasDidVcRequest $request
     *
     * @return QueryBaasDidVcResponse
     */
    public function queryBaasDidVc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasDidVcEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过vcid查询vc内容
     * Summary: 通过vcid查询vc内容.
     *
     * @param QueryBaasDidVcRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryBaasDidVcResponse
     */
    public function queryBaasDidVcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasDidVcResponse::fromMap($this->doRequest('1.0', 'baas.did.vc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开始实人认证
     * Summary: 开始实人认证
     *
     * @param StartBaasDidIdentificationFaceauthRequest $request
     *
     * @return StartBaasDidIdentificationFaceauthResponse
     */
    public function startBaasDidIdentificationFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startBaasDidIdentificationFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 开始实人认证
     * Summary: 开始实人认证
     *
     * @param StartBaasDidIdentificationFaceauthRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return StartBaasDidIdentificationFaceauthResponse
     */
    public function startBaasDidIdentificationFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartBaasDidIdentificationFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.did.identification.faceauth.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果.
     *
     * @param QueryBaasDidIdentificationFaceauthRequest $request
     *
     * @return QueryBaasDidIdentificationFaceauthResponse
     */
    public function queryBaasDidIdentificationFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasDidIdentificationFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果.
     *
     * @param QueryBaasDidIdentificationFaceauthRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryBaasDidIdentificationFaceauthResponse
     */
    public function queryBaasDidIdentificationFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasDidIdentificationFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.did.identification.faceauth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
     * Summary: 通过个人三要素验证后创建个人did.
     *
     * @param CreateBaasDidPersonWiththreemetaRequest $request
     *
     * @return CreateBaasDidPersonWiththreemetaResponse
     */
    public function createBaasDidPersonWiththreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasDidPersonWiththreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
     * Summary: 通过个人三要素验证后创建个人did.
     *
     * @param CreateBaasDidPersonWiththreemetaRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateBaasDidPersonWiththreemetaResponse
     */
    public function createBaasDidPersonWiththreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasDidPersonWiththreemetaResponse::fromMap($this->doRequest('1.0', 'baas.did.person.withthreemeta.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
     * Summary: 通过企业三要素验证后创建企业did.
     *
     * @param CreateBaasDidCorporateWiththreemetaRequest $request
     *
     * @return CreateBaasDidCorporateWiththreemetaResponse
     */
    public function createBaasDidCorporateWiththreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasDidCorporateWiththreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
     * Summary: 通过企业三要素验证后创建企业did.
     *
     * @param CreateBaasDidCorporateWiththreemetaRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return CreateBaasDidCorporateWiththreemetaResponse
     */
    public function createBaasDidCorporateWiththreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasDidCorporateWiththreemetaResponse::fromMap($this->doRequest('1.0', 'baas.did.corporate.withthreemeta.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
     * 支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
     * Summary: 指定did颁发证书，并存储.
     *
     * @param StartBaasDidVcrepositoryIssueRequest $request
     *
     * @return StartBaasDidVcrepositoryIssueResponse
     */
    public function startBaasDidVcrepositoryIssue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startBaasDidVcrepositoryIssueEx($request, $headers, $runtime);
    }

    /**
     * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
     * 支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
     * Summary: 指定did颁发证书，并存储.
     *
     * @param StartBaasDidVcrepositoryIssueRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return StartBaasDidVcrepositoryIssueResponse
     */
    public function startBaasDidVcrepositoryIssueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartBaasDidVcrepositoryIssueResponse::fromMap($this->doRequest('1.0', 'baas.did.vcrepository.issue.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册自定义的服务类型，目前只有租户did可以调用
     * Summary: 注册自定义服务类型.
     *
     * @param StartBaasDidAgentServicetypeRequest $request
     *
     * @return StartBaasDidAgentServicetypeResponse
     */
    public function startBaasDidAgentServicetype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startBaasDidAgentServicetypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册自定义的服务类型，目前只有租户did可以调用
     * Summary: 注册自定义服务类型.
     *
     * @param StartBaasDidAgentServicetypeRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return StartBaasDidAgentServicetypeResponse
     */
    public function startBaasDidAgentServicetypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartBaasDidAgentServicetypeResponse::fromMap($this->doRequest('1.0', 'baas.did.agent.servicetype.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定服务类型的定义，不支持全量查询
     * Summary: 查询指定服务类型的定义.
     *
     * @param QueryBaasDidAgentServicetypeRequest $request
     *
     * @return QueryBaasDidAgentServicetypeResponse
     */
    public function queryBaasDidAgentServicetype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasDidAgentServicetypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定服务类型的定义，不支持全量查询
     * Summary: 查询指定服务类型的定义.
     *
     * @param QueryBaasDidAgentServicetypeRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryBaasDidAgentServicetypeResponse
     */
    public function queryBaasDidAgentServicetypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasDidAgentServicetypeResponse::fromMap($this->doRequest('1.0', 'baas.did.agent.servicetype.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代理模式下更新企业did doc中service中的字段
     * Summary: 代理更新企业did中的services.
     *
     * @param UpdateBaasDidServicesRequest $request
     *
     * @return UpdateBaasDidServicesResponse
     */
    public function updateBaasDidServices($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBaasDidServicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 代理模式下更新企业did doc中service中的字段
     * Summary: 代理更新企业did中的services.
     *
     * @param UpdateBaasDidServicesRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateBaasDidServicesResponse
     */
    public function updateBaasDidServicesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasDidServicesResponse::fromMap($this->doRequest('1.0', 'baas.did.services.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
     * Summary: 通过个人二要素验证后创建个人did.
     *
     * @param CreateBaasDidPersonWithtwometaRequest $request
     *
     * @return CreateBaasDidPersonWithtwometaResponse
     */
    public function createBaasDidPersonWithtwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasDidPersonWithtwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
     * Summary: 通过个人二要素验证后创建个人did.
     *
     * @param CreateBaasDidPersonWithtwometaRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CreateBaasDidPersonWithtwometaResponse
     */
    public function createBaasDidPersonWithtwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasDidPersonWithtwometaResponse::fromMap($this->doRequest('1.0', 'baas.did.person.withtwometa.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过企业二要素验证后创建企业did
     * Summary: 通过企业二要素验证后创建企业did.
     *
     * @param CreateBaasDidCorporateWithtwometaRequest $request
     *
     * @return CreateBaasDidCorporateWithtwometaResponse
     */
    public function createBaasDidCorporateWithtwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasDidCorporateWithtwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过企业二要素验证后创建企业did
     * Summary: 通过企业二要素验证后创建企业did.
     *
     * @param CreateBaasDidCorporateWithtwometaRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return CreateBaasDidCorporateWithtwometaResponse
     */
    public function createBaasDidCorporateWithtwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasDidCorporateWithtwometaResponse::fromMap($this->doRequest('1.0', 'baas.did.corporate.withtwometa.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过企业四要素验证后创建企业did
     * Summary: 通过企业四要素验证后创建企业did.
     *
     * @param CreateBaasDidCorporateWithfourmetaRequest $request
     *
     * @return CreateBaasDidCorporateWithfourmetaResponse
     */
    public function createBaasDidCorporateWithfourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasDidCorporateWithfourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过企业四要素验证后创建企业did
     * Summary: 通过企业四要素验证后创建企业did.
     *
     * @param CreateBaasDidCorporateWithfourmetaRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return CreateBaasDidCorporateWithfourmetaResponse
     */
    public function createBaasDidCorporateWithfourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasDidCorporateWithfourmetaResponse::fromMap($this->doRequest('1.0', 'baas.did.corporate.withfourmeta.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过个人四要素验证后创建个人did
     * Summary: 通过个人四要素验证后创建个人did.
     *
     * @param CreateBaasDidPersonWithfourmetaRequest $request
     *
     * @return CreateBaasDidPersonWithfourmetaResponse
     */
    public function createBaasDidPersonWithfourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasDidPersonWithfourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过个人四要素验证后创建个人did
     * Summary: 通过个人四要素验证后创建个人did.
     *
     * @param CreateBaasDidPersonWithfourmetaRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return CreateBaasDidPersonWithfourmetaResponse
     */
    public function createBaasDidPersonWithfourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasDidPersonWithfourmetaResponse::fromMap($this->doRequest('1.0', 'baas.did.person.withfourmeta.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业法人刷脸认证
     * Summary: 企业法人刷脸认证
     *
     * @param StartBaasDidCorporateFaceauthRequest $request
     *
     * @return StartBaasDidCorporateFaceauthResponse
     */
    public function startBaasDidCorporateFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startBaasDidCorporateFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业法人刷脸认证
     * Summary: 企业法人刷脸认证
     *
     * @param StartBaasDidCorporateFaceauthRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return StartBaasDidCorporateFaceauthResponse
     */
    public function startBaasDidCorporateFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartBaasDidCorporateFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.did.corporate.faceauth.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业法人实人结果
     * Summary: 查询企业法人实人结果.
     *
     * @param QueryBaasDidCorporateFaceauthRequest $request
     *
     * @return QueryBaasDidCorporateFaceauthResponse
     */
    public function queryBaasDidCorporateFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasDidCorporateFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业法人实人结果
     * Summary: 查询企业法人实人结果.
     *
     * @param QueryBaasDidCorporateFaceauthRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryBaasDidCorporateFaceauthResponse
     */
    public function queryBaasDidCorporateFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasDidCorporateFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.did.corporate.faceauth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
