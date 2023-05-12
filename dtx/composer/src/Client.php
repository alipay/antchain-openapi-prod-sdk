<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DTX\Models\AddWhitelistRequest;
use AntChain\DTX\Models\AddWhitelistResponse;
use AntChain\DTX\Models\AllAppsAppnamesRequest;
use AntChain\DTX\Models\AllAppsAppnamesResponse;
use AntChain\DTX\Models\AllInitiatorsDatasourcesRequest;
use AntChain\DTX\Models\AllInitiatorsDatasourcesResponse;
use AntChain\DTX\Models\AllInitiatorsTablesRequest;
use AntChain\DTX\Models\AllInitiatorsTablesResponse;
use AntChain\DTX\Models\AllParticipatorsActionamesRequest;
use AntChain\DTX\Models\AllParticipatorsActionamesResponse;
use AntChain\DTX\Models\AllZoneRequest;
use AntChain\DTX\Models\AllZoneResponse;
use AntChain\DTX\Models\BatchcreateAppsRequest;
use AntChain\DTX\Models\BatchcreateAppsResponse;
use AntChain\DTX\Models\CancelSwitchoverRequest;
use AntChain\DTX\Models\CancelSwitchoverResponse;
use AntChain\DTX\Models\CountAppsStatsRequest;
use AntChain\DTX\Models\CountAppsStatsResponse;
use AntChain\DTX\Models\CountBiztypesTrendsRequest;
use AntChain\DTX\Models\CountBiztypesTrendsResponse;
use AntChain\DTX\Models\CreateAppsActionRequest;
use AntChain\DTX\Models\CreateAppsActionResponse;
use AntChain\DTX\Models\CreateAppsConfigsRequest;
use AntChain\DTX\Models\CreateAppsConfigsResponse;
use AntChain\DTX\Models\CreateAppsRecoveryRequest;
use AntChain\DTX\Models\CreateAppsRecoveryResponse;
use AntChain\DTX\Models\CreateAppsRequest;
use AntChain\DTX\Models\CreateAppsResponse;
use AntChain\DTX\Models\CreateBiztypeRelationRequest;
use AntChain\DTX\Models\CreateBiztypeRelationResponse;
use AntChain\DTX\Models\CreateRecoveryConfigurationRequest;
use AntChain\DTX\Models\CreateRecoveryConfigurationResponse;
use AntChain\DTX\Models\CreateRecoveryInitiatorsRequest;
use AntChain\DTX\Models\CreateRecoveryInitiatorsResponse;
use AntChain\DTX\Models\CreateRecoveryParticipatorsRequest;
use AntChain\DTX\Models\CreateRecoveryParticipatorsResponse;
use AntChain\DTX\Models\CreateTransactionsCorrectionsRequest;
use AntChain\DTX\Models\CreateTransactionsCorrectionsResponse;
use AntChain\DTX\Models\DebugInitiatorsRequest;
use AntChain\DTX\Models\DebugInitiatorsResponse;
use AntChain\DTX\Models\DebugParticipatorsRequest;
use AntChain\DTX\Models\DebugParticipatorsResponse;
use AntChain\DTX\Models\DeleteAppsActionRequest;
use AntChain\DTX\Models\DeleteAppsActionResponse;
use AntChain\DTX\Models\DeleteAppsBiztypeRequest;
use AntChain\DTX\Models\DeleteAppsBiztypeResponse;
use AntChain\DTX\Models\DeleteAppsRecoveryRequest;
use AntChain\DTX\Models\DeleteAppsRecoveryResponse;
use AntChain\DTX\Models\DeleteAppsRequest;
use AntChain\DTX\Models\DeleteAppsResponse;
use AntChain\DTX\Models\DeleteTransactionsRequest;
use AntChain\DTX\Models\DeleteTransactionsResponse;
use AntChain\DTX\Models\DeleteWhitelistRequest;
use AntChain\DTX\Models\DeleteWhitelistResponse;
use AntChain\DTX\Models\ExecTransactionsCorrectionsRequest;
use AntChain\DTX\Models\ExecTransactionsCorrectionsResponse;
use AntChain\DTX\Models\ExecuteSwitchoverRequest;
use AntChain\DTX\Models\ExecuteSwitchoverResponse;
use AntChain\DTX\Models\ExportAppsConfigsRequest;
use AntChain\DTX\Models\ExportAppsConfigsResponse;
use AntChain\DTX\Models\ExportAppsNewconfigsRequest;
use AntChain\DTX\Models\ExportAppsNewconfigsResponse;
use AntChain\DTX\Models\ExportTxConfigsRequest;
use AntChain\DTX\Models\ExportTxConfigsResponse;
use AntChain\DTX\Models\GetAppsBiztypeRequest;
use AntChain\DTX\Models\GetAppsBiztypeResponse;
use AntChain\DTX\Models\GetGlobalEnvRequest;
use AntChain\DTX\Models\GetGlobalEnvResponse;
use AntChain\DTX\Models\GetGlobalStatsRequest;
use AntChain\DTX\Models\GetGlobalStatsResponse;
use AntChain\DTX\Models\GetMiddlewareInstanceRequest;
use AntChain\DTX\Models\GetMiddlewareInstanceResponse;
use AntChain\DTX\Models\GetRecoveryInitiatorsRequest;
use AntChain\DTX\Models\GetRecoveryInitiatorsResponse;
use AntChain\DTX\Models\GetRecoveryParticipatorsRequest;
use AntChain\DTX\Models\GetRecoveryParticipatorsResponse;
use AntChain\DTX\Models\GetTransactionChartRequest;
use AntChain\DTX\Models\GetTransactionChartResponse;
use AntChain\DTX\Models\GetTransactionSagaRequest;
use AntChain\DTX\Models\GetTransactionSagaResponse;
use AntChain\DTX\Models\GetTransactionsCorrectionsRequest;
use AntChain\DTX\Models\GetTransactionsCorrectionsResponse;
use AntChain\DTX\Models\GetTransactionsDebugsRequest;
use AntChain\DTX\Models\GetTransactionsDebugsResponse;
use AntChain\DTX\Models\GetTransactionsRequest;
use AntChain\DTX\Models\GetTransactionsResponse;
use AntChain\DTX\Models\GetUploadUrlRequest;
use AntChain\DTX\Models\GetUploadUrlResponse;
use AntChain\DTX\Models\ImportAppsConfigsRequest;
use AntChain\DTX\Models\ImportAppsConfigsResponse;
use AntChain\DTX\Models\ImportAppsNewconfigsRequest;
use AntChain\DTX\Models\ImportAppsNewconfigsResponse;
use AntChain\DTX\Models\ImportTxConfigsRequest;
use AntChain\DTX\Models\ImportTxConfigsResponse;
use AntChain\DTX\Models\ListAppsBiztypesRequest;
use AntChain\DTX\Models\ListAppsBiztypesResponse;
use AntChain\DTX\Models\ListAppsRecoverydsnameRequest;
use AntChain\DTX\Models\ListAppsRecoverydsnameResponse;
use AntChain\DTX\Models\ListAppsRequest;
use AntChain\DTX\Models\ListAppsResponse;
use AntChain\DTX\Models\ListBiztypesInitiatorsRequest;
use AntChain\DTX\Models\ListBiztypesInitiatorsResponse;
use AntChain\DTX\Models\ListBiztypesParticipatorsRequest;
use AntChain\DTX\Models\ListBiztypesParticipatorsResponse;
use AntChain\DTX\Models\ListNewAppsRequest;
use AntChain\DTX\Models\ListNewAppsResponse;
use AntChain\DTX\Models\ListTransactionAppsRequest;
use AntChain\DTX\Models\ListTransactionAppsResponse;
use AntChain\DTX\Models\ListTransactionCorrectionsRequest;
use AntChain\DTX\Models\ListTransactionCorrectionsResponse;
use AntChain\DTX\Models\ListTransactionDebugsRequest;
use AntChain\DTX\Models\ListTransactionDebugsResponse;
use AntChain\DTX\Models\ListWhitelistRequest;
use AntChain\DTX\Models\ListWhitelistResponse;
use AntChain\DTX\Models\ListWhitelistZonesRequest;
use AntChain\DTX\Models\ListWhitelistZonesResponse;
use AntChain\DTX\Models\PushWhitelistRequest;
use AntChain\DTX\Models\PushWhitelistResponse;
use AntChain\DTX\Models\QueryActionParamRequest;
use AntChain\DTX\Models\QueryActionParamResponse;
use AntChain\DTX\Models\QueryAppsBiztypeRequest;
use AntChain\DTX\Models\QueryAppsBiztypeResponse;
use AntChain\DTX\Models\QueryAppsDetailRequest;
use AntChain\DTX\Models\QueryAppsDetailResponse;
use AntChain\DTX\Models\QueryBiztypeRelationRequest;
use AntChain\DTX\Models\QueryBiztypeRelationResponse;
use AntChain\DTX\Models\QuerySwitchoverRequest;
use AntChain\DTX\Models\QuerySwitchoverResponse;
use AntChain\DTX\Models\QueryTransactionsRequest;
use AntChain\DTX\Models\QueryTransactionsResponse;
use AntChain\DTX\Models\UpdateAppsBiztypeRequest;
use AntChain\DTX\Models\UpdateAppsBiztypeResponse;
use AntChain\DTX\Models\UpdateRecoveryInitiatorsRequest;
use AntChain\DTX\Models\UpdateRecoveryInitiatorsResponse;
use AntChain\DTX\Models\UpdateRecoveryParticipatorsRequest;
use AntChain\DTX\Models\UpdateRecoveryParticipatorsResponse;
use AntChain\DTX\Models\UpdateWhitelistRequest;
use AntChain\DTX\Models\UpdateWhitelistResponse;
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
            // 进行中事务数统计
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
                    'sdk_version'      => '1.0.166',
                    '_prod_code'       => 'DTX',
                    '_prod_channel'    => 'undefined',
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query['security_token'] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    'host'       => Utils::defaultString($this->_endpoint, 'prodapigw-sofastack.cloud.alipay.com'),
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
     * Description: 创建应用
     * Summary: 创建应用.
     *
     * @param CreateAppsRequest $request
     *
     * @return CreateAppsResponse
     */
    public function createApps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAppsEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建应用
     * Summary: 创建应用.
     *
     * @param CreateAppsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateAppsResponse
     */
    public function createAppsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAppsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起方接入，新增发起方配置
     * Summary: 发起方接入.
     *
     * @param CreateRecoveryInitiatorsRequest $request
     *
     * @return CreateRecoveryInitiatorsResponse
     */
    public function createRecoveryInitiators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRecoveryInitiatorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起方接入，新增发起方配置
     * Summary: 发起方接入.
     *
     * @param CreateRecoveryInitiatorsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateRecoveryInitiatorsResponse
     */
    public function createRecoveryInitiatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRecoveryInitiatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.recovery.initiators.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据app获取事务概览统计
     * Summary: 获取bizType事务概览统计
     *
     * @param CountAppsStatsRequest $request
     *
     * @return CountAppsStatsResponse
     */
    public function countAppsStats($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countAppsStatsEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据app获取事务概览统计
     * Summary: 获取bizType事务概览统计
     *
     * @param CountAppsStatsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CountAppsStatsResponse
     */
    public function countAppsStatsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountAppsStatsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.stats.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取bizType列表
     * Summary: 获取bizType列表.
     *
     * @param ListAppsBiztypesRequest $request
     *
     * @return ListAppsBiztypesResponse
     */
    public function listAppsBiztypes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppsBiztypesEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取bizType列表
     * Summary: 获取bizType列表.
     *
     * @param ListAppsBiztypesRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListAppsBiztypesResponse
     */
    public function listAppsBiztypesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppsBiztypesResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.biztypes.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: app+发起方/参与者 导出配置
     * Summary: 导出配置.
     *
     * @param ExportAppsConfigsRequest $request
     *
     * @return ExportAppsConfigsResponse
     */
    public function exportAppsConfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportAppsConfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: app+发起方/参与者 导出配置
     * Summary: 导出配置.
     *
     * @param ExportAppsConfigsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ExportAppsConfigsResponse
     */
    public function exportAppsConfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportAppsConfigsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.configs.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取应用名（app_name）列表
     * Summary: 获取应用名（app_name）列表.
     *
     * @param AllAppsAppnamesRequest $request
     *
     * @return AllAppsAppnamesResponse
     */
    public function allAppsAppnames($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allAppsAppnamesEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取应用名（app_name）列表
     * Summary: 获取应用名（app_name）列表.
     *
     * @param AllAppsAppnamesRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AllAppsAppnamesResponse
     */
    public function allAppsAppnamesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllAppsAppnamesResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.appnames.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用事务列表，分页
     * Summary: 应用事务列表.
     *
     * @param ListAppsRequest $request
     *
     * @return ListAppsResponse
     */
    public function listApps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppsEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用事务列表，分页
     * Summary: 应用事务列表.
     *
     * @param ListAppsRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return ListAppsResponse
     */
    public function listAppsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单个参与者详情
     * Summary: 单个参与者详情.
     *
     * @param GetRecoveryParticipatorsRequest $request
     *
     * @return GetRecoveryParticipatorsResponse
     */
    public function getRecoveryParticipators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRecoveryParticipatorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 单个参与者详情
     * Summary: 单个参与者详情.
     *
     * @param GetRecoveryParticipatorsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetRecoveryParticipatorsResponse
     */
    public function getRecoveryParticipatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRecoveryParticipatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.recovery.participators.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导出配置中需要有app、类型信息（发起方/参与者）
     * Summary: 导入配置.
     *
     * @param ImportAppsConfigsRequest $request
     *
     * @return ImportAppsConfigsResponse
     */
    public function importAppsConfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importAppsConfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: 导出配置中需要有app、类型信息（发起方/参与者）
     * Summary: 导入配置.
     *
     * @param ImportAppsConfigsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ImportAppsConfigsResponse
     */
    public function importAppsConfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportAppsConfigsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.configs.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取上传文件URL
     * Summary: 获取上传文件URL.
     *
     * @param GetUploadUrlRequest $request
     *
     * @return GetUploadUrlResponse
     */
    public function getUploadUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getUploadUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取上传文件URL
     * Summary: 获取上传文件URL.
     *
     * @param GetUploadUrlRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetUploadUrlResponse
     */
    public function getUploadUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetUploadUrlResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.upload.url.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
     * Summary: 查询bizType的调用关系.
     *
     * @param QueryAppsBiztypeRequest $request
     *
     * @return QueryAppsBiztypeResponse
     */
    public function queryAppsBiztype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAppsBiztypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询bizType的调用关系：发起者（appName）和参与者，Saga则是状态机json定义
     * Summary: 查询bizType的调用关系.
     *
     * @param QueryAppsBiztypeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryAppsBiztypeResponse
     */
    public function queryAppsBiztypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAppsBiztypeResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.biztype.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建发起者获取数据源
     * Summary: 创建发起者获取数据源.
     *
     * @param ListAppsRecoverydsnameRequest $request
     *
     * @return ListAppsRecoverydsnameResponse
     */
    public function listAppsRecoverydsname($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAppsRecoverydsnameEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建发起者获取数据源
     * Summary: 创建发起者获取数据源.
     *
     * @param ListAppsRecoverydsnameRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListAppsRecoverydsnameResponse
     */
    public function listAppsRecoverydsnameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAppsRecoverydsnameResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.recoverydsname.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单个biztype的关联关系，Saga则是状态机json定义
     * Summary: 单个biztype的关联关系.
     *
     * @param GetAppsBiztypeRequest $request
     *
     * @return GetAppsBiztypeResponse
     */
    public function getAppsBiztype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAppsBiztypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 单个biztype的关联关系，Saga则是状态机json定义
     * Summary: 单个biztype的关联关系.
     *
     * @param GetAppsBiztypeRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetAppsBiztypeResponse
     */
    public function getAppsBiztypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAppsBiztypeResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.biztype.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 事务更新
     * Summary: 事务更新.
     *
     * @param UpdateAppsBiztypeRequest $request
     *
     * @return UpdateAppsBiztypeResponse
     */
    public function updateAppsBiztype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAppsBiztypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 事务更新
     * Summary: 事务更新.
     *
     * @param UpdateAppsBiztypeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateAppsBiztypeResponse
     */
    public function updateAppsBiztypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAppsBiztypeResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.biztype.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增应用配置（包括发起方和参与者）
     * Summary: 新增应用配置（包括发起方和参与者）.
     *
     * @param CreateAppsConfigsRequest $request
     *
     * @return CreateAppsConfigsResponse
     */
    public function createAppsConfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAppsConfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增应用配置（包括发起方和参与者）
     * Summary: 新增应用配置（包括发起方和参与者）.
     *
     * @param CreateAppsConfigsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateAppsConfigsResponse
     */
    public function createAppsConfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAppsConfigsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.configs.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 事务配置-导入配置
     * Summary: 应用配置-导入配置.
     *
     * @param ImportAppsNewconfigsRequest $request
     *
     * @return ImportAppsNewconfigsResponse
     */
    public function importAppsNewconfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importAppsNewconfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: 事务配置-导入配置
     * Summary: 应用配置-导入配置.
     *
     * @param ImportAppsNewconfigsRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ImportAppsNewconfigsResponse
     */
    public function importAppsNewconfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportAppsNewconfigsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.newconfigs.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: app+发起方/参与者 导出配置
     * Summary: 应用配置-导出配置.
     *
     * @param ExportAppsNewconfigsRequest $request
     *
     * @return ExportAppsNewconfigsResponse
     */
    public function exportAppsNewconfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportAppsNewconfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: app+发起方/参与者 导出配置
     * Summary: 应用配置-导出配置.
     *
     * @param ExportAppsNewconfigsRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExportAppsNewconfigsResponse
     */
    public function exportAppsNewconfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportAppsNewconfigsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.newconfigs.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 导出配置中需要有事务信息
     * Summary: 事务配置-导入配置.
     *
     * @param ImportTxConfigsRequest $request
     *
     * @return ImportTxConfigsResponse
     */
    public function importTxConfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importTxConfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: 导出配置中需要有事务信息
     * Summary: 事务配置-导入配置.
     *
     * @param ImportTxConfigsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ImportTxConfigsResponse
     */
    public function importTxConfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportTxConfigsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.tx.configs.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 事务导出配置
     * Summary: 事务配置-导出配置.
     *
     * @param ExportTxConfigsRequest $request
     *
     * @return ExportTxConfigsResponse
     */
    public function exportTxConfigs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportTxConfigsEx($request, $headers, $runtime);
    }

    /**
     * Description: 事务导出配置
     * Summary: 事务配置-导出配置.
     *
     * @param ExportTxConfigsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExportTxConfigsResponse
     */
    public function exportTxConfigsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportTxConfigsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.tx.configs.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 管控台1.1 应用配置列表
     * Summary: 应用配置列表.
     *
     * @param ListNewAppsRequest $request
     *
     * @return ListNewAppsResponse
     */
    public function listNewApps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listNewAppsEx($request, $headers, $runtime);
    }

    /**
     * Description: 管控台1.1 应用配置列表
     * Summary: 应用配置列表.
     *
     * @param ListNewAppsRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ListNewAppsResponse
     */
    public function listNewAppsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListNewAppsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.new.apps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新应用详情界面
     * Summary: 应用详情.
     *
     * @param QueryAppsDetailRequest $request
     *
     * @return QueryAppsDetailResponse
     */
    public function queryAppsDetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAppsDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 新应用详情界面
     * Summary: 应用详情.
     *
     * @param QueryAppsDetailRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryAppsDetailResponse
     */
    public function queryAppsDetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAppsDetailResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.detail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 。
     * Summary: 应用删除.
     *
     * @param DeleteAppsRequest $request
     *
     * @return DeleteAppsResponse
     */
    public function deleteApps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAppsEx($request, $headers, $runtime);
    }

    /**
     * Description: 。
     * Summary: 应用删除.
     *
     * @param DeleteAppsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return DeleteAppsResponse
     */
    public function deleteAppsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAppsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起方删除
     * Summary: 发起方删除.
     *
     * @param DeleteAppsRecoveryRequest $request
     *
     * @return DeleteAppsRecoveryResponse
     */
    public function deleteAppsRecovery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAppsRecoveryEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起方删除
     * Summary: 发起方删除.
     *
     * @param DeleteAppsRecoveryRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteAppsRecoveryResponse
     */
    public function deleteAppsRecoveryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAppsRecoveryResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.recovery.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 参与者删除
     * Summary: 参与者删除.
     *
     * @param DeleteAppsActionRequest $request
     *
     * @return DeleteAppsActionResponse
     */
    public function deleteAppsAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAppsActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 参与者删除
     * Summary: 参与者删除.
     *
     * @param DeleteAppsActionRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return DeleteAppsActionResponse
     */
    public function deleteAppsActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAppsActionResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.action.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量新增 app下的发起方、参与者
     * Summary: 批量新增 app下的发起方、参与者.
     *
     * @param BatchcreateAppsRequest $request
     *
     * @return BatchcreateAppsResponse
     */
    public function batchcreateApps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateAppsEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量新增 app下的发起方、参与者
     * Summary: 批量新增 app下的发起方、参与者.
     *
     * @param BatchcreateAppsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return BatchcreateAppsResponse
     */
    public function batchcreateAppsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateAppsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单个发起方新增/编辑
     * Summary: 单个发起方新增/编辑.
     *
     * @param CreateAppsRecoveryRequest $request
     *
     * @return CreateAppsRecoveryResponse
     */
    public function createAppsRecovery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAppsRecoveryEx($request, $headers, $runtime);
    }

    /**
     * Description: 单个发起方新增/编辑
     * Summary: 单个发起方新增/编辑.
     *
     * @param CreateAppsRecoveryRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateAppsRecoveryResponse
     */
    public function createAppsRecoveryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAppsRecoveryResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.recovery.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 参与者新增/编辑
     * Summary: 参与者新增/编辑.
     *
     * @param CreateAppsActionRequest $request
     *
     * @return CreateAppsActionResponse
     */
    public function createAppsAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAppsActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 参与者新增/编辑
     * Summary: 参与者新增/编辑.
     *
     * @param CreateAppsActionRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateAppsActionResponse
     */
    public function createAppsActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAppsActionResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.action.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新建/编辑事务关联关系
     * Summary: 新建/编辑事务关联关系.
     *
     * @param CreateBiztypeRelationRequest $request
     *
     * @return CreateBiztypeRelationResponse
     */
    public function createBiztypeRelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBiztypeRelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 新建/编辑事务关联关系
     * Summary: 新建/编辑事务关联关系.
     *
     * @param CreateBiztypeRelationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateBiztypeRelationResponse
     */
    public function createBiztypeRelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBiztypeRelationResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.biztype.relation.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除biztype关联关系
     * Summary: 删除biztype关联关系.
     *
     * @param DeleteAppsBiztypeRequest $request
     *
     * @return DeleteAppsBiztypeResponse
     */
    public function deleteAppsBiztype($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAppsBiztypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除biztype关联关系
     * Summary: 删除biztype关联关系.
     *
     * @param DeleteAppsBiztypeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DeleteAppsBiztypeResponse
     */
    public function deleteAppsBiztypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAppsBiztypeResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.apps.biztype.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询biztype与发起方，参与者的关联关系
     * Summary: 查询biztype关联关系.
     *
     * @param QueryBiztypeRelationRequest $request
     *
     * @return QueryBiztypeRelationResponse
     */
    public function queryBiztypeRelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBiztypeRelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询biztype与发起方，参与者的关联关系
     * Summary: 查询biztype关联关系.
     *
     * @param QueryBiztypeRelationRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryBiztypeRelationResponse
     */
    public function queryBiztypeRelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBiztypeRelationResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.biztype.relation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据txid，删除进行中的事务
     * Summary: 删除进行中的事务
     *
     * @param DeleteTransactionsRequest $request
     *
     * @return DeleteTransactionsResponse
     */
    public function deleteTransactions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteTransactionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据txid，删除进行中的事务
     * Summary: 删除进行中的事务
     *
     * @param DeleteTransactionsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteTransactionsResponse
     */
    public function deleteTransactionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteTransactionsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transactions.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异库模式下， 发起方和参与者的配置信息。
     * role取值：1是发起方，2是参与者；
     * activityMode取值：1是同库模式，2是异库模式；
     * actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
     * Summary: 异库接入（包括发起方和参与者）.
     *
     * @param CreateRecoveryConfigurationRequest $request
     *
     * @return CreateRecoveryConfigurationResponse
     */
    public function createRecoveryConfiguration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRecoveryConfigurationEx($request, $headers, $runtime);
    }

    /**
     * Description: 异库模式下， 发起方和参与者的配置信息。
     * role取值：1是发起方，2是参与者；
     * activityMode取值：1是同库模式，2是异库模式；
     * actionMode取值：1代表TCC模式，2是FMT模式，3是Saga模式。
     * Summary: 异库接入（包括发起方和参与者）.
     *
     * @param CreateRecoveryConfigurationRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateRecoveryConfigurationResponse
     */
    public function createRecoveryConfigurationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRecoveryConfigurationResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.recovery.configuration.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取当前环境信息，例如租户和环境
     * Summary: 获取当前环境.
     *
     * @param GetGlobalEnvRequest $request
     *
     * @return GetGlobalEnvResponse
     */
    public function getGlobalEnv($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGlobalEnvEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取当前环境信息，例如租户和环境
     * Summary: 获取当前环境.
     *
     * @param GetGlobalEnvRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetGlobalEnvResponse
     */
    public function getGlobalEnvEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGlobalEnvResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.global.env.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取instanceId
     * Summary: 获取instanceId.
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
     * Description: 获取instanceId
     * Summary: 获取instanceId.
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

        return GetMiddlewareInstanceResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.middleware.instance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取zone信息
     * Summary: 获取zone信息.
     *
     * @param AllZoneRequest $request
     *
     * @return AllZoneResponse
     */
    public function allZone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allZoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取zone信息
     * Summary: 获取zone信息.
     *
     * @param AllZoneRequest $request
     * @param string[]       $headers
     * @param RuntimeOptions $runtime
     *
     * @return AllZoneResponse
     */
    public function allZoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllZoneResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.zone.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起方接入配置的修改
     * Summary: 发起方编辑.
     *
     * @param UpdateRecoveryInitiatorsRequest $request
     *
     * @return UpdateRecoveryInitiatorsResponse
     */
    public function updateRecoveryInitiators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRecoveryInitiatorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起方接入配置的修改
     * Summary: 发起方编辑.
     *
     * @param UpdateRecoveryInitiatorsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateRecoveryInitiatorsResponse
     */
    public function updateRecoveryInitiatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRecoveryInitiatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.recovery.initiators.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用作为参与者查询所有发起者
     * Summary: 应用作为参与者查询所有发起者.
     *
     * @param ListBiztypesInitiatorsRequest $request
     *
     * @return ListBiztypesInitiatorsResponse
     */
    public function listBiztypesInitiators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listBiztypesInitiatorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用作为参与者查询所有发起者
     * Summary: 应用作为参与者查询所有发起者.
     *
     * @param ListBiztypesInitiatorsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListBiztypesInitiatorsResponse
     */
    public function listBiztypesInitiatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListBiztypesInitiatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.biztypes.initiators.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据app获取数据源列表
     * Summary: 根据app获取数据源列表.
     *
     * @param AllInitiatorsDatasourcesRequest $request
     *
     * @return AllInitiatorsDatasourcesResponse
     */
    public function allInitiatorsDatasources($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allInitiatorsDatasourcesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据app获取数据源列表
     * Summary: 根据app获取数据源列表.
     *
     * @param AllInitiatorsDatasourcesRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AllInitiatorsDatasourcesResponse
     */
    public function allInitiatorsDatasourcesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllInitiatorsDatasourcesResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.initiators.datasources.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据app+dsName获取所有表
     * Summary: 根据app+dsName获取所有表.
     *
     * @param AllInitiatorsTablesRequest $request
     *
     * @return AllInitiatorsTablesResponse
     */
    public function allInitiatorsTables($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allInitiatorsTablesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据app+dsName获取所有表
     * Summary: 根据app+dsName获取所有表.
     *
     * @param AllInitiatorsTablesRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AllInitiatorsTablesResponse
     */
    public function allInitiatorsTablesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllInitiatorsTablesResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.initiators.tables.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起方联调
     * Summary: 发起方联调.
     *
     * @param DebugInitiatorsRequest $request
     *
     * @return DebugInitiatorsResponse
     */
    public function debugInitiators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->debugInitiatorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起方联调
     * Summary: 发起方联调.
     *
     * @param DebugInitiatorsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DebugInitiatorsResponse
     */
    public function debugInitiatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DebugInitiatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.initiators.debug', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单个发起方详情
     * Summary: 单个发起方详情.
     *
     * @param GetRecoveryInitiatorsRequest $request
     *
     * @return GetRecoveryInitiatorsResponse
     */
    public function getRecoveryInitiators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getRecoveryInitiatorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 单个发起方详情
     * Summary: 单个发起方详情.
     *
     * @param GetRecoveryInitiatorsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetRecoveryInitiatorsResponse
     */
    public function getRecoveryInitiatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetRecoveryInitiatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.recovery.initiators.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 参与者接入，录入参与者信息
     * Summary: 参与者接入.
     *
     * @param CreateRecoveryParticipatorsRequest $request
     *
     * @return CreateRecoveryParticipatorsResponse
     */
    public function createRecoveryParticipators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createRecoveryParticipatorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 参与者接入，录入参与者信息
     * Summary: 参与者接入.
     *
     * @param CreateRecoveryParticipatorsRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateRecoveryParticipatorsResponse
     */
    public function createRecoveryParticipatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateRecoveryParticipatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.recovery.participators.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新参与者配置信息
     * Summary: 参与者编辑.
     *
     * @param UpdateRecoveryParticipatorsRequest $request
     *
     * @return UpdateRecoveryParticipatorsResponse
     */
    public function updateRecoveryParticipators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRecoveryParticipatorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新参与者配置信息
     * Summary: 参与者编辑.
     *
     * @param UpdateRecoveryParticipatorsRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UpdateRecoveryParticipatorsResponse
     */
    public function updateRecoveryParticipatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRecoveryParticipatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.recovery.participators.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  应用作为发起者查询所有参与者
     * Summary:  应用作为发起者查询所有参与者.
     *
     * @param ListBiztypesParticipatorsRequest $request
     *
     * @return ListBiztypesParticipatorsResponse
     */
    public function listBiztypesParticipators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listBiztypesParticipatorsEx($request, $headers, $runtime);
    }

    /**
     * Description:  应用作为发起者查询所有参与者
     * Summary:  应用作为发起者查询所有参与者.
     *
     * @param ListBiztypesParticipatorsRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListBiztypesParticipatorsResponse
     */
    public function listBiztypesParticipatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListBiztypesParticipatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.biztypes.participators.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据app获取所有的参与者名称
     * Summary: 根据app获取所有的参与者名称.
     *
     * @param AllParticipatorsActionamesRequest $request
     *
     * @return AllParticipatorsActionamesResponse
     */
    public function allParticipatorsActionames($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allParticipatorsActionamesEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据app获取所有的参与者名称
     * Summary: 根据app获取所有的参与者名称.
     *
     * @param AllParticipatorsActionamesRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return AllParticipatorsActionamesResponse
     */
    public function allParticipatorsActionamesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllParticipatorsActionamesResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.participators.actionames.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 参与者联调
     * Summary: 参与者联调.
     *
     * @param DebugParticipatorsRequest $request
     *
     * @return DebugParticipatorsResponse
     */
    public function debugParticipators($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->debugParticipatorsEx($request, $headers, $runtime);
    }

    /**
     * Description: 参与者联调
     * Summary: 参与者联调.
     *
     * @param DebugParticipatorsRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DebugParticipatorsResponse
     */
    public function debugParticipatorsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DebugParticipatorsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.participators.debug', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交回滚方法参数
     * Summary: 获取action的调用参数.
     *
     * @param QueryActionParamRequest $request
     *
     * @return QueryActionParamResponse
     */
    public function queryActionParam($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryActionParamEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交回滚方法参数
     * Summary: 获取action的调用参数.
     *
     * @param QueryActionParamRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryActionParamResponse
     */
    public function queryActionParamEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryActionParamResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.action.param.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分布式事务-执行单元切换
     * Summary: 分布式事务执行单元切换.
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
     * Description: 分布式事务-执行单元切换
     * Summary: 分布式事务执行单元切换.
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

        return ExecuteSwitchoverResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.switchover.execute', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分布式事务-取消单元切换
     * Summary: 分布式事务取消单元切换.
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
     * Description: 分布式事务-取消单元切换
     * Summary: 分布式事务取消单元切换.
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

        return CancelSwitchoverResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.switchover.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分布式事务-查询单元切换状态
     * Summary: 查询分布式事务单元切换状态
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
     * Description: 分布式事务-查询单元切换状态
     * Summary: 查询分布式事务单元切换状态
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

        return QuerySwitchoverResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.switchover.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
     * Summary: 事务趋势图.
     *
     * @param CountBiztypesTrendsRequest $request
     *
     * @return CountBiztypesTrendsResponse
     */
    public function countBiztypesTrends($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countBiztypesTrendsEx($request, $headers, $runtime);
    }

    /**
     * Description: 趋势图，包括异常数曲线，主事务数曲线，分支事务数曲线
     * Summary: 事务趋势图.
     *
     * @param CountBiztypesTrendsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CountBiztypesTrendsResponse
     */
    public function countBiztypesTrendsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountBiztypesTrendsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.biztypes.trends.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
     * Summary: 事务概览统计接口.
     *
     * @param GetGlobalStatsRequest $request
     *
     * @return GetGlobalStatsResponse
     */
    public function getGlobalStats($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGlobalStatsEx($request, $headers, $runtime);
    }

    /**
     * Description: 全局统计数据，包括异常事务数、进行中事务数、当天事务数
     * Summary: 事务概览统计接口.
     *
     * @param GetGlobalStatsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetGlobalStatsResponse
     */
    public function getGlobalStatsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGlobalStatsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.global.stats.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 联调历史列表
     * Summary: 联调历史列表.
     *
     * @param ListTransactionDebugsRequest $request
     *
     * @return ListTransactionDebugsResponse
     */
    public function listTransactionDebugs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listTransactionDebugsEx($request, $headers, $runtime);
    }

    /**
     * Description: 联调历史列表
     * Summary: 联调历史列表.
     *
     * @param ListTransactionDebugsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListTransactionDebugsResponse
     */
    public function listTransactionDebugsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListTransactionDebugsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transaction.debugs.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单个联调记录详情
     * Summary: 单个联调记录详情.
     *
     * @param GetTransactionsDebugsRequest $request
     *
     * @return GetTransactionsDebugsResponse
     */
    public function getTransactionsDebugs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTransactionsDebugsEx($request, $headers, $runtime);
    }

    /**
     * Description: 单个联调记录详情
     * Summary: 单个联调记录详情.
     *
     * @param GetTransactionsDebugsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetTransactionsDebugsResponse
     */
    public function getTransactionsDebugsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTransactionsDebugsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transactions.debugs.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 事务高级查询
     * Summary: 事务高级查询.
     *
     * @param QueryTransactionsRequest $request
     *
     * @return QueryTransactionsResponse
     */
    public function queryTransactions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTransactionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 事务高级查询
     * Summary: 事务高级查询.
     *
     * @param QueryTransactionsRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryTransactionsResponse
     */
    public function queryTransactionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTransactionsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transactions.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单个事务详情
     * Summary: 单个事务详情.
     *
     * @param GetTransactionsRequest $request
     *
     * @return GetTransactionsResponse
     */
    public function getTransactions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTransactionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 单个事务详情
     * Summary: 单个事务详情.
     *
     * @param GetTransactionsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetTransactionsResponse
     */
    public function getTransactionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTransactionsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transactions.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 悬挂事务恢复
     * Summary: 创建事务恢复.
     *
     * @param CreateTransactionsCorrectionsRequest $request
     *
     * @return CreateTransactionsCorrectionsResponse
     */
    public function createTransactionsCorrections($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTransactionsCorrectionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 悬挂事务恢复
     * Summary: 创建事务恢复.
     *
     * @param CreateTransactionsCorrectionsRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateTransactionsCorrectionsResponse
     */
    public function createTransactionsCorrectionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTransactionsCorrectionsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transactions.corrections.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单个事务恢复详情
     * Summary: 单个事务恢复详情.
     *
     * @param GetTransactionsCorrectionsRequest $request
     *
     * @return GetTransactionsCorrectionsResponse
     */
    public function getTransactionsCorrections($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTransactionsCorrectionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 单个事务恢复详情
     * Summary: 单个事务恢复详情.
     *
     * @param GetTransactionsCorrectionsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetTransactionsCorrectionsResponse
     */
    public function getTransactionsCorrectionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTransactionsCorrectionsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transactions.corrections.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 执行事务订正
     * Summary: 执行事务订正.
     *
     * @param ExecTransactionsCorrectionsRequest $request
     *
     * @return ExecTransactionsCorrectionsResponse
     */
    public function execTransactionsCorrections($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execTransactionsCorrectionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 执行事务订正
     * Summary: 执行事务订正.
     *
     * @param ExecTransactionsCorrectionsRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ExecTransactionsCorrectionsResponse
     */
    public function execTransactionsCorrectionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecTransactionsCorrectionsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transactions.corrections.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 事务订正列表
     * Summary: 事务订正列表.
     *
     * @param ListTransactionCorrectionsRequest $request
     *
     * @return ListTransactionCorrectionsResponse
     */
    public function listTransactionCorrections($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listTransactionCorrectionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 事务订正列表
     * Summary: 事务订正列表.
     *
     * @param ListTransactionCorrectionsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ListTransactionCorrectionsResponse
     */
    public function listTransactionCorrectionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListTransactionCorrectionsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transaction.corrections.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起方app列表
     * Summary: 发起方app列表.
     *
     * @param ListTransactionAppsRequest $request
     *
     * @return ListTransactionAppsResponse
     */
    public function listTransactionApps($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listTransactionAppsEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起方app列表
     * Summary: 发起方app列表.
     *
     * @param ListTransactionAppsRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListTransactionAppsResponse
     */
    public function listTransactionAppsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListTransactionAppsResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transaction.apps.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 针对特定图，组装的特定数据结构 接口
     * Summary: 事务详情.
     *
     * @param GetTransactionChartRequest $request
     *
     * @return GetTransactionChartResponse
     */
    public function getTransactionChart($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTransactionChartEx($request, $headers, $runtime);
    }

    /**
     * Description: 针对特定图，组装的特定数据结构 接口
     * Summary: 事务详情.
     *
     * @param GetTransactionChartRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return GetTransactionChartResponse
     */
    public function getTransactionChartEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTransactionChartResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transaction.chart.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取Saga状态机事务执行记录，返回状态图json
     * Summary: 获取Saga状态机事务执行记录json.
     *
     * @param GetTransactionSagaRequest $request
     *
     * @return GetTransactionSagaResponse
     */
    public function getTransactionSaga($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTransactionSagaEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取Saga状态机事务执行记录，返回状态图json
     * Summary: 获取Saga状态机事务执行记录json.
     *
     * @param GetTransactionSagaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetTransactionSagaResponse
     */
    public function getTransactionSagaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTransactionSagaResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.transaction.saga.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 白名单列表
     * Summary: 白名单列表.
     *
     * @param ListWhitelistRequest $request
     *
     * @return ListWhitelistResponse
     */
    public function listWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 白名单列表
     * Summary: 白名单列表.
     *
     * @param ListWhitelistRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ListWhitelistResponse
     */
    public function listWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListWhitelistResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.whitelist.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 白名单更新
     * Summary: 白名单更新.
     *
     * @param UpdateWhitelistRequest $request
     *
     * @return UpdateWhitelistResponse
     */
    public function updateWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 白名单更新
     * Summary: 白名单更新.
     *
     * @param UpdateWhitelistRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateWhitelistResponse
     */
    public function updateWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateWhitelistResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.whitelist.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 白名单添加
     * Summary: 白名单添加.
     *
     * @param AddWhitelistRequest $request
     *
     * @return AddWhitelistResponse
     */
    public function addWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 白名单添加
     * Summary: 白名单添加.
     *
     * @param AddWhitelistRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AddWhitelistResponse
     */
    public function addWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddWhitelistResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.whitelist.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: xts failover容灾推送
     * Summary: 容灾推送
     *
     * @param PushWhitelistRequest $request
     *
     * @return PushWhitelistResponse
     */
    public function pushWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: xts failover容灾推送
     * Summary: 容灾推送
     *
     * @param PushWhitelistRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return PushWhitelistResponse
     */
    public function pushWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushWhitelistResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.whitelist.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除白名单
     * Summary: 删除白名单.
     *
     * @param DeleteWhitelistRequest $request
     *
     * @return DeleteWhitelistResponse
     */
    public function deleteWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除白名单
     * Summary: 删除白名单.
     *
     * @param DeleteWhitelistRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteWhitelistResponse
     */
    public function deleteWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteWhitelistResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.whitelist.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 弹性位配置列表
     * Summary: 弹性位配置列表.
     *
     * @param ListWhitelistZonesRequest $request
     *
     * @return ListWhitelistZonesResponse
     */
    public function listWhitelistZones($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listWhitelistZonesEx($request, $headers, $runtime);
    }

    /**
     * Description: 弹性位配置列表
     * Summary: 弹性位配置列表.
     *
     * @param ListWhitelistZonesRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListWhitelistZonesResponse
     */
    public function listWhitelistZonesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListWhitelistZonesResponse::fromMap($this->doRequest('1.0', 'sofa.dtx.whitelist.zones.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
