<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;

use AntChain\SHUZIWULIU\Models\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticPlatformDidRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticPlatformDidResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticAgentDidRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticAgentDidResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticConsignorDisRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticConsignorDisResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDriverDisRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDriverDisResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargoOrderRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargoOrderResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargoPayRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargoPayResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticWaybillOrderRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticWaybillOrderResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticWaybillPayRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticWaybillPayResponse;
use AntChain\SHUZIWULIU\Models\ImportDigitalLogisticWaybillLocationRequest;
use AntChain\SHUZIWULIU\Models\ImportDigitalLogisticWaybillLocationResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticWaybillBillRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticWaybillBillResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticWaybillStatusRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticWaybillStatusResponse;
use AntChain\SHUZIWULIU\Models\FinishDigitalLogisticWaybillOrderRequest;
use AntChain\SHUZIWULIU\Models\FinishDigitalLogisticWaybillOrderResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargoPayorderRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargoPayorderResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticWaybillOrderRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticWaybillOrderResponse;
use AntChain\SHUZIWULIU\Models\CloseDigitalLogisticWaybillOrderRequest;
use AntChain\SHUZIWULIU\Models\CloseDigitalLogisticWaybillOrderResponse;
use AntChain\SHUZIWULIU\Models\FinishDigitalLogisticFinanceWaybillRequest;
use AntChain\SHUZIWULIU\Models\FinishDigitalLogisticFinanceWaybillResponse;
use AntChain\SHUZIWULIU\Models\FinishDigitalLogisticFinanceTransportRequest;
use AntChain\SHUZIWULIU\Models\FinishDigitalLogisticFinanceTransportResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticFinanceWaybillRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticFinanceWaybillResponse;
use AntChain\SHUZIWULIU\Models\StartDigitalLogisticFinanceWaybillRequest;
use AntChain\SHUZIWULIU\Models\StartDigitalLogisticFinanceWaybillResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCaptainDisRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCaptainDisResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargowaybillBillRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargowaybillBillResponse;
use AntChain\SHUZIWULIU\Models\ConfirmDigitalLogisticCargowaybillBillRequest;
use AntChain\SHUZIWULIU\Models\ConfirmDigitalLogisticCargowaybillBillResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargowaybillBillsettleRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCargowaybillBillsettleResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticWaybillorderPlatformdidRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticWaybillorderPlatformdidResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticCargowaybillBillRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticCargowaybillBillResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDisDidRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDisDidResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticTransportContractRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticTransportContractResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticTransportRouteRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticTransportRouteResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticTransportWaybillRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticTransportWaybillResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticWaybillActionRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticWaybillActionResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticTransportWaybillRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticTransportWaybillResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticTransportReceiptRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticTransportReceiptResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticBillReceivablebillRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticBillReceivablebillResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticReceivablebillStatusRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticReceivablebillStatusResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticBillReceivablebillRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticBillReceivablebillResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticHighwayInvoiceRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticHighwayInvoiceResponse;
use AntChain\SHUZIWULIU\Models\OpenDigitalLogisticCreditDriverRequest;
use AntChain\SHUZIWULIU\Models\OpenDigitalLogisticCreditDriverResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditDriverRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditDriverResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditConsignorRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditConsignorResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditBalanceRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditBalanceResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditIssueRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditIssueResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuebatchstatusRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuebatchstatusResponse;
use AntChain\SHUZIWULIU\Models\CancelDigitalLogisticCreditIssuebatchRequest;
use AntChain\SHUZIWULIU\Models\CancelDigitalLogisticCreditIssuebatchResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuebyidRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuebyidResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuebytimeRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuebytimeResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditUserissueRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditUserissueResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditStatementRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditStatementResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCreditIssuetransferRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCreditIssuetransferResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuetransferRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuetransferResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCreditIssuefinanceRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCreditIssuefinanceResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuefinanceRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuefinanceResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuereceivableRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuereceivableResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssueamountRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssueamountResponse;
use AntChain\SHUZIWULIU\Models\CallbackDigitalLogisticCreditCommonRequest;
use AntChain\SHUZIWULIU\Models\CallbackDigitalLogisticCreditCommonResponse;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticCreditIssueclearRequest;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticCreditIssueclearResponse;
use AntChain\SHUZIWULIU\Models\SendDigitalLogisticCreditProxyRequest;
use AntChain\SHUZIWULIU\Models\SendDigitalLogisticCreditProxyResponse;
use AntChain\SHUZIWULIU\Models\CheckDigitalLogisticCreditWaybillRequest;
use AntChain\SHUZIWULIU\Models\CheckDigitalLogisticCreditWaybillResponse;
use AntChain\SHUZIWULIU\Models\ReopenDigitalLogisticCreditDriverRequest;
use AntChain\SHUZIWULIU\Models\ReopenDigitalLogisticCreditDriverResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditAuthorizationRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditAuthorizationResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditConfirmRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditConfirmResponse;
use AntChain\SHUZIWULIU\Models\BatchcreateDigitalLogisticCreditmodeIssueRequest;
use AntChain\SHUZIWULIU\Models\BatchcreateDigitalLogisticCreditmodeIssueResponse;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticCreditmodeIssueclearRequest;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticCreditmodeIssueclearResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditIssuebysaasRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditIssuebysaasResponse;
use AntChain\SHUZIWULIU\Models\CancelDigitalLogisticCreditIssuebatchbysaasRequest;
use AntChain\SHUZIWULIU\Models\CancelDigitalLogisticCreditIssuebatchbysaasResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditBalancebysaasRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditBalancebysaasResponse;
use AntChain\SHUZIWULIU\Models\GetDigitalLogisticCreditIssuescpticketRequest;
use AntChain\SHUZIWULIU\Models\GetDigitalLogisticCreditIssuescpticketResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuescpticketresultRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditIssuescpticketresultResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditAplusissueRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditAplusissueResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditCreditamountRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditCreditamountResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCreditCommonsignRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticCreditCommonsignResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditCommonsignRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticCreditCommonsignResponse;
use AntChain\SHUZIWULIU\Models\BatchcreateDigitalLogisticCreditIssueRequest;
use AntChain\SHUZIWULIU\Models\BatchcreateDigitalLogisticCreditIssueResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditIssuebatchRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticCreditIssuebatchResponse;
use AntChain\SHUZIWULIU\Models\GetDigitalLogisticIssueTransferfileRequest;
use AntChain\SHUZIWULIU\Models\GetDigitalLogisticIssueTransferfileResponse;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse;
use AntChain\SHUZIWULIU\Models\CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest;
use AntChain\SHUZIWULIU\Models\CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse;
use AntChain\SHUZIWULIU\Models\PushDigitalLogisticInsurancenotifyClaimRequest;
use AntChain\SHUZIWULIU\Models\PushDigitalLogisticInsurancenotifyClaimResponse;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticInsuranceFileurlRequest;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticInsuranceFileurlResponse;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticInsurancepolicyUniversalRequest;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticInsurancepolicyUniversalResponse;
use AntChain\SHUZIWULIU\Models\CancelDigitalLogisticInsurancepolicyUniversalRequest;
use AntChain\SHUZIWULIU\Models\CancelDigitalLogisticInsurancepolicyUniversalResponse;
use AntChain\SHUZIWULIU\Models\PushDigitalLogisticInsuranceOlpRequest;
use AntChain\SHUZIWULIU\Models\PushDigitalLogisticInsuranceOlpResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticInsuranceOlpRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticInsuranceOlpResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfPaymentRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfPaymentResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfIouRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfIouResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfQuotaRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfQuotaResponse;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticPfWaybillfinancingRequest;
use AntChain\SHUZIWULIU\Models\ApplyDigitalLogisticPfWaybillfinancingResponse;
use AntChain\SHUZIWULIU\Models\PushDigitalLogisticPfPledgeRequest;
use AntChain\SHUZIWULIU\Models\PushDigitalLogisticPfPledgeResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfPledgeRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfPledgeResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfFinancingRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticPfFinancingResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDidForwarderRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDidForwarderResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDidSaasplatformRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDidSaasplatformResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDidClientRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDidClientResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizOrderRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizOrderResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizConsignorderRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizConsignorderResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizGoodsRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizGoodsResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizSonotifyRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizSonotifyResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizBookingorderRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizBookingorderResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizContainerRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizContainerResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizCustomsorderRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizCustomsorderResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizVehicleRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizVehicleResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizMasterblRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizMasterblResponse;
use AntChain\SHUZIWULIU\Models\FinishDigitalLogisticBizAuditRequest;
use AntChain\SHUZIWULIU\Models\FinishDigitalLogisticBizAuditResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizHouseblRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizHouseblResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticBillPaybillorderRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticBillPaybillorderResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticBillReceiptbillorderRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticBillReceiptbillorderResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBillPaybilltariffRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBillPaybilltariffResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBillReceiptbilltariffRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBillReceiptbilltariffResponse;
use AntChain\SHUZIWULIU\Models\VerifyDigitalLogisticBillPaybillRequest;
use AntChain\SHUZIWULIU\Models\VerifyDigitalLogisticBillPaybillResponse;
use AntChain\SHUZIWULIU\Models\VerifyDigitalLogisticBillReceiptbillorderRequest;
use AntChain\SHUZIWULIU\Models\VerifyDigitalLogisticBillReceiptbillorderResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticBillPaybillorderRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticBillPaybillorderResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticBillReceiptbillorderRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticBillReceiptbillorderResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBillPayinvoiceRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBillPayinvoiceResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBillReceiptinvoiceRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBillReceiptinvoiceResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticBizFinancingRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticBizFinancingResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticBizOrderRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticBizOrderResponse;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDidCarrierRequest;
use AntChain\SHUZIWULIU\Models\CreateDigitalLogisticDidCarrierResponse;
use AntChain\SHUZIWULIU\Models\AuthDigitalLogisticSysForwarderRequest;
use AntChain\SHUZIWULIU\Models\AuthDigitalLogisticSysForwarderResponse;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticBizMasterblRequest;
use AntChain\SHUZIWULIU\Models\QueryDigitalLogisticBizMasterblResponse;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizPayinvoicefileRequest;
use AntChain\SHUZIWULIU\Models\SaveDigitalLogisticBizPayinvoicefileResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticShippingEblRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticShippingEblResponse;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticShippingEblbatchRequest;
use AntChain\SHUZIWULIU\Models\UploadDigitalLogisticShippingEblbatchResponse;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticShippingEblbatchstatusRequest;
use AntChain\SHUZIWULIU\Models\UpdateDigitalLogisticShippingEblbatchstatusResponse;

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
        while (Tea::allowRetry(@$_runtime["retry"], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime(@$_runtime["backoff"], $_retryTimes);
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
                    "sdkVersion" => "Tea-SDK-20201209"
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
                $resp = Utils::assertAsMap(@$res["response"]);
                if (UtilClient::hasError($res)) {
                    throw new TeaError([
                        "message" => @$resp["result_msg"],
                        "data" => $resp,
                        "code" => @$resp["result_code"]
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
     * Description: 无车承运平台为自身申请DIS分布式数字身份
     * Summary: 无车承运平台DIS分布式数字身份申请
     * @param CreateDigitalLogisticPlatformDidRequest $request
     * @return CreateDigitalLogisticPlatformDidResponse
     */
    public function createDigitalLogisticPlatformDid($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticPlatformDidEx($request, $runtime);
    }

    /**
     * Description: 无车承运平台为自身申请DIS分布式数字身份
     * Summary: 无车承运平台DIS分布式数字身份申请
     * @param CreateDigitalLogisticPlatformDidRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticPlatformDidResponse
     */
    public function createDigitalLogisticPlatformDidEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticPlatformDidResponse::fromMap($this->doRequest("1.0", "digital.logistic.platform.did.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
     * Summary: 无车承运平台DIS分布式数字身份代理申请
     * @param CreateDigitalLogisticAgentDidRequest $request
     * @return CreateDigitalLogisticAgentDidResponse
     */
    public function createDigitalLogisticAgentDid($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticAgentDidEx($request, $runtime);
    }

    /**
     * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
     * Summary: 无车承运平台DIS分布式数字身份代理申请
     * @param CreateDigitalLogisticAgentDidRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticAgentDidResponse
     */
    public function createDigitalLogisticAgentDidEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticAgentDidResponse::fromMap($this->doRequest("1.0", "digital.logistic.agent.did.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 货主DIS分布式数字身份申请
     * @param CreateDigitalLogisticConsignorDisRequest $request
     * @return CreateDigitalLogisticConsignorDisResponse
     */
    public function createDigitalLogisticConsignorDis($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticConsignorDisEx($request, $runtime);
    }

    /**
     * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 货主DIS分布式数字身份申请
     * @param CreateDigitalLogisticConsignorDisRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticConsignorDisResponse
     */
    public function createDigitalLogisticConsignorDisEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticConsignorDisResponse::fromMap($this->doRequest("1.0", "digital.logistic.consignor.dis.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 司机DIS分布式数字身份申请
     * @param CreateDigitalLogisticDriverDisRequest $request
     * @return CreateDigitalLogisticDriverDisResponse
     */
    public function createDigitalLogisticDriverDis($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticDriverDisEx($request, $runtime);
    }

    /**
     * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 司机DIS分布式数字身份申请
     * @param CreateDigitalLogisticDriverDisRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticDriverDisResponse
     */
    public function createDigitalLogisticDriverDisEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticDriverDisResponse::fromMap($this->doRequest("1.0", "digital.logistic.driver.dis.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 货源订单创建，货主发货给平台时的订单信息
     * Summary: 货源订单创建
     * @param CreateDigitalLogisticCargoOrderRequest $request
     * @return CreateDigitalLogisticCargoOrderResponse
     */
    public function createDigitalLogisticCargoOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticCargoOrderEx($request, $runtime);
    }

    /**
     * Description: 货源订单创建，货主发货给平台时的订单信息
     * Summary: 货源订单创建
     * @param CreateDigitalLogisticCargoOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticCargoOrderResponse
     */
    public function createDigitalLogisticCargoOrderEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticCargoOrderResponse::fromMap($this->doRequest("1.0", "digital.logistic.cargo.order.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建
     * @param CreateDigitalLogisticCargoPayRequest $request
     * @return CreateDigitalLogisticCargoPayResponse
     */
    public function createDigitalLogisticCargoPay($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticCargoPayEx($request, $runtime);
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建
     * @param CreateDigitalLogisticCargoPayRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticCargoPayResponse
     */
    public function createDigitalLogisticCargoPayEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticCargoPayResponse::fromMap($this->doRequest("1.0", "digital.logistic.cargo.pay.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 物流平台将运单指派给下游（承运商、司机）时产生
     * Summary: 运单创建
     * @param CreateDigitalLogisticWaybillOrderRequest $request
     * @return CreateDigitalLogisticWaybillOrderResponse
     */
    public function createDigitalLogisticWaybillOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticWaybillOrderEx($request, $runtime);
    }

    /**
     * Description: 物流平台将运单指派给下游（承运商、司机）时产生
     * Summary: 运单创建
     * @param CreateDigitalLogisticWaybillOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticWaybillOrderResponse
     */
    public function createDigitalLogisticWaybillOrderEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticWaybillOrderResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybill.order.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 创建物流支付订单，运单需已存在并且未结束
     * Summary: 运单支付订单创建
     * @param CreateDigitalLogisticWaybillPayRequest $request
     * @return CreateDigitalLogisticWaybillPayResponse
     */
    public function createDigitalLogisticWaybillPay($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticWaybillPayEx($request, $runtime);
    }

    /**
     * Description: 创建物流支付订单，运单需已存在并且未结束
     * Summary: 运单支付订单创建
     * @param CreateDigitalLogisticWaybillPayRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticWaybillPayResponse
     */
    public function createDigitalLogisticWaybillPayEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticWaybillPayResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybill.pay.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
     * Summary: 第三方位置信息上报
     * @param ImportDigitalLogisticWaybillLocationRequest $request
     * @return ImportDigitalLogisticWaybillLocationResponse
     */
    public function importDigitalLogisticWaybillLocation($request){
        $runtime = new RuntimeOptions([]);
        return $this->importDigitalLogisticWaybillLocationEx($request, $runtime);
    }

    /**
     * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
     * Summary: 第三方位置信息上报
     * @param ImportDigitalLogisticWaybillLocationRequest $request
     * @param RuntimeOptions $runtime
     * @return ImportDigitalLogisticWaybillLocationResponse
     */
    public function importDigitalLogisticWaybillLocationEx($request, $runtime){
        Utils::validateModel($request);
        return ImportDigitalLogisticWaybillLocationResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybill.location.import", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 发票订单创建
     * Summary: 发票订单创建
     * @param CreateDigitalLogisticWaybillBillRequest $request
     * @return CreateDigitalLogisticWaybillBillResponse
     */
    public function createDigitalLogisticWaybillBill($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticWaybillBillEx($request, $runtime);
    }

    /**
     * Description: 发票订单创建
     * Summary: 发票订单创建
     * @param CreateDigitalLogisticWaybillBillRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticWaybillBillResponse
     */
    public function createDigitalLogisticWaybillBillEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticWaybillBillResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybill.bill.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 查询物流运单状态
     * Summary: 查询运单状态
     * @param QueryDigitalLogisticWaybillStatusRequest $request
     * @return QueryDigitalLogisticWaybillStatusResponse
     */
    public function queryDigitalLogisticWaybillStatus($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticWaybillStatusEx($request, $runtime);
    }

    /**
     * Description: 查询物流运单状态
     * Summary: 查询运单状态
     * @param QueryDigitalLogisticWaybillStatusRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticWaybillStatusResponse
     */
    public function queryDigitalLogisticWaybillStatusEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticWaybillStatusResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybill.status.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
     * 完成后的运单无法再调用支付订单与轨迹位置上传接口。
     * Summary: 运单完成
     * @param FinishDigitalLogisticWaybillOrderRequest $request
     * @return FinishDigitalLogisticWaybillOrderResponse
     */
    public function finishDigitalLogisticWaybillOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->finishDigitalLogisticWaybillOrderEx($request, $runtime);
    }

    /**
     * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
     * 完成后的运单无法再调用支付订单与轨迹位置上传接口。
     * Summary: 运单完成
     * @param FinishDigitalLogisticWaybillOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return FinishDigitalLogisticWaybillOrderResponse
     */
    public function finishDigitalLogisticWaybillOrderEx($request, $runtime){
        Utils::validateModel($request);
        return FinishDigitalLogisticWaybillOrderResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybill.order.finish", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建
     * @param CreateDigitalLogisticCargoPayorderRequest $request
     * @return CreateDigitalLogisticCargoPayorderResponse
     */
    public function createDigitalLogisticCargoPayorder($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticCargoPayorderEx($request, $runtime);
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建
     * @param CreateDigitalLogisticCargoPayorderRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticCargoPayorderResponse
     */
    public function createDigitalLogisticCargoPayorderEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticCargoPayorderResponse::fromMap($this->doRequest("1.0", "digital.logistic.cargo.payorder.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 当货物到达目的地时，调用此接口
     * Summary: 运单运输完成
     * @param SaveDigitalLogisticWaybillOrderRequest $request
     * @return SaveDigitalLogisticWaybillOrderResponse
     */
    public function saveDigitalLogisticWaybillOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticWaybillOrderEx($request, $runtime);
    }

    /**
     * Description: 当货物到达目的地时，调用此接口
     * Summary: 运单运输完成
     * @param SaveDigitalLogisticWaybillOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticWaybillOrderResponse
     */
    public function saveDigitalLogisticWaybillOrderEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticWaybillOrderResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybill.order.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 运单关闭
     * Summary: 运单关闭
     * @param CloseDigitalLogisticWaybillOrderRequest $request
     * @return CloseDigitalLogisticWaybillOrderResponse
     */
    public function closeDigitalLogisticWaybillOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->closeDigitalLogisticWaybillOrderEx($request, $runtime);
    }

    /**
     * Description: 运单关闭
     * Summary: 运单关闭
     * @param CloseDigitalLogisticWaybillOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return CloseDigitalLogisticWaybillOrderResponse
     */
    public function closeDigitalLogisticWaybillOrderEx($request, $runtime){
        Utils::validateModel($request);
        return CloseDigitalLogisticWaybillOrderResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybill.order.close", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 完成物流运单
     * Summary: 完成物流运单
     * @param FinishDigitalLogisticFinanceWaybillRequest $request
     * @return FinishDigitalLogisticFinanceWaybillResponse
     */
    public function finishDigitalLogisticFinanceWaybill($request){
        $runtime = new RuntimeOptions([]);
        return $this->finishDigitalLogisticFinanceWaybillEx($request, $runtime);
    }

    /**
     * Description: 完成物流运单
     * Summary: 完成物流运单
     * @param FinishDigitalLogisticFinanceWaybillRequest $request
     * @param RuntimeOptions $runtime
     * @return FinishDigitalLogisticFinanceWaybillResponse
     */
    public function finishDigitalLogisticFinanceWaybillEx($request, $runtime){
        Utils::validateModel($request);
        return FinishDigitalLogisticFinanceWaybillResponse::fromMap($this->doRequest("1.0", "digital.logistic.finance.waybill.finish", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 运输完成
     * Summary: 运输完成
     * @param FinishDigitalLogisticFinanceTransportRequest $request
     * @return FinishDigitalLogisticFinanceTransportResponse
     */
    public function finishDigitalLogisticFinanceTransport($request){
        $runtime = new RuntimeOptions([]);
        return $this->finishDigitalLogisticFinanceTransportEx($request, $runtime);
    }

    /**
     * Description: 运输完成
     * Summary: 运输完成
     * @param FinishDigitalLogisticFinanceTransportRequest $request
     * @param RuntimeOptions $runtime
     * @return FinishDigitalLogisticFinanceTransportResponse
     */
    public function finishDigitalLogisticFinanceTransportEx($request, $runtime){
        Utils::validateModel($request);
        return FinishDigitalLogisticFinanceTransportResponse::fromMap($this->doRequest("1.0", "digital.logistic.finance.transport.finish", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 对运单信息项需更新时调用
     * Summary: 更新运单
     * @param UpdateDigitalLogisticFinanceWaybillRequest $request
     * @return UpdateDigitalLogisticFinanceWaybillResponse
     */
    public function updateDigitalLogisticFinanceWaybill($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticFinanceWaybillEx($request, $runtime);
    }

    /**
     * Description: 对运单信息项需更新时调用
     * Summary: 更新运单
     * @param UpdateDigitalLogisticFinanceWaybillRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticFinanceWaybillResponse
     */
    public function updateDigitalLogisticFinanceWaybillEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticFinanceWaybillResponse::fromMap($this->doRequest("1.0", "digital.logistic.finance.waybill.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 当司机到达货主装货地后，调用此接口
     * Summary: 起运运单
     * @param StartDigitalLogisticFinanceWaybillRequest $request
     * @return StartDigitalLogisticFinanceWaybillResponse
     */
    public function startDigitalLogisticFinanceWaybill($request){
        $runtime = new RuntimeOptions([]);
        return $this->startDigitalLogisticFinanceWaybillEx($request, $runtime);
    }

    /**
     * Description: 当司机到达货主装货地后，调用此接口
     * Summary: 起运运单
     * @param StartDigitalLogisticFinanceWaybillRequest $request
     * @param RuntimeOptions $runtime
     * @return StartDigitalLogisticFinanceWaybillResponse
     */
    public function startDigitalLogisticFinanceWaybillEx($request, $runtime){
        Utils::validateModel($request);
        return StartDigitalLogisticFinanceWaybillResponse::fromMap($this->doRequest("1.0", "digital.logistic.finance.waybill.start", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 创建承运商账户
     * Summary: 创建承运商账户
     * @param CreateDigitalLogisticCaptainDisRequest $request
     * @return CreateDigitalLogisticCaptainDisResponse
     */
    public function createDigitalLogisticCaptainDis($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticCaptainDisEx($request, $runtime);
    }

    /**
     * Description: 创建承运商账户
     * Summary: 创建承运商账户
     * @param CreateDigitalLogisticCaptainDisRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticCaptainDisResponse
     */
    public function createDigitalLogisticCaptainDisEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticCaptainDisResponse::fromMap($this->doRequest("1.0", "digital.logistic.captain.dis.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 创建货主账单
     * Summary: 货主账单创建
     * @param CreateDigitalLogisticCargowaybillBillRequest $request
     * @return CreateDigitalLogisticCargowaybillBillResponse
     */
    public function createDigitalLogisticCargowaybillBill($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticCargowaybillBillEx($request, $runtime);
    }

    /**
     * Description: 创建货主账单
     * Summary: 货主账单创建
     * @param CreateDigitalLogisticCargowaybillBillRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticCargowaybillBillResponse
     */
    public function createDigitalLogisticCargowaybillBillEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticCargowaybillBillResponse::fromMap($this->doRequest("1.0", "digital.logistic.cargowaybill.bill.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 确认货主账单
     * Summary: 货主账单确认
     * @param ConfirmDigitalLogisticCargowaybillBillRequest $request
     * @return ConfirmDigitalLogisticCargowaybillBillResponse
     */
    public function confirmDigitalLogisticCargowaybillBill($request){
        $runtime = new RuntimeOptions([]);
        return $this->confirmDigitalLogisticCargowaybillBillEx($request, $runtime);
    }

    /**
     * Description: 确认货主账单
     * Summary: 货主账单确认
     * @param ConfirmDigitalLogisticCargowaybillBillRequest $request
     * @param RuntimeOptions $runtime
     * @return ConfirmDigitalLogisticCargowaybillBillResponse
     */
    public function confirmDigitalLogisticCargowaybillBillEx($request, $runtime){
        Utils::validateModel($request);
        return ConfirmDigitalLogisticCargowaybillBillResponse::fromMap($this->doRequest("1.0", "digital.logistic.cargowaybill.bill.confirm", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 结算货主账单
     * Summary: 货主账单结算
     * @param CreateDigitalLogisticCargowaybillBillsettleRequest $request
     * @return CreateDigitalLogisticCargowaybillBillsettleResponse
     */
    public function createDigitalLogisticCargowaybillBillsettle($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticCargowaybillBillsettleEx($request, $runtime);
    }

    /**
     * Description: 结算货主账单
     * Summary: 货主账单结算
     * @param CreateDigitalLogisticCargowaybillBillsettleRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticCargowaybillBillsettleResponse
     */
    public function createDigitalLogisticCargowaybillBillsettleEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticCargowaybillBillsettleResponse::fromMap($this->doRequest("1.0", "digital.logistic.cargowaybill.billsettle.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 运单平台did更新
     * Summary: 运单平台did更新
     * @param UpdateDigitalLogisticWaybillorderPlatformdidRequest $request
     * @return UpdateDigitalLogisticWaybillorderPlatformdidResponse
     */
    public function updateDigitalLogisticWaybillorderPlatformdid($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticWaybillorderPlatformdidEx($request, $runtime);
    }

    /**
     * Description: 运单平台did更新
     * Summary: 运单平台did更新
     * @param UpdateDigitalLogisticWaybillorderPlatformdidRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticWaybillorderPlatformdidResponse
     */
    public function updateDigitalLogisticWaybillorderPlatformdidEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticWaybillorderPlatformdidResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybillorder.platformdid.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 更新货主账单
     * Summary: 货主账单更新
     * @param UpdateDigitalLogisticCargowaybillBillRequest $request
     * @return UpdateDigitalLogisticCargowaybillBillResponse
     */
    public function updateDigitalLogisticCargowaybillBill($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticCargowaybillBillEx($request, $runtime);
    }

    /**
     * Description: 更新货主账单
     * Summary: 货主账单更新
     * @param UpdateDigitalLogisticCargowaybillBillRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticCargowaybillBillResponse
     */
    public function updateDigitalLogisticCargowaybillBillEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticCargowaybillBillResponse::fromMap($this->doRequest("1.0", "digital.logistic.cargowaybill.bill.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
     * Summary: 分布式数字身份申请did集合
     * @param CreateDigitalLogisticDisDidRequest $request
     * @return CreateDigitalLogisticDisDidResponse
     */
    public function createDigitalLogisticDisDid($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticDisDidEx($request, $runtime);
    }

    /**
     * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
     * Summary: 分布式数字身份申请did集合
     * @param CreateDigitalLogisticDisDidRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticDisDidResponse
     */
    public function createDigitalLogisticDisDidEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticDisDidResponse::fromMap($this->doRequest("1.0", "digital.logistic.dis.did.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 3PL运输合同上传
     * Summary: 3PL运输合同上传
     * @param UploadDigitalLogisticTransportContractRequest $request
     * @return UploadDigitalLogisticTransportContractResponse
     */
    public function uploadDigitalLogisticTransportContract($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticTransportContractEx($request, $runtime);
    }

    /**
     * Description: 3PL运输合同上传
     * Summary: 3PL运输合同上传
     * @param UploadDigitalLogisticTransportContractRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticTransportContractResponse
     */
    public function uploadDigitalLogisticTransportContractEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticTransportContractResponse::fromMap($this->doRequest("1.0", "digital.logistic.transport.contract.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 3PL运输线路上传
     * Summary: 3PL运输线路上传
     * @param UploadDigitalLogisticTransportRouteRequest $request
     * @return UploadDigitalLogisticTransportRouteResponse
     */
    public function uploadDigitalLogisticTransportRoute($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticTransportRouteEx($request, $runtime);
    }

    /**
     * Description: 3PL运输线路上传
     * Summary: 3PL运输线路上传
     * @param UploadDigitalLogisticTransportRouteRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticTransportRouteResponse
     */
    public function uploadDigitalLogisticTransportRouteEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticTransportRouteResponse::fromMap($this->doRequest("1.0", "digital.logistic.transport.route.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 3PL运单创建
     * Summary: 3PL运单创建
     * @param CreateDigitalLogisticTransportWaybillRequest $request
     * @return CreateDigitalLogisticTransportWaybillResponse
     */
    public function createDigitalLogisticTransportWaybill($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticTransportWaybillEx($request, $runtime);
    }

    /**
     * Description: 3PL运单创建
     * Summary: 3PL运单创建
     * @param CreateDigitalLogisticTransportWaybillRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticTransportWaybillResponse
     */
    public function createDigitalLogisticTransportWaybillEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticTransportWaybillResponse::fromMap($this->doRequest("1.0", "digital.logistic.transport.waybill.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 3PL运单状态更新
     * Summary: 3PL运单状态更新
     * @param UpdateDigitalLogisticWaybillActionRequest $request
     * @return UpdateDigitalLogisticWaybillActionResponse
     */
    public function updateDigitalLogisticWaybillAction($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticWaybillActionEx($request, $runtime);
    }

    /**
     * Description: 3PL运单状态更新
     * Summary: 3PL运单状态更新
     * @param UpdateDigitalLogisticWaybillActionRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticWaybillActionResponse
     */
    public function updateDigitalLogisticWaybillActionEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticWaybillActionResponse::fromMap($this->doRequest("1.0", "digital.logistic.waybill.action.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 3PL运单修改
     * Summary: 3PL运单修改
     * @param UpdateDigitalLogisticTransportWaybillRequest $request
     * @return UpdateDigitalLogisticTransportWaybillResponse
     */
    public function updateDigitalLogisticTransportWaybill($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticTransportWaybillEx($request, $runtime);
    }

    /**
     * Description: 3PL运单修改
     * Summary: 3PL运单修改
     * @param UpdateDigitalLogisticTransportWaybillRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticTransportWaybillResponse
     */
    public function updateDigitalLogisticTransportWaybillEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticTransportWaybillResponse::fromMap($this->doRequest("1.0", "digital.logistic.transport.waybill.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 3PL回单上传
     * Summary: 3PL回单上传
     * @param UploadDigitalLogisticTransportReceiptRequest $request
     * @return UploadDigitalLogisticTransportReceiptResponse
     */
    public function uploadDigitalLogisticTransportReceipt($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticTransportReceiptEx($request, $runtime);
    }

    /**
     * Description: 3PL回单上传
     * Summary: 3PL回单上传
     * @param UploadDigitalLogisticTransportReceiptRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticTransportReceiptResponse
     */
    public function uploadDigitalLogisticTransportReceiptEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticTransportReceiptResponse::fromMap($this->doRequest("1.0", "digital.logistic.transport.receipt.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 应收账单创建
     * Summary: 应收账单创建
     * @param CreateDigitalLogisticBillReceivablebillRequest $request
     * @return CreateDigitalLogisticBillReceivablebillResponse
     */
    public function createDigitalLogisticBillReceivablebill($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticBillReceivablebillEx($request, $runtime);
    }

    /**
     * Description: 应收账单创建
     * Summary: 应收账单创建
     * @param CreateDigitalLogisticBillReceivablebillRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticBillReceivablebillResponse
     */
    public function createDigitalLogisticBillReceivablebillEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticBillReceivablebillResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.receivablebill.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 应收账单状态更新
     * Summary: 应收账单状态更新
     * @param UpdateDigitalLogisticReceivablebillStatusRequest $request
     * @return UpdateDigitalLogisticReceivablebillStatusResponse
     */
    public function updateDigitalLogisticReceivablebillStatus($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticReceivablebillStatusEx($request, $runtime);
    }

    /**
     * Description: 应收账单状态更新
     * Summary: 应收账单状态更新
     * @param UpdateDigitalLogisticReceivablebillStatusRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticReceivablebillStatusResponse
     */
    public function updateDigitalLogisticReceivablebillStatusEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticReceivablebillStatusResponse::fromMap($this->doRequest("1.0", "digital.logistic.receivablebill.status.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 应收账单修改
     * Summary: 应收账单修改
     * @param UpdateDigitalLogisticBillReceivablebillRequest $request
     * @return UpdateDigitalLogisticBillReceivablebillResponse
     */
    public function updateDigitalLogisticBillReceivablebill($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticBillReceivablebillEx($request, $runtime);
    }

    /**
     * Description: 应收账单修改
     * Summary: 应收账单修改
     * @param UpdateDigitalLogisticBillReceivablebillRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticBillReceivablebillResponse
     */
    public function updateDigitalLogisticBillReceivablebillEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticBillReceivablebillResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.receivablebill.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 路运发票创建
     * Summary: 路运发票创建
     * @param CreateDigitalLogisticHighwayInvoiceRequest $request
     * @return CreateDigitalLogisticHighwayInvoiceResponse
     */
    public function createDigitalLogisticHighwayInvoice($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticHighwayInvoiceEx($request, $runtime);
    }

    /**
     * Description: 路运发票创建
     * Summary: 路运发票创建
     * @param CreateDigitalLogisticHighwayInvoiceRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticHighwayInvoiceResponse
     */
    public function createDigitalLogisticHighwayInvoiceEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticHighwayInvoiceResponse::fromMap($this->doRequest("1.0", "digital.logistic.highway.invoice.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 司机信用流转协议签署并开通流转能力
     * Summary: 司机信用流转协议签署并开通流转能力
     * @param OpenDigitalLogisticCreditDriverRequest $request
     * @return OpenDigitalLogisticCreditDriverResponse
     */
    public function openDigitalLogisticCreditDriver($request){
        $runtime = new RuntimeOptions([]);
        return $this->openDigitalLogisticCreditDriverEx($request, $runtime);
    }

    /**
     * Description: 司机信用流转协议签署并开通流转能力
     * Summary: 司机信用流转协议签署并开通流转能力
     * @param OpenDigitalLogisticCreditDriverRequest $request
     * @param RuntimeOptions $runtime
     * @return OpenDigitalLogisticCreditDriverResponse
     */
    public function openDigitalLogisticCreditDriverEx($request, $runtime){
        Utils::validateModel($request);
        return OpenDigitalLogisticCreditDriverResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.driver.open", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 查询司机信用流转能力开通情况
     * Summary: 查询司机信用流转能力开通情况
     * @param QueryDigitalLogisticCreditDriverRequest $request
     * @return QueryDigitalLogisticCreditDriverResponse
     */
    public function queryDigitalLogisticCreditDriver($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditDriverEx($request, $runtime);
    }

    /**
     * Description: 查询司机信用流转能力开通情况
     * Summary: 查询司机信用流转能力开通情况
     * @param QueryDigitalLogisticCreditDriverRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditDriverResponse
     */
    public function queryDigitalLogisticCreditDriverEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditDriverResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.driver.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 查询货主信用流转能力开通情况
     * Summary: 查询货主信用流转能力开通情况
     * @param QueryDigitalLogisticCreditConsignorRequest $request
     * @return QueryDigitalLogisticCreditConsignorResponse
     */
    public function queryDigitalLogisticCreditConsignor($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditConsignorEx($request, $runtime);
    }

    /**
     * Description: 查询货主信用流转能力开通情况
     * Summary: 查询货主信用流转能力开通情况
     * @param QueryDigitalLogisticCreditConsignorRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditConsignorResponse
     */
    public function queryDigitalLogisticCreditConsignorEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditConsignorResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.consignor.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 查询货主信用流转额度
     * Summary: 查询货主信用流转额度
     * @param QueryDigitalLogisticCreditBalanceRequest $request
     * @return QueryDigitalLogisticCreditBalanceResponse
     */
    public function queryDigitalLogisticCreditBalance($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditBalanceEx($request, $runtime);
    }

    /**
     * Description: 查询货主信用流转额度
     * Summary: 查询货主信用流转额度
     * @param QueryDigitalLogisticCreditBalanceRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditBalanceResponse
     */
    public function queryDigitalLogisticCreditBalanceEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditBalanceResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.balance.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
     * Summary: 发行信用流转批次信息上传
     * @param UploadDigitalLogisticCreditIssueRequest $request
     * @return UploadDigitalLogisticCreditIssueResponse
     */
    public function uploadDigitalLogisticCreditIssue($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticCreditIssueEx($request, $runtime);
    }

    /**
     * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
     * Summary: 发行信用流转批次信息上传
     * @param UploadDigitalLogisticCreditIssueRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticCreditIssueResponse
     */
    public function uploadDigitalLogisticCreditIssueEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticCreditIssueResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issue.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转批次状态查询
     * Summary: 信用流转批次状态查询
     * @param QueryDigitalLogisticCreditIssuebatchstatusRequest $request
     * @return QueryDigitalLogisticCreditIssuebatchstatusResponse
     */
    public function queryDigitalLogisticCreditIssuebatchstatus($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditIssuebatchstatusEx($request, $runtime);
    }

    /**
     * Description: 信用流转批次状态查询
     * Summary: 信用流转批次状态查询
     * @param QueryDigitalLogisticCreditIssuebatchstatusRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditIssuebatchstatusResponse
     */
    public function queryDigitalLogisticCreditIssuebatchstatusEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditIssuebatchstatusResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuebatchstatus.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 支付批次撤销
     * Summary: 支付批次撤销
     * @param CancelDigitalLogisticCreditIssuebatchRequest $request
     * @return CancelDigitalLogisticCreditIssuebatchResponse
     */
    public function cancelDigitalLogisticCreditIssuebatch($request){
        $runtime = new RuntimeOptions([]);
        return $this->cancelDigitalLogisticCreditIssuebatchEx($request, $runtime);
    }

    /**
     * Description: 支付批次撤销
     * Summary: 支付批次撤销
     * @param CancelDigitalLogisticCreditIssuebatchRequest $request
     * @param RuntimeOptions $runtime
     * @return CancelDigitalLogisticCreditIssuebatchResponse
     */
    public function cancelDigitalLogisticCreditIssuebatchEx($request, $runtime){
        Utils::validateModel($request);
        return CancelDigitalLogisticCreditIssuebatchResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuebatch.cancel", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 根据id查询信用凭证信息
     * Summary: 根据id查询信用凭证信息
     * @param QueryDigitalLogisticCreditIssuebyidRequest $request
     * @return QueryDigitalLogisticCreditIssuebyidResponse
     */
    public function queryDigitalLogisticCreditIssuebyid($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditIssuebyidEx($request, $runtime);
    }

    /**
     * Description: 根据id查询信用凭证信息
     * Summary: 根据id查询信用凭证信息
     * @param QueryDigitalLogisticCreditIssuebyidRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditIssuebyidResponse
     */
    public function queryDigitalLogisticCreditIssuebyidEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditIssuebyidResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuebyid.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 根据时间查询信用凭证信息
     * Summary: 根据时间查询信用凭证信息
     * @param QueryDigitalLogisticCreditIssuebytimeRequest $request
     * @return QueryDigitalLogisticCreditIssuebytimeResponse
     */
    public function queryDigitalLogisticCreditIssuebytime($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditIssuebytimeEx($request, $runtime);
    }

    /**
     * Description: 根据时间查询信用凭证信息
     * Summary: 根据时间查询信用凭证信息
     * @param QueryDigitalLogisticCreditIssuebytimeRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditIssuebytimeResponse
     */
    public function queryDigitalLogisticCreditIssuebytimeEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditIssuebytimeResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuebytime.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 查询用户持有的信用凭证信息
     * Summary: 查询用户持有的信用凭证信息
     * @param QueryDigitalLogisticCreditUserissueRequest $request
     * @return QueryDigitalLogisticCreditUserissueResponse
     */
    public function queryDigitalLogisticCreditUserissue($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditUserissueEx($request, $runtime);
    }

    /**
     * Description: 查询用户持有的信用凭证信息
     * Summary: 查询用户持有的信用凭证信息
     * @param QueryDigitalLogisticCreditUserissueRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditUserissueResponse
     */
    public function queryDigitalLogisticCreditUserissueEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditUserissueResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.userissue.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 查询用户信用流转流水记录
     * Summary: 查询用户信用流转流水记录
     * @param QueryDigitalLogisticCreditStatementRequest $request
     * @return QueryDigitalLogisticCreditStatementResponse
     */
    public function queryDigitalLogisticCreditStatement($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditStatementEx($request, $runtime);
    }

    /**
     * Description: 查询用户信用流转流水记录
     * Summary: 查询用户信用流转流水记录
     * @param QueryDigitalLogisticCreditStatementRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditStatementResponse
     */
    public function queryDigitalLogisticCreditStatementEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditStatementResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.statement.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证拆分转让申请
     * Summary: 信用凭证拆分转让申请
     * @param CreateDigitalLogisticCreditIssuetransferRequest $request
     * @return CreateDigitalLogisticCreditIssuetransferResponse
     */
    public function createDigitalLogisticCreditIssuetransfer($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticCreditIssuetransferEx($request, $runtime);
    }

    /**
     * Description: 信用凭证拆分转让申请
     * Summary: 信用凭证拆分转让申请
     * @param CreateDigitalLogisticCreditIssuetransferRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticCreditIssuetransferResponse
     */
    public function createDigitalLogisticCreditIssuetransferEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticCreditIssuetransferResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuetransfer.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证拆分转让结果查询
     * Summary: 信用凭证拆分转让结果查询
     * @param QueryDigitalLogisticCreditIssuetransferRequest $request
     * @return QueryDigitalLogisticCreditIssuetransferResponse
     */
    public function queryDigitalLogisticCreditIssuetransfer($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditIssuetransferEx($request, $runtime);
    }

    /**
     * Description: 信用凭证拆分转让结果查询
     * Summary: 信用凭证拆分转让结果查询
     * @param QueryDigitalLogisticCreditIssuetransferRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditIssuetransferResponse
     */
    public function queryDigitalLogisticCreditIssuetransferEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditIssuetransferResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuetransfer.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证融资申请
     * Summary: 信用凭证融资申请
     * @param CreateDigitalLogisticCreditIssuefinanceRequest $request
     * @return CreateDigitalLogisticCreditIssuefinanceResponse
     */
    public function createDigitalLogisticCreditIssuefinance($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticCreditIssuefinanceEx($request, $runtime);
    }

    /**
     * Description: 信用凭证融资申请
     * Summary: 信用凭证融资申请
     * @param CreateDigitalLogisticCreditIssuefinanceRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticCreditIssuefinanceResponse
     */
    public function createDigitalLogisticCreditIssuefinanceEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticCreditIssuefinanceResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuefinance.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证融资结果查询
     * Summary: 信用凭证融资结果查询
     * @param QueryDigitalLogisticCreditIssuefinanceRequest $request
     * @return QueryDigitalLogisticCreditIssuefinanceResponse
     */
    public function queryDigitalLogisticCreditIssuefinance($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditIssuefinanceEx($request, $runtime);
    }

    /**
     * Description: 信用凭证融资结果查询
     * Summary: 信用凭证融资结果查询
     * @param QueryDigitalLogisticCreditIssuefinanceRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditIssuefinanceResponse
     */
    public function queryDigitalLogisticCreditIssuefinanceEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditIssuefinanceResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuefinance.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证清分信息查询
     * Summary: 信用凭证清分信息查询
     * @param QueryDigitalLogisticCreditIssuereceivableRequest $request
     * @return QueryDigitalLogisticCreditIssuereceivableResponse
     */
    public function queryDigitalLogisticCreditIssuereceivable($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditIssuereceivableEx($request, $runtime);
    }

    /**
     * Description: 信用凭证清分信息查询
     * Summary: 信用凭证清分信息查询
     * @param QueryDigitalLogisticCreditIssuereceivableRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditIssuereceivableResponse
     */
    public function queryDigitalLogisticCreditIssuereceivableEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditIssuereceivableResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuereceivable.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证资产查询
     * Summary: 信用凭证资产查询
     * @param QueryDigitalLogisticCreditIssueamountRequest $request
     * @return QueryDigitalLogisticCreditIssueamountResponse
     */
    public function queryDigitalLogisticCreditIssueamount($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditIssueamountEx($request, $runtime);
    }

    /**
     * Description: 信用凭证资产查询
     * Summary: 信用凭证资产查询
     * @param QueryDigitalLogisticCreditIssueamountRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditIssueamountResponse
     */
    public function queryDigitalLogisticCreditIssueamountEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditIssueamountResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issueamount.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 物流金融统一回调接口
     * Summary: 物流金融统一回调接口
     * @param CallbackDigitalLogisticCreditCommonRequest $request
     * @return CallbackDigitalLogisticCreditCommonResponse
     */
    public function callbackDigitalLogisticCreditCommon($request){
        $runtime = new RuntimeOptions([]);
        return $this->callbackDigitalLogisticCreditCommonEx($request, $runtime);
    }

    /**
     * Description: 物流金融统一回调接口
     * Summary: 物流金融统一回调接口
     * @param CallbackDigitalLogisticCreditCommonRequest $request
     * @param RuntimeOptions $runtime
     * @return CallbackDigitalLogisticCreditCommonResponse
     */
    public function callbackDigitalLogisticCreditCommonEx($request, $runtime){
        Utils::validateModel($request);
        return CallbackDigitalLogisticCreditCommonResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.common.callback", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证主动清分
     * Summary: 信用凭证主动清分
     * @param ApplyDigitalLogisticCreditIssueclearRequest $request
     * @return ApplyDigitalLogisticCreditIssueclearResponse
     */
    public function applyDigitalLogisticCreditIssueclear($request){
        $runtime = new RuntimeOptions([]);
        return $this->applyDigitalLogisticCreditIssueclearEx($request, $runtime);
    }

    /**
     * Description: 信用凭证主动清分
     * Summary: 信用凭证主动清分
     * @param ApplyDigitalLogisticCreditIssueclearRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyDigitalLogisticCreditIssueclearResponse
     */
    public function applyDigitalLogisticCreditIssueclearEx($request, $runtime){
        Utils::validateModel($request);
        return ApplyDigitalLogisticCreditIssueclearResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issueclear.apply", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 物流金融代理消息
     * Summary: 物流金融代理消息
     * @param SendDigitalLogisticCreditProxyRequest $request
     * @return SendDigitalLogisticCreditProxyResponse
     */
    public function sendDigitalLogisticCreditProxy($request){
        $runtime = new RuntimeOptions([]);
        return $this->sendDigitalLogisticCreditProxyEx($request, $runtime);
    }

    /**
     * Description: 物流金融代理消息
     * Summary: 物流金融代理消息
     * @param SendDigitalLogisticCreditProxyRequest $request
     * @param RuntimeOptions $runtime
     * @return SendDigitalLogisticCreditProxyResponse
     */
    public function sendDigitalLogisticCreditProxyEx($request, $runtime){
        Utils::validateModel($request);
        return SendDigitalLogisticCreditProxyResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.proxy.send", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 运单信用流转核验结果查询
     * Summary: 运单信用流转核验结果查询
     * @param CheckDigitalLogisticCreditWaybillRequest $request
     * @return CheckDigitalLogisticCreditWaybillResponse
     */
    public function checkDigitalLogisticCreditWaybill($request){
        $runtime = new RuntimeOptions([]);
        return $this->checkDigitalLogisticCreditWaybillEx($request, $runtime);
    }

    /**
     * Description: 运单信用流转核验结果查询
     * Summary: 运单信用流转核验结果查询
     * @param CheckDigitalLogisticCreditWaybillRequest $request
     * @param RuntimeOptions $runtime
     * @return CheckDigitalLogisticCreditWaybillResponse
     */
    public function checkDigitalLogisticCreditWaybillEx($request, $runtime){
        Utils::validateModel($request);
        return CheckDigitalLogisticCreditWaybillResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.waybill.check", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 物流金融信用流转司机换绑
     * Summary: 物流金融信用流转司机换绑
     * @param ReopenDigitalLogisticCreditDriverRequest $request
     * @return ReopenDigitalLogisticCreditDriverResponse
     */
    public function reopenDigitalLogisticCreditDriver($request){
        $runtime = new RuntimeOptions([]);
        return $this->reopenDigitalLogisticCreditDriverEx($request, $runtime);
    }

    /**
     * Description: 物流金融信用流转司机换绑
     * Summary: 物流金融信用流转司机换绑
     * @param ReopenDigitalLogisticCreditDriverRequest $request
     * @param RuntimeOptions $runtime
     * @return ReopenDigitalLogisticCreditDriverResponse
     */
    public function reopenDigitalLogisticCreditDriverEx($request, $runtime){
        Utils::validateModel($request);
        return ReopenDigitalLogisticCreditDriverResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.driver.reopen", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 线下协议授权关系上传
     * Summary: 线下协议授权关系上传
     * @param UploadDigitalLogisticCreditAuthorizationRequest $request
     * @return UploadDigitalLogisticCreditAuthorizationResponse
     */
    public function uploadDigitalLogisticCreditAuthorization($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticCreditAuthorizationEx($request, $runtime);
    }

    /**
     * Description: 线下协议授权关系上传
     * Summary: 线下协议授权关系上传
     * @param UploadDigitalLogisticCreditAuthorizationRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticCreditAuthorizationResponse
     */
    public function uploadDigitalLogisticCreditAuthorizationEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticCreditAuthorizationResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.authorization.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 线上应收转让确认关系
     * Summary: 线上应收转让确认关系
     * @param UploadDigitalLogisticCreditConfirmRequest $request
     * @return UploadDigitalLogisticCreditConfirmResponse
     */
    public function uploadDigitalLogisticCreditConfirm($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticCreditConfirmEx($request, $runtime);
    }

    /**
     * Description: 线上应收转让确认关系
     * Summary: 线上应收转让确认关系
     * @param UploadDigitalLogisticCreditConfirmRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticCreditConfirmResponse
     */
    public function uploadDigitalLogisticCreditConfirmEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticCreditConfirmResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.confirm.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 物流信用流转凭证批量发行
     * Summary: 物流信用流转凭证批量发行
     * @param BatchcreateDigitalLogisticCreditmodeIssueRequest $request
     * @return BatchcreateDigitalLogisticCreditmodeIssueResponse
     */
    public function batchcreateDigitalLogisticCreditmodeIssue($request){
        $runtime = new RuntimeOptions([]);
        return $this->batchcreateDigitalLogisticCreditmodeIssueEx($request, $runtime);
    }

    /**
     * Description: 物流信用流转凭证批量发行
     * Summary: 物流信用流转凭证批量发行
     * @param BatchcreateDigitalLogisticCreditmodeIssueRequest $request
     * @param RuntimeOptions $runtime
     * @return BatchcreateDigitalLogisticCreditmodeIssueResponse
     */
    public function batchcreateDigitalLogisticCreditmodeIssueEx($request, $runtime){
        Utils::validateModel($request);
        return BatchcreateDigitalLogisticCreditmodeIssueResponse::fromMap($this->doRequest("1.0", "digital.logistic.creditmode.issue.batchcreate", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 物流信用流转按模式主动清分
     * Summary: 物流信用流转按模式主动清分
     * @param ApplyDigitalLogisticCreditmodeIssueclearRequest $request
     * @return ApplyDigitalLogisticCreditmodeIssueclearResponse
     */
    public function applyDigitalLogisticCreditmodeIssueclear($request){
        $runtime = new RuntimeOptions([]);
        return $this->applyDigitalLogisticCreditmodeIssueclearEx($request, $runtime);
    }

    /**
     * Description: 物流信用流转按模式主动清分
     * Summary: 物流信用流转按模式主动清分
     * @param ApplyDigitalLogisticCreditmodeIssueclearRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyDigitalLogisticCreditmodeIssueclearResponse
     */
    public function applyDigitalLogisticCreditmodeIssueclearEx($request, $runtime){
        Utils::validateModel($request);
        return ApplyDigitalLogisticCreditmodeIssueclearResponse::fromMap($this->doRequest("1.0", "digital.logistic.creditmode.issueclear.apply", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转发行信息上传SAAS版
     * Summary: 信用流转发行信息上传SAAS版
     * @param UploadDigitalLogisticCreditIssuebysaasRequest $request
     * @return UploadDigitalLogisticCreditIssuebysaasResponse
     */
    public function uploadDigitalLogisticCreditIssuebysaas($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticCreditIssuebysaasEx($request, $runtime);
    }

    /**
     * Description: 信用流转发行信息上传SAAS版
     * Summary: 信用流转发行信息上传SAAS版
     * @param UploadDigitalLogisticCreditIssuebysaasRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticCreditIssuebysaasResponse
     */
    public function uploadDigitalLogisticCreditIssuebysaasEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticCreditIssuebysaasResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuebysaas.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转B模式发行批次撤销SAAS版
     * Summary: 信用流转B模式发行批次撤销SAAS版
     * @param CancelDigitalLogisticCreditIssuebatchbysaasRequest $request
     * @return CancelDigitalLogisticCreditIssuebatchbysaasResponse
     */
    public function cancelDigitalLogisticCreditIssuebatchbysaas($request){
        $runtime = new RuntimeOptions([]);
        return $this->cancelDigitalLogisticCreditIssuebatchbysaasEx($request, $runtime);
    }

    /**
     * Description: 信用流转B模式发行批次撤销SAAS版
     * Summary: 信用流转B模式发行批次撤销SAAS版
     * @param CancelDigitalLogisticCreditIssuebatchbysaasRequest $request
     * @param RuntimeOptions $runtime
     * @return CancelDigitalLogisticCreditIssuebatchbysaasResponse
     */
    public function cancelDigitalLogisticCreditIssuebatchbysaasEx($request, $runtime){
        Utils::validateModel($request);
        return CancelDigitalLogisticCreditIssuebatchbysaasResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuebatchbysaas.cancel", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转可用额度查询SAAS版
     * Summary: 信用流转可用额度查询SAAS版
     * @param QueryDigitalLogisticCreditBalancebysaasRequest $request
     * @return QueryDigitalLogisticCreditBalancebysaasResponse
     */
    public function queryDigitalLogisticCreditBalancebysaas($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditBalancebysaasEx($request, $runtime);
    }

    /**
     * Description: 信用流转可用额度查询SAAS版
     * Summary: 信用流转可用额度查询SAAS版
     * @param QueryDigitalLogisticCreditBalancebysaasRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditBalancebysaasResponse
     */
    public function queryDigitalLogisticCreditBalancebysaasEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditBalancebysaasResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.balancebysaas.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证电子回单获取
     * Summary: 信用凭证电子回单获取
     * @param GetDigitalLogisticCreditIssuescpticketRequest $request
     * @return GetDigitalLogisticCreditIssuescpticketResponse
     */
    public function getDigitalLogisticCreditIssuescpticket($request){
        $runtime = new RuntimeOptions([]);
        return $this->getDigitalLogisticCreditIssuescpticketEx($request, $runtime);
    }

    /**
     * Description: 信用凭证电子回单获取
     * Summary: 信用凭证电子回单获取
     * @param GetDigitalLogisticCreditIssuescpticketRequest $request
     * @param RuntimeOptions $runtime
     * @return GetDigitalLogisticCreditIssuescpticketResponse
     */
    public function getDigitalLogisticCreditIssuescpticketEx($request, $runtime){
        Utils::validateModel($request);
        return GetDigitalLogisticCreditIssuescpticketResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuescpticket.get", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证电子回单获取结果查询接口
     * Summary: 信用凭证电子回单获取结果查询接口
     * @param QueryDigitalLogisticCreditIssuescpticketresultRequest $request
     * @return QueryDigitalLogisticCreditIssuescpticketresultResponse
     */
    public function queryDigitalLogisticCreditIssuescpticketresult($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditIssuescpticketresultEx($request, $runtime);
    }

    /**
     * Description: 信用凭证电子回单获取结果查询接口
     * Summary: 信用凭证电子回单获取结果查询接口
     * @param QueryDigitalLogisticCreditIssuescpticketresultRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditIssuescpticketresultResponse
     */
    public function queryDigitalLogisticCreditIssuescpticketresultEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditIssuescpticketresultResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuescpticketresult.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转A+模式发行信息上传
     * Summary: 信用流转A+模式发行信息上传
     * @param UploadDigitalLogisticCreditAplusissueRequest $request
     * @return UploadDigitalLogisticCreditAplusissueResponse
     */
    public function uploadDigitalLogisticCreditAplusissue($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticCreditAplusissueEx($request, $runtime);
    }

    /**
     * Description: 信用流转A+模式发行信息上传
     * Summary: 信用流转A+模式发行信息上传
     * @param UploadDigitalLogisticCreditAplusissueRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticCreditAplusissueResponse
     */
    public function uploadDigitalLogisticCreditAplusissueEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticCreditAplusissueResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.aplusissue.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转可用额度查询接口
     * Summary: 信用流转可用额度查询接口
     * @param QueryDigitalLogisticCreditCreditamountRequest $request
     * @return QueryDigitalLogisticCreditCreditamountResponse
     */
    public function queryDigitalLogisticCreditCreditamount($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditCreditamountEx($request, $runtime);
    }

    /**
     * Description: 信用流转可用额度查询接口
     * Summary: 信用流转可用额度查询接口
     * @param QueryDigitalLogisticCreditCreditamountRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditCreditamountResponse
     */
    public function queryDigitalLogisticCreditCreditamountEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditCreditamountResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.creditamount.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转非授信通用签约接口
     * Summary: 信用流转非授信通用签约接口
     * @param CreateDigitalLogisticCreditCommonsignRequest $request
     * @return CreateDigitalLogisticCreditCommonsignResponse
     */
    public function createDigitalLogisticCreditCommonsign($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticCreditCommonsignEx($request, $runtime);
    }

    /**
     * Description: 信用流转非授信通用签约接口
     * Summary: 信用流转非授信通用签约接口
     * @param CreateDigitalLogisticCreditCommonsignRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticCreditCommonsignResponse
     */
    public function createDigitalLogisticCreditCommonsignEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticCreditCommonsignResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.commonsign.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转非授信通用签约查询接口
     * Summary: 信用流转非授信通用签约查询接口
     * @param QueryDigitalLogisticCreditCommonsignRequest $request
     * @return QueryDigitalLogisticCreditCommonsignResponse
     */
    public function queryDigitalLogisticCreditCommonsign($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticCreditCommonsignEx($request, $runtime);
    }

    /**
     * Description: 信用流转非授信通用签约查询接口
     * Summary: 信用流转非授信通用签约查询接口
     * @param QueryDigitalLogisticCreditCommonsignRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticCreditCommonsignResponse
     */
    public function queryDigitalLogisticCreditCommonsignEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticCreditCommonsignResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.commonsign.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转凭证合并发行接口
     * Summary: 信用流转凭证合并发行接口
     * @param BatchcreateDigitalLogisticCreditIssueRequest $request
     * @return BatchcreateDigitalLogisticCreditIssueResponse
     */
    public function batchcreateDigitalLogisticCreditIssue($request){
        $runtime = new RuntimeOptions([]);
        return $this->batchcreateDigitalLogisticCreditIssueEx($request, $runtime);
    }

    /**
     * Description: 信用流转凭证合并发行接口
     * Summary: 信用流转凭证合并发行接口
     * @param BatchcreateDigitalLogisticCreditIssueRequest $request
     * @param RuntimeOptions $runtime
     * @return BatchcreateDigitalLogisticCreditIssueResponse
     */
    public function batchcreateDigitalLogisticCreditIssueEx($request, $runtime){
        Utils::validateModel($request);
        return BatchcreateDigitalLogisticCreditIssueResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issue.batchcreate", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用流转凭证合并发行信息上传接口
     * Summary: 信用流转凭证合并发行信息上传接口
     * @param UploadDigitalLogisticCreditIssuebatchRequest $request
     * @return UploadDigitalLogisticCreditIssuebatchResponse
     */
    public function uploadDigitalLogisticCreditIssuebatch($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticCreditIssuebatchEx($request, $runtime);
    }

    /**
     * Description: 信用流转凭证合并发行信息上传接口
     * Summary: 信用流转凭证合并发行信息上传接口
     * @param UploadDigitalLogisticCreditIssuebatchRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticCreditIssuebatchResponse
     */
    public function uploadDigitalLogisticCreditIssuebatchEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticCreditIssuebatchResponse::fromMap($this->doRequest("1.0", "digital.logistic.credit.issuebatch.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
     * Summary: 信用凭证电子回单获取(新)
     * @param GetDigitalLogisticIssueTransferfileRequest $request
     * @return GetDigitalLogisticIssueTransferfileResponse
     */
    public function getDigitalLogisticIssueTransferfile($request){
        $runtime = new RuntimeOptions([]);
        return $this->getDigitalLogisticIssueTransferfileEx($request, $runtime);
    }

    /**
     * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
     * Summary: 信用凭证电子回单获取(新)
     * @param GetDigitalLogisticIssueTransferfileRequest $request
     * @param RuntimeOptions $runtime
     * @return GetDigitalLogisticIssueTransferfileResponse
     */
    public function getDigitalLogisticIssueTransferfileEx($request, $runtime){
        Utils::validateModel($request);
        return GetDigitalLogisticIssueTransferfileResponse::fromMap($this->doRequest("1.0", "digital.logistic.issue.transferfile.get", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-中华财险-承运人责任险
     * @param ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest $request
     * @return ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse
     */
    public function applyDigitalLogisticInsurancepolicyZhonghuacaixian($request){
        $runtime = new RuntimeOptions([]);
        return $this->applyDigitalLogisticInsurancepolicyZhonghuacaixianEx($request, $runtime);
    }

    /**
     * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-中华财险-承运人责任险
     * @param ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse
     */
    public function applyDigitalLogisticInsurancepolicyZhonghuacaixianEx($request, $runtime){
        Utils::validateModel($request);
        return ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse::fromMap($this->doRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.apply", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-中华财险-承运人责任险
     * @param CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest $request
     * @return CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse
     */
    public function cancelDigitalLogisticInsurancepolicyZhonghuacaixian($request){
        $runtime = new RuntimeOptions([]);
        return $this->cancelDigitalLogisticInsurancepolicyZhonghuacaixianEx($request, $runtime);
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-中华财险-承运人责任险
     * @param CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest $request
     * @param RuntimeOptions $runtime
     * @return CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse
     */
    public function cancelDigitalLogisticInsurancepolicyZhonghuacaixianEx($request, $runtime){
        Utils::validateModel($request);
        return CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse::fromMap($this->doRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.cancel", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保险理赔通知
     * Summary: 保险理赔通知
     * @param PushDigitalLogisticInsurancenotifyClaimRequest $request
     * @return PushDigitalLogisticInsurancenotifyClaimResponse
     */
    public function pushDigitalLogisticInsurancenotifyClaim($request){
        $runtime = new RuntimeOptions([]);
        return $this->pushDigitalLogisticInsurancenotifyClaimEx($request, $runtime);
    }

    /**
     * Description: 保险理赔通知
     * Summary: 保险理赔通知
     * @param PushDigitalLogisticInsurancenotifyClaimRequest $request
     * @param RuntimeOptions $runtime
     * @return PushDigitalLogisticInsurancenotifyClaimResponse
     */
    public function pushDigitalLogisticInsurancenotifyClaimEx($request, $runtime){
        Utils::validateModel($request);
        return PushDigitalLogisticInsurancenotifyClaimResponse::fromMap($this->doRequest("1.0", "digital.logistic.insurancenotify.claim.push", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
     * Summary: 上传文件链接申请
     * @param ApplyDigitalLogisticInsuranceFileurlRequest $request
     * @return ApplyDigitalLogisticInsuranceFileurlResponse
     */
    public function applyDigitalLogisticInsuranceFileurl($request){
        $runtime = new RuntimeOptions([]);
        return $this->applyDigitalLogisticInsuranceFileurlEx($request, $runtime);
    }

    /**
     * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
     * Summary: 上传文件链接申请
     * @param ApplyDigitalLogisticInsuranceFileurlRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyDigitalLogisticInsuranceFileurlResponse
     */
    public function applyDigitalLogisticInsuranceFileurlEx($request, $runtime){
        Utils::validateModel($request);
        return ApplyDigitalLogisticInsuranceFileurlResponse::fromMap($this->doRequest("1.0", "digital.logistic.insurance.fileurl.apply", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
     * 接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-承运人平台责任险
     * @param ApplyDigitalLogisticInsurancepolicyUniversalRequest $request
     * @return ApplyDigitalLogisticInsurancepolicyUniversalResponse
     */
    public function applyDigitalLogisticInsurancepolicyUniversal($request){
        $runtime = new RuntimeOptions([]);
        return $this->applyDigitalLogisticInsurancepolicyUniversalEx($request, $runtime);
    }

    /**
     * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
     * 接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-承运人平台责任险
     * @param ApplyDigitalLogisticInsurancepolicyUniversalRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyDigitalLogisticInsurancepolicyUniversalResponse
     */
    public function applyDigitalLogisticInsurancepolicyUniversalEx($request, $runtime){
        Utils::validateModel($request);
        return ApplyDigitalLogisticInsurancepolicyUniversalResponse::fromMap($this->doRequest("1.0", "digital.logistic.insurancepolicy.universal.apply", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-承运人平台责任险
     * @param CancelDigitalLogisticInsurancepolicyUniversalRequest $request
     * @return CancelDigitalLogisticInsurancepolicyUniversalResponse
     */
    public function cancelDigitalLogisticInsurancepolicyUniversal($request){
        $runtime = new RuntimeOptions([]);
        return $this->cancelDigitalLogisticInsurancepolicyUniversalEx($request, $runtime);
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-承运人平台责任险
     * @param CancelDigitalLogisticInsurancepolicyUniversalRequest $request
     * @param RuntimeOptions $runtime
     * @return CancelDigitalLogisticInsurancepolicyUniversalResponse
     */
    public function cancelDigitalLogisticInsurancepolicyUniversalEx($request, $runtime){
        Utils::validateModel($request);
        return CancelDigitalLogisticInsurancepolicyUniversalResponse::fromMap($this->doRequest("1.0", "digital.logistic.insurancepolicy.universal.cancel", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 利用区块链智能合约进行离线保单存证
     * Summary: 离线保单存证推送
     * @param PushDigitalLogisticInsuranceOlpRequest $request
     * @return PushDigitalLogisticInsuranceOlpResponse
     */
    public function pushDigitalLogisticInsuranceOlp($request){
        $runtime = new RuntimeOptions([]);
        return $this->pushDigitalLogisticInsuranceOlpEx($request, $runtime);
    }

    /**
     * Description: 利用区块链智能合约进行离线保单存证
     * Summary: 离线保单存证推送
     * @param PushDigitalLogisticInsuranceOlpRequest $request
     * @param RuntimeOptions $runtime
     * @return PushDigitalLogisticInsuranceOlpResponse
     */
    public function pushDigitalLogisticInsuranceOlpEx($request, $runtime){
        Utils::validateModel($request);
        return PushDigitalLogisticInsuranceOlpResponse::fromMap($this->doRequest("1.0", "digital.logistic.insurance.olp.push", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 利用区块链智能合约进行离线保单信息更新追踪
     * Summary: 离线保单更新
     * @param UpdateDigitalLogisticInsuranceOlpRequest $request
     * @return UpdateDigitalLogisticInsuranceOlpResponse
     */
    public function updateDigitalLogisticInsuranceOlp($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticInsuranceOlpEx($request, $runtime);
    }

    /**
     * Description: 利用区块链智能合约进行离线保单信息更新追踪
     * Summary: 离线保单更新
     * @param UpdateDigitalLogisticInsuranceOlpRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticInsuranceOlpResponse
     */
    public function updateDigitalLogisticInsuranceOlpEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticInsuranceOlpResponse::fromMap($this->doRequest("1.0", "digital.logistic.insurance.olp.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 池融资委托支付入账查询
     * Summary: 委托支付入账查询
     * @param QueryDigitalLogisticPfPaymentRequest $request
     * @return QueryDigitalLogisticPfPaymentResponse
     */
    public function queryDigitalLogisticPfPayment($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticPfPaymentEx($request, $runtime);
    }

    /**
     * Description: 池融资委托支付入账查询
     * Summary: 委托支付入账查询
     * @param QueryDigitalLogisticPfPaymentRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticPfPaymentResponse
     */
    public function queryDigitalLogisticPfPaymentEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticPfPaymentResponse::fromMap($this->doRequest("1.0", "digital.logistic.pf.payment.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 池融资借据信息查询
     * Summary: 借据信息查询
     * @param QueryDigitalLogisticPfIouRequest $request
     * @return QueryDigitalLogisticPfIouResponse
     */
    public function queryDigitalLogisticPfIou($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticPfIouEx($request, $runtime);
    }

    /**
     * Description: 池融资借据信息查询
     * Summary: 借据信息查询
     * @param QueryDigitalLogisticPfIouRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticPfIouResponse
     */
    public function queryDigitalLogisticPfIouEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticPfIouResponse::fromMap($this->doRequest("1.0", "digital.logistic.pf.iou.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 池融资授信额度查询
     * Summary: 授信额度查询
     * @param QueryDigitalLogisticPfQuotaRequest $request
     * @return QueryDigitalLogisticPfQuotaResponse
     */
    public function queryDigitalLogisticPfQuota($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticPfQuotaEx($request, $runtime);
    }

    /**
     * Description: 池融资授信额度查询
     * Summary: 授信额度查询
     * @param QueryDigitalLogisticPfQuotaRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticPfQuotaResponse
     */
    public function queryDigitalLogisticPfQuotaEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticPfQuotaResponse::fromMap($this->doRequest("1.0", "digital.logistic.pf.quota.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 基于运单的融资申请
     * Summary: 运单融资申请
     * @param ApplyDigitalLogisticPfWaybillfinancingRequest $request
     * @return ApplyDigitalLogisticPfWaybillfinancingResponse
     */
    public function applyDigitalLogisticPfWaybillfinancing($request){
        $runtime = new RuntimeOptions([]);
        return $this->applyDigitalLogisticPfWaybillfinancingEx($request, $runtime);
    }

    /**
     * Description: 基于运单的融资申请
     * Summary: 运单融资申请
     * @param ApplyDigitalLogisticPfWaybillfinancingRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyDigitalLogisticPfWaybillfinancingResponse
     */
    public function applyDigitalLogisticPfWaybillfinancingEx($request, $runtime){
        Utils::validateModel($request);
        return ApplyDigitalLogisticPfWaybillfinancingResponse::fromMap($this->doRequest("1.0", "digital.logistic.pf.waybillfinancing.apply", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 池融资账单质押，用于入池
     * Summary: 池融资账单质押
     * @param PushDigitalLogisticPfPledgeRequest $request
     * @return PushDigitalLogisticPfPledgeResponse
     */
    public function pushDigitalLogisticPfPledge($request){
        $runtime = new RuntimeOptions([]);
        return $this->pushDigitalLogisticPfPledgeEx($request, $runtime);
    }

    /**
     * Description: 池融资账单质押，用于入池
     * Summary: 池融资账单质押
     * @param PushDigitalLogisticPfPledgeRequest $request
     * @param RuntimeOptions $runtime
     * @return PushDigitalLogisticPfPledgeResponse
     */
    public function pushDigitalLogisticPfPledgeEx($request, $runtime){
        Utils::validateModel($request);
        return PushDigitalLogisticPfPledgeResponse::fromMap($this->doRequest("1.0", "digital.logistic.pf.pledge.push", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 入池账单质押状态查询
     * Summary: 质押状态查询
     * @param QueryDigitalLogisticPfPledgeRequest $request
     * @return QueryDigitalLogisticPfPledgeResponse
     */
    public function queryDigitalLogisticPfPledge($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticPfPledgeEx($request, $runtime);
    }

    /**
     * Description: 入池账单质押状态查询
     * Summary: 质押状态查询
     * @param QueryDigitalLogisticPfPledgeRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticPfPledgeResponse
     */
    public function queryDigitalLogisticPfPledgeEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticPfPledgeResponse::fromMap($this->doRequest("1.0", "digital.logistic.pf.pledge.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 池融资融资支用状态查询
     * Summary: 池融资融资支用状态查询
     * @param QueryDigitalLogisticPfFinancingRequest $request
     * @return QueryDigitalLogisticPfFinancingResponse
     */
    public function queryDigitalLogisticPfFinancing($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticPfFinancingEx($request, $runtime);
    }

    /**
     * Description: 池融资融资支用状态查询
     * Summary: 池融资融资支用状态查询
     * @param QueryDigitalLogisticPfFinancingRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticPfFinancingResponse
     */
    public function queryDigitalLogisticPfFinancingEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticPfFinancingResponse::fromMap($this->doRequest("1.0", "digital.logistic.pf.financing.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 创建货代did
     * Summary: 创建货代did
     * @param CreateDigitalLogisticDidForwarderRequest $request
     * @return CreateDigitalLogisticDidForwarderResponse
     */
    public function createDigitalLogisticDidForwarder($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticDidForwarderEx($request, $runtime);
    }

    /**
     * Description: 创建货代did
     * Summary: 创建货代did
     * @param CreateDigitalLogisticDidForwarderRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticDidForwarderResponse
     */
    public function createDigitalLogisticDidForwarderEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticDidForwarderResponse::fromMap($this->doRequest("1.0", "digital.logistic.did.forwarder.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 创建saas平台did
     * Summary: 创建saas平台did
     * @param CreateDigitalLogisticDidSaasplatformRequest $request
     * @return CreateDigitalLogisticDidSaasplatformResponse
     */
    public function createDigitalLogisticDidSaasplatform($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticDidSaasplatformEx($request, $runtime);
    }

    /**
     * Description: 创建saas平台did
     * Summary: 创建saas平台did
     * @param CreateDigitalLogisticDidSaasplatformRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticDidSaasplatformResponse
     */
    public function createDigitalLogisticDidSaasplatformEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticDidSaasplatformResponse::fromMap($this->doRequest("1.0", "digital.logistic.did.saasplatform.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 创建直客did
     * Summary: 创建直客did
     * @param CreateDigitalLogisticDidClientRequest $request
     * @return CreateDigitalLogisticDidClientResponse
     */
    public function createDigitalLogisticDidClient($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticDidClientEx($request, $runtime);
    }

    /**
     * Description: 创建直客did
     * Summary: 创建直客did
     * @param CreateDigitalLogisticDidClientRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticDidClientResponse
     */
    public function createDigitalLogisticDidClientEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticDidClientResponse::fromMap($this->doRequest("1.0", "digital.logistic.did.client.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存订单
     * Summary: 保存订单
     * @param SaveDigitalLogisticBizOrderRequest $request
     * @return SaveDigitalLogisticBizOrderResponse
     */
    public function saveDigitalLogisticBizOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizOrderEx($request, $runtime);
    }

    /**
     * Description: 保存订单
     * Summary: 保存订单
     * @param SaveDigitalLogisticBizOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizOrderResponse
     */
    public function saveDigitalLogisticBizOrderEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizOrderResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.order.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存托单文件
     * Summary: 保存托单文件
     * @param SaveDigitalLogisticBizConsignorderRequest $request
     * @return SaveDigitalLogisticBizConsignorderResponse
     */
    public function saveDigitalLogisticBizConsignorder($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizConsignorderEx($request, $runtime);
    }

    /**
     * Description: 保存托单文件
     * Summary: 保存托单文件
     * @param SaveDigitalLogisticBizConsignorderRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizConsignorderResponse
     */
    public function saveDigitalLogisticBizConsignorderEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizConsignorderResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.consignorder.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存货物
     * Summary: 保存货物
     * @param SaveDigitalLogisticBizGoodsRequest $request
     * @return SaveDigitalLogisticBizGoodsResponse
     */
    public function saveDigitalLogisticBizGoods($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizGoodsEx($request, $runtime);
    }

    /**
     * Description: 保存货物
     * Summary: 保存货物
     * @param SaveDigitalLogisticBizGoodsRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizGoodsResponse
     */
    public function saveDigitalLogisticBizGoodsEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizGoodsResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.goods.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存SO入货通知
     * Summary: 保存SO入货通知
     * @param SaveDigitalLogisticBizSonotifyRequest $request
     * @return SaveDigitalLogisticBizSonotifyResponse
     */
    public function saveDigitalLogisticBizSonotify($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizSonotifyEx($request, $runtime);
    }

    /**
     * Description: 保存SO入货通知
     * Summary: 保存SO入货通知
     * @param SaveDigitalLogisticBizSonotifyRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizSonotifyResponse
     */
    public function saveDigitalLogisticBizSonotifyEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizSonotifyResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.sonotify.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存订舱单
     * Summary: 保存订舱单
     * @param SaveDigitalLogisticBizBookingorderRequest $request
     * @return SaveDigitalLogisticBizBookingorderResponse
     */
    public function saveDigitalLogisticBizBookingorder($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizBookingorderEx($request, $runtime);
    }

    /**
     * Description: 保存订舱单
     * Summary: 保存订舱单
     * @param SaveDigitalLogisticBizBookingorderRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizBookingorderResponse
     */
    public function saveDigitalLogisticBizBookingorderEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizBookingorderResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.bookingorder.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存集装箱
     * Summary: 保存集装箱
     * @param SaveDigitalLogisticBizContainerRequest $request
     * @return SaveDigitalLogisticBizContainerResponse
     */
    public function saveDigitalLogisticBizContainer($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizContainerEx($request, $runtime);
    }

    /**
     * Description: 保存集装箱
     * Summary: 保存集装箱
     * @param SaveDigitalLogisticBizContainerRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizContainerResponse
     */
    public function saveDigitalLogisticBizContainerEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizContainerResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.container.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存报关单
     * Summary: 保存报关单
     * @param SaveDigitalLogisticBizCustomsorderRequest $request
     * @return SaveDigitalLogisticBizCustomsorderResponse
     */
    public function saveDigitalLogisticBizCustomsorder($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizCustomsorderEx($request, $runtime);
    }

    /**
     * Description: 保存报关单
     * Summary: 保存报关单
     * @param SaveDigitalLogisticBizCustomsorderRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizCustomsorderResponse
     */
    public function saveDigitalLogisticBizCustomsorderEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizCustomsorderResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.customsorder.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存拖车单
     * Summary: 保存拖车单
     * @param SaveDigitalLogisticBizVehicleRequest $request
     * @return SaveDigitalLogisticBizVehicleResponse
     */
    public function saveDigitalLogisticBizVehicle($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizVehicleEx($request, $runtime);
    }

    /**
     * Description: 保存拖车单
     * Summary: 保存拖车单
     * @param SaveDigitalLogisticBizVehicleRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizVehicleResponse
     */
    public function saveDigitalLogisticBizVehicleEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizVehicleResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.vehicle.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存master提单
     * Summary: 保存master提单
     * @param SaveDigitalLogisticBizMasterblRequest $request
     * @return SaveDigitalLogisticBizMasterblResponse
     */
    public function saveDigitalLogisticBizMasterbl($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizMasterblEx($request, $runtime);
    }

    /**
     * Description: 保存master提单
     * Summary: 保存master提单
     * @param SaveDigitalLogisticBizMasterblRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizMasterblResponse
     */
    public function saveDigitalLogisticBizMasterblEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizMasterblResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.masterbl.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 内审完成
     * Summary: 内审完成
     * @param FinishDigitalLogisticBizAuditRequest $request
     * @return FinishDigitalLogisticBizAuditResponse
     */
    public function finishDigitalLogisticBizAudit($request){
        $runtime = new RuntimeOptions([]);
        return $this->finishDigitalLogisticBizAuditEx($request, $runtime);
    }

    /**
     * Description: 内审完成
     * Summary: 内审完成
     * @param FinishDigitalLogisticBizAuditRequest $request
     * @param RuntimeOptions $runtime
     * @return FinishDigitalLogisticBizAuditResponse
     */
    public function finishDigitalLogisticBizAuditEx($request, $runtime){
        Utils::validateModel($request);
        return FinishDigitalLogisticBizAuditResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.audit.finish", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存house提单
     * Summary: 保存house提单
     * @param SaveDigitalLogisticBizHouseblRequest $request
     * @return SaveDigitalLogisticBizHouseblResponse
     */
    public function saveDigitalLogisticBizHousebl($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizHouseblEx($request, $runtime);
    }

    /**
     * Description: 保存house提单
     * Summary: 保存house提单
     * @param SaveDigitalLogisticBizHouseblRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizHouseblResponse
     */
    public function saveDigitalLogisticBizHouseblEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizHouseblResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.housebl.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 创建应付账单
     * Summary: 创建应付账单(已下)
     * @param CreateDigitalLogisticBillPaybillorderRequest $request
     * @return CreateDigitalLogisticBillPaybillorderResponse
     */
    public function createDigitalLogisticBillPaybillorder($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticBillPaybillorderEx($request, $runtime);
    }

    /**
     * Description: 创建应付账单
     * Summary: 创建应付账单(已下)
     * @param CreateDigitalLogisticBillPaybillorderRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticBillPaybillorderResponse
     */
    public function createDigitalLogisticBillPaybillorderEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticBillPaybillorderResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.paybillorder.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 创建应收账单
     * Summary: 创建应收账单(已下)
     * @param CreateDigitalLogisticBillReceiptbillorderRequest $request
     * @return CreateDigitalLogisticBillReceiptbillorderResponse
     */
    public function createDigitalLogisticBillReceiptbillorder($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticBillReceiptbillorderEx($request, $runtime);
    }

    /**
     * Description: 创建应收账单
     * Summary: 创建应收账单(已下)
     * @param CreateDigitalLogisticBillReceiptbillorderRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticBillReceiptbillorderResponse
     */
    public function createDigitalLogisticBillReceiptbillorderEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticBillReceiptbillorderResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.receiptbillorder.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存应付资费项
     * Summary: 保存应付资费项
     * @param SaveDigitalLogisticBillPaybilltariffRequest $request
     * @return SaveDigitalLogisticBillPaybilltariffResponse
     */
    public function saveDigitalLogisticBillPaybilltariff($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBillPaybilltariffEx($request, $runtime);
    }

    /**
     * Description: 保存应付资费项
     * Summary: 保存应付资费项
     * @param SaveDigitalLogisticBillPaybilltariffRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBillPaybilltariffResponse
     */
    public function saveDigitalLogisticBillPaybilltariffEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBillPaybilltariffResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.paybilltariff.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存应收资费项
     * Summary: 保存应收资费项
     * @param SaveDigitalLogisticBillReceiptbilltariffRequest $request
     * @return SaveDigitalLogisticBillReceiptbilltariffResponse
     */
    public function saveDigitalLogisticBillReceiptbilltariff($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBillReceiptbilltariffEx($request, $runtime);
    }

    /**
     * Description: 保存应收资费项
     * Summary: 保存应收资费项
     * @param SaveDigitalLogisticBillReceiptbilltariffRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBillReceiptbilltariffResponse
     */
    public function saveDigitalLogisticBillReceiptbilltariffEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBillReceiptbilltariffResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.receiptbilltariff.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 核销应付资费项
     * Summary: 核销应付资费项
     * @param VerifyDigitalLogisticBillPaybillRequest $request
     * @return VerifyDigitalLogisticBillPaybillResponse
     */
    public function verifyDigitalLogisticBillPaybill($request){
        $runtime = new RuntimeOptions([]);
        return $this->verifyDigitalLogisticBillPaybillEx($request, $runtime);
    }

    /**
     * Description: 核销应付资费项
     * Summary: 核销应付资费项
     * @param VerifyDigitalLogisticBillPaybillRequest $request
     * @param RuntimeOptions $runtime
     * @return VerifyDigitalLogisticBillPaybillResponse
     */
    public function verifyDigitalLogisticBillPaybillEx($request, $runtime){
        Utils::validateModel($request);
        return VerifyDigitalLogisticBillPaybillResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.paybill.verify", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 核销应收资费项
     * Summary: 核销应收资费项
     * @param VerifyDigitalLogisticBillReceiptbillorderRequest $request
     * @return VerifyDigitalLogisticBillReceiptbillorderResponse
     */
    public function verifyDigitalLogisticBillReceiptbillorder($request){
        $runtime = new RuntimeOptions([]);
        return $this->verifyDigitalLogisticBillReceiptbillorderEx($request, $runtime);
    }

    /**
     * Description: 核销应收资费项
     * Summary: 核销应收资费项
     * @param VerifyDigitalLogisticBillReceiptbillorderRequest $request
     * @param RuntimeOptions $runtime
     * @return VerifyDigitalLogisticBillReceiptbillorderResponse
     */
    public function verifyDigitalLogisticBillReceiptbillorderEx($request, $runtime){
        Utils::validateModel($request);
        return VerifyDigitalLogisticBillReceiptbillorderResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.receiptbillorder.verify", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 更新应付账单
     * Summary: 更新应付账单
     * @param UpdateDigitalLogisticBillPaybillorderRequest $request
     * @return UpdateDigitalLogisticBillPaybillorderResponse
     */
    public function updateDigitalLogisticBillPaybillorder($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticBillPaybillorderEx($request, $runtime);
    }

    /**
     * Description: 更新应付账单
     * Summary: 更新应付账单
     * @param UpdateDigitalLogisticBillPaybillorderRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticBillPaybillorderResponse
     */
    public function updateDigitalLogisticBillPaybillorderEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticBillPaybillorderResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.paybillorder.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 更新应收账单
     * Summary: 更新应收账单
     * @param UpdateDigitalLogisticBillReceiptbillorderRequest $request
     * @return UpdateDigitalLogisticBillReceiptbillorderResponse
     */
    public function updateDigitalLogisticBillReceiptbillorder($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticBillReceiptbillorderEx($request, $runtime);
    }

    /**
     * Description: 更新应收账单
     * Summary: 更新应收账单
     * @param UpdateDigitalLogisticBillReceiptbillorderRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticBillReceiptbillorderResponse
     */
    public function updateDigitalLogisticBillReceiptbillorderEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticBillReceiptbillorderResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.receiptbillorder.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存应付发票
     * Summary: 保存应付发票
     * @param SaveDigitalLogisticBillPayinvoiceRequest $request
     * @return SaveDigitalLogisticBillPayinvoiceResponse
     */
    public function saveDigitalLogisticBillPayinvoice($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBillPayinvoiceEx($request, $runtime);
    }

    /**
     * Description: 保存应付发票
     * Summary: 保存应付发票
     * @param SaveDigitalLogisticBillPayinvoiceRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBillPayinvoiceResponse
     */
    public function saveDigitalLogisticBillPayinvoiceEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBillPayinvoiceResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.payinvoice.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 保存应收发票
     * Summary: 保存应收发票
     * @param SaveDigitalLogisticBillReceiptinvoiceRequest $request
     * @return SaveDigitalLogisticBillReceiptinvoiceResponse
     */
    public function saveDigitalLogisticBillReceiptinvoice($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBillReceiptinvoiceEx($request, $runtime);
    }

    /**
     * Description: 保存应收发票
     * Summary: 保存应收发票
     * @param SaveDigitalLogisticBillReceiptinvoiceRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBillReceiptinvoiceResponse
     */
    public function saveDigitalLogisticBillReceiptinvoiceEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBillReceiptinvoiceResponse::fromMap($this->doRequest("1.0", "digital.logistic.bill.receiptinvoice.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 上传历史数据
     * Summary: 上传历史数据
     * @param UploadDigitalLogisticBizFinancingRequest $request
     * @return UploadDigitalLogisticBizFinancingResponse
     */
    public function uploadDigitalLogisticBizFinancing($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticBizFinancingEx($request, $runtime);
    }

    /**
     * Description: 上传历史数据
     * Summary: 上传历史数据
     * @param UploadDigitalLogisticBizFinancingRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticBizFinancingResponse
     */
    public function uploadDigitalLogisticBizFinancingEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticBizFinancingResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.financing.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 上传订单
     * Summary: 上传订单
     * @param UploadDigitalLogisticBizOrderRequest $request
     * @return UploadDigitalLogisticBizOrderResponse
     */
    public function uploadDigitalLogisticBizOrder($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticBizOrderEx($request, $runtime);
    }

    /**
     * Description: 上传订单
     * Summary: 上传订单
     * @param UploadDigitalLogisticBizOrderRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticBizOrderResponse
     */
    public function uploadDigitalLogisticBizOrderEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticBizOrderResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.order.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 创建船公司did账户
     * Summary: 创建船公司did账户
     * @param CreateDigitalLogisticDidCarrierRequest $request
     * @return CreateDigitalLogisticDidCarrierResponse
     */
    public function createDigitalLogisticDidCarrier($request){
        $runtime = new RuntimeOptions([]);
        return $this->createDigitalLogisticDidCarrierEx($request, $runtime);
    }

    /**
     * Description: 创建船公司did账户
     * Summary: 创建船公司did账户
     * @param CreateDigitalLogisticDidCarrierRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateDigitalLogisticDidCarrierResponse
     */
    public function createDigitalLogisticDidCarrierEx($request, $runtime){
        Utils::validateModel($request);
        return CreateDigitalLogisticDidCarrierResponse::fromMap($this->doRequest("1.0", "digital.logistic.did.carrier.create", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description:  货代授权
     * Summary:  货代授权
     * @param AuthDigitalLogisticSysForwarderRequest $request
     * @return AuthDigitalLogisticSysForwarderResponse
     */
    public function authDigitalLogisticSysForwarder($request){
        $runtime = new RuntimeOptions([]);
        return $this->authDigitalLogisticSysForwarderEx($request, $runtime);
    }

    /**
     * Description:  货代授权
     * Summary:  货代授权
     * @param AuthDigitalLogisticSysForwarderRequest $request
     * @param RuntimeOptions $runtime
     * @return AuthDigitalLogisticSysForwarderResponse
     */
    public function authDigitalLogisticSysForwarderEx($request, $runtime){
        Utils::validateModel($request);
        return AuthDigitalLogisticSysForwarderResponse::fromMap($this->doRequest("1.0", "digital.logistic.sys.forwarder.auth", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: master提单信息查询
     * Summary: master提单信息查询
     * @param QueryDigitalLogisticBizMasterblRequest $request
     * @return QueryDigitalLogisticBizMasterblResponse
     */
    public function queryDigitalLogisticBizMasterbl($request){
        $runtime = new RuntimeOptions([]);
        return $this->queryDigitalLogisticBizMasterblEx($request, $runtime);
    }

    /**
     * Description: master提单信息查询
     * Summary: master提单信息查询
     * @param QueryDigitalLogisticBizMasterblRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryDigitalLogisticBizMasterblResponse
     */
    public function queryDigitalLogisticBizMasterblEx($request, $runtime){
        Utils::validateModel($request);
        return QueryDigitalLogisticBizMasterblResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.masterbl.query", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 应付发票文件上传接口
     * Summary: 应付发票文件上传接口
     * @param SaveDigitalLogisticBizPayinvoicefileRequest $request
     * @return SaveDigitalLogisticBizPayinvoicefileResponse
     */
    public function saveDigitalLogisticBizPayinvoicefile($request){
        $runtime = new RuntimeOptions([]);
        return $this->saveDigitalLogisticBizPayinvoicefileEx($request, $runtime);
    }

    /**
     * Description: 应付发票文件上传接口
     * Summary: 应付发票文件上传接口
     * @param SaveDigitalLogisticBizPayinvoicefileRequest $request
     * @param RuntimeOptions $runtime
     * @return SaveDigitalLogisticBizPayinvoicefileResponse
     */
    public function saveDigitalLogisticBizPayinvoicefileEx($request, $runtime){
        Utils::validateModel($request);
        return SaveDigitalLogisticBizPayinvoicefileResponse::fromMap($this->doRequest("1.0", "digital.logistic.biz.payinvoicefile.save", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 上传电子提单
     * Summary: 上传电子提单
     * @param UploadDigitalLogisticShippingEblRequest $request
     * @return UploadDigitalLogisticShippingEblResponse
     */
    public function uploadDigitalLogisticShippingEbl($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticShippingEblEx($request, $runtime);
    }

    /**
     * Description: 上传电子提单
     * Summary: 上传电子提单
     * @param UploadDigitalLogisticShippingEblRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticShippingEblResponse
     */
    public function uploadDigitalLogisticShippingEblEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticShippingEblResponse::fromMap($this->doRequest("1.0", "digital.logistic.shipping.ebl.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 电子提单批次上传，一个I批次下传递多个提单
     * Summary: 电子提单批次上传
     * @param UploadDigitalLogisticShippingEblbatchRequest $request
     * @return UploadDigitalLogisticShippingEblbatchResponse
     */
    public function uploadDigitalLogisticShippingEblbatch($request){
        $runtime = new RuntimeOptions([]);
        return $this->uploadDigitalLogisticShippingEblbatchEx($request, $runtime);
    }

    /**
     * Description: 电子提单批次上传，一个I批次下传递多个提单
     * Summary: 电子提单批次上传
     * @param UploadDigitalLogisticShippingEblbatchRequest $request
     * @param RuntimeOptions $runtime
     * @return UploadDigitalLogisticShippingEblbatchResponse
     */
    public function uploadDigitalLogisticShippingEblbatchEx($request, $runtime){
        Utils::validateModel($request);
        return UploadDigitalLogisticShippingEblbatchResponse::fromMap($this->doRequest("1.0", "digital.logistic.shipping.eblbatch.upload", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }

    /**
     * Description: 感知收货人提单状态的变更
     * Summary: 电子提单批次状态变更
     * @param UpdateDigitalLogisticShippingEblbatchstatusRequest $request
     * @return UpdateDigitalLogisticShippingEblbatchstatusResponse
     */
    public function updateDigitalLogisticShippingEblbatchstatus($request){
        $runtime = new RuntimeOptions([]);
        return $this->updateDigitalLogisticShippingEblbatchstatusEx($request, $runtime);
    }

    /**
     * Description: 感知收货人提单状态的变更
     * Summary: 电子提单批次状态变更
     * @param UpdateDigitalLogisticShippingEblbatchstatusRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateDigitalLogisticShippingEblbatchstatusResponse
     */
    public function updateDigitalLogisticShippingEblbatchstatusEx($request, $runtime){
        Utils::validateModel($request);
        return UpdateDigitalLogisticShippingEblbatchstatusResponse::fromMap($this->doRequest("1.0", "digital.logistic.shipping.eblbatchstatus.update", "HTTPS", "POST", "/gateway.do", $request->toMap(), $runtime));
    }
}
