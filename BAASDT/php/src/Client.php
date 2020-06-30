<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Response;
use AntChain\Alipay\Util\Util;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;

use AntChain\BAASDT\Models\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BAASDT\Models\ExecCardForbiddenRequest;
use AntChain\BAASDT\Models\ExecCardForbiddenResponse;
use AntChain\BAASDT\Models\QueryMypointsOrderinstructionRequest;
use AntChain\BAASDT\Models\QueryMypointsOrderinstructionResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisBlockRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisBlockResponse;
use AntChain\BAASDT\Models\UpdateEquityDefaultpriceRequest;
use AntChain\BAASDT\Models\UpdateEquityDefaultpriceResponse;
use AntChain\BAASDT\Models\CreateMerchantProvisionRequest;
use AntChain\BAASDT\Models\CreateMerchantProvisionResponse;
use AntChain\BAASDT\Models\ExecMypointsOrderskuRequest;
use AntChain\BAASDT\Models\ExecMypointsOrderskuResponse;
use AntChain\BAASDT\Models\SetMerchantProvisionRequest;
use AntChain\BAASDT\Models\SetMerchantProvisionResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisDelegaterelationRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisDelegaterelationResponse;
use AntChain\BAASDT\Models\ExecCardQueryRequest;
use AntChain\BAASDT\Models\ExecCardQueryResponse;
use AntChain\BAASDT\Models\UpdateEquityExchangelimitRequest;
use AntChain\BAASDT\Models\UpdateEquityExchangelimitResponse;
use AntChain\BAASDT\Models\QueryMypointsPreorderinstructionRequest;
use AntChain\BAASDT\Models\QueryMypointsPreorderinstructionResponse;
use AntChain\BAASDT\Models\UpdateBlockanalysisDelegaterelationRequest;
use AntChain\BAASDT\Models\UpdateBlockanalysisDelegaterelationResponse;
use AntChain\BAASDT\Models\UpdateMerchantProvisionRequest;
use AntChain\BAASDT\Models\UpdateMerchantProvisionResponse;
use AntChain\BAASDT\Models\FreezeEquityRequest;
use AntChain\BAASDT\Models\FreezeEquityResponse;
use AntChain\BAASDT\Models\ExecCardWriteoffRequest;
use AntChain\BAASDT\Models\ExecCardWriteoffResponse;
use AntChain\BAASDT\Models\QueryMerchantUserRequest;
use AntChain\BAASDT\Models\QueryMerchantUserResponse;
use AntChain\BAASDT\Models\QueryBlockLastblocknumberRequest;
use AntChain\BAASDT\Models\QueryBlockLastblocknumberResponse;
use AntChain\BAASDT\Models\QueryEquityInstructionRequest;
use AntChain\BAASDT\Models\QueryEquityInstructionResponse;
use AntChain\BAASDT\Models\QueryMerchantProvisionsRequest;
use AntChain\BAASDT\Models\QueryMerchantProvisionsResponse;
use AntChain\BAASDT\Models\QueryConfigDelegaterelationRequest;
use AntChain\BAASDT\Models\QueryConfigDelegaterelationResponse;
use AntChain\BAASDT\Models\ExecExchangeByuserRequest;
use AntChain\BAASDT\Models\ExecExchangeByuserResponse;
use AntChain\BAASDT\Models\QueryMypointsMerchantbalanceRequest;
use AntChain\BAASDT\Models\QueryMypointsMerchantbalanceResponse;
use AntChain\BAASDT\Models\QueryBlockRequest;
use AntChain\BAASDT\Models\QueryBlockResponse;
use AntChain\BAASDT\Models\QueryMerchantRequest;
use AntChain\BAASDT\Models\QueryMerchantResponse;
use AntChain\BAASDT\Models\UpdateConfigDelegaterelationRequest;
use AntChain\BAASDT\Models\UpdateConfigDelegaterelationResponse;
use AntChain\BAASDT\Models\ExecPkiDecryptRequest;
use AntChain\BAASDT\Models\ExecPkiDecryptResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisUserpriceupdatedequitiesRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisUserpriceupdatedequitiesResponse;
use AntChain\BAASDT\Models\CreateMerchantUserRequest;
use AntChain\BAASDT\Models\CreateMerchantUserResponse;
use AntChain\BAASDT\Models\QueryConfigWhitelistRequest;
use AntChain\BAASDT\Models\QueryConfigWhitelistResponse;
use AntChain\BAASDT\Models\ExecPkiEncryptRequest;
use AntChain\BAASDT\Models\ExecPkiEncryptResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisWhitelistRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisWhitelistResponse;
use AntChain\BAASDT\Models\QueryMerchantExchangeableequitylistRequest;
use AntChain\BAASDT\Models\QueryMerchantExchangeableequitylistResponse;
use AntChain\BAASDT\Models\AddEquityCountRequest;
use AntChain\BAASDT\Models\AddEquityCountResponse;
use AntChain\BAASDT\Models\ExecCardChargeresetRequest;
use AntChain\BAASDT\Models\ExecCardChargeresetResponse;
use AntChain\BAASDT\Models\GetPkiPublickeyRequest;
use AntChain\BAASDT\Models\GetPkiPublickeyResponse;
use AntChain\BAASDT\Models\UpdateBlockanalysisWhitelistRequest;
use AntChain\BAASDT\Models\UpdateBlockanalysisWhitelistResponse;
use AntChain\BAASDT\Models\UpdateMerchantFriendRequest;
use AntChain\BAASDT\Models\UpdateMerchantFriendResponse;
use AntChain\BAASDT\Models\CreateEquityRequest;
use AntChain\BAASDT\Models\CreateEquityResponse;
use AntChain\BAASDT\Models\ExecCardCreateRequest;
use AntChain\BAASDT\Models\ExecCardCreateResponse;
use AntChain\BAASDT\Models\ExecMypointsPreorderskuRequest;
use AntChain\BAASDT\Models\ExecMypointsPreorderskuResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisLastblocknumberRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisLastblocknumberResponse;
use AntChain\BAASDT\Models\SetMerchantFundmanagerRequest;
use AntChain\BAASDT\Models\SetMerchantFundmanagerResponse;
use AntChain\BAASDT\Models\QueryEquityCreateresultRequest;
use AntChain\BAASDT\Models\QueryEquityCreateresultResponse;
use AntChain\BAASDT\Models\QueryMypointsSkuRequest;
use AntChain\BAASDT\Models\QueryMypointsSkuResponse;
use AntChain\BAASDT\Models\ConfirmExchangeRequest;
use AntChain\BAASDT\Models\ConfirmExchangeResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisOpenedequitiesRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisOpenedequitiesResponse;
use AntChain\BAASDT\Models\CreateMerchantRequest;
use AntChain\BAASDT\Models\CreateMerchantResponse;
use AntChain\BAASDT\Models\UpdateConfigWhitelistRequest;
use AntChain\BAASDT\Models\UpdateConfigWhitelistResponse;
use AntChain\BAASDT\Models\ExecCardBindnameRequest;
use AntChain\BAASDT\Models\ExecCardBindnameResponse;
use AntChain\BAASDT\Models\QueryMypointsSkufeeRequest;
use AntChain\BAASDT\Models\QueryMypointsSkufeeResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisUnwriteoffvalueRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisUnwriteoffvalueResponse;
use AntChain\BAASDT\Models\QueryMerchantExchangeableequitydetailRequest;
use AntChain\BAASDT\Models\QueryMerchantExchangeableequitydetailResponse;
use AntChain\BAASDT\Models\ExecDataDepositRequest;
use AntChain\BAASDT\Models\ExecDataDepositResponse;
use AntChain\BAASDT\Models\ExecCardChargeRequest;
use AntChain\BAASDT\Models\ExecCardChargeResponse;
use AntChain\BAASDT\Models\ExecAssetGrantrefundRequest;
use AntChain\BAASDT\Models\ExecAssetGrantrefundResponse;
use AntChain\BAASDT\Models\ExecAssetExpireRequest;
use AntChain\BAASDT\Models\ExecAssetExpireResponse;
use AntChain\BAASDT\Models\ExecAssetIssueRequest;
use AntChain\BAASDT\Models\ExecAssetIssueResponse;
use AntChain\BAASDT\Models\ExecAssetAdjustRequest;
use AntChain\BAASDT\Models\ExecAssetAdjustResponse;
use AntChain\BAASDT\Models\UpdateEquityRequest;
use AntChain\BAASDT\Models\UpdateEquityResponse;
use AntChain\BAASDT\Models\QueryAssetInstructionRequest;
use AntChain\BAASDT\Models\QueryAssetInstructionResponse;
use AntChain\BAASDT\Models\ExecAssetGenerateRequest;
use AntChain\BAASDT\Models\ExecAssetGenerateResponse;
use AntChain\BAASDT\Models\QueryAssetRequest;
use AntChain\BAASDT\Models\QueryAssetResponse;
use AntChain\BAASDT\Models\ExecAssetCreateRequest;
use AntChain\BAASDT\Models\ExecAssetCreateResponse;
use AntChain\BAASDT\Models\UpdateEquityValidtimeRequest;
use AntChain\BAASDT\Models\UpdateEquityValidtimeResponse;
use AntChain\BAASDT\Models\QueryEquityRequest;
use AntChain\BAASDT\Models\QueryEquityResponse;
use AntChain\BAASDT\Models\ExecAssetGrantRequest;
use AntChain\BAASDT\Models\ExecAssetGrantResponse;
use AntChain\BAASDT\Models\ExecAssetRedeemRequest;
use AntChain\BAASDT\Models\ExecAssetRedeemResponse;
use AntChain\BAASDT\Models\ConfirmExchangeAftersaleRequest;
use AntChain\BAASDT\Models\ConfirmExchangeAftersaleResponse;
use AntChain\BAASDT\Models\ApplyExchangeAftersaleRequest;
use AntChain\BAASDT\Models\ApplyExchangeAftersaleResponse;
use AntChain\BAASDT\Models\UpdateEquityStatusRequest;
use AntChain\BAASDT\Models\UpdateEquityStatusResponse;
use AntChain\BAASDT\Models\QueryExchangeInstructionRequest;
use AntChain\BAASDT\Models\QueryExchangeInstructionResponse;
use AntChain\BAASDT\Models\SendExchangeRequest;
use AntChain\BAASDT\Models\SendExchangeResponse;
use AntChain\BAASDT\Models\AuthEquityMerchantuserpriceRequest;
use AntChain\BAASDT\Models\AuthEquityMerchantuserpriceResponse;
use AntChain\BAASDT\Models\RefuseExchangeAftersaleRequest;
use AntChain\BAASDT\Models\RefuseExchangeAftersaleResponse;
use AntChain\BAASDT\Models\ExecExchangeAgreeaftersaleRequest;
use AntChain\BAASDT\Models\ExecExchangeAgreeaftersaleResponse;
use AntChain\BAASDT\Models\UpdateEquityTenantpriceRequest;
use AntChain\BAASDT\Models\UpdateEquityTenantpriceResponse;
use AntChain\BAASDT\Models\QueryImageRequest;
use AntChain\BAASDT\Models\QueryImageResponse;
use AntChain\BAASDT\Models\OfflineEquityRequest;
use AntChain\BAASDT\Models\OfflineEquityResponse;
use AntChain\BAASDT\Models\SendExchangeAftersaleRequest;
use AntChain\BAASDT\Models\SendExchangeAftersaleResponse;
use AntChain\BAASDT\Models\ExecExchangeBymerchantRequest;
use AntChain\BAASDT\Models\ExecExchangeBymerchantResponse;
use AntChain\BAASDT\Models\UploadImageRequest;
use AntChain\BAASDT\Models\UploadImageResponse;
use AntChain\BAASDT\Models\ExecExchangeOutofstoreRequest;
use AntChain\BAASDT\Models\ExecExchangeOutofstoreResponse;
use AntChain\BAASDT\Models\ExecExchangeReceivebymerchantRequest;
use AntChain\BAASDT\Models\ExecExchangeReceivebymerchantResponse;
use AntChain\BAASDT\Models\ExecExchangeReceivebyuserRequest;
use AntChain\BAASDT\Models\ExecExchangeReceivebyuserResponse;

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

    protected $_authToken;

    protected $_tenant;

    protected $_workspace;

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
        $this->_tenant = $config->tenant;
        $this->_workspace = $config->workspace;
        $this->_endpoint = $config->endpoint;
        $this->_authToken = $config->authToken;
        $this->_protocol = $config->protocol;
        $this->_regionId = $config->regionId;
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
     * @param string $action api name
     * @param string $protocol http or https
     * @param string $method e.g. GET
     * @param string $pathname pathname of every api
     * @param object $request which contains request params
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return object|array response
     * @throws \Exception
     */
    public function doRequest($action, $protocol, $method, $pathname, $request, RuntimeOptions $runtime){
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
                    "version" => "1.0",
                    "sign_type" => "HmacSHA1",
                    "req_time" => Util::getTimestamp(),
                    "req_msg_id" => Utils::getNonce()
                    ];
                if (!Utils::empty_($this->_tenant)) {
                    $_request->query["tenant"] = $this->_tenant;
                }
                if (!Utils::empty_($this->_workspace)) {
                    $_request->query["workspace"] = $this->_workspace;
                }
                if (!Utils::empty_($this->_authToken)) {
                    $_request->query["auth_token"] = $this->_authToken;
                }
                else {
                    $_request->query["access_key"] = $this->_accessKeyId;
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
                $_request->query["sign"] = Util::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $obj = Utils::readAsJSON($_response->body);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap($res["response"]);
                if (Util::hasError($res)) {
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
        $userAgent = Utils::getUserAgent($this->_userAgent);
        return $userAgent;
    }

    /**
     * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-风控禁用卡密
     * @param ExecCardForbiddenRequest $request
     * @return ExecCardForbiddenResponse
     * @throws \Exception
     */
    public function execCardForbidden(ExecCardForbiddenRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execCardForbiddenEx($request, $runtime);
    }

    /**
     * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-风控禁用卡密
     * @param ExecCardForbiddenRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecCardForbiddenResponse
     * @throws \Exception
     */
    public function execCardForbiddenEx(ExecCardForbiddenRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecCardForbiddenResponse::fromMap($this->doRequest("baas.antdao.card.forbidden.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询下单流水信息
     * Summary: 数字商品服务-商品服务-商品下单流水查询
     * @param QueryMypointsOrderinstructionRequest $request
     * @return QueryMypointsOrderinstructionResponse
     * @throws \Exception
     */
    public function queryMypointsOrderinstruction(QueryMypointsOrderinstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMypointsOrderinstructionEx($request, $runtime);
    }

    /**
     * Description: 查询下单流水信息
     * Summary: 数字商品服务-商品服务-商品下单流水查询
     * @param QueryMypointsOrderinstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMypointsOrderinstructionResponse
     * @throws \Exception
     */
    public function queryMypointsOrderinstructionEx(QueryMypointsOrderinstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMypointsOrderinstructionResponse::fromMap($this->doRequest("baas.antdao.mypoints.orderinstruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     * @param QueryBlockanalysisBlockRequest $request
     * @return QueryBlockanalysisBlockResponse
     * @throws \Exception
     */
    public function queryBlockanalysisBlock(QueryBlockanalysisBlockRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBlockanalysisBlockEx($request, $runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     * @param QueryBlockanalysisBlockRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBlockanalysisBlockResponse
     * @throws \Exception
     */
    public function queryBlockanalysisBlockEx(QueryBlockanalysisBlockRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryBlockanalysisBlockResponse::fromMap($this->doRequest("baas.antdao.blockanalysis.block.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品价格
     * Summary: 数字商品服务-商品服务-更新商品价格
     * @param UpdateEquityDefaultpriceRequest $request
     * @return UpdateEquityDefaultpriceResponse
     * @throws \Exception
     */
    public function updateEquityDefaultprice(UpdateEquityDefaultpriceRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateEquityDefaultpriceEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品价格
     * Summary: 数字商品服务-商品服务-更新商品价格
     * @param UpdateEquityDefaultpriceRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateEquityDefaultpriceResponse
     * @throws \Exception
     */
    public function updateEquityDefaultpriceEx(UpdateEquityDefaultpriceRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateEquityDefaultpriceResponse::fromMap($this->doRequest("baas.antdao.equity.defaultprice.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建备付金账户，合约管理员权限
     * Summary: 数字商品服务-商户管理-创建备付金账户
     * @param CreateMerchantProvisionRequest $request
     * @return CreateMerchantProvisionResponse
     * @throws \Exception
     */
    public function createMerchantProvision(CreateMerchantProvisionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createMerchantProvisionEx($request, $runtime);
    }

    /**
     * Description: 创建备付金账户，合约管理员权限
     * Summary: 数字商品服务-商户管理-创建备付金账户
     * @param CreateMerchantProvisionRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateMerchantProvisionResponse
     * @throws \Exception
     */
    public function createMerchantProvisionEx(CreateMerchantProvisionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateMerchantProvisionResponse::fromMap($this->doRequest("baas.antdao.merchant.provision.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商品下单
     * Summary: 数字商品服务-商品服务-商品下单
     * @param ExecMypointsOrderskuRequest $request
     * @return ExecMypointsOrderskuResponse
     * @throws \Exception
     */
    public function execMypointsOrdersku(ExecMypointsOrderskuRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execMypointsOrderskuEx($request, $runtime);
    }

    /**
     * Description: 商品下单
     * Summary: 数字商品服务-商品服务-商品下单
     * @param ExecMypointsOrderskuRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecMypointsOrderskuResponse
     * @throws \Exception
     */
    public function execMypointsOrderskuEx(ExecMypointsOrderskuRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecMypointsOrderskuResponse::fromMap($this->doRequest("baas.antdao.mypoints.ordersku.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置备付金金额（CAS接口）
     * Summary: 数字商品服务-商户管理-设置备付金金额
     * @param SetMerchantProvisionRequest $request
     * @return SetMerchantProvisionResponse
     * @throws \Exception
     */
    public function setMerchantProvision(SetMerchantProvisionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->setMerchantProvisionEx($request, $runtime);
    }

    /**
     * Description: 设置备付金金额（CAS接口）
     * Summary: 数字商品服务-商户管理-设置备付金金额
     * @param SetMerchantProvisionRequest $request
     * @param RuntimeOptions $runtime
     * @return SetMerchantProvisionResponse
     * @throws \Exception
     */
    public function setMerchantProvisionEx(SetMerchantProvisionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SetMerchantProvisionResponse::fromMap($this->doRequest("baas.antdao.merchant.provision.set", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-拉块服务-代理权限查询
     * @param QueryBlockanalysisDelegaterelationRequest $request
     * @return QueryBlockanalysisDelegaterelationResponse
     * @throws \Exception
     */
    public function queryBlockanalysisDelegaterelation(QueryBlockanalysisDelegaterelationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBlockanalysisDelegaterelationEx($request, $runtime);
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-拉块服务-代理权限查询
     * @param QueryBlockanalysisDelegaterelationRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBlockanalysisDelegaterelationResponse
     * @throws \Exception
     */
    public function queryBlockanalysisDelegaterelationEx(QueryBlockanalysisDelegaterelationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryBlockanalysisDelegaterelationResponse::fromMap($this->doRequest("baas.antdao.blockanalysis.delegaterelation.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-查询卡密
     * @param ExecCardQueryRequest $request
     * @return ExecCardQueryResponse
     * @throws \Exception
     */
    public function execCardQuery(ExecCardQueryRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execCardQueryEx($request, $runtime);
    }

    /**
     * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-查询卡密
     * @param ExecCardQueryRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecCardQueryResponse
     * @throws \Exception
     */
    public function execCardQueryEx(ExecCardQueryRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecCardQueryResponse::fromMap($this->doRequest("baas.antdao.card.query.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新兑换限制规则
     * Summary: 数字商品服务-商品服务-更新兑换限制规则
     * @param UpdateEquityExchangelimitRequest $request
     * @return UpdateEquityExchangelimitResponse
     * @throws \Exception
     */
    public function updateEquityExchangelimit(UpdateEquityExchangelimitRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateEquityExchangelimitEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新兑换限制规则
     * Summary: 数字商品服务-商品服务-更新兑换限制规则
     * @param UpdateEquityExchangelimitRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateEquityExchangelimitResponse
     * @throws \Exception
     */
    public function updateEquityExchangelimitEx(UpdateEquityExchangelimitRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateEquityExchangelimitResponse::fromMap($this->doRequest("baas.antdao.equity.exchangelimit.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询集分宝SKU的预下单流水记录
     * Summary: 数字商品服务-商品服务-预下单流水查询
     * @param QueryMypointsPreorderinstructionRequest $request
     * @return QueryMypointsPreorderinstructionResponse
     * @throws \Exception
     */
    public function queryMypointsPreorderinstruction(QueryMypointsPreorderinstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMypointsPreorderinstructionEx($request, $runtime);
    }

    /**
     * Description: 查询集分宝SKU的预下单流水记录
     * Summary: 数字商品服务-商品服务-预下单流水查询
     * @param QueryMypointsPreorderinstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMypointsPreorderinstructionResponse
     * @throws \Exception
     */
    public function queryMypointsPreorderinstructionEx(QueryMypointsPreorderinstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMypointsPreorderinstructionResponse::fromMap($this->doRequest("baas.antdao.mypoints.preorderinstruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-拉块服务-设置代理权限
     * @param UpdateBlockanalysisDelegaterelationRequest $request
     * @return UpdateBlockanalysisDelegaterelationResponse
     * @throws \Exception
     */
    public function updateBlockanalysisDelegaterelation(UpdateBlockanalysisDelegaterelationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateBlockanalysisDelegaterelationEx($request, $runtime);
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-拉块服务-设置代理权限
     * @param UpdateBlockanalysisDelegaterelationRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateBlockanalysisDelegaterelationResponse
     * @throws \Exception
     */
    public function updateBlockanalysisDelegaterelationEx(UpdateBlockanalysisDelegaterelationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateBlockanalysisDelegaterelationResponse::fromMap($this->doRequest("baas.antdao.blockanalysis.delegaterelation.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商户的备付金金额，由资金管理员操作
     * Summary: 数字商品服务-商户管理-更新备付金金额
     * @param UpdateMerchantProvisionRequest $request
     * @return UpdateMerchantProvisionResponse
     * @throws \Exception
     */
    public function updateMerchantProvision(UpdateMerchantProvisionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateMerchantProvisionEx($request, $runtime);
    }

    /**
     * Description: 更新商户的备付金金额，由资金管理员操作
     * Summary: 数字商品服务-商户管理-更新备付金金额
     * @param UpdateMerchantProvisionRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateMerchantProvisionResponse
     * @throws \Exception
     */
    public function updateMerchantProvisionEx(UpdateMerchantProvisionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateMerchantProvisionResponse::fromMap($this->doRequest("baas.antdao.merchant.provision.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至baas.antdao.equity.status.update
     * 冻结权益
     * Summary: 数字商品服务-商品服务-冻结商品
     * @param FreezeEquityRequest $request
     * @return FreezeEquityResponse
     * @throws \Exception
     */
    public function freezeEquity(FreezeEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->freezeEquityEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至baas.antdao.equity.status.update
     * 冻结权益
     * Summary: 数字商品服务-商品服务-冻结商品
     * @param FreezeEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return FreezeEquityResponse
     * @throws \Exception
     */
    public function freezeEquityEx(FreezeEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return FreezeEquityResponse::fromMap($this->doRequest("baas.antdao.equity.freeze", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-核销卡密
     * @param ExecCardWriteoffRequest $request
     * @return ExecCardWriteoffResponse
     * @throws \Exception
     */
    public function execCardWriteoff(ExecCardWriteoffRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execCardWriteoffEx($request, $runtime);
    }

    /**
     * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-核销卡密
     * @param ExecCardWriteoffRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecCardWriteoffResponse
     * @throws \Exception
     */
    public function execCardWriteoffEx(ExecCardWriteoffRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecCardWriteoffResponse::fromMap($this->doRequest("baas.antdao.card.writeoff.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询调用商户下的用户信息
     * Summary: 数字商品服务-商户管理-查询用户信息
     * @param QueryMerchantUserRequest $request
     * @return QueryMerchantUserResponse
     * @throws \Exception
     */
    public function queryMerchantUser(QueryMerchantUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMerchantUserEx($request, $runtime);
    }

    /**
     * Description: 查询调用商户下的用户信息
     * Summary: 数字商品服务-商户管理-查询用户信息
     * @param QueryMerchantUserRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMerchantUserResponse
     * @throws \Exception
     */
    public function queryMerchantUserEx(QueryMerchantUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMerchantUserResponse::fromMap($this->doRequest("baas.antdao.merchant.user.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取区块链最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     * @param QueryBlockLastblocknumberRequest $request
     * @return QueryBlockLastblocknumberResponse
     * @throws \Exception
     */
    public function queryBlockLastblocknumber(QueryBlockLastblocknumberRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBlockLastblocknumberEx($request, $runtime);
    }

    /**
     * Description: 获取区块链最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     * @param QueryBlockLastblocknumberRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBlockLastblocknumberResponse
     * @throws \Exception
     */
    public function queryBlockLastblocknumberEx(QueryBlockLastblocknumberRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryBlockLastblocknumberResponse::fromMap($this->doRequest("baas.antdao.block.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 根据商品兑换流水交易号查询商品兑换流水详情
     * Summary: 数字商品服务-商品服务-查询商品兑换流水
     * @param QueryEquityInstructionRequest $request
     * @return QueryEquityInstructionResponse
     * @throws \Exception
     */
    public function queryEquityInstruction(QueryEquityInstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryEquityInstructionEx($request, $runtime);
    }

    /**
     * Description: 根据商品兑换流水交易号查询商品兑换流水详情
     * Summary: 数字商品服务-商品服务-查询商品兑换流水
     * @param QueryEquityInstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryEquityInstructionResponse
     * @throws \Exception
     */
    public function queryEquityInstructionEx(QueryEquityInstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryEquityInstructionResponse::fromMap($this->doRequest("baas.antdao.equity.instruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询租户的备付金列表
     * Summary: 数字商品服务-商户管理-查租户备付金列表
     * @param QueryMerchantProvisionsRequest $request
     * @return QueryMerchantProvisionsResponse
     * @throws \Exception
     */
    public function queryMerchantProvisions(QueryMerchantProvisionsRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMerchantProvisionsEx($request, $runtime);
    }

    /**
     * Description: 查询租户的备付金列表
     * Summary: 数字商品服务-商户管理-查租户备付金列表
     * @param QueryMerchantProvisionsRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMerchantProvisionsResponse
     * @throws \Exception
     */
    public function queryMerchantProvisionsEx(QueryMerchantProvisionsRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMerchantProvisionsResponse::fromMap($this->doRequest("baas.antdao.merchant.provisions.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-管理服务-代理权限查询
     * @param QueryConfigDelegaterelationRequest $request
     * @return QueryConfigDelegaterelationResponse
     * @throws \Exception
     */
    public function queryConfigDelegaterelation(QueryConfigDelegaterelationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryConfigDelegaterelationEx($request, $runtime);
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-管理服务-代理权限查询
     * @param QueryConfigDelegaterelationRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryConfigDelegaterelationResponse
     * @throws \Exception
     */
    public function queryConfigDelegaterelationEx(QueryConfigDelegaterelationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryConfigDelegaterelationResponse::fromMap($this->doRequest("baas.antdao.config.delegaterelation.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户身份发起兑换
     * Summary: 数字商品服务-兑换服务-用户身份发起兑换
     * @param ExecExchangeByuserRequest $request
     * @return ExecExchangeByuserResponse
     * @throws \Exception
     */
    public function execExchangeByuser(ExecExchangeByuserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execExchangeByuserEx($request, $runtime);
    }

    /**
     * Description: 用户身份发起兑换
     * Summary: 数字商品服务-兑换服务-用户身份发起兑换
     * @param ExecExchangeByuserRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecExchangeByuserResponse
     * @throws \Exception
     */
    public function execExchangeByuserEx(ExecExchangeByuserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecExchangeByuserResponse::fromMap($this->doRequest("baas.antdao.exchange.byuser.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询商户的积分库和预算库
     * Summary: 数字商品服务-商品服务-积分预算库查询
     * @param QueryMypointsMerchantbalanceRequest $request
     * @return QueryMypointsMerchantbalanceResponse
     * @throws \Exception
     */
    public function queryMypointsMerchantbalance(QueryMypointsMerchantbalanceRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMypointsMerchantbalanceEx($request, $runtime);
    }

    /**
     * Description: 查询商户的积分库和预算库
     * Summary: 数字商品服务-商品服务-积分预算库查询
     * @param QueryMypointsMerchantbalanceRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMypointsMerchantbalanceResponse
     * @throws \Exception
     */
    public function queryMypointsMerchantbalanceEx(QueryMypointsMerchantbalanceRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMypointsMerchantbalanceResponse::fromMap($this->doRequest("baas.antdao.mypoints.merchantbalance.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     * @param QueryBlockRequest $request
     * @return QueryBlockResponse
     * @throws \Exception
     */
    public function queryBlock(QueryBlockRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBlockEx($request, $runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     * @param QueryBlockRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBlockResponse
     * @throws \Exception
     */
    public function queryBlockEx(QueryBlockRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryBlockResponse::fromMap($this->doRequest("baas.antdao.block.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
     * Summary: 数字商品服务-商户管理-查询商户信息
     * @param QueryMerchantRequest $request
     * @return QueryMerchantResponse
     * @throws \Exception
     */
    public function queryMerchant(QueryMerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMerchantEx($request, $runtime);
    }

    /**
     * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
     * Summary: 数字商品服务-商户管理-查询商户信息
     * @param QueryMerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMerchantResponse
     * @throws \Exception
     */
    public function queryMerchantEx(QueryMerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMerchantResponse::fromMap($this->doRequest("baas.antdao.merchant.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-管理服务-设置代理权限
     * @param UpdateConfigDelegaterelationRequest $request
     * @return UpdateConfigDelegaterelationResponse
     * @throws \Exception
     */
    public function updateConfigDelegaterelation(UpdateConfigDelegaterelationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateConfigDelegaterelationEx($request, $runtime);
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-管理服务-设置代理权限
     * @param UpdateConfigDelegaterelationRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateConfigDelegaterelationResponse
     * @throws \Exception
     */
    public function updateConfigDelegaterelationEx(UpdateConfigDelegaterelationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateConfigDelegaterelationResponse::fromMap($this->doRequest("baas.antdao.config.delegaterelation.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: ECC解密算法接口
     * Summary: 数字商品服务-密钥管理-私钥解密
     * @param ExecPkiDecryptRequest $request
     * @return ExecPkiDecryptResponse
     * @throws \Exception
     */
    public function execPkiDecrypt(ExecPkiDecryptRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execPkiDecryptEx($request, $runtime);
    }

    /**
     * Description: ECC解密算法接口
     * Summary: 数字商品服务-密钥管理-私钥解密
     * @param ExecPkiDecryptRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecPkiDecryptResponse
     * @throws \Exception
     */
    public function execPkiDecryptEx(ExecPkiDecryptRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecPkiDecryptResponse::fromMap($this->doRequest("baas.antdao.pki.decrypt.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询已设置过用户价格的有效权益商品信息
     * Summary: 数字商品服务-拉块服务-已设用户价格商品
     * @param QueryBlockanalysisUserpriceupdatedequitiesRequest $request
     * @return QueryBlockanalysisUserpriceupdatedequitiesResponse
     * @throws \Exception
     */
    public function queryBlockanalysisUserpriceupdatedequities(QueryBlockanalysisUserpriceupdatedequitiesRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBlockanalysisUserpriceupdatedequitiesEx($request, $runtime);
    }

    /**
     * Description: 查询已设置过用户价格的有效权益商品信息
     * Summary: 数字商品服务-拉块服务-已设用户价格商品
     * @param QueryBlockanalysisUserpriceupdatedequitiesRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBlockanalysisUserpriceupdatedequitiesResponse
     * @throws \Exception
     */
    public function queryBlockanalysisUserpriceupdatedequitiesEx(QueryBlockanalysisUserpriceupdatedequitiesRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryBlockanalysisUserpriceupdatedequitiesResponse::fromMap($this->doRequest("baas.antdao.blockanalysis.userpriceupdatedequities.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建商户管理下的用户
     * Summary: 数字商品服务-商户管理-商户创建用户
     * @param CreateMerchantUserRequest $request
     * @return CreateMerchantUserResponse
     * @throws \Exception
     */
    public function createMerchantUser(CreateMerchantUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createMerchantUserEx($request, $runtime);
    }

    /**
     * Description: 创建商户管理下的用户
     * Summary: 数字商品服务-商户管理-商户创建用户
     * @param CreateMerchantUserRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateMerchantUserResponse
     * @throws \Exception
     */
    public function createMerchantUserEx(CreateMerchantUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateMerchantUserResponse::fromMap($this->doRequest("baas.antdao.merchant.user.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     * @param QueryConfigWhitelistRequest $request
     * @return QueryConfigWhitelistResponse
     * @throws \Exception
     */
    public function queryConfigWhitelist(QueryConfigWhitelistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryConfigWhitelistEx($request, $runtime);
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     * @param QueryConfigWhitelistRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryConfigWhitelistResponse
     * @throws \Exception
     */
    public function queryConfigWhitelistEx(QueryConfigWhitelistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryConfigWhitelistResponse::fromMap($this->doRequest("baas.antdao.config.whitelist.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: ECC公钥加密接口
     * Summary: 数字商品服务-密钥管理-公钥加密
     * @param ExecPkiEncryptRequest $request
     * @return ExecPkiEncryptResponse
     * @throws \Exception
     */
    public function execPkiEncrypt(ExecPkiEncryptRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execPkiEncryptEx($request, $runtime);
    }

    /**
     * Description: ECC公钥加密接口
     * Summary: 数字商品服务-密钥管理-公钥加密
     * @param ExecPkiEncryptRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecPkiEncryptResponse
     * @throws \Exception
     */
    public function execPkiEncryptEx(ExecPkiEncryptRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecPkiEncryptResponse::fromMap($this->doRequest("baas.antdao.pki.encrypt.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     * @param QueryBlockanalysisWhitelistRequest $request
     * @return QueryBlockanalysisWhitelistResponse
     * @throws \Exception
     */
    public function queryBlockanalysisWhitelist(QueryBlockanalysisWhitelistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBlockanalysisWhitelistEx($request, $runtime);
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     * @param QueryBlockanalysisWhitelistRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBlockanalysisWhitelistResponse
     * @throws \Exception
     */
    public function queryBlockanalysisWhitelistEx(QueryBlockanalysisWhitelistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryBlockanalysisWhitelistResponse::fromMap($this->doRequest("baas.antdao.blockanalysis.whitelist.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
     * Summary: 数字商品服务-商户管理-查询可兑换商品
     * @param QueryMerchantExchangeableequitylistRequest $request
     * @return QueryMerchantExchangeableequitylistResponse
     * @throws \Exception
     */
    public function queryMerchantExchangeableequitylist(QueryMerchantExchangeableequitylistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMerchantExchangeableequitylistEx($request, $runtime);
    }

    /**
     * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
     * Summary: 数字商品服务-商户管理-查询可兑换商品
     * @param QueryMerchantExchangeableequitylistRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMerchantExchangeableequitylistResponse
     * @throws \Exception
     */
    public function queryMerchantExchangeableequitylistEx(QueryMerchantExchangeableequitylistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMerchantExchangeableequitylistResponse::fromMap($this->doRequest("baas.antdao.merchant.exchangeableequitylist.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 增加权益库存
     * Summary: 数字商品服务-商品服务-增加权益库存
     * @param AddEquityCountRequest $request
     * @return AddEquityCountResponse
     * @throws \Exception
     */
    public function addEquityCount(AddEquityCountRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->addEquityCountEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 增加权益库存
     * Summary: 数字商品服务-商品服务-增加权益库存
     * @param AddEquityCountRequest $request
     * @param RuntimeOptions $runtime
     * @return AddEquityCountResponse
     * @throws \Exception
     */
    public function addEquityCountEx(AddEquityCountRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AddEquityCountResponse::fromMap($this->doRequest("baas.antdao.equity.count.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-充值重置卡密
     * @param ExecCardChargeresetRequest $request
     * @return ExecCardChargeresetResponse
     * @throws \Exception
     */
    public function execCardChargereset(ExecCardChargeresetRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execCardChargeresetEx($request, $runtime);
    }

    /**
     * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-充值重置卡密
     * @param ExecCardChargeresetRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecCardChargeresetResponse
     * @throws \Exception
     */
    public function execCardChargeresetEx(ExecCardChargeresetRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecCardChargeresetResponse::fromMap($this->doRequest("baas.antdao.card.chargereset.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取kms中对应用户的公钥
     * Summary: 数字商品服务-密钥管理-获取用户公钥
     * @param GetPkiPublickeyRequest $request
     * @return GetPkiPublickeyResponse
     * @throws \Exception
     */
    public function getPkiPublickey(GetPkiPublickeyRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->getPkiPublickeyEx($request, $runtime);
    }

    /**
     * Description: 获取kms中对应用户的公钥
     * Summary: 数字商品服务-密钥管理-获取用户公钥
     * @param GetPkiPublickeyRequest $request
     * @param RuntimeOptions $runtime
     * @return GetPkiPublickeyResponse
     * @throws \Exception
     */
    public function getPkiPublickeyEx(GetPkiPublickeyRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return GetPkiPublickeyResponse::fromMap($this->doRequest("baas.antdao.pki.publickey.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置接口访问白名单。
     * Summary: 数字商品服务-拉块服务-设置访问白名单
     * @param UpdateBlockanalysisWhitelistRequest $request
     * @return UpdateBlockanalysisWhitelistResponse
     * @throws \Exception
     */
    public function updateBlockanalysisWhitelist(UpdateBlockanalysisWhitelistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateBlockanalysisWhitelistEx($request, $runtime);
    }

    /**
     * Description: 设置接口访问白名单。
     * Summary: 数字商品服务-拉块服务-设置访问白名单
     * @param UpdateBlockanalysisWhitelistRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateBlockanalysisWhitelistResponse
     * @throws \Exception
     */
    public function updateBlockanalysisWhitelistEx(UpdateBlockanalysisWhitelistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateBlockanalysisWhitelistResponse::fromMap($this->doRequest("baas.antdao.blockanalysis.whitelist.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商户的友商信息
     * Summary: 数字商品服务-商户管理-更新商户友商
     * @param UpdateMerchantFriendRequest $request
     * @return UpdateMerchantFriendResponse
     * @throws \Exception
     */
    public function updateMerchantFriend(UpdateMerchantFriendRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateMerchantFriendEx($request, $runtime);
    }

    /**
     * Description: 更新商户的友商信息
     * Summary: 数字商品服务-商户管理-更新商户友商
     * @param UpdateMerchantFriendRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateMerchantFriendResponse
     * @throws \Exception
     */
    public function updateMerchantFriendEx(UpdateMerchantFriendRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateMerchantFriendResponse::fromMap($this->doRequest("baas.antdao.merchant.friend.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商品供应商户发布一个商品
     * Summary: 数字商品服务-商品服务-创建商品
     * @param CreateEquityRequest $request
     * @return CreateEquityResponse
     * @throws \Exception
     */
    public function createEquity(CreateEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createEquityEx($request, $runtime);
    }

    /**
     * Description: 商品供应商户发布一个商品
     * Summary: 数字商品服务-商品服务-创建商品
     * @param CreateEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateEquityResponse
     * @throws \Exception
     */
    public function createEquityEx(CreateEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateEquityResponse::fromMap($this->doRequest("baas.antdao.equity.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-创建卡密
     * @param ExecCardCreateRequest $request
     * @return ExecCardCreateResponse
     * @throws \Exception
     */
    public function execCardCreate(ExecCardCreateRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execCardCreateEx($request, $runtime);
    }

    /**
     * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-创建卡密
     * @param ExecCardCreateRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecCardCreateResponse
     * @throws \Exception
     */
    public function execCardCreateEx(ExecCardCreateRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecCardCreateResponse::fromMap($this->doRequest("baas.antdao.card.create.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 预下单商品
     * Summary: 数字商品服务-商品服务-商品预下单
     * @param ExecMypointsPreorderskuRequest $request
     * @return ExecMypointsPreorderskuResponse
     * @throws \Exception
     */
    public function execMypointsPreordersku(ExecMypointsPreorderskuRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execMypointsPreorderskuEx($request, $runtime);
    }

    /**
     * Description: 预下单商品
     * Summary: 数字商品服务-商品服务-商品预下单
     * @param ExecMypointsPreorderskuRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecMypointsPreorderskuResponse
     * @throws \Exception
     */
    public function execMypointsPreorderskuEx(ExecMypointsPreorderskuRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecMypointsPreorderskuResponse::fromMap($this->doRequest("baas.antdao.mypoints.preordersku.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     * @param QueryBlockanalysisLastblocknumberRequest $request
     * @return QueryBlockanalysisLastblocknumberResponse
     * @throws \Exception
     */
    public function queryBlockanalysisLastblocknumber(QueryBlockanalysisLastblocknumberRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBlockanalysisLastblocknumberEx($request, $runtime);
    }

    /**
     * Description: 获取最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     * @param QueryBlockanalysisLastblocknumberRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBlockanalysisLastblocknumberResponse
     * @throws \Exception
     */
    public function queryBlockanalysisLastblocknumberEx(QueryBlockanalysisLastblocknumberRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryBlockanalysisLastblocknumberResponse::fromMap($this->doRequest("baas.antdao.blockanalysis.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置商户的资金管理员，重要权限，谨慎操作！
     * Summary: 数字商品服务-商户管理-设置资金管理员
     * @param SetMerchantFundmanagerRequest $request
     * @return SetMerchantFundmanagerResponse
     * @throws \Exception
     */
    public function setMerchantFundmanager(SetMerchantFundmanagerRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->setMerchantFundmanagerEx($request, $runtime);
    }

    /**
     * Description: 设置商户的资金管理员，重要权限，谨慎操作！
     * Summary: 数字商品服务-商户管理-设置资金管理员
     * @param SetMerchantFundmanagerRequest $request
     * @param RuntimeOptions $runtime
     * @return SetMerchantFundmanagerResponse
     * @throws \Exception
     */
    public function setMerchantFundmanagerEx(SetMerchantFundmanagerRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SetMerchantFundmanagerResponse::fromMap($this->doRequest("baas.antdao.merchant.fundmanager.set", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
     * Summary: 数字商品服务-商品服务-发布商品结果查询
     * @param QueryEquityCreateresultRequest $request
     * @return QueryEquityCreateresultResponse
     * @throws \Exception
     */
    public function queryEquityCreateresult(QueryEquityCreateresultRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryEquityCreateresultEx($request, $runtime);
    }

    /**
     * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
     * Summary: 数字商品服务-商品服务-发布商品结果查询
     * @param QueryEquityCreateresultRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryEquityCreateresultResponse
     * @throws \Exception
     */
    public function queryEquityCreateresultEx(QueryEquityCreateresultRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryEquityCreateresultResponse::fromMap($this->doRequest("baas.antdao.equity.createresult.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可订购的SKU列表查询
     * Summary: 数字商品服务-商品服务-商品列表查询
     * @param QueryMypointsSkuRequest $request
     * @return QueryMypointsSkuResponse
     * @throws \Exception
     */
    public function queryMypointsSku(QueryMypointsSkuRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMypointsSkuEx($request, $runtime);
    }

    /**
     * Description: 可订购的SKU列表查询
     * Summary: 数字商品服务-商品服务-商品列表查询
     * @param QueryMypointsSkuRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMypointsSkuResponse
     * @throws \Exception
     */
    public function queryMypointsSkuEx(QueryMypointsSkuRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMypointsSkuResponse::fromMap($this->doRequest("baas.antdao.mypoints.sku.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
     * Summary: 数字商品服务-兑换服务-确认接单
     * @param ConfirmExchangeRequest $request
     * @return ConfirmExchangeResponse
     * @throws \Exception
     */
    public function confirmExchange(ConfirmExchangeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->confirmExchangeEx($request, $runtime);
    }

    /**
     * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
     * Summary: 数字商品服务-兑换服务-确认接单
     * @param ConfirmExchangeRequest $request
     * @param RuntimeOptions $runtime
     * @return ConfirmExchangeResponse
     * @throws \Exception
     */
    public function confirmExchangeEx(ConfirmExchangeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ConfirmExchangeResponse::fromMap($this->doRequest("baas.antdao.exchange.confirm", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取公开的或者已授权的权益商品信息
     * Summary: 数字商品服务-拉块服务-获取已授权商品
     * @param QueryBlockanalysisOpenedequitiesRequest $request
     * @return QueryBlockanalysisOpenedequitiesResponse
     * @throws \Exception
     */
    public function queryBlockanalysisOpenedequities(QueryBlockanalysisOpenedequitiesRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBlockanalysisOpenedequitiesEx($request, $runtime);
    }

    /**
     * Description: 获取公开的或者已授权的权益商品信息
     * Summary: 数字商品服务-拉块服务-获取已授权商品
     * @param QueryBlockanalysisOpenedequitiesRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBlockanalysisOpenedequitiesResponse
     * @throws \Exception
     */
    public function queryBlockanalysisOpenedequitiesEx(QueryBlockanalysisOpenedequitiesRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryBlockanalysisOpenedequitiesResponse::fromMap($this->doRequest("baas.antdao.blockanalysis.openedequities.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建商户（合约管理员权限）
     * Summary: 数字商品服务-商户管理-创建商户
     * @param CreateMerchantRequest $request
     * @return CreateMerchantResponse
     * @throws \Exception
     */
    public function createMerchant(CreateMerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createMerchantEx($request, $runtime);
    }

    /**
     * Description: 创建商户（合约管理员权限）
     * Summary: 数字商品服务-商户管理-创建商户
     * @param CreateMerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateMerchantResponse
     * @throws \Exception
     */
    public function createMerchantEx(CreateMerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateMerchantResponse::fromMap($this->doRequest("baas.antdao.merchant.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置接口访问白名单
     * Summary: 数字商品服务-管理服务-设置访问白名单
     * @param UpdateConfigWhitelistRequest $request
     * @return UpdateConfigWhitelistResponse
     * @throws \Exception
     */
    public function updateConfigWhitelist(UpdateConfigWhitelistRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateConfigWhitelistEx($request, $runtime);
    }

    /**
     * Description: 设置接口访问白名单
     * Summary: 数字商品服务-管理服务-设置访问白名单
     * @param UpdateConfigWhitelistRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateConfigWhitelistResponse
     * @throws \Exception
     */
    public function updateConfigWhitelistEx(UpdateConfigWhitelistRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateConfigWhitelistResponse::fromMap($this->doRequest("baas.antdao.config.whitelist.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-记名卡发行
     * @param ExecCardBindnameRequest $request
     * @return ExecCardBindnameResponse
     * @throws \Exception
     */
    public function execCardBindname(ExecCardBindnameRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execCardBindnameEx($request, $runtime);
    }

    /**
     * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-记名卡发行
     * @param ExecCardBindnameRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecCardBindnameResponse
     * @throws \Exception
     */
    public function execCardBindnameEx(ExecCardBindnameRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecCardBindnameResponse::fromMap($this->doRequest("baas.antdao.card.bindname.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 根据商品ID，查询批量购买的费率
     * Summary: 数字商品服务-商品服务-商品费率查询
     * @param QueryMypointsSkufeeRequest $request
     * @return QueryMypointsSkufeeResponse
     * @throws \Exception
     */
    public function queryMypointsSkufee(QueryMypointsSkufeeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMypointsSkufeeEx($request, $runtime);
    }

    /**
     * Description: 根据商品ID，查询批量购买的费率
     * Summary: 数字商品服务-商品服务-商品费率查询
     * @param QueryMypointsSkufeeRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMypointsSkufeeResponse
     * @throws \Exception
     */
    public function queryMypointsSkufeeEx(QueryMypointsSkufeeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMypointsSkufeeResponse::fromMap($this->doRequest("baas.antdao.mypoints.skufee.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询商户的可提现资产价值(单位:分)
     * Summary: 数字商品服务-拉块服务-查询可提现资产
     * @param QueryBlockanalysisUnwriteoffvalueRequest $request
     * @return QueryBlockanalysisUnwriteoffvalueResponse
     * @throws \Exception
     */
    public function queryBlockanalysisUnwriteoffvalue(QueryBlockanalysisUnwriteoffvalueRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryBlockanalysisUnwriteoffvalueEx($request, $runtime);
    }

    /**
     * Description: 查询商户的可提现资产价值(单位:分)
     * Summary: 数字商品服务-拉块服务-查询可提现资产
     * @param QueryBlockanalysisUnwriteoffvalueRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryBlockanalysisUnwriteoffvalueResponse
     * @throws \Exception
     */
    public function queryBlockanalysisUnwriteoffvalueEx(QueryBlockanalysisUnwriteoffvalueRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryBlockanalysisUnwriteoffvalueResponse::fromMap($this->doRequest("baas.antdao.blockanalysis.unwriteoffvalue.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
     * Summary: 数字商品服务-商户管理-查询可兑商品明细
     * @param QueryMerchantExchangeableequitydetailRequest $request
     * @return QueryMerchantExchangeableequitydetailResponse
     * @throws \Exception
     */
    public function queryMerchantExchangeableequitydetail(QueryMerchantExchangeableequitydetailRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryMerchantExchangeableequitydetailEx($request, $runtime);
    }

    /**
     * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
     * Summary: 数字商品服务-商户管理-查询可兑商品明细
     * @param QueryMerchantExchangeableequitydetailRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryMerchantExchangeableequitydetailResponse
     * @throws \Exception
     */
    public function queryMerchantExchangeableequitydetailEx(QueryMerchantExchangeableequitydetailRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryMerchantExchangeableequitydetailResponse::fromMap($this->doRequest("baas.antdao.merchant.exchangeableequitydetail.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 原生存证接口
     * Summary: 数字商品服务-存证服务-原生存证
     * @param ExecDataDepositRequest $request
     * @return ExecDataDepositResponse
     * @throws \Exception
     */
    public function execDataDeposit(ExecDataDepositRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execDataDepositEx($request, $runtime);
    }

    /**
     * Description: 原生存证接口
     * Summary: 数字商品服务-存证服务-原生存证
     * @param ExecDataDepositRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecDataDepositResponse
     * @throws \Exception
     */
    public function execDataDepositEx(ExecDataDepositRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecDataDepositResponse::fromMap($this->doRequest("baas.antdao.data.deposit.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-充值卡密
     * @param ExecCardChargeRequest $request
     * @return ExecCardChargeResponse
     * @throws \Exception
     */
    public function execCardCharge(ExecCardChargeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execCardChargeEx($request, $runtime);
    }

    /**
     * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-消费卡服务-充值卡密
     * @param ExecCardChargeRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecCardChargeResponse
     * @throws \Exception
     */
    public function execCardChargeEx(ExecCardChargeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecCardChargeResponse::fromMap($this->doRequest("baas.antdao.card.charge.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发放回退资产
     * Summary: 数字商品服务-资产服务-发放回退资产
     * @param ExecAssetGrantrefundRequest $request
     * @return ExecAssetGrantrefundResponse
     * @throws \Exception
     */
    public function execAssetGrantrefund(ExecAssetGrantrefundRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAssetGrantrefundEx($request, $runtime);
    }

    /**
     * Description: 发放回退资产
     * Summary: 数字商品服务-资产服务-发放回退资产
     * @param ExecAssetGrantrefundRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAssetGrantrefundResponse
     * @throws \Exception
     */
    public function execAssetGrantrefundEx(ExecAssetGrantrefundRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAssetGrantrefundResponse::fromMap($this->doRequest("baas.antdao.asset.grantrefund.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 资产过期
     * Summary: 数字商品服务-资产服务-资产过期
     * @param ExecAssetExpireRequest $request
     * @return ExecAssetExpireResponse
     * @throws \Exception
     */
    public function execAssetExpire(ExecAssetExpireRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAssetExpireEx($request, $runtime);
    }

    /**
     * Description: 资产过期
     * Summary: 数字商品服务-资产服务-资产过期
     * @param ExecAssetExpireRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAssetExpireResponse
     * @throws \Exception
     */
    public function execAssetExpireEx(ExecAssetExpireRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAssetExpireResponse::fromMap($this->doRequest("baas.antdao.asset.expire.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 资产初始化发行
     * Summary: 数字商品服务-资产服务-资产初始化发行
     * @param ExecAssetIssueRequest $request
     * @return ExecAssetIssueResponse
     * @throws \Exception
     */
    public function execAssetIssue(ExecAssetIssueRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAssetIssueEx($request, $runtime);
    }

    /**
     * Description: 资产初始化发行
     * Summary: 数字商品服务-资产服务-资产初始化发行
     * @param ExecAssetIssueRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAssetIssueResponse
     * @throws \Exception
     */
    public function execAssetIssueEx(ExecAssetIssueRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAssetIssueResponse::fromMap($this->doRequest("baas.antdao.asset.issue.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 风控调整资产
     * Summary: 数字商品服务-资产服务-风控调整资产
     * @param ExecAssetAdjustRequest $request
     * @return ExecAssetAdjustResponse
     * @throws \Exception
     */
    public function execAssetAdjust(ExecAssetAdjustRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAssetAdjustEx($request, $runtime);
    }

    /**
     * Description: 风控调整资产
     * Summary: 数字商品服务-资产服务-风控调整资产
     * @param ExecAssetAdjustRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAssetAdjustResponse
     * @throws \Exception
     */
    public function execAssetAdjustEx(ExecAssetAdjustRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAssetAdjustResponse::fromMap($this->doRequest("baas.antdao.asset.adjust.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-商品服务-更新商品属性信息
     * @param UpdateEquityRequest $request
     * @return UpdateEquityResponse
     * @throws \Exception
     */
    public function updateEquity(UpdateEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateEquityEx($request, $runtime);
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-商品服务-更新商品属性信息
     * @param UpdateEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateEquityResponse
     * @throws \Exception
     */
    public function updateEquityEx(UpdateEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateEquityResponse::fromMap($this->doRequest("baas.antdao.equity.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 检索资产流转流水
     * Summary: 数字商品服务-资产服务-查询资产流转流水
     * @param QueryAssetInstructionRequest $request
     * @return QueryAssetInstructionResponse
     * @throws \Exception
     */
    public function queryAssetInstruction(QueryAssetInstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAssetInstructionEx($request, $runtime);
    }

    /**
     * Description: 检索资产流转流水
     * Summary: 数字商品服务-资产服务-查询资产流转流水
     * @param QueryAssetInstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAssetInstructionResponse
     * @throws \Exception
     */
    public function queryAssetInstructionEx(QueryAssetInstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAssetInstructionResponse::fromMap($this->doRequest("baas.antdao.asset.instruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 资产铸币(不扣减备付金)，合约管理员操作
     * Summary: 数字商品服务-资产服务-资产铸币
     * @param ExecAssetGenerateRequest $request
     * @return ExecAssetGenerateResponse
     * @throws \Exception
     */
    public function execAssetGenerate(ExecAssetGenerateRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAssetGenerateEx($request, $runtime);
    }

    /**
     * Description: 资产铸币(不扣减备付金)，合约管理员操作
     * Summary: 数字商品服务-资产服务-资产铸币
     * @param ExecAssetGenerateRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAssetGenerateResponse
     * @throws \Exception
     */
    public function execAssetGenerateEx(ExecAssetGenerateRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAssetGenerateResponse::fromMap($this->doRequest("baas.antdao.asset.generate.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 资产查询
     * Summary: 数字商品服务-资产服务-资产查询
     * @param QueryAssetRequest $request
     * @return QueryAssetResponse
     * @throws \Exception
     */
    public function queryAsset(QueryAssetRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAssetEx($request, $runtime);
    }

    /**
     * Description: 资产查询
     * Summary: 数字商品服务-资产服务-资产查询
     * @param QueryAssetRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAssetResponse
     * @throws \Exception
     */
    public function queryAssetEx(QueryAssetRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAssetResponse::fromMap($this->doRequest("baas.antdao.asset.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建新资产
     * Summary: 数字商品服务-资产服务-创建资产
     * @param ExecAssetCreateRequest $request
     * @return ExecAssetCreateResponse
     * @throws \Exception
     */
    public function execAssetCreate(ExecAssetCreateRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAssetCreateEx($request, $runtime);
    }

    /**
     * Description: 创建新资产
     * Summary: 数字商品服务-资产服务-创建资产
     * @param ExecAssetCreateRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAssetCreateResponse
     * @throws \Exception
     */
    public function execAssetCreateEx(ExecAssetCreateRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAssetCreateResponse::fromMap($this->doRequest("baas.antdao.asset.create.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品有效期
     * Summary: 数字商品服务-商品服务-更新有效期
     * @param UpdateEquityValidtimeRequest $request
     * @return UpdateEquityValidtimeResponse
     * @throws \Exception
     */
    public function updateEquityValidtime(UpdateEquityValidtimeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateEquityValidtimeEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品有效期
     * Summary: 数字商品服务-商品服务-更新有效期
     * @param UpdateEquityValidtimeRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateEquityValidtimeResponse
     * @throws \Exception
     */
    public function updateEquityValidtimeEx(UpdateEquityValidtimeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateEquityValidtimeResponse::fromMap($this->doRequest("baas.antdao.equity.validtime.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询商品信息
     * Summary: 数字商品服务-商品服务-查询商品信息
     * @param QueryEquityRequest $request
     * @return QueryEquityResponse
     * @throws \Exception
     */
    public function queryEquity(QueryEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryEquityEx($request, $runtime);
    }

    /**
     * Description: 查询商品信息
     * Summary: 数字商品服务-商品服务-查询商品信息
     * @param QueryEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryEquityResponse
     * @throws \Exception
     */
    public function queryEquityEx(QueryEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryEquityResponse::fromMap($this->doRequest("baas.antdao.equity.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发放资产
     * Summary: 数字商品服务-资产服务-发放资产
     * @param ExecAssetGrantRequest $request
     * @return ExecAssetGrantResponse
     * @throws \Exception
     */
    public function execAssetGrant(ExecAssetGrantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAssetGrantEx($request, $runtime);
    }

    /**
     * Description: 发放资产
     * Summary: 数字商品服务-资产服务-发放资产
     * @param ExecAssetGrantRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAssetGrantResponse
     * @throws \Exception
     */
    public function execAssetGrantEx(ExecAssetGrantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAssetGrantResponse::fromMap($this->doRequest("baas.antdao.asset.grant.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 赎回资产
     * Summary: 数字商品服务-资产服务-赎回资产
     * @param ExecAssetRedeemRequest $request
     * @return ExecAssetRedeemResponse
     * @throws \Exception
     */
    public function execAssetRedeem(ExecAssetRedeemRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execAssetRedeemEx($request, $runtime);
    }

    /**
     * Description: 赎回资产
     * Summary: 数字商品服务-资产服务-赎回资产
     * @param ExecAssetRedeemRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecAssetRedeemResponse
     * @throws \Exception
     */
    public function execAssetRedeemEx(ExecAssetRedeemRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecAssetRedeemResponse::fromMap($this->doRequest("baas.antdao.asset.redeem.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户确认售后（供应商）comfirmaftersale
     * Summary:  数字商品服务-兑换服务-商户确认售后
     * @param ConfirmExchangeAftersaleRequest $request
     * @return ConfirmExchangeAftersaleResponse
     * @throws \Exception
     */
    public function confirmExchangeAftersale(ConfirmExchangeAftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->confirmExchangeAftersaleEx($request, $runtime);
    }

    /**
     * Description: 商户确认售后（供应商）comfirmaftersale
     * Summary:  数字商品服务-兑换服务-商户确认售后
     * @param ConfirmExchangeAftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return ConfirmExchangeAftersaleResponse
     * @throws \Exception
     */
    public function confirmExchangeAftersaleEx(ConfirmExchangeAftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ConfirmExchangeAftersaleResponse::fromMap($this->doRequest("baas.antdao.exchange.aftersale.confirm", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 兑换单申请售后（采购商）
     * Summary: 数字商品服务-兑换服务-申请售后(商家)
     * @param ApplyExchangeAftersaleRequest $request
     * @return ApplyExchangeAftersaleResponse
     * @throws \Exception
     */
    public function applyExchangeAftersale(ApplyExchangeAftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->applyExchangeAftersaleEx($request, $runtime);
    }

    /**
     * Description: 兑换单申请售后（采购商）
     * Summary: 数字商品服务-兑换服务-申请售后(商家)
     * @param ApplyExchangeAftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyExchangeAftersaleResponse
     * @throws \Exception
     */
    public function applyExchangeAftersaleEx(ApplyExchangeAftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ApplyExchangeAftersaleResponse::fromMap($this->doRequest("baas.antdao.exchange.aftersale.apply", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商品状态（可用，冻结，下线）
     * Summary: 数字商品服务-商品服务-更新商品状态
     * @param UpdateEquityStatusRequest $request
     * @return UpdateEquityStatusResponse
     * @throws \Exception
     */
    public function updateEquityStatus(UpdateEquityStatusRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateEquityStatusEx($request, $runtime);
    }

    /**
     * Description: 更新商品状态（可用，冻结，下线）
     * Summary: 数字商品服务-商品服务-更新商品状态
     * @param UpdateEquityStatusRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateEquityStatusResponse
     * @throws \Exception
     */
    public function updateEquityStatusEx(UpdateEquityStatusRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateEquityStatusResponse::fromMap($this->doRequest("baas.antdao.equity.status.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口废弃不用！！！
     * 查询商品兑换流水
     * Summary: 数字商品服务-兑换服务-查询商品兑换流水
     * @param QueryExchangeInstructionRequest $request
     * @return QueryExchangeInstructionResponse
     * @throws \Exception
     */
    public function queryExchangeInstruction(QueryExchangeInstructionRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryExchangeInstructionEx($request, $runtime);
    }

    /**
     * Description: 该接口废弃不用！！！
     * 查询商品兑换流水
     * Summary: 数字商品服务-兑换服务-查询商品兑换流水
     * @param QueryExchangeInstructionRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryExchangeInstructionResponse
     * @throws \Exception
     */
    public function queryExchangeInstructionEx(QueryExchangeInstructionRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryExchangeInstructionResponse::fromMap($this->doRequest("baas.antdao.exchange.instruction.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 兑换发货
     * Summary: 数字商品服务-兑换服务-兑换发货
     * @param SendExchangeRequest $request
     * @return SendExchangeResponse
     * @throws \Exception
     */
    public function sendExchange(SendExchangeRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->sendExchangeEx($request, $runtime);
    }

    /**
     * Description: 兑换发货
     * Summary: 数字商品服务-兑换服务-兑换发货
     * @param SendExchangeRequest $request
     * @param RuntimeOptions $runtime
     * @return SendExchangeResponse
     * @throws \Exception
     */
    public function sendExchangeEx(SendExchangeRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SendExchangeResponse::fromMap($this->doRequest("baas.antdao.exchange.send", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户兑换价格设置
     * Summary: 数字商品服务-商品服务-用户兑换价格设置
     * @param AuthEquityMerchantuserpriceRequest $request
     * @return AuthEquityMerchantuserpriceResponse
     * @throws \Exception
     */
    public function authEquityMerchantuserprice(AuthEquityMerchantuserpriceRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->authEquityMerchantuserpriceEx($request, $runtime);
    }

    /**
     * Description: 用户兑换价格设置
     * Summary: 数字商品服务-商品服务-用户兑换价格设置
     * @param AuthEquityMerchantuserpriceRequest $request
     * @param RuntimeOptions $runtime
     * @return AuthEquityMerchantuserpriceResponse
     * @throws \Exception
     */
    public function authEquityMerchantuserpriceEx(AuthEquityMerchantuserpriceRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AuthEquityMerchantuserpriceResponse::fromMap($this->doRequest("baas.antdao.equity.merchantuserprice.auth", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 拒绝售后（供应商）
     * Summary: 数字商品服务-兑换服务-拒绝售后
     * @param RefuseExchangeAftersaleRequest $request
     * @return RefuseExchangeAftersaleResponse
     * @throws \Exception
     */
    public function refuseExchangeAftersale(RefuseExchangeAftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->refuseExchangeAftersaleEx($request, $runtime);
    }

    /**
     * Description: 拒绝售后（供应商）
     * Summary: 数字商品服务-兑换服务-拒绝售后
     * @param RefuseExchangeAftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return RefuseExchangeAftersaleResponse
     * @throws \Exception
     */
    public function refuseExchangeAftersaleEx(RefuseExchangeAftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return RefuseExchangeAftersaleResponse::fromMap($this->doRequest("baas.antdao.exchange.aftersale.refuse", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 同意售后（供应商）
     * Summary: 数字商品服务-兑换服务-同意售后
     * @param ExecExchangeAgreeaftersaleRequest $request
     * @return ExecExchangeAgreeaftersaleResponse
     * @throws \Exception
     */
    public function execExchangeAgreeaftersale(ExecExchangeAgreeaftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execExchangeAgreeaftersaleEx($request, $runtime);
    }

    /**
     * Description: 同意售后（供应商）
     * Summary: 数字商品服务-兑换服务-同意售后
     * @param ExecExchangeAgreeaftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecExchangeAgreeaftersaleResponse
     * @throws \Exception
     */
    public function execExchangeAgreeaftersaleEx(ExecExchangeAgreeaftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecExchangeAgreeaftersaleResponse::fromMap($this->doRequest("baas.antdao.exchange.agreeaftersale.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新商品自定义定价
     * Summary: 数字商品服务-商品服务-更新自定义定价
     * @param UpdateEquityTenantpriceRequest $request
     * @return UpdateEquityTenantpriceResponse
     * @throws \Exception
     */
    public function updateEquityTenantprice(UpdateEquityTenantpriceRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateEquityTenantpriceEx($request, $runtime);
    }

    /**
     * Description: 更新商品自定义定价
     * Summary: 数字商品服务-商品服务-更新自定义定价
     * @param UpdateEquityTenantpriceRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateEquityTenantpriceResponse
     * @throws \Exception
     */
    public function updateEquityTenantpriceEx(UpdateEquityTenantpriceRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateEquityTenantpriceResponse::fromMap($this->doRequest("baas.antdao.equity.tenantprice.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
     * Summary: 数字商品服务-OSS服务-获取图片URL
     * @param QueryImageRequest $request
     * @return QueryImageResponse
     * @throws \Exception
     */
    public function queryImage(QueryImageRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryImageEx($request, $runtime);
    }

    /**
     * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
     * Summary: 数字商品服务-OSS服务-获取图片URL
     * @param QueryImageRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryImageResponse
     * @throws \Exception
     */
    public function queryImageEx(QueryImageRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryImageResponse::fromMap($this->doRequest("baas.antdao.image.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
     * 下线商品
     * Summary: 数字商品服务-商品服务-下线商品
     * @param OfflineEquityRequest $request
     * @return OfflineEquityResponse
     * @throws \Exception
     */
    public function offlineEquity(OfflineEquityRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->offlineEquityEx($request, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
     * 下线商品
     * Summary: 数字商品服务-商品服务-下线商品
     * @param OfflineEquityRequest $request
     * @param RuntimeOptions $runtime
     * @return OfflineEquityResponse
     * @throws \Exception
     */
    public function offlineEquityEx(OfflineEquityRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return OfflineEquityResponse::fromMap($this->doRequest("baas.antdao.equity.offline", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 重新发货（供应商）
     * Summary: 数字商品服务-兑换服务-重新发货
     * @param SendExchangeAftersaleRequest $request
     * @return SendExchangeAftersaleResponse
     * @throws \Exception
     */
    public function sendExchangeAftersale(SendExchangeAftersaleRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->sendExchangeAftersaleEx($request, $runtime);
    }

    /**
     * Description: 重新发货（供应商）
     * Summary: 数字商品服务-兑换服务-重新发货
     * @param SendExchangeAftersaleRequest $request
     * @param RuntimeOptions $runtime
     * @return SendExchangeAftersaleResponse
     * @throws \Exception
     */
    public function sendExchangeAftersaleEx(SendExchangeAftersaleRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return SendExchangeAftersaleResponse::fromMap($this->doRequest("baas.antdao.exchange.aftersale.send", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户发起兑换
     * Summary: 数字商品服务-商品服务-商户发起兑换
     * @param ExecExchangeBymerchantRequest $request
     * @return ExecExchangeBymerchantResponse
     * @throws \Exception
     */
    public function execExchangeBymerchant(ExecExchangeBymerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execExchangeBymerchantEx($request, $runtime);
    }

    /**
     * Description: 商户发起兑换
     * Summary: 数字商品服务-商品服务-商户发起兑换
     * @param ExecExchangeBymerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecExchangeBymerchantResponse
     * @throws \Exception
     */
    public function execExchangeBymerchantEx(ExecExchangeBymerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecExchangeBymerchantResponse::fromMap($this->doRequest("baas.antdao.exchange.bymerchant.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
     * Summary: 数字商品服务-OSS服务-上传图片
     * @param UploadImageRequest $request
     * @return UploadImageResponse
     * @throws \Exception
     */
    public function uploadImage(UploadImageRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadImageEx($request, $runtime);
    }

    /**
     * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
     * Summary: 数字商品服务-OSS服务-上传图片
     * @param UploadImageRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadImageResponse
     * @throws \Exception
     */
    public function uploadImageEx(UploadImageRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UploadImageResponse::fromMap($this->doRequest("baas.antdao.image.upload", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 缺货回执
     * Summary: 数字商品服务-兑换服务-缺货回执
     * @param ExecExchangeOutofstoreRequest $request
     * @return ExecExchangeOutofstoreResponse
     * @throws \Exception
     */
    public function execExchangeOutofstore(ExecExchangeOutofstoreRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execExchangeOutofstoreEx($request, $runtime);
    }

    /**
     * Description: 缺货回执
     * Summary: 数字商品服务-兑换服务-缺货回执
     * @param ExecExchangeOutofstoreRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecExchangeOutofstoreResponse
     * @throws \Exception
     */
    public function execExchangeOutofstoreEx(ExecExchangeOutofstoreRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecExchangeOutofstoreResponse::fromMap($this->doRequest("baas.antdao.exchange.outofstore.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户确认收货
     * Summary: 数字商品服务-兑换服务-商户确认收货
     * @param ExecExchangeReceivebymerchantRequest $request
     * @return ExecExchangeReceivebymerchantResponse
     * @throws \Exception
     */
    public function execExchangeReceivebymerchant(ExecExchangeReceivebymerchantRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execExchangeReceivebymerchantEx($request, $runtime);
    }

    /**
     * Description: 商户确认收货
     * Summary: 数字商品服务-兑换服务-商户确认收货
     * @param ExecExchangeReceivebymerchantRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecExchangeReceivebymerchantResponse
     * @throws \Exception
     */
    public function execExchangeReceivebymerchantEx(ExecExchangeReceivebymerchantRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecExchangeReceivebymerchantResponse::fromMap($this->doRequest("baas.antdao.exchange.receivebymerchant.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户确认收货
     * Summary: 数字商品服务-兑换服务-用户确认收货
     * @param ExecExchangeReceivebyuserRequest $request
     * @return ExecExchangeReceivebyuserResponse
     * @throws \Exception
     */
    public function execExchangeReceivebyuser(ExecExchangeReceivebyuserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->execExchangeReceivebyuserEx($request, $runtime);
    }

    /**
     * Description: 用户确认收货
     * Summary: 数字商品服务-兑换服务-用户确认收货
     * @param ExecExchangeReceivebyuserRequest $request
     * @param RuntimeOptions $runtime
     * @return ExecExchangeReceivebyuserResponse
     * @throws \Exception
     */
    public function execExchangeReceivebyuserEx(ExecExchangeReceivebyuserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ExecExchangeReceivebyuserResponse::fromMap($this->doRequest("baas.antdao.exchange.receivebyuser.exec", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }
}
