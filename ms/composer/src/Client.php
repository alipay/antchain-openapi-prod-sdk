<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\MS\Models\AddDdcsAttributeRequest;
use AntChain\MS\Models\AddDdcsAttributeResponse;
use AntChain\MS\Models\AddDdcsAttributesRequest;
use AntChain\MS\Models\AddDdcsAttributesResponse;
use AntChain\MS\Models\AddDdcsDataRequest;
use AntChain\MS\Models\AddDdcsDataResponse;
use AntChain\MS\Models\AddDdcsGraydataRequest;
use AntChain\MS\Models\AddDdcsGraydataResponse;
use AntChain\MS\Models\AddDdcsResourceRequest;
use AntChain\MS\Models\AddDdcsResourceResponse;
use AntChain\MS\Models\AddDdcsResourcesRequest;
use AntChain\MS\Models\AddDdcsResourcesResponse;
use AntChain\MS\Models\AddDdsJobRequest;
use AntChain\MS\Models\AddDdsJobResponse;
use AntChain\MS\Models\AddDrmDrmattributesRequest;
use AntChain\MS\Models\AddDrmDrmattributesResponse;
use AntChain\MS\Models\AddDrmDrmdataRequest;
use AntChain\MS\Models\AddDrmDrmdataResponse;
use AntChain\MS\Models\AddDrmDrmgraydataRequest;
use AntChain\MS\Models\AddDrmDrmgraydataResponse;
use AntChain\MS\Models\AddDrmDrmresourcesRequest;
use AntChain\MS\Models\AddDrmDrmresourcesResponse;
use AntChain\MS\Models\AddDrmDrmresourcetplinstancesRequest;
use AntChain\MS\Models\AddDrmDrmresourcetplinstancesResponse;
use AntChain\MS\Models\AddDrmDrmresourcetplsRequest;
use AntChain\MS\Models\AddDrmDrmresourcetplsResponse;
use AntChain\MS\Models\AddDssScheduleRequest;
use AntChain\MS\Models\AddDssScheduleResponse;
use AntChain\MS\Models\AddDssTaskRequest;
use AntChain\MS\Models\AddDssTaskResponse;
use AntChain\MS\Models\AddGuardianGuardianappsRequest;
use AntChain\MS\Models\AddGuardianGuardianappsResponse;
use AntChain\MS\Models\AddGuardianGuardiangrayrulesRequest;
use AntChain\MS\Models\AddGuardianGuardiangrayrulesResponse;
use AntChain\MS\Models\AddGuardianGuardianrulesRequest;
use AntChain\MS\Models\AddGuardianGuardianrulesResponse;
use AntChain\MS\Models\AddMsDdcsAttributeRequest;
use AntChain\MS\Models\AddMsDdcsAttributeResponse;
use AntChain\MS\Models\AddMsDdcsResourceRequest;
use AntChain\MS\Models\AddMsDdcsResourceResponse;
use AntChain\MS\Models\AddMsDssTaskRequest;
use AntChain\MS\Models\AddMsDssTaskResponse;
use AntChain\MS\Models\AddRcSyncbucketRequest;
use AntChain\MS\Models\AddRcSyncbucketResponse;
use AntChain\MS\Models\AddSafeCommunicationruleRequest;
use AntChain\MS\Models\AddSafeCommunicationruleResponse;
use AntChain\MS\Models\AddServiceClientRequest;
use AntChain\MS\Models\AddServiceClientResponse;
use AntChain\MS\Models\AddSgAuthrulegroupsbatchRequest;
use AntChain\MS\Models\AddSgAuthrulegroupsbatchResponse;
use AntChain\MS\Models\AddSgAuthrulesRequest;
use AntChain\MS\Models\AddSgAuthrulesResponse;
use AntChain\MS\Models\AddSgCircuitbreakerrulesRequest;
use AntChain\MS\Models\AddSgCircuitbreakerrulesResponse;
use AntChain\MS\Models\AddSgDowngradesRequest;
use AntChain\MS\Models\AddSgDowngradesResponse;
use AntChain\MS\Models\AddSgFaultinjectruleRequest;
use AntChain\MS\Models\AddSgFaultinjectruleResponse;
use AntChain\MS\Models\AddSgFaulttoleranceruleRequest;
use AntChain\MS\Models\AddSgFaulttoleranceruleResponse;
use AntChain\MS\Models\AddSgMeshclusterRequest;
use AntChain\MS\Models\AddSgMeshclusterResponse;
use AntChain\MS\Models\AddSgRouterrulegroupsRequest;
use AntChain\MS\Models\AddSgRouterrulegroupsResponse;
use AntChain\MS\Models\AddSgServiceratelimitrulesRequest;
use AntChain\MS\Models\AddSgServiceratelimitrulesResponse;
use AntChain\MS\Models\AddSgSidecarinjectRequest;
use AntChain\MS\Models\AddSgSidecarinjectResponse;
use AntChain\MS\Models\AddSgTrafficmirrorruleRequest;
use AntChain\MS\Models\AddSgTrafficmirrorruleResponse;
use AntChain\MS\Models\AddSofaOspCellRequest;
use AntChain\MS\Models\AddSofaOspCellResponse;
use AntChain\MS\Models\AddTransparentproxyAppRequest;
use AntChain\MS\Models\AddTransparentproxyAppResponse;
use AntChain\MS\Models\AddTransparentproxyNodeRequest;
use AntChain\MS\Models\AddTransparentproxyNodeResponse;
use AntChain\MS\Models\AllDrmDrmappsRequest;
use AntChain\MS\Models\AllDrmDrmappsResponse;
use AntChain\MS\Models\AllDrmDrmcellsRequest;
use AntChain\MS\Models\AllDrmDrmcellsResponse;
use AntChain\MS\Models\AllDrmDrmldccellsRequest;
use AntChain\MS\Models\AllDrmDrmldccellsResponse;
use AntChain\MS\Models\AllGuardianGuardianappnamesRequest;
use AntChain\MS\Models\AllGuardianGuardianappnamesResponse;
use AntChain\MS\Models\AllGuardianGuardianappsRequest;
use AntChain\MS\Models\AllGuardianGuardianappsResponse;
use AntChain\MS\Models\AllSgCircuitbreakerrulesRequest;
use AntChain\MS\Models\AllSgCircuitbreakerrulesResponse;
use AntChain\MS\Models\BatchquerySgServiceparamRequest;
use AntChain\MS\Models\BatchquerySgServiceparamResponse;
use AntChain\MS\Models\CallbackSpiOmsRequest;
use AntChain\MS\Models\CallbackSpiOmsResponse;
use AntChain\MS\Models\CancelDssSwitchoverRequest;
use AntChain\MS\Models\CancelDssSwitchoverResponse;
use AntChain\MS\Models\DeleteDdcsAttributeRequest;
use AntChain\MS\Models\DeleteDdcsAttributeResponse;
use AntChain\MS\Models\DeleteDdcsAttributesRequest;
use AntChain\MS\Models\DeleteDdcsAttributesResponse;
use AntChain\MS\Models\DeleteDdcsResourceRequest;
use AntChain\MS\Models\DeleteDdcsResourceResponse;
use AntChain\MS\Models\DeleteDdcsResourcesRequest;
use AntChain\MS\Models\DeleteDdcsResourcesResponse;
use AntChain\MS\Models\DeleteDdsJobRequest;
use AntChain\MS\Models\DeleteDdsJobResponse;
use AntChain\MS\Models\DeleteDrmDrmattributesRequest;
use AntChain\MS\Models\DeleteDrmDrmattributesResponse;
use AntChain\MS\Models\DeleteDrmDrmresourcesRequest;
use AntChain\MS\Models\DeleteDrmDrmresourcesResponse;
use AntChain\MS\Models\DeleteDrmDrmresourcetplsRequest;
use AntChain\MS\Models\DeleteDrmDrmresourcetplsResponse;
use AntChain\MS\Models\DeleteDssScheduleRequest;
use AntChain\MS\Models\DeleteDssScheduleResponse;
use AntChain\MS\Models\DeleteDssTaskRequest;
use AntChain\MS\Models\DeleteDssTaskResponse;
use AntChain\MS\Models\DeleteGuardianGuardianappsRequest;
use AntChain\MS\Models\DeleteGuardianGuardianappsResponse;
use AntChain\MS\Models\DeleteGuardianGuardianrulesRequest;
use AntChain\MS\Models\DeleteGuardianGuardianrulesResponse;
use AntChain\MS\Models\DeleteMsDdcsAttributeRequest;
use AntChain\MS\Models\DeleteMsDdcsAttributeResponse;
use AntChain\MS\Models\DeleteMsDdcsResourceRequest;
use AntChain\MS\Models\DeleteMsDdcsResourceResponse;
use AntChain\MS\Models\DeleteMsDssTaskRequest;
use AntChain\MS\Models\DeleteMsDssTaskResponse;
use AntChain\MS\Models\DeleteRcSynctaskRequest;
use AntChain\MS\Models\DeleteRcSynctaskResponse;
use AntChain\MS\Models\DeleteSafeCommunicationruleRequest;
use AntChain\MS\Models\DeleteSafeCommunicationruleResponse;
use AntChain\MS\Models\DeleteSgAuthrulesRequest;
use AntChain\MS\Models\DeleteSgAuthrulesResponse;
use AntChain\MS\Models\DeleteSgCircuitbreakerrulesRequest;
use AntChain\MS\Models\DeleteSgCircuitbreakerrulesResponse;
use AntChain\MS\Models\DeleteSgDowngradesRequest;
use AntChain\MS\Models\DeleteSgDowngradesResponse;
use AntChain\MS\Models\DeleteSgFaultinjectruleRequest;
use AntChain\MS\Models\DeleteSgFaultinjectruleResponse;
use AntChain\MS\Models\DeleteSgFaulttoleranceruleRequest;
use AntChain\MS\Models\DeleteSgFaulttoleranceruleResponse;
use AntChain\MS\Models\DeleteSgMeshclusterRequest;
use AntChain\MS\Models\DeleteSgMeshclusterResponse;
use AntChain\MS\Models\DeleteSgRouterrulegroupRequest;
use AntChain\MS\Models\DeleteSgRouterrulegroupResponse;
use AntChain\MS\Models\DeleteSgServiceratelimitrulesRequest;
use AntChain\MS\Models\DeleteSgServiceratelimitrulesResponse;
use AntChain\MS\Models\DeleteSgSidecarinjectRequest;
use AntChain\MS\Models\DeleteSgSidecarinjectResponse;
use AntChain\MS\Models\DeleteSgTrafficmirrorruleRequest;
use AntChain\MS\Models\DeleteSgTrafficmirrorruleResponse;
use AntChain\MS\Models\DeleteSofaOspCellRequest;
use AntChain\MS\Models\DeleteSofaOspCellResponse;
use AntChain\MS\Models\DeleteTransparentproxyAppRequest;
use AntChain\MS\Models\DeleteTransparentproxyAppResponse;
use AntChain\MS\Models\DeleteTransparentproxyNodeRequest;
use AntChain\MS\Models\DeleteTransparentproxyNodeResponse;
use AntChain\MS\Models\DisableSgAuthrulegroupsbatchRequest;
use AntChain\MS\Models\DisableSgAuthrulegroupsbatchResponse;
use AntChain\MS\Models\DisableSgAuthrulegroupsRequest;
use AntChain\MS\Models\DisableSgAuthrulegroupsResponse;
use AntChain\MS\Models\DisableSgAuthrulesRequest;
use AntChain\MS\Models\DisableSgAuthrulesResponse;
use AntChain\MS\Models\DisableSgDowngradegroupsRequest;
use AntChain\MS\Models\DisableSgDowngradegroupsResponse;
use AntChain\MS\Models\DisableSgDowngradesRequest;
use AntChain\MS\Models\DisableSgDowngradesResponse;
use AntChain\MS\Models\DisableSgServiceparamsRequest;
use AntChain\MS\Models\DisableSgServiceparamsResponse;
use AntChain\MS\Models\DisableTransparentproxyNodeRequest;
use AntChain\MS\Models\DisableTransparentproxyNodeResponse;
use AntChain\MS\Models\EnableSafeCommunicationruleRequest;
use AntChain\MS\Models\EnableSafeCommunicationruleResponse;
use AntChain\MS\Models\EnableSgAuthrulegroupsbatchRequest;
use AntChain\MS\Models\EnableSgAuthrulegroupsbatchResponse;
use AntChain\MS\Models\EnableSgAuthrulegroupsRequest;
use AntChain\MS\Models\EnableSgAuthrulegroupsResponse;
use AntChain\MS\Models\EnableSgAuthrulesRequest;
use AntChain\MS\Models\EnableSgAuthrulesResponse;
use AntChain\MS\Models\EnableSgCircuitbreakerrulesRequest;
use AntChain\MS\Models\EnableSgCircuitbreakerrulesResponse;
use AntChain\MS\Models\EnableSgDowngradegroupsRequest;
use AntChain\MS\Models\EnableSgDowngradegroupsResponse;
use AntChain\MS\Models\EnableSgDowngradesRequest;
use AntChain\MS\Models\EnableSgDowngradesResponse;
use AntChain\MS\Models\EnableSgFaulttoleranceruleRequest;
use AntChain\MS\Models\EnableSgFaulttoleranceruleResponse;
use AntChain\MS\Models\EnableSgRouterrulesRequest;
use AntChain\MS\Models\EnableSgRouterrulesResponse;
use AntChain\MS\Models\EnableSgServiceparamsRequest;
use AntChain\MS\Models\EnableSgServiceparamsResponse;
use AntChain\MS\Models\EnableTransparentproxyNodeRequest;
use AntChain\MS\Models\EnableTransparentproxyNodeResponse;
use AntChain\MS\Models\ExecuteDssSwitchoverRequest;
use AntChain\MS\Models\ExecuteDssSwitchoverResponse;
use AntChain\MS\Models\ExportDrmDrmresourcesRequest;
use AntChain\MS\Models\ExportDrmDrmresourcesResponse;
use AntChain\MS\Models\ExportGuardianGuardianrulesRequest;
use AntChain\MS\Models\ExportGuardianGuardianrulesResponse;
use AntChain\MS\Models\ExportSgAuthrulegroupsRequest;
use AntChain\MS\Models\ExportSgAuthrulegroupsResponse;
use AntChain\MS\Models\ExportSgResourceRequest;
use AntChain\MS\Models\ExportSgResourceResponse;
use AntChain\MS\Models\GetDdcsAttributesRequest;
use AntChain\MS\Models\GetDdcsAttributesResponse;
use AntChain\MS\Models\GetDdcsResourcesRequest;
use AntChain\MS\Models\GetDdcsResourcesResponse;
use AntChain\MS\Models\GetDdsJobRequest;
use AntChain\MS\Models\GetDdsJobResponse;
use AntChain\MS\Models\GetDrmDrmattributesRequest;
use AntChain\MS\Models\GetDrmDrmattributesResponse;
use AntChain\MS\Models\GetDrmUploadurlRequest;
use AntChain\MS\Models\GetDrmUploadurlResponse;
use AntChain\MS\Models\GetGuardianGuardianappsRequest;
use AntChain\MS\Models\GetGuardianGuardianappsResponse;
use AntChain\MS\Models\GetGuardianGuardianconfigRequest;
use AntChain\MS\Models\GetGuardianGuardianconfigResponse;
use AntChain\MS\Models\GetGuardianGuardianrulesRequest;
use AntChain\MS\Models\GetGuardianGuardianrulesResponse;
use AntChain\MS\Models\GetMiddlewareInstanceRequest;
use AntChain\MS\Models\GetMiddlewareInstanceResponse;
use AntChain\MS\Models\GetSafeCommunicationruleRequest;
use AntChain\MS\Models\GetSafeCommunicationruleResponse;
use AntChain\MS\Models\GetSgCircuitbreakerrulesRequest;
use AntChain\MS\Models\GetSgCircuitbreakerrulesResponse;
use AntChain\MS\Models\GetSgEnvconfigRequest;
use AntChain\MS\Models\GetSgEnvconfigResponse;
use AntChain\MS\Models\GetSgRelationswitchRequest;
use AntChain\MS\Models\GetSgRelationswitchResponse;
use AntChain\MS\Models\GetSgRouterrulesnapshotsRequest;
use AntChain\MS\Models\GetSgRouterrulesnapshotsResponse;
use AntChain\MS\Models\GetSgRouterrulesRequest;
use AntChain\MS\Models\GetSgRouterrulesResponse;
use AntChain\MS\Models\ImportDrmDrmresourcesRequest;
use AntChain\MS\Models\ImportDrmDrmresourcesResponse;
use AntChain\MS\Models\ImportGuardianGuardianrulesRequest;
use AntChain\MS\Models\ImportGuardianGuardianrulesResponse;
use AntChain\MS\Models\ImportSgAuthrulegroupsRequest;
use AntChain\MS\Models\ImportSgAuthrulegroupsResponse;
use AntChain\MS\Models\ImportSgResourceRequest;
use AntChain\MS\Models\ImportSgResourceResponse;
use AntChain\MS\Models\ListDrmDrmdatacellsRequest;
use AntChain\MS\Models\ListDrmDrmdatacellsResponse;
use AntChain\MS\Models\ListDrmDrmpushlogsRequest;
use AntChain\MS\Models\ListDrmDrmpushlogsResponse;
use AntChain\MS\Models\ListDssIdcRequest;
use AntChain\MS\Models\ListDssIdcResponse;
use AntChain\MS\Models\ListGuardianGuardianrulepushhistorysRequest;
use AntChain\MS\Models\ListGuardianGuardianrulepushhistorysResponse;
use AntChain\MS\Models\ListSafeCommunicationrulesRequest;
use AntChain\MS\Models\ListSafeCommunicationrulesResponse;
use AntChain\MS\Models\ListSgAppsRequest;
use AntChain\MS\Models\ListSgAppsResponse;
use AntChain\MS\Models\ListSgAuditlogsRequest;
use AntChain\MS\Models\ListSgAuditlogsResponse;
use AntChain\MS\Models\ListSgAuthruleactiveappnamesRequest;
use AntChain\MS\Models\ListSgAuthruleactiveappnamesResponse;
use AntChain\MS\Models\ListSgAuthruleactivedataidsRequest;
use AntChain\MS\Models\ListSgAuthruleactivedataidsResponse;
use AntChain\MS\Models\ListSgAuthruleappnamesRequest;
use AntChain\MS\Models\ListSgAuthruleappnamesResponse;
use AntChain\MS\Models\ListSgAuthruledataidsRequest;
use AntChain\MS\Models\ListSgAuthruledataidsResponse;
use AntChain\MS\Models\ListSgAuthrulegroupappsRequest;
use AntChain\MS\Models\ListSgAuthrulegroupappsResponse;
use AntChain\MS\Models\ListSgAuthrulegroupservicesRequest;
use AntChain\MS\Models\ListSgAuthrulegroupservicesResponse;
use AntChain\MS\Models\ListSgAuthrulegroupsRequest;
use AntChain\MS\Models\ListSgAuthrulegroupsResponse;
use AntChain\MS\Models\ListSgCircuitbreakerrulesRequest;
use AntChain\MS\Models\ListSgCircuitbreakerrulesResponse;
use AntChain\MS\Models\ListSgFaultinjectallappsRequest;
use AntChain\MS\Models\ListSgFaultinjectallappsResponse;
use AntChain\MS\Models\ListSgFaultinjectallservicesRequest;
use AntChain\MS\Models\ListSgFaultinjectallservicesResponse;
use AntChain\MS\Models\ListSgFaultinjectappsRequest;
use AntChain\MS\Models\ListSgFaultinjectappsResponse;
use AntChain\MS\Models\ListSgFaultinjectrulesRequest;
use AntChain\MS\Models\ListSgFaultinjectrulesResponse;
use AntChain\MS\Models\ListSgFaulttoleranceappsRequest;
use AntChain\MS\Models\ListSgFaulttoleranceappsResponse;
use AntChain\MS\Models\ListSgFaulttolerancerulesRequest;
use AntChain\MS\Models\ListSgFaulttolerancerulesResponse;
use AntChain\MS\Models\ListSgMeshclusterRequest;
use AntChain\MS\Models\ListSgMeshclusterResponse;
use AntChain\MS\Models\ListSgRouterruleallappsRequest;
use AntChain\MS\Models\ListSgRouterruleallappsResponse;
use AntChain\MS\Models\ListSgRouterruleallservicesRequest;
use AntChain\MS\Models\ListSgRouterruleallservicesResponse;
use AntChain\MS\Models\ListSgRouterruleappnamesRequest;
use AntChain\MS\Models\ListSgRouterruleappnamesResponse;
use AntChain\MS\Models\ListSgRouterrulegroupappsRequest;
use AntChain\MS\Models\ListSgRouterrulegroupappsResponse;
use AntChain\MS\Models\ListSgRouterrulegroupsRequest;
use AntChain\MS\Models\ListSgRouterrulegroupsResponse;
use AntChain\MS\Models\ListSgRouterruleversionsRequest;
use AntChain\MS\Models\ListSgRouterruleversionsResponse;
use AntChain\MS\Models\ListSgServiceappsRequest;
use AntChain\MS\Models\ListSgServiceappsResponse;
use AntChain\MS\Models\ListSgServicepubsRequest;
use AntChain\MS\Models\ListSgServicepubsResponse;
use AntChain\MS\Models\ListSgServiceratelimitrulesRequest;
use AntChain\MS\Models\ListSgServiceratelimitrulesResponse;
use AntChain\MS\Models\ListSgServicesubsRequest;
use AntChain\MS\Models\ListSgServicesubsResponse;
use AntChain\MS\Models\ListSgSidecarinjectRequest;
use AntChain\MS\Models\ListSgSidecarinjectResponse;
use AntChain\MS\Models\ListSgTrafficmirrorallappsRequest;
use AntChain\MS\Models\ListSgTrafficmirrorallappsResponse;
use AntChain\MS\Models\ListSgTrafficmirrorappsRequest;
use AntChain\MS\Models\ListSgTrafficmirrorappsResponse;
use AntChain\MS\Models\ListSgTrafficmirrorrulesRequest;
use AntChain\MS\Models\ListSgTrafficmirrorrulesResponse;
use AntChain\MS\Models\ListSgTrafficmirrorservicesRequest;
use AntChain\MS\Models\ListSgTrafficmirrorservicesResponse;
use AntChain\MS\Models\ListSofaOspInstanceRequest;
use AntChain\MS\Models\ListSofaOspInstanceResponse;
use AntChain\MS\Models\ListUndisplayComponentsRequest;
use AntChain\MS\Models\ListUndisplayComponentsResponse;
use AntChain\MS\Models\LogoutRegistryServiceRequest;
use AntChain\MS\Models\LogoutRegistryServiceResponse;
use AntChain\MS\Models\OfflineSgServicepublishersRequest;
use AntChain\MS\Models\OfflineSgServicepublishersResponse;
use AntChain\MS\Models\OnlineRegistryServiceRequest;
use AntChain\MS\Models\OnlineRegistryServiceResponse;
use AntChain\MS\Models\PersistpushDdcsDataRequest;
use AntChain\MS\Models\PersistpushDdcsDataResponse;
use AntChain\MS\Models\PersistpushMsDdcsRequest;
use AntChain\MS\Models\PersistpushMsDdcsResponse;
use AntChain\MS\Models\QueryclientsMsDdcsRequest;
use AntChain\MS\Models\QueryclientsMsDdcsResponse;
use AntChain\MS\Models\QueryDdcsAttributesRequest;
use AntChain\MS\Models\QueryDdcsAttributesResponse;
use AntChain\MS\Models\QueryDdcsClientsRequest;
use AntChain\MS\Models\QueryDdcsClientsResponse;
use AntChain\MS\Models\QueryDdcsClientvalueRequest;
use AntChain\MS\Models\QueryDdcsClientvalueResponse;
use AntChain\MS\Models\QueryDdcsDataRequest;
use AntChain\MS\Models\QueryDdcsDataResponse;
use AntChain\MS\Models\QueryDdcsPushhistoryRequest;
use AntChain\MS\Models\QueryDdcsPushhistoryResponse;
use AntChain\MS\Models\QueryDdcsResourcesRequest;
use AntChain\MS\Models\QueryDdcsResourcesResponse;
use AntChain\MS\Models\QueryDdsJobsRequest;
use AntChain\MS\Models\QueryDdsJobsResponse;
use AntChain\MS\Models\QueryDrmDrmclientsRequest;
use AntChain\MS\Models\QueryDrmDrmclientsResponse;
use AntChain\MS\Models\QueryDrmDrmhostsRequest;
use AntChain\MS\Models\QueryDrmDrmhostsResponse;
use AntChain\MS\Models\QueryDrmDrmpushlogsRequest;
use AntChain\MS\Models\QueryDrmDrmpushlogsResponse;
use AntChain\MS\Models\QueryDrmDrmresourcesRequest;
use AntChain\MS\Models\QueryDrmDrmresourcesResponse;
use AntChain\MS\Models\QueryDrmDrmresourcetplsRequest;
use AntChain\MS\Models\QueryDrmDrmresourcetplsResponse;
use AntChain\MS\Models\QueryDssScheduleRequest;
use AntChain\MS\Models\QueryDssScheduleResponse;
use AntChain\MS\Models\QueryDssStrategyRequest;
use AntChain\MS\Models\QueryDssStrategyResponse;
use AntChain\MS\Models\QueryDssSwitchoverRequest;
use AntChain\MS\Models\QueryDssSwitchoverResponse;
use AntChain\MS\Models\QueryDssZoneRequest;
use AntChain\MS\Models\QueryDssZoneResponse;
use AntChain\MS\Models\QueryGuardianGuardianappsRequest;
use AntChain\MS\Models\QueryGuardianGuardianappsResponse;
use AntChain\MS\Models\QueryGuardianGuardianrulepushhistorysRequest;
use AntChain\MS\Models\QueryGuardianGuardianrulepushhistorysResponse;
use AntChain\MS\Models\QueryGuardianGuardianrulesRequest;
use AntChain\MS\Models\QueryGuardianGuardianrulesResponse;
use AntChain\MS\Models\QueryMeshSidecarRequest;
use AntChain\MS\Models\QueryMeshSidecarResponse;
use AntChain\MS\Models\QueryMsDssTaskStrategyRequest;
use AntChain\MS\Models\QueryMsDssTaskStrategyResponse;
use AntChain\MS\Models\QueryRcSyncclusterRequest;
use AntChain\MS\Models\QueryRcSyncclusterResponse;
use AntChain\MS\Models\QueryRcSyncdataRequest;
use AntChain\MS\Models\QueryRcSyncdataResponse;
use AntChain\MS\Models\QueryRcSynctaskRequest;
use AntChain\MS\Models\QueryRcSynctaskResponse;
use AntChain\MS\Models\QueryServicePublisherRequest;
use AntChain\MS\Models\QueryServicePublisherResponse;
use AntChain\MS\Models\QueryServiceRequest;
use AntChain\MS\Models\QueryServiceResponse;
use AntChain\MS\Models\QueryServiceSubscriberRequest;
use AntChain\MS\Models\QueryServiceSubscriberResponse;
use AntChain\MS\Models\QuerySgApprelationsRequest;
use AntChain\MS\Models\QuerySgApprelationsResponse;
use AntChain\MS\Models\QuerySgCircuitbreakerrulesRequest;
use AntChain\MS\Models\QuerySgCircuitbreakerrulesResponse;
use AntChain\MS\Models\QuerySgDowngradegroupsRequest;
use AntChain\MS\Models\QuerySgDowngradegroupsResponse;
use AntChain\MS\Models\QuerySgFormconfigRequest;
use AntChain\MS\Models\QuerySgFormconfigResponse;
use AntChain\MS\Models\QuerySgRouterruledispatchlogsRequest;
use AntChain\MS\Models\QuerySgRouterruledispatchlogsResponse;
use AntChain\MS\Models\QuerySgRouterrulestatusRequest;
use AntChain\MS\Models\QuerySgRouterrulestatusResponse;
use AntChain\MS\Models\QuerySgServicekeywordRequest;
use AntChain\MS\Models\QuerySgServicekeywordResponse;
use AntChain\MS\Models\QuerySgServicepubkeysRequest;
use AntChain\MS\Models\QuerySgServicepubkeysResponse;
use AntChain\MS\Models\QuerySgServicepublishersRequest;
use AntChain\MS\Models\QuerySgServicepublishersResponse;
use AntChain\MS\Models\QuerySgServicepubrelationsRequest;
use AntChain\MS\Models\QuerySgServicepubrelationsResponse;
use AntChain\MS\Models\QuerySgServicepubsRequest;
use AntChain\MS\Models\QuerySgServicepubsResponse;
use AntChain\MS\Models\QuerySgServiceratelimitrulesRequest;
use AntChain\MS\Models\QuerySgServiceratelimitrulesResponse;
use AntChain\MS\Models\QuerySgServicesRequest;
use AntChain\MS\Models\QuerySgServicesResponse;
use AntChain\MS\Models\QuerySgServicesubkeysRequest;
use AntChain\MS\Models\QuerySgServicesubkeysResponse;
use AntChain\MS\Models\QuerySgServicesubrelationsRequest;
use AntChain\MS\Models\QuerySgServicesubrelationsResponse;
use AntChain\MS\Models\QuerySgServicesubscribersRequest;
use AntChain\MS\Models\QuerySgServicesubscribersResponse;
use AntChain\MS\Models\QuerySgServicesubsRequest;
use AntChain\MS\Models\QuerySgServicesubsResponse;
use AntChain\MS\Models\QuerySgServicesummarysRequest;
use AntChain\MS\Models\QuerySgServicesummarysResponse;
use AntChain\MS\Models\QuerySofaOspCellRequest;
use AntChain\MS\Models\QuerySofaOspCellResponse;
use AntChain\MS\Models\QueryTransparentproxyAppRequest;
use AntChain\MS\Models\QueryTransparentproxyAppResponse;
use AntChain\MS\Models\QueryTransparentproxyLogRequest;
use AntChain\MS\Models\QueryTransparentproxyLogResponse;
use AntChain\MS\Models\QueryTransparentproxyNodeRequest;
use AntChain\MS\Models\QueryTransparentproxyNodeResponse;
use AntChain\MS\Models\QueryTransparentproxySidecarlinkRequest;
use AntChain\MS\Models\QueryTransparentproxySidecarlinkResponse;
use AntChain\MS\Models\ReinitRcSyncclusterRequest;
use AntChain\MS\Models\ReinitRcSyncclusterResponse;
use AntChain\MS\Models\ReinitSgAuthrulesRequest;
use AntChain\MS\Models\ReinitSgAuthrulesResponse;
use AntChain\MS\Models\ReinitSgServiceparamsRequest;
use AntChain\MS\Models\ReinitSgServiceparamsResponse;
use AntChain\MS\Models\RetrySgAuthrulegroupsRequest;
use AntChain\MS\Models\RetrySgAuthrulegroupsResponse;
use AntChain\MS\Models\RollbackDdcsDataRequest;
use AntChain\MS\Models\RollbackDdcsDataResponse;
use AntChain\MS\Models\RollbackSgRouterrulesnapshotsRequest;
use AntChain\MS\Models\RollbackSgRouterrulesnapshotsResponse;
use AntChain\MS\Models\SaveSgAuthrulegroupsRequest;
use AntChain\MS\Models\SaveSgAuthrulegroupsResponse;
use AntChain\MS\Models\SearchDdcsResourceRequest;
use AntChain\MS\Models\SearchDdcsResourceResponse;
use AntChain\MS\Models\SearchDssTaskRequest;
use AntChain\MS\Models\SearchDssTaskResponse;
use AntChain\MS\Models\SearchMsDdcsResourceRequest;
use AntChain\MS\Models\SearchMsDdcsResourceResponse;
use AntChain\MS\Models\SearchMsDssTaskRequest;
use AntChain\MS\Models\SearchMsDssTaskResponse;
use AntChain\MS\Models\SetSgCircuitbreakerrulesRequest;
use AntChain\MS\Models\SetSgCircuitbreakerrulesResponse;
use AntChain\MS\Models\SetSgServiceparamweightRequest;
use AntChain\MS\Models\SetSgServiceparamweightResponse;
use AntChain\MS\Models\StartRcSynctaskRequest;
use AntChain\MS\Models\StartRcSynctaskResponse;
use AntChain\MS\Models\StopRcSynctaskRequest;
use AntChain\MS\Models\StopRcSynctaskResponse;
use AntChain\MS\Models\SyncSgServiceclientsRequest;
use AntChain\MS\Models\SyncSgServiceclientsResponse;
use AntChain\MS\Models\SyncSgServiceheartbeatsRequest;
use AntChain\MS\Models\SyncSgServiceheartbeatsResponse;
use AntChain\MS\Models\SyncSgServicepublishersRequest;
use AntChain\MS\Models\SyncSgServicepublishersResponse;
use AntChain\MS\Models\SyncSgServicesubscribersRequest;
use AntChain\MS\Models\SyncSgServicesubscribersResponse;
use AntChain\MS\Models\UpdateDdcsAttributeRequest;
use AntChain\MS\Models\UpdateDdcsAttributeResponse;
use AntChain\MS\Models\UpdateDdcsAttributesRequest;
use AntChain\MS\Models\UpdateDdcsAttributesResponse;
use AntChain\MS\Models\UpdateDdcsResourceRequest;
use AntChain\MS\Models\UpdateDdcsResourceResponse;
use AntChain\MS\Models\UpdateDdcsResourcesRequest;
use AntChain\MS\Models\UpdateDdcsResourcesResponse;
use AntChain\MS\Models\UpdateDdsJobRequest;
use AntChain\MS\Models\UpdateDdsJobResponse;
use AntChain\MS\Models\UpdateDdsJobStatusRequest;
use AntChain\MS\Models\UpdateDdsJobStatusResponse;
use AntChain\MS\Models\UpdateDrmDrmattributesRequest;
use AntChain\MS\Models\UpdateDrmDrmattributesResponse;
use AntChain\MS\Models\UpdateDrmDrmresourcesRequest;
use AntChain\MS\Models\UpdateDrmDrmresourcesResponse;
use AntChain\MS\Models\UpdateDrmDrmresourcetplsRequest;
use AntChain\MS\Models\UpdateDrmDrmresourcetplsResponse;
use AntChain\MS\Models\UpdateDssScheduleRequest;
use AntChain\MS\Models\UpdateDssScheduleResponse;
use AntChain\MS\Models\UpdateDssTaskRequest;
use AntChain\MS\Models\UpdateDssTaskResponse;
use AntChain\MS\Models\UpdateGuardianGuardianappsRequest;
use AntChain\MS\Models\UpdateGuardianGuardianappsResponse;
use AntChain\MS\Models\UpdateGuardianGuardiangrayrulestatusRequest;
use AntChain\MS\Models\UpdateGuardianGuardiangrayrulestatusResponse;
use AntChain\MS\Models\UpdateGuardianGuardianrulesRequest;
use AntChain\MS\Models\UpdateGuardianGuardianrulesResponse;
use AntChain\MS\Models\UpdateGuardianGuardianrulestatusRequest;
use AntChain\MS\Models\UpdateGuardianGuardianrulestatusResponse;
use AntChain\MS\Models\UpdateMsDdcsAttributeRequest;
use AntChain\MS\Models\UpdateMsDdcsAttributeResponse;
use AntChain\MS\Models\UpdateMsDdcsResourceRequest;
use AntChain\MS\Models\UpdateMsDdcsResourceResponse;
use AntChain\MS\Models\UpdateMsDssTaskRequest;
use AntChain\MS\Models\UpdateMsDssTaskResponse;
use AntChain\MS\Models\UpdateSafeCommunicationruleRequest;
use AntChain\MS\Models\UpdateSafeCommunicationruleResponse;
use AntChain\MS\Models\UpdateSgAuthrulesRequest;
use AntChain\MS\Models\UpdateSgAuthrulesResponse;
use AntChain\MS\Models\UpdateSgCircuitbreakerrulesRequest;
use AntChain\MS\Models\UpdateSgCircuitbreakerrulesResponse;
use AntChain\MS\Models\UpdateSgDowngradesRequest;
use AntChain\MS\Models\UpdateSgDowngradesResponse;
use AntChain\MS\Models\UpdateSgFaultinjectruleRequest;
use AntChain\MS\Models\UpdateSgFaultinjectruleResponse;
use AntChain\MS\Models\UpdateSgFaultinjectrulestatusRequest;
use AntChain\MS\Models\UpdateSgFaultinjectrulestatusResponse;
use AntChain\MS\Models\UpdateSgFaulttoleranceruleRequest;
use AntChain\MS\Models\UpdateSgFaulttoleranceruleResponse;
use AntChain\MS\Models\UpdateSgListauthrulesRequest;
use AntChain\MS\Models\UpdateSgListauthrulesResponse;
use AntChain\MS\Models\UpdateSgMeshclusterstatusRequest;
use AntChain\MS\Models\UpdateSgMeshclusterstatusResponse;
use AntChain\MS\Models\UpdateSgRouterrulegroupsRequest;
use AntChain\MS\Models\UpdateSgRouterrulegroupsResponse;
use AntChain\MS\Models\UpdateSgRouterrulegroupstatusRequest;
use AntChain\MS\Models\UpdateSgRouterrulegroupstatusResponse;
use AntChain\MS\Models\UpdateSgServiceratelimitrulesRequest;
use AntChain\MS\Models\UpdateSgServiceratelimitrulesResponse;
use AntChain\MS\Models\UpdateSgServiceratelimitrulestatusRequest;
use AntChain\MS\Models\UpdateSgServiceratelimitrulestatusResponse;
use AntChain\MS\Models\UpdateSgSidecarinjectRequest;
use AntChain\MS\Models\UpdateSgSidecarinjectResponse;
use AntChain\MS\Models\UpdateSgSidecarinjectstatusRequest;
use AntChain\MS\Models\UpdateSgSidecarinjectstatusResponse;
use AntChain\MS\Models\UpdateSgTrafficmirrorruleRequest;
use AntChain\MS\Models\UpdateSgTrafficmirrorruleResponse;
use AntChain\MS\Models\UpdateSgTrafficmirrorrulestatusRequest;
use AntChain\MS\Models\UpdateSgTrafficmirrorrulestatusResponse;
use AntChain\MS\Models\UpdateTransparentproxyConfigRequest;
use AntChain\MS\Models\UpdateTransparentproxyConfigResponse;
use AntChain\MS\Models\UpdateTransparentproxyProtocolconfigRequest;
use AntChain\MS\Models\UpdateTransparentproxyProtocolconfigResponse;
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
            // 动态资源的属性
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
                    'sdk_version'      => '3.4.0',
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
     * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
     * Summary: 动态配置持久化推送
     *
     * @param PersistpushMsDdcsRequest $request
     *
     * @return PersistpushMsDdcsResponse
     */
    public function persistpushMsDdcs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->persistpushMsDdcsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
     * Summary: 动态配置持久化推送
     *
     * @param PersistpushMsDdcsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PersistpushMsDdcsResponse
     */
    public function persistpushMsDdcsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PersistpushMsDdcsResponse::fromMap($this->doRequest('1.0', 'ms.ddcs.persistpush', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
     * Summary: 查询动态配置订阅客户端.
     *
     * @param QueryclientsMsDdcsRequest $request
     *
     * @return QueryclientsMsDdcsResponse
     */
    public function queryclientsMsDdcs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryclientsMsDdcsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
     * Summary: 查询动态配置订阅客户端.
     *
     * @param QueryclientsMsDdcsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryclientsMsDdcsResponse
     */
    public function queryclientsMsDdcsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryclientsMsDdcsResponse::fromMap($this->doRequest('1.0', 'ms.ddcs.queryclients', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-添加动态资源
     * Summary: 添加 DDCS 资源.
     *
     * @param AddMsDdcsResourceRequest $request
     *
     * @return AddMsDdcsResourceResponse
     */
    public function addMsDdcsResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addMsDdcsResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-添加动态资源
     * Summary: 添加 DDCS 资源.
     *
     * @param AddMsDdcsResourceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AddMsDdcsResourceResponse
     */
    public function addMsDdcsResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddMsDdcsResourceResponse::fromMap($this->doRequest('1.0', 'ms.ddcs.resource.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-编辑动态资源
     * Summary: 编辑 DDCS 资源.
     *
     * @param UpdateMsDdcsResourceRequest $request
     *
     * @return UpdateMsDdcsResourceResponse
     */
    public function updateMsDdcsResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMsDdcsResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-编辑动态资源
     * Summary: 编辑 DDCS 资源.
     *
     * @param UpdateMsDdcsResourceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateMsDdcsResourceResponse
     */
    public function updateMsDdcsResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMsDdcsResourceResponse::fromMap($this->doRequest('1.0', 'ms.ddcs.resource.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-删除动态资源
     * Summary: 删除 DDCS 资源.
     *
     * @param DeleteMsDdcsResourceRequest $request
     *
     * @return DeleteMsDdcsResourceResponse
     */
    public function deleteMsDdcsResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMsDdcsResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-删除动态资源
     * Summary: 删除 DDCS 资源.
     *
     * @param DeleteMsDdcsResourceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteMsDdcsResourceResponse
     */
    public function deleteMsDdcsResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMsDdcsResourceResponse::fromMap($this->doRequest('1.0', 'ms.ddcs.resource.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-添加属性
     * Summary: 添加属性.
     *
     * @param AddMsDdcsAttributeRequest $request
     *
     * @return AddMsDdcsAttributeResponse
     */
    public function addMsDdcsAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addMsDdcsAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-添加属性
     * Summary: 添加属性.
     *
     * @param AddMsDdcsAttributeRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AddMsDdcsAttributeResponse
     */
    public function addMsDdcsAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddMsDdcsAttributeResponse::fromMap($this->doRequest('1.0', 'ms.ddcs.attribute.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-编辑属性
     * Summary: 编辑属性.
     *
     * @param UpdateMsDdcsAttributeRequest $request
     *
     * @return UpdateMsDdcsAttributeResponse
     */
    public function updateMsDdcsAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMsDdcsAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-编辑属性
     * Summary: 编辑属性.
     *
     * @param UpdateMsDdcsAttributeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateMsDdcsAttributeResponse
     */
    public function updateMsDdcsAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMsDdcsAttributeResponse::fromMap($this->doRequest('1.0', 'ms.ddcs.attribute.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-删除属性
     * Summary: 删除属性.
     *
     * @param DeleteMsDdcsAttributeRequest $request
     *
     * @return DeleteMsDdcsAttributeResponse
     */
    public function deleteMsDdcsAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMsDdcsAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-删除属性
     * Summary: 删除属性.
     *
     * @param DeleteMsDdcsAttributeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteMsDdcsAttributeResponse
     */
    public function deleteMsDdcsAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMsDdcsAttributeResponse::fromMap($this->doRequest('1.0', 'ms.ddcs.attribute.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-查找动态配置
     * Summary: 查找动态资源.
     *
     * @param SearchMsDdcsResourceRequest $request
     *
     * @return SearchMsDdcsResourceResponse
     */
    public function searchMsDdcsResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->searchMsDdcsResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-查找动态配置
     * Summary: 查找动态资源.
     *
     * @param SearchMsDdcsResourceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SearchMsDdcsResourceResponse
     */
    public function searchMsDdcsResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SearchMsDdcsResourceResponse::fromMap($this->doRequest('1.0', 'ms.ddcs.resource.search', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-添加调度任务
     * Summary: 添加调度任务
     *
     * @param AddMsDssTaskRequest $request
     *
     * @return AddMsDssTaskResponse
     */
    public function addMsDssTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addMsDssTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-添加调度任务
     * Summary: 添加调度任务
     *
     * @param AddMsDssTaskRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AddMsDssTaskResponse
     */
    public function addMsDssTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddMsDssTaskResponse::fromMap($this->doRequest('1.0', 'ms.dss.task.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-编辑调度任务
     * Summary: 编辑调度任务
     *
     * @param UpdateMsDssTaskRequest $request
     *
     * @return UpdateMsDssTaskResponse
     */
    public function updateMsDssTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMsDssTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-编辑调度任务
     * Summary: 编辑调度任务
     *
     * @param UpdateMsDssTaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateMsDssTaskResponse
     */
    public function updateMsDssTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMsDssTaskResponse::fromMap($this->doRequest('1.0', 'ms.dss.task.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务
     * Summary: 删除调度任务
     *
     * @param DeleteMsDssTaskRequest $request
     *
     * @return DeleteMsDssTaskResponse
     */
    public function deleteMsDssTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMsDssTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务
     * Summary: 删除调度任务
     *
     * @param DeleteMsDssTaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteMsDssTaskResponse
     */
    public function deleteMsDssTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMsDssTaskResponse::fromMap($this->doRequest('1.0', 'ms.dss.task.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务
     * Summary: 查找调度任务
     *
     * @param SearchMsDssTaskRequest $request
     *
     * @return SearchMsDssTaskResponse
     */
    public function searchMsDssTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->searchMsDssTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务
     * Summary: 查找调度任务
     *
     * @param SearchMsDssTaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SearchMsDssTaskResponse
     */
    public function searchMsDssTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SearchMsDssTaskResponse::fromMap($this->doRequest('1.0', 'ms.dss.task.search', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
     * Summary: 通过策略名称查询策略.
     *
     * @param QueryMsDssTaskStrategyRequest $request
     *
     * @return QueryMsDssTaskStrategyResponse
     */
    public function queryMsDssTaskStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMsDssTaskStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
     * Summary: 通过策略名称查询策略.
     *
     * @param QueryMsDssTaskStrategyRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryMsDssTaskStrategyResponse
     */
    public function queryMsDssTaskStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMsDssTaskStrategyResponse::fromMap($this->doRequest('1.0', 'ms.dss.task.strategy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-机房信息(独占版)
     * Summary: 获取部署调度任务的所有机房
     *
     * @param ListDssIdcRequest $request
     *
     * @return ListDssIdcResponse
     */
    public function listDssIdc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDssIdcEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-机房信息(独占版)
     * Summary: 获取部署调度任务的所有机房
     *
     * @param ListDssIdcRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListDssIdcResponse
     */
    public function listDssIdcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDssIdcResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.idc.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-增加任务(独占版)
     * Summary: 独占版添加调度任务
     *
     * @param AddDssScheduleRequest $request
     *
     * @return AddDssScheduleResponse
     */
    public function addDssSchedule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDssScheduleEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-增加任务(独占版)
     * Summary: 独占版添加调度任务
     *
     * @param AddDssScheduleRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AddDssScheduleResponse
     */
    public function addDssScheduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDssScheduleResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.schedule.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-更新任务(独占版)
     * Summary: 更新调度任务
     *
     * @param UpdateDssScheduleRequest $request
     *
     * @return UpdateDssScheduleResponse
     */
    public function updateDssSchedule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDssScheduleEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-更新任务(独占版)
     * Summary: 更新调度任务
     *
     * @param UpdateDssScheduleRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateDssScheduleResponse
     */
    public function updateDssScheduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDssScheduleResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.schedule.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-查询调度任务(独占版)
     * Summary: 分页查询调度任务
     *
     * @param QueryDssScheduleRequest $request
     *
     * @return QueryDssScheduleResponse
     */
    public function queryDssSchedule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDssScheduleEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查询调度任务(独占版)
     * Summary: 分页查询调度任务
     *
     * @param QueryDssScheduleRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDssScheduleResponse
     */
    public function queryDssScheduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDssScheduleResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.schedule.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
     * Summary: 动态配置持久化推送
     *
     * @param PersistpushDdcsDataRequest $request
     *
     * @return PersistpushDdcsDataResponse
     */
    public function persistpushDdcsData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->persistpushDdcsDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
     * Summary: 动态配置持久化推送
     *
     * @param PersistpushDdcsDataRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PersistpushDdcsDataResponse
     */
    public function persistpushDdcsDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PersistpushDdcsDataResponse::fromMap($this->doRequest('1.0', 'sofa.ms.ddcs.data.persistpush', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
     * Summary: 查询动态配置订阅客户端.
     *
     * @param QueryDdcsClientsRequest $request
     *
     * @return QueryDdcsClientsResponse
     */
    public function queryDdcsClients($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDdcsClientsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
     * Summary: 查询动态配置订阅客户端.
     *
     * @param QueryDdcsClientsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDdcsClientsResponse
     */
    public function queryDdcsClientsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDdcsClientsResponse::fromMap($this->doRequest('1.0', 'sofa.ms.ddcs.clients.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-添加动态资源
     * Summary: 添加 DDCS 资源.
     *
     * @param AddDdcsResourceRequest $request
     *
     * @return AddDdcsResourceResponse
     */
    public function addDdcsResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDdcsResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-添加动态资源
     * Summary: 添加 DDCS 资源.
     *
     * @param AddDdcsResourceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddDdcsResourceResponse
     */
    public function addDdcsResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDdcsResourceResponse::fromMap($this->doRequest('1.0', 'sofa.ms.ddcs.resource.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-编辑动态资源
     * Summary: 编辑 DDCS 资源.
     *
     * @param UpdateDdcsResourceRequest $request
     *
     * @return UpdateDdcsResourceResponse
     */
    public function updateDdcsResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDdcsResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-编辑动态资源
     * Summary: 编辑 DDCS 资源.
     *
     * @param UpdateDdcsResourceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateDdcsResourceResponse
     */
    public function updateDdcsResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDdcsResourceResponse::fromMap($this->doRequest('1.0', 'sofa.ms.ddcs.resource.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-删除动态资源
     * Summary: 删除 DDCS 资源.
     *
     * @param DeleteDdcsResourceRequest $request
     *
     * @return DeleteDdcsResourceResponse
     */
    public function deleteDdcsResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDdcsResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-删除动态资源
     * Summary: 删除 DDCS 资源.
     *
     * @param DeleteDdcsResourceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteDdcsResourceResponse
     */
    public function deleteDdcsResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDdcsResourceResponse::fromMap($this->doRequest('1.0', 'sofa.ms.ddcs.resource.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-添加属性
     * Summary: 添加属性.
     *
     * @param AddDdcsAttributeRequest $request
     *
     * @return AddDdcsAttributeResponse
     */
    public function addDdcsAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDdcsAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-添加属性
     * Summary: 添加属性.
     *
     * @param AddDdcsAttributeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddDdcsAttributeResponse
     */
    public function addDdcsAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDdcsAttributeResponse::fromMap($this->doRequest('1.0', 'sofa.ms.ddcs.attribute.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-编辑属性
     * Summary: 编辑属性.
     *
     * @param UpdateDdcsAttributeRequest $request
     *
     * @return UpdateDdcsAttributeResponse
     */
    public function updateDdcsAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDdcsAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-编辑属性
     * Summary: 编辑属性.
     *
     * @param UpdateDdcsAttributeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateDdcsAttributeResponse
     */
    public function updateDdcsAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDdcsAttributeResponse::fromMap($this->doRequest('1.0', 'sofa.ms.ddcs.attribute.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-删除属性
     * Summary: 删除属性.
     *
     * @param DeleteDdcsAttributeRequest $request
     *
     * @return DeleteDdcsAttributeResponse
     */
    public function deleteDdcsAttribute($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDdcsAttributeEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-删除属性
     * Summary: 删除属性.
     *
     * @param DeleteDdcsAttributeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteDdcsAttributeResponse
     */
    public function deleteDdcsAttributeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDdcsAttributeResponse::fromMap($this->doRequest('1.0', 'sofa.ms.ddcs.attribute.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-动态配置-查找动态配置
     * Summary: 查找动态资源.
     *
     * @param SearchDdcsResourceRequest $request
     *
     * @return SearchDdcsResourceResponse
     */
    public function searchDdcsResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->searchDdcsResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-动态配置-查找动态配置
     * Summary: 查找动态资源.
     *
     * @param SearchDdcsResourceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SearchDdcsResourceResponse
     */
    public function searchDdcsResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SearchDdcsResourceResponse::fromMap($this->doRequest('1.0', 'sofa.ms.ddcs.resource.search', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-添加调度任务
     * Summary: 添加调度任务
     *
     * @param AddDssTaskRequest $request
     *
     * @return AddDssTaskResponse
     */
    public function addDssTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDssTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-添加调度任务
     * Summary: 添加调度任务
     *
     * @param AddDssTaskRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AddDssTaskResponse
     */
    public function addDssTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDssTaskResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.task.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-编辑调度任务
     * Summary: 编辑调度任务
     *
     * @param UpdateDssTaskRequest $request
     *
     * @return UpdateDssTaskResponse
     */
    public function updateDssTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDssTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-编辑调度任务
     * Summary: 编辑调度任务
     *
     * @param UpdateDssTaskRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateDssTaskResponse
     */
    public function updateDssTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDssTaskResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.task.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务
     * Summary: 删除调度任务
     *
     * @param DeleteDssTaskRequest $request
     *
     * @return DeleteDssTaskResponse
     */
    public function deleteDssTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDssTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务
     * Summary: 删除调度任务
     *
     * @param DeleteDssTaskRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DeleteDssTaskResponse
     */
    public function deleteDssTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDssTaskResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.task.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务
     * Summary: 查找调度任务
     *
     * @param SearchDssTaskRequest $request
     *
     * @return SearchDssTaskResponse
     */
    public function searchDssTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->searchDssTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务
     * Summary: 查找调度任务
     *
     * @param SearchDssTaskRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return SearchDssTaskResponse
     */
    public function searchDssTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SearchDssTaskResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.task.search', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
     * Summary: 通过策略名称查询策略.
     *
     * @param QueryDssStrategyRequest $request
     *
     * @return QueryDssStrategyResponse
     */
    public function queryDssStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDssStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
     * Summary: 通过策略名称查询策略.
     *
     * @param QueryDssStrategyRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDssStrategyResponse
     */
    public function queryDssStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDssStrategyResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.strategy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务(独占版)
     * Summary: 删除调度任务
     *
     * @param DeleteDssScheduleRequest $request
     *
     * @return DeleteDssScheduleResponse
     */
    public function deleteDssSchedule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDssScheduleEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-删除任务(独占版)
     * Summary: 删除调度任务
     *
     * @param DeleteDssScheduleRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteDssScheduleResponse
     */
    public function deleteDssScheduleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDssScheduleResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.schedule.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-执行单元切换
     * Summary: 定时任务执行单元切换.
     *
     * @param ExecuteDssSwitchoverRequest $request
     *
     * @return ExecuteDssSwitchoverResponse
     */
    public function executeDssSwitchover($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->executeDssSwitchoverEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-执行单元切换
     * Summary: 定时任务执行单元切换.
     *
     * @param ExecuteDssSwitchoverRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExecuteDssSwitchoverResponse
     */
    public function executeDssSwitchoverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecuteDssSwitchoverResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.switchover.execute', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-取消单元切换
     * Summary: 定时任务取消单元切换.
     *
     * @param CancelDssSwitchoverRequest $request
     *
     * @return CancelDssSwitchoverResponse
     */
    public function cancelDssSwitchover($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelDssSwitchoverEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-取消单元切换
     * Summary: 定时任务取消单元切换.
     *
     * @param CancelDssSwitchoverRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CancelDssSwitchoverResponse
     */
    public function cancelDssSwitchoverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelDssSwitchoverResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.switchover.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分布式调度任务-查询单元切换状态
     * Summary: 查询定时任务单元切换状态
     *
     * @param QueryDssSwitchoverRequest $request
     *
     * @return QueryDssSwitchoverResponse
     */
    public function queryDssSwitchover($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDssSwitchoverEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分布式调度任务-查询单元切换状态
     * Summary: 查询定时任务单元切换状态
     *
     * @param QueryDssSwitchoverRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryDssSwitchoverResponse
     */
    public function queryDssSwitchoverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDssSwitchoverResponse::fromMap($this->doRequest('1.0', 'sofa.ms.dss.switchover.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-服务注册中心-注销服务
     * Summary: 注销服务
     *
     * @param LogoutRegistryServiceRequest $request
     *
     * @return LogoutRegistryServiceResponse
     */
    public function logoutRegistryService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->logoutRegistryServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-服务注册中心-注销服务
     * Summary: 注销服务
     *
     * @param LogoutRegistryServiceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return LogoutRegistryServiceResponse
     */
    public function logoutRegistryServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return LogoutRegistryServiceResponse::fromMap($this->doRequest('1.0', 'sofa.ms.registry.service.logout', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-服务注册中心-服务挂流
     * Summary: 服务挂流
     *
     * @param OnlineRegistryServiceRequest $request
     *
     * @return OnlineRegistryServiceResponse
     */
    public function onlineRegistryService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->onlineRegistryServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-服务注册中心-服务挂流
     * Summary: 服务挂流
     *
     * @param OnlineRegistryServiceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return OnlineRegistryServiceResponse
     */
    public function onlineRegistryServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OnlineRegistryServiceResponse::fromMap($this->doRequest('2.0', 'sofa.ms.registry.service.online', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询实例标识
     * Summary: 查询实例标识.
     *
     * @param ListSofaOspInstanceRequest $request
     *
     * @return ListSofaOspInstanceResponse
     */
    public function listSofaOspInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSofaOspInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实例标识
     * Summary: 查询实例标识.
     *
     * @param ListSofaOspInstanceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListSofaOspInstanceResponse
     */
    public function listSofaOspInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSofaOspInstanceResponse::fromMap($this->doRequest('1.0', 'sofa.osp.instance.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增某个实例下的单元
     * Summary: 新增单元.
     *
     * @param AddSofaOspCellRequest $request
     *
     * @return AddSofaOspCellResponse
     */
    public function addSofaOspCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSofaOspCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增某个实例下的单元
     * Summary: 新增单元.
     *
     * @param AddSofaOspCellRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AddSofaOspCellResponse
     */
    public function addSofaOspCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSofaOspCellResponse::fromMap($this->doRequest('1.0', 'sofa.osp.cell.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除某个实例下的单元
     * Summary: 删除单元.
     *
     * @param DeleteSofaOspCellRequest $request
     *
     * @return DeleteSofaOspCellResponse
     */
    public function deleteSofaOspCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSofaOspCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除某个实例下的单元
     * Summary: 删除单元.
     *
     * @param DeleteSofaOspCellRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteSofaOspCellResponse
     */
    public function deleteSofaOspCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSofaOspCellResponse::fromMap($this->doRequest('1.0', 'sofa.osp.cell.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询某个实例下的单元列表
     * Summary: 查询单元列表.
     *
     * @param QuerySofaOspCellRequest $request
     *
     * @return QuerySofaOspCellResponse
     */
    public function querySofaOspCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySofaOspCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询某个实例下的单元列表
     * Summary: 查询单元列表.
     *
     * @param QuerySofaOspCellRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QuerySofaOspCellResponse
     */
    public function querySofaOspCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySofaOspCellResponse::fromMap($this->doRequest('1.0', 'sofa.osp.cell.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Query service records.
     * Summary: query service record.
     *
     * @param QueryServiceRequest $request
     *
     * @return QueryServiceResponse
     */
    public function queryService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: Query service records.
     * Summary: query service record.
     *
     * @param QueryServiceRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryServiceResponse
     */
    public function queryServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryServiceResponse::fromMap($this->doRequest('2.0', 'sofa.ms.service.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Query service publishers.
     * Summary: query service publishers.
     *
     * @param QueryServicePublisherRequest $request
     *
     * @return QueryServicePublisherResponse
     */
    public function queryServicePublisher($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryServicePublisherEx($request, $headers, $runtime);
    }

    /**
     * Description: Query service publishers.
     * Summary: query service publishers.
     *
     * @param QueryServicePublisherRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryServicePublisherResponse
     */
    public function queryServicePublisherEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryServicePublisherResponse::fromMap($this->doRequest('2.0', 'sofa.ms.service.publisher.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Query service subscribers.
     * Summary: query service subscribers.
     *
     * @param QueryServiceSubscriberRequest $request
     *
     * @return QueryServiceSubscriberResponse
     */
    public function queryServiceSubscriber($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryServiceSubscriberEx($request, $headers, $runtime);
    }

    /**
     * Description: Query service subscribers.
     * Summary: query service subscribers.
     *
     * @param QueryServiceSubscriberRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryServiceSubscriberResponse
     */
    public function queryServiceSubscriberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryServiceSubscriberResponse::fromMap($this->doRequest('2.0', 'sofa.ms.service.subscriber.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Client operation, like logout all services published from the client.
     * Summary: Client operation.
     *
     * @param AddServiceClientRequest $request
     *
     * @return AddServiceClientResponse
     */
    public function addServiceClient($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addServiceClientEx($request, $headers, $runtime);
    }

    /**
     * Description: Client operation, like logout all services published from the client.
     * Summary: Client operation.
     *
     * @param AddServiceClientRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddServiceClientResponse
     */
    public function addServiceClientEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddServiceClientResponse::fromMap($this->doRequest('2.0', 'sofa.ms.service.client.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
     * Summary: 模糊查询资源.
     *
     * @param QueryDdcsResourcesRequest $request
     *
     * @return QueryDdcsResourcesResponse
     */
    public function queryDdcsResources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDdcsResourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
     * Summary: 模糊查询资源.
     *
     * @param QueryDdcsResourcesRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryDdcsResourcesResponse
     */
    public function queryDdcsResourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDdcsResourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.resources.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
     * Summary: 推送属性值
     *
     * @param AddDdcsDataRequest $request
     *
     * @return AddDdcsDataResponse
     */
    public function addDdcsData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDdcsDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
     * Summary: 推送属性值
     *
     * @param AddDdcsDataRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AddDdcsDataResponse
     */
    public function addDdcsDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDdcsDataResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.data.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
     * Summary: 新增资源元数据.
     *
     * @param AddDdcsResourcesRequest $request
     *
     * @return AddDdcsResourcesResponse
     */
    public function addDdcsResources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDdcsResourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
     * Summary: 新增资源元数据.
     *
     * @param AddDdcsResourcesRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddDdcsResourcesResponse
     */
    public function addDdcsResourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDdcsResourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.resources.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
     * Summary: 更新资源元信息.
     *
     * @param UpdateDdcsResourcesRequest $request
     *
     * @return UpdateDdcsResourcesResponse
     */
    public function updateDdcsResources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDdcsResourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
     * Summary: 更新资源元信息.
     *
     * @param UpdateDdcsResourcesRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateDdcsResourcesResponse
     */
    public function updateDdcsResourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDdcsResourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.resources.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
     * Summary: 根据资源ID删除资源.
     *
     * @param DeleteDdcsResourcesRequest $request
     *
     * @return DeleteDdcsResourcesResponse
     */
    public function deleteDdcsResources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDdcsResourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
     * Summary: 根据资源ID删除资源.
     *
     * @param DeleteDdcsResourcesRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteDdcsResourcesResponse
     */
    public function deleteDdcsResourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDdcsResourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.resources.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据资源 ID 获取对应的资源元信息。
     * Summary: 根据资源自增长 ID 获取资源元信息.
     *
     * @param GetDdcsResourcesRequest $request
     *
     * @return GetDdcsResourcesResponse
     */
    public function getDdcsResources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDdcsResourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据资源 ID 获取对应的资源元信息。
     * Summary: 根据资源自增长 ID 获取资源元信息.
     *
     * @param GetDdcsResourcesRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetDdcsResourcesResponse
     */
    public function getDdcsResourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDdcsResourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.resources.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
     * Summary: 新增属性元信息.
     *
     * @param AddDdcsAttributesRequest $request
     *
     * @return AddDdcsAttributesResponse
     */
    public function addDdcsAttributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDdcsAttributesEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
     * Summary: 新增属性元信息.
     *
     * @param AddDdcsAttributesRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AddDdcsAttributesResponse
     */
    public function addDdcsAttributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDdcsAttributesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.attributes.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据属性 ID 更新属性元信息。
     * Summary: 更新属性元信息.
     *
     * @param UpdateDdcsAttributesRequest $request
     *
     * @return UpdateDdcsAttributesResponse
     */
    public function updateDdcsAttributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDdcsAttributesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据属性 ID 更新属性元信息。
     * Summary: 更新属性元信息.
     *
     * @param UpdateDdcsAttributesRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateDdcsAttributesResponse
     */
    public function updateDdcsAttributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDdcsAttributesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.attributes.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
     * Summary: 删除属性.
     *
     * @param DeleteDdcsAttributesRequest $request
     *
     * @return DeleteDdcsAttributesResponse
     */
    public function deleteDdcsAttributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDdcsAttributesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
     * Summary: 删除属性.
     *
     * @param DeleteDdcsAttributesRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteDdcsAttributesResponse
     */
    public function deleteDdcsAttributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDdcsAttributesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.attributes.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据属性 ID 获取对应的属性信息。
     * Summary: 获取属性.
     *
     * @param GetDdcsAttributesRequest $request
     *
     * @return GetDdcsAttributesResponse
     */
    public function getDdcsAttributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDdcsAttributesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据属性 ID 获取对应的属性信息。
     * Summary: 获取属性.
     *
     * @param GetDdcsAttributesRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetDdcsAttributesResponse
     */
    public function getDdcsAttributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDdcsAttributesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.attributes.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
     * Summary: 根据资源和属性名称获取属性信息.
     *
     * @param QueryDdcsAttributesRequest $request
     *
     * @return QueryDdcsAttributesResponse
     */
    public function queryDdcsAttributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDdcsAttributesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
     * Summary: 根据资源和属性名称获取属性信息.
     *
     * @param QueryDdcsAttributesRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDdcsAttributesResponse
     */
    public function queryDdcsAttributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDdcsAttributesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.attributes.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query job by specific id
     * Summary: query job.
     *
     * @param GetDdsJobRequest $request
     *
     * @return GetDdsJobResponse
     */
    public function getDdsJob($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDdsJobEx($request, $headers, $runtime);
    }

    /**
     * Description: query job by specific id
     * Summary: query job.
     *
     * @param GetDdsJobRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return GetDdsJobResponse
     */
    public function getDdsJobEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDdsJobResponse::fromMap($this->doRequest('2.0', 'sofa.ms.dds.job.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: add job
     * Summary: add job.
     *
     * @param AddDdsJobRequest $request
     *
     * @return AddDdsJobResponse
     */
    public function addDdsJob($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDdsJobEx($request, $headers, $runtime);
    }

    /**
     * Description: add job
     * Summary: add job.
     *
     * @param AddDdsJobRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return AddDdsJobResponse
     */
    public function addDdsJobEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDdsJobResponse::fromMap($this->doRequest('2.0', 'sofa.ms.dds.job.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: modify job by specific id
     * Summary: modify job.
     *
     * @param UpdateDdsJobRequest $request
     *
     * @return UpdateDdsJobResponse
     */
    public function updateDdsJob($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDdsJobEx($request, $headers, $runtime);
    }

    /**
     * Description: modify job by specific id
     * Summary: modify job.
     *
     * @param UpdateDdsJobRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return UpdateDdsJobResponse
     */
    public function updateDdsJobEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDdsJobResponse::fromMap($this->doRequest('2.0', 'sofa.ms.dds.job.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: delete job by specific id
     * Summary: delete job.
     *
     * @param DeleteDdsJobRequest $request
     *
     * @return DeleteDdsJobResponse
     */
    public function deleteDdsJob($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDdsJobEx($request, $headers, $runtime);
    }

    /**
     * Description: delete job by specific id
     * Summary: delete job.
     *
     * @param DeleteDdsJobRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return DeleteDdsJobResponse
     */
    public function deleteDdsJobEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDdsJobResponse::fromMap($this->doRequest('2.0', 'sofa.ms.dds.job.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update status by specific id
     * Summary: update status.
     *
     * @param UpdateDdsJobStatusRequest $request
     *
     * @return UpdateDdsJobStatusResponse
     */
    public function updateDdsJobStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDdsJobStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: update status by specific id
     * Summary: update status.
     *
     * @param UpdateDdsJobStatusRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateDdsJobStatusResponse
     */
    public function updateDdsJobStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDdsJobStatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.dds.job.status.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按 IP 灰度推送属性值。
     * Summary: 按IP灰度推送属性值
     *
     * @param AddDdcsGraydataRequest $request
     *
     * @return AddDdcsGraydataResponse
     */
    public function addDdcsGraydata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDdcsGraydataEx($request, $headers, $runtime);
    }

    /**
     * Description: 按 IP 灰度推送属性值。
     * Summary: 按IP灰度推送属性值
     *
     * @param AddDdcsGraydataRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddDdcsGraydataResponse
     */
    public function addDdcsGraydataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDdcsGraydataResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.graydata.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询属性最后一次的推送值。
     * Summary: 查询属性最后一次推送值
     *
     * @param QueryDdcsDataRequest $request
     *
     * @return QueryDdcsDataResponse
     */
    public function queryDdcsData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDdcsDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询属性最后一次的推送值。
     * Summary: 查询属性最后一次推送值
     *
     * @param QueryDdcsDataRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryDdcsDataResponse
     */
    public function queryDdcsDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDdcsDataResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.data.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query jobs
     * Summary: query jobs.
     *
     * @param QueryDdsJobsRequest $request
     *
     * @return QueryDdsJobsResponse
     */
    public function queryDdsJobs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDdsJobsEx($request, $headers, $runtime);
    }

    /**
     * Description: query jobs
     * Summary: query jobs.
     *
     * @param QueryDdsJobsRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryDdsJobsResponse
     */
    public function queryDdsJobsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDdsJobsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.dds.jobs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询属性下指定客户端的内存值。
     * Summary: 查询属性下指定客户端的内存值
     *
     * @param QueryDdcsClientvalueRequest $request
     *
     * @return QueryDdcsClientvalueResponse
     */
    public function queryDdcsClientvalue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDdcsClientvalueEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询属性下指定客户端的内存值。
     * Summary: 查询属性下指定客户端的内存值
     *
     * @param QueryDdcsClientvalueRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryDdcsClientvalueResponse
     */
    public function queryDdcsClientvalueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDdcsClientvalueResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.clientvalue.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询属性推送历史
     * Summary: 查询属性推送历史.
     *
     * @param QueryDdcsPushhistoryRequest $request
     *
     * @return QueryDdcsPushhistoryResponse
     */
    public function queryDdcsPushhistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDdcsPushhistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询属性推送历史
     * Summary: 查询属性推送历史.
     *
     * @param QueryDdcsPushhistoryRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryDdcsPushhistoryResponse
     */
    public function queryDdcsPushhistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDdcsPushhistoryResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.pushhistory.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: LDC模式部署获取所有zone
     * Summary: LDC模式部署获取所有zone.
     *
     * @param QueryDssZoneRequest $request
     *
     * @return QueryDssZoneResponse
     */
    public function queryDssZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDssZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: LDC模式部署获取所有zone
     * Summary: LDC模式部署获取所有zone.
     *
     * @param QueryDssZoneRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryDssZoneResponse
     */
    public function queryDssZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDssZoneResponse::fromMap($this->doRequest('2.0', 'sofa.ms.dss.zone.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
     * 由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
     * Summary: 回滚最近一次动态配置推送
     *
     * @param RollbackDdcsDataRequest $request
     *
     * @return RollbackDdcsDataResponse
     */
    public function rollbackDdcsData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->rollbackDdcsDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
     * 由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
     * Summary: 回滚最近一次动态配置推送
     *
     * @param RollbackDdcsDataRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return RollbackDdcsDataResponse
     */
    public function rollbackDdcsDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RollbackDdcsDataResponse::fromMap($this->doRequest('2.0', 'sofa.ms.ddcs.data.rollback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据服务接口查询服务鉴权规则
     * Summary: 根据服务接口查询服务鉴权规则.
     *
     * @param ListSgAuthrulegroupsRequest $request
     *
     * @return ListSgAuthrulegroupsResponse
     */
    public function listSgAuthrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgAuthrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据服务接口查询服务鉴权规则
     * Summary: 根据服务接口查询服务鉴权规则.
     *
     * @param ListSgAuthrulegroupsRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListSgAuthrulegroupsResponse
     */
    public function listSgAuthrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgAuthrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroups.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询表单元数据，支持哪些鉴权规则
     * Summary: 查询表单元数据.
     *
     * @param QuerySgFormconfigRequest $request
     *
     * @return QuerySgFormconfigResponse
     */
    public function querySgFormconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgFormconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询表单元数据，支持哪些鉴权规则
     * Summary: 查询表单元数据.
     *
     * @param QuerySgFormconfigRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QuerySgFormconfigResponse
     */
    public function querySgFormconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgFormconfigResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.formconfig.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 清空黑白名单下所有鉴权规则
     * Summary: 清空黑白名单.
     *
     * @param ReinitSgAuthrulesRequest $request
     *
     * @return ReinitSgAuthrulesResponse
     */
    public function reinitSgAuthrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reinitSgAuthrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 清空黑白名单下所有鉴权规则
     * Summary: 清空黑白名单.
     *
     * @param ReinitSgAuthrulesRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ReinitSgAuthrulesResponse
     */
    public function reinitSgAuthrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReinitSgAuthrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrules.reinit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建服务鉴权规则
     * Summary: 创建服务鉴权规则.
     *
     * @param SaveSgAuthrulegroupsRequest $request
     *
     * @return SaveSgAuthrulegroupsResponse
     */
    public function saveSgAuthrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveSgAuthrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建服务鉴权规则
     * Summary: 创建服务鉴权规则.
     *
     * @param SaveSgAuthrulegroupsRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SaveSgAuthrulegroupsResponse
     */
    public function saveSgAuthrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveSgAuthrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroups.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-同步服务发布者信息
     * Summary: 同步服务发布者信息.
     *
     * @param SyncSgServicepublishersRequest $request
     *
     * @return SyncSgServicepublishersResponse
     */
    public function syncSgServicepublishers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncSgServicepublishersEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-同步服务发布者信息
     * Summary: 同步服务发布者信息.
     *
     * @param SyncSgServicepublishersRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncSgServicepublishersResponse
     */
    public function syncSgServicepublishersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncSgServicepublishersResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicepublishers.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-同步服务发布者信息
     * Summary: 同步服务发布者信息.
     *
     * @param SyncSgServicesubscribersRequest $request
     *
     * @return SyncSgServicesubscribersResponse
     */
    public function syncSgServicesubscribers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncSgServicesubscribersEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-同步服务发布者信息
     * Summary: 同步服务发布者信息.
     *
     * @param SyncSgServicesubscribersRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SyncSgServicesubscribersResponse
     */
    public function syncSgServicesubscribersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncSgServicesubscribersResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicesubscribers.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-同步客户端下线事件
     * Summary: 同步客户端下线事件.
     *
     * @param SyncSgServiceclientsRequest $request
     *
     * @return SyncSgServiceclientsResponse
     */
    public function syncSgServiceclients($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncSgServiceclientsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-同步客户端下线事件
     * Summary: 同步客户端下线事件.
     *
     * @param SyncSgServiceclientsRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SyncSgServiceclientsResponse
     */
    public function syncSgServiceclientsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncSgServiceclientsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceclients.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-同步心跳数据
     * Summary: 同步心跳数据.
     *
     * @param SyncSgServiceheartbeatsRequest $request
     *
     * @return SyncSgServiceheartbeatsResponse
     */
    public function syncSgServiceheartbeats($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncSgServiceheartbeatsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-同步心跳数据
     * Summary: 同步心跳数据.
     *
     * @param SyncSgServiceheartbeatsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SyncSgServiceheartbeatsResponse
     */
    public function syncSgServiceheartbeatsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncSgServiceheartbeatsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceheartbeats.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询发布者信息
     * Summary: 分页查询发布者.
     *
     * @param QuerySgServicepublishersRequest $request
     *
     * @return QuerySgServicepublishersResponse
     */
    public function querySgServicepublishers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicepublishersEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询发布者信息
     * Summary: 分页查询发布者.
     *
     * @param QuerySgServicepublishersRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QuerySgServicepublishersResponse
     */
    public function querySgServicepublishersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicepublishersResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicepublishers.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询消费者
     * Summary: 分页查询消费者.
     *
     * @param QuerySgServicesubscribersRequest $request
     *
     * @return QuerySgServicesubscribersResponse
     */
    public function querySgServicesubscribers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicesubscribersEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询消费者
     * Summary: 分页查询消费者.
     *
     * @param QuerySgServicesubscribersRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QuerySgServicesubscribersResponse
     */
    public function querySgServicesubscribersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicesubscribersResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicesubscribers.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据dataId查询服务限流规则
     * Summary: 根据dataId查询服务限流规则.
     *
     * @param QuerySgServiceratelimitrulesRequest $request
     *
     * @return QuerySgServiceratelimitrulesResponse
     */
    public function querySgServiceratelimitrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServiceratelimitrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据dataId查询服务限流规则
     * Summary: 根据dataId查询服务限流规则.
     *
     * @param QuerySgServiceratelimitrulesRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QuerySgServiceratelimitrulesResponse
     */
    public function querySgServiceratelimitrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServiceratelimitrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceratelimitrules.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增限流规则
     * Summary: 新增限流规则.
     *
     * @param AddSgServiceratelimitrulesRequest $request
     *
     * @return AddSgServiceratelimitrulesResponse
     */
    public function addSgServiceratelimitrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgServiceratelimitrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增限流规则
     * Summary: 新增限流规则.
     *
     * @param AddSgServiceratelimitrulesRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return AddSgServiceratelimitrulesResponse
     */
    public function addSgServiceratelimitrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgServiceratelimitrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceratelimitrules.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新服务限流规则
     * Summary: 更新服务限流规则.
     *
     * @param UpdateSgServiceratelimitrulesRequest $request
     *
     * @return UpdateSgServiceratelimitrulesResponse
     */
    public function updateSgServiceratelimitrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgServiceratelimitrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新服务限流规则
     * Summary: 更新服务限流规则.
     *
     * @param UpdateSgServiceratelimitrulesRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UpdateSgServiceratelimitrulesResponse
     */
    public function updateSgServiceratelimitrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgServiceratelimitrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceratelimitrules.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则.
     *
     * @param DeleteSgServiceratelimitrulesRequest $request
     *
     * @return DeleteSgServiceratelimitrulesResponse
     */
    public function deleteSgServiceratelimitrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgServiceratelimitrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除限流规则
     * Summary: 删除限流规则.
     *
     * @param DeleteSgServiceratelimitrulesRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return DeleteSgServiceratelimitrulesResponse
     */
    public function deleteSgServiceratelimitrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgServiceratelimitrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceratelimitrules.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 禁用/启用限流规则
     * Summary: 禁用/启用限流规则.
     *
     * @param UpdateSgServiceratelimitrulestatusRequest $request
     *
     * @return UpdateSgServiceratelimitrulestatusResponse
     */
    public function updateSgServiceratelimitrulestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgServiceratelimitrulestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 禁用/启用限流规则
     * Summary: 禁用/启用限流规则.
     *
     * @param UpdateSgServiceratelimitrulestatusRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return UpdateSgServiceratelimitrulestatusResponse
     */
    public function updateSgServiceratelimitrulestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgServiceratelimitrulestatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceratelimitrulestatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加服务路由规则
     * Summary: 添加服务路由规则.
     *
     * @param AddSgRouterrulegroupsRequest $request
     *
     * @return AddSgRouterrulegroupsResponse
     */
    public function addSgRouterrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgRouterrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加服务路由规则
     * Summary: 添加服务路由规则.
     *
     * @param AddSgRouterrulegroupsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AddSgRouterrulegroupsResponse
     */
    public function addSgRouterrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgRouterrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrulegroups.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询路由规则
     * Summary: 查询路由规则.
     *
     * @param GetSgRouterrulesRequest $request
     *
     * @return GetSgRouterrulesResponse
     */
    public function getSgRouterrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSgRouterrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询路由规则
     * Summary: 查询路由规则.
     *
     * @param GetSgRouterrulesRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetSgRouterrulesResponse
     */
    public function getSgRouterrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSgRouterrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrules.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新服务路由规则
     * Summary: 更新服务路由规则.
     *
     * @param UpdateSgRouterrulegroupsRequest $request
     *
     * @return UpdateSgRouterrulegroupsResponse
     */
    public function updateSgRouterrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgRouterrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新服务路由规则
     * Summary: 更新服务路由规则.
     *
     * @param UpdateSgRouterrulegroupsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateSgRouterrulegroupsResponse
     */
    public function updateSgRouterrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgRouterrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrulegroups.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-启用路由器规则组
     * Summary: 启用路由器规则组.
     *
     * @param EnableSgRouterrulesRequest $request
     *
     * @return EnableSgRouterrulesResponse
     */
    public function enableSgRouterrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSgRouterrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-启用路由器规则组
     * Summary: 启用路由器规则组.
     *
     * @param EnableSgRouterrulesRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return EnableSgRouterrulesResponse
     */
    public function enableSgRouterrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSgRouterrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrules.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取路由规则组版本列表
     * Summary: 获取路由规则组版本列表.
     *
     * @param ListSgRouterruleversionsRequest $request
     *
     * @return ListSgRouterruleversionsResponse
     */
    public function listSgRouterruleversions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgRouterruleversionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取路由规则组版本列表
     * Summary: 获取路由规则组版本列表.
     *
     * @param ListSgRouterruleversionsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListSgRouterruleversionsResponse
     */
    public function listSgRouterruleversionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgRouterruleversionsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerruleversions.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取路由规则状态
     * Summary: 获取路由规则状态
     *
     * @param QuerySgRouterrulestatusRequest $request
     *
     * @return QuerySgRouterrulestatusResponse
     */
    public function querySgRouterrulestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgRouterrulestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取路由规则状态
     * Summary: 获取路由规则状态
     *
     * @param QuerySgRouterrulestatusRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QuerySgRouterrulestatusResponse
     */
    public function querySgRouterrulestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgRouterrulestatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrulestatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除鉴权规则
     * Summary: 删除鉴权规则.
     *
     * @param DeleteSgAuthrulesRequest $request
     *
     * @return DeleteSgAuthrulesResponse
     */
    public function deleteSgAuthrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgAuthrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除鉴权规则
     * Summary: 删除鉴权规则.
     *
     * @param DeleteSgAuthrulesRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteSgAuthrulesResponse
     */
    public function deleteSgAuthrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgAuthrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrules.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-通过DataId获取AppNames
     * Summary: 通过DataId获取AppNames.
     *
     * @param ListSgRouterruleappnamesRequest $request
     *
     * @return ListSgRouterruleappnamesResponse
     */
    public function listSgRouterruleappnames($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgRouterruleappnamesEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-通过DataId获取AppNames
     * Summary: 通过DataId获取AppNames.
     *
     * @param ListSgRouterruleappnamesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListSgRouterruleappnamesResponse
     */
    public function listSgRouterruleappnamesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgRouterruleappnamesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerruleappnames.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
     * Summary: 启用服务鉴权黑、白名单.
     *
     * @param EnableSgAuthrulegroupsRequest $request
     *
     * @return EnableSgAuthrulegroupsResponse
     */
    public function enableSgAuthrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSgAuthrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
     * Summary: 启用服务鉴权黑、白名单.
     *
     * @param EnableSgAuthrulegroupsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return EnableSgAuthrulegroupsResponse
     */
    public function enableSgAuthrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSgAuthrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroups.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-获取快照最后一个
     * Summary: 获取快照最后一个.
     *
     * @param GetSgRouterrulesnapshotsRequest $request
     *
     * @return GetSgRouterrulesnapshotsResponse
     */
    public function getSgRouterrulesnapshots($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSgRouterrulesnapshotsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-获取快照最后一个
     * Summary: 获取快照最后一个.
     *
     * @param GetSgRouterrulesnapshotsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetSgRouterrulesnapshotsResponse
     */
    public function getSgRouterrulesnapshotsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSgRouterrulesnapshotsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrulesnapshots.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-回滚快照最后一个
     * Summary: 回滚快照最后一个.
     *
     * @param RollbackSgRouterrulesnapshotsRequest $request
     *
     * @return RollbackSgRouterrulesnapshotsResponse
     */
    public function rollbackSgRouterrulesnapshots($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->rollbackSgRouterrulesnapshotsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-回滚快照最后一个
     * Summary: 回滚快照最后一个.
     *
     * @param RollbackSgRouterrulesnapshotsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return RollbackSgRouterrulesnapshotsResponse
     */
    public function rollbackSgRouterrulesnapshotsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RollbackSgRouterrulesnapshotsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrulesnapshots.rollback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-获取调度日志
     * Summary: 获取调度日志.
     *
     * @param QuerySgRouterruledispatchlogsRequest $request
     *
     * @return QuerySgRouterruledispatchlogsResponse
     */
    public function querySgRouterruledispatchlogs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgRouterruledispatchlogsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-获取调度日志
     * Summary: 获取调度日志.
     *
     * @param QuerySgRouterruledispatchlogsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QuerySgRouterruledispatchlogsResponse
     */
    public function querySgRouterruledispatchlogsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgRouterruledispatchlogsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerruledispatchlogs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加一条白、黑名单规则
     * Summary: 添加一条鉴权规则.
     *
     * @param AddSgAuthrulesRequest $request
     *
     * @return AddSgAuthrulesResponse
     */
    public function addSgAuthrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgAuthrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加一条白、黑名单规则
     * Summary: 添加一条鉴权规则.
     *
     * @param AddSgAuthrulesRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AddSgAuthrulesResponse
     */
    public function addSgAuthrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgAuthrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrules.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新一条服务鉴权规则
     * Summary: 更新一条服务鉴权规则.
     *
     * @param UpdateSgAuthrulesRequest $request
     *
     * @return UpdateSgAuthrulesResponse
     */
    public function updateSgAuthrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgAuthrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新一条服务鉴权规则
     * Summary: 更新一条服务鉴权规则.
     *
     * @param UpdateSgAuthrulesRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateSgAuthrulesResponse
     */
    public function updateSgAuthrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgAuthrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrules.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 禁止一份服务鉴权黑、白名单
     * Summary: 禁止一份服务鉴权黑、白名单.
     *
     * @param DisableSgAuthrulegroupsRequest $request
     *
     * @return DisableSgAuthrulegroupsResponse
     */
    public function disableSgAuthrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableSgAuthrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 禁止一份服务鉴权黑、白名单
     * Summary: 禁止一份服务鉴权黑、白名单.
     *
     * @param DisableSgAuthrulegroupsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DisableSgAuthrulegroupsResponse
     */
    public function disableSgAuthrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableSgAuthrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroups.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取应用关联数据
     * Summary: 获取应用关联数据.
     *
     * @param QuerySgApprelationsRequest $request
     *
     * @return QuerySgApprelationsResponse
     */
    public function querySgApprelations($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgApprelationsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取应用关联数据
     * Summary: 获取应用关联数据.
     *
     * @param QuerySgApprelationsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QuerySgApprelationsResponse
     */
    public function querySgApprelationsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgApprelationsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.apprelations.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 启用服务鉴权规则
     * Summary: 启用服务鉴权规则.
     *
     * @param EnableSgAuthrulesRequest $request
     *
     * @return EnableSgAuthrulesResponse
     */
    public function enableSgAuthrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSgAuthrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 启用服务鉴权规则
     * Summary: 启用服务鉴权规则.
     *
     * @param EnableSgAuthrulesRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return EnableSgAuthrulesResponse
     */
    public function enableSgAuthrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSgAuthrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrules.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 禁用黑、白名单中的一条规则
     * Summary: 禁用黑、白名单中的一条规则.
     *
     * @param DisableSgAuthrulesRequest $request
     *
     * @return DisableSgAuthrulesResponse
     */
    public function disableSgAuthrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableSgAuthrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 禁用黑、白名单中的一条规则
     * Summary: 禁用黑、白名单中的一条规则.
     *
     * @param DisableSgAuthrulesRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DisableSgAuthrulesResponse
     */
    public function disableSgAuthrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableSgAuthrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrules.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取服务发布者关系
     * Summary: 获取服务发布者关系.
     *
     * @param QuerySgServicepubrelationsRequest $request
     *
     * @return QuerySgServicepubrelationsResponse
     */
    public function querySgServicepubrelations($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicepubrelationsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取服务发布者关系
     * Summary: 获取服务发布者关系.
     *
     * @param QuerySgServicepubrelationsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QuerySgServicepubrelationsResponse
     */
    public function querySgServicepubrelationsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicepubrelationsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicepubrelations.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 服务鉴权规则下发失败，重新下发规则
     * Summary: 服务鉴权规则下发失败，重新下发规则.
     *
     * @param RetrySgAuthrulegroupsRequest $request
     *
     * @return RetrySgAuthrulegroupsResponse
     */
    public function retrySgAuthrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->retrySgAuthrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 服务鉴权规则下发失败，重新下发规则
     * Summary: 服务鉴权规则下发失败，重新下发规则.
     *
     * @param RetrySgAuthrulegroupsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return RetrySgAuthrulegroupsResponse
     */
    public function retrySgAuthrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RetrySgAuthrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroups.retry', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取服务消费者数据
     * Summary: 获取服务消费者数据.
     *
     * @param QuerySgServicesubrelationsRequest $request
     *
     * @return QuerySgServicesubrelationsResponse
     */
    public function querySgServicesubrelations($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicesubrelationsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取服务消费者数据
     * Summary: 获取服务消费者数据.
     *
     * @param QuerySgServicesubrelationsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QuerySgServicesubrelationsResponse
     */
    public function querySgServicesubrelationsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicesubrelationsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicesubrelations.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-显示关系切换
     * Summary: 显示关系切换.
     *
     * @param GetSgRelationswitchRequest $request
     *
     * @return GetSgRelationswitchResponse
     */
    public function getSgRelationswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSgRelationswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-显示关系切换
     * Summary: 显示关系切换.
     *
     * @param GetSgRelationswitchRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetSgRelationswitchResponse
     */
    public function getSgRelationswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSgRelationswitchResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.relationswitch.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-获取InstanceId
     * Summary: 获取InstanceId.
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
     * Description: 微服务-获取InstanceId
     * Summary: 获取InstanceId.
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

        return GetMiddlewareInstanceResponse::fromMap($this->doRequest('2.0', 'sofa.ms.middleware.instance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-获取获取环境配置
     * Summary: 获取获取环境配置.
     *
     * @param GetSgEnvconfigRequest $request
     *
     * @return GetSgEnvconfigResponse
     */
    public function getSgEnvconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSgEnvconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-获取获取环境配置
     * Summary: 获取获取环境配置.
     *
     * @param GetSgEnvconfigRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetSgEnvconfigResponse
     */
    public function getSgEnvconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSgEnvconfigResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.envconfig.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取发布服务的应用列表
     * Summary: 获取发布服务的应用列表.
     *
     * @param ListSgServiceappsRequest $request
     *
     * @return ListSgServiceappsResponse
     */
    public function listSgServiceapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgServiceappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取发布服务的应用列表
     * Summary: 获取发布服务的应用列表.
     *
     * @param ListSgServiceappsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListSgServiceappsResponse
     */
    public function listSgServiceappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgServiceappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceapps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取服务候选词
     * Summary: 获取服务候选词.
     *
     * @param QuerySgServicekeywordRequest $request
     *
     * @return QuerySgServicekeywordResponse
     */
    public function querySgServicekeyword($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicekeywordEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取服务候选词
     * Summary: 获取服务候选词.
     *
     * @param QuerySgServicekeywordRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QuerySgServicekeywordResponse
     */
    public function querySgServicekeywordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicekeywordResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicekeyword.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-根据关键词搜索
     * Summary: 根据关键词搜索.
     *
     * @param QuerySgServicesRequest $request
     *
     * @return QuerySgServicesResponse
     */
    public function querySgServices($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-根据关键词搜索
     * Summary: 根据关键词搜索.
     *
     * @param QuerySgServicesRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QuerySgServicesResponse
     */
    public function querySgServicesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.services.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据ip搜索服务提供方
     * Summary: 根据ip搜索服务提供方.
     *
     * @param QuerySgServicepubkeysRequest $request
     *
     * @return QuerySgServicepubkeysResponse
     */
    public function querySgServicepubkeys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicepubkeysEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据ip搜索服务提供方
     * Summary: 根据ip搜索服务提供方.
     *
     * @param QuerySgServicepubkeysRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QuerySgServicepubkeysResponse
     */
    public function querySgServicepubkeysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicepubkeysResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicepubkeys.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据ip搜索消费者
     * Summary: 根据ip搜索消费者.
     *
     * @param QuerySgServicesubkeysRequest $request
     *
     * @return QuerySgServicesubkeysResponse
     */
    public function querySgServicesubkeys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicesubkeysEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据ip搜索消费者
     * Summary: 根据ip搜索消费者.
     *
     * @param QuerySgServicesubkeysRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QuerySgServicesubkeysResponse
     */
    public function querySgServicesubkeysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicesubkeysResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicesubkeys.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取发布者服务详情
     * Summary: 获取发布者服务详情.
     *
     * @param QuerySgServicepubsRequest $request
     *
     * @return QuerySgServicepubsResponse
     */
    public function querySgServicepubs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicepubsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取发布者服务详情
     * Summary: 获取发布者服务详情.
     *
     * @param QuerySgServicepubsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QuerySgServicepubsResponse
     */
    public function querySgServicepubsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicepubsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicepubs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取订阅者服务详情
     * Summary: 获取订阅者服务详情.
     *
     * @param QuerySgServicesubsRequest $request
     *
     * @return QuerySgServicesubsResponse
     */
    public function querySgServicesubs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicesubsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取订阅者服务详情
     * Summary: 获取订阅者服务详情.
     *
     * @param QuerySgServicesubsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QuerySgServicesubsResponse
     */
    public function querySgServicesubsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicesubsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicesubs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-通过DataId和IP获取pub服务详情
     * Summary: 通过DataId和IP获取pub服务详情.
     *
     * @param ListSgServicepubsRequest $request
     *
     * @return ListSgServicepubsResponse
     */
    public function listSgServicepubs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgServicepubsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-通过DataId和IP获取pub服务详情
     * Summary: 通过DataId和IP获取pub服务详情.
     *
     * @param ListSgServicepubsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListSgServicepubsResponse
     */
    public function listSgServicepubsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgServicepubsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicepubs.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-通过DataId和IP获取sub服务详情
     * Summary: 通过DataId和IP获取sub服务详情.
     *
     * @param ListSgServicesubsRequest $request
     *
     * @return ListSgServicesubsResponse
     */
    public function listSgServicesubs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgServicesubsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-通过DataId和IP获取sub服务详情
     * Summary: 通过DataId和IP获取sub服务详情.
     *
     * @param ListSgServicesubsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListSgServicesubsResponse
     */
    public function listSgServicesubsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgServicesubsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicesubs.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-获取服务汇总信息
     * Summary: 获取服务汇总信息.
     *
     * @param QuerySgServicesummarysRequest $request
     *
     * @return QuerySgServicesummarysResponse
     */
    public function querySgServicesummarys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgServicesummarysEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-获取服务汇总信息
     * Summary: 获取服务汇总信息.
     *
     * @param QuerySgServicesummarysRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QuerySgServicesummarysResponse
     */
    public function querySgServicesummarysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgServicesummarysResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicesummarys.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 禁用一个服务下某个服务提供者
     * Summary: 禁用一个服务下某个服务提供者.
     *
     * @param DisableSgServiceparamsRequest $request
     *
     * @return DisableSgServiceparamsResponse
     */
    public function disableSgServiceparams($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableSgServiceparamsEx($request, $headers, $runtime);
    }

    /**
     * Description: 禁用一个服务下某个服务提供者
     * Summary: 禁用一个服务下某个服务提供者.
     *
     * @param DisableSgServiceparamsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DisableSgServiceparamsResponse
     */
    public function disableSgServiceparamsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableSgServiceparamsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceparams.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 启动一个服务下某个服务提供者
     * Summary: 启动一个服务下某个服务提供者.
     *
     * @param EnableSgServiceparamsRequest $request
     *
     * @return EnableSgServiceparamsResponse
     */
    public function enableSgServiceparams($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSgServiceparamsEx($request, $headers, $runtime);
    }

    /**
     * Description: 启动一个服务下某个服务提供者
     * Summary: 启动一个服务下某个服务提供者.
     *
     * @param EnableSgServiceparamsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return EnableSgServiceparamsResponse
     */
    public function enableSgServiceparamsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSgServiceparamsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceparams.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置服务提供者权重
     * Summary: 设置服务提供者权重.
     *
     * @param SetSgServiceparamweightRequest $request
     *
     * @return SetSgServiceparamweightResponse
     */
    public function setSgServiceparamweight($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setSgServiceparamweightEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置服务提供者权重
     * Summary: 设置服务提供者权重.
     *
     * @param SetSgServiceparamweightRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SetSgServiceparamweightResponse
     */
    public function setSgServiceparamweightEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetSgServiceparamweightResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceparamweight.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 恢复服务提供者默认设置
     * Summary: 恢复服务提供者默认设置.
     *
     * @param ReinitSgServiceparamsRequest $request
     *
     * @return ReinitSgServiceparamsResponse
     */
    public function reinitSgServiceparams($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reinitSgServiceparamsEx($request, $headers, $runtime);
    }

    /**
     * Description: 恢复服务提供者默认设置
     * Summary: 恢复服务提供者默认设置.
     *
     * @param ReinitSgServiceparamsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ReinitSgServiceparamsResponse
     */
    public function reinitSgServiceparamsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReinitSgServiceparamsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceparams.reinit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-查询全部服务参数信息
     * Summary: 查询全部服务参数信息.
     *
     * @param BatchquerySgServiceparamRequest $request
     *
     * @return BatchquerySgServiceparamResponse
     */
    public function batchquerySgServiceparam($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchquerySgServiceparamEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-查询全部服务参数信息
     * Summary: 查询全部服务参数信息.
     *
     * @param BatchquerySgServiceparamRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return BatchquerySgServiceparamResponse
     */
    public function batchquerySgServiceparamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchquerySgServiceparamResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceparam.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询注入了指定类型的sidecar 的Pod 实例
     * Summary: sidecar实例查询.
     *
     * @param QueryMeshSidecarRequest $request
     *
     * @return QueryMeshSidecarResponse
     */
    public function queryMeshSidecar($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeshSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询注入了指定类型的sidecar 的Pod 实例
     * Summary: sidecar实例查询.
     *
     * @param QueryMeshSidecarRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryMeshSidecarResponse
     */
    public function queryMeshSidecarEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeshSidecarResponse::fromMap($this->doRequest('2.0', 'sofa.ms.mesh.sidecar.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-配置获取
     * Summary: 配置获取.
     *
     * @param GetGuardianGuardianconfigRequest $request
     *
     * @return GetGuardianGuardianconfigResponse
     */
    public function getGuardianGuardianconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGuardianGuardianconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-配置获取
     * Summary: 配置获取.
     *
     * @param GetGuardianGuardianconfigRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetGuardianGuardianconfigResponse
     */
    public function getGuardianGuardianconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGuardianGuardianconfigResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianconfig.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-获取app列表
     * Summary: 获取app列表.
     *
     * @param AllGuardianGuardianappsRequest $request
     *
     * @return AllGuardianGuardianappsResponse
     */
    public function allGuardianGuardianapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allGuardianGuardianappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-获取app列表
     * Summary: 获取app列表.
     *
     * @param AllGuardianGuardianappsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return AllGuardianGuardianappsResponse
     */
    public function allGuardianGuardianappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllGuardianGuardianappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianapps.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-查询appName列表
     * Summary: 查询appName列表.
     *
     * @param AllGuardianGuardianappnamesRequest $request
     *
     * @return AllGuardianGuardianappnamesResponse
     */
    public function allGuardianGuardianappnames($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allGuardianGuardianappnamesEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-查询appName列表
     * Summary: 查询appName列表.
     *
     * @param AllGuardianGuardianappnamesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return AllGuardianGuardianappnamesResponse
     */
    public function allGuardianGuardianappnamesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllGuardianGuardianappnamesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianappnames.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 微服务-分页查询app
     * Summary: 分页查询app.
     *
     * @param QueryGuardianGuardianappsRequest $request
     *
     * @return QueryGuardianGuardianappsResponse
     */
    public function queryGuardianGuardianapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardianGuardianappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 微服务-分页查询app
     * Summary: 分页查询app.
     *
     * @param QueryGuardianGuardianappsRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryGuardianGuardianappsResponse
     */
    public function queryGuardianGuardianappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardianGuardianappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianapps.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms -根据appName获取app
     * Summary: 根据appName获取app.
     *
     * @param GetGuardianGuardianappsRequest $request
     *
     * @return GetGuardianGuardianappsResponse
     */
    public function getGuardianGuardianapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGuardianGuardianappsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms -根据appName获取app
     * Summary: 根据appName获取app.
     *
     * @param GetGuardianGuardianappsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetGuardianGuardianappsResponse
     */
    public function getGuardianGuardianappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGuardianGuardianappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianapps.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-添加 监控App
     * Summary: 添加 监控App.
     *
     * @param AddGuardianGuardianappsRequest $request
     *
     * @return AddGuardianGuardianappsResponse
     */
    public function addGuardianGuardianapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addGuardianGuardianappsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-添加 监控App
     * Summary: 添加 监控App.
     *
     * @param AddGuardianGuardianappsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return AddGuardianGuardianappsResponse
     */
    public function addGuardianGuardianappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddGuardianGuardianappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianapps.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ws-更新监控app
     * Summary: 更新监控app.
     *
     * @param UpdateGuardianGuardianappsRequest $request
     *
     * @return UpdateGuardianGuardianappsResponse
     */
    public function updateGuardianGuardianapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGuardianGuardianappsEx($request, $headers, $runtime);
    }

    /**
     * Description: ws-更新监控app
     * Summary: 更新监控app.
     *
     * @param UpdateGuardianGuardianappsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateGuardianGuardianappsResponse
     */
    public function updateGuardianGuardianappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGuardianGuardianappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianapps.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms- 删除监控 app
     * Summary: 删除监控 app.
     *
     * @param DeleteGuardianGuardianappsRequest $request
     *
     * @return DeleteGuardianGuardianappsResponse
     */
    public function deleteGuardianGuardianapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteGuardianGuardianappsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms- 删除监控 app
     * Summary: 删除监控 app.
     *
     * @param DeleteGuardianGuardianappsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DeleteGuardianGuardianappsResponse
     */
    public function deleteGuardianGuardianappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteGuardianGuardianappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianapps.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms - 规则配置分页
     * Summary: 规则配置分页.
     *
     * @param QueryGuardianGuardianrulesRequest $request
     *
     * @return QueryGuardianGuardianrulesResponse
     */
    public function queryGuardianGuardianrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardianGuardianrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms - 规则配置分页
     * Summary: 规则配置分页.
     *
     * @param QueryGuardianGuardianrulesRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryGuardianGuardianrulesResponse
     */
    public function queryGuardianGuardianrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardianGuardianrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrules.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-根据id获取规则
     * Summary: 根据id获取规则.
     *
     * @param GetGuardianGuardianrulesRequest $request
     *
     * @return GetGuardianGuardianrulesResponse
     */
    public function getGuardianGuardianrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGuardianGuardianrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-根据id获取规则
     * Summary: 根据id获取规则.
     *
     * @param GetGuardianGuardianrulesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetGuardianGuardianrulesResponse
     */
    public function getGuardianGuardianrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGuardianGuardianrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrules.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-添加规则
     * Summary: 添加规则.
     *
     * @param AddGuardianGuardianrulesRequest $request
     *
     * @return AddGuardianGuardianrulesResponse
     */
    public function addGuardianGuardianrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addGuardianGuardianrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-添加规则
     * Summary: 添加规则.
     *
     * @param AddGuardianGuardianrulesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AddGuardianGuardianrulesResponse
     */
    public function addGuardianGuardianrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddGuardianGuardianrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrules.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-更新规则
     * Summary: 更新规则.
     *
     * @param UpdateGuardianGuardianrulesRequest $request
     *
     * @return UpdateGuardianGuardianrulesResponse
     */
    public function updateGuardianGuardianrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGuardianGuardianrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-更新规则
     * Summary: 更新规则.
     *
     * @param UpdateGuardianGuardianrulesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateGuardianGuardianrulesResponse
     */
    public function updateGuardianGuardianrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGuardianGuardianrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrules.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-更新规则状态
     * Summary: 更新规则状态
     *
     * @param UpdateGuardianGuardianrulestatusRequest $request
     *
     * @return UpdateGuardianGuardianrulestatusResponse
     */
    public function updateGuardianGuardianrulestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGuardianGuardianrulestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-更新规则状态
     * Summary: 更新规则状态
     *
     * @param UpdateGuardianGuardianrulestatusRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return UpdateGuardianGuardianrulestatusResponse
     */
    public function updateGuardianGuardianrulestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGuardianGuardianrulestatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrulestatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-删除规则
     * Summary: 删除规则.
     *
     * @param DeleteGuardianGuardianrulesRequest $request
     *
     * @return DeleteGuardianGuardianrulesResponse
     */
    public function deleteGuardianGuardianrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteGuardianGuardianrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-删除规则
     * Summary: 删除规则.
     *
     * @param DeleteGuardianGuardianrulesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DeleteGuardianGuardianrulesResponse
     */
    public function deleteGuardianGuardianrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteGuardianGuardianrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrules.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-分页查询推送历史
     * Summary: 分页查询推送历史.
     *
     * @param QueryGuardianGuardianrulepushhistorysRequest $request
     *
     * @return QueryGuardianGuardianrulepushhistorysResponse
     */
    public function queryGuardianGuardianrulepushhistorys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardianGuardianrulepushhistorysEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-分页查询推送历史
     * Summary: 分页查询推送历史.
     *
     * @param QueryGuardianGuardianrulepushhistorysRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryGuardianGuardianrulepushhistorysResponse
     */
    public function queryGuardianGuardianrulepushhistorysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardianGuardianrulepushhistorysResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrulepushhistorys.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-查询推送历史
     * Summary: 查询推送历史.
     *
     * @param ListGuardianGuardianrulepushhistorysRequest $request
     *
     * @return ListGuardianGuardianrulepushhistorysResponse
     */
    public function listGuardianGuardianrulepushhistorys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listGuardianGuardianrulepushhistorysEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-查询推送历史
     * Summary: 查询推送历史.
     *
     * @param ListGuardianGuardianrulepushhistorysRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return ListGuardianGuardianrulepushhistorysResponse
     */
    public function listGuardianGuardianrulepushhistorysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListGuardianGuardianrulepushhistorysResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrulepushhistorys.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-灰度推送
     * Summary: 灰度推送
     *
     * @param AddGuardianGuardiangrayrulesRequest $request
     *
     * @return AddGuardianGuardiangrayrulesResponse
     */
    public function addGuardianGuardiangrayrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addGuardianGuardiangrayrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-灰度推送
     * Summary: 灰度推送
     *
     * @param AddGuardianGuardiangrayrulesRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return AddGuardianGuardiangrayrulesResponse
     */
    public function addGuardianGuardiangrayrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddGuardianGuardiangrayrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardiangrayrules.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-更改规则灰度状态
     * Summary: 更改规则灰度状态
     *
     * @param UpdateGuardianGuardiangrayrulestatusRequest $request
     *
     * @return UpdateGuardianGuardiangrayrulestatusResponse
     */
    public function updateGuardianGuardiangrayrulestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGuardianGuardiangrayrulestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-更改规则灰度状态
     * Summary: 更改规则灰度状态
     *
     * @param UpdateGuardianGuardiangrayrulestatusRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return UpdateGuardianGuardiangrayrulestatusResponse
     */
    public function updateGuardianGuardiangrayrulestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGuardianGuardiangrayrulestatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardiangrayrulestatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-查询实例App name
     * Summary: 查询实例App name.
     *
     * @param AllDrmDrmappsRequest $request
     *
     * @return AllDrmDrmappsResponse
     */
    public function allDrmDrmapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allDrmDrmappsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-查询实例App name
     * Summary: 查询实例App name.
     *
     * @param AllDrmDrmappsRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AllDrmDrmappsResponse
     */
    public function allDrmDrmappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllDrmDrmappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmapps.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-分页查询Drm资源
     * Summary: 分页查询Drm资源.
     *
     * @param QueryDrmDrmresourcesRequest $request
     *
     * @return QueryDrmDrmresourcesResponse
     */
    public function queryDrmDrmresources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDrmDrmresourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-分页查询Drm资源
     * Summary: 分页查询Drm资源.
     *
     * @param QueryDrmDrmresourcesRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryDrmDrmresourcesResponse
     */
    public function queryDrmDrmresourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDrmDrmresourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresources.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-添加drm资源
     * Summary: 添加drm资源.
     *
     * @param AddDrmDrmresourcesRequest $request
     *
     * @return AddDrmDrmresourcesResponse
     */
    public function addDrmDrmresources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDrmDrmresourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-添加drm资源
     * Summary: 添加drm资源.
     *
     * @param AddDrmDrmresourcesRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AddDrmDrmresourcesResponse
     */
    public function addDrmDrmresourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDrmDrmresourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresources.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-更新drm资源
     * Summary: 更新drm资源.
     *
     * @param UpdateDrmDrmresourcesRequest $request
     *
     * @return UpdateDrmDrmresourcesResponse
     */
    public function updateDrmDrmresources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDrmDrmresourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-更新drm资源
     * Summary: 更新drm资源.
     *
     * @param UpdateDrmDrmresourcesRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateDrmDrmresourcesResponse
     */
    public function updateDrmDrmresourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDrmDrmresourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresources.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-添加drm属性
     * Summary: 添加drm属性.
     *
     * @param AddDrmDrmattributesRequest $request
     *
     * @return AddDrmDrmattributesResponse
     */
    public function addDrmDrmattributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDrmDrmattributesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-添加drm属性
     * Summary: 添加drm属性.
     *
     * @param AddDrmDrmattributesRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AddDrmDrmattributesResponse
     */
    public function addDrmDrmattributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDrmDrmattributesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmattributes.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-更新drm资源属性
     * Summary: 更新drm资源属性.
     *
     * @param UpdateDrmDrmattributesRequest $request
     *
     * @return UpdateDrmDrmattributesResponse
     */
    public function updateDrmDrmattributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDrmDrmattributesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-更新drm资源属性
     * Summary: 更新drm资源属性.
     *
     * @param UpdateDrmDrmattributesRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateDrmDrmattributesResponse
     */
    public function updateDrmDrmattributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDrmDrmattributesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmattributes.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-Delete resource
     * Summary: Delete resource.
     *
     * @param DeleteDrmDrmresourcesRequest $request
     *
     * @return DeleteDrmDrmresourcesResponse
     */
    public function deleteDrmDrmresources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDrmDrmresourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-Delete resource
     * Summary: Delete resource.
     *
     * @param DeleteDrmDrmresourcesRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteDrmDrmresourcesResponse
     */
    public function deleteDrmDrmresourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDrmDrmresourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresources.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-删除drm资源属性
     * Summary: 删除drm资源属性.
     *
     * @param DeleteDrmDrmattributesRequest $request
     *
     * @return DeleteDrmDrmattributesResponse
     */
    public function deleteDrmDrmattributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDrmDrmattributesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-删除drm资源属性
     * Summary: 删除drm资源属性.
     *
     * @param DeleteDrmDrmattributesRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteDrmDrmattributesResponse
     */
    public function deleteDrmDrmattributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDrmDrmattributesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmattributes.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-获取drm资源属性
     * Summary: 获取drm资源属性.
     *
     * @param GetDrmDrmattributesRequest $request
     *
     * @return GetDrmDrmattributesResponse
     */
    public function getDrmDrmattributes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDrmDrmattributesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-获取drm资源属性
     * Summary: 获取drm资源属性.
     *
     * @param GetDrmDrmattributesRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetDrmDrmattributesResponse
     */
    public function getDrmDrmattributesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDrmDrmattributesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmattributes.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-搜索客户端信息
     * Summary: 搜索客户端信息.
     *
     * @param QueryDrmDrmclientsRequest $request
     *
     * @return QueryDrmDrmclientsResponse
     */
    public function queryDrmDrmclients($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDrmDrmclientsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-搜索客户端信息
     * Summary: 搜索客户端信息.
     *
     * @param QueryDrmDrmclientsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryDrmDrmclientsResponse
     */
    public function queryDrmDrmclientsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDrmDrmclientsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmclients.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-搜索客户端信息
     * Summary: 搜索客户端信息.
     *
     * @param QueryDrmDrmhostsRequest $request
     *
     * @return QueryDrmDrmhostsResponse
     */
    public function queryDrmDrmhosts($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDrmDrmhostsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-搜索客户端信息
     * Summary: 搜索客户端信息.
     *
     * @param QueryDrmDrmhostsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryDrmDrmhostsResponse
     */
    public function queryDrmDrmhostsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDrmDrmhostsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmhosts.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-分页搜索推送日志
     * Summary: 分页搜索推送日志.
     *
     * @param ListDrmDrmpushlogsRequest $request
     *
     * @return ListDrmDrmpushlogsResponse
     */
    public function listDrmDrmpushlogs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDrmDrmpushlogsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-分页搜索推送日志
     * Summary: 分页搜索推送日志.
     *
     * @param ListDrmDrmpushlogsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListDrmDrmpushlogsResponse
     */
    public function listDrmDrmpushlogsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDrmDrmpushlogsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmpushlogs.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-按条件分页查询推送日志
     * Summary: 按条件分页查询推送日志.
     *
     * @param QueryDrmDrmpushlogsRequest $request
     *
     * @return QueryDrmDrmpushlogsResponse
     */
    public function queryDrmDrmpushlogs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDrmDrmpushlogsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-按条件分页查询推送日志
     * Summary: 按条件分页查询推送日志.
     *
     * @param QueryDrmDrmpushlogsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDrmDrmpushlogsResponse
     */
    public function queryDrmDrmpushlogsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDrmDrmpushlogsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmpushlogs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-推送drm配置
     * Summary: 推送drm配置.
     *
     * @param AddDrmDrmdataRequest $request
     *
     * @return AddDrmDrmdataResponse
     */
    public function addDrmDrmdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDrmDrmdataEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-推送drm配置
     * Summary: 推送drm配置.
     *
     * @param AddDrmDrmdataRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AddDrmDrmdataResponse
     */
    public function addDrmDrmdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDrmDrmdataResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmdata.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-灰度推送数据
     * Summary: 灰度推送数据.
     *
     * @param AddDrmDrmgraydataRequest $request
     *
     * @return AddDrmDrmgraydataResponse
     */
    public function addDrmDrmgraydata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDrmDrmgraydataEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-灰度推送数据
     * Summary: 灰度推送数据.
     *
     * @param AddDrmDrmgraydataRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AddDrmDrmgraydataResponse
     */
    public function addDrmDrmgraydataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDrmDrmgraydataResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmgraydata.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-获取实例的单元格
     * Summary: 获取实例的单元格
     *
     * @param AllDrmDrmcellsRequest $request
     *
     * @return AllDrmDrmcellsResponse
     */
    public function allDrmDrmcells($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allDrmDrmcellsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-获取实例的单元格
     * Summary: 获取实例的单元格
     *
     * @param AllDrmDrmcellsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AllDrmDrmcellsResponse
     */
    public function allDrmDrmcellsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllDrmDrmcellsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmcells.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-获取Drm数据单元信息
     * Summary: 获取Drm数据单元信息.
     *
     * @param ListDrmDrmdatacellsRequest $request
     *
     * @return ListDrmDrmdatacellsResponse
     */
    public function listDrmDrmdatacells($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDrmDrmdatacellsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-获取Drm数据单元信息
     * Summary: 获取Drm数据单元信息.
     *
     * @param ListDrmDrmdatacellsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListDrmDrmdatacellsResponse
     */
    public function listDrmDrmdatacellsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDrmDrmdatacellsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmdatacells.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-添加Tpl类型drm资源
     * Summary: 添加Tpl类型drm资源.
     *
     * @param AddDrmDrmresourcetplsRequest $request
     *
     * @return AddDrmDrmresourcetplsResponse
     */
    public function addDrmDrmresourcetpls($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDrmDrmresourcetplsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-添加Tpl类型drm资源
     * Summary: 添加Tpl类型drm资源.
     *
     * @param AddDrmDrmresourcetplsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AddDrmDrmresourcetplsResponse
     */
    public function addDrmDrmresourcetplsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDrmDrmresourcetplsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresourcetpls.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-更新Tpl类型drm资源
     * Summary: 更新Tpl类型drm资源.
     *
     * @param UpdateDrmDrmresourcetplsRequest $request
     *
     * @return UpdateDrmDrmresourcetplsResponse
     */
    public function updateDrmDrmresourcetpls($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDrmDrmresourcetplsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-更新Tpl类型drm资源
     * Summary: 更新Tpl类型drm资源.
     *
     * @param UpdateDrmDrmresourcetplsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateDrmDrmresourcetplsResponse
     */
    public function updateDrmDrmresourcetplsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDrmDrmresourcetplsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresourcetpls.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-删除Tpl类型drm资源
     * Summary: 删除Tpl类型drm资源.
     *
     * @param DeleteDrmDrmresourcetplsRequest $request
     *
     * @return DeleteDrmDrmresourcetplsResponse
     */
    public function deleteDrmDrmresourcetpls($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDrmDrmresourcetplsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-删除Tpl类型drm资源
     * Summary: 删除Tpl类型drm资源.
     *
     * @param DeleteDrmDrmresourcetplsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DeleteDrmDrmresourcetplsResponse
     */
    public function deleteDrmDrmresourcetplsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDrmDrmresourcetplsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresourcetpls.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms -分页查询Tpl类型drm资源
     * Summary: 分页查询Tpl类型drm资源.
     *
     * @param QueryDrmDrmresourcetplsRequest $request
     *
     * @return QueryDrmDrmresourcetplsResponse
     */
    public function queryDrmDrmresourcetpls($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDrmDrmresourcetplsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms -分页查询Tpl类型drm资源
     * Summary: 分页查询Tpl类型drm资源.
     *
     * @param QueryDrmDrmresourcetplsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDrmDrmresourcetplsResponse
     */
    public function queryDrmDrmresourcetplsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDrmDrmresourcetplsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresourcetpls.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms -创建资源Tpl实例
     * Summary: 创建资源Tpl实例.
     *
     * @param AddDrmDrmresourcetplinstancesRequest $request
     *
     * @return AddDrmDrmresourcetplinstancesResponse
     */
    public function addDrmDrmresourcetplinstances($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDrmDrmresourcetplinstancesEx($request, $headers, $runtime);
    }

    /**
     * Description: ms -创建资源Tpl实例
     * Summary: 创建资源Tpl实例.
     *
     * @param AddDrmDrmresourcetplinstancesRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return AddDrmDrmresourcetplinstancesResponse
     */
    public function addDrmDrmresourcetplinstancesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDrmDrmresourcetplinstancesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresourcetplinstances.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 一键创建注册中心同步任务
     * Summary: 一键创建注册中心同步任务
     *
     * @param AddRcSyncbucketRequest $request
     *
     * @return AddRcSyncbucketResponse
     */
    public function addRcSyncbucket($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addRcSyncbucketEx($request, $headers, $runtime);
    }

    /**
     * Description: 一键创建注册中心同步任务
     * Summary: 一键创建注册中心同步任务
     *
     * @param AddRcSyncbucketRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddRcSyncbucketResponse
     */
    public function addRcSyncbucketEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddRcSyncbucketResponse::fromMap($this->doRequest('2.0', 'sofa.ms.rc.syncbucket.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询注册中心同步集群信息
     * Summary: 查询注册中心同步集群信息.
     *
     * @param QueryRcSyncclusterRequest $request
     *
     * @return QueryRcSyncclusterResponse
     */
    public function queryRcSynccluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRcSyncclusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询注册中心同步集群信息
     * Summary: 查询注册中心同步集群信息.
     *
     * @param QueryRcSyncclusterRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryRcSyncclusterResponse
     */
    public function queryRcSyncclusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRcSyncclusterResponse::fromMap($this->doRequest('2.0', 'sofa.ms.rc.synccluster.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询集群同步任务信息
     * Summary: 查询集群同步任务信息.
     *
     * @param QueryRcSynctaskRequest $request
     *
     * @return QueryRcSynctaskResponse
     */
    public function queryRcSynctask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRcSynctaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询集群同步任务信息
     * Summary: 查询集群同步任务信息.
     *
     * @param QueryRcSynctaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryRcSynctaskResponse
     */
    public function queryRcSynctaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRcSynctaskResponse::fromMap($this->doRequest('2.0', 'sofa.ms.rc.synctask.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询某个服务具体同步的数据
     * Summary: 查询某个服务具体同步的数据.
     *
     * @param QueryRcSyncdataRequest $request
     *
     * @return QueryRcSyncdataResponse
     */
    public function queryRcSyncdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRcSyncdataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询某个服务具体同步的数据
     * Summary: 查询某个服务具体同步的数据.
     *
     * @param QueryRcSyncdataRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryRcSyncdataResponse
     */
    public function queryRcSyncdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRcSyncdataResponse::fromMap($this->doRequest('2.0', 'sofa.ms.rc.syncdata.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开启任务
     * Summary: 开启任务
     *
     * @param StartRcSynctaskRequest $request
     *
     * @return StartRcSynctaskResponse
     */
    public function startRcSynctask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startRcSynctaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 开启任务
     * Summary: 开启任务
     *
     * @param StartRcSynctaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return StartRcSynctaskResponse
     */
    public function startRcSynctaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartRcSynctaskResponse::fromMap($this->doRequest('2.0', 'sofa.ms.rc.synctask.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 停止任务
     * Summary: 停止任务
     *
     * @param StopRcSynctaskRequest $request
     *
     * @return StopRcSynctaskResponse
     */
    public function stopRcSynctask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopRcSynctaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 停止任务
     * Summary: 停止任务
     *
     * @param StopRcSynctaskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return StopRcSynctaskResponse
     */
    public function stopRcSynctaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopRcSynctaskResponse::fromMap($this->doRequest('2.0', 'sofa.ms.rc.synctask.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 当前workspace下所有资源元信息
     * Summary: 导出资源.
     *
     * @param ExportDrmDrmresourcesRequest $request
     *
     * @return ExportDrmDrmresourcesResponse
     */
    public function exportDrmDrmresources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportDrmDrmresourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: 当前workspace下所有资源元信息
     * Summary: 导出资源.
     *
     * @param ExportDrmDrmresourcesRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ExportDrmDrmresourcesResponse
     */
    public function exportDrmDrmresourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportDrmDrmresourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresources.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导入drm资源元信息
     * Summary: 导入drm资源元信息.
     *
     * @param ImportDrmDrmresourcesRequest $request
     *
     * @return ImportDrmDrmresourcesResponse
     */
    public function importDrmDrmresources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importDrmDrmresourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: 导入drm资源元信息
     * Summary: 导入drm资源元信息.
     *
     * @param ImportDrmDrmresourcesRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ImportDrmDrmresourcesResponse
     */
    public function importDrmDrmresourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportDrmDrmresourcesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmresources.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导入guardian规则
     * Summary: 导入guardian规则.
     *
     * @param ImportGuardianGuardianrulesRequest $request
     *
     * @return ImportGuardianGuardianrulesResponse
     */
    public function importGuardianGuardianrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importGuardianGuardianrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 导入guardian规则
     * Summary: 导入guardian规则.
     *
     * @param ImportGuardianGuardianrulesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ImportGuardianGuardianrulesResponse
     */
    public function importGuardianGuardianrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportGuardianGuardianrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrules.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导出guardian路由规则
     * Summary: 导出guardian路由规则.
     *
     * @param ExportGuardianGuardianrulesRequest $request
     *
     * @return ExportGuardianGuardianrulesResponse
     */
    public function exportGuardianGuardianrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportGuardianGuardianrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 导出guardian路由规则
     * Summary: 导出guardian路由规则.
     *
     * @param ExportGuardianGuardianrulesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ExportGuardianGuardianrulesResponse
     */
    public function exportGuardianGuardianrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportGuardianGuardianrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.guardian.guardianrules.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取上传地址
     * Summary: 获取上传地址
     *
     * @param GetDrmUploadurlRequest $request
     *
     * @return GetDrmUploadurlResponse
     */
    public function getDrmUploadurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDrmUploadurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取上传地址
     * Summary: 获取上传地址
     *
     * @param GetDrmUploadurlRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetDrmUploadurlResponse
     */
    public function getDrmUploadurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDrmUploadurlResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.uploadurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门计费回调
     * Summary: 南天门计费回调.
     *
     * @param CallbackSpiOmsRequest $request
     *
     * @return CallbackSpiOmsResponse
     */
    public function callbackSpiOms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackSpiOmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门计费回调
     * Summary: 南天门计费回调.
     *
     * @param CallbackSpiOmsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CallbackSpiOmsResponse
     */
    public function callbackSpiOmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackSpiOmsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.spi.oms.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ms-查询实例下所有cells
     * Summary: 查询实例下所有cells.
     *
     * @param AllDrmDrmldccellsRequest $request
     *
     * @return AllDrmDrmldccellsResponse
     */
    public function allDrmDrmldccells($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allDrmDrmldccellsEx($request, $headers, $runtime);
    }

    /**
     * Description: ms-查询实例下所有cells
     * Summary: 查询实例下所有cells.
     *
     * @param AllDrmDrmldccellsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AllDrmDrmldccellsResponse
     */
    public function allDrmDrmldccellsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllDrmDrmldccellsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.drm.drmldccells.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供给 paas 平台，发布时先调用下线接口，再发布
     * Summary: 服务下线接口.
     *
     * @param OfflineSgServicepublishersRequest $request
     *
     * @return OfflineSgServicepublishersResponse
     */
    public function offlineSgServicepublishers($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineSgServicepublishersEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供给 paas 平台，发布时先调用下线接口，再发布
     * Summary: 服务下线接口.
     *
     * @param OfflineSgServicepublishersRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return OfflineSgServicepublishersResponse
     */
    public function offlineSgServicepublishersEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineSgServicepublishersResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.servicepublishers.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除任务
     * Summary: 删除任务
     *
     * @param DeleteRcSynctaskRequest $request
     *
     * @return DeleteRcSynctaskResponse
     */
    public function deleteRcSynctask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteRcSynctaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除任务
     * Summary: 删除任务
     *
     * @param DeleteRcSynctaskRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteRcSynctaskResponse
     */
    public function deleteRcSynctaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteRcSynctaskResponse::fromMap($this->doRequest('2.0', 'sofa.ms.rc.synctask.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询降级规则组列表
     * Summary: 查询降级规则组列表.
     *
     * @param QuerySgDowngradegroupsRequest $request
     *
     * @return QuerySgDowngradegroupsResponse
     */
    public function querySgDowngradegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgDowngradegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询降级规则组列表
     * Summary: 查询降级规则组列表.
     *
     * @param QuerySgDowngradegroupsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QuerySgDowngradegroupsResponse
     */
    public function querySgDowngradegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgDowngradegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.downgradegroups.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除降级规则
     * Summary: 删除降级规则.
     *
     * @param DeleteSgDowngradesRequest $request
     *
     * @return DeleteSgDowngradesResponse
     */
    public function deleteSgDowngrades($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgDowngradesEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除降级规则
     * Summary: 删除降级规则.
     *
     * @param DeleteSgDowngradesRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteSgDowngradesResponse
     */
    public function deleteSgDowngradesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgDowngradesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.downgrades.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增降级规则
     * Summary: 新增降级规则.
     *
     * @param AddSgDowngradesRequest $request
     *
     * @return AddSgDowngradesResponse
     */
    public function addSgDowngrades($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgDowngradesEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增降级规则
     * Summary: 新增降级规则.
     *
     * @param AddSgDowngradesRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddSgDowngradesResponse
     */
    public function addSgDowngradesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgDowngradesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.downgrades.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新降级规则
     * Summary: 更新降级规则.
     *
     * @param UpdateSgDowngradesRequest $request
     *
     * @return UpdateSgDowngradesResponse
     */
    public function updateSgDowngrades($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgDowngradesEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新降级规则
     * Summary: 更新降级规则.
     *
     * @param UpdateSgDowngradesRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateSgDowngradesResponse
     */
    public function updateSgDowngradesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgDowngradesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.downgrades.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全局开启降级规则
     * Summary: 全局开启降级规则.
     *
     * @param EnableSgDowngradegroupsRequest $request
     *
     * @return EnableSgDowngradegroupsResponse
     */
    public function enableSgDowngradegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSgDowngradegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 全局开启降级规则
     * Summary: 全局开启降级规则.
     *
     * @param EnableSgDowngradegroupsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return EnableSgDowngradegroupsResponse
     */
    public function enableSgDowngradegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSgDowngradegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.downgradegroups.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全局关闭降级规则
     * Summary: 全局关闭降级规则.
     *
     * @param DisableSgDowngradegroupsRequest $request
     *
     * @return DisableSgDowngradegroupsResponse
     */
    public function disableSgDowngradegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableSgDowngradegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 全局关闭降级规则
     * Summary: 全局关闭降级规则.
     *
     * @param DisableSgDowngradegroupsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DisableSgDowngradegroupsResponse
     */
    public function disableSgDowngradegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableSgDowngradegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.downgradegroups.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开启一条降级规则
     * Summary: 开启一条降级规则.
     *
     * @param EnableSgDowngradesRequest $request
     *
     * @return EnableSgDowngradesResponse
     */
    public function enableSgDowngrades($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSgDowngradesEx($request, $headers, $runtime);
    }

    /**
     * Description: 开启一条降级规则
     * Summary: 开启一条降级规则.
     *
     * @param EnableSgDowngradesRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return EnableSgDowngradesResponse
     */
    public function enableSgDowngradesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSgDowngradesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.downgrades.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 关闭一条降级规则
     * Summary: 关闭一条降级规则.
     *
     * @param DisableSgDowngradesRequest $request
     *
     * @return DisableSgDowngradesResponse
     */
    public function disableSgDowngrades($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableSgDowngradesEx($request, $headers, $runtime);
    }

    /**
     * Description: 关闭一条降级规则
     * Summary: 关闭一条降级规则.
     *
     * @param DisableSgDowngradesRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DisableSgDowngradesResponse
     */
    public function disableSgDowngradesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableSgDowngradesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.downgrades.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生效熔断规则
     * Summary: 生效熔断规则.
     *
     * @param EnableSgCircuitbreakerrulesRequest $request
     *
     * @return EnableSgCircuitbreakerrulesResponse
     */
    public function enableSgCircuitbreakerrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSgCircuitbreakerrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 生效熔断规则
     * Summary: 生效熔断规则.
     *
     * @param EnableSgCircuitbreakerrulesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return EnableSgCircuitbreakerrulesResponse
     */
    public function enableSgCircuitbreakerrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSgCircuitbreakerrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.circuitbreakerrules.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据实例id和服务id获取所有荣富安规则
     * Summary: 熔断规则查询.
     *
     * @param QuerySgCircuitbreakerrulesRequest $request
     *
     * @return QuerySgCircuitbreakerrulesResponse
     */
    public function querySgCircuitbreakerrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySgCircuitbreakerrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据实例id和服务id获取所有荣富安规则
     * Summary: 熔断规则查询.
     *
     * @param QuerySgCircuitbreakerrulesRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QuerySgCircuitbreakerrulesResponse
     */
    public function querySgCircuitbreakerrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySgCircuitbreakerrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.circuitbreakerrules.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取租户下服务熔断规则
     * Summary: 服务熔断查询.
     *
     * @param ListSgCircuitbreakerrulesRequest $request
     *
     * @return ListSgCircuitbreakerrulesResponse
     */
    public function listSgCircuitbreakerrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgCircuitbreakerrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取租户下服务熔断规则
     * Summary: 服务熔断查询.
     *
     * @param ListSgCircuitbreakerrulesRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListSgCircuitbreakerrulesResponse
     */
    public function listSgCircuitbreakerrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgCircuitbreakerrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.circuitbreakerrules.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新熔断规则
     * Summary: 更新熔断规则.
     *
     * @param UpdateSgCircuitbreakerrulesRequest $request
     *
     * @return UpdateSgCircuitbreakerrulesResponse
     */
    public function updateSgCircuitbreakerrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgCircuitbreakerrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新熔断规则
     * Summary: 更新熔断规则.
     *
     * @param UpdateSgCircuitbreakerrulesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateSgCircuitbreakerrulesResponse
     */
    public function updateSgCircuitbreakerrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgCircuitbreakerrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.circuitbreakerrules.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除熔断规则
     * Summary: 删除熔断规则.
     *
     * @param DeleteSgCircuitbreakerrulesRequest $request
     *
     * @return DeleteSgCircuitbreakerrulesResponse
     */
    public function deleteSgCircuitbreakerrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgCircuitbreakerrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除熔断规则
     * Summary: 删除熔断规则.
     *
     * @param DeleteSgCircuitbreakerrulesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DeleteSgCircuitbreakerrulesResponse
     */
    public function deleteSgCircuitbreakerrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgCircuitbreakerrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.circuitbreakerrules.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加熔断规则
     * Summary: 添加熔断规则.
     *
     * @param AddSgCircuitbreakerrulesRequest $request
     *
     * @return AddSgCircuitbreakerrulesResponse
     */
    public function addSgCircuitbreakerrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgCircuitbreakerrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加熔断规则
     * Summary: 添加熔断规则.
     *
     * @param AddSgCircuitbreakerrulesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AddSgCircuitbreakerrulesResponse
     */
    public function addSgCircuitbreakerrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgCircuitbreakerrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.circuitbreakerrules.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设置熔断规则运行模式
     * Summary: 设置熔断规则运行模式.
     *
     * @param SetSgCircuitbreakerrulesRequest $request
     *
     * @return SetSgCircuitbreakerrulesResponse
     */
    public function setSgCircuitbreakerrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setSgCircuitbreakerrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 设置熔断规则运行模式
     * Summary: 设置熔断规则运行模式.
     *
     * @param SetSgCircuitbreakerrulesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SetSgCircuitbreakerrulesResponse
     */
    public function setSgCircuitbreakerrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetSgCircuitbreakerrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.circuitbreakerrules.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新初始化注册中心同步集群信息
     * Summary: 重新初始化注册中心同步集群信息.
     *
     * @param ReinitRcSyncclusterRequest $request
     *
     * @return ReinitRcSyncclusterResponse
     */
    public function reinitRcSynccluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reinitRcSyncclusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新初始化注册中心同步集群信息
     * Summary: 重新初始化注册中心同步集群信息.
     *
     * @param ReinitRcSyncclusterRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ReinitRcSyncclusterResponse
     */
    public function reinitRcSyncclusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReinitRcSyncclusterResponse::fromMap($this->doRequest('2.0', 'sofa.ms.rc.synccluster.reinit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 在指定应用上添加透明劫持节点。
     * Summary: 添加透明劫持节点.
     *
     * @param AddTransparentproxyNodeRequest $request
     *
     * @return AddTransparentproxyNodeResponse
     */
    public function addTransparentproxyNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addTransparentproxyNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 在指定应用上添加透明劫持节点。
     * Summary: 添加透明劫持节点.
     *
     * @param AddTransparentproxyNodeRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return AddTransparentproxyNodeResponse
     */
    public function addTransparentproxyNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddTransparentproxyNodeResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.node.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据应用 ID，删除对应的透明劫持应用。
     * Summary: 删除透明劫持应用.
     *
     * @param DeleteTransparentproxyAppRequest $request
     *
     * @return DeleteTransparentproxyAppResponse
     */
    public function deleteTransparentproxyApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTransparentproxyAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据应用 ID，删除对应的透明劫持应用。
     * Summary: 删除透明劫持应用.
     *
     * @param DeleteTransparentproxyAppRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DeleteTransparentproxyAppResponse
     */
    public function deleteTransparentproxyAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTransparentproxyAppResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.app.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定环境下服务治理中的透明劫持应用列表。
     * Summary: 服务治理透明劫持应用列表.
     *
     * @param QueryTransparentproxyAppRequest $request
     *
     * @return QueryTransparentproxyAppResponse
     */
    public function queryTransparentproxyApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTransparentproxyAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定环境下服务治理中的透明劫持应用列表。
     * Summary: 服务治理透明劫持应用列表.
     *
     * @param QueryTransparentproxyAppRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryTransparentproxyAppResponse
     */
    public function queryTransparentproxyAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTransparentproxyAppResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.app.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
     * Summary: 透明劫持规则配置.
     *
     * @param UpdateTransparentproxyConfigRequest $request
     *
     * @return UpdateTransparentproxyConfigResponse
     */
    public function updateTransparentproxyConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTransparentproxyConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
     * Summary: 透明劫持规则配置.
     *
     * @param UpdateTransparentproxyConfigRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateTransparentproxyConfigResponse
     */
    public function updateTransparentproxyConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTransparentproxyConfigResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.config.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
     * Summary: 查询透明劫持应用治理日志.
     *
     * @param QueryTransparentproxyLogRequest $request
     *
     * @return QueryTransparentproxyLogResponse
     */
    public function queryTransparentproxyLog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTransparentproxyLogEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
     * Summary: 查询透明劫持应用治理日志.
     *
     * @param QueryTransparentproxyLogRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryTransparentproxyLogResponse
     */
    public function queryTransparentproxyLogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTransparentproxyLogResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.log.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加一个透明劫持应用。
     * Summary: 添加透明劫持应用.
     *
     * @param AddTransparentproxyAppRequest $request
     *
     * @return AddTransparentproxyAppResponse
     */
    public function addTransparentproxyApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addTransparentproxyAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加一个透明劫持应用。
     * Summary: 添加透明劫持应用.
     *
     * @param AddTransparentproxyAppRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return AddTransparentproxyAppResponse
     */
    public function addTransparentproxyAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddTransparentproxyAppResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.app.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据节点 ID，删除对应的透明劫持应用节点。
     * Summary: 删除透明劫持应用节点.
     *
     * @param DeleteTransparentproxyNodeRequest $request
     *
     * @return DeleteTransparentproxyNodeResponse
     */
    public function deleteTransparentproxyNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTransparentproxyNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据节点 ID，删除对应的透明劫持应用节点。
     * Summary: 删除透明劫持应用节点.
     *
     * @param DeleteTransparentproxyNodeRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DeleteTransparentproxyNodeResponse
     */
    public function deleteTransparentproxyNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTransparentproxyNodeResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.node.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询透明劫持应用的节点列表。
     * Summary: 查询透明劫持应用的节点列表.
     *
     * @param QueryTransparentproxyNodeRequest $request
     *
     * @return QueryTransparentproxyNodeResponse
     */
    public function queryTransparentproxyNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTransparentproxyNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询透明劫持应用的节点列表。
     * Summary: 查询透明劫持应用的节点列表.
     *
     * @param QueryTransparentproxyNodeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryTransparentproxyNodeResponse
     */
    public function queryTransparentproxyNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTransparentproxyNodeResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.node.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
     * Summary: 更新透明劫持应用治理配置.
     *
     * @param UpdateTransparentproxyProtocolconfigRequest $request
     *
     * @return UpdateTransparentproxyProtocolconfigResponse
     */
    public function updateTransparentproxyProtocolconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTransparentproxyProtocolconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
     * Summary: 更新透明劫持应用治理配置.
     *
     * @param UpdateTransparentproxyProtocolconfigRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return UpdateTransparentproxyProtocolconfigResponse
     */
    public function updateTransparentproxyProtocolconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTransparentproxyProtocolconfigResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.protocolconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
     * Summary: 打开节点透明劫持开关（批量）.
     *
     * @param EnableTransparentproxyNodeRequest $request
     *
     * @return EnableTransparentproxyNodeResponse
     */
    public function enableTransparentproxyNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableTransparentproxyNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
     * Summary: 打开节点透明劫持开关（批量）.
     *
     * @param EnableTransparentproxyNodeRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return EnableTransparentproxyNodeResponse
     */
    public function enableTransparentproxyNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableTransparentproxyNodeResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.node.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
     * Summary: 关闭透明劫持节点开关（批量）.
     *
     * @param DisableTransparentproxyNodeRequest $request
     *
     * @return DisableTransparentproxyNodeResponse
     */
    public function disableTransparentproxyNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableTransparentproxyNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
     * Summary: 关闭透明劫持节点开关（批量）.
     *
     * @param DisableTransparentproxyNodeRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DisableTransparentproxyNodeResponse
     */
    public function disableTransparentproxyNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableTransparentproxyNodeResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.node.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所有的服务熔断的appName及对应的规则数
     * Summary: 服务熔断查询.
     *
     * @param AllSgCircuitbreakerrulesRequest $request
     *
     * @return AllSgCircuitbreakerrulesResponse
     */
    public function allSgCircuitbreakerrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allSgCircuitbreakerrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所有的服务熔断的appName及对应的规则数
     * Summary: 服务熔断查询.
     *
     * @param AllSgCircuitbreakerrulesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AllSgCircuitbreakerrulesResponse
     */
    public function allSgCircuitbreakerrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllSgCircuitbreakerrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.circuitbreakerrules.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过appName查询熔断规则
     * Summary: 通过appName查询熔断规则.
     *
     * @param GetSgCircuitbreakerrulesRequest $request
     *
     * @return GetSgCircuitbreakerrulesResponse
     */
    public function getSgCircuitbreakerrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSgCircuitbreakerrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过appName查询熔断规则
     * Summary: 通过appName查询熔断规则.
     *
     * @param GetSgCircuitbreakerrulesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetSgCircuitbreakerrulesResponse
     */
    public function getSgCircuitbreakerrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSgCircuitbreakerrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.circuitbreakerrules.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 透明劫持sidecar脚本链接查询接口
     * Summary: 透明劫持sidecar脚本链接查询接口.
     *
     * @param QueryTransparentproxySidecarlinkRequest $request
     *
     * @return QueryTransparentproxySidecarlinkResponse
     */
    public function queryTransparentproxySidecarlink($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTransparentproxySidecarlinkEx($request, $headers, $runtime);
    }

    /**
     * Description: 透明劫持sidecar脚本链接查询接口
     * Summary: 透明劫持sidecar脚本链接查询接口.
     *
     * @param QueryTransparentproxySidecarlinkRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryTransparentproxySidecarlinkResponse
     */
    public function queryTransparentproxySidecarlinkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTransparentproxySidecarlinkResponse::fromMap($this->doRequest('2.0', 'sofa.ms.transparentproxy.sidecarlink.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
     * Summary: 查找出所有包含鉴权规则组的服务ID.
     *
     * @param ListSgAuthruledataidsRequest $request
     *
     * @return ListSgAuthruledataidsResponse
     */
    public function listSgAuthruledataids($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgAuthruledataidsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
     * Summary: 查找出所有包含鉴权规则组的服务ID.
     *
     * @param ListSgAuthruledataidsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListSgAuthruledataidsResponse
     */
    public function listSgAuthruledataidsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgAuthruledataidsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authruledataids.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
     * Summary: 查找出所有包含鉴权规则组的应用名.
     *
     * @param ListSgAuthruleappnamesRequest $request
     *
     * @return ListSgAuthruleappnamesResponse
     */
    public function listSgAuthruleappnames($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgAuthruleappnamesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
     * Summary: 查找出所有包含鉴权规则组的应用名.
     *
     * @param ListSgAuthruleappnamesRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListSgAuthruleappnamesResponse
     */
    public function listSgAuthruleappnamesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgAuthruleappnamesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authruleappnames.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查找出目前存活的应用名称列表
     * Summary: 查找出目前存活的应用名称列表.
     *
     * @param ListSgAuthruleactiveappnamesRequest $request
     *
     * @return ListSgAuthruleactiveappnamesResponse
     */
    public function listSgAuthruleactiveappnames($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgAuthruleactiveappnamesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查找出目前存活的应用名称列表
     * Summary: 查找出目前存活的应用名称列表.
     *
     * @param ListSgAuthruleactiveappnamesRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return ListSgAuthruleactiveappnamesResponse
     */
    public function listSgAuthruleactiveappnamesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgAuthruleactiveappnamesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authruleactiveappnames.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查找该应用下存活的服务列表
     * Summary: 查找该应用下存活的服务列表.
     *
     * @param ListSgAuthruleactivedataidsRequest $request
     *
     * @return ListSgAuthruleactivedataidsResponse
     */
    public function listSgAuthruleactivedataids($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgAuthruleactivedataidsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查找该应用下存活的服务列表
     * Summary: 查找该应用下存活的服务列表.
     *
     * @param ListSgAuthruleactivedataidsRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ListSgAuthruleactivedataidsResponse
     */
    public function listSgAuthruleactivedataidsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgAuthruleactivedataidsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authruleactivedataids.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用级服务鉴权列表搜索
     * Summary: 应用级服务鉴权列表搜索.
     *
     * @param ListSgAuthrulegroupappsRequest $request
     *
     * @return ListSgAuthrulegroupappsResponse
     */
    public function listSgAuthrulegroupapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgAuthrulegroupappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用级服务鉴权列表搜索
     * Summary: 应用级服务鉴权列表搜索.
     *
     * @param ListSgAuthrulegroupappsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListSgAuthrulegroupappsResponse
     */
    public function listSgAuthrulegroupappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgAuthrulegroupappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroupapps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 服务级服务鉴权列表搜索
     * Summary: 服务级服务鉴权列表搜索.
     *
     * @param ListSgAuthrulegroupservicesRequest $request
     *
     * @return ListSgAuthrulegroupservicesResponse
     */
    public function listSgAuthrulegroupservices($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgAuthrulegroupservicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 服务级服务鉴权列表搜索
     * Summary: 服务级服务鉴权列表搜索.
     *
     * @param ListSgAuthrulegroupservicesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ListSgAuthrulegroupservicesResponse
     */
    public function listSgAuthrulegroupservicesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgAuthrulegroupservicesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroupservices.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
     * Summary: 添加鉴权规则.
     *
     * @param AddSgAuthrulegroupsbatchRequest $request
     *
     * @return AddSgAuthrulegroupsbatchResponse
     */
    public function addSgAuthrulegroupsbatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgAuthrulegroupsbatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
     * Summary: 添加鉴权规则.
     *
     * @param AddSgAuthrulegroupsbatchRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AddSgAuthrulegroupsbatchResponse
     */
    public function addSgAuthrulegroupsbatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgAuthrulegroupsbatchResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroupsbatch.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量开启鉴权规则
     * Summary: 批量开启鉴权规则.
     *
     * @param EnableSgAuthrulegroupsbatchRequest $request
     *
     * @return EnableSgAuthrulegroupsbatchResponse
     */
    public function enableSgAuthrulegroupsbatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSgAuthrulegroupsbatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量开启鉴权规则
     * Summary: 批量开启鉴权规则.
     *
     * @param EnableSgAuthrulegroupsbatchRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return EnableSgAuthrulegroupsbatchResponse
     */
    public function enableSgAuthrulegroupsbatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSgAuthrulegroupsbatchResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroupsbatch.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量关闭鉴权规则
     * Summary: 批量关闭鉴权规则.
     *
     * @param DisableSgAuthrulegroupsbatchRequest $request
     *
     * @return DisableSgAuthrulegroupsbatchResponse
     */
    public function disableSgAuthrulegroupsbatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disableSgAuthrulegroupsbatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量关闭鉴权规则
     * Summary: 批量关闭鉴权规则.
     *
     * @param DisableSgAuthrulegroupsbatchRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return DisableSgAuthrulegroupsbatchResponse
     */
    public function disableSgAuthrulegroupsbatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisableSgAuthrulegroupsbatchResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroupsbatch.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导出鉴权规则数据
     * Summary: 导出鉴权规则数据.
     *
     * @param ExportSgAuthrulegroupsRequest $request
     *
     * @return ExportSgAuthrulegroupsResponse
     */
    public function exportSgAuthrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportSgAuthrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 导出鉴权规则数据
     * Summary: 导出鉴权规则数据.
     *
     * @param ExportSgAuthrulegroupsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ExportSgAuthrulegroupsResponse
     */
    public function exportSgAuthrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportSgAuthrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroups.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导入鉴权规则数据
     * Summary: 导入鉴权规则数据.
     *
     * @param ImportSgAuthrulegroupsRequest $request
     *
     * @return ImportSgAuthrulegroupsResponse
     */
    public function importSgAuthrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importSgAuthrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 导入鉴权规则数据
     * Summary: 导入鉴权规则数据.
     *
     * @param ImportSgAuthrulegroupsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ImportSgAuthrulegroupsResponse
     */
    public function importSgAuthrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportSgAuthrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.authrulegroups.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源以文件形式导入导出
     * Summary: 资源以文件形式导入导出.
     *
     * @param ImportSgResourceRequest $request
     *
     * @return ImportSgResourceResponse
     */
    public function importSgResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importSgResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源以文件形式导入导出
     * Summary: 资源以文件形式导入导出.
     *
     * @param ImportSgResourceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ImportSgResourceResponse
     */
    public function importSgResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportSgResourceResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.resource.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源以文件形式导出
     * Summary: 资源以文件形式导出.
     *
     * @param ExportSgResourceRequest $request
     *
     * @return ExportSgResourceResponse
     */
    public function exportSgResource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportSgResourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源以文件形式导出
     * Summary: 资源以文件形式导出.
     *
     * @param ExportSgResourceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ExportSgResourceResponse
     */
    public function exportSgResourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportSgResourceResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.resource.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取不展示的UI列表
     * Summary: 前端屏蔽UI.
     *
     * @param ListUndisplayComponentsRequest $request
     *
     * @return ListUndisplayComponentsResponse
     */
    public function listUndisplayComponents($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUndisplayComponentsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取不展示的UI列表
     * Summary: 前端屏蔽UI.
     *
     * @param ListUndisplayComponentsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListUndisplayComponentsResponse
     */
    public function listUndisplayComponentsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUndisplayComponentsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.undisplay.components.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
     * Summary: 列表使用的更新服务鉴权接口.
     *
     * @param UpdateSgListauthrulesRequest $request
     *
     * @return UpdateSgListauthrulesResponse
     */
    public function updateSgListauthrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgListauthrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
     * Summary: 列表使用的更新服务鉴权接口.
     *
     * @param UpdateSgListauthrulesRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateSgListauthrulesResponse
     */
    public function updateSgListauthrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgListauthrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.listauthrules.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按照条件分页查询限流规则列表数据
     * Summary: 限流规则列表查询.
     *
     * @param ListSgServiceratelimitrulesRequest $request
     *
     * @return ListSgServiceratelimitrulesResponse
     */
    public function listSgServiceratelimitrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgServiceratelimitrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 按照条件分页查询限流规则列表数据
     * Summary: 限流规则列表查询.
     *
     * @param ListSgServiceratelimitrulesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ListSgServiceratelimitrulesResponse
     */
    public function listSgServiceratelimitrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgServiceratelimitrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.serviceratelimitrules.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询故障注入一级列表
     * Summary: 查询故障注入一级列表.
     *
     * @param ListSgFaultinjectappsRequest $request
     *
     * @return ListSgFaultinjectappsResponse
     */
    public function listSgFaultinjectapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgFaultinjectappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询故障注入一级列表
     * Summary: 查询故障注入一级列表.
     *
     * @param ListSgFaultinjectappsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListSgFaultinjectappsResponse
     */
    public function listSgFaultinjectappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgFaultinjectappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faultinjectapps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询故障注入二级列表
     * Summary: 分页查询故障注入二级列表.
     *
     * @param ListSgFaultinjectrulesRequest $request
     *
     * @return ListSgFaultinjectrulesResponse
     */
    public function listSgFaultinjectrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgFaultinjectrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询故障注入二级列表
     * Summary: 分页查询故障注入二级列表.
     *
     * @param ListSgFaultinjectrulesRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListSgFaultinjectrulesResponse
     */
    public function listSgFaultinjectrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgFaultinjectrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faultinjectrules.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已添加故障注入规则的应用
     * Summary: 查询已添加故障注入规则的应用.
     *
     * @param ListSgFaultinjectallappsRequest $request
     *
     * @return ListSgFaultinjectallappsResponse
     */
    public function listSgFaultinjectallapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgFaultinjectallappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已添加故障注入规则的应用
     * Summary: 查询已添加故障注入规则的应用.
     *
     * @param ListSgFaultinjectallappsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListSgFaultinjectallappsResponse
     */
    public function listSgFaultinjectallappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgFaultinjectallappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faultinjectallapps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已添加故障注入规则的服务
     * Summary: 查询已添加故障注入规则的服务
     *
     * @param ListSgFaultinjectallservicesRequest $request
     *
     * @return ListSgFaultinjectallservicesResponse
     */
    public function listSgFaultinjectallservices($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgFaultinjectallservicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已添加故障注入规则的服务
     * Summary: 查询已添加故障注入规则的服务
     *
     * @param ListSgFaultinjectallservicesRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return ListSgFaultinjectallservicesResponse
     */
    public function listSgFaultinjectallservicesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgFaultinjectallservicesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faultinjectallservices.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新故障注入规则
     * Summary: 更新故障注入规则.
     *
     * @param UpdateSgFaultinjectruleRequest $request
     *
     * @return UpdateSgFaultinjectruleResponse
     */
    public function updateSgFaultinjectrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgFaultinjectruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新故障注入规则
     * Summary: 更新故障注入规则.
     *
     * @param UpdateSgFaultinjectruleRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateSgFaultinjectruleResponse
     */
    public function updateSgFaultinjectruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgFaultinjectruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faultinjectrule.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增故障注入规则
     * Summary: 新增故障注入规则.
     *
     * @param AddSgFaultinjectruleRequest $request
     *
     * @return AddSgFaultinjectruleResponse
     */
    public function addSgFaultinjectrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgFaultinjectruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增故障注入规则
     * Summary: 新增故障注入规则.
     *
     * @param AddSgFaultinjectruleRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return AddSgFaultinjectruleResponse
     */
    public function addSgFaultinjectruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgFaultinjectruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faultinjectrule.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新故障注入规则状态
     * Summary: 更新故障注入规则状态
     *
     * @param UpdateSgFaultinjectrulestatusRequest $request
     *
     * @return UpdateSgFaultinjectrulestatusResponse
     */
    public function updateSgFaultinjectrulestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgFaultinjectrulestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新故障注入规则状态
     * Summary: 更新故障注入规则状态
     *
     * @param UpdateSgFaultinjectrulestatusRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UpdateSgFaultinjectrulestatusResponse
     */
    public function updateSgFaultinjectrulestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgFaultinjectrulestatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faultinjectrulestatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除故障注入规则
     * Summary: 删除故障注入规则.
     *
     * @param DeleteSgFaultinjectruleRequest $request
     *
     * @return DeleteSgFaultinjectruleResponse
     */
    public function deleteSgFaultinjectrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgFaultinjectruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除故障注入规则
     * Summary: 删除故障注入规则.
     *
     * @param DeleteSgFaultinjectruleRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteSgFaultinjectruleResponse
     */
    public function deleteSgFaultinjectruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgFaultinjectruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faultinjectrule.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表.
     *
     * @param ListSgAppsRequest $request
     *
     * @return ListSgAppsResponse
     */
    public function listSgApps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgAppsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表.
     *
     * @param ListSgAppsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListSgAppsResponse
     */
    public function listSgAppsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgAppsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.apps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询服务路由一级列表
     * Summary: 查询服务路由一级列表.
     *
     * @param ListSgRouterrulegroupappsRequest $request
     *
     * @return ListSgRouterrulegroupappsResponse
     */
    public function listSgRouterrulegroupapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgRouterrulegroupappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询服务路由一级列表
     * Summary: 查询服务路由一级列表.
     *
     * @param ListSgRouterrulegroupappsRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListSgRouterrulegroupappsResponse
     */
    public function listSgRouterrulegroupappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgRouterrulegroupappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrulegroupapps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询服务路由二级例表
     * Summary: 查询服务路由二级例表.
     *
     * @param ListSgRouterrulegroupsRequest $request
     *
     * @return ListSgRouterrulegroupsResponse
     */
    public function listSgRouterrulegroups($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgRouterrulegroupsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询服务路由二级例表
     * Summary: 查询服务路由二级例表.
     *
     * @param ListSgRouterrulegroupsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListSgRouterrulegroupsResponse
     */
    public function listSgRouterrulegroupsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgRouterrulegroupsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrulegroups.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已存在服务路由规则的应用接口
     * Summary: 查询已存在服务路由规则的应用接口.
     *
     * @param ListSgRouterruleallappsRequest $request
     *
     * @return ListSgRouterruleallappsResponse
     */
    public function listSgRouterruleallapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgRouterruleallappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已存在服务路由规则的应用接口
     * Summary: 查询已存在服务路由规则的应用接口.
     *
     * @param ListSgRouterruleallappsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListSgRouterruleallappsResponse
     */
    public function listSgRouterruleallappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgRouterruleallappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerruleallapps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已存在服务路由规则的服务接口
     * Summary: 查询已存在服务路由规则的服务接口.
     *
     * @param ListSgRouterruleallservicesRequest $request
     *
     * @return ListSgRouterruleallservicesResponse
     */
    public function listSgRouterruleallservices($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgRouterruleallservicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已存在服务路由规则的服务接口
     * Summary: 查询已存在服务路由规则的服务接口.
     *
     * @param ListSgRouterruleallservicesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ListSgRouterruleallservicesResponse
     */
    public function listSgRouterruleallservicesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgRouterruleallservicesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerruleallservices.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新路由规则组状态
     * Summary: 更新路由规则组状态
     *
     * @param UpdateSgRouterrulegroupstatusRequest $request
     *
     * @return UpdateSgRouterrulegroupstatusResponse
     */
    public function updateSgRouterrulegroupstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgRouterrulegroupstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新路由规则组状态
     * Summary: 更新路由规则组状态
     *
     * @param UpdateSgRouterrulegroupstatusRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UpdateSgRouterrulegroupstatusResponse
     */
    public function updateSgRouterrulegroupstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgRouterrulegroupstatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrulegroupstatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除路由规则组
     * Summary: 删除路由规则组.
     *
     * @param DeleteSgRouterrulegroupRequest $request
     *
     * @return DeleteSgRouterrulegroupResponse
     */
    public function deleteSgRouterrulegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgRouterrulegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除路由规则组
     * Summary: 删除路由规则组.
     *
     * @param DeleteSgRouterrulegroupRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteSgRouterrulegroupResponse
     */
    public function deleteSgRouterrulegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgRouterrulegroupResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.routerrulegroup.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 故障隔离App列表及其规则数量
     * Summary: 故障隔离App列表.
     *
     * @param ListSgFaulttoleranceappsRequest $request
     *
     * @return ListSgFaulttoleranceappsResponse
     */
    public function listSgFaulttoleranceapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgFaulttoleranceappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 故障隔离App列表及其规则数量
     * Summary: 故障隔离App列表.
     *
     * @param ListSgFaulttoleranceappsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListSgFaulttoleranceappsResponse
     */
    public function listSgFaulttoleranceappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgFaulttoleranceappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faulttoleranceapps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 故障隔离规则列表
     * Summary: 故障隔离规则列表.
     *
     * @param ListSgFaulttolerancerulesRequest $request
     *
     * @return ListSgFaulttolerancerulesResponse
     */
    public function listSgFaulttolerancerules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgFaulttolerancerulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 故障隔离规则列表
     * Summary: 故障隔离规则列表.
     *
     * @param ListSgFaulttolerancerulesRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListSgFaulttolerancerulesResponse
     */
    public function listSgFaulttolerancerulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgFaulttolerancerulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faulttolerancerules.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 故障隔离规则新增
     * Summary: 故障隔离规则新增.
     *
     * @param AddSgFaulttoleranceruleRequest $request
     *
     * @return AddSgFaulttoleranceruleResponse
     */
    public function addSgFaulttolerancerule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgFaulttoleranceruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 故障隔离规则新增
     * Summary: 故障隔离规则新增.
     *
     * @param AddSgFaulttoleranceruleRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return AddSgFaulttoleranceruleResponse
     */
    public function addSgFaulttoleranceruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgFaulttoleranceruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faulttolerancerule.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 故障隔离规则更新
     * Summary: 故障隔离规则更新.
     *
     * @param UpdateSgFaulttoleranceruleRequest $request
     *
     * @return UpdateSgFaulttoleranceruleResponse
     */
    public function updateSgFaulttolerancerule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgFaulttoleranceruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 故障隔离规则更新
     * Summary: 故障隔离规则更新.
     *
     * @param UpdateSgFaulttoleranceruleRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateSgFaulttoleranceruleResponse
     */
    public function updateSgFaulttoleranceruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgFaulttoleranceruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faulttolerancerule.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 故障隔离规则删除
     * Summary: 故障隔离规则删除.
     *
     * @param DeleteSgFaulttoleranceruleRequest $request
     *
     * @return DeleteSgFaulttoleranceruleResponse
     */
    public function deleteSgFaulttolerancerule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgFaulttoleranceruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 故障隔离规则删除
     * Summary: 故障隔离规则删除.
     *
     * @param DeleteSgFaulttoleranceruleRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DeleteSgFaulttoleranceruleResponse
     */
    public function deleteSgFaulttoleranceruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgFaulttoleranceruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faulttolerancerule.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 故障隔离规则启用
     * Summary: 故障隔离规则启用.
     *
     * @param EnableSgFaulttoleranceruleRequest $request
     *
     * @return EnableSgFaulttoleranceruleResponse
     */
    public function enableSgFaulttolerancerule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSgFaulttoleranceruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 故障隔离规则启用
     * Summary: 故障隔离规则启用.
     *
     * @param EnableSgFaulttoleranceruleRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return EnableSgFaulttoleranceruleResponse
     */
    public function enableSgFaulttoleranceruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSgFaulttoleranceruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.faulttolerancerule.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询审计日志
     * Summary: 分页查询审计日志.
     *
     * @param ListSgAuditlogsRequest $request
     *
     * @return ListSgAuditlogsResponse
     */
    public function listSgAuditlogs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgAuditlogsEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询审计日志
     * Summary: 分页查询审计日志.
     *
     * @param ListSgAuditlogsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListSgAuditlogsResponse
     */
    public function listSgAuditlogsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgAuditlogsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.auditlogs.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询集群列表
     * Summary: 查询集群列表.
     *
     * @param ListSgMeshclusterRequest $request
     *
     * @return ListSgMeshclusterResponse
     */
    public function listSgMeshcluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgMeshclusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询集群列表
     * Summary: 查询集群列表.
     *
     * @param ListSgMeshclusterRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListSgMeshclusterResponse
     */
    public function listSgMeshclusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgMeshclusterResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.meshcluster.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增集群
     * Summary: 新增集群.
     *
     * @param AddSgMeshclusterRequest $request
     *
     * @return AddSgMeshclusterResponse
     */
    public function addSgMeshcluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgMeshclusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增集群
     * Summary: 新增集群.
     *
     * @param AddSgMeshclusterRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddSgMeshclusterResponse
     */
    public function addSgMeshclusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgMeshclusterResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.meshcluster.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新集群状态
     * Summary: 更新集群状态
     *
     * @param UpdateSgMeshclusterstatusRequest $request
     *
     * @return UpdateSgMeshclusterstatusResponse
     */
    public function updateSgMeshclusterstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgMeshclusterstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新集群状态
     * Summary: 更新集群状态
     *
     * @param UpdateSgMeshclusterstatusRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateSgMeshclusterstatusResponse
     */
    public function updateSgMeshclusterstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgMeshclusterstatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.meshclusterstatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除集群
     * Summary: 删除集群.
     *
     * @param DeleteSgMeshclusterRequest $request
     *
     * @return DeleteSgMeshclusterResponse
     */
    public function deleteSgMeshcluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgMeshclusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除集群
     * Summary: 删除集群.
     *
     * @param DeleteSgMeshclusterRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteSgMeshclusterResponse
     */
    public function deleteSgMeshclusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgMeshclusterResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.meshcluster.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询sideCar注入配置列表
     * Summary: 查询sideCar注入配置列表.
     *
     * @param ListSgSidecarinjectRequest $request
     *
     * @return ListSgSidecarinjectResponse
     */
    public function listSgSidecarinject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgSidecarinjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询sideCar注入配置列表
     * Summary: 查询sideCar注入配置列表.
     *
     * @param ListSgSidecarinjectRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListSgSidecarinjectResponse
     */
    public function listSgSidecarinjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgSidecarinjectResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.sidecarinject.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增sideCar注入配置
     * Summary: 新增sideCar注入配置.
     *
     * @param AddSgSidecarinjectRequest $request
     *
     * @return AddSgSidecarinjectResponse
     */
    public function addSgSidecarinject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgSidecarinjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增sideCar注入配置
     * Summary: 新增sideCar注入配置.
     *
     * @param AddSgSidecarinjectRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AddSgSidecarinjectResponse
     */
    public function addSgSidecarinjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgSidecarinjectResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.sidecarinject.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新sidecar注入配置
     * Summary: 更新sidecar注入配置.
     *
     * @param UpdateSgSidecarinjectRequest $request
     *
     * @return UpdateSgSidecarinjectResponse
     */
    public function updateSgSidecarinject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgSidecarinjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新sidecar注入配置
     * Summary: 更新sidecar注入配置.
     *
     * @param UpdateSgSidecarinjectRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateSgSidecarinjectResponse
     */
    public function updateSgSidecarinjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgSidecarinjectResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.sidecarinject.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除sideCar注入配置
     * Summary: 删除sideCar注入配置.
     *
     * @param DeleteSgSidecarinjectRequest $request
     *
     * @return DeleteSgSidecarinjectResponse
     */
    public function deleteSgSidecarinject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgSidecarinjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除sideCar注入配置
     * Summary: 删除sideCar注入配置.
     *
     * @param DeleteSgSidecarinjectRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteSgSidecarinjectResponse
     */
    public function deleteSgSidecarinjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgSidecarinjectResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.sidecarinject.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开通/关闭sideCar注入配置
     * Summary: 开通/关闭sideCar注入配置.
     *
     * @param UpdateSgSidecarinjectstatusRequest $request
     *
     * @return UpdateSgSidecarinjectstatusResponse
     */
    public function updateSgSidecarinjectstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgSidecarinjectstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 开通/关闭sideCar注入配置
     * Summary: 开通/关闭sideCar注入配置.
     *
     * @param UpdateSgSidecarinjectstatusRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateSgSidecarinjectstatusResponse
     */
    public function updateSgSidecarinjectstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgSidecarinjectstatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.sidecarinjectstatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流量镜像分页查询一级列表
     * Summary: 流量镜像分页查询一级列表.
     *
     * @param ListSgTrafficmirrorappsRequest $request
     *
     * @return ListSgTrafficmirrorappsResponse
     */
    public function listSgTrafficmirrorapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgTrafficmirrorappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 流量镜像分页查询一级列表
     * Summary: 流量镜像分页查询一级列表.
     *
     * @param ListSgTrafficmirrorappsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListSgTrafficmirrorappsResponse
     */
    public function listSgTrafficmirrorappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgTrafficmirrorappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.trafficmirrorapps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 流量镜像分页查询二级列表
     * Summary: 流量镜像分页查询二级列表.
     *
     * @param ListSgTrafficmirrorrulesRequest $request
     *
     * @return ListSgTrafficmirrorrulesResponse
     */
    public function listSgTrafficmirrorrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgTrafficmirrorrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 流量镜像分页查询二级列表
     * Summary: 流量镜像分页查询二级列表.
     *
     * @param ListSgTrafficmirrorrulesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListSgTrafficmirrorrulesResponse
     */
    public function listSgTrafficmirrorrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgTrafficmirrorrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.trafficmirrorrules.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已添加规则的应用
     * Summary: 查询已添加规则的应用.
     *
     * @param ListSgTrafficmirrorallappsRequest $request
     *
     * @return ListSgTrafficmirrorallappsResponse
     */
    public function listSgTrafficmirrorallapps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgTrafficmirrorallappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已添加规则的应用
     * Summary: 查询已添加规则的应用.
     *
     * @param ListSgTrafficmirrorallappsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ListSgTrafficmirrorallappsResponse
     */
    public function listSgTrafficmirrorallappsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgTrafficmirrorallappsResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.trafficmirrorallapps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已添加规则的服务
     * Summary: 查询已添加规则的服务
     *
     * @param ListSgTrafficmirrorservicesRequest $request
     *
     * @return ListSgTrafficmirrorservicesResponse
     */
    public function listSgTrafficmirrorservices($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSgTrafficmirrorservicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已添加规则的服务
     * Summary: 查询已添加规则的服务
     *
     * @param ListSgTrafficmirrorservicesRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ListSgTrafficmirrorservicesResponse
     */
    public function listSgTrafficmirrorservicesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSgTrafficmirrorservicesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.trafficmirrorservices.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增流量镜像规则
     * Summary: 新增流量镜像规则.
     *
     * @param AddSgTrafficmirrorruleRequest $request
     *
     * @return AddSgTrafficmirrorruleResponse
     */
    public function addSgTrafficmirrorrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSgTrafficmirrorruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增流量镜像规则
     * Summary: 新增流量镜像规则.
     *
     * @param AddSgTrafficmirrorruleRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return AddSgTrafficmirrorruleResponse
     */
    public function addSgTrafficmirrorruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSgTrafficmirrorruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.trafficmirrorrule.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新流量镜像规则状态
     * Summary: 更新流量镜像规则状态
     *
     * @param UpdateSgTrafficmirrorrulestatusRequest $request
     *
     * @return UpdateSgTrafficmirrorrulestatusResponse
     */
    public function updateSgTrafficmirrorrulestatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgTrafficmirrorrulestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新流量镜像规则状态
     * Summary: 更新流量镜像规则状态
     *
     * @param UpdateSgTrafficmirrorrulestatusRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return UpdateSgTrafficmirrorrulestatusResponse
     */
    public function updateSgTrafficmirrorrulestatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgTrafficmirrorrulestatusResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.trafficmirrorrulestatus.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除流量镜像规则
     * Summary: 删除流量镜像规则.
     *
     * @param DeleteSgTrafficmirrorruleRequest $request
     *
     * @return DeleteSgTrafficmirrorruleResponse
     */
    public function deleteSgTrafficmirrorrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSgTrafficmirrorruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除流量镜像规则
     * Summary: 删除流量镜像规则.
     *
     * @param DeleteSgTrafficmirrorruleRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DeleteSgTrafficmirrorruleResponse
     */
    public function deleteSgTrafficmirrorruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSgTrafficmirrorruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.trafficmirrorrule.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新流量镜像规则
     * Summary: 更新流量镜像规则.
     *
     * @param UpdateSgTrafficmirrorruleRequest $request
     *
     * @return UpdateSgTrafficmirrorruleResponse
     */
    public function updateSgTrafficmirrorrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSgTrafficmirrorruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新流量镜像规则
     * Summary: 更新流量镜像规则.
     *
     * @param UpdateSgTrafficmirrorruleRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateSgTrafficmirrorruleResponse
     */
    public function updateSgTrafficmirrorruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSgTrafficmirrorruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.sg.trafficmirrorrule.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询通信安全规则列表接口
     * Summary: 查询列表接口.
     *
     * @param ListSafeCommunicationrulesRequest $request
     *
     * @return ListSafeCommunicationrulesResponse
     */
    public function listSafeCommunicationrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSafeCommunicationrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询通信安全规则列表接口
     * Summary: 查询列表接口.
     *
     * @param ListSafeCommunicationrulesRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ListSafeCommunicationrulesResponse
     */
    public function listSafeCommunicationrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSafeCommunicationrulesResponse::fromMap($this->doRequest('2.0', 'sofa.ms.safe.communicationrules.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取rule规则详情
     * Summary: 获取规则详情.
     *
     * @param GetSafeCommunicationruleRequest $request
     *
     * @return GetSafeCommunicationruleResponse
     */
    public function getSafeCommunicationrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSafeCommunicationruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取rule规则详情
     * Summary: 获取规则详情.
     *
     * @param GetSafeCommunicationruleRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetSafeCommunicationruleResponse
     */
    public function getSafeCommunicationruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSafeCommunicationruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.safe.communicationrule.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增通信规则接口
     * Summary: 新增通信规则接口.
     *
     * @param AddSafeCommunicationruleRequest $request
     *
     * @return AddSafeCommunicationruleResponse
     */
    public function addSafeCommunicationrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSafeCommunicationruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增通信规则接口
     * Summary: 新增通信规则接口.
     *
     * @param AddSafeCommunicationruleRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AddSafeCommunicationruleResponse
     */
    public function addSafeCommunicationruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSafeCommunicationruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.safe.communicationrule.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改通信安全规则
     * Summary: 修改通信安全规则.
     *
     * @param UpdateSafeCommunicationruleRequest $request
     *
     * @return UpdateSafeCommunicationruleResponse
     */
    public function updateSafeCommunicationrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSafeCommunicationruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改通信安全规则
     * Summary: 修改通信安全规则.
     *
     * @param UpdateSafeCommunicationruleRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateSafeCommunicationruleResponse
     */
    public function updateSafeCommunicationruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSafeCommunicationruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.safe.communicationrule.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除通信规则接口
     * Summary: 删除通信规则接口.
     *
     * @param DeleteSafeCommunicationruleRequest $request
     *
     * @return DeleteSafeCommunicationruleResponse
     */
    public function deleteSafeCommunicationrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSafeCommunicationruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除通信规则接口
     * Summary: 删除通信规则接口.
     *
     * @param DeleteSafeCommunicationruleRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DeleteSafeCommunicationruleResponse
     */
    public function deleteSafeCommunicationruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSafeCommunicationruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.safe.communicationrule.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改通信规则生效状态
     * Summary: 修改通信规则状态
     *
     * @param EnableSafeCommunicationruleRequest $request
     *
     * @return EnableSafeCommunicationruleResponse
     */
    public function enableSafeCommunicationrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableSafeCommunicationruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改通信规则生效状态
     * Summary: 修改通信规则状态
     *
     * @param EnableSafeCommunicationruleRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return EnableSafeCommunicationruleResponse
     */
    public function enableSafeCommunicationruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableSafeCommunicationruleResponse::fromMap($this->doRequest('2.0', 'sofa.ms.safe.communicationrule.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
