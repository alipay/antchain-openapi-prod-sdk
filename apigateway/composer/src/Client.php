<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\APIGATEWAY\Models\AddApigroupAuthuserRequest;
use AntChain\APIGATEWAY\Models\AddApigroupAuthuserResponse;
use AntChain\APIGATEWAY\Models\AllApiAuthappRequest;
use AntChain\APIGATEWAY\Models\AllApiAuthappResponse;
use AntChain\APIGATEWAY\Models\AllApiflowRequest;
use AntChain\APIGATEWAY\Models\AllApiflowResponse;
use AntChain\APIGATEWAY\Models\AllApigroupApiRequest;
use AntChain\APIGATEWAY\Models\AllApigroupApiResponse;
use AntChain\APIGATEWAY\Models\AllApigroupRequest;
use AntChain\APIGATEWAY\Models\AllApigroupResponse;
use AntChain\APIGATEWAY\Models\AllApimodelApiRequest;
use AntChain\APIGATEWAY\Models\AllApimodelApiResponse;
use AntChain\APIGATEWAY\Models\AllApimodelRequest;
use AntChain\APIGATEWAY\Models\AllApimodelResponse;
use AntChain\APIGATEWAY\Models\AllApiRequest;
use AntChain\APIGATEWAY\Models\AllApiResponse;
use AntChain\APIGATEWAY\Models\AllAppApiRequest;
use AntChain\APIGATEWAY\Models\AllAppApiResponse;
use AntChain\APIGATEWAY\Models\AllAppRequest;
use AntChain\APIGATEWAY\Models\AllAppResponse;
use AntChain\APIGATEWAY\Models\AllAuthappApiRequest;
use AntChain\APIGATEWAY\Models\AllAuthappApiResponse;
use AntChain\APIGATEWAY\Models\AllAuthappRequest;
use AntChain\APIGATEWAY\Models\AllAuthappResponse;
use AntChain\APIGATEWAY\Models\AllCorsApiRequest;
use AntChain\APIGATEWAY\Models\AllCorsApiResponse;
use AntChain\APIGATEWAY\Models\AllCorsRequest;
use AntChain\APIGATEWAY\Models\AllCorsResponse;
use AntChain\APIGATEWAY\Models\AllExternalauthRequest;
use AntChain\APIGATEWAY\Models\AllExternalauthResponse;
use AntChain\APIGATEWAY\Models\AllGwconfigRequest;
use AntChain\APIGATEWAY\Models\AllGwconfigResponse;
use AntChain\APIGATEWAY\Models\AllParammappingRequest;
use AntChain\APIGATEWAY\Models\AllParammappingResponse;
use AntChain\APIGATEWAY\Models\AllRegistryRequest;
use AntChain\APIGATEWAY\Models\AllRegistryResponse;
use AntChain\APIGATEWAY\Models\AllRegistrySysRequest;
use AntChain\APIGATEWAY\Models\AllRegistrySysResponse;
use AntChain\APIGATEWAY\Models\AllRouterApiRequest;
use AntChain\APIGATEWAY\Models\AllRouterApiResponse;
use AntChain\APIGATEWAY\Models\AllRouterRequest;
use AntChain\APIGATEWAY\Models\AllRouterResponse;
use AntChain\APIGATEWAY\Models\AllStrategyApiRequest;
use AntChain\APIGATEWAY\Models\AllStrategyApiResponse;
use AntChain\APIGATEWAY\Models\AllStrategyRequest;
use AntChain\APIGATEWAY\Models\AllStrategyResponse;
use AntChain\APIGATEWAY\Models\AllSysApiRequest;
use AntChain\APIGATEWAY\Models\AllSysApiResponse;
use AntChain\APIGATEWAY\Models\AllSysRequest;
use AntChain\APIGATEWAY\Models\AllSysResponse;
use AntChain\APIGATEWAY\Models\ApplyApimodelMgsRequest;
use AntChain\APIGATEWAY\Models\ApplyApimodelMgsResponse;
use AntChain\APIGATEWAY\Models\CheckApigroupDomainRequest;
use AntChain\APIGATEWAY\Models\CheckApigroupDomainResponse;
use AntChain\APIGATEWAY\Models\CheckApimodelParamRequest;
use AntChain\APIGATEWAY\Models\CheckApimodelParamResponse;
use AntChain\APIGATEWAY\Models\CheckApiRequest;
use AntChain\APIGATEWAY\Models\CheckApiResponse;
use AntChain\APIGATEWAY\Models\CheckGwconfigDeleteRequest;
use AntChain\APIGATEWAY\Models\CheckGwconfigDeleteResponse;
use AntChain\APIGATEWAY\Models\CheckGwconfigUpdateRequest;
use AntChain\APIGATEWAY\Models\CheckGwconfigUpdateResponse;
use AntChain\APIGATEWAY\Models\CheckSysUpdateRequest;
use AntChain\APIGATEWAY\Models\CheckSysUpdateResponse;
use AntChain\APIGATEWAY\Models\CreateApiflowRequest;
use AntChain\APIGATEWAY\Models\CreateApiflowResponse;
use AntChain\APIGATEWAY\Models\CreateApigroupRequest;
use AntChain\APIGATEWAY\Models\CreateApigroupResponse;
use AntChain\APIGATEWAY\Models\CreateApiGwconfigRequest;
use AntChain\APIGATEWAY\Models\CreateApiGwconfigResponse;
use AntChain\APIGATEWAY\Models\CreateApimodelParamRequest;
use AntChain\APIGATEWAY\Models\CreateApimodelParamResponse;
use AntChain\APIGATEWAY\Models\CreateApimodelRequest;
use AntChain\APIGATEWAY\Models\CreateApimodelResponse;
use AntChain\APIGATEWAY\Models\CreateApiRequest;
use AntChain\APIGATEWAY\Models\CreateApiResponse;
use AntChain\APIGATEWAY\Models\CreateAppRequest;
use AntChain\APIGATEWAY\Models\CreateAppResponse;
use AntChain\APIGATEWAY\Models\CreateAuthappRequest;
use AntChain\APIGATEWAY\Models\CreateAuthappResponse;
use AntChain\APIGATEWAY\Models\CreateContactRequest;
use AntChain\APIGATEWAY\Models\CreateContactResponse;
use AntChain\APIGATEWAY\Models\CreateCorsRequest;
use AntChain\APIGATEWAY\Models\CreateCorsResponse;
use AntChain\APIGATEWAY\Models\CreateExternalauthRequest;
use AntChain\APIGATEWAY\Models\CreateExternalauthResponse;
use AntChain\APIGATEWAY\Models\CreateGwconfigRequest;
use AntChain\APIGATEWAY\Models\CreateGwconfigResponse;
use AntChain\APIGATEWAY\Models\CreateLdcRequest;
use AntChain\APIGATEWAY\Models\CreateLdcResponse;
use AntChain\APIGATEWAY\Models\CreateParammappingRequest;
use AntChain\APIGATEWAY\Models\CreateParammappingResponse;
use AntChain\APIGATEWAY\Models\CreateRegistryRequest;
use AntChain\APIGATEWAY\Models\CreateRegistryResponse;
use AntChain\APIGATEWAY\Models\CreateRouterRequest;
use AntChain\APIGATEWAY\Models\CreateRouterResponse;
use AntChain\APIGATEWAY\Models\CreateStrategyRequest;
use AntChain\APIGATEWAY\Models\CreateStrategyResponse;
use AntChain\APIGATEWAY\Models\CreateSysRequest;
use AntChain\APIGATEWAY\Models\CreateSysResponse;
use AntChain\APIGATEWAY\Models\DeleteApiflowRequest;
use AntChain\APIGATEWAY\Models\DeleteApiflowResponse;
use AntChain\APIGATEWAY\Models\DeleteApigroupAuthuserRequest;
use AntChain\APIGATEWAY\Models\DeleteApigroupAuthuserResponse;
use AntChain\APIGATEWAY\Models\DeleteApigroupRequest;
use AntChain\APIGATEWAY\Models\DeleteApigroupResponse;
use AntChain\APIGATEWAY\Models\DeleteApimodelParamRequest;
use AntChain\APIGATEWAY\Models\DeleteApimodelParamResponse;
use AntChain\APIGATEWAY\Models\DeleteApimodelRequest;
use AntChain\APIGATEWAY\Models\DeleteApimodelResponse;
use AntChain\APIGATEWAY\Models\DeleteApiRequest;
use AntChain\APIGATEWAY\Models\DeleteApiResponse;
use AntChain\APIGATEWAY\Models\DeleteAppRequest;
use AntChain\APIGATEWAY\Models\DeleteAppResponse;
use AntChain\APIGATEWAY\Models\DeleteAuthappRequest;
use AntChain\APIGATEWAY\Models\DeleteAuthappResponse;
use AntChain\APIGATEWAY\Models\DeleteContactRequest;
use AntChain\APIGATEWAY\Models\DeleteContactResponse;
use AntChain\APIGATEWAY\Models\DeleteCorsRequest;
use AntChain\APIGATEWAY\Models\DeleteCorsResponse;
use AntChain\APIGATEWAY\Models\DeleteExternalauthRequest;
use AntChain\APIGATEWAY\Models\DeleteExternalauthResponse;
use AntChain\APIGATEWAY\Models\DeleteLdcRequest;
use AntChain\APIGATEWAY\Models\DeleteLdcResponse;
use AntChain\APIGATEWAY\Models\DeleteParammappingRequest;
use AntChain\APIGATEWAY\Models\DeleteParammappingResponse;
use AntChain\APIGATEWAY\Models\DeleteRegistryRequest;
use AntChain\APIGATEWAY\Models\DeleteRegistryResponse;
use AntChain\APIGATEWAY\Models\DeleteRouterRequest;
use AntChain\APIGATEWAY\Models\DeleteRouterResponse;
use AntChain\APIGATEWAY\Models\DeleteStrategyRequest;
use AntChain\APIGATEWAY\Models\DeleteStrategyResponse;
use AntChain\APIGATEWAY\Models\DeleteSysRequest;
use AntChain\APIGATEWAY\Models\DeleteSysResponse;
use AntChain\APIGATEWAY\Models\DownloadApimodelCodegenRequest;
use AntChain\APIGATEWAY\Models\DownloadApimodelCodegenResponse;
use AntChain\APIGATEWAY\Models\DownloadApiSwaggerRequest;
use AntChain\APIGATEWAY\Models\DownloadApiSwaggerResponse;
use AntChain\APIGATEWAY\Models\ExecApiflowRequest;
use AntChain\APIGATEWAY\Models\ExecApiflowResponse;
use AntChain\APIGATEWAY\Models\ExecTestHttpRequest;
use AntChain\APIGATEWAY\Models\ExecTestHttpResponse;
use AntChain\APIGATEWAY\Models\ExportApigroupApiRequest;
use AntChain\APIGATEWAY\Models\ExportApigroupApiResponse;
use AntChain\APIGATEWAY\Models\ExportApiRequest;
use AntChain\APIGATEWAY\Models\ExportApiResponse;
use AntChain\APIGATEWAY\Models\GetApiAuthapplimitRequest;
use AntChain\APIGATEWAY\Models\GetApiAuthapplimitResponse;
use AntChain\APIGATEWAY\Models\GetApiflowRequest;
use AntChain\APIGATEWAY\Models\GetApiflowResponse;
use AntChain\APIGATEWAY\Models\GetApigroupAuthuserconfigRequest;
use AntChain\APIGATEWAY\Models\GetApigroupAuthuserconfigResponse;
use AntChain\APIGATEWAY\Models\GetApigroupDomainRequest;
use AntChain\APIGATEWAY\Models\GetApigroupDomainResponse;
use AntChain\APIGATEWAY\Models\GetApigroupRequest;
use AntChain\APIGATEWAY\Models\GetApigroupResponse;
use AntChain\APIGATEWAY\Models\GetApiHistoryversionapiRequest;
use AntChain\APIGATEWAY\Models\GetApiHistoryversionapiResponse;
use AntChain\APIGATEWAY\Models\GetApimodelJsonRequest;
use AntChain\APIGATEWAY\Models\GetApimodelJsonResponse;
use AntChain\APIGATEWAY\Models\GetApimodelRequest;
use AntChain\APIGATEWAY\Models\GetApimodelResponse;
use AntChain\APIGATEWAY\Models\GetApiRequest;
use AntChain\APIGATEWAY\Models\GetApiResponse;
use AntChain\APIGATEWAY\Models\GetApiSwaggerRequest;
use AntChain\APIGATEWAY\Models\GetApiSwaggerResponse;
use AntChain\APIGATEWAY\Models\GetApiVersionapiRequest;
use AntChain\APIGATEWAY\Models\GetApiVersionapiResponse;
use AntChain\APIGATEWAY\Models\GetAppRequest;
use AntChain\APIGATEWAY\Models\GetAppResponse;
use AntChain\APIGATEWAY\Models\GetAuthappRequest;
use AntChain\APIGATEWAY\Models\GetAuthappResponse;
use AntChain\APIGATEWAY\Models\GetCommonRandomakskRequest;
use AntChain\APIGATEWAY\Models\GetCommonRandomakskResponse;
use AntChain\APIGATEWAY\Models\GetContactRequest;
use AntChain\APIGATEWAY\Models\GetContactResponse;
use AntChain\APIGATEWAY\Models\GetCorsRequest;
use AntChain\APIGATEWAY\Models\GetCorsResponse;
use AntChain\APIGATEWAY\Models\GetExternalauthRequest;
use AntChain\APIGATEWAY\Models\GetExternalauthResponse;
use AntChain\APIGATEWAY\Models\GetGwconfigGatewayswitchRequest;
use AntChain\APIGATEWAY\Models\GetGwconfigGatewayswitchResponse;
use AntChain\APIGATEWAY\Models\GetGwconfigRequest;
use AntChain\APIGATEWAY\Models\GetGwconfigResponse;
use AntChain\APIGATEWAY\Models\GetGwconfigTripleswitchRequest;
use AntChain\APIGATEWAY\Models\GetGwconfigTripleswitchResponse;
use AntChain\APIGATEWAY\Models\GetHomeRequest;
use AntChain\APIGATEWAY\Models\GetHomeResponse;
use AntChain\APIGATEWAY\Models\GetInstanceRequest;
use AntChain\APIGATEWAY\Models\GetInstanceResponse;
use AntChain\APIGATEWAY\Models\GetLdcRequest;
use AntChain\APIGATEWAY\Models\GetLdcResponse;
use AntChain\APIGATEWAY\Models\GetParammappingRequest;
use AntChain\APIGATEWAY\Models\GetParammappingResponse;
use AntChain\APIGATEWAY\Models\GetRegistryRequest;
use AntChain\APIGATEWAY\Models\GetRegistryResponse;
use AntChain\APIGATEWAY\Models\GetRouterRequest;
use AntChain\APIGATEWAY\Models\GetRouterResponse;
use AntChain\APIGATEWAY\Models\GetStrategyRequest;
use AntChain\APIGATEWAY\Models\GetStrategyResponse;
use AntChain\APIGATEWAY\Models\GetSysRequest;
use AntChain\APIGATEWAY\Models\GetSysResponse;
use AntChain\APIGATEWAY\Models\ImportApimodelRequest;
use AntChain\APIGATEWAY\Models\ImportApimodelResponse;
use AntChain\APIGATEWAY\Models\ImportApiRequest;
use AntChain\APIGATEWAY\Models\ImportApiResponse;
use AntChain\APIGATEWAY\Models\ListApiAuthappRequest;
use AntChain\APIGATEWAY\Models\ListApiAuthappResponse;
use AntChain\APIGATEWAY\Models\ListApiflowRequest;
use AntChain\APIGATEWAY\Models\ListApiflowResponse;
use AntChain\APIGATEWAY\Models\ListApigroupApiRequest;
use AntChain\APIGATEWAY\Models\ListApigroupApiResponse;
use AntChain\APIGATEWAY\Models\ListApigroupAuthuserRequest;
use AntChain\APIGATEWAY\Models\ListApigroupAuthuserResponse;
use AntChain\APIGATEWAY\Models\ListApigroupRequest;
use AntChain\APIGATEWAY\Models\ListApigroupResponse;
use AntChain\APIGATEWAY\Models\ListApimodelApiRequest;
use AntChain\APIGATEWAY\Models\ListApimodelApiResponse;
use AntChain\APIGATEWAY\Models\ListApimodelRequest;
use AntChain\APIGATEWAY\Models\ListApimodelResponse;
use AntChain\APIGATEWAY\Models\ListApiRequest;
use AntChain\APIGATEWAY\Models\ListApiResponse;
use AntChain\APIGATEWAY\Models\ListAppApiRequest;
use AntChain\APIGATEWAY\Models\ListAppApiResponse;
use AntChain\APIGATEWAY\Models\ListAppRequest;
use AntChain\APIGATEWAY\Models\ListAppResponse;
use AntChain\APIGATEWAY\Models\ListAuthappApiRequest;
use AntChain\APIGATEWAY\Models\ListAuthappApiResponse;
use AntChain\APIGATEWAY\Models\ListAuthappRequest;
use AntChain\APIGATEWAY\Models\ListAuthappResponse;
use AntChain\APIGATEWAY\Models\ListContactAuthappRequest;
use AntChain\APIGATEWAY\Models\ListContactAuthappResponse;
use AntChain\APIGATEWAY\Models\ListContactRequest;
use AntChain\APIGATEWAY\Models\ListContactResponse;
use AntChain\APIGATEWAY\Models\ListCorsApiRequest;
use AntChain\APIGATEWAY\Models\ListCorsApiResponse;
use AntChain\APIGATEWAY\Models\ListCorsRequest;
use AntChain\APIGATEWAY\Models\ListCorsResponse;
use AntChain\APIGATEWAY\Models\ListExternalauthApiRequest;
use AntChain\APIGATEWAY\Models\ListExternalauthApiResponse;
use AntChain\APIGATEWAY\Models\ListExternalauthRequest;
use AntChain\APIGATEWAY\Models\ListExternalauthResponse;
use AntChain\APIGATEWAY\Models\ListOperatorRequest;
use AntChain\APIGATEWAY\Models\ListOperatorResponse;
use AntChain\APIGATEWAY\Models\ListParammappingApiRequest;
use AntChain\APIGATEWAY\Models\ListParammappingApiResponse;
use AntChain\APIGATEWAY\Models\ListParammappingRequest;
use AntChain\APIGATEWAY\Models\ListParammappingResponse;
use AntChain\APIGATEWAY\Models\ListRegistryRequest;
use AntChain\APIGATEWAY\Models\ListRegistryResponse;
use AntChain\APIGATEWAY\Models\ListRegistrySysRequest;
use AntChain\APIGATEWAY\Models\ListRegistrySysResponse;
use AntChain\APIGATEWAY\Models\ListRouterApiRequest;
use AntChain\APIGATEWAY\Models\ListRouterApiResponse;
use AntChain\APIGATEWAY\Models\ListRouterRequest;
use AntChain\APIGATEWAY\Models\ListRouterResponse;
use AntChain\APIGATEWAY\Models\ListStrategyApiRequest;
use AntChain\APIGATEWAY\Models\ListStrategyApiResponse;
use AntChain\APIGATEWAY\Models\ListStrategyRequest;
use AntChain\APIGATEWAY\Models\ListStrategyResponse;
use AntChain\APIGATEWAY\Models\ListSysApiRequest;
use AntChain\APIGATEWAY\Models\ListSysApiResponse;
use AntChain\APIGATEWAY\Models\ListSysRequest;
use AntChain\APIGATEWAY\Models\ListSysResponse;
use AntChain\APIGATEWAY\Models\MountApiAuthappRequest;
use AntChain\APIGATEWAY\Models\MountApiAuthappResponse;
use AntChain\APIGATEWAY\Models\MountApigroupAuthuserRequest;
use AntChain\APIGATEWAY\Models\MountApigroupAuthuserResponse;
use AntChain\APIGATEWAY\Models\MountAuthappApiRequest;
use AntChain\APIGATEWAY\Models\MountAuthappApiResponse;
use AntChain\APIGATEWAY\Models\MountCorsApiRequest;
use AntChain\APIGATEWAY\Models\MountCorsApiResponse;
use AntChain\APIGATEWAY\Models\MountExternalauthApiRequest;
use AntChain\APIGATEWAY\Models\MountExternalauthApiResponse;
use AntChain\APIGATEWAY\Models\MountStrategyApiRequest;
use AntChain\APIGATEWAY\Models\MountStrategyApiResponse;
use AntChain\APIGATEWAY\Models\OfflineApiRequest;
use AntChain\APIGATEWAY\Models\OfflineApiResponse;
use AntChain\APIGATEWAY\Models\OnlineApiRequest;
use AntChain\APIGATEWAY\Models\OnlineApiResponse;
use AntChain\APIGATEWAY\Models\OnlineApiVersionRequest;
use AntChain\APIGATEWAY\Models\OnlineApiVersionResponse;
use AntChain\APIGATEWAY\Models\QueryGwconfigTripleswitchRequest;
use AntChain\APIGATEWAY\Models\QueryGwconfigTripleswitchResponse;
use AntChain\APIGATEWAY\Models\QueryMonitorRequest;
use AntChain\APIGATEWAY\Models\QueryMonitorResponse;
use AntChain\APIGATEWAY\Models\QueryResultcodeRequest;
use AntChain\APIGATEWAY\Models\QueryResultcodeResponse;
use AntChain\APIGATEWAY\Models\ReplaceApimodelJsonRequest;
use AntChain\APIGATEWAY\Models\ReplaceApimodelJsonResponse;
use AntChain\APIGATEWAY\Models\ResolveApimodelRequest;
use AntChain\APIGATEWAY\Models\ResolveApimodelResponse;
use AntChain\APIGATEWAY\Models\SaveLdcRequest;
use AntChain\APIGATEWAY\Models\SaveLdcResponse;
use AntChain\APIGATEWAY\Models\UnmountApiAuthappRequest;
use AntChain\APIGATEWAY\Models\UnmountApiAuthappResponse;
use AntChain\APIGATEWAY\Models\UnmountApigroupAuthuserRequest;
use AntChain\APIGATEWAY\Models\UnmountApigroupAuthuserResponse;
use AntChain\APIGATEWAY\Models\UnmountAuthappApiRequest;
use AntChain\APIGATEWAY\Models\UnmountAuthappApiResponse;
use AntChain\APIGATEWAY\Models\UnmountCorsApiRequest;
use AntChain\APIGATEWAY\Models\UnmountCorsApiResponse;
use AntChain\APIGATEWAY\Models\UnmountExternalauthApiRequest;
use AntChain\APIGATEWAY\Models\UnmountExternalauthApiResponse;
use AntChain\APIGATEWAY\Models\UnmountStrategyApiRequest;
use AntChain\APIGATEWAY\Models\UnmountStrategyApiResponse;
use AntChain\APIGATEWAY\Models\UpdateApiAuthapplimitRequest;
use AntChain\APIGATEWAY\Models\UpdateApiAuthapplimitResponse;
use AntChain\APIGATEWAY\Models\UpdateApiCacheinfoRequest;
use AntChain\APIGATEWAY\Models\UpdateApiCacheinfoResponse;
use AntChain\APIGATEWAY\Models\UpdateApiflowRequest;
use AntChain\APIGATEWAY\Models\UpdateApiflowResponse;
use AntChain\APIGATEWAY\Models\UpdateApigroupAuthuserconfigRequest;
use AntChain\APIGATEWAY\Models\UpdateApigroupAuthuserconfigResponse;
use AntChain\APIGATEWAY\Models\UpdateApigroupRequest;
use AntChain\APIGATEWAY\Models\UpdateApigroupResponse;
use AntChain\APIGATEWAY\Models\UpdateApiGwconfigRequest;
use AntChain\APIGATEWAY\Models\UpdateApiGwconfigResponse;
use AntChain\APIGATEWAY\Models\UpdateApiLimitconfigRequest;
use AntChain\APIGATEWAY\Models\UpdateApiLimitconfigResponse;
use AntChain\APIGATEWAY\Models\UpdateApimodelParamRequest;
use AntChain\APIGATEWAY\Models\UpdateApimodelParamResponse;
use AntChain\APIGATEWAY\Models\UpdateApimodelRequest;
use AntChain\APIGATEWAY\Models\UpdateApimodelResponse;
use AntChain\APIGATEWAY\Models\UpdateApiRequest;
use AntChain\APIGATEWAY\Models\UpdateApiResponse;
use AntChain\APIGATEWAY\Models\UpdateApiVersionnoRequest;
use AntChain\APIGATEWAY\Models\UpdateApiVersionnoResponse;
use AntChain\APIGATEWAY\Models\UpdateAppAuthapiRequest;
use AntChain\APIGATEWAY\Models\UpdateAppAuthapiResponse;
use AntChain\APIGATEWAY\Models\UpdateAppRequest;
use AntChain\APIGATEWAY\Models\UpdateAppResponse;
use AntChain\APIGATEWAY\Models\UpdateAuthappRequest;
use AntChain\APIGATEWAY\Models\UpdateAuthappResponse;
use AntChain\APIGATEWAY\Models\UpdateContactRequest;
use AntChain\APIGATEWAY\Models\UpdateContactResponse;
use AntChain\APIGATEWAY\Models\UpdateCorsRequest;
use AntChain\APIGATEWAY\Models\UpdateCorsResponse;
use AntChain\APIGATEWAY\Models\UpdateExternalauthRequest;
use AntChain\APIGATEWAY\Models\UpdateExternalauthResponse;
use AntChain\APIGATEWAY\Models\UpdateGwconfigRequest;
use AntChain\APIGATEWAY\Models\UpdateGwconfigResponse;
use AntChain\APIGATEWAY\Models\UpdateLdcRequest;
use AntChain\APIGATEWAY\Models\UpdateLdcResponse;
use AntChain\APIGATEWAY\Models\UpdateParammappingRequest;
use AntChain\APIGATEWAY\Models\UpdateParammappingResponse;
use AntChain\APIGATEWAY\Models\UpdateRegistryRequest;
use AntChain\APIGATEWAY\Models\UpdateRegistryResponse;
use AntChain\APIGATEWAY\Models\UpdateRouterRequest;
use AntChain\APIGATEWAY\Models\UpdateRouterResponse;
use AntChain\APIGATEWAY\Models\UpdateStrategyRequest;
use AntChain\APIGATEWAY\Models\UpdateStrategyResponse;
use AntChain\APIGATEWAY\Models\UpdateSysRequest;
use AntChain\APIGATEWAY\Models\UpdateSysResponse;
use AntChain\APIGATEWAY\Models\VerifyApiApigroupRequest;
use AntChain\APIGATEWAY\Models\VerifyApiApigroupResponse;
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
            // 注册中心详情
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
                    'sdk_version'      => '1.1.309',
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
     * Description: 创建API分组
     * Summary: 创建API分组.
     *
     * @param CreateApigroupRequest $request
     *
     * @return CreateApigroupResponse
     */
    public function createApigroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApigroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建API分组
     * Summary: 创建API分组.
     *
     * @param CreateApigroupRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateApigroupResponse
     */
    public function createApigroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApigroupResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询API分组列表
     * Summary: 查询API分组列表.
     *
     * @param AllApigroupRequest $request
     *
     * @return AllApigroupResponse
     */
    public function allApigroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allApigroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询API分组列表
     * Summary: 查询API分组列表.
     *
     * @param AllApigroupRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AllApigroupResponse
     */
    public function allApigroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllApigroupResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询API分组分页列表
     * Summary: 查询API分组分页列表.
     *
     * @param ListApigroupRequest $request
     *
     * @return ListApigroupResponse
     */
    public function listApigroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApigroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询API分组分页列表
     * Summary: 查询API分组分页列表.
     *
     * @param ListApigroupRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListApigroupResponse
     */
    public function listApigroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApigroupResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建后端集群
     * Summary: 创建后端集群.
     *
     * @param CreateSysRequest $request
     *
     * @return CreateSysResponse
     */
    public function createSys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSysEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建后端集群
     * Summary: 创建后端集群.
     *
     * @param CreateSysRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return CreateSysResponse
     */
    public function createSysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSysResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.sys.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询后端集群列表
     * Summary: 查询后端集群列表.
     *
     * @param AllSysRequest $request
     *
     * @return AllSysResponse
     */
    public function allSys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allSysEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询后端集群列表
     * Summary: 查询后端集群列表.
     *
     * @param AllSysRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return AllSysResponse
     */
    public function allSysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllSysResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.sys.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询后端集群分页列表
     * Summary: 查询后端集群分页列表.
     *
     * @param ListSysRequest $request
     *
     * @return ListSysResponse
     */
    public function listSys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSysEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询后端集群分页列表
     * Summary: 查询后端集群分页列表.
     *
     * @param ListSysRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return ListSysResponse
     */
    public function listSysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSysResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.sys.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询API分组
     * Summary: 通过ID查询API分组.
     *
     * @param GetApigroupRequest $request
     *
     * @return GetApigroupResponse
     */
    public function getApigroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApigroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询API分组
     * Summary: 通过ID查询API分组.
     *
     * @param GetApigroupRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetApigroupResponse
     */
    public function getApigroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApigroupResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新API分组
     * Summary: 更新API分组.
     *
     * @param UpdateApigroupRequest $request
     *
     * @return UpdateApigroupResponse
     */
    public function updateApigroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApigroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新API分组
     * Summary: 更新API分组.
     *
     * @param UpdateApigroupRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateApigroupResponse
     */
    public function updateApigroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApigroupResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除API分组
     * Summary: 删除API分组.
     *
     * @param DeleteApigroupRequest $request
     *
     * @return DeleteApigroupResponse
     */
    public function deleteApigroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteApigroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除API分组
     * Summary: 删除API分组.
     *
     * @param DeleteApigroupRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteApigroupResponse
     */
    public function deleteApigroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteApigroupResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建API信息
     * Summary: 创建API信息.
     *
     * @param CreateApiRequest $request
     *
     * @return CreateApiResponse
     */
    public function createApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建API信息
     * Summary: 创建API信息.
     *
     * @param CreateApiRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return CreateApiResponse
     */
    public function createApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新API信息
     * Summary: 更新API信息.
     *
     * @param UpdateApiRequest $request
     *
     * @return UpdateApiResponse
     */
    public function updateApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新API信息
     * Summary: 更新API信息.
     *
     * @param UpdateApiRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return UpdateApiResponse
     */
    public function updateApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询API列表
     * Summary: 查询API列表.
     *
     * @param AllApiRequest $request
     *
     * @return AllApiResponse
     */
    public function allApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询API列表
     * Summary: 查询API列表.
     *
     * @param AllApiRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return AllApiResponse
     */
    public function allApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询API分页列表
     * Summary: 查询API分页列表.
     *
     * @param ListApiRequest $request
     *
     * @return ListApiResponse
     */
    public function listApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询API分页列表
     * Summary: 查询API分页列表.
     *
     * @param ListApiRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return ListApiResponse
     */
    public function listApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询API
     * Summary: 通过ID查询API.
     *
     * @param GetApiRequest $request
     *
     * @return GetApiResponse
     */
    public function getApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询API
     * Summary: 通过ID查询API.
     *
     * @param GetApiRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetApiResponse
     */
    public function getApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建App
     * Summary: 创建App.
     *
     * @param CreateAppRequest $request
     *
     * @return CreateAppResponse
     */
    public function createApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建App
     * Summary: 创建App.
     *
     * @param CreateAppRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return CreateAppResponse
     */
    public function createAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAppResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.app.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新App信息
     * Summary: 更新App信息.
     *
     * @param UpdateAppRequest $request
     *
     * @return UpdateAppResponse
     */
    public function updateApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新App信息
     * Summary: 更新App信息.
     *
     * @param UpdateAppRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return UpdateAppResponse
     */
    public function updateAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAppResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.app.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询App列表
     * Summary: 查询App列表.
     *
     * @param AllAppRequest $request
     *
     * @return AllAppResponse
     */
    public function allApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询App列表
     * Summary: 查询App列表.
     *
     * @param AllAppRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return AllAppResponse
     */
    public function allAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllAppResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.app.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询App分页列表
     * Summary: 查询App分页列表.
     *
     * @param ListAppRequest $request
     *
     * @return ListAppResponse
     */
    public function listApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询App分页列表
     * Summary: 查询App分页列表.
     *
     * @param ListAppRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return ListAppResponse
     */
    public function listAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.app.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询App
     * Summary: 通过ID查询App.
     *
     * @param GetAppRequest $request
     *
     * @return GetAppResponse
     */
    public function getApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询App
     * Summary: 通过ID查询App.
     *
     * @param GetAppRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetAppResponse
     */
    public function getAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAppResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.app.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建授权App
     * Summary: 创建授权App.
     *
     * @param CreateAuthappRequest $request
     *
     * @return CreateAuthappResponse
     */
    public function createAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建授权App
     * Summary: 创建授权App.
     *
     * @param CreateAuthappRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateAuthappResponse
     */
    public function createAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新授权App
     * Summary: 更新授权App.
     *
     * @param UpdateAuthappRequest $request
     *
     * @return UpdateAuthappResponse
     */
    public function updateAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新授权App
     * Summary: 更新授权App.
     *
     * @param UpdateAuthappRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateAuthappResponse
     */
    public function updateAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除授权App
     * Summary: 删除授权App.
     *
     * @param DeleteAuthappRequest $request
     *
     * @return DeleteAuthappResponse
     */
    public function deleteAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除授权App
     * Summary: 删除授权App.
     *
     * @param DeleteAuthappRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DeleteAuthappResponse
     */
    public function deleteAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询授权App列表
     * Summary: 查询授权App列表.
     *
     * @param AllAuthappRequest $request
     *
     * @return AllAuthappResponse
     */
    public function allAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询授权App列表
     * Summary: 查询授权App列表.
     *
     * @param AllAuthappRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AllAuthappResponse
     */
    public function allAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询获取授权App分页列表
     * Summary: 查询授权App分页列表.
     *
     * @param ListAuthappRequest $request
     *
     * @return ListAuthappResponse
     */
    public function listAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询获取授权App分页列表
     * Summary: 查询授权App分页列表.
     *
     * @param ListAuthappRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ListAuthappResponse
     */
    public function listAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询授权App
     * Summary: 通过ID查询授权App.
     *
     * @param GetAuthappRequest $request
     *
     * @return GetAuthappResponse
     */
    public function getAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询授权App
     * Summary: 通过ID查询授权App.
     *
     * @param GetAuthappRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetAuthappResponse
     */
    public function getAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建路由规则
     * Summary: 创建路由规则.
     *
     * @param CreateRouterRequest $request
     *
     * @return CreateRouterResponse
     */
    public function createRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建路由规则
     * Summary: 创建路由规则.
     *
     * @param CreateRouterRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateRouterResponse
     */
    public function createRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRouterResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.router.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新路由规则
     * Summary: 更新路由规则.
     *
     * @param UpdateRouterRequest $request
     *
     * @return UpdateRouterResponse
     */
    public function updateRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新路由规则
     * Summary: 更新路由规则.
     *
     * @param UpdateRouterRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return UpdateRouterResponse
     */
    public function updateRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRouterResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.router.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID删除路由规则
     * Summary: 通过ID删除路由规则.
     *
     * @param DeleteRouterRequest $request
     *
     * @return DeleteRouterResponse
     */
    public function deleteRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID删除路由规则
     * Summary: 通过ID删除路由规则.
     *
     * @param DeleteRouterRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return DeleteRouterResponse
     */
    public function deleteRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteRouterResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.router.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询路由信息列表
     * Summary: 查询路由信息列表.
     *
     * @param AllRouterRequest $request
     *
     * @return AllRouterResponse
     */
    public function allRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询路由信息列表
     * Summary: 查询路由信息列表.
     *
     * @param AllRouterRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return AllRouterResponse
     */
    public function allRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllRouterResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.router.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询路由规则分页列表
     * Summary: 查询路由规则分页列表.
     *
     * @param ListRouterRequest $request
     *
     * @return ListRouterResponse
     */
    public function listRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询路由规则分页列表
     * Summary: 查询路由规则分页列表.
     *
     * @param ListRouterRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListRouterResponse
     */
    public function listRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRouterResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.router.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询路由规则
     * Summary: 通过ID查询路由规则.
     *
     * @param GetRouterRequest $request
     *
     * @return GetRouterResponse
     */
    public function getRouter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRouterEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询路由规则
     * Summary: 通过ID查询路由规则.
     *
     * @param GetRouterRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return GetRouterResponse
     */
    public function getRouterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRouterResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.router.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新后端集群
     * Summary: 更新后端集群.
     *
     * @param UpdateSysRequest $request
     *
     * @return UpdateSysResponse
     */
    public function updateSys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateSysEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新后端集群
     * Summary: 更新后端集群.
     *
     * @param UpdateSysRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return UpdateSysResponse
     */
    public function updateSysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateSysResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.sys.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID删除后端集群
     * Summary: 通过ID删除后端集群.
     *
     * @param DeleteSysRequest $request
     *
     * @return DeleteSysResponse
     */
    public function deleteSys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteSysEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID删除后端集群
     * Summary: 通过ID删除后端集群.
     *
     * @param DeleteSysRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return DeleteSysResponse
     */
    public function deleteSysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteSysResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.sys.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询后端集群
     * Summary: 通过ID查询后端集群.
     *
     * @param GetSysRequest $request
     *
     * @return GetSysResponse
     */
    public function getSys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSysEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询后端集群
     * Summary: 通过ID查询后端集群.
     *
     * @param GetSysRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetSysResponse
     */
    public function getSysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSysResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.sys.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过API分组ID查询API列表
     * Summary: 通过API分组ID查询API列表.
     *
     * @param AllApigroupApiRequest $request
     *
     * @return AllApigroupApiResponse
     */
    public function allApigroupApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allApigroupApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过API分组ID查询API列表
     * Summary: 通过API分组ID查询API列表.
     *
     * @param AllApigroupApiRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AllApigroupApiResponse
     */
    public function allApigroupApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllApigroupApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.api.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID删除App
     * Summary: 通过ID删除App.
     *
     * @param DeleteAppRequest $request
     *
     * @return DeleteAppResponse
     */
    public function deleteApp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAppEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID删除App
     * Summary: 通过ID删除App.
     *
     * @param DeleteAppRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return DeleteAppResponse
     */
    public function deleteAppEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAppResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.app.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID删除API
     * Summary: 通过ID删除API.
     *
     * @param DeleteApiRequest $request
     *
     * @return DeleteApiResponse
     */
    public function deleteApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID删除API
     * Summary: 通过ID删除API.
     *
     * @param DeleteApiRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return DeleteApiResponse
     */
    public function deleteApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过API分组ID查询API分页列表
     * Summary: 通过API分组ID查询API分页列表.
     *
     * @param ListApigroupApiRequest $request
     *
     * @return ListApigroupApiResponse
     */
    public function listApigroupApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApigroupApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过API分组ID查询API分页列表
     * Summary: 通过API分组ID查询API分页列表.
     *
     * @param ListApigroupApiRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListApigroupApiResponse
     */
    public function listApigroupApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApigroupApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过授权App ID查询API分页列表
     * Summary: 通过授权App ID查询API分页列表.
     *
     * @param ListAuthappApiRequest $request
     *
     * @return ListAuthappApiResponse
     */
    public function listAuthappApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAuthappApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过授权App ID查询API分页列表
     * Summary: 通过授权App ID查询API分页列表.
     *
     * @param ListAuthappApiRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListAuthappApiResponse
     */
    public function listAuthappApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAuthappApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过后端集群ID查询API列表
     * Summary: 通过后端集群ID查询API列表.
     *
     * @param AllSysApiRequest $request
     *
     * @return AllSysApiResponse
     */
    public function allSysApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allSysApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过后端集群ID查询API列表
     * Summary: 通过后端集群ID查询API列表.
     *
     * @param AllSysApiRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return AllSysApiResponse
     */
    public function allSysApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllSysApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.sys.api.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过后端集群ID查询API分页列表
     * Summary: 通过后端集群ID查询API分页列表.
     *
     * @param ListSysApiRequest $request
     *
     * @return ListSysApiResponse
     */
    public function listSysApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listSysApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过后端集群ID查询API分页列表
     * Summary: 通过后端集群ID查询API分页列表.
     *
     * @param ListSysApiRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListSysApiResponse
     */
    public function listSysApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListSysApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.sys.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过路由规则ID查询API列表
     * Summary: 通过路由规则ID查询API列表.
     *
     * @param AllRouterApiRequest $request
     *
     * @return AllRouterApiResponse
     */
    public function allRouterApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allRouterApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过路由规则ID查询API列表
     * Summary: 通过路由规则ID查询API列表.
     *
     * @param AllRouterApiRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AllRouterApiResponse
     */
    public function allRouterApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllRouterApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.router.api.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过路由规则ID查询API分页列表
     * Summary: 通过路由规则ID查询API分页列表.
     *
     * @param ListRouterApiRequest $request
     *
     * @return ListRouterApiResponse
     */
    public function listRouterApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRouterApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过路由规则ID查询API分页列表
     * Summary: 通过路由规则ID查询API分页列表.
     *
     * @param ListRouterApiRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ListRouterApiResponse
     */
    public function listRouterApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRouterApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.router.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新API版本号
     * Summary: 更新API版本号.
     *
     * @param UpdateApiVersionnoRequest $request
     *
     * @return UpdateApiVersionnoResponse
     */
    public function updateApiVersionno($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApiVersionnoEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新API版本号
     * Summary: 更新API版本号.
     *
     * @param UpdateApiVersionnoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateApiVersionnoResponse
     */
    public function updateApiVersionnoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApiVersionnoResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.versionno.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 下线API
     * Summary: 下线API.
     *
     * @param OfflineApiRequest $request
     *
     * @return OfflineApiResponse
     */
    public function offlineApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 下线API
     * Summary: 下线API.
     *
     * @param OfflineApiRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return OfflineApiResponse
     */
    public function offlineApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过授权App ID查询API列表
     * Summary: 通过授权App ID查询API列表.
     *
     * @param AllAuthappApiRequest $request
     *
     * @return AllAuthappApiResponse
     */
    public function allAuthappApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allAuthappApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过授权App ID查询API列表
     * Summary: 通过授权App ID查询API列表.
     *
     * @param AllAuthappApiRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AllAuthappApiResponse
     */
    public function allAuthappApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllAuthappApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.api.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api挂载授权App
     * Summary: api挂载授权App.
     *
     * @param MountApiAuthappRequest $request
     *
     * @return MountApiAuthappResponse
     */
    public function mountApiAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->mountApiAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: api挂载授权App
     * Summary: api挂载授权App.
     *
     * @param MountApiAuthappRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return MountApiAuthappResponse
     */
    public function mountApiAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MountApiAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.authapp.mount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上线API
     * Summary: 上线API.
     *
     * @param OnlineApiRequest $request
     *
     * @return OnlineApiResponse
     */
    public function onlineApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->onlineApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 上线API
     * Summary: 上线API.
     *
     * @param OnlineApiRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return OnlineApiResponse
     */
    public function onlineApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OnlineApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.online', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过API ID查询授权App列表
     * Summary: 通过API ID查询授权App列表.
     *
     * @param AllApiAuthappRequest $request
     *
     * @return AllApiAuthappResponse
     */
    public function allApiAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allApiAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过API ID查询授权App列表
     * Summary: 通过API ID查询授权App列表.
     *
     * @param AllApiAuthappRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AllApiAuthappResponse
     */
    public function allApiAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllApiAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.authapp.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过API ID查询授权App分页列表
     * Summary: 通过API ID查询授权App分页列表.
     *
     * @param ListApiAuthappRequest $request
     *
     * @return ListApiAuthappResponse
     */
    public function listApiAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApiAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过API ID查询授权App分页列表
     * Summary: 通过API ID查询授权App分页列表.
     *
     * @param ListApiAuthappRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListApiAuthappResponse
     */
    public function listApiAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApiAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.authapp.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过App ID查询API列表
     * Summary: 通过App ID查询API列表.
     *
     * @param AllAppApiRequest $request
     *
     * @return AllAppApiResponse
     */
    public function allAppApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allAppApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过App ID查询API列表
     * Summary: 通过App ID查询API列表.
     *
     * @param AllAppApiRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return AllAppApiResponse
     */
    public function allAppApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllAppApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.app.api.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过App ID查询API分页列表
     * Summary: 通过App ID查询API分页列表.
     *
     * @param ListAppApiRequest $request
     *
     * @return ListAppApiResponse
     */
    public function listAppApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过App ID查询API分页列表
     * Summary: 通过App ID查询API分页列表.
     *
     * @param ListAppApiRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListAppApiResponse
     */
    public function listAppApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.app.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取随机密钥
     * Summary: 获取随机密钥.
     *
     * @param GetCommonRandomakskRequest $request
     *
     * @return GetCommonRandomakskResponse
     */
    public function getCommonRandomaksk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCommonRandomakskEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取随机密钥
     * Summary: 获取随机密钥.
     *
     * @param GetCommonRandomakskRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetCommonRandomakskResponse
     */
    public function getCommonRandomakskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCommonRandomakskResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.common.randomaksk.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建联系方式
     * Summary: 创建联系方式.
     *
     * @param CreateContactRequest $request
     *
     * @return CreateContactResponse
     */
    public function createContact($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createContactEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建联系方式
     * Summary: 创建联系方式.
     *
     * @param CreateContactRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateContactResponse
     */
    public function createContactEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateContactResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.contact.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新联系方式
     * Summary: 更新联系方式.
     *
     * @param UpdateContactRequest $request
     *
     * @return UpdateContactResponse
     */
    public function updateContact($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateContactEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新联系方式
     * Summary: 更新联系方式.
     *
     * @param UpdateContactRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateContactResponse
     */
    public function updateContactEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateContactResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.contact.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除联系方式
     * Summary: 删除联系方式.
     *
     * @param DeleteContactRequest $request
     *
     * @return DeleteContactResponse
     */
    public function deleteContact($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteContactEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除联系方式
     * Summary: 删除联系方式.
     *
     * @param DeleteContactRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DeleteContactResponse
     */
    public function deleteContactEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteContactResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.contact.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询联系方式
     * Summary: 通过ID查询联系方式.
     *
     * @param GetContactRequest $request
     *
     * @return GetContactResponse
     */
    public function getContact($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContactEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询联系方式
     * Summary: 通过ID查询联系方式.
     *
     * @param GetContactRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetContactResponse
     */
    public function getContactEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContactResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.contact.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询联系方式分页列表
     * Summary: 查询联系方式分页列表.
     *
     * @param ListContactRequest $request
     *
     * @return ListContactResponse
     */
    public function listContact($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listContactEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询联系方式分页列表
     * Summary: 查询联系方式分页列表.
     *
     * @param ListContactRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ListContactResponse
     */
    public function listContactEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListContactResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.contact.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过授权App ID查询联系方式列表
     * Summary: 通过授权App ID查询联系方式列表.
     *
     * @param ListContactAuthappRequest $request
     *
     * @return ListContactAuthappResponse
     */
    public function listContactAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listContactAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过授权App ID查询联系方式列表
     * Summary: 通过授权App ID查询联系方式列表.
     *
     * @param ListContactAuthappRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListContactAuthappResponse
     */
    public function listContactAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListContactAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.contact.authapp.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api解除授权App
     * Summary: api解除授权App.
     *
     * @param UnmountApiAuthappRequest $request
     *
     * @return UnmountApiAuthappResponse
     */
    public function unmountApiAuthapp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unmountApiAuthappEx($request, $headers, $runtime);
    }

    /**
     * Description: api解除授权App
     * Summary: api解除授权App.
     *
     * @param UnmountApiAuthappRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UnmountApiAuthappResponse
     */
    public function unmountApiAuthappEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnmountApiAuthappResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.authapp.unmount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取指定版本的api
     * Summary: 获取指定版本的api.
     *
     * @param GetApiVersionapiRequest $request
     *
     * @return GetApiVersionapiResponse
     */
    public function getApiVersionapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApiVersionapiEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取指定版本的api
     * Summary: 获取指定版本的api.
     *
     * @param GetApiVersionapiRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetApiVersionapiResponse
     */
    public function getApiVersionapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApiVersionapiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.versionapi.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建cors
     * Summary: 创建cors.
     *
     * @param CreateCorsRequest $request
     *
     * @return CreateCorsResponse
     */
    public function createCors($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建cors
     * Summary: 创建cors.
     *
     * @param CreateCorsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateCorsResponse
     */
    public function createCorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCorsResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 编辑cors
     * Summary: 编辑cors.
     *
     * @param UpdateCorsRequest $request
     *
     * @return UpdateCorsResponse
     */
    public function updateCors($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 编辑cors
     * Summary: 编辑cors.
     *
     * @param UpdateCorsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return UpdateCorsResponse
     */
    public function updateCorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCorsResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除cors
     * Summary: 删除cors.
     *
     * @param DeleteCorsRequest $request
     *
     * @return DeleteCorsResponse
     */
    public function deleteCors($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteCorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除cors
     * Summary: 删除cors.
     *
     * @param DeleteCorsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return DeleteCorsResponse
     */
    public function deleteCorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteCorsResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询cors列表
     * Summary: 查询cors列表.
     *
     * @param AllCorsRequest $request
     *
     * @return AllCorsResponse
     */
    public function allCors($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allCorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询cors列表
     * Summary: 查询cors列表.
     *
     * @param AllCorsRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return AllCorsResponse
     */
    public function allCorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllCorsResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询cors分页列表
     * Summary: 查询cors分页列表.
     *
     * @param ListCorsRequest $request
     *
     * @return ListCorsResponse
     */
    public function listCors($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询cors分页列表
     * Summary: 查询cors分页列表.
     *
     * @param ListCorsRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return ListCorsResponse
     */
    public function listCorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCorsResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据ID查询cors
     * Summary: 根据ID查询cors.
     *
     * @param GetCorsRequest $request
     *
     * @return GetCorsResponse
     */
    public function getCors($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据ID查询cors
     * Summary: 根据ID查询cors.
     *
     * @param GetCorsRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetCorsResponse
     */
    public function getCorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCorsResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据 cors ID 查询 API 列表
     * Summary: 根据 cors ID 查询 API 列表.
     *
     * @param AllCorsApiRequest $request
     *
     * @return AllCorsApiResponse
     */
    public function allCorsApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allCorsApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据 cors ID 查询 API 列表
     * Summary: 根据 cors ID 查询 API 列表.
     *
     * @param AllCorsApiRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AllCorsApiResponse
     */
    public function allCorsApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllCorsApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.api.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据cors ID查询API分页列表
     * Summary: 根据cors ID查询API分页列表.
     *
     * @param ListCorsApiRequest $request
     *
     * @return ListCorsApiResponse
     */
    public function listCorsApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCorsApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据cors ID查询API分页列表
     * Summary: 根据cors ID查询API分页列表.
     *
     * @param ListCorsApiRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ListCorsApiResponse
     */
    public function listCorsApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCorsApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据cors ID绑定API
     * Summary: 根据cors ID绑定API.
     *
     * @param MountCorsApiRequest $request
     *
     * @return MountCorsApiResponse
     */
    public function mountCorsApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->mountCorsApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据cors ID绑定API
     * Summary: 根据cors ID绑定API.
     *
     * @param MountCorsApiRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return MountCorsApiResponse
     */
    public function mountCorsApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MountCorsApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.api.mount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据cors ID 解绑API
     * Summary: 根据cors ID 解绑API.
     *
     * @param UnmountCorsApiRequest $request
     *
     * @return UnmountCorsApiResponse
     */
    public function unmountCorsApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unmountCorsApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据cors ID 解绑API
     * Summary: 根据cors ID 解绑API.
     *
     * @param UnmountCorsApiRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UnmountCorsApiResponse
     */
    public function unmountCorsApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnmountCorsApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.cors.api.unmount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: API调试
     * Summary: API调试.
     *
     * @param ExecTestHttpRequest $request
     *
     * @return ExecTestHttpResponse
     */
    public function execTestHttp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execTestHttpEx($request, $headers, $runtime);
    }

    /**
     * Description: API调试
     * Summary: API调试.
     *
     * @param ExecTestHttpRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ExecTestHttpResponse
     */
    public function execTestHttpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecTestHttpResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.test.http.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新授权应用限流
     * Summary: 更新授权应用限流
     *
     * @param UpdateApiAuthapplimitRequest $request
     *
     * @return UpdateApiAuthapplimitResponse
     */
    public function updateApiAuthapplimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApiAuthapplimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新授权应用限流
     * Summary: 更新授权应用限流
     *
     * @param UpdateApiAuthapplimitRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateApiAuthapplimitResponse
     */
    public function updateApiAuthapplimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApiAuthapplimitResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.authapplimit.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询授权应用限制
     * Summary: 查询授权应用限制.
     *
     * @param GetApiAuthapplimitRequest $request
     *
     * @return GetApiAuthapplimitResponse
     */
    public function getApiAuthapplimit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApiAuthapplimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询授权应用限制
     * Summary: 查询授权应用限制.
     *
     * @param GetApiAuthapplimitRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetApiAuthapplimitResponse
     */
    public function getApiAuthapplimitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApiAuthapplimitResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.authapplimit.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 编辑限流配置
     * Summary: 编辑限流配置.
     *
     * @param UpdateApiLimitconfigRequest $request
     *
     * @return UpdateApiLimitconfigResponse
     */
    public function updateApiLimitconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApiLimitconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 编辑限流配置
     * Summary: 编辑限流配置.
     *
     * @param UpdateApiLimitconfigRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateApiLimitconfigResponse
     */
    public function updateApiLimitconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApiLimitconfigResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.limitconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新缓存信息
     * Summary: 更新缓存信息.
     *
     * @param UpdateApiCacheinfoRequest $request
     *
     * @return UpdateApiCacheinfoResponse
     */
    public function updateApiCacheinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApiCacheinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新缓存信息
     * Summary: 更新缓存信息.
     *
     * @param UpdateApiCacheinfoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateApiCacheinfoResponse
     */
    public function updateApiCacheinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApiCacheinfoResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.cacheinfo.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询监控
     * Summary: 查询监控.
     *
     * @param QueryMonitorRequest $request
     *
     * @return QueryMonitorResponse
     */
    public function queryMonitor($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMonitorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询监控
     * Summary: 查询监控.
     *
     * @param QueryMonitorRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryMonitorResponse
     */
    public function queryMonitorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMonitorResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.monitor.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询结果码
     * Summary: 查询结果码
     *
     * @param QueryResultcodeRequest $request
     *
     * @return QueryResultcodeResponse
     */
    public function queryResultcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResultcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询结果码
     * Summary: 查询结果码
     *
     * @param QueryResultcodeRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryResultcodeResponse
     */
    public function queryResultcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResultcodeResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.resultcode.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上线指定版本api
     * Summary: 上线指定版本api.
     *
     * @param OnlineApiVersionRequest $request
     *
     * @return OnlineApiVersionResponse
     */
    public function onlineApiVersion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->onlineApiVersionEx($request, $headers, $runtime);
    }

    /**
     * Description: 上线指定版本api
     * Summary: 上线指定版本api.
     *
     * @param OnlineApiVersionRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return OnlineApiVersionResponse
     */
    public function onlineApiVersionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OnlineApiVersionResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.version.online', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建LDC规则
     * Summary: 创建LDC规则.
     *
     * @param CreateLdcRequest $request
     *
     * @return CreateLdcResponse
     */
    public function createLdc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLdcEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建LDC规则
     * Summary: 创建LDC规则.
     *
     * @param CreateLdcRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return CreateLdcResponse
     */
    public function createLdcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLdcResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.ldc.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改 LDC规则
     * Summary: 修改 LDC规则.
     *
     * @param UpdateLdcRequest $request
     *
     * @return UpdateLdcResponse
     */
    public function updateLdc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateLdcEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改 LDC规则
     * Summary: 修改 LDC规则.
     *
     * @param UpdateLdcRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return UpdateLdcResponse
     */
    public function updateLdcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateLdcResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.ldc.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除LDC规则
     * Summary: 删除LDC规则.
     *
     * @param DeleteLdcRequest $request
     *
     * @return DeleteLdcResponse
     */
    public function deleteLdc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteLdcEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除LDC规则
     * Summary: 删除LDC规则.
     *
     * @param DeleteLdcRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return DeleteLdcResponse
     */
    public function deleteLdcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteLdcResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.ldc.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询ldc规则
     * Summary: 查询ldc规则.
     *
     * @param GetLdcRequest $request
     *
     * @return GetLdcResponse
     */
    public function getLdc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLdcEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询ldc规则
     * Summary: 查询ldc规则.
     *
     * @param GetLdcRequest  $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetLdcResponse
     */
    public function getLdcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLdcResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.ldc.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保存ldc规则
     * Summary: 保存ldc规则.
     *
     * @param SaveLdcRequest $request
     *
     * @return SaveLdcResponse
     */
    public function saveLdc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveLdcEx($request, $headers, $runtime);
    }

    /**
     * Description: 保存ldc规则
     * Summary: 保存ldc规则.
     *
     * @param SaveLdcRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return SaveLdcResponse
     */
    public function saveLdcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveLdcResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.ldc.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权APP绑定API
     * Summary: 授权APP绑定API.
     *
     * @param MountAuthappApiRequest $request
     *
     * @return MountAuthappApiResponse
     */
    public function mountAuthappApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->mountAuthappApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权APP绑定API
     * Summary: 授权APP绑定API.
     *
     * @param MountAuthappApiRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return MountAuthappApiResponse
     */
    public function mountAuthappApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MountAuthappApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.api.mount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权app解除绑定Api
     * Summary: 授权app解除绑定Api.
     *
     * @param UnmountAuthappApiRequest $request
     *
     * @return UnmountAuthappApiResponse
     */
    public function unmountAuthappApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unmountAuthappApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权app解除绑定Api
     * Summary: 授权app解除绑定Api.
     *
     * @param UnmountAuthappApiRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UnmountAuthappApiResponse
     */
    public function unmountAuthappApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnmountAuthappApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.authapp.api.unmount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导入 API
     * Summary: 导入 API.
     *
     * @param ImportApiRequest $request
     *
     * @return ImportApiResponse
     */
    public function importApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 导入 API
     * Summary: 导入 API.
     *
     * @param ImportApiRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return ImportApiResponse
     */
    public function importApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api批量导出
     * Summary: api批量导出.
     *
     * @param ExportApiRequest $request
     *
     * @return ExportApiResponse
     */
    public function exportApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportApiEx($request, $headers, $runtime);
    }

    /**
     * Description: api批量导出
     * Summary: api批量导出.
     *
     * @param ExportApiRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return ExportApiResponse
     */
    public function exportApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据API分组ID导出API
     * Summary: 根据API分组ID导出API.
     *
     * @param ExportApigroupApiRequest $request
     *
     * @return ExportApigroupApiResponse
     */
    public function exportApigroupApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportApigroupApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据API分组ID导出API
     * Summary: 根据API分组ID导出API.
     *
     * @param ExportApigroupApiRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExportApigroupApiResponse
     */
    public function exportApigroupApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportApigroupApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.api.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建参数映射
     * Summary: 创建参数映射.
     *
     * @param CreateParammappingRequest $request
     *
     * @return CreateParammappingResponse
     */
    public function createParammapping($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createParammappingEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建参数映射
     * Summary: 创建参数映射.
     *
     * @param CreateParammappingRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateParammappingResponse
     */
    public function createParammappingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateParammappingResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.parammapping.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  更新参数映射
     * Summary:  更新参数映射.
     *
     * @param UpdateParammappingRequest $request
     *
     * @return UpdateParammappingResponse
     */
    public function updateParammapping($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateParammappingEx($request, $headers, $runtime);
    }

    /**
     * Description:  更新参数映射
     * Summary:  更新参数映射.
     *
     * @param UpdateParammappingRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateParammappingResponse
     */
    public function updateParammappingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateParammappingResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.parammapping.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除参数映射
     * Summary: 删除参数映射.
     *
     * @param DeleteParammappingRequest $request
     *
     * @return DeleteParammappingResponse
     */
    public function deleteParammapping($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteParammappingEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除参数映射
     * Summary: 删除参数映射.
     *
     * @param DeleteParammappingRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteParammappingResponse
     */
    public function deleteParammappingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteParammappingResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.parammapping.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询参数映射分页列表
     * Summary: 查询参数映射分页列表.
     *
     * @param ListParammappingRequest $request
     *
     * @return ListParammappingResponse
     */
    public function listParammapping($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listParammappingEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询参数映射分页列表
     * Summary: 查询参数映射分页列表.
     *
     * @param ListParammappingRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListParammappingResponse
     */
    public function listParammappingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListParammappingResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.parammapping.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询API列表
     * Summary: 查询API列表.
     *
     * @param AllParammappingRequest $request
     *
     * @return AllParammappingResponse
     */
    public function allParammapping($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allParammappingEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询API列表
     * Summary: 查询API列表.
     *
     * @param AllParammappingRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AllParammappingResponse
     */
    public function allParammappingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllParammappingResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.parammapping.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过IDF查询参数映射
     * Summary: 通过IDF查询参数映射.
     *
     * @param GetParammappingRequest $request
     *
     * @return GetParammappingResponse
     */
    public function getParammapping($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getParammappingEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过IDF查询参数映射
     * Summary: 通过IDF查询参数映射.
     *
     * @param GetParammappingRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetParammappingResponse
     */
    public function getParammappingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetParammappingResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.parammapping.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据映射参数ID查询api分页列表
     * Summary: 根据映射参数ID查询api分页列表.
     *
     * @param ListParammappingApiRequest $request
     *
     * @return ListParammappingApiResponse
     */
    public function listParammappingApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listParammappingApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据映射参数ID查询api分页列表
     * Summary: 根据映射参数ID查询api分页列表.
     *
     * @param ListParammappingApiRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListParammappingApiResponse
     */
    public function listParammappingApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListParammappingApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.parammapping.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询模型列表
     * Summary: 查询模型列表.
     *
     * @param AllApimodelRequest $request
     *
     * @return AllApimodelResponse
     */
    public function allApimodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allApimodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询模型列表
     * Summary: 查询模型列表.
     *
     * @param AllApimodelRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AllApimodelResponse
     */
    public function allApimodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllApimodelResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询api模板分页列表
     * Summary: 查询模型分页列表.
     *
     * @param ListApimodelRequest $request
     *
     * @return ListApimodelResponse
     */
    public function listApimodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApimodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询api模板分页列表
     * Summary: 查询模型分页列表.
     *
     * @param ListApimodelRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListApimodelResponse
     */
    public function listApimodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApimodelResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建api模型
     * Summary: 创建api模型.
     *
     * @param CreateApimodelRequest $request
     *
     * @return CreateApimodelResponse
     */
    public function createApimodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApimodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建api模型
     * Summary: 创建api模型.
     *
     * @param CreateApimodelRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateApimodelResponse
     */
    public function createApimodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApimodelResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除api模型
     * Summary: 删除api模型.
     *
     * @param DeleteApimodelRequest $request
     *
     * @return DeleteApimodelResponse
     */
    public function deleteApimodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteApimodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除api模型
     * Summary: 删除api模型.
     *
     * @param DeleteApimodelRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteApimodelResponse
     */
    public function deleteApimodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteApimodelResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据模型ID查询模型
     * Summary: 根据模型ID查询模型.
     *
     * @param GetApimodelRequest $request
     *
     * @return GetApimodelResponse
     */
    public function getApimodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApimodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据模型ID查询模型
     * Summary: 根据模型ID查询模型.
     *
     * @param GetApimodelRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetApimodelResponse
     */
    public function getApimodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApimodelResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新模型
     * Summary: 更新模型.
     *
     * @param UpdateApimodelRequest $request
     *
     * @return UpdateApimodelResponse
     */
    public function updateApimodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApimodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新模型
     * Summary: 更新模型.
     *
     * @param UpdateApimodelRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateApimodelResponse
     */
    public function updateApimodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApimodelResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过模型ID查询使用的API列表
     * Summary: 通过模型ID查询使用的API列表.
     *
     * @param AllApimodelApiRequest $request
     *
     * @return AllApimodelApiResponse
     */
    public function allApimodelApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allApimodelApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过模型ID查询使用的API列表
     * Summary: 通过模型ID查询使用的API列表.
     *
     * @param AllApimodelApiRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AllApimodelApiResponse
     */
    public function allApimodelApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllApimodelApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.api.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过模型ID查询使用的API分页列表
     * Summary: 通过模型ID查询使用的API分页列表.
     *
     * @param ListApimodelApiRequest $request
     *
     * @return ListApimodelApiResponse
     */
    public function listApimodelApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApimodelApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过模型ID查询使用的API分页列表
     * Summary: 通过模型ID查询使用的API分页列表.
     *
     * @param ListApimodelApiRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListApimodelApiResponse
     */
    public function listApimodelApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApimodelApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建外部授权
     * Summary: 创建外部授权.
     *
     * @param CreateExternalauthRequest $request
     *
     * @return CreateExternalauthResponse
     */
    public function createExternalauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createExternalauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建外部授权
     * Summary: 创建外部授权.
     *
     * @param CreateExternalauthRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateExternalauthResponse
     */
    public function createExternalauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateExternalauthResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.externalauth.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新外部系统
     * Summary: 更新外部系统
     *
     * @param UpdateExternalauthRequest $request
     *
     * @return UpdateExternalauthResponse
     */
    public function updateExternalauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateExternalauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新外部系统
     * Summary: 更新外部系统
     *
     * @param UpdateExternalauthRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateExternalauthResponse
     */
    public function updateExternalauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateExternalauthResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.externalauth.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除外部授权
     * Summary: 删除外部授权.
     *
     * @param DeleteExternalauthRequest $request
     *
     * @return DeleteExternalauthResponse
     */
    public function deleteExternalauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteExternalauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除外部授权
     * Summary: 删除外部授权.
     *
     * @param DeleteExternalauthRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteExternalauthResponse
     */
    public function deleteExternalauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteExternalauthResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.externalauth.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询外部授权
     * Summary: 通过ID查询外部授权.
     *
     * @param GetExternalauthRequest $request
     *
     * @return GetExternalauthResponse
     */
    public function getExternalauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getExternalauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询外部授权
     * Summary: 通过ID查询外部授权.
     *
     * @param GetExternalauthRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetExternalauthResponse
     */
    public function getExternalauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetExternalauthResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.externalauth.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询外部授权分页列表
     * Summary: 查询外部授权分页列表.
     *
     * @param ListExternalauthRequest $request
     *
     * @return ListExternalauthResponse
     */
    public function listExternalauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listExternalauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询外部授权分页列表
     * Summary: 查询外部授权分页列表.
     *
     * @param ListExternalauthRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListExternalauthResponse
     */
    public function listExternalauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListExternalauthResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.externalauth.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  查询外部系统列表
     * Summary:  查询外部系统列表.
     *
     * @param AllExternalauthRequest $request
     *
     * @return AllExternalauthResponse
     */
    public function allExternalauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allExternalauthEx($request, $headers, $runtime);
    }

    /**
     * Description:  查询外部系统列表
     * Summary:  查询外部系统列表.
     *
     * @param AllExternalauthRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AllExternalauthResponse
     */
    public function allExternalauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllExternalauthResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.externalauth.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部授权绑定api
     * Summary: 外部授权绑定api.
     *
     * @param MountExternalauthApiRequest $request
     *
     * @return MountExternalauthApiResponse
     */
    public function mountExternalauthApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->mountExternalauthApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部授权绑定api
     * Summary: 外部授权绑定api.
     *
     * @param MountExternalauthApiRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return MountExternalauthApiResponse
     */
    public function mountExternalauthApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MountExternalauthApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.externalauth.api.mount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部授权解绑api
     * Summary: 外部授权解绑api.
     *
     * @param UnmountExternalauthApiRequest $request
     *
     * @return UnmountExternalauthApiResponse
     */
    public function unmountExternalauthApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unmountExternalauthApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部授权解绑api
     * Summary: 外部授权解绑api.
     *
     * @param UnmountExternalauthApiRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UnmountExternalauthApiResponse
     */
    public function unmountExternalauthApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnmountExternalauthApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.externalauth.api.unmount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除模型参数
     * Summary: 删除模型参数.
     *
     * @param DeleteApimodelParamRequest $request
     *
     * @return DeleteApimodelParamResponse
     */
    public function deleteApimodelParam($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteApimodelParamEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除模型参数
     * Summary: 删除模型参数.
     *
     * @param DeleteApimodelParamRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteApimodelParamResponse
     */
    public function deleteApimodelParamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteApimodelParamResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.param.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新模型参数
     * Summary: 更新模型参数.
     *
     * @param UpdateApimodelParamRequest $request
     *
     * @return UpdateApimodelParamResponse
     */
    public function updateApimodelParam($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApimodelParamEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新模型参数
     * Summary: 更新模型参数.
     *
     * @param UpdateApimodelParamRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateApimodelParamResponse
     */
    public function updateApimodelParamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApimodelParamResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.param.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增模型参数
     * Summary: 新增模型参数.
     *
     * @param CreateApimodelParamRequest $request
     *
     * @return CreateApimodelParamResponse
     */
    public function createApimodelParam($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApimodelParamEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增模型参数
     * Summary: 新增模型参数.
     *
     * @param CreateApimodelParamRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateApimodelParamResponse
     */
    public function createApimodelParamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApimodelParamResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.param.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过外部授权ID查询API分页列表
     * Summary: 通过外部授权ID查询API分页列表.
     *
     * @param ListExternalauthApiRequest $request
     *
     * @return ListExternalauthApiResponse
     */
    public function listExternalauthApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listExternalauthApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过外部授权ID查询API分页列表
     * Summary: 通过外部授权ID查询API分页列表.
     *
     * @param ListExternalauthApiRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListExternalauthApiResponse
     */
    public function listExternalauthApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListExternalauthApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.externalauth.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校检 模型引用是否死循环
     * Summary: 校检 模型引用是否死循环.
     *
     * @param CheckApimodelParamRequest $request
     *
     * @return CheckApimodelParamResponse
     */
    public function checkApimodelParam($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkApimodelParamEx($request, $headers, $runtime);
    }

    /**
     * Description: 校检 模型引用是否死循环
     * Summary: 校检 模型引用是否死循环.
     *
     * @param CheckApimodelParamRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CheckApimodelParamResponse
     */
    public function checkApimodelParamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckApimodelParamResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.param.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解析数据模型
     * Summary: 解析数据模型.
     *
     * @param ResolveApimodelRequest $request
     *
     * @return ResolveApimodelResponse
     */
    public function resolveApimodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->resolveApimodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 解析数据模型
     * Summary: 解析数据模型.
     *
     * @param ResolveApimodelRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ResolveApimodelResponse
     */
    public function resolveApimodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ResolveApimodelResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.resolve', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 侯志波
     * Summary: 导入数据模型.
     *
     * @param ImportApimodelRequest $request
     *
     * @return ImportApimodelResponse
     */
    public function importApimodel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importApimodelEx($request, $headers, $runtime);
    }

    /**
     * Description: 侯志波
     * Summary: 导入数据模型.
     *
     * @param ImportApimodelRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ImportApimodelResponse
     */
    public function importApimodelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportApimodelResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: mgs模型转换 为网关模型
     * Summary: （mgs模型数据迁移）转换 为网关模型.
     *
     * @param ApplyApimodelMgsRequest $request
     *
     * @return ApplyApimodelMgsResponse
     */
    public function applyApimodelMgs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyApimodelMgsEx($request, $headers, $runtime);
    }

    /**
     * Description: mgs模型转换 为网关模型
     * Summary: （mgs模型数据迁移）转换 为网关模型.
     *
     * @param ApplyApimodelMgsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ApplyApimodelMgsResponse
     */
    public function applyApimodelMgsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyApimodelMgsResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.mgs.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询操作人分页列表
     * Summary: 查询操作人分页列表.
     *
     * @param ListOperatorRequest $request
     *
     * @return ListOperatorResponse
     */
    public function listOperator($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listOperatorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询操作人分页列表
     * Summary: 查询操作人分页列表.
     *
     * @param ListOperatorRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListOperatorResponse
     */
    public function listOperatorEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListOperatorResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.operator.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新api分组授权用户配置
     * Summary: 更新api分组授权用户配置.
     *
     * @param UpdateApigroupAuthuserconfigRequest $request
     *
     * @return UpdateApigroupAuthuserconfigResponse
     */
    public function updateApigroupAuthuserconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApigroupAuthuserconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新api分组授权用户配置
     * Summary: 更新api分组授权用户配置.
     *
     * @param UpdateApigroupAuthuserconfigRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateApigroupAuthuserconfigResponse
     */
    public function updateApigroupAuthuserconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApigroupAuthuserconfigResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.authuserconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询api分组授权用户配置
     * Summary: 查询api分组授权用户配置.
     *
     * @param GetApigroupAuthuserconfigRequest $request
     *
     * @return GetApigroupAuthuserconfigResponse
     */
    public function getApigroupAuthuserconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApigroupAuthuserconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询api分组授权用户配置
     * Summary: 查询api分组授权用户配置.
     *
     * @param GetApigroupAuthuserconfigRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetApigroupAuthuserconfigResponse
     */
    public function getApigroupAuthuserconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApigroupAuthuserconfigResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.authuserconfig.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api分组添加用户
     * Summary: api分组添加用户.
     *
     * @param AddApigroupAuthuserRequest $request
     *
     * @return AddApigroupAuthuserResponse
     */
    public function addApigroupAuthuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addApigroupAuthuserEx($request, $headers, $runtime);
    }

    /**
     * Description: api分组添加用户
     * Summary: api分组添加用户.
     *
     * @param AddApigroupAuthuserRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AddApigroupAuthuserResponse
     */
    public function addApigroupAuthuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddApigroupAuthuserResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.authuser.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  api分组授权用户使用权限
     * Summary:  api分组授权用户使用权限.
     *
     * @param MountApigroupAuthuserRequest $request
     *
     * @return MountApigroupAuthuserResponse
     */
    public function mountApigroupAuthuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->mountApigroupAuthuserEx($request, $headers, $runtime);
    }

    /**
     * Description:  api分组授权用户使用权限
     * Summary:  api分组授权用户使用权限.
     *
     * @param MountApigroupAuthuserRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return MountApigroupAuthuserResponse
     */
    public function mountApigroupAuthuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MountApigroupAuthuserResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.authuser.mount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * api解除用户使用权限
     * Summary:  api解除用户使用权限.
     *
     * @param UnmountApigroupAuthuserRequest $request
     *
     * @return UnmountApigroupAuthuserResponse
     */
    public function unmountApigroupAuthuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unmountApigroupAuthuserEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * api解除用户使用权限
     * Summary:  api解除用户使用权限.
     *
     * @param UnmountApigroupAuthuserRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return UnmountApigroupAuthuserResponse
     */
    public function unmountApigroupAuthuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnmountApigroupAuthuserResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.authuser.unmount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询api分组授权用户分页列表
     * Summary: 查询api分组授权用户分页列表.
     *
     * @param ListApigroupAuthuserRequest $request
     *
     * @return ListApigroupAuthuserResponse
     */
    public function listApigroupAuthuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApigroupAuthuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询api分组授权用户分页列表
     * Summary: 查询api分组授权用户分页列表.
     *
     * @param ListApigroupAuthuserRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListApigroupAuthuserResponse
     */
    public function listApigroupAuthuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApigroupAuthuserResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.authuser.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api分组删除用户
     * Summary: api分组删除用户.
     *
     * @param DeleteApigroupAuthuserRequest $request
     *
     * @return DeleteApigroupAuthuserResponse
     */
    public function deleteApigroupAuthuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteApigroupAuthuserEx($request, $headers, $runtime);
    }

    /**
     * Description: api分组删除用户
     * Summary: api分组删除用户.
     *
     * @param DeleteApigroupAuthuserRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteApigroupAuthuserResponse
     */
    public function deleteApigroupAuthuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteApigroupAuthuserResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.authuser.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验是否有api分组权限
     * Summary: 校验是否有api分组权限.
     *
     * @param VerifyApiApigroupRequest $request
     *
     * @return VerifyApiApigroupResponse
     */
    public function verifyApiApigroup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyApiApigroupEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验是否有api分组权限
     * Summary: 校验是否有api分组权限.
     *
     * @param VerifyApiApigroupRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return VerifyApiApigroupResponse
     */
    public function verifyApiApigroupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyApiApigroupResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.apigroup.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改app绑定api加密状态
     * Summary: 修改app绑定api加密状态
     *
     * @param UpdateAppAuthapiRequest $request
     *
     * @return UpdateAppAuthapiResponse
     */
    public function updateAppAuthapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAppAuthapiEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改app绑定api加密状态
     * Summary: 修改app绑定api加密状态
     *
     * @param UpdateAppAuthapiRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return UpdateAppAuthapiResponse
     */
    public function updateAppAuthapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAppAuthapiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.app.authapi.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 配置zone
     * Summary: 全局配置zone.
     *
     * @param CreateGwconfigRequest $request
     *
     * @return CreateGwconfigResponse
     */
    public function createGwconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createGwconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 配置zone
     * Summary: 全局配置zone.
     *
     * @param CreateGwconfigRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateGwconfigResponse
     */
    public function createGwconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateGwconfigResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.gwconfig.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询全局网关配置
     * Summary: 查询全局网关配置.
     *
     * @param GetGwconfigRequest $request
     *
     * @return GetGwconfigResponse
     */
    public function getGwconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGwconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询全局网关配置
     * Summary: 查询全局网关配置.
     *
     * @param GetGwconfigRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetGwconfigResponse
     */
    public function getGwconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGwconfigResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.gwconfig.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新全局网关配置
     * Summary: 更新全局网关配置.
     *
     * @param UpdateGwconfigRequest $request
     *
     * @return UpdateGwconfigResponse
     */
    public function updateGwconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateGwconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新全局网关配置
     * Summary: 更新全局网关配置.
     *
     * @param UpdateGwconfigRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateGwconfigResponse
     */
    public function updateGwconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateGwconfigResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.gwconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询全局网关列表
     * Summary: 查询全局网关列表.
     *
     * @param AllGwconfigRequest $request
     *
     * @return AllGwconfigResponse
     */
    public function allGwconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allGwconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询全局网关列表
     * Summary: 查询全局网关列表.
     *
     * @param AllGwconfigRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AllGwconfigResponse
     */
    public function allGwconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllGwconfigResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.gwconfig.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询instance_id
     * Summary: 查询instance_id.
     *
     * @param GetInstanceRequest $request
     *
     * @return GetInstanceResponse
     */
    public function getInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询instance_id
     * Summary: 查询instance_id.
     *
     * @param GetInstanceRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetInstanceResponse
     */
    public function getInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetInstanceResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.instance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除zone、网关效验
     * Summary: 删除zone、网关效验.
     *
     * @param CheckGwconfigDeleteRequest $request
     *
     * @return CheckGwconfigDeleteResponse
     */
    public function checkGwconfigDelete($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkGwconfigDeleteEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除zone、网关效验
     * Summary: 删除zone、网关效验.
     *
     * @param CheckGwconfigDeleteRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CheckGwconfigDeleteResponse
     */
    public function checkGwconfigDeleteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckGwconfigDeleteResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.gwconfig.delete.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新zone、网关效验
     * Summary: 更新zone、网关效验.
     *
     * @param CheckGwconfigUpdateRequest $request
     *
     * @return CheckGwconfigUpdateResponse
     */
    public function checkGwconfigUpdate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkGwconfigUpdateEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新zone、网关效验
     * Summary: 更新zone、网关效验.
     *
     * @param CheckGwconfigUpdateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CheckGwconfigUpdateResponse
     */
    public function checkGwconfigUpdateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckGwconfigUpdateResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.gwconfig.update.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建跨云互通代理模式
     * Summary: 创建跨云互通代理模式.
     *
     * @param CreateApiGwconfigRequest $request
     *
     * @return CreateApiGwconfigResponse
     */
    public function createApiGwconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApiGwconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建跨云互通代理模式
     * Summary: 创建跨云互通代理模式.
     *
     * @param CreateApiGwconfigRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateApiGwconfigResponse
     */
    public function createApiGwconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApiGwconfigResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.gwconfig.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新跨云互通API
     * Summary: 更新跨云互通API.
     *
     * @param UpdateApiGwconfigRequest $request
     *
     * @return UpdateApiGwconfigResponse
     */
    public function updateApiGwconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApiGwconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新跨云互通API
     * Summary: 更新跨云互通API.
     *
     * @param UpdateApiGwconfigRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateApiGwconfigResponse
     */
    public function updateApiGwconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApiGwconfigResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.gwconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 录入api时的参数效验
     * Summary: 录入api时的参数效验.
     *
     * @param CheckApiRequest $request
     *
     * @return CheckApiResponse
     */
    public function checkApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 录入api时的参数效验
     * Summary: 录入api时的参数效验.
     *
     * @param CheckApiRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return CheckApiResponse
     */
    public function checkApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 系统集群修改校验
     * Summary: 系统集群修改校验是否可修改.
     *
     * @param CheckSysUpdateRequest $request
     *
     * @return CheckSysUpdateResponse
     */
    public function checkSysUpdate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkSysUpdateEx($request, $headers, $runtime);
    }

    /**
     * Description: 系统集群修改校验
     * Summary: 系统集群修改校验是否可修改.
     *
     * @param CheckSysUpdateRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CheckSysUpdateResponse
     */
    public function checkSysUpdateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckSysUpdateResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.sys.update.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api查看历史版本信息
     * Summary: api查看历史版本信息.
     *
     * @param GetApiHistoryversionapiRequest $request
     *
     * @return GetApiHistoryversionapiResponse
     */
    public function getApiHistoryversionapi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApiHistoryversionapiEx($request, $headers, $runtime);
    }

    /**
     * Description: api查看历史版本信息
     * Summary: api查看历史版本信息.
     *
     * @param GetApiHistoryversionapiRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetApiHistoryversionapiResponse
     */
    public function getApiHistoryversionapiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApiHistoryversionapiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.historyversionapi.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询策略列表
     * Summary: 查询策略列表.
     *
     * @param AllStrategyRequest $request
     *
     * @return AllStrategyResponse
     */
    public function allStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询策略列表
     * Summary: 查询策略列表.
     *
     * @param AllStrategyRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AllStrategyResponse
     */
    public function allStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllStrategyResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据strategyID查询API列表
     * Summary: 根据strategyID查询API列表.
     *
     * @param AllStrategyApiRequest $request
     *
     * @return AllStrategyApiResponse
     */
    public function allStrategyApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allStrategyApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据strategyID查询API列表
     * Summary: 根据strategyID查询API列表.
     *
     * @param AllStrategyApiRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AllStrategyApiResponse
     */
    public function allStrategyApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllStrategyApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.api.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据strategyID查询API分页
     * Summary: 根据strategyID查询API分页.
     *
     * @param ListStrategyApiRequest $request
     *
     * @return ListStrategyApiResponse
     */
    public function listStrategyApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listStrategyApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据strategyID查询API分页
     * Summary: 根据strategyID查询API分页.
     *
     * @param ListStrategyApiRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListStrategyApiResponse
     */
    public function listStrategyApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListStrategyApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.api.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  根据strategy ID绑定API
     * Summary:  根据strategy ID绑定API.
     *
     * @param MountStrategyApiRequest $request
     *
     * @return MountStrategyApiResponse
     */
    public function mountStrategyApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->mountStrategyApiEx($request, $headers, $runtime);
    }

    /**
     * Description:  根据strategy ID绑定API
     * Summary:  根据strategy ID绑定API.
     *
     * @param MountStrategyApiRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return MountStrategyApiResponse
     */
    public function mountStrategyApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MountStrategyApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.api.mount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据strategyID 解绑API
     * Summary: 根据strategyID 解绑API.
     *
     * @param UnmountStrategyApiRequest $request
     *
     * @return UnmountStrategyApiResponse
     */
    public function unmountStrategyApi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unmountStrategyApiEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据strategyID 解绑API
     * Summary: 根据strategyID 解绑API.
     *
     * @param UnmountStrategyApiRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UnmountStrategyApiResponse
     */
    public function unmountStrategyApiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnmountStrategyApiResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.api.unmount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  创建策略
     * Summary:  创建策略.
     *
     * @param CreateStrategyRequest $request
     *
     * @return CreateStrategyResponse
     */
    public function createStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description:  创建策略
     * Summary:  创建策略.
     *
     * @param CreateStrategyRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateStrategyResponse
     */
    public function createStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateStrategyResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除策略
     * Summary: 删除策略.
     *
     * @param DeleteStrategyRequest $request
     *
     * @return DeleteStrategyResponse
     */
    public function deleteStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除策略
     * Summary: 删除策略.
     *
     * @param DeleteStrategyRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteStrategyResponse
     */
    public function deleteStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteStrategyResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据ID查询strategy
     * Summary: 根据ID查询strategy.
     *
     * @param GetStrategyRequest $request
     *
     * @return GetStrategyResponse
     */
    public function getStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据ID查询strategy
     * Summary: 根据ID查询strategy.
     *
     * @param GetStrategyRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetStrategyResponse
     */
    public function getStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetStrategyResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询strategy分页列表
     * Summary: 查询strategy分页列表.
     *
     * @param ListStrategyRequest $request
     *
     * @return ListStrategyResponse
     */
    public function listStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询strategy分页列表
     * Summary: 查询strategy分页列表.
     *
     * @param ListStrategyRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListStrategyResponse
     */
    public function listStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListStrategyResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  编辑strategy
     * Summary:  编辑strategy.
     *
     * @param UpdateStrategyRequest $request
     *
     * @return UpdateStrategyResponse
     */
    public function updateStrategy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateStrategyEx($request, $headers, $runtime);
    }

    /**
     * Description:  编辑strategy
     * Summary:  编辑strategy.
     *
     * @param UpdateStrategyRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateStrategyResponse
     */
    public function updateStrategyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateStrategyResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.strategy.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数量
     * Summary: 查询数量.
     *
     * @param GetHomeRequest $request
     *
     * @return GetHomeResponse
     */
    public function getHome($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getHomeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数量
     * Summary: 查询数量.
     *
     * @param GetHomeRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return GetHomeResponse
     */
    public function getHomeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetHomeResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.home.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 录入域名时的效验
     * Summary: 录入域名时的效验.
     *
     * @param CheckApigroupDomainRequest $request
     *
     * @return CheckApigroupDomainResponse
     */
    public function checkApigroupDomain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkApigroupDomainEx($request, $headers, $runtime);
    }

    /**
     * Description: 录入域名时的效验
     * Summary: 录入域名时的效验.
     *
     * @param CheckApigroupDomainRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CheckApigroupDomainResponse
     */
    public function checkApigroupDomainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckApigroupDomainResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.domain.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询域名后缀
     * Summary: 查询域名后缀
     *
     * @param GetApigroupDomainRequest $request
     *
     * @return GetApigroupDomainResponse
     */
    public function getApigroupDomain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApigroupDomainEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询域名后缀
     * Summary: 查询域名后缀
     *
     * @param GetApigroupDomainRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetApigroupDomainResponse
     */
    public function getApigroupDomainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApigroupDomainResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apigroup.domain.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看api生成的swagger文档
     * Summary: 查看api生成的swagger文档.
     *
     * @param GetApiSwaggerRequest $request
     *
     * @return GetApiSwaggerResponse
     */
    public function getApiSwagger($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApiSwaggerEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看api生成的swagger文档
     * Summary: 查看api生成的swagger文档.
     *
     * @param GetApiSwaggerRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetApiSwaggerResponse
     */
    public function getApiSwaggerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApiSwaggerResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.swagger.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: api文档下载
     * Summary: api文档下载.
     *
     * @param DownloadApiSwaggerRequest $request
     *
     * @return DownloadApiSwaggerResponse
     */
    public function downloadApiSwagger($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadApiSwaggerEx($request, $headers, $runtime);
    }

    /**
     * Description: api文档下载
     * Summary: api文档下载.
     *
     * @param DownloadApiSwaggerRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DownloadApiSwaggerResponse
     */
    public function downloadApiSwaggerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadApiSwaggerResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.api.swagger.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代码生成
     * Summary: 代码生成.
     *
     * @param DownloadApimodelCodegenRequest $request
     *
     * @return DownloadApimodelCodegenResponse
     */
    public function downloadApimodelCodegen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadApimodelCodegenEx($request, $headers, $runtime);
    }

    /**
     * Description: 代码生成
     * Summary: 代码生成.
     *
     * @param DownloadApimodelCodegenRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return DownloadApimodelCodegenResponse
     */
    public function downloadApimodelCodegenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadApimodelCodegenResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.codegen.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取双网模块开关
     * Summary: 获取双网模块开关.
     *
     * @param GetGwconfigGatewayswitchRequest $request
     *
     * @return GetGwconfigGatewayswitchResponse
     */
    public function getGwconfigGatewayswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGwconfigGatewayswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取双网模块开关
     * Summary: 获取双网模块开关.
     *
     * @param GetGwconfigGatewayswitchRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetGwconfigGatewayswitchResponse
     */
    public function getGwconfigGatewayswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGwconfigGatewayswitchResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.gwconfig.gatewayswitch.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询注册中心列表
     * Summary: 查询注册中心列表.
     *
     * @param AllRegistryRequest $request
     *
     * @return AllRegistryResponse
     */
    public function allRegistry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allRegistryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询注册中心列表
     * Summary: 查询注册中心列表.
     *
     * @param AllRegistryRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AllRegistryResponse
     */
    public function allRegistryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllRegistryResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.registry.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询注册中心绑定的集群列表
     * Summary: 查询注册中心绑定的集群列表.
     *
     * @param AllRegistrySysRequest $request
     *
     * @return AllRegistrySysResponse
     */
    public function allRegistrySys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allRegistrySysEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询注册中心绑定的集群列表
     * Summary: 查询注册中心绑定的集群列表.
     *
     * @param AllRegistrySysRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AllRegistrySysResponse
     */
    public function allRegistrySysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllRegistrySysResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.registry.sys.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询注册中心绑定的集群列表
     * Summary: 分页查询注册中心绑定的集群列表.
     *
     * @param ListRegistrySysRequest $request
     *
     * @return ListRegistrySysResponse
     */
    public function listRegistrySys($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRegistrySysEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询注册中心绑定的集群列表
     * Summary: 分页查询注册中心绑定的集群列表.
     *
     * @param ListRegistrySysRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListRegistrySysResponse
     */
    public function listRegistrySysEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRegistrySysResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.registry.sys.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建注册中心
     * Summary: 创建注册中心.
     *
     * @param CreateRegistryRequest $request
     *
     * @return CreateRegistryResponse
     */
    public function createRegistry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRegistryEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建注册中心
     * Summary: 创建注册中心.
     *
     * @param CreateRegistryRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateRegistryResponse
     */
    public function createRegistryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRegistryResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.registry.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  通过ID删除注册中心
     * Summary:  通过ID删除注册中心.
     *
     * @param DeleteRegistryRequest $request
     *
     * @return DeleteRegistryResponse
     */
    public function deleteRegistry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteRegistryEx($request, $headers, $runtime);
    }

    /**
     * Description:  通过ID删除注册中心
     * Summary:  通过ID删除注册中心.
     *
     * @param DeleteRegistryRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return DeleteRegistryResponse
     */
    public function deleteRegistryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteRegistryResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.registry.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询注册中心
     * Summary: 通过ID查询注册中心.
     *
     * @param GetRegistryRequest $request
     *
     * @return GetRegistryResponse
     */
    public function getRegistry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRegistryEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询注册中心
     * Summary: 通过ID查询注册中心.
     *
     * @param GetRegistryRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetRegistryResponse
     */
    public function getRegistryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRegistryResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.registry.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  查询注册中心分页列表
     * Summary:  查询注册中心分页列表.
     *
     * @param ListRegistryRequest $request
     *
     * @return ListRegistryResponse
     */
    public function listRegistry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listRegistryEx($request, $headers, $runtime);
    }

    /**
     * Description:  查询注册中心分页列表
     * Summary:  查询注册中心分页列表.
     *
     * @param ListRegistryRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ListRegistryResponse
     */
    public function listRegistryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListRegistryResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.registry.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新注册中心
     * Summary: 更新注册中心.
     *
     * @param UpdateRegistryRequest $request
     *
     * @return UpdateRegistryResponse
     */
    public function updateRegistry($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRegistryEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新注册中心
     * Summary: 更新注册中心.
     *
     * @param UpdateRegistryRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateRegistryResponse
     */
    public function updateRegistryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRegistryResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.registry.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 执行流程编排
     * Summary: 执行流程编排.
     *
     * @param ExecApiflowRequest $request
     *
     * @return ExecApiflowResponse
     */
    public function execApiflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execApiflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 执行流程编排
     * Summary: 执行流程编排.
     *
     * @param ExecApiflowRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ExecApiflowResponse
     */
    public function execApiflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecApiflowResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apiflow.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID删除编排
     * Summary: 通过ID删除编排.
     *
     * @param DeleteApiflowRequest $request
     *
     * @return DeleteApiflowResponse
     */
    public function deleteApiflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteApiflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID删除编排
     * Summary: 通过ID删除编排.
     *
     * @param DeleteApiflowRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DeleteApiflowResponse
     */
    public function deleteApiflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteApiflowResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apiflow.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询全部编排列表
     * Summary: 查询全部编排列表.
     *
     * @param AllApiflowRequest $request
     *
     * @return AllApiflowResponse
     */
    public function allApiflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allApiflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询全部编排列表
     * Summary: 查询全部编排列表.
     *
     * @param AllApiflowRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AllApiflowResponse
     */
    public function allApiflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllApiflowResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apiflow.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询编排分页列表
     * Summary: 查询编排分页列表.
     *
     * @param ListApiflowRequest $request
     *
     * @return ListApiflowResponse
     */
    public function listApiflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listApiflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询编排分页列表
     * Summary: 查询编排分页列表.
     *
     * @param ListApiflowRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ListApiflowResponse
     */
    public function listApiflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListApiflowResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apiflow.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建API形式的编排
     * Summary: 创建API形式的编排.
     *
     * @param CreateApiflowRequest $request
     *
     * @return CreateApiflowResponse
     */
    public function createApiflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApiflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建API形式的编排
     * Summary: 创建API形式的编排.
     *
     * @param CreateApiflowRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateApiflowResponse
     */
    public function createApiflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApiflowResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apiflow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过ID查询编排
     * Summary: 通过ID查询编排.
     *
     * @param GetApiflowRequest $request
     *
     * @return GetApiflowResponse
     */
    public function getApiflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApiflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过ID查询编排
     * Summary: 通过ID查询编排.
     *
     * @param GetApiflowRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetApiflowResponse
     */
    public function getApiflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApiflowResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apiflow.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新编排信息
     * Summary: 更新编排信息.
     *
     * @param UpdateApiflowRequest $request
     *
     * @return UpdateApiflowResponse
     */
    public function updateApiflow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateApiflowEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新编排信息
     * Summary: 更新编排信息.
     *
     * @param UpdateApiflowRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateApiflowResponse
     */
    public function updateApiflowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateApiflowResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apiflow.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据模型转json
     * Summary: 数据模型转json.
     *
     * @param GetApimodelJsonRequest $request
     *
     * @return GetApimodelJsonResponse
     */
    public function getApimodelJson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApimodelJsonEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据模型转json
     * Summary: 数据模型转json.
     *
     * @param GetApimodelJsonRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetApimodelJsonResponse
     */
    public function getApimodelJsonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApimodelJsonResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.json.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 替换成apiflow所需的json
     * Summary: 替换成apiflow所需的json.
     *
     * @param ReplaceApimodelJsonRequest $request
     *
     * @return ReplaceApimodelJsonResponse
     */
    public function replaceApimodelJson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->replaceApimodelJsonEx($request, $headers, $runtime);
    }

    /**
     * Description: 替换成apiflow所需的json
     * Summary: 替换成apiflow所需的json.
     *
     * @param ReplaceApimodelJsonRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ReplaceApimodelJsonResponse
     */
    public function replaceApimodelJsonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReplaceApimodelJsonResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.apimodel.json.replace', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取triple协议开关
     * Summary: 获取triple协议开关.
     *
     * @param GetGwconfigTripleswitchRequest $request
     *
     * @return GetGwconfigTripleswitchResponse
     */
    public function getGwconfigTripleswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGwconfigTripleswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取triple协议开关
     * Summary: 获取triple协议开关.
     *
     * @param GetGwconfigTripleswitchRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetGwconfigTripleswitchResponse
     */
    public function getGwconfigTripleswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGwconfigTripleswitchResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.gwconfig.tripleswitch.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 专有云triple查询开关
     * Summary: 专有云triple查询开关.
     *
     * @param QueryGwconfigTripleswitchRequest $request
     *
     * @return QueryGwconfigTripleswitchResponse
     */
    public function queryGwconfigTripleswitch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGwconfigTripleswitchEx($request, $headers, $runtime);
    }

    /**
     * Description: 专有云triple查询开关
     * Summary: 专有云triple查询开关.
     *
     * @param QueryGwconfigTripleswitchRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryGwconfigTripleswitchResponse
     */
    public function queryGwconfigTripleswitchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGwconfigTripleswitchResponse::fromMap($this->doRequest('1.0', 'sofa.apigateway.gwconfig.tripleswitch.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
