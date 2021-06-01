<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\TWC\Models\AddContractDocumentRequest;
use AntChain\TWC\Models\AddContractDocumentResponse;
use AntChain\TWC\Models\AddContractFileRequest;
use AntChain\TWC\Models\AddContractFileResponse;
use AntChain\TWC\Models\AddContractPlatformsignfieldsRequest;
use AntChain\TWC\Models\AddContractPlatformsignfieldsResponse;
use AntChain\TWC\Models\AddContractSignfieldRequest;
use AntChain\TWC\Models\AddContractSignfieldResponse;
use AntChain\TWC\Models\ApplyContractCallbackkeyRequest;
use AntChain\TWC\Models\ApplyContractCallbackkeyResponse;
use AntChain\TWC\Models\ApplyContractReportRequest;
use AntChain\TWC\Models\ApplyContractReportResponse;
use AntChain\TWC\Models\ApplyJusticeMediationRequest;
use AntChain\TWC\Models\ApplyJusticeMediationResponse;
use AntChain\TWC\Models\AuthContractSignRequest;
use AntChain\TWC\Models\AuthContractSignResponse;
use AntChain\TWC\Models\AuthLeaseContractRequest;
use AntChain\TWC\Models\AuthLeaseContractResponse;
use AntChain\TWC\Models\AuthWitnessFlowRequest;
use AntChain\TWC\Models\AuthWitnessFlowResponse;
use AntChain\TWC\Models\CallbackArbitrationStatusRequest;
use AntChain\TWC\Models\CallbackArbitrationStatusResponse;
use AntChain\TWC\Models\CancelContractPaysingletradeRequest;
use AntChain\TWC\Models\CancelContractPaysingletradeResponse;
use AntChain\TWC\Models\CancelContractPaytradeRequest;
use AntChain\TWC\Models\CancelContractPaytradeResponse;
use AntChain\TWC\Models\CertifyEnterpriseFaceauthRequest;
use AntChain\TWC\Models\CertifyEnterpriseFaceauthResponse;
use AntChain\TWC\Models\CertifyIdentificationFaceauthRequest;
use AntChain\TWC\Models\CertifyIdentificationFaceauthResponse;
use AntChain\TWC\Models\CheckEpidentityFourmetaRequest;
use AntChain\TWC\Models\CheckEpidentityFourmetaResponse;
use AntChain\TWC\Models\CheckEpidentityThreemetaRequest;
use AntChain\TWC\Models\CheckEpidentityThreemetaResponse;
use AntChain\TWC\Models\CheckEpidentityTwometaRequest;
use AntChain\TWC\Models\CheckEpidentityTwometaResponse;
use AntChain\TWC\Models\CheckIndustryNotaryRequest;
use AntChain\TWC\Models\CheckIndustryNotaryResponse;
use AntChain\TWC\Models\CheckNotarizationOrderRequest;
use AntChain\TWC\Models\CheckNotarizationOrderResponse;
use AntChain\TWC\Models\CheckStatusRequest;
use AntChain\TWC\Models\CheckStatusResponse;
use AntChain\TWC\Models\CheckWitnessSignaccessRequest;
use AntChain\TWC\Models\CheckWitnessSignaccessResponse;
use AntChain\TWC\Models\ConfirmWitnessFlowRequest;
use AntChain\TWC\Models\ConfirmWitnessFlowResponse;
use AntChain\TWC\Models\CreateContractAccountRequest;
use AntChain\TWC\Models\CreateContractAccountResponse;
use AntChain\TWC\Models\CreateContractAccountsealimageRequest;
use AntChain\TWC\Models\CreateContractAccountsealimageResponse;
use AntChain\TWC\Models\CreateContractAccountsealRequest;
use AntChain\TWC\Models\CreateContractAccountsealResponse;
use AntChain\TWC\Models\CreateContractAdminaccountRequest;
use AntChain\TWC\Models\CreateContractAdminaccountResponse;
use AntChain\TWC\Models\CreateContractCommontriggerRequest;
use AntChain\TWC\Models\CreateContractCommontriggerResponse;
use AntChain\TWC\Models\CreateContractFlowRequest;
use AntChain\TWC\Models\CreateContractFlowResponse;
use AntChain\TWC\Models\CreateContractHandsignfieldRequest;
use AntChain\TWC\Models\CreateContractHandsignfieldResponse;
use AntChain\TWC\Models\CreateContractHandsignflowRequest;
use AntChain\TWC\Models\CreateContractHandsignflowResponse;
use AntChain\TWC\Models\CreateContractMerchantimageRequest;
use AntChain\TWC\Models\CreateContractMerchantimageResponse;
use AntChain\TWC\Models\CreateContractMerchantindirectzftRequest;
use AntChain\TWC\Models\CreateContractMerchantindirectzftResponse;
use AntChain\TWC\Models\CreateContractMerchantrefundRequest;
use AntChain\TWC\Models\CreateContractMerchantrefundResponse;
use AntChain\TWC\Models\CreateContractOnestepflowRequest;
use AntChain\TWC\Models\CreateContractOnestepflowResponse;
use AntChain\TWC\Models\CreateContractOrganizationRequest;
use AntChain\TWC\Models\CreateContractOrganizationResponse;
use AntChain\TWC\Models\CreateContractOrgsealRequest;
use AntChain\TWC\Models\CreateContractOrgsealResponse;
use AntChain\TWC\Models\CreateContractPlatformRequest;
use AntChain\TWC\Models\CreateContractPlatformResponse;
use AntChain\TWC\Models\CreateContractPlatformtemplateRequest;
use AntChain\TWC\Models\CreateContractPlatformtemplateResponse;
use AntChain\TWC\Models\CreateContractRegisterzftRequest;
use AntChain\TWC\Models\CreateContractRegisterzftResponse;
use AntChain\TWC\Models\CreateContractSignflowRequest;
use AntChain\TWC\Models\CreateContractSignflowResponse;
use AntChain\TWC\Models\CreateContractTemplateRequest;
use AntChain\TWC\Models\CreateContractTemplateResponse;
use AntChain\TWC\Models\CreateContractTextRequest;
use AntChain\TWC\Models\CreateContractTextResponse;
use AntChain\TWC\Models\CreateContractUserRequest;
use AntChain\TWC\Models\CreateContractUserResponse;
use AntChain\TWC\Models\CreateCourtFilenotaryRequest;
use AntChain\TWC\Models\CreateCourtFilenotaryResponse;
use AntChain\TWC\Models\CreateCourtTextnotaryRequest;
use AntChain\TWC\Models\CreateCourtTextnotaryResponse;
use AntChain\TWC\Models\CreateEcocontractTextRequest;
use AntChain\TWC\Models\CreateEcocontractTextResponse;
use AntChain\TWC\Models\CreateEcocontractTransRequest;
use AntChain\TWC\Models\CreateEcocontractTransResponse;
use AntChain\TWC\Models\CreateFileRequest;
use AntChain\TWC\Models\CreateFileResponse;
use AntChain\TWC\Models\CreateFinanceFilenotaryRequest;
use AntChain\TWC\Models\CreateFinanceFilenotaryResponse;
use AntChain\TWC\Models\CreateFinanceTextnotaryRequest;
use AntChain\TWC\Models\CreateFinanceTextnotaryResponse;
use AntChain\TWC\Models\CreateInternalContractRequest;
use AntChain\TWC\Models\CreateInternalContractResponse;
use AntChain\TWC\Models\CreateInternalTextRequest;
use AntChain\TWC\Models\CreateInternalTextResponse;
use AntChain\TWC\Models\CreateInternalTransRequest;
use AntChain\TWC\Models\CreateInternalTransResponse;
use AntChain\TWC\Models\CreateLargefileRequest;
use AntChain\TWC\Models\CreateLargefileResponse;
use AntChain\TWC\Models\CreateLeaseAssetagentregisterRequest;
use AntChain\TWC\Models\CreateLeaseAssetagentregisterResponse;
use AntChain\TWC\Models\CreateLeaseAuditRequest;
use AntChain\TWC\Models\CreateLeaseAuditResponse;
use AntChain\TWC\Models\CreateLeaseBiznotaryRequest;
use AntChain\TWC\Models\CreateLeaseBiznotaryResponse;
use AntChain\TWC\Models\CreateLeaseBizRequest;
use AntChain\TWC\Models\CreateLeaseBizResponse;
use AntChain\TWC\Models\CreateLeaseClearingRequest;
use AntChain\TWC\Models\CreateLeaseClearingResponse;
use AntChain\TWC\Models\CreateLeaseCreditpromiseRequest;
use AntChain\TWC\Models\CreateLeaseCreditpromiseResponse;
use AntChain\TWC\Models\CreateLeaseDisburseinfoRequest;
use AntChain\TWC\Models\CreateLeaseDisburseinfoResponse;
use AntChain\TWC\Models\CreateLeaseFileRequest;
use AntChain\TWC\Models\CreateLeaseFileResponse;
use AntChain\TWC\Models\CreateLeaseNotifyregisterRequest;
use AntChain\TWC\Models\CreateLeaseNotifyregisterResponse;
use AntChain\TWC\Models\CreateLeaseOrderinfoRequest;
use AntChain\TWC\Models\CreateLeaseOrderinfoResponse;
use AntChain\TWC\Models\CreateLeaseOrderRequest;
use AntChain\TWC\Models\CreateLeaseOrderResponse;
use AntChain\TWC\Models\CreateLeasePaymentfileRequest;
use AntChain\TWC\Models\CreateLeasePaymentfileResponse;
use AntChain\TWC\Models\CreateLeaseProductinfoRequest;
use AntChain\TWC\Models\CreateLeaseProductinfoResponse;
use AntChain\TWC\Models\CreateLeasePromiseRequest;
use AntChain\TWC\Models\CreateLeasePromiseResponse;
use AntChain\TWC\Models\CreateLeaseRentalRequest;
use AntChain\TWC\Models\CreateLeaseRentalResponse;
use AntChain\TWC\Models\CreateLeaseRepaymentRequest;
use AntChain\TWC\Models\CreateLeaseRepaymentResponse;
use AntChain\TWC\Models\CreateLeaseRouteRequest;
use AntChain\TWC\Models\CreateLeaseRouteResponse;
use AntChain\TWC\Models\CreateLeaseSupplierdynamicinfoRequest;
use AntChain\TWC\Models\CreateLeaseSupplierdynamicinfoResponse;
use AntChain\TWC\Models\CreateLeaseSupplierinfoRequest;
use AntChain\TWC\Models\CreateLeaseSupplierinfoResponse;
use AntChain\TWC\Models\CreateLeaseTextRequest;
use AntChain\TWC\Models\CreateLeaseTextResponse;
use AntChain\TWC\Models\CreateLeaseUserinfoRequest;
use AntChain\TWC\Models\CreateLeaseUserinfoResponse;
use AntChain\TWC\Models\CreateLeaseVerifyinfoRequest;
use AntChain\TWC\Models\CreateLeaseVerifyinfoResponse;
use AntChain\TWC\Models\CreateLeaseZftagreementsignRequest;
use AntChain\TWC\Models\CreateLeaseZftagreementsignResponse;
use AntChain\TWC\Models\CreateLeaseZftagreementunsignRequest;
use AntChain\TWC\Models\CreateLeaseZftagreementunsignResponse;
use AntChain\TWC\Models\CreateNotarizationBillRequest;
use AntChain\TWC\Models\CreateNotarizationBillResponse;
use AntChain\TWC\Models\CreateSourceRequest;
use AntChain\TWC\Models\CreateSourceResponse;
use AntChain\TWC\Models\CreateSueBreakpromiseinfoRequest;
use AntChain\TWC\Models\CreateSueBreakpromiseinfoResponse;
use AntChain\TWC\Models\CreateTextRequest;
use AntChain\TWC\Models\CreateTextResponse;
use AntChain\TWC\Models\CreateTransRequest;
use AntChain\TWC\Models\CreateTransResponse;
use AntChain\TWC\Models\CreateWithholdAgreementRequest;
use AntChain\TWC\Models\CreateWithholdAgreementResponse;
use AntChain\TWC\Models\CreateWithholdOverduetimeRequest;
use AntChain\TWC\Models\CreateWithholdOverduetimeResponse;
use AntChain\TWC\Models\CreateWithholdQrcodeRequest;
use AntChain\TWC\Models\CreateWithholdQrcodeResponse;
use AntChain\TWC\Models\CreateWitnessFlowRequest;
use AntChain\TWC\Models\CreateWitnessFlowResponse;
use AntChain\TWC\Models\DeleteContractSignerRequest;
use AntChain\TWC\Models\DeleteContractSignerResponse;
use AntChain\TWC\Models\DeleteJointconstraintRecordRequest;
use AntChain\TWC\Models\DeleteJointconstraintRecordResponse;
use AntChain\TWC\Models\DeleteSueBreakpromiseinfoRequest;
use AntChain\TWC\Models\DeleteSueBreakpromiseinfoResponse;
use AntChain\TWC\Models\DeployLeaseContractRequest;
use AntChain\TWC\Models\DeployLeaseContractResponse;
use AntChain\TWC\Models\DeployMytfTappRequest;
use AntChain\TWC\Models\DeployMytfTappResponse;
use AntChain\TWC\Models\DownloadContractDocumentRequest;
use AntChain\TWC\Models\DownloadContractDocumentResponse;
use AntChain\TWC\Models\GetCertificateDetailRequest;
use AntChain\TWC\Models\GetCertificateDetailResponse;
use AntChain\TWC\Models\GetContractCertificateRequest;
use AntChain\TWC\Models\GetContractCertificateResponse;
use AntChain\TWC\Models\GetContractFileRequest;
use AntChain\TWC\Models\GetContractFileResponse;
use AntChain\TWC\Models\GetContractFileuploadurlRequest;
use AntChain\TWC\Models\GetContractFileuploadurlResponse;
use AntChain\TWC\Models\GetContractSignurlRequest;
use AntChain\TWC\Models\GetContractSignurlResponse;
use AntChain\TWC\Models\GetContractTextRequest;
use AntChain\TWC\Models\GetContractTextResponse;
use AntChain\TWC\Models\GetCourtFilenotaryRequest;
use AntChain\TWC\Models\GetCourtFilenotaryResponse;
use AntChain\TWC\Models\GetCourtTextnotaryRequest;
use AntChain\TWC\Models\GetCourtTextnotaryResponse;
use AntChain\TWC\Models\GetFileRequest;
use AntChain\TWC\Models\GetFileResponse;
use AntChain\TWC\Models\GetFinanceFilenotaryRequest;
use AntChain\TWC\Models\GetFinanceFilenotaryResponse;
use AntChain\TWC\Models\GetFinanceTextnotaryRequest;
use AntChain\TWC\Models\GetFinanceTextnotaryResponse;
use AntChain\TWC\Models\GetInternalTextRequest;
use AntChain\TWC\Models\GetInternalTextResponse;
use AntChain\TWC\Models\GetSourceRequest;
use AntChain\TWC\Models\GetSourceResponse;
use AntChain\TWC\Models\GetTextRequest;
use AntChain\TWC\Models\GetTextResponse;
use AntChain\TWC\Models\GetTransRequest;
use AntChain\TWC\Models\GetTransResponse;
use AntChain\TWC\Models\GetTsrCertificateRequest;
use AntChain\TWC\Models\GetTsrCertificateResponse;
use AntChain\TWC\Models\InitCertificationRequest;
use AntChain\TWC\Models\InitCertificationResponse;
use AntChain\TWC\Models\InitEnterpriseFaceauthRequest;
use AntChain\TWC\Models\InitEnterpriseFaceauthResponse;
use AntChain\TWC\Models\InitIdentificationFaceauthRequest;
use AntChain\TWC\Models\InitIdentificationFaceauthResponse;
use AntChain\TWC\Models\ListContractOuttradeidRequest;
use AntChain\TWC\Models\ListContractOuttradeidResponse;
use AntChain\TWC\Models\ListContractPayruleRequest;
use AntChain\TWC\Models\ListContractPayruleResponse;
use AntChain\TWC\Models\ListContractTradeidsRequest;
use AntChain\TWC\Models\ListContractTradeidsResponse;
use AntChain\TWC\Models\ListLeaseNotaryRequest;
use AntChain\TWC\Models\ListLeaseNotaryResponse;
use AntChain\TWC\Models\OpenInternalTwcRequest;
use AntChain\TWC\Models\OpenInternalTwcResponse;
use AntChain\TWC\Models\QueryCertificationRequest;
use AntChain\TWC\Models\QueryCertificationResponse;
use AntChain\TWC\Models\QueryContractAccountRequest;
use AntChain\TWC\Models\QueryContractAccountResponse;
use AntChain\TWC\Models\QueryContractAccountsealsRequest;
use AntChain\TWC\Models\QueryContractAccountsealsResponse;
use AntChain\TWC\Models\QueryContractFlowRequest;
use AntChain\TWC\Models\QueryContractFlowResponse;
use AntChain\TWC\Models\QueryContractFlowsignerRequest;
use AntChain\TWC\Models\QueryContractFlowsignerResponse;
use AntChain\TWC\Models\QueryContractMerchantindirectzftRequest;
use AntChain\TWC\Models\QueryContractMerchantindirectzftResponse;
use AntChain\TWC\Models\QueryContractMerchantzftRequest;
use AntChain\TWC\Models\QueryContractMerchantzftResponse;
use AntChain\TWC\Models\QueryContractNotaryRequest;
use AntChain\TWC\Models\QueryContractNotaryResponse;
use AntChain\TWC\Models\QueryContractOrganizationRequest;
use AntChain\TWC\Models\QueryContractOrganizationResponse;
use AntChain\TWC\Models\QueryContractOrganizationsealsRequest;
use AntChain\TWC\Models\QueryContractOrganizationsealsResponse;
use AntChain\TWC\Models\QueryContractSignfieldsealidRequest;
use AntChain\TWC\Models\QueryContractSignfieldsealidResponse;
use AntChain\TWC\Models\QueryContractSignfieldsRequest;
use AntChain\TWC\Models\QueryContractSignfieldsResponse;
use AntChain\TWC\Models\QueryContractTemplateRequest;
use AntChain\TWC\Models\QueryContractTemplateResponse;
use AntChain\TWC\Models\QueryContractTradedetailRequest;
use AntChain\TWC\Models\QueryContractTradedetailResponse;
use AntChain\TWC\Models\QueryContractWordspositionRequest;
use AntChain\TWC\Models\QueryContractWordspositionResponse;
use AntChain\TWC\Models\QueryEnterpriseFaceauthRequest;
use AntChain\TWC\Models\QueryEnterpriseFaceauthResponse;
use AntChain\TWC\Models\QueryIdentificationFaceauthRequest;
use AntChain\TWC\Models\QueryIdentificationFaceauthResponse;
use AntChain\TWC\Models\QueryJointconstraintBreachrecordRequest;
use AntChain\TWC\Models\QueryJointconstraintBreachrecordResponse;
use AntChain\TWC\Models\QueryJusticeMediationRequest;
use AntChain\TWC\Models\QueryJusticeMediationResponse;
use AntChain\TWC\Models\QueryLeaseApplicationdetailinfoRequest;
use AntChain\TWC\Models\QueryLeaseApplicationdetailinfoResponse;
use AntChain\TWC\Models\QueryLeaseApplicationRequest;
use AntChain\TWC\Models\QueryLeaseApplicationResponse;
use AntChain\TWC\Models\QueryLeaseBizRequest;
use AntChain\TWC\Models\QueryLeaseBizResponse;
use AntChain\TWC\Models\QueryLeaseEncryptedinfoRequest;
use AntChain\TWC\Models\QueryLeaseEncryptedinfoResponse;
use AntChain\TWC\Models\QueryLeaseIotinfoRequest;
use AntChain\TWC\Models\QueryLeaseIotinfoResponse;
use AntChain\TWC\Models\QueryLeaseOrderinfoRequest;
use AntChain\TWC\Models\QueryLeaseOrderinfoResponse;
use AntChain\TWC\Models\QueryLeaseProductinfoRequest;
use AntChain\TWC\Models\QueryLeaseProductinfoResponse;
use AntChain\TWC\Models\QueryLeaseProofRequest;
use AntChain\TWC\Models\QueryLeaseProofResponse;
use AntChain\TWC\Models\QueryPayresultfileurlRequest;
use AntChain\TWC\Models\QueryPayresultfileurlResponse;
use AntChain\TWC\Models\QuerySueUserinfoRequest;
use AntChain\TWC\Models\QuerySueUserinfoResponse;
use AntChain\TWC\Models\QueryWithholdAgreementRequest;
use AntChain\TWC\Models\QueryWithholdAgreementResponse;
use AntChain\TWC\Models\QueryWithholdAgreementurlRequest;
use AntChain\TWC\Models\QueryWithholdAgreementurlResponse;
use AntChain\TWC\Models\QueryWithholdPayresultRequest;
use AntChain\TWC\Models\QueryWithholdPayresultResponse;
use AntChain\TWC\Models\SaveContractFlowRequest;
use AntChain\TWC\Models\SaveContractFlowResponse;
use AntChain\TWC\Models\SaveJointconstraintRecordRequest;
use AntChain\TWC\Models\SaveJointconstraintRecordResponse;
use AntChain\TWC\Models\SaveWitnessSnapshotRequest;
use AntChain\TWC\Models\SaveWitnessSnapshotResponse;
use AntChain\TWC\Models\SendContractInvitationRequest;
use AntChain\TWC\Models\SendContractInvitationResponse;
use AntChain\TWC\Models\SendWithholdDeductRequest;
use AntChain\TWC\Models\SendWithholdDeductResponse;
use AntChain\TWC\Models\SendWithholdRefundRequest;
use AntChain\TWC\Models\SendWithholdRefundResponse;
use AntChain\TWC\Models\SetLeaseRepaymentstatusRequest;
use AntChain\TWC\Models\SetLeaseRepaymentstatusResponse;
use AntChain\TWC\Models\SetNotarizationOrderRequest;
use AntChain\TWC\Models\SetNotarizationOrderResponse;
use AntChain\TWC\Models\StartContractFlowRequest;
use AntChain\TWC\Models\StartContractFlowResponse;
use AntChain\TWC\Models\StartContractHandsignRequest;
use AntChain\TWC\Models\StartContractHandsignResponse;
use AntChain\TWC\Models\UpdateLeaseContractRequest;
use AntChain\TWC\Models\UpdateLeaseContractResponse;
use AntChain\TWC\Models\UpdateNotarizationOrderRequest;
use AntChain\TWC\Models\UpdateNotarizationOrderResponse;
use AntChain\TWC\Models\UpdateSueBreakpromiseinfoRequest;
use AntChain\TWC\Models\UpdateSueBreakpromiseinfoResponse;
use AntChain\TWC\Models\UpdateSueExemplaryrevertRequest;
use AntChain\TWC\Models\UpdateSueExemplaryrevertResponse;
use AntChain\TWC\Models\UpdateSueExeplarycontractRequest;
use AntChain\TWC\Models\UpdateSueExeplarycontractResponse;
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
            // 签字人
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
                    'sdk_version'      => '1.5.3',
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query['security_token'] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    'host'       => Utils::defaultString($this->_endpoint, 'twc-openapi.antchain.antgroup.com'),
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
     * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
     * Summary: 仲裁状态信息变更回调接口.
     *
     * @param CallbackArbitrationStatusRequest $request
     *
     * @return CallbackArbitrationStatusResponse
     */
    public function callbackArbitrationStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackArbitrationStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
     * Summary: 仲裁状态信息变更回调接口.
     *
     * @param CallbackArbitrationStatusRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CallbackArbitrationStatusResponse
     */
    public function callbackArbitrationStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackArbitrationStatusResponse::fromMap($this->doRequest('1.0', 'twc.notary.arbitration.status.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
     * Summary: 创建电子合同签署个人帐户.
     *
     * @param CreateContractAccountRequest $request
     *
     * @return CreateContractAccountResponse
     */
    public function createContractAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
     * Summary: 创建电子合同签署个人帐户.
     *
     * @param CreateContractAccountRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateContractAccountResponse
     */
    public function createContractAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractAccountResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.account.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过模版参数，创建个人印章
     * Summary: 创建电子合同个人帐户印章.
     *
     * @param CreateContractAccountsealRequest $request
     *
     * @return CreateContractAccountsealResponse
     */
    public function createContractAccountseal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractAccountsealEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过模版参数，创建个人印章
     * Summary: 创建电子合同个人帐户印章.
     *
     * @param CreateContractAccountsealRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateContractAccountsealResponse
     */
    public function createContractAccountsealEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractAccountsealResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.accountseal.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
     * 创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
     * Summary: 创建电子合同签署机构帐户.
     *
     * @param CreateContractOrganizationRequest $request
     *
     * @return CreateContractOrganizationResponse
     */
    public function createContractOrganization($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractOrganizationEx($request, $headers, $runtime);
    }

    /**
     * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
     * 创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
     * Summary: 创建电子合同签署机构帐户.
     *
     * @param CreateContractOrganizationRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateContractOrganizationResponse
     */
    public function createContractOrganizationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractOrganizationResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.organization.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过模版参数，创建机构印章
     * Summary: 创建电子合同机构帐户印章.
     *
     * @param CreateContractOrgsealRequest $request
     *
     * @return CreateContractOrgsealResponse
     */
    public function createContractOrgseal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractOrgsealEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过模版参数，创建机构印章
     * Summary: 创建电子合同机构帐户印章.
     *
     * @param CreateContractOrgsealRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateContractOrgsealResponse
     */
    public function createContractOrgsealEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractOrgsealResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.orgseal.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return AuthContractSignResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.sign.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return CreateContractTemplateResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.template.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建签署流程
     * Summary: 创建电子合同签署流程.
     *
     * @param CreateContractFlowRequest $request
     *
     * @return CreateContractFlowResponse
     */
    public function createContractFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建签署流程
     * Summary: 创建电子合同签署流程.
     *
     * @param CreateContractFlowRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateContractFlowResponse
     */
    public function createContractFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractFlowResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.flow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return AddContractDocumentResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.document.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return AddContractSignfieldResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.signfield.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return StartContractFlowResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.flow.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return SaveContractFlowResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.flow.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return DownloadContractDocumentResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.document.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return AddContractFileResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.file.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return CreateContractPlatformResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.platform.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子合同平台方提供用户信息，注册成为平台用户
     * Summary: 电子合同平台方的用户注册.
     *
     * @param CreateContractUserRequest $request
     *
     * @return CreateContractUserResponse
     */
    public function createContractUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同平台方提供用户信息，注册成为平台用户
     * Summary: 电子合同平台方的用户注册.
     *
     * @param CreateContractUserRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateContractUserResponse
     */
    public function createContractUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractUserResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.user.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
     * Summary: 电子合同平台方发起手动签署流程.
     *
     * @param StartContractHandsignRequest $request
     *
     * @return StartContractHandsignResponse
     */
    public function startContractHandsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startContractHandsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
     * Summary: 电子合同平台方发起手动签署流程.
     *
     * @param StartContractHandsignRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return StartContractHandsignResponse
     */
    public function startContractHandsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartContractHandsignResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.handsign.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return QueryContractFlowResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.flow.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return CreateContractAccountsealimageResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.accountsealimage.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return GetContractFileuploadurlResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.fileuploadurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
     * 签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
     * Summary: 添加平台自动盖章签署区.
     *
     * @param AddContractPlatformsignfieldsRequest $request
     *
     * @return AddContractPlatformsignfieldsResponse
     */
    public function addContractPlatformsignfields($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addContractPlatformsignfieldsEx($request, $headers, $runtime);
    }

    /**
     * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
     * 签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
     * Summary: 添加平台自动盖章签署区.
     *
     * @param AddContractPlatformsignfieldsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return AddContractPlatformsignfieldsResponse
     */
    public function addContractPlatformsignfieldsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddContractPlatformsignfieldsResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.platformsignfields.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return GetContractFileResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.file.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询个人所有印章
     * Summary: 查询个人印章.
     *
     * @param QueryContractAccountsealsRequest $request
     *
     * @return QueryContractAccountsealsResponse
     */
    public function queryContractAccountseals($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractAccountsealsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询个人所有印章
     * Summary: 查询个人印章.
     *
     * @param QueryContractAccountsealsRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryContractAccountsealsResponse
     */
    public function queryContractAccountsealsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractAccountsealsResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.accountseals.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询机构所有印章
     * Summary: 查询机构印章.
     *
     * @param QueryContractOrganizationsealsRequest $request
     *
     * @return QueryContractOrganizationsealsResponse
     */
    public function queryContractOrganizationseals($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractOrganizationsealsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询机构所有印章
     * Summary: 查询机构印章.
     *
     * @param QueryContractOrganizationsealsRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryContractOrganizationsealsResponse
     */
    public function queryContractOrganizationsealsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractOrganizationsealsResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.organizationseals.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return QueryContractFlowsignerResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.flowsigner.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return QueryContractSignfieldsResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.signfields.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 使用创建账号返回的账号id查询用户的账号。
     * Summary: 查询个人账号.
     *
     * @param QueryContractAccountRequest $request
     *
     * @return QueryContractAccountResponse
     */
    public function queryContractAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 使用创建账号返回的账号id查询用户的账号。
     * Summary: 查询个人账号.
     *
     * @param QueryContractAccountRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryContractAccountResponse
     */
    public function queryContractAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractAccountResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.account.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 使用创建账号返回的账号id查询机构账号。
     * Summary: 查询机构账号.
     *
     * @param QueryContractOrganizationRequest $request
     *
     * @return QueryContractOrganizationResponse
     */
    public function queryContractOrganization($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractOrganizationEx($request, $headers, $runtime);
    }

    /**
     * Description: 使用创建账号返回的账号id查询机构账号。
     * Summary: 查询机构账号.
     *
     * @param QueryContractOrganizationRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryContractOrganizationResponse
     */
    public function queryContractOrganizationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractOrganizationResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.organization.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
     * Summary: 查询模板详情详情.
     *
     * @param QueryContractTemplateRequest $request
     *
     * @return QueryContractTemplateResponse
     */
    public function queryContractTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
     * Summary: 查询模板详情详情.
     *
     * @param QueryContractTemplateRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryContractTemplateResponse
     */
    public function queryContractTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractTemplateResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.template.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return CreateContractSignflowResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.signflow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户签署直付通协议
     * Summary: 商户签署直付通协议.
     *
     * @param CreateContractRegisterzftRequest $request
     *
     * @return CreateContractRegisterzftResponse
     */
    public function createContractRegisterzft($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractRegisterzftEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户签署直付通协议
     * Summary: 商户签署直付通协议.
     *
     * @param CreateContractRegisterzftRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateContractRegisterzftResponse
     */
    public function createContractRegisterzftEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractRegisterzftResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.registerzft.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
     * Summary: 创建智能合同模板
     *
     * @param CreateContractPlatformtemplateRequest $request
     *
     * @return CreateContractPlatformtemplateResponse
     */
    public function createContractPlatformtemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractPlatformtemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
     * Summary: 创建智能合同模板
     *
     * @param CreateContractPlatformtemplateRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CreateContractPlatformtemplateResponse
     */
    public function createContractPlatformtemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractPlatformtemplateResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.platformtemplate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商户直付通入驻信息
     * Summary: 查询商户直付通入驻信息.
     *
     * @param QueryContractMerchantzftRequest $request
     *
     * @return QueryContractMerchantzftResponse
     */
    public function queryContractMerchantzft($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractMerchantzftEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商户直付通入驻信息
     * Summary: 查询商户直付通入驻信息.
     *
     * @param QueryContractMerchantzftRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryContractMerchantzftResponse
     */
    public function queryContractMerchantzftEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractMerchantzftResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchantzft.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列举本租户合同相关交易
     * Summary: 列举本租户合同相关交易.
     *
     * @param ListContractOuttradeidRequest $request
     *
     * @return ListContractOuttradeidResponse
     */
    public function listContractOuttradeid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listContractOuttradeidEx($request, $headers, $runtime);
    }

    /**
     * Description: 列举本租户合同相关交易
     * Summary: 列举本租户合同相关交易.
     *
     * @param ListContractOuttradeidRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListContractOuttradeidResponse
     */
    public function listContractOuttradeidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListContractOuttradeidResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.outtradeid.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据订单id查询订单代扣详情
     * Summary: 根据订单id查询订单代扣详情.
     *
     * @param QueryContractTradedetailRequest $request
     *
     * @return QueryContractTradedetailResponse
     */
    public function queryContractTradedetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractTradedetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据订单id查询订单代扣详情
     * Summary: 根据订单id查询订单代扣详情.
     *
     * @param QueryContractTradedetailRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryContractTradedetailResponse
     */
    public function queryContractTradedetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractTradedetailResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.tradedetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户根据订单id退款
     * Summary: 商户根据订单id退款.
     *
     * @param CreateContractMerchantrefundRequest $request
     *
     * @return CreateContractMerchantrefundResponse
     */
    public function createContractMerchantrefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractMerchantrefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户根据订单id退款
     * Summary: 商户根据订单id退款.
     *
     * @param CreateContractMerchantrefundRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateContractMerchantrefundResponse
     */
    public function createContractMerchantrefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractMerchantrefundResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchantrefund.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建蚂蚁区块链账户
     * Summary: 创建蚂蚁区块链账户.
     *
     * @param CreateContractAdminaccountRequest $request
     *
     * @return CreateContractAdminaccountResponse
     */
    public function createContractAdminaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractAdminaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建蚂蚁区块链账户
     * Summary: 创建蚂蚁区块链账户.
     *
     * @param CreateContractAdminaccountRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateContractAdminaccountResponse
     */
    public function createContractAdminaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractAdminaccountResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.adminaccount.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户根据合同id列举所有的tradeId
     * Summary: 商户根据合同id列举所有的tradeId.
     *
     * @param ListContractTradeidsRequest $request
     *
     * @return ListContractTradeidsResponse
     */
    public function listContractTradeids($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listContractTradeidsEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户根据合同id列举所有的tradeId
     * Summary: 商户根据合同id列举所有的tradeId.
     *
     * @param ListContractTradeidsRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListContractTradeidsResponse
     */
    public function listContractTradeidsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListContractTradeidsResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.tradeids.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户上传代扣规则
     * Summary: 商户上传代扣规则.
     *
     * @param CreateContractCommontriggerRequest $request
     *
     * @return CreateContractCommontriggerResponse
     */
    public function createContractCommontrigger($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractCommontriggerEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户上传代扣规则
     * Summary: 商户上传代扣规则.
     *
     * @param CreateContractCommontriggerRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateContractCommontriggerResponse
     */
    public function createContractCommontriggerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractCommontriggerResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.commontrigger.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户入驻直付通
     * Summary: 商户入驻直付通.
     *
     * @param CreateContractMerchantindirectzftRequest $request
     *
     * @return CreateContractMerchantindirectzftResponse
     */
    public function createContractMerchantindirectzft($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractMerchantindirectzftEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户入驻直付通
     * Summary: 商户入驻直付通.
     *
     * @param CreateContractMerchantindirectzftRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return CreateContractMerchantindirectzftResponse
     */
    public function createContractMerchantindirectzftEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractMerchantindirectzftResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchantindirectzft.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据订单id查询直付通商户入驻信息
     * Summary: 根据订单id查询直付通商户入驻信息.
     *
     * @param QueryContractMerchantindirectzftRequest $request
     *
     * @return QueryContractMerchantindirectzftResponse
     */
    public function queryContractMerchantindirectzft($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractMerchantindirectzftEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据订单id查询直付通商户入驻信息
     * Summary: 根据订单id查询直付通商户入驻信息.
     *
     * @param QueryContractMerchantindirectzftRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryContractMerchantindirectzftResponse
     */
    public function queryContractMerchantindirectzftEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractMerchantindirectzftResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchantindirectzft.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取支付对账文件的url
     * Summary: 获取支付对账文件的url.
     *
     * @param QueryPayresultfileurlRequest $request
     *
     * @return QueryPayresultfileurlResponse
     */
    public function queryPayresultfileurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPayresultfileurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取支付对账文件的url
     * Summary: 获取支付对账文件的url.
     *
     * @param QueryPayresultfileurlRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryPayresultfileurlResponse
     */
    public function queryPayresultfileurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPayresultfileurlResponse::fromMap($this->doRequest('1.0', 'twc.notary.payresultfileurl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能合同图片上传
     * Summary: 智能合同图片上传.
     *
     * @param CreateContractMerchantimageRequest $request
     *
     * @return CreateContractMerchantimageResponse
     */
    public function createContractMerchantimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractMerchantimageEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能合同图片上传
     * Summary: 智能合同图片上传.
     *
     * @param CreateContractMerchantimageRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateContractMerchantimageResponse
     */
    public function createContractMerchantimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractMerchantimageResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchantimage.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消智能合同剩余代扣条目
     * Summary: 取消智能合同剩余代扣条目.
     *
     * @param CancelContractPaytradeRequest $request
     *
     * @return CancelContractPaytradeResponse
     */
    public function cancelContractPaytrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelContractPaytradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消智能合同剩余代扣条目
     * Summary: 取消智能合同剩余代扣条目.
     *
     * @param CancelContractPaytradeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CancelContractPaytradeResponse
     */
    public function cancelContractPaytradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelContractPaytradeResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.paytrade.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建手动签署流程
     * Summary: 创建手动签署流程.
     *
     * @param CreateContractHandsignflowRequest $request
     *
     * @return CreateContractHandsignflowResponse
     */
    public function createContractHandsignflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractHandsignflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建手动签署流程
     * Summary: 创建手动签署流程.
     *
     * @param CreateContractHandsignflowRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateContractHandsignflowResponse
     */
    public function createContractHandsignflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractHandsignflowResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.handsignflow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return CreateContractHandsignfieldResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.handsignfield.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return GetContractSignurlResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.signurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信付代扣规则内容创建
     * Summary: 可信付代扣规则内容创建.
     *
     * @param CreateWithholdAgreementRequest $request
     *
     * @return CreateWithholdAgreementResponse
     */
    public function createWithholdAgreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWithholdAgreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信付代扣规则内容创建
     * Summary: 可信付代扣规则内容创建.
     *
     * @param CreateWithholdAgreementRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateWithholdAgreementResponse
     */
    public function createWithholdAgreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWithholdAgreementResponse::fromMap($this->doRequest('1.0', 'twc.notary.withhold.agreement.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询消金代扣协议
     * Summary: 查询可信付代扣协议内容.
     *
     * @param QueryWithholdAgreementRequest $request
     *
     * @return QueryWithholdAgreementResponse
     */
    public function queryWithholdAgreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdAgreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询消金代扣协议
     * Summary: 查询可信付代扣协议内容.
     *
     * @param QueryWithholdAgreementRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryWithholdAgreementResponse
     */
    public function queryWithholdAgreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdAgreementResponse::fromMap($this->doRequest('1.0', 'twc.notary.withhold.agreement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询可信付协议的入口
     * Summary: 查询可信付协议的入口.
     *
     * @param QueryWithholdAgreementurlRequest $request
     *
     * @return QueryWithholdAgreementurlResponse
     */
    public function queryWithholdAgreementurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdAgreementurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询可信付协议的入口
     * Summary: 查询可信付协议的入口.
     *
     * @param QueryWithholdAgreementurlRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryWithholdAgreementurlResponse
     */
    public function queryWithholdAgreementurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdAgreementurlResponse::fromMap($this->doRequest('1.0', 'twc.notary.withhold.agreementurl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 后台录入商家的产品的逾期日
     * Summary: 后台录入商家的产品的逾期日.
     *
     * @param CreateWithholdOverduetimeRequest $request
     *
     * @return CreateWithholdOverduetimeResponse
     */
    public function createWithholdOverduetime($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWithholdOverduetimeEx($request, $headers, $runtime);
    }

    /**
     * Description: 后台录入商家的产品的逾期日
     * Summary: 后台录入商家的产品的逾期日.
     *
     * @param CreateWithholdOverduetimeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateWithholdOverduetimeResponse
     */
    public function createWithholdOverduetimeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWithholdOverduetimeResponse::fromMap($this->doRequest('1.0', 'twc.notary.withhold.overduetime.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信付代扣的扣费请求
     * Summary: 发送代扣请求
     *
     * @param SendWithholdDeductRequest $request
     *
     * @return SendWithholdDeductResponse
     */
    public function sendWithholdDeduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendWithholdDeductEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信付代扣的扣费请求
     * Summary: 发送代扣请求
     *
     * @param SendWithholdDeductRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SendWithholdDeductResponse
     */
    public function sendWithholdDeductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendWithholdDeductResponse::fromMap($this->doRequest('1.0', 'twc.notary.withhold.deduct.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信付代扣结果查询
     * Summary: 可信付代扣结果查询.
     *
     * @param QueryWithholdPayresultRequest $request
     *
     * @return QueryWithholdPayresultResponse
     */
    public function queryWithholdPayresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdPayresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信付代扣结果查询
     * Summary: 可信付代扣结果查询.
     *
     * @param QueryWithholdPayresultRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryWithholdPayresultResponse
     */
    public function queryWithholdPayresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdPayresultResponse::fromMap($this->doRequest('1.0', 'twc.notary.withhold.payresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信付退款请求
     * Summary: 可信付退款请求
     *
     * @param SendWithholdRefundRequest $request
     *
     * @return SendWithholdRefundResponse
     */
    public function sendWithholdRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendWithholdRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信付退款请求
     * Summary: 可信付退款请求
     *
     * @param SendWithholdRefundRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SendWithholdRefundResponse
     */
    public function sendWithholdRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendWithholdRefundResponse::fromMap($this->doRequest('1.0', 'twc.notary.withhold.refund.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
     * Summary: 创建注册邀请任务
     *
     * @param SendContractInvitationRequest $request
     *
     * @return SendContractInvitationResponse
     */
    public function sendContractInvitation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendContractInvitationEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
     * Summary: 创建注册邀请任务
     *
     * @param SendContractInvitationRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SendContractInvitationResponse
     */
    public function sendContractInvitationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendContractInvitationResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.invitation.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询代扣规则
     * Summary: 查询代扣规则.
     *
     * @param ListContractPayruleRequest $request
     *
     * @return ListContractPayruleResponse
     */
    public function listContractPayrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listContractPayruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询代扣规则
     * Summary: 查询代扣规则.
     *
     * @param ListContractPayruleRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListContractPayruleResponse
     */
    public function listContractPayruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListContractPayruleResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.payrule.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取可信付免签协议的二维码
     * Summary: 获取可信付免签协议的二维码
     *
     * @param CreateWithholdQrcodeRequest $request
     *
     * @return CreateWithholdQrcodeResponse
     */
    public function createWithholdQrcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWithholdQrcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取可信付免签协议的二维码
     * Summary: 获取可信付免签协议的二维码
     *
     * @param CreateWithholdQrcodeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateWithholdQrcodeResponse
     */
    public function createWithholdQrcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWithholdQrcodeResponse::fromMap($this->doRequest('1.0', 'twc.notary.withhold.qrcode.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消某一期的代扣规则
     * Summary: 取消某一期的代扣规则.
     *
     * @param CancelContractPaysingletradeRequest $request
     *
     * @return CancelContractPaysingletradeResponse
     */
    public function cancelContractPaysingletrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelContractPaysingletradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消某一期的代扣规则
     * Summary: 取消某一期的代扣规则.
     *
     * @param CancelContractPaysingletradeRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CancelContractPaysingletradeResponse
     */
    public function cancelContractPaysingletradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelContractPaysingletradeResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.paysingletrade.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return ApplyContractCallbackkeyResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.callbackkey.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return CreateContractOnestepflowResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.onestepflow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return QueryContractNotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.notary.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取合同存证事务ID
     * Summary: 获取合同存证事务ID.
     *
     * @param CreateEcocontractTransRequest $request
     *
     * @return CreateEcocontractTransResponse
     */
    public function createEcocontractTrans($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createEcocontractTransEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取合同存证事务ID
     * Summary: 获取合同存证事务ID.
     *
     * @param CreateEcocontractTransRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateEcocontractTransResponse
     */
    public function createEcocontractTransEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateEcocontractTransResponse::fromMap($this->doRequest('1.0', 'twc.notary.ecocontract.trans.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合同文本存证
     * Summary: 合同文本存证
     *
     * @param CreateEcocontractTextRequest $request
     *
     * @return CreateEcocontractTextResponse
     */
    public function createEcocontractText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createEcocontractTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 合同文本存证
     * Summary: 合同文本存证
     *
     * @param CreateEcocontractTextRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateEcocontractTextResponse
     */
    public function createEcocontractTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateEcocontractTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.ecocontract.text.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
     * Summary: 搜索关键字坐标.
     *
     * @param QueryContractWordspositionRequest $request
     *
     * @return QueryContractWordspositionResponse
     */
    public function queryContractWordsposition($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractWordspositionEx($request, $headers, $runtime);
    }

    /**
     * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
     * Summary: 搜索关键字坐标.
     *
     * @param QueryContractWordspositionRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryContractWordspositionResponse
     */
    public function queryContractWordspositionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractWordspositionResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.wordsposition.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

        return DeleteContractSignerResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.signer.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取区块链合同存证证明
     * Summary: 获取区块链合同存证证明.
     *
     * @param GetContractCertificateRequest $request
     *
     * @return GetContractCertificateResponse
     */
    public function getContractCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContractCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取区块链合同存证证明
     * Summary: 获取区块链合同存证证明.
     *
     * @param GetContractCertificateRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetContractCertificateResponse
     */
    public function getContractCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContractCertificateResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.certificate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
     * Summary: 根据合同流程签署区查询已使用的印章id.
     *
     * @param QueryContractSignfieldsealidRequest $request
     *
     * @return QueryContractSignfieldsealidResponse
     */
    public function queryContractSignfieldsealid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractSignfieldsealidEx($request, $headers, $runtime);
    }

    /**
     * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
     * Summary: 根据合同流程签署区查询已使用的印章id.
     *
     * @param QueryContractSignfieldsealidRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryContractSignfieldsealidResponse
     */
    public function queryContractSignfieldsealidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractSignfieldsealidResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.signfieldsealid.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 输入企业名+证件号，发起企业二要素认证请求。
     * Summary: 企业二要素认证
     *
     * @param CheckEpidentityTwometaRequest $request
     *
     * @return CheckEpidentityTwometaResponse
     */
    public function checkEpidentityTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkEpidentityTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 输入企业名+证件号，发起企业二要素认证请求。
     * Summary: 企业二要素认证
     *
     * @param CheckEpidentityTwometaRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CheckEpidentityTwometaResponse
     */
    public function checkEpidentityTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckEpidentityTwometaResponse::fromMap($this->doRequest('1.0', 'twc.notary.epidentity.twometa.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
     * Summary: 企业三要素认证
     *
     * @param CheckEpidentityThreemetaRequest $request
     *
     * @return CheckEpidentityThreemetaResponse
     */
    public function checkEpidentityThreemeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkEpidentityThreemetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
     * Summary: 企业三要素认证
     *
     * @param CheckEpidentityThreemetaRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CheckEpidentityThreemetaResponse
     */
    public function checkEpidentityThreemetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckEpidentityThreemetaResponse::fromMap($this->doRequest('1.0', 'twc.notary.epidentity.threemeta.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
     * Summary: 企业四要素认证
     *
     * @param CheckEpidentityFourmetaRequest $request
     *
     * @return CheckEpidentityFourmetaResponse
     */
    public function checkEpidentityFourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkEpidentityFourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
     * Summary: 企业四要素认证
     *
     * @param CheckEpidentityFourmetaRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CheckEpidentityFourmetaResponse
     */
    public function checkEpidentityFourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckEpidentityFourmetaResponse::fromMap($this->doRequest('1.0', 'twc.notary.epidentity.fourmeta.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询公证订单的有效性
     * Summary: 查询公证订单的有效性.
     *
     * @param CheckNotarizationOrderRequest $request
     *
     * @return CheckNotarizationOrderResponse
     */
    public function checkNotarizationOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkNotarizationOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询公证订单的有效性
     * Summary: 查询公证订单的有效性.
     *
     * @param CheckNotarizationOrderRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CheckNotarizationOrderResponse
     */
    public function checkNotarizationOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckNotarizationOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.notarization.order.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新公证订单状态
     * Summary: 更新公证订单状态
     *
     * @param UpdateNotarizationOrderRequest $request
     *
     * @return UpdateNotarizationOrderResponse
     */
    public function updateNotarizationOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateNotarizationOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新公证订单状态
     * Summary: 更新公证订单状态
     *
     * @param UpdateNotarizationOrderRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateNotarizationOrderResponse
     */
    public function updateNotarizationOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateNotarizationOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.notarization.order.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置订单属性
     * Summary: 设置订单属性.
     *
     * @param SetNotarizationOrderRequest $request
     *
     * @return SetNotarizationOrderResponse
     */
    public function setNotarizationOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setNotarizationOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置订单属性
     * Summary: 设置订单属性.
     *
     * @param SetNotarizationOrderRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SetNotarizationOrderResponse
     */
    public function setNotarizationOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetNotarizationOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.notarization.order.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 实人认证初始化
     * Summary: 实人认证初始化.
     *
     * @param InitIdentificationFaceauthRequest $request
     *
     * @return InitIdentificationFaceauthResponse
     */
    public function initIdentificationFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initIdentificationFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 实人认证初始化
     * Summary: 实人认证初始化.
     *
     * @param InitIdentificationFaceauthRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return InitIdentificationFaceauthResponse
     */
    public function initIdentificationFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitIdentificationFaceauthResponse::fromMap($this->doRequest('1.0', 'twc.notary.identification.faceauth.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起实人认证
     * Summary: 发起实人认证
     *
     * @param CertifyIdentificationFaceauthRequest $request
     *
     * @return CertifyIdentificationFaceauthResponse
     */
    public function certifyIdentificationFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyIdentificationFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起实人认证
     * Summary: 发起实人认证
     *
     * @param CertifyIdentificationFaceauthRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CertifyIdentificationFaceauthResponse
     */
    public function certifyIdentificationFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyIdentificationFaceauthResponse::fromMap($this->doRequest('1.0', 'twc.notary.identification.faceauth.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果.
     *
     * @param QueryIdentificationFaceauthRequest $request
     *
     * @return QueryIdentificationFaceauthResponse
     */
    public function queryIdentificationFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIdentificationFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果.
     *
     * @param QueryIdentificationFaceauthRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryIdentificationFaceauthResponse
     */
    public function queryIdentificationFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIdentificationFaceauthResponse::fromMap($this->doRequest('1.0', 'twc.notary.identification.faceauth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业法人认证查询结果接口
     * Summary: 企业法人认证查询.
     *
     * @param QueryEnterpriseFaceauthRequest $request
     *
     * @return QueryEnterpriseFaceauthResponse
     */
    public function queryEnterpriseFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEnterpriseFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业法人认证查询结果接口
     * Summary: 企业法人认证查询.
     *
     * @param QueryEnterpriseFaceauthRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryEnterpriseFaceauthResponse
     */
    public function queryEnterpriseFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEnterpriseFaceauthResponse::fromMap($this->doRequest('1.0', 'twc.notary.enterprise.faceauth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业法人认证初始化接口
     * Summary: 企业法人认证初始化.
     *
     * @param InitEnterpriseFaceauthRequest $request
     *
     * @return InitEnterpriseFaceauthResponse
     */
    public function initEnterpriseFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initEnterpriseFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业法人认证初始化接口
     * Summary: 企业法人认证初始化.
     *
     * @param InitEnterpriseFaceauthRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return InitEnterpriseFaceauthResponse
     */
    public function initEnterpriseFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitEnterpriseFaceauthResponse::fromMap($this->doRequest('1.0', 'twc.notary.enterprise.faceauth.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业法人认证开始接口
     * Summary: 企业法人认证开始.
     *
     * @param CertifyEnterpriseFaceauthRequest $request
     *
     * @return CertifyEnterpriseFaceauthResponse
     */
    public function certifyEnterpriseFaceauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyEnterpriseFaceauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业法人认证开始接口
     * Summary: 企业法人认证开始.
     *
     * @param CertifyEnterpriseFaceauthRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CertifyEnterpriseFaceauthResponse
     */
    public function certifyEnterpriseFaceauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyEnterpriseFaceauthResponse::fromMap($this->doRequest('1.0', 'twc.notary.enterprise.faceauth.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建租赁订单
     * Summary: 租赁订单创建.
     *
     * @param CreateLeaseOrderRequest $request
     *
     * @return CreateLeaseOrderResponse
     */
    public function createLeaseOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建租赁订单
     * Summary: 租赁订单创建.
     *
     * @param CreateLeaseOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateLeaseOrderResponse
     */
    public function createLeaseOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.order.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
     * Summary: 公证场景创建收费订单.
     *
     * @param CreateNotarizationBillRequest $request
     *
     * @return CreateNotarizationBillResponse
     */
    public function createNotarizationBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createNotarizationBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
     * Summary: 公证场景创建收费订单.
     *
     * @param CreateNotarizationBillRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateNotarizationBillResponse
     */
    public function createNotarizationBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateNotarizationBillResponse::fromMap($this->doRequest('1.0', 'twc.notary.notarization.bill.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
     * Summary: 初始化存证证明订单.
     *
     * @param InitCertificationRequest $request
     *
     * @return InitCertificationResponse
     */
    public function initCertification($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initCertificationEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
     * Summary: 初始化存证证明订单.
     *
     * @param InitCertificationRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return InitCertificationResponse
     */
    public function initCertificationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitCertificationResponse::fromMap($this->doRequest('1.0', 'twc.notary.certification.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
     * Summary: 查询存证证明申请状态
     *
     * @param QueryCertificationRequest $request
     *
     * @return QueryCertificationResponse
     */
    public function queryCertification($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCertificationEx($request, $headers, $runtime);
    }

    /**
     * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
     * Summary: 查询存证证明申请状态
     *
     * @param QueryCertificationRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryCertificationResponse
     */
    public function queryCertificationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCertificationResponse::fromMap($this->doRequest('1.0', 'twc.notary.certification.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
     * Summary: 可信时间凭证服务 - 获取时间凭证证书.
     *
     * @param GetTsrCertificateRequest $request
     *
     * @return GetTsrCertificateResponse
     */
    public function getTsrCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTsrCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
     * Summary: 可信时间凭证服务 - 获取时间凭证证书.
     *
     * @param GetTsrCertificateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetTsrCertificateResponse
     */
    public function getTsrCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTsrCertificateResponse::fromMap($this->doRequest('1.0', 'twc.notary.tsr.certificate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
     * Summary: 联合执行履行记录新增/修改接口.
     *
     * @param SaveJointconstraintRecordRequest $request
     *
     * @return SaveJointconstraintRecordResponse
     */
    public function saveJointconstraintRecord($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveJointconstraintRecordEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
     * Summary: 联合执行履行记录新增/修改接口.
     *
     * @param SaveJointconstraintRecordRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SaveJointconstraintRecordResponse
     */
    public function saveJointconstraintRecordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveJointconstraintRecordResponse::fromMap($this->doRequest('1.0', 'twc.notary.jointconstraint.record.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除履行记录
     * Summary: 履行记录删除接口.
     *
     * @param DeleteJointconstraintRecordRequest $request
     *
     * @return DeleteJointconstraintRecordResponse
     */
    public function deleteJointconstraintRecord($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteJointconstraintRecordEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除履行记录
     * Summary: 履行记录删除接口.
     *
     * @param DeleteJointconstraintRecordRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DeleteJointconstraintRecordResponse
     */
    public function deleteJointconstraintRecordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteJointconstraintRecordResponse::fromMap($this->doRequest('1.0', 'twc.notary.jointconstraint.record.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询违约记录
     * Summary: 违约记录查询接口.
     *
     * @param QueryJointconstraintBreachrecordRequest $request
     *
     * @return QueryJointconstraintBreachrecordResponse
     */
    public function queryJointconstraintBreachrecord($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryJointconstraintBreachrecordEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询违约记录
     * Summary: 违约记录查询接口.
     *
     * @param QueryJointconstraintBreachrecordRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryJointconstraintBreachrecordResponse
     */
    public function queryJointconstraintBreachrecordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryJointconstraintBreachrecordResponse::fromMap($this->doRequest('1.0', 'twc.notary.jointconstraint.breachrecord.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供给第三方调解申请提交
     * Summary: 调解申请.
     *
     * @param ApplyJusticeMediationRequest $request
     *
     * @return ApplyJusticeMediationResponse
     */
    public function applyJusticeMediation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyJusticeMediationEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给第三方调解申请提交
     * Summary: 调解申请.
     *
     * @param ApplyJusticeMediationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ApplyJusticeMediationResponse
     */
    public function applyJusticeMediationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyJusticeMediationResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.mediation.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调解申请进度查询
     * Summary: 调解申请进度查询.
     *
     * @param QueryJusticeMediationRequest $request
     *
     * @return QueryJusticeMediationResponse
     */
    public function queryJusticeMediation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryJusticeMediationEx($request, $headers, $runtime);
    }

    /**
     * Description: 调解申请进度查询
     * Summary: 调解申请进度查询.
     *
     * @param QueryJusticeMediationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryJusticeMediationResponse
     */
    public function queryJusticeMediationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryJusticeMediationResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.mediation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁平台isv模式代理商户入驻
     * Summary: 租赁平台isv模式代理商户入驻.
     *
     * @param CreateLeaseAssetagentregisterRequest $request
     *
     * @return CreateLeaseAssetagentregisterResponse
     */
    public function createLeaseAssetagentregister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseAssetagentregisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁平台isv模式代理商户入驻
     * Summary: 租赁平台isv模式代理商户入驻.
     *
     * @param CreateLeaseAssetagentregisterRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateLeaseAssetagentregisterResponse
     */
    public function createLeaseAssetagentregisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseAssetagentregisterResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.assetagentregister.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁商品信息查询接口
     * Summary: 融资租赁商品信息查询接口.
     *
     * @param QueryLeaseProductinfoRequest $request
     *
     * @return QueryLeaseProductinfoResponse
     */
    public function queryLeaseProductinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseProductinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁商品信息查询接口
     * Summary: 融资租赁商品信息查询接口.
     *
     * @param QueryLeaseProductinfoRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryLeaseProductinfoResponse
     */
    public function queryLeaseProductinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseProductinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.productinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建签署见证流程
     * Summary: 创建见证流程.
     *
     * @param CreateWitnessFlowRequest $request
     *
     * @return CreateWitnessFlowResponse
     */
    public function createWitnessFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWitnessFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建签署见证流程
     * Summary: 创建见证流程.
     *
     * @param CreateWitnessFlowRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateWitnessFlowResponse
     */
    public function createWitnessFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWitnessFlowResponse::fromMap($this->doRequest('1.0', 'twc.notary.witness.flow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存见证流程快照数据
     * Summary: 保存见证流程快照数据.
     *
     * @param SaveWitnessSnapshotRequest $request
     *
     * @return SaveWitnessSnapshotResponse
     */
    public function saveWitnessSnapshot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveWitnessSnapshotEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存见证流程快照数据
     * Summary: 保存见证流程快照数据.
     *
     * @param SaveWitnessSnapshotRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SaveWitnessSnapshotResponse
     */
    public function saveWitnessSnapshotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveWitnessSnapshotResponse::fromMap($this->doRequest('1.0', 'twc.notary.witness.snapshot.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 见证流程签署权限校验
     * Summary: 见证流程签署权限校验.
     *
     * @param CheckWitnessSignaccessRequest $request
     *
     * @return CheckWitnessSignaccessResponse
     */
    public function checkWitnessSignaccess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkWitnessSignaccessEx($request, $headers, $runtime);
    }

    /**
     * Description: 见证流程签署权限校验
     * Summary: 见证流程签署权限校验.
     *
     * @param CheckWitnessSignaccessRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CheckWitnessSignaccessResponse
     */
    public function checkWitnessSignaccessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckWitnessSignaccessResponse::fromMap($this->doRequest('1.0', 'twc.notary.witness.signaccess.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 见证流程签署
     * Summary: 见证流程签署.
     *
     * @param AuthWitnessFlowRequest $request
     *
     * @return AuthWitnessFlowResponse
     */
    public function authWitnessFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authWitnessFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 见证流程签署
     * Summary: 见证流程签署.
     *
     * @param AuthWitnessFlowRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AuthWitnessFlowResponse
     */
    public function authWitnessFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthWitnessFlowResponse::fromMap($this->doRequest('1.0', 'twc.notary.witness.flow.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 见证流程签署确认
     * Summary: 见证流程签署确认.
     *
     * @param ConfirmWitnessFlowRequest $request
     *
     * @return ConfirmWitnessFlowResponse
     */
    public function confirmWitnessFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmWitnessFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 见证流程签署确认
     * Summary: 见证流程签署确认.
     *
     * @param ConfirmWitnessFlowRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ConfirmWitnessFlowResponse
     */
    public function confirmWitnessFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmWitnessFlowResponse::fromMap($this->doRequest('1.0', 'twc.notary.witness.flow.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取存证事务ID
     * Summary: 获取存证事务ID.
     *
     * @param CreateTransRequest $request
     *
     * @return CreateTransResponse
     */
    public function createTrans($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTransEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取存证事务ID
     * Summary: 获取存证事务ID.
     *
     * @param CreateTransRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CreateTransResponse
     */
    public function createTransEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTransResponse::fromMap($this->doRequest('1.0', 'twc.notary.trans.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息.
     *
     * @param GetTransRequest $request
     *
     * @return GetTransResponse
     */
    public function getTrans($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTransEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息.
     *
     * @param GetTransRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return GetTransResponse
     */
    public function getTransEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTransResponse::fromMap($this->doRequest('1.0', 'twc.notary.trans.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链.
     *
     * @param CreateTextRequest $request
     *
     * @return CreateTextResponse
     */
    public function createText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链.
     *
     * @param CreateTextRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateTextResponse
     */
    public function createTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.text.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容.
     *
     * @param GetTextRequest $request
     *
     * @return GetTextResponse
     */
    public function getText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容.
     *
     * @param GetTextRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetTextResponse
     */
    public function getTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.text.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链.
     *
     * @param CreateFileRequest $request
     *
     * @return CreateFileResponse
     */
    public function createFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链.
     *
     * @param CreateFileRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateFileResponse
     */
    public function createFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFileResponse::fromMap($this->doRequest('1.0', 'twc.notary.file.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址
     *
     * @param GetFileRequest $request
     *
     * @return GetFileResponse
     */
    public function getFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址
     *
     * @param GetFileRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetFileResponse
     */
    public function getFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFileResponse::fromMap($this->doRequest('1.0', 'twc.notary.file.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证
     *
     * @param CreateSourceRequest $request
     *
     * @return CreateSourceResponse
     */
    public function createSource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证
     *
     * @param CreateSourceRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateSourceResponse
     */
    public function createSourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSourceResponse::fromMap($this->doRequest('1.0', 'twc.notary.source.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址
     *
     * @param GetSourceRequest $request
     *
     * @return GetSourceResponse
     */
    public function getSource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址
     *
     * @param GetSourceRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return GetSourceResponse
     */
    public function getSourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSourceResponse::fromMap($this->doRequest('1.0', 'twc.notary.source.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建存证后，使用存证凭据核验存证状态。
     * Summary: 存证内容核验.
     *
     * @param CheckStatusRequest $request
     *
     * @return CheckStatusResponse
     */
    public function checkStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建存证后，使用存证凭据核验存证状态。
     * Summary: 存证内容核验.
     *
     * @param CheckStatusRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CheckStatusResponse
     */
    public function checkStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckStatusResponse::fromMap($this->doRequest('1.0', 'twc.notary.status.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资服务平台部署合约
     * Summary: 融资服务平台部署合约.
     *
     * @param DeployLeaseContractRequest $request
     *
     * @return DeployLeaseContractResponse
     */
    public function deployLeaseContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deployLeaseContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资服务平台部署合约
     * Summary: 融资服务平台部署合约.
     *
     * @param DeployLeaseContractRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeployLeaseContractResponse
     */
    public function deployLeaseContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeployLeaseContractResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.contract.deploy', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资服务平台上传商品类别信息
     * Summary: 融资服务平台上传商品类别信息.
     *
     * @param CreateLeaseProductinfoRequest $request
     *
     * @return CreateLeaseProductinfoResponse
     */
    public function createLeaseProductinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseProductinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资服务平台上传商品类别信息
     * Summary: 融资服务平台上传商品类别信息.
     *
     * @param CreateLeaseProductinfoRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateLeaseProductinfoResponse
     */
    public function createLeaseProductinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseProductinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.productinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁服务平台授权融资服务平台
     * Summary: 租赁服务平台授权融资服务平台.
     *
     * @param AuthLeaseContractRequest $request
     *
     * @return AuthLeaseContractResponse
     */
    public function authLeaseContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authLeaseContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁服务平台授权融资服务平台
     * Summary: 租赁服务平台授权融资服务平台.
     *
     * @param AuthLeaseContractRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AuthLeaseContractResponse
     */
    public function authLeaseContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthLeaseContractResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.contract.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁服务平台上传用户信息
     * Summary: 租赁服务平台上传用户信息.
     *
     * @param CreateLeaseUserinfoRequest $request
     *
     * @return CreateLeaseUserinfoResponse
     */
    public function createLeaseUserinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseUserinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁服务平台上传用户信息
     * Summary: 租赁服务平台上传用户信息.
     *
     * @param CreateLeaseUserinfoRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateLeaseUserinfoResponse
     */
    public function createLeaseUserinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseUserinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.userinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁服务平台上传订单产品/服务信息
     * Summary: 租赁服务平台上传订单产品/服务信息.
     *
     * @param CreateLeaseOrderinfoRequest $request
     *
     * @return CreateLeaseOrderinfoResponse
     */
    public function createLeaseOrderinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseOrderinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁服务平台上传订单产品/服务信息
     * Summary: 租赁服务平台上传订单产品/服务信息.
     *
     * @param CreateLeaseOrderinfoRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateLeaseOrderinfoResponse
     */
    public function createLeaseOrderinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseOrderinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.orderinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁服务平台上传承诺信息
     * Summary: 租赁服务平台上传承诺信息.
     *
     * @param CreateLeasePromiseRequest $request
     *
     * @return CreateLeasePromiseResponse
     */
    public function createLeasePromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeasePromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁服务平台上传承诺信息
     * Summary: 租赁服务平台上传承诺信息.
     *
     * @param CreateLeasePromiseRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateLeasePromiseResponse
     */
    public function createLeasePromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeasePromiseResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.promise.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资平台上传租赁物购买贷款订单信息
     * Summary: 融资平台上传租赁物购买贷款订单信息.
     *
     * @param CreateLeaseVerifyinfoRequest $request
     *
     * @return CreateLeaseVerifyinfoResponse
     */
    public function createLeaseVerifyinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseVerifyinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资平台上传租赁物购买贷款订单信息
     * Summary: 融资平台上传租赁物购买贷款订单信息.
     *
     * @param CreateLeaseVerifyinfoRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateLeaseVerifyinfoResponse
     */
    public function createLeaseVerifyinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseVerifyinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.verifyinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资方上传承诺信息
     * Summary: 融资方上传承诺信息.
     *
     * @param CreateLeaseCreditpromiseRequest $request
     *
     * @return CreateLeaseCreditpromiseResponse
     */
    public function createLeaseCreditpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseCreditpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资方上传承诺信息
     * Summary: 融资方上传承诺信息.
     *
     * @param CreateLeaseCreditpromiseRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateLeaseCreditpromiseResponse
     */
    public function createLeaseCreditpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseCreditpromiseResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.creditpromise.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁平台上传支用/还款信息
     * Summary: 租赁平台上传支用/还款信息.
     *
     * @param CreateLeaseDisburseinfoRequest $request
     *
     * @return CreateLeaseDisburseinfoResponse
     */
    public function createLeaseDisburseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseDisburseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁平台上传支用/还款信息
     * Summary: 租赁平台上传支用/还款信息.
     *
     * @param CreateLeaseDisburseinfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateLeaseDisburseinfoResponse
     */
    public function createLeaseDisburseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseDisburseinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.disburseinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  查询订单详细信息
     * Summary:  查询订单详细信息.
     *
     * @param QueryLeaseOrderinfoRequest $request
     *
     * @return QueryLeaseOrderinfoResponse
     */
    public function queryLeaseOrderinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseOrderinfoEx($request, $headers, $runtime);
    }

    /**
     * Description:  查询订单详细信息
     * Summary:  查询订单详细信息.
     *
     * @param QueryLeaseOrderinfoRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryLeaseOrderinfoResponse
     */
    public function queryLeaseOrderinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseOrderinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.orderinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建金融行业标准文本存证
     * Summary: 创建金融行业文本存证
     *
     * @param CreateFinanceTextnotaryRequest $request
     *
     * @return CreateFinanceTextnotaryResponse
     */
    public function createFinanceTextnotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFinanceTextnotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建金融行业标准文本存证
     * Summary: 创建金融行业文本存证
     *
     * @param CreateFinanceTextnotaryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateFinanceTextnotaryResponse
     */
    public function createFinanceTextnotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFinanceTextnotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.finance.textnotary.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取金融行业文本存证接口描述
     * Summary: 获取金融行业文本存证
     *
     * @param GetFinanceTextnotaryRequest $request
     *
     * @return GetFinanceTextnotaryResponse
     */
    public function getFinanceTextnotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFinanceTextnotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取金融行业文本存证接口描述
     * Summary: 获取金融行业文本存证
     *
     * @param GetFinanceTextnotaryRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetFinanceTextnotaryResponse
     */
    public function getFinanceTextnotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFinanceTextnotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.finance.textnotary.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建金融行业文件存证接口描述
     * Summary: 创建金融行业文件存证
     *
     * @param CreateFinanceFilenotaryRequest $request
     *
     * @return CreateFinanceFilenotaryResponse
     */
    public function createFinanceFilenotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFinanceFilenotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建金融行业文件存证接口描述
     * Summary: 创建金融行业文件存证
     *
     * @param CreateFinanceFilenotaryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateFinanceFilenotaryResponse
     */
    public function createFinanceFilenotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFinanceFilenotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.finance.filenotary.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取金融行业文件存证接口描述
     * Summary: 获取金融行业文件存证
     *
     * @param GetFinanceFilenotaryRequest $request
     *
     * @return GetFinanceFilenotaryResponse
     */
    public function getFinanceFilenotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFinanceFilenotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取金融行业文件存证接口描述
     * Summary: 获取金融行业文件存证
     *
     * @param GetFinanceFilenotaryRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetFinanceFilenotaryResponse
     */
    public function getFinanceFilenotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFinanceFilenotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.finance.filenotary.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 统一存证核验接口
     * Summary: 统一存证核验接口（已下架）.
     *
     * @param CheckIndustryNotaryRequest $request
     *
     * @return CheckIndustryNotaryResponse
     */
    public function checkIndustryNotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkIndustryNotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 统一存证核验接口
     * Summary: 统一存证核验接口（已下架）.
     *
     * @param CheckIndustryNotaryRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CheckIndustryNotaryResponse
     */
    public function checkIndustryNotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckIndustryNotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.industry.notary.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 升级融资租赁合约
     * Summary: 升级融资租赁合约.
     *
     * @param UpdateLeaseContractRequest $request
     *
     * @return UpdateLeaseContractResponse
     */
    public function updateLeaseContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLeaseContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 升级融资租赁合约
     * Summary: 升级融资租赁合约.
     *
     * @param UpdateLeaseContractRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateLeaseContractResponse
     */
    public function updateLeaseContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLeaseContractResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.contract.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 违约案件信息提交服务
     * Summary: 违约案件信息提交服务
     *
     * @param CreateSueBreakpromiseinfoRequest $request
     *
     * @return CreateSueBreakpromiseinfoResponse
     */
    public function createSueBreakpromiseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSueBreakpromiseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 违约案件信息提交服务
     * Summary: 违约案件信息提交服务
     *
     * @param CreateSueBreakpromiseinfoRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateSueBreakpromiseinfoResponse
     */
    public function createSueBreakpromiseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSueBreakpromiseinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.sue.breakpromiseinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 违约案件信息修改服务
     * Summary: 违约案件信息修改服务
     *
     * @param UpdateSueBreakpromiseinfoRequest $request
     *
     * @return UpdateSueBreakpromiseinfoResponse
     */
    public function updateSueBreakpromiseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSueBreakpromiseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 违约案件信息修改服务
     * Summary: 违约案件信息修改服务
     *
     * @param UpdateSueBreakpromiseinfoRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateSueBreakpromiseinfoResponse
     */
    public function updateSueBreakpromiseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSueBreakpromiseinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.sue.breakpromiseinfo.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 违约案件信息删除服务
     * Summary: 违约案件信息删除服务
     *
     * @param DeleteSueBreakpromiseinfoRequest $request
     *
     * @return DeleteSueBreakpromiseinfoResponse
     */
    public function deleteSueBreakpromiseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSueBreakpromiseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 违约案件信息删除服务
     * Summary: 违约案件信息删除服务
     *
     * @param DeleteSueBreakpromiseinfoRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DeleteSueBreakpromiseinfoResponse
     */
    public function deleteSueBreakpromiseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSueBreakpromiseinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.sue.breakpromiseinfo.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询惩戒信息
     * Summary: 查询惩戒信息.
     *
     * @param QuerySueUserinfoRequest $request
     *
     * @return QuerySueUserinfoResponse
     */
    public function querySueUserinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySueUserinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询惩戒信息
     * Summary: 查询惩戒信息.
     *
     * @param QuerySueUserinfoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QuerySueUserinfoResponse
     */
    public function querySueUserinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySueUserinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.sue.userinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 升级用户管理合约
     * Summary: 升级用户管理合约.
     *
     * @param UpdateSueExeplarycontractRequest $request
     *
     * @return UpdateSueExeplarycontractResponse
     */
    public function updateSueExeplarycontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSueExeplarycontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 升级用户管理合约
     * Summary: 升级用户管理合约.
     *
     * @param UpdateSueExeplarycontractRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateSueExeplarycontractResponse
     */
    public function updateSueExeplarycontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSueExeplarycontractResponse::fromMap($this->doRequest('1.0', 'twc.notary.sue.exeplarycontract.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 回退用户管理合约
     * Summary: 回退用户管理合约.
     *
     * @param UpdateSueExemplaryrevertRequest $request
     *
     * @return UpdateSueExemplaryrevertResponse
     */
    public function updateSueExemplaryrevert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSueExemplaryrevertEx($request, $headers, $runtime);
    }

    /**
     * Description: 回退用户管理合约
     * Summary: 回退用户管理合约.
     *
     * @param UpdateSueExemplaryrevertRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateSueExemplaryrevertResponse
     */
    public function updateSueExemplaryrevertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSueExemplaryrevertResponse::fromMap($this->doRequest('1.0', 'twc.notary.sue.exemplaryrevert.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资平台审核订单信息
     * Summary: 融资平台审核订单信息.
     *
     * @param CreateLeaseAuditRequest $request
     *
     * @return CreateLeaseAuditResponse
     */
    public function createLeaseAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资平台审核订单信息
     * Summary: 融资平台审核订单信息.
     *
     * @param CreateLeaseAuditRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateLeaseAuditResponse
     */
    public function createLeaseAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseAuditResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.audit.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁平台上传付款通知信息
     * Summary: 租赁平台上传付款通知信息.
     *
     * @param CreateLeasePaymentfileRequest $request
     *
     * @return CreateLeasePaymentfileResponse
     */
    public function createLeasePaymentfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeasePaymentfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁平台上传付款通知信息
     * Summary: 租赁平台上传付款通知信息.
     *
     * @param CreateLeasePaymentfileRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateLeasePaymentfileResponse
     */
    public function createLeasePaymentfileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeasePaymentfileResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.paymentfile.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁系统上传租金归还记录 分期调用
     * Summary: 租赁系统上传租金归还记录 分期调用.
     *
     * @param CreateLeaseRentalRequest $request
     *
     * @return CreateLeaseRentalResponse
     */
    public function createLeaseRental($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseRentalEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁系统上传租金归还记录 分期调用
     * Summary: 租赁系统上传租金归还记录 分期调用.
     *
     * @param CreateLeaseRentalRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateLeaseRentalResponse
     */
    public function createLeaseRentalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseRentalResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.rental.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 清分服务机构上传资金清算记录，分期
     * Summary: 清分服务机构上传资金清算记录，分期
     *
     * @param CreateLeaseClearingRequest $request
     *
     * @return CreateLeaseClearingResponse
     */
    public function createLeaseClearing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseClearingEx($request, $headers, $runtime);
    }

    /**
     * Description: 清分服务机构上传资金清算记录，分期
     * Summary: 清分服务机构上传资金清算记录，分期
     *
     * @param CreateLeaseClearingRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateLeaseClearingResponse
     */
    public function createLeaseClearingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseClearingResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.clearing.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资金融机构上传还款信息 每期
     * Summary: 融资金融机构上传还款信息 每期
     *
     * @param CreateLeaseRepaymentRequest $request
     *
     * @return CreateLeaseRepaymentResponse
     */
    public function createLeaseRepayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseRepaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资金融机构上传还款信息 每期
     * Summary: 融资金融机构上传还款信息 每期
     *
     * @param CreateLeaseRepaymentRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateLeaseRepaymentResponse
     */
    public function createLeaseRepaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseRepaymentResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.repayment.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁通知系统注册
     * Summary: 融资租赁通知系统注册.
     *
     * @param CreateLeaseNotifyregisterRequest $request
     *
     * @return CreateLeaseNotifyregisterResponse
     */
    public function createLeaseNotifyregister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseNotifyregisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁通知系统注册
     * Summary: 融资租赁通知系统注册.
     *
     * @param CreateLeaseNotifyregisterRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateLeaseNotifyregisterResponse
     */
    public function createLeaseNotifyregisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseNotifyregisterResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.notifyregister.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据imeiID查询iot设备的详情
     * Summary: 根据imeiID查询iot设备的详情.
     *
     * @param QueryLeaseIotinfoRequest $request
     *
     * @return QueryLeaseIotinfoResponse
     */
    public function queryLeaseIotinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseIotinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据imeiID查询iot设备的详情
     * Summary: 根据imeiID查询iot设备的详情.
     *
     * @param QueryLeaseIotinfoRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryLeaseIotinfoResponse
     */
    public function queryLeaseIotinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseIotinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.iotinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建法院通用文本存证
     * Summary: 法院通用文本存证创建接口.
     *
     * @param CreateCourtTextnotaryRequest $request
     *
     * @return CreateCourtTextnotaryResponse
     */
    public function createCourtTextnotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCourtTextnotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建法院通用文本存证
     * Summary: 法院通用文本存证创建接口.
     *
     * @param CreateCourtTextnotaryRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateCourtTextnotaryResponse
     */
    public function createCourtTextnotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCourtTextnotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.court.textnotary.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取法院通用文本存证
     * Summary: 法院通用文本存证获取接口.
     *
     * @param GetCourtTextnotaryRequest $request
     *
     * @return GetCourtTextnotaryResponse
     */
    public function getCourtTextnotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCourtTextnotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取法院通用文本存证
     * Summary: 法院通用文本存证获取接口.
     *
     * @param GetCourtTextnotaryRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetCourtTextnotaryResponse
     */
    public function getCourtTextnotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCourtTextnotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.court.textnotary.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建法院通用文件存证接口
     * Summary: 法院通用文件存证创建接口.
     *
     * @param CreateCourtFilenotaryRequest $request
     *
     * @return CreateCourtFilenotaryResponse
     */
    public function createCourtFilenotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCourtFilenotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建法院通用文件存证接口
     * Summary: 法院通用文件存证创建接口.
     *
     * @param CreateCourtFilenotaryRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateCourtFilenotaryResponse
     */
    public function createCourtFilenotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCourtFilenotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.court.filenotary.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取法院通用文件存证
     * Summary: 法院通用文件存证获取接口.
     *
     * @param GetCourtFilenotaryRequest $request
     *
     * @return GetCourtFilenotaryResponse
     */
    public function getCourtFilenotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCourtFilenotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取法院通用文件存证
     * Summary: 法院通用文件存证获取接口.
     *
     * @param GetCourtFilenotaryRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetCourtFilenotaryResponse
     */
    public function getCourtFilenotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCourtFilenotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.court.filenotary.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁定制化统一入口
     * Summary: 融资租赁定制化统一入口.
     *
     * @param CreateLeaseRouteRequest $request
     *
     * @return CreateLeaseRouteResponse
     */
    public function createLeaseRoute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseRouteEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁定制化统一入口
     * Summary: 融资租赁定制化统一入口.
     *
     * @param CreateLeaseRouteRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateLeaseRouteResponse
     */
    public function createLeaseRouteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseRouteResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.route.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
     * Summary: 查询用户等加密信息.
     *
     * @param QueryLeaseEncryptedinfoRequest $request
     *
     * @return QueryLeaseEncryptedinfoResponse
     */
    public function queryLeaseEncryptedinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseEncryptedinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
     * Summary: 查询用户等加密信息.
     *
     * @param QueryLeaseEncryptedinfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryLeaseEncryptedinfoResponse
     */
    public function queryLeaseEncryptedinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseEncryptedinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.encryptedinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子合同文本存证
     * Summary: 电子合同文本存证
     *
     * @param CreateContractTextRequest $request
     *
     * @return CreateContractTextResponse
     */
    public function createContractText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同文本存证
     * Summary: 电子合同文本存证
     *
     * @param CreateContractTextRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateContractTextResponse
     */
    public function createContractTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.text.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
     * Summary: 申请电子合同存证报告.
     *
     * @param ApplyContractReportRequest $request
     *
     * @return ApplyContractReportResponse
     */
    public function applyContractReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyContractReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
     * Summary: 申请电子合同存证报告.
     *
     * @param ApplyContractReportRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ApplyContractReportResponse
     */
    public function applyContractReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyContractReportResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.report.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
     * Summary: 下载合同存证
     *
     * @param GetContractTextRequest $request
     *
     * @return GetContractTextResponse
     */
    public function getContractText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContractTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
     * Summary: 下载合同存证
     *
     * @param GetContractTextRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetContractTextResponse
     */
    public function getContractTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContractTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.text.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取存证事务ID内部接口
     * Summary: 获取存证事务ID内部接口.
     *
     * @param CreateInternalTransRequest $request
     *
     * @return CreateInternalTransResponse
     */
    public function createInternalTrans($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInternalTransEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取存证事务ID内部接口
     * Summary: 获取存证事务ID内部接口.
     *
     * @param CreateInternalTransRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateInternalTransResponse
     */
    public function createInternalTransEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInternalTransResponse::fromMap($this->doRequest('1.0', 'twc.notary.internal.trans.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本存证内部接口，将文本内容存证上链
     * Summary: 文本存证内部接口，将文本内容存证上链.
     *
     * @param CreateInternalTextRequest $request
     *
     * @return CreateInternalTextResponse
     */
    public function createInternalText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInternalTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本存证内部接口，将文本内容存证上链
     * Summary: 文本存证内部接口，将文本内容存证上链.
     *
     * @param CreateInternalTextRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateInternalTextResponse
     */
    public function createInternalTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInternalTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.internal.text.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
     * Summary: 租赁业务文本存证，将文本内容存证上链.
     *
     * @param CreateLeaseTextRequest $request
     *
     * @return CreateLeaseTextResponse
     */
    public function createLeaseText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
     * Summary: 租赁业务文本存证，将文本内容存证上链.
     *
     * @param CreateLeaseTextRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateLeaseTextResponse
     */
    public function createLeaseTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.text.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
     * Summary: 租赁业务文件内容存证上链.
     *
     * @param CreateLeaseFileRequest $request
     *
     * @return CreateLeaseFileResponse
     */
    public function createLeaseFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
     * Summary: 租赁业务文件内容存证上链.
     *
     * @param CreateLeaseFileRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateLeaseFileResponse
     */
    public function createLeaseFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseFileResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.file.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
     * Summary: 租赁业务获取订单存证列表.
     *
     * @param ListLeaseNotaryRequest $request
     *
     * @return ListLeaseNotaryResponse
     */
    public function listLeaseNotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listLeaseNotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
     * Summary: 租赁业务获取订单存证列表.
     *
     * @param ListLeaseNotaryRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListLeaseNotaryResponse
     */
    public function listLeaseNotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListLeaseNotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.notary.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询融资租赁application
     * Summary: 查询融资租赁application.
     *
     * @param QueryLeaseApplicationRequest $request
     *
     * @return QueryLeaseApplicationResponse
     */
    public function queryLeaseApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询融资租赁application
     * Summary: 查询融资租赁application.
     *
     * @param QueryLeaseApplicationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryLeaseApplicationResponse
     */
    public function queryLeaseApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseApplicationResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.application.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询融资租赁application的定义详情
     * Summary: 查询application的定义详情.
     *
     * @param QueryLeaseApplicationdetailinfoRequest $request
     *
     * @return QueryLeaseApplicationdetailinfoResponse
     */
    public function queryLeaseApplicationdetailinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseApplicationdetailinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询融资租赁application的定义详情
     * Summary: 查询application的定义详情.
     *
     * @param QueryLeaseApplicationdetailinfoRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryLeaseApplicationdetailinfoResponse
     */
    public function queryLeaseApplicationdetailinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseApplicationdetailinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.applicationdetailinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁资方重置订单状态
     * Summary: 融资租赁资方重置订单状态
     *
     * @param SetLeaseRepaymentstatusRequest $request
     *
     * @return SetLeaseRepaymentstatusResponse
     */
    public function setLeaseRepaymentstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setLeaseRepaymentstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁资方重置订单状态
     * Summary: 融资租赁资方重置订单状态
     *
     * @param SetLeaseRepaymentstatusRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SetLeaseRepaymentstatusResponse
     */
    public function setLeaseRepaymentstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetLeaseRepaymentstatusResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.repaymentstatus.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 供应商上传采购等相关信息
     * Summary: 供应商上传采购等相关信息.
     *
     * @param CreateLeaseSupplierinfoRequest $request
     *
     * @return CreateLeaseSupplierinfoResponse
     */
    public function createLeaseSupplierinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseSupplierinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 供应商上传采购等相关信息
     * Summary: 供应商上传采购等相关信息.
     *
     * @param CreateLeaseSupplierinfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateLeaseSupplierinfoResponse
     */
    public function createLeaseSupplierinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseSupplierinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.supplierinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: mytf的tapp部署
     * Summary: mytf的tapp部署.
     *
     * @param DeployMytfTappRequest $request
     *
     * @return DeployMytfTappResponse
     */
    public function deployMytfTapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deployMytfTappEx($request, $headers, $runtime);
    }

    /**
     * Description: mytf的tapp部署
     * Summary: mytf的tapp部署.
     *
     * @param DeployMytfTappRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeployMytfTappResponse
     */
    public function deployMytfTappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeployMytfTappResponse::fromMap($this->doRequest('1.0', 'twc.notary.mytf.tapp.deploy', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 供应商更新物流状态、签收记录等信息
     * Summary: 供应商更新物流状态、签收记录等信息.
     *
     * @param CreateLeaseSupplierdynamicinfoRequest $request
     *
     * @return CreateLeaseSupplierdynamicinfoResponse
     */
    public function createLeaseSupplierdynamicinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseSupplierdynamicinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 供应商更新物流状态、签收记录等信息
     * Summary: 供应商更新物流状态、签收记录等信息.
     *
     * @param CreateLeaseSupplierdynamicinfoRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CreateLeaseSupplierdynamicinfoResponse
     */
    public function createLeaseSupplierdynamicinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseSupplierdynamicinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.supplierdynamicinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建租赁订单相关信息，融资租赁的前置条件
     * Summary: 创建租赁订单相关信息，融资租赁的前置条件.
     *
     * @param CreateLeaseBizRequest $request
     *
     * @return CreateLeaseBizResponse
     */
    public function createLeaseBiz($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseBizEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建租赁订单相关信息，融资租赁的前置条件
     * Summary: 创建租赁订单相关信息，融资租赁的前置条件.
     *
     * @param CreateLeaseBizRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateLeaseBizResponse
     */
    public function createLeaseBizEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseBizResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.biz.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询核验结果
     * Summary: 查询核验结果.
     *
     * @param QueryLeaseProofRequest $request
     *
     * @return QueryLeaseProofResponse
     */
    public function queryLeaseProof($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseProofEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询核验结果
     * Summary: 查询核验结果.
     *
     * @param QueryLeaseProofRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryLeaseProofResponse
     */
    public function queryLeaseProofEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseProofResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.proof.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
     * Summary: 大文件内容存证接口.
     *
     * @param CreateLargefileRequest $request
     *
     * @return CreateLargefileResponse
     */
    public function createLargefile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLargefileEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
     * Summary: 大文件内容存证接口.
     *
     * @param CreateLargefileRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateLargefileResponse
     */
    public function createLargefileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLargefileResponse::fromMap($this->doRequest('1.0', 'twc.notary.largefile.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁平台查询接口
     * Summary: 租赁平台查询接口.
     *
     * @param QueryLeaseBizRequest $request
     *
     * @return QueryLeaseBizResponse
     */
    public function queryLeaseBiz($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseBizEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁平台查询接口
     * Summary: 租赁平台查询接口.
     *
     * @param QueryLeaseBizRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryLeaseBizResponse
     */
    public function queryLeaseBizEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseBizResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.biz.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁宝哈希存证
     * Summary: 租赁宝哈希存证
     *
     * @param CreateLeaseBiznotaryRequest $request
     *
     * @return CreateLeaseBiznotaryResponse
     */
    public function createLeaseBiznotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseBiznotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁宝哈希存证
     * Summary: 租赁宝哈希存证
     *
     * @param CreateLeaseBiznotaryRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateLeaseBiznotaryResponse
     */
    public function createLeaseBiznotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseBiznotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.biznotary.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合同内部文本存证
     * Summary: 合同内部文本存证
     *
     * @param CreateInternalContractRequest $request
     *
     * @return CreateInternalContractResponse
     */
    public function createInternalContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInternalContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 合同内部文本存证
     * Summary: 合同内部文本存证
     *
     * @param CreateInternalContractRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateInternalContractResponse
     */
    public function createInternalContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInternalContractResponse::fromMap($this->doRequest('1.0', 'twc.notary.internal.contract.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方上传网商直付通代扣协议核验结果
     * Summary: 资方上传网商直付通代扣协议核验结果.
     *
     * @param CreateLeaseZftagreementsignRequest $request
     *
     * @return CreateLeaseZftagreementsignResponse
     */
    public function createLeaseZftagreementsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseZftagreementsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方上传网商直付通代扣协议核验结果
     * Summary: 资方上传网商直付通代扣协议核验结果.
     *
     * @param CreateLeaseZftagreementsignRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateLeaseZftagreementsignResponse
     */
    public function createLeaseZftagreementsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseZftagreementsignResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.zftagreementsign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方上传网商直付通代扣协议解约相关信息
     * Summary: 资方上传网商直付通代扣协议解约相关信息.
     *
     * @param CreateLeaseZftagreementunsignRequest $request
     *
     * @return CreateLeaseZftagreementunsignResponse
     */
    public function createLeaseZftagreementunsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseZftagreementunsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方上传网商直付通代扣协议解约相关信息
     * Summary: 资方上传网商直付通代扣协议解约相关信息.
     *
     * @param CreateLeaseZftagreementunsignRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateLeaseZftagreementunsignResponse
     */
    public function createLeaseZftagreementunsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseZftagreementunsignResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.zftagreementunsign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取蚂蚁链版存证证明
     * Summary: 获取蚂蚁链版存证证明.
     *
     * @param GetCertificateDetailRequest $request
     *
     * @return GetCertificateDetailResponse
     */
    public function getCertificateDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCertificateDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取蚂蚁链版存证证明
     * Summary: 获取蚂蚁链版存证证明.
     *
     * @param GetCertificateDetailRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetCertificateDetailResponse
     */
    public function getCertificateDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCertificateDetailResponse::fromMap($this->doRequest('1.0', 'twc.notary.certificate.detail.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容.
     *
     * @param GetInternalTextRequest $request
     *
     * @return GetInternalTextResponse
     */
    public function getInternalText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInternalTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容.
     *
     * @param GetInternalTextRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetInternalTextResponse
     */
    public function getInternalTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInternalTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.internal.text.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方服务获取开通权限，标记开通状态。
     * Summary: 三方服务获取开通权限，标记开通状态。
     *
     * @param OpenInternalTwcRequest $request
     *
     * @return OpenInternalTwcResponse
     */
    public function openInternalTwc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openInternalTwcEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方服务获取开通权限，标记开通状态。
     * Summary: 三方服务获取开通权限，标记开通状态。
     *
     * @param OpenInternalTwcRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return OpenInternalTwcResponse
     */
    public function openInternalTwcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenInternalTwcResponse::fromMap($this->doRequest('1.0', 'twc.notary.internal.twc.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
