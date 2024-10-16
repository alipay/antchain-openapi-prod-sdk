<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\AITECH\Models\ApplyAuditImageRequest;
use AntChain\AITECH\Models\ApplyAuditImageResponse;
use AntChain\AITECH\Models\ApplyAuditTextRequest;
use AntChain\AITECH\Models\ApplyAuditTextResponse;
use AntChain\AITECH\Models\CallbackSofaAuditRequest;
use AntChain\AITECH\Models\CallbackSofaAuditResponse;
use AntChain\AITECH\Models\QueryAuditAudioRequest;
use AntChain\AITECH\Models\QueryAuditAudioResponse;
use AntChain\AITECH\Models\QueryAuditImageRequest;
use AntChain\AITECH\Models\QueryAuditImageResponse;
use AntChain\AITECH\Models\QueryAuditTextRequest;
use AntChain\AITECH\Models\QueryAuditTextResponse;
use AntChain\AITECH\Models\QueryAuditVideoRequest;
use AntChain\AITECH\Models\QueryAuditVideoResponse;
use AntChain\AITECH\Models\QueryGuardcoreRedgptRequest;
use AntChain\AITECH\Models\QueryGuardcoreRedgptResponse;
use AntChain\AITECH\Models\SubmitAuditAudioRequest;
use AntChain\AITECH\Models\SubmitAuditAudioResponse;
use AntChain\AITECH\Models\SubmitAuditImageRequest;
use AntChain\AITECH\Models\SubmitAuditImageResponse;
use AntChain\AITECH\Models\SubmitAuditTextRequest;
use AntChain\AITECH\Models\SubmitAuditTextResponse;
use AntChain\AITECH\Models\SubmitAuditVideoRequest;
use AntChain\AITECH\Models\SubmitAuditVideoResponse;
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
            // 二维码详情
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
                    'sdk_version'      => '1.1.8',
                    '_prod_code'       => 'AITECH',
                    '_prod_channel'    => 'default',
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
     * Description: LOGO/二维码审核
     * Summary: LOGO/二维码审核.
     *
     * @param ApplyAuditImageRequest $request
     *
     * @return ApplyAuditImageResponse
     */
    public function applyAuditImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyAuditImageEx($request, $headers, $runtime);
    }

    /**
     * Description: LOGO/二维码审核
     * Summary: LOGO/二维码审核.
     *
     * @param ApplyAuditImageRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ApplyAuditImageResponse
     */
    public function applyAuditImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyAuditImageResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.image.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 主站审核能力回调
     * Summary: 主站审核能力回调.
     *
     * @param CallbackSofaAuditRequest $request
     *
     * @return CallbackSofaAuditResponse
     */
    public function callbackSofaAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackSofaAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 主站审核能力回调
     * Summary: 主站审核能力回调.
     *
     * @param CallbackSofaAuditRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return CallbackSofaAuditResponse
     */
    public function callbackSofaAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackSofaAuditResponse::fromMap($this->doRequest('1.0', 'aitech.comm.sofa.audit.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本审核入审
     * Summary: 文本审核入审
     *
     * @param SubmitAuditTextRequest $request
     *
     * @return SubmitAuditTextResponse
     */
    public function submitAuditText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAuditTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本审核入审
     * Summary: 文本审核入审
     *
     * @param SubmitAuditTextRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SubmitAuditTextResponse
     */
    public function submitAuditTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAuditTextResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.text.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本审核查询
     * Summary: 文本审核查询.
     *
     * @param QueryAuditTextRequest $request
     *
     * @return QueryAuditTextResponse
     */
    public function queryAuditText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuditTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本审核查询
     * Summary: 文本审核查询.
     *
     * @param QueryAuditTextRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryAuditTextResponse
     */
    public function queryAuditTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuditTextResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.text.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 图片审核入审
     * Summary: 图片审核入审
     *
     * @param SubmitAuditImageRequest $request
     *
     * @return SubmitAuditImageResponse
     */
    public function submitAuditImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAuditImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 图片审核入审
     * Summary: 图片审核入审
     *
     * @param SubmitAuditImageRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SubmitAuditImageResponse
     */
    public function submitAuditImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAuditImageResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.image.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 图片审核查询
     * Summary: 图片审核查询.
     *
     * @param QueryAuditImageRequest $request
     *
     * @return QueryAuditImageResponse
     */
    public function queryAuditImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuditImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 图片审核查询
     * Summary: 图片审核查询.
     *
     * @param QueryAuditImageRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryAuditImageResponse
     */
    public function queryAuditImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuditImageResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.image.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音频审核入审
     * Summary: 音频审核入审
     *
     * @param SubmitAuditAudioRequest $request
     *
     * @return SubmitAuditAudioResponse
     */
    public function submitAuditAudio($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAuditAudioEx($request, $headers, $runtime);
    }

    /**
     * Description: 音频审核入审
     * Summary: 音频审核入审
     *
     * @param SubmitAuditAudioRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SubmitAuditAudioResponse
     */
    public function submitAuditAudioEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAuditAudioResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.audio.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音频审核查询
     * Summary: 音频审核查询.
     *
     * @param QueryAuditAudioRequest $request
     *
     * @return QueryAuditAudioResponse
     */
    public function queryAuditAudio($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuditAudioEx($request, $headers, $runtime);
    }

    /**
     * Description: 音频审核查询
     * Summary: 音频审核查询.
     *
     * @param QueryAuditAudioRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryAuditAudioResponse
     */
    public function queryAuditAudioEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuditAudioResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.audio.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频审核入审
     * Summary: 视频审核入审
     *
     * @param SubmitAuditVideoRequest $request
     *
     * @return SubmitAuditVideoResponse
     */
    public function submitAuditVideo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAuditVideoEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频审核入审
     * Summary: 视频审核入审
     *
     * @param SubmitAuditVideoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SubmitAuditVideoResponse
     */
    public function submitAuditVideoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAuditVideoResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.video.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频审核查询
     * Summary: 视频审核查询.
     *
     * @param QueryAuditVideoRequest $request
     *
     * @return QueryAuditVideoResponse
     */
    public function queryAuditVideo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuditVideoEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频审核查询
     * Summary: 视频审核查询.
     *
     * @param QueryAuditVideoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryAuditVideoResponse
     */
    public function queryAuditVideoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuditVideoResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.video.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
     * Summary: 文本同步审核.
     *
     * @param ApplyAuditTextRequest $request
     *
     * @return ApplyAuditTextResponse
     */
    public function applyAuditText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyAuditTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
     * Summary: 文本同步审核.
     *
     * @param ApplyAuditTextRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ApplyAuditTextResponse
     */
    public function applyAuditTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyAuditTextResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.text.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 红色GPT流式调用网关接口
     * Summary: 红色GPT网关方式调用接口.
     *
     * @param QueryGuardcoreRedgptRequest $request
     *
     * @return QueryGuardcoreRedgptResponse
     */
    public function queryGuardcoreRedgpt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardcoreRedgptEx($request, $headers, $runtime);
    }

    /**
     * Description: 红色GPT流式调用网关接口
     * Summary: 红色GPT网关方式调用接口.
     *
     * @param QueryGuardcoreRedgptRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryGuardcoreRedgptResponse
     */
    public function queryGuardcoreRedgptEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardcoreRedgptResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guardcore.redgpt.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
