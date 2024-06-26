<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Util\UtilClient;
use AntChain\YUQING\Models\CreateProjectRequest;
use AntChain\YUQING\Models\CreateProjectResponse;
use AntChain\YUQING\Models\DeleteProjectRequest;
use AntChain\YUQING\Models\DeleteProjectResponse;
use AntChain\YUQING\Models\GetHotspotTaskRequest;
use AntChain\YUQING\Models\GetHotspotTaskResponse;
use AntChain\YUQING\Models\GetMessageRequest;
use AntChain\YUQING\Models\GetMessageResponse;
use AntChain\YUQING\Models\GetMessagesHistoryRequest;
use AntChain\YUQING\Models\GetMessagesHistoryResponse;
use AntChain\YUQING\Models\GetStsTokenRequest;
use AntChain\YUQING\Models\GetStsTokenResponse;
use AntChain\YUQING\Models\OperateCommonInterfaceRequest;
use AntChain\YUQING\Models\OperateCommonInterfaceResponse;
use AntChain\YUQING\Models\QueryAlarmRequest;
use AntChain\YUQING\Models\QueryAlarmResponse;
use AntChain\YUQING\Models\QueryAnalysisQueryRequest;
use AntChain\YUQING\Models\QueryAnalysisQueryResponse;
use AntChain\YUQING\Models\QueryDeepanalysisQueryRequest;
use AntChain\YUQING\Models\QueryDeepanalysisQueryResponse;
use AntChain\YUQING\Models\QueryHotspotMessageRequest;
use AntChain\YUQING\Models\QueryHotspotMessageResponse;
use AntChain\YUQING\Models\QueryMessagesRequest;
use AntChain\YUQING\Models\QueryMessagesResponse;
use AntChain\YUQING\Models\QueryProjectRequest;
use AntChain\YUQING\Models\QueryProjectResponse;
use AntChain\YUQING\Models\SaveAnalysisSubmitRequest;
use AntChain\YUQING\Models\SaveAnalysisSubmitResponse;
use AntChain\YUQING\Models\SaveDeepanalysisSubmitRequest;
use AntChain\YUQING\Models\SaveDeepanalysisSubmitResponse;
use AntChain\YUQING\Models\SaveProductOpenRequest;
use AntChain\YUQING\Models\SaveProductOpenResponse;
use AntChain\YUQING\Models\SaveProductTopRequest;
use AntChain\YUQING\Models\SaveProductTopResponse;
use AntChain\YUQING\Models\SendProductNoticeRequest;
use AntChain\YUQING\Models\SendProductNoticeResponse;
use AntChain\YUQING\Models\SetProductOperateRequest;
use AntChain\YUQING\Models\SetProductOperateResponse;
use AntChain\YUQING\Models\SubmitHotspotTaskRequest;
use AntChain\YUQING\Models\SubmitHotspotTaskResponse;
use AntChain\YUQING\Models\SubmitMessagesHistoryRequest;
use AntChain\YUQING\Models\SubmitMessagesHistoryResponse;
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
            // 钉钉链接消息
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
                    'sdk_version'      => '1.2.21',
                    '_prod_code'       => 'YUQING',
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
     * Description: 查询舆情列表
     * Summary: 查询舆情列表.
     *
     * @param QueryMessagesRequest $request
     *
     * @return QueryMessagesResponse
     */
    public function queryMessages($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMessagesEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询舆情列表
     * Summary: 查询舆情列表.
     *
     * @param QueryMessagesRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryMessagesResponse
     */
    public function queryMessagesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMessagesResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.messages.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 舆情分析任务提交
     * Summary: 舆情分析任务提交.
     *
     * @param SaveAnalysisSubmitRequest $request
     *
     * @return SaveAnalysisSubmitResponse
     */
    public function saveAnalysisSubmit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveAnalysisSubmitEx($request, $headers, $runtime);
    }

    /**
     * Description: 舆情分析任务提交
     * Summary: 舆情分析任务提交.
     *
     * @param SaveAnalysisSubmitRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return SaveAnalysisSubmitResponse
     */
    public function saveAnalysisSubmitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveAnalysisSubmitResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.analysis.submit.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 舆情分析任务查询
     * Summary: 舆情分析任务查询.
     *
     * @param QueryAnalysisQueryRequest $request
     *
     * @return QueryAnalysisQueryResponse
     */
    public function queryAnalysisQuery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAnalysisQueryEx($request, $headers, $runtime);
    }

    /**
     * Description: 舆情分析任务查询
     * Summary: 舆情分析任务查询.
     *
     * @param QueryAnalysisQueryRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryAnalysisQueryResponse
     */
    public function queryAnalysisQueryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAnalysisQueryResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.analysis.query.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 废弃
     * Summary: 废弃.
     *
     * @param SaveProductOpenRequest $request
     *
     * @return SaveProductOpenResponse
     */
    public function saveProductOpen($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveProductOpenEx($request, $headers, $runtime);
    }

    /**
     * Description: 废弃
     * Summary: 废弃.
     *
     * @param SaveProductOpenRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SaveProductOpenResponse
     */
    public function saveProductOpenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveProductOpenResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.product.open.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 废弃
     * Summary: 废弃.
     *
     * @param SaveProductTopRequest $request
     *
     * @return SaveProductTopResponse
     */
    public function saveProductTop($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveProductTopEx($request, $headers, $runtime);
    }

    /**
     * Description: 废弃
     * Summary: 废弃.
     *
     * @param SaveProductTopRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SaveProductTopResponse
     */
    public function saveProductTopEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveProductTopResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.product.top.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 产品操作接口
     * Summary: 产品操作接口.
     *
     * @param SetProductOperateRequest $request
     *
     * @return SetProductOperateResponse
     */
    public function setProductOperate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setProductOperateEx($request, $headers, $runtime);
    }

    /**
     * Description: 产品操作接口
     * Summary: 产品操作接口.
     *
     * @param SetProductOperateRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SetProductOperateResponse
     */
    public function setProductOperateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetProductOperateResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.product.operate.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发送提醒
     * Summary: 发送提醒.
     *
     * @param SendProductNoticeRequest $request
     *
     * @return SendProductNoticeResponse
     */
    public function sendProductNotice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendProductNoticeEx($request, $headers, $runtime);
    }

    /**
     * Description: 发送提醒
     * Summary: 发送提醒.
     *
     * @param SendProductNoticeRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SendProductNoticeResponse
     */
    public function sendProductNoticeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendProductNoticeResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.product.notice.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建深度分析
     * Summary: 创建深度分析.
     *
     * @param SaveDeepanalysisSubmitRequest $request
     *
     * @return SaveDeepanalysisSubmitResponse
     */
    public function saveDeepanalysisSubmit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveDeepanalysisSubmitEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建深度分析
     * Summary: 创建深度分析.
     *
     * @param SaveDeepanalysisSubmitRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SaveDeepanalysisSubmitResponse
     */
    public function saveDeepanalysisSubmitEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveDeepanalysisSubmitResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.deepanalysis.submit.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询深度分析
     * Summary: 查询深度分析.
     *
     * @param QueryDeepanalysisQueryRequest $request
     *
     * @return QueryDeepanalysisQueryResponse
     */
    public function queryDeepanalysisQuery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeepanalysisQueryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询深度分析
     * Summary: 查询深度分析.
     *
     * @param QueryDeepanalysisQueryRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryDeepanalysisQueryResponse
     */
    public function queryDeepanalysisQueryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeepanalysisQueryResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.deepanalysis.query.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取单个與情
     * Summary: 获取单个.
     *
     * @param GetMessageRequest $request
     *
     * @return GetMessageResponse
     */
    public function getMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取单个與情
     * Summary: 获取单个.
     *
     * @param GetMessageRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetMessageResponse
     */
    public function getMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMessageResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.message.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询與情项目
     * Summary: 查询與情项目.
     *
     * @param QueryProjectRequest $request
     *
     * @return QueryProjectResponse
     */
    public function queryProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询與情项目
     * Summary: 查询與情项目.
     *
     * @param QueryProjectRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryProjectResponse
     */
    public function queryProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryProjectResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.project.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目.
     *
     * @param CreateProjectRequest $request
     *
     * @return CreateProjectResponse
     */
    public function createProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建项目
     * Summary: 创建项目.
     *
     * @param CreateProjectRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return CreateProjectResponse
     */
    public function createProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateProjectResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.project.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除项目
     * Summary: 删除项目.
     *
     * @param DeleteProjectRequest $request
     *
     * @return DeleteProjectResponse
     */
    public function deleteProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除项目
     * Summary: 删除项目.
     *
     * @param DeleteProjectRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return DeleteProjectResponse
     */
    public function deleteProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteProjectResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.project.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询预警消息列表
     * Summary: 查询预警消息列表.
     *
     * @param QueryAlarmRequest $request
     *
     * @return QueryAlarmResponse
     */
    public function queryAlarm($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAlarmEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询预警消息列表
     * Summary: 查询预警消息列表.
     *
     * @param QueryAlarmRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return QueryAlarmResponse
     */
    public function queryAlarmEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAlarmResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.alarm.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据接口获取热搜数据
     * Summary: 與情热搜接口.
     *
     * @param QueryHotspotMessageRequest $request
     *
     * @return QueryHotspotMessageResponse
     */
    public function queryHotspotMessage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryHotspotMessageEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据接口获取热搜数据
     * Summary: 與情热搜接口.
     *
     * @param QueryHotspotMessageRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryHotspotMessageResponse
     */
    public function queryHotspotMessageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryHotspotMessageResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.hotspot.message.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 與情历史数据异步查询接口
     * Summary: 與情历史数据异步查询接口.
     *
     * @param SubmitMessagesHistoryRequest $request
     *
     * @return SubmitMessagesHistoryResponse
     */
    public function submitMessagesHistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitMessagesHistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 與情历史数据异步查询接口
     * Summary: 與情历史数据异步查询接口.
     *
     * @param SubmitMessagesHistoryRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SubmitMessagesHistoryResponse
     */
    public function submitMessagesHistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitMessagesHistoryResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.messages.history.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取历史與情消息
     * Summary: 获取历史與情消息.
     *
     * @param GetMessagesHistoryRequest $request
     *
     * @return GetMessagesHistoryResponse
     */
    public function getMessagesHistory($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getMessagesHistoryEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取历史與情消息
     * Summary: 获取历史與情消息.
     *
     * @param GetMessagesHistoryRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetMessagesHistoryResponse
     */
    public function getMessagesHistoryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetMessagesHistoryResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.messages.history.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交实时热搜任务
     * Summary: 提交实时热搜任务
     *
     * @param SubmitHotspotTaskRequest $request
     *
     * @return SubmitHotspotTaskResponse
     */
    public function submitHotspotTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitHotspotTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交实时热搜任务
     * Summary: 提交实时热搜任务
     *
     * @param SubmitHotspotTaskRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return SubmitHotspotTaskResponse
     */
    public function submitHotspotTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitHotspotTaskResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.hotspot.task.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取实时热搜任务结果
     * Summary: 获取实时热搜任务结果.
     *
     * @param GetHotspotTaskRequest $request
     *
     * @return GetHotspotTaskResponse
     */
    public function getHotspotTask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getHotspotTaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取实时热搜任务结果
     * Summary: 获取实时热搜任务结果.
     *
     * @param GetHotspotTaskRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return GetHotspotTaskResponse
     */
    public function getHotspotTaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetHotspotTaskResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.hotspot.task.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取stsToken，作用于通用SAAS业务
     * Summary: 获取stsToken.
     *
     * @param GetStsTokenRequest $request
     *
     * @return GetStsTokenResponse
     */
    public function getStsToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getStsTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取stsToken，作用于通用SAAS业务
     * Summary: 获取stsToken.
     *
     * @param GetStsTokenRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return GetStsTokenResponse
     */
    public function getStsTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetStsTokenResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.sts.token.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用操作接口
     * Summary: 通用操作接口.
     *
     * @param OperateCommonInterfaceRequest $request
     *
     * @return OperateCommonInterfaceResponse
     */
    public function operateCommonInterface($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateCommonInterfaceEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用操作接口
     * Summary: 通用操作接口.
     *
     * @param OperateCommonInterfaceRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return OperateCommonInterfaceResponse
     */
    public function operateCommonInterfaceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateCommonInterfaceResponse::fromMap($this->doRequest('1.0', 'universalsaas.yuqing.common.interface.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
