<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\MPAASFACEVERIFY\Models\CertifyServermodeRequest;
use AntChain\MPAASFACEVERIFY\Models\CertifyServermodeResponse;
use AntChain\MPAASFACEVERIFY\Models\InitCertifyrecordRealpersonRequest;
use AntChain\MPAASFACEVERIFY\Models\InitCertifyrecordRealpersonResponse;
use AntChain\MPAASFACEVERIFY\Models\InitCertifyrecordRequest;
use AntChain\MPAASFACEVERIFY\Models\InitCertifyrecordResponse;
use AntChain\MPAASFACEVERIFY\Models\InitFaceauthRequest;
use AntChain\MPAASFACEVERIFY\Models\InitFaceauthResponse;
use AntChain\MPAASFACEVERIFY\Models\InitFaceplusRequest;
use AntChain\MPAASFACEVERIFY\Models\InitFaceplusResponse;
use AntChain\MPAASFACEVERIFY\Models\QueryCertifyrecordRequest;
use AntChain\MPAASFACEVERIFY\Models\QueryCertifyrecordResponse;
use AntChain\MPAASFACEVERIFY\Models\QueryFaceauthFileRequest;
use AntChain\MPAASFACEVERIFY\Models\QueryFaceauthFileResponse;
use AntChain\MPAASFACEVERIFY\Models\QueryFaceauthRequest;
use AntChain\MPAASFACEVERIFY\Models\QueryFaceauthResponse;
use AntChain\MPAASFACEVERIFY\Models\QueryFaceplusRequest;
use AntChain\MPAASFACEVERIFY\Models\QueryFaceplusResponse;
use AntChain\MPAASFACEVERIFY\Models\UploadOcrServermodeRequest;
use AntChain\MPAASFACEVERIFY\Models\UploadOcrServermodeResponse;
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
                    'sdk_version'      => '1.1.12',
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
     * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: 实人认证初始化.
     *
     * @param InitFaceauthRequest $request
     *
     * @return InitFaceauthResponse
     */
    public function initFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
     * Summary: 实人认证初始化.
     *
     * @param InitFaceauthRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return InitFaceauthResponse
     */
    public function initFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFaceauthResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.faceauth.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
     * Summary: 实人认证查询.
     *
     * @param QueryFaceauthRequest $request
     *
     * @return QueryFaceauthResponse
     */
    public function queryFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
     * Summary: 实人认证查询.
     *
     * @param QueryFaceauthRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryFaceauthResponse
     */
    public function queryFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceauthResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.faceauth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 人脸双因子认证服务端初始化
     * Summary: 人脸双因子认证服务端初始化.
     *
     * @param InitFaceplusRequest $request
     *
     * @return InitFaceplusResponse
     */
    public function initFaceplus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFaceplusEx($request, $headers, $runtime);
    }

    /**
     * Description: 人脸双因子认证服务端初始化
     * Summary: 人脸双因子认证服务端初始化.
     *
     * @param InitFaceplusRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return InitFaceplusResponse
     */
    public function initFaceplusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFaceplusResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.faceplus.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 人脸双因子认证服务端查询
     * Summary: 人脸双因子认证服务端查询.
     *
     * @param QueryFaceplusRequest $request
     *
     * @return QueryFaceplusResponse
     */
    public function queryFaceplus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceplusEx($request, $headers, $runtime);
    }

    /**
     * Description: 人脸双因子认证服务端查询
     * Summary: 人脸双因子认证服务端查询.
     *
     * @param QueryFaceplusRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryFaceplusResponse
     */
    public function queryFaceplusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceplusResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.faceplus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return QueryFaceauthFileResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.faceauth.file.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
     * Summary: 实人认证核验源服务
     *
     * @param CertifyServermodeRequest $request
     *
     * @return CertifyServermodeResponse
     */
    public function certifyServermode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyServermodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用”实人认证核验源服务“接口，可获取权威源的人脸比对结果，认证链路不依赖客户端
     * Summary: 实人认证核验源服务
     *
     * @param CertifyServermodeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CertifyServermodeResponse
     */
    public function certifyServermodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyServermodeResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.servermode.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 实人认证单据初始化服务
     *
     * @param InitCertifyrecordRealpersonRequest $request
     *
     * @return InitCertifyrecordRealpersonResponse
     */
    public function initCertifyrecordRealperson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initCertifyrecordRealpersonEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用”实人认证单据初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 实人认证单据初始化服务
     *
     * @param InitCertifyrecordRealpersonRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return InitCertifyrecordRealpersonResponse
     */
    public function initCertifyrecordRealpersonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitCertifyrecordRealpersonResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.certifyrecord.realperson.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 认证单据初始化服务(无身份).
     *
     * @param InitCertifyrecordRequest $request
     *
     * @return InitCertifyrecordResponse
     */
    public function initCertifyrecord($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initCertifyrecordEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用”认证单据初始化服务“接口，生成业务认证单据，返回单据号
     * Summary: 认证单据初始化服务(无身份).
     *
     * @param InitCertifyrecordRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return InitCertifyrecordResponse
     */
    public function initCertifyrecordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitCertifyrecordResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.certifyrecord.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
     * Summary: 实人认证查询(certifyId).
     *
     * @param QueryCertifyrecordRequest $request
     *
     * @return QueryCertifyrecordResponse
     */
    public function queryCertifyrecord($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCertifyrecordEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用“实人认证结果查询(certifyId)”接口可以通过certifyId查询当次认证的结果
     * Summary: 实人认证查询(certifyId).
     *
     * @param QueryCertifyrecordRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryCertifyrecordResponse
     */
    public function queryCertifyrecordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCertifyrecordResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.certifyrecord.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
     * Summary: OCR数据上传接口.
     *
     * @param UploadOcrServermodeRequest $request
     *
     * @return UploadOcrServermodeResponse
     */
    public function uploadOcrServermode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadOcrServermodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用”纯服务端OCR数据上传“接口，存储OCR数据，返回计费单据号
     * Summary: OCR数据上传接口.
     *
     * @param UploadOcrServermodeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UploadOcrServermodeResponse
     */
    public function uploadOcrServermodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadOcrServermodeResponse::fromMap($this->doRequest('1.0', 'antfin.mpaasfaceverify.ocr.servermode.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
