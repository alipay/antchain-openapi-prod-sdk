<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\CAASPLATFORM\Models\BatchqueryGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\BatchqueryGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\CAASPLATFORM\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\CAASPLATFORM\Models\CreateDepositCertificateRequest;
use AntChain\CAASPLATFORM\Models\CreateDepositCertificateResponse;
use AntChain\CAASPLATFORM\Models\CreateDepositCharityRequest;
use AntChain\CAASPLATFORM\Models\CreateDepositCharityResponse;
use AntChain\CAASPLATFORM\Models\CreateDepositRequest;
use AntChain\CAASPLATFORM\Models\CreateDepositResponse;
use AntChain\CAASPLATFORM\Models\CreateDepositSweepstakesRequest;
use AntChain\CAASPLATFORM\Models\CreateDepositSweepstakesResponse;
use AntChain\CAASPLATFORM\Models\CreateExtendRightsRequest;
use AntChain\CAASPLATFORM\Models\CreateExtendRightsResponse;
use AntChain\CAASPLATFORM\Models\DeleteGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\DeleteGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\GetGeneralDepositRequest;
use AntChain\CAASPLATFORM\Models\GetGeneralDepositResponse;
use AntChain\CAASPLATFORM\Models\GetGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\GetGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\GetGeneralRightsbalanceRequest;
use AntChain\CAASPLATFORM\Models\GetGeneralRightsbalanceResponse;
use AntChain\CAASPLATFORM\Models\GetGeneralRightsRequest;
use AntChain\CAASPLATFORM\Models\GetGeneralRightsResponse;
use AntChain\CAASPLATFORM\Models\GetGeneralTicketsRequest;
use AntChain\CAASPLATFORM\Models\GetGeneralTicketsResponse;
use AntChain\CAASPLATFORM\Models\GetGeneralTourismRequest;
use AntChain\CAASPLATFORM\Models\GetGeneralTourismResponse;
use AntChain\CAASPLATFORM\Models\ListGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\ListGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\PayGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\PayGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\PayGeneralRightsRequest;
use AntChain\CAASPLATFORM\Models\PayGeneralRightsResponse;
use AntChain\CAASPLATFORM\Models\PayGeneralTicketsRequest;
use AntChain\CAASPLATFORM\Models\PayGeneralTicketsResponse;
use AntChain\CAASPLATFORM\Models\PayGeneralTourismRequest;
use AntChain\CAASPLATFORM\Models\PayGeneralTourismResponse;
use AntChain\CAASPLATFORM\Models\PullGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\PullGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\QueryDepositCertificateRequest;
use AntChain\CAASPLATFORM\Models\QueryDepositCertificateResponse;
use AntChain\CAASPLATFORM\Models\QueryDepositCharityRequest;
use AntChain\CAASPLATFORM\Models\QueryDepositCharityResponse;
use AntChain\CAASPLATFORM\Models\QueryDepositRequest;
use AntChain\CAASPLATFORM\Models\QueryDepositResponse;
use AntChain\CAASPLATFORM\Models\QueryDepositSweepstakesRequest;
use AntChain\CAASPLATFORM\Models\QueryDepositSweepstakesResponse;
use AntChain\CAASPLATFORM\Models\QueryGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\QueryGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\RegisterGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\RegisterGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\RegisterGeneralRightsRequest;
use AntChain\CAASPLATFORM\Models\RegisterGeneralRightsResponse;
use AntChain\CAASPLATFORM\Models\RegisterGeneralTicketsRequest;
use AntChain\CAASPLATFORM\Models\RegisterGeneralTicketsResponse;
use AntChain\CAASPLATFORM\Models\RegisterGeneralTourismRequest;
use AntChain\CAASPLATFORM\Models\RegisterGeneralTourismResponse;
use AntChain\CAASPLATFORM\Models\SetGeneralDepositRequest;
use AntChain\CAASPLATFORM\Models\SetGeneralDepositResponse;
use AntChain\CAASPLATFORM\Models\SetGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\SetGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\UpdateGeneralDivideRequest;
use AntChain\CAASPLATFORM\Models\UpdateGeneralDivideResponse;
use AntChain\CAASPLATFORM\Models\UploadExtendRightsRequest;
use AntChain\CAASPLATFORM\Models\UploadExtendRightsResponse;
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
            // 分账明细
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
                    'sdk_version'      => '1.4.0',
                    '_prod_code'       => 'CAASPLATFORM',
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
     * Description: 创建存证
     * Summary: 创建存证
     *
     * @param CreateDepositRequest $request
     *
     * @return CreateDepositResponse
     */
    public function createDeposit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDepositEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建存证
     * Summary: 创建存证
     *
     * @param CreateDepositRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateDepositResponse
     */
    public function createDepositEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.caasplatform.deposit.create',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new CreateDepositResponse([
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

        return CreateDepositResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.deposit.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证查询
     * Summary: 存证查询.
     *
     * @param QueryDepositRequest $request
     *
     * @return QueryDepositResponse
     */
    public function queryDeposit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDepositEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证查询
     * Summary: 存证查询.
     *
     * @param QueryDepositRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryDepositResponse
     */
    public function queryDepositEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDepositResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.deposit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 证书存证合约-证书存证查询
     * Summary: 证书存证合约-证书存证查询.
     *
     * @param QueryDepositCertificateRequest $request
     *
     * @return QueryDepositCertificateResponse
     */
    public function queryDepositCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDepositCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 证书存证合约-证书存证查询
     * Summary: 证书存证合约-证书存证查询.
     *
     * @param QueryDepositCertificateRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDepositCertificateResponse
     */
    public function queryDepositCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDepositCertificateResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.deposit.certificate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 证书存证合约-创建证书存证
     * Summary: 证书存证合约-创建证书存证
     *
     * @param CreateDepositCertificateRequest $request
     *
     * @return CreateDepositCertificateResponse
     */
    public function createDepositCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDepositCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 证书存证合约-创建证书存证
     * Summary: 证书存证合约-创建证书存证
     *
     * @param CreateDepositCertificateRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateDepositCertificateResponse
     */
    public function createDepositCertificateEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.caasplatform.deposit.certificate.create',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new CreateDepositCertificateResponse([
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

        return CreateDepositCertificateResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.deposit.certificate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 捐赠合约-捐赠证明查询
     * Summary: 捐赠合约-捐赠证明查询.
     *
     * @param QueryDepositCharityRequest $request
     *
     * @return QueryDepositCharityResponse
     */
    public function queryDepositCharity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDepositCharityEx($request, $headers, $runtime);
    }

    /**
     * Description: 捐赠合约-捐赠证明查询
     * Summary: 捐赠合约-捐赠证明查询.
     *
     * @param QueryDepositCharityRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDepositCharityResponse
     */
    public function queryDepositCharityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDepositCharityResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.deposit.charity.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 捐赠合约-创建捐赠证明
     * Summary: 捐赠合约-创建捐赠证明.
     *
     * @param CreateDepositCharityRequest $request
     *
     * @return CreateDepositCharityResponse
     */
    public function createDepositCharity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDepositCharityEx($request, $headers, $runtime);
    }

    /**
     * Description: 捐赠合约-创建捐赠证明
     * Summary: 捐赠合约-创建捐赠证明.
     *
     * @param CreateDepositCharityRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateDepositCharityResponse
     */
    public function createDepositCharityEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.caasplatform.deposit.charity.create',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new CreateDepositCharityResponse([
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

        return CreateDepositCharityResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.deposit.charity.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 抽奖活动审计合约-中奖记录查询
     * Summary: 抽奖活动审计合约-中奖记录查询.
     *
     * @param QueryDepositSweepstakesRequest $request
     *
     * @return QueryDepositSweepstakesResponse
     */
    public function queryDepositSweepstakes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDepositSweepstakesEx($request, $headers, $runtime);
    }

    /**
     * Description: 抽奖活动审计合约-中奖记录查询
     * Summary: 抽奖活动审计合约-中奖记录查询.
     *
     * @param QueryDepositSweepstakesRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDepositSweepstakesResponse
     */
    public function queryDepositSweepstakesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDepositSweepstakesResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.deposit.sweepstakes.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 抽奖活动审计合约-创建活动记录
     * Summary: 抽奖活动审计合约-创建活动记录.
     *
     * @param CreateDepositSweepstakesRequest $request
     *
     * @return CreateDepositSweepstakesResponse
     */
    public function createDepositSweepstakes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDepositSweepstakesEx($request, $headers, $runtime);
    }

    /**
     * Description: 抽奖活动审计合约-创建活动记录
     * Summary: 抽奖活动审计合约-创建活动记录.
     *
     * @param CreateDepositSweepstakesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateDepositSweepstakesResponse
     */
    public function createDepositSweepstakesEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.caasplatform.deposit.sweepstakes.create',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new CreateDepositSweepstakesResponse([
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

        return CreateDepositSweepstakesResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.deposit.sweepstakes.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用合约调用-结构化存储场景
     * Summary: 通用合约调用-结构化存储场景.
     *
     * @param SetGeneralDepositRequest $request
     *
     * @return SetGeneralDepositResponse
     */
    public function setGeneralDeposit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setGeneralDepositEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用合约调用-结构化存储场景
     * Summary: 通用合约调用-结构化存储场景.
     *
     * @param SetGeneralDepositRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SetGeneralDepositResponse
     */
    public function setGeneralDepositEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetGeneralDepositResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.deposit.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用合约调用-结构化查询场景
     * Summary: 通用合约调用-结构化查询场景.
     *
     * @param GetGeneralDepositRequest $request
     *
     * @return GetGeneralDepositResponse
     */
    public function getGeneralDeposit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGeneralDepositEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用合约调用-结构化查询场景
     * Summary: 通用合约调用-结构化查询场景.
     *
     * @param GetGeneralDepositRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetGeneralDepositResponse
     */
    public function getGeneralDepositEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGeneralDepositResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.deposit.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用合约调用-权益-转赠
     * Summary: 通用合约调用-权益-转赠.
     *
     * @param PayGeneralRightsRequest $request
     *
     * @return PayGeneralRightsResponse
     */
    public function payGeneralRights($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->payGeneralRightsEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用合约调用-权益-转赠
     * Summary: 通用合约调用-权益-转赠.
     *
     * @param PayGeneralRightsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return PayGeneralRightsResponse
     */
    public function payGeneralRightsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PayGeneralRightsResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.rights.pay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源文件托管
     * Summary: 资源文件托管
     *
     * @param UploadExtendRightsRequest $request
     *
     * @return UploadExtendRightsResponse
     */
    public function uploadExtendRights($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadExtendRightsEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源文件托管
     * Summary: 资源文件托管
     *
     * @param UploadExtendRightsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UploadExtendRightsResponse
     */
    public function uploadExtendRightsEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.caasplatform.extend.rights.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadExtendRightsResponse([
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

        return UploadExtendRightsResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.extend.rights.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建链上账户
     * Summary: 创建链上账户.
     *
     * @param CreateExtendRightsRequest $request
     *
     * @return CreateExtendRightsResponse
     */
    public function createExtendRights($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createExtendRightsEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建链上账户
     * Summary: 创建链上账户.
     *
     * @param CreateExtendRightsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateExtendRightsResponse
     */
    public function createExtendRightsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateExtendRightsResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.extend.rights.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用合约调用-权益-铸造
     * Summary: 通用合约调用-权益-铸造.
     *
     * @param RegisterGeneralRightsRequest $request
     *
     * @return RegisterGeneralRightsResponse
     */
    public function registerGeneralRights($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerGeneralRightsEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用合约调用-权益-铸造
     * Summary: 通用合约调用-权益-铸造.
     *
     * @param RegisterGeneralRightsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return RegisterGeneralRightsResponse
     */
    public function registerGeneralRightsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterGeneralRightsResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.rights.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用合约调用-权益-URL查询
     * Summary: 通用合约调用-权益- URL查询.
     *
     * @param GetGeneralRightsRequest $request
     *
     * @return GetGeneralRightsResponse
     */
    public function getGeneralRights($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGeneralRightsEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用合约调用-权益-URL查询
     * Summary: 通用合约调用-权益- URL查询.
     *
     * @param GetGeneralRightsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetGeneralRightsResponse
     */
    public function getGeneralRightsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGeneralRightsResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.rights.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1.分账方最大数量限制50
     * 2.id存在则更新分账方
     * 3.存在分账记录的分账方不能被更新
     * Summary: 分账合约-配置分账方.
     *
     * @param RegisterGeneralDivideRequest $request
     *
     * @return RegisterGeneralDivideResponse
     */
    public function registerGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 1.分账方最大数量限制50
     * 2.id存在则更新分账方
     * 3.存在分账记录的分账方不能被更新
     * Summary: 分账合约-配置分账方.
     *
     * @param RegisterGeneralDivideRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return RegisterGeneralDivideResponse
     */
    public function registerGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分账合约-查询分账方
     * Summary: 分账合约-查询分账方.
     *
     * @param QueryGeneralDivideRequest $request
     *
     * @return QueryGeneralDivideResponse
     */
    public function queryGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账合约-查询分账方
     * Summary: 分账合约-查询分账方.
     *
     * @param QueryGeneralDivideRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryGeneralDivideResponse
     */
    public function queryGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1.分账规则id不能重复配置
     * 2.至少配置一个分账方
     * 3.分账方id需要已存在
     * 4.分账份额保留2位小数,多余部分舍弃
     * 5.分账份额需小于100 且大于0
     * 6.总份额不能大于100
     * Summary: 分账合约-配置分账规则.
     *
     * @param SetGeneralDivideRequest $request
     *
     * @return SetGeneralDivideResponse
     */
    public function setGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 1.分账规则id不能重复配置
     * 2.至少配置一个分账方
     * 3.分账方id需要已存在
     * 4.分账份额保留2位小数,多余部分舍弃
     * 5.分账份额需小于100 且大于0
     * 6.总份额不能大于100
     * Summary: 分账合约-配置分账规则.
     *
     * @param SetGeneralDivideRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SetGeneralDivideResponse
     */
    public function setGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分账合约-查询分账规则
     * Summary: 分账合约-查询分账规则.
     *
     * @param GetGeneralDivideRequest $request
     *
     * @return GetGeneralDivideResponse
     */
    public function getGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账合约-查询分账规则
     * Summary: 分账合约-查询分账规则.
     *
     * @param GetGeneralDivideRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetGeneralDivideResponse
     */
    public function getGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1.分账方id需存在
     * 2.已分账的分账方不能删除
     * 3.已配置分账规则的分账方不能删除
     * Summary: 分账合约-删除分账方.
     *
     * @param DeleteGeneralDivideRequest $request
     *
     * @return DeleteGeneralDivideResponse
     */
    public function deleteGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 1.分账方id需存在
     * 2.已分账的分账方不能删除
     * 3.已配置分账规则的分账方不能删除
     * Summary: 分账合约-删除分账方.
     *
     * @param DeleteGeneralDivideRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteGeneralDivideResponse
     */
    public function deleteGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1.订单id不能重复
     * 2.金额不能小于0，金额保留3位小数多余部分舍弃
     * 3.分账方id需要已存在
     * 4.分账规则id需已存在
     * Summary: 分账合约-发起分账.
     *
     * @param PayGeneralDivideRequest $request
     *
     * @return PayGeneralDivideResponse
     */
    public function payGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->payGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 1.订单id不能重复
     * 2.金额不能小于0，金额保留3位小数多余部分舍弃
     * 3.分账方id需要已存在
     * 4.分账规则id需已存在
     * Summary: 分账合约-发起分账.
     *
     * @param PayGeneralDivideRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return PayGeneralDivideResponse
     */
    public function payGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PayGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.pay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分账合约-获取分账方余额
     * Summary: 分账合约-获取分账方余额.
     *
     * @param PullGeneralDivideRequest $request
     *
     * @return PullGeneralDivideResponse
     */
    public function pullGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账合约-获取分账方余额
     * Summary: 分账合约-获取分账方余额.
     *
     * @param PullGeneralDivideRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PullGeneralDivideResponse
     */
    public function pullGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分账合约-获取订单分账信息
     * Summary: 分账合约-获取订单分账信息.
     *
     * @param BatchqueryGeneralDivideRequest $request
     *
     * @return BatchqueryGeneralDivideResponse
     */
    public function batchqueryGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账合约-获取订单分账信息
     * Summary: 分账合约-获取订单分账信息.
     *
     * @param BatchqueryGeneralDivideRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return BatchqueryGeneralDivideResponse
     */
    public function batchqueryGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旅游文创合约-文创URL查询
     * Summary: 旅游文创合约-文创URL查询.
     *
     * @param GetGeneralTourismRequest $request
     *
     * @return GetGeneralTourismResponse
     */
    public function getGeneralTourism($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGeneralTourismEx($request, $headers, $runtime);
    }

    /**
     * Description: 旅游文创合约-文创URL查询
     * Summary: 旅游文创合约-文创URL查询.
     *
     * @param GetGeneralTourismRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetGeneralTourismResponse
     */
    public function getGeneralTourismEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGeneralTourismResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.tourism.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旅游文创合约-铸造文创
     * Summary: 旅游文创合约-铸造文创.
     *
     * @param RegisterGeneralTourismRequest $request
     *
     * @return RegisterGeneralTourismResponse
     */
    public function registerGeneralTourism($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerGeneralTourismEx($request, $headers, $runtime);
    }

    /**
     * Description: 旅游文创合约-铸造文创
     * Summary: 旅游文创合约-铸造文创.
     *
     * @param RegisterGeneralTourismRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return RegisterGeneralTourismResponse
     */
    public function registerGeneralTourismEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterGeneralTourismResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.tourism.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旅游文创合约-文创转增
     * Summary: 旅游文创合约-文创转增.
     *
     * @param PayGeneralTourismRequest $request
     *
     * @return PayGeneralTourismResponse
     */
    public function payGeneralTourism($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->payGeneralTourismEx($request, $headers, $runtime);
    }

    /**
     * Description: 旅游文创合约-文创转增
     * Summary: 旅游文创合约-文创转增.
     *
     * @param PayGeneralTourismRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PayGeneralTourismResponse
     */
    public function payGeneralTourismEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PayGeneralTourismResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.tourism.pay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 线下门票合约-门票URL查询
     * Summary: 线下门票合约-门票URL查询.
     *
     * @param GetGeneralTicketsRequest $request
     *
     * @return GetGeneralTicketsResponse
     */
    public function getGeneralTickets($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGeneralTicketsEx($request, $headers, $runtime);
    }

    /**
     * Description: 线下门票合约-门票URL查询
     * Summary: 线下门票合约-门票URL查询.
     *
     * @param GetGeneralTicketsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetGeneralTicketsResponse
     */
    public function getGeneralTicketsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGeneralTicketsResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.tickets.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 线下门票合约-铸造线下买票
     * Summary: 线下门票合约-铸造线下买票.
     *
     * @param RegisterGeneralTicketsRequest $request
     *
     * @return RegisterGeneralTicketsResponse
     */
    public function registerGeneralTickets($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerGeneralTicketsEx($request, $headers, $runtime);
    }

    /**
     * Description: 线下门票合约-铸造线下买票
     * Summary: 线下门票合约-铸造线下买票.
     *
     * @param RegisterGeneralTicketsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return RegisterGeneralTicketsResponse
     */
    public function registerGeneralTicketsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterGeneralTicketsResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.tickets.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 线下门票合约-门票转增
     * Summary: 线下门票合约-门票转增.
     *
     * @param PayGeneralTicketsRequest $request
     *
     * @return PayGeneralTicketsResponse
     */
    public function payGeneralTickets($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->payGeneralTicketsEx($request, $headers, $runtime);
    }

    /**
     * Description: 线下门票合约-门票转增
     * Summary: 线下门票合约-门票转增.
     *
     * @param PayGeneralTicketsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PayGeneralTicketsResponse
     */
    public function payGeneralTicketsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PayGeneralTicketsResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.tickets.pay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 进行分账规则的确认
     * Summary: 分账规则确认接口.
     *
     * @param UpdateGeneralDivideRequest $request
     *
     * @return UpdateGeneralDivideResponse
     */
    public function updateGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 进行分账规则的确认
     * Summary: 分账规则确认接口.
     *
     * @param UpdateGeneralDivideRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateGeneralDivideResponse
     */
    public function updateGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定分账方的分账明细数据
     * Summary: 分账明细查询.
     *
     * @param ListGeneralDivideRequest $request
     *
     * @return ListGeneralDivideResponse
     */
    public function listGeneralDivide($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listGeneralDivideEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定分账方的分账明细数据
     * Summary: 分账明细查询.
     *
     * @param ListGeneralDivideRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListGeneralDivideResponse
     */
    public function listGeneralDivideEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListGeneralDivideResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.divide.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询某个账户下拥有的资产数量
     * Summary: 权证资产合约资产查询.
     *
     * @param GetGeneralRightsbalanceRequest $request
     *
     * @return GetGeneralRightsbalanceResponse
     */
    public function getGeneralRightsbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGeneralRightsbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询某个账户下拥有的资产数量
     * Summary: 权证资产合约资产查询.
     *
     * @param GetGeneralRightsbalanceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetGeneralRightsbalanceResponse
     */
    public function getGeneralRightsbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGeneralRightsbalanceResponse::fromMap($this->doRequest('1.0', 'antchain.caasplatform.general.rightsbalance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
