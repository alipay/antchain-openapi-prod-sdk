<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVEAGENT;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\RESOLVEAGENT\Models\ImportTaskBatchRequest;
use AntChain\RESOLVEAGENT\Models\ImportTaskBatchResponse;
use AntChain\RESOLVEAGENT\Models\ImportTaskRateinfoRequest;
use AntChain\RESOLVEAGENT\Models\ImportTaskRateinfoResponse;
use AntChain\RESOLVEAGENT\Models\QueryCustomerOverdueRequest;
use AntChain\RESOLVEAGENT\Models\QueryCustomerOverdueResponse;
use AntChain\RESOLVEAGENT\Models\PushCustomerLogininfoRequest;
use AntChain\RESOLVEAGENT\Models\PushCustomerLogininfoResponse;
use AntChain\RESOLVEAGENT\Models\ImportCommonCustomerRequest;
use AntChain\RESOLVEAGENT\Models\ImportCommonCustomerResponse;
use AntChain\RESOLVEAGENT\Models\ImportCustomerRealtimeRequest;
use AntChain\RESOLVEAGENT\Models\ImportCustomerRealtimeResponse;

class Client {
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
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public function __construct($config){
        if (Utils::isUnset($config)) {
            throw new TeaError([
                "code" => "ParameterMissing",
                "message" => "'config' can not be unset"
            ]);
        }
        $this->_accessKeyId = $config->accessKeyId;
        $this->_accessKeySecret = $config->accessKeySecret;
        $this->_securityToken = $config->securityToken;
        $this->_endpoint = $config->endpoint;
        $this->_protocol = $config->protocol;
        $this->_userAgent = $config->userAgent;
        $this->_readTimeout = Utils::defaultNumber($config->readTimeout, 20000);
        $this->_connectTimeout = Utils::defaultNumber($config->connectTimeout, 20000);
        $this->_httpProxy = $config->httpProxy;
        $this->_httpsProxy = $config->httpsProxy;
        $this->_noProxy = $config->noProxy;
        $this->_socks5Proxy = $config->socks5Proxy;
        $this->_socks5NetWork = $config->socks5NetWork;
        $this->_maxIdleConns = Utils::defaultNumber($config->maxIdleConns, 60000);
        $this->_maxIdleTimeMillis = Utils::defaultNumber($config->maxIdleTimeMillis, 5);
        $this->_keepAliveDurationMillis = Utils::defaultNumber($config->keepAliveDurationMillis, 5000);
        $this->_maxRequests = Utils::defaultNumber($config->maxRequests, 100);
        $this->_maxRequestsPerHost = Utils::defaultNumber($config->maxRequestsPerHost, 100);
    }

    /**
     * Encapsulate the request and invoke the network
     * @param string $version
     * @param string $action api name
     * @param string $protocol http or https
     * @param string $method e.g. GET
     * @param string $pathname pathname of every api
     * @param mixed[] $request which contains request params
     * @param string[] $headers
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return array the response
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $headers, $runtime){
        $runtime->validate();
        $_runtime = [
            "timeouted" => "retry",
            "readTimeout" => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            "connectTimeout" => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            "httpProxy" => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            "httpsProxy" => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            "noProxy" => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            "maxIdleConns" => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            "maxIdleTimeMillis" => $this->_maxIdleTimeMillis,
            "keepAliveDuration" => $this->_keepAliveDurationMillis,
            "maxRequests" => $this->_maxRequests,
            "maxRequestsPerHost" => $this->_maxRequestsPerHost,
            "retry" => [
                "retryable" => $runtime->autoretry,
                "maxAttempts" => Utils::defaultNumber($runtime->maxAttempts, 3)
            ],
            "backoff" => [
                "policy" => Utils::defaultString($runtime->backoffPolicy, "no"),
                "period" => Utils::defaultNumber($runtime->backoffPeriod, 1)
            ],
            "ignoreSSL" => $runtime->ignoreSSL
        ];
        $_lastRequest = null;
        $_lastException = null;
        $_now = time();
        $_retryTimes = 0;
        while (Tea::allowRetry(@$_runtime["retry"], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime(@$_runtime["backoff"], $_retryTimes);
                if ($_backoffTime > 0) {
                    Tea::sleep($_backoffTime);
                }
            }
            $_retryTimes = $_retryTimes + 1;
            try {
                $_request = new Request();
                $_request->protocol = Utils::defaultString($this->_protocol, $protocol);
                $_request->method = $method;
                $_request->pathname = $pathname;
                $_request->query = [
                    "method" => $action,
                    "version" => $version,
                    "sign_type" => "HmacSHA1",
                    "req_time" => UtilClient::getTimestamp(),
                    "req_msg_id" => UtilClient::getNonce(),
                    "access_key" => $this->_accessKeyId,
                    "base_sdk_version" => "TeaSDK-2.0",
                    "sdk_version" => "2.1.1",
                    "_prod_code" => "RESOLVEAGENT",
                    "_prod_channel" => "default"
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query["security_token"] = $this->_securityToken;
                }
                $_request->headers = Tea::merge([
                    "host" => Utils::defaultString($this->_endpoint, "openapi.antchain.antgroup.com"),
                    "user-agent" => Utils::getUserAgent($this->_userAgent)
                ], $headers);
                $tmp = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body = Utils::toFormString($tmp);
                $_request->headers["content-type"] = "application/x-www-form-urlencoded";
                $signedParam = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query["sign"] = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $raw = Utils::readAsString($_response->body);
                $obj = Utils::parseJSON($raw);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap(@$res["response"]);
                if (UtilClient::hasError($raw, $this->_accessKeySecret)) {
                    throw new TeaError([
                        "message" => @$resp["result_msg"],
                        "data" => $resp,
                        "code" => @$resp["result_code"]
                    ]);
                }
                return $resp;
            }
            catch (Exception $e) {
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
     * Description: 贷后催调智能体批量名单导入接口
     * Summary: 贷后催调智能体批量名单导入接口
     * @param ImportTaskBatchRequest $request
     * @return ImportTaskBatchResponse
     */
    public function importTaskBatch($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->importTaskBatchEx($request, $headers, $runtime);
    }

