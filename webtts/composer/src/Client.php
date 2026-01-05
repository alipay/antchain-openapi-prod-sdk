<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Util\UtilClient;
use AntChain\WEBTTS\Models\AddDacWhitelistRequest;
use AntChain\WEBTTS\Models\AddDacWhitelistResponse;
use AntChain\WEBTTS\Models\CheckDacWhitelistRequest;
use AntChain\WEBTTS\Models\CheckDacWhitelistResponse;
use AntChain\WEBTTS\Models\CreateDacDepositRequest;
use AntChain\WEBTTS\Models\CreateDacDepositResponse;
use AntChain\WEBTTS\Models\OpenActivateRequest;
use AntChain\WEBTTS\Models\OpenActivateResponse;
use AntChain\WEBTTS\Models\PagequeryDacBlockchainRequest;
use AntChain\WEBTTS\Models\PagequeryDacBlockchainResponse;
use AntChain\WEBTTS\Models\PagequeryDacDepositRequest;
use AntChain\WEBTTS\Models\PagequeryDacDepositResponse;
use AntChain\WEBTTS\Models\PagequeryDacTokenRequest;
use AntChain\WEBTTS\Models\PagequeryDacTokenResponse;
use AntChain\WEBTTS\Models\PagequeryDacWhitelistRequest;
use AntChain\WEBTTS\Models\PagequeryDacWhitelistResponse;
use AntChain\WEBTTS\Models\QueryDacCustodyaddressRequest;
use AntChain\WEBTTS\Models\QueryDacCustodyaddressResponse;
use AntChain\WEBTTS\Models\QueryDacDepositlimitsRequest;
use AntChain\WEBTTS\Models\QueryDacDepositlimitsResponse;
use AntChain\WEBTTS\Models\QueryDacQuotaRequest;
use AntChain\WEBTTS\Models\QueryDacQuotaResponse;
use AntChain\WEBTTS\Models\StopActivateRequest;
use AntChain\WEBTTS\Models\StopActivateResponse;
use AntChain\WEBTTS\Models\WithdrawDacVaultRequest;
use AntChain\WEBTTS\Models\WithdrawDacVaultResponse;
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
            // 区块链response
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
                    'sdk_version'      => '1.0.7',
                    '_prod_code'       => 'WEBTTS',
                    '_prod_channel'    => 'default',
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
     * Description: Withdraw Token
     * Summary: Withdraw Token.
     *
     * @param WithdrawDacVaultRequest $request
     *
     * @return WithdrawDacVaultResponse
     */
    public function withdrawDacVault($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->withdrawDacVaultEx($request, $headers, $runtime);
    }

    /**
     * Description: Withdraw Token
     * Summary: Withdraw Token.
     *
     * @param WithdrawDacVaultRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return WithdrawDacVaultResponse
     */
    public function withdrawDacVaultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return WithdrawDacVaultResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.vault.withdraw', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 开通托管服务
     * Summary: 开通托管服务
     *
     * @param OpenActivateRequest $request
     *
     * @return OpenActivateResponse
     */
    public function openActivate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openActivateEx($request, $headers, $runtime);
    }

    /**
     * Description: 开通托管服务
     * Summary: 开通托管服务
     *
     * @param OpenActivateRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return OpenActivateResponse
     */
    public function openActivateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenActivateResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.activate.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 关闭托管服务
     * Summary: 关闭托管服务
     *
     * @param StopActivateRequest $request
     *
     * @return StopActivateResponse
     */
    public function stopActivate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->stopActivateEx($request, $headers, $runtime);
    }

    /**
     * Description: 关闭托管服务
     * Summary: 关闭托管服务
     *
     * @param StopActivateRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return StopActivateResponse
     */
    public function stopActivateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StopActivateResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.activate.stop', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询支持的区块链
     * Summary: 分页查询支持的区块链.
     *
     * @param PagequeryDacBlockchainRequest $request
     *
     * @return PagequeryDacBlockchainResponse
     */
    public function pagequeryDacBlockchain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryDacBlockchainEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询支持的区块链
     * Summary: 分页查询支持的区块链.
     *
     * @param PagequeryDacBlockchainRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PagequeryDacBlockchainResponse
     */
    public function pagequeryDacBlockchainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryDacBlockchainResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.blockchain.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询支持的币种
     * Summary: 分页查询支持的币种.
     *
     * @param PagequeryDacTokenRequest $request
     *
     * @return PagequeryDacTokenResponse
     */
    public function pagequeryDacToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryDacTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询支持的币种
     * Summary: 分页查询支持的币种.
     *
     * @param PagequeryDacTokenRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return PagequeryDacTokenResponse
     */
    public function pagequeryDacTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryDacTokenResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.token.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加白名单服务
     * Summary: 添加白名单服务
     *
     * @param AddDacWhitelistRequest $request
     *
     * @return AddDacWhitelistResponse
     */
    public function addDacWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addDacWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加白名单服务
     * Summary: 添加白名单服务
     *
     * @param AddDacWhitelistRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AddDacWhitelistResponse
     */
    public function addDacWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddDacWhitelistResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.whitelist.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 白名单地址检查
     * Summary: 白名单地址检查.
     *
     * @param CheckDacWhitelistRequest $request
     *
     * @return CheckDacWhitelistResponse
     */
    public function checkDacWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkDacWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 白名单地址检查
     * Summary: 白名单地址检查.
     *
     * @param CheckDacWhitelistRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CheckDacWhitelistResponse
     */
    public function checkDacWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckDacWhitelistResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.whitelist.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Query customer quota and return the comparative balance between customer quota and customer balance
     * 查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
     * Summary: 查询提现最大金额.
     *
     * @param QueryDacQuotaRequest $request
     *
     * @return QueryDacQuotaResponse
     */
    public function queryDacQuota($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDacQuotaEx($request, $headers, $runtime);
    }

    /**
     * Description: Query customer quota and return the comparative balance between customer quota and customer balance
     * 查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
     * Summary: 查询提现最大金额.
     *
     * @param QueryDacQuotaRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryDacQuotaResponse
     */
    public function queryDacQuotaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDacQuotaResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.quota.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定用户和区块链的托管钱包地址
     * Summary: 查询托管地址
     *
     * @param QueryDacCustodyaddressRequest $request
     *
     * @return QueryDacCustodyaddressResponse
     */
    public function queryDacCustodyaddress($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDacCustodyaddressEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定用户和区块链的托管钱包地址
     * Summary: 查询托管地址
     *
     * @param QueryDacCustodyaddressRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryDacCustodyaddressResponse
     */
    public function queryDacCustodyaddressEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDacCustodyaddressResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.custodyaddress.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建deposit订单
     * Summary: 创建deposit订单.
     *
     * @param CreateDacDepositRequest $request
     *
     * @return CreateDacDepositResponse
     */
    public function createDacDeposit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDacDepositEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建deposit订单
     * Summary: 创建deposit订单.
     *
     * @param CreateDacDepositRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateDacDepositResponse
     */
    public function createDacDepositEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDacDepositResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.deposit.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询deposit订单列表
     * Summary: 分页查询deposit订单列表.
     *
     * @param PagequeryDacDepositRequest $request
     *
     * @return PagequeryDacDepositResponse
     */
    public function pagequeryDacDeposit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryDacDepositEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询deposit订单列表
     * Summary: 分页查询deposit订单列表.
     *
     * @param PagequeryDacDepositRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PagequeryDacDepositResponse
     */
    public function pagequeryDacDepositEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryDacDepositResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.deposit.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询最大/最小可以deposit的数量
     * Summary: 查询最大/最小可以deposit的数量.
     *
     * @param QueryDacDepositlimitsRequest $request
     *
     * @return QueryDacDepositlimitsResponse
     */
    public function queryDacDepositlimits($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDacDepositlimitsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询最大/最小可以deposit的数量
     * Summary: 查询最大/最小可以deposit的数量.
     *
     * @param QueryDacDepositlimitsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryDacDepositlimitsResponse
     */
    public function queryDacDepositlimitsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDacDepositlimitsResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.depositlimits.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 白名单分页列表查询
     * Summary: 白名单分页列表查询.
     *
     * @param PagequeryDacWhitelistRequest $request
     *
     * @return PagequeryDacWhitelistResponse
     */
    public function pagequeryDacWhitelist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryDacWhitelistEx($request, $headers, $runtime);
    }

    /**
     * Description: 白名单分页列表查询
     * Summary: 白名单分页列表查询.
     *
     * @param PagequeryDacWhitelistRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PagequeryDacWhitelistResponse
     */
    public function pagequeryDacWhitelistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryDacWhitelistResponse::fromMap($this->doRequest('1.0', 'antdigital.webtts.dac.whitelist.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
