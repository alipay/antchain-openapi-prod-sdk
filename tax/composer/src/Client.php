<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\TAX\Models\AuthCorpRequest;
use AntChain\TAX\Models\AuthCorpResponse;
use AntChain\TAX\Models\AuthIcmEnterpriseRequest;
use AntChain\TAX\Models\AuthIcmEnterpriseResponse;
use AntChain\TAX\Models\AuthIcmInvoiceRequest;
use AntChain\TAX\Models\AuthIcmInvoiceResponse;
use AntChain\TAX\Models\AuthIcmRealpersonRequest;
use AntChain\TAX\Models\AuthIcmRealpersonResponse;
use AntChain\TAX\Models\AuthRiskEvaluationRequest;
use AntChain\TAX\Models\AuthRiskEvaluationResponse;
use AntChain\TAX\Models\CheckPdataMarriageRequest;
use AntChain\TAX\Models\CheckPdataMarriageResponse;
use AntChain\TAX\Models\CreateApiAuthurlRequest;
use AntChain\TAX\Models\CreateApiAuthurlResponse;
use AntChain\TAX\Models\DescribeIcmInvoiceRequest;
use AntChain\TAX\Models\DescribeIcmInvoiceResponse;
use AntChain\TAX\Models\ExecApiAuthtemplateRequest;
use AntChain\TAX\Models\ExecApiAuthtemplateResponse;
use AntChain\TAX\Models\ExecApiDataprocessRequest;
use AntChain\TAX\Models\ExecApiDataprocessResponse;
use AntChain\TAX\Models\ExecApiSimpleauthmarkRequest;
use AntChain\TAX\Models\ExecApiSimpleauthmarkResponse;
use AntChain\TAX\Models\ExecIcmSyncgatheringRequest;
use AntChain\TAX\Models\ExecIcmSyncgatheringResponse;
use AntChain\TAX\Models\InitApiDataprocessRequest;
use AntChain\TAX\Models\InitApiDataprocessResponse;
use AntChain\TAX\Models\JudgeApiDataprocessRequest;
use AntChain\TAX\Models\JudgeApiDataprocessResponse;
use AntChain\TAX\Models\MatchIcmSimpleauthRequest;
use AntChain\TAX\Models\MatchIcmSimpleauthResponse;
use AntChain\TAX\Models\PullApiHaiguanasyncpollingRequest;
use AntChain\TAX\Models\PullApiHaiguanasyncpollingResponse;
use AntChain\TAX\Models\PullApiSimpleauthasyncpollingRequest;
use AntChain\TAX\Models\PullApiSimpleauthasyncpollingResponse;
use AntChain\TAX\Models\PullApiSimpleauthmarkRequest;
use AntChain\TAX\Models\PullApiSimpleauthmarkResponse;
use AntChain\TAX\Models\PushChargeRequest;
use AntChain\TAX\Models\PushChargeResponse;
use AntChain\TAX\Models\PushIcmInvoiceinfoRequest;
use AntChain\TAX\Models\PushIcmInvoiceinfoResponse;
use AntChain\TAX\Models\PushIcmInvoiceRequest;
use AntChain\TAX\Models\PushIcmInvoiceResponse;
use AntChain\TAX\Models\QueryApiAuthtemplatedefineRequest;
use AntChain\TAX\Models\QueryApiAuthtemplatedefineResponse;
use AntChain\TAX\Models\QueryApiAuthtemplateresultRequest;
use AntChain\TAX\Models\QueryApiAuthtemplateresultResponse;
use AntChain\TAX\Models\QueryApiAuthteplateRequest;
use AntChain\TAX\Models\QueryApiAuthteplateResponse;
use AntChain\TAX\Models\QueryApiDataprocessRequest;
use AntChain\TAX\Models\QueryApiDataprocessResponse;
use AntChain\TAX\Models\QueryApiHaiguanasyncRequest;
use AntChain\TAX\Models\QueryApiHaiguanasyncResponse;
use AntChain\TAX\Models\QueryApiSimpleauthasyncRequest;
use AntChain\TAX\Models\QueryApiSimpleauthasyncResponse;
use AntChain\TAX\Models\QueryApiSimpleauthstandardRequest;
use AntChain\TAX\Models\QueryApiSimpleauthstandardResponse;
use AntChain\TAX\Models\QueryChargeAuthRequest;
use AntChain\TAX\Models\QueryChargeAuthResponse;
use AntChain\TAX\Models\QueryEnterpriseElectronicasyncRequest;
use AntChain\TAX\Models\QueryEnterpriseElectronicasyncResponse;
use AntChain\TAX\Models\QueryIcmInvoicecontinuedRequest;
use AntChain\TAX\Models\QueryIcmInvoicecontinuedResponse;
use AntChain\TAX\Models\QueryIcmInvoiceRequest;
use AntChain\TAX\Models\QueryIcmInvoiceResponse;
use AntChain\TAX\Models\QueryIcmSimpleauthRequest;
use AntChain\TAX\Models\QueryIcmSimpleauthResponse;
use AntChain\TAX\Models\QueryPdataPersonalincomeRequest;
use AntChain\TAX\Models\QueryPdataPersonalincomeResponse;
use AntChain\TAX\Models\QueryPdataRiskRequest;
use AntChain\TAX\Models\QueryPdataRiskResponse;
use AntChain\TAX\Models\QueryPdataSocialincomeRequest;
use AntChain\TAX\Models\QueryPdataSocialincomeResponse;
use AntChain\TAX\Models\QueryPdataUnderwriteRequest;
use AntChain\TAX\Models\QueryPdataUnderwriteResponse;
use AntChain\TAX\Models\QueryPortraiteconomyRequest;
use AntChain\TAX\Models\QueryPortraiteconomyResponse;
use AntChain\TAX\Models\QueryRiskEvaluationRequest;
use AntChain\TAX\Models\QueryRiskEvaluationResponse;
use AntChain\TAX\Models\QuerySimpleauthIdentitystateRequest;
use AntChain\TAX\Models\QuerySimpleauthIdentitystateResponse;
use AntChain\TAX\Models\RunApiDataprocessRequest;
use AntChain\TAX\Models\RunApiDataprocessResponse;
use AntChain\TAX\Models\StartRiskEvaluationRequest;
use AntChain\TAX\Models\StartRiskEvaluationResponse;
use AntChain\TAX\Models\SubmitApiSimpleauthmarkRequest;
use AntChain\TAX\Models\SubmitApiSimpleauthmarkResponse;
use AntChain\TAX\Models\SyncRiskEvaluationRequest;
use AntChain\TAX\Models\SyncRiskEvaluationResponse;
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
            // 规则
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
                    'sdk_version'      => '1.8.43',
                    '_prod_code'       => 'TAX',
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
     * Description: 目前仅用于广州区块链发票开通企业信息推送
     * Summary: 区块链发票开通企业信息推送
     *
     * @param AuthCorpRequest $request
     *
     * @return AuthCorpResponse
     */
    public function authCorp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authCorpEx($request, $headers, $runtime);
    }

    /**
     * Description: 目前仅用于广州区块链发票开通企业信息推送
     * Summary: 区块链发票开通企业信息推送
     *
     * @param AuthCorpRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return AuthCorpResponse
     */
    public function authCorpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthCorpResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.corp.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
     * Summary: 计费推送
     *
     * @param PushChargeRequest $request
     *
     * @return PushChargeResponse
     */
    public function pushCharge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushChargeEx($request, $headers, $runtime);
    }

    /**
     * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
     * Summary: 计费推送
     *
     * @param PushChargeRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return PushChargeResponse
     */
    public function pushChargeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushChargeResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.charge.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询计收费授权情况
     * Summary: 查询计收费授权情况.
     *
     * @param QueryChargeAuthRequest $request
     *
     * @return QueryChargeAuthResponse
     */
    public function queryChargeAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryChargeAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询计收费授权情况
     * Summary: 查询计收费授权情况.
     *
     * @param QueryChargeAuthRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryChargeAuthResponse
     */
    public function queryChargeAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryChargeAuthResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.charge.auth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 目前仅用于广州区块链发票信息推送
     * Summary:  区块链发票信息推送
     *
     * @param PushIcmInvoiceRequest $request
     *
     * @return PushIcmInvoiceResponse
     */
    public function pushIcmInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushIcmInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 目前仅用于广州区块链发票信息推送
     * Summary:  区块链发票信息推送
     *
     * @param PushIcmInvoiceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return PushIcmInvoiceResponse
     */
    public function pushIcmInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushIcmInvoiceResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.invoice.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
     * Summary:  区块链发票信息查询.
     *
     * @param QueryIcmInvoiceRequest $request
     *
     * @return QueryIcmInvoiceResponse
     */
    public function queryIcmInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIcmInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
     * Summary:  区块链发票信息查询.
     *
     * @param QueryIcmInvoiceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryIcmInvoiceResponse
     */
    public function queryIcmInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIcmInvoiceResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.invoice.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标准发票推送
     * Summary: 标准发票推送
     *
     * @param PushIcmInvoiceinfoRequest $request
     *
     * @return PushIcmInvoiceinfoResponse
     */
    public function pushIcmInvoiceinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pushIcmInvoiceinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 标准发票推送
     * Summary: 标准发票推送
     *
     * @param PushIcmInvoiceinfoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PushIcmInvoiceinfoResponse
     */
    public function pushIcmInvoiceinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PushIcmInvoiceinfoResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.invoiceinfo.push', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
     * Summary: 获取数据的上链信息描述.
     *
     * @param DescribeIcmInvoiceRequest $request
     *
     * @return DescribeIcmInvoiceResponse
     */
    public function describeIcmInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->describeIcmInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
     * Summary: 获取数据的上链信息描述.
     *
     * @param DescribeIcmInvoiceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return DescribeIcmInvoiceResponse
     */
    public function describeIcmInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DescribeIcmInvoiceResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.invoice.describe', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
     * Summary: 区块链银行授权接口.
     *
     * @param AuthIcmInvoiceRequest $request
     *
     * @return AuthIcmInvoiceResponse
     */
    public function authIcmInvoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authIcmInvoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
     * Summary: 区块链银行授权接口.
     *
     * @param AuthIcmInvoiceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return AuthIcmInvoiceResponse
     */
    public function authIcmInvoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthIcmInvoiceResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.invoice.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人数据使用授权
     * Summary: 个人数据使用授权.
     *
     * @param AuthIcmRealpersonRequest $request
     *
     * @return AuthIcmRealpersonResponse
     */
    public function authIcmRealperson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authIcmRealpersonEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人数据使用授权
     * Summary: 个人数据使用授权.
     *
     * @param AuthIcmRealpersonRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AuthIcmRealpersonResponse
     */
    public function authIcmRealpersonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthIcmRealpersonResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.realperson.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 采集，不限制同步 异步
     * Summary: 采集.
     *
     * @param ExecIcmSyncgatheringRequest $request
     *
     * @return ExecIcmSyncgatheringResponse
     */
    public function execIcmSyncgathering($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execIcmSyncgatheringEx($request, $headers, $runtime);
    }

    /**
     * Description: 采集，不限制同步 异步
     * Summary: 采集.
     *
     * @param ExecIcmSyncgatheringRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ExecIcmSyncgatheringResponse
     */
    public function execIcmSyncgatheringEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecIcmSyncgatheringResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.syncgathering.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取授权模版和token
     * Summary: 获取授权模版和token.
     *
     * @param QueryApiAuthteplateRequest $request
     *
     * @return QueryApiAuthteplateResponse
     */
    public function queryApiAuthteplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiAuthteplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取授权模版和token
     * Summary: 获取授权模版和token.
     *
     * @param QueryApiAuthteplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryApiAuthteplateResponse
     */
    public function queryApiAuthteplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiAuthteplateResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.authteplate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交
     * Summary: 提交.
     *
     * @param ExecApiAuthtemplateRequest $request
     *
     * @return ExecApiAuthtemplateResponse
     */
    public function execApiAuthtemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execApiAuthtemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交
     * Summary: 提交.
     *
     * @param ExecApiAuthtemplateRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ExecApiAuthtemplateResponse
     */
    public function execApiAuthtemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecApiAuthtemplateResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.authtemplate.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取要素信息
     * Summary: 获取要素信息.
     *
     * @param QueryApiAuthtemplatedefineRequest $request
     *
     * @return QueryApiAuthtemplatedefineResponse
     */
    public function queryApiAuthtemplatedefine($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiAuthtemplatedefineEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取要素信息
     * Summary: 获取要素信息.
     *
     * @param QueryApiAuthtemplatedefineRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryApiAuthtemplatedefineResponse
     */
    public function queryApiAuthtemplatedefineEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiAuthtemplatedefineResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.authtemplatedefine.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取授权结果
     * Summary: 获取授权结果.
     *
     * @param QueryApiAuthtemplateresultRequest $request
     *
     * @return QueryApiAuthtemplateresultResponse
     */
    public function queryApiAuthtemplateresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiAuthtemplateresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取授权结果
     * Summary: 获取授权结果.
     *
     * @param QueryApiAuthtemplateresultRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryApiAuthtemplateresultResponse
     */
    public function queryApiAuthtemplateresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiAuthtemplateresultResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.authtemplateresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权接口
     * Summary: 授权.
     *
     * @param AuthIcmEnterpriseRequest $request
     *
     * @return AuthIcmEnterpriseResponse
     */
    public function authIcmEnterprise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authIcmEnterpriseEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权接口
     * Summary: 授权.
     *
     * @param AuthIcmEnterpriseRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AuthIcmEnterpriseResponse
     */
    public function authIcmEnterpriseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthIcmEnterpriseResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.enterprise.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 该接口为支持授权链接的生成
     * Summary: 可信授权链接获取接口.
     *
     * @param CreateApiAuthurlRequest $request
     *
     * @return CreateApiAuthurlResponse
     */
    public function createApiAuthurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createApiAuthurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 该接口为支持授权链接的生成
     * Summary: 可信授权链接获取接口.
     *
     * @param CreateApiAuthurlRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateApiAuthurlResponse
     */
    public function createApiAuthurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateApiAuthurlResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.authurl.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 极简授权-判断该企业是否支持要素授权
     * Summary: 极简授权-判断该企业是否支持要素授权.
     *
     * @param MatchIcmSimpleauthRequest $request
     *
     * @return MatchIcmSimpleauthResponse
     */
    public function matchIcmSimpleauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->matchIcmSimpleauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 极简授权-判断该企业是否支持要素授权
     * Summary: 极简授权-判断该企业是否支持要素授权.
     *
     * @param MatchIcmSimpleauthRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return MatchIcmSimpleauthResponse
     */
    public function matchIcmSimpleauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MatchIcmSimpleauthResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.simpleauth.match', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 极简授权-获取数据，用于获取指标类的数据
     * Summary: 极简授权-获取数据.
     *
     * @param QueryIcmSimpleauthRequest $request
     *
     * @return QueryIcmSimpleauthResponse
     */
    public function queryIcmSimpleauth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIcmSimpleauthEx($request, $headers, $runtime);
    }

    /**
     * Description: 极简授权-获取数据，用于获取指标类的数据
     * Summary: 极简授权-获取数据.
     *
     * @param QueryIcmSimpleauthRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryIcmSimpleauthResponse
     */
    public function queryIcmSimpleauthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIcmSimpleauthResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.simpleauth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 极简授权异步查询接口
     * Summary: 极简授权-异步获取数据.
     *
     * @param QueryApiSimpleauthasyncRequest $request
     *
     * @return QueryApiSimpleauthasyncResponse
     */
    public function queryApiSimpleauthasync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiSimpleauthasyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 极简授权异步查询接口
     * Summary: 极简授权-异步获取数据.
     *
     * @param QueryApiSimpleauthasyncRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryApiSimpleauthasyncResponse
     */
    public function queryApiSimpleauthasyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiSimpleauthasyncResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.simpleauthasync.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权接口
     * Summary: 授权接口.
     *
     * @param AuthRiskEvaluationRequest $request
     *
     * @return AuthRiskEvaluationResponse
     */
    public function authRiskEvaluation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authRiskEvaluationEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权接口
     * Summary: 授权接口.
     *
     * @param AuthRiskEvaluationRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AuthRiskEvaluationResponse
     */
    public function authRiskEvaluationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthRiskEvaluationResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.risk.evaluation.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询
     * Summary: 查询.
     *
     * @param QueryRiskEvaluationRequest $request
     *
     * @return QueryRiskEvaluationResponse
     */
    public function queryRiskEvaluation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRiskEvaluationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询
     * Summary: 查询.
     *
     * @param QueryRiskEvaluationRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryRiskEvaluationResponse
     */
    public function queryRiskEvaluationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRiskEvaluationResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.risk.evaluation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 极简授权-异步查询数据-轮询拉取结果
     * Summary: 极简授权-异步查询数据-轮询拉取结果.
     *
     * @param PullApiSimpleauthasyncpollingRequest $request
     *
     * @return PullApiSimpleauthasyncpollingResponse
     */
    public function pullApiSimpleauthasyncpolling($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullApiSimpleauthasyncpollingEx($request, $headers, $runtime);
    }

    /**
     * Description: 极简授权-异步查询数据-轮询拉取结果
     * Summary: 极简授权-异步查询数据-轮询拉取结果.
     *
     * @param PullApiSimpleauthasyncpollingRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return PullApiSimpleauthasyncpollingResponse
     */
    public function pullApiSimpleauthasyncpollingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullApiSimpleauthasyncpollingResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.simpleauthasyncpolling.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 极简授权异步查询接口
     * Summary: 极简授权-异步获取数据.
     *
     * @param QueryApiSimpleauthstandardRequest $request
     *
     * @return QueryApiSimpleauthstandardResponse
     */
    public function queryApiSimpleauthstandard($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiSimpleauthstandardEx($request, $headers, $runtime);
    }

    /**
     * Description: 极简授权异步查询接口
     * Summary: 极简授权-异步获取数据.
     *
     * @param QueryApiSimpleauthstandardRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryApiSimpleauthstandardResponse
     */
    public function queryApiSimpleauthstandardEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiSimpleauthstandardResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.simpleauthstandard.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 给对应的税号进行打标
     * Summary: 要素授权打标接口.
     *
     * @param ExecApiSimpleauthmarkRequest $request
     *
     * @return ExecApiSimpleauthmarkResponse
     */
    public function execApiSimpleauthmark($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execApiSimpleauthmarkEx($request, $headers, $runtime);
    }

    /**
     * Description: 给对应的税号进行打标
     * Summary: 要素授权打标接口.
     *
     * @param ExecApiSimpleauthmarkRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ExecApiSimpleauthmarkResponse
     */
    public function execApiSimpleauthmarkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecApiSimpleauthmarkResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.simpleauthmark.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交打标结果，仅限内部使用
     * Summary: 提交打标结果.
     *
     * @param SubmitApiSimpleauthmarkRequest $request
     *
     * @return SubmitApiSimpleauthmarkResponse
     */
    public function submitApiSimpleauthmark($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitApiSimpleauthmarkEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交打标结果，仅限内部使用
     * Summary: 提交打标结果.
     *
     * @param SubmitApiSimpleauthmarkRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return SubmitApiSimpleauthmarkResponse
     */
    public function submitApiSimpleauthmarkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitApiSimpleauthmarkResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.simpleauthmark.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: blockchain.tax.api.simpleauthmark.exec
     * Summary: 数据打标拉取接口.
     *
     * @param PullApiSimpleauthmarkRequest $request
     *
     * @return PullApiSimpleauthmarkResponse
     */
    public function pullApiSimpleauthmark($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullApiSimpleauthmarkEx($request, $headers, $runtime);
    }

    /**
     * Description: blockchain.tax.api.simpleauthmark.exec
     * Summary: 数据打标拉取接口.
     *
     * @param PullApiSimpleauthmarkRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PullApiSimpleauthmarkResponse
     */
    public function pullApiSimpleauthmarkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullApiSimpleauthmarkResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.simpleauthmark.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询-同步返回提额数据
     * Summary: 查询-同步提额数据返回.
     *
     * @param SyncRiskEvaluationRequest $request
     *
     * @return SyncRiskEvaluationResponse
     */
    public function syncRiskEvaluation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncRiskEvaluationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询-同步返回提额数据
     * Summary: 查询-同步提额数据返回.
     *
     * @param SyncRiskEvaluationRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SyncRiskEvaluationResponse
     */
    public function syncRiskEvaluationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncRiskEvaluationResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.risk.evaluation.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 纳税人状态查询
     * Summary: 纳税人状态查询.
     *
     * @param QuerySimpleauthIdentitystateRequest $request
     *
     * @return QuerySimpleauthIdentitystateResponse
     */
    public function querySimpleauthIdentitystate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySimpleauthIdentitystateEx($request, $headers, $runtime);
    }

    /**
     * Description: 纳税人状态查询
     * Summary: 纳税人状态查询.
     *
     * @param QuerySimpleauthIdentitystateRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QuerySimpleauthIdentitystateResponse
     */
    public function querySimpleauthIdentitystateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySimpleauthIdentitystateResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.simpleauth.identitystate.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 海关-异步查询数据
     * Summary: 海关-异步查询数据.
     *
     * @param QueryApiHaiguanasyncRequest $request
     *
     * @return QueryApiHaiguanasyncResponse
     */
    public function queryApiHaiguanasync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiHaiguanasyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 海关-异步查询数据
     * Summary: 海关-异步查询数据.
     *
     * @param QueryApiHaiguanasyncRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryApiHaiguanasyncResponse
     */
    public function queryApiHaiguanasyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiHaiguanasyncResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.haiguanasync.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 海关-异步查询数据-轮询拉取数据
     * Summary: 海关-异步查询数据-轮询拉取数据.
     *
     * @param PullApiHaiguanasyncpollingRequest $request
     *
     * @return PullApiHaiguanasyncpollingResponse
     */
    public function pullApiHaiguanasyncpolling($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pullApiHaiguanasyncpollingEx($request, $headers, $runtime);
    }

    /**
     * Description: 海关-异步查询数据-轮询拉取数据
     * Summary: 海关-异步查询数据-轮询拉取数据.
     *
     * @param PullApiHaiguanasyncpollingRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return PullApiHaiguanasyncpollingResponse
     */
    public function pullApiHaiguanasyncpollingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PullApiHaiguanasyncpollingResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.haiguanasyncpolling.pull', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提额资质评估授权并查询,支持省级查询
     * Summary: 提额资质评估授权并查询.
     *
     * @param StartRiskEvaluationRequest $request
     *
     * @return StartRiskEvaluationResponse
     */
    public function startRiskEvaluation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startRiskEvaluationEx($request, $headers, $runtime);
    }

    /**
     * Description: 提额资质评估授权并查询,支持省级查询
     * Summary: 提额资质评估授权并查询.
     *
     * @param StartRiskEvaluationRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return StartRiskEvaluationResponse
     */
    public function startRiskEvaluationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartRiskEvaluationResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.risk.evaluation.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 电力异步接口
     * Summary: 电力异步接口.
     *
     * @param QueryEnterpriseElectronicasyncRequest $request
     *
     * @return QueryEnterpriseElectronicasyncResponse
     */
    public function queryEnterpriseElectronicasync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEnterpriseElectronicasyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 电力异步接口
     * Summary: 电力异步接口.
     *
     * @param QueryEnterpriseElectronicasyncRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return QueryEnterpriseElectronicasyncResponse
     */
    public function queryEnterpriseElectronicasyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEnterpriseElectronicasyncResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.enterprise.electronicasync.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询指定账户的数据
     * Summary: 查询指定账户的数据.
     *
     * @param QueryApiDataprocessRequest $request
     *
     * @return QueryApiDataprocessResponse
     */
    public function queryApiDataprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApiDataprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询指定账户的数据
     * Summary: 查询指定账户的数据.
     *
     * @param QueryApiDataprocessRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryApiDataprocessResponse
     */
    public function queryApiDataprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApiDataprocessResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.dataprocess.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验当前目标查询数据初始化接口
     * Summary: 校验当前目标查询数据初始化接口.
     *
     * @param InitApiDataprocessRequest $request
     *
     * @return InitApiDataprocessResponse
     */
    public function initApiDataprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initApiDataprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验当前目标查询数据初始化接口
     * Summary: 校验当前目标查询数据初始化接口.
     *
     * @param InitApiDataprocessRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return InitApiDataprocessResponse
     */
    public function initApiDataprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitApiDataprocessResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.dataprocess.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据流转目标客户是否可用接口
     * Summary: 数据流转目标客户是否可用接口.
     *
     * @param JudgeApiDataprocessRequest $request
     *
     * @return JudgeApiDataprocessResponse
     */
    public function judgeApiDataprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->judgeApiDataprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据流转目标客户是否可用接口
     * Summary: 数据流转目标客户是否可用接口.
     *
     * @param JudgeApiDataprocessRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return JudgeApiDataprocessResponse
     */
    public function judgeApiDataprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return JudgeApiDataprocessResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.dataprocess.judge', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 初始化与查询合并统一执行接口
     * Summary: 初始化与查询合并统一执行接口.
     *
     * @param ExecApiDataprocessRequest $request
     *
     * @return ExecApiDataprocessResponse
     */
    public function execApiDataprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execApiDataprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: 初始化与查询合并统一执行接口
     * Summary: 初始化与查询合并统一执行接口.
     *
     * @param ExecApiDataprocessRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ExecApiDataprocessResponse
     */
    public function execApiDataprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecApiDataprocessResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.dataprocess.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据流转通用执行接口
     * Summary: 数据流转通用执行接口.
     *
     * @param RunApiDataprocessRequest $request
     *
     * @return RunApiDataprocessResponse
     */
    public function runApiDataprocess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->runApiDataprocessEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据流转通用执行接口
     * Summary: 数据流转通用执行接口.
     *
     * @param RunApiDataprocessRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return RunApiDataprocessResponse
     */
    public function runApiDataprocessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RunApiDataprocessResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.api.dataprocess.run', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链发票信息持续取数查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式或者配置的指定地址进行通知
     * Summary: 区块链发票信息持续取数查询.
     *
     * @param QueryIcmInvoicecontinuedRequest $request
     *
     * @return QueryIcmInvoicecontinuedResponse
     */
    public function queryIcmInvoicecontinued($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIcmInvoicecontinuedEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链发票信息持续取数查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式或者配置的指定地址进行通知
     * Summary: 区块链发票信息持续取数查询.
     *
     * @param QueryIcmInvoicecontinuedRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryIcmInvoicecontinuedResponse
     */
    public function queryIcmInvoicecontinuedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIcmInvoicecontinuedResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.icm.invoicecontinued.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 收入评估服务A
     * https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
     * Summary: 收入评估服务A.
     *
     * @param QueryPdataPersonalincomeRequest $request
     *
     * @return QueryPdataPersonalincomeResponse
     */
    public function queryPdataPersonalincome($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdataPersonalincomeEx($request, $headers, $runtime);
    }

    /**
     * Description: 收入评估服务A
     * https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
     * Summary: 收入评估服务A.
     *
     * @param QueryPdataPersonalincomeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryPdataPersonalincomeResponse
     */
    public function queryPdataPersonalincomeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdataPersonalincomeResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.pdata.personalincome.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 收入评估服务B
     * Summary: 收入评估服务B.
     *
     * @param QueryPdataSocialincomeRequest $request
     *
     * @return QueryPdataSocialincomeResponse
     */
    public function queryPdataSocialincome($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdataSocialincomeEx($request, $headers, $runtime);
    }

    /**
     * Description: 收入评估服务B
     * Summary: 收入评估服务B.
     *
     * @param QueryPdataSocialincomeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryPdataSocialincomeResponse
     */
    public function queryPdataSocialincomeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdataSocialincomeResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.pdata.socialincome.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 婚姻状况查验服务
     * https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
     * Summary: 婚姻状况查验.
     *
     * @param CheckPdataMarriageRequest $request
     *
     * @return CheckPdataMarriageResponse
     */
    public function checkPdataMarriage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkPdataMarriageEx($request, $headers, $runtime);
    }

    /**
     * Description: 婚姻状况查验服务
     * https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
     * Summary: 婚姻状况查验.
     *
     * @param CheckPdataMarriageRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CheckPdataMarriageResponse
     */
    public function checkPdataMarriageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckPdataMarriageResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.pdata.marriage.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 断卡行动风险识别服务
     * Summary: 断卡行动风险识别服务
     *
     * @param QueryPdataRiskRequest $request
     *
     * @return QueryPdataRiskResponse
     */
    public function queryPdataRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdataRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 断卡行动风险识别服务
     * Summary: 断卡行动风险识别服务
     *
     * @param QueryPdataRiskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryPdataRiskResponse
     */
    public function queryPdataRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdataRiskResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.pdata.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核保医疗查询
     * Summary: 核保医疗查询.
     *
     * @param QueryPdataUnderwriteRequest $request
     *
     * @return QueryPdataUnderwriteResponse
     */
    public function queryPdataUnderwrite($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPdataUnderwriteEx($request, $headers, $runtime);
    }

    /**
     * Description: 核保医疗查询
     * Summary: 核保医疗查询.
     *
     * @param QueryPdataUnderwriteRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryPdataUnderwriteResponse
     */
    public function queryPdataUnderwriteEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPdataUnderwriteResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.pdata.underwrite.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 经济画像
     * Summary: 财富洞察经济画像.
     *
     * @param QueryPortraiteconomyRequest $request
     *
     * @return QueryPortraiteconomyResponse
     */
    public function queryPortraiteconomy($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPortraiteconomyEx($request, $headers, $runtime);
    }

    /**
     * Description: 经济画像
     * Summary: 财富洞察经济画像.
     *
     * @param QueryPortraiteconomyRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryPortraiteconomyResponse
     */
    public function queryPortraiteconomyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPortraiteconomyResponse::fromMap($this->doRequest('1.0', 'blockchain.tax.portraiteconomy.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
