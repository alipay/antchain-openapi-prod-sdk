<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorOperationlogRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorOperationlogResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorProjectRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorProjectResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorSubuserRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeDistributorSubuserResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerOperationlogRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerOperationlogResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerProjectRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerProjectResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerSubuserRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\ListAntdigitalWebtrwatradeIssuerSubuserResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\UpdateAntdigitalWebtrwatradeIssuerPriceRequest;
use AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models\UpdateAntdigitalWebtrwatradeIssuerPriceResponse;
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
            // 跨链账号明细
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
                    'sdk_version'      => '1.1.1',
                    '_prod_code'       => 'ak_d3c4f09125a14cd587057c405561809a',
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
     * Description: 更新项目净值
     * Summary: 更新项目净值
     *
     * @param UpdateAntdigitalWebtrwatradeIssuerPriceRequest $request
     *
     * @return UpdateAntdigitalWebtrwatradeIssuerPriceResponse
     */
    public function updateAntdigitalWebtrwatradeIssuerPrice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAntdigitalWebtrwatradeIssuerPriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新项目净值
     * Summary: 更新项目净值
     *
     * @param UpdateAntdigitalWebtrwatradeIssuerPriceRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return UpdateAntdigitalWebtrwatradeIssuerPriceResponse
     */
    public function updateAntdigitalWebtrwatradeIssuerPriceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAntdigitalWebtrwatradeIssuerPriceResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.price.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构查询登录登出操作日志
     * Summary: 发行机构查询登录登出操作日志.
     *
     * @param ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest $request
     *
     * @return ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse
     */
    public function listAntdigitalWebtrwatradeIssuerOperationloglogininfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeIssuerOperationloglogininfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构查询登录登出操作日志
     * Summary: 发行机构查询登录登出操作日志.
     *
     * @param ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest $request
     * @param string[]                                                     $headers
     * @param RuntimeOptions                                               $runtime
     *
     * @return ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse
     */
    public function listAntdigitalWebtrwatradeIssuerOperationloglogininfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.operationloglogininfo.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构查询登录登出操作日志
     * Summary: 代销机构查询登录登出操作日志.
     *
     * @param ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest $request
     *
     * @return ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse
     */
    public function listAntdigitalWebtrwatradeDistributorOperationloglogininfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeDistributorOperationloglogininfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构查询登录登出操作日志
     * Summary: 代销机构查询登录登出操作日志.
     *
     * @param ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest $request
     * @param string[]                                                          $headers
     * @param RuntimeOptions                                                    $runtime
     *
     * @return ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse
     */
    public function listAntdigitalWebtrwatradeDistributorOperationloglogininfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.operationloglogininfo.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构获取二级用户详情数据
     * Summary: 发行机构获取二级用户详情数据.
     *
     * @param QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest $request
     *
     * @return QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse
     */
    public function queryAntdigitalWebtrwatradeIssuerSubuserdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntdigitalWebtrwatradeIssuerSubuserdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构获取二级用户详情数据
     * Summary: 发行机构获取二级用户详情数据.
     *
     * @param QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest $request
     * @param string[]                                              $headers
     * @param RuntimeOptions                                        $runtime
     *
     * @return QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse
     */
    public function queryAntdigitalWebtrwatradeIssuerSubuserdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.subuserdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构获取二级用户详情数据
     * Summary: 代销机构获取二级用户详情数据.
     *
     * @param QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest $request
     *
     * @return QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse
     */
    public function queryAntdigitalWebtrwatradeDistributorSubuserdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntdigitalWebtrwatradeDistributorSubuserdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构获取二级用户详情数据
     * Summary: 代销机构获取二级用户详情数据.
     *
     * @param QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest $request
     * @param string[]                                                   $headers
     * @param RuntimeOptions                                             $runtime
     *
     * @return QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse
     */
    public function queryAntdigitalWebtrwatradeDistributorSubuserdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.subuserdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构跨链账号明细
     * Summary: 发行机构跨链账号明细.
     *
     * @param ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest $request
     *
     * @return ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse
     */
    public function listAntdigitalWebtrwatradeIssuerCrosschainaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeIssuerCrosschainaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构跨链账号明细
     * Summary: 发行机构跨链账号明细.
     *
     * @param ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest $request
     * @param string[]                                                 $headers
     * @param RuntimeOptions                                           $runtime
     *
     * @return ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse
     */
    public function listAntdigitalWebtrwatradeIssuerCrosschainaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.crosschainaccount.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构跨链账号明细
     * Summary: 代销机构跨链账号明细.
     *
     * @param ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest $request
     *
     * @return ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse
     */
    public function listAntdigitalWebtrwatradeDistributorCrosschainaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeDistributorCrosschainaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构跨链账号明细
     * Summary: 代销机构跨链账号明细.
     *
     * @param ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest $request
     * @param string[]                                                      $headers
     * @param RuntimeOptions                                                $runtime
     *
     * @return ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse
     */
    public function listAntdigitalWebtrwatradeDistributorCrosschainaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.crosschainaccount.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构查询项目及角色信息
     * Summary: 发行机构查询项目及角色信息.
     *
     * @param DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest $request
     *
     * @return DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse
     */
    public function detailAntdigitalWebtrwatradeIssuerProjectwithrole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailAntdigitalWebtrwatradeIssuerProjectwithroleEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构查询项目及角色信息
     * Summary: 发行机构查询项目及角色信息.
     *
     * @param DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest $request
     * @param string[]                                                 $headers
     * @param RuntimeOptions                                           $runtime
     *
     * @return DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse
     */
    public function detailAntdigitalWebtrwatradeIssuerProjectwithroleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.projectwithrole.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构查询所有操作员的操作日志
     * Summary: 发行机构查询所有操作员的操作日志.
     *
     * @param ListAntdigitalWebtrwatradeIssuerOperationlogRequest $request
     *
     * @return ListAntdigitalWebtrwatradeIssuerOperationlogResponse
     */
    public function listAntdigitalWebtrwatradeIssuerOperationlog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeIssuerOperationlogEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构查询所有操作员的操作日志
     * Summary: 发行机构查询所有操作员的操作日志.
     *
     * @param ListAntdigitalWebtrwatradeIssuerOperationlogRequest $request
     * @param string[]                                            $headers
     * @param RuntimeOptions                                      $runtime
     *
     * @return ListAntdigitalWebtrwatradeIssuerOperationlogResponse
     */
    public function listAntdigitalWebtrwatradeIssuerOperationlogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeIssuerOperationlogResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.operationlog.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构查询所有操作员的操作日志
     * Summary: 代销机构查询所有操作员的操作日志.
     *
     * @param ListAntdigitalWebtrwatradeDistributorOperationlogRequest $request
     *
     * @return ListAntdigitalWebtrwatradeDistributorOperationlogResponse
     */
    public function listAntdigitalWebtrwatradeDistributorOperationlog($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeDistributorOperationlogEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构查询所有操作员的操作日志
     * Summary: 代销机构查询所有操作员的操作日志.
     *
     * @param ListAntdigitalWebtrwatradeDistributorOperationlogRequest $request
     * @param string[]                                                 $headers
     * @param RuntimeOptions                                           $runtime
     *
     * @return ListAntdigitalWebtrwatradeDistributorOperationlogResponse
     */
    public function listAntdigitalWebtrwatradeDistributorOperationlogEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeDistributorOperationlogResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.operationlog.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询发行机构下所有的项目
     * Summary: 查询发行机构下所有的项目.
     *
     * @param ListAntdigitalWebtrwatradeIssuerProjectRequest $request
     *
     * @return ListAntdigitalWebtrwatradeIssuerProjectResponse
     */
    public function listAntdigitalWebtrwatradeIssuerProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeIssuerProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询发行机构下所有的项目
     * Summary: 查询发行机构下所有的项目.
     *
     * @param ListAntdigitalWebtrwatradeIssuerProjectRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return ListAntdigitalWebtrwatradeIssuerProjectResponse
     */
    public function listAntdigitalWebtrwatradeIssuerProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeIssuerProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.project.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询代销机构下所有的项目
     * Summary: 查询代销机构下所有的项目.
     *
     * @param ListAntdigitalWebtrwatradeDistributorProjectRequest $request
     *
     * @return ListAntdigitalWebtrwatradeDistributorProjectResponse
     */
    public function listAntdigitalWebtrwatradeDistributorProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeDistributorProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询代销机构下所有的项目
     * Summary: 查询代销机构下所有的项目.
     *
     * @param ListAntdigitalWebtrwatradeDistributorProjectRequest $request
     * @param string[]                                            $headers
     * @param RuntimeOptions                                      $runtime
     *
     * @return ListAntdigitalWebtrwatradeDistributorProjectResponse
     */
    public function listAntdigitalWebtrwatradeDistributorProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeDistributorProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.project.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询发行机构和项目下所有关联的二级用户信息
     * Summary: 查询机构和项目下所有关联的二级用户信息.
     *
     * @param ListAntdigitalWebtrwatradeIssuerSubuserRequest $request
     *
     * @return ListAntdigitalWebtrwatradeIssuerSubuserResponse
     */
    public function listAntdigitalWebtrwatradeIssuerSubuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeIssuerSubuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询发行机构和项目下所有关联的二级用户信息
     * Summary: 查询机构和项目下所有关联的二级用户信息.
     *
     * @param ListAntdigitalWebtrwatradeIssuerSubuserRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return ListAntdigitalWebtrwatradeIssuerSubuserResponse
     */
    public function listAntdigitalWebtrwatradeIssuerSubuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeIssuerSubuserResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.subuser.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询代销机构和项目下所有关联的二级用户信息
     * Summary: 查询机构和项目下所有关联的二级用户信息.
     *
     * @param ListAntdigitalWebtrwatradeDistributorSubuserRequest $request
     *
     * @return ListAntdigitalWebtrwatradeDistributorSubuserResponse
     */
    public function listAntdigitalWebtrwatradeDistributorSubuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntdigitalWebtrwatradeDistributorSubuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询代销机构和项目下所有关联的二级用户信息
     * Summary: 查询机构和项目下所有关联的二级用户信息.
     *
     * @param ListAntdigitalWebtrwatradeDistributorSubuserRequest $request
     * @param string[]                                            $headers
     * @param RuntimeOptions                                      $runtime
     *
     * @return ListAntdigitalWebtrwatradeDistributorSubuserResponse
     */
    public function listAntdigitalWebtrwatradeDistributorSubuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntdigitalWebtrwatradeDistributorSubuserResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.subuser.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
