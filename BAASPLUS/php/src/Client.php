<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;

use AntChain\BAASPLUS\Models\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidInternalmaskRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidInternalmaskResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidInternalfourmetaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidInternalfourmetaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidInternalthreemetaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidInternalthreemetaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidInternaltwometaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidInternaltwometaResponse;
use AntChain\BAASPLUS\Models\InitBaasPlusEnterpriseidFaceauthRequest;
use AntChain\BAASPLUS\Models\InitBaasPlusEnterpriseidFaceauthResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidFaceauthRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidFaceauthResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidInternalfourmetaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidInternalfourmetaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidInternalthreemetaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidInternalthreemetaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidInternaltwometaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidInternaltwometaResponse;
use AntChain\BAASPLUS\Models\CreateBaasPlusBaicorpInternalevaluationasyncRequest;
use AntChain\BAASPLUS\Models\CreateBaasPlusBaicorpInternalevaluationasyncResponse;
use AntChain\BAASPLUS\Models\CreateBaasPlusBaicorpInternalmonitorasyncRequest;
use AntChain\BAASPLUS\Models\CreateBaasPlusBaicorpInternalmonitorasyncResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusBaicorpInternalevaluationasyncRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusBaicorpInternalevaluationasyncResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusBaicorpInternalmonitorasyncRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusBaicorpInternalmonitorasyncResponse;
use AntChain\BAASPLUS\Models\CertifyBaasPlusEnterpriseidFaceauthRequest;
use AntChain\BAASPLUS\Models\CertifyBaasPlusEnterpriseidFaceauthResponse;
use AntChain\BAASPLUS\Models\InitBaasPlusIndividualidFaceauthRequest;
use AntChain\BAASPLUS\Models\InitBaasPlusIndividualidFaceauthResponse;
use AntChain\BAASPLUS\Models\CertifyBaasPlusIndividualidFaceauthRequest;
use AntChain\BAASPLUS\Models\CertifyBaasPlusIndividualidFaceauthResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidFaceauthRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidFaceauthResponse;
use AntChain\BAASPLUS\Models\GetBaasPlusDataserviceBlockchainheightRequest;
use AntChain\BAASPLUS\Models\GetBaasPlusDataserviceBlockchainheightResponse;
use AntChain\BAASPLUS\Models\GetBaasPlusDataserviceTransactioncountRequest;
use AntChain\BAASPLUS\Models\GetBaasPlusDataserviceTransactioncountResponse;
use AntChain\BAASPLUS\Models\GetBaasPlusDataserviceTransactioninfoRequest;
use AntChain\BAASPLUS\Models\GetBaasPlusDataserviceTransactioninfoResponse;
use AntChain\BAASPLUS\Models\ListBaasPlusDataserviceLastblocksRequest;
use AntChain\BAASPLUS\Models\ListBaasPlusDataserviceLastblocksResponse;
use AntChain\BAASPLUS\Models\GetBaasPlusTasAttestationRequest;
use AntChain\BAASPLUS\Models\GetBaasPlusTasAttestationResponse;
use AntChain\BAASPLUS\Models\VerifyBaasPlusTasCtsrRequest;
use AntChain\BAASPLUS\Models\VerifyBaasPlusTasCtsrResponse;
use AntChain\BAASPLUS\Models\GetBaasPlusTasCertificateRequest;
use AntChain\BAASPLUS\Models\GetBaasPlusTasCertificateResponse;
use AntChain\BAASPLUS\Models\GetBaasPlusTasTransactionattestationRequest;
use AntChain\BAASPLUS\Models\GetBaasPlusTasTransactionattestationResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyFourmetaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyFourmetaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyThreemetaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyThreemetaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyTwometaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyTwometaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusBaicorpInternalsearchlibraryRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusBaicorpInternalsearchlibraryResponse;
use AntChain\BAASPLUS\Models\UpdateBaasPlusBaicorpInternalsearchlibraryRequest;
use AntChain\BAASPLUS\Models\UpdateBaasPlusBaicorpInternalsearchlibraryResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEpayauthRootbankRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEpayauthRootbankResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdapplyprotEcapplyRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdapplyprotEcapplyResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdpacprotEcpacRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdpacprotEcpacResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdauthprotTwometaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdauthprotTwometaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdauthprotThreemetaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdauthprotThreemetaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdauthprotFourmetaRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdauthprotFourmetaResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdmktprotEcmarketcampaignRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdmktprotEcmarketcampaignResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdregprotEcregisterRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusYdregprotEcregisterResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEpayauthBranchbankRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEpayauthBranchbankResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEpayauthDistrictRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEpayauthDistrictResponse;
use AntChain\BAASPLUS\Models\InitBaasPlusEpayauthVerifyRequest;
use AntChain\BAASPLUS\Models\InitBaasPlusEpayauthVerifyResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEpayauthVerifyRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEpayauthVerifyResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusBmpbrowserTransactionqrcodeRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusBmpbrowserTransactionqrcodeResponse;
use AntChain\BAASPLUS\Models\AddBaasPlusBmpbrowserPrivilegeRequest;
use AntChain\BAASPLUS\Models\AddBaasPlusBmpbrowserPrivilegeResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIdcocrIdcardRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIdcocrIdcardResponse;
use AntChain\BAASPLUS\Models\InitBaasPlusCaCertificateRequest;
use AntChain\BAASPLUS\Models\InitBaasPlusCaCertificateResponse;
use AntChain\BAASPLUS\Models\InitBaasPlusContentriskInternalRequest;
use AntChain\BAASPLUS\Models\InitBaasPlusContentriskInternalResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusContentriskInternalRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusContentriskInternalResponse;
use AntChain\BAASPLUS\Models\InitBaasPlusIndividualidImageauthRequest;
use AntChain\BAASPLUS\Models\InitBaasPlusIndividualidImageauthResponse;
use AntChain\BAASPLUS\Models\AddBaasPlusIotcseAccountRequest;
use AntChain\BAASPLUS\Models\AddBaasPlusIotcseAccountResponse;
use AntChain\BAASPLUS\Models\SaveBaasPlusIotcseEvidenceRequest;
use AntChain\BAASPLUS\Models\SaveBaasPlusIotcseEvidenceResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseEvidenceRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseEvidenceResponse;
use AntChain\BAASPLUS\Models\CreateBaasPlusDidCorporatedidagentRequest;
use AntChain\BAASPLUS\Models\CreateBaasPlusDidCorporatedidagentResponse;
use AntChain\BAASPLUS\Models\InitBaasPlusIndividualidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\InitBaasPlusIndividualidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\CertifyBaasPlusIndividualidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\CertifyBaasPlusIndividualidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIndividualidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\InitBaasPlusEnterpriseidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\InitBaasPlusEnterpriseidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\CertifyBaasPlusEnterpriseidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\CertifyBaasPlusEnterpriseidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyTwometainternalRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyTwometainternalResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyThreemetainternalRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyThreemetainternalResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyFourmetainternalRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEverifyFourmetainternalResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidFaceauthinternalRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusEnterpriseidFaceauthinternalResponse;
use AntChain\BAASPLUS\Models\AddBaasPlusIotcseThingsdidRequest;
use AntChain\BAASPLUS\Models\AddBaasPlusIotcseThingsdidResponse;
use AntChain\BAASPLUS\Models\UpdateBaasPlusIotcseThingsdidRequest;
use AntChain\BAASPLUS\Models\UpdateBaasPlusIotcseThingsdidResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseThingsdidRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseThingsdidResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseAsyncprocessRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseAsyncprocessResponse;
use AntChain\BAASPLUS\Models\ExecBaasPlusIotcseGroupRequest;
use AntChain\BAASPLUS\Models\ExecBaasPlusIotcseGroupResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseGroupdeviceRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseGroupdeviceResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseDevicegroupRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseDevicegroupResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseTenantdeviceRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseTenantdeviceResponse;
use AntChain\BAASPLUS\Models\UpdateBaasPlusIotcseDevicestatusRequest;
use AntChain\BAASPLUS\Models\UpdateBaasPlusIotcseDevicestatusResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseDevicemodelRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseDevicemodelResponse;
use AntChain\BAASPLUS\Models\UpdateBaasPlusIotcseDevicespaceRequest;
use AntChain\BAASPLUS\Models\UpdateBaasPlusIotcseDevicespaceResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseEvidencebatchRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusIotcseEvidencebatchResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusBlocrBusinesslicenseRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusBlocrBusinesslicenseResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusInvoicesocrVatinvoiceRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusInvoicesocrVatinvoiceResponse;
use AntChain\BAASPLUS\Models\QueryBaasPlusBmpbrowserPrivilegeRequest;
use AntChain\BAASPLUS\Models\QueryBaasPlusBmpbrowserPrivilegeResponse;
use AntChain\BAASPLUS\Models\CancelBaasPlusBmpbrowserPrivilegeRequest;
use AntChain\BAASPLUS\Models\CancelBaasPlusBmpbrowserPrivilegeResponse;

