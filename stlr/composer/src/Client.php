<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\STLR\Models\AddEcarAvitivedataRequest;
use AntChain\STLR\Models\AddEcarAvitivedataResponse;
use AntChain\STLR\Models\AddEcarGreenoperationRequest;
use AntChain\STLR\Models\AddEcarGreenoperationResponse;
use AntChain\STLR\Models\AddPdcpAuthRequest;
use AntChain\STLR\Models\AddPdcpAuthResponse;
use AntChain\STLR\Models\CountEcarActivedataRequest;
use AntChain\STLR\Models\CountEcarActivedataResponse;
use AntChain\STLR\Models\CountEcarGreenoperationRequest;
use AntChain\STLR\Models\CountEcarGreenoperationResponse;
use AntChain\STLR\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\STLR\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\STLR\Models\DescribeAcarActivityRequest;
use AntChain\STLR\Models\DescribeAcarActivityResponse;
use AntChain\STLR\Models\DescribeAcarDailyemissionsRequest;
use AntChain\STLR\Models\DescribeAcarDailyemissionsResponse;
use AntChain\STLR\Models\DescribeAcarLastemissiondataRequest;
use AntChain\STLR\Models\DescribeAcarLastemissiondataResponse;
use AntChain\STLR\Models\DescribeAcarReductionemissionsRequest;
use AntChain\STLR\Models\DescribeAcarReductionemissionsResponse;
use AntChain\STLR\Models\DescribeAcarScopemissionRequest;
use AntChain\STLR\Models\DescribeAcarScopemissionResponse;
use AntChain\STLR\Models\DetailEcarAvitivedataRequest;
use AntChain\STLR\Models\DetailEcarAvitivedataResponse;
use AntChain\STLR\Models\GetPdcpBlockchainRequest;
use AntChain\STLR\Models\GetPdcpBlockchainResponse;
use AntChain\STLR\Models\ListEcarGreenoperationRequest;
use AntChain\STLR\Models\ListEcarGreenoperationResponse;
use AntChain\STLR\Models\PreviewEcarAvitivedataRequest;
use AntChain\STLR\Models\PreviewEcarAvitivedataResponse;
use AntChain\STLR\Models\PushPdcpBlockchainRequest;
use AntChain\STLR\Models\PushPdcpBlockchainResponse;
use AntChain\STLR\Models\QueryEmissionCounteractionRequest;
use AntChain\STLR\Models\QueryEmissionCounteractionResponse;
use AntChain\STLR\Models\QueryEmissionGroupbycategoryRequest;
use AntChain\STLR\Models\QueryEmissionGroupbycategoryResponse;
use AntChain\STLR\Models\QueryEmissionGroupbycityRequest;
use AntChain\STLR\Models\QueryEmissionGroupbycityResponse;
use AntChain\STLR\Models\QueryEmissionGroupbylocationRequest;
use AntChain\STLR\Models\QueryEmissionGroupbylocationResponse;
use AntChain\STLR\Models\QueryEmissionReductionRequest;
use AntChain\STLR\Models\QueryEmissionReductionResponse;
use AntChain\STLR\Models\QueryEmissionTotalRequest;
use AntChain\STLR\Models\QueryEmissionTotalResponse;
use AntChain\STLR\Models\QueryGatewayAccountRequest;
use AntChain\STLR\Models\QueryGatewayAccountResponse;
use AntChain\STLR\Models\QueryPdcpAccountRequest;
use AntChain\STLR\Models\QueryPdcpAccountResponse;
use AntChain\STLR\Models\QueryPdcpAuthRequest;
use AntChain\STLR\Models\QueryPdcpAuthResponse;
use AntChain\STLR\Models\QueryPdcpDataRequest;
use AntChain\STLR\Models\QueryPdcpDataResponse;
use AntChain\STLR\Models\QueryThirdCertRequest;
use AntChain\STLR\Models\QueryThirdCertResponse;
use AntChain\STLR\Models\RegisterPdcpAccountRequest;
use AntChain\STLR\Models\RegisterPdcpAccountResponse;
use AntChain\STLR\Models\UpdatePdcpAuthRequest;
use AntChain\STLR\Models\UpdatePdcpAuthResponse;
use AntChain\STLR\Models\UploadEcarFileRequest;
use AntChain\STLR\Models\UploadEcarFileResponse;
use AntChain\STLR\Models\UploadPdcpBlockchainRequest;
use AntChain\STLR\Models\UploadPdcpBlockchainResponse;
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
            // 证书授权产品信息
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
                    'sdk_version'      => '2.1.2',
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
     * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
     * Summary: 查询当前活动资料信息.
     *
     * @param DescribeAcarActivityRequest $request
     *
     * @return DescribeAcarActivityResponse
     */
    public function describeAcarActivity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeAcarActivityEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
     * Summary: 查询当前活动资料信息.
     *
     * @param DescribeAcarActivityRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DescribeAcarActivityResponse
     */
    public function describeAcarActivityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeAcarActivityResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.acar.activity.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
     * Summary: 查询当前活动的每日碳排放量.
     *
     * @param DescribeAcarDailyemissionsRequest $request
     *
     * @return DescribeAcarDailyemissionsResponse
     */
    public function describeAcarDailyemissions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeAcarDailyemissionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
     * Summary: 查询当前活动的每日碳排放量.
     *
     * @param DescribeAcarDailyemissionsRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DescribeAcarDailyemissionsResponse
     */
    public function describeAcarDailyemissionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeAcarDailyemissionsResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.acar.dailyemissions.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
     * Summary: 查询当前活动各范围的碳排放量.
     *
     * @param DescribeAcarScopemissionRequest $request
     *
     * @return DescribeAcarScopemissionResponse
     */
    public function describeAcarScopemission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeAcarScopemissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
     * Summary: 查询当前活动各范围的碳排放量.
     *
     * @param DescribeAcarScopemissionRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DescribeAcarScopemissionResponse
     */
    public function describeAcarScopemissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeAcarScopemissionResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.acar.scopemission.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
     * Summary: 获取减排情况.
     *
     * @param DescribeAcarReductionemissionsRequest $request
     *
     * @return DescribeAcarReductionemissionsResponse
     */
    public function describeAcarReductionemissions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeAcarReductionemissionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
     * Summary: 获取减排情况.
     *
     * @param DescribeAcarReductionemissionsRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return DescribeAcarReductionemissionsResponse
     */
    public function describeAcarReductionemissionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeAcarReductionemissionsResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.acar.reductionemissions.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询最近排放数据，返回最近排放数据信息
     * Summary: 查询最近排放数据.
     *
     * @param DescribeAcarLastemissiondataRequest $request
     *
     * @return DescribeAcarLastemissiondataResponse
     */
    public function describeAcarLastemissiondata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeAcarLastemissiondataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询最近排放数据，返回最近排放数据信息
     * Summary: 查询最近排放数据.
     *
     * @param DescribeAcarLastemissiondataRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return DescribeAcarLastemissiondataResponse
     */
    public function describeAcarLastemissiondataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeAcarLastemissiondataResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.acar.lastemissiondata.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳总量查询
     * Summary: 碳总量查询.
     *
     * @param QueryEmissionTotalRequest $request
     *
     * @return QueryEmissionTotalResponse
     */
    public function queryEmissionTotal($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEmissionTotalEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳总量查询
     * Summary: 碳总量查询.
     *
     * @param QueryEmissionTotalRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryEmissionTotalResponse
     */
    public function queryEmissionTotalEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEmissionTotalResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.emission.total.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳排放总量分类统计
     * Summary: 碳排放总量分类统计
     *
     * @param QueryEmissionGroupbycategoryRequest $request
     *
     * @return QueryEmissionGroupbycategoryResponse
     */
    public function queryEmissionGroupbycategory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEmissionGroupbycategoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳排放总量分类统计
     * Summary: 碳排放总量分类统计
     *
     * @param QueryEmissionGroupbycategoryRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryEmissionGroupbycategoryResponse
     */
    public function queryEmissionGroupbycategoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEmissionGroupbycategoryResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.emission.groupbycategory.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳排放总量分单元统计
     * Summary: 碳排放总量分单元统计
     *
     * @param QueryEmissionGroupbylocationRequest $request
     *
     * @return QueryEmissionGroupbylocationResponse
     */
    public function queryEmissionGroupbylocation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEmissionGroupbylocationEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳排放总量分单元统计
     * Summary: 碳排放总量分单元统计
     *
     * @param QueryEmissionGroupbylocationRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryEmissionGroupbylocationResponse
     */
    public function queryEmissionGroupbylocationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEmissionGroupbylocationResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.emission.groupbylocation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳排放总量分城市统计
     * Summary: 碳排放总量分城市统计
     *
     * @param QueryEmissionGroupbycityRequest $request
     *
     * @return QueryEmissionGroupbycityResponse
     */
    public function queryEmissionGroupbycity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEmissionGroupbycityEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳排放总量分城市统计
     * Summary: 碳排放总量分城市统计
     *
     * @param QueryEmissionGroupbycityRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryEmissionGroupbycityResponse
     */
    public function queryEmissionGroupbycityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEmissionGroupbycityResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.emission.groupbycity.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 减排统计查询
     * Summary: 减排统计查询.
     *
     * @param QueryEmissionReductionRequest $request
     *
     * @return QueryEmissionReductionResponse
     */
    public function queryEmissionReduction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEmissionReductionEx($request, $headers, $runtime);
    }

    /**
     * Description: 减排统计查询
     * Summary: 减排统计查询.
     *
     * @param QueryEmissionReductionRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryEmissionReductionResponse
     */
    public function queryEmissionReductionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEmissionReductionResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.emission.reduction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳抵消量统计
     * Summary: 碳抵消量统计
     *
     * @param QueryEmissionCounteractionRequest $request
     *
     * @return QueryEmissionCounteractionResponse
     */
    public function queryEmissionCounteraction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEmissionCounteractionEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳抵消量统计
     * Summary: 碳抵消量统计
     *
     * @param QueryEmissionCounteractionRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryEmissionCounteractionResponse
     */
    public function queryEmissionCounteractionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEmissionCounteractionResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.emission.counteraction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账户开通接口。开通协作平台和链上账户
     * Summary: 账户开通接口.
     *
     * @param RegisterPdcpAccountRequest $request
     *
     * @return RegisterPdcpAccountResponse
     */
    public function registerPdcpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerPdcpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 账户开通接口。开通协作平台和链上账户
     * Summary: 账户开通接口.
     *
     * @param RegisterPdcpAccountRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return RegisterPdcpAccountResponse
     */
    public function registerPdcpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterPdcpAccountResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.account.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 存证接口
     * Summary: 存证接口.
     *
     * @param PushPdcpBlockchainRequest $request
     *
     * @return PushPdcpBlockchainResponse
     */
    public function pushPdcpBlockchain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushPdcpBlockchainEx($request, $headers, $runtime);
    }

    /**
     * Description: 存证接口
     * Summary: 存证接口.
     *
     * @param PushPdcpBlockchainRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PushPdcpBlockchainResponse
     */
    public function pushPdcpBlockchainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushPdcpBlockchainResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.blockchain.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异步存证接口
     * Summary: 异步存证接口.
     *
     * @param UploadPdcpBlockchainRequest $request
     *
     * @return UploadPdcpBlockchainResponse
     */
    public function uploadPdcpBlockchain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadPdcpBlockchainEx($request, $headers, $runtime);
    }

    /**
     * Description: 异步存证接口
     * Summary: 异步存证接口.
     *
     * @param UploadPdcpBlockchainRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UploadPdcpBlockchainResponse
     */
    public function uploadPdcpBlockchainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadPdcpBlockchainResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.blockchain.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询异步存证结果
     * Summary: 查询异步存证结果.
     *
     * @param GetPdcpBlockchainRequest $request
     *
     * @return GetPdcpBlockchainResponse
     */
    public function getPdcpBlockchain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getPdcpBlockchainEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询异步存证结果
     * Summary: 查询异步存证结果.
     *
     * @param GetPdcpBlockchainRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return GetPdcpBlockchainResponse
     */
    public function getPdcpBlockchainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetPdcpBlockchainResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.blockchain.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上账户查询接口
     * Summary: 链上账户查询接口.
     *
     * @param QueryPdcpAccountRequest $request
     *
     * @return QueryPdcpAccountResponse
     */
    public function queryPdcpAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdcpAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上账户查询接口
     * Summary: 链上账户查询接口.
     *
     * @param QueryPdcpAccountRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryPdcpAccountResponse
     */
    public function queryPdcpAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdcpAccountResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.account.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增授权接口
     * Summary: 新增授权接口.
     *
     * @param AddPdcpAuthRequest $request
     *
     * @return AddPdcpAuthResponse
     */
    public function addPdcpAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addPdcpAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增授权接口
     * Summary: 新增授权接口.
     *
     * @param AddPdcpAuthRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AddPdcpAuthResponse
     */
    public function addPdcpAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddPdcpAuthResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.auth.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权取消、授权审批接口
     * Summary: 授权接口变更.
     *
     * @param UpdatePdcpAuthRequest $request
     *
     * @return UpdatePdcpAuthResponse
     */
    public function updatePdcpAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updatePdcpAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权取消、授权审批接口
     * Summary: 授权接口变更.
     *
     * @param UpdatePdcpAuthRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdatePdcpAuthResponse
     */
    public function updatePdcpAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdatePdcpAuthResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.auth.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 路由账户查询接口
     * Summary: 路由账户查询接口.
     *
     * @param QueryGatewayAccountRequest $request
     *
     * @return QueryGatewayAccountResponse
     */
    public function queryGatewayAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGatewayAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 路由账户查询接口
     * Summary: 路由账户查询接口.
     *
     * @param QueryGatewayAccountRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryGatewayAccountResponse
     */
    public function queryGatewayAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGatewayAccountResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.gateway.account.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权记录查询
     * Summary: 授权记录查询.
     *
     * @param QueryPdcpAuthRequest $request
     *
     * @return QueryPdcpAuthResponse
     */
    public function queryPdcpAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdcpAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权记录查询
     * Summary: 授权记录查询.
     *
     * @param QueryPdcpAuthRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryPdcpAuthResponse
     */
    public function queryPdcpAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdcpAuthResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.auth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权数据查询
     * Summary: 授权数据查询.
     *
     * @param QueryPdcpDataRequest $request
     *
     * @return QueryPdcpDataResponse
     */
    public function queryPdcpData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdcpDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权数据查询
     * Summary: 授权数据查询.
     *
     * @param QueryPdcpDataRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryPdcpDataResponse
     */
    public function queryPdcpDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdcpDataResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.data.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增排放活动数据
     * Summary: 新增排放活动数据.
     *
     * @param AddEcarAvitivedataRequest $request
     *
     * @return AddEcarAvitivedataResponse
     */
    public function addEcarAvitivedata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addEcarAvitivedataEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增排放活动数据
     * Summary: 新增排放活动数据.
     *
     * @param AddEcarAvitivedataRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AddEcarAvitivedataResponse
     */
    public function addEcarAvitivedataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddEcarAvitivedataResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.avitivedata.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询排放活动数据详情
     * Summary: 查询排放活动数据详情.
     *
     * @param DetailEcarAvitivedataRequest $request
     *
     * @return DetailEcarAvitivedataResponse
     */
    public function detailEcarAvitivedata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailEcarAvitivedataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询排放活动数据详情
     * Summary: 查询排放活动数据详情.
     *
     * @param DetailEcarAvitivedataRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DetailEcarAvitivedataResponse
     */
    public function detailEcarAvitivedataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailEcarAvitivedataResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.avitivedata.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 排放活动数据统计计算
     * Summary: 排放活动数据统计计算.
     *
     * @param CountEcarActivedataRequest $request
     *
     * @return CountEcarActivedataResponse
     */
    public function countEcarActivedata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countEcarActivedataEx($request, $headers, $runtime);
    }

    /**
     * Description: 排放活动数据统计计算
     * Summary: 排放活动数据统计计算.
     *
     * @param CountEcarActivedataRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CountEcarActivedataResponse
     */
    public function countEcarActivedataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountEcarActivedataResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.activedata.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件上传接口
     * Summary: 文件上传接口.
     *
     * @param UploadEcarFileRequest $request
     *
     * @return UploadEcarFileResponse
     */
    public function uploadEcarFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadEcarFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件上传接口
     * Summary: 文件上传接口.
     *
     * @param UploadEcarFileRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UploadEcarFileResponse
     */
    public function uploadEcarFileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.carbon.ecar.file.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadEcarFileResponse([
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

        return UploadEcarFileResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.file.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
     * Summary: 录入绿色行为数据.
     *
     * @param AddEcarGreenoperationRequest $request
     *
     * @return AddEcarGreenoperationResponse
     */
    public function addEcarGreenoperation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addEcarGreenoperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
     * Summary: 录入绿色行为数据.
     *
     * @param AddEcarGreenoperationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AddEcarGreenoperationResponse
     */
    public function addEcarGreenoperationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddEcarGreenoperationResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.greenoperation.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
     * Summary: 统计绿色行为数据.
     *
     * @param CountEcarGreenoperationRequest $request
     *
     * @return CountEcarGreenoperationResponse
     */
    public function countEcarGreenoperation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countEcarGreenoperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
     * Summary: 统计绿色行为数据.
     *
     * @param CountEcarGreenoperationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CountEcarGreenoperationResponse
     */
    public function countEcarGreenoperationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountEcarGreenoperationResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.greenoperation.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
     * Summary: 查询最近的绿色行为数据.
     *
     * @param ListEcarGreenoperationRequest $request
     *
     * @return ListEcarGreenoperationResponse
     */
    public function listEcarGreenoperation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listEcarGreenoperationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
     * Summary: 查询最近的绿色行为数据.
     *
     * @param ListEcarGreenoperationRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ListEcarGreenoperationResponse
     */
    public function listEcarGreenoperationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListEcarGreenoperationResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.greenoperation.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
     * Summary: 预览本年度排放统计
     *
     * @param PreviewEcarAvitivedataRequest $request
     *
     * @return PreviewEcarAvitivedataResponse
     */
    public function previewEcarAvitivedata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->previewEcarAvitivedataEx($request, $headers, $runtime);
    }

    /**
     * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
     * Summary: 预览本年度排放统计
     *
     * @param PreviewEcarAvitivedataRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PreviewEcarAvitivedataResponse
     */
    public function previewEcarAvitivedataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PreviewEcarAvitivedataResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.avitivedata.preview', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方平台调用此接口，查询用户的证书信息
     * Summary: 证书查询.
     *
     * @param QueryThirdCertRequest $request
     *
     * @return QueryThirdCertResponse
     */
    public function queryThirdCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryThirdCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方平台调用此接口，查询用户的证书信息
     * Summary: 证书查询.
     *
     * @param QueryThirdCertRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryThirdCertResponse
     */
    public function queryThirdCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryThirdCertResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.third.cert.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
