<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DAS\Models\AuthDasAuthresultRequest;
use AntChain\DAS\Models\AuthDasAuthresultResponse;
use AntChain\DAS\Models\AuthDasSmsRequest;
use AntChain\DAS\Models\AuthDasSmsResponse;
use AntChain\DAS\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\DAS\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\DAS\Models\CreateDasDatasourceRequest;
use AntChain\DAS\Models\CreateDasDatasourceResponse;
use AntChain\DAS\Models\DeleteDasDatasourceRequest;
use AntChain\DAS\Models\DeleteDasDatasourceResponse;
use AntChain\DAS\Models\GetDasEnterprisevcRequest;
use AntChain\DAS\Models\GetDasEnterprisevcResponse;
use AntChain\DAS\Models\GetDasIndividualvcRequest;
use AntChain\DAS\Models\GetDasIndividualvcResponse;
use AntChain\DAS\Models\GetDasLinkRequest;
use AntChain\DAS\Models\GetDasLinkResponse;
use AntChain\DAS\Models\QueryDasDatasourceRequest;
use AntChain\DAS\Models\QueryDasDatasourceResponse;
use AntChain\DAS\Models\SendDasSmsRequest;
use AntChain\DAS\Models\SendDasSmsResponse;
use AntChain\DAS\Models\UpdateDasDatasourceRequest;
use AntChain\DAS\Models\UpdateDasDatasourceResponse;
use AntChain\DAS\Models\UploadAuthinstanceFileRequest;
use AntChain\DAS\Models\UploadAuthinstanceFileResponse;
use AntChain\DAS\Models\VerifyDasAuthresultRequest;
use AntChain\DAS\Models\VerifyDasAuthresultResponse;
use AntChain\DAS\Models\VerifyDasEnterpriseRequest;
use AntChain\DAS\Models\VerifyDasEnterpriseResponse;
use AntChain\DAS\Models\VerifyDasIndividualRequest;
use AntChain\DAS\Models\VerifyDasIndividualResponse;
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
            // 数据源接口入参定义
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
                    'sdk_version'      => '1.1.2',
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
     * Description: 获取授权H5页面链接
     * Summary: 获取授权H5页面链接.
     *
     * @param GetDasLinkRequest $request
     *
     * @return GetDasLinkResponse
     */
    public function getDasLink($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDasLinkEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取授权H5页面链接
     * Summary: 获取授权H5页面链接.
     *
     * @param GetDasLinkRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetDasLinkResponse
     */
    public function getDasLinkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDasLinkResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.link.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取授权企业VC
     * Summary: 获取授权企业VC.
     *
     * @param GetDasEnterprisevcRequest $request
     *
     * @return GetDasEnterprisevcResponse
     */
    public function getDasEnterprisevc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDasEnterprisevcEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取授权企业VC
     * Summary: 获取授权企业VC.
     *
     * @param GetDasEnterprisevcRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetDasEnterprisevcResponse
     */
    public function getDasEnterprisevcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDasEnterprisevcResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.enterprisevc.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取个人VC
     * Summary: 获取个人VC.
     *
     * @param GetDasIndividualvcRequest $request
     *
     * @return GetDasIndividualvcResponse
     */
    public function getDasIndividualvc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDasIndividualvcEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取个人VC
     * Summary: 获取个人VC.
     *
     * @param GetDasIndividualvcRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetDasIndividualvcResponse
     */
    public function getDasIndividualvcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDasIndividualvcResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.individualvc.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发送短信验证码
     * Summary: 发送短信验证码
     *
     * @param SendDasSmsRequest $request
     *
     * @return SendDasSmsResponse
     */
    public function sendDasSms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendDasSmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 发送短信验证码
     * Summary: 发送短信验证码
     *
     * @param SendDasSmsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return SendDasSmsResponse
     */
    public function sendDasSmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendDasSmsResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.sms.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过短信验证码授权
     * Summary: 通过短信验证码授权.
     *
     * @param AuthDasSmsRequest $request
     *
     * @return AuthDasSmsResponse
     */
    public function authDasSms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authDasSmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过短信验证码授权
     * Summary: 通过短信验证码授权.
     *
     * @param AuthDasSmsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AuthDasSmsResponse
     */
    public function authDasSmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthDasSmsResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.sms.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
     * Summary: 企业信息核验.
     *
     * @param VerifyDasEnterpriseRequest $request
     *
     * @return VerifyDasEnterpriseResponse
     */
    public function verifyDasEnterprise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyDasEnterpriseEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
     * Summary: 企业信息核验.
     *
     * @param VerifyDasEnterpriseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return VerifyDasEnterpriseResponse
     */
    public function verifyDasEnterpriseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyDasEnterpriseResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.enterprise.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人信息核验
     * Summary: 个人信息核验.
     *
     * @param VerifyDasIndividualRequest $request
     *
     * @return VerifyDasIndividualResponse
     */
    public function verifyDasIndividual($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyDasIndividualEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人信息核验
     * Summary: 个人信息核验.
     *
     * @param VerifyDasIndividualRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return VerifyDasIndividualResponse
     */
    public function verifyDasIndividualEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyDasIndividualResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.individual.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数据源
     * Summary: 创建数据源.
     *
     * @param CreateDasDatasourceRequest $request
     *
     * @return CreateDasDatasourceResponse
     */
    public function createDasDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDasDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数据源
     * Summary: 创建数据源.
     *
     * @param CreateDasDatasourceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateDasDatasourceResponse
     */
    public function createDasDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDasDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.datasource.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新数据源
     * Summary: 更新数据源.
     *
     * @param UpdateDasDatasourceRequest $request
     *
     * @return UpdateDasDatasourceResponse
     */
    public function updateDasDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDasDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新数据源
     * Summary: 更新数据源.
     *
     * @param UpdateDasDatasourceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateDasDatasourceResponse
     */
    public function updateDasDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDasDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.datasource.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除数据源
     * Summary: 删除数据源.
     *
     * @param DeleteDasDatasourceRequest $request
     *
     * @return DeleteDasDatasourceResponse
     */
    public function deleteDasDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDasDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除数据源
     * Summary: 删除数据源.
     *
     * @param DeleteDasDatasourceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteDasDatasourceResponse
     */
    public function deleteDasDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDasDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.datasource.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据源信息
     * Summary: 查询数据源信息.
     *
     * @param QueryDasDatasourceRequest $request
     *
     * @return QueryDasDatasourceResponse
     */
    public function queryDasDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDasDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据源信息
     * Summary: 查询数据源信息.
     *
     * @param QueryDasDatasourceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryDasDatasourceResponse
     */
    public function queryDasDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDasDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.datasource.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验授权结果
     * Summary: 校验授权结果.
     *
     * @param VerifyDasAuthresultRequest $request
     *
     * @return VerifyDasAuthresultResponse
     */
    public function verifyDasAuthresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyDasAuthresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验授权结果
     * Summary: 校验授权结果.
     *
     * @param VerifyDasAuthresultRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return VerifyDasAuthresultResponse
     */
    public function verifyDasAuthresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyDasAuthresultResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.authresult.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据授权三方信息做授权
     * Summary: 根据授权三方信息做授权.
     *
     * @param AuthDasAuthresultRequest $request
     *
     * @return AuthDasAuthresultResponse
     */
    public function authDasAuthresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authDasAuthresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据授权三方信息做授权
     * Summary: 根据授权三方信息做授权.
     *
     * @param AuthDasAuthresultRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AuthDasAuthresultResponse
     */
    public function authDasAuthresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthDasAuthresultResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.authresult.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权协议上传
     * Summary: 授权协议上传.
     *
     * @param UploadAuthinstanceFileRequest $request
     *
     * @return UploadAuthinstanceFileResponse
     */
    public function uploadAuthinstanceFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAuthinstanceFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权协议上传
     * Summary: 授权协议上传.
     *
     * @param UploadAuthinstanceFileRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UploadAuthinstanceFileResponse
     */
    public function uploadAuthinstanceFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.das.authinstance.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadAuthinstanceFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return UploadAuthinstanceFileResponse::fromMap($this->doRequest('1.0', 'antchain.das.authinstance.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