class Client {
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

    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public function __construct($config){
        if (Utils::isUnset($config)) {
            throw new TeaError([
                "code" => "ParameterMissing",
                "message" => "'config' can not be unset"
            ]);
        }
        $this->_accessKeyId = $config->accessKeyId;
        $this->_accessKeySecret = $config->accessKeySecret;
        $this->_securityToken = $config->securityToken;
        $this->_endpoint = $config->endpoint;
        $this->_protocol = $config->protocol;
        $this->_userAgent = $config->userAgent;
        $this->_readTimeout = $config->readTimeout;
        $this->_connectTimeout = $config->connectTimeout;
        $this->_httpProxy = $config->httpProxy;
        $this->_httpsProxy = $config->httpsProxy;
        $this->_noProxy = $config->noProxy;
        $this->_socks5Proxy = $config->socks5Proxy;
        $this->_socks5NetWork = $config->socks5NetWork;
        $this->_maxIdleConns = $config->maxIdleConns;
    }

    /**
     * Encapsulate the request and invoke the network
     * @param string $version
     * @param string $action api name
     * @param string $protocol http or https
     * @param string $method e.g. GET
     * @param string $pathname pathname of every api
     * @param mixed[] $request which contains request params
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return array the response
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $runtime){
        $runtime->validate();
        $_runtime = [
            "timeouted" => "retry",
            "readTimeout" => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            "connectTimeout" => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            "httpProxy" => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            "httpsProxy" => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            "noProxy" => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            "maxIdleConns" => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            "retry" => [
                "retryable" => $runtime->autoretry,
                "maxAttempts" => Utils::defaultNumber($runtime->maxAttempts, 3)
            ],
            "backoff" => [
                "policy" => Utils::defaultString($runtime->backoffPolicy, "no"),
                "period" => Utils::defaultNumber($runtime->backoffPeriod, 1)
            ],
            "ignoreSSL" => $runtime->ignoreSSL
        ];
        $_lastRequest = null;
        $_lastException = null;
        $_now = time();
        $_retryTimes = 0;
        while (Tea::allowRetry($_runtime["retry"], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime($_runtime["backoff"], $_retryTimes);
                if ($_backoffTime > 0) {
                    Tea::sleep($_backoffTime);
                }
            }
            $_retryTimes = $_retryTimes + 1;
            try {
                $_request = new Request();
                $_request->protocol = Utils::defaultString($this->_protocol, $protocol);
                $_request->method = $method;
                $_request->pathname = $pathname;
                $_request->query = [
                    "method" => $action,
                    "version" => $version,
                    "sign_type" => "HmacSHA1",
                    "req_time" => UtilClient::getTimestamp(),
                    "req_msg_id" => Utils::getNonce(),
                    "access_key" => $this->_accessKeyId,
                    "charset" => "UTF-8",
                    "baseSdkVersion" => "Tea-SDK",
                    "sdkVersion" => "Tea-SDK-20200902"
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query["security_token"] = $this->_securityToken;
                }
                $_request->headers = [
                    "host" => $this->_endpoint,
                    "user-agent" => $this->getUserAgent()
                ];
                $tmp = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body = Utils::toFormString($tmp);
                $_request->headers["content-type"] = "application/x-www-form-urlencoded";
                $signedParam = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query["sign"] = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $obj = Utils::readAsJSON($_response->body);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap($res["response"]);
                if (UtilClient::hasError($res)) {
                    throw new TeaError([
                        "message" => $resp["result_msg"],
                        "data" => $resp,
                        "code" => $resp["result_code"]
                    ]);
                }
                return $resp;
            }
            catch (Exception $e) {
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
     * Get user agent
     * @return string user agent
     */
    public function getUserAgent(){
        $userAgent = "TeaClient/1.0.0";
        return Utils::getUserAgent($userAgent);
    }

    /**
     * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
     * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
     * @param QueryBaasPlusIndividualidInternalmaskRequest $request
     * @return QueryBaasPlusIndividualidInternalmaskResponse
     */
    public function queryBaasPlusIndividualidInternalmask($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIndividualidInternalmaskEx($request, $runtime);
    }

