<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\TAM\Models\ImportScFileRequest;
use AntChain\TAM\Models\ImportScFileResponse;
use AntChain\TAM\Models\ImportScOperationcenterRequest;
use AntChain\TAM\Models\ImportScOperationcenterResponse;
use AntChain\TAM\Models\OperateScOperationcenterRequest;
use AntChain\TAM\Models\OperateScOperationcenterResponse;
use AntChain\TAM\Models\QueryAoneRequest;
use AntChain\TAM\Models\QueryAoneResponse;
use AntChain\TAM\Models\QueryCodeRequest;
use AntChain\TAM\Models\QueryCodeResponse;
use AntChain\TAM\Models\QueryCustomRequest;
use AntChain\TAM\Models\QueryCustomResponse;
use AntChain\TAM\Models\QueryProductRequest;
use AntChain\TAM\Models\QueryProductResponse;
use AntChain\TAM\Models\QueryProjectGetprojectRequest;
use AntChain\TAM\Models\QueryProjectGetprojectResponse;
use AntChain\TAM\Models\QueryProjectPagequeryRequest;
use AntChain\TAM\Models\QueryProjectPagequeryResponse;
use AntChain\TAM\Models\QueryScOperationcenterRequest;
use AntChain\TAM\Models\QueryScOperationcenterResponse;
use AntChain\TAM\Models\QueryScTestRequest;
use AntChain\TAM\Models\QueryScTestResponse;
use AntChain\TAM\Models\SaveAoneRequest;
use AntChain\TAM\Models\SaveAoneResponse;
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
            // 附件上传表单参数
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
                    '_prod_code'       => 'TAM',
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
     * Description: 查询售后中心项目信息
     * Summary: 查询售后中心项目信息.
     *
     * @param QueryCustomRequest $request
     *
     * @return QueryCustomResponse
     */
    public function queryCustom($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCustomEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询售后中心项目信息
     * Summary: 查询售后中心项目信息.
     *
     * @param QueryCustomRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryCustomResponse
     */
    public function queryCustomEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCustomResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.custom.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: 查询双百L3code.
     *
     * @param QueryCodeRequest $request
     *
     * @return QueryCodeResponse
     */
    public function queryCode($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCodeEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: 查询双百L3code.
     *
     * @param QueryCodeRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryCodeResponse
     */
    public function queryCodeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCodeResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.code.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: 根据l3code列表查询产品信息.
     *
     * @param QueryProductRequest $request
     *
     * @return QueryProductResponse
     */
    public function queryProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryProductEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: 根据l3code列表查询产品信息.
     *
     * @param QueryProductRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryProductResponse
     */
    public function queryProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryProductResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.product.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商务中心项目，便于获取增值服务项目
     * Summary: 查询商务中心项目，便于获取增值服务项目.
     *
     * @param QueryProjectPagequeryRequest $request
     *
     * @return QueryProjectPagequeryResponse
     */
    public function queryProjectPagequery($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryProjectPagequeryEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商务中心项目，便于获取增值服务项目
     * Summary: 查询商务中心项目，便于获取增值服务项目.
     *
     * @param QueryProjectPagequeryRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryProjectPagequeryResponse
     */
    public function queryProjectPagequeryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryProjectPagequeryResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.project.pagequery.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询商务中心项目信息
     * Summary: 查询商务中心项目信息.
     *
     * @param QueryProjectGetprojectRequest $request
     *
     * @return QueryProjectGetprojectResponse
     */
    public function queryProjectGetproject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryProjectGetprojectEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询商务中心项目信息
     * Summary: 查询商务中心项目信息.
     *
     * @param QueryProjectGetprojectRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryProjectGetprojectResponse
     */
    public function queryProjectGetprojectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryProjectGetprojectResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.project.getproject.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提交到aone
     * Summary: 提交到aone.
     *
     * @param SaveAoneRequest $request
     *
     * @return SaveAoneResponse
     */
    public function saveAone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveAoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 提交到aone
     * Summary: 提交到aone.
     *
     * @param SaveAoneRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return SaveAoneResponse
     */
    public function saveAoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveAoneResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.aone.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询aone详情
     * Summary: 查询aone详情.
     *
     * @param QueryAoneRequest $request
     *
     * @return QueryAoneResponse
     */
    public function queryAone($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAoneEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询aone详情
     * Summary: 查询aone详情.
     *
     * @param QueryAoneRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryAoneResponse
     */
    public function queryAoneEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAoneResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.aone.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
     * Summary: 前端提交需求表单.
     *
     * @param ImportScOperationcenterRequest $request
     *
     * @return ImportScOperationcenterResponse
     */
    public function importScOperationcenter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importScOperationcenterEx($request, $headers, $runtime);
    }

    /**
     * Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
     * Summary: 前端提交需求表单.
     *
     * @param ImportScOperationcenterRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ImportScOperationcenterResponse
     */
    public function importScOperationcenterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportScOperationcenterResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.sc.operationcenter.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发送验证码
     * Summary: 发送验证码
     *
     * @param OperateScOperationcenterRequest $request
     *
     * @return OperateScOperationcenterResponse
     */
    public function operateScOperationcenter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->operateScOperationcenterEx($request, $headers, $runtime);
    }

    /**
     * Description: 发送验证码
     * Summary: 发送验证码
     *
     * @param OperateScOperationcenterRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return OperateScOperationcenterResponse
     */
    public function operateScOperationcenterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OperateScOperationcenterResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.sc.operationcenter.operate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询跟进情况
     * Summary: 查询跟进情况.
     *
     * @param QueryScOperationcenterRequest $request
     *
     * @return QueryScOperationcenterResponse
     */
    public function queryScOperationcenter($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryScOperationcenterEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询跟进情况
     * Summary: 查询跟进情况.
     *
     * @param QueryScOperationcenterRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryScOperationcenterResponse
     */
    public function queryScOperationcenterEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryScOperationcenterResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.sc.operationcenter.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 附件上传
     * Summary: 附件上传.
     *
     * @param ImportScFileRequest $request
     *
     * @return ImportScFileResponse
     */
    public function importScFile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importScFileEx($request, $headers, $runtime);
    }

    /**
     * Description: 附件上传
     * Summary: 附件上传.
     *
     * @param ImportScFileRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return ImportScFileResponse
     */
    public function importScFileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportScFileResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.sc.file.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description:
     * Summary: 测试.
     *
     * @param QueryScTestRequest $request
     *
     * @return QueryScTestResponse
     */
    public function queryScTest($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryScTestEx($request, $headers, $runtime);
    }

    /**
     * Description:
     * Summary: 测试.
     *
     * @param QueryScTestRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryScTestResponse
     */
    public function queryScTestEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryScTestResponse::fromMap($this->doRequest('1.0', 'antcloud.tam.sc.test.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
