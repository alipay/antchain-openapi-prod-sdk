<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\AddUniversalsaasDigitalhumanChatSettingRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\AddUniversalsaasDigitalhumanChatSettingResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\AddUniversalsaasDigitalhumanKnowledgeRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\AddUniversalsaasDigitalhumanKnowledgeResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\AddUniversalsaasDigitalhumanLibraryRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\AddUniversalsaasDigitalhumanLibraryResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\DeleteUniversalsaasDigitalhumanChatSettingRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\DeleteUniversalsaasDigitalhumanChatSettingResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\DeleteUniversalsaasDigitalhumanLibraryRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\DeleteUniversalsaasDigitalhumanLibraryResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\ListUniversalsaasDigitalhumanHumanRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\ListUniversalsaasDigitalhumanHumanResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\ListUniversalsaasDigitalhumanLibraryRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\ListUniversalsaasDigitalhumanLibraryResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\ListUniversalsaasDigitalhumanLlmChatRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\ListUniversalsaasDigitalhumanLlmChatResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\OfflineUniversalsaasDigitalhumanChatSettingRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\OfflineUniversalsaasDigitalhumanChatSettingResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\OfflineUniversalsaasDigitalhumanKnowledgeRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\OfflineUniversalsaasDigitalhumanKnowledgeResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\OnlineUniversalsaasDigitalhumanChatSettingRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\OnlineUniversalsaasDigitalhumanChatSettingResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\OnlineUniversalsaasDigitalhumanKnowledgeRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\OnlineUniversalsaasDigitalhumanKnowledgeResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\SetUniversalsaasDigitalhumanChatSettingRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\SetUniversalsaasDigitalhumanChatSettingResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\UpdateUniversalsaasDigitalhumanKnowledgeRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\UpdateUniversalsaasDigitalhumanKnowledgeResponse;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\UpdateUniversalsaasDigitalhumanLibraryRequest;
use AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models\UpdateUniversalsaasDigitalhumanLibraryResponse;
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
            // 数字人平台--角色信息
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
                    'sdk_version'      => '1.1.4',
                    '_prod_code'       => 'ak_ed7107878c564eda98e507d7451aae75',
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
     * Description: 数字人角色列表查询接口
     * Summary: 数字人角色列表查询接口.
     *
     * @param ListUniversalsaasDigitalhumanHumanRequest $request
     *
     * @return ListUniversalsaasDigitalhumanHumanResponse
     */
    public function listUniversalsaasDigitalhumanHuman($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUniversalsaasDigitalhumanHumanEx($request, $headers, $runtime);
    }

    /**
     * Description: 数字人角色列表查询接口
     * Summary: 数字人角色列表查询接口.
     *
     * @param ListUniversalsaasDigitalhumanHumanRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return ListUniversalsaasDigitalhumanHumanResponse
     */
    public function listUniversalsaasDigitalhumanHumanEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUniversalsaasDigitalhumanHumanResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.human.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识库列表查询接口
     * Summary: 知识库列表查询接口.
     *
     * @param ListUniversalsaasDigitalhumanLibraryRequest $request
     *
     * @return ListUniversalsaasDigitalhumanLibraryResponse
     */
    public function listUniversalsaasDigitalhumanLibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUniversalsaasDigitalhumanLibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识库列表查询接口
     * Summary: 知识库列表查询接口.
     *
     * @param ListUniversalsaasDigitalhumanLibraryRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return ListUniversalsaasDigitalhumanLibraryResponse
     */
    public function listUniversalsaasDigitalhumanLibraryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUniversalsaasDigitalhumanLibraryResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.library.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建知识库接口
     * Summary: 创建知识库接口.
     *
     * @param AddUniversalsaasDigitalhumanLibraryRequest $request
     *
     * @return AddUniversalsaasDigitalhumanLibraryResponse
     */
    public function addUniversalsaasDigitalhumanLibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addUniversalsaasDigitalhumanLibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建知识库接口
     * Summary: 创建知识库接口.
     *
     * @param AddUniversalsaasDigitalhumanLibraryRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return AddUniversalsaasDigitalhumanLibraryResponse
     */
    public function addUniversalsaasDigitalhumanLibraryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddUniversalsaasDigitalhumanLibraryResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.library.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 编辑知识库接口
     * Summary: 编辑知识库接口.
     *
     * @param UpdateUniversalsaasDigitalhumanLibraryRequest $request
     *
     * @return UpdateUniversalsaasDigitalhumanLibraryResponse
     */
    public function updateUniversalsaasDigitalhumanLibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateUniversalsaasDigitalhumanLibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: 编辑知识库接口
     * Summary: 编辑知识库接口.
     *
     * @param UpdateUniversalsaasDigitalhumanLibraryRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return UpdateUniversalsaasDigitalhumanLibraryResponse
     */
    public function updateUniversalsaasDigitalhumanLibraryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateUniversalsaasDigitalhumanLibraryResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.library.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除知识库接口
     * Summary: 删除知识库接口.
     *
     * @param DeleteUniversalsaasDigitalhumanLibraryRequest $request
     *
     * @return DeleteUniversalsaasDigitalhumanLibraryResponse
     */
    public function deleteUniversalsaasDigitalhumanLibrary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteUniversalsaasDigitalhumanLibraryEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除知识库接口
     * Summary: 删除知识库接口.
     *
     * @param DeleteUniversalsaasDigitalhumanLibraryRequest $request
     * @param string[]                                      $headers
     * @param RuntimeOptions                                $runtime
     *
     * @return DeleteUniversalsaasDigitalhumanLibraryResponse
     */
    public function deleteUniversalsaasDigitalhumanLibraryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteUniversalsaasDigitalhumanLibraryResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.library.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增知识点接口
     * Summary: 新增知识点接口.
     *
     * @param AddUniversalsaasDigitalhumanKnowledgeRequest $request
     *
     * @return AddUniversalsaasDigitalhumanKnowledgeResponse
     */
    public function addUniversalsaasDigitalhumanKnowledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addUniversalsaasDigitalhumanKnowledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增知识点接口
     * Summary: 新增知识点接口.
     *
     * @param AddUniversalsaasDigitalhumanKnowledgeRequest $request
     * @param string[]                                     $headers
     * @param RuntimeOptions                               $runtime
     *
     * @return AddUniversalsaasDigitalhumanKnowledgeResponse
     */
    public function addUniversalsaasDigitalhumanKnowledgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddUniversalsaasDigitalhumanKnowledgeResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.knowledge.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 编辑知识点接口
     * Summary: 编辑知识点接口.
     *
     * @param UpdateUniversalsaasDigitalhumanKnowledgeRequest $request
     *
     * @return UpdateUniversalsaasDigitalhumanKnowledgeResponse
     */
    public function updateUniversalsaasDigitalhumanKnowledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateUniversalsaasDigitalhumanKnowledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 编辑知识点接口
     * Summary: 编辑知识点接口.
     *
     * @param UpdateUniversalsaasDigitalhumanKnowledgeRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return UpdateUniversalsaasDigitalhumanKnowledgeResponse
     */
    public function updateUniversalsaasDigitalhumanKnowledgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateUniversalsaasDigitalhumanKnowledgeResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.knowledge.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布知识点接口
     * Summary: 发布知识点接口.
     *
     * @param OnlineUniversalsaasDigitalhumanKnowledgeRequest $request
     *
     * @return OnlineUniversalsaasDigitalhumanKnowledgeResponse
     */
    public function onlineUniversalsaasDigitalhumanKnowledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->onlineUniversalsaasDigitalhumanKnowledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布知识点接口
     * Summary: 发布知识点接口.
     *
     * @param OnlineUniversalsaasDigitalhumanKnowledgeRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return OnlineUniversalsaasDigitalhumanKnowledgeResponse
     */
    public function onlineUniversalsaasDigitalhumanKnowledgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OnlineUniversalsaasDigitalhumanKnowledgeResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.knowledge.online', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 下线知识点接口
     * Summary: 下线知识点接口.
     *
     * @param OfflineUniversalsaasDigitalhumanKnowledgeRequest $request
     *
     * @return OfflineUniversalsaasDigitalhumanKnowledgeResponse
     */
    public function offlineUniversalsaasDigitalhumanKnowledge($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineUniversalsaasDigitalhumanKnowledgeEx($request, $headers, $runtime);
    }

    /**
     * Description: 下线知识点接口
     * Summary: 下线知识点接口.
     *
     * @param OfflineUniversalsaasDigitalhumanKnowledgeRequest $request
     * @param string[]                                         $headers
     * @param RuntimeOptions                                   $runtime
     *
     * @return OfflineUniversalsaasDigitalhumanKnowledgeResponse
     */
    public function offlineUniversalsaasDigitalhumanKnowledgeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineUniversalsaasDigitalhumanKnowledgeResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.knowledge.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询大模型对话列表接口
     * Summary: 查询大模型对话列表接口.
     *
     * @param ListUniversalsaasDigitalhumanLlmChatRequest $request
     *
     * @return ListUniversalsaasDigitalhumanLlmChatResponse
     */
    public function listUniversalsaasDigitalhumanLlmChat($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listUniversalsaasDigitalhumanLlmChatEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询大模型对话列表接口
     * Summary: 查询大模型对话列表接口.
     *
     * @param ListUniversalsaasDigitalhumanLlmChatRequest $request
     * @param string[]                                    $headers
     * @param RuntimeOptions                              $runtime
     *
     * @return ListUniversalsaasDigitalhumanLlmChatResponse
     */
    public function listUniversalsaasDigitalhumanLlmChatEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListUniversalsaasDigitalhumanLlmChatResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.llm.chat.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 新增交互配置接口
     * Summary: 新增交互配置接口.
     *
     * @param AddUniversalsaasDigitalhumanChatSettingRequest $request
     *
     * @return AddUniversalsaasDigitalhumanChatSettingResponse
     */
    public function addUniversalsaasDigitalhumanChatSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 新增交互配置接口
     * Summary: 新增交互配置接口.
     *
     * @param AddUniversalsaasDigitalhumanChatSettingRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return AddUniversalsaasDigitalhumanChatSettingResponse
     */
    public function addUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddUniversalsaasDigitalhumanChatSettingResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.chat.setting.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 编辑交互配置接口
     * Summary: 编辑交互配置接口.
     *
     * @param SetUniversalsaasDigitalhumanChatSettingRequest $request
     *
     * @return SetUniversalsaasDigitalhumanChatSettingResponse
     */
    public function setUniversalsaasDigitalhumanChatSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->setUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 编辑交互配置接口
     * Summary: 编辑交互配置接口.
     *
     * @param SetUniversalsaasDigitalhumanChatSettingRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return SetUniversalsaasDigitalhumanChatSettingResponse
     */
    public function setUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SetUniversalsaasDigitalhumanChatSettingResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.chat.setting.set', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除交互配置接口
     * Summary: 删除交互配置接口.
     *
     * @param DeleteUniversalsaasDigitalhumanChatSettingRequest $request
     *
     * @return DeleteUniversalsaasDigitalhumanChatSettingResponse
     */
    public function deleteUniversalsaasDigitalhumanChatSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除交互配置接口
     * Summary: 删除交互配置接口.
     *
     * @param DeleteUniversalsaasDigitalhumanChatSettingRequest $request
     * @param string[]                                          $headers
     * @param RuntimeOptions                                    $runtime
     *
     * @return DeleteUniversalsaasDigitalhumanChatSettingResponse
     */
    public function deleteUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteUniversalsaasDigitalhumanChatSettingResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.chat.setting.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布交互配置接口
     * Summary: 发布交互配置接口.
     *
     * @param OnlineUniversalsaasDigitalhumanChatSettingRequest $request
     *
     * @return OnlineUniversalsaasDigitalhumanChatSettingResponse
     */
    public function onlineUniversalsaasDigitalhumanChatSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->onlineUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布交互配置接口
     * Summary: 发布交互配置接口.
     *
     * @param OnlineUniversalsaasDigitalhumanChatSettingRequest $request
     * @param string[]                                          $headers
     * @param RuntimeOptions                                    $runtime
     *
     * @return OnlineUniversalsaasDigitalhumanChatSettingResponse
     */
    public function onlineUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OnlineUniversalsaasDigitalhumanChatSettingResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.chat.setting.online', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 下线交互配置接口
     * Summary: 下线交互配置接口.
     *
     * @param OfflineUniversalsaasDigitalhumanChatSettingRequest $request
     *
     * @return OfflineUniversalsaasDigitalhumanChatSettingResponse
     */
    public function offlineUniversalsaasDigitalhumanChatSetting($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->offlineUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime);
    }

    /**
     * Description: 下线交互配置接口
     * Summary: 下线交互配置接口.
     *
     * @param OfflineUniversalsaasDigitalhumanChatSettingRequest $request
     * @param string[]                                           $headers
     * @param RuntimeOptions                                     $runtime
     *
     * @return OfflineUniversalsaasDigitalhumanChatSettingResponse
     */
    public function offlineUniversalsaasDigitalhumanChatSettingEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OfflineUniversalsaasDigitalhumanChatSettingResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.chat.setting.offline', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询批量导入任务
     * Summary: 查询批量导入任务
     *
     * @param QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest $request
     *
     * @return QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse
     */
    public function queryUniversalsaasDigitalhumanKnowledgeImporttask($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUniversalsaasDigitalhumanKnowledgeImporttaskEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询批量导入任务
     * Summary: 查询批量导入任务
     *
     * @param QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest $request
     * @param string[]                                                 $headers
     * @param RuntimeOptions                                           $runtime
     *
     * @return QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse
     */
    public function queryUniversalsaasDigitalhumanKnowledgeImporttaskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse::fromMap($this->doRequest('1.0', 'universalsaas.digitalhuman.knowledge.importtask.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
