<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\MYTC\Models\AddCodeDepositRequest;
use AntChain\MYTC\Models\AddCodeDepositResponse;
use AntChain\MYTC\Models\AddCodeRegistrationRequest;
use AntChain\MYTC\Models\AddCodeRegistrationResponse;
use AntChain\MYTC\Models\AddCodeRelationRequest;
use AntChain\MYTC\Models\AddCodeRelationResponse;
use AntChain\MYTC\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\MYTC\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\MYTC\Models\CreateAntiQrcodeimageRequest;
use AntChain\MYTC\Models\CreateAntiQrcodeimageResponse;
use AntChain\MYTC\Models\CreateCodeRegistrationRequest;
use AntChain\MYTC\Models\CreateCodeRegistrationResponse;
use AntChain\MYTC\Models\CreateCodeRelationRequest;
use AntChain\MYTC\Models\CreateCodeRelationResponse;
use AntChain\MYTC\Models\DeleteCodeRegistrationRequest;
use AntChain\MYTC\Models\DeleteCodeRegistrationResponse;
use AntChain\MYTC\Models\DeleteCodeRelationRequest;
use AntChain\MYTC\Models\DeleteCodeRelationResponse;
use AntChain\MYTC\Models\FinishAntiImagesyncRequest;
use AntChain\MYTC\Models\FinishAntiImagesyncResponse;
use AntChain\MYTC\Models\InitAntiImagesyncRequest;
use AntChain\MYTC\Models\InitAntiImagesyncResponse;
use AntChain\MYTC\Models\QueryCodeCertRequest;
use AntChain\MYTC\Models\QueryCodeCertResponse;
use AntChain\MYTC\Models\QueryCodeCombineRequest;
use AntChain\MYTC\Models\QueryCodeCombineResponse;
use AntChain\MYTC\Models\QueryCodeRegistrationRequest;
use AntChain\MYTC\Models\QueryCodeRegistrationResponse;
use AntChain\MYTC\Models\QueryCodeRelationRequest;
use AntChain\MYTC\Models\QueryCodeRelationResponse;
use AntChain\MYTC\Models\QueryCodeStatRequest;
use AntChain\MYTC\Models\QueryCodeStatResponse;
use AntChain\MYTC\Models\QueryMiniCertRequest;
use AntChain\MYTC\Models\QueryMiniCertResponse;
use AntChain\MYTC\Models\QueryMiniCodeRequest;
use AntChain\MYTC\Models\QueryMiniCodeResponse;
use AntChain\MYTC\Models\RecognizeAntiQrcodeacRequest;
use AntChain\MYTC\Models\RecognizeAntiQrcodeacResponse;
use AntChain\MYTC\Models\UpdateCodeRegistrationRequest;
use AntChain\MYTC\Models\UpdateCodeRegistrationResponse;
use AntChain\MYTC\Models\UpdateCodeRelationRequest;
use AntChain\MYTC\Models\UpdateCodeRelationResponse;
use AntChain\MYTC\Models\UploadAntiImagesyncRequest;
use AntChain\MYTC\Models\UploadAntiImagesyncResponse;
use AntChain\MYTC\Models\VerifyMiniNfcRequest;
use AntChain\MYTC\Models\VerifyMiniNfcResponse;
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
            // 上传者信息
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
                    'sdk_version'      => '1.2.5',
                    '_prod_code'       => 'MYTC',
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
     * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
     * Summary: 二维码防伪识别.
     *
     * @param RecognizeAntiQrcodeacRequest $request
     *
     * @return RecognizeAntiQrcodeacResponse
     */
    public function recognizeAntiQrcodeac($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeAntiQrcodeacEx($request, $headers, $runtime);
    }

    /**
     * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
     * Summary: 二维码防伪识别.
     *
     * @param RecognizeAntiQrcodeacRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return RecognizeAntiQrcodeacResponse
     */
    public function recognizeAntiQrcodeacEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.mytc.anti.qrcodeac.recognize',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new RecognizeAntiQrcodeacResponse([
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

        return RecognizeAntiQrcodeacResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.anti.qrcodeac.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 防伪码平台防伪底图上传，初始化上传记录
     * Summary: 防伪码平台防伪底图上传初始化.
     *
     * @param InitAntiImagesyncRequest $request
     *
     * @return InitAntiImagesyncResponse
     */
    public function initAntiImagesync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initAntiImagesyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 防伪码平台防伪底图上传，初始化上传记录
     * Summary: 防伪码平台防伪底图上传初始化.
     *
     * @param InitAntiImagesyncRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return InitAntiImagesyncResponse
     */
    public function initAntiImagesyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitAntiImagesyncResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.anti.imagesync.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 防伪码图片上传
     * Summary: 防伪码平台防伪码图片上传.
     *
     * @param UploadAntiImagesyncRequest $request
     *
     * @return UploadAntiImagesyncResponse
     */
    public function uploadAntiImagesync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadAntiImagesyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 防伪码图片上传
     * Summary: 防伪码平台防伪码图片上传.
     *
     * @param UploadAntiImagesyncRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UploadAntiImagesyncResponse
     */
    public function uploadAntiImagesyncEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.mytc.anti.imagesync.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadAntiImagesyncResponse([
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

        return UploadAntiImagesyncResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.anti.imagesync.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 防伪码平台防伪底图上传完成
     * Summary: 防伪码平台防伪底图上传完成.
     *
     * @param FinishAntiImagesyncRequest $request
     *
     * @return FinishAntiImagesyncResponse
     */
    public function finishAntiImagesync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishAntiImagesyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 防伪码平台防伪底图上传完成
     * Summary: 防伪码平台防伪底图上传完成.
     *
     * @param FinishAntiImagesyncRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return FinishAntiImagesyncResponse
     */
    public function finishAntiImagesyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishAntiImagesyncResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.anti.imagesync.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自研二维码生成
     * Summary: 二维码防伪图片生成.
     *
     * @param CreateAntiQrcodeimageRequest $request
     *
     * @return CreateAntiQrcodeimageResponse
     */
    public function createAntiQrcodeimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntiQrcodeimageEx($request, $headers, $runtime);
    }

    /**
     * Description: 自研二维码生成
     * Summary: 二维码防伪图片生成.
     *
     * @param CreateAntiQrcodeimageRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateAntiQrcodeimageResponse
     */
    public function createAntiQrcodeimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntiQrcodeimageResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.anti.qrcodeimage.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
     * 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
     * Summary: 溯源码注册.
     *
     * @param CreateCodeRegistrationRequest $request
     *
     * @return CreateCodeRegistrationResponse
     */
    public function createCodeRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCodeRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
     * 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
     * Summary: 溯源码注册.
     *
     * @param CreateCodeRegistrationRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateCodeRegistrationResponse
     */
    public function createCodeRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCodeRegistrationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.registration.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
     * Summary: 溯源码注册记录删除.
     *
     * @param DeleteCodeRegistrationRequest $request
     *
     * @return DeleteCodeRegistrationResponse
     */
    public function deleteCodeRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteCodeRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
     * Summary: 溯源码注册记录删除.
     *
     * @param DeleteCodeRegistrationRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteCodeRegistrationResponse
     */
    public function deleteCodeRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteCodeRegistrationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.registration.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将关联信息绑定到溯源码上。
     * 该接口调用存在以下业务维度限制：
     * 1. code + bizLables + bizType做唯一性判断。
     * Summary: 溯源码关联信息.
     *
     * @param CreateCodeRelationRequest $request
     *
     * @return CreateCodeRelationResponse
     */
    public function createCodeRelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCodeRelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 将关联信息绑定到溯源码上。
     * 该接口调用存在以下业务维度限制：
     * 1. code + bizLables + bizType做唯一性判断。
     * Summary: 溯源码关联信息.
     *
     * @param CreateCodeRelationRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateCodeRelationResponse
     */
    public function createCodeRelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCodeRelationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.relation.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
     * 若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
     * Summary: 溯源码关联信息删除.
     *
     * @param DeleteCodeRelationRequest $request
     *
     * @return DeleteCodeRelationResponse
     */
    public function deleteCodeRelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteCodeRelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
     * 若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
     * Summary: 溯源码关联信息删除.
     *
     * @param DeleteCodeRelationRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteCodeRelationResponse
     */
    public function deleteCodeRelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteCodeRelationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.relation.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询当前账户下的溯源码信息。
     * 会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
     * Summary: 溯源码查询.
     *
     * @param QueryCodeCombineRequest $request
     *
     * @return QueryCodeCombineResponse
     */
    public function queryCodeCombine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCodeCombineEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询当前账户下的溯源码信息。
     * 会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
     * Summary: 溯源码查询.
     *
     * @param QueryCodeCombineRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryCodeCombineResponse
     */
    public function queryCodeCombineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCodeCombineResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.combine.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 溯源码注册历史查询
     * Summary: 溯源码注册历史查询.
     *
     * @param QueryCodeRegistrationRequest $request
     *
     * @return QueryCodeRegistrationResponse
     */
    public function queryCodeRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCodeRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 溯源码注册历史查询
     * Summary: 溯源码注册历史查询.
     *
     * @param QueryCodeRegistrationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryCodeRegistrationResponse
     */
    public function queryCodeRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCodeRegistrationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.registration.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 溯源码关联历史信息查询
     * Summary: 溯源码关联历史信息查询.
     *
     * @param QueryCodeRelationRequest $request
     *
     * @return QueryCodeRelationResponse
     */
    public function queryCodeRelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCodeRelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 溯源码关联历史信息查询
     * Summary: 溯源码关联历史信息查询.
     *
     * @param QueryCodeRelationRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryCodeRelationResponse
     */
    public function queryCodeRelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCodeRelationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.relation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
     * 2. 存证内容超过链上限制仅会将存证内容hash值上链。
     * Summary: 原生存证
     *
     * @param AddCodeDepositRequest $request
     *
     * @return AddCodeDepositResponse
     */
    public function addCodeDeposit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCodeDepositEx($request, $headers, $runtime);
    }

    /**
     * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
     * 2. 存证内容超过链上限制仅会将存证内容hash值上链。
     * Summary: 原生存证
     *
     * @param AddCodeDepositRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AddCodeDepositResponse
     */
    public function addCodeDepositEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCodeDepositResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.deposit.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上交易详情查询
     * Summary: 链上交易证书查询.
     *
     * @param QueryCodeCertRequest $request
     *
     * @return QueryCodeCertResponse
     */
    public function queryCodeCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCodeCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上交易详情查询
     * Summary: 链上交易证书查询.
     *
     * @param QueryCodeCertRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryCodeCertResponse
     */
    public function queryCodeCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCodeCertResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.cert.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。
     * 若填写starTime和endTime，统计时间范围不能超过7天。
     * Summary: 溯源统计信息查询.
     *
     * @param QueryCodeStatRequest $request
     *
     * @return QueryCodeStatResponse
     */
    public function queryCodeStat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCodeStatEx($request, $headers, $runtime);
    }

    /**
     * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。
     * 若填写starTime和endTime，统计时间范围不能超过7天。
     * Summary: 溯源统计信息查询.
     *
     * @param QueryCodeStatRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryCodeStatResponse
     */
    public function queryCodeStatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCodeStatResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.stat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
     * Summary: 溯源码(可重复)注册.
     *
     * @param AddCodeRegistrationRequest $request
     *
     * @return AddCodeRegistrationResponse
     */
    public function addCodeRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCodeRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
     * Summary: 溯源码(可重复)注册.
     *
     * @param AddCodeRegistrationRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AddCodeRegistrationResponse
     */
    public function addCodeRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCodeRegistrationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.registration.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新已注册的溯源信息
     * Summary: 溯源注册信息更新.
     *
     * @param UpdateCodeRegistrationRequest $request
     *
     * @return UpdateCodeRegistrationResponse
     */
    public function updateCodeRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCodeRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新已注册的溯源信息
     * Summary: 溯源注册信息更新.
     *
     * @param UpdateCodeRegistrationRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateCodeRegistrationResponse
     */
    public function updateCodeRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCodeRegistrationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.registration.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
     * Summary: 溯源码(可重复)关联信息.
     *
     * @param AddCodeRelationRequest $request
     *
     * @return AddCodeRelationResponse
     */
    public function addCodeRelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCodeRelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
     * Summary: 溯源码(可重复)关联信息.
     *
     * @param AddCodeRelationRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddCodeRelationResponse
     */
    public function addCodeRelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCodeRelationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.relation.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新绑定到溯源码上的关联信息。
     * Summary: 溯源码关联信息更新.
     *
     * @param UpdateCodeRelationRequest $request
     *
     * @return UpdateCodeRelationResponse
     */
    public function updateCodeRelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCodeRelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新绑定到溯源码上的关联信息。
     * Summary: 溯源码关联信息更新.
     *
     * @param UpdateCodeRelationRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateCodeRelationResponse
     */
    public function updateCodeRelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCodeRelationResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.code.relation.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 溯源码详情查询
     * Summary: 溯源码详情查询.
     *
     * @param QueryMiniCodeRequest $request
     *
     * @return QueryMiniCodeResponse
     */
    public function queryMiniCode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMiniCodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 溯源码详情查询
     * Summary: 溯源码详情查询.
     *
     * @param QueryMiniCodeRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryMiniCodeResponse
     */
    public function queryMiniCodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMiniCodeResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.mini.code.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 溯源证书查询
     * Summary: 溯源证书查询.
     *
     * @param QueryMiniCertRequest $request
     *
     * @return QueryMiniCertResponse
     */
    public function queryMiniCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMiniCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 溯源证书查询
     * Summary: 溯源证书查询.
     *
     * @param QueryMiniCertRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryMiniCertResponse
     */
    public function queryMiniCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMiniCertResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.mini.cert.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 动态秘钥NFC二维码校验
     * Summary: 动态秘钥NFC二维码校验.
     *
     * @param VerifyMiniNfcRequest $request
     *
     * @return VerifyMiniNfcResponse
     */
    public function verifyMiniNfc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyMiniNfcEx($request, $headers, $runtime);
    }

    /**
     * Description: 动态秘钥NFC二维码校验
     * Summary: 动态秘钥NFC二维码校验.
     *
     * @param VerifyMiniNfcRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return VerifyMiniNfcResponse
     */
    public function verifyMiniNfcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyMiniNfcResponse::fromMap($this->doRequest('1.0', 'antchain.mytc.mini.nfc.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
