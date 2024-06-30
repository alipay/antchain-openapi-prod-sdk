<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BAASDATAGW\Models\AddChaininsightStatisticRequest;
use AntChain\BAASDATAGW\Models\AddChaininsightStatisticResponse;
use AntChain\BAASDATAGW\Models\AddChaininsightWidgetsRequest;
use AntChain\BAASDATAGW\Models\AddChaininsightWidgetsResponse;
use AntChain\BAASDATAGW\Models\AddContractmetaRequest;
use AntChain\BAASDATAGW\Models\AddContractmetaResponse;
use AntChain\BAASDATAGW\Models\BatchqueryChaininsightTransactionRequest;
use AntChain\BAASDATAGW\Models\BatchqueryChaininsightTransactionResponse;
use AntChain\BAASDATAGW\Models\CreateChaininsightQrcodeRequest;
use AntChain\BAASDATAGW\Models\CreateChaininsightQrcodeResponse;
use AntChain\BAASDATAGW\Models\CreateDataexportPreviewdataRequest;
use AntChain\BAASDATAGW\Models\CreateDataexportPreviewdataResponse;
use AntChain\BAASDATAGW\Models\CreateDataexportTriggerRequest;
use AntChain\BAASDATAGW\Models\CreateDataexportTriggerResponse;
use AntChain\BAASDATAGW\Models\DeleteChaininsightWidgetsRequest;
use AntChain\BAASDATAGW\Models\DeleteChaininsightWidgetsResponse;
use AntChain\BAASDATAGW\Models\DeleteContractmetaRequest;
use AntChain\BAASDATAGW\Models\DeleteContractmetaResponse;
use AntChain\BAASDATAGW\Models\DetailChaininsightContractinterfaceRequest;
use AntChain\BAASDATAGW\Models\DetailChaininsightContractinterfaceResponse;
use AntChain\BAASDATAGW\Models\DownloadChaininsightContractRequest;
use AntChain\BAASDATAGW\Models\DownloadChaininsightContractResponse;
use AntChain\BAASDATAGW\Models\GetChainsStatusRequest;
use AntChain\BAASDATAGW\Models\GetChainsStatusResponse;
use AntChain\BAASDATAGW\Models\GetContractmetaRequest;
use AntChain\BAASDATAGW\Models\GetContractmetaResponse;
use AntChain\BAASDATAGW\Models\GetDataexportPreviewsmappingRequest;
use AntChain\BAASDATAGW\Models\GetDataexportPreviewsmappingResponse;
use AntChain\BAASDATAGW\Models\GetDatasearchIndexRequest;
use AntChain\BAASDATAGW\Models\GetDatasearchIndexResponse;
use AntChain\BAASDATAGW\Models\ListChaininsightAssetinterfacesrequiredRequest;
use AntChain\BAASDATAGW\Models\ListChaininsightAssetinterfacesrequiredResponse;
use AntChain\BAASDATAGW\Models\ListChaininsightContractinterfaceRequest;
use AntChain\BAASDATAGW\Models\ListChaininsightContractinterfaceResponse;
use AntChain\BAASDATAGW\Models\ListChaininsightStatisticRequest;
use AntChain\BAASDATAGW\Models\ListChaininsightStatisticResponse;
use AntChain\BAASDATAGW\Models\ListChaininsightWidgetsRequest;
use AntChain\BAASDATAGW\Models\ListChaininsightWidgetsResponse;
use AntChain\BAASDATAGW\Models\ListContractmetaRequest;
use AntChain\BAASDATAGW\Models\ListContractmetaResponse;
use AntChain\BAASDATAGW\Models\ListDataexportTriggerlogRequest;
use AntChain\BAASDATAGW\Models\ListDataexportTriggerlogResponse;
use AntChain\BAASDATAGW\Models\ListDataexportTriggerRequest;
use AntChain\BAASDATAGW\Models\ListDataexportTriggerResponse;
use AntChain\BAASDATAGW\Models\OpenChaininsightDatasearchRequest;
use AntChain\BAASDATAGW\Models\OpenChaininsightDatasearchResponse;
use AntChain\BAASDATAGW\Models\OperateChaininsightStatisticRequest;
use AntChain\BAASDATAGW\Models\OperateChaininsightStatisticResponse;
use AntChain\BAASDATAGW\Models\OperateChaininsightWidgetsmoveRequest;
use AntChain\BAASDATAGW\Models\OperateChaininsightWidgetsmoveResponse;
use AntChain\BAASDATAGW\Models\OperateChainsRequest;
use AntChain\BAASDATAGW\Models\OperateChainsResponse;
use AntChain\BAASDATAGW\Models\OperateDataexportTriggerconfigRequest;
use AntChain\BAASDATAGW\Models\OperateDataexportTriggerconfigResponse;
use AntChain\BAASDATAGW\Models\OperateDataexportTriggerlogRequest;
use AntChain\BAASDATAGW\Models\OperateDataexportTriggerlogResponse;
use AntChain\BAASDATAGW\Models\OperateDataexportTriggerstatusRequest;
use AntChain\BAASDATAGW\Models\OperateDataexportTriggerstatusResponse;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightAccountmodifytxRequest;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightAccountmodifytxResponse;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightContractmodifytxRequest;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightContractmodifytxResponse;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightLatestcontractsRequest;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightLatestcontractsResponse;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightLatesttxsRequest;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightLatesttxsResponse;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightStatisticassethistoryassetRequest;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightStatisticassethistoryassetResponse;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightStatisticassethistorycontractRequest;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightStatisticassethistorycontractResponse;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightStatisticassetinventoryaccountRequest;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightStatisticassetinventoryaccountResponse;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightStatisticassetownerRequest;
use AntChain\BAASDATAGW\Models\PagequeryChaininsightStatisticassetownerResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightAddresshistogramrxRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightAddresshistogramrxResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightAddresshistogramtxRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightAddresshistogramtxResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightAddresslatesttxsRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightAddresslatesttxsResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightAddressRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightAddressResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightBlockRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightBlockResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightChaintxhistogramRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightChaintxhistogramResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightContracttimelineconfigRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightContracttimelineconfigResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightLabelsRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightLabelsResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightPrivatechainsstatusRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightPrivatechainsstatusResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightPrivatechaintxhistogramRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightPrivatechaintxhistogramResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightPrivatedatasearchstatusRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightPrivatedatasearchstatusResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightSearchRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightSearchResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightStatisticassetdetailRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightStatisticassetdetailResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightStatisticassetmetaRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightStatisticassetmetaResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightStatistichistogramRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightStatistichistogramResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightStatistictableRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightStatistictableResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightTablesactivereceiverRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightTablesactivereceiverResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightTablesactivesenderRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightTablesactivesenderResponse;
use AntChain\BAASDATAGW\Models\QueryChaininsightTransactionRequest;
use AntChain\BAASDATAGW\Models\QueryChaininsightTransactionResponse;
use AntChain\BAASDATAGW\Models\QueryDataexportPreviewdataRequest;
use AntChain\BAASDATAGW\Models\QueryDataexportPreviewdataResponse;
use AntChain\BAASDATAGW\Models\QueryDataexportPreviewsqlRequest;
use AntChain\BAASDATAGW\Models\QueryDataexportPreviewsqlResponse;
use AntChain\BAASDATAGW\Models\QueryDatasearchSearchRequest;
use AntChain\BAASDATAGW\Models\QueryDatasearchSearchResponse;
use AntChain\BAASDATAGW\Models\RegisterChainsRequest;
use AntChain\BAASDATAGW\Models\RegisterChainsResponse;
use AntChain\BAASDATAGW\Models\RemoveDatasearchIndexRequest;
use AntChain\BAASDATAGW\Models\RemoveDatasearchIndexResponse;
use AntChain\BAASDATAGW\Models\SaveChaininsightContractinterfaceRequest;
use AntChain\BAASDATAGW\Models\SaveChaininsightContractinterfaceResponse;
use AntChain\BAASDATAGW\Models\StartDatasearchIndexRequest;
use AntChain\BAASDATAGW\Models\StartDatasearchIndexResponse;
use AntChain\BAASDATAGW\Models\StopDatasearchIndexRequest;
use AntChain\BAASDATAGW\Models\StopDatasearchIndexResponse;
use AntChain\BAASDATAGW\Models\UpdateChaininsightContractinterfaceRequest;
use AntChain\BAASDATAGW\Models\UpdateChaininsightContractinterfaceResponse;
use AntChain\BAASDATAGW\Models\UpdateChaininsightContracttimelineconfigRequest;
use AntChain\BAASDATAGW\Models\UpdateChaininsightContracttimelineconfigResponse;
use AntChain\BAASDATAGW\Models\UpdateChaininsightLabelsRequest;
use AntChain\BAASDATAGW\Models\UpdateChaininsightLabelsResponse;
use AntChain\BAASDATAGW\Models\UpdateChaininsightWidgetsRequest;
use AntChain\BAASDATAGW\Models\UpdateChaininsightWidgetsResponse;
use AntChain\BAASDATAGW\Models\UploadChaininsightAbiRequest;
use AntChain\BAASDATAGW\Models\UploadChaininsightAbiResponse;
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
            // 数据实时检索搜索Request
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
                    'sdk_version'      => '1.4.10',
                    '_prod_code'       => 'BAASDATAGW',
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
     * Description: 检索索引的链上数据
     * Summary: 检索索引的链上数据.
     *
     * @param QueryDatasearchSearchRequest $request
     *
     * @return QueryDatasearchSearchResponse
     */
    public function queryDatasearchSearch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDatasearchSearchEx($request, $headers, $runtime);
    }

    /**
     * Description: 检索索引的链上数据
     * Summary: 检索索引的链上数据.
     *
     * @param QueryDatasearchSearchRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryDatasearchSearchResponse
     */
    public function queryDatasearchSearchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDatasearchSearchResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.datasearch.search.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 针对某个数据类型的数据开启索引；该方法可重入
     * Summary: 开启数据索引.
     *
     * @param StartDatasearchIndexRequest $request
     *
     * @return StartDatasearchIndexResponse
     */
    public function startDatasearchIndex($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startDatasearchIndexEx($request, $headers, $runtime);
    }

    /**
     * Description: 针对某个数据类型的数据开启索引；该方法可重入
     * Summary: 开启数据索引.
     *
     * @param StartDatasearchIndexRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return StartDatasearchIndexResponse
     */
    public function startDatasearchIndexEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartDatasearchIndexResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.datasearch.index.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 针对某个分组的数据停止索引；该方法可重入
     * Summary: 停止数据索引.
     *
     * @param StopDatasearchIndexRequest $request
     *
     * @return StopDatasearchIndexResponse
     */
    public function stopDatasearchIndex($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopDatasearchIndexEx($request, $headers, $runtime);
    }

    /**
     * Description: 针对某个分组的数据停止索引；该方法可重入
     * Summary: 停止数据索引.
     *
     * @param StopDatasearchIndexRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return StopDatasearchIndexResponse
     */
    public function stopDatasearchIndexEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopDatasearchIndexResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.datasearch.index.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
     * Summary: 删除数据索引.
     *
     * @param RemoveDatasearchIndexRequest $request
     *
     * @return RemoveDatasearchIndexResponse
     */
    public function removeDatasearchIndex($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->removeDatasearchIndexEx($request, $headers, $runtime);
    }

    /**
     * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
     * Summary: 删除数据索引.
     *
     * @param RemoveDatasearchIndexRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return RemoveDatasearchIndexResponse
     */
    public function removeDatasearchIndexEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RemoveDatasearchIndexResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.datasearch.index.remove', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
     * Summary: 查询数据索引进度.
     *
     * @param GetDatasearchIndexRequest $request
     *
     * @return GetDatasearchIndexResponse
     */
    public function getDatasearchIndex($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDatasearchIndexEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
     * Summary: 查询数据索引进度.
     *
     * @param GetDatasearchIndexRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetDatasearchIndexResponse
     */
    public function getDatasearchIndexEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDatasearchIndexResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.datasearch.index.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出租户在链上的所有合约Meta
     * Summary: 列出租户在链上的所有合约Meta.
     *
     * @param ListContractmetaRequest $request
     *
     * @return ListContractmetaResponse
     */
    public function listContractmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listContractmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出租户在链上的所有合约Meta
     * Summary: 列出租户在链上的所有合约Meta.
     *
     * @param ListContractmetaRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListContractmetaResponse
     */
    public function listContractmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListContractmetaResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.contractmeta.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增合约Meta
     * Summary: 新增合约Meta.
     *
     * @param AddContractmetaRequest $request
     *
     * @return AddContractmetaResponse
     */
    public function addContractmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addContractmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增合约Meta
     * Summary: 新增合约Meta.
     *
     * @param AddContractmetaRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddContractmetaResponse
     */
    public function addContractmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddContractmetaResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.contractmeta.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除合约meta
     * Summary: 删除合约meta.
     *
     * @param DeleteContractmetaRequest $request
     *
     * @return DeleteContractmetaResponse
     */
    public function deleteContractmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteContractmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除合约meta
     * Summary: 删除合约meta.
     *
     * @param DeleteContractmetaRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DeleteContractmetaResponse
     */
    public function deleteContractmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteContractmetaResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.contractmeta.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询meta具体信息
     * Summary: 获取meta信息.
     *
     * @param GetContractmetaRequest $request
     *
     * @return GetContractmetaResponse
     */
    public function getContractmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContractmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询meta具体信息
     * Summary: 获取meta信息.
     *
     * @param GetContractmetaRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetContractmetaResponse
     */
    public function getContractmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContractmetaResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.contractmeta.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取导出任务预览数据的异步任务ID
     * Summary: 获取导出任务预览数据的异步任务ID.
     *
     * @param CreateDataexportPreviewdataRequest $request
     *
     * @return CreateDataexportPreviewdataResponse
     */
    public function createDataexportPreviewdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDataexportPreviewdataEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取导出任务预览数据的异步任务ID
     * Summary: 获取导出任务预览数据的异步任务ID.
     *
     * @param CreateDataexportPreviewdataRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CreateDataexportPreviewdataResponse
     */
    public function createDataexportPreviewdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDataexportPreviewdataResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.previewdata.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据预览任务结果
     * Summary: 查询数据预览任务结果.
     *
     * @param QueryDataexportPreviewdataRequest $request
     *
     * @return QueryDataexportPreviewdataResponse
     */
    public function queryDataexportPreviewdata($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDataexportPreviewdataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据预览任务结果
     * Summary: 查询数据预览任务结果.
     *
     * @param QueryDataexportPreviewdataRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryDataexportPreviewdataResponse
     */
    public function queryDataexportPreviewdataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDataexportPreviewdataResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.previewdata.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询默认字段映射
     * Summary: 查询默认字段映射.
     *
     * @param GetDataexportPreviewsmappingRequest $request
     *
     * @return GetDataexportPreviewsmappingResponse
     */
    public function getDataexportPreviewsmapping($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDataexportPreviewsmappingEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询默认字段映射
     * Summary: 查询默认字段映射.
     *
     * @param GetDataexportPreviewsmappingRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return GetDataexportPreviewsmappingResponse
     */
    public function getDataexportPreviewsmappingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDataexportPreviewsmappingResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.previewsmapping.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建导出任务
     * Summary: 创建导出任务
     *
     * @param CreateDataexportTriggerRequest $request
     *
     * @return CreateDataexportTriggerResponse
     */
    public function createDataexportTrigger($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDataexportTriggerEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建导出任务
     * Summary: 创建导出任务
     *
     * @param CreateDataexportTriggerRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return CreateDataexportTriggerResponse
     */
    public function createDataexportTriggerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDataexportTriggerResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.trigger.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询建表语句
     * Summary: 查询建表语句.
     *
     * @param QueryDataexportPreviewsqlRequest $request
     *
     * @return QueryDataexportPreviewsqlResponse
     */
    public function queryDataexportPreviewsql($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDataexportPreviewsqlEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询建表语句
     * Summary: 查询建表语句.
     *
     * @param QueryDataexportPreviewsqlRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryDataexportPreviewsqlResponse
     */
    public function queryDataexportPreviewsqlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDataexportPreviewsqlResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.previewsql.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出导出任务
     * Summary: 列出导出任务
     *
     * @param ListDataexportTriggerRequest $request
     *
     * @return ListDataexportTriggerResponse
     */
    public function listDataexportTrigger($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDataexportTriggerEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出导出任务
     * Summary: 列出导出任务
     *
     * @param ListDataexportTriggerRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListDataexportTriggerResponse
     */
    public function listDataexportTriggerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDataexportTriggerResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.trigger.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改导出任务状态
     * Summary: 修改导出任务状态
     *
     * @param OperateDataexportTriggerstatusRequest $request
     *
     * @return OperateDataexportTriggerstatusResponse
     */
    public function operateDataexportTriggerstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateDataexportTriggerstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改导出任务状态
     * Summary: 修改导出任务状态
     *
     * @param OperateDataexportTriggerstatusRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return OperateDataexportTriggerstatusResponse
     */
    public function operateDataexportTriggerstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateDataexportTriggerstatusResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.triggerstatus.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改导出任务配置
     * Summary: 修改导出任务配置.
     *
     * @param OperateDataexportTriggerconfigRequest $request
     *
     * @return OperateDataexportTriggerconfigResponse
     */
    public function operateDataexportTriggerconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateDataexportTriggerconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改导出任务配置
     * Summary: 修改导出任务配置.
     *
     * @param OperateDataexportTriggerconfigRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return OperateDataexportTriggerconfigResponse
     */
    public function operateDataexportTriggerconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateDataexportTriggerconfigResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.triggerconfig.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出导出任务失败日志
     * Summary: 列出导出任务失败日志.
     *
     * @param ListDataexportTriggerlogRequest $request
     *
     * @return ListDataexportTriggerlogResponse
     */
    public function listDataexportTriggerlog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDataexportTriggerlogEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出导出任务失败日志
     * Summary: 列出导出任务失败日志.
     *
     * @param ListDataexportTriggerlogRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ListDataexportTriggerlogResponse
     */
    public function listDataexportTriggerlogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDataexportTriggerlogResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.triggerlog.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 操作导出任务失败日志
     * Summary: 操作导出任务失败日志.
     *
     * @param OperateDataexportTriggerlogRequest $request
     *
     * @return OperateDataexportTriggerlogResponse
     */
    public function operateDataexportTriggerlog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateDataexportTriggerlogEx($request, $headers, $runtime);
    }

    /**
     * Description: 操作导出任务失败日志
     * Summary: 操作导出任务失败日志.
     *
     * @param OperateDataexportTriggerlogRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return OperateDataexportTriggerlogResponse
     */
    public function operateDataexportTriggerlogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateDataexportTriggerlogResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.dataexport.triggerlog.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询地址标签
     * Summary: 查询地址标签.
     *
     * @param QueryChaininsightLabelsRequest $request
     *
     * @return QueryChaininsightLabelsResponse
     */
    public function queryChaininsightLabels($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightLabelsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询地址标签
     * Summary: 查询地址标签.
     *
     * @param QueryChaininsightLabelsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryChaininsightLabelsResponse
     */
    public function queryChaininsightLabelsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightLabelsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.labels.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新地址标签
     * Summary: 更新地址标签.
     *
     * @param UpdateChaininsightLabelsRequest $request
     *
     * @return UpdateChaininsightLabelsResponse
     */
    public function updateChaininsightLabels($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateChaininsightLabelsEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新地址标签
     * Summary: 更新地址标签.
     *
     * @param UpdateChaininsightLabelsRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateChaininsightLabelsResponse
     */
    public function updateChaininsightLabelsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateChaininsightLabelsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.labels.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上搜索
     * Summary: 链上搜索.
     *
     * @param QueryChaininsightSearchRequest $request
     *
     * @return QueryChaininsightSearchResponse
     */
    public function queryChaininsightSearch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightSearchEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上搜索
     * Summary: 链上搜索.
     *
     * @param QueryChaininsightSearchRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryChaininsightSearchResponse
     */
    public function queryChaininsightSearchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightSearchResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.search.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链上地址详情
     * Summary: 查询链上地址详情.
     *
     * @param QueryChaininsightAddressRequest $request
     *
     * @return QueryChaininsightAddressResponse
     */
    public function queryChaininsightAddress($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightAddressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链上地址详情
     * Summary: 查询链上地址详情.
     *
     * @param QueryChaininsightAddressRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryChaininsightAddressResponse
     */
    public function queryChaininsightAddressEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightAddressResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.address.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链上交易详情
     * Summary: 查询链上交易详情.
     *
     * @param QueryChaininsightTransactionRequest $request
     *
     * @return QueryChaininsightTransactionResponse
     */
    public function queryChaininsightTransaction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightTransactionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链上交易详情
     * Summary: 查询链上交易详情.
     *
     * @param QueryChaininsightTransactionRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryChaininsightTransactionResponse
     */
    public function queryChaininsightTransactionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightTransactionResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.transaction.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链上区块详情
     * Summary: 查询链上区块详情.
     *
     * @param QueryChaininsightBlockRequest $request
     *
     * @return QueryChaininsightBlockResponse
     */
    public function queryChaininsightBlock($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightBlockEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链上区块详情
     * Summary: 查询链上区块详情.
     *
     * @param QueryChaininsightBlockRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryChaininsightBlockResponse
     */
    public function queryChaininsightBlockEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightBlockResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.block.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询地址近期交易
     * Summary: 查询地址近期交易.
     *
     * @param QueryChaininsightAddresslatesttxsRequest $request
     *
     * @return QueryChaininsightAddresslatesttxsResponse
     */
    public function queryChaininsightAddresslatesttxs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightAddresslatesttxsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询地址近期交易
     * Summary: 查询地址近期交易.
     *
     * @param QueryChaininsightAddresslatesttxsRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryChaininsightAddresslatesttxsResponse
     */
    public function queryChaininsightAddresslatesttxsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightAddresslatesttxsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.addresslatesttxs.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出合约全部接口
     * Summary: 列出合约全部接口.
     *
     * @param ListChaininsightContractinterfaceRequest $request
     *
     * @return ListChaininsightContractinterfaceResponse
     */
    public function listChaininsightContractinterface($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listChaininsightContractinterfaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出合约全部接口
     * Summary: 列出合约全部接口.
     *
     * @param ListChaininsightContractinterfaceRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return ListChaininsightContractinterfaceResponse
     */
    public function listChaininsightContractinterfaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListChaininsightContractinterfaceResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询合约接口信息
     * Summary: 查询合约接口信息.
     *
     * @param DetailChaininsightContractinterfaceRequest $request
     *
     * @return DetailChaininsightContractinterfaceResponse
     */
    public function detailChaininsightContractinterface($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailChaininsightContractinterfaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询合约接口信息
     * Summary: 查询合约接口信息.
     *
     * @param DetailChaininsightContractinterfaceRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return DetailChaininsightContractinterfaceResponse
     */
    public function detailChaininsightContractinterfaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailChaininsightContractinterfaceResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新合约接口信息
     * Summary: 更新合约接口信息.
     *
     * @param UpdateChaininsightContractinterfaceRequest $request
     *
     * @return UpdateChaininsightContractinterfaceResponse
     */
    public function updateChaininsightContractinterface($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateChaininsightContractinterfaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新合约接口信息
     * Summary: 更新合约接口信息.
     *
     * @param UpdateChaininsightContractinterfaceRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return UpdateChaininsightContractinterfaceResponse
     */
    public function updateChaininsightContractinterfaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateChaininsightContractinterfaceResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传合约ABI文件
     * Summary: 上传合约ABI文件.
     *
     * @param UploadChaininsightAbiRequest $request
     *
     * @return UploadChaininsightAbiResponse
     */
    public function uploadChaininsightAbi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadChaininsightAbiEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传合约ABI文件
     * Summary: 上传合约ABI文件.
     *
     * @param UploadChaininsightAbiRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UploadChaininsightAbiResponse
     */
    public function uploadChaininsightAbiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadChaininsightAbiResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.abi.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询地址的接收交易数量趋势
     * Summary: 查询地址的接收交易数量趋势
     *
     * @param QueryChaininsightAddresshistogramrxRequest $request
     *
     * @return QueryChaininsightAddresshistogramrxResponse
     */
    public function queryChaininsightAddresshistogramrx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightAddresshistogramrxEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询地址的接收交易数量趋势
     * Summary: 查询地址的接收交易数量趋势
     *
     * @param QueryChaininsightAddresshistogramrxRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryChaininsightAddresshistogramrxResponse
     */
    public function queryChaininsightAddresshistogramrxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightAddresshistogramrxResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.addresshistogramrx.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询地址的发送交易数量趋势
     * Summary: 查询地址的发送交易数量趋势
     *
     * @param QueryChaininsightAddresshistogramtxRequest $request
     *
     * @return QueryChaininsightAddresshistogramtxResponse
     */
    public function queryChaininsightAddresshistogramtx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightAddresshistogramtxEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询地址的发送交易数量趋势
     * Summary: 查询地址的发送交易数量趋势
     *
     * @param QueryChaininsightAddresshistogramtxRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryChaininsightAddresshistogramtxResponse
     */
    public function queryChaininsightAddresshistogramtxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightAddresshistogramtxResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.addresshistogramtx.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链交易数量趋势
     * Summary: 查询链交易数量趋势
     *
     * @param QueryChaininsightChaintxhistogramRequest $request
     *
     * @return QueryChaininsightChaintxhistogramResponse
     */
    public function queryChaininsightChaintxhistogram($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightChaintxhistogramEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链交易数量趋势
     * Summary: 查询链交易数量趋势
     *
     * @param QueryChaininsightChaintxhistogramRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryChaininsightChaintxhistogramResponse
     */
    public function queryChaininsightChaintxhistogramEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightChaintxhistogramResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.chaintxhistogram.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询链上交易详情
     * Summary: 批量查询链上交易详情.
     *
     * @param BatchqueryChaininsightTransactionRequest $request
     *
     * @return BatchqueryChaininsightTransactionResponse
     */
    public function batchqueryChaininsightTransaction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryChaininsightTransactionEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询链上交易详情
     * Summary: 批量查询链上交易详情.
     *
     * @param BatchqueryChaininsightTransactionRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return BatchqueryChaininsightTransactionResponse
     */
    public function batchqueryChaininsightTransactionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryChaininsightTransactionResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.transaction.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询统计任务
     * Summary: 查询统计任务
     *
     * @param ListChaininsightStatisticRequest $request
     *
     * @return ListChaininsightStatisticResponse
     */
    public function listChaininsightStatistic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listChaininsightStatisticEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询统计任务
     * Summary: 查询统计任务
     *
     * @param ListChaininsightStatisticRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ListChaininsightStatisticResponse
     */
    public function listChaininsightStatisticEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListChaininsightStatisticResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statistic.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新建统计任务
     * Summary: 新建统计任务
     *
     * @param AddChaininsightStatisticRequest $request
     *
     * @return AddChaininsightStatisticResponse
     */
    public function addChaininsightStatistic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addChaininsightStatisticEx($request, $headers, $runtime);
    }

    /**
     * Description: 新建统计任务
     * Summary: 新建统计任务
     *
     * @param AddChaininsightStatisticRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AddChaininsightStatisticResponse
     */
    public function addChaininsightStatisticEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddChaininsightStatisticResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statistic.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 操作统计任务
     * Summary: 操作统计任务
     *
     * @param OperateChaininsightStatisticRequest $request
     *
     * @return OperateChaininsightStatisticResponse
     */
    public function operateChaininsightStatistic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateChaininsightStatisticEx($request, $headers, $runtime);
    }

    /**
     * Description: 操作统计任务
     * Summary: 操作统计任务
     *
     * @param OperateChaininsightStatisticRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return OperateChaininsightStatisticResponse
     */
    public function operateChaininsightStatisticEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateChaininsightStatisticResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statistic.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询统计任务的统计结果直方图
     * Summary: 查询统计任务的统计结果直方图.
     *
     * @param QueryChaininsightStatistichistogramRequest $request
     *
     * @return QueryChaininsightStatistichistogramResponse
     */
    public function queryChaininsightStatistichistogram($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightStatistichistogramEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询统计任务的统计结果直方图
     * Summary: 查询统计任务的统计结果直方图.
     *
     * @param QueryChaininsightStatistichistogramRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryChaininsightStatistichistogramResponse
     */
    public function queryChaininsightStatistichistogramEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightStatistichistogramResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statistichistogram.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询统计任务的统计结果表格
     * Summary: 查询统计任务的统计结果表格
     *
     * @param QueryChaininsightStatistictableRequest $request
     *
     * @return QueryChaininsightStatistictableResponse
     */
    public function queryChaininsightStatistictable($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightStatistictableEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询统计任务的统计结果表格
     * Summary: 查询统计任务的统计结果表格
     *
     * @param QueryChaininsightStatistictableRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryChaininsightStatistictableResponse
     */
    public function queryChaininsightStatistictableEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightStatistictableResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statistictable.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生成支付宝小程序二维码
     * Summary: 生成支付宝小程序二维码
     *
     * @param CreateChaininsightQrcodeRequest $request
     *
     * @return CreateChaininsightQrcodeResponse
     */
    public function createChaininsightQrcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createChaininsightQrcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 生成支付宝小程序二维码
     * Summary: 生成支付宝小程序二维码
     *
     * @param CreateChaininsightQrcodeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateChaininsightQrcodeResponse
     */
    public function createChaininsightQrcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateChaininsightQrcodeResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.qrcode.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开通数据搜索服务
     * Summary: 开通数据搜索服务
     *
     * @param OpenChaininsightDatasearchRequest $request
     *
     * @return OpenChaininsightDatasearchResponse
     */
    public function openChaininsightDatasearch($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openChaininsightDatasearchEx($request, $headers, $runtime);
    }

    /**
     * Description: 开通数据搜索服务
     * Summary: 开通数据搜索服务
     *
     * @param OpenChaininsightDatasearchRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return OpenChaininsightDatasearchResponse
     */
    public function openChaininsightDatasearchEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenChaininsightDatasearchResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.datasearch.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 私有化场景下查询所有链的数据搜索服务状态
     * Summary: 私有化场景下查询所有链的数据搜索服务状态
     *
     * @param QueryChaininsightPrivatedatasearchstatusRequest $request
     *
     * @return QueryChaininsightPrivatedatasearchstatusResponse
     */
    public function queryChaininsightPrivatedatasearchstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightPrivatedatasearchstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 私有化场景下查询所有链的数据搜索服务状态
     * Summary: 私有化场景下查询所有链的数据搜索服务状态
     *
     * @param QueryChaininsightPrivatedatasearchstatusRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return QueryChaininsightPrivatedatasearchstatusResponse
     */
    public function queryChaininsightPrivatedatasearchstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightPrivatedatasearchstatusResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.privatedatasearchstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加看板
     * Summary: 添加看板
     *
     * @param AddChaininsightWidgetsRequest $request
     *
     * @return AddChaininsightWidgetsResponse
     */
    public function addChaininsightWidgets($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addChaininsightWidgetsEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加看板
     * Summary: 添加看板
     *
     * @param AddChaininsightWidgetsRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return AddChaininsightWidgetsResponse
     */
    public function addChaininsightWidgetsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddChaininsightWidgetsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.widgets.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取看板列表
     * Summary: 获取看板列表.
     *
     * @param ListChaininsightWidgetsRequest $request
     *
     * @return ListChaininsightWidgetsResponse
     */
    public function listChaininsightWidgets($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listChaininsightWidgetsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取看板列表
     * Summary: 获取看板列表.
     *
     * @param ListChaininsightWidgetsRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListChaininsightWidgetsResponse
     */
    public function listChaininsightWidgetsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListChaininsightWidgetsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.widgets.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询链上活跃接收地址
     * Summary: 分页查询链上活跃接收地址
     *
     * @param QueryChaininsightTablesactivereceiverRequest $request
     *
     * @return QueryChaininsightTablesactivereceiverResponse
     */
    public function queryChaininsightTablesactivereceiver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightTablesactivereceiverEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询链上活跃接收地址
     * Summary: 分页查询链上活跃接收地址
     *
     * @param QueryChaininsightTablesactivereceiverRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryChaininsightTablesactivereceiverResponse
     */
    public function queryChaininsightTablesactivereceiverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightTablesactivereceiverResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.tablesactivereceiver.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询链上活跃发送地址
     * Summary: 分页查询链上活跃发送地址
     *
     * @param QueryChaininsightTablesactivesenderRequest $request
     *
     * @return QueryChaininsightTablesactivesenderResponse
     */
    public function queryChaininsightTablesactivesender($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightTablesactivesenderEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询链上活跃发送地址
     * Summary: 分页查询链上活跃发送地址
     *
     * @param QueryChaininsightTablesactivesenderRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryChaininsightTablesactivesenderResponse
     */
    public function queryChaininsightTablesactivesenderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightTablesactivesenderResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.tablesactivesender.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询链上近期合约
     * Summary: 分页查询链上近期合约.
     *
     * @param PagequeryChaininsightLatestcontractsRequest $request
     *
     * @return PagequeryChaininsightLatestcontractsResponse
     */
    public function pagequeryChaininsightLatestcontracts($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryChaininsightLatestcontractsEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询链上近期合约
     * Summary: 分页查询链上近期合约.
     *
     * @param PagequeryChaininsightLatestcontractsRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return PagequeryChaininsightLatestcontractsResponse
     */
    public function pagequeryChaininsightLatestcontractsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryChaininsightLatestcontractsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.latestcontracts.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询链上近期交易
     * Summary: 分页查询链上近期交易.
     *
     * @param PagequeryChaininsightLatesttxsRequest $request
     *
     * @return PagequeryChaininsightLatesttxsResponse
     */
    public function pagequeryChaininsightLatesttxs($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryChaininsightLatesttxsEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询链上近期交易
     * Summary: 分页查询链上近期交易.
     *
     * @param PagequeryChaininsightLatesttxsRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return PagequeryChaininsightLatesttxsResponse
     */
    public function pagequeryChaininsightLatesttxsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryChaininsightLatesttxsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.latesttxs.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 私有化场景下查询区块链整体状态
     * Summary: 私有化场景下查询区块链整体状态
     *
     * @param QueryChaininsightPrivatechainsstatusRequest $request
     *
     * @return QueryChaininsightPrivatechainsstatusResponse
     */
    public function queryChaininsightPrivatechainsstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightPrivatechainsstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 私有化场景下查询区块链整体状态
     * Summary: 私有化场景下查询区块链整体状态
     *
     * @param QueryChaininsightPrivatechainsstatusRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return QueryChaininsightPrivatechainsstatusResponse
     */
    public function queryChaininsightPrivatechainsstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightPrivatechainsstatusResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.privatechainsstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 私有化场景下查询链交易数量趋势
     * Summary: 私有化场景下查询链交易数量趋势
     *
     * @param QueryChaininsightPrivatechaintxhistogramRequest $request
     *
     * @return QueryChaininsightPrivatechaintxhistogramResponse
     */
    public function queryChaininsightPrivatechaintxhistogram($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightPrivatechaintxhistogramEx($request, $headers, $runtime);
    }

    /**
     * Description: 私有化场景下查询链交易数量趋势
     * Summary: 私有化场景下查询链交易数量趋势
     *
     * @param QueryChaininsightPrivatechaintxhistogramRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return QueryChaininsightPrivatechaintxhistogramResponse
     */
    public function queryChaininsightPrivatechaintxhistogramEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightPrivatechaintxhistogramResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.privatechaintxhistogram.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除数据洞察看板
     * Summary: 删除数据洞察看板
     *
     * @param DeleteChaininsightWidgetsRequest $request
     *
     * @return DeleteChaininsightWidgetsResponse
     */
    public function deleteChaininsightWidgets($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteChaininsightWidgetsEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除数据洞察看板
     * Summary: 删除数据洞察看板
     *
     * @param DeleteChaininsightWidgetsRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DeleteChaininsightWidgetsResponse
     */
    public function deleteChaininsightWidgetsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteChaininsightWidgetsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.widgets.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 移动看板
     * Summary: 移动看板
     *
     * @param OperateChaininsightWidgetsmoveRequest $request
     *
     * @return OperateChaininsightWidgetsmoveResponse
     */
    public function operateChaininsightWidgetsmove($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateChaininsightWidgetsmoveEx($request, $headers, $runtime);
    }

    /**
     * Description: 移动看板
     * Summary: 移动看板
     *
     * @param OperateChaininsightWidgetsmoveRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return OperateChaininsightWidgetsmoveResponse
     */
    public function operateChaininsightWidgetsmoveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateChaininsightWidgetsmoveResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.widgetsmove.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 修改看板
     * Summary: 修改看板
     *
     * @param UpdateChaininsightWidgetsRequest $request
     *
     * @return UpdateChaininsightWidgetsResponse
     */
    public function updateChaininsightWidgets($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateChaininsightWidgetsEx($request, $headers, $runtime);
    }

    /**
     * Description: 修改看板
     * Summary: 修改看板
     *
     * @param UpdateChaininsightWidgetsRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateChaininsightWidgetsResponse
     */
    public function updateChaininsightWidgetsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateChaininsightWidgetsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.widgets.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 下载合约
     * Summary: 下载合约.
     *
     * @param DownloadChaininsightContractRequest $request
     *
     * @return DownloadChaininsightContractResponse
     */
    public function downloadChaininsightContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadChaininsightContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 下载合约
     * Summary: 下载合约.
     *
     * @param DownloadChaininsightContractRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return DownloadChaininsightContractResponse
     */
    public function downloadChaininsightContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadChaininsightContractResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.contract.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询修改合约的交易
     * Summary: 查询修改合约的交易.
     *
     * @param PagequeryChaininsightContractmodifytxRequest $request
     *
     * @return PagequeryChaininsightContractmodifytxResponse
     */
    public function pagequeryChaininsightContractmodifytx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryChaininsightContractmodifytxEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询修改合约的交易
     * Summary: 查询修改合约的交易.
     *
     * @param PagequeryChaininsightContractmodifytxRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return PagequeryChaininsightContractmodifytxResponse
     */
    public function pagequeryChaininsightContractmodifytxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryChaininsightContractmodifytxResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.contractmodifytx.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询账户的修改交易
     * Summary: 分页查询账户的修改交易.
     *
     * @param PagequeryChaininsightAccountmodifytxRequest $request
     *
     * @return PagequeryChaininsightAccountmodifytxResponse
     */
    public function pagequeryChaininsightAccountmodifytx($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryChaininsightAccountmodifytxEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询账户的修改交易
     * Summary: 分页查询账户的修改交易.
     *
     * @param PagequeryChaininsightAccountmodifytxRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return PagequeryChaininsightAccountmodifytxResponse
     */
    public function pagequeryChaininsightAccountmodifytxEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryChaininsightAccountmodifytxResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.accountmodifytx.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 返回对应 ERC 类型资产统计所必须的接口
     * Summary: 查询资产统计所必须的接口.
     *
     * @param ListChaininsightAssetinterfacesrequiredRequest $request
     *
     * @return ListChaininsightAssetinterfacesrequiredResponse
     */
    public function listChaininsightAssetinterfacesrequired($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listChaininsightAssetinterfacesrequiredEx($request, $headers, $runtime);
    }

    /**
     * Description: 返回对应 ERC 类型资产统计所必须的接口
     * Summary: 查询资产统计所必须的接口.
     *
     * @param ListChaininsightAssetinterfacesrequiredRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return ListChaininsightAssetinterfacesrequiredResponse
     */
    public function listChaininsightAssetinterfacesrequiredEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListChaininsightAssetinterfacesrequiredResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.assetinterfacesrequired.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链上资产的详情
     * Summary: 查询资产详情.
     *
     * @param QueryChaininsightStatisticassetdetailRequest $request
     *
     * @return QueryChaininsightStatisticassetdetailResponse
     */
    public function queryChaininsightStatisticassetdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightStatisticassetdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链上资产的详情
     * Summary: 查询资产详情.
     *
     * @param QueryChaininsightStatisticassetdetailRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return QueryChaininsightStatisticassetdetailResponse
     */
    public function queryChaininsightStatisticassetdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightStatisticassetdetailResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statisticassetdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链上资产合约中资产的元信息
     * Summary: 查询链上资产元信息.
     *
     * @param QueryChaininsightStatisticassetmetaRequest $request
     *
     * @return QueryChaininsightStatisticassetmetaResponse
     */
    public function queryChaininsightStatisticassetmeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightStatisticassetmetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链上资产合约中资产的元信息
     * Summary: 查询链上资产元信息.
     *
     * @param QueryChaininsightStatisticassetmetaRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryChaininsightStatisticassetmetaResponse
     */
    public function queryChaininsightStatisticassetmetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightStatisticassetmetaResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statisticassetmeta.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
     * Summary: 查询链上资产的持有者信息.
     *
     * @param PagequeryChaininsightStatisticassetownerRequest $request
     *
     * @return PagequeryChaininsightStatisticassetownerResponse
     */
    public function pagequeryChaininsightStatisticassetowner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryChaininsightStatisticassetownerEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
     * Summary: 查询链上资产的持有者信息.
     *
     * @param PagequeryChaininsightStatisticassetownerRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return PagequeryChaininsightStatisticassetownerResponse
     */
    public function pagequeryChaininsightStatisticassetownerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryChaininsightStatisticassetownerResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statisticassetowner.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
     * Summary: 查询链上账户的资产列表.
     *
     * @param PagequeryChaininsightStatisticassetinventoryaccountRequest $request
     *
     * @return PagequeryChaininsightStatisticassetinventoryaccountResponse
     */
    public function pagequeryChaininsightStatisticassetinventoryaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryChaininsightStatisticassetinventoryaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
     * Summary: 查询链上账户的资产列表.
     *
     * @param PagequeryChaininsightStatisticassetinventoryaccountRequest $request
     * @param string[]                                                   $headers
     * @param RuntimeOptions                                             $runtime
     *
     * @return PagequeryChaininsightStatisticassetinventoryaccountResponse
     */
    public function pagequeryChaininsightStatisticassetinventoryaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryChaininsightStatisticassetinventoryaccountResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statisticassetinventoryaccount.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
     * Summary: 查询链上资产的流转信息.
     *
     * @param PagequeryChaininsightStatisticassethistoryassetRequest $request
     *
     * @return PagequeryChaininsightStatisticassethistoryassetResponse
     */
    public function pagequeryChaininsightStatisticassethistoryasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryChaininsightStatisticassethistoryassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
     * Summary: 查询链上资产的流转信息.
     *
     * @param PagequeryChaininsightStatisticassethistoryassetRequest $request
     * @param string[]                                               $headers
     * @param RuntimeOptions                                         $runtime
     *
     * @return PagequeryChaininsightStatisticassethistoryassetResponse
     */
    public function pagequeryChaininsightStatisticassethistoryassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryChaininsightStatisticassethistoryassetResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statisticassethistoryasset.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
     * Summary: 查询链上资产合约的资产流转信息.
     *
     * @param PagequeryChaininsightStatisticassethistorycontractRequest $request
     *
     * @return PagequeryChaininsightStatisticassethistorycontractResponse
     */
    public function pagequeryChaininsightStatisticassethistorycontract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryChaininsightStatisticassethistorycontractEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
     * Summary: 查询链上资产合约的资产流转信息.
     *
     * @param PagequeryChaininsightStatisticassethistorycontractRequest $request
     * @param string[]                                                  $headers
     * @param RuntimeOptions                                            $runtime
     *
     * @return PagequeryChaininsightStatisticassethistorycontractResponse
     */
    public function pagequeryChaininsightStatisticassethistorycontractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryChaininsightStatisticassethistorycontractResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.statisticassethistorycontract.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
     * Summary: 列出链上地址的时间轴配置.
     *
     * @param QueryChaininsightContracttimelineconfigRequest $request
     *
     * @return QueryChaininsightContracttimelineconfigResponse
     */
    public function queryChaininsightContracttimelineconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChaininsightContracttimelineconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
     * Summary: 列出链上地址的时间轴配置.
     *
     * @param QueryChaininsightContracttimelineconfigRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return QueryChaininsightContracttimelineconfigResponse
     */
    public function queryChaininsightContracttimelineconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChaininsightContracttimelineconfigResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.contracttimelineconfig.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
     * Summary: 更新链上地址的时间轴配置.
     *
     * @param UpdateChaininsightContracttimelineconfigRequest $request
     *
     * @return UpdateChaininsightContracttimelineconfigResponse
     */
    public function updateChaininsightContracttimelineconfig($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateChaininsightContracttimelineconfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
     * Summary: 更新链上地址的时间轴配置.
     *
     * @param UpdateChaininsightContracttimelineconfigRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return UpdateChaininsightContracttimelineconfigResponse
     */
    public function updateChaininsightContracttimelineconfigEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateChaininsightContracttimelineconfigResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.contracttimelineconfig.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 重写接口参数配置
     * Summary: 重写接口参数配置.
     *
     * @param SaveChaininsightContractinterfaceRequest $request
     *
     * @return SaveChaininsightContractinterfaceResponse
     */
    public function saveChaininsightContractinterface($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveChaininsightContractinterfaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 重写接口参数配置
     * Summary: 重写接口参数配置.
     *
     * @param SaveChaininsightContractinterfaceRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return SaveChaininsightContractinterfaceResponse
     */
    public function saveChaininsightContractinterfaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveChaininsightContractinterfaceResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册链信息
     * Summary: 注册链信息.
     *
     * @param RegisterChainsRequest $request
     *
     * @return RegisterChainsResponse
     */
    public function registerChains($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerChainsEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册链信息
     * Summary: 注册链信息.
     *
     * @param RegisterChainsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RegisterChainsResponse
     */
    public function registerChainsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterChainsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chains.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 操作数据网关开通状态
     * Summary: 操作数据网关开通状态
     *
     * @param OperateChainsRequest $request
     *
     * @return OperateChainsResponse
     */
    public function operateChains($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateChainsEx($request, $headers, $runtime);
    }

    /**
     * Description: 操作数据网关开通状态
     * Summary: 操作数据网关开通状态
     *
     * @param OperateChainsRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return OperateChainsResponse
     */
    public function operateChainsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateChainsResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chains.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询某条链的服务开通状态
     * Summary: 查询某条链的服务开通状态
     *
     * @param GetChainsStatusRequest $request
     *
     * @return GetChainsStatusResponse
     */
    public function getChainsStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getChainsStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询某条链的服务开通状态
     * Summary: 查询某条链的服务开通状态
     *
     * @param GetChainsStatusRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetChainsStatusResponse
     */
    public function getChainsStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetChainsStatusResponse::fromMap($this->doRequest('1.0', 'antchain.baasdatagw.chains.status.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
