<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Util\UtilClient;
use AntChain\ZOLOZFACEVERIFY\Models\CreateConsoleSceneDomainRequest;
use AntChain\ZOLOZFACEVERIFY\Models\CreateConsoleSceneDomainResponse;
use AntChain\ZOLOZFACEVERIFY\Models\ExecAuthenticationCustomerFaceabilityRequest;
use AntChain\ZOLOZFACEVERIFY\Models\ExecAuthenticationCustomerFaceabilityResponse;
use AntChain\ZOLOZFACEVERIFY\Models\ExecFaceauthAlgorithmRequest;
use AntChain\ZOLOZFACEVERIFY\Models\ExecFaceauthAlgorithmResponse;
use AntChain\ZOLOZFACEVERIFY\Models\FaceFaceauthInitializeRequest;
use AntChain\ZOLOZFACEVERIFY\Models\FaceFaceauthInitializeResponse;
use AntChain\ZOLOZFACEVERIFY\Models\FaceFaceauthQueryRequest;
use AntChain\ZOLOZFACEVERIFY\Models\FaceFaceauthQueryResponse;
use AntChain\ZOLOZFACEVERIFY\Models\IdentityFaceauthServermodeRequest;
use AntChain\ZOLOZFACEVERIFY\Models\IdentityFaceauthServermodeResponse;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthFaceLiteRequest;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthFaceLiteResponse;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthFaceplusRequest;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthFaceplusResponse;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthFaceWishRequest;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthFaceWishResponse;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthNfcRequest;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthNfcResponse;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthWebsdkRequest;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthWebsdkResponse;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthZimRequest;
use AntChain\ZOLOZFACEVERIFY\Models\InitFaceauthZimResponse;
use AntChain\ZOLOZFACEVERIFY\Models\InitializeFaceauthWebRequest;
use AntChain\ZOLOZFACEVERIFY\Models\InitializeFaceauthWebResponse;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthDataRequest;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthDataResponse;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthFaceplusRequest;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthFaceplusResponse;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthFileRequest;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthFileResponse;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthMeteringRequest;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthMeteringResponse;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthWebRequest;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthWebResponse;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthWebsdkRequest;
use AntChain\ZOLOZFACEVERIFY\Models\QueryFaceauthWebsdkResponse;
use AntChain\ZOLOZFACEVERIFY\Models\RecognizeFaceauthOcrRequest;
use AntChain\ZOLOZFACEVERIFY\Models\RecognizeFaceauthOcrResponse;
use AntChain\ZOLOZFACEVERIFY\Models\VerifyFaceauthVideoRequest;
use AntChain\ZOLOZFACEVERIFY\Models\VerifyFaceauthVideoResponse;
use AntChain\ZOLOZFACEVERIFY\Models\VerifyFaceauthZimRequest;
use AntChain\ZOLOZFACEVERIFY\Models\VerifyFaceauthZimResponse;
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
            // 计量详细结果
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
                    'sdk_version'      => '1.6.2',
                    '_prod_code'       => 'ZOLOZFACEVERIFY',
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
     * Description: 金融云计算能力输出给主站使用
     * Summary: 金融云计算能力输出给主站使用.
     *
     * @param ExecFaceauthAlgorithmRequest $request
     *
     * @return ExecFaceauthAlgorithmResponse
     */
    public function execFaceauthAlgorithm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execFaceauthAlgorithmEx($request, $headers, $runtime);
    }

    /**
     * Description: 金融云计算能力输出给主站使用
     * Summary: 金融云计算能力输出给主站使用.
     *
     * @param ExecFaceauthAlgorithmRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ExecFaceauthAlgorithmResponse
     */
    public function execFaceauthAlgorithmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecFaceauthAlgorithmResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.algorithm.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: 实人认证初始化.
     *
     * @param FaceFaceauthInitializeRequest $request
     *
     * @return FaceFaceauthInitializeResponse
     */
    public function faceFaceauthInitialize($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->faceFaceauthInitializeEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: 实人认证初始化.
     *
     * @param FaceFaceauthInitializeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return FaceFaceauthInitializeResponse
     */
    public function faceFaceauthInitializeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FaceFaceauthInitializeResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.initialize.face', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
     * Summary: 实人认证查询.
     *
     * @param FaceFaceauthQueryRequest $request
     *
     * @return FaceFaceauthQueryResponse
     */
    public function faceFaceauthQuery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->faceFaceauthQueryEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
     * Summary: 实人认证查询.
     *
     * @param FaceFaceauthQueryRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return FaceFaceauthQueryResponse
     */
    public function faceFaceauthQueryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FaceFaceauthQueryResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.query.face', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 人脸纯服务端模式比对
     * Summary: 人脸纯服务端模式比对.
     *
     * @param IdentityFaceauthServermodeRequest $request
     *
     * @return IdentityFaceauthServermodeResponse
     */
    public function identityFaceauthServermode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->identityFaceauthServermodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 人脸纯服务端模式比对
     * Summary: 人脸纯服务端模式比对.
     *
     * @param IdentityFaceauthServermodeRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return IdentityFaceauthServermodeResponse
     */
    public function identityFaceauthServermodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return IdentityFaceauthServermodeResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.servermode.identity', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: H5实人认证初始化.
     *
     * @param InitializeFaceauthWebRequest $request
     *
     * @return InitializeFaceauthWebResponse
     */
    public function initializeFaceauthWeb($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initializeFaceauthWebEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: H5实人认证初始化.
     *
     * @param InitializeFaceauthWebRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return InitializeFaceauthWebResponse
     */
    public function initializeFaceauthWebEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitializeFaceauthWebResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.web.initialize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: H5实人认证查询
     * Summary: H5实人认证查询.
     *
     * @param QueryFaceauthWebRequest $request
     *
     * @return QueryFaceauthWebResponse
     */
    public function queryFaceauthWeb($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceauthWebEx($request, $headers, $runtime);
    }

    /**
     * Description: H5实人认证查询
     * Summary: H5实人认证查询.
     *
     * @param QueryFaceauthWebRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryFaceauthWebResponse
     */
    public function queryFaceauthWebEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceauthWebResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.web.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供给业务方刷脸认证计量查询接口
     * Summary: 提供给业务方刷脸认证计量查询接口.
     *
     * @param QueryFaceauthMeteringRequest $request
     *
     * @return QueryFaceauthMeteringResponse
     */
    public function queryFaceauthMetering($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceauthMeteringEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给业务方刷脸认证计量查询接口
     * Summary: 提供给业务方刷脸认证计量查询接口.
     *
     * @param QueryFaceauthMeteringRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryFaceauthMeteringResponse
     */
    public function queryFaceauthMeteringEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceauthMeteringResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.metering.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 极简模式初始化接口，返回zimId和协议
     * Summary: 极简模式初始化接口.
     *
     * @param InitFaceauthFaceLiteRequest $request
     *
     * @return InitFaceauthFaceLiteResponse
     */
    public function initFaceauthFaceLite($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFaceauthFaceLiteEx($request, $headers, $runtime);
    }

    /**
     * Description: 极简模式初始化接口，返回zimId和协议
     * Summary: 极简模式初始化接口.
     *
     * @param InitFaceauthFaceLiteRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return InitFaceauthFaceLiteResponse
     */
    public function initFaceauthFaceLiteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFaceauthFaceLiteResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.face.lite.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据查询，排查case
     * Summary: 数据查询，排查case.
     *
     * @param QueryFaceauthDataRequest $request
     *
     * @return QueryFaceauthDataResponse
     */
    public function queryFaceauthData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceauthDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据查询，排查case
     * Summary: 数据查询，排查case.
     *
     * @param QueryFaceauthDataRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryFaceauthDataResponse
     */
    public function queryFaceauthDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceauthDataResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.data.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供人脸特征提取、人脸区域识别等能力接口
     * Summary: 提供人脸特征提取、人脸区域识别等能力接口.
     *
     * @param ExecAuthenticationCustomerFaceabilityRequest $request
     *
     * @return ExecAuthenticationCustomerFaceabilityResponse
     */
    public function execAuthenticationCustomerFaceability($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAuthenticationCustomerFaceabilityEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供人脸特征提取、人脸区域识别等能力接口
     * Summary: 提供人脸特征提取、人脸区域识别等能力接口.
     *
     * @param ExecAuthenticationCustomerFaceabilityRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return ExecAuthenticationCustomerFaceabilityResponse
     */
    public function execAuthenticationCustomerFaceabilityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAuthenticationCustomerFaceabilityResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.authentication.customer.faceability.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户端接口初始化认证
     * Summary: 客户端初始化.
     *
     * @param InitFaceauthZimRequest $request
     *
     * @return InitFaceauthZimResponse
     */
    public function initFaceauthZim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFaceauthZimEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户端接口初始化认证
     * Summary: 客户端初始化.
     *
     * @param InitFaceauthZimRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return InitFaceauthZimResponse
     */
    public function initFaceauthZimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFaceauthZimResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.zim.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供客户端活体检测与人脸比对服务
     * Summary: 客户端人脸验证
     *
     * @param VerifyFaceauthZimRequest $request
     *
     * @return VerifyFaceauthZimResponse
     */
    public function verifyFaceauthZim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyFaceauthZimEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供客户端活体检测与人脸比对服务
     * Summary: 客户端人脸验证
     *
     * @param VerifyFaceauthZimRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return VerifyFaceauthZimResponse
     */
    public function verifyFaceauthZimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyFaceauthZimResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.zim.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: OCR识别接口，开放给阿里云场景
     * Summary: OCR识别接口.
     *
     * @param RecognizeFaceauthOcrRequest $request
     *
     * @return RecognizeFaceauthOcrResponse
     */
    public function recognizeFaceauthOcr($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeFaceauthOcrEx($request, $headers, $runtime);
    }

    /**
     * Description: OCR识别接口，开放给阿里云场景
     * Summary: OCR识别接口.
     *
     * @param RecognizeFaceauthOcrRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return RecognizeFaceauthOcrResponse
     */
    public function recognizeFaceauthOcrEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RecognizeFaceauthOcrResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.ocr.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Web实人认证初始化
     * Summary: Web实人认证初始化.
     *
     * @param InitFaceauthWebsdkRequest $request
     *
     * @return InitFaceauthWebsdkResponse
     */
    public function initFaceauthWebsdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFaceauthWebsdkEx($request, $headers, $runtime);
    }

    /**
     * Description: Web实人认证初始化
     * Summary: Web实人认证初始化.
     *
     * @param InitFaceauthWebsdkRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return InitFaceauthWebsdkResponse
     */
    public function initFaceauthWebsdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFaceauthWebsdkResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.websdk.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Web实人认证查询
     * Summary: Web实人认证查询.
     *
     * @param QueryFaceauthWebsdkRequest $request
     *
     * @return QueryFaceauthWebsdkResponse
     */
    public function queryFaceauthWebsdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceauthWebsdkEx($request, $headers, $runtime);
    }

    /**
     * Description: Web实人认证查询
     * Summary: Web实人认证查询.
     *
     * @param QueryFaceauthWebsdkRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryFaceauthWebsdkResponse
     */
    public function queryFaceauthWebsdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceauthWebsdkResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.websdk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
     * Summary: 获取认证资料.
     *
     * @param QueryFaceauthFileRequest $request
     *
     * @return QueryFaceauthFileResponse
     */
    public function queryFaceauthFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceauthFileEx($request, $headers, $runtime);
    }

    /**
     * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
     * Summary: 获取认证资料.
     *
     * @param QueryFaceauthFileRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryFaceauthFileResponse
     */
    public function queryFaceauthFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceauthFileResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.file.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 人脸双因子认证服务端初始化
     * Summary: 人脸双因子认证服务端初始化.
     *
     * @param InitFaceauthFaceplusRequest $request
     *
     * @return InitFaceauthFaceplusResponse
     */
    public function initFaceauthFaceplus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFaceauthFaceplusEx($request, $headers, $runtime);
    }

    /**
     * Description: 人脸双因子认证服务端初始化
     * Summary: 人脸双因子认证服务端初始化.
     *
     * @param InitFaceauthFaceplusRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return InitFaceauthFaceplusResponse
     */
    public function initFaceauthFaceplusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFaceauthFaceplusResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.faceplus.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 人脸双因子认证服务端查询
     * Summary: 人脸双因子认证服务端查询.
     *
     * @param QueryFaceauthFaceplusRequest $request
     *
     * @return QueryFaceauthFaceplusResponse
     */
    public function queryFaceauthFaceplus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceauthFaceplusEx($request, $headers, $runtime);
    }

    /**
     * Description: 人脸双因子认证服务端查询
     * Summary: 人脸双因子认证服务端查询.
     *
     * @param QueryFaceauthFaceplusRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryFaceauthFaceplusResponse
     */
    public function queryFaceauthFaceplusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceauthFaceplusResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.faceplus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 意愿核身认证服务端初始化
     * Summary: 意愿核身认证服务端初始化.
     *
     * @param InitFaceauthFaceWishRequest $request
     *
     * @return InitFaceauthFaceWishResponse
     */
    public function initFaceauthFaceWish($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFaceauthFaceWishEx($request, $headers, $runtime);
    }

    /**
     * Description: 意愿核身认证服务端初始化
     * Summary: 意愿核身认证服务端初始化.
     *
     * @param InitFaceauthFaceWishRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return InitFaceauthFaceWishResponse
     */
    public function initFaceauthFaceWishEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFaceauthFaceWishResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.face.wish.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 人脸视频认证
     * Summary: 人脸视频认证
     *
     * @param VerifyFaceauthVideoRequest $request
     *
     * @return VerifyFaceauthVideoResponse
     */
    public function verifyFaceauthVideo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyFaceauthVideoEx($request, $headers, $runtime);
    }

    /**
     * Description: 人脸视频认证
     * Summary: 人脸视频认证
     *
     * @param VerifyFaceauthVideoRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return VerifyFaceauthVideoResponse
     */
    public function verifyFaceauthVideoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyFaceauthVideoResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.video.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 实证NFC服务端初始化
     * Summary: 实证NFC服务端初始化.
     *
     * @param InitFaceauthNfcRequest $request
     *
     * @return InitFaceauthNfcResponse
     */
    public function initFaceauthNfc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFaceauthNfcEx($request, $headers, $runtime);
    }

    /**
     * Description: 实证NFC服务端初始化
     * Summary: 实证NFC服务端初始化.
     *
     * @param InitFaceauthNfcRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return InitFaceauthNfcResponse
     */
    public function initFaceauthNfcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFaceauthNfcResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.faceauth.nfc.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于阿里云渠道小程序域名的绑定
     * Summary: 新增场景与域名映射.
     *
     * @param CreateConsoleSceneDomainRequest $request
     *
     * @return CreateConsoleSceneDomainResponse
     */
    public function createConsoleSceneDomain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsoleSceneDomainEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于阿里云渠道小程序域名的绑定
     * Summary: 新增场景与域名映射.
     *
     * @param CreateConsoleSceneDomainRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateConsoleSceneDomainResponse
     */
    public function createConsoleSceneDomainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsoleSceneDomainResponse::fromMap($this->doRequest('1.0', 'faceverifyzoloz.console.scene.domain.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
