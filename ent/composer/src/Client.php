<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\ENT\Models\AddProvisionRequest;
use AntChain\ENT\Models\AddProvisionResponse;
use AntChain\ENT\Models\ExecEventReportRequest;
use AntChain\ENT\Models\ExecEventReportResponse;
use AntChain\ENT\Models\ExecNftTransferRequest;
use AntChain\ENT\Models\ExecNftTransferResponse;
use AntChain\ENT\Models\ExecTokenRedeemRequest;
use AntChain\ENT\Models\ExecTokenRedeemResponse;
use AntChain\ENT\Models\GetIsvSharecodeRequest;
use AntChain\ENT\Models\GetIsvSharecodeResponse;
use AntChain\ENT\Models\GetTppSharecodeRequest;
use AntChain\ENT\Models\GetTppSharecodeResponse;
use AntChain\ENT\Models\GetUserSharecodeRequest;
use AntChain\ENT\Models\GetUserSharecodeResponse;
use AntChain\ENT\Models\ImportNftMetaRequest;
use AntChain\ENT\Models\ImportNftMetaResponse;
use AntChain\ENT\Models\QueryCustomerDataRequest;
use AntChain\ENT\Models\QueryCustomerDataResponse;
use AntChain\ENT\Models\QueryCustomerProjectRequest;
use AntChain\ENT\Models\QueryCustomerProjectResponse;
use AntChain\ENT\Models\QueryEventInfoRequest;
use AntChain\ENT\Models\QueryEventInfoResponse;
use AntChain\ENT\Models\QueryProjectInfoRequest;
use AntChain\ENT\Models\QueryProjectInfoResponse;
use AntChain\ENT\Models\QueryTppAllinfoRequest;
use AntChain\ENT\Models\QueryTppAllinfoResponse;
use AntChain\ENT\Models\QueryTppParticipationinfoRequest;
use AntChain\ENT\Models\QueryTppParticipationinfoResponse;
use AntChain\ENT\Models\QueryUserInfoRequest;
use AntChain\ENT\Models\QueryUserInfoResponse;
use AntChain\ENT\Models\QueryUserTokenallocationdetailRequest;
use AntChain\ENT\Models\QueryUserTokenallocationdetailResponse;
use AntChain\ENT\Models\QueryUserTokenredeemdetailRequest;
use AntChain\ENT\Models\QueryUserTokenredeemdetailResponse;
use AntChain\ENT\Models\ReclaimProvisionExtraprovisionRequest;
use AntChain\ENT\Models\ReclaimProvisionExtraprovisionResponse;
use AntChain\ENT\Models\SendUserProjectordermsgRequest;
use AntChain\ENT\Models\SendUserProjectordermsgResponse;
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
            // 收益模型
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
                    'sdk_version'      => '1.4.8',
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
     * Description: 查询用户参与的所有项目
     * Summary: 用户参与的项目查询.
     *
     * @param QueryCustomerProjectRequest $request
     *
     * @return QueryCustomerProjectResponse
     */
    public function queryCustomerProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCustomerProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户参与的所有项目
     * Summary: 用户参与的项目查询.
     *
     * @param QueryCustomerProjectRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryCustomerProjectResponse
     */
    public function queryCustomerProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCustomerProjectResponse::fromMap($this->doRequest('1.0', 'antchain.ent.customer.project.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户数据的接口
     * Summary: 用户数据查询接口.
     *
     * @param QueryCustomerDataRequest $request
     *
     * @return QueryCustomerDataResponse
     */
    public function queryCustomerData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCustomerDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户数据的接口
     * Summary: 用户数据查询接口.
     *
     * @param QueryCustomerDataRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryCustomerDataResponse
     */
    public function queryCustomerDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCustomerDataResponse::fromMap($this->doRequest('1.0', 'antchain.ent.customer.data.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 为用户创建分享码
     * Summary: 用户分享码创建接口.
     *
     * @param GetUserSharecodeRequest $request
     *
     * @return GetUserSharecodeResponse
     */
    public function getUserSharecode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getUserSharecodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 为用户创建分享码
     * Summary: 用户分享码创建接口.
     *
     * @param GetUserSharecodeRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return GetUserSharecodeResponse
     */
    public function getUserSharecodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetUserSharecodeResponse::fromMap($this->doRequest('1.0', 'antchain.ent.user.sharecode.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发送用户的项目订单数据
     * Summary: 用户项目订单消息发送接口.
     *
     * @param SendUserProjectordermsgRequest $request
     *
     * @return SendUserProjectordermsgResponse
     */
    public function sendUserProjectordermsg($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendUserProjectordermsgEx($request, $headers, $runtime);
    }

    /**
     * Description: 发送用户的项目订单数据
     * Summary: 用户项目订单消息发送接口.
     *
     * @param SendUserProjectordermsgRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SendUserProjectordermsgResponse
     */
    public function sendUserProjectordermsgEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendUserProjectordermsgResponse::fromMap($this->doRequest('1.0', 'antchain.ent.user.projectordermsg.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询项目信息查询
     * Summary: 项目信息查询接口.
     *
     * @param QueryProjectInfoRequest $request
     *
     * @return QueryProjectInfoResponse
     */
    public function queryProjectInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryProjectInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询项目信息查询
     * Summary: 项目信息查询接口.
     *
     * @param QueryProjectInfoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryProjectInfoResponse
     */
    public function queryProjectInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryProjectInfoResponse::fromMap($this->doRequest('1.0', 'antchain.ent.project.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户信息
     * Summary: 用户信息查询接口.
     *
     * @param QueryUserInfoRequest $request
     *
     * @return QueryUserInfoResponse
     */
    public function queryUserInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户信息
     * Summary: 用户信息查询接口.
     *
     * @param QueryUserInfoRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryUserInfoResponse
     */
    public function queryUserInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserInfoResponse::fromMap($this->doRequest('1.0', 'antchain.ent.user.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户粉丝粒获得明细
     * Summary: 用户粉丝粒获得明细查询接口.
     *
     * @param QueryUserTokenallocationdetailRequest $request
     *
     * @return QueryUserTokenallocationdetailResponse
     */
    public function queryUserTokenallocationdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserTokenallocationdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户粉丝粒获得明细
     * Summary: 用户粉丝粒获得明细查询接口.
     *
     * @param QueryUserTokenallocationdetailRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryUserTokenallocationdetailResponse
     */
    public function queryUserTokenallocationdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserTokenallocationdetailResponse::fromMap($this->doRequest('1.0', 'antchain.ent.user.tokenallocationdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户粉丝粒兑现明细
     * Summary: 用户粉丝粒兑现明细查询接口.
     *
     * @param QueryUserTokenredeemdetailRequest $request
     *
     * @return QueryUserTokenredeemdetailResponse
     */
    public function queryUserTokenredeemdetail($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUserTokenredeemdetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户粉丝粒兑现明细
     * Summary: 用户粉丝粒兑现明细查询接口.
     *
     * @param QueryUserTokenredeemdetailRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryUserTokenredeemdetailResponse
     */
    public function queryUserTokenredeemdetailEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUserTokenredeemdetailResponse::fromMap($this->doRequest('1.0', 'antchain.ent.user.tokenredeemdetail.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上报事件
     * Summary: 事件上报.
     *
     * @param ExecEventReportRequest $request
     *
     * @return ExecEventReportResponse
     */
    public function execEventReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execEventReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 上报事件
     * Summary: 事件上报.
     *
     * @param ExecEventReportRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecEventReportResponse
     */
    public function execEventReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecEventReportResponse::fromMap($this->doRequest('1.0', 'antchain.ent.event.report.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询事件信息
     * Summary: 事件信息查询.
     *
     * @param QueryEventInfoRequest $request
     *
     * @return QueryEventInfoResponse
     */
    public function queryEventInfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEventInfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询事件信息
     * Summary: 事件信息查询.
     *
     * @param QueryEventInfoRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryEventInfoResponse
     */
    public function queryEventInfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEventInfoResponse::fromMap($this->doRequest('1.0', 'antchain.ent.event.info.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里拍卖nft资产元数据导入
     * Summary: 阿里拍卖nft资产元数据导入.
     *
     * @param ImportNftMetaRequest $request
     *
     * @return ImportNftMetaResponse
     */
    public function importNftMeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importNftMetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里拍卖nft资产元数据导入
     * Summary: 阿里拍卖nft资产元数据导入.
     *
     * @param ImportNftMetaRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return ImportNftMetaResponse
     */
    public function importNftMetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportNftMetaResponse::fromMap($this->doRequest('1.0', 'antchain.ent.nft.meta.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: nft资产订单落库，链上流转
     * Summary: nft资产流转.
     *
     * @param ExecNftTransferRequest $request
     *
     * @return ExecNftTransferResponse
     */
    public function execNftTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execNftTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: nft资产订单落库，链上流转
     * Summary: nft资产流转.
     *
     * @param ExecNftTransferRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecNftTransferResponse
     */
    public function execNftTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecNftTransferResponse::fromMap($this->doRequest('1.0', 'antchain.ent.nft.transfer.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部ISV获取分享码接口
     * Summary: 获得ISV分享码
     *
     * @param GetIsvSharecodeRequest $request
     *
     * @return GetIsvSharecodeResponse
     */
    public function getIsvSharecode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getIsvSharecodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部ISV获取分享码接口
     * Summary: 获得ISV分享码
     *
     * @param GetIsvSharecodeRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetIsvSharecodeResponse
     */
    public function getIsvSharecodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetIsvSharecodeResponse::fromMap($this->doRequest('1.0', 'antchain.ent.isv.sharecode.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 备付金追加接口
     * Summary: 备付金追加接口.
     *
     * @param AddProvisionRequest $request
     *
     * @return AddProvisionResponse
     */
    public function addProvision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addProvisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 备付金追加接口
     * Summary: 备付金追加接口.
     *
     * @param AddProvisionRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AddProvisionResponse
     */
    public function addProvisionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddProvisionResponse::fromMap($this->doRequest('1.0', 'antchain.ent.provision.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 赎回链上多余备付金
     * Summary: 赎回链上多余备付金.
     *
     * @param ReclaimProvisionExtraprovisionRequest $request
     *
     * @return ReclaimProvisionExtraprovisionResponse
     */
    public function reclaimProvisionExtraprovision($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reclaimProvisionExtraprovisionEx($request, $headers, $runtime);
    }

    /**
     * Description: 赎回链上多余备付金
     * Summary: 赎回链上多余备付金.
     *
     * @param ReclaimProvisionExtraprovisionRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return ReclaimProvisionExtraprovisionResponse
     */
    public function reclaimProvisionExtraprovisionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReclaimProvisionExtraprovisionResponse::fromMap($this->doRequest('1.0', 'antchain.ent.provision.extraprovision.reclaim', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 链上Token兑现接口
     * Summary: 链上Token兑现接口.
     *
     * @param ExecTokenRedeemRequest $request
     *
     * @return ExecTokenRedeemResponse
     */
    public function execTokenRedeem($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execTokenRedeemEx($request, $headers, $runtime);
    }

    /**
     * Description: 链上Token兑现接口
     * Summary: 链上Token兑现接口.
     *
     * @param ExecTokenRedeemRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecTokenRedeemResponse
     */
    public function execTokenRedeemEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecTokenRedeemResponse::fromMap($this->doRequest('1.0', 'antchain.ent.token.redeem.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 针对淘票票的获取专属邀请码获取接口
     * Summary: 淘票票专属邀请码获取接口.
     *
     * @param GetTppSharecodeRequest $request
     *
     * @return GetTppSharecodeResponse
     */
    public function getTppSharecode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getTppSharecodeEx($request, $headers, $runtime);
    }

    /**
     * Description: 针对淘票票的获取专属邀请码获取接口
     * Summary: 淘票票专属邀请码获取接口.
     *
     * @param GetTppSharecodeRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetTppSharecodeResponse
     */
    public function getTppSharecodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetTppSharecodeResponse::fromMap($this->doRequest('1.0', 'antchain.ent.tpp.sharecode.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 针对淘票票的查询全部必要信息的接口
     * Summary: 淘票票查询全部必要信息接口.
     *
     * @param QueryTppAllinfoRequest $request
     *
     * @return QueryTppAllinfoResponse
     */
    public function queryTppAllinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTppAllinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 针对淘票票的查询全部必要信息的接口
     * Summary: 淘票票查询全部必要信息接口.
     *
     * @param QueryTppAllinfoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryTppAllinfoResponse
     */
    public function queryTppAllinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTppAllinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ent.tpp.allinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 针对淘票票的参与信息查询接口
     * Summary: 淘票票参与信息查询接口.
     *
     * @param QueryTppParticipationinfoRequest $request
     *
     * @return QueryTppParticipationinfoResponse
     */
    public function queryTppParticipationinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTppParticipationinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 针对淘票票的参与信息查询接口
     * Summary: 淘票票参与信息查询接口.
     *
     * @param QueryTppParticipationinfoRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryTppParticipationinfoResponse
     */
    public function queryTppParticipationinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTppParticipationinfoResponse::fromMap($this->doRequest('1.0', 'antchain.ent.tpp.participationinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
