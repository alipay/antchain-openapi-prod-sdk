<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BOT\Models\AddAbnormalRequest;
use AntChain\BOT\Models\AddAbnormalResponse;
use AntChain\BOT\Models\AddAlertStrategyRequest;
use AntChain\BOT\Models\AddAlertStrategyResponse;
use AntChain\BOT\Models\AddCertificateRequest;
use AntChain\BOT\Models\AddCertificateResponse;
use AntChain\BOT\Models\AddDevicecorpDeviceattributesRequest;
use AntChain\BOT\Models\AddDevicecorpDeviceattributesResponse;
use AntChain\BOT\Models\AddGoodsSkuRequest;
use AntChain\BOT\Models\AddGoodsSkuResponse;
use AntChain\BOT\Models\AddLabelAssetRequest;
use AntChain\BOT\Models\AddLabelAssetResponse;
use AntChain\BOT\Models\AddProductkeyRequest;
use AntChain\BOT\Models\AddProductkeyResponse;
use AntChain\BOT\Models\AddSceneRequest;
use AntChain\BOT\Models\AddSceneResponse;
use AntChain\BOT\Models\AddSdkRequest;
use AntChain\BOT\Models\AddSdkResponse;
use AntChain\BOT\Models\AddTenantRequest;
use AntChain\BOT\Models\AddTenantResponse;
use AntChain\BOT\Models\AddUserRoleRequest;
use AntChain\BOT\Models\AddUserRoleResponse;
use AntChain\BOT\Models\ApplyMqtokenRequest;
use AntChain\BOT\Models\ApplyMqtokenResponse;
use AntChain\BOT\Models\ApplyTechintegrationSkushipbyuidRequest;
use AntChain\BOT\Models\ApplyTechintegrationSkushipbyuidResponse;
use AntChain\BOT\Models\ApplyTechintegrationSkushipRequest;
use AntChain\BOT\Models\ApplyTechintegrationSkushipResponse;
use AntChain\BOT\Models\BatchcreateDevicecorpDeviceRequest;
use AntChain\BOT\Models\BatchcreateDevicecorpDeviceResponse;
use AntChain\BOT\Models\BatchcreateIotbasicDeviceRequest;
use AntChain\BOT\Models\BatchcreateIotbasicDeviceResponse;
use AntChain\BOT\Models\BatchcreateXrXrticketpoolRequest;
use AntChain\BOT\Models\BatchcreateXrXrticketpoolResponse;
use AntChain\BOT\Models\BindEntityrelationRequest;
use AntChain\BOT\Models\BindEntityrelationResponse;
use AntChain\BOT\Models\CallbackThingServicebyeventRequest;
use AntChain\BOT\Models\CallbackThingServicebyeventResponse;
use AntChain\BOT\Models\CancelDigitalkeyPreauthpayRequest;
use AntChain\BOT\Models\CancelDigitalkeyPreauthpayResponse;
use AntChain\BOT\Models\CancelDigitalkeyWithholdpayRequest;
use AntChain\BOT\Models\CancelDigitalkeyWithholdpayResponse;
use AntChain\BOT\Models\CancelIotlinkAppreleasedeviceRequest;
use AntChain\BOT\Models\CancelIotlinkAppreleasedeviceResponse;
use AntChain\BOT\Models\CancelIotlinkAppreleaseorderRequest;
use AntChain\BOT\Models\CancelIotlinkAppreleaseorderResponse;
use AntChain\BOT\Models\CertifyIotbasicDeviceRequest;
use AntChain\BOT\Models\CertifyIotbasicDeviceResponse;
use AntChain\BOT\Models\CheckAiidentificationGoodsdigitalfingerprintRequest;
use AntChain\BOT\Models\CheckAiidentificationGoodsdigitalfingerprintResponse;
use AntChain\BOT\Models\CheckAiidentificationGoodspointRequest;
use AntChain\BOT\Models\CheckAiidentificationGoodspointResponse;
use AntChain\BOT\Models\CheckAiidentificationQrcodeRequest;
use AntChain\BOT\Models\CheckAiidentificationQrcodeResponse;
use AntChain\BOT\Models\ConfirmCollectorUploadfileRequest;
use AntChain\BOT\Models\ConfirmCollectorUploadfileResponse;
use AntChain\BOT\Models\CreateAcsDeviceRequest;
use AntChain\BOT\Models\CreateAcsDeviceResponse;
use AntChain\BOT\Models\CreateAiidentificationQrcodeRequest;
use AntChain\BOT\Models\CreateAiidentificationQrcodeResponse;
use AntChain\BOT\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\BOT\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\BOT\Models\CreateCategoryCustomRequest;
use AntChain\BOT\Models\CreateCategoryCustomResponse;
use AntChain\BOT\Models\CreateCollectorUploadfileurlRequest;
use AntChain\BOT\Models\CreateCollectorUploadfileurlResponse;
use AntChain\BOT\Models\CreateConsumerRequest;
use AntChain\BOT\Models\CreateConsumerResponse;
use AntChain\BOT\Models\CreateCustomerEntityRequest;
use AntChain\BOT\Models\CreateCustomerEntityResponse;
use AntChain\BOT\Models\CreateDevicecorpDeviceRequest;
use AntChain\BOT\Models\CreateDevicecorpDeviceResponse;
use AntChain\BOT\Models\CreateDevicecorpThingmodelRequest;
use AntChain\BOT\Models\CreateDevicecorpThingmodelResponse;
use AntChain\BOT\Models\CreateDeviceDatamodelRequest;
use AntChain\BOT\Models\CreateDeviceDatamodelResponse;
use AntChain\BOT\Models\CreateDeviceModelRequest;
use AntChain\BOT\Models\CreateDeviceModelResponse;
use AntChain\BOT\Models\CreateDeviceRelationRequest;
use AntChain\BOT\Models\CreateDeviceRelationResponse;
use AntChain\BOT\Models\CreateDigitalkeyPreauthpayRequest;
use AntChain\BOT\Models\CreateDigitalkeyPreauthpayResponse;
use AntChain\BOT\Models\CreateDigitalkeyWithholdsignRequest;
use AntChain\BOT\Models\CreateDigitalkeyWithholdsignResponse;
use AntChain\BOT\Models\CreateDistributedeviceBychainidRequest;
use AntChain\BOT\Models\CreateDistributedeviceBychainidResponse;
use AntChain\BOT\Models\CreateDistributedeviceBychainperipheralidRequest;
use AntChain\BOT\Models\CreateDistributedeviceBychainperipheralidResponse;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceidmulRequest;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceidmulResponse;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceidRequest;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceidResponse;
use AntChain\BOT\Models\CreateDistributedeviceBydevicemulRequest;
use AntChain\BOT\Models\CreateDistributedeviceBydevicemulResponse;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceRequest;
use AntChain\BOT\Models\CreateDistributedeviceBydeviceResponse;
use AntChain\BOT\Models\CreateDistributedeviceByperipheralidRequest;
use AntChain\BOT\Models\CreateDistributedeviceByperipheralidResponse;
use AntChain\BOT\Models\CreateElectrocarApplycarkeycertificateRequest;
use AntChain\BOT\Models\CreateElectrocarApplycarkeycertificateResponse;
use AntChain\BOT\Models\CreateIotbasicDeviceRequest;
use AntChain\BOT\Models\CreateIotbasicDeviceResponse;
use AntChain\BOT\Models\CreateIotbasicProductRequest;
use AntChain\BOT\Models\CreateIotbasicProductResponse;
use AntChain\BOT\Models\CreateIotlinkAppmanagerRequest;
use AntChain\BOT\Models\CreateIotlinkAppmanagerResponse;
use AntChain\BOT\Models\CreateIotlinkOtamoduleRequest;
use AntChain\BOT\Models\CreateIotlinkOtamoduleResponse;
use AntChain\BOT\Models\CreateLeaseRealpersonRequest;
use AntChain\BOT\Models\CreateLeaseRealpersonResponse;
use AntChain\BOT\Models\CreateOnlinepressuretestRequest;
use AntChain\BOT\Models\CreateOnlinepressuretestResponse;
use AntChain\BOT\Models\CreateTaskRequest;
use AntChain\BOT\Models\CreateTaskResponse;
use AntChain\BOT\Models\CreateTenantProjectRequest;
use AntChain\BOT\Models\CreateTenantProjectResponse;
use AntChain\BOT\Models\CreateThingmodelEventRequest;
use AntChain\BOT\Models\CreateThingmodelEventResponse;
use AntChain\BOT\Models\CreateThingmodelRequest;
use AntChain\BOT\Models\CreateThingmodelResponse;
use AntChain\BOT\Models\CreateXrUserticketRequest;
use AntChain\BOT\Models\CreateXrUserticketResponse;
use AntChain\BOT\Models\CreateXrXrticketpoolRequest;
use AntChain\BOT\Models\CreateXrXrticketpoolResponse;
use AntChain\BOT\Models\DeleteDevicecorpThingmodelRequest;
use AntChain\BOT\Models\DeleteDevicecorpThingmodelResponse;
use AntChain\BOT\Models\DeleteDeviceRelationRequest;
use AntChain\BOT\Models\DeleteDeviceRelationResponse;
use AntChain\BOT\Models\DeleteIotbasicDeviceRequest;
use AntChain\BOT\Models\DeleteIotbasicDeviceResponse;
use AntChain\BOT\Models\DeleteIotlinkOtamoduleRequest;
use AntChain\BOT\Models\DeleteIotlinkOtamoduleResponse;
use AntChain\BOT\Models\DeploySceneRequest;
use AntChain\BOT\Models\DeploySceneResponse;
use AntChain\BOT\Models\DeployThingudfRequest;
use AntChain\BOT\Models\DeployThingudfResponse;
use AntChain\BOT\Models\DetailThingmodelDeviceRequest;
use AntChain\BOT\Models\DetailThingmodelDeviceResponse;
use AntChain\BOT\Models\DetailXrXrticketpoolRequest;
use AntChain\BOT\Models\DetailXrXrticketpoolResponse;
use AntChain\BOT\Models\ExecDeviceCustomerthingserviceRequest;
use AntChain\BOT\Models\ExecDeviceCustomerthingserviceResponse;
use AntChain\BOT\Models\ExecDeviceThingserviceRequest;
use AntChain\BOT\Models\ExecDeviceThingserviceResponse;
use AntChain\BOT\Models\ExecDeviceUsertopicRequest;
use AntChain\BOT\Models\ExecDeviceUsertopicResponse;
use AntChain\BOT\Models\ExecThingsdidOneapiRequest;
use AntChain\BOT\Models\ExecThingsdidOneapiResponse;
use AntChain\BOT\Models\ExecThingServiceRequest;
use AntChain\BOT\Models\ExecThingServiceResponse;
use AntChain\BOT\Models\ExecUnprocessedTaskRequest;
use AntChain\BOT\Models\ExecUnprocessedTaskResponse;
use AntChain\BOT\Models\FinishTraceConfigRequest;
use AntChain\BOT\Models\FinishTraceConfigResponse;
use AntChain\BOT\Models\GetAiidentificationQrcodeRequest;
use AntChain\BOT\Models\GetAiidentificationQrcodeResponse;
use AntChain\BOT\Models\GetDeviceBychainidRequest;
use AntChain\BOT\Models\GetDeviceBychainidResponse;
use AntChain\BOT\Models\GetDeviceBydeviceidRequest;
use AntChain\BOT\Models\GetDeviceBydeviceidResponse;
use AntChain\BOT\Models\GetDevicecorpProductinfoRequest;
use AntChain\BOT\Models\GetDevicecorpProductinfoResponse;
use AntChain\BOT\Models\GetDeviceDatamodelRequest;
use AntChain\BOT\Models\GetDeviceDatamodelResponse;
use AntChain\BOT\Models\GetDigitalkeyDeviceinfoRequest;
use AntChain\BOT\Models\GetDigitalkeyDeviceinfoResponse;
use AntChain\BOT\Models\GetDistributedeviceBychainidRequest;
use AntChain\BOT\Models\GetDistributedeviceBychainidResponse;
use AntChain\BOT\Models\GetDistributedeviceBydeviceidRequest;
use AntChain\BOT\Models\GetDistributedeviceBydeviceidResponse;
use AntChain\BOT\Models\GetDistributedeviceBydisidRequest;
use AntChain\BOT\Models\GetDistributedeviceBydisidResponse;
use AntChain\BOT\Models\GetDistributedeviceByperipheralidRequest;
use AntChain\BOT\Models\GetDistributedeviceByperipheralidResponse;
use AntChain\BOT\Models\GetIotlinkAppmanagerfileurlRequest;
use AntChain\BOT\Models\GetIotlinkAppmanagerfileurlResponse;
use AntChain\BOT\Models\GetPeripheralBychainperipheralidRequest;
use AntChain\BOT\Models\GetPeripheralBychainperipheralidResponse;
use AntChain\BOT\Models\GetPeripheralByperipheralidRequest;
use AntChain\BOT\Models\GetPeripheralByperipheralidResponse;
use AntChain\BOT\Models\GetXrUserticketRequest;
use AntChain\BOT\Models\GetXrUserticketResponse;
use AntChain\BOT\Models\ImportDeviceRequest;
use AntChain\BOT\Models\ImportDeviceResponse;
use AntChain\BOT\Models\ImportIotbasicDeviceorderbatchRequest;
use AntChain\BOT\Models\ImportIotbasicDeviceorderbatchResponse;
use AntChain\BOT\Models\ImportIotbasicDeviceorderRequest;
use AntChain\BOT\Models\ImportIotbasicDeviceorderResponse;
use AntChain\BOT\Models\ImportIotlinkThingmodeltslRequest;
use AntChain\BOT\Models\ImportIotlinkThingmodeltslResponse;
use AntChain\BOT\Models\ImportIotplatformMeshidRequest;
use AntChain\BOT\Models\ImportIotplatformMeshidResponse;
use AntChain\BOT\Models\ImportPeripheralRequest;
use AntChain\BOT\Models\ImportPeripheralResponse;
use AntChain\BOT\Models\ImportPurchaseorderThirdpartyRequest;
use AntChain\BOT\Models\ImportPurchaseorderThirdpartyResponse;
use AntChain\BOT\Models\ImportTechintegrationSkugrantwhitelistRequest;
use AntChain\BOT\Models\ImportTechintegrationSkugrantwhitelistResponse;
use AntChain\BOT\Models\InitIotbasicDevicekeyRequest;
use AntChain\BOT\Models\InitIotbasicDevicekeyResponse;
use AntChain\BOT\Models\ListDeviceBysceneRequest;
use AntChain\BOT\Models\ListDeviceBysceneResponse;
use AntChain\BOT\Models\ListDistributedeviceByperipheralsceneRequest;
use AntChain\BOT\Models\ListDistributedeviceByperipheralsceneResponse;
use AntChain\BOT\Models\ListDistributedeviceBysceneRequest;
use AntChain\BOT\Models\ListDistributedeviceBysceneResponse;
use AntChain\BOT\Models\ListIotlinkOtamoduleRequest;
use AntChain\BOT\Models\ListIotlinkOtamoduleResponse;
use AntChain\BOT\Models\ListPeripheralBysceneRequest;
use AntChain\BOT\Models\ListPeripheralBysceneResponse;
use AntChain\BOT\Models\ListXrResourceRequest;
use AntChain\BOT\Models\ListXrResourceResponse;
use AntChain\BOT\Models\ListXrXrticketpoolRequest;
use AntChain\BOT\Models\ListXrXrticketpoolResponse;
use AntChain\BOT\Models\ListXrXrverificationmodelinstanceRequest;
use AntChain\BOT\Models\ListXrXrverificationmodelinstanceResponse;
use AntChain\BOT\Models\LoadTsmCertificatetsmRequest;
use AntChain\BOT\Models\LoadTsmCertificatetsmResponse;
use AntChain\BOT\Models\LoadTsmResourcefileRequest;
use AntChain\BOT\Models\LoadTsmResourcefileResponse;
use AntChain\BOT\Models\NotifyDigitalkeyWithholdpreRequest;
use AntChain\BOT\Models\NotifyDigitalkeyWithholdpreResponse;
use AntChain\BOT\Models\NotifyPullstrategyChangestatusRequest;
use AntChain\BOT\Models\NotifyPullstrategyChangestatusResponse;
use AntChain\BOT\Models\NotifyPullstrategyChargeorderinfoRequest;
use AntChain\BOT\Models\NotifyPullstrategyChargeorderinfoResponse;
use AntChain\BOT\Models\NotifyThirddeviceMessageRequest;
use AntChain\BOT\Models\NotifyThirddeviceMessageResponse;
use AntChain\BOT\Models\OfflineDeviceByunregisterRequest;
use AntChain\BOT\Models\OfflineDeviceByunregisterResponse;
use AntChain\BOT\Models\OfflineDeviceRequest;
use AntChain\BOT\Models\OfflineDeviceResponse;
use AntChain\BOT\Models\OnlineDeviceRequest;
use AntChain\BOT\Models\OnlineDeviceResponse;
use AntChain\BOT\Models\OpenAcecContractRequest;
use AntChain\BOT\Models\OpenAcecContractResponse;
use AntChain\BOT\Models\OpenIotplantformProductRequest;
use AntChain\BOT\Models\OpenIotplantformProductResponse;
use AntChain\BOT\Models\OperateAiotnextbsOpenapiRequest;
use AntChain\BOT\Models\OperateAiotnextbsOpenapiResponse;
use AntChain\BOT\Models\OperateDevicecorpDevicecontrolRequest;
use AntChain\BOT\Models\OperateDevicecorpDevicecontrolResponse;
use AntChain\BOT\Models\OperateIotbasicBatchcollectRequest;
use AntChain\BOT\Models\OperateIotbasicBatchcollectResponse;
use AntChain\BOT\Models\OperateIotbasicCategoryRequest;
use AntChain\BOT\Models\OperateIotbasicCategoryResponse;
use AntChain\BOT\Models\OperateIotbasicChainmodelRequest;
use AntChain\BOT\Models\OperateIotbasicChainmodelResponse;
use AntChain\BOT\Models\OperateIotbasicControlconfigRequest;
use AntChain\BOT\Models\OperateIotbasicControlconfigResponse;
use AntChain\BOT\Models\OperateIotbasicDevicecollectRequest;
use AntChain\BOT\Models\OperateIotbasicDevicecollectResponse;
use AntChain\BOT\Models\OperateIotbasicDevicecontrolRequest;
use AntChain\BOT\Models\OperateIotbasicDevicecontrolResponse;
use AntChain\BOT\Models\OperateIotbasicDeviceRequest;
use AntChain\BOT\Models\OperateIotbasicDeviceResponse;
use AntChain\BOT\Models\OperateIotbasicDictionaryRequest;
use AntChain\BOT\Models\OperateIotbasicDictionaryResponse;
use AntChain\BOT\Models\OperateIotbasicOpenapiRequest;
use AntChain\BOT\Models\OperateIotbasicOpenapiResponse;
use AntChain\BOT\Models\OperateIotbasicPermissionRequest;
use AntChain\BOT\Models\OperateIotbasicPermissionResponse;
use AntChain\BOT\Models\OperateIotbasicProjectspaceRequest;
use AntChain\BOT\Models\OperateIotbasicProjectspaceResponse;
use AntChain\BOT\Models\OperateIotbasicRelrationRequest;
use AntChain\BOT\Models\OperateIotbasicRelrationResponse;
use AntChain\BOT\Models\OperateIotbasicUserRequest;
use AntChain\BOT\Models\OperateIotbasicUserResponse;
use AntChain\BOT\Models\OperateXrUserticketRequest;
use AntChain\BOT\Models\OperateXrUserticketResponse;
use AntChain\BOT\Models\PagequeryAlertStrategyRequest;
use AntChain\BOT\Models\PagequeryAlertStrategyResponse;
use AntChain\BOT\Models\PagequeryDataverifyFailureRequest;
use AntChain\BOT\Models\PagequeryDataverifyFailureResponse;
use AntChain\BOT\Models\PagequeryEbikeOperationlogRequest;
use AntChain\BOT\Models\PagequeryEbikeOperationlogResponse;
use AntChain\BOT\Models\PagequeryIotlinkAppmanagerRequest;
use AntChain\BOT\Models\PagequeryIotlinkAppmanagerResponse;
use AntChain\BOT\Models\PagequeryIotlinkAppreleasedeviceRequest;
use AntChain\BOT\Models\PagequeryIotlinkAppreleasedeviceResponse;
use AntChain\BOT\Models\PagequeryIotlinkAppreleaseorderRequest;
use AntChain\BOT\Models\PagequeryIotlinkAppreleaseorderResponse;
use AntChain\BOT\Models\PagequeryProductkeyRequest;
use AntChain\BOT\Models\PagequeryProductkeyResponse;
use AntChain\BOT\Models\PagequerySceneRequest;
use AntChain\BOT\Models\PagequerySceneResponse;
use AntChain\BOT\Models\PagequerySdkRequest;
use AntChain\BOT\Models\PagequerySdkResponse;
use AntChain\BOT\Models\PagequeryTenantRequest;
use AntChain\BOT\Models\PagequeryTenantResponse;
use AntChain\BOT\Models\PagequeryXrCustomerdeviceRequest;
use AntChain\BOT\Models\PagequeryXrCustomerdeviceResponse;
use AntChain\BOT\Models\PagequeryXrUserticketRequest;
use AntChain\BOT\Models\PagequeryXrUserticketResponse;
use AntChain\BOT\Models\PagequeryXrXrticketpoolRequest;
use AntChain\BOT\Models\PagequeryXrXrticketpoolResponse;
use AntChain\BOT\Models\PagequeryXrXrverificationmodelRequest;
use AntChain\BOT\Models\PagequeryXrXrverificationmodelResponse;
use AntChain\BOT\Models\PayDigitalkeyWithholdRequest;
use AntChain\BOT\Models\PayDigitalkeyWithholdResponse;
use AntChain\BOT\Models\PublishDevicecorpThingmodelRequest;
use AntChain\BOT\Models\PublishDevicecorpThingmodelResponse;
use AntChain\BOT\Models\PublishIotlinkAppreleaseorderRequest;
use AntChain\BOT\Models\PublishIotlinkAppreleaseorderResponse;
use AntChain\BOT\Models\PullConsumerDatasourceRequest;
use AntChain\BOT\Models\PullConsumerDatasourceResponse;
use AntChain\BOT\Models\PushCollectotBychainidRequest;
use AntChain\BOT\Models\PushCollectotBychainidResponse;
use AntChain\BOT\Models\PushDeviceMessageRequest;
use AntChain\BOT\Models\PushDeviceMessageResponse;
use AntChain\BOT\Models\PushIotbasicMeterdataRequest;
use AntChain\BOT\Models\PushIotbasicMeterdataResponse;
use AntChain\BOT\Models\PushMeterdataOrderRequest;
use AntChain\BOT\Models\PushMeterdataOrderResponse;
use AntChain\BOT\Models\PushRentBillRequest;
use AntChain\BOT\Models\PushRentBillResponse;
use AntChain\BOT\Models\PushRentHouseRequest;
use AntChain\BOT\Models\PushRentHouseResponse;
use AntChain\BOT\Models\PushRentMerchantRequest;
use AntChain\BOT\Models\PushRentMerchantResponse;
use AntChain\BOT\Models\PushRentRenterRequest;
use AntChain\BOT\Models\PushRentRenterResponse;
use AntChain\BOT\Models\QueryAiidentificationGoodspointRequest;
use AntChain\BOT\Models\QueryAiidentificationGoodspointResponse;
use AntChain\BOT\Models\QueryAiidentificationGoodsRequest;
use AntChain\BOT\Models\QueryAiidentificationGoodsResponse;
use AntChain\BOT\Models\QueryAiidentificationQrcodeRequest;
use AntChain\BOT\Models\QueryAiidentificationQrcodeResponse;
use AntChain\BOT\Models\QueryAnalysisRequest;
use AntChain\BOT\Models\QueryAnalysisResponse;
use AntChain\BOT\Models\QueryAsyncRequestRequest;
use AntChain\BOT\Models\QueryAsyncRequestResponse;
use AntChain\BOT\Models\QueryBaiOcrRequest;
use AntChain\BOT\Models\QueryBaiOcrResponse;
use AntChain\BOT\Models\QueryCategoryIndustryscenelistRequest;
use AntChain\BOT\Models\QueryCategoryIndustryscenelistResponse;
use AntChain\BOT\Models\QueryCollectorJtfluxRequest;
use AntChain\BOT\Models\QueryCollectorJtfluxResponse;
use AntChain\BOT\Models\QueryCollectorJtmediaRequest;
use AntChain\BOT\Models\QueryCollectorJtmediaResponse;
use AntChain\BOT\Models\QueryCustomerentityServiceRequest;
use AntChain\BOT\Models\QueryCustomerentityServiceResponse;
use AntChain\BOT\Models\QueryDataBytxhashRequest;
use AntChain\BOT\Models\QueryDataBytxhashResponse;
use AntChain\BOT\Models\QueryDevicecorpCustomerregisterresultRequest;
use AntChain\BOT\Models\QueryDevicecorpCustomerregisterresultResponse;
use AntChain\BOT\Models\QueryDeviceModeldataRequest;
use AntChain\BOT\Models\QueryDeviceModeldataResponse;
use AntChain\BOT\Models\QueryDeviceRegisterresultRequest;
use AntChain\BOT\Models\QueryDeviceRegisterresultResponse;
use AntChain\BOT\Models\QueryDeviceRegistrationRequest;
use AntChain\BOT\Models\QueryDeviceRegistrationResponse;
use AntChain\BOT\Models\QueryDeviceSpecsRequest;
use AntChain\BOT\Models\QueryDeviceSpecsResponse;
use AntChain\BOT\Models\QueryDeviceStatusRequest;
use AntChain\BOT\Models\QueryDeviceStatusResponse;
use AntChain\BOT\Models\QueryDeviceThingmodelRequest;
use AntChain\BOT\Models\QueryDeviceThingmodelResponse;
use AntChain\BOT\Models\QueryDigitalkeyPreauthpayRequest;
use AntChain\BOT\Models\QueryDigitalkeyPreauthpayResponse;
use AntChain\BOT\Models\QueryDigitalkeyTradepayRequest;
use AntChain\BOT\Models\QueryDigitalkeyTradepayResponse;
use AntChain\BOT\Models\QueryDigitalkeyWithholdpayRequest;
use AntChain\BOT\Models\QueryDigitalkeyWithholdpayResponse;
use AntChain\BOT\Models\QueryDigitalkeyWithholdsignRequest;
use AntChain\BOT\Models\QueryDigitalkeyWithholdsignResponse;
use AntChain\BOT\Models\QueryDockedDataRequest;
use AntChain\BOT\Models\QueryDockedDataResponse;
use AntChain\BOT\Models\QueryElectrocarRealtimedataRequest;
use AntChain\BOT\Models\QueryElectrocarRealtimedataResponse;
use AntChain\BOT\Models\QueryElectrocarTravelRequest;
use AntChain\BOT\Models\QueryElectrocarTravelResponse;
use AntChain\BOT\Models\QueryEntityrelationJtdevicebycarRequest;
use AntChain\BOT\Models\QueryEntityrelationJtdevicebycarResponse;
use AntChain\BOT\Models\QueryIotbasicCategorylistRequest;
use AntChain\BOT\Models\QueryIotbasicCategorylistResponse;
use AntChain\BOT\Models\QueryIotbasicDevicecollectRequest;
use AntChain\BOT\Models\QueryIotbasicDevicecollectResponse;
use AntChain\BOT\Models\QueryIotbasicDeviceorderRequest;
use AntChain\BOT\Models\QueryIotbasicDeviceorderResponse;
use AntChain\BOT\Models\QueryIotbasicDeviceRequest;
use AntChain\BOT\Models\QueryIotbasicDeviceResponse;
use AntChain\BOT\Models\QueryIotbasicProjectspacelistRequest;
use AntChain\BOT\Models\QueryIotbasicProjectspacelistResponse;
use AntChain\BOT\Models\QueryIotbasicSnRequest;
use AntChain\BOT\Models\QueryIotbasicSnResponse;
use AntChain\BOT\Models\QueryIotplatformPurchaseorderRequest;
use AntChain\BOT\Models\QueryIotplatformPurchaseorderResponse;
use AntChain\BOT\Models\QueryLabelTraceRequest;
use AntChain\BOT\Models\QueryLabelTraceResponse;
use AntChain\BOT\Models\QueryLeaseRealpersonRequest;
use AntChain\BOT\Models\QueryLeaseRealpersonResponse;
use AntChain\BOT\Models\QueryLeaseRiskRequest;
use AntChain\BOT\Models\QueryLeaseRiskResponse;
use AntChain\BOT\Models\QueryOnlinepressuretestDataRequest;
use AntChain\BOT\Models\QueryOnlinepressuretestDataResponse;
use AntChain\BOT\Models\QueryOnlinepressuretestRequest;
use AntChain\BOT\Models\QueryOnlinepressuretestResponse;
use AntChain\BOT\Models\QueryOssDownloadjoburlRequest;
use AntChain\BOT\Models\QueryOssDownloadjoburlResponse;
use AntChain\BOT\Models\QueryScfleaseEqpinfoRequest;
use AntChain\BOT\Models\QueryScfleaseEqpinfoResponse;
use AntChain\BOT\Models\QueryTaskRequest;
use AntChain\BOT\Models\QueryTaskResponse;
use AntChain\BOT\Models\QueryTaskscanRequest;
use AntChain\BOT\Models\QueryTaskscanResponse;
use AntChain\BOT\Models\QueryTechintegrationSkugrantstockinfoRequest;
use AntChain\BOT\Models\QueryTechintegrationSkugrantstockinfoResponse;
use AntChain\BOT\Models\QueryThingmodeleventBycustomertenantRequest;
use AntChain\BOT\Models\QueryThingmodeleventBycustomertenantResponse;
use AntChain\BOT\Models\QueryThingmodelEventRequest;
use AntChain\BOT\Models\QueryThingmodelEventResponse;
use AntChain\BOT\Models\QueryThingmodelRequest;
use AntChain\BOT\Models\QueryThingmodelResponse;
use AntChain\BOT\Models\QueryThingsdidAsyncprocessRequest;
use AntChain\BOT\Models\QueryThingsdidAsyncprocessResponse;
use AntChain\BOT\Models\QueryThingsdidDidRequest;
use AntChain\BOT\Models\QueryThingsdidDidResponse;
use AntChain\BOT\Models\QueryTlsnotaryTaskRequest;
use AntChain\BOT\Models\QueryTlsnotaryTaskResponse;
use AntChain\BOT\Models\QueryTxtransactionChaindataRequest;
use AntChain\BOT\Models\QueryTxtransactionChaindataResponse;
use AntChain\BOT\Models\QueryTxtransactionDeviceRequest;
use AntChain\BOT\Models\QueryTxtransactionDeviceResponse;
use AntChain\BOT\Models\RecognizeIotbasicCustomerRequest;
use AntChain\BOT\Models\RecognizeIotbasicCustomerResponse;
use AntChain\BOT\Models\RefuseDigitalkeyWithholdpayRequest;
use AntChain\BOT\Models\RefuseDigitalkeyWithholdpayResponse;
use AntChain\BOT\Models\RegisterAiidentificationGoodsdigitalfingerprintRequest;
use AntChain\BOT\Models\RegisterAiidentificationGoodsdigitalfingerprintResponse;
use AntChain\BOT\Models\RegisterCarkeyscorpCustomerRequest;
use AntChain\BOT\Models\RegisterCarkeyscorpCustomerResponse;
use AntChain\BOT\Models\RegisterDevicecorpCustomerRequest;
use AntChain\BOT\Models\RegisterDevicecorpCustomerResponse;
use AntChain\BOT\Models\RegisterIotbasicCorpjoinRequest;
use AntChain\BOT\Models\RegisterIotbasicCorpjoinResponse;
use AntChain\BOT\Models\ReplaceDistributedeviceBychainidRequest;
use AntChain\BOT\Models\ReplaceDistributedeviceBychainidResponse;
use AntChain\BOT\Models\ReplaceDistributedeviceBychainperipheralidRequest;
use AntChain\BOT\Models\ReplaceDistributedeviceBychainperipheralidResponse;
use AntChain\BOT\Models\ResetIotbasicDeviceseckeyRequest;
use AntChain\BOT\Models\ResetIotbasicDeviceseckeyResponse;
use AntChain\BOT\Models\ResumeAcecContractRequest;
use AntChain\BOT\Models\ResumeAcecContractResponse;
use AntChain\BOT\Models\ResumeIotplantformProductRequest;
use AntChain\BOT\Models\ResumeIotplantformProductResponse;
use AntChain\BOT\Models\RetryIotlinkAppreleasedeviceRequest;
use AntChain\BOT\Models\RetryIotlinkAppreleasedeviceResponse;
use AntChain\BOT\Models\SaveIotbasicCustomerRequest;
use AntChain\BOT\Models\SaveIotbasicCustomerResponse;
use AntChain\BOT\Models\SendAcsCollectorRequest;
use AntChain\BOT\Models\SendAcsCollectorResponse;
use AntChain\BOT\Models\SendCollectorBychainidmulRequest;
use AntChain\BOT\Models\SendCollectorBychainidmulResponse;
use AntChain\BOT\Models\SendCollectorBychainidRequest;
use AntChain\BOT\Models\SendCollectorBychainidResponse;
use AntChain\BOT\Models\SendCollectorDevicebizdataRequest;
use AntChain\BOT\Models\SendCollectorDevicebizdataResponse;
use AntChain\BOT\Models\SendCollectorSummarydataRequest;
use AntChain\BOT\Models\SendCollectorSummarydataResponse;
use AntChain\BOT\Models\SendEventDataRequest;
use AntChain\BOT\Models\SendEventDataResponse;
use AntChain\BOT\Models\SendLabelTransferonasyncRequest;
use AntChain\BOT\Models\SendLabelTransferonasyncResponse;
use AntChain\BOT\Models\SendLabelTransferrawonasyncRequest;
use AntChain\BOT\Models\SendLabelTransferrawonasyncResponse;
use AntChain\BOT\Models\SendTaskalarmRequest;
use AntChain\BOT\Models\SendTaskalarmResponse;
use AntChain\BOT\Models\SendThingDataRequest;
use AntChain\BOT\Models\SendThingDataResponse;
use AntChain\BOT\Models\SetConsumerSubscribeRequest;
use AntChain\BOT\Models\SetConsumerSubscribeResponse;
use AntChain\BOT\Models\SetConsumerUnsubscribeRequest;
use AntChain\BOT\Models\SetConsumerUnsubscribeResponse;
use AntChain\BOT\Models\SetDevicelistPropertyRequest;
use AntChain\BOT\Models\SetDevicelistPropertyResponse;
use AntChain\BOT\Models\SetDevicePropertyRequest;
use AntChain\BOT\Models\SetDevicePropertyResponse;
use AntChain\BOT\Models\SetEnergyprojectLightmodeRequest;
use AntChain\BOT\Models\SetEnergyprojectLightmodeResponse;
use AntChain\BOT\Models\StartEvidenceQueryRequest;
use AntChain\BOT\Models\StartEvidenceQueryResponse;
use AntChain\BOT\Models\StartEvidenceStoreRequest;
use AntChain\BOT\Models\StartEvidenceStoreResponse;
use AntChain\BOT\Models\StartTenantBindinfoRequest;
use AntChain\BOT\Models\StartTenantBindinfoResponse;
use AntChain\BOT\Models\StartThingsdidRegisterRequest;
use AntChain\BOT\Models\StartThingsdidRegisterResponse;
use AntChain\BOT\Models\StartTlsnotaryTaskRequest;
use AntChain\BOT\Models\StartTlsnotaryTaskResponse;
use AntChain\BOT\Models\StopAcecContractRequest;
use AntChain\BOT\Models\StopAcecContractResponse;
use AntChain\BOT\Models\StopIotplantformProductRequest;
use AntChain\BOT\Models\StopIotplantformProductResponse;
use AntChain\BOT\Models\SyncAssetelementProjectRequest;
use AntChain\BOT\Models\SyncAssetelementProjectResponse;
use AntChain\BOT\Models\SyncDeviceScreenstatusRequest;
use AntChain\BOT\Models\SyncDeviceScreenstatusResponse;
use AntChain\BOT\Models\SyncFourwheelerCareventRequest;
use AntChain\BOT\Models\SyncFourwheelerCareventResponse;
use AntChain\BOT\Models\SyncIotbasicDevicegenerateRequest;
use AntChain\BOT\Models\SyncIotbasicDevicegenerateResponse;
use AntChain\BOT\Models\SyncIotbasicDevicestatusRequest;
use AntChain\BOT\Models\SyncIotbasicDevicestatusResponse;
use AntChain\BOT\Models\SyncLabelTransferrawRequest;
use AntChain\BOT\Models\SyncLabelTransferrawResponse;
use AntChain\BOT\Models\SyncLabelTransferRequest;
use AntChain\BOT\Models\SyncLabelTransferResponse;
use AntChain\BOT\Models\SyncRentRentpaymentRequest;
use AntChain\BOT\Models\SyncRentRentpaymentResponse;
use AntChain\BOT\Models\UnbindDigitalkeyWithholdsignRequest;
use AntChain\BOT\Models\UnbindDigitalkeyWithholdsignResponse;
use AntChain\BOT\Models\UnbindEntityrelationRequest;
use AntChain\BOT\Models\UnbindEntityrelationResponse;
use AntChain\BOT\Models\UnfreezeDigitalkeyPreauthpayRequest;
use AntChain\BOT\Models\UnfreezeDigitalkeyPreauthpayResponse;
use AntChain\BOT\Models\UpdateAlertStrategyRequest;
use AntChain\BOT\Models\UpdateAlertStrategyResponse;
use AntChain\BOT\Models\UpdateCustomerEntityRequest;
use AntChain\BOT\Models\UpdateCustomerEntityResponse;
use AntChain\BOT\Models\UpdateDeviceBydeviceidRequest;
use AntChain\BOT\Models\UpdateDeviceBydeviceidResponse;
use AntChain\BOT\Models\UpdateDevicecorpThingmodelRequest;
use AntChain\BOT\Models\UpdateDevicecorpThingmodelResponse;
use AntChain\BOT\Models\UpdateDeviceInfobydeviceRequest;
use AntChain\BOT\Models\UpdateDeviceInfobydeviceResponse;
use AntChain\BOT\Models\UpdateDeviceInfoRequest;
use AntChain\BOT\Models\UpdateDeviceInfoResponse;
use AntChain\BOT\Models\UpdateIotbasicDeviceRequest;
use AntChain\BOT\Models\UpdateIotbasicDeviceResponse;
use AntChain\BOT\Models\UpdateIotlinkOtamoduleRequest;
use AntChain\BOT\Models\UpdateIotlinkOtamoduleResponse;
use AntChain\BOT\Models\UpdateOnlinepressuretestCustomerreportRequest;
use AntChain\BOT\Models\UpdateOnlinepressuretestCustomerreportResponse;
use AntChain\BOT\Models\UpdateProductkeyRequest;
use AntChain\BOT\Models\UpdateProductkeyResponse;
use AntChain\BOT\Models\UpdateSceneRequest;
use AntChain\BOT\Models\UpdateSceneResponse;
use AntChain\BOT\Models\UpdateSdkRequest;
use AntChain\BOT\Models\UpdateSdkResponse;
use AntChain\BOT\Models\UpdateTenantRequest;
use AntChain\BOT\Models\UpdateTenantResponse;
use AntChain\BOT\Models\UpdateThingsdidDevicespaceRequest;
use AntChain\BOT\Models\UpdateThingsdidDevicespaceResponse;
use AntChain\BOT\Models\UpdateThingsdidDidRequest;
use AntChain\BOT\Models\UpdateThingsdidDidResponse;
use AntChain\BOT\Models\UpdateThingsdidStatusRequest;
use AntChain\BOT\Models\UpdateThingsdidStatusResponse;
use AntChain\BOT\Models\UpdateThingsdidTenantRequest;
use AntChain\BOT\Models\UpdateThingsdidTenantResponse;
use AntChain\BOT\Models\UpdateXrXrticketpoolRequest;
use AntChain\BOT\Models\UpdateXrXrticketpoolResponse;
use AntChain\BOT\Models\VerifyAiidentificationQrcodeRequest;
use AntChain\BOT\Models\VerifyAiidentificationQrcodeResponse;
use AntChain\BOT\Models\VerifyIotbasicIdentifyRequest;
use AntChain\BOT\Models\VerifyIotbasicIdentifyResponse;
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
            // 资源定位信息
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
                    'sdk_version'      => '1.12.34',
                    '_prod_code'       => 'BOT',
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
     * Description: acec提供的SPI服务开通接口
     * Summary: acec提供的SPI服务开通接口.
     *
     * @param OpenAcecContractRequest $request
     *
     * @return OpenAcecContractResponse
     */
    public function openAcecContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openAcecContractEx($request, $headers, $runtime);
    }

    /**
     * Description: acec提供的SPI服务开通接口
     * Summary: acec提供的SPI服务开通接口.
     *
     * @param OpenAcecContractRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return OpenAcecContractResponse
     */
    public function openAcecContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenAcecContractResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.acec.contract.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AI服务组提供的SPI服务停止接口
     * Summary: acec提供的SPI服务停止接口.
     *
     * @param StopAcecContractRequest $request
     *
     * @return StopAcecContractResponse
     */
    public function stopAcecContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopAcecContractEx($request, $headers, $runtime);
    }

    /**
     * Description: AI服务组提供的SPI服务停止接口
     * Summary: acec提供的SPI服务停止接口.
     *
     * @param StopAcecContractRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return StopAcecContractResponse
     */
    public function stopAcecContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopAcecContractResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.acec.contract.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: acec提供的SPI服务复入接口
     * Summary: acec提供的SPI服务复入接口.
     *
     * @param ResumeAcecContractRequest $request
     *
     * @return ResumeAcecContractResponse
     */
    public function resumeAcecContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resumeAcecContractEx($request, $headers, $runtime);
    }

    /**
     * Description: acec提供的SPI服务复入接口
     * Summary: acec提供的SPI服务复入接口.
     *
     * @param ResumeAcecContractRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ResumeAcecContractResponse
     */
    public function resumeAcecContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResumeAcecContractResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.acec.contract.resume', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁智能中心实人认证创建服务
     * Summary: 租赁智能中心实人认证创建服务
     *
     * @param CreateLeaseRealpersonRequest $request
     *
     * @return CreateLeaseRealpersonResponse
     */
    public function createLeaseRealperson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeaseRealpersonEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁智能中心实人认证创建服务
     * Summary: 租赁智能中心实人认证创建服务
     *
     * @param CreateLeaseRealpersonRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateLeaseRealpersonResponse
     */
    public function createLeaseRealpersonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeaseRealpersonResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.lease.realperson.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁智能中心实人认证查询服务
     * Summary: 租赁智能中心实人认证查询服务
     *
     * @param QueryLeaseRealpersonRequest $request
     *
     * @return QueryLeaseRealpersonResponse
     */
    public function queryLeaseRealperson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseRealpersonEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁智能中心实人认证查询服务
     * Summary: 租赁智能中心实人认证查询服务
     *
     * @param QueryLeaseRealpersonRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryLeaseRealpersonResponse
     */
    public function queryLeaseRealpersonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseRealpersonResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.lease.realperson.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁智能中心风控查询服务
     * Summary: 租赁智能中心风控查询服务
     *
     * @param QueryLeaseRiskRequest $request
     *
     * @return QueryLeaseRiskResponse
     */
    public function queryLeaseRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeaseRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁智能中心风控查询服务
     * Summary: 租赁智能中心风控查询服务
     *
     * @param QueryLeaseRiskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryLeaseRiskResponse
     */
    public function queryLeaseRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeaseRiskResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.lease.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-创建用户通行证
     * Summary: aiot-创建用户通行证
     *
     * @param CreateXrUserticketRequest $request
     *
     * @return CreateXrUserticketResponse
     */
    public function createXrUserticket($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createXrUserticketEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-创建用户通行证
     * Summary: aiot-创建用户通行证
     *
     * @param CreateXrUserticketRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateXrUserticketResponse
     */
    public function createXrUserticketEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateXrUserticketResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.userticket.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-获取通行证资源池列表
     * Summary: aiot-获取通行证资源池列表.
     *
     * @param ListXrXrticketpoolRequest $request
     *
     * @return ListXrXrticketpoolResponse
     */
    public function listXrXrticketpool($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listXrXrticketpoolEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-获取通行证资源池列表
     * Summary: aiot-获取通行证资源池列表.
     *
     * @param ListXrXrticketpoolRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListXrXrticketpoolResponse
     */
    public function listXrXrticketpoolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListXrXrticketpoolResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.xrticketpool.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-分页查询用户通行证
     * Summary: aiot-分页查询用户通行证
     *
     * @param PagequeryXrUserticketRequest $request
     *
     * @return PagequeryXrUserticketResponse
     */
    public function pagequeryXrUserticket($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryXrUserticketEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-分页查询用户通行证
     * Summary: aiot-分页查询用户通行证
     *
     * @param PagequeryXrUserticketRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PagequeryXrUserticketResponse
     */
    public function pagequeryXrUserticketEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryXrUserticketResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.userticket.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-查询用户通行证
     * Summary: aiot-查询用户通行证
     *
     * @param GetXrUserticketRequest $request
     *
     * @return GetXrUserticketResponse
     */
    public function getXrUserticket($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getXrUserticketEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-查询用户通行证
     * Summary: aiot-查询用户通行证
     *
     * @param GetXrUserticketRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetXrUserticketResponse
     */
    public function getXrUserticketEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetXrUserticketResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.userticket.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-核销用户通行证
     * Summary: aiot-核销用户通行证
     *
     * @param OperateXrUserticketRequest $request
     *
     * @return OperateXrUserticketResponse
     */
    public function operateXrUserticket($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateXrUserticketEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-核销用户通行证
     * Summary: aiot-核销用户通行证
     *
     * @param OperateXrUserticketRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return OperateXrUserticketResponse
     */
    public function operateXrUserticketEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateXrUserticketResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.userticket.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-获取资源列表
     * Summary: aiot-获取资源列表.
     *
     * @param ListXrResourceRequest $request
     *
     * @return ListXrResourceResponse
     */
    public function listXrResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listXrResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-获取资源列表
     * Summary: aiot-获取资源列表.
     *
     * @param ListXrResourceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListXrResourceResponse
     */
    public function listXrResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListXrResourceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.resource.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-核销实例分页查询
     * Summary: aiot-核销实例分页查询.
     *
     * @param PagequeryXrXrverificationmodelRequest $request
     *
     * @return PagequeryXrXrverificationmodelResponse
     */
    public function pagequeryXrXrverificationmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryXrXrverificationmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-核销实例分页查询
     * Summary: aiot-核销实例分页查询.
     *
     * @param PagequeryXrXrverificationmodelRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return PagequeryXrXrverificationmodelResponse
     */
    public function pagequeryXrXrverificationmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryXrXrverificationmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.xrverificationmodel.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-客户对应设备分页查询
     * Summary: aiot-客户对应设备分页查询.
     *
     * @param PagequeryXrCustomerdeviceRequest $request
     *
     * @return PagequeryXrCustomerdeviceResponse
     */
    public function pagequeryXrCustomerdevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryXrCustomerdeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-客户对应设备分页查询
     * Summary: aiot-客户对应设备分页查询.
     *
     * @param PagequeryXrCustomerdeviceRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return PagequeryXrCustomerdeviceResponse
     */
    public function pagequeryXrCustomerdeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryXrCustomerdeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.customerdevice.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-xr通行证创建
     * Summary: aiot-xr通行证创建.
     *
     * @param CreateXrXrticketpoolRequest $request
     *
     * @return CreateXrXrticketpoolResponse
     */
    public function createXrXrticketpool($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createXrXrticketpoolEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-xr通行证创建
     * Summary: aiot-xr通行证创建.
     *
     * @param CreateXrXrticketpoolRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateXrXrticketpoolResponse
     */
    public function createXrXrticketpoolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateXrXrticketpoolResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.xrticketpool.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-xr通行证修改
     * Summary: aiot-xr通行证修改.
     *
     * @param UpdateXrXrticketpoolRequest $request
     *
     * @return UpdateXrXrticketpoolResponse
     */
    public function updateXrXrticketpool($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateXrXrticketpoolEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-xr通行证修改
     * Summary: aiot-xr通行证修改.
     *
     * @param UpdateXrXrticketpoolRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateXrXrticketpoolResponse
     */
    public function updateXrXrticketpoolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateXrXrticketpoolResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.xrticketpool.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-xr通行证分页查询
     * Summary: aiot-xr通行证分页查询.
     *
     * @param PagequeryXrXrticketpoolRequest $request
     *
     * @return PagequeryXrXrticketpoolResponse
     */
    public function pagequeryXrXrticketpool($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryXrXrticketpoolEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-xr通行证分页查询
     * Summary: aiot-xr通行证分页查询.
     *
     * @param PagequeryXrXrticketpoolRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return PagequeryXrXrticketpoolResponse
     */
    public function pagequeryXrXrticketpoolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryXrXrticketpoolResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.xrticketpool.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-同步设备屏幕状态
     * Summary: aiot-同步设备屏幕状态
     *
     * @param SyncDeviceScreenstatusRequest $request
     *
     * @return SyncDeviceScreenstatusResponse
     */
    public function syncDeviceScreenstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncDeviceScreenstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-同步设备屏幕状态
     * Summary: aiot-同步设备屏幕状态
     *
     * @param SyncDeviceScreenstatusRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncDeviceScreenstatusResponse
     */
    public function syncDeviceScreenstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncDeviceScreenstatusResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.screenstatus.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: xr通行证批量创建
     * Summary: xr通行证批量创建.
     *
     * @param BatchcreateXrXrticketpoolRequest $request
     *
     * @return BatchcreateXrXrticketpoolResponse
     */
    public function batchcreateXrXrticketpool($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateXrXrticketpoolEx($request, $headers, $runtime);
    }

    /**
     * Description: xr通行证批量创建
     * Summary: xr通行证批量创建.
     *
     * @param BatchcreateXrXrticketpoolRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return BatchcreateXrXrticketpoolResponse
     */
    public function batchcreateXrXrticketpoolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateXrXrticketpoolResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.xrticketpool.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-获取资源实例列表
     * Summary: aiot-获取资源实例列表.
     *
     * @param ListXrXrverificationmodelinstanceRequest $request
     *
     * @return ListXrXrverificationmodelinstanceResponse
     */
    public function listXrXrverificationmodelinstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listXrXrverificationmodelinstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-获取资源实例列表
     * Summary: aiot-获取资源实例列表.
     *
     * @param ListXrXrverificationmodelinstanceRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return ListXrXrverificationmodelinstanceResponse
     */
    public function listXrXrverificationmodelinstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListXrXrverificationmodelinstanceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.xrverificationmodelinstance.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiot-xr通行证详情查询
     * Summary: aiot-xr通行证详情查询.
     *
     * @param DetailXrXrticketpoolRequest $request
     *
     * @return DetailXrXrticketpoolResponse
     */
    public function detailXrXrticketpool($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailXrXrticketpoolEx($request, $headers, $runtime);
    }

    /**
     * Description: aiot-xr通行证详情查询
     * Summary: aiot-xr通行证详情查询.
     *
     * @param DetailXrXrticketpoolRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DetailXrXrticketpoolResponse
     */
    public function detailXrXrticketpoolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailXrXrticketpoolResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.xr.xrticketpool.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiotnextbs-openApi操作
     * Summary: aiotnextbs-openApi操作.
     *
     * @param OperateAiotnextbsOpenapiRequest $request
     *
     * @return OperateAiotnextbsOpenapiResponse
     */
    public function operateAiotnextbsOpenapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateAiotnextbsOpenapiEx($request, $headers, $runtime);
    }

    /**
     * Description: aiotnextbs-openApi操作
     * Summary: aiotnextbs-openApi操作.
     *
     * @param OperateAiotnextbsOpenapiRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return OperateAiotnextbsOpenapiResponse
     */
    public function operateAiotnextbsOpenapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateAiotnextbsOpenapiResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiotnextbs.openapi.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: aiotnext-节能项目设置照明模式
     * Summary: aiotnext-节能项目设置照明模式.
     *
     * @param SetEnergyprojectLightmodeRequest $request
     *
     * @return SetEnergyprojectLightmodeResponse
     */
    public function setEnergyprojectLightmode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setEnergyprojectLightmodeEx($request, $headers, $runtime);
    }

    /**
     * Description: aiotnext-节能项目设置照明模式
     * Summary: aiotnext-节能项目设置照明模式.
     *
     * @param SetEnergyprojectLightmodeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SetEnergyprojectLightmodeResponse
     */
    public function setEnergyprojectLightmodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetEnergyprojectLightmodeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.energyproject.lightmode.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 私有化配置推送回告API
     * Summary: 私有化配置推送回告API.
     *
     * @param FinishTraceConfigRequest $request
     *
     * @return FinishTraceConfigResponse
     */
    public function finishTraceConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->finishTraceConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 私有化配置推送回告API
     * Summary: 私有化配置推送回告API.
     *
     * @param FinishTraceConfigRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return FinishTraceConfigResponse
     */
    public function finishTraceConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FinishTraceConfigResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.trace.config.finish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: BAI提供的OCR服务接口
     * Summary: BAI提供的OCR服务
     *
     * @param QueryBaiOcrRequest $request
     *
     * @return QueryBaiOcrResponse
     */
    public function queryBaiOcr($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaiOcrEx($request, $headers, $runtime);
    }

    /**
     * Description: BAI提供的OCR服务接口
     * Summary: BAI提供的OCR服务
     *
     * @param QueryBaiOcrRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryBaiOcrResponse
     */
    public function queryBaiOcrEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaiOcrResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.bai.ocr.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AI二维码验真
     * Summary: AI二维码验真
     *
     * @param QueryAiidentificationQrcodeRequest $request
     *
     * @return QueryAiidentificationQrcodeResponse
     */
    public function queryAiidentificationQrcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAiidentificationQrcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: AI二维码验真
     * Summary: AI二维码验真
     *
     * @param QueryAiidentificationQrcodeRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryAiidentificationQrcodeResponse
     */
    public function queryAiidentificationQrcodeEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'blockchain.bot.aiidentification.qrcode.query',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new QueryAiidentificationQrcodeResponse([
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

        return QueryAiidentificationQrcodeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.qrcode.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AI商品鉴定
     * Summary: AI商品鉴定.
     *
     * @param QueryAiidentificationGoodsRequest $request
     *
     * @return QueryAiidentificationGoodsResponse
     */
    public function queryAiidentificationGoods($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAiidentificationGoodsEx($request, $headers, $runtime);
    }

    /**
     * Description: AI商品鉴定
     * Summary: AI商品鉴定.
     *
     * @param QueryAiidentificationGoodsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryAiidentificationGoodsResponse
     */
    public function queryAiidentificationGoodsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAiidentificationGoodsResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.goods.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品鉴定点图片检测
     * Summary: 商品鉴定点图片检测.
     *
     * @param CheckAiidentificationGoodspointRequest $request
     *
     * @return CheckAiidentificationGoodspointResponse
     */
    public function checkAiidentificationGoodspoint($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAiidentificationGoodspointEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品鉴定点图片检测
     * Summary: 商品鉴定点图片检测.
     *
     * @param CheckAiidentificationGoodspointRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return CheckAiidentificationGoodspointResponse
     */
    public function checkAiidentificationGoodspointEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAiidentificationGoodspointResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.goodspoint.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 溯源码比对服务
     * Summary: AI溯源码验真
     *
     * @param CheckAiidentificationQrcodeRequest $request
     *
     * @return CheckAiidentificationQrcodeResponse
     */
    public function checkAiidentificationQrcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAiidentificationQrcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 溯源码比对服务
     * Summary: AI溯源码验真
     *
     * @param CheckAiidentificationQrcodeRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CheckAiidentificationQrcodeResponse
     */
    public function checkAiidentificationQrcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAiidentificationQrcodeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.qrcode.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于生成溯源防伪码
     * Summary: 溯源防伪码生成接口.
     *
     * @param CreateAiidentificationQrcodeRequest $request
     *
     * @return CreateAiidentificationQrcodeResponse
     */
    public function createAiidentificationQrcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAiidentificationQrcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于生成溯源防伪码
     * Summary: 溯源防伪码生成接口.
     *
     * @param CreateAiidentificationQrcodeRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateAiidentificationQrcodeResponse
     */
    public function createAiidentificationQrcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAiidentificationQrcodeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.qrcode.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: B端二维码质检
     * Summary: B端二维码质检
     *
     * @param VerifyAiidentificationQrcodeRequest $request
     *
     * @return VerifyAiidentificationQrcodeResponse
     */
    public function verifyAiidentificationQrcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyAiidentificationQrcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: B端二维码质检
     * Summary: B端二维码质检
     *
     * @param VerifyAiidentificationQrcodeRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return VerifyAiidentificationQrcodeResponse
     */
    public function verifyAiidentificationQrcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyAiidentificationQrcodeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.qrcode.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 商品鉴定
     * Summary: 商品鉴定.
     *
     * @param QueryAiidentificationGoodspointRequest $request
     *
     * @return QueryAiidentificationGoodspointResponse
     */
    public function queryAiidentificationGoodspoint($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAiidentificationGoodspointEx($request, $headers, $runtime);
    }

    /**
     * Description: 商品鉴定
     * Summary: 商品鉴定.
     *
     * @param QueryAiidentificationGoodspointRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryAiidentificationGoodspointResponse
     */
    public function queryAiidentificationGoodspointEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAiidentificationGoodspointResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.goodspoint.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AI商品数字指纹注册
     * Summary: AI数字指纹注册.
     *
     * @param RegisterAiidentificationGoodsdigitalfingerprintRequest $request
     *
     * @return RegisterAiidentificationGoodsdigitalfingerprintResponse
     */
    public function registerAiidentificationGoodsdigitalfingerprint($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerAiidentificationGoodsdigitalfingerprintEx($request, $headers, $runtime);
    }

    /**
     * Description: AI商品数字指纹注册
     * Summary: AI数字指纹注册.
     *
     * @param RegisterAiidentificationGoodsdigitalfingerprintRequest $request
     * @param string[]                                               $headers
     * @param RuntimeOptions                                         $runtime
     *
     * @return RegisterAiidentificationGoodsdigitalfingerprintResponse
     */
    public function registerAiidentificationGoodsdigitalfingerprintEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterAiidentificationGoodsdigitalfingerprintResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.goodsdigitalfingerprint.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: AI商品数字指纹鉴定
     * Summary: AI商品数字指纹鉴定.
     *
     * @param CheckAiidentificationGoodsdigitalfingerprintRequest $request
     *
     * @return CheckAiidentificationGoodsdigitalfingerprintResponse
     */
    public function checkAiidentificationGoodsdigitalfingerprint($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAiidentificationGoodsdigitalfingerprintEx($request, $headers, $runtime);
    }

    /**
     * Description: AI商品数字指纹鉴定
     * Summary: AI商品数字指纹鉴定.
     *
     * @param CheckAiidentificationGoodsdigitalfingerprintRequest $request
     * @param string[]                                            $headers
     * @param RuntimeOptions                                      $runtime
     *
     * @return CheckAiidentificationGoodsdigitalfingerprintResponse
     */
    public function checkAiidentificationGoodsdigitalfingerprintEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAiidentificationGoodsdigitalfingerprintResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.goodsdigitalfingerprint.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 识别票据上的二维码
     * Summary: AI二维码识别.
     *
     * @param GetAiidentificationQrcodeRequest $request
     *
     * @return GetAiidentificationQrcodeResponse
     */
    public function getAiidentificationQrcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAiidentificationQrcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 识别票据上的二维码
     * Summary: AI二维码识别.
     *
     * @param GetAiidentificationQrcodeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetAiidentificationQrcodeResponse
     */
    public function getAiidentificationQrcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAiidentificationQrcodeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.aiidentification.qrcode.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: biot 私有化 设备注册接口
     * Summary: biot 私有化 设备注册接口.
     *
     * @param CreateAcsDeviceRequest $request
     *
     * @return CreateAcsDeviceResponse
     */
    public function createAcsDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAcsDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: biot 私有化 设备注册接口
     * Summary: biot 私有化 设备注册接口.
     *
     * @param CreateAcsDeviceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateAcsDeviceResponse
     */
    public function createAcsDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAcsDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.acs.device.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: biot 私有化 业务数据上报
     * Summary: biot 私有化 业务数据上报.
     *
     * @param SendAcsCollectorRequest $request
     *
     * @return SendAcsCollectorResponse
     */
    public function sendAcsCollector($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendAcsCollectorEx($request, $headers, $runtime);
    }

    /**
     * Description: biot 私有化 业务数据上报
     * Summary: biot 私有化 业务数据上报.
     *
     * @param SendAcsCollectorRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SendAcsCollectorResponse
     */
    public function sendAcsCollectorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendAcsCollectorResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.acs.collector.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供设备基础信息查询服务
     * Summary: IoT设备平台-设备查询.
     *
     * @param QueryIotbasicDeviceRequest $request
     *
     * @return QueryIotbasicDeviceResponse
     */
    public function queryIotbasicDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotbasicDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供设备基础信息查询服务
     * Summary: IoT设备平台-设备查询.
     *
     * @param QueryIotbasicDeviceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryIotbasicDeviceResponse
     */
    public function queryIotbasicDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotbasicDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.device.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT产品开通状态查询
     * Summary: IoT产品开通状态查询.
     *
     * @param RecognizeIotbasicCustomerRequest $request
     *
     * @return RecognizeIotbasicCustomerResponse
     */
    public function recognizeIotbasicCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeIotbasicCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT产品开通状态查询
     * Summary: IoT产品开通状态查询.
     *
     * @param RecognizeIotbasicCustomerRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return RecognizeIotbasicCustomerResponse
     */
    public function recognizeIotbasicCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RecognizeIotbasicCustomerResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.customer.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备认证
     * Summary: IoT设备平台-设备认证
     *
     * @param CertifyIotbasicDeviceRequest $request
     *
     * @return CertifyIotbasicDeviceResponse
     */
    public function certifyIotbasicDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->certifyIotbasicDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备认证
     * Summary: IoT设备平台-设备认证
     *
     * @param CertifyIotbasicDeviceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CertifyIotbasicDeviceResponse
     */
    public function certifyIotbasicDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CertifyIotbasicDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.device.certify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
     * Summary: iot平台用户注册操作.
     *
     * @param OperateIotbasicUserRequest $request
     *
     * @return OperateIotbasicUserResponse
     */
    public function operateIotbasicUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicUserEx($request, $headers, $runtime);
    }

    /**
     * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
     * Summary: iot平台用户注册操作.
     *
     * @param OperateIotbasicUserRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return OperateIotbasicUserResponse
     */
    public function operateIotbasicUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicUserResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.user.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iot 平台权限操作
     * Summary: iot 平台权限操作.
     *
     * @param OperateIotbasicPermissionRequest $request
     *
     * @return OperateIotbasicPermissionResponse
     */
    public function operateIotbasicPermission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicPermissionEx($request, $headers, $runtime);
    }

    /**
     * Description: iot 平台权限操作
     * Summary: iot 平台权限操作.
     *
     * @param OperateIotbasicPermissionRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return OperateIotbasicPermissionResponse
     */
    public function operateIotbasicPermissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicPermissionResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.permission.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备sn列表查询
     * Summary: IoT设备平台-设备sn列表查询.
     *
     * @param QueryIotbasicSnRequest $request
     *
     * @return QueryIotbasicSnResponse
     */
    public function queryIotbasicSn($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotbasicSnEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备sn列表查询
     * Summary: IoT设备平台-设备sn列表查询.
     *
     * @param QueryIotbasicSnRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryIotbasicSnResponse
     */
    public function queryIotbasicSnEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotbasicSnResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.sn.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备规格查询
     * Summary: IoT设备平台-设备规格查询.
     *
     * @param QueryDeviceSpecsRequest $request
     *
     * @return QueryDeviceSpecsResponse
     */
    public function queryDeviceSpecs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceSpecsEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备规格查询
     * Summary: IoT设备平台-设备规格查询.
     *
     * @param QueryDeviceSpecsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDeviceSpecsResponse
     */
    public function queryDeviceSpecsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceSpecsResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.specs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备规格关系维护
     * Summary: IoT设备平台-设备规格关系维护.
     *
     * @param OperateIotbasicRelrationRequest $request
     *
     * @return OperateIotbasicRelrationResponse
     */
    public function operateIotbasicRelration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicRelrationEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备规格关系维护
     * Summary: IoT设备平台-设备规格关系维护.
     *
     * @param OperateIotbasicRelrationRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return OperateIotbasicRelrationResponse
     */
    public function operateIotbasicRelrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicRelrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.relration.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备字典数据维护
     * Summary: IoT设备平台-设备字典数据维护.
     *
     * @param OperateIotbasicDictionaryRequest $request
     *
     * @return OperateIotbasicDictionaryResponse
     */
    public function operateIotbasicDictionary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicDictionaryEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备字典数据维护
     * Summary: IoT设备平台-设备字典数据维护.
     *
     * @param OperateIotbasicDictionaryRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return OperateIotbasicDictionaryResponse
     */
    public function operateIotbasicDictionaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicDictionaryResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.dictionary.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备品类数据维护
     * Summary: IoT设备平台-设备品类数据维护.
     *
     * @param OperateIotbasicCategoryRequest $request
     *
     * @return OperateIotbasicCategoryResponse
     */
    public function operateIotbasicCategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicCategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备品类数据维护
     * Summary: IoT设备平台-设备品类数据维护.
     *
     * @param OperateIotbasicCategoryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return OperateIotbasicCategoryResponse
     */
    public function operateIotbasicCategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicCategoryResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.category.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备管控配置维护
     * Summary: IoT设备平台-设备管控配置维护.
     *
     * @param OperateIotbasicControlconfigRequest $request
     *
     * @return OperateIotbasicControlconfigResponse
     */
    public function operateIotbasicControlconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicControlconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备管控配置维护
     * Summary: IoT设备平台-设备管控配置维护.
     *
     * @param OperateIotbasicControlconfigRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return OperateIotbasicControlconfigResponse
     */
    public function operateIotbasicControlconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicControlconfigResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.controlconfig.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-上链业务模型配置维护
     * Summary: IoT设备平台-上链业务模型配置维护.
     *
     * @param OperateIotbasicChainmodelRequest $request
     *
     * @return OperateIotbasicChainmodelResponse
     */
    public function operateIotbasicChainmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicChainmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-上链业务模型配置维护
     * Summary: IoT设备平台-上链业务模型配置维护.
     *
     * @param OperateIotbasicChainmodelRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return OperateIotbasicChainmodelResponse
     */
    public function operateIotbasicChainmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicChainmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.chainmodel.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备不可操作标记更新
     * Summary: IoT设备平台-设备不可操作标记更新.
     *
     * @param OperateIotbasicDeviceRequest $request
     *
     * @return OperateIotbasicDeviceResponse
     */
    public function operateIotbasicDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备不可操作标记更新
     * Summary: IoT设备平台-设备不可操作标记更新.
     *
     * @param OperateIotbasicDeviceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return OperateIotbasicDeviceResponse
     */
    public function operateIotbasicDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.device.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: biot设备注册-创建设备
     * Summary: biot设备注册-创建设备.
     *
     * @param CreateIotbasicDeviceRequest $request
     *
     * @return CreateIotbasicDeviceResponse
     */
    public function createIotbasicDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createIotbasicDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: biot设备注册-创建设备
     * Summary: biot设备注册-创建设备.
     *
     * @param CreateIotbasicDeviceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateIotbasicDeviceResponse
     */
    public function createIotbasicDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateIotbasicDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.device.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: biot设备注册-批量创建设备
     * Summary: biot设备注册-批量创建设备.
     *
     * @param BatchcreateIotbasicDeviceRequest $request
     *
     * @return BatchcreateIotbasicDeviceResponse
     */
    public function batchcreateIotbasicDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateIotbasicDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: biot设备注册-批量创建设备
     * Summary: biot设备注册-批量创建设备.
     *
     * @param BatchcreateIotbasicDeviceRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return BatchcreateIotbasicDeviceResponse
     */
    public function batchcreateIotbasicDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateIotbasicDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.device.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: biot设备状态同步
     * Summary: iot平台-设备状态同步.
     *
     * @param SyncIotbasicDevicestatusRequest $request
     *
     * @return SyncIotbasicDevicestatusResponse
     */
    public function syncIotbasicDevicestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncIotbasicDevicestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: biot设备状态同步
     * Summary: iot平台-设备状态同步.
     *
     * @param SyncIotbasicDevicestatusRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SyncIotbasicDevicestatusResponse
     */
    public function syncIotbasicDevicestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncIotbasicDevicestatusResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.devicestatus.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: biot设备-安全认证
     * Summary: biot设备-安全认证
     *
     * @param VerifyIotbasicIdentifyRequest $request
     *
     * @return VerifyIotbasicIdentifyResponse
     */
    public function verifyIotbasicIdentify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyIotbasicIdentifyEx($request, $headers, $runtime);
    }

    /**
     * Description: biot设备-安全认证
     * Summary: biot设备-安全认证
     *
     * @param VerifyIotbasicIdentifyRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return VerifyIotbasicIdentifyResponse
     */
    public function verifyIotbasicIdentifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyIotbasicIdentifyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.identify.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-更新设备信息
     * Summary: IoT设备平台-更新设备信息.
     *
     * @param UpdateIotbasicDeviceRequest $request
     *
     * @return UpdateIotbasicDeviceResponse
     */
    public function updateIotbasicDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateIotbasicDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-更新设备信息
     * Summary: IoT设备平台-更新设备信息.
     *
     * @param UpdateIotbasicDeviceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateIotbasicDeviceResponse
     */
    public function updateIotbasicDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateIotbasicDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.device.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备上链
     * Summary: IoT设备平台-设备上链.
     *
     * @param OperateIotbasicDevicecollectRequest $request
     *
     * @return OperateIotbasicDevicecollectResponse
     */
    public function operateIotbasicDevicecollect($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicDevicecollectEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备上链
     * Summary: IoT设备平台-设备上链.
     *
     * @param OperateIotbasicDevicecollectRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return OperateIotbasicDevicecollectResponse
     */
    public function operateIotbasicDevicecollectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicDevicecollectResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.devicecollect.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-项目空间数据维护
     * Summary: IoT设备平台-项目空间数据维护.
     *
     * @param OperateIotbasicProjectspaceRequest $request
     *
     * @return OperateIotbasicProjectspaceResponse
     */
    public function operateIotbasicProjectspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicProjectspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-项目空间数据维护
     * Summary: IoT设备平台-项目空间数据维护.
     *
     * @param OperateIotbasicProjectspaceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return OperateIotbasicProjectspaceResponse
     */
    public function operateIotbasicProjectspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicProjectspaceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.projectspace.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租房saas-企业信息同步(个人房东)
     * Summary: 租房saas-企业信息同步(个人房东).
     *
     * @param PushRentMerchantRequest $request
     *
     * @return PushRentMerchantResponse
     */
    public function pushRentMerchant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRentMerchantEx($request, $headers, $runtime);
    }

    /**
     * Description: 租房saas-企业信息同步(个人房东)
     * Summary: 租房saas-企业信息同步(个人房东).
     *
     * @param PushRentMerchantRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return PushRentMerchantResponse
     */
    public function pushRentMerchantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRentMerchantResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.rent.merchant.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租房saas-业主账单信息同步
     * Summary: 租房saas-业主账单信息同步.
     *
     * @param PushRentBillRequest $request
     *
     * @return PushRentBillResponse
     */
    public function pushRentBill($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRentBillEx($request, $headers, $runtime);
    }

    /**
     * Description: 租房saas-业主账单信息同步
     * Summary: 租房saas-业主账单信息同步.
     *
     * @param PushRentBillRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return PushRentBillResponse
     */
    public function pushRentBillEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRentBillResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.rent.bill.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租房saas-租客入住信息同步
     * Summary: 租房saas-租客入住信息同步.
     *
     * @param PushRentRenterRequest $request
     *
     * @return PushRentRenterResponse
     */
    public function pushRentRenter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRentRenterEx($request, $headers, $runtime);
    }

    /**
     * Description: 租房saas-租客入住信息同步
     * Summary: 租房saas-租客入住信息同步.
     *
     * @param PushRentRenterRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return PushRentRenterResponse
     */
    public function pushRentRenterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRentRenterResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.rent.renter.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租房saas-租金缴纳支付状态通知
     * Summary: 租房saas-租金缴纳支付状态通知.
     *
     * @param SyncRentRentpaymentRequest $request
     *
     * @return SyncRentRentpaymentResponse
     */
    public function syncRentRentpayment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncRentRentpaymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 租房saas-租金缴纳支付状态通知
     * Summary: 租房saas-租金缴纳支付状态通知.
     *
     * @param SyncRentRentpaymentRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SyncRentRentpaymentResponse
     */
    public function syncRentRentpaymentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncRentRentpaymentResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.rent.rentpayment.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租房saas-房源信息同步
     * Summary: 租房saas-房源信息同步.
     *
     * @param PushRentHouseRequest $request
     *
     * @return PushRentHouseResponse
     */
    public function pushRentHouse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushRentHouseEx($request, $headers, $runtime);
    }

    /**
     * Description: 租房saas-房源信息同步
     * Summary: 租房saas-房源信息同步.
     *
     * @param PushRentHouseRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return PushRentHouseResponse
     */
    public function pushRentHouseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushRentHouseResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.rent.house.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-生成设备认证密钥
     * Summary: IoT设备平台-生成设备认证密钥.
     *
     * @param SyncIotbasicDevicegenerateRequest $request
     *
     * @return SyncIotbasicDevicegenerateResponse
     */
    public function syncIotbasicDevicegenerate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncIotbasicDevicegenerateEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-生成设备认证密钥
     * Summary: IoT设备平台-生成设备认证密钥.
     *
     * @param SyncIotbasicDevicegenerateRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SyncIotbasicDevicegenerateResponse
     */
    public function syncIotbasicDevicegenerateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncIotbasicDevicegenerateResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.devicegenerate.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-批量数据上链
     * Summary: IoT设备平台-批量数据上链.
     *
     * @param OperateIotbasicBatchcollectRequest $request
     *
     * @return OperateIotbasicBatchcollectResponse
     */
    public function operateIotbasicBatchcollect($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicBatchcollectEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-批量数据上链
     * Summary: IoT设备平台-批量数据上链.
     *
     * @param OperateIotbasicBatchcollectRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return OperateIotbasicBatchcollectResponse
     */
    public function operateIotbasicBatchcollectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicBatchcollectResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.batchcollect.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备订单导入
     * Summary: IoT设备平台-设备订单导入.
     *
     * @param ImportIotbasicDeviceorderRequest $request
     *
     * @return ImportIotbasicDeviceorderResponse
     */
    public function importIotbasicDeviceorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importIotbasicDeviceorderEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备订单导入
     * Summary: IoT设备平台-设备订单导入.
     *
     * @param ImportIotbasicDeviceorderRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ImportIotbasicDeviceorderResponse
     */
    public function importIotbasicDeviceorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportIotbasicDeviceorderResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.deviceorder.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-订单批量同步
     * Summary: IoT设备平台-订单批量同步.
     *
     * @param ImportIotbasicDeviceorderbatchRequest $request
     *
     * @return ImportIotbasicDeviceorderbatchResponse
     */
    public function importIotbasicDeviceorderbatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importIotbasicDeviceorderbatchEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-订单批量同步
     * Summary: IoT设备平台-订单批量同步.
     *
     * @param ImportIotbasicDeviceorderbatchRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ImportIotbasicDeviceorderbatchResponse
     */
    public function importIotbasicDeviceorderbatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportIotbasicDeviceorderbatchResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.deviceorderbatch.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-删除设备信息
     * Summary: IoT设备平台-删除设备信息.
     *
     * @param DeleteIotbasicDeviceRequest $request
     *
     * @return DeleteIotbasicDeviceResponse
     */
    public function deleteIotbasicDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteIotbasicDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-删除设备信息
     * Summary: IoT设备平台-删除设备信息.
     *
     * @param DeleteIotbasicDeviceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteIotbasicDeviceResponse
     */
    public function deleteIotbasicDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteIotbasicDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.device.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备远程管控
     * Summary: IoT设备平台-设备远程管控.
     *
     * @param OperateIotbasicDevicecontrolRequest $request
     *
     * @return OperateIotbasicDevicecontrolResponse
     */
    public function operateIotbasicDevicecontrol($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicDevicecontrolEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备远程管控
     * Summary: IoT设备平台-设备远程管控.
     *
     * @param OperateIotbasicDevicecontrolRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return OperateIotbasicDevicecontrolResponse
     */
    public function operateIotbasicDevicecontrolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicDevicecontrolResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.devicecontrol.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备注册结果查询
     * Summary: IoT设备平台-设备注册结果查询.
     *
     * @param QueryDeviceRegisterresultRequest $request
     *
     * @return QueryDeviceRegisterresultResponse
     */
    public function queryDeviceRegisterresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceRegisterresultEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备注册结果查询
     * Summary: IoT设备平台-设备注册结果查询.
     *
     * @param QueryDeviceRegisterresultRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryDeviceRegisterresultResponse
     */
    public function queryDeviceRegisterresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceRegisterresultResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.registerresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备状态查询
     * Summary: IoT设备平台-设备状态查询.
     *
     * @param QueryDeviceStatusRequest $request
     *
     * @return QueryDeviceStatusResponse
     */
    public function queryDeviceStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备状态查询
     * Summary: IoT设备平台-设备状态查询.
     *
     * @param QueryDeviceStatusRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryDeviceStatusResponse
     */
    public function queryDeviceStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceStatusResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-openApi操作
     * Summary: IoT设备平台-openApi操作.
     *
     * @param OperateIotbasicOpenapiRequest $request
     *
     * @return OperateIotbasicOpenapiResponse
     */
    public function operateIotbasicOpenapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateIotbasicOpenapiEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-openApi操作
     * Summary: IoT设备平台-openApi操作.
     *
     * @param OperateIotbasicOpenapiRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return OperateIotbasicOpenapiResponse
     */
    public function operateIotbasicOpenapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateIotbasicOpenapiResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.openapi.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上链数据分页查询
     * Summary: 上链数据分页查询.
     *
     * @param QueryIotbasicDevicecollectRequest $request
     *
     * @return QueryIotbasicDevicecollectResponse
     */
    public function queryIotbasicDevicecollect($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotbasicDevicecollectEx($request, $headers, $runtime);
    }

    /**
     * Description: 上链数据分页查询
     * Summary: 上链数据分页查询.
     *
     * @param QueryIotbasicDevicecollectRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryIotbasicDevicecollectResponse
     */
    public function queryIotbasicDevicecollectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotbasicDevicecollectResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.devicecollect.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单上链数据分页查询
     * Summary: 订单上链数据分页查询.
     *
     * @param QueryIotbasicDeviceorderRequest $request
     *
     * @return QueryIotbasicDeviceorderResponse
     */
    public function queryIotbasicDeviceorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotbasicDeviceorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单上链数据分页查询
     * Summary: 订单上链数据分页查询.
     *
     * @param QueryIotbasicDeviceorderRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryIotbasicDeviceorderResponse
     */
    public function queryIotbasicDeviceorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotbasicDeviceorderResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.deviceorder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-订单数据推送中台
     * Summary: IoT设备平台-订单数据推送中台.
     *
     * @param PushIotbasicMeterdataRequest $request
     *
     * @return PushIotbasicMeterdataResponse
     */
    public function pushIotbasicMeterdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushIotbasicMeterdataEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-订单数据推送中台
     * Summary: IoT设备平台-订单数据推送中台.
     *
     * @param PushIotbasicMeterdataRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PushIotbasicMeterdataResponse
     */
    public function pushIotbasicMeterdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushIotbasicMeterdataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.meterdata.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-客户新增
     * Summary: IoT设备平台-中台签约客户同步.
     *
     * @param SaveIotbasicCustomerRequest $request
     *
     * @return SaveIotbasicCustomerResponse
     */
    public function saveIotbasicCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveIotbasicCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-客户新增
     * Summary: IoT设备平台-中台签约客户同步.
     *
     * @param SaveIotbasicCustomerRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SaveIotbasicCustomerResponse
     */
    public function saveIotbasicCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveIotbasicCustomerResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.customer.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设备消息同步
     * Summary: IoT设备平台-设备消息同步.
     *
     * @param NotifyThirddeviceMessageRequest $request
     *
     * @return NotifyThirddeviceMessageResponse
     */
    public function notifyThirddeviceMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyThirddeviceMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设备消息同步
     * Summary: IoT设备平台-设备消息同步.
     *
     * @param NotifyThirddeviceMessageRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return NotifyThirddeviceMessageResponse
     */
    public function notifyThirddeviceMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyThirddeviceMessageResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thirddevice.message.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Iotbasic-厂商入驻
     * Summary: Iotbasic-厂商入驻.
     *
     * @param RegisterIotbasicCorpjoinRequest $request
     *
     * @return RegisterIotbasicCorpjoinResponse
     */
    public function registerIotbasicCorpjoin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerIotbasicCorpjoinEx($request, $headers, $runtime);
    }

    /**
     * Description: Iotbasic-厂商入驻
     * Summary: Iotbasic-厂商入驻.
     *
     * @param RegisterIotbasicCorpjoinRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return RegisterIotbasicCorpjoinResponse
     */
    public function registerIotbasicCorpjoinEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterIotbasicCorpjoinResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.corpjoin.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-查询设备链上资产详情
     * Summary: IoT设备平台-查询设备链上资产详情.
     *
     * @param QueryTxtransactionDeviceRequest $request
     *
     * @return QueryTxtransactionDeviceResponse
     */
    public function queryTxtransactionDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTxtransactionDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-查询设备链上资产详情
     * Summary: IoT设备平台-查询设备链上资产详情.
     *
     * @param QueryTxtransactionDeviceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryTxtransactionDeviceResponse
     */
    public function queryTxtransactionDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTxtransactionDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.txtransaction.device.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-查询业务数据链上资产详情
     * Summary: IoT设备平台-查询业务数据链上资产详情.
     *
     * @param QueryTxtransactionChaindataRequest $request
     *
     * @return QueryTxtransactionChaindataResponse
     */
    public function queryTxtransactionChaindata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTxtransactionChaindataEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-查询业务数据链上资产详情
     * Summary: IoT设备平台-查询业务数据链上资产详情.
     *
     * @param QueryTxtransactionChaindataRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryTxtransactionChaindataResponse
     */
    public function queryTxtransactionChaindataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTxtransactionChaindataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.txtransaction.chaindata.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-生成云上认证设备认证密钥
     * Summary: IoT设备平台-生成云上认证设备认证密钥.
     *
     * @param InitIotbasicDevicekeyRequest $request
     *
     * @return InitIotbasicDevicekeyResponse
     */
    public function initIotbasicDevicekey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initIotbasicDevicekeyEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-生成云上认证设备认证密钥
     * Summary: IoT设备平台-生成云上认证设备认证密钥.
     *
     * @param InitIotbasicDevicekeyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return InitIotbasicDevicekeyResponse
     */
    public function initIotbasicDevicekeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitIotbasicDevicekeyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.devicekey.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-设置设备属性
     * Summary: IoT设备平台-设置设备属性.
     *
     * @param SetDevicePropertyRequest $request
     *
     * @return SetDevicePropertyResponse
     */
    public function setDeviceProperty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setDevicePropertyEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-设置设备属性
     * Summary: IoT设备平台-设置设备属性.
     *
     * @param SetDevicePropertyRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SetDevicePropertyResponse
     */
    public function setDevicePropertyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetDevicePropertyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.property.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: IoT设备平台-批量设置设备属性
     * Summary: IoT设备平台-批量设置设备属性.
     *
     * @param SetDevicelistPropertyRequest $request
     *
     * @return SetDevicelistPropertyResponse
     */
    public function setDevicelistProperty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setDevicelistPropertyEx($request, $headers, $runtime);
    }

    /**
     * Description: IoT设备平台-批量设置设备属性
     * Summary: IoT设备平台-批量设置设备属性.
     *
     * @param SetDevicelistPropertyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SetDevicelistPropertyResponse
     */
    public function setDevicelistPropertyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetDevicelistPropertyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicelist.property.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-查询品类列表
     * Summary: iotbasic-查询品类列表.
     *
     * @param QueryIotbasicCategorylistRequest $request
     *
     * @return QueryIotbasicCategorylistResponse
     */
    public function queryIotbasicCategorylist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotbasicCategorylistEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-查询品类列表
     * Summary: iotbasic-查询品类列表.
     *
     * @param QueryIotbasicCategorylistRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryIotbasicCategorylistResponse
     */
    public function queryIotbasicCategorylistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotbasicCategorylistResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.categorylist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-查询项目空间列表
     * Summary: iotbasic-查询项目空间列表.
     *
     * @param QueryIotbasicProjectspacelistRequest $request
     *
     * @return QueryIotbasicProjectspacelistResponse
     */
    public function queryIotbasicProjectspacelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotbasicProjectspacelistEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-查询项目空间列表
     * Summary: iotbasic-查询项目空间列表.
     *
     * @param QueryIotbasicProjectspacelistRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryIotbasicProjectspacelistResponse
     */
    public function queryIotbasicProjectspacelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotbasicProjectspacelistResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.projectspacelist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商入驻
     * Summary: iotbasic-设备厂商入驻.
     *
     * @param RegisterDevicecorpCustomerRequest $request
     *
     * @return RegisterDevicecorpCustomerResponse
     */
    public function registerDevicecorpCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerDevicecorpCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商入驻
     * Summary: iotbasic-设备厂商入驻.
     *
     * @param RegisterDevicecorpCustomerRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return RegisterDevicecorpCustomerResponse
     */
    public function registerDevicecorpCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterDevicecorpCustomerResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.customer.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商产品查询
     * Summary: iotbasic-设备厂商产品查询.
     *
     * @param GetDevicecorpProductinfoRequest $request
     *
     * @return GetDevicecorpProductinfoResponse
     */
    public function getDevicecorpProductinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDevicecorpProductinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商产品查询
     * Summary: iotbasic-设备厂商产品查询.
     *
     * @param GetDevicecorpProductinfoRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetDevicecorpProductinfoResponse
     */
    public function getDevicecorpProductinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDevicecorpProductinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.productinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-添加设备厂商设备属性
     * Summary: iotbasic-添加设备厂商设备属性.
     *
     * @param AddDevicecorpDeviceattributesRequest $request
     *
     * @return AddDevicecorpDeviceattributesResponse
     */
    public function addDevicecorpDeviceattributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDevicecorpDeviceattributesEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-添加设备厂商设备属性
     * Summary: iotbasic-添加设备厂商设备属性.
     *
     * @param AddDevicecorpDeviceattributesRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return AddDevicecorpDeviceattributesResponse
     */
    public function addDevicecorpDeviceattributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDevicecorpDeviceattributesResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.deviceattributes.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-指定设备上调用指定服务
     * Summary: iotbasic-指定设备上调用指定服务
     *
     * @param ExecDeviceThingserviceRequest $request
     *
     * @return ExecDeviceThingserviceResponse
     */
    public function execDeviceThingservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execDeviceThingserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-指定设备上调用指定服务
     * Summary: iotbasic-指定设备上调用指定服务
     *
     * @param ExecDeviceThingserviceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ExecDeviceThingserviceResponse
     */
    public function execDeviceThingserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecDeviceThingserviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.thingservice.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-查看产品物模型功能定义
     * Summary: iotbasic-查看产品物模型功能定义.
     *
     * @param QueryDeviceThingmodelRequest $request
     *
     * @return QueryDeviceThingmodelResponse
     */
    public function queryDeviceThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-查看产品物模型功能定义
     * Summary: iotbasic-查看产品物模型功能定义.
     *
     * @param QueryDeviceThingmodelRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryDeviceThingmodelResponse
     */
    public function queryDeviceThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.thingmodel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-查询设备物模型数据
     * Summary: iotbasic-查询设备物模型数据.
     *
     * @param QueryDeviceModeldataRequest $request
     *
     * @return QueryDeviceModeldataResponse
     */
    public function queryDeviceModeldata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceModeldataEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-查询设备物模型数据
     * Summary: iotbasic-查询设备物模型数据.
     *
     * @param QueryDeviceModeldataRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryDeviceModeldataResponse
     */
    public function queryDeviceModeldataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceModeldataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.modeldata.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商注册设备
     * Summary: iotbasic-设备厂商注册设备.
     *
     * @param CreateDevicecorpDeviceRequest $request
     *
     * @return CreateDevicecorpDeviceResponse
     */
    public function createDevicecorpDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDevicecorpDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商注册设备
     * Summary: iotbasic-设备厂商注册设备.
     *
     * @param CreateDevicecorpDeviceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateDevicecorpDeviceResponse
     */
    public function createDevicecorpDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDevicecorpDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.device.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商批量注册设备
     * Summary: iotbasic-设备厂商批量注册设备.
     *
     * @param BatchcreateDevicecorpDeviceRequest $request
     *
     * @return BatchcreateDevicecorpDeviceResponse
     */
    public function batchcreateDevicecorpDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateDevicecorpDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商批量注册设备
     * Summary: iotbasic-设备厂商批量注册设备.
     *
     * @param BatchcreateDevicecorpDeviceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return BatchcreateDevicecorpDeviceResponse
     */
    public function batchcreateDevicecorpDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateDevicecorpDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.device.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-查询设备厂商企业注册结果
     * Summary: 查询设备厂商企业注册结果.
     *
     * @param QueryDevicecorpCustomerregisterresultRequest $request
     *
     * @return QueryDevicecorpCustomerregisterresultResponse
     */
    public function queryDevicecorpCustomerregisterresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDevicecorpCustomerregisterresultEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-查询设备厂商企业注册结果
     * Summary: 查询设备厂商企业注册结果.
     *
     * @param QueryDevicecorpCustomerregisterresultRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryDevicecorpCustomerregisterresultResponse
     */
    public function queryDevicecorpCustomerregisterresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDevicecorpCustomerregisterresultResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.customerregisterresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-管控设备厂商设备
     * Summary: iotbasic-管控设备厂商设备.
     *
     * @param OperateDevicecorpDevicecontrolRequest $request
     *
     * @return OperateDevicecorpDevicecontrolResponse
     */
    public function operateDevicecorpDevicecontrol($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateDevicecorpDevicecontrolEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-管控设备厂商设备
     * Summary: iotbasic-管控设备厂商设备.
     *
     * @param OperateDevicecorpDevicecontrolRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return OperateDevicecorpDevicecontrolResponse
     */
    public function operateDevicecorpDevicecontrolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateDevicecorpDevicecontrolResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.devicecontrol.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商创建物模型
     * Summary: iotbasic-设备厂商创建物模型.
     *
     * @param CreateDevicecorpThingmodelRequest $request
     *
     * @return CreateDevicecorpThingmodelResponse
     */
    public function createDevicecorpThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDevicecorpThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商创建物模型
     * Summary: iotbasic-设备厂商创建物模型.
     *
     * @param CreateDevicecorpThingmodelRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateDevicecorpThingmodelResponse
     */
    public function createDevicecorpThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDevicecorpThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.thingmodel.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商修改物模型
     * Summary: iotbasic-设备厂商修改物模型.
     *
     * @param UpdateDevicecorpThingmodelRequest $request
     *
     * @return UpdateDevicecorpThingmodelResponse
     */
    public function updateDevicecorpThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDevicecorpThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商修改物模型
     * Summary: iotbasic-设备厂商修改物模型.
     *
     * @param UpdateDevicecorpThingmodelRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateDevicecorpThingmodelResponse
     */
    public function updateDevicecorpThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDevicecorpThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.thingmodel.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商删除物模型
     * Summary: iotbasic-设备厂商删除物模型.
     *
     * @param DeleteDevicecorpThingmodelRequest $request
     *
     * @return DeleteDevicecorpThingmodelResponse
     */
    public function deleteDevicecorpThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDevicecorpThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商删除物模型
     * Summary: iotbasic-设备厂商删除物模型.
     *
     * @param DeleteDevicecorpThingmodelRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DeleteDevicecorpThingmodelResponse
     */
    public function deleteDevicecorpThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDevicecorpThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.thingmodel.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商发布物模型
     * Summary: iotbasic-设备厂商发布物模型.
     *
     * @param PublishDevicecorpThingmodelRequest $request
     *
     * @return PublishDevicecorpThingmodelResponse
     */
    public function publishDevicecorpThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishDevicecorpThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商发布物模型
     * Summary: iotbasic-设备厂商发布物模型.
     *
     * @param PublishDevicecorpThingmodelRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return PublishDevicecorpThingmodelResponse
     */
    public function publishDevicecorpThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishDevicecorpThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.devicecorp.thingmodel.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约链接获取
     * Summary: 代扣签约链接获取.
     *
     * @param CreateDigitalkeyWithholdsignRequest $request
     *
     * @return CreateDigitalkeyWithholdsignResponse
     */
    public function createDigitalkeyWithholdsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDigitalkeyWithholdsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约链接获取
     * Summary: 代扣签约链接获取.
     *
     * @param CreateDigitalkeyWithholdsignRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateDigitalkeyWithholdsignResponse
     */
    public function createDigitalkeyWithholdsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDigitalkeyWithholdsignResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withholdsign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣签约解除
     * Summary: 代扣签约解除.
     *
     * @param UnbindDigitalkeyWithholdsignRequest $request
     *
     * @return UnbindDigitalkeyWithholdsignResponse
     */
    public function unbindDigitalkeyWithholdsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindDigitalkeyWithholdsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣签约解除
     * Summary: 代扣签约解除.
     *
     * @param UnbindDigitalkeyWithholdsignRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UnbindDigitalkeyWithholdsignResponse
     */
    public function unbindDigitalkeyWithholdsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindDigitalkeyWithholdsignResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withholdsign.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 网约车代扣支付
     * Summary: 网约车代扣支付.
     *
     * @param PayDigitalkeyWithholdRequest $request
     *
     * @return PayDigitalkeyWithholdResponse
     */
    public function payDigitalkeyWithhold($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->payDigitalkeyWithholdEx($request, $headers, $runtime);
    }

    /**
     * Description: 网约车代扣支付
     * Summary: 网约车代扣支付.
     *
     * @param PayDigitalkeyWithholdRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PayDigitalkeyWithholdResponse
     */
    public function payDigitalkeyWithholdEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PayDigitalkeyWithholdResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withhold.pay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣支付交易退款
     * Summary: 代扣支付交易退款.
     *
     * @param RefuseDigitalkeyWithholdpayRequest $request
     *
     * @return RefuseDigitalkeyWithholdpayResponse
     */
    public function refuseDigitalkeyWithholdpay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->refuseDigitalkeyWithholdpayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣支付交易退款
     * Summary: 代扣支付交易退款.
     *
     * @param RefuseDigitalkeyWithholdpayRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return RefuseDigitalkeyWithholdpayResponse
     */
    public function refuseDigitalkeyWithholdpayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RefuseDigitalkeyWithholdpayResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withholdpay.refuse', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣协议查询
     * Summary: 代扣协议查询.
     *
     * @param QueryDigitalkeyWithholdsignRequest $request
     *
     * @return QueryDigitalkeyWithholdsignResponse
     */
    public function queryDigitalkeyWithholdsign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDigitalkeyWithholdsignEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣协议查询
     * Summary: 代扣协议查询.
     *
     * @param QueryDigitalkeyWithholdsignRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryDigitalkeyWithholdsignResponse
     */
    public function queryDigitalkeyWithholdsignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDigitalkeyWithholdsignResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withholdsign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣支付撤销
     * Summary: 代扣支付撤销
     *
     * @param CancelDigitalkeyWithholdpayRequest $request
     *
     * @return CancelDigitalkeyWithholdpayResponse
     */
    public function cancelDigitalkeyWithholdpay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelDigitalkeyWithholdpayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣支付撤销
     * Summary: 代扣支付撤销
     *
     * @param CancelDigitalkeyWithholdpayRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CancelDigitalkeyWithholdpayResponse
     */
    public function cancelDigitalkeyWithholdpayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelDigitalkeyWithholdpayResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withholdpay.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣扣款前预通知
     * Summary: 代扣扣款前预通知.
     *
     * @param NotifyDigitalkeyWithholdpreRequest $request
     *
     * @return NotifyDigitalkeyWithholdpreResponse
     */
    public function notifyDigitalkeyWithholdpre($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyDigitalkeyWithholdpreEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣扣款前预通知
     * Summary: 代扣扣款前预通知.
     *
     * @param NotifyDigitalkeyWithholdpreRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return NotifyDigitalkeyWithholdpreResponse
     */
    public function notifyDigitalkeyWithholdpreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyDigitalkeyWithholdpreResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withholdpre.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-查询品类行业，场景列表
     * Summary: iotbasic-查询品类行业，场景列表.
     *
     * @param QueryCategoryIndustryscenelistRequest $request
     *
     * @return QueryCategoryIndustryscenelistResponse
     */
    public function queryCategoryIndustryscenelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCategoryIndustryscenelistEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-查询品类行业，场景列表
     * Summary: iotbasic-查询品类行业，场景列表.
     *
     * @param QueryCategoryIndustryscenelistRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryCategoryIndustryscenelistResponse
     */
    public function queryCategoryIndustryscenelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCategoryIndustryscenelistResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.category.industryscenelist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-创建自定义品类
     * Summary: iotbasic-创建自定义品类.
     *
     * @param CreateCategoryCustomRequest $request
     *
     * @return CreateCategoryCustomResponse
     */
    public function createCategoryCustom($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCategoryCustomEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-创建自定义品类
     * Summary: iotbasic-创建自定义品类.
     *
     * @param CreateCategoryCustomRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateCategoryCustomResponse
     */
    public function createCategoryCustomEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCategoryCustomResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.category.custom.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备模型创建
     * Summary: iotbasic-设备模型创建.
     *
     * @param CreateDeviceModelRequest $request
     *
     * @return CreateDeviceModelResponse
     */
    public function createDeviceModel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDeviceModelEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备模型创建
     * Summary: iotbasic-设备模型创建.
     *
     * @param CreateDeviceModelRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateDeviceModelResponse
     */
    public function createDeviceModelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDeviceModelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.model.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-创建iot产品
     * Summary: iotbasic-创建iot产品
     *
     * @param CreateIotbasicProductRequest $request
     *
     * @return CreateIotbasicProductResponse
     */
    public function createIotbasicProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createIotbasicProductEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-创建iot产品
     * Summary: iotbasic-创建iot产品
     *
     * @param CreateIotbasicProductRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateIotbasicProductResponse
     */
    public function createIotbasicProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateIotbasicProductResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.product.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣支付订单查询
     * Summary: 代扣支付订单查询.
     *
     * @param QueryDigitalkeyWithholdpayRequest $request
     *
     * @return QueryDigitalkeyWithholdpayResponse
     */
    public function queryDigitalkeyWithholdpay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDigitalkeyWithholdpayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣支付订单查询
     * Summary: 代扣支付订单查询.
     *
     * @param QueryDigitalkeyWithholdpayRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryDigitalkeyWithholdpayResponse
     */
    public function queryDigitalkeyWithholdpayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDigitalkeyWithholdpayResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.withholdpay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代扣支付查询
     * Summary: 代扣支付查询.
     *
     * @param QueryDigitalkeyTradepayRequest $request
     *
     * @return QueryDigitalkeyTradepayResponse
     */
    public function queryDigitalkeyTradepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDigitalkeyTradepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 代扣支付查询
     * Summary: 代扣支付查询.
     *
     * @param QueryDigitalkeyTradepayRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDigitalkeyTradepayResponse
     */
    public function queryDigitalkeyTradepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDigitalkeyTradepayResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.tradepay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-查询数控设备信息
     * Summary: iotbasic-查询数控设备信息.
     *
     * @param GetDigitalkeyDeviceinfoRequest $request
     *
     * @return GetDigitalkeyDeviceinfoResponse
     */
    public function getDigitalkeyDeviceinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDigitalkeyDeviceinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-查询数控设备信息
     * Summary: iotbasic-查询数控设备信息.
     *
     * @param GetDigitalkeyDeviceinfoRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetDigitalkeyDeviceinfoResponse
     */
    public function getDigitalkeyDeviceinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDigitalkeyDeviceinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.deviceinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-新增应用
     * Summary: iotbasic-新增应用.
     *
     * @param CreateIotlinkAppmanagerRequest $request
     *
     * @return CreateIotlinkAppmanagerResponse
     */
    public function createIotlinkAppmanager($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createIotlinkAppmanagerEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-新增应用
     * Summary: iotbasic-新增应用.
     *
     * @param CreateIotlinkAppmanagerRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateIotlinkAppmanagerResponse
     */
    public function createIotlinkAppmanagerEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'blockchain.bot.iotlink.appmanager.create',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new CreateIotlinkAppmanagerResponse([
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

        return CreateIotlinkAppmanagerResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.appmanager.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-获取应用模块列表
     * Summary: iotbasic-获取应用模块列表.
     *
     * @param ListIotlinkOtamoduleRequest $request
     *
     * @return ListIotlinkOtamoduleResponse
     */
    public function listIotlinkOtamodule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listIotlinkOtamoduleEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-获取应用模块列表
     * Summary: iotbasic-获取应用模块列表.
     *
     * @param ListIotlinkOtamoduleRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListIotlinkOtamoduleResponse
     */
    public function listIotlinkOtamoduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListIotlinkOtamoduleResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.otamodule.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-分页查询应用列表
     * Summary: iotbasic-分页查询应用列表.
     *
     * @param PagequeryIotlinkAppmanagerRequest $request
     *
     * @return PagequeryIotlinkAppmanagerResponse
     */
    public function pagequeryIotlinkAppmanager($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryIotlinkAppmanagerEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-分页查询应用列表
     * Summary: iotbasic-分页查询应用列表.
     *
     * @param PagequeryIotlinkAppmanagerRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryIotlinkAppmanagerResponse
     */
    public function pagequeryIotlinkAppmanagerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryIotlinkAppmanagerResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.appmanager.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-获取应用下载地址
     * Summary: iotbasic-获取应用下载地址
     *
     * @param GetIotlinkAppmanagerfileurlRequest $request
     *
     * @return GetIotlinkAppmanagerfileurlResponse
     */
    public function getIotlinkAppmanagerfileurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getIotlinkAppmanagerfileurlEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-获取应用下载地址
     * Summary: iotbasic-获取应用下载地址
     *
     * @param GetIotlinkAppmanagerfileurlRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetIotlinkAppmanagerfileurlResponse
     */
    public function getIotlinkAppmanagerfileurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetIotlinkAppmanagerfileurlResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.appmanagerfileurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-分页查询发布批次列表
     * Summary: iotbasic-分页查询发布批次列表.
     *
     * @param PagequeryIotlinkAppreleaseorderRequest $request
     *
     * @return PagequeryIotlinkAppreleaseorderResponse
     */
    public function pagequeryIotlinkAppreleaseorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryIotlinkAppreleaseorderEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-分页查询发布批次列表
     * Summary: iotbasic-分页查询发布批次列表.
     *
     * @param PagequeryIotlinkAppreleaseorderRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return PagequeryIotlinkAppreleaseorderResponse
     */
    public function pagequeryIotlinkAppreleaseorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryIotlinkAppreleaseorderResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.appreleaseorder.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-分页查询设备升级列表
     * Summary: iotbasic-分页查询设备升级列表.
     *
     * @param PagequeryIotlinkAppreleasedeviceRequest $request
     *
     * @return PagequeryIotlinkAppreleasedeviceResponse
     */
    public function pagequeryIotlinkAppreleasedevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryIotlinkAppreleasedeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-分页查询设备升级列表
     * Summary: iotbasic-分页查询设备升级列表.
     *
     * @param PagequeryIotlinkAppreleasedeviceRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return PagequeryIotlinkAppreleasedeviceResponse
     */
    public function pagequeryIotlinkAppreleasedeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryIotlinkAppreleasedeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.appreleasedevice.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-发布工单
     * Summary: iotbasic-发布工单.
     *
     * @param PublishIotlinkAppreleaseorderRequest $request
     *
     * @return PublishIotlinkAppreleaseorderResponse
     */
    public function publishIotlinkAppreleaseorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishIotlinkAppreleaseorderEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-发布工单
     * Summary: iotbasic-发布工单.
     *
     * @param PublishIotlinkAppreleaseorderRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return PublishIotlinkAppreleaseorderResponse
     */
    public function publishIotlinkAppreleaseorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishIotlinkAppreleaseorderResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.appreleaseorder.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-取消工单发布
     * Summary: iotbasic-取消工单发布.
     *
     * @param CancelIotlinkAppreleaseorderRequest $request
     *
     * @return CancelIotlinkAppreleaseorderResponse
     */
    public function cancelIotlinkAppreleaseorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelIotlinkAppreleaseorderEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-取消工单发布
     * Summary: iotbasic-取消工单发布.
     *
     * @param CancelIotlinkAppreleaseorderRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CancelIotlinkAppreleaseorderResponse
     */
    public function cancelIotlinkAppreleaseorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelIotlinkAppreleaseorderResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.appreleaseorder.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-取消设备升级
     * Summary: iotbasic-取消设备升级.
     *
     * @param CancelIotlinkAppreleasedeviceRequest $request
     *
     * @return CancelIotlinkAppreleasedeviceResponse
     */
    public function cancelIotlinkAppreleasedevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelIotlinkAppreleasedeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-取消设备升级
     * Summary: iotbasic-取消设备升级.
     *
     * @param CancelIotlinkAppreleasedeviceRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CancelIotlinkAppreleasedeviceResponse
     */
    public function cancelIotlinkAppreleasedeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelIotlinkAppreleasedeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.appreleasedevice.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-重试设备升级
     * Summary: iotbasic-重试设备升级.
     *
     * @param RetryIotlinkAppreleasedeviceRequest $request
     *
     * @return RetryIotlinkAppreleasedeviceResponse
     */
    public function retryIotlinkAppreleasedevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retryIotlinkAppreleasedeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-重试设备升级
     * Summary: iotbasic-重试设备升级.
     *
     * @param RetryIotlinkAppreleasedeviceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return RetryIotlinkAppreleasedeviceResponse
     */
    public function retryIotlinkAppreleasedeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetryIotlinkAppreleasedeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.appreleasedevice.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-创建应用类型
     * Summary: iotbasic-创建应用类型.
     *
     * @param CreateIotlinkOtamoduleRequest $request
     *
     * @return CreateIotlinkOtamoduleResponse
     */
    public function createIotlinkOtamodule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createIotlinkOtamoduleEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-创建应用类型
     * Summary: iotbasic-创建应用类型.
     *
     * @param CreateIotlinkOtamoduleRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateIotlinkOtamoduleResponse
     */
    public function createIotlinkOtamoduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateIotlinkOtamoduleResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.otamodule.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-修改应用类型
     * Summary: iotbasic-修改应用类型.
     *
     * @param UpdateIotlinkOtamoduleRequest $request
     *
     * @return UpdateIotlinkOtamoduleResponse
     */
    public function updateIotlinkOtamodule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateIotlinkOtamoduleEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-修改应用类型
     * Summary: iotbasic-修改应用类型.
     *
     * @param UpdateIotlinkOtamoduleRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateIotlinkOtamoduleResponse
     */
    public function updateIotlinkOtamoduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateIotlinkOtamoduleResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.otamodule.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-删除应用类型
     * Summary: iotbasic-删除应用类型.
     *
     * @param DeleteIotlinkOtamoduleRequest $request
     *
     * @return DeleteIotlinkOtamoduleResponse
     */
    public function deleteIotlinkOtamodule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteIotlinkOtamoduleEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-删除应用类型
     * Summary: iotbasic-删除应用类型.
     *
     * @param DeleteIotlinkOtamoduleRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteIotlinkOtamoduleResponse
     */
    public function deleteIotlinkOtamoduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteIotlinkOtamoduleResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.otamodule.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-设备厂商导入物模型
     * Summary: iotbasic-设备厂商导入物模型.
     *
     * @param ImportIotlinkThingmodeltslRequest $request
     *
     * @return ImportIotlinkThingmodeltslResponse
     */
    public function importIotlinkThingmodeltsl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importIotlinkThingmodeltslEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-设备厂商导入物模型
     * Summary: iotbasic-设备厂商导入物模型.
     *
     * @param ImportIotlinkThingmodeltslRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ImportIotlinkThingmodeltslResponse
     */
    public function importIotlinkThingmodeltslEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportIotlinkThingmodeltslResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotlink.thingmodeltsl.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-重置设备认证秘钥
     * Summary: iotbasic-重置设备认证秘钥.
     *
     * @param ResetIotbasicDeviceseckeyRequest $request
     *
     * @return ResetIotbasicDeviceseckeyResponse
     */
    public function resetIotbasicDeviceseckey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resetIotbasicDeviceseckeyEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-重置设备认证秘钥
     * Summary: iotbasic-重置设备认证秘钥.
     *
     * @param ResetIotbasicDeviceseckeyRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ResetIotbasicDeviceseckeyResponse
     */
    public function resetIotbasicDeviceseckeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResetIotbasicDeviceseckeyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotbasic.deviceseckey.reset', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 预授权支付订单创建
     * Summary: 预授权支付订单创建.
     *
     * @param CreateDigitalkeyPreauthpayRequest $request
     *
     * @return CreateDigitalkeyPreauthpayResponse
     */
    public function createDigitalkeyPreauthpay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDigitalkeyPreauthpayEx($request, $headers, $runtime);
    }

    /**
     * Description: 预授权支付订单创建
     * Summary: 预授权支付订单创建.
     *
     * @param CreateDigitalkeyPreauthpayRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateDigitalkeyPreauthpayResponse
     */
    public function createDigitalkeyPreauthpayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDigitalkeyPreauthpayResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.preauthpay.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 预授权资金撤销
     * Summary: 预授权资金撤销
     *
     * @param CancelDigitalkeyPreauthpayRequest $request
     *
     * @return CancelDigitalkeyPreauthpayResponse
     */
    public function cancelDigitalkeyPreauthpay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelDigitalkeyPreauthpayEx($request, $headers, $runtime);
    }

    /**
     * Description: 预授权资金撤销
     * Summary: 预授权资金撤销
     *
     * @param CancelDigitalkeyPreauthpayRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CancelDigitalkeyPreauthpayResponse
     */
    public function cancelDigitalkeyPreauthpayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelDigitalkeyPreauthpayResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.preauthpay.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 预授权资金解冻
     * Summary: 预授权资金解冻.
     *
     * @param UnfreezeDigitalkeyPreauthpayRequest $request
     *
     * @return UnfreezeDigitalkeyPreauthpayResponse
     */
    public function unfreezeDigitalkeyPreauthpay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unfreezeDigitalkeyPreauthpayEx($request, $headers, $runtime);
    }

    /**
     * Description: 预授权资金解冻
     * Summary: 预授权资金解冻.
     *
     * @param UnfreezeDigitalkeyPreauthpayRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UnfreezeDigitalkeyPreauthpayResponse
     */
    public function unfreezeDigitalkeyPreauthpayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnfreezeDigitalkeyPreauthpayResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.preauthpay.unfreeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 预授权支付订单查询
     * Summary: 预授权支付订单查询.
     *
     * @param QueryDigitalkeyPreauthpayRequest $request
     *
     * @return QueryDigitalkeyPreauthpayResponse
     */
    public function queryDigitalkeyPreauthpay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDigitalkeyPreauthpayEx($request, $headers, $runtime);
    }

    /**
     * Description: 预授权支付订单查询
     * Summary: 预授权支付订单查询.
     *
     * @param QueryDigitalkeyPreauthpayRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryDigitalkeyPreauthpayResponse
     */
    public function queryDigitalkeyPreauthpayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDigitalkeyPreauthpayResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.digitalkey.preauthpay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-客户指定设备调用服务
     * Summary: iotbasic-客户指定设备调用服务
     *
     * @param ExecDeviceCustomerthingserviceRequest $request
     *
     * @return ExecDeviceCustomerthingserviceResponse
     */
    public function execDeviceCustomerthingservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execDeviceCustomerthingserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-客户指定设备调用服务
     * Summary: iotbasic-客户指定设备调用服务
     *
     * @param ExecDeviceCustomerthingserviceRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ExecDeviceCustomerthingserviceResponse
     */
    public function execDeviceCustomerthingserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecDeviceCustomerthingserviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.customerthingservice.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 在指定设备上对自定义topic 远程下发消息
     * Summary: 自定义topic远程调用.
     *
     * @param ExecDeviceUsertopicRequest $request
     *
     * @return ExecDeviceUsertopicResponse
     */
    public function execDeviceUsertopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execDeviceUsertopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 在指定设备上对自定义topic 远程下发消息
     * Summary: 自定义topic远程调用.
     *
     * @param ExecDeviceUsertopicRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecDeviceUsertopicResponse
     */
    public function execDeviceUsertopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecDeviceUsertopicResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.usertopic.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 主动往设备下发消息，提供给数科上游业务系统使用
     * Summary: 主动往设备下发消息.
     *
     * @param PushDeviceMessageRequest $request
     *
     * @return PushDeviceMessageResponse
     */
    public function pushDeviceMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushDeviceMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 主动往设备下发消息，提供给数科上游业务系统使用
     * Summary: 主动往设备下发消息.
     *
     * @param PushDeviceMessageRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PushDeviceMessageResponse
     */
    public function pushDeviceMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushDeviceMessageResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.message.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: iotbasic-四轮车安全驾驶事件同步
     * Summary: iotbasic-四轮车安全驾驶事件同步.
     *
     * @param SyncFourwheelerCareventRequest $request
     *
     * @return SyncFourwheelerCareventResponse
     */
    public function syncFourwheelerCarevent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncFourwheelerCareventEx($request, $headers, $runtime);
    }

    /**
     * Description: iotbasic-四轮车安全驾驶事件同步
     * Summary: iotbasic-四轮车安全驾驶事件同步.
     *
     * @param SyncFourwheelerCareventRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncFourwheelerCareventResponse
     */
    public function syncFourwheelerCareventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncFourwheelerCareventResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.fourwheeler.carevent.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过指定字段查询车辆最新的信息
     * Summary: 二轮车车辆状态实时查询.
     *
     * @param QueryElectrocarRealtimedataRequest $request
     *
     * @return QueryElectrocarRealtimedataResponse
     */
    public function queryElectrocarRealtimedata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryElectrocarRealtimedataEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过指定字段查询车辆最新的信息
     * Summary: 二轮车车辆状态实时查询.
     *
     * @param QueryElectrocarRealtimedataRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryElectrocarRealtimedataResponse
     */
    public function queryElectrocarRealtimedataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryElectrocarRealtimedataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.electrocar.realtimedata.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询一段时间范围的所有行程记录及明细
     * Summary: 二轮车行程记录查询.
     *
     * @param QueryElectrocarTravelRequest $request
     *
     * @return QueryElectrocarTravelResponse
     */
    public function queryElectrocarTravel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryElectrocarTravelEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询一段时间范围的所有行程记录及明细
     * Summary: 二轮车行程记录查询.
     *
     * @param QueryElectrocarTravelRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryElectrocarTravelResponse
     */
    public function queryElectrocarTravelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryElectrocarTravelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.electrocar.travel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 厂商注册接口
     * Summary: 车钥匙厂商注册.
     *
     * @param RegisterCarkeyscorpCustomerRequest $request
     *
     * @return RegisterCarkeyscorpCustomerResponse
     */
    public function registerCarkeyscorpCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerCarkeyscorpCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 厂商注册接口
     * Summary: 车钥匙厂商注册.
     *
     * @param RegisterCarkeyscorpCustomerRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return RegisterCarkeyscorpCustomerResponse
     */
    public function registerCarkeyscorpCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterCarkeyscorpCustomerResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.carkeyscorp.customer.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 申请凭证
     * Summary: 申请凭证
     *
     * @param CreateElectrocarApplycarkeycertificateRequest $request
     *
     * @return CreateElectrocarApplycarkeycertificateResponse
     */
    public function createElectrocarApplycarkeycertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createElectrocarApplycarkeycertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 申请凭证
     * Summary: 申请凭证
     *
     * @param CreateElectrocarApplycarkeycertificateRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return CreateElectrocarApplycarkeycertificateResponse
     */
    public function createElectrocarApplycarkeycertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateElectrocarApplycarkeycertificateResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.electrocar.applycarkeycertificate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据设备串号查询采购设备
     * Summary: 根据设备串号查询采购设备.
     *
     * @param QueryIotplatformPurchaseorderRequest $request
     *
     * @return QueryIotplatformPurchaseorderResponse
     */
    public function queryIotplatformPurchaseorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIotplatformPurchaseorderEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据设备串号查询采购设备
     * Summary: 根据设备串号查询采购设备.
     *
     * @param QueryIotplatformPurchaseorderRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryIotplatformPurchaseorderResponse
     */
    public function queryIotplatformPurchaseorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIotplatformPurchaseorderResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotplatform.purchaseorder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
     * Summary: 绑定MeshId及设备SN.
     *
     * @param ImportIotplatformMeshidRequest $request
     *
     * @return ImportIotplatformMeshidResponse
     */
    public function importIotplatformMeshid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importIotplatformMeshidEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
     * Summary: 绑定MeshId及设备SN.
     *
     * @param ImportIotplatformMeshidRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ImportIotplatformMeshidResponse
     */
    public function importIotplatformMeshidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportIotplatformMeshidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotplatform.meshid.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 与租赁宝对接采购订单导入的接口
     * Summary: 与租赁宝对接采购订单导入的接口.
     *
     * @param ImportPurchaseorderThirdpartyRequest $request
     *
     * @return ImportPurchaseorderThirdpartyResponse
     */
    public function importPurchaseorderThirdparty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importPurchaseorderThirdpartyEx($request, $headers, $runtime);
    }

    /**
     * Description: 与租赁宝对接采购订单导入的接口
     * Summary: 与租赁宝对接采购订单导入的接口.
     *
     * @param ImportPurchaseorderThirdpartyRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ImportPurchaseorderThirdpartyResponse
     */
    public function importPurchaseorderThirdpartyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportPurchaseorderThirdpartyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.purchaseorder.thirdparty.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 采购平台新增供应商角色
     * Summary: 采购平台新增供应商角色.
     *
     * @param AddUserRoleRequest $request
     *
     * @return AddUserRoleResponse
     */
    public function addUserRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addUserRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 采购平台新增供应商角色
     * Summary: 采购平台新增供应商角色.
     *
     * @param AddUserRoleRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AddUserRoleResponse
     */
    public function addUserRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddUserRoleResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.user.role.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 采购平台新增SKU
     * Summary: 采购平台新增SKU.
     *
     * @param AddGoodsSkuRequest $request
     *
     * @return AddGoodsSkuResponse
     */
    public function addGoodsSku($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addGoodsSkuEx($request, $headers, $runtime);
    }

    /**
     * Description: 采购平台新增SKU
     * Summary: 采购平台新增SKU.
     *
     * @param AddGoodsSkuRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AddGoodsSkuResponse
     */
    public function addGoodsSkuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddGoodsSkuResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.goods.sku.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Iotplatform-设备订单计费上传
     * Summary: Iotplatform-设备订单计费上传.
     *
     * @param PushMeterdataOrderRequest $request
     *
     * @return PushMeterdataOrderResponse
     */
    public function pushMeterdataOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushMeterdataOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: Iotplatform-设备订单计费上传
     * Summary: Iotplatform-设备订单计费上传.
     *
     * @param PushMeterdataOrderRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PushMeterdataOrderResponse
     */
    public function pushMeterdataOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushMeterdataOrderResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.meterdata.order.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 3c商品开通消息转发
     * Summary: 3c商品开通消息转发.
     *
     * @param OpenIotplantformProductRequest $request
     *
     * @return OpenIotplantformProductResponse
     */
    public function openIotplantformProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openIotplantformProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 3c商品开通消息转发
     * Summary: 3c商品开通消息转发.
     *
     * @param OpenIotplantformProductRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return OpenIotplantformProductResponse
     */
    public function openIotplantformProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenIotplantformProductResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotplantform.product.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 3c商品停止消息转发
     * Summary: 3c商品停止消息转发.
     *
     * @param StopIotplantformProductRequest $request
     *
     * @return StopIotplantformProductResponse
     */
    public function stopIotplantformProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopIotplantformProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 3c商品停止消息转发
     * Summary: 3c商品停止消息转发.
     *
     * @param StopIotplantformProductRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return StopIotplantformProductResponse
     */
    public function stopIotplantformProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopIotplantformProductResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotplantform.product.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 3c商品恢复消息转发
     * Summary: 3c商品恢复消息转发.
     *
     * @param ResumeIotplantformProductRequest $request
     *
     * @return ResumeIotplantformProductResponse
     */
    public function resumeIotplantformProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resumeIotplantformProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 3c商品恢复消息转发
     * Summary: 3c商品恢复消息转发.
     *
     * @param ResumeIotplantformProductRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ResumeIotplantformProductResponse
     */
    public function resumeIotplantformProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResumeIotplantformProductResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.iotplantform.product.resume', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数据模型
     * Summary: 创建数据模型.
     *
     * @param CreateDeviceDatamodelRequest $request
     *
     * @return CreateDeviceDatamodelResponse
     */
    public function createDeviceDatamodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDeviceDatamodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数据模型
     * Summary: 创建数据模型.
     *
     * @param CreateDeviceDatamodelRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateDeviceDatamodelResponse
     */
    public function createDeviceDatamodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDeviceDatamodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.datamodel.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取数据模型
     * Summary: 获取数据模型.
     *
     * @param GetDeviceDatamodelRequest $request
     *
     * @return GetDeviceDatamodelResponse
     */
    public function getDeviceDatamodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDeviceDatamodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取数据模型
     * Summary: 获取数据模型.
     *
     * @param GetDeviceDatamodelRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetDeviceDatamodelResponse
     */
    public function getDeviceDatamodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDeviceDatamodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.datamodel.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册设备
     * Summary: 注册设备.
     *
     * @param ImportDeviceRequest $request
     *
     * @return ImportDeviceResponse
     */
    public function importDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册设备
     * Summary: 注册设备.
     *
     * @param ImportDeviceRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ImportDeviceResponse
     */
    public function importDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过chainId获取设备详情
     * Summary: 通过chainId获取设备详情.
     *
     * @param GetDeviceBychainidRequest $request
     *
     * @return GetDeviceBychainidResponse
     */
    public function getDeviceBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDeviceBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过chainId获取设备详情
     * Summary: 通过chainId获取设备详情.
     *
     * @param GetDeviceBychainidRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetDeviceBychainidResponse
     */
    public function getDeviceBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDeviceBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.bychainid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过deviceId获取设备详情
     * Summary: 通过deviceId获取设备详情.
     *
     * @param GetDeviceBydeviceidRequest $request
     *
     * @return GetDeviceBydeviceidResponse
     */
    public function getDeviceBydeviceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDeviceBydeviceidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过deviceId获取设备详情
     * Summary: 通过deviceId获取设备详情.
     *
     * @param GetDeviceBydeviceidRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetDeviceBydeviceidResponse
     */
    public function getDeviceBydeviceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDeviceBydeviceidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.bydeviceid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过场景码列举设备
     * Summary: 通过场景码列举设备.
     *
     * @param ListDeviceBysceneRequest $request
     *
     * @return ListDeviceBysceneResponse
     */
    public function listDeviceByscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDeviceBysceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过场景码列举设备
     * Summary: 通过场景码列举设备.
     *
     * @param ListDeviceBysceneRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListDeviceBysceneResponse
     */
    public function listDeviceBysceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDeviceBysceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.byscene.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新设备信息
     * Summary: 更新设备信息.
     *
     * @param UpdateDeviceInfoRequest $request
     *
     * @return UpdateDeviceInfoResponse
     */
    public function updateDeviceInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDeviceInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新设备信息
     * Summary: 更新设备信息.
     *
     * @param UpdateDeviceInfoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateDeviceInfoResponse
     */
    public function updateDeviceInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDeviceInfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.info.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 免签名注册设备
     * Summary: 免签名注册设备.
     *
     * @param CreateDistributedeviceBydeviceidRequest $request
     *
     * @return CreateDistributedeviceBydeviceidResponse
     */
    public function createDistributedeviceBydeviceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBydeviceidEx($request, $headers, $runtime);
    }

    /**
     * Description: 免签名注册设备
     * Summary: 免签名注册设备.
     *
     * @param CreateDistributedeviceBydeviceidRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateDistributedeviceBydeviceidResponse
     */
    public function createDistributedeviceBydeviceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBydeviceidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydeviceid.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过链上设备Id发行
     * Summary: 通过链上设备Id发行.
     *
     * @param CreateDistributedeviceBychainidRequest $request
     *
     * @return CreateDistributedeviceBychainidResponse
     */
    public function createDistributedeviceBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过链上设备Id发行
     * Summary: 通过链上设备Id发行.
     *
     * @param CreateDistributedeviceBychainidRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return CreateDistributedeviceBychainidResponse
     */
    public function createDistributedeviceBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainid.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 替换发行设备
     * Summary: 替换发行设备.
     *
     * @param ReplaceDistributedeviceBychainidRequest $request
     *
     * @return ReplaceDistributedeviceBychainidResponse
     */
    public function replaceDistributedeviceBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceDistributedeviceBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 替换发行设备
     * Summary: 替换发行设备.
     *
     * @param ReplaceDistributedeviceBychainidRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return ReplaceDistributedeviceBychainidResponse
     */
    public function replaceDistributedeviceBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceDistributedeviceBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainid.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传单个设备所产生的设备数据
     * Summary: 上传设备数据.
     *
     * @param SendCollectorBychainidRequest $request
     *
     * @return SendCollectorBychainidResponse
     */
    public function sendCollectorBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCollectorBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传单个设备所产生的设备数据
     * Summary: 上传设备数据.
     *
     * @param SendCollectorBychainidRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SendCollectorBychainidResponse
     */
    public function sendCollectorBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCollectorBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.bychainid.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过Id获取发行设备
     * Summary: 通过Id获取发行设备.
     *
     * @param GetDistributedeviceBychainidRequest $request
     *
     * @return GetDistributedeviceBychainidResponse
     */
    public function getDistributedeviceBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDistributedeviceBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过Id获取发行设备
     * Summary: 通过Id获取发行设备.
     *
     * @param GetDistributedeviceBychainidRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return GetDistributedeviceBychainidResponse
     */
    public function getDistributedeviceBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDistributedeviceBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过场景码列举发行设备
     * Summary: 通过场景码列举发行设备.
     *
     * @param ListDistributedeviceBysceneRequest $request
     *
     * @return ListDistributedeviceBysceneResponse
     */
    public function listDistributedeviceByscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDistributedeviceBysceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过场景码列举发行设备
     * Summary: 通过场景码列举发行设备.
     *
     * @param ListDistributedeviceBysceneRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ListDistributedeviceBysceneResponse
     */
    public function listDistributedeviceBysceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDistributedeviceBysceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.byscene.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建消费者
     * Summary: 创建消费者.
     *
     * @param CreateConsumerRequest $request
     *
     * @return CreateConsumerResponse
     */
    public function createConsumer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createConsumerEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建消费者
     * Summary: 创建消费者.
     *
     * @param CreateConsumerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateConsumerResponse
     */
    public function createConsumerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateConsumerResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.consumer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费者订阅
     * Summary: 消费者订阅.
     *
     * @param SetConsumerSubscribeRequest $request
     *
     * @return SetConsumerSubscribeResponse
     */
    public function setConsumerSubscribe($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumerSubscribeEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费者订阅
     * Summary: 消费者订阅.
     *
     * @param SetConsumerSubscribeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SetConsumerSubscribeResponse
     */
    public function setConsumerSubscribeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumerSubscribeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.consumer.subscribe.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费者取消订阅设备
     * Summary: 消费者取消订阅设备.
     *
     * @param SetConsumerUnsubscribeRequest $request
     *
     * @return SetConsumerUnsubscribeResponse
     */
    public function setConsumerUnsubscribe($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setConsumerUnsubscribeEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费者取消订阅设备
     * Summary: 消费者取消订阅设备.
     *
     * @param SetConsumerUnsubscribeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SetConsumerUnsubscribeResponse
     */
    public function setConsumerUnsubscribeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetConsumerUnsubscribeResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.consumer.unsubscribe.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费者获取数据
     * Summary: 消费者获取数据.
     *
     * @param PullConsumerDatasourceRequest $request
     *
     * @return PullConsumerDatasourceResponse
     */
    public function pullConsumerDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullConsumerDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费者获取数据
     * Summary: 消费者获取数据.
     *
     * @param PullConsumerDatasourceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PullConsumerDatasourceResponse
     */
    public function pullConsumerDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullConsumerDatasourceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.consumer.datasource.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过设备id获取发行设备详情
     * Summary: 通过设备id获取发行设备详情.
     *
     * @param GetDistributedeviceBydeviceidRequest $request
     *
     * @return GetDistributedeviceBydeviceidResponse
     */
    public function getDistributedeviceBydeviceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDistributedeviceBydeviceidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过设备id获取发行设备详情
     * Summary: 通过设备id获取发行设备详情.
     *
     * @param GetDistributedeviceBydeviceidRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return GetDistributedeviceBydeviceidResponse
     */
    public function getDistributedeviceBydeviceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDistributedeviceBydeviceidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydeviceid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过发行id获取设备
     * Summary: 通过发行id获取设备.
     *
     * @param GetDistributedeviceBydisidRequest $request
     *
     * @return GetDistributedeviceBydisidResponse
     */
    public function getDistributedeviceBydisid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDistributedeviceBydisidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过发行id获取设备
     * Summary: 通过发行id获取设备.
     *
     * @param GetDistributedeviceBydisidRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetDistributedeviceBydisidResponse
     */
    public function getDistributedeviceBydisidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDistributedeviceBydisidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydisid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册外围设备
     * Summary: 注册外围设备.
     *
     * @param ImportPeripheralRequest $request
     *
     * @return ImportPeripheralResponse
     */
    public function importPeripheral($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importPeripheralEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册外围设备
     * Summary: 注册外围设备.
     *
     * @param ImportPeripheralRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportPeripheralResponse
     */
    public function importPeripheralEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportPeripheralResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.peripheral.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过链上外围设备ID获取详情
     * Summary: 通过链上外围设备ID获取详情.
     *
     * @param GetPeripheralBychainperipheralidRequest $request
     *
     * @return GetPeripheralBychainperipheralidResponse
     */
    public function getPeripheralBychainperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getPeripheralBychainperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过链上外围设备ID获取详情
     * Summary: 通过链上外围设备ID获取详情.
     *
     * @param GetPeripheralBychainperipheralidRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return GetPeripheralBychainperipheralidResponse
     */
    public function getPeripheralBychainperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetPeripheralBychainperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.peripheral.bychainperipheralid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过外围设备ID获取详情
     * Summary: 通过外围设备ID获取详情.
     *
     * @param GetPeripheralByperipheralidRequest $request
     *
     * @return GetPeripheralByperipheralidResponse
     */
    public function getPeripheralByperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getPeripheralByperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过外围设备ID获取详情
     * Summary: 通过外围设备ID获取详情.
     *
     * @param GetPeripheralByperipheralidRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetPeripheralByperipheralidResponse
     */
    public function getPeripheralByperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetPeripheralByperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.peripheral.byperipheralid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据场景列举外围设备
     * Summary: 根据场景列举外围设备.
     *
     * @param ListPeripheralBysceneRequest $request
     *
     * @return ListPeripheralBysceneResponse
     */
    public function listPeripheralByscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listPeripheralBysceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据场景列举外围设备
     * Summary: 根据场景列举外围设备.
     *
     * @param ListPeripheralBysceneRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListPeripheralBysceneResponse
     */
    public function listPeripheralBysceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListPeripheralBysceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.peripheral.byscene.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过外围设备Id发行
     * Summary: 通过外围设备Id发行.
     *
     * @param CreateDistributedeviceByperipheralidRequest $request
     *
     * @return CreateDistributedeviceByperipheralidResponse
     */
    public function createDistributedeviceByperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceByperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过外围设备Id发行
     * Summary: 通过外围设备Id发行.
     *
     * @param CreateDistributedeviceByperipheralidRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return CreateDistributedeviceByperipheralidResponse
     */
    public function createDistributedeviceByperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceByperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.byperipheralid.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过链上外围设备Id发行
     * Summary: 通过链上外围设备Id发行.
     *
     * @param CreateDistributedeviceBychainperipheralidRequest $request
     *
     * @return CreateDistributedeviceBychainperipheralidResponse
     */
    public function createDistributedeviceBychainperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBychainperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过链上外围设备Id发行
     * Summary: 通过链上外围设备Id发行.
     *
     * @param CreateDistributedeviceBychainperipheralidRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return CreateDistributedeviceBychainperipheralidResponse
     */
    public function createDistributedeviceBychainperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBychainperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 替换发行外围设备 by 链上外围设备ID
     * Summary: 替换发行外围设备 by 链上外围设备ID.
     *
     * @param ReplaceDistributedeviceBychainperipheralidRequest $request
     *
     * @return ReplaceDistributedeviceBychainperipheralidResponse
     */
    public function replaceDistributedeviceBychainperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceDistributedeviceBychainperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 替换发行外围设备 by 链上外围设备ID
     * Summary: 替换发行外围设备 by 链上外围设备ID.
     *
     * @param ReplaceDistributedeviceBychainperipheralidRequest $request
     * @param string[]                                          $headers
     * @param RuntimeOptions                                    $runtime
     *
     * @return ReplaceDistributedeviceBychainperipheralidResponse
     */
    public function replaceDistributedeviceBychainperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceDistributedeviceBychainperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据场景列举发行外围设备
     * Summary: 根据场景列举发行外围设备.
     *
     * @param ListDistributedeviceByperipheralsceneRequest $request
     *
     * @return ListDistributedeviceByperipheralsceneResponse
     */
    public function listDistributedeviceByperipheralscene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDistributedeviceByperipheralsceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据场景列举发行外围设备
     * Summary: 根据场景列举发行外围设备.
     *
     * @param ListDistributedeviceByperipheralsceneRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return ListDistributedeviceByperipheralsceneResponse
     */
    public function listDistributedeviceByperipheralsceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDistributedeviceByperipheralsceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.byperipheralscene.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过外围设备ID获取发行外围设备信息
     * Summary: 通过外围设备ID获取发行外围设备信息.
     *
     * @param GetDistributedeviceByperipheralidRequest $request
     *
     * @return GetDistributedeviceByperipheralidResponse
     */
    public function getDistributedeviceByperipheralid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDistributedeviceByperipheralidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过外围设备ID获取发行外围设备信息
     * Summary: 通过外围设备ID获取发行外围设备信息.
     *
     * @param GetDistributedeviceByperipheralidRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return GetDistributedeviceByperipheralidResponse
     */
    public function getDistributedeviceByperipheralidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDistributedeviceByperipheralidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.byperipheralid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行设备by_devcie
     * Summary: 发行设备by_devcie.
     *
     * @param CreateDistributedeviceBydeviceRequest $request
     *
     * @return CreateDistributedeviceBydeviceResponse
     */
    public function createDistributedeviceBydevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBydeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行设备by_devcie
     * Summary: 发行设备by_devcie.
     *
     * @param CreateDistributedeviceBydeviceRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return CreateDistributedeviceBydeviceResponse
     */
    public function createDistributedeviceBydeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBydeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydevice.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 远程任务创建
     * Summary: 远程任务创建.
     *
     * @param CreateTaskRequest $request
     *
     * @return CreateTaskResponse
     */
    public function createTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 远程任务创建
     * Summary: 远程任务创建.
     *
     * @param CreateTaskRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateTaskResponse
     */
    public function createTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 远程任务查询
     * Summary: 远程任务查询.
     *
     * @param QueryTaskRequest $request
     *
     * @return QueryTaskResponse
     */
    public function queryTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 远程任务查询
     * Summary: 远程任务查询.
     *
     * @param QueryTaskRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryTaskResponse
     */
    public function queryTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分析数据查询
     * Summary: 分析数据查询.
     *
     * @param QueryAnalysisRequest $request
     *
     * @return QueryAnalysisResponse
     */
    public function queryAnalysis($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAnalysisEx($request, $headers, $runtime);
    }

    /**
     * Description: 分析数据查询
     * Summary: 分析数据查询.
     *
     * @param QueryAnalysisRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryAnalysisResponse
     */
    public function queryAnalysisEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAnalysisResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.analysis.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
     * Summary: 上传设备数据mul.
     *
     * @param SendCollectorBychainidmulRequest $request
     *
     * @return SendCollectorBychainidmulResponse
     */
    public function sendCollectorBychainidmul($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCollectorBychainidmulEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
     * Summary: 上传设备数据mul.
     *
     * @param SendCollectorBychainidmulRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return SendCollectorBychainidmulResponse
     */
    public function sendCollectorBychainidmulEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCollectorBychainidmulResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.bychainidmul.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传设备业务数据
     * Summary: 上传设备业务数据.
     *
     * @param SendCollectorDevicebizdataRequest $request
     *
     * @return SendCollectorDevicebizdataResponse
     */
    public function sendCollectorDevicebizdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCollectorDevicebizdataEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传设备业务数据
     * Summary: 上传设备业务数据.
     *
     * @param SendCollectorDevicebizdataRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SendCollectorDevicebizdataResponse
     */
    public function sendCollectorDevicebizdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCollectorDevicebizdataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.devicebizdata.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新设备信息by_devcie
     * Summary: 更新设备信息by_devcie.
     *
     * @param UpdateDeviceInfobydeviceRequest $request
     *
     * @return UpdateDeviceInfobydeviceResponse
     */
    public function updateDeviceInfobydevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDeviceInfobydeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新设备信息by_devcie
     * Summary: 更新设备信息by_devcie.
     *
     * @param UpdateDeviceInfobydeviceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateDeviceInfobydeviceResponse
     */
    public function updateDeviceInfobydeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDeviceInfobydeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.infobydevice.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 下线设备
     * Summary: 下线设备.
     *
     * @param OfflineDeviceRequest $request
     *
     * @return OfflineDeviceResponse
     */
    public function offlineDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 下线设备
     * Summary: 下线设备.
     *
     * @param OfflineDeviceRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return OfflineDeviceResponse
     */
    public function offlineDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 申请MQTT token
     * Summary: 申请MQTT token.
     *
     * @param ApplyMqtokenRequest $request
     *
     * @return ApplyMqtokenResponse
     */
    public function applyMqtoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyMqtokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 申请MQTT token
     * Summary: 申请MQTT token.
     *
     * @param ApplyMqtokenRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ApplyMqtokenResponse
     */
    public function applyMqtokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyMqtokenResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.mqtoken.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询设备所注册的公钥是否正确
     * Summary: 查询注册信息.
     *
     * @param QueryDeviceRegistrationRequest $request
     *
     * @return QueryDeviceRegistrationResponse
     */
    public function queryDeviceRegistration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceRegistrationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询设备所注册的公钥是否正确
     * Summary: 查询注册信息.
     *
     * @param QueryDeviceRegistrationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDeviceRegistrationResponse
     */
    public function queryDeviceRegistrationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceRegistrationResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.registration.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备异常上报
     * Summary: 设备异常上报.
     *
     * @param AddAbnormalRequest $request
     *
     * @return AddAbnormalResponse
     */
    public function addAbnormal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addAbnormalEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备异常上报
     * Summary: 设备异常上报.
     *
     * @param AddAbnormalRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AddAbnormalResponse
     */
    public function addAbnormalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddAbnormalResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.abnormal.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备下线后，可通过此接口重新上线
     * Summary: 设置设备状态为上线
     *
     * @param OnlineDeviceRequest $request
     *
     * @return OnlineDeviceResponse
     */
    public function onlineDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->onlineDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备下线后，可通过此接口重新上线
     * Summary: 设置设备状态为上线
     *
     * @param OnlineDeviceRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return OnlineDeviceResponse
     */
    public function onlineDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OnlineDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.online', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注销设备
     * Summary: 注销设备.
     *
     * @param OfflineDeviceByunregisterRequest $request
     *
     * @return OfflineDeviceByunregisterResponse
     */
    public function offlineDeviceByunregister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineDeviceByunregisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 注销设备
     * Summary: 注销设备.
     *
     * @param OfflineDeviceByunregisterRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return OfflineDeviceByunregisterResponse
     */
    public function offlineDeviceByunregisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineDeviceByunregisterResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.byunregister.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签状态查询
     * Summary: 标签状态查询.
     *
     * @param QueryLabelTraceRequest $request
     *
     * @return QueryLabelTraceResponse
     */
    public function queryLabelTrace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLabelTraceEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签状态查询
     * Summary: 标签状态查询.
     *
     * @param QueryLabelTraceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryLabelTraceResponse
     */
    public function queryLabelTraceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLabelTraceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.label.trace.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签流转状态同步
     * Summary: 标签流转状态同步.
     *
     * @param SyncLabelTransferRequest $request
     *
     * @return SyncLabelTransferResponse
     */
    public function syncLabelTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncLabelTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签流转状态同步
     * Summary: 标签流转状态同步.
     *
     * @param SyncLabelTransferRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SyncLabelTransferResponse
     */
    public function syncLabelTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncLabelTransferResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.label.transfer.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签资产绑定
     * Summary: 标签资产绑定.
     *
     * @param AddLabelAssetRequest $request
     *
     * @return AddLabelAssetResponse
     */
    public function addLabelAsset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addLabelAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签资产绑定
     * Summary: 标签资产绑定.
     *
     * @param AddLabelAssetRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AddLabelAssetResponse
     */
    public function addLabelAssetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddLabelAssetResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.label.asset.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过tx_hash查询上链信息
     * Summary: 链上信息查询.
     *
     * @param QueryDataBytxhashRequest $request
     *
     * @return QueryDataBytxhashResponse
     */
    public function queryDataBytxhash($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDataBytxhashEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过tx_hash查询上链信息
     * Summary: 链上信息查询.
     *
     * @param QueryDataBytxhashRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryDataBytxhashResponse
     */
    public function queryDataBytxhashEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDataBytxhashResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.data.bytxhash.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据taskId 执行未处理的任务
     * Summary: 执行未处理的任务
     *
     * @param ExecUnprocessedTaskRequest $request
     *
     * @return ExecUnprocessedTaskResponse
     */
    public function execUnprocessedTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execUnprocessedTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据taskId 执行未处理的任务
     * Summary: 执行未处理的任务
     *
     * @param ExecUnprocessedTaskRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecUnprocessedTaskResponse
     */
    public function execUnprocessedTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecUnprocessedTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.unprocessed.task.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传汇总数据
     * Summary: 上传汇总数据.
     *
     * @param SendCollectorSummarydataRequest $request
     *
     * @return SendCollectorSummarydataResponse
     */
    public function sendCollectorSummarydata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendCollectorSummarydataEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传汇总数据
     * Summary: 上传汇总数据.
     *
     * @param SendCollectorSummarydataRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SendCollectorSummarydataResponse
     */
    public function sendCollectorSummarydataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendCollectorSummarydataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.summarydata.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据请求体内容保存密钥
     * Summary: 保存公钥.
     *
     * @param AddCertificateRequest $request
     *
     * @return AddCertificateResponse
     */
    public function addCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据请求体内容保存密钥
     * Summary: 保存公钥.
     *
     * @param AddCertificateRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AddCertificateResponse
     */
    public function addCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddCertificateResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.certificate.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增租户
     * Summary: 新增租户.
     *
     * @param AddTenantRequest $request
     *
     * @return AddTenantResponse
     */
    public function addTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增租户
     * Summary: 新增租户.
     *
     * @param AddTenantRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return AddTenantResponse
     */
    public function addTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddTenantResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tenant.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增场景码
     * Summary: 新增场景码
     *
     * @param AddSceneRequest $request
     *
     * @return AddSceneResponse
     */
    public function addScene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增场景码
     * Summary: 新增场景码
     *
     * @param AddSceneRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return AddSceneResponse
     */
    public function addSceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.scene.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 部署场景合同
     * Summary: 部署场景合同.
     *
     * @param DeploySceneRequest $request
     *
     * @return DeploySceneResponse
     */
    public function deployScene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deploySceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 部署场景合同
     * Summary: 部署场景合同.
     *
     * @param DeploySceneRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return DeploySceneResponse
     */
    public function deploySceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeploySceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.scene.deploy', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增sdk
     * Summary: 新增sdk.
     *
     * @param AddSdkRequest $request
     *
     * @return AddSdkResponse
     */
    public function addSdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增sdk
     * Summary: 新增sdk.
     *
     * @param AddSdkRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return AddSdkResponse
     */
    public function addSdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSdkResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.sdk.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新sdk
     * Summary: 更新sdk.
     *
     * @param UpdateSdkRequest $request
     *
     * @return UpdateSdkResponse
     */
    public function updateSdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新sdk
     * Summary: 更新sdk.
     *
     * @param UpdateSdkRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return UpdateSdkResponse
     */
    public function updateSdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSdkResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.sdk.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增productKey
     * Summary: 新增productKey.
     *
     * @param AddProductkeyRequest $request
     *
     * @return AddProductkeyResponse
     */
    public function addProductkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addProductkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增productKey
     * Summary: 新增productKey.
     *
     * @param AddProductkeyRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AddProductkeyResponse
     */
    public function addProductkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddProductkeyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.productkey.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新productKey
     * Summary: 更新productKey.
     *
     * @param UpdateProductkeyRequest $request
     *
     * @return UpdateProductkeyResponse
     */
    public function updateProductkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateProductkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新productKey
     * Summary: 更新productKey.
     *
     * @param UpdateProductkeyRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateProductkeyResponse
     */
    public function updateProductkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateProductkeyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.productkey.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新租户
     * Summary: 更新租户.
     *
     * @param UpdateTenantRequest $request
     *
     * @return UpdateTenantResponse
     */
    public function updateTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新租户
     * Summary: 更新租户.
     *
     * @param UpdateTenantRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return UpdateTenantResponse
     */
    public function updateTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTenantResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tenant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新场景码
     * Summary: 更新场景码
     *
     * @param UpdateSceneRequest $request
     *
     * @return UpdateSceneResponse
     */
    public function updateScene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新场景码
     * Summary: 更新场景码
     *
     * @param UpdateSceneRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return UpdateSceneResponse
     */
    public function updateSceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.scene.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
     * Summary: 上报标签流转的异步接口.
     *
     * @param SendLabelTransferonasyncRequest $request
     *
     * @return SendLabelTransferonasyncResponse
     */
    public function sendLabelTransferonasync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendLabelTransferonasyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
     * Summary: 上报标签流转的异步接口.
     *
     * @param SendLabelTransferonasyncRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SendLabelTransferonasyncResponse
     */
    public function sendLabelTransferonasyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendLabelTransferonasyncResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.label.transferonasync.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果
     * Summary: 异步接口结果查询.
     *
     * @param QueryAsyncRequestRequest $request
     *
     * @return QueryAsyncRequestResponse
     */
    public function queryAsyncRequest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAsyncRequestEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果
     * Summary: 异步接口结果查询.
     *
     * @param QueryAsyncRequestRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryAsyncRequestResponse
     */
    public function queryAsyncRequestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAsyncRequestResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.async.request.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询租户
     * Summary: 分页查询租户.
     *
     * @param PagequeryTenantRequest $request
     *
     * @return PagequeryTenantResponse
     */
    public function pagequeryTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询租户
     * Summary: 分页查询租户.
     *
     * @param PagequeryTenantRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return PagequeryTenantResponse
     */
    public function pagequeryTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTenantResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tenant.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询场景码
     * Summary: 分页查询场景码
     *
     * @param PagequerySceneRequest $request
     *
     * @return PagequerySceneResponse
     */
    public function pagequeryScene($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequerySceneEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询场景码
     * Summary: 分页查询场景码
     *
     * @param PagequerySceneRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return PagequerySceneResponse
     */
    public function pagequerySceneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequerySceneResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.scene.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询sdk
     * Summary: 分页查询sdk.
     *
     * @param PagequerySdkRequest $request
     *
     * @return PagequerySdkResponse
     */
    public function pagequerySdk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequerySdkEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询sdk
     * Summary: 分页查询sdk.
     *
     * @param PagequerySdkRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return PagequerySdkResponse
     */
    public function pagequerySdkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequerySdkResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.sdk.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询productKey
     * Summary: 分页查询productKey.
     *
     * @param PagequeryProductkeyRequest $request
     *
     * @return PagequeryProductkeyResponse
     */
    public function pagequeryProductkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryProductkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询productKey
     * Summary: 分页查询productKey.
     *
     * @param PagequeryProductkeyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PagequeryProductkeyResponse
     */
    public function pagequeryProductkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryProductkeyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.productkey.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询校验失败的数据
     * Summary: 分页查询校验失败的数据.
     *
     * @param PagequeryDataverifyFailureRequest $request
     *
     * @return PagequeryDataverifyFailureResponse
     */
    public function pagequeryDataverifyFailure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryDataverifyFailureEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询校验失败的数据
     * Summary: 分页查询校验失败的数据.
     *
     * @param PagequeryDataverifyFailureRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryDataverifyFailureResponse
     */
    public function pagequeryDataverifyFailureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryDataverifyFailureResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.dataverify.failure.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  新增告警策略
     * Summary:  新增告警策略.
     *
     * @param AddAlertStrategyRequest $request
     *
     * @return AddAlertStrategyResponse
     */
    public function addAlertStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addAlertStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description:  新增告警策略
     * Summary:  新增告警策略.
     *
     * @param AddAlertStrategyRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddAlertStrategyResponse
     */
    public function addAlertStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddAlertStrategyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.alert.strategy.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新告警策略接口
     * Summary: 更新告警策略接口.
     *
     * @param UpdateAlertStrategyRequest $request
     *
     * @return UpdateAlertStrategyResponse
     */
    public function updateAlertStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAlertStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新告警策略接口
     * Summary: 更新告警策略接口.
     *
     * @param UpdateAlertStrategyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateAlertStrategyResponse
     */
    public function updateAlertStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAlertStrategyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.alert.strategy.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询告警策略接口
     * Summary: 分页查询告警策略接口.
     *
     * @param PagequeryAlertStrategyRequest $request
     *
     * @return PagequeryAlertStrategyResponse
     */
    public function pagequeryAlertStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryAlertStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询告警策略接口
     * Summary: 分页查询告警策略接口.
     *
     * @param PagequeryAlertStrategyRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PagequeryAlertStrategyResponse
     */
    public function pagequeryAlertStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryAlertStrategyResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.alert.strategy.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签流转状态同步（元数据，无签名）
     * Summary: 标签流转状态同步（元数据，无签名）.
     *
     * @param SyncLabelTransferrawRequest $request
     *
     * @return SyncLabelTransferrawResponse
     */
    public function syncLabelTransferraw($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncLabelTransferrawEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签流转状态同步（元数据，无签名）
     * Summary: 标签流转状态同步（元数据，无签名）.
     *
     * @param SyncLabelTransferrawRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SyncLabelTransferrawResponse
     */
    public function syncLabelTransferrawEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncLabelTransferrawResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.label.transferraw.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
     * Summary: 上报标签流转的异步接口（元数据，无签名）.
     *
     * @param SendLabelTransferrawonasyncRequest $request
     *
     * @return SendLabelTransferrawonasyncResponse
     */
    public function sendLabelTransferrawonasync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendLabelTransferrawonasyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
     * Summary: 上报标签流转的异步接口（元数据，无签名）.
     *
     * @param SendLabelTransferrawonasyncRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return SendLabelTransferrawonasyncResponse
     */
    public function sendLabelTransferrawonasyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendLabelTransferrawonasyncResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.label.transferrawonasync.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
     * Summary: 查询验收已对接的数据.
     *
     * @param QueryDockedDataRequest $request
     *
     * @return QueryDockedDataResponse
     */
    public function queryDockedData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDockedDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
     * Summary: 查询验收已对接的数据.
     *
     * @param QueryDockedDataRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryDockedDataResponse
     */
    public function queryDockedDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDockedDataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.docked.data.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建实体关联关系
     * Summary: 创建实体关联关系.
     *
     * @param CreateDeviceRelationRequest $request
     *
     * @return CreateDeviceRelationResponse
     */
    public function createDeviceRelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDeviceRelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建实体关联关系
     * Summary: 创建实体关联关系.
     *
     * @param CreateDeviceRelationRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateDeviceRelationResponse
     */
    public function createDeviceRelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDeviceRelationResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.relation.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除实体关联关系
     * Summary: 删除实体关联关系.
     *
     * @param DeleteDeviceRelationRequest $request
     *
     * @return DeleteDeviceRelationResponse
     */
    public function deleteDeviceRelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDeviceRelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除实体关联关系
     * Summary: 删除实体关联关系.
     *
     * @param DeleteDeviceRelationRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteDeviceRelationResponse
     */
    public function deleteDeviceRelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDeviceRelationResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.relation.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 推送单个设备所产生的设备数据
     * Summary: 推送设备数据.
     *
     * @param PushCollectotBychainidRequest $request
     *
     * @return PushCollectotBychainidResponse
     */
    public function pushCollectotBychainid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushCollectotBychainidEx($request, $headers, $runtime);
    }

    /**
     * Description: 推送单个设备所产生的设备数据
     * Summary: 推送设备数据.
     *
     * @param PushCollectotBychainidRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PushCollectotBychainidResponse
     */
    public function pushCollectotBychainidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushCollectotBychainidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collectot.bychainid.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 推送设备状态变更信息
     * Summary: 推送设备状态变更信息.
     *
     * @param NotifyPullstrategyChangestatusRequest $request
     *
     * @return NotifyPullstrategyChangestatusResponse
     */
    public function notifyPullstrategyChangestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyPullstrategyChangestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 推送设备状态变更信息
     * Summary: 推送设备状态变更信息.
     *
     * @param NotifyPullstrategyChangestatusRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return NotifyPullstrategyChangestatusResponse
     */
    public function notifyPullstrategyChangestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyPullstrategyChangestatusResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.pullstrategy.changestatus.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 推送订单信息
     * Summary: 推送订单信息.
     *
     * @param NotifyPullstrategyChargeorderinfoRequest $request
     *
     * @return NotifyPullstrategyChargeorderinfoResponse
     */
    public function notifyPullstrategyChargeorderinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyPullstrategyChargeorderinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 推送订单信息
     * Summary: 推送订单信息.
     *
     * @param NotifyPullstrategyChargeorderinfoRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return NotifyPullstrategyChargeorderinfoResponse
     */
    public function notifyPullstrategyChargeorderinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyPullstrategyChargeorderinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.pullstrategy.chargeorderinfo.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 菜鸟设备监控信息获取
     * Summary: 菜鸟设备监控信息获取.
     *
     * @param QueryScfleaseEqpinfoRequest $request
     *
     * @return QueryScfleaseEqpinfoResponse
     */
    public function queryScfleaseEqpinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryScfleaseEqpinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 菜鸟设备监控信息获取
     * Summary: 菜鸟设备监控信息获取.
     *
     * @param QueryScfleaseEqpinfoRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryScfleaseEqpinfoResponse
     */
    public function queryScfleaseEqpinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryScfleaseEqpinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.scflease.eqpinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建自定义的实体数据
     * Summary: 创建自定义实体.
     *
     * @param CreateCustomerEntityRequest $request
     *
     * @return CreateCustomerEntityResponse
     */
    public function createCustomerEntity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCustomerEntityEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建自定义的实体数据
     * Summary: 创建自定义实体.
     *
     * @param CreateCustomerEntityRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateCustomerEntityResponse
     */
    public function createCustomerEntityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCustomerEntityResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.customer.entity.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
     * Summary: 更新自定义实体.
     *
     * @param UpdateCustomerEntityRequest $request
     *
     * @return UpdateCustomerEntityResponse
     */
    public function updateCustomerEntity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCustomerEntityEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
     * Summary: 更新自定义实体.
     *
     * @param UpdateCustomerEntityRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateCustomerEntityResponse
     */
    public function updateCustomerEntityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCustomerEntityResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.customer.entity.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 为租户创建物模型
     * Summary: 为租户创建物模型.
     *
     * @param CreateThingmodelRequest $request
     *
     * @return CreateThingmodelResponse
     */
    public function createThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 为租户创建物模型
     * Summary: 为租户创建物模型.
     *
     * @param CreateThingmodelRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateThingmodelResponse
     */
    public function createThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingmodel.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询租户的物模型
     * Summary: 查询租户的物模型.
     *
     * @param QueryThingmodelRequest $request
     *
     * @return QueryThingmodelResponse
     */
    public function queryThingmodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThingmodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询租户的物模型
     * Summary: 查询租户的物模型.
     *
     * @param QueryThingmodelRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryThingmodelResponse
     */
    public function queryThingmodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThingmodelResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingmodel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过设备异步批量发行设备
     * Summary: 通过设备异步批量发行设备.
     *
     * @param CreateDistributedeviceBydevicemulRequest $request
     *
     * @return CreateDistributedeviceBydevicemulResponse
     */
    public function createDistributedeviceBydevicemul($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBydevicemulEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过设备异步批量发行设备
     * Summary: 通过设备异步批量发行设备.
     *
     * @param CreateDistributedeviceBydevicemulRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return CreateDistributedeviceBydevicemulResponse
     */
    public function createDistributedeviceBydevicemulEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBydevicemulResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydevicemul.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过设备ID异步批量发行设备
     * Summary: 通过设备ID异步批量发行设备.
     *
     * @param CreateDistributedeviceBydeviceidmulRequest $request
     *
     * @return CreateDistributedeviceBydeviceidmulResponse
     */
    public function createDistributedeviceBydeviceidmul($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributedeviceBydeviceidmulEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过设备ID异步批量发行设备
     * Summary: 通过设备ID异步批量发行设备.
     *
     * @param CreateDistributedeviceBydeviceidmulRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return CreateDistributedeviceBydeviceidmulResponse
     */
    public function createDistributedeviceBydeviceidmulEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributedeviceBydeviceidmulResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.distributedevice.bydeviceidmul.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 绑定实体关系
     * Summary: 绑定实体关系.
     *
     * @param BindEntityrelationRequest $request
     *
     * @return BindEntityrelationResponse
     */
    public function bindEntityrelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindEntityrelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 绑定实体关系
     * Summary: 绑定实体关系.
     *
     * @param BindEntityrelationRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return BindEntityrelationResponse
     */
    public function bindEntityrelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindEntityrelationResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.entityrelation.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量解绑实体关系
     * Summary: 批量解绑实体关系.
     *
     * @param UnbindEntityrelationRequest $request
     *
     * @return UnbindEntityrelationResponse
     */
    public function unbindEntityrelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unbindEntityrelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量解绑实体关系
     * Summary: 批量解绑实体关系.
     *
     * @param UnbindEntityrelationRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UnbindEntityrelationResponse
     */
    public function unbindEntityrelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnbindEntityrelationResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.entityrelation.unbind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询物模型设备详情
     * Summary: 查询物模型设备详情.
     *
     * @param DetailThingmodelDeviceRequest $request
     *
     * @return DetailThingmodelDeviceResponse
     */
    public function detailThingmodelDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailThingmodelDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询物模型设备详情
     * Summary: 查询物模型设备详情.
     *
     * @param DetailThingmodelDeviceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DetailThingmodelDeviceResponse
     */
    public function detailThingmodelDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailThingmodelDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingmodel.device.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
     * Summary: 创建上传文件URL.
     *
     * @param CreateCollectorUploadfileurlRequest $request
     *
     * @return CreateCollectorUploadfileurlResponse
     */
    public function createCollectorUploadfileurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCollectorUploadfileurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
     * Summary: 创建上传文件URL.
     *
     * @param CreateCollectorUploadfileurlRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateCollectorUploadfileurlResponse
     */
    public function createCollectorUploadfileurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCollectorUploadfileurlResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.uploadfileurl.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
     * Summary: 通过文件上报数据，上传完毕后确认.
     *
     * @param ConfirmCollectorUploadfileRequest $request
     *
     * @return ConfirmCollectorUploadfileResponse
     */
    public function confirmCollectorUploadfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmCollectorUploadfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
     * Summary: 通过文件上报数据，上传完毕后确认.
     *
     * @param ConfirmCollectorUploadfileRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ConfirmCollectorUploadfileResponse
     */
    public function confirmCollectorUploadfileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmCollectorUploadfileResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.uploadfile.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建物模型事件
     * Summary: 创建物模型事件.
     *
     * @param CreateThingmodelEventRequest $request
     *
     * @return CreateThingmodelEventResponse
     */
    public function createThingmodelEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createThingmodelEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建物模型事件
     * Summary: 创建物模型事件.
     *
     * @param CreateThingmodelEventRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateThingmodelEventResponse
     */
    public function createThingmodelEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateThingmodelEventResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingmodel.event.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询物模型事件
     * Summary: 查询物模型事件.
     *
     * @param QueryThingmodelEventRequest $request
     *
     * @return QueryThingmodelEventResponse
     */
    public function queryThingmodelEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThingmodelEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询物模型事件
     * Summary: 查询物模型事件.
     *
     * @param QueryThingmodelEventRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryThingmodelEventResponse
     */
    public function queryThingmodelEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThingmodelEventResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingmodel.event.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
     * Summary: 车辆关联的部标设备列表查询.
     *
     * @param QueryEntityrelationJtdevicebycarRequest $request
     *
     * @return QueryEntityrelationJtdevicebycarResponse
     */
    public function queryEntityrelationJtdevicebycar($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEntityrelationJtdevicebycarEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
     * Summary: 车辆关联的部标设备列表查询.
     *
     * @param QueryEntityrelationJtdevicebycarRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryEntityrelationJtdevicebycarResponse
     */
    public function queryEntityrelationJtdevicebycarEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEntityrelationJtdevicebycarResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.entityrelation.jtdevicebycar.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 部标设备位置/轨迹/异常数据查询
     * Summary: 部标设备位置/轨迹/异常数据查询.
     *
     * @param QueryCollectorJtfluxRequest $request
     *
     * @return QueryCollectorJtfluxResponse
     */
    public function queryCollectorJtflux($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCollectorJtfluxEx($request, $headers, $runtime);
    }

    /**
     * Description: 部标设备位置/轨迹/异常数据查询
     * Summary: 部标设备位置/轨迹/异常数据查询.
     *
     * @param QueryCollectorJtfluxRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryCollectorJtfluxResponse
     */
    public function queryCollectorJtfluxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCollectorJtfluxResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.jtflux.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过异常事件ID查询部标多媒体文件地址
     * Summary: 通过异常事件ID查询部标多媒体文件地址
     *
     * @param QueryCollectorJtmediaRequest $request
     *
     * @return QueryCollectorJtmediaResponse
     */
    public function queryCollectorJtmedia($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCollectorJtmediaEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过异常事件ID查询部标多媒体文件地址
     * Summary: 通过异常事件ID查询部标多媒体文件地址
     *
     * @param QueryCollectorJtmediaRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryCollectorJtmediaResponse
     */
    public function queryCollectorJtmediaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCollectorJtmediaResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.collector.jtmedia.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询产线压测任务
     * Summary: 查询项目关联的产线压测任务
     *
     * @param QueryOnlinepressuretestRequest $request
     *
     * @return QueryOnlinepressuretestResponse
     */
    public function queryOnlinepressuretest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOnlinepressuretestEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询产线压测任务
     * Summary: 查询项目关联的产线压测任务
     *
     * @param QueryOnlinepressuretestRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryOnlinepressuretestResponse
     */
    public function queryOnlinepressuretestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOnlinepressuretestResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.onlinepressuretest.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  【自主联调平台】创建产线压测任务
     * Summary:  【自主联调平台】创建产线压测任务
     *
     * @param CreateOnlinepressuretestRequest $request
     *
     * @return CreateOnlinepressuretestResponse
     */
    public function createOnlinepressuretest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createOnlinepressuretestEx($request, $headers, $runtime);
    }

    /**
     * Description:  【自主联调平台】创建产线压测任务
     * Summary:  【自主联调平台】创建产线压测任务
     *
     * @param CreateOnlinepressuretestRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateOnlinepressuretestResponse
     */
    public function createOnlinepressuretestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateOnlinepressuretestResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.onlinepressuretest.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新客户侧的压测报告
     * Summary: 更新客户侧的压测报告.
     *
     * @param UpdateOnlinepressuretestCustomerreportRequest $request
     *
     * @return UpdateOnlinepressuretestCustomerreportResponse
     */
    public function updateOnlinepressuretestCustomerreport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateOnlinepressuretestCustomerreportEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新客户侧的压测报告
     * Summary: 更新客户侧的压测报告.
     *
     * @param UpdateOnlinepressuretestCustomerreportRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return UpdateOnlinepressuretestCustomerreportResponse
     */
    public function updateOnlinepressuretestCustomerreportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateOnlinepressuretestCustomerreportResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.onlinepressuretest.customerreport.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询客户的物模型事件
     * Summary: 查询客户的物模型事件列表.
     *
     * @param QueryThingmodeleventBycustomertenantRequest $request
     *
     * @return QueryThingmodeleventBycustomertenantResponse
     */
    public function queryThingmodeleventBycustomertenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThingmodeleventBycustomertenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询客户的物模型事件
     * Summary: 查询客户的物模型事件列表.
     *
     * @param QueryThingmodeleventBycustomertenantRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return QueryThingmodeleventBycustomertenantResponse
     */
    public function queryThingmodeleventBycustomertenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThingmodeleventBycustomertenantResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingmodelevent.bycustomertenant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 从联调环境部署物模型UDF到生产环境
     * Summary: 从联调环境部署物模型UDF到生产环境.
     *
     * @param DeployThingudfRequest $request
     *
     * @return DeployThingudfResponse
     */
    public function deployThingudf($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deployThingudfEx($request, $headers, $runtime);
    }

    /**
     * Description: 从联调环境部署物模型UDF到生产环境
     * Summary: 从联调环境部署物模型UDF到生产环境.
     *
     * @param DeployThingudfRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeployThingudfResponse
     */
    public function deployThingudfEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeployThingudfResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingudf.deploy', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询二轮车操作日志
     * Summary: 分页查询二轮车操作日志.
     *
     * @param PagequeryEbikeOperationlogRequest $request
     *
     * @return PagequeryEbikeOperationlogResponse
     */
    public function pagequeryEbikeOperationlog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryEbikeOperationlogEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询二轮车操作日志
     * Summary: 分页查询二轮车操作日志.
     *
     * @param PagequeryEbikeOperationlogRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryEbikeOperationlogResponse
     */
    public function pagequeryEbikeOperationlogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryEbikeOperationlogResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.ebike.operationlog.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户实体拓展功能查询
     * Summary: 客户实体拓展功能查询.
     *
     * @param QueryCustomerentityServiceRequest $request
     *
     * @return QueryCustomerentityServiceResponse
     */
    public function queryCustomerentityService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCustomerentityServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户实体拓展功能查询
     * Summary: 客户实体拓展功能查询.
     *
     * @param QueryCustomerentityServiceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryCustomerentityServiceResponse
     */
    public function queryCustomerentityServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCustomerentityServiceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.customerentity.service.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付芯证书申请
     * Summary: 支付芯证书申请.
     *
     * @param ApplyTechintegrationSkushipRequest $request
     *
     * @return ApplyTechintegrationSkushipResponse
     */
    public function applyTechintegrationSkuship($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyTechintegrationSkushipEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付芯证书申请
     * Summary: 支付芯证书申请.
     *
     * @param ApplyTechintegrationSkushipRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ApplyTechintegrationSkushipResponse
     */
    public function applyTechintegrationSkushipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyTechintegrationSkushipResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.techintegration.skuship.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
     * Summary: 支付芯证书申请接口，唯一编码软件接入形式.
     *
     * @param ApplyTechintegrationSkushipbyuidRequest $request
     *
     * @return ApplyTechintegrationSkushipbyuidResponse
     */
    public function applyTechintegrationSkushipbyuid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyTechintegrationSkushipbyuidEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
     * Summary: 支付芯证书申请接口，唯一编码软件接入形式.
     *
     * @param ApplyTechintegrationSkushipbyuidRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return ApplyTechintegrationSkushipbyuidResponse
     */
    public function applyTechintegrationSkushipbyuidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyTechintegrationSkushipbyuidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.techintegration.skushipbyuid.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询压测任务所关联的实体的最新上链数据列表
     * Summary: 查询压测任务的上链数据列表.
     *
     * @param QueryOnlinepressuretestDataRequest $request
     *
     * @return QueryOnlinepressuretestDataResponse
     */
    public function queryOnlinepressuretestData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOnlinepressuretestDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询压测任务所关联的实体的最新上链数据列表
     * Summary: 查询压测任务的上链数据列表.
     *
     * @param QueryOnlinepressuretestDataRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryOnlinepressuretestDataResponse
     */
    public function queryOnlinepressuretestDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOnlinepressuretestDataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.onlinepressuretest.data.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物模型服务调用
     * Summary: 物模型服务调用.
     *
     * @param ExecThingServiceRequest $request
     *
     * @return ExecThingServiceResponse
     */
    public function execThingService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execThingServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 物模型服务调用
     * Summary: 物模型服务调用.
     *
     * @param ExecThingServiceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ExecThingServiceResponse
     */
    public function execThingServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecThingServiceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thing.service.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
     * Summary: 物模型服务回复接口.
     *
     * @param CallbackThingServicebyeventRequest $request
     *
     * @return CallbackThingServicebyeventResponse
     */
    public function callbackThingServicebyevent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackThingServicebyeventEx($request, $headers, $runtime);
    }

    /**
     * Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
     * Summary: 物模型服务回复接口.
     *
     * @param CallbackThingServicebyeventRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CallbackThingServicebyeventResponse
     */
    public function callbackThingServicebyeventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackThingServicebyeventResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thing.servicebyevent.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加SKU授权白名单
     * Summary: 添加SKU授权白名单.
     *
     * @param ImportTechintegrationSkugrantwhitelistRequest $request
     *
     * @return ImportTechintegrationSkugrantwhitelistResponse
     */
    public function importTechintegrationSkugrantwhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importTechintegrationSkugrantwhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加SKU授权白名单
     * Summary: 添加SKU授权白名单.
     *
     * @param ImportTechintegrationSkugrantwhitelistRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return ImportTechintegrationSkugrantwhitelistResponse
     */
    public function importTechintegrationSkugrantwhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportTechintegrationSkugrantwhitelistResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.techintegration.skugrantwhitelist.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物模型数据上报
     * Summary: 物模型数据上报.
     *
     * @param SendThingDataRequest $request
     *
     * @return SendThingDataResponse
     */
    public function sendThingData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendThingDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 物模型数据上报
     * Summary: 物模型数据上报.
     *
     * @param SendThingDataRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return SendThingDataResponse
     */
    public function sendThingDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendThingDataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thing.data.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支付芯证书授权信息查询
     * Summary: 支付芯证书授权信息查询.
     *
     * @param QueryTechintegrationSkugrantstockinfoRequest $request
     *
     * @return QueryTechintegrationSkugrantstockinfoResponse
     */
    public function queryTechintegrationSkugrantstockinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTechintegrationSkugrantstockinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 支付芯证书授权信息查询
     * Summary: 支付芯证书授权信息查询.
     *
     * @param QueryTechintegrationSkugrantstockinfoRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryTechintegrationSkugrantstockinfoResponse
     */
    public function queryTechintegrationSkugrantstockinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTechintegrationSkugrantstockinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.techintegration.skugrantstockinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 整合目前的设备数据、汇总数据、业务数据、无主体数据、标签数据上报接口
     * Summary: 事件数据上报整合接口.
     *
     * @param SendEventDataRequest $request
     *
     * @return SendEventDataResponse
     */
    public function sendEventData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendEventDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 整合目前的设备数据、汇总数据、业务数据、无主体数据、标签数据上报接口
     * Summary: 事件数据上报整合接口.
     *
     * @param SendEventDataRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return SendEventDataResponse
     */
    public function sendEventDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendEventDataResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.event.data.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取定时任务保存至oss的文件链接
     * Summary: 获取定时任务保存至oss的文件链接.
     *
     * @param QueryOssDownloadjoburlRequest $request
     *
     * @return QueryOssDownloadjoburlResponse
     */
    public function queryOssDownloadjoburl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOssDownloadjoburlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取定时任务保存至oss的文件链接
     * Summary: 获取定时任务保存至oss的文件链接.
     *
     * @param QueryOssDownloadjoburlRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryOssDownloadjoburlResponse
     */
    public function queryOssDownloadjoburlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOssDownloadjoburlResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.oss.downloadjoburl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 要素项目同步
     * Summary: 要素项目同步.
     *
     * @param SyncAssetelementProjectRequest $request
     *
     * @return SyncAssetelementProjectResponse
     */
    public function syncAssetelementProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncAssetelementProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 要素项目同步
     * Summary: 要素项目同步.
     *
     * @param SyncAssetelementProjectRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncAssetelementProjectResponse
     */
    public function syncAssetelementProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncAssetelementProjectResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.assetelement.project.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据deviceId更新设备
     * Summary: 根据deviceId更新设备.
     *
     * @param UpdateDeviceBydeviceidRequest $request
     *
     * @return UpdateDeviceBydeviceidResponse
     */
    public function updateDeviceBydeviceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDeviceBydeviceidEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据deviceId更新设备
     * Summary: 根据deviceId更新设备.
     *
     * @param UpdateDeviceBydeviceidRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateDeviceBydeviceidResponse
     */
    public function updateDeviceBydeviceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDeviceBydeviceidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.device.bydeviceid.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 时序异常检测任务扫描
     * Summary: 任务扫描.
     *
     * @param QueryTaskscanRequest $request
     *
     * @return QueryTaskscanResponse
     */
    public function queryTaskscan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTaskscanEx($request, $headers, $runtime);
    }

    /**
     * Description: 时序异常检测任务扫描
     * Summary: 任务扫描.
     *
     * @param QueryTaskscanRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryTaskscanResponse
     */
    public function queryTaskscanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTaskscanResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.taskscan.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 时序异常检测检测到任务后，发出告警通知
     * Summary: 异常检测任务告警.
     *
     * @param SendTaskalarmRequest $request
     *
     * @return SendTaskalarmResponse
     */
    public function sendTaskalarm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendTaskalarmEx($request, $headers, $runtime);
    }

    /**
     * Description: 时序异常检测检测到任务后，发出告警通知
     * Summary: 异常检测任务告警.
     *
     * @param SendTaskalarmRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return SendTaskalarmResponse
     */
    public function sendTaskalarmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendTaskalarmResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.taskalarm.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链oneapi
     * Summary: 信物链oneapi.
     *
     * @param ExecThingsdidOneapiRequest $request
     *
     * @return ExecThingsdidOneapiResponse
     */
    public function execThingsdidOneapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execThingsdidOneapiEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链oneapi
     * Summary: 信物链oneapi.
     *
     * @param ExecThingsdidOneapiRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecThingsdidOneapiResponse
     */
    public function execThingsdidOneapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecThingsdidOneapiResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.oneapi.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链存证
     * Summary: 信物链存证
     *
     * @param StartEvidenceStoreRequest $request
     *
     * @return StartEvidenceStoreResponse
     */
    public function startEvidenceStore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startEvidenceStoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链存证
     * Summary: 信物链存证
     *
     * @param StartEvidenceStoreRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return StartEvidenceStoreResponse
     */
    public function startEvidenceStoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartEvidenceStoreResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.evidence.store.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链存证查询
     * Summary: 信物链存证查询.
     *
     * @param StartEvidenceQueryRequest $request
     *
     * @return StartEvidenceQueryResponse
     */
    public function startEvidenceQuery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startEvidenceQueryEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链存证查询
     * Summary: 信物链存证查询.
     *
     * @param StartEvidenceQueryRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return StartEvidenceQueryResponse
     */
    public function startEvidenceQueryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartEvidenceQueryResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.evidence.query.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链实体身份注册
     * Summary: 信物链实体身份注册.
     *
     * @param StartThingsdidRegisterRequest $request
     *
     * @return StartThingsdidRegisterResponse
     */
    public function startThingsdidRegister($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startThingsdidRegisterEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链实体身份注册
     * Summary: 信物链实体身份注册.
     *
     * @param StartThingsdidRegisterRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return StartThingsdidRegisterResponse
     */
    public function startThingsdidRegisterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartThingsdidRegisterResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.register.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链异步操作查询
     * 智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
     * Summary: 信物链异步操作查询.
     *
     * @param QueryThingsdidAsyncprocessRequest $request
     *
     * @return QueryThingsdidAsyncprocessResponse
     */
    public function queryThingsdidAsyncprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThingsdidAsyncprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链异步操作查询
     * 智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
     * Summary: 信物链异步操作查询.
     *
     * @param QueryThingsdidAsyncprocessRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryThingsdidAsyncprocessResponse
     */
    public function queryThingsdidAsyncprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThingsdidAsyncprocessResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.asyncprocess.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
     * Summary: 信物链身份状态更新.
     *
     * @param UpdateThingsdidStatusRequest $request
     *
     * @return UpdateThingsdidStatusResponse
     */
    public function updateThingsdidStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateThingsdidStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
     * Summary: 信物链身份状态更新.
     *
     * @param UpdateThingsdidStatusRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateThingsdidStatusResponse
     */
    public function updateThingsdidStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateThingsdidStatusResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.status.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
     * Summary: 信物链设备空间关联更新.
     *
     * @param UpdateThingsdidDevicespaceRequest $request
     *
     * @return UpdateThingsdidDevicespaceResponse
     */
    public function updateThingsdidDevicespace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateThingsdidDevicespaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
     * Summary: 信物链设备空间关联更新.
     *
     * @param UpdateThingsdidDevicespaceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateThingsdidDevicespaceResponse
     */
    public function updateThingsdidDevicespaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateThingsdidDevicespaceResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.devicespace.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链实体did查询，根据dataFilter过滤输出
     * Summary: 信物链实体did查询.
     *
     * @param QueryThingsdidDidRequest $request
     *
     * @return QueryThingsdidDidResponse
     */
    public function queryThingsdidDid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThingsdidDidEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链实体did查询，根据dataFilter过滤输出
     * Summary: 信物链实体did查询.
     *
     * @param QueryThingsdidDidRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryThingsdidDidResponse
     */
    public function queryThingsdidDidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThingsdidDidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.did.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链实体身份更新，字段空则不更新。
     * Summary: 信物链实体身份更新.
     *
     * @param UpdateThingsdidDidRequest $request
     *
     * @return UpdateThingsdidDidResponse
     */
    public function updateThingsdidDid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateThingsdidDidEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链实体身份更新，字段空则不更新。
     * Summary: 信物链实体身份更新.
     *
     * @param UpdateThingsdidDidRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateThingsdidDidResponse
     */
    public function updateThingsdidDidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateThingsdidDidResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.did.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链租户信息关联
     * Summary: 信物链租户信息关联.
     *
     * @param StartTenantBindinfoRequest $request
     *
     * @return StartTenantBindinfoResponse
     */
    public function startTenantBindinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startTenantBindinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链租户信息关联
     * Summary: 信物链租户信息关联.
     *
     * @param StartTenantBindinfoRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return StartTenantBindinfoResponse
     */
    public function startTenantBindinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartTenantBindinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tenant.bindinfo.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
     * Summary: 信物链租户项目创建.
     *
     * @param CreateTenantProjectRequest $request
     *
     * @return CreateTenantProjectResponse
     */
    public function createTenantProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTenantProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
     * Summary: 信物链租户项目创建.
     *
     * @param CreateTenantProjectRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateTenantProjectResponse
     */
    public function createTenantProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTenantProjectResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tenant.project.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 信物链实体访问权限更新
     * 所有者/使用者/观察者权限更新
     * Summary: 信物链实体访问权限更新.
     *
     * @param UpdateThingsdidTenantRequest $request
     *
     * @return UpdateThingsdidTenantResponse
     */
    public function updateThingsdidTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateThingsdidTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 信物链实体访问权限更新
     * 所有者/使用者/观察者权限更新
     * Summary: 信物链实体访问权限更新.
     *
     * @param UpdateThingsdidTenantRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateThingsdidTenantResponse
     */
    public function updateThingsdidTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateThingsdidTenantResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.thingsdid.tenant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: LoadCertificateTSMCmd，仅限内部使用api
     * Summary: TSM迁移内部使用.
     *
     * @param LoadTsmCertificatetsmRequest $request
     *
     * @return LoadTsmCertificatetsmResponse
     */
    public function loadTsmCertificatetsm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->loadTsmCertificatetsmEx($request, $headers, $runtime);
    }

    /**
     * Description: LoadCertificateTSMCmd，仅限内部使用api
     * Summary: TSM迁移内部使用.
     *
     * @param LoadTsmCertificatetsmRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return LoadTsmCertificatetsmResponse
     */
    public function loadTsmCertificatetsmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LoadTsmCertificatetsmResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tsm.certificatetsm.load', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: TSM迁移内部使用
     * Summary: loadResourceFile.
     *
     * @param LoadTsmResourcefileRequest $request
     *
     * @return LoadTsmResourcefileResponse
     */
    public function loadTsmResourcefile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->loadTsmResourcefileEx($request, $headers, $runtime);
    }

    /**
     * Description: TSM迁移内部使用
     * Summary: loadResourceFile.
     *
     * @param LoadTsmResourcefileRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return LoadTsmResourcefileResponse
     */
    public function loadTsmResourcefileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LoadTsmResourcefileResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tsm.resourcefile.load', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 触发tlsnotary文件认证任务
     * Summary: 触发tlsnotary文件认证任务
     *
     * @param StartTlsnotaryTaskRequest $request
     *
     * @return StartTlsnotaryTaskResponse
     */
    public function startTlsnotaryTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startTlsnotaryTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 触发tlsnotary文件认证任务
     * Summary: 触发tlsnotary文件认证任务
     *
     * @param StartTlsnotaryTaskRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return StartTlsnotaryTaskResponse
     */
    public function startTlsnotaryTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartTlsnotaryTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tlsnotary.task.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询tlsnotary文件认证任务结果
     * Summary: 查询tlsnotary文件认证任务结果.
     *
     * @param QueryTlsnotaryTaskRequest $request
     *
     * @return QueryTlsnotaryTaskResponse
     */
    public function queryTlsnotaryTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTlsnotaryTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询tlsnotary文件认证任务结果
     * Summary: 查询tlsnotary文件认证任务结果.
     *
     * @param QueryTlsnotaryTaskRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryTlsnotaryTaskResponse
     */
    public function queryTlsnotaryTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTlsnotaryTaskResponse::fromMap($this->doRequest('1.0', 'blockchain.bot.tlsnotary.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
