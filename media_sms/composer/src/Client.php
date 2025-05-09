<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\MEDIA_SMS\Models\CreateBatchSendRequest;
use AntChain\MEDIA_SMS\Models\CreateBatchSendResponse;
use AntChain\MEDIA_SMS\Models\CreateShortmsgTemplateRequest;
use AntChain\MEDIA_SMS\Models\CreateShortmsgTemplateResponse;
use AntChain\MEDIA_SMS\Models\CreateShorturlRequest;
use AntChain\MEDIA_SMS\Models\CreateShorturlResponse;
use AntChain\MEDIA_SMS\Models\CreateTemplateRequest;
use AntChain\MEDIA_SMS\Models\CreateTemplateResponse;
use AntChain\MEDIA_SMS\Models\QueryAccountMsgstatusRequest;
use AntChain\MEDIA_SMS\Models\QueryAccountMsgstatusResponse;
use AntChain\MEDIA_SMS\Models\QueryAccountShorturlparseresultRequest;
use AntChain\MEDIA_SMS\Models\QueryAccountShorturlparseresultResponse;
use AntChain\MEDIA_SMS\Models\QueryMsgStatusRequest;
use AntChain\MEDIA_SMS\Models\QueryMsgStatusResponse;
use AntChain\MEDIA_SMS\Models\QueryReplyRequest;
use AntChain\MEDIA_SMS\Models\QueryReplyResponse;
use AntChain\MEDIA_SMS\Models\QueryShorturlParseabilityRequest;
use AntChain\MEDIA_SMS\Models\QueryShorturlParseabilityResponse;
use AntChain\MEDIA_SMS\Models\QueryShorturlParseresultRequest;
use AntChain\MEDIA_SMS\Models\QueryShorturlParseresultResponse;
use AntChain\MEDIA_SMS\Models\QueryTemplateStatusRequest;
use AntChain\MEDIA_SMS\Models\QueryTemplateStatusResponse;
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
            // 短链结果
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
                    'sdk_version'      => '1.1.1',
                    '_prod_code'       => 'MEDIA_SMS',
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
     * Description: 查询手机号所在设备当前解析短链的能力
     * Summary: 短链解析能力查询.
     *
     * @param QueryShorturlParseabilityRequest $request
     *
     * @return QueryShorturlParseabilityResponse
     */
    public function queryShorturlParseability($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryShorturlParseabilityEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询手机号所在设备当前解析短链的能力
     * Summary: 短链解析能力查询.
     *
     * @param QueryShorturlParseabilityRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryShorturlParseabilityResponse
     */
    public function queryShorturlParseabilityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryShorturlParseabilityResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.shorturl.parseability.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短链生成
     * Summary: 短链生成.
     *
     * @param CreateShorturlRequest $request
     *
     * @return CreateShorturlResponse
     */
    public function createShorturl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createShorturlEx($request, $headers, $runtime);
    }

    /**
     * Description: 短链生成
     * Summary: 短链生成.
     *
     * @param CreateShorturlRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateShorturlResponse
     */
    public function createShorturlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateShorturlResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.shorturl.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短链解析结果查询
     * Summary: 短链解析结果查询.
     *
     * @param QueryShorturlParseresultRequest $request
     *
     * @return QueryShorturlParseresultResponse
     */
    public function queryShorturlParseresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryShorturlParseresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 短链解析结果查询
     * Summary: 短链解析结果查询.
     *
     * @param QueryShorturlParseresultRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryShorturlParseresultResponse
     */
    public function queryShorturlParseresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryShorturlParseresultResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.shorturl.parseresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 普短模板创建
     * Summary: 普短模板创建.
     *
     * @param CreateShortmsgTemplateRequest $request
     *
     * @return CreateShortmsgTemplateResponse
     */
    public function createShortmsgTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createShortmsgTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 普短模板创建
     * Summary: 普短模板创建.
     *
     * @param CreateShortmsgTemplateRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateShortmsgTemplateResponse
     */
    public function createShortmsgTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateShortmsgTemplateResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.shortmsg.template.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按帐号查询短链解析情况
     * Summary: 按帐号查询短链解析情况.
     *
     * @param QueryAccountShorturlparseresultRequest $request
     *
     * @return QueryAccountShorturlparseresultResponse
     */
    public function queryAccountShorturlparseresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAccountShorturlparseresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 按帐号查询短链解析情况
     * Summary: 按帐号查询短链解析情况.
     *
     * @param QueryAccountShorturlparseresultRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryAccountShorturlparseresultResponse
     */
    public function queryAccountShorturlparseresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAccountShorturlparseresultResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.account.shorturlparseresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上行内容查询
     * Summary: 上行内容查询.
     *
     * @param QueryReplyRequest $request
     *
     * @return QueryReplyResponse
     */
    public function queryReply($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryReplyEx($request, $headers, $runtime);
    }

    /**
     * Description: 上行内容查询
     * Summary: 上行内容查询.
     *
     * @param QueryReplyRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryReplyResponse
     */
    public function queryReplyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryReplyResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.reply.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短信模版创建
     * Summary: 短信模版创建.
     *
     * @param CreateTemplateRequest $request
     *
     * @return CreateTemplateResponse
     */
    public function createTemplate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createTemplateEx($request, $headers, $runtime);
    }

    /**
     * Description: 短信模版创建
     * Summary: 短信模版创建.
     *
     * @param CreateTemplateRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateTemplateResponse
     */
    public function createTemplateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateTemplateResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.template.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短信模板审核结果查询
     * Summary: 短信模板审核结果查询.
     *
     * @param QueryTemplateStatusRequest $request
     *
     * @return QueryTemplateStatusResponse
     */
    public function queryTemplateStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryTemplateStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 短信模板审核结果查询
     * Summary: 短信模板审核结果查询.
     *
     * @param QueryTemplateStatusRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryTemplateStatusResponse
     */
    public function queryTemplateStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryTemplateStatusResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.template.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短信批量发送任务创建
     * Summary: 短信批量发送任务创建.
     *
     * @param CreateBatchSendRequest $request
     *
     * @return CreateBatchSendResponse
     */
    public function createBatchSend($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBatchSendEx($request, $headers, $runtime);
    }

    /**
     * Description: 短信批量发送任务创建
     * Summary: 短信批量发送任务创建.
     *
     * @param CreateBatchSendRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateBatchSendResponse
     */
    public function createBatchSendEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBatchSendResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.batch.send.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 短信发送状态查询
     * Summary: 短信发送状态查询.
     *
     * @param QueryMsgStatusRequest $request
     *
     * @return QueryMsgStatusResponse
     */
    public function queryMsgStatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMsgStatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 短信发送状态查询
     * Summary: 短信发送状态查询.
     *
     * @param QueryMsgStatusRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryMsgStatusResponse
     */
    public function queryMsgStatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMsgStatusResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.msg.status.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据账户id查询短信结果
     * Summary: 根据账户id查询短信结果.
     *
     * @param QueryAccountMsgstatusRequest $request
     *
     * @return QueryAccountMsgstatusResponse
     */
    public function queryAccountMsgstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAccountMsgstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据账户id查询短信结果
     * Summary: 根据账户id查询短信结果.
     *
     * @param QueryAccountMsgstatusRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryAccountMsgstatusResponse
     */
    public function queryAccountMsgstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAccountMsgstatusResponse::fromMap($this->doRequest('1.0', 'antdigital.mediasms.account.msgstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
