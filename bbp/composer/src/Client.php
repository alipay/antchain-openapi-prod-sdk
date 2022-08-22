<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\BBP\Models\ApplyContractRuleRequest;
use AntChain\BBP\Models\ApplyContractRuleResponse;
use AntChain\BBP\Models\AuthCustomerRequest;
use AntChain\BBP\Models\AuthCustomerResponse;
use AntChain\BBP\Models\CancelInsuranceRequest;
use AntChain\BBP\Models\CancelInsuranceResponse;
use AntChain\BBP\Models\CheckVerifyRequest;
use AntChain\BBP\Models\CheckVerifyResponse;
use AntChain\BBP\Models\ConfirmContractReconciliationRequest;
use AntChain\BBP\Models\ConfirmContractReconciliationResponse;
use AntChain\BBP\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\BBP\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\BBP\Models\CreateCustomerRequest;
use AntChain\BBP\Models\CreateCustomerResponse;
use AntChain\BBP\Models\CreateDidCustomerRequest;
use AntChain\BBP\Models\CreateDidCustomerResponse;
use AntChain\BBP\Models\CreateDidEnterpriseRequest;
use AntChain\BBP\Models\CreateDidEnterpriseResponse;
use AntChain\BBP\Models\ExecContractReconciliationRequest;
use AntChain\BBP\Models\ExecContractReconciliationResponse;
use AntChain\BBP\Models\GetContractRuleRequest;
use AntChain\BBP\Models\GetContractRuleResponse;
use AntChain\BBP\Models\InitInsuranceUserRequest;
use AntChain\BBP\Models\InitInsuranceUserResponse;
use AntChain\BBP\Models\InitVerifyRequest;
use AntChain\BBP\Models\InitVerifyResponse;
use AntChain\BBP\Models\MatchDidAccountRequest;
use AntChain\BBP\Models\MatchDidAccountResponse;
use AntChain\BBP\Models\MatchDidAssetsRequest;
use AntChain\BBP\Models\MatchDidAssetsResponse;
use AntChain\BBP\Models\OperateInsuranceRequest;
use AntChain\BBP\Models\OperateInsuranceResponse;
use AntChain\BBP\Models\QueryContractReconciliationRequest;
use AntChain\BBP\Models\QueryContractReconciliationResponse;
use AntChain\BBP\Models\QueryCustomerRequest;
use AntChain\BBP\Models\QueryCustomerResponse;
use AntChain\BBP\Models\QueryEnterpriseBusinessinfoRequest;
use AntChain\BBP\Models\QueryEnterpriseBusinessinfoResponse;
use AntChain\BBP\Models\QueryGwtestRequest;
use AntChain\BBP\Models\QueryGwtestResponse;
use AntChain\BBP\Models\QueryInsuranceChainRequest;
use AntChain\BBP\Models\QueryInsuranceChainResponse;
use AntChain\BBP\Models\QueryInsuranceRecordsRequest;
use AntChain\BBP\Models\QueryInsuranceRecordsResponse;
use AntChain\BBP\Models\QueryInsuranceRequest;
use AntChain\BBP\Models\QueryInsuranceResponse;
use AntChain\BBP\Models\QueryStaffAssessmentRequest;
use AntChain\BBP\Models\QueryStaffAssessmentResponse;
use AntChain\BBP\Models\QueryStaffAttendanceRequest;
use AntChain\BBP\Models\QueryStaffAttendanceResponse;
use AntChain\BBP\Models\StartVerifyRequest;
use AntChain\BBP\Models\StartVerifyResponse;
use AntChain\BBP\Models\SyncInsuranceRequest;
use AntChain\BBP\Models\SyncInsuranceResponse;
use AntChain\BBP\Models\UploadInsuranceRequest;
use AntChain\BBP\Models\UploadInsuranceResponse;
use AntChain\BBP\Models\UploadStaffAssessmentRequest;
use AntChain\BBP\Models\UploadStaffAssessmentResponse;
use AntChain\BBP\Models\UploadStaffAttendanceRequest;
use AntChain\BBP\Models\UploadStaffAttendanceResponse;
use AntChain\BBP\Models\VerifyCustomerRequest;
use AntChain\BBP\Models\VerifyCustomerResponse;
use AntChain\BBP\Models\VerifyMetaRequest;
use AntChain\BBP\Models\VerifyMetaResponse;
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
            // 键值对，兼容map用
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
                    'sdk_version'      => '1.7.28',
                    '_prod_code'       => 'BBP',
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
     * Description: 对企业/个人进行身份认证
     * Summary: 统一客户认证接口.
     *
     * @param AuthCustomerRequest $request
     *
     * @return AuthCustomerResponse
     */
    public function authCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 对企业/个人进行身份认证
     * Summary: 统一客户认证接口.
     *
     * @param AuthCustomerRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return AuthCustomerResponse
     */
    public function authCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智科统一客户注册
     * Summary: 统一客户注册接口.
     *
     * @param CreateCustomerRequest $request
     *
     * @return CreateCustomerResponse
     */
    public function createCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 智科统一客户注册
     * Summary: 统一客户注册接口.
     *
     * @param CreateCustomerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateCustomerResponse
     */
    public function createCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.customer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 客户信息查询
     * Summary: 客户信息查询.
     *
     * @param QueryCustomerRequest $request
     *
     * @return QueryCustomerResponse
     */
    public function queryCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 客户信息查询
     * Summary: 客户信息查询.
     *
     * @param QueryCustomerRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryCustomerResponse
     */
    public function queryCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.customer.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核身初始化接口
     * Summary: 核身初始化接口.
     *
     * @param InitVerifyRequest $request
     *
     * @return InitVerifyResponse
     */
    public function initVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 核身初始化接口
     * Summary: 核身初始化接口.
     *
     * @param InitVerifyRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return InitVerifyResponse
     */
    public function initVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitVerifyResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.verify.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核身产品渲染接口
     * Summary: 核身产品渲染接口.
     *
     * @param StartVerifyRequest $request
     *
     * @return StartVerifyResponse
     */
    public function startVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->startVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 核身产品渲染接口
     * Summary: 核身产品渲染接口.
     *
     * @param StartVerifyRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return StartVerifyResponse
     */
    public function startVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return StartVerifyResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.verify.start', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核身结果查询
     * Summary: 核身结果查询.
     *
     * @param CheckVerifyRequest $request
     *
     * @return CheckVerifyResponse
     */
    public function checkVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 核身结果查询
     * Summary: 核身结果查询.
     *
     * @param CheckVerifyRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return CheckVerifyResponse
     */
    public function checkVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckVerifyResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.verify.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对企业身份进行认证
     * Summary: 企业四要素认证
     *
     * @param VerifyMetaRequest $request
     *
     * @return VerifyMetaResponse
     */
    public function verifyMeta($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyMetaEx($request, $headers, $runtime);
    }

    /**
     * Description: 对企业身份进行认证
     * Summary: 企业四要素认证
     *
     * @param VerifyMetaRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return VerifyMetaResponse
     */
    public function verifyMetaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyMetaResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.meta.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 经营信息查询
     * Summary: 经营信息查询.
     *
     * @param QueryEnterpriseBusinessinfoRequest $request
     *
     * @return QueryEnterpriseBusinessinfoResponse
     */
    public function queryEnterpriseBusinessinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEnterpriseBusinessinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 经营信息查询
     * Summary: 经营信息查询.
     *
     * @param QueryEnterpriseBusinessinfoRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryEnterpriseBusinessinfoResponse
     */
    public function queryEnterpriseBusinessinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEnterpriseBusinessinfoResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.enterprise.businessinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 网关测试
     * Summary: 网关测试.
     *
     * @param QueryGwtestRequest $request
     *
     * @return QueryGwtestResponse
     */
    public function queryGwtest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGwtestEx($request, $headers, $runtime);
    }

    /**
     * Description: 网关测试
     * Summary: 网关测试.
     *
     * @param QueryGwtestRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryGwtestResponse
     */
    public function queryGwtestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGwtestResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.gwtest.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
     * Summary: 外包薪资规则合约发布接口.
     *
     * @param ApplyContractRuleRequest $request
     *
     * @return ApplyContractRuleResponse
     */
    public function applyContractRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyContractRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
     * Summary: 外包薪资规则合约发布接口.
     *
     * @param ApplyContractRuleRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ApplyContractRuleResponse
     */
    public function applyContractRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyContractRuleResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.contract.rule.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用链上合约接口，查询外包的薪资方案
     * Summary: 外包薪资规则合约查询接口.
     *
     * @param GetContractRuleRequest $request
     *
     * @return GetContractRuleResponse
     */
    public function getContractRule($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getContractRuleEx($request, $headers, $runtime);
    }

    /**
     * Description: 调用链上合约接口，查询外包的薪资方案
     * Summary: 外包薪资规则合约查询接口.
     *
     * @param GetContractRuleRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return GetContractRuleResponse
     */
    public function getContractRuleEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetContractRuleResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.contract.rule.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
     * Summary: 长城汽车的考勤信息上传接口.
     *
     * @param UploadStaffAttendanceRequest $request
     *
     * @return UploadStaffAttendanceResponse
     */
    public function uploadStaffAttendance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadStaffAttendanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
     * Summary: 长城汽车的考勤信息上传接口.
     *
     * @param UploadStaffAttendanceRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UploadStaffAttendanceResponse
     */
    public function uploadStaffAttendanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadStaffAttendanceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.staff.attendance.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于人的维度，入参：{用户id,考勤月份}
     * Summary: 长城汽车的考勤信息获取.
     *
     * @param QueryStaffAttendanceRequest $request
     *
     * @return QueryStaffAttendanceResponse
     */
    public function queryStaffAttendance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStaffAttendanceEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于人的维度，入参：{用户id,考勤月份}
     * Summary: 长城汽车的考勤信息获取.
     *
     * @param QueryStaffAttendanceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryStaffAttendanceResponse
     */
    public function queryStaffAttendanceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStaffAttendanceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.staff.attendance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 长城汽车的考核信息
     * Summary: 长城汽车的考核信息.
     *
     * @param UploadStaffAssessmentRequest $request
     *
     * @return UploadStaffAssessmentResponse
     */
    public function uploadStaffAssessment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadStaffAssessmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 长城汽车的考核信息
     * Summary: 长城汽车的考核信息.
     *
     * @param UploadStaffAssessmentRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UploadStaffAssessmentResponse
     */
    public function uploadStaffAssessmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadStaffAssessmentResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.staff.assessment.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 考核信息查询
     * Summary: 考核信息查询.
     *
     * @param QueryStaffAssessmentRequest $request
     *
     * @return QueryStaffAssessmentResponse
     */
    public function queryStaffAssessment($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStaffAssessmentEx($request, $headers, $runtime);
    }

    /**
     * Description: 考核信息查询
     * Summary: 考核信息查询.
     *
     * @param QueryStaffAssessmentRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryStaffAssessmentResponse
     */
    public function queryStaffAssessmentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStaffAssessmentResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.staff.assessment.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 对账单执行
     * Summary: 对账单执行接口.
     *
     * @param ExecContractReconciliationRequest $request
     *
     * @return ExecContractReconciliationResponse
     */
    public function execContractReconciliation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execContractReconciliationEx($request, $headers, $runtime);
    }

    /**
     * Description: 对账单执行
     * Summary: 对账单执行接口.
     *
     * @param ExecContractReconciliationRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ExecContractReconciliationResponse
     */
    public function execContractReconciliationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecContractReconciliationResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.contract.reconciliation.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 结算单确认
     * Summary: 结算单确认.
     *
     * @param ConfirmContractReconciliationRequest $request
     *
     * @return ConfirmContractReconciliationResponse
     */
    public function confirmContractReconciliation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmContractReconciliationEx($request, $headers, $runtime);
    }

    /**
     * Description: 结算单确认
     * Summary: 结算单确认.
     *
     * @param ConfirmContractReconciliationRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ConfirmContractReconciliationResponse
     */
    public function confirmContractReconciliationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmContractReconciliationResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.contract.reconciliation.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询结算单
     * Summary: 查询结算单.
     *
     * @param QueryContractReconciliationRequest $request
     *
     * @return QueryContractReconciliationResponse
     */
    public function queryContractReconciliation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryContractReconciliationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询结算单
     * Summary: 查询结算单.
     *
     * @param QueryContractReconciliationRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryContractReconciliationResponse
     */
    public function queryContractReconciliationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryContractReconciliationResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.contract.reconciliation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: DID创建及核验
     * Summary: DID创建及核验.
     *
     * @param VerifyCustomerRequest $request
     *
     * @return VerifyCustomerResponse
     */
    public function verifyCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: DID创建及核验
     * Summary: DID创建及核验.
     *
     * @param VerifyCustomerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return VerifyCustomerResponse
     */
    public function verifyCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.customer.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 身份关联链上账户
     * Summary: 身份关联链上账户.
     *
     * @param MatchDidAccountRequest $request
     *
     * @return MatchDidAccountResponse
     */
    public function matchDidAccount($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->matchDidAccountEx($request, $headers, $runtime);
    }

    /**
     * Description: 身份关联链上账户
     * Summary: 身份关联链上账户.
     *
     * @param MatchDidAccountRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return MatchDidAccountResponse
     */
    public function matchDidAccountEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MatchDidAccountResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.did.account.match', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 身份关数字资产
     * Summary: 身份关数字资产.
     *
     * @param MatchDidAssetsRequest $request
     *
     * @return MatchDidAssetsResponse
     */
    public function matchDidAssets($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->matchDidAssetsEx($request, $headers, $runtime);
    }

    /**
     * Description: 身份关数字资产
     * Summary: 身份关数字资产.
     *
     * @param MatchDidAssetsRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return MatchDidAssetsResponse
     */
    public function matchDidAssetsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return MatchDidAssetsResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.did.assets.match', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: DID创建及核验
     * Summary: DID创建及核验.
     *
     * @param CreateDidCustomerRequest $request
     *
     * @return CreateDidCustomerResponse
     */
    public function createDidCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDidCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: DID创建及核验
     * Summary: DID创建及核验.
     *
     * @param CreateDidCustomerRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CreateDidCustomerResponse
     */
    public function createDidCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDidCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.did.customer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业DID创建及核验
     * Summary: 企业DID创建及核验.
     *
     * @param CreateDidEnterpriseRequest $request
     *
     * @return CreateDidEnterpriseResponse
     */
    public function createDidEnterprise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDidEnterpriseEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业DID创建及核验
     * Summary: 企业DID创建及核验.
     *
     * @param CreateDidEnterpriseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateDidEnterpriseResponse
     */
    public function createDidEnterpriseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDidEnterpriseResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.did.enterprise.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 记录用户登录保司小程序信息
     * Summary: 用户登陆页面埋点.
     *
     * @param InitInsuranceUserRequest $request
     *
     * @return InitInsuranceUserResponse
     */
    public function initInsuranceUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initInsuranceUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 记录用户登录保司小程序信息
     * Summary: 用户登陆页面埋点.
     *
     * @param InitInsuranceUserRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return InitInsuranceUserResponse
     */
    public function initInsuranceUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitInsuranceUserResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.user.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保司方获取授权信息
     * Summary: 获取授权信息.
     *
     * @param QueryInsuranceRequest $request
     *
     * @return QueryInsuranceResponse
     */
    public function queryInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 保司方获取授权信息
     * Summary: 获取授权信息.
     *
     * @param QueryInsuranceRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryInsuranceResponse
     */
    public function queryInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInsuranceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保单信息上链，保单信息同步
     * Summary: 保单信息上链.
     *
     * @param OperateInsuranceRequest $request
     *
     * @return OperateInsuranceResponse
     */
    public function operateInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 保单信息上链，保单信息同步
     * Summary: 保单信息上链.
     *
     * @param OperateInsuranceRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return OperateInsuranceResponse
     */
    public function operateInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateInsuranceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传保单附件至阿里云OSS
     * Summary: 上传保单附件.
     *
     * @param UploadInsuranceRequest $request
     *
     * @return UploadInsuranceResponse
     */
    public function uploadInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传保单附件至阿里云OSS
     * Summary: 上传保单附件.
     *
     * @param UploadInsuranceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return UploadInsuranceResponse
     */
    public function uploadInsuranceEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.bbp.insurance.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadInsuranceResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return UploadInsuranceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保险理赔受理信息同步到蚂蚁链
     * Summary: 理赔受理上链.
     *
     * @param SyncInsuranceRequest $request
     *
     * @return SyncInsuranceResponse
     */
    public function syncInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 保险理赔受理信息同步到蚂蚁链
     * Summary: 理赔受理上链.
     *
     * @param SyncInsuranceRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return SyncInsuranceResponse
     */
    public function syncInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncInsuranceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步用户退保信息上链
     * Summary: 保单退保接口.
     *
     * @param CancelInsuranceRequest $request
     *
     * @return CancelInsuranceResponse
     */
    public function cancelInsurance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelInsuranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步用户退保信息上链
     * Summary: 保单退保接口.
     *
     * @param CancelInsuranceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CancelInsuranceResponse
     */
    public function cancelInsuranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelInsuranceResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户的数据库保单记录
     * Summary: 用户保单信息列表查询.
     *
     * @param QueryInsuranceRecordsRequest $request
     *
     * @return QueryInsuranceRecordsResponse
     */
    public function queryInsuranceRecords($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInsuranceRecordsEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户的数据库保单记录
     * Summary: 用户保单信息列表查询.
     *
     * @param QueryInsuranceRecordsRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryInsuranceRecordsResponse
     */
    public function queryInsuranceRecordsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInsuranceRecordsResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.records.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 保单链上信息查询
     * Summary: 保单链上信息查询.
     *
     * @param QueryInsuranceChainRequest $request
     *
     * @return QueryInsuranceChainResponse
     */
    public function queryInsuranceChain($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryInsuranceChainEx($request, $headers, $runtime);
    }

    /**
     * Description: 保单链上信息查询
     * Summary: 保单链上信息查询.
     *
     * @param QueryInsuranceChainRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryInsuranceChainResponse
     */
    public function queryInsuranceChainEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryInsuranceChainResponse::fromMap($this->doRequest('1.0', 'antchain.bbp.insurance.chain.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUpload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntcloudGatewayxFileUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUploadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntcloudGatewayxFileUploadResponse::fromMap($this->doRequest('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
