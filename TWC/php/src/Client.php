<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;

use AntChain\TWC\Models\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\TWC\Models\CallbackTwcNotaryArbitrationStatusRequest;
use AntChain\TWC\Models\CallbackTwcNotaryArbitrationStatusResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractAccountRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractAccountResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractAccountsealRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractAccountsealResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractOrganizationRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractOrganizationResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractOrgsealRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractOrgsealResponse;
use AntChain\TWC\Models\AuthTwcNotaryContractSignRequest;
use AntChain\TWC\Models\AuthTwcNotaryContractSignResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractTemplateRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractTemplateResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractFlowRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractFlowResponse;
use AntChain\TWC\Models\AddTwcNotaryContractDocumentRequest;
use AntChain\TWC\Models\AddTwcNotaryContractDocumentResponse;
use AntChain\TWC\Models\AddTwcNotaryContractSignfieldRequest;
use AntChain\TWC\Models\AddTwcNotaryContractSignfieldResponse;
use AntChain\TWC\Models\StartTwcNotaryContractFlowRequest;
use AntChain\TWC\Models\StartTwcNotaryContractFlowResponse;
use AntChain\TWC\Models\SaveTwcNotaryContractFlowRequest;
use AntChain\TWC\Models\SaveTwcNotaryContractFlowResponse;
use AntChain\TWC\Models\DownloadTwcNotaryContractDocumentRequest;
use AntChain\TWC\Models\DownloadTwcNotaryContractDocumentResponse;
use AntChain\TWC\Models\AddTwcNotaryContractFileRequest;
use AntChain\TWC\Models\AddTwcNotaryContractFileResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractPlatformRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractPlatformResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractUserRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractUserResponse;
use AntChain\TWC\Models\StartTwcNotaryContractHandsignRequest;
use AntChain\TWC\Models\StartTwcNotaryContractHandsignResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractFlowRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractFlowResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractAccountsealimageRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractAccountsealimageResponse;
use AntChain\TWC\Models\GetTwcNotaryContractFileuploadurlRequest;
use AntChain\TWC\Models\GetTwcNotaryContractFileuploadurlResponse;
use AntChain\TWC\Models\AddTwcNotaryContractPlatformsignfieldsRequest;
use AntChain\TWC\Models\AddTwcNotaryContractPlatformsignfieldsResponse;
use AntChain\TWC\Models\GetTwcNotaryContractFileRequest;
use AntChain\TWC\Models\GetTwcNotaryContractFileResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractAccountsealsRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractAccountsealsResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractOrganizationsealsRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractOrganizationsealsResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractFlowsignerRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractFlowsignerResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractSignfieldsRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractSignfieldsResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractAccountRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractAccountResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractOrganizationRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractOrganizationResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractTemplateRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractTemplateResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractSignflowRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractSignflowResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractRegisterzftRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractRegisterzftResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractPlatformtemplateRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractPlatformtemplateResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractMerchantzftRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractMerchantzftResponse;
use AntChain\TWC\Models\ListTwcNotaryContractOuttradeidRequest;
use AntChain\TWC\Models\ListTwcNotaryContractOuttradeidResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractTradedetailRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractTradedetailResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractMerchantrefundRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractMerchantrefundResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractAdminaccountRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractAdminaccountResponse;
use AntChain\TWC\Models\ListTwcNotaryContractTradeidsRequest;
use AntChain\TWC\Models\ListTwcNotaryContractTradeidsResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractCommontriggerRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractCommontriggerResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractMerchantindirectzftRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractMerchantindirectzftResponse;
use AntChain\TWC\Models\QueryTwcNotaryContractMerchantindirectzftRequest;
use AntChain\TWC\Models\QueryTwcNotaryContractMerchantindirectzftResponse;
use AntChain\TWC\Models\QueryTwcNotaryPayresultfileurlRequest;
use AntChain\TWC\Models\QueryTwcNotaryPayresultfileurlResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractMerchantimageRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractMerchantimageResponse;
use AntChain\TWC\Models\CancelTwcNotaryContractPaytradeRequest;
use AntChain\TWC\Models\CancelTwcNotaryContractPaytradeResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractHandsignflowRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractHandsignflowResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractHandsignfieldRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractHandsignfieldResponse;
use AntChain\TWC\Models\GetTwcNotaryContractSignurlRequest;
use AntChain\TWC\Models\GetTwcNotaryContractSignurlResponse;
use AntChain\TWC\Models\CreateTwcNotaryWithholdAgreementRequest;
use AntChain\TWC\Models\CreateTwcNotaryWithholdAgreementResponse;
use AntChain\TWC\Models\QueryTwcNotaryWithholdAgreementRequest;
use AntChain\TWC\Models\QueryTwcNotaryWithholdAgreementResponse;
use AntChain\TWC\Models\QueryTwcNotaryWithholdAgreementurlRequest;
use AntChain\TWC\Models\QueryTwcNotaryWithholdAgreementurlResponse;
use AntChain\TWC\Models\CreateTwcNotaryWithholdOverduetimeRequest;
use AntChain\TWC\Models\CreateTwcNotaryWithholdOverduetimeResponse;
use AntChain\TWC\Models\SendTwcNotaryWithholdDeductRequest;
use AntChain\TWC\Models\SendTwcNotaryWithholdDeductResponse;
use AntChain\TWC\Models\QueryTwcNotaryWithholdPayresultRequest;
use AntChain\TWC\Models\QueryTwcNotaryWithholdPayresultResponse;
use AntChain\TWC\Models\SendTwcNotaryWithholdRefundRequest;
use AntChain\TWC\Models\SendTwcNotaryWithholdRefundResponse;
use AntChain\TWC\Models\SendTwcNotaryContractInvitationRequest;
use AntChain\TWC\Models\SendTwcNotaryContractInvitationResponse;
use AntChain\TWC\Models\ListTwcNotaryContractPayruleRequest;
use AntChain\TWC\Models\ListTwcNotaryContractPayruleResponse;
use AntChain\TWC\Models\CreateTwcNotaryWithholdQrcodeRequest;
use AntChain\TWC\Models\CreateTwcNotaryWithholdQrcodeResponse;
use AntChain\TWC\Models\CancelTwcNotaryContractPaysingletradeRequest;
use AntChain\TWC\Models\CancelTwcNotaryContractPaysingletradeResponse;
use AntChain\TWC\Models\ApplyTwcNotaryContractCallbackkeyRequest;
use AntChain\TWC\Models\ApplyTwcNotaryContractCallbackkeyResponse;
use AntChain\TWC\Models\DeployTwcNotaryMytfTappRequest;
use AntChain\TWC\Models\DeployTwcNotaryMytfTappResponse;
use AntChain\TWC\Models\CheckTwcNotaryEpidentityTwometaRequest;
use AntChain\TWC\Models\CheckTwcNotaryEpidentityTwometaResponse;
use AntChain\TWC\Models\CheckTwcNotaryEpidentityThreemetaRequest;
use AntChain\TWC\Models\CheckTwcNotaryEpidentityThreemetaResponse;
use AntChain\TWC\Models\CheckTwcNotaryEpidentityFourmetaRequest;
use AntChain\TWC\Models\CheckTwcNotaryEpidentityFourmetaResponse;
use AntChain\TWC\Models\CheckTwcNotaryNotarizationOrderRequest;
use AntChain\TWC\Models\CheckTwcNotaryNotarizationOrderResponse;
use AntChain\TWC\Models\UpdateTwcNotaryNotarizationOrderRequest;
use AntChain\TWC\Models\UpdateTwcNotaryNotarizationOrderResponse;
use AntChain\TWC\Models\SetTwcNotaryNotarizationOrderRequest;
use AntChain\TWC\Models\SetTwcNotaryNotarizationOrderResponse;
use AntChain\TWC\Models\InitTwcNotaryIdentificationFaceauthRequest;
use AntChain\TWC\Models\InitTwcNotaryIdentificationFaceauthResponse;
use AntChain\TWC\Models\CertifyTwcNotaryIdentificationFaceauthRequest;
use AntChain\TWC\Models\CertifyTwcNotaryIdentificationFaceauthResponse;
use AntChain\TWC\Models\QueryTwcNotaryIdentificationFaceauthRequest;
use AntChain\TWC\Models\QueryTwcNotaryIdentificationFaceauthResponse;
use AntChain\TWC\Models\QueryTwcNotaryEnterpriseFaceauthRequest;
use AntChain\TWC\Models\QueryTwcNotaryEnterpriseFaceauthResponse;
use AntChain\TWC\Models\InitTwcNotaryEnterpriseFaceauthRequest;
use AntChain\TWC\Models\InitTwcNotaryEnterpriseFaceauthResponse;
use AntChain\TWC\Models\CertifyTwcNotaryEnterpriseFaceauthRequest;
use AntChain\TWC\Models\CertifyTwcNotaryEnterpriseFaceauthResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseOrderRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseOrderResponse;
use AntChain\TWC\Models\CreateTwcNotaryNotarizationBillRequest;
use AntChain\TWC\Models\CreateTwcNotaryNotarizationBillResponse;
use AntChain\TWC\Models\InitTwcNotaryCertificationRequest;
use AntChain\TWC\Models\InitTwcNotaryCertificationResponse;
use AntChain\TWC\Models\QueryTwcNotaryCertificationRequest;
use AntChain\TWC\Models\QueryTwcNotaryCertificationResponse;
use AntChain\TWC\Models\GetTwcNotaryTsrCertificateRequest;
use AntChain\TWC\Models\GetTwcNotaryTsrCertificateResponse;
use AntChain\TWC\Models\SaveTwcNotaryJointconstraintRecordRequest;
use AntChain\TWC\Models\SaveTwcNotaryJointconstraintRecordResponse;
use AntChain\TWC\Models\DeleteTwcNotaryJointconstraintRecordRequest;
use AntChain\TWC\Models\DeleteTwcNotaryJointconstraintRecordResponse;
use AntChain\TWC\Models\QueryTwcNotaryJointconstraintBreachrecordRequest;
use AntChain\TWC\Models\QueryTwcNotaryJointconstraintBreachrecordResponse;
use AntChain\TWC\Models\CreateTwcNotaryTransRequest;
use AntChain\TWC\Models\CreateTwcNotaryTransResponse;
use AntChain\TWC\Models\GetTwcNotaryTransRequest;
use AntChain\TWC\Models\GetTwcNotaryTransResponse;
use AntChain\TWC\Models\CreateTwcNotaryTextRequest;
use AntChain\TWC\Models\CreateTwcNotaryTextResponse;
use AntChain\TWC\Models\GetTwcNotaryTextRequest;
use AntChain\TWC\Models\GetTwcNotaryTextResponse;
use AntChain\TWC\Models\CreateTwcNotaryFileRequest;
use AntChain\TWC\Models\CreateTwcNotaryFileResponse;
use AntChain\TWC\Models\GetTwcNotaryFileRequest;
use AntChain\TWC\Models\GetTwcNotaryFileResponse;
use AntChain\TWC\Models\CreateTwcNotarySourceRequest;
use AntChain\TWC\Models\CreateTwcNotarySourceResponse;
use AntChain\TWC\Models\GetTwcNotarySourceRequest;
use AntChain\TWC\Models\GetTwcNotarySourceResponse;
use AntChain\TWC\Models\CheckTwcNotaryStatusRequest;
use AntChain\TWC\Models\CheckTwcNotaryStatusResponse;
use AntChain\TWC\Models\DeployTwcNotaryLeaseContractRequest;
use AntChain\TWC\Models\DeployTwcNotaryLeaseContractResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseProductinfoRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseProductinfoResponse;
use AntChain\TWC\Models\AuthTwcNotaryLeaseContractRequest;
use AntChain\TWC\Models\AuthTwcNotaryLeaseContractResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseUserinfoRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseUserinfoResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseOrderinfoRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseOrderinfoResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeasePromiseRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeasePromiseResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseVerifyinfoRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseVerifyinfoResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseCreditpromiseRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseCreditpromiseResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseDisburseinfoRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseDisburseinfoResponse;
use AntChain\TWC\Models\QueryTwcNotaryLeaseOrderinfoRequest;
use AntChain\TWC\Models\QueryTwcNotaryLeaseOrderinfoResponse;
use AntChain\TWC\Models\CreateTwcNotaryFinanceTextnotaryRequest;
use AntChain\TWC\Models\CreateTwcNotaryFinanceTextnotaryResponse;
use AntChain\TWC\Models\GetTwcNotaryFinanceTextnotaryRequest;
use AntChain\TWC\Models\GetTwcNotaryFinanceTextnotaryResponse;
use AntChain\TWC\Models\CreateTwcNotaryFinanceFilenotaryRequest;
use AntChain\TWC\Models\CreateTwcNotaryFinanceFilenotaryResponse;
use AntChain\TWC\Models\GetTwcNotaryFinanceFilenotaryRequest;
use AntChain\TWC\Models\GetTwcNotaryFinanceFilenotaryResponse;
use AntChain\TWC\Models\CheckTwcNotaryIndustryNotaryRequest;
use AntChain\TWC\Models\CheckTwcNotaryIndustryNotaryResponse;
use AntChain\TWC\Models\UpdateTwcNotaryLeaseContractRequest;
use AntChain\TWC\Models\UpdateTwcNotaryLeaseContractResponse;
use AntChain\TWC\Models\CreateTwcNotarySueBreakpromiseinfoRequest;
use AntChain\TWC\Models\CreateTwcNotarySueBreakpromiseinfoResponse;
use AntChain\TWC\Models\UpdateTwcNotarySueBreakpromiseinfoRequest;
use AntChain\TWC\Models\UpdateTwcNotarySueBreakpromiseinfoResponse;
use AntChain\TWC\Models\DeleteTwcNotarySueBreakpromiseinfoRequest;
use AntChain\TWC\Models\DeleteTwcNotarySueBreakpromiseinfoResponse;
use AntChain\TWC\Models\QueryTwcNotarySueUserinfoRequest;
use AntChain\TWC\Models\QueryTwcNotarySueUserinfoResponse;
use AntChain\TWC\Models\UpdateTwcNotarySueExeplarycontractRequest;
use AntChain\TWC\Models\UpdateTwcNotarySueExeplarycontractResponse;
use AntChain\TWC\Models\UpdateTwcNotarySueExemplaryrevertRequest;
use AntChain\TWC\Models\UpdateTwcNotarySueExemplaryrevertResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseAuditRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseAuditResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeasePaymentfileRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeasePaymentfileResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseRentalRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseRentalResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseClearingRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseClearingResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseRepaymentRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseRepaymentResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseNotifyregisterRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseNotifyregisterResponse;
use AntChain\TWC\Models\QueryTwcNotaryLeaseIotinfoRequest;
use AntChain\TWC\Models\QueryTwcNotaryLeaseIotinfoResponse;
use AntChain\TWC\Models\CreateTwcNotaryCourtTextnotaryRequest;
use AntChain\TWC\Models\CreateTwcNotaryCourtTextnotaryResponse;
use AntChain\TWC\Models\GetTwcNotaryCourtTextnotaryRequest;
use AntChain\TWC\Models\GetTwcNotaryCourtTextnotaryResponse;
use AntChain\TWC\Models\CreateTwcNotaryCourtFilenotaryRequest;
use AntChain\TWC\Models\CreateTwcNotaryCourtFilenotaryResponse;
use AntChain\TWC\Models\GetTwcNotaryCourtFilenotaryRequest;
use AntChain\TWC\Models\GetTwcNotaryCourtFilenotaryResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseRouteRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseRouteResponse;
use AntChain\TWC\Models\QueryTwcNotaryLeaseEncryptedinfoRequest;
use AntChain\TWC\Models\QueryTwcNotaryLeaseEncryptedinfoResponse;
use AntChain\TWC\Models\CreateTwcNotaryContractTextRequest;
use AntChain\TWC\Models\CreateTwcNotaryContractTextResponse;
use AntChain\TWC\Models\ApplyTwcNotaryContractReportRequest;
use AntChain\TWC\Models\ApplyTwcNotaryContractReportResponse;
use AntChain\TWC\Models\GetTwcNotaryContractTextRequest;
use AntChain\TWC\Models\GetTwcNotaryContractTextResponse;
use AntChain\TWC\Models\CreateTwcNotaryInternalTransRequest;
use AntChain\TWC\Models\CreateTwcNotaryInternalTransResponse;
use AntChain\TWC\Models\CreateTwcNotaryInternalTextRequest;
use AntChain\TWC\Models\CreateTwcNotaryInternalTextResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseTextRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseTextResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseFileRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseFileResponse;
use AntChain\TWC\Models\ListTwcNotaryLeaseNotaryRequest;
use AntChain\TWC\Models\ListTwcNotaryLeaseNotaryResponse;
use AntChain\TWC\Models\QueryTwcNotaryLeaseApplicationRequest;
use AntChain\TWC\Models\QueryTwcNotaryLeaseApplicationResponse;
use AntChain\TWC\Models\QueryTwcNotaryLeaseApplicationdetailinfoRequest;
use AntChain\TWC\Models\QueryTwcNotaryLeaseApplicationdetailinfoResponse;
use AntChain\TWC\Models\SetTwcNotaryLeaseRepaymentstatusRequest;
use AntChain\TWC\Models\SetTwcNotaryLeaseRepaymentstatusResponse;
use AntChain\TWC\Models\CreateTwcNotaryLeaseSupplierinfoRequest;
use AntChain\TWC\Models\CreateTwcNotaryLeaseSupplierinfoResponse;

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
     * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
     * Summary: 仲裁状态信息变更回调接口
     * @param CallbackTwcNotaryArbitrationStatusRequest $request
     * @return CallbackTwcNotaryArbitrationStatusResponse
     */
    public function callbackTwcNotaryArbitrationStatus($request){
        $runtime = new RuntimeOptions([]);
        return $this->callbackTwcNotaryArbitrationStatusEx($request, $runtime);
    }

    /**
     * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
     * Summary: 仲裁状态信息变更回调接口
     * @param CallbackTwcNotaryArbitrationStatusRequest $request
     * @param RuntimeOptions $runtime
     * @return CallbackTwcNotaryArbitrationStatusResponse
     */
    public function callbackTwcNotaryArbitrationStatusEx($request, $runtime){
        Utils::validateModel($request);
        return CallbackTwcNotaryArbitrationStatusResponse::fromMap($this->doRequest("1.0", "twc.notary.arbitration.status.callback", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
     * Summary: 创建电子合同签署个人帐户
     * @param CreateTwcNotaryContractAccountRequest $request
     * @return CreateTwcNotaryContractAccountResponse
     */
    public function createTwcNotaryContractAccount($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractAccountEx($request, $runtime);
    }

    /**
     * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
     * Summary: 创建电子合同签署个人帐户
     * @param CreateTwcNotaryContractAccountRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractAccountResponse
     */
    public function createTwcNotaryContractAccountEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractAccountResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.account.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 通过模版参数，创建个人印章
     * Summary: 创建电子合同个人帐户印章
     * @param CreateTwcNotaryContractAccountsealRequest $request
     * @return CreateTwcNotaryContractAccountsealResponse
     */
    public function createTwcNotaryContractAccountseal($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractAccountsealEx($request, $runtime);
    }

    /**
     * Description: 通过模版参数，创建个人印章
     * Summary: 创建电子合同个人帐户印章
     * @param CreateTwcNotaryContractAccountsealRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractAccountsealResponse
     */
    public function createTwcNotaryContractAccountsealEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractAccountsealResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.accountseal.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
     * 创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
     * Summary: 创建电子合同签署机构帐户
     * @param CreateTwcNotaryContractOrganizationRequest $request
     * @return CreateTwcNotaryContractOrganizationResponse
     */
    public function createTwcNotaryContractOrganization($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractOrganizationEx($request, $runtime);
    }

    /**
     * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
     * 创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
     * Summary: 创建电子合同签署机构帐户
     * @param CreateTwcNotaryContractOrganizationRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractOrganizationResponse
     */
    public function createTwcNotaryContractOrganizationEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractOrganizationResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.organization.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 通过模版参数，创建机构印章
     * Summary: 创建电子合同机构帐户印章
     * @param CreateTwcNotaryContractOrgsealRequest $request
     * @return CreateTwcNotaryContractOrgsealResponse
     */
    public function createTwcNotaryContractOrgseal($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractOrgsealEx($request, $runtime);
    }

    /**
     * Description: 通过模版参数，创建机构印章
     * Summary: 创建电子合同机构帐户印章
     * @param CreateTwcNotaryContractOrgsealRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractOrgsealResponse
     */
    public function createTwcNotaryContractOrgsealEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractOrgsealResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.orgseal.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 静默签署授权
     * Summary: 静默签署授权
     * @param AuthTwcNotaryContractSignRequest $request
     * @return AuthTwcNotaryContractSignResponse
     */
    public function authTwcNotaryContractSign($request){
        $runtime = new RuntimeOptions([]);
        return $this->authTwcNotaryContractSignEx($request, $runtime);
    }

    /**
     * Description: 静默签署授权
     * Summary: 静默签署授权
     * @param AuthTwcNotaryContractSignRequest $request
     * @param RuntimeOptions $runtime
     * @return AuthTwcNotaryContractSignResponse
     */
    public function authTwcNotaryContractSignEx($request, $runtime){
        Utils::validateModel($request);
        return AuthTwcNotaryContractSignResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.sign.auth", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板
     * @param CreateTwcNotaryContractTemplateRequest $request
     * @return CreateTwcNotaryContractTemplateResponse
     */
    public function createTwcNotaryContractTemplate($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractTemplateEx($request, $runtime);
    }

    /**
     * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板
     * @param CreateTwcNotaryContractTemplateRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractTemplateResponse
     */
    public function createTwcNotaryContractTemplateEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractTemplateResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.template.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建签署流程
     * Summary: 创建电子合同签署流程
     * @param CreateTwcNotaryContractFlowRequest $request
     * @return CreateTwcNotaryContractFlowResponse
     */
    public function createTwcNotaryContractFlow($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractFlowEx($request, $runtime);
    }

    /**
     * Description: 创建签署流程
     * Summary: 创建电子合同签署流程
     * @param CreateTwcNotaryContractFlowRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractFlowResponse
     */
    public function createTwcNotaryContractFlowEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractFlowResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.flow.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档
     * @param AddTwcNotaryContractDocumentRequest $request
     * @return AddTwcNotaryContractDocumentResponse
     */
    public function addTwcNotaryContractDocument($request){
        $runtime = new RuntimeOptions([]);
        return $this->addTwcNotaryContractDocumentEx($request, $runtime);
    }

    /**
     * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档
     * @param AddTwcNotaryContractDocumentRequest $request
     * @param RuntimeOptions $runtime
     * @return AddTwcNotaryContractDocumentResponse
     */
    public function addTwcNotaryContractDocumentEx($request, $runtime){
        Utils::validateModel($request);
        return AddTwcNotaryContractDocumentResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.document.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区
     * @param AddTwcNotaryContractSignfieldRequest $request
     * @return AddTwcNotaryContractSignfieldResponse
     */
    public function addTwcNotaryContractSignfield($request){
        $runtime = new RuntimeOptions([]);
        return $this->addTwcNotaryContractSignfieldEx($request, $runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区
     * @param AddTwcNotaryContractSignfieldRequest $request
     * @param RuntimeOptions $runtime
     * @return AddTwcNotaryContractSignfieldResponse
     */
    public function addTwcNotaryContractSignfieldEx($request, $runtime){
        Utils::validateModel($request);
        return AddTwcNotaryContractSignfieldResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.signfield.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启
     * @param StartTwcNotaryContractFlowRequest $request
     * @return StartTwcNotaryContractFlowResponse
     */
    public function startTwcNotaryContractFlow($request){
        $runtime = new RuntimeOptions([]);
        return $this->startTwcNotaryContractFlowEx($request, $runtime);
    }

    /**
     * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启
     * @param StartTwcNotaryContractFlowRequest $request
     * @param RuntimeOptions $runtime
     * @return StartTwcNotaryContractFlowResponse
     */
    public function startTwcNotaryContractFlowEx($request, $runtime){
        Utils::validateModel($request);
        return StartTwcNotaryContractFlowResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.flow.start", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档
     * @param SaveTwcNotaryContractFlowRequest $request
     * @return SaveTwcNotaryContractFlowResponse
     */
    public function saveTwcNotaryContractFlow($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveTwcNotaryContractFlowEx($request, $runtime);
    }

    /**
     * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档
     * @param SaveTwcNotaryContractFlowRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveTwcNotaryContractFlowResponse
     */
    public function saveTwcNotaryContractFlowEx($request, $runtime){
        Utils::validateModel($request);
        return SaveTwcNotaryContractFlowResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.flow.save", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载
     * @param DownloadTwcNotaryContractDocumentRequest $request
     * @return DownloadTwcNotaryContractDocumentResponse
     */
    public function downloadTwcNotaryContractDocument($request){
        $runtime = new RuntimeOptions([]);
        return $this->downloadTwcNotaryContractDocumentEx($request, $runtime);
    }

    /**
     * Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载
     * @param DownloadTwcNotaryContractDocumentRequest $request
     * @param RuntimeOptions $runtime
     * @return DownloadTwcNotaryContractDocumentResponse
     */
    public function downloadTwcNotaryContractDocumentEx($request, $runtime){
        Utils::validateModel($request);
        return DownloadTwcNotaryContractDocumentResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.document.download", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档
     * @param AddTwcNotaryContractFileRequest $request
     * @return AddTwcNotaryContractFileResponse
     */
    public function addTwcNotaryContractFile($request){
        $runtime = new RuntimeOptions([]);
        return $this->addTwcNotaryContractFileEx($request, $runtime);
    }

    /**
     * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档
     * @param AddTwcNotaryContractFileRequest $request
     * @param RuntimeOptions $runtime
     * @return AddTwcNotaryContractFileResponse
     */
    public function addTwcNotaryContractFileEx($request, $runtime){
        Utils::validateModel($request);
        return AddTwcNotaryContractFileResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.file.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册
     * @param CreateTwcNotaryContractPlatformRequest $request
     * @return CreateTwcNotaryContractPlatformResponse
     */
    public function createTwcNotaryContractPlatform($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractPlatformEx($request, $runtime);
    }

    /**
     * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册
     * @param CreateTwcNotaryContractPlatformRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractPlatformResponse
     */
    public function createTwcNotaryContractPlatformEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractPlatformResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.platform.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 电子合同平台方提供用户信息，注册成为平台用户
     * Summary: 电子合同平台方的用户注册
     * @param CreateTwcNotaryContractUserRequest $request
     * @return CreateTwcNotaryContractUserResponse
     */
    public function createTwcNotaryContractUser($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractUserEx($request, $runtime);
    }

    /**
     * Description: 电子合同平台方提供用户信息，注册成为平台用户
     * Summary: 电子合同平台方的用户注册
     * @param CreateTwcNotaryContractUserRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractUserResponse
     */
    public function createTwcNotaryContractUserEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractUserResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.user.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
     * Summary: 电子合同平台方发起手动签署流程
     * @param StartTwcNotaryContractHandsignRequest $request
     * @return StartTwcNotaryContractHandsignResponse
     */
    public function startTwcNotaryContractHandsign($request){
        $runtime = new RuntimeOptions([]);
        return $this->startTwcNotaryContractHandsignEx($request, $runtime);
    }

    /**
     * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
     * Summary: 电子合同平台方发起手动签署流程
     * @param StartTwcNotaryContractHandsignRequest $request
     * @param RuntimeOptions $runtime
     * @return StartTwcNotaryContractHandsignResponse
     */
    public function startTwcNotaryContractHandsignEx($request, $runtime){
        Utils::validateModel($request);
        return StartTwcNotaryContractHandsignResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.handsign.start", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询
     * @param QueryTwcNotaryContractFlowRequest $request
     * @return QueryTwcNotaryContractFlowResponse
     */
    public function queryTwcNotaryContractFlow($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractFlowEx($request, $runtime);
    }

    /**
     * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询
     * @param QueryTwcNotaryContractFlowRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractFlowResponse
     */
    public function queryTwcNotaryContractFlowEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractFlowResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.flow.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章
     * @param CreateTwcNotaryContractAccountsealimageRequest $request
     * @return CreateTwcNotaryContractAccountsealimageResponse
     */
    public function createTwcNotaryContractAccountsealimage($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractAccountsealimageEx($request, $runtime);
    }

    /**
     * Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章
     * @param CreateTwcNotaryContractAccountsealimageRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractAccountsealimageResponse
     */
    public function createTwcNotaryContractAccountsealimageEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractAccountsealimageResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.accountsealimage.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件
     * @param GetTwcNotaryContractFileuploadurlRequest $request
     * @return GetTwcNotaryContractFileuploadurlResponse
     */
    public function getTwcNotaryContractFileuploadurl($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryContractFileuploadurlEx($request, $runtime);
    }

    /**
     * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件
     * @param GetTwcNotaryContractFileuploadurlRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryContractFileuploadurlResponse
     */
    public function getTwcNotaryContractFileuploadurlEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryContractFileuploadurlResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
     * 签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
     * Summary: 添加平台自动盖章签署区
     * @param AddTwcNotaryContractPlatformsignfieldsRequest $request
     * @return AddTwcNotaryContractPlatformsignfieldsResponse
     */
    public function addTwcNotaryContractPlatformsignfields($request){
        $runtime = new RuntimeOptions([]);
        return $this->addTwcNotaryContractPlatformsignfieldsEx($request, $runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
     * 签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
     * Summary: 添加平台自动盖章签署区
     * @param AddTwcNotaryContractPlatformsignfieldsRequest $request
     * @param RuntimeOptions $runtime
     * @return AddTwcNotaryContractPlatformsignfieldsResponse
     */
    public function addTwcNotaryContractPlatformsignfieldsEx($request, $runtime){
        Utils::validateModel($request);
        return AddTwcNotaryContractPlatformsignfieldsResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.platformsignfields.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情
     * @param GetTwcNotaryContractFileRequest $request
     * @return GetTwcNotaryContractFileResponse
     */
    public function getTwcNotaryContractFile($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryContractFileEx($request, $runtime);
    }

    /**
     * Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情
     * @param GetTwcNotaryContractFileRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryContractFileResponse
     */
    public function getTwcNotaryContractFileEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryContractFileResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.file.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询个人所有印章
     * Summary: 查询个人印章
     * @param QueryTwcNotaryContractAccountsealsRequest $request
     * @return QueryTwcNotaryContractAccountsealsResponse
     */
    public function queryTwcNotaryContractAccountseals($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractAccountsealsEx($request, $runtime);
    }

    /**
     * Description: 查询个人所有印章
     * Summary: 查询个人印章
     * @param QueryTwcNotaryContractAccountsealsRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractAccountsealsResponse
     */
    public function queryTwcNotaryContractAccountsealsEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractAccountsealsResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.accountseals.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询机构所有印章
     * Summary: 查询机构印章
     * @param QueryTwcNotaryContractOrganizationsealsRequest $request
     * @return QueryTwcNotaryContractOrganizationsealsResponse
     */
    public function queryTwcNotaryContractOrganizationseals($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractOrganizationsealsEx($request, $runtime);
    }

    /**
     * Description: 查询机构所有印章
     * Summary: 查询机构印章
     * @param QueryTwcNotaryContractOrganizationsealsRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractOrganizationsealsResponse
     */
    public function queryTwcNotaryContractOrganizationsealsEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractOrganizationsealsResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.organizationseals.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表
     * @param QueryTwcNotaryContractFlowsignerRequest $request
     * @return QueryTwcNotaryContractFlowsignerResponse
     */
    public function queryTwcNotaryContractFlowsigner($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractFlowsignerEx($request, $runtime);
    }

    /**
     * Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表
     * @param QueryTwcNotaryContractFlowsignerRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractFlowsignerResponse
     */
    public function queryTwcNotaryContractFlowsignerEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractFlowsignerResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.flowsigner.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表
     * @param QueryTwcNotaryContractSignfieldsRequest $request
     * @return QueryTwcNotaryContractSignfieldsResponse
     */
    public function queryTwcNotaryContractSignfields($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractSignfieldsEx($request, $runtime);
    }

    /**
     * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表
     * @param QueryTwcNotaryContractSignfieldsRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractSignfieldsResponse
     */
    public function queryTwcNotaryContractSignfieldsEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractSignfieldsResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.signfields.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 使用创建账号返回的账号id查询用户的账号。
     * Summary: 查询个人账号
     * @param QueryTwcNotaryContractAccountRequest $request
     * @return QueryTwcNotaryContractAccountResponse
     */
    public function queryTwcNotaryContractAccount($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractAccountEx($request, $runtime);
    }

    /**
     * Description: 使用创建账号返回的账号id查询用户的账号。
     * Summary: 查询个人账号
     * @param QueryTwcNotaryContractAccountRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractAccountResponse
     */
    public function queryTwcNotaryContractAccountEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractAccountResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.account.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 使用创建账号返回的账号id查询机构账号。
     * Summary: 查询机构账号
     * @param QueryTwcNotaryContractOrganizationRequest $request
     * @return QueryTwcNotaryContractOrganizationResponse
     */
    public function queryTwcNotaryContractOrganization($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractOrganizationEx($request, $runtime);
    }

    /**
     * Description: 使用创建账号返回的账号id查询机构账号。
     * Summary: 查询机构账号
     * @param QueryTwcNotaryContractOrganizationRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractOrganizationResponse
     */
    public function queryTwcNotaryContractOrganizationEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractOrganizationResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.organization.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
     * Summary: 查询模板详情详情
     * @param QueryTwcNotaryContractTemplateRequest $request
     * @return QueryTwcNotaryContractTemplateResponse
     */
    public function queryTwcNotaryContractTemplate($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractTemplateEx($request, $runtime);
    }

    /**
     * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
     * Summary: 查询模板详情详情
     * @param QueryTwcNotaryContractTemplateRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractTemplateResponse
     */
    public function queryTwcNotaryContractTemplateEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractTemplateResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.template.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程
     * @param CreateTwcNotaryContractSignflowRequest $request
     * @return CreateTwcNotaryContractSignflowResponse
     */
    public function createTwcNotaryContractSignflow($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractSignflowEx($request, $runtime);
    }

    /**
     * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程
     * @param CreateTwcNotaryContractSignflowRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractSignflowResponse
     */
    public function createTwcNotaryContractSignflowEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractSignflowResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.signflow.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户签署直付通协议
     * Summary: 商户签署直付通协议
     * @param CreateTwcNotaryContractRegisterzftRequest $request
     * @return CreateTwcNotaryContractRegisterzftResponse
     */
    public function createTwcNotaryContractRegisterzft($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractRegisterzftEx($request, $runtime);
    }

    /**
     * Description: 商户签署直付通协议
     * Summary: 商户签署直付通协议
     * @param CreateTwcNotaryContractRegisterzftRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractRegisterzftResponse
     */
    public function createTwcNotaryContractRegisterzftEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractRegisterzftResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.registerzft.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
     * Summary: 创建智能合同模板
     * @param CreateTwcNotaryContractPlatformtemplateRequest $request
     * @return CreateTwcNotaryContractPlatformtemplateResponse
     */
    public function createTwcNotaryContractPlatformtemplate($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractPlatformtemplateEx($request, $runtime);
    }

    /**
     * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
     * Summary: 创建智能合同模板
     * @param CreateTwcNotaryContractPlatformtemplateRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractPlatformtemplateResponse
     */
    public function createTwcNotaryContractPlatformtemplateEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractPlatformtemplateResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.platformtemplate.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询商户直付通入驻信息
     * Summary: 查询商户直付通入驻信息
     * @param QueryTwcNotaryContractMerchantzftRequest $request
     * @return QueryTwcNotaryContractMerchantzftResponse
     */
    public function queryTwcNotaryContractMerchantzft($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractMerchantzftEx($request, $runtime);
    }

    /**
     * Description: 查询商户直付通入驻信息
     * Summary: 查询商户直付通入驻信息
     * @param QueryTwcNotaryContractMerchantzftRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractMerchantzftResponse
     */
    public function queryTwcNotaryContractMerchantzftEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractMerchantzftResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.merchantzft.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 列举本租户合同相关交易
     * Summary: 列举本租户合同相关交易
     * @param ListTwcNotaryContractOuttradeidRequest $request
     * @return ListTwcNotaryContractOuttradeidResponse
     */
    public function listTwcNotaryContractOuttradeid($request){
        $runtime = new RuntimeOptions([]);
        return $this->listTwcNotaryContractOuttradeidEx($request, $runtime);
    }

    /**
     * Description: 列举本租户合同相关交易
     * Summary: 列举本租户合同相关交易
     * @param ListTwcNotaryContractOuttradeidRequest $request
     * @param RuntimeOptions $runtime
     * @return ListTwcNotaryContractOuttradeidResponse
     */
    public function listTwcNotaryContractOuttradeidEx($request, $runtime){
        Utils::validateModel($request);
        return ListTwcNotaryContractOuttradeidResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.outtradeid.list", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 根据订单id查询订单代扣详情
     * Summary: 根据订单id查询订单代扣详情
     * @param QueryTwcNotaryContractTradedetailRequest $request
     * @return QueryTwcNotaryContractTradedetailResponse
     */
    public function queryTwcNotaryContractTradedetail($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractTradedetailEx($request, $runtime);
    }

    /**
     * Description: 根据订单id查询订单代扣详情
     * Summary: 根据订单id查询订单代扣详情
     * @param QueryTwcNotaryContractTradedetailRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractTradedetailResponse
     */
    public function queryTwcNotaryContractTradedetailEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractTradedetailResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.tradedetail.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户根据订单id退款
     * Summary: 商户根据订单id退款
     * @param CreateTwcNotaryContractMerchantrefundRequest $request
     * @return CreateTwcNotaryContractMerchantrefundResponse
     */
    public function createTwcNotaryContractMerchantrefund($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractMerchantrefundEx($request, $runtime);
    }

    /**
     * Description: 商户根据订单id退款
     * Summary: 商户根据订单id退款
     * @param CreateTwcNotaryContractMerchantrefundRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractMerchantrefundResponse
     */
    public function createTwcNotaryContractMerchantrefundEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractMerchantrefundResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.merchantrefund.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建蚂蚁区块链账户
     * Summary: 创建蚂蚁区块链账户
     * @param CreateTwcNotaryContractAdminaccountRequest $request
     * @return CreateTwcNotaryContractAdminaccountResponse
     */
    public function createTwcNotaryContractAdminaccount($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractAdminaccountEx($request, $runtime);
    }

    /**
     * Description: 创建蚂蚁区块链账户
     * Summary: 创建蚂蚁区块链账户
     * @param CreateTwcNotaryContractAdminaccountRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractAdminaccountResponse
     */
    public function createTwcNotaryContractAdminaccountEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractAdminaccountResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.adminaccount.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户根据合同id列举所有的tradeId
     * Summary: 商户根据合同id列举所有的tradeId
     * @param ListTwcNotaryContractTradeidsRequest $request
     * @return ListTwcNotaryContractTradeidsResponse
     */
    public function listTwcNotaryContractTradeids($request){
        $runtime = new RuntimeOptions([]);
        return $this->listTwcNotaryContractTradeidsEx($request, $runtime);
    }

    /**
     * Description: 商户根据合同id列举所有的tradeId
     * Summary: 商户根据合同id列举所有的tradeId
     * @param ListTwcNotaryContractTradeidsRequest $request
     * @param RuntimeOptions $runtime
     * @return ListTwcNotaryContractTradeidsResponse
     */
    public function listTwcNotaryContractTradeidsEx($request, $runtime){
        Utils::validateModel($request);
        return ListTwcNotaryContractTradeidsResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.tradeids.list", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户上传代扣规则
     * Summary: 商户上传代扣规则
     * @param CreateTwcNotaryContractCommontriggerRequest $request
     * @return CreateTwcNotaryContractCommontriggerResponse
     */
    public function createTwcNotaryContractCommontrigger($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractCommontriggerEx($request, $runtime);
    }

    /**
     * Description: 商户上传代扣规则
     * Summary: 商户上传代扣规则
     * @param CreateTwcNotaryContractCommontriggerRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractCommontriggerResponse
     */
    public function createTwcNotaryContractCommontriggerEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractCommontriggerResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.commontrigger.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 商户入驻直付通，仅供管理员调用
     * Summary: 商户入驻直付通，仅供管理员调用
     * @param CreateTwcNotaryContractMerchantindirectzftRequest $request
     * @return CreateTwcNotaryContractMerchantindirectzftResponse
     */
    public function createTwcNotaryContractMerchantindirectzft($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractMerchantindirectzftEx($request, $runtime);
    }

    /**
     * Description: 商户入驻直付通，仅供管理员调用
     * Summary: 商户入驻直付通，仅供管理员调用
     * @param CreateTwcNotaryContractMerchantindirectzftRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractMerchantindirectzftResponse
     */
    public function createTwcNotaryContractMerchantindirectzftEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractMerchantindirectzftResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.merchantindirectzft.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 根据订单id查询直付通商户入驻信息
     * Summary: 根据订单id查询直付通商户入驻信息
     * @param QueryTwcNotaryContractMerchantindirectzftRequest $request
     * @return QueryTwcNotaryContractMerchantindirectzftResponse
     */
    public function queryTwcNotaryContractMerchantindirectzft($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryContractMerchantindirectzftEx($request, $runtime);
    }

    /**
     * Description: 根据订单id查询直付通商户入驻信息
     * Summary: 根据订单id查询直付通商户入驻信息
     * @param QueryTwcNotaryContractMerchantindirectzftRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryContractMerchantindirectzftResponse
     */
    public function queryTwcNotaryContractMerchantindirectzftEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryContractMerchantindirectzftResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.merchantindirectzft.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取支付对账文件的url
     * Summary: 获取支付对账文件的url
     * @param QueryTwcNotaryPayresultfileurlRequest $request
     * @return QueryTwcNotaryPayresultfileurlResponse
     */
    public function queryTwcNotaryPayresultfileurl($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryPayresultfileurlEx($request, $runtime);
    }

    /**
     * Description: 获取支付对账文件的url
     * Summary: 获取支付对账文件的url
     * @param QueryTwcNotaryPayresultfileurlRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryPayresultfileurlResponse
     */
    public function queryTwcNotaryPayresultfileurlEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryPayresultfileurlResponse::fromMap($this->doRequest("1.0", "twc.notary.payresultfileurl.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 智能合同图片上传
     * Summary: 智能合同图片上传
     * @param CreateTwcNotaryContractMerchantimageRequest $request
     * @return CreateTwcNotaryContractMerchantimageResponse
     */
    public function createTwcNotaryContractMerchantimage($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractMerchantimageEx($request, $runtime);
    }

    /**
     * Description: 智能合同图片上传
     * Summary: 智能合同图片上传
     * @param CreateTwcNotaryContractMerchantimageRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractMerchantimageResponse
     */
    public function createTwcNotaryContractMerchantimageEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractMerchantimageResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.merchantimage.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 取消智能合同剩余代扣条目
     * Summary: 取消智能合同剩余代扣条目
     * @param CancelTwcNotaryContractPaytradeRequest $request
     * @return CancelTwcNotaryContractPaytradeResponse
     */
    public function cancelTwcNotaryContractPaytrade($request){
        $runtime = new RuntimeOptions([]);
        return $this->cancelTwcNotaryContractPaytradeEx($request, $runtime);
    }

    /**
     * Description: 取消智能合同剩余代扣条目
     * Summary: 取消智能合同剩余代扣条目
     * @param CancelTwcNotaryContractPaytradeRequest $request
     * @param RuntimeOptions $runtime
     * @return CancelTwcNotaryContractPaytradeResponse
     */
    public function cancelTwcNotaryContractPaytradeEx($request, $runtime){
        Utils::validateModel($request);
        return CancelTwcNotaryContractPaytradeResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.paytrade.cancel", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建手动签署流程
     * Summary: 创建手动签署流程
     * @param CreateTwcNotaryContractHandsignflowRequest $request
     * @return CreateTwcNotaryContractHandsignflowResponse
     */
    public function createTwcNotaryContractHandsignflow($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractHandsignflowEx($request, $runtime);
    }

    /**
     * Description: 创建手动签署流程
     * Summary: 创建手动签署流程
     * @param CreateTwcNotaryContractHandsignflowRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractHandsignflowResponse
     */
    public function createTwcNotaryContractHandsignflowEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractHandsignflowResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.handsignflow.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区
     * @param CreateTwcNotaryContractHandsignfieldRequest $request
     * @return CreateTwcNotaryContractHandsignfieldResponse
     */
    public function createTwcNotaryContractHandsignfield($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractHandsignfieldEx($request, $runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区
     * @param CreateTwcNotaryContractHandsignfieldRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractHandsignfieldResponse
     */
    public function createTwcNotaryContractHandsignfieldEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractHandsignfieldResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.handsignfield.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址
     * @param GetTwcNotaryContractSignurlRequest $request
     * @return GetTwcNotaryContractSignurlResponse
     */
    public function getTwcNotaryContractSignurl($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryContractSignurlEx($request, $runtime);
    }

    /**
     * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址
     * @param GetTwcNotaryContractSignurlRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryContractSignurlResponse
     */
    public function getTwcNotaryContractSignurlEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryContractSignurlResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.signurl.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可信付代扣规则内容创建
     * Summary: 可信付代扣规则内容创建
     * @param CreateTwcNotaryWithholdAgreementRequest $request
     * @return CreateTwcNotaryWithholdAgreementResponse
     */
    public function createTwcNotaryWithholdAgreement($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryWithholdAgreementEx($request, $runtime);
    }

    /**
     * Description: 可信付代扣规则内容创建
     * Summary: 可信付代扣规则内容创建
     * @param CreateTwcNotaryWithholdAgreementRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryWithholdAgreementResponse
     */
    public function createTwcNotaryWithholdAgreementEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryWithholdAgreementResponse::fromMap($this->doRequest("1.0", "twc.notary.withhold.agreement.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询消金代扣协议
     * Summary: 查询可信付代扣协议内容
     * @param QueryTwcNotaryWithholdAgreementRequest $request
     * @return QueryTwcNotaryWithholdAgreementResponse
     */
    public function queryTwcNotaryWithholdAgreement($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryWithholdAgreementEx($request, $runtime);
    }

    /**
     * Description: 查询消金代扣协议
     * Summary: 查询可信付代扣协议内容
     * @param QueryTwcNotaryWithholdAgreementRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryWithholdAgreementResponse
     */
    public function queryTwcNotaryWithholdAgreementEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryWithholdAgreementResponse::fromMap($this->doRequest("1.0", "twc.notary.withhold.agreement.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询可信付协议的入口
     * Summary: 查询可信付协议的入口
     * @param QueryTwcNotaryWithholdAgreementurlRequest $request
     * @return QueryTwcNotaryWithholdAgreementurlResponse
     */
    public function queryTwcNotaryWithholdAgreementurl($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryWithholdAgreementurlEx($request, $runtime);
    }

    /**
     * Description: 查询可信付协议的入口
     * Summary: 查询可信付协议的入口
     * @param QueryTwcNotaryWithholdAgreementurlRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryWithholdAgreementurlResponse
     */
    public function queryTwcNotaryWithholdAgreementurlEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryWithholdAgreementurlResponse::fromMap($this->doRequest("1.0", "twc.notary.withhold.agreementurl.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 后台录入商家的产品的逾期日
     * Summary: 后台录入商家的产品的逾期日
     * @param CreateTwcNotaryWithholdOverduetimeRequest $request
     * @return CreateTwcNotaryWithholdOverduetimeResponse
     */
    public function createTwcNotaryWithholdOverduetime($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryWithholdOverduetimeEx($request, $runtime);
    }

    /**
     * Description: 后台录入商家的产品的逾期日
     * Summary: 后台录入商家的产品的逾期日
     * @param CreateTwcNotaryWithholdOverduetimeRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryWithholdOverduetimeResponse
     */
    public function createTwcNotaryWithholdOverduetimeEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryWithholdOverduetimeResponse::fromMap($this->doRequest("1.0", "twc.notary.withhold.overduetime.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可信付代扣的扣费请求
     * Summary: 发送代扣请求
     * @param SendTwcNotaryWithholdDeductRequest $request
     * @return SendTwcNotaryWithholdDeductResponse
     */
    public function sendTwcNotaryWithholdDeduct($request){
        $runtime = new RuntimeOptions([]);
        return $this->sendTwcNotaryWithholdDeductEx($request, $runtime);
    }

    /**
     * Description: 可信付代扣的扣费请求
     * Summary: 发送代扣请求
     * @param SendTwcNotaryWithholdDeductRequest $request
     * @param RuntimeOptions $runtime
     * @return SendTwcNotaryWithholdDeductResponse
     */
    public function sendTwcNotaryWithholdDeductEx($request, $runtime){
        Utils::validateModel($request);
        return SendTwcNotaryWithholdDeductResponse::fromMap($this->doRequest("1.0", "twc.notary.withhold.deduct.send", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可信付代扣结果查询
     * Summary: 可信付代扣结果查询
     * @param QueryTwcNotaryWithholdPayresultRequest $request
     * @return QueryTwcNotaryWithholdPayresultResponse
     */
    public function queryTwcNotaryWithholdPayresult($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryWithholdPayresultEx($request, $runtime);
    }

    /**
     * Description: 可信付代扣结果查询
     * Summary: 可信付代扣结果查询
     * @param QueryTwcNotaryWithholdPayresultRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryWithholdPayresultResponse
     */
    public function queryTwcNotaryWithholdPayresultEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryWithholdPayresultResponse::fromMap($this->doRequest("1.0", "twc.notary.withhold.payresult.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可信付退款请求
     * Summary: 可信付退款请求
     * @param SendTwcNotaryWithholdRefundRequest $request
     * @return SendTwcNotaryWithholdRefundResponse
     */
    public function sendTwcNotaryWithholdRefund($request){
        $runtime = new RuntimeOptions([]);
        return $this->sendTwcNotaryWithholdRefundEx($request, $runtime);
    }

    /**
     * Description: 可信付退款请求
     * Summary: 可信付退款请求
     * @param SendTwcNotaryWithholdRefundRequest $request
     * @param RuntimeOptions $runtime
     * @return SendTwcNotaryWithholdRefundResponse
     */
    public function sendTwcNotaryWithholdRefundEx($request, $runtime){
        Utils::validateModel($request);
        return SendTwcNotaryWithholdRefundResponse::fromMap($this->doRequest("1.0", "twc.notary.withhold.refund.send", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
     * Summary: 创建注册邀请任务
     * @param SendTwcNotaryContractInvitationRequest $request
     * @return SendTwcNotaryContractInvitationResponse
     */
    public function sendTwcNotaryContractInvitation($request){
        $runtime = new RuntimeOptions([]);
        return $this->sendTwcNotaryContractInvitationEx($request, $runtime);
    }

    /**
     * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
     * Summary: 创建注册邀请任务
     * @param SendTwcNotaryContractInvitationRequest $request
     * @param RuntimeOptions $runtime
     * @return SendTwcNotaryContractInvitationResponse
     */
    public function sendTwcNotaryContractInvitationEx($request, $runtime){
        Utils::validateModel($request);
        return SendTwcNotaryContractInvitationResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.invitation.send", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询代扣规则
     * Summary: 查询代扣规则
     * @param ListTwcNotaryContractPayruleRequest $request
     * @return ListTwcNotaryContractPayruleResponse
     */
    public function listTwcNotaryContractPayrule($request){
        $runtime = new RuntimeOptions([]);
        return $this->listTwcNotaryContractPayruleEx($request, $runtime);
    }

    /**
     * Description: 查询代扣规则
     * Summary: 查询代扣规则
     * @param ListTwcNotaryContractPayruleRequest $request
     * @param RuntimeOptions $runtime
     * @return ListTwcNotaryContractPayruleResponse
     */
    public function listTwcNotaryContractPayruleEx($request, $runtime){
        Utils::validateModel($request);
        return ListTwcNotaryContractPayruleResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.payrule.list", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取可信付免签协议的二维码
     * Summary: 获取可信付免签协议的二维码
     * @param CreateTwcNotaryWithholdQrcodeRequest $request
     * @return CreateTwcNotaryWithholdQrcodeResponse
     */
    public function createTwcNotaryWithholdQrcode($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryWithholdQrcodeEx($request, $runtime);
    }

    /**
     * Description: 获取可信付免签协议的二维码
     * Summary: 获取可信付免签协议的二维码
     * @param CreateTwcNotaryWithholdQrcodeRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryWithholdQrcodeResponse
     */
    public function createTwcNotaryWithholdQrcodeEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryWithholdQrcodeResponse::fromMap($this->doRequest("1.0", "twc.notary.withhold.qrcode.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 取消某一期的代扣规则
     * Summary: 取消某一期的代扣规则
     * @param CancelTwcNotaryContractPaysingletradeRequest $request
     * @return CancelTwcNotaryContractPaysingletradeResponse
     */
    public function cancelTwcNotaryContractPaysingletrade($request){
        $runtime = new RuntimeOptions([]);
        return $this->cancelTwcNotaryContractPaysingletradeEx($request, $runtime);
    }

    /**
     * Description: 取消某一期的代扣规则
     * Summary: 取消某一期的代扣规则
     * @param CancelTwcNotaryContractPaysingletradeRequest $request
     * @param RuntimeOptions $runtime
     * @return CancelTwcNotaryContractPaysingletradeResponse
     */
    public function cancelTwcNotaryContractPaysingletradeEx($request, $runtime){
        Utils::validateModel($request);
        return CancelTwcNotaryContractPaysingletradeResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.paysingletrade.cancel", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key
     * @param ApplyTwcNotaryContractCallbackkeyRequest $request
     * @return ApplyTwcNotaryContractCallbackkeyResponse
     */
    public function applyTwcNotaryContractCallbackkey($request){
        $runtime = new RuntimeOptions([]);
        return $this->applyTwcNotaryContractCallbackkeyEx($request, $runtime);
    }

    /**
     * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key
     * @param ApplyTwcNotaryContractCallbackkeyRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyTwcNotaryContractCallbackkeyResponse
     */
    public function applyTwcNotaryContractCallbackkeyEx($request, $runtime){
        Utils::validateModel($request);
        return ApplyTwcNotaryContractCallbackkeyResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.callbackkey.apply", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: mytf的tapp部署
     * Summary: mytf的tapp部署
     * @param DeployTwcNotaryMytfTappRequest $request
     * @return DeployTwcNotaryMytfTappResponse
     */
    public function deployTwcNotaryMytfTapp($request){
        $runtime = new RuntimeOptions([]);
        return $this->deployTwcNotaryMytfTappEx($request, $runtime);
    }

    /**
     * Description: mytf的tapp部署
     * Summary: mytf的tapp部署
     * @param DeployTwcNotaryMytfTappRequest $request
     * @param RuntimeOptions $runtime
     * @return DeployTwcNotaryMytfTappResponse
     */
    public function deployTwcNotaryMytfTappEx($request, $runtime){
        Utils::validateModel($request);
        return DeployTwcNotaryMytfTappResponse::fromMap($this->doRequest("1.0", "twc.notary.mytf.tapp.deploy", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 输入企业名+证件号，发起企业二要素认证请求。
     * Summary: 企业二要素认证
     * @param CheckTwcNotaryEpidentityTwometaRequest $request
     * @return CheckTwcNotaryEpidentityTwometaResponse
     */
    public function checkTwcNotaryEpidentityTwometa($request){
        $runtime = new RuntimeOptions([]);
        return $this->checkTwcNotaryEpidentityTwometaEx($request, $runtime);
    }

    /**
     * Description: 输入企业名+证件号，发起企业二要素认证请求。
     * Summary: 企业二要素认证
     * @param CheckTwcNotaryEpidentityTwometaRequest $request
     * @param RuntimeOptions $runtime
     * @return CheckTwcNotaryEpidentityTwometaResponse
     */
    public function checkTwcNotaryEpidentityTwometaEx($request, $runtime){
        Utils::validateModel($request);
        return CheckTwcNotaryEpidentityTwometaResponse::fromMap($this->doRequest("1.0", "twc.notary.epidentity.twometa.check", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
     * Summary: 企业三要素认证
     * @param CheckTwcNotaryEpidentityThreemetaRequest $request
     * @return CheckTwcNotaryEpidentityThreemetaResponse
     */
    public function checkTwcNotaryEpidentityThreemeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->checkTwcNotaryEpidentityThreemetaEx($request, $runtime);
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
     * Summary: 企业三要素认证
     * @param CheckTwcNotaryEpidentityThreemetaRequest $request
     * @param RuntimeOptions $runtime
     * @return CheckTwcNotaryEpidentityThreemetaResponse
     */
    public function checkTwcNotaryEpidentityThreemetaEx($request, $runtime){
        Utils::validateModel($request);
        return CheckTwcNotaryEpidentityThreemetaResponse::fromMap($this->doRequest("1.0", "twc.notary.epidentity.threemeta.check", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
     * Summary: 企业四要素认证
     * @param CheckTwcNotaryEpidentityFourmetaRequest $request
     * @return CheckTwcNotaryEpidentityFourmetaResponse
     */
    public function checkTwcNotaryEpidentityFourmeta($request){
        $runtime = new RuntimeOptions([]);
        return $this->checkTwcNotaryEpidentityFourmetaEx($request, $runtime);
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
     * Summary: 企业四要素认证
     * @param CheckTwcNotaryEpidentityFourmetaRequest $request
     * @param RuntimeOptions $runtime
     * @return CheckTwcNotaryEpidentityFourmetaResponse
     */
    public function checkTwcNotaryEpidentityFourmetaEx($request, $runtime){
        Utils::validateModel($request);
        return CheckTwcNotaryEpidentityFourmetaResponse::fromMap($this->doRequest("1.0", "twc.notary.epidentity.fourmeta.check", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询公证订单的有效性
     * Summary: 查询公证订单的有效性
     * @param CheckTwcNotaryNotarizationOrderRequest $request
     * @return CheckTwcNotaryNotarizationOrderResponse
     */
    public function checkTwcNotaryNotarizationOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->checkTwcNotaryNotarizationOrderEx($request, $runtime);
    }

    /**
     * Description: 查询公证订单的有效性
     * Summary: 查询公证订单的有效性
     * @param CheckTwcNotaryNotarizationOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return CheckTwcNotaryNotarizationOrderResponse
     */
    public function checkTwcNotaryNotarizationOrderEx($request, $runtime){
        Utils::validateModel($request);
        return CheckTwcNotaryNotarizationOrderResponse::fromMap($this->doRequest("1.0", "twc.notary.notarization.order.check", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新公证订单状态
     * Summary: 更新公证订单状态
     * @param UpdateTwcNotaryNotarizationOrderRequest $request
     * @return UpdateTwcNotaryNotarizationOrderResponse
     */
    public function updateTwcNotaryNotarizationOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateTwcNotaryNotarizationOrderEx($request, $runtime);
    }

    /**
     * Description: 更新公证订单状态
     * Summary: 更新公证订单状态
     * @param UpdateTwcNotaryNotarizationOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateTwcNotaryNotarizationOrderResponse
     */
    public function updateTwcNotaryNotarizationOrderEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateTwcNotaryNotarizationOrderResponse::fromMap($this->doRequest("1.0", "twc.notary.notarization.order.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 设置订单属性
     * Summary: 设置订单属性
     * @param SetTwcNotaryNotarizationOrderRequest $request
     * @return SetTwcNotaryNotarizationOrderResponse
     */
    public function setTwcNotaryNotarizationOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->setTwcNotaryNotarizationOrderEx($request, $runtime);
    }

    /**
     * Description: 设置订单属性
     * Summary: 设置订单属性
     * @param SetTwcNotaryNotarizationOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return SetTwcNotaryNotarizationOrderResponse
     */
    public function setTwcNotaryNotarizationOrderEx($request, $runtime){
        Utils::validateModel($request);
        return SetTwcNotaryNotarizationOrderResponse::fromMap($this->doRequest("1.0", "twc.notary.notarization.order.set", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 实人认证初始化
     * Summary: 实人认证初始化
     * @param InitTwcNotaryIdentificationFaceauthRequest $request
     * @return InitTwcNotaryIdentificationFaceauthResponse
     */
    public function initTwcNotaryIdentificationFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->initTwcNotaryIdentificationFaceauthEx($request, $runtime);
    }

    /**
     * Description: 实人认证初始化
     * Summary: 实人认证初始化
     * @param InitTwcNotaryIdentificationFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return InitTwcNotaryIdentificationFaceauthResponse
     */
    public function initTwcNotaryIdentificationFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return InitTwcNotaryIdentificationFaceauthResponse::fromMap($this->doRequest("1.0", "twc.notary.identification.faceauth.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发起实人认证
     * Summary: 发起实人认证
     * @param CertifyTwcNotaryIdentificationFaceauthRequest $request
     * @return CertifyTwcNotaryIdentificationFaceauthResponse
     */
    public function certifyTwcNotaryIdentificationFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->certifyTwcNotaryIdentificationFaceauthEx($request, $runtime);
    }

    /**
     * Description: 发起实人认证
     * Summary: 发起实人认证
     * @param CertifyTwcNotaryIdentificationFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return CertifyTwcNotaryIdentificationFaceauthResponse
     */
    public function certifyTwcNotaryIdentificationFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return CertifyTwcNotaryIdentificationFaceauthResponse::fromMap($this->doRequest("1.0", "twc.notary.identification.faceauth.certify", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果
     * @param QueryTwcNotaryIdentificationFaceauthRequest $request
     * @return QueryTwcNotaryIdentificationFaceauthResponse
     */
    public function queryTwcNotaryIdentificationFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryIdentificationFaceauthEx($request, $runtime);
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果
     * @param QueryTwcNotaryIdentificationFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryIdentificationFaceauthResponse
     */
    public function queryTwcNotaryIdentificationFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryIdentificationFaceauthResponse::fromMap($this->doRequest("1.0", "twc.notary.identification.faceauth.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业法人认证查询结果接口
     * Summary: 企业法人认证查询
     * @param QueryTwcNotaryEnterpriseFaceauthRequest $request
     * @return QueryTwcNotaryEnterpriseFaceauthResponse
     */
    public function queryTwcNotaryEnterpriseFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryEnterpriseFaceauthEx($request, $runtime);
    }

    /**
     * Description: 企业法人认证查询结果接口
     * Summary: 企业法人认证查询
     * @param QueryTwcNotaryEnterpriseFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryEnterpriseFaceauthResponse
     */
    public function queryTwcNotaryEnterpriseFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryEnterpriseFaceauthResponse::fromMap($this->doRequest("1.0", "twc.notary.enterprise.faceauth.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业法人认证初始化接口
     * Summary: 企业法人认证初始化
     * @param InitTwcNotaryEnterpriseFaceauthRequest $request
     * @return InitTwcNotaryEnterpriseFaceauthResponse
     */
    public function initTwcNotaryEnterpriseFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->initTwcNotaryEnterpriseFaceauthEx($request, $runtime);
    }

    /**
     * Description: 企业法人认证初始化接口
     * Summary: 企业法人认证初始化
     * @param InitTwcNotaryEnterpriseFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return InitTwcNotaryEnterpriseFaceauthResponse
     */
    public function initTwcNotaryEnterpriseFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return InitTwcNotaryEnterpriseFaceauthResponse::fromMap($this->doRequest("1.0", "twc.notary.enterprise.faceauth.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业法人认证开始接口
     * Summary: 企业法人认证开始
     * @param CertifyTwcNotaryEnterpriseFaceauthRequest $request
     * @return CertifyTwcNotaryEnterpriseFaceauthResponse
     */
    public function certifyTwcNotaryEnterpriseFaceauth($request){
        $runtime = new RuntimeOptions([]);
        return $this->certifyTwcNotaryEnterpriseFaceauthEx($request, $runtime);
    }

    /**
     * Description: 企业法人认证开始接口
     * Summary: 企业法人认证开始
     * @param CertifyTwcNotaryEnterpriseFaceauthRequest $request
     * @param RuntimeOptions $runtime
     * @return CertifyTwcNotaryEnterpriseFaceauthResponse
     */
    public function certifyTwcNotaryEnterpriseFaceauthEx($request, $runtime){
        Utils::validateModel($request);
        return CertifyTwcNotaryEnterpriseFaceauthResponse::fromMap($this->doRequest("1.0", "twc.notary.enterprise.faceauth.certify", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建租赁订单
     * Summary: 租赁订单创建
     * @param CreateTwcNotaryLeaseOrderRequest $request
     * @return CreateTwcNotaryLeaseOrderResponse
     */
    public function createTwcNotaryLeaseOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseOrderEx($request, $runtime);
    }

    /**
     * Description: 创建租赁订单
     * Summary: 租赁订单创建
     * @param CreateTwcNotaryLeaseOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseOrderResponse
     */
    public function createTwcNotaryLeaseOrderEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseOrderResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.order.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
     * Summary: 公证场景创建收费订单
     * @param CreateTwcNotaryNotarizationBillRequest $request
     * @return CreateTwcNotaryNotarizationBillResponse
     */
    public function createTwcNotaryNotarizationBill($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryNotarizationBillEx($request, $runtime);
    }

    /**
     * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
     * Summary: 公证场景创建收费订单
     * @param CreateTwcNotaryNotarizationBillRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryNotarizationBillResponse
     */
    public function createTwcNotaryNotarizationBillEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryNotarizationBillResponse::fromMap($this->doRequest("1.0", "twc.notary.notarization.bill.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
     * Summary: 初始化存证证明订单
     * @param InitTwcNotaryCertificationRequest $request
     * @return InitTwcNotaryCertificationResponse
     */
    public function initTwcNotaryCertification($request){
        $runtime = new RuntimeOptions([]);
        return $this->initTwcNotaryCertificationEx($request, $runtime);
    }

    /**
     * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
     * Summary: 初始化存证证明订单
     * @param InitTwcNotaryCertificationRequest $request
     * @param RuntimeOptions $runtime
     * @return InitTwcNotaryCertificationResponse
     */
    public function initTwcNotaryCertificationEx($request, $runtime){
        Utils::validateModel($request);
        return InitTwcNotaryCertificationResponse::fromMap($this->doRequest("1.0", "twc.notary.certification.init", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
     * Summary: 查询存证证明申请状态
     * @param QueryTwcNotaryCertificationRequest $request
     * @return QueryTwcNotaryCertificationResponse
     */
    public function queryTwcNotaryCertification($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryCertificationEx($request, $runtime);
    }

    /**
     * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
     * Summary: 查询存证证明申请状态
     * @param QueryTwcNotaryCertificationRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryCertificationResponse
     */
    public function queryTwcNotaryCertificationEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryCertificationResponse::fromMap($this->doRequest("1.0", "twc.notary.certification.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
     * Summary: 可信时间凭证服务 - 获取时间凭证证书
     * @param GetTwcNotaryTsrCertificateRequest $request
     * @return GetTwcNotaryTsrCertificateResponse
     */
    public function getTwcNotaryTsrCertificate($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryTsrCertificateEx($request, $runtime);
    }

    /**
     * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
     * Summary: 可信时间凭证服务 - 获取时间凭证证书
     * @param GetTwcNotaryTsrCertificateRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryTsrCertificateResponse
     */
    public function getTwcNotaryTsrCertificateEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryTsrCertificateResponse::fromMap($this->doRequest("1.0", "twc.notary.tsr.certificate.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
     * Summary: 联合执行履行记录新增/修改接口
     * @param SaveTwcNotaryJointconstraintRecordRequest $request
     * @return SaveTwcNotaryJointconstraintRecordResponse
     */
    public function saveTwcNotaryJointconstraintRecord($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveTwcNotaryJointconstraintRecordEx($request, $runtime);
    }

    /**
     * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
     * Summary: 联合执行履行记录新增/修改接口
     * @param SaveTwcNotaryJointconstraintRecordRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveTwcNotaryJointconstraintRecordResponse
     */
    public function saveTwcNotaryJointconstraintRecordEx($request, $runtime){
        Utils::validateModel($request);
        return SaveTwcNotaryJointconstraintRecordResponse::fromMap($this->doRequest("1.0", "twc.notary.jointconstraint.record.save", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 删除履行记录
     * Summary: 履行记录删除接口
     * @param DeleteTwcNotaryJointconstraintRecordRequest $request
     * @return DeleteTwcNotaryJointconstraintRecordResponse
     */
    public function deleteTwcNotaryJointconstraintRecord($request){
        $runtime = new RuntimeOptions([]);
        return $this->deleteTwcNotaryJointconstraintRecordEx($request, $runtime);
    }

    /**
     * Description: 删除履行记录
     * Summary: 履行记录删除接口
     * @param DeleteTwcNotaryJointconstraintRecordRequest $request
     * @param RuntimeOptions $runtime
     * @return DeleteTwcNotaryJointconstraintRecordResponse
     */
    public function deleteTwcNotaryJointconstraintRecordEx($request, $runtime){
        Utils::validateModel($request);
        return DeleteTwcNotaryJointconstraintRecordResponse::fromMap($this->doRequest("1.0", "twc.notary.jointconstraint.record.delete", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询违约记录
     * Summary: 违约记录查询接口
     * @param QueryTwcNotaryJointconstraintBreachrecordRequest $request
     * @return QueryTwcNotaryJointconstraintBreachrecordResponse
     */
    public function queryTwcNotaryJointconstraintBreachrecord($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryJointconstraintBreachrecordEx($request, $runtime);
    }

    /**
     * Description: 查询违约记录
     * Summary: 违约记录查询接口
     * @param QueryTwcNotaryJointconstraintBreachrecordRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryJointconstraintBreachrecordResponse
     */
    public function queryTwcNotaryJointconstraintBreachrecordEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryJointconstraintBreachrecordResponse::fromMap($this->doRequest("1.0", "twc.notary.jointconstraint.breachrecord.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取存证事务ID
     * Summary: 获取存证事务ID
     * @param CreateTwcNotaryTransRequest $request
     * @return CreateTwcNotaryTransResponse
     */
    public function createTwcNotaryTrans($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryTransEx($request, $runtime);
    }

    /**
     * Description: 获取存证事务ID
     * Summary: 获取存证事务ID
     * @param CreateTwcNotaryTransRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryTransResponse
     */
    public function createTwcNotaryTransEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryTransResponse::fromMap($this->doRequest("1.0", "twc.notary.trans.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息
     * @param GetTwcNotaryTransRequest $request
     * @return GetTwcNotaryTransResponse
     */
    public function getTwcNotaryTrans($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryTransEx($request, $runtime);
    }

    /**
     * Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息
     * @param GetTwcNotaryTransRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryTransResponse
     */
    public function getTwcNotaryTransEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryTransResponse::fromMap($this->doRequest("1.0", "twc.notary.trans.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链
     * @param CreateTwcNotaryTextRequest $request
     * @return CreateTwcNotaryTextResponse
     */
    public function createTwcNotaryText($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryTextEx($request, $runtime);
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链
     * @param CreateTwcNotaryTextRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryTextResponse
     */
    public function createTwcNotaryTextEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryTextResponse::fromMap($this->doRequest("1.0", "twc.notary.text.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容
     * @param GetTwcNotaryTextRequest $request
     * @return GetTwcNotaryTextResponse
     */
    public function getTwcNotaryText($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryTextEx($request, $runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容
     * @param GetTwcNotaryTextRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryTextResponse
     */
    public function getTwcNotaryTextEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryTextResponse::fromMap($this->doRequest("1.0", "twc.notary.text.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链
     * @param CreateTwcNotaryFileRequest $request
     * @return CreateTwcNotaryFileResponse
     */
    public function createTwcNotaryFile($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryFileEx($request, $runtime);
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链
     * @param CreateTwcNotaryFileRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryFileResponse
     */
    public function createTwcNotaryFileEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryFileResponse::fromMap($this->doRequest("1.0", "twc.notary.file.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址
     * @param GetTwcNotaryFileRequest $request
     * @return GetTwcNotaryFileResponse
     */
    public function getTwcNotaryFile($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryFileEx($request, $runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址
     * @param GetTwcNotaryFileRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryFileResponse
     */
    public function getTwcNotaryFileEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryFileResponse::fromMap($this->doRequest("1.0", "twc.notary.file.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证
     * @param CreateTwcNotarySourceRequest $request
     * @return CreateTwcNotarySourceResponse
     */
    public function createTwcNotarySource($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotarySourceEx($request, $runtime);
    }

    /**
     * Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证
     * @param CreateTwcNotarySourceRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotarySourceResponse
     */
    public function createTwcNotarySourceEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotarySourceResponse::fromMap($this->doRequest("1.0", "twc.notary.source.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址
     * @param GetTwcNotarySourceRequest $request
     * @return GetTwcNotarySourceResponse
     */
    public function getTwcNotarySource($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotarySourceEx($request, $runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址
     * @param GetTwcNotarySourceRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotarySourceResponse
     */
    public function getTwcNotarySourceEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotarySourceResponse::fromMap($this->doRequest("1.0", "twc.notary.source.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建存证后，使用存证凭据核验存证状态。
     * Summary: 存证内容核验
     * @param CheckTwcNotaryStatusRequest $request
     * @return CheckTwcNotaryStatusResponse
     */
    public function checkTwcNotaryStatus($request){
        $runtime = new RuntimeOptions([]);
        return $this->checkTwcNotaryStatusEx($request, $runtime);
    }

    /**
     * Description: 创建存证后，使用存证凭据核验存证状态。
     * Summary: 存证内容核验
     * @param CheckTwcNotaryStatusRequest $request
     * @param RuntimeOptions $runtime
     * @return CheckTwcNotaryStatusResponse
     */
    public function checkTwcNotaryStatusEx($request, $runtime){
        Utils::validateModel($request);
        return CheckTwcNotaryStatusResponse::fromMap($this->doRequest("1.0", "twc.notary.status.check", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 融资服务平台部署合约
     * Summary: 融资服务平台部署合约
     * @param DeployTwcNotaryLeaseContractRequest $request
     * @return DeployTwcNotaryLeaseContractResponse
     */
    public function deployTwcNotaryLeaseContract($request){
        $runtime = new RuntimeOptions([]);
        return $this->deployTwcNotaryLeaseContractEx($request, $runtime);
    }

    /**
     * Description: 融资服务平台部署合约
     * Summary: 融资服务平台部署合约
     * @param DeployTwcNotaryLeaseContractRequest $request
     * @param RuntimeOptions $runtime
     * @return DeployTwcNotaryLeaseContractResponse
     */
    public function deployTwcNotaryLeaseContractEx($request, $runtime){
        Utils::validateModel($request);
        return DeployTwcNotaryLeaseContractResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.contract.deploy", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 融资服务平台上传商品类别信息
     * Summary: 融资服务平台上传商品类别信息
     * @param CreateTwcNotaryLeaseProductinfoRequest $request
     * @return CreateTwcNotaryLeaseProductinfoResponse
     */
    public function createTwcNotaryLeaseProductinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseProductinfoEx($request, $runtime);
    }

    /**
     * Description: 融资服务平台上传商品类别信息
     * Summary: 融资服务平台上传商品类别信息
     * @param CreateTwcNotaryLeaseProductinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseProductinfoResponse
     */
    public function createTwcNotaryLeaseProductinfoEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseProductinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.productinfo.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 租赁服务平台授权融资服务平台
     * Summary: 租赁服务平台授权融资服务平台
     * @param AuthTwcNotaryLeaseContractRequest $request
     * @return AuthTwcNotaryLeaseContractResponse
     */
    public function authTwcNotaryLeaseContract($request){
        $runtime = new RuntimeOptions([]);
        return $this->authTwcNotaryLeaseContractEx($request, $runtime);
    }

    /**
     * Description: 租赁服务平台授权融资服务平台
     * Summary: 租赁服务平台授权融资服务平台
     * @param AuthTwcNotaryLeaseContractRequest $request
     * @param RuntimeOptions $runtime
     * @return AuthTwcNotaryLeaseContractResponse
     */
    public function authTwcNotaryLeaseContractEx($request, $runtime){
        Utils::validateModel($request);
        return AuthTwcNotaryLeaseContractResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.contract.auth", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 租赁服务平台上传用户信息
     * Summary: 租赁服务平台上传用户信息
     * @param CreateTwcNotaryLeaseUserinfoRequest $request
     * @return CreateTwcNotaryLeaseUserinfoResponse
     */
    public function createTwcNotaryLeaseUserinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseUserinfoEx($request, $runtime);
    }

    /**
     * Description: 租赁服务平台上传用户信息
     * Summary: 租赁服务平台上传用户信息
     * @param CreateTwcNotaryLeaseUserinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseUserinfoResponse
     */
    public function createTwcNotaryLeaseUserinfoEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseUserinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.userinfo.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 租赁服务平台上传订单产品/服务信息
     * Summary: 租赁服务平台上传订单产品/服务信息
     * @param CreateTwcNotaryLeaseOrderinfoRequest $request
     * @return CreateTwcNotaryLeaseOrderinfoResponse
     */
    public function createTwcNotaryLeaseOrderinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseOrderinfoEx($request, $runtime);
    }

    /**
     * Description: 租赁服务平台上传订单产品/服务信息
     * Summary: 租赁服务平台上传订单产品/服务信息
     * @param CreateTwcNotaryLeaseOrderinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseOrderinfoResponse
     */
    public function createTwcNotaryLeaseOrderinfoEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseOrderinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.orderinfo.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 租赁服务平台上传承诺信息
     * Summary: 租赁服务平台上传承诺信息
     * @param CreateTwcNotaryLeasePromiseRequest $request
     * @return CreateTwcNotaryLeasePromiseResponse
     */
    public function createTwcNotaryLeasePromise($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeasePromiseEx($request, $runtime);
    }

    /**
     * Description: 租赁服务平台上传承诺信息
     * Summary: 租赁服务平台上传承诺信息
     * @param CreateTwcNotaryLeasePromiseRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeasePromiseResponse
     */
    public function createTwcNotaryLeasePromiseEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeasePromiseResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.promise.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 融资平台上传租赁物购买贷款订单信息
     * Summary: 融资平台上传租赁物购买贷款订单信息
     * @param CreateTwcNotaryLeaseVerifyinfoRequest $request
     * @return CreateTwcNotaryLeaseVerifyinfoResponse
     */
    public function createTwcNotaryLeaseVerifyinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseVerifyinfoEx($request, $runtime);
    }

    /**
     * Description: 融资平台上传租赁物购买贷款订单信息
     * Summary: 融资平台上传租赁物购买贷款订单信息
     * @param CreateTwcNotaryLeaseVerifyinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseVerifyinfoResponse
     */
    public function createTwcNotaryLeaseVerifyinfoEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseVerifyinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.verifyinfo.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 融资方上传承诺信息
     * Summary: 融资方上传承诺信息
     * @param CreateTwcNotaryLeaseCreditpromiseRequest $request
     * @return CreateTwcNotaryLeaseCreditpromiseResponse
     */
    public function createTwcNotaryLeaseCreditpromise($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseCreditpromiseEx($request, $runtime);
    }

    /**
     * Description: 融资方上传承诺信息
     * Summary: 融资方上传承诺信息
     * @param CreateTwcNotaryLeaseCreditpromiseRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseCreditpromiseResponse
     */
    public function createTwcNotaryLeaseCreditpromiseEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseCreditpromiseResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.creditpromise.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 租赁平台上传支用/还款信息
     * Summary: 租赁平台上传支用/还款信息
     * @param CreateTwcNotaryLeaseDisburseinfoRequest $request
     * @return CreateTwcNotaryLeaseDisburseinfoResponse
     */
    public function createTwcNotaryLeaseDisburseinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseDisburseinfoEx($request, $runtime);
    }

    /**
     * Description: 租赁平台上传支用/还款信息
     * Summary: 租赁平台上传支用/还款信息
     * @param CreateTwcNotaryLeaseDisburseinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseDisburseinfoResponse
     */
    public function createTwcNotaryLeaseDisburseinfoEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseDisburseinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.disburseinfo.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description:  查询订单详细信息
     * Summary:  查询订单详细信息
     * @param QueryTwcNotaryLeaseOrderinfoRequest $request
     * @return QueryTwcNotaryLeaseOrderinfoResponse
     */
    public function queryTwcNotaryLeaseOrderinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryLeaseOrderinfoEx($request, $runtime);
    }

    /**
     * Description:  查询订单详细信息
     * Summary:  查询订单详细信息
     * @param QueryTwcNotaryLeaseOrderinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryLeaseOrderinfoResponse
     */
    public function queryTwcNotaryLeaseOrderinfoEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryLeaseOrderinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.orderinfo.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建金融行业标准文本存证
     * Summary: 创建金融行业文本存证
     * @param CreateTwcNotaryFinanceTextnotaryRequest $request
     * @return CreateTwcNotaryFinanceTextnotaryResponse
     */
    public function createTwcNotaryFinanceTextnotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryFinanceTextnotaryEx($request, $runtime);
    }

    /**
     * Description: 创建金融行业标准文本存证
     * Summary: 创建金融行业文本存证
     * @param CreateTwcNotaryFinanceTextnotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryFinanceTextnotaryResponse
     */
    public function createTwcNotaryFinanceTextnotaryEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryFinanceTextnotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.finance.textnotary.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取金融行业文本存证接口描述
     * Summary: 获取金融行业文本存证
     * @param GetTwcNotaryFinanceTextnotaryRequest $request
     * @return GetTwcNotaryFinanceTextnotaryResponse
     */
    public function getTwcNotaryFinanceTextnotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryFinanceTextnotaryEx($request, $runtime);
    }

    /**
     * Description: 获取金融行业文本存证接口描述
     * Summary: 获取金融行业文本存证
     * @param GetTwcNotaryFinanceTextnotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryFinanceTextnotaryResponse
     */
    public function getTwcNotaryFinanceTextnotaryEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryFinanceTextnotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.finance.textnotary.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建金融行业文件存证接口描述
     * Summary: 创建金融行业文件存证
     * @param CreateTwcNotaryFinanceFilenotaryRequest $request
     * @return CreateTwcNotaryFinanceFilenotaryResponse
     */
    public function createTwcNotaryFinanceFilenotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryFinanceFilenotaryEx($request, $runtime);
    }

    /**
     * Description: 创建金融行业文件存证接口描述
     * Summary: 创建金融行业文件存证
     * @param CreateTwcNotaryFinanceFilenotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryFinanceFilenotaryResponse
     */
    public function createTwcNotaryFinanceFilenotaryEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryFinanceFilenotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.finance.filenotary.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取金融行业文件存证接口描述
     * Summary: 获取金融行业文件存证
     * @param GetTwcNotaryFinanceFilenotaryRequest $request
     * @return GetTwcNotaryFinanceFilenotaryResponse
     */
    public function getTwcNotaryFinanceFilenotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryFinanceFilenotaryEx($request, $runtime);
    }

    /**
     * Description: 获取金融行业文件存证接口描述
     * Summary: 获取金融行业文件存证
     * @param GetTwcNotaryFinanceFilenotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryFinanceFilenotaryResponse
     */
    public function getTwcNotaryFinanceFilenotaryEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryFinanceFilenotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.finance.filenotary.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 统一存证核验接口
     * Summary: 统一存证核验接口（已下架）
     * @param CheckTwcNotaryIndustryNotaryRequest $request
     * @return CheckTwcNotaryIndustryNotaryResponse
     */
    public function checkTwcNotaryIndustryNotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->checkTwcNotaryIndustryNotaryEx($request, $runtime);
    }

    /**
     * Description: 统一存证核验接口
     * Summary: 统一存证核验接口（已下架）
     * @param CheckTwcNotaryIndustryNotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return CheckTwcNotaryIndustryNotaryResponse
     */
    public function checkTwcNotaryIndustryNotaryEx($request, $runtime){
        Utils::validateModel($request);
        return CheckTwcNotaryIndustryNotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.industry.notary.check", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 升级融资租赁合约
     * Summary: 升级融资租赁合约
     * @param UpdateTwcNotaryLeaseContractRequest $request
     * @return UpdateTwcNotaryLeaseContractResponse
     */
    public function updateTwcNotaryLeaseContract($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateTwcNotaryLeaseContractEx($request, $runtime);
    }

    /**
     * Description: 升级融资租赁合约
     * Summary: 升级融资租赁合约
     * @param UpdateTwcNotaryLeaseContractRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateTwcNotaryLeaseContractResponse
     */
    public function updateTwcNotaryLeaseContractEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateTwcNotaryLeaseContractResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.contract.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 违约案件信息提交服务
     * Summary: 违约案件信息提交服务
     * @param CreateTwcNotarySueBreakpromiseinfoRequest $request
     * @return CreateTwcNotarySueBreakpromiseinfoResponse
     */
    public function createTwcNotarySueBreakpromiseinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotarySueBreakpromiseinfoEx($request, $runtime);
    }

    /**
     * Description: 违约案件信息提交服务
     * Summary: 违约案件信息提交服务
     * @param CreateTwcNotarySueBreakpromiseinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotarySueBreakpromiseinfoResponse
     */
    public function createTwcNotarySueBreakpromiseinfoEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotarySueBreakpromiseinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.sue.breakpromiseinfo.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 违约案件信息修改服务
     * Summary: 违约案件信息修改服务
     * @param UpdateTwcNotarySueBreakpromiseinfoRequest $request
     * @return UpdateTwcNotarySueBreakpromiseinfoResponse
     */
    public function updateTwcNotarySueBreakpromiseinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateTwcNotarySueBreakpromiseinfoEx($request, $runtime);
    }

    /**
     * Description: 违约案件信息修改服务
     * Summary: 违约案件信息修改服务
     * @param UpdateTwcNotarySueBreakpromiseinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateTwcNotarySueBreakpromiseinfoResponse
     */
    public function updateTwcNotarySueBreakpromiseinfoEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateTwcNotarySueBreakpromiseinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.sue.breakpromiseinfo.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 违约案件信息删除服务
     * Summary: 违约案件信息删除服务
     * @param DeleteTwcNotarySueBreakpromiseinfoRequest $request
     * @return DeleteTwcNotarySueBreakpromiseinfoResponse
     */
    public function deleteTwcNotarySueBreakpromiseinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->deleteTwcNotarySueBreakpromiseinfoEx($request, $runtime);
    }

    /**
     * Description: 违约案件信息删除服务
     * Summary: 违约案件信息删除服务
     * @param DeleteTwcNotarySueBreakpromiseinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return DeleteTwcNotarySueBreakpromiseinfoResponse
     */
    public function deleteTwcNotarySueBreakpromiseinfoEx($request, $runtime){
        Utils::validateModel($request);
        return DeleteTwcNotarySueBreakpromiseinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.sue.breakpromiseinfo.delete", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询惩戒信息
     * Summary: 查询惩戒信息
     * @param QueryTwcNotarySueUserinfoRequest $request
     * @return QueryTwcNotarySueUserinfoResponse
     */
    public function queryTwcNotarySueUserinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotarySueUserinfoEx($request, $runtime);
    }

    /**
     * Description: 查询惩戒信息
     * Summary: 查询惩戒信息
     * @param QueryTwcNotarySueUserinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotarySueUserinfoResponse
     */
    public function queryTwcNotarySueUserinfoEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotarySueUserinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.sue.userinfo.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 升级用户管理合约
     * Summary: 升级用户管理合约
     * @param UpdateTwcNotarySueExeplarycontractRequest $request
     * @return UpdateTwcNotarySueExeplarycontractResponse
     */
    public function updateTwcNotarySueExeplarycontract($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateTwcNotarySueExeplarycontractEx($request, $runtime);
    }

    /**
     * Description: 升级用户管理合约
     * Summary: 升级用户管理合约
     * @param UpdateTwcNotarySueExeplarycontractRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateTwcNotarySueExeplarycontractResponse
     */
    public function updateTwcNotarySueExeplarycontractEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateTwcNotarySueExeplarycontractResponse::fromMap($this->doRequest("1.0", "twc.notary.sue.exeplarycontract.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 回退用户管理合约
     * Summary: 回退用户管理合约
     * @param UpdateTwcNotarySueExemplaryrevertRequest $request
     * @return UpdateTwcNotarySueExemplaryrevertResponse
     */
    public function updateTwcNotarySueExemplaryrevert($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateTwcNotarySueExemplaryrevertEx($request, $runtime);
    }

    /**
     * Description: 回退用户管理合约
     * Summary: 回退用户管理合约
     * @param UpdateTwcNotarySueExemplaryrevertRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateTwcNotarySueExemplaryrevertResponse
     */
    public function updateTwcNotarySueExemplaryrevertEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateTwcNotarySueExemplaryrevertResponse::fromMap($this->doRequest("1.0", "twc.notary.sue.exemplaryrevert.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 融资平台审核订单信息
     * Summary: 融资平台审核订单信息
     * @param CreateTwcNotaryLeaseAuditRequest $request
     * @return CreateTwcNotaryLeaseAuditResponse
     */
    public function createTwcNotaryLeaseAudit($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseAuditEx($request, $runtime);
    }

    /**
     * Description: 融资平台审核订单信息
     * Summary: 融资平台审核订单信息
     * @param CreateTwcNotaryLeaseAuditRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseAuditResponse
     */
    public function createTwcNotaryLeaseAuditEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseAuditResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.audit.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 租赁平台上传付款通知信息
     * Summary: 租赁平台上传付款通知信息
     * @param CreateTwcNotaryLeasePaymentfileRequest $request
     * @return CreateTwcNotaryLeasePaymentfileResponse
     */
    public function createTwcNotaryLeasePaymentfile($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeasePaymentfileEx($request, $runtime);
    }

    /**
     * Description: 租赁平台上传付款通知信息
     * Summary: 租赁平台上传付款通知信息
     * @param CreateTwcNotaryLeasePaymentfileRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeasePaymentfileResponse
     */
    public function createTwcNotaryLeasePaymentfileEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeasePaymentfileResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.paymentfile.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 租赁系统上传租金归还记录 分期调用
     * Summary: 租赁系统上传租金归还记录 分期调用
     * @param CreateTwcNotaryLeaseRentalRequest $request
     * @return CreateTwcNotaryLeaseRentalResponse
     */
    public function createTwcNotaryLeaseRental($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseRentalEx($request, $runtime);
    }

    /**
     * Description: 租赁系统上传租金归还记录 分期调用
     * Summary: 租赁系统上传租金归还记录 分期调用
     * @param CreateTwcNotaryLeaseRentalRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseRentalResponse
     */
    public function createTwcNotaryLeaseRentalEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseRentalResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.rental.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 清分服务机构上传资金清算记录，分期
     * Summary: 清分服务机构上传资金清算记录，分期
     * @param CreateTwcNotaryLeaseClearingRequest $request
     * @return CreateTwcNotaryLeaseClearingResponse
     */
    public function createTwcNotaryLeaseClearing($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseClearingEx($request, $runtime);
    }

    /**
     * Description: 清分服务机构上传资金清算记录，分期
     * Summary: 清分服务机构上传资金清算记录，分期
     * @param CreateTwcNotaryLeaseClearingRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseClearingResponse
     */
    public function createTwcNotaryLeaseClearingEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseClearingResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.clearing.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 融资金融机构上传还款信息 每期
     * Summary: 融资金融机构上传还款信息 每期
     * @param CreateTwcNotaryLeaseRepaymentRequest $request
     * @return CreateTwcNotaryLeaseRepaymentResponse
     */
    public function createTwcNotaryLeaseRepayment($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseRepaymentEx($request, $runtime);
    }

    /**
     * Description: 融资金融机构上传还款信息 每期
     * Summary: 融资金融机构上传还款信息 每期
     * @param CreateTwcNotaryLeaseRepaymentRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseRepaymentResponse
     */
    public function createTwcNotaryLeaseRepaymentEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseRepaymentResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.repayment.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 融资租赁通知系统注册
     * Summary: 融资租赁通知系统注册
     * @param CreateTwcNotaryLeaseNotifyregisterRequest $request
     * @return CreateTwcNotaryLeaseNotifyregisterResponse
     */
    public function createTwcNotaryLeaseNotifyregister($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseNotifyregisterEx($request, $runtime);
    }

    /**
     * Description: 融资租赁通知系统注册
     * Summary: 融资租赁通知系统注册
     * @param CreateTwcNotaryLeaseNotifyregisterRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseNotifyregisterResponse
     */
    public function createTwcNotaryLeaseNotifyregisterEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseNotifyregisterResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.notifyregister.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 根据imeiID查询iot设备的详情
     * Summary: 根据imeiID查询iot设备的详情
     * @param QueryTwcNotaryLeaseIotinfoRequest $request
     * @return QueryTwcNotaryLeaseIotinfoResponse
     */
    public function queryTwcNotaryLeaseIotinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryLeaseIotinfoEx($request, $runtime);
    }

    /**
     * Description: 根据imeiID查询iot设备的详情
     * Summary: 根据imeiID查询iot设备的详情
     * @param QueryTwcNotaryLeaseIotinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryLeaseIotinfoResponse
     */
    public function queryTwcNotaryLeaseIotinfoEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryLeaseIotinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.iotinfo.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建法院通用文本存证
     * Summary: 法院通用文本存证创建接口
     * @param CreateTwcNotaryCourtTextnotaryRequest $request
     * @return CreateTwcNotaryCourtTextnotaryResponse
     */
    public function createTwcNotaryCourtTextnotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryCourtTextnotaryEx($request, $runtime);
    }

    /**
     * Description: 创建法院通用文本存证
     * Summary: 法院通用文本存证创建接口
     * @param CreateTwcNotaryCourtTextnotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryCourtTextnotaryResponse
     */
    public function createTwcNotaryCourtTextnotaryEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryCourtTextnotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.court.textnotary.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取法院通用文本存证
     * Summary: 法院通用文本存证获取接口
     * @param GetTwcNotaryCourtTextnotaryRequest $request
     * @return GetTwcNotaryCourtTextnotaryResponse
     */
    public function getTwcNotaryCourtTextnotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryCourtTextnotaryEx($request, $runtime);
    }

    /**
     * Description: 获取法院通用文本存证
     * Summary: 法院通用文本存证获取接口
     * @param GetTwcNotaryCourtTextnotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryCourtTextnotaryResponse
     */
    public function getTwcNotaryCourtTextnotaryEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryCourtTextnotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.court.textnotary.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建法院通用文件存证接口
     * Summary: 法院通用文件存证创建接口
     * @param CreateTwcNotaryCourtFilenotaryRequest $request
     * @return CreateTwcNotaryCourtFilenotaryResponse
     */
    public function createTwcNotaryCourtFilenotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryCourtFilenotaryEx($request, $runtime);
    }

    /**
     * Description: 创建法院通用文件存证接口
     * Summary: 法院通用文件存证创建接口
     * @param CreateTwcNotaryCourtFilenotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryCourtFilenotaryResponse
     */
    public function createTwcNotaryCourtFilenotaryEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryCourtFilenotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.court.filenotary.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取法院通用文件存证
     * Summary: 法院通用文件存证获取接口
     * @param GetTwcNotaryCourtFilenotaryRequest $request
     * @return GetTwcNotaryCourtFilenotaryResponse
     */
    public function getTwcNotaryCourtFilenotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryCourtFilenotaryEx($request, $runtime);
    }

    /**
     * Description: 获取法院通用文件存证
     * Summary: 法院通用文件存证获取接口
     * @param GetTwcNotaryCourtFilenotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryCourtFilenotaryResponse
     */
    public function getTwcNotaryCourtFilenotaryEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryCourtFilenotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.court.filenotary.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 融资租赁定制化统一入口
     * Summary: 融资租赁定制化统一入口
     * @param CreateTwcNotaryLeaseRouteRequest $request
     * @return CreateTwcNotaryLeaseRouteResponse
     */
    public function createTwcNotaryLeaseRoute($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseRouteEx($request, $runtime);
    }

    /**
     * Description: 融资租赁定制化统一入口
     * Summary: 融资租赁定制化统一入口
     * @param CreateTwcNotaryLeaseRouteRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseRouteResponse
     */
    public function createTwcNotaryLeaseRouteEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseRouteResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.route.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
     * Summary: 查询用户等加密信息
     * @param QueryTwcNotaryLeaseEncryptedinfoRequest $request
     * @return QueryTwcNotaryLeaseEncryptedinfoResponse
     */
    public function queryTwcNotaryLeaseEncryptedinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryLeaseEncryptedinfoEx($request, $runtime);
    }

    /**
     * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
     * Summary: 查询用户等加密信息
     * @param QueryTwcNotaryLeaseEncryptedinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryLeaseEncryptedinfoResponse
     */
    public function queryTwcNotaryLeaseEncryptedinfoEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryLeaseEncryptedinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.encryptedinfo.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 电子合同文本存证
     * Summary: 电子合同文本存证
     * @param CreateTwcNotaryContractTextRequest $request
     * @return CreateTwcNotaryContractTextResponse
     */
    public function createTwcNotaryContractText($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryContractTextEx($request, $runtime);
    }

    /**
     * Description: 电子合同文本存证
     * Summary: 电子合同文本存证
     * @param CreateTwcNotaryContractTextRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryContractTextResponse
     */
    public function createTwcNotaryContractTextEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryContractTextResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.text.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
     * Summary: 申请电子合同存证报告
     * @param ApplyTwcNotaryContractReportRequest $request
     * @return ApplyTwcNotaryContractReportResponse
     */
    public function applyTwcNotaryContractReport($request){
        $runtime = new RuntimeOptions([]);
        return $this->applyTwcNotaryContractReportEx($request, $runtime);
    }

    /**
     * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
     * Summary: 申请电子合同存证报告
     * @param ApplyTwcNotaryContractReportRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyTwcNotaryContractReportResponse
     */
    public function applyTwcNotaryContractReportEx($request, $runtime){
        Utils::validateModel($request);
        return ApplyTwcNotaryContractReportResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.report.apply", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
     * Summary: 下载合同存证
     * @param GetTwcNotaryContractTextRequest $request
     * @return GetTwcNotaryContractTextResponse
     */
    public function getTwcNotaryContractText($request){
        $runtime = new RuntimeOptions([]);
        return $this->getTwcNotaryContractTextEx($request, $runtime);
    }

    /**
     * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
     * Summary: 下载合同存证
     * @param GetTwcNotaryContractTextRequest $request
     * @param RuntimeOptions $runtime
     * @return GetTwcNotaryContractTextResponse
     */
    public function getTwcNotaryContractTextEx($request, $runtime){
        Utils::validateModel($request);
        return GetTwcNotaryContractTextResponse::fromMap($this->doRequest("1.0", "twc.notary.contract.text.get", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 获取存证事务ID内部接口
     * Summary: 获取存证事务ID内部接口
     * @param CreateTwcNotaryInternalTransRequest $request
     * @return CreateTwcNotaryInternalTransResponse
     */
    public function createTwcNotaryInternalTrans($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryInternalTransEx($request, $runtime);
    }

    /**
     * Description: 获取存证事务ID内部接口
     * Summary: 获取存证事务ID内部接口
     * @param CreateTwcNotaryInternalTransRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryInternalTransResponse
     */
    public function createTwcNotaryInternalTransEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryInternalTransResponse::fromMap($this->doRequest("1.0", "twc.notary.internal.trans.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 文本存证内部接口，将文本内容存证上链
     * Summary: 文本存证内部接口，将文本内容存证上链
     * @param CreateTwcNotaryInternalTextRequest $request
     * @return CreateTwcNotaryInternalTextResponse
     */
    public function createTwcNotaryInternalText($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryInternalTextEx($request, $runtime);
    }

    /**
     * Description: 文本存证内部接口，将文本内容存证上链
     * Summary: 文本存证内部接口，将文本内容存证上链
     * @param CreateTwcNotaryInternalTextRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryInternalTextResponse
     */
    public function createTwcNotaryInternalTextEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryInternalTextResponse::fromMap($this->doRequest("1.0", "twc.notary.internal.text.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
     * Summary: 租赁业务文本存证，将文本内容存证上链
     * @param CreateTwcNotaryLeaseTextRequest $request
     * @return CreateTwcNotaryLeaseTextResponse
     */
    public function createTwcNotaryLeaseText($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseTextEx($request, $runtime);
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
     * Summary: 租赁业务文本存证，将文本内容存证上链
     * @param CreateTwcNotaryLeaseTextRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseTextResponse
     */
    public function createTwcNotaryLeaseTextEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseTextResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.text.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
     * Summary: 租赁业务文件内容存证上链
     * @param CreateTwcNotaryLeaseFileRequest $request
     * @return CreateTwcNotaryLeaseFileResponse
     */
    public function createTwcNotaryLeaseFile($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseFileEx($request, $runtime);
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
     * Summary: 租赁业务文件内容存证上链
     * @param CreateTwcNotaryLeaseFileRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseFileResponse
     */
    public function createTwcNotaryLeaseFileEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseFileResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.file.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
     * Summary: 租赁业务获取订单存证列表
     * @param ListTwcNotaryLeaseNotaryRequest $request
     * @return ListTwcNotaryLeaseNotaryResponse
     */
    public function listTwcNotaryLeaseNotary($request){
        $runtime = new RuntimeOptions([]);
        return $this->listTwcNotaryLeaseNotaryEx($request, $runtime);
    }

    /**
     * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
     * Summary: 租赁业务获取订单存证列表
     * @param ListTwcNotaryLeaseNotaryRequest $request
     * @param RuntimeOptions $runtime
     * @return ListTwcNotaryLeaseNotaryResponse
     */
    public function listTwcNotaryLeaseNotaryEx($request, $runtime){
        Utils::validateModel($request);
        return ListTwcNotaryLeaseNotaryResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.notary.list", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询融资租赁application
     * Summary: 查询融资租赁application
     * @param QueryTwcNotaryLeaseApplicationRequest $request
     * @return QueryTwcNotaryLeaseApplicationResponse
     */
    public function queryTwcNotaryLeaseApplication($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryLeaseApplicationEx($request, $runtime);
    }

    /**
     * Description: 查询融资租赁application
     * Summary: 查询融资租赁application
     * @param QueryTwcNotaryLeaseApplicationRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryLeaseApplicationResponse
     */
    public function queryTwcNotaryLeaseApplicationEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryLeaseApplicationResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.application.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询融资租赁application的定义详情
     * Summary: 查询application的定义详情
     * @param QueryTwcNotaryLeaseApplicationdetailinfoRequest $request
     * @return QueryTwcNotaryLeaseApplicationdetailinfoResponse
     */
    public function queryTwcNotaryLeaseApplicationdetailinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryTwcNotaryLeaseApplicationdetailinfoEx($request, $runtime);
    }

    /**
     * Description: 查询融资租赁application的定义详情
     * Summary: 查询application的定义详情
     * @param QueryTwcNotaryLeaseApplicationdetailinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryTwcNotaryLeaseApplicationdetailinfoResponse
     */
    public function queryTwcNotaryLeaseApplicationdetailinfoEx($request, $runtime){
        Utils::validateModel($request);
        return QueryTwcNotaryLeaseApplicationdetailinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.applicationdetailinfo.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 融资租赁资方重置订单状态
     * Summary: 融资租赁资方重置订单状态
     * @param SetTwcNotaryLeaseRepaymentstatusRequest $request
     * @return SetTwcNotaryLeaseRepaymentstatusResponse
     */
    public function setTwcNotaryLeaseRepaymentstatus($request){
        $runtime = new RuntimeOptions([]);
        return $this->setTwcNotaryLeaseRepaymentstatusEx($request, $runtime);
    }

    /**
     * Description: 融资租赁资方重置订单状态
     * Summary: 融资租赁资方重置订单状态
     * @param SetTwcNotaryLeaseRepaymentstatusRequest $request
     * @param RuntimeOptions $runtime
     * @return SetTwcNotaryLeaseRepaymentstatusResponse
     */
    public function setTwcNotaryLeaseRepaymentstatusEx($request, $runtime){
        Utils::validateModel($request);
        return SetTwcNotaryLeaseRepaymentstatusResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.repaymentstatus.set", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 供应商上传采购等相关信息
     * Summary: 供应商上传采购等相关信息
     * @param CreateTwcNotaryLeaseSupplierinfoRequest $request
     * @return CreateTwcNotaryLeaseSupplierinfoResponse
     */
    public function createTwcNotaryLeaseSupplierinfo($request){
        $runtime = new RuntimeOptions([]);
        return $this->createTwcNotaryLeaseSupplierinfoEx($request, $runtime);
    }

    /**
     * Description: 供应商上传采购等相关信息
     * Summary: 供应商上传采购等相关信息
     * @param CreateTwcNotaryLeaseSupplierinfoRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateTwcNotaryLeaseSupplierinfoResponse
     */
    public function createTwcNotaryLeaseSupplierinfoEx($request, $runtime){
        Utils::validateModel($request);
        return CreateTwcNotaryLeaseSupplierinfoResponse::fromMap($this->doRequest("1.0", "twc.notary.lease.supplierinfo.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }
}
