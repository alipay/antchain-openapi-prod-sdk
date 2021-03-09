<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\CAS\Models\AddLoadbalanceAssignRequest;
use AntChain\CAS\Models\AddLoadbalanceAssignResponse;
use AntChain\CAS\Models\AddSecuritygroupInstanceRequest;
use AntChain\CAS\Models\AddSecuritygroupInstanceResponse;
use AntChain\CAS\Models\AllDatabaseEngineRequest;
use AntChain\CAS\Models\AllDatabaseEngineResponse;
use AntChain\CAS\Models\AllDatabaseImportRequest;
use AntChain\CAS\Models\AllDatabaseImportResponse;
use AntChain\CAS\Models\AllDatabaseMasterzoneRequest;
use AntChain\CAS\Models\AllDatabaseMasterzoneResponse;
use AntChain\CAS\Models\AllDatabaseQuotaRequest;
use AntChain\CAS\Models\AllDatabaseQuotaResponse;
use AntChain\CAS\Models\AllDatabaseSecurityipRequest;
use AntChain\CAS\Models\AllDatabaseSecurityipResponse;
use AntChain\CAS\Models\AllLoadbalanceClusterRequest;
use AntChain\CAS\Models\AllLoadbalanceClusterResponse;
use AntChain\CAS\Models\AllLoadbalanceListenerRequest;
use AntChain\CAS\Models\AllLoadbalanceListenerResponse;
use AntChain\CAS\Models\AllLoadbalanceMountRequest;
use AntChain\CAS\Models\AllLoadbalanceMountResponse;
use AntChain\CAS\Models\AllLoadbalanceRequest;
use AntChain\CAS\Models\AllLoadbalanceResponse;
use AntChain\CAS\Models\AllLoadbalanceVcomputergroupRequest;
use AntChain\CAS\Models\AllLoadbalanceVcomputergroupResponse;
use AntChain\CAS\Models\AllLoadbalanceViptypeRequest;
use AntChain\CAS\Models\AllLoadbalanceViptypeResponse;
use AntChain\CAS\Models\AuthDatabaseAccountRequest;
use AntChain\CAS\Models\AuthDatabaseAccountResponse;
use AntChain\CAS\Models\BatchcreateResourceEgressrulesRequest;
use AntChain\CAS\Models\BatchcreateResourceEgressrulesResponse;
use AntChain\CAS\Models\BatchcreateResourceIngressrulesRequest;
use AntChain\CAS\Models\BatchcreateResourceIngressrulesResponse;
use AntChain\CAS\Models\BatchdeleteApplicationBuildRequest;
use AntChain\CAS\Models\BatchdeleteApplicationBuildResponse;
use AntChain\CAS\Models\BatchdeleteApplicationPackageRequest;
use AntChain\CAS\Models\BatchdeleteApplicationPackageResponse;
use AntChain\CAS\Models\CreateAppgroupRequest;
use AntChain\CAS\Models\CreateAppgroupResponse;
use AntChain\CAS\Models\CreateApplevelRequest;
use AntChain\CAS\Models\CreateApplevelResponse;
use AntChain\CAS\Models\CreateApplicationPackageRequest;
use AntChain\CAS\Models\CreateApplicationPackageResponse;
use AntChain\CAS\Models\CreateApplicationRequest;
use AntChain\CAS\Models\CreateApplicationResponse;
use AntChain\CAS\Models\CreateAppserviceRequest;
use AntChain\CAS\Models\CreateAppserviceResponse;
use AntChain\CAS\Models\CreateCertificateRequest;
use AntChain\CAS\Models\CreateCertificateResponse;
use AntChain\CAS\Models\CreateComputerRequest;
use AntChain\CAS\Models\CreateComputerResponse;
use AntChain\CAS\Models\CreateDatabaseAccountRequest;
use AntChain\CAS\Models\CreateDatabaseAccountResponse;
use AntChain\CAS\Models\CreateDatabaseRequest;
use AntChain\CAS\Models\CreateDatabaseResponse;
use AntChain\CAS\Models\CreateDatabaseSchemaRequest;
use AntChain\CAS\Models\CreateDatabaseSchemaResponse;
use AntChain\CAS\Models\CreateLoadbalanceListenerRequest;
use AntChain\CAS\Models\CreateLoadbalanceListenerResponse;
use AntChain\CAS\Models\CreateLoadbalanceMountRequest;
use AntChain\CAS\Models\CreateLoadbalanceMountResponse;
use AntChain\CAS\Models\CreateLoadbalanceRequest;
use AntChain\CAS\Models\CreateLoadbalanceResponse;
use AntChain\CAS\Models\CreateLoadbalanceSecurityipRequest;
use AntChain\CAS\Models\CreateLoadbalanceSecurityipResponse;
use AntChain\CAS\Models\CreateMetaWorkspaceRequest;
use AntChain\CAS\Models\CreateMetaWorkspaceResponse;
use AntChain\CAS\Models\CreateResourceComputerRequest;
use AntChain\CAS\Models\CreateResourceComputerResponse;
use AntChain\CAS\Models\CreateResourceSecuritygroupRequest;
use AntChain\CAS\Models\CreateResourceSecuritygroupResponse;
use AntChain\CAS\Models\CreateResourceVpcRequest;
use AntChain\CAS\Models\CreateResourceVpcResponse;
use AntChain\CAS\Models\CreateResourceVswitchRequest;
use AntChain\CAS\Models\CreateResourceVswitchResponse;
use AntChain\CAS\Models\CreateSecuritygroupPermissionRequest;
use AntChain\CAS\Models\CreateSecuritygroupPermissionResponse;
use AntChain\CAS\Models\CreateSecuritygroupRequest;
use AntChain\CAS\Models\CreateSecuritygroupResponse;
use AntChain\CAS\Models\CreateSlsConfigRequest;
use AntChain\CAS\Models\CreateSlsConfigResponse;
use AntChain\CAS\Models\CreateSlsLogstoreRequest;
use AntChain\CAS\Models\CreateSlsLogstoreResponse;
use AntChain\CAS\Models\CreateSlsProjectRequest;
use AntChain\CAS\Models\CreateSlsProjectResponse;
use AntChain\CAS\Models\CreateVpcRequest;
use AntChain\CAS\Models\CreateVpcResponse;
use AntChain\CAS\Models\CreateVpcVroutertableRequest;
use AntChain\CAS\Models\CreateVpcVroutertableResponse;
use AntChain\CAS\Models\CreateVpcVswitchRequest;
use AntChain\CAS\Models\CreateVpcVswitchResponse;
use AntChain\CAS\Models\CreateWorkspaceRequest;
use AntChain\CAS\Models\CreateWorkspaceResponse;
use AntChain\CAS\Models\DeleteAppgroupRequest;
use AntChain\CAS\Models\DeleteAppgroupResponse;
use AntChain\CAS\Models\DeleteApplevelRequest;
use AntChain\CAS\Models\DeleteApplevelResponse;
use AntChain\CAS\Models\DeleteApplicationPackageRequest;
use AntChain\CAS\Models\DeleteApplicationPackageResponse;
use AntChain\CAS\Models\DeleteApplicationRequest;
use AntChain\CAS\Models\DeleteApplicationResponse;
use AntChain\CAS\Models\DeleteAppserviceRequest;
use AntChain\CAS\Models\DeleteAppserviceResponse;
use AntChain\CAS\Models\DeleteCertificateRequest;
use AntChain\CAS\Models\DeleteCertificateResponse;
use AntChain\CAS\Models\DeleteComputerRequest;
use AntChain\CAS\Models\DeleteComputerResponse;
use AntChain\CAS\Models\DeleteDatabaseAccountRequest;
use AntChain\CAS\Models\DeleteDatabaseAccountResponse;
use AntChain\CAS\Models\DeleteDatabaseRequest;
use AntChain\CAS\Models\DeleteDatabaseResponse;
use AntChain\CAS\Models\DeleteDatabaseSchemaRequest;
use AntChain\CAS\Models\DeleteDatabaseSchemaResponse;
use AntChain\CAS\Models\DeleteLoadbalanceListenerRequest;
use AntChain\CAS\Models\DeleteLoadbalanceListenerResponse;
use AntChain\CAS\Models\DeleteLoadbalanceMountRequest;
use AntChain\CAS\Models\DeleteLoadbalanceMountResponse;
use AntChain\CAS\Models\DeleteLoadbalanceRequest;
use AntChain\CAS\Models\DeleteLoadbalanceResponse;
use AntChain\CAS\Models\DeleteMetaWorkspaceRequest;
use AntChain\CAS\Models\DeleteMetaWorkspaceResponse;
use AntChain\CAS\Models\DeleteResourceComputerRequest;
use AntChain\CAS\Models\DeleteResourceComputerResponse;
use AntChain\CAS\Models\DeleteResourceRuleRequest;
use AntChain\CAS\Models\DeleteResourceRuleResponse;
use AntChain\CAS\Models\DeleteResourceSecuritygroupRequest;
use AntChain\CAS\Models\DeleteResourceSecuritygroupResponse;
use AntChain\CAS\Models\DeleteResourceVpcRequest;
use AntChain\CAS\Models\DeleteResourceVpcResponse;
use AntChain\CAS\Models\DeleteResourceVswitchRequest;
use AntChain\CAS\Models\DeleteResourceVswitchResponse;
use AntChain\CAS\Models\DeleteSecuritygroupPermissionRequest;
use AntChain\CAS\Models\DeleteSecuritygroupPermissionResponse;
use AntChain\CAS\Models\DeleteSecuritygroupRequest;
use AntChain\CAS\Models\DeleteSecuritygroupResponse;
use AntChain\CAS\Models\DeleteSlsConfigRequest;
use AntChain\CAS\Models\DeleteSlsConfigResponse;
use AntChain\CAS\Models\DeleteVpcRequest;
use AntChain\CAS\Models\DeleteVpcResponse;
use AntChain\CAS\Models\DeleteVpcVroutertableRequest;
use AntChain\CAS\Models\DeleteVpcVroutertableResponse;
use AntChain\CAS\Models\DeleteVpcVswitchRequest;
use AntChain\CAS\Models\DeleteVpcVswitchResponse;
use AntChain\CAS\Models\DescribeUnifiedresourceVpcRequest;
use AntChain\CAS\Models\DescribeUnifiedresourceVpcResponse;
use AntChain\CAS\Models\ExecRequestTaskRequest;
use AntChain\CAS\Models\ExecRequestTaskResponse;
use AntChain\CAS\Models\ExistAppgroupRequest;
use AntChain\CAS\Models\ExistAppgroupResponse;
use AntChain\CAS\Models\ExistApplevelRequest;
use AntChain\CAS\Models\ExistApplevelResponse;
use AntChain\CAS\Models\ExistApplicationPackageRequest;
use AntChain\CAS\Models\ExistApplicationPackageResponse;
use AntChain\CAS\Models\ExistApplicationRequest;
use AntChain\CAS\Models\ExistApplicationResponse;
use AntChain\CAS\Models\ExistAppserviceRequest;
use AntChain\CAS\Models\ExistAppserviceResponse;
use AntChain\CAS\Models\GetAppgrayconfigsRequest;
use AntChain\CAS\Models\GetAppgrayconfigsResponse;
use AntChain\CAS\Models\GetAppgroupSystemtreeRequest;
use AntChain\CAS\Models\GetAppgroupSystemtreeResponse;
use AntChain\CAS\Models\GetAppgroupTreeRequest;
use AntChain\CAS\Models\GetAppgroupTreeResponse;
use AntChain\CAS\Models\GetApplicationDetailRequest;
use AntChain\CAS\Models\GetApplicationDetailResponse;
use AntChain\CAS\Models\GetApplicationPackagedownloadurlRequest;
use AntChain\CAS\Models\GetApplicationPackagedownloadurlResponse;
use AntChain\CAS\Models\GetApplicationPackageuploadpolicyRequest;
use AntChain\CAS\Models\GetApplicationPackageuploadpolicyResponse;
use AntChain\CAS\Models\GetAppserviceDefaultRequest;
use AntChain\CAS\Models\GetAppserviceDefaultResponse;
use AntChain\CAS\Models\GetAppserviceDetailRequest;
use AntChain\CAS\Models\GetAppserviceDetailResponse;
use AntChain\CAS\Models\GetDatabaseRequest;
use AntChain\CAS\Models\GetDatabaseResponse;
use AntChain\CAS\Models\GetLoadbalanceHealthRequest;
use AntChain\CAS\Models\GetLoadbalanceHealthResponse;
use AntChain\CAS\Models\GetLoadbalanceRequest;
use AntChain\CAS\Models\GetLoadbalanceResponse;
use AntChain\CAS\Models\GetLoadbalanceRuleRequest;
use AntChain\CAS\Models\GetLoadbalanceRuleResponse;
use AntChain\CAS\Models\GetLoadbalanceVcomputergroupRequest;
use AntChain\CAS\Models\GetLoadbalanceVcomputergroupResponse;
use AntChain\CAS\Models\GetRegionAliasbyidRequest;
use AntChain\CAS\Models\GetRegionAliasbyidResponse;
use AntChain\CAS\Models\GetRegionTenantRequest;
use AntChain\CAS\Models\GetRegionTenantResponse;
use AntChain\CAS\Models\GetRequestRequest;
use AntChain\CAS\Models\GetRequestResponse;
use AntChain\CAS\Models\GetSlsLogstoreRequest;
use AntChain\CAS\Models\GetSlsLogstoreResponse;
use AntChain\CAS\Models\GetWorkspaceRequest;
use AntChain\CAS\Models\GetWorkspaceResponse;
use AntChain\CAS\Models\ImportComputerRequest;
use AntChain\CAS\Models\ImportComputerResponse;
use AntChain\CAS\Models\ImportDatabaseRequest;
use AntChain\CAS\Models\ImportDatabaseResponse;
use AntChain\CAS\Models\ImportLoadbalanceRequest;
use AntChain\CAS\Models\ImportLoadbalanceResponse;
use AntChain\CAS\Models\ImportResourceVpcRequest;
use AntChain\CAS\Models\ImportResourceVpcResponse;
use AntChain\CAS\Models\ImportSecuritygroupRequest;
use AntChain\CAS\Models\ImportSecuritygroupResponse;
use AntChain\CAS\Models\ListAppgroupOwnerRequest;
use AntChain\CAS\Models\ListAppgroupOwnerResponse;
use AntChain\CAS\Models\ListAppgroupRequest;
use AntChain\CAS\Models\ListAppgroupResponse;
use AntChain\CAS\Models\ListApplevelRequest;
use AntChain\CAS\Models\ListApplevelResponse;
use AntChain\CAS\Models\ListApplicationManifestRequest;
use AntChain\CAS\Models\ListApplicationManifestResponse;
use AntChain\CAS\Models\ListApplicationPackageRequest;
use AntChain\CAS\Models\ListApplicationPackageResponse;
use AntChain\CAS\Models\ListApplicationRequest;
use AntChain\CAS\Models\ListApplicationResponse;
use AntChain\CAS\Models\ListAppserviceCellRequest;
use AntChain\CAS\Models\ListAppserviceCellResponse;
use AntChain\CAS\Models\ListAppserviceRequest;
use AntChain\CAS\Models\ListAppserviceResponse;
use AntChain\CAS\Models\ListAvailableDiskRequest;
use AntChain\CAS\Models\ListAvailableDiskResponse;
use AntChain\CAS\Models\ListAvailableInstancetypeRequest;
use AntChain\CAS\Models\ListAvailableInstancetypeResponse;
use AntChain\CAS\Models\ListComputerRequest;
use AntChain\CAS\Models\ListComputerResponse;
use AntChain\CAS\Models\ListMetaWorkspaceRequest;
use AntChain\CAS\Models\ListMetaWorkspaceResponse;
use AntChain\CAS\Models\ListRegionAccessibleRequest;
use AntChain\CAS\Models\ListRegionAccessibleResponse;
use AntChain\CAS\Models\ListRegionGroupbyRequest;
use AntChain\CAS\Models\ListRegionGroupbyResponse;
use AntChain\CAS\Models\ListRegionRequest;
use AntChain\CAS\Models\ListRegionResponse;
use AntChain\CAS\Models\ListResourceComputertypefamilyRequest;
use AntChain\CAS\Models\ListResourceComputertypefamilyResponse;
use AntChain\CAS\Models\ListResourceComputertypeRequest;
use AntChain\CAS\Models\ListResourceComputertypeResponse;
use AntChain\CAS\Models\ListResourceDiskRequest;
use AntChain\CAS\Models\ListResourceDiskResponse;
use AntChain\CAS\Models\ListRouteEntryRequest;
use AntChain\CAS\Models\ListRouteEntryResponse;
use AntChain\CAS\Models\ListSlsConfigRequest;
use AntChain\CAS\Models\ListSlsConfigResponse;
use AntChain\CAS\Models\ListSlsLogstoreRequest;
use AntChain\CAS\Models\ListSlsLogstoreResponse;
use AntChain\CAS\Models\ListSlsProjectRequest;
use AntChain\CAS\Models\ListSlsProjectResponse;
use AntChain\CAS\Models\ListTenantworkspaceRequest;
use AntChain\CAS\Models\ListTenantworkspaceResponse;
use AntChain\CAS\Models\ListUnifiedresourceInstancefamiliesRequest;
use AntChain\CAS\Models\ListUnifiedresourceInstancefamiliesResponse;
use AntChain\CAS\Models\ListUnifiedresourceInstancetypeRequest;
use AntChain\CAS\Models\ListUnifiedresourceInstancetypeResponse;
use AntChain\CAS\Models\ListUnifiedresourceVpcRequest;
use AntChain\CAS\Models\ListUnifiedresourceVpcResponse;
use AntChain\CAS\Models\ListUnifiedresourceVswitchRequest;
use AntChain\CAS\Models\ListUnifiedresourceVswitchResponse;
use AntChain\CAS\Models\ListVpcCidrblockRequest;
use AntChain\CAS\Models\ListVpcCidrblockResponse;
use AntChain\CAS\Models\ListVpcImportRequest;
use AntChain\CAS\Models\ListVpcImportResponse;
use AntChain\CAS\Models\QueryAppserviceRequest;
use AntChain\CAS\Models\QueryAppserviceResponse;
use AntChain\CAS\Models\QueryBuildpackRequest;
use AntChain\CAS\Models\QueryBuildpackResponse;
use AntChain\CAS\Models\QueryCertificateRequest;
use AntChain\CAS\Models\QueryCertificateResponse;
use AntChain\CAS\Models\QueryComputerAgentsetupcommandRequest;
use AntChain\CAS\Models\QueryComputerAgentsetupcommandResponse;
use AntChain\CAS\Models\QueryComputerAgentstatusRequest;
use AntChain\CAS\Models\QueryComputerAgentstatusResponse;
use AntChain\CAS\Models\QueryComputerCommonimageRequest;
use AntChain\CAS\Models\QueryComputerCommonimageResponse;
use AntChain\CAS\Models\QueryComputerImportRequest;
use AntChain\CAS\Models\QueryComputerImportResponse;
use AntChain\CAS\Models\QueryComputerquotaRequest;
use AntChain\CAS\Models\QueryComputerquotaResponse;
use AntChain\CAS\Models\QueryComputerRequest;
use AntChain\CAS\Models\QueryComputerResponse;
use AntChain\CAS\Models\QueryComputerSecuritygroupRequest;
use AntChain\CAS\Models\QueryComputerSecuritygroupResponse;
use AntChain\CAS\Models\QueryComputerSpecRequest;
use AntChain\CAS\Models\QueryComputerSpecResponse;
use AntChain\CAS\Models\QueryDatabaseAccountRequest;
use AntChain\CAS\Models\QueryDatabaseAccountResponse;
use AntChain\CAS\Models\QueryDatabaseImportRequest;
use AntChain\CAS\Models\QueryDatabaseImportResponse;
use AntChain\CAS\Models\QueryDatabaseMasterzoneRequest;
use AntChain\CAS\Models\QueryDatabaseMasterzoneResponse;
use AntChain\CAS\Models\QueryDatabaseQuotaRequest;
use AntChain\CAS\Models\QueryDatabaseQuotaResponse;
use AntChain\CAS\Models\QueryDatabaseRequest;
use AntChain\CAS\Models\QueryDatabaseResponse;
use AntChain\CAS\Models\QueryDatabaseSchemaRequest;
use AntChain\CAS\Models\QueryDatabaseSchemaResponse;
use AntChain\CAS\Models\QueryDatabaseSchemeRequest;
use AntChain\CAS\Models\QueryDatabaseSchemeResponse;
use AntChain\CAS\Models\QueryDatabaseSecurityipRequest;
use AntChain\CAS\Models\QueryDatabaseSecurityipResponse;
use AntChain\CAS\Models\QueryDatabaseSpecRequest;
use AntChain\CAS\Models\QueryDatabaseSpecResponse;
use AntChain\CAS\Models\QueryDiskRequest;
use AntChain\CAS\Models\QueryDiskResponse;
use AntChain\CAS\Models\QueryDiskspecRequest;
use AntChain\CAS\Models\QueryDiskspecResponse;
use AntChain\CAS\Models\QueryFeatureRequest;
use AntChain\CAS\Models\QueryFeatureResponse;
use AntChain\CAS\Models\QueryImageRequest;
use AntChain\CAS\Models\QueryImageResponse;
use AntChain\CAS\Models\QueryLoadbalanceImportRequest;
use AntChain\CAS\Models\QueryLoadbalanceImportResponse;
use AntChain\CAS\Models\QueryLoadbalanceListenerRequest;
use AntChain\CAS\Models\QueryLoadbalanceListenerResponse;
use AntChain\CAS\Models\QueryLoadbalanceMountRequest;
use AntChain\CAS\Models\QueryLoadbalanceMountResponse;
use AntChain\CAS\Models\QueryLoadbalanceRequest;
use AntChain\CAS\Models\QueryLoadbalanceResponse;
use AntChain\CAS\Models\QueryLoadbalanceRuleRequest;
use AntChain\CAS\Models\QueryLoadbalanceRuleResponse;
use AntChain\CAS\Models\QueryLoadbalanceSecurityipRequest;
use AntChain\CAS\Models\QueryLoadbalanceSecurityipResponse;
use AntChain\CAS\Models\QueryLoadbalanceVcomputergroupRequest;
use AntChain\CAS\Models\QueryLoadbalanceVcomputergroupResponse;
use AntChain\CAS\Models\QueryLoadbalanceVcomputerRequest;
use AntChain\CAS\Models\QueryLoadbalanceVcomputerResponse;
use AntChain\CAS\Models\QueryMetaWorkspaceRequest;
use AntChain\CAS\Models\QueryMetaWorkspaceResponse;
use AntChain\CAS\Models\QueryRequestFinaltaskRequest;
use AntChain\CAS\Models\QueryRequestFinaltaskResponse;
use AntChain\CAS\Models\QueryRequestRequest;
use AntChain\CAS\Models\QueryRequestResponse;
use AntChain\CAS\Models\QueryRequestTaskRequest;
use AntChain\CAS\Models\QueryRequestTaskResponse;
use AntChain\CAS\Models\QueryResourceComputerRequest;
use AntChain\CAS\Models\QueryResourceComputerResponse;
use AntChain\CAS\Models\QueryResourceComputerspecRequest;
use AntChain\CAS\Models\QueryResourceComputerspecResponse;
use AntChain\CAS\Models\QueryResourcemetaAppserviceRequest;
use AntChain\CAS\Models\QueryResourcemetaAppserviceResponse;
use AntChain\CAS\Models\QueryResourcemetaNodeRequest;
use AntChain\CAS\Models\QueryResourcemetaNodeResponse;
use AntChain\CAS\Models\QueryResourceSecuritygroupRequest;
use AntChain\CAS\Models\QueryResourceSecuritygroupResponse;
use AntChain\CAS\Models\QueryResourceVpcRequest;
use AntChain\CAS\Models\QueryResourceVpcResponse;
use AntChain\CAS\Models\QueryResourceVswitchRequest;
use AntChain\CAS\Models\QueryResourceVswitchResponse;
use AntChain\CAS\Models\QuerySecuritygroupPermissionRequest;
use AntChain\CAS\Models\QuerySecuritygroupPermissionResponse;
use AntChain\CAS\Models\QuerySecuritygroupRequest;
use AntChain\CAS\Models\QuerySecuritygroupResponse;
use AntChain\CAS\Models\QuerySlsLogRequest;
use AntChain\CAS\Models\QuerySlsLogResponse;
use AntChain\CAS\Models\QueryTaskLogRequest;
use AntChain\CAS\Models\QueryTaskLogResponse;
use AntChain\CAS\Models\QueryTenantworkspaceFilterRequest;
use AntChain\CAS\Models\QueryTenantworkspaceFilterResponse;
use AntChain\CAS\Models\QueryUserRequest;
use AntChain\CAS\Models\QueryUserResponse;
use AntChain\CAS\Models\QueryVpcRequest;
use AntChain\CAS\Models\QueryVpcResponse;
use AntChain\CAS\Models\QueryVpcVroutertableRequest;
use AntChain\CAS\Models\QueryVpcVroutertableResponse;
use AntChain\CAS\Models\QueryVpcVswitchRequest;
use AntChain\CAS\Models\QueryVpcVswitchResponse;
use AntChain\CAS\Models\RebootComputerRequest;
use AntChain\CAS\Models\RebootComputerResponse;
use AntChain\CAS\Models\RebootDatabaseRequest;
use AntChain\CAS\Models\RebootDatabaseResponse;
use AntChain\CAS\Models\ReinitComputerPasswordRequest;
use AntChain\CAS\Models\ReinitComputerPasswordResponse;
use AntChain\CAS\Models\ReinitDiskRequest;
use AntChain\CAS\Models\ReinitDiskResponse;
use AntChain\CAS\Models\ReinitResourceComputerpasswordRequest;
use AntChain\CAS\Models\ReinitResourceComputerpasswordResponse;
use AntChain\CAS\Models\ReleaseComputerRequest;
use AntChain\CAS\Models\ReleaseComputerResponse;
use AntChain\CAS\Models\ReleaseDatabaseRequest;
use AntChain\CAS\Models\ReleaseDatabaseResponse;
use AntChain\CAS\Models\ReleaseLoadbalanceRequest;
use AntChain\CAS\Models\ReleaseLoadbalanceResponse;
use AntChain\CAS\Models\RemoveComputerRequest;
use AntChain\CAS\Models\RemoveComputerResponse;
use AntChain\CAS\Models\RemoveDatabaseRequest;
use AntChain\CAS\Models\RemoveDatabaseResponse;
use AntChain\CAS\Models\RemoveLoadbalanceRequest;
use AntChain\CAS\Models\RemoveLoadbalanceResponse;
use AntChain\CAS\Models\RemoveLoadbalanceSecurityipRequest;
use AntChain\CAS\Models\RemoveLoadbalanceSecurityipResponse;
use AntChain\CAS\Models\RemoveSecuritygroupInstanceRequest;
use AntChain\CAS\Models\RemoveSecuritygroupInstanceResponse;
use AntChain\CAS\Models\RemoveSecuritygroupRequest;
use AntChain\CAS\Models\RemoveSecuritygroupResponse;
use AntChain\CAS\Models\SetComputerAssignRequest;
use AntChain\CAS\Models\SetComputerAssignResponse;
use AntChain\CAS\Models\SetDatabaseAccountpasswordRequest;
use AntChain\CAS\Models\SetDatabaseAccountpasswordResponse;
use AntChain\CAS\Models\SetDatabaseAssignRequest;
use AntChain\CAS\Models\SetDatabaseAssignResponse;
use AntChain\CAS\Models\SetDatabaseShareRequest;
use AntChain\CAS\Models\SetDatabaseShareResponse;
use AntChain\CAS\Models\StartComputerRequest;
use AntChain\CAS\Models\StartComputerResponse;
use AntChain\CAS\Models\StartLoadbalanceListenerRequest;
use AntChain\CAS\Models\StartLoadbalanceListenerResponse;
use AntChain\CAS\Models\StartLoadbalanceRequest;
use AntChain\CAS\Models\StartLoadbalanceResponse;
use AntChain\CAS\Models\StartResourceComputerRequest;
use AntChain\CAS\Models\StartResourceComputerResponse;
use AntChain\CAS\Models\StopComputerRequest;
use AntChain\CAS\Models\StopComputerResponse;
use AntChain\CAS\Models\StopLoadbalanceListenerRequest;
use AntChain\CAS\Models\StopLoadbalanceListenerResponse;
use AntChain\CAS\Models\StopLoadbalanceRequest;
use AntChain\CAS\Models\StopLoadbalanceResponse;
use AntChain\CAS\Models\StopResourceComputerRequest;
use AntChain\CAS\Models\StopResourceComputerResponse;
use AntChain\CAS\Models\SyncComputerRequest;
use AntChain\CAS\Models\SyncComputerResponse;
use AntChain\CAS\Models\SyncLoadbalanceRequest;
use AntChain\CAS\Models\SyncLoadbalanceResponse;
use AntChain\CAS\Models\UpdateAppgroupRequest;
use AntChain\CAS\Models\UpdateAppgroupResponse;
use AntChain\CAS\Models\UpdateApplevelRequest;
use AntChain\CAS\Models\UpdateApplevelResponse;
use AntChain\CAS\Models\UpdateApplicationRequest;
use AntChain\CAS\Models\UpdateApplicationResponse;
use AntChain\CAS\Models\UpdateAppserviceRequest;
use AntChain\CAS\Models\UpdateAppserviceResponse;
use AntChain\CAS\Models\UpdateComputerInfoRequest;
use AntChain\CAS\Models\UpdateComputerInfoResponse;
use AntChain\CAS\Models\UpdateDatabaseAccountRequest;
use AntChain\CAS\Models\UpdateDatabaseAccountResponse;
use AntChain\CAS\Models\UpdateDatabaseInfoRequest;
use AntChain\CAS\Models\UpdateDatabaseInfoResponse;
use AntChain\CAS\Models\UpdateDatabaseRequest;
use AntChain\CAS\Models\UpdateDatabaseResponse;
use AntChain\CAS\Models\UpdateDatabaseSpecRequest;
use AntChain\CAS\Models\UpdateDatabaseSpecResponse;
use AntChain\CAS\Models\UpdateDiskStrategyRequest;
use AntChain\CAS\Models\UpdateDiskStrategyResponse;
use AntChain\CAS\Models\UpdateLoadbalanaceSecurityipRequest;
use AntChain\CAS\Models\UpdateLoadbalanaceSecurityipResponse;
use AntChain\CAS\Models\UpdateLoadbalanceAccesscontrolRequest;
use AntChain\CAS\Models\UpdateLoadbalanceAccesscontrolResponse;
use AntChain\CAS\Models\UpdateLoadbalanceListenerRequest;
use AntChain\CAS\Models\UpdateLoadbalanceListenerResponse;
use AntChain\CAS\Models\UpdateLoadbalanceMountRequest;
use AntChain\CAS\Models\UpdateLoadbalanceMountResponse;
use AntChain\CAS\Models\UpdateLoadbalanceRequest;
use AntChain\CAS\Models\UpdateLoadbalanceResponse;
use AntChain\CAS\Models\UpdateLoadbalanceSpecRequest;
use AntChain\CAS\Models\UpdateLoadbalanceSpecResponse;
use AntChain\CAS\Models\UpdateSlsConfigRequest;
use AntChain\CAS\Models\UpdateSlsConfigResponse;
use AntChain\CAS\Models\UpdateVpcVswitchRequest;
use AntChain\CAS\Models\UpdateVpcVswitchResponse;
use AntChain\CAS\Models\UploadApplicationPackageconfigRequest;
use AntChain\CAS\Models\UploadApplicationPackageconfigResponse;
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
            // 资源所属的App
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
                    'sdk_version'      => '1.3.17',
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
     * Description: 批量删除构建记录
     * Summary: 批量删除构建记录.
     *
     * @param BatchdeleteApplicationBuildRequest $request
     *
     * @return BatchdeleteApplicationBuildResponse
     */
    public function batchdeleteApplicationBuild($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteApplicationBuildEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除构建记录
     * Summary: 批量删除构建记录.
     *
     * @param BatchdeleteApplicationBuildRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return BatchdeleteApplicationBuildResponse
     */
    public function batchdeleteApplicationBuildEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteApplicationBuildResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.build.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询应用明细
     * Summary: 批量查询应用明细.
     *
     * @param ListApplicationManifestRequest $request
     *
     * @return ListApplicationManifestResponse
     */
    public function listApplicationManifest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApplicationManifestEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询应用明细
     * Summary: 批量查询应用明细.
     *
     * @param ListApplicationManifestRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListApplicationManifestResponse
     */
    public function listApplicationManifestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApplicationManifestResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.manifest.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量删除应用发布包
     * Summary: 批量删除应用发布包.
     *
     * @param BatchdeleteApplicationPackageRequest $request
     *
     * @return BatchdeleteApplicationPackageResponse
     */
    public function batchdeleteApplicationPackage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchdeleteApplicationPackageEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量删除应用发布包
     * Summary: 批量删除应用发布包.
     *
     * @param BatchdeleteApplicationPackageRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return BatchdeleteApplicationPackageResponse
     */
    public function batchdeleteApplicationPackageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchdeleteApplicationPackageResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.package.batchdelete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建应用发布包
     * Summary: 创建应用发布包.
     *
     * @param CreateApplicationPackageRequest $request
     *
     * @return CreateApplicationPackageResponse
     */
    public function createApplicationPackage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApplicationPackageEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建应用发布包
     * Summary: 创建应用发布包.
     *
     * @param CreateApplicationPackageRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateApplicationPackageResponse
     */
    public function createApplicationPackageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApplicationPackageResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.package.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除应用发布包
     * Summary: 删除应用发布包.
     *
     * @param DeleteApplicationPackageRequest $request
     *
     * @return DeleteApplicationPackageResponse
     */
    public function deleteApplicationPackage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteApplicationPackageEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除应用发布包
     * Summary: 删除应用发布包.
     *
     * @param DeleteApplicationPackageRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DeleteApplicationPackageResponse
     */
    public function deleteApplicationPackageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteApplicationPackageResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.package.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量获取应用发布包
     * Summary: 批量获取应用发布包.
     *
     * @param ListApplicationPackageRequest $request
     *
     * @return ListApplicationPackageResponse
     */
    public function listApplicationPackage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApplicationPackageEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量获取应用发布包
     * Summary: 批量获取应用发布包.
     *
     * @param ListApplicationPackageRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListApplicationPackageResponse
     */
    public function listApplicationPackageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApplicationPackageResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.package.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取上传应用发布包下载配置
     * Summary: 获取上传应用发布包下载配置.
     *
     * @param UploadApplicationPackageconfigRequest $request
     *
     * @return UploadApplicationPackageconfigResponse
     */
    public function uploadApplicationPackageconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadApplicationPackageconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取上传应用发布包下载配置
     * Summary: 获取上传应用发布包下载配置.
     *
     * @param UploadApplicationPackageconfigRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return UploadApplicationPackageconfigResponse
     */
    public function uploadApplicationPackageconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadApplicationPackageconfigResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.packageconfig.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量获取应用实例的 cell
     * Summary: 批量获取应用实例的 cell.
     *
     * @param ListAppserviceCellRequest $request
     *
     * @return ListAppserviceCellResponse
     */
    public function listAppserviceCell($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppserviceCellEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量获取应用实例的 cell
     * Summary: 批量获取应用实例的 cell.
     *
     * @param ListAppserviceCellRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListAppserviceCellResponse
     */
    public function listAppserviceCellEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppserviceCellResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appservice.cell.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建应用实例
     * Summary: 创建应用实例.
     *
     * @param CreateAppserviceRequest $request
     *
     * @return CreateAppserviceResponse
     */
    public function createAppservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAppserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建应用实例
     * Summary: 创建应用实例.
     *
     * @param CreateAppserviceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateAppserviceResponse
     */
    public function createAppserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAppserviceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appservice.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
     * Summary: 旧版应用管理-获取默认的应用服务
     *
     * @param GetAppserviceDefaultRequest $request
     *
     * @return GetAppserviceDefaultResponse
     */
    public function getAppserviceDefault($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAppserviceDefaultEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
     * Summary: 旧版应用管理-获取默认的应用服务
     *
     * @param GetAppserviceDefaultRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetAppserviceDefaultResponse
     */
    public function getAppserviceDefaultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAppserviceDefaultResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appservice.default.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 判断应用实例是否存在
     * Summary: 判断应用实例是否存在.
     *
     * @param ExistAppserviceRequest $request
     *
     * @return ExistAppserviceResponse
     */
    public function existAppservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->existAppserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 判断应用实例是否存在
     * Summary: 判断应用实例是否存在.
     *
     * @param ExistAppserviceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExistAppserviceResponse
     */
    public function existAppserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExistAppserviceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appservice.exist', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新应用实例
     * Summary: 更新应用实例.
     *
     * @param UpdateAppserviceRequest $request
     *
     * @return UpdateAppserviceResponse
     */
    public function updateAppservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAppserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新应用实例
     * Summary: 更新应用实例.
     *
     * @param UpdateAppserviceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateAppserviceResponse
     */
    public function updateAppserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAppserviceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appservice.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 技术栈1.0查询（opsware）
     * Summary: 技术栈查询.
     *
     * @param QueryBuildpackRequest $request
     *
     * @return QueryBuildpackResponse
     */
    public function queryBuildpack($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBuildpackEx($request, $headers, $runtime);
    }

    /**
     * Description: 技术栈1.0查询（opsware）
     * Summary: 技术栈查询.
     *
     * @param QueryBuildpackRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryBuildpackResponse
     */
    public function queryBuildpackEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBuildpackResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.buildpack.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-获取指定应用详情
     * Summary: 旧版应用管理-获取应用详情.
     *
     * @param GetApplicationDetailRequest $request
     *
     * @return GetApplicationDetailResponse
     */
    public function getApplicationDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApplicationDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-获取指定应用详情
     * Summary: 旧版应用管理-获取应用详情.
     *
     * @param GetApplicationDetailRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetApplicationDetailResponse
     */
    public function getApplicationDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApplicationDetailResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.detail.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户信息
     * Summary: 查询用户信息.
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
     * Description: 查询用户信息
     * Summary: 查询用户信息.
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

        return QueryUserResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取应用分组列表
     * Summary: 获取应用分组列表.
     *
     * @param ListAppgroupRequest $request
     *
     * @return ListAppgroupResponse
     */
    public function listAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取应用分组列表
     * Summary: 获取应用分组列表.
     *
     * @param ListAppgroupRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListAppgroupResponse
     */
    public function listAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appgroup.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 检查应用分组是否存在
     * Summary: 检查应用分组是否存在.
     *
     * @param ExistAppgroupRequest $request
     *
     * @return ExistAppgroupResponse
     */
    public function existAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->existAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 检查应用分组是否存在
     * Summary: 检查应用分组是否存在.
     *
     * @param ExistAppgroupRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ExistAppgroupResponse
     */
    public function existAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExistAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appgroup.exist', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建应用分组
     * Summary: 创建应用分组.
     *
     * @param CreateAppgroupRequest $request
     *
     * @return CreateAppgroupResponse
     */
    public function createAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建应用分组
     * Summary: 创建应用分组.
     *
     * @param CreateAppgroupRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateAppgroupResponse
     */
    public function createAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appgroup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取应用owner列表
     * Summary: 获取应用owner列表.
     *
     * @param ListAppgroupOwnerRequest $request
     *
     * @return ListAppgroupOwnerResponse
     */
    public function listAppgroupOwner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppgroupOwnerEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取应用owner列表
     * Summary: 获取应用owner列表.
     *
     * @param ListAppgroupOwnerRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListAppgroupOwnerResponse
     */
    public function listAppgroupOwnerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppgroupOwnerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appgroup.owner.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用分组结构查询
     * Summary: 应用分组结构查询.
     *
     * @param GetAppgroupTreeRequest $request
     *
     * @return GetAppgroupTreeResponse
     */
    public function getAppgroupTree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAppgroupTreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用分组结构查询
     * Summary: 应用分组结构查询.
     *
     * @param GetAppgroupTreeRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetAppgroupTreeResponse
     */
    public function getAppgroupTreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAppgroupTreeResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appgroup.tree.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用分组结构查询
     * Summary: 应用分组结构查询.
     *
     * @param GetAppgroupSystemtreeRequest $request
     *
     * @return GetAppgroupSystemtreeResponse
     */
    public function getAppgroupSystemtree($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAppgroupSystemtreeEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用分组结构查询
     * Summary: 应用分组结构查询.
     *
     * @param GetAppgroupSystemtreeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetAppgroupSystemtreeResponse
     */
    public function getAppgroupSystemtreeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAppgroupSystemtreeResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appgroup.systemtree.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除分组
     * Summary: 删除分组.
     *
     * @param DeleteAppgroupRequest $request
     *
     * @return DeleteAppgroupResponse
     */
    public function deleteAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除分组
     * Summary: 删除分组.
     *
     * @param DeleteAppgroupRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteAppgroupResponse
     */
    public function deleteAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appgroup.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新分组
     * Summary: 更新分组.
     *
     * @param UpdateAppgroupRequest $request
     *
     * @return UpdateAppgroupResponse
     */
    public function updateAppgroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAppgroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新分组
     * Summary: 更新分组.
     *
     * @param UpdateAppgroupRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateAppgroupResponse
     */
    public function updateAppgroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAppgroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appgroup.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出所有应用等级
     * Summary: 列出所有应用等级.
     *
     * @param ListApplevelRequest $request
     *
     * @return ListApplevelResponse
     */
    public function listApplevel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApplevelEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出所有应用等级
     * Summary: 列出所有应用等级.
     *
     * @param ListApplevelRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListApplevelResponse
     */
    public function listApplevelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApplevelResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.applevel.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用等级是否存在
     * Summary: 应用等级是否存在.
     *
     * @param ExistApplevelRequest $request
     *
     * @return ExistApplevelResponse
     */
    public function existApplevel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->existApplevelEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用等级是否存在
     * Summary: 应用等级是否存在.
     *
     * @param ExistApplevelRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ExistApplevelResponse
     */
    public function existApplevelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExistApplevelResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.applevel.exist', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建应用等级
     * Summary: 创建应用等级.
     *
     * @param CreateApplevelRequest $request
     *
     * @return CreateApplevelResponse
     */
    public function createApplevel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApplevelEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建应用等级
     * Summary: 创建应用等级.
     *
     * @param CreateApplevelRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateApplevelResponse
     */
    public function createApplevelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApplevelResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.applevel.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除应用分组
     * Summary: 删除应用分组.
     *
     * @param DeleteApplevelRequest $request
     *
     * @return DeleteApplevelResponse
     */
    public function deleteApplevel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteApplevelEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除应用分组
     * Summary: 删除应用分组.
     *
     * @param DeleteApplevelRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteApplevelResponse
     */
    public function deleteApplevelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteApplevelResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.applevel.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新应用等级
     * Summary: 更新应用等级.
     *
     * @param UpdateApplevelRequest $request
     *
     * @return UpdateApplevelResponse
     */
    public function updateApplevel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApplevelEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新应用等级
     * Summary: 更新应用等级.
     *
     * @param UpdateApplevelRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateApplevelResponse
     */
    public function updateApplevelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApplevelResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.applevel.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-获取应用列表
     * Summary: 旧版应用管理-获取应用列表.
     *
     * @param ListApplicationRequest $request
     *
     * @return ListApplicationResponse
     */
    public function listApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-获取应用列表
     * Summary: 旧版应用管理-获取应用列表.
     *
     * @param ListApplicationRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListApplicationResponse
     */
    public function listApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApplicationResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-更新应用
     * Summary: 旧版应用管理-更新应用.
     *
     * @param UpdateApplicationRequest $request
     *
     * @return UpdateApplicationResponse
     */
    public function updateApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-更新应用
     * Summary: 旧版应用管理-更新应用.
     *
     * @param UpdateApplicationRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateApplicationResponse
     */
    public function updateApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApplicationResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-批量查询应用服务
     * Summary: 旧版应用管理-批量查询应用服务
     *
     * @param ListAppserviceRequest $request
     *
     * @return ListAppserviceResponse
     */
    public function listAppservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-批量查询应用服务
     * Summary: 旧版应用管理-批量查询应用服务
     *
     * @param ListAppserviceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListAppserviceResponse
     */
    public function listAppserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppserviceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appservice.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-删除应用服务
     * Summary: 旧版应用管理-删除应用服务
     *
     * @param DeleteAppserviceRequest $request
     *
     * @return DeleteAppserviceResponse
     */
    public function deleteAppservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAppserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-删除应用服务
     * Summary: 旧版应用管理-删除应用服务
     *
     * @param DeleteAppserviceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteAppserviceResponse
     */
    public function deleteAppserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAppserviceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appservice.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-获取应用服务详情
     * Summary: 旧版应用管理-获取应用服务详情.
     *
     * @param GetAppserviceDetailRequest $request
     *
     * @return GetAppserviceDetailResponse
     */
    public function getAppserviceDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAppserviceDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-获取应用服务详情
     * Summary: 旧版应用管理-获取应用服务详情.
     *
     * @param GetAppserviceDetailRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetAppserviceDetailResponse
     */
    public function getAppserviceDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAppserviceDetailResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appservice.detail.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-检查应用发布包是否存在
     * Summary: 旧版应用管理-检查应用发布包是否存在.
     *
     * @param ExistApplicationPackageRequest $request
     *
     * @return ExistApplicationPackageResponse
     */
    public function existApplicationPackage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->existApplicationPackageEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-检查应用发布包是否存在
     * Summary: 旧版应用管理-检查应用发布包是否存在.
     *
     * @param ExistApplicationPackageRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ExistApplicationPackageResponse
     */
    public function existApplicationPackageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExistApplicationPackageResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.package.exist', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-获取应用包上传策略
     * Summary: 旧版应用管理-获取应用包上传策略.
     *
     * @param GetApplicationPackageuploadpolicyRequest $request
     *
     * @return GetApplicationPackageuploadpolicyResponse
     */
    public function getApplicationPackageuploadpolicy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApplicationPackageuploadpolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-获取应用包上传策略
     * Summary: 旧版应用管理-获取应用包上传策略.
     *
     * @param GetApplicationPackageuploadpolicyRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return GetApplicationPackageuploadpolicyResponse
     */
    public function getApplicationPackageuploadpolicyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApplicationPackageuploadpolicyResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.packageuploadpolicy.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-获取发布包下载链接
     * Summary: 旧版应用管理-获取发布包下载链接.
     *
     * @param GetApplicationPackagedownloadurlRequest $request
     *
     * @return GetApplicationPackagedownloadurlResponse
     */
    public function getApplicationPackagedownloadurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApplicationPackagedownloadurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-获取发布包下载链接
     * Summary: 旧版应用管理-获取发布包下载链接.
     *
     * @param GetApplicationPackagedownloadurlRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return GetApplicationPackagedownloadurlResponse
     */
    public function getApplicationPackagedownloadurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApplicationPackagedownloadurlResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.packagedownloadurl.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-判断应用是否存在
     * Summary: 旧版应用管理-判断应用是否存在.
     *
     * @param ExistApplicationRequest $request
     *
     * @return ExistApplicationResponse
     */
    public function existApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->existApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-判断应用是否存在
     * Summary: 旧版应用管理-判断应用是否存在.
     *
     * @param ExistApplicationRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ExistApplicationResponse
     */
    public function existApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExistApplicationResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.exist', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
     * Summary: 根据应用服务ids查询应用服务
     *
     * @param QueryAppserviceRequest $request
     *
     * @return QueryAppserviceResponse
     */
    public function queryAppservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAppserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
     * Summary: 根据应用服务ids查询应用服务
     *
     * @param QueryAppserviceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryAppserviceResponse
     */
    public function queryAppserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAppserviceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 历史遗留接口-获取开关配置清单
     * Summary: 历史遗留接口-获取开关配置清单.
     *
     * @param GetAppgrayconfigsRequest $request
     *
     * @return GetAppgrayconfigsResponse
     */
    public function getAppgrayconfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAppgrayconfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: 历史遗留接口-获取开关配置清单
     * Summary: 历史遗留接口-获取开关配置清单.
     *
     * @param GetAppgrayconfigsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetAppgrayconfigsResponse
     */
    public function getAppgrayconfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAppgrayconfigsResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.appgrayconfigs.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建 computer 实例
     * Summary: 创建 computer 实例.
     *
     * @param CreateComputerRequest $request
     *
     * @return CreateComputerResponse
     */
    public function createComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建 computer 实例
     * Summary: 创建 computer 实例.
     *
     * @param CreateComputerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateComputerResponse
     */
    public function createComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: computer 删除
     * Summary: computer 删除.
     *
     * @param DeleteComputerRequest $request
     *
     * @return DeleteComputerResponse
     */
    public function deleteComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: computer 删除
     * Summary: computer 删除.
     *
     * @param DeleteComputerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteComputerResponse
     */
    public function deleteComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: computer 导入
     * Summary: computer 导入.
     *
     * @param ImportComputerRequest $request
     *
     * @return ImportComputerResponse
     */
    public function importComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: computer 导入
     * Summary: computer 导入.
     *
     * @param ImportComputerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ImportComputerResponse
     */
    public function importComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: database 创建
     * Summary: database 创建.
     *
     * @param CreateDatabaseRequest $request
     *
     * @return CreateDatabaseResponse
     */
    public function createDatabase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: database 创建
     * Summary: database 创建.
     *
     * @param CreateDatabaseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateDatabaseResponse
     */
    public function createDatabaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDatabaseResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: database 导入
     * Summary: database 导入.
     *
     * @param ImportDatabaseRequest $request
     *
     * @return ImportDatabaseResponse
     */
    public function importDatabase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: database 导入
     * Summary: database 导入.
     *
     * @param ImportDatabaseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ImportDatabaseResponse
     */
    public function importDatabaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportDatabaseResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: database 删除
     * Summary: database 删除.
     *
     * @param DeleteDatabaseRequest $request
     *
     * @return DeleteDatabaseResponse
     */
    public function deleteDatabase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: database 删除
     * Summary: database 删除.
     *
     * @param DeleteDatabaseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteDatabaseResponse
     */
    public function deleteDatabaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDatabaseResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: loadbalance 创建
     * Summary: loadbalance 创建.
     *
     * @param CreateLoadbalanceRequest $request
     *
     * @return CreateLoadbalanceResponse
     */
    public function createLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: loadbalance 创建
     * Summary: loadbalance 创建.
     *
     * @param CreateLoadbalanceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateLoadbalanceResponse
     */
    public function createLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: loadbalance 删除
     * Summary: loadbalance 删除.
     *
     * @param DeleteLoadbalanceRequest $request
     *
     * @return DeleteLoadbalanceResponse
     */
    public function deleteLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: loadbalance 删除
     * Summary: loadbalance 删除.
     *
     * @param DeleteLoadbalanceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteLoadbalanceResponse
     */
    public function deleteLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: loadbalance 导入
     * Summary: loadbalance 导入.
     *
     * @param ImportLoadbalanceRequest $request
     *
     * @return ImportLoadbalanceResponse
     */
    public function importLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: loadbalance 导入
     * Summary: loadbalance 导入.
     *
     * @param ImportLoadbalanceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ImportLoadbalanceResponse
     */
    public function importLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: vpc 创建
     * Summary: vpc 创建.
     *
     * @param CreateVpcRequest $request
     *
     * @return CreateVpcResponse
     */
    public function createVpc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: vpc 创建
     * Summary: vpc 创建.
     *
     * @param CreateVpcRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return CreateVpcResponse
     */
    public function createVpcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateVpcResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: vpc 删除
     * Summary: vpc 删除.
     *
     * @param DeleteVpcRequest $request
     *
     * @return DeleteVpcResponse
     */
    public function deleteVpc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: vpc 删除
     * Summary: vpc 删除.
     *
     * @param DeleteVpcRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return DeleteVpcResponse
     */
    public function deleteVpcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteVpcResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: computer 从应用中释放
     * Summary: computer 从应用中释放.
     *
     * @param ReleaseComputerRequest $request
     *
     * @return ReleaseComputerResponse
     */
    public function releaseComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->releaseComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: computer 从应用中释放
     * Summary: computer 从应用中释放.
     *
     * @param ReleaseComputerRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ReleaseComputerResponse
     */
    public function releaseComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReleaseComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.release', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重置 computer 密码
     * Summary: 重置 computer 密码
     *
     * @param ReinitComputerPasswordRequest $request
     *
     * @return ReinitComputerPasswordResponse
     */
    public function reinitComputerPassword($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reinitComputerPasswordEx($request, $headers, $runtime);
    }

    /**
     * Description: 重置 computer 密码
     * Summary: 重置 computer 密码
     *
     * @param ReinitComputerPasswordRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ReinitComputerPasswordResponse
     */
    public function reinitComputerPasswordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReinitComputerPasswordResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.password.reinit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: database 从应用中释放
     * Summary: database 从应用中释放.
     *
     * @param ReleaseDatabaseRequest $request
     *
     * @return ReleaseDatabaseResponse
     */
    public function releaseDatabase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->releaseDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: database 从应用中释放
     * Summary: database 从应用中释放.
     *
     * @param ReleaseDatabaseRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ReleaseDatabaseResponse
     */
    public function releaseDatabaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReleaseDatabaseResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.release', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 移除 computer
     * Summary: 移除 computer.
     *
     * @param RemoveComputerRequest $request
     *
     * @return RemoveComputerResponse
     */
    public function removeComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 移除 computer
     * Summary: 移除 computer.
     *
     * @param RemoveComputerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RemoveComputerResponse
     */
    public function removeComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: loadbalance 移除
     * Summary: loadbalance 移除.
     *
     * @param RemoveLoadbalanceRequest $request
     *
     * @return RemoveLoadbalanceResponse
     */
    public function removeLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: loadbalance 移除
     * Summary: loadbalance 移除.
     *
     * @param RemoveLoadbalanceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return RemoveLoadbalanceResponse
     */
    public function removeLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: database 移除
     * Summary: database 移除.
     *
     * @param RemoveDatabaseRequest $request
     *
     * @return RemoveDatabaseResponse
     */
    public function removeDatabase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: database 移除
     * Summary: database 移除.
     *
     * @param RemoveDatabaseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RemoveDatabaseResponse
     */
    public function removeDatabaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveDatabaseResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: loadbalance 从应用中释放
     * Summary: loadbalance 从应用中释放.
     *
     * @param ReleaseLoadbalanceRequest $request
     *
     * @return ReleaseLoadbalanceResponse
     */
    public function releaseLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->releaseLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: loadbalance 从应用中释放
     * Summary: loadbalance 从应用中释放.
     *
     * @param ReleaseLoadbalanceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ReleaseLoadbalanceResponse
     */
    public function releaseLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReleaseLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.release', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: database account 创建
     * Summary: database account 创建.
     *
     * @param CreateDatabaseAccountRequest $request
     *
     * @return CreateDatabaseAccountResponse
     */
    public function createDatabaseAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDatabaseAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: database account 创建
     * Summary: database account 创建.
     *
     * @param CreateDatabaseAccountRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateDatabaseAccountResponse
     */
    public function createDatabaseAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDatabaseAccountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.account.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 安全域/组 创建
     * Summary: 安全域/组 创建.
     *
     * @param CreateSecuritygroupRequest $request
     *
     * @return CreateSecuritygroupResponse
     */
    public function createSecuritygroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSecuritygroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 安全域/组 创建
     * Summary: 安全域/组 创建.
     *
     * @param CreateSecuritygroupRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateSecuritygroupResponse
     */
    public function createSecuritygroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSecuritygroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: securitygroup 导入
     * Summary: securitygroup 导入.
     *
     * @param ImportSecuritygroupRequest $request
     *
     * @return ImportSecuritygroupResponse
     */
    public function importSecuritygroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importSecuritygroupEx($request, $headers, $runtime);
    }

    /**
     * Description: securitygroup 导入
     * Summary: securitygroup 导入.
     *
     * @param ImportSecuritygroupRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ImportSecuritygroupResponse
     */
    public function importSecuritygroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportSecuritygroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: securitygroup 移除
     * Summary: securitygroup 移除.
     *
     * @param RemoveSecuritygroupRequest $request
     *
     * @return RemoveSecuritygroupResponse
     */
    public function removeSecuritygroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeSecuritygroupEx($request, $headers, $runtime);
    }

    /**
     * Description: securitygroup 移除
     * Summary: securitygroup 移除.
     *
     * @param RemoveSecuritygroupRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return RemoveSecuritygroupResponse
     */
    public function removeSecuritygroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveSecuritygroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: securitygroup 删除
     * Summary: securitygroup 删除.
     *
     * @param DeleteSecuritygroupRequest $request
     *
     * @return DeleteSecuritygroupResponse
     */
    public function deleteSecuritygroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSecuritygroupEx($request, $headers, $runtime);
    }

    /**
     * Description: securitygroup 删除
     * Summary: securitygroup 删除.
     *
     * @param DeleteSecuritygroupRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteSecuritygroupResponse
     */
    public function deleteSecuritygroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSecuritygroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: schema 删除
     * Summary: schema 删除.
     *
     * @param DeleteDatabaseSchemaRequest $request
     *
     * @return DeleteDatabaseSchemaResponse
     */
    public function deleteDatabaseSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDatabaseSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: schema 删除
     * Summary: schema 删除.
     *
     * @param DeleteDatabaseSchemaRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteDatabaseSchemaResponse
     */
    public function deleteDatabaseSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDatabaseSchemaResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.schema.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: account 删除
     * Summary: account 删除.
     *
     * @param DeleteDatabaseAccountRequest $request
     *
     * @return DeleteDatabaseAccountResponse
     */
    public function deleteDatabaseAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDatabaseAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: account 删除
     * Summary: account 删除.
     *
     * @param DeleteDatabaseAccountRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteDatabaseAccountResponse
     */
    public function deleteDatabaseAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDatabaseAccountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.account.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: vswitch 删除
     * Summary: vswitch 删除.
     *
     * @param DeleteVpcVswitchRequest $request
     *
     * @return DeleteVpcVswitchResponse
     */
    public function deleteVpcVswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteVpcVswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: vswitch 删除
     * Summary: vswitch 删除.
     *
     * @param DeleteVpcVswitchRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteVpcVswitchResponse
     */
    public function deleteVpcVswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteVpcVswitchResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.vswitch.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: listener 删除
     * Summary: listener 删除.
     *
     * @param DeleteLoadbalanceListenerRequest $request
     *
     * @return DeleteLoadbalanceListenerResponse
     */
    public function deleteLoadbalanceListener($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteLoadbalanceListenerEx($request, $headers, $runtime);
    }

    /**
     * Description: listener 删除
     * Summary: listener 删除.
     *
     * @param DeleteLoadbalanceListenerRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DeleteLoadbalanceListenerResponse
     */
    public function deleteLoadbalanceListenerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteLoadbalanceListenerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.listener.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 路由表删除
     * Summary: 路由表删除.
     *
     * @param DeleteVpcVroutertableRequest $request
     *
     * @return DeleteVpcVroutertableResponse
     */
    public function deleteVpcVroutertable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteVpcVroutertableEx($request, $headers, $runtime);
    }

    /**
     * Description: 路由表删除
     * Summary: 路由表删除.
     *
     * @param DeleteVpcVroutertableRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteVpcVroutertableResponse
     */
    public function deleteVpcVroutertableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteVpcVroutertableResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.vroutertable.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 安全组中实例移除
     * Summary: 安全组中实例移除.
     *
     * @param RemoveSecuritygroupInstanceRequest $request
     *
     * @return RemoveSecuritygroupInstanceResponse
     */
    public function removeSecuritygroupInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeSecuritygroupInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 安全组中实例移除
     * Summary: 安全组中实例移除.
     *
     * @param RemoveSecuritygroupInstanceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return RemoveSecuritygroupInstanceResponse
     */
    public function removeSecuritygroupInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveSecuritygroupInstanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.instance.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 安全组 permission 删除
     * Summary: 安全组 permission 删除.
     *
     * @param DeleteSecuritygroupPermissionRequest $request
     *
     * @return DeleteSecuritygroupPermissionResponse
     */
    public function deleteSecuritygroupPermission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSecuritygroupPermissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 安全组 permission 删除
     * Summary: 安全组 permission 删除.
     *
     * @param DeleteSecuritygroupPermissionRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return DeleteSecuritygroupPermissionResponse
     */
    public function deleteSecuritygroupPermissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSecuritygroupPermissionResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.permission.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: lb 监听器访问 ip 删除
     * Summary: lb 监听器访问 ip 删除.
     *
     * @param RemoveLoadbalanceSecurityipRequest $request
     *
     * @return RemoveLoadbalanceSecurityipResponse
     */
    public function removeLoadbalanceSecurityip($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeLoadbalanceSecurityipEx($request, $headers, $runtime);
    }

    /**
     * Description: lb 监听器访问 ip 删除
     * Summary: lb 监听器访问 ip 删除.
     *
     * @param RemoveLoadbalanceSecurityipRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return RemoveLoadbalanceSecurityipResponse
     */
    public function removeLoadbalanceSecurityipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveLoadbalanceSecurityipResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.securityip.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用创建
     * Summary: 应用创建.
     *
     * @param CreateApplicationRequest $request
     *
     * @return CreateApplicationResponse
     */
    public function createApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用创建
     * Summary: 应用创建.
     *
     * @param CreateApplicationRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateApplicationResponse
     */
    public function createApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApplicationResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用删除
     * Summary: 应用删除.
     *
     * @param DeleteApplicationRequest $request
     *
     * @return DeleteApplicationResponse
     */
    public function deleteApplication($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteApplicationEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用删除
     * Summary: 应用删除.
     *
     * @param DeleteApplicationRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteApplicationResponse
     */
    public function deleteApplicationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteApplicationResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.application.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: vswitch 创建
     * Summary: vswitch 创建.
     *
     * @param CreateVpcVswitchRequest $request
     *
     * @return CreateVpcVswitchResponse
     */
    public function createVpcVswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createVpcVswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: vswitch 创建
     * Summary: vswitch 创建.
     *
     * @param CreateVpcVswitchRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateVpcVswitchResponse
     */
    public function createVpcVswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateVpcVswitchResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.vswitch.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: vRouterTable 创建
     * Summary: vRouterTable 创建.
     *
     * @param CreateVpcVroutertableRequest $request
     *
     * @return CreateVpcVroutertableResponse
     */
    public function createVpcVroutertable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createVpcVroutertableEx($request, $headers, $runtime);
    }

    /**
     * Description: vRouterTable 创建
     * Summary: vRouterTable 创建.
     *
     * @param CreateVpcVroutertableRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateVpcVroutertableResponse
     */
    public function createVpcVroutertableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateVpcVroutertableResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.vroutertable.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 安全组添加实例
     * Summary: 安全组添加实例.
     *
     * @param AddSecuritygroupInstanceRequest $request
     *
     * @return AddSecuritygroupInstanceResponse
     */
    public function addSecuritygroupInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addSecuritygroupInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 安全组添加实例
     * Summary: 安全组添加实例.
     *
     * @param AddSecuritygroupInstanceRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AddSecuritygroupInstanceResponse
     */
    public function addSecuritygroupInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddSecuritygroupInstanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.instance.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: db 规格修改
     * Summary: db 规格修改.
     *
     * @param UpdateDatabaseSpecRequest $request
     *
     * @return UpdateDatabaseSpecResponse
     */
    public function updateDatabaseSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDatabaseSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: db 规格修改
     * Summary: db 规格修改.
     *
     * @param UpdateDatabaseSpecRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateDatabaseSpecResponse
     */
    public function updateDatabaseSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDatabaseSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.spec.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: lb 访问控制修改
     * Summary: lb 访问控制修改.
     *
     * @param UpdateLoadbalanceAccesscontrolRequest $request
     *
     * @return UpdateLoadbalanceAccesscontrolResponse
     */
    public function updateLoadbalanceAccesscontrol($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLoadbalanceAccesscontrolEx($request, $headers, $runtime);
    }

    /**
     * Description: lb 访问控制修改
     * Summary: lb 访问控制修改.
     *
     * @param UpdateLoadbalanceAccesscontrolRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return UpdateLoadbalanceAccesscontrolResponse
     */
    public function updateLoadbalanceAccesscontrolEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLoadbalanceAccesscontrolResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.accesscontrol.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: lb 规格修改
     * Summary: lb 规格修改.
     *
     * @param UpdateLoadbalanceSpecRequest $request
     *
     * @return UpdateLoadbalanceSpecResponse
     */
    public function updateLoadbalanceSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLoadbalanceSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: lb 规格修改
     * Summary: lb 规格修改.
     *
     * @param UpdateLoadbalanceSpecRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateLoadbalanceSpecResponse
     */
    public function updateLoadbalanceSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLoadbalanceSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.spec.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: vswitch 信息修改
     * Summary: vswitch 信息修改.
     *
     * @param UpdateVpcVswitchRequest $request
     *
     * @return UpdateVpcVswitchResponse
     */
    public function updateVpcVswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateVpcVswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: vswitch 信息修改
     * Summary: vswitch 信息修改.
     *
     * @param UpdateVpcVswitchRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateVpcVswitchResponse
     */
    public function updateVpcVswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateVpcVswitchResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.vswitch.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建 workspace
     * Summary: 创建 workspace.
     *
     * @param CreateWorkspaceRequest $request
     *
     * @return CreateWorkspaceResponse
     */
    public function createWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建 workspace
     * Summary: 创建 workspace.
     *
     * @param CreateWorkspaceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateWorkspaceResponse
     */
    public function createWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.workspace.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 元数据workspace创建
     * Summary: 元数据workspace创建.
     *
     * @param CreateMetaWorkspaceRequest $request
     *
     * @return CreateMetaWorkspaceResponse
     */
    public function createMetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 元数据workspace创建
     * Summary: 元数据workspace创建.
     *
     * @param CreateMetaWorkspaceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateMetaWorkspaceResponse
     */
    public function createMetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.meta.workspace.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: workspace查询
     * Summary: workspace查询.
     *
     * @param QueryMetaWorkspaceRequest $request
     *
     * @return QueryMetaWorkspaceResponse
     */
    public function queryMetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: workspace查询
     * Summary: workspace查询.
     *
     * @param QueryMetaWorkspaceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryMetaWorkspaceResponse
     */
    public function queryMetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.meta.workspace.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 元数据workspace删除
     * Summary: 元数据workspace删除.
     *
     * @param DeleteMetaWorkspaceRequest $request
     *
     * @return DeleteMetaWorkspaceResponse
     */
    public function deleteMetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteMetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 元数据workspace删除
     * Summary: 元数据workspace删除.
     *
     * @param DeleteMetaWorkspaceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteMetaWorkspaceResponse
     */
    public function deleteMetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteMetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.meta.workspace.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源VPC创建
     * Summary: 资源VPC创建.
     *
     * @param CreateResourceVpcRequest $request
     *
     * @return CreateResourceVpcResponse
     */
    public function createResourceVpc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createResourceVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源VPC创建
     * Summary: 资源VPC创建.
     *
     * @param CreateResourceVpcRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateResourceVpcResponse
     */
    public function createResourceVpcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateResourceVpcResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.vpc.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源VPC查询
     * Summary: 资源VPC查询.
     *
     * @param QueryResourceVpcRequest $request
     *
     * @return QueryResourceVpcResponse
     */
    public function queryResourceVpc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResourceVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源VPC查询
     * Summary: 资源VPC查询.
     *
     * @param QueryResourceVpcRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryResourceVpcResponse
     */
    public function queryResourceVpcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResourceVpcResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.vpc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源VPC删除
     * Summary: 资源VPC删除.
     *
     * @param DeleteResourceVpcRequest $request
     *
     * @return DeleteResourceVpcResponse
     */
    public function deleteResourceVpc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteResourceVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源VPC删除
     * Summary: 资源VPC删除.
     *
     * @param DeleteResourceVpcRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteResourceVpcResponse
     */
    public function deleteResourceVpcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteResourceVpcResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.vpc.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源vswitch创建
     * Summary: 资源vswitch创建.
     *
     * @param CreateResourceVswitchRequest $request
     *
     * @return CreateResourceVswitchResponse
     */
    public function createResourceVswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createResourceVswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源vswitch创建
     * Summary: 资源vswitch创建.
     *
     * @param CreateResourceVswitchRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateResourceVswitchResponse
     */
    public function createResourceVswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateResourceVswitchResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.vswitch.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源vswitch查询
     * Summary: 资源vswitch查询.
     *
     * @param QueryResourceVswitchRequest $request
     *
     * @return QueryResourceVswitchResponse
     */
    public function queryResourceVswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResourceVswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源vswitch查询
     * Summary: 资源vswitch查询.
     *
     * @param QueryResourceVswitchRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryResourceVswitchResponse
     */
    public function queryResourceVswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResourceVswitchResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.vswitch.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源vswitch删除
     * Summary: 资源vswitch删除.
     *
     * @param DeleteResourceVswitchRequest $request
     *
     * @return DeleteResourceVswitchResponse
     */
    public function deleteResourceVswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteResourceVswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源vswitch删除
     * Summary: 资源vswitch删除.
     *
     * @param DeleteResourceVswitchRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DeleteResourceVswitchResponse
     */
    public function deleteResourceVswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteResourceVswitchResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.vswitch.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资源securitygroup查询
     * Summary: 资源securitygroup查询.
     *
     * @param QueryResourceSecuritygroupRequest $request
     *
     * @return QueryResourceSecuritygroupResponse
     */
    public function queryResourceSecuritygroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResourceSecuritygroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 资源securitygroup查询
     * Summary: 资源securitygroup查询.
     *
     * @param QueryResourceSecuritygroupRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryResourceSecuritygroupResponse
     */
    public function queryResourceSecuritygroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResourceSecuritygroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.securitygroup.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: workspace 列表
     * Summary: workspace 列表.
     *
     * @param ListMetaWorkspaceRequest $request
     *
     * @return ListMetaWorkspaceResponse
     */
    public function listMetaWorkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listMetaWorkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: workspace 列表
     * Summary: workspace 列表.
     *
     * @param ListMetaWorkspaceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListMetaWorkspaceResponse
     */
    public function listMetaWorkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListMetaWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.meta.workspace.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建安全组资源
     * Summary: 创建安全组.
     *
     * @param CreateResourceSecuritygroupRequest $request
     *
     * @return CreateResourceSecuritygroupResponse
     */
    public function createResourceSecuritygroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createResourceSecuritygroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建安全组资源
     * Summary: 创建安全组.
     *
     * @param CreateResourceSecuritygroupRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateResourceSecuritygroupResponse
     */
    public function createResourceSecuritygroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateResourceSecuritygroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.securitygroup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除安全组
     * Summary: 删除安全组.
     *
     * @param DeleteResourceSecuritygroupRequest $request
     *
     * @return DeleteResourceSecuritygroupResponse
     */
    public function deleteResourceSecuritygroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteResourceSecuritygroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除安全组
     * Summary: 删除安全组.
     *
     * @param DeleteResourceSecuritygroupRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DeleteResourceSecuritygroupResponse
     */
    public function deleteResourceSecuritygroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteResourceSecuritygroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.securitygroup.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建云主机instance
     * Summary: 创建云主机instance.
     *
     * @param CreateResourceComputerRequest $request
     *
     * @return CreateResourceComputerResponse
     */
    public function createResourceComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createResourceComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建云主机instance
     * Summary: 创建云主机instance.
     *
     * @param CreateResourceComputerRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateResourceComputerResponse
     */
    public function createResourceComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateResourceComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.computer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: computer 查询
     * Summary: computer 查询.
     *
     * @param QueryResourceComputerRequest $request
     *
     * @return QueryResourceComputerResponse
     */
    public function queryResourceComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResourceComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: computer 查询
     * Summary: computer 查询.
     *
     * @param QueryResourceComputerRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryResourceComputerResponse
     */
    public function queryResourceComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResourceComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.computer.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据CPU内存机器规格查询api
     * Summary: 机器规格查询api.
     *
     * @param QueryResourceComputerspecRequest $request
     *
     * @return QueryResourceComputerspecResponse
     */
    public function queryResourceComputerspec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResourceComputerspecEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据CPU内存机器规格查询api
     * Summary: 机器规格查询api.
     *
     * @param QueryResourceComputerspecRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryResourceComputerspecResponse
     */
    public function queryResourceComputerspecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResourceComputerspecResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.computerspec.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除computer
     * Summary: 删除computer.
     *
     * @param DeleteResourceComputerRequest $request
     *
     * @return DeleteResourceComputerResponse
     */
    public function deleteResourceComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteResourceComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除computer
     * Summary: 删除computer.
     *
     * @param DeleteResourceComputerRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteResourceComputerResponse
     */
    public function deleteResourceComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteResourceComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.computer.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重置computer密码
     * Summary: 重置computer密码
     *
     * @param ReinitResourceComputerpasswordRequest $request
     *
     * @return ReinitResourceComputerpasswordResponse
     */
    public function reinitResourceComputerpassword($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reinitResourceComputerpasswordEx($request, $headers, $runtime);
    }

    /**
     * Description: 重置computer密码
     * Summary: 重置computer密码
     *
     * @param ReinitResourceComputerpasswordRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ReinitResourceComputerpasswordResponse
     */
    public function reinitResourceComputerpasswordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReinitResourceComputerpasswordResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.computerpassword.reinit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 启动computer
     * Summary: 启动computer.
     *
     * @param StartResourceComputerRequest $request
     *
     * @return StartResourceComputerResponse
     */
    public function startResourceComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startResourceComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 启动computer
     * Summary: 启动computer.
     *
     * @param StartResourceComputerRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return StartResourceComputerResponse
     */
    public function startResourceComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartResourceComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.computer.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 停止机器
     * Summary: 停止机器.
     *
     * @param StopResourceComputerRequest $request
     *
     * @return StopResourceComputerResponse
     */
    public function stopResourceComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopResourceComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 停止机器
     * Summary: 停止机器.
     *
     * @param StopResourceComputerRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return StopResourceComputerResponse
     */
    public function stopResourceComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopResourceComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.computer.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志项目
     * Summary: 创建日志项目.
     *
     * @param CreateSlsProjectRequest $request
     *
     * @return CreateSlsProjectResponse
     */
    public function createSlsProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSlsProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志项目
     * Summary: 创建日志项目.
     *
     * @param CreateSlsProjectRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateSlsProjectResponse
     */
    public function createSlsProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSlsProjectResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.project.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志项目列表
     * Summary: 获取日志项目列表.
     *
     * @param ListSlsProjectRequest $request
     *
     * @return ListSlsProjectResponse
     */
    public function listSlsProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSlsProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志项目列表
     * Summary: 获取日志项目列表.
     *
     * @param ListSlsProjectRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListSlsProjectResponse
     */
    public function listSlsProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSlsProjectResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.project.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志库
     * Summary: 创建日志库.
     *
     * @param CreateSlsLogstoreRequest $request
     *
     * @return CreateSlsLogstoreResponse
     */
    public function createSlsLogstore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSlsLogstoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志库
     * Summary: 创建日志库.
     *
     * @param CreateSlsLogstoreRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateSlsLogstoreResponse
     */
    public function createSlsLogstoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSlsLogstoreResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.logstore.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志库列表
     * Summary: 获取日志库列表.
     *
     * @param ListSlsLogstoreRequest $request
     *
     * @return ListSlsLogstoreResponse
     */
    public function listSlsLogstore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSlsLogstoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志库列表
     * Summary: 获取日志库列表.
     *
     * @param ListSlsLogstoreRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListSlsLogstoreResponse
     */
    public function listSlsLogstoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSlsLogstoreResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.logstore.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取单个日志库
     * Summary: 获取单个日志库.
     *
     * @param GetSlsLogstoreRequest $request
     *
     * @return GetSlsLogstoreResponse
     */
    public function getSlsLogstore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSlsLogstoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取单个日志库
     * Summary: 获取单个日志库.
     *
     * @param GetSlsLogstoreRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetSlsLogstoreResponse
     */
    public function getSlsLogstoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSlsLogstoreResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.logstore.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志配置
     * Summary: 创建日志配置.
     *
     * @param CreateSlsConfigRequest $request
     *
     * @return CreateSlsConfigResponse
     */
    public function createSlsConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSlsConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-创建日志配置
     * Summary: 创建日志配置.
     *
     * @param CreateSlsConfigRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateSlsConfigResponse
     */
    public function createSlsConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSlsConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.config.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志配置列表
     * Summary: 获取日志配置列表.
     *
     * @param ListSlsConfigRequest $request
     *
     * @return ListSlsConfigResponse
     */
    public function listSlsConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSlsConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-获取日志配置列表
     * Summary: 获取日志配置列表.
     *
     * @param ListSlsConfigRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ListSlsConfigResponse
     */
    public function listSlsConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSlsConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.config.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS)-更新日志配置
     * Summary: 更新日志配置.
     *
     * @param UpdateSlsConfigRequest $request
     *
     * @return UpdateSlsConfigResponse
     */
    public function updateSlsConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSlsConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-更新日志配置
     * Summary: 更新日志配置.
     *
     * @param UpdateSlsConfigRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateSlsConfigResponse
     */
    public function updateSlsConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSlsConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.config.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS)-删除日志配置
     * Summary: 删除日志配置.
     *
     * @param DeleteSlsConfigRequest $request
     *
     * @return DeleteSlsConfigResponse
     */
    public function deleteSlsConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSlsConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS)-删除日志配置
     * Summary: 删除日志配置.
     *
     * @param DeleteSlsConfigRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteSlsConfigResponse
     */
    public function deleteSlsConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSlsConfigResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.config.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云日志服务(SLS) - 查询日志
     * Summary: 查询日志.
     *
     * @param QuerySlsLogRequest $request
     *
     * @return QuerySlsLogResponse
     */
    public function querySlsLog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySlsLogEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云日志服务(SLS) - 查询日志
     * Summary: 查询日志.
     *
     * @param QuerySlsLogRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QuerySlsLogResponse
     */
    public function querySlsLogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySlsLogResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.sls.log.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量添加安全组入规则
     * Summary: 批量添加安全组规则.
     *
     * @param BatchcreateResourceIngressrulesRequest $request
     *
     * @return BatchcreateResourceIngressrulesResponse
     */
    public function batchcreateResourceIngressrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateResourceIngressrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量添加安全组入规则
     * Summary: 批量添加安全组规则.
     *
     * @param BatchcreateResourceIngressrulesRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return BatchcreateResourceIngressrulesResponse
     */
    public function batchcreateResourceIngressrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateResourceIngressrulesResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.ingressrules.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量添加安全组出方向规则
     * Summary: 批量添加安全组出方向规则.
     *
     * @param BatchcreateResourceEgressrulesRequest $request
     *
     * @return BatchcreateResourceEgressrulesResponse
     */
    public function batchcreateResourceEgressrules($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateResourceEgressrulesEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量添加安全组出方向规则
     * Summary: 批量添加安全组出方向规则.
     *
     * @param BatchcreateResourceEgressrulesRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return BatchcreateResourceEgressrulesResponse
     */
    public function batchcreateResourceEgressrulesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateResourceEgressrulesResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.egressrules.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: loadbalance查询
     * Summary: loadbalance查询.
     *
     * @param QueryLoadbalanceRequest $request
     *
     * @return QueryLoadbalanceResponse
     */
    public function queryLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: loadbalance查询
     * Summary: loadbalance查询.
     *
     * @param QueryLoadbalanceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryLoadbalanceResponse
     */
    public function queryLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个LB的健康状态
     * Summary: 获取单个LB的健康状态
     *
     * @param GetLoadbalanceHealthRequest $request
     *
     * @return GetLoadbalanceHealthResponse
     */
    public function getLoadbalanceHealth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLoadbalanceHealthEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个LB的健康状态
     * Summary: 获取单个LB的健康状态
     *
     * @param GetLoadbalanceHealthRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetLoadbalanceHealthResponse
     */
    public function getLoadbalanceHealthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLoadbalanceHealthResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.health.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有的vip类型
     * Summary: 获取所有的vip类型.
     *
     * @param AllLoadbalanceViptypeRequest $request
     *
     * @return AllLoadbalanceViptypeResponse
     */
    public function allLoadbalanceViptype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allLoadbalanceViptypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有的vip类型
     * Summary: 获取所有的vip类型.
     *
     * @param AllLoadbalanceViptypeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AllLoadbalanceViptypeResponse
     */
    public function allLoadbalanceViptypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllLoadbalanceViptypeResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.viptype.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有的LB集群
     * Summary: 获取所有的LB集群.
     *
     * @param AllLoadbalanceClusterRequest $request
     *
     * @return AllLoadbalanceClusterResponse
     */
    public function allLoadbalanceCluster($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allLoadbalanceClusterEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有的LB集群
     * Summary: 获取所有的LB集群.
     *
     * @param AllLoadbalanceClusterRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AllLoadbalanceClusterResponse
     */
    public function allLoadbalanceClusterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllLoadbalanceClusterResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.cluster.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询vpc详细信息
     * Summary: 查询vpc详细信息.
     *
     * @param QueryVpcRequest $request
     *
     * @return QueryVpcResponse
     */
    public function queryVpc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询vpc详细信息
     * Summary: 查询vpc详细信息.
     *
     * @param QueryVpcRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return QueryVpcResponse
     */
    public function queryVpcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryVpcResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已导入workspace的vpc
     * Summary: 查询已导入workspace的vpc.
     *
     * @param ListVpcImportRequest $request
     *
     * @return ListVpcImportResponse
     */
    public function listVpcImport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listVpcImportEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已导入workspace的vpc
     * Summary: 查询已导入workspace的vpc.
     *
     * @param ListVpcImportRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ListVpcImportResponse
     */
    public function listVpcImportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListVpcImportResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.import.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询vpc cidrblock信息
     * Summary: 查询vpc cidrblock信息.
     *
     * @param ListVpcCidrblockRequest $request
     *
     * @return ListVpcCidrblockResponse
     */
    public function listVpcCidrblock($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listVpcCidrblockEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询vpc cidrblock信息
     * Summary: 查询vpc cidrblock信息.
     *
     * @param ListVpcCidrblockRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListVpcCidrblockResponse
     */
    public function listVpcCidrblockEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListVpcCidrblockResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.cidrblock.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询交换机信息
     * Summary: 查询交换机信息.
     *
     * @param QueryVpcVswitchRequest $request
     *
     * @return QueryVpcVswitchResponse
     */
    public function queryVpcVswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryVpcVswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询交换机信息
     * Summary: 查询交换机信息.
     *
     * @param QueryVpcVswitchRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryVpcVswitchResponse
     */
    public function queryVpcVswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryVpcVswitchResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.vswitch.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询路由表信息
     * Summary: 查询路由表信息.
     *
     * @param QueryVpcVroutertableRequest $request
     *
     * @return QueryVpcVroutertableResponse
     */
    public function queryVpcVroutertable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryVpcVroutertableEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询路由表信息
     * Summary: 查询路由表信息.
     *
     * @param QueryVpcVroutertableRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryVpcVroutertableResponse
     */
    public function queryVpcVroutertableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryVpcVroutertableResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.vpc.vroutertable.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个rule
     * Summary: 获取单个rule.
     *
     * @param GetLoadbalanceRuleRequest $request
     *
     * @return GetLoadbalanceRuleResponse
     */
    public function getLoadbalanceRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLoadbalanceRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个rule
     * Summary: 获取单个rule.
     *
     * @param GetLoadbalanceRuleRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetLoadbalanceRuleResponse
     */
    public function getLoadbalanceRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLoadbalanceRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.rule.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询Lb rule
     * Summary: 批量查询Lb rule.
     *
     * @param QueryLoadbalanceRuleRequest $request
     *
     * @return QueryLoadbalanceRuleResponse
     */
    public function queryLoadbalanceRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadbalanceRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询Lb rule
     * Summary: 批量查询Lb rule.
     *
     * @param QueryLoadbalanceRuleRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryLoadbalanceRuleResponse
     */
    public function queryLoadbalanceRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadbalanceRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.rule.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个Lb ById
     * Summary: 获取单个Lb ById.
     *
     * @param GetLoadbalanceRequest $request
     *
     * @return GetLoadbalanceResponse
     */
    public function getLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个Lb ById
     * Summary: 获取单个Lb ById.
     *
     * @param GetLoadbalanceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetLoadbalanceResponse
     */
    public function getLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取LB后端所有主机
     * Summary: 获取LB后端所有主机.
     *
     * @param AllLoadbalanceMountRequest $request
     *
     * @return AllLoadbalanceMountResponse
     */
    public function allLoadbalanceMount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allLoadbalanceMountEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取LB后端所有主机
     * Summary: 获取LB后端所有主机.
     *
     * @param AllLoadbalanceMountRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AllLoadbalanceMountResponse
     */
    public function allLoadbalanceMountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllLoadbalanceMountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.mount.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据条件查询后端的主机
     * Summary: 根据条件查询后端的主机.
     *
     * @param QueryLoadbalanceMountRequest $request
     *
     * @return QueryLoadbalanceMountResponse
     */
    public function queryLoadbalanceMount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadbalanceMountEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据条件查询后端的主机
     * Summary: 根据条件查询后端的主机.
     *
     * @param QueryLoadbalanceMountRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryLoadbalanceMountResponse
     */
    public function queryLoadbalanceMountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadbalanceMountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.mount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个vcomputergroup
     * Summary: 获取单个vcomputergroup.
     *
     * @param GetLoadbalanceVcomputergroupRequest $request
     *
     * @return GetLoadbalanceVcomputergroupResponse
     */
    public function getLoadbalanceVcomputergroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLoadbalanceVcomputergroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个vcomputergroup
     * Summary: 获取单个vcomputergroup.
     *
     * @param GetLoadbalanceVcomputergroupRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return GetLoadbalanceVcomputergroupResponse
     */
    public function getLoadbalanceVcomputergroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLoadbalanceVcomputergroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.vcomputergroup.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询vcomputergroup
     * Summary: 查询vcomputergroup.
     *
     * @param QueryLoadbalanceVcomputergroupRequest $request
     *
     * @return QueryLoadbalanceVcomputergroupResponse
     */
    public function queryLoadbalanceVcomputergroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadbalanceVcomputergroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询vcomputergroup
     * Summary: 查询vcomputergroup.
     *
     * @param QueryLoadbalanceVcomputergroupRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryLoadbalanceVcomputergroupResponse
     */
    public function queryLoadbalanceVcomputergroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadbalanceVcomputergroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.vcomputergroup.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有vcomputergroup
     * Summary: 获取所有vcomputergroup.
     *
     * @param AllLoadbalanceVcomputergroupRequest $request
     *
     * @return AllLoadbalanceVcomputergroupResponse
     */
    public function allLoadbalanceVcomputergroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allLoadbalanceVcomputergroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有vcomputergroup
     * Summary: 获取所有vcomputergroup.
     *
     * @param AllLoadbalanceVcomputergroupRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return AllLoadbalanceVcomputergroupResponse
     */
    public function allLoadbalanceVcomputergroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllLoadbalanceVcomputergroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.vcomputergroup.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取vcomputer
     * Summary: 获取vcomputer.
     *
     * @param QueryLoadbalanceVcomputerRequest $request
     *
     * @return QueryLoadbalanceVcomputerResponse
     */
    public function queryLoadbalanceVcomputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadbalanceVcomputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取vcomputer
     * Summary: 获取vcomputer.
     *
     * @param QueryLoadbalanceVcomputerRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryLoadbalanceVcomputerResponse
     */
    public function queryLoadbalanceVcomputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadbalanceVcomputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.vcomputer.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询listener
     * Summary: 查询listener.
     *
     * @param QueryLoadbalanceListenerRequest $request
     *
     * @return QueryLoadbalanceListenerResponse
     */
    public function queryLoadbalanceListener($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadbalanceListenerEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询listener
     * Summary: 查询listener.
     *
     * @param QueryLoadbalanceListenerRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryLoadbalanceListenerResponse
     */
    public function queryLoadbalanceListenerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadbalanceListenerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.listener.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有listener
     * Summary: 获取所有listener.
     *
     * @param AllLoadbalanceListenerRequest $request
     *
     * @return AllLoadbalanceListenerResponse
     */
    public function allLoadbalanceListener($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allLoadbalanceListenerEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有listener
     * Summary: 获取所有listener.
     *
     * @param AllLoadbalanceListenerRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return AllLoadbalanceListenerResponse
     */
    public function allLoadbalanceListenerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllLoadbalanceListenerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.listener.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询securityip
     * Summary: 查询securityip.
     *
     * @param QueryLoadbalanceSecurityipRequest $request
     *
     * @return QueryLoadbalanceSecurityipResponse
     */
    public function queryLoadbalanceSecurityip($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadbalanceSecurityipEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询securityip
     * Summary: 查询securityip.
     *
     * @param QueryLoadbalanceSecurityipRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryLoadbalanceSecurityipResponse
     */
    public function queryLoadbalanceSecurityipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadbalanceSecurityipResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.securityip.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个database
     * Summary: 获取单个database.
     *
     * @param GetDatabaseRequest $request
     *
     * @return GetDatabaseResponse
     */
    public function getDatabase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个database
     * Summary: 获取单个database.
     *
     * @param GetDatabaseRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetDatabaseResponse
     */
    public function getDatabaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDatabaseResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有masterzone
     * Summary: 获取所有masterzone.
     *
     * @param AllDatabaseMasterzoneRequest $request
     *
     * @return AllDatabaseMasterzoneResponse
     */
    public function allDatabaseMasterzone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allDatabaseMasterzoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有masterzone
     * Summary: 获取所有masterzone.
     *
     * @param AllDatabaseMasterzoneRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AllDatabaseMasterzoneResponse
     */
    public function allDatabaseMasterzoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllDatabaseMasterzoneResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.masterzone.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据库
     * Summary: 查询数据库.
     *
     * @param QueryDatabaseRequest $request
     *
     * @return QueryDatabaseResponse
     */
    public function queryDatabase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据库
     * Summary: 查询数据库.
     *
     * @param QueryDatabaseRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryDatabaseResponse
     */
    public function queryDatabaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatabaseResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据库规格
     * Summary: 查询数据库规格
     *
     * @param QueryDatabaseSpecRequest $request
     *
     * @return QueryDatabaseSpecResponse
     */
    public function queryDatabaseSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatabaseSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据库规格
     * Summary: 查询数据库规格
     *
     * @param QueryDatabaseSpecRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryDatabaseSpecResponse
     */
    public function queryDatabaseSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatabaseSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.spec.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据引擎
     * Summary: 查询数据引擎.
     *
     * @param AllDatabaseEngineRequest $request
     *
     * @return AllDatabaseEngineResponse
     */
    public function allDatabaseEngine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allDatabaseEngineEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据引擎
     * Summary: 查询数据引擎.
     *
     * @param AllDatabaseEngineRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AllDatabaseEngineResponse
     */
    public function allDatabaseEngineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllDatabaseEngineResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.engine.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据库quota
     * Summary: 查询数据库quota.
     *
     * @param AllDatabaseQuotaRequest $request
     *
     * @return AllDatabaseQuotaResponse
     */
    public function allDatabaseQuota($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allDatabaseQuotaEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据库quota
     * Summary: 查询数据库quota.
     *
     * @param AllDatabaseQuotaRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AllDatabaseQuotaResponse
     */
    public function allDatabaseQuotaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllDatabaseQuotaResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.quota.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据库所有securityip
     * Summary: 查询数据库所有securityip.
     *
     * @param AllDatabaseSecurityipRequest $request
     *
     * @return AllDatabaseSecurityipResponse
     */
    public function allDatabaseSecurityip($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allDatabaseSecurityipEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据库所有securityip
     * Summary: 查询数据库所有securityip.
     *
     * @param AllDatabaseSecurityipRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AllDatabaseSecurityipResponse
     */
    public function allDatabaseSecurityipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllDatabaseSecurityipResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.securityip.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: ！！！！不要用，typo
     * Summary: ！！！！不要用，typo.
     *
     * @param QueryDatabaseSchemeRequest $request
     *
     * @return QueryDatabaseSchemeResponse
     */
    public function queryDatabaseScheme($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatabaseSchemeEx($request, $headers, $runtime);
    }

    /**
     * Description: ！！！！不要用，typo
     * Summary: ！！！！不要用，typo.
     *
     * @param QueryDatabaseSchemeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDatabaseSchemeResponse
     */
    public function queryDatabaseSchemeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatabaseSchemeResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.scheme.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取数据库导入记录
     * Summary: 获取数据库导入记录.
     *
     * @param AllDatabaseImportRequest $request
     *
     * @return AllDatabaseImportResponse
     */
    public function allDatabaseImport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allDatabaseImportEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取数据库导入记录
     * Summary: 获取数据库导入记录.
     *
     * @param AllDatabaseImportRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AllDatabaseImportResponse
     */
    public function allDatabaseImportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllDatabaseImportResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.import.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询computer agent状态
     * Summary: 查询computer agent状态
     *
     * @param QueryComputerAgentstatusRequest $request
     *
     * @return QueryComputerAgentstatusResponse
     */
    public function queryComputerAgentstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComputerAgentstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询computer agent状态
     * Summary: 查询computer agent状态
     *
     * @param QueryComputerAgentstatusRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryComputerAgentstatusResponse
     */
    public function queryComputerAgentstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComputerAgentstatusResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.agentstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询computer staragent 启动命令
     * Summary: 查询 staragent 启动命令.
     *
     * @param QueryComputerAgentsetupcommandRequest $request
     *
     * @return QueryComputerAgentsetupcommandResponse
     */
    public function queryComputerAgentsetupcommand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComputerAgentsetupcommandEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询computer staragent 启动命令
     * Summary: 查询 staragent 启动命令.
     *
     * @param QueryComputerAgentsetupcommandRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryComputerAgentsetupcommandResponse
     */
    public function queryComputerAgentsetupcommandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComputerAgentsetupcommandResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.agentsetupcommand.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已导入的computer信息
     * Summary: 查询已导入的computer信息.
     *
     * @param QueryComputerImportRequest $request
     *
     * @return QueryComputerImportResponse
     */
    public function queryComputerImport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComputerImportEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已导入的computer信息
     * Summary: 查询已导入的computer信息.
     *
     * @param QueryComputerImportRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryComputerImportResponse
     */
    public function queryComputerImportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComputerImportResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.import.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: list computers
     * Summary: list computers.
     *
     * @param ListComputerRequest $request
     *
     * @return ListComputerResponse
     */
    public function listComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: list computers
     * Summary: list computers.
     *
     * @param ListComputerRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListComputerResponse
     */
    public function listComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query computer specs
     * Summary: query computer specs.
     *
     * @param QueryComputerSpecRequest $request
     *
     * @return QueryComputerSpecResponse
     */
    public function queryComputerSpec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComputerSpecEx($request, $headers, $runtime);
    }

    /**
     * Description: query computer specs
     * Summary: query computer specs.
     *
     * @param QueryComputerSpecRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryComputerSpecResponse
     */
    public function queryComputerSpecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComputerSpecResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.spec.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query computer common image
     * Summary: query common image.
     *
     * @param QueryComputerCommonimageRequest $request
     *
     * @return QueryComputerCommonimageResponse
     */
    public function queryComputerCommonimage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComputerCommonimageEx($request, $headers, $runtime);
    }

    /**
     * Description: query computer common image
     * Summary: query common image.
     *
     * @param QueryComputerCommonimageRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryComputerCommonimageResponse
     */
    public function queryComputerCommonimageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComputerCommonimageResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.commonimage.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有loadbalance
     * Summary: 获取所有loadbalance.
     *
     * @param AllLoadbalanceRequest $request
     *
     * @return AllLoadbalanceResponse
     */
    public function allLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有loadbalance
     * Summary: 获取所有loadbalance.
     *
     * @param AllLoadbalanceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AllLoadbalanceResponse
     */
    public function allLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询导入信息
     * Summary: 查询导入信息.
     *
     * @param QueryLoadbalanceImportRequest $request
     *
     * @return QueryLoadbalanceImportResponse
     */
    public function queryLoadbalanceImport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLoadbalanceImportEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询导入信息
     * Summary: 查询导入信息.
     *
     * @param QueryLoadbalanceImportRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryLoadbalanceImportResponse
     */
    public function queryLoadbalanceImportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLoadbalanceImportResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.import.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据库导入记录
     * Summary: 查询数据库导入记录.
     *
     * @param QueryDatabaseImportRequest $request
     *
     * @return QueryDatabaseImportResponse
     */
    public function queryDatabaseImport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatabaseImportEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据库导入记录
     * Summary: 查询数据库导入记录.
     *
     * @param QueryDatabaseImportRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDatabaseImportResponse
     */
    public function queryDatabaseImportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatabaseImportResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.import.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询masterzone
     * Summary: 查询masterzone.
     *
     * @param QueryDatabaseMasterzoneRequest $request
     *
     * @return QueryDatabaseMasterzoneResponse
     */
    public function queryDatabaseMasterzone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatabaseMasterzoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询masterzone
     * Summary: 查询masterzone.
     *
     * @param QueryDatabaseMasterzoneRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDatabaseMasterzoneResponse
     */
    public function queryDatabaseMasterzoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatabaseMasterzoneResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.masterzone.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据库额度
     * Summary: 查询数据库额度.
     *
     * @param QueryDatabaseQuotaRequest $request
     *
     * @return QueryDatabaseQuotaResponse
     */
    public function queryDatabaseQuota($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatabaseQuotaEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据库额度
     * Summary: 查询数据库额度.
     *
     * @param QueryDatabaseQuotaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryDatabaseQuotaResponse
     */
    public function queryDatabaseQuotaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatabaseQuotaResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.quota.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询securityip
     * Summary: 查询securityip.
     *
     * @param QueryDatabaseSecurityipRequest $request
     *
     * @return QueryDatabaseSecurityipResponse
     */
    public function queryDatabaseSecurityip($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatabaseSecurityipEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询securityip
     * Summary: 查询securityip.
     *
     * @param QueryDatabaseSecurityipRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDatabaseSecurityipResponse
     */
    public function queryDatabaseSecurityipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatabaseSecurityipResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.securityip.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询当前数据库的schema
     * Summary: 查询当前数据库的schema.
     *
     * @param QueryDatabaseSchemaRequest $request
     *
     * @return QueryDatabaseSchemaResponse
     */
    public function queryDatabaseSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatabaseSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询当前数据库的schema
     * Summary: 查询当前数据库的schema.
     *
     * @param QueryDatabaseSchemaRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryDatabaseSchemaResponse
     */
    public function queryDatabaseSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatabaseSchemaResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.schema.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据库的账号
     * Summary: 查询数据库的账号.
     *
     * @param QueryDatabaseAccountRequest $request
     *
     * @return QueryDatabaseAccountResponse
     */
    public function queryDatabaseAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatabaseAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据库的账号
     * Summary: 查询数据库的账号.
     *
     * @param QueryDatabaseAccountRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryDatabaseAccountResponse
     */
    public function queryDatabaseAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatabaseAccountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.account.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询workspace
     * Summary: 查询workspace.
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
     * Description: 查询workspace
     * Summary: 查询workspace.
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

        return GetWorkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.workspace.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询region
     * Summary: 查询region.
     *
     * @param ListRegionRequest $request
     *
     * @return ListRegionResponse
     */
    public function listRegion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRegionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询region
     * Summary: 查询region.
     *
     * @param ListRegionRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListRegionResponse
     */
    public function listRegionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRegionResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.region.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租户可用region
     * Summary: 租户可用region.
     *
     * @param ListRegionAccessibleRequest $request
     *
     * @return ListRegionAccessibleResponse
     */
    public function listRegionAccessible($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRegionAccessibleEx($request, $headers, $runtime);
    }

    /**
     * Description: 租户可用region
     * Summary: 租户可用region.
     *
     * @param ListRegionAccessibleRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListRegionAccessibleResponse
     */
    public function listRegionAccessibleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRegionAccessibleResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.region.accessible.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新基本信息
     * Summary: 更新基本信息.
     *
     * @param UpdateDatabaseInfoRequest $request
     *
     * @return UpdateDatabaseInfoResponse
     */
    public function updateDatabaseInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDatabaseInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新基本信息
     * Summary: 更新基本信息.
     *
     * @param UpdateDatabaseInfoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateDatabaseInfoResponse
     */
    public function updateDatabaseInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDatabaseInfoResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.info.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 把数据库分配给应用
     * Summary: 把数据库分配给应用.
     *
     * @param SetDatabaseAssignRequest $request
     *
     * @return SetDatabaseAssignResponse
     */
    public function setDatabaseAssign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setDatabaseAssignEx($request, $headers, $runtime);
    }

    /**
     * Description: 把数据库分配给应用
     * Summary: 把数据库分配给应用.
     *
     * @param SetDatabaseAssignRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SetDatabaseAssignResponse
     */
    public function setDatabaseAssignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetDatabaseAssignResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.assign.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 共享数据库给其他workspace
     * Summary: 共享数据库给其他workspace.
     *
     * @param SetDatabaseShareRequest $request
     *
     * @return SetDatabaseShareResponse
     */
    public function setDatabaseShare($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setDatabaseShareEx($request, $headers, $runtime);
    }

    /**
     * Description: 共享数据库给其他workspace
     * Summary: 共享数据库给其他workspace.
     *
     * @param SetDatabaseShareRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SetDatabaseShareResponse
     */
    public function setDatabaseShareEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetDatabaseShareResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.share.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重启数据库
     * Summary: 重启数据库.
     *
     * @param RebootDatabaseRequest $request
     *
     * @return RebootDatabaseResponse
     */
    public function rebootDatabase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->rebootDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 重启数据库
     * Summary: 重启数据库.
     *
     * @param RebootDatabaseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RebootDatabaseResponse
     */
    public function rebootDatabaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RebootDatabaseResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.reboot', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新账户信息
     * Summary: 更新账户信息.
     *
     * @param UpdateDatabaseAccountRequest $request
     *
     * @return UpdateDatabaseAccountResponse
     */
    public function updateDatabaseAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDatabaseAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新账户信息
     * Summary: 更新账户信息.
     *
     * @param UpdateDatabaseAccountRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateDatabaseAccountResponse
     */
    public function updateDatabaseAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDatabaseAccountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.account.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重设databaseaccount密码
     * Summary: 重设databaseaccount密码
     *
     * @param SetDatabaseAccountpasswordRequest $request
     *
     * @return SetDatabaseAccountpasswordResponse
     */
    public function setDatabaseAccountpassword($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setDatabaseAccountpasswordEx($request, $headers, $runtime);
    }

    /**
     * Description: 重设databaseaccount密码
     * Summary: 重设databaseaccount密码
     *
     * @param SetDatabaseAccountpasswordRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SetDatabaseAccountpasswordResponse
     */
    public function setDatabaseAccountpasswordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetDatabaseAccountpasswordResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.accountpassword.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据库账户授权schema
     * Summary: 数据库账户授权schema.
     *
     * @param AuthDatabaseAccountRequest $request
     *
     * @return AuthDatabaseAccountResponse
     */
    public function authDatabaseAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authDatabaseAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据库账户授权schema
     * Summary: 数据库账户授权schema.
     *
     * @param AuthDatabaseAccountRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AuthDatabaseAccountResponse
     */
    public function authDatabaseAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthDatabaseAccountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.account.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询tenantRegion
     * Summary: 查询tenantRegion.
     *
     * @param GetRegionTenantRequest $request
     *
     * @return GetRegionTenantResponse
     */
    public function getRegionTenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRegionTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询tenantRegion
     * Summary: 查询tenantRegion.
     *
     * @param GetRegionTenantRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetRegionTenantResponse
     */
    public function getRegionTenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRegionTenantResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.region.tenant.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: getRegionAliasById
     * Summary: getRegionAliasById.
     *
     * @param GetRegionAliasbyidRequest $request
     *
     * @return GetRegionAliasbyidResponse
     */
    public function getRegionAliasbyid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRegionAliasbyidEx($request, $headers, $runtime);
    }

    /**
     * Description: getRegionAliasById
     * Summary: getRegionAliasById.
     *
     * @param GetRegionAliasbyidRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetRegionAliasbyidResponse
     */
    public function getRegionAliasbyidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRegionAliasbyidResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.region.aliasbyid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询disk信息
     * Summary: 查询disk信息.
     *
     * @param QueryDiskRequest $request
     *
     * @return QueryDiskResponse
     */
    public function queryDisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询disk信息
     * Summary: 查询disk信息.
     *
     * @param QueryDiskRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryDiskResponse
     */
    public function queryDiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDiskResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.disk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询computer image信息
     * Summary: 查询computer image信息.
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
     * Description: 查询computer image信息
     * Summary: 查询computer image信息.
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

        return QueryImageResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.image.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数据库schema
     * Summary: 创建数据库schema.
     *
     * @param CreateDatabaseSchemaRequest $request
     *
     * @return CreateDatabaseSchemaResponse
     */
    public function createDatabaseSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDatabaseSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数据库schema
     * Summary: 创建数据库schema.
     *
     * @param CreateDatabaseSchemaRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateDatabaseSchemaResponse
     */
    public function createDatabaseSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDatabaseSchemaResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.schema.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: LB挂载后端主机
     * Summary: LB挂载后端主机.
     *
     * @param CreateLoadbalanceMountRequest $request
     *
     * @return CreateLoadbalanceMountResponse
     */
    public function createLoadbalanceMount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLoadbalanceMountEx($request, $headers, $runtime);
    }

    /**
     * Description: LB挂载后端主机
     * Summary: LB挂载后端主机.
     *
     * @param CreateLoadbalanceMountRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateLoadbalanceMountResponse
     */
    public function createLoadbalanceMountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLoadbalanceMountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.mount.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建监听器
     * Summary: 创建监听器.
     *
     * @param CreateLoadbalanceListenerRequest $request
     *
     * @return CreateLoadbalanceListenerResponse
     */
    public function createLoadbalanceListener($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLoadbalanceListenerEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建监听器
     * Summary: 创建监听器.
     *
     * @param CreateLoadbalanceListenerRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateLoadbalanceListenerResponse
     */
    public function createLoadbalanceListenerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLoadbalanceListenerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.listener.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 停止监听器
     * Summary: 停止监听器.
     *
     * @param StopLoadbalanceListenerRequest $request
     *
     * @return StopLoadbalanceListenerResponse
     */
    public function stopLoadbalanceListener($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopLoadbalanceListenerEx($request, $headers, $runtime);
    }

    /**
     * Description: 停止监听器
     * Summary: 停止监听器.
     *
     * @param StopLoadbalanceListenerRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return StopLoadbalanceListenerResponse
     */
    public function stopLoadbalanceListenerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopLoadbalanceListenerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.listener.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 启动lb
     * Summary: 启动lb.
     *
     * @param StartLoadbalanceListenerRequest $request
     *
     * @return StartLoadbalanceListenerResponse
     */
    public function startLoadbalanceListener($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startLoadbalanceListenerEx($request, $headers, $runtime);
    }

    /**
     * Description: 启动lb
     * Summary: 启动lb.
     *
     * @param StartLoadbalanceListenerRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return StartLoadbalanceListenerResponse
     */
    public function startLoadbalanceListenerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartLoadbalanceListenerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.listener.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新listener配置
     * Summary: 更新listener配置.
     *
     * @param UpdateLoadbalanceListenerRequest $request
     *
     * @return UpdateLoadbalanceListenerResponse
     */
    public function updateLoadbalanceListener($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLoadbalanceListenerEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新listener配置
     * Summary: 更新listener配置.
     *
     * @param UpdateLoadbalanceListenerRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateLoadbalanceListenerResponse
     */
    public function updateLoadbalanceListenerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLoadbalanceListenerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.listener.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询disk spec信息
     * Summary: 查询disk spec信息.
     *
     * @param QueryDiskspecRequest $request
     *
     * @return QueryDiskspecResponse
     */
    public function queryDiskspec($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDiskspecEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询disk spec信息
     * Summary: 查询disk spec信息.
     *
     * @param QueryDiskspecRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryDiskspecResponse
     */
    public function queryDiskspecEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDiskspecResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.diskspec.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询computer quota
     * Summary: 查询computer quota.
     *
     * @param QueryComputerquotaRequest $request
     *
     * @return QueryComputerquotaResponse
     */
    public function queryComputerquota($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComputerquotaEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询computer quota
     * Summary: 查询computer quota.
     *
     * @param QueryComputerquotaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryComputerquotaResponse
     */
    public function queryComputerquotaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComputerquotaResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computerquota.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 停止computer
     * Summary: 停止computer.
     *
     * @param StopComputerRequest $request
     *
     * @return StopComputerResponse
     */
    public function stopComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 停止computer
     * Summary: 停止computer.
     *
     * @param StopComputerRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return StopComputerResponse
     */
    public function stopComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重启computer
     * Summary: 重启computer.
     *
     * @param RebootComputerRequest $request
     *
     * @return RebootComputerResponse
     */
    public function rebootComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->rebootComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 重启computer
     * Summary: 重启computer.
     *
     * @param RebootComputerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RebootComputerResponse
     */
    public function rebootComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RebootComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.reboot', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询computer所属安全组
     * Summary: 查询computer所属安全组.
     *
     * @param QueryComputerSecuritygroupRequest $request
     *
     * @return QueryComputerSecuritygroupResponse
     */
    public function queryComputerSecuritygroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComputerSecuritygroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询computer所属安全组
     * Summary: 查询computer所属安全组.
     *
     * @param QueryComputerSecuritygroupRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryComputerSecuritygroupResponse
     */
    public function queryComputerSecuritygroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComputerSecuritygroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.securitygroup.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询安全组信息
     * Summary: 查询安全组信息.
     *
     * @param QuerySecuritygroupRequest $request
     *
     * @return QuerySecuritygroupResponse
     */
    public function querySecuritygroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySecuritygroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询安全组信息
     * Summary: 查询安全组信息.
     *
     * @param QuerySecuritygroupRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QuerySecuritygroupResponse
     */
    public function querySecuritygroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySecuritygroupResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建安全组规则
     * Summary: 创建安全组规则.
     *
     * @param CreateSecuritygroupPermissionRequest $request
     *
     * @return CreateSecuritygroupPermissionResponse
     */
    public function createSecuritygroupPermission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSecuritygroupPermissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建安全组规则
     * Summary: 创建安全组规则.
     *
     * @param CreateSecuritygroupPermissionRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateSecuritygroupPermissionResponse
     */
    public function createSecuritygroupPermissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSecuritygroupPermissionResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.permission.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询安全组规则信息
     * Summary: 查询安全组规则信息.
     *
     * @param QuerySecuritygroupPermissionRequest $request
     *
     * @return QuerySecuritygroupPermissionResponse
     */
    public function querySecuritygroupPermission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySecuritygroupPermissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询安全组规则信息
     * Summary: 查询安全组规则信息.
     *
     * @param QuerySecuritygroupPermissionRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QuerySecuritygroupPermissionResponse
     */
    public function querySecuritygroupPermissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySecuritygroupPermissionResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.securitygroup.permission.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新监听器的安全控制
     * Summary: 更新监听器的安全控制.
     *
     * @param UpdateLoadbalanaceSecurityipRequest $request
     *
     * @return UpdateLoadbalanaceSecurityipResponse
     */
    public function updateLoadbalanaceSecurityip($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLoadbalanaceSecurityipEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新监听器的安全控制
     * Summary: 更新监听器的安全控制.
     *
     * @param UpdateLoadbalanaceSecurityipRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateLoadbalanaceSecurityipResponse
     */
    public function updateLoadbalanaceSecurityipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLoadbalanaceSecurityipResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalanace.securityip.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建lb监听器的安全控制
     * Summary: 创建lb监听器的安全控制.
     *
     * @param CreateLoadbalanceSecurityipRequest $request
     *
     * @return CreateLoadbalanceSecurityipResponse
     */
    public function createLoadbalanceSecurityip($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLoadbalanceSecurityipEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建lb监听器的安全控制
     * Summary: 创建lb监听器的安全控制.
     *
     * @param CreateLoadbalanceSecurityipRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateLoadbalanceSecurityipResponse
     */
    public function createLoadbalanceSecurityipEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLoadbalanceSecurityipResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.securityip.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 编辑数据库的基本属性
     * Summary: 编辑数据库的基本属性.
     *
     * @param UpdateDatabaseRequest $request
     *
     * @return UpdateDatabaseResponse
     */
    public function updateDatabase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDatabaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 编辑数据库的基本属性
     * Summary: 编辑数据库的基本属性.
     *
     * @param UpdateDatabaseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateDatabaseResponse
     */
    public function updateDatabaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDatabaseResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.database.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新后端权重
     * Summary: 更新后端权重.
     *
     * @param UpdateLoadbalanceMountRequest $request
     *
     * @return UpdateLoadbalanceMountResponse
     */
    public function updateLoadbalanceMount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLoadbalanceMountEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新后端权重
     * Summary: 更新后端权重.
     *
     * @param UpdateLoadbalanceMountRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateLoadbalanceMountResponse
     */
    public function updateLoadbalanceMountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLoadbalanceMountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.mount.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除LB后端挂载主机
     * Summary: 删除LB后端挂载主机.
     *
     * @param DeleteLoadbalanceMountRequest $request
     *
     * @return DeleteLoadbalanceMountResponse
     */
    public function deleteLoadbalanceMount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteLoadbalanceMountEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除LB后端挂载主机
     * Summary: 删除LB后端挂载主机.
     *
     * @param DeleteLoadbalanceMountRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteLoadbalanceMountResponse
     */
    public function deleteLoadbalanceMountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteLoadbalanceMountResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.mount.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询任务记录
     * Summary: 查询任务记录.
     *
     * @param QueryRequestRequest $request
     *
     * @return QueryRequestResponse
     */
    public function queryRequest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRequestEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询任务记录
     * Summary: 查询任务记录.
     *
     * @param QueryRequestRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryRequestResponse
     */
    public function queryRequestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRequestResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.request.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个request
     * Summary: 获取单个request.
     *
     * @param GetRequestRequest $request
     *
     * @return GetRequestResponse
     */
    public function getRequest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRequestEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个request
     * Summary: 获取单个request.
     *
     * @param GetRequestRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetRequestResponse
     */
    public function getRequestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRequestResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.request.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询task
     * Summary: 查询task.
     *
     * @param QueryRequestTaskRequest $request
     *
     * @return QueryRequestTaskResponse
     */
    public function queryRequestTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRequestTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询task
     * Summary: 查询task.
     *
     * @param QueryRequestTaskRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryRequestTaskResponse
     */
    public function queryRequestTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRequestTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.request.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询任务日志
     * Summary: 查询任务日志.
     *
     * @param QueryTaskLogRequest $request
     *
     * @return QueryTaskLogResponse
     */
    public function queryTaskLog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTaskLogEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询任务日志
     * Summary: 查询任务日志.
     *
     * @param QueryTaskLogRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryTaskLogResponse
     */
    public function queryTaskLogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTaskLogResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.task.log.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
     * Summary: 列出 tenant workspace.
     *
     * @param ListTenantworkspaceRequest $request
     *
     * @return ListTenantworkspaceResponse
     */
    public function listTenantworkspace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listTenantworkspaceEx($request, $headers, $runtime);
    }

    /**
     * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
     * Summary: 列出 tenant workspace.
     *
     * @param ListTenantworkspaceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListTenantworkspaceResponse
     */
    public function listTenantworkspaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListTenantworkspaceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.tenantworkspace.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
     * Summary: 环境filterStatus.
     *
     * @param QueryTenantworkspaceFilterRequest $request
     *
     * @return QueryTenantworkspaceFilterResponse
     */
    public function queryTenantworkspaceFilter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTenantworkspaceFilterEx($request, $headers, $runtime);
    }

    /**
     * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
     * Summary: 环境filterStatus.
     *
     * @param QueryTenantworkspaceFilterRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryTenantworkspaceFilterResponse
     */
    public function queryTenantworkspaceFilterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTenantworkspaceFilterResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.tenantworkspace.filter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: group by region列表
     * Summary: group by region列表.
     *
     * @param ListRegionGroupbyRequest $request
     *
     * @return ListRegionGroupbyResponse
     */
    public function listRegionGroupby($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRegionGroupbyEx($request, $headers, $runtime);
    }

    /**
     * Description: group by region列表
     * Summary: group by region列表.
     *
     * @param ListRegionGroupbyRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListRegionGroupbyResponse
     */
    public function listRegionGroupbyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRegionGroupbyResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.region.groupby.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询任务最后的步骤
     * Summary: 查询任务最后的步骤.
     *
     * @param QueryRequestFinaltaskRequest $request
     *
     * @return QueryRequestFinaltaskResponse
     */
    public function queryRequestFinaltask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRequestFinaltaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询任务最后的步骤
     * Summary: 查询任务最后的步骤.
     *
     * @param QueryRequestFinaltaskRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryRequestFinaltaskResponse
     */
    public function queryRequestFinaltaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRequestFinaltaskResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.request.finaltask.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询当前支持的功能
     * Summary: 查询当前支持的功能.
     *
     * @param QueryFeatureRequest $request
     *
     * @return QueryFeatureResponse
     */
    public function queryFeature($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFeatureEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询当前支持的功能
     * Summary: 查询当前支持的功能.
     *
     * @param QueryFeatureRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryFeatureResponse
     */
    public function queryFeatureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFeatureResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.feature.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: start computer
     * Summary: start computer.
     *
     * @param StartComputerRequest $request
     *
     * @return StartComputerResponse
     */
    public function startComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: start computer
     * Summary: start computer.
     *
     * @param StartComputerRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return StartComputerResponse
     */
    public function startComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开启lb
     * Summary: 开启lb.
     *
     * @param StartLoadbalanceRequest $request
     *
     * @return StartLoadbalanceResponse
     */
    public function startLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 开启lb
     * Summary: 开启lb.
     *
     * @param StartLoadbalanceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return StartLoadbalanceResponse
     */
    public function startLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 停止lb
     * Summary: 停止lb.
     *
     * @param StopLoadbalanceRequest $request
     *
     * @return StopLoadbalanceResponse
     */
    public function stopLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 停止lb
     * Summary: 停止lb.
     *
     * @param StopLoadbalanceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return StopLoadbalanceResponse
     */
    public function stopLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新lb信息
     * Summary: 更新lb信息.
     *
     * @param UpdateLoadbalanceRequest $request
     *
     * @return UpdateLoadbalanceResponse
     */
    public function updateLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新lb信息
     * Summary: 更新lb信息.
     *
     * @param UpdateLoadbalanceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateLoadbalanceResponse
     */
    public function updateLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 把LB分配给应用
     * Summary: 把LB分配给应用.
     *
     * @param AddLoadbalanceAssignRequest $request
     *
     * @return AddLoadbalanceAssignResponse
     */
    public function addLoadbalanceAssign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addLoadbalanceAssignEx($request, $headers, $runtime);
    }

    /**
     * Description: 把LB分配给应用
     * Summary: 把LB分配给应用.
     *
     * @param AddLoadbalanceAssignRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return AddLoadbalanceAssignResponse
     */
    public function addLoadbalanceAssignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddLoadbalanceAssignResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.assign.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 证书查询
     * Summary: 证书查询.
     *
     * @param QueryCertificateRequest $request
     *
     * @return QueryCertificateResponse
     */
    public function queryCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 证书查询
     * Summary: 证书查询.
     *
     * @param QueryCertificateRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryCertificateResponse
     */
    public function queryCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCertificateResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.certificate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建证书
     * Summary: 创建证书.
     *
     * @param CreateCertificateRequest $request
     *
     * @return CreateCertificateResponse
     */
    public function createCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建证书
     * Summary: 创建证书.
     *
     * @param CreateCertificateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateCertificateResponse
     */
    public function createCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCertificateResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.certificate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除证书
     * Summary: 删除证书.
     *
     * @param DeleteCertificateRequest $request
     *
     * @return DeleteCertificateResponse
     */
    public function deleteCertificate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteCertificateEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除证书
     * Summary: 删除证书.
     *
     * @param DeleteCertificateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteCertificateResponse
     */
    public function deleteCertificateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteCertificateResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.certificate.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询已创建的VPC
     * Summary: 查询已创建的VPC.
     *
     * @param DescribeUnifiedresourceVpcRequest $request
     *
     * @return DescribeUnifiedresourceVpcResponse
     */
    public function describeUnifiedresourceVpc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeUnifiedresourceVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询已创建的VPC
     * Summary: 查询已创建的VPC.
     *
     * @param DescribeUnifiedresourceVpcRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DescribeUnifiedresourceVpcResponse
     */
    public function describeUnifiedresourceVpcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeUnifiedresourceVpcResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.unifiedresource.vpc.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询实例规格族列表
     * Summary: 查询实例规格族列表.
     *
     * @param ListUnifiedresourceInstancefamiliesRequest $request
     *
     * @return ListUnifiedresourceInstancefamiliesResponse
     */
    public function listUnifiedresourceInstancefamilies($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUnifiedresourceInstancefamiliesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实例规格族列表
     * Summary: 查询实例规格族列表.
     *
     * @param ListUnifiedresourceInstancefamiliesRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return ListUnifiedresourceInstancefamiliesResponse
     */
    public function listUnifiedresourceInstancefamiliesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUnifiedresourceInstancefamiliesResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.unifiedresource.instancefamilies.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所有实例规格详细信息
     * Summary: 查询实例规格资源.
     *
     * @param ListUnifiedresourceInstancetypeRequest $request
     *
     * @return ListUnifiedresourceInstancetypeResponse
     */
    public function listUnifiedresourceInstancetype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUnifiedresourceInstancetypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所有实例规格详细信息
     * Summary: 查询实例规格资源.
     *
     * @param ListUnifiedresourceInstancetypeRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return ListUnifiedresourceInstancetypeResponse
     */
    public function listUnifiedresourceInstancetypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUnifiedresourceInstancetypeResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.unifiedresource.instancetype.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: query cas computer detail info by id
     * Summary: 获取单个computer的详细信息.
     *
     * @param QueryComputerRequest $request
     *
     * @return QueryComputerResponse
     */
    public function queryComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: query cas computer detail info by id
     * Summary: 获取单个computer的详细信息.
     *
     * @param QueryComputerRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryComputerResponse
     */
    public function queryComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
     * Summary: 查询可用实例类型.
     *
     * @param ListResourceComputertypeRequest $request
     *
     * @return ListResourceComputertypeResponse
     */
    public function listResourceComputertype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listResourceComputertypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
     * Summary: 查询可用实例类型.
     *
     * @param ListResourceComputertypeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListResourceComputertypeResponse
     */
    public function listResourceComputertypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListResourceComputertypeResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.computertype.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询ecs disk 列表
     * Summary: 查询ecs disk info.
     *
     * @param ListResourceDiskRequest $request
     *
     * @return ListResourceDiskResponse
     */
    public function listResourceDisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listResourceDiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询ecs disk 列表
     * Summary: 查询ecs disk info.
     *
     * @param ListResourceDiskRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListResourceDiskResponse
     */
    public function listResourceDiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListResourceDiskResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.disk.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询云服务器规格族列表
     * Summary: 查询云服务器规格族列表.
     *
     * @param ListResourceComputertypefamilyRequest $request
     *
     * @return ListResourceComputertypefamilyResponse
     */
    public function listResourceComputertypefamily($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listResourceComputertypefamilyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询云服务器规格族列表
     * Summary: 查询云服务器规格族列表.
     *
     * @param ListResourceComputertypefamilyRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ListResourceComputertypefamilyResponse
     */
    public function listResourceComputertypefamilyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListResourceComputertypefamilyResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.computertypefamily.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询交换机信息
     * Summary: 查询交换机信息.
     *
     * @param ListUnifiedresourceVswitchRequest $request
     *
     * @return ListUnifiedresourceVswitchResponse
     */
    public function listUnifiedresourceVswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUnifiedresourceVswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询交换机信息
     * Summary: 查询交换机信息.
     *
     * @param ListUnifiedresourceVswitchRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ListUnifiedresourceVswitchResponse
     */
    public function listUnifiedresourceVswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUnifiedresourceVswitchResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.unifiedresource.vswitch.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询当前region的vpc列表
     * Summary: 查询region vpc列表.
     *
     * @param ListUnifiedresourceVpcRequest $request
     *
     * @return ListUnifiedresourceVpcResponse
     */
    public function listUnifiedresourceVpc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUnifiedresourceVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询当前region的vpc列表
     * Summary: 查询region vpc列表.
     *
     * @param ListUnifiedresourceVpcRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListUnifiedresourceVpcResponse
     */
    public function listUnifiedresourceVpcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUnifiedresourceVpcResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.unifiedresource.vpc.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导入vpc到workspace
     * Summary: 导入vpc.
     *
     * @param ImportResourceVpcRequest $request
     *
     * @return ImportResourceVpcResponse
     */
    public function importResourceVpc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importResourceVpcEx($request, $headers, $runtime);
    }

    /**
     * Description: 导入vpc到workspace
     * Summary: 导入vpc.
     *
     * @param ImportResourceVpcRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ImportResourceVpcResponse
     */
    public function importResourceVpcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportResourceVpcResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.vpc.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除安全组规则
     * Summary: 删除安全组规则.
     *
     * @param DeleteResourceRuleRequest $request
     *
     * @return DeleteResourceRuleResponse
     */
    public function deleteResourceRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteResourceRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除安全组规则
     * Summary: 删除安全组规则.
     *
     * @param DeleteResourceRuleRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteResourceRuleResponse
     */
    public function deleteResourceRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteResourceRuleResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resource.rule.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询路由表条目列表
     * Summary: 查询路由表条目列表.
     *
     * @param ListRouteEntryRequest $request
     *
     * @return ListRouteEntryResponse
     */
    public function listRouteEntry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRouteEntryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询路由表条目列表
     * Summary: 查询路由表条目列表.
     *
     * @param ListRouteEntryRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListRouteEntryResponse
     */
    public function listRouteEntryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRouteEntryResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.route.entry.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询可用disk资源详细信息
     * Summary: 查询可用disk资源详细信息.
     *
     * @param ListAvailableDiskRequest $request
     *
     * @return ListAvailableDiskResponse
     */
    public function listAvailableDisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAvailableDiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询可用disk资源详细信息
     * Summary: 查询可用disk资源详细信息.
     *
     * @param ListAvailableDiskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListAvailableDiskResponse
     */
    public function listAvailableDiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAvailableDiskResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.available.disk.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询可用实例类型信息
     * Summary: 查询可用实例类型信息.
     *
     * @param ListAvailableInstancetypeRequest $request
     *
     * @return ListAvailableInstancetypeResponse
     */
    public function listAvailableInstancetype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAvailableInstancetypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询可用实例类型信息
     * Summary: 查询可用实例类型信息.
     *
     * @param ListAvailableInstancetypeRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListAvailableInstancetypeResponse
     */
    public function listAvailableInstancetypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAvailableInstancetypeResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.available.instancetype.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询node meta数据
     * Summary: 查询node meta数据.
     *
     * @param QueryResourcemetaNodeRequest $request
     *
     * @return QueryResourcemetaNodeResponse
     */
    public function queryResourcemetaNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResourcemetaNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询node meta数据
     * Summary: 查询node meta数据.
     *
     * @param QueryResourcemetaNodeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryResourcemetaNodeResponse
     */
    public function queryResourcemetaNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResourcemetaNodeResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resourcemeta.node.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询应用服务meta数据
     * Summary: 查询应用服务meta数据.
     *
     * @param QueryResourcemetaAppserviceRequest $request
     *
     * @return QueryResourcemetaAppserviceResponse
     */
    public function queryResourcemetaAppservice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResourcemetaAppserviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询应用服务meta数据
     * Summary: 查询应用服务meta数据.
     *
     * @param QueryResourcemetaAppserviceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryResourcemetaAppserviceResponse
     */
    public function queryResourcemetaAppserviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResourcemetaAppserviceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.resourcemeta.appservice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
     * Summary: 同步机器状态
     *
     * @param SyncComputerRequest $request
     *
     * @return SyncComputerResponse
     */
    public function syncComputer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncComputerEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
     * Summary: 同步机器状态
     *
     * @param SyncComputerRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return SyncComputerResponse
     */
    public function syncComputerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncComputerResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步LB状态
     * Summary: 同步LB状态
     *
     * @param SyncLoadbalanceRequest $request
     *
     * @return SyncLoadbalanceResponse
     */
    public function syncLoadbalance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncLoadbalanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步LB状态
     * Summary: 同步LB状态
     *
     * @param SyncLoadbalanceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SyncLoadbalanceResponse
     */
    public function syncLoadbalanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncLoadbalanceResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.loadbalance.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新机器基本信息
     * Summary: 更新机器基本信息.
     *
     * @param UpdateComputerInfoRequest $request
     *
     * @return UpdateComputerInfoResponse
     */
    public function updateComputerInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateComputerInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新机器基本信息
     * Summary: 更新机器基本信息.
     *
     * @param UpdateComputerInfoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateComputerInfoResponse
     */
    public function updateComputerInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateComputerInfoResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.info.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将机器分配给应用
     * Summary: 将机器分配给应用.
     *
     * @param SetComputerAssignRequest $request
     *
     * @return SetComputerAssignResponse
     */
    public function setComputerAssign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setComputerAssignEx($request, $headers, $runtime);
    }

    /**
     * Description: 将机器分配给应用
     * Summary: 将机器分配给应用.
     *
     * @param SetComputerAssignRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SetComputerAssignResponse
     */
    public function setComputerAssignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetComputerAssignResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.computer.assign.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 执行任务
     * Summary: 执行任务
     *
     * @param ExecRequestTaskRequest $request
     *
     * @return ExecRequestTaskResponse
     */
    public function execRequestTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execRequestTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 执行任务
     * Summary: 执行任务
     *
     * @param ExecRequestTaskRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecRequestTaskResponse
     */
    public function execRequestTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecRequestTaskResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.request.task.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重新初始化机器
     * Summary: 重新初始化机器.
     *
     * @param ReinitDiskRequest $request
     *
     * @return ReinitDiskResponse
     */
    public function reinitDisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reinitDiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 重新初始化机器
     * Summary: 重新初始化机器.
     *
     * @param ReinitDiskRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ReinitDiskResponse
     */
    public function reinitDiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReinitDiskResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.disk.reinit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改磁盘策略
     * Summary: 修改磁盘策略.
     *
     * @param UpdateDiskStrategyRequest $request
     *
     * @return UpdateDiskStrategyResponse
     */
    public function updateDiskStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDiskStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改磁盘策略
     * Summary: 修改磁盘策略.
     *
     * @param UpdateDiskStrategyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateDiskStrategyResponse
     */
    public function updateDiskStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDiskStrategyResponse::fromMap($this->doRequest('1.0', 'antcloud.cas.disk.strategy.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
