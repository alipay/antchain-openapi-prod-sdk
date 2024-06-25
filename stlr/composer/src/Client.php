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
use AntChain\STLR\Models\AddAuthAdminRequest;
use AntChain\STLR\Models\AddAuthAdminResponse;
use AntChain\STLR\Models\AddDataassetTypeRequest;
use AntChain\STLR\Models\AddDataassetTypeResponse;
use AntChain\STLR\Models\AddEcarAvitivedataRequest;
use AntChain\STLR\Models\AddEcarAvitivedataResponse;
use AntChain\STLR\Models\AddEcarGreenoperationRequest;
use AntChain\STLR\Models\AddEcarGreenoperationResponse;
use AntChain\STLR\Models\AddEcarOffsetacquisitionRequest;
use AntChain\STLR\Models\AddEcarOffsetacquisitionResponse;
use AntChain\STLR\Models\AddEcarOffsettranslateRequest;
use AntChain\STLR\Models\AddEcarOffsettranslateResponse;
use AntChain\STLR\Models\AddPdcpAuthRequest;
use AntChain\STLR\Models\AddPdcpAuthResponse;
use AntChain\STLR\Models\AuthEcarOffsetdatumRequest;
use AntChain\STLR\Models\AuthEcarOffsetdatumResponse;
use AntChain\STLR\Models\BatchcreateEcarGreencertificategenerationRequest;
use AntChain\STLR\Models\BatchcreateEcarGreencertificategenerationResponse;
use AntChain\STLR\Models\BatchqueryPdcpDataRequest;
use AntChain\STLR\Models\BatchqueryPdcpDataResponse;
use AntChain\STLR\Models\CheckPdcpDtraceRequest;
use AntChain\STLR\Models\CheckPdcpDtraceResponse;
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
use AntChain\STLR\Models\DetailEcarEnterprisememberRequest;
use AntChain\STLR\Models\DetailEcarEnterprisememberResponse;
use AntChain\STLR\Models\DetailEcarOffsetdatumRequest;
use AntChain\STLR\Models\DetailEcarOffsetdatumResponse;
use AntChain\STLR\Models\DetailEcarOffsettranslateRequest;
use AntChain\STLR\Models\DetailEcarOffsettranslateResponse;
use AntChain\STLR\Models\DetailPdcpDepositRequest;
use AntChain\STLR\Models\DetailPdcpDepositResponse;
use AntChain\STLR\Models\GetEcarPlaformauthtokenRequest;
use AntChain\STLR\Models\GetEcarPlaformauthtokenResponse;
use AntChain\STLR\Models\GetPdcpBlockchainRequest;
use AntChain\STLR\Models\GetPdcpBlockchainResponse;
use AntChain\STLR\Models\ListEcarEnterprisememberRequest;
use AntChain\STLR\Models\ListEcarEnterprisememberResponse;
use AntChain\STLR\Models\ListEcarGreenoperationRequest;
use AntChain\STLR\Models\ListEcarGreenoperationResponse;
use AntChain\STLR\Models\ListEcarOffsetdatumRequest;
use AntChain\STLR\Models\ListEcarOffsetdatumResponse;
use AntChain\STLR\Models\PagequeryAuthAdminRequest;
use AntChain\STLR\Models\PagequeryAuthAdminResponse;
use AntChain\STLR\Models\PagequeryDataassetTypeRequest;
use AntChain\STLR\Models\PagequeryDataassetTypeResponse;
use AntChain\STLR\Models\PreviewEcarAvitivedataRequest;
use AntChain\STLR\Models\PreviewEcarAvitivedataResponse;
use AntChain\STLR\Models\PreviewEcarOffsetdatumRequest;
use AntChain\STLR\Models\PreviewEcarOffsetdatumResponse;
use AntChain\STLR\Models\PushPdcpBlockchainRequest;
use AntChain\STLR\Models\PushPdcpBlockchainResponse;
use AntChain\STLR\Models\QueryAuthAdminRequest;
use AntChain\STLR\Models\QueryAuthAdminResponse;
use AntChain\STLR\Models\QueryDatasetCollectingRequest;
use AntChain\STLR\Models\QueryDatasetCollectingResponse;
use AntChain\STLR\Models\QueryEcarLcacalcRequest;
use AntChain\STLR\Models\QueryEcarLcacalcResponse;
use AntChain\STLR\Models\QueryEcarLcaorderRequest;
use AntChain\STLR\Models\QueryEcarLcaorderResponse;
use AntChain\STLR\Models\QueryEcarOffsetaccountRequest;
use AntChain\STLR\Models\QueryEcarOffsetaccountResponse;
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
use AntChain\STLR\Models\QueryPdcpDataassetRequest;
use AntChain\STLR\Models\QueryPdcpDataassetResponse;
use AntChain\STLR\Models\QueryPdcpDataRequest;
use AntChain\STLR\Models\QueryPdcpDataResponse;
use AntChain\STLR\Models\QueryPdcpDtraceRequest;
use AntChain\STLR\Models\QueryPdcpDtraceResponse;
use AntChain\STLR\Models\QueryPdcpOwndataRequest;
use AntChain\STLR\Models\QueryPdcpOwndataResponse;
use AntChain\STLR\Models\QueryThirdCertRequest;
use AntChain\STLR\Models\QueryThirdCertResponse;
use AntChain\STLR\Models\RegisterEcarEnterprisememberRequest;
use AntChain\STLR\Models\RegisterEcarEnterprisememberResponse;
use AntChain\STLR\Models\RegisterPdcpAccountRequest;
use AntChain\STLR\Models\RegisterPdcpAccountResponse;
use AntChain\STLR\Models\RegisterPdcpDataassetRequest;
use AntChain\STLR\Models\RegisterPdcpDataassetResponse;
use AntChain\STLR\Models\StartDatasetCollectingRequest;
use AntChain\STLR\Models\StartDatasetCollectingResponse;
use AntChain\STLR\Models\SubmitEcarGreencertificategenerationfileRequest;
use AntChain\STLR\Models\SubmitEcarGreencertificategenerationfileResponse;
use AntChain\STLR\Models\SubmitEcarLcaassementRequest;
use AntChain\STLR\Models\SubmitEcarLcaassementResponse;
use AntChain\STLR\Models\SubmitEcarLcacalcRequest;
use AntChain\STLR\Models\SubmitEcarLcacalcResponse;
use AntChain\STLR\Models\SubmitEcarLcaorderwithcustomerRequest;
use AntChain\STLR\Models\SubmitEcarLcaorderwithcustomerResponse;
use AntChain\STLR\Models\UpdatePdcpAuthRequest;
use AntChain\STLR\Models\UpdatePdcpAuthResponse;
use AntChain\STLR\Models\UploadEcarFileRequest;
use AntChain\STLR\Models\UploadEcarFileResponse;
use AntChain\STLR\Models\UploadEcarPlaformfileRequest;
use AntChain\STLR\Models\UploadEcarPlaformfileResponse;
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
            // 阶段评估明细数据
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
                    'sdk_version'      => '2.9.2',
                    '_prod_code'       => 'STLR',
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
     * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
     * Summary: 查询存证数据详情.
     *
     * @param DetailPdcpDepositRequest $request
     *
     * @return DetailPdcpDepositResponse
     */
    public function detailPdcpDeposit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailPdcpDepositEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
     * Summary: 查询存证数据详情.
     *
     * @param DetailPdcpDepositRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DetailPdcpDepositResponse
     */
    public function detailPdcpDepositEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailPdcpDepositResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.deposit.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询存证数据历史变更
     * Summary: 存证数据变更历史追溯查询.
     *
     * @param QueryPdcpDtraceRequest $request
     *
     * @return QueryPdcpDtraceResponse
     */
    public function queryPdcpDtrace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdcpDtraceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询存证数据历史变更
     * Summary: 存证数据变更历史追溯查询.
     *
     * @param QueryPdcpDtraceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryPdcpDtraceResponse
     */
    public function queryPdcpDtraceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdcpDtraceResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.dtrace.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过链山存证内容校验存证数据可信性
     * Summary: 存证数据可信校验.
     *
     * @param CheckPdcpDtraceRequest $request
     *
     * @return CheckPdcpDtraceResponse
     */
    public function checkPdcpDtrace($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkPdcpDtraceEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过链山存证内容校验存证数据可信性
     * Summary: 存证数据可信校验.
     *
     * @param CheckPdcpDtraceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CheckPdcpDtraceResponse
     */
    public function checkPdcpDtraceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckPdcpDtraceResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.dtrace.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据授权方和被授权方授权关系批量查询授权数据
     * Summary: 批量查询授权数据.
     *
     * @param BatchqueryPdcpDataRequest $request
     *
     * @return BatchqueryPdcpDataResponse
     */
    public function batchqueryPdcpData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryPdcpDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据授权方和被授权方授权关系批量查询授权数据
     * Summary: 批量查询授权数据.
     *
     * @param BatchqueryPdcpDataRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return BatchqueryPdcpDataResponse
     */
    public function batchqueryPdcpDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryPdcpDataResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.data.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户拥有的数据记录
     * Summary: 查询拥有的数据.
     *
     * @param QueryPdcpOwndataRequest $request
     *
     * @return QueryPdcpOwndataResponse
     */
    public function queryPdcpOwndata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdcpOwndataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户拥有的数据记录
     * Summary: 查询拥有的数据.
     *
     * @param QueryPdcpOwndataRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryPdcpOwndataResponse
     */
    public function queryPdcpOwndataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdcpOwndataResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.owndata.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询数据资产
     * Summary: 数据资产.
     *
     * @param QueryPdcpDataassetRequest $request
     *
     * @return QueryPdcpDataassetResponse
     */
    public function queryPdcpDataasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdcpDataassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询数据资产
     * Summary: 数据资产.
     *
     * @param QueryPdcpDataassetRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryPdcpDataassetResponse
     */
    public function queryPdcpDataassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdcpDataassetResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.dataasset.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册数据资产
     * Summary: 注册数据资产.
     *
     * @param RegisterPdcpDataassetRequest $request
     *
     * @return RegisterPdcpDataassetResponse
     */
    public function registerPdcpDataasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerPdcpDataassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册数据资产
     * Summary: 注册数据资产.
     *
     * @param RegisterPdcpDataassetRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return RegisterPdcpDataassetResponse
     */
    public function registerPdcpDataassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterPdcpDataassetResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.pdcp.dataasset.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加数据授权策略
     * Summary: 添加数据授权策略.
     *
     * @param AddAuthAdminRequest $request
     *
     * @return AddAuthAdminResponse
     */
    public function addAuthAdmin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addAuthAdminEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加数据授权策略
     * Summary: 添加数据授权策略.
     *
     * @param AddAuthAdminRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AddAuthAdminResponse
     */
    public function addAuthAdminEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddAuthAdminResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.auth.admin.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询数据授权策略
     * Summary: 分页查询数据授权策略.
     *
     * @param PagequeryAuthAdminRequest $request
     *
     * @return PagequeryAuthAdminResponse
     */
    public function pagequeryAuthAdmin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryAuthAdminEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询数据授权策略
     * Summary: 分页查询数据授权策略.
     *
     * @param PagequeryAuthAdminRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PagequeryAuthAdminResponse
     */
    public function pagequeryAuthAdminEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryAuthAdminResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.auth.admin.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据授权策略
     * Summary: 查询数据授权策略.
     *
     * @param QueryAuthAdminRequest $request
     *
     * @return QueryAuthAdminResponse
     */
    public function queryAuthAdmin($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuthAdminEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据授权策略
     * Summary: 查询数据授权策略.
     *
     * @param QueryAuthAdminRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryAuthAdminResponse
     */
    public function queryAuthAdminEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuthAdminResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.auth.admin.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据资产添加数据类型
     * Summary: 添加数据类型.
     *
     * @param AddDataassetTypeRequest $request
     *
     * @return AddDataassetTypeResponse
     */
    public function addDataassetType($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDataassetTypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据资产添加数据类型
     * Summary: 添加数据类型.
     *
     * @param AddDataassetTypeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return AddDataassetTypeResponse
     */
    public function addDataassetTypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDataassetTypeResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.dataasset.type.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询数据资产类型
     * Summary: 分页查询数据资产类型.
     *
     * @param PagequeryDataassetTypeRequest $request
     *
     * @return PagequeryDataassetTypeResponse
     */
    public function pagequeryDataassetType($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryDataassetTypeEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询数据资产类型
     * Summary: 分页查询数据资产类型.
     *
     * @param PagequeryDataassetTypeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PagequeryDataassetTypeResponse
     */
    public function pagequeryDataassetTypeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryDataassetTypeResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.dataasset.type.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
     * Summary: 开始采集外部数据.
     *
     * @param StartDatasetCollectingRequest $request
     *
     * @return StartDatasetCollectingResponse
     */
    public function startDatasetCollecting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startDatasetCollectingEx($request, $headers, $runtime);
    }

    /**
     * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
     * Summary: 开始采集外部数据.
     *
     * @param StartDatasetCollectingRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return StartDatasetCollectingResponse
     */
    public function startDatasetCollectingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartDatasetCollectingResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.dataset.collecting.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询外部数据采集状态
     * Summary: 查询外部数据采集状态
     *
     * @param QueryDatasetCollectingRequest $request
     *
     * @return QueryDatasetCollectingResponse
     */
    public function queryDatasetCollecting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatasetCollectingEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询外部数据采集状态
     * Summary: 查询外部数据采集状态
     *
     * @param QueryDatasetCollectingRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryDatasetCollectingResponse
     */
    public function queryDatasetCollectingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatasetCollectingResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.dataset.collecting.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
     * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
     * Summary: 机构会员注册.
     *
     * @param RegisterEcarEnterprisememberRequest $request
     *
     * @return RegisterEcarEnterprisememberResponse
     */
    public function registerEcarEnterprisemember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerEcarEnterprisememberEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
     * Summary: 机构会员注册.
     *
     * @param RegisterEcarEnterprisememberRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return RegisterEcarEnterprisememberResponse
     */
    public function registerEcarEnterprisememberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterEcarEnterprisememberResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.enterprisemember.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
     * Summary: 碳补偿数据采集.
     *
     * @param AddEcarOffsetacquisitionRequest $request
     *
     * @return AddEcarOffsetacquisitionResponse
     */
    public function addEcarOffsetacquisition($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addEcarOffsetacquisitionEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
     * Summary: 碳补偿数据采集.
     *
     * @param AddEcarOffsetacquisitionRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AddEcarOffsetacquisitionResponse
     */
    public function addEcarOffsetacquisitionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddEcarOffsetacquisitionResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.offsetacquisition.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
     * Summary: 碳普惠减碳量转移.
     *
     * @param AddEcarOffsettranslateRequest $request
     *
     * @return AddEcarOffsettranslateResponse
     */
    public function addEcarOffsettranslate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addEcarOffsettranslateEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
     * Summary: 碳普惠减碳量转移.
     *
     * @param AddEcarOffsettranslateRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return AddEcarOffsettranslateResponse
     */
    public function addEcarOffsettranslateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddEcarOffsettranslateResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.offsettranslate.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
     * Summary: 碳普惠数据授权.
     *
     * @param AuthEcarOffsetdatumRequest $request
     *
     * @return AuthEcarOffsetdatumResponse
     */
    public function authEcarOffsetdatum($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authEcarOffsetdatumEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
     * Summary: 碳普惠数据授权.
     *
     * @param AuthEcarOffsetdatumRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AuthEcarOffsetdatumResponse
     */
    public function authEcarOffsetdatumEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthEcarOffsetdatumResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.offsetdatum.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
     * Summary: 碳普惠数据列表查询.
     *
     * @param ListEcarOffsetdatumRequest $request
     *
     * @return ListEcarOffsetdatumResponse
     */
    public function listEcarOffsetdatum($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listEcarOffsetdatumEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
     * Summary: 碳普惠数据列表查询.
     *
     * @param ListEcarOffsetdatumRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListEcarOffsetdatumResponse
     */
    public function listEcarOffsetdatumEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListEcarOffsetdatumResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.offsetdatum.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
     * Summary: 机构会员列表查询.
     *
     * @param ListEcarEnterprisememberRequest $request
     *
     * @return ListEcarEnterprisememberResponse
     */
    public function listEcarEnterprisemember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listEcarEnterprisememberEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
     * Summary: 机构会员列表查询.
     *
     * @param ListEcarEnterprisememberRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListEcarEnterprisememberResponse
     */
    public function listEcarEnterprisememberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListEcarEnterprisememberResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.enterprisemember.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
     * Summary: 碳普惠项目数据预览.
     *
     * @param PreviewEcarOffsetdatumRequest $request
     *
     * @return PreviewEcarOffsetdatumResponse
     */
    public function previewEcarOffsetdatum($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->previewEcarOffsetdatumEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
     * Summary: 碳普惠项目数据预览.
     *
     * @param PreviewEcarOffsetdatumRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PreviewEcarOffsetdatumResponse
     */
    public function previewEcarOffsetdatumEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PreviewEcarOffsetdatumResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.offsetdatum.preview', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
     * Summary: 单个机构会员信息查询.
     *
     * @param DetailEcarEnterprisememberRequest $request
     *
     * @return DetailEcarEnterprisememberResponse
     */
    public function detailEcarEnterprisemember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailEcarEnterprisememberEx($request, $headers, $runtime);
    }

    /**
     * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
     * Summary: 单个机构会员信息查询.
     *
     * @param DetailEcarEnterprisememberRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return DetailEcarEnterprisememberResponse
     */
    public function detailEcarEnterprisememberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailEcarEnterprisememberResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.enterprisemember.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
     * Summary: 碳补偿项目账户查询.
     *
     * @param QueryEcarOffsetaccountRequest $request
     *
     * @return QueryEcarOffsetaccountResponse
     */
    public function queryEcarOffsetaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEcarOffsetaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
     * Summary: 碳补偿项目账户查询.
     *
     * @param QueryEcarOffsetaccountRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryEcarOffsetaccountResponse
     */
    public function queryEcarOffsetaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEcarOffsetaccountResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.offsetaccount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询碳补偿数据详情
     * Summary: 碳补偿数据详情.
     *
     * @param DetailEcarOffsetdatumRequest $request
     *
     * @return DetailEcarOffsetdatumResponse
     */
    public function detailEcarOffsetdatum($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailEcarOffsetdatumEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询碳补偿数据详情
     * Summary: 碳补偿数据详情.
     *
     * @param DetailEcarOffsetdatumRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return DetailEcarOffsetdatumResponse
     */
    public function detailEcarOffsetdatumEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailEcarOffsetdatumResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.offsetdatum.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询碳普惠减碳量转移记录详情
     * Summary: 碳普惠减碳量转移记录详情.
     *
     * @param DetailEcarOffsettranslateRequest $request
     *
     * @return DetailEcarOffsettranslateResponse
     */
    public function detailEcarOffsettranslate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailEcarOffsettranslateEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询碳普惠减碳量转移记录详情
     * Summary: 碳普惠减碳量转移记录详情.
     *
     * @param DetailEcarOffsettranslateRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DetailEcarOffsettranslateResponse
     */
    public function detailEcarOffsettranslateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailEcarOffsettranslateResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.offsettranslate.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
     * Summary: 平台方LCA评估结果提交.
     *
     * @param SubmitEcarLcaassementRequest $request
     *
     * @return SubmitEcarLcaassementResponse
     */
    public function submitEcarLcaassement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitEcarLcaassementEx($request, $headers, $runtime);
    }

    /**
     * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
     * Summary: 平台方LCA评估结果提交.
     *
     * @param SubmitEcarLcaassementRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SubmitEcarLcaassementResponse
     */
    public function submitEcarLcaassementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitEcarLcaassementResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.lcaassement.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方平台文件上传
     * Summary: 三方平台文件上传.
     *
     * @param UploadEcarPlaformfileRequest $request
     *
     * @return UploadEcarPlaformfileResponse
     */
    public function uploadEcarPlaformfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadEcarPlaformfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方平台文件上传
     * Summary: 三方平台文件上传.
     *
     * @param UploadEcarPlaformfileRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UploadEcarPlaformfileResponse
     */
    public function uploadEcarPlaformfileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.carbon.ecar.plaformfile.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadEcarPlaformfileResponse([
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

        return UploadEcarPlaformfileResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.plaformfile.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方平台提交LCA订单，同时包括客户入驻信息
     * Summary: LCA订单提交(含客户入驻信息).
     *
     * @param SubmitEcarLcaorderwithcustomerRequest $request
     *
     * @return SubmitEcarLcaorderwithcustomerResponse
     */
    public function submitEcarLcaorderwithcustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitEcarLcaorderwithcustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方平台提交LCA订单，同时包括客户入驻信息
     * Summary: LCA订单提交(含客户入驻信息).
     *
     * @param SubmitEcarLcaorderwithcustomerRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return SubmitEcarLcaorderwithcustomerResponse
     */
    public function submitEcarLcaorderwithcustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitEcarLcaorderwithcustomerResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.lcaorderwithcustomer.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 三方平台信登token获取
     * Summary: 三方平台获取信登token.
     *
     * @param GetEcarPlaformauthtokenRequest $request
     *
     * @return GetEcarPlaformauthtokenResponse
     */
    public function getEcarPlaformauthtoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getEcarPlaformauthtokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 三方平台信登token获取
     * Summary: 三方平台获取信登token.
     *
     * @param GetEcarPlaformauthtokenRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return GetEcarPlaformauthtokenResponse
     */
    public function getEcarPlaformauthtokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetEcarPlaformauthtokenResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.plaformauthtoken.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: LCA订单查询
     * Summary: LCA订单查询.
     *
     * @param QueryEcarLcaorderRequest $request
     *
     * @return QueryEcarLcaorderResponse
     */
    public function queryEcarLcaorder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEcarLcaorderEx($request, $headers, $runtime);
    }

    /**
     * Description: LCA订单查询
     * Summary: LCA订单查询.
     *
     * @param QueryEcarLcaorderRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryEcarLcaorderResponse
     */
    public function queryEcarLcaorderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEcarLcaorderResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.lcaorder.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 绿证发电量数据上报接口
     * Summary: 绿证发电量数据上报接口.
     *
     * @param BatchcreateEcarGreencertificategenerationRequest $request
     *
     * @return BatchcreateEcarGreencertificategenerationResponse
     */
    public function batchcreateEcarGreencertificategeneration($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateEcarGreencertificategenerationEx($request, $headers, $runtime);
    }

    /**
     * Description: 绿证发电量数据上报接口
     * Summary: 绿证发电量数据上报接口.
     *
     * @param BatchcreateEcarGreencertificategenerationRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return BatchcreateEcarGreencertificategenerationResponse
     */
    public function batchcreateEcarGreencertificategenerationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateEcarGreencertificategenerationResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.greencertificategeneration.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 产品碳足迹速算请求提交
     * Summary: 产品碳足迹速算请求提交.
     *
     * @param SubmitEcarLcacalcRequest $request
     *
     * @return SubmitEcarLcacalcResponse
     */
    public function submitEcarLcacalc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitEcarLcacalcEx($request, $headers, $runtime);
    }

    /**
     * Description: 产品碳足迹速算请求提交
     * Summary: 产品碳足迹速算请求提交.
     *
     * @param SubmitEcarLcacalcRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SubmitEcarLcacalcResponse
     */
    public function submitEcarLcacalcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitEcarLcacalcResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.lcacalc.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 产品碳足迹速算结果查询
     * Summary: 产品碳足迹速算结果查询.
     *
     * @param QueryEcarLcacalcRequest $request
     *
     * @return QueryEcarLcacalcResponse
     */
    public function queryEcarLcacalc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEcarLcacalcEx($request, $headers, $runtime);
    }

    /**
     * Description: 产品碳足迹速算结果查询
     * Summary: 产品碳足迹速算结果查询.
     *
     * @param QueryEcarLcacalcRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryEcarLcacalcResponse
     */
    public function queryEcarLcacalcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEcarLcacalcResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.lcacalc.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发电数据文件导入开放接口
     * Summary: 发电数据文件导入开放接口.
     *
     * @param SubmitEcarGreencertificategenerationfileRequest $request
     *
     * @return SubmitEcarGreencertificategenerationfileResponse
     */
    public function submitEcarGreencertificategenerationfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitEcarGreencertificategenerationfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 发电数据文件导入开放接口
     * Summary: 发电数据文件导入开放接口.
     *
     * @param SubmitEcarGreencertificategenerationfileRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return SubmitEcarGreencertificategenerationfileResponse
     */
    public function submitEcarGreencertificategenerationfileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.carbon.ecar.greencertificategenerationfile.submit',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new SubmitEcarGreencertificategenerationfileResponse([
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

        return SubmitEcarGreencertificategenerationfileResponse::fromMap($this->doRequest('1.0', 'antchain.carbon.ecar.greencertificategenerationfile.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
