<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\FAIROPENNET\Models\AddNetworkNormalnodeRequest;
use AntChain\FAIROPENNET\Models\AddNetworkNormalnodeResponse;
use AntChain\FAIROPENNET\Models\AddPartyRequest;
use AntChain\FAIROPENNET\Models\AddPartyResponse;
use AntChain\FAIROPENNET\Models\AddPartySpaceRequest;
use AntChain\FAIROPENNET\Models\AddPartySpaceResponse;
use AntChain\FAIROPENNET\Models\AddTrustedcubenodeInfoRequest;
use AntChain\FAIROPENNET\Models\AddTrustedcubenodeInfoResponse;
use AntChain\FAIROPENNET\Models\ApplyPartyNetworkRequest;
use AntChain\FAIROPENNET\Models\ApplyPartyNetworkResponse;
use AntChain\FAIROPENNET\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\FAIROPENNET\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\FAIROPENNET\Models\CreateFlowRequest;
use AntChain\FAIROPENNET\Models\CreateFlowResponse;
use AntChain\FAIROPENNET\Models\CreateSpaceRequest;
use AntChain\FAIROPENNET\Models\CreateSpaceResponse;
use AntChain\FAIROPENNET\Models\DownloadFileRequest;
use AntChain\FAIROPENNET\Models\DownloadFileResponse;
use AntChain\FAIROPENNET\Models\GetAllcubenodeInfoRequest;
use AntChain\FAIROPENNET\Models\GetAllcubenodeInfoResponse;
use AntChain\FAIROPENNET\Models\GetGovernancemoduleNetworkidRequest;
use AntChain\FAIROPENNET\Models\GetGovernancemoduleNetworkidResponse;
use AntChain\FAIROPENNET\Models\GetMycubenodeInfoRequest;
use AntChain\FAIROPENNET\Models\GetMycubenodeInfoResponse;
use AntChain\FAIROPENNET\Models\GetNetworkSnapshotRequest;
use AntChain\FAIROPENNET\Models\GetNetworkSnapshotResponse;
use AntChain\FAIROPENNET\Models\GetNetworkStatusRequest;
use AntChain\FAIROPENNET\Models\GetNetworkStatusResponse;
use AntChain\FAIROPENNET\Models\GetNodeListRequest;
use AntChain\FAIROPENNET\Models\GetNodeListResponse;
use AntChain\FAIROPENNET\Models\GetNormalmoduleNodeidRequest;
use AntChain\FAIROPENNET\Models\GetNormalmoduleNodeidResponse;
use AntChain\FAIROPENNET\Models\GetNormalnodeIdentityinfoRequest;
use AntChain\FAIROPENNET\Models\GetNormalnodeIdentityinfoResponse;
use AntChain\FAIROPENNET\Models\InitClientConfigRequest;
use AntChain\FAIROPENNET\Models\InitClientConfigResponse;
use AntChain\FAIROPENNET\Models\QueryInstanceStatusRequest;
use AntChain\FAIROPENNET\Models\QueryInstanceStatusResponse;
use AntChain\FAIROPENNET\Models\QueryPartyRegisterstatusRequest;
use AntChain\FAIROPENNET\Models\QueryPartyRegisterstatusResponse;
use AntChain\FAIROPENNET\Models\RegisterNormalNodeRequest;
use AntChain\FAIROPENNET\Models\RegisterNormalNodeResponse;
use AntChain\FAIROPENNET\Models\RegisterPartyRequest;
use AntChain\FAIROPENNET\Models\RegisterPartyResponse;
use AntChain\FAIROPENNET\Models\RunFlowInstanceRequest;
use AntChain\FAIROPENNET\Models\RunFlowInstanceResponse;
use AntChain\FAIROPENNET\Models\StartClientRequest;
use AntChain\FAIROPENNET\Models\StartClientResponse;
use AntChain\FAIROPENNET\Models\StartTestRequest;
use AntChain\FAIROPENNET\Models\StartTestResponse;
use AntChain\FAIROPENNET\Models\StopClientRequest;
use AntChain\FAIROPENNET\Models\StopClientResponse;
use AntChain\FAIROPENNET\Models\StopFlowinstanceRequest;
use AntChain\FAIROPENNET\Models\StopFlowinstanceResponse;
use AntChain\FAIROPENNET\Models\UploadFileRequest;
use AntChain\FAIROPENNET\Models\UploadFileResponse;
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
            // 静态DSL
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
                    'sdk_version'      => '1.0.5',
                    '_prod_code'       => 'FAIROPENNET',
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
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param StartTestRequest $request
     *
     * @return StartTestResponse
     */
    public function startTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试用
     * Summary: 测试用.
     *
     * @param StartTestRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return StartTestResponse
     */
    public function startTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartTestResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.test.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: 初始化客户端配置.
     *
     * @param InitClientConfigRequest $request
     *
     * @return InitClientConfigResponse
     */
    public function initClientConfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initClientConfigEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: 初始化客户端配置.
     *
     * @param InitClientConfigRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return InitClientConfigResponse
     */
    public function initClientConfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitClientConfigResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.client.config.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 启动客户端，测试连接到FAIR节点
     * Summary: 启动客户端.
     *
     * @param StartClientRequest $request
     *
     * @return StartClientResponse
     */
    public function startClient($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startClientEx($request, $headers, $runtime);
    }

    /**
     * Description: 启动客户端，测试连接到FAIR节点
     * Summary: 启动客户端.
     *
     * @param StartClientRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return StartClientResponse
     */
    public function startClientEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartClientResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.client.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取治理模块静态配置自启动协作网络的ID
     * Summary: 获取治理模块静态配置自启动协作网络的ID.
     *
     * @param GetGovernancemoduleNetworkidRequest $request
     *
     * @return GetGovernancemoduleNetworkidResponse
     */
    public function getGovernancemoduleNetworkid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getGovernancemoduleNetworkidEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取治理模块静态配置自启动协作网络的ID
     * Summary: 获取治理模块静态配置自启动协作网络的ID.
     *
     * @param GetGovernancemoduleNetworkidRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return GetGovernancemoduleNetworkidResponse
     */
    public function getGovernancemoduleNetworkidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetGovernancemoduleNetworkidResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.governancemodule.networkid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取协作网络状态
     * Summary: 获取协作网络状态
     *
     * @param GetNetworkStatusRequest $request
     *
     * @return GetNetworkStatusResponse
     */
    public function getNetworkStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getNetworkStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取协作网络状态
     * Summary: 获取协作网络状态
     *
     * @param GetNetworkStatusRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetNetworkStatusResponse
     */
    public function getNetworkStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetNetworkStatusResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.network.status.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取cube节点信息
     * Summary: 获取cube节点信息.
     *
     * @param GetMycubenodeInfoRequest $request
     *
     * @return GetMycubenodeInfoResponse
     */
    public function getMycubenodeInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMycubenodeInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取cube节点信息
     * Summary: 获取cube节点信息.
     *
     * @param GetMycubenodeInfoRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetMycubenodeInfoResponse
     */
    public function getMycubenodeInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMycubenodeInfoResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.mycubenode.info.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 手动添加cube节点
     * Summary: 手动添加cube节点.
     *
     * @param AddTrustedcubenodeInfoRequest $request
     *
     * @return AddTrustedcubenodeInfoResponse
     */
    public function addTrustedcubenodeInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addTrustedcubenodeInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 手动添加cube节点
     * Summary: 手动添加cube节点.
     *
     * @param AddTrustedcubenodeInfoRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return AddTrustedcubenodeInfoResponse
     */
    public function addTrustedcubenodeInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddTrustedcubenodeInfoResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.trustedcubenode.info.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
     * Summary: 普通节点加入协作网络.
     *
     * @param RegisterNormalNodeRequest $request
     *
     * @return RegisterNormalNodeResponse
     */
    public function registerNormalNode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerNormalNodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
     * Summary: 普通节点加入协作网络.
     *
     * @param RegisterNormalNodeRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return RegisterNormalNodeResponse
     */
    public function registerNormalNodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterNormalNodeResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.normal.node.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
     * Summary: 新建协作空间.
     *
     * @param CreateSpaceRequest $request
     *
     * @return CreateSpaceResponse
     */
    public function createSpace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createSpaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
     * Summary: 新建协作空间.
     *
     * @param CreateSpaceRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CreateSpaceResponse
     */
    public function createSpaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateSpaceResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.space.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加协作参与方到协作空间
     * Summary: 添加协作参与方到协作空间.
     *
     * @param AddPartySpaceRequest $request
     *
     * @return AddPartySpaceResponse
     */
    public function addPartySpace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addPartySpaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加协作参与方到协作空间
     * Summary: 添加协作参与方到协作空间.
     *
     * @param AddPartySpaceRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return AddPartySpaceResponse
     */
    public function addPartySpaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddPartySpaceResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.party.space.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
     * Summary: 获取协作网络快照.
     *
     * @param GetNetworkSnapshotRequest $request
     *
     * @return GetNetworkSnapshotResponse
     */
    public function getNetworkSnapshot($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getNetworkSnapshotEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
     * Summary: 获取协作网络快照.
     *
     * @param GetNetworkSnapshotRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetNetworkSnapshotResponse
     */
    public function getNetworkSnapshotEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetNetworkSnapshotResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.network.snapshot.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: shutdown client
     * Summary: shutdown client.
     *
     * @param StopClientRequest $request
     *
     * @return StopClientResponse
     */
    public function stopClient($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopClientEx($request, $headers, $runtime);
    }

    /**
     * Description: shutdown client
     * Summary: shutdown client.
     *
     * @param StopClientRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return StopClientResponse
     */
    public function stopClientEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopClientResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.client.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取普通节点自身的节点ID
     * Summary: 获取普通节点自身的节点ID.
     *
     * @param GetNormalmoduleNodeidRequest $request
     *
     * @return GetNormalmoduleNodeidResponse
     */
    public function getNormalmoduleNodeid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getNormalmoduleNodeidEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取普通节点自身的节点ID
     * Summary: 获取普通节点自身的节点ID.
     *
     * @param GetNormalmoduleNodeidRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return GetNormalmoduleNodeidResponse
     */
    public function getNormalmoduleNodeidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetNormalmoduleNodeidResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.normalmodule.nodeid.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
     * Summary: 添加协作参与方信息.
     *
     * @param AddPartyRequest $request
     *
     * @return AddPartyResponse
     */
    public function addParty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addPartyEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
     * Summary: 添加协作参与方信息.
     *
     * @param AddPartyRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return AddPartyResponse
     */
    public function addPartyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddPartyResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.party.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取普通节点身份信息
     * Summary: 获取普通节点身份信息.
     *
     * @param GetNormalnodeIdentityinfoRequest $request
     *
     * @return GetNormalnodeIdentityinfoResponse
     */
    public function getNormalnodeIdentityinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getNormalnodeIdentityinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取普通节点身份信息
     * Summary: 获取普通节点身份信息.
     *
     * @param GetNormalnodeIdentityinfoRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return GetNormalnodeIdentityinfoResponse
     */
    public function getNormalnodeIdentityinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetNormalnodeIdentityinfoResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.normalnode.identityinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
     * Summary: 普通节点加入网络.
     *
     * @param AddNetworkNormalnodeRequest $request
     *
     * @return AddNetworkNormalnodeResponse
     */
    public function addNetworkNormalnode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addNetworkNormalnodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
     * Summary: 普通节点加入网络.
     *
     * @param AddNetworkNormalnodeRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return AddNetworkNormalnodeResponse
     */
    public function addNetworkNormalnodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddNetworkNormalnodeResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.network.normalnode.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取所有cube节点信息
     * Summary: 获取所有cube节点信息.
     *
     * @param GetAllcubenodeInfoRequest $request
     *
     * @return GetAllcubenodeInfoResponse
     */
    public function getAllcubenodeInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAllcubenodeInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取所有cube节点信息
     * Summary: 获取所有cube节点信息.
     *
     * @param GetAllcubenodeInfoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetAllcubenodeInfoResponse
     */
    public function getAllcubenodeInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAllcubenodeInfoResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.allcubenode.info.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加协作参与方到一个区块链协作网络
     * Summary: 添加协作参与方到一个区块链协作网络.
     *
     * @param ApplyPartyNetworkRequest $request
     *
     * @return ApplyPartyNetworkResponse
     */
    public function applyPartyNetwork($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyPartyNetworkEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加协作参与方到一个区块链协作网络
     * Summary: 添加协作参与方到一个区块链协作网络.
     *
     * @param ApplyPartyNetworkRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ApplyPartyNetworkResponse
     */
    public function applyPartyNetworkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyPartyNetworkResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.party.network.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建一个工作流，传入partyId，和静态flow配置
     * Summary: 创建一个工作流
     *
     * @param CreateFlowRequest $request
     *
     * @return CreateFlowResponse
     */
    public function createFlow($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createFlowEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建一个工作流，传入partyId，和静态flow配置
     * Summary: 创建一个工作流
     *
     * @param CreateFlowRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateFlowResponse
     */
    public function createFlowEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateFlowResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.flow.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 运行工作流实例，提供动态配置
     * Summary: 运行工作流实例，提供动态配置.
     *
     * @param RunFlowInstanceRequest $request
     *
     * @return RunFlowInstanceResponse
     */
    public function runFlowInstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->runFlowInstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 运行工作流实例，提供动态配置
     * Summary: 运行工作流实例，提供动态配置.
     *
     * @param RunFlowInstanceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return RunFlowInstanceResponse
     */
    public function runFlowInstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RunFlowInstanceResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.flow.instance.run', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 停止运行中的工作流实例
     * Summary: 停止运行中的工作流实例.
     *
     * @param StopFlowinstanceRequest $request
     *
     * @return StopFlowinstanceResponse
     */
    public function stopFlowinstance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopFlowinstanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 停止运行中的工作流实例
     * Summary: 停止运行中的工作流实例.
     *
     * @param StopFlowinstanceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return StopFlowinstanceResponse
     */
    public function stopFlowinstanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopFlowinstanceResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.flowinstance.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询工作流实例状态
     * Summary: 查询工作流实例状态
     *
     * @param QueryInstanceStatusRequest $request
     *
     * @return QueryInstanceStatusResponse
     */
    public function queryInstanceStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInstanceStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询工作流实例状态
     * Summary: 查询工作流实例状态
     *
     * @param QueryInstanceStatusRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryInstanceStatusResponse
     */
    public function queryInstanceStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInstanceStatusResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.instance.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传文件
     * Summary: 上传文件.
     *
     * @param UploadFileRequest $request
     *
     * @return UploadFileResponse
     */
    public function uploadFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传文件
     * Summary: 上传文件.
     *
     * @param UploadFileRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return UploadFileResponse
     */
    public function uploadFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.fairopennet.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return UploadFileResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 下载文件
     * Summary: 下载文件.
     *
     * @param DownloadFileRequest $request
     *
     * @return DownloadFileResponse
     */
    public function downloadFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 下载文件
     * Summary: 下载文件.
     *
     * @param DownloadFileRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return DownloadFileResponse
     */
    public function downloadFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.fairopennet.file.download',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new DownloadFileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return DownloadFileResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.file.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询可用的fair节点nodeId
     * Summary: 查询fair node列表.
     *
     * @param GetNodeListRequest $request
     *
     * @return GetNodeListResponse
     */
    public function getNodeList($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getNodeListEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询可用的fair节点nodeId
     * Summary: 查询fair node列表.
     *
     * @param GetNodeListRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetNodeListResponse
     */
    public function getNodeListEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetNodeListResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.node.list.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册新用户
     * Summary: 注册新用户.
     *
     * @param RegisterPartyRequest $request
     *
     * @return RegisterPartyResponse
     */
    public function registerParty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerPartyEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册新用户
     * Summary: 注册新用户.
     *
     * @param RegisterPartyRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return RegisterPartyResponse
     */
    public function registerPartyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterPartyResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.party.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户是否注册成功
     * Summary: 查询用户注册进度.
     *
     * @param QueryPartyRegisterstatusRequest $request
     *
     * @return QueryPartyRegisterstatusResponse
     */
    public function queryPartyRegisterstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPartyRegisterstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户是否注册成功
     * Summary: 查询用户注册进度.
     *
     * @param QueryPartyRegisterstatusRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryPartyRegisterstatusResponse
     */
    public function queryPartyRegisterstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPartyRegisterstatusResponse::fromMap($this->doRequest('1.0', 'antchain.fairopennet.party.registerstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
