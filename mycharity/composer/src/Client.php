<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\MYCHARITY\Models\BatchcreateCombinationRequest;
use AntChain\MYCHARITY\Models\BatchcreateCombinationResponse;
use AntChain\MYCHARITY\Models\BatchcreateRecordRequest;
use AntChain\MYCHARITY\Models\BatchcreateRecordResponse;
use AntChain\MYCHARITY\Models\CreateAlipaysignRequest;
use AntChain\MYCHARITY\Models\CreateAlipaysignResponse;
use AntChain\MYCHARITY\Models\CreateBatchRequest;
use AntChain\MYCHARITY\Models\CreateBatchResponse;
use AntChain\MYCHARITY\Models\CreateCombinationRequest;
use AntChain\MYCHARITY\Models\CreateCombinationResponse;
use AntChain\MYCHARITY\Models\CreateOrgRequest;
use AntChain\MYCHARITY\Models\CreateOrgResponse;
use AntChain\MYCHARITY\Models\CreatePersonPermissionRequest;
use AntChain\MYCHARITY\Models\CreatePersonPermissionResponse;
use AntChain\MYCHARITY\Models\CreateProjectRequest;
use AntChain\MYCHARITY\Models\CreateProjectResponse;
use AntChain\MYCHARITY\Models\CreateStagesRequest;
use AntChain\MYCHARITY\Models\CreateStagesResponse;
use AntChain\MYCHARITY\Models\DeleteBatchRequest;
use AntChain\MYCHARITY\Models\DeleteBatchResponse;
use AntChain\MYCHARITY\Models\DeletePersonRequest;
use AntChain\MYCHARITY\Models\DeletePersonResponse;
use AntChain\MYCHARITY\Models\DetailOrgRequest;
use AntChain\MYCHARITY\Models\DetailOrgResponse;
use AntChain\MYCHARITY\Models\DetailProjectRequest;
use AntChain\MYCHARITY\Models\DetailProjectResponse;
use AntChain\MYCHARITY\Models\InitBatchRequest;
use AntChain\MYCHARITY\Models\InitBatchResponse;
use AntChain\MYCHARITY\Models\QueryAlipaysignQrcodeRequest;
use AntChain\MYCHARITY\Models\QueryAlipaysignQrcodeResponse;
use AntChain\MYCHARITY\Models\QueryAlipaysignStateRequest;
use AntChain\MYCHARITY\Models\QueryAlipaysignStateResponse;
use AntChain\MYCHARITY\Models\QueryBatchRequest;
use AntChain\MYCHARITY\Models\QueryBatchResponse;
use AntChain\MYCHARITY\Models\QueryCombinationRequest;
use AntChain\MYCHARITY\Models\QueryCombinationResponse;
use AntChain\MYCHARITY\Models\QueryStagesRequest;
use AntChain\MYCHARITY\Models\QueryStagesResponse;
use AntChain\MYCHARITY\Models\UpdateBatchRequest;
use AntChain\MYCHARITY\Models\UpdateBatchResponse;
use AntChain\MYCHARITY\Models\UpdateCombinationRequest;
use AntChain\MYCHARITY\Models\UpdateCombinationResponse;
use AntChain\MYCHARITY\Models\UpdateOrgRequest;
use AntChain\MYCHARITY\Models\UpdateOrgResponse;
use AntChain\MYCHARITY\Models\UpdateProjectRequest;
use AntChain\MYCHARITY\Models\UpdateProjectResponse;
use AntChain\MYCHARITY\Models\UpdateRecordRequest;
use AntChain\MYCHARITY\Models\UpdateRecordResponse;
use AntChain\MYCHARITY\Models\UpdateStagesRequest;
use AntChain\MYCHARITY\Models\UpdateStagesResponse;
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
            // 批次详情
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
                    'sdk_version'      => '1.0.13',
                    '_prod_code'       => 'MYCHARITY',
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
     * Description: 待签约账号创建
     * Summary: 待签约账号创建.
     *
     * @param CreateAlipaysignRequest $request
     *
     * @return CreateAlipaysignResponse
     */
    public function createAlipaysign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAlipaysignEx($request, $headers, $runtime);
    }

    /**
     * Description: 待签约账号创建
     * Summary: 待签约账号创建.
     *
     * @param CreateAlipaysignRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateAlipaysignResponse
     */
    public function createAlipaysignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAlipaysignResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.alipaysign.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构下代扣账号签约状态查询
     * Summary: 机构下代扣账号签约状态查询.
     *
     * @param QueryAlipaysignStateRequest $request
     *
     * @return QueryAlipaysignStateResponse
     */
    public function queryAlipaysignState($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlipaysignStateEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构下代扣账号签约状态查询
     * Summary: 机构下代扣账号签约状态查询.
     *
     * @param QueryAlipaysignStateRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryAlipaysignStateResponse
     */
    public function queryAlipaysignStateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlipaysignStateResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.alipaysign.state.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 账号签约二维码获取
     * Summary: 账号签约二维码获取.
     *
     * @param QueryAlipaysignQrcodeRequest $request
     *
     * @return QueryAlipaysignQrcodeResponse
     */
    public function queryAlipaysignQrcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlipaysignQrcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 账号签约二维码获取
     * Summary: 账号签约二维码获取.
     *
     * @param QueryAlipaysignQrcodeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryAlipaysignQrcodeResponse
     */
    public function queryAlipaysignQrcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlipaysignQrcodeResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.alipaysign.qrcode.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建人员并配置权限。如人员已经存在，则不创建。
     * Summary: 创建人员及配置权限.
     *
     * @param CreatePersonPermissionRequest $request
     *
     * @return CreatePersonPermissionResponse
     */
    public function createPersonPermission($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createPersonPermissionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建人员并配置权限。如人员已经存在，则不创建。
     * Summary: 创建人员及配置权限.
     *
     * @param CreatePersonPermissionRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreatePersonPermissionResponse
     */
    public function createPersonPermissionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreatePersonPermissionResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.person.permission.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 允许已授权的用户通过此接口删除人员权限。
     * Summary: 配置权限删除.
     *
     * @param DeletePersonRequest $request
     *
     * @return DeletePersonResponse
     */
    public function deletePerson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deletePersonEx($request, $headers, $runtime);
    }

    /**
     * Description: 允许已授权的用户通过此接口删除人员权限。
     * Summary: 配置权限删除.
     *
     * @param DeletePersonRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return DeletePersonResponse
     */
    public function deletePersonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeletePersonResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.person.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建批次
     * Summary: 创建批次
     *
     * @param InitBatchRequest $request
     *
     * @return InitBatchResponse
     */
    public function initBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建批次
     * Summary: 创建批次
     *
     * @param InitBatchRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return InitBatchResponse
     */
    public function initBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitBatchResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.batch.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改批次状态
     * Summary: 修改批次状态
     *
     * @param UpdateBatchRequest $request
     *
     * @return UpdateBatchResponse
     */
    public function updateBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改批次状态
     * Summary: 修改批次状态
     *
     * @param UpdateBatchRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return UpdateBatchResponse
     */
    public function updateBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBatchResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.batch.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除批次
     * Summary: 删除批次
     *
     * @param DeleteBatchRequest $request
     *
     * @return DeleteBatchResponse
     */
    public function deleteBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除批次
     * Summary: 删除批次
     *
     * @param DeleteBatchRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return DeleteBatchResponse
     */
    public function deleteBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteBatchResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.batch.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建项目分期
     * Summary: 创建分期
     *
     * @param CreateStagesRequest $request
     *
     * @return CreateStagesResponse
     */
    public function createStages($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createStagesEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建项目分期
     * Summary: 创建分期
     *
     * @param CreateStagesRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateStagesResponse
     */
    public function createStagesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateStagesResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.stages.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询批次
     * Summary: 查询批次
     *
     * @param QueryBatchRequest $request
     *
     * @return QueryBatchResponse
     */
    public function queryBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询批次
     * Summary: 查询批次
     *
     * @param QueryBatchRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryBatchResponse
     */
    public function queryBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBatchResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.batch.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新项目分期
     * Summary: 更新分期
     *
     * @param UpdateStagesRequest $request
     *
     * @return UpdateStagesResponse
     */
    public function updateStages($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateStagesEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新项目分期
     * Summary: 更新分期
     *
     * @param UpdateStagesRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return UpdateStagesResponse
     */
    public function updateStagesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateStagesResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.stages.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建机构
     * Summary: 创建机构.
     *
     * @param CreateOrgRequest $request
     *
     * @return CreateOrgResponse
     */
    public function createOrg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createOrgEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建机构
     * Summary: 创建机构.
     *
     * @param CreateOrgRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return CreateOrgResponse
     */
    public function createOrgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateOrgResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.org.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询分期
     * Summary: 查询分期
     *
     * @param QueryStagesRequest $request
     *
     * @return QueryStagesResponse
     */
    public function queryStages($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStagesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询分期
     * Summary: 查询分期
     *
     * @param QueryStagesRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryStagesResponse
     */
    public function queryStagesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStagesResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.stages.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新机构
     * Summary: 更新机构.
     *
     * @param UpdateOrgRequest $request
     *
     * @return UpdateOrgResponse
     */
    public function updateOrg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateOrgEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新机构
     * Summary: 更新机构.
     *
     * @param UpdateOrgRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return UpdateOrgResponse
     */
    public function updateOrgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateOrgResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.org.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建实施内容
     * Summary: 创建实施内容.
     *
     * @param CreateCombinationRequest $request
     *
     * @return CreateCombinationResponse
     */
    public function createCombination($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCombinationEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建实施内容
     * Summary: 创建实施内容.
     *
     * @param CreateCombinationRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateCombinationResponse
     */
    public function createCombinationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCombinationResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.combination.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构详情
     * Summary: 机构详情.
     *
     * @param DetailOrgRequest $request
     *
     * @return DetailOrgResponse
     */
    public function detailOrg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailOrgEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构详情
     * Summary: 机构详情.
     *
     * @param DetailOrgRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return DetailOrgResponse
     */
    public function detailOrgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailOrgResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.org.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改实施内容
     * Summary: 修改实施内容.
     *
     * @param UpdateCombinationRequest $request
     *
     * @return UpdateCombinationResponse
     */
    public function updateCombination($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateCombinationEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改实施内容
     * Summary: 修改实施内容.
     *
     * @param UpdateCombinationRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateCombinationResponse
     */
    public function updateCombinationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateCombinationResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.combination.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目.
     *
     * @param CreateProjectRequest $request
     *
     * @return CreateProjectResponse
     */
    public function createProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目.
     *
     * @param CreateProjectRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateProjectResponse
     */
    public function createProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateProjectResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.project.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新项目
     * Summary: 更新项目.
     *
     * @param UpdateProjectRequest $request
     *
     * @return UpdateProjectResponse
     */
    public function updateProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新项目
     * Summary: 更新项目.
     *
     * @param UpdateProjectRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return UpdateProjectResponse
     */
    public function updateProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateProjectResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.project.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 项目详情
     * Summary: 项目详情.
     *
     * @param DetailProjectRequest $request
     *
     * @return DetailProjectResponse
     */
    public function detailProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 项目详情
     * Summary: 项目详情.
     *
     * @param DetailProjectRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DetailProjectResponse
     */
    public function detailProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailProjectResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.project.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询实施内容
     * Summary: 查询实施内容.
     *
     * @param QueryCombinationRequest $request
     *
     * @return QueryCombinationResponse
     */
    public function queryCombination($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCombinationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实施内容
     * Summary: 查询实施内容.
     *
     * @param QueryCombinationRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryCombinationResponse
     */
    public function queryCombinationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCombinationResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.combination.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建执行记录
     * Summary: 批量创建执行记录.
     *
     * @param BatchcreateRecordRequest $request
     *
     * @return BatchcreateRecordResponse
     */
    public function batchcreateRecord($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateRecordEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建执行记录
     * Summary: 批量创建执行记录.
     *
     * @param BatchcreateRecordRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return BatchcreateRecordResponse
     */
    public function batchcreateRecordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateRecordResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.record.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建批次
     * Summary: 创建批次
     *
     * @param CreateBatchRequest $request
     *
     * @return CreateBatchResponse
     */
    public function createBatch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建批次
     * Summary: 创建批次
     *
     * @param CreateBatchRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CreateBatchResponse
     */
    public function createBatchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBatchResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.batch.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改执行记录状态
     * Summary: 修改执行记录状态
     *
     * @param UpdateRecordRequest $request
     *
     * @return UpdateRecordResponse
     */
    public function updateRecord($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateRecordEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改执行记录状态
     * Summary: 修改执行记录状态
     *
     * @param UpdateRecordRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return UpdateRecordResponse
     */
    public function updateRecordEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateRecordResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.record.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建、修改、删除实施内容
     * Summary: 批量创建、修改、删除实施内容.
     *
     * @param BatchcreateCombinationRequest $request
     *
     * @return BatchcreateCombinationResponse
     */
    public function batchcreateCombination($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateCombinationEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建、修改、删除实施内容
     * Summary: 批量创建、修改、删除实施内容.
     *
     * @param BatchcreateCombinationRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BatchcreateCombinationResponse
     */
    public function batchcreateCombinationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateCombinationResponse::fromMap($this->doRequest('1.0', 'antchain.mycharity.combination.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
