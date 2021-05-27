<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\PROPERTYCHAIN\Models\AddLeagueRequest;
use AntChain\PROPERTYCHAIN\Models\AddLeagueResponse;
use AntChain\PROPERTYCHAIN\Models\AllImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\AllImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\AllTemplateRequest;
use AntChain\PROPERTYCHAIN\Models\AllTemplateResponse;
use AntChain\PROPERTYCHAIN\Models\ApplyCmportFinanceRequest;
use AntChain\PROPERTYCHAIN\Models\ApplyCmportFinanceResponse;
use AntChain\PROPERTYCHAIN\Models\AuthLeagueApplyRequest;
use AntChain\PROPERTYCHAIN\Models\AuthLeagueApplyResponse;
use AntChain\PROPERTYCHAIN\Models\BatchcancelImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\BatchcancelImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\BatchcreateImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\BatchcreateImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\BatchcreateTransferRequest;
use AntChain\PROPERTYCHAIN\Models\BatchcreateTransferResponse;
use AntChain\PROPERTYCHAIN\Models\BatchfreezeImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\BatchfreezeImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\BatchqueryImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\BatchqueryImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\BatchqueryWarehouseStoragelocationRequest;
use AntChain\PROPERTYCHAIN\Models\BatchqueryWarehouseStoragelocationResponse;
use AntChain\PROPERTYCHAIN\Models\BatchunfreezeImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\BatchunfreezeImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\CancelCmportFinanceRequest;
use AntChain\PROPERTYCHAIN\Models\CancelCmportFinanceResponse;
use AntChain\PROPERTYCHAIN\Models\CancelImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\CancelImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\CancelLeagueApplyRequest;
use AntChain\PROPERTYCHAIN\Models\CancelLeagueApplyResponse;
use AntChain\PROPERTYCHAIN\Models\CancelPickupRequest;
use AntChain\PROPERTYCHAIN\Models\CancelPickupResponse;
use AntChain\PROPERTYCHAIN\Models\CancelUserRequest;
use AntChain\PROPERTYCHAIN\Models\CancelUserResponse;
use AntChain\PROPERTYCHAIN\Models\CheckCheckcodeRequest;
use AntChain\PROPERTYCHAIN\Models\CheckCheckcodeResponse;
use AntChain\PROPERTYCHAIN\Models\ConfirmLeagueRequest;
use AntChain\PROPERTYCHAIN\Models\ConfirmLeagueResponse;
use AntChain\PROPERTYCHAIN\Models\CreateAssetpledgeRequest;
use AntChain\PROPERTYCHAIN\Models\CreateAssetpledgeResponse;
use AntChain\PROPERTYCHAIN\Models\CreateAssettemplateRequest;
use AntChain\PROPERTYCHAIN\Models\CreateAssettemplateResponse;
use AntChain\PROPERTYCHAIN\Models\CreateCheckcodeRequest;
use AntChain\PROPERTYCHAIN\Models\CreateCheckcodeResponse;
use AntChain\PROPERTYCHAIN\Models\CreateCmportProfitpartnerRequest;
use AntChain\PROPERTYCHAIN\Models\CreateCmportProfitpartnerResponse;
use AntChain\PROPERTYCHAIN\Models\CreateCmportProfitrateRequest;
use AntChain\PROPERTYCHAIN\Models\CreateCmportProfitrateResponse;
use AntChain\PROPERTYCHAIN\Models\CreateImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\CreateImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\CreateLeagueApplyRequest;
use AntChain\PROPERTYCHAIN\Models\CreateLeagueApplyResponse;
use AntChain\PROPERTYCHAIN\Models\CreateLeagueJoinapplyRequest;
use AntChain\PROPERTYCHAIN\Models\CreateLeagueJoinapplyResponse;
use AntChain\PROPERTYCHAIN\Models\CreateLeagueRequest;
use AntChain\PROPERTYCHAIN\Models\CreateLeagueResponse;
use AntChain\PROPERTYCHAIN\Models\CreatePickupRequest;
use AntChain\PROPERTYCHAIN\Models\CreatePickupResponse;
use AntChain\PROPERTYCHAIN\Models\CreateTemplateRequest;
use AntChain\PROPERTYCHAIN\Models\CreateTemplateResponse;
use AntChain\PROPERTYCHAIN\Models\CreateTransferRequest;
use AntChain\PROPERTYCHAIN\Models\CreateTransferResponse;
use AntChain\PROPERTYCHAIN\Models\CreateUserRequest;
use AntChain\PROPERTYCHAIN\Models\CreateUserResponse;
use AntChain\PROPERTYCHAIN\Models\CreateWarehouseRequest;
use AntChain\PROPERTYCHAIN\Models\CreateWarehouseResponse;
use AntChain\PROPERTYCHAIN\Models\CreateWarehouseStoraglocationRequest;
use AntChain\PROPERTYCHAIN\Models\CreateWarehouseStoraglocationResponse;
use AntChain\PROPERTYCHAIN\Models\DeleteAssettemplateRequest;
use AntChain\PROPERTYCHAIN\Models\DeleteAssettemplateResponse;
use AntChain\PROPERTYCHAIN\Models\DeleteWarehouseRequest;
use AntChain\PROPERTYCHAIN\Models\DeleteWarehouseResponse;
use AntChain\PROPERTYCHAIN\Models\DeleteWarehouseStoragelocationRequest;
use AntChain\PROPERTYCHAIN\Models\DeleteWarehouseStoragelocationResponse;
use AntChain\PROPERTYCHAIN\Models\DescribeImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\DescribeImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\DisablePickupRequest;
use AntChain\PROPERTYCHAIN\Models\DisablePickupResponse;
use AntChain\PROPERTYCHAIN\Models\EnableAssettemplateRequest;
use AntChain\PROPERTYCHAIN\Models\EnableAssettemplateResponse;
use AntChain\PROPERTYCHAIN\Models\FreezeImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\FreezeImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\GetAssettemplateRequest;
use AntChain\PROPERTYCHAIN\Models\GetAssettemplateResponse;
use AntChain\PROPERTYCHAIN\Models\GetDocumentFileRequest;
use AntChain\PROPERTYCHAIN\Models\GetDocumentFileResponse;
use AntChain\PROPERTYCHAIN\Models\GetLeagueAccountinfoRequest;
use AntChain\PROPERTYCHAIN\Models\GetLeagueAccountinfoResponse;
use AntChain\PROPERTYCHAIN\Models\GetWarehouseRequest;
use AntChain\PROPERTYCHAIN\Models\GetWarehouseResponse;
use AntChain\PROPERTYCHAIN\Models\GetWarehouseStoragelocationRequest;
use AntChain\PROPERTYCHAIN\Models\GetWarehouseStoragelocationResponse;
use AntChain\PROPERTYCHAIN\Models\ListAssettemplateRequest;
use AntChain\PROPERTYCHAIN\Models\ListAssettemplateResponse;
use AntChain\PROPERTYCHAIN\Models\ListCmportBankfeeRequest;
use AntChain\PROPERTYCHAIN\Models\ListCmportBankfeeResponse;
use AntChain\PROPERTYCHAIN\Models\ListCmportEnterprisestatementRequest;
use AntChain\PROPERTYCHAIN\Models\ListCmportEnterprisestatementResponse;
use AntChain\PROPERTYCHAIN\Models\ListCmportUserprofitRequest;
use AntChain\PROPERTYCHAIN\Models\ListCmportUserprofitResponse;
use AntChain\PROPERTYCHAIN\Models\ListCmportUserstatementRequest;
use AntChain\PROPERTYCHAIN\Models\ListCmportUserstatementResponse;
use AntChain\PROPERTYCHAIN\Models\ListLeagueApplyRequest;
use AntChain\PROPERTYCHAIN\Models\ListLeagueApplyResponse;
use AntChain\PROPERTYCHAIN\Models\ListLeagueRequest;
use AntChain\PROPERTYCHAIN\Models\ListLeagueResponse;
use AntChain\PROPERTYCHAIN\Models\ListLeagueRoleRequest;
use AntChain\PROPERTYCHAIN\Models\ListLeagueRoleResponse;
use AntChain\PROPERTYCHAIN\Models\ListUserRequest;
use AntChain\PROPERTYCHAIN\Models\ListUserResponse;
use AntChain\PROPERTYCHAIN\Models\ListWarehouseRequest;
use AntChain\PROPERTYCHAIN\Models\ListWarehouseResponse;
use AntChain\PROPERTYCHAIN\Models\ListWarehouseStoragelocationRequest;
use AntChain\PROPERTYCHAIN\Models\ListWarehouseStoragelocationResponse;
use AntChain\PROPERTYCHAIN\Models\MountUserRequest;
use AntChain\PROPERTYCHAIN\Models\MountUserResponse;
use AntChain\PROPERTYCHAIN\Models\NotifyCmportBankRequest;
use AntChain\PROPERTYCHAIN\Models\NotifyCmportBankResponse;
use AntChain\PROPERTYCHAIN\Models\NotifyCmportLoanRequest;
use AntChain\PROPERTYCHAIN\Models\NotifyCmportLoanResponse;
use AntChain\PROPERTYCHAIN\Models\NotifyCmportLogisticsRequest;
use AntChain\PROPERTYCHAIN\Models\NotifyCmportLogisticsResponse;
use AntChain\PROPERTYCHAIN\Models\NotifyCmportRepayRequest;
use AntChain\PROPERTYCHAIN\Models\NotifyCmportRepayResponse;
use AntChain\PROPERTYCHAIN\Models\QueryCmportBankfeeRequest;
use AntChain\PROPERTYCHAIN\Models\QueryCmportBankfeeResponse;
use AntChain\PROPERTYCHAIN\Models\QueryImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\QueryImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\QueryLeagueRequest;
use AntChain\PROPERTYCHAIN\Models\QueryLeagueResponse;
use AntChain\PROPERTYCHAIN\Models\QueryTemplateRequest;
use AntChain\PROPERTYCHAIN\Models\QueryTemplateResponse;
use AntChain\PROPERTYCHAIN\Models\QueryWarehouseDeviceRequest;
use AntChain\PROPERTYCHAIN\Models\QueryWarehouseDeviceResponse;
use AntChain\PROPERTYCHAIN\Models\QueryWarehouseStoragelocationRequest;
use AntChain\PROPERTYCHAIN\Models\QueryWarehouseStoragelocationResponse;
use AntChain\PROPERTYCHAIN\Models\ReleaseAssetpledgeRequest;
use AntChain\PROPERTYCHAIN\Models\ReleaseAssetpledgeResponse;
use AntChain\PROPERTYCHAIN\Models\RepayAssetpledgeRequest;
use AntChain\PROPERTYCHAIN\Models\RepayAssetpledgeResponse;
use AntChain\PROPERTYCHAIN\Models\UnfreezeImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\UnfreezeImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\UpdateAssettemplateRequest;
use AntChain\PROPERTYCHAIN\Models\UpdateAssettemplateResponse;
use AntChain\PROPERTYCHAIN\Models\UpdateDocumentFileRequest;
use AntChain\PROPERTYCHAIN\Models\UpdateDocumentFileResponse;
use AntChain\PROPERTYCHAIN\Models\UpdateImportassetRequest;
use AntChain\PROPERTYCHAIN\Models\UpdateImportassetResponse;
use AntChain\PROPERTYCHAIN\Models\UpdateTemplateRequest;
use AntChain\PROPERTYCHAIN\Models\UpdateTemplateResponse;
use AntChain\PROPERTYCHAIN\Models\UpdateUserRequest;
use AntChain\PROPERTYCHAIN\Models\UpdateUserResponse;
use AntChain\PROPERTYCHAIN\Models\UpdateWarehouseRequest;
use AntChain\PROPERTYCHAIN\Models\UpdateWarehouseResponse;
use AntChain\PROPERTYCHAIN\Models\UpdateWarehouseStoragelocationRequest;
use AntChain\PROPERTYCHAIN\Models\UpdateWarehouseStoragelocationResponse;
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
            // 无分组设备
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
                    'sdk_version'      => '1.0.45',
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
     * Description: 用户注册
     * Summary: 用户注册.
     *
     * @param CreateUserRequest $request
     *
     * @return CreateUserResponse
     */
    public function createUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户注册
     * Summary: 用户注册.
     *
     * @param CreateUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CreateUserResponse
     */
    public function createUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUserResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.user.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物权凭证转让/赠送
     * Summary: 物权凭证转让/赠送
     *
     * @param CreateTransferRequest $request
     *
     * @return CreateTransferResponse
     */
    public function createTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 物权凭证转让/赠送
     * Summary: 物权凭证转让/赠送
     *
     * @param CreateTransferRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateTransferResponse
     */
    public function createTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTransferResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.transfer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建提取码
     * Summary: 创建提取码
     *
     * @param CreatePickupRequest $request
     *
     * @return CreatePickupResponse
     */
    public function createPickup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createPickupEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建提取码
     * Summary: 创建提取码
     *
     * @param CreatePickupRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreatePickupResponse
     */
    public function createPickupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreatePickupResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.pickup.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 销毁提取码
     * Summary: 销毁提取码
     *
     * @param CancelPickupRequest $request
     *
     * @return CancelPickupResponse
     */
    public function cancelPickup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelPickupEx($request, $headers, $runtime);
    }

    /**
     * Description: 销毁提取码
     * Summary: 销毁提取码
     *
     * @param CancelPickupRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CancelPickupResponse
     */
    public function cancelPickupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelPickupResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.pickup.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核销提取码
     * Summary: 核销提取码
     *
     * @param DisablePickupRequest $request
     *
     * @return DisablePickupResponse
     */
    public function disablePickup($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->disablePickupEx($request, $headers, $runtime);
    }

    /**
     * Description: 核销提取码
     * Summary: 核销提取码
     *
     * @param DisablePickupRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DisablePickupResponse
     */
    public function disablePickupEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DisablePickupResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.pickup.disable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     *
     * @param CreateLeagueRequest $request
     *
     * @return CreateLeagueResponse
     */
    public function createLeague($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeagueEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建联盟
     * Summary: 创建联盟
     *
     * @param CreateLeagueRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CreateLeagueResponse
     */
    public function createLeagueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeagueResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 加入联盟
     * Summary: 加入联盟
     *
     * @param AddLeagueRequest $request
     *
     * @return AddLeagueResponse
     */
    public function addLeague($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addLeagueEx($request, $headers, $runtime);
    }

    /**
     * Description: 加入联盟
     * Summary: 加入联盟
     *
     * @param AddLeagueRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return AddLeagueResponse
     */
    public function addLeagueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddLeagueResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 审核加入联盟
     * Summary: 审核加入联盟
     *
     * @param ConfirmLeagueRequest $request
     *
     * @return ConfirmLeagueResponse
     */
    public function confirmLeague($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmLeagueEx($request, $headers, $runtime);
    }

    /**
     * Description: 审核加入联盟
     * Summary: 审核加入联盟
     *
     * @param ConfirmLeagueRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ConfirmLeagueResponse
     */
    public function confirmLeagueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmLeagueResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询联盟
     * Summary: 查询联盟
     *
     * @param QueryLeagueRequest $request
     *
     * @return QueryLeagueResponse
     */
    public function queryLeague($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryLeagueEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询联盟
     * Summary: 查询联盟
     *
     * @param QueryLeagueRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryLeagueResponse
     */
    public function queryLeagueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryLeagueResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建资产信息
     * Summary: 创建资产信息.
     *
     * @param CreateImportassetRequest $request
     *
     * @return CreateImportassetResponse
     */
    public function createImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建资产信息
     * Summary: 创建资产信息.
     *
     * @param CreateImportassetRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateImportassetResponse
     */
    public function createImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新物权
     * Summary: 更新物权.
     *
     * @param UpdateImportassetRequest $request
     *
     * @return UpdateImportassetResponse
     */
    public function updateImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新物权
     * Summary: 更新物权.
     *
     * @param UpdateImportassetRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateImportassetResponse
     */
    public function updateImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注销物权
     * Summary: 注销物权.
     *
     * @param CancelImportassetRequest $request
     *
     * @return CancelImportassetResponse
     */
    public function cancelImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 注销物权
     * Summary: 注销物权.
     *
     * @param CancelImportassetRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CancelImportassetResponse
     */
    public function cancelImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 冻结物权
     * Summary: 冻结物权.
     *
     * @param FreezeImportassetRequest $request
     *
     * @return FreezeImportassetResponse
     */
    public function freezeImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->freezeImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 冻结物权
     * Summary: 冻结物权.
     *
     * @param FreezeImportassetRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return FreezeImportassetResponse
     */
    public function freezeImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return FreezeImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.freeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 解冻物权
     * Summary: 解冻物权.
     *
     * @param UnfreezeImportassetRequest $request
     *
     * @return UnfreezeImportassetResponse
     */
    public function unfreezeImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->unfreezeImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 解冻物权
     * Summary: 解冻物权.
     *
     * @param UnfreezeImportassetRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UnfreezeImportassetResponse
     */
    public function unfreezeImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UnfreezeImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.unfreeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询物权
     * Summary: 查询物权.
     *
     * @param QueryImportassetRequest $request
     *
     * @return QueryImportassetResponse
     */
    public function queryImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询物权
     * Summary: 查询物权.
     *
     * @param QueryImportassetRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryImportassetResponse
     */
    public function queryImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物权列表
     * Summary: 物权列表.
     *
     * @param AllImportassetRequest $request
     *
     * @return AllImportassetResponse
     */
    public function allImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 物权列表
     * Summary: 物权列表.
     *
     * @param AllImportassetRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AllImportassetResponse
     */
    public function allImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量查询溯源信息
     * Summary: 批量查询溯源信息.
     *
     * @param BatchqueryImportassetRequest $request
     *
     * @return BatchqueryImportassetResponse
     */
    public function batchqueryImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量查询溯源信息
     * Summary: 批量查询溯源信息.
     *
     * @param BatchqueryImportassetRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return BatchqueryImportassetResponse
     */
    public function batchqueryImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数据字典
     * Summary: 创建数据字典.
     *
     * @param CreateTemplateRequest $request
     *
     * @return CreateTemplateResponse
     */
    public function createTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数据字典
     * Summary: 创建数据字典.
     *
     * @param CreateTemplateRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateTemplateResponse
     */
    public function createTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.template.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新数据字典
     * Summary: 更新数据字典.
     *
     * @param UpdateTemplateRequest $request
     *
     * @return UpdateTemplateResponse
     */
    public function updateTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新数据字典
     * Summary: 更新数据字典.
     *
     * @param UpdateTemplateRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return UpdateTemplateResponse
     */
    public function updateTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateTemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.template.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据字典
     * Summary: 查询数据字典.
     *
     * @param QueryTemplateRequest $request
     *
     * @return QueryTemplateResponse
     */
    public function queryTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据字典
     * Summary: 查询数据字典.
     *
     * @param QueryTemplateRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryTemplateResponse
     */
    public function queryTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.template.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据字典列表信息
     * Summary: 数据字典列表信息.
     *
     * @param AllTemplateRequest $request
     *
     * @return AllTemplateResponse
     */
    public function allTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->allTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据字典列表信息
     * Summary: 数据字典列表信息.
     *
     * @param AllTemplateRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return AllTemplateResponse
     */
    public function allTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AllTemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.template.all', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建验权码
     * Summary: 创建验权码
     *
     * @param CreateCheckcodeRequest $request
     *
     * @return CreateCheckcodeResponse
     */
    public function createCheckcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCheckcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建验权码
     * Summary: 创建验权码
     *
     * @param CreateCheckcodeRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateCheckcodeResponse
     */
    public function createCheckcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCheckcodeResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.checkcode.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验验权码
     * Summary: 校验验权码
     *
     * @param CheckCheckcodeRequest $request
     *
     * @return CheckCheckcodeResponse
     */
    public function checkCheckcode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkCheckcodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验验权码
     * Summary: 校验验权码
     *
     * @param CheckCheckcodeRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CheckCheckcodeResponse
     */
    public function checkCheckcodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckCheckcodeResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.checkcode.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建质押申请
     * Summary: 创建质押申请.
     *
     * @param CreateAssetpledgeRequest $request
     *
     * @return CreateAssetpledgeResponse
     */
    public function createAssetpledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAssetpledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建质押申请
     * Summary: 创建质押申请.
     *
     * @param CreateAssetpledgeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateAssetpledgeResponse
     */
    public function createAssetpledgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAssetpledgeResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.assetpledge.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 质押放款
     * Summary: 质押放款.
     *
     * @param ReleaseAssetpledgeRequest $request
     *
     * @return ReleaseAssetpledgeResponse
     */
    public function releaseAssetpledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->releaseAssetpledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 质押放款
     * Summary: 质押放款.
     *
     * @param ReleaseAssetpledgeRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ReleaseAssetpledgeResponse
     */
    public function releaseAssetpledgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReleaseAssetpledgeResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.assetpledge.release', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 质押还款
     * Summary: 质押还款.
     *
     * @param RepayAssetpledgeRequest $request
     *
     * @return RepayAssetpledgeResponse
     */
    public function repayAssetpledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->repayAssetpledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 质押还款
     * Summary: 质押还款.
     *
     * @param RepayAssetpledgeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return RepayAssetpledgeResponse
     */
    public function repayAssetpledgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RepayAssetpledgeResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.assetpledge.repay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询账户信息
     * Summary: 查询账户信息.
     *
     * @param GetLeagueAccountinfoRequest $request
     *
     * @return GetLeagueAccountinfoResponse
     */
    public function getLeagueAccountinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getLeagueAccountinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询账户信息
     * Summary: 查询账户信息.
     *
     * @param GetLeagueAccountinfoRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return GetLeagueAccountinfoResponse
     */
    public function getLeagueAccountinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetLeagueAccountinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.accountinfo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 登记仓库
     * Summary: 登记仓库.
     *
     * @param CreateWarehouseRequest $request
     *
     * @return CreateWarehouseResponse
     */
    public function createWarehouse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWarehouseEx($request, $headers, $runtime);
    }

    /**
     * Description: 登记仓库
     * Summary: 登记仓库.
     *
     * @param CreateWarehouseRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateWarehouseResponse
     */
    public function createWarehouseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWarehouseResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 例举角色类型
     * Summary: 例举角色类型.
     *
     * @param ListLeagueRoleRequest $request
     *
     * @return ListLeagueRoleResponse
     */
    public function listLeagueRole($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listLeagueRoleEx($request, $headers, $runtime);
    }

    /**
     * Description: 例举角色类型
     * Summary: 例举角色类型.
     *
     * @param ListLeagueRoleRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListLeagueRoleResponse
     */
    public function listLeagueRoleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListLeagueRoleResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.role.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询仓库详细信息
     * Summary: 查询仓库详细信息.
     *
     * @param GetWarehouseRequest $request
     *
     * @return GetWarehouseResponse
     */
    public function getWarehouse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getWarehouseEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询仓库详细信息
     * Summary: 查询仓库详细信息.
     *
     * @param GetWarehouseRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return GetWarehouseResponse
     */
    public function getWarehouseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetWarehouseResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新库存信息
     * Summary: 更新库存信息.
     *
     * @param UpdateWarehouseRequest $request
     *
     * @return UpdateWarehouseResponse
     */
    public function updateWarehouse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateWarehouseEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新库存信息
     * Summary: 更新库存信息.
     *
     * @param UpdateWarehouseRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UpdateWarehouseResponse
     */
    public function updateWarehouseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateWarehouseResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列举用户仓库列表
     * Summary: 列举用户仓库列表.
     *
     * @param ListWarehouseRequest $request
     *
     * @return ListWarehouseResponse
     */
    public function listWarehouse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listWarehouseEx($request, $headers, $runtime);
    }

    /**
     * Description: 列举用户仓库列表
     * Summary: 列举用户仓库列表.
     *
     * @param ListWarehouseRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ListWarehouseResponse
     */
    public function listWarehouseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListWarehouseResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 例举联盟
     * Summary: 例举联盟
     *
     * @param ListLeagueRequest $request
     *
     * @return ListLeagueResponse
     */
    public function listLeague($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listLeagueEx($request, $headers, $runtime);
    }

    /**
     * Description: 例举联盟
     * Summary: 例举联盟
     *
     * @param ListLeagueRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return ListLeagueResponse
     */
    public function listLeagueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListLeagueResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列举某个仓库/仓位下的设备信息
     * Summary: 列举某个仓库/仓位下的设备信息.
     *
     * @param QueryWarehouseDeviceRequest $request
     *
     * @return QueryWarehouseDeviceResponse
     */
    public function queryWarehouseDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWarehouseDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 列举某个仓库/仓位下的设备信息
     * Summary: 列举某个仓库/仓位下的设备信息.
     *
     * @param QueryWarehouseDeviceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryWarehouseDeviceResponse
     */
    public function queryWarehouseDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWarehouseDeviceResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.device.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建联盟申请
     * Summary: 创建联盟申请.
     *
     * @param CreateLeagueApplyRequest $request
     *
     * @return CreateLeagueApplyResponse
     */
    public function createLeagueApply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeagueApplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建联盟申请
     * Summary: 创建联盟申请.
     *
     * @param CreateLeagueApplyRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateLeagueApplyResponse
     */
    public function createLeagueApplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeagueApplyResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.apply.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交入盟申请
     * Summary: 提交入盟申请.
     *
     * @param CreateLeagueJoinapplyRequest $request
     *
     * @return CreateLeagueJoinapplyResponse
     */
    public function createLeagueJoinapply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createLeagueJoinapplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交入盟申请
     * Summary: 提交入盟申请.
     *
     * @param CreateLeagueJoinapplyRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CreateLeagueJoinapplyResponse
     */
    public function createLeagueJoinapplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateLeagueJoinapplyResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.joinapply.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 撤销入盟申请
     * Summary: 撤销入盟申请.
     *
     * @param CancelLeagueApplyRequest $request
     *
     * @return CancelLeagueApplyResponse
     */
    public function cancelLeagueApply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelLeagueApplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 撤销入盟申请
     * Summary: 撤销入盟申请.
     *
     * @param CancelLeagueApplyRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CancelLeagueApplyResponse
     */
    public function cancelLeagueApplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelLeagueApplyResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.apply.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列举仓库下的库位列表
     * Summary: 列举仓库下的库位列表.
     *
     * @param QueryWarehouseStoragelocationRequest $request
     *
     * @return QueryWarehouseStoragelocationResponse
     */
    public function queryWarehouseStoragelocation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryWarehouseStoragelocationEx($request, $headers, $runtime);
    }

    /**
     * Description: 列举仓库下的库位列表
     * Summary: 列举仓库下的库位列表.
     *
     * @param QueryWarehouseStoragelocationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryWarehouseStoragelocationResponse
     */
    public function queryWarehouseStoragelocationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryWarehouseStoragelocationResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.storagelocation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 盟主审核入盟申请
     * Summary: 盟主审核入盟申请.
     *
     * @param AuthLeagueApplyRequest $request
     *
     * @return AuthLeagueApplyResponse
     */
    public function authLeagueApply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authLeagueApplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 盟主审核入盟申请
     * Summary: 盟主审核入盟申请.
     *
     * @param AuthLeagueApplyRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return AuthLeagueApplyResponse
     */
    public function authLeagueApplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthLeagueApplyResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.apply.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除仓库
     * Summary: 删除仓库.
     *
     * @param DeleteWarehouseRequest $request
     *
     * @return DeleteWarehouseResponse
     */
    public function deleteWarehouse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteWarehouseEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除仓库
     * Summary: 删除仓库.
     *
     * @param DeleteWarehouseRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteWarehouseResponse
     */
    public function deleteWarehouseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteWarehouseResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 例举入盟申请
     * Summary: 例举入盟申请.
     *
     * @param ListLeagueApplyRequest $request
     *
     * @return ListLeagueApplyResponse
     */
    public function listLeagueApply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listLeagueApplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 例举入盟申请
     * Summary: 例举入盟申请.
     *
     * @param ListLeagueApplyRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ListLeagueApplyResponse
     */
    public function listLeagueApplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListLeagueApplyResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.league.apply.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 登记库位信息
     * Summary: 登记库位信息.
     *
     * @param CreateWarehouseStoraglocationRequest $request
     *
     * @return CreateWarehouseStoraglocationResponse
     */
    public function createWarehouseStoraglocation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createWarehouseStoraglocationEx($request, $headers, $runtime);
    }

    /**
     * Description: 登记库位信息
     * Summary: 登记库位信息.
     *
     * @param CreateWarehouseStoraglocationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateWarehouseStoraglocationResponse
     */
    public function createWarehouseStoraglocationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateWarehouseStoraglocationResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.storaglocation.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询库位详细信息
     * Summary: 查询库位详细信息.
     *
     * @param GetWarehouseStoragelocationRequest $request
     *
     * @return GetWarehouseStoragelocationResponse
     */
    public function getWarehouseStoragelocation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getWarehouseStoragelocationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询库位详细信息
     * Summary: 查询库位详细信息.
     *
     * @param GetWarehouseStoragelocationRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return GetWarehouseStoragelocationResponse
     */
    public function getWarehouseStoragelocationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetWarehouseStoragelocationResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.storagelocation.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  更新库位信息
     * Summary:  更新库位信息.
     *
     * @param UpdateWarehouseStoragelocationRequest $request
     *
     * @return UpdateWarehouseStoragelocationResponse
     */
    public function updateWarehouseStoragelocation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateWarehouseStoragelocationEx($request, $headers, $runtime);
    }

    /**
     * Description:  更新库位信息
     * Summary:  更新库位信息.
     *
     * @param UpdateWarehouseStoragelocationRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return UpdateWarehouseStoragelocationResponse
     */
    public function updateWarehouseStoragelocationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateWarehouseStoragelocationResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.storagelocation.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列举用户库位列表
     * Summary: 列举用户库位列表.
     *
     * @param BatchqueryWarehouseStoragelocationRequest $request
     *
     * @return BatchqueryWarehouseStoragelocationResponse
     */
    public function batchqueryWarehouseStoragelocation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchqueryWarehouseStoragelocationEx($request, $headers, $runtime);
    }

    /**
     * Description: 列举用户库位列表
     * Summary: 列举用户库位列表.
     *
     * @param BatchqueryWarehouseStoragelocationRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return BatchqueryWarehouseStoragelocationResponse
     */
    public function batchqueryWarehouseStoragelocationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchqueryWarehouseStoragelocationResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.storagelocation.batchquery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列举仓库下某状态的库位列表
     * Summary: 列举仓库下某状态的库位列表.
     *
     * @param ListWarehouseStoragelocationRequest $request
     *
     * @return ListWarehouseStoragelocationResponse
     */
    public function listWarehouseStoragelocation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listWarehouseStoragelocationEx($request, $headers, $runtime);
    }

    /**
     * Description: 列举仓库下某状态的库位列表
     * Summary: 列举仓库下某状态的库位列表.
     *
     * @param ListWarehouseStoragelocationRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return ListWarehouseStoragelocationResponse
     */
    public function listWarehouseStoragelocationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListWarehouseStoragelocationResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.storagelocation.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除库位
     * Summary: 删除库位.
     *
     * @param DeleteWarehouseStoragelocationRequest $request
     *
     * @return DeleteWarehouseStoragelocationResponse
     */
    public function deleteWarehouseStoragelocation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteWarehouseStoragelocationEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除库位
     * Summary: 删除库位.
     *
     * @param DeleteWarehouseStoragelocationRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return DeleteWarehouseStoragelocationResponse
     */
    public function deleteWarehouseStoragelocationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteWarehouseStoragelocationResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.warehouse.storagelocation.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数据字典
     * Summary: 创建数据字典.
     *
     * @param CreateAssettemplateRequest $request
     *
     * @return CreateAssettemplateResponse
     */
    public function createAssettemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAssettemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数据字典
     * Summary: 创建数据字典.
     *
     * @param CreateAssettemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateAssettemplateResponse
     */
    public function createAssettemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAssettemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.assettemplate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新数据字典
     * Summary: 更新数据字典.
     *
     * @param UpdateAssettemplateRequest $request
     *
     * @return UpdateAssettemplateResponse
     */
    public function updateAssettemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAssettemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新数据字典
     * Summary: 更新数据字典.
     *
     * @param UpdateAssettemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateAssettemplateResponse
     */
    public function updateAssettemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAssettemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.assettemplate.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据字典
     * Summary: 查询数据字典.
     *
     * @param GetAssettemplateRequest $request
     *
     * @return GetAssettemplateResponse
     */
    public function getAssettemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getAssettemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据字典
     * Summary: 查询数据字典.
     *
     * @param GetAssettemplateRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetAssettemplateResponse
     */
    public function getAssettemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetAssettemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.assettemplate.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 列举数据字典
     * Summary: 列举数据字典.
     *
     * @param ListAssettemplateRequest $request
     *
     * @return ListAssettemplateResponse
     */
    public function listAssettemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAssettemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 列举数据字典
     * Summary: 列举数据字典.
     *
     * @param ListAssettemplateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListAssettemplateResponse
     */
    public function listAssettemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAssettemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.assettemplate.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除数据字典
     * Summary: 删除数据字典.
     *
     * @param DeleteAssettemplateRequest $request
     *
     * @return DeleteAssettemplateResponse
     */
    public function deleteAssettemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteAssettemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除数据字典
     * Summary: 删除数据字典.
     *
     * @param DeleteAssettemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteAssettemplateResponse
     */
    public function deleteAssettemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteAssettemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.assettemplate.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生效/失效数据字典
     * Summary: 生效/失效数据字典.
     *
     * @param EnableAssettemplateRequest $request
     *
     * @return EnableAssettemplateResponse
     */
    public function enableAssettemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableAssettemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 生效/失效数据字典
     * Summary: 生效/失效数据字典.
     *
     * @param EnableAssettemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return EnableAssettemplateResponse
     */
    public function enableAssettemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableAssettemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.assettemplate.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传文件
     * Summary: 上传文件.
     *
     * @param UpdateDocumentFileRequest $request
     *
     * @return UpdateDocumentFileResponse
     */
    public function updateDocumentFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDocumentFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传文件
     * Summary: 上传文件.
     *
     * @param UpdateDocumentFileRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UpdateDocumentFileResponse
     */
    public function updateDocumentFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDocumentFileResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.document.file.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据文件id查找文件
     * Summary: 根据文件id查找文件.
     *
     * @param GetDocumentFileRequest $request
     *
     * @return GetDocumentFileResponse
     */
    public function getDocumentFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDocumentFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据文件id查找文件
     * Summary: 根据文件id查找文件.
     *
     * @param GetDocumentFileRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetDocumentFileResponse
     */
    public function getDocumentFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDocumentFileResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.document.file.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户注销
     * Summary: 用户注销
     *
     * @param CancelUserRequest $request
     *
     * @return CancelUserResponse
     */
    public function cancelUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户注销
     * Summary: 用户注销
     *
     * @param CancelUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CancelUserResponse
     */
    public function cancelUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelUserResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.user.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新用户信息
     * Summary: 更新用户信息.
     *
     * @param UpdateUserRequest $request
     *
     * @return UpdateUserResponse
     */
    public function updateUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新用户信息
     * Summary: 更新用户信息.
     *
     * @param UpdateUserRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return UpdateUserResponse
     */
    public function updateUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateUserResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.user.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表.
     *
     * @param ListUserRequest $request
     *
     * @return ListUserResponse
     */
    public function listUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户信息列表
     * Summary: 查询用户信息列表.
     *
     * @param ListUserRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return ListUserResponse
     */
    public function listUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUserResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.user.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 映射用户信息
     * Summary: 映射用户信息.
     *
     * @param MountUserRequest $request
     *
     * @return MountUserResponse
     */
    public function mountUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->mountUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 映射用户信息
     * Summary: 映射用户信息.
     *
     * @param MountUserRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return MountUserResponse
     */
    public function mountUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MountUserResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.user.mount', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建物权
     * Summary: 批量创建物权.
     *
     * @param BatchcreateImportassetRequest $request
     *
     * @return BatchcreateImportassetResponse
     */
    public function batchcreateImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建物权
     * Summary: 批量创建物权.
     *
     * @param BatchcreateImportassetRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BatchcreateImportassetResponse
     */
    public function batchcreateImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加物权描述信息
     * Summary: 添加物权描述信息.
     *
     * @param DescribeImportassetRequest $request
     *
     * @return DescribeImportassetResponse
     */
    public function describeImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加物权描述信息
     * Summary: 添加物权描述信息.
     *
     * @param DescribeImportassetRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DescribeImportassetResponse
     */
    public function describeImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量冻结
     * Summary: 批量冻结.
     *
     * @param BatchfreezeImportassetRequest $request
     *
     * @return BatchfreezeImportassetResponse
     */
    public function batchfreezeImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchfreezeImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量冻结
     * Summary: 批量冻结.
     *
     * @param BatchfreezeImportassetRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BatchfreezeImportassetResponse
     */
    public function batchfreezeImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchfreezeImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.batchfreeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物权批量解冻
     * Summary: 物权批量解冻.
     *
     * @param BatchunfreezeImportassetRequest $request
     *
     * @return BatchunfreezeImportassetResponse
     */
    public function batchunfreezeImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchunfreezeImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 物权批量解冻
     * Summary: 物权批量解冻.
     *
     * @param BatchunfreezeImportassetRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return BatchunfreezeImportassetResponse
     */
    public function batchunfreezeImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchunfreezeImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.batchunfreeze', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物权批量撤销
     * Summary: 物权批量撤销
     *
     * @param BatchcancelImportassetRequest $request
     *
     * @return BatchcancelImportassetResponse
     */
    public function batchcancelImportasset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcancelImportassetEx($request, $headers, $runtime);
    }

    /**
     * Description: 物权批量撤销
     * Summary: 物权批量撤销
     *
     * @param BatchcancelImportassetRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return BatchcancelImportassetResponse
     */
    public function batchcancelImportassetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcancelImportassetResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.importasset.batchcancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 批量创建转让申请
     * Summary: 批量创建转让申请.
     *
     * @param BatchcreateTransferRequest $request
     *
     * @return BatchcreateTransferResponse
     */
    public function batchcreateTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->batchcreateTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 批量创建转让申请
     * Summary: 批量创建转让申请.
     *
     * @param BatchcreateTransferRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return BatchcreateTransferResponse
     */
    public function batchcreateTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BatchcreateTransferResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.transfer.batchcreate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建分润比例配置
     * Summary: 创建分润比例配置.
     *
     * @param CreateCmportProfitrateRequest $request
     *
     * @return CreateCmportProfitrateResponse
     */
    public function createCmportProfitrate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCmportProfitrateEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建分润比例配置
     * Summary: 创建分润比例配置.
     *
     * @param CreateCmportProfitrateRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateCmportProfitrateResponse
     */
    public function createCmportProfitrateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCmportProfitrateResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.profitrate.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
     * Summary: 融资申请信息落地到区块链.
     *
     * @param ApplyCmportFinanceRequest $request
     *
     * @return ApplyCmportFinanceResponse
     */
    public function applyCmportFinance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyCmportFinanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
     * Summary: 融资申请信息落地到区块链.
     *
     * @param ApplyCmportFinanceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ApplyCmportFinanceResponse
     */
    public function applyCmportFinanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyCmportFinanceResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.finance.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分润对账，企业到当前记账日期的累计利润信息
     * Summary: 企业分润对账单.
     *
     * @param ListCmportEnterprisestatementRequest $request
     *
     * @return ListCmportEnterprisestatementResponse
     */
    public function listCmportEnterprisestatement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCmportEnterprisestatementEx($request, $headers, $runtime);
    }

    /**
     * Description: 分润对账，企业到当前记账日期的累计利润信息
     * Summary: 企业分润对账单.
     *
     * @param ListCmportEnterprisestatementRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ListCmportEnterprisestatementResponse
     */
    public function listCmportEnterprisestatementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCmportEnterprisestatementResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.enterprisestatement.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户对账单
     * Summary: 用户对账单.
     *
     * @param ListCmportUserstatementRequest $request
     *
     * @return ListCmportUserstatementResponse
     */
    public function listCmportUserstatement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCmportUserstatementEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户对账单
     * Summary: 用户对账单.
     *
     * @param ListCmportUserstatementRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ListCmportUserstatementResponse
     */
    public function listCmportUserstatementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCmportUserstatementResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.userstatement.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户明细清单
     * Summary: 用户明细清单.
     *
     * @param ListCmportUserprofitRequest $request
     *
     * @return ListCmportUserprofitResponse
     */
    public function listCmportUserprofit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCmportUserprofitEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户明细清单
     * Summary: 用户明细清单.
     *
     * @param ListCmportUserprofitRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListCmportUserprofitResponse
     */
    public function listCmportUserprofitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCmportUserprofitResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.userprofit.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 还款本息查询
     * Summary: 还款本息查询.
     *
     * @param QueryCmportBankfeeRequest $request
     *
     * @return QueryCmportBankfeeResponse
     */
    public function queryCmportBankfee($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCmportBankfeeEx($request, $headers, $runtime);
    }

    /**
     * Description: 还款本息查询
     * Summary: 还款本息查询.
     *
     * @param QueryCmportBankfeeRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryCmportBankfeeResponse
     */
    public function queryCmportBankfeeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCmportBankfeeResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.bankfee.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建分润归属配置
     * Summary: 创建分润归属配置.
     *
     * @param CreateCmportProfitpartnerRequest $request
     *
     * @return CreateCmportProfitpartnerResponse
     */
    public function createCmportProfitpartner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCmportProfitpartnerEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建分润归属配置
     * Summary: 创建分润归属配置.
     *
     * @param CreateCmportProfitpartnerRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateCmportProfitpartnerResponse
     */
    public function createCmportProfitpartnerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCmportProfitpartnerResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.profitpartner.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监管方（粮达网）撤销融资申请
     * Summary: 撤销融资申请.
     *
     * @param CancelCmportFinanceRequest $request
     *
     * @return CancelCmportFinanceResponse
     */
    public function cancelCmportFinance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelCmportFinanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 监管方（粮达网）撤销融资申请
     * Summary: 撤销融资申请.
     *
     * @param CancelCmportFinanceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CancelCmportFinanceResponse
     */
    public function cancelCmportFinanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelCmportFinanceResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.finance.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行融资审核结果同步
     * Summary: 银行融资审核结果同步.
     *
     * @param NotifyCmportBankRequest $request
     *
     * @return NotifyCmportBankResponse
     */
    public function notifyCmportBank($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyCmportBankEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行融资审核结果同步
     * Summary: 银行融资审核结果同步.
     *
     * @param NotifyCmportBankRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return NotifyCmportBankResponse
     */
    public function notifyCmportBankEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyCmportBankResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.bank.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 银行放款结果同步给区块链
     * Summary: 银行放款结果同步给区块链.
     *
     * @param NotifyCmportLoanRequest $request
     *
     * @return NotifyCmportLoanResponse
     */
    public function notifyCmportLoan($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyCmportLoanEx($request, $headers, $runtime);
    }

    /**
     * Description: 银行放款结果同步给区块链
     * Summary: 银行放款结果同步给区块链.
     *
     * @param NotifyCmportLoanRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return NotifyCmportLoanResponse
     */
    public function notifyCmportLoanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyCmportLoanResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.loan.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 还款结果同步给区块链
     * Summary: 还款结果同步给区块链.
     *
     * @param NotifyCmportRepayRequest $request
     *
     * @return NotifyCmportRepayResponse
     */
    public function notifyCmportRepay($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyCmportRepayEx($request, $headers, $runtime);
    }

    /**
     * Description: 还款结果同步给区块链
     * Summary: 还款结果同步给区块链.
     *
     * @param NotifyCmportRepayRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return NotifyCmportRepayResponse
     */
    public function notifyCmportRepayEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyCmportRepayResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.repay.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 还款本息查询-分页
     * Summary: 还款本息查询-分页.
     *
     * @param ListCmportBankfeeRequest $request
     *
     * @return ListCmportBankfeeResponse
     */
    public function listCmportBankfee($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCmportBankfeeEx($request, $headers, $runtime);
    }

    /**
     * Description: 还款本息查询-分页
     * Summary: 还款本息查询-分页.
     *
     * @param ListCmportBankfeeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ListCmportBankfeeResponse
     */
    public function listCmportBankfeeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCmportBankfeeResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.bankfee.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 物流轨迹同步给区块链
     * Summary: 物流轨迹同步给区块链.
     *
     * @param NotifyCmportLogisticsRequest $request
     *
     * @return NotifyCmportLogisticsResponse
     */
    public function notifyCmportLogistics($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->notifyCmportLogisticsEx($request, $headers, $runtime);
    }

    /**
     * Description: 物流轨迹同步给区块链
     * Summary: 物流轨迹同步给区块链.
     *
     * @param NotifyCmportLogisticsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return NotifyCmportLogisticsResponse
     */
    public function notifyCmportLogisticsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return NotifyCmportLogisticsResponse::fromMap($this->doRequest('1.0', 'blockchain.propertychain.cmport.logistics.notify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
