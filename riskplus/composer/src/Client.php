<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\RISKPLUS\Models\ApplyDubbridgeCreditRequest;
use AntChain\RISKPLUS\Models\ApplyDubbridgeCreditResponse;
use AntChain\RISKPLUS\Models\ApplyDubbridgeCustomerAgreementsignRequest;
use AntChain\RISKPLUS\Models\ApplyDubbridgeCustomerAgreementsignResponse;
use AntChain\RISKPLUS\Models\ApplyDubbridgeUsecreditRequest;
use AntChain\RISKPLUS\Models\ApplyDubbridgeUsecreditResponse;
use AntChain\RISKPLUS\Models\ApplyDubheCreditRequest;
use AntChain\RISKPLUS\Models\ApplyDubheCreditResponse;
use AntChain\RISKPLUS\Models\ApplyDubheCustomerAgreementsignRequest;
use AntChain\RISKPLUS\Models\ApplyDubheCustomerAgreementsignResponse;
use AntChain\RISKPLUS\Models\ApplyDubheUsecreditRequest;
use AntChain\RISKPLUS\Models\ApplyDubheUsecreditResponse;
use AntChain\RISKPLUS\Models\ApplyQmpPhonenumberstatusforsmsRequest;
use AntChain\RISKPLUS\Models\ApplyQmpPhonenumberstatusforsmsResponse;
use AntChain\RISKPLUS\Models\ApplyQmpRobotcallRequest;
use AntChain\RISKPLUS\Models\ApplyQmpRobotcallResponse;
use AntChain\RISKPLUS\Models\ApplyQmpRtBatchmarketingRequest;
use AntChain\RISKPLUS\Models\ApplyQmpRtBatchmarketingResponse;
use AntChain\RISKPLUS\Models\ApplyRbbCompanyCreditRequest;
use AntChain\RISKPLUS\Models\ApplyRbbCompanyCreditResponse;
use AntChain\RISKPLUS\Models\ApplyRbbCompanyGuardRequest;
use AntChain\RISKPLUS\Models\ApplyRbbCompanyGuardResponse;
use AntChain\RISKPLUS\Models\ApplyTdiquickmsgRobotcallRequest;
use AntChain\RISKPLUS\Models\ApplyTdiquickmsgRobotcallResponse;
use AntChain\RISKPLUS\Models\ApplyTdiquickmsgRtBatchmarketingRequest;
use AntChain\RISKPLUS\Models\ApplyTdiquickmsgRtBatchmarketingResponse;
use AntChain\RISKPLUS\Models\ApplyUmktPhonenumberstatusforsmsRequest;
use AntChain\RISKPLUS\Models\ApplyUmktPhonenumberstatusforsmsResponse;
use AntChain\RISKPLUS\Models\ApplyUmktRealtimemarketingRequest;
use AntChain\RISKPLUS\Models\ApplyUmktRealtimemarketingResponse;
use AntChain\RISKPLUS\Models\ApplyUmktRobotcallRequest;
use AntChain\RISKPLUS\Models\ApplyUmktRobotcallResponse;
use AntChain\RISKPLUS\Models\ApplyUmktRtBatchmarketingRequest;
use AntChain\RISKPLUS\Models\ApplyUmktRtBatchmarketingResponse;
use AntChain\RISKPLUS\Models\BatchqueryCreditshieldProductInfoRequest;
use AntChain\RISKPLUS\Models\BatchqueryCreditshieldProductInfoResponse;
use AntChain\RISKPLUS\Models\BatchqueryQmpActionplanDetailRequest;
use AntChain\RISKPLUS\Models\BatchqueryQmpActionplanDetailResponse;
use AntChain\RISKPLUS\Models\BatchqueryQmpRtMixedmarketingRequest;
use AntChain\RISKPLUS\Models\BatchqueryQmpRtMixedmarketingResponse;
use AntChain\RISKPLUS\Models\BatchqueryQmpTaskDetailRequest;
use AntChain\RISKPLUS\Models\BatchqueryQmpTaskDetailResponse;
use AntChain\RISKPLUS\Models\BatchqueryQmpTenantActionplaninfoRequest;
use AntChain\RISKPLUS\Models\BatchqueryQmpTenantActionplaninfoResponse;
use AntChain\RISKPLUS\Models\BatchqueryUmktActionplanDetailRequest;
use AntChain\RISKPLUS\Models\BatchqueryUmktActionplanDetailResponse;
use AntChain\RISKPLUS\Models\BatchqueryUmktRobotcallDetailRequest;
use AntChain\RISKPLUS\Models\BatchqueryUmktRobotcallDetailResponse;
use AntChain\RISKPLUS\Models\BatchqueryUmktRtMarketingRequest;
use AntChain\RISKPLUS\Models\BatchqueryUmktRtMarketingResponse;
use AntChain\RISKPLUS\Models\BatchqueryUmktRtMixedmarketingRequest;
use AntChain\RISKPLUS\Models\BatchqueryUmktRtMixedmarketingResponse;
use AntChain\RISKPLUS\Models\BatchqueryUmktRtTailmarketingRequest;
use AntChain\RISKPLUS\Models\BatchqueryUmktRtTailmarketingResponse;
use AntChain\RISKPLUS\Models\BatchqueryUmktRtTopnRequest;
use AntChain\RISKPLUS\Models\BatchqueryUmktRtTopnResponse;
use AntChain\RISKPLUS\Models\BatchqueryUmktTaskDetailRequest;
use AntChain\RISKPLUS\Models\BatchqueryUmktTaskDetailResponse;
use AntChain\RISKPLUS\Models\BatchqueryUmktTenantActionplaninfoRequest;
use AntChain\RISKPLUS\Models\BatchqueryUmktTenantActionplaninfoResponse;
use AntChain\RISKPLUS\Models\BindDubbridgeCustomerBankcardRequest;
use AntChain\RISKPLUS\Models\BindDubbridgeCustomerBankcardResponse;
use AntChain\RISKPLUS\Models\CallbackMdipAuditRequest;
use AntChain\RISKPLUS\Models\CallbackMdipAuditResponse;
use AntChain\RISKPLUS\Models\CallbackMdipYunfengdieParamsRequest;
use AntChain\RISKPLUS\Models\CallbackMdipYunfengdieParamsResponse;
use AntChain\RISKPLUS\Models\CallbackQmpRobotcallRequest;
use AntChain\RISKPLUS\Models\CallbackQmpRobotcallResponse;
use AntChain\RISKPLUS\Models\CallbackQmpSmsReportRequest;
use AntChain\RISKPLUS\Models\CallbackQmpSmsReportResponse;
use AntChain\RISKPLUS\Models\CallbackQmpSmsUpRequest;
use AntChain\RISKPLUS\Models\CallbackQmpSmsUpResponse;
use AntChain\RISKPLUS\Models\CallbackTdiquickmsgRobotcallRequest;
use AntChain\RISKPLUS\Models\CallbackTdiquickmsgRobotcallResponse;
use AntChain\RISKPLUS\Models\CallbackTdiquickmsgSmsRequest;
use AntChain\RISKPLUS\Models\CallbackTdiquickmsgSmsResponse;
use AntChain\RISKPLUS\Models\CallbackTdiquickmsgSmsUpRequest;
use AntChain\RISKPLUS\Models\CallbackTdiquickmsgSmsUpResponse;
use AntChain\RISKPLUS\Models\CallbackUmktRobotcallRequest;
use AntChain\RISKPLUS\Models\CallbackUmktRobotcallResponse;
use AntChain\RISKPLUS\Models\CallbackUmktSmsReportRequest;
use AntChain\RISKPLUS\Models\CallbackUmktSmsReportResponse;
use AntChain\RISKPLUS\Models\CallbackUmktSmsUpRequest;
use AntChain\RISKPLUS\Models\CallbackUmktSmsUpResponse;
use AntChain\RISKPLUS\Models\CancelDubbridgeInstallmentOrderRequest;
use AntChain\RISKPLUS\Models\CancelDubbridgeInstallmentOrderResponse;
use AntChain\RISKPLUS\Models\CancelUmktDataaccessOfflinetaskRequest;
use AntChain\RISKPLUS\Models\CancelUmktDataaccessOfflinetaskResponse;
use AntChain\RISKPLUS\Models\CheckSecurityDataRequest;
use AntChain\RISKPLUS\Models\CheckSecurityDataResponse;
use AntChain\RISKPLUS\Models\CheckSecurityRdsRequest;
use AntChain\RISKPLUS\Models\CheckSecurityRdsResponse;
use AntChain\RISKPLUS\Models\ConfirmSecurityPolicyRequest;
use AntChain\RISKPLUS\Models\ConfirmSecurityPolicyResponse;
use AntChain\RISKPLUS\Models\CountDubbridgeRepayReftrialRequest;
use AntChain\RISKPLUS\Models\CountDubbridgeRepayReftrialResponse;
use AntChain\RISKPLUS\Models\CountDubbridgeRepayTrialRequest;
use AntChain\RISKPLUS\Models\CountDubbridgeRepayTrialResponse;
use AntChain\RISKPLUS\Models\CountDubheRepayReftrialRequest;
use AntChain\RISKPLUS\Models\CountDubheRepayReftrialResponse;
use AntChain\RISKPLUS\Models\CountDubheRepayTrialRequest;
use AntChain\RISKPLUS\Models\CountDubheRepayTrialResponse;
use AntChain\RISKPLUS\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\RISKPLUS\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\RISKPLUS\Models\CreateDubbridgeAlipayMerchantRequest;
use AntChain\RISKPLUS\Models\CreateDubbridgeAlipayMerchantResponse;
use AntChain\RISKPLUS\Models\CreateDubbridgeAlipayTradeRequest;
use AntChain\RISKPLUS\Models\CreateDubbridgeAlipayTradeResponse;
use AntChain\RISKPLUS\Models\CreateRbbApiGwtokenRequest;
use AntChain\RISKPLUS\Models\CreateRbbApiGwtokenResponse;
use AntChain\RISKPLUS\Models\CreateRbbTenantRequest;
use AntChain\RISKPLUS\Models\CreateRbbTenantResponse;
use AntChain\RISKPLUS\Models\CreateRbbTokenRequest;
use AntChain\RISKPLUS\Models\CreateRbbTokenResponse;
use AntChain\RISKPLUS\Models\CreateRbbUserRequest;
use AntChain\RISKPLUS\Models\CreateRbbUserResponse;
use AntChain\RISKPLUS\Models\CreateRtopTokenRequest;
use AntChain\RISKPLUS\Models\CreateRtopTokenResponse;
use AntChain\RISKPLUS\Models\DownloadUmktOfflineCampaignRequest;
use AntChain\RISKPLUS\Models\DownloadUmktOfflineCampaignResponse;
use AntChain\RISKPLUS\Models\DownloadUmktOfflinedecisionResultRequest;
use AntChain\RISKPLUS\Models\DownloadUmktOfflinedecisionResultResponse;
use AntChain\RISKPLUS\Models\ExecRbbCompanyGuardRequest;
use AntChain\RISKPLUS\Models\ExecRbbCompanyGuardResponse;
use AntChain\RISKPLUS\Models\ExecRtopGenericInvokeRequest;
use AntChain\RISKPLUS\Models\ExecRtopGenericInvokeResponse;
use AntChain\RISKPLUS\Models\ExecSecurityRiskdataserviceRequest;
use AntChain\RISKPLUS\Models\ExecSecurityRiskdataserviceResponse;
use AntChain\RISKPLUS\Models\FinishRbbRegdatasyncScheduleRequest;
use AntChain\RISKPLUS\Models\FinishRbbRegdatasyncScheduleResponse;
use AntChain\RISKPLUS\Models\GetRbbLoginTokenRequest;
use AntChain\RISKPLUS\Models\GetRbbLoginTokenResponse;
use AntChain\RISKPLUS\Models\GetRbbTaxinvoiceDataRequest;
use AntChain\RISKPLUS\Models\GetRbbTaxinvoiceDataResponse;
use AntChain\RISKPLUS\Models\GetRtopCompanyDetailRequest;
use AntChain\RISKPLUS\Models\GetRtopCompanyDetailResponse;
use AntChain\RISKPLUS\Models\GetRtopCompanyMonitorRequest;
use AntChain\RISKPLUS\Models\GetRtopCompanyMonitorResponse;
use AntChain\RISKPLUS\Models\ImportUmktSceneUploadRequest;
use AntChain\RISKPLUS\Models\ImportUmktSceneUploadResponse;
use AntChain\RISKPLUS\Models\ListMdipDefaultSupplierRequest;
use AntChain\RISKPLUS\Models\ListMdipDefaultSupplierResponse;
use AntChain\RISKPLUS\Models\ListRtopCompanyOpinionsRequest;
use AntChain\RISKPLUS\Models\ListRtopCompanyOpinionsResponse;
use AntChain\RISKPLUS\Models\ListRtopCompanyRelatedRequest;
use AntChain\RISKPLUS\Models\ListRtopCompanyRelatedResponse;
use AntChain\RISKPLUS\Models\ListRtopCrowdriskRequest;
use AntChain\RISKPLUS\Models\ListRtopCrowdriskResponse;
use AntChain\RISKPLUS\Models\ListRtopStarCompanyRequest;
use AntChain\RISKPLUS\Models\ListRtopStarCompanyResponse;
use AntChain\RISKPLUS\Models\NotifyBenefithubRiskLoginRequest;
use AntChain\RISKPLUS\Models\NotifyBenefithubRiskLoginResponse;
use AntChain\RISKPLUS\Models\NotifyBenefithubRiskPayunilateralRequest;
use AntChain\RISKPLUS\Models\NotifyBenefithubRiskPayunilateralResponse;
use AntChain\RISKPLUS\Models\NotifyDubbridgeCallbackRequest;
use AntChain\RISKPLUS\Models\NotifyDubbridgeCallbackResponse;
use AntChain\RISKPLUS\Models\NotifyDubbridgeDefininnerchannelRequest;
use AntChain\RISKPLUS\Models\NotifyDubbridgeDefininnerchannelResponse;
use AntChain\RISKPLUS\Models\NotifyRdaasTaxCallbackRequest;
use AntChain\RISKPLUS\Models\NotifyRdaasTaxCallbackResponse;
use AntChain\RISKPLUS\Models\NotifyRpgwUserSignresultRequest;
use AntChain\RISKPLUS\Models\NotifyRpgwUserSignresultResponse;
use AntChain\RISKPLUS\Models\OperateRbbCreditRequest;
use AntChain\RISKPLUS\Models\OperateRbbCreditResponse;
use AntChain\RISKPLUS\Models\PullRegtechNewsRequest;
use AntChain\RISKPLUS\Models\PullRegtechNewsResponse;
use AntChain\RISKPLUS\Models\PushDubbridgeInstallmentSupplementRequest;
use AntChain\RISKPLUS\Models\PushDubbridgeInstallmentSupplementResponse;
use AntChain\RISKPLUS\Models\PushQmpBackflowEventRequest;
use AntChain\RISKPLUS\Models\PushQmpBackflowEventResponse;
use AntChain\RISKPLUS\Models\PushQmpBackflowJsondataRequest;
use AntChain\RISKPLUS\Models\PushQmpBackflowJsondataResponse;
use AntChain\RISKPLUS\Models\PushRbbCustomerCompanyinfoRequest;
use AntChain\RISKPLUS\Models\PushRbbCustomerCompanyinfoResponse;
use AntChain\RISKPLUS\Models\PushRbbCustomerInformationRequest;
use AntChain\RISKPLUS\Models\PushRbbCustomerInformationResponse;
use AntChain\RISKPLUS\Models\PushRbbCustomerStatusRequest;
use AntChain\RISKPLUS\Models\PushRbbCustomerStatusResponse;
use AntChain\RISKPLUS\Models\PushRbbInvoiceChargeRequest;
use AntChain\RISKPLUS\Models\PushRbbInvoiceChargeResponse;
use AntChain\RISKPLUS\Models\PushRiskplusUmktCommonbackflowRequest;
use AntChain\RISKPLUS\Models\PushRiskplusUmktCommonbackflowResponse;
use AntChain\RISKPLUS\Models\PushRpaasReportAnswerRequest;
use AntChain\RISKPLUS\Models\PushRpaasReportAnswerResponse;
use AntChain\RISKPLUS\Models\PushTdiquickmsgBackflowEventRequest;
use AntChain\RISKPLUS\Models\PushTdiquickmsgBackflowEventResponse;
use AntChain\RISKPLUS\Models\PushTdiquickmsgBackflowJsondataRequest;
use AntChain\RISKPLUS\Models\PushTdiquickmsgBackflowJsondataResponse;
use AntChain\RISKPLUS\Models\PushUmktBackflowEventRequest;
use AntChain\RISKPLUS\Models\PushUmktBackflowEventResponse;
use AntChain\RISKPLUS\Models\PushUmktBackflowJsondataRequest;
use AntChain\RISKPLUS\Models\PushUmktBackflowJsondataResponse;
use AntChain\RISKPLUS\Models\PushUmktCommonDataRequest;
use AntChain\RISKPLUS\Models\PushUmktCommonDataResponse;
use AntChain\RISKPLUS\Models\PushUmktCustomerGroupRequest;
use AntChain\RISKPLUS\Models\PushUmktCustomerGroupResponse;
use AntChain\RISKPLUS\Models\QueryBatchSecurityPolicyRequest;
use AntChain\RISKPLUS\Models\QueryBatchSecurityPolicyResponse;
use AntChain\RISKPLUS\Models\QueryBenefithubReportEffectiveRequest;
use AntChain\RISKPLUS\Models\QueryBenefithubReportEffectiveResponse;
use AntChain\RISKPLUS\Models\QueryBenefithubReportInformationRequest;
use AntChain\RISKPLUS\Models\QueryBenefithubReportInformationResponse;
use AntChain\RISKPLUS\Models\QueryCreditshieldProductBatchRequest;
use AntChain\RISKPLUS\Models\QueryCreditshieldProductBatchResponse;
use AntChain\RISKPLUS\Models\QueryCreditshieldProductCallbackRequest;
use AntChain\RISKPLUS\Models\QueryCreditshieldProductCallbackResponse;
use AntChain\RISKPLUS\Models\QueryCreditshieldProductIvrfcRequest;
use AntChain\RISKPLUS\Models\QueryCreditshieldProductIvrfcResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeAccountCustomRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeAccountCustomResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeAccountStatusRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeAccountStatusResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeAccountUsecreditRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeAccountUsecreditResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeAgreementPreviewRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeAgreementPreviewResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeAlipayMerchantRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeAlipayMerchantResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeCreditPermitRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeCreditPermitResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeCreditStatusRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeCreditStatusResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeCustomerAgreementsignRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeCustomerAgreementsignResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeCustomerBankcardlistRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeCustomerBankcardlistResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeCustomerCommonagreementsignRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeCustomerCommonagreementsignResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeInstallmentCreditamtRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeInstallmentCreditamtResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeInstallmentTrialRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeInstallmentTrialResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeLoanUpgradestatusRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeLoanUpgradestatusResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeMarketingCouponlistRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeMarketingCouponlistResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeReceiptOverdueRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeReceiptOverdueResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeReceiptStatusRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeReceiptStatusResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRepayInfoRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRepayInfoResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRepayListRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRepayListResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRepayResultRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRepayResultResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRepaytypeInfoRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRepaytypeInfoResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRiskinfoBusinessinfoRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRiskinfoBusinessinfoResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRiskinfoCommonRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRiskinfoCommonResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRiskinfoEnterprisescoreRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRiskinfoEnterprisescoreResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRouterFundrouterRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRouterFundrouterResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeRouterUserselectRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeRouterUserselectResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeSearchContractRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeSearchContractResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeSettlementCertificateRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeSettlementCertificateResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeUsecreditStatusRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeUsecreditStatusResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeUserAggregationinfoRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeUserAggregationinfoResponse;
use AntChain\RISKPLUS\Models\QueryDubbridgeUserUpgradestatusRequest;
use AntChain\RISKPLUS\Models\QueryDubbridgeUserUpgradestatusResponse;
use AntChain\RISKPLUS\Models\QueryDubheCreditStatusRequest;
use AntChain\RISKPLUS\Models\QueryDubheCreditStatusResponse;
use AntChain\RISKPLUS\Models\QueryDubheCustomerAgreementsignRequest;
use AntChain\RISKPLUS\Models\QueryDubheCustomerAgreementsignResponse;
use AntChain\RISKPLUS\Models\QueryDubheReceiptOverdueRequest;
use AntChain\RISKPLUS\Models\QueryDubheReceiptOverdueResponse;
use AntChain\RISKPLUS\Models\QueryDubheRepayInfoRequest;
use AntChain\RISKPLUS\Models\QueryDubheRepayInfoResponse;
use AntChain\RISKPLUS\Models\QueryDubheRepayListRequest;
use AntChain\RISKPLUS\Models\QueryDubheRepayListResponse;
use AntChain\RISKPLUS\Models\QueryDubheRouterFundrouterRequest;
use AntChain\RISKPLUS\Models\QueryDubheRouterFundrouterResponse;
use AntChain\RISKPLUS\Models\QueryDubheSearchContractRequest;
use AntChain\RISKPLUS\Models\QueryDubheSearchContractResponse;
use AntChain\RISKPLUS\Models\QueryDubheTestRequest;
use AntChain\RISKPLUS\Models\QueryDubheTestResponse;
use AntChain\RISKPLUS\Models\QueryDubheUsecreditStatusRequest;
use AntChain\RISKPLUS\Models\QueryDubheUsecreditStatusResponse;
use AntChain\RISKPLUS\Models\QueryFinserviceZhimaIdentifyRequest;
use AntChain\RISKPLUS\Models\QueryFinserviceZhimaIdentifyResponse;
use AntChain\RISKPLUS\Models\QueryMdipDataservicePocRequest;
use AntChain\RISKPLUS\Models\QueryMdipDataservicePocResponse;
use AntChain\RISKPLUS\Models\QueryMdipDataserviceRequest;
use AntChain\RISKPLUS\Models\QueryMdipDataserviceResponse;
use AntChain\RISKPLUS\Models\QueryQmpCardsmsSupportRequest;
use AntChain\RISKPLUS\Models\QueryQmpCardsmsSupportResponse;
use AntChain\RISKPLUS\Models\QueryQmpCpaassmsTemplateRequest;
use AntChain\RISKPLUS\Models\QueryQmpCpaassmsTemplateResponse;
use AntChain\RISKPLUS\Models\QueryQmpDataaccessStatisticRequest;
use AntChain\RISKPLUS\Models\QueryQmpDataaccessStatisticResponse;
use AntChain\RISKPLUS\Models\QueryQmpOfflinehostplanDecisionresultRequest;
use AntChain\RISKPLUS\Models\QueryQmpOfflinehostplanDecisionresultResponse;
use AntChain\RISKPLUS\Models\QueryQmpRobotcallDetailRequest;
use AntChain\RISKPLUS\Models\QueryQmpRobotcallDetailResponse;
use AntChain\RISKPLUS\Models\QueryQmpRobotcallStatisticinfoRequest;
use AntChain\RISKPLUS\Models\QueryQmpRobotcallStatisticinfoResponse;
use AntChain\RISKPLUS\Models\QueryQmpTenantActionplaninfoRequest;
use AntChain\RISKPLUS\Models\QueryQmpTenantActionplaninfoResponse;
use AntChain\RISKPLUS\Models\QueryQmpTextsmsTemplateRequest;
use AntChain\RISKPLUS\Models\QueryQmpTextsmsTemplateResponse;
use AntChain\RISKPLUS\Models\QueryRbbCompanyCreditRequest;
use AntChain\RISKPLUS\Models\QueryRbbCompanyCreditResponse;
use AntChain\RISKPLUS\Models\QueryRbbCompanyGuardRequest;
use AntChain\RISKPLUS\Models\QueryRbbCompanyGuardResponse;
use AntChain\RISKPLUS\Models\QueryRbbGeneralRequest;
use AntChain\RISKPLUS\Models\QueryRbbGeneralResponse;
use AntChain\RISKPLUS\Models\QueryRbbGenericInvokeRequest;
use AntChain\RISKPLUS\Models\QueryRbbGenericInvokeResponse;
use AntChain\RISKPLUS\Models\QueryRbbObtsZsearchRequest;
use AntChain\RISKPLUS\Models\QueryRbbObtsZsearchResponse;
use AntChain\RISKPLUS\Models\QueryRbbRegdatasyncPreparedRequest;
use AntChain\RISKPLUS\Models\QueryRbbRegdatasyncPreparedResponse;
use AntChain\RISKPLUS\Models\QueryRdaasTaxRpadecisionindicatorRequest;
use AntChain\RISKPLUS\Models\QueryRdaasTaxRpadecisionindicatorResponse;
use AntChain\RISKPLUS\Models\QueryRdaasTaxRpadecisionserviceRequest;
use AntChain\RISKPLUS\Models\QueryRdaasTaxRpadecisionserviceResponse;
use AntChain\RISKPLUS\Models\QueryRdaasTaxSimpleauthdecisionRequest;
use AntChain\RISKPLUS\Models\QueryRdaasTaxSimpleauthdecisionResponse;
use AntChain\RISKPLUS\Models\QueryRfcOdpsLindormRequest;
use AntChain\RISKPLUS\Models\QueryRfcOdpsLindormResponse;
use AntChain\RISKPLUS\Models\QueryRpaasOpenServiceRequest;
use AntChain\RISKPLUS\Models\QueryRpaasOpenServiceResponse;
use AntChain\RISKPLUS\Models\QueryRpgwSignUrlRequest;
use AntChain\RISKPLUS\Models\QueryRpgwSignUrlResponse;
use AntChain\RISKPLUS\Models\QueryRpgwUserSignurlRequest;
use AntChain\RISKPLUS\Models\QueryRpgwUserSignurlResponse;
use AntChain\RISKPLUS\Models\QueryRpSecurityPolicyRequest;
use AntChain\RISKPLUS\Models\QueryRpSecurityPolicyResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyAlarmRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyAlarmResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyFeedbackRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyFeedbackResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyListRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyListResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyOpinionRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyOpinionResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskinfoRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskinfoResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskyRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskyResponse;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskDetailRequest;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskDetailResponse;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskStatisticRequest;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskStatisticResponse;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskSumRequest;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskSumResponse;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelConfigRequest;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelConfigResponse;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelFilterRequest;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelFilterResponse;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelRequest;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelResponse;
use AntChain\RISKPLUS\Models\QueryRtopRiskstormRequest;
use AntChain\RISKPLUS\Models\QueryRtopRiskstormResponse;
use AntChain\RISKPLUS\Models\QueryRtopTagImageRequest;
use AntChain\RISKPLUS\Models\QueryRtopTagImageResponse;
use AntChain\RISKPLUS\Models\QuerySaasSecurityPolicyRequest;
use AntChain\RISKPLUS\Models\QuerySaasSecurityPolicyResponse;
use AntChain\RISKPLUS\Models\QuerySecurityDataRequest;
use AntChain\RISKPLUS\Models\QuerySecurityDataResponse;
use AntChain\RISKPLUS\Models\QuerySecurityPolicyRequest;
use AntChain\RISKPLUS\Models\QuerySecurityPolicyResponse;
use AntChain\RISKPLUS\Models\QuerySnapshotEventRequest;
use AntChain\RISKPLUS\Models\QuerySnapshotEventResponse;
use AntChain\RISKPLUS\Models\QueryTdiquickmsgRobotcallStatisticinfoRequest;
use AntChain\RISKPLUS\Models\QueryTdiquickmsgRobotcallStatisticinfoResponse;
use AntChain\RISKPLUS\Models\QueryTdisaasSecurityPolicyRequest;
use AntChain\RISKPLUS\Models\QueryTdisaasSecurityPolicyResponse;
use AntChain\RISKPLUS\Models\QueryUmktCardsmsAnalysisRequest;
use AntChain\RISKPLUS\Models\QueryUmktCardsmsAnalysisResponse;
use AntChain\RISKPLUS\Models\QueryUmktCardsmsSupportRequest;
use AntChain\RISKPLUS\Models\QueryUmktCardsmsSupportResponse;
use AntChain\RISKPLUS\Models\QueryUmktCpaassmsTemplateRequest;
use AntChain\RISKPLUS\Models\QueryUmktCpaassmsTemplateResponse;
use AntChain\RISKPLUS\Models\QueryUmktDataaccessStatisticRequest;
use AntChain\RISKPLUS\Models\QueryUmktDataaccessStatisticResponse;
use AntChain\RISKPLUS\Models\QueryUmktOfflinedecisionPlandetailsRequest;
use AntChain\RISKPLUS\Models\QueryUmktOfflinedecisionPlandetailsResponse;
use AntChain\RISKPLUS\Models\QueryUmktOfflinedecisionResultRequest;
use AntChain\RISKPLUS\Models\QueryUmktOfflinedecisionResultResponse;
use AntChain\RISKPLUS\Models\QueryUmktRobotcallDetailRequest;
use AntChain\RISKPLUS\Models\QueryUmktRobotcallDetailResponse;
use AntChain\RISKPLUS\Models\QueryUmktRobotcallStatisticinfoRequest;
use AntChain\RISKPLUS\Models\QueryUmktRobotcallStatisticinfoResponse;
use AntChain\RISKPLUS\Models\QueryUmktRtMarketingRequest;
use AntChain\RISKPLUS\Models\QueryUmktRtMarketingResponse;
use AntChain\RISKPLUS\Models\QueryUmktScenestrategyTestRequest;
use AntChain\RISKPLUS\Models\QueryUmktScenestrategyTestResponse;
use AntChain\RISKPLUS\Models\QueryUmktTenantActionplaninfoRequest;
use AntChain\RISKPLUS\Models\QueryUmktTenantActionplaninfoResponse;
use AntChain\RISKPLUS\Models\ReceiveBenefithubRiskPayRequest;
use AntChain\RISKPLUS\Models\ReceiveBenefithubRiskPayResponse;
use AntChain\RISKPLUS\Models\ReceiveMdipParamsFileRequest;
use AntChain\RISKPLUS\Models\ReceiveMdipParamsFileResponse;
use AntChain\RISKPLUS\Models\ReceiveMdipParamsRbbfileRequest;
use AntChain\RISKPLUS\Models\ReceiveMdipParamsRbbfileResponse;
use AntChain\RISKPLUS\Models\ReceiveRbbOverseacompanyProfileRequest;
use AntChain\RISKPLUS\Models\ReceiveRbbOverseacompanyProfileResponse;
use AntChain\RISKPLUS\Models\ReceiveRbbParamsFileRequest;
use AntChain\RISKPLUS\Models\ReceiveRbbParamsFileResponse;
use AntChain\RISKPLUS\Models\ReceiveRfcParamsFileRequest;
use AntChain\RISKPLUS\Models\ReceiveRfcParamsFileResponse;
use AntChain\RISKPLUS\Models\RegisterRpgwUserEinvoiceRequest;
use AntChain\RISKPLUS\Models\RegisterRpgwUserEinvoiceResponse;
use AntChain\RISKPLUS\Models\RepayDubbridgeRepayCheckstandRequest;
use AntChain\RISKPLUS\Models\RepayDubbridgeRepayCheckstandResponse;
use AntChain\RISKPLUS\Models\RepayDubbridgeRepayWithholdRequest;
use AntChain\RISKPLUS\Models\RepayDubbridgeRepayWithholdResponse;
use AntChain\RISKPLUS\Models\RepayDubheRepayCheckstandRequest;
use AntChain\RISKPLUS\Models\RepayDubheRepayCheckstandResponse;
use AntChain\RISKPLUS\Models\RepayDubheRepayWithholdRequest;
use AntChain\RISKPLUS\Models\RepayDubheRepayWithholdResponse;
use AntChain\RISKPLUS\Models\SendDubbridgeSmsBatchRequest;
use AntChain\RISKPLUS\Models\SendDubbridgeSmsBatchResponse;
use AntChain\RISKPLUS\Models\SendDubbridgeSmsRequest;
use AntChain\RISKPLUS\Models\SendDubbridgeSmsResponse;
use AntChain\RISKPLUS\Models\SendQmpCardsmsBatchRequest;
use AntChain\RISKPLUS\Models\SendQmpCardsmsBatchResponse;
use AntChain\RISKPLUS\Models\SendQmpDigitalsmsBatchRequest;
use AntChain\RISKPLUS\Models\SendQmpDigitalsmsBatchResponse;
use AntChain\RISKPLUS\Models\SendQmpTextsmsBatchRequest;
use AntChain\RISKPLUS\Models\SendQmpTextsmsBatchResponse;
use AntChain\RISKPLUS\Models\SendSecurityDataRequest;
use AntChain\RISKPLUS\Models\SendSecurityDataResponse;
use AntChain\RISKPLUS\Models\SendUmktCardsmsBatchRequest;
use AntChain\RISKPLUS\Models\SendUmktCardsmsBatchResponse;
use AntChain\RISKPLUS\Models\SendUmktDigitalsmsBatchRequest;
use AntChain\RISKPLUS\Models\SendUmktDigitalsmsBatchResponse;
use AntChain\RISKPLUS\Models\SendUmktTextsmsBatchRequest;
use AntChain\RISKPLUS\Models\SendUmktTextsmsBatchResponse;
use AntChain\RISKPLUS\Models\StartRbbRegdatasyncScheduleRequest;
use AntChain\RISKPLUS\Models\StartRbbRegdatasyncScheduleResponse;
use AntChain\RISKPLUS\Models\SyncRdaasTaxAuthinfoRequest;
use AntChain\RISKPLUS\Models\SyncRdaasTaxAuthinfoResponse;
use AntChain\RISKPLUS\Models\SyncRdaasTaxAuthorderRequest;
use AntChain\RISKPLUS\Models\SyncRdaasTaxAuthorderResponse;
use AntChain\RISKPLUS\Models\SyncRpgwUserOrderinfoRequest;
use AntChain\RISKPLUS\Models\SyncRpgwUserOrderinfoResponse;
use AntChain\RISKPLUS\Models\SyncUmktRtEventresultRequest;
use AntChain\RISKPLUS\Models\SyncUmktRtEventresultResponse;
use AntChain\RISKPLUS\Models\UpdateDubbridgeAccountCustomRequest;
use AntChain\RISKPLUS\Models\UpdateDubbridgeAccountCustomResponse;
use AntChain\RISKPLUS\Models\UpdateDubbridgeCustomerInfoRequest;
use AntChain\RISKPLUS\Models\UpdateDubbridgeCustomerInfoResponse;
use AntChain\RISKPLUS\Models\UpdateDubbridgeFileRequest;
use AntChain\RISKPLUS\Models\UpdateDubbridgeFileResponse;
use AntChain\RISKPLUS\Models\UpdateDubbridgeInstitutionCreditRequest;
use AntChain\RISKPLUS\Models\UpdateDubbridgeInstitutionCreditResponse;
use AntChain\RISKPLUS\Models\UpdateDubheCustomerInfoRequest;
use AntChain\RISKPLUS\Models\UpdateDubheCustomerInfoResponse;
use AntChain\RISKPLUS\Models\UploadDubbridgeAlipayImageRequest;
use AntChain\RISKPLUS\Models\UploadDubbridgeAlipayImageResponse;
use AntChain\RISKPLUS\Models\UploadDubbridgeFileRequest;
use AntChain\RISKPLUS\Models\UploadDubbridgeFileResponse;
use AntChain\RISKPLUS\Models\UploadQmpOfflinehostplanRequest;
use AntChain\RISKPLUS\Models\UploadQmpOfflinehostplanResponse;
use AntChain\RISKPLUS\Models\UploadRbbFileAmapRequest;
use AntChain\RISKPLUS\Models\UploadRbbFileAmapResponse;
use AntChain\RISKPLUS\Models\UploadRfcAiboundFileRequest;
use AntChain\RISKPLUS\Models\UploadRfcAiboundFileResponse;
use AntChain\RISKPLUS\Models\UploadUmktOfflinedecisionRequest;
use AntChain\RISKPLUS\Models\UploadUmktOfflinedecisionResponse;
use AntChain\RISKPLUS\Models\UploadUmktOfflineImportrecordRequest;
use AntChain\RISKPLUS\Models\UploadUmktOfflineImportrecordResponse;
use AntChain\RISKPLUS\Models\UploadUmktParamsFileRequest;
use AntChain\RISKPLUS\Models\UploadUmktParamsFileResponse;
use AntChain\RISKPLUS\Models\VerifyDubbridgeCustomerBankcardRequest;
use AntChain\RISKPLUS\Models\VerifyDubbridgeCustomerBankcardResponse;
use AntChain\RISKPLUS\Models\VerifyFinserviceZhimaIdentifyRequest;
use AntChain\RISKPLUS\Models\VerifyFinserviceZhimaIdentifyResponse;
use AntChain\RISKPLUS\Models\WithdrawRpgwUserCommissionRequest;
use AntChain\RISKPLUS\Models\WithdrawRpgwUserCommissionResponse;
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
            // 企业风险等级分布统计
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
                    'sdk_version'      => '1.26.8',
                    '_prod_code'       => 'RISKPLUS',
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
     * Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
     * Summary: 权益流量业务支付签约相关通知.
     *
     * @param ReceiveBenefithubRiskPayRequest $request
     *
     * @return ReceiveBenefithubRiskPayResponse
     */
    public function receiveBenefithubRiskPay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->receiveBenefithubRiskPayEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
     * Summary: 权益流量业务支付签约相关通知.
     *
     * @param ReceiveBenefithubRiskPayRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ReceiveBenefithubRiskPayResponse
     */
    public function receiveBenefithubRiskPayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReceiveBenefithubRiskPayResponse::fromMap($this->doRequest('1.0', 'riskplus.benefithub.risk.pay.receive', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 渠道、平台方，联合登陆推送登陆通知信息
     * Summary: 渠道/平台方推送的用户登陆信息.
     *
     * @param NotifyBenefithubRiskLoginRequest $request
     *
     * @return NotifyBenefithubRiskLoginResponse
     */
    public function notifyBenefithubRiskLogin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyBenefithubRiskLoginEx($request, $headers, $runtime);
    }

    /**
     * Description: 渠道、平台方，联合登陆推送登陆通知信息
     * Summary: 渠道/平台方推送的用户登陆信息.
     *
     * @param NotifyBenefithubRiskLoginRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return NotifyBenefithubRiskLoginResponse
     */
    public function notifyBenefithubRiskLoginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyBenefithubRiskLoginResponse::fromMap($this->doRequest('1.0', 'riskplus.benefithub.risk.login.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 奇富组件支付结果通知, 提供给驭鉴使用，用于接收从奇富支付成功的通知，发起订单创建
     * Summary: 奇富组件支付结果通知.
     *
     * @param NotifyBenefithubRiskPayunilateralRequest $request
     *
     * @return NotifyBenefithubRiskPayunilateralResponse
     */
    public function notifyBenefithubRiskPayunilateral($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyBenefithubRiskPayunilateralEx($request, $headers, $runtime);
    }

    /**
     * Description: 奇富组件支付结果通知, 提供给驭鉴使用，用于接收从奇富支付成功的通知，发起订单创建
     * Summary: 奇富组件支付结果通知.
     *
     * @param NotifyBenefithubRiskPayunilateralRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return NotifyBenefithubRiskPayunilateralResponse
     */
    public function notifyBenefithubRiskPayunilateralEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyBenefithubRiskPayunilateralResponse::fromMap($this->doRequest('1.0', 'riskplus.benefithub.risk.payunilateral.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 渠道主动查询报告详情接口
     * Summary: 渠道查询报告详情.
     *
     * @param QueryBenefithubReportInformationRequest $request
     *
     * @return QueryBenefithubReportInformationResponse
     */
    public function queryBenefithubReportInformation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBenefithubReportInformationEx($request, $headers, $runtime);
    }

    /**
     * Description: 渠道主动查询报告详情接口
     * Summary: 渠道查询报告详情.
     *
     * @param QueryBenefithubReportInformationRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryBenefithubReportInformationResponse
     */
    public function queryBenefithubReportInformationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBenefithubReportInformationResponse::fromMap($this->doRequest('1.0', 'riskplus.benefithub.report.information.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 渠道查询报告有效期
     * Summary: 渠道查询报告有效期
     *
     * @param QueryBenefithubReportEffectiveRequest $request
     *
     * @return QueryBenefithubReportEffectiveResponse
     */
    public function queryBenefithubReportEffective($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBenefithubReportEffectiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 渠道查询报告有效期
     * Summary: 渠道查询报告有效期
     *
     * @param QueryBenefithubReportEffectiveRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryBenefithubReportEffectiveResponse
     */
    public function queryBenefithubReportEffectiveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBenefithubReportEffectiveResponse::fromMap($this->doRequest('1.0', 'riskplus.benefithub.report.effective.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信护盾产品批量查询
     * Summary: 信护盾产品批量查询.
     *
     * @param BatchqueryCreditshieldProductInfoRequest $request
     *
     * @return BatchqueryCreditshieldProductInfoResponse
     */
    public function batchqueryCreditshieldProductInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryCreditshieldProductInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 信护盾产品批量查询
     * Summary: 信护盾产品批量查询.
     *
     * @param BatchqueryCreditshieldProductInfoRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return BatchqueryCreditshieldProductInfoResponse
     */
    public function batchqueryCreditshieldProductInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryCreditshieldProductInfoResponse::fromMap($this->doRequest('1.0', 'riskplus.creditshield.product.info.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信护盾amc机构回调通用接口
     * Summary: 信护盾amc机构回调通用接口.
     *
     * @param QueryCreditshieldProductCallbackRequest $request
     *
     * @return QueryCreditshieldProductCallbackResponse
     */
    public function queryCreditshieldProductCallback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditshieldProductCallbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 信护盾amc机构回调通用接口
     * Summary: 信护盾amc机构回调通用接口.
     *
     * @param QueryCreditshieldProductCallbackRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryCreditshieldProductCallbackResponse
     */
    public function queryCreditshieldProductCallbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditshieldProductCallbackResponse::fromMap($this->doRequest('1.0', 'riskplus.creditshield.product.callback.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ivr函数计算调用
     * Summary: ivr函数计算调用.
     *
     * @param QueryCreditshieldProductIvrfcRequest $request
     *
     * @return QueryCreditshieldProductIvrfcResponse
     */
    public function queryCreditshieldProductIvrfc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditshieldProductIvrfcEx($request, $headers, $runtime);
    }

    /**
     * Description: ivr函数计算调用
     * Summary: ivr函数计算调用.
     *
     * @param QueryCreditshieldProductIvrfcRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryCreditshieldProductIvrfcResponse
     */
    public function queryCreditshieldProductIvrfcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditshieldProductIvrfcResponse::fromMap($this->doRequest('1.0', 'riskplus.creditshield.product.ivrfc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风控云风险咨询接口
     * Summary: 风控云风险咨询接口.
     *
     * @param QuerySecurityPolicyRequest $request
     *
     * @return QuerySecurityPolicyResponse
     */
    public function querySecurityPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 风控云风险咨询接口
     * Summary: 风控云风险咨询接口.
     *
     * @param QuerySecurityPolicyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QuerySecurityPolicyResponse
     */
    public function querySecurityPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySecurityPolicyResponse::fromMap($this->doRequest('1.0', 'riskplus.security.policy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据.
     *
     * @param SendSecurityDataRequest $request
     *
     * @return SendSecurityDataResponse
     */
    public function sendSecurityData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendSecurityDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据.
     *
     * @param SendSecurityDataRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SendSecurityDataResponse
     */
    public function sendSecurityDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendSecurityDataResponse::fromMap($this->doRequest('1.0', 'riskplus.security.data.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出.
     *
     * @param ConfirmSecurityPolicyRequest $request
     *
     * @return ConfirmSecurityPolicyResponse
     */
    public function confirmSecurityPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmSecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出.
     *
     * @param ConfirmSecurityPolicyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ConfirmSecurityPolicyResponse
     */
    public function confirmSecurityPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmSecurityPolicyResponse::fromMap($this->doRequest('1.0', 'riskplus.security.policy.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出.
     *
     * @param CheckSecurityRdsRequest $request
     *
     * @return CheckSecurityRdsResponse
     */
    public function checkSecurityRds($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSecurityRdsEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出.
     *
     * @param CheckSecurityRdsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CheckSecurityRdsResponse
     */
    public function checkSecurityRdsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSecurityRdsResponse::fromMap($this->doRequest('1.0', 'riskplus.security.rds.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出.
     *
     * @param QuerySecurityDataRequest $request
     *
     * @return QuerySecurityDataResponse
     */
    public function querySecurityData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySecurityDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出.
     *
     * @param QuerySecurityDataRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QuerySecurityDataResponse
     */
    public function querySecurityDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySecurityDataResponse::fromMap($this->doRequest('1.0', 'riskplus.security.data.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验.
     *
     * @param CheckSecurityDataRequest $request
     *
     * @return CheckSecurityDataResponse
     */
    public function checkSecurityData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSecurityDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验.
     *
     * @param CheckSecurityDataRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CheckSecurityDataResponse
     */
    public function checkSecurityDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSecurityDataResponse::fromMap($this->doRequest('1.0', 'riskplus.security.data.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 反欺诈风险数据服务请求执行
     * Summary: 反欺诈风险数据服务请求执行.
     *
     * @param ExecSecurityRiskdataserviceRequest $request
     *
     * @return ExecSecurityRiskdataserviceResponse
     */
    public function execSecurityRiskdataservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execSecurityRiskdataserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 反欺诈风险数据服务请求执行
     * Summary: 反欺诈风险数据服务请求执行.
     *
     * @param ExecSecurityRiskdataserviceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ExecSecurityRiskdataserviceResponse
     */
    public function execSecurityRiskdataserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecSecurityRiskdataserviceResponse::fromMap($this->doRequest('1.0', 'riskplus.security.riskdataservice.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风控云SaaS租户调用接口
     * Summary: 风控云SaaS租户调用接口.
     *
     * @param QuerySaasSecurityPolicyRequest $request
     *
     * @return QuerySaasSecurityPolicyResponse
     */
    public function querySaasSecurityPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySaasSecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 风控云SaaS租户调用接口
     * Summary: 风控云SaaS租户调用接口.
     *
     * @param QuerySaasSecurityPolicyRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QuerySaasSecurityPolicyResponse
     */
    public function querySaasSecurityPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySaasSecurityPolicyResponse::fromMap($this->doRequest('1.0', 'riskplus.saas.security.policy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量决策
     * Summary: 批量决策查询.
     *
     * @param QueryBatchSecurityPolicyRequest $request
     *
     * @return QueryBatchSecurityPolicyResponse
     */
    public function queryBatchSecurityPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBatchSecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量决策
     * Summary: 批量决策查询.
     *
     * @param QueryBatchSecurityPolicyRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryBatchSecurityPolicyResponse
     */
    public function queryBatchSecurityPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBatchSecurityPolicyResponse::fromMap($this->doRequest('1.0', 'riskplus.batch.security.policy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信护盾产品批量查询
     * Summary: 信护盾产品批量查询.
     *
     * @param QueryCreditshieldProductBatchRequest $request
     *
     * @return QueryCreditshieldProductBatchResponse
     */
    public function queryCreditshieldProductBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditshieldProductBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 信护盾产品批量查询
     * Summary: 信护盾产品批量查询.
     *
     * @param QueryCreditshieldProductBatchRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryCreditshieldProductBatchResponse
     */
    public function queryCreditshieldProductBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditshieldProductBatchResponse::fromMap($this->doRequest('1.0', 'riskplus.creditshield.product.batch.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢信贷业务系统线下测试环境测试接口
     * Summary: 天枢信贷业务系统线下测试接口.
     *
     * @param QueryDubheTestRequest $request
     *
     * @return QueryDubheTestResponse
     */
    public function queryDubheTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢信贷业务系统线下测试环境测试接口
     * Summary: 天枢信贷业务系统线下测试接口.
     *
     * @param QueryDubheTestRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryDubheTestResponse
     */
    public function queryDubheTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheTestResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过客户三要素信息查询资金方代码(资金路由)
     * Summary: 天枢系统资金方代码(资金路由)查询.
     *
     * @param QueryDubheRouterFundrouterRequest $request
     *
     * @return QueryDubheRouterFundrouterResponse
     */
    public function queryDubheRouterFundrouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheRouterFundrouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过客户三要素信息查询资金方代码(资金路由)
     * Summary: 天枢系统资金方代码(资金路由)查询.
     *
     * @param QueryDubheRouterFundrouterRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryDubheRouterFundrouterResponse
     */
    public function queryDubheRouterFundrouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheRouterFundrouterResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.router.fundrouter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口.
     *
     * @param ApplyDubheCreditRequest $request
     *
     * @return ApplyDubheCreditResponse
     */
    public function applyDubheCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubheCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口.
     *
     * @param ApplyDubheCreditRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ApplyDubheCreditResponse
     */
    public function applyDubheCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubheCreditResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.credit.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口.
     *
     * @param QueryDubheCreditStatusRequest $request
     *
     * @return QueryDubheCreditStatusResponse
     */
    public function queryDubheCreditStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheCreditStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口.
     *
     * @param QueryDubheCreditStatusRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryDubheCreditStatusResponse
     */
    public function queryDubheCreditStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheCreditStatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.credit.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算.
     *
     * @param CountDubheRepayReftrialRequest $request
     *
     * @return CountDubheRepayReftrialResponse
     */
    public function countDubheRepayReftrial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countDubheRepayReftrialEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算.
     *
     * @param CountDubheRepayReftrialRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CountDubheRepayReftrialResponse
     */
    public function countDubheRepayReftrialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountDubheRepayReftrialResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.reftrial.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询.
     *
     * @param QueryDubheRepayListRequest $request
     *
     * @return QueryDubheRepayListResponse
     */
    public function queryDubheRepayList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheRepayListEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询.
     *
     * @param QueryDubheRepayListRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDubheRepayListResponse
     */
    public function queryDubheRepayListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheRepayListResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口.
     *
     * @param ApplyDubheUsecreditRequest $request
     *
     * @return ApplyDubheUsecreditResponse
     */
    public function applyDubheUsecredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubheUsecreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口.
     *
     * @param ApplyDubheUsecreditRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ApplyDubheUsecreditResponse
     */
    public function applyDubheUsecreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubheUsecreditResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.usecredit.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询.
     *
     * @param QueryDubheUsecreditStatusRequest $request
     *
     * @return QueryDubheUsecreditStatusResponse
     */
    public function queryDubheUsecreditStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheUsecreditStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询.
     *
     * @param QueryDubheUsecreditStatusRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryDubheUsecreditStatusResponse
     */
    public function queryDubheUsecreditStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheUsecreditStatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.usecredit.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算.
     *
     * @param CountDubheRepayTrialRequest $request
     *
     * @return CountDubheRepayTrialResponse
     */
    public function countDubheRepayTrial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countDubheRepayTrialEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算.
     *
     * @param CountDubheRepayTrialRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CountDubheRepayTrialResponse
     */
    public function countDubheRepayTrialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountDubheRepayTrialResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.trial.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口.
     *
     * @param RepayDubheRepayCheckstandRequest $request
     *
     * @return RepayDubheRepayCheckstandResponse
     */
    public function repayDubheRepayCheckstand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayDubheRepayCheckstandEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口.
     *
     * @param RepayDubheRepayCheckstandRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return RepayDubheRepayCheckstandResponse
     */
    public function repayDubheRepayCheckstandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayDubheRepayCheckstandResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.checkstand.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询.
     *
     * @param QueryDubheRepayInfoRequest $request
     *
     * @return QueryDubheRepayInfoResponse
     */
    public function queryDubheRepayInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheRepayInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询.
     *
     * @param QueryDubheRepayInfoRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDubheRepayInfoResponse
     */
    public function queryDubheRepayInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheRepayInfoResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口.
     *
     * @param UpdateDubheCustomerInfoRequest $request
     *
     * @return UpdateDubheCustomerInfoResponse
     */
    public function updateDubheCustomerInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDubheCustomerInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口.
     *
     * @param UpdateDubheCustomerInfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateDubheCustomerInfoResponse
     */
    public function updateDubheCustomerInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDubheCustomerInfoResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.customer.info.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝
     * Summary: 天枢系统协议签约申请(支付宝).
     *
     * @param ApplyDubheCustomerAgreementsignRequest $request
     *
     * @return ApplyDubheCustomerAgreementsignResponse
     */
    public function applyDubheCustomerAgreementsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubheCustomerAgreementsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝
     * Summary: 天枢系统协议签约申请(支付宝).
     *
     * @param ApplyDubheCustomerAgreementsignRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return ApplyDubheCustomerAgreementsignResponse
     */
    public function applyDubheCustomerAgreementsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubheCustomerAgreementsignResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.customer.agreementsign.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝).
     *
     * @param QueryDubheCustomerAgreementsignRequest $request
     *
     * @return QueryDubheCustomerAgreementsignResponse
     */
    public function queryDubheCustomerAgreementsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheCustomerAgreementsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝).
     *
     * @param QueryDubheCustomerAgreementsignRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryDubheCustomerAgreementsignResponse
     */
    public function queryDubheCustomerAgreementsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheCustomerAgreementsignResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.customer.agreementsign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口.
     *
     * @param RepayDubheRepayWithholdRequest $request
     *
     * @return RepayDubheRepayWithholdResponse
     */
    public function repayDubheRepayWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayDubheRepayWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口.
     *
     * @param RepayDubheRepayWithholdRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return RepayDubheRepayWithholdResponse
     */
    public function repayDubheRepayWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayDubheRepayWithholdResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.repay.withhold.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取.
     *
     * @param QueryDubheSearchContractRequest $request
     *
     * @return QueryDubheSearchContractResponse
     */
    public function queryDubheSearchContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheSearchContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取.
     *
     * @param QueryDubheSearchContractRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryDubheSearchContractResponse
     */
    public function queryDubheSearchContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheSearchContractResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.search.contract.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询.
     *
     * @param QueryDubheReceiptOverdueRequest $request
     *
     * @return QueryDubheReceiptOverdueResponse
     */
    public function queryDubheReceiptOverdue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubheReceiptOverdueEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询.
     *
     * @param QueryDubheReceiptOverdueRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryDubheReceiptOverdueResponse
     */
    public function queryDubheReceiptOverdueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubheReceiptOverdueResponse::fromMap($this->doRequest('1.0', 'riskplus.dubhe.receipt.overdue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢发送短信接口，适用于一个模板相同参数
     * Summary: 天枢发送短信接口.
     *
     * @param SendDubbridgeSmsRequest $request
     *
     * @return SendDubbridgeSmsResponse
     */
    public function sendDubbridgeSms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendDubbridgeSmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢发送短信接口，适用于一个模板相同参数
     * Summary: 天枢发送短信接口.
     *
     * @param SendDubbridgeSmsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SendDubbridgeSmsResponse
     */
    public function sendDubbridgeSmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendDubbridgeSmsResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.sms.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
     * Summary: 天枢批量发送短信接口.
     *
     * @param SendDubbridgeSmsBatchRequest $request
     *
     * @return SendDubbridgeSmsBatchResponse
     */
    public function sendDubbridgeSmsBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendDubbridgeSmsBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
     * Summary: 天枢批量发送短信接口.
     *
     * @param SendDubbridgeSmsBatchRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SendDubbridgeSmsBatchResponse
     */
    public function sendDubbridgeSmsBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendDubbridgeSmsBatchResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.sms.batch.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资金路由接口，获取资金方编号
     * Summary: 天枢系统资金方代码(资金路由)查询.
     *
     * @param QueryDubbridgeRouterFundrouterRequest $request
     *
     * @return QueryDubbridgeRouterFundrouterResponse
     */
    public function queryDubbridgeRouterFundrouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRouterFundrouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 资金路由接口，获取资金方编号
     * Summary: 天枢系统资金方代码(资金路由)查询.
     *
     * @param QueryDubbridgeRouterFundrouterRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryDubbridgeRouterFundrouterResponse
     */
    public function queryDubbridgeRouterFundrouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRouterFundrouterResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.router.fundrouter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口.
     *
     * @param ApplyDubbridgeCreditRequest $request
     *
     * @return ApplyDubbridgeCreditResponse
     */
    public function applyDubbridgeCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubbridgeCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口.
     *
     * @param ApplyDubbridgeCreditRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ApplyDubbridgeCreditResponse
     */
    public function applyDubbridgeCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubbridgeCreditResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.credit.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
     * Summary: 天枢文件上传.
     *
     * @param UploadDubbridgeFileRequest $request
     *
     * @return UploadDubbridgeFileResponse
     */
    public function uploadDubbridgeFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadDubbridgeFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
     * Summary: 天枢文件上传.
     *
     * @param UploadDubbridgeFileRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UploadDubbridgeFileResponse
     */
    public function uploadDubbridgeFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.dubbridge.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadDubbridgeFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadDubbridgeFileResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约绑卡接口
     * Summary: 代扣协议签约申请(银行卡绑卡).
     *
     * @param BindDubbridgeCustomerBankcardRequest $request
     *
     * @return BindDubbridgeCustomerBankcardResponse
     */
    public function bindDubbridgeCustomerBankcard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindDubbridgeCustomerBankcardEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约绑卡接口
     * Summary: 代扣协议签约申请(银行卡绑卡).
     *
     * @param BindDubbridgeCustomerBankcardRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BindDubbridgeCustomerBankcardResponse
     */
    public function bindDubbridgeCustomerBankcardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindDubbridgeCustomerBankcardResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.customer.bankcard.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣协议签约提交(银行卡绑卡)
     * Summary: 代扣协议签约校验(银行卡绑卡).
     *
     * @param VerifyDubbridgeCustomerBankcardRequest $request
     *
     * @return VerifyDubbridgeCustomerBankcardResponse
     */
    public function verifyDubbridgeCustomerBankcard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyDubbridgeCustomerBankcardEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣协议签约提交(银行卡绑卡)
     * Summary: 代扣协议签约校验(银行卡绑卡).
     *
     * @param VerifyDubbridgeCustomerBankcardRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return VerifyDubbridgeCustomerBankcardResponse
     */
    public function verifyDubbridgeCustomerBankcardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyDubbridgeCustomerBankcardResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.customer.bankcard.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于机构通道通用回调
     * Summary: 机构通道回调通用接口.
     *
     * @param NotifyDubbridgeDefininnerchannelRequest $request
     *
     * @return NotifyDubbridgeDefininnerchannelResponse
     */
    public function notifyDubbridgeDefininnerchannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyDubbridgeDefininnerchannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于机构通道通用回调
     * Summary: 机构通道回调通用接口.
     *
     * @param NotifyDubbridgeDefininnerchannelRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return NotifyDubbridgeDefininnerchannelResponse
     */
    public function notifyDubbridgeDefininnerchannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyDubbridgeDefininnerchannelResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.defininnerchannel.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口.
     *
     * @param QueryDubbridgeCreditStatusRequest $request
     *
     * @return QueryDubbridgeCreditStatusResponse
     */
    public function queryDubbridgeCreditStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeCreditStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口.
     *
     * @param QueryDubbridgeCreditStatusRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryDubbridgeCreditStatusResponse
     */
    public function queryDubbridgeCreditStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeCreditStatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.credit.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统企业小微分查询
     * Summary: 天枢系统企业小微分查询.
     *
     * @param QueryDubbridgeRiskinfoEnterprisescoreRequest $request
     *
     * @return QueryDubbridgeRiskinfoEnterprisescoreResponse
     */
    public function queryDubbridgeRiskinfoEnterprisescore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRiskinfoEnterprisescoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统企业小微分查询
     * Summary: 天枢系统企业小微分查询.
     *
     * @param QueryDubbridgeRiskinfoEnterprisescoreRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryDubbridgeRiskinfoEnterprisescoreResponse
     */
    public function queryDubbridgeRiskinfoEnterprisescoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRiskinfoEnterprisescoreResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.riskinfo.enterprisescore.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统风控信息通用查询
     * Summary: 天枢系统风控信息通用查询.
     *
     * @param QueryDubbridgeRiskinfoCommonRequest $request
     *
     * @return QueryDubbridgeRiskinfoCommonResponse
     */
    public function queryDubbridgeRiskinfoCommon($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRiskinfoCommonEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统风控信息通用查询
     * Summary: 天枢系统风控信息通用查询.
     *
     * @param QueryDubbridgeRiskinfoCommonRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryDubbridgeRiskinfoCommonResponse
     */
    public function queryDubbridgeRiskinfoCommonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRiskinfoCommonResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.riskinfo.common.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 额度、利率、状态调整
     * Summary: 调额申请.
     *
     * @param UpdateDubbridgeInstitutionCreditRequest $request
     *
     * @return UpdateDubbridgeInstitutionCreditResponse
     */
    public function updateDubbridgeInstitutionCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDubbridgeInstitutionCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 额度、利率、状态调整
     * Summary: 调额申请.
     *
     * @param UpdateDubbridgeInstitutionCreditRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return UpdateDubbridgeInstitutionCreditResponse
     */
    public function updateDubbridgeInstitutionCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDubbridgeInstitutionCreditResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.institution.credit.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢企业经营数据查询
     * Summary: 天枢企业经营数据查询.
     *
     * @param QueryDubbridgeRiskinfoBusinessinfoRequest $request
     *
     * @return QueryDubbridgeRiskinfoBusinessinfoResponse
     */
    public function queryDubbridgeRiskinfoBusinessinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRiskinfoBusinessinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢企业经营数据查询
     * Summary: 天枢企业经营数据查询.
     *
     * @param QueryDubbridgeRiskinfoBusinessinfoRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryDubbridgeRiskinfoBusinessinfoResponse
     */
    public function queryDubbridgeRiskinfoBusinessinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRiskinfoBusinessinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.riskinfo.businessinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝）
     * Summary: 天枢系统协议签约申请(支付宝).
     *
     * @param ApplyDubbridgeCustomerAgreementsignRequest $request
     *
     * @return ApplyDubbridgeCustomerAgreementsignResponse
     */
    public function applyDubbridgeCustomerAgreementsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubbridgeCustomerAgreementsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝）
     * Summary: 天枢系统协议签约申请(支付宝).
     *
     * @param ApplyDubbridgeCustomerAgreementsignRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return ApplyDubbridgeCustomerAgreementsignResponse
     */
    public function applyDubbridgeCustomerAgreementsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubbridgeCustomerAgreementsignResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.customer.agreementsign.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统是否授信查询
     * Summary: 天枢系统是否授信查询.
     *
     * @param QueryDubbridgeAccountStatusRequest $request
     *
     * @return QueryDubbridgeAccountStatusResponse
     */
    public function queryDubbridgeAccountStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeAccountStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统是否授信查询
     * Summary: 天枢系统是否授信查询.
     *
     * @param QueryDubbridgeAccountStatusRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryDubbridgeAccountStatusResponse
     */
    public function queryDubbridgeAccountStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeAccountStatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.account.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统校验是否联登
     * Summary: 天枢系统校验是否联登.
     *
     * @param QueryDubbridgeAccountCustomRequest $request
     *
     * @return QueryDubbridgeAccountCustomResponse
     */
    public function queryDubbridgeAccountCustom($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeAccountCustomEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统校验是否联登
     * Summary: 天枢系统校验是否联登.
     *
     * @param QueryDubbridgeAccountCustomRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryDubbridgeAccountCustomResponse
     */
    public function queryDubbridgeAccountCustomEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeAccountCustomResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.account.custom.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统更新渠道
     * Summary: 天枢系统更新渠道.
     *
     * @param UpdateDubbridgeAccountCustomRequest $request
     *
     * @return UpdateDubbridgeAccountCustomResponse
     */
    public function updateDubbridgeAccountCustom($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDubbridgeAccountCustomEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统更新渠道
     * Summary: 天枢系统更新渠道.
     *
     * @param UpdateDubbridgeAccountCustomRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateDubbridgeAccountCustomResponse
     */
    public function updateDubbridgeAccountCustomEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDubbridgeAccountCustomResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.account.custom.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝).
     *
     * @param QueryDubbridgeCustomerAgreementsignRequest $request
     *
     * @return QueryDubbridgeCustomerAgreementsignResponse
     */
    public function queryDubbridgeCustomerAgreementsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeCustomerAgreementsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝).
     *
     * @param QueryDubbridgeCustomerAgreementsignRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryDubbridgeCustomerAgreementsignResponse
     */
    public function queryDubbridgeCustomerAgreementsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeCustomerAgreementsignResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.customer.agreementsign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口.
     *
     * @param UpdateDubbridgeCustomerInfoRequest $request
     *
     * @return UpdateDubbridgeCustomerInfoResponse
     */
    public function updateDubbridgeCustomerInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDubbridgeCustomerInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口.
     *
     * @param UpdateDubbridgeCustomerInfoRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateDubbridgeCustomerInfoResponse
     */
    public function updateDubbridgeCustomerInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDubbridgeCustomerInfoResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.customer.info.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询.
     *
     * @param QueryDubbridgeReceiptOverdueRequest $request
     *
     * @return QueryDubbridgeReceiptOverdueResponse
     */
    public function queryDubbridgeReceiptOverdue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeReceiptOverdueEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询.
     *
     * @param QueryDubbridgeReceiptOverdueRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryDubbridgeReceiptOverdueResponse
     */
    public function queryDubbridgeReceiptOverdueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeReceiptOverdueResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.receipt.overdue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口.
     *
     * @param RepayDubbridgeRepayCheckstandRequest $request
     *
     * @return RepayDubbridgeRepayCheckstandResponse
     */
    public function repayDubbridgeRepayCheckstand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayDubbridgeRepayCheckstandEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口.
     *
     * @param RepayDubbridgeRepayCheckstandRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return RepayDubbridgeRepayCheckstandResponse
     */
    public function repayDubbridgeRepayCheckstandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayDubbridgeRepayCheckstandResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.repay.checkstand.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询.
     *
     * @param QueryDubbridgeRepayInfoRequest $request
     *
     * @return QueryDubbridgeRepayInfoResponse
     */
    public function queryDubbridgeRepayInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRepayInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询.
     *
     * @param QueryDubbridgeRepayInfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDubbridgeRepayInfoResponse
     */
    public function queryDubbridgeRepayInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRepayInfoResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.repay.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询.
     *
     * @param QueryDubbridgeRepayListRequest $request
     *
     * @return QueryDubbridgeRepayListResponse
     */
    public function queryDubbridgeRepayList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRepayListEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询.
     *
     * @param QueryDubbridgeRepayListRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDubbridgeRepayListResponse
     */
    public function queryDubbridgeRepayListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRepayListResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.repay.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算.
     *
     * @param CountDubbridgeRepayReftrialRequest $request
     *
     * @return CountDubbridgeRepayReftrialResponse
     */
    public function countDubbridgeRepayReftrial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countDubbridgeRepayReftrialEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算.
     *
     * @param CountDubbridgeRepayReftrialRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CountDubbridgeRepayReftrialResponse
     */
    public function countDubbridgeRepayReftrialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountDubbridgeRepayReftrialResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.repay.reftrial.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算.
     *
     * @param CountDubbridgeRepayTrialRequest $request
     *
     * @return CountDubbridgeRepayTrialResponse
     */
    public function countDubbridgeRepayTrial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countDubbridgeRepayTrialEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算.
     *
     * @param CountDubbridgeRepayTrialRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CountDubbridgeRepayTrialResponse
     */
    public function countDubbridgeRepayTrialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountDubbridgeRepayTrialResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.repay.trial.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口.
     *
     * @param RepayDubbridgeRepayWithholdRequest $request
     *
     * @return RepayDubbridgeRepayWithholdResponse
     */
    public function repayDubbridgeRepayWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayDubbridgeRepayWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口.
     *
     * @param RepayDubbridgeRepayWithholdRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return RepayDubbridgeRepayWithholdResponse
     */
    public function repayDubbridgeRepayWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayDubbridgeRepayWithholdResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.repay.withhold.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取.
     *
     * @param QueryDubbridgeSearchContractRequest $request
     *
     * @return QueryDubbridgeSearchContractResponse
     */
    public function queryDubbridgeSearchContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeSearchContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取.
     *
     * @param QueryDubbridgeSearchContractRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryDubbridgeSearchContractResponse
     */
    public function queryDubbridgeSearchContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeSearchContractResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.search.contract.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口.
     *
     * @param ApplyDubbridgeUsecreditRequest $request
     *
     * @return ApplyDubbridgeUsecreditResponse
     */
    public function applyDubbridgeUsecredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyDubbridgeUsecreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口.
     *
     * @param ApplyDubbridgeUsecreditRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ApplyDubbridgeUsecreditResponse
     */
    public function applyDubbridgeUsecreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyDubbridgeUsecreditResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.usecredit.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询.
     *
     * @param QueryDubbridgeUsecreditStatusRequest $request
     *
     * @return QueryDubbridgeUsecreditStatusResponse
     */
    public function queryDubbridgeUsecreditStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeUsecreditStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询.
     *
     * @param QueryDubbridgeUsecreditStatusRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryDubbridgeUsecreditStatusResponse
     */
    public function queryDubbridgeUsecreditStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeUsecreditStatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.usecredit.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统是否结清
     * Summary: 天枢系统借款是否结清.
     *
     * @param QueryDubbridgeReceiptStatusRequest $request
     *
     * @return QueryDubbridgeReceiptStatusResponse
     */
    public function queryDubbridgeReceiptStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeReceiptStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统是否结清
     * Summary: 天枢系统借款是否结清.
     *
     * @param QueryDubbridgeReceiptStatusRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryDubbridgeReceiptStatusResponse
     */
    public function queryDubbridgeReceiptStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeReceiptStatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.receipt.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统协议签约查询(通用)
     * Summary: 天枢系统协议签约查询(通用).
     *
     * @param QueryDubbridgeCustomerCommonagreementsignRequest $request
     *
     * @return QueryDubbridgeCustomerCommonagreementsignResponse
     */
    public function queryDubbridgeCustomerCommonagreementsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeCustomerCommonagreementsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统协议签约查询(通用)
     * Summary: 天枢系统协议签约查询(通用).
     *
     * @param QueryDubbridgeCustomerCommonagreementsignRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return QueryDubbridgeCustomerCommonagreementsignResponse
     */
    public function queryDubbridgeCustomerCommonagreementsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeCustomerCommonagreementsignResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.customer.commonagreementsign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户影像信息更新
     * Summary: 客户影像信息更新.
     *
     * @param UpdateDubbridgeFileRequest $request
     *
     * @return UpdateDubbridgeFileResponse
     */
    public function updateDubbridgeFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDubbridgeFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户影像信息更新
     * Summary: 客户影像信息更新.
     *
     * @param UpdateDubbridgeFileRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateDubbridgeFileResponse
     */
    public function updateDubbridgeFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDubbridgeFileResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.file.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢回调通用接口
     * Summary: 天枢回调通用接口.
     *
     * @param NotifyDubbridgeCallbackRequest $request
     *
     * @return NotifyDubbridgeCallbackResponse
     */
    public function notifyDubbridgeCallback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyDubbridgeCallbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢回调通用接口
     * Summary: 天枢回调通用接口.
     *
     * @param NotifyDubbridgeCallbackRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return NotifyDubbridgeCallbackResponse
     */
    public function notifyDubbridgeCallbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyDubbridgeCallbackResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.callback.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 2.12	天枢系统还款信息查询V2.0
     * Summary: 2.12 天枢系统还款信息查询V2.0.
     *
     * @param QueryDubbridgeRepayResultRequest $request
     *
     * @return QueryDubbridgeRepayResultResponse
     */
    public function queryDubbridgeRepayResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRepayResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 2.12	天枢系统还款信息查询V2.0
     * Summary: 2.12 天枢系统还款信息查询V2.0.
     *
     * @param QueryDubbridgeRepayResultRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryDubbridgeRepayResultResponse
     */
    public function queryDubbridgeRepayResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRepayResultResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.repay.result.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢准入接口
     * Summary: 天枢准入接口.
     *
     * @param QueryDubbridgeCreditPermitRequest $request
     *
     * @return QueryDubbridgeCreditPermitResponse
     */
    public function queryDubbridgeCreditPermit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeCreditPermitEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢准入接口
     * Summary: 天枢准入接口.
     *
     * @param QueryDubbridgeCreditPermitRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryDubbridgeCreditPermitResponse
     */
    public function queryDubbridgeCreditPermitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeCreditPermitResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.credit.permit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户状态判断
     * Summary: 用户状态判断.
     *
     * @param QueryDubbridgeUserUpgradestatusRequest $request
     *
     * @return QueryDubbridgeUserUpgradestatusResponse
     */
    public function queryDubbridgeUserUpgradestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeUserUpgradestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户状态判断
     * Summary: 用户状态判断.
     *
     * @param QueryDubbridgeUserUpgradestatusRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryDubbridgeUserUpgradestatusResponse
     */
    public function queryDubbridgeUserUpgradestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeUserUpgradestatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.user.upgradestatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 借据状态判断
     * Summary: 借据状态判断.
     *
     * @param QueryDubbridgeLoanUpgradestatusRequest $request
     *
     * @return QueryDubbridgeLoanUpgradestatusResponse
     */
    public function queryDubbridgeLoanUpgradestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeLoanUpgradestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 借据状态判断
     * Summary: 借据状态判断.
     *
     * @param QueryDubbridgeLoanUpgradestatusRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryDubbridgeLoanUpgradestatusResponse
     */
    public function queryDubbridgeLoanUpgradestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeLoanUpgradestatusResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.loan.upgradestatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付签约查询(用户绑定银行卡列表)
     * Summary: 支付签约查询(用户绑定银行卡列表).
     *
     * @param QueryDubbridgeCustomerBankcardlistRequest $request
     *
     * @return QueryDubbridgeCustomerBankcardlistResponse
     */
    public function queryDubbridgeCustomerBankcardlist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeCustomerBankcardlistEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付签约查询(用户绑定银行卡列表)
     * Summary: 支付签约查询(用户绑定银行卡列表).
     *
     * @param QueryDubbridgeCustomerBankcardlistRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryDubbridgeCustomerBankcardlistResponse
     */
    public function queryDubbridgeCustomerBankcardlistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeCustomerBankcardlistResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.customer.bankcardlist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统用户前筛查询
     * Summary: 天枢系统用户前筛查询.
     *
     * @param QueryDubbridgeRouterUserselectRequest $request
     *
     * @return QueryDubbridgeRouterUserselectResponse
     */
    public function queryDubbridgeRouterUserselect($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRouterUserselectEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统用户前筛查询
     * Summary: 天枢系统用户前筛查询.
     *
     * @param QueryDubbridgeRouterUserselectRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryDubbridgeRouterUserselectResponse
     */
    public function queryDubbridgeRouterUserselectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRouterUserselectResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.router.userselect.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统开具结清证明
     * Summary: 天枢系统开具结清证明.
     *
     * @param QueryDubbridgeSettlementCertificateRequest $request
     *
     * @return QueryDubbridgeSettlementCertificateResponse
     */
    public function queryDubbridgeSettlementCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeSettlementCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统开具结清证明
     * Summary: 天枢系统开具结清证明.
     *
     * @param QueryDubbridgeSettlementCertificateRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryDubbridgeSettlementCertificateResponse
     */
    public function queryDubbridgeSettlementCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeSettlementCertificateResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.settlement.certificate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统预览协议查询接口
     * Summary: 天枢系统预览协议查询接口.
     *
     * @param QueryDubbridgeAgreementPreviewRequest $request
     *
     * @return QueryDubbridgeAgreementPreviewResponse
     */
    public function queryDubbridgeAgreementPreview($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeAgreementPreviewEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统预览协议查询接口
     * Summary: 天枢系统预览协议查询接口.
     *
     * @param QueryDubbridgeAgreementPreviewRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryDubbridgeAgreementPreviewResponse
     */
    public function queryDubbridgeAgreementPreviewEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeAgreementPreviewResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.agreement.preview.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户借款是否结清
     * Summary: 用户借款是否结清.
     *
     * @param QueryDubbridgeAccountUsecreditRequest $request
     *
     * @return QueryDubbridgeAccountUsecreditResponse
     */
    public function queryDubbridgeAccountUsecredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeAccountUsecreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户借款是否结清
     * Summary: 用户借款是否结清.
     *
     * @param QueryDubbridgeAccountUsecreditRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryDubbridgeAccountUsecreditResponse
     */
    public function queryDubbridgeAccountUsecreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeAccountUsecreditResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.account.usecredit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢用户聚合状态查询接口
     * Summary: 天枢用户聚合状态查询接口.
     *
     * @param QueryDubbridgeUserAggregationinfoRequest $request
     *
     * @return QueryDubbridgeUserAggregationinfoResponse
     */
    public function queryDubbridgeUserAggregationinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeUserAggregationinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢用户聚合状态查询接口
     * Summary: 天枢用户聚合状态查询接口.
     *
     * @param QueryDubbridgeUserAggregationinfoRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryDubbridgeUserAggregationinfoResponse
     */
    public function queryDubbridgeUserAggregationinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeUserAggregationinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.user.aggregationinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统优惠券列表查询接口
     * Summary: 天枢系统优惠券列表查询接口.
     *
     * @param QueryDubbridgeMarketingCouponlistRequest $request
     *
     * @return QueryDubbridgeMarketingCouponlistResponse
     */
    public function queryDubbridgeMarketingCouponlist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeMarketingCouponlistEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统优惠券列表查询接口
     * Summary: 天枢系统优惠券列表查询接口.
     *
     * @param QueryDubbridgeMarketingCouponlistRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryDubbridgeMarketingCouponlistResponse
     */
    public function queryDubbridgeMarketingCouponlistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeMarketingCouponlistResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.marketing.couponlist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统还款方式查询
     * Summary: 天枢系统还款方式查询.
     *
     * @param QueryDubbridgeRepaytypeInfoRequest $request
     *
     * @return QueryDubbridgeRepaytypeInfoResponse
     */
    public function queryDubbridgeRepaytypeInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeRepaytypeInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统还款方式查询
     * Summary: 天枢系统还款方式查询.
     *
     * @param QueryDubbridgeRepaytypeInfoRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryDubbridgeRepaytypeInfoResponse
     */
    public function queryDubbridgeRepaytypeInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeRepaytypeInfoResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.repaytype.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统授信额度查询接口-分期付
     * Summary: 天枢系统授信额度查询接口-分期付.
     *
     * @param QueryDubbridgeInstallmentCreditamtRequest $request
     *
     * @return QueryDubbridgeInstallmentCreditamtResponse
     */
    public function queryDubbridgeInstallmentCreditamt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeInstallmentCreditamtEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统授信额度查询接口-分期付
     * Summary: 天枢系统授信额度查询接口-分期付.
     *
     * @param QueryDubbridgeInstallmentCreditamtRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryDubbridgeInstallmentCreditamtResponse
     */
    public function queryDubbridgeInstallmentCreditamtEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeInstallmentCreditamtResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.installment.creditamt.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统取消分期付订单-分期付
     * Summary: 天枢系统取消分期付订单-分期付.
     *
     * @param CancelDubbridgeInstallmentOrderRequest $request
     *
     * @return CancelDubbridgeInstallmentOrderResponse
     */
    public function cancelDubbridgeInstallmentOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelDubbridgeInstallmentOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统取消分期付订单-分期付
     * Summary: 天枢系统取消分期付订单-分期付.
     *
     * @param CancelDubbridgeInstallmentOrderRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return CancelDubbridgeInstallmentOrderResponse
     */
    public function cancelDubbridgeInstallmentOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelDubbridgeInstallmentOrderResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.installment.order.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统支用后补充材料推送-分期付
     * Summary: 天枢系统支用后补充材料推送-分期付.
     *
     * @param PushDubbridgeInstallmentSupplementRequest $request
     *
     * @return PushDubbridgeInstallmentSupplementResponse
     */
    public function pushDubbridgeInstallmentSupplement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushDubbridgeInstallmentSupplementEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统支用后补充材料推送-分期付
     * Summary: 天枢系统支用后补充材料推送-分期付.
     *
     * @param PushDubbridgeInstallmentSupplementRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return PushDubbridgeInstallmentSupplementResponse
     */
    public function pushDubbridgeInstallmentSupplementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushDubbridgeInstallmentSupplementResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.installment.supplement.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统分期试算
     * Summary: 天枢系统分期试算.
     *
     * @param QueryDubbridgeInstallmentTrialRequest $request
     *
     * @return QueryDubbridgeInstallmentTrialResponse
     */
    public function queryDubbridgeInstallmentTrial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeInstallmentTrialEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统分期试算
     * Summary: 天枢系统分期试算.
     *
     * @param QueryDubbridgeInstallmentTrialRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryDubbridgeInstallmentTrialResponse
     */
    public function queryDubbridgeInstallmentTrialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeInstallmentTrialResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.installment.trial.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统二级商户入驻图片上传-分期付
     * Summary: 天枢系统二级商户入驻图片上传-分期付.
     *
     * @param UploadDubbridgeAlipayImageRequest $request
     *
     * @return UploadDubbridgeAlipayImageResponse
     */
    public function uploadDubbridgeAlipayImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadDubbridgeAlipayImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统二级商户入驻图片上传-分期付
     * Summary: 天枢系统二级商户入驻图片上传-分期付.
     *
     * @param UploadDubbridgeAlipayImageRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UploadDubbridgeAlipayImageResponse
     */
    public function uploadDubbridgeAlipayImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadDubbridgeAlipayImageResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.alipay.image.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统二级商户入驻-分期付
     * Summary: 天枢系统二级商户入驻-分期付.
     *
     * @param CreateDubbridgeAlipayMerchantRequest $request
     *
     * @return CreateDubbridgeAlipayMerchantResponse
     */
    public function createDubbridgeAlipayMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDubbridgeAlipayMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统二级商户入驻-分期付
     * Summary: 天枢系统二级商户入驻-分期付.
     *
     * @param CreateDubbridgeAlipayMerchantRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateDubbridgeAlipayMerchantResponse
     */
    public function createDubbridgeAlipayMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDubbridgeAlipayMerchantResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.alipay.merchant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统二级商户入驻结果查询-分期付
     * Summary: 天枢系统二级商户入驻结果查询-分期付.
     *
     * @param QueryDubbridgeAlipayMerchantRequest $request
     *
     * @return QueryDubbridgeAlipayMerchantResponse
     */
    public function queryDubbridgeAlipayMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDubbridgeAlipayMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统二级商户入驻结果查询-分期付
     * Summary: 天枢系统二级商户入驻结果查询-分期付.
     *
     * @param QueryDubbridgeAlipayMerchantRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryDubbridgeAlipayMerchantResponse
     */
    public function queryDubbridgeAlipayMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDubbridgeAlipayMerchantResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.alipay.merchant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天枢系统二级商户支付宝订单码创建-分期付
     * Summary: 天枢系统二级商户支付宝订单码创建-分期付.
     *
     * @param CreateDubbridgeAlipayTradeRequest $request
     *
     * @return CreateDubbridgeAlipayTradeResponse
     */
    public function createDubbridgeAlipayTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDubbridgeAlipayTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 天枢系统二级商户支付宝订单码创建-分期付
     * Summary: 天枢系统二级商户支付宝订单码创建-分期付.
     *
     * @param CreateDubbridgeAlipayTradeRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateDubbridgeAlipayTradeResponse
     */
    public function createDubbridgeAlipayTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDubbridgeAlipayTradeResponse::fromMap($this->doRequest('1.0', 'riskplus.dubbridge.alipay.trade.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口.
     *
     * @param VerifyFinserviceZhimaIdentifyRequest $request
     *
     * @return VerifyFinserviceZhimaIdentifyResponse
     */
    public function verifyFinserviceZhimaIdentify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyFinserviceZhimaIdentifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口.
     *
     * @param VerifyFinserviceZhimaIdentifyRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return VerifyFinserviceZhimaIdentifyResponse
     */
    public function verifyFinserviceZhimaIdentifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyFinserviceZhimaIdentifyResponse::fromMap($this->doRequest('1.0', 'riskplus.finservice.zhima.identify.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: 芝麻四要素认证结果查询.
     *
     * @param QueryFinserviceZhimaIdentifyRequest $request
     *
     * @return QueryFinserviceZhimaIdentifyResponse
     */
    public function queryFinserviceZhimaIdentify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFinserviceZhimaIdentifyEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: 芝麻四要素认证结果查询.
     *
     * @param QueryFinserviceZhimaIdentifyRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryFinserviceZhimaIdentifyResponse
     */
    public function queryFinserviceZhimaIdentifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFinserviceZhimaIdentifyResponse::fromMap($this->doRequest('1.0', 'riskplus.finservice.zhima.identify.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 多源融合平台的数据服务查询接口
     * Summary: 多源融合平台的数据服务查询接口.
     *
     * @param QueryMdipDataserviceRequest $request
     *
     * @return QueryMdipDataserviceResponse
     */
    public function queryMdipDataservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMdipDataserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 多源融合平台的数据服务查询接口
     * Summary: 多源融合平台的数据服务查询接口.
     *
     * @param QueryMdipDataserviceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryMdipDataserviceResponse
     */
    public function queryMdipDataserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMdipDataserviceResponse::fromMap($this->doRequest('1.0', 'riskplus.mdip.dataservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 接受op的文件id,支持外网多源文件上传
     * Summary: 接受op的文件id,支持外网多源文件上传.
     *
     * @param ReceiveMdipParamsFileRequest $request
     *
     * @return ReceiveMdipParamsFileResponse
     */
    public function receiveMdipParamsFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->receiveMdipParamsFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 接受op的文件id,支持外网多源文件上传
     * Summary: 接受op的文件id,支持外网多源文件上传.
     *
     * @param ReceiveMdipParamsFileRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ReceiveMdipParamsFileResponse
     */
    public function receiveMdipParamsFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.mdip.params.file.receive',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ReceiveMdipParamsFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return ReceiveMdipParamsFileResponse::fromMap($this->doRequest('1.0', 'riskplus.mdip.params.file.receive', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 接受op的文件id,支持风险大脑文件上传
     * Summary: 接受op的文件id,支持风险大脑文件上传.
     *
     * @param ReceiveMdipParamsRbbfileRequest $request
     *
     * @return ReceiveMdipParamsRbbfileResponse
     */
    public function receiveMdipParamsRbbfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->receiveMdipParamsRbbfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 接受op的文件id,支持风险大脑文件上传
     * Summary: 接受op的文件id,支持风险大脑文件上传.
     *
     * @param ReceiveMdipParamsRbbfileRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ReceiveMdipParamsRbbfileResponse
     */
    public function receiveMdipParamsRbbfileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.mdip.params.rbbfile.receive',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ReceiveMdipParamsRbbfileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return ReceiveMdipParamsRbbfileResponse::fromMap($this->doRequest('1.0', 'riskplus.mdip.params.rbbfile.receive', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 多源平台审批回调接口
     * Summary: 多源平台审批回调接口.
     *
     * @param CallbackMdipAuditRequest $request
     *
     * @return CallbackMdipAuditResponse
     */
    public function callbackMdipAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackMdipAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 多源平台审批回调接口
     * Summary: 多源平台审批回调接口.
     *
     * @param CallbackMdipAuditRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CallbackMdipAuditResponse
     */
    public function callbackMdipAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackMdipAuditResponse::fromMap($this->doRequest('1.0', 'riskplus.mdip.audit.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
     * Summary: 多源融合平台的POC数据服务查询接口.
     *
     * @param QueryMdipDataservicePocRequest $request
     *
     * @return QueryMdipDataservicePocResponse
     */
    public function queryMdipDataservicePoc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMdipDataservicePocEx($request, $headers, $runtime);
    }

    /**
     * Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
     * Summary: 多源融合平台的POC数据服务查询接口.
     *
     * @param QueryMdipDataservicePocRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryMdipDataservicePocResponse
     */
    public function queryMdipDataservicePocEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMdipDataservicePocResponse::fromMap($this->doRequest('1.0', 'riskplus.mdip.dataservice.poc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询默认租户的供应商列表
     * Summary: 查询默认租户的供应商列表.
     *
     * @param ListMdipDefaultSupplierRequest $request
     *
     * @return ListMdipDefaultSupplierResponse
     */
    public function listMdipDefaultSupplier($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listMdipDefaultSupplierEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询默认租户的供应商列表
     * Summary: 查询默认租户的供应商列表.
     *
     * @param ListMdipDefaultSupplierRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListMdipDefaultSupplierResponse
     */
    public function listMdipDefaultSupplierEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListMdipDefaultSupplierResponse::fromMap($this->doRequest('1.0', 'riskplus.mdip.default.supplier.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据回调
     * Summary: 云凤蝶回调参数.
     *
     * @param CallbackMdipYunfengdieParamsRequest $request
     *
     * @return CallbackMdipYunfengdieParamsResponse
     */
    public function callbackMdipYunfengdieParams($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackMdipYunfengdieParamsEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据回调
     * Summary: 云凤蝶回调参数.
     *
     * @param CallbackMdipYunfengdieParamsRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CallbackMdipYunfengdieParamsResponse
     */
    public function callbackMdipYunfengdieParamsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackMdipYunfengdieParamsResponse::fromMap($this->doRequest('1.0', 'riskplus.mdip.yunfengdie.params.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量实时触达接口
     * Summary: 发起触达任务
     *
     * @param ApplyQmpRtBatchmarketingRequest $request
     *
     * @return ApplyQmpRtBatchmarketingResponse
     */
    public function applyQmpRtBatchmarketing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyQmpRtBatchmarketingEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量实时触达接口
     * Summary: 发起触达任务
     *
     * @param ApplyQmpRtBatchmarketingRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ApplyQmpRtBatchmarketingResponse
     */
    public function applyQmpRtBatchmarketingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyQmpRtBatchmarketingResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.rt.batchmarketing.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本短信批量发送接口
     * Summary: 文本短信批量发送接口.
     *
     * @param SendQmpTextsmsBatchRequest $request
     *
     * @return SendQmpTextsmsBatchResponse
     */
    public function sendQmpTextsmsBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendQmpTextsmsBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本短信批量发送接口
     * Summary: 文本短信批量发送接口.
     *
     * @param SendQmpTextsmsBatchRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SendQmpTextsmsBatchResponse
     */
    public function sendQmpTextsmsBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendQmpTextsmsBatchResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.textsms.batch.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起AI外呼
     * Summary: 发起AI外呼
     *
     * @param ApplyQmpRobotcallRequest $request
     *
     * @return ApplyQmpRobotcallResponse
     */
    public function applyQmpRobotcall($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyQmpRobotcallEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起AI外呼
     * Summary: 发起AI外呼
     *
     * @param ApplyQmpRobotcallRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ApplyQmpRobotcallResponse
     */
    public function applyQmpRobotcallEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyQmpRobotcallResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.robotcall.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口.
     *
     * @param SendQmpCardsmsBatchRequest $request
     *
     * @return SendQmpCardsmsBatchResponse
     */
    public function sendQmpCardsmsBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendQmpCardsmsBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口.
     *
     * @param SendQmpCardsmsBatchRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SendQmpCardsmsBatchResponse
     */
    public function sendQmpCardsmsBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendQmpCardsmsBatchResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.cardsms.batch.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上行短信回调
     * Summary: 上行短信回调.
     *
     * @param CallbackQmpSmsUpRequest $request
     *
     * @return CallbackQmpSmsUpResponse
     */
    public function callbackQmpSmsUp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackQmpSmsUpEx($request, $headers, $runtime);
    }

    /**
     * Description: 上行短信回调
     * Summary: 上行短信回调.
     *
     * @param CallbackQmpSmsUpRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CallbackQmpSmsUpResponse
     */
    public function callbackQmpSmsUpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackQmpSmsUpResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.sms.up.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短信状态回调接口
     * Summary: 短信状态回调接口.
     *
     * @param CallbackQmpSmsReportRequest $request
     *
     * @return CallbackQmpSmsReportResponse
     */
    public function callbackQmpSmsReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackQmpSmsReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 短信状态回调接口
     * Summary: 短信状态回调接口.
     *
     * @param CallbackQmpSmsReportRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CallbackQmpSmsReportResponse
     */
    public function callbackQmpSmsReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackQmpSmsReportResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.sms.report.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字短信批量发送接口（单模板）
     * Summary: 数字短信批量发送接口（单模板）.
     *
     * @param SendQmpDigitalsmsBatchRequest $request
     *
     * @return SendQmpDigitalsmsBatchResponse
     */
    public function sendQmpDigitalsmsBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendQmpDigitalsmsBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字短信批量发送接口（单模板）
     * Summary: 数字短信批量发送接口（单模板）.
     *
     * @param SendQmpDigitalsmsBatchRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SendQmpDigitalsmsBatchResponse
     */
    public function sendQmpDigitalsmsBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendQmpDigitalsmsBatchResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.digitalsms.batch.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新接入ai外呼服务商的回调接口
     * Summary:  ai外呼回调接口.
     *
     * @param CallbackQmpRobotcallRequest $request
     *
     * @return CallbackQmpRobotcallResponse
     */
    public function callbackQmpRobotcall($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackQmpRobotcallEx($request, $headers, $runtime);
    }

    /**
     * Description: 新接入ai外呼服务商的回调接口
     * Summary:  ai外呼回调接口.
     *
     * @param CallbackQmpRobotcallRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CallbackQmpRobotcallResponse
     */
    public function callbackQmpRobotcallEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackQmpRobotcallResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.robotcall.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询ai外呼任务详情
     * Summary:  查询ai外呼任务详情.
     *
     * @param QueryQmpRobotcallDetailRequest $request
     *
     * @return QueryQmpRobotcallDetailResponse
     */
    public function queryQmpRobotcallDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQmpRobotcallDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询ai外呼任务详情
     * Summary:  查询ai外呼任务详情.
     *
     * @param QueryQmpRobotcallDetailRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryQmpRobotcallDetailResponse
     */
    public function queryQmpRobotcallDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQmpRobotcallDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.robotcall.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流量风控回执统计查询
     * Summary: 流量风控回执统计查询.
     *
     * @param QueryQmpDataaccessStatisticRequest $request
     *
     * @return QueryQmpDataaccessStatisticResponse
     */
    public function queryQmpDataaccessStatistic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQmpDataaccessStatisticEx($request, $headers, $runtime);
    }

    /**
     * Description: 流量风控回执统计查询
     * Summary: 流量风控回执统计查询.
     *
     * @param QueryQmpDataaccessStatisticRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryQmpDataaccessStatisticResponse
     */
    public function queryQmpDataaccessStatisticEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQmpDataaccessStatisticResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.dataaccess.statistic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外呼任务统计查询接口
     * Summary:  外呼任务统计查询接口.
     *
     * @param QueryQmpRobotcallStatisticinfoRequest $request
     *
     * @return QueryQmpRobotcallStatisticinfoResponse
     */
    public function queryQmpRobotcallStatisticinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQmpRobotcallStatisticinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 外呼任务统计查询接口
     * Summary:  外呼任务统计查询接口.
     *
     * @param QueryQmpRobotcallStatisticinfoRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryQmpRobotcallStatisticinfoResponse
     */
    public function queryQmpRobotcallStatisticinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQmpRobotcallStatisticinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.robotcall.statisticinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 触达执行任务详情查询
     * Summary: 触达执行任务详情查询.
     *
     * @param BatchqueryQmpTaskDetailRequest $request
     *
     * @return BatchqueryQmpTaskDetailResponse
     */
    public function batchqueryQmpTaskDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryQmpTaskDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 触达执行任务详情查询
     * Summary: 触达执行任务详情查询.
     *
     * @param BatchqueryQmpTaskDetailRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return BatchqueryQmpTaskDetailResponse
     */
    public function batchqueryQmpTaskDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryQmpTaskDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.task.detail.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询.
     *
     * @param QueryQmpCardsmsSupportRequest $request
     *
     * @return QueryQmpCardsmsSupportResponse
     */
    public function queryQmpCardsmsSupport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQmpCardsmsSupportEx($request, $headers, $runtime);
    }

    /**
     * Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询.
     *
     * @param QueryQmpCardsmsSupportRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryQmpCardsmsSupportResponse
     */
    public function queryQmpCardsmsSupportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQmpCardsmsSupportResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.cardsms.support.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流量风控查询外呼策略详情
     * Summary: 流量风控查询外呼策略详情.
     *
     * @param BatchqueryQmpActionplanDetailRequest $request
     *
     * @return BatchqueryQmpActionplanDetailResponse
     */
    public function batchqueryQmpActionplanDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryQmpActionplanDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 流量风控查询外呼策略详情
     * Summary: 流量风控查询外呼策略详情.
     *
     * @param BatchqueryQmpActionplanDetailRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchqueryQmpActionplanDetailResponse
     */
    public function batchqueryQmpActionplanDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryQmpActionplanDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.actionplan.detail.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用流量风控(原营销盾)空号检测
     * Summary: 调用流量风控(原营销盾)空号检测.
     *
     * @param ApplyQmpPhonenumberstatusforsmsRequest $request
     *
     * @return ApplyQmpPhonenumberstatusforsmsResponse
     */
    public function applyQmpPhonenumberstatusforsms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyQmpPhonenumberstatusforsmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用流量风控(原营销盾)空号检测
     * Summary: 调用流量风控(原营销盾)空号检测.
     *
     * @param ApplyQmpPhonenumberstatusforsmsRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return ApplyQmpPhonenumberstatusforsmsResponse
     */
    public function applyQmpPhonenumberstatusforsmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyQmpPhonenumberstatusforsmsResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.phonenumberstatusforsms.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询租户外呼策略
     * Summary: 流量风控租户场景批量信息查询.
     *
     * @param BatchqueryQmpTenantActionplaninfoRequest $request
     *
     * @return BatchqueryQmpTenantActionplaninfoResponse
     */
    public function batchqueryQmpTenantActionplaninfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryQmpTenantActionplaninfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询租户外呼策略
     * Summary: 流量风控租户场景批量信息查询.
     *
     * @param BatchqueryQmpTenantActionplaninfoRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return BatchqueryQmpTenantActionplaninfoResponse
     */
    public function batchqueryQmpTenantActionplaninfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryQmpTenantActionplaninfoResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.tenant.actionplaninfo.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流量风控租户场景信息查询
     * Summary: 流量风控租户场景信息查询.
     *
     * @param QueryQmpTenantActionplaninfoRequest $request
     *
     * @return QueryQmpTenantActionplaninfoResponse
     */
    public function queryQmpTenantActionplaninfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQmpTenantActionplaninfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 流量风控租户场景信息查询
     * Summary: 流量风控租户场景信息查询.
     *
     * @param QueryQmpTenantActionplaninfoRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryQmpTenantActionplaninfoResponse
     */
    public function queryQmpTenantActionplaninfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQmpTenantActionplaninfoResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.tenant.actionplaninfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询cpaas短信模板
     * Summary: cpaas短信模板分页查询.
     *
     * @param QueryQmpCpaassmsTemplateRequest $request
     *
     * @return QueryQmpCpaassmsTemplateResponse
     */
    public function queryQmpCpaassmsTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQmpCpaassmsTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询cpaas短信模板
     * Summary: cpaas短信模板分页查询.
     *
     * @param QueryQmpCpaassmsTemplateRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryQmpCpaassmsTemplateResponse
     */
    public function queryQmpCpaassmsTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQmpCpaassmsTemplateResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.cpaassms.template.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据sceneStrategyId分页查询文本短信模板
     * Summary: 文本短信模板查询.
     *
     * @param QueryQmpTextsmsTemplateRequest $request
     *
     * @return QueryQmpTextsmsTemplateResponse
     */
    public function queryQmpTextsmsTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQmpTextsmsTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据sceneStrategyId分页查询文本短信模板
     * Summary: 文本短信模板查询.
     *
     * @param QueryQmpTextsmsTemplateRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryQmpTextsmsTemplateResponse
     */
    public function queryQmpTextsmsTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQmpTextsmsTemplateResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.textsms.template.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚁盾业务回流事件推送
     * Summary: 蚁盾业务回流事件推送
     *
     * @param PushQmpBackflowEventRequest $request
     *
     * @return PushQmpBackflowEventResponse
     */
    public function pushQmpBackflowEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushQmpBackflowEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚁盾业务回流事件推送
     * Summary: 蚁盾业务回流事件推送
     *
     * @param PushQmpBackflowEventRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PushQmpBackflowEventResponse
     */
    public function pushQmpBackflowEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushQmpBackflowEventResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.backflow.event.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚁盾数据回流推送，用于客户定制json数据
     * Summary: 蚁盾数据回流json格式推送
     *
     * @param PushQmpBackflowJsondataRequest $request
     *
     * @return PushQmpBackflowJsondataResponse
     */
    public function pushQmpBackflowJsondata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushQmpBackflowJsondataEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚁盾数据回流推送，用于客户定制json数据
     * Summary: 蚁盾数据回流json格式推送
     *
     * @param PushQmpBackflowJsondataRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return PushQmpBackflowJsondataResponse
     */
    public function pushQmpBackflowJsondataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushQmpBackflowJsondataResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.backflow.jsondata.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智选平台混合策略批量分层服务
     * Summary: 智选平台-混合策略批量分层服务
     *
     * @param BatchqueryQmpRtMixedmarketingRequest $request
     *
     * @return BatchqueryQmpRtMixedmarketingResponse
     */
    public function batchqueryQmpRtMixedmarketing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryQmpRtMixedmarketingEx($request, $headers, $runtime);
    }

    /**
     * Description: 智选平台混合策略批量分层服务
     * Summary: 智选平台-混合策略批量分层服务
     *
     * @param BatchqueryQmpRtMixedmarketingRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchqueryQmpRtMixedmarketingResponse
     */
    public function batchqueryQmpRtMixedmarketingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryQmpRtMixedmarketingResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.rt.mixedmarketing.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 11
     * Summary: qmp离线托管文件导入.
     *
     * @param UploadQmpOfflinehostplanRequest $request
     *
     * @return UploadQmpOfflinehostplanResponse
     */
    public function uploadQmpOfflinehostplan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadQmpOfflinehostplanEx($request, $headers, $runtime);
    }

    /**
     * Description: 11
     * Summary: qmp离线托管文件导入.
     *
     * @param UploadQmpOfflinehostplanRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UploadQmpOfflinehostplanResponse
     */
    public function uploadQmpOfflinehostplanEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.qmp.offlinehostplan.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadQmpOfflinehostplanResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadQmpOfflinehostplanResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.offlinehostplan.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 安全托管分层结果查询接口
     * Summary: 安全托管分层结果查询接口.
     *
     * @param QueryQmpOfflinehostplanDecisionresultRequest $request
     *
     * @return QueryQmpOfflinehostplanDecisionresultResponse
     */
    public function queryQmpOfflinehostplanDecisionresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryQmpOfflinehostplanDecisionresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 安全托管分层结果查询接口
     * Summary: 安全托管分层结果查询接口.
     *
     * @param QueryQmpOfflinehostplanDecisionresultRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryQmpOfflinehostplanDecisionresultResponse
     */
    public function queryQmpOfflinehostplanDecisionresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryQmpOfflinehostplanDecisionresultResponse::fromMap($this->doRequest('1.0', 'riskplus.qmp.offlinehostplan.decisionresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企管盾票税交接授权信息表的同步
     * Summary: 企管盾票税交接授权信息表的同步.
     *
     * @param SyncRdaasTaxAuthinfoRequest $request
     *
     * @return SyncRdaasTaxAuthinfoResponse
     */
    public function syncRdaasTaxAuthinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncRdaasTaxAuthinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 企管盾票税交接授权信息表的同步
     * Summary: 企管盾票税交接授权信息表的同步.
     *
     * @param SyncRdaasTaxAuthinfoRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SyncRdaasTaxAuthinfoResponse
     */
    public function syncRdaasTaxAuthinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncRdaasTaxAuthinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.rdaas.tax.authinfo.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企管盾票税交接授权记录表的同步
     * Summary: 企管盾票税交接授权记录表的同步.
     *
     * @param SyncRdaasTaxAuthorderRequest $request
     *
     * @return SyncRdaasTaxAuthorderResponse
     */
    public function syncRdaasTaxAuthorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncRdaasTaxAuthorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 企管盾票税交接授权记录表的同步
     * Summary: 企管盾票税交接授权记录表的同步.
     *
     * @param SyncRdaasTaxAuthorderRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SyncRdaasTaxAuthorderResponse
     */
    public function syncRdaasTaxAuthorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncRdaasTaxAuthorderResponse::fromMap($this->doRequest('1.0', 'riskplus.rdaas.tax.authorder.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企管盾票税交接回调通知
     * Summary: 企管盾票税交接回调通知.
     *
     * @param NotifyRdaasTaxCallbackRequest $request
     *
     * @return NotifyRdaasTaxCallbackResponse
     */
    public function notifyRdaasTaxCallback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyRdaasTaxCallbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 企管盾票税交接回调通知
     * Summary: 企管盾票税交接回调通知.
     *
     * @param NotifyRdaasTaxCallbackRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return NotifyRdaasTaxCallbackResponse
     */
    public function notifyRdaasTaxCallbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyRdaasTaxCallbackResponse::fromMap($this->doRequest('1.0', 'riskplus.rdaas.tax.callback.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企管盾票税交接RPA决策服务查询
     * Summary: 企管盾票税交接RPA决策服务查询.
     *
     * @param QueryRdaasTaxRpadecisionserviceRequest $request
     *
     * @return QueryRdaasTaxRpadecisionserviceResponse
     */
    public function queryRdaasTaxRpadecisionservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRdaasTaxRpadecisionserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 企管盾票税交接RPA决策服务查询
     * Summary: 企管盾票税交接RPA决策服务查询.
     *
     * @param QueryRdaasTaxRpadecisionserviceRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryRdaasTaxRpadecisionserviceResponse
     */
    public function queryRdaasTaxRpadecisionserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRdaasTaxRpadecisionserviceResponse::fromMap($this->doRequest('1.0', 'riskplus.rdaas.tax.rpadecisionservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企管盾票税交接RPA决策服务指标查询
     * Summary: 企管盾票税交接RPA决策服务指标查询.
     *
     * @param QueryRdaasTaxRpadecisionindicatorRequest $request
     *
     * @return QueryRdaasTaxRpadecisionindicatorResponse
     */
    public function queryRdaasTaxRpadecisionindicator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRdaasTaxRpadecisionindicatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 企管盾票税交接RPA决策服务指标查询
     * Summary: 企管盾票税交接RPA决策服务指标查询.
     *
     * @param QueryRdaasTaxRpadecisionindicatorRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryRdaasTaxRpadecisionindicatorResponse
     */
    public function queryRdaasTaxRpadecisionindicatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRdaasTaxRpadecisionindicatorResponse::fromMap($this->doRequest('1.0', 'riskplus.rdaas.tax.rpadecisionindicator.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企管盾票税交接要素授权决策查询
     * Summary: 企管盾票税交接要素授权决策查询.
     *
     * @param QueryRdaasTaxSimpleauthdecisionRequest $request
     *
     * @return QueryRdaasTaxSimpleauthdecisionResponse
     */
    public function queryRdaasTaxSimpleauthdecision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRdaasTaxSimpleauthdecisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 企管盾票税交接要素授权决策查询
     * Summary: 企管盾票税交接要素授权决策查询.
     *
     * @param QueryRdaasTaxSimpleauthdecisionRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryRdaasTaxSimpleauthdecisionResponse
     */
    public function queryRdaasTaxSimpleauthdecisionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRdaasTaxSimpleauthdecisionResponse::fromMap($this->doRequest('1.0', 'riskplus.rdaas.tax.simpleauthdecision.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: rfc外部文件上传
     * Summary: rfc外部文件上传.
     *
     * @param ReceiveRfcParamsFileRequest $request
     *
     * @return ReceiveRfcParamsFileResponse
     */
    public function receiveRfcParamsFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->receiveRfcParamsFileEx($request, $headers, $runtime);
    }

    /**
     * Description: rfc外部文件上传
     * Summary: rfc外部文件上传.
     *
     * @param ReceiveRfcParamsFileRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ReceiveRfcParamsFileResponse
     */
    public function receiveRfcParamsFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.rfc.params.file.receive',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ReceiveRfcParamsFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return ReceiveRfcParamsFileResponse::fromMap($this->doRequest('1.0', 'riskplus.rfc.params.file.receive', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: rfc外呼名单文件上传接口
     * Summary: rfc外呼名单上传接口.
     *
     * @param UploadRfcAiboundFileRequest $request
     *
     * @return UploadRfcAiboundFileResponse
     */
    public function uploadRfcAiboundFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadRfcAiboundFileEx($request, $headers, $runtime);
    }

    /**
     * Description: rfc外呼名单文件上传接口
     * Summary: rfc外呼名单上传接口.
     *
     * @param UploadRfcAiboundFileRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UploadRfcAiboundFileResponse
     */
    public function uploadRfcAiboundFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.rfc.aibound.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadRfcAiboundFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadRfcAiboundFileResponse::fromMap($this->doRequest('1.0', 'riskplus.rfc.aibound.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供给外部的数据服务接口内容获取
     * Summary: 提供给外部的数据服务接口内容获取.
     *
     * @param QueryRfcOdpsLindormRequest $request
     *
     * @return QueryRfcOdpsLindormResponse
     */
    public function queryRfcOdpsLindorm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRfcOdpsLindormEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给外部的数据服务接口内容获取
     * Summary: 提供给外部的数据服务接口内容获取.
     *
     * @param QueryRfcOdpsLindormRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryRfcOdpsLindormResponse
     */
    public function queryRfcOdpsLindormEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRfcOdpsLindormResponse::fromMap($this->doRequest('1.0', 'riskplus.rfc.odps.lindorm.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】.
     *
     * @param QueryRbbGenericInvokeRequest $request
     *
     * @return QueryRbbGenericInvokeResponse
     */
    public function queryRbbGenericInvoke($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRbbGenericInvokeEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】.
     *
     * @param QueryRbbGenericInvokeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRbbGenericInvokeResponse
     */
    public function queryRbbGenericInvokeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRbbGenericInvokeResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.generic.invoke.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】.
     *
     * @param CreateRbbTokenRequest $request
     *
     * @return CreateRbbTokenResponse
     */
    public function createRbbToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRbbTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】.
     *
     * @param CreateRbbTokenRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateRbbTokenResponse
     */
    public function createRbbTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRbbTokenResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.token.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】.
     *
     * @param CreateRbbApiGwtokenRequest $request
     *
     * @return CreateRbbApiGwtokenResponse
     */
    public function createRbbApiGwtoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRbbApiGwtokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】.
     *
     * @param CreateRbbApiGwtokenRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateRbbApiGwtokenResponse
     */
    public function createRbbApiGwtokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRbbApiGwtokenResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.api.gwtoken.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI.
     *
     * @param QueryRbbGeneralRequest $request
     *
     * @return QueryRbbGeneralResponse
     */
    public function queryRbbGeneral($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRbbGeneralEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI.
     *
     * @param QueryRbbGeneralRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryRbbGeneralResponse
     */
    public function queryRbbGeneralEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRbbGeneralResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.general.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token.
     *
     * @param GetRbbLoginTokenRequest $request
     *
     * @return GetRbbLoginTokenResponse
     */
    public function getRbbLoginToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRbbLoginTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token.
     *
     * @param GetRbbLoginTokenRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetRbbLoginTokenResponse
     */
    public function getRbbLoginTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRbbLoginTokenResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.login.token.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户.
     *
     * @param CreateRbbTenantRequest $request
     *
     * @return CreateRbbTenantResponse
     */
    public function createRbbTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRbbTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户.
     *
     * @param CreateRbbTenantRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateRbbTenantResponse
     */
    public function createRbbTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRbbTenantResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.tenant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户.
     *
     * @param CreateRbbUserRequest $request
     *
     * @return CreateRbbUserResponse
     */
    public function createRbbUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRbbUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户.
     *
     * @param CreateRbbUserRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateRbbUserResponse
     */
    public function createRbbUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRbbUserResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.user.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业准入接口
     * Summary: 企业准入.
     *
     * @param ExecRbbCompanyGuardRequest $request
     *
     * @return ExecRbbCompanyGuardResponse
     */
    public function execRbbCompanyGuard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execRbbCompanyGuardEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业准入接口
     * Summary: 企业准入.
     *
     * @param ExecRbbCompanyGuardRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecRbbCompanyGuardResponse
     */
    public function execRbbCompanyGuardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecRbbCompanyGuardResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.company.guard.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交授信申请
     * Summary: 企业授信申请.
     *
     * @param ApplyRbbCompanyCreditRequest $request
     *
     * @return ApplyRbbCompanyCreditResponse
     */
    public function applyRbbCompanyCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyRbbCompanyCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交授信申请
     * Summary: 企业授信申请.
     *
     * @param ApplyRbbCompanyCreditRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ApplyRbbCompanyCreditResponse
     */
    public function applyRbbCompanyCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyRbbCompanyCreditResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.company.credit.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业授信结果
     * Summary: 企业授信结果查询.
     *
     * @param QueryRbbCompanyCreditRequest $request
     *
     * @return QueryRbbCompanyCreditResponse
     */
    public function queryRbbCompanyCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRbbCompanyCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业授信结果
     * Summary: 企业授信结果查询.
     *
     * @param QueryRbbCompanyCreditRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRbbCompanyCreditResponse
     */
    public function queryRbbCompanyCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRbbCompanyCreditResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.company.credit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
     * Summary: 风险大脑-上交所数据离线同步数据准备状态
     *
     * @param QueryRbbRegdatasyncPreparedRequest $request
     *
     * @return QueryRbbRegdatasyncPreparedResponse
     */
    public function queryRbbRegdatasyncPrepared($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRbbRegdatasyncPreparedEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
     * Summary: 风险大脑-上交所数据离线同步数据准备状态
     *
     * @param QueryRbbRegdatasyncPreparedRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryRbbRegdatasyncPreparedResponse
     */
    public function queryRbbRegdatasyncPreparedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRbbRegdatasyncPreparedResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.regdatasync.prepared.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据开始通知标识
     * Summary: 风险大脑-上交所数据离线同步数据开始通知.
     *
     * @param StartRbbRegdatasyncScheduleRequest $request
     *
     * @return StartRbbRegdatasyncScheduleResponse
     */
    public function startRbbRegdatasyncSchedule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startRbbRegdatasyncScheduleEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据开始通知标识
     * Summary: 风险大脑-上交所数据离线同步数据开始通知.
     *
     * @param StartRbbRegdatasyncScheduleRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return StartRbbRegdatasyncScheduleResponse
     */
    public function startRbbRegdatasyncScheduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartRbbRegdatasyncScheduleResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.regdatasync.schedule.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
     * Summary: 风险大脑-上交所数据离线同步数据完成记录.
     *
     * @param FinishRbbRegdatasyncScheduleRequest $request
     *
     * @return FinishRbbRegdatasyncScheduleResponse
     */
    public function finishRbbRegdatasyncSchedule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishRbbRegdatasyncScheduleEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
     * Summary: 风险大脑-上交所数据离线同步数据完成记录.
     *
     * @param FinishRbbRegdatasyncScheduleRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return FinishRbbRegdatasyncScheduleResponse
     */
    public function finishRbbRegdatasyncScheduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishRbbRegdatasyncScheduleResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.regdatasync.schedule.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交准入规则的执行请求
     * Summary: 企业准入申请.
     *
     * @param ApplyRbbCompanyGuardRequest $request
     *
     * @return ApplyRbbCompanyGuardResponse
     */
    public function applyRbbCompanyGuard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyRbbCompanyGuardEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交准入规则的执行请求
     * Summary: 企业准入申请.
     *
     * @param ApplyRbbCompanyGuardRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ApplyRbbCompanyGuardResponse
     */
    public function applyRbbCompanyGuardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyRbbCompanyGuardResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.company.guard.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业准入结果查询
     * Summary: 企业准入结果查询.
     *
     * @param QueryRbbCompanyGuardRequest $request
     *
     * @return QueryRbbCompanyGuardResponse
     */
    public function queryRbbCompanyGuard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRbbCompanyGuardEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业准入结果查询
     * Summary: 企业准入结果查询.
     *
     * @param QueryRbbCompanyGuardRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRbbCompanyGuardResponse
     */
    public function queryRbbCompanyGuardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRbbCompanyGuardResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.company.guard.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业风控给上交所鹰眼使用的zsearch查询
     * Summary: 企业风控给鹰眼使用的zsearch查询.
     *
     * @param QueryRbbObtsZsearchRequest $request
     *
     * @return QueryRbbObtsZsearchResponse
     */
    public function queryRbbObtsZsearch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRbbObtsZsearchEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业风控给上交所鹰眼使用的zsearch查询
     * Summary: 企业风控给鹰眼使用的zsearch查询.
     *
     * @param QueryRbbObtsZsearchRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryRbbObtsZsearchResponse
     */
    public function queryRbbObtsZsearchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRbbObtsZsearchResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.obts.zsearch.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业风控客户推送的企业信息
     * Summary: 企业风控客户推送的企业信息.
     *
     * @param PushRbbCustomerCompanyinfoRequest $request
     *
     * @return PushRbbCustomerCompanyinfoResponse
     */
    public function pushRbbCustomerCompanyinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRbbCustomerCompanyinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业风控客户推送的企业信息
     * Summary: 企业风控客户推送的企业信息.
     *
     * @param PushRbbCustomerCompanyinfoRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PushRbbCustomerCompanyinfoResponse
     */
    public function pushRbbCustomerCompanyinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRbbCustomerCompanyinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.customer.companyinfo.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企管盾给高德的文件上传，用于小微店铺分
     * Summary: 企管盾给高德的文件上传，用于小微店铺分.
     *
     * @param UploadRbbFileAmapRequest $request
     *
     * @return UploadRbbFileAmapResponse
     */
    public function uploadRbbFileAmap($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadRbbFileAmapEx($request, $headers, $runtime);
    }

    /**
     * Description: 企管盾给高德的文件上传，用于小微店铺分
     * Summary: 企管盾给高德的文件上传，用于小微店铺分.
     *
     * @param UploadRbbFileAmapRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UploadRbbFileAmapResponse
     */
    public function uploadRbbFileAmapEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.rbb.file.amap.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadRbbFileAmapResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadRbbFileAmapResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.file.amap.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信贷操作接口
     * Summary: 信贷操作接口.
     *
     * @param OperateRbbCreditRequest $request
     *
     * @return OperateRbbCreditResponse
     */
    public function operateRbbCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateRbbCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 信贷操作接口
     * Summary: 信贷操作接口.
     *
     * @param OperateRbbCreditRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return OperateRbbCreditResponse
     */
    public function operateRbbCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateRbbCreditResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.credit.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取客户信息
     * Summary: 获取客户信息.
     *
     * @param PushRbbCustomerInformationRequest $request
     *
     * @return PushRbbCustomerInformationResponse
     */
    public function pushRbbCustomerInformation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRbbCustomerInformationEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取客户信息
     * Summary: 获取客户信息.
     *
     * @param PushRbbCustomerInformationRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PushRbbCustomerInformationResponse
     */
    public function pushRbbCustomerInformationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRbbCustomerInformationResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.customer.information.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取税票授权数据
     * Summary: 获取税票授权数据.
     *
     * @param GetRbbTaxinvoiceDataRequest $request
     *
     * @return GetRbbTaxinvoiceDataResponse
     */
    public function getRbbTaxinvoiceData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRbbTaxinvoiceDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取税票授权数据
     * Summary: 获取税票授权数据.
     *
     * @param GetRbbTaxinvoiceDataRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetRbbTaxinvoiceDataResponse
     */
    public function getRbbTaxinvoiceDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRbbTaxinvoiceDataResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.taxinvoice.data.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户实时状态通知
     * Summary: 客户实时状态通知.
     *
     * @param PushRbbCustomerStatusRequest $request
     *
     * @return PushRbbCustomerStatusResponse
     */
    public function pushRbbCustomerStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRbbCustomerStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户实时状态通知
     * Summary: 客户实时状态通知.
     *
     * @param PushRbbCustomerStatusRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PushRbbCustomerStatusResponse
     */
    public function pushRbbCustomerStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRbbCustomerStatusResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.customer.status.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 票税计费处理推送，由票税侧请求
     * Summary: 票税计费处理推送
     *
     * @param PushRbbInvoiceChargeRequest $request
     *
     * @return PushRbbInvoiceChargeResponse
     */
    public function pushRbbInvoiceCharge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRbbInvoiceChargeEx($request, $headers, $runtime);
    }

    /**
     * Description: 票税计费处理推送，由票税侧请求
     * Summary: 票税计费处理推送
     *
     * @param PushRbbInvoiceChargeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PushRbbInvoiceChargeResponse
     */
    public function pushRbbInvoiceChargeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRbbInvoiceChargeResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.invoice.charge.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过接口进行报告上传
     * Summary: 征信报告上传接口.
     *
     * @param ReceiveRbbParamsFileRequest $request
     *
     * @return ReceiveRbbParamsFileResponse
     */
    public function receiveRbbParamsFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->receiveRbbParamsFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过接口进行报告上传
     * Summary: 征信报告上传接口.
     *
     * @param ReceiveRbbParamsFileRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ReceiveRbbParamsFileResponse
     */
    public function receiveRbbParamsFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.rbb.params.file.receive',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ReceiveRbbParamsFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return ReceiveRbbParamsFileResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.params.file.receive', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 境外企业画像数据接收
     * Summary: 境外企业画像数据接收.
     *
     * @param ReceiveRbbOverseacompanyProfileRequest $request
     *
     * @return ReceiveRbbOverseacompanyProfileResponse
     */
    public function receiveRbbOverseacompanyProfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->receiveRbbOverseacompanyProfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 境外企业画像数据接收
     * Summary: 境外企业画像数据接收.
     *
     * @param ReceiveRbbOverseacompanyProfileRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return ReceiveRbbOverseacompanyProfileResponse
     */
    public function receiveRbbOverseacompanyProfileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.rbb.overseacompany.profile.receive',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new ReceiveRbbOverseacompanyProfileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return ReceiveRbbOverseacompanyProfileResponse::fromMap($this->doRequest('1.0', 'riskplus.rbb.overseacompany.profile.receive', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 报告结果推送，算法调用
     * Summary: 报告结果推送
     *
     * @param PushRpaasReportAnswerRequest $request
     *
     * @return PushRpaasReportAnswerResponse
     */
    public function pushRpaasReportAnswer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRpaasReportAnswerEx($request, $headers, $runtime);
    }

    /**
     * Description: 报告结果推送，算法调用
     * Summary: 报告结果推送
     *
     * @param PushRpaasReportAnswerRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PushRpaasReportAnswerResponse
     */
    public function pushRpaasReportAnswerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRpaasReportAnswerResponse::fromMap($this->doRequest('1.0', 'riskplus.rpaas.report.answer.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企管盾云开放平台服务调用
     * Summary: 企管盾云开放平台服务调用.
     *
     * @param QueryRpaasOpenServiceRequest $request
     *
     * @return QueryRpaasOpenServiceResponse
     */
    public function queryRpaasOpenService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRpaasOpenServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 企管盾云开放平台服务调用
     * Summary: 企管盾云开放平台服务调用.
     *
     * @param QueryRpaasOpenServiceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRpaasOpenServiceResponse
     */
    public function queryRpaasOpenServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRpaasOpenServiceResponse::fromMap($this->doRequest('1.0', 'riskplus.rpaas.open.service.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取签约接口
     * Summary: 获取签约接口.
     *
     * @param QueryRpgwSignUrlRequest $request
     *
     * @return QueryRpgwSignUrlResponse
     */
    public function queryRpgwSignUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRpgwSignUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取签约接口
     * Summary: 获取签约接口.
     *
     * @param QueryRpgwSignUrlRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryRpgwSignUrlResponse
     */
    public function queryRpgwSignUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRpgwSignUrlResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.sign.url.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建报税用户接口
     * Summary: 创建报税用户接口.
     *
     * @param RegisterRpgwUserEinvoiceRequest $request
     *
     * @return RegisterRpgwUserEinvoiceResponse
     */
    public function registerRpgwUserEinvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerRpgwUserEinvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建报税用户接口
     * Summary: 创建报税用户接口.
     *
     * @param RegisterRpgwUserEinvoiceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return RegisterRpgwUserEinvoiceResponse
     */
    public function registerRpgwUserEinvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterRpgwUserEinvoiceResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.einvoice.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询签约接口
     * Summary: 获取签约接口.
     *
     * @param QueryRpgwUserSignurlRequest $request
     *
     * @return QueryRpgwUserSignurlResponse
     */
    public function queryRpgwUserSignurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRpgwUserSignurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询签约接口
     * Summary: 获取签约接口.
     *
     * @param QueryRpgwUserSignurlRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRpgwUserSignurlResponse
     */
    public function queryRpgwUserSignurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRpgwUserSignurlResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.signurl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提现
     * Summary: 提现.
     *
     * @param WithdrawRpgwUserCommissionRequest $request
     *
     * @return WithdrawRpgwUserCommissionResponse
     */
    public function withdrawRpgwUserCommission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->withdrawRpgwUserCommissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 提现
     * Summary: 提现.
     *
     * @param WithdrawRpgwUserCommissionRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return WithdrawRpgwUserCommissionResponse
     */
    public function withdrawRpgwUserCommissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return WithdrawRpgwUserCommissionResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.commission.withdraw', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信息同步
     * Summary: 下单等信息同步.
     *
     * @param SyncRpgwUserOrderinfoRequest $request
     *
     * @return SyncRpgwUserOrderinfoResponse
     */
    public function syncRpgwUserOrderinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncRpgwUserOrderinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 信息同步
     * Summary: 下单等信息同步.
     *
     * @param SyncRpgwUserOrderinfoRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SyncRpgwUserOrderinfoResponse
     */
    public function syncRpgwUserOrderinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncRpgwUserOrderinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.orderinfo.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 签约结果通知
     * Summary: 签约结果通知.
     *
     * @param NotifyRpgwUserSignresultRequest $request
     *
     * @return NotifyRpgwUserSignresultResponse
     */
    public function notifyRpgwUserSignresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyRpgwUserSignresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 签约结果通知
     * Summary: 签约结果通知.
     *
     * @param NotifyRpgwUserSignresultRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return NotifyRpgwUserSignresultResponse
     */
    public function notifyRpgwUserSignresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyRpgwUserSignresultResponse::fromMap($this->doRequest('1.0', 'riskplus.rpgw.user.signresult.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表.
     *
     * @param QueryRtopCompanyOpinionRequest $request
     *
     * @return QueryRtopCompanyOpinionResponse
     */
    public function queryRtopCompanyOpinion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyOpinionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表.
     *
     * @param QueryRtopCompanyOpinionRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryRtopCompanyOpinionResponse
     */
    public function queryRtopCompanyOpinionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyOpinionResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.opinion.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息.
     *
     * @param ListRtopCompanyOpinionsRequest $request
     *
     * @return ListRtopCompanyOpinionsResponse
     */
    public function listRtopCompanyOpinions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRtopCompanyOpinionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息.
     *
     * @param ListRtopCompanyOpinionsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListRtopCompanyOpinionsResponse
     */
    public function listRtopCompanyOpinionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRtopCompanyOpinionsResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.opinions.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情.
     *
     * @param GetRtopCompanyMonitorRequest $request
     *
     * @return GetRtopCompanyMonitorResponse
     */
    public function getRtopCompanyMonitor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRtopCompanyMonitorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情.
     *
     * @param GetRtopCompanyMonitorRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetRtopCompanyMonitorResponse
     */
    public function getRtopCompanyMonitorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRtopCompanyMonitorResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.monitor.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息.
     *
     * @param QueryRtopCrowdriskStatisticRequest $request
     *
     * @return QueryRtopCrowdriskStatisticResponse
     */
    public function queryRtopCrowdriskStatistic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCrowdriskStatisticEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息.
     *
     * @param QueryRtopCrowdriskStatisticRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryRtopCrowdriskStatisticResponse
     */
    public function queryRtopCrowdriskStatisticEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCrowdriskStatisticResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.crowdrisk.statistic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表.
     *
     * @param ListRtopCrowdriskRequest $request
     *
     * @return ListRtopCrowdriskResponse
     */
    public function listRtopCrowdrisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRtopCrowdriskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表.
     *
     * @param ListRtopCrowdriskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListRtopCrowdriskResponse
     */
    public function listRtopCrowdriskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRtopCrowdriskResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.crowdrisk.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息.
     *
     * @param QueryRtopCrowdriskDetailRequest $request
     *
     * @return QueryRtopCrowdriskDetailResponse
     */
    public function queryRtopCrowdriskDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCrowdriskDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息.
     *
     * @param QueryRtopCrowdriskDetailRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopCrowdriskDetailResponse
     */
    public function queryRtopCrowdriskDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCrowdriskDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.crowdrisk.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息.
     *
     * @param QueryRtopRiskstormRequest $request
     *
     * @return QueryRtopRiskstormResponse
     */
    public function queryRtopRiskstorm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopRiskstormEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息.
     *
     * @param QueryRtopRiskstormRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryRtopRiskstormResponse
     */
    public function queryRtopRiskstormEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopRiskstormResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.riskstorm.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额.
     *
     * @param QueryRtopCrowdriskSumRequest $request
     *
     * @return QueryRtopCrowdriskSumResponse
     */
    public function queryRtopCrowdriskSum($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCrowdriskSumEx($request, $headers, $runtime);
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额.
     *
     * @param QueryRtopCrowdriskSumRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRtopCrowdriskSumResponse
     */
    public function queryRtopCrowdriskSumEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCrowdriskSumResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.crowdrisk.sum.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取.
     *
     * @param GetRtopCompanyDetailRequest $request
     *
     * @return GetRtopCompanyDetailResponse
     */
    public function getRtopCompanyDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRtopCompanyDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取.
     *
     * @param GetRtopCompanyDetailRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetRtopCompanyDetailResponse
     */
    public function getRtopCompanyDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRtopCompanyDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.detail.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口.
     *
     * @param QueryRtopCompanyRiskinfoRequest $request
     *
     * @return QueryRtopCompanyRiskinfoResponse
     */
    public function queryRtopCompanyRiskinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyRiskinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口.
     *
     * @param QueryRtopCompanyRiskinfoRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopCompanyRiskinfoResponse
     */
    public function queryRtopCompanyRiskinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyRiskinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.riskinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口.
     *
     * @param ExecRtopGenericInvokeRequest $request
     *
     * @return ExecRtopGenericInvokeResponse
     */
    public function execRtopGenericInvoke($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execRtopGenericInvokeEx($request, $headers, $runtime);
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口.
     *
     * @param ExecRtopGenericInvokeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ExecRtopGenericInvokeResponse
     */
    public function execRtopGenericInvokeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecRtopGenericInvokeResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.generic.invoke.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token.
     *
     * @param CreateRtopTokenRequest $request
     *
     * @return CreateRtopTokenResponse
     */
    public function createRtopToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRtopTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token.
     *
     * @param CreateRtopTokenRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateRtopTokenResponse
     */
    public function createRtopTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRtopTokenResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.token.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取.
     *
     * @param QueryRtopRisklabelRequest $request
     *
     * @return QueryRtopRisklabelResponse
     */
    public function queryRtopRisklabel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopRisklabelEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取.
     *
     * @param QueryRtopRisklabelRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryRtopRisklabelResponse
     */
    public function queryRtopRisklabelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopRisklabelResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.risklabel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取.
     *
     * @param QueryRtopCompanyRequest $request
     *
     * @return QueryRtopCompanyResponse
     */
    public function queryRtopCompany($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取.
     *
     * @param QueryRtopCompanyRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryRtopCompanyResponse
     */
    public function queryRtopCompanyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签配置全量信息获取
     * rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取.
     *
     * @param QueryRtopRisklabelFilterRequest $request
     *
     * @return QueryRtopRisklabelFilterResponse
     */
    public function queryRtopRisklabelFilter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopRisklabelFilterEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签配置全量信息获取
     * rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取.
     *
     * @param QueryRtopRisklabelFilterRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopRisklabelFilterResponse
     */
    public function queryRtopRisklabelFilterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopRisklabelFilterResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.risklabel.filter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步.
     *
     * @param PullRegtechNewsRequest $request
     *
     * @return PullRegtechNewsResponse
     */
    public function pullRegtechNews($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullRegtechNewsEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步.
     *
     * @param PullRegtechNewsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return PullRegtechNewsResponse
     */
    public function pullRegtechNewsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullRegtechNewsResponse::fromMap($this->doRequest('1.0', 'riskplus.regtech.news.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈.
     *
     * @param QueryRtopCompanyFeedbackRequest $request
     *
     * @return QueryRtopCompanyFeedbackResponse
     */
    public function queryRtopCompanyFeedback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyFeedbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈.
     *
     * @param QueryRtopCompanyFeedbackRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopCompanyFeedbackResponse
     */
    public function queryRtopCompanyFeedbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyFeedbackResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.feedback.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询.
     *
     * @param QueryRtopCompanyAlarmRequest $request
     *
     * @return QueryRtopCompanyAlarmResponse
     */
    public function queryRtopCompanyAlarm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyAlarmEx($request, $headers, $runtime);
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询.
     *
     * @param QueryRtopCompanyAlarmRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRtopCompanyAlarmResponse
     */
    public function queryRtopCompanyAlarmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyAlarmResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.alarm.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表.
     *
     * @param QueryRtopCompanyRiskyRequest $request
     *
     * @return QueryRtopCompanyRiskyResponse
     */
    public function queryRtopCompanyRisky($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyRiskyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表.
     *
     * @param QueryRtopCompanyRiskyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRtopCompanyRiskyResponse
     */
    public function queryRtopCompanyRiskyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyRiskyResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.risky.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表.
     *
     * @param QueryRtopCompanyListRequest $request
     *
     * @return QueryRtopCompanyListResponse
     */
    public function queryRtopCompanyList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyListEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表.
     *
     * @param QueryRtopCompanyListRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRtopCompanyListResponse
     */
    public function queryRtopCompanyListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyListResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.list.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取.
     *
     * @param QueryRtopRisklabelConfigRequest $request
     *
     * @return QueryRtopRisklabelConfigResponse
     */
    public function queryRtopRisklabelConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopRisklabelConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取.
     *
     * @param QueryRtopRisklabelConfigRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRtopRisklabelConfigResponse
     */
    public function queryRtopRisklabelConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopRisklabelConfigResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.risklabel.config.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询.
     *
     * @param QueryRtopCompanyRiskRequest $request
     *
     * @return QueryRtopCompanyRiskResponse
     */
    public function queryRtopCompanyRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopCompanyRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询.
     *
     * @param QueryRtopCompanyRiskRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRtopCompanyRiskResponse
     */
    public function queryRtopCompanyRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopCompanyRiskResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业.
     *
     * @param ListRtopCompanyRelatedRequest $request
     *
     * @return ListRtopCompanyRelatedResponse
     */
    public function listRtopCompanyRelated($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRtopCompanyRelatedEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业.
     *
     * @param ListRtopCompanyRelatedRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListRtopCompanyRelatedResponse
     */
    public function listRtopCompanyRelatedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRtopCompanyRelatedResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.company.related.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询.
     *
     * @param QueryRtopTagImageRequest $request
     *
     * @return QueryRtopTagImageResponse
     */
    public function queryRtopTagImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRtopTagImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询.
     *
     * @param QueryRtopTagImageRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryRtopTagImageResponse
     */
    public function queryRtopTagImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRtopTagImageResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.tag.image.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表.
     *
     * @param ListRtopStarCompanyRequest $request
     *
     * @return ListRtopStarCompanyResponse
     */
    public function listRtopStarCompany($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRtopStarCompanyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表.
     *
     * @param ListRtopStarCompanyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListRtopStarCompanyResponse
     */
    public function listRtopStarCompanyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRtopStarCompanyResponse::fromMap($this->doRequest('1.0', 'riskplus.rtop.star.company.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas).
     *
     * @param QueryRpSecurityPolicyRequest $request
     *
     * @return QueryRpSecurityPolicyResponse
     */
    public function queryRpSecurityPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRpSecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas).
     *
     * @param QueryRpSecurityPolicyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRpSecurityPolicyResponse
     */
    public function queryRpSecurityPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRpSecurityPolicyResponse::fromMap($this->doRequest('1.0', 'riskplus.rp.security.policy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风控快照查询
     * Summary: 风控事件快照查询.
     *
     * @param QuerySnapshotEventRequest $request
     *
     * @return QuerySnapshotEventResponse
     */
    public function querySnapshotEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySnapshotEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 风控快照查询
     * Summary: 风控事件快照查询.
     *
     * @param QuerySnapshotEventRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QuerySnapshotEventResponse
     */
    public function querySnapshotEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySnapshotEventResponse::fromMap($this->doRequest('1.0', 'riskplus.snapshot.event.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量实时触达接口
     * Summary: 发起触达任务
     *
     * @param ApplyTdiquickmsgRtBatchmarketingRequest $request
     *
     * @return ApplyTdiquickmsgRtBatchmarketingResponse
     */
    public function applyTdiquickmsgRtBatchmarketing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyTdiquickmsgRtBatchmarketingEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量实时触达接口
     * Summary: 发起触达任务
     *
     * @param ApplyTdiquickmsgRtBatchmarketingRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return ApplyTdiquickmsgRtBatchmarketingResponse
     */
    public function applyTdiquickmsgRtBatchmarketingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyTdiquickmsgRtBatchmarketingResponse::fromMap($this->doRequest('1.0', 'riskplus.tdiquickmsg.rt.batchmarketing.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起AI外呼
     * Summary: 发起AI外呼
     *
     * @param ApplyTdiquickmsgRobotcallRequest $request
     *
     * @return ApplyTdiquickmsgRobotcallResponse
     */
    public function applyTdiquickmsgRobotcall($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyTdiquickmsgRobotcallEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起AI外呼
     * Summary: 发起AI外呼
     *
     * @param ApplyTdiquickmsgRobotcallRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ApplyTdiquickmsgRobotcallResponse
     */
    public function applyTdiquickmsgRobotcallEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyTdiquickmsgRobotcallResponse::fromMap($this->doRequest('1.0', 'riskplus.tdiquickmsg.robotcall.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短信状态回调接口
     * Summary: 短信状态回调接口.
     *
     * @param CallbackTdiquickmsgSmsRequest $request
     *
     * @return CallbackTdiquickmsgSmsResponse
     */
    public function callbackTdiquickmsgSms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackTdiquickmsgSmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 短信状态回调接口
     * Summary: 短信状态回调接口.
     *
     * @param CallbackTdiquickmsgSmsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CallbackTdiquickmsgSmsResponse
     */
    public function callbackTdiquickmsgSmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackTdiquickmsgSmsResponse::fromMap($this->doRequest('1.0', 'riskplus.tdiquickmsg.sms.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新接入ai外呼服务商的回调接口
     * Summary: ai外呼回调接口.
     *
     * @param CallbackTdiquickmsgRobotcallRequest $request
     *
     * @return CallbackTdiquickmsgRobotcallResponse
     */
    public function callbackTdiquickmsgRobotcall($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackTdiquickmsgRobotcallEx($request, $headers, $runtime);
    }

    /**
     * Description: 新接入ai外呼服务商的回调接口
     * Summary: ai外呼回调接口.
     *
     * @param CallbackTdiquickmsgRobotcallRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CallbackTdiquickmsgRobotcallResponse
     */
    public function callbackTdiquickmsgRobotcallEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackTdiquickmsgRobotcallResponse::fromMap($this->doRequest('1.0', 'riskplus.tdiquickmsg.robotcall.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上行短信回调
     * Summary: 上行短信回调.
     *
     * @param CallbackTdiquickmsgSmsUpRequest $request
     *
     * @return CallbackTdiquickmsgSmsUpResponse
     */
    public function callbackTdiquickmsgSmsUp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackTdiquickmsgSmsUpEx($request, $headers, $runtime);
    }

    /**
     * Description: 上行短信回调
     * Summary: 上行短信回调.
     *
     * @param CallbackTdiquickmsgSmsUpRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CallbackTdiquickmsgSmsUpResponse
     */
    public function callbackTdiquickmsgSmsUpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackTdiquickmsgSmsUpResponse::fromMap($this->doRequest('1.0', 'riskplus.tdiquickmsg.sms.up.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外呼任务统计查询接口
     * Summary: 外呼任务统计查询接口.
     *
     * @param QueryTdiquickmsgRobotcallStatisticinfoRequest $request
     *
     * @return QueryTdiquickmsgRobotcallStatisticinfoResponse
     */
    public function queryTdiquickmsgRobotcallStatisticinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTdiquickmsgRobotcallStatisticinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 外呼任务统计查询接口
     * Summary: 外呼任务统计查询接口.
     *
     * @param QueryTdiquickmsgRobotcallStatisticinfoRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return QueryTdiquickmsgRobotcallStatisticinfoResponse
     */
    public function queryTdiquickmsgRobotcallStatisticinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTdiquickmsgRobotcallStatisticinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.tdiquickmsg.robotcall.statisticinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚁盾业务回流事件推送
     * Summary: 蚁盾业务回流事件推送
     *
     * @param PushTdiquickmsgBackflowEventRequest $request
     *
     * @return PushTdiquickmsgBackflowEventResponse
     */
    public function pushTdiquickmsgBackflowEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushTdiquickmsgBackflowEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚁盾业务回流事件推送
     * Summary: 蚁盾业务回流事件推送
     *
     * @param PushTdiquickmsgBackflowEventRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return PushTdiquickmsgBackflowEventResponse
     */
    public function pushTdiquickmsgBackflowEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushTdiquickmsgBackflowEventResponse::fromMap($this->doRequest('1.0', 'riskplus.tdiquickmsg.backflow.event.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚁盾数据回流推送，用于客户定制json数据
     * Summary: 蚁盾数据回流json格式推送
     *
     * @param PushTdiquickmsgBackflowJsondataRequest $request
     *
     * @return PushTdiquickmsgBackflowJsondataResponse
     */
    public function pushTdiquickmsgBackflowJsondata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushTdiquickmsgBackflowJsondataEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚁盾数据回流推送，用于客户定制json数据
     * Summary: 蚁盾数据回流json格式推送
     *
     * @param PushTdiquickmsgBackflowJsondataRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return PushTdiquickmsgBackflowJsondataResponse
     */
    public function pushTdiquickmsgBackflowJsondataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushTdiquickmsgBackflowJsondataResponse::fromMap($this->doRequest('1.0', 'riskplus.tdiquickmsg.backflow.jsondata.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: saas风险咨询，决策流模式
     * Summary: saas风险咨询.
     *
     * @param QueryTdisaasSecurityPolicyRequest $request
     *
     * @return QueryTdisaasSecurityPolicyResponse
     */
    public function queryTdisaasSecurityPolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTdisaasSecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: saas风险咨询，决策流模式
     * Summary: saas风险咨询.
     *
     * @param QueryTdisaasSecurityPolicyRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryTdisaasSecurityPolicyResponse
     */
    public function queryTdisaasSecurityPolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTdisaasSecurityPolicyResponse::fromMap($this->doRequest('1.0', 'riskplus.tdisaas.security.policy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾批量参数文件上传接口
     * Summary: 营销盾参数文件上传.
     *
     * @param UploadUmktParamsFileRequest $request
     *
     * @return UploadUmktParamsFileResponse
     */
    public function uploadUmktParamsFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadUmktParamsFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾批量参数文件上传接口
     * Summary: 营销盾参数文件上传.
     *
     * @param UploadUmktParamsFileRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UploadUmktParamsFileResponse
     */
    public function uploadUmktParamsFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.umkt.params.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadUmktParamsFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadUmktParamsFileResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.params.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾实时营销服务，支持批量
     * Summary: 营销盾实时营销服务
     *
     * @param BatchqueryUmktRtMarketingRequest $request
     *
     * @return BatchqueryUmktRtMarketingResponse
     */
    public function batchqueryUmktRtMarketing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryUmktRtMarketingEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾实时营销服务，支持批量
     * Summary: 营销盾实时营销服务
     *
     * @param BatchqueryUmktRtMarketingRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return BatchqueryUmktRtMarketingResponse
     */
    public function batchqueryUmktRtMarketingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryUmktRtMarketingResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.rt.marketing.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 梦网富信投放事件通知
     * Summary: 梦网富信投放事件通知.
     *
     * @param SyncUmktRtEventresultRequest $request
     *
     * @return SyncUmktRtEventresultResponse
     */
    public function syncUmktRtEventresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncUmktRtEventresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 梦网富信投放事件通知
     * Summary: 梦网富信投放事件通知.
     *
     * @param SyncUmktRtEventresultRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SyncUmktRtEventresultResponse
     */
    public function syncUmktRtEventresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncUmktRtEventresultResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.rt.eventresult.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾场景租户信息上传or更新
     * Summary: 营销盾场景租户信息上传or更新.
     *
     * @param ImportUmktSceneUploadRequest $request
     *
     * @return ImportUmktSceneUploadResponse
     */
    public function importUmktSceneUpload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importUmktSceneUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾场景租户信息上传or更新
     * Summary: 营销盾场景租户信息上传or更新.
     *
     * @param ImportUmktSceneUploadRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ImportUmktSceneUploadResponse
     */
    public function importUmktSceneUploadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportUmktSceneUploadResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.scene.upload.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 富信贴尾实时圈客
     * Summary: 富信贴尾实时圈客.
     *
     * @param BatchqueryUmktRtTailmarketingRequest $request
     *
     * @return BatchqueryUmktRtTailmarketingResponse
     */
    public function batchqueryUmktRtTailmarketing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryUmktRtTailmarketingEx($request, $headers, $runtime);
    }

    /**
     * Description: 富信贴尾实时圈客
     * Summary: 富信贴尾实时圈客.
     *
     * @param BatchqueryUmktRtTailmarketingRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchqueryUmktRtTailmarketingResponse
     */
    public function batchqueryUmktRtTailmarketingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryUmktRtTailmarketingResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.rt.tailmarketing.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 实时圈客场景策略测试
     * Summary: 实时圈客场景策略测试功能.
     *
     * @param QueryUmktScenestrategyTestRequest $request
     *
     * @return QueryUmktScenestrategyTestResponse
     */
    public function queryUmktScenestrategyTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktScenestrategyTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 实时圈客场景策略测试
     * Summary: 实时圈客场景策略测试功能.
     *
     * @param QueryUmktScenestrategyTestRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryUmktScenestrategyTestResponse
     */
    public function queryUmktScenestrategyTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktScenestrategyTestResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.scenestrategy.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起AI外呼
     * Summary: 发起AI外呼
     *
     * @param ApplyUmktRobotcallRequest $request
     *
     * @return ApplyUmktRobotcallResponse
     */
    public function applyUmktRobotcall($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyUmktRobotcallEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起AI外呼
     * Summary: 发起AI外呼
     *
     * @param ApplyUmktRobotcallRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ApplyUmktRobotcallResponse
     */
    public function applyUmktRobotcallEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyUmktRobotcallResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.robotcall.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾查询回执统计数据接口
     * Summary: 营销盾回执统计查询.
     *
     * @param QueryUmktDataaccessStatisticRequest $request
     *
     * @return QueryUmktDataaccessStatisticResponse
     */
    public function queryUmktDataaccessStatistic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktDataaccessStatisticEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾查询回执统计数据接口
     * Summary: 营销盾回执统计查询.
     *
     * @param QueryUmktDataaccessStatisticRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryUmktDataaccessStatisticResponse
     */
    public function queryUmktDataaccessStatisticEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktDataaccessStatisticResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.dataaccess.statistic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾离线批量任务取消接口
     * Summary: 营销盾取消离线批量任务
     *
     * @param CancelUmktDataaccessOfflinetaskRequest $request
     *
     * @return CancelUmktDataaccessOfflinetaskResponse
     */
    public function cancelUmktDataaccessOfflinetask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelUmktDataaccessOfflinetaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾离线批量任务取消接口
     * Summary: 营销盾取消离线批量任务
     *
     * @param CancelUmktDataaccessOfflinetaskRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return CancelUmktDataaccessOfflinetaskResponse
     */
    public function cancelUmktDataaccessOfflinetaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelUmktDataaccessOfflinetaskResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.dataaccess.offlinetask.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
     * Summary: 营销盾实时单一凭证营销接口.
     *
     * @param QueryUmktRtMarketingRequest $request
     *
     * @return QueryUmktRtMarketingResponse
     */
    public function queryUmktRtMarketing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktRtMarketingEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
     * Summary: 营销盾实时单一凭证营销接口.
     *
     * @param QueryUmktRtMarketingRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryUmktRtMarketingResponse
     */
    public function queryUmktRtMarketingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktRtMarketingResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.rt.marketing.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾业务回流事件推送
     * Summary: 营销盾回流事件推送
     *
     * @param PushUmktBackflowEventRequest $request
     *
     * @return PushUmktBackflowEventResponse
     */
    public function pushUmktBackflowEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushUmktBackflowEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾业务回流事件推送
     * Summary: 营销盾回流事件推送
     *
     * @param PushUmktBackflowEventRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PushUmktBackflowEventResponse
     */
    public function pushUmktBackflowEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushUmktBackflowEventResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.backflow.event.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口.
     *
     * @param SendUmktCardsmsBatchRequest $request
     *
     * @return SendUmktCardsmsBatchResponse
     */
    public function sendUmktCardsmsBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendUmktCardsmsBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口.
     *
     * @param SendUmktCardsmsBatchRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SendUmktCardsmsBatchResponse
     */
    public function sendUmktCardsmsBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendUmktCardsmsBatchResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.cardsms.batch.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询.
     *
     * @param QueryUmktCardsmsSupportRequest $request
     *
     * @return QueryUmktCardsmsSupportResponse
     */
    public function queryUmktCardsmsSupport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktCardsmsSupportEx($request, $headers, $runtime);
    }

    /**
     * Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询.
     *
     * @param QueryUmktCardsmsSupportRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryUmktCardsmsSupportResponse
     */
    public function queryUmktCardsmsSupportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktCardsmsSupportResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.cardsms.support.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本短信批量发送接口
     * Summary: 文本短信批量发送接口.
     *
     * @param SendUmktTextsmsBatchRequest $request
     *
     * @return SendUmktTextsmsBatchResponse
     */
    public function sendUmktTextsmsBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendUmktTextsmsBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本短信批量发送接口
     * Summary: 文本短信批量发送接口.
     *
     * @param SendUmktTextsmsBatchRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SendUmktTextsmsBatchResponse
     */
    public function sendUmktTextsmsBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendUmktTextsmsBatchResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.textsms.batch.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字短信批量发送接口（单模板）
     * Summary: 数字短信批量发送接口（单模板）.
     *
     * @param SendUmktDigitalsmsBatchRequest $request
     *
     * @return SendUmktDigitalsmsBatchResponse
     */
    public function sendUmktDigitalsmsBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendUmktDigitalsmsBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字短信批量发送接口（单模板）
     * Summary: 数字短信批量发送接口（单模板）.
     *
     * @param SendUmktDigitalsmsBatchRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SendUmktDigitalsmsBatchResponse
     */
    public function sendUmktDigitalsmsBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendUmktDigitalsmsBatchResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.digitalsms.batch.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询cpaas短信模板
     * Summary: cpaas短信模板分页查询.
     *
     * @param QueryUmktCpaassmsTemplateRequest $request
     *
     * @return QueryUmktCpaassmsTemplateResponse
     */
    public function queryUmktCpaassmsTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktCpaassmsTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询cpaas短信模板
     * Summary: cpaas短信模板分页查询.
     *
     * @param QueryUmktCpaassmsTemplateRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryUmktCpaassmsTemplateResponse
     */
    public function queryUmktCpaassmsTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktCpaassmsTemplateResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.cpaassms.template.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 实时混合批量营销圈客
     * Summary: 实时混合批量营销圈客.
     *
     * @param BatchqueryUmktRtMixedmarketingRequest $request
     *
     * @return BatchqueryUmktRtMixedmarketingResponse
     */
    public function batchqueryUmktRtMixedmarketing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryUmktRtMixedmarketingEx($request, $headers, $runtime);
    }

    /**
     * Description: 实时混合批量营销圈客
     * Summary: 实时混合批量营销圈客.
     *
     * @param BatchqueryUmktRtMixedmarketingRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return BatchqueryUmktRtMixedmarketingResponse
     */
    public function batchqueryUmktRtMixedmarketingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryUmktRtMixedmarketingResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.rt.mixedmarketing.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用营销盾空号检测
     * Summary: 调用营销盾空号检测.
     *
     * @param ApplyUmktPhonenumberstatusforsmsRequest $request
     *
     * @return ApplyUmktPhonenumberstatusforsmsResponse
     */
    public function applyUmktPhonenumberstatusforsms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyUmktPhonenumberstatusforsmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用营销盾空号检测
     * Summary: 调用营销盾空号检测.
     *
     * @param ApplyUmktPhonenumberstatusforsmsRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return ApplyUmktPhonenumberstatusforsmsResponse
     */
    public function applyUmktPhonenumberstatusforsmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyUmktPhonenumberstatusforsmsResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.phonenumberstatusforsms.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销实时topN圈客
     * Summary: 营销实时topN圈客.
     *
     * @param BatchqueryUmktRtTopnRequest $request
     *
     * @return BatchqueryUmktRtTopnResponse
     */
    public function batchqueryUmktRtTopn($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryUmktRtTopnEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销实时topN圈客
     * Summary: 营销实时topN圈客.
     *
     * @param BatchqueryUmktRtTopnRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return BatchqueryUmktRtTopnResponse
     */
    public function batchqueryUmktRtTopnEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryUmktRtTopnResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.rt.topn.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外呼任务统计查询接口
     * Summary: 外呼任务统计查询接口.
     *
     * @param QueryUmktRobotcallStatisticinfoRequest $request
     *
     * @return QueryUmktRobotcallStatisticinfoResponse
     */
    public function queryUmktRobotcallStatisticinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktRobotcallStatisticinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 外呼任务统计查询接口
     * Summary: 外呼任务统计查询接口.
     *
     * @param QueryUmktRobotcallStatisticinfoRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryUmktRobotcallStatisticinfoResponse
     */
    public function queryUmktRobotcallStatisticinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktRobotcallStatisticinfoResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.robotcall.statisticinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾租户场景信息查询
     * Summary: 营销盾租户场景信息查询.
     *
     * @param QueryUmktTenantActionplaninfoRequest $request
     *
     * @return QueryUmktTenantActionplaninfoResponse
     */
    public function queryUmktTenantActionplaninfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktTenantActionplaninfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾租户场景信息查询
     * Summary: 营销盾租户场景信息查询.
     *
     * @param QueryUmktTenantActionplaninfoRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryUmktTenantActionplaninfoResponse
     */
    public function queryUmktTenantActionplaninfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktTenantActionplaninfoResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.tenant.actionplaninfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询ai外呼任务详情
     * Summary: 查询ai外呼任务详情.
     *
     * @param QueryUmktRobotcallDetailRequest $request
     *
     * @return QueryUmktRobotcallDetailResponse
     */
    public function queryUmktRobotcallDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktRobotcallDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询ai外呼任务详情
     * Summary: 查询ai外呼任务详情.
     *
     * @param QueryUmktRobotcallDetailRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryUmktRobotcallDetailResponse
     */
    public function queryUmktRobotcallDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktRobotcallDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.robotcall.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起触达营销任务 ---目前仅支持文本短信
     * Summary: 发起触达营销任务
     *
     * @param ApplyUmktRealtimemarketingRequest $request
     *
     * @return ApplyUmktRealtimemarketingResponse
     */
    public function applyUmktRealtimemarketing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyUmktRealtimemarketingEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起触达营销任务 ---目前仅支持文本短信
     * Summary: 发起触达营销任务
     *
     * @param ApplyUmktRealtimemarketingRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ApplyUmktRealtimemarketingResponse
     */
    public function applyUmktRealtimemarketingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyUmktRealtimemarketingResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.realtimemarketing.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量实时策略触达
     * Summary: 批量实时策略触达.
     *
     * @param ApplyUmktRtBatchmarketingRequest $request
     *
     * @return ApplyUmktRtBatchmarketingResponse
     */
    public function applyUmktRtBatchmarketing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyUmktRtBatchmarketingEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量实时策略触达
     * Summary: 批量实时策略触达.
     *
     * @param ApplyUmktRtBatchmarketingRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ApplyUmktRtBatchmarketingResponse
     */
    public function applyUmktRtBatchmarketingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyUmktRtBatchmarketingResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.rt.batchmarketing.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新接入ai外呼服务商的回调接口
     * Summary: ai外呼回调接口.
     *
     * @param CallbackUmktRobotcallRequest $request
     *
     * @return CallbackUmktRobotcallResponse
     */
    public function callbackUmktRobotcall($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackUmktRobotcallEx($request, $headers, $runtime);
    }

    /**
     * Description: 新接入ai外呼服务商的回调接口
     * Summary: ai外呼回调接口.
     *
     * @param CallbackUmktRobotcallRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CallbackUmktRobotcallResponse
     */
    public function callbackUmktRobotcallEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackUmktRobotcallResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.robotcall.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾上行短信回调接口
     * Summary: 营销盾上行短信回调.
     *
     * @param CallbackUmktSmsUpRequest $request
     *
     * @return CallbackUmktSmsUpResponse
     */
    public function callbackUmktSmsUp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackUmktSmsUpEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾上行短信回调接口
     * Summary: 营销盾上行短信回调.
     *
     * @param CallbackUmktSmsUpRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CallbackUmktSmsUpResponse
     */
    public function callbackUmktSmsUpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackUmktSmsUpResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.sms.up.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾短信状态回调接口
     * Summary: 营销盾短信状态回调.
     *
     * @param CallbackUmktSmsReportRequest $request
     *
     * @return CallbackUmktSmsReportResponse
     */
    public function callbackUmktSmsReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackUmktSmsReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾短信状态回调接口
     * Summary: 营销盾短信状态回调.
     *
     * @param CallbackUmktSmsReportRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CallbackUmktSmsReportResponse
     */
    public function callbackUmktSmsReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackUmktSmsReportResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.sms.report.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询租户外呼策略
     * Summary: 营销盾租户场景批量信息查询.
     *
     * @param BatchqueryUmktTenantActionplaninfoRequest $request
     *
     * @return BatchqueryUmktTenantActionplaninfoResponse
     */
    public function batchqueryUmktTenantActionplaninfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryUmktTenantActionplaninfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询租户外呼策略
     * Summary: 营销盾租户场景批量信息查询.
     *
     * @param BatchqueryUmktTenantActionplaninfoRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return BatchqueryUmktTenantActionplaninfoResponse
     */
    public function batchqueryUmktTenantActionplaninfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryUmktTenantActionplaninfoResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.tenant.actionplaninfo.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
     * (已下线)
     * Summary: 营销盾外呼详情查询接口.
     *
     * @param BatchqueryUmktRobotcallDetailRequest $request
     *
     * @return BatchqueryUmktRobotcallDetailResponse
     */
    public function batchqueryUmktRobotcallDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryUmktRobotcallDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
     * (已下线)
     * Summary: 营销盾外呼详情查询接口.
     *
     * @param BatchqueryUmktRobotcallDetailRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchqueryUmktRobotcallDetailResponse
     */
    public function batchqueryUmktRobotcallDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryUmktRobotcallDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.robotcall.detail.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾查询外呼策略详情
     * Summary: 营销盾查询外呼策略详情.
     *
     * @param BatchqueryUmktActionplanDetailRequest $request
     *
     * @return BatchqueryUmktActionplanDetailResponse
     */
    public function batchqueryUmktActionplanDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryUmktActionplanDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾查询外呼策略详情
     * Summary: 营销盾查询外呼策略详情.
     *
     * @param BatchqueryUmktActionplanDetailRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return BatchqueryUmktActionplanDetailResponse
     */
    public function batchqueryUmktActionplanDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryUmktActionplanDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.actionplan.detail.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾通用回流推送服务
     * Summary: 营销盾通用回流推送服务
     *
     * @param PushRiskplusUmktCommonbackflowRequest $request
     *
     * @return PushRiskplusUmktCommonbackflowResponse
     */
    public function pushRiskplusUmktCommonbackflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRiskplusUmktCommonbackflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾通用回流推送服务
     * Summary: 营销盾通用回流推送服务
     *
     * @param PushRiskplusUmktCommonbackflowRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return PushRiskplusUmktCommonbackflowResponse
     */
    public function pushRiskplusUmktCommonbackflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRiskplusUmktCommonbackflowResponse::fromMap($this->doRequest('1.0', 'riskplus.riskplus.umkt.commonbackflow.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾通用数据推送服务
     * Summary: 营销盾通用数据推送服务
     *
     * @param PushUmktCommonDataRequest $request
     *
     * @return PushUmktCommonDataResponse
     */
    public function pushUmktCommonData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushUmktCommonDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾通用数据推送服务
     * Summary: 营销盾通用数据推送服务
     *
     * @param PushUmktCommonDataRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PushUmktCommonDataResponse
     */
    public function pushUmktCommonDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushUmktCommonDataResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.common.data.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾客群推送服务
     * Summary: 营销盾客群推送服务
     *
     * @param PushUmktCustomerGroupRequest $request
     *
     * @return PushUmktCustomerGroupResponse
     */
    public function pushUmktCustomerGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushUmktCustomerGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾客群推送服务
     * Summary: 营销盾客群推送服务
     *
     * @param PushUmktCustomerGroupRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PushUmktCustomerGroupResponse
     */
    public function pushUmktCustomerGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushUmktCustomerGroupResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.customer.group.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 触达执行任务详情查询
     * Summary: 触达执行任务详情查询.
     *
     * @param BatchqueryUmktTaskDetailRequest $request
     *
     * @return BatchqueryUmktTaskDetailResponse
     */
    public function batchqueryUmktTaskDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryUmktTaskDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 触达执行任务详情查询
     * Summary: 触达执行任务详情查询.
     *
     * @param BatchqueryUmktTaskDetailRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return BatchqueryUmktTaskDetailResponse
     */
    public function batchqueryUmktTaskDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryUmktTaskDetailResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.task.detail.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾数据回流推送，用于客户定制json数据
     * Summary: 营销盾数据回流json格式推送
     *
     * @param PushUmktBackflowJsondataRequest $request
     *
     * @return PushUmktBackflowJsondataResponse
     */
    public function pushUmktBackflowJsondata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushUmktBackflowJsondataEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾数据回流推送，用于客户定制json数据
     * Summary: 营销盾数据回流json格式推送
     *
     * @param PushUmktBackflowJsondataRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PushUmktBackflowJsondataResponse
     */
    public function pushUmktBackflowJsondataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushUmktBackflowJsondataResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.backflow.jsondata.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾卡短解析服务能力提供接口
     * Summary: 营销盾卡短解析服务接口.
     *
     * @param QueryUmktCardsmsAnalysisRequest $request
     *
     * @return QueryUmktCardsmsAnalysisResponse
     */
    public function queryUmktCardsmsAnalysis($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktCardsmsAnalysisEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾卡短解析服务能力提供接口
     * Summary: 营销盾卡短解析服务接口.
     *
     * @param QueryUmktCardsmsAnalysisRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryUmktCardsmsAnalysisResponse
     */
    public function queryUmktCardsmsAnalysisEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktCardsmsAnalysisResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.cardsms.analysis.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾离线圈客文件导入
     * Summary: 营销盾离线圈客文件导入.
     *
     * @param UploadUmktOfflinedecisionRequest $request
     *
     * @return UploadUmktOfflinedecisionResponse
     */
    public function uploadUmktOfflinedecision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadUmktOfflinedecisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾离线圈客文件导入
     * Summary: 营销盾离线圈客文件导入.
     *
     * @param UploadUmktOfflinedecisionRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UploadUmktOfflinedecisionResponse
     */
    public function uploadUmktOfflinedecisionEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.umkt.offlinedecision.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadUmktOfflinedecisionResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadUmktOfflinedecisionResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.offlinedecision.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾查询可拉取圈客结果的计划集合
     * Summary: 营销盾查询可拉取圈客结果的计划集合.
     *
     * @param QueryUmktOfflinedecisionResultRequest $request
     *
     * @return QueryUmktOfflinedecisionResultResponse
     */
    public function queryUmktOfflinedecisionResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktOfflinedecisionResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾查询可拉取圈客结果的计划集合
     * Summary: 营销盾查询可拉取圈客结果的计划集合.
     *
     * @param QueryUmktOfflinedecisionResultRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryUmktOfflinedecisionResultResponse
     */
    public function queryUmktOfflinedecisionResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktOfflinedecisionResultResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.offlinedecision.result.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾离线圈客结果文件拉取
     * Summary: 营销盾离线圈客结果文件拉取.
     *
     * @param DownloadUmktOfflinedecisionResultRequest $request
     *
     * @return DownloadUmktOfflinedecisionResultResponse
     */
    public function downloadUmktOfflinedecisionResult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadUmktOfflinedecisionResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾离线圈客结果文件拉取
     * Summary: 营销盾离线圈客结果文件拉取.
     *
     * @param DownloadUmktOfflinedecisionResultRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return DownloadUmktOfflinedecisionResultResponse
     */
    public function downloadUmktOfflinedecisionResultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadUmktOfflinedecisionResultResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.offlinedecision.result.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 包含离线圈客关联计划和任务状态详情
     * Summary: 营销盾离线圈客计划执行详情.
     *
     * @param QueryUmktOfflinedecisionPlandetailsRequest $request
     *
     * @return QueryUmktOfflinedecisionPlandetailsResponse
     */
    public function queryUmktOfflinedecisionPlandetails($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUmktOfflinedecisionPlandetailsEx($request, $headers, $runtime);
    }

    /**
     * Description: 包含离线圈客关联计划和任务状态详情
     * Summary: 营销盾离线圈客计划执行详情.
     *
     * @param QueryUmktOfflinedecisionPlandetailsRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryUmktOfflinedecisionPlandetailsResponse
     */
    public function queryUmktOfflinedecisionPlandetailsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUmktOfflinedecisionPlandetailsResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.offlinedecision.plandetails.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 营销盾离线圈投一体文件上传
     * Summary: 营销盾离线圈投一体文件上传.
     *
     * @param UploadUmktOfflineImportrecordRequest $request
     *
     * @return UploadUmktOfflineImportrecordResponse
     */
    public function uploadUmktOfflineImportrecord($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadUmktOfflineImportrecordEx($request, $headers, $runtime);
    }

    /**
     * Description: 营销盾离线圈投一体文件上传
     * Summary: 营销盾离线圈投一体文件上传.
     *
     * @param UploadUmktOfflineImportrecordRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UploadUmktOfflineImportrecordResponse
     */
    public function uploadUmktOfflineImportrecordEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'riskplus.umkt.offline.importrecord.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadUmktOfflineImportrecordResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadUmktOfflineImportrecordResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.offline.importrecord.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 圈投一体圈客结果文件url获取
     * Summary: 圈投一体圈客结果文件url获取.
     *
     * @param DownloadUmktOfflineCampaignRequest $request
     *
     * @return DownloadUmktOfflineCampaignResponse
     */
    public function downloadUmktOfflineCampaign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadUmktOfflineCampaignEx($request, $headers, $runtime);
    }

    /**
     * Description: 圈投一体圈客结果文件url获取
     * Summary: 圈投一体圈客结果文件url获取.
     *
     * @param DownloadUmktOfflineCampaignRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DownloadUmktOfflineCampaignResponse
     */
    public function downloadUmktOfflineCampaignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadUmktOfflineCampaignResponse::fromMap($this->doRequest('1.0', 'riskplus.umkt.offline.campaign.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
