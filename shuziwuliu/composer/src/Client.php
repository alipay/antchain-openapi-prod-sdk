<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\SHUZIWULIU\Models\ApplyCbrfInsureRequest;
use AntChain\SHUZIWULIU\Models\ApplyCbrfInsureResponse;
use AntChain\SHUZIWULIU\Models\ApplyCreditIssueclearRequest;
use AntChain\SHUZIWULIU\Models\ApplyCreditIssueclearResponse;
use AntChain\SHUZIWULIU\Models\ApplyCreditmodeIssueclearRequest;
use AntChain\SHUZIWULIU\Models\ApplyCreditmodeIssueclearResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceCbecRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceCbecResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceCbpiRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceCbpiResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceCbrfRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceCbrfResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceEndorsementRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceEndorsementResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceFileurlRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceFileurlResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceInventoryRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceInventoryResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceOspireportRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceOspireportResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceOspiRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceOspiResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsurancePiprereportRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsurancePiprereportResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsurancepolicyUniversalRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsurancepolicyUniversalResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsurancepolicyZhonghuacaixianRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsurancepolicyZhonghuacaixianResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceStockinRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceStockinResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceYzbreportRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceYzbreportResponse;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceYzbRequest;
use AntChain\SHUZIWULIU\Models\ApplyInsuranceYzbResponse;
use AntChain\SHUZIWULIU\Models\ApplyPfConfirmationRequest;
use AntChain\SHUZIWULIU\Models\ApplyPfConfirmationResponse;
use AntChain\SHUZIWULIU\Models\ApplyPfFinancingqualificationRequest;
use AntChain\SHUZIWULIU\Models\ApplyPfFinancingqualificationResponse;
use AntChain\SHUZIWULIU\Models\ApplyPfWaybillfinancingRequest;
use AntChain\SHUZIWULIU\Models\ApplyPfWaybillfinancingResponse;
use AntChain\SHUZIWULIU\Models\AuthSysForwarderRequest;
use AntChain\SHUZIWULIU\Models\AuthSysForwarderResponse;
use AntChain\SHUZIWULIU\Models\BatchcreateCreditIssueRequest;
use AntChain\SHUZIWULIU\Models\BatchcreateCreditIssueResponse;
use AntChain\SHUZIWULIU\Models\BatchcreateCreditmodeIssueRequest;
use AntChain\SHUZIWULIU\Models\BatchcreateCreditmodeIssueResponse;
use AntChain\SHUZIWULIU\Models\CallbackCreditCommonRequest;
use AntChain\SHUZIWULIU\Models\CallbackCreditCommonResponse;
use AntChain\SHUZIWULIU\Models\CallbackPfDefinpfRequest;
use AntChain\SHUZIWULIU\Models\CallbackPfDefinpfResponse;
use AntChain\SHUZIWULIU\Models\CancelCreditIssuebatchbysaasRequest;
use AntChain\SHUZIWULIU\Models\CancelCreditIssuebatchbysaasResponse;
use AntChain\SHUZIWULIU\Models\CancelCreditIssuebatchRequest;
use AntChain\SHUZIWULIU\Models\CancelCreditIssuebatchResponse;
use AntChain\SHUZIWULIU\Models\CancelInsurancepolicyUniversalRequest;
use AntChain\SHUZIWULIU\Models\CancelInsurancepolicyUniversalResponse;
use AntChain\SHUZIWULIU\Models\CancelInsurancepolicyZhonghuacaixianRequest;
use AntChain\SHUZIWULIU\Models\CancelInsurancepolicyZhonghuacaixianResponse;
use AntChain\SHUZIWULIU\Models\CheckCreditWaybillRequest;
use AntChain\SHUZIWULIU\Models\CheckCreditWaybillResponse;
use AntChain\SHUZIWULIU\Models\CheckPfVoucherRequest;
use AntChain\SHUZIWULIU\Models\CheckPfVoucherResponse;
use AntChain\SHUZIWULIU\Models\CloseWaybillOrderRequest;
use AntChain\SHUZIWULIU\Models\CloseWaybillOrderResponse;
use AntChain\SHUZIWULIU\Models\ConfirmCargowaybillBillRequest;
use AntChain\SHUZIWULIU\Models\ConfirmCargowaybillBillResponse;
use AntChain\SHUZIWULIU\Models\CreateAgentDidRequest;
use AntChain\SHUZIWULIU\Models\CreateAgentDidResponse;
use AntChain\SHUZIWULIU\Models\CreateBillPaybillorderRequest;
use AntChain\SHUZIWULIU\Models\CreateBillPaybillorderResponse;
use AntChain\SHUZIWULIU\Models\CreateBillReceiptbillorderRequest;
use AntChain\SHUZIWULIU\Models\CreateBillReceiptbillorderResponse;
use AntChain\SHUZIWULIU\Models\CreateBillReceivablebillnodetailRequest;
use AntChain\SHUZIWULIU\Models\CreateBillReceivablebillnodetailResponse;
use AntChain\SHUZIWULIU\Models\CreateBillReceivablebillRequest;
use AntChain\SHUZIWULIU\Models\CreateBillReceivablebillResponse;
use AntChain\SHUZIWULIU\Models\CreateCaptainDisRequest;
use AntChain\SHUZIWULIU\Models\CreateCaptainDisResponse;
use AntChain\SHUZIWULIU\Models\CreateCargoOrderRequest;
use AntChain\SHUZIWULIU\Models\CreateCargoOrderResponse;
use AntChain\SHUZIWULIU\Models\CreateCargoPayorderRequest;
use AntChain\SHUZIWULIU\Models\CreateCargoPayorderResponse;
use AntChain\SHUZIWULIU\Models\CreateCargoPayRequest;
use AntChain\SHUZIWULIU\Models\CreateCargoPayResponse;
use AntChain\SHUZIWULIU\Models\CreateCargowaybillBillRequest;
use AntChain\SHUZIWULIU\Models\CreateCargowaybillBillResponse;
use AntChain\SHUZIWULIU\Models\CreateCargowaybillBillsettleRequest;
use AntChain\SHUZIWULIU\Models\CreateCargowaybillBillsettleResponse;
use AntChain\SHUZIWULIU\Models\CreateConsignorDisRequest;
use AntChain\SHUZIWULIU\Models\CreateConsignorDisResponse;
use AntChain\SHUZIWULIU\Models\CreateCreditCommonsignRequest;
use AntChain\SHUZIWULIU\Models\CreateCreditCommonsignResponse;
use AntChain\SHUZIWULIU\Models\CreateCreditIssuefinanceRequest;
use AntChain\SHUZIWULIU\Models\CreateCreditIssuefinanceResponse;
use AntChain\SHUZIWULIU\Models\CreateCreditIssuetransferRequest;
use AntChain\SHUZIWULIU\Models\CreateCreditIssuetransferResponse;
use AntChain\SHUZIWULIU\Models\CreateDidCarrierRequest;
use AntChain\SHUZIWULIU\Models\CreateDidCarrierResponse;
use AntChain\SHUZIWULIU\Models\CreateDidClientRequest;
use AntChain\SHUZIWULIU\Models\CreateDidClientResponse;
use AntChain\SHUZIWULIU\Models\CreateDidForwarderRequest;
use AntChain\SHUZIWULIU\Models\CreateDidForwarderResponse;
use AntChain\SHUZIWULIU\Models\CreateDidSaasplatformRequest;
use AntChain\SHUZIWULIU\Models\CreateDidSaasplatformResponse;
use AntChain\SHUZIWULIU\Models\CreateDisDidRequest;
use AntChain\SHUZIWULIU\Models\CreateDisDidResponse;
use AntChain\SHUZIWULIU\Models\CreateDriverDisRequest;
use AntChain\SHUZIWULIU\Models\CreateDriverDisResponse;
use AntChain\SHUZIWULIU\Models\CreateHighwayInvoiceRequest;
use AntChain\SHUZIWULIU\Models\CreateHighwayInvoiceResponse;
use AntChain\SHUZIWULIU\Models\CreatePlatformDidRequest;
use AntChain\SHUZIWULIU\Models\CreatePlatformDidResponse;
use AntChain\SHUZIWULIU\Models\CreateReceivableBillRequest;
use AntChain\SHUZIWULIU\Models\CreateReceivableBillResponse;
use AntChain\SHUZIWULIU\Models\CreateStandardVoucherRequest;
use AntChain\SHUZIWULIU\Models\CreateStandardVoucherResponse;
use AntChain\SHUZIWULIU\Models\CreateTransportWaybillRequest;
use AntChain\SHUZIWULIU\Models\CreateTransportWaybillResponse;
use AntChain\SHUZIWULIU\Models\CreateWaybillBillRequest;
use AntChain\SHUZIWULIU\Models\CreateWaybillBillResponse;
use AntChain\SHUZIWULIU\Models\CreateWaybillOrderRequest;
use AntChain\SHUZIWULIU\Models\CreateWaybillOrderResponse;
use AntChain\SHUZIWULIU\Models\CreateWaybillPayRequest;
use AntChain\SHUZIWULIU\Models\CreateWaybillPayResponse;
use AntChain\SHUZIWULIU\Models\FinishBizAuditRequest;
use AntChain\SHUZIWULIU\Models\FinishBizAuditResponse;
use AntChain\SHUZIWULIU\Models\FinishFinanceTransportRequest;
use AntChain\SHUZIWULIU\Models\FinishFinanceTransportResponse;
use AntChain\SHUZIWULIU\Models\FinishFinanceWaybillRequest;
use AntChain\SHUZIWULIU\Models\FinishFinanceWaybillResponse;
use AntChain\SHUZIWULIU\Models\FinishWaybillOrderRequest;
use AntChain\SHUZIWULIU\Models\FinishWaybillOrderResponse;
use AntChain\SHUZIWULIU\Models\GetCreditIssuescpticketRequest;
use AntChain\SHUZIWULIU\Models\GetCreditIssuescpticketResponse;
use AntChain\SHUZIWULIU\Models\GetIssueTransferfileRequest;
use AntChain\SHUZIWULIU\Models\GetIssueTransferfileResponse;
use AntChain\SHUZIWULIU\Models\ImportWaybillLocationRequest;
use AntChain\SHUZIWULIU\Models\ImportWaybillLocationResponse;
use AntChain\SHUZIWULIU\Models\NotifyInsuranceOspireportRequest;
use AntChain\SHUZIWULIU\Models\NotifyInsuranceOspireportResponse;
use AntChain\SHUZIWULIU\Models\NotifyInsuranceReportresultRequest;
use AntChain\SHUZIWULIU\Models\NotifyInsuranceReportresultResponse;
use AntChain\SHUZIWULIU\Models\OpenCreditDriverRequest;
use AntChain\SHUZIWULIU\Models\OpenCreditDriverResponse;
use AntChain\SHUZIWULIU\Models\PushAuthSigninfoRequest;
use AntChain\SHUZIWULIU\Models\PushAuthSigninfoResponse;
use AntChain\SHUZIWULIU\Models\PushInsurancenotifyClaimRequest;
use AntChain\SHUZIWULIU\Models\PushInsurancenotifyClaimResponse;
use AntChain\SHUZIWULIU\Models\PushInsuranceOlpRequest;
use AntChain\SHUZIWULIU\Models\PushInsuranceOlpResponse;
use AntChain\SHUZIWULIU\Models\PushInsuranceRepcorrectRequest;
use AntChain\SHUZIWULIU\Models\PushInsuranceRepcorrectResponse;
use AntChain\SHUZIWULIU\Models\PushInsuranceReppolicyRequest;
use AntChain\SHUZIWULIU\Models\PushInsuranceReppolicyResponse;
use AntChain\SHUZIWULIU\Models\PushPfPledgeRequest;
use AntChain\SHUZIWULIU\Models\PushPfPledgeResponse;
use AntChain\SHUZIWULIU\Models\QueryBizMasterblRequest;
use AntChain\SHUZIWULIU\Models\QueryBizMasterblResponse;
use AntChain\SHUZIWULIU\Models\QueryBusinessInstancestatusRequest;
use AntChain\SHUZIWULIU\Models\QueryBusinessInstancestatusResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditBalancebysaasRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditBalancebysaasResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditBalanceRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditBalanceResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditCommonsignRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditCommonsignResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditConsignorRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditConsignorResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditCreditamountRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditCreditamountResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditDriverRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditDriverResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditIssueamountRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditIssueamountResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuebatchstatusRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuebatchstatusResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuebyidRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuebyidResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuebytimeRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuebytimeResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuefinanceRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuefinanceResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuereceivableRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuereceivableResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuescpticketresultRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuescpticketresultResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuetransferRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditIssuetransferResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditStatementRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditStatementResponse;
use AntChain\SHUZIWULIU\Models\QueryCreditUserissueRequest;
use AntChain\SHUZIWULIU\Models\QueryCreditUserissueResponse;
use AntChain\SHUZIWULIU\Models\QueryInsuranceEndorsementRequest;
use AntChain\SHUZIWULIU\Models\QueryInsuranceEndorsementResponse;
use AntChain\SHUZIWULIU\Models\QueryInsuranceEpolicyRequest;
use AntChain\SHUZIWULIU\Models\QueryInsuranceEpolicyResponse;
use AntChain\SHUZIWULIU\Models\QueryInsuranceYzbreportRequest;
use AntChain\SHUZIWULIU\Models\QueryInsuranceYzbreportResponse;
use AntChain\SHUZIWULIU\Models\QueryPfFinancingqualificationRequest;
use AntChain\SHUZIWULIU\Models\QueryPfFinancingqualificationResponse;
use AntChain\SHUZIWULIU\Models\QueryPfFinancingRequest;
use AntChain\SHUZIWULIU\Models\QueryPfFinancingResponse;
use AntChain\SHUZIWULIU\Models\QueryPfIouRequest;
use AntChain\SHUZIWULIU\Models\QueryPfIouResponse;
use AntChain\SHUZIWULIU\Models\QueryPfPaymentRequest;
use AntChain\SHUZIWULIU\Models\QueryPfPaymentResponse;
use AntChain\SHUZIWULIU\Models\QueryPfPledgeRequest;
use AntChain\SHUZIWULIU\Models\QueryPfPledgeResponse;
use AntChain\SHUZIWULIU\Models\QueryPfQuotaRequest;
use AntChain\SHUZIWULIU\Models\QueryPfQuotaResponse;
use AntChain\SHUZIWULIU\Models\QueryPfWithdrawRequest;
use AntChain\SHUZIWULIU\Models\QueryPfWithdrawResponse;
use AntChain\SHUZIWULIU\Models\QueryWaybillInfoRequest;
use AntChain\SHUZIWULIU\Models\QueryWaybillInfoResponse;
use AntChain\SHUZIWULIU\Models\QueryWaybillStatusRequest;
use AntChain\SHUZIWULIU\Models\QueryWaybillStatusResponse;
use AntChain\SHUZIWULIU\Models\ReopenCreditDriverRequest;
use AntChain\SHUZIWULIU\Models\ReopenCreditDriverResponse;
use AntChain\SHUZIWULIU\Models\RepayCbrfClaimRequest;
use AntChain\SHUZIWULIU\Models\RepayCbrfClaimResponse;
use AntChain\SHUZIWULIU\Models\RepayInsuranceCbrfRequest;
use AntChain\SHUZIWULIU\Models\RepayInsuranceCbrfResponse;
use AntChain\SHUZIWULIU\Models\SaveBillPaybilltariffRequest;
use AntChain\SHUZIWULIU\Models\SaveBillPaybilltariffResponse;
use AntChain\SHUZIWULIU\Models\SaveBillPayinvoiceRequest;
use AntChain\SHUZIWULIU\Models\SaveBillPayinvoiceResponse;
use AntChain\SHUZIWULIU\Models\SaveBillReceiptbilltariffRequest;
use AntChain\SHUZIWULIU\Models\SaveBillReceiptbilltariffResponse;
use AntChain\SHUZIWULIU\Models\SaveBillReceiptinvoiceRequest;
use AntChain\SHUZIWULIU\Models\SaveBillReceiptinvoiceResponse;
use AntChain\SHUZIWULIU\Models\SaveBizBookingorderRequest;
use AntChain\SHUZIWULIU\Models\SaveBizBookingorderResponse;
use AntChain\SHUZIWULIU\Models\SaveBizConsignorderRequest;
use AntChain\SHUZIWULIU\Models\SaveBizConsignorderResponse;
use AntChain\SHUZIWULIU\Models\SaveBizContainerRequest;
use AntChain\SHUZIWULIU\Models\SaveBizContainerResponse;
use AntChain\SHUZIWULIU\Models\SaveBizCustomsorderRequest;
use AntChain\SHUZIWULIU\Models\SaveBizCustomsorderResponse;
use AntChain\SHUZIWULIU\Models\SaveBizGoodsRequest;
use AntChain\SHUZIWULIU\Models\SaveBizGoodsResponse;
use AntChain\SHUZIWULIU\Models\SaveBizHouseblRequest;
use AntChain\SHUZIWULIU\Models\SaveBizHouseblResponse;
use AntChain\SHUZIWULIU\Models\SaveBizMasterblRequest;
use AntChain\SHUZIWULIU\Models\SaveBizMasterblResponse;
use AntChain\SHUZIWULIU\Models\SaveBiznewBookingRequest;
use AntChain\SHUZIWULIU\Models\SaveBiznewBookingResponse;
use AntChain\SHUZIWULIU\Models\SaveBiznewCustomsRequest;
use AntChain\SHUZIWULIU\Models\SaveBiznewCustomsResponse;
use AntChain\SHUZIWULIU\Models\SaveBiznewInvoiceRequest;
use AntChain\SHUZIWULIU\Models\SaveBiznewInvoiceResponse;
use AntChain\SHUZIWULIU\Models\SaveBiznewMasterRequest;
use AntChain\SHUZIWULIU\Models\SaveBiznewMasterResponse;
use AntChain\SHUZIWULIU\Models\SaveBiznewOrderRequest;
use AntChain\SHUZIWULIU\Models\SaveBiznewOrderResponse;
use AntChain\SHUZIWULIU\Models\SaveBiznewPaybillorderRequest;
use AntChain\SHUZIWULIU\Models\SaveBiznewPaybillorderResponse;
use AntChain\SHUZIWULIU\Models\SaveBiznewReceiptbillorderRequest;
use AntChain\SHUZIWULIU\Models\SaveBiznewReceiptbillorderResponse;
use AntChain\SHUZIWULIU\Models\SaveBiznewVehicleRequest;
use AntChain\SHUZIWULIU\Models\SaveBiznewVehicleResponse;
use AntChain\SHUZIWULIU\Models\SaveBizOrderRequest;
use AntChain\SHUZIWULIU\Models\SaveBizOrderResponse;
use AntChain\SHUZIWULIU\Models\SaveBizPayinvoicefileRequest;
use AntChain\SHUZIWULIU\Models\SaveBizPayinvoicefileResponse;
use AntChain\SHUZIWULIU\Models\SaveBizSonotifyRequest;
use AntChain\SHUZIWULIU\Models\SaveBizSonotifyResponse;
use AntChain\SHUZIWULIU\Models\SaveBizVehicleRequest;
use AntChain\SHUZIWULIU\Models\SaveBizVehicleResponse;
use AntChain\SHUZIWULIU\Models\SaveInsuranceWaybillRequest;
use AntChain\SHUZIWULIU\Models\SaveInsuranceWaybillResponse;
use AntChain\SHUZIWULIU\Models\SaveTrailerCorpRequest;
use AntChain\SHUZIWULIU\Models\SaveTrailerCorpResponse;
use AntChain\SHUZIWULIU\Models\SaveTrailerTransportRequest;
use AntChain\SHUZIWULIU\Models\SaveTrailerTransportResponse;
use AntChain\SHUZIWULIU\Models\SaveWaybillOrderRequest;
use AntChain\SHUZIWULIU\Models\SaveWaybillOrderResponse;
use AntChain\SHUZIWULIU\Models\SendCreditProxyRequest;
use AntChain\SHUZIWULIU\Models\SendCreditProxyResponse;
use AntChain\SHUZIWULIU\Models\StartFinanceWaybillRequest;
use AntChain\SHUZIWULIU\Models\StartFinanceWaybillResponse;
use AntChain\SHUZIWULIU\Models\UpdateBillPaybillorderRequest;
use AntChain\SHUZIWULIU\Models\UpdateBillPaybillorderResponse;
use AntChain\SHUZIWULIU\Models\UpdateBillReceiptbillorderRequest;
use AntChain\SHUZIWULIU\Models\UpdateBillReceiptbillorderResponse;
use AntChain\SHUZIWULIU\Models\UpdateBillReceivablebillRequest;
use AntChain\SHUZIWULIU\Models\UpdateBillReceivablebillResponse;
use AntChain\SHUZIWULIU\Models\UpdateCargowaybillBillRequest;
use AntChain\SHUZIWULIU\Models\UpdateCargowaybillBillResponse;
use AntChain\SHUZIWULIU\Models\UpdateFinanceWaybillRequest;
use AntChain\SHUZIWULIU\Models\UpdateFinanceWaybillResponse;
use AntChain\SHUZIWULIU\Models\UpdateInsuranceOlpRequest;
use AntChain\SHUZIWULIU\Models\UpdateInsuranceOlpResponse;
use AntChain\SHUZIWULIU\Models\UpdateReceivablebillStatusRequest;
use AntChain\SHUZIWULIU\Models\UpdateReceivablebillStatusResponse;
use AntChain\SHUZIWULIU\Models\UpdateShippingEblbatchstatusRequest;
use AntChain\SHUZIWULIU\Models\UpdateShippingEblbatchstatusResponse;
use AntChain\SHUZIWULIU\Models\UpdateTransportWaybillRequest;
use AntChain\SHUZIWULIU\Models\UpdateTransportWaybillResponse;
use AntChain\SHUZIWULIU\Models\UpdateWaybillActionRequest;
use AntChain\SHUZIWULIU\Models\UpdateWaybillActionResponse;
use AntChain\SHUZIWULIU\Models\UpdateWaybillorderPlatformdidRequest;
use AntChain\SHUZIWULIU\Models\UpdateWaybillorderPlatformdidResponse;
use AntChain\SHUZIWULIU\Models\UploadBizFinancingRequest;
use AntChain\SHUZIWULIU\Models\UploadBizFinancingResponse;
use AntChain\SHUZIWULIU\Models\UploadBizOrderRequest;
use AntChain\SHUZIWULIU\Models\UploadBizOrderResponse;
use AntChain\SHUZIWULIU\Models\UploadCreditAplusissueRequest;
use AntChain\SHUZIWULIU\Models\UploadCreditAplusissueResponse;
use AntChain\SHUZIWULIU\Models\UploadCreditAuthorizationRequest;
use AntChain\SHUZIWULIU\Models\UploadCreditAuthorizationResponse;
use AntChain\SHUZIWULIU\Models\UploadCreditConfirmRequest;
use AntChain\SHUZIWULIU\Models\UploadCreditConfirmResponse;
use AntChain\SHUZIWULIU\Models\UploadCreditIssuebatchRequest;
use AntChain\SHUZIWULIU\Models\UploadCreditIssuebatchResponse;
use AntChain\SHUZIWULIU\Models\UploadCreditIssuebysaasRequest;
use AntChain\SHUZIWULIU\Models\UploadCreditIssuebysaasResponse;
use AntChain\SHUZIWULIU\Models\UploadCreditIssueRequest;
use AntChain\SHUZIWULIU\Models\UploadCreditIssueResponse;
use AntChain\SHUZIWULIU\Models\UploadShippingEblbatchRequest;
use AntChain\SHUZIWULIU\Models\UploadShippingEblbatchResponse;
use AntChain\SHUZIWULIU\Models\UploadShippingEblRequest;
use AntChain\SHUZIWULIU\Models\UploadShippingEblResponse;
use AntChain\SHUZIWULIU\Models\UploadTransportContractRequest;
use AntChain\SHUZIWULIU\Models\UploadTransportContractResponse;
use AntChain\SHUZIWULIU\Models\UploadTransportReceiptRequest;
use AntChain\SHUZIWULIU\Models\UploadTransportReceiptResponse;
use AntChain\SHUZIWULIU\Models\UploadTransportRouteRequest;
use AntChain\SHUZIWULIU\Models\UploadTransportRouteResponse;
use AntChain\SHUZIWULIU\Models\VerifyBillPaybillRequest;
use AntChain\SHUZIWULIU\Models\VerifyBillPaybillResponse;
use AntChain\SHUZIWULIU\Models\VerifyBillReceiptbillorderRequest;
use AntChain\SHUZIWULIU\Models\VerifyBillReceiptbillorderResponse;
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
            // 创建凭证One
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
                    'sdk_version'      => '1.7.2',
                    '_prod_code'       => 'SHUZIWULIU',
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
     * Description: 标准化应收账单
     * Summary: 标准化应收账单.
     *
     * @param CreateReceivableBillRequest $request
     *
     * @return CreateReceivableBillResponse
     */
    public function createReceivableBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createReceivableBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 标准化应收账单
     * Summary: 标准化应收账单.
     *
     * @param CreateReceivableBillRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateReceivableBillResponse
     */
    public function createReceivableBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateReceivableBillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.receivable.bill.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建凭证
     * Summary: 创建凭证
     *
     * @param CreateStandardVoucherRequest $request
     *
     * @return CreateStandardVoucherResponse
     */
    public function createStandardVoucher($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createStandardVoucherEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建凭证
     * Summary: 创建凭证
     *
     * @param CreateStandardVoucherRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateStandardVoucherResponse
     */
    public function createStandardVoucherEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateStandardVoucherResponse::fromMap($this->doRequest('1.0', 'digital.logistic.standard.voucher.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 无车承运平台为自身申请DIS分布式数字身份
     * Summary: 无车承运平台DIS分布式数字身份申请.
     *
     * @param CreatePlatformDidRequest $request
     *
     * @return CreatePlatformDidResponse
     */
    public function createPlatformDid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createPlatformDidEx($request, $headers, $runtime);
    }

    /**
     * Description: 无车承运平台为自身申请DIS分布式数字身份
     * Summary: 无车承运平台DIS分布式数字身份申请.
     *
     * @param CreatePlatformDidRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreatePlatformDidResponse
     */
    public function createPlatformDidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreatePlatformDidResponse::fromMap($this->doRequest('1.0', 'digital.logistic.platform.did.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
     * Summary: 无车承运平台DIS分布式数字身份代理申请.
     *
     * @param CreateAgentDidRequest $request
     *
     * @return CreateAgentDidResponse
     */
    public function createAgentDid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAgentDidEx($request, $headers, $runtime);
    }

    /**
     * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
     * Summary: 无车承运平台DIS分布式数字身份代理申请.
     *
     * @param CreateAgentDidRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateAgentDidResponse
     */
    public function createAgentDidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAgentDidResponse::fromMap($this->doRequest('1.0', 'digital.logistic.agent.did.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 货主DIS分布式数字身份申请.
     *
     * @param CreateConsignorDisRequest $request
     *
     * @return CreateConsignorDisResponse
     */
    public function createConsignorDis($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsignorDisEx($request, $headers, $runtime);
    }

    /**
     * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 货主DIS分布式数字身份申请.
     *
     * @param CreateConsignorDisRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateConsignorDisResponse
     */
    public function createConsignorDisEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsignorDisResponse::fromMap($this->doRequest('1.0', 'digital.logistic.consignor.dis.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 司机DIS分布式数字身份申请.
     *
     * @param CreateDriverDisRequest $request
     *
     * @return CreateDriverDisResponse
     */
    public function createDriverDis($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDriverDisEx($request, $headers, $runtime);
    }

    /**
     * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 司机DIS分布式数字身份申请.
     *
     * @param CreateDriverDisRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateDriverDisResponse
     */
    public function createDriverDisEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDriverDisResponse::fromMap($this->doRequest('1.0', 'digital.logistic.driver.dis.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 货源订单创建，货主发货给平台时的订单信息
     * Summary: 货源订单创建.
     *
     * @param CreateCargoOrderRequest $request
     *
     * @return CreateCargoOrderResponse
     */
    public function createCargoOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCargoOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 货源订单创建，货主发货给平台时的订单信息
     * Summary: 货源订单创建.
     *
     * @param CreateCargoOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateCargoOrderResponse
     */
    public function createCargoOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCargoOrderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.cargo.order.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建.
     *
     * @param CreateCargoPayRequest $request
     *
     * @return CreateCargoPayResponse
     */
    public function createCargoPay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCargoPayEx($request, $headers, $runtime);
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建.
     *
     * @param CreateCargoPayRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateCargoPayResponse
     */
    public function createCargoPayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCargoPayResponse::fromMap($this->doRequest('1.0', 'digital.logistic.cargo.pay.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物流平台将运单指派给下游（承运商、司机）时产生
     * Summary: 运单创建.
     *
     * @param CreateWaybillOrderRequest $request
     *
     * @return CreateWaybillOrderResponse
     */
    public function createWaybillOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWaybillOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 物流平台将运单指派给下游（承运商、司机）时产生
     * Summary: 运单创建.
     *
     * @param CreateWaybillOrderRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateWaybillOrderResponse
     */
    public function createWaybillOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWaybillOrderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.order.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建物流支付订单，运单需已存在并且未结束
     * Summary: 运单支付订单创建.
     *
     * @param CreateWaybillPayRequest $request
     *
     * @return CreateWaybillPayResponse
     */
    public function createWaybillPay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWaybillPayEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建物流支付订单，运单需已存在并且未结束
     * Summary: 运单支付订单创建.
     *
     * @param CreateWaybillPayRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateWaybillPayResponse
     */
    public function createWaybillPayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWaybillPayResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.pay.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
     * Summary: 第三方位置信息上报.
     *
     * @param ImportWaybillLocationRequest $request
     *
     * @return ImportWaybillLocationResponse
     */
    public function importWaybillLocation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importWaybillLocationEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
     * Summary: 第三方位置信息上报.
     *
     * @param ImportWaybillLocationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ImportWaybillLocationResponse
     */
    public function importWaybillLocationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportWaybillLocationResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.location.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发票订单创建
     * Summary: 发票订单创建.
     *
     * @param CreateWaybillBillRequest $request
     *
     * @return CreateWaybillBillResponse
     */
    public function createWaybillBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWaybillBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 发票订单创建
     * Summary: 发票订单创建.
     *
     * @param CreateWaybillBillRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateWaybillBillResponse
     */
    public function createWaybillBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWaybillBillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.bill.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询物流运单状态
     * Summary: 查询运单状态
     *
     * @param QueryWaybillStatusRequest $request
     *
     * @return QueryWaybillStatusResponse
     */
    public function queryWaybillStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWaybillStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询物流运单状态
     * Summary: 查询运单状态
     *
     * @param QueryWaybillStatusRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryWaybillStatusResponse
     */
    public function queryWaybillStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWaybillStatusResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
     * 完成后的运单无法再调用支付订单与轨迹位置上传接口。
     * Summary: 运单完成.
     *
     * @param FinishWaybillOrderRequest $request
     *
     * @return FinishWaybillOrderResponse
     */
    public function finishWaybillOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishWaybillOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
     * 完成后的运单无法再调用支付订单与轨迹位置上传接口。
     * Summary: 运单完成.
     *
     * @param FinishWaybillOrderRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return FinishWaybillOrderResponse
     */
    public function finishWaybillOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishWaybillOrderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.order.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建.
     *
     * @param CreateCargoPayorderRequest $request
     *
     * @return CreateCargoPayorderResponse
     */
    public function createCargoPayorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCargoPayorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建.
     *
     * @param CreateCargoPayorderRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateCargoPayorderResponse
     */
    public function createCargoPayorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCargoPayorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.cargo.payorder.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当货物到达目的地时，调用此接口
     * Summary: 运单运输完成.
     *
     * @param SaveWaybillOrderRequest $request
     *
     * @return SaveWaybillOrderResponse
     */
    public function saveWaybillOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveWaybillOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 当货物到达目的地时，调用此接口
     * Summary: 运单运输完成.
     *
     * @param SaveWaybillOrderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SaveWaybillOrderResponse
     */
    public function saveWaybillOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveWaybillOrderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.order.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 运单关闭
     * Summary: 运单关闭.
     *
     * @param CloseWaybillOrderRequest $request
     *
     * @return CloseWaybillOrderResponse
     */
    public function closeWaybillOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->closeWaybillOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 运单关闭
     * Summary: 运单关闭.
     *
     * @param CloseWaybillOrderRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CloseWaybillOrderResponse
     */
    public function closeWaybillOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloseWaybillOrderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.order.close', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 完成物流运单
     * Summary: 完成物流运单.
     *
     * @param FinishFinanceWaybillRequest $request
     *
     * @return FinishFinanceWaybillResponse
     */
    public function finishFinanceWaybill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishFinanceWaybillEx($request, $headers, $runtime);
    }

    /**
     * Description: 完成物流运单
     * Summary: 完成物流运单.
     *
     * @param FinishFinanceWaybillRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return FinishFinanceWaybillResponse
     */
    public function finishFinanceWaybillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishFinanceWaybillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.finance.waybill.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 运输完成
     * Summary: 运输完成.
     *
     * @param FinishFinanceTransportRequest $request
     *
     * @return FinishFinanceTransportResponse
     */
    public function finishFinanceTransport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishFinanceTransportEx($request, $headers, $runtime);
    }

    /**
     * Description: 运输完成
     * Summary: 运输完成.
     *
     * @param FinishFinanceTransportRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return FinishFinanceTransportResponse
     */
    public function finishFinanceTransportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishFinanceTransportResponse::fromMap($this->doRequest('1.0', 'digital.logistic.finance.transport.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对运单信息项需更新时调用
     * Summary: 更新运单.
     *
     * @param UpdateFinanceWaybillRequest $request
     *
     * @return UpdateFinanceWaybillResponse
     */
    public function updateFinanceWaybill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateFinanceWaybillEx($request, $headers, $runtime);
    }

    /**
     * Description: 对运单信息项需更新时调用
     * Summary: 更新运单.
     *
     * @param UpdateFinanceWaybillRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateFinanceWaybillResponse
     */
    public function updateFinanceWaybillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateFinanceWaybillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.finance.waybill.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当司机到达货主装货地后，调用此接口
     * Summary: 起运运单.
     *
     * @param StartFinanceWaybillRequest $request
     *
     * @return StartFinanceWaybillResponse
     */
    public function startFinanceWaybill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startFinanceWaybillEx($request, $headers, $runtime);
    }

    /**
     * Description: 当司机到达货主装货地后，调用此接口
     * Summary: 起运运单.
     *
     * @param StartFinanceWaybillRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return StartFinanceWaybillResponse
     */
    public function startFinanceWaybillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartFinanceWaybillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.finance.waybill.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建承运商账户
     * Summary: 创建承运商账户.
     *
     * @param CreateCaptainDisRequest $request
     *
     * @return CreateCaptainDisResponse
     */
    public function createCaptainDis($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCaptainDisEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建承运商账户
     * Summary: 创建承运商账户.
     *
     * @param CreateCaptainDisRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateCaptainDisResponse
     */
    public function createCaptainDisEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCaptainDisResponse::fromMap($this->doRequest('1.0', 'digital.logistic.captain.dis.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建货主账单
     * Summary: 货主账单创建.
     *
     * @param CreateCargowaybillBillRequest $request
     *
     * @return CreateCargowaybillBillResponse
     */
    public function createCargowaybillBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCargowaybillBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建货主账单
     * Summary: 货主账单创建.
     *
     * @param CreateCargowaybillBillRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateCargowaybillBillResponse
     */
    public function createCargowaybillBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCargowaybillBillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.cargowaybill.bill.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认货主账单
     * Summary: 货主账单确认.
     *
     * @param ConfirmCargowaybillBillRequest $request
     *
     * @return ConfirmCargowaybillBillResponse
     */
    public function confirmCargowaybillBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmCargowaybillBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认货主账单
     * Summary: 货主账单确认.
     *
     * @param ConfirmCargowaybillBillRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ConfirmCargowaybillBillResponse
     */
    public function confirmCargowaybillBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmCargowaybillBillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.cargowaybill.bill.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 结算货主账单
     * Summary: 货主账单结算.
     *
     * @param CreateCargowaybillBillsettleRequest $request
     *
     * @return CreateCargowaybillBillsettleResponse
     */
    public function createCargowaybillBillsettle($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCargowaybillBillsettleEx($request, $headers, $runtime);
    }

    /**
     * Description: 结算货主账单
     * Summary: 货主账单结算.
     *
     * @param CreateCargowaybillBillsettleRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateCargowaybillBillsettleResponse
     */
    public function createCargowaybillBillsettleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCargowaybillBillsettleResponse::fromMap($this->doRequest('1.0', 'digital.logistic.cargowaybill.billsettle.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 运单平台did更新
     * Summary: 运单平台did更新.
     *
     * @param UpdateWaybillorderPlatformdidRequest $request
     *
     * @return UpdateWaybillorderPlatformdidResponse
     */
    public function updateWaybillorderPlatformdid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateWaybillorderPlatformdidEx($request, $headers, $runtime);
    }

    /**
     * Description: 运单平台did更新
     * Summary: 运单平台did更新.
     *
     * @param UpdateWaybillorderPlatformdidRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UpdateWaybillorderPlatformdidResponse
     */
    public function updateWaybillorderPlatformdidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateWaybillorderPlatformdidResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybillorder.platformdid.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新货主账单
     * Summary: 货主账单更新.
     *
     * @param UpdateCargowaybillBillRequest $request
     *
     * @return UpdateCargowaybillBillResponse
     */
    public function updateCargowaybillBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCargowaybillBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新货主账单
     * Summary: 货主账单更新.
     *
     * @param UpdateCargowaybillBillRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateCargowaybillBillResponse
     */
    public function updateCargowaybillBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCargowaybillBillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.cargowaybill.bill.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
     * Summary: 分布式数字身份申请did集合.
     *
     * @param CreateDisDidRequest $request
     *
     * @return CreateDisDidResponse
     */
    public function createDisDid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDisDidEx($request, $headers, $runtime);
    }

    /**
     * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
     * Summary: 分布式数字身份申请did集合.
     *
     * @param CreateDisDidRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateDisDidResponse
     */
    public function createDisDidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDisDidResponse::fromMap($this->doRequest('1.0', 'digital.logistic.dis.did.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 3PL运输合同上传
     * Summary: 3PL运输合同上传.
     *
     * @param UploadTransportContractRequest $request
     *
     * @return UploadTransportContractResponse
     */
    public function uploadTransportContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadTransportContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 3PL运输合同上传
     * Summary: 3PL运输合同上传.
     *
     * @param UploadTransportContractRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UploadTransportContractResponse
     */
    public function uploadTransportContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadTransportContractResponse::fromMap($this->doRequest('1.0', 'digital.logistic.transport.contract.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 3PL运输线路上传
     * Summary: 3PL运输线路上传.
     *
     * @param UploadTransportRouteRequest $request
     *
     * @return UploadTransportRouteResponse
     */
    public function uploadTransportRoute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadTransportRouteEx($request, $headers, $runtime);
    }

    /**
     * Description: 3PL运输线路上传
     * Summary: 3PL运输线路上传.
     *
     * @param UploadTransportRouteRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UploadTransportRouteResponse
     */
    public function uploadTransportRouteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadTransportRouteResponse::fromMap($this->doRequest('1.0', 'digital.logistic.transport.route.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 3PL运单创建
     * Summary: 3PL运单创建.
     *
     * @param CreateTransportWaybillRequest $request
     *
     * @return CreateTransportWaybillResponse
     */
    public function createTransportWaybill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTransportWaybillEx($request, $headers, $runtime);
    }

    /**
     * Description: 3PL运单创建
     * Summary: 3PL运单创建.
     *
     * @param CreateTransportWaybillRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateTransportWaybillResponse
     */
    public function createTransportWaybillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTransportWaybillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.transport.waybill.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 3PL运单状态更新
     * Summary: 3PL运单状态更新.
     *
     * @param UpdateWaybillActionRequest $request
     *
     * @return UpdateWaybillActionResponse
     */
    public function updateWaybillAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateWaybillActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 3PL运单状态更新
     * Summary: 3PL运单状态更新.
     *
     * @param UpdateWaybillActionRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateWaybillActionResponse
     */
    public function updateWaybillActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateWaybillActionResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.action.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 3PL运单修改
     * Summary: 3PL运单修改.
     *
     * @param UpdateTransportWaybillRequest $request
     *
     * @return UpdateTransportWaybillResponse
     */
    public function updateTransportWaybill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTransportWaybillEx($request, $headers, $runtime);
    }

    /**
     * Description: 3PL运单修改
     * Summary: 3PL运单修改.
     *
     * @param UpdateTransportWaybillRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateTransportWaybillResponse
     */
    public function updateTransportWaybillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTransportWaybillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.transport.waybill.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 3PL回单上传
     * Summary: 3PL回单上传.
     *
     * @param UploadTransportReceiptRequest $request
     *
     * @return UploadTransportReceiptResponse
     */
    public function uploadTransportReceipt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadTransportReceiptEx($request, $headers, $runtime);
    }

    /**
     * Description: 3PL回单上传
     * Summary: 3PL回单上传.
     *
     * @param UploadTransportReceiptRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UploadTransportReceiptResponse
     */
    public function uploadTransportReceiptEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadTransportReceiptResponse::fromMap($this->doRequest('1.0', 'digital.logistic.transport.receipt.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应收账单创建
     * Summary: 应收账单创建.
     *
     * @param CreateBillReceivablebillRequest $request
     *
     * @return CreateBillReceivablebillResponse
     */
    public function createBillReceivablebill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBillReceivablebillEx($request, $headers, $runtime);
    }

    /**
     * Description: 应收账单创建
     * Summary: 应收账单创建.
     *
     * @param CreateBillReceivablebillRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateBillReceivablebillResponse
     */
    public function createBillReceivablebillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBillReceivablebillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.receivablebill.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应收账单状态更新
     * Summary: 应收账单状态更新.
     *
     * @param UpdateReceivablebillStatusRequest $request
     *
     * @return UpdateReceivablebillStatusResponse
     */
    public function updateReceivablebillStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateReceivablebillStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 应收账单状态更新
     * Summary: 应收账单状态更新.
     *
     * @param UpdateReceivablebillStatusRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateReceivablebillStatusResponse
     */
    public function updateReceivablebillStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateReceivablebillStatusResponse::fromMap($this->doRequest('1.0', 'digital.logistic.receivablebill.status.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应收账单修改
     * Summary: 应收账单修改.
     *
     * @param UpdateBillReceivablebillRequest $request
     *
     * @return UpdateBillReceivablebillResponse
     */
    public function updateBillReceivablebill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBillReceivablebillEx($request, $headers, $runtime);
    }

    /**
     * Description: 应收账单修改
     * Summary: 应收账单修改.
     *
     * @param UpdateBillReceivablebillRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateBillReceivablebillResponse
     */
    public function updateBillReceivablebillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBillReceivablebillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.receivablebill.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 路运发票创建
     * Summary: 路运发票创建.
     *
     * @param CreateHighwayInvoiceRequest $request
     *
     * @return CreateHighwayInvoiceResponse
     */
    public function createHighwayInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createHighwayInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 路运发票创建
     * Summary: 路运发票创建.
     *
     * @param CreateHighwayInvoiceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateHighwayInvoiceResponse
     */
    public function createHighwayInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateHighwayInvoiceResponse::fromMap($this->doRequest('1.0', 'digital.logistic.highway.invoice.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询运单信息
     * Summary: 运单信息查询.
     *
     * @param QueryWaybillInfoRequest $request
     *
     * @return QueryWaybillInfoResponse
     */
    public function queryWaybillInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWaybillInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询运单信息
     * Summary: 运单信息查询.
     *
     * @param QueryWaybillInfoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryWaybillInfoResponse
     */
    public function queryWaybillInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWaybillInfoResponse::fromMap($this->doRequest('1.0', 'digital.logistic.waybill.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应收账单创建无明细版
     * Summary: 应收账单创建无明细版.
     *
     * @param CreateBillReceivablebillnodetailRequest $request
     *
     * @return CreateBillReceivablebillnodetailResponse
     */
    public function createBillReceivablebillnodetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBillReceivablebillnodetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 应收账单创建无明细版
     * Summary: 应收账单创建无明细版.
     *
     * @param CreateBillReceivablebillnodetailRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateBillReceivablebillnodetailResponse
     */
    public function createBillReceivablebillnodetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBillReceivablebillnodetailResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.receivablebillnodetail.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业信息上传/更新
     * Summary: 企业信息上传/更新.
     *
     * @param SaveTrailerCorpRequest $request
     *
     * @return SaveTrailerCorpResponse
     */
    public function saveTrailerCorp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveTrailerCorpEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业信息上传/更新
     * Summary: 企业信息上传/更新.
     *
     * @param SaveTrailerCorpRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SaveTrailerCorpResponse
     */
    public function saveTrailerCorpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveTrailerCorpResponse::fromMap($this->doRequest('1.0', 'digital.logistic.trailer.corp.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业运营数据上传/更新
     * Summary: 企业运营数据上传/更新.
     *
     * @param SaveTrailerTransportRequest $request
     *
     * @return SaveTrailerTransportResponse
     */
    public function saveTrailerTransport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveTrailerTransportEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业运营数据上传/更新
     * Summary: 企业运营数据上传/更新.
     *
     * @param SaveTrailerTransportRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SaveTrailerTransportResponse
     */
    public function saveTrailerTransportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveTrailerTransportResponse::fromMap($this->doRequest('1.0', 'digital.logistic.trailer.transport.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据实例id，查询实例状态
     * Summary: 实例状态查询.
     *
     * @param QueryBusinessInstancestatusRequest $request
     *
     * @return QueryBusinessInstancestatusResponse
     */
    public function queryBusinessInstancestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBusinessInstancestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据实例id，查询实例状态
     * Summary: 实例状态查询.
     *
     * @param QueryBusinessInstancestatusRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryBusinessInstancestatusResponse
     */
    public function queryBusinessInstancestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBusinessInstancestatusResponse::fromMap($this->doRequest('1.0', 'digital.logistic.business.instancestatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 司机信用流转协议签署并开通流转能力
     * Summary: 司机信用流转协议签署并开通流转能力.
     *
     * @param OpenCreditDriverRequest $request
     *
     * @return OpenCreditDriverResponse
     */
    public function openCreditDriver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openCreditDriverEx($request, $headers, $runtime);
    }

    /**
     * Description: 司机信用流转协议签署并开通流转能力
     * Summary: 司机信用流转协议签署并开通流转能力.
     *
     * @param OpenCreditDriverRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return OpenCreditDriverResponse
     */
    public function openCreditDriverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenCreditDriverResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.driver.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询司机信用流转能力开通情况
     * Summary: 查询司机信用流转能力开通情况.
     *
     * @param QueryCreditDriverRequest $request
     *
     * @return QueryCreditDriverResponse
     */
    public function queryCreditDriver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditDriverEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询司机信用流转能力开通情况
     * Summary: 查询司机信用流转能力开通情况.
     *
     * @param QueryCreditDriverRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryCreditDriverResponse
     */
    public function queryCreditDriverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditDriverResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.driver.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询货主信用流转能力开通情况
     * Summary: 查询货主信用流转能力开通情况.
     *
     * @param QueryCreditConsignorRequest $request
     *
     * @return QueryCreditConsignorResponse
     */
    public function queryCreditConsignor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditConsignorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询货主信用流转能力开通情况
     * Summary: 查询货主信用流转能力开通情况.
     *
     * @param QueryCreditConsignorRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryCreditConsignorResponse
     */
    public function queryCreditConsignorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditConsignorResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.consignor.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询货主信用流转额度
     * Summary: 查询货主信用流转额度.
     *
     * @param QueryCreditBalanceRequest $request
     *
     * @return QueryCreditBalanceResponse
     */
    public function queryCreditBalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditBalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询货主信用流转额度
     * Summary: 查询货主信用流转额度.
     *
     * @param QueryCreditBalanceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryCreditBalanceResponse
     */
    public function queryCreditBalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditBalanceResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.balance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
     * Summary: 发行信用流转批次信息上传.
     *
     * @param UploadCreditIssueRequest $request
     *
     * @return UploadCreditIssueResponse
     */
    public function uploadCreditIssue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadCreditIssueEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
     * Summary: 发行信用流转批次信息上传.
     *
     * @param UploadCreditIssueRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UploadCreditIssueResponse
     */
    public function uploadCreditIssueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadCreditIssueResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issue.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转批次状态查询
     * Summary: 信用流转批次状态查询.
     *
     * @param QueryCreditIssuebatchstatusRequest $request
     *
     * @return QueryCreditIssuebatchstatusResponse
     */
    public function queryCreditIssuebatchstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditIssuebatchstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转批次状态查询
     * Summary: 信用流转批次状态查询.
     *
     * @param QueryCreditIssuebatchstatusRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryCreditIssuebatchstatusResponse
     */
    public function queryCreditIssuebatchstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditIssuebatchstatusResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuebatchstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付批次撤销
     * Summary: 支付批次撤销
     *
     * @param CancelCreditIssuebatchRequest $request
     *
     * @return CancelCreditIssuebatchResponse
     */
    public function cancelCreditIssuebatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelCreditIssuebatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付批次撤销
     * Summary: 支付批次撤销
     *
     * @param CancelCreditIssuebatchRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CancelCreditIssuebatchResponse
     */
    public function cancelCreditIssuebatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelCreditIssuebatchResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuebatch.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据id查询信用凭证信息
     * Summary: 根据id查询信用凭证信息.
     *
     * @param QueryCreditIssuebyidRequest $request
     *
     * @return QueryCreditIssuebyidResponse
     */
    public function queryCreditIssuebyid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditIssuebyidEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据id查询信用凭证信息
     * Summary: 根据id查询信用凭证信息.
     *
     * @param QueryCreditIssuebyidRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryCreditIssuebyidResponse
     */
    public function queryCreditIssuebyidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditIssuebyidResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuebyid.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据时间查询信用凭证信息
     * Summary: 根据时间查询信用凭证信息.
     *
     * @param QueryCreditIssuebytimeRequest $request
     *
     * @return QueryCreditIssuebytimeResponse
     */
    public function queryCreditIssuebytime($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditIssuebytimeEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据时间查询信用凭证信息
     * Summary: 根据时间查询信用凭证信息.
     *
     * @param QueryCreditIssuebytimeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryCreditIssuebytimeResponse
     */
    public function queryCreditIssuebytimeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditIssuebytimeResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuebytime.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户持有的信用凭证信息
     * Summary: 查询用户持有的信用凭证信息.
     *
     * @param QueryCreditUserissueRequest $request
     *
     * @return QueryCreditUserissueResponse
     */
    public function queryCreditUserissue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditUserissueEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户持有的信用凭证信息
     * Summary: 查询用户持有的信用凭证信息.
     *
     * @param QueryCreditUserissueRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryCreditUserissueResponse
     */
    public function queryCreditUserissueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditUserissueResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.userissue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户信用流转流水记录
     * Summary: 查询用户信用流转流水记录.
     *
     * @param QueryCreditStatementRequest $request
     *
     * @return QueryCreditStatementResponse
     */
    public function queryCreditStatement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditStatementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户信用流转流水记录
     * Summary: 查询用户信用流转流水记录.
     *
     * @param QueryCreditStatementRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryCreditStatementResponse
     */
    public function queryCreditStatementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditStatementResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.statement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证拆分转让申请
     * Summary: 信用凭证拆分转让申请.
     *
     * @param CreateCreditIssuetransferRequest $request
     *
     * @return CreateCreditIssuetransferResponse
     */
    public function createCreditIssuetransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCreditIssuetransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证拆分转让申请
     * Summary: 信用凭证拆分转让申请.
     *
     * @param CreateCreditIssuetransferRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateCreditIssuetransferResponse
     */
    public function createCreditIssuetransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCreditIssuetransferResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuetransfer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证拆分转让结果查询
     * Summary: 信用凭证拆分转让结果查询.
     *
     * @param QueryCreditIssuetransferRequest $request
     *
     * @return QueryCreditIssuetransferResponse
     */
    public function queryCreditIssuetransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditIssuetransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证拆分转让结果查询
     * Summary: 信用凭证拆分转让结果查询.
     *
     * @param QueryCreditIssuetransferRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryCreditIssuetransferResponse
     */
    public function queryCreditIssuetransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditIssuetransferResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuetransfer.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证融资申请
     * Summary: 信用凭证融资申请.
     *
     * @param CreateCreditIssuefinanceRequest $request
     *
     * @return CreateCreditIssuefinanceResponse
     */
    public function createCreditIssuefinance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCreditIssuefinanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证融资申请
     * Summary: 信用凭证融资申请.
     *
     * @param CreateCreditIssuefinanceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateCreditIssuefinanceResponse
     */
    public function createCreditIssuefinanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCreditIssuefinanceResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuefinance.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证融资结果查询
     * Summary: 信用凭证融资结果查询.
     *
     * @param QueryCreditIssuefinanceRequest $request
     *
     * @return QueryCreditIssuefinanceResponse
     */
    public function queryCreditIssuefinance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditIssuefinanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证融资结果查询
     * Summary: 信用凭证融资结果查询.
     *
     * @param QueryCreditIssuefinanceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryCreditIssuefinanceResponse
     */
    public function queryCreditIssuefinanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditIssuefinanceResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuefinance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证清分信息查询
     * Summary: 信用凭证清分信息查询.
     *
     * @param QueryCreditIssuereceivableRequest $request
     *
     * @return QueryCreditIssuereceivableResponse
     */
    public function queryCreditIssuereceivable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditIssuereceivableEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证清分信息查询
     * Summary: 信用凭证清分信息查询.
     *
     * @param QueryCreditIssuereceivableRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryCreditIssuereceivableResponse
     */
    public function queryCreditIssuereceivableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditIssuereceivableResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuereceivable.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证资产查询
     * Summary: 信用凭证资产查询.
     *
     * @param QueryCreditIssueamountRequest $request
     *
     * @return QueryCreditIssueamountResponse
     */
    public function queryCreditIssueamount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditIssueamountEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证资产查询
     * Summary: 信用凭证资产查询.
     *
     * @param QueryCreditIssueamountRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryCreditIssueamountResponse
     */
    public function queryCreditIssueamountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditIssueamountResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issueamount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物流金融统一回调接口
     * Summary: 物流金融统一回调接口.
     *
     * @param CallbackCreditCommonRequest $request
     *
     * @return CallbackCreditCommonResponse
     */
    public function callbackCreditCommon($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackCreditCommonEx($request, $headers, $runtime);
    }

    /**
     * Description: 物流金融统一回调接口
     * Summary: 物流金融统一回调接口.
     *
     * @param CallbackCreditCommonRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CallbackCreditCommonResponse
     */
    public function callbackCreditCommonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackCreditCommonResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.common.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证主动清分
     * Summary: 信用凭证主动清分.
     *
     * @param ApplyCreditIssueclearRequest $request
     *
     * @return ApplyCreditIssueclearResponse
     */
    public function applyCreditIssueclear($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyCreditIssueclearEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证主动清分
     * Summary: 信用凭证主动清分.
     *
     * @param ApplyCreditIssueclearRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ApplyCreditIssueclearResponse
     */
    public function applyCreditIssueclearEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyCreditIssueclearResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issueclear.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物流金融代理消息
     * Summary: 物流金融代理消息.
     *
     * @param SendCreditProxyRequest $request
     *
     * @return SendCreditProxyResponse
     */
    public function sendCreditProxy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCreditProxyEx($request, $headers, $runtime);
    }

    /**
     * Description: 物流金融代理消息
     * Summary: 物流金融代理消息.
     *
     * @param SendCreditProxyRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SendCreditProxyResponse
     */
    public function sendCreditProxyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCreditProxyResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.proxy.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 运单信用流转核验结果查询
     * Summary: 运单信用流转核验结果查询.
     *
     * @param CheckCreditWaybillRequest $request
     *
     * @return CheckCreditWaybillResponse
     */
    public function checkCreditWaybill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkCreditWaybillEx($request, $headers, $runtime);
    }

    /**
     * Description: 运单信用流转核验结果查询
     * Summary: 运单信用流转核验结果查询.
     *
     * @param CheckCreditWaybillRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CheckCreditWaybillResponse
     */
    public function checkCreditWaybillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckCreditWaybillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.waybill.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物流金融信用流转司机换绑
     * Summary: 物流金融信用流转司机换绑.
     *
     * @param ReopenCreditDriverRequest $request
     *
     * @return ReopenCreditDriverResponse
     */
    public function reopenCreditDriver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reopenCreditDriverEx($request, $headers, $runtime);
    }

    /**
     * Description: 物流金融信用流转司机换绑
     * Summary: 物流金融信用流转司机换绑.
     *
     * @param ReopenCreditDriverRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ReopenCreditDriverResponse
     */
    public function reopenCreditDriverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReopenCreditDriverResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.driver.reopen', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 线下协议授权关系上传
     * Summary: 线下协议授权关系上传.
     *
     * @param UploadCreditAuthorizationRequest $request
     *
     * @return UploadCreditAuthorizationResponse
     */
    public function uploadCreditAuthorization($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadCreditAuthorizationEx($request, $headers, $runtime);
    }

    /**
     * Description: 线下协议授权关系上传
     * Summary: 线下协议授权关系上传.
     *
     * @param UploadCreditAuthorizationRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UploadCreditAuthorizationResponse
     */
    public function uploadCreditAuthorizationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadCreditAuthorizationResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.authorization.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 线上应收转让确认关系
     * Summary: 线上应收转让确认关系.
     *
     * @param UploadCreditConfirmRequest $request
     *
     * @return UploadCreditConfirmResponse
     */
    public function uploadCreditConfirm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadCreditConfirmEx($request, $headers, $runtime);
    }

    /**
     * Description: 线上应收转让确认关系
     * Summary: 线上应收转让确认关系.
     *
     * @param UploadCreditConfirmRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UploadCreditConfirmResponse
     */
    public function uploadCreditConfirmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadCreditConfirmResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.confirm.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物流信用流转凭证批量发行
     * Summary: 物流信用流转凭证批量发行.
     *
     * @param BatchcreateCreditmodeIssueRequest $request
     *
     * @return BatchcreateCreditmodeIssueResponse
     */
    public function batchcreateCreditmodeIssue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateCreditmodeIssueEx($request, $headers, $runtime);
    }

    /**
     * Description: 物流信用流转凭证批量发行
     * Summary: 物流信用流转凭证批量发行.
     *
     * @param BatchcreateCreditmodeIssueRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return BatchcreateCreditmodeIssueResponse
     */
    public function batchcreateCreditmodeIssueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateCreditmodeIssueResponse::fromMap($this->doRequest('1.0', 'digital.logistic.creditmode.issue.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物流信用流转按模式主动清分
     * Summary: 物流信用流转按模式主动清分.
     *
     * @param ApplyCreditmodeIssueclearRequest $request
     *
     * @return ApplyCreditmodeIssueclearResponse
     */
    public function applyCreditmodeIssueclear($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyCreditmodeIssueclearEx($request, $headers, $runtime);
    }

    /**
     * Description: 物流信用流转按模式主动清分
     * Summary: 物流信用流转按模式主动清分.
     *
     * @param ApplyCreditmodeIssueclearRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ApplyCreditmodeIssueclearResponse
     */
    public function applyCreditmodeIssueclearEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyCreditmodeIssueclearResponse::fromMap($this->doRequest('1.0', 'digital.logistic.creditmode.issueclear.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转发行信息上传SAAS版
     * Summary: 信用流转发行信息上传SAAS版.
     *
     * @param UploadCreditIssuebysaasRequest $request
     *
     * @return UploadCreditIssuebysaasResponse
     */
    public function uploadCreditIssuebysaas($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadCreditIssuebysaasEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转发行信息上传SAAS版
     * Summary: 信用流转发行信息上传SAAS版.
     *
     * @param UploadCreditIssuebysaasRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UploadCreditIssuebysaasResponse
     */
    public function uploadCreditIssuebysaasEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadCreditIssuebysaasResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuebysaas.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转B模式发行批次撤销SAAS版
     * Summary: 信用流转B模式发行批次撤销SAAS版.
     *
     * @param CancelCreditIssuebatchbysaasRequest $request
     *
     * @return CancelCreditIssuebatchbysaasResponse
     */
    public function cancelCreditIssuebatchbysaas($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelCreditIssuebatchbysaasEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转B模式发行批次撤销SAAS版
     * Summary: 信用流转B模式发行批次撤销SAAS版.
     *
     * @param CancelCreditIssuebatchbysaasRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CancelCreditIssuebatchbysaasResponse
     */
    public function cancelCreditIssuebatchbysaasEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelCreditIssuebatchbysaasResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuebatchbysaas.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转可用额度查询SAAS版
     * Summary: 信用流转可用额度查询SAAS版.
     *
     * @param QueryCreditBalancebysaasRequest $request
     *
     * @return QueryCreditBalancebysaasResponse
     */
    public function queryCreditBalancebysaas($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditBalancebysaasEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转可用额度查询SAAS版
     * Summary: 信用流转可用额度查询SAAS版.
     *
     * @param QueryCreditBalancebysaasRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryCreditBalancebysaasResponse
     */
    public function queryCreditBalancebysaasEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditBalancebysaasResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.balancebysaas.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证电子回单获取
     * Summary: 信用凭证电子回单获取.
     *
     * @param GetCreditIssuescpticketRequest $request
     *
     * @return GetCreditIssuescpticketResponse
     */
    public function getCreditIssuescpticket($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCreditIssuescpticketEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证电子回单获取
     * Summary: 信用凭证电子回单获取.
     *
     * @param GetCreditIssuescpticketRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetCreditIssuescpticketResponse
     */
    public function getCreditIssuescpticketEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCreditIssuescpticketResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuescpticket.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证电子回单获取结果查询接口
     * Summary: 信用凭证电子回单获取结果查询接口.
     *
     * @param QueryCreditIssuescpticketresultRequest $request
     *
     * @return QueryCreditIssuescpticketresultResponse
     */
    public function queryCreditIssuescpticketresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditIssuescpticketresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证电子回单获取结果查询接口
     * Summary: 信用凭证电子回单获取结果查询接口.
     *
     * @param QueryCreditIssuescpticketresultRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryCreditIssuescpticketresultResponse
     */
    public function queryCreditIssuescpticketresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditIssuescpticketresultResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuescpticketresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转A+模式发行信息上传
     * Summary: 信用流转A+模式发行信息上传.
     *
     * @param UploadCreditAplusissueRequest $request
     *
     * @return UploadCreditAplusissueResponse
     */
    public function uploadCreditAplusissue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadCreditAplusissueEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转A+模式发行信息上传
     * Summary: 信用流转A+模式发行信息上传.
     *
     * @param UploadCreditAplusissueRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UploadCreditAplusissueResponse
     */
    public function uploadCreditAplusissueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadCreditAplusissueResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.aplusissue.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转可用额度查询接口
     * Summary: 信用流转可用额度查询接口.
     *
     * @param QueryCreditCreditamountRequest $request
     *
     * @return QueryCreditCreditamountResponse
     */
    public function queryCreditCreditamount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditCreditamountEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转可用额度查询接口
     * Summary: 信用流转可用额度查询接口.
     *
     * @param QueryCreditCreditamountRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryCreditCreditamountResponse
     */
    public function queryCreditCreditamountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditCreditamountResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.creditamount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转非授信通用签约接口
     * Summary: 信用流转非授信通用签约接口.
     *
     * @param CreateCreditCommonsignRequest $request
     *
     * @return CreateCreditCommonsignResponse
     */
    public function createCreditCommonsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCreditCommonsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转非授信通用签约接口
     * Summary: 信用流转非授信通用签约接口.
     *
     * @param CreateCreditCommonsignRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateCreditCommonsignResponse
     */
    public function createCreditCommonsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCreditCommonsignResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.commonsign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转非授信通用签约查询接口
     * Summary: 信用流转非授信通用签约查询接口.
     *
     * @param QueryCreditCommonsignRequest $request
     *
     * @return QueryCreditCommonsignResponse
     */
    public function queryCreditCommonsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCreditCommonsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转非授信通用签约查询接口
     * Summary: 信用流转非授信通用签约查询接口.
     *
     * @param QueryCreditCommonsignRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryCreditCommonsignResponse
     */
    public function queryCreditCommonsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCreditCommonsignResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.commonsign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转凭证合并发行接口
     * Summary: 信用流转凭证合并发行接口.
     *
     * @param BatchcreateCreditIssueRequest $request
     *
     * @return BatchcreateCreditIssueResponse
     */
    public function batchcreateCreditIssue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateCreditIssueEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转凭证合并发行接口
     * Summary: 信用流转凭证合并发行接口.
     *
     * @param BatchcreateCreditIssueRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BatchcreateCreditIssueResponse
     */
    public function batchcreateCreditIssueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateCreditIssueResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issue.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用流转凭证合并发行信息上传接口
     * Summary: 信用流转凭证合并发行信息上传接口.
     *
     * @param UploadCreditIssuebatchRequest $request
     *
     * @return UploadCreditIssuebatchResponse
     */
    public function uploadCreditIssuebatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadCreditIssuebatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用流转凭证合并发行信息上传接口
     * Summary: 信用流转凭证合并发行信息上传接口.
     *
     * @param UploadCreditIssuebatchRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UploadCreditIssuebatchResponse
     */
    public function uploadCreditIssuebatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadCreditIssuebatchResponse::fromMap($this->doRequest('1.0', 'digital.logistic.credit.issuebatch.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
     * Summary: 信用凭证电子回单获取(新).
     *
     * @param GetIssueTransferfileRequest $request
     *
     * @return GetIssueTransferfileResponse
     */
    public function getIssueTransferfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getIssueTransferfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
     * Summary: 信用凭证电子回单获取(新).
     *
     * @param GetIssueTransferfileRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetIssueTransferfileResponse
     */
    public function getIssueTransferfileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetIssueTransferfileResponse::fromMap($this->doRequest('1.0', 'digital.logistic.issue.transferfile.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-中华财险-承运人责任险.
     *
     * @param ApplyInsurancepolicyZhonghuacaixianRequest $request
     *
     * @return ApplyInsurancepolicyZhonghuacaixianResponse
     */
    public function applyInsurancepolicyZhonghuacaixian($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsurancepolicyZhonghuacaixianEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-中华财险-承运人责任险.
     *
     * @param ApplyInsurancepolicyZhonghuacaixianRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return ApplyInsurancepolicyZhonghuacaixianResponse
     */
    public function applyInsurancepolicyZhonghuacaixianEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsurancepolicyZhonghuacaixianResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurancepolicy.zhonghuacaixian.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-中华财险-承运人责任险.
     *
     * @param CancelInsurancepolicyZhonghuacaixianRequest $request
     *
     * @return CancelInsurancepolicyZhonghuacaixianResponse
     */
    public function cancelInsurancepolicyZhonghuacaixian($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelInsurancepolicyZhonghuacaixianEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-中华财险-承运人责任险.
     *
     * @param CancelInsurancepolicyZhonghuacaixianRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return CancelInsurancepolicyZhonghuacaixianResponse
     */
    public function cancelInsurancepolicyZhonghuacaixianEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelInsurancepolicyZhonghuacaixianResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurancepolicy.zhonghuacaixian.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险理赔通知
     * Summary: 保险理赔通知.
     *
     * @param PushInsurancenotifyClaimRequest $request
     *
     * @return PushInsurancenotifyClaimResponse
     */
    public function pushInsurancenotifyClaim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushInsurancenotifyClaimEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险理赔通知
     * Summary: 保险理赔通知.
     *
     * @param PushInsurancenotifyClaimRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PushInsurancenotifyClaimResponse
     */
    public function pushInsurancenotifyClaimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushInsurancenotifyClaimResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurancenotify.claim.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
     * Summary: 上传文件链接申请.
     *
     * @param ApplyInsuranceFileurlRequest $request
     *
     * @return ApplyInsuranceFileurlResponse
     */
    public function applyInsuranceFileurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceFileurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
     * Summary: 上传文件链接申请.
     *
     * @param ApplyInsuranceFileurlRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ApplyInsuranceFileurlResponse
     */
    public function applyInsuranceFileurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceFileurlResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.fileurl.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
     * 接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-承运人平台责任险.
     *
     * @param ApplyInsurancepolicyUniversalRequest $request
     *
     * @return ApplyInsurancepolicyUniversalResponse
     */
    public function applyInsurancepolicyUniversal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsurancepolicyUniversalEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
     * 接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-承运人平台责任险.
     *
     * @param ApplyInsurancepolicyUniversalRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ApplyInsurancepolicyUniversalResponse
     */
    public function applyInsurancepolicyUniversalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsurancepolicyUniversalResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurancepolicy.universal.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-承运人平台责任险.
     *
     * @param CancelInsurancepolicyUniversalRequest $request
     *
     * @return CancelInsurancepolicyUniversalResponse
     */
    public function cancelInsurancepolicyUniversal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelInsurancepolicyUniversalEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-承运人平台责任险.
     *
     * @param CancelInsurancepolicyUniversalRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CancelInsurancepolicyUniversalResponse
     */
    public function cancelInsurancepolicyUniversalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelInsurancepolicyUniversalResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurancepolicy.universal.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 利用区块链智能合约进行离线保单存证
     * Summary: 离线保单存证推送
     *
     * @param PushInsuranceOlpRequest $request
     *
     * @return PushInsuranceOlpResponse
     */
    public function pushInsuranceOlp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushInsuranceOlpEx($request, $headers, $runtime);
    }

    /**
     * Description: 利用区块链智能合约进行离线保单存证
     * Summary: 离线保单存证推送
     *
     * @param PushInsuranceOlpRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return PushInsuranceOlpResponse
     */
    public function pushInsuranceOlpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushInsuranceOlpResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.olp.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 利用区块链智能合约进行离线保单信息更新追踪
     * Summary: 离线保单更新.
     *
     * @param UpdateInsuranceOlpRequest $request
     *
     * @return UpdateInsuranceOlpResponse
     */
    public function updateInsuranceOlp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateInsuranceOlpEx($request, $headers, $runtime);
    }

    /**
     * Description: 利用区块链智能合约进行离线保单信息更新追踪
     * Summary: 离线保单更新.
     *
     * @param UpdateInsuranceOlpRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateInsuranceOlpResponse
     */
    public function updateInsuranceOlpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateInsuranceOlpResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.olp.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 再保分保单推送接口
     * Summary: 再保分保单推送
     *
     * @param PushInsuranceReppolicyRequest $request
     *
     * @return PushInsuranceReppolicyResponse
     */
    public function pushInsuranceReppolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushInsuranceReppolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 再保分保单推送接口
     * Summary: 再保分保单推送
     *
     * @param PushInsuranceReppolicyRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PushInsuranceReppolicyResponse
     */
    public function pushInsuranceReppolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushInsuranceReppolicyResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.reppolicy.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 再保批改单推送
     * Summary: 再保批改单推送
     *
     * @param PushInsuranceRepcorrectRequest $request
     *
     * @return PushInsuranceRepcorrectResponse
     */
    public function pushInsuranceRepcorrect($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushInsuranceRepcorrectEx($request, $headers, $runtime);
    }

    /**
     * Description: 再保批改单推送
     * Summary: 再保批改单推送
     *
     * @param PushInsuranceRepcorrectRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return PushInsuranceRepcorrectResponse
     */
    public function pushInsuranceRepcorrectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushInsuranceRepcorrectResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.repcorrect.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 跨境运费险投保申请
     * Summary: 跨境运费险投保.
     *
     * @param ApplyInsuranceCbrfRequest $request
     *
     * @return ApplyInsuranceCbrfResponse
     */
    public function applyInsuranceCbrf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceCbrfEx($request, $headers, $runtime);
    }

    /**
     * Description: 跨境运费险投保申请
     * Summary: 跨境运费险投保.
     *
     * @param ApplyInsuranceCbrfRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ApplyInsuranceCbrfResponse
     */
    public function applyInsuranceCbrfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceCbrfResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.cbrf.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 跨境运费险理赔
     * Summary: 跨境运费险理赔.
     *
     * @param RepayInsuranceCbrfRequest $request
     *
     * @return RepayInsuranceCbrfResponse
     */
    public function repayInsuranceCbrf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayInsuranceCbrfEx($request, $headers, $runtime);
    }

    /**
     * Description: 跨境运费险理赔
     * Summary: 跨境运费险理赔.
     *
     * @param RepayInsuranceCbrfRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return RepayInsuranceCbrfResponse
     */
    public function repayInsuranceCbrfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayInsuranceCbrfResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.cbrf.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 跨境出口货运险投保
     * Summary: 跨境出口货运险投保.
     *
     * @param ApplyInsuranceCbecRequest $request
     *
     * @return ApplyInsuranceCbecResponse
     */
    public function applyInsuranceCbec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceCbecEx($request, $headers, $runtime);
    }

    /**
     * Description: 跨境出口货运险投保
     * Summary: 跨境出口货运险投保.
     *
     * @param ApplyInsuranceCbecRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ApplyInsuranceCbecResponse
     */
    public function applyInsuranceCbecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceCbecResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.cbec.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 货物入库申报
     * Summary: 货物入库申报.
     *
     * @param ApplyInsuranceStockinRequest $request
     *
     * @return ApplyInsuranceStockinResponse
     */
    public function applyInsuranceStockin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceStockinEx($request, $headers, $runtime);
    }

    /**
     * Description: 货物入库申报
     * Summary: 货物入库申报.
     *
     * @param ApplyInsuranceStockinRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ApplyInsuranceStockinResponse
     */
    public function applyInsuranceStockinEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceStockinResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.stockin.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 货物库存申报
     * Summary: 货物库存申报.
     *
     * @param ApplyInsuranceInventoryRequest $request
     *
     * @return ApplyInsuranceInventoryResponse
     */
    public function applyInsuranceInventory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceInventoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 货物库存申报
     * Summary: 货物库存申报.
     *
     * @param ApplyInsuranceInventoryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ApplyInsuranceInventoryResponse
     */
    public function applyInsuranceInventoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceInventoryResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.inventory.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 海外邮包险投保api
     * Summary: 海外邮包险投保.
     *
     * @param ApplyInsuranceOspiRequest $request
     *
     * @return ApplyInsuranceOspiResponse
     */
    public function applyInsuranceOspi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceOspiEx($request, $headers, $runtime);
    }

    /**
     * Description: 海外邮包险投保api
     * Summary: 海外邮包险投保.
     *
     * @param ApplyInsuranceOspiRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ApplyInsuranceOspiResponse
     */
    public function applyInsuranceOspiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceOspiResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.ospi.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 海外、跨境邮包险、平台责任险的理赔报案
     * Summary: 海外、跨境邮包险、平台责任险报案.
     *
     * @param ApplyInsuranceOspireportRequest $request
     *
     * @return ApplyInsuranceOspireportResponse
     */
    public function applyInsuranceOspireport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceOspireportEx($request, $headers, $runtime);
    }

    /**
     * Description: 海外、跨境邮包险、平台责任险的理赔报案
     * Summary: 海外、跨境邮包险、平台责任险报案.
     *
     * @param ApplyInsuranceOspireportRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ApplyInsuranceOspireportResponse
     */
    public function applyInsuranceOspireportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceOspireportResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.ospireport.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 海外、跨境邮包险、平台责任险案件结果通知
     * Summary: 海外、跨境邮包险、平台责任险案件结果通知.
     *
     * @param NotifyInsuranceOspireportRequest $request
     *
     * @return NotifyInsuranceOspireportResponse
     */
    public function notifyInsuranceOspireport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyInsuranceOspireportEx($request, $headers, $runtime);
    }

    /**
     * Description: 海外、跨境邮包险、平台责任险案件结果通知
     * Summary: 海外、跨境邮包险、平台责任险案件结果通知.
     *
     * @param NotifyInsuranceOspireportRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return NotifyInsuranceOspireportResponse
     */
    public function notifyInsuranceOspireportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyInsuranceOspireportResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.ospireport.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 驿站宝投保
     * Summary: 驿站宝投保.
     *
     * @param ApplyInsuranceYzbRequest $request
     *
     * @return ApplyInsuranceYzbResponse
     */
    public function applyInsuranceYzb($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceYzbEx($request, $headers, $runtime);
    }

    /**
     * Description: 驿站宝投保
     * Summary: 驿站宝投保.
     *
     * @param ApplyInsuranceYzbRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ApplyInsuranceYzbResponse
     */
    public function applyInsuranceYzbEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceYzbResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.yzb.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 跨境邮包险、平台责任险投保
     * Summary: 跨境邮包险、平台责任险投保.
     *
     * @param ApplyInsuranceCbpiRequest $request
     *
     * @return ApplyInsuranceCbpiResponse
     */
    public function applyInsuranceCbpi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceCbpiEx($request, $headers, $runtime);
    }

    /**
     * Description: 跨境邮包险、平台责任险投保
     * Summary: 跨境邮包险、平台责任险投保.
     *
     * @param ApplyInsuranceCbpiRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ApplyInsuranceCbpiResponse
     */
    public function applyInsuranceCbpiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceCbpiResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.cbpi.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 驿站宝报案
     * Summary: 驿站宝报案.
     *
     * @param ApplyInsuranceYzbreportRequest $request
     *
     * @return ApplyInsuranceYzbreportResponse
     */
    public function applyInsuranceYzbreport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceYzbreportEx($request, $headers, $runtime);
    }

    /**
     * Description: 驿站宝报案
     * Summary: 驿站宝报案.
     *
     * @param ApplyInsuranceYzbreportRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ApplyInsuranceYzbreportResponse
     */
    public function applyInsuranceYzbreportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceYzbreportResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.yzbreport.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 驿站宝案件进度查询
     * Summary: 驿站宝案件进度查询.
     *
     * @param QueryInsuranceYzbreportRequest $request
     *
     * @return QueryInsuranceYzbreportResponse
     */
    public function queryInsuranceYzbreport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInsuranceYzbreportEx($request, $headers, $runtime);
    }

    /**
     * Description: 驿站宝案件进度查询
     * Summary: 驿站宝案件进度查询.
     *
     * @param QueryInsuranceYzbreportRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryInsuranceYzbreportResponse
     */
    public function queryInsuranceYzbreportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInsuranceYzbreportResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.yzbreport.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 零担快运运单上链存证接口
     * Summary: 零担快运运单上链存证接口.
     *
     * @param SaveInsuranceWaybillRequest $request
     *
     * @return SaveInsuranceWaybillResponse
     */
    public function saveInsuranceWaybill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveInsuranceWaybillEx($request, $headers, $runtime);
    }

    /**
     * Description: 零担快运运单上链存证接口
     * Summary: 零担快运运单上链存证接口.
     *
     * @param SaveInsuranceWaybillRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SaveInsuranceWaybillResponse
     */
    public function saveInsuranceWaybillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveInsuranceWaybillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.waybill.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险电子保单查询
     * Summary: 保险电子保单查询.
     *
     * @param QueryInsuranceEpolicyRequest $request
     *
     * @return QueryInsuranceEpolicyResponse
     */
    public function queryInsuranceEpolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInsuranceEpolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险电子保单查询
     * Summary: 保险电子保单查询.
     *
     * @param QueryInsuranceEpolicyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryInsuranceEpolicyResponse
     */
    public function queryInsuranceEpolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInsuranceEpolicyResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.epolicy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 报案案件结果通知（内部）
     * Summary: 报案案件结果通知（内部）.
     *
     * @param NotifyInsuranceReportresultRequest $request
     *
     * @return NotifyInsuranceReportresultResponse
     */
    public function notifyInsuranceReportresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyInsuranceReportresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 报案案件结果通知（内部）
     * Summary: 报案案件结果通知（内部）.
     *
     * @param NotifyInsuranceReportresultRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return NotifyInsuranceReportresultResponse
     */
    public function notifyInsuranceReportresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyInsuranceReportresultResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.reportresult.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 不可达项目投保接口
     * Summary: 跨境退货运费险-不可达项目投保接口.
     *
     * @param ApplyCbrfInsureRequest $request
     *
     * @return ApplyCbrfInsureResponse
     */
    public function applyCbrfInsure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyCbrfInsureEx($request, $headers, $runtime);
    }

    /**
     * Description: 不可达项目投保接口
     * Summary: 跨境退货运费险-不可达项目投保接口.
     *
     * @param ApplyCbrfInsureRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ApplyCbrfInsureResponse
     */
    public function applyCbrfInsureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyCbrfInsureResponse::fromMap($this->doRequest('1.0', 'digital.logistic.cbrf.insure.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 不可达项目理赔接口
     * Summary: 跨境退货运费险-不可达项目理赔接口.
     *
     * @param RepayCbrfClaimRequest $request
     *
     * @return RepayCbrfClaimResponse
     */
    public function repayCbrfClaim($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayCbrfClaimEx($request, $headers, $runtime);
    }

    /**
     * Description: 不可达项目理赔接口
     * Summary: 跨境退货运费险-不可达项目理赔接口.
     *
     * @param RepayCbrfClaimRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RepayCbrfClaimResponse
     */
    public function repayCbrfClaimEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayCbrfClaimResponse::fromMap($this->doRequest('1.0', 'digital.logistic.cbrf.claim.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大保单批单
     * Summary: 大保单批单申请接口.
     *
     * @param ApplyInsuranceEndorsementRequest $request
     *
     * @return ApplyInsuranceEndorsementResponse
     */
    public function applyInsuranceEndorsement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsuranceEndorsementEx($request, $headers, $runtime);
    }

    /**
     * Description: 大保单批单
     * Summary: 大保单批单申请接口.
     *
     * @param ApplyInsuranceEndorsementRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ApplyInsuranceEndorsementResponse
     */
    public function applyInsuranceEndorsementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsuranceEndorsementResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.endorsement.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 大保单批单查询接口
     * Summary: 大保单批单查询接口.
     *
     * @param QueryInsuranceEndorsementRequest $request
     *
     * @return QueryInsuranceEndorsementResponse
     */
    public function queryInsuranceEndorsement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInsuranceEndorsementEx($request, $headers, $runtime);
    }

    /**
     * Description: 大保单批单查询接口
     * Summary: 大保单批单查询接口.
     *
     * @param QueryInsuranceEndorsementRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryInsuranceEndorsementResponse
     */
    public function queryInsuranceEndorsementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInsuranceEndorsementResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.endorsement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 海外、跨境邮包险预报案
     * Summary: 海外、跨境邮包险预报案.
     *
     * @param ApplyInsurancePiprereportRequest $request
     *
     * @return ApplyInsurancePiprereportResponse
     */
    public function applyInsurancePiprereport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyInsurancePiprereportEx($request, $headers, $runtime);
    }

    /**
     * Description: 海外、跨境邮包险预报案
     * Summary: 海外、跨境邮包险预报案.
     *
     * @param ApplyInsurancePiprereportRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ApplyInsurancePiprereportResponse
     */
    public function applyInsurancePiprereportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyInsurancePiprereportResponse::fromMap($this->doRequest('1.0', 'digital.logistic.insurance.piprereport.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权签署信息推送
     * Summary: 授权签署信息推送
     *
     * @param PushAuthSigninfoRequest $request
     *
     * @return PushAuthSigninfoResponse
     */
    public function pushAuthSigninfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushAuthSigninfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权签署信息推送
     * Summary: 授权签署信息推送
     *
     * @param PushAuthSigninfoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return PushAuthSigninfoResponse
     */
    public function pushAuthSigninfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushAuthSigninfoResponse::fromMap($this->doRequest('1.0', 'digital.logistic.auth.signinfo.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资委托支付入账查询
     * Summary: 委托支付入账查询.
     *
     * @param QueryPfPaymentRequest $request
     *
     * @return QueryPfPaymentResponse
     */
    public function queryPfPayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPfPaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资委托支付入账查询
     * Summary: 委托支付入账查询.
     *
     * @param QueryPfPaymentRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryPfPaymentResponse
     */
    public function queryPfPaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPfPaymentResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.payment.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资借据信息查询
     * Summary: 借据信息查询.
     *
     * @param QueryPfIouRequest $request
     *
     * @return QueryPfIouResponse
     */
    public function queryPfIou($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPfIouEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资借据信息查询
     * Summary: 借据信息查询.
     *
     * @param QueryPfIouRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryPfIouResponse
     */
    public function queryPfIouEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPfIouResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.iou.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资授信额度查询
     * Summary: 授信额度查询.
     *
     * @param QueryPfQuotaRequest $request
     *
     * @return QueryPfQuotaResponse
     */
    public function queryPfQuota($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPfQuotaEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资授信额度查询
     * Summary: 授信额度查询.
     *
     * @param QueryPfQuotaRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryPfQuotaResponse
     */
    public function queryPfQuotaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPfQuotaResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.quota.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资支用申请
     * Summary: 池融资支用申请.
     *
     * @param ApplyPfWaybillfinancingRequest $request
     *
     * @return ApplyPfWaybillfinancingResponse
     */
    public function applyPfWaybillfinancing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyPfWaybillfinancingEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资支用申请
     * Summary: 池融资支用申请.
     *
     * @param ApplyPfWaybillfinancingRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ApplyPfWaybillfinancingResponse
     */
    public function applyPfWaybillfinancingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyPfWaybillfinancingResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.waybillfinancing.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资账单质押，用于入池
     * Summary: 池融资账单质押
     *
     * @param PushPfPledgeRequest $request
     *
     * @return PushPfPledgeResponse
     */
    public function pushPfPledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushPfPledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资账单质押，用于入池
     * Summary: 池融资账单质押
     *
     * @param PushPfPledgeRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return PushPfPledgeResponse
     */
    public function pushPfPledgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushPfPledgeResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.pledge.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 入池账单质押状态查询
     * Summary: 质押状态查询.
     *
     * @param QueryPfPledgeRequest $request
     *
     * @return QueryPfPledgeResponse
     */
    public function queryPfPledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPfPledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 入池账单质押状态查询
     * Summary: 质押状态查询.
     *
     * @param QueryPfPledgeRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryPfPledgeResponse
     */
    public function queryPfPledgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPfPledgeResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.pledge.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资融资支用状态查询
     * Summary: 池融资融资支用状态查询.
     *
     * @param QueryPfFinancingRequest $request
     *
     * @return QueryPfFinancingResponse
     */
    public function queryPfFinancing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPfFinancingEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资融资支用状态查询
     * Summary: 池融资融资支用状态查询.
     *
     * @param QueryPfFinancingRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryPfFinancingResponse
     */
    public function queryPfFinancingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPfFinancingResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.financing.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资凭证核验结果查询
     * Summary: 池融资凭证核验结果查询.
     *
     * @param CheckPfVoucherRequest $request
     *
     * @return CheckPfVoucherResponse
     */
    public function checkPfVoucher($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkPfVoucherEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资凭证核验结果查询
     * Summary: 池融资凭证核验结果查询.
     *
     * @param CheckPfVoucherRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CheckPfVoucherResponse
     */
    public function checkPfVoucherEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckPfVoucherResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.voucher.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资提款确认书申请
     * Summary: 提款确认书申请.
     *
     * @param ApplyPfConfirmationRequest $request
     *
     * @return ApplyPfConfirmationResponse
     */
    public function applyPfConfirmation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyPfConfirmationEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资提款确认书申请
     * Summary: 提款确认书申请.
     *
     * @param ApplyPfConfirmationRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ApplyPfConfirmationResponse
     */
    public function applyPfConfirmationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyPfConfirmationResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.confirmation.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资融资资格申请
     * Summary: 池融资融资资格申请.
     *
     * @param ApplyPfFinancingqualificationRequest $request
     *
     * @return ApplyPfFinancingqualificationResponse
     */
    public function applyPfFinancingqualification($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyPfFinancingqualificationEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资融资资格申请
     * Summary: 池融资融资资格申请.
     *
     * @param ApplyPfFinancingqualificationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ApplyPfFinancingqualificationResponse
     */
    public function applyPfFinancingqualificationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyPfFinancingqualificationResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.financingqualification.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资融资资格申请结果查询
     * Summary: 池融资融资资格申请结果查询.
     *
     * @param QueryPfFinancingqualificationRequest $request
     *
     * @return QueryPfFinancingqualificationResponse
     */
    public function queryPfFinancingqualification($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPfFinancingqualificationEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资融资资格申请结果查询
     * Summary: 池融资融资资格申请结果查询.
     *
     * @param QueryPfFinancingqualificationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryPfFinancingqualificationResponse
     */
    public function queryPfFinancingqualificationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPfFinancingqualificationResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.financingqualification.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 池融资主站回调金融云接口
     * Summary: 池融资主站回调金融云接口.
     *
     * @param CallbackPfDefinpfRequest $request
     *
     * @return CallbackPfDefinpfResponse
     */
    public function callbackPfDefinpf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackPfDefinpfEx($request, $headers, $runtime);
    }

    /**
     * Description: 池融资主站回调金融云接口
     * Summary: 池融资主站回调金融云接口.
     *
     * @param CallbackPfDefinpfRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CallbackPfDefinpfResponse
     */
    public function callbackPfDefinpfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackPfDefinpfResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.definpf.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于查询可提款额度
     * Summary: 可提款额度查询.
     *
     * @param QueryPfWithdrawRequest $request
     *
     * @return QueryPfWithdrawResponse
     */
    public function queryPfWithdraw($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPfWithdrawEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于查询可提款额度
     * Summary: 可提款额度查询.
     *
     * @param QueryPfWithdrawRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryPfWithdrawResponse
     */
    public function queryPfWithdrawEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPfWithdrawResponse::fromMap($this->doRequest('1.0', 'digital.logistic.pf.withdraw.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建货代did
     * Summary: 创建货代did.
     *
     * @param CreateDidForwarderRequest $request
     *
     * @return CreateDidForwarderResponse
     */
    public function createDidForwarder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDidForwarderEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建货代did
     * Summary: 创建货代did.
     *
     * @param CreateDidForwarderRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateDidForwarderResponse
     */
    public function createDidForwarderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDidForwarderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.did.forwarder.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建saas平台did
     * Summary: 创建saas平台did.
     *
     * @param CreateDidSaasplatformRequest $request
     *
     * @return CreateDidSaasplatformResponse
     */
    public function createDidSaasplatform($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDidSaasplatformEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建saas平台did
     * Summary: 创建saas平台did.
     *
     * @param CreateDidSaasplatformRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateDidSaasplatformResponse
     */
    public function createDidSaasplatformEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDidSaasplatformResponse::fromMap($this->doRequest('1.0', 'digital.logistic.did.saasplatform.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建直客did
     * Summary: 创建直客did.
     *
     * @param CreateDidClientRequest $request
     *
     * @return CreateDidClientResponse
     */
    public function createDidClient($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDidClientEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建直客did
     * Summary: 创建直客did.
     *
     * @param CreateDidClientRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateDidClientResponse
     */
    public function createDidClientEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDidClientResponse::fromMap($this->doRequest('1.0', 'digital.logistic.did.client.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存订单
     * Summary: 保存订单.
     *
     * @param SaveBizOrderRequest $request
     *
     * @return SaveBizOrderResponse
     */
    public function saveBizOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存订单
     * Summary: 保存订单.
     *
     * @param SaveBizOrderRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return SaveBizOrderResponse
     */
    public function saveBizOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizOrderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.order.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存托单文件
     * Summary: 保存托单文件.
     *
     * @param SaveBizConsignorderRequest $request
     *
     * @return SaveBizConsignorderResponse
     */
    public function saveBizConsignorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizConsignorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存托单文件
     * Summary: 保存托单文件.
     *
     * @param SaveBizConsignorderRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SaveBizConsignorderResponse
     */
    public function saveBizConsignorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizConsignorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.consignorder.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存货物
     * Summary: 保存货物.
     *
     * @param SaveBizGoodsRequest $request
     *
     * @return SaveBizGoodsResponse
     */
    public function saveBizGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存货物
     * Summary: 保存货物.
     *
     * @param SaveBizGoodsRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return SaveBizGoodsResponse
     */
    public function saveBizGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizGoodsResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.goods.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存SO入货通知
     * Summary: 保存SO入货通知.
     *
     * @param SaveBizSonotifyRequest $request
     *
     * @return SaveBizSonotifyResponse
     */
    public function saveBizSonotify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizSonotifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存SO入货通知
     * Summary: 保存SO入货通知.
     *
     * @param SaveBizSonotifyRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SaveBizSonotifyResponse
     */
    public function saveBizSonotifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizSonotifyResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.sonotify.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存订舱单
     * Summary: 保存订舱单.
     *
     * @param SaveBizBookingorderRequest $request
     *
     * @return SaveBizBookingorderResponse
     */
    public function saveBizBookingorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizBookingorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存订舱单
     * Summary: 保存订舱单.
     *
     * @param SaveBizBookingorderRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SaveBizBookingorderResponse
     */
    public function saveBizBookingorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizBookingorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.bookingorder.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存集装箱
     * Summary: 保存集装箱.
     *
     * @param SaveBizContainerRequest $request
     *
     * @return SaveBizContainerResponse
     */
    public function saveBizContainer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizContainerEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存集装箱
     * Summary: 保存集装箱.
     *
     * @param SaveBizContainerRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SaveBizContainerResponse
     */
    public function saveBizContainerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizContainerResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.container.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存报关单
     * Summary: 保存报关单.
     *
     * @param SaveBizCustomsorderRequest $request
     *
     * @return SaveBizCustomsorderResponse
     */
    public function saveBizCustomsorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizCustomsorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存报关单
     * Summary: 保存报关单.
     *
     * @param SaveBizCustomsorderRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SaveBizCustomsorderResponse
     */
    public function saveBizCustomsorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizCustomsorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.customsorder.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存拖车单
     * Summary: 保存拖车单.
     *
     * @param SaveBizVehicleRequest $request
     *
     * @return SaveBizVehicleResponse
     */
    public function saveBizVehicle($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizVehicleEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存拖车单
     * Summary: 保存拖车单.
     *
     * @param SaveBizVehicleRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SaveBizVehicleResponse
     */
    public function saveBizVehicleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizVehicleResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.vehicle.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存master提单
     * Summary: 保存master提单.
     *
     * @param SaveBizMasterblRequest $request
     *
     * @return SaveBizMasterblResponse
     */
    public function saveBizMasterbl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizMasterblEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存master提单
     * Summary: 保存master提单.
     *
     * @param SaveBizMasterblRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SaveBizMasterblResponse
     */
    public function saveBizMasterblEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizMasterblResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.masterbl.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内审完成
     * Summary: 内审完成.
     *
     * @param FinishBizAuditRequest $request
     *
     * @return FinishBizAuditResponse
     */
    public function finishBizAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishBizAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 内审完成
     * Summary: 内审完成.
     *
     * @param FinishBizAuditRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return FinishBizAuditResponse
     */
    public function finishBizAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishBizAuditResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.audit.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存house提单
     * Summary: 保存house提单.
     *
     * @param SaveBizHouseblRequest $request
     *
     * @return SaveBizHouseblResponse
     */
    public function saveBizHousebl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizHouseblEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存house提单
     * Summary: 保存house提单.
     *
     * @param SaveBizHouseblRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SaveBizHouseblResponse
     */
    public function saveBizHouseblEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizHouseblResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.housebl.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建应付账单
     * Summary: 创建应付账单(已下).
     *
     * @param CreateBillPaybillorderRequest $request
     *
     * @return CreateBillPaybillorderResponse
     */
    public function createBillPaybillorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBillPaybillorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建应付账单
     * Summary: 创建应付账单(已下).
     *
     * @param CreateBillPaybillorderRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateBillPaybillorderResponse
     */
    public function createBillPaybillorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBillPaybillorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.paybillorder.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建应收账单
     * Summary: 创建应收账单(已下).
     *
     * @param CreateBillReceiptbillorderRequest $request
     *
     * @return CreateBillReceiptbillorderResponse
     */
    public function createBillReceiptbillorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBillReceiptbillorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建应收账单
     * Summary: 创建应收账单(已下).
     *
     * @param CreateBillReceiptbillorderRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateBillReceiptbillorderResponse
     */
    public function createBillReceiptbillorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBillReceiptbillorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.receiptbillorder.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存应付资费项
     * Summary: 保存应付资费项.
     *
     * @param SaveBillPaybilltariffRequest $request
     *
     * @return SaveBillPaybilltariffResponse
     */
    public function saveBillPaybilltariff($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBillPaybilltariffEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存应付资费项
     * Summary: 保存应付资费项.
     *
     * @param SaveBillPaybilltariffRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SaveBillPaybilltariffResponse
     */
    public function saveBillPaybilltariffEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBillPaybilltariffResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.paybilltariff.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存应收资费项
     * Summary: 保存应收资费项.
     *
     * @param SaveBillReceiptbilltariffRequest $request
     *
     * @return SaveBillReceiptbilltariffResponse
     */
    public function saveBillReceiptbilltariff($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBillReceiptbilltariffEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存应收资费项
     * Summary: 保存应收资费项.
     *
     * @param SaveBillReceiptbilltariffRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SaveBillReceiptbilltariffResponse
     */
    public function saveBillReceiptbilltariffEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBillReceiptbilltariffResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.receiptbilltariff.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核销应付资费项
     * Summary: 核销应付资费项.
     *
     * @param VerifyBillPaybillRequest $request
     *
     * @return VerifyBillPaybillResponse
     */
    public function verifyBillPaybill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyBillPaybillEx($request, $headers, $runtime);
    }

    /**
     * Description: 核销应付资费项
     * Summary: 核销应付资费项.
     *
     * @param VerifyBillPaybillRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return VerifyBillPaybillResponse
     */
    public function verifyBillPaybillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyBillPaybillResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.paybill.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核销应收资费项
     * Summary: 核销应收资费项.
     *
     * @param VerifyBillReceiptbillorderRequest $request
     *
     * @return VerifyBillReceiptbillorderResponse
     */
    public function verifyBillReceiptbillorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyBillReceiptbillorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 核销应收资费项
     * Summary: 核销应收资费项.
     *
     * @param VerifyBillReceiptbillorderRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return VerifyBillReceiptbillorderResponse
     */
    public function verifyBillReceiptbillorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyBillReceiptbillorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.receiptbillorder.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新应付账单
     * Summary: 更新应付账单.
     *
     * @param UpdateBillPaybillorderRequest $request
     *
     * @return UpdateBillPaybillorderResponse
     */
    public function updateBillPaybillorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBillPaybillorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新应付账单
     * Summary: 更新应付账单.
     *
     * @param UpdateBillPaybillorderRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateBillPaybillorderResponse
     */
    public function updateBillPaybillorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBillPaybillorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.paybillorder.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新应收账单
     * Summary: 更新应收账单.
     *
     * @param UpdateBillReceiptbillorderRequest $request
     *
     * @return UpdateBillReceiptbillorderResponse
     */
    public function updateBillReceiptbillorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBillReceiptbillorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新应收账单
     * Summary: 更新应收账单.
     *
     * @param UpdateBillReceiptbillorderRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateBillReceiptbillorderResponse
     */
    public function updateBillReceiptbillorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBillReceiptbillorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.receiptbillorder.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存应付发票
     * Summary: 保存应付发票.
     *
     * @param SaveBillPayinvoiceRequest $request
     *
     * @return SaveBillPayinvoiceResponse
     */
    public function saveBillPayinvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBillPayinvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存应付发票
     * Summary: 保存应付发票.
     *
     * @param SaveBillPayinvoiceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SaveBillPayinvoiceResponse
     */
    public function saveBillPayinvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBillPayinvoiceResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.payinvoice.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存应收发票
     * Summary: 保存应收发票.
     *
     * @param SaveBillReceiptinvoiceRequest $request
     *
     * @return SaveBillReceiptinvoiceResponse
     */
    public function saveBillReceiptinvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBillReceiptinvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存应收发票
     * Summary: 保存应收发票.
     *
     * @param SaveBillReceiptinvoiceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SaveBillReceiptinvoiceResponse
     */
    public function saveBillReceiptinvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBillReceiptinvoiceResponse::fromMap($this->doRequest('1.0', 'digital.logistic.bill.receiptinvoice.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传历史数据
     * Summary: 上传历史数据.
     *
     * @param UploadBizFinancingRequest $request
     *
     * @return UploadBizFinancingResponse
     */
    public function uploadBizFinancing($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadBizFinancingEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传历史数据
     * Summary: 上传历史数据.
     *
     * @param UploadBizFinancingRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UploadBizFinancingResponse
     */
    public function uploadBizFinancingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadBizFinancingResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.financing.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传订单
     * Summary: 上传订单.
     *
     * @param UploadBizOrderRequest $request
     *
     * @return UploadBizOrderResponse
     */
    public function uploadBizOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadBizOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传订单
     * Summary: 上传订单.
     *
     * @param UploadBizOrderRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UploadBizOrderResponse
     */
    public function uploadBizOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadBizOrderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.order.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建船公司did账户
     * Summary: 创建船公司did账户.
     *
     * @param CreateDidCarrierRequest $request
     *
     * @return CreateDidCarrierResponse
     */
    public function createDidCarrier($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDidCarrierEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建船公司did账户
     * Summary: 创建船公司did账户.
     *
     * @param CreateDidCarrierRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateDidCarrierResponse
     */
    public function createDidCarrierEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDidCarrierResponse::fromMap($this->doRequest('1.0', 'digital.logistic.did.carrier.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  货代授权
     * Summary:  货代授权.
     *
     * @param AuthSysForwarderRequest $request
     *
     * @return AuthSysForwarderResponse
     */
    public function authSysForwarder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authSysForwarderEx($request, $headers, $runtime);
    }

    /**
     * Description:  货代授权
     * Summary:  货代授权.
     *
     * @param AuthSysForwarderRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AuthSysForwarderResponse
     */
    public function authSysForwarderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthSysForwarderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.sys.forwarder.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: master提单信息查询
     * Summary: master提单信息查询.
     *
     * @param QueryBizMasterblRequest $request
     *
     * @return QueryBizMasterblResponse
     */
    public function queryBizMasterbl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBizMasterblEx($request, $headers, $runtime);
    }

    /**
     * Description: master提单信息查询
     * Summary: master提单信息查询.
     *
     * @param QueryBizMasterblRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryBizMasterblResponse
     */
    public function queryBizMasterblEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBizMasterblResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.masterbl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应付发票文件上传接口
     * Summary: 应付发票文件上传接口.
     *
     * @param SaveBizPayinvoicefileRequest $request
     *
     * @return SaveBizPayinvoicefileResponse
     */
    public function saveBizPayinvoicefile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBizPayinvoicefileEx($request, $headers, $runtime);
    }

    /**
     * Description: 应付发票文件上传接口
     * Summary: 应付发票文件上传接口.
     *
     * @param SaveBizPayinvoicefileRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SaveBizPayinvoicefileResponse
     */
    public function saveBizPayinvoicefileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBizPayinvoicefileResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biz.payinvoicefile.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 托运订单保存接口
     * Summary: 托运订单保存接口.
     *
     * @param SaveBiznewOrderRequest $request
     *
     * @return SaveBiznewOrderResponse
     */
    public function saveBiznewOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBiznewOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 托运订单保存接口
     * Summary: 托运订单保存接口.
     *
     * @param SaveBiznewOrderRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SaveBiznewOrderResponse
     */
    public function saveBiznewOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBiznewOrderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biznew.order.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订舱单创建接口
     * Summary: 订舱单创建接口.
     *
     * @param SaveBiznewBookingRequest $request
     *
     * @return SaveBiznewBookingResponse
     */
    public function saveBiznewBooking($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBiznewBookingEx($request, $headers, $runtime);
    }

    /**
     * Description: 订舱单创建接口
     * Summary: 订舱单创建接口.
     *
     * @param SaveBiznewBookingRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SaveBiznewBookingResponse
     */
    public function saveBiznewBookingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBiznewBookingResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biznew.booking.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 拖车单保存接口
     * Summary: 拖车单保存接口.
     *
     * @param SaveBiznewVehicleRequest $request
     *
     * @return SaveBiznewVehicleResponse
     */
    public function saveBiznewVehicle($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBiznewVehicleEx($request, $headers, $runtime);
    }

    /**
     * Description: 拖车单保存接口
     * Summary: 拖车单保存接口.
     *
     * @param SaveBiznewVehicleRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SaveBiznewVehicleResponse
     */
    public function saveBiznewVehicleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBiznewVehicleResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biznew.vehicle.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 报关单保存接口
     * Summary: 报关单保存接口.
     *
     * @param SaveBiznewCustomsRequest $request
     *
     * @return SaveBiznewCustomsResponse
     */
    public function saveBiznewCustoms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBiznewCustomsEx($request, $headers, $runtime);
    }

    /**
     * Description: 报关单保存接口
     * Summary: 报关单保存接口.
     *
     * @param SaveBiznewCustomsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SaveBiznewCustomsResponse
     */
    public function saveBiznewCustomsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBiznewCustomsResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biznew.customs.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 航运提单保存接口
     * Summary: 航运提单保存接口.
     *
     * @param SaveBiznewMasterRequest $request
     *
     * @return SaveBiznewMasterResponse
     */
    public function saveBiznewMaster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBiznewMasterEx($request, $headers, $runtime);
    }

    /**
     * Description: 航运提单保存接口
     * Summary: 航运提单保存接口.
     *
     * @param SaveBiznewMasterRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SaveBiznewMasterResponse
     */
    public function saveBiznewMasterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBiznewMasterResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biznew.master.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应付账单保存接口
     * Summary: 应付账单保存接口.
     *
     * @param SaveBiznewPaybillorderRequest $request
     *
     * @return SaveBiznewPaybillorderResponse
     */
    public function saveBiznewPaybillorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBiznewPaybillorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 应付账单保存接口
     * Summary: 应付账单保存接口.
     *
     * @param SaveBiznewPaybillorderRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SaveBiznewPaybillorderResponse
     */
    public function saveBiznewPaybillorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBiznewPaybillorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biznew.paybillorder.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应收账单保存接口
     * Summary: 应收账单保存接口.
     *
     * @param SaveBiznewReceiptbillorderRequest $request
     *
     * @return SaveBiznewReceiptbillorderResponse
     */
    public function saveBiznewReceiptbillorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBiznewReceiptbillorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 应收账单保存接口
     * Summary: 应收账单保存接口.
     *
     * @param SaveBiznewReceiptbillorderRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SaveBiznewReceiptbillorderResponse
     */
    public function saveBiznewReceiptbillorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBiznewReceiptbillorderResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biznew.receiptbillorder.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 航运发票保存接口
     * Summary: 航运发票保存接口.
     *
     * @param SaveBiznewInvoiceRequest $request
     *
     * @return SaveBiznewInvoiceResponse
     */
    public function saveBiznewInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveBiznewInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 航运发票保存接口
     * Summary: 航运发票保存接口.
     *
     * @param SaveBiznewInvoiceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SaveBiznewInvoiceResponse
     */
    public function saveBiznewInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveBiznewInvoiceResponse::fromMap($this->doRequest('1.0', 'digital.logistic.biznew.invoice.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传电子提单
     * Summary: 上传电子提单.
     *
     * @param UploadShippingEblRequest $request
     *
     * @return UploadShippingEblResponse
     */
    public function uploadShippingEbl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadShippingEblEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传电子提单
     * Summary: 上传电子提单.
     *
     * @param UploadShippingEblRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UploadShippingEblResponse
     */
    public function uploadShippingEblEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadShippingEblResponse::fromMap($this->doRequest('1.0', 'digital.logistic.shipping.ebl.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子提单批次上传，一个I批次下传递多个提单
     * Summary: 电子提单批次上传.
     *
     * @param UploadShippingEblbatchRequest $request
     *
     * @return UploadShippingEblbatchResponse
     */
    public function uploadShippingEblbatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadShippingEblbatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子提单批次上传，一个I批次下传递多个提单
     * Summary: 电子提单批次上传.
     *
     * @param UploadShippingEblbatchRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UploadShippingEblbatchResponse
     */
    public function uploadShippingEblbatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadShippingEblbatchResponse::fromMap($this->doRequest('1.0', 'digital.logistic.shipping.eblbatch.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 感知收货人提单状态的变更
     * Summary: 电子提单批次状态变更.
     *
     * @param UpdateShippingEblbatchstatusRequest $request
     *
     * @return UpdateShippingEblbatchstatusResponse
     */
    public function updateShippingEblbatchstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateShippingEblbatchstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 感知收货人提单状态的变更
     * Summary: 电子提单批次状态变更.
     *
     * @param UpdateShippingEblbatchstatusRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateShippingEblbatchstatusResponse
     */
    public function updateShippingEblbatchstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateShippingEblbatchstatusResponse::fromMap($this->doRequest('1.0', 'digital.logistic.shipping.eblbatchstatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
