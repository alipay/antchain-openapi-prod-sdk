<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CloneUniversalsaasDigitalhumanAvatarRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CloneUniversalsaasDigitalhumanAvatarResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CloneUniversalsaasDigitalhumanAvatarVoiceRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CloneUniversalsaasDigitalhumanAvatarVoiceResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CountUniversalsaasDigitalhumanVoiceNoiseRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CountUniversalsaasDigitalhumanVoiceNoiseResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CreateUniversalsaasDigitalhumanVideoTaskRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CreateUniversalsaasDigitalhumanVideoTaskResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CreateUniversalsaasDigitalhumanVoiceRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CreateUniversalsaasDigitalhumanVoiceResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CreateUniversalsaasDigitalhumanVoiceTaskRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\CreateUniversalsaasDigitalhumanVoiceTaskResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\ListUniversalsaasDigitalhumanVideoProfileRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\ListUniversalsaasDigitalhumanVideoProfileResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\ListUniversalsaasDigitalhumanVideoVoiceRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\ListUniversalsaasDigitalhumanVideoVoiceResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanAudioCaptionsRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanAudioCaptionsResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanAvatarActionRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanAvatarActionResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanCloneTaskRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanCloneTaskResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanVideoTaskRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanVideoTaskResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanVoiceNoiseRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanVoiceNoiseResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanVoiceTaskRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\QueryUniversalsaasDigitalhumanVoiceTaskResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\SubmitUniversalsaasDigitalhumanOrderRequest;
use AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models\SubmitUniversalsaasDigitalhumanOrderResponse;
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
            // 字幕单句配置
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
                    'sdk_version'      => '1.3.4',
                    '_prod_code'       => 'ak_245215eadadd4dc9bba177d6ba6d593d',
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
     * Description: 数字人音色列表
     * Summary: 数字人音色列表.
     *
     * @param ListUniversalsaasDigitalhumanVideoVoiceRequest $request
     *
     * @return ListUniversalsaasDigitalhumanVideoVoiceResponse
     */
    public function listUniversalsaasDigitalhumanVideoVoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUniversalsaasDigitalhumanVideoVoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字人音色列表
     * Summary: 数字人音色列表.
     *
     * @param ListUniversalsaasDigitalhumanVideoVoiceRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return ListUniversalsaasDigitalhumanVideoVoiceResponse
     */
    public function listUniversalsaasDigitalhumanVideoVoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUniversalsaasDigitalhumanVideoVoiceResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.video.voice.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字人短视频形象列表
     * Summary: 数字人短视频形象列表.
     *
     * @param ListUniversalsaasDigitalhumanVideoProfileRequest $request
     *
     * @return ListUniversalsaasDigitalhumanVideoProfileResponse
     */
    public function listUniversalsaasDigitalhumanVideoProfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUniversalsaasDigitalhumanVideoProfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字人短视频形象列表
     * Summary: 数字人短视频形象列表.
     *
     * @param ListUniversalsaasDigitalhumanVideoProfileRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return ListUniversalsaasDigitalhumanVideoProfileResponse
     */
    public function listUniversalsaasDigitalhumanVideoProfileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUniversalsaasDigitalhumanVideoProfileResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.video.profile.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频合成任务生成
     * Summary: 视频合成任务生成.
     *
     * @param CreateUniversalsaasDigitalhumanVideoTaskRequest $request
     *
     * @return CreateUniversalsaasDigitalhumanVideoTaskResponse
     */
    public function createUniversalsaasDigitalhumanVideoTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUniversalsaasDigitalhumanVideoTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频合成任务生成
     * Summary: 视频合成任务生成.
     *
     * @param CreateUniversalsaasDigitalhumanVideoTaskRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return CreateUniversalsaasDigitalhumanVideoTaskResponse
     */
    public function createUniversalsaasDigitalhumanVideoTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUniversalsaasDigitalhumanVideoTaskResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.video.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频合成任务查询
     * Summary: 视频合成任务查询.
     *
     * @param QueryUniversalsaasDigitalhumanVideoTaskRequest $request
     *
     * @return QueryUniversalsaasDigitalhumanVideoTaskResponse
     */
    public function queryUniversalsaasDigitalhumanVideoTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUniversalsaasDigitalhumanVideoTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频合成任务查询
     * Summary: 视频合成任务查询.
     *
     * @param QueryUniversalsaasDigitalhumanVideoTaskRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return QueryUniversalsaasDigitalhumanVideoTaskResponse
     */
    public function queryUniversalsaasDigitalhumanVideoTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUniversalsaasDigitalhumanVideoTaskResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.video.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字人短文本试听接口
     * Summary: 数字人短文本试听接口.
     *
     * @param CreateUniversalsaasDigitalhumanVoiceRequest $request
     *
     * @return CreateUniversalsaasDigitalhumanVoiceResponse
     */
    public function createUniversalsaasDigitalhumanVoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUniversalsaasDigitalhumanVoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字人短文本试听接口
     * Summary: 数字人短文本试听接口.
     *
     * @param CreateUniversalsaasDigitalhumanVoiceRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return CreateUniversalsaasDigitalhumanVoiceResponse
     */
    public function createUniversalsaasDigitalhumanVoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUniversalsaasDigitalhumanVoiceResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.voice.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 极速训练数字人分身，返回modelId
     * Summary: 训练数字人分身.
     *
     * @param CloneUniversalsaasDigitalhumanAvatarRequest $request
     *
     * @return CloneUniversalsaasDigitalhumanAvatarResponse
     */
    public function cloneUniversalsaasDigitalhumanAvatar($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cloneUniversalsaasDigitalhumanAvatarEx($request, $headers, $runtime);
    }

    /**
     * Description: 极速训练数字人分身，返回modelId
     * Summary: 训练数字人分身.
     *
     * @param CloneUniversalsaasDigitalhumanAvatarRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return CloneUniversalsaasDigitalhumanAvatarResponse
     */
    public function cloneUniversalsaasDigitalhumanAvatarEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloneUniversalsaasDigitalhumanAvatarResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.avatar.clone', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音色克隆
     * Summary: 音色克隆.
     *
     * @param CloneUniversalsaasDigitalhumanAvatarVoiceRequest $request
     *
     * @return CloneUniversalsaasDigitalhumanAvatarVoiceResponse
     */
    public function cloneUniversalsaasDigitalhumanAvatarVoice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cloneUniversalsaasDigitalhumanAvatarVoiceEx($request, $headers, $runtime);
    }

    /**
     * Description: 音色克隆
     * Summary: 音色克隆.
     *
     * @param CloneUniversalsaasDigitalhumanAvatarVoiceRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return CloneUniversalsaasDigitalhumanAvatarVoiceResponse
     */
    public function cloneUniversalsaasDigitalhumanAvatarVoiceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CloneUniversalsaasDigitalhumanAvatarVoiceResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.avatar.voice.clone', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 训练数字人分身任务查询
     * Summary: 训练数字人分身任务查询.
     *
     * @param QueryUniversalsaasDigitalhumanCloneTaskRequest $request
     *
     * @return QueryUniversalsaasDigitalhumanCloneTaskResponse
     */
    public function queryUniversalsaasDigitalhumanCloneTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUniversalsaasDigitalhumanCloneTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 训练数字人分身任务查询
     * Summary: 训练数字人分身任务查询.
     *
     * @param QueryUniversalsaasDigitalhumanCloneTaskRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return QueryUniversalsaasDigitalhumanCloneTaskResponse
     */
    public function queryUniversalsaasDigitalhumanCloneTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUniversalsaasDigitalhumanCloneTaskResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.clone.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字人音频生成接口
     * Summary: 数字人音频生成接口.
     *
     * @param CreateUniversalsaasDigitalhumanVoiceTaskRequest $request
     *
     * @return CreateUniversalsaasDigitalhumanVoiceTaskResponse
     */
    public function createUniversalsaasDigitalhumanVoiceTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createUniversalsaasDigitalhumanVoiceTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字人音频生成接口
     * Summary: 数字人音频生成接口.
     *
     * @param CreateUniversalsaasDigitalhumanVoiceTaskRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return CreateUniversalsaasDigitalhumanVoiceTaskResponse
     */
    public function createUniversalsaasDigitalhumanVoiceTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateUniversalsaasDigitalhumanVoiceTaskResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.voice.task.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音频生成任务查询接口
     * Summary: 音频生成任务查询接口.
     *
     * @param QueryUniversalsaasDigitalhumanVoiceTaskRequest $request
     *
     * @return QueryUniversalsaasDigitalhumanVoiceTaskResponse
     */
    public function queryUniversalsaasDigitalhumanVoiceTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUniversalsaasDigitalhumanVoiceTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 音频生成任务查询接口
     * Summary: 音频生成任务查询接口.
     *
     * @param QueryUniversalsaasDigitalhumanVoiceTaskRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return QueryUniversalsaasDigitalhumanVoiceTaskResponse
     */
    public function queryUniversalsaasDigitalhumanVoiceTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUniversalsaasDigitalhumanVoiceTaskResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.voice.task.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取数字人动作序列接口
     * Summary: 获取数字人动作序列接口.
     *
     * @param QueryUniversalsaasDigitalhumanAvatarActionRequest $request
     *
     * @return QueryUniversalsaasDigitalhumanAvatarActionResponse
     */
    public function queryUniversalsaasDigitalhumanAvatarAction($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUniversalsaasDigitalhumanAvatarActionEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取数字人动作序列接口
     * Summary: 获取数字人动作序列接口.
     *
     * @param QueryUniversalsaasDigitalhumanAvatarActionRequest $request
     * @param string[]                                          $headers
     * @param RuntimeOptions                                    $runtime
     *
     * @return QueryUniversalsaasDigitalhumanAvatarActionResponse
     */
    public function queryUniversalsaasDigitalhumanAvatarActionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUniversalsaasDigitalhumanAvatarActionResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.avatar.action.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数字人订单上报接口
     * Summary: 数字人订单上报接口.
     *
     * @param SubmitUniversalsaasDigitalhumanOrderRequest $request
     *
     * @return SubmitUniversalsaasDigitalhumanOrderResponse
     */
    public function submitUniversalsaasDigitalhumanOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitUniversalsaasDigitalhumanOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字人订单上报接口
     * Summary: 数字人订单上报接口.
     *
     * @param SubmitUniversalsaasDigitalhumanOrderRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return SubmitUniversalsaasDigitalhumanOrderResponse
     */
    public function submitUniversalsaasDigitalhumanOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitUniversalsaasDigitalhumanOrderResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.order.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音色检测任务创建
     * Summary: 音色检测任务创建.
     *
     * @param CountUniversalsaasDigitalhumanVoiceNoiseRequest $request
     *
     * @return CountUniversalsaasDigitalhumanVoiceNoiseResponse
     */
    public function countUniversalsaasDigitalhumanVoiceNoise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countUniversalsaasDigitalhumanVoiceNoiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 音色检测任务创建
     * Summary: 音色检测任务创建.
     *
     * @param CountUniversalsaasDigitalhumanVoiceNoiseRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return CountUniversalsaasDigitalhumanVoiceNoiseResponse
     */
    public function countUniversalsaasDigitalhumanVoiceNoiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountUniversalsaasDigitalhumanVoiceNoiseResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.voice.noise.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音色检测任务查询接口
     * Summary: 音色检测任务查询接口.
     *
     * @param QueryUniversalsaasDigitalhumanVoiceNoiseRequest $request
     *
     * @return QueryUniversalsaasDigitalhumanVoiceNoiseResponse
     */
    public function queryUniversalsaasDigitalhumanVoiceNoise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUniversalsaasDigitalhumanVoiceNoiseEx($request, $headers, $runtime);
    }

    /**
     * Description: 音色检测任务查询接口
     * Summary: 音色检测任务查询接口.
     *
     * @param QueryUniversalsaasDigitalhumanVoiceNoiseRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return QueryUniversalsaasDigitalhumanVoiceNoiseResponse
     */
    public function queryUniversalsaasDigitalhumanVoiceNoiseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUniversalsaasDigitalhumanVoiceNoiseResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.voice.noise.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音频字幕识别任务创建
     * Summary: 音频字幕识别任务创建.
     *
     * @param RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest $request
     *
     * @return RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse
     */
    public function recognizeUniversalsaasDigitalhumanAudioCaptions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeUniversalsaasDigitalhumanAudioCaptionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 音频字幕识别任务创建
     * Summary: 音频字幕识别任务创建.
     *
     * @param RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest $request
     * @param string[]                                               $headers
     * @param RuntimeOptions                                         $runtime
     *
     * @return RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse
     */
    public function recognizeUniversalsaasDigitalhumanAudioCaptionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.audio.captions.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音频字幕识别任务结果查询
     * Summary: 音频字幕识别任务结果查询.
     *
     * @param QueryUniversalsaasDigitalhumanAudioCaptionsRequest $request
     *
     * @return QueryUniversalsaasDigitalhumanAudioCaptionsResponse
     */
    public function queryUniversalsaasDigitalhumanAudioCaptions($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUniversalsaasDigitalhumanAudioCaptionsEx($request, $headers, $runtime);
    }

    /**
     * Description: 音频字幕识别任务结果查询
     * Summary: 音频字幕识别任务结果查询.
     *
     * @param QueryUniversalsaasDigitalhumanAudioCaptionsRequest $request
     * @param string[]                                           $headers
     * @param RuntimeOptions                                     $runtime
     *
     * @return QueryUniversalsaasDigitalhumanAudioCaptionsResponse
     */
    public function queryUniversalsaasDigitalhumanAudioCaptionsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUniversalsaasDigitalhumanAudioCaptionsResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.audio.captions.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
