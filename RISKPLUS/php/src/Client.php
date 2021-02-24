<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use \Exception;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Request;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;

use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\RISKPLUS\Models\QuerySecurityPolicyRequest;
use AntChain\RISKPLUS\Models\QuerySecurityPolicyResponse;
use AntChain\RISKPLUS\Models\SendSecurityDataRequest;
use AntChain\RISKPLUS\Models\SendSecurityDataResponse;
use AntChain\RISKPLUS\Models\ConfirmSecurityPolicyRequest;
use AntChain\RISKPLUS\Models\ConfirmSecurityPolicyResponse;
use AntChain\RISKPLUS\Models\CheckSecurityRdsRequest;
use AntChain\RISKPLUS\Models\CheckSecurityRdsResponse;
use AntChain\RISKPLUS\Models\QuerySecurityDataRequest;
use AntChain\RISKPLUS\Models\QuerySecurityDataResponse;
use AntChain\RISKPLUS\Models\CheckSecurityDataRequest;
use AntChain\RISKPLUS\Models\CheckSecurityDataResponse;
use AntChain\RISKPLUS\Models\VerifyFinserviceZhimaIdentifyRequest;
use AntChain\RISKPLUS\Models\VerifyFinserviceZhimaIdentifyResponse;
use AntChain\RISKPLUS\Models\QueryFinserviceZhimaIdentifyRequest;
use AntChain\RISKPLUS\Models\QueryFinserviceZhimaIdentifyResponse;
use AntChain\RISKPLUS\Models\QueryRbbGenericInvokeRequest;
use AntChain\RISKPLUS\Models\QueryRbbGenericInvokeResponse;
use AntChain\RISKPLUS\Models\CreateRbbTokenRequest;
use AntChain\RISKPLUS\Models\CreateRbbTokenResponse;
use AntChain\RISKPLUS\Models\CreateRbbApiGwtokenRequest;
use AntChain\RISKPLUS\Models\CreateRbbApiGwtokenResponse;
use AntChain\RISKPLUS\Models\QueryRbbGeneralRequest;
use AntChain\RISKPLUS\Models\QueryRbbGeneralResponse;
use AntChain\RISKPLUS\Models\GetRbbLoginTokenRequest;
use AntChain\RISKPLUS\Models\GetRbbLoginTokenResponse;
use AntChain\RISKPLUS\Models\CreateRbbTenantRequest;
use AntChain\RISKPLUS\Models\CreateRbbTenantResponse;
use AntChain\RISKPLUS\Models\CreateRbbUserRequest;
use AntChain\RISKPLUS\Models\CreateRbbUserResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyOpinionRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyOpinionResponse;
use AntChain\RISKPLUS\Models\ListRtopCompanyOpinionsRequest;
use AntChain\RISKPLUS\Models\ListRtopCompanyOpinionsResponse;
use AntChain\RISKPLUS\Models\GetRtopCompanyMonitorRequest;
use AntChain\RISKPLUS\Models\GetRtopCompanyMonitorResponse;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskStatisticRequest;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskStatisticResponse;
use AntChain\RISKPLUS\Models\ListRtopCrowdriskRequest;
use AntChain\RISKPLUS\Models\ListRtopCrowdriskResponse;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskDetailRequest;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskDetailResponse;
use AntChain\RISKPLUS\Models\QueryRtopRiskstormRequest;
use AntChain\RISKPLUS\Models\QueryRtopRiskstormResponse;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskSumRequest;
use AntChain\RISKPLUS\Models\QueryRtopCrowdriskSumResponse;
use AntChain\RISKPLUS\Models\GetRtopCompanyDetailRequest;
use AntChain\RISKPLUS\Models\GetRtopCompanyDetailResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskinfoRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskinfoResponse;
use AntChain\RISKPLUS\Models\ExecRtopGenericInvokeRequest;
use AntChain\RISKPLUS\Models\ExecRtopGenericInvokeResponse;
use AntChain\RISKPLUS\Models\CreateRtopTokenRequest;
use AntChain\RISKPLUS\Models\CreateRtopTokenResponse;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelRequest;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyResponse;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelFilterRequest;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelFilterResponse;
use AntChain\RISKPLUS\Models\PullRegtechNewsRequest;
use AntChain\RISKPLUS\Models\PullRegtechNewsResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyFeedbackRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyFeedbackResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyAlarmRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyAlarmResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskyRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskyResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyListRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyListResponse;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelConfigRequest;
use AntChain\RISKPLUS\Models\QueryRtopRisklabelConfigResponse;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskRequest;
use AntChain\RISKPLUS\Models\QueryRtopCompanyRiskResponse;
use AntChain\RISKPLUS\Models\ListRtopCompanyRelatedRequest;
use AntChain\RISKPLUS\Models\ListRtopCompanyRelatedResponse;
use AntChain\RISKPLUS\Models\QueryRtopTagImageRequest;
use AntChain\RISKPLUS\Models\QueryRtopTagImageResponse;
use AntChain\RISKPLUS\Models\ListRtopStarCompanyRequest;
use AntChain\RISKPLUS\Models\ListRtopStarCompanyResponse;
use AntChain\RISKPLUS\Models\QueryRpSecurityPolicyRequest;
use AntChain\RISKPLUS\Models\QueryRpSecurityPolicyResponse;

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
            "keepAliveDurationMillis" => $this->_keepAliveDurationMillis,
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
            // 企业风险等级分布统计
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
                    "sdk_version" => "1.6.5"
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
     * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
     * Summary: 策略咨询服务输出
     * @param QuerySecurityPolicyRequest $request
     * @return QuerySecurityPolicyResponse
     */
    public function querySecurityPolicy($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->querySecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
     * Summary: 策略咨询服务输出
     * @param QuerySecurityPolicyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QuerySecurityPolicyResponse
     */
    public function querySecurityPolicyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QuerySecurityPolicyResponse::fromMap($this->doRequest("1.0", "riskplus.security.policy.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据
     * @param SendSecurityDataRequest $request
     * @return SendSecurityDataResponse
     */
    public function sendSecurityData($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->sendSecurityDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据
     * @param SendSecurityDataRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return SendSecurityDataResponse
     */
    public function sendSecurityDataEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return SendSecurityDataResponse::fromMap($this->doRequest("1.0", "riskplus.security.data.send", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出
     * @param ConfirmSecurityPolicyRequest $request
     * @return ConfirmSecurityPolicyResponse
     */
    public function confirmSecurityPolicy($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->confirmSecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出
     * @param ConfirmSecurityPolicyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ConfirmSecurityPolicyResponse
     */
    public function confirmSecurityPolicyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ConfirmSecurityPolicyResponse::fromMap($this->doRequest("1.0", "riskplus.security.policy.confirm", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出
     * @param CheckSecurityRdsRequest $request
     * @return CheckSecurityRdsResponse
     */
    public function checkSecurityRds($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkSecurityRdsEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出
     * @param CheckSecurityRdsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckSecurityRdsResponse
     */
    public function checkSecurityRdsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckSecurityRdsResponse::fromMap($this->doRequest("1.0", "riskplus.security.rds.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出
     * @param QuerySecurityDataRequest $request
     * @return QuerySecurityDataResponse
     */
    public function querySecurityData($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->querySecurityDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出
     * @param QuerySecurityDataRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QuerySecurityDataResponse
     */
    public function querySecurityDataEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QuerySecurityDataResponse::fromMap($this->doRequest("1.0", "riskplus.security.data.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验
     * @param CheckSecurityDataRequest $request
     * @return CheckSecurityDataResponse
     */
    public function checkSecurityData($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->checkSecurityDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验
     * @param CheckSecurityDataRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CheckSecurityDataResponse
     */
    public function checkSecurityDataEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CheckSecurityDataResponse::fromMap($this->doRequest("1.0", "riskplus.security.data.check", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口
     * @param VerifyFinserviceZhimaIdentifyRequest $request
     * @return VerifyFinserviceZhimaIdentifyResponse
     */
    public function verifyFinserviceZhimaIdentify($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->verifyFinserviceZhimaIdentifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口
     * @param VerifyFinserviceZhimaIdentifyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return VerifyFinserviceZhimaIdentifyResponse
     */
    public function verifyFinserviceZhimaIdentifyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return VerifyFinserviceZhimaIdentifyResponse::fromMap($this->doRequest("1.0", "riskplus.finservice.zhima.identify.verify", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:  
     * Summary: 芝麻四要素认证结果查询
     * @param QueryFinserviceZhimaIdentifyRequest $request
     * @return QueryFinserviceZhimaIdentifyResponse
     */
    public function queryFinserviceZhimaIdentify($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryFinserviceZhimaIdentifyEx($request, $headers, $runtime);
    }

    /**
     * Description:  
     * Summary: 芝麻四要素认证结果查询
     * @param QueryFinserviceZhimaIdentifyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryFinserviceZhimaIdentifyResponse
     */
    public function queryFinserviceZhimaIdentifyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryFinserviceZhimaIdentifyResponse::fromMap($this->doRequest("1.0", "riskplus.finservice.zhima.identify.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】
     * @param QueryRbbGenericInvokeRequest $request
     * @return QueryRbbGenericInvokeResponse
     */
    public function queryRbbGenericInvoke($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRbbGenericInvokeEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】
     * @param QueryRbbGenericInvokeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRbbGenericInvokeResponse
     */
    public function queryRbbGenericInvokeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRbbGenericInvokeResponse::fromMap($this->doRequest("1.0", "riskplus.rbb.generic.invoke.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】
     * @param CreateRbbTokenRequest $request
     * @return CreateRbbTokenResponse
     */
    public function createRbbToken($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createRbbTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】
     * @param CreateRbbTokenRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateRbbTokenResponse
     */
    public function createRbbTokenEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateRbbTokenResponse::fromMap($this->doRequest("1.0", "riskplus.rbb.token.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】
     * @param CreateRbbApiGwtokenRequest $request
     * @return CreateRbbApiGwtokenResponse
     */
    public function createRbbApiGwtoken($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createRbbApiGwtokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】
     * @param CreateRbbApiGwtokenRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateRbbApiGwtokenResponse
     */
    public function createRbbApiGwtokenEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateRbbApiGwtokenResponse::fromMap($this->doRequest("1.0", "riskplus.rbb.api.gwtoken.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI
     * @param QueryRbbGeneralRequest $request
     * @return QueryRbbGeneralResponse
     */
    public function queryRbbGeneral($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRbbGeneralEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI
     * @param QueryRbbGeneralRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRbbGeneralResponse
     */
    public function queryRbbGeneralEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRbbGeneralResponse::fromMap($this->doRequest("1.0", "riskplus.rbb.general.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token
     * @param GetRbbLoginTokenRequest $request
     * @return GetRbbLoginTokenResponse
     */
    public function getRbbLoginToken($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getRbbLoginTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token
     * @param GetRbbLoginTokenRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetRbbLoginTokenResponse
     */
    public function getRbbLoginTokenEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetRbbLoginTokenResponse::fromMap($this->doRequest("1.0", "riskplus.rbb.login.token.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户
     * @param CreateRbbTenantRequest $request
     * @return CreateRbbTenantResponse
     */
    public function createRbbTenant($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createRbbTenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户
     * @param CreateRbbTenantRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateRbbTenantResponse
     */
    public function createRbbTenantEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateRbbTenantResponse::fromMap($this->doRequest("1.0", "riskplus.rbb.tenant.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户
     * @param CreateRbbUserRequest $request
     * @return CreateRbbUserResponse
     */
    public function createRbbUser($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createRbbUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户
     * @param CreateRbbUserRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateRbbUserResponse
     */
    public function createRbbUserEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateRbbUserResponse::fromMap($this->doRequest("1.0", "riskplus.rbb.user.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表
     * @param QueryRtopCompanyOpinionRequest $request
     * @return QueryRtopCompanyOpinionResponse
     */
    public function queryRtopCompanyOpinion($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCompanyOpinionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表
     * @param QueryRtopCompanyOpinionRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCompanyOpinionResponse
     */
    public function queryRtopCompanyOpinionEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCompanyOpinionResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.opinion.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息
     * @param ListRtopCompanyOpinionsRequest $request
     * @return ListRtopCompanyOpinionsResponse
     */
    public function listRtopCompanyOpinions($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listRtopCompanyOpinionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息
     * @param ListRtopCompanyOpinionsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListRtopCompanyOpinionsResponse
     */
    public function listRtopCompanyOpinionsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListRtopCompanyOpinionsResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.opinions.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情
     * @param GetRtopCompanyMonitorRequest $request
     * @return GetRtopCompanyMonitorResponse
     */
    public function getRtopCompanyMonitor($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getRtopCompanyMonitorEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情
     * @param GetRtopCompanyMonitorRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetRtopCompanyMonitorResponse
     */
    public function getRtopCompanyMonitorEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetRtopCompanyMonitorResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.monitor.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息
     * @param QueryRtopCrowdriskStatisticRequest $request
     * @return QueryRtopCrowdriskStatisticResponse
     */
    public function queryRtopCrowdriskStatistic($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCrowdriskStatisticEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息
     * @param QueryRtopCrowdriskStatisticRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCrowdriskStatisticResponse
     */
    public function queryRtopCrowdriskStatisticEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCrowdriskStatisticResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.crowdrisk.statistic.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表
     * @param ListRtopCrowdriskRequest $request
     * @return ListRtopCrowdriskResponse
     */
    public function listRtopCrowdrisk($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listRtopCrowdriskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表
     * @param ListRtopCrowdriskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListRtopCrowdriskResponse
     */
    public function listRtopCrowdriskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListRtopCrowdriskResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.crowdrisk.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息
     * @param QueryRtopCrowdriskDetailRequest $request
     * @return QueryRtopCrowdriskDetailResponse
     */
    public function queryRtopCrowdriskDetail($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCrowdriskDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息
     * @param QueryRtopCrowdriskDetailRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCrowdriskDetailResponse
     */
    public function queryRtopCrowdriskDetailEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCrowdriskDetailResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.crowdrisk.detail.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息
     * @param QueryRtopRiskstormRequest $request
     * @return QueryRtopRiskstormResponse
     */
    public function queryRtopRiskstorm($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopRiskstormEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息
     * @param QueryRtopRiskstormRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopRiskstormResponse
     */
    public function queryRtopRiskstormEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopRiskstormResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.riskstorm.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额
     * @param QueryRtopCrowdriskSumRequest $request
     * @return QueryRtopCrowdriskSumResponse
     */
    public function queryRtopCrowdriskSum($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCrowdriskSumEx($request, $headers, $runtime);
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额
     * @param QueryRtopCrowdriskSumRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCrowdriskSumResponse
     */
    public function queryRtopCrowdriskSumEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCrowdriskSumResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.crowdrisk.sum.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取
     * @param GetRtopCompanyDetailRequest $request
     * @return GetRtopCompanyDetailResponse
     */
    public function getRtopCompanyDetail($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->getRtopCompanyDetailEx($request, $headers, $runtime);
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取
     * @param GetRtopCompanyDetailRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return GetRtopCompanyDetailResponse
     */
    public function getRtopCompanyDetailEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return GetRtopCompanyDetailResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.detail.get", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口
     * @param QueryRtopCompanyRiskinfoRequest $request
     * @return QueryRtopCompanyRiskinfoResponse
     */
    public function queryRtopCompanyRiskinfo($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCompanyRiskinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口
     * @param QueryRtopCompanyRiskinfoRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCompanyRiskinfoResponse
     */
    public function queryRtopCompanyRiskinfoEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCompanyRiskinfoResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.riskinfo.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口
     * @param ExecRtopGenericInvokeRequest $request
     * @return ExecRtopGenericInvokeResponse
     */
    public function execRtopGenericInvoke($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->execRtopGenericInvokeEx($request, $headers, $runtime);
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口
     * @param ExecRtopGenericInvokeRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ExecRtopGenericInvokeResponse
     */
    public function execRtopGenericInvokeEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ExecRtopGenericInvokeResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.generic.invoke.exec", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token
     * @param CreateRtopTokenRequest $request
     * @return CreateRtopTokenResponse
     */
    public function createRtopToken($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->createRtopTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token
     * @param CreateRtopTokenRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return CreateRtopTokenResponse
     */
    public function createRtopTokenEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return CreateRtopTokenResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.token.create", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取
     * @param QueryRtopRisklabelRequest $request
     * @return QueryRtopRisklabelResponse
     */
    public function queryRtopRisklabel($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopRisklabelEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取
     * @param QueryRtopRisklabelRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopRisklabelResponse
     */
    public function queryRtopRisklabelEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopRisklabelResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.risklabel.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取
     * @param QueryRtopCompanyRequest $request
     * @return QueryRtopCompanyResponse
     */
    public function queryRtopCompany($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCompanyEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取
     * @param QueryRtopCompanyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCompanyResponse
     */
    public function queryRtopCompanyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCompanyResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签配置全量信息获取
     * rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取
     * @param QueryRtopRisklabelFilterRequest $request
     * @return QueryRtopRisklabelFilterResponse
     */
    public function queryRtopRisklabelFilter($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopRisklabelFilterEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签配置全量信息获取
     * rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取
     * @param QueryRtopRisklabelFilterRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopRisklabelFilterResponse
     */
    public function queryRtopRisklabelFilterEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopRisklabelFilterResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.risklabel.filter.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步
     * @param PullRegtechNewsRequest $request
     * @return PullRegtechNewsResponse
     */
    public function pullRegtechNews($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->pullRegtechNewsEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步
     * @param PullRegtechNewsRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return PullRegtechNewsResponse
     */
    public function pullRegtechNewsEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return PullRegtechNewsResponse::fromMap($this->doRequest("1.0", "riskplus.regtech.news.pull", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈
     * @param QueryRtopCompanyFeedbackRequest $request
     * @return QueryRtopCompanyFeedbackResponse
     */
    public function queryRtopCompanyFeedback($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCompanyFeedbackEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈
     * @param QueryRtopCompanyFeedbackRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCompanyFeedbackResponse
     */
    public function queryRtopCompanyFeedbackEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCompanyFeedbackResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.feedback.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询
     * @param QueryRtopCompanyAlarmRequest $request
     * @return QueryRtopCompanyAlarmResponse
     */
    public function queryRtopCompanyAlarm($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCompanyAlarmEx($request, $headers, $runtime);
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询
     * @param QueryRtopCompanyAlarmRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCompanyAlarmResponse
     */
    public function queryRtopCompanyAlarmEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCompanyAlarmResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.alarm.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表
     * @param QueryRtopCompanyRiskyRequest $request
     * @return QueryRtopCompanyRiskyResponse
     */
    public function queryRtopCompanyRisky($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCompanyRiskyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表
     * @param QueryRtopCompanyRiskyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCompanyRiskyResponse
     */
    public function queryRtopCompanyRiskyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCompanyRiskyResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.risky.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表
     * @param QueryRtopCompanyListRequest $request
     * @return QueryRtopCompanyListResponse
     */
    public function queryRtopCompanyList($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCompanyListEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表
     * @param QueryRtopCompanyListRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCompanyListResponse
     */
    public function queryRtopCompanyListEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCompanyListResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.list.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取
     * @param QueryRtopRisklabelConfigRequest $request
     * @return QueryRtopRisklabelConfigResponse
     */
    public function queryRtopRisklabelConfig($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopRisklabelConfigEx($request, $headers, $runtime);
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取
     * @param QueryRtopRisklabelConfigRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopRisklabelConfigResponse
     */
    public function queryRtopRisklabelConfigEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopRisklabelConfigResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.risklabel.config.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询
     * @param QueryRtopCompanyRiskRequest $request
     * @return QueryRtopCompanyRiskResponse
     */
    public function queryRtopCompanyRisk($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopCompanyRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询
     * @param QueryRtopCompanyRiskRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopCompanyRiskResponse
     */
    public function queryRtopCompanyRiskEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopCompanyRiskResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.risk.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业
     * @param ListRtopCompanyRelatedRequest $request
     * @return ListRtopCompanyRelatedResponse
     */
    public function listRtopCompanyRelated($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listRtopCompanyRelatedEx($request, $headers, $runtime);
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业
     * @param ListRtopCompanyRelatedRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListRtopCompanyRelatedResponse
     */
    public function listRtopCompanyRelatedEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListRtopCompanyRelatedResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.company.related.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询
     * @param QueryRtopTagImageRequest $request
     * @return QueryRtopTagImageResponse
     */
    public function queryRtopTagImage($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRtopTagImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询
     * @param QueryRtopTagImageRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRtopTagImageResponse
     */
    public function queryRtopTagImageEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRtopTagImageResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.tag.image.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表
     * @param ListRtopStarCompanyRequest $request
     * @return ListRtopStarCompanyResponse
     */
    public function listRtopStarCompany($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->listRtopStarCompanyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表
     * @param ListRtopStarCompanyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return ListRtopStarCompanyResponse
     */
    public function listRtopStarCompanyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return ListRtopStarCompanyResponse::fromMap($this->doRequest("1.0", "riskplus.rtop.star.company.list", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas)
     * @param QueryRpSecurityPolicyRequest $request
     * @return QueryRpSecurityPolicyResponse
     */
    public function queryRpSecurityPolicy($request){
        $runtime = new RuntimeOptions([]);
        $headers = [];
        return $this->queryRpSecurityPolicyEx($request, $headers, $runtime);
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas)
     * @param QueryRpSecurityPolicyRequest $request
     * @param string[] $headers
     * @param RuntimeOptions $runtime
     * @return QueryRpSecurityPolicyResponse
     */
    public function queryRpSecurityPolicyEx($request, $headers, $runtime){
        Utils::validateModel($request);
        return QueryRpSecurityPolicyResponse::fromMap($this->doRequest("1.0", "riskplus.rp.security.policy.query", "HTTPS", "POST", "/gateway.do", Tea::merge($request), $headers, $runtime));
    }
}
