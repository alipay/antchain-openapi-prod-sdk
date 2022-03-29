<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\RMS\Models\AllTraasmetaAppgroupRequest;
use AntChain\RMS\Models\AllTraasmetaAppgroupResponse;
use AntChain\RMS\Models\AllTraasmetaAppRequest;
use AntChain\RMS\Models\AllTraasmetaAppResponse;
use AntChain\RMS\Models\AllTraasmetaAppserverRequest;
use AntChain\RMS\Models\AllTraasmetaAppserverResponse;
use AntChain\RMS\Models\AllTraasmetaApptagRequest;
use AntChain\RMS\Models\AllTraasmetaApptagResponse;
use AntChain\RMS\Models\AllTraasmetaCellRequest;
use AntChain\RMS\Models\AllTraasmetaCellResponse;
use AntChain\RMS\Models\AllTraasmetaHostmachineRequest;
use AntChain\RMS\Models\AllTraasmetaHostmachineResponse;
use AntChain\RMS\Models\AllTraasmetaRegionRequest;
use AntChain\RMS\Models\AllTraasmetaRegionResponse;
use AntChain\RMS\Models\AllTraasmetaTenantRequest;
use AntChain\RMS\Models\AllTraasmetaTenantResponse;
use AntChain\RMS\Models\AllTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\AllTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\AllTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\AllTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\AllTraasmetaZoneRequest;
use AntChain\RMS\Models\AllTraasmetaZoneResponse;
use AntChain\RMS\Models\AuthUserRequest;
use AntChain\RMS\Models\AuthUserResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaAppgroupRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaAppgroupResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaAppRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaAppResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaAppserverRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaAppserverResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaApptagRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaApptagResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaCellRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaCellResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaHostmachineRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaHostmachineResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaRegionRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaRegionResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaTenantRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaTenantResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\BatchcreateTraasmetaZoneRequest;
use AntChain\RMS\Models\BatchcreateTraasmetaZoneResponse;
use AntChain\RMS\Models\BatchcreateUnifiedalarmHistoryRequest;
use AntChain\RMS\Models\BatchcreateUnifiedalarmHistoryResponse;
use AntChain\RMS\Models\BatchcreateUnifiedalarmRuleRequest;
use AntChain\RMS\Models\BatchcreateUnifiedalarmRuleResponse;
use AntChain\RMS\Models\BatchcreateUnifiedalarmSubRequest;
use AntChain\RMS\Models\BatchcreateUnifiedalarmSubResponse;
use AntChain\RMS\Models\BatchcreateUserFavoriteRequest;
use AntChain\RMS\Models\BatchcreateUserFavoriteResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaAppgroupRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaAppgroupResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaAppRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaAppResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaAppserverRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaAppserverResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaApptagRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaApptagResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaCellRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaCellResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaHostmachineRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaHostmachineResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaRegionRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaRegionResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaTenantRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaTenantResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\BatchdeleteTraasmetaZoneRequest;
use AntChain\RMS\Models\BatchdeleteTraasmetaZoneResponse;
use AntChain\RMS\Models\BatchdeleteUnifiedalarmRuleRequest;
use AntChain\RMS\Models\BatchdeleteUnifiedalarmRuleResponse;
use AntChain\RMS\Models\BatchdeleteUserFavoriteRequest;
use AntChain\RMS\Models\BatchdeleteUserFavoriteResponse;
use AntChain\RMS\Models\BatchqueryStackGeneratedconfigRequest;
use AntChain\RMS\Models\BatchqueryStackGeneratedconfigResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaAppgroupRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaAppgroupResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaAppRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaAppResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaAppserverRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaAppserverResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaApptagRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaApptagResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaCellRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaCellResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaHostmachineRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaHostmachineResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaRegionRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaRegionResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaTenantRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaTenantResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\BatchqueryTraasmetaZoneRequest;
use AntChain\RMS\Models\BatchqueryTraasmetaZoneResponse;
use AntChain\RMS\Models\CallbackSpiCompletecommodityRequest;
use AntChain\RMS\Models\CallbackSpiCompletecommodityResponse;
use AntChain\RMS\Models\CallbackSpiCompleteorderparamRequest;
use AntChain\RMS\Models\CallbackSpiCompleteorderparamResponse;
use AntChain\RMS\Models\CallbackSpiLifecycleRequest;
use AntChain\RMS\Models\CallbackSpiLifecycleResponse;
use AntChain\RMS\Models\CallbackSpiPayordercallbackRequest;
use AntChain\RMS\Models\CallbackSpiPayordercallbackResponse;
use AntChain\RMS\Models\CallbackSpiRefundRequest;
use AntChain\RMS\Models\CallbackSpiRefundResponse;
use AntChain\RMS\Models\CallbackSpiVerifyRequest;
use AntChain\RMS\Models\CallbackSpiVerifyResponse;
use AntChain\RMS\Models\CloseRmsPluginRequest;
use AntChain\RMS\Models\CloseRmsPluginResponse;
use AntChain\RMS\Models\CountAlarmAppRequest;
use AntChain\RMS\Models\CountAlarmAppResponse;
use AntChain\RMS\Models\CreateAlarmDingdingrobotRequest;
use AntChain\RMS\Models\CreateAlarmDingdingrobotResponse;
use AntChain\RMS\Models\CreateAlarmSubscriptionRequest;
use AntChain\RMS\Models\CreateAlarmSubscriptionResponse;
use AntChain\RMS\Models\CreateAlarmwebhookRequest;
use AntChain\RMS\Models\CreateAlarmwebhookResponse;
use AntChain\RMS\Models\CreateAuthRequest;
use AntChain\RMS\Models\CreateAuthResponse;
use AntChain\RMS\Models\CreateCustompluginRequest;
use AntChain\RMS\Models\CreateCustompluginResponse;
use AntChain\RMS\Models\CreateFolderRequest;
use AntChain\RMS\Models\CreateFolderResponse;
use AntChain\RMS\Models\CreateRmsPluginRequest;
use AntChain\RMS\Models\CreateRmsPluginResponse;
use AntChain\RMS\Models\CreateTraasmetaAppgroupRequest;
use AntChain\RMS\Models\CreateTraasmetaAppgroupResponse;
use AntChain\RMS\Models\CreateTraasmetaAppRequest;
use AntChain\RMS\Models\CreateTraasmetaAppResponse;
use AntChain\RMS\Models\CreateTraasmetaAppserverRequest;
use AntChain\RMS\Models\CreateTraasmetaAppserverResponse;
use AntChain\RMS\Models\CreateTraasmetaApptagRequest;
use AntChain\RMS\Models\CreateTraasmetaApptagResponse;
use AntChain\RMS\Models\CreateTraasmetaCellRequest;
use AntChain\RMS\Models\CreateTraasmetaCellResponse;
use AntChain\RMS\Models\CreateTraasmetaHostmachineRequest;
use AntChain\RMS\Models\CreateTraasmetaHostmachineResponse;
use AntChain\RMS\Models\CreateTraasmetaRegionRequest;
use AntChain\RMS\Models\CreateTraasmetaRegionResponse;
use AntChain\RMS\Models\CreateTraasmetaTenantRequest;
use AntChain\RMS\Models\CreateTraasmetaTenantResponse;
use AntChain\RMS\Models\CreateTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\CreateTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\CreateTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\CreateTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\CreateTraasmetaZoneRequest;
use AntChain\RMS\Models\CreateTraasmetaZoneResponse;
use AntChain\RMS\Models\CreateUnifiedalarmRuleRequest;
use AntChain\RMS\Models\CreateUnifiedalarmRuleResponse;
use AntChain\RMS\Models\CreateUnifiedalarmTplRequest;
use AntChain\RMS\Models\CreateUnifiedalarmTplResponse;
use AntChain\RMS\Models\CreateUsergroupRequest;
use AntChain\RMS\Models\CreateUsergroupResponse;
use AntChain\RMS\Models\CreateXdashboardRequest;
use AntChain\RMS\Models\CreateXdashboardResponse;
use AntChain\RMS\Models\CreateXdatasourceRequest;
use AntChain\RMS\Models\CreateXdatasourceResponse;
use AntChain\RMS\Models\DeleteAlarmDingdingrobotRequest;
use AntChain\RMS\Models\DeleteAlarmDingdingrobotResponse;
use AntChain\RMS\Models\DeleteAlarmSubscriptionRequest;
use AntChain\RMS\Models\DeleteAlarmSubscriptionResponse;
use AntChain\RMS\Models\DeleteAlarmwebhookRequest;
use AntChain\RMS\Models\DeleteAlarmwebhookResponse;
use AntChain\RMS\Models\DeleteAuthRequest;
use AntChain\RMS\Models\DeleteAuthResponse;
use AntChain\RMS\Models\DeleteCustompluginRequest;
use AntChain\RMS\Models\DeleteCustompluginResponse;
use AntChain\RMS\Models\DeleteFolderRequest;
use AntChain\RMS\Models\DeleteFolderResponse;
use AntChain\RMS\Models\DeleteRmsPluginRequest;
use AntChain\RMS\Models\DeleteRmsPluginResponse;
use AntChain\RMS\Models\DeleteSetupConfigRequest;
use AntChain\RMS\Models\DeleteSetupConfigResponse;
use AntChain\RMS\Models\DeleteTenantconfigRequest;
use AntChain\RMS\Models\DeleteTenantconfigResponse;
use AntChain\RMS\Models\DeleteTraasmetaAppgroupRequest;
use AntChain\RMS\Models\DeleteTraasmetaAppgroupResponse;
use AntChain\RMS\Models\DeleteTraasmetaAppRequest;
use AntChain\RMS\Models\DeleteTraasmetaAppResponse;
use AntChain\RMS\Models\DeleteTraasmetaAppserverRequest;
use AntChain\RMS\Models\DeleteTraasmetaAppserverResponse;
use AntChain\RMS\Models\DeleteTraasmetaApptagRequest;
use AntChain\RMS\Models\DeleteTraasmetaApptagResponse;
use AntChain\RMS\Models\DeleteTraasmetaCellRequest;
use AntChain\RMS\Models\DeleteTraasmetaCellResponse;
use AntChain\RMS\Models\DeleteTraasmetaHostmachineRequest;
use AntChain\RMS\Models\DeleteTraasmetaHostmachineResponse;
use AntChain\RMS\Models\DeleteTraasmetaRegionRequest;
use AntChain\RMS\Models\DeleteTraasmetaRegionResponse;
use AntChain\RMS\Models\DeleteTraasmetaTenantRequest;
use AntChain\RMS\Models\DeleteTraasmetaTenantResponse;
use AntChain\RMS\Models\DeleteTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\DeleteTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\DeleteTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\DeleteTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\DeleteTraasmetaZoneRequest;
use AntChain\RMS\Models\DeleteTraasmetaZoneResponse;
use AntChain\RMS\Models\DeleteUnifiedalarmRuleRequest;
use AntChain\RMS\Models\DeleteUnifiedalarmRuleResponse;
use AntChain\RMS\Models\DeleteUnifiedalarmSubRequest;
use AntChain\RMS\Models\DeleteUnifiedalarmSubResponse;
use AntChain\RMS\Models\DeleteUnifiedalarmTplRequest;
use AntChain\RMS\Models\DeleteUnifiedalarmTplResponse;
use AntChain\RMS\Models\DeleteUsergroupRequest;
use AntChain\RMS\Models\DeleteUsergroupResponse;
use AntChain\RMS\Models\DeleteXdashboardRequest;
use AntChain\RMS\Models\DeleteXdashboardResponse;
use AntChain\RMS\Models\DeleteXdatasourceRequest;
use AntChain\RMS\Models\DeleteXdatasourceResponse;
use AntChain\RMS\Models\DescribeRmsTimeseriesmetricsRequest;
use AntChain\RMS\Models\DescribeRmsTimeseriesmetricsResponse;
use AntChain\RMS\Models\DescribeRmsTopologyRequest;
use AntChain\RMS\Models\DescribeRmsTopologyResponse;
use AntChain\RMS\Models\DescribeRmsTracetreeRequest;
use AntChain\RMS\Models\DescribeRmsTracetreeResponse;
use AntChain\RMS\Models\DetailUserRequest;
use AntChain\RMS\Models\DetailUserResponse;
use AntChain\RMS\Models\EnableAgentVersionRequest;
use AntChain\RMS\Models\EnableAgentVersionResponse;
use AntChain\RMS\Models\ExecRmsUniversalcleankeyRequest;
use AntChain\RMS\Models\ExecRmsUniversalcleankeyResponse;
use AntChain\RMS\Models\ExecXdatasourceMoveRequest;
use AntChain\RMS\Models\ExecXdatasourceMoveResponse;
use AntChain\RMS\Models\ExportXsiteConfigRequest;
use AntChain\RMS\Models\ExportXsiteConfigResponse;
use AntChain\RMS\Models\GetAgentVersionRequest;
use AntChain\RMS\Models\GetAgentVersionResponse;
use AntChain\RMS\Models\GetAgentVersionstrategyRequest;
use AntChain\RMS\Models\GetAgentVersionstrategyResponse;
use AntChain\RMS\Models\GetAlarmOverviewRequest;
use AntChain\RMS\Models\GetAlarmOverviewResponse;
use AntChain\RMS\Models\GetAlarmTestRequest;
use AntChain\RMS\Models\GetAlarmTestResponse;
use AntChain\RMS\Models\GetAliyunStatusRequest;
use AntChain\RMS\Models\GetAliyunStatusResponse;
use AntChain\RMS\Models\GetAppOverviewRequest;
use AntChain\RMS\Models\GetAppOverviewResponse;
use AntChain\RMS\Models\GetAppSettingRequest;
use AntChain\RMS\Models\GetAppSettingResponse;
use AntChain\RMS\Models\GetConfigOverviewRequest;
use AntChain\RMS\Models\GetConfigOverviewResponse;
use AntChain\RMS\Models\GetCustompluginRequest;
use AntChain\RMS\Models\GetCustompluginResponse;
use AntChain\RMS\Models\GetLogBrowserRequest;
use AntChain\RMS\Models\GetLogBrowserResponse;
use AntChain\RMS\Models\GetLogserviceDesensconfigRequest;
use AntChain\RMS\Models\GetLogserviceDesensconfigResponse;
use AntChain\RMS\Models\GetLogTailRequest;
use AntChain\RMS\Models\GetLogTailResponse;
use AntChain\RMS\Models\GetMeasurementStatusRequest;
use AntChain\RMS\Models\GetMeasurementStatusResponse;
use AntChain\RMS\Models\GetNodeOverviewRequest;
use AntChain\RMS\Models\GetNodeOverviewResponse;
use AntChain\RMS\Models\GetRmsTracespanqueryconfigRequest;
use AntChain\RMS\Models\GetRmsTracespanqueryconfigResponse;
use AntChain\RMS\Models\GetSetupModelRequest;
use AntChain\RMS\Models\GetSetupModelResponse;
use AntChain\RMS\Models\GetSystemTimeRequest;
use AntChain\RMS\Models\GetSystemTimeResponse;
use AntChain\RMS\Models\GetTenantRequest;
use AntChain\RMS\Models\GetTenantResponse;
use AntChain\RMS\Models\GetTraasmetaAppgroupRequest;
use AntChain\RMS\Models\GetTraasmetaAppgroupResponse;
use AntChain\RMS\Models\GetTraasmetaAppRequest;
use AntChain\RMS\Models\GetTraasmetaAppResponse;
use AntChain\RMS\Models\GetTraasmetaAppserverRequest;
use AntChain\RMS\Models\GetTraasmetaAppserverResponse;
use AntChain\RMS\Models\GetTraasmetaApptagRequest;
use AntChain\RMS\Models\GetTraasmetaApptagResponse;
use AntChain\RMS\Models\GetTraasmetaCellRequest;
use AntChain\RMS\Models\GetTraasmetaCellResponse;
use AntChain\RMS\Models\GetTraasmetaHostmachineRequest;
use AntChain\RMS\Models\GetTraasmetaHostmachineResponse;
use AntChain\RMS\Models\GetTraasmetaRegionRequest;
use AntChain\RMS\Models\GetTraasmetaRegionResponse;
use AntChain\RMS\Models\GetTraasmetaTenantRequest;
use AntChain\RMS\Models\GetTraasmetaTenantResponse;
use AntChain\RMS\Models\GetTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\GetTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\GetTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\GetTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\GetTraasmetaZoneRequest;
use AntChain\RMS\Models\GetTraasmetaZoneResponse;
use AntChain\RMS\Models\GetTraceWorkspacesettingRequest;
use AntChain\RMS\Models\GetTraceWorkspacesettingResponse;
use AntChain\RMS\Models\GetUnifiedalarmRuleRequest;
use AntChain\RMS\Models\GetUnifiedalarmRuleResponse;
use AntChain\RMS\Models\GetUnifiedalarmTplRequest;
use AntChain\RMS\Models\GetUnifiedalarmTplResponse;
use AntChain\RMS\Models\GetUserFavoriteRequest;
use AntChain\RMS\Models\GetUserFavoriteResponse;
use AntChain\RMS\Models\GetWorkspaceConfigRequest;
use AntChain\RMS\Models\GetWorkspaceConfigResponse;
use AntChain\RMS\Models\GetWorkspaceRequest;
use AntChain\RMS\Models\GetWorkspaceResponse;
use AntChain\RMS\Models\GetWorkspaceSettingRequest;
use AntChain\RMS\Models\GetWorkspaceSettingResponse;
use AntChain\RMS\Models\GetXdashboardRequest;
use AntChain\RMS\Models\GetXdashboardResponse;
use AntChain\RMS\Models\GetXdatasourceRequest;
use AntChain\RMS\Models\GetXdatasourceResponse;
use AntChain\RMS\Models\ImportXsiteConfigRequest;
use AntChain\RMS\Models\ImportXsiteConfigResponse;
use AntChain\RMS\Models\InstallAgentRequest;
use AntChain\RMS\Models\InstallAgentResponse;
use AntChain\RMS\Models\ListAlarmSubscriptionRequest;
use AntChain\RMS\Models\ListAlarmSubscriptionResponse;
use AntChain\RMS\Models\ListAppNameRequest;
use AntChain\RMS\Models\ListAppNameResponse;
use AntChain\RMS\Models\ListAppSettingRequest;
use AntChain\RMS\Models\ListAppSettingResponse;
use AntChain\RMS\Models\ListAuthRequest;
use AntChain\RMS\Models\ListAuthResponse;
use AntChain\RMS\Models\ListCustompluginRequest;
use AntChain\RMS\Models\ListCustompluginResponse;
use AntChain\RMS\Models\ListDashboardRequest;
use AntChain\RMS\Models\ListDashboardResponse;
use AntChain\RMS\Models\ListLogserviceDesenstypesRequest;
use AntChain\RMS\Models\ListLogserviceDesenstypesResponse;
use AntChain\RMS\Models\ListOneconsoleWorkspaceRequest;
use AntChain\RMS\Models\ListOneconsoleWorkspaceResponse;
use AntChain\RMS\Models\ListTraasmetaEntityfieldRequest;
use AntChain\RMS\Models\ListTraasmetaEntityfieldResponse;
use AntChain\RMS\Models\ListTraceWorkspacesettingRequest;
use AntChain\RMS\Models\ListTraceWorkspacesettingResponse;
use AntChain\RMS\Models\ListXdashboardDirectoryRequest;
use AntChain\RMS\Models\ListXdashboardDirectoryResponse;
use AntChain\RMS\Models\ListXdatasourceDirectoryRequest;
use AntChain\RMS\Models\ListXdatasourceDirectoryResponse;
use AntChain\RMS\Models\OpenRmsPluginRequest;
use AntChain\RMS\Models\OpenRmsPluginResponse;
use AntChain\RMS\Models\OpenWorkspaceRequest;
use AntChain\RMS\Models\OpenWorkspaceResponse;
use AntChain\RMS\Models\PagequeryTraasmetaAppgroupRequest;
use AntChain\RMS\Models\PagequeryTraasmetaAppgroupResponse;
use AntChain\RMS\Models\PagequeryTraasmetaAppRequest;
use AntChain\RMS\Models\PagequeryTraasmetaAppResponse;
use AntChain\RMS\Models\PagequeryTraasmetaAppserverRequest;
use AntChain\RMS\Models\PagequeryTraasmetaAppserverResponse;
use AntChain\RMS\Models\PagequeryTraasmetaApptagRequest;
use AntChain\RMS\Models\PagequeryTraasmetaApptagResponse;
use AntChain\RMS\Models\PagequeryTraasmetaCellRequest;
use AntChain\RMS\Models\PagequeryTraasmetaCellResponse;
use AntChain\RMS\Models\PagequeryTraasmetaHostmachineRequest;
use AntChain\RMS\Models\PagequeryTraasmetaHostmachineResponse;
use AntChain\RMS\Models\PagequeryTraasmetaRegionRequest;
use AntChain\RMS\Models\PagequeryTraasmetaRegionResponse;
use AntChain\RMS\Models\PagequeryTraasmetaTenantRequest;
use AntChain\RMS\Models\PagequeryTraasmetaTenantResponse;
use AntChain\RMS\Models\PagequeryTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\PagequeryTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\PagequeryTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\PagequeryTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\PagequeryTraasmetaZoneRequest;
use AntChain\RMS\Models\PagequeryTraasmetaZoneResponse;
use AntChain\RMS\Models\PauseAlarmRequest;
use AntChain\RMS\Models\PauseAlarmResponse;
use AntChain\RMS\Models\QueryAgentRequest;
use AntChain\RMS\Models\QueryAgentResponse;
use AntChain\RMS\Models\QueryAlarmApprelationRequest;
use AntChain\RMS\Models\QueryAlarmApprelationResponse;
use AntChain\RMS\Models\QueryAlarmDingdingrobotRequest;
use AntChain\RMS\Models\QueryAlarmDingdingrobotResponse;
use AntChain\RMS\Models\QueryAlarmhistoryAlarmtrendsRequest;
use AntChain\RMS\Models\QueryAlarmhistoryAlarmtrendsResponse;
use AntChain\RMS\Models\QueryAlarmHistoryRequest;
use AntChain\RMS\Models\QueryAlarmHistoryResponse;
use AntChain\RMS\Models\QueryAlarmPauseRequest;
use AntChain\RMS\Models\QueryAlarmPauseResponse;
use AntChain\RMS\Models\QueryAlarmSubscriptionRequest;
use AntChain\RMS\Models\QueryAlarmSubscriptionResponse;
use AntChain\RMS\Models\QueryAlarmTrendRequest;
use AntChain\RMS\Models\QueryAlarmTrendResponse;
use AntChain\RMS\Models\QueryAlarmwebhookRequest;
use AntChain\RMS\Models\QueryAlarmwebhookResponse;
use AntChain\RMS\Models\QueryAppAlarmrulesRequest;
use AntChain\RMS\Models\QueryAppAlarmrulesResponse;
use AntChain\RMS\Models\QueryAppAlarmstatsRequest;
use AntChain\RMS\Models\QueryAppAlarmstatsResponse;
use AntChain\RMS\Models\QueryAppRequest;
use AntChain\RMS\Models\QueryAppResponse;
use AntChain\RMS\Models\QueryAppsAlarmrulecountRequest;
use AntChain\RMS\Models\QueryAppsAlarmrulecountResponse;
use AntChain\RMS\Models\QueryAppsUnifiedalarmstatsRequest;
use AntChain\RMS\Models\QueryAppsUnifiedalarmstatsResponse;
use AntChain\RMS\Models\QueryCustompluginRequest;
use AntChain\RMS\Models\QueryCustompluginResponse;
use AntChain\RMS\Models\QueryFolderPathRequest;
use AntChain\RMS\Models\QueryFolderPathResponse;
use AntChain\RMS\Models\QueryFolderRequest;
use AntChain\RMS\Models\QueryFolderResponse;
use AntChain\RMS\Models\QueryKernelstackGeneratedconfigRequest;
use AntChain\RMS\Models\QueryKernelstackGeneratedconfigResponse;
use AntChain\RMS\Models\QueryLogpathMetricsRequest;
use AntChain\RMS\Models\QueryLogpathMetricsResponse;
use AntChain\RMS\Models\QueryLogserviceAppsRequest;
use AntChain\RMS\Models\QueryLogserviceAppsResponse;
use AntChain\RMS\Models\QueryMetaNodeRequest;
use AntChain\RMS\Models\QueryMetaNodeResponse;
use AntChain\RMS\Models\QueryMetricsRequest;
use AntChain\RMS\Models\QueryMetricsResponse;
use AntChain\RMS\Models\QueryOpsAppcheckRequest;
use AntChain\RMS\Models\QueryOpsAppcheckResponse;
use AntChain\RMS\Models\QueryOpsCheckRequest;
use AntChain\RMS\Models\QueryOpsCheckResponse;
use AntChain\RMS\Models\QueryRmsAgentbrowserRequest;
use AntChain\RMS\Models\QueryRmsAgentbrowserResponse;
use AntChain\RMS\Models\QueryRmsAgentloglocateRequest;
use AntChain\RMS\Models\QueryRmsAgentloglocateResponse;
use AntChain\RMS\Models\QueryRmsAgenttailRequest;
use AntChain\RMS\Models\QueryRmsAgenttailResponse;
use AntChain\RMS\Models\QueryRmsAlarmhistoryappcountRequest;
use AntChain\RMS\Models\QueryRmsAlarmhistoryappcountResponse;
use AntChain\RMS\Models\QueryRmsAlarmhistoryappstatsRequest;
use AntChain\RMS\Models\QueryRmsAlarmhistoryappstatsResponse;
use AntChain\RMS\Models\QueryRmsAlarmhistorylevelRequest;
use AntChain\RMS\Models\QueryRmsAlarmhistorylevelResponse;
use AntChain\RMS\Models\QueryRmsAlarmhistorytypeRequest;
use AntChain\RMS\Models\QueryRmsAlarmhistorytypeResponse;
use AntChain\RMS\Models\QueryRmsAppstatspageableRequest;
use AntChain\RMS\Models\QueryRmsAppstatspageableResponse;
use AntChain\RMS\Models\QueryRmsLogreaderrorRequest;
use AntChain\RMS\Models\QueryRmsLogreaderrorResponse;
use AntChain\RMS\Models\QueryRmsNotifyhistoryRequest;
use AntChain\RMS\Models\QueryRmsNotifyhistoryResponse;
use AntChain\RMS\Models\QueryRmsPathRequest;
use AntChain\RMS\Models\QueryRmsPathResponse;
use AntChain\RMS\Models\QueryRmsPluginbyfolderRequest;
use AntChain\RMS\Models\QueryRmsPluginbyfolderResponse;
use AntChain\RMS\Models\QueryRmsPluginbytypeRequest;
use AntChain\RMS\Models\QueryRmsPluginbytypeResponse;
use AntChain\RMS\Models\QueryRmsPluginRequest;
use AntChain\RMS\Models\QueryRmsPluginResponse;
use AntChain\RMS\Models\QueryRmsPlugintestRequest;
use AntChain\RMS\Models\QueryRmsPlugintestResponse;
use AntChain\RMS\Models\QueryRmsStackentityRequest;
use AntChain\RMS\Models\QueryRmsStackentityResponse;
use AntChain\RMS\Models\QueryRmsTracespanRequest;
use AntChain\RMS\Models\QueryRmsTracespanResponse;
use AntChain\RMS\Models\QueryRmsUniversalreadRequest;
use AntChain\RMS\Models\QueryRmsUniversalreadResponse;
use AntChain\RMS\Models\QueryRmsUniversalRequest;
use AntChain\RMS\Models\QueryRmsUniversalResponse;
use AntChain\RMS\Models\QueryRmsUniversalwriteRequest;
use AntChain\RMS\Models\QueryRmsUniversalwriteResponse;
use AntChain\RMS\Models\QuerySetupConfigRequest;
use AntChain\RMS\Models\QuerySetupConfigResponse;
use AntChain\RMS\Models\QueryStackAlarmruleRequest;
use AntChain\RMS\Models\QueryStackAlarmruleResponse;
use AntChain\RMS\Models\QueryStackGeneratedconfigRequest;
use AntChain\RMS\Models\QueryStackGeneratedconfigResponse;
use AntChain\RMS\Models\QueryStackMonitoritemRequest;
use AntChain\RMS\Models\QueryStackMonitoritemResponse;
use AntChain\RMS\Models\QueryTenantconfigSpiRequest;
use AntChain\RMS\Models\QueryTenantconfigSpiResponse;
use AntChain\RMS\Models\QueryTenantconfigTokenRequest;
use AntChain\RMS\Models\QueryTenantconfigTokenResponse;
use AntChain\RMS\Models\QueryTraasmetaAppgroupRequest;
use AntChain\RMS\Models\QueryTraasmetaAppgroupResponse;
use AntChain\RMS\Models\QueryTraasmetaAppRequest;
use AntChain\RMS\Models\QueryTraasmetaAppResponse;
use AntChain\RMS\Models\QueryTraasmetaAppserverRequest;
use AntChain\RMS\Models\QueryTraasmetaAppserverResponse;
use AntChain\RMS\Models\QueryTraasmetaApptagRequest;
use AntChain\RMS\Models\QueryTraasmetaApptagResponse;
use AntChain\RMS\Models\QueryTraasmetaCellRequest;
use AntChain\RMS\Models\QueryTraasmetaCellResponse;
use AntChain\RMS\Models\QueryTraasmetaEntityRequest;
use AntChain\RMS\Models\QueryTraasmetaEntityResponse;
use AntChain\RMS\Models\QueryTraasmetaEntitytopoRequest;
use AntChain\RMS\Models\QueryTraasmetaEntitytopoResponse;
use AntChain\RMS\Models\QueryTraasmetaHostmachineRequest;
use AntChain\RMS\Models\QueryTraasmetaHostmachineResponse;
use AntChain\RMS\Models\QueryTraasmetaRegionRequest;
use AntChain\RMS\Models\QueryTraasmetaRegionResponse;
use AntChain\RMS\Models\QueryTraasmetaTenantRequest;
use AntChain\RMS\Models\QueryTraasmetaTenantResponse;
use AntChain\RMS\Models\QueryTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\QueryTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\QueryTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\QueryTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\QueryTraasmetaZoneRequest;
use AntChain\RMS\Models\QueryTraasmetaZoneResponse;
use AntChain\RMS\Models\QueryTraceAppexceptionmetricsRequest;
use AntChain\RMS\Models\QueryTraceAppexceptionmetricsResponse;
use AntChain\RMS\Models\QueryTraceAppexceptionstatRequest;
use AntChain\RMS\Models\QueryTraceAppexceptionstatResponse;
use AntChain\RMS\Models\QueryTraceApphttpclientmetricsRequest;
use AntChain\RMS\Models\QueryTraceApphttpclientmetricsResponse;
use AntChain\RMS\Models\QueryTraceApphttpclientstatRequest;
use AntChain\RMS\Models\QueryTraceApphttpclientstatResponse;
use AntChain\RMS\Models\QueryTraceApphttpservermetricsRequest;
use AntChain\RMS\Models\QueryTraceApphttpservermetricsResponse;
use AntChain\RMS\Models\QueryTraceApphttpserverstatRequest;
use AntChain\RMS\Models\QueryTraceApphttpserverstatResponse;
use AntChain\RMS\Models\QueryTraceApphttpserverstatusmetricsRequest;
use AntChain\RMS\Models\QueryTraceApphttpserverstatusmetricsResponse;
use AntChain\RMS\Models\QueryTraceAppmqconsumemetricsRequest;
use AntChain\RMS\Models\QueryTraceAppmqconsumemetricsResponse;
use AntChain\RMS\Models\QueryTraceAppmqconsumestatRequest;
use AntChain\RMS\Models\QueryTraceAppmqconsumestatResponse;
use AntChain\RMS\Models\QueryTraceAppmqproducemetricsRequest;
use AntChain\RMS\Models\QueryTraceAppmqproducemetricsResponse;
use AntChain\RMS\Models\QueryTraceAppmqproducestatRequest;
use AntChain\RMS\Models\QueryTraceAppmqproducestatResponse;
use AntChain\RMS\Models\QueryTraceAppnosqlmetricsRequest;
use AntChain\RMS\Models\QueryTraceAppnosqlmetricsResponse;
use AntChain\RMS\Models\QueryTraceAppnosqlstatRequest;
use AntChain\RMS\Models\QueryTraceAppnosqlstatResponse;
use AntChain\RMS\Models\QueryTraceApprpcclientmetricsRequest;
use AntChain\RMS\Models\QueryTraceApprpcclientmetricsResponse;
use AntChain\RMS\Models\QueryTraceApprpcclientstatRequest;
use AntChain\RMS\Models\QueryTraceApprpcclientstatResponse;
use AntChain\RMS\Models\QueryTraceApprpcservermetricsRequest;
use AntChain\RMS\Models\QueryTraceApprpcservermetricsResponse;
use AntChain\RMS\Models\QueryTraceApprpcserverstatRequest;
use AntChain\RMS\Models\QueryTraceApprpcserverstatResponse;
use AntChain\RMS\Models\QueryTraceAppsqlmetricsRequest;
use AntChain\RMS\Models\QueryTraceAppsqlmetricsResponse;
use AntChain\RMS\Models\QueryTraceAppsqlstatRequest;
use AntChain\RMS\Models\QueryTraceAppsqlstatResponse;
use AntChain\RMS\Models\QueryTraceCompactdetailRequest;
use AntChain\RMS\Models\QueryTraceCompactdetailResponse;
use AntChain\RMS\Models\QueryTraceConfigRequest;
use AntChain\RMS\Models\QueryTraceConfigResponse;
use AntChain\RMS\Models\QueryTraceDetailRequest;
use AntChain\RMS\Models\QueryTraceDetailResponse;
use AntChain\RMS\Models\QueryTraceDetailtopologyRequest;
use AntChain\RMS\Models\QueryTraceDetailtopologyResponse;
use AntChain\RMS\Models\QueryTraceMetricsRequest;
use AntChain\RMS\Models\QueryTraceMetricsResponse;
use AntChain\RMS\Models\QueryTraceSpanRequest;
use AntChain\RMS\Models\QueryTraceSpanResponse;
use AntChain\RMS\Models\QueryTraceTopologyRequest;
use AntChain\RMS\Models\QueryTraceTopologyResponse;
use AntChain\RMS\Models\QueryUnifiedalarmEventdetailRequest;
use AntChain\RMS\Models\QueryUnifiedalarmEventdetailResponse;
use AntChain\RMS\Models\QueryUnifiedalarmEventRequest;
use AntChain\RMS\Models\QueryUnifiedalarmEventResponse;
use AntChain\RMS\Models\QueryUnifiedalarmEventstatRequest;
use AntChain\RMS\Models\QueryUnifiedalarmEventstatResponse;
use AntChain\RMS\Models\QueryUnifiedalarmHistoryRequest;
use AntChain\RMS\Models\QueryUnifiedalarmHistoryResponse;
use AntChain\RMS\Models\QueryUnifiedalarmMetricsRequest;
use AntChain\RMS\Models\QueryUnifiedalarmMetricsResponse;
use AntChain\RMS\Models\QueryUnifiedalarmMonitorlistRequest;
use AntChain\RMS\Models\QueryUnifiedalarmMonitorlistResponse;
use AntChain\RMS\Models\QueryUnifiedalarmNotifyhistoryRequest;
use AntChain\RMS\Models\QueryUnifiedalarmNotifyhistoryResponse;
use AntChain\RMS\Models\QueryUnifiedalarmNotifystatRequest;
use AntChain\RMS\Models\QueryUnifiedalarmNotifystatResponse;
use AntChain\RMS\Models\QueryUnifiedalarmRulebindingRequest;
use AntChain\RMS\Models\QueryUnifiedalarmRulebindingResponse;
use AntChain\RMS\Models\QueryUnifiedalarmRuleRequest;
use AntChain\RMS\Models\QueryUnifiedalarmRuleResponse;
use AntChain\RMS\Models\QueryUnifiedalarmSubRequest;
use AntChain\RMS\Models\QueryUnifiedalarmSubResponse;
use AntChain\RMS\Models\QueryUnifiedalarmTplRequest;
use AntChain\RMS\Models\QueryUnifiedalarmTplResponse;
use AntChain\RMS\Models\QueryUserFavoriteRequest;
use AntChain\RMS\Models\QueryUserFavoriteResponse;
use AntChain\RMS\Models\QueryUsergroupRequest;
use AntChain\RMS\Models\QueryUsergroupResponse;
use AntChain\RMS\Models\QueryUserOperationRequest;
use AntChain\RMS\Models\QueryUserOperationResponse;
use AntChain\RMS\Models\QueryUserRequest;
use AntChain\RMS\Models\QueryUserResponse;
use AntChain\RMS\Models\QueryXdashboardRequest;
use AntChain\RMS\Models\QueryXdashboardResponse;
use AntChain\RMS\Models\QueryXdashboardTreeRequest;
use AntChain\RMS\Models\QueryXdashboardTreeResponse;
use AntChain\RMS\Models\QueryXdatasourcePrometheusRequest;
use AntChain\RMS\Models\QueryXdatasourcePrometheusResponse;
use AntChain\RMS\Models\QueryXdatasourceSearchRequest;
use AntChain\RMS\Models\QueryXdatasourceSearchResponse;
use AntChain\RMS\Models\QueryXdatasourceTableRequest;
use AntChain\RMS\Models\QueryXdatasourceTableResponse;
use AntChain\RMS\Models\QueryXdatasourceTreeRequest;
use AntChain\RMS\Models\QueryXdatasourceTreeResponse;
use AntChain\RMS\Models\QueryXmetadataTagRequest;
use AntChain\RMS\Models\QueryXmetadataTagResponse;
use AntChain\RMS\Models\QueryXmetricdatasourceInstantRequest;
use AntChain\RMS\Models\QueryXmetricdatasourceInstantResponse;
use AntChain\RMS\Models\QueryXmetricdatasourceRangeRequest;
use AntChain\RMS\Models\QueryXmetricdatasourceRangeResponse;
use AntChain\RMS\Models\QueryXmetricInstantRequest;
use AntChain\RMS\Models\QueryXmetricInstantResponse;
use AntChain\RMS\Models\QueryXmetricNameRequest;
use AntChain\RMS\Models\QueryXmetricNameResponse;
use AntChain\RMS\Models\QueryXmetricRangeRequest;
use AntChain\RMS\Models\QueryXmetricRangeResponse;
use AntChain\RMS\Models\QueryXmetricTableRequest;
use AntChain\RMS\Models\QueryXmetricTableResponse;
use AntChain\RMS\Models\QueryXmetrictagKeyRequest;
use AntChain\RMS\Models\QueryXmetrictagKeyResponse;
use AntChain\RMS\Models\QueryXmetrictagValueRequest;
use AntChain\RMS\Models\QueryXmetrictagValueResponse;
use AntChain\RMS\Models\ResumeAlarmRequest;
use AntChain\RMS\Models\ResumeAlarmResponse;
use AntChain\RMS\Models\SaveTenantconfigSpiRequest;
use AntChain\RMS\Models\SaveTenantconfigSpiResponse;
use AntChain\RMS\Models\SaveTenantconfigTokenRequest;
use AntChain\RMS\Models\SaveTenantconfigTokenResponse;
use AntChain\RMS\Models\SetAgentVersionstrategyRequest;
use AntChain\RMS\Models\SetAgentVersionstrategyResponse;
use AntChain\RMS\Models\SwitchOpsAlarmRequest;
use AntChain\RMS\Models\SwitchOpsAlarmResponse;
use AntChain\RMS\Models\SwitchUnifiedalarmRuleRequest;
use AntChain\RMS\Models\SwitchUnifiedalarmRuleResponse;
use AntChain\RMS\Models\UpdateAgentLabelRequest;
use AntChain\RMS\Models\UpdateAgentLabelResponse;
use AntChain\RMS\Models\UpdateAlarmDingdingrobotRequest;
use AntChain\RMS\Models\UpdateAlarmDingdingrobotResponse;
use AntChain\RMS\Models\UpdateAlarmSubscriptionRequest;
use AntChain\RMS\Models\UpdateAlarmSubscriptionResponse;
use AntChain\RMS\Models\UpdateAlarmwebhookRequest;
use AntChain\RMS\Models\UpdateAlarmwebhookResponse;
use AntChain\RMS\Models\UpdateAppSettingRequest;
use AntChain\RMS\Models\UpdateAppSettingResponse;
use AntChain\RMS\Models\UpdateCustompluginRequest;
use AntChain\RMS\Models\UpdateCustompluginResponse;
use AntChain\RMS\Models\UpdateFolderRequest;
use AntChain\RMS\Models\UpdateFolderResponse;
use AntChain\RMS\Models\UpdateLogserviceDesensconfigRequest;
use AntChain\RMS\Models\UpdateLogserviceDesensconfigResponse;
use AntChain\RMS\Models\UpdateRmsPluginRequest;
use AntChain\RMS\Models\UpdateRmsPluginResponse;
use AntChain\RMS\Models\UpdateSetupConfigRequest;
use AntChain\RMS\Models\UpdateSetupConfigResponse;
use AntChain\RMS\Models\UpdateStackGeneratedconfigRequest;
use AntChain\RMS\Models\UpdateStackGeneratedconfigResponse;
use AntChain\RMS\Models\UpdateTraasmetaAppgroupRequest;
use AntChain\RMS\Models\UpdateTraasmetaAppgroupResponse;
use AntChain\RMS\Models\UpdateTraasmetaAppRequest;
use AntChain\RMS\Models\UpdateTraasmetaAppResponse;
use AntChain\RMS\Models\UpdateTraasmetaAppserverRequest;
use AntChain\RMS\Models\UpdateTraasmetaAppserverResponse;
use AntChain\RMS\Models\UpdateTraasmetaApptagRequest;
use AntChain\RMS\Models\UpdateTraasmetaApptagResponse;
use AntChain\RMS\Models\UpdateTraasmetaCellRequest;
use AntChain\RMS\Models\UpdateTraasmetaCellResponse;
use AntChain\RMS\Models\UpdateTraasmetaHostmachineRequest;
use AntChain\RMS\Models\UpdateTraasmetaHostmachineResponse;
use AntChain\RMS\Models\UpdateTraasmetaRegionRequest;
use AntChain\RMS\Models\UpdateTraasmetaRegionResponse;
use AntChain\RMS\Models\UpdateTraasmetaTenantRequest;
use AntChain\RMS\Models\UpdateTraasmetaTenantResponse;
use AntChain\RMS\Models\UpdateTraasmetaWorkspacegroupRequest;
use AntChain\RMS\Models\UpdateTraasmetaWorkspacegroupResponse;
use AntChain\RMS\Models\UpdateTraasmetaWorkspaceRequest;
use AntChain\RMS\Models\UpdateTraasmetaWorkspaceResponse;
use AntChain\RMS\Models\UpdateTraasmetaZoneRequest;
use AntChain\RMS\Models\UpdateTraasmetaZoneResponse;
use AntChain\RMS\Models\UpdateTraceWorkspacesettingRequest;
use AntChain\RMS\Models\UpdateTraceWorkspacesettingResponse;
use AntChain\RMS\Models\UpdateUnifiedalarmRuleRequest;
use AntChain\RMS\Models\UpdateUnifiedalarmRuleResponse;
use AntChain\RMS\Models\UpdateUnifiedalarmTplRequest;
use AntChain\RMS\Models\UpdateUnifiedalarmTplResponse;
use AntChain\RMS\Models\UpdateUsergroupRequest;
use AntChain\RMS\Models\UpdateUsergroupResponse;
use AntChain\RMS\Models\UpdateWorkspaceSettingRequest;
use AntChain\RMS\Models\UpdateWorkspaceSettingResponse;
use AntChain\RMS\Models\UpdateXdashboardRequest;
use AntChain\RMS\Models\UpdateXdashboardResponse;
use AntChain\RMS\Models\UpdateXdatasourceRequest;
use AntChain\RMS\Models\UpdateXdatasourceResponse;
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
            // condition
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
                    'sdk_version'      => '1.3.273',
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
     * Description: /agent/logLocate
     * Summary: /agent/logLocate.
     *
     * @param QueryRmsAgentloglocateRequest $request
     *
     * @return QueryRmsAgentloglocateResponse
     */
    public function queryRmsAgentloglocate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsAgentloglocateEx($request, $headers, $runtime);
    }

    /**
     * Description: /agent/logLocate
     * Summary: /agent/logLocate.
     *
     * @param QueryRmsAgentloglocateRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryRmsAgentloglocateResponse
     */
    public function queryRmsAgentloglocateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsAgentloglocateResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.agentloglocate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /agent/tail
     * Summary: /agent/tail.
     *
     * @param QueryRmsAgenttailRequest $request
     *
     * @return QueryRmsAgenttailResponse
     */
    public function queryRmsAgenttail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsAgenttailEx($request, $headers, $runtime);
    }

    /**
     * Description: /agent/tail
     * Summary: /agent/tail.
     *
     * @param QueryRmsAgenttailRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryRmsAgenttailResponse
     */
    public function queryRmsAgenttailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsAgenttailResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.agenttail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /agent/browser
     * Summary: /agent/browser.
     *
     * @param QueryRmsAgentbrowserRequest $request
     *
     * @return QueryRmsAgentbrowserResponse
     */
    public function queryRmsAgentbrowser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsAgentbrowserEx($request, $headers, $runtime);
    }

    /**
     * Description: /agent/browser
     * Summary: /agent/browser.
     *
     * @param QueryRmsAgentbrowserRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRmsAgentbrowserResponse
     */
    public function queryRmsAgentbrowserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsAgentbrowserResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.agentbrowser.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: rms.alarmhistorytype.query
     * Summary: alarmTypeStats.
     *
     * @param QueryRmsAlarmhistorytypeRequest $request
     *
     * @return QueryRmsAlarmhistorytypeResponse
     */
    public function queryRmsAlarmhistorytype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsAlarmhistorytypeEx($request, $headers, $runtime);
    }

    /**
     * Description: rms.alarmhistorytype.query
     * Summary: alarmTypeStats.
     *
     * @param QueryRmsAlarmhistorytypeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRmsAlarmhistorytypeResponse
     */
    public function queryRmsAlarmhistorytypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsAlarmhistorytypeResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.alarmhistorytype.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: alarmLevelStats
     * Summary: alarmLevelStats.
     *
     * @param QueryRmsAlarmhistorylevelRequest $request
     *
     * @return QueryRmsAlarmhistorylevelResponse
     */
    public function queryRmsAlarmhistorylevel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsAlarmhistorylevelEx($request, $headers, $runtime);
    }

    /**
     * Description: alarmLevelStats
     * Summary: alarmLevelStats.
     *
     * @param QueryRmsAlarmhistorylevelRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryRmsAlarmhistorylevelResponse
     */
    public function queryRmsAlarmhistorylevelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsAlarmhistorylevelResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.alarmhistorylevel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /stats/notify/history
     * Summary: notifyHistoryStatsV2.
     *
     * @param QueryRmsNotifyhistoryRequest $request
     *
     * @return QueryRmsNotifyhistoryResponse
     */
    public function queryRmsNotifyhistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsNotifyhistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: /stats/notify/history
     * Summary: notifyHistoryStatsV2.
     *
     * @param QueryRmsNotifyhistoryRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRmsNotifyhistoryResponse
     */
    public function queryRmsNotifyhistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsNotifyhistoryResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.notifyhistory.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /stats/stack/entity
     * Summary: stackEntityStats.
     *
     * @param QueryRmsStackentityRequest $request
     *
     * @return QueryRmsStackentityResponse
     */
    public function queryRmsStackentity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsStackentityEx($request, $headers, $runtime);
    }

    /**
     * Description: /stats/stack/entity
     * Summary: stackEntityStats.
     *
     * @param QueryRmsStackentityRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryRmsStackentityResponse
     */
    public function queryRmsStackentityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsStackentityResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.stackentity.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /stats/alarm/history/appCount
     * Summary: alarmHistoryAppCount.
     *
     * @param QueryRmsAlarmhistoryappcountRequest $request
     *
     * @return QueryRmsAlarmhistoryappcountResponse
     */
    public function queryRmsAlarmhistoryappcount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsAlarmhistoryappcountEx($request, $headers, $runtime);
    }

    /**
     * Description: /stats/alarm/history/appCount
     * Summary: alarmHistoryAppCount.
     *
     * @param QueryRmsAlarmhistoryappcountRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryRmsAlarmhistoryappcountResponse
     */
    public function queryRmsAlarmhistoryappcountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsAlarmhistoryappcountResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.alarmhistoryappcount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /alarm/history/appStats
     * Summary: alarmHistoryAppStats.
     *
     * @param QueryRmsAlarmhistoryappstatsRequest $request
     *
     * @return QueryRmsAlarmhistoryappstatsResponse
     */
    public function queryRmsAlarmhistoryappstats($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsAlarmhistoryappstatsEx($request, $headers, $runtime);
    }

    /**
     * Description: /alarm/history/appStats
     * Summary: alarmHistoryAppStats.
     *
     * @param QueryRmsAlarmhistoryappstatsRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryRmsAlarmhistoryappstatsResponse
     */
    public function queryRmsAlarmhistoryappstatsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsAlarmhistoryappstatsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.alarmhistoryappstats.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /alarm/history/appStatsPageable
     * Summary: appstatspageable.
     *
     * @param QueryRmsAppstatspageableRequest $request
     *
     * @return QueryRmsAppstatspageableResponse
     */
    public function queryRmsAppstatspageable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsAppstatspageableEx($request, $headers, $runtime);
    }

    /**
     * Description: /alarm/history/appStatsPageable
     * Summary: appstatspageable.
     *
     * @param QueryRmsAppstatspageableRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryRmsAppstatspageableResponse
     */
    public function queryRmsAppstatspageableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsAppstatspageableResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.appstatspageable.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /logread/error
     * Summary: /logread/error.
     *
     * @param QueryRmsLogreaderrorRequest $request
     *
     * @return QueryRmsLogreaderrorResponse
     */
    public function queryRmsLogreaderror($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsLogreaderrorEx($request, $headers, $runtime);
    }

    /**
     * Description: /logread/error
     * Summary: /logread/error.
     *
     * @param QueryRmsLogreaderrorRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRmsLogreaderrorResponse
     */
    public function queryRmsLogreaderrorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsLogreaderrorResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.logreaderror.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /universal/read
     * Summary: /universal/read.
     *
     * @param QueryRmsUniversalreadRequest $request
     *
     * @return QueryRmsUniversalreadResponse
     */
    public function queryRmsUniversalread($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsUniversalreadEx($request, $headers, $runtime);
    }

    /**
     * Description: /universal/read
     * Summary: /universal/read.
     *
     * @param QueryRmsUniversalreadRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRmsUniversalreadResponse
     */
    public function queryRmsUniversalreadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsUniversalreadResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.universalread.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /universal/write
     * Summary: /universal/write.
     *
     * @param QueryRmsUniversalwriteRequest $request
     *
     * @return QueryRmsUniversalwriteResponse
     */
    public function queryRmsUniversalwrite($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsUniversalwriteEx($request, $headers, $runtime);
    }

    /**
     * Description: /universal/write
     * Summary: /universal/write.
     *
     * @param QueryRmsUniversalwriteRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryRmsUniversalwriteResponse
     */
    public function queryRmsUniversalwriteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsUniversalwriteResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.universalwrite.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/create
     * Summary: create.
     *
     * @param CreateRmsPluginRequest $request
     *
     * @return CreateRmsPluginResponse
     */
    public function createRmsPlugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/create
     * Summary: create.
     *
     * @param CreateRmsPluginRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateRmsPluginResponse
     */
    public function createRmsPluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRmsPluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.plugin.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/delete
     * Summary: delete.
     *
     * @param DeleteRmsPluginRequest $request
     *
     * @return DeleteRmsPluginResponse
     */
    public function deleteRmsPlugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/delete
     * Summary: delete.
     *
     * @param DeleteRmsPluginRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteRmsPluginResponse
     */
    public function deleteRmsPluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteRmsPluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.plugin.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/close
     * Summary: close.
     *
     * @param CloseRmsPluginRequest $request
     *
     * @return CloseRmsPluginResponse
     */
    public function closeRmsPlugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->closeRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/close
     * Summary: close.
     *
     * @param CloseRmsPluginRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CloseRmsPluginResponse
     */
    public function closeRmsPluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloseRmsPluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.plugin.close', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/open
     * Summary: open.
     *
     * @param OpenRmsPluginRequest $request
     *
     * @return OpenRmsPluginResponse
     */
    public function openRmsPlugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/open
     * Summary: open.
     *
     * @param OpenRmsPluginRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return OpenRmsPluginResponse
     */
    public function openRmsPluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenRmsPluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.plugin.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/update
     * Summary: update.
     *
     * @param UpdateRmsPluginRequest $request
     *
     * @return UpdateRmsPluginResponse
     */
    public function updateRmsPlugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/update
     * Summary: update.
     *
     * @param UpdateRmsPluginRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateRmsPluginResponse
     */
    public function updateRmsPluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRmsPluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.plugin.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/queryByPluginType
     * Summary: queryByPluginType.
     *
     * @param QueryRmsPluginbytypeRequest $request
     *
     * @return QueryRmsPluginbytypeResponse
     */
    public function queryRmsPluginbytype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsPluginbytypeEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/queryByPluginType
     * Summary: queryByPluginType.
     *
     * @param QueryRmsPluginbytypeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryRmsPluginbytypeResponse
     */
    public function queryRmsPluginbytypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsPluginbytypeResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.pluginbytype.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/queryByFolder
     * Summary: queryByFolder.
     *
     * @param QueryRmsPluginbyfolderRequest $request
     *
     * @return QueryRmsPluginbyfolderResponse
     */
    public function queryRmsPluginbyfolder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsPluginbyfolderEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/queryByFolder
     * Summary: queryByFolder.
     *
     * @param QueryRmsPluginbyfolderRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryRmsPluginbyfolderResponse
     */
    public function queryRmsPluginbyfolderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsPluginbyfolderResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.pluginbyfolder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/query
     * Summary: query.
     *
     * @param QueryRmsPluginRequest $request
     *
     * @return QueryRmsPluginResponse
     */
    public function queryRmsPlugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsPluginEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/query
     * Summary: query.
     *
     * @param QueryRmsPluginRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryRmsPluginResponse
     */
    public function queryRmsPluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsPluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.plugin.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/plugin/querytest
     * Summary: querytest.
     *
     * @param QueryRmsPlugintestRequest $request
     *
     * @return QueryRmsPlugintestResponse
     */
    public function queryRmsPlugintest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsPlugintestEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/plugin/querytest
     * Summary: querytest.
     *
     * @param QueryRmsPlugintestRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryRmsPlugintestResponse
     */
    public function queryRmsPlugintestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsPlugintestResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.plugintest.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /modeling/folder/path
     * Summary: queryPath.
     *
     * @param QueryRmsPathRequest $request
     *
     * @return QueryRmsPathResponse
     */
    public function queryRmsPath($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsPathEx($request, $headers, $runtime);
    }

    /**
     * Description: /modeling/folder/path
     * Summary: queryPath.
     *
     * @param QueryRmsPathRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryRmsPathResponse
     */
    public function queryRmsPathEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsPathResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.path.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /{tenantId}/webapi/cleankey
     * Summary: cleankey.
     *
     * @param ExecRmsUniversalcleankeyRequest $request
     *
     * @return ExecRmsUniversalcleankeyResponse
     */
    public function execRmsUniversalcleankey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execRmsUniversalcleankeyEx($request, $headers, $runtime);
    }

    /**
     * Description: /{tenantId}/webapi/cleankey
     * Summary: cleankey.
     *
     * @param ExecRmsUniversalcleankeyRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ExecRmsUniversalcleankeyResponse
     */
    public function execRmsUniversalcleankeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecRmsUniversalcleankeyResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.universalcleankey.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /{tenantId}/universalQuery
     * Summary: universalQuery.
     *
     * @param QueryRmsUniversalRequest $request
     *
     * @return QueryRmsUniversalResponse
     */
    public function queryRmsUniversal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsUniversalEx($request, $headers, $runtime);
    }

    /**
     * Description: /{tenantId}/universalQuery
     * Summary: universalQuery.
     *
     * @param QueryRmsUniversalRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryRmsUniversalResponse
     */
    public function queryRmsUniversalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsUniversalResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.universal.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链路搜索
     * Summary: 链路搜索.
     *
     * @param QueryRmsTracespanRequest $request
     *
     * @return QueryRmsTracespanResponse
     */
    public function queryRmsTracespan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRmsTracespanEx($request, $headers, $runtime);
    }

    /**
     * Description: 链路搜索
     * Summary: 链路搜索.
     *
     * @param QueryRmsTracespanRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryRmsTracespanResponse
     */
    public function queryRmsTracespanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRmsTracespanResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.tracespan.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链路搜索页面的配置
     * Summary: 查询链路搜索页面的配置.
     *
     * @param GetRmsTracespanqueryconfigRequest $request
     *
     * @return GetRmsTracespanqueryconfigResponse
     */
    public function getRmsTracespanqueryconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRmsTracespanqueryconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链路搜索页面的配置
     * Summary: 查询链路搜索页面的配置.
     *
     * @param GetRmsTracespanqueryconfigRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetRmsTracespanqueryconfigResponse
     */
    public function getRmsTracespanqueryconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRmsTracespanqueryconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.tracespanqueryconfig.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单链路树状图查询
     * Summary: 单链路树状图查询.
     *
     * @param DescribeRmsTracetreeRequest $request
     *
     * @return DescribeRmsTracetreeResponse
     */
    public function describeRmsTracetree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeRmsTracetreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 单链路树状图查询
     * Summary: 单链路树状图查询.
     *
     * @param DescribeRmsTracetreeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DescribeRmsTracetreeResponse
     */
    public function describeRmsTracetreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeRmsTracetreeResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.tracetree.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 商品补全接口
     * Summary: 南天门 - 商品补全接口.
     *
     * @param CallbackSpiCompletecommodityRequest $request
     *
     * @return CallbackSpiCompletecommodityResponse
     */
    public function callbackSpiCompletecommodity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackSpiCompletecommodityEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 商品补全接口
     * Summary: 南天门 - 商品补全接口.
     *
     * @param CallbackSpiCompletecommodityRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CallbackSpiCompletecommodityResponse
     */
    public function callbackSpiCompletecommodityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackSpiCompletecommodityResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.spi.completecommodity.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 支付后回调
     * Summary: 南天门 - 支付后回调.
     *
     * @param CallbackSpiPayordercallbackRequest $request
     *
     * @return CallbackSpiPayordercallbackResponse
     */
    public function callbackSpiPayordercallback($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackSpiPayordercallbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 支付后回调
     * Summary: 南天门 - 支付后回调.
     *
     * @param CallbackSpiPayordercallbackRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CallbackSpiPayordercallbackResponse
     */
    public function callbackSpiPayordercallbackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackSpiPayordercallbackResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.spi.payordercallback.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 补全订单
     * Summary: 南天门 - 补全订单.
     *
     * @param CallbackSpiCompleteorderparamRequest $request
     *
     * @return CallbackSpiCompleteorderparamResponse
     */
    public function callbackSpiCompleteorderparam($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackSpiCompleteorderparamEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 补全订单
     * Summary: 南天门 - 补全订单.
     *
     * @param CallbackSpiCompleteorderparamRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CallbackSpiCompleteorderparamResponse
     */
    public function callbackSpiCompleteorderparamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackSpiCompleteorderparamResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.spi.completeorderparam.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 订单校验回调
     * Summary: 南天门 - 订单校验回调.
     *
     * @param CallbackSpiVerifyRequest $request
     *
     * @return CallbackSpiVerifyResponse
     */
    public function callbackSpiVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackSpiVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 订单校验回调
     * Summary: 南天门 - 订单校验回调.
     *
     * @param CallbackSpiVerifyRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CallbackSpiVerifyResponse
     */
    public function callbackSpiVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackSpiVerifyResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.spi.verify.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 退款
     * Summary: 南天门 - 退款.
     *
     * @param CallbackSpiRefundRequest $request
     *
     * @return CallbackSpiRefundResponse
     */
    public function callbackSpiRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackSpiRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 退款
     * Summary: 南天门 - 退款.
     *
     * @param CallbackSpiRefundRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CallbackSpiRefundResponse
     */
    public function callbackSpiRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackSpiRefundResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.spi.refund.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 南天门 - 商品实例生命周期回调
     * Summary: 南天门 - 商品实例生命周期回调.
     *
     * @param CallbackSpiLifecycleRequest $request
     *
     * @return CallbackSpiLifecycleResponse
     */
    public function callbackSpiLifecycle($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackSpiLifecycleEx($request, $headers, $runtime);
    }

    /**
     * Description: 南天门 - 商品实例生命周期回调
     * Summary: 南天门 - 商品实例生命周期回调.
     *
     * @param CallbackSpiLifecycleRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CallbackSpiLifecycleResponse
     */
    public function callbackSpiLifecycleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackSpiLifecycleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.spi.lifecycle.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询时序指标
     * Summary: 查询时序指标.
     *
     * @param DescribeRmsTimeseriesmetricsRequest $request
     *
     * @return DescribeRmsTimeseriesmetricsResponse
     */
    public function describeRmsTimeseriesmetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeRmsTimeseriesmetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询时序指标
     * Summary: 查询时序指标.
     *
     * @param DescribeRmsTimeseriesmetricsRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return DescribeRmsTimeseriesmetricsResponse
     */
    public function describeRmsTimeseriesmetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeRmsTimeseriesmetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.timeseriesmetrics.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取调用拓扑
     * Summary: 获取调用拓扑.
     *
     * @param DescribeRmsTopologyRequest $request
     *
     * @return DescribeRmsTopologyResponse
     */
    public function describeRmsTopology($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeRmsTopologyEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取调用拓扑
     * Summary: 获取调用拓扑.
     *
     * @param DescribeRmsTopologyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DescribeRmsTopologyResponse
     */
    public function describeRmsTopologyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeRmsTopologyResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.rms.topology.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监控指标数据查询
     * Summary: 监控指标数据查询.
     *
     * @param QueryMetricsRequest $request
     *
     * @return QueryMetricsResponse
     */
    public function queryMetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 监控指标数据查询
     * Summary: 监控指标数据查询.
     *
     * @param QueryMetricsRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryMetricsResponse
     */
    public function queryMetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.metrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链路Span查询搜索
     * Summary: 链路查询.
     *
     * @param QueryTraceSpanRequest $request
     *
     * @return QueryTraceSpanResponse
     */
    public function queryTraceSpan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceSpanEx($request, $headers, $runtime);
    }

    /**
     * Description: 链路Span查询搜索
     * Summary: 链路查询.
     *
     * @param QueryTraceSpanRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryTraceSpanResponse
     */
    public function queryTraceSpanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceSpanResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.span.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表.
     *
     * @param ListAppNameRequest $request
     *
     * @return ListAppNameResponse
     */
    public function listAppName($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppNameEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取应用列表
     * Summary: 获取应用列表.
     *
     * @param ListAppNameRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ListAppNameResponse
     */
    public function listAppNameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppNameResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.app.name.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建自定义监控指标
     * Summary: 创建自定义监控指标.
     *
     * @param CreateCustompluginRequest $request
     *
     * @return CreateCustompluginResponse
     */
    public function createCustomplugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCustompluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建自定义监控指标
     * Summary: 创建自定义监控指标.
     *
     * @param CreateCustompluginRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateCustompluginResponse
     */
    public function createCustompluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCustompluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.customplugin.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除自定义监控指标
     * Summary: 删除自定义监控指标.
     *
     * @param DeleteCustompluginRequest $request
     *
     * @return DeleteCustompluginResponse
     */
    public function deleteCustomplugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteCustompluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除自定义监控指标
     * Summary: 删除自定义监控指标.
     *
     * @param DeleteCustompluginRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteCustompluginResponse
     */
    public function deleteCustompluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteCustompluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.customplugin.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自定义监控 - 添加文件夹
     * Summary: 自定义监控 - 添加文件夹.
     *
     * @param CreateFolderRequest $request
     *
     * @return CreateFolderResponse
     */
    public function createFolder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFolderEx($request, $headers, $runtime);
    }

    /**
     * Description: 自定义监控 - 添加文件夹
     * Summary: 自定义监控 - 添加文件夹.
     *
     * @param CreateFolderRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateFolderResponse
     */
    public function createFolderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFolderResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.folder.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自定义监控 - 文件夹更新
     * Summary: 自定义监控 - 文件夹更新.
     *
     * @param UpdateFolderRequest $request
     *
     * @return UpdateFolderResponse
     */
    public function updateFolder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateFolderEx($request, $headers, $runtime);
    }

    /**
     * Description: 自定义监控 - 文件夹更新
     * Summary: 自定义监控 - 文件夹更新.
     *
     * @param UpdateFolderRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return UpdateFolderResponse
     */
    public function updateFolderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateFolderResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.folder.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链路查询时可选参数的配置查询
     * Summary: 链路查询时可选参数的配置查询.
     *
     * @param QueryTraceConfigRequest $request
     *
     * @return QueryTraceConfigResponse
     */
    public function queryTraceConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 链路查询时可选参数的配置查询
     * Summary: 链路查询时可选参数的配置查询.
     *
     * @param QueryTraceConfigRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryTraceConfigResponse
     */
    public function queryTraceConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.config.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询文件夹路径
     * Summary: 查询文件夹路径.
     *
     * @param QueryFolderPathRequest $request
     *
     * @return QueryFolderPathResponse
     */
    public function queryFolderPath($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFolderPathEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询文件夹路径
     * Summary: 查询文件夹路径.
     *
     * @param QueryFolderPathRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryFolderPathResponse
     */
    public function queryFolderPathEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFolderPathResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.folder.path.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链路详情
     * Summary: 查询链路详情.
     *
     * @param QueryTraceDetailRequest $request
     *
     * @return QueryTraceDetailResponse
     */
    public function queryTraceDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链路详情
     * Summary: 查询链路详情.
     *
     * @param QueryTraceDetailRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryTraceDetailResponse
     */
    public function queryTraceDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceDetailResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取链路拓扑图
     * Summary: 获取链路拓扑图.
     *
     * @param QueryTraceTopologyRequest $request
     *
     * @return QueryTraceTopologyResponse
     */
    public function queryTraceTopology($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceTopologyEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取链路拓扑图
     * Summary: 获取链路拓扑图.
     *
     * @param QueryTraceTopologyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryTraceTopologyResponse
     */
    public function queryTraceTopologyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceTopologyResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.topology.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链路关联指标
     * Summary: 查询链路关联指标.
     *
     * @param QueryTraceMetricsRequest $request
     *
     * @return QueryTraceMetricsResponse
     */
    public function queryTraceMetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceMetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链路关联指标
     * Summary: 查询链路关联指标.
     *
     * @param QueryTraceMetricsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryTraceMetricsResponse
     */
    public function queryTraceMetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceMetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.metrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取自定义监控指标详情
     * Summary: 获取自定义监控指标详情.
     *
     * @param GetCustompluginRequest $request
     *
     * @return GetCustompluginResponse
     */
    public function getCustomplugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCustompluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取自定义监控指标详情
     * Summary: 获取自定义监控指标详情.
     *
     * @param GetCustompluginRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetCustompluginResponse
     */
    public function getCustompluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCustompluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.customplugin.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用监控
     * Summary: 查询应用监控.
     *
     * @param QueryAppRequest $request
     *
     * @return QueryAppResponse
     */
    public function queryApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用监控
     * Summary: 查询应用监控.
     *
     * @param QueryAppRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return QueryAppResponse
     */
    public function queryAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.app.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取用户收藏资源状态
     * Summary: 获取用户收藏资源状态
     *
     * @param GetUserFavoriteRequest $request
     *
     * @return GetUserFavoriteResponse
     */
    public function getUserFavorite($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getUserFavoriteEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取用户收藏资源状态
     * Summary: 获取用户收藏资源状态
     *
     * @param GetUserFavoriteRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetUserFavoriteResponse
     */
    public function getUserFavoriteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetUserFavoriteResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.user.favorite.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询文件夹列表
     * Summary: 查询文件夹列表.
     *
     * @param QueryFolderRequest $request
     *
     * @return QueryFolderResponse
     */
    public function queryFolder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFolderEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询文件夹列表
     * Summary: 查询文件夹列表.
     *
     * @param QueryFolderRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryFolderResponse
     */
    public function queryFolderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFolderResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.folder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  查询自定义监控配置列表
     * Summary:  查询自定义监控配置列表.
     *
     * @param QueryCustompluginRequest $request
     *
     * @return QueryCustompluginResponse
     */
    public function queryCustomplugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCustompluginEx($request, $headers, $runtime);
    }

    /**
     * Description:  查询自定义监控配置列表
     * Summary:  查询自定义监控配置列表.
     *
     * @param QueryCustompluginRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryCustompluginResponse
     */
    public function queryCustompluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCustompluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.customplugin.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户收藏列表
     * Summary: 查询用户收藏列表.
     *
     * @param QueryUserFavoriteRequest $request
     *
     * @return QueryUserFavoriteResponse
     */
    public function queryUserFavorite($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserFavoriteEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户收藏列表
     * Summary: 查询用户收藏列表.
     *
     * @param QueryUserFavoriteRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryUserFavoriteResponse
     */
    public function queryUserFavoriteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserFavoriteResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.user.favorite.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 告警暂停列表查询
     * Summary: 告警暂停列表查询.
     *
     * @param QueryAlarmPauseRequest $request
     *
     * @return QueryAlarmPauseResponse
     */
    public function queryAlarmPause($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlarmPauseEx($request, $headers, $runtime);
    }

    /**
     * Description: 告警暂停列表查询
     * Summary: 告警暂停列表查询.
     *
     * @param QueryAlarmPauseRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryAlarmPauseResponse
     */
    public function queryAlarmPauseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlarmPauseResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.pause.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取告警应用统计信息
     * Summary: 获取告警应用统计信息.
     *
     * @param CountAlarmAppRequest $request
     *
     * @return CountAlarmAppResponse
     */
    public function countAlarmApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countAlarmAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取告警应用统计信息
     * Summary: 获取告警应用统计信息.
     *
     * @param CountAlarmAppRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CountAlarmAppResponse
     */
    public function countAlarmAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountAlarmAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.app.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询告警应用关联Map
     * Summary: 查询告警应用关联Map.
     *
     * @param QueryAlarmApprelationRequest $request
     *
     * @return QueryAlarmApprelationResponse
     */
    public function queryAlarmApprelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlarmApprelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询告警应用关联Map
     * Summary: 查询告警应用关联Map.
     *
     * @param QueryAlarmApprelationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryAlarmApprelationResponse
     */
    public function queryAlarmApprelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlarmApprelationResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.apprelation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询栈配置
     * Summary: 批量查询栈配置.
     *
     * @param BatchqueryStackGeneratedconfigRequest $request
     *
     * @return BatchqueryStackGeneratedconfigResponse
     */
    public function batchqueryStackGeneratedconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryStackGeneratedconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询栈配置
     * Summary: 批量查询栈配置.
     *
     * @param BatchqueryStackGeneratedconfigRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return BatchqueryStackGeneratedconfigResponse
     */
    public function batchqueryStackGeneratedconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryStackGeneratedconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.stack.generatedconfig.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取大盘列表
     * Summary: 获取大盘列表.
     *
     * @param ListDashboardRequest $request
     *
     * @return ListDashboardResponse
     */
    public function listDashboard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDashboardEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取大盘列表
     * Summary: 获取大盘列表.
     *
     * @param ListDashboardRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ListDashboardResponse
     */
    public function listDashboardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDashboardResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.dashboard.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询技术栈配置详情
     * Summary: 查询技术栈配置详情.
     *
     * @param QueryStackGeneratedconfigRequest $request
     *
     * @return QueryStackGeneratedconfigResponse
     */
    public function queryStackGeneratedconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStackGeneratedconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询技术栈配置详情
     * Summary: 查询技术栈配置详情.
     *
     * @param QueryStackGeneratedconfigRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryStackGeneratedconfigResponse
     */
    public function queryStackGeneratedconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStackGeneratedconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.stack.generatedconfig.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询监控项
     * Summary: 查询监控项.
     *
     * @param QueryStackMonitoritemRequest $request
     *
     * @return QueryStackMonitoritemResponse
     */
    public function queryStackMonitoritem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStackMonitoritemEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询监控项
     * Summary: 查询监控项.
     *
     * @param QueryStackMonitoritemRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryStackMonitoritemResponse
     */
    public function queryStackMonitoritemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStackMonitoritemResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.stack.monitoritem.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询通知组
     * Summary: 分页查询通知组.
     *
     * @param QueryUsergroupRequest $request
     *
     * @return QueryUsergroupResponse
     */
    public function queryUsergroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUsergroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询通知组
     * Summary: 分页查询通知组.
     *
     * @param QueryUsergroupRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryUsergroupResponse
     */
    public function queryUsergroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUsergroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.usergroup.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建通知组
     * Summary: 创建通知组.
     *
     * @param CreateUsergroupRequest $request
     *
     * @return CreateUsergroupResponse
     */
    public function createUsergroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUsergroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建通知组
     * Summary: 创建通知组.
     *
     * @param CreateUsergroupRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateUsergroupResponse
     */
    public function createUsergroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUsergroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.usergroup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新通知组
     * Summary: 更新通知组.
     *
     * @param UpdateUsergroupRequest $request
     *
     * @return UpdateUsergroupResponse
     */
    public function updateUsergroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateUsergroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新通知组
     * Summary: 更新通知组.
     *
     * @param UpdateUsergroupRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateUsergroupResponse
     */
    public function updateUsergroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateUsergroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.usergroup.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除通知组
     * Summary: 删除通知组.
     *
     * @param DeleteUsergroupRequest $request
     *
     * @return DeleteUsergroupResponse
     */
    public function deleteUsergroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteUsergroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除通知组
     * Summary: 删除通知组.
     *
     * @param DeleteUsergroupRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteUsergroupResponse
     */
    public function deleteUsergroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteUsergroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.usergroup.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
     * Summary: 查询过去某一时段内的告警趋势
     *
     * @param QueryAlarmTrendRequest $request
     *
     * @return QueryAlarmTrendResponse
     */
    public function queryAlarmTrend($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlarmTrendEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询过去某一时段内的告警趋势(包含自定义、应用、应用组的告警数量)
     * Summary: 查询过去某一时段内的告警趋势
     *
     * @param QueryAlarmTrendRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryAlarmTrendResponse
     */
    public function queryAlarmTrendEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlarmTrendResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.trend.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询过去某一时段的告警详情
     * Summary: 查询过去某一时段的告警详情.
     *
     * @param QueryAlarmHistoryRequest $request
     *
     * @return QueryAlarmHistoryResponse
     */
    public function queryAlarmHistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlarmHistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询过去某一时段的告警详情
     * Summary: 查询过去某一时段的告警详情.
     *
     * @param QueryAlarmHistoryRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryAlarmHistoryResponse
     */
    public function queryAlarmHistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlarmHistoryResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.history.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询告警订阅
     * Summary: 查询告警订阅.
     *
     * @param QueryAlarmSubscriptionRequest $request
     *
     * @return QueryAlarmSubscriptionResponse
     */
    public function queryAlarmSubscription($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlarmSubscriptionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询告警订阅
     * Summary: 查询告警订阅.
     *
     * @param QueryAlarmSubscriptionRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryAlarmSubscriptionResponse
     */
    public function queryAlarmSubscriptionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlarmSubscriptionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.subscription.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询某个应用监控的告警套餐
     * Summary: 查询某个应用监控的告警套餐.
     *
     * @param QueryStackAlarmruleRequest $request
     *
     * @return QueryStackAlarmruleResponse
     */
    public function queryStackAlarmrule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStackAlarmruleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询某个应用监控的告警套餐
     * Summary: 查询某个应用监控的告警套餐.
     *
     * @param QueryStackAlarmruleRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryStackAlarmruleResponse
     */
    public function queryStackAlarmruleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStackAlarmruleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.stack.alarmrule.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改自定义监控指标
     * Summary: 修改自定义监控指标.
     *
     * @param UpdateCustompluginRequest $request
     *
     * @return UpdateCustompluginResponse
     */
    public function updateCustomplugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCustompluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改自定义监控指标
     * Summary: 修改自定义监控指标.
     *
     * @param UpdateCustompluginRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateCustompluginResponse
     */
    public function updateCustompluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCustompluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.customplugin.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询 agent 安装信息列表
     * Summary: 查询 agent 安装信息列表.
     *
     * @param QueryAgentRequest $request
     *
     * @return QueryAgentResponse
     */
    public function queryAgent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAgentEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询 agent 安装信息列表
     * Summary: 查询 agent 安装信息列表.
     *
     * @param QueryAgentRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryAgentResponse
     */
    public function queryAgentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAgentResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.agent.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 安装 agent 组件
     * Summary: 安装 agent 组件.
     *
     * @param InstallAgentRequest $request
     *
     * @return InstallAgentResponse
     */
    public function installAgent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->installAgentEx($request, $headers, $runtime);
    }

    /**
     * Description: 安装 agent 组件
     * Summary: 安装 agent 组件.
     *
     * @param InstallAgentRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return InstallAgentResponse
     */
    public function installAgentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InstallAgentResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.agent.install', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取需要安装的 agent 版本
     * Summary: 获取需要安装的 agent 版本.
     *
     * @param GetAgentVersionRequest $request
     *
     * @return GetAgentVersionResponse
     */
    public function getAgentVersion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAgentVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取需要安装的 agent 版本
     * Summary: 获取需要安装的 agent 版本.
     *
     * @param GetAgentVersionRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetAgentVersionResponse
     */
    public function getAgentVersionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAgentVersionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.agent.version.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  设置默认最新agent版本
     * Summary:  设置默认最新agent版本.
     *
     * @param EnableAgentVersionRequest $request
     *
     * @return EnableAgentVersionResponse
     */
    public function enableAgentVersion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableAgentVersionEx($request, $headers, $runtime);
    }

    /**
     * Description:  设置默认最新agent版本
     * Summary:  设置默认最新agent版本.
     *
     * @param EnableAgentVersionRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return EnableAgentVersionResponse
     */
    public function enableAgentVersionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableAgentVersionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.agent.version.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取当前工作空间
     * Summary: 获取当前工作空间.
     *
     * @param GetWorkspaceRequest $request
     *
     * @return GetWorkspaceResponse
     */
    public function getWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取当前工作空间
     * Summary: 获取当前工作空间.
     *
     * @param GetWorkspaceRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetWorkspaceResponse
     */
    public function getWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.workspace.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取当前租户
     * Summary: 获取当前租户.
     *
     * @param GetTenantRequest $request
     *
     * @return GetTenantResponse
     */
    public function getTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取当前租户
     * Summary: 获取当前租户.
     *
     * @param GetTenantRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return GetTenantResponse
     */
    public function getTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.tenant.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询核心态监控配置
     * Summary: 查询核心态监控配置.
     *
     * @param QueryKernelstackGeneratedconfigRequest $request
     *
     * @return QueryKernelstackGeneratedconfigResponse
     */
    public function queryKernelstackGeneratedconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryKernelstackGeneratedconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询核心态监控配置
     * Summary: 查询核心态监控配置.
     *
     * @param QueryKernelstackGeneratedconfigRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryKernelstackGeneratedconfigResponse
     */
    public function queryKernelstackGeneratedconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryKernelstackGeneratedconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.kernelstack.generatedconfig.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取阿里云开通状态
     * Summary: 获取阿里云开通状态
     *
     * @param GetAliyunStatusRequest $request
     *
     * @return GetAliyunStatusResponse
     */
    public function getAliyunStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAliyunStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取阿里云开通状态
     * Summary: 获取阿里云开通状态
     *
     * @param GetAliyunStatusRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetAliyunStatusResponse
     */
    public function getAliyunStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAliyunStatusResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.aliyun.status.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监控工作空间开通
     * Summary: 监控工作空间开通.
     *
     * @param OpenWorkspaceRequest $request
     *
     * @return OpenWorkspaceResponse
     */
    public function openWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 监控工作空间开通
     * Summary: 监控工作空间开通.
     *
     * @param OpenWorkspaceRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return OpenWorkspaceResponse
     */
    public function openWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.workspace.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新技术栈配置
     * Summary: 更新技术栈配置.
     *
     * @param UpdateStackGeneratedconfigRequest $request
     *
     * @return UpdateStackGeneratedconfigResponse
     */
    public function updateStackGeneratedconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateStackGeneratedconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新技术栈配置
     * Summary: 更新技术栈配置.
     *
     * @param UpdateStackGeneratedconfigRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateStackGeneratedconfigResponse
     */
    public function updateStackGeneratedconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateStackGeneratedconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.stack.generatedconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户列表
     * Summary: 查询用户列表.
     *
     * @param QueryUserRequest $request
     *
     * @return QueryUserResponse
     */
    public function queryUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户列表
     * Summary: 查询用户列表.
     *
     * @param QueryUserRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryUserResponse
     */
    public function queryUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取用户权限列表
     * Summary: 获取用户权限列表.
     *
     * @param ListAuthRequest $request
     *
     * @return ListAuthResponse
     */
    public function listAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取用户权限列表
     * Summary: 获取用户权限列表.
     *
     * @param ListAuthRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return ListAuthResponse
     */
    public function listAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAuthResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.auth.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除用户权限
     * Summary: 删除用户权限.
     *
     * @param DeleteAuthRequest $request
     *
     * @return DeleteAuthResponse
     */
    public function deleteAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除用户权限
     * Summary: 删除用户权限.
     *
     * @param DeleteAuthRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return DeleteAuthResponse
     */
    public function deleteAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAuthResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.auth.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新建用户权限
     * Summary: 新建用户权限.
     *
     * @param CreateAuthRequest $request
     *
     * @return CreateAuthResponse
     */
    public function createAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 新建用户权限
     * Summary: 新建用户权限.
     *
     * @param CreateAuthRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateAuthResponse
     */
    public function createAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAuthResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.auth.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
     * Summary: 用户添加收藏资源.
     *
     * @param BatchcreateUserFavoriteRequest $request
     *
     * @return BatchcreateUserFavoriteResponse
     */
    public function batchcreateUserFavorite($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateUserFavoriteEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户添加收藏资源(可以收藏自定义监控、文件夹、用户应用)
     * Summary: 用户添加收藏资源.
     *
     * @param BatchcreateUserFavoriteRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return BatchcreateUserFavoriteResponse
     */
    public function batchcreateUserFavoriteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateUserFavoriteResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.user.favorite.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量取消收藏
     * Summary: 批量取消收藏.
     *
     * @param BatchdeleteUserFavoriteRequest $request
     *
     * @return BatchdeleteUserFavoriteResponse
     */
    public function batchdeleteUserFavorite($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteUserFavoriteEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量取消收藏
     * Summary: 批量取消收藏.
     *
     * @param BatchdeleteUserFavoriteRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return BatchdeleteUserFavoriteResponse
     */
    public function batchdeleteUserFavoriteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteUserFavoriteResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.user.favorite.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询用户的操作历史
     * Summary: 查询用户的操作历史.
     *
     * @param QueryUserOperationRequest $request
     *
     * @return QueryUserOperationResponse
     */
    public function queryUserOperation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserOperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询用户的操作历史
     * Summary: 查询用户的操作历史.
     *
     * @param QueryUserOperationRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryUserOperationResponse
     */
    public function queryUserOperationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserOperationResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.user.operation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增告警订阅
     * Summary: 新增告警订阅.
     *
     * @param CreateAlarmSubscriptionRequest $request
     *
     * @return CreateAlarmSubscriptionResponse
     */
    public function createAlarmSubscription($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAlarmSubscriptionEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增告警订阅
     * Summary: 新增告警订阅.
     *
     * @param CreateAlarmSubscriptionRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateAlarmSubscriptionResponse
     */
    public function createAlarmSubscriptionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAlarmSubscriptionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.subscription.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消告警订阅 (删除)
     * Summary: 取消告警订阅.
     *
     * @param DeleteAlarmSubscriptionRequest $request
     *
     * @return DeleteAlarmSubscriptionResponse
     */
    public function deleteAlarmSubscription($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAlarmSubscriptionEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消告警订阅 (删除)
     * Summary: 取消告警订阅.
     *
     * @param DeleteAlarmSubscriptionRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteAlarmSubscriptionResponse
     */
    public function deleteAlarmSubscriptionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAlarmSubscriptionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.subscription.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 暂停告警
     * Summary: 暂停告警.
     *
     * @param PauseAlarmRequest $request
     *
     * @return PauseAlarmResponse
     */
    public function pauseAlarm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pauseAlarmEx($request, $headers, $runtime);
    }

    /**
     * Description: 暂停告警
     * Summary: 暂停告警.
     *
     * @param PauseAlarmRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return PauseAlarmResponse
     */
    public function pauseAlarmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PauseAlarmResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.pause', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 恢复告警
     * Summary: 恢复告警.
     *
     * @param ResumeAlarmRequest $request
     *
     * @return ResumeAlarmResponse
     */
    public function resumeAlarm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resumeAlarmEx($request, $headers, $runtime);
    }

    /**
     * Description: 恢复告警
     * Summary: 恢复告警.
     *
     * @param ResumeAlarmRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ResumeAlarmResponse
     */
    public function resumeAlarmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResumeAlarmResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.resume', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 拉取日志，返回LogTail
     * Summary: 拉取日志.
     *
     * @param GetLogTailRequest $request
     *
     * @return GetLogTailResponse
     */
    public function getLogTail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLogTailEx($request, $headers, $runtime);
    }

    /**
     * Description: 拉取日志，返回LogTail
     * Summary: 拉取日志.
     *
     * @param GetLogTailRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetLogTailResponse
     */
    public function getLogTailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLogTailResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.log.tail.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取文件浏览结果
     * Summary: 获取文件浏览结果.
     *
     * @param GetLogBrowserRequest $request
     *
     * @return GetLogBrowserResponse
     */
    public function getLogBrowser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLogBrowserEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取文件浏览结果
     * Summary: 获取文件浏览结果.
     *
     * @param GetLogBrowserRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetLogBrowserResponse
     */
    public function getLogBrowserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLogBrowserResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.log.browser.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按ID删除文件夹
     * Summary: 删除文件夹.
     *
     * @param DeleteFolderRequest $request
     *
     * @return DeleteFolderResponse
     */
    public function deleteFolder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteFolderEx($request, $headers, $runtime);
    }

    /**
     * Description: 按ID删除文件夹
     * Summary: 删除文件夹.
     *
     * @param DeleteFolderRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return DeleteFolderResponse
     */
    public function deleteFolderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteFolderResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.folder.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取总览页应用统计信息
     * Summary: 获取总览页应用统计信息.
     *
     * @param GetAppOverviewRequest $request
     *
     * @return GetAppOverviewResponse
     */
    public function getAppOverview($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAppOverviewEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取总览页应用统计信息
     * Summary: 获取总览页应用统计信息.
     *
     * @param GetAppOverviewRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetAppOverviewResponse
     */
    public function getAppOverviewEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAppOverviewResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.app.overview.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询统一告警历史记录
     * Summary: 查询统一告警历史记录.
     *
     * @param QueryUnifiedalarmHistoryRequest $request
     *
     * @return QueryUnifiedalarmHistoryResponse
     */
    public function queryUnifiedalarmHistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmHistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询统一告警历史记录
     * Summary: 查询统一告警历史记录.
     *
     * @param QueryUnifiedalarmHistoryRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryUnifiedalarmHistoryResponse
     */
    public function queryUnifiedalarmHistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmHistoryResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.history.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试演示
     * Summary: 测试演示.
     *
     * @param GetAlarmTestRequest $request
     *
     * @return GetAlarmTestResponse
     */
    public function getAlarmTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAlarmTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试演示
     * Summary: 测试演示.
     *
     * @param GetAlarmTestRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetAlarmTestResponse
     */
    public function getAlarmTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAlarmTestResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.test.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取webhook列表
     * Summary: 获取webhook列表.
     *
     * @param QueryAlarmwebhookRequest $request
     *
     * @return QueryAlarmwebhookResponse
     */
    public function queryAlarmwebhook($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlarmwebhookEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取webhook列表
     * Summary: 获取webhook列表.
     *
     * @param QueryAlarmwebhookRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryAlarmwebhookResponse
     */
    public function queryAlarmwebhookEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlarmwebhookResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarmwebhook.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建告警规则
     * Summary: 创建告警规则.
     *
     * @param CreateUnifiedalarmRuleRequest $request
     *
     * @return CreateUnifiedalarmRuleResponse
     */
    public function createUnifiedalarmRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUnifiedalarmRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建告警规则
     * Summary: 创建告警规则.
     *
     * @param CreateUnifiedalarmRuleRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateUnifiedalarmRuleResponse
     */
    public function createUnifiedalarmRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUnifiedalarmRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.rule.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新告警规则
     * Summary: 更新告警规则.
     *
     * @param UpdateUnifiedalarmRuleRequest $request
     *
     * @return UpdateUnifiedalarmRuleResponse
     */
    public function updateUnifiedalarmRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateUnifiedalarmRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新告警规则
     * Summary: 更新告警规则.
     *
     * @param UpdateUnifiedalarmRuleRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateUnifiedalarmRuleResponse
     */
    public function updateUnifiedalarmRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateUnifiedalarmRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.rule.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询告警规则列表
     * Summary: 查询告警规则列表.
     *
     * @param QueryUnifiedalarmRuleRequest $request
     *
     * @return QueryUnifiedalarmRuleResponse
     */
    public function queryUnifiedalarmRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询告警规则列表
     * Summary: 查询告警规则列表.
     *
     * @param QueryUnifiedalarmRuleRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryUnifiedalarmRuleResponse
     */
    public function queryUnifiedalarmRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.rule.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询告警规则详情
     * Summary: 查询告警规则详情.
     *
     * @param GetUnifiedalarmRuleRequest $request
     *
     * @return GetUnifiedalarmRuleResponse
     */
    public function getUnifiedalarmRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getUnifiedalarmRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询告警规则详情
     * Summary: 查询告警规则详情.
     *
     * @param GetUnifiedalarmRuleRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetUnifiedalarmRuleResponse
     */
    public function getUnifiedalarmRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetUnifiedalarmRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.rule.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除告警规则
     * Summary: 删除告警规则.
     *
     * @param DeleteUnifiedalarmRuleRequest $request
     *
     * @return DeleteUnifiedalarmRuleResponse
     */
    public function deleteUnifiedalarmRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteUnifiedalarmRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除告警规则
     * Summary: 删除告警规则.
     *
     * @param DeleteUnifiedalarmRuleRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteUnifiedalarmRuleResponse
     */
    public function deleteUnifiedalarmRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteUnifiedalarmRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.rule.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询告警消息历史
     * Summary: 查询告警消息历史.
     *
     * @param QueryUnifiedalarmNotifyhistoryRequest $request
     *
     * @return QueryUnifiedalarmNotifyhistoryResponse
     */
    public function queryUnifiedalarmNotifyhistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmNotifyhistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询告警消息历史
     * Summary: 查询告警消息历史.
     *
     * @param QueryUnifiedalarmNotifyhistoryRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryUnifiedalarmNotifyhistoryResponse
     */
    public function queryUnifiedalarmNotifyhistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmNotifyhistoryResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.notifyhistory.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量订阅告警
     * Summary: 批量订阅告警.
     *
     * @param BatchcreateUnifiedalarmSubRequest $request
     *
     * @return BatchcreateUnifiedalarmSubResponse
     */
    public function batchcreateUnifiedalarmSub($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateUnifiedalarmSubEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量订阅告警
     * Summary: 批量订阅告警.
     *
     * @param BatchcreateUnifiedalarmSubRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return BatchcreateUnifiedalarmSubResponse
     */
    public function batchcreateUnifiedalarmSubEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateUnifiedalarmSubResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.sub.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消订阅
     * Summary: 批量取消订阅.
     *
     * @param DeleteUnifiedalarmSubRequest $request
     *
     * @return DeleteUnifiedalarmSubResponse
     */
    public function deleteUnifiedalarmSub($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteUnifiedalarmSubEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消订阅
     * Summary: 批量取消订阅.
     *
     * @param DeleteUnifiedalarmSubRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteUnifiedalarmSubResponse
     */
    public function deleteUnifiedalarmSubEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteUnifiedalarmSubResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.sub.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询告警订阅关系列表
     * Summary: 查询告警订阅关系列表.
     *
     * @param QueryUnifiedalarmSubRequest $request
     *
     * @return QueryUnifiedalarmSubResponse
     */
    public function queryUnifiedalarmSub($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmSubEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询告警订阅关系列表
     * Summary: 查询告警订阅关系列表.
     *
     * @param QueryUnifiedalarmSubRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryUnifiedalarmSubResponse
     */
    public function queryUnifiedalarmSubEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmSubResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.sub.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建告警规则模板
     * Summary: 创建告警规则模板
     *
     * @param CreateUnifiedalarmTplRequest $request
     *
     * @return CreateUnifiedalarmTplResponse
     */
    public function createUnifiedalarmTpl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUnifiedalarmTplEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建告警规则模板
     * Summary: 创建告警规则模板
     *
     * @param CreateUnifiedalarmTplRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateUnifiedalarmTplResponse
     */
    public function createUnifiedalarmTplEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUnifiedalarmTplResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.tpl.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新告警规则模板
     * Summary: 更新告警规则模板
     *
     * @param UpdateUnifiedalarmTplRequest $request
     *
     * @return UpdateUnifiedalarmTplResponse
     */
    public function updateUnifiedalarmTpl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateUnifiedalarmTplEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新告警规则模板
     * Summary: 更新告警规则模板
     *
     * @param UpdateUnifiedalarmTplRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateUnifiedalarmTplResponse
     */
    public function updateUnifiedalarmTplEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateUnifiedalarmTplResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.tpl.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询告警规则模板列表
     * Summary: 查询告警规则模板列表.
     *
     * @param QueryUnifiedalarmTplRequest $request
     *
     * @return QueryUnifiedalarmTplResponse
     */
    public function queryUnifiedalarmTpl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmTplEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询告警规则模板列表
     * Summary: 查询告警规则模板列表.
     *
     * @param QueryUnifiedalarmTplRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryUnifiedalarmTplResponse
     */
    public function queryUnifiedalarmTplEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmTplResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.tpl.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询告警规则模板详情
     * Summary: 查询告警规则模板详情.
     *
     * @param GetUnifiedalarmTplRequest $request
     *
     * @return GetUnifiedalarmTplResponse
     */
    public function getUnifiedalarmTpl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getUnifiedalarmTplEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询告警规则模板详情
     * Summary: 查询告警规则模板详情.
     *
     * @param GetUnifiedalarmTplRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetUnifiedalarmTplResponse
     */
    public function getUnifiedalarmTplEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetUnifiedalarmTplResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.tpl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除告警规则模板
     * Summary: 删除告警规则模板
     *
     * @param DeleteUnifiedalarmTplRequest $request
     *
     * @return DeleteUnifiedalarmTplResponse
     */
    public function deleteUnifiedalarmTpl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteUnifiedalarmTplEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除告警规则模板
     * Summary: 删除告警规则模板
     *
     * @param DeleteUnifiedalarmTplRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteUnifiedalarmTplResponse
     */
    public function deleteUnifiedalarmTplEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteUnifiedalarmTplResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.tpl.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 暂停/开启告警规则
     * Summary: 暂停告警规则.
     *
     * @param SwitchUnifiedalarmRuleRequest $request
     *
     * @return SwitchUnifiedalarmRuleResponse
     */
    public function switchUnifiedalarmRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->switchUnifiedalarmRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 暂停/开启告警规则
     * Summary: 暂停告警规则.
     *
     * @param SwitchUnifiedalarmRuleRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SwitchUnifiedalarmRuleResponse
     */
    public function switchUnifiedalarmRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SwitchUnifiedalarmRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.rule.switch', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据资源类型获取告警订阅列表
     * Summary: 获取告警订阅列表.
     *
     * @param ListAlarmSubscriptionRequest $request
     *
     * @return ListAlarmSubscriptionResponse
     */
    public function listAlarmSubscription($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAlarmSubscriptionEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据资源类型获取告警订阅列表
     * Summary: 获取告警订阅列表.
     *
     * @param ListAlarmSubscriptionRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListAlarmSubscriptionResponse
     */
    public function listAlarmSubscriptionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAlarmSubscriptionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.subscription.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新告警订阅
     * Summary: 更新告警订阅.
     *
     * @param UpdateAlarmSubscriptionRequest $request
     *
     * @return UpdateAlarmSubscriptionResponse
     */
    public function updateAlarmSubscription($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAlarmSubscriptionEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新告警订阅
     * Summary: 更新告警订阅.
     *
     * @param UpdateAlarmSubscriptionRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateAlarmSubscriptionResponse
     */
    public function updateAlarmSubscriptionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAlarmSubscriptionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.subscription.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询 custom plugin 列表
     * Summary: 查询 custom plugin 列表.
     *
     * @param ListCustompluginRequest $request
     *
     * @return ListCustompluginResponse
     */
    public function listCustomplugin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCustompluginEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询 custom plugin 列表
     * Summary: 查询 custom plugin 列表.
     *
     * @param ListCustompluginRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListCustompluginResponse
     */
    public function listCustompluginEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCustompluginResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.customplugin.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询事件列表
     * Summary: 查询事件列表.
     *
     * @param QueryUnifiedalarmEventRequest $request
     *
     * @return QueryUnifiedalarmEventResponse
     */
    public function queryUnifiedalarmEvent($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmEventEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询事件列表
     * Summary: 查询事件列表.
     *
     * @param QueryUnifiedalarmEventRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryUnifiedalarmEventResponse
     */
    public function queryUnifiedalarmEventEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmEventResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.event.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 告警指标查询
     * Summary: 告警指标查询.
     *
     * @param QueryUnifiedalarmMetricsRequest $request
     *
     * @return QueryUnifiedalarmMetricsResponse
     */
    public function queryUnifiedalarmMetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmMetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 告警指标查询
     * Summary: 告警指标查询.
     *
     * @param QueryUnifiedalarmMetricsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryUnifiedalarmMetricsResponse
     */
    public function queryUnifiedalarmMetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmMetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.metrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建告警历史
     * Summary: 批量创建告警历史.
     *
     * @param BatchcreateUnifiedalarmHistoryRequest $request
     *
     * @return BatchcreateUnifiedalarmHistoryResponse
     */
    public function batchcreateUnifiedalarmHistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateUnifiedalarmHistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建告警历史
     * Summary: 批量创建告警历史.
     *
     * @param BatchcreateUnifiedalarmHistoryRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return BatchcreateUnifiedalarmHistoryResponse
     */
    public function batchcreateUnifiedalarmHistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateUnifiedalarmHistoryResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.history.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据模板批量创建规则
     * Summary: 根据模板批量创建规则.
     *
     * @param BatchcreateUnifiedalarmRuleRequest $request
     *
     * @return BatchcreateUnifiedalarmRuleResponse
     */
    public function batchcreateUnifiedalarmRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateUnifiedalarmRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据模板批量创建规则
     * Summary: 根据模板批量创建规则.
     *
     * @param BatchcreateUnifiedalarmRuleRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return BatchcreateUnifiedalarmRuleResponse
     */
    public function batchcreateUnifiedalarmRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateUnifiedalarmRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.rule.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 告警事件统计信息
     * Summary: 告警事件统计信息.
     *
     * @param QueryUnifiedalarmEventstatRequest $request
     *
     * @return QueryUnifiedalarmEventstatResponse
     */
    public function queryUnifiedalarmEventstat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmEventstatEx($request, $headers, $runtime);
    }

    /**
     * Description: 告警事件统计信息
     * Summary: 告警事件统计信息.
     *
     * @param QueryUnifiedalarmEventstatRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryUnifiedalarmEventstatResponse
     */
    public function queryUnifiedalarmEventstatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmEventstatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.eventstat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通知历史统计
     * Summary: 通知历史统计
     *
     * @param QueryUnifiedalarmNotifystatRequest $request
     *
     * @return QueryUnifiedalarmNotifystatResponse
     */
    public function queryUnifiedalarmNotifystat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmNotifystatEx($request, $headers, $runtime);
    }

    /**
     * Description: 通知历史统计
     * Summary: 通知历史统计
     *
     * @param QueryUnifiedalarmNotifystatRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryUnifiedalarmNotifystatResponse
     */
    public function queryUnifiedalarmNotifystatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmNotifystatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.notifystat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询主机ip列表
     * Summary: 查询主机ip列表.
     *
     * @param QueryMetaNodeRequest $request
     *
     * @return QueryMetaNodeResponse
     */
    public function queryMetaNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetaNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询主机ip列表
     * Summary: 查询主机ip列表.
     *
     * @param QueryMetaNodeRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryMetaNodeResponse
     */
    public function queryMetaNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetaNodeResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.meta.node.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除告警规则
     * Summary: 批量删除告警规则.
     *
     * @param BatchdeleteUnifiedalarmRuleRequest $request
     *
     * @return BatchdeleteUnifiedalarmRuleResponse
     */
    public function batchdeleteUnifiedalarmRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteUnifiedalarmRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除告警规则
     * Summary: 批量删除告警规则.
     *
     * @param BatchdeleteUnifiedalarmRuleRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return BatchdeleteUnifiedalarmRuleResponse
     */
    public function batchdeleteUnifiedalarmRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteUnifiedalarmRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.rule.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dashboard创建
     * Summary: dashboard创建.
     *
     * @param CreateXdashboardRequest $request
     *
     * @return CreateXdashboardResponse
     */
    public function createXdashboard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createXdashboardEx($request, $headers, $runtime);
    }

    /**
     * Description: dashboard创建
     * Summary: dashboard创建.
     *
     * @param CreateXdashboardRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateXdashboardResponse
     */
    public function createXdashboardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateXdashboardResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdashboard.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dashboard更新
     * Summary: dashboard更新.
     *
     * @param UpdateXdashboardRequest $request
     *
     * @return UpdateXdashboardResponse
     */
    public function updateXdashboard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateXdashboardEx($request, $headers, $runtime);
    }

    /**
     * Description: dashboard更新
     * Summary: dashboard更新.
     *
     * @param UpdateXdashboardRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateXdashboardResponse
     */
    public function updateXdashboardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateXdashboardResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdashboard.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dashboard查询
     * Summary: dashboard查询.
     *
     * @param QueryXdashboardRequest $request
     *
     * @return QueryXdashboardResponse
     */
    public function queryXdashboard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXdashboardEx($request, $headers, $runtime);
    }

    /**
     * Description: dashboard查询
     * Summary: dashboard查询.
     *
     * @param QueryXdashboardRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryXdashboardResponse
     */
    public function queryXdashboardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXdashboardResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdashboard.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dashboard目录列表
     * Summary: dashboard目录列表.
     *
     * @param ListXdashboardDirectoryRequest $request
     *
     * @return ListXdashboardDirectoryResponse
     */
    public function listXdashboardDirectory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listXdashboardDirectoryEx($request, $headers, $runtime);
    }

    /**
     * Description: dashboard目录列表
     * Summary: dashboard目录列表.
     *
     * @param ListXdashboardDirectoryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListXdashboardDirectoryResponse
     */
    public function listXdashboardDirectoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListXdashboardDirectoryResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdashboard.directory.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: dashboard删除。
     * 单个dashboard删除或者整个目录删除
     * Summary: dashboard删除.
     *
     * @param DeleteXdashboardRequest $request
     *
     * @return DeleteXdashboardResponse
     */
    public function deleteXdashboard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteXdashboardEx($request, $headers, $runtime);
    }

    /**
     * Description: dashboard删除。
     * 单个dashboard删除或者整个目录删除
     * Summary: dashboard删除.
     *
     * @param DeleteXdashboardRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteXdashboardResponse
     */
    public function deleteXdashboardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteXdashboardResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdashboard.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: instant query
     * Summary: instant query.
     *
     * @param QueryXmetricInstantRequest $request
     *
     * @return QueryXmetricInstantResponse
     */
    public function queryXmetricInstant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXmetricInstantEx($request, $headers, $runtime);
    }

    /**
     * Description: instant query
     * Summary: instant query.
     *
     * @param QueryXmetricInstantRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryXmetricInstantResponse
     */
    public function queryXmetricInstantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXmetricInstantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xmetric.instant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: range query
     * Summary: range query.
     *
     * @param QueryXmetricRangeRequest $request
     *
     * @return QueryXmetricRangeResponse
     */
    public function queryXmetricRange($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXmetricRangeEx($request, $headers, $runtime);
    }

    /**
     * Description: range query
     * Summary: range query.
     *
     * @param QueryXmetricRangeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryXmetricRangeResponse
     */
    public function queryXmetricRangeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXmetricRangeResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xmetric.range.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: datasource metric
     * Summary: datasource metric.
     *
     * @param QueryXmetricdatasourceInstantRequest $request
     *
     * @return QueryXmetricdatasourceInstantResponse
     */
    public function queryXmetricdatasourceInstant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXmetricdatasourceInstantEx($request, $headers, $runtime);
    }

    /**
     * Description: datasource metric
     * Summary: datasource metric.
     *
     * @param QueryXmetricdatasourceInstantRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryXmetricdatasourceInstantResponse
     */
    public function queryXmetricdatasourceInstantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXmetricdatasourceInstantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xmetricdatasource.instant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: datasource metric
     * Summary: datasource metric.
     *
     * @param QueryXmetricdatasourceRangeRequest $request
     *
     * @return QueryXmetricdatasourceRangeResponse
     */
    public function queryXmetricdatasourceRange($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXmetricdatasourceRangeEx($request, $headers, $runtime);
    }

    /**
     * Description: datasource metric
     * Summary: datasource metric.
     *
     * @param QueryXmetricdatasourceRangeRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryXmetricdatasourceRangeResponse
     */
    public function queryXmetricdatasourceRangeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXmetricdatasourceRangeResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xmetricdatasource.range.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: metric tag keys
     * Summary: metric tag keys.
     *
     * @param QueryXmetrictagKeyRequest $request
     *
     * @return QueryXmetrictagKeyResponse
     */
    public function queryXmetrictagKey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXmetrictagKeyEx($request, $headers, $runtime);
    }

    /**
     * Description: metric tag keys
     * Summary: metric tag keys.
     *
     * @param QueryXmetrictagKeyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryXmetrictagKeyResponse
     */
    public function queryXmetrictagKeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXmetrictagKeyResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xmetrictag.key.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: metric tag values
     * Summary: metric tag values.
     *
     * @param QueryXmetrictagValueRequest $request
     *
     * @return QueryXmetrictagValueResponse
     */
    public function queryXmetrictagValue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXmetrictagValueEx($request, $headers, $runtime);
    }

    /**
     * Description: metric tag values
     * Summary: metric tag values.
     *
     * @param QueryXmetrictagValueRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryXmetrictagValueResponse
     */
    public function queryXmetrictagValueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXmetrictagValueResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xmetrictag.value.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 日志脱敏类型列表查询
     * Summary: 日志脱敏类型列表查询.
     *
     * @param ListLogserviceDesenstypesRequest $request
     *
     * @return ListLogserviceDesenstypesResponse
     */
    public function listLogserviceDesenstypes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listLogserviceDesenstypesEx($request, $headers, $runtime);
    }

    /**
     * Description: 日志脱敏类型列表查询
     * Summary: 日志脱敏类型列表查询.
     *
     * @param ListLogserviceDesenstypesRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListLogserviceDesenstypesResponse
     */
    public function listLogserviceDesenstypesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListLogserviceDesenstypesResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.logservice.desenstypes.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 日志脱敏配置查询
     * Summary: 日志脱敏配置查询.
     *
     * @param GetLogserviceDesensconfigRequest $request
     *
     * @return GetLogserviceDesensconfigResponse
     */
    public function getLogserviceDesensconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLogserviceDesensconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 日志脱敏配置查询
     * Summary: 日志脱敏配置查询.
     *
     * @param GetLogserviceDesensconfigRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetLogserviceDesensconfigResponse
     */
    public function getLogserviceDesensconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLogserviceDesensconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.logservice.desensconfig.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 日志脱敏配置更新
     * Summary: 日志脱敏配置更新.
     *
     * @param UpdateLogserviceDesensconfigRequest $request
     *
     * @return UpdateLogserviceDesensconfigResponse
     */
    public function updateLogserviceDesensconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLogserviceDesensconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 日志脱敏配置更新
     * Summary: 日志脱敏配置更新.
     *
     * @param UpdateLogserviceDesensconfigRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateLogserviceDesensconfigResponse
     */
    public function updateLogserviceDesensconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLogserviceDesensconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.logservice.desensconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取登录用户信息
     * Summary: 获取登录用户信息.
     *
     * @param DetailUserRequest $request
     *
     * @return DetailUserResponse
     */
    public function detailUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取登录用户信息
     * Summary: 获取登录用户信息.
     *
     * @param DetailUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return DetailUserResponse
     */
    public function detailUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailUserResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.user.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过登录名获取鉴权
     * Summary: 通过登录名获取鉴权.
     *
     * @param AuthUserRequest $request
     *
     * @return AuthUserResponse
     */
    public function authUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过登录名获取鉴权
     * Summary: 通过登录名获取鉴权.
     *
     * @param AuthUserRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return AuthUserResponse
     */
    public function authUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthUserResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.user.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取持久化日志路径级别的监控数据
     * Summary: 持久化日志监控.
     *
     * @param QueryLogpathMetricsRequest $request
     *
     * @return QueryLogpathMetricsResponse
     */
    public function queryLogpathMetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLogpathMetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取持久化日志路径级别的监控数据
     * Summary: 持久化日志监控.
     *
     * @param QueryLogpathMetricsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryLogpathMetricsResponse
     */
    public function queryLogpathMetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLogpathMetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.logpath.metrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query metric names
     * Summary: query metric names.
     *
     * @param QueryXmetricNameRequest $request
     *
     * @return QueryXmetricNameResponse
     */
    public function queryXmetricName($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXmetricNameEx($request, $headers, $runtime);
    }

    /**
     * Description: query metric names
     * Summary: query metric names.
     *
     * @param QueryXmetricNameRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryXmetricNameResponse
     */
    public function queryXmetricNameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXmetricNameResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xmetric.name.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建alarmwebhook
     * Summary: 创建alarmwebhook.
     *
     * @param CreateAlarmwebhookRequest $request
     *
     * @return CreateAlarmwebhookResponse
     */
    public function createAlarmwebhook($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAlarmwebhookEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建alarmwebhook
     * Summary: 创建alarmwebhook.
     *
     * @param CreateAlarmwebhookRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateAlarmwebhookResponse
     */
    public function createAlarmwebhookEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAlarmwebhookResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarmwebhook.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: datasource 创建
     * Summary: datasource 创建.
     *
     * @param CreateXdatasourceRequest $request
     *
     * @return CreateXdatasourceResponse
     */
    public function createXdatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createXdatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: datasource 创建
     * Summary: datasource 创建.
     *
     * @param CreateXdatasourceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateXdatasourceResponse
     */
    public function createXdatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateXdatasourceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: datasource update.
     *
     * @param UpdateXdatasourceRequest $request
     *
     * @return UpdateXdatasourceResponse
     */
    public function updateXdatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateXdatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: datasource update.
     *
     * @param UpdateXdatasourceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateXdatasourceResponse
     */
    public function updateXdatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateXdatasourceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary:.
     *
     * @param GetXdatasourceRequest $request
     *
     * @return GetXdatasourceResponse
     */
    public function getXdatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getXdatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary:.
     *
     * @param GetXdatasourceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetXdatasourceResponse
     */
    public function getXdatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetXdatasourceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary:.
     *
     * @param DeleteXdatasourceRequest $request
     *
     * @return DeleteXdatasourceResponse
     */
    public function deleteXdatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteXdatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary:.
     *
     * @param DeleteXdatasourceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteXdatasourceResponse
     */
    public function deleteXdatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteXdatasourceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary:.
     *
     * @param ListXdatasourceDirectoryRequest $request
     *
     * @return ListXdatasourceDirectoryResponse
     */
    public function listXdatasourceDirectory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listXdatasourceDirectoryEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary:.
     *
     * @param ListXdatasourceDirectoryRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListXdatasourceDirectoryResponse
     */
    public function listXdatasourceDirectoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListXdatasourceDirectoryResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.directory.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新alarmwebhook
     * Summary: 更新alarmwebhook.
     *
     * @param UpdateAlarmwebhookRequest $request
     *
     * @return UpdateAlarmwebhookResponse
     */
    public function updateAlarmwebhook($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAlarmwebhookEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新alarmwebhook
     * Summary: 更新alarmwebhook.
     *
     * @param UpdateAlarmwebhookRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateAlarmwebhookResponse
     */
    public function updateAlarmwebhookEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAlarmwebhookResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarmwebhook.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除alarmwebhook
     * Summary: 删除alarmwebhook.
     *
     * @param DeleteAlarmwebhookRequest $request
     *
     * @return DeleteAlarmwebhookResponse
     */
    public function deleteAlarmwebhook($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAlarmwebhookEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除alarmwebhook
     * Summary: 删除alarmwebhook.
     *
     * @param DeleteAlarmwebhookRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteAlarmwebhookResponse
     */
    public function deleteAlarmwebhookEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAlarmwebhookResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarmwebhook.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: datasource table
     * Summary: datasource table.
     *
     * @param QueryXdatasourceTableRequest $request
     *
     * @return QueryXdatasourceTableResponse
     */
    public function queryXdatasourceTable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXdatasourceTableEx($request, $headers, $runtime);
    }

    /**
     * Description: datasource table
     * Summary: datasource table.
     *
     * @param QueryXdatasourceTableRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryXdatasourceTableResponse
     */
    public function queryXdatasourceTableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXdatasourceTableResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.table.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 告警总览
     * Summary: 告警总览.
     *
     * @param GetAlarmOverviewRequest $request
     *
     * @return GetAlarmOverviewResponse
     */
    public function getAlarmOverview($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAlarmOverviewEx($request, $headers, $runtime);
    }

    /**
     * Description: 告警总览
     * Summary: 告警总览.
     *
     * @param GetAlarmOverviewRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetAlarmOverviewResponse
     */
    public function getAlarmOverviewEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAlarmOverviewResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.overview.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的告警数据
     * Summary: 查询应用的告警数据.
     *
     * @param QueryAppAlarmstatsRequest $request
     *
     * @return QueryAppAlarmstatsResponse
     */
    public function queryAppAlarmstats($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAppAlarmstatsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的告警数据
     * Summary: 查询应用的告警数据.
     *
     * @param QueryAppAlarmstatsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryAppAlarmstatsResponse
     */
    public function queryAppAlarmstatsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAppAlarmstatsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.app.alarmstats.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 告警趋势
     * Summary: 告警趋势
     *
     * @param QueryAlarmhistoryAlarmtrendsRequest $request
     *
     * @return QueryAlarmhistoryAlarmtrendsResponse
     */
    public function queryAlarmhistoryAlarmtrends($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlarmhistoryAlarmtrendsEx($request, $headers, $runtime);
    }

    /**
     * Description: 告警趋势
     * Summary: 告警趋势
     *
     * @param QueryAlarmhistoryAlarmtrendsRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryAlarmhistoryAlarmtrendsResponse
     */
    public function queryAlarmhistoryAlarmtrendsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlarmhistoryAlarmtrendsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarmhistory.alarmtrends.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取workspace的配置
     * Summary: 获取workspace的配置.
     *
     * @param GetWorkspaceConfigRequest $request
     *
     * @return GetWorkspaceConfigResponse
     */
    public function getWorkspaceConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getWorkspaceConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取workspace的配置
     * Summary: 获取workspace的配置.
     *
     * @param GetWorkspaceConfigRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetWorkspaceConfigResponse
     */
    public function getWorkspaceConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetWorkspaceConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.workspace.config.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Agent版本策略配置
     * Summary: Agent版本策略配置.
     *
     * @param SetAgentVersionstrategyRequest $request
     *
     * @return SetAgentVersionstrategyResponse
     */
    public function setAgentVersionstrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setAgentVersionstrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: Agent版本策略配置
     * Summary: Agent版本策略配置.
     *
     * @param SetAgentVersionstrategyRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SetAgentVersionstrategyResponse
     */
    public function setAgentVersionstrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetAgentVersionstrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.agent.versionstrategy.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取agent版本策略详情
     * Summary: 获取agent版本策略详情.
     *
     * @param GetAgentVersionstrategyRequest $request
     *
     * @return GetAgentVersionstrategyResponse
     */
    public function getAgentVersionstrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAgentVersionstrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取agent版本策略详情
     * Summary: 获取agent版本策略详情.
     *
     * @param GetAgentVersionstrategyRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetAgentVersionstrategyResponse
     */
    public function getAgentVersionstrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAgentVersionstrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.agent.versionstrategy.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取服务器系统时间
     * Summary: 获取服务器系统时间.
     *
     * @param GetSystemTimeRequest $request
     *
     * @return GetSystemTimeResponse
     */
    public function getSystemTime($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSystemTimeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取服务器系统时间
     * Summary: 获取服务器系统时间.
     *
     * @param GetSystemTimeRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetSystemTimeResponse
     */
    public function getSystemTimeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSystemTimeResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.system.time.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: move datasource
     * Summary: move datasource.
     *
     * @param ExecXdatasourceMoveRequest $request
     *
     * @return ExecXdatasourceMoveResponse
     */
    public function execXdatasourceMove($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execXdatasourceMoveEx($request, $headers, $runtime);
    }

    /**
     * Description: move datasource
     * Summary: move datasource.
     *
     * @param ExecXdatasourceMoveRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecXdatasourceMoveResponse
     */
    public function execXdatasourceMoveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecXdatasourceMoveResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.move.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: metadata default tags
     * Summary: default tags.
     *
     * @param QueryXmetadataTagRequest $request
     *
     * @return QueryXmetadataTagResponse
     */
    public function queryXmetadataTag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXmetadataTagEx($request, $headers, $runtime);
    }

    /**
     * Description: metadata default tags
     * Summary: default tags.
     *
     * @param QueryXmetadataTagRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryXmetadataTagResponse
     */
    public function queryXmetadataTagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXmetadataTagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xmetadata.tag.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: search datasource
     * Summary: search datasource.
     *
     * @param QueryXdatasourceSearchRequest $request
     *
     * @return QueryXdatasourceSearchResponse
     */
    public function queryXdatasourceSearch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXdatasourceSearchEx($request, $headers, $runtime);
    }

    /**
     * Description: search datasource
     * Summary: search datasource.
     *
     * @param QueryXdatasourceSearchRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryXdatasourceSearchResponse
     */
    public function queryXdatasourceSearchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXdatasourceSearchResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.search.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: query setup config.
     *
     * @param QuerySetupConfigRequest $request
     *
     * @return QuerySetupConfigResponse
     */
    public function querySetupConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySetupConfigEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: query setup config.
     *
     * @param QuerySetupConfigRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QuerySetupConfigResponse
     */
    public function querySetupConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySetupConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.setup.config.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: update or insert.
     *
     * @param UpdateSetupConfigRequest $request
     *
     * @return UpdateSetupConfigResponse
     */
    public function updateSetupConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSetupConfigEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: update or insert.
     *
     * @param UpdateSetupConfigRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateSetupConfigResponse
     */
    public function updateSetupConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSetupConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.setup.config.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: delete config.
     *
     * @param DeleteSetupConfigRequest $request
     *
     * @return DeleteSetupConfigResponse
     */
    public function deleteSetupConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSetupConfigEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: delete config.
     *
     * @param DeleteSetupConfigRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteSetupConfigResponse
     */
    public function deleteSetupConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSetupConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.setup.config.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 告警开关配置更新
     * Summary: 告警开关配置更新.
     *
     * @param UpdateWorkspaceSettingRequest $request
     *
     * @return UpdateWorkspaceSettingResponse
     */
    public function updateWorkspaceSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateWorkspaceSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 告警开关配置更新
     * Summary: 告警开关配置更新.
     *
     * @param UpdateWorkspaceSettingRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateWorkspaceSettingResponse
     */
    public function updateWorkspaceSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateWorkspaceSettingResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.workspace.setting.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary:.
     *
     * @param ExportXsiteConfigRequest $request
     *
     * @return ExportXsiteConfigResponse
     */
    public function exportXsiteConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportXsiteConfigEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary:.
     *
     * @param ExportXsiteConfigRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExportXsiteConfigResponse
     */
    public function exportXsiteConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportXsiteConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xsite.config.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: import.
     *
     * @param ImportXsiteConfigRequest $request
     *
     * @return ImportXsiteConfigResponse
     */
    public function importXsiteConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importXsiteConfigEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: import.
     *
     * @param ImportXsiteConfigRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ImportXsiteConfigResponse
     */
    public function importXsiteConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportXsiteConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xsite.config.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: tree.
     *
     * @param QueryXdatasourceTreeRequest $request
     *
     * @return QueryXdatasourceTreeResponse
     */
    public function queryXdatasourceTree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXdatasourceTreeEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: tree.
     *
     * @param QueryXdatasourceTreeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryXdatasourceTreeResponse
     */
    public function queryXdatasourceTreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXdatasourceTreeResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.tree.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary:.
     *
     * @param QueryXdashboardTreeRequest $request
     *
     * @return QueryXdashboardTreeResponse
     */
    public function queryXdashboardTree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXdashboardTreeEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary:.
     *
     * @param QueryXdashboardTreeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryXdashboardTreeResponse
     */
    public function queryXdashboardTreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXdashboardTreeResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdashboard.tree.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: dashboard查询.
     *
     * @param GetXdashboardRequest $request
     *
     * @return GetXdashboardResponse
     */
    public function getXdashboard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getXdashboardEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: dashboard查询.
     *
     * @param GetXdashboardRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetXdashboardResponse
     */
    public function getXdashboardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetXdashboardResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdashboard.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: prometheus metrics.
     *
     * @param QueryXdatasourcePrometheusRequest $request
     *
     * @return QueryXdatasourcePrometheusResponse
     */
    public function queryXdatasourcePrometheus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXdatasourcePrometheusEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: prometheus metrics.
     *
     * @param QueryXdatasourcePrometheusRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryXdatasourcePrometheusResponse
     */
    public function queryXdatasourcePrometheusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXdatasourcePrometheusResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xdatasource.prometheus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  获取总览页主机统计信息
     * Summary:  获取总览页主机统计信息.
     *
     * @param GetNodeOverviewRequest $request
     *
     * @return GetNodeOverviewResponse
     */
    public function getNodeOverview($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getNodeOverviewEx($request, $headers, $runtime);
    }

    /**
     * Description:  获取总览页主机统计信息
     * Summary:  获取总览页主机统计信息.
     *
     * @param GetNodeOverviewRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetNodeOverviewResponse
     */
    public function getNodeOverviewEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetNodeOverviewResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.node.overview.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 总览页配置信息统计
     * Summary: 总览页配置信息统计
     *
     * @param GetConfigOverviewRequest $request
     *
     * @return GetConfigOverviewResponse
     */
    public function getConfigOverview($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getConfigOverviewEx($request, $headers, $runtime);
    }

    /**
     * Description: 总览页配置信息统计
     * Summary: 总览页配置信息统计
     *
     * @param GetConfigOverviewRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetConfigOverviewResponse
     */
    public function getConfigOverviewEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetConfigOverviewResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.config.overview.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取workspace具体配置
     * Summary: 获取workspace具体配置.
     *
     * @param GetWorkspaceSettingRequest $request
     *
     * @return GetWorkspaceSettingResponse
     */
    public function getWorkspaceSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getWorkspaceSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取workspace具体配置
     * Summary: 获取workspace具体配置.
     *
     * @param GetWorkspaceSettingRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetWorkspaceSettingResponse
     */
    public function getWorkspaceSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetWorkspaceSettingResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.workspace.setting.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取链路工作空间配置
     * Summary: 获取链路工作空间配置.
     *
     * @param ListTraceWorkspacesettingRequest $request
     *
     * @return ListTraceWorkspacesettingResponse
     */
    public function listTraceWorkspacesetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listTraceWorkspacesettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取链路工作空间配置
     * Summary: 获取链路工作空间配置.
     *
     * @param ListTraceWorkspacesettingRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListTraceWorkspacesettingResponse
     */
    public function listTraceWorkspacesettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListTraceWorkspacesettingResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.workspacesetting.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链路工作空间配置更新
     * Summary: 链路工作空间配置更新.
     *
     * @param UpdateTraceWorkspacesettingRequest $request
     *
     * @return UpdateTraceWorkspacesettingResponse
     */
    public function updateTraceWorkspacesetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraceWorkspacesettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 链路工作空间配置更新
     * Summary: 链路工作空间配置更新.
     *
     * @param UpdateTraceWorkspacesettingRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateTraceWorkspacesettingResponse
     */
    public function updateTraceWorkspacesettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraceWorkspacesettingResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.workspacesetting.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: APP配置列表
     * Summary: APP配置列表.
     *
     * @param ListAppSettingRequest $request
     *
     * @return ListAppSettingResponse
     */
    public function listAppSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: APP配置列表
     * Summary: APP配置列表.
     *
     * @param ListAppSettingRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListAppSettingResponse
     */
    public function listAppSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppSettingResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.app.setting.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建APP配置信息
     * Summary: 创建APP配置信息.
     *
     * @param UpdateAppSettingRequest $request
     *
     * @return UpdateAppSettingResponse
     */
    public function updateAppSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAppSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建APP配置信息
     * Summary: 创建APP配置信息.
     *
     * @param UpdateAppSettingRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateAppSettingResponse
     */
    public function updateAppSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAppSettingResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.app.setting.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取APP配置信息
     * Summary: 获取APP配置信息.
     *
     * @param GetAppSettingRequest $request
     *
     * @return GetAppSettingResponse
     */
    public function getAppSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAppSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取APP配置信息
     * Summary: 获取APP配置信息.
     *
     * @param GetAppSettingRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetAppSettingResponse
     */
    public function getAppSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAppSettingResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.app.setting.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询某一告警事件相关的告警列表
     * Summary: 查询某一告警事件相关的告警列表.
     *
     * @param QueryUnifiedalarmEventdetailRequest $request
     *
     * @return QueryUnifiedalarmEventdetailResponse
     */
    public function queryUnifiedalarmEventdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmEventdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询某一告警事件相关的告警列表
     * Summary: 查询某一告警事件相关的告警列表.
     *
     * @param QueryUnifiedalarmEventdetailRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryUnifiedalarmEventdetailResponse
     */
    public function queryUnifiedalarmEventdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmEventdetailResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.eventdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的告警指标清单
     * Summary: 查询应用的告警指标清单.
     *
     * @param QueryUnifiedalarmMonitorlistRequest $request
     *
     * @return QueryUnifiedalarmMonitorlistResponse
     */
    public function queryUnifiedalarmMonitorlist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmMonitorlistEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的告警指标清单
     * Summary: 查询应用的告警指标清单.
     *
     * @param QueryUnifiedalarmMonitorlistRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryUnifiedalarmMonitorlistResponse
     */
    public function queryUnifiedalarmMonitorlistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmMonitorlistResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.monitorlist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary:.
     *
     * @param QueryXmetricTableRequest $request
     *
     * @return QueryXmetricTableResponse
     */
    public function queryXmetricTable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryXmetricTableEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary:.
     *
     * @param QueryXmetricTableRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryXmetricTableResponse
     */
    public function queryXmetricTableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryXmetricTableResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.xmetric.table.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的SQL调用指标
     * Summary: 查询应用的SQL调用指标.
     *
     * @param QueryTraceAppsqlmetricsRequest $request
     *
     * @return QueryTraceAppsqlmetricsResponse
     */
    public function queryTraceAppsqlmetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppsqlmetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的SQL调用指标
     * Summary: 查询应用的SQL调用指标.
     *
     * @param QueryTraceAppsqlmetricsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryTraceAppsqlmetricsResponse
     */
    public function queryTraceAppsqlmetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppsqlmetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appsqlmetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的SQL请求调用明细
     * Summary: 查询应用的SQL请求调用明细.
     *
     * @param QueryTraceAppsqlstatRequest $request
     *
     * @return QueryTraceAppsqlstatResponse
     */
    public function queryTraceAppsqlstat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppsqlstatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的SQL请求调用明细
     * Summary: 查询应用的SQL请求调用明细.
     *
     * @param QueryTraceAppsqlstatRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTraceAppsqlstatResponse
     */
    public function queryTraceAppsqlstatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppsqlstatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appsqlstat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的NoSQL调用指标
     * Summary: 查询应用的NoSQL调用指标.
     *
     * @param QueryTraceAppnosqlmetricsRequest $request
     *
     * @return QueryTraceAppnosqlmetricsResponse
     */
    public function queryTraceAppnosqlmetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppnosqlmetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的NoSQL调用指标
     * Summary: 查询应用的NoSQL调用指标.
     *
     * @param QueryTraceAppnosqlmetricsRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryTraceAppnosqlmetricsResponse
     */
    public function queryTraceAppnosqlmetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppnosqlmetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appnosqlmetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的MQ消费调用指标
     * Summary: 查询应用的MQ消费调用指标.
     *
     * @param QueryTraceAppmqconsumemetricsRequest $request
     *
     * @return QueryTraceAppmqconsumemetricsResponse
     */
    public function queryTraceAppmqconsumemetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppmqconsumemetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的MQ消费调用指标
     * Summary: 查询应用的MQ消费调用指标.
     *
     * @param QueryTraceAppmqconsumemetricsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryTraceAppmqconsumemetricsResponse
     */
    public function queryTraceAppmqconsumemetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppmqconsumemetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appmqconsumemetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的RPC客户端调用指标
     * Summary: 查询应用的RPC客户端调用指标.
     *
     * @param QueryTraceApprpcclientmetricsRequest $request
     *
     * @return QueryTraceApprpcclientmetricsResponse
     */
    public function queryTraceApprpcclientmetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceApprpcclientmetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的RPC客户端调用指标
     * Summary: 查询应用的RPC客户端调用指标.
     *
     * @param QueryTraceApprpcclientmetricsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryTraceApprpcclientmetricsResponse
     */
    public function queryTraceApprpcclientmetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceApprpcclientmetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.apprpcclientmetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的RPC服务端指标
     * Summary:  查询应用的RPC服务端指标.
     *
     * @param QueryTraceApprpcservermetricsRequest $request
     *
     * @return QueryTraceApprpcservermetricsResponse
     */
    public function queryTraceApprpcservermetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceApprpcservermetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的RPC服务端指标
     * Summary:  查询应用的RPC服务端指标.
     *
     * @param QueryTraceApprpcservermetricsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryTraceApprpcservermetricsResponse
     */
    public function queryTraceApprpcservermetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceApprpcservermetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.apprpcservermetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的HTTP客户端调用指标
     * Summary: 查询应用的HTTP客户端调用指标.
     *
     * @param QueryTraceApphttpclientmetricsRequest $request
     *
     * @return QueryTraceApphttpclientmetricsResponse
     */
    public function queryTraceApphttpclientmetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceApphttpclientmetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的HTTP客户端调用指标
     * Summary: 查询应用的HTTP客户端调用指标.
     *
     * @param QueryTraceApphttpclientmetricsRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryTraceApphttpclientmetricsResponse
     */
    public function queryTraceApphttpclientmetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceApphttpclientmetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.apphttpclientmetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的HTTP服务端指标
     * Summary: 查询应用的HTTP服务端指标.
     *
     * @param QueryTraceApphttpservermetricsRequest $request
     *
     * @return QueryTraceApphttpservermetricsResponse
     */
    public function queryTraceApphttpservermetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceApphttpservermetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的HTTP服务端指标
     * Summary: 查询应用的HTTP服务端指标.
     *
     * @param QueryTraceApphttpservermetricsRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryTraceApphttpservermetricsResponse
     */
    public function queryTraceApphttpservermetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceApphttpservermetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.apphttpservermetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的NoSQL请求调用明细
     * Summary: 查询应用的NoSQL请求调用明细.
     *
     * @param QueryTraceAppnosqlstatRequest $request
     *
     * @return QueryTraceAppnosqlstatResponse
     */
    public function queryTraceAppnosqlstat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppnosqlstatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的NoSQL请求调用明细
     * Summary: 查询应用的NoSQL请求调用明细.
     *
     * @param QueryTraceAppnosqlstatRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryTraceAppnosqlstatResponse
     */
    public function queryTraceAppnosqlstatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppnosqlstatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appnosqlstat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的MQ消费调用明细
     * Summary: 查询应用的MQ消费调用明细.
     *
     * @param QueryTraceAppmqconsumestatRequest $request
     *
     * @return QueryTraceAppmqconsumestatResponse
     */
    public function queryTraceAppmqconsumestat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppmqconsumestatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的MQ消费调用明细
     * Summary: 查询应用的MQ消费调用明细.
     *
     * @param QueryTraceAppmqconsumestatRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryTraceAppmqconsumestatResponse
     */
    public function queryTraceAppmqconsumestatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppmqconsumestatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appmqconsumestat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的HTTP客户端请求调用明细
     * Summary: 查询应用的HTTP客户端请求调用明细.
     *
     * @param QueryTraceApphttpclientstatRequest $request
     *
     * @return QueryTraceApphttpclientstatResponse
     */
    public function queryTraceApphttpclientstat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceApphttpclientstatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的HTTP客户端请求调用明细
     * Summary: 查询应用的HTTP客户端请求调用明细.
     *
     * @param QueryTraceApphttpclientstatRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryTraceApphttpclientstatResponse
     */
    public function queryTraceApphttpclientstatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceApphttpclientstatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.apphttpclientstat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的HTTP服务端调用明细
     * Summary: 查询应用的HTTP服务端调用明细.
     *
     * @param QueryTraceApphttpserverstatRequest $request
     *
     * @return QueryTraceApphttpserverstatResponse
     */
    public function queryTraceApphttpserverstat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceApphttpserverstatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的HTTP服务端调用明细
     * Summary: 查询应用的HTTP服务端调用明细.
     *
     * @param QueryTraceApphttpserverstatRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryTraceApphttpserverstatResponse
     */
    public function queryTraceApphttpserverstatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceApphttpserverstatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.apphttpserverstat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的RPC客户端请求调用明细
     * Summary: 查询应用的RPC客户端请求调用明细.
     *
     * @param QueryTraceApprpcclientstatRequest $request
     *
     * @return QueryTraceApprpcclientstatResponse
     */
    public function queryTraceApprpcclientstat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceApprpcclientstatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的RPC客户端请求调用明细
     * Summary: 查询应用的RPC客户端请求调用明细.
     *
     * @param QueryTraceApprpcclientstatRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryTraceApprpcclientstatResponse
     */
    public function queryTraceApprpcclientstatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceApprpcclientstatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.apprpcclientstat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的RPC服务端调用明细
     * Summary: 查询应用的RPC服务端调用明细.
     *
     * @param QueryTraceApprpcserverstatRequest $request
     *
     * @return QueryTraceApprpcserverstatResponse
     */
    public function queryTraceApprpcserverstat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceApprpcserverstatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的RPC服务端调用明细
     * Summary: 查询应用的RPC服务端调用明细.
     *
     * @param QueryTraceApprpcserverstatRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryTraceApprpcserverstatResponse
     */
    public function queryTraceApprpcserverstatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceApprpcserverstatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.apprpcserverstat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取链路单工作空间配置
     * Summary: 获取链路单工作空间配置.
     *
     * @param GetTraceWorkspacesettingRequest $request
     *
     * @return GetTraceWorkspacesettingResponse
     */
    public function getTraceWorkspacesetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraceWorkspacesettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取链路单工作空间配置
     * Summary: 获取链路单工作空间配置.
     *
     * @param GetTraceWorkspacesettingRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetTraceWorkspacesettingResponse
     */
    public function getTraceWorkspacesettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraceWorkspacesettingResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.workspacesetting.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的MQ生产调用指标
     * Summary: 查询应用的MQ生产调用指标.
     *
     * @param QueryTraceAppmqproducemetricsRequest $request
     *
     * @return QueryTraceAppmqproducemetricsResponse
     */
    public function queryTraceAppmqproducemetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppmqproducemetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的MQ生产调用指标
     * Summary: 查询应用的MQ生产调用指标.
     *
     * @param QueryTraceAppmqproducemetricsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryTraceAppmqproducemetricsResponse
     */
    public function queryTraceAppmqproducemetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppmqproducemetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appmqproducemetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的MQ生产调用明细
     * Summary: 查询应用的MQ生产调用明细.
     *
     * @param QueryTraceAppmqproducestatRequest $request
     *
     * @return QueryTraceAppmqproducestatResponse
     */
    public function queryTraceAppmqproducestat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppmqproducestatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的MQ生产调用明细
     * Summary: 查询应用的MQ生产调用明细.
     *
     * @param QueryTraceAppmqproducestatRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryTraceAppmqproducestatResponse
     */
    public function queryTraceAppmqproducestatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppmqproducestatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appmqproducestat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 计量计费是否开启
     * Summary: 计量计费是否开启.
     *
     * @param GetMeasurementStatusRequest $request
     *
     * @return GetMeasurementStatusResponse
     */
    public function getMeasurementStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMeasurementStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 计量计费是否开启
     * Summary: 计量计费是否开启.
     *
     * @param GetMeasurementStatusRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetMeasurementStatusResponse
     */
    public function getMeasurementStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMeasurementStatusResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.measurement.status.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 日志查询页面获取应用列表
     * Summary: 获取应用列表.
     *
     * @param QueryLogserviceAppsRequest $request
     *
     * @return QueryLogserviceAppsResponse
     */
    public function queryLogserviceApps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLogserviceAppsEx($request, $headers, $runtime);
    }

    /**
     * Description: 日志查询页面获取应用列表
     * Summary: 获取应用列表.
     *
     * @param QueryLogserviceAppsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryLogserviceAppsResponse
     */
    public function queryLogserviceAppsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLogserviceAppsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.logservice.apps.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的HTTP服务端状态指标
     * Summary: 查询应用的HTTP服务端状态指标.
     *
     * @param QueryTraceApphttpserverstatusmetricsRequest $request
     *
     * @return QueryTraceApphttpserverstatusmetricsResponse
     */
    public function queryTraceApphttpserverstatusmetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceApphttpserverstatusmetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的HTTP服务端状态指标
     * Summary: 查询应用的HTTP服务端状态指标.
     *
     * @param QueryTraceApphttpserverstatusmetricsRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return QueryTraceApphttpserverstatusmetricsResponse
     */
    public function queryTraceApphttpserverstatusmetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceApphttpserverstatusmetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.apphttpserverstatusmetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的告警指标，或应用已经配置。
     * Summary: 查询应用的告警指标清单.
     *
     * @param QueryAppAlarmrulesRequest $request
     *
     * @return QueryAppAlarmrulesResponse
     */
    public function queryAppAlarmrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAppAlarmrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的告警指标，或应用已经配置。
     * Summary: 查询应用的告警指标清单.
     *
     * @param QueryAppAlarmrulesRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryAppAlarmrulesResponse
     */
    public function queryAppAlarmrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAppAlarmrulesResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.app.alarmrules.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链路紧凑详情
     * Summary: 查询链路紧凑详情.
     *
     * @param QueryTraceCompactdetailRequest $request
     *
     * @return QueryTraceCompactdetailResponse
     */
    public function queryTraceCompactdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceCompactdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链路紧凑详情
     * Summary: 查询链路紧凑详情.
     *
     * @param QueryTraceCompactdetailRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryTraceCompactdetailResponse
     */
    public function queryTraceCompactdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceCompactdetailResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.compactdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的异常调用指标
     * Summary: 查询应用的异常调用指标.
     *
     * @param QueryTraceAppexceptionmetricsRequest $request
     *
     * @return QueryTraceAppexceptionmetricsResponse
     */
    public function queryTraceAppexceptionmetrics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppexceptionmetricsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的异常调用指标
     * Summary: 查询应用的异常调用指标.
     *
     * @param QueryTraceAppexceptionmetricsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryTraceAppexceptionmetricsResponse
     */
    public function queryTraceAppexceptionmetricsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppexceptionmetricsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appexceptionmetrics.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用的异常请求调用明细
     * Summary: 查询应用的异常请求调用明细.
     *
     * @param QueryTraceAppexceptionstatRequest $request
     *
     * @return QueryTraceAppexceptionstatResponse
     */
    public function queryTraceAppexceptionstat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceAppexceptionstatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用的异常请求调用明细
     * Summary: 查询应用的异常请求调用明细.
     *
     * @param QueryTraceAppexceptionstatRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryTraceAppexceptionstatResponse
     */
    public function queryTraceAppexceptionstatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceAppexceptionstatResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.appexceptionstat.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询告警绑定关系
     * Summary: 罗予.
     *
     * @param QueryUnifiedalarmRulebindingRequest $request
     *
     * @return QueryUnifiedalarmRulebindingResponse
     */
    public function queryUnifiedalarmRulebinding($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedalarmRulebindingEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询告警绑定关系
     * Summary: 罗予.
     *
     * @param QueryUnifiedalarmRulebindingRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryUnifiedalarmRulebindingResponse
     */
    public function queryUnifiedalarmRulebindingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedalarmRulebindingResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.unifiedalarm.rulebinding.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监控数据诊断列表查询
     * Summary: 监控数据诊断列表查询.
     *
     * @param QueryOpsCheckRequest $request
     *
     * @return QueryOpsCheckResponse
     */
    public function queryOpsCheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOpsCheckEx($request, $headers, $runtime);
    }

    /**
     * Description: 监控数据诊断列表查询
     * Summary: 监控数据诊断列表查询.
     *
     * @param QueryOpsCheckRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryOpsCheckResponse
     */
    public function queryOpsCheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOpsCheckResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.ops.check.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用诊断
     * Summary: 应用诊断.
     *
     * @param QueryOpsAppcheckRequest $request
     *
     * @return QueryOpsAppcheckResponse
     */
    public function queryOpsAppcheck($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOpsAppcheckEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用诊断
     * Summary: 应用诊断.
     *
     * @param QueryOpsAppcheckRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryOpsAppcheckResponse
     */
    public function queryOpsAppcheckEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOpsAppcheckResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.ops.appcheck.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加钉钉机器人
     * Summary: 添加钉钉机器人.
     *
     * @param CreateAlarmDingdingrobotRequest $request
     *
     * @return CreateAlarmDingdingrobotResponse
     */
    public function createAlarmDingdingrobot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAlarmDingdingrobotEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加钉钉机器人
     * Summary: 添加钉钉机器人.
     *
     * @param CreateAlarmDingdingrobotRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateAlarmDingdingrobotResponse
     */
    public function createAlarmDingdingrobotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAlarmDingdingrobotResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.dingdingrobot.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询钉钉机器人
     * Summary: 查询钉钉机器人.
     *
     * @param QueryAlarmDingdingrobotRequest $request
     *
     * @return QueryAlarmDingdingrobotResponse
     */
    public function queryAlarmDingdingrobot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlarmDingdingrobotEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询钉钉机器人
     * Summary: 查询钉钉机器人.
     *
     * @param QueryAlarmDingdingrobotRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryAlarmDingdingrobotResponse
     */
    public function queryAlarmDingdingrobotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlarmDingdingrobotResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.dingdingrobot.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除钉钉机器人
     * Summary: 删除钉钉机器人.
     *
     * @param DeleteAlarmDingdingrobotRequest $request
     *
     * @return DeleteAlarmDingdingrobotResponse
     */
    public function deleteAlarmDingdingrobot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAlarmDingdingrobotEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除钉钉机器人
     * Summary: 删除钉钉机器人.
     *
     * @param DeleteAlarmDingdingrobotRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DeleteAlarmDingdingrobotResponse
     */
    public function deleteAlarmDingdingrobotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAlarmDingdingrobotResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.dingdingrobot.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新钉钉机器人
     * Summary: 更新钉钉机器人.
     *
     * @param UpdateAlarmDingdingrobotRequest $request
     *
     * @return UpdateAlarmDingdingrobotResponse
     */
    public function updateAlarmDingdingrobot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAlarmDingdingrobotEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新钉钉机器人
     * Summary: 更新钉钉机器人.
     *
     * @param UpdateAlarmDingdingrobotRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateAlarmDingdingrobotResponse
     */
    public function updateAlarmDingdingrobotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAlarmDingdingrobotResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.alarm.dingdingrobot.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用告警统计
     * Summary: 查询应用告警统计
     *
     * @param QueryAppsAlarmrulecountRequest $request
     *
     * @return QueryAppsAlarmrulecountResponse
     */
    public function queryAppsAlarmrulecount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAppsAlarmrulecountEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用告警统计
     * Summary: 查询应用告警统计
     *
     * @param QueryAppsAlarmrulecountRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryAppsAlarmrulecountResponse
     */
    public function queryAppsAlarmrulecountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAppsAlarmrulecountResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.apps.alarmrulecount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据app维度查询统一告警状态
     * Summary: 根据app维度查询统一告警状态
     *
     * @param QueryAppsUnifiedalarmstatsRequest $request
     *
     * @return QueryAppsUnifiedalarmstatsResponse
     */
    public function queryAppsUnifiedalarmstats($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAppsUnifiedalarmstatsEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据app维度查询统一告警状态
     * Summary: 根据app维度查询统一告警状态
     *
     * @param QueryAppsUnifiedalarmstatsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryAppsUnifiedalarmstatsResponse
     */
    public function queryAppsUnifiedalarmstatsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAppsUnifiedalarmstatsResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.apps.unifiedalarmstats.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开启监控数据诊断告警
     * Summary: 开启监控数据诊断告警.
     *
     * @param SwitchOpsAlarmRequest $request
     *
     * @return SwitchOpsAlarmResponse
     */
    public function switchOpsAlarm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->switchOpsAlarmEx($request, $headers, $runtime);
    }

    /**
     * Description: 开启监控数据诊断告警
     * Summary: 开启监控数据诊断告警.
     *
     * @param SwitchOpsAlarmRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SwitchOpsAlarmResponse
     */
    public function switchOpsAlarmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SwitchOpsAlarmResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.ops.alarm.switch', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有租户
     * Summary: 获取所有租户.
     *
     * @param AllTraasmetaTenantRequest $request
     *
     * @return AllTraasmetaTenantResponse
     */
    public function allTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有租户
     * Summary: 获取所有租户.
     *
     * @param AllTraasmetaTenantRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AllTraasmetaTenantResponse
     */
    public function allTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有region
     * Summary: 获取所有region.
     *
     * @param AllTraasmetaRegionRequest $request
     *
     * @return AllTraasmetaRegionResponse
     */
    public function allTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有region
     * Summary: 获取所有region.
     *
     * @param AllTraasmetaRegionRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AllTraasmetaRegionResponse
     */
    public function allTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租户分页查询
     * Summary: 租户分页查询.
     *
     * @param PagequeryTraasmetaTenantRequest $request
     *
     * @return PagequeryTraasmetaTenantResponse
     */
    public function pagequeryTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 租户分页查询
     * Summary: 租户分页查询.
     *
     * @param PagequeryTraasmetaTenantRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PagequeryTraasmetaTenantResponse
     */
    public function pagequeryTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个租户
     * Summary: 获取单个租户.
     *
     * @param GetTraasmetaTenantRequest $request
     *
     * @return GetTraasmetaTenantResponse
     */
    public function getTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个租户
     * Summary: 获取单个租户.
     *
     * @param GetTraasmetaTenantRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetTraasmetaTenantResponse
     */
    public function getTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租户查询
     * Summary: 租户查询.
     *
     * @param QueryTraasmetaTenantRequest $request
     *
     * @return QueryTraasmetaTenantResponse
     */
    public function queryTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 租户查询
     * Summary: 租户查询.
     *
     * @param QueryTraasmetaTenantRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTraasmetaTenantResponse
     */
    public function queryTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询租户
     * Summary: 批量查询租户.
     *
     * @param BatchqueryTraasmetaTenantRequest $request
     *
     * @return BatchqueryTraasmetaTenantResponse
     */
    public function batchqueryTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询租户
     * Summary: 批量查询租户.
     *
     * @param BatchqueryTraasmetaTenantRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return BatchqueryTraasmetaTenantResponse
     */
    public function batchqueryTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建tenant
     * Summary: 创建tenant.
     *
     * @param CreateTraasmetaTenantRequest $request
     *
     * @return CreateTraasmetaTenantResponse
     */
    public function createTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建tenant
     * Summary: 创建tenant.
     *
     * @param CreateTraasmetaTenantRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateTraasmetaTenantResponse
     */
    public function createTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建租户
     * Summary: 批量创建租户.
     *
     * @param BatchcreateTraasmetaTenantRequest $request
     *
     * @return BatchcreateTraasmetaTenantResponse
     */
    public function batchcreateTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建租户
     * Summary: 批量创建租户.
     *
     * @param BatchcreateTraasmetaTenantRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return BatchcreateTraasmetaTenantResponse
     */
    public function batchcreateTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新租户
     * Summary: 更新租户.
     *
     * @param UpdateTraasmetaTenantRequest $request
     *
     * @return UpdateTraasmetaTenantResponse
     */
    public function updateTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新租户
     * Summary: 更新租户.
     *
     * @param UpdateTraasmetaTenantRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateTraasmetaTenantResponse
     */
    public function updateTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除租户
     * Summary: 删除租户.
     *
     * @param DeleteTraasmetaTenantRequest $request
     *
     * @return DeleteTraasmetaTenantResponse
     */
    public function deleteTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除租户
     * Summary: 删除租户.
     *
     * @param DeleteTraasmetaTenantRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteTraasmetaTenantResponse
     */
    public function deleteTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除租户
     * Summary: 批量删除租户.
     *
     * @param BatchdeleteTraasmetaTenantRequest $request
     *
     * @return BatchdeleteTraasmetaTenantResponse
     */
    public function batchdeleteTraasmetaTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除租户
     * Summary: 批量删除租户.
     *
     * @param BatchdeleteTraasmetaTenantRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return BatchdeleteTraasmetaTenantResponse
     */
    public function batchdeleteTraasmetaTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.tenant.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个地域
     * Summary: 获取单个地域
     *
     * @param GetTraasmetaRegionRequest $request
     *
     * @return GetTraasmetaRegionResponse
     */
    public function getTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个地域
     * Summary: 获取单个地域
     *
     * @param GetTraasmetaRegionRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetTraasmetaRegionResponse
     */
    public function getTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有机房
     * Summary: 获取所有机房
     *
     * @param AllTraasmetaZoneRequest $request
     *
     * @return AllTraasmetaZoneResponse
     */
    public function allTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有机房
     * Summary: 获取所有机房
     *
     * @param AllTraasmetaZoneRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AllTraasmetaZoneResponse
     */
    public function allTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个机房
     * Summary: 获取单个机房
     *
     * @param GetTraasmetaZoneRequest $request
     *
     * @return GetTraasmetaZoneResponse
     */
    public function getTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个机房
     * Summary: 获取单个机房
     *
     * @param GetTraasmetaZoneRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetTraasmetaZoneResponse
     */
    public function getTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个地域
     * Summary: 创建单个地域
     *
     * @param CreateTraasmetaRegionRequest $request
     *
     * @return CreateTraasmetaRegionResponse
     */
    public function createTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个地域
     * Summary: 创建单个地域
     *
     * @param CreateTraasmetaRegionRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateTraasmetaRegionResponse
     */
    public function createTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量修改agent是否开启告警标记
     * Summary: agent批量打标.
     *
     * @param UpdateAgentLabelRequest $request
     *
     * @return UpdateAgentLabelResponse
     */
    public function updateAgentLabel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAgentLabelEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量修改agent是否开启告警标记
     * Summary: agent批量打标.
     *
     * @param UpdateAgentLabelRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateAgentLabelResponse
     */
    public function updateAgentLabelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAgentLabelResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.agent.label.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个机房
     * Summary: 创建单个机房
     *
     * @param CreateTraasmetaZoneRequest $request
     *
     * @return CreateTraasmetaZoneResponse
     */
    public function createTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个机房
     * Summary: 创建单个机房
     *
     * @param CreateTraasmetaZoneRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateTraasmetaZoneResponse
     */
    public function createTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个地域
     * Summary: 删除单个地域
     *
     * @param DeleteTraasmetaRegionRequest $request
     *
     * @return DeleteTraasmetaRegionResponse
     */
    public function deleteTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个地域
     * Summary: 删除单个地域
     *
     * @param DeleteTraasmetaRegionRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteTraasmetaRegionResponse
     */
    public function deleteTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个机房
     * Summary: 删除单个机房
     *
     * @param DeleteTraasmetaZoneRequest $request
     *
     * @return DeleteTraasmetaZoneResponse
     */
    public function deleteTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个机房
     * Summary: 删除单个机房
     *
     * @param DeleteTraasmetaZoneRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteTraasmetaZoneResponse
     */
    public function deleteTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新单个地域
     * Summary: 更新单个地域
     *
     * @param UpdateTraasmetaRegionRequest $request
     *
     * @return UpdateTraasmetaRegionResponse
     */
    public function updateTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新单个地域
     * Summary: 更新单个地域
     *
     * @param UpdateTraasmetaRegionRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateTraasmetaRegionResponse
     */
    public function updateTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新单个机房
     * Summary: 更新单个机房
     *
     * @param UpdateTraasmetaZoneRequest $request
     *
     * @return UpdateTraasmetaZoneResponse
     */
    public function updateTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新单个机房
     * Summary: 更新单个机房
     *
     * @param UpdateTraasmetaZoneRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateTraasmetaZoneResponse
     */
    public function updateTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 地域查询
     * Summary: 地域查询.
     *
     * @param QueryTraasmetaRegionRequest $request
     *
     * @return QueryTraasmetaRegionResponse
     */
    public function queryTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 地域查询
     * Summary: 地域查询.
     *
     * @param QueryTraasmetaRegionRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTraasmetaRegionResponse
     */
    public function queryTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机房查询
     * Summary: 机房查询.
     *
     * @param QueryTraasmetaZoneRequest $request
     *
     * @return QueryTraasmetaZoneResponse
     */
    public function queryTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 机房查询
     * Summary: 机房查询.
     *
     * @param QueryTraasmetaZoneRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryTraasmetaZoneResponse
     */
    public function queryTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 地域分页查询
     * Summary: 地域分页查询.
     *
     * @param PagequeryTraasmetaRegionRequest $request
     *
     * @return PagequeryTraasmetaRegionResponse
     */
    public function pagequeryTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 地域分页查询
     * Summary: 地域分页查询.
     *
     * @param PagequeryTraasmetaRegionRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PagequeryTraasmetaRegionResponse
     */
    public function pagequeryTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机房分页查询
     * Summary: 机房分页查询.
     *
     * @param PagequeryTraasmetaZoneRequest $request
     *
     * @return PagequeryTraasmetaZoneResponse
     */
    public function pagequeryTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 机房分页查询
     * Summary: 机房分页查询.
     *
     * @param PagequeryTraasmetaZoneRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PagequeryTraasmetaZoneResponse
     */
    public function pagequeryTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询地域
     * Summary: 批量查询地域
     *
     * @param BatchqueryTraasmetaRegionRequest $request
     *
     * @return BatchqueryTraasmetaRegionResponse
     */
    public function batchqueryTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询地域
     * Summary: 批量查询地域
     *
     * @param BatchqueryTraasmetaRegionRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return BatchqueryTraasmetaRegionResponse
     */
    public function batchqueryTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建地域
     * Summary: 批量创建地域
     *
     * @param BatchcreateTraasmetaRegionRequest $request
     *
     * @return BatchcreateTraasmetaRegionResponse
     */
    public function batchcreateTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建地域
     * Summary: 批量创建地域
     *
     * @param BatchcreateTraasmetaRegionRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return BatchcreateTraasmetaRegionResponse
     */
    public function batchcreateTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建机房
     * Summary: 批量创建机房
     *
     * @param BatchcreateTraasmetaZoneRequest $request
     *
     * @return BatchcreateTraasmetaZoneResponse
     */
    public function batchcreateTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建机房
     * Summary: 批量创建机房
     *
     * @param BatchcreateTraasmetaZoneRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return BatchcreateTraasmetaZoneResponse
     */
    public function batchcreateTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询机房
     * Summary: 批量查询机房
     *
     * @param BatchqueryTraasmetaZoneRequest $request
     *
     * @return BatchqueryTraasmetaZoneResponse
     */
    public function batchqueryTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询机房
     * Summary: 批量查询机房
     *
     * @param BatchqueryTraasmetaZoneRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return BatchqueryTraasmetaZoneResponse
     */
    public function batchqueryTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除地域
     * Summary: 批量删除地域
     *
     * @param BatchdeleteTraasmetaRegionRequest $request
     *
     * @return BatchdeleteTraasmetaRegionResponse
     */
    public function batchdeleteTraasmetaRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除地域
     * Summary: 批量删除地域
     *
     * @param BatchdeleteTraasmetaRegionRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return BatchdeleteTraasmetaRegionResponse
     */
    public function batchdeleteTraasmetaRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.region.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除机房
     * Summary: 批量删除机房
     *
     * @param BatchdeleteTraasmetaZoneRequest $request
     *
     * @return BatchdeleteTraasmetaZoneResponse
     */
    public function batchdeleteTraasmetaZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除机房
     * Summary: 批量删除机房
     *
     * @param BatchdeleteTraasmetaZoneRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return BatchdeleteTraasmetaZoneResponse
     */
    public function batchdeleteTraasmetaZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaZoneResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.zone.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有应用
     * Summary: 获取所有应用.
     *
     * @param AllTraasmetaAppRequest $request
     *
     * @return AllTraasmetaAppResponse
     */
    public function allTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有应用
     * Summary: 获取所有应用.
     *
     * @param AllTraasmetaAppRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AllTraasmetaAppResponse
     */
    public function allTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有应用分组
     * Summary: 获取所有应用分组.
     *
     * @param AllTraasmetaAppgroupRequest $request
     *
     * @return AllTraasmetaAppgroupResponse
     */
    public function allTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有应用分组
     * Summary: 获取所有应用分组.
     *
     * @param AllTraasmetaAppgroupRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return AllTraasmetaAppgroupResponse
     */
    public function allTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有应用服务器
     * Summary: 获取所有应用服务器.
     *
     * @param AllTraasmetaAppserverRequest $request
     *
     * @return AllTraasmetaAppserverResponse
     */
    public function allTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有应用服务器
     * Summary: 获取所有应用服务器.
     *
     * @param AllTraasmetaAppserverRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AllTraasmetaAppserverResponse
     */
    public function allTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有应用标签
     * Summary: 获取所有应用标签.
     *
     * @param AllTraasmetaApptagRequest $request
     *
     * @return AllTraasmetaApptagResponse
     */
    public function allTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有应用标签
     * Summary: 获取所有应用标签.
     *
     * @param AllTraasmetaApptagRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AllTraasmetaApptagResponse
     */
    public function allTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有工作空间
     * Summary: 获取所有工作空间.
     *
     * @param AllTraasmetaWorkspaceRequest $request
     *
     * @return AllTraasmetaWorkspaceResponse
     */
    public function allTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有工作空间
     * Summary: 获取所有工作空间.
     *
     * @param AllTraasmetaWorkspaceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AllTraasmetaWorkspaceResponse
     */
    public function allTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有工作空间组
     * Summary: 获取所有工作空间组.
     *
     * @param AllTraasmetaWorkspacegroupRequest $request
     *
     * @return AllTraasmetaWorkspacegroupResponse
     */
    public function allTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有工作空间组
     * Summary: 获取所有工作空间组.
     *
     * @param AllTraasmetaWorkspacegroupRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return AllTraasmetaWorkspacegroupResponse
     */
    public function allTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建工作空间组
     * Summary: 批量创建工作空间组.
     *
     * @param BatchcreateTraasmetaWorkspacegroupRequest $request
     *
     * @return BatchcreateTraasmetaWorkspacegroupResponse
     */
    public function batchcreateTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建工作空间组
     * Summary: 批量创建工作空间组.
     *
     * @param BatchcreateTraasmetaWorkspacegroupRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return BatchcreateTraasmetaWorkspacegroupResponse
     */
    public function batchcreateTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建应用
     * Summary: 批量创建应用.
     *
     * @param BatchcreateTraasmetaAppRequest $request
     *
     * @return BatchcreateTraasmetaAppResponse
     */
    public function batchcreateTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建应用
     * Summary: 批量创建应用.
     *
     * @param BatchcreateTraasmetaAppRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return BatchcreateTraasmetaAppResponse
     */
    public function batchcreateTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建应用组
     * Summary: 批量创建应用组.
     *
     * @param BatchcreateTraasmetaAppgroupRequest $request
     *
     * @return BatchcreateTraasmetaAppgroupResponse
     */
    public function batchcreateTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建应用组
     * Summary: 批量创建应用组.
     *
     * @param BatchcreateTraasmetaAppgroupRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchcreateTraasmetaAppgroupResponse
     */
    public function batchcreateTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建应用服务器
     * Summary: 批量创建应用服务器.
     *
     * @param BatchcreateTraasmetaAppserverRequest $request
     *
     * @return BatchcreateTraasmetaAppserverResponse
     */
    public function batchcreateTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建应用服务器
     * Summary: 批量创建应用服务器.
     *
     * @param BatchcreateTraasmetaAppserverRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchcreateTraasmetaAppserverResponse
     */
    public function batchcreateTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建应用标签
     * Summary: 批量创建应用标签.
     *
     * @param BatchcreateTraasmetaApptagRequest $request
     *
     * @return BatchcreateTraasmetaApptagResponse
     */
    public function batchcreateTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建应用标签
     * Summary: 批量创建应用标签.
     *
     * @param BatchcreateTraasmetaApptagRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return BatchcreateTraasmetaApptagResponse
     */
    public function batchcreateTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建工作空间
     * Summary: 批量创建工作空间.
     *
     * @param BatchcreateTraasmetaWorkspaceRequest $request
     *
     * @return BatchcreateTraasmetaWorkspaceResponse
     */
    public function batchcreateTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建工作空间
     * Summary: 批量创建工作空间.
     *
     * @param BatchcreateTraasmetaWorkspaceRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchcreateTraasmetaWorkspaceResponse
     */
    public function batchcreateTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除应用
     * Summary: 批量删除应用.
     *
     * @param BatchdeleteTraasmetaAppRequest $request
     *
     * @return BatchdeleteTraasmetaAppResponse
     */
    public function batchdeleteTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除应用
     * Summary: 批量删除应用.
     *
     * @param BatchdeleteTraasmetaAppRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return BatchdeleteTraasmetaAppResponse
     */
    public function batchdeleteTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除工作空间
     * Summary: 批量删除工作空间.
     *
     * @param BatchdeleteTraasmetaWorkspaceRequest $request
     *
     * @return BatchdeleteTraasmetaWorkspaceResponse
     */
    public function batchdeleteTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除工作空间
     * Summary: 批量删除工作空间.
     *
     * @param BatchdeleteTraasmetaWorkspaceRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchdeleteTraasmetaWorkspaceResponse
     */
    public function batchdeleteTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除应用标签
     * Summary: 批量删除应用标签.
     *
     * @param BatchdeleteTraasmetaApptagRequest $request
     *
     * @return BatchdeleteTraasmetaApptagResponse
     */
    public function batchdeleteTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除应用标签
     * Summary: 批量删除应用标签.
     *
     * @param BatchdeleteTraasmetaApptagRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return BatchdeleteTraasmetaApptagResponse
     */
    public function batchdeleteTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除应用服务器
     * Summary: 批量删除应用服务器.
     *
     * @param BatchdeleteTraasmetaAppserverRequest $request
     *
     * @return BatchdeleteTraasmetaAppserverResponse
     */
    public function batchdeleteTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除应用服务器
     * Summary: 批量删除应用服务器.
     *
     * @param BatchdeleteTraasmetaAppserverRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchdeleteTraasmetaAppserverResponse
     */
    public function batchdeleteTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除应用组
     * Summary: 批量删除应用组.
     *
     * @param BatchdeleteTraasmetaAppgroupRequest $request
     *
     * @return BatchdeleteTraasmetaAppgroupResponse
     */
    public function batchdeleteTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除应用组
     * Summary: 批量删除应用组.
     *
     * @param BatchdeleteTraasmetaAppgroupRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchdeleteTraasmetaAppgroupResponse
     */
    public function batchdeleteTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除工作空间组
     * Summary: 批量删除工作空间组.
     *
     * @param BatchdeleteTraasmetaWorkspacegroupRequest $request
     *
     * @return BatchdeleteTraasmetaWorkspacegroupResponse
     */
    public function batchdeleteTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除工作空间组
     * Summary: 批量删除工作空间组.
     *
     * @param BatchdeleteTraasmetaWorkspacegroupRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return BatchdeleteTraasmetaWorkspacegroupResponse
     */
    public function batchdeleteTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询工作空间组
     * Summary: 批量查询工作空间组.
     *
     * @param BatchqueryTraasmetaWorkspacegroupRequest $request
     *
     * @return BatchqueryTraasmetaWorkspacegroupResponse
     */
    public function batchqueryTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询工作空间组
     * Summary: 批量查询工作空间组.
     *
     * @param BatchqueryTraasmetaWorkspacegroupRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return BatchqueryTraasmetaWorkspacegroupResponse
     */
    public function batchqueryTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询工作空间
     * Summary: 批量查询工作空间.
     *
     * @param BatchqueryTraasmetaWorkspaceRequest $request
     *
     * @return BatchqueryTraasmetaWorkspaceResponse
     */
    public function batchqueryTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询工作空间
     * Summary: 批量查询工作空间.
     *
     * @param BatchqueryTraasmetaWorkspaceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchqueryTraasmetaWorkspaceResponse
     */
    public function batchqueryTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询应用标签
     * Summary: 批量查询应用标签.
     *
     * @param BatchqueryTraasmetaApptagRequest $request
     *
     * @return BatchqueryTraasmetaApptagResponse
     */
    public function batchqueryTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询应用标签
     * Summary: 批量查询应用标签.
     *
     * @param BatchqueryTraasmetaApptagRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return BatchqueryTraasmetaApptagResponse
     */
    public function batchqueryTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询应用服务器
     * Summary: 批量查询应用服务器.
     *
     * @param BatchqueryTraasmetaAppserverRequest $request
     *
     * @return BatchqueryTraasmetaAppserverResponse
     */
    public function batchqueryTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询应用服务器
     * Summary: 批量查询应用服务器.
     *
     * @param BatchqueryTraasmetaAppserverRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return BatchqueryTraasmetaAppserverResponse
     */
    public function batchqueryTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询应用组
     * Summary: 批量查询应用组.
     *
     * @param BatchqueryTraasmetaAppgroupRequest $request
     *
     * @return BatchqueryTraasmetaAppgroupResponse
     */
    public function batchqueryTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询应用组
     * Summary: 批量查询应用组.
     *
     * @param BatchqueryTraasmetaAppgroupRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return BatchqueryTraasmetaAppgroupResponse
     */
    public function batchqueryTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询应用
     * Summary: 批量查询应用.
     *
     * @param BatchqueryTraasmetaAppRequest $request
     *
     * @return BatchqueryTraasmetaAppResponse
     */
    public function batchqueryTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询应用
     * Summary: 批量查询应用.
     *
     * @param BatchqueryTraasmetaAppRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BatchqueryTraasmetaAppResponse
     */
    public function batchqueryTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个应用
     * Summary: 删除单个应用.
     *
     * @param DeleteTraasmetaAppRequest $request
     *
     * @return DeleteTraasmetaAppResponse
     */
    public function deleteTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个应用
     * Summary: 删除单个应用.
     *
     * @param DeleteTraasmetaAppRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteTraasmetaAppResponse
     */
    public function deleteTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个应用组
     * Summary: 删除单个应用组.
     *
     * @param DeleteTraasmetaAppgroupRequest $request
     *
     * @return DeleteTraasmetaAppgroupResponse
     */
    public function deleteTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个应用组
     * Summary: 删除单个应用组.
     *
     * @param DeleteTraasmetaAppgroupRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteTraasmetaAppgroupResponse
     */
    public function deleteTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个应用服务器
     * Summary: 删除单个应用服务器.
     *
     * @param DeleteTraasmetaAppserverRequest $request
     *
     * @return DeleteTraasmetaAppserverResponse
     */
    public function deleteTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个应用服务器
     * Summary: 删除单个应用服务器.
     *
     * @param DeleteTraasmetaAppserverRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DeleteTraasmetaAppserverResponse
     */
    public function deleteTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个应用标签
     * Summary: 删除单个应用标签.
     *
     * @param DeleteTraasmetaApptagRequest $request
     *
     * @return DeleteTraasmetaApptagResponse
     */
    public function deleteTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个应用标签
     * Summary: 删除单个应用标签.
     *
     * @param DeleteTraasmetaApptagRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteTraasmetaApptagResponse
     */
    public function deleteTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个工作空间
     * Summary: 删除单个工作空间.
     *
     * @param DeleteTraasmetaWorkspaceRequest $request
     *
     * @return DeleteTraasmetaWorkspaceResponse
     */
    public function deleteTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个工作空间
     * Summary: 删除单个工作空间.
     *
     * @param DeleteTraasmetaWorkspaceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DeleteTraasmetaWorkspaceResponse
     */
    public function deleteTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个工作空间组
     * Summary: 删除单个工作空间组.
     *
     * @param DeleteTraasmetaWorkspacegroupRequest $request
     *
     * @return DeleteTraasmetaWorkspacegroupResponse
     */
    public function deleteTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个工作空间组
     * Summary: 删除单个工作空间组.
     *
     * @param DeleteTraasmetaWorkspacegroupRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return DeleteTraasmetaWorkspacegroupResponse
     */
    public function deleteTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个应用
     * Summary: 获取单个应用.
     *
     * @param GetTraasmetaAppRequest $request
     *
     * @return GetTraasmetaAppResponse
     */
    public function getTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个应用
     * Summary: 获取单个应用.
     *
     * @param GetTraasmetaAppRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetTraasmetaAppResponse
     */
    public function getTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个应用组
     * Summary: 获取单个应用组.
     *
     * @param GetTraasmetaAppgroupRequest $request
     *
     * @return GetTraasmetaAppgroupResponse
     */
    public function getTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个应用组
     * Summary: 获取单个应用组.
     *
     * @param GetTraasmetaAppgroupRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetTraasmetaAppgroupResponse
     */
    public function getTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个应用服务器
     * Summary: 获取单个应用服务器.
     *
     * @param GetTraasmetaAppserverRequest $request
     *
     * @return GetTraasmetaAppserverResponse
     */
    public function getTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个应用服务器
     * Summary: 获取单个应用服务器.
     *
     * @param GetTraasmetaAppserverRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetTraasmetaAppserverResponse
     */
    public function getTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个应用标签
     * Summary: 获取单个应用标签.
     *
     * @param GetTraasmetaApptagRequest $request
     *
     * @return GetTraasmetaApptagResponse
     */
    public function getTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个应用标签
     * Summary: 获取单个应用标签.
     *
     * @param GetTraasmetaApptagRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetTraasmetaApptagResponse
     */
    public function getTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个工作空间
     * Summary: 获取单个工作空间.
     *
     * @param GetTraasmetaWorkspaceRequest $request
     *
     * @return GetTraasmetaWorkspaceResponse
     */
    public function getTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个工作空间
     * Summary: 获取单个工作空间.
     *
     * @param GetTraasmetaWorkspaceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetTraasmetaWorkspaceResponse
     */
    public function getTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个工作空间组
     * Summary: 获取单个工作空间组.
     *
     * @param GetTraasmetaWorkspacegroupRequest $request
     *
     * @return GetTraasmetaWorkspacegroupResponse
     */
    public function getTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个工作空间组
     * Summary: 获取单个工作空间组.
     *
     * @param GetTraasmetaWorkspacegroupRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetTraasmetaWorkspacegroupResponse
     */
    public function getTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 工作空间组分页查询
     * Summary: 工作空间组分页查询.
     *
     * @param PagequeryTraasmetaWorkspacegroupRequest $request
     *
     * @return PagequeryTraasmetaWorkspacegroupResponse
     */
    public function pagequeryTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 工作空间组分页查询
     * Summary: 工作空间组分页查询.
     *
     * @param PagequeryTraasmetaWorkspacegroupRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return PagequeryTraasmetaWorkspacegroupResponse
     */
    public function pagequeryTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 工作空间分页查询
     * Summary: 工作空间分页查询.
     *
     * @param PagequeryTraasmetaWorkspaceRequest $request
     *
     * @return PagequeryTraasmetaWorkspaceResponse
     */
    public function pagequeryTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 工作空间分页查询
     * Summary: 工作空间分页查询.
     *
     * @param PagequeryTraasmetaWorkspaceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return PagequeryTraasmetaWorkspaceResponse
     */
    public function pagequeryTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用标签分页查询
     * Summary: 应用标签分页查询.
     *
     * @param PagequeryTraasmetaApptagRequest $request
     *
     * @return PagequeryTraasmetaApptagResponse
     */
    public function pagequeryTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用标签分页查询
     * Summary: 应用标签分页查询.
     *
     * @param PagequeryTraasmetaApptagRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PagequeryTraasmetaApptagResponse
     */
    public function pagequeryTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用服务器分页查询
     * Summary: 应用服务器分页查询.
     *
     * @param PagequeryTraasmetaAppserverRequest $request
     *
     * @return PagequeryTraasmetaAppserverResponse
     */
    public function pagequeryTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用服务器分页查询
     * Summary: 应用服务器分页查询.
     *
     * @param PagequeryTraasmetaAppserverRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return PagequeryTraasmetaAppserverResponse
     */
    public function pagequeryTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用组分页查询
     * Summary: 应用组分页查询.
     *
     * @param PagequeryTraasmetaAppgroupRequest $request
     *
     * @return PagequeryTraasmetaAppgroupResponse
     */
    public function pagequeryTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用组分页查询
     * Summary: 应用组分页查询.
     *
     * @param PagequeryTraasmetaAppgroupRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PagequeryTraasmetaAppgroupResponse
     */
    public function pagequeryTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用分页查询
     * Summary: 应用分页查询.
     *
     * @param PagequeryTraasmetaAppRequest $request
     *
     * @return PagequeryTraasmetaAppResponse
     */
    public function pagequeryTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用分页查询
     * Summary: 应用分页查询.
     *
     * @param PagequeryTraasmetaAppRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PagequeryTraasmetaAppResponse
     */
    public function pagequeryTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 工作空间组查询
     * Summary: 工作空间组查询.
     *
     * @param QueryTraasmetaWorkspacegroupRequest $request
     *
     * @return QueryTraasmetaWorkspacegroupResponse
     */
    public function queryTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 工作空间组查询
     * Summary: 工作空间组查询.
     *
     * @param QueryTraasmetaWorkspacegroupRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryTraasmetaWorkspacegroupResponse
     */
    public function queryTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 工作空间查询
     * Summary: 工作空间查询.
     *
     * @param QueryTraasmetaWorkspaceRequest $request
     *
     * @return QueryTraasmetaWorkspaceResponse
     */
    public function queryTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 工作空间查询
     * Summary: 工作空间查询.
     *
     * @param QueryTraasmetaWorkspaceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryTraasmetaWorkspaceResponse
     */
    public function queryTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用标签查询
     * Summary: 应用标签查询.
     *
     * @param QueryTraasmetaApptagRequest $request
     *
     * @return QueryTraasmetaApptagResponse
     */
    public function queryTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用标签查询
     * Summary: 应用标签查询.
     *
     * @param QueryTraasmetaApptagRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTraasmetaApptagResponse
     */
    public function queryTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用服务器查询
     * Summary: 应用服务器查询.
     *
     * @param QueryTraasmetaAppserverRequest $request
     *
     * @return QueryTraasmetaAppserverResponse
     */
    public function queryTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用服务器查询
     * Summary: 应用服务器查询.
     *
     * @param QueryTraasmetaAppserverRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryTraasmetaAppserverResponse
     */
    public function queryTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用组查询
     * Summary: 应用组查询.
     *
     * @param QueryTraasmetaAppgroupRequest $request
     *
     * @return QueryTraasmetaAppgroupResponse
     */
    public function queryTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用组查询
     * Summary: 应用组查询.
     *
     * @param QueryTraasmetaAppgroupRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryTraasmetaAppgroupResponse
     */
    public function queryTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用查询
     * Summary: 应用查询.
     *
     * @param QueryTraasmetaAppRequest $request
     *
     * @return QueryTraasmetaAppResponse
     */
    public function queryTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用查询
     * Summary: 应用查询.
     *
     * @param QueryTraasmetaAppRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryTraasmetaAppResponse
     */
    public function queryTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新单个应用
     * Summary: 更新单个应用.
     *
     * @param UpdateTraasmetaAppRequest $request
     *
     * @return UpdateTraasmetaAppResponse
     */
    public function updateTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新单个应用
     * Summary: 更新单个应用.
     *
     * @param UpdateTraasmetaAppRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateTraasmetaAppResponse
     */
    public function updateTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个应用
     * Summary: 创建单个应用.
     *
     * @param CreateTraasmetaAppRequest $request
     *
     * @return CreateTraasmetaAppResponse
     */
    public function createTraasmetaApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个应用
     * Summary: 创建单个应用.
     *
     * @param CreateTraasmetaAppRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateTraasmetaAppResponse
     */
    public function createTraasmetaAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaAppResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.app.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新单个工作空间组
     * Summary: 更新单个工作空间组.
     *
     * @param UpdateTraasmetaWorkspacegroupRequest $request
     *
     * @return UpdateTraasmetaWorkspacegroupResponse
     */
    public function updateTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新单个工作空间组
     * Summary: 更新单个工作空间组.
     *
     * @param UpdateTraasmetaWorkspacegroupRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return UpdateTraasmetaWorkspacegroupResponse
     */
    public function updateTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新单个应用组
     * Summary: 更新单个应用组.
     *
     * @param UpdateTraasmetaAppgroupRequest $request
     *
     * @return UpdateTraasmetaAppgroupResponse
     */
    public function updateTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新单个应用组
     * Summary: 更新单个应用组.
     *
     * @param UpdateTraasmetaAppgroupRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateTraasmetaAppgroupResponse
     */
    public function updateTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个应用组
     * Summary: 创建单个应用组.
     *
     * @param CreateTraasmetaAppgroupRequest $request
     *
     * @return CreateTraasmetaAppgroupResponse
     */
    public function createTraasmetaAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个应用组
     * Summary: 创建单个应用组.
     *
     * @param CreateTraasmetaAppgroupRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateTraasmetaAppgroupResponse
     */
    public function createTraasmetaAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appgroup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个工作空间
     * Summary: 创建单个工作空间.
     *
     * @param CreateTraasmetaWorkspaceRequest $request
     *
     * @return CreateTraasmetaWorkspaceResponse
     */
    public function createTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个工作空间
     * Summary: 创建单个工作空间.
     *
     * @param CreateTraasmetaWorkspaceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateTraasmetaWorkspaceResponse
     */
    public function createTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新单个工作空间
     * Summary: 更新单个工作空间.
     *
     * @param UpdateTraasmetaWorkspaceRequest $request
     *
     * @return UpdateTraasmetaWorkspaceResponse
     */
    public function updateTraasmetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新单个工作空间
     * Summary: 更新单个工作空间.
     *
     * @param UpdateTraasmetaWorkspaceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateTraasmetaWorkspaceResponse
     */
    public function updateTraasmetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspace.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新单个应用标签
     * Summary: 更新单个应用标签.
     *
     * @param UpdateTraasmetaApptagRequest $request
     *
     * @return UpdateTraasmetaApptagResponse
     */
    public function updateTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新单个应用标签
     * Summary: 更新单个应用标签.
     *
     * @param UpdateTraasmetaApptagRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateTraasmetaApptagResponse
     */
    public function updateTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个应用标签
     * Summary: 创建单个应用标签.
     *
     * @param CreateTraasmetaApptagRequest $request
     *
     * @return CreateTraasmetaApptagResponse
     */
    public function createTraasmetaApptag($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaApptagEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个应用标签
     * Summary: 创建单个应用标签.
     *
     * @param CreateTraasmetaApptagRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateTraasmetaApptagResponse
     */
    public function createTraasmetaApptagEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaApptagResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.apptag.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个应用服务器
     * Summary: 创建单个应用服务器.
     *
     * @param CreateTraasmetaAppserverRequest $request
     *
     * @return CreateTraasmetaAppserverResponse
     */
    public function createTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个应用服务器
     * Summary: 创建单个应用服务器.
     *
     * @param CreateTraasmetaAppserverRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateTraasmetaAppserverResponse
     */
    public function createTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新单个应用服务器
     * Summary: 更新单个应用服务器.
     *
     * @param UpdateTraasmetaAppserverRequest $request
     *
     * @return UpdateTraasmetaAppserverResponse
     */
    public function updateTraasmetaAppserver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaAppserverEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新单个应用服务器
     * Summary: 更新单个应用服务器.
     *
     * @param UpdateTraasmetaAppserverRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateTraasmetaAppserverResponse
     */
    public function updateTraasmetaAppserverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaAppserverResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.appserver.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取SetupModel
     * Summary: 获取SetupModel.
     *
     * @param GetSetupModelRequest $request
     *
     * @return GetSetupModelResponse
     */
    public function getSetupModel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSetupModelEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取SetupModel
     * Summary: 获取SetupModel.
     *
     * @param GetSetupModelRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetSetupModelResponse
     */
    public function getSetupModelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSetupModelResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.setup.model.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个工作空间组
     * Summary: 创建单个工作空间组.
     *
     * @param CreateTraasmetaWorkspacegroupRequest $request
     *
     * @return CreateTraasmetaWorkspacegroupResponse
     */
    public function createTraasmetaWorkspacegroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个工作空间组
     * Summary: 创建单个工作空间组.
     *
     * @param CreateTraasmetaWorkspacegroupRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateTraasmetaWorkspacegroupResponse
     */
    public function createTraasmetaWorkspacegroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaWorkspacegroupResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.workspacegroup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个cell
     * Summary: 获取单个cell.
     *
     * @param GetTraasmetaCellRequest $request
     *
     * @return GetTraasmetaCellResponse
     */
    public function getTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个cell
     * Summary: 获取单个cell.
     *
     * @param GetTraasmetaCellRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetTraasmetaCellResponse
     */
    public function getTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询
     * Summary: 分页查询.
     *
     * @param PagequeryTraasmetaCellRequest $request
     *
     * @return PagequeryTraasmetaCellResponse
     */
    public function pagequeryTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询
     * Summary: 分页查询.
     *
     * @param PagequeryTraasmetaCellRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PagequeryTraasmetaCellResponse
     */
    public function pagequeryTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个主机
     * Summary: 获取单个主机.
     *
     * @param GetTraasmetaHostmachineRequest $request
     *
     * @return GetTraasmetaHostmachineResponse
     */
    public function getTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个主机
     * Summary: 获取单个主机.
     *
     * @param GetTraasmetaHostmachineRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetTraasmetaHostmachineResponse
     */
    public function getTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询主机
     * Summary: 分页查询主机.
     *
     * @param PagequeryTraasmetaHostmachineRequest $request
     *
     * @return PagequeryTraasmetaHostmachineResponse
     */
    public function pagequeryTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询主机
     * Summary: 分页查询主机.
     *
     * @param PagequeryTraasmetaHostmachineRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return PagequeryTraasmetaHostmachineResponse
     */
    public function pagequeryTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单链路详细拓扑
     * Summary: 获取单链路详细拓扑.
     *
     * @param QueryTraceDetailtopologyRequest $request
     *
     * @return QueryTraceDetailtopologyResponse
     */
    public function queryTraceDetailtopology($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraceDetailtopologyEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单链路详细拓扑
     * Summary: 获取单链路详细拓扑.
     *
     * @param QueryTraceDetailtopologyRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryTraceDetailtopologyResponse
     */
    public function queryTraceDetailtopologyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraceDetailtopologyResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.trace.detailtopology.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: spi配置-保存spi
     * Summary: spi配置-保存spi.
     *
     * @param SaveTenantconfigSpiRequest $request
     *
     * @return SaveTenantconfigSpiResponse
     */
    public function saveTenantconfigSpi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveTenantconfigSpiEx($request, $headers, $runtime);
    }

    /**
     * Description: spi配置-保存spi
     * Summary: spi配置-保存spi.
     *
     * @param SaveTenantconfigSpiRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SaveTenantconfigSpiResponse
     */
    public function saveTenantconfigSpiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveTenantconfigSpiResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.tenantconfig.spi.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: spi配置-查询spi
     * Summary: spi配置-查询spi.
     *
     * @param QueryTenantconfigSpiRequest $request
     *
     * @return QueryTenantconfigSpiResponse
     */
    public function queryTenantconfigSpi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTenantconfigSpiEx($request, $headers, $runtime);
    }

    /**
     * Description: spi配置-查询spi
     * Summary: spi配置-查询spi.
     *
     * @param QueryTenantconfigSpiRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTenantconfigSpiResponse
     */
    public function queryTenantconfigSpiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTenantconfigSpiResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.tenantconfig.spi.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取当前用户能够访问的workspace
     * Summary: 获取当前用户能够访问的workspace.
     *
     * @param ListOneconsoleWorkspaceRequest $request
     *
     * @return ListOneconsoleWorkspaceResponse
     */
    public function listOneconsoleWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listOneconsoleWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取当前用户能够访问的workspace
     * Summary: 获取当前用户能够访问的workspace.
     *
     * @param ListOneconsoleWorkspaceRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListOneconsoleWorkspaceResponse
     */
    public function listOneconsoleWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListOneconsoleWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.oneconsole.workspace.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: spi配置-删除
     * Summary: spi配置-删除.
     *
     * @param DeleteTenantconfigRequest $request
     *
     * @return DeleteTenantconfigResponse
     */
    public function deleteTenantconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTenantconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: spi配置-删除
     * Summary: spi配置-删除.
     *
     * @param DeleteTenantconfigRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteTenantconfigResponse
     */
    public function deleteTenantconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTenantconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.tenantconfig.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: spi配置-查询token
     * Summary: spi配置-查询token.
     *
     * @param QueryTenantconfigTokenRequest $request
     *
     * @return QueryTenantconfigTokenResponse
     */
    public function queryTenantconfigToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTenantconfigTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: spi配置-查询token
     * Summary: spi配置-查询token.
     *
     * @param QueryTenantconfigTokenRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryTenantconfigTokenResponse
     */
    public function queryTenantconfigTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTenantconfigTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.tenantconfig.token.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: spi配置-保存token
     * Summary: spi配置-保存token.
     *
     * @param SaveTenantconfigTokenRequest $request
     *
     * @return SaveTenantconfigTokenResponse
     */
    public function saveTenantconfigToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveTenantconfigTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: spi配置-保存token
     * Summary: spi配置-保存token.
     *
     * @param SaveTenantconfigTokenRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SaveTenantconfigTokenResponse
     */
    public function saveTenantconfigTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveTenantconfigTokenResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.tenantconfig.token.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询元数据实体基本信息
     * Summary: 查询元数据实体基本信息.
     *
     * @param QueryTraasmetaEntityRequest $request
     *
     * @return QueryTraasmetaEntityResponse
     */
    public function queryTraasmetaEntity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaEntityEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询元数据实体基本信息
     * Summary: 查询元数据实体基本信息.
     *
     * @param QueryTraasmetaEntityRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryTraasmetaEntityResponse
     */
    public function queryTraasmetaEntityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaEntityResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.entity.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取实体字段列表
     * Summary: 获取实体字段列表.
     *
     * @param ListTraasmetaEntityfieldRequest $request
     *
     * @return ListTraasmetaEntityfieldResponse
     */
    public function listTraasmetaEntityfield($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listTraasmetaEntityfieldEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取实体字段列表
     * Summary: 获取实体字段列表.
     *
     * @param ListTraasmetaEntityfieldRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListTraasmetaEntityfieldResponse
     */
    public function listTraasmetaEntityfieldEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListTraasmetaEntityfieldResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.entityfield.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询实体拓扑
     * Summary: 查询实体拓扑.
     *
     * @param QueryTraasmetaEntitytopoRequest $request
     *
     * @return QueryTraasmetaEntitytopoResponse
     */
    public function queryTraasmetaEntitytopo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaEntitytopoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实体拓扑
     * Summary: 查询实体拓扑.
     *
     * @param QueryTraasmetaEntitytopoRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryTraasmetaEntitytopoResponse
     */
    public function queryTraasmetaEntitytopoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaEntitytopoResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.entitytopo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有主机
     * Summary: 获取所有主机.
     *
     * @param AllTraasmetaHostmachineRequest $request
     *
     * @return AllTraasmetaHostmachineResponse
     */
    public function allTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有主机
     * Summary: 获取所有主机.
     *
     * @param AllTraasmetaHostmachineRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return AllTraasmetaHostmachineResponse
     */
    public function allTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建主机
     * Summary: 批量创建主机.
     *
     * @param BatchcreateTraasmetaHostmachineRequest $request
     *
     * @return BatchcreateTraasmetaHostmachineResponse
     */
    public function batchcreateTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建主机
     * Summary: 批量创建主机.
     *
     * @param BatchcreateTraasmetaHostmachineRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return BatchcreateTraasmetaHostmachineResponse
     */
    public function batchcreateTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除主机
     * Summary: 批量删除主机.
     *
     * @param BatchdeleteTraasmetaHostmachineRequest $request
     *
     * @return BatchdeleteTraasmetaHostmachineResponse
     */
    public function batchdeleteTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除主机
     * Summary: 批量删除主机.
     *
     * @param BatchdeleteTraasmetaHostmachineRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return BatchdeleteTraasmetaHostmachineResponse
     */
    public function batchdeleteTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询主机
     * Summary: 批量查询主机.
     *
     * @param BatchqueryTraasmetaHostmachineRequest $request
     *
     * @return BatchqueryTraasmetaHostmachineResponse
     */
    public function batchqueryTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询主机
     * Summary: 批量查询主机.
     *
     * @param BatchqueryTraasmetaHostmachineRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return BatchqueryTraasmetaHostmachineResponse
     */
    public function batchqueryTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个主机
     * Summary: 创建单个主机.
     *
     * @param CreateTraasmetaHostmachineRequest $request
     *
     * @return CreateTraasmetaHostmachineResponse
     */
    public function createTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个主机
     * Summary: 创建单个主机.
     *
     * @param CreateTraasmetaHostmachineRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateTraasmetaHostmachineResponse
     */
    public function createTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除主机
     * Summary: 删除主机.
     *
     * @param DeleteTraasmetaHostmachineRequest $request
     *
     * @return DeleteTraasmetaHostmachineResponse
     */
    public function deleteTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除主机
     * Summary: 删除主机.
     *
     * @param DeleteTraasmetaHostmachineRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DeleteTraasmetaHostmachineResponse
     */
    public function deleteTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询主机
     * Summary: 查询主机.
     *
     * @param QueryTraasmetaHostmachineRequest $request
     *
     * @return QueryTraasmetaHostmachineResponse
     */
    public function queryTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询主机
     * Summary: 查询主机.
     *
     * @param QueryTraasmetaHostmachineRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryTraasmetaHostmachineResponse
     */
    public function queryTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新主机
     * Summary: 更新主机.
     *
     * @param UpdateTraasmetaHostmachineRequest $request
     *
     * @return UpdateTraasmetaHostmachineResponse
     */
    public function updateTraasmetaHostmachine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaHostmachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新主机
     * Summary: 更新主机.
     *
     * @param UpdateTraasmetaHostmachineRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return UpdateTraasmetaHostmachineResponse
     */
    public function updateTraasmetaHostmachineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaHostmachineResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.hostmachine.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建cell
     * Summary: 批量创建cell.
     *
     * @param BatchcreateTraasmetaCellRequest $request
     *
     * @return BatchcreateTraasmetaCellResponse
     */
    public function batchcreateTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建cell
     * Summary: 批量创建cell.
     *
     * @param BatchcreateTraasmetaCellRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return BatchcreateTraasmetaCellResponse
     */
    public function batchcreateTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除cell
     * Summary: 批量删除cell.
     *
     * @param BatchdeleteTraasmetaCellRequest $request
     *
     * @return BatchdeleteTraasmetaCellResponse
     */
    public function batchdeleteTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除cell
     * Summary: 批量删除cell.
     *
     * @param BatchdeleteTraasmetaCellRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return BatchdeleteTraasmetaCellResponse
     */
    public function batchdeleteTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询cell
     * Summary: 批量查询cell.
     *
     * @param BatchqueryTraasmetaCellRequest $request
     *
     * @return BatchqueryTraasmetaCellResponse
     */
    public function batchqueryTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询cell
     * Summary: 批量查询cell.
     *
     * @param BatchqueryTraasmetaCellRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return BatchqueryTraasmetaCellResponse
     */
    public function batchqueryTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新cell
     * Summary: 更新cell.
     *
     * @param UpdateTraasmetaCellRequest $request
     *
     * @return UpdateTraasmetaCellResponse
     */
    public function updateTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新cell
     * Summary: 更新cell.
     *
     * @param UpdateTraasmetaCellRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateTraasmetaCellResponse
     */
    public function updateTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建单个cell
     * Summary: 创建单个cell.
     *
     * @param CreateTraasmetaCellRequest $request
     *
     * @return CreateTraasmetaCellResponse
     */
    public function createTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建单个cell
     * Summary: 创建单个cell.
     *
     * @param CreateTraasmetaCellRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateTraasmetaCellResponse
     */
    public function createTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除单个cell
     * Summary: 删除单个cell.
     *
     * @param DeleteTraasmetaCellRequest $request
     *
     * @return DeleteTraasmetaCellResponse
     */
    public function deleteTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除单个cell
     * Summary: 删除单个cell.
     *
     * @param DeleteTraasmetaCellRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteTraasmetaCellResponse
     */
    public function deleteTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有cell
     * Summary: 获取所有cell.
     *
     * @param AllTraasmetaCellRequest $request
     *
     * @return AllTraasmetaCellResponse
     */
    public function allTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有cell
     * Summary: 获取所有cell.
     *
     * @param AllTraasmetaCellRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AllTraasmetaCellResponse
     */
    public function allTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询cell
     * Summary: 查询cell.
     *
     * @param QueryTraasmetaCellRequest $request
     *
     * @return QueryTraasmetaCellResponse
     */
    public function queryTraasmetaCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTraasmetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询cell
     * Summary: 查询cell.
     *
     * @param QueryTraasmetaCellRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryTraasmetaCellResponse
     */
    public function queryTraasmetaCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTraasmetaCellResponse::fromMap($this->doRequest('1.0', 'antcloud.monitor.traasmeta.cell.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