    /**
     * Description: 贷后催调智能体批量名单导入接口
     * Summary: 贷后催调智能体批量名单导入接口
     * @param ImportTaskBatchRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ImportTaskBatchResponse
     */
    public function importTaskBatchEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ImportTaskBatchResponse::fromMap($this->doRequest("1.0", "antdigital.resolveagent.task.batch.import", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 贷后对接360利率信息导入
     * Summary: 贷后对接360利率信息导入
     * @param ImportTaskRateinfoRequest $request
     * @return ImportTaskRateinfoResponse
     */
    public function importTaskRateinfo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->importTaskRateinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 贷后对接360利率信息导入
     * Summary: 贷后对接360利率信息导入
     * @param ImportTaskRateinfoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ImportTaskRateinfoResponse
     */
    public function importTaskRateinfoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ImportTaskRateinfoResponse::fromMap($this->doRequest("1.0", "antdigital.resolveagent.task.rateinfo.import", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 贷后360客户是否逾期查询接口
     * Summary: 贷后360客户是否逾期查询接口
     * @param QueryCustomerOverdueRequest $request
     * @return QueryCustomerOverdueResponse
     */
    public function queryCustomerOverdue($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryCustomerOverdueEx($request, $headers, $runtime);
    }

    /**
     * Description: 贷后360客户是否逾期查询接口
     * Summary: 贷后360客户是否逾期查询接口
     * @param QueryCustomerOverdueRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryCustomerOverdueResponse
     */
    public function queryCustomerOverdueEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryCustomerOverdueResponse::fromMap($this->doRequest("1.0", "antdigital.resolveagent.customer.overdue.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 360站内信用户信息推送
     * Summary: 360站内信用户信息推送
     * @param PushCustomerLogininfoRequest $request
     * @return PushCustomerLogininfoResponse
     */
    public function pushCustomerLogininfo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pushCustomerLogininfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 360站内信用户信息推送
     * Summary: 360站内信用户信息推送
     * @param PushCustomerLogininfoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PushCustomerLogininfoResponse
     */
    public function pushCustomerLogininfoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PushCustomerLogininfoResponse::fromMap($this->doRequest("1.0", "antdigital.resolveagent.customer.logininfo.push", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 贷后催调通用导入接口
     * Summary: 贷后催调通用导入接口
     * @param ImportCommonCustomerRequest $request
     * @return ImportCommonCustomerResponse
     */
    public function importCommonCustomer($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->importCommonCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 贷后催调通用导入接口
     * Summary: 贷后催调通用导入接口
     * @param ImportCommonCustomerRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ImportCommonCustomerResponse
     */
    public function importCommonCustomerEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ImportCommonCustomerResponse::fromMap($this->doRequest("1.0", "antdigital.resolveagent.common.customer.import", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 贷后催调实时导入接口
     * Summary: 贷后催调实时导入接口
     * @param ImportCustomerRealtimeRequest $request
     * @return ImportCustomerRealtimeResponse
     */
    public function importCustomerRealtime($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->importCustomerRealtimeEx($request, $headers, $runtime);
    }

    /**
     * Description: 贷后催调实时导入接口
     * Summary: 贷后催调实时导入接口
     * @param ImportCustomerRealtimeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ImportCustomerRealtimeResponse
     */
    public function importCustomerRealtimeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ImportCustomerRealtimeResponse::fromMap($this->doRequest("1.0", "antdigital.resolveagent.customer.realtime.import", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
