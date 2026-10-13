<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\QQQ;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\QQQ\Models\QueryDemoStreamTestRequest;
use AntChain\QQQ\Models\QueryDemoStreamTestResponse;
use AntChain\QQQ\Models\QueryDemoTestTimeTestaRequest;
use AntChain\QQQ\Models\QueryDemoTestTimeTestaResponse;
use AntChain\QQQ\Models\QueryDemoTtUseRequest;
use AntChain\QQQ\Models\QueryDemoTtUseResponse;
use AntChain\QQQ\Models\QueryDemoUtListRequest;
use AntChain\QQQ\Models\QueryDemoUtListResponse;
use AntChain\QQQ\Models\QueryAntchainAbcTimeFiveRequest;
use AntChain\QQQ\Models\QueryAntchainAbcTimeFiveResponse;
use AntChain\QQQ\Models\QueryAntchainAbcApprovalTestRequest;
use AntChain\QQQ\Models\QueryAntchainAbcApprovalTestResponse;
use AntChain\QQQ\Models\ApiAntchainAbcTestCreateRequest;
use AntChain\QQQ\Models\ApiAntchainAbcTestCreateResponse;
use AntChain\QQQ\Models\QueryAntchainAbcOneLimitRequest;
use AntChain\QQQ\Models\QueryAntchainAbcOneLimitResponse;
use AntChain\QQQ\Models\ImportAntchainAbcOneLimitRequest;
use AntChain\QQQ\Models\ImportAntchainAbcOneLimitResponse;
use AntChain\QQQ\Models\UnstabilizeAntchainAbcOneLimitRequest;
use AntChain\QQQ\Models\UnstabilizeAntchainAbcOneLimitResponse;
use AntChain\QQQ\Models\ApibAntchainDemointernationalxjpInternationalPushRequest;
use AntChain\QQQ\Models\ApibAntchainDemointernationalxjpInternationalPushResponse;
use AntChain\QQQ\Models\BindAntchainDemosdkXxxRequest;
use AntChain\QQQ\Models\BindAntchainDemosdkXxxResponse;
use AntChain\QQQ\Models\ZzzAntchainDemosdkAaaBbbRequest;
use AntChain\QQQ\Models\ZzzAntchainDemosdkAaaBbbResponse;
use AntChain\QQQ\Models\CallDemoAaaBbbCccRequest;
use AntChain\QQQ\Models\CallDemoAaaBbbCccResponse;

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
            "ignoreSSL" => $runtime->ignoreSSL,
            // 键值对，兼容map用
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
                    "sdk_version" => "2.0.5",
                    "_prod_code" => "QQQ",
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
     * Description: 流失查询测试
     * Summary: 流失查询测试
     * @param QueryDemoStreamTestRequest $request
     * @return QueryDemoStreamTestResponse
     */
    public function queryDemoStreamTest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryDemoStreamTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 流失查询测试
     * Summary: 流失查询测试
     * @param QueryDemoStreamTestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryDemoStreamTestResponse
     */
    public function queryDemoStreamTestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryDemoStreamTestResponse::fromMap($this->doRequest("1.0", "demo.stream.test.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试
     * @param QueryDemoTestTimeTestaRequest $request
     * @return QueryDemoTestTimeTestaResponse
     */
    public function queryDemoTestTimeTesta($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryDemoTestTimeTestaEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试
     * Summary: 个人工作台二期测试
     * @param QueryDemoTestTimeTestaRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryDemoTestTimeTestaResponse
     */
    public function queryDemoTestTimeTestaEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryDemoTestTimeTestaResponse::fromMap($this->doRequest("1.0", "demo.test.time.testa.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: s
     * Summary: s
     * @param QueryDemoTtUseRequest $request
     * @return QueryDemoTtUseResponse
     */
    public function queryDemoTtUse($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryDemoTtUseEx($request, $headers, $runtime);
    }

    /**
     * Description: s
     * Summary: s
     * @param QueryDemoTtUseRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryDemoTtUseResponse
     */
    public function queryDemoTtUseEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryDemoTtUseResponse::fromMap($this->doRequest("1.0", "demo.tt.use.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: x
     * Summary: x
     * @param QueryDemoUtListRequest $request
     * @return QueryDemoUtListResponse
     */
    public function queryDemoUtList($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryDemoUtListEx($request, $headers, $runtime);
    }

    /**
     * Description: x
     * Summary: x
     * @param QueryDemoUtListRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryDemoUtListResponse
     */
    public function queryDemoUtListEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryDemoUtListResponse::fromMap($this->doRequest("1.0", "demo.ut.list.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 压测接口5
     * Summary: 压测接口5
     * @param QueryAntchainAbcTimeFiveRequest $request
     * @return QueryAntchainAbcTimeFiveResponse
     */
    public function queryAntchainAbcTimeFive($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntchainAbcTimeFiveEx($request, $headers, $runtime);
    }

    /**
     * Description: 压测接口5
     * Summary: 压测接口5
     * @param QueryAntchainAbcTimeFiveRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntchainAbcTimeFiveResponse
     */
    public function queryAntchainAbcTimeFiveEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntchainAbcTimeFiveResponse::fromMap($this->doRequest("1.0", "antchain.abc.time.five.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323
     * @param QueryAntchainAbcApprovalTestRequest $request
     * @return QueryAntchainAbcApprovalTestResponse
     */
    public function queryAntchainAbcApprovalTest($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntchainAbcApprovalTestEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323
     * @param QueryAntchainAbcApprovalTestRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntchainAbcApprovalTestResponse
     */
    public function queryAntchainAbcApprovalTestEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntchainAbcApprovalTestResponse::fromMap($this->doRequest("1.0", "antchain.abc.approval.test.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 测试使用api
     * Summary: 测试使用api
     * @param ApiAntchainAbcTestCreateRequest $request
     * @return ApiAntchainAbcTestCreateResponse
     */
    public function apiAntchainAbcTestCreate($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apiAntchainAbcTestCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: 测试使用api
     * Summary: 测试使用api
     * @param ApiAntchainAbcTestCreateRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApiAntchainAbcTestCreateResponse
     */
    public function apiAntchainAbcTestCreateEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApiAntchainAbcTestCreateResponse::fromMap($this->doRequest("1.0", "antchain.abc.test.create.api", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
     * Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
     * @param QueryAntchainAbcOneLimitRequest $request
     * @return QueryAntchainAbcOneLimitResponse
     */
    public function queryAntchainAbcOneLimit($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryAntchainAbcOneLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
     * Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
     * @param QueryAntchainAbcOneLimitRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryAntchainAbcOneLimitResponse
     */
    public function queryAntchainAbcOneLimitEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryAntchainAbcOneLimitResponse::fromMap($this->doRequest("1.0", "antchain.abc.one.limit.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试
     * @param ImportAntchainAbcOneLimitRequest $request
     * @return ImportAntchainAbcOneLimitResponse
     */
    public function importAntchainAbcOneLimit($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->importAntchainAbcOneLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试
     * @param ImportAntchainAbcOneLimitRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ImportAntchainAbcOneLimitResponse
     */
    public function importAntchainAbcOneLimitEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ImportAntchainAbcOneLimitResponse::fromMap($this->doRequest("1.0", "antchain.abc.one.limit.import", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口
     * @param UnstabilizeAntchainAbcOneLimitRequest $request
     * @return UnstabilizeAntchainAbcOneLimitResponse
     */
    public function unstabilizeAntchainAbcOneLimit($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->unstabilizeAntchainAbcOneLimitEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口
     * @param UnstabilizeAntchainAbcOneLimitRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return UnstabilizeAntchainAbcOneLimitResponse
     */
    public function unstabilizeAntchainAbcOneLimitEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return UnstabilizeAntchainAbcOneLimitResponse::fromMap($this->doRequest("1.0", "antchain.abc.one.limit.unstabilize", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新加坡push
     * Summary: 新加坡push
     * @param ApibAntchainDemointernationalxjpInternationalPushRequest $request
     * @return ApibAntchainDemointernationalxjpInternationalPushResponse
     */
    public function apibAntchainDemointernationalxjpInternationalPush($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->apibAntchainDemointernationalxjpInternationalPushEx($request, $headers, $runtime);
    }

    /**
     * Description: 新加坡push
     * Summary: 新加坡push
     * @param ApibAntchainDemointernationalxjpInternationalPushRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ApibAntchainDemointernationalxjpInternationalPushResponse
     */
    public function apibAntchainDemointernationalxjpInternationalPushEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ApibAntchainDemointernationalxjpInternationalPushResponse::fromMap($this->doRequest("1.0", "antchain.demointernationalxjp.international.push.apib", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除
     * @param BindAntchainDemosdkXxxRequest $request
     * @return BindAntchainDemosdkXxxResponse
     */
    public function bindAntchainDemosdkXxx($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->bindAntchainDemosdkXxxEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除
     * @param BindAntchainDemosdkXxxRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return BindAntchainDemosdkXxxResponse
     */
    public function bindAntchainDemosdkXxxEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return BindAntchainDemosdkXxxResponse::fromMap($this->doRequest("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除
     * @param ZzzAntchainDemosdkAaaBbbRequest $request
     * @return ZzzAntchainDemosdkAaaBbbResponse
     */
    public function zzzAntchainDemosdkAaaBbb($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->zzzAntchainDemosdkAaaBbbEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除
     * @param ZzzAntchainDemosdkAaaBbbRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ZzzAntchainDemosdkAaaBbbResponse
     */
    public function zzzAntchainDemosdkAaaBbbEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ZzzAntchainDemosdkAaaBbbResponse::fromMap($this->doRequest("1.0", "antchain.demosdk.aaa.bbb.zzz", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除
     * @param CallDemoAaaBbbCccRequest $request
     * @return CallDemoAaaBbbCccResponse
     */
    public function callDemoAaaBbbCcc($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->callDemoAaaBbbCccEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动化测试创建test，请勿修改、删除
     * Summary: 自动化测试创建test，请勿修改、删除
     * @param CallDemoAaaBbbCccRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CallDemoAaaBbbCccResponse
     */
    public function callDemoAaaBbbCccEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CallDemoAaaBbbCccResponse::fromMap($this->doRequest("1.0", "demo.aaa.bbb.ccc.call", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
