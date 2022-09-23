<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\APPEX\Models\AuthChannelUserRequest;
use AntChain\APPEX\Models\AuthChannelUserResponse;
use AntChain\APPEX\Models\CancelChannelUserRequest;
use AntChain\APPEX\Models\CancelChannelUserResponse;
use AntChain\APPEX\Models\ConfirmUnionApplyRequest;
use AntChain\APPEX\Models\ConfirmUnionApplyResponse;
use AntChain\APPEX\Models\CreateAsynformFormRequest;
use AntChain\APPEX\Models\CreateAsynformFormResponse;
use AntChain\APPEX\Models\CreateMypocketChainaccountRequest;
use AntChain\APPEX\Models\CreateMypocketChainaccountResponse;
use AntChain\APPEX\Models\CreateMypocketDidaccountbyalipayRequest;
use AntChain\APPEX\Models\CreateMypocketDidaccountbyalipayResponse;
use AntChain\APPEX\Models\CreateMypocketEscrowchainaccountRequest;
use AntChain\APPEX\Models\CreateMypocketEscrowchainaccountResponse;
use AntChain\APPEX\Models\CreateObjectRequest;
use AntChain\APPEX\Models\CreateObjectResponse;
use AntChain\APPEX\Models\CreateObjectTransferRequest;
use AntChain\APPEX\Models\CreateObjectTransferResponse;
use AntChain\APPEX\Models\CreateStatusflowTemplateRequest;
use AntChain\APPEX\Models\CreateStatusflowTemplateResponse;
use AntChain\APPEX\Models\CreateUnionApplyRequest;
use AntChain\APPEX\Models\CreateUnionApplyResponse;
use AntChain\APPEX\Models\CreateUnionChannelRequest;
use AntChain\APPEX\Models\CreateUnionChannelResponse;
use AntChain\APPEX\Models\CreateUnionFormRequest;
use AntChain\APPEX\Models\CreateUnionFormResponse;
use AntChain\APPEX\Models\CreateUserDidRequest;
use AntChain\APPEX\Models\CreateUserDidResponse;
use AntChain\APPEX\Models\DeleteStatusflowTemplateRequest;
use AntChain\APPEX\Models\DeleteStatusflowTemplateResponse;
use AntChain\APPEX\Models\DeploySolutionContractRequest;
use AntChain\APPEX\Models\DeploySolutionContractResponse;
use AntChain\APPEX\Models\ExecContractServiceRequest;
use AntChain\APPEX\Models\ExecContractServiceResponse;
use AntChain\APPEX\Models\GetSolutionFilenotarystatusRequest;
use AntChain\APPEX\Models\GetSolutionFilenotarystatusResponse;
use AntChain\APPEX\Models\InitSolutionBmsRequest;
use AntChain\APPEX\Models\InitSolutionBmsResponse;
use AntChain\APPEX\Models\InitSolutionFilenotaryRequest;
use AntChain\APPEX\Models\InitSolutionFilenotaryResponse;
use AntChain\APPEX\Models\ListChannelUserformRequest;
use AntChain\APPEX\Models\ListChannelUserformResponse;
use AntChain\APPEX\Models\ListDatastatusDriveRequest;
use AntChain\APPEX\Models\ListDatastatusDriveResponse;
use AntChain\APPEX\Models\ListObjectTransferRequest;
use AntChain\APPEX\Models\ListObjectTransferResponse;
use AntChain\APPEX\Models\ListUnionPubchannelRequest;
use AntChain\APPEX\Models\ListUnionPubchannelResponse;
use AntChain\APPEX\Models\ListUserChannelRequest;
use AntChain\APPEX\Models\ListUserChannelResponse;
use AntChain\APPEX\Models\PagequeryUnionFormRequest;
use AntChain\APPEX\Models\PagequeryUnionFormResponse;
use AntChain\APPEX\Models\QueryAsynformStatusRequest;
use AntChain\APPEX\Models\QueryAsynformStatusResponse;
use AntChain\APPEX\Models\QueryMypocketChainaccountRequest;
use AntChain\APPEX\Models\QueryMypocketChainaccountResponse;
use AntChain\APPEX\Models\QueryMypocketDidaccountbyalipayRequest;
use AntChain\APPEX\Models\QueryMypocketDidaccountbyalipayResponse;
use AntChain\APPEX\Models\QueryMypocketEscrowchainaccountRequest;
use AntChain\APPEX\Models\QueryMypocketEscrowchainaccountResponse;
use AntChain\APPEX\Models\QuerySolutionBmsRequest;
use AntChain\APPEX\Models\QuerySolutionBmsResponse;
use AntChain\APPEX\Models\QuerySolutionFastnotaryRequest;
use AntChain\APPEX\Models\QuerySolutionFastnotaryResponse;
use AntChain\APPEX\Models\QuerySolutionFilenotaryRequest;
use AntChain\APPEX\Models\QuerySolutionFilenotaryResponse;
use AntChain\APPEX\Models\QueryStatusflowTemplateRequest;
use AntChain\APPEX\Models\QueryStatusflowTemplateResponse;
use AntChain\APPEX\Models\QueryUnionFormRequest;
use AntChain\APPEX\Models\QueryUnionFormResponse;
use AntChain\APPEX\Models\SaveSolutionFastnotaryRequest;
use AntChain\APPEX\Models\SaveSolutionFastnotaryResponse;
use AntChain\APPEX\Models\StartDatastatusDriveRequest;
use AntChain\APPEX\Models\StartDatastatusDriveResponse;
use AntChain\APPEX\Models\StartMypocketAppdidsignverifyRequest;
use AntChain\APPEX\Models\StartMypocketAppdidsignverifyResponse;
use AntChain\APPEX\Models\StartMypocketUserdidsignverifyRequest;
use AntChain\APPEX\Models\StartMypocketUserdidsignverifyResponse;
use AntChain\APPEX\Models\SyncSolutionFilenotaryRequest;
use AntChain\APPEX\Models\SyncSolutionFilenotaryResponse;
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
            // NameValuePair
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
                    'sdk_version'      => '1.3.8',
                    '_prod_code'       => 'APPEX',
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
     * Description: 为用户在MyPocket创建链上账户
     * Summary: MyPocket创建链上账户.
     *
     * @param CreateMypocketChainaccountRequest $request
     *
     * @return CreateMypocketChainaccountResponse
     */
    public function createMypocketChainaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMypocketChainaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 为用户在MyPocket创建链上账户
     * Summary: MyPocket创建链上账户.
     *
     * @param CreateMypocketChainaccountRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return CreateMypocketChainaccountResponse
     */
    public function createMypocketChainaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMypocketChainaccountResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.mypocket.chainaccount.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户根据DID和chainID，查询区块链账户
     * Summary: 用户查询区块链账户.
     *
     * @param QueryMypocketChainaccountRequest $request
     *
     * @return QueryMypocketChainaccountResponse
     */
    public function queryMypocketChainaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMypocketChainaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户根据DID和chainID，查询区块链账户
     * Summary: 用户查询区块链账户.
     *
     * @param QueryMypocketChainaccountRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryMypocketChainaccountResponse
     */
    public function queryMypocketChainaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMypocketChainaccountResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.mypocket.chainaccount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
     * Summary: 创建普通用户DID账户（支付宝UID）.
     *
     * @param CreateMypocketDidaccountbyalipayRequest $request
     *
     * @return CreateMypocketDidaccountbyalipayResponse
     */
    public function createMypocketDidaccountbyalipay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMypocketDidaccountbyalipayEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
     * Summary: 创建普通用户DID账户（支付宝UID）.
     *
     * @param CreateMypocketDidaccountbyalipayRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateMypocketDidaccountbyalipayResponse
     */
    public function createMypocketDidaccountbyalipayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMypocketDidaccountbyalipayResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.mypocket.didaccountbyalipay.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部DApp应用通过支付宝UID查询普通用户did
     * Summary: 查询普通用户did（支付宝UID）.
     *
     * @param QueryMypocketDidaccountbyalipayRequest $request
     *
     * @return QueryMypocketDidaccountbyalipayResponse
     */
    public function queryMypocketDidaccountbyalipay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMypocketDidaccountbyalipayEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部DApp应用通过支付宝UID查询普通用户did
     * Summary: 查询普通用户did（支付宝UID）.
     *
     * @param QueryMypocketDidaccountbyalipayRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryMypocketDidaccountbyalipayResponse
     */
    public function queryMypocketDidaccountbyalipayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMypocketDidaccountbyalipayResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.mypocket.didaccountbyalipay.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部DApp应用创建用户链上账户
     * Summary: 外部DApp应用创建用户链上账户.
     *
     * @param CreateMypocketEscrowchainaccountRequest $request
     *
     * @return CreateMypocketEscrowchainaccountResponse
     */
    public function createMypocketEscrowchainaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createMypocketEscrowchainaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部DApp应用创建用户链上账户
     * Summary: 外部DApp应用创建用户链上账户.
     *
     * @param CreateMypocketEscrowchainaccountRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateMypocketEscrowchainaccountResponse
     */
    public function createMypocketEscrowchainaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateMypocketEscrowchainaccountResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.mypocket.escrowchainaccount.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部DApp应用查询did在指定链上关联的账户
     * Summary: 外部查询did在指定链上关联的账户.
     *
     * @param QueryMypocketEscrowchainaccountRequest $request
     *
     * @return QueryMypocketEscrowchainaccountResponse
     */
    public function queryMypocketEscrowchainaccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMypocketEscrowchainaccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部DApp应用查询did在指定链上关联的账户
     * Summary: 外部查询did在指定链上关联的账户.
     *
     * @param QueryMypocketEscrowchainaccountRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryMypocketEscrowchainaccountResponse
     */
    public function queryMypocketEscrowchainaccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMypocketEscrowchainaccountResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.mypocket.escrowchainaccount.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 验证app did签名
     * Summary: app did验签接口.
     *
     * @param StartMypocketAppdidsignverifyRequest $request
     *
     * @return StartMypocketAppdidsignverifyResponse
     */
    public function startMypocketAppdidsignverify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startMypocketAppdidsignverifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 验证app did签名
     * Summary: app did验签接口.
     *
     * @param StartMypocketAppdidsignverifyRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return StartMypocketAppdidsignverifyResponse
     */
    public function startMypocketAppdidsignverifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartMypocketAppdidsignverifyResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.mypocket.appdidsignverify.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 验证user did签名
     * Summary: 验证user did签名.
     *
     * @param StartMypocketUserdidsignverifyRequest $request
     *
     * @return StartMypocketUserdidsignverifyResponse
     */
    public function startMypocketUserdidsignverify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startMypocketUserdidsignverifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 验证user did签名
     * Summary: 验证user did签名.
     *
     * @param StartMypocketUserdidsignverifyRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return StartMypocketUserdidsignverifyResponse
     */
    public function startMypocketUserdidsignverifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartMypocketUserdidsignverifyResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.mypocket.userdidsignverify.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链身份创建
     * Summary: 区块链身份创建.
     *
     * @param CreateUserDidRequest $request
     *
     * @return CreateUserDidResponse
     */
    public function createUserDid($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUserDidEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链身份创建
     * Summary: 区块链身份创建.
     *
     * @param CreateUserDidRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateUserDidResponse
     */
    public function createUserDidEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUserDidResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.user.did.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 协作联盟创建申请
     * Summary: 协作联盟创建申请.
     *
     * @param CreateUnionApplyRequest $request
     *
     * @return CreateUnionApplyResponse
     */
    public function createUnionApply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUnionApplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 协作联盟创建申请
     * Summary: 协作联盟创建申请.
     *
     * @param CreateUnionApplyRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateUnionApplyResponse
     */
    public function createUnionApplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUnionApplyResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.union.apply.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 联盟创建申请审核，仅内部租户可调用
     * Summary: 联盟创建申请审核.
     *
     * @param ConfirmUnionApplyRequest $request
     *
     * @return ConfirmUnionApplyResponse
     */
    public function confirmUnionApply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmUnionApplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 联盟创建申请审核，仅内部租户可调用
     * Summary: 联盟创建申请审核.
     *
     * @param ConfirmUnionApplyRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ConfirmUnionApplyResponse
     */
    public function confirmUnionApplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmUnionApplyResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.union.apply.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 在联盟中创建信息通道Channel
     * Summary: 在联盟中创建信息通道Channel.
     *
     * @param CreateUnionChannelRequest $request
     *
     * @return CreateUnionChannelResponse
     */
    public function createUnionChannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUnionChannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 在联盟中创建信息通道Channel
     * Summary: 在联盟中创建信息通道Channel.
     *
     * @param CreateUnionChannelRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateUnionChannelResponse
     */
    public function createUnionChannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUnionChannelResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.union.channel.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
     * Summary: 成员查询自己拥有访问权限的channel.
     *
     * @param ListUserChannelRequest $request
     *
     * @return ListUserChannelResponse
     */
    public function listUserChannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUserChannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
     * Summary: 成员查询自己拥有访问权限的channel.
     *
     * @param ListUserChannelRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListUserChannelResponse
     */
    public function listUserChannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUserChannelResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.user.channel.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 联盟公开Channel查询
     * Summary: 联盟公开Channel查询.
     *
     * @param ListUnionPubchannelRequest $request
     *
     * @return ListUnionPubchannelResponse
     */
    public function listUnionPubchannel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUnionPubchannelEx($request, $headers, $runtime);
    }

    /**
     * Description: 联盟公开Channel查询
     * Summary: 联盟公开Channel查询.
     *
     * @param ListUnionPubchannelRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListUnionPubchannelResponse
     */
    public function listUnionPubchannelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUnionPubchannelResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.union.pubchannel.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: Channel授权给用户
     * Summary: Channel授权给用户.
     *
     * @param AuthChannelUserRequest $request
     *
     * @return AuthChannelUserResponse
     */
    public function authChannelUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authChannelUserEx($request, $headers, $runtime);
    }

    /**
     * Description: Channel授权给用户
     * Summary: Channel授权给用户.
     *
     * @param AuthChannelUserRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AuthChannelUserResponse
     */
    public function authChannelUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthChannelUserResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.channel.user.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消用户访问Channel的权限
     * Summary: 取消用户访问Channel的权限.
     *
     * @param CancelChannelUserRequest $request
     *
     * @return CancelChannelUserResponse
     */
    public function cancelChannelUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelChannelUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消用户访问Channel的权限
     * Summary: 取消用户访问Channel的权限.
     *
     * @param CancelChannelUserRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CancelChannelUserResponse
     */
    public function cancelChannelUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelChannelUserResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.channel.user.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单据加密上链
     * Summary: 单据加密上链.
     *
     * @param CreateUnionFormRequest $request
     *
     * @return CreateUnionFormResponse
     */
    public function createUnionForm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUnionFormEx($request, $headers, $runtime);
    }

    /**
     * Description: 单据加密上链
     * Summary: 单据加密上链.
     *
     * @param CreateUnionFormRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateUnionFormResponse
     */
    public function createUnionFormEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUnionFormResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.union.form.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询单个表单
     * Summary: 查询单个表单.
     *
     * @param QueryUnionFormRequest $request
     *
     * @return QueryUnionFormResponse
     */
    public function queryUnionForm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnionFormEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询单个表单
     * Summary: 查询单个表单.
     *
     * @param QueryUnionFormRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryUnionFormResponse
     */
    public function queryUnionFormEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnionFormResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.union.form.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通道中用户可以访问的表单列表
     * Summary: 通道中用户可以访问的表单列表.
     *
     * @param ListChannelUserformRequest $request
     *
     * @return ListChannelUserformResponse
     */
    public function listChannelUserform($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listChannelUserformEx($request, $headers, $runtime);
    }

    /**
     * Description: 通道中用户可以访问的表单列表
     * Summary: 通道中用户可以访问的表单列表.
     *
     * @param ListChannelUserformRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListChannelUserformResponse
     */
    public function listChannelUserformEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListChannelUserformResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.channel.userform.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物上链，链上数字物体创建
     * Summary: 物权上链.
     *
     * @param CreateObjectRequest $request
     *
     * @return CreateObjectResponse
     */
    public function createObject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createObjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 物上链，链上数字物体创建
     * Summary: 物权上链.
     *
     * @param CreateObjectRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateObjectResponse
     */
    public function createObjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateObjectResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.object.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据归属权流转
     * Summary: 数据归属权流转.
     *
     * @param CreateObjectTransferRequest $request
     *
     * @return CreateObjectTransferResponse
     */
    public function createObjectTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createObjectTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据归属权流转
     * Summary: 数据归属权流转.
     *
     * @param CreateObjectTransferRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return CreateObjectTransferResponse
     */
    public function createObjectTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateObjectTransferResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.object.transfer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据归属权流转记录查询
     * Summary: 数据归属权流转记录查询.
     *
     * @param ListObjectTransferRequest $request
     *
     * @return ListObjectTransferResponse
     */
    public function listObjectTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listObjectTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据归属权流转记录查询
     * Summary: 数据归属权流转记录查询.
     *
     * @param ListObjectTransferRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListObjectTransferResponse
     */
    public function listObjectTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListObjectTransferResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.object.transfer.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 状态流驱动模版新增
     * Summary: 状态流驱动模版新增.
     *
     * @param CreateStatusflowTemplateRequest $request
     *
     * @return CreateStatusflowTemplateResponse
     */
    public function createStatusflowTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createStatusflowTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 状态流驱动模版新增
     * Summary: 状态流驱动模版新增.
     *
     * @param CreateStatusflowTemplateRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateStatusflowTemplateResponse
     */
    public function createStatusflowTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateStatusflowTemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.statusflow.template.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 状态流驱动模版删除
     * Summary: 状态流驱动模版删除.
     *
     * @param DeleteStatusflowTemplateRequest $request
     *
     * @return DeleteStatusflowTemplateResponse
     */
    public function deleteStatusflowTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteStatusflowTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 状态流驱动模版删除
     * Summary: 状态流驱动模版删除.
     *
     * @param DeleteStatusflowTemplateRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DeleteStatusflowTemplateResponse
     */
    public function deleteStatusflowTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteStatusflowTemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.statusflow.template.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 状态流驱动模版查询
     * Summary: 状态流驱动模版查询.
     *
     * @param QueryStatusflowTemplateRequest $request
     *
     * @return QueryStatusflowTemplateResponse
     */
    public function queryStatusflowTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStatusflowTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 状态流驱动模版查询
     * Summary: 状态流驱动模版查询.
     *
     * @param QueryStatusflowTemplateRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryStatusflowTemplateResponse
     */
    public function queryStatusflowTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStatusflowTemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.statusflow.template.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据状态驱动
     * Summary: 数据状态驱动.
     *
     * @param StartDatastatusDriveRequest $request
     *
     * @return StartDatastatusDriveResponse
     */
    public function startDatastatusDrive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startDatastatusDriveEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据状态驱动
     * Summary: 数据状态驱动.
     *
     * @param StartDatastatusDriveRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return StartDatastatusDriveResponse
     */
    public function startDatastatusDriveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartDatastatusDriveResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.datastatus.drive.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据状态流转记录
     * Summary: 查询数据状态流转记录.
     *
     * @param ListDatastatusDriveRequest $request
     *
     * @return ListDatastatusDriveResponse
     */
    public function listDatastatusDrive($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDatastatusDriveEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据状态流转记录
     * Summary: 查询数据状态流转记录.
     *
     * @param ListDatastatusDriveRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ListDatastatusDriveResponse
     */
    public function listDatastatusDriveEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDatastatusDriveResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.datastatus.drive.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
     * Summary: 单据加密异步上链.
     *
     * @param CreateAsynformFormRequest $request
     *
     * @return CreateAsynformFormResponse
     */
    public function createAsynformForm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAsynformFormEx($request, $headers, $runtime);
    }

    /**
     * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
     * Summary: 单据加密异步上链.
     *
     * @param CreateAsynformFormRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CreateAsynformFormResponse
     */
    public function createAsynformFormEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAsynformFormResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.asynform.form.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
     * Summary: 单据分页查询.
     *
     * @param PagequeryUnionFormRequest $request
     *
     * @return PagequeryUnionFormResponse
     */
    public function pagequeryUnionForm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryUnionFormEx($request, $headers, $runtime);
    }

    /**
     * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
     * Summary: 单据分页查询.
     *
     * @param PagequeryUnionFormRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PagequeryUnionFormResponse
     */
    public function pagequeryUnionFormEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryUnionFormResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.union.form.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
     * Summary: 单据上链状态查询.
     *
     * @param QueryAsynformStatusRequest $request
     *
     * @return QueryAsynformStatusResponse
     */
    public function queryAsynformStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAsynformStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
     * Summary: 单据上链状态查询.
     *
     * @param QueryAsynformStatusRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryAsynformStatusResponse
     */
    public function queryAsynformStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAsynformStatusResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.asynform.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 结构化存证查询
     * Summary: 结构化存证查询.
     *
     * @param QuerySolutionFastnotaryRequest $request
     *
     * @return QuerySolutionFastnotaryResponse
     */
    public function querySolutionFastnotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySolutionFastnotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 结构化存证查询
     * Summary: 结构化存证查询.
     *
     * @param QuerySolutionFastnotaryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QuerySolutionFastnotaryResponse
     */
    public function querySolutionFastnotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySolutionFastnotaryResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.solution.fastnotary.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发起结构化存证
     * Summary: 发起结构化存证
     *
     * @param SaveSolutionFastnotaryRequest $request
     *
     * @return SaveSolutionFastnotaryResponse
     */
    public function saveSolutionFastnotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveSolutionFastnotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起结构化存证
     * Summary: 发起结构化存证
     *
     * @param SaveSolutionFastnotaryRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SaveSolutionFastnotaryResponse
     */
    public function saveSolutionFastnotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveSolutionFastnotaryResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.solution.fastnotary.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 初始化文件存证
     * Summary: 初始化文件存证
     *
     * @param InitSolutionFilenotaryRequest $request
     *
     * @return InitSolutionFilenotaryResponse
     */
    public function initSolutionFilenotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initSolutionFilenotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 初始化文件存证
     * Summary: 初始化文件存证
     *
     * @param InitSolutionFilenotaryRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return InitSolutionFilenotaryResponse
     */
    public function initSolutionFilenotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitSolutionFilenotaryResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.solution.filenotary.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通知文件上传完成
     * Summary: 通知文件上传完成.
     *
     * @param SyncSolutionFilenotaryRequest $request
     *
     * @return SyncSolutionFilenotaryResponse
     */
    public function syncSolutionFilenotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncSolutionFilenotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 通知文件上传完成
     * Summary: 通知文件上传完成.
     *
     * @param SyncSolutionFilenotaryRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SyncSolutionFilenotaryResponse
     */
    public function syncSolutionFilenotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncSolutionFilenotaryResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.solution.filenotary.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取文件存证的状态
     * Summary: 获取文件存证的状态
     *
     * @param GetSolutionFilenotarystatusRequest $request
     *
     * @return GetSolutionFilenotarystatusResponse
     */
    public function getSolutionFilenotarystatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getSolutionFilenotarystatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取文件存证的状态
     * Summary: 获取文件存证的状态
     *
     * @param GetSolutionFilenotarystatusRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetSolutionFilenotarystatusResponse
     */
    public function getSolutionFilenotarystatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetSolutionFilenotarystatusResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.solution.filenotarystatus.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询文件存证
     * Summary: 查询文件存证
     *
     * @param QuerySolutionFilenotaryRequest $request
     *
     * @return QuerySolutionFilenotaryResponse
     */
    public function querySolutionFilenotary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySolutionFilenotaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询文件存证
     * Summary: 查询文件存证
     *
     * @param QuerySolutionFilenotaryRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QuerySolutionFilenotaryResponse
     */
    public function querySolutionFilenotaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySolutionFilenotaryResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.solution.filenotary.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合约服务调用
     * Summary: 合约服务调用.
     *
     * @param ExecContractServiceRequest $request
     *
     * @return ExecContractServiceResponse
     */
    public function execContractService($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractServiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 合约服务调用
     * Summary: 合约服务调用.
     *
     * @param ExecContractServiceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecContractServiceResponse
     */
    public function execContractServiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractServiceResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.contract.service.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 速搭平台支持openapi创建应用
     * Summary: 创建合约应用.
     *
     * @param InitSolutionBmsRequest $request
     *
     * @return InitSolutionBmsResponse
     */
    public function initSolutionBms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initSolutionBmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 速搭平台支持openapi创建应用
     * Summary: 创建合约应用.
     *
     * @param InitSolutionBmsRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return InitSolutionBmsResponse
     */
    public function initSolutionBmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitSolutionBmsResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.solution.bms.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取合约临时oss url
     * Summary: 获取合约临时oss url.
     *
     * @param QuerySolutionBmsRequest $request
     *
     * @return QuerySolutionBmsResponse
     */
    public function querySolutionBms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySolutionBmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取合约临时oss url
     * Summary: 获取合约临时oss url.
     *
     * @param QuerySolutionBmsRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QuerySolutionBmsResponse
     */
    public function querySolutionBmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySolutionBmsResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.solution.bms.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 应用速搭平台部署合约接口
     * Summary: 应用速搭平台部署合约接口.
     *
     * @param DeploySolutionContractRequest $request
     *
     * @return DeploySolutionContractResponse
     */
    public function deploySolutionContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deploySolutionContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 应用速搭平台部署合约接口
     * Summary: 应用速搭平台部署合约接口.
     *
     * @param DeploySolutionContractRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeploySolutionContractResponse
     */
    public function deploySolutionContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeploySolutionContractResponse::fromMap($this->doRequest('1.0', 'blockchain.appex.solution.contract.deploy', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
