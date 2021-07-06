<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BAASPLUS\Models\AddBmpbrowserPrivilegeRequest;
use AntChain\BAASPLUS\Models\AddBmpbrowserPrivilegeResponse;
use AntChain\BAASPLUS\Models\AddIotcseAccountRequest;
use AntChain\BAASPLUS\Models\AddIotcseAccountResponse;
use AntChain\BAASPLUS\Models\AddIotcseThingsdidRequest;
use AntChain\BAASPLUS\Models\AddIotcseThingsdidResponse;
use AntChain\BAASPLUS\Models\CancelBmpbrowserPrivilegeRequest;
use AntChain\BAASPLUS\Models\CancelBmpbrowserPrivilegeResponse;
use AntChain\BAASPLUS\Models\CertifyEnterpriseidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\CertifyEnterpriseidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\CertifyEnterpriseidFaceauthRequest;
use AntChain\BAASPLUS\Models\CertifyEnterpriseidFaceauthResponse;
use AntChain\BAASPLUS\Models\CertifyIndividualidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\CertifyIndividualidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\CertifyIndividualidFaceauthRequest;
use AntChain\BAASPLUS\Models\CertifyIndividualidFaceauthResponse;
use AntChain\BAASPLUS\Models\CreateBaicorpInternalevaluationasyncRequest;
use AntChain\BAASPLUS\Models\CreateBaicorpInternalevaluationasyncResponse;
use AntChain\BAASPLUS\Models\CreateBaicorpInternalmonitorasyncRequest;
use AntChain\BAASPLUS\Models\CreateBaicorpInternalmonitorasyncResponse;
use AntChain\BAASPLUS\Models\CreateDidCorporatedidagentRequest;
use AntChain\BAASPLUS\Models\CreateDidCorporatedidagentResponse;
use AntChain\BAASPLUS\Models\ExecIotcseGroupRequest;
use AntChain\BAASPLUS\Models\ExecIotcseGroupResponse;
use AntChain\BAASPLUS\Models\GetDataserviceBlockchainheightRequest;
use AntChain\BAASPLUS\Models\GetDataserviceBlockchainheightResponse;
use AntChain\BAASPLUS\Models\GetDataserviceTransactioncountRequest;
use AntChain\BAASPLUS\Models\GetDataserviceTransactioncountResponse;
use AntChain\BAASPLUS\Models\GetDataserviceTransactioninfoRequest;
use AntChain\BAASPLUS\Models\GetDataserviceTransactioninfoResponse;
use AntChain\BAASPLUS\Models\GetTasAttestationRequest;
use AntChain\BAASPLUS\Models\GetTasAttestationResponse;
use AntChain\BAASPLUS\Models\GetTasCertificateRequest;
use AntChain\BAASPLUS\Models\GetTasCertificateResponse;
use AntChain\BAASPLUS\Models\GetTasTransactionattestationRequest;
use AntChain\BAASPLUS\Models\GetTasTransactionattestationResponse;
use AntChain\BAASPLUS\Models\InitCaCertificateRequest;
use AntChain\BAASPLUS\Models\InitCaCertificateResponse;
use AntChain\BAASPLUS\Models\InitContentriskInternalRequest;
use AntChain\BAASPLUS\Models\InitContentriskInternalResponse;
use AntChain\BAASPLUS\Models\InitEnterpriseidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\InitEnterpriseidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\InitEnterpriseidFaceauthRequest;
use AntChain\BAASPLUS\Models\InitEnterpriseidFaceauthResponse;
use AntChain\BAASPLUS\Models\InitEpayauthVerifyRequest;
use AntChain\BAASPLUS\Models\InitEpayauthVerifyResponse;
use AntChain\BAASPLUS\Models\InitIndividualidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\InitIndividualidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\InitIndividualidFaceauthRequest;
use AntChain\BAASPLUS\Models\InitIndividualidFaceauthResponse;
use AntChain\BAASPLUS\Models\InitIndividualidImageauthRequest;
use AntChain\BAASPLUS\Models\InitIndividualidImageauthResponse;
use AntChain\BAASPLUS\Models\ListDataserviceLastblocksRequest;
use AntChain\BAASPLUS\Models\ListDataserviceLastblocksResponse;
use AntChain\BAASPLUS\Models\QueryBaicorpInternalevaluationasyncRequest;
use AntChain\BAASPLUS\Models\QueryBaicorpInternalevaluationasyncResponse;
use AntChain\BAASPLUS\Models\QueryBaicorpInternalmonitorasyncRequest;
use AntChain\BAASPLUS\Models\QueryBaicorpInternalmonitorasyncResponse;
use AntChain\BAASPLUS\Models\QueryBaicorpInternalsearchlibraryRequest;
use AntChain\BAASPLUS\Models\QueryBaicorpInternalsearchlibraryResponse;
use AntChain\BAASPLUS\Models\QueryBlocrBusinesslicenseRequest;
use AntChain\BAASPLUS\Models\QueryBlocrBusinesslicenseResponse;
use AntChain\BAASPLUS\Models\QueryBmpbrowserPrivilegeRequest;
use AntChain\BAASPLUS\Models\QueryBmpbrowserPrivilegeResponse;
use AntChain\BAASPLUS\Models\QueryBmpbrowserTransactionqrcodeRequest;
use AntChain\BAASPLUS\Models\QueryBmpbrowserTransactionqrcodeResponse;
use AntChain\BAASPLUS\Models\QueryContentriskInternalRequest;
use AntChain\BAASPLUS\Models\QueryContentriskInternalResponse;
use AntChain\BAASPLUS\Models\QueryEnterpriseidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\QueryEnterpriseidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\QueryEnterpriseidFaceauthRequest;
use AntChain\BAASPLUS\Models\QueryEnterpriseidFaceauthResponse;
use AntChain\BAASPLUS\Models\QueryEnterpriseidInternalfourmetaRequest;
use AntChain\BAASPLUS\Models\QueryEnterpriseidInternalfourmetaResponse;
use AntChain\BAASPLUS\Models\QueryEnterpriseidInternalthreemetaRequest;
use AntChain\BAASPLUS\Models\QueryEnterpriseidInternalthreemetaResponse;
use AntChain\BAASPLUS\Models\QueryEnterpriseidInternaltwometaRequest;
use AntChain\BAASPLUS\Models\QueryEnterpriseidInternaltwometaResponse;
use AntChain\BAASPLUS\Models\QueryEpayauthBranchbankRequest;
use AntChain\BAASPLUS\Models\QueryEpayauthBranchbankResponse;
use AntChain\BAASPLUS\Models\QueryEpayauthDistrictRequest;
use AntChain\BAASPLUS\Models\QueryEpayauthDistrictResponse;
use AntChain\BAASPLUS\Models\QueryEpayauthRootbankRequest;
use AntChain\BAASPLUS\Models\QueryEpayauthRootbankResponse;
use AntChain\BAASPLUS\Models\QueryEpayauthVerifyRequest;
use AntChain\BAASPLUS\Models\QueryEpayauthVerifyResponse;
use AntChain\BAASPLUS\Models\QueryEverifyFourmetainternalRequest;
use AntChain\BAASPLUS\Models\QueryEverifyFourmetainternalResponse;
use AntChain\BAASPLUS\Models\QueryEverifyFourmetaRequest;
use AntChain\BAASPLUS\Models\QueryEverifyFourmetaResponse;
use AntChain\BAASPLUS\Models\QueryEverifyThreemetainternalRequest;
use AntChain\BAASPLUS\Models\QueryEverifyThreemetainternalResponse;
use AntChain\BAASPLUS\Models\QueryEverifyThreemetaRequest;
use AntChain\BAASPLUS\Models\QueryEverifyThreemetaResponse;
use AntChain\BAASPLUS\Models\QueryEverifyTwometainternalRequest;
use AntChain\BAASPLUS\Models\QueryEverifyTwometainternalResponse;
use AntChain\BAASPLUS\Models\QueryEverifyTwometaRequest;
use AntChain\BAASPLUS\Models\QueryEverifyTwometaResponse;
use AntChain\BAASPLUS\Models\QueryIdcocrIdcardRequest;
use AntChain\BAASPLUS\Models\QueryIdcocrIdcardResponse;
use AntChain\BAASPLUS\Models\QueryIndividualidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\QueryIndividualidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\QueryIndividualidFaceauthRequest;
use AntChain\BAASPLUS\Models\QueryIndividualidFaceauthResponse;
use AntChain\BAASPLUS\Models\QueryIndividualidInternalfourmetaRequest;
use AntChain\BAASPLUS\Models\QueryIndividualidInternalfourmetaResponse;
use AntChain\BAASPLUS\Models\QueryIndividualidInternalmaskRequest;
use AntChain\BAASPLUS\Models\QueryIndividualidInternalmaskResponse;
use AntChain\BAASPLUS\Models\QueryIndividualidInternalthreemetaRequest;
use AntChain\BAASPLUS\Models\QueryIndividualidInternalthreemetaResponse;
use AntChain\BAASPLUS\Models\QueryIndividualidInternaltwometaRequest;
use AntChain\BAASPLUS\Models\QueryIndividualidInternaltwometaResponse;
use AntChain\BAASPLUS\Models\QueryInvoicesocrVatinvoiceRequest;
use AntChain\BAASPLUS\Models\QueryInvoicesocrVatinvoiceResponse;
use AntChain\BAASPLUS\Models\QueryIotcseAsyncprocessRequest;
use AntChain\BAASPLUS\Models\QueryIotcseAsyncprocessResponse;
use AntChain\BAASPLUS\Models\QueryIotcseDevicegroupRequest;
use AntChain\BAASPLUS\Models\QueryIotcseDevicegroupResponse;
use AntChain\BAASPLUS\Models\QueryIotcseDevicemodelRequest;
use AntChain\BAASPLUS\Models\QueryIotcseDevicemodelResponse;
use AntChain\BAASPLUS\Models\QueryIotcseEvidencebatchRequest;
use AntChain\BAASPLUS\Models\QueryIotcseEvidencebatchResponse;
use AntChain\BAASPLUS\Models\QueryIotcseEvidenceRequest;
use AntChain\BAASPLUS\Models\QueryIotcseEvidenceResponse;
use AntChain\BAASPLUS\Models\QueryIotcseGroupdeviceRequest;
use AntChain\BAASPLUS\Models\QueryIotcseGroupdeviceResponse;
use AntChain\BAASPLUS\Models\QueryIotcseTenantdeviceRequest;
use AntChain\BAASPLUS\Models\QueryIotcseTenantdeviceResponse;
use AntChain\BAASPLUS\Models\QueryIotcseThingsdidRequest;
use AntChain\BAASPLUS\Models\QueryIotcseThingsdidResponse;
use AntChain\BAASPLUS\Models\QueryYdapplyprotEcapplyRequest;
use AntChain\BAASPLUS\Models\QueryYdapplyprotEcapplyResponse;
use AntChain\BAASPLUS\Models\QueryYdauthprotFourmetaRequest;
use AntChain\BAASPLUS\Models\QueryYdauthprotFourmetaResponse;
use AntChain\BAASPLUS\Models\QueryYdauthprotThreemetaRequest;
use AntChain\BAASPLUS\Models\QueryYdauthprotThreemetaResponse;
use AntChain\BAASPLUS\Models\QueryYdauthprotTwometaRequest;
use AntChain\BAASPLUS\Models\QueryYdauthprotTwometaResponse;
use AntChain\BAASPLUS\Models\QueryYdmktprotEcmarketcampaignRequest;
use AntChain\BAASPLUS\Models\QueryYdmktprotEcmarketcampaignResponse;
use AntChain\BAASPLUS\Models\QueryYdpacprotEcpacRequest;
use AntChain\BAASPLUS\Models\QueryYdpacprotEcpacResponse;
use AntChain\BAASPLUS\Models\QueryYdregprotEcregisterRequest;
use AntChain\BAASPLUS\Models\QueryYdregprotEcregisterResponse;
use AntChain\BAASPLUS\Models\SaveIotcseEvidenceRequest;
use AntChain\BAASPLUS\Models\SaveIotcseEvidenceResponse;
use AntChain\BAASPLUS\Models\UpdateBaicorpInternalsearchlibraryRequest;
use AntChain\BAASPLUS\Models\UpdateBaicorpInternalsearchlibraryResponse;
use AntChain\BAASPLUS\Models\UpdateBmpbrowserPrivilegeRequest;
use AntChain\BAASPLUS\Models\UpdateBmpbrowserPrivilegeResponse;
use AntChain\BAASPLUS\Models\UpdateIotcseDevicespaceRequest;
use AntChain\BAASPLUS\Models\UpdateIotcseDevicespaceResponse;
use AntChain\BAASPLUS\Models\UpdateIotcseDevicestatusRequest;
use AntChain\BAASPLUS\Models\UpdateIotcseDevicestatusResponse;
use AntChain\BAASPLUS\Models\UpdateIotcseThingsdidRequest;
use AntChain\BAASPLUS\Models\UpdateIotcseThingsdidResponse;
use AntChain\BAASPLUS\Models\VerifyTasCtsrRequest;
use AntChain\BAASPLUS\Models\VerifyTasCtsrResponse;
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
            // 区块信息
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
     * Description: 链上交易移动端权限修改
     * Summary: 链上交易移动端权限修改.
     *
     * @param UpdateBmpbrowserPrivilegeRequest $request
     *
     * @return UpdateBmpbrowserPrivilegeResponse
     */
    public function updateBmpbrowserPrivilege($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBmpbrowserPrivilegeEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上交易移动端权限修改
     * Summary: 链上交易移动端权限修改.
     *
     * @param UpdateBmpbrowserPrivilegeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateBmpbrowserPrivilegeResponse
     */
    public function updateBmpbrowserPrivilegeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBmpbrowserPrivilegeResponse::fromMap($this->doRequest('1.0', 'baas.plus.bmpbrowser.privilege.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
     * Summary: 个人脱敏信息身份核验（数据来自蚁盾）.
     *
     * @param QueryIndividualidInternalmaskRequest $request
     *
     * @return QueryIndividualidInternalmaskResponse
     */
    public function queryIndividualidInternalmask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndividualidInternalmaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
     * Summary: 个人脱敏信息身份核验（数据来自蚁盾）.
     *
     * @param QueryIndividualidInternalmaskRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryIndividualidInternalmaskResponse
     */
    public function queryIndividualidInternalmaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndividualidInternalmaskResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.internalmask.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素（数据来自数据枢纽）.
     *
     * @param QueryEnterpriseidInternalfourmetaRequest $request
     *
     * @return QueryEnterpriseidInternalfourmetaResponse
     */
    public function queryEnterpriseidInternalfourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEnterpriseidInternalfourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素（数据来自数据枢纽）.
     *
     * @param QueryEnterpriseidInternalfourmetaRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryEnterpriseidInternalfourmetaResponse
     */
    public function queryEnterpriseidInternalfourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEnterpriseidInternalfourmetaResponse::fromMap($this->doRequest('1.0', 'baas.plus.enterpriseid.internalfourmeta.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素（数据来自数据枢纽）.
     *
     * @param QueryEnterpriseidInternalthreemetaRequest $request
     *
     * @return QueryEnterpriseidInternalthreemetaResponse
     */
    public function queryEnterpriseidInternalthreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEnterpriseidInternalthreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素（数据来自数据枢纽）.
     *
     * @param QueryEnterpriseidInternalthreemetaRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryEnterpriseidInternalthreemetaResponse
     */
    public function queryEnterpriseidInternalthreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEnterpriseidInternalthreemetaResponse::fromMap($this->doRequest('1.0', 'baas.plus.enterpriseid.internalthreemeta.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素（数据来自数据枢纽）.
     *
     * @param QueryEnterpriseidInternaltwometaRequest $request
     *
     * @return QueryEnterpriseidInternaltwometaResponse
     */
    public function queryEnterpriseidInternaltwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEnterpriseidInternaltwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素（数据来自数据枢纽）.
     *
     * @param QueryEnterpriseidInternaltwometaRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryEnterpriseidInternaltwometaResponse
     */
    public function queryEnterpriseidInternaltwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEnterpriseidInternaltwometaResponse::fromMap($this->doRequest('1.0', 'baas.plus.enterpriseid.internaltwometa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化.
     *
     * @param InitEnterpriseidFaceauthRequest $request
     *
     * @return InitEnterpriseidFaceauthResponse
     */
    public function initEnterpriseidFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initEnterpriseidFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化.
     *
     * @param InitEnterpriseidFaceauthRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return InitEnterpriseidFaceauthResponse
     */
    public function initEnterpriseidFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitEnterpriseidFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.plus.enterpriseid.faceauth.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果.
     *
     * @param QueryEnterpriseidFaceauthRequest $request
     *
     * @return QueryEnterpriseidFaceauthResponse
     */
    public function queryEnterpriseidFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEnterpriseidFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果.
     *
     * @param QueryEnterpriseidFaceauthRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryEnterpriseidFaceauthResponse
     */
    public function queryEnterpriseidFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEnterpriseidFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.plus.enterpriseid.faceauth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实名认证四要素
     * Summary: 个人实名认证四要素（数据来自蚁盾）.
     *
     * @param QueryIndividualidInternalfourmetaRequest $request
     *
     * @return QueryIndividualidInternalfourmetaResponse
     */
    public function queryIndividualidInternalfourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndividualidInternalfourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实名认证四要素
     * Summary: 个人实名认证四要素（数据来自蚁盾）.
     *
     * @param QueryIndividualidInternalfourmetaRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryIndividualidInternalfourmetaResponse
     */
    public function queryIndividualidInternalfourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndividualidInternalfourmetaResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.internalfourmeta.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实名认证三要素
     * Summary: 个人实名认证三要素（数据来自蚁盾）.
     *
     * @param QueryIndividualidInternalthreemetaRequest $request
     *
     * @return QueryIndividualidInternalthreemetaResponse
     */
    public function queryIndividualidInternalthreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndividualidInternalthreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实名认证三要素
     * Summary: 个人实名认证三要素（数据来自蚁盾）.
     *
     * @param QueryIndividualidInternalthreemetaRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryIndividualidInternalthreemetaResponse
     */
    public function queryIndividualidInternalthreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndividualidInternalthreemetaResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.internalthreemeta.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实名认证二要素
     * Summary: 个人实名认证二要素.
     *
     * @param QueryIndividualidInternaltwometaRequest $request
     *
     * @return QueryIndividualidInternaltwometaResponse
     */
    public function queryIndividualidInternaltwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndividualidInternaltwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实名认证二要素
     * Summary: 个人实名认证二要素.
     *
     * @param QueryIndividualidInternaltwometaRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryIndividualidInternaltwometaResponse
     */
    public function queryIndividualidInternaltwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndividualidInternaltwometaResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.internaltwometa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起内容评估（BAI），仅内部调用
     * Summary: 发起内容评估.
     *
     * @param CreateBaicorpInternalevaluationasyncRequest $request
     *
     * @return CreateBaicorpInternalevaluationasyncResponse
     */
    public function createBaicorpInternalevaluationasync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaicorpInternalevaluationasyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起内容评估（BAI），仅内部调用
     * Summary: 发起内容评估.
     *
     * @param CreateBaicorpInternalevaluationasyncRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return CreateBaicorpInternalevaluationasyncResponse
     */
    public function createBaicorpInternalevaluationasyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaicorpInternalevaluationasyncResponse::fromMap($this->doRequest('1.0', 'baas.plus.baicorp.internalevaluationasync.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交内容监测任务
     * Summary: 提交内容监测任务接口.
     *
     * @param CreateBaicorpInternalmonitorasyncRequest $request
     *
     * @return CreateBaicorpInternalmonitorasyncResponse
     */
    public function createBaicorpInternalmonitorasync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaicorpInternalmonitorasyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交内容监测任务
     * Summary: 提交内容监测任务接口.
     *
     * @param CreateBaicorpInternalmonitorasyncRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return CreateBaicorpInternalmonitorasyncResponse
     */
    public function createBaicorpInternalmonitorasyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaicorpInternalmonitorasyncResponse::fromMap($this->doRequest('1.0', 'baas.plus.baicorp.internalmonitorasync.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询内容评估结果
     * Summary: 查询内容评估结果.
     *
     * @param QueryBaicorpInternalevaluationasyncRequest $request
     *
     * @return QueryBaicorpInternalevaluationasyncResponse
     */
    public function queryBaicorpInternalevaluationasync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaicorpInternalevaluationasyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询内容评估结果
     * Summary: 查询内容评估结果.
     *
     * @param QueryBaicorpInternalevaluationasyncRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryBaicorpInternalevaluationasyncResponse
     */
    public function queryBaicorpInternalevaluationasyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaicorpInternalevaluationasyncResponse::fromMap($this->doRequest('1.0', 'baas.plus.baicorp.internalevaluationasync.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询内容监测任务结果
     * Summary: 查询内容监测任务结果.
     *
     * @param QueryBaicorpInternalmonitorasyncRequest $request
     *
     * @return QueryBaicorpInternalmonitorasyncResponse
     */
    public function queryBaicorpInternalmonitorasync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaicorpInternalmonitorasyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询内容监测任务结果
     * Summary: 查询内容监测任务结果.
     *
     * @param QueryBaicorpInternalmonitorasyncRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryBaicorpInternalmonitorasyncResponse
     */
    public function queryBaicorpInternalmonitorasyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaicorpInternalmonitorasyncResponse::fromMap($this->doRequest('1.0', 'baas.plus.baicorp.internalmonitorasync.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始.
     *
     * @param CertifyEnterpriseidFaceauthRequest $request
     *
     * @return CertifyEnterpriseidFaceauthResponse
     */
    public function certifyEnterpriseidFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyEnterpriseidFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始.
     *
     * @param CertifyEnterpriseidFaceauthRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CertifyEnterpriseidFaceauthResponse
     */
    public function certifyEnterpriseidFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyEnterpriseidFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.plus.enterpriseid.faceauth.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证——认证初始化
     * Summary: 个人实人刷脸认证-认证初始化.
     *
     * @param InitIndividualidFaceauthRequest $request
     *
     * @return InitIndividualidFaceauthResponse
     */
    public function initIndividualidFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initIndividualidFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证——认证初始化
     * Summary: 个人实人刷脸认证-认证初始化.
     *
     * @param InitIndividualidFaceauthRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return InitIndividualidFaceauthResponse
     */
    public function initIndividualidFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitIndividualidFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.faceauth.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证——认证开始
     * Summary: 个人实人刷脸认证-认证开始.
     *
     * @param CertifyIndividualidFaceauthRequest $request
     *
     * @return CertifyIndividualidFaceauthResponse
     */
    public function certifyIndividualidFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyIndividualidFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证——认证开始
     * Summary: 个人实人刷脸认证-认证开始.
     *
     * @param CertifyIndividualidFaceauthRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CertifyIndividualidFaceauthResponse
     */
    public function certifyIndividualidFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyIndividualidFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.faceauth.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证——查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果.
     *
     * @param QueryIndividualidFaceauthRequest $request
     *
     * @return QueryIndividualidFaceauthResponse
     */
    public function queryIndividualidFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndividualidFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证——查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果.
     *
     * @param QueryIndividualidFaceauthRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryIndividualidFaceauthResponse
     */
    public function queryIndividualidFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndividualidFaceauthResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.faceauth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取区块链当前块高
     * Summary: 区块链数据服务-获取区块链当前块高.
     *
     * @param GetDataserviceBlockchainheightRequest $request
     *
     * @return GetDataserviceBlockchainheightResponse
     */
    public function getDataserviceBlockchainheight($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDataserviceBlockchainheightEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取区块链当前块高
     * Summary: 区块链数据服务-获取区块链当前块高.
     *
     * @param GetDataserviceBlockchainheightRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return GetDataserviceBlockchainheightResponse
     */
    public function getDataserviceBlockchainheightEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDataserviceBlockchainheightResponse::fromMap($this->doRequest('1.0', 'baas.plus.dataservice.blockchainheight.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取链交易总数
     * Summary: 区块链数据服务-获取链交易总数.
     *
     * @param GetDataserviceTransactioncountRequest $request
     *
     * @return GetDataserviceTransactioncountResponse
     */
    public function getDataserviceTransactioncount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDataserviceTransactioncountEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取链交易总数
     * Summary: 区块链数据服务-获取链交易总数.
     *
     * @param GetDataserviceTransactioncountRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return GetDataserviceTransactioncountResponse
     */
    public function getDataserviceTransactioncountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDataserviceTransactioncountResponse::fromMap($this->doRequest('1.0', 'baas.plus.dataservice.transactioncount.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据交易hash获取交易详情
     * Summary: 区块链数据服务-获取交易详情.
     *
     * @param GetDataserviceTransactioninfoRequest $request
     *
     * @return GetDataserviceTransactioninfoResponse
     */
    public function getDataserviceTransactioninfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDataserviceTransactioninfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据交易hash获取交易详情
     * Summary: 区块链数据服务-获取交易详情.
     *
     * @param GetDataserviceTransactioninfoRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return GetDataserviceTransactioninfoResponse
     */
    public function getDataserviceTransactioninfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDataserviceTransactioninfoResponse::fromMap($this->doRequest('1.0', 'baas.plus.dataservice.transactioninfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取链最近n条块信息
     * Summary: 区块链数据服务-获取链最近n条块信息.
     *
     * @param ListDataserviceLastblocksRequest $request
     *
     * @return ListDataserviceLastblocksResponse
     */
    public function listDataserviceLastblocks($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDataserviceLastblocksEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取链最近n条块信息
     * Summary: 区块链数据服务-获取链最近n条块信息.
     *
     * @param ListDataserviceLastblocksRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListDataserviceLastblocksResponse
     */
    public function listDataserviceLastblocksEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDataserviceLastblocksResponse::fromMap($this->doRequest('1.0', 'baas.plus.dataservice.lastblocks.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信时间服务——获取时间凭证
     * Summary: 可信时间凭证服务-获取时间凭证
     *
     * @param GetTasAttestationRequest $request
     *
     * @return GetTasAttestationResponse
     */
    public function getTasAttestation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTasAttestationEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信时间服务——获取时间凭证
     * Summary: 可信时间凭证服务-获取时间凭证
     *
     * @param GetTasAttestationRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetTasAttestationResponse
     */
    public function getTasAttestationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTasAttestationResponse::fromMap($this->doRequest('1.0', 'baas.plus.tas.attestation.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信时间 ——校验时间凭证接口
     * Summary: 可信时间凭证服务-校验时间凭证接口.
     *
     * @param VerifyTasCtsrRequest $request
     *
     * @return VerifyTasCtsrResponse
     */
    public function verifyTasCtsr($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyTasCtsrEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信时间 ——校验时间凭证接口
     * Summary: 可信时间凭证服务-校验时间凭证接口.
     *
     * @param VerifyTasCtsrRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return VerifyTasCtsrResponse
     */
    public function verifyTasCtsrEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyTasCtsrResponse::fromMap($this->doRequest('1.0', 'baas.plus.tas.ctsr.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过sn下载时间凭证证书（pdf格式）
     * Summary: 可信时间凭证服务-下载时间凭证证书.
     *
     * @param GetTasCertificateRequest $request
     *
     * @return GetTasCertificateResponse
     */
    public function getTasCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTasCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过sn下载时间凭证证书（pdf格式）
     * Summary: 可信时间凭证服务-下载时间凭证证书.
     *
     * @param GetTasCertificateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetTasCertificateResponse
     */
    public function getTasCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTasCertificateResponse::fromMap($this->doRequest('1.0', 'baas.plus.tas.certificate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信时间——获取带事务的时间凭证
     * Summary: 可信时间——获取带事务的时间凭证
     *
     * @param GetTasTransactionattestationRequest $request
     *
     * @return GetTasTransactionattestationResponse
     */
    public function getTasTransactionattestation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTasTransactionattestationEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信时间——获取带事务的时间凭证
     * Summary: 可信时间——获取带事务的时间凭证
     *
     * @param GetTasTransactionattestationRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return GetTasTransactionattestationResponse
     */
    public function getTasTransactionattestationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTasTransactionattestationResponse::fromMap($this->doRequest('1.0', 'baas.plus.tas.transactionattestation.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素.
     *
     * @param QueryEverifyFourmetaRequest $request
     *
     * @return QueryEverifyFourmetaResponse
     */
    public function queryEverifyFourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEverifyFourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素.
     *
     * @param QueryEverifyFourmetaRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryEverifyFourmetaResponse
     */
    public function queryEverifyFourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEverifyFourmetaResponse::fromMap($this->doRequest('1.0', 'baas.plus.everify.fourmeta.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素.
     *
     * @param QueryEverifyThreemetaRequest $request
     *
     * @return QueryEverifyThreemetaResponse
     */
    public function queryEverifyThreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEverifyThreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素.
     *
     * @param QueryEverifyThreemetaRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryEverifyThreemetaResponse
     */
    public function queryEverifyThreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEverifyThreemetaResponse::fromMap($this->doRequest('1.0', 'baas.plus.everify.threemeta.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素.
     *
     * @param QueryEverifyTwometaRequest $request
     *
     * @return QueryEverifyTwometaResponse
     */
    public function queryEverifyTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEverifyTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素.
     *
     * @param QueryEverifyTwometaRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryEverifyTwometaResponse
     */
    public function queryEverifyTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEverifyTwometaResponse::fromMap($this->doRequest('1.0', 'baas.plus.everify.twometa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内容搜索查询接口
     * Summary: 内容搜索查询接口.
     *
     * @param QueryBaicorpInternalsearchlibraryRequest $request
     *
     * @return QueryBaicorpInternalsearchlibraryResponse
     */
    public function queryBaicorpInternalsearchlibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaicorpInternalsearchlibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: 内容搜索查询接口
     * Summary: 内容搜索查询接口.
     *
     * @param QueryBaicorpInternalsearchlibraryRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryBaicorpInternalsearchlibraryResponse
     */
    public function queryBaicorpInternalsearchlibraryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaicorpInternalsearchlibraryResponse::fromMap($this->doRequest('1.0', 'baas.plus.baicorp.internalsearchlibrary.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新检索
     * Summary: 更新检索.
     *
     * @param UpdateBaicorpInternalsearchlibraryRequest $request
     *
     * @return UpdateBaicorpInternalsearchlibraryResponse
     */
    public function updateBaicorpInternalsearchlibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBaicorpInternalsearchlibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新检索
     * Summary: 更新检索.
     *
     * @param UpdateBaicorpInternalsearchlibraryRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return UpdateBaicorpInternalsearchlibraryResponse
     */
    public function updateBaicorpInternalsearchlibraryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaicorpInternalsearchlibraryResponse::fromMap($this->doRequest('1.0', 'baas.plus.baicorp.internalsearchlibrary.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对公打款-总行查询
     * Summary: 对公打款-总行查询.
     *
     * @param QueryEpayauthRootbankRequest $request
     *
     * @return QueryEpayauthRootbankResponse
     */
    public function queryEpayauthRootbank($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEpayauthRootbankEx($request, $headers, $runtime);
    }

    /**
     * Description: 对公打款-总行查询
     * Summary: 对公打款-总行查询.
     *
     * @param QueryEpayauthRootbankRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryEpayauthRootbankResponse
     */
    public function queryEpayauthRootbankEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEpayauthRootbankResponse::fromMap($this->doRequest('1.0', 'baas.plus.epayauth.rootbank.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
     * Summary: 业务申请保护.
     *
     * @param QueryYdapplyprotEcapplyRequest $request
     *
     * @return QueryYdapplyprotEcapplyResponse
     */
    public function queryYdapplyprotEcapply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryYdapplyprotEcapplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
     * Summary: 业务申请保护.
     *
     * @param QueryYdapplyprotEcapplyRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryYdapplyprotEcapplyResponse
     */
    public function queryYdapplyprotEcapplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryYdapplyprotEcapplyResponse::fromMap($this->doRequest('1.0', 'baas.plus.ydapplyprot.ecapply.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
     * Summary: 先享后付保护.
     *
     * @param QueryYdpacprotEcpacRequest $request
     *
     * @return QueryYdpacprotEcpacResponse
     */
    public function queryYdpacprotEcpac($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryYdpacprotEcpacEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
     * Summary: 先享后付保护.
     *
     * @param QueryYdpacprotEcpacRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryYdpacprotEcpacResponse
     */
    public function queryYdpacprotEcpacEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryYdpacprotEcpacResponse::fromMap($this->doRequest('1.0', 'baas.plus.ydpacprot.ecpac.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护.
     *
     * @param QueryYdauthprotTwometaRequest $request
     *
     * @return QueryYdauthprotTwometaResponse
     */
    public function queryYdauthprotTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryYdauthprotTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护.
     *
     * @param QueryYdauthprotTwometaRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryYdauthprotTwometaResponse
     */
    public function queryYdauthprotTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryYdauthprotTwometaResponse::fromMap($this->doRequest('1.0', 'baas.plus.ydauthprot.twometa.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护.
     *
     * @param QueryYdauthprotThreemetaRequest $request
     *
     * @return QueryYdauthprotThreemetaResponse
     */
    public function queryYdauthprotThreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryYdauthprotThreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护.
     *
     * @param QueryYdauthprotThreemetaRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryYdauthprotThreemetaResponse
     */
    public function queryYdauthprotThreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryYdauthprotThreemetaResponse::fromMap($this->doRequest('1.0', 'baas.plus.ydauthprot.threemeta.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护.
     *
     * @param QueryYdauthprotFourmetaRequest $request
     *
     * @return QueryYdauthprotFourmetaResponse
     */
    public function queryYdauthprotFourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryYdauthprotFourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护.
     *
     * @param QueryYdauthprotFourmetaRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryYdauthprotFourmetaResponse
     */
    public function queryYdauthprotFourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryYdauthprotFourmetaResponse::fromMap($this->doRequest('1.0', 'baas.plus.ydauthprot.fourmeta.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销保护
     * Summary: 营销保护.
     *
     * @param QueryYdmktprotEcmarketcampaignRequest $request
     *
     * @return QueryYdmktprotEcmarketcampaignResponse
     */
    public function queryYdmktprotEcmarketcampaign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryYdmktprotEcmarketcampaignEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销保护
     * Summary: 营销保护.
     *
     * @param QueryYdmktprotEcmarketcampaignRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryYdmktprotEcmarketcampaignResponse
     */
    public function queryYdmktprotEcmarketcampaignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryYdmktprotEcmarketcampaignResponse::fromMap($this->doRequest('1.0', 'baas.plus.ydmktprot.ecmarketcampaign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册保护
     * Summary: 注册保护.
     *
     * @param QueryYdregprotEcregisterRequest $request
     *
     * @return QueryYdregprotEcregisterResponse
     */
    public function queryYdregprotEcregister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryYdregprotEcregisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册保护
     * Summary: 注册保护.
     *
     * @param QueryYdregprotEcregisterRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryYdregprotEcregisterResponse
     */
    public function queryYdregprotEcregisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryYdregprotEcregisterResponse::fromMap($this->doRequest('1.0', 'baas.plus.ydregprot.ecregister.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 支行查询.
     *
     * @param QueryEpayauthBranchbankRequest $request
     *
     * @return QueryEpayauthBranchbankResponse
     */
    public function queryEpayauthBranchbank($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEpayauthBranchbankEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 支行查询.
     *
     * @param QueryEpayauthBranchbankRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryEpayauthBranchbankResponse
     */
    public function queryEpayauthBranchbankEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEpayauthBranchbankResponse::fromMap($this->doRequest('1.0', 'baas.plus.epayauth.branchbank.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 行政地区编码查询.
     *
     * @param QueryEpayauthDistrictRequest $request
     *
     * @return QueryEpayauthDistrictResponse
     */
    public function queryEpayauthDistrict($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEpayauthDistrictEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 行政地区编码查询.
     *
     * @param QueryEpayauthDistrictRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryEpayauthDistrictResponse
     */
    public function queryEpayauthDistrictEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEpayauthDistrictResponse::fromMap($this->doRequest('1.0', 'baas.plus.epayauth.district.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
     * Summary: 发起打款验证申请.
     *
     * @param InitEpayauthVerifyRequest $request
     *
     * @return InitEpayauthVerifyResponse
     */
    public function initEpayauthVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initEpayauthVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
     * Summary: 发起打款验证申请.
     *
     * @param InitEpayauthVerifyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return InitEpayauthVerifyResponse
     */
    public function initEpayauthVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitEpayauthVerifyResponse::fromMap($this->doRequest('1.0', 'baas.plus.epayauth.verify.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
     * Summary: 打款验证金额校验.
     *
     * @param QueryEpayauthVerifyRequest $request
     *
     * @return QueryEpayauthVerifyResponse
     */
    public function queryEpayauthVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEpayauthVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
     * Summary: 打款验证金额校验.
     *
     * @param QueryEpayauthVerifyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryEpayauthVerifyResponse
     */
    public function queryEpayauthVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEpayauthVerifyResponse::fromMap($this->doRequest('1.0', 'baas.plus.epayauth.verify.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
     * Summary: 链上交易二维码生成.
     *
     * @param QueryBmpbrowserTransactionqrcodeRequest $request
     *
     * @return QueryBmpbrowserTransactionqrcodeResponse
     */
    public function queryBmpbrowserTransactionqrcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBmpbrowserTransactionqrcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
     * Summary: 链上交易二维码生成.
     *
     * @param QueryBmpbrowserTransactionqrcodeRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryBmpbrowserTransactionqrcodeResponse
     */
    public function queryBmpbrowserTransactionqrcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBmpbrowserTransactionqrcodeResponse::fromMap($this->doRequest('1.0', 'baas.plus.bmpbrowser.transactionqrcode.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
     * Summary: 批量开通 链上交易移动端查看权限.
     *
     * @param AddBmpbrowserPrivilegeRequest $request
     *
     * @return AddBmpbrowserPrivilegeResponse
     */
    public function addBmpbrowserPrivilege($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addBmpbrowserPrivilegeEx($request, $headers, $runtime);
    }

    /**
     * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
     * Summary: 批量开通 链上交易移动端查看权限.
     *
     * @param AddBmpbrowserPrivilegeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return AddBmpbrowserPrivilegeResponse
     */
    public function addBmpbrowserPrivilegeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddBmpbrowserPrivilegeResponse::fromMap($this->doRequest('1.0', 'baas.plus.bmpbrowser.privilege.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 身份证信息识别
     * Summary: 身份证信息识别.
     *
     * @param QueryIdcocrIdcardRequest $request
     *
     * @return QueryIdcocrIdcardResponse
     */
    public function queryIdcocrIdcard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIdcocrIdcardEx($request, $headers, $runtime);
    }

    /**
     * Description: 身份证信息识别
     * Summary: 身份证信息识别.
     *
     * @param QueryIdcocrIdcardRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryIdcocrIdcardResponse
     */
    public function queryIdcocrIdcardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIdcocrIdcardResponse::fromMap($this->doRequest('1.0', 'baas.plus.idcocr.idcard.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 申请证书
     * Summary: 申请证书.
     *
     * @param InitCaCertificateRequest $request
     *
     * @return InitCaCertificateResponse
     */
    public function initCaCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initCaCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 申请证书
     * Summary: 申请证书.
     *
     * @param InitCaCertificateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return InitCaCertificateResponse
     */
    public function initCaCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitCaCertificateResponse::fromMap($this->doRequest('1.0', 'baas.plus.ca.certificate.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
     * Summary: 内容风险识别接口服务
     *
     * @param InitContentriskInternalRequest $request
     *
     * @return InitContentriskInternalResponse
     */
    public function initContentriskInternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initContentriskInternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
     * Summary: 内容风险识别接口服务
     *
     * @param InitContentriskInternalRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return InitContentriskInternalResponse
     */
    public function initContentriskInternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitContentriskInternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.contentrisk.internal.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
     * Summary: 内容风险识别结果查询接口服务
     *
     * @param QueryContentriskInternalRequest $request
     *
     * @return QueryContentriskInternalResponse
     */
    public function queryContentriskInternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContentriskInternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
     * Summary: 内容风险识别结果查询接口服务
     *
     * @param QueryContentriskInternalRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryContentriskInternalResponse
     */
    public function queryContentriskInternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContentriskInternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.contentrisk.internal.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实人认证服务端比对-认证开始
     * Summary: 个人实人认证服务端比对-认证开始.
     *
     * @param InitIndividualidImageauthRequest $request
     *
     * @return InitIndividualidImageauthResponse
     */
    public function initIndividualidImageauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initIndividualidImageauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实人认证服务端比对-认证开始
     * Summary: 个人实人认证服务端比对-认证开始.
     *
     * @param InitIndividualidImageauthRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return InitIndividualidImageauthResponse
     */
    public function initIndividualidImageauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitIndividualidImageauthResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.imageauth.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 访问账户生成
     * Summary: 访问账户生成.
     *
     * @param AddIotcseAccountRequest $request
     *
     * @return AddIotcseAccountResponse
     */
    public function addIotcseAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addIotcseAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 访问账户生成
     * Summary: 访问账户生成.
     *
     * @param AddIotcseAccountRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddIotcseAccountResponse
     */
    public function addIotcseAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddIotcseAccountResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.account.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证上链
     * Summary: 存证上链.
     *
     * @param SaveIotcseEvidenceRequest $request
     *
     * @return SaveIotcseEvidenceResponse
     */
    public function saveIotcseEvidence($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveIotcseEvidenceEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证上链
     * Summary: 存证上链.
     *
     * @param SaveIotcseEvidenceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SaveIotcseEvidenceResponse
     */
    public function saveIotcseEvidenceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveIotcseEvidenceResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.evidence.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证上链查询
     * Summary: 存证上链查询.
     *
     * @param QueryIotcseEvidenceRequest $request
     *
     * @return QueryIotcseEvidenceResponse
     */
    public function queryIotcseEvidence($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotcseEvidenceEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证上链查询
     * Summary: 存证上链查询.
     *
     * @param QueryIotcseEvidenceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryIotcseEvidenceResponse
     */
    public function queryIotcseEvidenceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotcseEvidenceResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.evidence.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代理创建企业did
     * Summary: 代理创建企业did.
     *
     * @param CreateDidCorporatedidagentRequest $request
     *
     * @return CreateDidCorporatedidagentResponse
     */
    public function createDidCorporatedidagent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDidCorporatedidagentEx($request, $headers, $runtime);
    }

    /**
     * Description: 代理创建企业did
     * Summary: 代理创建企业did.
     *
     * @param CreateDidCorporatedidagentRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateDidCorporatedidagentResponse
     */
    public function createDidCorporatedidagentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDidCorporatedidagentResponse::fromMap($this->doRequest('1.0', 'baas.plus.did.corporatedidagent.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证-认证初始化
     * Summary: 个人实人刷脸认证-认证初始化.
     *
     * @param InitIndividualidFaceauthinternalRequest $request
     *
     * @return InitIndividualidFaceauthinternalResponse
     */
    public function initIndividualidFaceauthinternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initIndividualidFaceauthinternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证-认证初始化
     * Summary: 个人实人刷脸认证-认证初始化.
     *
     * @param InitIndividualidFaceauthinternalRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return InitIndividualidFaceauthinternalResponse
     */
    public function initIndividualidFaceauthinternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitIndividualidFaceauthinternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.faceauthinternal.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证-认证开始
     * Summary: 个人实人刷脸认证-认证开始.
     *
     * @param CertifyIndividualidFaceauthinternalRequest $request
     *
     * @return CertifyIndividualidFaceauthinternalResponse
     */
    public function certifyIndividualidFaceauthinternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyIndividualidFaceauthinternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证-认证开始
     * Summary: 个人实人刷脸认证-认证开始.
     *
     * @param CertifyIndividualidFaceauthinternalRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return CertifyIndividualidFaceauthinternalResponse
     */
    public function certifyIndividualidFaceauthinternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyIndividualidFaceauthinternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.faceauthinternal.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证-查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果.
     *
     * @param QueryIndividualidFaceauthinternalRequest $request
     *
     * @return QueryIndividualidFaceauthinternalResponse
     */
    public function queryIndividualidFaceauthinternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIndividualidFaceauthinternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证-查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果.
     *
     * @param QueryIndividualidFaceauthinternalRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryIndividualidFaceauthinternalResponse
     */
    public function queryIndividualidFaceauthinternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIndividualidFaceauthinternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.individualid.faceauthinternal.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化.
     *
     * @param InitEnterpriseidFaceauthinternalRequest $request
     *
     * @return InitEnterpriseidFaceauthinternalResponse
     */
    public function initEnterpriseidFaceauthinternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initEnterpriseidFaceauthinternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化.
     *
     * @param InitEnterpriseidFaceauthinternalRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return InitEnterpriseidFaceauthinternalResponse
     */
    public function initEnterpriseidFaceauthinternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitEnterpriseidFaceauthinternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.enterpriseid.faceauthinternal.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始.
     *
     * @param CertifyEnterpriseidFaceauthinternalRequest $request
     *
     * @return CertifyEnterpriseidFaceauthinternalResponse
     */
    public function certifyEnterpriseidFaceauthinternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyEnterpriseidFaceauthinternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始.
     *
     * @param CertifyEnterpriseidFaceauthinternalRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return CertifyEnterpriseidFaceauthinternalResponse
     */
    public function certifyEnterpriseidFaceauthinternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyEnterpriseidFaceauthinternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.enterpriseid.faceauthinternal.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素.
     *
     * @param QueryEverifyTwometainternalRequest $request
     *
     * @return QueryEverifyTwometainternalResponse
     */
    public function queryEverifyTwometainternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEverifyTwometainternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素.
     *
     * @param QueryEverifyTwometainternalRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryEverifyTwometainternalResponse
     */
    public function queryEverifyTwometainternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEverifyTwometainternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.everify.twometainternal.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素.
     *
     * @param QueryEverifyThreemetainternalRequest $request
     *
     * @return QueryEverifyThreemetainternalResponse
     */
    public function queryEverifyThreemetainternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEverifyThreemetainternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素.
     *
     * @param QueryEverifyThreemetainternalRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryEverifyThreemetainternalResponse
     */
    public function queryEverifyThreemetainternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEverifyThreemetainternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.everify.threemetainternal.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素.
     *
     * @param QueryEverifyFourmetainternalRequest $request
     *
     * @return QueryEverifyFourmetainternalResponse
     */
    public function queryEverifyFourmetainternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEverifyFourmetainternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素.
     *
     * @param QueryEverifyFourmetainternalRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryEverifyFourmetainternalResponse
     */
    public function queryEverifyFourmetainternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEverifyFourmetainternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.everify.fourmetainternal.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果.
     *
     * @param QueryEnterpriseidFaceauthinternalRequest $request
     *
     * @return QueryEnterpriseidFaceauthinternalResponse
     */
    public function queryEnterpriseidFaceauthinternal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEnterpriseidFaceauthinternalEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果.
     *
     * @param QueryEnterpriseidFaceauthinternalRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryEnterpriseidFaceauthinternalResponse
     */
    public function queryEnterpriseidFaceauthinternalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEnterpriseidFaceauthinternalResponse::fromMap($this->doRequest('1.0', 'baas.plus.enterpriseid.faceauthinternal.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份注册
     * Summary: 物联网区块链身份注册.
     *
     * @param AddIotcseThingsdidRequest $request
     *
     * @return AddIotcseThingsdidResponse
     */
    public function addIotcseThingsdid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addIotcseThingsdidEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份注册
     * Summary: 物联网区块链身份注册.
     *
     * @param AddIotcseThingsdidRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AddIotcseThingsdidResponse
     */
    public function addIotcseThingsdidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddIotcseThingsdidResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.thingsdid.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份更新
     * Summary: 物联网区块链身份更新.
     *
     * @param UpdateIotcseThingsdidRequest $request
     *
     * @return UpdateIotcseThingsdidResponse
     */
    public function updateIotcseThingsdid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateIotcseThingsdidEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份更新
     * Summary: 物联网区块链身份更新.
     *
     * @param UpdateIotcseThingsdidRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateIotcseThingsdidResponse
     */
    public function updateIotcseThingsdidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateIotcseThingsdidResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.thingsdid.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份查询
     * Summary: 物联网区块链身份查询.
     *
     * @param QueryIotcseThingsdidRequest $request
     *
     * @return QueryIotcseThingsdidResponse
     */
    public function queryIotcseThingsdid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotcseThingsdidEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份查询
     * Summary: 物联网区块链身份查询.
     *
     * @param QueryIotcseThingsdidRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryIotcseThingsdidResponse
     */
    public function queryIotcseThingsdidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotcseThingsdidResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.thingsdid.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异步轮询请求
     * 智能合约执行完后异步轮询
     * Summary: 异步轮询请求
     *
     * @param QueryIotcseAsyncprocessRequest $request
     *
     * @return QueryIotcseAsyncprocessResponse
     */
    public function queryIotcseAsyncprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotcseAsyncprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: 异步轮询请求
     * 智能合约执行完后异步轮询
     * Summary: 异步轮询请求
     *
     * @param QueryIotcseAsyncprocessRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryIotcseAsyncprocessResponse
     */
    public function queryIotcseAsyncprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotcseAsyncprocessResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.asyncprocess.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份分组
     * Summary: 物联网区块链身份分组.
     *
     * @param ExecIotcseGroupRequest $request
     *
     * @return ExecIotcseGroupResponse
     */
    public function execIotcseGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execIotcseGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份分组
     * Summary: 物联网区块链身份分组.
     *
     * @param ExecIotcseGroupRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecIotcseGroupResponse
     */
    public function execIotcseGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecIotcseGroupResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.group.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链分组设备查询
     * Summary: 物联网区块链分组设备查询.
     *
     * @param QueryIotcseGroupdeviceRequest $request
     *
     * @return QueryIotcseGroupdeviceResponse
     */
    public function queryIotcseGroupdevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotcseGroupdeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链分组设备查询
     * Summary: 物联网区块链分组设备查询.
     *
     * @param QueryIotcseGroupdeviceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryIotcseGroupdeviceResponse
     */
    public function queryIotcseGroupdeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotcseGroupdeviceResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.groupdevice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份设备分组查询
     * Summary: 物联网区块链身份设备分组查询.
     *
     * @param QueryIotcseDevicegroupRequest $request
     *
     * @return QueryIotcseDevicegroupResponse
     */
    public function queryIotcseDevicegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotcseDevicegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份设备分组查询
     * Summary: 物联网区块链身份设备分组查询.
     *
     * @param QueryIotcseDevicegroupRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryIotcseDevicegroupResponse
     */
    public function queryIotcseDevicegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotcseDevicegroupResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.devicegroup.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份租户设备查询
     * Summary: 物联网区块链身份租户设备查询.
     *
     * @param QueryIotcseTenantdeviceRequest $request
     *
     * @return QueryIotcseTenantdeviceResponse
     */
    public function queryIotcseTenantdevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotcseTenantdeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份租户设备查询
     * Summary: 物联网区块链身份租户设备查询.
     *
     * @param QueryIotcseTenantdeviceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryIotcseTenantdeviceResponse
     */
    public function queryIotcseTenantdeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotcseTenantdeviceResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.tenantdevice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份设备状态更新
     * Summary: 物联网区块链身份设备状态更新.
     *
     * @param UpdateIotcseDevicestatusRequest $request
     *
     * @return UpdateIotcseDevicestatusResponse
     */
    public function updateIotcseDevicestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateIotcseDevicestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份设备状态更新
     * Summary: 物联网区块链身份设备状态更新.
     *
     * @param UpdateIotcseDevicestatusRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateIotcseDevicestatusResponse
     */
    public function updateIotcseDevicestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateIotcseDevicestatusResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.devicestatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份设备物模型查询
     * Summary: 物联网区块链身份设备物模型查询.
     *
     * @param QueryIotcseDevicemodelRequest $request
     *
     * @return QueryIotcseDevicemodelResponse
     */
    public function queryIotcseDevicemodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotcseDevicemodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份设备物模型查询
     * Summary: 物联网区块链身份设备物模型查询.
     *
     * @param QueryIotcseDevicemodelRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryIotcseDevicemodelResponse
     */
    public function queryIotcseDevicemodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotcseDevicemodelResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.devicemodel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份设备空间关联
     * Summary: 物联网区块链身份设备空间关联.
     *
     * @param UpdateIotcseDevicespaceRequest $request
     *
     * @return UpdateIotcseDevicespaceResponse
     */
    public function updateIotcseDevicespace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateIotcseDevicespaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份设备空间关联
     * Summary: 物联网区块链身份设备空间关联.
     *
     * @param UpdateIotcseDevicespaceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateIotcseDevicespaceResponse
     */
    public function updateIotcseDevicespaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateIotcseDevicespaceResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.devicespace.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物联网区块链身份批量存证数据读取
     * Summary: 物联网区块链身份批量存证数据读取.
     *
     * @param QueryIotcseEvidencebatchRequest $request
     *
     * @return QueryIotcseEvidencebatchResponse
     */
    public function queryIotcseEvidencebatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotcseEvidencebatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 物联网区块链身份批量存证数据读取
     * Summary: 物联网区块链身份批量存证数据读取.
     *
     * @param QueryIotcseEvidencebatchRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryIotcseEvidencebatchResponse
     */
    public function queryIotcseEvidencebatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotcseEvidencebatchResponse::fromMap($this->doRequest('1.0', 'baas.plus.iotcse.evidencebatch.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AI认知服务营业执照ocr服务
     * Summary: AI认知服务营业执照ocr服务
     *
     * @param QueryBlocrBusinesslicenseRequest $request
     *
     * @return QueryBlocrBusinesslicenseResponse
     */
    public function queryBlocrBusinesslicense($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlocrBusinesslicenseEx($request, $headers, $runtime);
    }

    /**
     * Description: AI认知服务营业执照ocr服务
     * Summary: AI认知服务营业执照ocr服务
     *
     * @param QueryBlocrBusinesslicenseRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryBlocrBusinesslicenseResponse
     */
    public function queryBlocrBusinesslicenseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlocrBusinesslicenseResponse::fromMap($this->doRequest('1.0', 'baas.plus.blocr.businesslicense.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AI认知服务增值税发票ocr识别
     * Summary: AI认知服务增值税发票ocr识别.
     *
     * @param QueryInvoicesocrVatinvoiceRequest $request
     *
     * @return QueryInvoicesocrVatinvoiceResponse
     */
    public function queryInvoicesocrVatinvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInvoicesocrVatinvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: AI认知服务增值税发票ocr识别
     * Summary: AI认知服务增值税发票ocr识别.
     *
     * @param QueryInvoicesocrVatinvoiceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryInvoicesocrVatinvoiceResponse
     */
    public function queryInvoicesocrVatinvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInvoicesocrVatinvoiceResponse::fromMap($this->doRequest('1.0', 'baas.plus.invoicesocr.vatinvoice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户链上交易移动端查看权限
     * Summary: 查询用户链上交易移动端查看权限.
     *
     * @param QueryBmpbrowserPrivilegeRequest $request
     *
     * @return QueryBmpbrowserPrivilegeResponse
     */
    public function queryBmpbrowserPrivilege($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBmpbrowserPrivilegeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户链上交易移动端查看权限
     * Summary: 查询用户链上交易移动端查看权限.
     *
     * @param QueryBmpbrowserPrivilegeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryBmpbrowserPrivilegeResponse
     */
    public function queryBmpbrowserPrivilegeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBmpbrowserPrivilegeResponse::fromMap($this->doRequest('1.0', 'baas.plus.bmpbrowser.privilege.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量取消 链上交易移动端查看权限
     * Summary: 批量取消 链上交易移动端查看权限.
     *
     * @param CancelBmpbrowserPrivilegeRequest $request
     *
     * @return CancelBmpbrowserPrivilegeResponse
     */
    public function cancelBmpbrowserPrivilege($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelBmpbrowserPrivilegeEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量取消 链上交易移动端查看权限
     * Summary: 批量取消 链上交易移动端查看权限.
     *
     * @param CancelBmpbrowserPrivilegeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CancelBmpbrowserPrivilegeResponse
     */
    public function cancelBmpbrowserPrivilegeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelBmpbrowserPrivilegeResponse::fromMap($this->doRequest('1.0', 'baas.plus.bmpbrowser.privilege.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
