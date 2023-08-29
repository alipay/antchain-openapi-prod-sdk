<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5511b931fbd04feba92b64ebc082aac0;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\ConfirmAntchainEkycMultiZimRequest;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\ConfirmAntchainEkycMultiZimResponse;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycFaceauthWebsdkRequest;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycFaceauthWebsdkResponse;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycMultiZimRequest;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycMultiZimResponse;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycSingleZimRequest;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycSingleZimResponse;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycVerificationNativeRequest;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycVerificationNativeResponse;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycVerificationWebsdkRequest;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\InitAntchainEkycVerificationWebsdkResponse;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\VerifyAntchainEkycMultiZimRequest;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\VerifyAntchainEkycMultiZimResponse;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\VerifyAntchainEkycSingleZimRequest;
use AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models\VerifyAntchainEkycSingleZimResponse;
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
                    '_prod_code'       => 'ak_5511b931fbd04feba92b64ebc082aac0',
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
     * Description: Web实人认证初始化
     * Summary: Web实人认证初始化.
     *
     * @param InitAntchainEkycFaceauthWebsdkRequest $request
     *
     * @return InitAntchainEkycFaceauthWebsdkResponse
     */
    public function initAntchainEkycFaceauthWebsdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initAntchainEkycFaceauthWebsdkEx($request, $headers, $runtime);
    }

    /**
     * Description: Web实人认证初始化
     * Summary: Web实人认证初始化.
     *
     * @param InitAntchainEkycFaceauthWebsdkRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return InitAntchainEkycFaceauthWebsdkResponse
     */
    public function initAntchainEkycFaceauthWebsdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitAntchainEkycFaceauthWebsdkResponse::fromMap($this->doRequest('1.0', 'antchain.ekyc.faceauth.websdk.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户端单产品初始化接口
     * Summary: 客户端单产品初始化.
     *
     * @param InitAntchainEkycSingleZimRequest $request
     *
     * @return InitAntchainEkycSingleZimResponse
     */
    public function initAntchainEkycSingleZim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initAntchainEkycSingleZimEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户端单产品初始化接口
     * Summary: 客户端单产品初始化.
     *
     * @param InitAntchainEkycSingleZimRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return InitAntchainEkycSingleZimResponse
     */
    public function initAntchainEkycSingleZimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitAntchainEkycSingleZimResponse::fromMap($this->doRequest('1.0', 'antchain.ekyc.single.zim.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户端单产品认证接口
     * Summary: 客户端单产品认证
     *
     * @param VerifyAntchainEkycSingleZimRequest $request
     *
     * @return VerifyAntchainEkycSingleZimResponse
     */
    public function verifyAntchainEkycSingleZim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyAntchainEkycSingleZimEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户端单产品认证接口
     * Summary: 客户端单产品认证
     *
     * @param VerifyAntchainEkycSingleZimRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return VerifyAntchainEkycSingleZimResponse
     */
    public function verifyAntchainEkycSingleZimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyAntchainEkycSingleZimResponse::fromMap($this->doRequest('1.0', 'antchain.ekyc.single.zim.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户端多产品初始化接口
     * Summary: 客户端多产品初始化.
     *
     * @param InitAntchainEkycMultiZimRequest $request
     *
     * @return InitAntchainEkycMultiZimResponse
     */
    public function initAntchainEkycMultiZim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initAntchainEkycMultiZimEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户端多产品初始化接口
     * Summary: 客户端多产品初始化.
     *
     * @param InitAntchainEkycMultiZimRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return InitAntchainEkycMultiZimResponse
     */
    public function initAntchainEkycMultiZimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitAntchainEkycMultiZimResponse::fromMap($this->doRequest('1.0', 'antchain.ekyc.multi.zim.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户端多产品认证接口
     * Summary: 客户端多产品认证
     *
     * @param VerifyAntchainEkycMultiZimRequest $request
     *
     * @return VerifyAntchainEkycMultiZimResponse
     */
    public function verifyAntchainEkycMultiZim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyAntchainEkycMultiZimEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户端多产品认证接口
     * Summary: 客户端多产品认证
     *
     * @param VerifyAntchainEkycMultiZimRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return VerifyAntchainEkycMultiZimResponse
     */
    public function verifyAntchainEkycMultiZimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyAntchainEkycMultiZimResponse::fromMap($this->doRequest('1.0', 'antchain.ekyc.multi.zim.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户端多产品确认接口
     * Summary: 客户端多产品确认.
     *
     * @param ConfirmAntchainEkycMultiZimRequest $request
     *
     * @return ConfirmAntchainEkycMultiZimResponse
     */
    public function confirmAntchainEkycMultiZim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmAntchainEkycMultiZimEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户端多产品确认接口
     * Summary: 客户端多产品确认.
     *
     * @param ConfirmAntchainEkycMultiZimRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ConfirmAntchainEkycMultiZimResponse
     */
    public function confirmAntchainEkycMultiZimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmAntchainEkycMultiZimResponse::fromMap($this->doRequest('1.0', 'antchain.ekyc.multi.zim.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: WebEkyc服务端初始化接口
     * Summary: WebEkyc服务端初始化.
     *
     * @param InitAntchainEkycVerificationWebsdkRequest $request
     *
     * @return InitAntchainEkycVerificationWebsdkResponse
     */
    public function initAntchainEkycVerificationWebsdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initAntchainEkycVerificationWebsdkEx($request, $headers, $runtime);
    }

    /**
     * Description: WebEkyc服务端初始化接口
     * Summary: WebEkyc服务端初始化.
     *
     * @param InitAntchainEkycVerificationWebsdkRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return InitAntchainEkycVerificationWebsdkResponse
     */
    public function initAntchainEkycVerificationWebsdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitAntchainEkycVerificationWebsdkResponse::fromMap($this->doRequest('1.0', 'antchain.ekyc.verification.websdk.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: NativeEkyc服务端初始化接口
     * Summary: NativeEkyc服务端初始化.
     *
     * @param InitAntchainEkycVerificationNativeRequest $request
     *
     * @return InitAntchainEkycVerificationNativeResponse
     */
    public function initAntchainEkycVerificationNative($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initAntchainEkycVerificationNativeEx($request, $headers, $runtime);
    }

    /**
     * Description: NativeEkyc服务端初始化接口
     * Summary: NativeEkyc服务端初始化.
     *
     * @param InitAntchainEkycVerificationNativeRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return InitAntchainEkycVerificationNativeResponse
     */
    public function initAntchainEkycVerificationNativeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitAntchainEkycVerificationNativeResponse::fromMap($this->doRequest('1.0', 'antchain.ekyc.verification.native.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
