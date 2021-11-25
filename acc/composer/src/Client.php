<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\ACC\Models\AddContractDocumentRequest;
use AntChain\ACC\Models\AddContractDocumentResponse;
use AntChain\ACC\Models\AddContractFileRequest;
use AntChain\ACC\Models\AddContractFileResponse;
use AntChain\ACC\Models\AddContractSignfieldRequest;
use AntChain\ACC\Models\AddContractSignfieldResponse;
use AntChain\ACC\Models\ApplyContractCallbackkeyRequest;
use AntChain\ACC\Models\ApplyContractCallbackkeyResponse;
use AntChain\ACC\Models\ApplyUserSmsRequest;
use AntChain\ACC\Models\ApplyUserSmsResponse;
use AntChain\ACC\Models\AuthContractSignRequest;
use AntChain\ACC\Models\AuthContractSignResponse;
use AntChain\ACC\Models\AuthUserRefRequest;
use AntChain\ACC\Models\AuthUserRefResponse;
use AntChain\ACC\Models\BatchcreateWorkersAttendanceRequest;
use AntChain\ACC\Models\BatchcreateWorkersAttendanceResponse;
use AntChain\ACC\Models\BatchcreateWorkersBaseRequest;
use AntChain\ACC\Models\BatchcreateWorkersBaseResponse;
use AntChain\ACC\Models\BatchcreateWorkersWageRequest;
use AntChain\ACC\Models\BatchcreateWorkersWageResponse;
use AntChain\ACC\Models\CertifyCertifyFaceRequest;
use AntChain\ACC\Models\CertifyCertifyFaceResponse;
use AntChain\ACC\Models\CertifyCertifyFirmmetaRequest;
use AntChain\ACC\Models\CertifyCertifyFirmmetaResponse;
use AntChain\ACC\Models\CertifyCertifyPersonmetaRequest;
use AntChain\ACC\Models\CertifyCertifyPersonmetaResponse;
use AntChain\ACC\Models\CheckSessionAliveRequest;
use AntChain\ACC\Models\CheckSessionAliveResponse;
use AntChain\ACC\Models\CloseUserLoginRequest;
use AntChain\ACC\Models\CloseUserLoginResponse;
use AntChain\ACC\Models\CreateContractAccountsealimageRequest;
use AntChain\ACC\Models\CreateContractAccountsealimageResponse;
use AntChain\ACC\Models\CreateContractBaseRequest;
use AntChain\ACC\Models\CreateContractBaseResponse;
use AntChain\ACC\Models\CreateContractHandsignfieldRequest;
use AntChain\ACC\Models\CreateContractHandsignfieldResponse;
use AntChain\ACC\Models\CreateContractImplRequest;
use AntChain\ACC\Models\CreateContractImplResponse;
use AntChain\ACC\Models\CreateContractOnestepflowRequest;
use AntChain\ACC\Models\CreateContractOnestepflowResponse;
use AntChain\ACC\Models\CreateContractPlatformRequest;
use AntChain\ACC\Models\CreateContractPlatformResponse;
use AntChain\ACC\Models\CreateContractSignflowRequest;
use AntChain\ACC\Models\CreateContractSignflowResponse;
use AntChain\ACC\Models\CreateContractTemplateRequest;
use AntChain\ACC\Models\CreateContractTemplateResponse;
use AntChain\ACC\Models\CreateDidRequest;
use AntChain\ACC\Models\CreateDidResponse;
use AntChain\ACC\Models\CreateFirmCertRequest;
use AntChain\ACC\Models\CreateFirmCertResponse;
use AntChain\ACC\Models\CreateOauthUrlRequest;
use AntChain\ACC\Models\CreateOauthUrlResponse;
use AntChain\ACC\Models\CreateProjectBaseRequest;
use AntChain\ACC\Models\CreateProjectBaseResponse;
use AntChain\ACC\Models\CreateProjectFileRequest;
use AntChain\ACC\Models\CreateProjectFileResponse;
use AntChain\ACC\Models\CreateUserCertRequest;
use AntChain\ACC\Models\CreateUserCertResponse;
use AntChain\ACC\Models\CreateUserRegisterRequest;
use AntChain\ACC\Models\CreateUserRegisterResponse;
use AntChain\ACC\Models\CreateUserRequest;
use AntChain\ACC\Models\CreateUserResponse;
use AntChain\ACC\Models\DeleteContractSignerRequest;
use AntChain\ACC\Models\DeleteContractSignerResponse;
use AntChain\ACC\Models\DownloadContractDocumentRequest;
use AntChain\ACC\Models\DownloadContractDocumentResponse;
use AntChain\ACC\Models\GetContractFileRequest;
use AntChain\ACC\Models\GetContractFileResponse;
use AntChain\ACC\Models\GetContractFileuploadurlRequest;
use AntChain\ACC\Models\GetContractFileuploadurlResponse;
use AntChain\ACC\Models\GetContractSignurlRequest;
use AntChain\ACC\Models\GetContractSignurlResponse;
use AntChain\ACC\Models\GetOauthTokendetailRequest;
use AntChain\ACC\Models\GetOauthTokendetailResponse;
use AntChain\ACC\Models\GetOauthTokenRequest;
use AntChain\ACC\Models\GetOauthTokenResponse;
use AntChain\ACC\Models\GetUserCurrentRequest;
use AntChain\ACC\Models\GetUserCurrentResponse;
use AntChain\ACC\Models\NotifyPartnerAsyncRequest;
use AntChain\ACC\Models\NotifyPartnerAsyncResponse;
use AntChain\ACC\Models\QueryChainTransactionRequest;
use AntChain\ACC\Models\QueryChainTransactionResponse;
use AntChain\ACC\Models\QueryContractFlowRequest;
use AntChain\ACC\Models\QueryContractFlowResponse;
use AntChain\ACC\Models\QueryContractFlowsignerRequest;
use AntChain\ACC\Models\QueryContractFlowsignerResponse;
use AntChain\ACC\Models\QueryContractNotaryRequest;
use AntChain\ACC\Models\QueryContractNotaryResponse;
use AntChain\ACC\Models\QueryContractSignfieldsRequest;
use AntChain\ACC\Models\QueryContractSignfieldsResponse;
use AntChain\ACC\Models\QueryQueryFacecertifyRequest;
use AntChain\ACC\Models\QueryQueryFacecertifyResponse;
use AntChain\ACC\Models\QueryQueryFirmfinancialRequest;
use AntChain\ACC\Models\QueryQueryFirmfinancialResponse;
use AntChain\ACC\Models\RecognizeOcrFileRequest;
use AntChain\ACC\Models\RecognizeOcrFileResponse;
use AntChain\ACC\Models\SaveContractFlowRequest;
use AntChain\ACC\Models\SaveContractFlowResponse;
use AntChain\ACC\Models\StartContractFlowRequest;
use AntChain\ACC\Models\StartContractFlowResponse;
use AntChain\ACC\Models\SwitchSwitchFirmfinancialRequest;
use AntChain\ACC\Models\SwitchSwitchFirmfinancialResponse;
use AntChain\ACC\Models\SwitchSwitchFirmidRequest;
use AntChain\ACC\Models\SwitchSwitchFirmidResponse;
use AntChain\ACC\Models\SyncEcpCloudRequest;
use AntChain\ACC\Models\SyncEcpCloudResponse;
use AntChain\ACC\Models\UpdateFirmInfoRequest;
use AntChain\ACC\Models\UpdateFirmInfoResponse;
use AntChain\ACC\Models\UpdateUserInfoRequest;
use AntChain\ACC\Models\UpdateUserInfoResponse;
use AntChain\ACC\Models\VerifyFirmRequest;
use AntChain\ACC\Models\VerifyFirmResponse;
use AntChain\ACC\Models\VerifyUserPwdRequest;
use AntChain\ACC\Models\VerifyUserPwdResponse;
use AntChain\ACC\Models\VerifyUserRequest;
use AntChain\ACC\Models\VerifyUserResponse;
use AntChain\ACC\Models\VerifyUserSmsRequest;
use AntChain\ACC\Models\VerifyUserSmsResponse;
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
            // 文件描述
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
                    'sdk_version'      => '1.1.51',
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
     * Description: 账密登录(PWD_LOGIN)
     * Summary: 账密登录.
     *
     * @param VerifyUserPwdRequest $request
     *
     * @return VerifyUserPwdResponse
     */
    public function verifyUserPwd($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyUserPwdEx($request, $headers, $runtime);
    }

    /**
     * Description: 账密登录(PWD_LOGIN)
     * Summary: 账密登录.
     *
     * @param VerifyUserPwdRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return VerifyUserPwdResponse
     */
    public function verifyUserPwdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyUserPwdResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.pwd.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短信登录申请
     * Summary: 短信登录申请.
     *
     * @param ApplyUserSmsRequest $request
     *
     * @return ApplyUserSmsResponse
     */
    public function applyUserSms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyUserSmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 短信登录申请
     * Summary: 短信登录申请.
     *
     * @param ApplyUserSmsRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ApplyUserSmsResponse
     */
    public function applyUserSmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyUserSmsResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.sms.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短信登录
     * Summary: 短信登录.
     *
     * @param VerifyUserSmsRequest $request
     *
     * @return VerifyUserSmsResponse
     */
    public function verifyUserSms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyUserSmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 短信登录
     * Summary: 短信登录.
     *
     * @param VerifyUserSmsRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return VerifyUserSmsResponse
     */
    public function verifyUserSmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyUserSmsResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.sms.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 关联登录
     * Summary: 关联登录.
     *
     * @param AuthUserRefRequest $request
     *
     * @return AuthUserRefResponse
     */
    public function authUserRef($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authUserRefEx($request, $headers, $runtime);
    }

    /**
     * Description: 关联登录
     * Summary: 关联登录.
     *
     * @param AuthUserRefRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AuthUserRefResponse
     */
    public function authUserRefEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthUserRefResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.ref.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 退出登录
     * Summary: 退出登录.
     *
     * @param CloseUserLoginRequest $request
     *
     * @return CloseUserLoginResponse
     */
    public function closeUserLogin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->closeUserLoginEx($request, $headers, $runtime);
    }

    /**
     * Description: 退出登录
     * Summary: 退出登录.
     *
     * @param CloseUserLoginRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CloseUserLoginResponse
     */
    public function closeUserLoginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloseUserLoginResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.login.close', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户注册
     * Summary: 用户注册.
     *
     * @param CreateUserRequest $request
     *
     * @return CreateUserResponse
     */
    public function createUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户注册
     * Summary: 用户注册.
     *
     * @param CreateUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateUserResponse
     */
    public function createUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUserResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取用户信息
     * Summary: 获取用户信息.
     *
     * @param GetUserCurrentRequest $request
     *
     * @return GetUserCurrentResponse
     */
    public function getUserCurrent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getUserCurrentEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取用户信息
     * Summary: 获取用户信息.
     *
     * @param GetUserCurrentRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetUserCurrentResponse
     */
    public function getUserCurrentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetUserCurrentResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.current.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证
     * Summary: 企业认证
     *
     * @param VerifyFirmRequest $request
     *
     * @return VerifyFirmResponse
     */
    public function verifyFirm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyFirmEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证
     * Summary: 企业认证
     *
     * @param VerifyFirmRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return VerifyFirmResponse
     */
    public function verifyFirmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyFirmResponse::fromMap($this->doRequest('1.0', 'antchain.acc.firm.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人认证
     * Summary: 个人认证
     *
     * @param VerifyUserRequest $request
     *
     * @return VerifyUserResponse
     */
    public function verifyUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人认证
     * Summary: 个人认证
     *
     * @param VerifyUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return VerifyUserResponse
     */
    public function verifyUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyUserResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ocr_文件识别接口
     * Summary: ocr_文件识别接口.
     *
     * @param RecognizeOcrFileRequest $request
     *
     * @return RecognizeOcrFileResponse
     */
    public function recognizeOcrFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeOcrFileEx($request, $headers, $runtime);
    }

    /**
     * Description: ocr_文件识别接口
     * Summary: ocr_文件识别接口.
     *
     * @param RecognizeOcrFileRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return RecognizeOcrFileResponse
     */
    public function recognizeOcrFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RecognizeOcrFileResponse::fromMap($this->doRequest('1.0', 'antchain.acc.ocr.file.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 输入企业的四要素进行认证。
     * Summary: 企业四要素认证
     *
     * @param CertifyCertifyFirmmetaRequest $request
     *
     * @return CertifyCertifyFirmmetaResponse
     */
    public function certifyCertifyFirmmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyCertifyFirmmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 输入企业的四要素进行认证。
     * Summary: 企业四要素认证
     *
     * @param CertifyCertifyFirmmetaRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CertifyCertifyFirmmetaResponse
     */
    public function certifyCertifyFirmmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyCertifyFirmmetaResponse::fromMap($this->doRequest('1.0', 'antchain.acc.certify.firmmeta.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 输入个人的二要素进行认证。
     * Summary: 个人二要素认证
     *
     * @param CertifyCertifyPersonmetaRequest $request
     *
     * @return CertifyCertifyPersonmetaResponse
     */
    public function certifyCertifyPersonmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyCertifyPersonmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 输入个人的二要素进行认证。
     * Summary: 个人二要素认证
     *
     * @param CertifyCertifyPersonmetaRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CertifyCertifyPersonmetaResponse
     */
    public function certifyCertifyPersonmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyCertifyPersonmetaResponse::fromMap($this->doRequest('1.0', 'antchain.acc.certify.personmeta.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 人脸识别认证
     * Summary: 人脸识别认证
     *
     * @param CertifyCertifyFaceRequest $request
     *
     * @return CertifyCertifyFaceResponse
     */
    public function certifyCertifyFace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyCertifyFaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 人脸识别认证
     * Summary: 人脸识别认证
     *
     * @param CertifyCertifyFaceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CertifyCertifyFaceResponse
     */
    public function certifyCertifyFaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyCertifyFaceResponse::fromMap($this->doRequest('1.0', 'antchain.acc.certify.face.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询人脸识别结果
     * Summary: 人脸识别结果查询.
     *
     * @param QueryQueryFacecertifyRequest $request
     *
     * @return QueryQueryFacecertifyResponse
     */
    public function queryQueryFacecertify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQueryFacecertifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询人脸识别结果
     * Summary: 人脸识别结果查询.
     *
     * @param QueryQueryFacecertifyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryQueryFacecertifyResponse
     */
    public function queryQueryFacecertifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQueryFacecertifyResponse::fromMap($this->doRequest('1.0', 'antchain.acc.query.facecertify.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 每次切换企业，同步当前企业id
     * Summary: 控制台切换企业同步.
     *
     * @param SwitchSwitchFirmidRequest $request
     *
     * @return SwitchSwitchFirmidResponse
     */
    public function switchSwitchFirmid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->switchSwitchFirmidEx($request, $headers, $runtime);
    }

    /**
     * Description: 每次切换企业，同步当前企业id
     * Summary: 控制台切换企业同步.
     *
     * @param SwitchSwitchFirmidRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SwitchSwitchFirmidResponse
     */
    public function switchSwitchFirmidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SwitchSwitchFirmidResponse::fromMap($this->doRequest('1.0', 'antchain.acc.switch.firmid.switch', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业身份中心查询企业财报
     * Summary: 查询企业财报.
     *
     * @param QueryQueryFirmfinancialRequest $request
     *
     * @return QueryQueryFirmfinancialResponse
     */
    public function queryQueryFirmfinancial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQueryFirmfinancialEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业身份中心查询企业财报
     * Summary: 查询企业财报.
     *
     * @param QueryQueryFirmfinancialRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryQueryFirmfinancialResponse
     */
    public function queryQueryFirmfinancialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQueryFirmfinancialResponse::fromMap($this->doRequest('1.0', 'antchain.acc.query.firmfinancial.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业身份中心新增或删除企业财报
     * Summary: 新增/删除企业财报.
     *
     * @param SwitchSwitchFirmfinancialRequest $request
     *
     * @return SwitchSwitchFirmfinancialResponse
     */
    public function switchSwitchFirmfinancial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->switchSwitchFirmfinancialEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业身份中心新增或删除企业财报
     * Summary: 新增/删除企业财报.
     *
     * @param SwitchSwitchFirmfinancialRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SwitchSwitchFirmfinancialResponse
     */
    public function switchSwitchFirmfinancialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SwitchSwitchFirmfinancialResponse::fromMap($this->doRequest('1.0', 'antchain.acc.switch.firmfinancial.switch', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生成企业/个人did
     * Summary: 生成企业/个人did.
     *
     * @param CreateDidRequest $request
     *
     * @return CreateDidResponse
     */
    public function createDid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDidEx($request, $headers, $runtime);
    }

    /**
     * Description: 生成企业/个人did
     * Summary: 生成企业/个人did.
     *
     * @param CreateDidRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return CreateDidResponse
     */
    public function createDidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDidResponse::fromMap($this->doRequest('1.0', 'antchain.acc.did.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册.
     *
     * @param CreateContractPlatformRequest $request
     *
     * @return CreateContractPlatformResponse
     */
    public function createContractPlatform($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractPlatformEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册.
     *
     * @param CreateContractPlatformRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateContractPlatformResponse
     */
    public function createContractPlatformEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractPlatformResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.platform.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档.
     *
     * @param AddContractDocumentRequest $request
     *
     * @return AddContractDocumentResponse
     */
    public function addContractDocument($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addContractDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档.
     *
     * @param AddContractDocumentRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AddContractDocumentResponse
     */
    public function addContractDocumentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddContractDocumentResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.document.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档.
     *
     * @param AddContractFileRequest $request
     *
     * @return AddContractFileResponse
     */
    public function addContractFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addContractFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档.
     *
     * @param AddContractFileRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddContractFileResponse
     */
    public function addContractFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddContractFileResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.file.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key.
     *
     * @param ApplyContractCallbackkeyRequest $request
     *
     * @return ApplyContractCallbackkeyResponse
     */
    public function applyContractCallbackkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyContractCallbackkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key.
     *
     * @param ApplyContractCallbackkeyRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ApplyContractCallbackkeyResponse
     */
    public function applyContractCallbackkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyContractCallbackkeyResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.callbackkey.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 静默签署授权
     * Summary: 静默签署授权.
     *
     * @param AuthContractSignRequest $request
     *
     * @return AuthContractSignResponse
     */
    public function authContractSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authContractSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 静默签署授权
     * Summary: 静默签署授权.
     *
     * @param AuthContractSignRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AuthContractSignResponse
     */
    public function authContractSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthContractSignResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.sign.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板
     *
     * @param CreateContractTemplateRequest $request
     *
     * @return CreateContractTemplateResponse
     */
    public function createContractTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板
     *
     * @param CreateContractTemplateRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateContractTemplateResponse
     */
    public function createContractTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.template.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程.
     *
     * @param CreateContractSignflowRequest $request
     *
     * @return CreateContractSignflowResponse
     */
    public function createContractSignflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractSignflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程.
     *
     * @param CreateContractSignflowRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateContractSignflowResponse
     */
    public function createContractSignflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractSignflowResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.signflow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件.
     *
     * @param GetContractFileuploadurlRequest $request
     *
     * @return GetContractFileuploadurlResponse
     */
    public function getContractFileuploadurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContractFileuploadurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件.
     *
     * @param GetContractFileuploadurlRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetContractFileuploadurlResponse
     */
    public function getContractFileuploadurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContractFileuploadurlResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.fileuploadurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区.
     *
     * @param AddContractSignfieldRequest $request
     *
     * @return AddContractSignfieldResponse
     */
    public function addContractSignfield($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addContractSignfieldEx($request, $headers, $runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区.
     *
     * @param AddContractSignfieldRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return AddContractSignfieldResponse
     */
    public function addContractSignfieldEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddContractSignfieldResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.signfield.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区.
     *
     * @param CreateContractHandsignfieldRequest $request
     *
     * @return CreateContractHandsignfieldResponse
     */
    public function createContractHandsignfield($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractHandsignfieldEx($request, $headers, $runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区.
     *
     * @param CreateContractHandsignfieldRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateContractHandsignfieldResponse
     */
    public function createContractHandsignfieldEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractHandsignfieldResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.handsignfield.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启.
     *
     * @param StartContractFlowRequest $request
     *
     * @return StartContractFlowResponse
     */
    public function startContractFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startContractFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启.
     *
     * @param StartContractFlowRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return StartContractFlowResponse
     */
    public function startContractFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartContractFlowResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.flow.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址
     *
     * @param GetContractSignurlRequest $request
     *
     * @return GetContractSignurlResponse
     */
    public function getContractSignurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContractSignurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址
     *
     * @param GetContractSignurlRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetContractSignurlResponse
     */
    public function getContractSignurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContractSignurlResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.signurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载.
     *
     * @param DownloadContractDocumentRequest $request
     *
     * @return DownloadContractDocumentResponse
     */
    public function downloadContractDocument($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadContractDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载.
     *
     * @param DownloadContractDocumentRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DownloadContractDocumentResponse
     */
    public function downloadContractDocumentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadContractDocumentResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.document.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档.
     *
     * @param SaveContractFlowRequest $request
     *
     * @return SaveContractFlowResponse
     */
    public function saveContractFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveContractFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档.
     *
     * @param SaveContractFlowRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SaveContractFlowResponse
     */
    public function saveContractFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveContractFlowResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.flow.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询.
     *
     * @param QueryContractFlowRequest $request
     *
     * @return QueryContractFlowResponse
     */
    public function queryContractFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询.
     *
     * @param QueryContractFlowRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryContractFlowResponse
     */
    public function queryContractFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractFlowResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.flow.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情.
     *
     * @param GetContractFileRequest $request
     *
     * @return GetContractFileResponse
     */
    public function getContractFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContractFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情.
     *
     * @param GetContractFileRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetContractFileResponse
     */
    public function getContractFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContractFileResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.file.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过流程ID查询合同存证信息
     * Summary: 查询合同存证信息.
     *
     * @param QueryContractNotaryRequest $request
     *
     * @return QueryContractNotaryResponse
     */
    public function queryContractNotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractNotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过流程ID查询合同存证信息
     * Summary: 查询合同存证信息.
     *
     * @param QueryContractNotaryRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryContractNotaryResponse
     */
    public function queryContractNotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractNotaryResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.notary.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章.
     *
     * @param CreateContractAccountsealimageRequest $request
     *
     * @return CreateContractAccountsealimageResponse
     */
    public function createContractAccountsealimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractAccountsealimageEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章.
     *
     * @param CreateContractAccountsealimageRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CreateContractAccountsealimageResponse
     */
    public function createContractAccountsealimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractAccountsealimageResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.accountsealimage.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
     * Summary: 一步创建签署流程接口.
     *
     * @param CreateContractOnestepflowRequest $request
     *
     * @return CreateContractOnestepflowResponse
     */
    public function createContractOnestepflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractOnestepflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
     * Summary: 一步创建签署流程接口.
     *
     * @param CreateContractOnestepflowRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateContractOnestepflowResponse
     */
    public function createContractOnestepflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractOnestepflowResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.onestepflow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表.
     *
     * @param QueryContractFlowsignerRequest $request
     *
     * @return QueryContractFlowsignerResponse
     */
    public function queryContractFlowsigner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractFlowsignerEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表.
     *
     * @param QueryContractFlowsignerRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryContractFlowsignerResponse
     */
    public function queryContractFlowsignerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractFlowsignerResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.flowsigner.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表.
     *
     * @param QueryContractSignfieldsRequest $request
     *
     * @return QueryContractSignfieldsResponse
     */
    public function queryContractSignfields($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractSignfieldsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表.
     *
     * @param QueryContractSignfieldsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryContractSignfieldsResponse
     */
    public function queryContractSignfieldsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractSignfieldsResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.signfields.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 执行签署人删除逻辑
     * Summary: 删除签署人.
     *
     * @param DeleteContractSignerRequest $request
     *
     * @return DeleteContractSignerResponse
     */
    public function deleteContractSigner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteContractSignerEx($request, $headers, $runtime);
    }

    /**
     * Description: 执行签署人删除逻辑
     * Summary: 删除签署人.
     *
     * @param DeleteContractSignerRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteContractSignerResponse
     */
    public function deleteContractSignerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteContractSignerResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.signer.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ecp同步金融云,内部通道
     * Summary: ecp同步金融云,内部通道.
     *
     * @param SyncEcpCloudRequest $request
     *
     * @return SyncEcpCloudResponse
     */
    public function syncEcpCloud($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncEcpCloudEx($request, $headers, $runtime);
    }

    /**
     * Description: ecp同步金融云,内部通道
     * Summary: ecp同步金融云,内部通道.
     *
     * @param SyncEcpCloudRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return SyncEcpCloudResponse
     */
    public function syncEcpCloudEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncEcpCloudResponse::fromMap($this->doRequest('1.0', 'antchain.acc.ecp.cloud.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生成url跳转登录
     * Summary: 生成url跳转登录.
     *
     * @param CreateOauthUrlRequest $request
     *
     * @return CreateOauthUrlResponse
     */
    public function createOauthUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createOauthUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 生成url跳转登录
     * Summary: 生成url跳转登录.
     *
     * @param CreateOauthUrlRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateOauthUrlResponse
     */
    public function createOauthUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateOauthUrlResponse::fromMap($this->doRequest('1.0', 'antchain.acc.oauth.url.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取token
     * Summary: 获取token.
     *
     * @param GetOauthTokenRequest $request
     *
     * @return GetOauthTokenResponse
     */
    public function getOauthToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getOauthTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取token
     * Summary: 获取token.
     *
     * @param GetOauthTokenRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetOauthTokenResponse
     */
    public function getOauthTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetOauthTokenResponse::fromMap($this->doRequest('1.0', 'antchain.acc.oauth.token.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: token明细获取
     * Summary: token明细获取.
     *
     * @param GetOauthTokendetailRequest $request
     *
     * @return GetOauthTokendetailResponse
     */
    public function getOauthTokendetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getOauthTokendetailEx($request, $headers, $runtime);
    }

    /**
     * Description: token明细获取
     * Summary: token明细获取.
     *
     * @param GetOauthTokendetailRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetOauthTokendetailResponse
     */
    public function getOauthTokendetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetOauthTokendetailResponse::fromMap($this->doRequest('1.0', 'antchain.acc.oauth.tokendetail.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: session判活
     * Summary: session判活.
     *
     * @param CheckSessionAliveRequest $request
     *
     * @return CheckSessionAliveResponse
     */
    public function checkSessionAlive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSessionAliveEx($request, $headers, $runtime);
    }

    /**
     * Description: session判活
     * Summary: session判活.
     *
     * @param CheckSessionAliveRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CheckSessionAliveResponse
     */
    public function checkSessionAliveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSessionAliveResponse::fromMap($this->doRequest('1.0', 'antchain.acc.session.alive.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部合作伙伴异步通知接口
     * Summary: 外部合作伙伴异步通知接口.
     *
     * @param NotifyPartnerAsyncRequest $request
     *
     * @return NotifyPartnerAsyncResponse
     */
    public function notifyPartnerAsync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyPartnerAsyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部合作伙伴异步通知接口
     * Summary: 外部合作伙伴异步通知接口.
     *
     * @param NotifyPartnerAsyncRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return NotifyPartnerAsyncResponse
     */
    public function notifyPartnerAsyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyPartnerAsyncResponse::fromMap($this->doRequest('1.0', 'antchain.acc.partner.async.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一条项目基本信息
     * Summary: 创建一条项目基本信息.
     *
     * @param CreateProjectBaseRequest $request
     *
     * @return CreateProjectBaseResponse
     */
    public function createProjectBase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createProjectBaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一条项目基本信息
     * Summary: 创建一条项目基本信息.
     *
     * @param CreateProjectBaseRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateProjectBaseResponse
     */
    public function createProjectBaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateProjectBaseResponse::fromMap($this->doRequest('1.0', 'antchain.acc.project.base.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量新增农民工基本信息
     * Summary: 批量新增农民工基本信息.
     *
     * @param BatchcreateWorkersBaseRequest $request
     *
     * @return BatchcreateWorkersBaseResponse
     */
    public function batchcreateWorkersBase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateWorkersBaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量新增农民工基本信息
     * Summary: 批量新增农民工基本信息.
     *
     * @param BatchcreateWorkersBaseRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BatchcreateWorkersBaseResponse
     */
    public function batchcreateWorkersBaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateWorkersBaseResponse::fromMap($this->doRequest('1.0', 'antchain.acc.workers.base.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量新增农民工考勤信息
     * Summary: 批量新增农民工考勤信息.
     *
     * @param BatchcreateWorkersAttendanceRequest $request
     *
     * @return BatchcreateWorkersAttendanceResponse
     */
    public function batchcreateWorkersAttendance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateWorkersAttendanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量新增农民工考勤信息
     * Summary: 批量新增农民工考勤信息.
     *
     * @param BatchcreateWorkersAttendanceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchcreateWorkersAttendanceResponse
     */
    public function batchcreateWorkersAttendanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateWorkersAttendanceResponse::fromMap($this->doRequest('1.0', 'antchain.acc.workers.attendance.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量新增农民工工资发放信息
     * Summary: 批量新增农民工工资发放信息.
     *
     * @param BatchcreateWorkersWageRequest $request
     *
     * @return BatchcreateWorkersWageResponse
     */
    public function batchcreateWorkersWage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateWorkersWageEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量新增农民工工资发放信息
     * Summary: 批量新增农民工工资发放信息.
     *
     * @param BatchcreateWorkersWageRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BatchcreateWorkersWageResponse
     */
    public function batchcreateWorkersWageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateWorkersWageResponse::fromMap($this->doRequest('1.0', 'antchain.acc.workers.wage.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一条项目文件信息
     * Summary: 创建一条项目文件信息.
     *
     * @param CreateProjectFileRequest $request
     *
     * @return CreateProjectFileResponse
     */
    public function createProjectFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createProjectFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一条项目文件信息
     * Summary: 创建一条项目文件信息.
     *
     * @param CreateProjectFileRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateProjectFileResponse
     */
    public function createProjectFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateProjectFileResponse::fromMap($this->doRequest('1.0', 'antchain.acc.project.file.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合同基本信息流入
     * Summary: 合同基本信息流入.
     *
     * @param CreateContractBaseRequest $request
     *
     * @return CreateContractBaseResponse
     */
    public function createContractBase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractBaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 合同基本信息流入
     * Summary: 合同基本信息流入.
     *
     * @param CreateContractBaseRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateContractBaseResponse
     */
    public function createContractBaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractBaseResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.base.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合同收付款信息流入
     * Summary: 合同收付款信息流入.
     *
     * @param CreateContractImplRequest $request
     *
     * @return CreateContractImplResponse
     */
    public function createContractImpl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractImplEx($request, $headers, $runtime);
    }

    /**
     * Description: 合同收付款信息流入
     * Summary: 合同收付款信息流入.
     *
     * @param CreateContractImplRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateContractImplResponse
     */
    public function createContractImplEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractImplResponse::fromMap($this->doRequest('1.0', 'antchain.acc.contract.impl.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人认证信息同步
     * Summary: 个人认证信息同步.
     *
     * @param CreateUserCertRequest $request
     *
     * @return CreateUserCertResponse
     */
    public function createUserCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUserCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人认证信息同步
     * Summary: 个人认证信息同步.
     *
     * @param CreateUserCertRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateUserCertResponse
     */
    public function createUserCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUserCertResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.cert.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户信息变更同步
     * Summary: 用户信息变更同步.
     *
     * @param UpdateUserInfoRequest $request
     *
     * @return UpdateUserInfoResponse
     */
    public function updateUserInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateUserInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户信息变更同步
     * Summary: 用户信息变更同步.
     *
     * @param UpdateUserInfoRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateUserInfoResponse
     */
    public function updateUserInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateUserInfoResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.info.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户注册信息同步
     * Summary: 用户注册信息同步.
     *
     * @param CreateUserRegisterRequest $request
     *
     * @return CreateUserRegisterResponse
     */
    public function createUserRegister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUserRegisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户注册信息同步
     * Summary: 用户注册信息同步.
     *
     * @param CreateUserRegisterRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateUserRegisterResponse
     */
    public function createUserRegisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUserRegisterResponse::fromMap($this->doRequest('1.0', 'antchain.acc.user.register.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证信息同步
     * Summary: 企业认证信息同步.
     *
     * @param CreateFirmCertRequest $request
     *
     * @return CreateFirmCertResponse
     */
    public function createFirmCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFirmCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证信息同步
     * Summary: 企业认证信息同步.
     *
     * @param CreateFirmCertRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateFirmCertResponse
     */
    public function createFirmCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFirmCertResponse::fromMap($this->doRequest('1.0', 'antchain.acc.firm.cert.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业信息变更同步
     * Summary: 企业信息变更同步.
     *
     * @param UpdateFirmInfoRequest $request
     *
     * @return UpdateFirmInfoResponse
     */
    public function updateFirmInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateFirmInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业信息变更同步
     * Summary: 企业信息变更同步.
     *
     * @param UpdateFirmInfoRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateFirmInfoResponse
     */
    public function updateFirmInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateFirmInfoResponse::fromMap($this->doRequest('1.0', 'antchain.acc.firm.info.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链上信息
     * Summary: 查询链上信息.
     *
     * @param QueryChainTransactionRequest $request
     *
     * @return QueryChainTransactionResponse
     */
    public function queryChainTransaction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChainTransactionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链上信息
     * Summary: 查询链上信息.
     *
     * @param QueryChainTransactionRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryChainTransactionResponse
     */
    public function queryChainTransactionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChainTransactionResponse::fromMap($this->doRequest('1.0', 'antchain.acc.chain.transaction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