    /**
     * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
     * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
     * @param QueryBaasPlusIndividualidInternalmaskRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIndividualidInternalmaskResponse
     */
    public function queryBaasPlusIndividualidInternalmaskEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIndividualidInternalmaskResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.internalmask.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素（数据来自数据枢纽）
     * @param QueryBaasPlusEnterpriseidInternalfourmetaRequest $request
     * @return QueryBaasPlusEnterpriseidInternalfourmetaResponse
     */
    public function queryBaasPlusEnterpriseidInternalfourmeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEnterpriseidInternalfourmetaEx($request, $runtime);
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素（数据来自数据枢纽）
     * @param QueryBaasPlusEnterpriseidInternalfourmetaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEnterpriseidInternalfourmetaResponse
     */
    public function queryBaasPlusEnterpriseidInternalfourmetaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEnterpriseidInternalfourmetaResponse::fromMap($this->doRequest("1.0", "baas.plus.enterpriseid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素（数据来自数据枢纽）
     * @param QueryBaasPlusEnterpriseidInternalthreemetaRequest $request
     * @return QueryBaasPlusEnterpriseidInternalthreemetaResponse
     */
    public function queryBaasPlusEnterpriseidInternalthreemeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEnterpriseidInternalthreemetaEx($request, $runtime);
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素（数据来自数据枢纽）
     * @param QueryBaasPlusEnterpriseidInternalthreemetaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEnterpriseidInternalthreemetaResponse
     */
    public function queryBaasPlusEnterpriseidInternalthreemetaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEnterpriseidInternalthreemetaResponse::fromMap($this->doRequest("1.0", "baas.plus.enterpriseid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素（数据来自数据枢纽）
     * @param QueryBaasPlusEnterpriseidInternaltwometaRequest $request
     * @return QueryBaasPlusEnterpriseidInternaltwometaResponse
     */
    public function queryBaasPlusEnterpriseidInternaltwometa($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEnterpriseidInternaltwometaEx($request, $runtime);
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素（数据来自数据枢纽）
     * @param QueryBaasPlusEnterpriseidInternaltwometaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEnterpriseidInternaltwometaResponse
     */
    public function queryBaasPlusEnterpriseidInternaltwometaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEnterpriseidInternaltwometaResponse::fromMap($this->doRequest("1.0", "baas.plus.enterpriseid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化
     * @param InitBaasPlusEnterpriseidFaceauthRequest $request
     * @return InitBaasPlusEnterpriseidFaceauthResponse
     */
    public function initBaasPlusEnterpriseidFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->initBaasPlusEnterpriseidFaceauthEx($request, $runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化
     * @param InitBaasPlusEnterpriseidFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return InitBaasPlusEnterpriseidFaceauthResponse
     */
    public function initBaasPlusEnterpriseidFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return InitBaasPlusEnterpriseidFaceauthResponse::fromMap($this->doRequest("1.0", "baas.plus.enterpriseid.faceauth.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果
     * @param QueryBaasPlusEnterpriseidFaceauthRequest $request
     * @return QueryBaasPlusEnterpriseidFaceauthResponse
     */
    public function queryBaasPlusEnterpriseidFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEnterpriseidFaceauthEx($request, $runtime);
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果
     * @param QueryBaasPlusEnterpriseidFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEnterpriseidFaceauthResponse
     */
    public function queryBaasPlusEnterpriseidFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEnterpriseidFaceauthResponse::fromMap($this->doRequest("1.0", "baas.plus.enterpriseid.faceauth.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实名认证四要素
     * Summary: 个人实名认证四要素（数据来自蚁盾）
     * @param QueryBaasPlusIndividualidInternalfourmetaRequest $request
     * @return QueryBaasPlusIndividualidInternalfourmetaResponse
     */
    public function queryBaasPlusIndividualidInternalfourmeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIndividualidInternalfourmetaEx($request, $runtime);
    }

    /**
     * Description: 个人实名认证四要素
     * Summary: 个人实名认证四要素（数据来自蚁盾）
     * @param QueryBaasPlusIndividualidInternalfourmetaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIndividualidInternalfourmetaResponse
     */
    public function queryBaasPlusIndividualidInternalfourmetaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIndividualidInternalfourmetaResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实名认证三要素
     * Summary: 个人实名认证三要素（数据来自蚁盾）
     * @param QueryBaasPlusIndividualidInternalthreemetaRequest $request
     * @return QueryBaasPlusIndividualidInternalthreemetaResponse
     */
    public function queryBaasPlusIndividualidInternalthreemeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIndividualidInternalthreemetaEx($request, $runtime);
    }

    /**
     * Description: 个人实名认证三要素
     * Summary: 个人实名认证三要素（数据来自蚁盾）
     * @param QueryBaasPlusIndividualidInternalthreemetaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIndividualidInternalthreemetaResponse
     */
    public function queryBaasPlusIndividualidInternalthreemetaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIndividualidInternalthreemetaResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实名认证二要素
     * Summary: 个人实名认证二要素
     * @param QueryBaasPlusIndividualidInternaltwometaRequest $request
     * @return QueryBaasPlusIndividualidInternaltwometaResponse
     */
    public function queryBaasPlusIndividualidInternaltwometa($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIndividualidInternaltwometaEx($request, $runtime);
    }

    /**
     * Description: 个人实名认证二要素
     * Summary: 个人实名认证二要素
     * @param QueryBaasPlusIndividualidInternaltwometaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIndividualidInternaltwometaResponse
     */
    public function queryBaasPlusIndividualidInternaltwometaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIndividualidInternaltwometaResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发起内容评估（BAI），仅内部调用
     * Summary: 发起内容评估
     * @param CreateBaasPlusBaicorpInternalevaluationasyncRequest $request
     * @return CreateBaasPlusBaicorpInternalevaluationasyncResponse
     */
    public function createBaasPlusBaicorpInternalevaluationasync($request){
        $runtime = new RuntimeOptions([]);
        return $this->createBaasPlusBaicorpInternalevaluationasyncEx($request, $runtime);
    }

    /**
     * Description: 发起内容评估（BAI），仅内部调用
     * Summary: 发起内容评估
     * @param CreateBaasPlusBaicorpInternalevaluationasyncRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateBaasPlusBaicorpInternalevaluationasyncResponse
     */
    public function createBaasPlusBaicorpInternalevaluationasyncEx($request, $runtime){
        Utils::validateModel($request);
        return CreateBaasPlusBaicorpInternalevaluationasyncResponse::fromMap($this->doRequest("1.0", "baas.plus.baicorp.internalevaluationasync.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 提交内容监测任务
     * Summary: 提交内容监测任务接口
     * @param CreateBaasPlusBaicorpInternalmonitorasyncRequest $request
     * @return CreateBaasPlusBaicorpInternalmonitorasyncResponse
     */
    public function createBaasPlusBaicorpInternalmonitorasync($request){
        $runtime = new RuntimeOptions([]);
        return $this->createBaasPlusBaicorpInternalmonitorasyncEx($request, $runtime);
    }

    /**
     * Description: 提交内容监测任务
     * Summary: 提交内容监测任务接口
     * @param CreateBaasPlusBaicorpInternalmonitorasyncRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateBaasPlusBaicorpInternalmonitorasyncResponse
     */
    public function createBaasPlusBaicorpInternalmonitorasyncEx($request, $runtime){
        Utils::validateModel($request);
        return CreateBaasPlusBaicorpInternalmonitorasyncResponse::fromMap($this->doRequest("1.0", "baas.plus.baicorp.internalmonitorasync.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询内容评估结果
     * Summary: 查询内容评估结果
     * @param QueryBaasPlusBaicorpInternalevaluationasyncRequest $request
     * @return QueryBaasPlusBaicorpInternalevaluationasyncResponse
     */
    public function queryBaasPlusBaicorpInternalevaluationasync($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusBaicorpInternalevaluationasyncEx($request, $runtime);
    }

    /**
     * Description: 查询内容评估结果
     * Summary: 查询内容评估结果
     * @param QueryBaasPlusBaicorpInternalevaluationasyncRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusBaicorpInternalevaluationasyncResponse
     */
    public function queryBaasPlusBaicorpInternalevaluationasyncEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusBaicorpInternalevaluationasyncResponse::fromMap($this->doRequest("1.0", "baas.plus.baicorp.internalevaluationasync.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询内容监测任务结果
     * Summary: 查询内容监测任务结果
     * @param QueryBaasPlusBaicorpInternalmonitorasyncRequest $request
     * @return QueryBaasPlusBaicorpInternalmonitorasyncResponse
     */
    public function queryBaasPlusBaicorpInternalmonitorasync($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusBaicorpInternalmonitorasyncEx($request, $runtime);
    }

    /**
     * Description: 查询内容监测任务结果
     * Summary: 查询内容监测任务结果
     * @param QueryBaasPlusBaicorpInternalmonitorasyncRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusBaicorpInternalmonitorasyncResponse
     */
    public function queryBaasPlusBaicorpInternalmonitorasyncEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusBaicorpInternalmonitorasyncResponse::fromMap($this->doRequest("1.0", "baas.plus.baicorp.internalmonitorasync.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始
     * @param CertifyBaasPlusEnterpriseidFaceauthRequest $request
     * @return CertifyBaasPlusEnterpriseidFaceauthResponse
     */
    public function certifyBaasPlusEnterpriseidFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->certifyBaasPlusEnterpriseidFaceauthEx($request, $runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始
     * @param CertifyBaasPlusEnterpriseidFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return CertifyBaasPlusEnterpriseidFaceauthResponse
     */
    public function certifyBaasPlusEnterpriseidFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return CertifyBaasPlusEnterpriseidFaceauthResponse::fromMap($this->doRequest("1.0", "baas.plus.enterpriseid.faceauth.certify", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证——认证初始化
     * Summary: 个人实人刷脸认证-认证初始化
     * @param InitBaasPlusIndividualidFaceauthRequest $request
     * @return InitBaasPlusIndividualidFaceauthResponse
     */
    public function initBaasPlusIndividualidFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->initBaasPlusIndividualidFaceauthEx($request, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证——认证初始化
     * Summary: 个人实人刷脸认证-认证初始化
     * @param InitBaasPlusIndividualidFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return InitBaasPlusIndividualidFaceauthResponse
     */
    public function initBaasPlusIndividualidFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return InitBaasPlusIndividualidFaceauthResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.faceauth.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证——认证开始
     * Summary: 个人实人刷脸认证-认证开始
     * @param CertifyBaasPlusIndividualidFaceauthRequest $request
     * @return CertifyBaasPlusIndividualidFaceauthResponse
     */
    public function certifyBaasPlusIndividualidFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->certifyBaasPlusIndividualidFaceauthEx($request, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证——认证开始
     * Summary: 个人实人刷脸认证-认证开始
     * @param CertifyBaasPlusIndividualidFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return CertifyBaasPlusIndividualidFaceauthResponse
     */
    public function certifyBaasPlusIndividualidFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return CertifyBaasPlusIndividualidFaceauthResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.faceauth.certify", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证——查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果
     * @param QueryBaasPlusIndividualidFaceauthRequest $request
     * @return QueryBaasPlusIndividualidFaceauthResponse
     */
    public function queryBaasPlusIndividualidFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIndividualidFaceauthEx($request, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证——查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果
     * @param QueryBaasPlusIndividualidFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIndividualidFaceauthResponse
     */
    public function queryBaasPlusIndividualidFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIndividualidFaceauthResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.faceauth.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取区块链当前块高
     * Summary: 区块链数据服务-获取区块链当前块高
     * @param GetBaasPlusDataserviceBlockchainheightRequest $request
     * @return GetBaasPlusDataserviceBlockchainheightResponse
     */
    public function getBaasPlusDataserviceBlockchainheight($request){
        $runtime = new RuntimeOptions([]);
        return $this->getBaasPlusDataserviceBlockchainheightEx($request, $runtime);
    }

    /**
     * Description: 获取区块链当前块高
     * Summary: 区块链数据服务-获取区块链当前块高
     * @param GetBaasPlusDataserviceBlockchainheightRequest $request
     * @param RuntimeOptions $runtime
     * @return GetBaasPlusDataserviceBlockchainheightResponse
     */
    public function getBaasPlusDataserviceBlockchainheightEx($request, $runtime){
        Utils::validateModel($request);
        return GetBaasPlusDataserviceBlockchainheightResponse::fromMap($this->doRequest("1.0", "baas.plus.dataservice.blockchainheight.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取链交易总数
     * Summary: 区块链数据服务-获取链交易总数
     * @param GetBaasPlusDataserviceTransactioncountRequest $request
     * @return GetBaasPlusDataserviceTransactioncountResponse
     */
    public function getBaasPlusDataserviceTransactioncount($request){
        $runtime = new RuntimeOptions([]);
        return $this->getBaasPlusDataserviceTransactioncountEx($request, $runtime);
    }

    /**
     * Description: 获取链交易总数
     * Summary: 区块链数据服务-获取链交易总数
     * @param GetBaasPlusDataserviceTransactioncountRequest $request
     * @param RuntimeOptions $runtime
     * @return GetBaasPlusDataserviceTransactioncountResponse
     */
    public function getBaasPlusDataserviceTransactioncountEx($request, $runtime){
        Utils::validateModel($request);
        return GetBaasPlusDataserviceTransactioncountResponse::fromMap($this->doRequest("1.0", "baas.plus.dataservice.transactioncount.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 根据交易hash获取交易详情
     * Summary: 区块链数据服务-获取交易详情
     * @param GetBaasPlusDataserviceTransactioninfoRequest $request
     * @return GetBaasPlusDataserviceTransactioninfoResponse
     */
    public function getBaasPlusDataserviceTransactioninfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->getBaasPlusDataserviceTransactioninfoEx($request, $runtime);
    }

    /**
     * Description: 根据交易hash获取交易详情
     * Summary: 区块链数据服务-获取交易详情
     * @param GetBaasPlusDataserviceTransactioninfoRequest $request
     * @param RuntimeOptions $runtime
     * @return GetBaasPlusDataserviceTransactioninfoResponse
     */
    public function getBaasPlusDataserviceTransactioninfoEx($request, $runtime){
        Utils::validateModel($request);
        return GetBaasPlusDataserviceTransactioninfoResponse::fromMap($this->doRequest("1.0", "baas.plus.dataservice.transactioninfo.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取链最近n条块信息
     * Summary: 区块链数据服务-获取链最近n条块信息
     * @param ListBaasPlusDataserviceLastblocksRequest $request
     * @return ListBaasPlusDataserviceLastblocksResponse
     */
    public function listBaasPlusDataserviceLastblocks($request){
        $runtime = new RuntimeOptions([]);
        return $this->listBaasPlusDataserviceLastblocksEx($request, $runtime);
    }

    /**
     * Description: 获取链最近n条块信息
     * Summary: 区块链数据服务-获取链最近n条块信息
     * @param ListBaasPlusDataserviceLastblocksRequest $request
     * @param RuntimeOptions $runtime
     * @return ListBaasPlusDataserviceLastblocksResponse
     */
    public function listBaasPlusDataserviceLastblocksEx($request, $runtime){
        Utils::validateModel($request);
        return ListBaasPlusDataserviceLastblocksResponse::fromMap($this->doRequest("1.0", "baas.plus.dataservice.lastblocks.list", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可信时间服务——获取时间凭证
     * Summary: 可信时间凭证服务-获取时间凭证
     * @param GetBaasPlusTasAttestationRequest $request
     * @return GetBaasPlusTasAttestationResponse
     */
    public function getBaasPlusTasAttestation($request){
        $runtime = new RuntimeOptions([]);
        return $this->getBaasPlusTasAttestationEx($request, $runtime);
    }

    /**
     * Description: 可信时间服务——获取时间凭证
     * Summary: 可信时间凭证服务-获取时间凭证
     * @param GetBaasPlusTasAttestationRequest $request
     * @param RuntimeOptions $runtime
     * @return GetBaasPlusTasAttestationResponse
     */
    public function getBaasPlusTasAttestationEx($request, $runtime){
        Utils::validateModel($request);
        return GetBaasPlusTasAttestationResponse::fromMap($this->doRequest("1.0", "baas.plus.tas.attestation.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可信时间 ——校验时间凭证接口
     * Summary: 可信时间凭证服务-校验时间凭证接口
     * @param VerifyBaasPlusTasCtsrRequest $request
     * @return VerifyBaasPlusTasCtsrResponse
     */
    public function verifyBaasPlusTasCtsr($request){
        $runtime = new RuntimeOptions([]);
        return $this->verifyBaasPlusTasCtsrEx($request, $runtime);
    }

    /**
     * Description: 可信时间 ——校验时间凭证接口
     * Summary: 可信时间凭证服务-校验时间凭证接口
     * @param VerifyBaasPlusTasCtsrRequest $request
     * @param RuntimeOptions $runtime
     * @return VerifyBaasPlusTasCtsrResponse
     */
    public function verifyBaasPlusTasCtsrEx($request, $runtime){
        Utils::validateModel($request);
        return VerifyBaasPlusTasCtsrResponse::fromMap($this->doRequest("1.0", "baas.plus.tas.ctsr.verify", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 通过sn下载时间凭证证书（pdf格式）
     * Summary: 可信时间凭证服务-下载时间凭证证书
     * @param GetBaasPlusTasCertificateRequest $request
     * @return GetBaasPlusTasCertificateResponse
     */
    public function getBaasPlusTasCertificate($request){
        $runtime = new RuntimeOptions([]);
        return $this->getBaasPlusTasCertificateEx($request, $runtime);
    }

    /**
     * Description: 通过sn下载时间凭证证书（pdf格式）
     * Summary: 可信时间凭证服务-下载时间凭证证书
     * @param GetBaasPlusTasCertificateRequest $request
     * @param RuntimeOptions $runtime
     * @return GetBaasPlusTasCertificateResponse
     */
    public function getBaasPlusTasCertificateEx($request, $runtime){
        Utils::validateModel($request);
        return GetBaasPlusTasCertificateResponse::fromMap($this->doRequest("1.0", "baas.plus.tas.certificate.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可信时间——获取带事务的时间凭证
     * Summary: 可信时间——获取带事务的时间凭证
     * @param GetBaasPlusTasTransactionattestationRequest $request
     * @return GetBaasPlusTasTransactionattestationResponse
     */
    public function getBaasPlusTasTransactionattestation($request){
        $runtime = new RuntimeOptions([]);
        return $this->getBaasPlusTasTransactionattestationEx($request, $runtime);
    }

    /**
     * Description: 可信时间——获取带事务的时间凭证
     * Summary: 可信时间——获取带事务的时间凭证
     * @param GetBaasPlusTasTransactionattestationRequest $request
     * @param RuntimeOptions $runtime
     * @return GetBaasPlusTasTransactionattestationResponse
     */
    public function getBaasPlusTasTransactionattestationEx($request, $runtime){
        Utils::validateModel($request);
        return GetBaasPlusTasTransactionattestationResponse::fromMap($this->doRequest("1.0", "baas.plus.tas.transactionattestation.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素
     * @param QueryBaasPlusEverifyFourmetaRequest $request
     * @return QueryBaasPlusEverifyFourmetaResponse
     */
    public function queryBaasPlusEverifyFourmeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEverifyFourmetaEx($request, $runtime);
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素
     * @param QueryBaasPlusEverifyFourmetaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEverifyFourmetaResponse
     */
    public function queryBaasPlusEverifyFourmetaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEverifyFourmetaResponse::fromMap($this->doRequest("1.0", "baas.plus.everify.fourmeta.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素
     * @param QueryBaasPlusEverifyThreemetaRequest $request
     * @return QueryBaasPlusEverifyThreemetaResponse
     */
    public function queryBaasPlusEverifyThreemeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEverifyThreemetaEx($request, $runtime);
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素
     * @param QueryBaasPlusEverifyThreemetaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEverifyThreemetaResponse
     */
    public function queryBaasPlusEverifyThreemetaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEverifyThreemetaResponse::fromMap($this->doRequest("1.0", "baas.plus.everify.threemeta.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素
     * @param QueryBaasPlusEverifyTwometaRequest $request
     * @return QueryBaasPlusEverifyTwometaResponse
     */
    public function queryBaasPlusEverifyTwometa($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEverifyTwometaEx($request, $runtime);
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素
     * @param QueryBaasPlusEverifyTwometaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEverifyTwometaResponse
     */
    public function queryBaasPlusEverifyTwometaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEverifyTwometaResponse::fromMap($this->doRequest("1.0", "baas.plus.everify.twometa.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 内容搜索查询接口
     * Summary: 内容搜索查询接口
     * @param QueryBaasPlusBaicorpInternalsearchlibraryRequest $request
     * @return QueryBaasPlusBaicorpInternalsearchlibraryResponse
     */
    public function queryBaasPlusBaicorpInternalsearchlibrary($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusBaicorpInternalsearchlibraryEx($request, $runtime);
    }

    /**
     * Description: 内容搜索查询接口
     * Summary: 内容搜索查询接口
     * @param QueryBaasPlusBaicorpInternalsearchlibraryRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusBaicorpInternalsearchlibraryResponse
     */
    public function queryBaasPlusBaicorpInternalsearchlibraryEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusBaicorpInternalsearchlibraryResponse::fromMap($this->doRequest("1.0", "baas.plus.baicorp.internalsearchlibrary.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新检索
     * Summary: 更新检索
     * @param UpdateBaasPlusBaicorpInternalsearchlibraryRequest $request
     * @return UpdateBaasPlusBaicorpInternalsearchlibraryResponse
     */
    public function updateBaasPlusBaicorpInternalsearchlibrary($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateBaasPlusBaicorpInternalsearchlibraryEx($request, $runtime);
    }

    /**
     * Description: 更新检索
     * Summary: 更新检索
     * @param UpdateBaasPlusBaicorpInternalsearchlibraryRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateBaasPlusBaicorpInternalsearchlibraryResponse
     */
    public function updateBaasPlusBaicorpInternalsearchlibraryEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateBaasPlusBaicorpInternalsearchlibraryResponse::fromMap($this->doRequest("1.0", "baas.plus.baicorp.internalsearchlibrary.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 对公打款-总行查询
     * Summary: 对公打款-总行查询
     * @param QueryBaasPlusEpayauthRootbankRequest $request
     * @return QueryBaasPlusEpayauthRootbankResponse
     */
    public function queryBaasPlusEpayauthRootbank($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEpayauthRootbankEx($request, $runtime);
    }

    /**
     * Description: 对公打款-总行查询
     * Summary: 对公打款-总行查询
     * @param QueryBaasPlusEpayauthRootbankRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEpayauthRootbankResponse
     */
    public function queryBaasPlusEpayauthRootbankEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEpayauthRootbankResponse::fromMap($this->doRequest("1.0", "baas.plus.epayauth.rootbank.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
     * Summary: 业务申请保护
     * @param QueryBaasPlusYdapplyprotEcapplyRequest $request
     * @return QueryBaasPlusYdapplyprotEcapplyResponse
     */
    public function queryBaasPlusYdapplyprotEcapply($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusYdapplyprotEcapplyEx($request, $runtime);
    }

    /**
     * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
     * Summary: 业务申请保护
     * @param QueryBaasPlusYdapplyprotEcapplyRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusYdapplyprotEcapplyResponse
     */
    public function queryBaasPlusYdapplyprotEcapplyEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusYdapplyprotEcapplyResponse::fromMap($this->doRequest("1.0", "baas.plus.ydapplyprot.ecapply.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
     * Summary: 先享后付保护
     * @param QueryBaasPlusYdpacprotEcpacRequest $request
     * @return QueryBaasPlusYdpacprotEcpacResponse
     */
    public function queryBaasPlusYdpacprotEcpac($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusYdpacprotEcpacEx($request, $runtime);
    }

    /**
     * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
     * Summary: 先享后付保护
     * @param QueryBaasPlusYdpacprotEcpacRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusYdpacprotEcpacResponse
     */
    public function queryBaasPlusYdpacprotEcpacEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusYdpacprotEcpacResponse::fromMap($this->doRequest("1.0", "baas.plus.ydpacprot.ecpac.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     * @param QueryBaasPlusYdauthprotTwometaRequest $request
     * @return QueryBaasPlusYdauthprotTwometaResponse
     */
    public function queryBaasPlusYdauthprotTwometa($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusYdauthprotTwometaEx($request, $runtime);
    }

    /**
     * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     * @param QueryBaasPlusYdauthprotTwometaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusYdauthprotTwometaResponse
     */
    public function queryBaasPlusYdauthprotTwometaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusYdauthprotTwometaResponse::fromMap($this->doRequest("1.0", "baas.plus.ydauthprot.twometa.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     * @param QueryBaasPlusYdauthprotThreemetaRequest $request
     * @return QueryBaasPlusYdauthprotThreemetaResponse
     */
    public function queryBaasPlusYdauthprotThreemeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusYdauthprotThreemetaEx($request, $runtime);
    }

    /**
     * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     * @param QueryBaasPlusYdauthprotThreemetaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusYdauthprotThreemetaResponse
     */
    public function queryBaasPlusYdauthprotThreemetaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusYdauthprotThreemetaResponse::fromMap($this->doRequest("1.0", "baas.plus.ydauthprot.threemeta.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     * @param QueryBaasPlusYdauthprotFourmetaRequest $request
     * @return QueryBaasPlusYdauthprotFourmetaResponse
     */
    public function queryBaasPlusYdauthprotFourmeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusYdauthprotFourmetaEx($request, $runtime);
    }

    /**
     * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
     * Summary: 身份认证保护
     * @param QueryBaasPlusYdauthprotFourmetaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusYdauthprotFourmetaResponse
     */
    public function queryBaasPlusYdauthprotFourmetaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusYdauthprotFourmetaResponse::fromMap($this->doRequest("1.0", "baas.plus.ydauthprot.fourmeta.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 营销保护
     * Summary: 营销保护
     * @param QueryBaasPlusYdmktprotEcmarketcampaignRequest $request
     * @return QueryBaasPlusYdmktprotEcmarketcampaignResponse
     */
    public function queryBaasPlusYdmktprotEcmarketcampaign($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusYdmktprotEcmarketcampaignEx($request, $runtime);
    }

    /**
     * Description: 营销保护
     * Summary: 营销保护
     * @param QueryBaasPlusYdmktprotEcmarketcampaignRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusYdmktprotEcmarketcampaignResponse
     */
    public function queryBaasPlusYdmktprotEcmarketcampaignEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusYdmktprotEcmarketcampaignResponse::fromMap($this->doRequest("1.0", "baas.plus.ydmktprot.ecmarketcampaign.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 注册保护
     * Summary: 注册保护
     * @param QueryBaasPlusYdregprotEcregisterRequest $request
     * @return QueryBaasPlusYdregprotEcregisterResponse
     */
    public function queryBaasPlusYdregprotEcregister($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusYdregprotEcregisterEx($request, $runtime);
    }

    /**
     * Description: 注册保护
     * Summary: 注册保护
     * @param QueryBaasPlusYdregprotEcregisterRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusYdregprotEcregisterResponse
     */
    public function queryBaasPlusYdregprotEcregisterEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusYdregprotEcregisterResponse::fromMap($this->doRequest("1.0", "baas.plus.ydregprot.ecregister.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 支行查询
     * @param QueryBaasPlusEpayauthBranchbankRequest $request
     * @return QueryBaasPlusEpayauthBranchbankResponse
     */
    public function queryBaasPlusEpayauthBranchbank($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEpayauthBranchbankEx($request, $runtime);
    }

    /**
     * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 支行查询
     * @param QueryBaasPlusEpayauthBranchbankRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEpayauthBranchbankResponse
     */
    public function queryBaasPlusEpayauthBranchbankEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEpayauthBranchbankResponse::fromMap($this->doRequest("1.0", "baas.plus.epayauth.branchbank.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 行政地区编码查询
     * @param QueryBaasPlusEpayauthDistrictRequest $request
     * @return QueryBaasPlusEpayauthDistrictResponse
     */
    public function queryBaasPlusEpayauthDistrict($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEpayauthDistrictEx($request, $runtime);
    }

    /**
     * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
     * Summary: 行政地区编码查询
     * @param QueryBaasPlusEpayauthDistrictRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEpayauthDistrictResponse
     */
    public function queryBaasPlusEpayauthDistrictEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEpayauthDistrictResponse::fromMap($this->doRequest("1.0", "baas.plus.epayauth.district.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
     * Summary: 发起打款验证申请
     * @param InitBaasPlusEpayauthVerifyRequest $request
     * @return InitBaasPlusEpayauthVerifyResponse
     */
    public function initBaasPlusEpayauthVerify($request){
        $runtime = new RuntimeOptions([]);
        return $this->initBaasPlusEpayauthVerifyEx($request, $runtime);
    }

    /**
     * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
     * Summary: 发起打款验证申请
     * @param InitBaasPlusEpayauthVerifyRequest $request
     * @param RuntimeOptions $runtime
     * @return InitBaasPlusEpayauthVerifyResponse
     */
    public function initBaasPlusEpayauthVerifyEx($request, $runtime){
        Utils::validateModel($request);
        return InitBaasPlusEpayauthVerifyResponse::fromMap($this->doRequest("1.0", "baas.plus.epayauth.verify.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
     * Summary: 打款验证金额校验
     * @param QueryBaasPlusEpayauthVerifyRequest $request
     * @return QueryBaasPlusEpayauthVerifyResponse
     */
    public function queryBaasPlusEpayauthVerify($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEpayauthVerifyEx($request, $runtime);
    }

    /**
     * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
     * Summary: 打款验证金额校验
     * @param QueryBaasPlusEpayauthVerifyRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEpayauthVerifyResponse
     */
    public function queryBaasPlusEpayauthVerifyEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEpayauthVerifyResponse::fromMap($this->doRequest("1.0", "baas.plus.epayauth.verify.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
     * Summary: 链上交易二维码生成
     * @param QueryBaasPlusBmpbrowserTransactionqrcodeRequest $request
     * @return QueryBaasPlusBmpbrowserTransactionqrcodeResponse
     */
    public function queryBaasPlusBmpbrowserTransactionqrcode($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusBmpbrowserTransactionqrcodeEx($request, $runtime);
    }

    /**
     * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
     * Summary: 链上交易二维码生成
     * @param QueryBaasPlusBmpbrowserTransactionqrcodeRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusBmpbrowserTransactionqrcodeResponse
     */
    public function queryBaasPlusBmpbrowserTransactionqrcodeEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusBmpbrowserTransactionqrcodeResponse::fromMap($this->doRequest("1.0", "baas.plus.bmpbrowser.transactionqrcode.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
     * Summary: 批量开通 链上交易移动端查看权限
     * @param AddBaasPlusBmpbrowserPrivilegeRequest $request
     * @return AddBaasPlusBmpbrowserPrivilegeResponse
     */
    public function addBaasPlusBmpbrowserPrivilege($request){
        $runtime = new RuntimeOptions([]);
        return $this->addBaasPlusBmpbrowserPrivilegeEx($request, $runtime);
    }

    /**
     * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
     * Summary: 批量开通 链上交易移动端查看权限
     * @param AddBaasPlusBmpbrowserPrivilegeRequest $request
     * @param RuntimeOptions $runtime
     * @return AddBaasPlusBmpbrowserPrivilegeResponse
     */
    public function addBaasPlusBmpbrowserPrivilegeEx($request, $runtime){
        Utils::validateModel($request);
        return AddBaasPlusBmpbrowserPrivilegeResponse::fromMap($this->doRequest("1.0", "baas.plus.bmpbrowser.privilege.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 身份证信息识别
     * Summary: 身份证信息识别
     * @param QueryBaasPlusIdcocrIdcardRequest $request
     * @return QueryBaasPlusIdcocrIdcardResponse
     */
    public function queryBaasPlusIdcocrIdcard($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIdcocrIdcardEx($request, $runtime);
    }

    /**
     * Description: 身份证信息识别
     * Summary: 身份证信息识别
     * @param QueryBaasPlusIdcocrIdcardRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIdcocrIdcardResponse
     */
    public function queryBaasPlusIdcocrIdcardEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIdcocrIdcardResponse::fromMap($this->doRequest("1.0", "baas.plus.idcocr.idcard.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 申请证书
     * Summary: 申请证书
     * @param InitBaasPlusCaCertificateRequest $request
     * @return InitBaasPlusCaCertificateResponse
     */
    public function initBaasPlusCaCertificate($request){
        $runtime = new RuntimeOptions([]);
        return $this->initBaasPlusCaCertificateEx($request, $runtime);
    }

    /**
     * Description: 申请证书
     * Summary: 申请证书
     * @param InitBaasPlusCaCertificateRequest $request
     * @param RuntimeOptions $runtime
     * @return InitBaasPlusCaCertificateResponse
     */
    public function initBaasPlusCaCertificateEx($request, $runtime){
        Utils::validateModel($request);
        return InitBaasPlusCaCertificateResponse::fromMap($this->doRequest("1.0", "baas.plus.ca.certificate.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
     * Summary: 内容风险识别接口服务
     * @param InitBaasPlusContentriskInternalRequest $request
     * @return InitBaasPlusContentriskInternalResponse
     */
    public function initBaasPlusContentriskInternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->initBaasPlusContentriskInternalEx($request, $runtime);
    }

    /**
     * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
     * Summary: 内容风险识别接口服务
     * @param InitBaasPlusContentriskInternalRequest $request
     * @param RuntimeOptions $runtime
     * @return InitBaasPlusContentriskInternalResponse
     */
    public function initBaasPlusContentriskInternalEx($request, $runtime){
        Utils::validateModel($request);
        return InitBaasPlusContentriskInternalResponse::fromMap($this->doRequest("1.0", "baas.plus.contentrisk.internal.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
     * Summary: 内容风险识别结果查询接口服务
     * @param QueryBaasPlusContentriskInternalRequest $request
     * @return QueryBaasPlusContentriskInternalResponse
     */
    public function queryBaasPlusContentriskInternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusContentriskInternalEx($request, $runtime);
    }

    /**
     * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
     * Summary: 内容风险识别结果查询接口服务
     * @param QueryBaasPlusContentriskInternalRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusContentriskInternalResponse
     */
    public function queryBaasPlusContentriskInternalEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusContentriskInternalResponse::fromMap($this->doRequest("1.0", "baas.plus.contentrisk.internal.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实人认证服务端比对-认证开始
     * Summary: 个人实人认证服务端比对-认证开始
     * @param InitBaasPlusIndividualidImageauthRequest $request
     * @return InitBaasPlusIndividualidImageauthResponse
     */
    public function initBaasPlusIndividualidImageauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->initBaasPlusIndividualidImageauthEx($request, $runtime);
    }

    /**
     * Description: 个人实人认证服务端比对-认证开始
     * Summary: 个人实人认证服务端比对-认证开始
     * @param InitBaasPlusIndividualidImageauthRequest $request
     * @param RuntimeOptions $runtime
     * @return InitBaasPlusIndividualidImageauthResponse
     */
    public function initBaasPlusIndividualidImageauthEx($request, $runtime){
        Utils::validateModel($request);
        return InitBaasPlusIndividualidImageauthResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.imageauth.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 访问账户生成
     * Summary: 访问账户生成
     * @param AddBaasPlusIotcseAccountRequest $request
     * @return AddBaasPlusIotcseAccountResponse
     */
    public function addBaasPlusIotcseAccount($request){
        $runtime = new RuntimeOptions([]);
        return $this->addBaasPlusIotcseAccountEx($request, $runtime);
    }

    /**
     * Description: 访问账户生成
     * Summary: 访问账户生成
     * @param AddBaasPlusIotcseAccountRequest $request
     * @param RuntimeOptions $runtime
     * @return AddBaasPlusIotcseAccountResponse
     */
    public function addBaasPlusIotcseAccountEx($request, $runtime){
        Utils::validateModel($request);
        return AddBaasPlusIotcseAccountResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.account.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 存证上链
     * Summary: 存证上链
     * @param SaveBaasPlusIotcseEvidenceRequest $request
     * @return SaveBaasPlusIotcseEvidenceResponse
     */
    public function saveBaasPlusIotcseEvidence($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveBaasPlusIotcseEvidenceEx($request, $runtime);
    }

    /**
     * Description: 存证上链
     * Summary: 存证上链
     * @param SaveBaasPlusIotcseEvidenceRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveBaasPlusIotcseEvidenceResponse
     */
    public function saveBaasPlusIotcseEvidenceEx($request, $runtime){
        Utils::validateModel($request);
        return SaveBaasPlusIotcseEvidenceResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.evidence.save", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 存证上链查询
     * Summary: 存证上链查询
     * @param QueryBaasPlusIotcseEvidenceRequest $request
     * @return QueryBaasPlusIotcseEvidenceResponse
     */
    public function queryBaasPlusIotcseEvidence($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIotcseEvidenceEx($request, $runtime);
    }

    /**
     * Description: 存证上链查询
     * Summary: 存证上链查询
     * @param QueryBaasPlusIotcseEvidenceRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIotcseEvidenceResponse
     */
    public function queryBaasPlusIotcseEvidenceEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIotcseEvidenceResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.evidence.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 代理创建企业did
     * Summary: 代理创建企业did
     * @param CreateBaasPlusDidCorporatedidagentRequest $request
     * @return CreateBaasPlusDidCorporatedidagentResponse
     */
    public function createBaasPlusDidCorporatedidagent($request){
        $runtime = new RuntimeOptions([]);
        return $this->createBaasPlusDidCorporatedidagentEx($request, $runtime);
    }

    /**
     * Description: 代理创建企业did
     * Summary: 代理创建企业did
     * @param CreateBaasPlusDidCorporatedidagentRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateBaasPlusDidCorporatedidagentResponse
     */
    public function createBaasPlusDidCorporatedidagentEx($request, $runtime){
        Utils::validateModel($request);
        return CreateBaasPlusDidCorporatedidagentResponse::fromMap($this->doRequest("1.0", "baas.plus.did.corporatedidagent.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证-认证初始化
     * Summary: 个人实人刷脸认证-认证初始化
     * @param InitBaasPlusIndividualidFaceauthinternalRequest $request
     * @return InitBaasPlusIndividualidFaceauthinternalResponse
     */
    public function initBaasPlusIndividualidFaceauthinternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->initBaasPlusIndividualidFaceauthinternalEx($request, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证-认证初始化
     * Summary: 个人实人刷脸认证-认证初始化
     * @param InitBaasPlusIndividualidFaceauthinternalRequest $request
     * @param RuntimeOptions $runtime
     * @return InitBaasPlusIndividualidFaceauthinternalResponse
     */
    public function initBaasPlusIndividualidFaceauthinternalEx($request, $runtime){
        Utils::validateModel($request);
        return InitBaasPlusIndividualidFaceauthinternalResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证-认证开始
     * Summary: 个人实人刷脸认证-认证开始
     * @param CertifyBaasPlusIndividualidFaceauthinternalRequest $request
     * @return CertifyBaasPlusIndividualidFaceauthinternalResponse
     */
    public function certifyBaasPlusIndividualidFaceauthinternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->certifyBaasPlusIndividualidFaceauthinternalEx($request, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证-认证开始
     * Summary: 个人实人刷脸认证-认证开始
     * @param CertifyBaasPlusIndividualidFaceauthinternalRequest $request
     * @param RuntimeOptions $runtime
     * @return CertifyBaasPlusIndividualidFaceauthinternalResponse
     */
    public function certifyBaasPlusIndividualidFaceauthinternalEx($request, $runtime){
        Utils::validateModel($request);
        return CertifyBaasPlusIndividualidFaceauthinternalResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人实人刷脸认证-查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果
     * @param QueryBaasPlusIndividualidFaceauthinternalRequest $request
     * @return QueryBaasPlusIndividualidFaceauthinternalResponse
     */
    public function queryBaasPlusIndividualidFaceauthinternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIndividualidFaceauthinternalEx($request, $runtime);
    }

    /**
     * Description: 个人实人刷脸认证-查询认证结果
     * Summary: 个人实人刷脸认证-查询认证结果
     * @param QueryBaasPlusIndividualidFaceauthinternalRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIndividualidFaceauthinternalResponse
     */
    public function queryBaasPlusIndividualidFaceauthinternalEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIndividualidFaceauthinternalResponse::fromMap($this->doRequest("1.0", "baas.plus.individualid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化
     * @param InitBaasPlusEnterpriseidFaceauthinternalRequest $request
     * @return InitBaasPlusEnterpriseidFaceauthinternalResponse
     */
    public function initBaasPlusEnterpriseidFaceauthinternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->initBaasPlusEnterpriseidFaceauthinternalEx($request, $runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证初始化
     * Summary: 企业认证四要素-法人实人认证初始化
     * @param InitBaasPlusEnterpriseidFaceauthinternalRequest $request
     * @param RuntimeOptions $runtime
     * @return InitBaasPlusEnterpriseidFaceauthinternalResponse
     */
    public function initBaasPlusEnterpriseidFaceauthinternalEx($request, $runtime){
        Utils::validateModel($request);
        return InitBaasPlusEnterpriseidFaceauthinternalResponse::fromMap($this->doRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始
     * @param CertifyBaasPlusEnterpriseidFaceauthinternalRequest $request
     * @return CertifyBaasPlusEnterpriseidFaceauthinternalResponse
     */
    public function certifyBaasPlusEnterpriseidFaceauthinternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->certifyBaasPlusEnterpriseidFaceauthinternalEx($request, $runtime);
    }

    /**
     * Description: 企业认证四要素-法人实人认证开始
     * Summary: 企业认证四要素-法人实人认证开始
     * @param CertifyBaasPlusEnterpriseidFaceauthinternalRequest $request
     * @param RuntimeOptions $runtime
     * @return CertifyBaasPlusEnterpriseidFaceauthinternalResponse
     */
    public function certifyBaasPlusEnterpriseidFaceauthinternalEx($request, $runtime){
        Utils::validateModel($request);
        return CertifyBaasPlusEnterpriseidFaceauthinternalResponse::fromMap($this->doRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素
     * @param QueryBaasPlusEverifyTwometainternalRequest $request
     * @return QueryBaasPlusEverifyTwometainternalResponse
     */
    public function queryBaasPlusEverifyTwometainternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEverifyTwometainternalEx($request, $runtime);
    }

    /**
     * Description: 企业认证二要素
     * Summary: 企业认证二要素
     * @param QueryBaasPlusEverifyTwometainternalRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEverifyTwometainternalResponse
     */
    public function queryBaasPlusEverifyTwometainternalEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEverifyTwometainternalResponse::fromMap($this->doRequest("1.0", "baas.plus.everify.twometainternal.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素
     * @param QueryBaasPlusEverifyThreemetainternalRequest $request
     * @return QueryBaasPlusEverifyThreemetainternalResponse
     */
    public function queryBaasPlusEverifyThreemetainternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEverifyThreemetainternalEx($request, $runtime);
    }

    /**
     * Description: 企业认证三要素
     * Summary: 企业认证三要素
     * @param QueryBaasPlusEverifyThreemetainternalRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEverifyThreemetainternalResponse
     */
    public function queryBaasPlusEverifyThreemetainternalEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEverifyThreemetainternalResponse::fromMap($this->doRequest("1.0", "baas.plus.everify.threemetainternal.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素
     * @param QueryBaasPlusEverifyFourmetainternalRequest $request
     * @return QueryBaasPlusEverifyFourmetainternalResponse
     */
    public function queryBaasPlusEverifyFourmetainternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEverifyFourmetainternalEx($request, $runtime);
    }

    /**
     * Description: 企业认证四要素
     * Summary: 企业认证四要素
     * @param QueryBaasPlusEverifyFourmetainternalRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEverifyFourmetainternalResponse
     */
    public function queryBaasPlusEverifyFourmetainternalEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEverifyFourmetainternalResponse::fromMap($this->doRequest("1.0", "baas.plus.everify.fourmetainternal.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果
     * @param QueryBaasPlusEnterpriseidFaceauthinternalRequest $request
     * @return QueryBaasPlusEnterpriseidFaceauthinternalResponse
     */
    public function queryBaasPlusEnterpriseidFaceauthinternal($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusEnterpriseidFaceauthinternalEx($request, $runtime);
    }

    /**
     * Description: 查询企业认证四要素—法人实人认证结果
     * Summary: 查询企业认证四要素—法人实人认证结果
     * @param QueryBaasPlusEnterpriseidFaceauthinternalRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusEnterpriseidFaceauthinternalResponse
     */
    public function queryBaasPlusEnterpriseidFaceauthinternalEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusEnterpriseidFaceauthinternalResponse::fromMap($this->doRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份注册
     * Summary: 物联网区块链身份注册
     * @param AddBaasPlusIotcseThingsdidRequest $request
     * @return AddBaasPlusIotcseThingsdidResponse
     */
    public function addBaasPlusIotcseThingsdid($request){
        $runtime = new RuntimeOptions([]);
        return $this->addBaasPlusIotcseThingsdidEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份注册
     * Summary: 物联网区块链身份注册
     * @param AddBaasPlusIotcseThingsdidRequest $request
     * @param RuntimeOptions $runtime
     * @return AddBaasPlusIotcseThingsdidResponse
     */
    public function addBaasPlusIotcseThingsdidEx($request, $runtime){
        Utils::validateModel($request);
        return AddBaasPlusIotcseThingsdidResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.thingsdid.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份更新
     * Summary: 物联网区块链身份更新
     * @param UpdateBaasPlusIotcseThingsdidRequest $request
     * @return UpdateBaasPlusIotcseThingsdidResponse
     */
    public function updateBaasPlusIotcseThingsdid($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateBaasPlusIotcseThingsdidEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份更新
     * Summary: 物联网区块链身份更新
     * @param UpdateBaasPlusIotcseThingsdidRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateBaasPlusIotcseThingsdidResponse
     */
    public function updateBaasPlusIotcseThingsdidEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateBaasPlusIotcseThingsdidResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.thingsdid.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份查询
     * Summary: 物联网区块链身份查询
     * @param QueryBaasPlusIotcseThingsdidRequest $request
     * @return QueryBaasPlusIotcseThingsdidResponse
     */
    public function queryBaasPlusIotcseThingsdid($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIotcseThingsdidEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份查询
     * Summary: 物联网区块链身份查询
     * @param QueryBaasPlusIotcseThingsdidRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIotcseThingsdidResponse
     */
    public function queryBaasPlusIotcseThingsdidEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIotcseThingsdidResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.thingsdid.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 异步轮询请求
     * 智能合约执行完后异步轮询
     * Summary: 异步轮询请求
     * @param QueryBaasPlusIotcseAsyncprocessRequest $request
     * @return QueryBaasPlusIotcseAsyncprocessResponse
     */
    public function queryBaasPlusIotcseAsyncprocess($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIotcseAsyncprocessEx($request, $runtime);
    }

    /**
     * Description: 异步轮询请求
     * 智能合约执行完后异步轮询
     * Summary: 异步轮询请求
     * @param QueryBaasPlusIotcseAsyncprocessRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIotcseAsyncprocessResponse
     */
    public function queryBaasPlusIotcseAsyncprocessEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIotcseAsyncprocessResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.asyncprocess.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份分组
     * Summary: 物联网区块链身份分组
     * @param ExecBaasPlusIotcseGroupRequest $request
     * @return ExecBaasPlusIotcseGroupResponse
     */
    public function execBaasPlusIotcseGroup($request){
        $runtime = new RuntimeOptions([]);
        return $this->execBaasPlusIotcseGroupEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份分组
     * Summary: 物联网区块链身份分组
     * @param ExecBaasPlusIotcseGroupRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecBaasPlusIotcseGroupResponse
     */
    public function execBaasPlusIotcseGroupEx($request, $runtime){
        Utils::validateModel($request);
        return ExecBaasPlusIotcseGroupResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.group.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链分组设备查询
     * Summary: 物联网区块链分组设备查询
     * @param QueryBaasPlusIotcseGroupdeviceRequest $request
     * @return QueryBaasPlusIotcseGroupdeviceResponse
     */
    public function queryBaasPlusIotcseGroupdevice($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIotcseGroupdeviceEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链分组设备查询
     * Summary: 物联网区块链分组设备查询
     * @param QueryBaasPlusIotcseGroupdeviceRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIotcseGroupdeviceResponse
     */
    public function queryBaasPlusIotcseGroupdeviceEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIotcseGroupdeviceResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.groupdevice.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份设备分组查询
     * Summary: 物联网区块链身份设备分组查询
     * @param QueryBaasPlusIotcseDevicegroupRequest $request
     * @return QueryBaasPlusIotcseDevicegroupResponse
     */
    public function queryBaasPlusIotcseDevicegroup($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIotcseDevicegroupEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份设备分组查询
     * Summary: 物联网区块链身份设备分组查询
     * @param QueryBaasPlusIotcseDevicegroupRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIotcseDevicegroupResponse
     */
    public function queryBaasPlusIotcseDevicegroupEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIotcseDevicegroupResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.devicegroup.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份租户设备查询
     * Summary: 物联网区块链身份租户设备查询
     * @param QueryBaasPlusIotcseTenantdeviceRequest $request
     * @return QueryBaasPlusIotcseTenantdeviceResponse
     */
    public function queryBaasPlusIotcseTenantdevice($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIotcseTenantdeviceEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份租户设备查询
     * Summary: 物联网区块链身份租户设备查询
     * @param QueryBaasPlusIotcseTenantdeviceRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIotcseTenantdeviceResponse
     */
    public function queryBaasPlusIotcseTenantdeviceEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIotcseTenantdeviceResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.tenantdevice.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份设备状态更新
     * Summary: 物联网区块链身份设备状态更新
     * @param UpdateBaasPlusIotcseDevicestatusRequest $request
     * @return UpdateBaasPlusIotcseDevicestatusResponse
     */
    public function updateBaasPlusIotcseDevicestatus($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateBaasPlusIotcseDevicestatusEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份设备状态更新
     * Summary: 物联网区块链身份设备状态更新
     * @param UpdateBaasPlusIotcseDevicestatusRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateBaasPlusIotcseDevicestatusResponse
     */
    public function updateBaasPlusIotcseDevicestatusEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateBaasPlusIotcseDevicestatusResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.devicestatus.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份设备物模型查询
     * Summary: 物联网区块链身份设备物模型查询
     * @param QueryBaasPlusIotcseDevicemodelRequest $request
     * @return QueryBaasPlusIotcseDevicemodelResponse
     */
    public function queryBaasPlusIotcseDevicemodel($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIotcseDevicemodelEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份设备物模型查询
     * Summary: 物联网区块链身份设备物模型查询
     * @param QueryBaasPlusIotcseDevicemodelRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIotcseDevicemodelResponse
     */
    public function queryBaasPlusIotcseDevicemodelEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIotcseDevicemodelResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.devicemodel.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份设备空间关联
     * Summary: 物联网区块链身份设备空间关联
     * @param UpdateBaasPlusIotcseDevicespaceRequest $request
     * @return UpdateBaasPlusIotcseDevicespaceResponse
     */
    public function updateBaasPlusIotcseDevicespace($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateBaasPlusIotcseDevicespaceEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份设备空间关联
     * Summary: 物联网区块链身份设备空间关联
     * @param UpdateBaasPlusIotcseDevicespaceRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateBaasPlusIotcseDevicespaceResponse
     */
    public function updateBaasPlusIotcseDevicespaceEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateBaasPlusIotcseDevicespaceResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.devicespace.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 物联网区块链身份批量存证数据读取
     * Summary: 物联网区块链身份批量存证数据读取
     * @param QueryBaasPlusIotcseEvidencebatchRequest $request
     * @return QueryBaasPlusIotcseEvidencebatchResponse
     */
    public function queryBaasPlusIotcseEvidencebatch($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusIotcseEvidencebatchEx($request, $runtime);
    }

    /**
     * Description: 物联网区块链身份批量存证数据读取
     * Summary: 物联网区块链身份批量存证数据读取
     * @param QueryBaasPlusIotcseEvidencebatchRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusIotcseEvidencebatchResponse
     */
    public function queryBaasPlusIotcseEvidencebatchEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusIotcseEvidencebatchResponse::fromMap($this->doRequest("1.0", "baas.plus.iotcse.evidencebatch.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: AI认知服务营业执照ocr服务
     * Summary: AI认知服务营业执照ocr服务
     * @param QueryBaasPlusBlocrBusinesslicenseRequest $request
     * @return QueryBaasPlusBlocrBusinesslicenseResponse
     */
    public function queryBaasPlusBlocrBusinesslicense($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusBlocrBusinesslicenseEx($request, $runtime);
    }

    /**
     * Description: AI认知服务营业执照ocr服务
     * Summary: AI认知服务营业执照ocr服务
     * @param QueryBaasPlusBlocrBusinesslicenseRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusBlocrBusinesslicenseResponse
     */
    public function queryBaasPlusBlocrBusinesslicenseEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusBlocrBusinesslicenseResponse::fromMap($this->doRequest("1.0", "baas.plus.blocr.businesslicense.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: AI认知服务增值税发票ocr识别
     * Summary: AI认知服务增值税发票ocr识别
     * @param QueryBaasPlusInvoicesocrVatinvoiceRequest $request
     * @return QueryBaasPlusInvoicesocrVatinvoiceResponse
     */
    public function queryBaasPlusInvoicesocrVatinvoice($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusInvoicesocrVatinvoiceEx($request, $runtime);
    }

    /**
     * Description: AI认知服务增值税发票ocr识别
     * Summary: AI认知服务增值税发票ocr识别
     * @param QueryBaasPlusInvoicesocrVatinvoiceRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusInvoicesocrVatinvoiceResponse
     */
    public function queryBaasPlusInvoicesocrVatinvoiceEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusInvoicesocrVatinvoiceResponse::fromMap($this->doRequest("1.0", "baas.plus.invoicesocr.vatinvoice.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询用户链上交易移动端查看权限
     * Summary: 查询用户链上交易移动端查看权限
     * @param QueryBaasPlusBmpbrowserPrivilegeRequest $request
     * @return QueryBaasPlusBmpbrowserPrivilegeResponse
     */
    public function queryBaasPlusBmpbrowserPrivilege($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBaasPlusBmpbrowserPrivilegeEx($request, $runtime);
    }

    /**
     * Description: 查询用户链上交易移动端查看权限
     * Summary: 查询用户链上交易移动端查看权限
     * @param QueryBaasPlusBmpbrowserPrivilegeRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBaasPlusBmpbrowserPrivilegeResponse
     */
    public function queryBaasPlusBmpbrowserPrivilegeEx($request, $runtime){
        Utils::validateModel($request);
        return QueryBaasPlusBmpbrowserPrivilegeResponse::fromMap($this->doRequest("1.0", "baas.plus.bmpbrowser.privilege.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 批量取消 链上交易移动端查看权限
     * Summary: 批量取消 链上交易移动端查看权限
     * @param CancelBaasPlusBmpbrowserPrivilegeRequest $request
     * @return CancelBaasPlusBmpbrowserPrivilegeResponse
     */
    public function cancelBaasPlusBmpbrowserPrivilege($request){
        $runtime = new RuntimeOptions([]);
        return $this->cancelBaasPlusBmpbrowserPrivilegeEx($request, $runtime);
    }

    /**
     * Description: 批量取消 链上交易移动端查看权限
     * Summary: 批量取消 链上交易移动端查看权限
     * @param CancelBaasPlusBmpbrowserPrivilegeRequest $request
     * @param RuntimeOptions $runtime
     * @return CancelBaasPlusBmpbrowserPrivilegeResponse
     */
    public function cancelBaasPlusBmpbrowserPrivilegeEx($request, $runtime){
        Utils::validateModel($request);
        return CancelBaasPlusBmpbrowserPrivilegeResponse::fromMap($this->doRequest("1.0", "baas.plus.bmpbrowser.privilege.cancel", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }
}
