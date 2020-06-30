<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC;

use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Response;
use AntChain\Alipay\Util\Util;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;

use AntChain\EBC\Models\Config;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\EBC\Models\DeleteCourseClassRequest;
use AntChain\EBC\Models\DeleteCourseClassResponse;
use AntChain\EBC\Models\ApplyCertUrlRequest;
use AntChain\EBC\Models\ApplyCertUrlResponse;
use AntChain\EBC\Models\AddCourseClassRequest;
use AntChain\EBC\Models\AddCourseClassResponse;
use AntChain\EBC\Models\AddClassUserRequest;
use AntChain\EBC\Models\AddClassUserResponse;
use AntChain\EBC\Models\QueryOrganizationCertRequest;
use AntChain\EBC\Models\QueryOrganizationCertResponse;
use AntChain\EBC\Models\AddCourseUserRequest;
use AntChain\EBC\Models\AddCourseUserResponse;
use AntChain\EBC\Models\DeleteCourseUserRequest;
use AntChain\EBC\Models\DeleteCourseUserResponse;
use AntChain\EBC\Models\CreateOrganizationClassRequest;
use AntChain\EBC\Models\CreateOrganizationClassResponse;
use AntChain\EBC\Models\QueryClassUserRequest;
use AntChain\EBC\Models\QueryClassUserResponse;
use AntChain\EBC\Models\QueryCertRequest;
use AntChain\EBC\Models\QueryCertResponse;
use AntChain\EBC\Models\UpdateOrganizationCourseRequest;
use AntChain\EBC\Models\UpdateOrganizationCourseResponse;
use AntChain\EBC\Models\CancelPersonRequest;
use AntChain\EBC\Models\CancelPersonResponse;
use AntChain\EBC\Models\CreateUserCertRequest;
use AntChain\EBC\Models\CreateUserCertResponse;
use AntChain\EBC\Models\DeleteClassUserRequest;
use AntChain\EBC\Models\DeleteClassUserResponse;
use AntChain\EBC\Models\CreatePersonRequest;
use AntChain\EBC\Models\CreatePersonResponse;
use AntChain\EBC\Models\ResumePersonRequest;
use AntChain\EBC\Models\ResumePersonResponse;
use AntChain\EBC\Models\QueryOrganizationClassRequest;
use AntChain\EBC\Models\QueryOrganizationClassResponse;
use AntChain\EBC\Models\UpdateOrganizationClassRequest;
use AntChain\EBC\Models\UpdateOrganizationClassResponse;
use AntChain\EBC\Models\QueryUserCertRequest;
use AntChain\EBC\Models\QueryUserCertResponse;
use AntChain\EBC\Models\CreateOrganizationCourseRequest;
use AntChain\EBC\Models\CreateOrganizationCourseResponse;
use AntChain\EBC\Models\CreateOrganizationRequest;
use AntChain\EBC\Models\CreateOrganizationResponse;
use AntChain\EBC\Models\CreateOrganizationUserRequest;
use AntChain\EBC\Models\CreateOrganizationUserResponse;

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

    protected $_authToken;

    protected $_tenant;

    protected $_workspace;

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
        $this->_tenant = $config->tenant;
        $this->_workspace = $config->workspace;
        $this->_endpoint = $config->endpoint;
        $this->_authToken = $config->authToken;
        $this->_protocol = $config->protocol;
        $this->_regionId = $config->regionId;
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
     * @param string $action api name
     * @param string $protocol http or https
     * @param string $method e.g. GET
     * @param string $pathname pathname of every api
     * @param object $request which contains request params
     * @param RuntimeOptions $runtime which controls some details of call api, such as retry times
     * @return object|array response
     * @throws \Exception
     */
    public function doRequest($action, $protocol, $method, $pathname, $request, RuntimeOptions $runtime){
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
                    "version" => "1.0",
                    "sign_type" => "HmacSHA1",
                    "req_time" => Util::getTimestamp(),
                    "req_msg_id" => Utils::getNonce()
                    ];
                if (!Utils::empty_($this->_tenant)) {
                    $_request->query["tenant"] = $this->_tenant;
                }
                if (!Utils::empty_($this->_workspace)) {
                    $_request->query["workspace"] = $this->_workspace;
                }
                if (!Utils::empty_($this->_authToken)) {
                    $_request->query["auth_token"] = $this->_authToken;
                }
                else {
                    $_request->query["access_key"] = $this->_accessKeyId;
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
                $_request->query["sign"] = Util::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest = $_request;
                $_response= Tea::send($_request, $_runtime);
                $obj = Utils::readAsJSON($_response->body);
                $res = Utils::assertAsMap($obj);
                $resp = Utils::assertAsMap($res["response"]);
                if (Util::hasError($res)) {
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
        $userAgent = Utils::getUserAgent($this->_userAgent);
        return $userAgent;
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级
     * @param DeleteCourseClassRequest $request
     * @return DeleteCourseClassResponse
     * @throws \Exception
     */
    public function deleteCourseClass(DeleteCourseClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->deleteCourseClassEx($request, $runtime);
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级
     * @param DeleteCourseClassRequest $request
     * @param RuntimeOptions $runtime
     * @return DeleteCourseClassResponse
     * @throws \Exception
     */
    public function deleteCourseClassEx(DeleteCourseClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return DeleteCourseClassResponse::fromMap($this->doRequest("baas.ebc.course.class.delete", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
     * 证书已发布则会返回证书图片、证书其他信息的文件上传url。
     * 文件最大5M
     * Summary: 申请证书信息上传url
     * @param ApplyCertUrlRequest $request
     * @return ApplyCertUrlResponse
     * @throws \Exception
     */
    public function applyCertUrl(ApplyCertUrlRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->applyCertUrlEx($request, $runtime);
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
     * 证书已发布则会返回证书图片、证书其他信息的文件上传url。
     * 文件最大5M
     * Summary: 申请证书信息上传url
     * @param ApplyCertUrlRequest $request
     * @param RuntimeOptions $runtime
     * @return ApplyCertUrlResponse
     * @throws \Exception
     */
    public function applyCertUrlEx(ApplyCertUrlRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ApplyCertUrlResponse::fromMap($this->doRequest("baas.ebc.cert.url.apply", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级
     * @param AddCourseClassRequest $request
     * @return AddCourseClassResponse
     * @throws \Exception
     */
    public function addCourseClass(AddCourseClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->addCourseClassEx($request, $runtime);
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级
     * @param AddCourseClassRequest $request
     * @param RuntimeOptions $runtime
     * @return AddCourseClassResponse
     * @throws \Exception
     */
    public function addCourseClassEx(AddCourseClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AddCourseClassResponse::fromMap($this->doRequest("baas.ebc.course.class.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员
     * @param AddClassUserRequest $request
     * @return AddClassUserResponse
     * @throws \Exception
     */
    public function addClassUser(AddClassUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->addClassUserEx($request, $runtime);
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员
     * @param AddClassUserRequest $request
     * @param RuntimeOptions $runtime
     * @return AddClassUserResponse
     * @throws \Exception
     */
    public function addClassUserEx(AddClassUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AddClassUserResponse::fromMap($this->doRequest("baas.ebc.class.user.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书
     * @param QueryOrganizationCertRequest $request
     * @return QueryOrganizationCertResponse
     * @throws \Exception
     */
    public function queryOrganizationCert(QueryOrganizationCertRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryOrganizationCertEx($request, $runtime);
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书
     * @param QueryOrganizationCertRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryOrganizationCertResponse
     * @throws \Exception
     */
    public function queryOrganizationCertEx(QueryOrganizationCertRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryOrganizationCertResponse::fromMap($this->doRequest("baas.ebc.organization.cert.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员
     * @param AddCourseUserRequest $request
     * @return AddCourseUserResponse
     * @throws \Exception
     */
    public function addCourseUser(AddCourseUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->addCourseUserEx($request, $runtime);
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员
     * @param AddCourseUserRequest $request
     * @param RuntimeOptions $runtime
     * @return AddCourseUserResponse
     * @throws \Exception
     */
    public function addCourseUserEx(AddCourseUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return AddCourseUserResponse::fromMap($this->doRequest("baas.ebc.course.user.add", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员
     * @param DeleteCourseUserRequest $request
     * @return DeleteCourseUserResponse
     * @throws \Exception
     */
    public function deleteCourseUser(DeleteCourseUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->deleteCourseUserEx($request, $runtime);
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员
     * @param DeleteCourseUserRequest $request
     * @param RuntimeOptions $runtime
     * @return DeleteCourseUserResponse
     * @throws \Exception
     */
    public function deleteCourseUserEx(DeleteCourseUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return DeleteCourseUserResponse::fromMap($this->doRequest("baas.ebc.course.user.delete", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级
     * @param CreateOrganizationClassRequest $request
     * @return CreateOrganizationClassResponse
     * @throws \Exception
     */
    public function createOrganizationClass(CreateOrganizationClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createOrganizationClassEx($request, $runtime);
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级
     * @param CreateOrganizationClassRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateOrganizationClassResponse
     * @throws \Exception
     */
    public function createOrganizationClassEx(CreateOrganizationClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateOrganizationClassResponse::fromMap($this->doRequest("baas.ebc.organization.class.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询
     * @param QueryClassUserRequest $request
     * @return QueryClassUserResponse
     * @throws \Exception
     */
    public function queryClassUser(QueryClassUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryClassUserEx($request, $runtime);
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询
     * @param QueryClassUserRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryClassUserResponse
     * @throws \Exception
     */
    public function queryClassUserEx(QueryClassUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryClassUserResponse::fromMap($this->doRequest("baas.ebc.class.user.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询
     * @param QueryCertRequest $request
     * @return QueryCertResponse
     * @throws \Exception
     */
    public function queryCert(QueryCertRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryCertEx($request, $runtime);
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询
     * @param QueryCertRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryCertResponse
     * @throws \Exception
     */
    public function queryCertEx(QueryCertRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryCertResponse::fromMap($this->doRequest("baas.ebc.cert.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程
     * @param UpdateOrganizationCourseRequest $request
     * @return UpdateOrganizationCourseResponse
     * @throws \Exception
     */
    public function updateOrganizationCourse(UpdateOrganizationCourseRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateOrganizationCourseEx($request, $runtime);
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程
     * @param UpdateOrganizationCourseRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateOrganizationCourseResponse
     * @throws \Exception
     */
    public function updateOrganizationCourseEx(UpdateOrganizationCourseRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateOrganizationCourseResponse::fromMap($this->doRequest("baas.ebc.organization.course.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出
     * @param CancelPersonRequest $request
     * @return CancelPersonResponse
     * @throws \Exception
     */
    public function cancelPerson(CancelPersonRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->cancelPersonEx($request, $runtime);
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出
     * @param CancelPersonRequest $request
     * @param RuntimeOptions $runtime
     * @return CancelPersonResponse
     * @throws \Exception
     */
    public function cancelPersonEx(CancelPersonRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CancelPersonResponse::fromMap($this->doRequest("baas.ebc.person.cancel", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书
     * @param CreateUserCertRequest $request
     * @return CreateUserCertResponse
     * @throws \Exception
     */
    public function createUserCert(CreateUserCertRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createUserCertEx($request, $runtime);
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书
     * @param CreateUserCertRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateUserCertResponse
     * @throws \Exception
     */
    public function createUserCertEx(CreateUserCertRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateUserCertResponse::fromMap($this->doRequest("baas.ebc.user.cert.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员
     * @param DeleteClassUserRequest $request
     * @return DeleteClassUserResponse
     * @throws \Exception
     */
    public function deleteClassUser(DeleteClassUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->deleteClassUserEx($request, $runtime);
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员
     * @param DeleteClassUserRequest $request
     * @param RuntimeOptions $runtime
     * @return DeleteClassUserResponse
     * @throws \Exception
     */
    public function deleteClassUserEx(DeleteClassUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return DeleteClassUserResponse::fromMap($this->doRequest("baas.ebc.class.user.delete", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人
     * @param CreatePersonRequest $request
     * @return CreatePersonResponse
     * @throws \Exception
     */
    public function createPerson(CreatePersonRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createPersonEx($request, $runtime);
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人
     * @param CreatePersonRequest $request
     * @param RuntimeOptions $runtime
     * @return CreatePersonResponse
     * @throws \Exception
     */
    public function createPersonEx(CreatePersonRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreatePersonResponse::fromMap($this->doRequest("baas.ebc.person.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入
     * @param ResumePersonRequest $request
     * @return ResumePersonResponse
     * @throws \Exception
     */
    public function resumePerson(ResumePersonRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->resumePersonEx($request, $runtime);
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入
     * @param ResumePersonRequest $request
     * @param RuntimeOptions $runtime
     * @return ResumePersonResponse
     * @throws \Exception
     */
    public function resumePersonEx(ResumePersonRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return ResumePersonResponse::fromMap($this->doRequest("baas.ebc.person.resume", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询
     * @param QueryOrganizationClassRequest $request
     * @return QueryOrganizationClassResponse
     * @throws \Exception
     */
    public function queryOrganizationClass(QueryOrganizationClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryOrganizationClassEx($request, $runtime);
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询
     * @param QueryOrganizationClassRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryOrganizationClassResponse
     * @throws \Exception
     */
    public function queryOrganizationClassEx(QueryOrganizationClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryOrganizationClassResponse::fromMap($this->doRequest("baas.ebc.organization.class.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级
     * @param UpdateOrganizationClassRequest $request
     * @return UpdateOrganizationClassResponse
     * @throws \Exception
     */
    public function updateOrganizationClass(UpdateOrganizationClassRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->updateOrganizationClassEx($request, $runtime);
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级
     * @param UpdateOrganizationClassRequest $request
     * @param RuntimeOptions $runtime
     * @return UpdateOrganizationClassResponse
     * @throws \Exception
     */
    public function updateOrganizationClassEx(UpdateOrganizationClassRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return UpdateOrganizationClassResponse::fromMap($this->doRequest("baas.ebc.organization.class.update", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书
     * @param QueryUserCertRequest $request
     * @return QueryUserCertResponse
     * @throws \Exception
     */
    public function queryUserCert(QueryUserCertRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->queryUserCertEx($request, $runtime);
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书
     * @param QueryUserCertRequest $request
     * @param RuntimeOptions $runtime
     * @return QueryUserCertResponse
     * @throws \Exception
     */
    public function queryUserCertEx(QueryUserCertRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return QueryUserCertResponse::fromMap($this->doRequest("baas.ebc.user.cert.query", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程
     * @param CreateOrganizationCourseRequest $request
     * @return CreateOrganizationCourseResponse
     * @throws \Exception
     */
    public function createOrganizationCourse(CreateOrganizationCourseRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createOrganizationCourseEx($request, $runtime);
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程
     * @param CreateOrganizationCourseRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateOrganizationCourseResponse
     * @throws \Exception
     */
    public function createOrganizationCourseEx(CreateOrganizationCourseRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateOrganizationCourseResponse::fromMap($this->doRequest("baas.ebc.organization.course.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业
     * @param CreateOrganizationRequest $request
     * @return CreateOrganizationResponse
     * @throws \Exception
     */
    public function createOrganization(CreateOrganizationRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createOrganizationEx($request, $runtime);
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业
     * @param CreateOrganizationRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateOrganizationResponse
     * @throws \Exception
     */
    public function createOrganizationEx(CreateOrganizationRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateOrganizationResponse::fromMap($this->doRequest("baas.ebc.organization.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册
     * @param CreateOrganizationUserRequest $request
     * @return CreateOrganizationUserResponse
     * @throws \Exception
     */
    public function createOrganizationUser(CreateOrganizationUserRequest $request){
        $runtime = new RuntimeOptions([]);
        return $this->createOrganizationUserEx($request, $runtime);
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册
     * @param CreateOrganizationUserRequest $request
     * @param RuntimeOptions $runtime
     * @return CreateOrganizationUserResponse
     * @throws \Exception
     */
    public function createOrganizationUserEx(CreateOrganizationUserRequest $request, RuntimeOptions $runtime){
        Utils::validateModel($request);
        return CreateOrganizationUserResponse::fromMap($this->doRequest("baas.ebc.organization.user.create", "HTTPS", "POST", "/gateway.do", $request, $runtime));
    }
}
