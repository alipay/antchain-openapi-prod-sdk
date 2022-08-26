<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\AddBaasChainSubnetMemberRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\AddBaasChainSubnetMemberResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\ApplyBaasChainAccountAntRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\ApplyBaasChainAccountAntResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\ApplyBaasChainSubnetRestRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\ApplyBaasChainSubnetRestResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CheckBaasChainSubnetCreateRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CheckBaasChainSubnetCreateResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CheckBaasChainSubnetMemberRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CheckBaasChainSubnetMemberResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CreateBaasBlockchainInstanceInnerRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CreateBaasBlockchainInstanceInnerResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CreateBaasChainAccountAntRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CreateBaasChainAccountAntResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CreateBaasChainSubnetRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CreateBaasChainSubnetResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CreateBaasUnionUnionRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\CreateBaasUnionUnionResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\DeleteBaasChainSubnetMemberRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\DeleteBaasChainSubnetMemberResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\DeleteBaasUnionUnionRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\DeleteBaasUnionUnionResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\ExecBaasChainSubnetRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\ExecBaasChainSubnetResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\FreezeBaasChainAccountAntRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\FreezeBaasChainAccountAntResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasChainAccountAntRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasChainAccountAntResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasChainSubnetMemberRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasChainSubnetMemberResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasChainSubnetRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasChainSubnetResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasUnionChainRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasUnionChainResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasUnionUnionRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\QueryBaasUnionUnionResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\UnfreezeBaasChainAccountAntRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\UnfreezeBaasChainAccountAntResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\UpdateBaasChainNameAntRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\UpdateBaasChainNameAntResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\UpdateBaasChainSubnetNameRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\UpdateBaasChainSubnetNameResponse;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\UpdateBaasUnionUnionRequest;
use AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models\UpdateBaasUnionUnionResponse;
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
            // 分页属性
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
                    'sdk_version'      => '1.0.0',
                    '_prod_code'       => 'ak_630ce8157b69499bbf96c1910a852241',
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
     * Description: 区块链实例创建（内部）
     * Summary: 区块链创建（内部）.
     *
     * @param CreateBaasBlockchainInstanceInnerRequest $request
     *
     * @return CreateBaasBlockchainInstanceInnerResponse
     */
    public function createBaasBlockchainInstanceInner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasBlockchainInstanceInnerEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链实例创建（内部）
     * Summary: 区块链创建（内部）.
     *
     * @param CreateBaasBlockchainInstanceInnerRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return CreateBaasBlockchainInstanceInnerResponse
     */
    public function createBaasBlockchainInstanceInnerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasBlockchainInstanceInnerResponse::fromMap($this->doRequest('1.0', 'baas.blockchain.instance.inner.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动创建账户
     * Summary: 自动创建账户.
     *
     * @param ApplyBaasChainAccountAntRequest $request
     *
     * @return ApplyBaasChainAccountAntResponse
     */
    public function applyBaasChainAccountAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyBaasChainAccountAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动创建账户
     * Summary: 自动创建账户.
     *
     * @param ApplyBaasChainAccountAntRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ApplyBaasChainAccountAntResponse
     */
    public function applyBaasChainAccountAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyBaasChainAccountAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.account.ant.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 手工创建账户
     * Summary: 手工创建账户.
     *
     * @param CreateBaasChainAccountAntRequest $request
     *
     * @return CreateBaasChainAccountAntResponse
     */
    public function createBaasChainAccountAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasChainAccountAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 手工创建账户
     * Summary: 手工创建账户.
     *
     * @param CreateBaasChainAccountAntRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateBaasChainAccountAntResponse
     */
    public function createBaasChainAccountAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasChainAccountAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.account.ant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链链上账户冻结
     * Summary: 区块链链上账户冻结.
     *
     * @param FreezeBaasChainAccountAntRequest $request
     *
     * @return FreezeBaasChainAccountAntResponse
     */
    public function freezeBaasChainAccountAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->freezeBaasChainAccountAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链链上账户冻结
     * Summary: 区块链链上账户冻结.
     *
     * @param FreezeBaasChainAccountAntRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return FreezeBaasChainAccountAntResponse
     */
    public function freezeBaasChainAccountAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FreezeBaasChainAccountAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.account.ant.freeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询链上账户列表
     * Summary: 查询链上账户列表.
     *
     * @param QueryBaasChainAccountAntRequest $request
     *
     * @return QueryBaasChainAccountAntResponse
     */
    public function queryBaasChainAccountAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasChainAccountAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询链上账户列表
     * Summary: 查询链上账户列表.
     *
     * @param QueryBaasChainAccountAntRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryBaasChainAccountAntResponse
     */
    public function queryBaasChainAccountAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasChainAccountAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.account.ant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蚂蚁区块链账户解冻
     * Summary: 蚂蚁区块链账户解冻.
     *
     * @param UnfreezeBaasChainAccountAntRequest $request
     *
     * @return UnfreezeBaasChainAccountAntResponse
     */
    public function unfreezeBaasChainAccountAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unfreezeBaasChainAccountAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 蚂蚁区块链账户解冻
     * Summary: 蚂蚁区块链账户解冻.
     *
     * @param UnfreezeBaasChainAccountAntRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return UnfreezeBaasChainAccountAntResponse
     */
    public function unfreezeBaasChainAccountAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnfreezeBaasChainAccountAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.account.ant.unfreeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新区块链的名称
     * Summary: 更新区块链的名称.
     *
     * @param UpdateBaasChainNameAntRequest $request
     *
     * @return UpdateBaasChainNameAntResponse
     */
    public function updateBaasChainNameAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBaasChainNameAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新区块链的名称
     * Summary: 更新区块链的名称.
     *
     * @param UpdateBaasChainNameAntRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateBaasChainNameAntResponse
     */
    public function updateBaasChainNameAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasChainNameAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.name.ant.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链创建
     * Summary: 阿里云子链创建.
     *
     * @param CreateBaasChainSubnetRequest $request
     *
     * @return CreateBaasChainSubnetResponse
     */
    public function createBaasChainSubnet($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasChainSubnetEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链创建
     * Summary: 阿里云子链创建.
     *
     * @param CreateBaasChainSubnetRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateBaasChainSubnetResponse
     */
    public function createBaasChainSubnetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasChainSubnetResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链创建的前置检查
     * Summary: 阿里云子链创建的前置检查.
     *
     * @param CheckBaasChainSubnetCreateRequest $request
     *
     * @return CheckBaasChainSubnetCreateResponse
     */
    public function checkBaasChainSubnetCreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkBaasChainSubnetCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链创建的前置检查
     * Summary: 阿里云子链创建的前置检查.
     *
     * @param CheckBaasChainSubnetCreateRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CheckBaasChainSubnetCreateResponse
     */
    public function checkBaasChainSubnetCreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckBaasChainSubnetCreateResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.create.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链的启动
     * Summary: 阿里云子链的启动.
     *
     * @param ExecBaasChainSubnetRequest $request
     *
     * @return ExecBaasChainSubnetResponse
     */
    public function execBaasChainSubnet($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execBaasChainSubnetEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链的启动
     * Summary: 阿里云子链的启动.
     *
     * @param ExecBaasChainSubnetRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecBaasChainSubnetResponse
     */
    public function execBaasChainSubnetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecBaasChainSubnetResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链成员添加
     * Summary: 阿里云子链成员添加.
     *
     * @param AddBaasChainSubnetMemberRequest $request
     *
     * @return AddBaasChainSubnetMemberResponse
     */
    public function addBaasChainSubnetMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addBaasChainSubnetMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链成员添加
     * Summary: 阿里云子链成员添加.
     *
     * @param AddBaasChainSubnetMemberRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return AddBaasChainSubnetMemberResponse
     */
    public function addBaasChainSubnetMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddBaasChainSubnetMemberResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.member.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链成员添加前校验
     * Summary: 阿里云子链成员添加前校验.
     *
     * @param CheckBaasChainSubnetMemberRequest $request
     *
     * @return CheckBaasChainSubnetMemberResponse
     */
    public function checkBaasChainSubnetMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkBaasChainSubnetMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链成员添加前校验
     * Summary: 阿里云子链成员添加前校验.
     *
     * @param CheckBaasChainSubnetMemberRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CheckBaasChainSubnetMemberResponse
     */
    public function checkBaasChainSubnetMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckBaasChainSubnetMemberResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.member.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链成员删除
     * Summary: 阿里云子链成员删除.
     *
     * @param DeleteBaasChainSubnetMemberRequest $request
     *
     * @return DeleteBaasChainSubnetMemberResponse
     */
    public function deleteBaasChainSubnetMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteBaasChainSubnetMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链成员删除
     * Summary: 阿里云子链成员删除.
     *
     * @param DeleteBaasChainSubnetMemberRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return DeleteBaasChainSubnetMemberResponse
     */
    public function deleteBaasChainSubnetMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteBaasChainSubnetMemberResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.member.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链机构列表查询
     * Summary: 阿里云子链机构列表查询.
     *
     * @param QueryBaasChainSubnetMemberRequest $request
     *
     * @return QueryBaasChainSubnetMemberResponse
     */
    public function queryBaasChainSubnetMember($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasChainSubnetMemberEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链机构列表查询
     * Summary: 阿里云子链机构列表查询.
     *
     * @param QueryBaasChainSubnetMemberRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryBaasChainSubnetMemberResponse
     */
    public function queryBaasChainSubnetMemberEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasChainSubnetMemberResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.member.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链名称修改
     * Summary: 阿里云子链名称修改.
     *
     * @param UpdateBaasChainSubnetNameRequest $request
     *
     * @return UpdateBaasChainSubnetNameResponse
     */
    public function updateBaasChainSubnetName($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBaasChainSubnetNameEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链名称修改
     * Summary: 阿里云子链名称修改.
     *
     * @param UpdateBaasChainSubnetNameRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateBaasChainSubnetNameResponse
     */
    public function updateBaasChainSubnetNameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasChainSubnetNameResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.name.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链列表查询
     * Summary: 阿里云子链列表查询.
     *
     * @param QueryBaasChainSubnetRequest $request
     *
     * @return QueryBaasChainSubnetResponse
     */
    public function queryBaasChainSubnet($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasChainSubnetEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链列表查询
     * Summary: 阿里云子链列表查询.
     *
     * @param QueryBaasChainSubnetRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryBaasChainSubnetResponse
     */
    public function queryBaasChainSubnetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasChainSubnetResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云子链REST开通
     * Summary: 阿里云子链REST开通.
     *
     * @param ApplyBaasChainSubnetRestRequest $request
     *
     * @return ApplyBaasChainSubnetRestResponse
     */
    public function applyBaasChainSubnetRest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyBaasChainSubnetRestEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云子链REST开通
     * Summary: 阿里云子链REST开通.
     *
     * @param ApplyBaasChainSubnetRestRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return ApplyBaasChainSubnetRestResponse
     */
    public function applyBaasChainSubnetRestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyBaasChainSubnetRestResponse::fromMap($this->doRequest('1.0', 'baas.chain.subnet.rest.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取联盟内的蚂蚁区块链列表
     * Summary: 获取联盟内的蚂蚁区块链列表.
     *
     * @param QueryBaasUnionChainRequest $request
     *
     * @return QueryBaasUnionChainResponse
     */
    public function queryBaasUnionChain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasUnionChainEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取联盟内的蚂蚁区块链列表
     * Summary: 获取联盟内的蚂蚁区块链列表.
     *
     * @param QueryBaasUnionChainRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryBaasUnionChainResponse
     */
    public function queryBaasUnionChainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasUnionChainResponse::fromMap($this->doRequest('1.0', 'baas.union.chain.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     *
     * @param CreateBaasUnionUnionRequest $request
     *
     * @return CreateBaasUnionUnionResponse
     */
    public function createBaasUnionUnion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasUnionUnionEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     *
     * @param CreateBaasUnionUnionRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateBaasUnionUnionResponse
     */
    public function createBaasUnionUnionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasUnionUnionResponse::fromMap($this->doRequest('1.0', 'baas.union.union.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除联盟
     * Summary: 删除联盟
     *
     * @param DeleteBaasUnionUnionRequest $request
     *
     * @return DeleteBaasUnionUnionResponse
     */
    public function deleteBaasUnionUnion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteBaasUnionUnionEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除联盟
     * Summary: 删除联盟
     *
     * @param DeleteBaasUnionUnionRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeleteBaasUnionUnionResponse
     */
    public function deleteBaasUnionUnionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteBaasUnionUnionResponse::fromMap($this->doRequest('1.0', 'baas.union.union.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 联盟查询
     * Summary: 联盟查询.
     *
     * @param QueryBaasUnionUnionRequest $request
     *
     * @return QueryBaasUnionUnionResponse
     */
    public function queryBaasUnionUnion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasUnionUnionEx($request, $headers, $runtime);
    }

    /**
     * Description: 联盟查询
     * Summary: 联盟查询.
     *
     * @param QueryBaasUnionUnionRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryBaasUnionUnionResponse
     */
    public function queryBaasUnionUnionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasUnionUnionResponse::fromMap($this->doRequest('1.0', 'baas.union.union.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 联盟更新
     * Summary: 联盟更新.
     *
     * @param UpdateBaasUnionUnionRequest $request
     *
     * @return UpdateBaasUnionUnionResponse
     */
    public function updateBaasUnionUnion($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateBaasUnionUnionEx($request, $headers, $runtime);
    }

    /**
     * Description: 联盟更新
     * Summary: 联盟更新.
     *
     * @param UpdateBaasUnionUnionRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateBaasUnionUnionResponse
     */
    public function updateBaasUnionUnionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasUnionUnionResponse::fromMap($this->doRequest('1.0', 'baas.union.union.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
