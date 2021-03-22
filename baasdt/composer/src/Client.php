<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BAASDT\Models\AddConsumecardCommissionpartyRequest;
use AntChain\BAASDT\Models\AddConsumecardCommissionpartyResponse;
use AntChain\BAASDT\Models\AddConsumecardCommissionperiodRequest;
use AntChain\BAASDT\Models\AddConsumecardCommissionperiodResponse;
use AntChain\BAASDT\Models\AddEquityCountRequest;
use AntChain\BAASDT\Models\AddEquityCountResponse;
use AntChain\BAASDT\Models\AddIpChannelRequest;
use AntChain\BAASDT\Models\AddIpChannelResponse;
use AntChain\BAASDT\Models\ApplyConsumecardBillrefundRequest;
use AntChain\BAASDT\Models\ApplyConsumecardBillrefundResponse;
use AntChain\BAASDT\Models\ApplyConsumecardPurchaserefundRequest;
use AntChain\BAASDT\Models\ApplyConsumecardPurchaserefundResponse;
use AntChain\BAASDT\Models\ApplyConsumecardPurchasereplaceRequest;
use AntChain\BAASDT\Models\ApplyConsumecardPurchasereplaceResponse;
use AntChain\BAASDT\Models\ApplyExchangeAftersaleRequest;
use AntChain\BAASDT\Models\ApplyExchangeAftersaleResponse;
use AntChain\BAASDT\Models\ApplyIpAccountRequest;
use AntChain\BAASDT\Models\ApplyIpAccountResponse;
use AntChain\BAASDT\Models\AuthEquityMerchantuserpriceRequest;
use AntChain\BAASDT\Models\AuthEquityMerchantuserpriceResponse;
use AntChain\BAASDT\Models\BatchcreateCouponRequest;
use AntChain\BAASDT\Models\BatchcreateCouponResponse;
use AntChain\BAASDT\Models\BatchqueryIpAccountRequest;
use AntChain\BAASDT\Models\BatchqueryIpAccountResponse;
use AntChain\BAASDT\Models\BatchqueryIpApprovalandchannelRequest;
use AntChain\BAASDT\Models\BatchqueryIpApprovalandchannelResponse;
use AntChain\BAASDT\Models\BatchqueryIpApprovalRequest;
use AntChain\BAASDT\Models\BatchqueryIpApprovalResponse;
use AntChain\BAASDT\Models\BatchqueryIpGoodsRequest;
use AntChain\BAASDT\Models\BatchqueryIpGoodsResponse;
use AntChain\BAASDT\Models\BatchqueryIpSellerRequest;
use AntChain\BAASDT\Models\BatchqueryIpSellerResponse;
use AntChain\BAASDT\Models\CancelConsumecardBillRequest;
use AntChain\BAASDT\Models\CancelConsumecardBillResponse;
use AntChain\BAASDT\Models\CancelConsumecardBuyerpurchaseRequest;
use AntChain\BAASDT\Models\CancelConsumecardBuyerpurchaseResponse;
use AntChain\BAASDT\Models\CancelConsumecardSellerpurchaseRequest;
use AntChain\BAASDT\Models\CancelConsumecardSellerpurchaseResponse;
use AntChain\BAASDT\Models\CancelIpAuthtradebillRequest;
use AntChain\BAASDT\Models\CancelIpAuthtradebillResponse;
use AntChain\BAASDT\Models\CancelIpPackagetradeRequest;
use AntChain\BAASDT\Models\CancelIpPackagetradeResponse;
use AntChain\BAASDT\Models\ChargeConsumecardWalletRequest;
use AntChain\BAASDT\Models\ChargeConsumecardWalletResponse;
use AntChain\BAASDT\Models\CheckIpAccountRequest;
use AntChain\BAASDT\Models\CheckIpAccountResponse;
use AntChain\BAASDT\Models\ConfirmConsumecardBillcreateRequest;
use AntChain\BAASDT\Models\ConfirmConsumecardBillcreateResponse;
use AntChain\BAASDT\Models\ConfirmConsumecardBillrefundRequest;
use AntChain\BAASDT\Models\ConfirmConsumecardBillrefundResponse;
use AntChain\BAASDT\Models\ConfirmConsumecardPurchaseRequest;
use AntChain\BAASDT\Models\ConfirmConsumecardPurchaseResponse;
use AntChain\BAASDT\Models\ConfirmExchangeAftersaleRequest;
use AntChain\BAASDT\Models\ConfirmExchangeAftersaleResponse;
use AntChain\BAASDT\Models\ConfirmExchangeRequest;
use AntChain\BAASDT\Models\ConfirmExchangeResponse;
use AntChain\BAASDT\Models\ConfirmIpAccountRequest;
use AntChain\BAASDT\Models\ConfirmIpAccountResponse;
use AntChain\BAASDT\Models\ConfirmIpGoodsRequest;
use AntChain\BAASDT\Models\ConfirmIpGoodsResponse;
use AntChain\BAASDT\Models\CreateConfigChainaccountRequest;
use AntChain\BAASDT\Models\CreateConfigChainaccountResponse;
use AntChain\BAASDT\Models\CreateConsumecardAccountRequest;
use AntChain\BAASDT\Models\CreateConsumecardAccountResponse;
use AntChain\BAASDT\Models\CreateConsumecardBillingcontractRequest;
use AntChain\BAASDT\Models\CreateConsumecardBillingcontractResponse;
use AntChain\BAASDT\Models\CreateConsumecardBillRequest;
use AntChain\BAASDT\Models\CreateConsumecardBillResponse;
use AntChain\BAASDT\Models\CreateConsumecardGoodscategoryRequest;
use AntChain\BAASDT\Models\CreateConsumecardGoodscategoryResponse;
use AntChain\BAASDT\Models\CreateConsumecardGoodsRequest;
use AntChain\BAASDT\Models\CreateConsumecardGoodsResponse;
use AntChain\BAASDT\Models\CreateConsumecardReceiptcontractRequest;
use AntChain\BAASDT\Models\CreateConsumecardReceiptcontractResponse;
use AntChain\BAASDT\Models\CreateCouponCollectionRequest;
use AntChain\BAASDT\Models\CreateCouponCollectionResponse;
use AntChain\BAASDT\Models\CreateCouponListRequest;
use AntChain\BAASDT\Models\CreateCouponListResponse;
use AntChain\BAASDT\Models\CreateCouponRequest;
use AntChain\BAASDT\Models\CreateCouponResponse;
use AntChain\BAASDT\Models\CreateEquityRequest;
use AntChain\BAASDT\Models\CreateEquityResponse;
use AntChain\BAASDT\Models\CreateIpAccountRequest;
use AntChain\BAASDT\Models\CreateIpAccountResponse;
use AntChain\BAASDT\Models\CreateIpGoodsRequest;
use AntChain\BAASDT\Models\CreateIpGoodsResponse;
use AntChain\BAASDT\Models\CreateMerchantProvisionRequest;
use AntChain\BAASDT\Models\CreateMerchantProvisionResponse;
use AntChain\BAASDT\Models\CreateMerchantRequest;
use AntChain\BAASDT\Models\CreateMerchantResponse;
use AntChain\BAASDT\Models\CreateMerchantUserRequest;
use AntChain\BAASDT\Models\CreateMerchantUserResponse;
use AntChain\BAASDT\Models\ExecAssetAdjustRequest;
use AntChain\BAASDT\Models\ExecAssetAdjustResponse;
use AntChain\BAASDT\Models\ExecAssetCreateRequest;
use AntChain\BAASDT\Models\ExecAssetCreateResponse;
use AntChain\BAASDT\Models\ExecAssetExpireRequest;
use AntChain\BAASDT\Models\ExecAssetExpireResponse;
use AntChain\BAASDT\Models\ExecAssetGenerateRequest;
use AntChain\BAASDT\Models\ExecAssetGenerateResponse;
use AntChain\BAASDT\Models\ExecAssetGrantrefundRequest;
use AntChain\BAASDT\Models\ExecAssetGrantrefundResponse;
use AntChain\BAASDT\Models\ExecAssetGrantRequest;
use AntChain\BAASDT\Models\ExecAssetGrantResponse;
use AntChain\BAASDT\Models\ExecAssetIssueRequest;
use AntChain\BAASDT\Models\ExecAssetIssueResponse;
use AntChain\BAASDT\Models\ExecAssetRedeemRequest;
use AntChain\BAASDT\Models\ExecAssetRedeemResponse;
use AntChain\BAASDT\Models\ExecCardBindnameRequest;
use AntChain\BAASDT\Models\ExecCardBindnameResponse;
use AntChain\BAASDT\Models\ExecCardChargeRequest;
use AntChain\BAASDT\Models\ExecCardChargeresetRequest;
use AntChain\BAASDT\Models\ExecCardChargeresetResponse;
use AntChain\BAASDT\Models\ExecCardChargeResponse;
use AntChain\BAASDT\Models\ExecCardCreateRequest;
use AntChain\BAASDT\Models\ExecCardCreateResponse;
use AntChain\BAASDT\Models\ExecCardExpiredRequest;
use AntChain\BAASDT\Models\ExecCardExpiredResponse;
use AntChain\BAASDT\Models\ExecCardForbiddenRequest;
use AntChain\BAASDT\Models\ExecCardForbiddenResponse;
use AntChain\BAASDT\Models\ExecCardQueryRequest;
use AntChain\BAASDT\Models\ExecCardQueryResponse;
use AntChain\BAASDT\Models\ExecCardWriteoffRequest;
use AntChain\BAASDT\Models\ExecCardWriteoffResponse;
use AntChain\BAASDT\Models\ExecConsumecardBillpayRequest;
use AntChain\BAASDT\Models\ExecConsumecardBillpayResponse;
use AntChain\BAASDT\Models\ExecConsumecardOrdertrywithdrawRequest;
use AntChain\BAASDT\Models\ExecConsumecardOrdertrywithdrawResponse;
use AntChain\BAASDT\Models\ExecConsumecardOrderwithdrawbyblocknumRequest;
use AntChain\BAASDT\Models\ExecConsumecardOrderwithdrawbyblocknumResponse;
use AntChain\BAASDT\Models\ExecConsumecardOrderwithdrawbyidsRequest;
use AntChain\BAASDT\Models\ExecConsumecardOrderwithdrawbyidsResponse;
use AntChain\BAASDT\Models\ExecConsumecardOrderwriteoffRequest;
use AntChain\BAASDT\Models\ExecConsumecardOrderwriteoffResponse;
use AntChain\BAASDT\Models\ExecConsumecardPurchasereceiveRequest;
use AntChain\BAASDT\Models\ExecConsumecardPurchasereceiveResponse;
use AntChain\BAASDT\Models\ExecConsumecardWalletchargetotokenRequest;
use AntChain\BAASDT\Models\ExecConsumecardWalletchargetotokenResponse;
use AntChain\BAASDT\Models\ExecConsumecardWalletredeemtokenRequest;
use AntChain\BAASDT\Models\ExecConsumecardWalletredeemtokenResponse;
use AntChain\BAASDT\Models\ExecCouponActivateRequest;
use AntChain\BAASDT\Models\ExecCouponActivateResponse;
use AntChain\BAASDT\Models\ExecCouponBindRequest;
use AntChain\BAASDT\Models\ExecCouponBindResponse;
use AntChain\BAASDT\Models\ExecCouponEnableRequest;
use AntChain\BAASDT\Models\ExecCouponEnableResponse;
use AntChain\BAASDT\Models\ExecCouponExpireRequest;
use AntChain\BAASDT\Models\ExecCouponExpireResponse;
use AntChain\BAASDT\Models\ExecCouponForbiddenRequest;
use AntChain\BAASDT\Models\ExecCouponForbiddenResponse;
use AntChain\BAASDT\Models\ExecCouponSignRequest;
use AntChain\BAASDT\Models\ExecCouponSignResponse;
use AntChain\BAASDT\Models\ExecCouponTimeoutRequest;
use AntChain\BAASDT\Models\ExecCouponTimeoutResponse;
use AntChain\BAASDT\Models\ExecCouponTransferRequest;
use AntChain\BAASDT\Models\ExecCouponTransferResponse;
use AntChain\BAASDT\Models\ExecCouponWriteoffRequest;
use AntChain\BAASDT\Models\ExecCouponWriteoffResponse;
use AntChain\BAASDT\Models\ExecDataDepositRequest;
use AntChain\BAASDT\Models\ExecDataDepositResponse;
use AntChain\BAASDT\Models\ExecEquityInstructionwriteoffRequest;
use AntChain\BAASDT\Models\ExecEquityInstructionwriteoffResponse;
use AntChain\BAASDT\Models\ExecExchangeAgreeaftersaleRequest;
use AntChain\BAASDT\Models\ExecExchangeAgreeaftersaleResponse;
use AntChain\BAASDT\Models\ExecExchangeBymerchantRequest;
use AntChain\BAASDT\Models\ExecExchangeBymerchantResponse;
use AntChain\BAASDT\Models\ExecExchangeByuserRequest;
use AntChain\BAASDT\Models\ExecExchangeByuserResponse;
use AntChain\BAASDT\Models\ExecExchangeOutofstoreRequest;
use AntChain\BAASDT\Models\ExecExchangeOutofstoreResponse;
use AntChain\BAASDT\Models\ExecExchangeReceivebymerchantRequest;
use AntChain\BAASDT\Models\ExecExchangeReceivebymerchantResponse;
use AntChain\BAASDT\Models\ExecExchangeReceivebyuserRequest;
use AntChain\BAASDT\Models\ExecExchangeReceivebyuserResponse;
use AntChain\BAASDT\Models\ExecMypointsOrderskuRequest;
use AntChain\BAASDT\Models\ExecMypointsOrderskuResponse;
use AntChain\BAASDT\Models\ExecMypointsPreorderskuRequest;
use AntChain\BAASDT\Models\ExecMypointsPreorderskuResponse;
use AntChain\BAASDT\Models\ExecPkiDecryptRequest;
use AntChain\BAASDT\Models\ExecPkiDecryptResponse;
use AntChain\BAASDT\Models\ExecPkiEncryptRequest;
use AntChain\BAASDT\Models\ExecPkiEncryptResponse;
use AntChain\BAASDT\Models\FreezeConsumecardAccountRequest;
use AntChain\BAASDT\Models\FreezeConsumecardAccountResponse;
use AntChain\BAASDT\Models\FreezeEquityRequest;
use AntChain\BAASDT\Models\FreezeEquityResponse;
use AntChain\BAASDT\Models\FreezeIpAccountRequest;
use AntChain\BAASDT\Models\FreezeIpAccountResponse;
use AntChain\BAASDT\Models\GetConsumecardOrderwithdrawresultRequest;
use AntChain\BAASDT\Models\GetConsumecardOrderwithdrawresultResponse;
use AntChain\BAASDT\Models\GetPkiPublickeyRequest;
use AntChain\BAASDT\Models\GetPkiPublickeyResponse;
use AntChain\BAASDT\Models\OfflineConsumecardAccountRequest;
use AntChain\BAASDT\Models\OfflineConsumecardAccountResponse;
use AntChain\BAASDT\Models\OfflineEquityRequest;
use AntChain\BAASDT\Models\OfflineEquityResponse;
use AntChain\BAASDT\Models\OfflineIpRequest;
use AntChain\BAASDT\Models\OfflineIpResponse;
use AntChain\BAASDT\Models\OnlineIpRequest;
use AntChain\BAASDT\Models\OnlineIpResponse;
use AntChain\BAASDT\Models\OpenConsumecardGoodstocustomRequest;
use AntChain\BAASDT\Models\OpenConsumecardGoodstocustomResponse;
use AntChain\BAASDT\Models\OpenConsumecardWalletRequest;
use AntChain\BAASDT\Models\OpenConsumecardWalletResponse;
use AntChain\BAASDT\Models\OpenEquityMerchantRequest;
use AntChain\BAASDT\Models\OpenEquityMerchantResponse;
use AntChain\BAASDT\Models\PullIpAccountRequest;
use AntChain\BAASDT\Models\PullIpAccountResponse;
use AntChain\BAASDT\Models\QueryAssetInstructionRequest;
use AntChain\BAASDT\Models\QueryAssetInstructionResponse;
use AntChain\BAASDT\Models\QueryAssetRequest;
use AntChain\BAASDT\Models\QueryAssetResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisBlockRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisBlockResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisDelegaterelationRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisDelegaterelationResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisEquityauthlistRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisEquityauthlistResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisLastblocknumberRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisLastblocknumberResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisNextblockRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisNextblockResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisOpenedequitiesRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisOpenedequitiesResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisTransactionRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisTransactionResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisUnwriteoffvalueRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisUnwriteoffvalueResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisUserpriceupdatedequitiesRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisUserpriceupdatedequitiesResponse;
use AntChain\BAASDT\Models\QueryBlockanalysisWhitelistRequest;
use AntChain\BAASDT\Models\QueryBlockanalysisWhitelistResponse;
use AntChain\BAASDT\Models\QueryBlockLastblocknumberRequest;
use AntChain\BAASDT\Models\QueryBlockLastblocknumberResponse;
use AntChain\BAASDT\Models\QueryBlockRequest;
use AntChain\BAASDT\Models\QueryBlockResponse;
use AntChain\BAASDT\Models\QueryCommissionMerchantRequest;
use AntChain\BAASDT\Models\QueryCommissionMerchantResponse;
use AntChain\BAASDT\Models\QueryCommissionRequest;
use AntChain\BAASDT\Models\QueryCommissionResponse;
use AntChain\BAASDT\Models\QueryConfigDelegaterelationRequest;
use AntChain\BAASDT\Models\QueryConfigDelegaterelationResponse;
use AntChain\BAASDT\Models\QueryConfigWhitelistRequest;
use AntChain\BAASDT\Models\QueryConfigWhitelistResponse;
use AntChain\BAASDT\Models\QueryConsumecardAccountRequest;
use AntChain\BAASDT\Models\QueryConsumecardAccountResponse;
use AntChain\BAASDT\Models\QueryConsumecardBillingcontractRequest;
use AntChain\BAASDT\Models\QueryConsumecardBillingcontractResponse;
use AntChain\BAASDT\Models\QueryConsumecardBillRequest;
use AntChain\BAASDT\Models\QueryConsumecardBillResponse;
use AntChain\BAASDT\Models\QueryConsumecardBlockRequest;
use AntChain\BAASDT\Models\QueryConsumecardBlockResponse;
use AntChain\BAASDT\Models\QueryConsumecardCommissionRequest;
use AntChain\BAASDT\Models\QueryConsumecardCommissionResponse;
use AntChain\BAASDT\Models\QueryConsumecardCounterRequest;
use AntChain\BAASDT\Models\QueryConsumecardCounterResponse;
use AntChain\BAASDT\Models\QueryConsumecardGoodscreateresultRequest;
use AntChain\BAASDT\Models\QueryConsumecardGoodscreateresultResponse;
use AntChain\BAASDT\Models\QueryConsumecardGoodsimageRequest;
use AntChain\BAASDT\Models\QueryConsumecardGoodsimageResponse;
use AntChain\BAASDT\Models\QueryConsumecardGoodsRequest;
use AntChain\BAASDT\Models\QueryConsumecardGoodsResponse;
use AntChain\BAASDT\Models\QueryConsumecardGoodsupdateresultRequest;
use AntChain\BAASDT\Models\QueryConsumecardGoodsupdateresultResponse;
use AntChain\BAASDT\Models\QueryConsumecardLastblocknumberRequest;
use AntChain\BAASDT\Models\QueryConsumecardLastblocknumberResponse;
use AntChain\BAASDT\Models\QueryConsumecardProductcodeRequest;
use AntChain\BAASDT\Models\QueryConsumecardProductcodeResponse;
use AntChain\BAASDT\Models\QueryConsumecardPurchaseRequest;
use AntChain\BAASDT\Models\QueryConsumecardPurchaseResponse;
use AntChain\BAASDT\Models\QueryConsumecardReceiptcontractRequest;
use AntChain\BAASDT\Models\QueryConsumecardReceiptcontractResponse;
use AntChain\BAASDT\Models\QueryConsumecardWalletredeemableRequest;
use AntChain\BAASDT\Models\QueryConsumecardWalletredeemableResponse;
use AntChain\BAASDT\Models\QueryConsumecardWalletRequest;
use AntChain\BAASDT\Models\QueryConsumecardWalletResponse;
use AntChain\BAASDT\Models\QueryCouponCollectionRequest;
use AntChain\BAASDT\Models\QueryCouponCollectionResponse;
use AntChain\BAASDT\Models\QueryCouponRequest;
use AntChain\BAASDT\Models\QueryCouponResponse;
use AntChain\BAASDT\Models\QueryEquityCreateresultRequest;
use AntChain\BAASDT\Models\QueryEquityCreateresultResponse;
use AntChain\BAASDT\Models\QueryEquityInstructionRequest;
use AntChain\BAASDT\Models\QueryEquityInstructionResponse;
use AntChain\BAASDT\Models\QueryEquityRequest;
use AntChain\BAASDT\Models\QueryEquityResponse;
use AntChain\BAASDT\Models\QueryExchangeInstructionRequest;
use AntChain\BAASDT\Models\QueryExchangeInstructionResponse;
use AntChain\BAASDT\Models\QueryImageRequest;
use AntChain\BAASDT\Models\QueryImageResponse;
use AntChain\BAASDT\Models\QueryIpAccountRequest;
use AntChain\BAASDT\Models\QueryIpAccountResponse;
use AntChain\BAASDT\Models\QueryIpBillstatusRequest;
use AntChain\BAASDT\Models\QueryIpBillstatusResponse;
use AntChain\BAASDT\Models\QueryIpDetailRequest;
use AntChain\BAASDT\Models\QueryIpDetailResponse;
use AntChain\BAASDT\Models\QueryIpGoodsdetailwithchannelRequest;
use AntChain\BAASDT\Models\QueryIpGoodsdetailwithchannelResponse;
use AntChain\BAASDT\Models\QueryIpMccRequest;
use AntChain\BAASDT\Models\QueryIpMccResponse;
use AntChain\BAASDT\Models\QueryIpOrderinfoRequest;
use AntChain\BAASDT\Models\QueryIpOrderinfoResponse;
use AntChain\BAASDT\Models\QueryIpOrderlistRequest;
use AntChain\BAASDT\Models\QueryIpOrderlistResponse;
use AntChain\BAASDT\Models\QueryIpTypeRequest;
use AntChain\BAASDT\Models\QueryIpTypeResponse;
use AntChain\BAASDT\Models\QueryMerchantExchangeableequitydetailRequest;
use AntChain\BAASDT\Models\QueryMerchantExchangeableequitydetailResponse;
use AntChain\BAASDT\Models\QueryMerchantExchangeableequitylistRequest;
use AntChain\BAASDT\Models\QueryMerchantExchangeableequitylistResponse;
use AntChain\BAASDT\Models\QueryMerchantProvisionsRequest;
use AntChain\BAASDT\Models\QueryMerchantProvisionsResponse;
use AntChain\BAASDT\Models\QueryMerchantRequest;
use AntChain\BAASDT\Models\QueryMerchantResponse;
use AntChain\BAASDT\Models\QueryMerchantUserRequest;
use AntChain\BAASDT\Models\QueryMerchantUserResponse;
use AntChain\BAASDT\Models\QueryMypointsMerchantbalanceRequest;
use AntChain\BAASDT\Models\QueryMypointsMerchantbalanceResponse;
use AntChain\BAASDT\Models\QueryMypointsOrderinstructionRequest;
use AntChain\BAASDT\Models\QueryMypointsOrderinstructionResponse;
use AntChain\BAASDT\Models\QueryMypointsPreorderinstructionRequest;
use AntChain\BAASDT\Models\QueryMypointsPreorderinstructionResponse;
use AntChain\BAASDT\Models\QueryMypointsSkufeeRequest;
use AntChain\BAASDT\Models\QueryMypointsSkufeeResponse;
use AntChain\BAASDT\Models\QueryMypointsSkuRequest;
use AntChain\BAASDT\Models\QueryMypointsSkuResponse;
use AntChain\BAASDT\Models\ReclaimConsumecardWalletRequest;
use AntChain\BAASDT\Models\ReclaimConsumecardWalletResponse;
use AntChain\BAASDT\Models\RefuseConsumecardPurchaseRequest;
use AntChain\BAASDT\Models\RefuseConsumecardPurchaseResponse;
use AntChain\BAASDT\Models\RefuseExchangeAftersaleRequest;
use AntChain\BAASDT\Models\RefuseExchangeAftersaleResponse;
use AntChain\BAASDT\Models\RefuseIpAccountRequest;
use AntChain\BAASDT\Models\RefuseIpAccountResponse;
use AntChain\BAASDT\Models\RemoveConsumecardBillingcontractRequest;
use AntChain\BAASDT\Models\RemoveConsumecardBillingcontractResponse;
use AntChain\BAASDT\Models\RemoveConsumecardCommissionpartyRequest;
use AntChain\BAASDT\Models\RemoveConsumecardCommissionpartyResponse;
use AntChain\BAASDT\Models\RemoveConsumecardCommissionperiodRequest;
use AntChain\BAASDT\Models\RemoveConsumecardCommissionperiodResponse;
use AntChain\BAASDT\Models\RemoveConsumecardCommissionRequest;
use AntChain\BAASDT\Models\RemoveConsumecardCommissionResponse;
use AntChain\BAASDT\Models\RemoveConsumecardProductcodeRequest;
use AntChain\BAASDT\Models\RemoveConsumecardProductcodeResponse;
use AntChain\BAASDT\Models\RemoveConsumecardReceiptcontractRequest;
use AntChain\BAASDT\Models\RemoveConsumecardReceiptcontractResponse;
use AntChain\BAASDT\Models\ReplaceConsumecardPurchaseRequest;
use AntChain\BAASDT\Models\ReplaceConsumecardPurchaseResponse;
use AntChain\BAASDT\Models\SendConsumecardPurchaseRequest;
use AntChain\BAASDT\Models\SendConsumecardPurchaseResponse;
use AntChain\BAASDT\Models\SendExchangeAftersaleRequest;
use AntChain\BAASDT\Models\SendExchangeAftersaleResponse;
use AntChain\BAASDT\Models\SendExchangeRequest;
use AntChain\BAASDT\Models\SendExchangeResponse;
use AntChain\BAASDT\Models\SetCommissionMerchantRequest;
use AntChain\BAASDT\Models\SetCommissionMerchantResponse;
use AntChain\BAASDT\Models\SetCommissionRequest;
use AntChain\BAASDT\Models\SetCommissionResponse;
use AntChain\BAASDT\Models\SetConsumecardCommissionmanagerRequest;
use AntChain\BAASDT\Models\SetConsumecardCommissionmanagerResponse;
use AntChain\BAASDT\Models\SetConsumecardCommissionRequest;
use AntChain\BAASDT\Models\SetConsumecardCommissionResponse;
use AntChain\BAASDT\Models\SetConsumecardGoodscustompriceRequest;
use AntChain\BAASDT\Models\SetConsumecardGoodscustompriceResponse;
use AntChain\BAASDT\Models\SetConsumecardGoodsstatusRequest;
use AntChain\BAASDT\Models\SetConsumecardGoodsstatusResponse;
use AntChain\BAASDT\Models\SetConsumecardProductcodeRequest;
use AntChain\BAASDT\Models\SetConsumecardProductcodeResponse;
use AntChain\BAASDT\Models\SetConsumecardPurchaserefundRequest;
use AntChain\BAASDT\Models\SetConsumecardPurchaserefundResponse;
use AntChain\BAASDT\Models\SetConsumecardPurchasereplaceRequest;
use AntChain\BAASDT\Models\SetConsumecardPurchasereplaceResponse;
use AntChain\BAASDT\Models\SetMerchantFundmanagerRequest;
use AntChain\BAASDT\Models\SetMerchantFundmanagerResponse;
use AntChain\BAASDT\Models\SetMerchantProvisionRequest;
use AntChain\BAASDT\Models\SetMerchantProvisionResponse;
use AntChain\BAASDT\Models\StartConsumecardPurchaseRequest;
use AntChain\BAASDT\Models\StartConsumecardPurchaseResponse;
use AntChain\BAASDT\Models\StartIpAuthtradeRequest;
use AntChain\BAASDT\Models\StartIpAuthtradeResponse;
use AntChain\BAASDT\Models\StartIpPackagetradeRequest;
use AntChain\BAASDT\Models\StartIpPackagetradeResponse;
use AntChain\BAASDT\Models\UnfreezeConsumecardAccountRequest;
use AntChain\BAASDT\Models\UnfreezeConsumecardAccountResponse;
use AntChain\BAASDT\Models\UnfreezeIpAccountRequest;
use AntChain\BAASDT\Models\UnfreezeIpAccountResponse;
use AntChain\BAASDT\Models\UpdateBlockanalysisDelegaterelationRequest;
use AntChain\BAASDT\Models\UpdateBlockanalysisDelegaterelationResponse;
use AntChain\BAASDT\Models\UpdateBlockanalysisWhitelistRequest;
use AntChain\BAASDT\Models\UpdateBlockanalysisWhitelistResponse;
use AntChain\BAASDT\Models\UpdateConfigDelegaterelationRequest;
use AntChain\BAASDT\Models\UpdateConfigDelegaterelationResponse;
use AntChain\BAASDT\Models\UpdateConfigWhitelistRequest;
use AntChain\BAASDT\Models\UpdateConfigWhitelistResponse;
use AntChain\BAASDT\Models\UpdateConsumecardAccountRequest;
use AntChain\BAASDT\Models\UpdateConsumecardAccountResponse;
use AntChain\BAASDT\Models\UpdateConsumecardGoodsRequest;
use AntChain\BAASDT\Models\UpdateConsumecardGoodsResponse;
use AntChain\BAASDT\Models\UpdateConsumecardRiskcontrolRequest;
use AntChain\BAASDT\Models\UpdateConsumecardRiskcontrolResponse;
use AntChain\BAASDT\Models\UpdateEquityDefaultpriceRequest;
use AntChain\BAASDT\Models\UpdateEquityDefaultpriceResponse;
use AntChain\BAASDT\Models\UpdateEquityExchangelimitRequest;
use AntChain\BAASDT\Models\UpdateEquityExchangelimitResponse;
use AntChain\BAASDT\Models\UpdateEquityRequest;
use AntChain\BAASDT\Models\UpdateEquityResponse;
use AntChain\BAASDT\Models\UpdateEquityStatusRequest;
use AntChain\BAASDT\Models\UpdateEquityStatusResponse;
use AntChain\BAASDT\Models\UpdateEquityTenantpriceRequest;
use AntChain\BAASDT\Models\UpdateEquityTenantpriceResponse;
use AntChain\BAASDT\Models\UpdateEquityValidtimeRequest;
use AntChain\BAASDT\Models\UpdateEquityValidtimeResponse;
use AntChain\BAASDT\Models\UpdateIpChannelRequest;
use AntChain\BAASDT\Models\UpdateIpChannelResponse;
use AntChain\BAASDT\Models\UpdateIpGoodsRequest;
use AntChain\BAASDT\Models\UpdateIpGoodsResponse;
use AntChain\BAASDT\Models\UpdateMerchantFriendRequest;
use AntChain\BAASDT\Models\UpdateMerchantFriendResponse;
use AntChain\BAASDT\Models\UpdateMerchantProvisionRequest;
use AntChain\BAASDT\Models\UpdateMerchantProvisionResponse;
use AntChain\BAASDT\Models\UploadConsumecardGoodsimageRequest;
use AntChain\BAASDT\Models\UploadConsumecardGoodsimageResponse;
use AntChain\BAASDT\Models\UploadImageRequest;
use AntChain\BAASDT\Models\UploadImageResponse;
use AntChain\BAASDT\Models\UploadIpAuthtradesalesRequest;
use AntChain\BAASDT\Models\UploadIpAuthtradesalesResponse;
use AntChain\BAASDT\Models\UploadIpPackagetradesalesRequest;
use AntChain\BAASDT\Models\UploadIpPackagetradesalesResponse;
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
            // 交易日志
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
                    'sdk_version'      => '1.2.1',
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
     * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-创建卡密.
     *
     * @param ExecCardCreateRequest $request
     *
     * @return ExecCardCreateResponse
     */
    public function execCardCreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCardCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-创建卡密.
     *
     * @param ExecCardCreateRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecCardCreateResponse
     */
    public function execCardCreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCardCreateResponse::fromMap($this->doRequest('1.0', 'baas.antdao.card.create.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-查询卡密.
     *
     * @param ExecCardQueryRequest $request
     *
     * @return ExecCardQueryResponse
     */
    public function execCardQuery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCardQueryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-查询卡密.
     *
     * @param ExecCardQueryRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ExecCardQueryResponse
     */
    public function execCardQueryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCardQueryResponse::fromMap($this->doRequest('1.0', 'baas.antdao.card.query.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-记名卡发行.
     *
     * @param ExecCardBindnameRequest $request
     *
     * @return ExecCardBindnameResponse
     */
    public function execCardBindname($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCardBindnameEx($request, $headers, $runtime);
    }

    /**
     * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-记名卡发行.
     *
     * @param ExecCardBindnameRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ExecCardBindnameResponse
     */
    public function execCardBindnameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCardBindnameResponse::fromMap($this->doRequest('1.0', 'baas.antdao.card.bindname.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-充值卡密.
     *
     * @param ExecCardChargeRequest $request
     *
     * @return ExecCardChargeResponse
     */
    public function execCardCharge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCardChargeEx($request, $headers, $runtime);
    }

    /**
     * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-充值卡密.
     *
     * @param ExecCardChargeRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecCardChargeResponse
     */
    public function execCardChargeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCardChargeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.card.charge.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-核销卡密.
     *
     * @param ExecCardWriteoffRequest $request
     *
     * @return ExecCardWriteoffResponse
     */
    public function execCardWriteoff($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCardWriteoffEx($request, $headers, $runtime);
    }

    /**
     * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-核销卡密.
     *
     * @param ExecCardWriteoffRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ExecCardWriteoffResponse
     */
    public function execCardWriteoffEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCardWriteoffResponse::fromMap($this->doRequest('1.0', 'baas.antdao.card.writeoff.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-过期卡密.
     *
     * @param ExecCardExpiredRequest $request
     *
     * @return ExecCardExpiredResponse
     */
    public function execCardExpired($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCardExpiredEx($request, $headers, $runtime);
    }

    /**
     * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-过期卡密.
     *
     * @param ExecCardExpiredRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecCardExpiredResponse
     */
    public function execCardExpiredEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCardExpiredResponse::fromMap($this->doRequest('1.0', 'baas.antdao.card.expired.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-风控禁用.
     *
     * @param ExecCardForbiddenRequest $request
     *
     * @return ExecCardForbiddenResponse
     */
    public function execCardForbidden($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCardForbiddenEx($request, $headers, $runtime);
    }

    /**
     * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-风控禁用.
     *
     * @param ExecCardForbiddenRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExecCardForbiddenResponse
     */
    public function execCardForbiddenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCardForbiddenResponse::fromMap($this->doRequest('1.0', 'baas.antdao.card.forbidden.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-充值重置.
     *
     * @param ExecCardChargeresetRequest $request
     *
     * @return ExecCardChargeresetResponse
     */
    public function execCardChargereset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCardChargeresetEx($request, $headers, $runtime);
    }

    /**
     * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-充值重置.
     *
     * @param ExecCardChargeresetRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecCardChargeresetResponse
     */
    public function execCardChargeresetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCardChargeresetResponse::fromMap($this->doRequest('1.0', 'baas.antdao.card.chargereset.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人或机构账户注册
     * Summary: 数字商品服务-消费卡服务-个人/机构注册.
     *
     * @param CreateConsumecardAccountRequest $request
     *
     * @return CreateConsumecardAccountResponse
     */
    public function createConsumecardAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsumecardAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人或机构账户注册
     * Summary: 数字商品服务-消费卡服务-个人/机构注册.
     *
     * @param CreateConsumecardAccountRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateConsumecardAccountResponse
     */
    public function createConsumecardAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsumecardAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.account.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人/机构账户注销
     * Summary: 数字商品服务-消费卡服务-个人/机构注销
     *
     * @param OfflineConsumecardAccountRequest $request
     *
     * @return OfflineConsumecardAccountResponse
     */
    public function offlineConsumecardAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineConsumecardAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人/机构账户注销
     * Summary: 数字商品服务-消费卡服务-个人/机构注销
     *
     * @param OfflineConsumecardAccountRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return OfflineConsumecardAccountResponse
     */
    public function offlineConsumecardAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineConsumecardAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.account.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业消费卡余额回退
     * Summary: 数字商品服务-消费卡服务-企业消费卡回退
     *
     * @param ReclaimConsumecardWalletRequest $request
     *
     * @return ReclaimConsumecardWalletResponse
     */
    public function reclaimConsumecardWallet($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reclaimConsumecardWalletEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业消费卡余额回退
     * Summary: 数字商品服务-消费卡服务-企业消费卡回退
     *
     * @param ReclaimConsumecardWalletRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ReclaimConsumecardWalletResponse
     */
    public function reclaimConsumecardWalletEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReclaimConsumecardWalletResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.wallet.reclaim', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人/机构账户禁用
     * Summary: 数字商品服务-消费卡服务-账户禁用.
     *
     * @param FreezeConsumecardAccountRequest $request
     *
     * @return FreezeConsumecardAccountResponse
     */
    public function freezeConsumecardAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->freezeConsumecardAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人/机构账户禁用
     * Summary: 数字商品服务-消费卡服务-账户禁用.
     *
     * @param FreezeConsumecardAccountRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return FreezeConsumecardAccountResponse
     */
    public function freezeConsumecardAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FreezeConsumecardAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.account.freeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人/机构账户解禁
     * Summary: 数字商品服务-消费卡服务-账户解禁
     *
     * @param UnfreezeConsumecardAccountRequest $request
     *
     * @return UnfreezeConsumecardAccountResponse
     */
    public function unfreezeConsumecardAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unfreezeConsumecardAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人/机构账户解禁
     * Summary: 数字商品服务-消费卡服务-账户解禁
     *
     * @param UnfreezeConsumecardAccountRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UnfreezeConsumecardAccountResponse
     */
    public function unfreezeConsumecardAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnfreezeConsumecardAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.account.unfreeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费卡风控调整(特殊权限,暂不开放)
     * Summary: 数字商品服务-消费卡服务-消费卡风控调整.
     *
     * @param UpdateConsumecardRiskcontrolRequest $request
     *
     * @return UpdateConsumecardRiskcontrolResponse
     */
    public function updateConsumecardRiskcontrol($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateConsumecardRiskcontrolEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费卡风控调整(特殊权限,暂不开放)
     * Summary: 数字商品服务-消费卡服务-消费卡风控调整.
     *
     * @param UpdateConsumecardRiskcontrolRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateConsumecardRiskcontrolResponse
     */
    public function updateConsumecardRiskcontrolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateConsumecardRiskcontrolResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.riskcontrol.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账单查询
     * Summary: 数字商品服务-消费卡服务-账单查询.
     *
     * @param QueryConsumecardBillRequest $request
     *
     * @return QueryConsumecardBillResponse
     */
    public function queryConsumecardBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 账单查询
     * Summary: 数字商品服务-消费卡服务-账单查询.
     *
     * @param QueryConsumecardBillRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryConsumecardBillResponse
     */
    public function queryConsumecardBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardBillResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.bill.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业消费卡充值冻结
     * Summary: 数字商品服务-消费卡服务-消费卡充值冻结.
     *
     * @param ChargeConsumecardWalletRequest $request
     *
     * @return ChargeConsumecardWalletResponse
     */
    public function chargeConsumecardWallet($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->chargeConsumecardWalletEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业消费卡充值冻结
     * Summary: 数字商品服务-消费卡服务-消费卡充值冻结.
     *
     * @param ChargeConsumecardWalletRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ChargeConsumecardWalletResponse
     */
    public function chargeConsumecardWalletEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ChargeConsumecardWalletResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.wallet.charge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更账户信息
     * Summary: 数字商品服务-消费卡服务-更新账户.
     *
     * @param UpdateConsumecardAccountRequest $request
     *
     * @return UpdateConsumecardAccountResponse
     */
    public function updateConsumecardAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateConsumecardAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 更账户信息
     * Summary: 数字商品服务-消费卡服务-更新账户.
     *
     * @param UpdateConsumecardAccountRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateConsumecardAccountResponse
     */
    public function updateConsumecardAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateConsumecardAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.account.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账单创建
     * Summary: 数字商品服务-消费卡服务-账单创建.
     *
     * @param CreateConsumecardBillRequest $request
     *
     * @return CreateConsumecardBillResponse
     */
    public function createConsumecardBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsumecardBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 账单创建
     * Summary: 数字商品服务-消费卡服务-账单创建.
     *
     * @param CreateConsumecardBillRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateConsumecardBillResponse
     */
    public function createConsumecardBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsumecardBillResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.bill.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账单创建确认成功或失败
     * Summary: 数字商品服务-消费卡服务-账单创建确认.
     *
     * @param ConfirmConsumecardBillcreateRequest $request
     *
     * @return ConfirmConsumecardBillcreateResponse
     */
    public function confirmConsumecardBillcreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmConsumecardBillcreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 账单创建确认成功或失败
     * Summary: 数字商品服务-消费卡服务-账单创建确认.
     *
     * @param ConfirmConsumecardBillcreateRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return ConfirmConsumecardBillcreateResponse
     */
    public function confirmConsumecardBillcreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmConsumecardBillcreateResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.billcreate.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账单取消
     * Summary: 数字商品服务-消费卡服务-取消账单.
     *
     * @param CancelConsumecardBillRequest $request
     *
     * @return CancelConsumecardBillResponse
     */
    public function cancelConsumecardBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelConsumecardBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 账单取消
     * Summary: 数字商品服务-消费卡服务-取消账单.
     *
     * @param CancelConsumecardBillRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CancelConsumecardBillResponse
     */
    public function cancelConsumecardBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelConsumecardBillResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.bill.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账单支付
     * Summary: 数字商品服务-消费卡服务-账单支付.
     *
     * @param ExecConsumecardBillpayRequest $request
     *
     * @return ExecConsumecardBillpayResponse
     */
    public function execConsumecardBillpay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execConsumecardBillpayEx($request, $headers, $runtime);
    }

    /**
     * Description: 账单支付
     * Summary: 数字商品服务-消费卡服务-账单支付.
     *
     * @param ExecConsumecardBillpayRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ExecConsumecardBillpayResponse
     */
    public function execConsumecardBillpayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecConsumecardBillpayResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.billpay.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账单核销和交易核销，传入交易类型和订单Id
     * Summary: 数字商品服务-消费卡服务-账单和交易核销
     *
     * @param ExecConsumecardOrderwriteoffRequest $request
     *
     * @return ExecConsumecardOrderwriteoffResponse
     */
    public function execConsumecardOrderwriteoff($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execConsumecardOrderwriteoffEx($request, $headers, $runtime);
    }

    /**
     * Description: 账单核销和交易核销，传入交易类型和订单Id
     * Summary: 数字商品服务-消费卡服务-账单和交易核销
     *
     * @param ExecConsumecardOrderwriteoffRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return ExecConsumecardOrderwriteoffResponse
     */
    public function execConsumecardOrderwriteoffEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecConsumecardOrderwriteoffResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.orderwriteoff.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 处理买家的退款申请，接受退款或者拒绝退款
     * Summary: 数字商品服务-消费卡服务-账单退款处理.
     *
     * @param ConfirmConsumecardBillrefundRequest $request
     *
     * @return ConfirmConsumecardBillrefundResponse
     */
    public function confirmConsumecardBillrefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmConsumecardBillrefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 处理买家的退款申请，接受退款或者拒绝退款
     * Summary: 数字商品服务-消费卡服务-账单退款处理.
     *
     * @param ConfirmConsumecardBillrefundRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return ConfirmConsumecardBillrefundResponse
     */
    public function confirmConsumecardBillrefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmConsumecardBillrefundResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.billrefund.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询账户信息
     * Summary: 数字商品服务-消费卡服务-查询账户信息.
     *
     * @param QueryConsumecardAccountRequest $request
     *
     * @return QueryConsumecardAccountResponse
     */
    public function queryConsumecardAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询账户信息
     * Summary: 数字商品服务-消费卡服务-查询账户信息.
     *
     * @param QueryConsumecardAccountRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryConsumecardAccountResponse
     */
    public function queryConsumecardAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.account.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开通钱包
     * Summary: 数字商品服务-消费卡服务-开通钱包.
     *
     * @param OpenConsumecardWalletRequest $request
     *
     * @return OpenConsumecardWalletResponse
     */
    public function openConsumecardWallet($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openConsumecardWalletEx($request, $headers, $runtime);
    }

    /**
     * Description: 开通钱包
     * Summary: 数字商品服务-消费卡服务-开通钱包.
     *
     * @param OpenConsumecardWalletRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return OpenConsumecardWalletResponse
     */
    public function openConsumecardWalletEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenConsumecardWalletResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.wallet.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询钱包信息
     * Summary: 数字商品服务-消费卡服务-查询钱包.
     *
     * @param QueryConsumecardWalletRequest $request
     *
     * @return QueryConsumecardWalletResponse
     */
    public function queryConsumecardWallet($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardWalletEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询钱包信息
     * Summary: 数字商品服务-消费卡服务-查询钱包.
     *
     * @param QueryConsumecardWalletRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryConsumecardWalletResponse
     */
    public function queryConsumecardWalletEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardWalletResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.wallet.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
     * Summary: 数字商品服务-消费卡服务-充值并兑换资产.
     *
     * @param ExecConsumecardWalletchargetotokenRequest $request
     *
     * @return ExecConsumecardWalletchargetotokenResponse
     */
    public function execConsumecardWalletchargetotoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execConsumecardWalletchargetotokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
     * Summary: 数字商品服务-消费卡服务-充值并兑换资产.
     *
     * @param ExecConsumecardWalletchargetotokenRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return ExecConsumecardWalletchargetotokenResponse
     */
    public function execConsumecardWalletchargetotokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecConsumecardWalletchargetotokenResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.walletchargetotoken.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 湮灭自己发行的token并提现
     * Summary: 数字商品服务-消费卡服务-湮灭资产并提现.
     *
     * @param ExecConsumecardWalletredeemtokenRequest $request
     *
     * @return ExecConsumecardWalletredeemtokenResponse
     */
    public function execConsumecardWalletredeemtoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execConsumecardWalletredeemtokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 湮灭自己发行的token并提现
     * Summary: 数字商品服务-消费卡服务-湮灭资产并提现.
     *
     * @param ExecConsumecardWalletredeemtokenRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return ExecConsumecardWalletredeemtokenResponse
     */
    public function execConsumecardWalletredeemtokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecConsumecardWalletredeemtokenResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.walletredeemtoken.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 买家发起交易
     * Summary: 数字商品服务-消费卡服务-买家发起交易.
     *
     * @param StartConsumecardPurchaseRequest $request
     *
     * @return StartConsumecardPurchaseResponse
     */
    public function startConsumecardPurchase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startConsumecardPurchaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 买家发起交易
     * Summary: 数字商品服务-消费卡服务-买家发起交易.
     *
     * @param StartConsumecardPurchaseRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return StartConsumecardPurchaseResponse
     */
    public function startConsumecardPurchaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartConsumecardPurchaseResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchase.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消交易，买家发起
     * Summary: 数字商品服务-消费卡服务-买家取消交易.
     *
     * @param CancelConsumecardBuyerpurchaseRequest $request
     *
     * @return CancelConsumecardBuyerpurchaseResponse
     */
    public function cancelConsumecardBuyerpurchase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelConsumecardBuyerpurchaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消交易，买家发起
     * Summary: 数字商品服务-消费卡服务-买家取消交易.
     *
     * @param CancelConsumecardBuyerpurchaseRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CancelConsumecardBuyerpurchaseResponse
     */
    public function cancelConsumecardBuyerpurchaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelConsumecardBuyerpurchaseResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.buyerpurchase.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 买家申请退款
     * Summary: 数字商品服务-消费卡服务-买家申请退款.
     *
     * @param ApplyConsumecardPurchaserefundRequest $request
     *
     * @return ApplyConsumecardPurchaserefundResponse
     */
    public function applyConsumecardPurchaserefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyConsumecardPurchaserefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 买家申请退款
     * Summary: 数字商品服务-消费卡服务-买家申请退款.
     *
     * @param ApplyConsumecardPurchaserefundRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ApplyConsumecardPurchaserefundResponse
     */
    public function applyConsumecardPurchaserefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyConsumecardPurchaserefundResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchaserefund.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 买家申请售后
     * Summary: 数字商品服务-消费卡服务-买家申请售后.
     *
     * @param ApplyConsumecardPurchasereplaceRequest $request
     *
     * @return ApplyConsumecardPurchasereplaceResponse
     */
    public function applyConsumecardPurchasereplace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyConsumecardPurchasereplaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 买家申请售后
     * Summary: 数字商品服务-消费卡服务-买家申请售后.
     *
     * @param ApplyConsumecardPurchasereplaceRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return ApplyConsumecardPurchasereplaceResponse
     */
    public function applyConsumecardPurchasereplaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyConsumecardPurchasereplaceResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchasereplace.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 买家确认收货
     * Summary: 数字商品服务-消费卡服务-买家确认收货.
     *
     * @param ExecConsumecardPurchasereceiveRequest $request
     *
     * @return ExecConsumecardPurchasereceiveResponse
     */
    public function execConsumecardPurchasereceive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execConsumecardPurchasereceiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 买家确认收货
     * Summary: 数字商品服务-消费卡服务-买家确认收货.
     *
     * @param ExecConsumecardPurchasereceiveRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ExecConsumecardPurchasereceiveResponse
     */
    public function execConsumecardPurchasereceiveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecConsumecardPurchasereceiveResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchasereceive.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卖家拒绝交易
     * Summary: 数字商品服务-消费卡服务-卖家拒绝交易.
     *
     * @param RefuseConsumecardPurchaseRequest $request
     *
     * @return RefuseConsumecardPurchaseResponse
     */
    public function refuseConsumecardPurchase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseConsumecardPurchaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 卖家拒绝交易
     * Summary: 数字商品服务-消费卡服务-卖家拒绝交易.
     *
     * @param RefuseConsumecardPurchaseRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return RefuseConsumecardPurchaseResponse
     */
    public function refuseConsumecardPurchaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseConsumecardPurchaseResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchase.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卖家退款操作。可以同意退款和拒绝退款。
     * Summary: 数字商品服务-消费卡服务-卖家退款操作.
     *
     * @param SetConsumecardPurchaserefundRequest $request
     *
     * @return SetConsumecardPurchaserefundResponse
     */
    public function setConsumecardPurchaserefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumecardPurchaserefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 卖家退款操作。可以同意退款和拒绝退款。
     * Summary: 数字商品服务-消费卡服务-卖家退款操作.
     *
     * @param SetConsumecardPurchaserefundRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return SetConsumecardPurchaserefundResponse
     */
    public function setConsumecardPurchaserefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumecardPurchaserefundResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchaserefund.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卖家换货操作。可以同意换货，拒绝换货
     * Summary: 数字商品服务-消费卡服务-卖家换货操作.
     *
     * @param SetConsumecardPurchasereplaceRequest $request
     *
     * @return SetConsumecardPurchasereplaceResponse
     */
    public function setConsumecardPurchasereplace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumecardPurchasereplaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 卖家换货操作。可以同意换货，拒绝换货
     * Summary: 数字商品服务-消费卡服务-卖家换货操作.
     *
     * @param SetConsumecardPurchasereplaceRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return SetConsumecardPurchasereplaceResponse
     */
    public function setConsumecardPurchasereplaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumecardPurchasereplaceResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchasereplace.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卖家接单
     * Summary: 数字商品服务-消费卡服务-卖家接单.
     *
     * @param ConfirmConsumecardPurchaseRequest $request
     *
     * @return ConfirmConsumecardPurchaseResponse
     */
    public function confirmConsumecardPurchase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmConsumecardPurchaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 卖家接单
     * Summary: 数字商品服务-消费卡服务-卖家接单.
     *
     * @param ConfirmConsumecardPurchaseRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ConfirmConsumecardPurchaseResponse
     */
    public function confirmConsumecardPurchaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmConsumecardPurchaseResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchase.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卖家发货
     * Summary: 数字商品服务-消费卡服务-卖家发货.
     *
     * @param SendConsumecardPurchaseRequest $request
     *
     * @return SendConsumecardPurchaseResponse
     */
    public function sendConsumecardPurchase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendConsumecardPurchaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 卖家发货
     * Summary: 数字商品服务-消费卡服务-卖家发货.
     *
     * @param SendConsumecardPurchaseRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SendConsumecardPurchaseResponse
     */
    public function sendConsumecardPurchaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendConsumecardPurchaseResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchase.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卖家售后补发货
     * Summary: 数字商品服务-消费卡服务-卖家售后补发货.
     *
     * @param ReplaceConsumecardPurchaseRequest $request
     *
     * @return ReplaceConsumecardPurchaseResponse
     */
    public function replaceConsumecardPurchase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceConsumecardPurchaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 卖家售后补发货
     * Summary: 数字商品服务-消费卡服务-卖家售后补发货.
     *
     * @param ReplaceConsumecardPurchaseRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ReplaceConsumecardPurchaseResponse
     */
    public function replaceConsumecardPurchaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceConsumecardPurchaseResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchase.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布商品
     * Summary: 数字商品服务-消费卡服务-发布商品
     *
     * @param CreateConsumecardGoodsRequest $request
     *
     * @return CreateConsumecardGoodsResponse
     */
    public function createConsumecardGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsumecardGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布商品
     * Summary: 数字商品服务-消费卡服务-发布商品
     *
     * @param CreateConsumecardGoodsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateConsumecardGoodsResponse
     */
    public function createConsumecardGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsumecardGoodsResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goods.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-消费卡服务-更新商品信息.
     *
     * @param UpdateConsumecardGoodsRequest $request
     *
     * @return UpdateConsumecardGoodsResponse
     */
    public function updateConsumecardGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateConsumecardGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-消费卡服务-更新商品信息.
     *
     * @param UpdateConsumecardGoodsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateConsumecardGoodsResponse
     */
    public function updateConsumecardGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateConsumecardGoodsResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goods.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品开放购买权限给指定账户
     * Summary: 数字商品服务-消费卡服务-开放购买权限.
     *
     * @param OpenConsumecardGoodstocustomRequest $request
     *
     * @return OpenConsumecardGoodstocustomResponse
     */
    public function openConsumecardGoodstocustom($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openConsumecardGoodstocustomEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品开放购买权限给指定账户
     * Summary: 数字商品服务-消费卡服务-开放购买权限.
     *
     * @param OpenConsumecardGoodstocustomRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return OpenConsumecardGoodstocustomResponse
     */
    public function openConsumecardGoodstocustomEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenConsumecardGoodstocustomResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goodstocustom.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增商品类别
     * Summary: 数字商品服务-消费卡服务-新增商品类别.
     *
     * @param CreateConsumecardGoodscategoryRequest $request
     *
     * @return CreateConsumecardGoodscategoryResponse
     */
    public function createConsumecardGoodscategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsumecardGoodscategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增商品类别
     * Summary: 数字商品服务-消费卡服务-新增商品类别.
     *
     * @param CreateConsumecardGoodscategoryRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CreateConsumecardGoodscategoryResponse
     */
    public function createConsumecardGoodscategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsumecardGoodscategoryResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goodscategory.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置商品一客一价
     * Summary: 数字商品服务-消费卡服务-设置一客一价.
     *
     * @param SetConsumecardGoodscustompriceRequest $request
     *
     * @return SetConsumecardGoodscustompriceResponse
     */
    public function setConsumecardGoodscustomprice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumecardGoodscustompriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置商品一客一价
     * Summary: 数字商品服务-消费卡服务-设置一客一价.
     *
     * @param SetConsumecardGoodscustompriceRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return SetConsumecardGoodscustompriceResponse
     */
    public function setConsumecardGoodscustompriceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumecardGoodscustompriceResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goodscustomprice.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传图片获取URL
     * Summary: 数字商品服务-消费卡服务-上传图片.
     *
     * @param UploadConsumecardGoodsimageRequest $request
     *
     * @return UploadConsumecardGoodsimageResponse
     */
    public function uploadConsumecardGoodsimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadConsumecardGoodsimageEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传图片获取URL
     * Summary: 数字商品服务-消费卡服务-上传图片.
     *
     * @param UploadConsumecardGoodsimageRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UploadConsumecardGoodsimageResponse
     */
    public function uploadConsumecardGoodsimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadConsumecardGoodsimageResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goodsimage.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构订单提现试算
     * Summary: 数字商品服务-消费卡服务-企业提现试算.
     *
     * @param ExecConsumecardOrdertrywithdrawRequest $request
     *
     * @return ExecConsumecardOrdertrywithdrawResponse
     */
    public function execConsumecardOrdertrywithdraw($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execConsumecardOrdertrywithdrawEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构订单提现试算
     * Summary: 数字商品服务-消费卡服务-企业提现试算.
     *
     * @param ExecConsumecardOrdertrywithdrawRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return ExecConsumecardOrdertrywithdrawResponse
     */
    public function execConsumecardOrdertrywithdrawEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecConsumecardOrdertrywithdrawResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.ordertrywithdraw.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
     * Summary: 数字商品服务-消费卡服务-根据区块提现.
     *
     * @param ExecConsumecardOrderwithdrawbyblocknumRequest $request
     *
     * @return ExecConsumecardOrderwithdrawbyblocknumResponse
     */
    public function execConsumecardOrderwithdrawbyblocknum($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execConsumecardOrderwithdrawbyblocknumEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
     * Summary: 数字商品服务-消费卡服务-根据区块提现.
     *
     * @param ExecConsumecardOrderwithdrawbyblocknumRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return ExecConsumecardOrderwithdrawbyblocknumResponse
     */
    public function execConsumecardOrderwithdrawbyblocknumEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecConsumecardOrderwithdrawbyblocknumResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.orderwithdrawbyblocknum.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
     * Summary: 数字商品服务-消费卡服务-根据订单表提现.
     *
     * @param ExecConsumecardOrderwithdrawbyidsRequest $request
     *
     * @return ExecConsumecardOrderwithdrawbyidsResponse
     */
    public function execConsumecardOrderwithdrawbyids($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execConsumecardOrderwithdrawbyidsEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
     * Summary: 数字商品服务-消费卡服务-根据订单表提现.
     *
     * @param ExecConsumecardOrderwithdrawbyidsRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return ExecConsumecardOrderwithdrawbyidsResponse
     */
    public function execConsumecardOrderwithdrawbyidsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecConsumecardOrderwithdrawbyidsResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.orderwithdrawbyids.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据提现单号获取提现结果
     * Summary: 数字商品服务-消费卡服务-获取提现结果.
     *
     * @param GetConsumecardOrderwithdrawresultRequest $request
     *
     * @return GetConsumecardOrderwithdrawresultResponse
     */
    public function getConsumecardOrderwithdrawresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getConsumecardOrderwithdrawresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据提现单号获取提现结果
     * Summary: 数字商品服务-消费卡服务-获取提现结果.
     *
     * @param GetConsumecardOrderwithdrawresultRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return GetConsumecardOrderwithdrawresultResponse
     */
    public function getConsumecardOrderwithdrawresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetConsumecardOrderwithdrawresultResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.orderwithdrawresult.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注销前需要回退资金,查询账户可回退金额
     * Summary: 数字商品服务-消费卡服务-查询可回退金额.
     *
     * @param QueryConsumecardWalletredeemableRequest $request
     *
     * @return QueryConsumecardWalletredeemableResponse
     */
    public function queryConsumecardWalletredeemable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardWalletredeemableEx($request, $headers, $runtime);
    }

    /**
     * Description: 注销前需要回退资金,查询账户可回退金额
     * Summary: 数字商品服务-消费卡服务-查询可回退金额.
     *
     * @param QueryConsumecardWalletredeemableRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryConsumecardWalletredeemableResponse
     */
    public function queryConsumecardWalletredeemableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardWalletredeemableResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.walletredeemable.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布商品是异步流程，根据requestId查询商品发布结果
     * Summary: 数字商品服务-消费卡服务-查询商品发布.
     *
     * @param QueryConsumecardGoodscreateresultRequest $request
     *
     * @return QueryConsumecardGoodscreateresultResponse
     */
    public function queryConsumecardGoodscreateresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardGoodscreateresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布商品是异步流程，根据requestId查询商品发布结果
     * Summary: 数字商品服务-消费卡服务-查询商品发布.
     *
     * @param QueryConsumecardGoodscreateresultRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryConsumecardGoodscreateresultResponse
     */
    public function queryConsumecardGoodscreateresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardGoodscreateresultResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goodscreateresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询消费卡商品信息
     * Summary: 数字商品服务-消费卡服务-查询商品信息.
     *
     * @param QueryConsumecardGoodsRequest $request
     *
     * @return QueryConsumecardGoodsResponse
     */
    public function queryConsumecardGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询消费卡商品信息
     * Summary: 数字商品服务-消费卡服务-查询商品信息.
     *
     * @param QueryConsumecardGoodsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryConsumecardGoodsResponse
     */
    public function queryConsumecardGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardGoodsResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goods.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账单退款申请
     * Summary: 数字商品服务-消费卡服务-账单退款申请.
     *
     * @param ApplyConsumecardBillrefundRequest $request
     *
     * @return ApplyConsumecardBillrefundResponse
     */
    public function applyConsumecardBillrefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyConsumecardBillrefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 账单退款申请
     * Summary: 数字商品服务-消费卡服务-账单退款申请.
     *
     * @param ApplyConsumecardBillrefundRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ApplyConsumecardBillrefundResponse
     */
    public function applyConsumecardBillrefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyConsumecardBillrefundResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.billrefund.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询交易信息
     * Summary: 数字商品服务-消费卡服务-交易查询.
     *
     * @param QueryConsumecardPurchaseRequest $request
     *
     * @return QueryConsumecardPurchaseResponse
     */
    public function queryConsumecardPurchase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardPurchaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询交易信息
     * Summary: 数字商品服务-消费卡服务-交易查询.
     *
     * @param QueryConsumecardPurchaseRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryConsumecardPurchaseResponse
     */
    public function queryConsumecardPurchaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardPurchaseResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.purchase.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-消费卡服务-获取区块.
     *
     * @param QueryConsumecardBlockRequest $request
     *
     * @return QueryConsumecardBlockResponse
     */
    public function queryConsumecardBlock($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardBlockEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-消费卡服务-获取区块.
     *
     * @param QueryConsumecardBlockRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryConsumecardBlockResponse
     */
    public function queryConsumecardBlockEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardBlockResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.block.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询最新区块高度
     * Summary: 数字商品服务-消费卡服务-查最新区块高度.
     *
     * @param QueryConsumecardLastblocknumberRequest $request
     *
     * @return QueryConsumecardLastblocknumberResponse
     */
    public function queryConsumecardLastblocknumber($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardLastblocknumberEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询最新区块高度
     * Summary: 数字商品服务-消费卡服务-查最新区块高度.
     *
     * @param QueryConsumecardLastblocknumberRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryConsumecardLastblocknumberResponse
     */
    public function queryConsumecardLastblocknumberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardLastblocknumberResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.lastblocknumber.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
     * Summary: 数字商品服务-消费卡服务-更新结果查询.
     *
     * @param QueryConsumecardGoodsupdateresultRequest $request
     *
     * @return QueryConsumecardGoodsupdateresultResponse
     */
    public function queryConsumecardGoodsupdateresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardGoodsupdateresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
     * Summary: 数字商品服务-消费卡服务-更新结果查询.
     *
     * @param QueryConsumecardGoodsupdateresultRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryConsumecardGoodsupdateresultResponse
     */
    public function queryConsumecardGoodsupdateresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardGoodsupdateresultResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goodsupdateresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 卖家取消交易
     * Summary: 数字商品服务--消费卡服务-卖家取消交易.
     *
     * @param CancelConsumecardSellerpurchaseRequest $request
     *
     * @return CancelConsumecardSellerpurchaseResponse
     */
    public function cancelConsumecardSellerpurchase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelConsumecardSellerpurchaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 卖家取消交易
     * Summary: 数字商品服务--消费卡服务-卖家取消交易.
     *
     * @param CancelConsumecardSellerpurchaseRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return CancelConsumecardSellerpurchaseResponse
     */
    public function cancelConsumecardSellerpurchaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelConsumecardSellerpurchaseResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.sellerpurchase.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 配置商品和账单的手续费信息
     * Summary: 数字商品服务-消费卡服务-配置手续费.
     *
     * @param SetConsumecardCommissionRequest $request
     *
     * @return SetConsumecardCommissionResponse
     */
    public function setConsumecardCommission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumecardCommissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 配置商品和账单的手续费信息
     * Summary: 数字商品服务-消费卡服务-配置手续费.
     *
     * @param SetConsumecardCommissionRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SetConsumecardCommissionResponse
     */
    public function setConsumecardCommissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumecardCommissionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.commission.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除手续费配置
     * Summary: 数字商品服务-消费卡服务-删除手续费配置.
     *
     * @param RemoveConsumecardCommissionRequest $request
     *
     * @return RemoveConsumecardCommissionResponse
     */
    public function removeConsumecardCommission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeConsumecardCommissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除手续费配置
     * Summary: 数字商品服务-消费卡服务-删除手续费配置.
     *
     * @param RemoveConsumecardCommissionRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return RemoveConsumecardCommissionResponse
     */
    public function removeConsumecardCommissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveConsumecardCommissionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.commission.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询手续费信息
     * Summary: 数字商品服务-消费卡服务-查询手续费信息.
     *
     * @param QueryConsumecardCommissionRequest $request
     *
     * @return QueryConsumecardCommissionResponse
     */
    public function queryConsumecardCommission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardCommissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询手续费信息
     * Summary: 数字商品服务-消费卡服务-查询手续费信息.
     *
     * @param QueryConsumecardCommissionRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryConsumecardCommissionResponse
     */
    public function queryConsumecardCommissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardCommissionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.commission.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
     * Summary: 数字商品服务-消费卡服务-设置手续费管理.
     *
     * @param SetConsumecardCommissionmanagerRequest $request
     *
     * @return SetConsumecardCommissionmanagerResponse
     */
    public function setConsumecardCommissionmanager($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumecardCommissionmanagerEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
     * Summary: 数字商品服务-消费卡服务-设置手续费管理.
     *
     * @param SetConsumecardCommissionmanagerRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return SetConsumecardCommissionmanagerResponse
     */
    public function setConsumecardCommissionmanagerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumecardCommissionmanagerResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.commissionmanager.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置商品状态，可以设置为上线或下线
     * Summary: 数字商品服务-消费卡服务-设置商品状态
     *
     * @param SetConsumecardGoodsstatusRequest $request
     *
     * @return SetConsumecardGoodsstatusResponse
     */
    public function setConsumecardGoodsstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumecardGoodsstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置商品状态，可以设置为上线或下线
     * Summary: 数字商品服务-消费卡服务-设置商品状态
     *
     * @param SetConsumecardGoodsstatusRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SetConsumecardGoodsstatusResponse
     */
    public function setConsumecardGoodsstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumecardGoodsstatusResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goodsstatus.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人用户来账付款协议签约
     * Summary: 个人用户来账付款协议签约.
     *
     * @param CreateConsumecardReceiptcontractRequest $request
     *
     * @return CreateConsumecardReceiptcontractResponse
     */
    public function createConsumecardReceiptcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsumecardReceiptcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人用户来账付款协议签约
     * Summary: 个人用户来账付款协议签约.
     *
     * @param CreateConsumecardReceiptcontractRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateConsumecardReceiptcontractResponse
     */
    public function createConsumecardReceiptcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsumecardReceiptcontractResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.receiptcontract.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 来账协议解约接口
     * Summary: 来账协议签约.
     *
     * @param RemoveConsumecardReceiptcontractRequest $request
     *
     * @return RemoveConsumecardReceiptcontractResponse
     */
    public function removeConsumecardReceiptcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeConsumecardReceiptcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 来账协议解约接口
     * Summary: 来账协议签约.
     *
     * @param RemoveConsumecardReceiptcontractRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return RemoveConsumecardReceiptcontractResponse
     */
    public function removeConsumecardReceiptcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveConsumecardReceiptcontractResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.receiptcontract.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 来账协议查询接口
     * Summary: 来账协议查询.
     *
     * @param QueryConsumecardReceiptcontractRequest $request
     *
     * @return QueryConsumecardReceiptcontractResponse
     */
    public function queryConsumecardReceiptcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardReceiptcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 来账协议查询接口
     * Summary: 来账协议查询.
     *
     * @param QueryConsumecardReceiptcontractRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryConsumecardReceiptcontractResponse
     */
    public function queryConsumecardReceiptcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardReceiptcontractResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.receiptcontract.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 首单协议首次签约
     * Summary: 首单协议首次签约.
     *
     * @param CreateConsumecardBillingcontractRequest $request
     *
     * @return CreateConsumecardBillingcontractResponse
     */
    public function createConsumecardBillingcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsumecardBillingcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 首单协议首次签约
     * Summary: 首单协议首次签约.
     *
     * @param CreateConsumecardBillingcontractRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateConsumecardBillingcontractResponse
     */
    public function createConsumecardBillingcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsumecardBillingcontractResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.billingcontract.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 收单协议解约
     * Summary: 收单协议解约.
     *
     * @param RemoveConsumecardBillingcontractRequest $request
     *
     * @return RemoveConsumecardBillingcontractResponse
     */
    public function removeConsumecardBillingcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeConsumecardBillingcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 收单协议解约
     * Summary: 收单协议解约.
     *
     * @param RemoveConsumecardBillingcontractRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return RemoveConsumecardBillingcontractResponse
     */
    public function removeConsumecardBillingcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveConsumecardBillingcontractResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.billingcontract.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 收单协议签约查询
     * Summary: 收单协议签约查询.
     *
     * @param QueryConsumecardBillingcontractRequest $request
     *
     * @return QueryConsumecardBillingcontractResponse
     */
    public function queryConsumecardBillingcontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardBillingcontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 收单协议签约查询
     * Summary: 收单协议签约查询.
     *
     * @param QueryConsumecardBillingcontractRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryConsumecardBillingcontractResponse
     */
    public function queryConsumecardBillingcontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardBillingcontractResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.billingcontract.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 增加一级分账方
     * Summary: 数字商品服务-消费卡服务-增加一级分账方.
     *
     * @param AddConsumecardCommissionpartyRequest $request
     *
     * @return AddConsumecardCommissionpartyResponse
     */
    public function addConsumecardCommissionparty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addConsumecardCommissionpartyEx($request, $headers, $runtime);
    }

    /**
     * Description: 增加一级分账方
     * Summary: 数字商品服务-消费卡服务-增加一级分账方.
     *
     * @param AddConsumecardCommissionpartyRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return AddConsumecardCommissionpartyResponse
     */
    public function addConsumecardCommissionpartyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddConsumecardCommissionpartyResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.commissionparty.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除一级分账方
     * Summary: 数字商品服务-消费卡服务-删除一级分账方.
     *
     * @param RemoveConsumecardCommissionpartyRequest $request
     *
     * @return RemoveConsumecardCommissionpartyResponse
     */
    public function removeConsumecardCommissionparty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeConsumecardCommissionpartyEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除一级分账方
     * Summary: 数字商品服务-消费卡服务-删除一级分账方.
     *
     * @param RemoveConsumecardCommissionpartyRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return RemoveConsumecardCommissionpartyResponse
     */
    public function removeConsumecardCommissionpartyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveConsumecardCommissionpartyResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.commissionparty.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 增加手续费周期
     * Summary: 数字商品服务-消费卡服务-增加手续费周期
     *
     * @param AddConsumecardCommissionperiodRequest $request
     *
     * @return AddConsumecardCommissionperiodResponse
     */
    public function addConsumecardCommissionperiod($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addConsumecardCommissionperiodEx($request, $headers, $runtime);
    }

    /**
     * Description: 增加手续费周期
     * Summary: 数字商品服务-消费卡服务-增加手续费周期
     *
     * @param AddConsumecardCommissionperiodRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return AddConsumecardCommissionperiodResponse
     */
    public function addConsumecardCommissionperiodEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddConsumecardCommissionperiodResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.commissionperiod.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除手续费周期
     * Summary: 数字商品服务-消费卡服务-删除手续费周期
     *
     * @param RemoveConsumecardCommissionperiodRequest $request
     *
     * @return RemoveConsumecardCommissionperiodResponse
     */
    public function removeConsumecardCommissionperiod($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeConsumecardCommissionperiodEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除手续费周期
     * Summary: 数字商品服务-消费卡服务-删除手续费周期
     *
     * @param RemoveConsumecardCommissionperiodRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return RemoveConsumecardCommissionperiodResponse
     */
    public function removeConsumecardCommissionperiodEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveConsumecardCommissionperiodResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.commissionperiod.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询统计信息
     * Summary: 数字商品服务-消费卡服务-查询统计信息.
     *
     * @param QueryConsumecardCounterRequest $request
     *
     * @return QueryConsumecardCounterResponse
     */
    public function queryConsumecardCounter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardCounterEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询统计信息
     * Summary: 数字商品服务-消费卡服务-查询统计信息.
     *
     * @param QueryConsumecardCounterRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryConsumecardCounterResponse
     */
    public function queryConsumecardCounterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardCounterResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.counter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 管理接口：配置场景码权限信息
     * Summary: 数字商品服务-消费卡服务-场景码配置.
     *
     * @param SetConsumecardProductcodeRequest $request
     *
     * @return SetConsumecardProductcodeResponse
     */
    public function setConsumecardProductcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumecardProductcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 管理接口：配置场景码权限信息
     * Summary: 数字商品服务-消费卡服务-场景码配置.
     *
     * @param SetConsumecardProductcodeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SetConsumecardProductcodeResponse
     */
    public function setConsumecardProductcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumecardProductcodeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.productcode.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已配置的场景码信息
     * Summary: 数字商品服务-消费卡服务-查询场景码配置.
     *
     * @param QueryConsumecardProductcodeRequest $request
     *
     * @return QueryConsumecardProductcodeResponse
     */
    public function queryConsumecardProductcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardProductcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已配置的场景码信息
     * Summary: 数字商品服务-消费卡服务-查询场景码配置.
     *
     * @param QueryConsumecardProductcodeRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryConsumecardProductcodeResponse
     */
    public function queryConsumecardProductcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardProductcodeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.productcode.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除场景码配置
     * Summary: 数字商品服务-消费卡服务-删除场景码配置.
     *
     * @param RemoveConsumecardProductcodeRequest $request
     *
     * @return RemoveConsumecardProductcodeResponse
     */
    public function removeConsumecardProductcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeConsumecardProductcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除场景码配置
     * Summary: 数字商品服务-消费卡服务-删除场景码配置.
     *
     * @param RemoveConsumecardProductcodeRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return RemoveConsumecardProductcodeResponse
     */
    public function removeConsumecardProductcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveConsumecardProductcodeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.productcode.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据图片不可访问URl 获取可以访问的临时URL
     * Summary: 数字商品服务-消费卡服务-查询图片URL.
     *
     * @param QueryConsumecardGoodsimageRequest $request
     *
     * @return QueryConsumecardGoodsimageResponse
     */
    public function queryConsumecardGoodsimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConsumecardGoodsimageEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据图片不可访问URl 获取可以访问的临时URL
     * Summary: 数字商品服务-消费卡服务-查询图片URL.
     *
     * @param QueryConsumecardGoodsimageRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryConsumecardGoodsimageResponse
     */
    public function queryConsumecardGoodsimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConsumecardGoodsimageResponse::fromMap($this->doRequest('1.0', 'baas.antdao.consumecard.goodsimage.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
     * Summary: 数字商品服务-电子券服务-查询电子券.
     *
     * @param QueryCouponRequest $request
     *
     * @return QueryCouponResponse
     */
    public function queryCoupon($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCouponEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
     * Summary: 数字商品服务-电子券服务-查询电子券.
     *
     * @param QueryCouponRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryCouponResponse
     */
    public function queryCouponEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCouponResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个电子券接口
     * Summary: 数字商品服务-电子券服务-创建单个电子券.
     *
     * @param CreateCouponRequest $request
     *
     * @return CreateCouponResponse
     */
    public function createCoupon($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCouponEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个电子券接口
     * Summary: 数字商品服务-电子券服务-创建单个电子券.
     *
     * @param CreateCouponRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateCouponResponse
     */
    public function createCouponEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCouponResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
     * Summary: 数字商品服务-电子券服务-电子券风控禁用.
     *
     * @param ExecCouponForbiddenRequest $request
     *
     * @return ExecCouponForbiddenResponse
     */
    public function execCouponForbidden($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCouponForbiddenEx($request, $headers, $runtime);
    }

    /**
     * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
     * Summary: 数字商品服务-电子券服务-电子券风控禁用.
     *
     * @param ExecCouponForbiddenRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecCouponForbiddenResponse
     */
    public function execCouponForbiddenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCouponForbiddenResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.forbidden.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将电子券更新为可用状态
     * Summary: 数字商品服务-电子券服务-电子券风控启用.
     *
     * @param ExecCouponEnableRequest $request
     *
     * @return ExecCouponEnableResponse
     */
    public function execCouponEnable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCouponEnableEx($request, $headers, $runtime);
    }

    /**
     * Description: 将电子券更新为可用状态
     * Summary: 数字商品服务-电子券服务-电子券风控启用.
     *
     * @param ExecCouponEnableRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ExecCouponEnableResponse
     */
    public function execCouponEnableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCouponEnableResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.enable.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将电子券状态更新为过期
     * Summary: 数字商品服务-电子券服务-电子券过期
     *
     * @param ExecCouponExpireRequest $request
     *
     * @return ExecCouponExpireResponse
     */
    public function execCouponExpire($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCouponExpireEx($request, $headers, $runtime);
    }

    /**
     * Description: 将电子券状态更新为过期
     * Summary: 数字商品服务-电子券服务-电子券过期
     *
     * @param ExecCouponExpireRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ExecCouponExpireResponse
     */
    public function execCouponExpireEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCouponExpireResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.expire.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将电子券状态更新为核销
     * Summary: 数字商品服务-电子券服务-电子券核销
     *
     * @param ExecCouponWriteoffRequest $request
     *
     * @return ExecCouponWriteoffResponse
     */
    public function execCouponWriteoff($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCouponWriteoffEx($request, $headers, $runtime);
    }

    /**
     * Description: 将电子券状态更新为核销
     * Summary: 数字商品服务-电子券服务-电子券核销
     *
     * @param ExecCouponWriteoffRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ExecCouponWriteoffResponse
     */
    public function execCouponWriteoffEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCouponWriteoffResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.writeoff.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新电子券的激活码状态为已超时
     * Summary: 数字商品服务-电子券服务-券激活码超时.
     *
     * @param ExecCouponTimeoutRequest $request
     *
     * @return ExecCouponTimeoutResponse
     */
    public function execCouponTimeout($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCouponTimeoutEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新电子券的激活码状态为已超时
     * Summary: 数字商品服务-电子券服务-券激活码超时.
     *
     * @param ExecCouponTimeoutRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExecCouponTimeoutResponse
     */
    public function execCouponTimeoutEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCouponTimeoutResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.timeout.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户上传激活码，激活电子券
     * Summary: 数字商品服务-电子券服务-激活电子券.
     *
     * @param ExecCouponActivateRequest $request
     *
     * @return ExecCouponActivateResponse
     */
    public function execCouponActivate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCouponActivateEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户上传激活码，激活电子券
     * Summary: 数字商品服务-电子券服务-激活电子券.
     *
     * @param ExecCouponActivateRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ExecCouponActivateResponse
     */
    public function execCouponActivateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCouponActivateResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.activate.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将电子券转让给其他用户
     * Summary: 数字商品服务-电子券服务-电子券转让.
     *
     * @param ExecCouponTransferRequest $request
     *
     * @return ExecCouponTransferResponse
     */
    public function execCouponTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCouponTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 将电子券转让给其他用户
     * Summary: 数字商品服务-电子券服务-电子券转让.
     *
     * @param ExecCouponTransferRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ExecCouponTransferResponse
     */
    public function execCouponTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCouponTransferResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.transfer.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
     * Summary: 数字商品服务-电子券服务-电子券记名.
     *
     * @param ExecCouponSignRequest $request
     *
     * @return ExecCouponSignResponse
     */
    public function execCouponSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCouponSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
     * Summary: 数字商品服务-电子券服务-电子券记名.
     *
     * @param ExecCouponSignRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecCouponSignResponse
     */
    public function execCouponSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCouponSignResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.sign.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 绑定电子券，更新为“绑定”状态
     * Summary: 数字商品服务-电子券服务-绑定电子券.
     *
     * @param ExecCouponBindRequest $request
     *
     * @return ExecCouponBindResponse
     */
    public function execCouponBind($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execCouponBindEx($request, $headers, $runtime);
    }

    /**
     * Description: 绑定电子券，更新为“绑定”状态
     * Summary: 数字商品服务-电子券服务-绑定电子券.
     *
     * @param ExecCouponBindRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecCouponBindResponse
     */
    public function execCouponBindEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecCouponBindResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.bind.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
     * Summary: 数字商品服务-电子券服务-电子券批量创建.
     *
     * @param BatchcreateCouponRequest $request
     *
     * @return BatchcreateCouponResponse
     */
    public function batchcreateCoupon($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateCouponEx($request, $headers, $runtime);
    }

    /**
     * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
     * Summary: 数字商品服务-电子券服务-电子券批量创建.
     *
     * @param BatchcreateCouponRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return BatchcreateCouponResponse
     */
    public function batchcreateCouponEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateCouponResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
     * Summary: 数字商品服务-电子券服务-电子券列表创建.
     *
     * @param CreateCouponListRequest $request
     *
     * @return CreateCouponListResponse
     */
    public function createCouponList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCouponListEx($request, $headers, $runtime);
    }

    /**
     * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
     * Summary: 数字商品服务-电子券服务-电子券列表创建.
     *
     * @param CreateCouponListRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateCouponListResponse
     */
    public function createCouponListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCouponListResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.list.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
     * Summary: 数字商品服务-电子券服务-创建电子券批次
     *
     * @param CreateCouponCollectionRequest $request
     *
     * @return CreateCouponCollectionResponse
     */
    public function createCouponCollection($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCouponCollectionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
     * Summary: 数字商品服务-电子券服务-创建电子券批次
     *
     * @param CreateCouponCollectionRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateCouponCollectionResponse
     */
    public function createCouponCollectionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCouponCollectionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.collection.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
     * Summary: 数字商品服务-电子券服务-电子券批次查询.
     *
     * @param QueryCouponCollectionRequest $request
     *
     * @return QueryCouponCollectionResponse
     */
    public function queryCouponCollection($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCouponCollectionEx($request, $headers, $runtime);
    }

    /**
     * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
     * Summary: 数字商品服务-电子券服务-电子券批次查询.
     *
     * @param QueryCouponCollectionRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryCouponCollectionResponse
     */
    public function queryCouponCollectionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCouponCollectionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.coupon.collection.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询调用商户下的用户信息
     * Summary: 数字商品服务-商户管理-查询用户信息.
     *
     * @param QueryMerchantUserRequest $request
     *
     * @return QueryMerchantUserResponse
     */
    public function queryMerchantUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询调用商户下的用户信息
     * Summary: 数字商品服务-商户管理-查询用户信息.
     *
     * @param QueryMerchantUserRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryMerchantUserResponse
     */
    public function queryMerchantUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantUserResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建商户管理下的用户
     * Summary: 数字商品服务-商户管理-商户创建用户.
     *
     * @param CreateMerchantUserRequest $request
     *
     * @return CreateMerchantUserResponse
     */
    public function createMerchantUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMerchantUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建商户管理下的用户
     * Summary: 数字商品服务-商户管理-商户创建用户.
     *
     * @param CreateMerchantUserRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateMerchantUserResponse
     */
    public function createMerchantUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMerchantUserResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.user.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
     * Summary: 数字商品服务-商户管理-查询商户信息.
     *
     * @param QueryMerchantRequest $request
     *
     * @return QueryMerchantResponse
     */
    public function queryMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
     * Summary: 数字商品服务-商户管理-查询商户信息.
     *
     * @param QueryMerchantRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryMerchantResponse
     */
    public function queryMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
     * Summary: 数字商品服务-OSS服务-上传图片.
     *
     * @param UploadImageRequest $request
     *
     * @return UploadImageResponse
     */
    public function uploadImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
     * Summary: 数字商品服务-OSS服务-上传图片.
     *
     * @param UploadImageRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return UploadImageResponse
     */
    public function uploadImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadImageResponse::fromMap($this->doRequest('1.0', 'baas.antdao.image.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取kms中对应用户的公钥
     * Summary: 数字商品服务-密钥管理-获取用户公钥.
     *
     * @param GetPkiPublickeyRequest $request
     *
     * @return GetPkiPublickeyResponse
     */
    public function getPkiPublickey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getPkiPublickeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取kms中对应用户的公钥
     * Summary: 数字商品服务-密钥管理-获取用户公钥.
     *
     * @param GetPkiPublickeyRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetPkiPublickeyResponse
     */
    public function getPkiPublickeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetPkiPublickeyResponse::fromMap($this->doRequest('1.0', 'baas.antdao.pki.publickey.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ECC公钥加密接口
     * Summary: 数字商品服务-密钥管理-公钥加密.
     *
     * @param ExecPkiEncryptRequest $request
     *
     * @return ExecPkiEncryptResponse
     */
    public function execPkiEncrypt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execPkiEncryptEx($request, $headers, $runtime);
    }

    /**
     * Description: ECC公钥加密接口
     * Summary: 数字商品服务-密钥管理-公钥加密.
     *
     * @param ExecPkiEncryptRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecPkiEncryptResponse
     */
    public function execPkiEncryptEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecPkiEncryptResponse::fromMap($this->doRequest('1.0', 'baas.antdao.pki.encrypt.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ECC解密算法接口
     * Summary: 数字商品服务-密钥管理-私钥解密.
     *
     * @param ExecPkiDecryptRequest $request
     *
     * @return ExecPkiDecryptResponse
     */
    public function execPkiDecrypt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execPkiDecryptEx($request, $headers, $runtime);
    }

    /**
     * Description: ECC解密算法接口
     * Summary: 数字商品服务-密钥管理-私钥解密.
     *
     * @param ExecPkiDecryptRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecPkiDecryptResponse
     */
    public function execPkiDecryptEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecPkiDecryptResponse::fromMap($this->doRequest('1.0', 'baas.antdao.pki.decrypt.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新商户的友商信息
     * Summary: 数字商品服务-商户管理-更新商户友商.
     *
     * @param UpdateMerchantFriendRequest $request
     *
     * @return UpdateMerchantFriendResponse
     */
    public function updateMerchantFriend($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMerchantFriendEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新商户的友商信息
     * Summary: 数字商品服务-商户管理-更新商户友商.
     *
     * @param UpdateMerchantFriendRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateMerchantFriendResponse
     */
    public function updateMerchantFriendEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMerchantFriendResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.friend.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品供应商户发布一个商品
     * Summary: 数字商品服务-商品服务-创建商品
     *
     * @param CreateEquityRequest $request
     *
     * @return CreateEquityResponse
     */
    public function createEquity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createEquityEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品供应商户发布一个商品
     * Summary: 数字商品服务-商品服务-创建商品
     *
     * @param CreateEquityRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateEquityResponse
     */
    public function createEquityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateEquityResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
     * 下线商品
     * Summary: 数字商品服务-商品服务-下线商品
     *
     * @param OfflineEquityRequest $request
     *
     * @return OfflineEquityResponse
     */
    public function offlineEquity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineEquityEx($request, $headers, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
     * 下线商品
     * Summary: 数字商品服务-商品服务-下线商品
     *
     * @param OfflineEquityRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return OfflineEquityResponse
     */
    public function offlineEquityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineEquityResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至baas.antdao.equity.status.update
     * 冻结权益
     * Summary: 数字商品服务-商品服务-冻结商品
     *
     * @param FreezeEquityRequest $request
     *
     * @return FreezeEquityResponse
     */
    public function freezeEquity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->freezeEquityEx($request, $headers, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至baas.antdao.equity.status.update
     * 冻结权益
     * Summary: 数字商品服务-商品服务-冻结商品
     *
     * @param FreezeEquityRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return FreezeEquityResponse
     */
    public function freezeEquityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FreezeEquityResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.freeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权兑换—非公开商品商户配置
     * Summary: 数字商品服务-商品服务-授权兑换.
     *
     * @param OpenEquityMerchantRequest $request
     *
     * @return OpenEquityMerchantResponse
     */
    public function openEquityMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openEquityMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权兑换—非公开商品商户配置
     * Summary: 数字商品服务-商品服务-授权兑换.
     *
     * @param OpenEquityMerchantRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return OpenEquityMerchantResponse
     */
    public function openEquityMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenEquityMerchantResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.merchant.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户兑换价格设置
     * Summary: 数字商品服务-商品服务-用户兑换价格设置.
     *
     * @param AuthEquityMerchantuserpriceRequest $request
     *
     * @return AuthEquityMerchantuserpriceResponse
     */
    public function authEquityMerchantuserprice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authEquityMerchantuserpriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户兑换价格设置
     * Summary: 数字商品服务-商品服务-用户兑换价格设置.
     *
     * @param AuthEquityMerchantuserpriceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return AuthEquityMerchantuserpriceResponse
     */
    public function authEquityMerchantuserpriceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthEquityMerchantuserpriceResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.merchantuserprice.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品价格
     * Summary: 数字商品服务-商品服务-更新商品价格
     *
     * @param UpdateEquityDefaultpriceRequest $request
     *
     * @return UpdateEquityDefaultpriceResponse
     */
    public function updateEquityDefaultprice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateEquityDefaultpriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品价格
     * Summary: 数字商品服务-商品服务-更新商品价格
     *
     * @param UpdateEquityDefaultpriceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateEquityDefaultpriceResponse
     */
    public function updateEquityDefaultpriceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateEquityDefaultpriceResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.defaultprice.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新商品自定义定价
     * Summary: 数字商品服务-商品服务-更新自定义定价.
     *
     * @param UpdateEquityTenantpriceRequest $request
     *
     * @return UpdateEquityTenantpriceResponse
     */
    public function updateEquityTenantprice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateEquityTenantpriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新商品自定义定价
     * Summary: 数字商品服务-商品服务-更新自定义定价.
     *
     * @param UpdateEquityTenantpriceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateEquityTenantpriceResponse
     */
    public function updateEquityTenantpriceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateEquityTenantpriceResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.tenantprice.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 增加权益库存
     * Summary: 数字商品服务-商品服务-增加权益库存.
     *
     * @param AddEquityCountRequest $request
     *
     * @return AddEquityCountResponse
     */
    public function addEquityCount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addEquityCountEx($request, $headers, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 增加权益库存
     * Summary: 数字商品服务-商品服务-增加权益库存.
     *
     * @param AddEquityCountRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AddEquityCountResponse
     */
    public function addEquityCountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddEquityCountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.count.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新兑换限制规则
     * Summary: 数字商品服务-商品服务-更新兑换限制规则.
     *
     * @param UpdateEquityExchangelimitRequest $request
     *
     * @return UpdateEquityExchangelimitResponse
     */
    public function updateEquityExchangelimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateEquityExchangelimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新兑换限制规则
     * Summary: 数字商品服务-商品服务-更新兑换限制规则.
     *
     * @param UpdateEquityExchangelimitRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateEquityExchangelimitResponse
     */
    public function updateEquityExchangelimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateEquityExchangelimitResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.exchangelimit.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品有效期
     * Summary: 数字商品服务-商品服务-更新有效期
     *
     * @param UpdateEquityValidtimeRequest $request
     *
     * @return UpdateEquityValidtimeResponse
     */
    public function updateEquityValidtime($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateEquityValidtimeEx($request, $headers, $runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
     * 更新商品有效期
     * Summary: 数字商品服务-商品服务-更新有效期
     *
     * @param UpdateEquityValidtimeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateEquityValidtimeResponse
     */
    public function updateEquityValidtimeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateEquityValidtimeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.validtime.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商品信息
     * Summary: 数字商品服务-商品服务-查询商品信息.
     *
     * @param QueryEquityRequest $request
     *
     * @return QueryEquityResponse
     */
    public function queryEquity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEquityEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商品信息
     * Summary: 数字商品服务-商品服务-查询商品信息.
     *
     * @param QueryEquityRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryEquityResponse
     */
    public function queryEquityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEquityResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户身份发起兑换
     * Summary: 数字商品服务-兑换服务-用户身份发起兑换.
     *
     * @param ExecExchangeByuserRequest $request
     *
     * @return ExecExchangeByuserResponse
     */
    public function execExchangeByuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execExchangeByuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户身份发起兑换
     * Summary: 数字商品服务-兑换服务-用户身份发起兑换.
     *
     * @param ExecExchangeByuserRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ExecExchangeByuserResponse
     */
    public function execExchangeByuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecExchangeByuserResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.byuser.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户身份发起兑换
     * Summary: 数字商品服务-兑换服务-商户身份发起兑换.
     *
     * @param ExecExchangeBymerchantRequest $request
     *
     * @return ExecExchangeBymerchantResponse
     */
    public function execExchangeBymerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execExchangeBymerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户身份发起兑换
     * Summary: 数字商品服务-兑换服务-商户身份发起兑换.
     *
     * @param ExecExchangeBymerchantRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ExecExchangeBymerchantResponse
     */
    public function execExchangeBymerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecExchangeBymerchantResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.bymerchant.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
     * Summary: 数字商品服务-兑换服务-确认接单.
     *
     * @param ConfirmExchangeRequest $request
     *
     * @return ConfirmExchangeResponse
     */
    public function confirmExchange($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmExchangeEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
     * Summary: 数字商品服务-兑换服务-确认接单.
     *
     * @param ConfirmExchangeRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ConfirmExchangeResponse
     */
    public function confirmExchangeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmExchangeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
     * Summary: 数字商品服务-兑换服务-拒绝发货.
     *
     * @param ExecExchangeOutofstoreRequest $request
     *
     * @return ExecExchangeOutofstoreResponse
     */
    public function execExchangeOutofstore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execExchangeOutofstoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
     * Summary: 数字商品服务-兑换服务-拒绝发货.
     *
     * @param ExecExchangeOutofstoreRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ExecExchangeOutofstoreResponse
     */
    public function execExchangeOutofstoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecExchangeOutofstoreResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.outofstore.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 兑换发货
     * Summary: 数字商品服务-兑换服务-兑换发货.
     *
     * @param SendExchangeRequest $request
     *
     * @return SendExchangeResponse
     */
    public function sendExchange($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendExchangeEx($request, $headers, $runtime);
    }

    /**
     * Description: 兑换发货
     * Summary: 数字商品服务-兑换服务-兑换发货.
     *
     * @param SendExchangeRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return SendExchangeResponse
     */
    public function sendExchangeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendExchangeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户身份确认收货
     * Summary: 数字商品服务-兑换服务-用户身份确认收货.
     *
     * @param ExecExchangeReceivebyuserRequest $request
     *
     * @return ExecExchangeReceivebyuserResponse
     */
    public function execExchangeReceivebyuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execExchangeReceivebyuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户身份确认收货
     * Summary: 数字商品服务-兑换服务-用户身份确认收货.
     *
     * @param ExecExchangeReceivebyuserRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ExecExchangeReceivebyuserResponse
     */
    public function execExchangeReceivebyuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecExchangeReceivebyuserResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.receivebyuser.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产过期
     * Summary: 数字商品服务-资产服务-资产过期
     *
     * @param ExecAssetExpireRequest $request
     *
     * @return ExecAssetExpireResponse
     */
    public function execAssetExpire($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAssetExpireEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产过期
     * Summary: 数字商品服务-资产服务-资产过期
     *
     * @param ExecAssetExpireRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecAssetExpireResponse
     */
    public function execAssetExpireEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAssetExpireResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.expire.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 检索资产流转流水
     * Summary: 数字商品服务-资产服务-查询资产流转流水.
     *
     * @param QueryAssetInstructionRequest $request
     *
     * @return QueryAssetInstructionResponse
     */
    public function queryAssetInstruction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAssetInstructionEx($request, $headers, $runtime);
    }

    /**
     * Description: 检索资产流转流水
     * Summary: 数字商品服务-资产服务-查询资产流转流水.
     *
     * @param QueryAssetInstructionRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryAssetInstructionResponse
     */
    public function queryAssetInstructionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAssetInstructionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.instruction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 该接口废弃不用！！！
     * 查询商品兑换流水
     * Summary: 数字商品服务-兑换服务-查询商品兑换流水.
     *
     * @param QueryExchangeInstructionRequest $request
     *
     * @return QueryExchangeInstructionResponse
     */
    public function queryExchangeInstruction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryExchangeInstructionEx($request, $headers, $runtime);
    }

    /**
     * Description: 该接口废弃不用！！！
     * 查询商品兑换流水
     * Summary: 数字商品服务-兑换服务-查询商品兑换流水.
     *
     * @param QueryExchangeInstructionRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryExchangeInstructionResponse
     */
    public function queryExchangeInstructionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryExchangeInstructionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.instruction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产初始化发行
     * Summary: 数字商品服务-资产服务-资产初始化发行.
     *
     * @param ExecAssetIssueRequest $request
     *
     * @return ExecAssetIssueResponse
     */
    public function execAssetIssue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAssetIssueEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产初始化发行
     * Summary: 数字商品服务-资产服务-资产初始化发行.
     *
     * @param ExecAssetIssueRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecAssetIssueResponse
     */
    public function execAssetIssueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAssetIssueResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.issue.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 赎回资产
     * Summary: 数字商品服务-资产服务-赎回资产.
     *
     * @param ExecAssetRedeemRequest $request
     *
     * @return ExecAssetRedeemResponse
     */
    public function execAssetRedeem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAssetRedeemEx($request, $headers, $runtime);
    }

    /**
     * Description: 赎回资产
     * Summary: 数字商品服务-资产服务-赎回资产.
     *
     * @param ExecAssetRedeemRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecAssetRedeemResponse
     */
    public function execAssetRedeemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAssetRedeemResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.redeem.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发放资产
     * Summary: 数字商品服务-资产服务-发放资产.
     *
     * @param ExecAssetGrantRequest $request
     *
     * @return ExecAssetGrantResponse
     */
    public function execAssetGrant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAssetGrantEx($request, $headers, $runtime);
    }

    /**
     * Description: 发放资产
     * Summary: 数字商品服务-资产服务-发放资产.
     *
     * @param ExecAssetGrantRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecAssetGrantResponse
     */
    public function execAssetGrantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAssetGrantResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.grant.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发放回退资产
     * Summary: 数字商品服务-资产服务-发放回退资产.
     *
     * @param ExecAssetGrantrefundRequest $request
     *
     * @return ExecAssetGrantrefundResponse
     */
    public function execAssetGrantrefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAssetGrantrefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 发放回退资产
     * Summary: 数字商品服务-资产服务-发放回退资产.
     *
     * @param ExecAssetGrantrefundRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExecAssetGrantrefundResponse
     */
    public function execAssetGrantrefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAssetGrantrefundResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.grantrefund.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风控调整资产
     * Summary: 数字商品服务-资产服务-风控调整资产.
     *
     * @param ExecAssetAdjustRequest $request
     *
     * @return ExecAssetAdjustResponse
     */
    public function execAssetAdjust($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAssetAdjustEx($request, $headers, $runtime);
    }

    /**
     * Description: 风控调整资产
     * Summary: 数字商品服务-资产服务-风控调整资产.
     *
     * @param ExecAssetAdjustRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecAssetAdjustResponse
     */
    public function execAssetAdjustEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAssetAdjustResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.adjust.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产查询
     * Summary: 数字商品服务-资产服务-资产查询.
     *
     * @param QueryAssetRequest $request
     *
     * @return QueryAssetResponse
     */
    public function queryAsset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产查询
     * Summary: 数字商品服务-资产服务-资产查询.
     *
     * @param QueryAssetRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryAssetResponse
     */
    public function queryAssetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAssetResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户身份确认收货
     * Summary: 数字商品服务-兑换服务-商户身份确认收货.
     *
     * @param ExecExchangeReceivebymerchantRequest $request
     *
     * @return ExecExchangeReceivebymerchantResponse
     */
    public function execExchangeReceivebymerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execExchangeReceivebymerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户身份确认收货
     * Summary: 数字商品服务-兑换服务-商户身份确认收货.
     *
     * @param ExecExchangeReceivebymerchantRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ExecExchangeReceivebymerchantResponse
     */
    public function execExchangeReceivebymerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecExchangeReceivebymerchantResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.receivebymerchant.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息.
     *
     * @param QueryBlockRequest $request
     *
     * @return QueryBlockResponse
     */
    public function queryBlock($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息.
     *
     * @param QueryBlockRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryBlockResponse
     */
    public function queryBlockEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockResponse::fromMap($this->doRequest('1.0', 'baas.antdao.block.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取区块链最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度.
     *
     * @param QueryBlockLastblocknumberRequest $request
     *
     * @return QueryBlockLastblocknumberResponse
     */
    public function queryBlockLastblocknumber($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockLastblocknumberEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取区块链最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度.
     *
     * @param QueryBlockLastblocknumberRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryBlockLastblocknumberResponse
     */
    public function queryBlockLastblocknumberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockLastblocknumberResponse::fromMap($this->doRequest('1.0', 'baas.antdao.block.lastblocknumber.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-商品服务-更新商品属性信息.
     *
     * @param UpdateEquityRequest $request
     *
     * @return UpdateEquityResponse
     */
    public function updateEquity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateEquityEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-商品服务-更新商品属性信息.
     *
     * @param UpdateEquityRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return UpdateEquityResponse
     */
    public function updateEquityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateEquityResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
     * Summary: 数字商品服务-商品服务-发布商品结果查询.
     *
     * @param QueryEquityCreateresultRequest $request
     *
     * @return QueryEquityCreateresultResponse
     */
    public function queryEquityCreateresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEquityCreateresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
     * Summary: 数字商品服务-商品服务-发布商品结果查询.
     *
     * @param QueryEquityCreateresultRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryEquityCreateresultResponse
     */
    public function queryEquityCreateresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEquityCreateresultResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.createresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据商品兑换流水交易号查询商品兑换流水详情
     * Summary: 数字商品服务-商品服务-查询商品兑换流水.
     *
     * @param QueryEquityInstructionRequest $request
     *
     * @return QueryEquityInstructionResponse
     */
    public function queryEquityInstruction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEquityInstructionEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据商品兑换流水交易号查询商品兑换流水详情
     * Summary: 数字商品服务-商品服务-查询商品兑换流水.
     *
     * @param QueryEquityInstructionRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryEquityInstructionResponse
     */
    public function queryEquityInstructionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEquityInstructionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.instruction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
     * Summary: 数字商品服务-OSS服务-获取图片URL.
     *
     * @param QueryImageRequest $request
     *
     * @return QueryImageResponse
     */
    public function queryImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
     * Summary: 数字商品服务-OSS服务-获取图片URL.
     *
     * @param QueryImageRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryImageResponse
     */
    public function queryImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryImageResponse::fromMap($this->doRequest('1.0', 'baas.antdao.image.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新商品状态（可用，冻结，下线）
     * Summary: 数字商品服务-商品服务-更新商品状态
     *
     * @param UpdateEquityStatusRequest $request
     *
     * @return UpdateEquityStatusResponse
     */
    public function updateEquityStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateEquityStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新商品状态（可用，冻结，下线）
     * Summary: 数字商品服务-商品服务-更新商品状态
     *
     * @param UpdateEquityStatusRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateEquityStatusResponse
     */
    public function updateEquityStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateEquityStatusResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.status.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置备付金金额（CAS接口）
     * Summary: 数字商品服务-商户管理-设置备付金金额.
     *
     * @param SetMerchantProvisionRequest $request
     *
     * @return SetMerchantProvisionResponse
     */
    public function setMerchantProvision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setMerchantProvisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置备付金金额（CAS接口）
     * Summary: 数字商品服务-商户管理-设置备付金金额.
     *
     * @param SetMerchantProvisionRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SetMerchantProvisionResponse
     */
    public function setMerchantProvisionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetMerchantProvisionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.provision.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新商户的备付金金额，由资金管理员操作
     * Summary: 数字商品服务-商户管理-更新备付金金额.
     *
     * @param UpdateMerchantProvisionRequest $request
     *
     * @return UpdateMerchantProvisionResponse
     */
    public function updateMerchantProvision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMerchantProvisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新商户的备付金金额，由资金管理员操作
     * Summary: 数字商品服务-商户管理-更新备付金金额.
     *
     * @param UpdateMerchantProvisionRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateMerchantProvisionResponse
     */
    public function updateMerchantProvisionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMerchantProvisionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.provision.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核销商品兑换交易，由资金管理员操作
     * Summary: 数字商品服务-商品服务-核销商品兑换交易.
     *
     * @param ExecEquityInstructionwriteoffRequest $request
     *
     * @return ExecEquityInstructionwriteoffResponse
     */
    public function execEquityInstructionwriteoff($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execEquityInstructionwriteoffEx($request, $headers, $runtime);
    }

    /**
     * Description: 核销商品兑换交易，由资金管理员操作
     * Summary: 数字商品服务-商品服务-核销商品兑换交易.
     *
     * @param ExecEquityInstructionwriteoffRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ExecEquityInstructionwriteoffResponse
     */
    public function execEquityInstructionwriteoffEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecEquityInstructionwriteoffResponse::fromMap($this->doRequest('1.0', 'baas.antdao.equity.instructionwriteoff.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户的备付金列表
     * Summary: 数字商品服务-商户管理-查租户备付金列表.
     *
     * @param QueryMerchantProvisionsRequest $request
     *
     * @return QueryMerchantProvisionsResponse
     */
    public function queryMerchantProvisions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantProvisionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户的备付金列表
     * Summary: 数字商品服务-商户管理-查租户备付金列表.
     *
     * @param QueryMerchantProvisionsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryMerchantProvisionsResponse
     */
    public function queryMerchantProvisionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantProvisionsResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.provisions.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
     * Summary: 数字商品服务-商户管理-查询可兑换商品
     *
     * @param QueryMerchantExchangeableequitylistRequest $request
     *
     * @return QueryMerchantExchangeableequitylistResponse
     */
    public function queryMerchantExchangeableequitylist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantExchangeableequitylistEx($request, $headers, $runtime);
    }

    /**
     * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
     * Summary: 数字商品服务-商户管理-查询可兑换商品
     *
     * @param QueryMerchantExchangeableequitylistRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryMerchantExchangeableequitylistResponse
     */
    public function queryMerchantExchangeableequitylistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantExchangeableequitylistResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.exchangeableequitylist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
     * Summary: 数字商品服务-商户管理-查询可兑商品明细.
     *
     * @param QueryMerchantExchangeableequitydetailRequest $request
     *
     * @return QueryMerchantExchangeableequitydetailResponse
     */
    public function queryMerchantExchangeableequitydetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantExchangeableequitydetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
     * Summary: 数字商品服务-商户管理-查询可兑商品明细.
     *
     * @param QueryMerchantExchangeableequitydetailRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryMerchantExchangeableequitydetailResponse
     */
    public function queryMerchantExchangeableequitydetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantExchangeableequitydetailResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.exchangeableequitydetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建新资产
     * Summary: 数字商品服务-资产服务-创建资产.
     *
     * @param ExecAssetCreateRequest $request
     *
     * @return ExecAssetCreateResponse
     */
    public function execAssetCreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAssetCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建新资产
     * Summary: 数字商品服务-资产服务-创建资产.
     *
     * @param ExecAssetCreateRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecAssetCreateResponse
     */
    public function execAssetCreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAssetCreateResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.create.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产铸币(不扣减备付金)，合约管理员操作
     * Summary: 数字商品服务-资产服务-资产铸币
     *
     * @param ExecAssetGenerateRequest $request
     *
     * @return ExecAssetGenerateResponse
     */
    public function execAssetGenerate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAssetGenerateEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产铸币(不扣减备付金)，合约管理员操作
     * Summary: 数字商品服务-资产服务-资产铸币
     *
     * @param ExecAssetGenerateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExecAssetGenerateResponse
     */
    public function execAssetGenerateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAssetGenerateResponse::fromMap($this->doRequest('1.0', 'baas.antdao.asset.generate.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建商户（合约管理员权限）
     * Summary: 数字商品服务-商户管理-创建商户.
     *
     * @param CreateMerchantRequest $request
     *
     * @return CreateMerchantResponse
     */
    public function createMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建商户（合约管理员权限）
     * Summary: 数字商品服务-商户管理-创建商户.
     *
     * @param CreateMerchantRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateMerchantResponse
     */
    public function createMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMerchantResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置商户的资金管理员，重要权限，谨慎操作！
     * Summary: 数字商品服务-商户管理-设置资金管理员.
     *
     * @param SetMerchantFundmanagerRequest $request
     *
     * @return SetMerchantFundmanagerResponse
     */
    public function setMerchantFundmanager($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setMerchantFundmanagerEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置商户的资金管理员，重要权限，谨慎操作！
     * Summary: 数字商品服务-商户管理-设置资金管理员.
     *
     * @param SetMerchantFundmanagerRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SetMerchantFundmanagerResponse
     */
    public function setMerchantFundmanagerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetMerchantFundmanagerResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.fundmanager.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建备付金账户，合约管理员权限
     * Summary: 数字商品服务-商户管理-创建备付金账户.
     *
     * @param CreateMerchantProvisionRequest $request
     *
     * @return CreateMerchantProvisionResponse
     */
    public function createMerchantProvision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMerchantProvisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建备付金账户，合约管理员权限
     * Summary: 数字商品服务-商户管理-创建备付金账户.
     *
     * @param CreateMerchantProvisionRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateMerchantProvisionResponse
     */
    public function createMerchantProvisionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMerchantProvisionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.merchant.provision.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-管理服务-代理权限查询.
     *
     * @param QueryConfigDelegaterelationRequest $request
     *
     * @return QueryConfigDelegaterelationResponse
     */
    public function queryConfigDelegaterelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConfigDelegaterelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-管理服务-代理权限查询.
     *
     * @param QueryConfigDelegaterelationRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryConfigDelegaterelationResponse
     */
    public function queryConfigDelegaterelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConfigDelegaterelationResponse::fromMap($this->doRequest('1.0', 'baas.antdao.config.delegaterelation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-管理服务-设置代理权限.
     *
     * @param UpdateConfigDelegaterelationRequest $request
     *
     * @return UpdateConfigDelegaterelationResponse
     */
    public function updateConfigDelegaterelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateConfigDelegaterelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-管理服务-设置代理权限.
     *
     * @param UpdateConfigDelegaterelationRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateConfigDelegaterelationResponse
     */
    public function updateConfigDelegaterelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateConfigDelegaterelationResponse::fromMap($this->doRequest('1.0', 'baas.antdao.config.delegaterelation.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单.
     *
     * @param QueryConfigWhitelistRequest $request
     *
     * @return QueryConfigWhitelistResponse
     */
    public function queryConfigWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryConfigWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单.
     *
     * @param QueryConfigWhitelistRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryConfigWhitelistResponse
     */
    public function queryConfigWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryConfigWhitelistResponse::fromMap($this->doRequest('1.0', 'baas.antdao.config.whitelist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置接口访问白名单
     * Summary: 数字商品服务-管理服务-设置访问白名单.
     *
     * @param UpdateConfigWhitelistRequest $request
     *
     * @return UpdateConfigWhitelistResponse
     */
    public function updateConfigWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateConfigWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置接口访问白名单
     * Summary: 数字商品服务-管理服务-设置访问白名单.
     *
     * @param UpdateConfigWhitelistRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateConfigWhitelistResponse
     */
    public function updateConfigWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateConfigWhitelistResponse::fromMap($this->doRequest('1.0', 'baas.antdao.config.whitelist.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 兑换单申请售后（采购商）
     * Summary: 数字商品服务-兑换服务-申请售后(商家).
     *
     * @param ApplyExchangeAftersaleRequest $request
     *
     * @return ApplyExchangeAftersaleResponse
     */
    public function applyExchangeAftersale($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyExchangeAftersaleEx($request, $headers, $runtime);
    }

    /**
     * Description: 兑换单申请售后（采购商）
     * Summary: 数字商品服务-兑换服务-申请售后(商家).
     *
     * @param ApplyExchangeAftersaleRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ApplyExchangeAftersaleResponse
     */
    public function applyExchangeAftersaleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyExchangeAftersaleResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.aftersale.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同意售后（供应商）
     * Summary: 数字商品服务-兑换服务-同意售后.
     *
     * @param ExecExchangeAgreeaftersaleRequest $request
     *
     * @return ExecExchangeAgreeaftersaleResponse
     */
    public function execExchangeAgreeaftersale($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execExchangeAgreeaftersaleEx($request, $headers, $runtime);
    }

    /**
     * Description: 同意售后（供应商）
     * Summary: 数字商品服务-兑换服务-同意售后.
     *
     * @param ExecExchangeAgreeaftersaleRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ExecExchangeAgreeaftersaleResponse
     */
    public function execExchangeAgreeaftersaleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecExchangeAgreeaftersaleResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.agreeaftersale.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 拒绝售后（供应商）
     * Summary: 数字商品服务-兑换服务-拒绝售后.
     *
     * @param RefuseExchangeAftersaleRequest $request
     *
     * @return RefuseExchangeAftersaleResponse
     */
    public function refuseExchangeAftersale($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseExchangeAftersaleEx($request, $headers, $runtime);
    }

    /**
     * Description: 拒绝售后（供应商）
     * Summary: 数字商品服务-兑换服务-拒绝售后.
     *
     * @param RefuseExchangeAftersaleRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return RefuseExchangeAftersaleResponse
     */
    public function refuseExchangeAftersaleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseExchangeAftersaleResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.aftersale.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新发货（供应商）
     * Summary: 数字商品服务-兑换服务-重新发货.
     *
     * @param SendExchangeAftersaleRequest $request
     *
     * @return SendExchangeAftersaleResponse
     */
    public function sendExchangeAftersale($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendExchangeAftersaleEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新发货（供应商）
     * Summary: 数字商品服务-兑换服务-重新发货.
     *
     * @param SendExchangeAftersaleRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SendExchangeAftersaleResponse
     */
    public function sendExchangeAftersaleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendExchangeAftersaleResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.aftersale.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商户确认售后（供应商）comfirmaftersale
     * Summary:  数字商品服务-兑换服务-商户确认售后.
     *
     * @param ConfirmExchangeAftersaleRequest $request
     *
     * @return ConfirmExchangeAftersaleResponse
     */
    public function confirmExchangeAftersale($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmExchangeAftersaleEx($request, $headers, $runtime);
    }

    /**
     * Description: 商户确认售后（供应商）comfirmaftersale
     * Summary:  数字商品服务-兑换服务-商户确认售后.
     *
     * @param ConfirmExchangeAftersaleRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ConfirmExchangeAftersaleResponse
     */
    public function confirmExchangeAftersaleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmExchangeAftersaleResponse::fromMap($this->doRequest('1.0', 'baas.antdao.exchange.aftersale.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字消费卡链上发布
     * Summary: 数字商品服务-存证服务-消费卡链上发布.
     *
     * @param ExecDataDepositRequest $request
     *
     * @return ExecDataDepositResponse
     */
    public function execDataDeposit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execDataDepositEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字消费卡链上发布
     * Summary: 数字商品服务-存证服务-消费卡链上发布.
     *
     * @param ExecDataDepositRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecDataDepositResponse
     */
    public function execDataDepositEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecDataDepositResponse::fromMap($this->doRequest('1.0', 'baas.antdao.data.deposit.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置商品兑换手续费
     * Summary: 数字商品服务-商品服务-设置商品手续费.
     *
     * @param SetCommissionRequest $request
     *
     * @return SetCommissionResponse
     */
    public function setCommission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setCommissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置商品兑换手续费
     * Summary: 数字商品服务-商品服务-设置商品手续费.
     *
     * @param SetCommissionRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return SetCommissionResponse
     */
    public function setCommissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetCommissionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.commission.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
     * Summary: 数字商品服务-商品服务-查询商品手续费.
     *
     * @param QueryCommissionRequest $request
     *
     * @return QueryCommissionResponse
     */
    public function queryCommission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCommissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
     * Summary: 数字商品服务-商品服务-查询商品手续费.
     *
     * @param QueryCommissionRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryCommissionResponse
     */
    public function queryCommissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCommissionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.commission.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置收取手续费的商户信息（合约管理员权限）
     * Summary: 数字商品服务-商品服务-设置收手续费商户.
     *
     * @param SetCommissionMerchantRequest $request
     *
     * @return SetCommissionMerchantResponse
     */
    public function setCommissionMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setCommissionMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置收取手续费的商户信息（合约管理员权限）
     * Summary: 数字商品服务-商品服务-设置收手续费商户.
     *
     * @param SetCommissionMerchantRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SetCommissionMerchantResponse
     */
    public function setCommissionMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetCommissionMerchantResponse::fromMap($this->doRequest('1.0', 'baas.antdao.commission.merchant.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询收取手续费的商户信息
     * Summary: 数字商品服务-商品服务-查询收手续费商户.
     *
     * @param QueryCommissionMerchantRequest $request
     *
     * @return QueryCommissionMerchantResponse
     */
    public function queryCommissionMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCommissionMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询收取手续费的商户信息
     * Summary: 数字商品服务-商品服务-查询收手续费商户.
     *
     * @param QueryCommissionMerchantRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryCommissionMerchantResponse
     */
    public function queryCommissionMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCommissionMerchantResponse::fromMap($this->doRequest('1.0', 'baas.antdao.commission.merchant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单独创建对应的链ID的链上账户
     * Summary: 数字商品服务-管理服务-创建链上账户.
     *
     * @param CreateConfigChainaccountRequest $request
     *
     * @return CreateConfigChainaccountResponse
     */
    public function createConfigChainaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConfigChainaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 单独创建对应的链ID的链上账户
     * Summary: 数字商品服务-管理服务-创建链上账户.
     *
     * @param CreateConfigChainaccountRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateConfigChainaccountResponse
     */
    public function createConfigChainaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConfigChainaccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.config.chainaccount.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 买家发起套餐交易
     * Summary: 数字商品服务-IP授权服务-发起套餐交易.
     *
     * @param StartIpPackagetradeRequest $request
     *
     * @return StartIpPackagetradeResponse
     */
    public function startIpPackagetrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startIpPackagetradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 买家发起套餐交易
     * Summary: 数字商品服务-IP授权服务-发起套餐交易.
     *
     * @param StartIpPackagetradeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return StartIpPackagetradeResponse
     */
    public function startIpPackagetradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartIpPackagetradeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.packagetrade.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 买家取消套餐交易
     * Summary: 数字商品服务-IP授权服务-取消套餐交易.
     *
     * @param CancelIpPackagetradeRequest $request
     *
     * @return CancelIpPackagetradeResponse
     */
    public function cancelIpPackagetrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelIpPackagetradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 买家取消套餐交易
     * Summary: 数字商品服务-IP授权服务-取消套餐交易.
     *
     * @param CancelIpPackagetradeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CancelIpPackagetradeResponse
     */
    public function cancelIpPackagetradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelIpPackagetradeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.packagetrade.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传套餐交易销售数据
     * Summary: 数字商品服务-IP授权服务-上传套餐数据.
     *
     * @param UploadIpPackagetradesalesRequest $request
     *
     * @return UploadIpPackagetradesalesResponse
     */
    public function uploadIpPackagetradesales($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadIpPackagetradesalesEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传套餐交易销售数据
     * Summary: 数字商品服务-IP授权服务-上传套餐数据.
     *
     * @param UploadIpPackagetradesalesRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UploadIpPackagetradesalesResponse
     */
    public function uploadIpPackagetradesalesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadIpPackagetradesalesResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.packagetradesales.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起授权交易
     * Summary: 数字商品服务-IP授权服务-发起授权交易.
     *
     * @param StartIpAuthtradeRequest $request
     *
     * @return StartIpAuthtradeResponse
     */
    public function startIpAuthtrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startIpAuthtradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起授权交易
     * Summary: 数字商品服务-IP授权服务-发起授权交易.
     *
     * @param StartIpAuthtradeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return StartIpAuthtradeResponse
     */
    public function startIpAuthtradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartIpAuthtradeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.authtrade.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传授权模式交易的销售数据
     * Summary: 数字商品服务-IP授权服务-上传销售数据.
     *
     * @param UploadIpAuthtradesalesRequest $request
     *
     * @return UploadIpAuthtradesalesResponse
     */
    public function uploadIpAuthtradesales($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadIpAuthtradesalesEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传授权模式交易的销售数据
     * Summary: 数字商品服务-IP授权服务-上传销售数据.
     *
     * @param UploadIpAuthtradesalesRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UploadIpAuthtradesalesResponse
     */
    public function uploadIpAuthtradesalesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadIpAuthtradesalesResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.authtradesales.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消授权模式下销售数据账单
     * Summary: 数字商品服务-IP授权服务-取消授权账单.
     *
     * @param CancelIpAuthtradebillRequest $request
     *
     * @return CancelIpAuthtradebillResponse
     */
    public function cancelIpAuthtradebill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelIpAuthtradebillEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消授权模式下销售数据账单
     * Summary: 数字商品服务-IP授权服务-取消授权账单.
     *
     * @param CancelIpAuthtradebillRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CancelIpAuthtradebillResponse
     */
    public function cancelIpAuthtradebillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelIpAuthtradebillResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.authtradebill.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询账单支付状态
     * Summary: 数字商品服务-IP授权服务-查询账单状态
     *
     * @param QueryIpBillstatusRequest $request
     *
     * @return QueryIpBillstatusResponse
     */
    public function queryIpBillstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpBillstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询账单支付状态
     * Summary: 数字商品服务-IP授权服务-查询账单状态
     *
     * @param QueryIpBillstatusRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryIpBillstatusResponse
     */
    public function queryIpBillstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpBillstatusResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.billstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询订单信息，模糊查询和分页查询
     * Summary: 数字商品服务-IP授权服务-查询订单列表.
     *
     * @param QueryIpOrderlistRequest $request
     *
     * @return QueryIpOrderlistResponse
     */
    public function queryIpOrderlist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpOrderlistEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询订单信息，模糊查询和分页查询
     * Summary: 数字商品服务-IP授权服务-查询订单列表.
     *
     * @param QueryIpOrderlistRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryIpOrderlistResponse
     */
    public function queryIpOrderlistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpOrderlistResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.orderlist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip商品创建
     * Summary: 数字商品服务-IP授权服务-ip创建.
     *
     * @param CreateIpGoodsRequest $request
     *
     * @return CreateIpGoodsResponse
     */
    public function createIpGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createIpGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: ip商品创建
     * Summary: 数字商品服务-IP授权服务-ip创建.
     *
     * @param CreateIpGoodsRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateIpGoodsResponse
     */
    public function createIpGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateIpGoodsResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.goods.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip的渠道信息添加
     * Summary: 数字商品服务-IP授权服务-渠道信息添加.
     *
     * @param AddIpChannelRequest $request
     *
     * @return AddIpChannelResponse
     */
    public function addIpChannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addIpChannelEx($request, $headers, $runtime);
    }

    /**
     * Description: ip的渠道信息添加
     * Summary: 数字商品服务-IP授权服务-渠道信息添加.
     *
     * @param AddIpChannelRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AddIpChannelResponse
     */
    public function addIpChannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddIpChannelResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.channel.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询订单详情，包含销售数据
     * Summary: 数字商品服务-IP授权服务-查询订单详情.
     *
     * @param QueryIpOrderinfoRequest $request
     *
     * @return QueryIpOrderinfoResponse
     */
    public function queryIpOrderinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpOrderinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询订单详情，包含销售数据
     * Summary: 数字商品服务-IP授权服务-查询订单详情.
     *
     * @param QueryIpOrderinfoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryIpOrderinfoResponse
     */
    public function queryIpOrderinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpOrderinfoResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.orderinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询ip简略信息
     * Summary: 数字商品服务-IP授权服务-批量查询.
     *
     * @param BatchqueryIpGoodsRequest $request
     *
     * @return BatchqueryIpGoodsResponse
     */
    public function batchqueryIpGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryIpGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询ip简略信息
     * Summary: 数字商品服务-IP授权服务-批量查询.
     *
     * @param BatchqueryIpGoodsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return BatchqueryIpGoodsResponse
     */
    public function batchqueryIpGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryIpGoodsResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.goods.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据渠道查询详细的信息
     * Summary: 数字商品服务-IP授权服务-查询渠道详细.
     *
     * @param QueryIpGoodsdetailwithchannelRequest $request
     *
     * @return QueryIpGoodsdetailwithchannelResponse
     */
    public function queryIpGoodsdetailwithchannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpGoodsdetailwithchannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据渠道查询详细的信息
     * Summary: 数字商品服务-IP授权服务-查询渠道详细.
     *
     * @param QueryIpGoodsdetailwithchannelRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryIpGoodsdetailwithchannelResponse
     */
    public function queryIpGoodsdetailwithchannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpGoodsdetailwithchannelResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.goodsdetailwithchannel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip的所有信息 包括渠道和sku
     * Summary: 数字商品服务-IP授权服务-查询所有信息.
     *
     * @param QueryIpDetailRequest $request
     *
     * @return QueryIpDetailResponse
     */
    public function queryIpDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: ip的所有信息 包括渠道和sku
     * Summary: 数字商品服务-IP授权服务-查询所有信息.
     *
     * @param QueryIpDetailRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryIpDetailResponse
     */
    public function queryIpDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpDetailResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip商品创建
     * Summary: 数字商品服务-IP授权服务-ip更新.
     *
     * @param UpdateIpGoodsRequest $request
     *
     * @return UpdateIpGoodsResponse
     */
    public function updateIpGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateIpGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: ip商品创建
     * Summary: 数字商品服务-IP授权服务-ip更新.
     *
     * @param UpdateIpGoodsRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateIpGoodsResponse
     */
    public function updateIpGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateIpGoodsResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.goods.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip的渠道信息修改
     * Summary: 数字商品服务-IP授权服务-渠道信息更新.
     *
     * @param UpdateIpChannelRequest $request
     *
     * @return UpdateIpChannelResponse
     */
    public function updateIpChannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateIpChannelEx($request, $headers, $runtime);
    }

    /**
     * Description: ip的渠道信息修改
     * Summary: 数字商品服务-IP授权服务-渠道信息更新.
     *
     * @param UpdateIpChannelRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateIpChannelResponse
     */
    public function updateIpChannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateIpChannelResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.channel.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip上线
     * Summary: 数字商品服务-IP授权服务-ip上线
     *
     * @param OnlineIpRequest $request
     *
     * @return OnlineIpResponse
     */
    public function onlineIp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->onlineIpEx($request, $headers, $runtime);
    }

    /**
     * Description: ip上线
     * Summary: 数字商品服务-IP授权服务-ip上线
     *
     * @param OnlineIpRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return OnlineIpResponse
     */
    public function onlineIpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OnlineIpResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.online', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip下线
     * Summary: 数字商品服务-IP授权服务-下线
     *
     * @param OfflineIpRequest $request
     *
     * @return OfflineIpResponse
     */
    public function offlineIp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineIpEx($request, $headers, $runtime);
    }

    /**
     * Description: ip下线
     * Summary: 数字商品服务-IP授权服务-下线
     *
     * @param OfflineIpRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return OfflineIpResponse
     */
    public function offlineIpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineIpResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
     * Summary: 数字商品服务-IP授权交易服务-账户创建.
     *
     * @param CreateIpAccountRequest $request
     *
     * @return CreateIpAccountResponse
     */
    public function createIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
     * Summary: 数字商品服务-IP授权交易服务-账户创建.
     *
     * @param CreateIpAccountRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateIpAccountResponse
     */
    public function createIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
     * Summary: 数字商品服务-IP授权交易服务-账户冻结.
     *
     * @param FreezeIpAccountRequest $request
     *
     * @return FreezeIpAccountResponse
     */
    public function freezeIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->freezeIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
     * Summary: 数字商品服务-IP授权交易服务-账户冻结.
     *
     * @param FreezeIpAccountRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return FreezeIpAccountResponse
     */
    public function freezeIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FreezeIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.freeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
     * Summary: 数字商品服务-IP授权交易服务-账户解冻.
     *
     * @param UnfreezeIpAccountRequest $request
     *
     * @return UnfreezeIpAccountResponse
     */
    public function unfreezeIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unfreezeIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
     * Summary: 数字商品服务-IP授权交易服务-账户解冻.
     *
     * @param UnfreezeIpAccountRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UnfreezeIpAccountResponse
     */
    public function unfreezeIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnfreezeIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.unfreeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户查询。
     * Summary: 数字商品服务-IP授权交易服务-账户查询.
     *
     * @param QueryIpAccountRequest $request
     *
     * @return QueryIpAccountResponse
     */
    public function queryIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户查询。
     * Summary: 数字商品服务-IP授权交易服务-账户查询.
     *
     * @param QueryIpAccountRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryIpAccountResponse
     */
    public function queryIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
     * Summary: 数字商品-IP授权交易服务-版权方申请.
     *
     * @param ApplyIpAccountRequest $request
     *
     * @return ApplyIpAccountResponse
     */
    public function applyIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
     * Summary: 数字商品-IP授权交易服务-版权方申请.
     *
     * @param ApplyIpAccountRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ApplyIpAccountResponse
     */
    public function applyIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
     * Summary: 数字商品-IP授权交易-申请进度查询.
     *
     * @param CheckIpAccountRequest $request
     *
     * @return CheckIpAccountResponse
     */
    public function checkIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
     * Summary: 数字商品-IP授权交易-申请进度查询.
     *
     * @param CheckIpAccountRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CheckIpAccountResponse
     */
    public function checkIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip商品审批
     * Summary: ip商品审批.
     *
     * @param ConfirmIpGoodsRequest $request
     *
     * @return ConfirmIpGoodsResponse
     */
    public function confirmIpGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmIpGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: ip商品审批
     * Summary: ip商品审批.
     *
     * @param ConfirmIpGoodsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ConfirmIpGoodsResponse
     */
    public function confirmIpGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmIpGoodsResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.goods.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip信息批量查询--给运营使用
     * 查询审批信息
     * Summary: ip审批信息批量查询--给运营使用.
     *
     * @param BatchqueryIpApprovalRequest $request
     *
     * @return BatchqueryIpApprovalResponse
     */
    public function batchqueryIpApproval($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryIpApprovalEx($request, $headers, $runtime);
    }

    /**
     * Description: ip信息批量查询--给运营使用
     * 查询审批信息
     * Summary: ip审批信息批量查询--给运营使用.
     *
     * @param BatchqueryIpApprovalRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return BatchqueryIpApprovalResponse
     */
    public function batchqueryIpApprovalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryIpApprovalResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.approval.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字商品-IP授权交易-运营审核确认
     * Summary: 数字商品-IP授权交易-运营审核确认.
     *
     * @param ConfirmIpAccountRequest $request
     *
     * @return ConfirmIpAccountResponse
     */
    public function confirmIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字商品-IP授权交易-运营审核确认
     * Summary: 数字商品-IP授权交易-运营审核确认.
     *
     * @param ConfirmIpAccountRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ConfirmIpAccountResponse
     */
    public function confirmIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字商品-IP授权交易-运营审核拒绝
     * Summary: 数字商品-IP授权交易-运营审核拒绝.
     *
     * @param RefuseIpAccountRequest $request
     *
     * @return RefuseIpAccountResponse
     */
    public function refuseIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字商品-IP授权交易-运营审核拒绝
     * Summary: 数字商品-IP授权交易-运营审核拒绝.
     *
     * @param RefuseIpAccountRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return RefuseIpAccountResponse
     */
    public function refuseIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字商品-IP授权交易服务-版权方申请信息查询: 查询版权方当前的申请信息
     * Summary: 数字商品-IP授权交易服务-申请信息查询.
     *
     * @param PullIpAccountRequest $request
     *
     * @return PullIpAccountResponse
     */
    public function pullIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字商品-IP授权交易服务-版权方申请信息查询: 查询版权方当前的申请信息
     * Summary: 数字商品-IP授权交易服务-申请信息查询.
     *
     * @param PullIpAccountRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return PullIpAccountResponse
     */
    public function pullIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字商品-IP授权交易服务-MCC列表查询
     * Summary: 数字商品-IP授权交易服务-MCC查询.
     *
     * @param QueryIpMccRequest $request
     *
     * @return QueryIpMccResponse
     */
    public function queryIpMcc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpMccEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字商品-IP授权交易服务-MCC列表查询
     * Summary: 数字商品-IP授权交易服务-MCC查询.
     *
     * @param QueryIpMccRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryIpMccResponse
     */
    public function queryIpMccEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpMccResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.mcc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询ip type和受众人群
     * Summary: 查询ip type和受众人群.
     *
     * @param QueryIpTypeRequest $request
     *
     * @return QueryIpTypeResponse
     */
    public function queryIpType($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIpTypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询ip type和受众人群
     * Summary: 查询ip type和受众人群.
     *
     * @param QueryIpTypeRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryIpTypeResponse
     */
    public function queryIpTypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIpTypeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.type.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ip审批信息批量查询（带上渠道信息）
     * Summary: ip审批信息批量查询（带上渠道信息）.
     *
     * @param BatchqueryIpApprovalandchannelRequest $request
     *
     * @return BatchqueryIpApprovalandchannelResponse
     */
    public function batchqueryIpApprovalandchannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryIpApprovalandchannelEx($request, $headers, $runtime);
    }

    /**
     * Description: ip审批信息批量查询（带上渠道信息）
     * Summary: ip审批信息批量查询（带上渠道信息）.
     *
     * @param BatchqueryIpApprovalandchannelRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return BatchqueryIpApprovalandchannelResponse
     */
    public function batchqueryIpApprovalandchannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryIpApprovalandchannelResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.approvalandchannel.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字商品-IP授权交易服务-批量查询商家信息
     * Summary: 数字商品-IP授权服务-批量查询商家信息.
     *
     * @param BatchqueryIpAccountRequest $request
     *
     * @return BatchqueryIpAccountResponse
     */
    public function batchqueryIpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryIpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字商品-IP授权交易服务-批量查询商家信息
     * Summary: 数字商品-IP授权服务-批量查询商家信息.
     *
     * @param BatchqueryIpAccountRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return BatchqueryIpAccountResponse
     */
    public function batchqueryIpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryIpAccountResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.account.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字商品-IP授权-版权方申请批量查询
     * Summary: 数字商品-IP授权-版权方申请批量查询.
     *
     * @param BatchqueryIpSellerRequest $request
     *
     * @return BatchqueryIpSellerResponse
     */
    public function batchqueryIpSeller($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryIpSellerEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字商品-IP授权-版权方申请批量查询
     * Summary: 数字商品-IP授权-版权方申请批量查询.
     *
     * @param BatchqueryIpSellerRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return BatchqueryIpSellerResponse
     */
    public function batchqueryIpSellerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryIpSellerResponse::fromMap($this->doRequest('1.0', 'baas.antdao.ip.seller.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息.
     *
     * @param QueryBlockanalysisBlockRequest $request
     *
     * @return QueryBlockanalysisBlockResponse
     */
    public function queryBlockanalysisBlock($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisBlockEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息.
     *
     * @param QueryBlockanalysisBlockRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryBlockanalysisBlockResponse
     */
    public function queryBlockanalysisBlockEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisBlockResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.block.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度.
     *
     * @param QueryBlockanalysisLastblocknumberRequest $request
     *
     * @return QueryBlockanalysisLastblocknumberResponse
     */
    public function queryBlockanalysisLastblocknumber($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisLastblocknumberEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度.
     *
     * @param QueryBlockanalysisLastblocknumberRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryBlockanalysisLastblocknumberResponse
     */
    public function queryBlockanalysisLastblocknumberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisLastblocknumberResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.lastblocknumber.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取公开的或者已授权的权益商品信息
     * Summary: 数字商品服务-拉块服务-获取已授权商品
     *
     * @param QueryBlockanalysisOpenedequitiesRequest $request
     *
     * @return QueryBlockanalysisOpenedequitiesResponse
     */
    public function queryBlockanalysisOpenedequities($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisOpenedequitiesEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取公开的或者已授权的权益商品信息
     * Summary: 数字商品服务-拉块服务-获取已授权商品
     *
     * @param QueryBlockanalysisOpenedequitiesRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryBlockanalysisOpenedequitiesResponse
     */
    public function queryBlockanalysisOpenedequitiesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisOpenedequitiesResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.openedequities.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已设置过用户价格的有效权益商品信息
     * Summary: 数字商品服务-拉块服务-已设用户价格商品
     *
     * @param QueryBlockanalysisUserpriceupdatedequitiesRequest $request
     *
     * @return QueryBlockanalysisUserpriceupdatedequitiesResponse
     */
    public function queryBlockanalysisUserpriceupdatedequities($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisUserpriceupdatedequitiesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已设置过用户价格的有效权益商品信息
     * Summary: 数字商品服务-拉块服务-已设用户价格商品
     *
     * @param QueryBlockanalysisUserpriceupdatedequitiesRequest $request
     * @param string[]                                          $headers
     * @param RuntimeOptions                                    $runtime
     *
     * @return QueryBlockanalysisUserpriceupdatedequitiesResponse
     */
    public function queryBlockanalysisUserpriceupdatedequitiesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisUserpriceupdatedequitiesResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.userpriceupdatedequities.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商户的可提现资产价值(单位:分)
     * Summary: 数字商品服务-拉块服务-查询可提现资产.
     *
     * @param QueryBlockanalysisUnwriteoffvalueRequest $request
     *
     * @return QueryBlockanalysisUnwriteoffvalueResponse
     */
    public function queryBlockanalysisUnwriteoffvalue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisUnwriteoffvalueEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商户的可提现资产价值(单位:分)
     * Summary: 数字商品服务-拉块服务-查询可提现资产.
     *
     * @param QueryBlockanalysisUnwriteoffvalueRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryBlockanalysisUnwriteoffvalueResponse
     */
    public function queryBlockanalysisUnwriteoffvalueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisUnwriteoffvalueResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.unwriteoffvalue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-拉块服务-设置代理权限.
     *
     * @param UpdateBlockanalysisDelegaterelationRequest $request
     *
     * @return UpdateBlockanalysisDelegaterelationResponse
     */
    public function updateBlockanalysisDelegaterelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBlockanalysisDelegaterelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-拉块服务-设置代理权限.
     *
     * @param UpdateBlockanalysisDelegaterelationRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return UpdateBlockanalysisDelegaterelationResponse
     */
    public function updateBlockanalysisDelegaterelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBlockanalysisDelegaterelationResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.delegaterelation.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置接口访问白名单。
     * Summary: 数字商品服务-拉块服务-设置访问白名单.
     *
     * @param UpdateBlockanalysisWhitelistRequest $request
     *
     * @return UpdateBlockanalysisWhitelistResponse
     */
    public function updateBlockanalysisWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBlockanalysisWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置接口访问白名单。
     * Summary: 数字商品服务-拉块服务-设置访问白名单.
     *
     * @param UpdateBlockanalysisWhitelistRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateBlockanalysisWhitelistResponse
     */
    public function updateBlockanalysisWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBlockanalysisWhitelistResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.whitelist.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-拉块服务-代理权限查询.
     *
     * @param QueryBlockanalysisDelegaterelationRequest $request
     *
     * @return QueryBlockanalysisDelegaterelationResponse
     */
    public function queryBlockanalysisDelegaterelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisDelegaterelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-拉块服务-代理权限查询.
     *
     * @param QueryBlockanalysisDelegaterelationRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryBlockanalysisDelegaterelationResponse
     */
    public function queryBlockanalysisDelegaterelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisDelegaterelationResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.delegaterelation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单.
     *
     * @param QueryBlockanalysisWhitelistRequest $request
     *
     * @return QueryBlockanalysisWhitelistResponse
     */
    public function queryBlockanalysisWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单.
     *
     * @param QueryBlockanalysisWhitelistRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryBlockanalysisWhitelistResponse
     */
    public function queryBlockanalysisWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisWhitelistResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.whitelist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据交易hash获取交易信息
     * Summary: 数字商品服务-拉块服务-获取交易信息.
     *
     * @param QueryBlockanalysisTransactionRequest $request
     *
     * @return QueryBlockanalysisTransactionResponse
     */
    public function queryBlockanalysisTransaction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisTransactionEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据交易hash获取交易信息
     * Summary: 数字商品服务-拉块服务-获取交易信息.
     *
     * @param QueryBlockanalysisTransactionRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryBlockanalysisTransactionResponse
     */
    public function queryBlockanalysisTransactionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisTransactionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.transaction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取商品的授权信息列表(一客一价信息)
     * Summary: 数字商品服务-拉块服务-获取商品授权信息.
     *
     * @param QueryBlockanalysisEquityauthlistRequest $request
     *
     * @return QueryBlockanalysisEquityauthlistResponse
     */
    public function queryBlockanalysisEquityauthlist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisEquityauthlistEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取商品的授权信息列表(一客一价信息)
     * Summary: 数字商品服务-拉块服务-获取商品授权信息.
     *
     * @param QueryBlockanalysisEquityauthlistRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryBlockanalysisEquityauthlistResponse
     */
    public function queryBlockanalysisEquityauthlistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisEquityauthlistResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.equityauthlist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
     * Summary: 数字商品服务-拉块服务-获取下个相关区块.
     *
     * @param QueryBlockanalysisNextblockRequest $request
     *
     * @return QueryBlockanalysisNextblockResponse
     */
    public function queryBlockanalysisNextblock($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBlockanalysisNextblockEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
     * Summary: 数字商品服务-拉块服务-获取下个相关区块.
     *
     * @param QueryBlockanalysisNextblockRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryBlockanalysisNextblockResponse
     */
    public function queryBlockanalysisNextblockEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBlockanalysisNextblockResponse::fromMap($this->doRequest('1.0', 'baas.antdao.blockanalysis.nextblock.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可订购的SKU列表查询
     * Summary: 数字商品服务-商品服务-商品列表查询.
     *
     * @param QueryMypointsSkuRequest $request
     *
     * @return QueryMypointsSkuResponse
     */
    public function queryMypointsSku($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMypointsSkuEx($request, $headers, $runtime);
    }

    /**
     * Description: 可订购的SKU列表查询
     * Summary: 数字商品服务-商品服务-商品列表查询.
     *
     * @param QueryMypointsSkuRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryMypointsSkuResponse
     */
    public function queryMypointsSkuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMypointsSkuResponse::fromMap($this->doRequest('1.0', 'baas.antdao.mypoints.sku.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商户的积分库和预算库
     * Summary: 数字商品服务-商品服务-积分预算库查询.
     *
     * @param QueryMypointsMerchantbalanceRequest $request
     *
     * @return QueryMypointsMerchantbalanceResponse
     */
    public function queryMypointsMerchantbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMypointsMerchantbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商户的积分库和预算库
     * Summary: 数字商品服务-商品服务-积分预算库查询.
     *
     * @param QueryMypointsMerchantbalanceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryMypointsMerchantbalanceResponse
     */
    public function queryMypointsMerchantbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMypointsMerchantbalanceResponse::fromMap($this->doRequest('1.0', 'baas.antdao.mypoints.merchantbalance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 预下单商品
     * Summary: 数字商品服务-商品服务-商品预下单.
     *
     * @param ExecMypointsPreorderskuRequest $request
     *
     * @return ExecMypointsPreorderskuResponse
     */
    public function execMypointsPreordersku($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execMypointsPreorderskuEx($request, $headers, $runtime);
    }

    /**
     * Description: 预下单商品
     * Summary: 数字商品服务-商品服务-商品预下单.
     *
     * @param ExecMypointsPreorderskuRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ExecMypointsPreorderskuResponse
     */
    public function execMypointsPreorderskuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecMypointsPreorderskuResponse::fromMap($this->doRequest('1.0', 'baas.antdao.mypoints.preordersku.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品下单
     * Summary: 数字商品服务-商品服务-商品下单.
     *
     * @param ExecMypointsOrderskuRequest $request
     *
     * @return ExecMypointsOrderskuResponse
     */
    public function execMypointsOrdersku($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execMypointsOrderskuEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品下单
     * Summary: 数字商品服务-商品服务-商品下单.
     *
     * @param ExecMypointsOrderskuRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExecMypointsOrderskuResponse
     */
    public function execMypointsOrderskuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecMypointsOrderskuResponse::fromMap($this->doRequest('1.0', 'baas.antdao.mypoints.ordersku.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据商品ID，查询批量购买的费率
     * Summary: 数字商品服务-商品服务-商品费率查询.
     *
     * @param QueryMypointsSkufeeRequest $request
     *
     * @return QueryMypointsSkufeeResponse
     */
    public function queryMypointsSkufee($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMypointsSkufeeEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据商品ID，查询批量购买的费率
     * Summary: 数字商品服务-商品服务-商品费率查询.
     *
     * @param QueryMypointsSkufeeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryMypointsSkufeeResponse
     */
    public function queryMypointsSkufeeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMypointsSkufeeResponse::fromMap($this->doRequest('1.0', 'baas.antdao.mypoints.skufee.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询集分宝SKU的预下单流水记录
     * Summary: 数字商品服务-商品服务-预下单流水查询.
     *
     * @param QueryMypointsPreorderinstructionRequest $request
     *
     * @return QueryMypointsPreorderinstructionResponse
     */
    public function queryMypointsPreorderinstruction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMypointsPreorderinstructionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询集分宝SKU的预下单流水记录
     * Summary: 数字商品服务-商品服务-预下单流水查询.
     *
     * @param QueryMypointsPreorderinstructionRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryMypointsPreorderinstructionResponse
     */
    public function queryMypointsPreorderinstructionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMypointsPreorderinstructionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.mypoints.preorderinstruction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询下单流水信息
     * Summary: 数字商品服务-商品服务-商品下单流水查询.
     *
     * @param QueryMypointsOrderinstructionRequest $request
     *
     * @return QueryMypointsOrderinstructionResponse
     */
    public function queryMypointsOrderinstruction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMypointsOrderinstructionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询下单流水信息
     * Summary: 数字商品服务-商品服务-商品下单流水查询.
     *
     * @param QueryMypointsOrderinstructionRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryMypointsOrderinstructionResponse
     */
    public function queryMypointsOrderinstructionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMypointsOrderinstructionResponse::fromMap($this->doRequest('1.0', 'baas.antdao.mypoints.orderinstruction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
