<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\AuthAntchainPdcpProjectDatasetRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\AuthAntchainPdcpProjectDatasetResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\AuthAntchainPdcpProjectDatasourceRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\AuthAntchainPdcpProjectDatasourceResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\CreateAntchainPdcpDatasetRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\CreateAntchainPdcpDatasetResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\CreateAntchainPdcpDatasourceRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\CreateAntchainPdcpDatasourceResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\CreateAntchainPdcpProjectRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\CreateAntchainPdcpProjectResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\DeleteAntchainPdcpDatasetRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\DeleteAntchainPdcpDatasetResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\DeleteAntchainPdcpDatasourceRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\DeleteAntchainPdcpDatasourceResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\GetAntchainPdcpProjectRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\GetAntchainPdcpProjectResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\PagequeryAntchainPdcpDatasetRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\PagequeryAntchainPdcpDatasetResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\PagequeryAntchainPdcpDatasourceRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\PagequeryAntchainPdcpDatasourceResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\PagequeryAntchainPdcpProjectAuthdatasetRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\PagequeryAntchainPdcpProjectAuthdatasetResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\PagequeryAntchainPdcpProjectAuthdatasourceRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\PagequeryAntchainPdcpProjectAuthdatasourceResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\QueryAntchainPdcpDatasetRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\QueryAntchainPdcpDatasetResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\QueryAntchainPdcpDatasourceRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\QueryAntchainPdcpDatasourceResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\QueryAntchainPdcpJobPsiRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\QueryAntchainPdcpJobPsiResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\RecognizeAntchainPdcpDatasetSchemaRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\RecognizeAntchainPdcpDatasetSchemaResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\SubmitAntchainPdcpJobPsiRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\SubmitAntchainPdcpJobPsiResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\UpdateAntchainPdcpDatasetRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\UpdateAntchainPdcpDatasetResponse;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\UpdateAntchainPdcpDatasourceRequest;
use AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models\UpdateAntchainPdcpDatasourceResponse;
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
            // 该参与方的输入数据配置
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
                    'sdk_version'      => '1.0.1',
                    '_prod_code'       => 'ak_be9ae52241c747408ac24bec8f036d74',
                    '_prod_channel'    => 'saas',
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
     * Description: 请求创建数据源
     * Summary: 创建新的数据源.
     *
     * @param CreateAntchainPdcpDatasourceRequest $request
     *
     * @return CreateAntchainPdcpDatasourceResponse
     */
    public function createAntchainPdcpDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainPdcpDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 请求创建数据源
     * Summary: 创建新的数据源.
     *
     * @param CreateAntchainPdcpDatasourceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateAntchainPdcpDatasourceResponse
     */
    public function createAntchainPdcpDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainPdcpDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.datasource.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 请求删除指定的数据源。
     * Summary: 删除指定的数据源.
     *
     * @param DeleteAntchainPdcpDatasourceRequest $request
     *
     * @return DeleteAntchainPdcpDatasourceResponse
     */
    public function deleteAntchainPdcpDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAntchainPdcpDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 请求删除指定的数据源。
     * Summary: 删除指定的数据源.
     *
     * @param DeleteAntchainPdcpDatasourceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return DeleteAntchainPdcpDatasourceResponse
     */
    public function deleteAntchainPdcpDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAntchainPdcpDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.datasource.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 请求更新指定数据源的信息。
     * Summary: 更新指定数据源的信息.
     *
     * @param UpdateAntchainPdcpDatasourceRequest $request
     *
     * @return UpdateAntchainPdcpDatasourceResponse
     */
    public function updateAntchainPdcpDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAntchainPdcpDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 请求更新指定数据源的信息。
     * Summary: 更新指定数据源的信息.
     *
     * @param UpdateAntchainPdcpDatasourceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return UpdateAntchainPdcpDatasourceResponse
     */
    public function updateAntchainPdcpDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAntchainPdcpDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.datasource.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 请求查询指定的数据源信息。
     * Summary: 查询指定的数据源信息.
     *
     * @param QueryAntchainPdcpDatasourceRequest $request
     *
     * @return QueryAntchainPdcpDatasourceResponse
     */
    public function queryAntchainPdcpDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainPdcpDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 请求查询指定的数据源信息。
     * Summary: 查询指定的数据源信息.
     *
     * @param QueryAntchainPdcpDatasourceRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryAntchainPdcpDatasourceResponse
     */
    public function queryAntchainPdcpDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainPdcpDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.datasource.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页搜索数据源
     * Summary: 分页搜索数据源.
     *
     * @param PagequeryAntchainPdcpDatasourceRequest $request
     *
     * @return PagequeryAntchainPdcpDatasourceResponse
     */
    public function pagequeryAntchainPdcpDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryAntchainPdcpDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页搜索数据源
     * Summary: 分页搜索数据源.
     *
     * @param PagequeryAntchainPdcpDatasourceRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return PagequeryAntchainPdcpDatasourceResponse
     */
    public function pagequeryAntchainPdcpDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryAntchainPdcpDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.datasource.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建新的数据集
     * Summary: 创建新的数据集.
     *
     * @param CreateAntchainPdcpDatasetRequest $request
     *
     * @return CreateAntchainPdcpDatasetResponse
     */
    public function createAntchainPdcpDataset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainPdcpDatasetEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建新的数据集
     * Summary: 创建新的数据集.
     *
     * @param CreateAntchainPdcpDatasetRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateAntchainPdcpDatasetResponse
     */
    public function createAntchainPdcpDatasetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainPdcpDatasetResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.dataset.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除指定数据集
     * Summary: 删除指定数据集.
     *
     * @param DeleteAntchainPdcpDatasetRequest $request
     *
     * @return DeleteAntchainPdcpDatasetResponse
     */
    public function deleteAntchainPdcpDataset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAntchainPdcpDatasetEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除指定数据集
     * Summary: 删除指定数据集.
     *
     * @param DeleteAntchainPdcpDatasetRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DeleteAntchainPdcpDatasetResponse
     */
    public function deleteAntchainPdcpDatasetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAntchainPdcpDatasetResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.dataset.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新指定数据集信息
     * Summary: 更新指定数据集信息.
     *
     * @param UpdateAntchainPdcpDatasetRequest $request
     *
     * @return UpdateAntchainPdcpDatasetResponse
     */
    public function updateAntchainPdcpDataset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAntchainPdcpDatasetEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新指定数据集信息
     * Summary: 更新指定数据集信息.
     *
     * @param UpdateAntchainPdcpDatasetRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateAntchainPdcpDatasetResponse
     */
    public function updateAntchainPdcpDatasetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAntchainPdcpDatasetResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.dataset.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定数据集信息
     * Summary: 查询指定数据集信息.
     *
     * @param QueryAntchainPdcpDatasetRequest $request
     *
     * @return QueryAntchainPdcpDatasetResponse
     */
    public function queryAntchainPdcpDataset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainPdcpDatasetEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定数据集信息
     * Summary: 查询指定数据集信息.
     *
     * @param QueryAntchainPdcpDatasetRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryAntchainPdcpDatasetResponse
     */
    public function queryAntchainPdcpDatasetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainPdcpDatasetResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.dataset.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页搜索数据集
     * Summary: 分页搜索数据集.
     *
     * @param PagequeryAntchainPdcpDatasetRequest $request
     *
     * @return PagequeryAntchainPdcpDatasetResponse
     */
    public function pagequeryAntchainPdcpDataset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryAntchainPdcpDatasetEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页搜索数据集
     * Summary: 分页搜索数据集.
     *
     * @param PagequeryAntchainPdcpDatasetRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return PagequeryAntchainPdcpDatasetResponse
     */
    public function pagequeryAntchainPdcpDatasetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryAntchainPdcpDatasetResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.dataset.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 识别数据集的 schema 信息
     * Summary: 识别数据集的 schema 信息.
     *
     * @param RecognizeAntchainPdcpDatasetSchemaRequest $request
     *
     * @return RecognizeAntchainPdcpDatasetSchemaResponse
     */
    public function recognizeAntchainPdcpDatasetSchema($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeAntchainPdcpDatasetSchemaEx($request, $headers, $runtime);
    }

    /**
     * Description: 识别数据集的 schema 信息
     * Summary: 识别数据集的 schema 信息.
     *
     * @param RecognizeAntchainPdcpDatasetSchemaRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return RecognizeAntchainPdcpDatasetSchemaResponse
     */
    public function recognizeAntchainPdcpDatasetSchemaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RecognizeAntchainPdcpDatasetSchemaResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.dataset.schema.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建项目，添加线下参与方协作节点
     * Summary: 创建项目.
     *
     * @param CreateAntchainPdcpProjectRequest $request
     *
     * @return CreateAntchainPdcpProjectResponse
     */
    public function createAntchainPdcpProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntchainPdcpProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建项目，添加线下参与方协作节点
     * Summary: 创建项目.
     *
     * @param CreateAntchainPdcpProjectRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateAntchainPdcpProjectResponse
     */
    public function createAntchainPdcpProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntchainPdcpProjectResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.project.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据项目ID查询项目信息
     * Summary: 根据项目ID查询项目信息.
     *
     * @param GetAntchainPdcpProjectRequest $request
     *
     * @return GetAntchainPdcpProjectResponse
     */
    public function getAntchainPdcpProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAntchainPdcpProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据项目ID查询项目信息
     * Summary: 根据项目ID查询项目信息.
     *
     * @param GetAntchainPdcpProjectRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return GetAntchainPdcpProjectResponse
     */
    public function getAntchainPdcpProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAntchainPdcpProjectResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.project.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
     * Summary: 授权某个本地的数据集至项目中.
     *
     * @param AuthAntchainPdcpProjectDatasetRequest $request
     *
     * @return AuthAntchainPdcpProjectDatasetResponse
     */
    public function authAntchainPdcpProjectDataset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authAntchainPdcpProjectDatasetEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
     * Summary: 授权某个本地的数据集至项目中.
     *
     * @param AuthAntchainPdcpProjectDatasetRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return AuthAntchainPdcpProjectDatasetResponse
     */
    public function authAntchainPdcpProjectDatasetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthAntchainPdcpProjectDatasetResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.project.dataset.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权数据源至项目/api/project/datasource/auth
     * Summary: 授权某个本地数据源至项目中.
     *
     * @param AuthAntchainPdcpProjectDatasourceRequest $request
     *
     * @return AuthAntchainPdcpProjectDatasourceResponse
     */
    public function authAntchainPdcpProjectDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authAntchainPdcpProjectDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权数据源至项目/api/project/datasource/auth
     * Summary: 授权某个本地数据源至项目中.
     *
     * @param AuthAntchainPdcpProjectDatasourceRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return AuthAntchainPdcpProjectDatasourceResponse
     */
    public function authAntchainPdcpProjectDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthAntchainPdcpProjectDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.project.datasource.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询项目内已授权的数据集列表
     * Summary: 分页查询项目内已授权的数据集列表.
     *
     * @param PagequeryAntchainPdcpProjectAuthdatasetRequest $request
     *
     * @return PagequeryAntchainPdcpProjectAuthdatasetResponse
     */
    public function pagequeryAntchainPdcpProjectAuthdataset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryAntchainPdcpProjectAuthdatasetEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询项目内已授权的数据集列表
     * Summary: 分页查询项目内已授权的数据集列表.
     *
     * @param PagequeryAntchainPdcpProjectAuthdatasetRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return PagequeryAntchainPdcpProjectAuthdatasetResponse
     */
    public function pagequeryAntchainPdcpProjectAuthdatasetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryAntchainPdcpProjectAuthdatasetResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.project.authdataset.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询项目内已授权的数据源列表
     * Summary: 分页查询项目内已授权的数据源列表.
     *
     * @param PagequeryAntchainPdcpProjectAuthdatasourceRequest $request
     *
     * @return PagequeryAntchainPdcpProjectAuthdatasourceResponse
     */
    public function pagequeryAntchainPdcpProjectAuthdatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryAntchainPdcpProjectAuthdatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询项目内已授权的数据源列表
     * Summary: 分页查询项目内已授权的数据源列表.
     *
     * @param PagequeryAntchainPdcpProjectAuthdatasourceRequest $request
     * @param string[]                                          $headers
     * @param RuntimeOptions                                    $runtime
     *
     * @return PagequeryAntchainPdcpProjectAuthdatasourceResponse
     */
    public function pagequeryAntchainPdcpProjectAuthdatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryAntchainPdcpProjectAuthdatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.project.authdatasource.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询任务信息
     * Summary: 查询任务状态
     *
     * @param QueryAntchainPdcpJobPsiRequest $request
     *
     * @return QueryAntchainPdcpJobPsiResponse
     */
    public function queryAntchainPdcpJobPsi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntchainPdcpJobPsiEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询任务信息
     * Summary: 查询任务状态
     *
     * @param QueryAntchainPdcpJobPsiRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryAntchainPdcpJobPsiResponse
     */
    public function queryAntchainPdcpJobPsiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntchainPdcpJobPsiResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.job.psi.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交psi任务接口
     * Summary: 提交psi任务接口.
     *
     * @param SubmitAntchainPdcpJobPsiRequest $request
     *
     * @return SubmitAntchainPdcpJobPsiResponse
     */
    public function submitAntchainPdcpJobPsi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAntchainPdcpJobPsiEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交psi任务接口
     * Summary: 提交psi任务接口.
     *
     * @param SubmitAntchainPdcpJobPsiRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return SubmitAntchainPdcpJobPsiResponse
     */
    public function submitAntchainPdcpJobPsiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAntchainPdcpJobPsiResponse::fromMap($this->doRequest('1.0', 'antchain.pdcp.job.psi.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
