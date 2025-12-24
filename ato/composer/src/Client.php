<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\ATO\Models\AddFundDividerelationRequest;
use AntChain\ATO\Models\AddFundDividerelationResponse;
use AntChain\ATO\Models\AddInnerKnowledgecategoryRequest;
use AntChain\ATO\Models\AddInnerKnowledgecategoryResponse;
use AntChain\ATO\Models\AddInnerTemplateRequest;
use AntChain\ATO\Models\AddInnerTemplateResponse;
use AntChain\ATO\Models\AddKnowledgeCategoryRequest;
use AntChain\ATO\Models\AddKnowledgeCategoryResponse;
use AntChain\ATO\Models\AddMerchantexpandDividerelationRequest;
use AntChain\ATO\Models\AddMerchantexpandDividerelationResponse;
use AntChain\ATO\Models\AddTradeFinanceprecheckRequest;
use AntChain\ATO\Models\AddTradeFinanceprecheckResponse;
use AntChain\ATO\Models\AllInnerTemplateRequest;
use AntChain\ATO\Models\AllInnerTemplateResponse;
use AntChain\ATO\Models\AllSignTemplateRequest;
use AntChain\ATO\Models\AllSignTemplateResponse;
use AntChain\ATO\Models\ApplyFundAssertorderRequest;
use AntChain\ATO\Models\ApplyFundAssertorderResponse;
use AntChain\ATO\Models\ApplyFundCreditutilizationRequest;
use AntChain\ATO\Models\ApplyFundCreditutilizationResponse;
use AntChain\ATO\Models\ApplyTradeFinanceprecheckRequest;
use AntChain\ATO\Models\ApplyTradeFinanceprecheckResponse;
use AntChain\ATO\Models\AuthFundCreditgrantingRequest;
use AntChain\ATO\Models\AuthFundCreditgrantingResponse;
use AntChain\ATO\Models\AuthFundFlowRequest;
use AntChain\ATO\Models\AuthFundFlowResponse;
use AntChain\ATO\Models\AuthSignFlowRequest;
use AntChain\ATO\Models\AuthSignFlowResponse;
use AntChain\ATO\Models\BatchcreateInnerSceneproductRequest;
use AntChain\ATO\Models\BatchcreateInnerSceneproductResponse;
use AntChain\ATO\Models\BatchcreateInnerTemplatetextareaRequest;
use AntChain\ATO\Models\BatchcreateInnerTemplatetextareaResponse;
use AntChain\ATO\Models\BatchdeleteInnerKnowledgecategoryRequest;
use AntChain\ATO\Models\BatchdeleteInnerKnowledgecategoryResponse;
use AntChain\ATO\Models\BatchdeleteKnowledgeCategoryRequest;
use AntChain\ATO\Models\BatchdeleteKnowledgeCategoryResponse;
use AntChain\ATO\Models\BatchqueryInnerMarketingscoreRequest;
use AntChain\ATO\Models\BatchqueryInnerMarketingscoreResponse;
use AntChain\ATO\Models\BindMerchantexpandSettlecardRequest;
use AntChain\ATO\Models\BindMerchantexpandSettlecardResponse;
use AntChain\ATO\Models\CallbackFundNotifyRequest;
use AntChain\ATO\Models\CallbackFundNotifyResponse;
use AntChain\ATO\Models\CancelFundFlowRequest;
use AntChain\ATO\Models\CancelFundFlowResponse;
use AntChain\ATO\Models\CancelFundPlanRequest;
use AntChain\ATO\Models\CancelFundPlanResponse;
use AntChain\ATO\Models\CancelSignFlowRequest;
use AntChain\ATO\Models\CancelSignFlowResponse;
use AntChain\ATO\Models\CancelWithholdActivepayRequest;
use AntChain\ATO\Models\CancelWithholdActivepayResponse;
use AntChain\ATO\Models\CancelWithholdPlanRequest;
use AntChain\ATO\Models\CancelWithholdPlanResponse;
use AntChain\ATO\Models\ChargeInnerAgreementterminateevidenceRequest;
use AntChain\ATO\Models\ChargeInnerAgreementterminateevidenceResponse;
use AntChain\ATO\Models\CloneInnerTemplatefileaddressRequest;
use AntChain\ATO\Models\CloneInnerTemplatefileaddressResponse;
use AntChain\ATO\Models\CloneInnerTemplateRequest;
use AntChain\ATO\Models\CloneInnerTemplateResponse;
use AntChain\ATO\Models\ConfirmFundCompensateRequest;
use AntChain\ATO\Models\ConfirmFundCompensateResponse;
use AntChain\ATO\Models\ConfirmFundUsercancelRequest;
use AntChain\ATO\Models\ConfirmFundUsercancelResponse;
use AntChain\ATO\Models\ConfirmInnerAuthagreementRequest;
use AntChain\ATO\Models\ConfirmInnerAuthagreementResponse;
use AntChain\ATO\Models\ConfirmWithholdSignasyncunsignRequest;
use AntChain\ATO\Models\ConfirmWithholdSignasyncunsignResponse;
use AntChain\ATO\Models\CountInnerAgreementterminateRequest;
use AntChain\ATO\Models\CountInnerAgreementterminateResponse;
use AntChain\ATO\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\ATO\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\ATO\Models\CreateInnerCustomerserviceRequest;
use AntChain\ATO\Models\CreateInnerCustomerserviceResponse;
use AntChain\ATO\Models\CreateInnerFunddividerelationRequest;
use AntChain\ATO\Models\CreateInnerFunddividerelationResponse;
use AntChain\ATO\Models\CreateInnerFundmngcreditRequest;
use AntChain\ATO\Models\CreateInnerFundmngcreditResponse;
use AntChain\ATO\Models\CreateInnerFundmngmerchantpromiseRequest;
use AntChain\ATO\Models\CreateInnerFundmngmerchantpromiseResponse;
use AntChain\ATO\Models\CreateInnerInsuresignRequest;
use AntChain\ATO\Models\CreateInnerInsuresignResponse;
use AntChain\ATO\Models\CreateInnerKnowledgecategoryRequest;
use AntChain\ATO\Models\CreateInnerKnowledgecategoryResponse;
use AntChain\ATO\Models\CreateInnerMerchantagreementRequest;
use AntChain\ATO\Models\CreateInnerMerchantagreementResponse;
use AntChain\ATO\Models\CreateInnerMerchantpayexpandRequest;
use AntChain\ATO\Models\CreateInnerMerchantpayexpandResponse;
use AntChain\ATO\Models\CreateInnerPromotionsceneRequest;
use AntChain\ATO\Models\CreateInnerPromotionsceneResponse;
use AntChain\ATO\Models\CreateInnerSaleschannelRequest;
use AntChain\ATO\Models\CreateInnerSaleschannelResponse;
use AntChain\ATO\Models\CreateInnerTemplateRequest;
use AntChain\ATO\Models\CreateInnerTemplateResponse;
use AntChain\ATO\Models\CreateInnerTemplatetextareaRequest;
use AntChain\ATO\Models\CreateInnerTemplatetextareaResponse;
use AntChain\ATO\Models\CreateInnerTenantaccountinfoRequest;
use AntChain\ATO\Models\CreateInnerTenantaccountinfoResponse;
use AntChain\ATO\Models\CreateInnerWithholdsignRequest;
use AntChain\ATO\Models\CreateInnerWithholdsignResponse;
use AntChain\ATO\Models\CreateInsureRequest;
use AntChain\ATO\Models\CreateInsureResponse;
use AntChain\ATO\Models\CreateJdFunddividerelationRequest;
use AntChain\ATO\Models\CreateJdFunddividerelationResponse;
use AntChain\ATO\Models\CreateKnowledgeCategoryRequest;
use AntChain\ATO\Models\CreateKnowledgeCategoryResponse;
use AntChain\ATO\Models\CreateRealpersonFacevrfRequest;
use AntChain\ATO\Models\CreateRealpersonFacevrfResponse;
use AntChain\ATO\Models\CreateWithholdActivepayRequest;
use AntChain\ATO\Models\CreateWithholdActivepayResponse;
use AntChain\ATO\Models\CreateWithholdRefundRequest;
use AntChain\ATO\Models\CreateWithholdRefundResponse;
use AntChain\ATO\Models\CreateWithholdSignRequest;
use AntChain\ATO\Models\CreateWithholdSignResponse;
use AntChain\ATO\Models\DeleteInnerDatadownloadRequest;
use AntChain\ATO\Models\DeleteInnerDatadownloadResponse;
use AntChain\ATO\Models\DeleteInnerFundmngdatadownloadRequest;
use AntChain\ATO\Models\DeleteInnerFundmngdatadownloadResponse;
use AntChain\ATO\Models\DeleteInnerPlatformorderleadRequest;
use AntChain\ATO\Models\DeleteInnerPlatformorderleadResponse;
use AntChain\ATO\Models\DeleteInnerPromotionsceneRequest;
use AntChain\ATO\Models\DeleteInnerPromotionsceneResponse;
use AntChain\ATO\Models\DeleteInnerSaleschannelRequest;
use AntChain\ATO\Models\DeleteInnerSaleschannelResponse;
use AntChain\ATO\Models\DeleteInnerSceneproductRequest;
use AntChain\ATO\Models\DeleteInnerSceneproductResponse;
use AntChain\ATO\Models\DeleteInnerTemplateRequest;
use AntChain\ATO\Models\DeleteInnerTemplateResponse;
use AntChain\ATO\Models\DetailInnerAgreementterminateRequest;
use AntChain\ATO\Models\DetailInnerAgreementterminateResponse;
use AntChain\ATO\Models\DetailInnerCustomerserviceRequest;
use AntChain\ATO\Models\DetailInnerCustomerserviceResponse;
use AntChain\ATO\Models\DetailInnerFundmngorderRequest;
use AntChain\ATO\Models\DetailInnerFundmngorderResponse;
use AntChain\ATO\Models\DetailInnerNoticeRequest;
use AntChain\ATO\Models\DetailInnerNoticeResponse;
use AntChain\ATO\Models\DetailInnerOrderRequest;
use AntChain\ATO\Models\DetailInnerOrderResponse;
use AntChain\ATO\Models\DetailInnerPendingeventRequest;
use AntChain\ATO\Models\DetailInnerPendingeventResponse;
use AntChain\ATO\Models\DetailInnerPlatformproductRequest;
use AntChain\ATO\Models\DetailInnerPlatformproductResponse;
use AntChain\ATO\Models\DetailInnerSceneproductRequest;
use AntChain\ATO\Models\DetailInnerSceneproductResponse;
use AntChain\ATO\Models\DetailInnerTemplateRequest;
use AntChain\ATO\Models\DetailInnerTemplateResponse;
use AntChain\ATO\Models\DownloadInnerFileRequest;
use AntChain\ATO\Models\DownloadInnerFileResponse;
use AntChain\ATO\Models\GetFundCompensatesignurlRequest;
use AntChain\ATO\Models\GetFundCompensatesignurlResponse;
use AntChain\ATO\Models\GetFundFlowRequest;
use AntChain\ATO\Models\GetFundFlowResponse;
use AntChain\ATO\Models\GetFundMerchantperformanceRequest;
use AntChain\ATO\Models\GetFundMerchantperformanceResponse;
use AntChain\ATO\Models\GetFundOrderfinanceinfoRequest;
use AntChain\ATO\Models\GetFundOrderfinanceinfoResponse;
use AntChain\ATO\Models\GetFundOrderfulfillmentRequest;
use AntChain\ATO\Models\GetFundOrderfulfillmentResponse;
use AntChain\ATO\Models\GetFundOrderfullinfoRequest;
use AntChain\ATO\Models\GetFundOrderfullinfoResponse;
use AntChain\ATO\Models\GetFundUserperformanceRequest;
use AntChain\ATO\Models\GetFundUserperformanceResponse;
use AntChain\ATO\Models\GetFundUserpromiseRequest;
use AntChain\ATO\Models\GetFundUserpromiseResponse;
use AntChain\ATO\Models\GetInnerAgentcustomerserviceRequest;
use AntChain\ATO\Models\GetInnerAgentcustomerserviceResponse;
use AntChain\ATO\Models\GetInnerCustomerservicetemplateRequest;
use AntChain\ATO\Models\GetInnerCustomerservicetemplateResponse;
use AntChain\ATO\Models\GetInnerFunddividemerchantRequest;
use AntChain\ATO\Models\GetInnerFunddividemerchantResponse;
use AntChain\ATO\Models\GetInnerHomepagenoticeRequest;
use AntChain\ATO\Models\GetInnerHomepagenoticeResponse;
use AntChain\ATO\Models\GetInnerMerchantstaticdataRequest;
use AntChain\ATO\Models\GetInnerMerchantstaticdataResponse;
use AntChain\ATO\Models\GetInnerProductRequest;
use AntChain\ATO\Models\GetInnerProductResponse;
use AntChain\ATO\Models\GetInnerTemplateofficeurlRequest;
use AntChain\ATO\Models\GetInnerTemplateofficeurlResponse;
use AntChain\ATO\Models\GetInnerTenantRequest;
use AntChain\ATO\Models\GetInnerTenantResponse;
use AntChain\ATO\Models\GetSignContractcertificateRequest;
use AntChain\ATO\Models\GetSignContractcertificateResponse;
use AntChain\ATO\Models\GetSignFlowRequest;
use AntChain\ATO\Models\GetSignFlowResponse;
use AntChain\ATO\Models\GetTradeMerchantfulfillmentRequest;
use AntChain\ATO\Models\GetTradeMerchantfulfillmentResponse;
use AntChain\ATO\Models\GetTradeMerchantperformanceRequest;
use AntChain\ATO\Models\GetTradeMerchantperformanceResponse;
use AntChain\ATO\Models\GetTradeOrderfinanceinfoRequest;
use AntChain\ATO\Models\GetTradeOrderfinanceinfoResponse;
use AntChain\ATO\Models\GetTradeOrderfullinfoRequest;
use AntChain\ATO\Models\GetTradeOrderfullinfoResponse;
use AntChain\ATO\Models\GetTradeRequest;
use AntChain\ATO\Models\GetTradeResponse;
use AntChain\ATO\Models\GetTradeUserperformanceRequest;
use AntChain\ATO\Models\GetTradeUserperformanceResponse;
use AntChain\ATO\Models\InitInnerFundmngmerchantpromiseRequest;
use AntChain\ATO\Models\InitInnerFundmngmerchantpromiseResponse;
use AntChain\ATO\Models\ListInnerSceneproductmerchantRequest;
use AntChain\ATO\Models\ListInnerSceneproductmerchantResponse;
use AntChain\ATO\Models\ListInnerTemplateRequest;
use AntChain\ATO\Models\ListInnerTemplateResponse;
use AntChain\ATO\Models\NotifyFundFlowRequest;
use AntChain\ATO\Models\NotifyFundFlowResponse;
use AntChain\ATO\Models\OnlineInnerSceneproductRequest;
use AntChain\ATO\Models\OnlineInnerSceneproductResponse;
use AntChain\ATO\Models\OperateInnerAgreementterminateRequest;
use AntChain\ATO\Models\OperateInnerAgreementterminateResponse;
use AntChain\ATO\Models\OperateInnerAgreementterminatezfbdirectRequest;
use AntChain\ATO\Models\OperateInnerAgreementterminatezfbdirectResponse;
use AntChain\ATO\Models\OperateInnerKnowledgecategoryRequest;
use AntChain\ATO\Models\OperateInnerKnowledgecategoryResponse;
use AntChain\ATO\Models\OperateInnerSceneproductmerchantRequest;
use AntChain\ATO\Models\OperateInnerSceneproductmerchantResponse;
use AntChain\ATO\Models\OperateKnowledgeCategoryRequest;
use AntChain\ATO\Models\OperateKnowledgeCategoryResponse;
use AntChain\ATO\Models\PagequeryInnerAgreementterminateRequest;
use AntChain\ATO\Models\PagequeryInnerAgreementterminateResponse;
use AntChain\ATO\Models\PagequeryInnerCompanyinfoRequest;
use AntChain\ATO\Models\PagequeryInnerCompanyinfoResponse;
use AntChain\ATO\Models\PagequeryInnerCustomerserviceRequest;
use AntChain\ATO\Models\PagequeryInnerCustomerserviceResponse;
use AntChain\ATO\Models\PagequeryInnerDatadownloadRequest;
use AntChain\ATO\Models\PagequeryInnerDatadownloadResponse;
use AntChain\ATO\Models\PagequeryInnerFunddividerelationRequest;
use AntChain\ATO\Models\PagequeryInnerFunddividerelationResponse;
use AntChain\ATO\Models\PagequeryInnerFundmngbatchloanRequest;
use AntChain\ATO\Models\PagequeryInnerFundmngbatchloanResponse;
use AntChain\ATO\Models\PagequeryInnerFundmngdatadownloadRequest;
use AntChain\ATO\Models\PagequeryInnerFundmngdatadownloadResponse;
use AntChain\ATO\Models\PagequeryInnerFundmngfinanceorderRequest;
use AntChain\ATO\Models\PagequeryInnerFundmngfinanceorderResponse;
use AntChain\ATO\Models\PagequeryInnerFundmngpendingeventRequest;
use AntChain\ATO\Models\PagequeryInnerFundmngpendingeventResponse;
use AntChain\ATO\Models\PagequeryInnerInsureorderRequest;
use AntChain\ATO\Models\PagequeryInnerInsureorderResponse;
use AntChain\ATO\Models\PagequeryInnerKnowledgecategoryRequest;
use AntChain\ATO\Models\PagequeryInnerKnowledgecategoryResponse;
use AntChain\ATO\Models\PagequeryInnerMerchantagentRequest;
use AntChain\ATO\Models\PagequeryInnerMerchantagentResponse;
use AntChain\ATO\Models\PagequeryInnerMerchantagreementRequest;
use AntChain\ATO\Models\PagequeryInnerMerchantagreementResponse;
use AntChain\ATO\Models\PagequeryInnerNoticeRequest;
use AntChain\ATO\Models\PagequeryInnerNoticeResponse;
use AntChain\ATO\Models\PagequeryInnerOrdermsgRequest;
use AntChain\ATO\Models\PagequeryInnerOrdermsgResponse;
use AntChain\ATO\Models\PagequeryInnerOrderRequest;
use AntChain\ATO\Models\PagequeryInnerOrderResponse;
use AntChain\ATO\Models\PagequeryInnerPendingeventRequest;
use AntChain\ATO\Models\PagequeryInnerPendingeventResponse;
use AntChain\ATO\Models\PagequeryInnerPlatformorderleadRequest;
use AntChain\ATO\Models\PagequeryInnerPlatformorderleadResponse;
use AntChain\ATO\Models\PagequeryInnerPlatformproductRequest;
use AntChain\ATO\Models\PagequeryInnerPlatformproductResponse;
use AntChain\ATO\Models\PagequeryInnerProductRequest;
use AntChain\ATO\Models\PagequeryInnerProductResponse;
use AntChain\ATO\Models\PagequeryInnerPromotionsceneRequest;
use AntChain\ATO\Models\PagequeryInnerPromotionsceneResponse;
use AntChain\ATO\Models\PagequeryInnerSceneproductRequest;
use AntChain\ATO\Models\PagequeryInnerSceneproductResponse;
use AntChain\ATO\Models\PagequeryKnowledgeCategoryRequest;
use AntChain\ATO\Models\PagequeryKnowledgeCategoryResponse;
use AntChain\ATO\Models\PauseTradeUserpromiseRequest;
use AntChain\ATO\Models\PauseTradeUserpromiseResponse;
use AntChain\ATO\Models\PreviewInnerFundmngbatchloanRequest;
use AntChain\ATO\Models\PreviewInnerFundmngbatchloanResponse;
use AntChain\ATO\Models\PreviewInnerTemplateRequest;
use AntChain\ATO\Models\PreviewInnerTemplateResponse;
use AntChain\ATO\Models\PublishInnerTemplateRequest;
use AntChain\ATO\Models\PublishInnerTemplateResponse;
use AntChain\ATO\Models\QueryFundAssertorderRequest;
use AntChain\ATO\Models\QueryFundAssertorderResponse;
use AntChain\ATO\Models\QueryFundAssertreportRequest;
use AntChain\ATO\Models\QueryFundAssertreportResponse;
use AntChain\ATO\Models\QueryFundAssetpackageRequest;
use AntChain\ATO\Models\QueryFundAssetpackageResponse;
use AntChain\ATO\Models\QueryFundCompensateaccountRequest;
use AntChain\ATO\Models\QueryFundCompensateaccountResponse;
use AntChain\ATO\Models\QueryFundCreditauthRequest;
use AntChain\ATO\Models\QueryFundCreditauthResponse;
use AntChain\ATO\Models\QueryFundCreditgrantingRequest;
use AntChain\ATO\Models\QueryFundCreditgrantingResponse;
use AntChain\ATO\Models\QueryFundCreditRequest;
use AntChain\ATO\Models\QueryFundCreditResponse;
use AntChain\ATO\Models\QueryFundDividerelationRequest;
use AntChain\ATO\Models\QueryFundDividerelationResponse;
use AntChain\ATO\Models\QueryInnerAgreementterminateconfigRequest;
use AntChain\ATO\Models\QueryInnerAgreementterminateconfigResponse;
use AntChain\ATO\Models\QueryInnerAgreementterminateorderRequest;
use AntChain\ATO\Models\QueryInnerAgreementterminateorderResponse;
use AntChain\ATO\Models\QueryInnerAuthagreementRequest;
use AntChain\ATO\Models\QueryInnerAuthagreementResponse;
use AntChain\ATO\Models\QueryInnerAuthorizationRequest;
use AntChain\ATO\Models\QueryInnerAuthorizationResponse;
use AntChain\ATO\Models\QueryInnerExpandprocessRequest;
use AntChain\ATO\Models\QueryInnerExpandprocessResponse;
use AntChain\ATO\Models\QueryInnerFunddividerelationRequest;
use AntChain\ATO\Models\QueryInnerFunddividerelationResponse;
use AntChain\ATO\Models\QueryInnerFundmngaccountinfoRequest;
use AntChain\ATO\Models\QueryInnerFundmngaccountinfoResponse;
use AntChain\ATO\Models\QueryInnerFundmngcreditRequest;
use AntChain\ATO\Models\QueryInnerFundmngcreditResponse;
use AntChain\ATO\Models\QueryInnerFundmngdemoRequest;
use AntChain\ATO\Models\QueryInnerFundmngdemoResponse;
use AntChain\ATO\Models\QueryInnerFundmngguaranteeinfoRequest;
use AntChain\ATO\Models\QueryInnerFundmngguaranteeinfoResponse;
use AntChain\ATO\Models\QueryInnerFundmngloanapplyRequest;
use AntChain\ATO\Models\QueryInnerFundmngloanapplyResponse;
use AntChain\ATO\Models\QueryInnerFundmngmerchantpayitemRequest;
use AntChain\ATO\Models\QueryInnerFundmngmerchantpayitemResponse;
use AntChain\ATO\Models\QueryInnerFundmngmerchantperformanceRequest;
use AntChain\ATO\Models\QueryInnerFundmngmerchantperformanceResponse;
use AntChain\ATO\Models\QueryInnerInsuresignRequest;
use AntChain\ATO\Models\QueryInnerInsuresignResponse;
use AntChain\ATO\Models\QueryInnerKnowledgebaseinfoRequest;
use AntChain\ATO\Models\QueryInnerKnowledgebaseinfoResponse;
use AntChain\ATO\Models\QueryInnerKnowledgecategorylibraryRequest;
use AntChain\ATO\Models\QueryInnerKnowledgecategorylibraryResponse;
use AntChain\ATO\Models\QueryInnerLoggerRequest;
use AntChain\ATO\Models\QueryInnerLoggerResponse;
use AntChain\ATO\Models\QueryInnerMerchantagreementRequest;
use AntChain\ATO\Models\QueryInnerMerchantagreementResponse;
use AntChain\ATO\Models\QueryInnerMerchantpayexpandRequest;
use AntChain\ATO\Models\QueryInnerMerchantpayexpandResponse;
use AntChain\ATO\Models\QueryInnerSaleschannelRequest;
use AntChain\ATO\Models\QueryInnerSaleschannelResponse;
use AntChain\ATO\Models\QueryInnerSignfieldsRequest;
use AntChain\ATO\Models\QueryInnerSignfieldsResponse;
use AntChain\ATO\Models\QueryInnerSupplementalRequest;
use AntChain\ATO\Models\QueryInnerSupplementalResponse;
use AntChain\ATO\Models\QueryInnerTemplateelementlinkRequest;
use AntChain\ATO\Models\QueryInnerTemplateelementlinkResponse;
use AntChain\ATO\Models\QueryInnerTemplateimageRequest;
use AntChain\ATO\Models\QueryInnerTemplateimageResponse;
use AntChain\ATO\Models\QueryInnerTemplateinstanceRequest;
use AntChain\ATO\Models\QueryInnerTemplateinstanceResponse;
use AntChain\ATO\Models\QueryInnerTemplateRequest;
use AntChain\ATO\Models\QueryInnerTemplateResponse;
use AntChain\ATO\Models\QueryInnerTemplateversionRequest;
use AntChain\ATO\Models\QueryInnerTemplateversionResponse;
use AntChain\ATO\Models\QueryInnerTenantaccountinfoRequest;
use AntChain\ATO\Models\QueryInnerTenantaccountinfoResponse;
use AntChain\ATO\Models\QueryInnerTenantindirectmainclassRequest;
use AntChain\ATO\Models\QueryInnerTenantindirectmainclassResponse;
use AntChain\ATO\Models\QueryInnerWithholdplanRequest;
use AntChain\ATO\Models\QueryInnerWithholdplanResponse;
use AntChain\ATO\Models\QueryInnerWithholdsignRequest;
use AntChain\ATO\Models\QueryInnerWithholdsignResponse;
use AntChain\ATO\Models\QueryInsureRequest;
use AntChain\ATO\Models\QueryInsureResponse;
use AntChain\ATO\Models\QueryJdFunddividerelationRequest;
use AntChain\ATO\Models\QueryJdFunddividerelationResponse;
use AntChain\ATO\Models\QueryKnowledgeBaseinfoRequest;
use AntChain\ATO\Models\QueryKnowledgeBaseinfoResponse;
use AntChain\ATO\Models\QueryKnowledgeCategorylibraryRequest;
use AntChain\ATO\Models\QueryKnowledgeCategorylibraryResponse;
use AntChain\ATO\Models\QueryMerchantexpandDividerelationRequest;
use AntChain\ATO\Models\QueryMerchantexpandDividerelationResponse;
use AntChain\ATO\Models\QueryMerchantexpandMerchantRequest;
use AntChain\ATO\Models\QueryMerchantexpandMerchantResponse;
use AntChain\ATO\Models\QueryRealpersonFacevrfRequest;
use AntChain\ATO\Models\QueryRealpersonFacevrfResponse;
use AntChain\ATO\Models\QueryRiskGoRequest;
use AntChain\ATO\Models\QueryRiskGoResponse;
use AntChain\ATO\Models\QueryRiskRequest;
use AntChain\ATO\Models\QueryRiskResponse;
use AntChain\ATO\Models\QuerySignCreditRequest;
use AntChain\ATO\Models\QuerySignCreditResponse;
use AntChain\ATO\Models\QueryWithholdActivepayRequest;
use AntChain\ATO\Models\QueryWithholdActivepayResponse;
use AntChain\ATO\Models\QueryWithholdCompensateaccountRequest;
use AntChain\ATO\Models\QueryWithholdCompensateaccountResponse;
use AntChain\ATO\Models\QueryWithholdRefundRequest;
use AntChain\ATO\Models\QueryWithholdRefundResponse;
use AntChain\ATO\Models\QueryWithholdSignRequest;
use AntChain\ATO\Models\QueryWithholdSignResponse;
use AntChain\ATO\Models\ReclaimInnerPlatformproductRequest;
use AntChain\ATO\Models\ReclaimInnerPlatformproductResponse;
use AntChain\ATO\Models\RedeemInnerFundmngmerchantperformanceRequest;
use AntChain\ATO\Models\RedeemInnerFundmngmerchantperformanceResponse;
use AntChain\ATO\Models\RefreshInnerTemplatetokenRequest;
use AntChain\ATO\Models\RefreshInnerTemplatetokenResponse;
use AntChain\ATO\Models\RefuseFundFlowRequest;
use AntChain\ATO\Models\RefuseFundFlowResponse;
use AntChain\ATO\Models\RegisterMerchantexpandMerchantRequest;
use AntChain\ATO\Models\RegisterMerchantexpandMerchantResponse;
use AntChain\ATO\Models\RenderInnerFundmngmerchantpromiseRequest;
use AntChain\ATO\Models\RenderInnerFundmngmerchantpromiseResponse;
use AntChain\ATO\Models\RenderInnerTemplateinstanceRequest;
use AntChain\ATO\Models\RenderInnerTemplateinstanceResponse;
use AntChain\ATO\Models\RepayFundPlanRequest;
use AntChain\ATO\Models\RepayFundPlanResponse;
use AntChain\ATO\Models\RepayInnerFundmngmerchantperformanceRequest;
use AntChain\ATO\Models\RepayInnerFundmngmerchantperformanceResponse;
use AntChain\ATO\Models\RepayWithholdPlanRequest;
use AntChain\ATO\Models\RepayWithholdPlanResponse;
use AntChain\ATO\Models\ReplaceTradeUserpromiseRequest;
use AntChain\ATO\Models\ReplaceTradeUserpromiseResponse;
use AntChain\ATO\Models\ResumeTradeUserpromiseRequest;
use AntChain\ATO\Models\ResumeTradeUserpromiseResponse;
use AntChain\ATO\Models\RetryInnerOrdermsgRequest;
use AntChain\ATO\Models\RetryInnerOrdermsgResponse;
use AntChain\ATO\Models\RetryInsurePayRequest;
use AntChain\ATO\Models\RetryInsurePayResponse;
use AntChain\ATO\Models\RetryWithholdDividependingRequest;
use AntChain\ATO\Models\RetryWithholdDividependingResponse;
use AntChain\ATO\Models\RetryWithholdPlanpendingRequest;
use AntChain\ATO\Models\RetryWithholdPlanpendingResponse;
use AntChain\ATO\Models\RetryWithholdPlanRequest;
use AntChain\ATO\Models\RetryWithholdPlanResponse;
use AntChain\ATO\Models\SaveInnerAgentcustomerserviceRequest;
use AntChain\ATO\Models\SaveInnerAgentcustomerserviceResponse;
use AntChain\ATO\Models\SaveInnerPlatformorderleadRequest;
use AntChain\ATO\Models\SaveInnerPlatformorderleadResponse;
use AntChain\ATO\Models\SaveInnerSignfieldsRequest;
use AntChain\ATO\Models\SaveInnerSignfieldsResponse;
use AntChain\ATO\Models\SaveInnerTemplateRequest;
use AntChain\ATO\Models\SaveInnerTemplateResponse;
use AntChain\ATO\Models\SetInnerPlatformproductRequest;
use AntChain\ATO\Models\SetInnerPlatformproductResponse;
use AntChain\ATO\Models\SignInnerAuthorizationRequest;
use AntChain\ATO\Models\SignInnerAuthorizationResponse;
use AntChain\ATO\Models\SignInnerSupplementalRequest;
use AntChain\ATO\Models\SignInnerSupplementalResponse;
use AntChain\ATO\Models\SubmitFrontSignRequest;
use AntChain\ATO\Models\SubmitFrontSignResponse;
use AntChain\ATO\Models\SubmitFundFlowRequest;
use AntChain\ATO\Models\SubmitFundFlowResponse;
use AntChain\ATO\Models\SubmitInnerDatadownloadRequest;
use AntChain\ATO\Models\SubmitInnerDatadownloadResponse;
use AntChain\ATO\Models\SubmitInnerFunddividerelationRequest;
use AntChain\ATO\Models\SubmitInnerFunddividerelationResponse;
use AntChain\ATO\Models\SubmitInnerFundmngbatchloanRequest;
use AntChain\ATO\Models\SubmitInnerFundmngbatchloanResponse;
use AntChain\ATO\Models\SubmitInnerFundmngdatadownloadRequest;
use AntChain\ATO\Models\SubmitInnerFundmngdatadownloadResponse;
use AntChain\ATO\Models\SubmitInnerFundmngpendingeventRequest;
use AntChain\ATO\Models\SubmitInnerFundmngpendingeventResponse;
use AntChain\ATO\Models\SubmitInnerKnowledgebaseinfoRequest;
use AntChain\ATO\Models\SubmitInnerKnowledgebaseinfoResponse;
use AntChain\ATO\Models\SubmitInnerKnowledgecategoryRequest;
use AntChain\ATO\Models\SubmitInnerKnowledgecategoryResponse;
use AntChain\ATO\Models\SubmitInnerMerchantpayexpandRequest;
use AntChain\ATO\Models\SubmitInnerMerchantpayexpandResponse;
use AntChain\ATO\Models\SubmitInnerPendingeventRequest;
use AntChain\ATO\Models\SubmitInnerPendingeventResponse;
use AntChain\ATO\Models\SubmitInnerPlatformproductRequest;
use AntChain\ATO\Models\SubmitInnerPlatformproductResponse;
use AntChain\ATO\Models\SubmitInnerTemplatesyncreviewRequest;
use AntChain\ATO\Models\SubmitInnerTemplatesyncreviewResponse;
use AntChain\ATO\Models\SubmitKnowledgeBaseinfoRequest;
use AntChain\ATO\Models\SubmitKnowledgeBaseinfoResponse;
use AntChain\ATO\Models\SubmitKnowledgeCategoryRequest;
use AntChain\ATO\Models\SubmitKnowledgeCategoryResponse;
use AntChain\ATO\Models\SubmitSignFlowRequest;
use AntChain\ATO\Models\SubmitSignFlowResponse;
use AntChain\ATO\Models\SyncFrontIndirectorderRequest;
use AntChain\ATO\Models\SyncFrontIndirectorderResponse;
use AntChain\ATO\Models\SyncFrontTradeRequest;
use AntChain\ATO\Models\SyncFrontTradeResponse;
use AntChain\ATO\Models\SyncFundCreditgrantingRequest;
use AntChain\ATO\Models\SyncFundCreditgrantingResponse;
use AntChain\ATO\Models\SyncFundFinanceloanresultsRequest;
use AntChain\ATO\Models\SyncFundFinanceloanresultsResponse;
use AntChain\ATO\Models\SyncFundFinanceprecheckresultRequest;
use AntChain\ATO\Models\SyncFundFinanceprecheckresultResponse;
use AntChain\ATO\Models\SyncFundMerchantpromiseRequest;
use AntChain\ATO\Models\SyncFundMerchantpromiseResponse;
use AntChain\ATO\Models\SyncFundOrderfinancialRequest;
use AntChain\ATO\Models\SyncFundOrderfinancialResponse;
use AntChain\ATO\Models\SyncFundOrderfulfillmentRequest;
use AntChain\ATO\Models\SyncFundOrderfulfillmentResponse;
use AntChain\ATO\Models\SyncFundSplittingRequest;
use AntChain\ATO\Models\SyncFundSplittingResponse;
use AntChain\ATO\Models\SyncFundWithholdingcontractRequest;
use AntChain\ATO\Models\SyncFundWithholdingcontractResponse;
use AntChain\ATO\Models\SyncInnerFundmngloanresultsRequest;
use AntChain\ATO\Models\SyncInnerFundmngloanresultsResponse;
use AntChain\ATO\Models\SyncInnerMeterforagsignRequest;
use AntChain\ATO\Models\SyncInnerMeterforagsignResponse;
use AntChain\ATO\Models\SyncInnerMeterforwholeorderRequest;
use AntChain\ATO\Models\SyncInnerMeterforwholeorderResponse;
use AntChain\ATO\Models\SyncInnerTemplateRequest;
use AntChain\ATO\Models\SyncInnerTemplateResponse;
use AntChain\ATO\Models\SyncTradeFinanceloanapplyRequest;
use AntChain\ATO\Models\SyncTradeFinanceloanapplyResponse;
use AntChain\ATO\Models\SyncTradeIndirectorderRequest;
use AntChain\ATO\Models\SyncTradeIndirectorderResponse;
use AntChain\ATO\Models\SyncTradePlatformorderauditRequest;
use AntChain\ATO\Models\SyncTradePlatformorderauditResponse;
use AntChain\ATO\Models\SyncTradePromoorderinfoRequest;
use AntChain\ATO\Models\SyncTradePromoorderinfoResponse;
use AntChain\ATO\Models\SyncTradeReceiptorderfullinfoRequest;
use AntChain\ATO\Models\SyncTradeReceiptorderfullinfoResponse;
use AntChain\ATO\Models\SyncTradeRequest;
use AntChain\ATO\Models\SyncTradeResponse;
use AntChain\ATO\Models\SyncTradeUserpromisedelayRequest;
use AntChain\ATO\Models\SyncTradeUserpromisedelayResponse;
use AntChain\ATO\Models\TransferBrokerUserdataRequest;
use AntChain\ATO\Models\TransferBrokerUserdataResponse;
use AntChain\ATO\Models\TransferTradeFinanceRequest;
use AntChain\ATO\Models\TransferTradeFinanceResponse;
use AntChain\ATO\Models\UnbindWithholdSignRequest;
use AntChain\ATO\Models\UnbindWithholdSignResponse;
use AntChain\ATO\Models\UpdateInnerCustomerserviceRequest;
use AntChain\ATO\Models\UpdateInnerCustomerserviceResponse;
use AntChain\ATO\Models\UpdateInnerKnowledgecategoryRequest;
use AntChain\ATO\Models\UpdateInnerKnowledgecategoryResponse;
use AntChain\ATO\Models\UpdateInnerMerchantpayexpandRequest;
use AntChain\ATO\Models\UpdateInnerMerchantpayexpandResponse;
use AntChain\ATO\Models\UpdateInnerPromotionsceneRequest;
use AntChain\ATO\Models\UpdateInnerPromotionsceneResponse;
use AntChain\ATO\Models\UpdateInnerSaleschannelRequest;
use AntChain\ATO\Models\UpdateInnerSaleschannelResponse;
use AntChain\ATO\Models\UpdateInnerTemplateRequest;
use AntChain\ATO\Models\UpdateInnerTemplateResponse;
use AntChain\ATO\Models\UpdateInnerTenantindirectmainclassRequest;
use AntChain\ATO\Models\UpdateInnerTenantindirectmainclassResponse;
use AntChain\ATO\Models\UpdateKnowledgeCategoryRequest;
use AntChain\ATO\Models\UpdateKnowledgeCategoryResponse;
use AntChain\ATO\Models\UpdateMerchantexpandMerchantRequest;
use AntChain\ATO\Models\UpdateMerchantexpandMerchantResponse;
use AntChain\ATO\Models\UpdateTradeOrderRequest;
use AntChain\ATO\Models\UpdateTradeOrderResponse;
use AntChain\ATO\Models\UpdateTradeUserpromiseRequest;
use AntChain\ATO\Models\UpdateTradeUserpromiseResponse;
use AntChain\ATO\Models\UploadFundCreditRequest;
use AntChain\ATO\Models\UploadFundCreditResponse;
use AntChain\ATO\Models\UploadFundFlowRequest;
use AntChain\ATO\Models\UploadFundFlowResponse;
use AntChain\ATO\Models\UploadInnerFileRequest;
use AntChain\ATO\Models\UploadInnerFileResponse;
use AntChain\ATO\Models\UploadInnerRiskcallRequest;
use AntChain\ATO\Models\UploadInnerRiskcallResponse;
use AntChain\ATO\Models\UploadMerchantexpandFileRequest;
use AntChain\ATO\Models\UploadMerchantexpandFileResponse;
use AntChain\ATO\Models\UploadSignCreditRequest;
use AntChain\ATO\Models\UploadSignCreditResponse;
use AntChain\ATO\Models\UploadSignFlowRequest;
use AntChain\ATO\Models\UploadSignFlowResponse;
use AntChain\ATO\Models\UploadSignTemplateRequest;
use AntChain\ATO\Models\UploadSignTemplateResponse;
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
            // 商品规格选项
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
                    'sdk_version'      => '1.16.66',
                    '_prod_code'       => 'ATO',
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
     * Description: 数据提供方可以通过此接口传输数据，触达给消费方
     * Summary: 用户信息传输代理.
     *
     * @param TransferBrokerUserdataRequest $request
     *
     * @return TransferBrokerUserdataResponse
     */
    public function transferBrokerUserdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->transferBrokerUserdataEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据提供方可以通过此接口传输数据，触达给消费方
     * Summary: 用户信息传输代理.
     *
     * @param TransferBrokerUserdataRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return TransferBrokerUserdataResponse
     */
    public function transferBrokerUserdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return TransferBrokerUserdataResponse::fromMap($this->doRequest('1.0', 'antchain.ato.broker.userdata.transfer', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 京东分账关系绑定创建/更新
     * Summary: 京东分账关系绑定创建/更新.
     *
     * @param CreateJdFunddividerelationRequest $request
     *
     * @return CreateJdFunddividerelationResponse
     */
    public function createJdFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createJdFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 京东分账关系绑定创建/更新
     * Summary: 京东分账关系绑定创建/更新.
     *
     * @param CreateJdFunddividerelationRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateJdFunddividerelationResponse
     */
    public function createJdFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateJdFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.jd.funddividerelation.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询京东支付分账关系绑定状态
     * Summary: 查询京东支付分账关系绑定状态
     *
     * @param QueryJdFunddividerelationRequest $request
     *
     * @return QueryJdFunddividerelationResponse
     */
    public function queryJdFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryJdFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询京东支付分账关系绑定状态
     * Summary: 查询京东支付分账关系绑定状态
     *
     * @param QueryJdFunddividerelationRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryJdFunddividerelationResponse
     */
    public function queryJdFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryJdFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.jd.funddividerelation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方管理系统demo
     * Summary: 资方管理系统demo.
     *
     * @param QueryInnerFundmngdemoRequest $request
     *
     * @return QueryInnerFundmngdemoResponse
     */
    public function queryInnerFundmngdemo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerFundmngdemoEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方管理系统demo
     * Summary: 资方管理系统demo.
     *
     * @param QueryInnerFundmngdemoRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryInnerFundmngdemoResponse
     */
    public function queryInnerFundmngdemoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerFundmngdemoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngdemo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方管理系统融资订单列表
     * Summary: 资方管理系统融资订单列表.
     *
     * @param PagequeryInnerFundmngfinanceorderRequest $request
     *
     * @return PagequeryInnerFundmngfinanceorderResponse
     */
    public function pagequeryInnerFundmngfinanceorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerFundmngfinanceorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方管理系统融资订单列表
     * Summary: 资方管理系统融资订单列表.
     *
     * @param PagequeryInnerFundmngfinanceorderRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return PagequeryInnerFundmngfinanceorderResponse
     */
    public function pagequeryInnerFundmngfinanceorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerFundmngfinanceorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngfinanceorder.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方免研系分设计-提交数据下载申请
     * Summary: 资方免研-提交数据下载申请.
     *
     * @param SubmitInnerFundmngdatadownloadRequest $request
     *
     * @return SubmitInnerFundmngdatadownloadResponse
     */
    public function submitInnerFundmngdatadownload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerFundmngdatadownloadEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方免研系分设计-提交数据下载申请
     * Summary: 资方免研-提交数据下载申请.
     *
     * @param SubmitInnerFundmngdatadownloadRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return SubmitInnerFundmngdatadownloadResponse
     */
    public function submitInnerFundmngdatadownloadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerFundmngdatadownloadResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngdatadownload.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方免研-查询数据下载列表
     * Summary: 资方免研-查询数据下载列表.
     *
     * @param PagequeryInnerFundmngdatadownloadRequest $request
     *
     * @return PagequeryInnerFundmngdatadownloadResponse
     */
    public function pagequeryInnerFundmngdatadownload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerFundmngdatadownloadEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方免研-查询数据下载列表
     * Summary: 资方免研-查询数据下载列表.
     *
     * @param PagequeryInnerFundmngdatadownloadRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return PagequeryInnerFundmngdatadownloadResponse
     */
    public function pagequeryInnerFundmngdatadownloadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerFundmngdatadownloadResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngdatadownload.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方免研-删除下载任务
     * Summary: 资方免研-删除下载任务
     *
     * @param DeleteInnerFundmngdatadownloadRequest $request
     *
     * @return DeleteInnerFundmngdatadownloadResponse
     */
    public function deleteInnerFundmngdatadownload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteInnerFundmngdatadownloadEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方免研-删除下载任务
     * Summary: 资方免研-删除下载任务
     *
     * @param DeleteInnerFundmngdatadownloadRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return DeleteInnerFundmngdatadownloadResponse
     */
    public function deleteInnerFundmngdatadownloadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteInnerFundmngdatadownloadResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngdatadownload.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户付款项目查询
     * Summary: 商户付款项目查询.
     *
     * @param QueryInnerFundmngmerchantpayitemRequest $request
     *
     * @return QueryInnerFundmngmerchantpayitemResponse
     */
    public function queryInnerFundmngmerchantpayitem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerFundmngmerchantpayitemEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户付款项目查询
     * Summary: 商户付款项目查询.
     *
     * @param QueryInnerFundmngmerchantpayitemRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryInnerFundmngmerchantpayitemResponse
     */
    public function queryInnerFundmngmerchantpayitemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerFundmngmerchantpayitemResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngmerchantpayitem.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约承诺创建
     * Summary: 商户履约承诺创建.
     *
     * @param CreateInnerFundmngmerchantpromiseRequest $request
     *
     * @return CreateInnerFundmngmerchantpromiseResponse
     */
    public function createInnerFundmngmerchantpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerFundmngmerchantpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约承诺创建
     * Summary: 商户履约承诺创建.
     *
     * @param CreateInnerFundmngmerchantpromiseRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return CreateInnerFundmngmerchantpromiseResponse
     */
    public function createInnerFundmngmerchantpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerFundmngmerchantpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngmerchantpromise.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方放款申请查询
     * Summary: 资方放款申请查询.
     *
     * @param QueryInnerFundmngloanapplyRequest $request
     *
     * @return QueryInnerFundmngloanapplyResponse
     */
    public function queryInnerFundmngloanapply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerFundmngloanapplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方放款申请查询
     * Summary: 资方放款申请查询.
     *
     * @param QueryInnerFundmngloanapplyRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryInnerFundmngloanapplyResponse
     */
    public function queryInnerFundmngloanapplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerFundmngloanapplyResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngloanapply.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方账户信息查询
     * Summary: 资方账户信息查询.
     *
     * @param QueryInnerFundmngaccountinfoRequest $request
     *
     * @return QueryInnerFundmngaccountinfoResponse
     */
    public function queryInnerFundmngaccountinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerFundmngaccountinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方账户信息查询
     * Summary: 资方账户信息查询.
     *
     * @param QueryInnerFundmngaccountinfoRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryInnerFundmngaccountinfoResponse
     */
    public function queryInnerFundmngaccountinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerFundmngaccountinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngaccountinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 放款结果同步
     * Summary: 放款结果同步.
     *
     * @param SyncInnerFundmngloanresultsRequest $request
     *
     * @return SyncInnerFundmngloanresultsResponse
     */
    public function syncInnerFundmngloanresults($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerFundmngloanresultsEx($request, $headers, $runtime);
    }

    /**
     * Description: 放款结果同步
     * Summary: 放款结果同步.
     *
     * @param SyncInnerFundmngloanresultsRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SyncInnerFundmngloanresultsResponse
     */
    public function syncInnerFundmngloanresultsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerFundmngloanresultsResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngloanresults.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
     * Summary: 资产凭证创建.
     *
     * @param CreateInnerFundmngcreditRequest $request
     *
     * @return CreateInnerFundmngcreditResponse
     */
    public function createInnerFundmngcredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerFundmngcreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建资产凭证，支持上传文件并绑定到订单，或创建文本。
     * Summary: 资产凭证创建.
     *
     * @param CreateInnerFundmngcreditRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateInnerFundmngcreditResponse
     */
    public function createInnerFundmngcreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerFundmngcreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngcredit.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可以根据订单号查询资产凭证信息
     * Summary: 资产凭证查询.
     *
     * @param QueryInnerFundmngcreditRequest $request
     *
     * @return QueryInnerFundmngcreditResponse
     */
    public function queryInnerFundmngcredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerFundmngcreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 可以根据订单号查询资产凭证信息
     * Summary: 资产凭证查询.
     *
     * @param QueryInnerFundmngcreditRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryInnerFundmngcreditResponse
     */
    public function queryInnerFundmngcreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerFundmngcreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngcredit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
     * Summary: 资方管理系统订单详情查询.
     *
     * @param DetailInnerFundmngorderRequest $request
     *
     * @return DetailInnerFundmngorderResponse
     */
    public function detailInnerFundmngorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerFundmngorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方管理系统订单详情查询，包含订单信息、用户信息、商品信息等
     * Summary: 资方管理系统订单详情查询.
     *
     * @param DetailInnerFundmngorderRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DetailInnerFundmngorderResponse
     */
    public function detailInnerFundmngorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerFundmngorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngorder.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: （资方控制台）商户履约查询
     * Summary: 商户履约查询(资方控制台).
     *
     * @param QueryInnerFundmngmerchantperformanceRequest $request
     *
     * @return QueryInnerFundmngmerchantperformanceResponse
     */
    public function queryInnerFundmngmerchantperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerFundmngmerchantperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: （资方控制台）商户履约查询
     * Summary: 商户履约查询(资方控制台).
     *
     * @param QueryInnerFundmngmerchantperformanceRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return QueryInnerFundmngmerchantperformanceResponse
     */
    public function queryInnerFundmngmerchantperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerFundmngmerchantperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngmerchantperformance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用说明：
     * 1. 当商户通过其他方式还款后，通过此接口同步信息，同步完成后会将扣款进行取消
     * Summary: 资方控制台商户履约其他方式还款.
     *
     * @param RepayInnerFundmngmerchantperformanceRequest $request
     *
     * @return RepayInnerFundmngmerchantperformanceResponse
     */
    public function repayInnerFundmngmerchantperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayInnerFundmngmerchantperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用说明：
     * 1. 当商户通过其他方式还款后，通过此接口同步信息，同步完成后会将扣款进行取消
     * Summary: 资方控制台商户履约其他方式还款.
     *
     * @param RepayInnerFundmngmerchantperformanceRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return RepayInnerFundmngmerchantperformanceResponse
     */
    public function repayInnerFundmngmerchantperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayInnerFundmngmerchantperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngmerchantperformance.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方调用，赎回商户履约
     * Summary: 资方控制台商户履约赎回.
     *
     * @param RedeemInnerFundmngmerchantperformanceRequest $request
     *
     * @return RedeemInnerFundmngmerchantperformanceResponse
     */
    public function redeemInnerFundmngmerchantperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->redeemInnerFundmngmerchantperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方调用，赎回商户履约
     * Summary: 资方控制台商户履约赎回.
     *
     * @param RedeemInnerFundmngmerchantperformanceRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return RedeemInnerFundmngmerchantperformanceResponse
     */
    public function redeemInnerFundmngmerchantperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RedeemInnerFundmngmerchantperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngmerchantperformance.redeem', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方控制台提交批量放款
     * Summary: 资方控制台提交批量放款.
     *
     * @param SubmitInnerFundmngbatchloanRequest $request
     *
     * @return SubmitInnerFundmngbatchloanResponse
     */
    public function submitInnerFundmngbatchloan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerFundmngbatchloanEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方控制台提交批量放款
     * Summary: 资方控制台提交批量放款.
     *
     * @param SubmitInnerFundmngbatchloanRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SubmitInnerFundmngbatchloanResponse
     */
    public function submitInnerFundmngbatchloanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerFundmngbatchloanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngbatchloan.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方控制台批量放款提交前预览
     * Summary: 资方控制台批量放款提交前预览.
     *
     * @param PreviewInnerFundmngbatchloanRequest $request
     *
     * @return PreviewInnerFundmngbatchloanResponse
     */
    public function previewInnerFundmngbatchloan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->previewInnerFundmngbatchloanEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方控制台批量放款提交前预览
     * Summary: 资方控制台批量放款提交前预览.
     *
     * @param PreviewInnerFundmngbatchloanRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return PreviewInnerFundmngbatchloanResponse
     */
    public function previewInnerFundmngbatchloanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PreviewInnerFundmngbatchloanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngbatchloan.preview', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方控制台批量放款记录分页查询
     * Summary: 资方控制台批量放款记录分页查询.
     *
     * @param PagequeryInnerFundmngbatchloanRequest $request
     *
     * @return PagequeryInnerFundmngbatchloanResponse
     */
    public function pagequeryInnerFundmngbatchloan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerFundmngbatchloanEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方控制台批量放款记录分页查询
     * Summary: 资方控制台批量放款记录分页查询.
     *
     * @param PagequeryInnerFundmngbatchloanRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return PagequeryInnerFundmngbatchloanResponse
     */
    public function pagequeryInnerFundmngbatchloanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerFundmngbatchloanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngbatchloan.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解析资方上传的商户履约计划文件，渲染在免研控制台页面
     * Summary: 商户履约计划渲染.
     *
     * @param RenderInnerFundmngmerchantpromiseRequest $request
     *
     * @return RenderInnerFundmngmerchantpromiseResponse
     */
    public function renderInnerFundmngmerchantpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->renderInnerFundmngmerchantpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 解析资方上传的商户履约计划文件，渲染在免研控制台页面
     * Summary: 商户履约计划渲染.
     *
     * @param RenderInnerFundmngmerchantpromiseRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return RenderInnerFundmngmerchantpromiseResponse
     */
    public function renderInnerFundmngmerchantpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RenderInnerFundmngmerchantpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngmerchantpromise.render', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约计划初始化
     * Summary: 商户履约计划初始化.
     *
     * @param InitInnerFundmngmerchantpromiseRequest $request
     *
     * @return InitInnerFundmngmerchantpromiseResponse
     */
    public function initInnerFundmngmerchantpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initInnerFundmngmerchantpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约计划初始化
     * Summary: 商户履约计划初始化.
     *
     * @param InitInnerFundmngmerchantpromiseRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return InitInnerFundmngmerchantpromiseResponse
     */
    public function initInnerFundmngmerchantpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitInnerFundmngmerchantpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngmerchantpromise.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方待办事件处理
     * Summary: 资方待办事件处理.
     *
     * @param SubmitInnerFundmngpendingeventRequest $request
     *
     * @return SubmitInnerFundmngpendingeventResponse
     */
    public function submitInnerFundmngpendingevent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerFundmngpendingeventEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方待办事件处理
     * Summary: 资方待办事件处理.
     *
     * @param SubmitInnerFundmngpendingeventRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return SubmitInnerFundmngpendingeventResponse
     */
    public function submitInnerFundmngpendingeventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerFundmngpendingeventResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngpendingevent.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方待办事件查询
     * Summary: 资方待办事件查询.
     *
     * @param PagequeryInnerFundmngpendingeventRequest $request
     *
     * @return PagequeryInnerFundmngpendingeventResponse
     */
    public function pagequeryInnerFundmngpendingevent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerFundmngpendingeventEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方待办事件查询
     * Summary: 资方待办事件查询.
     *
     * @param PagequeryInnerFundmngpendingeventRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return PagequeryInnerFundmngpendingeventResponse
     */
    public function pagequeryInnerFundmngpendingeventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerFundmngpendingeventResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngpendingevent.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询担保方信息
     * Summary: 查询担保方信息.
     *
     * @param QueryInnerFundmngguaranteeinfoRequest $request
     *
     * @return QueryInnerFundmngguaranteeinfoResponse
     */
    public function queryInnerFundmngguaranteeinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerFundmngguaranteeinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询担保方信息
     * Summary: 查询担保方信息.
     *
     * @param QueryInnerFundmngguaranteeinfoRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryInnerFundmngguaranteeinfoResponse
     */
    public function queryInnerFundmngguaranteeinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerFundmngguaranteeinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.fundmngguaranteeinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步.
     *
     * @param SyncFundSplittingRequest $request
     *
     * @return SyncFundSplittingResponse
     */
    public function syncFundSplitting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundSplittingEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账流水同步
     * Summary: 【仅测试环境生效】分账流水同步.
     *
     * @param SyncFundSplittingRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SyncFundSplittingResponse
     */
    public function syncFundSplittingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundSplittingResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步.
     *
     * @param SyncFundOrderfinancialRequest $request
     *
     * @return SyncFundOrderfinancialResponse
     */
    public function syncFundOrderfinancial($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundOrderfinancialEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给融资资金方，用以订单融资结果同步
     * Summary: 【废弃】订单融资结果同步.
     *
     * @param SyncFundOrderfinancialRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncFundOrderfinancialResponse
     */
    public function syncFundOrderfinancialEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundOrderfinancialResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议.
     *
     * @param SyncFundWithholdingcontractRequest $request
     *
     * @return SyncFundWithholdingcontractResponse
     */
    public function syncFundWithholdingcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundWithholdingcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步租赁订单的代扣协议
     * Summary: 【仅测试环境生效】同步租赁订单的代扣协议.
     *
     * @param SyncFundWithholdingcontractRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SyncFundWithholdingcontractResponse
     */
    public function syncFundWithholdingcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundWithholdingcontractResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息.
     *
     * @param SyncFundOrderfulfillmentRequest $request
     *
     * @return SyncFundOrderfulfillmentResponse
     */
    public function syncFundOrderfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundOrderfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方回传一条订单还款履约信息
     * Summary: 【仅测试环境生效】同步订单还款履约信息.
     *
     * @param SyncFundOrderfulfillmentRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SyncFundOrderfulfillmentResponse
     */
    public function syncFundOrderfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundOrderfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息.
     *
     * @param GetFundOrderfulfillmentRequest $request
     *
     * @return GetFundOrderfulfillmentResponse
     */
    public function getFundOrderfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundOrderfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取订单的履约信息
     * Summary: 【仅测试环境生效】获取订单的履约信息.
     *
     * @param GetFundOrderfulfillmentRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetFundOrderfulfillmentResponse
     */
    public function getFundOrderfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundOrderfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口.
     *
     * @param UploadFundFlowRequest $request
     *
     * @return UploadFundFlowResponse
     */
    public function uploadFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传
     * Summary: 资方合同文件上传接口.
     *
     * @param UploadFundFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UploadFundFlowResponse
     */
    public function uploadFundFlowEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.ato.fund.flow.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadFundFlowResponse([
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

        return UploadFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口.
     *
     * @param GetFundFlowRequest $request
     *
     * @return GetFundFlowResponse
     */
    public function getFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取商户签署后的合同文件，用于资方签署落章
     * Summary: 资方合同文件获取接口.
     *
     * @param GetFundFlowRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetFundFlowResponse
     */
    public function getFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知.
     *
     * @param RefuseFundFlowRequest $request
     *
     * @return RefuseFundFlowResponse
     */
    public function refuseFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
     * Summary: 资方合同签署状态通知.
     *
     * @param RefuseFundFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RefuseFundFlowResponse
     */
    public function refuseFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方合同落签
     * Summary: 资方合同落签.
     *
     * @param AuthFundFlowRequest $request
     *
     * @return AuthFundFlowResponse
     */
    public function authFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方合同落签
     * Summary: 资方合同落签.
     *
     * @param AuthFundFlowRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AuthFundFlowResponse
     */
    public function authFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消.
     *
     * @param CancelFundPlanRequest $request
     *
     * @return CancelFundPlanResponse
     */
    public function cancelFundPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelFundPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方调用，取消商户履约计划
     * Summary: 商户履约计划取消.
     *
     * @param CancelFundPlanRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CancelFundPlanResponse
     */
    public function cancelFundPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelFundPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.plan.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调.
     *
     * @param CallbackFundNotifyRequest $request
     *
     * @return CallbackFundNotifyResponse
     */
    public function callbackFundNotify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackFundNotifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 通知回调
     * Summary: 通知回调.
     *
     * @param CallbackFundNotifyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CallbackFundNotifyResponse
     */
    public function callbackFundNotifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackFundNotifyResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.notify.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步.
     *
     * @param SyncFundMerchantpromiseRequest $request
     *
     * @return SyncFundMerchantpromiseResponse
     */
    public function syncFundMerchantpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundMerchantpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户还款承诺同步
     * Summary: 商户还款承诺同步.
     *
     * @param SyncFundMerchantpromiseRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncFundMerchantpromiseResponse
     */
    public function syncFundMerchantpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundMerchantpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.merchantpromise.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步.
     *
     * @param SyncFundFinanceloanresultsRequest $request
     *
     * @return SyncFundFinanceloanresultsResponse
     */
    public function syncFundFinanceloanresults($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundFinanceloanresultsEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资放款结果同步
     * Summary: 融资放款结果同步.
     *
     * @param SyncFundFinanceloanresultsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SyncFundFinanceloanresultsResponse
     */
    public function syncFundFinanceloanresultsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundFinanceloanresultsResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.financeloanresults.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺.
     *
     * @param GetFundUserpromiseRequest $request
     *
     * @return GetFundUserpromiseResponse
     */
    public function getFundUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户承诺
     * Summary: 查询用户承诺.
     *
     * @param GetFundUserpromiseRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetFundUserpromiseResponse
     */
    public function getFundUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.userpromise.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetFundUserperformanceRequest $request
     *
     * @return GetFundUserperformanceResponse
     */
    public function getFundUserperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundUserperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+履约记录）
     * Summary: 用户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetFundUserperformanceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetFundUserperformanceResponse
     */
    public function getFundUserperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundUserperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.userperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetFundMerchantperformanceRequest $request
     *
     * @return GetFundMerchantperformanceResponse
     */
    public function getFundMerchantperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundMerchantperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetFundMerchantperformanceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetFundMerchantperformanceResponse
     */
    public function getFundMerchantperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundMerchantperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.merchantperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方调用、订单详情获取
     * Summary: 资方调用、订单详情获取.
     *
     * @param GetFundOrderfullinfoRequest $request
     *
     * @return GetFundOrderfullinfoResponse
     */
    public function getFundOrderfullinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundOrderfullinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方调用、订单详情获取
     * Summary: 资方调用、订单详情获取.
     *
     * @param GetFundOrderfullinfoRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetFundOrderfullinfoResponse
     */
    public function getFundOrderfullinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundOrderfullinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfullinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口.
     *
     * @param NotifyFundFlowRequest $request
     *
     * @return NotifyFundFlowResponse
     */
    public function notifyFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
     * Summary: 资方合同文件已上传确认接口.
     *
     * @param NotifyFundFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return NotifyFundFlowResponse
     */
    public function notifyFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传.
     *
     * @param UploadFundCreditRequest $request
     *
     * @return UploadFundCreditResponse
     */
    public function uploadFundCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadFundCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方资产凭证上传，可以是文本或文件
     * Summary: 资方资产凭证上传.
     *
     * @param UploadFundCreditRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UploadFundCreditResponse
     */
    public function uploadFundCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadFundCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.credit.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询.
     *
     * @param QueryFundCreditRequest $request
     *
     * @return QueryFundCreditResponse
     */
    public function queryFundCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFundCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方资产凭证查询，需要提供订单号或资产包号
     * Summary: 资方资产凭证查询.
     *
     * @param QueryFundCreditRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryFundCreditResponse
     */
    public function queryFundCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFundCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.credit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资预审结果同步
     * Summary: 融资预审结果同步.
     *
     * @param SyncFundFinanceprecheckresultRequest $request
     *
     * @return SyncFundFinanceprecheckresultResponse
     */
    public function syncFundFinanceprecheckresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundFinanceprecheckresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资预审结果同步
     * Summary: 融资预审结果同步.
     *
     * @param SyncFundFinanceprecheckresultRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return SyncFundFinanceprecheckresultResponse
     */
    public function syncFundFinanceprecheckresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundFinanceprecheckresultResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.financeprecheckresult.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方查询代偿户余额
     * Summary: 代偿户查询.
     *
     * @param QueryFundCompensateaccountRequest $request
     *
     * @return QueryFundCompensateaccountResponse
     */
    public function queryFundCompensateaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFundCompensateaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方查询代偿户余额
     * Summary: 代偿户查询.
     *
     * @param QueryFundCompensateaccountRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryFundCompensateaccountResponse
     */
    public function queryFundCompensateaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFundCompensateaccountResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.compensateaccount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方查询订单融资信息
     * Summary: 资方查询订单融资信息.
     *
     * @param GetFundOrderfinanceinfoRequest $request
     *
     * @return GetFundOrderfinanceinfoResponse
     */
    public function getFundOrderfinanceinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundOrderfinanceinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方查询订单融资信息
     * Summary: 资方查询订单融资信息.
     *
     * @param GetFundOrderfinanceinfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetFundOrderfinanceinfoResponse
     */
    public function getFundOrderfinanceinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundOrderfinanceinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.orderfinanceinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系.
     *
     * @param AddFundDividerelationRequest $request
     *
     * @return AddFundDividerelationResponse
     */
    public function addFundDividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addFundDividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系.
     *
     * @param AddFundDividerelationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AddFundDividerelationResponse
     */
    public function addFundDividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddFundDividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.dividerelation.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询.
     *
     * @param QueryFundDividerelationRequest $request
     *
     * @return QueryFundDividerelationResponse
     */
    public function queryFundDividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFundDividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询.
     *
     * @param QueryFundDividerelationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryFundDividerelationResponse
     */
    public function queryFundDividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFundDividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.dividerelation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ● 本接口获取用信授权
     * ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
     * Summary: 用信申请接口.
     *
     * @param ApplyFundCreditutilizationRequest $request
     *
     * @return ApplyFundCreditutilizationResponse
     */
    public function applyFundCreditutilization($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyFundCreditutilizationEx($request, $headers, $runtime);
    }

    /**
     * Description: ● 本接口获取用信授权
     * ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
     * Summary: 用信申请接口.
     *
     * @param ApplyFundCreditutilizationRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ApplyFundCreditutilizationResponse
     */
    public function applyFundCreditutilizationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyFundCreditutilizationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.creditutilization.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 小贷融资用信申请订单履约信息
     * Summary: 用信申请订单履约信息.
     *
     * @param ApplyFundAssertorderRequest $request
     *
     * @return ApplyFundAssertorderResponse
     */
    public function applyFundAssertorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyFundAssertorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 小贷融资用信申请订单履约信息
     * Summary: 用信申请订单履约信息.
     *
     * @param ApplyFundAssertorderRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ApplyFundAssertorderResponse
     */
    public function applyFundAssertorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyFundAssertorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.assertorder.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用信查询订单履约信息
     * Summary: 用信查询订单履约信息.
     *
     * @param QueryFundAssertorderRequest $request
     *
     * @return QueryFundAssertorderResponse
     */
    public function queryFundAssertorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFundAssertorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 用信查询订单履约信息
     * Summary: 用信查询订单履约信息.
     *
     * @param QueryFundAssertorderRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryFundAssertorderResponse
     */
    public function queryFundAssertorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFundAssertorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.assertorder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用说明：
     * ● 本接口用于授信额度试算完成后同步授信结果。
     * Summary: 授信结果同步接口.
     *
     * @param SyncFundCreditgrantingRequest $request
     *
     * @return SyncFundCreditgrantingResponse
     */
    public function syncFundCreditgranting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFundCreditgrantingEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用说明：
     * ● 本接口用于授信额度试算完成后同步授信结果。
     * Summary: 授信结果同步接口.
     *
     * @param SyncFundCreditgrantingRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncFundCreditgrantingResponse
     */
    public function syncFundCreditgrantingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFundCreditgrantingResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.creditgranting.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
     * Summary: 授信授权申请接口.
     *
     * @param AuthFundCreditgrantingRequest $request
     *
     * @return AuthFundCreditgrantingResponse
     */
    public function authFundCreditgranting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authFundCreditgrantingEx($request, $headers, $runtime);
    }

    /**
     * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
     * Summary: 授信授权申请接口.
     *
     * @param AuthFundCreditgrantingRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return AuthFundCreditgrantingResponse
     */
    public function authFundCreditgrantingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthFundCreditgrantingResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.creditgranting.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 小贷融资查询资产报告
     * Summary: 查询资产报告.
     *
     * @param QueryFundAssertreportRequest $request
     *
     * @return QueryFundAssertreportResponse
     */
    public function queryFundAssertreport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFundAssertreportEx($request, $headers, $runtime);
    }

    /**
     * Description: 小贷融资查询资产报告
     * Summary: 查询资产报告.
     *
     * @param QueryFundAssertreportRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryFundAssertreportResponse
     */
    public function queryFundAssertreportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFundAssertreportResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.assertreport.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 本接口用于查询授信结果
     * Summary: 授信结果查询.
     *
     * @param QueryFundCreditgrantingRequest $request
     *
     * @return QueryFundCreditgrantingResponse
     */
    public function queryFundCreditgranting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFundCreditgrantingEx($request, $headers, $runtime);
    }

    /**
     * Description: 本接口用于查询授信结果
     * Summary: 授信结果查询.
     *
     * @param QueryFundCreditgrantingRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryFundCreditgrantingResponse
     */
    public function queryFundCreditgrantingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFundCreditgrantingResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.creditgranting.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权信息查询
     * Summary: 授权信息查询.
     *
     * @param QueryFundCreditauthRequest $request
     *
     * @return QueryFundCreditauthResponse
     */
    public function queryFundCreditauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFundCreditauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权信息查询
     * Summary: 授权信息查询.
     *
     * @param QueryFundCreditauthRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryFundCreditauthResponse
     */
    public function queryFundCreditauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFundCreditauthResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.creditauth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产包详情查询
     * Summary: 资产包详情查询.
     *
     * @param QueryFundAssetpackageRequest $request
     *
     * @return QueryFundAssetpackageResponse
     */
    public function queryFundAssetpackage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFundAssetpackageEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产包详情查询
     * Summary: 资产包详情查询.
     *
     * @param QueryFundAssetpackageRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryFundAssetpackageResponse
     */
    public function queryFundAssetpackageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFundAssetpackageResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.assetpackage.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用说明：
     * 1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
     * Summary: 允许用户取消(确认用户取消).
     *
     * @param ConfirmFundUsercancelRequest $request
     *
     * @return ConfirmFundUsercancelResponse
     */
    public function confirmFundUsercancel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmFundUsercancelEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用说明：
     * 1. 资方配置用户取消拦截能力后，用户发起取消会通知资方，自发除了发起取消商户履约外，还可以通过次接口确认用户批量取消操作，用户可以进行取消
     * Summary: 允许用户取消(确认用户取消).
     *
     * @param ConfirmFundUsercancelRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ConfirmFundUsercancelResponse
     */
    public function confirmFundUsercancelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmFundUsercancelResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.usercancel.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用说明：
     * 1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
     * Summary: 商户履约其他方式还款（单期取消）.
     *
     * @param RepayFundPlanRequest $request
     *
     * @return RepayFundPlanResponse
     */
    public function repayFundPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayFundPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用说明：
     * 1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
     * Summary: 商户履约其他方式还款（单期取消）.
     *
     * @param RepayFundPlanRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return RepayFundPlanResponse
     */
    public function repayFundPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayFundPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.plan.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方代偿签约链接获取
     * Summary: 资方代偿签约链接获取.
     *
     * @param GetFundCompensatesignurlRequest $request
     *
     * @return GetFundCompensatesignurlResponse
     */
    public function getFundCompensatesignurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getFundCompensatesignurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方代偿签约链接获取
     * Summary: 资方代偿签约链接获取.
     *
     * @param GetFundCompensatesignurlRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetFundCompensatesignurlResponse
     */
    public function getFundCompensatesignurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetFundCompensatesignurlResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.compensatesignurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 转账代偿签约结果确认
     * Summary: 转账代偿签约结果确认.
     *
     * @param ConfirmFundCompensateRequest $request
     *
     * @return ConfirmFundCompensateResponse
     */
    public function confirmFundCompensate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmFundCompensateEx($request, $headers, $runtime);
    }

    /**
     * Description: 转账代偿签约结果确认
     * Summary: 转账代偿签约结果确认.
     *
     * @param ConfirmFundCompensateRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ConfirmFundCompensateResponse
     */
    public function confirmFundCompensateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmFundCompensateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.compensate.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方提交合同签署
     * Summary: 资方提交合同签署.
     *
     * @param SubmitFundFlowRequest $request
     *
     * @return SubmitFundFlowResponse
     */
    public function submitFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方提交合同签署
     * Summary: 资方提交合同签署.
     *
     * @param SubmitFundFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SubmitFundFlowResponse
     */
    public function submitFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资方合同流程撤销
     * Summary: 资方合同流程撤销
     *
     * @param CancelFundFlowRequest $request
     *
     * @return CancelFundFlowResponse
     */
    public function cancelFundFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelFundFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 资方合同流程撤销
     * Summary: 资方合同流程撤销
     *
     * @param CancelFundFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CancelFundFlowResponse
     */
    public function cancelFundFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelFundFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.fund.flow.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部调用,商品信息获取
     * Summary: 商品信息获取.
     *
     * @param GetInnerProductRequest $request
     *
     * @return GetInnerProductResponse
     */
    public function getInnerProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部调用,商品信息获取
     * Summary: 商品信息获取.
     *
     * @param GetInnerProductRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetInnerProductResponse
     */
    public function getInnerProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerProductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.product.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ato内部服务，客户系统不可访问；租户信息获取
     * Summary: 租户信息获取.
     *
     * @param GetInnerTenantRequest $request
     *
     * @return GetInnerTenantResponse
     */
    public function getInnerTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: ato内部服务，客户系统不可访问；租户信息获取
     * Summary: 租户信息获取.
     *
     * @param GetInnerTenantRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetInnerTenantResponse
     */
    public function getInnerTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerTenantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.tenant.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
     * Summary: 上报整单结算计量信息.
     *
     * @param SyncInnerMeterforwholeorderRequest $request
     *
     * @return SyncInnerMeterforwholeorderResponse
     */
    public function syncInnerMeterforwholeorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerMeterforwholeorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
     * Summary: 上报整单结算计量信息.
     *
     * @param SyncInnerMeterforwholeorderRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SyncInnerMeterforwholeorderResponse
     */
    public function syncInnerMeterforwholeorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerMeterforwholeorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.meterforwholeorder.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部调用，合同签署计量上报接口
     * Summary: 合同签署计量上报同步接口.
     *
     * @param SyncInnerMeterforagsignRequest $request
     *
     * @return SyncInnerMeterforagsignResponse
     */
    public function syncInnerMeterforagsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerMeterforagsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部调用，合同签署计量上报接口
     * Summary: 合同签署计量上报同步接口.
     *
     * @param SyncInnerMeterforagsignRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncInnerMeterforagsignResponse
     */
    public function syncInnerMeterforagsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerMeterforagsignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.meterforagsign.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表.
     *
     * @param AllInnerTemplateRequest $request
     *
     * @return AllInnerTemplateResponse
     */
    public function allInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据租户查询合同模板列表
     * Summary: 查询模板列表.
     *
     * @param AllInnerTemplateRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AllInnerTemplateResponse
     */
    public function allInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表.
     *
     * @param ListInnerTemplateRequest $request
     *
     * @return ListInnerTemplateResponse
     */
    public function listInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据模板code查询合同模板版本列表
     * Summary: 查询魔法库某一模板版本列表.
     *
     * @param ListInnerTemplateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListInnerTemplateResponse
     */
    public function listInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情.
     *
     * @param DetailInnerTemplateRequest $request
     *
     * @return DetailInnerTemplateResponse
     */
    public function detailInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据模板code查询指定版本的模板详情
     * Summary: 查询魔法库模板详情.
     *
     * @param DetailInnerTemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DetailInnerTemplateResponse
     */
    public function detailInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，创建魔法库模板
     * Summary: 创建模板
     *
     * @param CreateInnerTemplateRequest $request
     *
     * @return CreateInnerTemplateResponse
     */
    public function createInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，创建魔法库模板
     * Summary: 创建模板
     *
     * @param CreateInnerTemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateInnerTemplateResponse
     */
    public function createInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板
     *
     * @param SaveInnerTemplateRequest $request
     *
     * @return SaveInnerTemplateResponse
     */
    public function saveInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，保存魔法库模板
     * Summary: 保存魔法库模板
     *
     * @param SaveInnerTemplateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SaveInnerTemplateResponse
     */
    public function saveInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，保存魔法库模板签署区
     * Summary: 保存魔法库模板签署区.
     *
     * @param SaveInnerSignfieldsRequest $request
     *
     * @return SaveInnerSignfieldsResponse
     */
    public function saveInnerSignfields($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveInnerSignfieldsEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，保存魔法库模板签署区
     * Summary: 保存魔法库模板签署区.
     *
     * @param SaveInnerSignfieldsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SaveInnerSignfieldsResponse
     */
    public function saveInnerSignfieldsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveInnerSignfieldsResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.signfields.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板
     *
     * @param PublishInnerTemplateRequest $request
     *
     * @return PublishInnerTemplateResponse
     */
    public function publishInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，发布魔法库模板
     * Summary: 发布魔法库模板
     *
     * @param PublishInnerTemplateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PublishInnerTemplateResponse
     */
    public function publishInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板
     *
     * @param PreviewInnerTemplateRequest $request
     *
     * @return PreviewInnerTemplateResponse
     */
    public function previewInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->previewInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据code预览对应魔法库模板
     * Summary: 预览魔法库模板
     *
     * @param PreviewInnerTemplateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PreviewInnerTemplateResponse
     */
    public function previewInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PreviewInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.preview', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板
     *
     * @param DeleteInnerTemplateRequest $request
     *
     * @return DeleteInnerTemplateResponse
     */
    public function deleteInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，根据code删除对应魔法库模板
     * Summary: 删除魔法库模板
     *
     * @param DeleteInnerTemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteInnerTemplateResponse
     */
    public function deleteInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板
     *
     * @param CloneInnerTemplateRequest $request
     *
     * @return CloneInnerTemplateResponse
     */
    public function cloneInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cloneInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 内部接口，复制一个魔法库模板
     * Summary: 复制魔法库模板
     *
     * @param CloneInnerTemplateRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CloneInnerTemplateResponse
     */
    public function cloneInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloneInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.clone', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ato文件上传
     * Summary: ato文件上传.
     *
     * @param UploadInnerFileRequest $request
     *
     * @return UploadInnerFileResponse
     */
    public function uploadInnerFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadInnerFileEx($request, $headers, $runtime);
    }

    /**
     * Description: ato文件上传
     * Summary: ato文件上传.
     *
     * @param UploadInnerFileRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UploadInnerFileResponse
     */
    public function uploadInnerFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadInnerFileResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ato文件下载
     * Summary: ato文件下载.
     *
     * @param DownloadInnerFileRequest $request
     *
     * @return DownloadInnerFileResponse
     */
    public function downloadInnerFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadInnerFileEx($request, $headers, $runtime);
    }

    /**
     * Description: ato文件下载
     * Summary: ato文件下载.
     *
     * @param DownloadInnerFileRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DownloadInnerFileResponse
     */
    public function downloadInnerFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadInnerFileResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.file.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取 webofficeURL（透传）
     * Summary: 获取 webofficeURL.
     *
     * @param GetInnerTemplateofficeurlRequest $request
     *
     * @return GetInnerTemplateofficeurlResponse
     */
    public function getInnerTemplateofficeurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerTemplateofficeurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取 webofficeURL（透传）
     * Summary: 获取 webofficeURL.
     *
     * @param GetInnerTemplateofficeurlRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetInnerTemplateofficeurlResponse
     */
    public function getInnerTemplateofficeurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerTemplateofficeurlResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateofficeurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 魔法库控制台刷新token
     * Summary: 刷新token.
     *
     * @param RefreshInnerTemplatetokenRequest $request
     *
     * @return RefreshInnerTemplatetokenResponse
     */
    public function refreshInnerTemplatetoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refreshInnerTemplatetokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 魔法库控制台刷新token
     * Summary: 刷新token.
     *
     * @param RefreshInnerTemplatetokenRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return RefreshInnerTemplatetokenResponse
     */
    public function refreshInnerTemplatetokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefreshInnerTemplatetokenResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templatetoken.refresh', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建文本域（组件）
     * Summary: 创建文本域
     *
     * @param CreateInnerTemplatetextareaRequest $request
     *
     * @return CreateInnerTemplatetextareaResponse
     */
    public function createInnerTemplatetextarea($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerTemplatetextareaEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建文本域（组件）
     * Summary: 创建文本域
     *
     * @param CreateInnerTemplatetextareaRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateInnerTemplatetextareaResponse
     */
    public function createInnerTemplatetextareaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerTemplatetextareaResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templatetextarea.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表.
     *
     * @param QueryInnerTemplateimageRequest $request
     *
     * @return QueryInnerTemplateimageResponse
     */
    public function queryInnerTemplateimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTemplateimageEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取模板的图片列表
     * Summary: 获取模板的图片列表.
     *
     * @param QueryInnerTemplateimageRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryInnerTemplateimageResponse
     */
    public function queryInnerTemplateimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTemplateimageResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateimage.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存/编辑分账关系信息
     * Summary: 保存/编辑分账关系信息.
     *
     * @param CreateInnerFunddividerelationRequest $request
     *
     * @return CreateInnerFunddividerelationResponse
     */
    public function createInnerFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存/编辑分账关系信息
     * Summary: 保存/编辑分账关系信息.
     *
     * @param CreateInnerFunddividerelationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateInnerFunddividerelationResponse
     */
    public function createInnerFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.funddividerelation.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交分账关系信息
     * Summary: 提交分账关系信息.
     *
     * @param SubmitInnerFunddividerelationRequest $request
     *
     * @return SubmitInnerFunddividerelationResponse
     */
    public function submitInnerFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交分账关系信息
     * Summary: 提交分账关系信息.
     *
     * @param SubmitInnerFunddividerelationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return SubmitInnerFunddividerelationResponse
     */
    public function submitInnerFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.funddividerelation.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询分账关系信息
     * Summary: 查询分账关系信息.
     *
     * @param QueryInnerFunddividerelationRequest $request
     *
     * @return QueryInnerFunddividerelationResponse
     */
    public function queryInnerFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询分账关系信息
     * Summary: 查询分账关系信息.
     *
     * @param QueryInnerFunddividerelationRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryInnerFunddividerelationResponse
     */
    public function queryInnerFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.funddividerelation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询分账关系分页列表
     * Summary: 查询分账关系分页列表.
     *
     * @param PagequeryInnerFunddividerelationRequest $request
     *
     * @return PagequeryInnerFunddividerelationResponse
     */
    public function pagequeryInnerFunddividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerFunddividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询分账关系分页列表
     * Summary: 查询分账关系分页列表.
     *
     * @param PagequeryInnerFunddividerelationRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return PagequeryInnerFunddividerelationResponse
     */
    public function pagequeryInnerFunddividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerFunddividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.funddividerelation.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存租户签约信息
     * Summary: 保存租户签约信息.
     *
     * @param CreateInnerMerchantagreementRequest $request
     *
     * @return CreateInnerMerchantagreementResponse
     */
    public function createInnerMerchantagreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerMerchantagreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存租户签约信息
     * Summary: 保存租户签约信息.
     *
     * @param CreateInnerMerchantagreementRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateInnerMerchantagreementResponse
     */
    public function createInnerMerchantagreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerMerchantagreementResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantagreement.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户签约信息
     * Summary: 查询租户签约信息.
     *
     * @param QueryInnerMerchantagreementRequest $request
     *
     * @return QueryInnerMerchantagreementResponse
     */
    public function queryInnerMerchantagreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerMerchantagreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户签约信息
     * Summary: 查询租户签约信息.
     *
     * @param QueryInnerMerchantagreementRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryInnerMerchantagreementResponse
     */
    public function queryInnerMerchantagreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerMerchantagreementResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantagreement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户签约协议分页列表
     * Summary: 查询租户签约协议分页列表.
     *
     * @param PagequeryInnerMerchantagreementRequest $request
     *
     * @return PagequeryInnerMerchantagreementResponse
     */
    public function pagequeryInnerMerchantagreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerMerchantagreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户签约协议分页列表
     * Summary: 查询租户签约协议分页列表.
     *
     * @param PagequeryInnerMerchantagreementRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return PagequeryInnerMerchantagreementResponse
     */
    public function pagequeryInnerMerchantagreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerMerchantagreementResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantagreement.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存/编辑进件信息
     * Summary: 保存/编辑进件信息.
     *
     * @param CreateInnerMerchantpayexpandRequest $request
     *
     * @return CreateInnerMerchantpayexpandResponse
     */
    public function createInnerMerchantpayexpand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerMerchantpayexpandEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存/编辑进件信息
     * Summary: 保存/编辑进件信息.
     *
     * @param CreateInnerMerchantpayexpandRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateInnerMerchantpayexpandResponse
     */
    public function createInnerMerchantpayexpandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerMerchantpayexpandResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantpayexpand.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交进件信息
     * Summary: 提交进件信息.
     *
     * @param SubmitInnerMerchantpayexpandRequest $request
     *
     * @return SubmitInnerMerchantpayexpandResponse
     */
    public function submitInnerMerchantpayexpand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerMerchantpayexpandEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交进件信息
     * Summary: 提交进件信息.
     *
     * @param SubmitInnerMerchantpayexpandRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return SubmitInnerMerchantpayexpandResponse
     */
    public function submitInnerMerchantpayexpandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerMerchantpayexpandResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantpayexpand.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询进件信息
     * Summary: 查询进件信息.
     *
     * @param QueryInnerMerchantpayexpandRequest $request
     *
     * @return QueryInnerMerchantpayexpandResponse
     */
    public function queryInnerMerchantpayexpand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerMerchantpayexpandEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询进件信息
     * Summary: 查询进件信息.
     *
     * @param QueryInnerMerchantpayexpandRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryInnerMerchantpayexpandResponse
     */
    public function queryInnerMerchantpayexpandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerMerchantpayexpandResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantpayexpand.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询代理商户分页列表-间连商户使用
     * Summary: 查询代理商户分页列表-间连商户使用.
     *
     * @param PagequeryInnerMerchantagentRequest $request
     *
     * @return PagequeryInnerMerchantagentResponse
     */
    public function pagequeryInnerMerchantagent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerMerchantagentEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询代理商户分页列表-间连商户使用
     * Summary: 查询代理商户分页列表-间连商户使用.
     *
     * @param PagequeryInnerMerchantagentRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return PagequeryInnerMerchantagentResponse
     */
    public function pagequeryInnerMerchantagentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerMerchantagentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantagent.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 拷贝模板文件，可用于保存模板的入参
     * Summary: 拷贝模板文件.
     *
     * @param CloneInnerTemplatefileaddressRequest $request
     *
     * @return CloneInnerTemplatefileaddressResponse
     */
    public function cloneInnerTemplatefileaddress($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cloneInnerTemplatefileaddressEx($request, $headers, $runtime);
    }

    /**
     * Description: 拷贝模板文件，可用于保存模板的入参
     * Summary: 拷贝模板文件.
     *
     * @param CloneInnerTemplatefileaddressRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CloneInnerTemplatefileaddressResponse
     */
    public function cloneInnerTemplatefileaddressEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloneInnerTemplatefileaddressResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templatefileaddress.clone', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询签署区
     * Summary: 查询签署区.
     *
     * @param QueryInnerSignfieldsRequest $request
     *
     * @return QueryInnerSignfieldsResponse
     */
    public function queryInnerSignfields($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerSignfieldsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询签署区
     * Summary: 查询签署区.
     *
     * @param QueryInnerSignfieldsRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryInnerSignfieldsResponse
     */
    public function queryInnerSignfieldsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerSignfieldsResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.signfields.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步已发布的模板
     * Summary: 同步已发布的模板
     *
     * @param SyncInnerTemplateRequest $request
     *
     * @return SyncInnerTemplateResponse
     */
    public function syncInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步已发布的模板
     * Summary: 同步已发布的模板
     *
     * @param SyncInnerTemplateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SyncInnerTemplateResponse
     */
    public function syncInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息.
     *
     * @param UpdateInnerTemplateRequest $request
     *
     * @return UpdateInnerTemplateResponse
     */
    public function updateInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新魔法库模板基本信息
     * Summary: 更新魔法库模板基本信息.
     *
     * @param UpdateInnerTemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateInnerTemplateResponse
     */
    public function updateInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息.
     *
     * @param QueryInnerTemplateRequest $request
     *
     * @return QueryInnerTemplateResponse
     */
    public function queryInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过模板code更新模板的基本信息，比如模板名称等
     * Summary: 查询模板的基本信息.
     *
     * @param QueryInnerTemplateRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryInnerTemplateResponse
     */
    public function queryInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息.
     *
     * @param QueryInnerTemplateelementlinkRequest $request
     *
     * @return QueryInnerTemplateelementlinkResponse
     */
    public function queryInnerTemplateelementlink($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTemplateelementlinkEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取模板关联的元素列表信息，包括组件信息
     * Summary: 获取模板关联的元素列表信息.
     *
     * @param QueryInnerTemplateelementlinkRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryInnerTemplateelementlinkResponse
     */
    public function queryInnerTemplateelementlinkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTemplateelementlinkResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateelementlink.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
     * Summary: 查询模板的版本详情.
     *
     * @param QueryInnerTemplateversionRequest $request
     *
     * @return QueryInnerTemplateversionResponse
     */
    public function queryInnerTemplateversion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTemplateversionEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
     * Summary: 查询模板的版本详情.
     *
     * @param QueryInnerTemplateversionRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryInnerTemplateversionResponse
     */
    public function queryInnerTemplateversionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTemplateversionResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateversion.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单消息查询
     * Summary: 订单消息查询.
     *
     * @param PagequeryInnerOrdermsgRequest $request
     *
     * @return PagequeryInnerOrdermsgResponse
     */
    public function pagequeryInnerOrdermsg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerOrdermsgEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单消息查询
     * Summary: 订单消息查询.
     *
     * @param PagequeryInnerOrdermsgRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PagequeryInnerOrdermsgResponse
     */
    public function pagequeryInnerOrdermsgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerOrdermsgResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.ordermsg.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单消息重试
     * Summary: 订单消息重试.
     *
     * @param RetryInnerOrdermsgRequest $request
     *
     * @return RetryInnerOrdermsgResponse
     */
    public function retryInnerOrdermsg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryInnerOrdermsgEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单消息重试
     * Summary: 订单消息重试.
     *
     * @param RetryInnerOrdermsgRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return RetryInnerOrdermsgResponse
     */
    public function retryInnerOrdermsgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryInnerOrdermsgResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.ordermsg.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 法务协议授权-  签署合同代扣前置授权查询接口
     * Summary: 签署合同代扣前置授权查询接口.
     *
     * @param QueryInnerAuthorizationRequest $request
     *
     * @return QueryInnerAuthorizationResponse
     */
    public function queryInnerAuthorization($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerAuthorizationEx($request, $headers, $runtime);
    }

    /**
     * Description: 法务协议授权-  签署合同代扣前置授权查询接口
     * Summary: 签署合同代扣前置授权查询接口.
     *
     * @param QueryInnerAuthorizationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryInnerAuthorizationResponse
     */
    public function queryInnerAuthorizationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerAuthorizationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.authorization.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
     * Summary: 签署合同代扣前置同意授权接口.
     *
     * @param SignInnerAuthorizationRequest $request
     *
     * @return SignInnerAuthorizationResponse
     */
    public function signInnerAuthorization($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->signInnerAuthorizationEx($request, $headers, $runtime);
    }

    /**
     * Description: 法务协议授权 - 签署合同代扣前置同意授权接口
     * Summary: 签署合同代扣前置同意授权接口.
     *
     * @param SignInnerAuthorizationRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SignInnerAuthorizationResponse
     */
    public function signInnerAuthorizationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SignInnerAuthorizationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.authorization.sign', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 小程序法务授权 - 商户补充协议状态查询接口
     * Summary: 商户补充协议状态查询接口.
     *
     * @param QueryInnerSupplementalRequest $request
     *
     * @return QueryInnerSupplementalResponse
     */
    public function queryInnerSupplemental($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerSupplementalEx($request, $headers, $runtime);
    }

    /**
     * Description: 小程序法务授权 - 商户补充协议状态查询接口
     * Summary: 商户补充协议状态查询接口.
     *
     * @param QueryInnerSupplementalRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryInnerSupplementalResponse
     */
    public function queryInnerSupplementalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerSupplementalResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.supplemental.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 法务协议授权 - 商户补充协议状态同意接口
     * Summary: 商户补充协议状态同意接口.
     *
     * @param SignInnerSupplementalRequest $request
     *
     * @return SignInnerSupplementalResponse
     */
    public function signInnerSupplemental($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->signInnerSupplementalEx($request, $headers, $runtime);
    }

    /**
     * Description: 法务协议授权 - 商户补充协议状态同意接口
     * Summary: 商户补充协议状态同意接口.
     *
     * @param SignInnerSupplementalRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SignInnerSupplementalResponse
     */
    public function signInnerSupplementalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SignInnerSupplementalResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.supplemental.sign', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询代扣计划
     * Summary: 代扣计划查询.
     *
     * @param QueryInnerWithholdplanRequest $request
     *
     * @return QueryInnerWithholdplanResponse
     */
    public function queryInnerWithholdplan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerWithholdplanEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询代扣计划
     * Summary: 代扣计划查询.
     *
     * @param QueryInnerWithholdplanRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryInnerWithholdplanResponse
     */
    public function queryInnerWithholdplanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerWithholdplanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.withholdplan.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建代扣协议
     * Summary: 创建代扣协议.
     *
     * @param CreateInnerWithholdsignRequest $request
     *
     * @return CreateInnerWithholdsignResponse
     */
    public function createInnerWithholdsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerWithholdsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建代扣协议
     * Summary: 创建代扣协议.
     *
     * @param CreateInnerWithholdsignRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateInnerWithholdsignResponse
     */
    public function createInnerWithholdsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerWithholdsignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.withholdsign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询.
     *
     * @param QueryInnerWithholdsignRequest $request
     *
     * @return QueryInnerWithholdsignResponse
     */
    public function queryInnerWithholdsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerWithholdsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询.
     *
     * @param QueryInnerWithholdsignRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryInnerWithholdsignResponse
     */
    public function queryInnerWithholdsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerWithholdsignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.withholdsign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取商户进件静态枚举数据
     * Summary: 获取商户进件静态枚举数据.
     *
     * @param GetInnerMerchantstaticdataRequest $request
     *
     * @return GetInnerMerchantstaticdataResponse
     */
    public function getInnerMerchantstaticdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerMerchantstaticdataEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取商户进件静态枚举数据
     * Summary: 获取商户进件静态枚举数据.
     *
     * @param GetInnerMerchantstaticdataRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetInnerMerchantstaticdataResponse
     */
    public function getInnerMerchantstaticdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerMerchantstaticdataResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantstaticdata.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已有绑定关系分账方数据
     * 包括分账方名称，社会统一信用代码
     * Summary: 间连查询已有绑定关系分账方数据.
     *
     * @param GetInnerFunddividemerchantRequest $request
     *
     * @return GetInnerFunddividemerchantResponse
     */
    public function getInnerFunddividemerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerFunddividemerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已有绑定关系分账方数据
     * 包括分账方名称，社会统一信用代码
     * Summary: 间连查询已有绑定关系分账方数据.
     *
     * @param GetInnerFunddividemerchantRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetInnerFunddividemerchantResponse
     */
    public function getInnerFunddividemerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerFunddividemerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.funddividemerchant.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商户和保司协议签署信息
     * Summary: 查询商户和保司协议签署信息.
     *
     * @param QueryInnerInsuresignRequest $request
     *
     * @return QueryInnerInsuresignResponse
     */
    public function queryInnerInsuresign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerInsuresignEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商户和保司协议签署信息
     * Summary: 查询商户和保司协议签署信息.
     *
     * @param QueryInnerInsuresignRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryInnerInsuresignResponse
     */
    public function queryInnerInsuresignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerInsuresignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.insuresign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生成商户和保司签约链接
     * Summary: 生成商户和保司签约链接.
     *
     * @param CreateInnerInsuresignRequest $request
     *
     * @return CreateInnerInsuresignResponse
     */
    public function createInnerInsuresign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerInsuresignEx($request, $headers, $runtime);
    }

    /**
     * Description: 生成商户和保司签约链接
     * Summary: 生成商户和保司签约链接.
     *
     * @param CreateInnerInsuresignRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateInnerInsuresignResponse
     */
    public function createInnerInsuresignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerInsuresignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.insuresign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询保单信息
     * Summary: 查询保单信息.
     *
     * @param PagequeryInnerInsureorderRequest $request
     *
     * @return PagequeryInnerInsureorderResponse
     */
    public function pagequeryInnerInsureorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerInsureorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询保单信息
     * Summary: 查询保单信息.
     *
     * @param PagequeryInnerInsureorderRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return PagequeryInnerInsureorderResponse
     */
    public function pagequeryInnerInsureorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerInsureorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.insureorder.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户控制台商品列表
     * Summary: 商品列表.
     *
     * @param PagequeryInnerProductRequest $request
     *
     * @return PagequeryInnerProductResponse
     */
    public function pagequeryInnerProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户控制台商品列表
     * Summary: 商品列表.
     *
     * @param PagequeryInnerProductRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PagequeryInnerProductResponse
     */
    public function pagequeryInnerProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerProductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.product.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户控制台首页通知栏
     * Summary: 首页通知栏.
     *
     * @param GetInnerHomepagenoticeRequest $request
     *
     * @return GetInnerHomepagenoticeResponse
     */
    public function getInnerHomepagenotice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerHomepagenoticeEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户控制台首页通知栏
     * Summary: 首页通知栏.
     *
     * @param GetInnerHomepagenoticeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetInnerHomepagenoticeResponse
     */
    public function getInnerHomepagenoticeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerHomepagenoticeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.homepagenotice.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户控制台通知列表
     * Summary: 通知列表.
     *
     * @param PagequeryInnerNoticeRequest $request
     *
     * @return PagequeryInnerNoticeResponse
     */
    public function pagequeryInnerNotice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerNoticeEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户控制台通知列表
     * Summary: 通知列表.
     *
     * @param PagequeryInnerNoticeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PagequeryInnerNoticeResponse
     */
    public function pagequeryInnerNoticeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerNoticeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.notice.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户控制台通知详情
     * Summary: 通知详情.
     *
     * @param DetailInnerNoticeRequest $request
     *
     * @return DetailInnerNoticeResponse
     */
    public function detailInnerNotice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerNoticeEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户控制台通知详情
     * Summary: 通知详情.
     *
     * @param DetailInnerNoticeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DetailInnerNoticeResponse
     */
    public function detailInnerNoticeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerNoticeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.notice.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户控制台订单列表
     * Summary: 订单列表.
     *
     * @param PagequeryInnerOrderRequest $request
     *
     * @return PagequeryInnerOrderResponse
     */
    public function pagequeryInnerOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户控制台订单列表
     * Summary: 订单列表.
     *
     * @param PagequeryInnerOrderRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PagequeryInnerOrderResponse
     */
    public function pagequeryInnerOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerOrderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.order.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单详情
     * Summary: 订单详情.
     *
     * @param DetailInnerOrderRequest $request
     *
     * @return DetailInnerOrderResponse
     */
    public function detailInnerOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单详情
     * Summary: 订单详情.
     *
     * @param DetailInnerOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DetailInnerOrderResponse
     */
    public function detailInnerOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerOrderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.order.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合同模板实例化渲染，文本域赋值
     * Summary: 合同模板实例化渲染.
     *
     * @param RenderInnerTemplateinstanceRequest $request
     *
     * @return RenderInnerTemplateinstanceResponse
     */
    public function renderInnerTemplateinstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->renderInnerTemplateinstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 合同模板实例化渲染，文本域赋值
     * Summary: 合同模板实例化渲染.
     *
     * @param RenderInnerTemplateinstanceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return RenderInnerTemplateinstanceResponse
     */
    public function renderInnerTemplateinstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RenderInnerTemplateinstanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateinstance.render', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询营销分
     * Summary: 批量查询营销分.
     *
     * @param BatchqueryInnerMarketingscoreRequest $request
     *
     * @return BatchqueryInnerMarketingscoreResponse
     */
    public function batchqueryInnerMarketingscore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryInnerMarketingscoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询营销分
     * Summary: 批量查询营销分.
     *
     * @param BatchqueryInnerMarketingscoreRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchqueryInnerMarketingscoreResponse
     */
    public function batchqueryInnerMarketingscoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryInnerMarketingscoreResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.marketingscore.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建客服信息
     * Summary: 创建客服信息.
     *
     * @param CreateInnerCustomerserviceRequest $request
     *
     * @return CreateInnerCustomerserviceResponse
     */
    public function createInnerCustomerservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerCustomerserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建客服信息
     * Summary: 创建客服信息.
     *
     * @param CreateInnerCustomerserviceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateInnerCustomerserviceResponse
     */
    public function createInnerCustomerserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerCustomerserviceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.customerservice.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新客服信息
     * Summary: 更新客服信息.
     *
     * @param UpdateInnerCustomerserviceRequest $request
     *
     * @return UpdateInnerCustomerserviceResponse
     */
    public function updateInnerCustomerservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInnerCustomerserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新客服信息
     * Summary: 更新客服信息.
     *
     * @param UpdateInnerCustomerserviceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateInnerCustomerserviceResponse
     */
    public function updateInnerCustomerserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInnerCustomerserviceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.customerservice.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询客服信息
     * Summary:  分页查询客服信息.
     *
     * @param PagequeryInnerCustomerserviceRequest $request
     *
     * @return PagequeryInnerCustomerserviceResponse
     */
    public function pagequeryInnerCustomerservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerCustomerserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询客服信息
     * Summary:  分页查询客服信息.
     *
     * @param PagequeryInnerCustomerserviceRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return PagequeryInnerCustomerserviceResponse
     */
    public function pagequeryInnerCustomerserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerCustomerserviceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.customerservice.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取客服信息详情
     * Summary: 获取客服信息详情.
     *
     * @param DetailInnerCustomerserviceRequest $request
     *
     * @return DetailInnerCustomerserviceResponse
     */
    public function detailInnerCustomerservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerCustomerserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取客服信息详情
     * Summary: 获取客服信息详情.
     *
     * @param DetailInnerCustomerserviceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DetailInnerCustomerserviceResponse
     */
    public function detailInnerCustomerserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerCustomerserviceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.customerservice.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取代理商客服信息模版
     * Summary: 获取代理商客服信息模版.
     *
     * @param GetInnerCustomerservicetemplateRequest $request
     *
     * @return GetInnerCustomerservicetemplateResponse
     */
    public function getInnerCustomerservicetemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerCustomerservicetemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取代理商客服信息模版
     * Summary: 获取代理商客服信息模版.
     *
     * @param GetInnerCustomerservicetemplateRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return GetInnerCustomerservicetemplateResponse
     */
    public function getInnerCustomerservicetemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerCustomerservicetemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.customerservicetemplate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取模板实例化后的模板信息，包括pdf下载链接
     * Summary: 获取模板实例化后的模板信息.
     *
     * @param QueryInnerTemplateinstanceRequest $request
     *
     * @return QueryInnerTemplateinstanceResponse
     */
    public function queryInnerTemplateinstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTemplateinstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取模板实例化后的模板信息，包括pdf下载链接
     * Summary: 获取模板实例化后的模板信息.
     *
     * @param QueryInnerTemplateinstanceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryInnerTemplateinstanceResponse
     */
    public function queryInnerTemplateinstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTemplateinstanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templateinstance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户类目信息详情
     * Summary: 查询租户类目信息详情.
     *
     * @param QueryInnerTenantindirectmainclassRequest $request
     *
     * @return QueryInnerTenantindirectmainclassResponse
     */
    public function queryInnerTenantindirectmainclass($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTenantindirectmainclassEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户类目信息详情
     * Summary: 查询租户类目信息详情.
     *
     * @param QueryInnerTenantindirectmainclassRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryInnerTenantindirectmainclassResponse
     */
    public function queryInnerTenantindirectmainclassEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTenantindirectmainclassResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.tenantindirectmainclass.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改租户间联类目类目信息
     * Summary: 修改租户间联类目类目信息.
     *
     * @param UpdateInnerTenantindirectmainclassRequest $request
     *
     * @return UpdateInnerTenantindirectmainclassResponse
     */
    public function updateInnerTenantindirectmainclass($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInnerTenantindirectmainclassEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改租户间联类目类目信息
     * Summary: 修改租户间联类目类目信息.
     *
     * @param UpdateInnerTenantindirectmainclassRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return UpdateInnerTenantindirectmainclassResponse
     */
    public function updateInnerTenantindirectmainclassEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInnerTenantindirectmainclassResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.tenantindirectmainclass.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 模板同步上线时强管控字段校验未通过提交后台审核
     * Summary: 模板同步上线审核提交.
     *
     * @param SubmitInnerTemplatesyncreviewRequest $request
     *
     * @return SubmitInnerTemplatesyncreviewResponse
     */
    public function submitInnerTemplatesyncreview($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerTemplatesyncreviewEx($request, $headers, $runtime);
    }

    /**
     * Description: 模板同步上线时强管控字段校验未通过提交后台审核
     * Summary: 模板同步上线审核提交.
     *
     * @param SubmitInnerTemplatesyncreviewRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return SubmitInnerTemplatesyncreviewResponse
     */
    public function submitInnerTemplatesyncreviewEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerTemplatesyncreviewResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templatesyncreview.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 待办事件处理
     * Summary: 待办事件处理.
     *
     * @param SubmitInnerPendingeventRequest $request
     *
     * @return SubmitInnerPendingeventResponse
     */
    public function submitInnerPendingevent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerPendingeventEx($request, $headers, $runtime);
    }

    /**
     * Description: 待办事件处理
     * Summary: 待办事件处理.
     *
     * @param SubmitInnerPendingeventRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SubmitInnerPendingeventResponse
     */
    public function submitInnerPendingeventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerPendingeventResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.pendingevent.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 待办事件详情查询
     * Summary: 待办事件详情查询.
     *
     * @param DetailInnerPendingeventRequest $request
     *
     * @return DetailInnerPendingeventResponse
     */
    public function detailInnerPendingevent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerPendingeventEx($request, $headers, $runtime);
    }

    /**
     * Description: 待办事件详情查询
     * Summary: 待办事件详情查询.
     *
     * @param DetailInnerPendingeventRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DetailInnerPendingeventResponse
     */
    public function detailInnerPendingeventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerPendingeventResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.pendingevent.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合同模板制作根据已有模板新增合同模板文件
     * Summary: 根据已有模板新增合同模板文件.
     *
     * @param AddInnerTemplateRequest $request
     *
     * @return AddInnerTemplateResponse
     */
    public function addInnerTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addInnerTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 合同模板制作根据已有模板新增合同模板文件
     * Summary: 根据已有模板新增合同模板文件.
     *
     * @param AddInnerTemplateRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddInnerTemplateResponse
     */
    public function addInnerTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddInnerTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.template.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询待办列表
     * Summary: 查询待办列表.
     *
     * @param PagequeryInnerPendingeventRequest $request
     *
     * @return PagequeryInnerPendingeventResponse
     */
    public function pagequeryInnerPendingevent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerPendingeventEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询待办列表
     * Summary: 查询待办列表.
     *
     * @param PagequeryInnerPendingeventRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryInnerPendingeventResponse
     */
    public function pagequeryInnerPendingeventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerPendingeventResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.pendingevent.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改进件信息
     * Summary: 修改进件信息.
     *
     * @param UpdateInnerMerchantpayexpandRequest $request
     *
     * @return UpdateInnerMerchantpayexpandResponse
     */
    public function updateInnerMerchantpayexpand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInnerMerchantpayexpandEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改进件信息
     * Summary: 修改进件信息.
     *
     * @param UpdateInnerMerchantpayexpandRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateInnerMerchantpayexpandResponse
     */
    public function updateInnerMerchantpayexpandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInnerMerchantpayexpandResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.merchantpayexpand.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户账号信息
     * Summary: 查询租户账号信息.
     *
     * @param QueryInnerTenantaccountinfoRequest $request
     *
     * @return QueryInnerTenantaccountinfoResponse
     */
    public function queryInnerTenantaccountinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerTenantaccountinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户账号信息
     * Summary: 查询租户账号信息.
     *
     * @param QueryInnerTenantaccountinfoRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryInnerTenantaccountinfoResponse
     */
    public function queryInnerTenantaccountinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerTenantaccountinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.tenantaccountinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建租户账号信息
     * Summary: 创建租户账号信息.
     *
     * @param CreateInnerTenantaccountinfoRequest $request
     *
     * @return CreateInnerTenantaccountinfoResponse
     */
    public function createInnerTenantaccountinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerTenantaccountinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建租户账号信息
     * Summary: 创建租户账号信息.
     *
     * @param CreateInnerTenantaccountinfoRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateInnerTenantaccountinfoResponse
     */
    public function createInnerTenantaccountinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerTenantaccountinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.tenantaccountinfo.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询代理商客服人员信息
     * Summary: 查询代理商客服人员信息.
     *
     * @param GetInnerAgentcustomerserviceRequest $request
     *
     * @return GetInnerAgentcustomerserviceResponse
     */
    public function getInnerAgentcustomerservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInnerAgentcustomerserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询代理商客服人员信息
     * Summary: 查询代理商客服人员信息.
     *
     * @param GetInnerAgentcustomerserviceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return GetInnerAgentcustomerserviceResponse
     */
    public function getInnerAgentcustomerserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInnerAgentcustomerserviceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agentcustomerservice.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存代理商客服人员信息
     * Summary: 保存代理商客服人员信息.
     *
     * @param SaveInnerAgentcustomerserviceRequest $request
     *
     * @return SaveInnerAgentcustomerserviceResponse
     */
    public function saveInnerAgentcustomerservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveInnerAgentcustomerserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存代理商客服人员信息
     * Summary: 保存代理商客服人员信息.
     *
     * @param SaveInnerAgentcustomerserviceRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return SaveInnerAgentcustomerserviceResponse
     */
    public function saveInnerAgentcustomerserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveInnerAgentcustomerserviceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agentcustomerservice.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询sls日志
     * Summary: 查询sls日志.
     *
     * @param QueryInnerLoggerRequest $request
     *
     * @return QueryInnerLoggerResponse
     */
    public function queryInnerLogger($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerLoggerEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询sls日志
     * Summary: 查询sls日志.
     *
     * @param QueryInnerLoggerRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryInnerLoggerResponse
     */
    public function queryInnerLoggerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerLoggerResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.logger.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 离线数据下载
     * Summary: 离线数据下载.
     *
     * @param SubmitInnerDatadownloadRequest $request
     *
     * @return SubmitInnerDatadownloadResponse
     */
    public function submitInnerDatadownload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerDatadownloadEx($request, $headers, $runtime);
    }

    /**
     * Description: 离线数据下载
     * Summary: 离线数据下载.
     *
     * @param SubmitInnerDatadownloadRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SubmitInnerDatadownloadResponse
     */
    public function submitInnerDatadownloadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerDatadownloadResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.datadownload.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据下载列表
     * Summary: 查询数据下载列表.
     *
     * @param PagequeryInnerDatadownloadRequest $request
     *
     * @return PagequeryInnerDatadownloadResponse
     */
    public function pagequeryInnerDatadownload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerDatadownloadEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据下载列表
     * Summary: 查询数据下载列表.
     *
     * @param PagequeryInnerDatadownloadRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryInnerDatadownloadResponse
     */
    public function pagequeryInnerDatadownloadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerDatadownloadResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.datadownload.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除下载任务
     * Summary: 删除下载任务
     *
     * @param DeleteInnerDatadownloadRequest $request
     *
     * @return DeleteInnerDatadownloadResponse
     */
    public function deleteInnerDatadownload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteInnerDatadownloadEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除下载任务
     * Summary: 删除下载任务
     *
     * @param DeleteInnerDatadownloadRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteInnerDatadownloadResponse
     */
    public function deleteInnerDatadownloadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteInnerDatadownloadResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.datadownload.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询公司信息
     * Summary: 分页查询公司信息.
     *
     * @param PagequeryInnerCompanyinfoRequest $request
     *
     * @return PagequeryInnerCompanyinfoResponse
     */
    public function pagequeryInnerCompanyinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerCompanyinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询公司信息
     * Summary: 分页查询公司信息.
     *
     * @param PagequeryInnerCompanyinfoRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return PagequeryInnerCompanyinfoResponse
     */
    public function pagequeryInnerCompanyinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerCompanyinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.companyinfo.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商户进件流程节点
     * Summary: 查询商户进件流程节点.
     *
     * @param QueryInnerExpandprocessRequest $request
     *
     * @return QueryInnerExpandprocessResponse
     */
    public function queryInnerExpandprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerExpandprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商户进件流程节点
     * Summary: 查询商户进件流程节点.
     *
     * @param QueryInnerExpandprocessRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryInnerExpandprocessResponse
     */
    public function queryInnerExpandprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerExpandprocessResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.expandprocess.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-基础信息查询
     * Summary: 商家自定义知识库-基础信息查询.
     *
     * @param QueryKnowledgeBaseinfoRequest $request
     *
     * @return QueryKnowledgeBaseinfoResponse
     */
    public function queryKnowledgeBaseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryKnowledgeBaseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-基础信息查询
     * Summary: 商家自定义知识库-基础信息查询.
     *
     * @param QueryKnowledgeBaseinfoRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryKnowledgeBaseinfoResponse
     */
    public function queryKnowledgeBaseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryKnowledgeBaseinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.baseinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-创建用户自定义知识库
     * Summary: 商家自定义知识库-创建用户自定义知识库.
     *
     * @param CreateKnowledgeCategoryRequest $request
     *
     * @return CreateKnowledgeCategoryResponse
     */
    public function createKnowledgeCategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createKnowledgeCategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-创建用户自定义知识库
     * Summary: 商家自定义知识库-创建用户自定义知识库.
     *
     * @param CreateKnowledgeCategoryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateKnowledgeCategoryResponse
     */
    public function createKnowledgeCategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateKnowledgeCategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.category.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-查询知识库信息列表
     * Summary: 商家自定义知识库-查询知识库信息列表.
     *
     * @param PagequeryKnowledgeCategoryRequest $request
     *
     * @return PagequeryKnowledgeCategoryResponse
     */
    public function pagequeryKnowledgeCategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryKnowledgeCategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-查询知识库信息列表
     * Summary: 商家自定义知识库-查询知识库信息列表.
     *
     * @param PagequeryKnowledgeCategoryRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryKnowledgeCategoryResponse
     */
    public function pagequeryKnowledgeCategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryKnowledgeCategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.category.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-新增知识知识库信息
     * Summary: 商家自定义知识库-新增知识知识库信息.
     *
     * @param AddKnowledgeCategoryRequest $request
     *
     * @return AddKnowledgeCategoryResponse
     */
    public function addKnowledgeCategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addKnowledgeCategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-新增知识知识库信息
     * Summary: 商家自定义知识库-新增知识知识库信息.
     *
     * @param AddKnowledgeCategoryRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return AddKnowledgeCategoryResponse
     */
    public function addKnowledgeCategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddKnowledgeCategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.category.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-知识库信息批量删除
     * Summary: 商家自定义知识库-知识库信息批量删除.
     *
     * @param BatchdeleteKnowledgeCategoryRequest $request
     *
     * @return BatchdeleteKnowledgeCategoryResponse
     */
    public function batchdeleteKnowledgeCategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteKnowledgeCategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-知识库信息批量删除
     * Summary: 商家自定义知识库-知识库信息批量删除.
     *
     * @param BatchdeleteKnowledgeCategoryRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchdeleteKnowledgeCategoryResponse
     */
    public function batchdeleteKnowledgeCategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteKnowledgeCategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.category.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-编辑知识点
     * Summary: 商家自定义知识库-编辑知识点.
     *
     * @param UpdateKnowledgeCategoryRequest $request
     *
     * @return UpdateKnowledgeCategoryResponse
     */
    public function updateKnowledgeCategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateKnowledgeCategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-编辑知识点
     * Summary: 商家自定义知识库-编辑知识点.
     *
     * @param UpdateKnowledgeCategoryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateKnowledgeCategoryResponse
     */
    public function updateKnowledgeCategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateKnowledgeCategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.category.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-知识点流程撤回/上线/下线
     * Summary: 商家自定义知识库-知识点相关功能.
     *
     * @param OperateKnowledgeCategoryRequest $request
     *
     * @return OperateKnowledgeCategoryResponse
     */
    public function operateKnowledgeCategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateKnowledgeCategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-知识点流程撤回/上线/下线
     * Summary: 商家自定义知识库-知识点相关功能.
     *
     * @param OperateKnowledgeCategoryRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return OperateKnowledgeCategoryResponse
     */
    public function operateKnowledgeCategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateKnowledgeCategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.category.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-基础信息维护
     * Summary: 商家自定义知识库-基础信息维护.
     *
     * @param SubmitKnowledgeBaseinfoRequest $request
     *
     * @return SubmitKnowledgeBaseinfoResponse
     */
    public function submitKnowledgeBaseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitKnowledgeBaseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-基础信息维护
     * Summary: 商家自定义知识库-基础信息维护.
     *
     * @param SubmitKnowledgeBaseinfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SubmitKnowledgeBaseinfoResponse
     */
    public function submitKnowledgeBaseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitKnowledgeBaseinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.baseinfo.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户知识库-知识点全量提交
     * Summary: 商户知识库-知识点全量提交.
     *
     * @param SubmitKnowledgeCategoryRequest $request
     *
     * @return SubmitKnowledgeCategoryResponse
     */
    public function submitKnowledgeCategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitKnowledgeCategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户知识库-知识点全量提交
     * Summary: 商户知识库-知识点全量提交.
     *
     * @param SubmitKnowledgeCategoryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SubmitKnowledgeCategoryResponse
     */
    public function submitKnowledgeCategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitKnowledgeCategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.category.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-查询知识库id
     * Summary: 商家自定义知识库-查询知识库id.
     *
     * @param QueryKnowledgeCategorylibraryRequest $request
     *
     * @return QueryKnowledgeCategorylibraryResponse
     */
    public function queryKnowledgeCategorylibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryKnowledgeCategorylibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-查询知识库id
     * Summary: 商家自定义知识库-查询知识库id.
     *
     * @param QueryKnowledgeCategorylibraryRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryKnowledgeCategorylibraryResponse
     */
    public function queryKnowledgeCategorylibraryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryKnowledgeCategorylibraryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.knowledge.categorylibrary.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-基础信息维护
     * Summary: 商家自定义知识库-基础信息维护.
     *
     * @param SubmitInnerKnowledgebaseinfoRequest $request
     *
     * @return SubmitInnerKnowledgebaseinfoResponse
     */
    public function submitInnerKnowledgebaseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerKnowledgebaseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-基础信息维护
     * Summary: 商家自定义知识库-基础信息维护.
     *
     * @param SubmitInnerKnowledgebaseinfoRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return SubmitInnerKnowledgebaseinfoResponse
     */
    public function submitInnerKnowledgebaseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerKnowledgebaseinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgebaseinfo.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-基础信息查询
     * Summary: 商家自定义知识库-基础信息查询.
     *
     * @param QueryInnerKnowledgebaseinfoRequest $request
     *
     * @return QueryInnerKnowledgebaseinfoResponse
     */
    public function queryInnerKnowledgebaseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerKnowledgebaseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-基础信息查询
     * Summary: 商家自定义知识库-基础信息查询.
     *
     * @param QueryInnerKnowledgebaseinfoRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryInnerKnowledgebaseinfoResponse
     */
    public function queryInnerKnowledgebaseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerKnowledgebaseinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgebaseinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 户知识库-知识点全量提交
     * Summary: 户知识库-知识点全量提交.
     *
     * @param SubmitInnerKnowledgecategoryRequest $request
     *
     * @return SubmitInnerKnowledgecategoryResponse
     */
    public function submitInnerKnowledgecategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerKnowledgecategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 户知识库-知识点全量提交
     * Summary: 户知识库-知识点全量提交.
     *
     * @param SubmitInnerKnowledgecategoryRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return SubmitInnerKnowledgecategoryResponse
     */
    public function submitInnerKnowledgecategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerKnowledgecategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgecategory.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-查询知识库id
     * Summary: 商家自定义知识库-查询知识库id.
     *
     * @param QueryInnerKnowledgecategorylibraryRequest $request
     *
     * @return QueryInnerKnowledgecategorylibraryResponse
     */
    public function queryInnerKnowledgecategorylibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerKnowledgecategorylibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-查询知识库id
     * Summary: 商家自定义知识库-查询知识库id.
     *
     * @param QueryInnerKnowledgecategorylibraryRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryInnerKnowledgecategorylibraryResponse
     */
    public function queryInnerKnowledgecategorylibraryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerKnowledgecategorylibraryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgecategorylibrary.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-创建用户自定义知识库
     * Summary: 商家自定义知识库-创建用户自定义知识库.
     *
     * @param CreateInnerKnowledgecategoryRequest $request
     *
     * @return CreateInnerKnowledgecategoryResponse
     */
    public function createInnerKnowledgecategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerKnowledgecategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-创建用户自定义知识库
     * Summary: 商家自定义知识库-创建用户自定义知识库.
     *
     * @param CreateInnerKnowledgecategoryRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateInnerKnowledgecategoryResponse
     */
    public function createInnerKnowledgecategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerKnowledgecategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgecategory.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-知识库信息批量删除
     * Summary: 商家自定义知识库-知识库信息批量删除.
     *
     * @param BatchdeleteInnerKnowledgecategoryRequest $request
     *
     * @return BatchdeleteInnerKnowledgecategoryResponse
     */
    public function batchdeleteInnerKnowledgecategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteInnerKnowledgecategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-知识库信息批量删除
     * Summary: 商家自定义知识库-知识库信息批量删除.
     *
     * @param BatchdeleteInnerKnowledgecategoryRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return BatchdeleteInnerKnowledgecategoryResponse
     */
    public function batchdeleteInnerKnowledgecategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteInnerKnowledgecategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgecategory.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-知识点相关功能
     * Summary: 商家自定义知识库-知识点相关功能.
     *
     * @param OperateInnerKnowledgecategoryRequest $request
     *
     * @return OperateInnerKnowledgecategoryResponse
     */
    public function operateInnerKnowledgecategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateInnerKnowledgecategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-知识点相关功能
     * Summary: 商家自定义知识库-知识点相关功能.
     *
     * @param OperateInnerKnowledgecategoryRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return OperateInnerKnowledgecategoryResponse
     */
    public function operateInnerKnowledgecategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateInnerKnowledgecategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgecategory.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-新增知识知识库信息
     * Summary: 商家自定义知识库-新增知识知识库信息.
     *
     * @param AddInnerKnowledgecategoryRequest $request
     *
     * @return AddInnerKnowledgecategoryResponse
     */
    public function addInnerKnowledgecategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addInnerKnowledgecategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-新增知识知识库信息
     * Summary: 商家自定义知识库-新增知识知识库信息.
     *
     * @param AddInnerKnowledgecategoryRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return AddInnerKnowledgecategoryResponse
     */
    public function addInnerKnowledgecategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddInnerKnowledgecategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgecategory.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * 商家自定义知识库-查询知识库信息列表
     * Summary:  商家自定义知识库-查询知识库信息列表.
     *
     * @param PagequeryInnerKnowledgecategoryRequest $request
     *
     * @return PagequeryInnerKnowledgecategoryResponse
     */
    public function pagequeryInnerKnowledgecategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerKnowledgecategoryEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * 商家自定义知识库-查询知识库信息列表
     * Summary:  商家自定义知识库-查询知识库信息列表.
     *
     * @param PagequeryInnerKnowledgecategoryRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return PagequeryInnerKnowledgecategoryResponse
     */
    public function pagequeryInnerKnowledgecategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerKnowledgecategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgecategory.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家自定义知识库-编辑知识点
     * Summary: 商家自定义知识库-编辑知识点.
     *
     * @param UpdateInnerKnowledgecategoryRequest $request
     *
     * @return UpdateInnerKnowledgecategoryResponse
     */
    public function updateInnerKnowledgecategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInnerKnowledgecategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家自定义知识库-编辑知识点
     * Summary: 商家自定义知识库-编辑知识点.
     *
     * @param UpdateInnerKnowledgecategoryRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateInnerKnowledgecategoryResponse
     */
    public function updateInnerKnowledgecategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInnerKnowledgecategoryResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.knowledgecategory.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
     * Summary: 分销渠道创建.
     *
     * @param CreateInnerSaleschannelRequest $request
     *
     * @return CreateInnerSaleschannelResponse
     */
    public function createInnerSaleschannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerSaleschannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 可以通过此接口创建分销渠道，创建成功后返回子渠道的信息
     * Summary: 分销渠道创建.
     *
     * @param CreateInnerSaleschannelRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateInnerSaleschannelResponse
     */
    public function createInnerSaleschannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerSaleschannelResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.saleschannel.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询分销渠道code、名称、级别等信息
     * Summary: 分销渠道查询.
     *
     * @param QueryInnerSaleschannelRequest $request
     *
     * @return QueryInnerSaleschannelResponse
     */
    public function queryInnerSaleschannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerSaleschannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询分销渠道code、名称、级别等信息
     * Summary: 分销渠道查询.
     *
     * @param QueryInnerSaleschannelRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryInnerSaleschannelResponse
     */
    public function queryInnerSaleschannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerSaleschannelResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.saleschannel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分销渠道更新，当前支持修改渠道名称
     * Summary: 分销渠道更新.
     *
     * @param UpdateInnerSaleschannelRequest $request
     *
     * @return UpdateInnerSaleschannelResponse
     */
    public function updateInnerSaleschannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInnerSaleschannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 分销渠道更新，当前支持修改渠道名称
     * Summary: 分销渠道更新.
     *
     * @param UpdateInnerSaleschannelRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateInnerSaleschannelResponse
     */
    public function updateInnerSaleschannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInnerSaleschannelResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.saleschannel.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除所选的分销渠道
     * Summary: 分销渠道删除.
     *
     * @param DeleteInnerSaleschannelRequest $request
     *
     * @return DeleteInnerSaleschannelResponse
     */
    public function deleteInnerSaleschannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteInnerSaleschannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除所选的分销渠道
     * Summary: 分销渠道删除.
     *
     * @param DeleteInnerSaleschannelRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteInnerSaleschannelResponse
     */
    public function deleteInnerSaleschannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteInnerSaleschannelResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.saleschannel.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建文本域（组件）
     * Summary: 批量创建文本域
     *
     * @param BatchcreateInnerTemplatetextareaRequest $request
     *
     * @return BatchcreateInnerTemplatetextareaResponse
     */
    public function batchcreateInnerTemplatetextarea($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateInnerTemplatetextareaEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建文本域（组件）
     * Summary: 批量创建文本域
     *
     * @param BatchcreateInnerTemplatetextareaRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return BatchcreateInnerTemplatetextareaResponse
     */
    public function batchcreateInnerTemplatetextareaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateInnerTemplatetextareaResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.templatetextarea.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异步解约申请列表
     * Summary: 异步解约申请列表.
     *
     * @param PagequeryInnerAgreementterminateRequest $request
     *
     * @return PagequeryInnerAgreementterminateResponse
     */
    public function pagequeryInnerAgreementterminate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerAgreementterminateEx($request, $headers, $runtime);
    }

    /**
     * Description: 异步解约申请列表
     * Summary: 异步解约申请列表.
     *
     * @param PagequeryInnerAgreementterminateRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return PagequeryInnerAgreementterminateResponse
     */
    public function pagequeryInnerAgreementterminateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerAgreementterminateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agreementterminate.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解约申请记录详情
     * Summary: 解约申请记录详情.
     *
     * @param DetailInnerAgreementterminateRequest $request
     *
     * @return DetailInnerAgreementterminateResponse
     */
    public function detailInnerAgreementterminate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerAgreementterminateEx($request, $headers, $runtime);
    }

    /**
     * Description: 解约申请记录详情
     * Summary: 解约申请记录详情.
     *
     * @param DetailInnerAgreementterminateRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return DetailInnerAgreementterminateResponse
     */
    public function detailInnerAgreementterminateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerAgreementterminateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agreementterminate.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣解约申请处理
     * Summary: 代扣解约申请处理.
     *
     * @param OperateInnerAgreementterminateRequest $request
     *
     * @return OperateInnerAgreementterminateResponse
     */
    public function operateInnerAgreementterminate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateInnerAgreementterminateEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣解约申请处理
     * Summary: 代扣解约申请处理.
     *
     * @param OperateInnerAgreementterminateRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return OperateInnerAgreementterminateResponse
     */
    public function operateInnerAgreementterminateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateInnerAgreementterminateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agreementterminate.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户补充拒绝举证材料
     * Summary: 商户补充拒绝举证材料.
     *
     * @param ChargeInnerAgreementterminateevidenceRequest $request
     *
     * @return ChargeInnerAgreementterminateevidenceResponse
     */
    public function chargeInnerAgreementterminateevidence($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->chargeInnerAgreementterminateevidenceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户补充拒绝举证材料
     * Summary: 商户补充拒绝举证材料.
     *
     * @param ChargeInnerAgreementterminateevidenceRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return ChargeInnerAgreementterminateevidenceResponse
     */
    public function chargeInnerAgreementterminateevidenceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ChargeInnerAgreementterminateevidenceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agreementterminateevidence.charge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣异步解约-支付宝是否直接解约
     * Summary: 代扣异步解约-支付宝是否直接解约.
     *
     * @param OperateInnerAgreementterminatezfbdirectRequest $request
     *
     * @return OperateInnerAgreementterminatezfbdirectResponse
     */
    public function operateInnerAgreementterminatezfbdirect($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateInnerAgreementterminatezfbdirectEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣异步解约-支付宝是否直接解约
     * Summary: 代扣异步解约-支付宝是否直接解约.
     *
     * @param OperateInnerAgreementterminatezfbdirectRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return OperateInnerAgreementterminatezfbdirectResponse
     */
    public function operateInnerAgreementterminatezfbdirectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateInnerAgreementterminatezfbdirectResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agreementterminatezfbdirect.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解约申请配置详情
     * Summary: 解约申请配置详情.
     *
     * @param QueryInnerAgreementterminateconfigRequest $request
     *
     * @return QueryInnerAgreementterminateconfigResponse
     */
    public function queryInnerAgreementterminateconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerAgreementterminateconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 解约申请配置详情
     * Summary: 解约申请配置详情.
     *
     * @param QueryInnerAgreementterminateconfigRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryInnerAgreementterminateconfigResponse
     */
    public function queryInnerAgreementterminateconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerAgreementterminateconfigResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agreementterminateconfig.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解约申请商户各状态统计
     * Summary: 解约申请商户各状态统计
     *
     * @param CountInnerAgreementterminateRequest $request
     *
     * @return CountInnerAgreementterminateResponse
     */
    public function countInnerAgreementterminate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countInnerAgreementterminateEx($request, $headers, $runtime);
    }

    /**
     * Description: 解约申请商户各状态统计
     * Summary: 解约申请商户各状态统计
     *
     * @param CountInnerAgreementterminateRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CountInnerAgreementterminateResponse
     */
    public function countInnerAgreementterminateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountInnerAgreementterminateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agreementterminate.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣异步解约-商户侧间连二级户或者为特殊直连下级商户需要查询订单详情
     * Summary: 代扣异步解约商户侧二级户查询订单.
     *
     * @param QueryInnerAgreementterminateorderRequest $request
     *
     * @return QueryInnerAgreementterminateorderResponse
     */
    public function queryInnerAgreementterminateorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerAgreementterminateorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣异步解约-商户侧间连二级户或者为特殊直连下级商户需要查询订单详情
     * Summary: 代扣异步解约商户侧二级户查询订单.
     *
     * @param QueryInnerAgreementterminateorderRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryInnerAgreementterminateorderResponse
     */
    public function queryInnerAgreementterminateorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerAgreementterminateorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.agreementterminateorder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享商户侧商品列表查询
     * Summary: 随时享商户侧商品列表查询.
     *
     * @param PagequeryInnerPlatformproductRequest $request
     *
     * @return PagequeryInnerPlatformproductResponse
     */
    public function pagequeryInnerPlatformproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerPlatformproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享商户侧商品列表查询
     * Summary: 随时享商户侧商品列表查询.
     *
     * @param PagequeryInnerPlatformproductRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return PagequeryInnerPlatformproductResponse
     */
    public function pagequeryInnerPlatformproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerPlatformproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.platformproduct.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享商户侧商品详情查询
     * Summary: 随时享商户侧商品详情查询.
     *
     * @param DetailInnerPlatformproductRequest $request
     *
     * @return DetailInnerPlatformproductResponse
     */
    public function detailInnerPlatformproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerPlatformproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享商户侧商品详情查询
     * Summary: 随时享商户侧商品详情查询.
     *
     * @param DetailInnerPlatformproductRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DetailInnerPlatformproductResponse
     */
    public function detailInnerPlatformproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerPlatformproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.platformproduct.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享商户侧商品报名或者编辑
     * Summary: 随时享商户侧商品报名或者编辑.
     *
     * @param SubmitInnerPlatformproductRequest $request
     *
     * @return SubmitInnerPlatformproductResponse
     */
    public function submitInnerPlatformproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitInnerPlatformproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享商户侧商品报名或者编辑
     * Summary: 随时享商户侧商品报名或者编辑.
     *
     * @param SubmitInnerPlatformproductRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SubmitInnerPlatformproductResponse
     */
    public function submitInnerPlatformproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitInnerPlatformproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.platformproduct.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享商户侧商品报名退出
     * Summary: 随时享商户侧商品报名退出.
     *
     * @param ReclaimInnerPlatformproductRequest $request
     *
     * @return ReclaimInnerPlatformproductResponse
     */
    public function reclaimInnerPlatformproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reclaimInnerPlatformproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享商户侧商品报名退出
     * Summary: 随时享商户侧商品报名退出.
     *
     * @param ReclaimInnerPlatformproductRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ReclaimInnerPlatformproductResponse
     */
    public function reclaimInnerPlatformproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReclaimInnerPlatformproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.platformproduct.reclaim', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享商户侧商品租赁价格配置
     * Summary: 随时享商户侧商品租赁价格配置.
     *
     * @param SetInnerPlatformproductRequest $request
     *
     * @return SetInnerPlatformproductResponse
     */
    public function setInnerPlatformproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setInnerPlatformproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享商户侧商品租赁价格配置
     * Summary: 随时享商户侧商品租赁价格配置.
     *
     * @param SetInnerPlatformproductRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SetInnerPlatformproductResponse
     */
    public function setInnerPlatformproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetInnerPlatformproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.platformproduct.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询授权协议状态
     * Summary: 授权协议状态查询.
     *
     * @param QueryInnerAuthagreementRequest $request
     *
     * @return QueryInnerAuthagreementResponse
     */
    public function queryInnerAuthagreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInnerAuthagreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询授权协议状态
     * Summary: 授权协议状态查询.
     *
     * @param QueryInnerAuthagreementRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryInnerAuthagreementResponse
     */
    public function queryInnerAuthagreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInnerAuthagreementResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.authagreement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 访问需授权的业务功能是进行协议授权确认
     * Summary: 协议授权确认.
     *
     * @param ConfirmInnerAuthagreementRequest $request
     *
     * @return ConfirmInnerAuthagreementResponse
     */
    public function confirmInnerAuthagreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmInnerAuthagreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 访问需授权的业务功能是进行协议授权确认
     * Summary: 协议授权确认.
     *
     * @param ConfirmInnerAuthagreementRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ConfirmInnerAuthagreementResponse
     */
    public function confirmInnerAuthagreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmInnerAuthagreementResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.authagreement.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台场景分页列表
     * Summary: 随时享-服务商平台场景分页列表.
     *
     * @param PagequeryInnerSceneproductRequest $request
     *
     * @return PagequeryInnerSceneproductResponse
     */
    public function pagequeryInnerSceneproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerSceneproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台场景分页列表
     * Summary: 随时享-服务商平台场景分页列表.
     *
     * @param PagequeryInnerSceneproductRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryInnerSceneproductResponse
     */
    public function pagequeryInnerSceneproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerSceneproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.sceneproduct.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台场景商品详情
     * Summary: 随时享-服务商平台场景商品详情.
     *
     * @param DetailInnerSceneproductRequest $request
     *
     * @return DetailInnerSceneproductResponse
     */
    public function detailInnerSceneproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailInnerSceneproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台场景商品详情
     * Summary: 随时享-服务商平台场景商品详情.
     *
     * @param DetailInnerSceneproductRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DetailInnerSceneproductResponse
     */
    public function detailInnerSceneproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailInnerSceneproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.sceneproduct.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台场景商品批量添加
     * Summary: 随时享-服务商平台场景商品批量添加.
     *
     * @param BatchcreateInnerSceneproductRequest $request
     *
     * @return BatchcreateInnerSceneproductResponse
     */
    public function batchcreateInnerSceneproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateInnerSceneproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台场景商品批量添加
     * Summary: 随时享-服务商平台场景商品批量添加.
     *
     * @param BatchcreateInnerSceneproductRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchcreateInnerSceneproductResponse
     */
    public function batchcreateInnerSceneproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateInnerSceneproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.sceneproduct.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台场景商品移除
     * Summary: 随时享-服务商平台场景商品移除.
     *
     * @param DeleteInnerSceneproductRequest $request
     *
     * @return DeleteInnerSceneproductResponse
     */
    public function deleteInnerSceneproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteInnerSceneproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台场景商品移除
     * Summary: 随时享-服务商平台场景商品移除.
     *
     * @param DeleteInnerSceneproductRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteInnerSceneproductResponse
     */
    public function deleteInnerSceneproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteInnerSceneproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.sceneproduct.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台场景商品适用商家列表
     * Summary: 随时享-服务商平台场景商品适用商家列表.
     *
     * @param ListInnerSceneproductmerchantRequest $request
     *
     * @return ListInnerSceneproductmerchantResponse
     */
    public function listInnerSceneproductmerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listInnerSceneproductmerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台场景商品适用商家列表
     * Summary: 随时享-服务商平台场景商品适用商家列表.
     *
     * @param ListInnerSceneproductmerchantRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ListInnerSceneproductmerchantResponse
     */
    public function listInnerSceneproductmerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListInnerSceneproductmerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.sceneproductmerchant.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台场景商品适用商家编辑
     * Summary: 随时享-服务商平台场景商品适用商家编辑.
     *
     * @param OperateInnerSceneproductmerchantRequest $request
     *
     * @return OperateInnerSceneproductmerchantResponse
     */
    public function operateInnerSceneproductmerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateInnerSceneproductmerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台场景商品适用商家编辑
     * Summary: 随时享-服务商平台场景商品适用商家编辑.
     *
     * @param OperateInnerSceneproductmerchantRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return OperateInnerSceneproductmerchantResponse
     */
    public function operateInnerSceneproductmerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateInnerSceneproductmerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.sceneproductmerchant.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台场景商品上下架
     * Summary: 随时享-服务商平台场景商品上下架.
     *
     * @param OnlineInnerSceneproductRequest $request
     *
     * @return OnlineInnerSceneproductResponse
     */
    public function onlineInnerSceneproduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->onlineInnerSceneproductEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台场景商品上下架
     * Summary: 随时享-服务商平台场景商品上下架.
     *
     * @param OnlineInnerSceneproductRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return OnlineInnerSceneproductResponse
     */
    public function onlineInnerSceneproductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OnlineInnerSceneproductResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.sceneproduct.online', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户线索跟进中分页查询平台订单、派发和备注信息
     * Summary: 随时享-服务商平台用户线索跟进.
     *
     * @param PagequeryInnerPlatformorderleadRequest $request
     *
     * @return PagequeryInnerPlatformorderleadResponse
     */
    public function pagequeryInnerPlatformorderlead($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerPlatformorderleadEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户线索跟进中分页查询平台订单、派发和备注信息
     * Summary: 随时享-服务商平台用户线索跟进.
     *
     * @param PagequeryInnerPlatformorderleadRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return PagequeryInnerPlatformorderleadResponse
     */
    public function pagequeryInnerPlatformorderleadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerPlatformorderleadResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.platformorderlead.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 平台订单用户线索备注保存
     * Summary: 随时享-服务商平台用户线索跟进备注保存.
     *
     * @param SaveInnerPlatformorderleadRequest $request
     *
     * @return SaveInnerPlatformorderleadResponse
     */
    public function saveInnerPlatformorderlead($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveInnerPlatformorderleadEx($request, $headers, $runtime);
    }

    /**
     * Description: 平台订单用户线索备注保存
     * Summary: 随时享-服务商平台用户线索跟进备注保存.
     *
     * @param SaveInnerPlatformorderleadRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SaveInnerPlatformorderleadResponse
     */
    public function saveInnerPlatformorderleadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveInnerPlatformorderleadResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.platformorderlead.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台-营销场景创建
     * Summary: 营销场景创建.
     *
     * @param CreateInnerPromotionsceneRequest $request
     *
     * @return CreateInnerPromotionsceneResponse
     */
    public function createInnerPromotionscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInnerPromotionsceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台-营销场景创建
     * Summary: 营销场景创建.
     *
     * @param CreateInnerPromotionsceneRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateInnerPromotionsceneResponse
     */
    public function createInnerPromotionsceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInnerPromotionsceneResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.promotionscene.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台-营销场景分页查询
     * Summary: 营销场景分页查询.
     *
     * @param PagequeryInnerPromotionsceneRequest $request
     *
     * @return PagequeryInnerPromotionsceneResponse
     */
    public function pagequeryInnerPromotionscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryInnerPromotionsceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台-营销场景分页查询
     * Summary: 营销场景分页查询.
     *
     * @param PagequeryInnerPromotionsceneRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return PagequeryInnerPromotionsceneResponse
     */
    public function pagequeryInnerPromotionsceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryInnerPromotionsceneResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.promotionscene.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台-营销场景更新
     * Summary: 营销场景更新.
     *
     * @param UpdateInnerPromotionsceneRequest $request
     *
     * @return UpdateInnerPromotionsceneResponse
     */
    public function updateInnerPromotionscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInnerPromotionsceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台-营销场景更新
     * Summary: 营销场景更新.
     *
     * @param UpdateInnerPromotionsceneRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateInnerPromotionsceneResponse
     */
    public function updateInnerPromotionsceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInnerPromotionsceneResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.promotionscene.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 随时享-服务商平台-营销场景删除
     * Summary: 营销场景删除.
     *
     * @param DeleteInnerPromotionsceneRequest $request
     *
     * @return DeleteInnerPromotionsceneResponse
     */
    public function deleteInnerPromotionscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteInnerPromotionsceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 随时享-服务商平台-营销场景删除
     * Summary: 营销场景删除.
     *
     * @param DeleteInnerPromotionsceneRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DeleteInnerPromotionsceneResponse
     */
    public function deleteInnerPromotionsceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteInnerPromotionsceneResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.promotionscene.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 平台订单用户线索备注删除
     * Summary: 随时享-服务商平台用户线索跟进删除备注.
     *
     * @param DeleteInnerPlatformorderleadRequest $request
     *
     * @return DeleteInnerPlatformorderleadResponse
     */
    public function deleteInnerPlatformorderlead($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteInnerPlatformorderleadEx($request, $headers, $runtime);
    }

    /**
     * Description: 平台订单用户线索备注删除
     * Summary: 随时享-服务商平台用户线索跟进删除备注.
     *
     * @param DeleteInnerPlatformorderleadRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return DeleteInnerPlatformorderleadResponse
     */
    public function deleteInnerPlatformorderleadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteInnerPlatformorderleadResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.platformorderlead.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 一键投保
     * Summary: 投保.
     *
     * @param CreateInsureRequest $request
     *
     * @return CreateInsureResponse
     */
    public function createInsure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createInsureEx($request, $headers, $runtime);
    }

    /**
     * Description: 一键投保
     * Summary: 投保.
     *
     * @param CreateInsureRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateInsureResponse
     */
    public function createInsureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateInsureResponse::fromMap($this->doRequest('1.0', 'antchain.ato.insure.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保单查询
     * Summary: 保单查询.
     *
     * @param QueryInsureRequest $request
     *
     * @return QueryInsureResponse
     */
    public function queryInsure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInsureEx($request, $headers, $runtime);
    }

    /**
     * Description: 保单查询
     * Summary: 保单查询.
     *
     * @param QueryInsureRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryInsureResponse
     */
    public function queryInsureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInsureResponse::fromMap($this->doRequest('1.0', 'antchain.ato.insure.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险代扣重试
     * Summary: 保险代扣重试.
     *
     * @param RetryInsurePayRequest $request
     *
     * @return RetryInsurePayResponse
     */
    public function retryInsurePay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryInsurePayEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险代扣重试
     * Summary: 保险代扣重试.
     *
     * @param RetryInsurePayRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RetryInsurePayResponse
     */
    public function retryInsurePayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryInsurePayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.insure.pay.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻.
     *
     * @param RegisterMerchantexpandMerchantRequest $request
     *
     * @return RegisterMerchantexpandMerchantResponse
     */
    public function registerMerchantexpandMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerMerchantexpandMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户入驻
     * Summary: 商户入驻.
     *
     * @param RegisterMerchantexpandMerchantRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return RegisterMerchantexpandMerchantResponse
     */
    public function registerMerchantexpandMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterMerchantexpandMerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.merchant.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接.
     *
     * @param UploadMerchantexpandFileRequest $request
     *
     * @return UploadMerchantexpandFileResponse
     */
    public function uploadMerchantexpandFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadMerchantexpandFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取临时上传文件链接
     * Summary: 获取临时上传文件链接.
     *
     * @param UploadMerchantexpandFileRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UploadMerchantexpandFileResponse
     */
    public function uploadMerchantexpandFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadMerchantexpandFileResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询.
     *
     * @param QueryMerchantexpandMerchantRequest $request
     *
     * @return QueryMerchantexpandMerchantResponse
     */
    public function queryMerchantexpandMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantexpandMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户入驻查询
     * Summary: 商户入驻查询.
     *
     * @param QueryMerchantexpandMerchantRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryMerchantexpandMerchantResponse
     */
    public function queryMerchantexpandMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantexpandMerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.merchant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改.
     *
     * @param UpdateMerchantexpandMerchantRequest $request
     *
     * @return UpdateMerchantexpandMerchantResponse
     */
    public function updateMerchantexpandMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMerchantexpandMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家信息修改
     * Summary: 商家信息修改.
     *
     * @param UpdateMerchantexpandMerchantRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateMerchantexpandMerchantResponse
     */
    public function updateMerchantexpandMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMerchantexpandMerchantResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.merchant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系.
     *
     * @param AddMerchantexpandDividerelationRequest $request
     *
     * @return AddMerchantexpandDividerelationResponse
     */
    public function addMerchantexpandDividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addMerchantexpandDividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加分账绑定关系
     * Summary: 添加分账绑定关系.
     *
     * @param AddMerchantexpandDividerelationRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return AddMerchantexpandDividerelationResponse
     */
    public function addMerchantexpandDividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddMerchantexpandDividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.dividerelation.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询.
     *
     * @param QueryMerchantexpandDividerelationRequest $request
     *
     * @return QueryMerchantexpandDividerelationResponse
     */
    public function queryMerchantexpandDividerelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantexpandDividerelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账绑定关系查询
     * Summary: 分账绑定关系查询.
     *
     * @param QueryMerchantexpandDividerelationRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryMerchantexpandDividerelationResponse
     */
    public function queryMerchantexpandDividerelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantexpandDividerelationResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.dividerelation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 二级户进件绑定结算卡信息
     * Summary: 二级户进件绑定结算卡信息.
     *
     * @param BindMerchantexpandSettlecardRequest $request
     *
     * @return BindMerchantexpandSettlecardResponse
     */
    public function bindMerchantexpandSettlecard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindMerchantexpandSettlecardEx($request, $headers, $runtime);
    }

    /**
     * Description: 二级户进件绑定结算卡信息
     * Summary: 二级户进件绑定结算卡信息.
     *
     * @param BindMerchantexpandSettlecardRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BindMerchantexpandSettlecardResponse
     */
    public function bindMerchantexpandSettlecardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindMerchantexpandSettlecardResponse::fromMap($this->doRequest('1.0', 'antchain.ato.merchantexpand.settlecard.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     *
     * @param CreateRealpersonFacevrfRequest $request
     *
     * @return CreateRealpersonFacevrfResponse
     */
    public function createRealpersonFacevrf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRealpersonFacevrfEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信身份认证，创建认证
     * Summary: 创建认证
     *
     * @param CreateRealpersonFacevrfRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateRealpersonFacevrfResponse
     */
    public function createRealpersonFacevrfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRealpersonFacevrfResponse::fromMap($this->doRequest('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果.
     *
     * @param QueryRealpersonFacevrfRequest $request
     *
     * @return QueryRealpersonFacevrfResponse
     */
    public function queryRealpersonFacevrf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRealpersonFacevrfEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询认证的结果和相关信息
     * Summary: 查询认证结果.
     *
     * @param QueryRealpersonFacevrfRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryRealpersonFacevrfResponse
     */
    public function queryRealpersonFacevrfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRealpersonFacevrfResponse::fromMap($this->doRequest('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起风控分析，获取风险分
     * Summary: 发起风控分析，获取风险分.
     *
     * @param QueryRiskRequest $request
     *
     * @return QueryRiskResponse
     */
    public function queryRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起风控分析，获取风险分
     * Summary: 发起风控分析，获取风险分.
     *
     * @param QueryRiskRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryRiskResponse
     */
    public function queryRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRiskResponse::fromMap($this->doRequest('1.0', 'antchain.ato.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 云 api 发起风控分析，获取风险评估
     * Summary: 云 api 发起风控分析，获取风险评估.
     *
     * @param QueryRiskGoRequest $request
     *
     * @return QueryRiskGoResponse
     */
    public function queryRiskGo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRiskGoEx($request, $headers, $runtime);
    }

    /**
     * Description: 云 api 发起风控分析，获取风险评估
     * Summary: 云 api 发起风控分析，获取风险评估.
     *
     * @param QueryRiskGoRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryRiskGoResponse
     */
    public function queryRiskGoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRiskGoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.risk.go.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 小程序云调用，上报计量信息
     * Summary: 小程序云调用，上报计量信息.
     *
     * @param UploadInnerRiskcallRequest $request
     *
     * @return UploadInnerRiskcallResponse
     */
    public function uploadInnerRiskcall($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadInnerRiskcallEx($request, $headers, $runtime);
    }

    /**
     * Description: 小程序云调用，上报计量信息
     * Summary: 小程序云调用，上报计量信息.
     *
     * @param UploadInnerRiskcallRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UploadInnerRiskcallResponse
     */
    public function uploadInnerRiskcallEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadInnerRiskcallResponse::fromMap($this->doRequest('1.0', 'antchain.ato.inner.riskcall.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     *
     * @param AllSignTemplateRequest $request
     *
     * @return AllSignTemplateResponse
     */
    public function allSignTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allSignTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同签署的合同模板查询服务
     * Summary: 电子合同签署的合同模板查询服务
     *
     * @param AllSignTemplateRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AllSignTemplateResponse
     */
    public function allSignTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllSignTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）.
     *
     * @param SubmitSignFlowRequest $request
     *
     * @return SubmitSignFlowResponse
     */
    public function submitSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交电子合同的签署流程(后置签署模式)
     * Summary: 提交电子合同的签署流程（后置签署模式）.
     *
     * @param SubmitSignFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SubmitSignFlowResponse
     */
    public function submitSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情.
     *
     * @param GetSignFlowRequest $request
     *
     * @return GetSignFlowResponse
     */
    public function getSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询签署流程详情
     * Summary: 查询签署流程详情.
     *
     * @param GetSignFlowRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetSignFlowResponse
     */
    public function getSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作.
     *
     * @param AuthSignFlowRequest $request
     *
     * @return AuthSignFlowResponse
     */
    public function authSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
     * Summary: 电子合同签署流程落签操作.
     *
     * @param AuthSignFlowRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AuthSignFlowResponse
     */
    public function authSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）.
     *
     * @param SubmitFrontSignRequest $request
     *
     * @return SubmitFrontSignResponse
     */
    public function submitFrontSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitFrontSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交前置签署的电子合同签署流程（前置签署模式）
     * Summary: 提交签署的电子合同签署流程（前置签署）.
     *
     * @param SubmitFrontSignRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SubmitFrontSignResponse
     */
    public function submitFrontSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitFrontSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.front.sign.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口.
     *
     * @param UploadSignFlowRequest $request
     *
     * @return UploadSignFlowResponse
     */
    public function uploadSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用该接口，追加上传无法在原有链路上签署的合同
     * Summary: 商户调用合同追加接口.
     *
     * @param UploadSignFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UploadSignFlowResponse
     */
    public function uploadSignFlowEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.ato.sign.flow.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadSignFlowResponse([
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

        return UploadSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传.
     *
     * @param UploadSignTemplateRequest $request
     *
     * @return UploadSignTemplateResponse
     */
    public function uploadSignTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadSignTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户合同模板上传接口
     * Summary: 商户合同模板上传.
     *
     * @param UploadSignTemplateRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UploadSignTemplateResponse
     */
    public function uploadSignTemplateEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.ato.sign.template.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadSignTemplateResponse([
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

        return UploadSignTemplateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.template.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传.
     *
     * @param UploadSignCreditRequest $request
     *
     * @return UploadSignCreditResponse
     */
    public function uploadSignCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadSignCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户资产凭证上传，可以是文本或文件
     * Summary: 商户资产凭证上传.
     *
     * @param UploadSignCreditRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UploadSignCreditResponse
     */
    public function uploadSignCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadSignCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.credit.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询.
     *
     * @param QuerySignCreditRequest $request
     *
     * @return QuerySignCreditResponse
     */
    public function querySignCredit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySignCreditEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户资产凭证查询，需要提供订单号或资产包号
     * Summary: 商户资产凭证查询.
     *
     * @param QuerySignCreditRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QuerySignCreditResponse
     */
    public function querySignCreditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySignCreditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.credit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程.
     *
     * @param CancelSignFlowRequest $request
     *
     * @return CancelSignFlowResponse
     */
    public function cancelSignFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelSignFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 撤销签署流程
     * Summary: 撤销签署流程.
     *
     * @param CancelSignFlowRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CancelSignFlowResponse
     */
    public function cancelSignFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelSignFlowResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.flow.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取合同存证证明
     * Summary: 获取合同存证证明.
     *
     * @param GetSignContractcertificateRequest $request
     *
     * @return GetSignContractcertificateResponse
     */
    public function getSignContractcertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSignContractcertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取合同存证证明
     * Summary: 获取合同存证证明.
     *
     * @param GetSignContractcertificateRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetSignContractcertificateResponse
     */
    public function getSignContractcertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSignContractcertificateResponse::fromMap($this->doRequest('1.0', 'antchain.ato.sign.contractcertificate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口.
     *
     * @param SyncTradeRequest $request
     *
     * @return SyncTradeResponse
     */
    public function syncTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 对账saas交易信息同步接口
     * Summary: 对账saas交易信息同步接口.
     *
     * @param SyncTradeRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return SyncTradeResponse
     */
    public function syncTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情.
     *
     * @param GetTradeRequest $request
     *
     * @return GetTradeResponse
     */
    public function getTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取详情
     * Summary: 获取详情.
     *
     * @param GetTradeRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return GetTradeResponse
     */
    public function getTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建.
     *
     * @param SyncFrontTradeRequest $request
     *
     * @return SyncFrontTradeResponse
     */
    public function syncFrontTrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFrontTradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单创建，前置签署
     * Summary: 前置签署订单创建.
     *
     * @param SyncFrontTradeRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SyncFrontTradeResponse
     */
    public function syncFrontTradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFrontTradeResponse::fromMap($this->doRequest('1.0', 'antchain.ato.front.trade.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口.
     *
     * @param SyncTradeFinanceloanapplyRequest $request
     *
     * @return SyncTradeFinanceloanapplyResponse
     */
    public function syncTradeFinanceloanapply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradeFinanceloanapplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资放款申请接口
     * Summary: 融资放款申请接口.
     *
     * @param SyncTradeFinanceloanapplyRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SyncTradeFinanceloanapplyResponse
     */
    public function syncTradeFinanceloanapplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradeFinanceloanapplyResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.financeloanapply.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询.
     *
     * @param GetTradeMerchantfulfillmentRequest $request
     *
     * @return GetTradeMerchantfulfillmentResponse
     */
    public function getTradeMerchantfulfillment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeMerchantfulfillmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约查询
     * Summary: 商户履约查询.
     *
     * @param GetTradeMerchantfulfillmentRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetTradeMerchantfulfillmentResponse
     */
    public function getTradeMerchantfulfillmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeMerchantfulfillmentResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.merchantfulfillment.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）.
     *
     * @param GetTradeUserperformanceRequest $request
     *
     * @return GetTradeUserperformanceResponse
     */
    public function getTradeUserperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeUserperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户履约信息查询（履约承诺+记录）
     * Summary: 用户履约信息查询（履约承诺+记录）.
     *
     * @param GetTradeUserperformanceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetTradeUserperformanceResponse
     */
    public function getTradeUserperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeUserperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetTradeMerchantperformanceRequest $request
     *
     * @return GetTradeMerchantperformanceResponse
     */
    public function getTradeMerchantperformance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeMerchantperformanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户履约信息查询（履约承诺+履约记录）
     * Summary: 商户履约信息查询（履约承诺+履约记录）.
     *
     * @param GetTradeMerchantperformanceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetTradeMerchantperformanceResponse
     */
    public function getTradeMerchantperformanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeMerchantperformanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.merchantperformance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改.
     *
     * @param UpdateTradeUserpromiseRequest $request
     *
     * @return UpdateTradeUserpromiseResponse
     */
    public function updateTradeUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTradeUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户调用，修改订单的用户还款承诺
     * Summary: 用户还款承诺信息修改.
     *
     * @param UpdateTradeUserpromiseRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateTradeUserpromiseResponse
     */
    public function updateTradeUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTradeUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userpromise.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件.
     *
     * @param SyncFrontIndirectorderRequest $request
     *
     * @return SyncFrontIndirectorderResponse
     */
    public function syncFrontIndirectorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFrontIndirectorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 前置签署间联模式订单进件
     * Summary: 前置签署间联模式订单进件.
     *
     * @param SyncFrontIndirectorderRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncFrontIndirectorderResponse
     */
    public function syncFrontIndirectorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFrontIndirectorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.front.indirectorder.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件.
     *
     * @param SyncTradeIndirectorderRequest $request
     *
     * @return SyncTradeIndirectorderResponse
     */
    public function syncTradeIndirectorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradeIndirectorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 间联模式-后置模式订单进件
     * Summary: 间联模式-后置模式订单进件.
     *
     * @param SyncTradeIndirectorderRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncTradeIndirectorderResponse
     */
    public function syncTradeIndirectorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradeIndirectorderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.indirectorder.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新.
     *
     * @param ReplaceTradeUserpromiseRequest $request
     *
     * @return ReplaceTradeUserpromiseResponse
     */
    public function replaceTradeUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceTradeUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户履约承诺替换更新
     * Summary: 用户履约承诺替换更新.
     *
     * @param ReplaceTradeUserpromiseRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ReplaceTradeUserpromiseResponse
     */
    public function replaceTradeUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceTradeUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userpromise.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口.
     *
     * @param ApplyTradeFinanceprecheckRequest $request
     *
     * @return ApplyTradeFinanceprecheckResponse
     */
    public function applyTradeFinanceprecheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyTradeFinanceprecheckEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单融资预审申请接口
     * Summary: 订单融资预审申请接口.
     *
     * @param ApplyTradeFinanceprecheckRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ApplyTradeFinanceprecheckResponse
     */
    public function applyTradeFinanceprecheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyTradeFinanceprecheckResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.financeprecheck.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 非融转融资
     * Summary: 非融转融资.
     *
     * @param TransferTradeFinanceRequest $request
     *
     * @return TransferTradeFinanceResponse
     */
    public function transferTradeFinance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->transferTradeFinanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 非融转融资
     * Summary: 非融转融资.
     *
     * @param TransferTradeFinanceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return TransferTradeFinanceResponse
     */
    public function transferTradeFinanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return TransferTradeFinanceResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.finance.transfer', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新订单信息
     * Summary: 更新订单信息.
     *
     * @param UpdateTradeOrderRequest $request
     *
     * @return UpdateTradeOrderResponse
     */
    public function updateTradeOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTradeOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新订单信息
     * Summary: 更新订单信息.
     *
     * @param UpdateTradeOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateTradeOrderResponse
     */
    public function updateTradeOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTradeOrderResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.order.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 融资订单追加预审资金方
     * Summary: 融资订单追加预审资金方.
     *
     * @param AddTradeFinanceprecheckRequest $request
     *
     * @return AddTradeFinanceprecheckResponse
     */
    public function addTradeFinanceprecheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addTradeFinanceprecheckEx($request, $headers, $runtime);
    }

    /**
     * Description: 融资订单追加预审资金方
     * Summary: 融资订单追加预审资金方.
     *
     * @param AddTradeFinanceprecheckRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return AddTradeFinanceprecheckResponse
     */
    public function addTradeFinanceprecheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddTradeFinanceprecheckResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.financeprecheck.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单融资信息查询接口
     * Summary: 订单融资信息查询接口.
     *
     * @param GetTradeOrderfinanceinfoRequest $request
     *
     * @return GetTradeOrderfinanceinfoResponse
     */
    public function getTradeOrderfinanceinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeOrderfinanceinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单融资信息查询接口
     * Summary: 订单融资信息查询接口.
     *
     * @param GetTradeOrderfinanceinfoRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetTradeOrderfinanceinfoResponse
     */
    public function getTradeOrderfinanceinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeOrderfinanceinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.orderfinanceinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单代扣计划延期
     * Summary: 订单代扣计划延期
     *
     * @param SyncTradeUserpromisedelayRequest $request
     *
     * @return SyncTradeUserpromisedelayResponse
     */
    public function syncTradeUserpromisedelay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradeUserpromisedelayEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单代扣计划延期
     * Summary: 订单代扣计划延期
     *
     * @param SyncTradeUserpromisedelayRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SyncTradeUserpromisedelayResponse
     */
    public function syncTradeUserpromisedelayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradeUserpromisedelayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userpromisedelay.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单代扣计划暂停
     * Summary: 订单代扣计划暂停.
     *
     * @param PauseTradeUserpromiseRequest $request
     *
     * @return PauseTradeUserpromiseResponse
     */
    public function pauseTradeUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pauseTradeUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单代扣计划暂停
     * Summary: 订单代扣计划暂停.
     *
     * @param PauseTradeUserpromiseRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PauseTradeUserpromiseResponse
     */
    public function pauseTradeUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PauseTradeUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userpromise.pause', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣计划重启
     * Summary: 代扣计划重启.
     *
     * @param ResumeTradeUserpromiseRequest $request
     *
     * @return ResumeTradeUserpromiseResponse
     */
    public function resumeTradeUserpromise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resumeTradeUserpromiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣计划重启
     * Summary: 代扣计划重启.
     *
     * @param ResumeTradeUserpromiseRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ResumeTradeUserpromiseResponse
     */
    public function resumeTradeUserpromiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResumeTradeUserpromiseResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.userpromise.resume', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单信息同步
     * Summary: 订单信息同步.
     *
     * @param SyncTradePromoorderinfoRequest $request
     *
     * @return SyncTradePromoorderinfoResponse
     */
    public function syncTradePromoorderinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradePromoorderinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单信息同步
     * Summary: 订单信息同步.
     *
     * @param SyncTradePromoorderinfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncTradePromoorderinfoResponse
     */
    public function syncTradePromoorderinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradePromoorderinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.promoorderinfo.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商家端订单接单同步接口
     * Summary: 商家端同步接口.
     *
     * @param SyncTradePlatformorderauditRequest $request
     *
     * @return SyncTradePlatformorderauditResponse
     */
    public function syncTradePlatformorderaudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradePlatformorderauditEx($request, $headers, $runtime);
    }

    /**
     * Description: 商家端订单接单同步接口
     * Summary: 商家端同步接口.
     *
     * @param SyncTradePlatformorderauditRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SyncTradePlatformorderauditResponse
     */
    public function syncTradePlatformorderauditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradePlatformorderauditResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.platformorderaudit.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产订单同步
     * Summary: 资产订单同步.
     *
     * @param SyncTradeReceiptorderfullinfoRequest $request
     *
     * @return SyncTradeReceiptorderfullinfoResponse
     */
    public function syncTradeReceiptorderfullinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncTradeReceiptorderfullinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产订单同步
     * Summary: 资产订单同步.
     *
     * @param SyncTradeReceiptorderfullinfoRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return SyncTradeReceiptorderfullinfoResponse
     */
    public function syncTradeReceiptorderfullinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncTradeReceiptorderfullinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.receiptorderfullinfo.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单信息查询（新）
     * Summary: 订单获取.
     *
     * @param GetTradeOrderfullinfoRequest $request
     *
     * @return GetTradeOrderfullinfoResponse
     */
    public function getTradeOrderfullinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTradeOrderfullinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单信息查询（新）
     * Summary: 订单获取.
     *
     * @param GetTradeOrderfullinfoRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetTradeOrderfullinfoResponse
     */
    public function getTradeOrderfullinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTradeOrderfullinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ato.trade.orderfullinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约创建
     * Summary: 代扣签约.
     *
     * @param CreateWithholdSignRequest $request
     *
     * @return CreateWithholdSignResponse
     */
    public function createWithholdSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWithholdSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约创建
     * Summary: 代扣签约.
     *
     * @param CreateWithholdSignRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateWithholdSignResponse
     */
    public function createWithholdSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWithholdSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询.
     *
     * @param QueryWithholdSignRequest $request
     *
     * @return QueryWithholdSignResponse
     */
    public function queryWithholdSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约查询
     * Summary: 代扣签约查询.
     *
     * @param QueryWithholdSignRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryWithholdSignResponse
     */
    public function queryWithholdSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑.
     *
     * @param UnbindWithholdSignRequest $request
     *
     * @return UnbindWithholdSignResponse
     */
    public function unbindWithholdSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindWithholdSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单关闭后,可以通过此接口解绑签约
     * Summary: 代扣签约解绑.
     *
     * @param UnbindWithholdSignRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UnbindWithholdSignResponse
     */
    public function unbindWithholdSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindWithholdSignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划.
     *
     * @param CancelWithholdPlanRequest $request
     *
     * @return CancelWithholdPlanResponse
     */
    public function cancelWithholdPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelWithholdPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
     * Summary: 取消代扣计划.
     *
     * @param CancelWithholdPlanRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CancelWithholdPlanResponse
     */
    public function cancelWithholdPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelWithholdPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重要说明：
     *     1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     *     2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期多期代扣取消.
     *
     * @param RepayWithholdPlanRequest $request
     *
     * @return RepayWithholdPlanResponse
     */
    public function repayWithholdPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayWithholdPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 重要说明：
     *     1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
     *     2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
     * Summary: 单期多期代扣取消.
     *
     * @param RepayWithholdPlanRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return RepayWithholdPlanResponse
     */
    public function repayWithholdPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayWithholdPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试.
     *
     * @param RetryWithholdPlanRequest $request
     *
     * @return RetryWithholdPlanResponse
     */
    public function retryWithholdPlan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryWithholdPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
     * Summary: 扣款计划重试.
     *
     * @param RetryWithholdPlanRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return RetryWithholdPlanResponse
     */
    public function retryWithholdPlanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryWithholdPlanResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认.
     *
     * @param ConfirmWithholdSignasyncunsignRequest $request
     *
     * @return ConfirmWithholdSignasyncunsignResponse
     */
    public function confirmWithholdSignasyncunsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmWithholdSignasyncunsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
     * Summary: 代扣签约的异步解约确认.
     *
     * @param ConfirmWithholdSignasyncunsignRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ConfirmWithholdSignasyncunsignResponse
     */
    public function confirmWithholdSignasyncunsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmWithholdSignasyncunsignResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.signasyncunsign.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 主动支付创建
     * Summary: 主动支付创建.
     *
     * @param CreateWithholdActivepayRequest $request
     *
     * @return CreateWithholdActivepayResponse
     */
    public function createWithholdActivepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWithholdActivepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 主动支付创建
     * Summary: 主动支付创建.
     *
     * @param CreateWithholdActivepayRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateWithholdActivepayResponse
     */
    public function createWithholdActivepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWithholdActivepayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.activepay.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 主动支付查询
     * Summary: 主动支付查询.
     *
     * @param QueryWithholdActivepayRequest $request
     *
     * @return QueryWithholdActivepayResponse
     */
    public function queryWithholdActivepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdActivepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 主动支付查询
     * Summary: 主动支付查询.
     *
     * @param QueryWithholdActivepayRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryWithholdActivepayResponse
     */
    public function queryWithholdActivepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdActivepayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.activepay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 主动支付取消
     * Summary: 主动支付取消.
     *
     * @param CancelWithholdActivepayRequest $request
     *
     * @return CancelWithholdActivepayResponse
     */
    public function cancelWithholdActivepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelWithholdActivepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 主动支付取消
     * Summary: 主动支付取消.
     *
     * @param CancelWithholdActivepayRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CancelWithholdActivepayResponse
     */
    public function cancelWithholdActivepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelWithholdActivepayResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.activepay.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请.
     *
     * @param CreateWithholdRefundRequest $request
     *
     * @return CreateWithholdRefundResponse
     */
    public function createWithholdRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWithholdRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建退款请求
     * Summary: 创建退款申请.
     *
     * @param CreateWithholdRefundRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateWithholdRefundResponse
     */
    public function createWithholdRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWithholdRefundResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.refund.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询.
     *
     * @param QueryWithholdRefundRequest $request
     *
     * @return QueryWithholdRefundResponse
     */
    public function queryWithholdRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 退款申请结果查询
     * Summary: 退款申请结果查询.
     *
     * @param QueryWithholdRefundRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryWithholdRefundResponse
     */
    public function queryWithholdRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdRefundResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.refund.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代偿户账户查询
     * Summary: 代偿户账户查询.
     *
     * @param QueryWithholdCompensateaccountRequest $request
     *
     * @return QueryWithholdCompensateaccountResponse
     */
    public function queryWithholdCompensateaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWithholdCompensateaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 代偿户账户查询
     * Summary: 代偿户账户查询.
     *
     * @param QueryWithholdCompensateaccountRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryWithholdCompensateaccountResponse
     */
    public function queryWithholdCompensateaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWithholdCompensateaccountResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.compensateaccount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试pending状态的代扣计划
     * Summary: 重试pending状态的代扣计划.
     *
     * @param RetryWithholdPlanpendingRequest $request
     *
     * @return RetryWithholdPlanpendingResponse
     */
    public function retryWithholdPlanpending($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryWithholdPlanpendingEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试pending状态的代扣计划
     * Summary: 重试pending状态的代扣计划.
     *
     * @param RetryWithholdPlanpendingRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return RetryWithholdPlanpendingResponse
     */
    public function retryWithholdPlanpendingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryWithholdPlanpendingResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.planpending.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分账pending重试
     * Summary: 分账pending重试.
     *
     * @param RetryWithholdDividependingRequest $request
     *
     * @return RetryWithholdDividependingResponse
     */
    public function retryWithholdDividepending($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryWithholdDividependingEx($request, $headers, $runtime);
    }

    /**
     * Description: 分账pending重试
     * Summary: 分账pending重试.
     *
     * @param RetryWithholdDividependingRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return RetryWithholdDividependingResponse
     */
    public function retryWithholdDividependingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryWithholdDividependingResponse::fromMap($this->doRequest('1.0', 'antchain.ato.withhold.dividepending.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
