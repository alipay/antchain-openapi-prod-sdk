<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DUANKA\Models\CheckAistudioModelRequest;
use AntChain\DUANKA\Models\CheckAistudioModelResponse;
use AntChain\DUANKA\Models\ImportAistudioOssRequest;
use AntChain\DUANKA\Models\ImportAistudioOssResponse;
use AntChain\DUANKA\Models\QueryAistudioModelRequest;
use AntChain\DUANKA\Models\QueryAistudioModelResponse;
use AntChain\DUANKA\Models\QueryBacktrackScoreRequest;
use AntChain\DUANKA\Models\QueryBacktrackScoreResponse;
use AntChain\DUANKA\Models\QueryCommonScoreRequest;
use AntChain\DUANKA\Models\QueryCommonScoreResponse;
use AntChain\DUANKA\Models\QueryDuankaEvaluationRequest;
use AntChain\DUANKA\Models\QueryDuankaEvaluationResponse;
use AntChain\DUANKA\Models\QueryHrUserRequest;
use AntChain\DUANKA\Models\QueryHrUserResponse;
use AntChain\DUANKA\Models\QueryIrBrandRequest;
use AntChain\DUANKA\Models\QueryIrBrandResponse;
use AntChain\DUANKA\Models\QuerySkyholdResRequest;
use AntChain\DUANKA\Models\QuerySkyholdResResponse;
use AntChain\DUANKA\Models\SubmitYunfengdieAuditRequest;
use AntChain\DUANKA\Models\SubmitYunfengdieAuditResponse;
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
            // 查询结果
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
                    'sdk_version'      => '1.1.0',
                    '_prod_code'       => 'DUANKA',
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
     * Description: 查询断卡结果
     * Summary: 查询断卡结果.
     *
     * @param QueryDuankaEvaluationRequest $request
     *
     * @return QueryDuankaEvaluationResponse
     */
    public function queryDuankaEvaluation($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDuankaEvaluationEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询断卡结果
     * Summary: 查询断卡结果.
     *
     * @param QueryDuankaEvaluationRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryDuankaEvaluationResponse
     */
    public function queryDuankaEvaluationEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDuankaEvaluationResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.duanka.evaluation.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: hr主数据用户信息查询接口
     * Summary: hr主数据用户信息查询接口.
     *
     * @param QueryHrUserRequest $request
     *
     * @return QueryHrUserResponse
     */
    public function queryHrUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryHrUserEx($request, $headers, $runtime);
    }

    /**
     * Description: hr主数据用户信息查询接口
     * Summary: hr主数据用户信息查询接口.
     *
     * @param QueryHrUserRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return QueryHrUserResponse
     */
    public function queryHrUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryHrUserResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.hr.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 天擎数据接口查询
     * Summary: 天擎数据接口查询.
     *
     * @param QuerySkyholdResRequest $request
     *
     * @return QuerySkyholdResResponse
     */
    public function querySkyholdRes($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySkyholdResEx($request, $headers, $runtime);
    }

    /**
     * Description: 天擎数据接口查询
     * Summary: 天擎数据接口查询.
     *
     * @param QuerySkyholdResRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QuerySkyholdResResponse
     */
    public function querySkyholdResEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySkyholdResResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.skyhold.res.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用查询
     * Summary: 通用查询.
     *
     * @param QueryCommonScoreRequest $request
     *
     * @return QueryCommonScoreResponse
     */
    public function queryCommonScore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCommonScoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用查询
     * Summary: 通用查询.
     *
     * @param QueryCommonScoreRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryCommonScoreResponse
     */
    public function queryCommonScoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCommonScoreResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.common.score.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 云凤蝶工单提交接口
     * Summary: 云凤蝶工单提交接口.
     *
     * @param SubmitYunfengdieAuditRequest $request
     *
     * @return SubmitYunfengdieAuditResponse
     */
    public function submitYunfengdieAudit($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitYunfengdieAuditEx($request, $headers, $runtime);
    }

    /**
     * Description: 云凤蝶工单提交接口
     * Summary: 云凤蝶工单提交接口.
     *
     * @param SubmitYunfengdieAuditRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SubmitYunfengdieAuditResponse
     */
    public function submitYunfengdieAuditEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitYunfengdieAuditResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.yunfengdie.audit.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件转存接口
     * Summary: 文件转存接口.
     *
     * @param ImportAistudioOssRequest $request
     *
     * @return ImportAistudioOssResponse
     */
    public function importAistudioOss($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importAistudioOssEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件转存接口
     * Summary: 文件转存接口.
     *
     * @param ImportAistudioOssRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return ImportAistudioOssResponse
     */
    public function importAistudioOssEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportAistudioOssResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.aistudio.oss.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 模型验收服务
     * Summary: 模型验收服务
     *
     * @param CheckAistudioModelRequest $request
     *
     * @return CheckAistudioModelResponse
     */
    public function checkAistudioModel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkAistudioModelEx($request, $headers, $runtime);
    }

    /**
     * Description: 模型验收服务
     * Summary: 模型验收服务
     *
     * @param CheckAistudioModelRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return CheckAistudioModelResponse
     */
    public function checkAistudioModelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckAistudioModelResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.aistudio.model.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 模型验收服务结果查询
     * Summary: 模型验收服务结果查询.
     *
     * @param QueryAistudioModelRequest $request
     *
     * @return QueryAistudioModelResponse
     */
    public function queryAistudioModel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAistudioModelEx($request, $headers, $runtime);
    }

    /**
     * Description: 模型验收服务结果查询
     * Summary: 模型验收服务结果查询.
     *
     * @param QueryAistudioModelRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryAistudioModelResponse
     */
    public function queryAistudioModelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAistudioModelResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.aistudio.model.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通用查询-回溯
     * Summary: 通用查询-回溯.
     *
     * @param QueryBacktrackScoreRequest $request
     *
     * @return QueryBacktrackScoreResponse
     */
    public function queryBacktrackScore($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBacktrackScoreEx($request, $headers, $runtime);
    }

    /**
     * Description: 通用查询-回溯
     * Summary: 通用查询-回溯.
     *
     * @param QueryBacktrackScoreRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryBacktrackScoreResponse
     */
    public function queryBacktrackScoreEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBacktrackScoreResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.backtrack.score.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 品牌研究数据查询
     * Summary: 品牌研究数据查询.
     *
     * @param QueryIrBrandRequest $request
     *
     * @return QueryIrBrandResponse
     */
    public function queryIrBrand($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIrBrandEx($request, $headers, $runtime);
    }

    /**
     * Description: 品牌研究数据查询
     * Summary: 品牌研究数据查询.
     *
     * @param QueryIrBrandRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryIrBrandResponse
     */
    public function queryIrBrandEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIrBrandResponse::fromMap($this->doRequest('1.0', 'antcloud.duanka.ir.brand.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
