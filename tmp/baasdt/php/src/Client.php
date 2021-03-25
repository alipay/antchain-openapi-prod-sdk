<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Response;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;

use AntChain\BAASDT\Models\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BAASDT\Models\ExecAasAntdaoCardCreateRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoCardCreateResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoCardQueryRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoCardQueryResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoCardBindnameRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoCardBindnameResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoCardChargeRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoCardChargeResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoCardWriteoffRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoCardWriteoffResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoCardExpiredRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoCardExpiredResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoCardForbiddenRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoCardForbiddenResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoCardChargeresetRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoCardChargeresetResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantUserRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantUserResponse;
use AntChain\BAASDT\Models\CreateAasAntdaoMerchantUserRequest;
use AntChain\BAASDT\Models\CreateAasAntdaoMerchantUserResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantResponse;
use AntChain\BAASDT\Models\UploadAasAntdaoImageRequest;
use AntChain\BAASDT\Models\UploadAasAntdaoImageResponse;
use AntChain\BAASDT\Models\GetAasAntdaoPkiPublickeyRequest;
use AntChain\BAASDT\Models\GetAasAntdaoPkiPublickeyResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoPkiEncryptRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoPkiEncryptResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoPkiDecryptRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoPkiDecryptResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoMerchantFriendRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoMerchantFriendResponse;
use AntChain\BAASDT\Models\CreateAasAntdaoEquityRequest;
use AntChain\BAASDT\Models\CreateAasAntdaoEquityResponse;
use AntChain\BAASDT\Models\OfflineAasAntdaoEquityRequest;
use AntChain\BAASDT\Models\OfflineAasAntdaoEquityResponse;
use AntChain\BAASDT\Models\FreezeAasAntdaoEquityRequest;
use AntChain\BAASDT\Models\FreezeAasAntdaoEquityResponse;
use AntChain\BAASDT\Models\OpenAasAntdaoEquityMerchantRequest;
use AntChain\BAASDT\Models\OpenAasAntdaoEquityMerchantResponse;
use AntChain\BAASDT\Models\AuthAasAntdaoEquityMerchantuserpriceRequest;
use AntChain\BAASDT\Models\AuthAasAntdaoEquityMerchantuserpriceResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityDefaultpriceRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityDefaultpriceResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityTenantpriceRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityTenantpriceResponse;
use AntChain\BAASDT\Models\AddAasAntdaoEquityCountRequest;
use AntChain\BAASDT\Models\AddAasAntdaoEquityCountResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityExchangelimitRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityExchangelimitResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityValidtimeRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityValidtimeResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoEquityRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoEquityResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeByuserRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeByuserResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeBymerchantRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeBymerchantResponse;
use AntChain\BAASDT\Models\ConfirmAasAntdaoExchangeRequest;
use AntChain\BAASDT\Models\ConfirmAasAntdaoExchangeResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeOutofstoreRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeOutofstoreResponse;
use AntChain\BAASDT\Models\SendAasAntdaoExchangeRequest;
use AntChain\BAASDT\Models\SendAasAntdaoExchangeResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeReceivebyuserRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeReceivebyuserResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetExpireRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetExpireResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoAssetInstructionRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoAssetInstructionResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoExchangeInstructionRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoExchangeInstructionResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetIssueRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetIssueResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetRedeemRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetRedeemResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetGrantRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetGrantResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetGrantrefundRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetGrantrefundResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetAdjustRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetAdjustResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoAssetRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoAssetResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeReceivebymerchantRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeReceivebymerchantResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockLastblocknumberRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockLastblocknumberResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoEquityCreateresultRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoEquityCreateresultResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoEquityInstructionRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoEquityInstructionResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoImageRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoImageResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityStatusRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoEquityStatusResponse;
use AntChain\BAASDT\Models\SetAasAntdaoMerchantProvisionRequest;
use AntChain\BAASDT\Models\SetAasAntdaoMerchantProvisionResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoMerchantProvisionRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoMerchantProvisionResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoEquityInstructionwriteoffRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoEquityInstructionwriteoffResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantProvisionsRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantProvisionsResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantExchangeableequitylistRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantExchangeableequitylistResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantExchangeableequitydetailRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMerchantExchangeableequitydetailResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetCreateRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetCreateResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetGenerateRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoAssetGenerateResponse;
use AntChain\BAASDT\Models\CreateAasAntdaoMerchantRequest;
use AntChain\BAASDT\Models\CreateAasAntdaoMerchantResponse;
use AntChain\BAASDT\Models\SetAasAntdaoMerchantFundmanagerRequest;
use AntChain\BAASDT\Models\SetAasAntdaoMerchantFundmanagerResponse;
use AntChain\BAASDT\Models\CreateAasAntdaoMerchantProvisionRequest;
use AntChain\BAASDT\Models\CreateAasAntdaoMerchantProvisionResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoConfigDelegaterelationRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoConfigDelegaterelationResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoConfigDelegaterelationRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoConfigDelegaterelationResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoConfigWhitelistRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoConfigWhitelistResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoConfigWhitelistRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoConfigWhitelistResponse;
use AntChain\BAASDT\Models\ApplyAasAntdaoExchangeAftersaleRequest;
use AntChain\BAASDT\Models\ApplyAasAntdaoExchangeAftersaleResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeAgreeaftersaleRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoExchangeAgreeaftersaleResponse;
use AntChain\BAASDT\Models\RefuseAasAntdaoExchangeAftersaleRequest;
use AntChain\BAASDT\Models\RefuseAasAntdaoExchangeAftersaleResponse;
use AntChain\BAASDT\Models\SendAasAntdaoExchangeAftersaleRequest;
use AntChain\BAASDT\Models\SendAasAntdaoExchangeAftersaleResponse;
use AntChain\BAASDT\Models\ConfirmAasAntdaoExchangeAftersaleRequest;
use AntChain\BAASDT\Models\ConfirmAasAntdaoExchangeAftersaleResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoDataDepositRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoDataDepositResponse;
use AntChain\BAASDT\Models\SetAasAntdaoCommissionRequest;
use AntChain\BAASDT\Models\SetAasAntdaoCommissionResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoCommissionRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoCommissionResponse;
use AntChain\BAASDT\Models\SetAasAntdaoCommissionMerchantRequest;
use AntChain\BAASDT\Models\SetAasAntdaoCommissionMerchantResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoCommissionMerchantRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoCommissionMerchantResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisBlockRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisBlockResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisLastblocknumberRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisLastblocknumberResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisOpenedequitiesRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisOpenedequitiesResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoBlockanalysisDelegaterelationRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoBlockanalysisDelegaterelationResponse;
use AntChain\BAASDT\Models\UpdateAasAntdaoBlockanalysisWhitelistRequest;
use AntChain\BAASDT\Models\UpdateAasAntdaoBlockanalysisWhitelistResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisDelegaterelationRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisDelegaterelationResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisWhitelistRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisWhitelistResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisTransactionRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoBlockanalysisTransactionResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsSkuRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsSkuResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsMerchantbalanceRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsMerchantbalanceResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoMypointsPreorderskuRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoMypointsPreorderskuResponse;
use AntChain\BAASDT\Models\ExecAasAntdaoMypointsOrderskuRequest;
use AntChain\BAASDT\Models\ExecAasAntdaoMypointsOrderskuResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsSkufeeRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsSkufeeResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsPreorderinstructionRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsPreorderinstructionResponse;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsOrderinstructionRequest;
use AntChain\BAASDT\Models\QueryAasAntdaoMypointsOrderinstructionResponse;

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
    public function __construct(Config $config){
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
     * @param object $request which contains request params
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return object|array response
     * @throws \Exception
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, RuntimeOptions $runtime){
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
                    "sdkVersion" => "Tea-SDK-20200713"
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
                $signedParam = Tea::merge($_request->query,
                    RpcUtils::query($request));
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
            catch (\Exception $e) {
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
     * @return string agent
     * @throws \Exception
     */
    public function getUserAgent(){
        $userAgent = "TeaClient/1.0.0";
        return Utils::getUserAgent($userAgent);
    }

    /**
     * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-创建卡密
     * @param ExecAasAntdaoCardCreateRequest $request
     * @return ExecAasAntdaoCardCreateResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardCreate(ExecAasAntdaoCardCreateRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoCardCreateEx($request, $runtime);
    }

    /**
     * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-创建卡密
     * @param ExecAasAntdaoCardCreateRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoCardCreateResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardCreateEx(ExecAasAntdaoCardCreateRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoCardCreateResponse::fromMap($this->doRequest("1.0", "baas.antdao.card.create.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-查询卡密
     * @param ExecAasAntdaoCardQueryRequest $request
     * @return ExecAasAntdaoCardQueryResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardQuery(ExecAasAntdaoCardQueryRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoCardQueryEx($request, $runtime);
    }

    /**
     * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-查询卡密
     * @param ExecAasAntdaoCardQueryRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoCardQueryResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardQueryEx(ExecAasAntdaoCardQueryRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoCardQueryResponse::fromMap($this->doRequest("1.0", "baas.antdao.card.query.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-记名卡发行
     * @param ExecAasAntdaoCardBindnameRequest $request
     * @return ExecAasAntdaoCardBindnameResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardBindname(ExecAasAntdaoCardBindnameRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoCardBindnameEx($request, $runtime);
    }

    /**
     * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-记名卡发行
     * @param ExecAasAntdaoCardBindnameRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoCardBindnameResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardBindnameEx(ExecAasAntdaoCardBindnameRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoCardBindnameResponse::fromMap($this->doRequest("1.0", "baas.antdao.card.bindname.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-充值卡密
     * @param ExecAasAntdaoCardChargeRequest $request
     * @return ExecAasAntdaoCardChargeResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardCharge(ExecAasAntdaoCardChargeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoCardChargeEx($request, $runtime);
    }

    /**
     * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-充值卡密
     * @param ExecAasAntdaoCardChargeRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoCardChargeResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardChargeEx(ExecAasAntdaoCardChargeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoCardChargeResponse::fromMap($this->doRequest("1.0", "baas.antdao.card.charge.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-核销卡密
     * @param ExecAasAntdaoCardWriteoffRequest $request
     * @return ExecAasAntdaoCardWriteoffResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardWriteoff(ExecAasAntdaoCardWriteoffRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoCardWriteoffEx($request, $runtime);
    }

    /**
     * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-核销卡密
     * @param ExecAasAntdaoCardWriteoffRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoCardWriteoffResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardWriteoffEx(ExecAasAntdaoCardWriteoffRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoCardWriteoffResponse::fromMap($this->doRequest("1.0", "baas.antdao.card.writeoff.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-过期卡密
     * @param ExecAasAntdaoCardExpiredRequest $request
     * @return ExecAasAntdaoCardExpiredResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardExpired(ExecAasAntdaoCardExpiredRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoCardExpiredEx($request, $runtime);
    }

    /**
     * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-过期卡密
     * @param ExecAasAntdaoCardExpiredRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoCardExpiredResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardExpiredEx(ExecAasAntdaoCardExpiredRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoCardExpiredResponse::fromMap($this->doRequest("1.0", "baas.antdao.card.expired.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-风控禁用卡密
     * @param ExecAasAntdaoCardForbiddenRequest $request
     * @return ExecAasAntdaoCardForbiddenResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardForbidden(ExecAasAntdaoCardForbiddenRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoCardForbiddenEx($request, $runtime);
    }

    /**
     * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-风控禁用卡密
     * @param ExecAasAntdaoCardForbiddenRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoCardForbiddenResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardForbiddenEx(ExecAasAntdaoCardForbiddenRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoCardForbiddenResponse::fromMap($this->doRequest("1.0", "baas.antdao.card.forbidden.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-充值重置卡密
     * @param ExecAasAntdaoCardChargeresetRequest $request
     * @return ExecAasAntdaoCardChargeresetResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardChargereset(ExecAasAntdaoCardChargeresetRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoCardChargeresetEx($request, $runtime);
    }

    /**
     * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-充值重置卡密
     * @param ExecAasAntdaoCardChargeresetRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoCardChargeresetResponse
     * @throws \Exception
     */
    public function execAasAntdaoCardChargeresetEx(ExecAasAntdaoCardChargeresetRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoCardChargeresetResponse::fromMap($this->doRequest("1.0", "baas.antdao.card.chargereset.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询调用商户下的用户信息
     * Summary: 数字商品服务-商户管理-查询用户信息
     * @param QueryAasAntdaoMerchantUserRequest $request
     * @return QueryAasAntdaoMerchantUserResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchantUser(QueryAasAntdaoMerchantUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMerchantUserEx($request, $runtime);
    }

    /**
     * Description: 查询调用商户下的用户信息
     * Summary: 数字商品服务-商户管理-查询用户信息
     * @param QueryAasAntdaoMerchantUserRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMerchantUserResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchantUserEx(QueryAasAntdaoMerchantUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMerchantUserResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.user.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建商户管理下的用户
     * Summary: 数字商品服务-商户管理-商户创建用户
     * @param CreateAasAntdaoMerchantUserRequest $request
     * @return CreateAasAntdaoMerchantUserResponse
     * @throws \Exception
     */
    public function createAasAntdaoMerchantUser(CreateAasAntdaoMerchantUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasAntdaoMerchantUserEx($request, $runtime);
    }

    /**
     * Description: 创建商户管理下的用户
     * Summary: 数字商品服务-商户管理-商户创建用户
     * @param CreateAasAntdaoMerchantUserRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasAntdaoMerchantUserResponse
     * @throws \Exception
     */
    public function createAasAntdaoMerchantUserEx(CreateAasAntdaoMerchantUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasAntdaoMerchantUserResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.user.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
     * Summary: 数字商品服务-商户管理-查询商户信息
     * @param QueryAasAntdaoMerchantRequest $request
     * @return QueryAasAntdaoMerchantResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchant(QueryAasAntdaoMerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMerchantEx($request, $runtime);
    }

    /**
     * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
     * Summary: 数字商品服务-商户管理-查询商户信息
     * @param QueryAasAntdaoMerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMerchantResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchantEx(QueryAasAntdaoMerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMerchantResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
     * Summary: 数字商品服务-OSS服务-上传图片
     * @param UploadAasAntdaoImageRequest $request
     * @return UploadAasAntdaoImageResponse
     * @throws \Exception
     */
    public function uploadAasAntdaoImage(UploadAasAntdaoImageRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadAasAntdaoImageEx($request, $runtime);
    }

    /**
     * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
     * Summary: 数字商品服务-OSS服务-上传图片
     * @param UploadAasAntdaoImageRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadAasAntdaoImageResponse
     * @throws \Exception
     */
    public function uploadAasAntdaoImageEx(UploadAasAntdaoImageRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UploadAasAntdaoImageResponse::fromMap($this->doRequest("1.0", "baas.antdao.image.upload", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取kms中对应用户的公钥
     * Summary: 数字商品服务-密钥管理-获取用户公钥
     * @param GetAasAntdaoPkiPublickeyRequest $request
     * @return GetAasAntdaoPkiPublickeyResponse
     * @throws \Exception
     */
    public function getAasAntdaoPkiPublickey(GetAasAntdaoPkiPublickeyRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->getAasAntdaoPkiPublickeyEx($request, $runtime);
    }

    /**
     * Description: 获取kms中对应用户的公钥
     * Summary: 数字商品服务-密钥管理-获取用户公钥
     * @param GetAasAntdaoPkiPublickeyRequest $request
     * @param RuntimeOptions $runtime
     * @return GetAasAntdaoPkiPublickeyResponse
     * @throws \Exception
     */
    public function getAasAntdaoPkiPublickeyEx(GetAasAntdaoPkiPublickeyRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return GetAasAntdaoPkiPublickeyResponse::fromMap($this->doRequest("1.0", "baas.antdao.pki.publickey.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: ECC公钥加密接口
     * Summary: 数字商品服务-密钥管理-公钥加密
     * @param ExecAasAntdaoPkiEncryptRequest $request
     * @return ExecAasAntdaoPkiEncryptResponse
     * @throws \Exception
     */
    public function execAasAntdaoPkiEncrypt(ExecAasAntdaoPkiEncryptRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoPkiEncryptEx($request, $runtime);
    }

    /**
     * Description: ECC公钥加密接口
     * Summary: 数字商品服务-密钥管理-公钥加密
     * @param ExecAasAntdaoPkiEncryptRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoPkiEncryptResponse
     * @throws \Exception
     */
    public function execAasAntdaoPkiEncryptEx(ExecAasAntdaoPkiEncryptRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoPkiEncryptResponse::fromMap($this->doRequest("1.0", "baas.antdao.pki.encrypt.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: ECC解密算法接口
     * Summary: 数字商品服务-密钥管理-私钥解密
     * @param ExecAasAntdaoPkiDecryptRequest $request
     * @return ExecAasAntdaoPkiDecryptResponse
     * @throws \Exception
     */
    public function execAasAntdaoPkiDecrypt(ExecAasAntdaoPkiDecryptRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoPkiDecryptEx($request, $runtime);
    }

    /**
     * Description: ECC解密算法接口
     * Summary: 数字商品服务-密钥管理-私钥解密
     * @param ExecAasAntdaoPkiDecryptRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoPkiDecryptResponse
     * @throws \Exception
     */
    public function execAasAntdaoPkiDecryptEx(ExecAasAntdaoPkiDecryptRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoPkiDecryptResponse::fromMap($this->doRequest("1.0", "baas.antdao.pki.decrypt.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商户的友商信息
     * Summary: 数字商品服务-商户管理-更新商户友商
     * @param UpdateAasAntdaoMerchantFriendRequest $request
     * @return UpdateAasAntdaoMerchantFriendResponse
     * @throws \Exception
     */
    public function updateAasAntdaoMerchantFriend(UpdateAasAntdaoMerchantFriendRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoMerchantFriendEx($request, $runtime);
    }

    /**
     * Description: 更新商户的友商信息
     * Summary: 数字商品服务-商户管理-更新商户友商
     * @param UpdateAasAntdaoMerchantFriendRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoMerchantFriendResponse
     * @throws \Exception
     */
    public function updateAasAntdaoMerchantFriendEx(UpdateAasAntdaoMerchantFriendRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoMerchantFriendResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.friend.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商品供应商户发布一个商品
     * Summary: 数字商品服务-商品服务-创建商品
     * @param CreateAasAntdaoEquityRequest $request
     * @return CreateAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function createAasAntdaoEquity(CreateAasAntdaoEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasAntdaoEquityEx($request, $runtime);
    }

    /**
     * Description: 商品供应商户发布一个商品
     * Summary: 数字商品服务-商品服务-创建商品
     * @param CreateAasAntdaoEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function createAasAntdaoEquityEx(CreateAasAntdaoEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasAntdaoEquityResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
     * 下线商品
     * Summary: 数字商品服务-商品服务-下线商品
     * @param OfflineAasAntdaoEquityRequest $request
     * @return OfflineAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function offlineAasAntdaoEquity(OfflineAasAntdaoEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->offlineAasAntdaoEquityEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
     * 下线商品
     * Summary: 数字商品服务-商品服务-下线商品
     * @param OfflineAasAntdaoEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return OfflineAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function offlineAasAntdaoEquityEx(OfflineAasAntdaoEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return OfflineAasAntdaoEquityResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.offline", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至baas.antdao.equity.status.update
     * 冻结权益
     * Summary: 数字商品服务-商品服务-冻结商品
     * @param FreezeAasAntdaoEquityRequest $request
     * @return FreezeAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function freezeAasAntdaoEquity(FreezeAasAntdaoEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->freezeAasAntdaoEquityEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至baas.antdao.equity.status.update
     * 冻结权益
     * Summary: 数字商品服务-商品服务-冻结商品
     * @param FreezeAasAntdaoEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return FreezeAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function freezeAasAntdaoEquityEx(FreezeAasAntdaoEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return FreezeAasAntdaoEquityResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.freeze", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 授权兑换—非公开商品商户配置
     * Summary: 数字商品服务-商品服务-授权兑换
     * @param OpenAasAntdaoEquityMerchantRequest $request
     * @return OpenAasAntdaoEquityMerchantResponse
     * @throws \Exception
     */
    public function openAasAntdaoEquityMerchant(OpenAasAntdaoEquityMerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->openAasAntdaoEquityMerchantEx($request, $runtime);
    }

    /**
     * Description: 授权兑换—非公开商品商户配置
     * Summary: 数字商品服务-商品服务-授权兑换
     * @param OpenAasAntdaoEquityMerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return OpenAasAntdaoEquityMerchantResponse
     * @throws \Exception
     */
    public function openAasAntdaoEquityMerchantEx(OpenAasAntdaoEquityMerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return OpenAasAntdaoEquityMerchantResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.merchant.open", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户兑换价格设置
     * Summary: 数字商品服务-商品服务-用户兑换价格设置
     * @param AuthAasAntdaoEquityMerchantuserpriceRequest $request
     * @return AuthAasAntdaoEquityMerchantuserpriceResponse
     * @throws \Exception
     */
    public function authAasAntdaoEquityMerchantuserprice(AuthAasAntdaoEquityMerchantuserpriceRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->authAasAntdaoEquityMerchantuserpriceEx($request, $runtime);
    }

    /**
     * Description: 用户兑换价格设置
     * Summary: 数字商品服务-商品服务-用户兑换价格设置
     * @param AuthAasAntdaoEquityMerchantuserpriceRequest $request
     * @param RuntimeOptions $runtime
     * @return AuthAasAntdaoEquityMerchantuserpriceResponse
     * @throws \Exception
     */
    public function authAasAntdaoEquityMerchantuserpriceEx(AuthAasAntdaoEquityMerchantuserpriceRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AuthAasAntdaoEquityMerchantuserpriceResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.merchantuserprice.auth", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update 
     * 更新商品价格
     * Summary: 数字商品服务-商品服务-更新商品价格
     * @param UpdateAasAntdaoEquityDefaultpriceRequest $request
     * @return UpdateAasAntdaoEquityDefaultpriceResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityDefaultprice(UpdateAasAntdaoEquityDefaultpriceRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoEquityDefaultpriceEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update 
     * 更新商品价格
     * Summary: 数字商品服务-商品服务-更新商品价格
     * @param UpdateAasAntdaoEquityDefaultpriceRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoEquityDefaultpriceResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityDefaultpriceEx(UpdateAasAntdaoEquityDefaultpriceRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoEquityDefaultpriceResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.defaultprice.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商品自定义定价
     * Summary: 数字商品服务-商品服务-更新自定义定价
     * @param UpdateAasAntdaoEquityTenantpriceRequest $request
     * @return UpdateAasAntdaoEquityTenantpriceResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityTenantprice(UpdateAasAntdaoEquityTenantpriceRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoEquityTenantpriceEx($request, $runtime);
    }

    /**
     * Description: 更新商品自定义定价
     * Summary: 数字商品服务-商品服务-更新自定义定价
     * @param UpdateAasAntdaoEquityTenantpriceRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoEquityTenantpriceResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityTenantpriceEx(UpdateAasAntdaoEquityTenantpriceRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoEquityTenantpriceResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.tenantprice.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 增加权益库存
     * Summary: 数字商品服务-商品服务-增加权益库存
     * @param AddAasAntdaoEquityCountRequest $request
     * @return AddAasAntdaoEquityCountResponse
     * @throws \Exception
     */
    public function addAasAntdaoEquityCount(AddAasAntdaoEquityCountRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->addAasAntdaoEquityCountEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 增加权益库存
     * Summary: 数字商品服务-商品服务-增加权益库存
     * @param AddAasAntdaoEquityCountRequest $request
     * @param RuntimeOptions $runtime
     * @return AddAasAntdaoEquityCountResponse
     * @throws \Exception
     */
    public function addAasAntdaoEquityCountEx(AddAasAntdaoEquityCountRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AddAasAntdaoEquityCountResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.count.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新兑换限制规则
     * Summary: 数字商品服务-商品服务-更新兑换限制规则
     * @param UpdateAasAntdaoEquityExchangelimitRequest $request
     * @return UpdateAasAntdaoEquityExchangelimitResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityExchangelimit(UpdateAasAntdaoEquityExchangelimitRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoEquityExchangelimitEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新兑换限制规则
     * Summary: 数字商品服务-商品服务-更新兑换限制规则
     * @param UpdateAasAntdaoEquityExchangelimitRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoEquityExchangelimitResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityExchangelimitEx(UpdateAasAntdaoEquityExchangelimitRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoEquityExchangelimitResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.exchangelimit.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品有效期
     * Summary: 数字商品服务-商品服务-更新有效期
     * @param UpdateAasAntdaoEquityValidtimeRequest $request
     * @return UpdateAasAntdaoEquityValidtimeResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityValidtime(UpdateAasAntdaoEquityValidtimeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoEquityValidtimeEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品有效期
     * Summary: 数字商品服务-商品服务-更新有效期
     * @param UpdateAasAntdaoEquityValidtimeRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoEquityValidtimeResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityValidtimeEx(UpdateAasAntdaoEquityValidtimeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoEquityValidtimeResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.validtime.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询商品信息
     * Summary: 数字商品服务-商品服务-查询商品信息
     * @param QueryAasAntdaoEquityRequest $request
     * @return QueryAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function queryAasAntdaoEquity(QueryAasAntdaoEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoEquityEx($request, $runtime);
    }

    /**
     * Description: 查询商品信息
     * Summary: 数字商品服务-商品服务-查询商品信息
     * @param QueryAasAntdaoEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function queryAasAntdaoEquityEx(QueryAasAntdaoEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoEquityResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户身份发起兑换
     * Summary: 数字商品服务-兑换服务-用户身份发起兑换
     * @param ExecAasAntdaoExchangeByuserRequest $request
     * @return ExecAasAntdaoExchangeByuserResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeByuser(ExecAasAntdaoExchangeByuserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoExchangeByuserEx($request, $runtime);
    }

    /**
     * Description: 用户身份发起兑换
     * Summary: 数字商品服务-兑换服务-用户身份发起兑换
     * @param ExecAasAntdaoExchangeByuserRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoExchangeByuserResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeByuserEx(ExecAasAntdaoExchangeByuserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoExchangeByuserResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.byuser.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户身份发起兑换
     * Summary: 数字商品服务-商品服务-商户身份发起兑换
     * @param ExecAasAntdaoExchangeBymerchantRequest $request
     * @return ExecAasAntdaoExchangeBymerchantResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeBymerchant(ExecAasAntdaoExchangeBymerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoExchangeBymerchantEx($request, $runtime);
    }

    /**
     * Description: 商户身份发起兑换
     * Summary: 数字商品服务-商品服务-商户身份发起兑换
     * @param ExecAasAntdaoExchangeBymerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoExchangeBymerchantResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeBymerchantEx(ExecAasAntdaoExchangeBymerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoExchangeBymerchantResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.bymerchant.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
     * Summary: 数字商品服务-兑换服务-确认接单
     * @param ConfirmAasAntdaoExchangeRequest $request
     * @return ConfirmAasAntdaoExchangeResponse
     * @throws \Exception
     */
    public function confirmAasAntdaoExchange(ConfirmAasAntdaoExchangeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->confirmAasAntdaoExchangeEx($request, $runtime);
    }

    /**
     * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
     * Summary: 数字商品服务-兑换服务-确认接单
     * @param ConfirmAasAntdaoExchangeRequest $request
     * @param RuntimeOptions $runtime
     * @return ConfirmAasAntdaoExchangeResponse
     * @throws \Exception
     */
    public function confirmAasAntdaoExchangeEx(ConfirmAasAntdaoExchangeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ConfirmAasAntdaoExchangeResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.confirm", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
     * Summary: 数字商品服务-兑换服务-拒绝发货
     * @param ExecAasAntdaoExchangeOutofstoreRequest $request
     * @return ExecAasAntdaoExchangeOutofstoreResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeOutofstore(ExecAasAntdaoExchangeOutofstoreRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoExchangeOutofstoreEx($request, $runtime);
    }

    /**
     * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
     * Summary: 数字商品服务-兑换服务-拒绝发货
     * @param ExecAasAntdaoExchangeOutofstoreRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoExchangeOutofstoreResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeOutofstoreEx(ExecAasAntdaoExchangeOutofstoreRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoExchangeOutofstoreResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.outofstore.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 兑换发货
     * Summary: 数字商品服务-兑换服务-兑换发货
     * @param SendAasAntdaoExchangeRequest $request
     * @return SendAasAntdaoExchangeResponse
     * @throws \Exception
     */
    public function sendAasAntdaoExchange(SendAasAntdaoExchangeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->sendAasAntdaoExchangeEx($request, $runtime);
    }

    /**
     * Description: 兑换发货
     * Summary: 数字商品服务-兑换服务-兑换发货
     * @param SendAasAntdaoExchangeRequest $request
     * @param RuntimeOptions $runtime
     * @return SendAasAntdaoExchangeResponse
     * @throws \Exception
     */
    public function sendAasAntdaoExchangeEx(SendAasAntdaoExchangeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SendAasAntdaoExchangeResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.send", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户身份确认收货
     * Summary: 数字商品服务-兑换服务-用户身份确认收货
     * @param ExecAasAntdaoExchangeReceivebyuserRequest $request
     * @return ExecAasAntdaoExchangeReceivebyuserResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeReceivebyuser(ExecAasAntdaoExchangeReceivebyuserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoExchangeReceivebyuserEx($request, $runtime);
    }

    /**
     * Description: 用户身份确认收货
     * Summary: 数字商品服务-兑换服务-用户身份确认收货
     * @param ExecAasAntdaoExchangeReceivebyuserRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoExchangeReceivebyuserResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeReceivebyuserEx(ExecAasAntdaoExchangeReceivebyuserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoExchangeReceivebyuserResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.receivebyuser.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 资产过期
     * Summary: 数字商品服务-资产服务-资产过期
     * @param ExecAasAntdaoAssetExpireRequest $request
     * @return ExecAasAntdaoAssetExpireResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetExpire(ExecAasAntdaoAssetExpireRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoAssetExpireEx($request, $runtime);
    }

    /**
     * Description: 资产过期
     * Summary: 数字商品服务-资产服务-资产过期
     * @param ExecAasAntdaoAssetExpireRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoAssetExpireResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetExpireEx(ExecAasAntdaoAssetExpireRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoAssetExpireResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.expire.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 检索资产流转流水
     * Summary: 数字商品服务-资产服务-查询资产流转流水
     * @param QueryAasAntdaoAssetInstructionRequest $request
     * @return QueryAasAntdaoAssetInstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoAssetInstruction(QueryAasAntdaoAssetInstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoAssetInstructionEx($request, $runtime);
    }

    /**
     * Description: 检索资产流转流水
     * Summary: 数字商品服务-资产服务-查询资产流转流水
     * @param QueryAasAntdaoAssetInstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoAssetInstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoAssetInstructionEx(QueryAasAntdaoAssetInstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoAssetInstructionResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.instruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口废弃不用！！！
     * 查询商品兑换流水
     * Summary: 数字商品服务-兑换服务-查询商品兑换流水
     * @param QueryAasAntdaoExchangeInstructionRequest $request
     * @return QueryAasAntdaoExchangeInstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoExchangeInstruction(QueryAasAntdaoExchangeInstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoExchangeInstructionEx($request, $runtime);
    }

    /**
     * Description: 该接口废弃不用！！！
     * 查询商品兑换流水
     * Summary: 数字商品服务-兑换服务-查询商品兑换流水
     * @param QueryAasAntdaoExchangeInstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoExchangeInstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoExchangeInstructionEx(QueryAasAntdaoExchangeInstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoExchangeInstructionResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.instruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 资产初始化发行
     * Summary: 数字商品服务-资产服务-资产初始化发行
     * @param ExecAasAntdaoAssetIssueRequest $request
     * @return ExecAasAntdaoAssetIssueResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetIssue(ExecAasAntdaoAssetIssueRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoAssetIssueEx($request, $runtime);
    }

    /**
     * Description: 资产初始化发行
     * Summary: 数字商品服务-资产服务-资产初始化发行
     * @param ExecAasAntdaoAssetIssueRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoAssetIssueResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetIssueEx(ExecAasAntdaoAssetIssueRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoAssetIssueResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.issue.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 赎回资产
     * Summary: 数字商品服务-资产服务-赎回资产
     * @param ExecAasAntdaoAssetRedeemRequest $request
     * @return ExecAasAntdaoAssetRedeemResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetRedeem(ExecAasAntdaoAssetRedeemRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoAssetRedeemEx($request, $runtime);
    }

    /**
     * Description: 赎回资产
     * Summary: 数字商品服务-资产服务-赎回资产
     * @param ExecAasAntdaoAssetRedeemRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoAssetRedeemResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetRedeemEx(ExecAasAntdaoAssetRedeemRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoAssetRedeemResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.redeem.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发放资产
     * Summary: 数字商品服务-资产服务-发放资产
     * @param ExecAasAntdaoAssetGrantRequest $request
     * @return ExecAasAntdaoAssetGrantResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetGrant(ExecAasAntdaoAssetGrantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoAssetGrantEx($request, $runtime);
    }

    /**
     * Description: 发放资产
     * Summary: 数字商品服务-资产服务-发放资产
     * @param ExecAasAntdaoAssetGrantRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoAssetGrantResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetGrantEx(ExecAasAntdaoAssetGrantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoAssetGrantResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.grant.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发放回退资产
     * Summary: 数字商品服务-资产服务-发放回退资产
     * @param ExecAasAntdaoAssetGrantrefundRequest $request
     * @return ExecAasAntdaoAssetGrantrefundResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetGrantrefund(ExecAasAntdaoAssetGrantrefundRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoAssetGrantrefundEx($request, $runtime);
    }

    /**
     * Description: 发放回退资产
     * Summary: 数字商品服务-资产服务-发放回退资产
     * @param ExecAasAntdaoAssetGrantrefundRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoAssetGrantrefundResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetGrantrefundEx(ExecAasAntdaoAssetGrantrefundRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoAssetGrantrefundResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.grantrefund.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 风控调整资产
     * Summary: 数字商品服务-资产服务-风控调整资产
     * @param ExecAasAntdaoAssetAdjustRequest $request
     * @return ExecAasAntdaoAssetAdjustResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetAdjust(ExecAasAntdaoAssetAdjustRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoAssetAdjustEx($request, $runtime);
    }

    /**
     * Description: 风控调整资产
     * Summary: 数字商品服务-资产服务-风控调整资产
     * @param ExecAasAntdaoAssetAdjustRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoAssetAdjustResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetAdjustEx(ExecAasAntdaoAssetAdjustRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoAssetAdjustResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.adjust.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 资产查询
     * Summary: 数字商品服务-资产服务-资产查询
     * @param QueryAasAntdaoAssetRequest $request
     * @return QueryAasAntdaoAssetResponse
     * @throws \Exception
     */
    public function queryAasAntdaoAsset(QueryAasAntdaoAssetRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoAssetEx($request, $runtime);
    }

    /**
     * Description: 资产查询
     * Summary: 数字商品服务-资产服务-资产查询
     * @param QueryAasAntdaoAssetRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoAssetResponse
     * @throws \Exception
     */
    public function queryAasAntdaoAssetEx(QueryAasAntdaoAssetRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoAssetResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户身份确认收货
     * Summary: 数字商品服务-兑换服务-商户身份确认收货
     * @param ExecAasAntdaoExchangeReceivebymerchantRequest $request
     * @return ExecAasAntdaoExchangeReceivebymerchantResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeReceivebymerchant(ExecAasAntdaoExchangeReceivebymerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoExchangeReceivebymerchantEx($request, $runtime);
    }

    /**
     * Description: 商户身份确认收货
     * Summary: 数字商品服务-兑换服务-商户身份确认收货
     * @param ExecAasAntdaoExchangeReceivebymerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoExchangeReceivebymerchantResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeReceivebymerchantEx(ExecAasAntdaoExchangeReceivebymerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoExchangeReceivebymerchantResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.receivebymerchant.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     * @param QueryAasAntdaoBlockRequest $request
     * @return QueryAasAntdaoBlockResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlock(QueryAasAntdaoBlockRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockEx($request, $runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     * @param QueryAasAntdaoBlockRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockEx(QueryAasAntdaoBlockRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockResponse::fromMap($this->doRequest("1.0", "baas.antdao.block.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取区块链最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     * @param QueryAasAntdaoBlockLastblocknumberRequest $request
     * @return QueryAasAntdaoBlockLastblocknumberResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockLastblocknumber(QueryAasAntdaoBlockLastblocknumberRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockLastblocknumberEx($request, $runtime);
    }

    /**
     * Description: 获取区块链最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     * @param QueryAasAntdaoBlockLastblocknumberRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockLastblocknumberResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockLastblocknumberEx(QueryAasAntdaoBlockLastblocknumberRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockLastblocknumberResponse::fromMap($this->doRequest("1.0", "baas.antdao.block.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-商品服务-更新商品属性信息
     * @param UpdateAasAntdaoEquityRequest $request
     * @return UpdateAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquity(UpdateAasAntdaoEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoEquityEx($request, $runtime);
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-商品服务-更新商品属性信息
     * @param UpdateAasAntdaoEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoEquityResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityEx(UpdateAasAntdaoEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoEquityResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
     * Summary: 数字商品服务-商品服务-发布商品结果查询
     * @param QueryAasAntdaoEquityCreateresultRequest $request
     * @return QueryAasAntdaoEquityCreateresultResponse
     * @throws \Exception
     */
    public function queryAasAntdaoEquityCreateresult(QueryAasAntdaoEquityCreateresultRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoEquityCreateresultEx($request, $runtime);
    }

    /**
     * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
     * Summary: 数字商品服务-商品服务-发布商品结果查询
     * @param QueryAasAntdaoEquityCreateresultRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoEquityCreateresultResponse
     * @throws \Exception
     */
    public function queryAasAntdaoEquityCreateresultEx(QueryAasAntdaoEquityCreateresultRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoEquityCreateresultResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.createresult.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 根据商品兑换流水交易号查询商品兑换流水详情
     * Summary: 数字商品服务-商品服务-查询商品兑换流水
     * @param QueryAasAntdaoEquityInstructionRequest $request
     * @return QueryAasAntdaoEquityInstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoEquityInstruction(QueryAasAntdaoEquityInstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoEquityInstructionEx($request, $runtime);
    }

    /**
     * Description: 根据商品兑换流水交易号查询商品兑换流水详情
     * Summary: 数字商品服务-商品服务-查询商品兑换流水
     * @param QueryAasAntdaoEquityInstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoEquityInstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoEquityInstructionEx(QueryAasAntdaoEquityInstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoEquityInstructionResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.instruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
     * Summary: 数字商品服务-OSS服务-获取图片URL
     * @param QueryAasAntdaoImageRequest $request
     * @return QueryAasAntdaoImageResponse
     * @throws \Exception
     */
    public function queryAasAntdaoImage(QueryAasAntdaoImageRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoImageEx($request, $runtime);
    }

    /**
     * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
     * Summary: 数字商品服务-OSS服务-获取图片URL
     * @param QueryAasAntdaoImageRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoImageResponse
     * @throws \Exception
     */
    public function queryAasAntdaoImageEx(QueryAasAntdaoImageRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoImageResponse::fromMap($this->doRequest("1.0", "baas.antdao.image.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商品状态（可用，冻结，下线）
     * Summary: 数字商品服务-商品服务-更新商品状态
     * @param UpdateAasAntdaoEquityStatusRequest $request
     * @return UpdateAasAntdaoEquityStatusResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityStatus(UpdateAasAntdaoEquityStatusRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoEquityStatusEx($request, $runtime);
    }

    /**
     * Description: 更新商品状态（可用，冻结，下线）
     * Summary: 数字商品服务-商品服务-更新商品状态
     * @param UpdateAasAntdaoEquityStatusRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoEquityStatusResponse
     * @throws \Exception
     */
    public function updateAasAntdaoEquityStatusEx(UpdateAasAntdaoEquityStatusRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoEquityStatusResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.status.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置备付金金额（CAS接口）
     * Summary: 数字商品服务-商户管理-设置备付金金额
     * @param SetAasAntdaoMerchantProvisionRequest $request
     * @return SetAasAntdaoMerchantProvisionResponse
     * @throws \Exception
     */
    public function setAasAntdaoMerchantProvision(SetAasAntdaoMerchantProvisionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->setAasAntdaoMerchantProvisionEx($request, $runtime);
    }

    /**
     * Description: 设置备付金金额（CAS接口）
     * Summary: 数字商品服务-商户管理-设置备付金金额
     * @param SetAasAntdaoMerchantProvisionRequest $request
     * @param RuntimeOptions $runtime
     * @return SetAasAntdaoMerchantProvisionResponse
     * @throws \Exception
     */
    public function setAasAntdaoMerchantProvisionEx(SetAasAntdaoMerchantProvisionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SetAasAntdaoMerchantProvisionResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.provision.set", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商户的备付金金额，由资金管理员操作
     * Summary: 数字商品服务-商户管理-更新备付金金额
     * @param UpdateAasAntdaoMerchantProvisionRequest $request
     * @return UpdateAasAntdaoMerchantProvisionResponse
     * @throws \Exception
     */
    public function updateAasAntdaoMerchantProvision(UpdateAasAntdaoMerchantProvisionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoMerchantProvisionEx($request, $runtime);
    }

    /**
     * Description: 更新商户的备付金金额，由资金管理员操作
     * Summary: 数字商品服务-商户管理-更新备付金金额
     * @param UpdateAasAntdaoMerchantProvisionRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoMerchantProvisionResponse
     * @throws \Exception
     */
    public function updateAasAntdaoMerchantProvisionEx(UpdateAasAntdaoMerchantProvisionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoMerchantProvisionResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.provision.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 核销商品兑换交易，由资金管理员操作
     * Summary: 数字商品服务-商品服务-核销商品兑换交易
     * @param ExecAasAntdaoEquityInstructionwriteoffRequest $request
     * @return ExecAasAntdaoEquityInstructionwriteoffResponse
     * @throws \Exception
     */
    public function execAasAntdaoEquityInstructionwriteoff(ExecAasAntdaoEquityInstructionwriteoffRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoEquityInstructionwriteoffEx($request, $runtime);
    }

    /**
     * Description: 核销商品兑换交易，由资金管理员操作
     * Summary: 数字商品服务-商品服务-核销商品兑换交易
     * @param ExecAasAntdaoEquityInstructionwriteoffRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoEquityInstructionwriteoffResponse
     * @throws \Exception
     */
    public function execAasAntdaoEquityInstructionwriteoffEx(ExecAasAntdaoEquityInstructionwriteoffRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoEquityInstructionwriteoffResponse::fromMap($this->doRequest("1.0", "baas.antdao.equity.instructionwriteoff.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询租户的备付金列表
     * Summary: 数字商品服务-商户管理-查租户备付金列表
     * @param QueryAasAntdaoMerchantProvisionsRequest $request
     * @return QueryAasAntdaoMerchantProvisionsResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchantProvisions(QueryAasAntdaoMerchantProvisionsRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMerchantProvisionsEx($request, $runtime);
    }

    /**
     * Description: 查询租户的备付金列表
     * Summary: 数字商品服务-商户管理-查租户备付金列表
     * @param QueryAasAntdaoMerchantProvisionsRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMerchantProvisionsResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchantProvisionsEx(QueryAasAntdaoMerchantProvisionsRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMerchantProvisionsResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.provisions.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
     * Summary: 数字商品服务-商户管理-查询可兑换商品
     * @param QueryAasAntdaoMerchantExchangeableequitylistRequest $request
     * @return QueryAasAntdaoMerchantExchangeableequitylistResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchantExchangeableequitylist(QueryAasAntdaoMerchantExchangeableequitylistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMerchantExchangeableequitylistEx($request, $runtime);
    }

    /**
     * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
     * Summary: 数字商品服务-商户管理-查询可兑换商品
     * @param QueryAasAntdaoMerchantExchangeableequitylistRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMerchantExchangeableequitylistResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchantExchangeableequitylistEx(QueryAasAntdaoMerchantExchangeableequitylistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMerchantExchangeableequitylistResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.exchangeableequitylist.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
     * Summary: 数字商品服务-商户管理-查询可兑商品明细
     * @param QueryAasAntdaoMerchantExchangeableequitydetailRequest $request
     * @return QueryAasAntdaoMerchantExchangeableequitydetailResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchantExchangeableequitydetail(QueryAasAntdaoMerchantExchangeableequitydetailRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMerchantExchangeableequitydetailEx($request, $runtime);
    }

    /**
     * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
     * Summary: 数字商品服务-商户管理-查询可兑商品明细
     * @param QueryAasAntdaoMerchantExchangeableequitydetailRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMerchantExchangeableequitydetailResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMerchantExchangeableequitydetailEx(QueryAasAntdaoMerchantExchangeableequitydetailRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMerchantExchangeableequitydetailResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.exchangeableequitydetail.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建新资产
     * Summary: 数字商品服务-资产服务-创建资产
     * @param ExecAasAntdaoAssetCreateRequest $request
     * @return ExecAasAntdaoAssetCreateResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetCreate(ExecAasAntdaoAssetCreateRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoAssetCreateEx($request, $runtime);
    }

    /**
     * Description: 创建新资产
     * Summary: 数字商品服务-资产服务-创建资产
     * @param ExecAasAntdaoAssetCreateRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoAssetCreateResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetCreateEx(ExecAasAntdaoAssetCreateRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoAssetCreateResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.create.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 资产铸币(不扣减备付金)，合约管理员操作
     * Summary: 数字商品服务-资产服务-资产铸币
     * @param ExecAasAntdaoAssetGenerateRequest $request
     * @return ExecAasAntdaoAssetGenerateResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetGenerate(ExecAasAntdaoAssetGenerateRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoAssetGenerateEx($request, $runtime);
    }

    /**
     * Description: 资产铸币(不扣减备付金)，合约管理员操作
     * Summary: 数字商品服务-资产服务-资产铸币
     * @param ExecAasAntdaoAssetGenerateRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoAssetGenerateResponse
     * @throws \Exception
     */
    public function execAasAntdaoAssetGenerateEx(ExecAasAntdaoAssetGenerateRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoAssetGenerateResponse::fromMap($this->doRequest("1.0", "baas.antdao.asset.generate.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建商户（合约管理员权限）
     * Summary: 数字商品服务-商户管理-创建商户
     * @param CreateAasAntdaoMerchantRequest $request
     * @return CreateAasAntdaoMerchantResponse
     * @throws \Exception
     */
    public function createAasAntdaoMerchant(CreateAasAntdaoMerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasAntdaoMerchantEx($request, $runtime);
    }

    /**
     * Description: 创建商户（合约管理员权限）
     * Summary: 数字商品服务-商户管理-创建商户
     * @param CreateAasAntdaoMerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasAntdaoMerchantResponse
     * @throws \Exception
     */
    public function createAasAntdaoMerchantEx(CreateAasAntdaoMerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasAntdaoMerchantResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置商户的资金管理员，重要权限，谨慎操作！
     * Summary: 数字商品服务-商户管理-设置资金管理员
     * @param SetAasAntdaoMerchantFundmanagerRequest $request
     * @return SetAasAntdaoMerchantFundmanagerResponse
     * @throws \Exception
     */
    public function setAasAntdaoMerchantFundmanager(SetAasAntdaoMerchantFundmanagerRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->setAasAntdaoMerchantFundmanagerEx($request, $runtime);
    }

    /**
     * Description: 设置商户的资金管理员，重要权限，谨慎操作！
     * Summary: 数字商品服务-商户管理-设置资金管理员
     * @param SetAasAntdaoMerchantFundmanagerRequest $request
     * @param RuntimeOptions $runtime
     * @return SetAasAntdaoMerchantFundmanagerResponse
     * @throws \Exception
     */
    public function setAasAntdaoMerchantFundmanagerEx(SetAasAntdaoMerchantFundmanagerRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SetAasAntdaoMerchantFundmanagerResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.fundmanager.set", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建备付金账户，合约管理员权限
     * Summary: 数字商品服务-商户管理-创建备付金账户
     * @param CreateAasAntdaoMerchantProvisionRequest $request
     * @return CreateAasAntdaoMerchantProvisionResponse
     * @throws \Exception
     */
    public function createAasAntdaoMerchantProvision(CreateAasAntdaoMerchantProvisionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasAntdaoMerchantProvisionEx($request, $runtime);
    }

    /**
     * Description: 创建备付金账户，合约管理员权限
     * Summary: 数字商品服务-商户管理-创建备付金账户
     * @param CreateAasAntdaoMerchantProvisionRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasAntdaoMerchantProvisionResponse
     * @throws \Exception
     */
    public function createAasAntdaoMerchantProvisionEx(CreateAasAntdaoMerchantProvisionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasAntdaoMerchantProvisionResponse::fromMap($this->doRequest("1.0", "baas.antdao.merchant.provision.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-管理服务-代理权限查询
     * @param QueryAasAntdaoConfigDelegaterelationRequest $request
     * @return QueryAasAntdaoConfigDelegaterelationResponse
     * @throws \Exception
     */
    public function queryAasAntdaoConfigDelegaterelation(QueryAasAntdaoConfigDelegaterelationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoConfigDelegaterelationEx($request, $runtime);
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-管理服务-代理权限查询
     * @param QueryAasAntdaoConfigDelegaterelationRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoConfigDelegaterelationResponse
     * @throws \Exception
     */
    public function queryAasAntdaoConfigDelegaterelationEx(QueryAasAntdaoConfigDelegaterelationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoConfigDelegaterelationResponse::fromMap($this->doRequest("1.0", "baas.antdao.config.delegaterelation.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-管理服务-设置代理权限
     * @param UpdateAasAntdaoConfigDelegaterelationRequest $request
     * @return UpdateAasAntdaoConfigDelegaterelationResponse
     * @throws \Exception
     */
    public function updateAasAntdaoConfigDelegaterelation(UpdateAasAntdaoConfigDelegaterelationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoConfigDelegaterelationEx($request, $runtime);
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-管理服务-设置代理权限
     * @param UpdateAasAntdaoConfigDelegaterelationRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoConfigDelegaterelationResponse
     * @throws \Exception
     */
    public function updateAasAntdaoConfigDelegaterelationEx(UpdateAasAntdaoConfigDelegaterelationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoConfigDelegaterelationResponse::fromMap($this->doRequest("1.0", "baas.antdao.config.delegaterelation.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     * @param QueryAasAntdaoConfigWhitelistRequest $request
     * @return QueryAasAntdaoConfigWhitelistResponse
     * @throws \Exception
     */
    public function queryAasAntdaoConfigWhitelist(QueryAasAntdaoConfigWhitelistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoConfigWhitelistEx($request, $runtime);
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     * @param QueryAasAntdaoConfigWhitelistRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoConfigWhitelistResponse
     * @throws \Exception
     */
    public function queryAasAntdaoConfigWhitelistEx(QueryAasAntdaoConfigWhitelistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoConfigWhitelistResponse::fromMap($this->doRequest("1.0", "baas.antdao.config.whitelist.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置接口访问白名单
     * Summary: 数字商品服务-管理服务-设置访问白名单
     * @param UpdateAasAntdaoConfigWhitelistRequest $request
     * @return UpdateAasAntdaoConfigWhitelistResponse
     * @throws \Exception
     */
    public function updateAasAntdaoConfigWhitelist(UpdateAasAntdaoConfigWhitelistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoConfigWhitelistEx($request, $runtime);
    }

    /**
     * Description: 设置接口访问白名单
     * Summary: 数字商品服务-管理服务-设置访问白名单
     * @param UpdateAasAntdaoConfigWhitelistRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoConfigWhitelistResponse
     * @throws \Exception
     */
    public function updateAasAntdaoConfigWhitelistEx(UpdateAasAntdaoConfigWhitelistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoConfigWhitelistResponse::fromMap($this->doRequest("1.0", "baas.antdao.config.whitelist.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 兑换单申请售后（采购商）
     * Summary: 数字商品服务-兑换服务-申请售后(商家)
     * @param ApplyAasAntdaoExchangeAftersaleRequest $request
     * @return ApplyAasAntdaoExchangeAftersaleResponse
     * @throws \Exception
     */
    public function applyAasAntdaoExchangeAftersale(ApplyAasAntdaoExchangeAftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->applyAasAntdaoExchangeAftersaleEx($request, $runtime);
    }

    /**
     * Description: 兑换单申请售后（采购商）
     * Summary: 数字商品服务-兑换服务-申请售后(商家)
     * @param ApplyAasAntdaoExchangeAftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyAasAntdaoExchangeAftersaleResponse
     * @throws \Exception
     */
    public function applyAasAntdaoExchangeAftersaleEx(ApplyAasAntdaoExchangeAftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ApplyAasAntdaoExchangeAftersaleResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.aftersale.apply", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 同意售后（供应商）
     * Summary: 数字商品服务-兑换服务-同意售后
     * @param ExecAasAntdaoExchangeAgreeaftersaleRequest $request
     * @return ExecAasAntdaoExchangeAgreeaftersaleResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeAgreeaftersale(ExecAasAntdaoExchangeAgreeaftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoExchangeAgreeaftersaleEx($request, $runtime);
    }

    /**
     * Description: 同意售后（供应商）
     * Summary: 数字商品服务-兑换服务-同意售后
     * @param ExecAasAntdaoExchangeAgreeaftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoExchangeAgreeaftersaleResponse
     * @throws \Exception
     */
    public function execAasAntdaoExchangeAgreeaftersaleEx(ExecAasAntdaoExchangeAgreeaftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoExchangeAgreeaftersaleResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.agreeaftersale.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 拒绝售后（供应商）
     * Summary: 数字商品服务-兑换服务-拒绝售后
     * @param RefuseAasAntdaoExchangeAftersaleRequest $request
     * @return RefuseAasAntdaoExchangeAftersaleResponse
     * @throws \Exception
     */
    public function refuseAasAntdaoExchangeAftersale(RefuseAasAntdaoExchangeAftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->refuseAasAntdaoExchangeAftersaleEx($request, $runtime);
    }

    /**
     * Description: 拒绝售后（供应商）
     * Summary: 数字商品服务-兑换服务-拒绝售后
     * @param RefuseAasAntdaoExchangeAftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return RefuseAasAntdaoExchangeAftersaleResponse
     * @throws \Exception
     */
    public function refuseAasAntdaoExchangeAftersaleEx(RefuseAasAntdaoExchangeAftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return RefuseAasAntdaoExchangeAftersaleResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.aftersale.refuse", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 重新发货（供应商）
     * Summary: 数字商品服务-兑换服务-重新发货
     * @param SendAasAntdaoExchangeAftersaleRequest $request
     * @return SendAasAntdaoExchangeAftersaleResponse
     * @throws \Exception
     */
    public function sendAasAntdaoExchangeAftersale(SendAasAntdaoExchangeAftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->sendAasAntdaoExchangeAftersaleEx($request, $runtime);
    }

    /**
     * Description: 重新发货（供应商）
     * Summary: 数字商品服务-兑换服务-重新发货
     * @param SendAasAntdaoExchangeAftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return SendAasAntdaoExchangeAftersaleResponse
     * @throws \Exception
     */
    public function sendAasAntdaoExchangeAftersaleEx(SendAasAntdaoExchangeAftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SendAasAntdaoExchangeAftersaleResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.aftersale.send", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户确认售后（供应商）comfirmaftersale
     * Summary:  数字商品服务-兑换服务-商户确认售后
     * @param ConfirmAasAntdaoExchangeAftersaleRequest $request
     * @return ConfirmAasAntdaoExchangeAftersaleResponse
     * @throws \Exception
     */
    public function confirmAasAntdaoExchangeAftersale(ConfirmAasAntdaoExchangeAftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->confirmAasAntdaoExchangeAftersaleEx($request, $runtime);
    }

    /**
     * Description: 商户确认售后（供应商）comfirmaftersale
     * Summary:  数字商品服务-兑换服务-商户确认售后
     * @param ConfirmAasAntdaoExchangeAftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return ConfirmAasAntdaoExchangeAftersaleResponse
     * @throws \Exception
     */
    public function confirmAasAntdaoExchangeAftersaleEx(ConfirmAasAntdaoExchangeAftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ConfirmAasAntdaoExchangeAftersaleResponse::fromMap($this->doRequest("1.0", "baas.antdao.exchange.aftersale.confirm", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 数字消费卡链上发布
     * Summary: 数字商品服务-存证服务-消费卡链上发布
     * @param ExecAasAntdaoDataDepositRequest $request
     * @return ExecAasAntdaoDataDepositResponse
     * @throws \Exception
     */
    public function execAasAntdaoDataDeposit(ExecAasAntdaoDataDepositRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoDataDepositEx($request, $runtime);
    }

    /**
     * Description: 数字消费卡链上发布
     * Summary: 数字商品服务-存证服务-消费卡链上发布
     * @param ExecAasAntdaoDataDepositRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoDataDepositResponse
     * @throws \Exception
     */
    public function execAasAntdaoDataDepositEx(ExecAasAntdaoDataDepositRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoDataDepositResponse::fromMap($this->doRequest("1.0", "baas.antdao.data.deposit.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置商品兑换手续费
     * Summary: 数字商品服务-商品服务-设置商品手续费
     * @param SetAasAntdaoCommissionRequest $request
     * @return SetAasAntdaoCommissionResponse
     * @throws \Exception
     */
    public function setAasAntdaoCommission(SetAasAntdaoCommissionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->setAasAntdaoCommissionEx($request, $runtime);
    }

    /**
     * Description: 设置商品兑换手续费
     * Summary: 数字商品服务-商品服务-设置商品手续费
     * @param SetAasAntdaoCommissionRequest $request
     * @param RuntimeOptions $runtime
     * @return SetAasAntdaoCommissionResponse
     * @throws \Exception
     */
    public function setAasAntdaoCommissionEx(SetAasAntdaoCommissionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SetAasAntdaoCommissionResponse::fromMap($this->doRequest("1.0", "baas.antdao.commission.set", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
     * Summary: 数字商品服务-商品服务-查询商品手续费
     * @param QueryAasAntdaoCommissionRequest $request
     * @return QueryAasAntdaoCommissionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoCommission(QueryAasAntdaoCommissionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoCommissionEx($request, $runtime);
    }

    /**
     * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
     * Summary: 数字商品服务-商品服务-查询商品手续费
     * @param QueryAasAntdaoCommissionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoCommissionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoCommissionEx(QueryAasAntdaoCommissionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoCommissionResponse::fromMap($this->doRequest("1.0", "baas.antdao.commission.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置收取手续费的商户信息（合约管理员权限）
     * Summary: 数字商品服务-商品服务-设置收手续费商户
     * @param SetAasAntdaoCommissionMerchantRequest $request
     * @return SetAasAntdaoCommissionMerchantResponse
     * @throws \Exception
     */
    public function setAasAntdaoCommissionMerchant(SetAasAntdaoCommissionMerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->setAasAntdaoCommissionMerchantEx($request, $runtime);
    }

    /**
     * Description: 设置收取手续费的商户信息（合约管理员权限）
     * Summary: 数字商品服务-商品服务-设置收手续费商户
     * @param SetAasAntdaoCommissionMerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return SetAasAntdaoCommissionMerchantResponse
     * @throws \Exception
     */
    public function setAasAntdaoCommissionMerchantEx(SetAasAntdaoCommissionMerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SetAasAntdaoCommissionMerchantResponse::fromMap($this->doRequest("1.0", "baas.antdao.commission.merchant.set", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询收取手续费的商户信息
     * Summary: 数字商品服务-商品服务-查询收手续费商户
     * @param QueryAasAntdaoCommissionMerchantRequest $request
     * @return QueryAasAntdaoCommissionMerchantResponse
     * @throws \Exception
     */
    public function queryAasAntdaoCommissionMerchant(QueryAasAntdaoCommissionMerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoCommissionMerchantEx($request, $runtime);
    }

    /**
     * Description: 查询收取手续费的商户信息
     * Summary: 数字商品服务-商品服务-查询收手续费商户
     * @param QueryAasAntdaoCommissionMerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoCommissionMerchantResponse
     * @throws \Exception
     */
    public function queryAasAntdaoCommissionMerchantEx(QueryAasAntdaoCommissionMerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoCommissionMerchantResponse::fromMap($this->doRequest("1.0", "baas.antdao.commission.merchant.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     * @param QueryAasAntdaoBlockanalysisBlockRequest $request
     * @return QueryAasAntdaoBlockanalysisBlockResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisBlock(QueryAasAntdaoBlockanalysisBlockRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockanalysisBlockEx($request, $runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     * @param QueryAasAntdaoBlockanalysisBlockRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockanalysisBlockResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisBlockEx(QueryAasAntdaoBlockanalysisBlockRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockanalysisBlockResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.block.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     * @param QueryAasAntdaoBlockanalysisLastblocknumberRequest $request
     * @return QueryAasAntdaoBlockanalysisLastblocknumberResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisLastblocknumber(QueryAasAntdaoBlockanalysisLastblocknumberRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockanalysisLastblocknumberEx($request, $runtime);
    }

    /**
     * Description: 获取最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     * @param QueryAasAntdaoBlockanalysisLastblocknumberRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockanalysisLastblocknumberResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisLastblocknumberEx(QueryAasAntdaoBlockanalysisLastblocknumberRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockanalysisLastblocknumberResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取公开的或者已授权的权益商品信息
     * Summary: 数字商品服务-拉块服务-获取已授权商品
     * @param QueryAasAntdaoBlockanalysisOpenedequitiesRequest $request
     * @return QueryAasAntdaoBlockanalysisOpenedequitiesResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisOpenedequities(QueryAasAntdaoBlockanalysisOpenedequitiesRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockanalysisOpenedequitiesEx($request, $runtime);
    }

    /**
     * Description: 获取公开的或者已授权的权益商品信息
     * Summary: 数字商品服务-拉块服务-获取已授权商品
     * @param QueryAasAntdaoBlockanalysisOpenedequitiesRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockanalysisOpenedequitiesResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisOpenedequitiesEx(QueryAasAntdaoBlockanalysisOpenedequitiesRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockanalysisOpenedequitiesResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.openedequities.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询已设置过用户价格的有效权益商品信息
     * Summary: 数字商品服务-拉块服务-已设用户价格商品
     * @param QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest $request
     * @return QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisUserpriceupdatedequities(QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockanalysisUserpriceupdatedequitiesEx($request, $runtime);
    }

    /**
     * Description: 查询已设置过用户价格的有效权益商品信息
     * Summary: 数字商品服务-拉块服务-已设用户价格商品
     * @param QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisUserpriceupdatedequitiesEx(QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.userpriceupdatedequities.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询商户的可提现资产价值(单位:分)
     * Summary: 数字商品服务-拉块服务-查询可提现资产
     * @param QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest $request
     * @return QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisUnwriteoffvalue(QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockanalysisUnwriteoffvalueEx($request, $runtime);
    }

    /**
     * Description: 查询商户的可提现资产价值(单位:分)
     * Summary: 数字商品服务-拉块服务-查询可提现资产
     * @param QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisUnwriteoffvalueEx(QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.unwriteoffvalue.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-拉块服务-设置代理权限
     * @param UpdateAasAntdaoBlockanalysisDelegaterelationRequest $request
     * @return UpdateAasAntdaoBlockanalysisDelegaterelationResponse
     * @throws \Exception
     */
    public function updateAasAntdaoBlockanalysisDelegaterelation(UpdateAasAntdaoBlockanalysisDelegaterelationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoBlockanalysisDelegaterelationEx($request, $runtime);
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-拉块服务-设置代理权限
     * @param UpdateAasAntdaoBlockanalysisDelegaterelationRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoBlockanalysisDelegaterelationResponse
     * @throws \Exception
     */
    public function updateAasAntdaoBlockanalysisDelegaterelationEx(UpdateAasAntdaoBlockanalysisDelegaterelationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoBlockanalysisDelegaterelationResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置接口访问白名单。
     * Summary: 数字商品服务-拉块服务-设置访问白名单
     * @param UpdateAasAntdaoBlockanalysisWhitelistRequest $request
     * @return UpdateAasAntdaoBlockanalysisWhitelistResponse
     * @throws \Exception
     */
    public function updateAasAntdaoBlockanalysisWhitelist(UpdateAasAntdaoBlockanalysisWhitelistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasAntdaoBlockanalysisWhitelistEx($request, $runtime);
    }

    /**
     * Description: 设置接口访问白名单。
     * Summary: 数字商品服务-拉块服务-设置访问白名单
     * @param UpdateAasAntdaoBlockanalysisWhitelistRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasAntdaoBlockanalysisWhitelistResponse
     * @throws \Exception
     */
    public function updateAasAntdaoBlockanalysisWhitelistEx(UpdateAasAntdaoBlockanalysisWhitelistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasAntdaoBlockanalysisWhitelistResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.whitelist.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-拉块服务-代理权限查询
     * @param QueryAasAntdaoBlockanalysisDelegaterelationRequest $request
     * @return QueryAasAntdaoBlockanalysisDelegaterelationResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisDelegaterelation(QueryAasAntdaoBlockanalysisDelegaterelationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockanalysisDelegaterelationEx($request, $runtime);
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-拉块服务-代理权限查询
     * @param QueryAasAntdaoBlockanalysisDelegaterelationRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockanalysisDelegaterelationResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisDelegaterelationEx(QueryAasAntdaoBlockanalysisDelegaterelationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockanalysisDelegaterelationResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     * @param QueryAasAntdaoBlockanalysisWhitelistRequest $request
     * @return QueryAasAntdaoBlockanalysisWhitelistResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisWhitelist(QueryAasAntdaoBlockanalysisWhitelistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockanalysisWhitelistEx($request, $runtime);
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     * @param QueryAasAntdaoBlockanalysisWhitelistRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockanalysisWhitelistResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisWhitelistEx(QueryAasAntdaoBlockanalysisWhitelistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockanalysisWhitelistResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.whitelist.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 根据交易hash获取交易信息
     * Summary: 数字商品服务-拉块服务-获取交易信息
     * @param QueryAasAntdaoBlockanalysisTransactionRequest $request
     * @return QueryAasAntdaoBlockanalysisTransactionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisTransaction(QueryAasAntdaoBlockanalysisTransactionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoBlockanalysisTransactionEx($request, $runtime);
    }

    /**
     * Description: 根据交易hash获取交易信息
     * Summary: 数字商品服务-拉块服务-获取交易信息
     * @param QueryAasAntdaoBlockanalysisTransactionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoBlockanalysisTransactionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoBlockanalysisTransactionEx(QueryAasAntdaoBlockanalysisTransactionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoBlockanalysisTransactionResponse::fromMap($this->doRequest("1.0", "baas.antdao.blockanalysis.transaction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可订购的SKU列表查询
     * Summary: 数字商品服务-商品服务-商品列表查询
     * @param QueryAasAntdaoMypointsSkuRequest $request
     * @return QueryAasAntdaoMypointsSkuResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsSku(QueryAasAntdaoMypointsSkuRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMypointsSkuEx($request, $runtime);
    }

    /**
     * Description: 可订购的SKU列表查询
     * Summary: 数字商品服务-商品服务-商品列表查询
     * @param QueryAasAntdaoMypointsSkuRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMypointsSkuResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsSkuEx(QueryAasAntdaoMypointsSkuRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMypointsSkuResponse::fromMap($this->doRequest("1.0", "baas.antdao.mypoints.sku.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询商户的积分库和预算库
     * Summary: 数字商品服务-商品服务-积分预算库查询
     * @param QueryAasAntdaoMypointsMerchantbalanceRequest $request
     * @return QueryAasAntdaoMypointsMerchantbalanceResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsMerchantbalance(QueryAasAntdaoMypointsMerchantbalanceRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMypointsMerchantbalanceEx($request, $runtime);
    }

    /**
     * Description: 查询商户的积分库和预算库
     * Summary: 数字商品服务-商品服务-积分预算库查询
     * @param QueryAasAntdaoMypointsMerchantbalanceRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMypointsMerchantbalanceResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsMerchantbalanceEx(QueryAasAntdaoMypointsMerchantbalanceRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMypointsMerchantbalanceResponse::fromMap($this->doRequest("1.0", "baas.antdao.mypoints.merchantbalance.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 预下单商品
     * Summary: 数字商品服务-商品服务-商品预下单
     * @param ExecAasAntdaoMypointsPreorderskuRequest $request
     * @return ExecAasAntdaoMypointsPreorderskuResponse
     * @throws \Exception
     */
    public function execAasAntdaoMypointsPreordersku(ExecAasAntdaoMypointsPreorderskuRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoMypointsPreorderskuEx($request, $runtime);
    }

    /**
     * Description: 预下单商品
     * Summary: 数字商品服务-商品服务-商品预下单
     * @param ExecAasAntdaoMypointsPreorderskuRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoMypointsPreorderskuResponse
     * @throws \Exception
     */
    public function execAasAntdaoMypointsPreorderskuEx(ExecAasAntdaoMypointsPreorderskuRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoMypointsPreorderskuResponse::fromMap($this->doRequest("1.0", "baas.antdao.mypoints.preordersku.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商品下单
     * Summary: 数字商品服务-商品服务-商品下单
     * @param ExecAasAntdaoMypointsOrderskuRequest $request
     * @return ExecAasAntdaoMypointsOrderskuResponse
     * @throws \Exception
     */
    public function execAasAntdaoMypointsOrdersku(ExecAasAntdaoMypointsOrderskuRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAasAntdaoMypointsOrderskuEx($request, $runtime);
    }

    /**
     * Description: 商品下单
     * Summary: 数字商品服务-商品服务-商品下单
     * @param ExecAasAntdaoMypointsOrderskuRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAasAntdaoMypointsOrderskuResponse
     * @throws \Exception
     */
    public function execAasAntdaoMypointsOrderskuEx(ExecAasAntdaoMypointsOrderskuRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAasAntdaoMypointsOrderskuResponse::fromMap($this->doRequest("1.0", "baas.antdao.mypoints.ordersku.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 根据商品ID，查询批量购买的费率
     * Summary: 数字商品服务-商品服务-商品费率查询
     * @param QueryAasAntdaoMypointsSkufeeRequest $request
     * @return QueryAasAntdaoMypointsSkufeeResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsSkufee(QueryAasAntdaoMypointsSkufeeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMypointsSkufeeEx($request, $runtime);
    }

    /**
     * Description: 根据商品ID，查询批量购买的费率
     * Summary: 数字商品服务-商品服务-商品费率查询
     * @param QueryAasAntdaoMypointsSkufeeRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMypointsSkufeeResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsSkufeeEx(QueryAasAntdaoMypointsSkufeeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMypointsSkufeeResponse::fromMap($this->doRequest("1.0", "baas.antdao.mypoints.skufee.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询集分宝SKU的预下单流水记录
     * Summary: 数字商品服务-商品服务-预下单流水查询
     * @param QueryAasAntdaoMypointsPreorderinstructionRequest $request
     * @return QueryAasAntdaoMypointsPreorderinstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsPreorderinstruction(QueryAasAntdaoMypointsPreorderinstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMypointsPreorderinstructionEx($request, $runtime);
    }

    /**
     * Description: 查询集分宝SKU的预下单流水记录
     * Summary: 数字商品服务-商品服务-预下单流水查询
     * @param QueryAasAntdaoMypointsPreorderinstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMypointsPreorderinstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsPreorderinstructionEx(QueryAasAntdaoMypointsPreorderinstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMypointsPreorderinstructionResponse::fromMap($this->doRequest("1.0", "baas.antdao.mypoints.preorderinstruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询下单流水信息
     * Summary: 数字商品服务-商品服务-商品下单流水查询
     * @param QueryAasAntdaoMypointsOrderinstructionRequest $request
     * @return QueryAasAntdaoMypointsOrderinstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsOrderinstruction(QueryAasAntdaoMypointsOrderinstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasAntdaoMypointsOrderinstructionEx($request, $runtime);
    }

    /**
     * Description: 查询下单流水信息
     * Summary: 数字商品服务-商品服务-商品下单流水查询
     * @param QueryAasAntdaoMypointsOrderinstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasAntdaoMypointsOrderinstructionResponse
     * @throws \Exception
     */
    public function queryAasAntdaoMypointsOrderinstructionEx(QueryAasAntdaoMypointsOrderinstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasAntdaoMypointsOrderinstructionResponse::fromMap($this->doRequest("1.0", "baas.antdao.mypoints.orderinstruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }
}
