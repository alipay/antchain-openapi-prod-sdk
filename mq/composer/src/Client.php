<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\MQ\Models\AddBindingRequest;
use AntChain\MQ\Models\AddBindingResponse;
use AntChain\MQ\Models\AddDmsMsgtypeRequest;
use AntChain\MQ\Models\AddDmsMsgtypeResponse;
use AntChain\MQ\Models\AddDmsWhitelistRequest;
use AntChain\MQ\Models\AddDmsWhitelistResponse;
use AntChain\MQ\Models\AddMsgtypeRequest;
use AntChain\MQ\Models\AddMsgtypeResponse;
use AntChain\MQ\Models\AddTopicRequest;
use AntChain\MQ\Models\AddTopicResponse;
use AntChain\MQ\Models\AllSofamqSchemaRequest;
use AntChain\MQ\Models\AllSofamqSchemaResponse;
use AntChain\MQ\Models\BatchdeleteDmsMsgRequest;
use AntChain\MQ\Models\BatchdeleteDmsMsgResponse;
use AntChain\MQ\Models\BatchqueryDmsMsgRequest;
use AntChain\MQ\Models\BatchqueryDmsMsgResponse;
use AntChain\MQ\Models\CancelSofamqConnectorplanRequest;
use AntChain\MQ\Models\CancelSofamqConnectorplanResponse;
use AntChain\MQ\Models\CancelSofamqConnectorprocessRequest;
use AntChain\MQ\Models\CancelSofamqConnectorprocessResponse;
use AntChain\MQ\Models\CancelSwitchoverRequest;
use AntChain\MQ\Models\CancelSwitchoverResponse;
use AntChain\MQ\Models\CountMessageUndeliveryRequest;
use AntChain\MQ\Models\CountMessageUndeliveryResponse;
use AntChain\MQ\Models\CreateDmsBindingRequest;
use AntChain\MQ\Models\CreateDmsBindingResponse;
use AntChain\MQ\Models\CreateMsgdumpTaskRequest;
use AntChain\MQ\Models\CreateMsgdumpTaskResponse;
use AntChain\MQ\Models\CreateSchemaAdmindetailRequest;
use AntChain\MQ\Models\CreateSchemaAdmindetailResponse;
use AntChain\MQ\Models\CreateSchemaAdminmetadataRequest;
use AntChain\MQ\Models\CreateSchemaAdminmetadataResponse;
use AntChain\MQ\Models\CreateSofamqAdmingroupRequest;
use AntChain\MQ\Models\CreateSofamqAdmingroupResponse;
use AntChain\MQ\Models\CreateSofamqAdmintopicRequest;
use AntChain\MQ\Models\CreateSofamqAdmintopicResponse;
use AntChain\MQ\Models\CreateSofamqAdminuserRequest;
use AntChain\MQ\Models\CreateSofamqAdminuserResponse;
use AntChain\MQ\Models\CreateSofamqCellRequest;
use AntChain\MQ\Models\CreateSofamqCellResponse;
use AntChain\MQ\Models\CreateSofamqClusterRequest;
use AntChain\MQ\Models\CreateSofamqClusterResponse;
use AntChain\MQ\Models\CreateSofamqConfigRequest;
use AntChain\MQ\Models\CreateSofamqConfigResponse;
use AntChain\MQ\Models\CreateSofamqConnectorRequest;
use AntChain\MQ\Models\CreateSofamqConnectorResponse;
use AntChain\MQ\Models\CreateSofamqConsumelimiterRequest;
use AntChain\MQ\Models\CreateSofamqConsumelimiterResponse;
use AntChain\MQ\Models\CreateSofamqDatacenterRequest;
use AntChain\MQ\Models\CreateSofamqDatacenterResponse;
use AntChain\MQ\Models\CreateSofamqGroupRequest;
use AntChain\MQ\Models\CreateSofamqGroupResponse;
use AntChain\MQ\Models\CreateSofamqInstanceRequest;
use AntChain\MQ\Models\CreateSofamqInstanceResponse;
use AntChain\MQ\Models\CreateSofamqKvconfigRequest;
use AntChain\MQ\Models\CreateSofamqKvconfigResponse;
use AntChain\MQ\Models\CreateSofamqLabelsRequest;
use AntChain\MQ\Models\CreateSofamqLabelsResponse;
use AntChain\MQ\Models\CreateSofamqNamespaceRequest;
use AntChain\MQ\Models\CreateSofamqNamespaceResponse;
use AntChain\MQ\Models\CreateSofamqNodeRequest;
use AntChain\MQ\Models\CreateSofamqNodeResponse;
use AntChain\MQ\Models\CreateSofamqRoomRequest;
use AntChain\MQ\Models\CreateSofamqRoomResponse;
use AntChain\MQ\Models\CreateSofamqRouterRequest;
use AntChain\MQ\Models\CreateSofamqRouterResponse;
use AntChain\MQ\Models\CreateSofamqSchemaRequest;
use AntChain\MQ\Models\CreateSofamqSchemaResponse;
use AntChain\MQ\Models\CreateSofamqTopicRequest;
use AntChain\MQ\Models\CreateSofamqTopicResponse;
use AntChain\MQ\Models\CreateSofamqWarnRequest;
use AntChain\MQ\Models\CreateSofamqWarnResponse;
use AntChain\MQ\Models\DeleteBindingRequest;
use AntChain\MQ\Models\DeleteBindingResponse;
use AntChain\MQ\Models\DeleteDmsBindingRequest;
use AntChain\MQ\Models\DeleteDmsBindingResponse;
use AntChain\MQ\Models\DeleteDmsMsgRequest;
use AntChain\MQ\Models\DeleteDmsMsgResponse;
use AntChain\MQ\Models\DeleteDmsMsgtypeRequest;
use AntChain\MQ\Models\DeleteDmsMsgtypeResponse;
use AntChain\MQ\Models\DeleteDmsWhitelistRequest;
use AntChain\MQ\Models\DeleteDmsWhitelistResponse;
use AntChain\MQ\Models\DeleteMeshApplicationRequest;
use AntChain\MQ\Models\DeleteMeshApplicationResponse;
use AntChain\MQ\Models\DeleteMeshQueuelimitRequest;
use AntChain\MQ\Models\DeleteMeshQueuelimitResponse;
use AntChain\MQ\Models\DeleteMeshQueuelimitvalueRequest;
use AntChain\MQ\Models\DeleteMeshQueuelimitvalueResponse;
use AntChain\MQ\Models\DeleteMeshQueueRequest;
use AntChain\MQ\Models\DeleteMeshQueueResponse;
use AntChain\MQ\Models\DeleteMeshQueuerouteeditionRequest;
use AntChain\MQ\Models\DeleteMeshQueuerouteeditionResponse;
use AntChain\MQ\Models\DeleteMeshQueuerouteRequest;
use AntChain\MQ\Models\DeleteMeshQueuerouteResponse;
use AntChain\MQ\Models\DeleteMsgdumpTaskRequest;
use AntChain\MQ\Models\DeleteMsgdumpTaskResponse;
use AntChain\MQ\Models\DeleteMsgtypeRequest;
use AntChain\MQ\Models\DeleteMsgtypeResponse;
use AntChain\MQ\Models\DeleteSchemaAdmindetailRequest;
use AntChain\MQ\Models\DeleteSchemaAdmindetailResponse;
use AntChain\MQ\Models\DeleteSchemaAdminmetadataRequest;
use AntChain\MQ\Models\DeleteSchemaAdminmetadataResponse;
use AntChain\MQ\Models\DeleteSofamqAdminuserRequest;
use AntChain\MQ\Models\DeleteSofamqAdminuserResponse;
use AntChain\MQ\Models\DeleteSofamqCellRequest;
use AntChain\MQ\Models\DeleteSofamqCellResponse;
use AntChain\MQ\Models\DeleteSofamqClusterRequest;
use AntChain\MQ\Models\DeleteSofamqClusterResponse;
use AntChain\MQ\Models\DeleteSofamqConfigRequest;
use AntChain\MQ\Models\DeleteSofamqConfigResponse;
use AntChain\MQ\Models\DeleteSofamqConnectorRequest;
use AntChain\MQ\Models\DeleteSofamqConnectorResponse;
use AntChain\MQ\Models\DeleteSofamqConsumelimiterRequest;
use AntChain\MQ\Models\DeleteSofamqConsumelimiterResponse;
use AntChain\MQ\Models\DeleteSofamqDatacenterRequest;
use AntChain\MQ\Models\DeleteSofamqDatacenterResponse;
use AntChain\MQ\Models\DeleteSofamqGroupRequest;
use AntChain\MQ\Models\DeleteSofamqGroupResponse;
use AntChain\MQ\Models\DeleteSofamqInstanceRequest;
use AntChain\MQ\Models\DeleteSofamqInstanceResponse;
use AntChain\MQ\Models\DeleteSofamqKvconfigRequest;
use AntChain\MQ\Models\DeleteSofamqKvconfigResponse;
use AntChain\MQ\Models\DeleteSofamqLabelsRequest;
use AntChain\MQ\Models\DeleteSofamqLabelsResponse;
use AntChain\MQ\Models\DeleteSofamqNamespaceRequest;
use AntChain\MQ\Models\DeleteSofamqNamespaceResponse;
use AntChain\MQ\Models\DeleteSofamqNodeRequest;
use AntChain\MQ\Models\DeleteSofamqNodeResponse;
use AntChain\MQ\Models\DeleteSofamqOffsetRequest;
use AntChain\MQ\Models\DeleteSofamqOffsetResponse;
use AntChain\MQ\Models\DeleteSofamqRoomRequest;
use AntChain\MQ\Models\DeleteSofamqRoomResponse;
use AntChain\MQ\Models\DeleteSofamqRouterRequest;
use AntChain\MQ\Models\DeleteSofamqRouterResponse;
use AntChain\MQ\Models\DeleteSofamqSchemaRequest;
use AntChain\MQ\Models\DeleteSofamqSchemaResponse;
use AntChain\MQ\Models\DeleteSofamqTopicRequest;
use AntChain\MQ\Models\DeleteSofamqTopicResponse;
use AntChain\MQ\Models\DeleteSofamqTraceRequest;
use AntChain\MQ\Models\DeleteSofamqTraceResponse;
use AntChain\MQ\Models\DeleteSofamqWarnRequest;
use AntChain\MQ\Models\DeleteSofamqWarnResponse;
use AntChain\MQ\Models\DeleteTopicRequest;
use AntChain\MQ\Models\DeleteTopicResponse;
use AntChain\MQ\Models\DisableSofamqConnectorRequest;
use AntChain\MQ\Models\DisableSofamqConnectorResponse;
use AntChain\MQ\Models\DisableSofamqWarnRequest;
use AntChain\MQ\Models\DisableSofamqWarnResponse;
use AntChain\MQ\Models\DownloadSofamqMessageRequest;
use AntChain\MQ\Models\DownloadSofamqMessageResponse;
use AntChain\MQ\Models\EnableMsgdumpTaskRequest;
use AntChain\MQ\Models\EnableMsgdumpTaskResponse;
use AntChain\MQ\Models\EnableSofamqConnectorRequest;
use AntChain\MQ\Models\EnableSofamqConnectorResponse;
use AntChain\MQ\Models\EnableSofamqWarnRequest;
use AntChain\MQ\Models\EnableSofamqWarnResponse;
use AntChain\MQ\Models\ExecSofamqConsumerresetoffsetRequest;
use AntChain\MQ\Models\ExecSofamqConsumerresetoffsetResponse;
use AntChain\MQ\Models\ExecSofamqDailycheckRequest;
use AntChain\MQ\Models\ExecSofamqDailycheckResponse;
use AntChain\MQ\Models\ExecSofamqDlqresendbatchRequest;
use AntChain\MQ\Models\ExecSofamqDlqresendbatchResponse;
use AntChain\MQ\Models\ExecSofamqDlqresendbyidRequest;
use AntChain\MQ\Models\ExecSofamqDlqresendbyidResponse;
use AntChain\MQ\Models\ExecuteSwitchoverRequest;
use AntChain\MQ\Models\ExecuteSwitchoverResponse;
use AntChain\MQ\Models\ExportDmsBindingRequest;
use AntChain\MQ\Models\ExportDmsBindingResponse;
use AntChain\MQ\Models\ExportDmsMsgtypeRequest;
use AntChain\MQ\Models\ExportDmsMsgtypeResponse;
use AntChain\MQ\Models\ExportSofamqMessageRequest;
use AntChain\MQ\Models\ExportSofamqMessageResponse;
use AntChain\MQ\Models\ExportSofamqSchemaRequest;
use AntChain\MQ\Models\ExportSofamqSchemaResponse;
use AntChain\MQ\Models\GetDmsBindingtemplateRequest;
use AntChain\MQ\Models\GetDmsBindingtemplateResponse;
use AntChain\MQ\Models\GetDmsInstanceRequest;
use AntChain\MQ\Models\GetDmsInstanceResponse;
use AntChain\MQ\Models\GetDmsMsgtypetemplateRequest;
use AntChain\MQ\Models\GetDmsMsgtypetemplateResponse;
use AntChain\MQ\Models\GetDmsTopicsRequest;
use AntChain\MQ\Models\GetDmsTopicsResponse;
use AntChain\MQ\Models\GetMiddlewareEndpointRequest;
use AntChain\MQ\Models\GetMiddlewareEndpointResponse;
use AntChain\MQ\Models\GetMiddlewareInstanceRequest;
use AntChain\MQ\Models\GetMiddlewareInstanceResponse;
use AntChain\MQ\Models\GetMsgtypeRequest;
use AntChain\MQ\Models\GetMsgtypeResponse;
use AntChain\MQ\Models\GetSofamqConsumerjstackRequest;
use AntChain\MQ\Models\GetSofamqConsumerjstackResponse;
use AntChain\MQ\Models\GetSofamqConsumerstatusRequest;
use AntChain\MQ\Models\GetSofamqConsumerstatusResponse;
use AntChain\MQ\Models\GetSofamqDlqbyidRequest;
use AntChain\MQ\Models\GetSofamqDlqbyidResponse;
use AntChain\MQ\Models\GetSofamqInstancebaseinfoRequest;
use AntChain\MQ\Models\GetSofamqInstancebaseinfoResponse;
use AntChain\MQ\Models\GetSofamqLdcbynamespaceRequest;
use AntChain\MQ\Models\GetSofamqLdcbynamespaceResponse;
use AntChain\MQ\Models\GetSofamqMessagebymsgidRequest;
use AntChain\MQ\Models\GetSofamqMessagebymsgidResponse;
use AntChain\MQ\Models\GetSofamqSchemaRequest;
use AntChain\MQ\Models\GetSofamqSchemaResponse;
use AntChain\MQ\Models\GetSofamqTracebymsgidRequest;
use AntChain\MQ\Models\GetSofamqTracebymsgidResponse;
use AntChain\MQ\Models\GetSofamqTraceresultRequest;
use AntChain\MQ\Models\GetSofamqTraceresultResponse;
use AntChain\MQ\Models\IdBindingQueryRequest;
use AntChain\MQ\Models\IdBindingQueryResponse;
use AntChain\MQ\Models\IdTopicQueryRequest;
use AntChain\MQ\Models\IdTopicQueryResponse;
use AntChain\MQ\Models\ImportDmsBindingRequest;
use AntChain\MQ\Models\ImportDmsBindingResponse;
use AntChain\MQ\Models\ImportDmsMsgtypeRequest;
use AntChain\MQ\Models\ImportDmsMsgtypeResponse;
use AntChain\MQ\Models\ImportMeshApplicationRequest;
use AntChain\MQ\Models\ImportMeshApplicationResponse;
use AntChain\MQ\Models\ImportMeshQueuelimitRequest;
use AntChain\MQ\Models\ImportMeshQueuelimitResponse;
use AntChain\MQ\Models\ImportMeshQueueRequest;
use AntChain\MQ\Models\ImportMeshQueueResponse;
use AntChain\MQ\Models\ImportMeshQueuerouteRequest;
use AntChain\MQ\Models\ImportMeshQueuerouteResponse;
use AntChain\MQ\Models\ListDmsBindingRequest;
use AntChain\MQ\Models\ListDmsBindingResponse;
use AntChain\MQ\Models\ListDmsMsgtypeRequest;
use AntChain\MQ\Models\ListDmsMsgtypeResponse;
use AntChain\MQ\Models\ListDmsWhitelistRequest;
use AntChain\MQ\Models\ListDmsWhitelistResponse;
use AntChain\MQ\Models\ListSchemaAdmindetailRequest;
use AntChain\MQ\Models\ListSchemaAdmindetailResponse;
use AntChain\MQ\Models\ListSchemaAdminmetadataRequest;
use AntChain\MQ\Models\ListSchemaAdminmetadataResponse;
use AntChain\MQ\Models\ListSofamqAdminapiRequest;
use AntChain\MQ\Models\ListSofamqAdminapiResponse;
use AntChain\MQ\Models\ListSofamqAdmingroupRequest;
use AntChain\MQ\Models\ListSofamqAdmingroupResponse;
use AntChain\MQ\Models\ListSofamqAdmintopicRequest;
use AntChain\MQ\Models\ListSofamqAdmintopicResponse;
use AntChain\MQ\Models\ListSofamqAdminuserRequest;
use AntChain\MQ\Models\ListSofamqAdminuserResponse;
use AntChain\MQ\Models\ListSofamqAuditorRequest;
use AntChain\MQ\Models\ListSofamqAuditorResponse;
use AntChain\MQ\Models\ListSofamqCellRequest;
use AntChain\MQ\Models\ListSofamqCellResponse;
use AntChain\MQ\Models\ListSofamqClusterRequest;
use AntChain\MQ\Models\ListSofamqClusterResponse;
use AntChain\MQ\Models\ListSofamqConfigRequest;
use AntChain\MQ\Models\ListSofamqConfigResponse;
use AntChain\MQ\Models\ListSofamqConnectorRequest;
use AntChain\MQ\Models\ListSofamqConnectorResponse;
use AntChain\MQ\Models\ListSofamqConnectorscheuletypeRequest;
use AntChain\MQ\Models\ListSofamqConnectorscheuletypeResponse;
use AntChain\MQ\Models\ListSofamqConnectorsinktypeRequest;
use AntChain\MQ\Models\ListSofamqConnectorsinktypeResponse;
use AntChain\MQ\Models\ListSofamqConnectorsourcetypeRequest;
use AntChain\MQ\Models\ListSofamqConnectorsourcetypeResponse;
use AntChain\MQ\Models\ListSofamqDatacenterRequest;
use AntChain\MQ\Models\ListSofamqDatacenterResponse;
use AntChain\MQ\Models\ListSofamqGroupRequest;
use AntChain\MQ\Models\ListSofamqGroupResponse;
use AntChain\MQ\Models\ListSofamqInstanceRequest;
use AntChain\MQ\Models\ListSofamqInstanceResponse;
use AntChain\MQ\Models\ListSofamqKvconfigRequest;
use AntChain\MQ\Models\ListSofamqKvconfigResponse;
use AntChain\MQ\Models\ListSofamqNamespaceRequest;
use AntChain\MQ\Models\ListSofamqNamespaceResponse;
use AntChain\MQ\Models\ListSofamqNodeRequest;
use AntChain\MQ\Models\ListSofamqNodeResponse;
use AntChain\MQ\Models\ListSofamqRoomRequest;
use AntChain\MQ\Models\ListSofamqRoomResponse;
use AntChain\MQ\Models\ListSofamqRouterRequest;
use AntChain\MQ\Models\ListSofamqRouterResponse;
use AntChain\MQ\Models\ListSofamqSchemacompatibilityRequest;
use AntChain\MQ\Models\ListSofamqSchemacompatibilityResponse;
use AntChain\MQ\Models\ListSofamqSchemaRequest;
use AntChain\MQ\Models\ListSofamqSchemaResponse;
use AntChain\MQ\Models\ListSofamqSchemaserializationRequest;
use AntChain\MQ\Models\ListSofamqSchemaserializationResponse;
use AntChain\MQ\Models\ListSofamqTopicRequest;
use AntChain\MQ\Models\ListSofamqTopicResponse;
use AntChain\MQ\Models\ListSofamqTraceRequest;
use AntChain\MQ\Models\ListSofamqTraceResponse;
use AntChain\MQ\Models\ListSofamqWarnlogRequest;
use AntChain\MQ\Models\ListSofamqWarnlogResponse;
use AntChain\MQ\Models\ListSofamqWarnRequest;
use AntChain\MQ\Models\ListSofamqWarnResponse;
use AntChain\MQ\Models\LoadConnectorjobSloviewRequest;
use AntChain\MQ\Models\LoadConnectorjobSloviewResponse;
use AntChain\MQ\Models\LoadSofamqConnectorconfigsRequest;
use AntChain\MQ\Models\LoadSofamqConnectorconfigsResponse;
use AntChain\MQ\Models\LoadSofamqConnectorsourceRequest;
use AntChain\MQ\Models\LoadSofamqConnectorsourceResponse;
use AntChain\MQ\Models\PauseSofamqConnectorjobRequest;
use AntChain\MQ\Models\PauseSofamqConnectorjobResponse;
use AntChain\MQ\Models\PauseSofamqConnectorplanRequest;
use AntChain\MQ\Models\PauseSofamqConnectorplanResponse;
use AntChain\MQ\Models\PushSofamqMessageRequest;
use AntChain\MQ\Models\PushSofamqMessageResponse;
use AntChain\MQ\Models\PushSpiCompletecommodityRequest;
use AntChain\MQ\Models\PushSpiCompletecommodityResponse;
use AntChain\MQ\Models\PushSpiOpencallbackRequest;
use AntChain\MQ\Models\PushSpiOpencallbackResponse;
use AntChain\MQ\Models\PushSpiOrderverifyRequest;
use AntChain\MQ\Models\PushSpiOrderverifyResponse;
use AntChain\MQ\Models\PushSpiPaycallbackRequest;
use AntChain\MQ\Models\PushSpiPaycallbackResponse;
use AntChain\MQ\Models\QueryBindingRequest;
use AntChain\MQ\Models\QueryBindingResponse;
use AntChain\MQ\Models\QueryBindingsRequest;
use AntChain\MQ\Models\QueryBindingsResponse;
use AntChain\MQ\Models\QueryDmsMsgRequest;
use AntChain\MQ\Models\QueryDmsMsgResponse;
use AntChain\MQ\Models\QueryDmsUploadurlRequest;
use AntChain\MQ\Models\QueryDmsUploadurlResponse;
use AntChain\MQ\Models\QueryMeshApplicationbynameRequest;
use AntChain\MQ\Models\QueryMeshApplicationbynameResponse;
use AntChain\MQ\Models\QueryMeshApplicationlistRequest;
use AntChain\MQ\Models\QueryMeshApplicationlistResponse;
use AntChain\MQ\Models\QueryMeshApplicationqueuenamesRequest;
use AntChain\MQ\Models\QueryMeshApplicationqueuenamesResponse;
use AntChain\MQ\Models\QueryMeshApplicationRequest;
use AntChain\MQ\Models\QueryMeshApplicationResponse;
use AntChain\MQ\Models\QueryMeshApplicationserviceRequest;
use AntChain\MQ\Models\QueryMeshApplicationserviceResponse;
use AntChain\MQ\Models\QueryMeshQueuebyidRequest;
use AntChain\MQ\Models\QueryMeshQueuebyidResponse;
use AntChain\MQ\Models\QueryMeshQueuelimitrulesRequest;
use AntChain\MQ\Models\QueryMeshQueuelimitrulesResponse;
use AntChain\MQ\Models\QueryMeshQueuelimitvalueRequest;
use AntChain\MQ\Models\QueryMeshQueuelimitvalueResponse;
use AntChain\MQ\Models\QueryMeshQueueRequest;
use AntChain\MQ\Models\QueryMeshQueueResponse;
use AntChain\MQ\Models\QueryMeshQueuerouteappRequest;
use AntChain\MQ\Models\QueryMeshQueuerouteappResponse;
use AntChain\MQ\Models\QueryMeshQueuerouteeditionRequest;
use AntChain\MQ\Models\QueryMeshQueuerouteeditionResponse;
use AntChain\MQ\Models\QueryMeshQueuerouterulesRequest;
use AntChain\MQ\Models\QueryMeshQueuerouterulesResponse;
use AntChain\MQ\Models\QueryMetricsBacklogRequest;
use AntChain\MQ\Models\QueryMetricsBacklogResponse;
use AntChain\MQ\Models\QueryMetricsInstancehistoryRequest;
use AntChain\MQ\Models\QueryMetricsInstancehistoryResponse;
use AntChain\MQ\Models\QueryMetricsInstanceRequest;
use AntChain\MQ\Models\QueryMetricsInstanceResponse;
use AntChain\MQ\Models\QueryMetricsOverviewRequest;
use AntChain\MQ\Models\QueryMetricsOverviewResponse;
use AntChain\MQ\Models\QueryMetricsTghistoryRequest;
use AntChain\MQ\Models\QueryMetricsTghistoryResponse;
use AntChain\MQ\Models\QueryMetricsTginstantRequest;
use AntChain\MQ\Models\QueryMetricsTginstantResponse;
use AntChain\MQ\Models\QueryMetricsTopicRequest;
use AntChain\MQ\Models\QueryMetricsTopicResponse;
use AntChain\MQ\Models\QueryMsgdumpSourceRequest;
use AntChain\MQ\Models\QueryMsgdumpSourceResponse;
use AntChain\MQ\Models\QueryMsgdumpTaskRequest;
use AntChain\MQ\Models\QueryMsgdumpTaskResponse;
use AntChain\MQ\Models\QueryMsgtypeRequest;
use AntChain\MQ\Models\QueryMsgtypeResponse;
use AntChain\MQ\Models\QuerySchemaAdminconfigRequest;
use AntChain\MQ\Models\QuerySchemaAdminconfigResponse;
use AntChain\MQ\Models\QuerySchemaAdminmetadataRequest;
use AntChain\MQ\Models\QuerySchemaAdminmetadataResponse;
use AntChain\MQ\Models\QuerySofamqAdmingroupsubdetailRequest;
use AntChain\MQ\Models\QuerySofamqAdmingroupsubdetailResponse;
use AntChain\MQ\Models\QuerySofamqCellbytypeRequest;
use AntChain\MQ\Models\QuerySofamqCellbytypeResponse;
use AntChain\MQ\Models\QuerySofamqCellRequest;
use AntChain\MQ\Models\QuerySofamqCellResponse;
use AntChain\MQ\Models\QuerySofamqConnectorconfigsRequest;
use AntChain\MQ\Models\QuerySofamqConnectorconfigsResponse;
use AntChain\MQ\Models\QuerySofamqConnectordateRequest;
use AntChain\MQ\Models\QuerySofamqConnectordateResponse;
use AntChain\MQ\Models\QuerySofamqConnectorjobappRequest;
use AntChain\MQ\Models\QuerySofamqConnectorjobappResponse;
use AntChain\MQ\Models\QuerySofamqConnectorjobdelayRequest;
use AntChain\MQ\Models\QuerySofamqConnectorjobdelayResponse;
use AntChain\MQ\Models\QuerySofamqConnectorjobpartitionstatuscolumnRequest;
use AntChain\MQ\Models\QuerySofamqConnectorjobpartitionstatuscolumnResponse;
use AntChain\MQ\Models\QuerySofamqConnectorjobpartitionstatusRequest;
use AntChain\MQ\Models\QuerySofamqConnectorjobpartitionstatusResponse;
use AntChain\MQ\Models\QuerySofamqConnectorplansingletonRequest;
use AntChain\MQ\Models\QuerySofamqConnectorplansingletonResponse;
use AntChain\MQ\Models\QuerySofamqConnectorprocessRequest;
use AntChain\MQ\Models\QuerySofamqConnectorprocessResponse;
use AntChain\MQ\Models\QuerySofamqConnectorrecordRequest;
use AntChain\MQ\Models\QuerySofamqConnectorrecordResponse;
use AntChain\MQ\Models\QuerySofamqConnectorRequest;
use AntChain\MQ\Models\QuerySofamqConnectorResponse;
use AntChain\MQ\Models\QuerySofamqConnectortriggerconfigsRequest;
use AntChain\MQ\Models\QuerySofamqConnectortriggerconfigsResponse;
use AntChain\MQ\Models\QuerySofamqConsumelimiterRequest;
use AntChain\MQ\Models\QuerySofamqConsumelimiterResponse;
use AntChain\MQ\Models\QuerySofamqConsumeraccumulateRequest;
use AntChain\MQ\Models\QuerySofamqConsumeraccumulateResponse;
use AntChain\MQ\Models\QuerySofamqConsumerconnectionRequest;
use AntChain\MQ\Models\QuerySofamqConsumerconnectionResponse;
use AntChain\MQ\Models\QuerySofamqConsumertimespanRequest;
use AntChain\MQ\Models\QuerySofamqConsumertimespanResponse;
use AntChain\MQ\Models\QuerySofamqConsumptionRequest;
use AntChain\MQ\Models\QuerySofamqConsumptionResponse;
use AntChain\MQ\Models\QuerySofamqDlqbygroupidRequest;
use AntChain\MQ\Models\QuerySofamqDlqbygroupidResponse;
use AntChain\MQ\Models\QuerySofamqEndpointRequest;
use AntChain\MQ\Models\QuerySofamqEndpointResponse;
use AntChain\MQ\Models\QuerySofamqGroupnameRequest;
use AntChain\MQ\Models\QuerySofamqGroupnameResponse;
use AntChain\MQ\Models\QuerySofamqGroupsubdetailRequest;
use AntChain\MQ\Models\QuerySofamqGroupsubdetailResponse;
use AntChain\MQ\Models\QuerySofamqInputtpsRequest;
use AntChain\MQ\Models\QuerySofamqInputtpsResponse;
use AntChain\MQ\Models\QuerySofamqLabelsRequest;
use AntChain\MQ\Models\QuerySofamqLabelsResponse;
use AntChain\MQ\Models\QuerySofamqLinkRequest;
use AntChain\MQ\Models\QuerySofamqLinkResponse;
use AntChain\MQ\Models\QuerySofamqMessagebykeyRequest;
use AntChain\MQ\Models\QuerySofamqMessagebykeyResponse;
use AntChain\MQ\Models\QuerySofamqMessagebytopicRequest;
use AntChain\MQ\Models\QuerySofamqMessagebytopicResponse;
use AntChain\MQ\Models\QuerySofamqMessagetraceRequest;
use AntChain\MQ\Models\QuerySofamqMessagetraceResponse;
use AntChain\MQ\Models\QuerySofamqNodebynamespaceidRequest;
use AntChain\MQ\Models\QuerySofamqNodebynamespaceidResponse;
use AntChain\MQ\Models\QuerySofamqOutputtpsRequest;
use AntChain\MQ\Models\QuerySofamqOutputtpsResponse;
use AntChain\MQ\Models\QuerySofamqRoombynamespaceidRequest;
use AntChain\MQ\Models\QuerySofamqRoombynamespaceidResponse;
use AntChain\MQ\Models\QuerySofamqRouterRequest;
use AntChain\MQ\Models\QuerySofamqRouterResponse;
use AntChain\MQ\Models\QuerySofamqTopicnameRequest;
use AntChain\MQ\Models\QuerySofamqTopicnameResponse;
use AntChain\MQ\Models\QuerySofamqTopicqueueRequest;
use AntChain\MQ\Models\QuerySofamqTopicqueueResponse;
use AntChain\MQ\Models\QuerySofamqTopicstatusRequest;
use AntChain\MQ\Models\QuerySofamqTopicstatusResponse;
use AntChain\MQ\Models\QuerySofamqTopicsubdetailRequest;
use AntChain\MQ\Models\QuerySofamqTopicsubdetailResponse;
use AntChain\MQ\Models\QuerySofamqTracebymsgkeyRequest;
use AntChain\MQ\Models\QuerySofamqTracebymsgkeyResponse;
use AntChain\MQ\Models\QuerySofamqTracebytopicRequest;
use AntChain\MQ\Models\QuerySofamqTracebytopicResponse;
use AntChain\MQ\Models\QueryStatsGroupRequest;
use AntChain\MQ\Models\QueryStatsGroupResponse;
use AntChain\MQ\Models\QueryStatsTopicRequest;
use AntChain\MQ\Models\QueryStatsTopicResponse;
use AntChain\MQ\Models\QuerySwitchoverRequest;
use AntChain\MQ\Models\QuerySwitchoverResponse;
use AntChain\MQ\Models\QueryTopicsRequest;
use AntChain\MQ\Models\QueryTopicsResponse;
use AntChain\MQ\Models\QueryUserTopicqueueRequest;
use AntChain\MQ\Models\QueryUserTopicqueueResponse;
use AntChain\MQ\Models\ResumeSofamqConnectorjobRequest;
use AntChain\MQ\Models\ResumeSofamqConnectorjobResponse;
use AntChain\MQ\Models\ResumeSofamqConnectorplanRequest;
use AntChain\MQ\Models\ResumeSofamqConnectorplanResponse;
use AntChain\MQ\Models\ResumeSofamqConnectorprocessRequest;
use AntChain\MQ\Models\ResumeSofamqConnectorprocessResponse;
use AntChain\MQ\Models\RetrySofamqConnectorplanRequest;
use AntChain\MQ\Models\RetrySofamqConnectorplanResponse;
use AntChain\MQ\Models\RunSofamqConnectorjobRequest;
use AntChain\MQ\Models\RunSofamqConnectorjobResponse;
use AntChain\MQ\Models\SendSofamqMessageRequest;
use AntChain\MQ\Models\SendSofamqMessageResponse;
use AntChain\MQ\Models\SetSofamqConnectorplancheckpointRequest;
use AntChain\MQ\Models\SetSofamqConnectorplancheckpointResponse;
use AntChain\MQ\Models\StatusMqMessageUndeliveryRequest;
use AntChain\MQ\Models\StatusMqMessageUndeliveryResponse;
use AntChain\MQ\Models\SwitchSofamqAdminapiRequest;
use AntChain\MQ\Models\SwitchSofamqAdminapiResponse;
use AntChain\MQ\Models\UndeliverMessageStatusRequest;
use AntChain\MQ\Models\UndeliverMessageStatusResponse;
use AntChain\MQ\Models\UndeliveryMessageStatusRequest;
use AntChain\MQ\Models\UndeliveryMessageStatusResponse;
use AntChain\MQ\Models\UpdateBindingRequest;
use AntChain\MQ\Models\UpdateBindingResponse;
use AntChain\MQ\Models\UpdateDmsBindingRequest;
use AntChain\MQ\Models\UpdateDmsBindingResponse;
use AntChain\MQ\Models\UpdateDmsMsgtypeRequest;
use AntChain\MQ\Models\UpdateDmsMsgtypeResponse;
use AntChain\MQ\Models\UpdateMeshApplicationRequest;
use AntChain\MQ\Models\UpdateMeshApplicationResponse;
use AntChain\MQ\Models\UpdateMeshQueuelimitRequest;
use AntChain\MQ\Models\UpdateMeshQueuelimitResponse;
use AntChain\MQ\Models\UpdateMeshQueuelimitstatusconfirmRequest;
use AntChain\MQ\Models\UpdateMeshQueuelimitstatusconfirmResponse;
use AntChain\MQ\Models\UpdateMeshQueuelimitstatusRequest;
use AntChain\MQ\Models\UpdateMeshQueuelimitstatusResponse;
use AntChain\MQ\Models\UpdateMeshQueueRequest;
use AntChain\MQ\Models\UpdateMeshQueueResponse;
use AntChain\MQ\Models\UpdateMeshQueuerouteRequest;
use AntChain\MQ\Models\UpdateMeshQueuerouteResponse;
use AntChain\MQ\Models\UpdateMeshQueueroutestatusconfirmRequest;
use AntChain\MQ\Models\UpdateMeshQueueroutestatusconfirmResponse;
use AntChain\MQ\Models\UpdateMeshQueueroutestatusRequest;
use AntChain\MQ\Models\UpdateMeshQueueroutestatusResponse;
use AntChain\MQ\Models\UpdateMessageNextdeliverytimeRequest;
use AntChain\MQ\Models\UpdateMessageNextdeliverytimeResponse;
use AntChain\MQ\Models\UpdateMsgtypeRequest;
use AntChain\MQ\Models\UpdateMsgtypeResponse;
use AntChain\MQ\Models\UpdateSchemaAdminmetadataRequest;
use AntChain\MQ\Models\UpdateSchemaAdminmetadataResponse;
use AntChain\MQ\Models\UpdateSofamqAdmingroupRequest;
use AntChain\MQ\Models\UpdateSofamqAdmingroupResponse;
use AntChain\MQ\Models\UpdateSofamqAdmintopicRequest;
use AntChain\MQ\Models\UpdateSofamqAdmintopicResponse;
use AntChain\MQ\Models\UpdateSofamqClusterRequest;
use AntChain\MQ\Models\UpdateSofamqClusterResponse;
use AntChain\MQ\Models\UpdateSofamqConfigRequest;
use AntChain\MQ\Models\UpdateSofamqConfigResponse;
use AntChain\MQ\Models\UpdateSofamqConnectorRequest;
use AntChain\MQ\Models\UpdateSofamqConnectorResponse;
use AntChain\MQ\Models\UpdateSofamqConsumelimiterRequest;
use AntChain\MQ\Models\UpdateSofamqConsumelimiterResponse;
use AntChain\MQ\Models\UpdateSofamqDatacenterRequest;
use AntChain\MQ\Models\UpdateSofamqDatacenterResponse;
use AntChain\MQ\Models\UpdateSofamqGroupremarkRequest;
use AntChain\MQ\Models\UpdateSofamqGroupremarkResponse;
use AntChain\MQ\Models\UpdateSofamqGroupRequest;
use AntChain\MQ\Models\UpdateSofamqGroupResponse;
use AntChain\MQ\Models\UpdateSofamqInstanceRequest;
use AntChain\MQ\Models\UpdateSofamqInstanceResponse;
use AntChain\MQ\Models\UpdateSofamqKvconfigRequest;
use AntChain\MQ\Models\UpdateSofamqKvconfigResponse;
use AntChain\MQ\Models\UpdateSofamqNodeRequest;
use AntChain\MQ\Models\UpdateSofamqNodeResponse;
use AntChain\MQ\Models\UpdateSofamqRoomRequest;
use AntChain\MQ\Models\UpdateSofamqRoomResponse;
use AntChain\MQ\Models\UpdateSofamqRouterRequest;
use AntChain\MQ\Models\UpdateSofamqRouterResponse;
use AntChain\MQ\Models\UpdateSofamqSchemaRequest;
use AntChain\MQ\Models\UpdateSofamqSchemaResponse;
use AntChain\MQ\Models\UpdateSofamqTopicremarkRequest;
use AntChain\MQ\Models\UpdateSofamqTopicremarkResponse;
use AntChain\MQ\Models\UpdateSofamqTopicRequest;
use AntChain\MQ\Models\UpdateSofamqTopicResponse;
use AntChain\MQ\Models\UpdateSofamqWarnRequest;
use AntChain\MQ\Models\UpdateSofamqWarnResponse;
use AntChain\MQ\Models\UpdateTopicRequest;
use AntChain\MQ\Models\UpdateTopicResponse;
use AntChain\MQ\Models\VerifySofamqConnectoroperationRequest;
use AntChain\MQ\Models\VerifySofamqConnectoroperationResponse;
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
            // schema元数据对象
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
                    'sdk_version'      => '3.8.22',
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
     * Description: Query undelivery message status.
     * Summary: query undelivery message status.
     *
     * @param StatusMqMessageUndeliveryRequest $request
     *
     * @return StatusMqMessageUndeliveryResponse
     */
    public function statusMqMessageUndelivery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->statusMqMessageUndeliveryEx($request, $headers, $runtime);
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status.
     *
     * @param StatusMqMessageUndeliveryRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return StatusMqMessageUndeliveryResponse
     */
    public function statusMqMessageUndeliveryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StatusMqMessageUndeliveryResponse::fromMap($this->doRequest('1.0', 'mq.message.undelivery.status', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status.
     *
     * @param UndeliverMessageStatusRequest $request
     *
     * @return UndeliverMessageStatusResponse
     */
    public function undeliverMessageStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->undeliverMessageStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status.
     *
     * @param UndeliverMessageStatusRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UndeliverMessageStatusResponse
     */
    public function undeliverMessageStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UndeliverMessageStatusResponse::fromMap($this->doRequest('1.0', 'sofa.mq.message.status.undeliver', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Add a message type.
     * Summary: add a message type.
     *
     * @param AddMsgtypeRequest $request
     *
     * @return AddMsgtypeResponse
     */
    public function addMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: Add a message type.
     * Summary: add a message type.
     *
     * @param AddMsgtypeRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AddMsgtypeResponse
     */
    public function addMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddMsgtypeResponse::fromMap($this->doRequest('1.0', 'sofa.mq.msgtype.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Update a message type.
     * Summary: update a message type.
     *
     * @param UpdateMsgtypeRequest $request
     *
     * @return UpdateMsgtypeResponse
     */
    public function updateMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: Update a message type.
     * Summary: update a message type.
     *
     * @param UpdateMsgtypeRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateMsgtypeResponse
     */
    public function updateMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMsgtypeResponse::fromMap($this->doRequest('1.0', 'sofa.mq.msgtype.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Delete a message type.
     * Summary: delete a message type.
     *
     * @param DeleteMsgtypeRequest $request
     *
     * @return DeleteMsgtypeResponse
     */
    public function deleteMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: Delete a message type.
     * Summary: delete a message type.
     *
     * @param DeleteMsgtypeRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DeleteMsgtypeResponse
     */
    public function deleteMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMsgtypeResponse::fromMap($this->doRequest('1.0', 'sofa.mq.msgtype.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Query the collection of message type.
     * Summary: query the collection of message type.
     *
     * @param QueryMsgtypeRequest $request
     *
     * @return QueryMsgtypeResponse
     */
    public function queryMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: Query the collection of message type.
     * Summary: query the collection of message type.
     *
     * @param QueryMsgtypeRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryMsgtypeResponse
     */
    public function queryMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMsgtypeResponse::fromMap($this->doRequest('1.0', 'sofa.mq.msgtype.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Add a binding.
     * Summary: add a binding.
     *
     * @param AddBindingRequest $request
     *
     * @return AddBindingResponse
     */
    public function addBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: Add a binding.
     * Summary: add a binding.
     *
     * @param AddBindingRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AddBindingResponse
     */
    public function addBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddBindingResponse::fromMap($this->doRequest('1.0', 'sofa.mq.binding.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Update a binding.
     * Summary: update a binding.
     *
     * @param UpdateBindingRequest $request
     *
     * @return UpdateBindingResponse
     */
    public function updateBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: Update a binding.
     * Summary: update a binding.
     *
     * @param UpdateBindingRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateBindingResponse
     */
    public function updateBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBindingResponse::fromMap($this->doRequest('1.0', 'sofa.mq.binding.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Delete a binding.
     * Summary: delete a binding.
     *
     * @param DeleteBindingRequest $request
     *
     * @return DeleteBindingResponse
     */
    public function deleteBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: Delete a binding.
     * Summary: delete a binding.
     *
     * @param DeleteBindingRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DeleteBindingResponse
     */
    public function deleteBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteBindingResponse::fromMap($this->doRequest('1.0', 'sofa.mq.binding.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Query the collection of binding.
     * Summary: query the collection of binding.
     *
     * @param QueryBindingRequest $request
     *
     * @return QueryBindingResponse
     */
    public function queryBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: Query the collection of binding.
     * Summary: query the collection of binding.
     *
     * @param QueryBindingRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryBindingResponse
     */
    public function queryBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBindingResponse::fromMap($this->doRequest('1.0', 'sofa.mq.binding.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Queue switchover execute.
     * Summary: Queue switchover execute.
     *
     * @param ExecuteSwitchoverRequest $request
     *
     * @return ExecuteSwitchoverResponse
     */
    public function executeSwitchover($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->executeSwitchoverEx($request, $headers, $runtime);
    }

    /**
     * Description: Queue switchover execute.
     * Summary: Queue switchover execute.
     *
     * @param ExecuteSwitchoverRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExecuteSwitchoverResponse
     */
    public function executeSwitchoverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecuteSwitchoverResponse::fromMap($this->doRequest('1.0', 'sofa.mq.switchover.execute', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Queue switchover cancel.
     * Summary: Queue switchover cancel.
     *
     * @param CancelSwitchoverRequest $request
     *
     * @return CancelSwitchoverResponse
     */
    public function cancelSwitchover($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelSwitchoverEx($request, $headers, $runtime);
    }

    /**
     * Description: Queue switchover cancel.
     * Summary: Queue switchover cancel.
     *
     * @param CancelSwitchoverRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CancelSwitchoverResponse
     */
    public function cancelSwitchoverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelSwitchoverResponse::fromMap($this->doRequest('1.0', 'sofa.mq.switchover.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Queue switchover query.
     * Summary: Queue switchover query.
     *
     * @param QuerySwitchoverRequest $request
     *
     * @return QuerySwitchoverResponse
     */
    public function querySwitchover($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySwitchoverEx($request, $headers, $runtime);
    }

    /**
     * Description: Queue switchover query.
     * Summary: Queue switchover query.
     *
     * @param QuerySwitchoverRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QuerySwitchoverResponse
     */
    public function querySwitchoverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySwitchoverResponse::fromMap($this->doRequest('1.0', 'sofa.mq.switchover.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Query the collection of message type.
     * Summary: query the collection of message type.
     *
     * @param GetMsgtypeRequest $request
     *
     * @return GetMsgtypeResponse
     */
    public function getMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: Query the collection of message type.
     * Summary: query the collection of message type.
     *
     * @param GetMsgtypeRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetMsgtypeResponse
     */
    public function getMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMsgtypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.msgtype.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status.
     *
     * @param UndeliveryMessageStatusRequest $request
     *
     * @return UndeliveryMessageStatusResponse
     */
    public function undeliveryMessageStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->undeliveryMessageStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: Query undelivery message status.
     * Summary: query undelivery message status.
     *
     * @param UndeliveryMessageStatusRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UndeliveryMessageStatusResponse
     */
    public function undeliveryMessageStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UndeliveryMessageStatusResponse::fromMap($this->doRequest('2.0', 'sofa.mq.message.status.undelivery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query topics
     * Summary: query topics.
     *
     * @param QueryTopicsRequest $request
     *
     * @return QueryTopicsResponse
     */
    public function queryTopics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTopicsEx($request, $headers, $runtime);
    }

    /**
     * Description: query topics
     * Summary: query topics.
     *
     * @param QueryTopicsRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryTopicsResponse
     */
    public function queryTopicsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTopicsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.topics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query topic
     * Summary: query topic.
     *
     * @param IdTopicQueryRequest $request
     *
     * @return IdTopicQueryResponse
     */
    public function idTopicQuery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->idTopicQueryEx($request, $headers, $runtime);
    }

    /**
     * Description: query topic
     * Summary: query topic.
     *
     * @param IdTopicQueryRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return IdTopicQueryResponse
     */
    public function idTopicQueryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return IdTopicQueryResponse::fromMap($this->doRequest('2.0', 'sofa.mq.topic.query.id', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: add topic
     * Summary: add topic.
     *
     * @param AddTopicRequest $request
     *
     * @return AddTopicResponse
     */
    public function addTopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addTopicEx($request, $headers, $runtime);
    }

    /**
     * Description: add topic
     * Summary: add topic.
     *
     * @param AddTopicRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return AddTopicResponse
     */
    public function addTopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddTopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.topic.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update topic
     * Summary: update topic.
     *
     * @param UpdateTopicRequest $request
     *
     * @return UpdateTopicResponse
     */
    public function updateTopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTopicEx($request, $headers, $runtime);
    }

    /**
     * Description: update topic
     * Summary: update topic.
     *
     * @param UpdateTopicRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return UpdateTopicResponse
     */
    public function updateTopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.topic.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: delete topic
     * Summary: delete topic.
     *
     * @param DeleteTopicRequest $request
     *
     * @return DeleteTopicResponse
     */
    public function deleteTopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTopicEx($request, $headers, $runtime);
    }

    /**
     * Description: delete topic
     * Summary: delete topic.
     *
     * @param DeleteTopicRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return DeleteTopicResponse
     */
    public function deleteTopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.topic.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query bindings
     * Summary: query bindings.
     *
     * @param QueryBindingsRequest $request
     *
     * @return QueryBindingsResponse
     */
    public function queryBindings($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBindingsEx($request, $headers, $runtime);
    }

    /**
     * Description: query bindings
     * Summary: query bindings.
     *
     * @param QueryBindingsRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryBindingsResponse
     */
    public function queryBindingsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBindingsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.bindings.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query binding
     * Summary: query binding.
     *
     * @param IdBindingQueryRequest $request
     *
     * @return IdBindingQueryResponse
     */
    public function idBindingQuery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->idBindingQueryEx($request, $headers, $runtime);
    }

    /**
     * Description: query binding
     * Summary: query binding.
     *
     * @param IdBindingQueryRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return IdBindingQueryResponse
     */
    public function idBindingQueryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return IdBindingQueryResponse::fromMap($this->doRequest('2.0', 'sofa.mq.binding.query.id', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定实例下 Topic 的信息列表。
     * Summary: 查询Topic列表.
     *
     * @param ListSofamqTopicRequest $request
     *
     * @return ListSofamqTopicResponse
     */
    public function listSofamqTopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqTopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定实例下 Topic 的信息列表。
     * Summary: 查询Topic列表.
     *
     * @param ListSofamqTopicRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListSofamqTopicResponse
     */
    public function listSofamqTopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqTopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.topic.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
     * Summary: 创建Topic.
     *
     * @param CreateSofamqTopicRequest $request
     *
     * @return CreateSofamqTopicResponse
     */
    public function createSofamqTopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqTopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
     * Summary: 创建Topic.
     *
     * @param CreateSofamqTopicRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateSofamqTopicResponse
     */
    public function createSofamqTopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqTopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.topic.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
     * Summary: 删除Topic.
     *
     * @param DeleteSofamqTopicRequest $request
     *
     * @return DeleteSofamqTopicResponse
     */
    public function deleteSofamqTopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqTopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
     * Summary: 删除Topic.
     *
     * @param DeleteSofamqTopicRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteSofamqTopicResponse
     */
    public function deleteSofamqTopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqTopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.topic.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新指定 Topic 的读写权限配置。
     * Summary: 更新Topic读写权限.
     *
     * @param UpdateSofamqTopicRequest $request
     *
     * @return UpdateSofamqTopicResponse
     */
    public function updateSofamqTopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqTopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新指定 Topic 的读写权限配置。
     * Summary: 更新Topic读写权限.
     *
     * @param UpdateSofamqTopicRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateSofamqTopicResponse
     */
    public function updateSofamqTopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqTopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.topic.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: sofamq list instance
     * Summary: sofamq list instance.
     *
     * @param ListSofamqInstanceRequest $request
     *
     * @return ListSofamqInstanceResponse
     */
    public function listSofamqInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: sofamq list instance
     * Summary: sofamq list instance.
     *
     * @param ListSofamqInstanceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListSofamqInstanceResponse
     */
    public function listSofamqInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqInstanceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.instance.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: sofamq instance create
     * Summary: instance create.
     *
     * @param CreateSofamqInstanceRequest $request
     *
     * @return CreateSofamqInstanceResponse
     */
    public function createSofamqInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: sofamq instance create
     * Summary: instance create.
     *
     * @param CreateSofamqInstanceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateSofamqInstanceResponse
     */
    public function createSofamqInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqInstanceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.instance.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: instance delete
     * Summary: instance delete.
     *
     * @param DeleteSofamqInstanceRequest $request
     *
     * @return DeleteSofamqInstanceResponse
     */
    public function deleteSofamqInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: instance delete
     * Summary: instance delete.
     *
     * @param DeleteSofamqInstanceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteSofamqInstanceResponse
     */
    public function deleteSofamqInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqInstanceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.instance.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 使用 InstanceUpdate 更新实例名称和描述
     * Summary: instance update.
     *
     * @param UpdateSofamqInstanceRequest $request
     *
     * @return UpdateSofamqInstanceResponse
     */
    public function updateSofamqInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 使用 InstanceUpdate 更新实例名称和描述
     * Summary: instance update.
     *
     * @param UpdateSofamqInstanceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateSofamqInstanceResponse
     */
    public function updateSofamqInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqInstanceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.instance.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
     * Summary: 创建Group.
     *
     * @param CreateSofamqGroupRequest $request
     *
     * @return CreateSofamqGroupResponse
     */
    public function createSofamqGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
     * Summary: 创建Group.
     *
     * @param CreateSofamqGroupRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateSofamqGroupResponse
     */
    public function createSofamqGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqGroupResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.group.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定环境实例下 Group ID 资源的信息列表。
     * Summary: 查询Group列表.
     *
     * @param ListSofamqGroupRequest $request
     *
     * @return ListSofamqGroupResponse
     */
    public function listSofamqGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定环境实例下 Group ID 资源的信息列表。
     * Summary: 查询Group列表.
     *
     * @param ListSofamqGroupRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListSofamqGroupResponse
     */
    public function listSofamqGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqGroupResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.group.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除指定的 Group。
     * Summary: 删除Group.
     *
     * @param DeleteSofamqGroupRequest $request
     *
     * @return DeleteSofamqGroupResponse
     */
    public function deleteSofamqGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除指定的 Group。
     * Summary: 删除Group.
     *
     * @param DeleteSofamqGroupRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteSofamqGroupResponse
     */
    public function deleteSofamqGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqGroupResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.group.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新指定 Group 的读权限配置。
     * Summary: 更新Group读权限.
     *
     * @param UpdateSofamqGroupRequest $request
     *
     * @return UpdateSofamqGroupResponse
     */
    public function updateSofamqGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新指定 Group 的读权限配置。
     * Summary: 更新Group读权限.
     *
     * @param UpdateSofamqGroupRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateSofamqGroupResponse
     */
    public function updateSofamqGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqGroupResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.group.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
     * Summary: 查询Topic状态
     *
     * @param QuerySofamqTopicstatusRequest $request
     *
     * @return QuerySofamqTopicstatusResponse
     */
    public function querySofamqTopicstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqTopicstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
     * Summary: 查询Topic状态
     *
     * @param QuerySofamqTopicstatusRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QuerySofamqTopicstatusResponse
     */
    public function querySofamqTopicstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqTopicstatusResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.topicstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
     * Summary: 查看在线订阅组.
     *
     * @param QuerySofamqTopicsubdetailRequest $request
     *
     * @return QuerySofamqTopicsubdetailResponse
     */
    public function querySofamqTopicsubdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqTopicsubdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
     * Summary: 查看在线订阅组.
     *
     * @param QuerySofamqTopicsubdetailRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QuerySofamqTopicsubdetailResponse
     */
    public function querySofamqTopicsubdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqTopicsubdetailResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.topicsubdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: node list
     * Summary: node list.
     *
     * @param ListSofamqNodeRequest $request
     *
     * @return ListSofamqNodeResponse
     */
    public function listSofamqNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: node list
     * Summary: node list.
     *
     * @param ListSofamqNodeRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListSofamqNodeResponse
     */
    public function listSofamqNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqNodeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.node.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: create node
     * Summary: create node.
     *
     * @param CreateSofamqNodeRequest $request
     *
     * @return CreateSofamqNodeResponse
     */
    public function createSofamqNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: create node
     * Summary: create node.
     *
     * @param CreateSofamqNodeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateSofamqNodeResponse
     */
    public function createSofamqNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqNodeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.node.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: room create
     * Summary: room create.
     *
     * @param CreateSofamqRoomRequest $request
     *
     * @return CreateSofamqRoomResponse
     */
    public function createSofamqRoom($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqRoomEx($request, $headers, $runtime);
    }

    /**
     * Description: room create
     * Summary: room create.
     *
     * @param CreateSofamqRoomRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateSofamqRoomResponse
     */
    public function createSofamqRoomEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqRoomResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.room.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: create cell
     * Summary: create cell.
     *
     * @param CreateSofamqCellRequest $request
     *
     * @return CreateSofamqCellResponse
     */
    public function createSofamqCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqCellEx($request, $headers, $runtime);
    }

    /**
     * Description: create cell
     * Summary: create cell.
     *
     * @param CreateSofamqCellRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateSofamqCellResponse
     */
    public function createSofamqCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqCellResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.cell.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: create cluster
     * Summary: create cluster.
     *
     * @param CreateSofamqClusterRequest $request
     *
     * @return CreateSofamqClusterResponse
     */
    public function createSofamqCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: create cluster
     * Summary: create cluster.
     *
     * @param CreateSofamqClusterRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateSofamqClusterResponse
     */
    public function createSofamqClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqClusterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.cluster.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: create namespace
     * Summary: create namespace.
     *
     * @param CreateSofamqNamespaceRequest $request
     *
     * @return CreateSofamqNamespaceResponse
     */
    public function createSofamqNamespace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqNamespaceEx($request, $headers, $runtime);
    }

    /**
     * Description: create namespace
     * Summary: create namespace.
     *
     * @param CreateSofamqNamespaceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateSofamqNamespaceResponse
     */
    public function createSofamqNamespaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqNamespaceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.namespace.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: room list
     * Summary: room list.
     *
     * @param ListSofamqRoomRequest $request
     *
     * @return ListSofamqRoomResponse
     */
    public function listSofamqRoom($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqRoomEx($request, $headers, $runtime);
    }

    /**
     * Description: room list
     * Summary: room list.
     *
     * @param ListSofamqRoomRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListSofamqRoomResponse
     */
    public function listSofamqRoomEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqRoomResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.room.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询cell列表
     * Summary: 查询cell列表.
     *
     * @param ListSofamqCellRequest $request
     *
     * @return ListSofamqCellResponse
     */
    public function listSofamqCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询cell列表
     * Summary: 查询cell列表.
     *
     * @param ListSofamqCellRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListSofamqCellResponse
     */
    public function listSofamqCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqCellResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.cell.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: list cluster
     * Summary: list cluster.
     *
     * @param ListSofamqClusterRequest $request
     *
     * @return ListSofamqClusterResponse
     */
    public function listSofamqCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: list cluster
     * Summary: list cluster.
     *
     * @param ListSofamqClusterRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListSofamqClusterResponse
     */
    public function listSofamqClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqClusterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.cluster.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
     * Summary: 查看在线订阅组.
     *
     * @param QuerySofamqGroupsubdetailRequest $request
     *
     * @return QuerySofamqGroupsubdetailResponse
     */
    public function querySofamqGroupsubdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqGroupsubdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
     * Summary: 查看在线订阅组.
     *
     * @param QuerySofamqGroupsubdetailRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QuerySofamqGroupsubdetailResponse
     */
    public function querySofamqGroupsubdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqGroupsubdetailResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.groupsubdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询实例基本信息和收发消息的接入点
     * Summary: 查询实例基本信息.
     *
     * @param GetSofamqInstancebaseinfoRequest $request
     *
     * @return GetSofamqInstancebaseinfoResponse
     */
    public function getSofamqInstancebaseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSofamqInstancebaseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实例基本信息和收发消息的接入点
     * Summary: 查询实例基本信息.
     *
     * @param GetSofamqInstancebaseinfoRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetSofamqInstancebaseinfoResponse
     */
    public function getSofamqInstancebaseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSofamqInstancebaseinfoResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.instancebaseinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
     * Summary: 重置消费位点.
     *
     * @param ExecSofamqConsumerresetoffsetRequest $request
     *
     * @return ExecSofamqConsumerresetoffsetResponse
     */
    public function execSofamqConsumerresetoffset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execSofamqConsumerresetoffsetEx($request, $headers, $runtime);
    }

    /**
     * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
     * Summary: 重置消费位点.
     *
     * @param ExecSofamqConsumerresetoffsetRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ExecSofamqConsumerresetoffsetResponse
     */
    public function execSofamqConsumerresetoffsetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecSofamqConsumerresetoffsetResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumerresetoffset.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
     * Summary: 消费者堆积查询.
     *
     * @param QuerySofamqConsumeraccumulateRequest $request
     *
     * @return QuerySofamqConsumeraccumulateResponse
     */
    public function querySofamqConsumeraccumulate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConsumeraccumulateEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
     * Summary: 消费者堆积查询.
     *
     * @param QuerySofamqConsumeraccumulateRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QuerySofamqConsumeraccumulateResponse
     */
    public function querySofamqConsumeraccumulateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConsumeraccumulateResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumeraccumulate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
     * Summary: 查询指定当前客户端的连接情况。
     *
     * @param QuerySofamqConsumerconnectionRequest $request
     *
     * @return QuerySofamqConsumerconnectionResponse
     */
    public function querySofamqConsumerconnection($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConsumerconnectionEx($request, $headers, $runtime);
    }

    /**
     * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
     * Summary: 查询指定当前客户端的连接情况。
     *
     * @param QuerySofamqConsumerconnectionRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QuerySofamqConsumerconnectionResponse
     */
    public function querySofamqConsumerconnectionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConsumerconnectionResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumerconnection.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
     * Summary: 查询时间跨度.
     *
     * @param QuerySofamqConsumertimespanRequest $request
     *
     * @return QuerySofamqConsumertimespanResponse
     */
    public function querySofamqConsumertimespan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConsumertimespanEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
     * Summary: 查询时间跨度.
     *
     * @param QuerySofamqConsumertimespanRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QuerySofamqConsumertimespanResponse
     */
    public function querySofamqConsumertimespanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConsumertimespanResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumertimespan.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
     * Summary: 判断目标消息是否曾被消费过.
     *
     * @param QuerySofamqMessagetraceRequest $request
     *
     * @return QuerySofamqMessagetraceResponse
     */
    public function querySofamqMessagetrace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqMessagetraceEx($request, $headers, $runtime);
    }

    /**
     * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
     * Summary: 判断目标消息是否曾被消费过.
     *
     * @param QuerySofamqMessagetraceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QuerySofamqMessagetraceResponse
     */
    public function querySofamqMessagetraceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqMessagetraceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.messagetrace.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
     * Summary: 按Message ID查询消息.
     *
     * @param GetSofamqMessagebymsgidRequest $request
     *
     * @return GetSofamqMessagebymsgidResponse
     */
    public function getSofamqMessagebymsgid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSofamqMessagebymsgidEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
     * Summary: 按Message ID查询消息.
     *
     * @param GetSofamqMessagebymsgidRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetSofamqMessagebymsgidResponse
     */
    public function getSofamqMessagebymsgidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSofamqMessagebymsgidResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.messagebymsgid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
     * Summary: 按Message Key查询消息.
     *
     * @param QuerySofamqMessagebykeyRequest $request
     *
     * @return QuerySofamqMessagebykeyResponse
     */
    public function querySofamqMessagebykey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqMessagebykeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
     * Summary: 按Message Key查询消息.
     *
     * @param QuerySofamqMessagebykeyRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QuerySofamqMessagebykeyResponse
     */
    public function querySofamqMessagebykeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqMessagebykeyResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.messagebykey.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
     * Summary: 通过MsgId创建轨迹查询任务
     *
     * @param GetSofamqTracebymsgidRequest $request
     *
     * @return GetSofamqTracebymsgidResponse
     */
    public function getSofamqTracebymsgid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSofamqTracebymsgidEx($request, $headers, $runtime);
    }

    /**
     * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
     * Summary: 通过MsgId创建轨迹查询任务
     *
     * @param GetSofamqTracebymsgidRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetSofamqTracebymsgidResponse
     */
    public function getSofamqTracebymsgidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSofamqTracebymsgidResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.tracebymsgid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
     * Summary: 通过MsgKey创建轨迹查询任务
     *
     * @param QuerySofamqTracebymsgkeyRequest $request
     *
     * @return QuerySofamqTracebymsgkeyResponse
     */
    public function querySofamqTracebymsgkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqTracebymsgkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
     * Summary: 通过MsgKey创建轨迹查询任务
     *
     * @param QuerySofamqTracebymsgkeyRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QuerySofamqTracebymsgkeyResponse
     */
    public function querySofamqTracebymsgkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqTracebymsgkeyResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.tracebymsgkey.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
     * Summary: 获取轨迹查询结果.
     *
     * @param GetSofamqTraceresultRequest $request
     *
     * @return GetSofamqTraceresultResponse
     */
    public function getSofamqTraceresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSofamqTraceresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
     * Summary: 获取轨迹查询结果.
     *
     * @param GetSofamqTraceresultRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetSofamqTraceresultResponse
     */
    public function getSofamqTraceresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSofamqTraceresultResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.traceresult.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
     * Summary: 查询一段时间写入报表数据.
     *
     * @param QuerySofamqInputtpsRequest $request
     *
     * @return QuerySofamqInputtpsResponse
     */
    public function querySofamqInputtps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqInputtpsEx($request, $headers, $runtime);
    }

    /**
     * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
     * Summary: 查询一段时间写入报表数据.
     *
     * @param QuerySofamqInputtpsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QuerySofamqInputtpsResponse
     */
    public function querySofamqInputtpsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqInputtpsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.inputtps.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
     * 消费消息总量的统计曲线
     * 消费消息 TPS 的统计曲线
     * Summary: 查询一段时间内消费消息统计信息.
     *
     * @param QuerySofamqOutputtpsRequest $request
     *
     * @return QuerySofamqOutputtpsResponse
     */
    public function querySofamqOutputtps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqOutputtpsEx($request, $headers, $runtime);
    }

    /**
     * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
     * 消费消息总量的统计曲线
     * 消费消息 TPS 的统计曲线
     * Summary: 查询一段时间内消费消息统计信息.
     *
     * @param QuerySofamqOutputtpsRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QuerySofamqOutputtpsResponse
     */
    public function querySofamqOutputtpsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqOutputtpsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.outputtps.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
     * Summary: 按Message ID查询死信消息.
     *
     * @param GetSofamqDlqbyidRequest $request
     *
     * @return GetSofamqDlqbyidResponse
     */
    public function getSofamqDlqbyid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSofamqDlqbyidEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
     * Summary: 按Message ID查询死信消息.
     *
     * @param GetSofamqDlqbyidRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetSofamqDlqbyidResponse
     */
    public function getSofamqDlqbyidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSofamqDlqbyidResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.dlqbyid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
     * 死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
     * Summary: 重新发送死信消息.
     *
     * @param ExecSofamqDlqresendbyidRequest $request
     *
     * @return ExecSofamqDlqresendbyidResponse
     */
    public function execSofamqDlqresendbyid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execSofamqDlqresendbyidEx($request, $headers, $runtime);
    }

    /**
     * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
     * 死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
     * Summary: 重新发送死信消息.
     *
     * @param ExecSofamqDlqresendbyidRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ExecSofamqDlqresendbyidResponse
     */
    public function execSofamqDlqresendbyidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecSofamqDlqresendbyidResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.dlqresendbyid.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: list ns
     * Summary: list ns.
     *
     * @param ListSofamqNamespaceRequest $request
     *
     * @return ListSofamqNamespaceResponse
     */
    public function listSofamqNamespace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqNamespaceEx($request, $headers, $runtime);
    }

    /**
     * Description: list ns
     * Summary: list ns.
     *
     * @param ListSofamqNamespaceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListSofamqNamespaceResponse
     */
    public function listSofamqNamespaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqNamespaceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.namespace.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发送测试消息
     * Summary: 发送测试信息.
     *
     * @param SendSofamqMessageRequest $request
     *
     * @return SendSofamqMessageResponse
     */
    public function sendSofamqMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendSofamqMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 发送测试消息
     * Summary: 发送测试信息.
     *
     * @param SendSofamqMessageRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SendSofamqMessageResponse
     */
    public function sendSofamqMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendSofamqMessageResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.message.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 消费验证
     * Summary: 消费验证
     *
     * @param PushSofamqMessageRequest $request
     *
     * @return PushSofamqMessageResponse
     */
    public function pushSofamqMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushSofamqMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 消费验证
     * Summary: 消费验证
     *
     * @param PushSofamqMessageRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PushSofamqMessageResponse
     */
    public function pushSofamqMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushSofamqMessageResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.message.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: getNodesByNamespaceId
     * Summary: get nodes by ns id.
     *
     * @param QuerySofamqNodebynamespaceidRequest $request
     *
     * @return QuerySofamqNodebynamespaceidResponse
     */
    public function querySofamqNodebynamespaceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqNodebynamespaceidEx($request, $headers, $runtime);
    }

    /**
     * Description: getNodesByNamespaceId
     * Summary: get nodes by ns id.
     *
     * @param QuerySofamqNodebynamespaceidRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QuerySofamqNodebynamespaceidResponse
     */
    public function querySofamqNodebynamespaceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqNodebynamespaceidResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.nodebynamespaceid.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query room by ns
     * Summary: query room by ns.
     *
     * @param QuerySofamqRoombynamespaceidRequest $request
     *
     * @return QuerySofamqRoombynamespaceidResponse
     */
    public function querySofamqRoombynamespaceid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqRoombynamespaceidEx($request, $headers, $runtime);
    }

    /**
     * Description: query room by ns
     * Summary: query room by ns.
     *
     * @param QuerySofamqRoombynamespaceidRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QuerySofamqRoombynamespaceidResponse
     */
    public function querySofamqRoombynamespaceidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqRoombynamespaceidResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.roombynamespaceid.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
     * Summary: 按Topic查询消息.
     *
     * @param QuerySofamqMessagebytopicRequest $request
     *
     * @return QuerySofamqMessagebytopicResponse
     */
    public function querySofamqMessagebytopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqMessagebytopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
     * Summary: 按Topic查询消息.
     *
     * @param QuerySofamqMessagebytopicRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QuerySofamqMessagebytopicResponse
     */
    public function querySofamqMessagebytopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqMessagebytopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.messagebytopic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
     * Summary: 按Group ID查询死信消息.
     *
     * @param QuerySofamqDlqbygroupidRequest $request
     *
     * @return QuerySofamqDlqbygroupidResponse
     */
    public function querySofamqDlqbygroupid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqDlqbygroupidEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
     * Summary: 按Group ID查询死信消息.
     *
     * @param QuerySofamqDlqbygroupidRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QuerySofamqDlqbygroupidResponse
     */
    public function querySofamqDlqbygroupidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqDlqbygroupidResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.dlqbygroupid.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
     * Summary: 查询消费状态
     *
     * @param GetSofamqConsumerstatusRequest $request
     *
     * @return GetSofamqConsumerstatusResponse
     */
    public function getSofamqConsumerstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSofamqConsumerstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
     * Summary: 查询消费状态
     *
     * @param GetSofamqConsumerstatusRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetSofamqConsumerstatusResponse
     */
    public function getSofamqConsumerstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSofamqConsumerstatusResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumerstatus.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新指定 Topic 的描述信息。
     * Summary: 更新Topic的描述.
     *
     * @param UpdateSofamqTopicremarkRequest $request
     *
     * @return UpdateSofamqTopicremarkResponse
     */
    public function updateSofamqTopicremark($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqTopicremarkEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新指定 Topic 的描述信息。
     * Summary: 更新Topic的描述.
     *
     * @param UpdateSofamqTopicremarkRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateSofamqTopicremarkResponse
     */
    public function updateSofamqTopicremarkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqTopicremarkResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.topicremark.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: datacenter list
     * Summary: datacenter.
     *
     * @param CreateSofamqDatacenterRequest $request
     *
     * @return CreateSofamqDatacenterResponse
     */
    public function createSofamqDatacenter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqDatacenterEx($request, $headers, $runtime);
    }

    /**
     * Description: datacenter list
     * Summary: datacenter.
     *
     * @param CreateSofamqDatacenterRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateSofamqDatacenterResponse
     */
    public function createSofamqDatacenterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqDatacenterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.datacenter.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: datacenter list
     * Summary: datacenter list.
     *
     * @param ListSofamqDatacenterRequest $request
     *
     * @return ListSofamqDatacenterResponse
     */
    public function listSofamqDatacenter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqDatacenterEx($request, $headers, $runtime);
    }

    /**
     * Description: datacenter list
     * Summary: datacenter list.
     *
     * @param ListSofamqDatacenterRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListSofamqDatacenterResponse
     */
    public function listSofamqDatacenterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqDatacenterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.datacenter.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: config list
     * Summary: config list.
     *
     * @param ListSofamqConfigRequest $request
     *
     * @return ListSofamqConfigResponse
     */
    public function listSofamqConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: config list
     * Summary: config list.
     *
     * @param ListSofamqConfigRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListSofamqConfigResponse
     */
    public function listSofamqConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqConfigResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.config.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新指定 Group 的描述信息。
     * Summary: 更新Group的描述.
     *
     * @param UpdateSofamqGroupremarkRequest $request
     *
     * @return UpdateSofamqGroupremarkResponse
     */
    public function updateSofamqGroupremark($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqGroupremarkEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新指定 Group 的描述信息。
     * Summary: 更新Group的描述.
     *
     * @param UpdateSofamqGroupremarkRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateSofamqGroupremarkResponse
     */
    public function updateSofamqGroupremarkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqGroupremarkResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.groupremark.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 下载消息
     * Summary: 下载消息.
     *
     * @param DownloadSofamqMessageRequest $request
     *
     * @return DownloadSofamqMessageResponse
     */
    public function downloadSofamqMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadSofamqMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 下载消息
     * Summary: 下载消息.
     *
     * @param DownloadSofamqMessageRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DownloadSofamqMessageResponse
     */
    public function downloadSofamqMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadSofamqMessageResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.message.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取指定或全部的 Topic 资源监控统计信息。
     * Summary: 获取 topic 统计信息.
     *
     * @param QueryMetricsTopicRequest $request
     *
     * @return QueryMetricsTopicResponse
     */
    public function queryMetricsTopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetricsTopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取指定或全部的 Topic 资源监控统计信息。
     * Summary: 获取 topic 统计信息.
     *
     * @param QueryMetricsTopicRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryMetricsTopicResponse
     */
    public function queryMetricsTopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetricsTopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.metrics.topic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定时间范围内的积压数据。
     * Summary: 查看积压数据.
     *
     * @param QueryMetricsBacklogRequest $request
     *
     * @return QueryMetricsBacklogResponse
     */
    public function queryMetricsBacklog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetricsBacklogEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定时间范围内的积压数据。
     * Summary: 查看积压数据.
     *
     * @param QueryMetricsBacklogRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryMetricsBacklogResponse
     */
    public function queryMetricsBacklogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetricsBacklogResponse::fromMap($this->doRequest('2.0', 'sofa.mq.metrics.backlog.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
     * Summary: 监控数据概览.
     *
     * @param QueryMetricsOverviewRequest $request
     *
     * @return QueryMetricsOverviewResponse
     */
    public function queryMetricsOverview($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetricsOverviewEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
     * Summary: 监控数据概览.
     *
     * @param QueryMetricsOverviewRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryMetricsOverviewResponse
     */
    public function queryMetricsOverviewEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetricsOverviewResponse::fromMap($this->doRequest('2.0', 'sofa.mq.metrics.overview.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询消息路由列表信息。
     * Summary: 查询路由列表.
     *
     * @param ListSofamqRouterRequest $request
     *
     * @return ListSofamqRouterResponse
     */
    public function listSofamqRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询消息路由列表信息。
     * Summary: 查询路由列表.
     *
     * @param ListSofamqRouterRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListSofamqRouterResponse
     */
    public function listSofamqRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqRouterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.router.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一个消息路由任务。
     * Summary: 创建路由.
     *
     * @param CreateSofamqRouterRequest $request
     *
     * @return CreateSofamqRouterResponse
     */
    public function createSofamqRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个消息路由任务。
     * Summary: 创建路由.
     *
     * @param CreateSofamqRouterRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateSofamqRouterResponse
     */
    public function createSofamqRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqRouterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.router.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: delete node
     * Summary: delete node.
     *
     * @param DeleteSofamqNodeRequest $request
     *
     * @return DeleteSofamqNodeResponse
     */
    public function deleteSofamqNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: delete node
     * Summary: delete node.
     *
     * @param DeleteSofamqNodeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteSofamqNodeResponse
     */
    public function deleteSofamqNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqNodeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.node.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: delete room
     * Summary: delete room.
     *
     * @param DeleteSofamqRoomRequest $request
     *
     * @return DeleteSofamqRoomResponse
     */
    public function deleteSofamqRoom($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqRoomEx($request, $headers, $runtime);
    }

    /**
     * Description: delete room
     * Summary: delete room.
     *
     * @param DeleteSofamqRoomRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteSofamqRoomResponse
     */
    public function deleteSofamqRoomEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqRoomResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.room.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: del cell
     * Summary: del cell.
     *
     * @param DeleteSofamqCellRequest $request
     *
     * @return DeleteSofamqCellResponse
     */
    public function deleteSofamqCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqCellEx($request, $headers, $runtime);
    }

    /**
     * Description: del cell
     * Summary: del cell.
     *
     * @param DeleteSofamqCellRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteSofamqCellResponse
     */
    public function deleteSofamqCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqCellResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.cell.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: del cluster
     * Summary: del cluster.
     *
     * @param DeleteSofamqClusterRequest $request
     *
     * @return DeleteSofamqClusterResponse
     */
    public function deleteSofamqCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: del cluster
     * Summary: del cluster.
     *
     * @param DeleteSofamqClusterRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteSofamqClusterResponse
     */
    public function deleteSofamqClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqClusterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.cluster.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: del ns
     * Summary: del ns.
     *
     * @param DeleteSofamqNamespaceRequest $request
     *
     * @return DeleteSofamqNamespaceResponse
     */
    public function deleteSofamqNamespace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqNamespaceEx($request, $headers, $runtime);
    }

    /**
     * Description: del ns
     * Summary: del ns.
     *
     * @param DeleteSofamqNamespaceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteSofamqNamespaceResponse
     */
    public function deleteSofamqNamespaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqNamespaceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.namespace.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: del dc
     * Summary: del dc.
     *
     * @param DeleteSofamqDatacenterRequest $request
     *
     * @return DeleteSofamqDatacenterResponse
     */
    public function deleteSofamqDatacenter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqDatacenterEx($request, $headers, $runtime);
    }

    /**
     * Description: del dc
     * Summary: del dc.
     *
     * @param DeleteSofamqDatacenterRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteSofamqDatacenterResponse
     */
    public function deleteSofamqDatacenterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqDatacenterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.datacenter.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除指定的消息路由任务。
     * Summary: 删除路由.
     *
     * @param DeleteSofamqRouterRequest $request
     *
     * @return DeleteSofamqRouterResponse
     */
    public function deleteSofamqRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除指定的消息路由任务。
     * Summary: 删除路由.
     *
     * @param DeleteSofamqRouterRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteSofamqRouterResponse
     */
    public function deleteSofamqRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqRouterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.router.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: create config
     * Summary: create config.
     *
     * @param CreateSofamqConfigRequest $request
     *
     * @return CreateSofamqConfigResponse
     */
    public function createSofamqConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: create config
     * Summary: create config.
     *
     * @param CreateSofamqConfigRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateSofamqConfigResponse
     */
    public function createSofamqConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqConfigResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.config.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query cells
     * Summary: query cells.
     *
     * @param QuerySofamqCellRequest $request
     *
     * @return QuerySofamqCellResponse
     */
    public function querySofamqCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqCellEx($request, $headers, $runtime);
    }

    /**
     * Description: query cells
     * Summary: query cells.
     *
     * @param QuerySofamqCellRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QuerySofamqCellResponse
     */
    public function querySofamqCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqCellResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.cell.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询路由
     * Summary: 查询路由.
     *
     * @param QuerySofamqRouterRequest $request
     *
     * @return QuerySofamqRouterResponse
     */
    public function querySofamqRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询路由
     * Summary: 查询路由.
     *
     * @param QuerySofamqRouterRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QuerySofamqRouterResponse
     */
    public function querySofamqRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqRouterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.router.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: get instance
     * Summary: get instance.
     *
     * @param GetMiddlewareInstanceRequest $request
     *
     * @return GetMiddlewareInstanceResponse
     */
    public function getMiddlewareInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMiddlewareInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: get instance
     * Summary: get instance.
     *
     * @param GetMiddlewareInstanceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetMiddlewareInstanceResponse
     */
    public function getMiddlewareInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMiddlewareInstanceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.middleware.instance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: get endpoint
     * Summary: get endpoint.
     *
     * @param GetMiddlewareEndpointRequest $request
     *
     * @return GetMiddlewareEndpointResponse
     */
    public function getMiddlewareEndpoint($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMiddlewareEndpointEx($request, $headers, $runtime);
    }

    /**
     * Description: get endpoint
     * Summary: get endpoint.
     *
     * @param GetMiddlewareEndpointRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetMiddlewareEndpointResponse
     */
    public function getMiddlewareEndpointEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMiddlewareEndpointResponse::fromMap($this->doRequest('2.0', 'sofa.mq.middleware.endpoint.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: cellbytype
     * Summary: cellbytype.
     *
     * @param QuerySofamqCellbytypeRequest $request
     *
     * @return QuerySofamqCellbytypeResponse
     */
    public function querySofamqCellbytype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqCellbytypeEx($request, $headers, $runtime);
    }

    /**
     * Description: cellbytype
     * Summary: cellbytype.
     *
     * @param QuerySofamqCellbytypeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QuerySofamqCellbytypeResponse
     */
    public function querySofamqCellbytypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqCellbytypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.cellbytype.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定实例下的消息轨迹查询任务列表信息。
     * Summary: 查询trace请求列表.
     *
     * @param ListSofamqTraceRequest $request
     *
     * @return ListSofamqTraceResponse
     */
    public function listSofamqTrace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqTraceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定实例下的消息轨迹查询任务列表信息。
     * Summary: 查询trace请求列表.
     *
     * @param ListSofamqTraceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListSofamqTraceResponse
     */
    public function listSofamqTraceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqTraceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.trace.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除指定的消息轨迹查询任务。
     * Summary: 删除trace查询任务
     *
     * @param DeleteSofamqTraceRequest $request
     *
     * @return DeleteSofamqTraceResponse
     */
    public function deleteSofamqTrace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqTraceEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除指定的消息轨迹查询任务。
     * Summary: 删除trace查询任务
     *
     * @param DeleteSofamqTraceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteSofamqTraceResponse
     */
    public function deleteSofamqTraceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqTraceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.trace.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
     * Summary: 通过Topic创建轨迹查询任务
     *
     * @param QuerySofamqTracebytopicRequest $request
     *
     * @return QuerySofamqTracebytopicResponse
     */
    public function querySofamqTracebytopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqTracebytopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
     * Summary: 通过Topic创建轨迹查询任务
     *
     * @param QuerySofamqTracebytopicRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QuerySofamqTracebytopicResponse
     */
    public function querySofamqTracebytopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqTracebytopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.tracebytopic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: sofamq 支付后回调
     * Summary: sofamq 支付后回调.
     *
     * @param PushSpiPaycallbackRequest $request
     *
     * @return PushSpiPaycallbackResponse
     */
    public function pushSpiPaycallback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushSpiPaycallbackEx($request, $headers, $runtime);
    }

    /**
     * Description: sofamq 支付后回调
     * Summary: sofamq 支付后回调.
     *
     * @param PushSpiPaycallbackRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PushSpiPaycallbackResponse
     */
    public function pushSpiPaycallbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushSpiPaycallbackResponse::fromMap($this->doRequest('2.0', 'sofa.mq.spi.paycallback.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 补全商品信息
     * Summary: 补全商品信息.
     *
     * @param PushSpiCompletecommodityRequest $request
     *
     * @return PushSpiCompletecommodityResponse
     */
    public function pushSpiCompletecommodity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushSpiCompletecommodityEx($request, $headers, $runtime);
    }

    /**
     * Description: 补全商品信息
     * Summary: 补全商品信息.
     *
     * @param PushSpiCompletecommodityRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PushSpiCompletecommodityResponse
     */
    public function pushSpiCompletecommodityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushSpiCompletecommodityResponse::fromMap($this->doRequest('2.0', 'sofa.mq.spi.completecommodity.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 订单校验
     * Summary: 订单校验.
     *
     * @param PushSpiOrderverifyRequest $request
     *
     * @return PushSpiOrderverifyResponse
     */
    public function pushSpiOrderverify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushSpiOrderverifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 订单校验
     * Summary: 订单校验.
     *
     * @param PushSpiOrderverifyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PushSpiOrderverifyResponse
     */
    public function pushSpiOrderverifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushSpiOrderverifyResponse::fromMap($this->doRequest('2.0', 'sofa.mq.spi.orderverify.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生命周期回调
     * Summary: 生命周期回调.
     *
     * @param PushSpiOpencallbackRequest $request
     *
     * @return PushSpiOpencallbackResponse
     */
    public function pushSpiOpencallback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushSpiOpencallbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 生命周期回调
     * Summary: 生命周期回调.
     *
     * @param PushSpiOpencallbackRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PushSpiOpencallbackResponse
     */
    public function pushSpiOpencallbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushSpiOpencallbackResponse::fromMap($this->doRequest('2.0', 'sofa.mq.spi.opencallback.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: getldcbynamespace
     * Summary: getldcbynamespace.
     *
     * @param GetSofamqLdcbynamespaceRequest $request
     *
     * @return GetSofamqLdcbynamespaceResponse
     */
    public function getSofamqLdcbynamespace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSofamqLdcbynamespaceEx($request, $headers, $runtime);
    }

    /**
     * Description: getldcbynamespace
     * Summary: getldcbynamespace.
     *
     * @param GetSofamqLdcbynamespaceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetSofamqLdcbynamespaceResponse
     */
    public function getSofamqLdcbynamespaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSofamqLdcbynamespaceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.ldcbynamespace.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新指定的消息路由任务的配置信息。
     * Summary: 更新路由配置.
     *
     * @param UpdateSofamqRouterRequest $request
     *
     * @return UpdateSofamqRouterResponse
     */
    public function updateSofamqRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新指定的消息路由任务的配置信息。
     * Summary: 更新路由配置.
     *
     * @param UpdateSofamqRouterRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateSofamqRouterResponse
     */
    public function updateSofamqRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqRouterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.router.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
     * Summary: 批量重发死信消息.
     *
     * @param ExecSofamqDlqresendbatchRequest $request
     *
     * @return ExecSofamqDlqresendbatchResponse
     */
    public function execSofamqDlqresendbatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execSofamqDlqresendbatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
     * Summary: 批量重发死信消息.
     *
     * @param ExecSofamqDlqresendbatchRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ExecSofamqDlqresendbatchResponse
     */
    public function execSofamqDlqresendbatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecSofamqDlqresendbatchResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.dlqresendbatch.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取报警规则列表信息。
     * Summary: 获取告警列表.
     *
     * @param ListSofamqWarnRequest $request
     *
     * @return ListSofamqWarnResponse
     */
    public function listSofamqWarn($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqWarnEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取报警规则列表信息。
     * Summary: 获取告警列表.
     *
     * @param ListSofamqWarnRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListSofamqWarnResponse
     */
    public function listSofamqWarnEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqWarnResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.warn.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一条报警规则。
     * Summary: 创建告警规则.
     *
     * @param CreateSofamqWarnRequest $request
     *
     * @return CreateSofamqWarnResponse
     */
    public function createSofamqWarn($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqWarnEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一条报警规则。
     * Summary: 创建告警规则.
     *
     * @param CreateSofamqWarnRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateSofamqWarnResponse
     */
    public function createSofamqWarnEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqWarnResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.warn.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过传入报警规则 ID，删除指定的报警规则。
     * Summary: 删除告警规则.
     *
     * @param DeleteSofamqWarnRequest $request
     *
     * @return DeleteSofamqWarnResponse
     */
    public function deleteSofamqWarn($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqWarnEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过传入报警规则 ID，删除指定的报警规则。
     * Summary: 删除告警规则.
     *
     * @param DeleteSofamqWarnRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteSofamqWarnResponse
     */
    public function deleteSofamqWarnEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqWarnResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.warn.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新指定报警规则的配置信息。
     * Summary: 更新告警规则.
     *
     * @param UpdateSofamqWarnRequest $request
     *
     * @return UpdateSofamqWarnResponse
     */
    public function updateSofamqWarn($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqWarnEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新指定报警规则的配置信息。
     * Summary: 更新告警规则.
     *
     * @param UpdateSofamqWarnRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateSofamqWarnResponse
     */
    public function updateSofamqWarnEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqWarnResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.warn.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过传入报警规则 ID，启用指定的报警规则。
     * Summary: 打开告警开关.
     *
     * @param EnableSofamqWarnRequest $request
     *
     * @return EnableSofamqWarnResponse
     */
    public function enableSofamqWarn($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSofamqWarnEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过传入报警规则 ID，启用指定的报警规则。
     * Summary: 打开告警开关.
     *
     * @param EnableSofamqWarnRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return EnableSofamqWarnResponse
     */
    public function enableSofamqWarnEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSofamqWarnResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.warn.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过传入报警规则 ID，禁用指定的报警规则。
     * Summary: 关闭告警开关.
     *
     * @param DisableSofamqWarnRequest $request
     *
     * @return DisableSofamqWarnResponse
     */
    public function disableSofamqWarn($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableSofamqWarnEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过传入报警规则 ID，禁用指定的报警规则。
     * Summary: 关闭告警开关.
     *
     * @param DisableSofamqWarnRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DisableSofamqWarnResponse
     */
    public function disableSofamqWarnEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableSofamqWarnResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.warn.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
     * Summary: 查询告警日志.
     *
     * @param ListSofamqWarnlogRequest $request
     *
     * @return ListSofamqWarnlogResponse
     */
    public function listSofamqWarnlog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqWarnlogEx($request, $headers, $runtime);
    }

    /**
     * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
     * Summary: 查询告警日志.
     *
     * @param ListSofamqWarnlogRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListSofamqWarnlogResponse
     */
    public function listSofamqWarnlogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqWarnlogResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.warnlog.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 管理员查看topic
     * Summary: 管理员查看topic.
     *
     * @param ListSofamqAdmintopicRequest $request
     *
     * @return ListSofamqAdmintopicResponse
     */
    public function listSofamqAdmintopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqAdmintopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 管理员查看topic
     * Summary: 管理员查看topic.
     *
     * @param ListSofamqAdmintopicRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListSofamqAdmintopicResponse
     */
    public function listSofamqAdmintopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqAdmintopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.admintopic.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询 Topic、Group 实时的发送消费速度。
     * Summary: topicgroup实时的发送消费速度.
     *
     * @param QueryMetricsTginstantRequest $request
     *
     * @return QueryMetricsTginstantResponse
     */
    public function queryMetricsTginstant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetricsTginstantEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询 Topic、Group 实时的发送消费速度。
     * Summary: topicgroup实时的发送消费速度.
     *
     * @param QueryMetricsTginstantRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryMetricsTginstantResponse
     */
    public function queryMetricsTginstantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetricsTginstantResponse::fromMap($this->doRequest('2.0', 'sofa.mq.metrics.tginstant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
     * Summary: 获取 topic、group 的历史数据.
     *
     * @param QueryMetricsTghistoryRequest $request
     *
     * @return QueryMetricsTghistoryResponse
     */
    public function queryMetricsTghistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetricsTghistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
     * Summary: 获取 topic、group 的历史数据.
     *
     * @param QueryMetricsTghistoryRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryMetricsTghistoryResponse
     */
    public function queryMetricsTghistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetricsTghistoryResponse::fromMap($this->doRequest('2.0', 'sofa.mq.metrics.tghistory.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
     * Summary: 获取实例的基本信息.
     *
     * @param QueryMetricsInstanceRequest $request
     *
     * @return QueryMetricsInstanceResponse
     */
    public function queryMetricsInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetricsInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
     * Summary: 获取实例的基本信息.
     *
     * @param QueryMetricsInstanceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryMetricsInstanceResponse
     */
    public function queryMetricsInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetricsInstanceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.metrics.instance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
     * Summary: 获取实例的历史统计数据.
     *
     * @param QueryMetricsInstancehistoryRequest $request
     *
     * @return QueryMetricsInstancehistoryResponse
     */
    public function queryMetricsInstancehistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetricsInstancehistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
     * Summary: 获取实例的历史统计数据.
     *
     * @param QueryMetricsInstancehistoryRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryMetricsInstancehistoryResponse
     */
    public function queryMetricsInstancehistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetricsInstancehistoryResponse::fromMap($this->doRequest('2.0', 'sofa.mq.metrics.instancehistory.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定实例下 Topic 的统计列表信息。
     * Summary: 查询 topic 统计列表.
     *
     * @param QueryStatsTopicRequest $request
     *
     * @return QueryStatsTopicResponse
     */
    public function queryStatsTopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStatsTopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定实例下 Topic 的统计列表信息。
     * Summary: 查询 topic 统计列表.
     *
     * @param QueryStatsTopicRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryStatsTopicResponse
     */
    public function queryStatsTopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStatsTopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.stats.topic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取指定实例下 Group 的统计信息。
     * Summary: 获取当前实例的 group 统计信息.
     *
     * @param QueryStatsGroupRequest $request
     *
     * @return QueryStatsGroupResponse
     */
    public function queryStatsGroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStatsGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取指定实例下 Group 的统计信息。
     * Summary: 获取当前实例的 group 统计信息.
     *
     * @param QueryStatsGroupRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryStatsGroupResponse
     */
    public function queryStatsGroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStatsGroupResponse::fromMap($this->doRequest('2.0', 'sofa.mq.stats.group.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 管理员查看group
     * Summary: 管理员查看group.
     *
     * @param ListSofamqAdmingroupRequest $request
     *
     * @return ListSofamqAdmingroupResponse
     */
    public function listSofamqAdmingroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqAdmingroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 管理员查看group
     * Summary: 管理员查看group.
     *
     * @param ListSofamqAdmingroupRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListSofamqAdmingroupResponse
     */
    public function listSofamqAdmingroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqAdmingroupResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.admingroup.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询kv配置
     * Summary: 查询kv配置.
     *
     * @param ListSofamqKvconfigRequest $request
     *
     * @return ListSofamqKvconfigResponse
     */
    public function listSofamqKvconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqKvconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询kv配置
     * Summary: 查询kv配置.
     *
     * @param ListSofamqKvconfigRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListSofamqKvconfigResponse
     */
    public function listSofamqKvconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqKvconfigResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.kvconfig.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建kvconfig
     * Summary: 创建kvconfig.
     *
     * @param CreateSofamqKvconfigRequest $request
     *
     * @return CreateSofamqKvconfigResponse
     */
    public function createSofamqKvconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqKvconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建kvconfig
     * Summary: 创建kvconfig.
     *
     * @param CreateSofamqKvconfigRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateSofamqKvconfigResponse
     */
    public function createSofamqKvconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqKvconfigResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.kvconfig.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除kvconfig
     * Summary: 删除kvconfig.
     *
     * @param DeleteSofamqKvconfigRequest $request
     *
     * @return DeleteSofamqKvconfigResponse
     */
    public function deleteSofamqKvconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqKvconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除kvconfig
     * Summary: 删除kvconfig.
     *
     * @param DeleteSofamqKvconfigRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteSofamqKvconfigResponse
     */
    public function deleteSofamqKvconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqKvconfigResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.kvconfig.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改kvconfig值
     * Summary: 修改kvconfig值
     *
     * @param UpdateSofamqKvconfigRequest $request
     *
     * @return UpdateSofamqKvconfigResponse
     */
    public function updateSofamqKvconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqKvconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改kvconfig值
     * Summary: 修改kvconfig值
     *
     * @param UpdateSofamqKvconfigRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateSofamqKvconfigResponse
     */
    public function updateSofamqKvconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqKvconfigResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.kvconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除config配置
     * Summary: 删除config配置.
     *
     * @param DeleteSofamqConfigRequest $request
     *
     * @return DeleteSofamqConfigResponse
     */
    public function deleteSofamqConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除config配置
     * Summary: 删除config配置.
     *
     * @param DeleteSofamqConfigRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteSofamqConfigResponse
     */
    public function deleteSofamqConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqConfigResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.config.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新config配置
     * Summary: 更新config配置.
     *
     * @param UpdateSofamqConfigRequest $request
     *
     * @return UpdateSofamqConfigResponse
     */
    public function updateSofamqConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新config配置
     * Summary: 更新config配置.
     *
     * @param UpdateSofamqConfigRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateSofamqConfigResponse
     */
    public function updateSofamqConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqConfigResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.config.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update cluster
     * Summary: update cluster.
     *
     * @param UpdateSofamqClusterRequest $request
     *
     * @return UpdateSofamqClusterResponse
     */
    public function updateSofamqCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: update cluster
     * Summary: update cluster.
     *
     * @param UpdateSofamqClusterRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateSofamqClusterResponse
     */
    public function updateSofamqClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqClusterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.cluster.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update dc
     * Summary: update dc.
     *
     * @param UpdateSofamqDatacenterRequest $request
     *
     * @return UpdateSofamqDatacenterResponse
     */
    public function updateSofamqDatacenter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqDatacenterEx($request, $headers, $runtime);
    }

    /**
     * Description: update dc
     * Summary: update dc.
     *
     * @param UpdateSofamqDatacenterRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateSofamqDatacenterResponse
     */
    public function updateSofamqDatacenterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqDatacenterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.datacenter.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update room
     * Summary: update room.
     *
     * @param UpdateSofamqRoomRequest $request
     *
     * @return UpdateSofamqRoomResponse
     */
    public function updateSofamqRoom($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqRoomEx($request, $headers, $runtime);
    }

    /**
     * Description: update room
     * Summary: update room.
     *
     * @param UpdateSofamqRoomRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateSofamqRoomResponse
     */
    public function updateSofamqRoomEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqRoomResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.room.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update node
     * Summary: update node.
     *
     * @param UpdateSofamqNodeRequest $request
     *
     * @return UpdateSofamqNodeResponse
     */
    public function updateSofamqNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: update node
     * Summary: update node.
     *
     * @param UpdateSofamqNodeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateSofamqNodeResponse
     */
    public function updateSofamqNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqNodeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.node.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定的 Topic 的队列信息。
     * Summary: 查询topic的队列信息.
     *
     * @param QuerySofamqTopicqueueRequest $request
     *
     * @return QuerySofamqTopicqueueResponse
     */
    public function querySofamqTopicqueue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqTopicqueueEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定的 Topic 的队列信息。
     * Summary: 查询topic的队列信息.
     *
     * @param QuerySofamqTopicqueueRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QuerySofamqTopicqueueResponse
     */
    public function querySofamqTopicqueueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqTopicqueueResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.topicqueue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看在线订阅topic
     * Summary: 查看在线订阅topic.
     *
     * @param QuerySofamqAdmingroupsubdetailRequest $request
     *
     * @return QuerySofamqAdmingroupsubdetailResponse
     */
    public function querySofamqAdmingroupsubdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqAdmingroupsubdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看在线订阅topic
     * Summary: 查看在线订阅topic.
     *
     * @param QuerySofamqAdmingroupsubdetailRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QuerySofamqAdmingroupsubdetailResponse
     */
    public function querySofamqAdmingroupsubdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqAdmingroupsubdetailResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.admingroupsubdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 管理员列表
     * Summary: 管理员列表.
     *
     * @param ListSofamqAdminuserRequest $request
     *
     * @return ListSofamqAdminuserResponse
     */
    public function listSofamqAdminuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqAdminuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 管理员列表
     * Summary: 管理员列表.
     *
     * @param ListSofamqAdminuserRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListSofamqAdminuserResponse
     */
    public function listSofamqAdminuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqAdminuserResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.adminuser.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加用户
     * Summary: 添加用户.
     *
     * @param CreateSofamqAdminuserRequest $request
     *
     * @return CreateSofamqAdminuserResponse
     */
    public function createSofamqAdminuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqAdminuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加用户
     * Summary: 添加用户.
     *
     * @param CreateSofamqAdminuserRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateSofamqAdminuserResponse
     */
    public function createSofamqAdminuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqAdminuserResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.adminuser.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除管理员用户
     * Summary: 删除管理员用户.
     *
     * @param DeleteSofamqAdminuserRequest $request
     *
     * @return DeleteSofamqAdminuserResponse
     */
    public function deleteSofamqAdminuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqAdminuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除管理员用户
     * Summary: 删除管理员用户.
     *
     * @param DeleteSofamqAdminuserRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteSofamqAdminuserResponse
     */
    public function deleteSofamqAdminuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqAdminuserResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.adminuser.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户侧接口列表
     * Summary: 查询用户侧接口列表.
     *
     * @param ListSofamqAdminapiRequest $request
     *
     * @return ListSofamqAdminapiResponse
     */
    public function listSofamqAdminapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqAdminapiEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户侧接口列表
     * Summary: 查询用户侧接口列表.
     *
     * @param ListSofamqAdminapiRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListSofamqAdminapiResponse
     */
    public function listSofamqAdminapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqAdminapiResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.adminapi.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api权限更新
     * Summary: api权限更新.
     *
     * @param SwitchSofamqAdminapiRequest $request
     *
     * @return SwitchSofamqAdminapiResponse
     */
    public function switchSofamqAdminapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->switchSofamqAdminapiEx($request, $headers, $runtime);
    }

    /**
     * Description: api权限更新
     * Summary: api权限更新.
     *
     * @param SwitchSofamqAdminapiRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SwitchSofamqAdminapiResponse
     */
    public function switchSofamqAdminapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SwitchSofamqAdminapiResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.adminapi.switch', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param AddDmsMsgtypeRequest $request
     *
     * @return AddDmsMsgtypeResponse
     */
    public function addDmsMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDmsMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param AddDmsMsgtypeRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AddDmsMsgtypeResponse
     */
    public function addDmsMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDmsMsgtypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msgtype.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ListDmsMsgtypeRequest $request
     *
     * @return ListDmsMsgtypeResponse
     */
    public function listDmsMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDmsMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ListDmsMsgtypeRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListDmsMsgtypeResponse
     */
    public function listDmsMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDmsMsgtypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msgtype.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param CreateDmsBindingRequest $request
     *
     * @return CreateDmsBindingResponse
     */
    public function createDmsBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDmsBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param CreateDmsBindingRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateDmsBindingResponse
     */
    public function createDmsBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDmsBindingResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.binding.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ListDmsBindingRequest $request
     *
     * @return ListDmsBindingResponse
     */
    public function listDmsBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDmsBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ListDmsBindingRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListDmsBindingResponse
     */
    public function listDmsBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDmsBindingResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.binding.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param DeleteDmsMsgtypeRequest $request
     *
     * @return DeleteDmsMsgtypeResponse
     */
    public function deleteDmsMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDmsMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param DeleteDmsMsgtypeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteDmsMsgtypeResponse
     */
    public function deleteDmsMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDmsMsgtypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msgtype.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param DeleteDmsBindingRequest $request
     *
     * @return DeleteDmsBindingResponse
     */
    public function deleteDmsBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDmsBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param DeleteDmsBindingRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteDmsBindingResponse
     */
    public function deleteDmsBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDmsBindingResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.binding.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param UpdateDmsMsgtypeRequest $request
     *
     * @return UpdateDmsMsgtypeResponse
     */
    public function updateDmsMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDmsMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param UpdateDmsMsgtypeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateDmsMsgtypeResponse
     */
    public function updateDmsMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDmsMsgtypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msgtype.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param UpdateDmsBindingRequest $request
     *
     * @return UpdateDmsBindingResponse
     */
    public function updateDmsBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDmsBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param UpdateDmsBindingRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateDmsBindingResponse
     */
    public function updateDmsBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDmsBindingResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.binding.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param QueryDmsMsgRequest $request
     *
     * @return QueryDmsMsgResponse
     */
    public function queryDmsMsg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDmsMsgEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param QueryDmsMsgRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryDmsMsgResponse
     */
    public function queryDmsMsgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDmsMsgResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msg.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param BatchqueryDmsMsgRequest $request
     *
     * @return BatchqueryDmsMsgResponse
     */
    public function batchqueryDmsMsg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryDmsMsgEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param BatchqueryDmsMsgRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return BatchqueryDmsMsgResponse
     */
    public function batchqueryDmsMsgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryDmsMsgResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msg.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param DeleteDmsMsgRequest $request
     *
     * @return DeleteDmsMsgResponse
     */
    public function deleteDmsMsg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDmsMsgEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param DeleteDmsMsgRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return DeleteDmsMsgResponse
     */
    public function deleteDmsMsgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDmsMsgResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msg.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param BatchdeleteDmsMsgRequest $request
     *
     * @return BatchdeleteDmsMsgResponse
     */
    public function batchdeleteDmsMsg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteDmsMsgEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param BatchdeleteDmsMsgRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return BatchdeleteDmsMsgResponse
     */
    public function batchdeleteDmsMsgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteDmsMsgResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msg.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ExportDmsMsgtypeRequest $request
     *
     * @return ExportDmsMsgtypeResponse
     */
    public function exportDmsMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportDmsMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ExportDmsMsgtypeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ExportDmsMsgtypeResponse
     */
    public function exportDmsMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportDmsMsgtypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msgtype.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ImportDmsMsgtypeRequest $request
     *
     * @return ImportDmsMsgtypeResponse
     */
    public function importDmsMsgtype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importDmsMsgtypeEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ImportDmsMsgtypeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportDmsMsgtypeResponse
     */
    public function importDmsMsgtypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportDmsMsgtypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msgtype.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ExportDmsBindingRequest $request
     *
     * @return ExportDmsBindingResponse
     */
    public function exportDmsBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportDmsBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ExportDmsBindingRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ExportDmsBindingResponse
     */
    public function exportDmsBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportDmsBindingResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.binding.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ImportDmsBindingRequest $request
     *
     * @return ImportDmsBindingResponse
     */
    public function importDmsBinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importDmsBindingEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ImportDmsBindingRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportDmsBindingResponse
     */
    public function importDmsBindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportDmsBindingResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.binding.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ListDmsWhitelistRequest $request
     *
     * @return ListDmsWhitelistResponse
     */
    public function listDmsWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDmsWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param ListDmsWhitelistRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListDmsWhitelistResponse
     */
    public function listDmsWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDmsWhitelistResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.whitelist.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param AddDmsWhitelistRequest $request
     *
     * @return AddDmsWhitelistResponse
     */
    public function addDmsWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDmsWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param AddDmsWhitelistRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddDmsWhitelistResponse
     */
    public function addDmsWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDmsWhitelistResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.whitelist.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param DeleteDmsWhitelistRequest $request
     *
     * @return DeleteDmsWhitelistResponse
     */
    public function deleteDmsWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDmsWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: dms
     * Summary: dms.
     *
     * @param DeleteDmsWhitelistRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteDmsWhitelistResponse
     */
    public function deleteDmsWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDmsWhitelistResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.whitelist.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: admin
     * Summary: topics.
     *
     * @param GetDmsTopicsRequest $request
     *
     * @return GetDmsTopicsResponse
     */
    public function getDmsTopics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDmsTopicsEx($request, $headers, $runtime);
    }

    /**
     * Description: admin
     * Summary: topics.
     *
     * @param GetDmsTopicsRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetDmsTopicsResponse
     */
    public function getDmsTopicsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDmsTopicsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.topics.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询消费者堆栈信息，便于定位问题。
     * Summary: 查询消费者堆栈信息.
     *
     * @param GetSofamqConsumerjstackRequest $request
     *
     * @return GetSofamqConsumerjstackResponse
     */
    public function getSofamqConsumerjstack($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSofamqConsumerjstackEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询消费者堆栈信息，便于定位问题。
     * Summary: 查询消费者堆栈信息.
     *
     * @param GetSofamqConsumerjstackRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetSofamqConsumerjstackResponse
     */
    public function getSofamqConsumerjstackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSofamqConsumerjstackResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumerjstack.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: uploadurl
     * Summary: uploadurl.
     *
     * @param QueryDmsUploadurlRequest $request
     *
     * @return QueryDmsUploadurlResponse
     */
    public function queryDmsUploadurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDmsUploadurlEx($request, $headers, $runtime);
    }

    /**
     * Description: uploadurl
     * Summary: uploadurl.
     *
     * @param QueryDmsUploadurlRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryDmsUploadurlResponse
     */
    public function queryDmsUploadurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDmsUploadurlResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.uploadurl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: msgtypetemplate
     * Summary: msgtypetemplate.
     *
     * @param GetDmsMsgtypetemplateRequest $request
     *
     * @return GetDmsMsgtypetemplateResponse
     */
    public function getDmsMsgtypetemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDmsMsgtypetemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: msgtypetemplate
     * Summary: msgtypetemplate.
     *
     * @param GetDmsMsgtypetemplateRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetDmsMsgtypetemplateResponse
     */
    public function getDmsMsgtypetemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDmsMsgtypetemplateResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.msgtypetemplate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: template
     * Summary: template.
     *
     * @param GetDmsBindingtemplateRequest $request
     *
     * @return GetDmsBindingtemplateResponse
     */
    public function getDmsBindingtemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDmsBindingtemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: template
     * Summary: template.
     *
     * @param GetDmsBindingtemplateRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetDmsBindingtemplateResponse
     */
    public function getDmsBindingtemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDmsBindingtemplateResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.bindingtemplate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询msgdump消息同步任务源端资源
     * Summary: 查询msgdump消息同步任务源端资源.
     *
     * @param QueryMsgdumpSourceRequest $request
     *
     * @return QueryMsgdumpSourceResponse
     */
    public function queryMsgdumpSource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMsgdumpSourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询msgdump消息同步任务源端资源
     * Summary: 查询msgdump消息同步任务源端资源.
     *
     * @param QueryMsgdumpSourceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryMsgdumpSourceResponse
     */
    public function queryMsgdumpSourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMsgdumpSourceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.msgdump.source.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建 msgdump 同步任务
     * Summary: 创建同步任务
     *
     * @param CreateMsgdumpTaskRequest $request
     *
     * @return CreateMsgdumpTaskResponse
     */
    public function createMsgdumpTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMsgdumpTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建 msgdump 同步任务
     * Summary: 创建同步任务
     *
     * @param CreateMsgdumpTaskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateMsgdumpTaskResponse
     */
    public function createMsgdumpTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMsgdumpTaskResponse::fromMap($this->doRequest('2.0', 'sofa.mq.msgdump.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询消息同步任务
     * Summary: 查询消息同步任务
     *
     * @param QueryMsgdumpTaskRequest $request
     *
     * @return QueryMsgdumpTaskResponse
     */
    public function queryMsgdumpTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMsgdumpTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询消息同步任务
     * Summary: 查询消息同步任务
     *
     * @param QueryMsgdumpTaskRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryMsgdumpTaskResponse
     */
    public function queryMsgdumpTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMsgdumpTaskResponse::fromMap($this->doRequest('2.0', 'sofa.mq.msgdump.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除 msgdump 任务
     * Summary: 删除 msgdump 任务
     *
     * @param DeleteMsgdumpTaskRequest $request
     *
     * @return DeleteMsgdumpTaskResponse
     */
    public function deleteMsgdumpTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMsgdumpTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除 msgdump 任务
     * Summary: 删除 msgdump 任务
     *
     * @param DeleteMsgdumpTaskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteMsgdumpTaskResponse
     */
    public function deleteMsgdumpTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMsgdumpTaskResponse::fromMap($this->doRequest('2.0', 'sofa.mq.msgdump.task.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新msgdump任务状态
     * Summary: 更新msgdump任务状态
     *
     * @param EnableMsgdumpTaskRequest $request
     *
     * @return EnableMsgdumpTaskResponse
     */
    public function enableMsgdumpTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableMsgdumpTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新msgdump任务状态
     * Summary: 更新msgdump任务状态
     *
     * @param EnableMsgdumpTaskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return EnableMsgdumpTaskResponse
     */
    public function enableMsgdumpTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableMsgdumpTaskResponse::fromMap($this->doRequest('2.0', 'sofa.mq.msgdump.task.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: schema metadata 分页查询
     * Summary: schema metadata 分页查询.
     *
     * @param ListSchemaAdminmetadataRequest $request
     *
     * @return ListSchemaAdminmetadataResponse
     */
    public function listSchemaAdminmetadata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSchemaAdminmetadataEx($request, $headers, $runtime);
    }

    /**
     * Description: schema metadata 分页查询
     * Summary: schema metadata 分页查询.
     *
     * @param ListSchemaAdminmetadataRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListSchemaAdminmetadataResponse
     */
    public function listSchemaAdminmetadataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSchemaAdminmetadataResponse::fromMap($this->doRequest('2.0', 'sofa.mq.schema.adminmetadata.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增schema的metadata信息
     * Summary: 新增schema的metadata信息.
     *
     * @param CreateSchemaAdminmetadataRequest $request
     *
     * @return CreateSchemaAdminmetadataResponse
     */
    public function createSchemaAdminmetadata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSchemaAdminmetadataEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增schema的metadata信息
     * Summary: 新增schema的metadata信息.
     *
     * @param CreateSchemaAdminmetadataRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateSchemaAdminmetadataResponse
     */
    public function createSchemaAdminmetadataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSchemaAdminmetadataResponse::fromMap($this->doRequest('2.0', 'sofa.mq.schema.adminmetadata.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新schema元信息
     * Summary: 更新schema元信息.
     *
     * @param UpdateSchemaAdminmetadataRequest $request
     *
     * @return UpdateSchemaAdminmetadataResponse
     */
    public function updateSchemaAdminmetadata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSchemaAdminmetadataEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新schema元信息
     * Summary: 更新schema元信息.
     *
     * @param UpdateSchemaAdminmetadataRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateSchemaAdminmetadataResponse
     */
    public function updateSchemaAdminmetadataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSchemaAdminmetadataResponse::fromMap($this->doRequest('2.0', 'sofa.mq.schema.adminmetadata.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除schema元信息
     * Summary: 删除schema元信息.
     *
     * @param DeleteSchemaAdminmetadataRequest $request
     *
     * @return DeleteSchemaAdminmetadataResponse
     */
    public function deleteSchemaAdminmetadata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSchemaAdminmetadataEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除schema元信息
     * Summary: 删除schema元信息.
     *
     * @param DeleteSchemaAdminmetadataRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DeleteSchemaAdminmetadataResponse
     */
    public function deleteSchemaAdminmetadataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSchemaAdminmetadataResponse::fromMap($this->doRequest('2.0', 'sofa.mq.schema.adminmetadata.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查看schema详情
     * Summary: 分页查看schema详情.
     *
     * @param ListSchemaAdmindetailRequest $request
     *
     * @return ListSchemaAdmindetailResponse
     */
    public function listSchemaAdmindetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSchemaAdmindetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查看schema详情
     * Summary: 分页查看schema详情.
     *
     * @param ListSchemaAdmindetailRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListSchemaAdmindetailResponse
     */
    public function listSchemaAdmindetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSchemaAdmindetailResponse::fromMap($this->doRequest('2.0', 'sofa.mq.schema.admindetail.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增schema详情
     * Summary: 新增schema详情.
     *
     * @param CreateSchemaAdmindetailRequest $request
     *
     * @return CreateSchemaAdmindetailResponse
     */
    public function createSchemaAdmindetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSchemaAdmindetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增schema详情
     * Summary: 新增schema详情.
     *
     * @param CreateSchemaAdmindetailRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateSchemaAdmindetailResponse
     */
    public function createSchemaAdmindetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSchemaAdmindetailResponse::fromMap($this->doRequest('2.0', 'sofa.mq.schema.admindetail.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: admindetail
     * Summary: 删除schema详情.
     *
     * @param DeleteSchemaAdmindetailRequest $request
     *
     * @return DeleteSchemaAdmindetailResponse
     */
    public function deleteSchemaAdmindetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSchemaAdmindetailEx($request, $headers, $runtime);
    }

    /**
     * Description: admindetail
     * Summary: 删除schema详情.
     *
     * @param DeleteSchemaAdmindetailRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteSchemaAdmindetailResponse
     */
    public function deleteSchemaAdmindetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSchemaAdmindetailResponse::fromMap($this->doRequest('2.0', 'sofa.mq.schema.admindetail.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询endpoint
     * Summary: 查询endpoint.
     *
     * @param QuerySofamqEndpointRequest $request
     *
     * @return QuerySofamqEndpointResponse
     */
    public function querySofamqEndpoint($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqEndpointEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询endpoint
     * Summary: 查询endpoint.
     *
     * @param QuerySofamqEndpointRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QuerySofamqEndpointResponse
     */
    public function querySofamqEndpointEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqEndpointResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.endpoint.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按照条件查看schema元数据
     * Summary: 按照条件查看schema元数据.
     *
     * @param QuerySchemaAdminmetadataRequest $request
     *
     * @return QuerySchemaAdminmetadataResponse
     */
    public function querySchemaAdminmetadata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySchemaAdminmetadataEx($request, $headers, $runtime);
    }

    /**
     * Description: 按照条件查看schema元数据
     * Summary: 按照条件查看schema元数据.
     *
     * @param QuerySchemaAdminmetadataRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QuerySchemaAdminmetadataResponse
     */
    public function querySchemaAdminmetadataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySchemaAdminmetadataResponse::fromMap($this->doRequest('2.0', 'sofa.mq.schema.adminmetadata.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询schema的config配置
     * Summary: 查询schema的config配置.
     *
     * @param QuerySchemaAdminconfigRequest $request
     *
     * @return QuerySchemaAdminconfigResponse
     */
    public function querySchemaAdminconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySchemaAdminconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询schema的config配置
     * Summary: 查询schema的config配置.
     *
     * @param QuerySchemaAdminconfigRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QuerySchemaAdminconfigResponse
     */
    public function querySchemaAdminconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySchemaAdminconfigResponse::fromMap($this->doRequest('2.0', 'sofa.mq.schema.adminconfig.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询console页面的链接
     * Summary: 查询console页面的链接.
     *
     * @param QuerySofamqLinkRequest $request
     *
     * @return QuerySofamqLinkResponse
     */
    public function querySofamqLink($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqLinkEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询console页面的链接
     * Summary: 查询console页面的链接.
     *
     * @param QuerySofamqLinkRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QuerySofamqLinkResponse
     */
    public function querySofamqLinkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqLinkResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.link.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询全部topic名字
     * Summary: 查询全部topic名字.
     *
     * @param QuerySofamqTopicnameRequest $request
     *
     * @return QuerySofamqTopicnameResponse
     */
    public function querySofamqTopicname($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqTopicnameEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询全部topic名字
     * Summary: 查询全部topic名字.
     *
     * @param QuerySofamqTopicnameRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QuerySofamqTopicnameResponse
     */
    public function querySofamqTopicnameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqTopicnameResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.topicname.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询全部group名字
     * Summary: 查询全部group名字.
     *
     * @param QuerySofamqGroupnameRequest $request
     *
     * @return QuerySofamqGroupnameResponse
     */
    public function querySofamqGroupname($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqGroupnameEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询全部group名字
     * Summary: 查询全部group名字.
     *
     * @param QuerySofamqGroupnameRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QuerySofamqGroupnameResponse
     */
    public function querySofamqGroupnameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqGroupnameResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.groupname.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 管理员创建topic
     * Summary: 管理员创建topic.
     *
     * @param CreateSofamqAdmintopicRequest $request
     *
     * @return CreateSofamqAdmintopicResponse
     */
    public function createSofamqAdmintopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqAdmintopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 管理员创建topic
     * Summary: 管理员创建topic.
     *
     * @param CreateSofamqAdmintopicRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateSofamqAdmintopicResponse
     */
    public function createSofamqAdmintopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqAdmintopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.admintopic.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 管理员创建group
     * Summary: 管理员创建group.
     *
     * @param CreateSofamqAdmingroupRequest $request
     *
     * @return CreateSofamqAdmingroupResponse
     */
    public function createSofamqAdmingroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqAdmingroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 管理员创建group
     * Summary: 管理员创建group.
     *
     * @param CreateSofamqAdmingroupRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateSofamqAdmingroupResponse
     */
    public function createSofamqAdmingroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqAdmingroupResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.admingroup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询特定的连接任务详情
     * Summary: 查询特定的连接任务详情.
     *
     * @param QuerySofamqConnectorRequest $request
     *
     * @return QuerySofamqConnectorResponse
     */
    public function querySofamqConnector($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询特定的连接任务详情
     * Summary: 查询特定的连接任务详情.
     *
     * @param QuerySofamqConnectorRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QuerySofamqConnectorResponse
     */
    public function querySofamqConnectorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectorResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connector.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增一个连接器任务
     * Summary: 新增一个连接器任务
     *
     * @param CreateSofamqConnectorRequest $request
     *
     * @return CreateSofamqConnectorResponse
     */
    public function createSofamqConnector($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqConnectorEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增一个连接器任务
     * Summary: 新增一个连接器任务
     *
     * @param CreateSofamqConnectorRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateSofamqConnectorResponse
     */
    public function createSofamqConnectorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqConnectorResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connector.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所有的连接任务，允许携带查询条件
     * Summary: 查询连接任务
     *
     * @param ListSofamqConnectorRequest $request
     *
     * @return ListSofamqConnectorResponse
     */
    public function listSofamqConnector($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqConnectorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所有的连接任务，允许携带查询条件
     * Summary: 查询连接任务
     *
     * @param ListSofamqConnectorRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListSofamqConnectorResponse
     */
    public function listSofamqConnectorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqConnectorResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connector.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除一个连接器任务
     * Summary: 删除一个连接器任务
     *
     * @param DeleteSofamqConnectorRequest $request
     *
     * @return DeleteSofamqConnectorResponse
     */
    public function deleteSofamqConnector($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqConnectorEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除一个连接器任务
     * Summary: 删除一个连接器任务
     *
     * @param DeleteSofamqConnectorRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteSofamqConnectorResponse
     */
    public function deleteSofamqConnectorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqConnectorResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connector.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 启动一个连接器的任务
     * Summary: 启动一个连接器的任务
     *
     * @param EnableSofamqConnectorRequest $request
     *
     * @return EnableSofamqConnectorResponse
     */
    public function enableSofamqConnector($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSofamqConnectorEx($request, $headers, $runtime);
    }

    /**
     * Description: 启动一个连接器的任务
     * Summary: 启动一个连接器的任务
     *
     * @param EnableSofamqConnectorRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return EnableSofamqConnectorResponse
     */
    public function enableSofamqConnectorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSofamqConnectorResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connector.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 停止一个连接器任务
     * Summary: 停止一个连接器任务
     *
     * @param DisableSofamqConnectorRequest $request
     *
     * @return DisableSofamqConnectorResponse
     */
    public function disableSofamqConnector($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableSofamqConnectorEx($request, $headers, $runtime);
    }

    /**
     * Description: 停止一个连接器任务
     * Summary: 停止一个连接器任务
     *
     * @param DisableSofamqConnectorRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DisableSofamqConnectorResponse
     */
    public function disableSofamqConnectorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableSofamqConnectorResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connector.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出所有任务的调度类型
     * Summary: 列出所有任务的调度类型.
     *
     * @param ListSofamqConnectorscheuletypeRequest $request
     *
     * @return ListSofamqConnectorscheuletypeResponse
     */
    public function listSofamqConnectorscheuletype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqConnectorscheuletypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出所有任务的调度类型
     * Summary: 列出所有任务的调度类型.
     *
     * @param ListSofamqConnectorscheuletypeRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ListSofamqConnectorscheuletypeResponse
     */
    public function listSofamqConnectorscheuletypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqConnectorscheuletypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorscheuletype.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出所有支持的来源类型
     * Summary: 列出所有支持的来源类型.
     *
     * @param ListSofamqConnectorsourcetypeRequest $request
     *
     * @return ListSofamqConnectorsourcetypeResponse
     */
    public function listSofamqConnectorsourcetype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqConnectorsourcetypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出所有支持的来源类型
     * Summary: 列出所有支持的来源类型.
     *
     * @param ListSofamqConnectorsourcetypeRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ListSofamqConnectorsourcetypeResponse
     */
    public function listSofamqConnectorsourcetypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqConnectorsourcetypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorsourcetype.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出所有支持的去向类型
     * Summary: 列出所有支持的去向类型.
     *
     * @param ListSofamqConnectorsinktypeRequest $request
     *
     * @return ListSofamqConnectorsinktypeResponse
     */
    public function listSofamqConnectorsinktype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqConnectorsinktypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出所有支持的去向类型
     * Summary: 列出所有支持的去向类型.
     *
     * @param ListSofamqConnectorsinktypeRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ListSofamqConnectorsinktypeResponse
     */
    public function listSofamqConnectorsinktypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqConnectorsinktypeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorsinktype.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
     * Summary: 加载不同数据来源和去向对应的前端配置.
     *
     * @param LoadSofamqConnectorconfigsRequest $request
     *
     * @return LoadSofamqConnectorconfigsResponse
     */
    public function loadSofamqConnectorconfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->loadSofamqConnectorconfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
     * Summary: 加载不同数据来源和去向对应的前端配置.
     *
     * @param LoadSofamqConnectorconfigsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return LoadSofamqConnectorconfigsResponse
     */
    public function loadSofamqConnectorconfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LoadSofamqConnectorconfigsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorconfigs.load', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: connect按照时间段返回当前任务的执行记录
     * Summary: connect执行记录查询.
     *
     * @param QuerySofamqConnectordateRequest $request
     *
     * @return QuerySofamqConnectordateResponse
     */
    public function querySofamqConnectordate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectordateEx($request, $headers, $runtime);
    }

    /**
     * Description: connect按照时间段返回当前任务的执行记录
     * Summary: connect执行记录查询.
     *
     * @param QuerySofamqConnectordateRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QuerySofamqConnectordateResponse
     */
    public function querySofamqConnectordateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectordateResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectordate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据执行时间返回当前的任务记录执行详情
     * Summary: 根据执行时间返回当前的任务记录执行详情.
     *
     * @param QuerySofamqConnectorrecordRequest $request
     *
     * @return QuerySofamqConnectorrecordResponse
     */
    public function querySofamqConnectorrecord($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectorrecordEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据执行时间返回当前的任务记录执行详情
     * Summary: 根据执行时间返回当前的任务记录执行详情.
     *
     * @param QuerySofamqConnectorrecordRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QuerySofamqConnectorrecordResponse
     */
    public function querySofamqConnectorrecordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectorrecordResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorrecord.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 加载数据源对应的结构信息
     * Summary: 加载数据源对应的结构信息.
     *
     * @param LoadSofamqConnectorsourceRequest $request
     *
     * @return LoadSofamqConnectorsourceResponse
     */
    public function loadSofamqConnectorsource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->loadSofamqConnectorsourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 加载数据源对应的结构信息
     * Summary: 加载数据源对应的结构信息.
     *
     * @param LoadSofamqConnectorsourceRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return LoadSofamqConnectorsourceResponse
     */
    public function loadSofamqConnectorsourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LoadSofamqConnectorsourceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorsource.load', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询队列详情信息以及分页信息
     * Summary: 查询队列详情.
     *
     * @param QueryMeshQueueRequest $request
     *
     * @return QueryMeshQueueResponse
     */
    public function queryMeshQueue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshQueueEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询队列详情信息以及分页信息
     * Summary: 查询队列详情.
     *
     * @param QueryMeshQueueRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryMeshQueueResponse
     */
    public function queryMeshQueueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshQueueResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增队列
     * Summary: 新增队列.
     *
     * @param ImportMeshQueueRequest $request
     *
     * @return ImportMeshQueueResponse
     */
    public function importMeshQueue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importMeshQueueEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增队列
     * Summary: 新增队列.
     *
     * @param ImportMeshQueueRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ImportMeshQueueResponse
     */
    public function importMeshQueueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportMeshQueueResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queue.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除队列
     * Summary: 删除队列.
     *
     * @param DeleteMeshQueueRequest $request
     *
     * @return DeleteMeshQueueResponse
     */
    public function deleteMeshQueue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMeshQueueEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除队列
     * Summary: 删除队列.
     *
     * @param DeleteMeshQueueRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteMeshQueueResponse
     */
    public function deleteMeshQueueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMeshQueueResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queue.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新队列
     * Summary: 更新队列.
     *
     * @param UpdateMeshQueueRequest $request
     *
     * @return UpdateMeshQueueResponse
     */
    public function updateMeshQueue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeshQueueEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新队列
     * Summary: 更新队列.
     *
     * @param UpdateMeshQueueRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateMeshQueueResponse
     */
    public function updateMeshQueueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeshQueueResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queue.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询限流规则
     * Summary: 查询限流规则.
     *
     * @param QueryMeshQueuelimitrulesRequest $request
     *
     * @return QueryMeshQueuelimitrulesResponse
     */
    public function queryMeshQueuelimitrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshQueuelimitrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询限流规则
     * Summary: 查询限流规则.
     *
     * @param QueryMeshQueuelimitrulesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryMeshQueuelimitrulesResponse
     */
    public function queryMeshQueuelimitrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshQueuelimitrulesResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuelimitrules.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改一个连接器任务
     * Summary: 修改一个连接器任务
     *
     * @param UpdateSofamqConnectorRequest $request
     *
     * @return UpdateSofamqConnectorResponse
     */
    public function updateSofamqConnector($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqConnectorEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改一个连接器任务
     * Summary: 修改一个连接器任务
     *
     * @param UpdateSofamqConnectorRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateSofamqConnectorResponse
     */
    public function updateSofamqConnectorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqConnectorResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connector.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询限流规则域值
     * Summary: 查询限流规则域值
     *
     * @param QueryMeshQueuelimitvalueRequest $request
     *
     * @return QueryMeshQueuelimitvalueResponse
     */
    public function queryMeshQueuelimitvalue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshQueuelimitvalueEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询限流规则域值
     * Summary: 查询限流规则域值
     *
     * @param QueryMeshQueuelimitvalueRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryMeshQueuelimitvalueResponse
     */
    public function queryMeshQueuelimitvalueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshQueuelimitvalueResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuelimitvalue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新限流规则
     * Summary: 更新限流规则.
     *
     * @param UpdateMeshQueuelimitRequest $request
     *
     * @return UpdateMeshQueuelimitResponse
     */
    public function updateMeshQueuelimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeshQueuelimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新限流规则
     * Summary: 更新限流规则.
     *
     * @param UpdateMeshQueuelimitRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateMeshQueuelimitResponse
     */
    public function updateMeshQueuelimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeshQueuelimitResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuelimit.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加限流规则
     * Summary: 添加限流规则.
     *
     * @param ImportMeshQueuelimitRequest $request
     *
     * @return ImportMeshQueuelimitResponse
     */
    public function importMeshQueuelimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importMeshQueuelimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加限流规则
     * Summary: 添加限流规则.
     *
     * @param ImportMeshQueuelimitRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ImportMeshQueuelimitResponse
     */
    public function importMeshQueuelimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportMeshQueuelimitResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuelimit.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则.
     *
     * @param DeleteMeshQueuelimitRequest $request
     *
     * @return DeleteMeshQueuelimitResponse
     */
    public function deleteMeshQueuelimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMeshQueuelimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则.
     *
     * @param DeleteMeshQueuelimitRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteMeshQueuelimitResponse
     */
    public function deleteMeshQueuelimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMeshQueuelimitResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuelimit.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除限流域值
     * Summary: 删除规则的限流域值
     *
     * @param DeleteMeshQueuelimitvalueRequest $request
     *
     * @return DeleteMeshQueuelimitvalueResponse
     */
    public function deleteMeshQueuelimitvalue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMeshQueuelimitvalueEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除限流域值
     * Summary: 删除规则的限流域值
     *
     * @param DeleteMeshQueuelimitvalueRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DeleteMeshQueuelimitvalueResponse
     */
    public function deleteMeshQueuelimitvalueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMeshQueuelimitvalueResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuelimitvalue.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询路由规则
     * Summary: 查询路由规则.
     *
     * @param QueryMeshQueuerouterulesRequest $request
     *
     * @return QueryMeshQueuerouterulesResponse
     */
    public function queryMeshQueuerouterules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshQueuerouterulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询路由规则
     * Summary: 查询路由规则.
     *
     * @param QueryMeshQueuerouterulesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryMeshQueuerouterulesResponse
     */
    public function queryMeshQueuerouterulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshQueuerouterulesResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuerouterules.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询路由版本
     * Summary: 查询路由版本.
     *
     * @param QueryMeshQueuerouteeditionRequest $request
     *
     * @return QueryMeshQueuerouteeditionResponse
     */
    public function queryMeshQueuerouteedition($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshQueuerouteeditionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询路由版本
     * Summary: 查询路由版本.
     *
     * @param QueryMeshQueuerouteeditionRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryMeshQueuerouteeditionResponse
     */
    public function queryMeshQueuerouteeditionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshQueuerouteeditionResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuerouteedition.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加路由规则
     * Summary: 添加路由规则.
     *
     * @param ImportMeshQueuerouteRequest $request
     *
     * @return ImportMeshQueuerouteResponse
     */
    public function importMeshQueueroute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importMeshQueuerouteEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加路由规则
     * Summary: 添加路由规则.
     *
     * @param ImportMeshQueuerouteRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ImportMeshQueuerouteResponse
     */
    public function importMeshQueuerouteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportMeshQueuerouteResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queueroute.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新路由规则
     * Summary: 更新路由规则.
     *
     * @param UpdateMeshQueuerouteRequest $request
     *
     * @return UpdateMeshQueuerouteResponse
     */
    public function updateMeshQueueroute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeshQueuerouteEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新路由规则
     * Summary: 更新路由规则.
     *
     * @param UpdateMeshQueuerouteRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateMeshQueuerouteResponse
     */
    public function updateMeshQueuerouteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeshQueuerouteResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queueroute.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则.
     *
     * @param DeleteMeshQueuerouteRequest $request
     *
     * @return DeleteMeshQueuerouteResponse
     */
    public function deleteMeshQueueroute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMeshQueuerouteEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则.
     *
     * @param DeleteMeshQueuerouteRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteMeshQueuerouteResponse
     */
    public function deleteMeshQueuerouteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMeshQueuerouteResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queueroute.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除路由版本
     * Summary: 删除路由版本.
     *
     * @param DeleteMeshQueuerouteeditionRequest $request
     *
     * @return DeleteMeshQueuerouteeditionResponse
     */
    public function deleteMeshQueuerouteedition($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMeshQueuerouteeditionEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除路由版本
     * Summary: 删除路由版本.
     *
     * @param DeleteMeshQueuerouteeditionRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DeleteMeshQueuerouteeditionResponse
     */
    public function deleteMeshQueuerouteeditionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMeshQueuerouteeditionResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuerouteedition.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询路由规则应用
     * Summary: 查询路由规则应用.
     *
     * @param QueryMeshQueuerouteappRequest $request
     *
     * @return QueryMeshQueuerouteappResponse
     */
    public function queryMeshQueuerouteapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshQueuerouteappEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询路由规则应用
     * Summary: 查询路由规则应用.
     *
     * @param QueryMeshQueuerouteappRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryMeshQueuerouteappResponse
     */
    public function queryMeshQueuerouteappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshQueuerouteappResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuerouteapp.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据队列id查询队列详情
     * Summary: 根据队列id查询队列详情.
     *
     * @param QueryMeshQueuebyidRequest $request
     *
     * @return QueryMeshQueuebyidResponse
     */
    public function queryMeshQueuebyid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshQueuebyidEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据队列id查询队列详情
     * Summary: 根据队列id查询队列详情.
     *
     * @param QueryMeshQueuebyidRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryMeshQueuebyidResponse
     */
    public function queryMeshQueuebyidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshQueuebyidResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuebyid.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: zhaolei
     * Summary: 更新限流状态
     *
     * @param UpdateMeshQueuelimitstatusRequest $request
     *
     * @return UpdateMeshQueuelimitstatusResponse
     */
    public function updateMeshQueuelimitstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeshQueuelimitstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: zhaolei
     * Summary: 更新限流状态
     *
     * @param UpdateMeshQueuelimitstatusRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateMeshQueuelimitstatusResponse
     */
    public function updateMeshQueuelimitstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeshQueuelimitstatusResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuelimitstatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新路由规则状态
     * Summary: 更新路由规则状态
     *
     * @param UpdateMeshQueueroutestatusRequest $request
     *
     * @return UpdateMeshQueueroutestatusResponse
     */
    public function updateMeshQueueroutestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeshQueueroutestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新路由规则状态
     * Summary: 更新路由规则状态
     *
     * @param UpdateMeshQueueroutestatusRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateMeshQueueroutestatusResponse
     */
    public function updateMeshQueueroutestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeshQueueroutestatusResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queueroutestatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 管理员更新topic
     * Summary: 管理员更新topic.
     *
     * @param UpdateSofamqAdmintopicRequest $request
     *
     * @return UpdateSofamqAdmintopicResponse
     */
    public function updateSofamqAdmintopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqAdmintopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 管理员更新topic
     * Summary: 管理员更新topic.
     *
     * @param UpdateSofamqAdmintopicRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateSofamqAdmintopicResponse
     */
    public function updateSofamqAdmintopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqAdmintopicResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.admintopic.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 管理员更新group
     * Summary: 管理员更新group.
     *
     * @param UpdateSofamqAdmingroupRequest $request
     *
     * @return UpdateSofamqAdmingroupResponse
     */
    public function updateSofamqAdmingroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqAdmingroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 管理员更新group
     * Summary: 管理员更新group.
     *
     * @param UpdateSofamqAdmingroupRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateSofamqAdmingroupResponse
     */
    public function updateSofamqAdmingroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqAdmingroupResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.admingroup.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 手动触发一次任务的执行
     * Summary: 手动触发一次任务的执行.
     *
     * @param RunSofamqConnectorjobRequest $request
     *
     * @return RunSofamqConnectorjobResponse
     */
    public function runSofamqConnectorjob($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->runSofamqConnectorjobEx($request, $headers, $runtime);
    }

    /**
     * Description: 手动触发一次任务的执行
     * Summary: 手动触发一次任务的执行.
     *
     * @param RunSofamqConnectorjobRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return RunSofamqConnectorjobResponse
     */
    public function runSofamqConnectorjobEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RunSofamqConnectorjobResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorjob.run', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 暂停一个Connector任务
     * Summary: 暂停一个任务
     *
     * @param PauseSofamqConnectorjobRequest $request
     *
     * @return PauseSofamqConnectorjobResponse
     */
    public function pauseSofamqConnectorjob($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pauseSofamqConnectorjobEx($request, $headers, $runtime);
    }

    /**
     * Description: 暂停一个Connector任务
     * Summary: 暂停一个任务
     *
     * @param PauseSofamqConnectorjobRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return PauseSofamqConnectorjobResponse
     */
    public function pauseSofamqConnectorjobEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PauseSofamqConnectorjobResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorjob.pause', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 恢复一个暂停的任务
     * Summary: 恢复一个暂停的任务
     *
     * @param ResumeSofamqConnectorjobRequest $request
     *
     * @return ResumeSofamqConnectorjobResponse
     */
    public function resumeSofamqConnectorjob($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resumeSofamqConnectorjobEx($request, $headers, $runtime);
    }

    /**
     * Description: 恢复一个暂停的任务
     * Summary: 恢复一个暂停的任务
     *
     * @param ResumeSofamqConnectorjobRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ResumeSofamqConnectorjobResponse
     */
    public function resumeSofamqConnectorjobEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResumeSofamqConnectorjobResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorjob.resume', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 确认覆盖路有规则状态
     * Summary: 确认覆盖路由规则状态
     *
     * @param UpdateMeshQueueroutestatusconfirmRequest $request
     *
     * @return UpdateMeshQueueroutestatusconfirmResponse
     */
    public function updateMeshQueueroutestatusconfirm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeshQueueroutestatusconfirmEx($request, $headers, $runtime);
    }

    /**
     * Description: 确认覆盖路有规则状态
     * Summary: 确认覆盖路由规则状态
     *
     * @param UpdateMeshQueueroutestatusconfirmRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return UpdateMeshQueueroutestatusconfirmResponse
     */
    public function updateMeshQueueroutestatusconfirmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeshQueueroutestatusconfirmResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queueroutestatusconfirm.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更细限流状态
     * Summary: 更新限流状态
     *
     * @param UpdateMeshQueuelimitstatusconfirmRequest $request
     *
     * @return UpdateMeshQueuelimitstatusconfirmResponse
     */
    public function updateMeshQueuelimitstatusconfirm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeshQueuelimitstatusconfirmEx($request, $headers, $runtime);
    }

    /**
     * Description: 更细限流状态
     * Summary: 更新限流状态
     *
     * @param UpdateMeshQueuelimitstatusconfirmRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return UpdateMeshQueuelimitstatusconfirmResponse
     */
    public function updateMeshQueuelimitstatusconfirmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeshQueuelimitstatusconfirmResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.queuelimitstatusconfirm.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 日切检查，验证是否可以完成日切
     * Summary: 日切检查.
     *
     * @param ExecSofamqDailycheckRequest $request
     *
     * @return ExecSofamqDailycheckResponse
     */
    public function execSofamqDailycheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execSofamqDailycheckEx($request, $headers, $runtime);
    }

    /**
     * Description: 日切检查，验证是否可以完成日切
     * Summary: 日切检查.
     *
     * @param ExecSofamqDailycheckRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExecSofamqDailycheckResponse
     */
    public function execSofamqDailycheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecSofamqDailycheckResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.dailycheck.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用详情
     * Summary: 查询应用详情.
     *
     * @param QueryMeshApplicationRequest $request
     *
     * @return QueryMeshApplicationResponse
     */
    public function queryMeshApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用详情
     * Summary: 查询应用详情.
     *
     * @param QueryMeshApplicationRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryMeshApplicationResponse
     */
    public function queryMeshApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshApplicationResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.application.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增应用
     * Summary: 新增应用.
     *
     * @param ImportMeshApplicationRequest $request
     *
     * @return ImportMeshApplicationResponse
     */
    public function importMeshApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importMeshApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增应用
     * Summary: 新增应用.
     *
     * @param ImportMeshApplicationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ImportMeshApplicationResponse
     */
    public function importMeshApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportMeshApplicationResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.application.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新应用
     * Summary: 更新应用.
     *
     * @param UpdateMeshApplicationRequest $request
     *
     * @return UpdateMeshApplicationResponse
     */
    public function updateMeshApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeshApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新应用
     * Summary: 更新应用.
     *
     * @param UpdateMeshApplicationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateMeshApplicationResponse
     */
    public function updateMeshApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeshApplicationResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.application.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除应用
     * Summary: 删除应用.
     *
     * @param DeleteMeshApplicationRequest $request
     *
     * @return DeleteMeshApplicationResponse
     */
    public function deleteMeshApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMeshApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除应用
     * Summary: 删除应用.
     *
     * @param DeleteMeshApplicationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteMeshApplicationResponse
     */
    public function deleteMeshApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMeshApplicationResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.application.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用服务id
     * Summary: 查询应用服务id.
     *
     * @param QueryMeshApplicationserviceRequest $request
     *
     * @return QueryMeshApplicationserviceResponse
     */
    public function queryMeshApplicationservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshApplicationserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用服务id
     * Summary: 查询应用服务id.
     *
     * @param QueryMeshApplicationserviceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryMeshApplicationserviceResponse
     */
    public function queryMeshApplicationserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshApplicationserviceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.applicationservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据应用名查应用详情
     * Summary: 根据应用名查应用详情.
     *
     * @param QueryMeshApplicationbynameRequest $request
     *
     * @return QueryMeshApplicationbynameResponse
     */
    public function queryMeshApplicationbyname($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshApplicationbynameEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据应用名查应用详情
     * Summary: 根据应用名查应用详情.
     *
     * @param QueryMeshApplicationbynameRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryMeshApplicationbynameResponse
     */
    public function queryMeshApplicationbynameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshApplicationbynameResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.applicationbyname.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询队列的应用列表
     * Summary: 查询队列的应用列表.
     *
     * @param QueryMeshApplicationlistRequest $request
     *
     * @return QueryMeshApplicationlistResponse
     */
    public function queryMeshApplicationlist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshApplicationlistEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询队列的应用列表
     * Summary: 查询队列的应用列表.
     *
     * @param QueryMeshApplicationlistRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryMeshApplicationlistResponse
     */
    public function queryMeshApplicationlistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshApplicationlistResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.applicationlist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用队列下拉框
     * Summary: 应用队列下拉框.
     *
     * @param QueryMeshApplicationqueuenamesRequest $request
     *
     * @return QueryMeshApplicationqueuenamesResponse
     */
    public function queryMeshApplicationqueuenames($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshApplicationqueuenamesEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用队列下拉框
     * Summary: 应用队列下拉框.
     *
     * @param QueryMeshApplicationqueuenamesRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryMeshApplicationqueuenamesResponse
     */
    public function queryMeshApplicationqueuenamesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshApplicationqueuenamesResponse::fromMap($this->doRequest('2.0', 'sofa.mq.mesh.applicationqueuenames.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 暂停一个Connector执行计划
     * Summary: 暂停一个Connector执行计划.
     *
     * @param PauseSofamqConnectorplanRequest $request
     *
     * @return PauseSofamqConnectorplanResponse
     */
    public function pauseSofamqConnectorplan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pauseSofamqConnectorplanEx($request, $headers, $runtime);
    }

    /**
     * Description: 暂停一个Connector执行计划
     * Summary: 暂停一个Connector执行计划.
     *
     * @param PauseSofamqConnectorplanRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PauseSofamqConnectorplanResponse
     */
    public function pauseSofamqConnectorplanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PauseSofamqConnectorplanResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorplan.pause', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 恢复一个connector执行计划
     * Summary: 恢复一个connector执行计划.
     *
     * @param ResumeSofamqConnectorplanRequest $request
     *
     * @return ResumeSofamqConnectorplanResponse
     */
    public function resumeSofamqConnectorplan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resumeSofamqConnectorplanEx($request, $headers, $runtime);
    }

    /**
     * Description: 恢复一个connector执行计划
     * Summary: 恢复一个connector执行计划.
     *
     * @param ResumeSofamqConnectorplanRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ResumeSofamqConnectorplanResponse
     */
    public function resumeSofamqConnectorplanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResumeSofamqConnectorplanResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorplan.resume', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
     * Summary: 重启一个已有的connector任务计划.
     *
     * @param RetrySofamqConnectorplanRequest $request
     *
     * @return RetrySofamqConnectorplanResponse
     */
    public function retrySofamqConnectorplan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retrySofamqConnectorplanEx($request, $headers, $runtime);
    }

    /**
     * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
     * Summary: 重启一个已有的connector任务计划.
     *
     * @param RetrySofamqConnectorplanRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return RetrySofamqConnectorplanResponse
     */
    public function retrySofamqConnectorplanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetrySofamqConnectorplanResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorplan.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
     * Summary: 查询任务不同来源去向的配置.
     *
     * @param QuerySofamqConnectorconfigsRequest $request
     *
     * @return QuerySofamqConnectorconfigsResponse
     */
    public function querySofamqConnectorconfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectorconfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
     * Summary: 查询任务不同来源去向的配置.
     *
     * @param QuerySofamqConnectorconfigsRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QuerySofamqConnectorconfigsResponse
     */
    public function querySofamqConnectorconfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectorconfigsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorconfigs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建消费限流规则
     * Summary: 创建消费限流规则.
     *
     * @param CreateSofamqConsumelimiterRequest $request
     *
     * @return CreateSofamqConsumelimiterResponse
     */
    public function createSofamqConsumelimiter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqConsumelimiterEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建消费限流规则
     * Summary: 创建消费限流规则.
     *
     * @param CreateSofamqConsumelimiterRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateSofamqConsumelimiterResponse
     */
    public function createSofamqConsumelimiterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqConsumelimiterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumelimiter.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新限流规则
     * Summary: 更新限流规则.
     *
     * @param UpdateSofamqConsumelimiterRequest $request
     *
     * @return UpdateSofamqConsumelimiterResponse
     */
    public function updateSofamqConsumelimiter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqConsumelimiterEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新限流规则
     * Summary: 更新限流规则.
     *
     * @param UpdateSofamqConsumelimiterRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateSofamqConsumelimiterResponse
     */
    public function updateSofamqConsumelimiterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqConsumelimiterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumelimiter.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则.
     *
     * @param DeleteSofamqConsumelimiterRequest $request
     *
     * @return DeleteSofamqConsumelimiterResponse
     */
    public function deleteSofamqConsumelimiter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqConsumelimiterEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则.
     *
     * @param DeleteSofamqConsumelimiterRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DeleteSofamqConsumelimiterResponse
     */
    public function deleteSofamqConsumelimiterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqConsumelimiterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumelimiter.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取限流规则
     * Summary: 限流规则获取.
     *
     * @param QuerySofamqConsumelimiterRequest $request
     *
     * @return QuerySofamqConsumelimiterResponse
     */
    public function querySofamqConsumelimiter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConsumelimiterEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取限流规则
     * Summary: 限流规则获取.
     *
     * @param QuerySofamqConsumelimiterRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QuerySofamqConsumelimiterResponse
     */
    public function querySofamqConsumelimiterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConsumelimiterResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumelimiter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dd
     * Summary: dd.
     *
     * @param GetDmsInstanceRequest $request
     *
     * @return GetDmsInstanceResponse
     */
    public function getDmsInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDmsInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: dd
     * Summary: dd.
     *
     * @param GetDmsInstanceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetDmsInstanceResponse
     */
    public function getDmsInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDmsInstanceResponse::fromMap($this->doRequest('2.0', 'sofa.mq.dms.instance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询标签
     * Summary: 查询标签.
     *
     * @param QuerySofamqLabelsRequest $request
     *
     * @return QuerySofamqLabelsResponse
     */
    public function querySofamqLabels($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqLabelsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询标签
     * Summary: 查询标签.
     *
     * @param QuerySofamqLabelsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QuerySofamqLabelsResponse
     */
    public function querySofamqLabelsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqLabelsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.labels.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: SofaMQ 创建资源标签
     * Summary: 创建资源标签.
     *
     * @param CreateSofamqLabelsRequest $request
     *
     * @return CreateSofamqLabelsResponse
     */
    public function createSofamqLabels($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqLabelsEx($request, $headers, $runtime);
    }

    /**
     * Description: SofaMQ 创建资源标签
     * Summary: 创建资源标签.
     *
     * @param CreateSofamqLabelsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateSofamqLabelsResponse
     */
    public function createSofamqLabelsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqLabelsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.labels.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除资源标签
     * Summary: 删除资源标签.
     *
     * @param DeleteSofamqLabelsRequest $request
     *
     * @return DeleteSofamqLabelsResponse
     */
    public function deleteSofamqLabels($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqLabelsEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除资源标签
     * Summary: 删除资源标签.
     *
     * @param DeleteSofamqLabelsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteSofamqLabelsResponse
     */
    public function deleteSofamqLabelsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqLabelsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.labels.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取特定Topic的Schema列表
     * Summary: 获取Topic的Schema列表.
     *
     * @param ListSofamqSchemaRequest $request
     *
     * @return ListSofamqSchemaResponse
     */
    public function listSofamqSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取特定Topic的Schema列表
     * Summary: 获取Topic的Schema列表.
     *
     * @param ListSofamqSchemaRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListSofamqSchemaResponse
     */
    public function listSofamqSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqSchemaResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.schema.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建Topic的Schema
     * Summary: 创建Schema.
     *
     * @param CreateSofamqSchemaRequest $request
     *
     * @return CreateSofamqSchemaResponse
     */
    public function createSofamqSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSofamqSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建Topic的Schema
     * Summary: 创建Schema.
     *
     * @param CreateSofamqSchemaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateSofamqSchemaResponse
     */
    public function createSofamqSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSofamqSchemaResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.schema.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取特定Topic特定版本的Schema
     * Summary: 获取Schema详情.
     *
     * @param GetSofamqSchemaRequest $request
     *
     * @return GetSofamqSchemaResponse
     */
    public function getSofamqSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSofamqSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取特定Topic特定版本的Schema
     * Summary: 获取Schema详情.
     *
     * @param GetSofamqSchemaRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetSofamqSchemaResponse
     */
    public function getSofamqSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSofamqSchemaResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.schema.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据Schema生成对应的POJO代码
     * Summary: 获取schema对应的代码
     *
     * @param ExportSofamqSchemaRequest $request
     *
     * @return ExportSofamqSchemaResponse
     */
    public function exportSofamqSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportSofamqSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据Schema生成对应的POJO代码
     * Summary: 获取schema对应的代码
     *
     * @param ExportSofamqSchemaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ExportSofamqSchemaResponse
     */
    public function exportSofamqSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportSofamqSchemaResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.schema.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
     * Summary: 更新schema.
     *
     * @param UpdateSofamqSchemaRequest $request
     *
     * @return UpdateSofamqSchemaResponse
     */
    public function updateSofamqSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSofamqSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
     * Summary: 更新schema.
     *
     * @param UpdateSofamqSchemaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateSofamqSchemaResponse
     */
    public function updateSofamqSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSofamqSchemaResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.schema.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
     * Summary: 获取Schema的版本号列表.
     *
     * @param AllSofamqSchemaRequest $request
     *
     * @return AllSofamqSchemaResponse
     */
    public function allSofamqSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allSofamqSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
     * Summary: 获取Schema的版本号列表.
     *
     * @param AllSofamqSchemaRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AllSofamqSchemaResponse
     */
    public function allSofamqSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllSofamqSchemaResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.schema.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据Schema解析消息体，查看消息体的详细数据
     * Summary: 查看消息内容.
     *
     * @param ExportSofamqMessageRequest $request
     *
     * @return ExportSofamqMessageResponse
     */
    public function exportSofamqMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportSofamqMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据Schema解析消息体，查看消息体的详细数据
     * Summary: 查看消息内容.
     *
     * @param ExportSofamqMessageRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExportSofamqMessageResponse
     */
    public function exportSofamqMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportSofamqMessageResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.message.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取系统支持的兼容性策略
     * Summary: 获取系统支持的兼容性策略.
     *
     * @param ListSofamqSchemacompatibilityRequest $request
     *
     * @return ListSofamqSchemacompatibilityResponse
     */
    public function listSofamqSchemacompatibility($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqSchemacompatibilityEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取系统支持的兼容性策略
     * Summary: 获取系统支持的兼容性策略.
     *
     * @param ListSofamqSchemacompatibilityRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ListSofamqSchemacompatibilityResponse
     */
    public function listSofamqSchemacompatibilityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqSchemacompatibilityResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.schemacompatibility.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取系统支持的序列化方式
     * Summary: 获取系统支持的序列化方式.
     *
     * @param ListSofamqSchemaserializationRequest $request
     *
     * @return ListSofamqSchemaserializationResponse
     */
    public function listSofamqSchemaserialization($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqSchemaserializationEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取系统支持的序列化方式
     * Summary: 获取系统支持的序列化方式.
     *
     * @param ListSofamqSchemaserializationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ListSofamqSchemaserializationResponse
     */
    public function listSofamqSchemaserializationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqSchemaserializationResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.schemaserialization.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除特定的Schema
     * Summary: 删除特定的Schema.
     *
     * @param DeleteSofamqSchemaRequest $request
     *
     * @return DeleteSofamqSchemaResponse
     */
    public function deleteSofamqSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除特定的Schema
     * Summary: 删除特定的Schema.
     *
     * @param DeleteSofamqSchemaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteSofamqSchemaResponse
     */
    public function deleteSofamqSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqSchemaResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.schema.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Connector工单查询
     * Summary: Connector工单查询.
     *
     * @param QuerySofamqConnectorprocessRequest $request
     *
     * @return QuerySofamqConnectorprocessResponse
     */
    public function querySofamqConnectorprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectorprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: Connector工单查询
     * Summary: Connector工单查询.
     *
     * @param QuerySofamqConnectorprocessRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QuerySofamqConnectorprocessResponse
     */
    public function querySofamqConnectorprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectorprocessResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorprocess.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Connector任务撤回审批
     * Summary: Connector任务撤回审批.
     *
     * @param CancelSofamqConnectorprocessRequest $request
     *
     * @return CancelSofamqConnectorprocessResponse
     */
    public function cancelSofamqConnectorprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelSofamqConnectorprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: Connector任务撤回审批
     * Summary: Connector任务撤回审批.
     *
     * @param CancelSofamqConnectorprocessRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CancelSofamqConnectorprocessResponse
     */
    public function cancelSofamqConnectorprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelSofamqConnectorprocessResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorprocess.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Connector重新提交工单
     * Summary: Connector重新提交工单.
     *
     * @param ResumeSofamqConnectorprocessRequest $request
     *
     * @return ResumeSofamqConnectorprocessResponse
     */
    public function resumeSofamqConnectorprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resumeSofamqConnectorprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: Connector重新提交工单
     * Summary: Connector重新提交工单.
     *
     * @param ResumeSofamqConnectorprocessRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return ResumeSofamqConnectorprocessResponse
     */
    public function resumeSofamqConnectorprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResumeSofamqConnectorprocessResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorprocess.resume', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验一个connector的操作是否合法
     * Summary: 校验一个connector的操作是否合法.
     *
     * @param VerifySofamqConnectoroperationRequest $request
     *
     * @return VerifySofamqConnectoroperationResponse
     */
    public function verifySofamqConnectoroperation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifySofamqConnectoroperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验一个connector的操作是否合法
     * Summary: 校验一个connector的操作是否合法.
     *
     * @param VerifySofamqConnectoroperationRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return VerifySofamqConnectoroperationResponse
     */
    public function verifySofamqConnectoroperationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifySofamqConnectoroperationResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectoroperation.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看操作审计
     * Summary: 查看操作审计
     *
     * @param ListSofamqAuditorRequest $request
     *
     * @return ListSofamqAuditorResponse
     */
    public function listSofamqAuditor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofamqAuditorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看操作审计
     * Summary: 查看操作审计
     *
     * @param ListSofamqAuditorRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListSofamqAuditorResponse
     */
    public function listSofamqAuditorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofamqAuditorResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.auditor.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: connector任务对应的应用名称查询
     * Summary: connector任务对应的应用名称查询.
     *
     * @param QuerySofamqConnectorjobappRequest $request
     *
     * @return QuerySofamqConnectorjobappResponse
     */
    public function querySofamqConnectorjobapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectorjobappEx($request, $headers, $runtime);
    }

    /**
     * Description: connector任务对应的应用名称查询
     * Summary: connector任务对应的应用名称查询.
     *
     * @param QuerySofamqConnectorjobappRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QuerySofamqConnectorjobappResponse
     */
    public function querySofamqConnectorjobappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectorjobappResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorjobapp.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消Connector运行实例
     * Summary: 取消Connector运行实例.
     *
     * @param CancelSofamqConnectorplanRequest $request
     *
     * @return CancelSofamqConnectorplanResponse
     */
    public function cancelSofamqConnectorplan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelSofamqConnectorplanEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消Connector运行实例
     * Summary: 取消Connector运行实例.
     *
     * @param CancelSofamqConnectorplanRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CancelSofamqConnectorplanResponse
     */
    public function cancelSofamqConnectorplanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelSofamqConnectorplanResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorplan.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重置任务实例位点
     * Summary: 重置任务实例位点.
     *
     * @param SetSofamqConnectorplancheckpointRequest $request
     *
     * @return SetSofamqConnectorplancheckpointResponse
     */
    public function setSofamqConnectorplancheckpoint($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setSofamqConnectorplancheckpointEx($request, $headers, $runtime);
    }

    /**
     * Description: 重置任务实例位点
     * Summary: 重置任务实例位点.
     *
     * @param SetSofamqConnectorplancheckpointRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return SetSofamqConnectorplancheckpointResponse
     */
    public function setSofamqConnectorplancheckpointEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetSofamqConnectorplancheckpointResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorplancheckpoint.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 活跃的conenctor实例【常驻任务】
     * Summary: 活跃的conenctor实例.
     *
     * @param QuerySofamqConnectorplansingletonRequest $request
     *
     * @return QuerySofamqConnectorplansingletonResponse
     */
    public function querySofamqConnectorplansingleton($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectorplansingletonEx($request, $headers, $runtime);
    }

    /**
     * Description: 活跃的conenctor实例【常驻任务】
     * Summary: 活跃的conenctor实例.
     *
     * @param QuerySofamqConnectorplansingletonRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QuerySofamqConnectorplansingletonResponse
     */
    public function querySofamqConnectorplansingletonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectorplansingletonResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorplansingleton.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取延迟时间
     * Summary: 获取延迟时间.
     *
     * @param QuerySofamqConnectorjobdelayRequest $request
     *
     * @return QuerySofamqConnectorjobdelayResponse
     */
    public function querySofamqConnectorjobdelay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectorjobdelayEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取延迟时间
     * Summary: 获取延迟时间.
     *
     * @param QuerySofamqConnectorjobdelayRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QuerySofamqConnectorjobdelayResponse
     */
    public function querySofamqConnectorjobdelayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectorjobdelayResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorjobdelay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 常驻任务分区信息详情
     * Summary: 分区状态详情列名.
     *
     * @param QuerySofamqConnectorjobpartitionstatuscolumnRequest $request
     *
     * @return QuerySofamqConnectorjobpartitionstatuscolumnResponse
     */
    public function querySofamqConnectorjobpartitionstatuscolumn($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectorjobpartitionstatuscolumnEx($request, $headers, $runtime);
    }

    /**
     * Description: 常驻任务分区信息详情
     * Summary: 分区状态详情列名.
     *
     * @param QuerySofamqConnectorjobpartitionstatuscolumnRequest $request
     * @param string[]                                            $headers
     * @param RuntimeOptions                                      $runtime
     *
     * @return QuerySofamqConnectorjobpartitionstatuscolumnResponse
     */
    public function querySofamqConnectorjobpartitionstatuscolumnEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectorjobpartitionstatuscolumnResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorjobpartitionstatuscolumn.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分区状态分页查询
     * Summary: 分区状态分页查询.
     *
     * @param QuerySofamqConnectorjobpartitionstatusRequest $request
     *
     * @return QuerySofamqConnectorjobpartitionstatusResponse
     */
    public function querySofamqConnectorjobpartitionstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectorjobpartitionstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 分区状态分页查询
     * Summary: 分区状态分页查询.
     *
     * @param QuerySofamqConnectorjobpartitionstatusRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return QuerySofamqConnectorjobpartitionstatusResponse
     */
    public function querySofamqConnectorjobpartitionstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectorjobpartitionstatusResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectorjobpartitionstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 手动触发UI
     * Summary: 手动触发UI.
     *
     * @param QuerySofamqConnectortriggerconfigsRequest $request
     *
     * @return QuerySofamqConnectortriggerconfigsResponse
     */
    public function querySofamqConnectortriggerconfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConnectortriggerconfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: 手动触发UI
     * Summary: 手动触发UI.
     *
     * @param QuerySofamqConnectortriggerconfigsRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QuerySofamqConnectortriggerconfigsResponse
     */
    public function querySofamqConnectortriggerconfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConnectortriggerconfigsResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.connectortriggerconfigs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 清除消费进度
     * Summary: 清除消费进度.
     *
     * @param DeleteSofamqOffsetRequest $request
     *
     * @return DeleteSofamqOffsetResponse
     */
    public function deleteSofamqOffset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofamqOffsetEx($request, $headers, $runtime);
    }

    /**
     * Description: 清除消费进度
     * Summary: 清除消费进度.
     *
     * @param DeleteSofamqOffsetRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteSofamqOffsetResponse
     */
    public function deleteSofamqOffsetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofamqOffsetResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.offset.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户端查询消费进度
     * Summary: 用户端查询消费进度.
     *
     * @param QuerySofamqConsumptionRequest $request
     *
     * @return QuerySofamqConsumptionResponse
     */
    public function querySofamqConsumption($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofamqConsumptionEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户端查询消费进度
     * Summary: 用户端查询消费进度.
     *
     * @param QuerySofamqConsumptionRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QuerySofamqConsumptionResponse
     */
    public function querySofamqConsumptionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofamqConsumptionResponse::fromMap($this->doRequest('2.0', 'sofa.mq.sofamq.consumption.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户端topic的queue信息
     * Summary: 查询用户端topic的queue信息.
     *
     * @param QueryUserTopicqueueRequest $request
     *
     * @return QueryUserTopicqueueResponse
     */
    public function queryUserTopicqueue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserTopicqueueEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户端topic的queue信息
     * Summary: 查询用户端topic的queue信息.
     *
     * @param QueryUserTopicqueueRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryUserTopicqueueResponse
     */
    public function queryUserTopicqueueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserTopicqueueResponse::fromMap($this->doRequest('2.0', 'sofa.mq.user.topicqueue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update next delivery time
     * Summary: update delivery time.
     *
     * @param UpdateMessageNextdeliverytimeRequest $request
     *
     * @return UpdateMessageNextdeliverytimeResponse
     */
    public function updateMessageNextdeliverytime($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMessageNextdeliverytimeEx($request, $headers, $runtime);
    }

    /**
     * Description: update next delivery time
     * Summary: update delivery time.
     *
     * @param UpdateMessageNextdeliverytimeRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UpdateMessageNextdeliverytimeResponse
     */
    public function updateMessageNextdeliverytimeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMessageNextdeliverytimeResponse::fromMap($this->doRequest('2.0', 'sofa.mq.message.nextdeliverytime.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 统计未投递消息数量
     * Summary: 统计未投递消息数量.
     *
     * @param CountMessageUndeliveryRequest $request
     *
     * @return CountMessageUndeliveryResponse
     */
    public function countMessageUndelivery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countMessageUndeliveryEx($request, $headers, $runtime);
    }

    /**
     * Description: 统计未投递消息数量
     * Summary: 统计未投递消息数量.
     *
     * @param CountMessageUndeliveryRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CountMessageUndeliveryResponse
     */
    public function countMessageUndeliveryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountMessageUndeliveryResponse::fromMap($this->doRequest('2.0', 'sofa.mq.message.undelivery.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 加载任务SLO配置页面
     * Summary: 任务SLO配置.
     *
     * @param LoadConnectorjobSloviewRequest $request
     *
     * @return LoadConnectorjobSloviewResponse
     */
    public function loadConnectorjobSloview($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->loadConnectorjobSloviewEx($request, $headers, $runtime);
    }

    /**
     * Description: 加载任务SLO配置页面
     * Summary: 任务SLO配置.
     *
     * @param LoadConnectorjobSloviewRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return LoadConnectorjobSloviewResponse
     */
    public function loadConnectorjobSloviewEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LoadConnectorjobSloviewResponse::fromMap($this->doRequest('2.0', 'sofa.mq.connectorjob.sloview.load', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
