<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Response;
use AntChain\Util\UtilClient;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;

use AntChain\EBC\Models\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\EBC\Models\CreateAasEbcOrganizationRequest;
use AntChain\EBC\Models\CreateAasEbcOrganizationResponse;
use AntChain\EBC\Models\CreateAasEbcPersonRequest;
use AntChain\EBC\Models\CreateAasEbcPersonResponse;
use AntChain\EBC\Models\CreateAasEbcOrganizationUserRequest;
use AntChain\EBC\Models\CreateAasEbcOrganizationUserResponse;
use AntChain\EBC\Models\CancelAasEbcPersonRequest;
use AntChain\EBC\Models\CancelAasEbcPersonResponse;
use AntChain\EBC\Models\ResumeAasEbcPersonRequest;
use AntChain\EBC\Models\ResumeAasEbcPersonResponse;
use AntChain\EBC\Models\CreateAasEbcOrganizationClassRequest;
use AntChain\EBC\Models\CreateAasEbcOrganizationClassResponse;
use AntChain\EBC\Models\UpdateAasEbcOrganizationClassRequest;
use AntChain\EBC\Models\UpdateAasEbcOrganizationClassResponse;
use AntChain\EBC\Models\AddAasEbcClassUserRequest;
use AntChain\EBC\Models\AddAasEbcClassUserResponse;
use AntChain\EBC\Models\DeleteAasEbcClassUserRequest;
use AntChain\EBC\Models\DeleteAasEbcClassUserResponse;
use AntChain\EBC\Models\QueryAasEbcOrganizationClassRequest;
use AntChain\EBC\Models\QueryAasEbcOrganizationClassResponse;
use AntChain\EBC\Models\QueryAasEbcClassUserRequest;
use AntChain\EBC\Models\QueryAasEbcClassUserResponse;
use AntChain\EBC\Models\CreateAasEbcOrganizationCourseRequest;
use AntChain\EBC\Models\CreateAasEbcOrganizationCourseResponse;
use AntChain\EBC\Models\UpdateAasEbcOrganizationCourseRequest;
use AntChain\EBC\Models\UpdateAasEbcOrganizationCourseResponse;
use AntChain\EBC\Models\AddAasEbcCourseClassRequest;
use AntChain\EBC\Models\AddAasEbcCourseClassResponse;
use AntChain\EBC\Models\AddAasEbcCourseUserRequest;
use AntChain\EBC\Models\AddAasEbcCourseUserResponse;
use AntChain\EBC\Models\DeleteAasEbcCourseClassRequest;
use AntChain\EBC\Models\DeleteAasEbcCourseClassResponse;
use AntChain\EBC\Models\DeleteAasEbcCourseUserRequest;
use AntChain\EBC\Models\DeleteAasEbcCourseUserResponse;
use AntChain\EBC\Models\CreateAasEbcUserCertRequest;
use AntChain\EBC\Models\CreateAasEbcUserCertResponse;
use AntChain\EBC\Models\UpdateAasEbcUserCertRequest;
use AntChain\EBC\Models\UpdateAasEbcUserCertResponse;
use AntChain\EBC\Models\QueryAasEbcOrganizationCertRequest;
use AntChain\EBC\Models\QueryAasEbcOrganizationCertResponse;
use AntChain\EBC\Models\QueryAasEbcUserCertRequest;
use AntChain\EBC\Models\QueryAasEbcUserCertResponse;
use AntChain\EBC\Models\QueryAasEbcCertRequest;
use AntChain\EBC\Models\QueryAasEbcCertResponse;
use AntChain\EBC\Models\ApplyAasEbcCertUrlRequest;
use AntChain\EBC\Models\ApplyAasEbcCertUrlResponse;
use AntChain\EBC\Models\CreateAasEbcAuthRequest;
use AntChain\EBC\Models\CreateAasEbcAuthResponse;
use AntChain\EBC\Models\UpdateAasEbcAuthRequest;
use AntChain\EBC\Models\UpdateAasEbcAuthResponse;
use AntChain\EBC\Models\UpdateAasEbcAuthStatusRequest;
use AntChain\EBC\Models\UpdateAasEbcAuthStatusResponse;
use AntChain\EBC\Models\UpdateAasEbcDataPriceRequest;
use AntChain\EBC\Models\UpdateAasEbcDataPriceResponse;
use AntChain\EBC\Models\QueryAasEbcConsumptionAmountRequest;
use AntChain\EBC\Models\QueryAasEbcConsumptionAmountResponse;

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

    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public function __construct(Config $config){
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
        $this->_readTimeout = $config->readTimeout;
        $this->_connectTimeout = $config->connectTimeout;
        $this->_httpProxy = $config->httpProxy;
        $this->_httpsProxy = $config->httpsProxy;
        $this->_noProxy = $config->noProxy;
        $this->_socks5Proxy = $config->socks5Proxy;
        $this->_socks5NetWork = $config->socks5NetWork;
        $this->_maxIdleConns = $config->maxIdleConns;
    }

    /**
     * Encapsulate the request and invoke the network
     * @param string $version
     * @param string $action api name
     * @param string $protocol http or https
     * @param string $method e.g. GET
     * @param string $pathname pathname of every api
     * @param object $request which contains request params
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return object|array response
     * @throws \Exception
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, RuntimeOptions $runtime){
        $runtime->validate();
        $_runtime = [
            "timeouted" => "retry",
            "readTimeout" => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            "connectTimeout" => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            "httpProxy" => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            "httpsProxy" => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            "noProxy" => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            "maxIdleConns" => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
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
        while (Tea::allowRetry($_runtime["retry"], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime($_runtime["backoff"], $_retryTimes);
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
                    "req_msg_id" => Utils::getNonce(),
                    "access_key" => $this->_accessKeyId,
                    "charset" => "UTF-8",
                    "baseSdkVersion" => "Tea-SDK",
                    "sdkVersion" => "Tea-SDK-20200713"
                    ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query["security_token"] = $this->_securityToken;
                }
                $_request->headers = [
                    "host" => $this->_endpoint,
                    "user-agent" => $this->getUserAgent()
                    ];
                $tmp = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body = Utils::toFormString($tmp);
                $_request->headers["content-type"] = "application/x-www-form-urlencoded";
                $signedParam = Tea::merge($_request->query,
                    RpcUtils::query($request));
                $_request->query["sign"] = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $obj = Utils::readAsJSON($_response->body);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap($res["response"]);
                if (UtilClient::hasError($res)) {
                    throw new TeaError([
                        "message" => $resp["result_msg"],
                        "data" => $resp,
                        "code" => $resp["result_code"]
                        ]);
                }
                return $resp;
            }
            catch (\Exception $e) {
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
     * Get user agent
     * @return string agent
     * @throws \Exception
     */
    public function getUserAgent(){
        $userAgent = "TeaClient/1.0.0";
        return Utils::getUserAgent($userAgent);
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业
     * @param CreateAasEbcOrganizationRequest $request
     * @return CreateAasEbcOrganizationResponse
     * @throws \Exception
     */
    public function createAasEbcOrganization(CreateAasEbcOrganizationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasEbcOrganizationEx($request, $runtime);
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业
     * @param CreateAasEbcOrganizationRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasEbcOrganizationResponse
     * @throws \Exception
     */
    public function createAasEbcOrganizationEx(CreateAasEbcOrganizationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasEbcOrganizationResponse::fromMap($this->doRequest("1.0", "baas.ebc.organization.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人
     * @param CreateAasEbcPersonRequest $request
     * @return CreateAasEbcPersonResponse
     * @throws \Exception
     */
    public function createAasEbcPerson(CreateAasEbcPersonRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasEbcPersonEx($request, $runtime);
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人
     * @param CreateAasEbcPersonRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasEbcPersonResponse
     * @throws \Exception
     */
    public function createAasEbcPersonEx(CreateAasEbcPersonRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasEbcPersonResponse::fromMap($this->doRequest("1.0", "baas.ebc.person.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册
     * @param CreateAasEbcOrganizationUserRequest $request
     * @return CreateAasEbcOrganizationUserResponse
     * @throws \Exception
     */
    public function createAasEbcOrganizationUser(CreateAasEbcOrganizationUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasEbcOrganizationUserEx($request, $runtime);
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册
     * @param CreateAasEbcOrganizationUserRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasEbcOrganizationUserResponse
     * @throws \Exception
     */
    public function createAasEbcOrganizationUserEx(CreateAasEbcOrganizationUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasEbcOrganizationUserResponse::fromMap($this->doRequest("1.0", "baas.ebc.organization.user.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出
     * @param CancelAasEbcPersonRequest $request
     * @return CancelAasEbcPersonResponse
     * @throws \Exception
     */
    public function cancelAasEbcPerson(CancelAasEbcPersonRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->cancelAasEbcPersonEx($request, $runtime);
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出
     * @param CancelAasEbcPersonRequest $request
     * @param RuntimeOptions $runtime
     * @return CancelAasEbcPersonResponse
     * @throws \Exception
     */
    public function cancelAasEbcPersonEx(CancelAasEbcPersonRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CancelAasEbcPersonResponse::fromMap($this->doRequest("1.0", "baas.ebc.person.cancel", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入
     * @param ResumeAasEbcPersonRequest $request
     * @return ResumeAasEbcPersonResponse
     * @throws \Exception
     */
    public function resumeAasEbcPerson(ResumeAasEbcPersonRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->resumeAasEbcPersonEx($request, $runtime);
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入
     * @param ResumeAasEbcPersonRequest $request
     * @param RuntimeOptions $runtime
     * @return ResumeAasEbcPersonResponse
     * @throws \Exception
     */
    public function resumeAasEbcPersonEx(ResumeAasEbcPersonRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ResumeAasEbcPersonResponse::fromMap($this->doRequest("1.0", "baas.ebc.person.resume", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级
     * @param CreateAasEbcOrganizationClassRequest $request
     * @return CreateAasEbcOrganizationClassResponse
     * @throws \Exception
     */
    public function createAasEbcOrganizationClass(CreateAasEbcOrganizationClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasEbcOrganizationClassEx($request, $runtime);
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级
     * @param CreateAasEbcOrganizationClassRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasEbcOrganizationClassResponse
     * @throws \Exception
     */
    public function createAasEbcOrganizationClassEx(CreateAasEbcOrganizationClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasEbcOrganizationClassResponse::fromMap($this->doRequest("1.0", "baas.ebc.organization.class.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级
     * @param UpdateAasEbcOrganizationClassRequest $request
     * @return UpdateAasEbcOrganizationClassResponse
     * @throws \Exception
     */
    public function updateAasEbcOrganizationClass(UpdateAasEbcOrganizationClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasEbcOrganizationClassEx($request, $runtime);
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级
     * @param UpdateAasEbcOrganizationClassRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasEbcOrganizationClassResponse
     * @throws \Exception
     */
    public function updateAasEbcOrganizationClassEx(UpdateAasEbcOrganizationClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasEbcOrganizationClassResponse::fromMap($this->doRequest("1.0", "baas.ebc.organization.class.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员
     * @param AddAasEbcClassUserRequest $request
     * @return AddAasEbcClassUserResponse
     * @throws \Exception
     */
    public function addAasEbcClassUser(AddAasEbcClassUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->addAasEbcClassUserEx($request, $runtime);
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员
     * @param AddAasEbcClassUserRequest $request
     * @param RuntimeOptions $runtime
     * @return AddAasEbcClassUserResponse
     * @throws \Exception
     */
    public function addAasEbcClassUserEx(AddAasEbcClassUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AddAasEbcClassUserResponse::fromMap($this->doRequest("1.0", "baas.ebc.class.user.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员
     * @param DeleteAasEbcClassUserRequest $request
     * @return DeleteAasEbcClassUserResponse
     * @throws \Exception
     */
    public function deleteAasEbcClassUser(DeleteAasEbcClassUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->deleteAasEbcClassUserEx($request, $runtime);
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员
     * @param DeleteAasEbcClassUserRequest $request
     * @param RuntimeOptions $runtime
     * @return DeleteAasEbcClassUserResponse
     * @throws \Exception
     */
    public function deleteAasEbcClassUserEx(DeleteAasEbcClassUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return DeleteAasEbcClassUserResponse::fromMap($this->doRequest("1.0", "baas.ebc.class.user.delete", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询
     * @param QueryAasEbcOrganizationClassRequest $request
     * @return QueryAasEbcOrganizationClassResponse
     * @throws \Exception
     */
    public function queryAasEbcOrganizationClass(QueryAasEbcOrganizationClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasEbcOrganizationClassEx($request, $runtime);
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询
     * @param QueryAasEbcOrganizationClassRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasEbcOrganizationClassResponse
     * @throws \Exception
     */
    public function queryAasEbcOrganizationClassEx(QueryAasEbcOrganizationClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasEbcOrganizationClassResponse::fromMap($this->doRequest("1.0", "baas.ebc.organization.class.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询
     * @param QueryAasEbcClassUserRequest $request
     * @return QueryAasEbcClassUserResponse
     * @throws \Exception
     */
    public function queryAasEbcClassUser(QueryAasEbcClassUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasEbcClassUserEx($request, $runtime);
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询
     * @param QueryAasEbcClassUserRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasEbcClassUserResponse
     * @throws \Exception
     */
    public function queryAasEbcClassUserEx(QueryAasEbcClassUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasEbcClassUserResponse::fromMap($this->doRequest("1.0", "baas.ebc.class.user.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程
     * @param CreateAasEbcOrganizationCourseRequest $request
     * @return CreateAasEbcOrganizationCourseResponse
     * @throws \Exception
     */
    public function createAasEbcOrganizationCourse(CreateAasEbcOrganizationCourseRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasEbcOrganizationCourseEx($request, $runtime);
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程
     * @param CreateAasEbcOrganizationCourseRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasEbcOrganizationCourseResponse
     * @throws \Exception
     */
    public function createAasEbcOrganizationCourseEx(CreateAasEbcOrganizationCourseRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasEbcOrganizationCourseResponse::fromMap($this->doRequest("1.0", "baas.ebc.organization.course.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程
     * @param UpdateAasEbcOrganizationCourseRequest $request
     * @return UpdateAasEbcOrganizationCourseResponse
     * @throws \Exception
     */
    public function updateAasEbcOrganizationCourse(UpdateAasEbcOrganizationCourseRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasEbcOrganizationCourseEx($request, $runtime);
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程
     * @param UpdateAasEbcOrganizationCourseRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasEbcOrganizationCourseResponse
     * @throws \Exception
     */
    public function updateAasEbcOrganizationCourseEx(UpdateAasEbcOrganizationCourseRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasEbcOrganizationCourseResponse::fromMap($this->doRequest("1.0", "baas.ebc.organization.course.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级
     * @param AddAasEbcCourseClassRequest $request
     * @return AddAasEbcCourseClassResponse
     * @throws \Exception
     */
    public function addAasEbcCourseClass(AddAasEbcCourseClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->addAasEbcCourseClassEx($request, $runtime);
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级
     * @param AddAasEbcCourseClassRequest $request
     * @param RuntimeOptions $runtime
     * @return AddAasEbcCourseClassResponse
     * @throws \Exception
     */
    public function addAasEbcCourseClassEx(AddAasEbcCourseClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AddAasEbcCourseClassResponse::fromMap($this->doRequest("1.0", "baas.ebc.course.class.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员
     * @param AddAasEbcCourseUserRequest $request
     * @return AddAasEbcCourseUserResponse
     * @throws \Exception
     */
    public function addAasEbcCourseUser(AddAasEbcCourseUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->addAasEbcCourseUserEx($request, $runtime);
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员
     * @param AddAasEbcCourseUserRequest $request
     * @param RuntimeOptions $runtime
     * @return AddAasEbcCourseUserResponse
     * @throws \Exception
     */
    public function addAasEbcCourseUserEx(AddAasEbcCourseUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AddAasEbcCourseUserResponse::fromMap($this->doRequest("1.0", "baas.ebc.course.user.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级
     * @param DeleteAasEbcCourseClassRequest $request
     * @return DeleteAasEbcCourseClassResponse
     * @throws \Exception
     */
    public function deleteAasEbcCourseClass(DeleteAasEbcCourseClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->deleteAasEbcCourseClassEx($request, $runtime);
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级
     * @param DeleteAasEbcCourseClassRequest $request
     * @param RuntimeOptions $runtime
     * @return DeleteAasEbcCourseClassResponse
     * @throws \Exception
     */
    public function deleteAasEbcCourseClassEx(DeleteAasEbcCourseClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return DeleteAasEbcCourseClassResponse::fromMap($this->doRequest("1.0", "baas.ebc.course.class.delete", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员
     * @param DeleteAasEbcCourseUserRequest $request
     * @return DeleteAasEbcCourseUserResponse
     * @throws \Exception
     */
    public function deleteAasEbcCourseUser(DeleteAasEbcCourseUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->deleteAasEbcCourseUserEx($request, $runtime);
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员
     * @param DeleteAasEbcCourseUserRequest $request
     * @param RuntimeOptions $runtime
     * @return DeleteAasEbcCourseUserResponse
     * @throws \Exception
     */
    public function deleteAasEbcCourseUserEx(DeleteAasEbcCourseUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return DeleteAasEbcCourseUserResponse::fromMap($this->doRequest("1.0", "baas.ebc.course.user.delete", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书
     * @param CreateAasEbcUserCertRequest $request
     * @return CreateAasEbcUserCertResponse
     * @throws \Exception
     */
    public function createAasEbcUserCert(CreateAasEbcUserCertRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasEbcUserCertEx($request, $runtime);
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书
     * @param CreateAasEbcUserCertRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasEbcUserCertResponse
     * @throws \Exception
     */
    public function createAasEbcUserCertEx(CreateAasEbcUserCertRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasEbcUserCertResponse::fromMap($this->doRequest("1.0", "baas.ebc.user.cert.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新证书
     * Summary: 更新证书
     * @param UpdateAasEbcUserCertRequest $request
     * @return UpdateAasEbcUserCertResponse
     * @throws \Exception
     */
    public function updateAasEbcUserCert(UpdateAasEbcUserCertRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasEbcUserCertEx($request, $runtime);
    }

    /**
     * Description: 更新证书
     * Summary: 更新证书
     * @param UpdateAasEbcUserCertRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasEbcUserCertResponse
     * @throws \Exception
     */
    public function updateAasEbcUserCertEx(UpdateAasEbcUserCertRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasEbcUserCertResponse::fromMap($this->doRequest("1.0", "baas.ebc.user.cert.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书
     * @param QueryAasEbcOrganizationCertRequest $request
     * @return QueryAasEbcOrganizationCertResponse
     * @throws \Exception
     */
    public function queryAasEbcOrganizationCert(QueryAasEbcOrganizationCertRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasEbcOrganizationCertEx($request, $runtime);
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书
     * @param QueryAasEbcOrganizationCertRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasEbcOrganizationCertResponse
     * @throws \Exception
     */
    public function queryAasEbcOrganizationCertEx(QueryAasEbcOrganizationCertRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasEbcOrganizationCertResponse::fromMap($this->doRequest("1.0", "baas.ebc.organization.cert.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书
     * @param QueryAasEbcUserCertRequest $request
     * @return QueryAasEbcUserCertResponse
     * @throws \Exception
     */
    public function queryAasEbcUserCert(QueryAasEbcUserCertRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasEbcUserCertEx($request, $runtime);
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书
     * @param QueryAasEbcUserCertRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasEbcUserCertResponse
     * @throws \Exception
     */
    public function queryAasEbcUserCertEx(QueryAasEbcUserCertRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasEbcUserCertResponse::fromMap($this->doRequest("1.0", "baas.ebc.user.cert.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询
     * @param QueryAasEbcCertRequest $request
     * @return QueryAasEbcCertResponse
     * @throws \Exception
     */
    public function queryAasEbcCert(QueryAasEbcCertRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasEbcCertEx($request, $runtime);
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询
     * @param QueryAasEbcCertRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasEbcCertResponse
     * @throws \Exception
     */
    public function queryAasEbcCertEx(QueryAasEbcCertRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasEbcCertResponse::fromMap($this->doRequest("1.0", "baas.ebc.cert.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
     * 证书已发布则会返回证书图片、证书其他信息的文件上传url。
     * 文件最大5M
     * Summary: 申请证书信息上传url
     * @param ApplyAasEbcCertUrlRequest $request
     * @return ApplyAasEbcCertUrlResponse
     * @throws \Exception
     */
    public function applyAasEbcCertUrl(ApplyAasEbcCertUrlRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->applyAasEbcCertUrlEx($request, $runtime);
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
     * 证书已发布则会返回证书图片、证书其他信息的文件上传url。
     * 文件最大5M
     * Summary: 申请证书信息上传url
     * @param ApplyAasEbcCertUrlRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyAasEbcCertUrlResponse
     * @throws \Exception
     */
    public function applyAasEbcCertUrlEx(ApplyAasEbcCertUrlRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ApplyAasEbcCertUrlResponse::fromMap($this->doRequest("1.0", "baas.ebc.cert.url.apply", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 新增授权关系，仅限联盟管理员调用
     * Summary: 新增授权关系
     * @param CreateAasEbcAuthRequest $request
     * @return CreateAasEbcAuthResponse
     * @throws \Exception
     */
    public function createAasEbcAuth(CreateAasEbcAuthRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createAasEbcAuthEx($request, $runtime);
    }

    /**
     * Description: 新增授权关系，仅限联盟管理员调用
     * Summary: 新增授权关系
     * @param CreateAasEbcAuthRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateAasEbcAuthResponse
     * @throws \Exception
     */
    public function createAasEbcAuthEx(CreateAasEbcAuthRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateAasEbcAuthResponse::fromMap($this->doRequest("1.0", "baas.ebc.auth.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新授权关系，仅限联盟管理员调用
     * Summary: 更新授权关系
     * @param UpdateAasEbcAuthRequest $request
     * @return UpdateAasEbcAuthResponse
     * @throws \Exception
     */
    public function updateAasEbcAuth(UpdateAasEbcAuthRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasEbcAuthEx($request, $runtime);
    }

    /**
     * Description: 更新授权关系，仅限联盟管理员调用
     * Summary: 更新授权关系
     * @param UpdateAasEbcAuthRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasEbcAuthResponse
     * @throws \Exception
     */
    public function updateAasEbcAuthEx(UpdateAasEbcAuthRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasEbcAuthResponse::fromMap($this->doRequest("1.0", "baas.ebc.auth.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新授权关系状态，仅限联盟管理员调用
     * Summary: 更新授权关系状态
     * @param UpdateAasEbcAuthStatusRequest $request
     * @return UpdateAasEbcAuthStatusResponse
     * @throws \Exception
     */
    public function updateAasEbcAuthStatus(UpdateAasEbcAuthStatusRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasEbcAuthStatusEx($request, $runtime);
    }

    /**
     * Description: 更新授权关系状态，仅限联盟管理员调用
     * Summary: 更新授权关系状态
     * @param UpdateAasEbcAuthStatusRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasEbcAuthStatusResponse
     * @throws \Exception
     */
    public function updateAasEbcAuthStatusEx(UpdateAasEbcAuthStatusRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasEbcAuthStatusResponse::fromMap($this->doRequest("1.0", "baas.ebc.auth.status.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新数据价值
     * Summary: 更新数据价值
     * @param UpdateAasEbcDataPriceRequest $request
     * @return UpdateAasEbcDataPriceResponse
     * @throws \Exception
     */
    public function updateAasEbcDataPrice(UpdateAasEbcDataPriceRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateAasEbcDataPriceEx($request, $runtime);
    }

    /**
     * Description: 更新数据价值
     * Summary: 更新数据价值
     * @param UpdateAasEbcDataPriceRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateAasEbcDataPriceResponse
     * @throws \Exception
     */
    public function updateAasEbcDataPriceEx(UpdateAasEbcDataPriceRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateAasEbcDataPriceResponse::fromMap($this->doRequest("1.0", "baas.ebc.data.price.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询消费者消费金额
     * Summary: 查询消费者消费金额
     * @param QueryAasEbcConsumptionAmountRequest $request
     * @return QueryAasEbcConsumptionAmountResponse
     * @throws \Exception
     */
    public function queryAasEbcConsumptionAmount(QueryAasEbcConsumptionAmountRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryAasEbcConsumptionAmountEx($request, $runtime);
    }

    /**
     * Description: 查询消费者消费金额
     * Summary: 查询消费者消费金额
     * @param QueryAasEbcConsumptionAmountRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryAasEbcConsumptionAmountResponse
     * @throws \Exception
     */
    public function queryAasEbcConsumptionAmountEx(QueryAasEbcConsumptionAmountRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryAasEbcConsumptionAmountResponse::fromMap($this->doRequest("1.0", "baas.ebc.consumption.amount.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }
}
