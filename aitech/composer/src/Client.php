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
use AntChain\AITECH\Models\ApplyAuditImageadvancedRequest;
use AntChain\AITECH\Models\ApplyAuditImageadvancedResponse;
use AntChain\AITECH\Models\ApplyAuditImagebaseRequest;
use AntChain\AITECH\Models\ApplyAuditImagebaseResponse;
use AntChain\AITECH\Models\ApplyAuditImageRequest;
use AntChain\AITECH\Models\ApplyAuditImageResponse;
use AntChain\AITECH\Models\ApplyAuditTextRequest;
use AntChain\AITECH\Models\ApplyAuditTextResponse;
use AntChain\AITECH\Models\ApplyGuardImageadvancedRequest;
use AntChain\AITECH\Models\ApplyGuardImageadvancedResponse;
use AntChain\AITECH\Models\ApplyGuardImagebaseRequest;
use AntChain\AITECH\Models\ApplyGuardImagebaseResponse;
use AntChain\AITECH\Models\ApplyGuardImagemultiplyRequest;
use AntChain\AITECH\Models\ApplyGuardImagemultiplyResponse;
use AntChain\AITECH\Models\ApplyGuardTextbaseRequest;
use AntChain\AITECH\Models\ApplyGuardTextbaseResponse;
use AntChain\AITECH\Models\CallbackAliyunAuditRequest;
use AntChain\AITECH\Models\CallbackAliyunAuditResponse;
use AntChain\AITECH\Models\CallbackGuardAliyunRequest;
use AntChain\AITECH\Models\CallbackGuardAliyunResponse;
use AntChain\AITECH\Models\CallbackGuardItaskRequest;
use AntChain\AITECH\Models\CallbackGuardItaskResponse;
use AntChain\AITECH\Models\CallbackSofaAuditRequest;
use AntChain\AITECH\Models\CallbackSofaAuditResponse;
use AntChain\AITECH\Models\CheckGuardAnswerRequest;
use AntChain\AITECH\Models\CheckGuardAnswerResponse;
use AntChain\AITECH\Models\DownloadAuditFileRequest;
use AntChain\AITECH\Models\DownloadAuditFileResponse;
use AntChain\AITECH\Models\PagequeryMeiyouAuditRequest;
use AntChain\AITECH\Models\PagequeryMeiyouAuditResponse;
use AntChain\AITECH\Models\QueryAicoguardAdbsinkRequest;
use AntChain\AITECH\Models\QueryAicoguardAdbsinkResponse;
use AntChain\AITECH\Models\QueryAicoguardcloudAdbsinkRequest;
use AntChain\AITECH\Models\QueryAicoguardcloudAdbsinkResponse;
use AntChain\AITECH\Models\QueryAuditAudiobaseRequest;
use AntChain\AITECH\Models\QueryAuditAudiobaseResponse;
use AntChain\AITECH\Models\QueryAuditAudioRequest;
use AntChain\AITECH\Models\QueryAuditAudioResponse;
use AntChain\AITECH\Models\QueryAuditDocumentRequest;
use AntChain\AITECH\Models\QueryAuditDocumentResponse;
use AntChain\AITECH\Models\QueryAuditImageRequest;
use AntChain\AITECH\Models\QueryAuditImageResponse;
use AntChain\AITECH\Models\QueryAuditTextRequest;
use AntChain\AITECH\Models\QueryAuditTextResponse;
use AntChain\AITECH\Models\QueryAuditVideobaseRequest;
use AntChain\AITECH\Models\QueryAuditVideobaseResponse;
use AntChain\AITECH\Models\QueryAuditVideoRequest;
use AntChain\AITECH\Models\QueryAuditVideoResponse;
use AntChain\AITECH\Models\QueryGuardAudiobaseRequest;
use AntChain\AITECH\Models\QueryGuardAudiobaseResponse;
use AntChain\AITECH\Models\QueryGuardAudioRequest;
use AntChain\AITECH\Models\QueryGuardAudioResponse;
use AntChain\AITECH\Models\QueryGuardcoreRedgptRequest;
use AntChain\AITECH\Models\QueryGuardcoreRedgptResponse;
use AntChain\AITECH\Models\QueryGuardDocumentRequest;
use AntChain\AITECH\Models\QueryGuardDocumentResponse;
use AntChain\AITECH\Models\QueryGuardImageRequest;
use AntChain\AITECH\Models\QueryGuardImageResponse;
use AntChain\AITECH\Models\QueryGuardTextRequest;
use AntChain\AITECH\Models\QueryGuardTextResponse;
use AntChain\AITECH\Models\QueryGuardVideobaseRequest;
use AntChain\AITECH\Models\QueryGuardVideobaseResponse;
use AntChain\AITECH\Models\QueryGuardVideoRequest;
use AntChain\AITECH\Models\QueryGuardVideoResponse;
use AntChain\AITECH\Models\QueryMeiyouAgentauditRequest;
use AntChain\AITECH\Models\QueryMeiyouAgentauditResponse;
use AntChain\AITECH\Models\QueryMeiyouAuditRequest;
use AntChain\AITECH\Models\QueryMeiyouAuditResponse;
use AntChain\AITECH\Models\QueryMeiyouAuditresultRequest;
use AntChain\AITECH\Models\QueryMeiyouAuditresultResponse;
use AntChain\AITECH\Models\QueryMeiyouAudittopicRequest;
use AntChain\AITECH\Models\QueryMeiyouAudittopicResponse;
use AntChain\AITECH\Models\QueryMeiyouItagrelationRequest;
use AntChain\AITECH\Models\QueryMeiyouItagrelationResponse;
use AntChain\AITECH\Models\SaveAuditMeiyouRequest;
use AntChain\AITECH\Models\SaveAuditMeiyouResponse;
use AntChain\AITECH\Models\SubmitAuditAudiobaseRequest;
use AntChain\AITECH\Models\SubmitAuditAudiobaseResponse;
use AntChain\AITECH\Models\SubmitAuditAudioRequest;
use AntChain\AITECH\Models\SubmitAuditAudioResponse;
use AntChain\AITECH\Models\SubmitAuditDocumentRequest;
use AntChain\AITECH\Models\SubmitAuditDocumentResponse;
use AntChain\AITECH\Models\SubmitAuditImageRequest;
use AntChain\AITECH\Models\SubmitAuditImageResponse;
use AntChain\AITECH\Models\SubmitAuditMeiyouRequest;
use AntChain\AITECH\Models\SubmitAuditMeiyouResponse;
use AntChain\AITECH\Models\SubmitAuditTextRequest;
use AntChain\AITECH\Models\SubmitAuditTextResponse;
use AntChain\AITECH\Models\SubmitAuditVideobaseRequest;
use AntChain\AITECH\Models\SubmitAuditVideobaseResponse;
use AntChain\AITECH\Models\SubmitAuditVideoRequest;
use AntChain\AITECH\Models\SubmitAuditVideoResponse;
use AntChain\AITECH\Models\SubmitGuardAudiobaseRequest;
use AntChain\AITECH\Models\SubmitGuardAudiobaseResponse;
use AntChain\AITECH\Models\SubmitGuardAudioRequest;
use AntChain\AITECH\Models\SubmitGuardAudioResponse;
use AntChain\AITECH\Models\SubmitGuardDocumentRequest;
use AntChain\AITECH\Models\SubmitGuardDocumentResponse;
use AntChain\AITECH\Models\SubmitGuardImageRequest;
use AntChain\AITECH\Models\SubmitGuardImageResponse;
use AntChain\AITECH\Models\SubmitGuardTextRequest;
use AntChain\AITECH\Models\SubmitGuardTextResponse;
use AntChain\AITECH\Models\SubmitGuardVideobaseRequest;
use AntChain\AITECH\Models\SubmitGuardVideobaseResponse;
use AntChain\AITECH\Models\SubmitGuardVideoRequest;
use AntChain\AITECH\Models\SubmitGuardVideoResponse;
use AntChain\AITECH\Models\SubmitMeiyouAuditRequest;
use AntChain\AITECH\Models\SubmitMeiyouAuditResponse;
use AntChain\AITECH\Models\TransferAuditFileRequest;
use AntChain\AITECH\Models\TransferAuditFileResponse;
use AntChain\AITECH\Models\UpdateAicoguardcoreMeiyouRequest;
use AntChain\AITECH\Models\UpdateAicoguardcoreMeiyouResponse;
use AntChain\AITECH\Models\UpdateAuditMeiyouRequest;
use AntChain\AITECH\Models\UpdateAuditMeiyouResponse;
use AntChain\AITECH\Models\UpdateMeiyouAuditRequest;
use AntChain\AITECH\Models\UpdateMeiyouAuditResponse;
use AntChain\AITECH\Models\UpdateMeiyouItagrelationRequest;
use AntChain\AITECH\Models\UpdateMeiyouItagrelationResponse;
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
                    'sdk_version'      => '1.1.51',
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
     * Description: 同步接口，只调用机审能力
     * Summary: 图片机审基础版.
     *
     * @param ApplyAuditImagebaseRequest $request
     *
     * @return ApplyAuditImagebaseResponse
     */
    public function applyAuditImagebase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyAuditImagebaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步接口，只调用机审能力
     * Summary: 图片机审基础版.
     *
     * @param ApplyAuditImagebaseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ApplyAuditImagebaseResponse
     */
    public function applyAuditImagebaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyAuditImagebaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.imagebase.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 同步接口，只调用机审能力
     * Summary: 图片审核增强版.
     *
     * @param ApplyAuditImageadvancedRequest $request
     *
     * @return ApplyAuditImageadvancedResponse
     */
    public function applyAuditImageadvanced($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyAuditImageadvancedEx($request, $headers, $runtime);
    }

    /**
     * Description: 同步接口，只调用机审能力
     * Summary: 图片审核增强版.
     *
     * @param ApplyAuditImageadvancedRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ApplyAuditImageadvancedResponse
     */
    public function applyAuditImageadvancedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyAuditImageadvancedResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.imageadvanced.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异步接口，只调用机审能力
     * Summary: 音频审核通用版入审
     *
     * @param SubmitAuditAudiobaseRequest $request
     *
     * @return SubmitAuditAudiobaseResponse
     */
    public function submitAuditAudiobase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAuditAudiobaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 异步接口，只调用机审能力
     * Summary: 音频审核通用版入审
     *
     * @param SubmitAuditAudiobaseRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SubmitAuditAudiobaseResponse
     */
    public function submitAuditAudiobaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAuditAudiobaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.audiobase.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异步接口，只调用机审能力
     * Summary: 音频审核通用版查询.
     *
     * @param QueryAuditAudiobaseRequest $request
     *
     * @return QueryAuditAudiobaseResponse
     */
    public function queryAuditAudiobase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuditAudiobaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 异步接口，只调用机审能力
     * Summary: 音频审核通用版查询.
     *
     * @param QueryAuditAudiobaseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryAuditAudiobaseResponse
     */
    public function queryAuditAudiobaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuditAudiobaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.audiobase.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异步通知，只调用机审能力
     * Summary: 视频审核通用版入审
     *
     * @param SubmitAuditVideobaseRequest $request
     *
     * @return SubmitAuditVideobaseResponse
     */
    public function submitAuditVideobase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAuditVideobaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 异步通知，只调用机审能力
     * Summary: 视频审核通用版入审
     *
     * @param SubmitAuditVideobaseRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SubmitAuditVideobaseResponse
     */
    public function submitAuditVideobaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAuditVideobaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.videobase.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 异步查询
     * Summary: 视频审核通用版查询.
     *
     * @param QueryAuditVideobaseRequest $request
     *
     * @return QueryAuditVideobaseResponse
     */
    public function queryAuditVideobase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuditVideobaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 异步查询
     * Summary: 视频审核通用版查询.
     *
     * @param QueryAuditVideobaseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryAuditVideobaseResponse
     */
    public function queryAuditVideobaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuditVideobaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.videobase.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
     * Summary: 阿里云内容审核回调.
     *
     * @param CallbackAliyunAuditRequest $request
     *
     * @return CallbackAliyunAuditResponse
     */
    public function callbackAliyunAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackAliyunAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
     * Summary: 阿里云内容审核回调.
     *
     * @param CallbackAliyunAuditRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CallbackAliyunAuditResponse
     */
    public function callbackAliyunAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackAliyunAuditResponse::fromMap($this->doRequest('1.0', 'aitech.comm.aliyun.audit.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部文件转存
     * Summary: 文件转存接口.
     *
     * @param TransferAuditFileRequest $request
     *
     * @return TransferAuditFileResponse
     */
    public function transferAuditFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->transferAuditFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部文件转存
     * Summary: 文件转存接口.
     *
     * @param TransferAuditFileRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return TransferAuditFileResponse
     */
    public function transferAuditFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return TransferAuditFileResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.file.transfer', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件下载接口
     * Summary: 文件下载接口.
     *
     * @param DownloadAuditFileRequest $request
     *
     * @return DownloadAuditFileResponse
     */
    public function downloadAuditFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadAuditFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件下载接口
     * Summary: 文件下载接口.
     *
     * @param DownloadAuditFileRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return DownloadAuditFileResponse
     */
    public function downloadAuditFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadAuditFileResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.file.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 美柚待审核信息保存
     * Summary: 美柚待审核信息保存接口.
     *
     * @param SaveAuditMeiyouRequest $request
     *
     * @return SaveAuditMeiyouResponse
     */
    public function saveAuditMeiyou($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveAuditMeiyouEx($request, $headers, $runtime);
    }

    /**
     * Description: 美柚待审核信息保存
     * Summary: 美柚待审核信息保存接口.
     *
     * @param SaveAuditMeiyouRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SaveAuditMeiyouResponse
     */
    public function saveAuditMeiyouEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveAuditMeiyouResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.meiyou.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 美柚审核信息存储请求
     * Summary: 美柚审核信息存储请求
     *
     * @param UpdateAuditMeiyouRequest $request
     *
     * @return UpdateAuditMeiyouResponse
     */
    public function updateAuditMeiyou($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAuditMeiyouEx($request, $headers, $runtime);
    }

    /**
     * Description: 美柚审核信息存储请求
     * Summary: 美柚审核信息存储请求
     *
     * @param UpdateAuditMeiyouRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateAuditMeiyouResponse
     */
    public function updateAuditMeiyouEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAuditMeiyouResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.meiyou.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 美柚审核信息查询接口
     * Summary: 美柚审核信息查询接口.
     *
     * @param QueryMeiyouAuditRequest $request
     *
     * @return QueryMeiyouAuditResponse
     */
    public function queryMeiyouAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeiyouAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 美柚审核信息查询接口
     * Summary: 美柚审核信息查询接口.
     *
     * @param QueryMeiyouAuditRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryMeiyouAuditResponse
     */
    public function queryMeiyouAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeiyouAuditResponse::fromMap($this->doRequest('1.0', 'aitech.comm.meiyou.audit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 美柚主题信息查询接口
     * Summary: 美柚主题信息查询接口.
     *
     * @param QueryMeiyouAudittopicRequest $request
     *
     * @return QueryMeiyouAudittopicResponse
     */
    public function queryMeiyouAudittopic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeiyouAudittopicEx($request, $headers, $runtime);
    }

    /**
     * Description: 美柚主题信息查询接口
     * Summary: 美柚主题信息查询接口.
     *
     * @param QueryMeiyouAudittopicRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryMeiyouAudittopicResponse
     */
    public function queryMeiyouAudittopicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeiyouAudittopicResponse::fromMap($this->doRequest('1.0', 'aitech.comm.meiyou.audittopic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新美柚itag关联关系接口
     * Summary: 更新美柚itag关联关系接口.
     *
     * @param UpdateMeiyouAuditRequest $request
     *
     * @return UpdateMeiyouAuditResponse
     */
    public function updateMeiyouAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeiyouAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新美柚itag关联关系接口
     * Summary: 更新美柚itag关联关系接口.
     *
     * @param UpdateMeiyouAuditRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateMeiyouAuditResponse
     */
    public function updateMeiyouAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeiyouAuditResponse::fromMap($this->doRequest('1.0', 'aitech.comm.meiyou.audit.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询美柚itag关联信息
     * Summary: 查询美柚itag关联信息.
     *
     * @param QueryMeiyouItagrelationRequest $request
     *
     * @return QueryMeiyouItagrelationResponse
     */
    public function queryMeiyouItagrelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeiyouItagrelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询美柚itag关联信息
     * Summary: 查询美柚itag关联信息.
     *
     * @param QueryMeiyouItagrelationRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryMeiyouItagrelationResponse
     */
    public function queryMeiyouItagrelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeiyouItagrelationResponse::fromMap($this->doRequest('1.0', 'aitech.comm.meiyou.itagrelation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新美柚itag关联信息
     * Summary: 更新美柚itag关联信息.
     *
     * @param UpdateMeiyouItagrelationRequest $request
     *
     * @return UpdateMeiyouItagrelationResponse
     */
    public function updateMeiyouItagrelation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateMeiyouItagrelationEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新美柚itag关联信息
     * Summary: 更新美柚itag关联信息.
     *
     * @param UpdateMeiyouItagrelationRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateMeiyouItagrelationResponse
     */
    public function updateMeiyouItagrelationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateMeiyouItagrelationResponse::fromMap($this->doRequest('1.0', 'aitech.comm.meiyou.itagrelation.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 美柚审核结果查询
     * Summary: 美柚审核结果查询.
     *
     * @param QueryMeiyouAuditresultRequest $request
     *
     * @return QueryMeiyouAuditresultResponse
     */
    public function queryMeiyouAuditresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeiyouAuditresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 美柚审核结果查询
     * Summary: 美柚审核结果查询.
     *
     * @param QueryMeiyouAuditresultRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryMeiyouAuditresultResponse
     */
    public function queryMeiyouAuditresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeiyouAuditresultResponse::fromMap($this->doRequest('1.0', 'aitech.comm.meiyou.auditresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询美柚审核信息接口
     * Summary: 分页查询美柚审核信息接口.
     *
     * @param PagequeryMeiyouAuditRequest $request
     *
     * @return PagequeryMeiyouAuditResponse
     */
    public function pagequeryMeiyouAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryMeiyouAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询美柚审核信息接口
     * Summary: 分页查询美柚审核信息接口.
     *
     * @param PagequeryMeiyouAuditRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PagequeryMeiyouAuditResponse
     */
    public function pagequeryMeiyouAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryMeiyouAuditResponse::fromMap($this->doRequest('1.0', 'aitech.comm.meiyou.audit.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 美柚审核信息存储（仅itask）
     * Summary: 美柚审核信息存储（仅itask）.
     *
     * @param SubmitAuditMeiyouRequest $request
     *
     * @return SubmitAuditMeiyouResponse
     */
    public function submitAuditMeiyou($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAuditMeiyouEx($request, $headers, $runtime);
    }

    /**
     * Description: 美柚审核信息存储（仅itask）
     * Summary: 美柚审核信息存储（仅itask）.
     *
     * @param SubmitAuditMeiyouRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SubmitAuditMeiyouResponse
     */
    public function submitAuditMeiyouEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAuditMeiyouResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.meiyou.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文档人审入审
     * Summary: 文档人审入审
     *
     * @param SubmitAuditDocumentRequest $request
     *
     * @return SubmitAuditDocumentResponse
     */
    public function submitAuditDocument($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitAuditDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 文档人审入审
     * Summary: 文档人审入审
     *
     * @param SubmitAuditDocumentRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SubmitAuditDocumentResponse
     */
    public function submitAuditDocumentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitAuditDocumentResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.document.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文档人审查询
     * Summary: 文档人审查询.
     *
     * @param QueryAuditDocumentRequest $request
     *
     * @return QueryAuditDocumentResponse
     */
    public function queryAuditDocument($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuditDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 文档人审查询
     * Summary: 文档人审查询.
     *
     * @param QueryAuditDocumentRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryAuditDocumentResponse
     */
    public function queryAuditDocumentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuditDocumentResponse::fromMap($this->doRequest('1.0', 'aitech.comm.audit.document.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云ADB调用接口
     * Summary: 阿里云ADB调用接口.
     *
     * @param QueryAicoguardcloudAdbsinkRequest $request
     *
     * @return QueryAicoguardcloudAdbsinkResponse
     */
    public function queryAicoguardcloudAdbsink($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAicoguardcloudAdbsinkEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云ADB调用接口
     * Summary: 阿里云ADB调用接口.
     *
     * @param QueryAicoguardcloudAdbsinkRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryAicoguardcloudAdbsinkResponse
     */
    public function queryAicoguardcloudAdbsinkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAicoguardcloudAdbsinkResponse::fromMap($this->doRequest('1.0', 'aitech.comm.aicoguardcloud.adbsink.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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

    /**
     * Description: 阿里云ADB调用接口
     * Summary: 阿里云ADB调用接口.
     *
     * @param QueryAicoguardAdbsinkRequest $request
     *
     * @return QueryAicoguardAdbsinkResponse
     */
    public function queryAicoguardAdbsink($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAicoguardAdbsinkEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云ADB调用接口
     * Summary: 阿里云ADB调用接口.
     *
     * @param QueryAicoguardAdbsinkRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryAicoguardAdbsinkResponse
     */
    public function queryAicoguardAdbsinkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAicoguardAdbsinkResponse::fromMap($this->doRequest('1.0', 'aitech.comm.aicoguard.adbsink.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
     * Summary: 阿里云内容安全回调.
     *
     * @param CallbackGuardAliyunRequest $request
     *
     * @return CallbackGuardAliyunResponse
     */
    public function callbackGuardAliyun($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackGuardAliyunEx($request, $headers, $runtime);
    }

    /**
     * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
     * Summary: 阿里云内容安全回调.
     *
     * @param CallbackGuardAliyunRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CallbackGuardAliyunResponse
     */
    public function callbackGuardAliyunEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackGuardAliyunResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.aliyun.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 主站ITASK审核能力回调
     * Summary: 主站ITASK审核能力回调.
     *
     * @param CallbackGuardItaskRequest $request
     *
     * @return CallbackGuardItaskResponse
     */
    public function callbackGuardItask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->callbackGuardItaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 主站ITASK审核能力回调
     * Summary: 主站ITASK审核能力回调.
     *
     * @param CallbackGuardItaskRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CallbackGuardItaskResponse
     */
    public function callbackGuardItaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CallbackGuardItaskResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.itask.callback', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音频人审查询
     * Summary: 音频人审查询.
     *
     * @param QueryGuardAudioRequest $request
     *
     * @return QueryGuardAudioResponse
     */
    public function queryGuardAudio($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardAudioEx($request, $headers, $runtime);
    }

    /**
     * Description: 音频人审查询
     * Summary: 音频人审查询.
     *
     * @param QueryGuardAudioRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryGuardAudioResponse
     */
    public function queryGuardAudioEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardAudioResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.audio.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音频人审入审
     * Summary: 音频人审入审
     *
     * @param SubmitGuardAudioRequest $request
     *
     * @return SubmitGuardAudioResponse
     */
    public function submitGuardAudio($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitGuardAudioEx($request, $headers, $runtime);
    }

    /**
     * Description: 音频人审入审
     * Summary: 音频人审入审
     *
     * @param SubmitGuardAudioRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SubmitGuardAudioResponse
     */
    public function submitGuardAudioEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitGuardAudioResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.audio.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 图片人审查询
     * Summary: 图片人审查询.
     *
     * @param QueryGuardImageRequest $request
     *
     * @return QueryGuardImageResponse
     */
    public function queryGuardImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 图片人审查询
     * Summary: 图片人审查询.
     *
     * @param QueryGuardImageRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryGuardImageResponse
     */
    public function queryGuardImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardImageResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.image.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 图片人审入审
     * Summary: 图片人审入审
     *
     * @param SubmitGuardImageRequest $request
     *
     * @return SubmitGuardImageResponse
     */
    public function submitGuardImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitGuardImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 图片人审入审
     * Summary: 图片人审入审
     *
     * @param SubmitGuardImageRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SubmitGuardImageResponse
     */
    public function submitGuardImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitGuardImageResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.image.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本人审查询
     * Summary: 文本人审查询.
     *
     * @param QueryGuardTextRequest $request
     *
     * @return QueryGuardTextResponse
     */
    public function queryGuardText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本人审查询
     * Summary: 文本人审查询.
     *
     * @param QueryGuardTextRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryGuardTextResponse
     */
    public function queryGuardTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardTextResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.text.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本人审提交
     * Summary: 文本人审提交.
     *
     * @param SubmitGuardTextRequest $request
     *
     * @return SubmitGuardTextResponse
     */
    public function submitGuardText($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitGuardTextEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本人审提交
     * Summary: 文本人审提交.
     *
     * @param SubmitGuardTextRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SubmitGuardTextResponse
     */
    public function submitGuardTextEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitGuardTextResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.text.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频人审查询
     * Summary: 视频人审查询.
     *
     * @param QueryGuardVideoRequest $request
     *
     * @return QueryGuardVideoResponse
     */
    public function queryGuardVideo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardVideoEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频人审查询
     * Summary: 视频人审查询.
     *
     * @param QueryGuardVideoRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryGuardVideoResponse
     */
    public function queryGuardVideoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardVideoResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.video.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频人审提交
     * Summary: 视频人审提交.
     *
     * @param SubmitGuardVideoRequest $request
     *
     * @return SubmitGuardVideoResponse
     */
    public function submitGuardVideo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitGuardVideoEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频人审提交
     * Summary: 视频人审提交.
     *
     * @param SubmitGuardVideoRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return SubmitGuardVideoResponse
     */
    public function submitGuardVideoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitGuardVideoResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.video.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音频机审查询-基础版
     * Summary: 音频机审查询-基础版.
     *
     * @param QueryGuardAudiobaseRequest $request
     *
     * @return QueryGuardAudiobaseResponse
     */
    public function queryGuardAudiobase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardAudiobaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 音频机审查询-基础版
     * Summary: 音频机审查询-基础版.
     *
     * @param QueryGuardAudiobaseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryGuardAudiobaseResponse
     */
    public function queryGuardAudiobaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardAudiobaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.audiobase.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 音频机审入审-基础版
     * Summary: 音频机审入审-基础版.
     *
     * @param SubmitGuardAudiobaseRequest $request
     *
     * @return SubmitGuardAudiobaseResponse
     */
    public function submitGuardAudiobase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitGuardAudiobaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 音频机审入审-基础版
     * Summary: 音频机审入审-基础版.
     *
     * @param SubmitGuardAudiobaseRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SubmitGuardAudiobaseResponse
     */
    public function submitGuardAudiobaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitGuardAudiobaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.audiobase.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 图片机审申请-基础版
     * Summary: 图片机审申请-基础版.
     *
     * @param ApplyGuardImagebaseRequest $request
     *
     * @return ApplyGuardImagebaseResponse
     */
    public function applyGuardImagebase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyGuardImagebaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 图片机审申请-基础版
     * Summary: 图片机审申请-基础版.
     *
     * @param ApplyGuardImagebaseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return ApplyGuardImagebaseResponse
     */
    public function applyGuardImagebaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyGuardImagebaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.imagebase.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 图片机审申请-增强版
     * Summary: 图片机审申请-增强版.
     *
     * @param ApplyGuardImageadvancedRequest $request
     *
     * @return ApplyGuardImageadvancedResponse
     */
    public function applyGuardImageadvanced($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyGuardImageadvancedEx($request, $headers, $runtime);
    }

    /**
     * Description: 图片机审申请-增强版
     * Summary: 图片机审申请-增强版.
     *
     * @param ApplyGuardImageadvancedRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ApplyGuardImageadvancedResponse
     */
    public function applyGuardImageadvancedEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyGuardImageadvancedResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.imageadvanced.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文本机审申请-基础版
     * Summary: 文本机审申请-基础版.
     *
     * @param ApplyGuardTextbaseRequest $request
     *
     * @return ApplyGuardTextbaseResponse
     */
    public function applyGuardTextbase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyGuardTextbaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 文本机审申请-基础版
     * Summary: 文本机审申请-基础版.
     *
     * @param ApplyGuardTextbaseRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ApplyGuardTextbaseResponse
     */
    public function applyGuardTextbaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyGuardTextbaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.textbase.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频机审查询-基础版
     * Summary: 视频机审查询-基础版.
     *
     * @param QueryGuardVideobaseRequest $request
     *
     * @return QueryGuardVideobaseResponse
     */
    public function queryGuardVideobase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardVideobaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频机审查询-基础版
     * Summary: 视频机审查询-基础版.
     *
     * @param QueryGuardVideobaseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryGuardVideobaseResponse
     */
    public function queryGuardVideobaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardVideobaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.videobase.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 视频机审提交-基础版
     * Summary: 视频机审提交-基础版.
     *
     * @param SubmitGuardVideobaseRequest $request
     *
     * @return SubmitGuardVideobaseResponse
     */
    public function submitGuardVideobase($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitGuardVideobaseEx($request, $headers, $runtime);
    }

    /**
     * Description: 视频机审提交-基础版
     * Summary: 视频机审提交-基础版.
     *
     * @param SubmitGuardVideobaseRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return SubmitGuardVideobaseResponse
     */
    public function submitGuardVideobaseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitGuardVideobaseResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.videobase.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用于身份证、个人信息识别、防伪等
     * Summary: 图片光鉴识别链路.
     *
     * @param ApplyGuardImagemultiplyRequest $request
     *
     * @return ApplyGuardImagemultiplyResponse
     */
    public function applyGuardImagemultiply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyGuardImagemultiplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 用于身份证、个人信息识别、防伪等
     * Summary: 图片光鉴识别链路.
     *
     * @param ApplyGuardImagemultiplyRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ApplyGuardImagemultiplyResponse
     */
    public function applyGuardImagemultiplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyGuardImagemultiplyResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.imagemultiply.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 输出文本风险检测
     * Summary: 输出文本风险检测.
     *
     * @param CheckGuardAnswerRequest $request
     *
     * @return CheckGuardAnswerResponse
     */
    public function checkGuardAnswer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkGuardAnswerEx($request, $headers, $runtime);
    }

    /**
     * Description: 输出文本风险检测
     * Summary: 输出文本风险检测.
     *
     * @param CheckGuardAnswerRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CheckGuardAnswerResponse
     */
    public function checkGuardAnswerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckGuardAnswerResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.answer.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 美柚待审核信息提交
     * Summary: 美柚待审核信息提交.
     *
     * @param SubmitMeiyouAuditRequest $request
     *
     * @return SubmitMeiyouAuditResponse
     */
    public function submitMeiyouAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitMeiyouAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 美柚待审核信息提交
     * Summary: 美柚待审核信息提交.
     *
     * @param SubmitMeiyouAuditRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SubmitMeiyouAuditResponse
     */
    public function submitMeiyouAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitMeiyouAuditResponse::fromMap($this->doRequest('1.0', 'aitech.comm.meiyou.audit.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询美柚审核Agent节点信息
     * Summary: 查询美柚审核Agent节点信息.
     *
     * @param QueryMeiyouAgentauditRequest $request
     *
     * @return QueryMeiyouAgentauditResponse
     */
    public function queryMeiyouAgentaudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMeiyouAgentauditEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询美柚审核Agent节点信息
     * Summary: 查询美柚审核Agent节点信息.
     *
     * @param QueryMeiyouAgentauditRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryMeiyouAgentauditResponse
     */
    public function queryMeiyouAgentauditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMeiyouAgentauditResponse::fromMap($this->doRequest('1.0', 'aitech.comm.meiyou.agentaudit.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新美柚审核Agent审核结果
     * Summary: 更新美柚审核Agent审核结果.
     *
     * @param UpdateAicoguardcoreMeiyouRequest $request
     *
     * @return UpdateAicoguardcoreMeiyouResponse
     */
    public function updateAicoguardcoreMeiyou($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateAicoguardcoreMeiyouEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新美柚审核Agent审核结果
     * Summary: 更新美柚审核Agent审核结果.
     *
     * @param UpdateAicoguardcoreMeiyouRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UpdateAicoguardcoreMeiyouResponse
     */
    public function updateAicoguardcoreMeiyouEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateAicoguardcoreMeiyouResponse::fromMap($this->doRequest('1.0', 'aitech.comm.aicoguardcore.meiyou.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文档人审入审
     * Summary: 文档人审入审
     *
     * @param SubmitGuardDocumentRequest $request
     *
     * @return SubmitGuardDocumentResponse
     */
    public function submitGuardDocument($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitGuardDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 文档人审入审
     * Summary: 文档人审入审
     *
     * @param SubmitGuardDocumentRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return SubmitGuardDocumentResponse
     */
    public function submitGuardDocumentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitGuardDocumentResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.document.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文档人审查询
     * Summary: 文档人审查询.
     *
     * @param QueryGuardDocumentRequest $request
     *
     * @return QueryGuardDocumentResponse
     */
    public function queryGuardDocument($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryGuardDocumentEx($request, $headers, $runtime);
    }

    /**
     * Description: 文档人审查询
     * Summary: 文档人审查询.
     *
     * @param QueryGuardDocumentRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryGuardDocumentResponse
     */
    public function queryGuardDocumentEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryGuardDocumentResponse::fromMap($this->doRequest('1.0', 'aitech.comm.guard.document.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
