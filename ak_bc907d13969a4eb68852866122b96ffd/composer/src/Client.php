<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\AddItagAntitagUserTntRequest;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\AddItagAntitagUserTntResponse;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\AuthItagAntitagAcmRequest;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\AuthItagAntitagAcmResponse;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\CreateItagAntitagTaskJsonRequest;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\CreateItagAntitagTaskJsonResponse;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\CreateItagAntitagTaskRequestRequest;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\CreateItagAntitagTaskRequestResponse;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\ExportItagAntitagTaskDownloadRequest;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\ExportItagAntitagTaskDownloadResponse;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\QueryItagAntitagTaskDownloadRequest;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\QueryItagAntitagTaskDownloadResponse;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\QueryItagAntitagTaskProcessRequest;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\QueryItagAntitagTaskProcessResponse;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\RegisterItagAntitagUserRequest;
use AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models\RegisterItagAntitagUserResponse;
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
            // MapObject
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
                    'sdk_version'      => '1.0.1',
                    '_prod_code'       => 'ak_bc907d13969a4eb68852866122b96ffd',
                    '_prod_channel'    => 'saas',
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
     * Description: 通过标注平台ID获取Token
     * Summary: 获取Token.
     *
     * @param AuthItagAntitagAcmRequest $request
     *
     * @return AuthItagAntitagAcmResponse
     */
    public function authItagAntitagAcm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authItagAntitagAcmEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过标注平台ID获取Token
     * Summary: 获取Token.
     *
     * @param AuthItagAntitagAcmRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return AuthItagAntitagAcmResponse
     */
    public function authItagAntitagAcmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthItagAntitagAcmResponse::fromMap($this->doRequest('1.0', 'itag.antitag.acm.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建标注任务
     * Summary: 创建标注任务
     *
     * @param CreateItagAntitagTaskRequestRequest $request
     *
     * @return CreateItagAntitagTaskRequestResponse
     */
    public function createItagAntitagTaskRequest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createItagAntitagTaskRequestEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建标注任务
     * Summary: 创建标注任务
     *
     * @param CreateItagAntitagTaskRequestRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return CreateItagAntitagTaskRequestResponse
     */
    public function createItagAntitagTaskRequestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateItagAntitagTaskRequestResponse::fromMap($this->doRequest('1.0', 'itag.antitag.task.request.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 触发数据导出
     * Summary: 触发数据导出.
     *
     * @param ExportItagAntitagTaskDownloadRequest $request
     *
     * @return ExportItagAntitagTaskDownloadResponse
     */
    public function exportItagAntitagTaskDownload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->exportItagAntitagTaskDownloadEx($request, $headers, $runtime);
    }

    /**
     * Description: 触发数据导出
     * Summary: 触发数据导出.
     *
     * @param ExportItagAntitagTaskDownloadRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return ExportItagAntitagTaskDownloadResponse
     */
    public function exportItagAntitagTaskDownloadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExportItagAntitagTaskDownloadResponse::fromMap($this->doRequest('1.0', 'itag.antitag.task.download.export', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 轮询导出进度
     * Summary: 轮询导出进度.
     *
     * @param QueryItagAntitagTaskDownloadRequest $request
     *
     * @return QueryItagAntitagTaskDownloadResponse
     */
    public function queryItagAntitagTaskDownload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryItagAntitagTaskDownloadEx($request, $headers, $runtime);
    }

    /**
     * Description: 轮询导出进度
     * Summary: 轮询导出进度.
     *
     * @param QueryItagAntitagTaskDownloadRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryItagAntitagTaskDownloadResponse
     */
    public function queryItagAntitagTaskDownloadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryItagAntitagTaskDownloadResponse::fromMap($this->doRequest('1.0', 'itag.antitag.task.download.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 任务进度查询
     * Summary: 任务进度查询.
     *
     * @param QueryItagAntitagTaskProcessRequest $request
     *
     * @return QueryItagAntitagTaskProcessResponse
     */
    public function queryItagAntitagTaskProcess($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryItagAntitagTaskProcessEx($request, $headers, $runtime);
    }

    /**
     * Description: 任务进度查询
     * Summary: 任务进度查询.
     *
     * @param QueryItagAntitagTaskProcessRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryItagAntitagTaskProcessResponse
     */
    public function queryItagAntitagTaskProcessEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryItagAntitagTaskProcessResponse::fromMap($this->doRequest('1.0', 'itag.antitag.task.process.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 注册用户到标注平台
     * Summary: 注册用户.
     *
     * @param RegisterItagAntitagUserRequest $request
     *
     * @return RegisterItagAntitagUserResponse
     */
    public function registerItagAntitagUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerItagAntitagUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 注册用户到标注平台
     * Summary: 注册用户.
     *
     * @param RegisterItagAntitagUserRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return RegisterItagAntitagUserResponse
     */
    public function registerItagAntitagUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterItagAntitagUserResponse::fromMap($this->doRequest('1.0', 'itag.antitag.user.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加用户到指定租户
     * Summary: 新用户到租户.
     *
     * @param AddItagAntitagUserTntRequest $request
     *
     * @return AddItagAntitagUserTntResponse
     */
    public function addItagAntitagUserTnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addItagAntitagUserTntEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加用户到指定租户
     * Summary: 新用户到租户.
     *
     * @param AddItagAntitagUserTntRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return AddItagAntitagUserTntResponse
     */
    public function addItagAntitagUserTntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddItagAntitagUserTntResponse::fromMap($this->doRequest('1.0', 'itag.antitag.user.tnt.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过json方式创建任务
     * Summary: 创建标注任务json.
     *
     * @param CreateItagAntitagTaskJsonRequest $request
     *
     * @return CreateItagAntitagTaskJsonResponse
     */
    public function createItagAntitagTaskJson($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createItagAntitagTaskJsonEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过json方式创建任务
     * Summary: 创建标注任务json.
     *
     * @param CreateItagAntitagTaskJsonRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return CreateItagAntitagTaskJsonResponse
     */
    public function createItagAntitagTaskJsonEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateItagAntitagTaskJsonResponse::fromMap($this->doRequest('1.0', 'itag.antitag.task.json.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
