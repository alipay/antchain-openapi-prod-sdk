<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Deps\Models\CreateApplicationRequest;
use AntChain\Deps\Models\CreateApplicationResponse;
use AntChain\Deps\Models\CreateApplicationServiceRequest;
use AntChain\Deps\Models\CreateApplicationServiceResponse;
use AntChain\Deps\Models\EnabledApplicationServiceRequest;
use AntChain\Deps\Models\EnabledApplicationServiceResponse;
use AntChain\Deps\Models\GetApplicationRequest;
use AntChain\Deps\Models\GetApplicationResponse;
use AntChain\Deps\Models\GetApplicationServiceRequest;
use AntChain\Deps\Models\GetApplicationServiceResponse;
use AntChain\Deps\Models\QueryApplicationServiceRequest;
use AntChain\Deps\Models\QueryApplicationServiceResponse;
use AntChain\Deps\Models\DeleteApplicationServiceRequest;
use AntChain\Deps\Models\DeleteApplicationServiceResponse;
use AntChain\Deps\Models\GetApplicationPackageRequest;
use AntChain\Deps\Models\GetApplicationPackageResponse;
use AntChain\Deps\Models\QueryAppVersionRequest;
use AntChain\Deps\Models\QueryAppVersionResponse;
use AntChain\Deps\Models\DeleteApplicationRequest;
use AntChain\Deps\Models\DeleteApplicationResponse;
use AntChain\Deps\Models\ListApplicationRequest;
use AntChain\Deps\Models\ListApplicationResponse;
use AntChain\Deps\Models\ListAppgroupRequest;
use AntChain\Deps\Models\ListAppgroupResponse;
use AntChain\Deps\Models\QueryApplicationComputerRequest;
use AntChain\Deps\Models\QueryApplicationComputerResponse;
use AntChain\Deps\Models\GetApplicationRepositoryRequest;
use AntChain\Deps\Models\GetApplicationRepositoryResponse;
use AntChain\Deps\Models\QueryAppgroupRequest;
use AntChain\Deps\Models\QueryAppgroupResponse;
use AntChain\Deps\Models\QueryApplevelRequest;
use AntChain\Deps\Models\QueryApplevelResponse;
use AntChain\Deps\Models\QueryApplicationRequest;
use AntChain\Deps\Models\QueryApplicationResponse;
use AntChain\Deps\Models\CreateAppVersionRequest;
use AntChain\Deps\Models\CreateAppVersionResponse;
use AntChain\Deps\Models\QueryAppDeltaRequest;
use AntChain\Deps\Models\QueryAppDeltaResponse;
use AntChain\Deps\Models\QueryApplicationLoadbalancerRequest;
use AntChain\Deps\Models\QueryApplicationLoadbalancerResponse;
use AntChain\Deps\Models\QueryApplicationDatabaseRequest;
use AntChain\Deps\Models\QueryApplicationDatabaseResponse;
use AntChain\Deps\Models\UploadApplicationPackageRequest;
use AntChain\Deps\Models\UploadApplicationPackageResponse;
use AntChain\Deps\Models\SyncreateApplicationVersionRequest;
use AntChain\Deps\Models\SyncreateApplicationVersionResponse;
use AntChain\Deps\Models\ListCloudconnectorConnectionRequest;
use AntChain\Deps\Models\ListCloudconnectorConnectionResponse;
use AntChain\Deps\Models\QueryAppservicebuildpackrelationRequest;
use AntChain\Deps\Models\QueryAppservicebuildpackrelationResponse;
use AntChain\Deps\Models\UpdateAppservicebuildpackrelationRequest;
use AntChain\Deps\Models\UpdateAppservicebuildpackrelationResponse;
use AntChain\Deps\Models\QueryAppserviceenvparamRequest;
use AntChain\Deps\Models\QueryAppserviceenvparamResponse;
use AntChain\Deps\Models\QueryAppserviceenvparamGroupbyappservicesRequest;
use AntChain\Deps\Models\QueryAppserviceenvparamGroupbyappservicesResponse;
use AntChain\Deps\Models\QueryAppserviceenvparamQuerywithdiffRequest;
use AntChain\Deps\Models\QueryAppserviceenvparamQuerywithdiffResponse;
use AntChain\Deps\Models\UpdateAppserviceenvparamUpdateparamsRequest;
use AntChain\Deps\Models\UpdateAppserviceenvparamUpdateparamsResponse;
use AntChain\Deps\Models\QueryApptechstackrelationRequest;
use AntChain\Deps\Models\QueryApptechstackrelationResponse;
use AntChain\Deps\Models\UpdateApptechstackrelationRequest;
use AntChain\Deps\Models\UpdateApptechstackrelationResponse;
use AntChain\Deps\Models\CreateAppRequest;
use AntChain\Deps\Models\CreateAppResponse;
use AntChain\Deps\Models\CreateAppGroupRequest;
use AntChain\Deps\Models\CreateAppGroupResponse;
use AntChain\Deps\Models\GetAppRequest;
use AntChain\Deps\Models\GetAppResponse;
use AntChain\Deps\Models\CountAppServiceRequest;
use AntChain\Deps\Models\CountAppServiceResponse;
use AntChain\Deps\Models\AllAppDeployviewRequest;
use AntChain\Deps\Models\AllAppDeployviewResponse;
use AntChain\Deps\Models\QueryAppRequest;
use AntChain\Deps\Models\QueryAppResponse;
use AntChain\Deps\Models\GetAppGroupRequest;
use AntChain\Deps\Models\GetAppGroupResponse;
use AntChain\Deps\Models\QueryAppServiceRequest;
use AntChain\Deps\Models\QueryAppServiceResponse;
use AntChain\Deps\Models\CreateAppFavouriteRequest;
use AntChain\Deps\Models\CreateAppFavouriteResponse;
use AntChain\Deps\Models\DeleteAppFavouriteRequest;
use AntChain\Deps\Models\DeleteAppFavouriteResponse;
use AntChain\Deps\Models\UpdateAppRequest;
use AntChain\Deps\Models\UpdateAppResponse;
use AntChain\Deps\Models\UpdateAppGroupRequest;
use AntChain\Deps\Models\UpdateAppGroupResponse;
use AntChain\Deps\Models\ListAppFavouriteRequest;
use AntChain\Deps\Models\ListAppFavouriteResponse;
use AntChain\Deps\Models\DeleteAppRequest;
use AntChain\Deps\Models\DeleteAppResponse;
use AntChain\Deps\Models\DeleteAppGroupRequest;
use AntChain\Deps\Models\DeleteAppGroupResponse;
use AntChain\Deps\Models\QueryAppPlanRequest;
use AntChain\Deps\Models\QueryAppPlanResponse;
use AntChain\Deps\Models\ExistAppGroupRequest;
use AntChain\Deps\Models\ExistAppGroupResponse;
use AntChain\Deps\Models\QueryUserRequest;
use AntChain\Deps\Models\QueryUserResponse;
use AntChain\Deps\Models\ExistAppRequest;
use AntChain\Deps\Models\ExistAppResponse;
use AntChain\Deps\Models\GetApplicationBuildpackRequest;
use AntChain\Deps\Models\GetApplicationBuildpackResponse;
use AntChain\Deps\Models\GetApplicationTechstackRequest;
use AntChain\Deps\Models\GetApplicationTechstackResponse;
use AntChain\Deps\Models\GetBuildpackRequest;
use AntChain\Deps\Models\GetBuildpackResponse;
use AntChain\Deps\Models\ListTechstackRequest;
use AntChain\Deps\Models\ListTechstackResponse;
use AntChain\Deps\Models\QueryBuildpackRequest;
use AntChain\Deps\Models\QueryBuildpackResponse;
use AntChain\Deps\Models\CreateBuildpackRequest;
use AntChain\Deps\Models\CreateBuildpackResponse;
use AntChain\Deps\Models\UploadfinishBuildpackRequest;
use AntChain\Deps\Models\UploadfinishBuildpackResponse;
use AntChain\Deps\Models\PublishBuildpackRequest;
use AntChain\Deps\Models\PublishBuildpackResponse;
use AntChain\Deps\Models\UpdateBuildpackRequest;
use AntChain\Deps\Models\UpdateBuildpackResponse;
use AntChain\Deps\Models\QueryBuildpackFindbynamesRequest;
use AntChain\Deps\Models\QueryBuildpackFindbynamesResponse;
use AntChain\Deps\Models\CountBuildpackRequest;
use AntChain\Deps\Models\CountBuildpackResponse;
use AntChain\Deps\Models\DeprecateBuildpackRequest;
use AntChain\Deps\Models\DeprecateBuildpackResponse;
use AntChain\Deps\Models\BatchdeleteBuildpackRequest;
use AntChain\Deps\Models\BatchdeleteBuildpackResponse;
use AntChain\Deps\Models\ExistBuildpackRequest;
use AntChain\Deps\Models\ExistBuildpackResponse;
use AntChain\Deps\Models\UpdateBuildpackUpdatepackagesstatusRequest;
use AntChain\Deps\Models\UpdateBuildpackUpdatepackagesstatusResponse;
use AntChain\Deps\Models\QueryBuildpackFindidversionpairsbyversionRequest;
use AntChain\Deps\Models\QueryBuildpackFindidversionpairsbyversionResponse;
use AntChain\Deps\Models\QueryBuildpackGroupbytechstackRequest;
use AntChain\Deps\Models\QueryBuildpackGroupbytechstackResponse;
use AntChain\Deps\Models\QueryBuildpackFindvisibletechstacksRequest;
use AntChain\Deps\Models\QueryBuildpackFindvisibletechstacksResponse;
use AntChain\Deps\Models\QueryBuildpackFindwritabletechstacksRequest;
use AntChain\Deps\Models\QueryBuildpackFindwritabletechstacksResponse;
use AntChain\Deps\Models\QueryBuildpackFindosbycurrentcloudRequest;
use AntChain\Deps\Models\QueryBuildpackFindosbycurrentcloudResponse;
use AntChain\Deps\Models\QueryBuildpackFindbyappsvRequest;
use AntChain\Deps\Models\QueryBuildpackFindbyappsvResponse;
use AntChain\Deps\Models\QueryBuildpackFindbyappsRequest;
use AntChain\Deps\Models\QueryBuildpackFindbyappsResponse;
use AntChain\Deps\Models\QueryBuildpackFindbyappservicesRequest;
use AntChain\Deps\Models\QueryBuildpackFindbyappservicesResponse;
use AntChain\Deps\Models\QueryBuildpackFindbyappvRequest;
use AntChain\Deps\Models\QueryBuildpackFindbyappvResponse;
use AntChain\Deps\Models\QueryBuildpackFindbyappRequest;
use AntChain\Deps\Models\QueryBuildpackFindbyappResponse;
use AntChain\Deps\Models\CreateBuildpackGeneratesignurlRequest;
use AntChain\Deps\Models\CreateBuildpackGeneratesignurlResponse;
use AntChain\Deps\Models\QueryBuildpackSumpackagessizeRequest;
use AntChain\Deps\Models\QueryBuildpackSumpackagessizeResponse;
use AntChain\Deps\Models\QueryBuildpackSupportcoderepoRequest;
use AntChain\Deps\Models\QueryBuildpackSupportcoderepoResponse;
use AntChain\Deps\Models\QueryBuildpackFindavailablebyappserviceidsRequest;
use AntChain\Deps\Models\QueryBuildpackFindavailablebyappserviceidsResponse;
use AntChain\Deps\Models\QueryBuildpacknewRequest;
use AntChain\Deps\Models\QueryBuildpacknewResponse;
use AntChain\Deps\Models\GetBuildpacknewRequest;
use AntChain\Deps\Models\GetBuildpacknewResponse;
use AntChain\Deps\Models\UpdateBuildpacknewUploadfinishRequest;
use AntChain\Deps\Models\UpdateBuildpacknewUploadfinishResponse;
use AntChain\Deps\Models\UpdateBuildpacknewRequest;
use AntChain\Deps\Models\UpdateBuildpacknewResponse;
use AntChain\Deps\Models\CreateBuildpacknewRequest;
use AntChain\Deps\Models\CreateBuildpacknewResponse;
use AntChain\Deps\Models\OnlineBuildpackRequest;
use AntChain\Deps\Models\OnlineBuildpackResponse;
use AntChain\Deps\Models\CreateConfigGlobalRequest;
use AntChain\Deps\Models\CreateConfigGlobalResponse;
use AntChain\Deps\Models\DeleteConfigGlobalRequest;
use AntChain\Deps\Models\DeleteConfigGlobalResponse;
use AntChain\Deps\Models\UpdateConfigGlobalRequest;
use AntChain\Deps\Models\UpdateConfigGlobalResponse;
use AntChain\Deps\Models\QueryConfigGlobalRequest;
use AntChain\Deps\Models\QueryConfigGlobalResponse;
use AntChain\Deps\Models\GetConfigGlobalRequest;
use AntChain\Deps\Models\GetConfigGlobalResponse;
use AntChain\Deps\Models\CreateConfigAppRequest;
use AntChain\Deps\Models\CreateConfigAppResponse;
use AntChain\Deps\Models\DeleteConfigAppRequest;
use AntChain\Deps\Models\DeleteConfigAppResponse;
use AntChain\Deps\Models\UpdateConfigAppRequest;
use AntChain\Deps\Models\UpdateConfigAppResponse;
use AntChain\Deps\Models\GetConfigAppRequest;
use AntChain\Deps\Models\GetConfigAppResponse;
use AntChain\Deps\Models\QueryConfigAppRequest;
use AntChain\Deps\Models\QueryConfigAppResponse;
use AntChain\Deps\Models\SaveConfigTemplateRequest;
use AntChain\Deps\Models\SaveConfigTemplateResponse;
use AntChain\Deps\Models\CreateConfigTemplateRequest;
use AntChain\Deps\Models\CreateConfigTemplateResponse;
use AntChain\Deps\Models\PullConfigTemplateRequest;
use AntChain\Deps\Models\PullConfigTemplateResponse;
use AntChain\Deps\Models\DeleteConfigTemplatedraftRequest;
use AntChain\Deps\Models\DeleteConfigTemplatedraftResponse;
use AntChain\Deps\Models\GetConfigTemplateRequest;
use AntChain\Deps\Models\GetConfigTemplateResponse;
use AntChain\Deps\Models\QueryConfigTemplateRequest;
use AntChain\Deps\Models\QueryConfigTemplateResponse;
use AntChain\Deps\Models\ExecConfigParseRequest;
use AntChain\Deps\Models\ExecConfigParseResponse;
use AntChain\Deps\Models\BatchcreateConfigGlobalRequest;
use AntChain\Deps\Models\BatchcreateConfigGlobalResponse;
use AntChain\Deps\Models\BatchcreateConfigAppRequest;
use AntChain\Deps\Models\BatchcreateConfigAppResponse;
use AntChain\Deps\Models\GetConfigSitetreeRequest;
use AntChain\Deps\Models\GetConfigSitetreeResponse;
use AntChain\Deps\Models\GetConfigTenanttreeRequest;
use AntChain\Deps\Models\GetConfigTenanttreeResponse;
use AntChain\Deps\Models\ExistConfigAppRequest;
use AntChain\Deps\Models\ExistConfigAppResponse;
use AntChain\Deps\Models\ExistConfigGlobalRequest;
use AntChain\Deps\Models\ExistConfigGlobalResponse;
use AntChain\Deps\Models\ListWorkspacegroupRequest;
use AntChain\Deps\Models\ListWorkspacegroupResponse;
use AntChain\Deps\Models\GetWorkspacegroupRequest;
use AntChain\Deps\Models\GetWorkspacegroupResponse;
use AntChain\Deps\Models\QueryCellRequest;
use AntChain\Deps\Models\QueryCellResponse;
use AntChain\Deps\Models\QueryWorkspaceDeltaRequest;
use AntChain\Deps\Models\QueryWorkspaceDeltaResponse;
use AntChain\Deps\Models\CreateWorkspacegroupRequest;
use AntChain\Deps\Models\CreateWorkspacegroupResponse;
use AntChain\Deps\Models\QueryWorkspacegroupRequest;
use AntChain\Deps\Models\QueryWorkspacegroupResponse;
use AntChain\Deps\Models\DeleteWorkspacegroupRequest;
use AntChain\Deps\Models\DeleteWorkspacegroupResponse;
use AntChain\Deps\Models\GetSingleworkspaceRequest;
use AntChain\Deps\Models\GetSingleworkspaceResponse;
use AntChain\Deps\Models\GetSingleworkspacegroupRequest;
use AntChain\Deps\Models\GetSingleworkspacegroupResponse;
use AntChain\Deps\Models\ListCellRequest;
use AntChain\Deps\Models\ListCellResponse;
use AntChain\Deps\Models\CreateSingleworkspaceRequest;
use AntChain\Deps\Models\CreateSingleworkspaceResponse;
use AntChain\Deps\Models\DeleteSingleworkspaceRequest;
use AntChain\Deps\Models\DeleteSingleworkspaceResponse;
use AntChain\Deps\Models\CreateVpcRequest;
use AntChain\Deps\Models\CreateVpcResponse;
use AntChain\Deps\Models\UpdateWorkspacegroupRequest;
use AntChain\Deps\Models\UpdateWorkspacegroupResponse;
use AntChain\Deps\Models\UpdateSingleworkspaceRequest;
use AntChain\Deps\Models\UpdateSingleworkspaceResponse;
use AntChain\Deps\Models\ListRegionRequest;
use AntChain\Deps\Models\ListRegionResponse;
use AntChain\Deps\Models\ListZoneRequest;
use AntChain\Deps\Models\ListZoneResponse;
use AntChain\Deps\Models\CreateCellgroupRequest;
use AntChain\Deps\Models\CreateCellgroupResponse;
use AntChain\Deps\Models\DeleteCellgroupRequest;
use AntChain\Deps\Models\DeleteCellgroupResponse;
use AntChain\Deps\Models\QueryCellgroupRequest;
use AntChain\Deps\Models\QueryCellgroupResponse;
use AntChain\Deps\Models\UpdateCellgroupDisasterinfoRequest;
use AntChain\Deps\Models\UpdateCellgroupDisasterinfoResponse;
use AntChain\Deps\Models\CreateDeploymentCellRequest;
use AntChain\Deps\Models\CreateDeploymentCellResponse;
use AntChain\Deps\Models\DeleteDeploymentCellRequest;
use AntChain\Deps\Models\DeleteDeploymentCellResponse;
use AntChain\Deps\Models\QueryDeploymentCellRequest;
use AntChain\Deps\Models\QueryDeploymentCellResponse;
use AntChain\Deps\Models\UpdateDeploymentCellRequest;
use AntChain\Deps\Models\UpdateDeploymentCellResponse;
use AntChain\Deps\Models\QueryDeploymentRequest;
use AntChain\Deps\Models\QueryDeploymentResponse;
use AntChain\Deps\Models\CancelDeploymentRequest;
use AntChain\Deps\Models\CancelDeploymentResponse;
use AntChain\Deps\Models\CreateDeploymentRequest;
use AntChain\Deps\Models\CreateDeploymentResponse;
use AntChain\Deps\Models\GetDeploymentRequest;
use AntChain\Deps\Models\GetDeploymentResponse;
use AntChain\Deps\Models\RetryDeploymentRequest;
use AntChain\Deps\Models\RetryDeploymentResponse;
use AntChain\Deps\Models\StartDeploymentRequest;
use AntChain\Deps\Models\StartDeploymentResponse;
use AntChain\Deps\Models\GetDeploymentApplicationRequest;
use AntChain\Deps\Models\GetDeploymentApplicationResponse;
use AntChain\Deps\Models\RollbackDeploymentApplicationRequest;
use AntChain\Deps\Models\RollbackDeploymentApplicationResponse;
use AntChain\Deps\Models\ReinitDeploymentRequest;
use AntChain\Deps\Models\ReinitDeploymentResponse;
use AntChain\Deps\Models\QueryCmdtemplateRequest;
use AntChain\Deps\Models\QueryCmdtemplateResponse;
use AntChain\Deps\Models\GetCmdtemplateRequest;
use AntChain\Deps\Models\GetCmdtemplateResponse;
use AntChain\Deps\Models\SyncexecuteCmdTaskRequest;
use AntChain\Deps\Models\SyncexecuteCmdTaskResponse;
use AntChain\Deps\Models\AsyncexecuteCmdTaskRequest;
use AntChain\Deps\Models\AsyncexecuteCmdTaskResponse;
use AntChain\Deps\Models\GetCmdTaskRequest;
use AntChain\Deps\Models\GetCmdTaskResponse;
use AntChain\Deps\Models\CreateAppopsRequest;
use AntChain\Deps\Models\CreateAppopsResponse;
use AntChain\Deps\Models\GetAppopsRequest;
use AntChain\Deps\Models\GetAppopsResponse;
use AntChain\Deps\Models\StartAppopsRequest;
use AntChain\Deps\Models\StartAppopsResponse;
use AntChain\Deps\Models\ReinitAppopsRequest;
use AntChain\Deps\Models\ReinitAppopsResponse;
use AntChain\Deps\Models\CancelAppopsRequest;
use AntChain\Deps\Models\CancelAppopsResponse;
use AntChain\Deps\Models\RetryAppopsRequest;
use AntChain\Deps\Models\RetryAppopsResponse;
use AntChain\Deps\Models\CreateComputeropsRequest;
use AntChain\Deps\Models\CreateComputeropsResponse;
use AntChain\Deps\Models\GetComputeropsRequest;
use AntChain\Deps\Models\GetComputeropsResponse;
use AntChain\Deps\Models\StartComputeropsRequest;
use AntChain\Deps\Models\StartComputeropsResponse;
use AntChain\Deps\Models\ReinitComputeropsRequest;
use AntChain\Deps\Models\ReinitComputeropsResponse;
use AntChain\Deps\Models\CancelComputeropsRequest;
use AntChain\Deps\Models\CancelComputeropsResponse;
use AntChain\Deps\Models\RetryComputeropsRequest;
use AntChain\Deps\Models\RetryComputeropsResponse;
use AntChain\Deps\Models\QueryOpsappsvcRequest;
use AntChain\Deps\Models\QueryOpsappsvcResponse;
use AntChain\Deps\Models\AsyncexecuteBashcmdRequest;
use AntChain\Deps\Models\AsyncexecuteBashcmdResponse;
use AntChain\Deps\Models\GetBashcmdResultRequest;
use AntChain\Deps\Models\GetBashcmdResultResponse;
use AntChain\Deps\Models\CheckCloudconfigBgreleaseRequest;
use AntChain\Deps\Models\CheckCloudconfigBgreleaseResponse;
use AntChain\Deps\Models\CheckCloudconfigBgdeploymentcellRequest;
use AntChain\Deps\Models\CheckCloudconfigBgdeploymentcellResponse;
use AntChain\Deps\Models\CheckCloudconfigAppserviceRequest;
use AntChain\Deps\Models\CheckCloudconfigAppserviceResponse;
use AntChain\Deps\Models\CheckCloudconfigSharedmwRequest;
use AntChain\Deps\Models\CheckCloudconfigSharedmwResponse;
use AntChain\Deps\Models\CheckCloudconfigVonereleaseRequest;
use AntChain\Deps\Models\CheckCloudconfigVonereleaseResponse;
use AntChain\Deps\Models\CheckCloudconfigVoneappopsRequest;
use AntChain\Deps\Models\CheckCloudconfigVoneappopsResponse;
use AntChain\Deps\Models\CheckCloudconfigOlduiRequest;
use AntChain\Deps\Models\CheckCloudconfigOlduiResponse;
use AntChain\Deps\Models\CheckCloudconfigXdclbforbiddenRequest;
use AntChain\Deps\Models\CheckCloudconfigXdclbforbiddenResponse;
use AntChain\Deps\Models\QueryCloudconfigOpenapiconfigRequest;
use AntChain\Deps\Models\QueryCloudconfigOpenapiconfigResponse;
use AntChain\Deps\Models\CountAppsPkgRequest;
use AntChain\Deps\Models\CountAppsPkgResponse;
use AntChain\Deps\Models\QueryAppUnitresourcesRequest;
use AntChain\Deps\Models\QueryAppUnitresourcesResponse;
use AntChain\Deps\Models\QueryOauthTokenRequest;
use AntChain\Deps\Models\QueryOauthTokenResponse;
use AntChain\Deps\Models\UpdateOauthTokenRequest;
use AntChain\Deps\Models\UpdateOauthTokenResponse;
use AntChain\Deps\Models\DeleteOauthTokenRequest;
use AntChain\Deps\Models\DeleteOauthTokenResponse;
use AntChain\Deps\Models\QueryBaseinfoDeploymentzonesRequest;
use AntChain\Deps\Models\QueryBaseinfoDeploymentzonesResponse;
use AntChain\Deps\Models\GetBgreleaseArrangementRequest;
use AntChain\Deps\Models\GetBgreleaseArrangementResponse;
use AntChain\Deps\Models\QueryBgreleaseArrangementRequest;
use AntChain\Deps\Models\QueryBgreleaseArrangementResponse;
use AntChain\Deps\Models\QueryBgreleaseArrangementprogressRequest;
use AntChain\Deps\Models\QueryBgreleaseArrangementprogressResponse;
use AntChain\Deps\Models\QueryBgreleaseTaskprogressRequest;
use AntChain\Deps\Models\QueryBgreleaseTaskprogressResponse;
use AntChain\Deps\Models\ExecBgreleaseArrangementRequest;
use AntChain\Deps\Models\ExecBgreleaseArrangementResponse;
use AntChain\Deps\Models\ConfirmBgreleaseArrangementRequest;
use AntChain\Deps\Models\ConfirmBgreleaseArrangementResponse;
use AntChain\Deps\Models\ConfirmBgreleaseArrangementvalidationRequest;
use AntChain\Deps\Models\ConfirmBgreleaseArrangementvalidationResponse;
use AntChain\Deps\Models\RetryBgreleaseArrangementRequest;
use AntChain\Deps\Models\RetryBgreleaseArrangementResponse;
use AntChain\Deps\Models\RetryBgreleaseTaskRequest;
use AntChain\Deps\Models\RetryBgreleaseTaskResponse;
use AntChain\Deps\Models\SkipBgreleaseTaskRequest;
use AntChain\Deps\Models\SkipBgreleaseTaskResponse;
use AntChain\Deps\Models\SkipBgreleaseArrangementRequest;
use AntChain\Deps\Models\SkipBgreleaseArrangementResponse;
use AntChain\Deps\Models\CancelBgreleaseArrangementRequest;
use AntChain\Deps\Models\CancelBgreleaseArrangementResponse;
use AntChain\Deps\Models\RollbackBgreleaseArrangementRequest;
use AntChain\Deps\Models\RollbackBgreleaseArrangementResponse;
use AntChain\Deps\Models\RetryrollbackBgreleaseArrangementRequest;
use AntChain\Deps\Models\RetryrollbackBgreleaseArrangementResponse;
use AntChain\Deps\Models\ConfirmrollbackBgreleaseArrangementRequest;
use AntChain\Deps\Models\ConfirmrollbackBgreleaseArrangementResponse;
use AntChain\Deps\Models\SwitchBgreleaseGraytrafficRequest;
use AntChain\Deps\Models\SwitchBgreleaseGraytrafficResponse;
use AntChain\Deps\Models\RollbackBgreleaseGraytrafficRequest;
use AntChain\Deps\Models\RollbackBgreleaseGraytrafficResponse;
use AntChain\Deps\Models\QueryBgreleaseGrayprogressRequest;
use AntChain\Deps\Models\QueryBgreleaseGrayprogressResponse;
use AntChain\Deps\Models\GetGrayProcessRequest;
use AntChain\Deps\Models\GetGrayProcessResponse;
use AntChain\Deps\Models\QueryGrayProgressRequest;
use AntChain\Deps\Models\QueryGrayProgressResponse;
use AntChain\Deps\Models\ReinitGrayProcessRequest;
use AntChain\Deps\Models\ReinitGrayProcessResponse;
use AntChain\Deps\Models\RetryGrayTaskRequest;
use AntChain\Deps\Models\RetryGrayTaskResponse;
use AntChain\Deps\Models\SkipGrayTaskRequest;
use AntChain\Deps\Models\SkipGrayTaskResponse;
use AntChain\Deps\Models\QueryMachineRequest;
use AntChain\Deps\Models\QueryMachineResponse;
use AntChain\Deps\Models\GetMachineRequest;
use AntChain\Deps\Models\GetMachineResponse;
use AntChain\Deps\Models\QueryMachineProgressRequest;
use AntChain\Deps\Models\QueryMachineProgressResponse;
use AntChain\Deps\Models\RetryMachineRequest;
use AntChain\Deps\Models\RetryMachineResponse;
use AntChain\Deps\Models\SkipMachineRequest;
use AntChain\Deps\Models\SkipMachineResponse;
use AntChain\Deps\Models\CancelMachineRequest;
use AntChain\Deps\Models\CancelMachineResponse;
use AntChain\Deps\Models\ExecMachineRequest;
use AntChain\Deps\Models\ExecMachineResponse;
use AntChain\Deps\Models\QueryMachinegroupProgressRequest;
use AntChain\Deps\Models\QueryMachinegroupProgressResponse;
use AntChain\Deps\Models\RetryMachinegroupRequest;
use AntChain\Deps\Models\RetryMachinegroupResponse;
use AntChain\Deps\Models\SkipMachinegroupRequest;
use AntChain\Deps\Models\SkipMachinegroupResponse;
use AntChain\Deps\Models\CancelMachinegroupRequest;
use AntChain\Deps\Models\CancelMachinegroupResponse;
use AntChain\Deps\Models\DeleteMachinegroupRequest;
use AntChain\Deps\Models\DeleteMachinegroupResponse;
use AntChain\Deps\Models\UpdateMachinegroupRequest;
use AntChain\Deps\Models\UpdateMachinegroupResponse;
use AntChain\Deps\Models\ConfirmMachinegroupRequest;
use AntChain\Deps\Models\ConfirmMachinegroupResponse;
use AntChain\Deps\Models\BatchqueryMachinegroupProgressRequest;
use AntChain\Deps\Models\BatchqueryMachinegroupProgressResponse;
use AntChain\Deps\Models\ConfirmMachinegroupReserveRequest;
use AntChain\Deps\Models\ConfirmMachinegroupReserveResponse;
use AntChain\Deps\Models\UpdateMachinegroupSlbmountweightRequest;
use AntChain\Deps\Models\UpdateMachinegroupSlbmountweightResponse;
use AntChain\Deps\Models\QueryMachinegroupSlbmountprogressRequest;
use AntChain\Deps\Models\QueryMachinegroupSlbmountprogressResponse;
use AntChain\Deps\Models\QueryMachinegroupSlbmountRequest;
use AntChain\Deps\Models\QueryMachinegroupSlbmountResponse;
use AntChain\Deps\Models\GetMachinegroupRequest;
use AntChain\Deps\Models\GetMachinegroupResponse;
use AntChain\Deps\Models\SkipMachinetaskRequest;
use AntChain\Deps\Models\SkipMachinetaskResponse;
use AntChain\Deps\Models\RetryMachinetaskRequest;
use AntChain\Deps\Models\RetryMachinetaskResponse;
use AntChain\Deps\Models\QueryMetaCellRequest;
use AntChain\Deps\Models\QueryMetaCellResponse;
use AntChain\Deps\Models\CreateMetaDeploymentcellRequest;
use AntChain\Deps\Models\CreateMetaDeploymentcellResponse;
use AntChain\Deps\Models\UpdateMetaDeploymentcellRequest;
use AntChain\Deps\Models\UpdateMetaDeploymentcellResponse;
use AntChain\Deps\Models\GetMetaDeploymentcellRequest;
use AntChain\Deps\Models\GetMetaDeploymentcellResponse;
use AntChain\Deps\Models\QueryMetaDeploymentcellRequest;
use AntChain\Deps\Models\QueryMetaDeploymentcellResponse;
use AntChain\Deps\Models\CreateNotificationConfigRequest;
use AntChain\Deps\Models\CreateNotificationConfigResponse;
use AntChain\Deps\Models\UpdateNotificationConfigRequest;
use AntChain\Deps\Models\UpdateNotificationConfigResponse;
use AntChain\Deps\Models\QueryNotificationConfigRequest;
use AntChain\Deps\Models\QueryNotificationConfigResponse;
use AntChain\Deps\Models\DeleteNotificationConfigRequest;
use AntChain\Deps\Models\DeleteNotificationConfigResponse;
use AntChain\Deps\Models\QueryOperatorRequest;
use AntChain\Deps\Models\QueryOperatorResponse;
use AntChain\Deps\Models\RollbackPlanServiceRequest;
use AntChain\Deps\Models\RollbackPlanServiceResponse;
use AntChain\Deps\Models\CreatePlanRequest;
use AntChain\Deps\Models\CreatePlanResponse;
use AntChain\Deps\Models\CheckPlanRequest;
use AntChain\Deps\Models\CheckPlanResponse;
use AntChain\Deps\Models\CheckPlanOperationRequest;
use AntChain\Deps\Models\CheckPlanOperationResponse;
use AntChain\Deps\Models\CreatePlanOperationRequest;
use AntChain\Deps\Models\CreatePlanOperationResponse;
use AntChain\Deps\Models\CreatePlanAdvancedRequest;
use AntChain\Deps\Models\CreatePlanAdvancedResponse;
use AntChain\Deps\Models\ReinitPlanRequest;
use AntChain\Deps\Models\ReinitPlanResponse;
use AntChain\Deps\Models\GetPlanRequest;
use AntChain\Deps\Models\GetPlanResponse;
use AntChain\Deps\Models\GetPlanBasicRequest;
use AntChain\Deps\Models\GetPlanBasicResponse;
use AntChain\Deps\Models\GetPlanProgressRequest;
use AntChain\Deps\Models\GetPlanProgressResponse;
use AntChain\Deps\Models\QueryPlanRequest;
use AntChain\Deps\Models\QueryPlanResponse;
use AntChain\Deps\Models\CountPlanStateRequest;
use AntChain\Deps\Models\CountPlanStateResponse;
use AntChain\Deps\Models\ExecPlanRequest;
use AntChain\Deps\Models\ExecPlanResponse;
use AntChain\Deps\Models\RetryPlanRequest;
use AntChain\Deps\Models\RetryPlanResponse;
use AntChain\Deps\Models\CancelPlanRequest;
use AntChain\Deps\Models\CancelPlanResponse;
use AntChain\Deps\Models\RollbackPlanRequest;
use AntChain\Deps\Models\RollbackPlanResponse;
use AntChain\Deps\Models\GetTaskSummaryRequest;
use AntChain\Deps\Models\GetTaskSummaryResponse;
use AntChain\Deps\Models\SkipTaskRequest;
use AntChain\Deps\Models\SkipTaskResponse;
use AntChain\Deps\Models\RetryTaskRequest;
use AntChain\Deps\Models\RetryTaskResponse;
use AntChain\Deps\Models\QueryRoleRequest;
use AntChain\Deps\Models\QueryRoleResponse;
use AntChain\Deps\Models\CreateServicegroupcollectionRequest;
use AntChain\Deps\Models\CreateServicegroupcollectionResponse;
use AntChain\Deps\Models\DeleteServicegroupcollectionRequest;
use AntChain\Deps\Models\DeleteServicegroupcollectionResponse;
use AntChain\Deps\Models\RetryServicegroupRequest;
use AntChain\Deps\Models\RetryServicegroupResponse;
use AntChain\Deps\Models\ExecServicegroupRequest;
use AntChain\Deps\Models\ExecServicegroupResponse;
use AntChain\Deps\Models\SkipServicegroupRequest;
use AntChain\Deps\Models\SkipServicegroupResponse;
use AntChain\Deps\Models\CreateServicegroupRequest;
use AntChain\Deps\Models\CreateServicegroupResponse;
use AntChain\Deps\Models\DeleteServicegroupRequest;
use AntChain\Deps\Models\DeleteServicegroupResponse;
use AntChain\Deps\Models\SwitchServicegroupRequest;
use AntChain\Deps\Models\SwitchServicegroupResponse;
use AntChain\Deps\Models\GetServiceRequest;
use AntChain\Deps\Models\GetServiceResponse;
use AntChain\Deps\Models\GetServiceProgressRequest;
use AntChain\Deps\Models\GetServiceProgressResponse;
use AntChain\Deps\Models\QueryServiceProgressRequest;
use AntChain\Deps\Models\QueryServiceProgressResponse;
use AntChain\Deps\Models\QueryServiceSlbmountRequest;
use AntChain\Deps\Models\QueryServiceSlbmountResponse;
use AntChain\Deps\Models\BatchqueryServiceSlbmountRequest;
use AntChain\Deps\Models\BatchqueryServiceSlbmountResponse;
use AntChain\Deps\Models\UpdateServiceSlbmountRequest;
use AntChain\Deps\Models\UpdateServiceSlbmountResponse;
use AntChain\Deps\Models\QueryServiceSlbmountprogressRequest;
use AntChain\Deps\Models\QueryServiceSlbmountprogressResponse;
use AntChain\Deps\Models\QueryServiceLatestsuccessRequest;
use AntChain\Deps\Models\QueryServiceLatestsuccessResponse;
use AntChain\Deps\Models\ReinitServiceRequest;
use AntChain\Deps\Models\ReinitServiceResponse;
use AntChain\Deps\Models\ExecServiceRequest;
use AntChain\Deps\Models\ExecServiceResponse;
use AntChain\Deps\Models\CancelServiceRequest;
use AntChain\Deps\Models\CancelServiceResponse;
use AntChain\Deps\Models\SkipServiceRequest;
use AntChain\Deps\Models\SkipServiceResponse;
use AntChain\Deps\Models\StartServiceRequest;
use AntChain\Deps\Models\StartServiceResponse;
use AntChain\Deps\Models\ConfirmServiceRequest;
use AntChain\Deps\Models\ConfirmServiceResponse;
use AntChain\Deps\Models\SetServiceMachinegroupRequest;
use AntChain\Deps\Models\SetServiceMachinegroupResponse;
use AntChain\Deps\Models\ReinitServiceMachinegroupRequest;
use AntChain\Deps\Models\ReinitServiceMachinegroupResponse;
use AntChain\Deps\Models\ListServiceRollbackversionRequest;
use AntChain\Deps\Models\ListServiceRollbackversionResponse;
use AntChain\Deps\Models\QueryServiceRollbackversionRequest;
use AntChain\Deps\Models\QueryServiceRollbackversionResponse;
use AntChain\Deps\Models\RollbackServiceRequest;
use AntChain\Deps\Models\RollbackServiceResponse;
use AntChain\Deps\Models\ConfirmrollbackServiceRequest;
use AntChain\Deps\Models\ConfirmrollbackServiceResponse;
use AntChain\Deps\Models\RetryrollbackServiceRequest;
use AntChain\Deps\Models\RetryrollbackServiceResponse;
use AntChain\Deps\Models\GetServiceArrangementRequest;
use AntChain\Deps\Models\GetServiceArrangementResponse;
use AntChain\Deps\Models\RetryServiceArrangementRequest;
use AntChain\Deps\Models\RetryServiceArrangementResponse;
use AntChain\Deps\Models\SkipServiceArrangementRequest;
use AntChain\Deps\Models\SkipServiceArrangementResponse;
use AntChain\Deps\Models\QueryOperationlogRequest;
use AntChain\Deps\Models\QueryOperationlogResponse;
use AntChain\Deps\Models\QueryOperationlogTimelineRequest;
use AntChain\Deps\Models\QueryOperationlogTimelineResponse;
use AntChain\Deps\Models\GetServiceDetailRequest;
use AntChain\Deps\Models\GetServiceDetailResponse;
use AntChain\Deps\Models\CreateMetaCellRequest;
use AntChain\Deps\Models\CreateMetaCellResponse;
use AntChain\Deps\Models\UpdateMetaCellRequest;
use AntChain\Deps\Models\UpdateMetaCellResponse;
use AntChain\Deps\Models\AddMetaMasterzonerelRequest;
use AntChain\Deps\Models\AddMetaMasterzonerelResponse;
use AntChain\Deps\Models\AssignComputerRequest;
use AntChain\Deps\Models\AssignComputerResponse;
use AntChain\Deps\Models\ReleaseComputerRequest;
use AntChain\Deps\Models\ReleaseComputerResponse;
use AntChain\Deps\Models\GetTaskRequest;
use AntChain\Deps\Models\GetTaskResponse;
use AntChain\Deps\Models\CreateComputerRequest;
use AntChain\Deps\Models\CreateComputerResponse;
use AntChain\Deps\Models\CreateSidecarRequest;
use AntChain\Deps\Models\CreateSidecarResponse;
use AntChain\Deps\Models\ListSidecarRequest;
use AntChain\Deps\Models\ListSidecarResponse;
use AntChain\Deps\Models\CreateSidecarVersionRequest;
use AntChain\Deps\Models\CreateSidecarVersionResponse;
use AntChain\Deps\Models\ListSidecarVersionRequest;
use AntChain\Deps\Models\ListSidecarVersionResponse;
use AntChain\Deps\Models\GetSidecarVersionRequest;
use AntChain\Deps\Models\GetSidecarVersionResponse;
use AntChain\Deps\Models\CreateSidecarRuleRequest;
use AntChain\Deps\Models\CreateSidecarRuleResponse;
use AntChain\Deps\Models\GetSidecarRuleRequest;
use AntChain\Deps\Models\GetSidecarRuleResponse;
use AntChain\Deps\Models\ListSidecarRuleRequest;
use AntChain\Deps\Models\ListSidecarRuleResponse;
use AntChain\Deps\Models\CreateSidecarInstanceRequest;
use AntChain\Deps\Models\CreateSidecarInstanceResponse;
use AntChain\Deps\Models\ListSidecarInstanceRequest;
use AntChain\Deps\Models\ListSidecarInstanceResponse;
use AntChain\Deps\Models\GetSidecarInstanceRequest;
use AntChain\Deps\Models\GetSidecarInstanceResponse;
use AntChain\Deps\Models\GetSidecarRequest;
use AntChain\Deps\Models\GetSidecarResponse;
use AntChain\Deps\Models\UpdateSidecarRequest;
use AntChain\Deps\Models\UpdateSidecarResponse;
use AntChain\Deps\Models\DeleteSidecarRequest;
use AntChain\Deps\Models\DeleteSidecarResponse;
use AntChain\Deps\Models\UpdateSidecarVersionRequest;
use AntChain\Deps\Models\UpdateSidecarVersionResponse;
use AntChain\Deps\Models\DeleteSidecarVersionRequest;
use AntChain\Deps\Models\DeleteSidecarVersionResponse;
use AntChain\Deps\Models\UpdateSidecarInstanceRequest;
use AntChain\Deps\Models\UpdateSidecarInstanceResponse;
use AntChain\Deps\Models\DeleteSidecarInstanceRequest;
use AntChain\Deps\Models\DeleteSidecarInstanceResponse;
use AntChain\Deps\Models\UpdateSidecarRuleRequest;
use AntChain\Deps\Models\UpdateSidecarRuleResponse;
use AntChain\Deps\Models\DeleteSidecarRuleRequest;
use AntChain\Deps\Models\DeleteSidecarRuleResponse;
use AntChain\Deps\Models\UpdateSidecarVersionstatusRequest;
use AntChain\Deps\Models\UpdateSidecarVersionstatusResponse;
use AntChain\Deps\Models\UpdateSidecarInstancestatusRequest;
use AntChain\Deps\Models\UpdateSidecarInstancestatusResponse;
use AntChain\Deps\Models\UpdateSidecarRulestatusRequest;
use AntChain\Deps\Models\UpdateSidecarRulestatusResponse;
use AntChain\Deps\Models\CreateAppbaselineSidecarRequest;
use AntChain\Deps\Models\CreateAppbaselineSidecarResponse;
use AntChain\Deps\Models\ListAppbaselineSidecarRequest;
use AntChain\Deps\Models\ListAppbaselineSidecarResponse;
use AntChain\Deps\Models\DeleteAppbaselineSidecarRequest;
use AntChain\Deps\Models\DeleteAppbaselineSidecarResponse;
use AntChain\Deps\Models\UpdateAppbaselineSidecarRequest;
use AntChain\Deps\Models\UpdateAppbaselineSidecarResponse;
use AntChain\Deps\Models\SaveAppbaselineSidecarRequest;
use AntChain\Deps\Models\SaveAppbaselineSidecarResponse;
use AntChain\Deps\Models\GetWorkspaceRequest;
use AntChain\Deps\Models\GetWorkspaceResponse;
use AntChain\Deps\Models\QueryWorkspaceRequest;
use AntChain\Deps\Models\QueryWorkspaceResponse;
use AntChain\Deps\Models\CreateWorkspaceRequest;
use AntChain\Deps\Models\CreateWorkspaceResponse;
use AntChain\Deps\Models\ListWorkspaceRequest;
use AntChain\Deps\Models\ListWorkspaceResponse;

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
     * @param string[] $headers
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return array the response
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $headers, $runtime){
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
            "ignoreSSL" => $runtime->ignoreSSL,
            // 键值对
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
                    "req_msg_id" => UtilClient::getNonce(),
                    "access_key" => $this->_accessKeyId,
                    "base_sdk_version" => "TeaSDK-2.0",
                    "sdk_version" => "3.2.0"
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query["security_token"] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    "host" => Utils::defaultString($this->_endpoint, "undefined"),
                    "user-agent" => Utils::getUserAgent($this->_userAgent)
                ], $headers);
                $tmp = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body = Utils::toFormString($tmp);
                $_request->headers["content-type"] = "application/x-www-form-urlencoded";
                $signedParam = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query["sign"] = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $raw = Utils::readAsString($_response->body);
                $obj = Utils::parseJSON($raw);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap(@$res["response"]);
                if (UtilClient::hasError($raw, $this->_accessKeySecret)) {
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
     * Description: 创建一个应用。
     * Summary: 创建应用
     * @param CreateApplicationRequest $request
     * @return CreateApplicationResponse
     */
    public function createApplication($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个应用。
     * Summary: 创建应用
     * @param CreateApplicationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateApplicationResponse
     */
    public function createApplicationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateApplicationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一个应用服务实例。
     * Summary: 创建应用服务实例
     * @param CreateApplicationServiceRequest $request
     * @return CreateApplicationServiceResponse
     */
    public function createApplicationService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createApplicationServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个应用服务实例。
     * Summary: 创建应用服务实例
     * @param CreateApplicationServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateApplicationServiceResponse
     */
    public function createApplicationServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateApplicationServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.service.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询是否启用应用服务实例。
     * Summary: 查询是否启用应用服务实例
     * @param EnabledApplicationServiceRequest $request
     * @return EnabledApplicationServiceResponse
     */
    public function enabledApplicationService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->enabledApplicationServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询是否启用应用服务实例。
     * Summary: 查询是否启用应用服务实例
     * @param EnabledApplicationServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return EnabledApplicationServiceResponse
     */
    public function enabledApplicationServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return EnabledApplicationServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.service.enabled", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取一个应用详情。
     * Summary: 获取应用
     * @param GetApplicationRequest $request
     * @return GetApplicationResponse
     */
    public function getApplication($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取一个应用详情。
     * Summary: 获取应用
     * @param GetApplicationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetApplicationResponse
     */
    public function getApplicationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetApplicationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取一个应用服务详情。
     * Summary: 获取应用服务
     * @param GetApplicationServiceRequest $request
     * @return GetApplicationServiceResponse
     */
    public function getApplicationService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getApplicationServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取一个应用服务详情。
     * Summary: 获取应用服务
     * @param GetApplicationServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetApplicationServiceResponse
     */
    public function getApplicationServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetApplicationServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.service.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用服务实例列表。
     * Summary: 查询应用服务实例列表
     * @param QueryApplicationServiceRequest $request
     * @return QueryApplicationServiceResponse
     */
    public function queryApplicationService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryApplicationServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用服务实例列表。
     * Summary: 查询应用服务实例列表
     * @param QueryApplicationServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryApplicationServiceResponse
     */
    public function queryApplicationServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryApplicationServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.service.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除一个应用服务实例
     * Summary: 删除一个应用服务实例
     * @param DeleteApplicationServiceRequest $request
     * @return DeleteApplicationServiceResponse
     */
    public function deleteApplicationService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteApplicationServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除一个应用服务实例
     * Summary: 删除一个应用服务实例
     * @param DeleteApplicationServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteApplicationServiceResponse
     */
    public function deleteApplicationServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteApplicationServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.service.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取应用发布包详情包括下载地址、校验码等。
     * Summary: 获取应用发布包详情包括下载地址、校验码等。
     * @param GetApplicationPackageRequest $request
     * @return GetApplicationPackageResponse
     */
    public function getApplicationPackage($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getApplicationPackageEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取应用发布包详情包括下载地址、校验码等。
     * Summary: 获取应用发布包详情包括下载地址、校验码等。
     * @param GetApplicationPackageRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetApplicationPackageResponse
     */
    public function getApplicationPackageEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetApplicationPackageResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.package.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用发布包版本详情
     * Summary: 查询应用发布包版本详情
     * @param QueryAppVersionRequest $request
     * @return QueryAppVersionResponse
     */
    public function queryAppVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用发布包版本详情
     * Summary: 查询应用发布包版本详情
     * @param QueryAppVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppVersionResponse
     */
    public function queryAppVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppVersionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.version.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除一个应用。
     * Summary: 删除应用
     * @param DeleteApplicationRequest $request
     * @return DeleteApplicationResponse
     */
    public function deleteApplication($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除一个应用。
     * Summary: 删除应用
     * @param DeleteApplicationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteApplicationResponse
     */
    public function deleteApplicationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteApplicationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取租户应用列表。
     * Summary: 列出应用
     * @param ListApplicationRequest $request
     * @return ListApplicationResponse
     */
    public function listApplication($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取租户应用列表。
     * Summary: 列出应用
     * @param ListApplicationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListApplicationResponse
     */
    public function listApplicationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListApplicationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取租户应用分组列表。
     * Summary: 列出应用分组
     * @param ListAppgroupRequest $request
     * @return ListAppgroupResponse
     */
    public function listAppgroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取租户应用分组列表。
     * Summary: 列出应用分组
     * @param ListAppgroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListAppgroupResponse
     */
    public function listAppgroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListAppgroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appgroup.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
     * Summary: 查询应用计算资源
     * @param QueryApplicationComputerRequest $request
     * @return QueryApplicationComputerResponse
     */
    public function queryApplicationComputer($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryApplicationComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
     * Summary: 查询应用计算资源
     * @param QueryApplicationComputerRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryApplicationComputerResponse
     */
    public function queryApplicationComputerEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryApplicationComputerResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.computer.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取一个应用的代码库信息。
     * Summary: 获取一个应用的代码库信息
     * @param GetApplicationRepositoryRequest $request
     * @return GetApplicationRepositoryResponse
     */
    public function getApplicationRepository($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getApplicationRepositoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取一个应用的代码库信息。
     * Summary: 获取一个应用的代码库信息
     * @param GetApplicationRepositoryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetApplicationRepositoryResponse
     */
    public function getApplicationRepositoryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetApplicationRepositoryResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.repository.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据名称查询应用分组信息
     * Summary: 应用分组查询
     * @param QueryAppgroupRequest $request
     * @return QueryAppgroupResponse
     */
    public function queryAppgroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据名称查询应用分组信息
     * Summary: 应用分组查询
     * @param QueryAppgroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppgroupResponse
     */
    public function queryAppgroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppgroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appgroup.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据条件查询应用等级
     * Summary: 查询应用等级
     * @param QueryApplevelRequest $request
     * @return QueryApplevelResponse
     */
    public function queryApplevel($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryApplevelEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据条件查询应用等级
     * Summary: 查询应用等级
     * @param QueryApplevelRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryApplevelResponse
     */
    public function queryApplevelEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryApplevelResponse::fromMap($this->doRequest("1.0", "antcloud.deps.applevel.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据查询条件查询应用列表。
     * Summary: 查询应用
     * @param QueryApplicationRequest $request
     * @return QueryApplicationResponse
     */
    public function queryApplication($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据查询条件查询应用列表。
     * Summary: 查询应用
     * @param QueryApplicationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryApplicationResponse
     */
    public function queryApplicationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryApplicationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
     * 当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
     * Summary: 创建应用版本
     * @param CreateAppVersionRequest $request
     * @return CreateAppVersionResponse
     */
    public function createAppVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAppVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
     * 当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
     * Summary: 创建应用版本
     * @param CreateAppVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAppVersionResponse
     */
    public function createAppVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAppVersionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.version.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用增量统计信息
     * Summary: 查询应用增量统计信息
     * @param QueryAppDeltaRequest $request
     * @return QueryAppDeltaResponse
     */
    public function queryAppDelta($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppDeltaEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用增量统计信息
     * Summary: 查询应用增量统计信息
     * @param QueryAppDeltaRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppDeltaResponse
     */
    public function queryAppDeltaEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppDeltaResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.delta.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据指定的查询条件查询负载均衡资源列表
     * Summary: loadbalancer查询
     * @param QueryApplicationLoadbalancerRequest $request
     * @return QueryApplicationLoadbalancerResponse
     */
    public function queryApplicationLoadbalancer($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryApplicationLoadbalancerEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据指定的查询条件查询负载均衡资源列表
     * Summary: loadbalancer查询
     * @param QueryApplicationLoadbalancerRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryApplicationLoadbalancerResponse
     */
    public function queryApplicationLoadbalancerEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryApplicationLoadbalancerResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.loadbalancer.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据指定的查询条件查询数据库资源列表
     * Summary: database查询
     * @param QueryApplicationDatabaseRequest $request
     * @return QueryApplicationDatabaseResponse
     */
    public function queryApplicationDatabase($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryApplicationDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据指定的查询条件查询数据库资源列表
     * Summary: database查询
     * @param QueryApplicationDatabaseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryApplicationDatabaseResponse
     */
    public function queryApplicationDatabaseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryApplicationDatabaseResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.database.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
     * Summary: 获取上传应用发布包临时签名地址
     * @param UploadApplicationPackageRequest $request
     * @return UploadApplicationPackageResponse
     */
    public function uploadApplicationPackage($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->uploadApplicationPackageEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
     * Summary: 获取上传应用发布包临时签名地址
     * @param UploadApplicationPackageRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UploadApplicationPackageResponse
     */
    public function uploadApplicationPackageEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UploadApplicationPackageResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.package.upload", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
     * 调用步骤如下：
     * 调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
     * 通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
     * 调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
     * Summary: 同步创建对应的发布包版本信息
     * @param SyncreateApplicationVersionRequest $request
     * @return SyncreateApplicationVersionResponse
     */
    public function syncreateApplicationVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->syncreateApplicationVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
     * 调用步骤如下：
     * 调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
     * 通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
     * 调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
     * Summary: 同步创建对应的发布包版本信息
     * @param SyncreateApplicationVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SyncreateApplicationVersionResponse
     */
    public function syncreateApplicationVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SyncreateApplicationVersionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.version.syncreate", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取connection
     * Summary: 获取connection
     * @param ListCloudconnectorConnectionRequest $request
     * @return ListCloudconnectorConnectionResponse
     */
    public function listCloudconnectorConnection($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listCloudconnectorConnectionEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取connection
     * Summary: 获取connection
     * @param ListCloudconnectorConnectionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListCloudconnectorConnectionResponse
     */
    public function listCloudconnectorConnectionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListCloudconnectorConnectionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconnector.connection.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询技术栈关系
     * Summary: 查询技术栈关系
     * @param QueryAppservicebuildpackrelationRequest $request
     * @return QueryAppservicebuildpackrelationResponse
     */
    public function queryAppservicebuildpackrelation($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppservicebuildpackrelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询技术栈关系
     * Summary: 查询技术栈关系
     * @param QueryAppservicebuildpackrelationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppservicebuildpackrelationResponse
     */
    public function queryAppservicebuildpackrelationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppservicebuildpackrelationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appservicebuildpackrelation.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新应用关系
     * Summary: 更新应用关系
     * @param UpdateAppservicebuildpackrelationRequest $request
     * @return UpdateAppservicebuildpackrelationResponse
     */
    public function updateAppservicebuildpackrelation($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateAppservicebuildpackrelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新应用关系
     * Summary: 更新应用关系
     * @param UpdateAppservicebuildpackrelationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateAppservicebuildpackrelationResponse
     */
    public function updateAppservicebuildpackrelationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateAppservicebuildpackrelationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appservicebuildpackrelation.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询环境变量
     * Summary: 查询环境变量
     * @param QueryAppserviceenvparamRequest $request
     * @return QueryAppserviceenvparamResponse
     */
    public function queryAppserviceenvparam($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppserviceenvparamEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询环境变量
     * Summary: 查询环境变量
     * @param QueryAppserviceenvparamRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppserviceenvparamResponse
     */
    public function queryAppserviceenvparamEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppserviceenvparamResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appserviceenvparam.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询环境变量
     * Summary: 查询环境变量
     * @param QueryAppserviceenvparamGroupbyappservicesRequest $request
     * @return QueryAppserviceenvparamGroupbyappservicesResponse
     */
    public function queryAppserviceenvparamGroupbyappservices($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppserviceenvparamGroupbyappservicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询环境变量
     * Summary: 查询环境变量
     * @param QueryAppserviceenvparamGroupbyappservicesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppserviceenvparamGroupbyappservicesResponse
     */
    public function queryAppserviceenvparamGroupbyappservicesEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppserviceenvparamGroupbyappservicesResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appserviceenvparam.groupbyappservices.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 和修改点比较查询
     * Summary: 和修改点比较查询
     * @param QueryAppserviceenvparamQuerywithdiffRequest $request
     * @return QueryAppserviceenvparamQuerywithdiffResponse
     */
    public function queryAppserviceenvparamQuerywithdiff($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppserviceenvparamQuerywithdiffEx($request, $headers, $runtime);
    }

    /**
     * Description: 和修改点比较查询
     * Summary: 和修改点比较查询
     * @param QueryAppserviceenvparamQuerywithdiffRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppserviceenvparamQuerywithdiffResponse
     */
    public function queryAppserviceenvparamQuerywithdiffEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppserviceenvparamQuerywithdiffResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appserviceenvparam.querywithdiff.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新参数
     * Summary: 更新参数
     * @param UpdateAppserviceenvparamUpdateparamsRequest $request
     * @return UpdateAppserviceenvparamUpdateparamsResponse
     */
    public function updateAppserviceenvparamUpdateparams($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateAppserviceenvparamUpdateparamsEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新参数
     * Summary: 更新参数
     * @param UpdateAppserviceenvparamUpdateparamsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateAppserviceenvparamUpdateparamsResponse
     */
    public function updateAppserviceenvparamUpdateparamsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateAppserviceenvparamUpdateparamsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appserviceenvparam.updateparams.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据应用查询技术栈关系
     * Summary: 查询技术栈关系
     * @param QueryApptechstackrelationRequest $request
     * @return QueryApptechstackrelationResponse
     */
    public function queryApptechstackrelation($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryApptechstackrelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据应用查询技术栈关系
     * Summary: 查询技术栈关系
     * @param QueryApptechstackrelationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryApptechstackrelationResponse
     */
    public function queryApptechstackrelationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryApptechstackrelationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.apptechstackrelation.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新应用技术栈关系
     * Summary: 更新技术栈关系
     * @param UpdateApptechstackrelationRequest $request
     * @return UpdateApptechstackrelationResponse
     */
    public function updateApptechstackrelation($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateApptechstackrelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新应用技术栈关系
     * Summary: 更新技术栈关系
     * @param UpdateApptechstackrelationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateApptechstackrelationResponse
     */
    public function updateApptechstackrelationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateApptechstackrelationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.apptechstackrelation.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-创建应用
     * Summary: 应用管理-创建应用
     * @param CreateAppRequest $request
     * @return CreateAppResponse
     */
    public function createApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-创建应用
     * Summary: 应用管理-创建应用
     * @param CreateAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAppResponse
     */
    public function createAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-应用分组创建
     * Summary: 应用管理-应用分组创建
     * @param CreateAppGroupRequest $request
     * @return CreateAppGroupResponse
     */
    public function createAppGroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAppGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-应用分组创建
     * Summary: 应用管理-应用分组创建
     * @param CreateAppGroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAppGroupResponse
     */
    public function createAppGroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAppGroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.group.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-获取应用基本信息
     * Summary: 应用管理-获取应用基本信息
     * @param GetAppRequest $request
     * @return GetAppResponse
     */
    public function getApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-获取应用基本信息
     * Summary: 应用管理-获取应用基本信息
     * @param GetAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetAppResponse
     */
    public function getAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-查看应用所有应用服务数量
     * Summary: 应用管理-查看应用所有应用服务数量
     * @param CountAppServiceRequest $request
     * @return CountAppServiceResponse
     */
    public function countAppService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->countAppServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-查看应用所有应用服务数量
     * Summary: 应用管理-查看应用所有应用服务数量
     * @param CountAppServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CountAppServiceResponse
     */
    public function countAppServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CountAppServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.service.count", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
     * Summary: (废弃)获取应用所有环境的部署图(经典)
     * @param AllAppDeployviewRequest $request
     * @return AllAppDeployviewResponse
     */
    public function allAppDeployview($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->allAppDeployviewEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
     * Summary: (废弃)获取应用所有环境的部署图(经典)
     * @param AllAppDeployviewRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return AllAppDeployviewResponse
     */
    public function allAppDeployviewEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return AllAppDeployviewResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.deployview.all", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-批量查询应用
     * Summary: 应用管理-批量查询应用
     * @param QueryAppRequest $request
     * @return QueryAppResponse
     */
    public function queryApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-批量查询应用
     * Summary: 应用管理-批量查询应用
     * @param QueryAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppResponse
     */
    public function queryAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-获取应用分组
     * Summary: 应用管理-获取单个应用分组
     * @param GetAppGroupRequest $request
     * @return GetAppGroupResponse
     */
    public function getAppGroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getAppGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-获取应用分组
     * Summary: 应用管理-获取单个应用分组
     * @param GetAppGroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetAppGroupResponse
     */
    public function getAppGroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetAppGroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.group.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-批量查询应用分组
     * Summary: 应用管理-批量查询应用分组
     * @param \AntChain\Deps\Models\QueryAppGroupRequest $request
     * @return \AntChain\Deps\Models\QueryAppGroupResponse
     */
    public function queryAppGroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-批量查询应用分组
     * Summary: 应用管理-批量查询应用分组
     * @param \AntChain\Deps\Models\QueryAppGroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return \AntChain\Deps\Models\QueryAppGroupResponse
     */
    public function queryAppGroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppGroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.group.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-查询当前应用的所有应用服务
     * Summary: 应用管理-查询当前应用的所有应用服务
     * @param QueryAppServiceRequest $request
     * @return QueryAppServiceResponse
     */
    public function queryAppService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-查询当前应用的所有应用服务
     * Summary: 应用管理-查询当前应用的所有应用服务
     * @param QueryAppServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppServiceResponse
     */
    public function queryAppServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.service.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-用户收藏应用
     * Summary: 应用管理-用户收藏应用
     * @param CreateAppFavouriteRequest $request
     * @return CreateAppFavouriteResponse
     */
    public function createAppFavourite($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAppFavouriteEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-用户收藏应用
     * Summary: 应用管理-用户收藏应用
     * @param CreateAppFavouriteRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAppFavouriteResponse
     */
    public function createAppFavouriteEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAppFavouriteResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.favourite.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-用户取消收藏某应用
     * Summary: 应用管理-用户取消收藏某应用
     * @param DeleteAppFavouriteRequest $request
     * @return DeleteAppFavouriteResponse
     */
    public function deleteAppFavourite($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteAppFavouriteEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-用户取消收藏某应用
     * Summary: 应用管理-用户取消收藏某应用
     * @param DeleteAppFavouriteRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteAppFavouriteResponse
     */
    public function deleteAppFavouriteEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteAppFavouriteResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.favourite.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-更新应用信息
     * Summary: 应用管理-更新应用信息
     * @param UpdateAppRequest $request
     * @return UpdateAppResponse
     */
    public function updateApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-更新应用信息
     * Summary: 应用管理-更新应用信息
     * @param UpdateAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateAppResponse
     */
    public function updateAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-更新应用分组信息
     * Summary: 应用管理-更新应用分组信息
     * @param UpdateAppGroupRequest $request
     * @return UpdateAppGroupResponse
     */
    public function updateAppGroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateAppGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-更新应用分组信息
     * Summary: 应用管理-更新应用分组信息
     * @param UpdateAppGroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateAppGroupResponse
     */
    public function updateAppGroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateAppGroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.group.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-列出当前用户收藏的应用
     * Summary: 应用管理-列出当前用户收藏的应用
     * @param ListAppFavouriteRequest $request
     * @return ListAppFavouriteResponse
     */
    public function listAppFavourite($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listAppFavouriteEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-列出当前用户收藏的应用
     * Summary: 应用管理-列出当前用户收藏的应用
     * @param ListAppFavouriteRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListAppFavouriteResponse
     */
    public function listAppFavouriteEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListAppFavouriteResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.favourite.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-删除应用
     * Summary: 应用管理-删除应用
     * @param DeleteAppRequest $request
     * @return DeleteAppResponse
     */
    public function deleteApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-删除应用
     * Summary: 应用管理-删除应用
     * @param DeleteAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteAppResponse
     */
    public function deleteAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-删除应用分组
     * Summary: 应用管理-删除应用分组
     * @param DeleteAppGroupRequest $request
     * @return DeleteAppGroupResponse
     */
    public function deleteAppGroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteAppGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-删除应用分组
     * Summary: 应用管理-删除应用分组
     * @param DeleteAppGroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteAppGroupResponse
     */
    public function deleteAppGroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteAppGroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.group.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-应用维度查询经典应用服务发布单
     * Summary: 应用管理-应用维度查询经典应用服务发布单
     * @param QueryAppPlanRequest $request
     * @return QueryAppPlanResponse
     */
    public function queryAppPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-应用维度查询经典应用服务发布单
     * Summary: 应用管理-应用维度查询经典应用服务发布单
     * @param QueryAppPlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppPlanResponse
     */
    public function queryAppPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppPlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.plan.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
     * Summary: 应用管理-判断应用分组是否存在
     * @param ExistAppGroupRequest $request
     * @return ExistAppGroupResponse
     */
    public function existAppGroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->existAppGroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
     * Summary: 应用管理-判断应用分组是否存在
     * @param ExistAppGroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExistAppGroupResponse
     */
    public function existAppGroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExistAppGroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.group.exist", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
     * Summary: 应用管理-当前登录用户信息查询（已废弃）
     * @param QueryUserRequest $request
     * @return QueryUserResponse
     */
    public function queryUser($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
     * Summary: 应用管理-当前登录用户信息查询（已废弃）
     * @param QueryUserRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryUserResponse
     */
    public function queryUserEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryUserResponse::fromMap($this->doRequest("1.0", "antcloud.deps.user.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用管理-判断应用是否存在
     * Summary: 应用管理-判断应用是否存在
     * @param ExistAppRequest $request
     * @return ExistAppResponse
     */
    public function existApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->existAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用管理-判断应用是否存在
     * Summary: 应用管理-判断应用是否存在
     * @param ExistAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExistAppResponse
     */
    public function existAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExistAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.exist", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据应用服务实例查询对应的技术栈信息
     * Summary: 查询技术栈信息
     * @param GetApplicationBuildpackRequest $request
     * @return GetApplicationBuildpackResponse
     */
    public function getApplicationBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getApplicationBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据应用服务实例查询对应的技术栈信息
     * Summary: 查询技术栈信息
     * @param GetApplicationBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetApplicationBuildpackResponse
     */
    public function getApplicationBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetApplicationBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.buildpack.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定应用的技术栈框架信息
     * Summary: 查询指定应用的技术栈框架信息
     * @param GetApplicationTechstackRequest $request
     * @return GetApplicationTechstackResponse
     */
    public function getApplicationTechstack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getApplicationTechstackEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定应用的技术栈框架信息
     * Summary: 查询指定应用的技术栈框架信息
     * @param GetApplicationTechstackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetApplicationTechstackResponse
     */
    public function getApplicationTechstackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetApplicationTechstackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.application.techstack.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取技术栈信息
     * Summary: 获取技术栈信息
     * @param GetBuildpackRequest $request
     * @return GetBuildpackResponse
     */
    public function getBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取技术栈信息
     * Summary: 获取技术栈信息
     * @param GetBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetBuildpackResponse
     */
    public function getBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出系统支持的所有技术栈框架
     * Summary: 列出系统支持的所有技术栈框架
     * @param ListTechstackRequest $request
     * @return ListTechstackResponse
     */
    public function listTechstack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listTechstackEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出系统支持的所有技术栈框架
     * Summary: 列出系统支持的所有技术栈框架
     * @param ListTechstackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListTechstackResponse
     */
    public function listTechstackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListTechstackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.techstack.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 搜索技术栈
     * Summary: 搜索技术栈
     * @param QueryBuildpackRequest $request
     * @return QueryBuildpackResponse
     */
    public function queryBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 搜索技术栈
     * Summary: 搜索技术栈
     * @param QueryBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackResponse
     */
    public function queryBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一个技术栈
     * Summary: 创建一个技术栈
     * @param CreateBuildpackRequest $request
     * @return CreateBuildpackResponse
     */
    public function createBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个技术栈
     * Summary: 创建一个技术栈
     * @param CreateBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBuildpackResponse
     */
    public function createBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新技术栈包状态
     * Summary: 更新技术栈包状态
     * @param UploadfinishBuildpackRequest $request
     * @return UploadfinishBuildpackResponse
     */
    public function uploadfinishBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->uploadfinishBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新技术栈包状态
     * Summary: 更新技术栈包状态
     * @param UploadfinishBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UploadfinishBuildpackResponse
     */
    public function uploadfinishBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UploadfinishBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.uploadfinish", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布一个技术栈
     * Summary: 发布一个技术栈
     * @param PublishBuildpackRequest $request
     * @return PublishBuildpackResponse
     */
    public function publishBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->publishBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布一个技术栈
     * Summary: 发布一个技术栈
     * @param PublishBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PublishBuildpackResponse
     */
    public function publishBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PublishBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.publish", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新一个技术栈
     * Summary: 更新一个技术栈
     * @param UpdateBuildpackRequest $request
     * @return UpdateBuildpackResponse
     */
    public function updateBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新一个技术栈
     * Summary: 更新一个技术栈
     * @param UpdateBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBuildpackResponse
     */
    public function updateBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据名称查询
     * Summary: 根据名称查询
     * @param QueryBuildpackFindbynamesRequest $request
     * @return QueryBuildpackFindbynamesResponse
     */
    public function queryBuildpackFindbynames($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindbynamesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据名称查询
     * Summary: 根据名称查询
     * @param QueryBuildpackFindbynamesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindbynamesResponse
     */
    public function queryBuildpackFindbynamesEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindbynamesResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findbynames.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 计算
     * Summary: 计算
     * @param CountBuildpackRequest $request
     * @return CountBuildpackResponse
     */
    public function countBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->countBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 计算
     * Summary: 计算
     * @param CountBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CountBuildpackResponse
     */
    public function countBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CountBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.count", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 废弃
     * Summary: 废弃
     * @param DeprecateBuildpackRequest $request
     * @return DeprecateBuildpackResponse
     */
    public function deprecateBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deprecateBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 废弃
     * Summary: 废弃
     * @param DeprecateBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeprecateBuildpackResponse
     */
    public function deprecateBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeprecateBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.deprecate", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除
     * Summary: 批量删除
     * @param BatchdeleteBuildpackRequest $request
     * @return BatchdeleteBuildpackResponse
     */
    public function batchdeleteBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->batchdeleteBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除
     * Summary: 批量删除
     * @param BatchdeleteBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return BatchdeleteBuildpackResponse
     */
    public function batchdeleteBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return BatchdeleteBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.batchdelete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询是否存在
     * Summary: 查询是否存在
     * @param ExistBuildpackRequest $request
     * @return ExistBuildpackResponse
     */
    public function existBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->existBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询是否存在
     * Summary: 查询是否存在
     * @param ExistBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExistBuildpackResponse
     */
    public function existBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExistBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.exist", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新打包状态
     * Summary: 更新打包状态
     * @param UpdateBuildpackUpdatepackagesstatusRequest $request
     * @return UpdateBuildpackUpdatepackagesstatusResponse
     */
    public function updateBuildpackUpdatepackagesstatus($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBuildpackUpdatepackagesstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新打包状态
     * Summary: 更新打包状态
     * @param UpdateBuildpackUpdatepackagesstatusRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBuildpackUpdatepackagesstatusResponse
     */
    public function updateBuildpackUpdatepackagesstatusEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBuildpackUpdatepackagesstatusResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.updatepackagesstatus.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询版本
     * Summary: 查询版本
     * @param QueryBuildpackFindidversionpairsbyversionRequest $request
     * @return QueryBuildpackFindidversionpairsbyversionResponse
     */
    public function queryBuildpackFindidversionpairsbyversion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindidversionpairsbyversionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询版本
     * Summary: 查询版本
     * @param QueryBuildpackFindidversionpairsbyversionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindidversionpairsbyversionResponse
     */
    public function queryBuildpackFindidversionpairsbyversionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindidversionpairsbyversionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findidversionpairsbyversion.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据技术栈分组查询
     * Summary: 根据技术栈分组查询
     * @param QueryBuildpackGroupbytechstackRequest $request
     * @return QueryBuildpackGroupbytechstackResponse
     */
    public function queryBuildpackGroupbytechstack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackGroupbytechstackEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据技术栈分组查询
     * Summary: 根据技术栈分组查询
     * @param QueryBuildpackGroupbytechstackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackGroupbytechstackResponse
     */
    public function queryBuildpackGroupbytechstackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackGroupbytechstackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.groupbytechstack.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询可见技术栈
     * Summary: 查询可见技术栈
     * @param QueryBuildpackFindvisibletechstacksRequest $request
     * @return QueryBuildpackFindvisibletechstacksResponse
     */
    public function queryBuildpackFindvisibletechstacks($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindvisibletechstacksEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询可见技术栈
     * Summary: 查询可见技术栈
     * @param QueryBuildpackFindvisibletechstacksRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindvisibletechstacksResponse
     */
    public function queryBuildpackFindvisibletechstacksEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindvisibletechstacksResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findvisibletechstacks.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询可写技术栈
     * Summary: 查询可写技术栈
     * @param QueryBuildpackFindwritabletechstacksRequest $request
     * @return QueryBuildpackFindwritabletechstacksResponse
     */
    public function queryBuildpackFindwritabletechstacks($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindwritabletechstacksEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询可写技术栈
     * Summary: 查询可写技术栈
     * @param QueryBuildpackFindwritabletechstacksRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindwritabletechstacksResponse
     */
    public function queryBuildpackFindwritabletechstacksEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindwritabletechstacksResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findwritabletechstacks.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询os通过当前云
     * Summary: 查询os通过当前云
     * @param QueryBuildpackFindosbycurrentcloudRequest $request
     * @return QueryBuildpackFindosbycurrentcloudResponse
     */
    public function queryBuildpackFindosbycurrentcloud($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindosbycurrentcloudEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询os通过当前云
     * Summary: 查询os通过当前云
     * @param QueryBuildpackFindosbycurrentcloudRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindosbycurrentcloudResponse
     */
    public function queryBuildpackFindosbycurrentcloudEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindosbycurrentcloudResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findosbycurrentcloud.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过appv1查询buildpack
     * Summary: 查询buildpack
     * @param QueryBuildpackFindbyappsvRequest $request
     * @return QueryBuildpackFindbyappsvResponse
     */
    public function queryBuildpackFindbyappsv($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindbyappsvEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过appv1查询buildpack
     * Summary: 查询buildpack
     * @param QueryBuildpackFindbyappsvRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindbyappsvResponse
     */
    public function queryBuildpackFindbyappsvEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindbyappsvResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findbyappsv.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过app查询
     * Summary: 通过app查询
     * @param QueryBuildpackFindbyappsRequest $request
     * @return QueryBuildpackFindbyappsResponse
     */
    public function queryBuildpackFindbyapps($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindbyappsEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过app查询
     * Summary: 通过app查询
     * @param QueryBuildpackFindbyappsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindbyappsResponse
     */
    public function queryBuildpackFindbyappsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindbyappsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findbyapps.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过app服务查询
     * Summary: 通过app服务查询
     * @param QueryBuildpackFindbyappservicesRequest $request
     * @return QueryBuildpackFindbyappservicesResponse
     */
    public function queryBuildpackFindbyappservices($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindbyappservicesEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过app服务查询
     * Summary: 通过app服务查询
     * @param QueryBuildpackFindbyappservicesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindbyappservicesResponse
     */
    public function queryBuildpackFindbyappservicesEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindbyappservicesResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findbyappservices.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过appv1查询
     * Summary: 通过appv1查询
     * @param QueryBuildpackFindbyappvRequest $request
     * @return QueryBuildpackFindbyappvResponse
     */
    public function queryBuildpackFindbyappv($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindbyappvEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过appv1查询
     * Summary: 通过appv1查询
     * @param QueryBuildpackFindbyappvRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindbyappvResponse
     */
    public function queryBuildpackFindbyappvEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindbyappvResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findbyappv.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过app查询
     * Summary: 通过app查询
     * @param QueryBuildpackFindbyappRequest $request
     * @return QueryBuildpackFindbyappResponse
     */
    public function queryBuildpackFindbyapp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindbyappEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过app查询
     * Summary: 通过app查询
     * @param QueryBuildpackFindbyappRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindbyappResponse
     */
    public function queryBuildpackFindbyappEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindbyappResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findbyapp.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生成url
     * Summary: 生成url
     * @param CreateBuildpackGeneratesignurlRequest $request
     * @return CreateBuildpackGeneratesignurlResponse
     */
    public function createBuildpackGeneratesignurl($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBuildpackGeneratesignurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 生成url
     * Summary: 生成url
     * @param CreateBuildpackGeneratesignurlRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBuildpackGeneratesignurlResponse
     */
    public function createBuildpackGeneratesignurlEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBuildpackGeneratesignurlResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.generatesignurl.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询pagessize
     * Summary: 查询pagessize
     * @param QueryBuildpackSumpackagessizeRequest $request
     * @return QueryBuildpackSumpackagessizeResponse
     */
    public function queryBuildpackSumpackagessize($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackSumpackagessizeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询pagessize
     * Summary: 查询pagessize
     * @param QueryBuildpackSumpackagessizeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackSumpackagessizeResponse
     */
    public function queryBuildpackSumpackagessizeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackSumpackagessizeResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.sumpackagessize.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询是否supportcode
     * Summary: 查询是否supportcode
     * @param QueryBuildpackSupportcoderepoRequest $request
     * @return QueryBuildpackSupportcoderepoResponse
     */
    public function queryBuildpackSupportcoderepo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackSupportcoderepoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询是否supportcode
     * Summary: 查询是否supportcode
     * @param QueryBuildpackSupportcoderepoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackSupportcoderepoResponse
     */
    public function queryBuildpackSupportcoderepoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackSupportcoderepoResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.supportcoderepo.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过可用的app服务id查询Composite信息
     * Summary: 查询Composite信息
     * @param QueryBuildpackFindavailablebyappserviceidsRequest $request
     * @return QueryBuildpackFindavailablebyappserviceidsResponse
     */
    public function queryBuildpackFindavailablebyappserviceids($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpackFindavailablebyappserviceidsEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过可用的app服务id查询Composite信息
     * Summary: 查询Composite信息
     * @param QueryBuildpackFindavailablebyappserviceidsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpackFindavailablebyappserviceidsResponse
     */
    public function queryBuildpackFindavailablebyappserviceidsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpackFindavailablebyappserviceidsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.findavailablebyappserviceids.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: pageQuery
     * Summary: pageQuery
     * @param QueryBuildpacknewRequest $request
     * @return QueryBuildpacknewResponse
     */
    public function queryBuildpacknew($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBuildpacknewEx($request, $headers, $runtime);
    }

    /**
     * Description: pageQuery
     * Summary: pageQuery
     * @param QueryBuildpacknewRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBuildpacknewResponse
     */
    public function queryBuildpacknewEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBuildpacknewResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpacknew.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: buildpacknewget
     * Summary: buildpacknewget
     * @param GetBuildpacknewRequest $request
     * @return GetBuildpacknewResponse
     */
    public function getBuildpacknew($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getBuildpacknewEx($request, $headers, $runtime);
    }

    /**
     * Description: buildpacknewget
     * Summary: buildpacknewget
     * @param GetBuildpacknewRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetBuildpacknewResponse
     */
    public function getBuildpacknewEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetBuildpacknewResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpacknew.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update
     * Summary: update
     * @param UpdateBuildpacknewUploadfinishRequest $request
     * @return UpdateBuildpacknewUploadfinishResponse
     */
    public function updateBuildpacknewUploadfinish($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBuildpacknewUploadfinishEx($request, $headers, $runtime);
    }

    /**
     * Description: update
     * Summary: update
     * @param UpdateBuildpacknewUploadfinishRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBuildpacknewUploadfinishResponse
     */
    public function updateBuildpacknewUploadfinishEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBuildpacknewUploadfinishResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpacknew.uploadfinish.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update
     * Summary: update
     * @param UpdateBuildpacknewRequest $request
     * @return UpdateBuildpacknewResponse
     */
    public function updateBuildpacknew($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateBuildpacknewEx($request, $headers, $runtime);
    }

    /**
     * Description: update
     * Summary: update
     * @param UpdateBuildpacknewRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateBuildpacknewResponse
     */
    public function updateBuildpacknewEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateBuildpacknewResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpacknew.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建技术栈
     * Summary: 创建技术栈
     * @param CreateBuildpacknewRequest $request
     * @return CreateBuildpacknewResponse
     */
    public function createBuildpacknew($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createBuildpacknewEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建技术栈
     * Summary: 创建技术栈
     * @param CreateBuildpacknewRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateBuildpacknewResponse
     */
    public function createBuildpacknewEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateBuildpacknewResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpacknew.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布一个技术栈
     * Summary: 发布一个技术栈
     * @param OnlineBuildpackRequest $request
     * @return OnlineBuildpackResponse
     */
    public function onlineBuildpack($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->onlineBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布一个技术栈
     * Summary: 发布一个技术栈
     * @param OnlineBuildpackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return OnlineBuildpackResponse
     */
    public function onlineBuildpackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return OnlineBuildpackResponse::fromMap($this->doRequest("1.0", "antcloud.deps.buildpack.online", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一个全局参数
     * Summary: 创建一个全局参数
     * @param CreateConfigGlobalRequest $request
     * @return CreateConfigGlobalResponse
     */
    public function createConfigGlobal($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createConfigGlobalEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个全局参数
     * Summary: 创建一个全局参数
     * @param CreateConfigGlobalRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateConfigGlobalResponse
     */
    public function createConfigGlobalEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateConfigGlobalResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.global.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除一个全局参数
     * Summary: 删除一个全局参数
     * @param DeleteConfigGlobalRequest $request
     * @return DeleteConfigGlobalResponse
     */
    public function deleteConfigGlobal($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteConfigGlobalEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除一个全局参数
     * Summary: 删除一个全局参数
     * @param DeleteConfigGlobalRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteConfigGlobalResponse
     */
    public function deleteConfigGlobalEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteConfigGlobalResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.global.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新指定的全局参数
     * Summary: 更新指定的全局参数
     * @param UpdateConfigGlobalRequest $request
     * @return UpdateConfigGlobalResponse
     */
    public function updateConfigGlobal($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateConfigGlobalEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新指定的全局参数
     * Summary: 更新指定的全局参数
     * @param UpdateConfigGlobalRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateConfigGlobalResponse
     */
    public function updateConfigGlobalEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateConfigGlobalResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.global.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据条件查询符合条件的全局参数
     * Summary: 根据条件查询符合条件的全局参数
     * @param QueryConfigGlobalRequest $request
     * @return QueryConfigGlobalResponse
     */
    public function queryConfigGlobal($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryConfigGlobalEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据条件查询符合条件的全局参数
     * Summary: 根据条件查询符合条件的全局参数
     * @param QueryConfigGlobalRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryConfigGlobalResponse
     */
    public function queryConfigGlobalEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryConfigGlobalResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.global.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个全局参数
     * Summary: 获取单个全局参数
     * @param GetConfigGlobalRequest $request
     * @return GetConfigGlobalResponse
     */
    public function getConfigGlobal($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getConfigGlobalEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个全局参数
     * Summary: 获取单个全局参数
     * @param GetConfigGlobalRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetConfigGlobalResponse
     */
    public function getConfigGlobalEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetConfigGlobalResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.global.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一个应用参数
     * Summary: 创建一个应用参数
     * @param CreateConfigAppRequest $request
     * @return CreateConfigAppResponse
     */
    public function createConfigApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createConfigAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个应用参数
     * Summary: 创建一个应用参数
     * @param CreateConfigAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateConfigAppResponse
     */
    public function createConfigAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateConfigAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.app.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除一个应用参数
     * Summary: 删除一个应用参数
     * @param DeleteConfigAppRequest $request
     * @return DeleteConfigAppResponse
     */
    public function deleteConfigApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteConfigAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除一个应用参数
     * Summary: 删除一个应用参数
     * @param DeleteConfigAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteConfigAppResponse
     */
    public function deleteConfigAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteConfigAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.app.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新指定的应用参数
     * Summary: 更新指定的应用参数
     * @param UpdateConfigAppRequest $request
     * @return UpdateConfigAppResponse
     */
    public function updateConfigApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateConfigAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新指定的应用参数
     * Summary: 更新指定的应用参数
     * @param UpdateConfigAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateConfigAppResponse
     */
    public function updateConfigAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateConfigAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.app.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取指定的应用参数
     * Summary: 获取指定的应用参数
     * @param GetConfigAppRequest $request
     * @return GetConfigAppResponse
     */
    public function getConfigApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getConfigAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取指定的应用参数
     * Summary: 获取指定的应用参数
     * @param GetConfigAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetConfigAppResponse
     */
    public function getConfigAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetConfigAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.app.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询符合条件的应用参数
     * Summary: 查询符合条件的应用参数
     * @param QueryConfigAppRequest $request
     * @return QueryConfigAppResponse
     */
    public function queryConfigApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryConfigAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询符合条件的应用参数
     * Summary: 查询符合条件的应用参数
     * @param QueryConfigAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryConfigAppResponse
     */
    public function queryConfigAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryConfigAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.app.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
     * Summary: 将一个应用参数模板保存为草稿
     * @param SaveConfigTemplateRequest $request
     * @return SaveConfigTemplateResponse
     */
    public function saveConfigTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->saveConfigTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
     * Summary: 将一个应用参数模板保存为草稿
     * @param SaveConfigTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SaveConfigTemplateResponse
     */
    public function saveConfigTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SaveConfigTemplateResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.template.save", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
     * Summary: 发布一个应用参数模板
     * @param CreateConfigTemplateRequest $request
     * @return CreateConfigTemplateResponse
     */
    public function createConfigTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createConfigTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
     * Summary: 发布一个应用参数模板
     * @param CreateConfigTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateConfigTemplateResponse
     */
    public function createConfigTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateConfigTemplateResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.template.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取某个应用最新版本的应用参数模板
     * Summary: 获取某个应用最新版本的应用参数模板
     * @param PullConfigTemplateRequest $request
     * @return PullConfigTemplateResponse
     */
    public function pullConfigTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pullConfigTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取某个应用最新版本的应用参数模板
     * Summary: 获取某个应用最新版本的应用参数模板
     * @param PullConfigTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PullConfigTemplateResponse
     */
    public function pullConfigTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PullConfigTemplateResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.template.pull", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
     * Summary: 删除一个应用参数模板草稿
     * @param DeleteConfigTemplatedraftRequest $request
     * @return DeleteConfigTemplatedraftResponse
     */
    public function deleteConfigTemplatedraft($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteConfigTemplatedraftEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
     * Summary: 删除一个应用参数模板草稿
     * @param DeleteConfigTemplatedraftRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteConfigTemplatedraftResponse
     */
    public function deleteConfigTemplatedraftEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteConfigTemplatedraftResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.templatedraft.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取某个指定的应用参数模板
     * Summary: 获取某个指定的应用参数模板
     * @param GetConfigTemplateRequest $request
     * @return GetConfigTemplateResponse
     */
    public function getConfigTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getConfigTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取某个指定的应用参数模板
     * Summary: 获取某个指定的应用参数模板
     * @param GetConfigTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetConfigTemplateResponse
     */
    public function getConfigTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetConfigTemplateResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.template.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询符合条件的应用参数模板
     * Summary: 查询符合条件的应用参数模板
     * @param QueryConfigTemplateRequest $request
     * @return QueryConfigTemplateResponse
     */
    public function queryConfigTemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryConfigTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询符合条件的应用参数模板
     * Summary: 查询符合条件的应用参数模板
     * @param QueryConfigTemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryConfigTemplateResponse
     */
    public function queryConfigTemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryConfigTemplateResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.template.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
     * Summary: 渲染一个指定的参数列表
     * @param ExecConfigParseRequest $request
     * @return ExecConfigParseResponse
     */
    public function execConfigParse($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execConfigParseEx($request, $headers, $runtime);
    }

    /**
     * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
     * Summary: 渲染一个指定的参数列表
     * @param ExecConfigParseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecConfigParseResponse
     */
    public function execConfigParseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecConfigParseResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.parse.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建全局参数
     * Summary: 批量创建全局参数
     * @param BatchcreateConfigGlobalRequest $request
     * @return BatchcreateConfigGlobalResponse
     */
    public function batchcreateConfigGlobal($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->batchcreateConfigGlobalEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建全局参数
     * Summary: 批量创建全局参数
     * @param BatchcreateConfigGlobalRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return BatchcreateConfigGlobalResponse
     */
    public function batchcreateConfigGlobalEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return BatchcreateConfigGlobalResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.global.batchcreate", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建应用参数
     * Summary: 批量创建应用参数
     * @param BatchcreateConfigAppRequest $request
     * @return BatchcreateConfigAppResponse
     */
    public function batchcreateConfigApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->batchcreateConfigAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建应用参数
     * Summary: 批量创建应用参数
     * @param BatchcreateConfigAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return BatchcreateConfigAppResponse
     */
    public function batchcreateConfigAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return BatchcreateConfigAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.app.batchcreate", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
     * Summary: 获取当前租户下的站点管理员视角的树形结构
     * @param GetConfigSitetreeRequest $request
     * @return GetConfigSitetreeResponse
     */
    public function getConfigSitetree($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getConfigSitetreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
     * Summary: 获取当前租户下的站点管理员视角的树形结构
     * @param GetConfigSitetreeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetConfigSitetreeResponse
     */
    public function getConfigSitetreeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetConfigSitetreeResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.sitetree.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
     * Summary: 获取当前租户下的租户管理员视角的树形结构
     * @param GetConfigTenanttreeRequest $request
     * @return GetConfigTenanttreeResponse
     */
    public function getConfigTenanttree($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getConfigTenanttreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
     * Summary: 获取当前租户下的租户管理员视角的树形结构
     * @param GetConfigTenanttreeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetConfigTenanttreeResponse
     */
    public function getConfigTenanttreeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetConfigTenanttreeResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.tenanttree.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 检查应用参数是否已存在
     * Summary: 检查应用参数是否已存在
     * @param ExistConfigAppRequest $request
     * @return ExistConfigAppResponse
     */
    public function existConfigApp($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->existConfigAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 检查应用参数是否已存在
     * Summary: 检查应用参数是否已存在
     * @param ExistConfigAppRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExistConfigAppResponse
     */
    public function existConfigAppEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExistConfigAppResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.app.exist", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 检查全局参数是否已存在
     * Summary: 检查全局参数是否已存在
     * @param ExistConfigGlobalRequest $request
     * @return ExistConfigGlobalResponse
     */
    public function existConfigGlobal($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->existConfigGlobalEx($request, $headers, $runtime);
    }

    /**
     * Description: 检查全局参数是否已存在
     * Summary: 检查全局参数是否已存在
     * @param ExistConfigGlobalRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExistConfigGlobalResponse
     */
    public function existConfigGlobalEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExistConfigGlobalResponse::fromMap($this->doRequest("1.0", "antcloud.deps.config.global.exist", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出指定租户下所有环境
     * Summary: 列出指定租户下所有环境
     * @param ListWorkspacegroupRequest $request
     * @return ListWorkspacegroupResponse
     */
    public function listWorkspacegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出指定租户下所有环境
     * Summary: 列出指定租户下所有环境
     * @param ListWorkspacegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListWorkspacegroupResponse
     */
    public function listWorkspacegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListWorkspacegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspacegroup.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定环境信息
     * Summary: 查询指定环境信息
     * @param GetWorkspacegroupRequest $request
     * @return GetWorkspacegroupResponse
     */
    public function getWorkspacegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定环境信息
     * Summary: 查询指定环境信息
     * @param GetWorkspacegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetWorkspacegroupResponse
     */
    public function getWorkspacegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetWorkspacegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspacegroup.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询部署单元列表
     * Summary: 查询部署单元列表
     * @param QueryCellRequest $request
     * @return QueryCellResponse
     */
    public function queryCell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询部署单元列表
     * Summary: 查询部署单元列表
     * @param QueryCellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryCellResponse
     */
    public function queryCellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryCellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cell.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询环境增量统计信息
     * Summary: 查询环境增量统计信息
     * @param QueryWorkspaceDeltaRequest $request
     * @return QueryWorkspaceDeltaResponse
     */
    public function queryWorkspaceDelta($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryWorkspaceDeltaEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询环境增量统计信息
     * Summary: 查询环境增量统计信息
     * @param QueryWorkspaceDeltaRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryWorkspaceDeltaResponse
     */
    public function queryWorkspaceDeltaEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryWorkspaceDeltaResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspace.delta.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建工作空间组。
     * Summary: 创建工作空间组
     * @param CreateWorkspacegroupRequest $request
     * @return CreateWorkspacegroupResponse
     */
    public function createWorkspacegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建工作空间组。
     * Summary: 创建工作空间组
     * @param CreateWorkspacegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateWorkspacegroupResponse
     */
    public function createWorkspacegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateWorkspacegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspacegroup.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询环境组详细信息
     * Summary: 查询环境组详细信息
     * @param QueryWorkspacegroupRequest $request
     * @return QueryWorkspacegroupResponse
     */
    public function queryWorkspacegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询环境组详细信息
     * Summary: 查询环境组详细信息
     * @param QueryWorkspacegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryWorkspacegroupResponse
     */
    public function queryWorkspacegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryWorkspacegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspacegroup.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除指定工作空间组。
     * Summary: 删除指定工作空间组。
     * @param DeleteWorkspacegroupRequest $request
     * @return DeleteWorkspacegroupResponse
     */
    public function deleteWorkspacegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除指定工作空间组。
     * Summary: 删除指定工作空间组。
     * @param DeleteWorkspacegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteWorkspacegroupResponse
     */
    public function deleteWorkspacegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteWorkspacegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspacegroup.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询workspace信息(V2)。
     * Summary: 查询workspace信息(V2)。
     * @param GetSingleworkspaceRequest $request
     * @return GetSingleworkspaceResponse
     */
    public function getSingleworkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getSingleworkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询workspace信息(V2)。
     * Summary: 查询workspace信息(V2)。
     * @param GetSingleworkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetSingleworkspaceResponse
     */
    public function getSingleworkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetSingleworkspaceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.singleworkspace.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定环境信息。
     * Summary: 查询指定环境信息。
     * @param GetSingleworkspacegroupRequest $request
     * @return GetSingleworkspacegroupResponse
     */
    public function getSingleworkspacegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getSingleworkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定环境信息。
     * Summary: 查询指定环境信息。
     * @param GetSingleworkspacegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetSingleworkspacegroupResponse
     */
    public function getSingleworkspacegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetSingleworkspacegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.singleworkspacegroup.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询部署单元列表。
     * Summary: 查询部署单元列表。
     * @param ListCellRequest $request
     * @return ListCellResponse
     */
    public function listCell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询部署单元列表。
     * Summary: 查询部署单元列表。
     * @param ListCellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListCellResponse
     */
    public function listCellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListCellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cell.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建workspace信息(V2)
     * Summary: 创建workspace信息(V2)
     * @param CreateSingleworkspaceRequest $request
     * @return CreateSingleworkspaceResponse
     */
    public function createSingleworkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createSingleworkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建workspace信息(V2)
     * Summary: 创建workspace信息(V2)
     * @param CreateSingleworkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateSingleworkspaceResponse
     */
    public function createSingleworkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateSingleworkspaceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.singleworkspace.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除workspace信息(V2)
     * Summary: 删除workspace信息(V2)
     * @param DeleteSingleworkspaceRequest $request
     * @return DeleteSingleworkspaceResponse
     */
    public function deleteSingleworkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteSingleworkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除workspace信息(V2)
     * Summary: 删除workspace信息(V2)
     * @param DeleteSingleworkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteSingleworkspaceResponse
     */
    public function deleteSingleworkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteSingleworkspaceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.singleworkspace.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建专有网络vpc
     * Summary: 创建专有网络vpc
     * @param CreateVpcRequest $request
     * @return CreateVpcResponse
     */
    public function createVpc($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建专有网络vpc
     * Summary: 创建专有网络vpc
     * @param CreateVpcRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateVpcResponse
     */
    public function createVpcEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateVpcResponse::fromMap($this->doRequest("1.0", "antcloud.deps.vpc.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新workspacegroup。
     * Summary: 更新workspacegroup。
     * @param UpdateWorkspacegroupRequest $request
     * @return UpdateWorkspacegroupResponse
     */
    public function updateWorkspacegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateWorkspacegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新workspacegroup。
     * Summary: 更新workspacegroup。
     * @param UpdateWorkspacegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateWorkspacegroupResponse
     */
    public function updateWorkspacegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateWorkspacegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspacegroup.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update workspace meta data
     * Summary: update workspace
     * @param UpdateSingleworkspaceRequest $request
     * @return UpdateSingleworkspaceResponse
     */
    public function updateSingleworkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateSingleworkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: update workspace meta data
     * Summary: update workspace
     * @param UpdateSingleworkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateSingleworkspaceResponse
     */
    public function updateSingleworkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateSingleworkspaceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.singleworkspace.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: list regions
     * Summary: list regions
     * @param ListRegionRequest $request
     * @return ListRegionResponse
     */
    public function listRegion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: list regions
     * Summary: list regions
     * @param ListRegionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListRegionResponse
     */
    public function listRegionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListRegionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.region.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: zone list
     * Summary: zone list
     * @param ListZoneRequest $request
     * @return ListZoneResponse
     */
    public function listZone($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: zone list
     * Summary: zone list
     * @param ListZoneRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListZoneResponse
     */
    public function listZoneEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListZoneResponse::fromMap($this->doRequest("1.0", "antcloud.deps.zone.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建逻辑单元
     * Summary: 创建逻辑单元
     * @param CreateCellgroupRequest $request
     * @return CreateCellgroupResponse
     */
    public function createCellgroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createCellgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建逻辑单元
     * Summary: 创建逻辑单元
     * @param CreateCellgroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateCellgroupResponse
     */
    public function createCellgroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateCellgroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cellgroup.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除逻辑单元
     * Summary: 删除逻辑单元
     * @param DeleteCellgroupRequest $request
     * @return DeleteCellgroupResponse
     */
    public function deleteCellgroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteCellgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除逻辑单元
     * Summary: 删除逻辑单元
     * @param DeleteCellgroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteCellgroupResponse
     */
    public function deleteCellgroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteCellgroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cellgroup.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询逻辑单元
     * Summary: 查询逻辑单元
     * @param QueryCellgroupRequest $request
     * @return QueryCellgroupResponse
     */
    public function queryCellgroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryCellgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询逻辑单元
     * Summary: 查询逻辑单元
     * @param QueryCellgroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryCellgroupResponse
     */
    public function queryCellgroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryCellgroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cellgroup.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 配置逻辑单元灾备信息
     * Summary: 配置逻辑单元灾备信息
     * @param UpdateCellgroupDisasterinfoRequest $request
     * @return UpdateCellgroupDisasterinfoResponse
     */
    public function updateCellgroupDisasterinfo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateCellgroupDisasterinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 配置逻辑单元灾备信息
     * Summary: 配置逻辑单元灾备信息
     * @param UpdateCellgroupDisasterinfoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateCellgroupDisasterinfoResponse
     */
    public function updateCellgroupDisasterinfoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateCellgroupDisasterinfoResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cellgroup.disasterinfo.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建部署单元
     * Summary: 创建部署单元
     * @param CreateDeploymentCellRequest $request
     * @return CreateDeploymentCellResponse
     */
    public function createDeploymentCell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDeploymentCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建部署单元
     * Summary: 创建部署单元
     * @param CreateDeploymentCellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDeploymentCellResponse
     */
    public function createDeploymentCellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDeploymentCellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.cell.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除部署单元
     * Summary: 删除部署单元
     * @param DeleteDeploymentCellRequest $request
     * @return DeleteDeploymentCellResponse
     */
    public function deleteDeploymentCell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteDeploymentCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除部署单元
     * Summary: 删除部署单元
     * @param DeleteDeploymentCellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteDeploymentCellResponse
     */
    public function deleteDeploymentCellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteDeploymentCellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.cell.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询部署单元
     * Summary: 查询部署单元
     * @param QueryDeploymentCellRequest $request
     * @return QueryDeploymentCellResponse
     */
    public function queryDeploymentCell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryDeploymentCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询部署单元
     * Summary: 查询部署单元
     * @param QueryDeploymentCellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryDeploymentCellResponse
     */
    public function queryDeploymentCellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryDeploymentCellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.cell.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新部署单元
     * Summary: 更新部署单元
     * @param UpdateDeploymentCellRequest $request
     * @return UpdateDeploymentCellResponse
     */
    public function updateDeploymentCell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateDeploymentCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新部署单元
     * Summary: 更新部署单元
     * @param UpdateDeploymentCellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateDeploymentCellResponse
     */
    public function updateDeploymentCellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateDeploymentCellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.cell.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询部署单基础信息
     * Summary: 批量查询部署单基础信息
     * @param QueryDeploymentRequest $request
     * @return QueryDeploymentResponse
     */
    public function queryDeployment($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryDeploymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询部署单基础信息
     * Summary: 批量查询部署单基础信息
     * @param QueryDeploymentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryDeploymentResponse
     */
    public function queryDeploymentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryDeploymentResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对一个部署单执行取消操作。
     * 当部署单处于以下状态时可执行取消操作：
     * INITED：初始化完成
     * INIT_FAILED：初始化失败
     * Summary: 取消发布
     * @param CancelDeploymentRequest $request
     * @return CancelDeploymentResponse
     */
    public function cancelDeployment($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cancelDeploymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 对一个部署单执行取消操作。
     * 当部署单处于以下状态时可执行取消操作：
     * INITED：初始化完成
     * INIT_FAILED：初始化失败
     * Summary: 取消发布
     * @param CancelDeploymentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CancelDeploymentResponse
     */
    public function cancelDeploymentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CancelDeploymentResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.cancel", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
     * - 部署依赖示例
     * 假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
     * applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
     * Summary: 创建发布
     * @param CreateDeploymentRequest $request
     * @return CreateDeploymentResponse
     */
    public function createDeployment($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createDeploymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
     * - 部署依赖示例
     * 假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
     * applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
     * Summary: 创建发布
     * @param CreateDeploymentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateDeploymentResponse
     */
    public function createDeploymentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateDeploymentResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询一个已经创建成功的部署操作。
     * Summary: 获取部署
     * @param GetDeploymentRequest $request
     * @return GetDeploymentResponse
     */
    public function getDeployment($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getDeploymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询一个已经创建成功的部署操作。
     * Summary: 获取部署
     * @param GetDeploymentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetDeploymentResponse
     */
    public function getDeploymentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetDeploymentResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
     * 当部署单处于以下状态时可执行重试操作：
     * - FAILED：执行失败
     * Summary: 重试部署
     * @param RetryDeploymentRequest $request
     * @return RetryDeploymentResponse
     */
    public function retryDeployment($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryDeploymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
     * 当部署单处于以下状态时可执行重试操作：
     * - FAILED：执行失败
     * Summary: 重试部署
     * @param RetryDeploymentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryDeploymentResponse
     */
    public function retryDeploymentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryDeploymentResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始部署
     * @param StartDeploymentRequest $request
     * @return StartDeploymentResponse
     */
    public function startDeployment($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->startDeploymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始部署
     * @param StartDeploymentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StartDeploymentResponse
     */
    public function startDeploymentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StartDeploymentResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.start", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询一个部署操作中某个应用（服务）的详情。
     * Summary: 获取部署应用（服务）
     * @param GetDeploymentApplicationRequest $request
     * @return GetDeploymentApplicationResponse
     */
    public function getDeploymentApplication($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getDeploymentApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询一个部署操作中某个应用（服务）的详情。
     * Summary: 获取部署应用（服务）
     * @param GetDeploymentApplicationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetDeploymentApplicationResponse
     */
    public function getDeploymentApplicationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetDeploymentApplicationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.application.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
     * 当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
     * - EXECUTING：执行中
     * - SUCCESS：执行成功
     * - FAILED：执行失败
     * Summary: 回滚部署
     * @param RollbackDeploymentApplicationRequest $request
     * @return RollbackDeploymentApplicationResponse
     */
    public function rollbackDeploymentApplication($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->rollbackDeploymentApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
     * 当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
     * - EXECUTING：执行中
     * - SUCCESS：执行成功
     * - FAILED：执行失败
     * Summary: 回滚部署
     * @param RollbackDeploymentApplicationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RollbackDeploymentApplicationResponse
     */
    public function rollbackDeploymentApplicationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RollbackDeploymentApplicationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.application.rollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化部署
     * @param ReinitDeploymentRequest $request
     * @return ReinitDeploymentResponse
     */
    public function reinitDeployment($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->reinitDeploymentEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化部署
     * @param ReinitDeploymentRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReinitDeploymentResponse
     */
    public function reinitDeploymentEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ReinitDeploymentResponse::fromMap($this->doRequest("1.0", "antcloud.deps.deployment.reinit", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据查询条件查询指令模板。
     * Summary: 查询指令模板
     * @param QueryCmdtemplateRequest $request
     * @return QueryCmdtemplateResponse
     */
    public function queryCmdtemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryCmdtemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据查询条件查询指令模板。
     * Summary: 查询指令模板
     * @param QueryCmdtemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryCmdtemplateResponse
     */
    public function queryCmdtemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryCmdtemplateResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cmdtemplate.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取指令模板详情。
     * Summary: 获取指令模板详情。
     * @param GetCmdtemplateRequest $request
     * @return GetCmdtemplateResponse
     */
    public function getCmdtemplate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getCmdtemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取指令模板详情。
     * Summary: 获取指令模板详情。
     * @param GetCmdtemplateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetCmdtemplateResponse
     */
    public function getCmdtemplateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetCmdtemplateResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cmdtemplate.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步执行指令。
     * Summary: 同步执行指令。
     * @param SyncexecuteCmdTaskRequest $request
     * @return SyncexecuteCmdTaskResponse
     */
    public function syncexecuteCmdTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->syncexecuteCmdTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步执行指令。
     * Summary: 同步执行指令。
     * @param SyncexecuteCmdTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SyncexecuteCmdTaskResponse
     */
    public function syncexecuteCmdTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SyncexecuteCmdTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cmd.task.syncexecute", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异步执行指令。
     * Summary: 异步执行指令。
     * @param AsyncexecuteCmdTaskRequest $request
     * @return AsyncexecuteCmdTaskResponse
     */
    public function asyncexecuteCmdTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->asyncexecuteCmdTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 异步执行指令。
     * Summary: 异步执行指令。
     * @param AsyncexecuteCmdTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return AsyncexecuteCmdTaskResponse
     */
    public function asyncexecuteCmdTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return AsyncexecuteCmdTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cmd.task.asyncexecute", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询执行指令任务结果。
     * Summary: 查询执行指令任务结果。
     * @param GetCmdTaskRequest $request
     * @return GetCmdTaskResponse
     */
    public function getCmdTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getCmdTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询执行指令任务结果。
     * Summary: 查询执行指令任务结果。
     * @param GetCmdTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetCmdTaskResponse
     */
    public function getCmdTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetCmdTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cmd.task.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
     * Summary: 创建一个应用（服务）运维单
     * @param CreateAppopsRequest $request
     * @return CreateAppopsResponse
     */
    public function createAppops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAppopsEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
     * Summary: 创建一个应用（服务）运维单
     * @param CreateAppopsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAppopsResponse
     */
    public function createAppopsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAppopsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appops.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询一个已经创建成功的运维操作。
     * Summary: 获取运维单
     * @param GetAppopsRequest $request
     * @return GetAppopsResponse
     */
    public function getAppops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getAppopsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询一个已经创建成功的运维操作。
     * Summary: 获取运维单
     * @param GetAppopsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetAppopsResponse
     */
    public function getAppopsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetAppopsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appops.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始运维
     * @param StartAppopsRequest $request
     * @return StartAppopsResponse
     */
    public function startAppops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->startAppopsEx($request, $headers, $runtime);
    }

    /**
     * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始运维
     * @param StartAppopsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StartAppopsResponse
     */
    public function startAppopsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StartAppopsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appops.start", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化运维
     * @param ReinitAppopsRequest $request
     * @return ReinitAppopsResponse
     */
    public function reinitAppops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->reinitAppopsEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化运维
     * @param ReinitAppopsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReinitAppopsResponse
     */
    public function reinitAppopsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ReinitAppopsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appops.reinit", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对一个运维单执行取消操作。
     * 当运维单处于以下状态时可执行取消操作：
     * INITED：初始化完成
     * INIT_FAILED：初始化失败
     * Summary: 取消发布
     * @param CancelAppopsRequest $request
     * @return CancelAppopsResponse
     */
    public function cancelAppops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cancelAppopsEx($request, $headers, $runtime);
    }

    /**
     * Description: 对一个运维单执行取消操作。
     * 当运维单处于以下状态时可执行取消操作：
     * INITED：初始化完成
     * INIT_FAILED：初始化失败
     * Summary: 取消发布
     * @param CancelAppopsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CancelAppopsResponse
     */
    public function cancelAppopsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CancelAppopsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appops.cancel", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
     * 当运维单处于以下状态时可执行重试操作：
     * - FAILED：执行失败
     * Summary: 重试运维
     * @param RetryAppopsRequest $request
     * @return RetryAppopsResponse
     */
    public function retryAppops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryAppopsEx($request, $headers, $runtime);
    }

    /**
     * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
     * 当运维单处于以下状态时可执行重试操作：
     * - FAILED：执行失败
     * Summary: 重试运维
     * @param RetryAppopsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryAppopsResponse
     */
    public function retryAppopsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryAppopsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appops.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
     * Summary: 创建一个机器运维单
     * @param CreateComputeropsRequest $request
     * @return CreateComputeropsResponse
     */
    public function createComputerops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createComputeropsEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
     * Summary: 创建一个机器运维单
     * @param CreateComputeropsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateComputeropsResponse
     */
    public function createComputeropsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateComputeropsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.computerops.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询一个已经创建成功的机器运维操作。
     * Summary: 获取运维单
     * @param GetComputeropsRequest $request
     * @return GetComputeropsResponse
     */
    public function getComputerops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getComputeropsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询一个已经创建成功的机器运维操作。
     * Summary: 获取运维单
     * @param GetComputeropsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetComputeropsResponse
     */
    public function getComputeropsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetComputeropsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.computerops.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始运维
     * @param StartComputeropsRequest $request
     * @return StartComputeropsResponse
     */
    public function startComputerops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->startComputeropsEx($request, $headers, $runtime);
    }

    /**
     * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
     * Summary: 开始运维
     * @param StartComputeropsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StartComputeropsResponse
     */
    public function startComputeropsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StartComputeropsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.computerops.start", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化运维
     * @param ReinitComputeropsRequest $request
     * @return ReinitComputeropsResponse
     */
    public function reinitComputerops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->reinitComputeropsEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
     * Summary: 重新初始化运维
     * @param ReinitComputeropsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReinitComputeropsResponse
     */
    public function reinitComputeropsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ReinitComputeropsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.computerops.reinit", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对一个机器运维单执行取消操作。
     * 当运维单处于以下状态时可执行取消操作：
     * INITED：初始化完成
     * INIT_FAILED：初始化失败
     * Summary: 取消发布
     * @param CancelComputeropsRequest $request
     * @return CancelComputeropsResponse
     */
    public function cancelComputerops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cancelComputeropsEx($request, $headers, $runtime);
    }

    /**
     * Description: 对一个机器运维单执行取消操作。
     * 当运维单处于以下状态时可执行取消操作：
     * INITED：初始化完成
     * INIT_FAILED：初始化失败
     * Summary: 取消发布
     * @param CancelComputeropsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CancelComputeropsResponse
     */
    public function cancelComputeropsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CancelComputeropsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.computerops.cancel", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
     * 当运维单处于以下状态时可执行重试操作：
     * - FAILED：执行失败
     * Summary: 重试运维
     * @param RetryComputeropsRequest $request
     * @return RetryComputeropsResponse
     */
    public function retryComputerops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryComputeropsEx($request, $headers, $runtime);
    }

    /**
     * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
     * 当运维单处于以下状态时可执行重试操作：
     * - FAILED：执行失败
     * Summary: 重试运维
     * @param RetryComputeropsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryComputeropsResponse
     */
    public function retryComputeropsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryComputeropsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.computerops.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用服务的运维历史。
     * Summary: 查询应用服务的运维历史。
     * @param QueryOpsappsvcRequest $request
     * @return QueryOpsappsvcResponse
     */
    public function queryOpsappsvc($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryOpsappsvcEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用服务的运维历史。
     * Summary: 查询应用服务的运维历史。
     * @param QueryOpsappsvcRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryOpsappsvcResponse
     */
    public function queryOpsappsvcEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryOpsappsvcResponse::fromMap($this->doRequest("1.0", "antcloud.deps.opsappsvc.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异步执行Bash命令。
     * Summary: 异步执行Bash命令。
     * @param AsyncexecuteBashcmdRequest $request
     * @return AsyncexecuteBashcmdResponse
     */
    public function asyncexecuteBashcmd($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->asyncexecuteBashcmdEx($request, $headers, $runtime);
    }

    /**
     * Description: 异步执行Bash命令。
     * Summary: 异步执行Bash命令。
     * @param AsyncexecuteBashcmdRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return AsyncexecuteBashcmdResponse
     */
    public function asyncexecuteBashcmdEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return AsyncexecuteBashcmdResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bashcmd.asyncexecute", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据异步执行bash命令的任务ID查询结果。
     * Summary: 根据异步执行bash命令的任务ID查询结果。
     * @param GetBashcmdResultRequest $request
     * @return GetBashcmdResultResponse
     */
    public function getBashcmdResult($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getBashcmdResultEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据异步执行bash命令的任务ID查询结果。
     * Summary: 根据异步执行bash命令的任务ID查询结果。
     * @param GetBashcmdResultRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetBashcmdResultResponse
     */
    public function getBashcmdResultEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetBashcmdResultResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bashcmd.result.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询当前环境是否已开通蓝绿发布
     * Summary: 查询当前环境是否已开通蓝绿发布
     * @param CheckCloudconfigBgreleaseRequest $request
     * @return CheckCloudconfigBgreleaseResponse
     */
    public function checkCloudconfigBgrelease($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkCloudconfigBgreleaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询当前环境是否已开通蓝绿发布
     * Summary: 查询当前环境是否已开通蓝绿发布
     * @param CheckCloudconfigBgreleaseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckCloudconfigBgreleaseResponse
     */
    public function checkCloudconfigBgreleaseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckCloudconfigBgreleaseResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconfig.bgrelease.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询是否已开通蓝绿发布部署单元
     * Summary: 查询是否已开通蓝绿发布部署单元
     * @param CheckCloudconfigBgdeploymentcellRequest $request
     * @return CheckCloudconfigBgdeploymentcellResponse
     */
    public function checkCloudconfigBgdeploymentcell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkCloudconfigBgdeploymentcellEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询是否已开通蓝绿发布部署单元
     * Summary: 查询是否已开通蓝绿发布部署单元
     * @param CheckCloudconfigBgdeploymentcellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckCloudconfigBgdeploymentcellResponse
     */
    public function checkCloudconfigBgdeploymentcellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckCloudconfigBgdeploymentcellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconfig.bgdeploymentcell.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询是否已开通应用服务
     * Summary: 查询是否已开通应用服务
     * @param CheckCloudconfigAppserviceRequest $request
     * @return CheckCloudconfigAppserviceResponse
     */
    public function checkCloudconfigAppservice($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkCloudconfigAppserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询是否已开通应用服务
     * Summary: 查询是否已开通应用服务
     * @param CheckCloudconfigAppserviceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckCloudconfigAppserviceResponse
     */
    public function checkCloudconfigAppserviceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckCloudconfigAppserviceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconfig.appservice.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询是否已开通共享中间件
     * Summary: 查询是否已开通共享中间件
     * @param CheckCloudconfigSharedmwRequest $request
     * @return CheckCloudconfigSharedmwResponse
     */
    public function checkCloudconfigSharedmw($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkCloudconfigSharedmwEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询是否已开通共享中间件
     * Summary: 查询是否已开通共享中间件
     * @param CheckCloudconfigSharedmwRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckCloudconfigSharedmwResponse
     */
    public function checkCloudconfigSharedmwEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckCloudconfigSharedmwResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconfig.sharedmw.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询是否使用 v1 发布策略
     * Summary: 查询是否使用 v1 发布策略
     * @param CheckCloudconfigVonereleaseRequest $request
     * @return CheckCloudconfigVonereleaseResponse
     */
    public function checkCloudconfigVonerelease($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkCloudconfigVonereleaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询是否使用 v1 发布策略
     * Summary: 查询是否使用 v1 发布策略
     * @param CheckCloudconfigVonereleaseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckCloudconfigVonereleaseResponse
     */
    public function checkCloudconfigVonereleaseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckCloudconfigVonereleaseResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconfig.vonerelease.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询是否使用 v1 应用运维策略
     * Summary: 查询是否使用 v1 应用运维策略
     * @param CheckCloudconfigVoneappopsRequest $request
     * @return CheckCloudconfigVoneappopsResponse
     */
    public function checkCloudconfigVoneappops($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkCloudconfigVoneappopsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询是否使用 v1 应用运维策略
     * Summary: 查询是否使用 v1 应用运维策略
     * @param CheckCloudconfigVoneappopsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckCloudconfigVoneappopsResponse
     */
    public function checkCloudconfigVoneappopsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckCloudconfigVoneappopsResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconfig.voneappops.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询是否使用老版本界面
     * Summary: 查询是否使用老版本界面
     * @param CheckCloudconfigOlduiRequest $request
     * @return CheckCloudconfigOlduiResponse
     */
    public function checkCloudconfigOldui($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkCloudconfigOlduiEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询是否使用老版本界面
     * Summary: 查询是否使用老版本界面
     * @param CheckCloudconfigOlduiRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckCloudconfigOlduiResponse
     */
    public function checkCloudconfigOlduiEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckCloudconfigOlduiResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconfig.oldui.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 是否禁用 XDC LB
     * Summary: 是否禁用 XDC LB
     * @param CheckCloudconfigXdclbforbiddenRequest $request
     * @return CheckCloudconfigXdclbforbiddenResponse
     */
    public function checkCloudconfigXdclbforbidden($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkCloudconfigXdclbforbiddenEx($request, $headers, $runtime);
    }

    /**
     * Description: 是否禁用 XDC LB
     * Summary: 是否禁用 XDC LB
     * @param CheckCloudconfigXdclbforbiddenRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckCloudconfigXdclbforbiddenResponse
     */
    public function checkCloudconfigXdclbforbiddenEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckCloudconfigXdclbforbiddenResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconfig.xdclbforbidden.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询 openapi 配置信息
     * Summary: 查询 openapi 配置信息
     * @param QueryCloudconfigOpenapiconfigRequest $request
     * @return QueryCloudconfigOpenapiconfigResponse
     */
    public function queryCloudconfigOpenapiconfig($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryCloudconfigOpenapiconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询 openapi 配置信息
     * Summary: 查询 openapi 配置信息
     * @param QueryCloudconfigOpenapiconfigRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryCloudconfigOpenapiconfigResponse
     */
    public function queryCloudconfigOpenapiconfigEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryCloudconfigOpenapiconfigResponse::fromMap($this->doRequest("1.0", "antcloud.deps.cloudconfig.openapiconfig.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用包个数
     * Summary: 查询应用包个数
     * @param CountAppsPkgRequest $request
     * @return CountAppsPkgResponse
     */
    public function countAppsPkg($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->countAppsPkgEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用包个数
     * Summary: 查询应用包个数
     * @param CountAppsPkgRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CountAppsPkgResponse
     */
    public function countAppsPkgEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CountAppsPkgResponse::fromMap($this->doRequest("1.0", "antcloud.deps.apps.pkg.count", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询app下的资源统计
     * Summary: 查询app下的资源统计
     * @param QueryAppUnitresourcesRequest $request
     * @return QueryAppUnitresourcesResponse
     */
    public function queryAppUnitresources($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAppUnitresourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询app下的资源统计
     * Summary: 查询app下的资源统计
     * @param QueryAppUnitresourcesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAppUnitresourcesResponse
     */
    public function queryAppUnitresourcesEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAppUnitresourcesResponse::fromMap($this->doRequest("1.0", "antcloud.deps.app.unitresources.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询认证 token
     * Summary: 查询认证 token
     * @param QueryOauthTokenRequest $request
     * @return QueryOauthTokenResponse
     */
    public function queryOauthToken($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryOauthTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询认证 token
     * Summary: 查询认证 token
     * @param QueryOauthTokenRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryOauthTokenResponse
     */
    public function queryOauthTokenEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryOauthTokenResponse::fromMap($this->doRequest("1.0", "antcloud.deps.oauth.token.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建或更新 token
     * Summary: 创建或更新 token
     * @param UpdateOauthTokenRequest $request
     * @return UpdateOauthTokenResponse
     */
    public function updateOauthToken($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateOauthTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建或更新 token
     * Summary: 创建或更新 token
     * @param UpdateOauthTokenRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateOauthTokenResponse
     */
    public function updateOauthTokenEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateOauthTokenResponse::fromMap($this->doRequest("1.0", "antcloud.deps.oauth.token.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除 token
     * Summary: 删除 token
     * @param DeleteOauthTokenRequest $request
     * @return DeleteOauthTokenResponse
     */
    public function deleteOauthToken($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteOauthTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除 token
     * Summary: 删除 token
     * @param DeleteOauthTokenRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteOauthTokenResponse
     */
    public function deleteOauthTokenEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteOauthTokenResponse::fromMap($this->doRequest("1.0", "antcloud.deps.oauth.token.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询 DZ
     * Summary: 查询 DZ
     * @param QueryBaseinfoDeploymentzonesRequest $request
     * @return QueryBaseinfoDeploymentzonesResponse
     */
    public function queryBaseinfoDeploymentzones($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBaseinfoDeploymentzonesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询 DZ
     * Summary: 查询 DZ
     * @param QueryBaseinfoDeploymentzonesRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBaseinfoDeploymentzonesResponse
     */
    public function queryBaseinfoDeploymentzonesEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBaseinfoDeploymentzonesResponse::fromMap($this->doRequest("1.0", "antcloud.deps.baseinfo.deploymentzones.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取蓝绿发布概览
     * Summary: 获取蓝绿发布概览
     * @param GetBgreleaseArrangementRequest $request
     * @return GetBgreleaseArrangementResponse
     */
    public function getBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取蓝绿发布概览
     * Summary: 获取蓝绿发布概览
     * @param GetBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetBgreleaseArrangementResponse
     */
    public function getBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询蓝绿发布概览
     * Summary: 查询蓝绿发布概览
     * @param QueryBgreleaseArrangementRequest $request
     * @return QueryBgreleaseArrangementResponse
     */
    public function queryBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询蓝绿发布概览
     * Summary: 查询蓝绿发布概览
     * @param QueryBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBgreleaseArrangementResponse
     */
    public function queryBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询蓝绿发布进度
     * Summary: 查询蓝绿发布进度
     * @param QueryBgreleaseArrangementprogressRequest $request
     * @return QueryBgreleaseArrangementprogressResponse
     */
    public function queryBgreleaseArrangementprogress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBgreleaseArrangementprogressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询蓝绿发布进度
     * Summary: 查询蓝绿发布进度
     * @param QueryBgreleaseArrangementprogressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBgreleaseArrangementprogressResponse
     */
    public function queryBgreleaseArrangementprogressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBgreleaseArrangementprogressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangementprogress.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询蓝绿发布任务进度
     * Summary: 查询蓝绿发布任务进度
     * @param QueryBgreleaseTaskprogressRequest $request
     * @return QueryBgreleaseTaskprogressResponse
     */
    public function queryBgreleaseTaskprogress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBgreleaseTaskprogressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询蓝绿发布任务进度
     * Summary: 查询蓝绿发布任务进度
     * @param QueryBgreleaseTaskprogressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBgreleaseTaskprogressResponse
     */
    public function queryBgreleaseTaskprogressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBgreleaseTaskprogressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.taskprogress.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 执行蓝绿发布
     * Summary: 执行蓝绿发布
     * @param ExecBgreleaseArrangementRequest $request
     * @return ExecBgreleaseArrangementResponse
     */
    public function execBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 执行蓝绿发布
     * Summary: 执行蓝绿发布
     * @param ExecBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecBgreleaseArrangementResponse
     */
    public function execBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 验证确认蓝绿发布
     * Summary: 验证确认蓝绿发布
     * @param ConfirmBgreleaseArrangementRequest $request
     * @return ConfirmBgreleaseArrangementResponse
     */
    public function confirmBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 验证确认蓝绿发布
     * Summary: 验证确认蓝绿发布
     * @param ConfirmBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmBgreleaseArrangementResponse
     */
    public function confirmBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.confirm", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蓝绿验证确认
     * Summary: 蓝绿验证确认
     * @param ConfirmBgreleaseArrangementvalidationRequest $request
     * @return ConfirmBgreleaseArrangementvalidationResponse
     */
    public function confirmBgreleaseArrangementvalidation($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmBgreleaseArrangementvalidationEx($request, $headers, $runtime);
    }

    /**
     * Description: 蓝绿验证确认
     * Summary: 蓝绿验证确认
     * @param ConfirmBgreleaseArrangementvalidationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmBgreleaseArrangementvalidationResponse
     */
    public function confirmBgreleaseArrangementvalidationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmBgreleaseArrangementvalidationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangementvalidation.confirm", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试蓝绿发布
     * Summary: 重试蓝绿发布
     * @param RetryBgreleaseArrangementRequest $request
     * @return RetryBgreleaseArrangementResponse
     */
    public function retryBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试蓝绿发布
     * Summary: 重试蓝绿发布
     * @param RetryBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryBgreleaseArrangementResponse
     */
    public function retryBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试蓝绿发布任务
     * Summary: 重试蓝绿发布任务
     * @param RetryBgreleaseTaskRequest $request
     * @return RetryBgreleaseTaskResponse
     */
    public function retryBgreleaseTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryBgreleaseTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试蓝绿发布任务
     * Summary: 重试蓝绿发布任务
     * @param RetryBgreleaseTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryBgreleaseTaskResponse
     */
    public function retryBgreleaseTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryBgreleaseTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.task.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 跳过蓝绿发布任务
     * Summary: 跳过蓝绿发布任务
     * @param SkipBgreleaseTaskRequest $request
     * @return SkipBgreleaseTaskResponse
     */
    public function skipBgreleaseTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipBgreleaseTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 跳过蓝绿发布任务
     * Summary: 跳过蓝绿发布任务
     * @param SkipBgreleaseTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipBgreleaseTaskResponse
     */
    public function skipBgreleaseTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipBgreleaseTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.task.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 跳过蓝绿发布
     * Summary: 跳过蓝绿发布
     * @param SkipBgreleaseArrangementRequest $request
     * @return SkipBgreleaseArrangementResponse
     */
    public function skipBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 跳过蓝绿发布
     * Summary: 跳过蓝绿发布
     * @param SkipBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipBgreleaseArrangementResponse
     */
    public function skipBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消蓝绿发布
     * Summary: 取消蓝绿发布
     * @param CancelBgreleaseArrangementRequest $request
     * @return CancelBgreleaseArrangementResponse
     */
    public function cancelBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cancelBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消蓝绿发布
     * Summary: 取消蓝绿发布
     * @param CancelBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CancelBgreleaseArrangementResponse
     */
    public function cancelBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CancelBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.cancel", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 回滚蓝绿发布
     * Summary: 回滚蓝绿发布
     * @param RollbackBgreleaseArrangementRequest $request
     * @return RollbackBgreleaseArrangementResponse
     */
    public function rollbackBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->rollbackBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 回滚蓝绿发布
     * Summary: 回滚蓝绿发布
     * @param RollbackBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RollbackBgreleaseArrangementResponse
     */
    public function rollbackBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RollbackBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.rollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蓝绿发布回滚重试
     * Summary: 蓝绿发布回滚重试
     * @param RetryrollbackBgreleaseArrangementRequest $request
     * @return RetryrollbackBgreleaseArrangementResponse
     */
    public function retryrollbackBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryrollbackBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 蓝绿发布回滚重试
     * Summary: 蓝绿发布回滚重试
     * @param RetryrollbackBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryrollbackBgreleaseArrangementResponse
     */
    public function retryrollbackBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryrollbackBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.retryrollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蓝绿发布回滚确认
     * Summary: 蓝绿发布回滚确认
     * @param ConfirmrollbackBgreleaseArrangementRequest $request
     * @return ConfirmrollbackBgreleaseArrangementResponse
     */
    public function confirmrollbackBgreleaseArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmrollbackBgreleaseArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 蓝绿发布回滚确认
     * Summary: 蓝绿发布回滚确认
     * @param ConfirmrollbackBgreleaseArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmrollbackBgreleaseArrangementResponse
     */
    public function confirmrollbackBgreleaseArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmrollbackBgreleaseArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.arrangement.confirmrollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蓝绿发布灰度流量迁移
     * Summary: 蓝绿发布灰度流量迁移
     * @param SwitchBgreleaseGraytrafficRequest $request
     * @return SwitchBgreleaseGraytrafficResponse
     */
    public function switchBgreleaseGraytraffic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->switchBgreleaseGraytrafficEx($request, $headers, $runtime);
    }

    /**
     * Description: 蓝绿发布灰度流量迁移
     * Summary: 蓝绿发布灰度流量迁移
     * @param SwitchBgreleaseGraytrafficRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SwitchBgreleaseGraytrafficResponse
     */
    public function switchBgreleaseGraytrafficEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SwitchBgreleaseGraytrafficResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.graytraffic.switch", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蓝绿发布灰度流量回滚
     * Summary: 蓝绿发布灰度流量回滚
     * @param RollbackBgreleaseGraytrafficRequest $request
     * @return RollbackBgreleaseGraytrafficResponse
     */
    public function rollbackBgreleaseGraytraffic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->rollbackBgreleaseGraytrafficEx($request, $headers, $runtime);
    }

    /**
     * Description: 蓝绿发布灰度流量回滚
     * Summary: 蓝绿发布灰度流量回滚
     * @param RollbackBgreleaseGraytrafficRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RollbackBgreleaseGraytrafficResponse
     */
    public function rollbackBgreleaseGraytrafficEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RollbackBgreleaseGraytrafficResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.graytraffic.rollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询灰度引流进度
     * Summary: 查询灰度引流进度
     * @param QueryBgreleaseGrayprogressRequest $request
     * @return QueryBgreleaseGrayprogressResponse
     */
    public function queryBgreleaseGrayprogress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryBgreleaseGrayprogressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询灰度引流进度
     * Summary: 查询灰度引流进度
     * @param QueryBgreleaseGrayprogressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryBgreleaseGrayprogressResponse
     */
    public function queryBgreleaseGrayprogressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryBgreleaseGrayprogressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.bgrelease.grayprogress.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取灰度引流进度
     * Summary: 获取灰度引流进度
     * @param GetGrayProcessRequest $request
     * @return GetGrayProcessResponse
     */
    public function getGrayProcess($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getGrayProcessEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取灰度引流进度
     * Summary: 获取灰度引流进度
     * @param GetGrayProcessRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetGrayProcessResponse
     */
    public function getGrayProcessEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetGrayProcessResponse::fromMap($this->doRequest("1.0", "antcloud.deps.gray.process.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询灰度引流进度
     * Summary: 查询灰度引流进度
     * @param QueryGrayProgressRequest $request
     * @return QueryGrayProgressResponse
     */
    public function queryGrayProgress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryGrayProgressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询灰度引流进度
     * Summary: 查询灰度引流进度
     * @param QueryGrayProgressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryGrayProgressResponse
     */
    public function queryGrayProgressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryGrayProgressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.gray.progress.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新初始化灰度发布
     * Summary: 重新初始化灰度发布
     * @param ReinitGrayProcessRequest $request
     * @return ReinitGrayProcessResponse
     */
    public function reinitGrayProcess($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->reinitGrayProcessEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新初始化灰度发布
     * Summary: 重新初始化灰度发布
     * @param ReinitGrayProcessRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReinitGrayProcessResponse
     */
    public function reinitGrayProcessEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ReinitGrayProcessResponse::fromMap($this->doRequest("1.0", "antcloud.deps.gray.process.reinit", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试灰度发布子任务
     * Summary: 重试灰度发布子任务
     * @param RetryGrayTaskRequest $request
     * @return RetryGrayTaskResponse
     */
    public function retryGrayTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryGrayTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试灰度发布子任务
     * Summary: 重试灰度发布子任务
     * @param RetryGrayTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryGrayTaskResponse
     */
    public function retryGrayTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryGrayTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.gray.task.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 跳过灰度发布子任务
     * Summary: 跳过灰度发布子任务
     * @param SkipGrayTaskRequest $request
     * @return SkipGrayTaskResponse
     */
    public function skipGrayTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipGrayTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 跳过灰度发布子任务
     * Summary: 跳过灰度发布子任务
     * @param SkipGrayTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipGrayTaskResponse
     */
    public function skipGrayTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipGrayTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.gray.task.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询发布机器信息
     * Summary: 查询发布机器信息
     * @param QueryMachineRequest $request
     * @return QueryMachineResponse
     */
    public function queryMachine($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询发布机器信息
     * Summary: 查询发布机器信息
     * @param QueryMachineRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMachineResponse
     */
    public function queryMachineEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMachineResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machine.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取发布机器信息
     * Summary: 获取发布机器信息
     * @param GetMachineRequest $request
     * @return GetMachineResponse
     */
    public function getMachine($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getMachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取发布机器信息
     * Summary: 获取发布机器信息
     * @param GetMachineRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetMachineResponse
     */
    public function getMachineEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetMachineResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machine.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询机器发布进度
     * Summary: 查询机器发布进度
     * @param QueryMachineProgressRequest $request
     * @return QueryMachineProgressResponse
     */
    public function queryMachineProgress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMachineProgressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询机器发布进度
     * Summary: 查询机器发布进度
     * @param QueryMachineProgressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMachineProgressResponse
     */
    public function queryMachineProgressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMachineProgressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machine.progress.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试发布机器
     * Summary: 重试发布机器
     * @param RetryMachineRequest $request
     * @return RetryMachineResponse
     */
    public function retryMachine($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryMachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试发布机器
     * Summary: 重试发布机器
     * @param RetryMachineRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryMachineResponse
     */
    public function retryMachineEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryMachineResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machine.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 忽略机器发布
     * Summary: 忽略机器发布
     * @param SkipMachineRequest $request
     * @return SkipMachineResponse
     */
    public function skipMachine($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipMachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 忽略机器发布
     * Summary: 忽略机器发布
     * @param SkipMachineRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipMachineResponse
     */
    public function skipMachineEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipMachineResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machine.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消机器发布
     * Summary: 取消机器发布
     * @param CancelMachineRequest $request
     * @return CancelMachineResponse
     */
    public function cancelMachine($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cancelMachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消机器发布
     * Summary: 取消机器发布
     * @param CancelMachineRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CancelMachineResponse
     */
    public function cancelMachineEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CancelMachineResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machine.cancel", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 触发执行机器发布
     * Summary: 触发执行机器发布
     * @param ExecMachineRequest $request
     * @return ExecMachineResponse
     */
    public function execMachine($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execMachineEx($request, $headers, $runtime);
    }

    /**
     * Description: 触发执行机器发布
     * Summary: 触发执行机器发布
     * @param ExecMachineRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecMachineResponse
     */
    public function execMachineEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecMachineResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machine.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询机器分组发布进度
     * Summary: 查询机器分组发布进度
     * @param QueryMachinegroupProgressRequest $request
     * @return QueryMachinegroupProgressResponse
     */
    public function queryMachinegroupProgress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMachinegroupProgressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询机器分组发布进度
     * Summary: 查询机器分组发布进度
     * @param QueryMachinegroupProgressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMachinegroupProgressResponse
     */
    public function queryMachinegroupProgressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMachinegroupProgressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.progress.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试机器分组
     * Summary: 重试机器分组
     * @param RetryMachinegroupRequest $request
     * @return RetryMachinegroupResponse
     */
    public function retryMachinegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryMachinegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试机器分组
     * Summary: 重试机器分组
     * @param RetryMachinegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryMachinegroupResponse
     */
    public function retryMachinegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryMachinegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     * @param SkipMachinegroupRequest $request
     * @return SkipMachinegroupResponse
     */
    public function skipMachinegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipMachinegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     * @param SkipMachinegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipMachinegroupResponse
     */
    public function skipMachinegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipMachinegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分组取消
     * Summary: 分组取消
     * @param CancelMachinegroupRequest $request
     * @return CancelMachinegroupResponse
     */
    public function cancelMachinegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cancelMachinegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 分组取消
     * Summary: 分组取消
     * @param CancelMachinegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CancelMachinegroupResponse
     */
    public function cancelMachinegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CancelMachinegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.cancel", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分组删除
     * Summary: 分组删除
     * @param DeleteMachinegroupRequest $request
     * @return DeleteMachinegroupResponse
     */
    public function deleteMachinegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteMachinegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 分组删除
     * Summary: 分组删除
     * @param DeleteMachinegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteMachinegroupResponse
     */
    public function deleteMachinegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteMachinegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新分组
     * Summary: 更新分组
     * @param UpdateMachinegroupRequest $request
     * @return UpdateMachinegroupResponse
     */
    public function updateMachinegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateMachinegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新分组
     * Summary: 更新分组
     * @param UpdateMachinegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateMachinegroupResponse
     */
    public function updateMachinegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateMachinegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机器分组确认
     * Summary: 机器分组确认
     * @param ConfirmMachinegroupRequest $request
     * @return ConfirmMachinegroupResponse
     */
    public function confirmMachinegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmMachinegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 机器分组确认
     * Summary: 机器分组确认
     * @param ConfirmMachinegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmMachinegroupResponse
     */
    public function confirmMachinegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmMachinegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.confirm", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机器分组进度批量查询
     * Summary: 机器分组进度批量查询
     * @param BatchqueryMachinegroupProgressRequest $request
     * @return BatchqueryMachinegroupProgressResponse
     */
    public function batchqueryMachinegroupProgress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->batchqueryMachinegroupProgressEx($request, $headers, $runtime);
    }

    /**
     * Description: 机器分组进度批量查询
     * Summary: 机器分组进度批量查询
     * @param BatchqueryMachinegroupProgressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return BatchqueryMachinegroupProgressResponse
     */
    public function batchqueryMachinegroupProgressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return BatchqueryMachinegroupProgressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.progress.batchquery", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分区预确认
     * Summary: 分区预确认
     * @param ConfirmMachinegroupReserveRequest $request
     * @return ConfirmMachinegroupReserveResponse
     */
    public function confirmMachinegroupReserve($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmMachinegroupReserveEx($request, $headers, $runtime);
    }

    /**
     * Description: 分区预确认
     * Summary: 分区预确认
     * @param ConfirmMachinegroupReserveRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmMachinegroupReserveResponse
     */
    public function confirmMachinegroupReserveEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmMachinegroupReserveResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.reserve.confirm", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改分组 SLB 权重
     * Summary: 修改分组 SLB 权重
     * @param UpdateMachinegroupSlbmountweightRequest $request
     * @return UpdateMachinegroupSlbmountweightResponse
     */
    public function updateMachinegroupSlbmountweight($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateMachinegroupSlbmountweightEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改分组 SLB 权重
     * Summary: 修改分组 SLB 权重
     * @param UpdateMachinegroupSlbmountweightRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateMachinegroupSlbmountweightResponse
     */
    public function updateMachinegroupSlbmountweightEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateMachinegroupSlbmountweightResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.slbmountweight.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询分组 SLB 挂载进度
     * Summary: 查询分组 SLB 挂载进度
     * @param QueryMachinegroupSlbmountprogressRequest $request
     * @return QueryMachinegroupSlbmountprogressResponse
     */
    public function queryMachinegroupSlbmountprogress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMachinegroupSlbmountprogressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询分组 SLB 挂载进度
     * Summary: 查询分组 SLB 挂载进度
     * @param QueryMachinegroupSlbmountprogressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMachinegroupSlbmountprogressResponse
     */
    public function queryMachinegroupSlbmountprogressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMachinegroupSlbmountprogressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.slbmountprogress.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询 slb 挂载状态
     * Summary: 查询 slb 挂载状态
     * @param QueryMachinegroupSlbmountRequest $request
     * @return QueryMachinegroupSlbmountResponse
     */
    public function queryMachinegroupSlbmount($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMachinegroupSlbmountEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询 slb 挂载状态
     * Summary: 查询 slb 挂载状态
     * @param QueryMachinegroupSlbmountRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMachinegroupSlbmountResponse
     */
    public function queryMachinegroupSlbmountEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMachinegroupSlbmountResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.slbmount.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取分组信息
     * Summary: 获取分组信息
     * @param GetMachinegroupRequest $request
     * @return GetMachinegroupResponse
     */
    public function getMachinegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getMachinegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取分组信息
     * Summary: 获取分组信息
     * @param GetMachinegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetMachinegroupResponse
     */
    public function getMachinegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetMachinegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinegroup.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 忽略分组任务
     * Summary: 忽略分组任务
     * @param SkipMachinetaskRequest $request
     * @return SkipMachinetaskResponse
     */
    public function skipMachinetask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipMachinetaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 忽略分组任务
     * Summary: 忽略分组任务
     * @param SkipMachinetaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipMachinetaskResponse
     */
    public function skipMachinetaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipMachinetaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinetask.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机器任务重试
     * Summary: 机器任务重试
     * @param RetryMachinetaskRequest $request
     * @return RetryMachinetaskResponse
     */
    public function retryMachinetask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryMachinetaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 机器任务重试
     * Summary: 机器任务重试
     * @param RetryMachinetaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryMachinetaskResponse
     */
    public function retryMachinetaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryMachinetaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.machinetask.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询部署单元
     * Summary: 查询部署单元
     * @param QueryMetaCellRequest $request
     * @return QueryMetaCellResponse
     */
    public function queryMetaCell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询部署单元
     * Summary: 查询部署单元
     * @param QueryMetaCellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMetaCellResponse
     */
    public function queryMetaCellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMetaCellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.meta.cell.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建 deployment cell
     * Summary: 创建 deployment cell
     * @param CreateMetaDeploymentcellRequest $request
     * @return CreateMetaDeploymentcellResponse
     */
    public function createMetaDeploymentcell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createMetaDeploymentcellEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建 deployment cell
     * Summary: 创建 deployment cell
     * @param CreateMetaDeploymentcellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateMetaDeploymentcellResponse
     */
    public function createMetaDeploymentcellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateMetaDeploymentcellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.meta.deploymentcell.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新 deployment zone
     * Summary: 更新 deployment zone
     * @param UpdateMetaDeploymentcellRequest $request
     * @return UpdateMetaDeploymentcellResponse
     */
    public function updateMetaDeploymentcell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateMetaDeploymentcellEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新 deployment zone
     * Summary: 更新 deployment zone
     * @param UpdateMetaDeploymentcellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateMetaDeploymentcellResponse
     */
    public function updateMetaDeploymentcellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateMetaDeploymentcellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.meta.deploymentcell.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取 deployment cell
     * Summary: 获取 deployment cell
     * @param GetMetaDeploymentcellRequest $request
     * @return GetMetaDeploymentcellResponse
     */
    public function getMetaDeploymentcell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getMetaDeploymentcellEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取 deployment cell
     * Summary: 获取 deployment cell
     * @param GetMetaDeploymentcellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetMetaDeploymentcellResponse
     */
    public function getMetaDeploymentcellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetMetaDeploymentcellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.meta.deploymentcell.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量获取 deployment cell
     * Summary: 批量获取 deployment cell
     * @param QueryMetaDeploymentcellRequest $request
     * @return QueryMetaDeploymentcellResponse
     */
    public function queryMetaDeploymentcell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryMetaDeploymentcellEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量获取 deployment cell
     * Summary: 批量获取 deployment cell
     * @param QueryMetaDeploymentcellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryMetaDeploymentcellResponse
     */
    public function queryMetaDeploymentcellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryMetaDeploymentcellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.meta.deploymentcell.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建通知配置
     * Summary: 创建通知配置
     * @param CreateNotificationConfigRequest $request
     * @return CreateNotificationConfigResponse
     */
    public function createNotificationConfig($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createNotificationConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建通知配置
     * Summary: 创建通知配置
     * @param CreateNotificationConfigRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateNotificationConfigResponse
     */
    public function createNotificationConfigEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateNotificationConfigResponse::fromMap($this->doRequest("1.0", "antcloud.deps.notification.config.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新通知配置
     * Summary: 更新通知配置
     * @param UpdateNotificationConfigRequest $request
     * @return UpdateNotificationConfigResponse
     */
    public function updateNotificationConfig($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateNotificationConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新通知配置
     * Summary: 更新通知配置
     * @param UpdateNotificationConfigRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateNotificationConfigResponse
     */
    public function updateNotificationConfigEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateNotificationConfigResponse::fromMap($this->doRequest("1.0", "antcloud.deps.notification.config.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询通知配置
     * Summary: 查询通知配置
     * @param QueryNotificationConfigRequest $request
     * @return QueryNotificationConfigResponse
     */
    public function queryNotificationConfig($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryNotificationConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询通知配置
     * Summary: 查询通知配置
     * @param QueryNotificationConfigRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryNotificationConfigResponse
     */
    public function queryNotificationConfigEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryNotificationConfigResponse::fromMap($this->doRequest("1.0", "antcloud.deps.notification.config.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除通知配置
     * Summary: 删除通知配置
     * @param DeleteNotificationConfigRequest $request
     * @return DeleteNotificationConfigResponse
     */
    public function deleteNotificationConfig($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteNotificationConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除通知配置
     * Summary: 删除通知配置
     * @param DeleteNotificationConfigRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteNotificationConfigResponse
     */
    public function deleteNotificationConfigEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteNotificationConfigResponse::fromMap($this->doRequest("1.0", "antcloud.deps.notification.config.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户信息
     * Summary: 查询用户信息
     * @param QueryOperatorRequest $request
     * @return QueryOperatorResponse
     */
    public function queryOperator($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户信息
     * Summary: 查询用户信息
     * @param QueryOperatorRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryOperatorResponse
     */
    public function queryOperatorEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryOperatorResponse::fromMap($this->doRequest("1.0", "antcloud.deps.operator.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 回滚
     * Summary: 回滚
     * @param RollbackPlanServiceRequest $request
     * @return RollbackPlanServiceResponse
     */
    public function rollbackPlanService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->rollbackPlanServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 回滚
     * Summary: 回滚
     * @param RollbackPlanServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RollbackPlanServiceResponse
     */
    public function rollbackPlanServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RollbackPlanServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.service.rollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     * @param CreatePlanRequest $request
     * @return CreatePlanResponse
     */
    public function createPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     * @param CreatePlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreatePlanResponse
     */
    public function createPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreatePlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布单校验
     * Summary: 发布单校验
     * @param CheckPlanRequest $request
     * @return CheckPlanResponse
     */
    public function checkPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布单校验
     * Summary: 发布单校验
     * @param CheckPlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckPlanResponse
     */
    public function checkPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckPlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验运维单请求
     * Summary: 校验运维单请求
     * @param CheckPlanOperationRequest $request
     * @return CheckPlanOperationResponse
     */
    public function checkPlanOperation($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkPlanOperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验运维单请求
     * Summary: 校验运维单请求
     * @param CheckPlanOperationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckPlanOperationResponse
     */
    public function checkPlanOperationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckPlanOperationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.operation.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建运维单
     * Summary: 创建运维单
     * @param CreatePlanOperationRequest $request
     * @return CreatePlanOperationResponse
     */
    public function createPlanOperation($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createPlanOperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建运维单
     * Summary: 创建运维单
     * @param CreatePlanOperationRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreatePlanOperationResponse
     */
    public function createPlanOperationEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreatePlanOperationResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.operation.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     * @param CreatePlanAdvancedRequest $request
     * @return CreatePlanAdvancedResponse
     */
    public function createPlanAdvanced($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createPlanAdvancedEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建发布单
     * Summary: 创建发布单
     * @param CreatePlanAdvancedRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreatePlanAdvancedResponse
     */
    public function createPlanAdvancedEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreatePlanAdvancedResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.advanced.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新初始化发布单
     * Summary: 重新初始化发布单
     * @param ReinitPlanRequest $request
     * @return ReinitPlanResponse
     */
    public function reinitPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->reinitPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新初始化发布单
     * Summary: 重新初始化发布单
     * @param ReinitPlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReinitPlanResponse
     */
    public function reinitPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ReinitPlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.reinit", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取发布单信息
     * Summary: 获取发布单信息
     * @param GetPlanRequest $request
     * @return GetPlanResponse
     */
    public function getPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取发布单信息
     * Summary: 获取发布单信息
     * @param GetPlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetPlanResponse
     */
    public function getPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetPlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取发布单基本信息
     * Summary: 获取发布单基本信息
     * @param GetPlanBasicRequest $request
     * @return GetPlanBasicResponse
     */
    public function getPlanBasic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getPlanBasicEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取发布单基本信息
     * Summary: 获取发布单基本信息
     * @param GetPlanBasicRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetPlanBasicResponse
     */
    public function getPlanBasicEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetPlanBasicResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.basic.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取发布进度
     * Summary: 获取发布进度
     * @param GetPlanProgressRequest $request
     * @return GetPlanProgressResponse
     */
    public function getPlanProgress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getPlanProgressEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取发布进度
     * Summary: 获取发布进度
     * @param GetPlanProgressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetPlanProgressResponse
     */
    public function getPlanProgressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetPlanProgressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.progress.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询发布单
     * Summary: 查询发布单
     * @param QueryPlanRequest $request
     * @return QueryPlanResponse
     */
    public function queryPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询发布单
     * Summary: 查询发布单
     * @param QueryPlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryPlanResponse
     */
    public function queryPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryPlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布单状态统计
     * Summary: 发布单状态统计
     * @param CountPlanStateRequest $request
     * @return CountPlanStateResponse
     */
    public function countPlanState($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->countPlanStateEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布单状态统计
     * Summary: 发布单状态统计
     * @param CountPlanStateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CountPlanStateResponse
     */
    public function countPlanStateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CountPlanStateResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.state.count", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  执行
     * Summary:  执行
     * @param ExecPlanRequest $request
     * @return ExecPlanResponse
     */
    public function execPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execPlanEx($request, $headers, $runtime);
    }

    /**
     * Description:  执行
     * Summary:  执行
     * @param ExecPlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecPlanResponse
     */
    public function execPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecPlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试
     * Summary: 重试
     * @param RetryPlanRequest $request
     * @return RetryPlanResponse
     */
    public function retryPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试
     * Summary: 重试
     * @param RetryPlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryPlanResponse
     */
    public function retryPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryPlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消发布
     * Summary: 取消发布
     * @param CancelPlanRequest $request
     * @return CancelPlanResponse
     */
    public function cancelPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cancelPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消发布
     * Summary: 取消发布
     * @param CancelPlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CancelPlanResponse
     */
    public function cancelPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CancelPlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.cancel", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 回滚发布单
     * Summary: 回滚发布单
     * @param RollbackPlanRequest $request
     * @return RollbackPlanResponse
     */
    public function rollbackPlan($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->rollbackPlanEx($request, $headers, $runtime);
    }

    /**
     * Description: 回滚发布单
     * Summary: 回滚发布单
     * @param RollbackPlanRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RollbackPlanResponse
     */
    public function rollbackPlanEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RollbackPlanResponse::fromMap($this->doRequest("1.0", "antcloud.deps.plan.rollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取任务详情
     * Summary: 获取任务详情
     * @param GetTaskSummaryRequest $request
     * @return GetTaskSummaryResponse
     */
    public function getTaskSummary($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getTaskSummaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取任务详情
     * Summary: 获取任务详情
     * @param GetTaskSummaryRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetTaskSummaryResponse
     */
    public function getTaskSummaryEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetTaskSummaryResponse::fromMap($this->doRequest("1.0", "antcloud.deps.task.summary.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 忽略任务
     * Summary: 忽略任务
     * @param SkipTaskRequest $request
     * @return SkipTaskResponse
     */
    public function skipTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 忽略任务
     * Summary: 忽略任务
     * @param SkipTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipTaskResponse
     */
    public function skipTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.task.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试任务
     * Summary: 重试任务
     * @param RetryTaskRequest $request
     * @return RetryTaskResponse
     */
    public function retryTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试任务
     * Summary: 重试任务
     * @param RetryTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryTaskResponse
     */
    public function retryTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.task.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询角色信息
     * Summary: 查询角色信息
     * @param QueryRoleRequest $request
     * @return QueryRoleResponse
     */
    public function queryRole($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询角色信息
     * Summary: 查询角色信息
     * @param QueryRoleRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRoleResponse
     */
    public function queryRoleEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRoleResponse::fromMap($this->doRequest("1.0", "antcloud.deps.role.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建应用服务分组集合
     * Summary: 创建应用服务分组集合
     * @param CreateServicegroupcollectionRequest $request
     * @return CreateServicegroupcollectionResponse
     */
    public function createServicegroupcollection($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createServicegroupcollectionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建应用服务分组集合
     * Summary: 创建应用服务分组集合
     * @param CreateServicegroupcollectionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateServicegroupcollectionResponse
     */
    public function createServicegroupcollectionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateServicegroupcollectionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.servicegroupcollection.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 清除应用服务发布分组集合
     * Summary: 清除应用服务发布分组集合
     * @param DeleteServicegroupcollectionRequest $request
     * @return DeleteServicegroupcollectionResponse
     */
    public function deleteServicegroupcollection($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteServicegroupcollectionEx($request, $headers, $runtime);
    }

    /**
     * Description: 清除应用服务发布分组集合
     * Summary: 清除应用服务发布分组集合
     * @param DeleteServicegroupcollectionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteServicegroupcollectionResponse
     */
    public function deleteServicegroupcollectionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteServicegroupcollectionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.servicegroupcollection.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试分组
     * Summary: 重试分组
     * @param RetryServicegroupRequest $request
     * @return RetryServicegroupResponse
     */
    public function retryServicegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryServicegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试分组
     * Summary: 重试分组
     * @param RetryServicegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryServicegroupResponse
     */
    public function retryServicegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryServicegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.servicegroup.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 执行发布分组
     * Summary: 执行发布分组
     * @param ExecServicegroupRequest $request
     * @return ExecServicegroupResponse
     */
    public function execServicegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execServicegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 执行发布分组
     * Summary: 执行发布分组
     * @param ExecServicegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecServicegroupResponse
     */
    public function execServicegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecServicegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.servicegroup.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     * @param SkipServicegroupRequest $request
     * @return SkipServicegroupResponse
     */
    public function skipServicegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipServicegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     * @param SkipServicegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipServicegroupResponse
     */
    public function skipServicegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipServicegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.servicegroup.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建发布分组
     * Summary: 创建发布分组
     * @param CreateServicegroupRequest $request
     * @return CreateServicegroupResponse
     */
    public function createServicegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createServicegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建发布分组
     * Summary: 创建发布分组
     * @param CreateServicegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateServicegroupResponse
     */
    public function createServicegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateServicegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.servicegroup.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除发布分组
     * Summary: 删除发布分组
     * @param DeleteServicegroupRequest $request
     * @return DeleteServicegroupResponse
     */
    public function deleteServicegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteServicegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除发布分组
     * Summary: 删除发布分组
     * @param DeleteServicegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteServicegroupResponse
     */
    public function deleteServicegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteServicegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.servicegroup.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 转换分组
     * Summary: 转换分组
     * @param SwitchServicegroupRequest $request
     * @return SwitchServicegroupResponse
     */
    public function switchServicegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->switchServicegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 转换分组
     * Summary: 转换分组
     * @param SwitchServicegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SwitchServicegroupResponse
     */
    public function switchServicegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SwitchServicegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.servicegroup.switch", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取发布服务详情
     * Summary: 获取发布服务详情
     * @param GetServiceRequest $request
     * @return GetServiceResponse
     */
    public function getService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取发布服务详情
     * Summary: 获取发布服务详情
     * @param GetServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetServiceResponse
     */
    public function getServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取应用发布信息
     * Summary: 获取应用发布信息
     * @param GetServiceProgressRequest $request
     * @return GetServiceProgressResponse
     */
    public function getServiceProgress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getServiceProgressEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取应用发布信息
     * Summary: 获取应用发布信息
     * @param GetServiceProgressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetServiceProgressResponse
     */
    public function getServiceProgressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetServiceProgressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.progress.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询发布进度
     * Summary: 查询发布进度
     * @param QueryServiceProgressRequest $request
     * @return QueryServiceProgressResponse
     */
    public function queryServiceProgress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryServiceProgressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询发布进度
     * Summary: 查询发布进度
     * @param QueryServiceProgressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryServiceProgressResponse
     */
    public function queryServiceProgressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryServiceProgressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.progress.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询SLB挂载信息
     * Summary: 查询SLB挂载信息
     * @param QueryServiceSlbmountRequest $request
     * @return QueryServiceSlbmountResponse
     */
    public function queryServiceSlbmount($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryServiceSlbmountEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询SLB挂载信息
     * Summary: 查询SLB挂载信息
     * @param QueryServiceSlbmountRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryServiceSlbmountResponse
     */
    public function queryServiceSlbmountEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryServiceSlbmountResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.slbmount.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询 SLB 挂载信息
     * Summary: 批量查询 SLB 挂载信息
     * @param BatchqueryServiceSlbmountRequest $request
     * @return BatchqueryServiceSlbmountResponse
     */
    public function batchqueryServiceSlbmount($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->batchqueryServiceSlbmountEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询 SLB 挂载信息
     * Summary: 批量查询 SLB 挂载信息
     * @param BatchqueryServiceSlbmountRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return BatchqueryServiceSlbmountResponse
     */
    public function batchqueryServiceSlbmountEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return BatchqueryServiceSlbmountResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.slbmount.batchquery", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新slb挂载权重
     * Summary: 更新slb挂载权重
     * @param UpdateServiceSlbmountRequest $request
     * @return UpdateServiceSlbmountResponse
     */
    public function updateServiceSlbmount($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateServiceSlbmountEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新slb挂载权重
     * Summary: 更新slb挂载权重
     * @param UpdateServiceSlbmountRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateServiceSlbmountResponse
     */
    public function updateServiceSlbmountEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateServiceSlbmountResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.slbmount.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询挂载进度
     * Summary: 查询挂载进度
     * @param QueryServiceSlbmountprogressRequest $request
     * @return QueryServiceSlbmountprogressResponse
     */
    public function queryServiceSlbmountprogress($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryServiceSlbmountprogressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询挂载进度
     * Summary: 查询挂载进度
     * @param QueryServiceSlbmountprogressRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryServiceSlbmountprogressResponse
     */
    public function queryServiceSlbmountprogressEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryServiceSlbmountprogressResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.slbmountprogress.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询最近一次发布成功的应用记录
     * Summary: 查询最近一次发布成功的应用记录
     * @param QueryServiceLatestsuccessRequest $request
     * @return QueryServiceLatestsuccessResponse
     */
    public function queryServiceLatestsuccess($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryServiceLatestsuccessEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询最近一次发布成功的应用记录
     * Summary: 查询最近一次发布成功的应用记录
     * @param QueryServiceLatestsuccessRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryServiceLatestsuccessResponse
     */
    public function queryServiceLatestsuccessEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryServiceLatestsuccessResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.latestsuccess.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新初始化
     * Summary: 重新初始化
     * @param ReinitServiceRequest $request
     * @return ReinitServiceResponse
     */
    public function reinitService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->reinitServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新初始化
     * Summary: 重新初始化
     * @param ReinitServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReinitServiceResponse
     */
    public function reinitServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ReinitServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.reinit", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 执行发布单
     * Summary: 执行发布单
     * @param ExecServiceRequest $request
     * @return ExecServiceResponse
     */
    public function execService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 执行发布单
     * Summary: 执行发布单
     * @param ExecServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecServiceResponse
     */
    public function execServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消应用发布
     * Summary: 取消应用发布
     * @param CancelServiceRequest $request
     * @return CancelServiceResponse
     */
    public function cancelService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->cancelServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消应用发布
     * Summary: 取消应用发布
     * @param CancelServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CancelServiceResponse
     */
    public function cancelServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CancelServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.cancel", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     * @param SkipServiceRequest $request
     * @return SkipServiceResponse
     */
    public function skipService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 忽略分组
     * Summary: 忽略分组
     * @param SkipServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipServiceResponse
     */
    public function skipServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 触发服务发布
     * Summary: 触发服务发布
     * @param StartServiceRequest $request
     * @return StartServiceResponse
     */
    public function startService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->startServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 触发服务发布
     * Summary: 触发服务发布
     * @param StartServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return StartServiceResponse
     */
    public function startServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return StartServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.start", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布确认
     * Summary: 发布确认
     * @param ConfirmServiceRequest $request
     * @return ConfirmServiceResponse
     */
    public function confirmService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布确认
     * Summary: 发布确认
     * @param ConfirmServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmServiceResponse
     */
    public function confirmServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.confirm", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 配置机器分组
     * Summary: 配置机器分组
     * @param SetServiceMachinegroupRequest $request
     * @return SetServiceMachinegroupResponse
     */
    public function setServiceMachinegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->setServiceMachinegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 配置机器分组
     * Summary: 配置机器分组
     * @param SetServiceMachinegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SetServiceMachinegroupResponse
     */
    public function setServiceMachinegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SetServiceMachinegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.machinegroup.set", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新初始化机器分组
     * Summary: 重新初始化机器分组
     * @param ReinitServiceMachinegroupRequest $request
     * @return ReinitServiceMachinegroupResponse
     */
    public function reinitServiceMachinegroup($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->reinitServiceMachinegroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新初始化机器分组
     * Summary: 重新初始化机器分组
     * @param ReinitServiceMachinegroupRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReinitServiceMachinegroupResponse
     */
    public function reinitServiceMachinegroupEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ReinitServiceMachinegroupResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.machinegroup.reinit", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询可回滚服务
     * Summary: 查询可回滚服务
     * @param ListServiceRollbackversionRequest $request
     * @return ListServiceRollbackversionResponse
     */
    public function listServiceRollbackversion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listServiceRollbackversionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询可回滚服务
     * Summary: 查询可回滚服务
     * @param ListServiceRollbackversionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListServiceRollbackversionResponse
     */
    public function listServiceRollbackversionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListServiceRollbackversionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.rollbackversion.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询可回滚版本
     * Summary: 查询可回滚版本
     * @param QueryServiceRollbackversionRequest $request
     * @return QueryServiceRollbackversionResponse
     */
    public function queryServiceRollbackversion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryServiceRollbackversionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询可回滚版本
     * Summary: 查询可回滚版本
     * @param QueryServiceRollbackversionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryServiceRollbackversionResponse
     */
    public function queryServiceRollbackversionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryServiceRollbackversionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.rollbackversion.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 回滚应用
     * Summary: 回滚应用
     * @param RollbackServiceRequest $request
     * @return RollbackServiceResponse
     */
    public function rollbackService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->rollbackServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 回滚应用
     * Summary: 回滚应用
     * @param RollbackServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RollbackServiceResponse
     */
    public function rollbackServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RollbackServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.rollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 回滚确认
     * Summary: 回滚确认
     * @param ConfirmrollbackServiceRequest $request
     * @return ConfirmrollbackServiceResponse
     */
    public function confirmrollbackService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmrollbackServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 回滚确认
     * Summary: 回滚确认
     * @param ConfirmrollbackServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmrollbackServiceResponse
     */
    public function confirmrollbackServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmrollbackServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.confirmrollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 回滚重试
     * Summary: 回滚重试
     * @param RetryrollbackServiceRequest $request
     * @return RetryrollbackServiceResponse
     */
    public function retryrollbackService($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryrollbackServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 回滚重试
     * Summary: 回滚重试
     * @param RetryrollbackServiceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryrollbackServiceResponse
     */
    public function retryrollbackServiceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryrollbackServiceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.retryrollback", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取子流程进度
     * Summary: 获取子流程进度
     * @param GetServiceArrangementRequest $request
     * @return GetServiceArrangementResponse
     */
    public function getServiceArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getServiceArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取子流程进度
     * Summary: 获取子流程进度
     * @param GetServiceArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetServiceArrangementResponse
     */
    public function getServiceArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetServiceArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.arrangement.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重试子流程
     * Summary: 重试子流程
     * @param RetryServiceArrangementRequest $request
     * @return RetryServiceArrangementResponse
     */
    public function retryServiceArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->retryServiceArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 重试子流程
     * Summary: 重试子流程
     * @param RetryServiceArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return RetryServiceArrangementResponse
     */
    public function retryServiceArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return RetryServiceArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.arrangement.retry", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 忽略子流程
     * Summary: 忽略子流程
     * @param SkipServiceArrangementRequest $request
     * @return SkipServiceArrangementResponse
     */
    public function skipServiceArrangement($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->skipServiceArrangementEx($request, $headers, $runtime);
    }

    /**
     * Description: 忽略子流程
     * Summary: 忽略子流程
     * @param SkipServiceArrangementRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SkipServiceArrangementResponse
     */
    public function skipServiceArrangementEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SkipServiceArrangementResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.arrangement.skip", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query op log
     * Summary: query op log
     * @param QueryOperationlogRequest $request
     * @return QueryOperationlogResponse
     */
    public function queryOperationlog($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryOperationlogEx($request, $headers, $runtime);
    }

    /**
     * Description: query op log
     * Summary: query op log
     * @param QueryOperationlogRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryOperationlogResponse
     */
    public function queryOperationlogEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryOperationlogResponse::fromMap($this->doRequest("1.0", "antcloud.deps.operationlog.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: operation time line
     * Summary: operation time line
     * @param QueryOperationlogTimelineRequest $request
     * @return QueryOperationlogTimelineResponse
     */
    public function queryOperationlogTimeline($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryOperationlogTimelineEx($request, $headers, $runtime);
    }

    /**
     * Description: operation time line
     * Summary: operation time line
     * @param QueryOperationlogTimelineRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryOperationlogTimelineResponse
     */
    public function queryOperationlogTimelineEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryOperationlogTimelineResponse::fromMap($this->doRequest("1.0", "antcloud.deps.operationlog.timeline.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取发布应用详情
     * Summary: 获取发布应用详情
     * @param GetServiceDetailRequest $request
     * @return GetServiceDetailResponse
     */
    public function getServiceDetail($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getServiceDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取发布应用详情
     * Summary: 获取发布应用详情
     * @param GetServiceDetailRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetServiceDetailResponse
     */
    public function getServiceDetailEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetServiceDetailResponse::fromMap($this->doRequest("1.0", "antcloud.deps.service.detail.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: create cell
     * Summary: create cell
     * @param CreateMetaCellRequest $request
     * @return CreateMetaCellResponse
     */
    public function createMetaCell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createMetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: create cell
     * Summary: create cell
     * @param CreateMetaCellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateMetaCellResponse
     */
    public function createMetaCellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateMetaCellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.meta.cell.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: update cell
     * Summary: update cell
     * @param UpdateMetaCellRequest $request
     * @return UpdateMetaCellResponse
     */
    public function updateMetaCell($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateMetaCellEx($request, $headers, $runtime);
    }

    /**
     * Description: update cell
     * Summary: update cell
     * @param UpdateMetaCellRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateMetaCellResponse
     */
    public function updateMetaCellEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateMetaCellResponse::fromMap($this->doRequest("1.0", "antcloud.deps.meta.cell.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 关联 master zone
     * Summary: 关联 master zone
     * @param AddMetaMasterzonerelRequest $request
     * @return AddMetaMasterzonerelResponse
     */
    public function addMetaMasterzonerel($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->addMetaMasterzonerelEx($request, $headers, $runtime);
    }

    /**
     * Description: 关联 master zone
     * Summary: 关联 master zone
     * @param AddMetaMasterzonerelRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return AddMetaMasterzonerelResponse
     */
    public function addMetaMasterzonerelEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return AddMetaMasterzonerelResponse::fromMap($this->doRequest("1.0", "antcloud.deps.meta.masterzonerel.add", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分配指定的一个或者多个计算资源到指定的应用
     * Summary: 分配应用计算资源
     * @param AssignComputerRequest $request
     * @return AssignComputerResponse
     */
    public function assignComputer($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->assignComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 分配指定的一个或者多个计算资源到指定的应用
     * Summary: 分配应用计算资源
     * @param AssignComputerRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return AssignComputerResponse
     */
    public function assignComputerEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return AssignComputerResponse::fromMap($this->doRequest("1.0", "antcloud.deps.computer.assign", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 从指定应用释放一个或者多个计算资源
     * Summary: 释放应用计算资源
     * @param ReleaseComputerRequest $request
     * @return ReleaseComputerResponse
     */
    public function releaseComputer($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->releaseComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 从指定应用释放一个或者多个计算资源
     * Summary: 释放应用计算资源
     * @param ReleaseComputerRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ReleaseComputerResponse
     */
    public function releaseComputerEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ReleaseComputerResponse::fromMap($this->doRequest("1.0", "antcloud.deps.computer.release", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
     * Summary: 获取异步任务
     * @param GetTaskRequest $request
     * @return GetTaskResponse
     */
    public function getTask($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
     * Summary: 获取异步任务
     * @param GetTaskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetTaskResponse
     */
    public function getTaskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetTaskResponse::fromMap($this->doRequest("1.0", "antcloud.deps.task.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建 ecs 实例
     * Summary: 创建 ecs 实例
     * @param CreateComputerRequest $request
     * @return CreateComputerResponse
     */
    public function createComputer($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建 ecs 实例
     * Summary: 创建 ecs 实例
     * @param CreateComputerRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateComputerResponse
     */
    public function createComputerEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateComputerResponse::fromMap($this->doRequest("1.0", "antcloud.deps.computer.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建sidecar元数据信息
     * Summary: 创建sidecar元数据信息
     * @param CreateSidecarRequest $request
     * @return CreateSidecarResponse
     */
    public function createSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建sidecar元数据信息
     * Summary: 创建sidecar元数据信息
     * @param CreateSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateSidecarResponse
     */
    public function createSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询sidecar元信息列表
     * Summary: 查询sidecar元信息列表
     * @param ListSidecarRequest $request
     * @return ListSidecarResponse
     */
    public function listSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询sidecar元信息列表
     * Summary: 查询sidecar元信息列表
     * @param ListSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListSidecarResponse
     */
    public function listSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建sidecar模板
     * Summary: 创建sidecar版本
     * @param CreateSidecarVersionRequest $request
     * @return CreateSidecarVersionResponse
     */
    public function createSidecarVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createSidecarVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建sidecar模板
     * Summary: 创建sidecar版本
     * @param CreateSidecarVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateSidecarVersionResponse
     */
    public function createSidecarVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateSidecarVersionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.version.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询sidecar模板列表
     * Summary: 查询sidecar模板列表
     * @param ListSidecarVersionRequest $request
     * @return ListSidecarVersionResponse
     */
    public function listSidecarVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listSidecarVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询sidecar模板列表
     * Summary: 查询sidecar模板列表
     * @param ListSidecarVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListSidecarVersionResponse
     */
    public function listSidecarVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListSidecarVersionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.version.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取sidecar版本详情
     * Summary: 获取sidecar版本详情
     * @param GetSidecarVersionRequest $request
     * @return GetSidecarVersionResponse
     */
    public function getSidecarVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getSidecarVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取sidecar版本详情
     * Summary: 获取sidecar版本详情
     * @param GetSidecarVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetSidecarVersionResponse
     */
    public function getSidecarVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetSidecarVersionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.version.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建sidecar规则
     * Summary: 创建sidecar规则
     * @param CreateSidecarRuleRequest $request
     * @return CreateSidecarRuleResponse
     */
    public function createSidecarRule($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createSidecarRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建sidecar规则
     * Summary: 创建sidecar规则
     * @param CreateSidecarRuleRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateSidecarRuleResponse
     */
    public function createSidecarRuleEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateSidecarRuleResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.rule.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取sidecar单个规则详情
     * Summary: 获取sidecar单个规则详情
     * @param GetSidecarRuleRequest $request
     * @return GetSidecarRuleResponse
     */
    public function getSidecarRule($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getSidecarRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取sidecar单个规则详情
     * Summary: 获取sidecar单个规则详情
     * @param GetSidecarRuleRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetSidecarRuleResponse
     */
    public function getSidecarRuleEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetSidecarRuleResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.rule.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取sidecar规则列表
     * Summary: 获取sidecar规则列表
     * @param ListSidecarRuleRequest $request
     * @return ListSidecarRuleResponse
     */
    public function listSidecarRule($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listSidecarRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取sidecar规则列表
     * Summary: 获取sidecar规则列表
     * @param ListSidecarRuleRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListSidecarRuleResponse
     */
    public function listSidecarRuleEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListSidecarRuleResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.rule.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建sidecar版本实例
     * Summary: 创建sidecar版本实例
     * @param CreateSidecarInstanceRequest $request
     * @return CreateSidecarInstanceResponse
     */
    public function createSidecarInstance($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createSidecarInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建sidecar版本实例
     * Summary: 创建sidecar版本实例
     * @param CreateSidecarInstanceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateSidecarInstanceResponse
     */
    public function createSidecarInstanceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateSidecarInstanceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.instance.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询sidecar版本实例列表
     * Summary: 查询sidecar版本实例列表
     * @param ListSidecarInstanceRequest $request
     * @return ListSidecarInstanceResponse
     */
    public function listSidecarInstance($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listSidecarInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询sidecar版本实例列表
     * Summary: 查询sidecar版本实例列表
     * @param ListSidecarInstanceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListSidecarInstanceResponse
     */
    public function listSidecarInstanceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListSidecarInstanceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.instance.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取sidecar版本实例
     * Summary: 获取sidecar版本实例
     * @param GetSidecarInstanceRequest $request
     * @return GetSidecarInstanceResponse
     */
    public function getSidecarInstance($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getSidecarInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取sidecar版本实例
     * Summary: 获取sidecar版本实例
     * @param GetSidecarInstanceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetSidecarInstanceResponse
     */
    public function getSidecarInstanceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetSidecarInstanceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.instance.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取sidecar类型
     * Summary: 获取sidecar类型
     * @param GetSidecarRequest $request
     * @return GetSidecarResponse
     */
    public function getSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取sidecar类型
     * Summary: 获取sidecar类型
     * @param GetSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetSidecarResponse
     */
    public function getSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新sidecar类型信息
     * Summary: 更新sidecar类型信息
     * @param UpdateSidecarRequest $request
     * @return UpdateSidecarResponse
     */
    public function updateSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新sidecar类型信息
     * Summary: 更新sidecar类型信息
     * @param UpdateSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateSidecarResponse
     */
    public function updateSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除sidecar类型
     * Summary: 删除sidecar类型
     * @param DeleteSidecarRequest $request
     * @return DeleteSidecarResponse
     */
    public function deleteSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除sidecar类型
     * Summary: 删除sidecar类型
     * @param DeleteSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteSidecarResponse
     */
    public function deleteSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新sidecar版本
     * Summary: 更新sidecar版本
     * @param UpdateSidecarVersionRequest $request
     * @return UpdateSidecarVersionResponse
     */
    public function updateSidecarVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateSidecarVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新sidecar版本
     * Summary: 更新sidecar版本
     * @param UpdateSidecarVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateSidecarVersionResponse
     */
    public function updateSidecarVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateSidecarVersionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.version.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除sidecar模板
     * Summary: 删除sidecar模板
     * @param DeleteSidecarVersionRequest $request
     * @return DeleteSidecarVersionResponse
     */
    public function deleteSidecarVersion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteSidecarVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除sidecar模板
     * Summary: 删除sidecar模板
     * @param DeleteSidecarVersionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteSidecarVersionResponse
     */
    public function deleteSidecarVersionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteSidecarVersionResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.version.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新sidecar版本实例
     * Summary: 更新sidecar版本实例
     * @param UpdateSidecarInstanceRequest $request
     * @return UpdateSidecarInstanceResponse
     */
    public function updateSidecarInstance($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateSidecarInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新sidecar版本实例
     * Summary: 更新sidecar版本实例
     * @param UpdateSidecarInstanceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateSidecarInstanceResponse
     */
    public function updateSidecarInstanceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateSidecarInstanceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.instance.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除sidecar版本实例
     * Summary: 删除sidecar版本实例
     * @param DeleteSidecarInstanceRequest $request
     * @return DeleteSidecarInstanceResponse
     */
    public function deleteSidecarInstance($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteSidecarInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除sidecar版本实例
     * Summary: 删除sidecar版本实例
     * @param DeleteSidecarInstanceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteSidecarInstanceResponse
     */
    public function deleteSidecarInstanceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteSidecarInstanceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.instance.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新sidecar规则
     * Summary: 更新sidecar规则
     * @param UpdateSidecarRuleRequest $request
     * @return UpdateSidecarRuleResponse
     */
    public function updateSidecarRule($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateSidecarRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新sidecar规则
     * Summary: 更新sidecar规则
     * @param UpdateSidecarRuleRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateSidecarRuleResponse
     */
    public function updateSidecarRuleEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateSidecarRuleResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.rule.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除sidecar规则
     * Summary: 删除sidecar规则
     * @param DeleteSidecarRuleRequest $request
     * @return DeleteSidecarRuleResponse
     */
    public function deleteSidecarRule($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteSidecarRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除sidecar规则
     * Summary: 删除sidecar规则
     * @param DeleteSidecarRuleRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteSidecarRuleResponse
     */
    public function deleteSidecarRuleEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteSidecarRuleResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.rule.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新sidecar版本状态
     * Summary: 更新sidecar版本状态
     * @param UpdateSidecarVersionstatusRequest $request
     * @return UpdateSidecarVersionstatusResponse
     */
    public function updateSidecarVersionstatus($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateSidecarVersionstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新sidecar版本状态
     * Summary: 更新sidecar版本状态
     * @param UpdateSidecarVersionstatusRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateSidecarVersionstatusResponse
     */
    public function updateSidecarVersionstatusEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateSidecarVersionstatusResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.versionstatus.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新sidecar版本实例状态
     * Summary: 更新sidecar版本实例状态
     * @param UpdateSidecarInstancestatusRequest $request
     * @return UpdateSidecarInstancestatusResponse
     */
    public function updateSidecarInstancestatus($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateSidecarInstancestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新sidecar版本实例状态
     * Summary: 更新sidecar版本实例状态
     * @param UpdateSidecarInstancestatusRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateSidecarInstancestatusResponse
     */
    public function updateSidecarInstancestatusEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateSidecarInstancestatusResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.instancestatus.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新sidecar规则状态
     * Summary: 更新sidecar规则状态
     * @param UpdateSidecarRulestatusRequest $request
     * @return UpdateSidecarRulestatusResponse
     */
    public function updateSidecarRulestatus($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateSidecarRulestatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新sidecar规则状态
     * Summary: 更新sidecar规则状态
     * @param UpdateSidecarRulestatusRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateSidecarRulestatusResponse
     */
    public function updateSidecarRulestatusEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateSidecarRulestatusResponse::fromMap($this->doRequest("1.0", "antcloud.deps.sidecar.rulestatus.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建应用sidecar基线
     * Summary: 创建应用sidecar基线
     * @param CreateAppbaselineSidecarRequest $request
     * @return CreateAppbaselineSidecarResponse
     */
    public function createAppbaselineSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createAppbaselineSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建应用sidecar基线
     * Summary: 创建应用sidecar基线
     * @param CreateAppbaselineSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateAppbaselineSidecarResponse
     */
    public function createAppbaselineSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateAppbaselineSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appbaseline.sidecar.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用sidecar基线
     * Summary: 查询应用sidecar基线
     * @param ListAppbaselineSidecarRequest $request
     * @return ListAppbaselineSidecarResponse
     */
    public function listAppbaselineSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listAppbaselineSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用sidecar基线
     * Summary: 查询应用sidecar基线
     * @param ListAppbaselineSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListAppbaselineSidecarResponse
     */
    public function listAppbaselineSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListAppbaselineSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appbaseline.sidecar.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除应用sidecar基线
     * Summary: 删除应用sidecar基线
     * @param DeleteAppbaselineSidecarRequest $request
     * @return DeleteAppbaselineSidecarResponse
     */
    public function deleteAppbaselineSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->deleteAppbaselineSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除应用sidecar基线
     * Summary: 删除应用sidecar基线
     * @param DeleteAppbaselineSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return DeleteAppbaselineSidecarResponse
     */
    public function deleteAppbaselineSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return DeleteAppbaselineSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appbaseline.sidecar.delete", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新应用sidecar基线
     * Summary: 更新应用sidecar基线
     * @param UpdateAppbaselineSidecarRequest $request
     * @return UpdateAppbaselineSidecarResponse
     */
    public function updateAppbaselineSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->updateAppbaselineSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新应用sidecar基线
     * Summary: 更新应用sidecar基线
     * @param UpdateAppbaselineSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UpdateAppbaselineSidecarResponse
     */
    public function updateAppbaselineSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UpdateAppbaselineSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appbaseline.sidecar.update", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
     * Summary: 创建或更新应用sidecar基线
     * @param SaveAppbaselineSidecarRequest $request
     * @return SaveAppbaselineSidecarResponse
     */
    public function saveAppbaselineSidecar($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->saveAppbaselineSidecarEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
     * Summary: 创建或更新应用sidecar基线
     * @param SaveAppbaselineSidecarRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SaveAppbaselineSidecarResponse
     */
    public function saveAppbaselineSidecarEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SaveAppbaselineSidecarResponse::fromMap($this->doRequest("1.0", "antcloud.deps.appbaseline.sidecar.save", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询workspace详情
     * Summary: 获取workspace
     * @param GetWorkspaceRequest $request
     * @return GetWorkspaceResponse
     */
    public function getWorkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询workspace详情
     * Summary: 获取workspace
     * @param GetWorkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetWorkspaceResponse
     */
    public function getWorkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetWorkspaceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspace.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询workspace列表，可根据状态过滤。
     * Summary: 查询workspace
     * @param QueryWorkspaceRequest $request
     * @return QueryWorkspaceResponse
     */
    public function queryWorkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询workspace列表，可根据状态过滤。
     * Summary: 查询workspace
     * @param QueryWorkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryWorkspaceResponse
     */
    public function queryWorkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryWorkspaceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspace.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建workspace
     * Summary: 创建workspace
     * @param CreateWorkspaceRequest $request
     * @return CreateWorkspaceResponse
     */
    public function createWorkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建workspace
     * Summary: 创建workspace
     * @param CreateWorkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateWorkspaceResponse
     */
    public function createWorkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateWorkspaceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspace.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询workspace列表2.0。
     * Summary: 查询workspace列表2.0
     * @param ListWorkspaceRequest $request
     * @return ListWorkspaceResponse
     */
    public function listWorkspace($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询workspace列表2.0。
     * Summary: 查询workspace列表2.0
     * @param ListWorkspaceRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListWorkspaceResponse
     */
    public function listWorkspaceEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListWorkspaceResponse::fromMap($this->doRequest("1.0", "antcloud.deps.workspace.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
