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
use AntChain\TWC\Models\AddBclLogisticinfoRequest;
use AntChain\TWC\Models\AddBclLogisticinfoResponse;
use AntChain\TWC\Models\AddContractDocumentRequest;
use AntChain\TWC\Models\AddContractDocumentResponse;
use AntChain\TWC\Models\AddContractFileRequest;
use AntChain\TWC\Models\AddContractFileResponse;
use AntChain\TWC\Models\AddContractPlatformsignfieldsRequest;
use AntChain\TWC\Models\AddContractPlatformsignfieldsResponse;
use AntChain\TWC\Models\AddContractSignfieldRequest;
use AntChain\TWC\Models\AddContractSignfieldResponse;
use AntChain\TWC\Models\ApplyBclFinancingRequest;
use AntChain\TWC\Models\ApplyBclFinancingResponse;
use AntChain\TWC\Models\ApplyContractCallbackkeyRequest;
use AntChain\TWC\Models\ApplyContractCallbackkeyResponse;
use AntChain\TWC\Models\ApplyContractMerchantRequest;
use AntChain\TWC\Models\ApplyContractMerchantResponse;
use AntChain\TWC\Models\ApplyContractReportRequest;
use AntChain\TWC\Models\ApplyContractReportResponse;
use AntChain\TWC\Models\ApplyDigitalcontentOrderRequest;
use AntChain\TWC\Models\ApplyDigitalcontentOrderResponse;
use AntChain\TWC\Models\ApplyFlowAuthRequest;
use AntChain\TWC\Models\ApplyFlowAuthResponse;
use AntChain\TWC\Models\ApplyFlowCertificateRequest;
use AntChain\TWC\Models\ApplyFlowCertificateResponse;
use AntChain\TWC\Models\ApplyFlowEvidenceRequest;
use AntChain\TWC\Models\ApplyFlowEvidenceResponse;
use AntChain\TWC\Models\ApplyJusticeMediationRequest;
use AntChain\TWC\Models\ApplyJusticeMediationResponse;
use AntChain\TWC\Models\ApplyLeaseSupplierorderRequest;
use AntChain\TWC\Models\ApplyLeaseSupplierorderResponse;
use AntChain\TWC\Models\ApplyPrivatecontractCertRequest;
use AntChain\TWC\Models\ApplyPrivatecontractCertResponse;
use AntChain\TWC\Models\ApplyStubCertificateRequest;
use AntChain\TWC\Models\ApplyStubCertificateResponse;
use AntChain\TWC\Models\AuthContractSignRequest;
use AntChain\TWC\Models\AuthContractSignResponse;
use AntChain\TWC\Models\AuthFileIntegrationRequest;
use AntChain\TWC\Models\AuthFileIntegrationResponse;
use AntChain\TWC\Models\AuthLeaseContractRequest;
use AntChain\TWC\Models\AuthLeaseContractResponse;
use AntChain\TWC\Models\AuthWitnessFlowRequest;
use AntChain\TWC\Models\AuthWitnessFlowResponse;
use AntChain\TWC\Models\BindContractMerchantRequest;
use AntChain\TWC\Models\BindContractMerchantResponse;
use AntChain\TWC\Models\CallbackArbitrationSignstatusRequest;
use AntChain\TWC\Models\CallbackArbitrationSignstatusResponse;
use AntChain\TWC\Models\CallbackArbitrationStatusRequest;
use AntChain\TWC\Models\CallbackArbitrationStatusResponse;
use AntChain\TWC\Models\CancelBclInsuranceRequest;
use AntChain\TWC\Models\CancelBclInsuranceResponse;
use AntChain\TWC\Models\CancelBclWithholdRequest;
use AntChain\TWC\Models\CancelBclWithholdResponse;
use AntChain\TWC\Models\CancelContractFlowRequest;
use AntChain\TWC\Models\CancelContractFlowResponse;
use AntChain\TWC\Models\CancelContractPaysingletradeRequest;
use AntChain\TWC\Models\CancelContractPaysingletradeResponse;
use AntChain\TWC\Models\CancelContractPaytradeRequest;
use AntChain\TWC\Models\CancelContractPaytradeResponse;
use AntChain\TWC\Models\CancelDataflowAuthorizeRequest;
use AntChain\TWC\Models\CancelDataflowAuthorizeResponse;
use AntChain\TWC\Models\CancelFileIntegrationRequest;
use AntChain\TWC\Models\CancelFileIntegrationResponse;
use AntChain\TWC\Models\CancelLeaseInsuranceRequest;
use AntChain\TWC\Models\CancelLeaseInsuranceResponse;
use AntChain\TWC\Models\CertifyEnterpriseFaceauthRequest;
use AntChain\TWC\Models\CertifyEnterpriseFaceauthResponse;
use AntChain\TWC\Models\CertifyIdentificationFaceauthRequest;
use AntChain\TWC\Models\CertifyIdentificationFaceauthResponse;
use AntChain\TWC\Models\CheckContractCourtdeductRequest;
use AntChain\TWC\Models\CheckContractCourtdeductResponse;
use AntChain\TWC\Models\CheckContractRequest;
use AntChain\TWC\Models\CheckContractResponse;
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
use AntChain\TWC\Models\CheckPrivatecontractProvisionRequest;
use AntChain\TWC\Models\CheckPrivatecontractProvisionResponse;
use AntChain\TWC\Models\CheckStatusRequest;
use AntChain\TWC\Models\CheckStatusResponse;
use AntChain\TWC\Models\CheckWitnessSignaccessRequest;
use AntChain\TWC\Models\CheckWitnessSignaccessResponse;
use AntChain\TWC\Models\ConfirmContractMerchantRequest;
use AntChain\TWC\Models\ConfirmContractMerchantResponse;
use AntChain\TWC\Models\ConfirmWitnessFlowRequest;
use AntChain\TWC\Models\ConfirmWitnessFlowResponse;
use AntChain\TWC\Models\CreateBclInsuranceRequest;
use AntChain\TWC\Models\CreateBclInsuranceResponse;
use AntChain\TWC\Models\CreateBclOrderRequest;
use AntChain\TWC\Models\CreateBclOrderResponse;
use AntChain\TWC\Models\CreateBclPayeeRequest;
use AntChain\TWC\Models\CreateBclPayeeResponse;
use AntChain\TWC\Models\CreateBclProductRequest;
use AntChain\TWC\Models\CreateBclProductResponse;
use AntChain\TWC\Models\CreateBclRefundRequest;
use AntChain\TWC\Models\CreateBclRefundResponse;
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
use AntChain\TWC\Models\CreateContractCourtdeductRequest;
use AntChain\TWC\Models\CreateContractCourtdeductResponse;
use AntChain\TWC\Models\CreateContractEncrypteduserRequest;
use AntChain\TWC\Models\CreateContractEncrypteduserResponse;
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
use AntChain\TWC\Models\CreateContractTaskRequest;
use AntChain\TWC\Models\CreateContractTaskResponse;
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
use AntChain\TWC\Models\CreateDataflowAccountRequest;
use AntChain\TWC\Models\CreateDataflowAccountResponse;
use AntChain\TWC\Models\CreateDataflowAuthorizeRequest;
use AntChain\TWC\Models\CreateDataflowAuthorizeResponse;
use AntChain\TWC\Models\CreateDataflowTextRequest;
use AntChain\TWC\Models\CreateDataflowTextResponse;
use AntChain\TWC\Models\CreateDataflowTransRequest;
use AntChain\TWC\Models\CreateDataflowTransResponse;
use AntChain\TWC\Models\CreateEcocontractTextRequest;
use AntChain\TWC\Models\CreateEcocontractTextResponse;
use AntChain\TWC\Models\CreateEcocontractTransRequest;
use AntChain\TWC\Models\CreateEcocontractTransResponse;
use AntChain\TWC\Models\CreateFileIntegrationRequest;
use AntChain\TWC\Models\CreateFileIntegrationResponse;
use AntChain\TWC\Models\CreateFileRequest;
use AntChain\TWC\Models\CreateFileResponse;
use AntChain\TWC\Models\CreateFinanceFilenotaryRequest;
use AntChain\TWC\Models\CreateFinanceFilenotaryResponse;
use AntChain\TWC\Models\CreateFinanceTextnotaryRequest;
use AntChain\TWC\Models\CreateFinanceTextnotaryResponse;
use AntChain\TWC\Models\CreateFlowInstanceRequest;
use AntChain\TWC\Models\CreateFlowInstanceResponse;
use AntChain\TWC\Models\CreateFlowOnestepnotaryRequest;
use AntChain\TWC\Models\CreateFlowOnestepnotaryResponse;
use AntChain\TWC\Models\CreateIdentificationRealpersonRequest;
use AntChain\TWC\Models\CreateIdentificationRealpersonResponse;
use AntChain\TWC\Models\CreateInternalContractRequest;
use AntChain\TWC\Models\CreateInternalContractResponse;
use AntChain\TWC\Models\CreateInternalFileRequest;
use AntChain\TWC\Models\CreateInternalFileResponse;
use AntChain\TWC\Models\CreateInternalTextRequest;
use AntChain\TWC\Models\CreateInternalTextResponse;
use AntChain\TWC\Models\CreateInternalTransRequest;
use AntChain\TWC\Models\CreateInternalTransResponse;
use AntChain\TWC\Models\CreateJusticeAgentcaseRequest;
use AntChain\TWC\Models\CreateJusticeAgentcaseResponse;
use AntChain\TWC\Models\CreateJusticeCasetemplateRequest;
use AntChain\TWC\Models\CreateJusticeCasetemplateResponse;
use AntChain\TWC\Models\CreateJusticeCasewritebackRequest;
use AntChain\TWC\Models\CreateJusticeCasewritebackResponse;
use AntChain\TWC\Models\CreateJusticeChaincaseRequest;
use AntChain\TWC\Models\CreateJusticeChaincaseResponse;
use AntChain\TWC\Models\CreateJusticeDocumenttemplateRequest;
use AntChain\TWC\Models\CreateJusticeDocumenttemplateResponse;
use AntChain\TWC\Models\CreateJusticeNormalcaseRequest;
use AntChain\TWC\Models\CreateJusticeNormalcaseResponse;
use AntChain\TWC\Models\CreateJusticeRightprotecttemplateRequest;
use AntChain\TWC\Models\CreateJusticeRightprotecttemplateResponse;
use AntChain\TWC\Models\CreateLargefileRequest;
use AntChain\TWC\Models\CreateLargefileResponse;
use AntChain\TWC\Models\CreateLeaseAssetagentregisterRequest;
use AntChain\TWC\Models\CreateLeaseAssetagentregisterResponse;
use AntChain\TWC\Models\CreateLeaseAsyncauditRequest;
use AntChain\TWC\Models\CreateLeaseAsyncauditResponse;
use AntChain\TWC\Models\CreateLeaseAsyncclearingRequest;
use AntChain\TWC\Models\CreateLeaseAsyncclearingResponse;
use AntChain\TWC\Models\CreateLeaseAsynccreditpromiseRequest;
use AntChain\TWC\Models\CreateLeaseAsynccreditpromiseResponse;
use AntChain\TWC\Models\CreateLeaseAsyncpaymentfileRequest;
use AntChain\TWC\Models\CreateLeaseAsyncpaymentfileResponse;
use AntChain\TWC\Models\CreateLeaseAsyncrepaymentRequest;
use AntChain\TWC\Models\CreateLeaseAsyncrepaymentResponse;
use AntChain\TWC\Models\CreateLeaseAsyncverifyinfoRequest;
use AntChain\TWC\Models\CreateLeaseAsyncverifyinfoResponse;
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
use AntChain\TWC\Models\CreateLeaseFinancecertifyRequest;
use AntChain\TWC\Models\CreateLeaseFinancecertifyResponse;
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
use AntChain\TWC\Models\CreateLeaseRiskRequest;
use AntChain\TWC\Models\CreateLeaseRiskResponse;
use AntChain\TWC\Models\CreateLeaseRouteRequest;
use AntChain\TWC\Models\CreateLeaseRouteResponse;
use AntChain\TWC\Models\CreateLeaseSupplierdynamicinfoRequest;
use AntChain\TWC\Models\CreateLeaseSupplierdynamicinfoResponse;
use AntChain\TWC\Models\CreateLeaseSupplierinfoRequest;
use AntChain\TWC\Models\CreateLeaseSupplierinfoResponse;
use AntChain\TWC\Models\CreateLeaseSupplierproductRequest;
use AntChain\TWC\Models\CreateLeaseSupplierproductResponse;
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
use AntChain\TWC\Models\CreatePrivatecontractTextRequest;
use AntChain\TWC\Models\CreatePrivatecontractTextResponse;
use AntChain\TWC\Models\CreatePrivatecontractTransRequest;
use AntChain\TWC\Models\CreatePrivatecontractTransResponse;
use AntChain\TWC\Models\CreateSourceRequest;
use AntChain\TWC\Models\CreateSourceResponse;
use AntChain\TWC\Models\CreateSpecifyTextRequest;
use AntChain\TWC\Models\CreateSpecifyTextResponse;
use AntChain\TWC\Models\CreateSpecifyTransRequest;
use AntChain\TWC\Models\CreateSpecifyTransResponse;
use AntChain\TWC\Models\CreateStubClearingRequest;
use AntChain\TWC\Models\CreateStubClearingResponse;
use AntChain\TWC\Models\CreateStubRequest;
use AntChain\TWC\Models\CreateStubResponse;
use AntChain\TWC\Models\CreateSueBreakpromiseinfoRequest;
use AntChain\TWC\Models\CreateSueBreakpromiseinfoResponse;
use AntChain\TWC\Models\CreateTextRequest;
use AntChain\TWC\Models\CreateTextResponse;
use AntChain\TWC\Models\CreateTrafficTraceidRequest;
use AntChain\TWC\Models\CreateTrafficTraceidResponse;
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
use AntChain\TWC\Models\DeleteContractSignfieldRequest;
use AntChain\TWC\Models\DeleteContractSignfieldResponse;
use AntChain\TWC\Models\DeleteJointconstraintRecordRequest;
use AntChain\TWC\Models\DeleteJointconstraintRecordResponse;
use AntChain\TWC\Models\DeleteSueBreakpromiseinfoRequest;
use AntChain\TWC\Models\DeleteSueBreakpromiseinfoResponse;
use AntChain\TWC\Models\DeployDataflowContractRequest;
use AntChain\TWC\Models\DeployDataflowContractResponse;
use AntChain\TWC\Models\DeployLeaseContractRequest;
use AntChain\TWC\Models\DeployLeaseContractResponse;
use AntChain\TWC\Models\DeployMytfTappRequest;
use AntChain\TWC\Models\DeployMytfTappResponse;
use AntChain\TWC\Models\DetailFlowInstanceRequest;
use AntChain\TWC\Models\DetailFlowInstanceResponse;
use AntChain\TWC\Models\DetailFlowPhaseRequest;
use AntChain\TWC\Models\DetailFlowPhaseResponse;
use AntChain\TWC\Models\DownloadContractDocumentRequest;
use AntChain\TWC\Models\DownloadContractDocumentResponse;
use AntChain\TWC\Models\DownloadJusticeCasefileRequest;
use AntChain\TWC\Models\DownloadJusticeCasefileResponse;
use AntChain\TWC\Models\ExecContractCourtdeductRequest;
use AntChain\TWC\Models\ExecContractCourtdeductResponse;
use AntChain\TWC\Models\ExecContractPayRequest;
use AntChain\TWC\Models\ExecContractPayResponse;
use AntChain\TWC\Models\ExistStubRequest;
use AntChain\TWC\Models\ExistStubResponse;
use AntChain\TWC\Models\FinishBclOrderRequest;
use AntChain\TWC\Models\FinishBclOrderResponse;
use AntChain\TWC\Models\FinishFileIntegrationRequest;
use AntChain\TWC\Models\FinishFileIntegrationResponse;
use AntChain\TWC\Models\FinishFlowInstanceRequest;
use AntChain\TWC\Models\FinishFlowInstanceResponse;
use AntChain\TWC\Models\FinishLeaseSupplierstatusRequest;
use AntChain\TWC\Models\FinishLeaseSupplierstatusResponse;
use AntChain\TWC\Models\GetBclUploadurlRequest;
use AntChain\TWC\Models\GetBclUploadurlResponse;
use AntChain\TWC\Models\GetCertificateDetailRequest;
use AntChain\TWC\Models\GetCertificateDetailResponse;
use AntChain\TWC\Models\GetContractCertificateRequest;
use AntChain\TWC\Models\GetContractCertificateResponse;
use AntChain\TWC\Models\GetContractEncryptedfileuploadurlRequest;
use AntChain\TWC\Models\GetContractEncryptedfileuploadurlResponse;
use AntChain\TWC\Models\GetContractFileRequest;
use AntChain\TWC\Models\GetContractFileResponse;
use AntChain\TWC\Models\GetContractFileuploadurlRequest;
use AntChain\TWC\Models\GetContractFileuploadurlResponse;
use AntChain\TWC\Models\GetContractSignurlRequest;
use AntChain\TWC\Models\GetContractSignurlResponse;
use AntChain\TWC\Models\GetContractTextRequest;
use AntChain\TWC\Models\GetContractTextResponse;
use AntChain\TWC\Models\GetContractTextsignRequest;
use AntChain\TWC\Models\GetContractTextsignResponse;
use AntChain\TWC\Models\GetCourtFilenotaryRequest;
use AntChain\TWC\Models\GetCourtFilenotaryResponse;
use AntChain\TWC\Models\GetCourtTextnotaryRequest;
use AntChain\TWC\Models\GetCourtTextnotaryResponse;
use AntChain\TWC\Models\GetDataflowTextRequest;
use AntChain\TWC\Models\GetDataflowTextResponse;
use AntChain\TWC\Models\GetFileIntegrationRequest;
use AntChain\TWC\Models\GetFileIntegrationResponse;
use AntChain\TWC\Models\GetFileRequest;
use AntChain\TWC\Models\GetFileResponse;
use AntChain\TWC\Models\GetFinanceFilenotaryRequest;
use AntChain\TWC\Models\GetFinanceFilenotaryResponse;
use AntChain\TWC\Models\GetFinanceTextnotaryRequest;
use AntChain\TWC\Models\GetFinanceTextnotaryResponse;
use AntChain\TWC\Models\GetInternalFileRequest;
use AntChain\TWC\Models\GetInternalFileResponse;
use AntChain\TWC\Models\GetInternalTextRequest;
use AntChain\TWC\Models\GetInternalTextResponse;
use AntChain\TWC\Models\GetJusticeFileuploadurlRequest;
use AntChain\TWC\Models\GetJusticeFileuploadurlResponse;
use AntChain\TWC\Models\GetJusticeUploadfilepathRequest;
use AntChain\TWC\Models\GetJusticeUploadfilepathResponse;
use AntChain\TWC\Models\GetPrivatecontractSignurlRequest;
use AntChain\TWC\Models\GetPrivatecontractSignurlResponse;
use AntChain\TWC\Models\GetSourceRequest;
use AntChain\TWC\Models\GetSourceResponse;
use AntChain\TWC\Models\GetTextRequest;
use AntChain\TWC\Models\GetTextResponse;
use AntChain\TWC\Models\GetTransRequest;
use AntChain\TWC\Models\GetTransResponse;
use AntChain\TWC\Models\GetTsrCertificateRequest;
use AntChain\TWC\Models\GetTsrCertificateResponse;
use AntChain\TWC\Models\InitAilegalQuestionRequest;
use AntChain\TWC\Models\InitAilegalQuestionResponse;
use AntChain\TWC\Models\InitCertificationRequest;
use AntChain\TWC\Models\InitCertificationResponse;
use AntChain\TWC\Models\InitEnterpriseFaceauthRequest;
use AntChain\TWC\Models\InitEnterpriseFaceauthResponse;
use AntChain\TWC\Models\InitFlowPhaseRequest;
use AntChain\TWC\Models\InitFlowPhaseResponse;
use AntChain\TWC\Models\InitIdentificationFaceauthRequest;
use AntChain\TWC\Models\InitIdentificationFaceauthResponse;
use AntChain\TWC\Models\InitLeaseSupplierRequest;
use AntChain\TWC\Models\InitLeaseSupplierResponse;
use AntChain\TWC\Models\InitPrivatecontractIntanceRequest;
use AntChain\TWC\Models\InitPrivatecontractIntanceResponse;
use AntChain\TWC\Models\ListContractDeductorderRequest;
use AntChain\TWC\Models\ListContractDeductorderResponse;
use AntChain\TWC\Models\ListContractOuttradeidRequest;
use AntChain\TWC\Models\ListContractOuttradeidResponse;
use AntChain\TWC\Models\ListContractPayruleRequest;
use AntChain\TWC\Models\ListContractPayruleResponse;
use AntChain\TWC\Models\ListContractTradeidsRequest;
use AntChain\TWC\Models\ListContractTradeidsResponse;
use AntChain\TWC\Models\ListLeaseNotaryRequest;
use AntChain\TWC\Models\ListLeaseNotaryResponse;
use AntChain\TWC\Models\NotifyContractSignerRequest;
use AntChain\TWC\Models\NotifyContractSignerResponse;
use AntChain\TWC\Models\NotifyJusticeRightspaymentRequest;
use AntChain\TWC\Models\NotifyJusticeRightspaymentResponse;
use AntChain\TWC\Models\OpenInternalJudicialRequest;
use AntChain\TWC\Models\OpenInternalJudicialResponse;
use AntChain\TWC\Models\OpenInternalTwcRequest;
use AntChain\TWC\Models\OpenInternalTwcResponse;
use AntChain\TWC\Models\OperateJusticeEventRequest;
use AntChain\TWC\Models\OperateJusticeEventResponse;
use AntChain\TWC\Models\PushDigitalcontentUsageRequest;
use AntChain\TWC\Models\PushDigitalcontentUsageResponse;
use AntChain\TWC\Models\PushPrivatecontractGaugeRequest;
use AntChain\TWC\Models\PushPrivatecontractGaugeResponse;
use AntChain\TWC\Models\PushRefinanceInvalidorderRequest;
use AntChain\TWC\Models\PushRefinanceInvalidorderResponse;
use AntChain\TWC\Models\QueryAilegalAnswerRequest;
use AntChain\TWC\Models\QueryAilegalAnswerResponse;
use AntChain\TWC\Models\QueryBclComplaineventidsRequest;
use AntChain\TWC\Models\QueryBclComplaineventidsResponse;
use AntChain\TWC\Models\QueryBclComplainRequest;
use AntChain\TWC\Models\QueryBclComplainResponse;
use AntChain\TWC\Models\QueryBclInsuranceRequest;
use AntChain\TWC\Models\QueryBclInsuranceResponse;
use AntChain\TWC\Models\QueryBclMerchantRequest;
use AntChain\TWC\Models\QueryBclMerchantResponse;
use AntChain\TWC\Models\QueryBclOrderRequest;
use AntChain\TWC\Models\QueryBclOrderResponse;
use AntChain\TWC\Models\QueryBclProductRequest;
use AntChain\TWC\Models\QueryBclProductResponse;
use AntChain\TWC\Models\QueryBclRefundRequest;
use AntChain\TWC\Models\QueryBclRefundResponse;
use AntChain\TWC\Models\QueryCertificationRequest;
use AntChain\TWC\Models\QueryCertificationResponse;
use AntChain\TWC\Models\QueryContractAccountRequest;
use AntChain\TWC\Models\QueryContractAccountResponse;
use AntChain\TWC\Models\QueryContractAccountsealsRequest;
use AntChain\TWC\Models\QueryContractAccountsealsResponse;
use AntChain\TWC\Models\QueryContractComplaineventidsRequest;
use AntChain\TWC\Models\QueryContractComplaineventidsResponse;
use AntChain\TWC\Models\QueryContractComplainRequest;
use AntChain\TWC\Models\QueryContractComplainResponse;
use AntChain\TWC\Models\QueryContractDedcutpayinfoRequest;
use AntChain\TWC\Models\QueryContractDedcutpayinfoResponse;
use AntChain\TWC\Models\QueryContractDeductdetailRequest;
use AntChain\TWC\Models\QueryContractDeductdetailResponse;
use AntChain\TWC\Models\QueryContractFlowRequest;
use AntChain\TWC\Models\QueryContractFlowResponse;
use AntChain\TWC\Models\QueryContractFlowsignerRequest;
use AntChain\TWC\Models\QueryContractFlowsignerResponse;
use AntChain\TWC\Models\QueryContractMerchantindirectzftRequest;
use AntChain\TWC\Models\QueryContractMerchantindirectzftResponse;
use AntChain\TWC\Models\QueryContractMerchantorderRequest;
use AntChain\TWC\Models\QueryContractMerchantorderResponse;
use AntChain\TWC\Models\QueryContractMerchantzftRequest;
use AntChain\TWC\Models\QueryContractMerchantzftResponse;
use AntChain\TWC\Models\QueryContractNotaryRequest;
use AntChain\TWC\Models\QueryContractNotaryResponse;
use AntChain\TWC\Models\QueryContractOrganizationRequest;
use AntChain\TWC\Models\QueryContractOrganizationResponse;
use AntChain\TWC\Models\QueryContractOrganizationsealsRequest;
use AntChain\TWC\Models\QueryContractOrganizationsealsResponse;
use AntChain\TWC\Models\QueryContractRefundRequest;
use AntChain\TWC\Models\QueryContractRefundResponse;
use AntChain\TWC\Models\QueryContractSignfieldsealidRequest;
use AntChain\TWC\Models\QueryContractSignfieldsealidResponse;
use AntChain\TWC\Models\QueryContractSignfieldsRequest;
use AntChain\TWC\Models\QueryContractSignfieldsResponse;
use AntChain\TWC\Models\QueryContractStatusRequest;
use AntChain\TWC\Models\QueryContractStatusResponse;
use AntChain\TWC\Models\QueryContractTaskRequest;
use AntChain\TWC\Models\QueryContractTaskResponse;
use AntChain\TWC\Models\QueryContractTemplateRequest;
use AntChain\TWC\Models\QueryContractTemplateResponse;
use AntChain\TWC\Models\QueryContractTradedetailRequest;
use AntChain\TWC\Models\QueryContractTradedetailResponse;
use AntChain\TWC\Models\QueryContractTradestatusRequest;
use AntChain\TWC\Models\QueryContractTradestatusResponse;
use AntChain\TWC\Models\QueryContractWordspositionRequest;
use AntChain\TWC\Models\QueryContractWordspositionResponse;
use AntChain\TWC\Models\QueryDataflowActionRequest;
use AntChain\TWC\Models\QueryDataflowActionResponse;
use AntChain\TWC\Models\QueryEnterpriseFaceauthRequest;
use AntChain\TWC\Models\QueryEnterpriseFaceauthResponse;
use AntChain\TWC\Models\QueryFlowCertificateRequest;
use AntChain\TWC\Models\QueryFlowCertificateResponse;
use AntChain\TWC\Models\QueryFlowEvidenceRequest;
use AntChain\TWC\Models\QueryFlowEvidenceResponse;
use AntChain\TWC\Models\QueryFlowOnestepnotaryRequest;
use AntChain\TWC\Models\QueryFlowOnestepnotaryResponse;
use AntChain\TWC\Models\QueryFlowPhaseRequest;
use AntChain\TWC\Models\QueryFlowPhaseResponse;
use AntChain\TWC\Models\QueryIdentificationFaceauthRequest;
use AntChain\TWC\Models\QueryIdentificationFaceauthResponse;
use AntChain\TWC\Models\QueryIdentificationRealpersonRequest;
use AntChain\TWC\Models\QueryIdentificationRealpersonResponse;
use AntChain\TWC\Models\QueryJointconstraintBreachrecordRequest;
use AntChain\TWC\Models\QueryJointconstraintBreachrecordResponse;
use AntChain\TWC\Models\QueryJusticeBasecaseRequest;
use AntChain\TWC\Models\QueryJusticeBasecaseResponse;
use AntChain\TWC\Models\QueryJusticeCaseinfoRequest;
use AntChain\TWC\Models\QueryJusticeCaseinfoResponse;
use AntChain\TWC\Models\QueryJusticeCaseRequest;
use AntChain\TWC\Models\QueryJusticeCaseResponse;
use AntChain\TWC\Models\QueryJusticeCommoncaseinfoRequest;
use AntChain\TWC\Models\QueryJusticeCommoncaseinfoResponse;
use AntChain\TWC\Models\QueryJusticeMediationRequest;
use AntChain\TWC\Models\QueryJusticeMediationResponse;
use AntChain\TWC\Models\QueryJusticeRightsRequest;
use AntChain\TWC\Models\QueryJusticeRightsResponse;
use AntChain\TWC\Models\QueryLeaseApplicationdetailinfoRequest;
use AntChain\TWC\Models\QueryLeaseApplicationdetailinfoResponse;
use AntChain\TWC\Models\QueryLeaseApplicationRequest;
use AntChain\TWC\Models\QueryLeaseApplicationResponse;
use AntChain\TWC\Models\QueryLeaseAsynccallRequest;
use AntChain\TWC\Models\QueryLeaseAsynccallResponse;
use AntChain\TWC\Models\QueryLeaseAsyncencryptedinfoRequest;
use AntChain\TWC\Models\QueryLeaseAsyncencryptedinfoResponse;
use AntChain\TWC\Models\QueryLeaseBizRequest;
use AntChain\TWC\Models\QueryLeaseBizResponse;
use AntChain\TWC\Models\QueryLeaseClearingRequest;
use AntChain\TWC\Models\QueryLeaseClearingResponse;
use AntChain\TWC\Models\QueryLeaseCreditpromiseRequest;
use AntChain\TWC\Models\QueryLeaseCreditpromiseResponse;
use AntChain\TWC\Models\QueryLeaseEncryptedinfoRequest;
use AntChain\TWC\Models\QueryLeaseEncryptedinfoResponse;
use AntChain\TWC\Models\QueryLeaseFinancecertifyincontractRequest;
use AntChain\TWC\Models\QueryLeaseFinancecertifyincontractResponse;
use AntChain\TWC\Models\QueryLeaseFinancecertifyRequest;
use AntChain\TWC\Models\QueryLeaseFinancecertifyResponse;
use AntChain\TWC\Models\QueryLeaseFinancecreditRequest;
use AntChain\TWC\Models\QueryLeaseFinancecreditResponse;
use AntChain\TWC\Models\QueryLeaseInstallmentRequest;
use AntChain\TWC\Models\QueryLeaseInstallmentResponse;
use AntChain\TWC\Models\QueryLeaseIotinfoRequest;
use AntChain\TWC\Models\QueryLeaseIotinfoResponse;
use AntChain\TWC\Models\QueryLeaseLeasepromiseRequest;
use AntChain\TWC\Models\QueryLeaseLeasepromiseResponse;
use AntChain\TWC\Models\QueryLeaseOrderclearingRequest;
use AntChain\TWC\Models\QueryLeaseOrderclearingResponse;
use AntChain\TWC\Models\QueryLeaseOrderdetailinfoRequest;
use AntChain\TWC\Models\QueryLeaseOrderdetailinfoResponse;
use AntChain\TWC\Models\QueryLeaseOrderinfoRequest;
use AntChain\TWC\Models\QueryLeaseOrderinfoResponse;
use AntChain\TWC\Models\QueryLeaseOrderproductRequest;
use AntChain\TWC\Models\QueryLeaseOrderproductResponse;
use AntChain\TWC\Models\QueryLeaseProductinfoRequest;
use AntChain\TWC\Models\QueryLeaseProductinfoResponse;
use AntChain\TWC\Models\QueryLeaseProofRequest;
use AntChain\TWC\Models\QueryLeaseProofResponse;
use AntChain\TWC\Models\QueryLeaseRentalinfoRequest;
use AntChain\TWC\Models\QueryLeaseRentalinfoResponse;
use AntChain\TWC\Models\QueryLeaseRentalverifyRequest;
use AntChain\TWC\Models\QueryLeaseRentalverifyResponse;
use AntChain\TWC\Models\QueryLeaseRepaymentRequest;
use AntChain\TWC\Models\QueryLeaseRepaymentResponse;
use AntChain\TWC\Models\QueryLeaseRepaymentstatusRequest;
use AntChain\TWC\Models\QueryLeaseRepaymentstatusResponse;
use AntChain\TWC\Models\QueryLeaseUserperformanceRequest;
use AntChain\TWC\Models\QueryLeaseUserperformanceResponse;
use AntChain\TWC\Models\QueryLeaseUserRequest;
use AntChain\TWC\Models\QueryLeaseUserResponse;
use AntChain\TWC\Models\QueryPayresultfileurlRequest;
use AntChain\TWC\Models\QueryPayresultfileurlResponse;
use AntChain\TWC\Models\QueryRefinanceOrderidRequest;
use AntChain\TWC\Models\QueryRefinanceOrderidResponse;
use AntChain\TWC\Models\QueryRefinanceOrderRequest;
use AntChain\TWC\Models\QueryRefinanceOrderResponse;
use AntChain\TWC\Models\QueryRefinanceProductRequest;
use AntChain\TWC\Models\QueryRefinanceProductResponse;
use AntChain\TWC\Models\QueryStubCertificateRequest;
use AntChain\TWC\Models\QueryStubCertificateResponse;
use AntChain\TWC\Models\QueryStubRequest;
use AntChain\TWC\Models\QueryStubResponse;
use AntChain\TWC\Models\QuerySueUserinfoRequest;
use AntChain\TWC\Models\QuerySueUserinfoResponse;
use AntChain\TWC\Models\QueryWithholdAgreementRequest;
use AntChain\TWC\Models\QueryWithholdAgreementResponse;
use AntChain\TWC\Models\QueryWithholdAgreementurlRequest;
use AntChain\TWC\Models\QueryWithholdAgreementurlResponse;
use AntChain\TWC\Models\QueryWithholdPayresultRequest;
use AntChain\TWC\Models\QueryWithholdPayresultResponse;
use AntChain\TWC\Models\RegisterBclMerchantRequest;
use AntChain\TWC\Models\RegisterBclMerchantResponse;
use AntChain\TWC\Models\ResetContractMerchantapplyRequest;
use AntChain\TWC\Models\ResetContractMerchantapplyResponse;
use AntChain\TWC\Models\SaveContractFlowRequest;
use AntChain\TWC\Models\SaveContractFlowResponse;
use AntChain\TWC\Models\SaveJointconstraintRecordRequest;
use AntChain\TWC\Models\SaveJointconstraintRecordResponse;
use AntChain\TWC\Models\SaveJusticePartyRequest;
use AntChain\TWC\Models\SaveJusticePartyResponse;
use AntChain\TWC\Models\SaveWitnessSnapshotRequest;
use AntChain\TWC\Models\SaveWitnessSnapshotResponse;
use AntChain\TWC\Models\SendContractComplainfeedbackRequest;
use AntChain\TWC\Models\SendContractComplainfeedbackResponse;
use AntChain\TWC\Models\SendContractInvitationRequest;
use AntChain\TWC\Models\SendContractInvitationResponse;
use AntChain\TWC\Models\SendWithholdDeductRequest;
use AntChain\TWC\Models\SendWithholdDeductResponse;
use AntChain\TWC\Models\SendWithholdRefundRequest;
use AntChain\TWC\Models\SendWithholdRefundResponse;
use AntChain\TWC\Models\SetContractTenantkeyRequest;
use AntChain\TWC\Models\SetContractTenantkeyResponse;
use AntChain\TWC\Models\SetLeaseRepaymentstatusRequest;
use AntChain\TWC\Models\SetLeaseRepaymentstatusResponse;
use AntChain\TWC\Models\SetNotarizationOrderRequest;
use AntChain\TWC\Models\SetNotarizationOrderResponse;
use AntChain\TWC\Models\StartContractFlowRequest;
use AntChain\TWC\Models\StartContractFlowResponse;
use AntChain\TWC\Models\StartContractHandsignRequest;
use AntChain\TWC\Models\StartContractHandsignResponse;
use AntChain\TWC\Models\StartJusticeCaseRequest;
use AntChain\TWC\Models\StartJusticeCaseResponse;
use AntChain\TWC\Models\SubmitAilegalFeedbackRequest;
use AntChain\TWC\Models\SubmitAilegalFeedbackResponse;
use AntChain\TWC\Models\SubmitBclComplainfeedbackRequest;
use AntChain\TWC\Models\SubmitBclComplainfeedbackResponse;
use AntChain\TWC\Models\SubmitBclOrderRequest;
use AntChain\TWC\Models\SubmitBclOrderResponse;
use AntChain\TWC\Models\SubmitContractArchiveRequest;
use AntChain\TWC\Models\SubmitContractArchiveResponse;
use AntChain\TWC\Models\SubmitDigitalcontentOrderRequest;
use AntChain\TWC\Models\SubmitDigitalcontentOrderResponse;
use AntChain\TWC\Models\SyncInnerNotaryRequest;
use AntChain\TWC\Models\SyncInnerNotaryResponse;
use AntChain\TWC\Models\SyncInnerProvisionRequest;
use AntChain\TWC\Models\SyncInnerProvisionResponse;
use AntChain\TWC\Models\SyncInnerTransRequest;
use AntChain\TWC\Models\SyncInnerTransResponse;
use AntChain\TWC\Models\SyncInnerTsrRequest;
use AntChain\TWC\Models\SyncInnerTsrResponse;
use AntChain\TWC\Models\SyncInnerTwcopenRequest;
use AntChain\TWC\Models\SyncInnerTwcopenResponse;
use AntChain\TWC\Models\SyncLeaseSupplierorderstatusRequest;
use AntChain\TWC\Models\SyncLeaseSupplierorderstatusResponse;
use AntChain\TWC\Models\TransferGeneralShortenurlRequest;
use AntChain\TWC\Models\TransferGeneralShortenurlResponse;
use AntChain\TWC\Models\TransferInnerShorturlRequest;
use AntChain\TWC\Models\TransferInnerShorturlResponse;
use AntChain\TWC\Models\UnbindContractPayRequest;
use AntChain\TWC\Models\UnbindContractPayResponse;
use AntChain\TWC\Models\UpdateBclPromiserepaymentRequest;
use AntChain\TWC\Models\UpdateBclPromiserepaymentResponse;
use AntChain\TWC\Models\UpdateContractMerchantRequest;
use AntChain\TWC\Models\UpdateContractMerchantResponse;
use AntChain\TWC\Models\UpdateContractOrganizationRequest;
use AntChain\TWC\Models\UpdateContractOrganizationResponse;
use AntChain\TWC\Models\UpdateContractPlatformRequest;
use AntChain\TWC\Models\UpdateContractPlatformResponse;
use AntChain\TWC\Models\UpdateContractUserRequest;
use AntChain\TWC\Models\UpdateContractUserResponse;
use AntChain\TWC\Models\UpdateJusticeRightsRequest;
use AntChain\TWC\Models\UpdateJusticeRightsResponse;
use AntChain\TWC\Models\UpdateLeaseContractRequest;
use AntChain\TWC\Models\UpdateLeaseContractResponse;
use AntChain\TWC\Models\UpdateNotarizationOrderRequest;
use AntChain\TWC\Models\UpdateNotarizationOrderResponse;
use AntChain\TWC\Models\UpdatePrivatecontractCertRequest;
use AntChain\TWC\Models\UpdatePrivatecontractCertResponse;
use AntChain\TWC\Models\UpdatePrivatecontractIntanceRequest;
use AntChain\TWC\Models\UpdatePrivatecontractIntanceResponse;
use AntChain\TWC\Models\UpdateSueBreakpromiseinfoRequest;
use AntChain\TWC\Models\UpdateSueBreakpromiseinfoResponse;
use AntChain\TWC\Models\UpdateSueExemplaryrevertRequest;
use AntChain\TWC\Models\UpdateSueExemplaryrevertResponse;
use AntChain\TWC\Models\UpdateSueExeplarycontractRequest;
use AntChain\TWC\Models\UpdateSueExeplarycontractResponse;
use AntChain\TWC\Models\UploadBclComplainimageRequest;
use AntChain\TWC\Models\UploadBclComplainimageResponse;
use AntChain\TWC\Models\UploadBclFileRequest;
use AntChain\TWC\Models\UploadBclFileResponse;
use AntChain\TWC\Models\UploadBclPerformanceRequest;
use AntChain\TWC\Models\UploadBclPerformanceResponse;
use AntChain\TWC\Models\UploadContractComplainimageRequest;
use AntChain\TWC\Models\UploadContractComplainimageResponse;
use AntChain\TWC\Models\UploadDataflowPubkeyRequest;
use AntChain\TWC\Models\UploadDataflowPubkeyResponse;
use AntChain\TWC\Models\UploadTrafficOperatelogRequest;
use AntChain\TWC\Models\UploadTrafficOperatelogResponse;
use AntChain\TWC\Models\VerifyBclContractmetricRequest;
use AntChain\TWC\Models\VerifyBclContractmetricResponse;
use AntChain\TWC\Models\VerifyContractDocsignRequest;
use AntChain\TWC\Models\VerifyContractDocsignResponse;
use AntChain\TWC\Models\VerifyContractTextsignRequest;
use AntChain\TWC\Models\VerifyContractTextsignResponse;
use AntChain\TWC\Models\VerifyPrivatecompanyFourmetaRequest;
use AntChain\TWC\Models\VerifyPrivatecompanyFourmetaResponse;
use AntChain\TWC\Models\VerifyPrivatecompanyTwometaRequest;
use AntChain\TWC\Models\VerifyPrivatecompanyTwometaResponse;
use AntChain\TWC\Models\VerifyPrivatepersonTwometaRequest;
use AntChain\TWC\Models\VerifyPrivatepersonTwometaResponse;
use AntChain\TWC\Models\VerifyRefinancePackageRequest;
use AntChain\TWC\Models\VerifyRefinancePackageResponse;
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
            // 司法纠纷平台通用文件信息结构体
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
                    'sdk_version'      => '1.13.6',
                    '_prod_code'       => 'TWC',
                    '_prod_channel'    => 'undefined',
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
     * Description: AI提问获取答案
     * Summary: 获取答案.
     *
     * @param QueryAilegalAnswerRequest $request
     *
     * @return QueryAilegalAnswerResponse
     */
    public function queryAilegalAnswer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAilegalAnswerEx($request, $headers, $runtime);
    }

    /**
     * Description: AI提问获取答案
     * Summary: 获取答案.
     *
     * @param QueryAilegalAnswerRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryAilegalAnswerResponse
     */
    public function queryAilegalAnswerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAilegalAnswerResponse::fromMap($this->doRequest('1.0', 'twc.notary.ailegal.answer.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 问答反馈
     * Summary: 问答反馈.
     *
     * @param SubmitAilegalFeedbackRequest $request
     *
     * @return SubmitAilegalFeedbackResponse
     */
    public function submitAilegalFeedback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAilegalFeedbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 问答反馈
     * Summary: 问答反馈.
     *
     * @param SubmitAilegalFeedbackRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SubmitAilegalFeedbackResponse
     */
    public function submitAilegalFeedbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAilegalFeedbackResponse::fromMap($this->doRequest('1.0', 'twc.notary.ailegal.feedback.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AI法律服务提问接口
     * Summary: 提出问题.
     *
     * @param InitAilegalQuestionRequest $request
     *
     * @return InitAilegalQuestionResponse
     */
    public function initAilegalQuestion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initAilegalQuestionEx($request, $headers, $runtime);
    }

    /**
     * Description: AI法律服务提问接口
     * Summary: 提出问题.
     *
     * @param InitAilegalQuestionRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return InitAilegalQuestionResponse
     */
    public function initAilegalQuestionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitAilegalQuestionResponse::fromMap($this->doRequest('1.0', 'twc.notary.ailegal.question.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 仲裁签署状态信息变更回调接口
     * Summary: 仲裁签署状态信息变更回调接口.
     *
     * @param CallbackArbitrationSignstatusRequest $request
     *
     * @return CallbackArbitrationSignstatusResponse
     */
    public function callbackArbitrationSignstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackArbitrationSignstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 仲裁签署状态信息变更回调接口
     * Summary: 仲裁签署状态信息变更回调接口.
     *
     * @param CallbackArbitrationSignstatusRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CallbackArbitrationSignstatusResponse
     */
    public function callbackArbitrationSignstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackArbitrationSignstatusResponse::fromMap($this->doRequest('1.0', 'twc.notary.arbitration.signstatus.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁物流信息添加
     * Summary: 租赁物流信息添加.
     *
     * @param AddBclLogisticinfoRequest $request
     *
     * @return AddBclLogisticinfoResponse
     */
    public function addBclLogisticinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addBclLogisticinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁物流信息添加
     * Summary: 租赁物流信息添加.
     *
     * @param AddBclLogisticinfoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AddBclLogisticinfoResponse
     */
    public function addBclLogisticinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddBclLogisticinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.logisticinfo.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁订单发起
     * Summary: 租赁订单发起.
     *
     * @param SubmitBclOrderRequest $request
     *
     * @return SubmitBclOrderResponse
     */
    public function submitBclOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitBclOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁订单发起
     * Summary: 租赁订单发起.
     *
     * @param SubmitBclOrderRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SubmitBclOrderResponse
     */
    public function submitBclOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitBclOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.order.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建租赁订单
     * Summary: 创建租赁订单.
     *
     * @param CreateBclOrderRequest $request
     *
     * @return CreateBclOrderResponse
     */
    public function createBclOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBclOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建租赁订单
     * Summary: 创建租赁订单.
     *
     * @param CreateBclOrderRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateBclOrderResponse
     */
    public function createBclOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBclOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.order.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁订单查询
     * Summary: 租赁订单查询.
     *
     * @param QueryBclOrderRequest $request
     *
     * @return QueryBclOrderResponse
     */
    public function queryBclOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBclOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁订单查询
     * Summary: 租赁订单查询.
     *
     * @param QueryBclOrderRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryBclOrderResponse
     */
    public function queryBclOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBclOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.order.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 履约信息上传接口
     * Summary: 履约信息上传接口.
     *
     * @param UploadBclPerformanceRequest $request
     *
     * @return UploadBclPerformanceResponse
     */
    public function uploadBclPerformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadBclPerformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 履约信息上传接口
     * Summary: 履约信息上传接口.
     *
     * @param UploadBclPerformanceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UploadBclPerformanceResponse
     */
    public function uploadBclPerformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadBclPerformanceResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.performance.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品导入
     * Summary: 商品导入.
     *
     * @param CreateBclProductRequest $request
     *
     * @return CreateBclProductResponse
     */
    public function createBclProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBclProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品导入
     * Summary: 商品导入.
     *
     * @param CreateBclProductRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateBclProductResponse
     */
    public function createBclProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBclProductResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.product.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品查询
     * Summary: 商品查询.
     *
     * @param QueryBclProductRequest $request
     *
     * @return QueryBclProductResponse
     */
    public function queryBclProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBclProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品查询
     * Summary: 商品查询.
     *
     * @param QueryBclProductRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryBclProductResponse
     */
    public function queryBclProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBclProductResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.product.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合同资源量校验与资源扣减
     * Summary: 合同资源量校验与资源扣减.
     *
     * @param VerifyBclContractmetricRequest $request
     *
     * @return VerifyBclContractmetricResponse
     */
    public function verifyBclContractmetric($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyBclContractmetricEx($request, $headers, $runtime);
    }

    /**
     * Description: 合同资源量校验与资源扣减
     * Summary: 合同资源量校验与资源扣减.
     *
     * @param VerifyBclContractmetricRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return VerifyBclContractmetricResponse
     */
    public function verifyBclContractmetricEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyBclContractmetricResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.contractmetric.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取授权访问oss链接
     * Summary: 获取授权访问oss链接.
     *
     * @param GetBclUploadurlRequest $request
     *
     * @return GetBclUploadurlResponse
     */
    public function getBclUploadurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getBclUploadurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取授权访问oss链接
     * Summary: 获取授权访问oss链接.
     *
     * @param GetBclUploadurlRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetBclUploadurlResponse
     */
    public function getBclUploadurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetBclUploadurlResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.uploadurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 变更BCL订单承诺履约还款方式。合同代扣类型的订单，可以调用该接口取消某一期的代扣(转换为主动还款)。
     * Summary: 变更BCL订单承诺履约还款方式.
     *
     * @param UpdateBclPromiserepaymentRequest $request
     *
     * @return UpdateBclPromiserepaymentResponse
     */
    public function updateBclPromiserepayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBclPromiserepaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 变更BCL订单承诺履约还款方式。合同代扣类型的订单，可以调用该接口取消某一期的代扣(转换为主动还款)。
     * Summary: 变更BCL订单承诺履约还款方式.
     *
     * @param UpdateBclPromiserepaymentRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateBclPromiserepaymentResponse
     */
    public function updateBclPromiserepaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBclPromiserepaymentResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.promiserepayment.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建收款方
     * Summary: 创建收款方.
     *
     * @param CreateBclPayeeRequest $request
     *
     * @return CreateBclPayeeResponse
     */
    public function createBclPayee($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBclPayeeEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建收款方
     * Summary: 创建收款方.
     *
     * @param CreateBclPayeeRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateBclPayeeResponse
     */
    public function createBclPayeeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBclPayeeResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.payee.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁宝plus订单融资申请接口
     * Summary: 租赁宝plus订单融资申请接口.
     *
     * @param ApplyBclFinancingRequest $request
     *
     * @return ApplyBclFinancingResponse
     */
    public function applyBclFinancing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyBclFinancingEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁宝plus订单融资申请接口
     * Summary: 租赁宝plus订单融资申请接口.
     *
     * @param ApplyBclFinancingRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ApplyBclFinancingResponse
     */
    public function applyBclFinancingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyBclFinancingResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.financing.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家发起入驻成功后，可以通过此接口查询入驻的结果
     * Summary: 查询商家入驻结果.
     *
     * @param QueryBclMerchantRequest $request
     *
     * @return QueryBclMerchantResponse
     */
    public function queryBclMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBclMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家发起入驻成功后，可以通过此接口查询入驻的结果
     * Summary: 查询商家入驻结果.
     *
     * @param QueryBclMerchantRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryBclMerchantResponse
     */
    public function queryBclMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBclMerchantResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.merchant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家入驻租赁宝plus平台接口
     * Summary: 商家入驻租赁宝plus平台接口.
     *
     * @param RegisterBclMerchantRequest $request
     *
     * @return RegisterBclMerchantResponse
     */
    public function registerBclMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerBclMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家入驻租赁宝plus平台接口
     * Summary: 商家入驻租赁宝plus平台接口.
     *
     * @param RegisterBclMerchantRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return RegisterBclMerchantResponse
     */
    public function registerBclMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterBclMerchantResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.merchant.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当商家收到买家想解除代扣协议的消息后，可选择同意或拒绝用户解约操作；前置条件：商家已成功收到买家解除代扣协议的消息；
     * Summary: 解除代扣协议.
     *
     * @param CancelBclWithholdRequest $request
     *
     * @return CancelBclWithholdResponse
     */
    public function cancelBclWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelBclWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 当商家收到买家想解除代扣协议的消息后，可选择同意或拒绝用户解约操作；前置条件：商家已成功收到买家解除代扣协议的消息；
     * Summary: 解除代扣协议.
     *
     * @param CancelBclWithholdRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CancelBclWithholdResponse
     */
    public function cancelBclWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelBclWithholdResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.withhold.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询单条交易投诉详情接口
     * Summary: 查询单条交易投诉详情接口.
     *
     * @param QueryBclComplainRequest $request
     *
     * @return QueryBclComplainResponse
     */
    public function queryBclComplain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBclComplainEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询单条交易投诉详情接口
     * Summary: 查询单条交易投诉详情接口.
     *
     * @param QueryBclComplainRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryBclComplainResponse
     */
    public function queryBclComplainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBclComplainResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.complain.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户上传处理图片
     * Summary: 商户上传处理图片.
     *
     * @param UploadBclComplainimageRequest $request
     *
     * @return UploadBclComplainimageResponse
     */
    public function uploadBclComplainimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadBclComplainimageEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户上传处理图片
     * Summary: 商户上传处理图片.
     *
     * @param UploadBclComplainimageRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UploadBclComplainimageResponse
     */
    public function uploadBclComplainimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadBclComplainimageResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.complainimage.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家处理交易投诉
     * Summary: 商家处理交易投诉.
     *
     * @param SubmitBclComplainfeedbackRequest $request
     *
     * @return SubmitBclComplainfeedbackResponse
     */
    public function submitBclComplainfeedback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitBclComplainfeedbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家处理交易投诉
     * Summary: 商家处理交易投诉.
     *
     * @param SubmitBclComplainfeedbackRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SubmitBclComplainfeedbackResponse
     */
    public function submitBclComplainfeedbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitBclComplainfeedbackResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.complainfeedback.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询投诉单id列表
     * Summary: 查询投诉单id列表.
     *
     * @param QueryBclComplaineventidsRequest $request
     *
     * @return QueryBclComplaineventidsResponse
     */
    public function queryBclComplaineventids($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBclComplaineventidsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询投诉单id列表
     * Summary: 查询投诉单id列表.
     *
     * @param QueryBclComplaineventidsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryBclComplaineventidsResponse
     */
    public function queryBclComplaineventidsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBclComplaineventidsResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.complaineventids.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁宝plus文件上传接口
     * Summary: 租赁文件上传接口.
     *
     * @param UploadBclFileRequest $request
     *
     * @return UploadBclFileResponse
     */
    public function uploadBclFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadBclFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁宝plus文件上传接口
     * Summary: 租赁文件上传接口.
     *
     * @param UploadBclFileRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UploadBclFileResponse
     */
    public function uploadBclFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadBclFileResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 完成租赁单推进终态，本期要支持非自建代扣+新租赁宝代扣+老合同+老租赁宝代扣的租赁单完结
     * Summary: 完结租赁单.
     *
     * @param FinishBclOrderRequest $request
     *
     * @return FinishBclOrderResponse
     */
    public function finishBclOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishBclOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 完成租赁单推进终态，本期要支持非自建代扣+新租赁宝代扣+老合同+老租赁宝代扣的租赁单完结
     * Summary: 完结租赁单.
     *
     * @param FinishBclOrderRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return FinishBclOrderResponse
     */
    public function finishBclOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishBclOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.order.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁宝plus退款
     * Summary: 租赁宝plus退款.
     *
     * @param CreateBclRefundRequest $request
     *
     * @return CreateBclRefundResponse
     */
    public function createBclRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBclRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁宝plus退款
     * Summary: 租赁宝plus退款.
     *
     * @param CreateBclRefundRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateBclRefundResponse
     */
    public function createBclRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBclRefundResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.refund.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁宝plus退款查询
     * Summary: 租赁宝plus退款查询.
     *
     * @param QueryBclRefundRequest $request
     *
     * @return QueryBclRefundResponse
     */
    public function queryBclRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBclRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁宝plus退款查询
     * Summary: 租赁宝plus退款查询.
     *
     * @param QueryBclRefundRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryBclRefundResponse
     */
    public function queryBclRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBclRefundResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.refund.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁宝plus投保
     * Summary: 租赁宝plus投保.
     *
     * @param CreateBclInsuranceRequest $request
     *
     * @return CreateBclInsuranceResponse
     */
    public function createBclInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBclInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁宝plus投保
     * Summary: 租赁宝plus投保.
     *
     * @param CreateBclInsuranceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateBclInsuranceResponse
     */
    public function createBclInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBclInsuranceResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.insurance.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁宝plus退保
     * Summary: 租赁宝plus退保.
     *
     * @param CancelBclInsuranceRequest $request
     *
     * @return CancelBclInsuranceResponse
     */
    public function cancelBclInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelBclInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁宝plus退保
     * Summary: 租赁宝plus退保.
     *
     * @param CancelBclInsuranceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CancelBclInsuranceResponse
     */
    public function cancelBclInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelBclInsuranceResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.insurance.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁宝plus查询订单保险详情
     * Summary: 租赁宝plus查询订单保险详情.
     *
     * @param QueryBclInsuranceRequest $request
     *
     * @return QueryBclInsuranceResponse
     */
    public function queryBclInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBclInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁宝plus查询订单保险详情
     * Summary: 租赁宝plus查询订单保险详情.
     *
     * @param QueryBclInsuranceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryBclInsuranceResponse
     */
    public function queryBclInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBclInsuranceResponse::fromMap($this->doRequest('1.0', 'twc.notary.bcl.insurance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
     * Summary: 通知签署方执行合同签署.
     *
     * @param NotifyContractSignerRequest $request
     *
     * @return NotifyContractSignerResponse
     */
    public function notifyContractSigner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyContractSignerEx($request, $headers, $runtime);
    }

    /**
     * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
     * Summary: 通知签署方执行合同签署.
     *
     * @param NotifyContractSignerRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return NotifyContractSignerResponse
     */
    public function notifyContractSignerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyContractSignerResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.signer.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
     * Summary: 修改平台方注册信息.
     *
     * @param UpdateContractPlatformRequest $request
     *
     * @return UpdateContractPlatformResponse
     */
    public function updateContractPlatform($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateContractPlatformEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
     * Summary: 修改平台方注册信息.
     *
     * @param UpdateContractPlatformRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateContractPlatformResponse
     */
    public function updateContractPlatformEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateContractPlatformResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.platform.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
     * Summary: 修改用户注册信息.
     *
     * @param UpdateContractUserRequest $request
     *
     * @return UpdateContractUserResponse
     */
    public function updateContractUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateContractUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
     * Summary: 修改用户注册信息.
     *
     * @param UpdateContractUserRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateContractUserResponse
     */
    public function updateContractUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateContractUserResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.user.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改
     * Summary: 修改机构用户注册信息.
     *
     * @param UpdateContractOrganizationRequest $request
     *
     * @return UpdateContractOrganizationResponse
     */
    public function updateContractOrganization($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateContractOrganizationEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改
     * Summary: 修改机构用户注册信息.
     *
     * @param UpdateContractOrganizationRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateContractOrganizationResponse
     */
    public function updateContractOrganizationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateContractOrganizationResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.organization.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
     * Summary: 商户入驻直付通新接口.
     *
     * @param ApplyContractMerchantRequest $request
     *
     * @return ApplyContractMerchantResponse
     */
    public function applyContractMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyContractMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
     * Summary: 商户入驻直付通新接口.
     *
     * @param ApplyContractMerchantRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ApplyContractMerchantResponse
     */
    public function applyContractMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyContractMerchantResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchant.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
     * Summary: 直付通商户入驻确认.
     *
     * @param ConfirmContractMerchantRequest $request
     *
     * @return ConfirmContractMerchantResponse
     */
    public function confirmContractMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmContractMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
     * Summary: 直付通商户入驻确认.
     *
     * @param ConfirmContractMerchantRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ConfirmContractMerchantResponse
     */
    public function confirmContractMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmContractMerchantResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchant.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建合同存证事务ID。私有云使用。
     * Summary: 创建合同存证事务ID。私有云使用。
     *
     * @param CreatePrivatecontractTransRequest $request
     *
     * @return CreatePrivatecontractTransResponse
     */
    public function createPrivatecontractTrans($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createPrivatecontractTransEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建合同存证事务ID。私有云使用。
     * Summary: 创建合同存证事务ID。私有云使用。
     *
     * @param CreatePrivatecontractTransRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreatePrivatecontractTransResponse
     */
    public function createPrivatecontractTransEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreatePrivatecontractTransResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecontract.trans.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合同文本存证。私有云使用。
     * Summary: 合同文本存证。私有云使用。
     *
     * @param CreatePrivatecontractTextRequest $request
     *
     * @return CreatePrivatecontractTextResponse
     */
    public function createPrivatecontractText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createPrivatecontractTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 合同文本存证。私有云使用。
     * Summary: 合同文本存证。私有云使用。
     *
     * @param CreatePrivatecontractTextRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreatePrivatecontractTextResponse
     */
    public function createPrivatecontractTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreatePrivatecontractTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecontract.text.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人二要素校验
     * Summary: 个人二要素校验.
     *
     * @param VerifyPrivatepersonTwometaRequest $request
     *
     * @return VerifyPrivatepersonTwometaResponse
     */
    public function verifyPrivatepersonTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyPrivatepersonTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人二要素校验
     * Summary: 个人二要素校验.
     *
     * @param VerifyPrivatepersonTwometaRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return VerifyPrivatepersonTwometaResponse
     */
    public function verifyPrivatepersonTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyPrivatepersonTwometaResponse::fromMap($this->doRequest('1.0', 'twc.notary.privateperson.twometa.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业二要素校验
     * Summary: 企业二要素校验.
     *
     * @param VerifyPrivatecompanyTwometaRequest $request
     *
     * @return VerifyPrivatecompanyTwometaResponse
     */
    public function verifyPrivatecompanyTwometa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyPrivatecompanyTwometaEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业二要素校验
     * Summary: 企业二要素校验.
     *
     * @param VerifyPrivatecompanyTwometaRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return VerifyPrivatecompanyTwometaResponse
     */
    public function verifyPrivatecompanyTwometaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyPrivatecompanyTwometaResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecompany.twometa.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业四要素校验
     * Summary: 企业四要素校验.
     *
     * @param VerifyPrivatecompanyFourmetaRequest $request
     *
     * @return VerifyPrivatecompanyFourmetaResponse
     */
    public function verifyPrivatecompanyFourmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyPrivatecompanyFourmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业四要素校验
     * Summary: 企业四要素校验.
     *
     * @param VerifyPrivatecompanyFourmetaRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return VerifyPrivatecompanyFourmetaResponse
     */
    public function verifyPrivatecompanyFourmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyPrivatecompanyFourmetaResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecompany.fourmeta.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开放给私有云的外部用户的注册接口.
     * Summary: 私有云的外部用户注册接口.
     *
     * @param ApplyPrivatecontractCertRequest $request
     *
     * @return ApplyPrivatecontractCertResponse
     */
    public function applyPrivatecontractCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyPrivatecontractCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 开放给私有云的外部用户的注册接口.
     * Summary: 私有云的外部用户注册接口.
     *
     * @param ApplyPrivatecontractCertRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ApplyPrivatecontractCertResponse
     */
    public function applyPrivatecontractCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyPrivatecontractCertResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecontract.cert.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
     * Summary: 代扣计划状态查询.
     *
     * @param QueryContractTradestatusRequest $request
     *
     * @return QueryContractTradestatusResponse
     */
    public function queryContractTradestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractTradestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
     * Summary: 代扣计划状态查询.
     *
     * @param QueryContractTradestatusRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryContractTradestatusResponse
     */
    public function queryContractTradestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractTradestatusResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.tradestatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
     * Summary: 代扣退款查询.
     *
     * @param QueryContractRefundRequest $request
     *
     * @return QueryContractRefundResponse
     */
    public function queryContractRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
     * Summary: 代扣退款查询.
     *
     * @param QueryContractRefundRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryContractRefundResponse
     */
    public function queryContractRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractRefundResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.refund.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
     * Summary: 私有云服务获取外部用户签署地址
     *
     * @param GetPrivatecontractSignurlRequest $request
     *
     * @return GetPrivatecontractSignurlResponse
     */
    public function getPrivatecontractSignurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getPrivatecontractSignurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
     * Summary: 私有云服务获取外部用户签署地址
     *
     * @param GetPrivatecontractSignurlRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetPrivatecontractSignurlResponse
     */
    public function getPrivatecontractSignurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetPrivatecontractSignurlResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecontract.signurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
     * Summary: 商户入驻直付通进度查询.
     *
     * @param QueryContractMerchantorderRequest $request
     *
     * @return QueryContractMerchantorderResponse
     */
    public function queryContractMerchantorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractMerchantorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
     * Summary: 商户入驻直付通进度查询.
     *
     * @param QueryContractMerchantorderRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryContractMerchantorderResponse
     */
    public function queryContractMerchantorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractMerchantorderResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchantorder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
     * Summary: 商户进件信息修改.
     *
     * @param UpdateContractMerchantRequest $request
     *
     * @return UpdateContractMerchantResponse
     */
    public function updateContractMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateContractMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
     * Summary: 商户进件信息修改.
     *
     * @param UpdateContractMerchantRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateContractMerchantResponse
     */
    public function updateContractMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateContractMerchantResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
     * Summary: 二级商户代理挂接接口.
     *
     * @param BindContractMerchantRequest $request
     *
     * @return BindContractMerchantResponse
     */
    public function bindContractMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindContractMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
     * Summary: 二级商户代理挂接接口.
     *
     * @param BindContractMerchantRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return BindContractMerchantResponse
     */
    public function bindContractMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindContractMerchantResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchant.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
     * Summary: 初始化新的私有化合同服务实例.
     *
     * @param InitPrivatecontractIntanceRequest $request
     *
     * @return InitPrivatecontractIntanceResponse
     */
    public function initPrivatecontractIntance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initPrivatecontractIntanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
     * Summary: 初始化新的私有化合同服务实例.
     *
     * @param InitPrivatecontractIntanceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return InitPrivatecontractIntanceResponse
     */
    public function initPrivatecontractIntanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitPrivatecontractIntanceResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecontract.intance.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
     * Summary: 更新私有化合同服务实例信息.
     *
     * @param UpdatePrivatecontractIntanceRequest $request
     *
     * @return UpdatePrivatecontractIntanceResponse
     */
    public function updatePrivatecontractIntance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updatePrivatecontractIntanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
     * Summary: 更新私有化合同服务实例信息.
     *
     * @param UpdatePrivatecontractIntanceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdatePrivatecontractIntanceResponse
     */
    public function updatePrivatecontractIntanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdatePrivatecontractIntanceResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecontract.intance.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开放给私有云的外部用户的证书更新接口.
     * Summary: 私有云用户证书更新接口.
     *
     * @param UpdatePrivatecontractCertRequest $request
     *
     * @return UpdatePrivatecontractCertResponse
     */
    public function updatePrivatecontractCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updatePrivatecontractCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 开放给私有云的外部用户的证书更新接口.
     * Summary: 私有云用户证书更新接口.
     *
     * @param UpdatePrivatecontractCertRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdatePrivatecontractCertResponse
     */
    public function updatePrivatecontractCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdatePrivatecontractCertResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecontract.cert.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
     * Summary: 商户进件申请信息重置.
     *
     * @param ResetContractMerchantapplyRequest $request
     *
     * @return ResetContractMerchantapplyResponse
     */
    public function resetContractMerchantapply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetContractMerchantapplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
     * Summary: 商户进件申请信息重置.
     *
     * @param ResetContractMerchantapplyRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ResetContractMerchantapplyResponse
     */
    public function resetContractMerchantapplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetContractMerchantapplyResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.merchantapply.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
     * Summary: 校验私有化合同服务实例权限情况.
     *
     * @param CheckPrivatecontractProvisionRequest $request
     *
     * @return CheckPrivatecontractProvisionResponse
     */
    public function checkPrivatecontractProvision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkPrivatecontractProvisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
     * Summary: 校验私有化合同服务实例权限情况.
     *
     * @param CheckPrivatecontractProvisionRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CheckPrivatecontractProvisionResponse
     */
    public function checkPrivatecontractProvisionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckPrivatecontractProvisionResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecontract.provision.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 私有化合同服务实例计量数据推送
     * Summary: 私有化合同服务实例计量数据推送
     *
     * @param PushPrivatecontractGaugeRequest $request
     *
     * @return PushPrivatecontractGaugeResponse
     */
    public function pushPrivatecontractGauge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushPrivatecontractGaugeEx($request, $headers, $runtime);
    }

    /**
     * Description: 私有化合同服务实例计量数据推送
     * Summary: 私有化合同服务实例计量数据推送
     *
     * @param PushPrivatecontractGaugeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PushPrivatecontractGaugeResponse
     */
    public function pushPrivatecontractGaugeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushPrivatecontractGaugeResponse::fromMap($this->doRequest('1.0', 'twc.notary.privatecontract.gauge.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
     * Summary: 法院代扣账户扣款预校验.
     *
     * @param CheckContractCourtdeductRequest $request
     *
     * @return CheckContractCourtdeductResponse
     */
    public function checkContractCourtdeduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkContractCourtdeductEx($request, $headers, $runtime);
    }

    /**
     * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
     * Summary: 法院代扣账户扣款预校验.
     *
     * @param CheckContractCourtdeductRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CheckContractCourtdeductResponse
     */
    public function checkContractCourtdeductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckContractCourtdeductResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.courtdeduct.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 法院代扣计划创建
     * Summary: 法院代扣计划创建.
     *
     * @param CreateContractCourtdeductRequest $request
     *
     * @return CreateContractCourtdeductResponse
     */
    public function createContractCourtdeduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractCourtdeductEx($request, $headers, $runtime);
    }

    /**
     * Description: 法院代扣计划创建
     * Summary: 法院代扣计划创建.
     *
     * @param CreateContractCourtdeductRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateContractCourtdeductResponse
     */
    public function createContractCourtdeductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractCourtdeductResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.courtdeduct.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 法院代扣执行扣款
     * Summary: 法院代扣执行扣款.
     *
     * @param ExecContractCourtdeductRequest $request
     *
     * @return ExecContractCourtdeductResponse
     */
    public function execContractCourtdeduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractCourtdeductEx($request, $headers, $runtime);
    }

    /**
     * Description: 法院代扣执行扣款
     * Summary: 法院代扣执行扣款.
     *
     * @param ExecContractCourtdeductRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ExecContractCourtdeductResponse
     */
    public function execContractCourtdeductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractCourtdeductResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.courtdeduct.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本签名
     * Summary: 文本签接口.
     *
     * @param GetContractTextsignRequest $request
     *
     * @return GetContractTextsignResponse
     */
    public function getContractTextsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContractTextsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本签名
     * Summary: 文本签接口.
     *
     * @param GetContractTextsignRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetContractTextsignResponse
     */
    public function getContractTextsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContractTextsignResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.textsign.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本验签
     * Summary: 文本验签接口.
     *
     * @param VerifyContractTextsignRequest $request
     *
     * @return VerifyContractTextsignResponse
     */
    public function verifyContractTextsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyContractTextsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本验签
     * Summary: 文本验签接口.
     *
     * @param VerifyContractTextsignRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return VerifyContractTextsignResponse
     */
    public function verifyContractTextsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyContractTextsignResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.textsign.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件签验签
     * Summary: 文件签验签.
     *
     * @param VerifyContractDocsignRequest $request
     *
     * @return VerifyContractDocsignResponse
     */
    public function verifyContractDocsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyContractDocsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件签验签
     * Summary: 文件签验签.
     *
     * @param VerifyContractDocsignRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return VerifyContractDocsignResponse
     */
    public function verifyContractDocsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyContractDocsignResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.docsign.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除签署区
     * Summary: 删除签署区.
     *
     * @param DeleteContractSignfieldRequest $request
     *
     * @return DeleteContractSignfieldResponse
     */
    public function deleteContractSignfield($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteContractSignfieldEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除签署区
     * Summary: 删除签署区.
     *
     * @param DeleteContractSignfieldRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteContractSignfieldResponse
     */
    public function deleteContractSignfieldEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteContractSignfieldResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.signfield.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建平台方用户接口twc.notary.contract.user.create加密版
     * Summary: 创建平台方用户加密版.
     *
     * @param CreateContractEncrypteduserRequest $request
     *
     * @return CreateContractEncrypteduserResponse
     */
    public function createContractEncrypteduser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractEncrypteduserEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建平台方用户接口twc.notary.contract.user.create加密版
     * Summary: 创建平台方用户加密版.
     *
     * @param CreateContractEncrypteduserRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateContractEncrypteduserResponse
     */
    public function createContractEncrypteduserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractEncrypteduserResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.encrypteduser.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
     * Summary: 用户密钥设置接口.
     *
     * @param SetContractTenantkeyRequest $request
     *
     * @return SetContractTenantkeyResponse
     */
    public function setContractTenantkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setContractTenantkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
     * Summary: 用户密钥设置接口.
     *
     * @param SetContractTenantkeyRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SetContractTenantkeyResponse
     */
    public function setContractTenantkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetContractTenantkeyResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.tenantkey.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取加密文件上传链接
     * Summary: 获取加密文件上传链接.
     *
     * @param GetContractEncryptedfileuploadurlRequest $request
     *
     * @return GetContractEncryptedfileuploadurlResponse
     */
    public function getContractEncryptedfileuploadurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContractEncryptedfileuploadurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取加密文件上传链接
     * Summary: 获取加密文件上传链接.
     *
     * @param GetContractEncryptedfileuploadurlRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return GetContractEncryptedfileuploadurlResponse
     */
    public function getContractEncryptedfileuploadurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContractEncryptedfileuploadurlResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.encryptedfileuploadurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建异步任务
     * Summary: 创建任务接口.
     *
     * @param CreateContractTaskRequest $request
     *
     * @return CreateContractTaskResponse
     */
    public function createContractTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContractTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建异步任务
     * Summary: 创建任务接口.
     *
     * @param CreateContractTaskRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateContractTaskResponse
     */
    public function createContractTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContractTaskResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 任务查询接口
     * Summary: 任务查询.
     *
     * @param QueryContractTaskRequest $request
     *
     * @return QueryContractTaskResponse
     */
    public function queryContractTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 任务查询接口
     * Summary: 任务查询.
     *
     * @param QueryContractTaskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryContractTaskResponse
     */
    public function queryContractTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractTaskResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
     * Summary: 合同代扣触发接口.
     *
     * @param ExecContractPayRequest $request
     *
     * @return ExecContractPayResponse
     */
    public function execContractPay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractPayEx($request, $headers, $runtime);
    }

    /**
     * Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
     * Summary: 合同代扣触发接口.
     *
     * @param ExecContractPayRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecContractPayResponse
     */
    public function execContractPayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractPayResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.pay.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
     * Summary: 代扣强制解约.
     *
     * @param UnbindContractPayRequest $request
     *
     * @return UnbindContractPayResponse
     */
    public function unbindContractPay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindContractPayEx($request, $headers, $runtime);
    }

    /**
     * Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
     * Summary: 代扣强制解约.
     *
     * @param UnbindContractPayRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UnbindContractPayResponse
     */
    public function unbindContractPayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindContractPayResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.pay.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
     * Summary: 投诉数据查询.
     *
     * @param QueryContractComplainRequest $request
     *
     * @return QueryContractComplainResponse
     */
    public function queryContractComplain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractComplainEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
     * Summary: 投诉数据查询.
     *
     * @param QueryContractComplainRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryContractComplainResponse
     */
    public function queryContractComplainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractComplainResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.complain.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
     * Summary: 投诉反馈.
     *
     * @param SendContractComplainfeedbackRequest $request
     *
     * @return SendContractComplainfeedbackResponse
     */
    public function sendContractComplainfeedback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendContractComplainfeedbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
     * Summary: 投诉反馈.
     *
     * @param SendContractComplainfeedbackRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return SendContractComplainfeedbackResponse
     */
    public function sendContractComplainfeedbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendContractComplainfeedbackResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.complainfeedback.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户上传处理图片
     * Summary: 商户上传处理图片.
     *
     * @param UploadContractComplainimageRequest $request
     *
     * @return UploadContractComplainimageResponse
     */
    public function uploadContractComplainimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadContractComplainimageEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户上传处理图片
     * Summary: 商户上传处理图片.
     *
     * @param UploadContractComplainimageRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UploadContractComplainimageResponse
     */
    public function uploadContractComplainimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadContractComplainimageResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.complainimage.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据起止日期查询体验宝投诉工单
     * Summary: 根据起止日期查询体验宝投诉工单.
     *
     * @param QueryContractComplaineventidsRequest $request
     *
     * @return QueryContractComplaineventidsResponse
     */
    public function queryContractComplaineventids($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractComplaineventidsEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据起止日期查询体验宝投诉工单
     * Summary: 根据起止日期查询体验宝投诉工单.
     *
     * @param QueryContractComplaineventidsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryContractComplaineventidsResponse
     */
    public function queryContractComplaineventidsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractComplaineventidsResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.complaineventids.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对ato等系统提供区块链合同签署流程撤销能力
     * Summary: 区块链合同签署流程撤销
     *
     * @param CancelContractFlowRequest $request
     *
     * @return CancelContractFlowResponse
     */
    public function cancelContractFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelContractFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 对ato等系统提供区块链合同签署流程撤销能力
     * Summary: 区块链合同签署流程撤销
     *
     * @param CancelContractFlowRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CancelContractFlowResponse
     */
    public function cancelContractFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelContractFlowResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.flow.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 转化短链接
     * Summary: 转化短链接.
     *
     * @param TransferGeneralShortenurlRequest $request
     *
     * @return TransferGeneralShortenurlResponse
     */
    public function transferGeneralShortenurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->transferGeneralShortenurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 转化短链接
     * Summary: 转化短链接.
     *
     * @param TransferGeneralShortenurlRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return TransferGeneralShortenurlResponse
     */
    public function transferGeneralShortenurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return TransferGeneralShortenurlResponse::fromMap($this->doRequest('1.0', 'twc.notary.general.shortenurl.transfer', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 触发合同提交归档
     * Summary: 合同提交归档.
     *
     * @param SubmitContractArchiveRequest $request
     *
     * @return SubmitContractArchiveResponse
     */
    public function submitContractArchive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitContractArchiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 触发合同提交归档
     * Summary: 合同提交归档.
     *
     * @param SubmitContractArchiveRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SubmitContractArchiveResponse
     */
    public function submitContractArchiveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitContractArchiveResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.archive.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链合同代扣订单列表
     * Summary: 代扣订单列表.
     *
     * @param ListContractDeductorderRequest $request
     *
     * @return ListContractDeductorderResponse
     */
    public function listContractDeductorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listContractDeductorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链合同代扣订单列表
     * Summary: 代扣订单列表.
     *
     * @param ListContractDeductorderRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListContractDeductorderResponse
     */
    public function listContractDeductorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListContractDeductorderResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.deductorder.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣订单详情
     * Summary: 代扣订单详情.
     *
     * @param QueryContractDeductdetailRequest $request
     *
     * @return QueryContractDeductdetailResponse
     */
    public function queryContractDeductdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractDeductdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣订单详情
     * Summary: 代扣订单详情.
     *
     * @param QueryContractDeductdetailRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryContractDeductdetailResponse
     */
    public function queryContractDeductdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractDeductdetailResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.deductdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据支付宝商家订单号查询交易单
     * Summary: 根据交易号查询订单.
     *
     * @param QueryContractDedcutpayinfoRequest $request
     *
     * @return QueryContractDedcutpayinfoResponse
     */
    public function queryContractDedcutpayinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractDedcutpayinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据支付宝商家订单号查询交易单
     * Summary: 根据交易号查询订单.
     *
     * @param QueryContractDedcutpayinfoRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryContractDedcutpayinfoResponse
     */
    public function queryContractDedcutpayinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractDedcutpayinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.dedcutpayinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户使用mp4内容，集成方通过该openAPI进行使用上报。
     * Summary: 集成方通过该接口进行使用mp4上报.
     *
     * @param PushDigitalcontentUsageRequest $request
     *
     * @return PushDigitalcontentUsageResponse
     */
    public function pushDigitalcontentUsage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushDigitalcontentUsageEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户使用mp4内容，集成方通过该openAPI进行使用上报。
     * Summary: 集成方通过该接口进行使用mp4上报.
     *
     * @param PushDigitalcontentUsageRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return PushDigitalcontentUsageResponse
     */
    public function pushDigitalcontentUsageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushDigitalcontentUsageResponse::fromMap($this->doRequest('1.0', 'twc.notary.digitalcontent.usage.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户使用apk内容，集成方通过该openAPI申请该使用的订单id。
     * Summary: 集成方通过该接口申请apk订单id.
     *
     * @param ApplyDigitalcontentOrderRequest $request
     *
     * @return ApplyDigitalcontentOrderResponse
     */
    public function applyDigitalcontentOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDigitalcontentOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户使用apk内容，集成方通过该openAPI申请该使用的订单id。
     * Summary: 集成方通过该接口申请apk订单id.
     *
     * @param ApplyDigitalcontentOrderRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ApplyDigitalcontentOrderResponse
     */
    public function applyDigitalcontentOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDigitalcontentOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.digitalcontent.order.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户使用apk内容支付后，集成方通过订单id和支付id反馈支付结果，并申请交互token。
     * Summary: 集成方反馈apk订单支付结果.
     *
     * @param SubmitDigitalcontentOrderRequest $request
     *
     * @return SubmitDigitalcontentOrderResponse
     */
    public function submitDigitalcontentOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitDigitalcontentOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户使用apk内容支付后，集成方通过订单id和支付id反馈支付结果，并申请交互token。
     * Summary: 集成方反馈apk订单支付结果.
     *
     * @param SubmitDigitalcontentOrderRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SubmitDigitalcontentOrderResponse
     */
    public function submitDigitalcontentOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitDigitalcontentOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.digitalcontent.order.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
     * Summary: 向notarycore同步事务数据.
     *
     * @param SyncInnerTransRequest $request
     *
     * @return SyncInnerTransResponse
     */
    public function syncInnerTrans($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerTransEx($request, $headers, $runtime);
    }

    /**
     * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
     * Summary: 向notarycore同步事务数据.
     *
     * @param SyncInnerTransRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SyncInnerTransResponse
     */
    public function syncInnerTransEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerTransResponse::fromMap($this->doRequest('1.0', 'twc.notary.inner.trans.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 从baas-notary向notarycore同步存证数据
     * Summary: 向notarycore同步存证数据.
     *
     * @param SyncInnerNotaryRequest $request
     *
     * @return SyncInnerNotaryResponse
     */
    public function syncInnerNotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerNotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 从baas-notary向notarycore同步存证数据
     * Summary: 向notarycore同步存证数据.
     *
     * @param SyncInnerNotaryRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SyncInnerNotaryResponse
     */
    public function syncInnerNotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerNotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.inner.notary.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 从baas-notary向notarycore同步自租户信息
     * Summary: 向notarycore同步子租户数据.
     *
     * @param SyncInnerTwcopenRequest $request
     *
     * @return SyncInnerTwcopenResponse
     */
    public function syncInnerTwcopen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerTwcopenEx($request, $headers, $runtime);
    }

    /**
     * Description: 从baas-notary向notarycore同步自租户信息
     * Summary: 向notarycore同步子租户数据.
     *
     * @param SyncInnerTwcopenRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SyncInnerTwcopenResponse
     */
    public function syncInnerTwcopenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerTwcopenResponse::fromMap($this->doRequest('1.0', 'twc.notary.inner.twcopen.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 从baas-notary向notarycore同步租户权限数据
     * Summary: 向notarycore同步租户数据.
     *
     * @param SyncInnerProvisionRequest $request
     *
     * @return SyncInnerProvisionResponse
     */
    public function syncInnerProvision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerProvisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 从baas-notary向notarycore同步租户权限数据
     * Summary: 向notarycore同步租户数据.
     *
     * @param SyncInnerProvisionRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SyncInnerProvisionResponse
     */
    public function syncInnerProvisionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerProvisionResponse::fromMap($this->doRequest('1.0', 'twc.notary.inner.provision.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 从baas-notary向notarycore同步tsr数据
     * Summary: 向notarycore同步tsr数据.
     *
     * @param SyncInnerTsrRequest $request
     *
     * @return SyncInnerTsrResponse
     */
    public function syncInnerTsr($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerTsrEx($request, $headers, $runtime);
    }

    /**
     * Description: 从baas-notary向notarycore同步tsr数据
     * Summary: 向notarycore同步tsr数据.
     *
     * @param SyncInnerTsrRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return SyncInnerTsrResponse
     */
    public function syncInnerTsrEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerTsrResponse::fromMap($this->doRequest('1.0', 'twc.notary.inner.tsr.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 转化短链接(废弃)
     * Summary: 转化短链接(废弃).
     *
     * @param TransferInnerShorturlRequest $request
     *
     * @return TransferInnerShorturlResponse
     */
    public function transferInnerShorturl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->transferInnerShorturlEx($request, $headers, $runtime);
    }

    /**
     * Description: 转化短链接(废弃)
     * Summary: 转化短链接(废弃).
     *
     * @param TransferInnerShorturlRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return TransferInnerShorturlResponse
     */
    public function transferInnerShorturlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return TransferInnerShorturlResponse::fromMap($this->doRequest('1.0', 'twc.notary.inner.shorturl.transfer', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 发起实人认证，这是改造后的接口
     * Summary: 实人认证创建.
     *
     * @param CreateIdentificationRealpersonRequest $request
     *
     * @return CreateIdentificationRealpersonResponse
     */
    public function createIdentificationRealperson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createIdentificationRealpersonEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起实人认证，这是改造后的接口
     * Summary: 实人认证创建.
     *
     * @param CreateIdentificationRealpersonRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CreateIdentificationRealpersonResponse
     */
    public function createIdentificationRealpersonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateIdentificationRealpersonResponse::fromMap($this->doRequest('1.0', 'twc.notary.identification.realperson.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果.
     *
     * @param QueryIdentificationRealpersonRequest $request
     *
     * @return QueryIdentificationRealpersonResponse
     */
    public function queryIdentificationRealperson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIdentificationRealpersonEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实人认证结果
     * Summary: 查询实人认证结果.
     *
     * @param QueryIdentificationRealpersonRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryIdentificationRealpersonResponse
     */
    public function queryIdentificationRealpersonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIdentificationRealpersonResponse::fromMap($this->doRequest('1.0', 'twc.notary.identification.realperson.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 汇裁证据要素查询接口
     * Summary: 汇裁证据要素查询接口.
     *
     * @param QueryJusticeCaseinfoRequest $request
     *
     * @return QueryJusticeCaseinfoResponse
     */
    public function queryJusticeCaseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryJusticeCaseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 汇裁证据要素查询接口
     * Summary: 汇裁证据要素查询接口.
     *
     * @param QueryJusticeCaseinfoRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryJusticeCaseinfoResponse
     */
    public function queryJusticeCaseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryJusticeCaseinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.caseinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
     * Summary: 获取OSS文件上传路径.
     *
     * @param GetJusticeUploadfilepathRequest $request
     *
     * @return GetJusticeUploadfilepathResponse
     */
    public function getJusticeUploadfilepath($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getJusticeUploadfilepathEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
     * Summary: 获取OSS文件上传路径.
     *
     * @param GetJusticeUploadfilepathRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetJusticeUploadfilepathResponse
     */
    public function getJusticeUploadfilepathEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetJusticeUploadfilepathResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.uploadfilepath.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
     * Summary: 自动进件案件回写.
     *
     * @param CreateJusticeCasewritebackRequest $request
     *
     * @return CreateJusticeCasewritebackResponse
     */
    public function createJusticeCasewriteback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createJusticeCasewritebackEx($request, $headers, $runtime);
    }

    /**
     * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
     * Summary: 自动进件案件回写.
     *
     * @param CreateJusticeCasewritebackRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateJusticeCasewritebackResponse
     */
    public function createJusticeCasewritebackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateJusticeCasewritebackResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.casewriteback.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 案件基础信息查询
     * Summary: 案件基础信息查询.
     *
     * @param QueryJusticeBasecaseRequest $request
     *
     * @return QueryJusticeBasecaseResponse
     */
    public function queryJusticeBasecase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryJusticeBasecaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 案件基础信息查询
     * Summary: 案件基础信息查询.
     *
     * @param QueryJusticeBasecaseRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryJusticeBasecaseResponse
     */
    public function queryJusticeBasecaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryJusticeBasecaseResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.basecase.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 案件材料下载
     * Summary: 案件材料下载.
     *
     * @param DownloadJusticeCasefileRequest $request
     *
     * @return DownloadJusticeCasefileResponse
     */
    public function downloadJusticeCasefile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadJusticeCasefileEx($request, $headers, $runtime);
    }

    /**
     * Description: 案件材料下载
     * Summary: 案件材料下载.
     *
     * @param DownloadJusticeCasefileRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DownloadJusticeCasefileResponse
     */
    public function downloadJusticeCasefileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadJusticeCasefileResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.casefile.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开通纠纷平台使用权限
     * Summary: 开通纠纷平台使用权限.
     *
     * @param OpenInternalJudicialRequest $request
     *
     * @return OpenInternalJudicialResponse
     */
    public function openInternalJudicial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openInternalJudicialEx($request, $headers, $runtime);
    }

    /**
     * Description: 开通纠纷平台使用权限
     * Summary: 开通纠纷平台使用权限.
     *
     * @param OpenInternalJudicialRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return OpenInternalJudicialResponse
     */
    public function openInternalJudicialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenInternalJudicialResponse::fromMap($this->doRequest('1.0', 'twc.notary.internal.judicial.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 案件当事人信息保存
     * Summary: 案件当事人信息保存.
     *
     * @param SaveJusticePartyRequest $request
     *
     * @return SaveJusticePartyResponse
     */
    public function saveJusticeParty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveJusticePartyEx($request, $headers, $runtime);
    }

    /**
     * Description: 案件当事人信息保存
     * Summary: 案件当事人信息保存.
     *
     * @param SaveJusticePartyRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SaveJusticePartyResponse
     */
    public function saveJusticePartyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveJusticePartyResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.party.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 普通案件创建
     * Summary: 普通案件创建.
     *
     * @param CreateJusticeNormalcaseRequest $request
     *
     * @return CreateJusticeNormalcaseResponse
     */
    public function createJusticeNormalcase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createJusticeNormalcaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 普通案件创建
     * Summary: 普通案件创建.
     *
     * @param CreateJusticeNormalcaseRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateJusticeNormalcaseResponse
     */
    public function createJusticeNormalcaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateJusticeNormalcaseResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.normalcase.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上案件创建
     * Summary: 链上案件创建.
     *
     * @param CreateJusticeChaincaseRequest $request
     *
     * @return CreateJusticeChaincaseResponse
     */
    public function createJusticeChaincase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createJusticeChaincaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上案件创建
     * Summary: 链上案件创建.
     *
     * @param CreateJusticeChaincaseRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateJusticeChaincaseResponse
     */
    public function createJusticeChaincaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateJusticeChaincaseResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.chaincase.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 案件维权发起
     * Summary: 案件维权发起.
     *
     * @param StartJusticeCaseRequest $request
     *
     * @return StartJusticeCaseResponse
     */
    public function startJusticeCase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startJusticeCaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 案件维权发起
     * Summary: 案件维权发起.
     *
     * @param StartJusticeCaseRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return StartJusticeCaseResponse
     */
    public function startJusticeCaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartJusticeCaseResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.case.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 案件查询
     * Summary: 案件查询.
     *
     * @param QueryJusticeCaseRequest $request
     *
     * @return QueryJusticeCaseResponse
     */
    public function queryJusticeCase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryJusticeCaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 案件查询
     * Summary: 案件查询.
     *
     * @param QueryJusticeCaseRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryJusticeCaseResponse
     */
    public function queryJusticeCaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryJusticeCaseResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.case.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 案件事件响应
     * Summary: 案件事件响应.
     *
     * @param OperateJusticeEventRequest $request
     *
     * @return OperateJusticeEventResponse
     */
    public function operateJusticeEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateJusticeEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 案件事件响应
     * Summary: 案件事件响应.
     *
     * @param OperateJusticeEventRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return OperateJusticeEventResponse
     */
    public function operateJusticeEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateJusticeEventResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.event.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 司法解纷平台API服务，创建案件要素模板接口
     * Summary: 创建案件要素模板
     *
     * @param CreateJusticeCasetemplateRequest $request
     *
     * @return CreateJusticeCasetemplateResponse
     */
    public function createJusticeCasetemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createJusticeCasetemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 司法解纷平台API服务，创建案件要素模板接口
     * Summary: 创建案件要素模板
     *
     * @param CreateJusticeCasetemplateRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateJusticeCasetemplateResponse
     */
    public function createJusticeCasetemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateJusticeCasetemplateResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.casetemplate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 司法解纷平台API服务，创建维权要素模板接口
     * Summary: 创建维权要素模板
     *
     * @param CreateJusticeRightprotecttemplateRequest $request
     *
     * @return CreateJusticeRightprotecttemplateResponse
     */
    public function createJusticeRightprotecttemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createJusticeRightprotecttemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 司法解纷平台API服务，创建维权要素模板接口
     * Summary: 创建维权要素模板
     *
     * @param CreateJusticeRightprotecttemplateRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return CreateJusticeRightprotecttemplateResponse
     */
    public function createJusticeRightprotecttemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateJusticeRightprotecttemplateResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.rightprotecttemplate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取司法文件上传链接
     * Summary: 获取司法文件上传链接.
     *
     * @param GetJusticeFileuploadurlRequest $request
     *
     * @return GetJusticeFileuploadurlResponse
     */
    public function getJusticeFileuploadurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getJusticeFileuploadurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取司法文件上传链接
     * Summary: 获取司法文件上传链接.
     *
     * @param GetJusticeFileuploadurlRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetJusticeFileuploadurlResponse
     */
    public function getJusticeFileuploadurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetJusticeFileuploadurlResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.fileuploadurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 司法解纷平台API服务，创建文书要素模板接口
     * Summary: 创建文书要素模板
     *
     * @param CreateJusticeDocumenttemplateRequest $request
     *
     * @return CreateJusticeDocumenttemplateResponse
     */
    public function createJusticeDocumenttemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createJusticeDocumenttemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 司法解纷平台API服务，创建文书要素模板接口
     * Summary: 创建文书要素模板
     *
     * @param CreateJusticeDocumenttemplateRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateJusticeDocumenttemplateResponse
     */
    public function createJusticeDocumenttemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateJusticeDocumenttemplateResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.documenttemplate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 仲裁-通用版本进件要素信息查询
     * Summary: 仲裁-通用版本进件要素信息查询.
     *
     * @param QueryJusticeCommoncaseinfoRequest $request
     *
     * @return QueryJusticeCommoncaseinfoResponse
     */
    public function queryJusticeCommoncaseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryJusticeCommoncaseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 仲裁-通用版本进件要素信息查询
     * Summary: 仲裁-通用版本进件要素信息查询.
     *
     * @param QueryJusticeCommoncaseinfoRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryJusticeCommoncaseinfoResponse
     */
    public function queryJusticeCommoncaseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryJusticeCommoncaseinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.commoncaseinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 1级商户为2级商户进件
     * Summary: 代理二级商户进件.
     *
     * @param CreateJusticeAgentcaseRequest $request
     *
     * @return CreateJusticeAgentcaseResponse
     */
    public function createJusticeAgentcase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createJusticeAgentcaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 1级商户为2级商户进件
     * Summary: 代理二级商户进件.
     *
     * @param CreateJusticeAgentcaseRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateJusticeAgentcaseResponse
     */
    public function createJusticeAgentcaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateJusticeAgentcaseResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.agentcase.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: isv机构-案件要素查询
     * Summary: isv机构-案件要素查询.
     *
     * @param QueryJusticeRightsRequest $request
     *
     * @return QueryJusticeRightsResponse
     */
    public function queryJusticeRights($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryJusticeRightsEx($request, $headers, $runtime);
    }

    /**
     * Description: isv机构-案件要素查询
     * Summary: isv机构-案件要素查询.
     *
     * @param QueryJusticeRightsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryJusticeRightsResponse
     */
    public function queryJusticeRightsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryJusticeRightsResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.rights.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: isv机构-维权状态更新
     * Summary: isv机构-维权状态更新.
     *
     * @param UpdateJusticeRightsRequest $request
     *
     * @return UpdateJusticeRightsResponse
     */
    public function updateJusticeRights($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateJusticeRightsEx($request, $headers, $runtime);
    }

    /**
     * Description: isv机构-维权状态更新
     * Summary: isv机构-维权状态更新.
     *
     * @param UpdateJusticeRightsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateJusticeRightsResponse
     */
    public function updateJusticeRightsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateJusticeRightsResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.rights.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: isv机构-案件缴费通知接口
     * Summary: isv机构-案件缴费通知接口.
     *
     * @param NotifyJusticeRightspaymentRequest $request
     *
     * @return NotifyJusticeRightspaymentResponse
     */
    public function notifyJusticeRightspayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyJusticeRightspaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: isv机构-案件缴费通知接口
     * Summary: isv机构-案件缴费通知接口.
     *
     * @param NotifyJusticeRightspaymentRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return NotifyJusticeRightspaymentResponse
     */
    public function notifyJusticeRightspaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyJusticeRightspaymentResponse::fromMap($this->doRequest('1.0', 'twc.notary.justice.rightspayment.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 同步采购平台订单状态
     * Summary: 同步采购平台订单状态
     *
     * @param SyncLeaseSupplierorderstatusRequest $request
     *
     * @return SyncLeaseSupplierorderstatusResponse
     */
    public function syncLeaseSupplierorderstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncLeaseSupplierorderstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步采购平台订单状态
     * Summary: 同步采购平台订单状态
     *
     * @param SyncLeaseSupplierorderstatusRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return SyncLeaseSupplierorderstatusResponse
     */
    public function syncLeaseSupplierorderstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncLeaseSupplierorderstatusResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.supplierorderstatus.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 采购供应商初始化
     * Summary: 采购供应商初始化.
     *
     * @param InitLeaseSupplierRequest $request
     *
     * @return InitLeaseSupplierResponse
     */
    public function initLeaseSupplier($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initLeaseSupplierEx($request, $headers, $runtime);
    }

    /**
     * Description: 采购供应商初始化
     * Summary: 采购供应商初始化.
     *
     * @param InitLeaseSupplierRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return InitLeaseSupplierResponse
     */
    public function initLeaseSupplierEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitLeaseSupplierResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.supplier.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
     * Summary: 租赁订单接收采购状态信息，完成采购流程.
     *
     * @param FinishLeaseSupplierstatusRequest $request
     *
     * @return FinishLeaseSupplierstatusResponse
     */
    public function finishLeaseSupplierstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishLeaseSupplierstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
     * Summary: 租赁订单接收采购状态信息，完成采购流程.
     *
     * @param FinishLeaseSupplierstatusRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return FinishLeaseSupplierstatusResponse
     */
    public function finishLeaseSupplierstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishLeaseSupplierstatusResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.supplierstatus.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 采购商品初始化
     * Summary: 采购商品初始化.
     *
     * @param CreateLeaseSupplierproductRequest $request
     *
     * @return CreateLeaseSupplierproductResponse
     */
    public function createLeaseSupplierproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseSupplierproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 采购商品初始化
     * Summary: 采购商品初始化.
     *
     * @param CreateLeaseSupplierproductRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateLeaseSupplierproductResponse
     */
    public function createLeaseSupplierproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseSupplierproductResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.supplierproduct.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上采购申请
     * Summary: 链上采购申请.
     *
     * @param ApplyLeaseSupplierorderRequest $request
     *
     * @return ApplyLeaseSupplierorderResponse
     */
    public function applyLeaseSupplierorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyLeaseSupplierorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上采购申请
     * Summary: 链上采购申请.
     *
     * @param ApplyLeaseSupplierorderRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ApplyLeaseSupplierorderResponse
     */
    public function applyLeaseSupplierorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyLeaseSupplierorderResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.supplierorder.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建融资租赁提前还款人脸认证信息
     * Summary: 创建融资租赁提前还款人脸认证信息.
     *
     * @param CreateLeaseFinancecertifyRequest $request
     *
     * @return CreateLeaseFinancecertifyResponse
     */
    public function createLeaseFinancecertify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseFinancecertifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建融资租赁提前还款人脸认证信息
     * Summary: 创建融资租赁提前还款人脸认证信息.
     *
     * @param CreateLeaseFinancecertifyRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateLeaseFinancecertifyResponse
     */
    public function createLeaseFinancecertifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseFinancecertifyResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.financecertify.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁提前还款人脸识别核验
     * Summary: 融资租赁提前还款人脸识别核验.
     *
     * @param QueryLeaseFinancecertifyRequest $request
     *
     * @return QueryLeaseFinancecertifyResponse
     */
    public function queryLeaseFinancecertify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseFinancecertifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁提前还款人脸识别核验
     * Summary: 融资租赁提前还款人脸识别核验.
     *
     * @param QueryLeaseFinancecertifyRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryLeaseFinancecertifyResponse
     */
    public function queryLeaseFinancecertifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseFinancecertifyResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.financecertify.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询融资租赁合约内核验结果
     * Summary: 查询融资租赁合约内核验结果.
     *
     * @param QueryLeaseFinancecertifyincontractRequest $request
     *
     * @return QueryLeaseFinancecertifyincontractResponse
     */
    public function queryLeaseFinancecertifyincontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseFinancecertifyincontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询融资租赁合约内核验结果
     * Summary: 查询融资租赁合约内核验结果.
     *
     * @param QueryLeaseFinancecertifyincontractRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryLeaseFinancecertifyincontractResponse
     */
    public function queryLeaseFinancecertifyincontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseFinancecertifyincontractResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.financecertifyincontract.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁用户信息查询
     * Summary: 融资租赁用户信息查询.
     *
     * @param QueryLeaseUserRequest $request
     *
     * @return QueryLeaseUserResponse
     */
    public function queryLeaseUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁用户信息查询
     * Summary: 融资租赁用户信息查询.
     *
     * @param QueryLeaseUserRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryLeaseUserResponse
     */
    public function queryLeaseUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseUserResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁订单详情查询
     * Summary: 融资租赁订单详情查询.
     *
     * @param QueryLeaseOrderdetailinfoRequest $request
     *
     * @return QueryLeaseOrderdetailinfoResponse
     */
    public function queryLeaseOrderdetailinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseOrderdetailinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁订单详情查询
     * Summary: 融资租赁订单详情查询.
     *
     * @param QueryLeaseOrderdetailinfoRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryLeaseOrderdetailinfoResponse
     */
    public function queryLeaseOrderdetailinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseOrderdetailinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.orderdetailinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁租赁机构承诺查询
     * Summary: 融资租赁租赁机构承诺查询.
     *
     * @param QueryLeaseLeasepromiseRequest $request
     *
     * @return QueryLeaseLeasepromiseResponse
     */
    public function queryLeaseLeasepromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseLeasepromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁租赁机构承诺查询
     * Summary: 融资租赁租赁机构承诺查询.
     *
     * @param QueryLeaseLeasepromiseRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryLeaseLeasepromiseResponse
     */
    public function queryLeaseLeasepromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseLeasepromiseResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.leasepromise.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁资方承诺查询
     * Summary: 融资租赁资方承诺查询.
     *
     * @param QueryLeaseCreditpromiseRequest $request
     *
     * @return QueryLeaseCreditpromiseResponse
     */
    public function queryLeaseCreditpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseCreditpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁资方承诺查询
     * Summary: 融资租赁资方承诺查询.
     *
     * @param QueryLeaseCreditpromiseRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryLeaseCreditpromiseResponse
     */
    public function queryLeaseCreditpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseCreditpromiseResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.creditpromise.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁订单清分信息查询
     * Summary: 融资租赁订单清分信息查询.
     *
     * @param QueryLeaseClearingRequest $request
     *
     * @return QueryLeaseClearingResponse
     */
    public function queryLeaseClearing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseClearingEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁订单清分信息查询
     * Summary: 融资租赁订单清分信息查询.
     *
     * @param QueryLeaseClearingRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryLeaseClearingResponse
     */
    public function queryLeaseClearingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseClearingResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.clearing.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁用户侧还款信息
     * Summary: 融资租赁用户侧还款信息.
     *
     * @param QueryLeaseRentalinfoRequest $request
     *
     * @return QueryLeaseRentalinfoResponse
     */
    public function queryLeaseRentalinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseRentalinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁用户侧还款信息
     * Summary: 融资租赁用户侧还款信息.
     *
     * @param QueryLeaseRentalinfoRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryLeaseRentalinfoResponse
     */
    public function queryLeaseRentalinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseRentalinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.rentalinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁资方还款信息查询
     * Summary: 融资租赁资方还款信息查询.
     *
     * @param QueryLeaseRepaymentRequest $request
     *
     * @return QueryLeaseRepaymentResponse
     */
    public function queryLeaseRepayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseRepaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁资方还款信息查询
     * Summary: 融资租赁资方还款信息查询.
     *
     * @param QueryLeaseRepaymentRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryLeaseRepaymentResponse
     */
    public function queryLeaseRepaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseRepaymentResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.repayment.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询订单商品信息
     * Summary: 查询订单商品信息.
     *
     * @param QueryLeaseOrderproductRequest $request
     *
     * @return QueryLeaseOrderproductResponse
     */
    public function queryLeaseOrderproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseOrderproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询订单商品信息
     * Summary: 查询订单商品信息.
     *
     * @param QueryLeaseOrderproductRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryLeaseOrderproductResponse
     */
    public function queryLeaseOrderproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseOrderproductResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.orderproduct.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁查询资金方信息
     * Summary: 融资租赁查询资金方信息.
     *
     * @param QueryLeaseFinancecreditRequest $request
     *
     * @return QueryLeaseFinancecreditResponse
     */
    public function queryLeaseFinancecredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseFinancecreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁查询资金方信息
     * Summary: 融资租赁查询资金方信息.
     *
     * @param QueryLeaseFinancecreditRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryLeaseFinancecreditResponse
     */
    public function queryLeaseFinancecreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseFinancecreditResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.financecredit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据资产包id分页查询再融资订单id
     * Summary: 分页查询再融资订单id.
     *
     * @param QueryRefinanceOrderidRequest $request
     *
     * @return QueryRefinanceOrderidResponse
     */
    public function queryRefinanceOrderid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRefinanceOrderidEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据资产包id分页查询再融资订单id
     * Summary: 分页查询再融资订单id.
     *
     * @param QueryRefinanceOrderidRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRefinanceOrderidResponse
     */
    public function queryRefinanceOrderidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRefinanceOrderidResponse::fromMap($this->doRequest('1.0', 'twc.notary.refinance.orderid.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产明细查询
     * Summary: 资产明细.
     *
     * @param QueryRefinanceOrderRequest $request
     *
     * @return QueryRefinanceOrderResponse
     */
    public function queryRefinanceOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRefinanceOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产明细查询
     * Summary: 资产明细.
     *
     * @param QueryRefinanceOrderRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryRefinanceOrderResponse
     */
    public function queryRefinanceOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRefinanceOrderResponse::fromMap($this->doRequest('1.0', 'twc.notary.refinance.order.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 再融资的商品信息查询
     * Summary: 再融资的商品信息查询.
     *
     * @param QueryRefinanceProductRequest $request
     *
     * @return QueryRefinanceProductResponse
     */
    public function queryRefinanceProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRefinanceProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 再融资的商品信息查询
     * Summary: 再融资的商品信息查询.
     *
     * @param QueryRefinanceProductRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRefinanceProductResponse
     */
    public function queryRefinanceProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRefinanceProductResponse::fromMap($this->doRequest('1.0', 'twc.notary.refinance.product.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产包的受让/驳回资产包
     * Summary: 资产包的受让/驳回资产包.
     *
     * @param VerifyRefinancePackageRequest $request
     *
     * @return VerifyRefinancePackageResponse
     */
    public function verifyRefinancePackage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyRefinancePackageEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产包的受让/驳回资产包
     * Summary: 资产包的受让/驳回资产包.
     *
     * @param VerifyRefinancePackageRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return VerifyRefinancePackageResponse
     */
    public function verifyRefinancePackageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyRefinancePackageResponse::fromMap($this->doRequest('1.0', 'twc.notary.refinance.package.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁查询清分信息
     * Summary: 融资租赁查询清分信息.
     *
     * @param QueryLeaseOrderclearingRequest $request
     *
     * @return QueryLeaseOrderclearingResponse
     */
    public function queryLeaseOrderclearing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseOrderclearingEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁查询清分信息
     * Summary: 融资租赁查询清分信息.
     *
     * @param QueryLeaseOrderclearingRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryLeaseOrderclearingResponse
     */
    public function queryLeaseOrderclearingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseOrderclearingResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.orderclearing.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资租赁提前还款详情查询
     * Summary: 融资租赁提前还款详情查询.
     *
     * @param QueryLeaseRepaymentstatusRequest $request
     *
     * @return QueryLeaseRepaymentstatusResponse
     */
    public function queryLeaseRepaymentstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseRepaymentstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资租赁提前还款详情查询
     * Summary: 融资租赁提前还款详情查询.
     *
     * @param QueryLeaseRepaymentstatusRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryLeaseRepaymentstatusResponse
     */
    public function queryLeaseRepaymentstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseRepaymentstatusResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.repaymentstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 续租过程中，当前资方希望查询用户历史的履约表现
     * Summary: 核验链上用户的履约情况.
     *
     * @param QueryLeaseUserperformanceRequest $request
     *
     * @return QueryLeaseUserperformanceResponse
     */
    public function queryLeaseUserperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseUserperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 续租过程中，当前资方希望查询用户历史的履约表现
     * Summary: 核验链上用户的履约情况.
     *
     * @param QueryLeaseUserperformanceRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryLeaseUserperformanceResponse
     */
    public function queryLeaseUserperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseUserperformanceResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.userperformance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 履约流水核验查询
     * Summary: 履约流水核验查询.
     *
     * @param QueryLeaseRentalverifyRequest $request
     *
     * @return QueryLeaseRentalverifyResponse
     */
    public function queryLeaseRentalverify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseRentalverifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 履约流水核验查询
     * Summary: 履约流水核验查询.
     *
     * @param QueryLeaseRentalverifyRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryLeaseRentalverifyResponse
     */
    public function queryLeaseRentalverifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseRentalverifyResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.rentalverify.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分期查询用户归还记录 资方还款 清分信息
     * Summary: 分期查询用户归还记录 资方还款 清分信息.
     *
     * @param QueryLeaseInstallmentRequest $request
     *
     * @return QueryLeaseInstallmentResponse
     */
    public function queryLeaseInstallment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseInstallmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 分期查询用户归还记录 资方还款 清分信息
     * Summary: 分期查询用户归还记录 资方还款 清分信息.
     *
     * @param QueryLeaseInstallmentRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryLeaseInstallmentResponse
     */
    public function queryLeaseInstallmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseInstallmentResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.installment.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁保险退保接口
     * Summary: 租赁保险退保.
     *
     * @param CancelLeaseInsuranceRequest $request
     *
     * @return CancelLeaseInsuranceResponse
     */
    public function cancelLeaseInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelLeaseInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁保险退保接口
     * Summary: 租赁保险退保.
     *
     * @param CancelLeaseInsuranceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CancelLeaseInsuranceResponse
     */
    public function cancelLeaseInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelLeaseInsuranceResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.insurance.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
     * Summary: 再融资资产推送
     *
     * @param PushRefinanceInvalidorderRequest $request
     *
     * @return PushRefinanceInvalidorderResponse
     */
    public function pushRefinanceInvalidorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRefinanceInvalidorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
     * Summary: 再融资资产推送
     *
     * @param PushRefinanceInvalidorderRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return PushRefinanceInvalidorderResponse
     */
    public function pushRefinanceInvalidorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRefinanceInvalidorderResponse::fromMap($this->doRequest('1.0', 'twc.notary.refinance.invalidorder.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚂蚁链租赁的风控
     * Summary: 蚂蚁链租赁的风控.
     *
     * @param CreateLeaseRiskRequest $request
     *
     * @return CreateLeaseRiskResponse
     */
    public function createLeaseRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚂蚁链租赁的风控
     * Summary: 蚂蚁链租赁的风控.
     *
     * @param CreateLeaseRiskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateLeaseRiskResponse
     */
    public function createLeaseRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseRiskResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.risk.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
     * Summary: 上传租赁物购买贷款订单信息（异步）.
     *
     * @param CreateLeaseAsyncverifyinfoRequest $request
     *
     * @return CreateLeaseAsyncverifyinfoResponse
     */
    public function createLeaseAsyncverifyinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseAsyncverifyinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
     * Summary: 上传租赁物购买贷款订单信息（异步）.
     *
     * @param CreateLeaseAsyncverifyinfoRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateLeaseAsyncverifyinfoResponse
     */
    public function createLeaseAsyncverifyinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseAsyncverifyinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.asyncverifyinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
     * Summary: 融资方上传承诺信息(异步).
     *
     * @param CreateLeaseAsynccreditpromiseRequest $request
     *
     * @return CreateLeaseAsynccreditpromiseResponse
     */
    public function createLeaseAsynccreditpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseAsynccreditpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
     * Summary: 融资方上传承诺信息(异步).
     *
     * @param CreateLeaseAsynccreditpromiseRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateLeaseAsynccreditpromiseResponse
     */
    public function createLeaseAsynccreditpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseAsynccreditpromiseResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.asynccreditpromise.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
     * Summary: 清分服务机构上传资金清算记录，分期
     *
     * @param CreateLeaseAsyncclearingRequest $request
     *
     * @return CreateLeaseAsyncclearingResponse
     */
    public function createLeaseAsyncclearing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseAsyncclearingEx($request, $headers, $runtime);
    }

    /**
     * Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
     * Summary: 清分服务机构上传资金清算记录，分期
     *
     * @param CreateLeaseAsyncclearingRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateLeaseAsyncclearingResponse
     */
    public function createLeaseAsyncclearingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseAsyncclearingResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.asyncclearing.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
     * Summary: 融资金融机构上传还款信息 每期
     *
     * @param CreateLeaseAsyncrepaymentRequest $request
     *
     * @return CreateLeaseAsyncrepaymentResponse
     */
    public function createLeaseAsyncrepayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseAsyncrepaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
     * Summary: 融资金融机构上传还款信息 每期
     *
     * @param CreateLeaseAsyncrepaymentRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateLeaseAsyncrepaymentResponse
     */
    public function createLeaseAsyncrepaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseAsyncrepaymentResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.asyncrepayment.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
     * Summary: 融资平台审核订单信息.
     *
     * @param CreateLeaseAsyncauditRequest $request
     *
     * @return CreateLeaseAsyncauditResponse
     */
    public function createLeaseAsyncaudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseAsyncauditEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
     * Summary: 融资平台审核订单信息.
     *
     * @param CreateLeaseAsyncauditRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateLeaseAsyncauditResponse
     */
    public function createLeaseAsyncauditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseAsyncauditResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.asyncaudit.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
     * Summary: 租赁平台上传付款通知信息.
     *
     * @param CreateLeaseAsyncpaymentfileRequest $request
     *
     * @return CreateLeaseAsyncpaymentfileResponse
     */
    public function createLeaseAsyncpaymentfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseAsyncpaymentfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
     * Summary: 租赁平台上传付款通知信息.
     *
     * @param CreateLeaseAsyncpaymentfileRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateLeaseAsyncpaymentfileResponse
     */
    public function createLeaseAsyncpaymentfileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseAsyncpaymentfileResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.asyncpaymentfile.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
     * Summary: 查询用户等加密信息.
     *
     * @param QueryLeaseAsyncencryptedinfoRequest $request
     *
     * @return QueryLeaseAsyncencryptedinfoResponse
     */
    public function queryLeaseAsyncencryptedinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseAsyncencryptedinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
     * Summary: 查询用户等加密信息.
     *
     * @param QueryLeaseAsyncencryptedinfoRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryLeaseAsyncencryptedinfoResponse
     */
    public function queryLeaseAsyncencryptedinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseAsyncencryptedinfoResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.asyncencryptedinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁异步调用上链结果回查
     * Summary: 租赁异步调用上链结果回查.
     *
     * @param QueryLeaseAsynccallRequest $request
     *
     * @return QueryLeaseAsynccallResponse
     */
    public function queryLeaseAsynccall($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseAsynccallEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁异步调用上链结果回查
     * Summary: 租赁异步调用上链结果回查.
     *
     * @param QueryLeaseAsynccallRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryLeaseAsynccallResponse
     */
    public function queryLeaseAsynccallEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseAsynccallResponse::fromMap($this->doRequest('1.0', 'twc.notary.lease.asynccall.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

    /**
     * Description: 指定节点获取存证事务Id
     * Summary: 指定节点获取存证事务id.
     *
     * @param CreateSpecifyTransRequest $request
     *
     * @return CreateSpecifyTransResponse
     */
    public function createSpecifyTrans($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSpecifyTransEx($request, $headers, $runtime);
    }

    /**
     * Description: 指定节点获取存证事务Id
     * Summary: 指定节点获取存证事务id.
     *
     * @param CreateSpecifyTransRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateSpecifyTransResponse
     */
    public function createSpecifyTransEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSpecifyTransResponse::fromMap($this->doRequest('1.0', 'twc.notary.specify.trans.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 指定节点文本存证
     * Summary: 指定节点文本存证
     *
     * @param CreateSpecifyTextRequest $request
     *
     * @return CreateSpecifyTextResponse
     */
    public function createSpecifyText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSpecifyTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 指定节点文本存证
     * Summary: 指定节点文本存证
     *
     * @param CreateSpecifyTextRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateSpecifyTextResponse
     */
    public function createSpecifyTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSpecifyTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.specify.text.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件存证大租户内部接口
     * Summary: 文件存证内部接口.
     *
     * @param CreateInternalFileRequest $request
     *
     * @return CreateInternalFileResponse
     */
    public function createInternalFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInternalFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件存证大租户内部接口
     * Summary: 文件存证内部接口.
     *
     * @param CreateInternalFileRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateInternalFileResponse
     */
    public function createInternalFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInternalFileResponse::fromMap($this->doRequest('1.0', 'twc.notary.internal.file.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取文件存证内容内部接口
     * Summary: 获取文件存证内容内部接口.
     *
     * @param GetInternalFileRequest $request
     *
     * @return GetInternalFileResponse
     */
    public function getInternalFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInternalFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取文件存证内容内部接口
     * Summary: 获取文件存证内容内部接口.
     *
     * @param GetInternalFileRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetInternalFileResponse
     */
    public function getInternalFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInternalFileResponse::fromMap($this->doRequest('1.0', 'twc.notary.internal.file.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据流转文本存证
     * Summary: 数据流转文本存证
     *
     * @param CreateDataflowTextRequest $request
     *
     * @return CreateDataflowTextResponse
     */
    public function createDataflowText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDataflowTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据流转文本存证
     * Summary: 数据流转文本存证
     *
     * @param CreateDataflowTextRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateDataflowTextResponse
     */
    public function createDataflowTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDataflowTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.dataflow.text.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据流转文本存证内容
     * Summary: 查询数据流转文本存证内容.
     *
     * @param GetDataflowTextRequest $request
     *
     * @return GetDataflowTextResponse
     */
    public function getDataflowText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDataflowTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据流转文本存证内容
     * Summary: 查询数据流转文本存证内容.
     *
     * @param GetDataflowTextRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetDataflowTextResponse
     */
    public function getDataflowTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDataflowTextResponse::fromMap($this->doRequest('1.0', 'twc.notary.dataflow.text.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据流转存证创建存证事务
     * Summary: 数据流转存证创建存证事务
     *
     * @param CreateDataflowTransRequest $request
     *
     * @return CreateDataflowTransResponse
     */
    public function createDataflowTrans($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDataflowTransEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据流转存证创建存证事务
     * Summary: 数据流转存证创建存证事务
     *
     * @param CreateDataflowTransRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateDataflowTransResponse
     */
    public function createDataflowTransEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDataflowTransResponse::fromMap($this->doRequest('1.0', 'twc.notary.dataflow.trans.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
     * Summary: 发起管理合约部署.
     *
     * @param DeployDataflowContractRequest $request
     *
     * @return DeployDataflowContractResponse
     */
    public function deployDataflowContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deployDataflowContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
     * Summary: 发起管理合约部署.
     *
     * @param DeployDataflowContractRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeployDataflowContractResponse
     */
    public function deployDataflowContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeployDataflowContractResponse::fromMap($this->doRequest('1.0', 'twc.notary.dataflow.contract.deploy', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
     * Summary: 发起授权.
     *
     * @param CreateDataflowAuthorizeRequest $request
     *
     * @return CreateDataflowAuthorizeResponse
     */
    public function createDataflowAuthorize($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDataflowAuthorizeEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
     * Summary: 发起授权.
     *
     * @param CreateDataflowAuthorizeRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateDataflowAuthorizeResponse
     */
    public function createDataflowAuthorizeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDataflowAuthorizeResponse::fromMap($this->doRequest('1.0', 'twc.notary.dataflow.authorize.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证方对撤销已经发起的权限授予。
     * Summary: 撤销授权.
     *
     * @param CancelDataflowAuthorizeRequest $request
     *
     * @return CancelDataflowAuthorizeResponse
     */
    public function cancelDataflowAuthorize($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelDataflowAuthorizeEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证方对撤销已经发起的权限授予。
     * Summary: 撤销授权.
     *
     * @param CancelDataflowAuthorizeRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CancelDataflowAuthorizeResponse
     */
    public function cancelDataflowAuthorizeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelDataflowAuthorizeResponse::fromMap($this->doRequest('1.0', 'twc.notary.dataflow.authorize.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
     * Summary: 查询对存证合约的各类操作执行结果.
     *
     * @param QueryDataflowActionRequest $request
     *
     * @return QueryDataflowActionResponse
     */
    public function queryDataflowAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDataflowActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
     * Summary: 查询对存证合约的各类操作执行结果.
     *
     * @param QueryDataflowActionRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDataflowActionResponse
     */
    public function queryDataflowActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDataflowActionResponse::fromMap($this->doRequest('1.0', 'twc.notary.dataflow.action.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
     * Summary: 发起信封密钥上传.
     *
     * @param UploadDataflowPubkeyRequest $request
     *
     * @return UploadDataflowPubkeyResponse
     */
    public function uploadDataflowPubkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadDataflowPubkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
     * Summary: 发起信封密钥上传.
     *
     * @param UploadDataflowPubkeyRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UploadDataflowPubkeyResponse
     */
    public function uploadDataflowPubkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadDataflowPubkeyResponse::fromMap($this->doRequest('1.0', 'twc.notary.dataflow.pubkey.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据流转存证创建链上账户
     * Summary: 数据流转存证创建链上账户.
     *
     * @param CreateDataflowAccountRequest $request
     *
     * @return CreateDataflowAccountResponse
     */
    public function createDataflowAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDataflowAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据流转存证创建链上账户
     * Summary: 数据流转存证创建链上账户.
     *
     * @param CreateDataflowAccountRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateDataflowAccountResponse
     */
    public function createDataflowAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDataflowAccountResponse::fromMap($this->doRequest('1.0', 'twc.notary.dataflow.account.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起一体化文件存证
     * Summary: 发起一体化文件存证
     *
     * @param CreateFileIntegrationRequest $request
     *
     * @return CreateFileIntegrationResponse
     */
    public function createFileIntegration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFileIntegrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起一体化文件存证
     * Summary: 发起一体化文件存证
     *
     * @param CreateFileIntegrationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateFileIntegrationResponse
     */
    public function createFileIntegrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFileIntegrationResponse::fromMap($this->doRequest('1.0', 'twc.notary.file.integration.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 完成一体化文件存证
     * Summary: 完成一体化文件存证
     *
     * @param FinishFileIntegrationRequest $request
     *
     * @return FinishFileIntegrationResponse
     */
    public function finishFileIntegration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishFileIntegrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 完成一体化文件存证
     * Summary: 完成一体化文件存证
     *
     * @param FinishFileIntegrationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return FinishFileIntegrationResponse
     */
    public function finishFileIntegrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishFileIntegrationResponse::fromMap($this->doRequest('1.0', 'twc.notary.file.integration.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询一体化文件存证
     * Summary: 查询一体化文件存证
     *
     * @param GetFileIntegrationRequest $request
     *
     * @return GetFileIntegrationResponse
     */
    public function getFileIntegration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFileIntegrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询一体化文件存证
     * Summary: 查询一体化文件存证
     *
     * @param GetFileIntegrationRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetFileIntegrationResponse
     */
    public function getFileIntegrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFileIntegrationResponse::fromMap($this->doRequest('1.0', 'twc.notary.file.integration.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 一体化文件存证-发起授权
     * Summary: 一体化文件存证-发起授权.
     *
     * @param AuthFileIntegrationRequest $request
     *
     * @return AuthFileIntegrationResponse
     */
    public function authFileIntegration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authFileIntegrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 一体化文件存证-发起授权
     * Summary: 一体化文件存证-发起授权.
     *
     * @param AuthFileIntegrationRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AuthFileIntegrationResponse
     */
    public function authFileIntegrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthFileIntegrationResponse::fromMap($this->doRequest('1.0', 'twc.notary.file.integration.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 一体化文件存证-取消授权
     * Summary: 一体化文件存证-取消授权.
     *
     * @param CancelFileIntegrationRequest $request
     *
     * @return CancelFileIntegrationResponse
     */
    public function cancelFileIntegration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelFileIntegrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 一体化文件存证-取消授权
     * Summary: 一体化文件存证-取消授权.
     *
     * @param CancelFileIntegrationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CancelFileIntegrationResponse
     */
    public function cancelFileIntegrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelFileIntegrationResponse::fromMap($this->doRequest('1.0', 'twc.notary.file.integration.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建存证流程实例
     * Summary: 创建存证流程实例.
     *
     * @param CreateFlowInstanceRequest $request
     *
     * @return CreateFlowInstanceResponse
     */
    public function createFlowInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFlowInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建存证流程实例
     * Summary: 创建存证流程实例.
     *
     * @param CreateFlowInstanceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateFlowInstanceResponse
     */
    public function createFlowInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFlowInstanceResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.instance.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证流程实例完结
     * Summary: 存证流程实例完结.
     *
     * @param FinishFlowInstanceRequest $request
     *
     * @return FinishFlowInstanceResponse
     */
    public function finishFlowInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishFlowInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证流程实例完结
     * Summary: 存证流程实例完结.
     *
     * @param FinishFlowInstanceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return FinishFlowInstanceResponse
     */
    public function finishFlowInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishFlowInstanceResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.instance.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建阶段存证
     * Summary: 创建阶段存证
     *
     * @param InitFlowPhaseRequest $request
     *
     * @return InitFlowPhaseResponse
     */
    public function initFlowPhase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initFlowPhaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建阶段存证
     * Summary: 创建阶段存证
     *
     * @param InitFlowPhaseRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return InitFlowPhaseResponse
     */
    public function initFlowPhaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitFlowPhaseResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.phase.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询阶段存证结果
     * Summary: 查询阶段存证结果.
     *
     * @param QueryFlowPhaseRequest $request
     *
     * @return QueryFlowPhaseResponse
     */
    public function queryFlowPhase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFlowPhaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询阶段存证结果
     * Summary: 查询阶段存证结果.
     *
     * @param QueryFlowPhaseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryFlowPhaseResponse
     */
    public function queryFlowPhaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFlowPhaseResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.phase.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阶段存证数据详情
     * Summary: 阶段存证数据详情.
     *
     * @param DetailFlowPhaseRequest $request
     *
     * @return DetailFlowPhaseResponse
     */
    public function detailFlowPhase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailFlowPhaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 阶段存证数据详情
     * Summary: 阶段存证数据详情.
     *
     * @param DetailFlowPhaseRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DetailFlowPhaseResponse
     */
    public function detailFlowPhaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailFlowPhaseResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.phase.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 一键创建全流程存证实例和阶段存证
     * Summary: 一键创建全流程存证实例和阶段存证
     *
     * @param CreateFlowOnestepnotaryRequest $request
     *
     * @return CreateFlowOnestepnotaryResponse
     */
    public function createFlowOnestepnotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFlowOnestepnotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 一键创建全流程存证实例和阶段存证
     * Summary: 一键创建全流程存证实例和阶段存证
     *
     * @param CreateFlowOnestepnotaryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateFlowOnestepnotaryResponse
     */
    public function createFlowOnestepnotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFlowOnestepnotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.onestepnotary.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询一键创建全流程存证进度状态
     * Summary: 查询一键创建全流程存证进度状态
     *
     * @param QueryFlowOnestepnotaryRequest $request
     *
     * @return QueryFlowOnestepnotaryResponse
     */
    public function queryFlowOnestepnotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFlowOnestepnotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询一键创建全流程存证进度状态
     * Summary: 查询一键创建全流程存证进度状态
     *
     * @param QueryFlowOnestepnotaryRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryFlowOnestepnotaryResponse
     */
    public function queryFlowOnestepnotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFlowOnestepnotaryResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.onestepnotary.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证全流程证明申请
     * Summary: 存证全流程证明申请.
     *
     * @param ApplyFlowCertificateRequest $request
     *
     * @return ApplyFlowCertificateResponse
     */
    public function applyFlowCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyFlowCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证全流程证明申请
     * Summary: 存证全流程证明申请.
     *
     * @param ApplyFlowCertificateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ApplyFlowCertificateResponse
     */
    public function applyFlowCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyFlowCertificateResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.certificate.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证全流程证明出证进度查询
     * Summary: 存证全流程证明出证进度查询.
     *
     * @param QueryFlowCertificateRequest $request
     *
     * @return QueryFlowCertificateResponse
     */
    public function queryFlowCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFlowCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证全流程证明出证进度查询
     * Summary: 存证全流程证明出证进度查询.
     *
     * @param QueryFlowCertificateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryFlowCertificateResponse
     */
    public function queryFlowCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFlowCertificateResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.certificate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字票根全流程出证申请
     * Summary: 数字票根全流程出证申请.
     *
     * @param ApplyStubCertificateRequest $request
     *
     * @return ApplyStubCertificateResponse
     */
    public function applyStubCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyStubCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字票根全流程出证申请
     * Summary: 数字票根全流程出证申请.
     *
     * @param ApplyStubCertificateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ApplyStubCertificateResponse
     */
    public function applyStubCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyStubCertificateResponse::fromMap($this->doRequest('1.0', 'twc.notary.stub.certificate.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字票根全流程证明出证进度查询
     * Summary: 数字票根全流程证明出证进度查询.
     *
     * @param QueryStubCertificateRequest $request
     *
     * @return QueryStubCertificateResponse
     */
    public function queryStubCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStubCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字票根全流程证明出证进度查询
     * Summary: 数字票根全流程证明出证进度查询.
     *
     * @param QueryStubCertificateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryStubCertificateResponse
     */
    public function queryStubCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStubCertificateResponse::fromMap($this->doRequest('1.0', 'twc.notary.stub.certificate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字票根全流程存证进度查询
     * Summary: 数字票根全流程存证进度查询.
     *
     * @param QueryStubRequest $request
     *
     * @return QueryStubResponse
     */
    public function queryStub($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStubEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字票根全流程存证进度查询
     * Summary: 数字票根全流程存证进度查询.
     *
     * @param QueryStubRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryStubResponse
     */
    public function queryStubEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStubResponse::fromMap($this->doRequest('1.0', 'twc.notary.stub.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字票根全流程存证创建
     * Summary: 数字票根全流程存证创建.
     *
     * @param CreateStubRequest $request
     *
     * @return CreateStubResponse
     */
    public function createStub($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createStubEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字票根全流程存证创建
     * Summary: 数字票根全流程存证创建.
     *
     * @param CreateStubRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateStubResponse
     */
    public function createStubEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateStubResponse::fromMap($this->doRequest('1.0', 'twc.notary.stub.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数字票根是否存在
     * Summary: 查询数字票根是否存在.
     *
     * @param ExistStubRequest $request
     *
     * @return ExistStubResponse
     */
    public function existStub($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->existStubEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数字票根是否存在
     * Summary: 查询数字票根是否存在.
     *
     * @param ExistStubRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return ExistStubResponse
     */
    public function existStubEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExistStubResponse::fromMap($this->doRequest('1.0', 'twc.notary.stub.exist', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字票根-清分接口
     * Summary: 数字票根-清分接口.
     *
     * @param CreateStubClearingRequest $request
     *
     * @return CreateStubClearingResponse
     */
    public function createStubClearing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createStubClearingEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字票根-清分接口
     * Summary: 数字票根-清分接口.
     *
     * @param CreateStubClearingRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateStubClearingResponse
     */
    public function createStubClearingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateStubClearingResponse::fromMap($this->doRequest('1.0', 'twc.notary.stub.clearing.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 申请全流程证据包，包括链上证据包和链下证据包
     * Summary: 申请全流程证据包.
     *
     * @param ApplyFlowEvidenceRequest $request
     *
     * @return ApplyFlowEvidenceResponse
     */
    public function applyFlowEvidence($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyFlowEvidenceEx($request, $headers, $runtime);
    }

    /**
     * Description: 申请全流程证据包，包括链上证据包和链下证据包
     * Summary: 申请全流程证据包.
     *
     * @param ApplyFlowEvidenceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ApplyFlowEvidenceResponse
     */
    public function applyFlowEvidenceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyFlowEvidenceResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.evidence.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全流程证据包生成进度查询
     * Summary: 全流程证据包生成进度查询.
     *
     * @param QueryFlowEvidenceRequest $request
     *
     * @return QueryFlowEvidenceResponse
     */
    public function queryFlowEvidence($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFlowEvidenceEx($request, $headers, $runtime);
    }

    /**
     * Description: 全流程证据包生成进度查询
     * Summary: 全流程证据包生成进度查询.
     *
     * @param QueryFlowEvidenceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryFlowEvidenceResponse
     */
    public function queryFlowEvidenceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFlowEvidenceResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.evidence.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全流程证据授权码申请
     * Summary: 全流程证据授权码申请.
     *
     * @param ApplyFlowAuthRequest $request
     *
     * @return ApplyFlowAuthResponse
     */
    public function applyFlowAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyFlowAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 全流程证据授权码申请
     * Summary: 全流程证据授权码申请.
     *
     * @param ApplyFlowAuthRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ApplyFlowAuthResponse
     */
    public function applyFlowAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyFlowAuthResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.auth.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全流程详情查询
     * Summary: 全流程详情查询.
     *
     * @param DetailFlowInstanceRequest $request
     *
     * @return DetailFlowInstanceResponse
     */
    public function detailFlowInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailFlowInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 全流程详情查询
     * Summary: 全流程详情查询.
     *
     * @param DetailFlowInstanceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DetailFlowInstanceResponse
     */
    public function detailFlowInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailFlowInstanceResponse::fromMap($this->doRequest('1.0', 'twc.notary.flow.instance.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合约校验接口
     * Summary: 合约校验接口.
     *
     * @param CheckContractRequest $request
     *
     * @return CheckContractResponse
     */
    public function checkContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 合约校验接口
     * Summary: 合约校验接口.
     *
     * @param CheckContractRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CheckContractResponse
     */
    public function checkContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckContractResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询合约核验结果
     * Summary: 查询合约核验结果.
     *
     * @param QueryContractStatusRequest $request
     *
     * @return QueryContractStatusResponse
     */
    public function queryContractStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询合约核验结果
     * Summary: 查询合约核验结果.
     *
     * @param QueryContractStatusRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryContractStatusResponse
     */
    public function queryContractStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractStatusResponse::fromMap($this->doRequest('1.0', 'twc.notary.contract.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据业务场景码创建raceId
     * Summary: traceId创建接口.
     *
     * @param CreateTrafficTraceidRequest $request
     *
     * @return CreateTrafficTraceidResponse
     */
    public function createTrafficTraceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTrafficTraceidEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据业务场景码创建raceId
     * Summary: traceId创建接口.
     *
     * @param CreateTrafficTraceidRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateTrafficTraceidResponse
     */
    public function createTrafficTraceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTrafficTraceidResponse::fromMap($this->doRequest('1.0', 'twc.notary.traffic.traceid.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 业务方操作行为日志传入
     * Summary: 操作行为日志传入.
     *
     * @param UploadTrafficOperatelogRequest $request
     *
     * @return UploadTrafficOperatelogResponse
     */
    public function uploadTrafficOperatelog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadTrafficOperatelogEx($request, $headers, $runtime);
    }

    /**
     * Description: 业务方操作行为日志传入
     * Summary: 操作行为日志传入.
     *
     * @param UploadTrafficOperatelogRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UploadTrafficOperatelogResponse
     */
    public function uploadTrafficOperatelogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadTrafficOperatelogResponse::fromMap($this->doRequest('1.0', 'twc.notary.traffic.operatelog.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
