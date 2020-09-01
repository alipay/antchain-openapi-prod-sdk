<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EBC;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\EBC\Models\AddBaasEbcClassUserRequest;
use AntChain\EBC\Models\AddBaasEbcClassUserResponse;
use AntChain\EBC\Models\AddBaasEbcCourseClassRequest;
use AntChain\EBC\Models\AddBaasEbcCourseClassResponse;
use AntChain\EBC\Models\AddBaasEbcCourseUserRequest;
use AntChain\EBC\Models\AddBaasEbcCourseUserResponse;
use AntChain\EBC\Models\ApplyBaasEbcCertUrlRequest;
use AntChain\EBC\Models\ApplyBaasEbcCertUrlResponse;
use AntChain\EBC\Models\CancelBaasEbcPersonRequest;
use AntChain\EBC\Models\CancelBaasEbcPersonResponse;
use AntChain\EBC\Models\Config;
use AntChain\EBC\Models\CreateBaasEbcAuthRequest;
use AntChain\EBC\Models\CreateBaasEbcAuthResponse;
use AntChain\EBC\Models\CreateBaasEbcOrganizationClassRequest;
use AntChain\EBC\Models\CreateBaasEbcOrganizationClassResponse;
use AntChain\EBC\Models\CreateBaasEbcOrganizationCourseRequest;
use AntChain\EBC\Models\CreateBaasEbcOrganizationCourseResponse;
use AntChain\EBC\Models\CreateBaasEbcOrganizationRequest;
use AntChain\EBC\Models\CreateBaasEbcOrganizationResponse;
use AntChain\EBC\Models\CreateBaasEbcOrganizationUserRequest;
use AntChain\EBC\Models\CreateBaasEbcOrganizationUserResponse;
use AntChain\EBC\Models\CreateBaasEbcPersonRequest;
use AntChain\EBC\Models\CreateBaasEbcPersonResponse;
use AntChain\EBC\Models\CreateBaasEbcUserCertRequest;
use AntChain\EBC\Models\CreateBaasEbcUserCertResponse;
use AntChain\EBC\Models\DeleteBaasEbcClassUserRequest;
use AntChain\EBC\Models\DeleteBaasEbcClassUserResponse;
use AntChain\EBC\Models\DeleteBaasEbcCourseClassRequest;
use AntChain\EBC\Models\DeleteBaasEbcCourseClassResponse;
use AntChain\EBC\Models\DeleteBaasEbcCourseUserRequest;
use AntChain\EBC\Models\DeleteBaasEbcCourseUserResponse;
use AntChain\EBC\Models\QueryBaasEbcCertRequest;
use AntChain\EBC\Models\QueryBaasEbcCertResponse;
use AntChain\EBC\Models\QueryBaasEbcClassUserRequest;
use AntChain\EBC\Models\QueryBaasEbcClassUserResponse;
use AntChain\EBC\Models\QueryBaasEbcConsumptionAmountRequest;
use AntChain\EBC\Models\QueryBaasEbcConsumptionAmountResponse;
use AntChain\EBC\Models\QueryBaasEbcOrganizationCertRequest;
use AntChain\EBC\Models\QueryBaasEbcOrganizationCertResponse;
use AntChain\EBC\Models\QueryBaasEbcOrganizationClassRequest;
use AntChain\EBC\Models\QueryBaasEbcOrganizationClassResponse;
use AntChain\EBC\Models\QueryBaasEbcUserCertRequest;
use AntChain\EBC\Models\QueryBaasEbcUserCertResponse;
use AntChain\EBC\Models\ResumeBaasEbcPersonRequest;
use AntChain\EBC\Models\ResumeBaasEbcPersonResponse;
use AntChain\EBC\Models\UpdateBaasEbcAuthRequest;
use AntChain\EBC\Models\UpdateBaasEbcAuthResponse;
use AntChain\EBC\Models\UpdateBaasEbcAuthStatusRequest;
use AntChain\EBC\Models\UpdateBaasEbcAuthStatusResponse;
use AntChain\EBC\Models\UpdateBaasEbcDataPriceRequest;
use AntChain\EBC\Models\UpdateBaasEbcDataPriceResponse;
use AntChain\EBC\Models\UpdateBaasEbcOrganizationClassRequest;
use AntChain\EBC\Models\UpdateBaasEbcOrganizationClassResponse;
use AntChain\EBC\Models\UpdateBaasEbcOrganizationCourseRequest;
use AntChain\EBC\Models\UpdateBaasEbcOrganizationCourseResponse;
use AntChain\EBC\Models\UpdateBaasEbcUserCertRequest;
use AntChain\EBC\Models\UpdateBaasEbcUserCertResponse;
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
        $this->_accessKeyId     = $config->accessKeyId;
        $this->_accessKeySecret = $config->accessKeySecret;
        $this->_securityToken   = $config->securityToken;
        $this->_endpoint        = $config->endpoint;
        $this->_protocol        = $config->protocol;
        $this->_userAgent       = $config->userAgent;
        $this->_readTimeout     = $config->readTimeout;
        $this->_connectTimeout  = $config->connectTimeout;
        $this->_httpProxy       = $config->httpProxy;
        $this->_httpsProxy      = $config->httpsProxy;
        $this->_noProxy         = $config->noProxy;
        $this->_socks5Proxy     = $config->socks5Proxy;
        $this->_socks5NetWork   = $config->socks5NetWork;
        $this->_maxIdleConns    = $config->maxIdleConns;
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
     * @param RuntimeOptions $runtime  which controls some details of call api, such as retry times
     *
     * @throws TeaError
     * @throws Exception
     * @throws TeaUnableRetryError
     *
     * @return array the response
     */
    public function doRequest($version, $action, $protocol, $method, $pathname, $request, $runtime)
    {
        $runtime->validate();
        $_runtime = [
            'timeouted'      => 'retry',
            'readTimeout'    => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            'connectTimeout' => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            'httpProxy'      => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            'httpsProxy'     => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            'noProxy'        => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            'maxIdleConns'   => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            'retry'          => [
                'retryable'   => $runtime->autoretry,
                'maxAttempts' => Utils::defaultNumber($runtime->maxAttempts, 3),
            ],
            'backoff' => [
                'policy' => Utils::defaultString($runtime->backoffPolicy, 'no'),
                'period' => Utils::defaultNumber($runtime->backoffPeriod, 1),
            ],
            'ignoreSSL' => $runtime->ignoreSSL,
        ];
        $_lastRequest   = null;
        $_lastException = null;
        $_now           = time();
        $_retryTimes    = 0;
        while (Tea::allowRetry($_runtime['retry'], $_retryTimes, $_now)) {
            if ($_retryTimes > 0) {
                $_backoffTime = Tea::getBackoffTime($_runtime['backoff'], $_retryTimes);
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
                    'method'         => $action,
                    'version'        => $version,
                    'sign_type'      => 'HmacSHA1',
                    'req_time'       => UtilClient::getTimestamp(),
                    'req_msg_id'     => Utils::getNonce(),
                    'access_key'     => $this->_accessKeyId,
                    'charset'        => 'UTF-8',
                    'baseSdkVersion' => 'Tea-SDK',
                    'sdkVersion'     => 'Tea-SDK-20200825',
                ];
                if (!Utils::empty_($this->_securityToken)) {
                    $_request->query['security_token'] = $this->_securityToken;
                }
                $_request->headers = [
                    'host'       => $this->_endpoint,
                    'user-agent' => $this->getUserAgent(),
                ];
                $tmp                               = Utils::anyifyMapValue(RpcUtils::query($request));
                $_request->body                    = Utils::toFormString($tmp);
                $_request->headers['content-type'] = 'application/x-www-form-urlencoded';
                $signedParam                       = Tea::merge($_request->query, RpcUtils::query($request));
                $_request->query['sign']           = UtilClient::getSignature($signedParam, $this->_accessKeySecret);
                $_lastRequest                      = $_request;
                $_response                         = Tea::send($_request, $_runtime);
                $obj                               = Utils::readAsJSON($_response->body);
                $res                               = Utils::assertAsMap($obj);
                $resp                              = Utils::assertAsMap($res['response']);
                if (UtilClient::hasError($res)) {
                    throw new TeaError([
                        'message' => $resp['result_msg'],
                        'data'    => $resp,
                        'code'    => $resp['result_code'],
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
     * Get user agent.
     *
     * @return string user agent
     */
    public function getUserAgent()
    {
        $userAgent = 'TeaClient/1.0.0';

        return Utils::getUserAgent($userAgent);
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业.
     *
     * @param CreateBaasEbcOrganizationRequest $request
     *
     * @return CreateBaasEbcOrganizationResponse
     */
    public function createBaasEbcOrganization($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->createBaasEbcOrganizationEx($request, $runtime);
    }

    /**
     * Description: 创建企业
     * Summary: 创建企业.
     *
     * @param CreateBaasEbcOrganizationRequest $request
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateBaasEbcOrganizationResponse
     */
    public function createBaasEbcOrganizationEx($request, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasEbcOrganizationResponse::fromMap($this->doRequest('1.0', 'baas.ebc.organization.create', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人.
     *
     * @param CreateBaasEbcPersonRequest $request
     *
     * @return CreateBaasEbcPersonResponse
     */
    public function createBaasEbcPerson($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->createBaasEbcPersonEx($request, $runtime);
    }

    /**
     * Description: 创建个人
     * Summary: 创建个人.
     *
     * @param CreateBaasEbcPersonRequest $request
     * @param RuntimeOptions             $runtime
     *
     * @return CreateBaasEbcPersonResponse
     */
    public function createBaasEbcPersonEx($request, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasEbcPersonResponse::fromMap($this->doRequest('1.0', 'baas.ebc.person.create', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册.
     *
     * @param CreateBaasEbcOrganizationUserRequest $request
     *
     * @return CreateBaasEbcOrganizationUserResponse
     */
    public function createBaasEbcOrganizationUser($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->createBaasEbcOrganizationUserEx($request, $runtime);
    }

    /**
     * Description: 企业用户注册
     * Summary: 企业用户注册.
     *
     * @param CreateBaasEbcOrganizationUserRequest $request
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateBaasEbcOrganizationUserResponse
     */
    public function createBaasEbcOrganizationUserEx($request, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasEbcOrganizationUserResponse::fromMap($this->doRequest('1.0', 'baas.ebc.organization.user.create', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出.
     *
     * @param CancelBaasEbcPersonRequest $request
     *
     * @return CancelBaasEbcPersonResponse
     */
    public function cancelBaasEbcPerson($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->cancelBaasEbcPersonEx($request, $runtime);
    }

    /**
     * Description: 个人退出
     * Summary: 个人退出.
     *
     * @param CancelBaasEbcPersonRequest $request
     * @param RuntimeOptions             $runtime
     *
     * @return CancelBaasEbcPersonResponse
     */
    public function cancelBaasEbcPersonEx($request, $runtime)
    {
        Utils::validateModel($request);

        return CancelBaasEbcPersonResponse::fromMap($this->doRequest('1.0', 'baas.ebc.person.cancel', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入.
     *
     * @param ResumeBaasEbcPersonRequest $request
     *
     * @return ResumeBaasEbcPersonResponse
     */
    public function resumeBaasEbcPerson($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->resumeBaasEbcPersonEx($request, $runtime);
    }

    /**
     * Description: 用户复入
     * Summary: 用户复入.
     *
     * @param ResumeBaasEbcPersonRequest $request
     * @param RuntimeOptions             $runtime
     *
     * @return ResumeBaasEbcPersonResponse
     */
    public function resumeBaasEbcPersonEx($request, $runtime)
    {
        Utils::validateModel($request);

        return ResumeBaasEbcPersonResponse::fromMap($this->doRequest('1.0', 'baas.ebc.person.resume', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级.
     *
     * @param CreateBaasEbcOrganizationClassRequest $request
     *
     * @return CreateBaasEbcOrganizationClassResponse
     */
    public function createBaasEbcOrganizationClass($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->createBaasEbcOrganizationClassEx($request, $runtime);
    }

    /**
     * Description: 创建班级
     * Summary: 创建班级.
     *
     * @param CreateBaasEbcOrganizationClassRequest $request
     * @param RuntimeOptions                        $runtime
     *
     * @return CreateBaasEbcOrganizationClassResponse
     */
    public function createBaasEbcOrganizationClassEx($request, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasEbcOrganizationClassResponse::fromMap($this->doRequest('1.0', 'baas.ebc.organization.class.create', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级.
     *
     * @param UpdateBaasEbcOrganizationClassRequest $request
     *
     * @return UpdateBaasEbcOrganizationClassResponse
     */
    public function updateBaasEbcOrganizationClass($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->updateBaasEbcOrganizationClassEx($request, $runtime);
    }

    /**
     * Description: 更新班级
     * Summary: 更新班级.
     *
     * @param UpdateBaasEbcOrganizationClassRequest $request
     * @param RuntimeOptions                        $runtime
     *
     * @return UpdateBaasEbcOrganizationClassResponse
     */
    public function updateBaasEbcOrganizationClassEx($request, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasEbcOrganizationClassResponse::fromMap($this->doRequest('1.0', 'baas.ebc.organization.class.update', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员.
     *
     * @param AddBaasEbcClassUserRequest $request
     *
     * @return AddBaasEbcClassUserResponse
     */
    public function addBaasEbcClassUser($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->addBaasEbcClassUserEx($request, $runtime);
    }

    /**
     * Description: 增加学员
     * Summary: 增加学员.
     *
     * @param AddBaasEbcClassUserRequest $request
     * @param RuntimeOptions             $runtime
     *
     * @return AddBaasEbcClassUserResponse
     */
    public function addBaasEbcClassUserEx($request, $runtime)
    {
        Utils::validateModel($request);

        return AddBaasEbcClassUserResponse::fromMap($this->doRequest('1.0', 'baas.ebc.class.user.add', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员.
     *
     * @param DeleteBaasEbcClassUserRequest $request
     *
     * @return DeleteBaasEbcClassUserResponse
     */
    public function deleteBaasEbcClassUser($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->deleteBaasEbcClassUserEx($request, $runtime);
    }

    /**
     * Description: 删除学员
     * Summary: 删除学员.
     *
     * @param DeleteBaasEbcClassUserRequest $request
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteBaasEbcClassUserResponse
     */
    public function deleteBaasEbcClassUserEx($request, $runtime)
    {
        Utils::validateModel($request);

        return DeleteBaasEbcClassUserResponse::fromMap($this->doRequest('1.0', 'baas.ebc.class.user.delete', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询.
     *
     * @param QueryBaasEbcOrganizationClassRequest $request
     *
     * @return QueryBaasEbcOrganizationClassResponse
     */
    public function queryBaasEbcOrganizationClass($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->queryBaasEbcOrganizationClassEx($request, $runtime);
    }

    /**
     * Description: 班级查询
     * Summary: 班级查询.
     *
     * @param QueryBaasEbcOrganizationClassRequest $request
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryBaasEbcOrganizationClassResponse
     */
    public function queryBaasEbcOrganizationClassEx($request, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasEbcOrganizationClassResponse::fromMap($this->doRequest('1.0', 'baas.ebc.organization.class.query', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询.
     *
     * @param QueryBaasEbcClassUserRequest $request
     *
     * @return QueryBaasEbcClassUserResponse
     */
    public function queryBaasEbcClassUser($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->queryBaasEbcClassUserEx($request, $runtime);
    }

    /**
     * Description: 班级明细查询
     * Summary: 班级明细查询.
     *
     * @param QueryBaasEbcClassUserRequest $request
     * @param RuntimeOptions               $runtime
     *
     * @return QueryBaasEbcClassUserResponse
     */
    public function queryBaasEbcClassUserEx($request, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasEbcClassUserResponse::fromMap($this->doRequest('1.0', 'baas.ebc.class.user.query', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程.
     *
     * @param CreateBaasEbcOrganizationCourseRequest $request
     *
     * @return CreateBaasEbcOrganizationCourseResponse
     */
    public function createBaasEbcOrganizationCourse($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->createBaasEbcOrganizationCourseEx($request, $runtime);
    }

    /**
     * Description: 发布课程
     * Summary: 发布课程.
     *
     * @param CreateBaasEbcOrganizationCourseRequest $request
     * @param RuntimeOptions                         $runtime
     *
     * @return CreateBaasEbcOrganizationCourseResponse
     */
    public function createBaasEbcOrganizationCourseEx($request, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasEbcOrganizationCourseResponse::fromMap($this->doRequest('1.0', 'baas.ebc.organization.course.create', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程.
     *
     * @param UpdateBaasEbcOrganizationCourseRequest $request
     *
     * @return UpdateBaasEbcOrganizationCourseResponse
     */
    public function updateBaasEbcOrganizationCourse($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->updateBaasEbcOrganizationCourseEx($request, $runtime);
    }

    /**
     * Description: 更新课程
     * Summary: 更新课程.
     *
     * @param UpdateBaasEbcOrganizationCourseRequest $request
     * @param RuntimeOptions                         $runtime
     *
     * @return UpdateBaasEbcOrganizationCourseResponse
     */
    public function updateBaasEbcOrganizationCourseEx($request, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasEbcOrganizationCourseResponse::fromMap($this->doRequest('1.0', 'baas.ebc.organization.course.update', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级.
     *
     * @param AddBaasEbcCourseClassRequest $request
     *
     * @return AddBaasEbcCourseClassResponse
     */
    public function addBaasEbcCourseClass($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->addBaasEbcCourseClassEx($request, $runtime);
    }

    /**
     * Description: 将班级添加到课程中
     * Summary: 增加课程班级.
     *
     * @param AddBaasEbcCourseClassRequest $request
     * @param RuntimeOptions               $runtime
     *
     * @return AddBaasEbcCourseClassResponse
     */
    public function addBaasEbcCourseClassEx($request, $runtime)
    {
        Utils::validateModel($request);

        return AddBaasEbcCourseClassResponse::fromMap($this->doRequest('1.0', 'baas.ebc.course.class.add', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员.
     *
     * @param AddBaasEbcCourseUserRequest $request
     *
     * @return AddBaasEbcCourseUserResponse
     */
    public function addBaasEbcCourseUser($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->addBaasEbcCourseUserEx($request, $runtime);
    }

    /**
     * Description: 将学员添加到课程中
     * Summary: 增加课程学员.
     *
     * @param AddBaasEbcCourseUserRequest $request
     * @param RuntimeOptions              $runtime
     *
     * @return AddBaasEbcCourseUserResponse
     */
    public function addBaasEbcCourseUserEx($request, $runtime)
    {
        Utils::validateModel($request);

        return AddBaasEbcCourseUserResponse::fromMap($this->doRequest('1.0', 'baas.ebc.course.user.add', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级.
     *
     * @param DeleteBaasEbcCourseClassRequest $request
     *
     * @return DeleteBaasEbcCourseClassResponse
     */
    public function deleteBaasEbcCourseClass($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->deleteBaasEbcCourseClassEx($request, $runtime);
    }

    /**
     * Description: 删除课程中的班级
     * Summary: 删除课程班级.
     *
     * @param DeleteBaasEbcCourseClassRequest $request
     * @param RuntimeOptions                  $runtime
     *
     * @return DeleteBaasEbcCourseClassResponse
     */
    public function deleteBaasEbcCourseClassEx($request, $runtime)
    {
        Utils::validateModel($request);

        return DeleteBaasEbcCourseClassResponse::fromMap($this->doRequest('1.0', 'baas.ebc.course.class.delete', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员.
     *
     * @param DeleteBaasEbcCourseUserRequest $request
     *
     * @return DeleteBaasEbcCourseUserResponse
     */
    public function deleteBaasEbcCourseUser($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->deleteBaasEbcCourseUserEx($request, $runtime);
    }

    /**
     * Description: 删除课程中的学员
     * Summary: 删除课程学员.
     *
     * @param DeleteBaasEbcCourseUserRequest $request
     * @param RuntimeOptions                 $runtime
     *
     * @return DeleteBaasEbcCourseUserResponse
     */
    public function deleteBaasEbcCourseUserEx($request, $runtime)
    {
        Utils::validateModel($request);

        return DeleteBaasEbcCourseUserResponse::fromMap($this->doRequest('1.0', 'baas.ebc.course.user.delete', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书.
     *
     * @param CreateBaasEbcUserCertRequest $request
     *
     * @return CreateBaasEbcUserCertResponse
     */
    public function createBaasEbcUserCert($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->createBaasEbcUserCertEx($request, $runtime);
    }

    /**
     * Description: 发布证书
     * Summary: 发布证书.
     *
     * @param CreateBaasEbcUserCertRequest $request
     * @param RuntimeOptions               $runtime
     *
     * @return CreateBaasEbcUserCertResponse
     */
    public function createBaasEbcUserCertEx($request, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasEbcUserCertResponse::fromMap($this->doRequest('1.0', 'baas.ebc.user.cert.create', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 更新证书
     * Summary: 更新证书.
     *
     * @param UpdateBaasEbcUserCertRequest $request
     *
     * @return UpdateBaasEbcUserCertResponse
     */
    public function updateBaasEbcUserCert($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->updateBaasEbcUserCertEx($request, $runtime);
    }

    /**
     * Description: 更新证书
     * Summary: 更新证书.
     *
     * @param UpdateBaasEbcUserCertRequest $request
     * @param RuntimeOptions               $runtime
     *
     * @return UpdateBaasEbcUserCertResponse
     */
    public function updateBaasEbcUserCertEx($request, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasEbcUserCertResponse::fromMap($this->doRequest('1.0', 'baas.ebc.user.cert.update', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书.
     *
     * @param QueryBaasEbcOrganizationCertRequest $request
     *
     * @return QueryBaasEbcOrganizationCertResponse
     */
    public function queryBaasEbcOrganizationCert($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->queryBaasEbcOrganizationCertEx($request, $runtime);
    }

    /**
     * Description: 查询证书
     * Summary: 查询企业证书.
     *
     * @param QueryBaasEbcOrganizationCertRequest $request
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryBaasEbcOrganizationCertResponse
     */
    public function queryBaasEbcOrganizationCertEx($request, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasEbcOrganizationCertResponse::fromMap($this->doRequest('1.0', 'baas.ebc.organization.cert.query', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书.
     *
     * @param QueryBaasEbcUserCertRequest $request
     *
     * @return QueryBaasEbcUserCertResponse
     */
    public function queryBaasEbcUserCert($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->queryBaasEbcUserCertEx($request, $runtime);
    }

    /**
     * Description: 查询用户证书
     * Summary: 查询用户证书.
     *
     * @param QueryBaasEbcUserCertRequest $request
     * @param RuntimeOptions              $runtime
     *
     * @return QueryBaasEbcUserCertResponse
     */
    public function queryBaasEbcUserCertEx($request, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasEbcUserCertResponse::fromMap($this->doRequest('1.0', 'baas.ebc.user.cert.query', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询.
     *
     * @param QueryBaasEbcCertRequest $request
     *
     * @return QueryBaasEbcCertResponse
     */
    public function queryBaasEbcCert($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->queryBaasEbcCertEx($request, $runtime);
    }

    /**
     * Description: 证书明细查询
     * Summary: 证书明细查询.
     *
     * @param QueryBaasEbcCertRequest $request
     * @param RuntimeOptions          $runtime
     *
     * @return QueryBaasEbcCertResponse
     */
    public function queryBaasEbcCertEx($request, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasEbcCertResponse::fromMap($this->doRequest('1.0', 'baas.ebc.cert.query', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
     * 证书已发布则会返回证书图片、证书其他信息的文件上传url。
     * 文件最大5M
     * Summary: 申请证书信息上传url.
     *
     * @param ApplyBaasEbcCertUrlRequest $request
     *
     * @return ApplyBaasEbcCertUrlResponse
     */
    public function applyBaasEbcCertUrl($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->applyBaasEbcCertUrlEx($request, $runtime);
    }

    /**
     * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
     * 证书已发布则会返回证书图片、证书其他信息的文件上传url。
     * 文件最大5M
     * Summary: 申请证书信息上传url.
     *
     * @param ApplyBaasEbcCertUrlRequest $request
     * @param RuntimeOptions             $runtime
     *
     * @return ApplyBaasEbcCertUrlResponse
     */
    public function applyBaasEbcCertUrlEx($request, $runtime)
    {
        Utils::validateModel($request);

        return ApplyBaasEbcCertUrlResponse::fromMap($this->doRequest('1.0', 'baas.ebc.cert.url.apply', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 新增授权关系，仅限联盟管理员调用
     * Summary: 新增授权关系.
     *
     * @param CreateBaasEbcAuthRequest $request
     *
     * @return CreateBaasEbcAuthResponse
     */
    public function createBaasEbcAuth($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->createBaasEbcAuthEx($request, $runtime);
    }

    /**
     * Description: 新增授权关系，仅限联盟管理员调用
     * Summary: 新增授权关系.
     *
     * @param CreateBaasEbcAuthRequest $request
     * @param RuntimeOptions           $runtime
     *
     * @return CreateBaasEbcAuthResponse
     */
    public function createBaasEbcAuthEx($request, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasEbcAuthResponse::fromMap($this->doRequest('1.0', 'baas.ebc.auth.create', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 更新授权关系，仅限联盟管理员调用
     * Summary: 更新授权关系.
     *
     * @param UpdateBaasEbcAuthRequest $request
     *
     * @return UpdateBaasEbcAuthResponse
     */
    public function updateBaasEbcAuth($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->updateBaasEbcAuthEx($request, $runtime);
    }

    /**
     * Description: 更新授权关系，仅限联盟管理员调用
     * Summary: 更新授权关系.
     *
     * @param UpdateBaasEbcAuthRequest $request
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateBaasEbcAuthResponse
     */
    public function updateBaasEbcAuthEx($request, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasEbcAuthResponse::fromMap($this->doRequest('1.0', 'baas.ebc.auth.update', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 更新授权关系状态，仅限联盟管理员调用
     * Summary: 更新授权关系状态
     *
     * @param UpdateBaasEbcAuthStatusRequest $request
     *
     * @return UpdateBaasEbcAuthStatusResponse
     */
    public function updateBaasEbcAuthStatus($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->updateBaasEbcAuthStatusEx($request, $runtime);
    }

    /**
     * Description: 更新授权关系状态，仅限联盟管理员调用
     * Summary: 更新授权关系状态
     *
     * @param UpdateBaasEbcAuthStatusRequest $request
     * @param RuntimeOptions                 $runtime
     *
     * @return UpdateBaasEbcAuthStatusResponse
     */
    public function updateBaasEbcAuthStatusEx($request, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasEbcAuthStatusResponse::fromMap($this->doRequest('1.0', 'baas.ebc.auth.status.update', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 更新数据价值
     * Summary: 更新数据价值
     *
     * @param UpdateBaasEbcDataPriceRequest $request
     *
     * @return UpdateBaasEbcDataPriceResponse
     */
    public function updateBaasEbcDataPrice($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->updateBaasEbcDataPriceEx($request, $runtime);
    }

    /**
     * Description: 更新数据价值
     * Summary: 更新数据价值
     *
     * @param UpdateBaasEbcDataPriceRequest $request
     * @param RuntimeOptions                $runtime
     *
     * @return UpdateBaasEbcDataPriceResponse
     */
    public function updateBaasEbcDataPriceEx($request, $runtime)
    {
        Utils::validateModel($request);

        return UpdateBaasEbcDataPriceResponse::fromMap($this->doRequest('1.0', 'baas.ebc.data.price.update', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }

    /**
     * Description: 查询消费者消费金额
     * Summary: 查询消费者消费金额.
     *
     * @param QueryBaasEbcConsumptionAmountRequest $request
     *
     * @return QueryBaasEbcConsumptionAmountResponse
     */
    public function queryBaasEbcConsumptionAmount($request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->queryBaasEbcConsumptionAmountEx($request, $runtime);
    }

    /**
     * Description: 查询消费者消费金额
     * Summary: 查询消费者消费金额.
     *
     * @param QueryBaasEbcConsumptionAmountRequest $request
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryBaasEbcConsumptionAmountResponse
     */
    public function queryBaasEbcConsumptionAmountEx($request, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasEbcConsumptionAmountResponse::fromMap($this->doRequest('1.0', 'baas.ebc.consumption.amount.query', 'HTTPS', 'POST', '/gateway.do', $request, $runtime));
    }
}
