<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Util\UtilClient;
use AntChain\WEBTRWATRADE\Models\AddIssuerProjectkeyRequest;
use AntChain\WEBTRWATRADE\Models\AddIssuerProjectkeyResponse;
use AntChain\WEBTRWATRADE\Models\CountDistributorDatasummaryRequest;
use AntChain\WEBTRWATRADE\Models\CountDistributorDatasummaryResponse;
use AntChain\WEBTRWATRADE\Models\CountDistributorSubusertargetRequest;
use AntChain\WEBTRWATRADE\Models\CountDistributorSubusertargetResponse;
use AntChain\WEBTRWATRADE\Models\CountIssuerDatasummaryRequest;
use AntChain\WEBTRWATRADE\Models\CountIssuerDatasummaryResponse;
use AntChain\WEBTRWATRADE\Models\CreateDistributorSubuserRequest;
use AntChain\WEBTRWATRADE\Models\CreateDistributorSubuserResponse;
use AntChain\WEBTRWATRADE\Models\CreateIssuerKeyRequest;
use AntChain\WEBTRWATRADE\Models\CreateIssuerKeyResponse;
use AntChain\WEBTRWATRADE\Models\CreateIssuerProjectRequest;
use AntChain\WEBTRWATRADE\Models\CreateIssuerProjectResponse;
use AntChain\WEBTRWATRADE\Models\DeleteDistributorSubuserRequest;
use AntChain\WEBTRWATRADE\Models\DeleteDistributorSubuserResponse;
use AntChain\WEBTRWATRADE\Models\DeleteIssuerKeyRequest;
use AntChain\WEBTRWATRADE\Models\DeleteIssuerKeyResponse;
use AntChain\WEBTRWATRADE\Models\DeleteIssuerProjectkeyRequest;
use AntChain\WEBTRWATRADE\Models\DeleteIssuerProjectkeyResponse;
use AntChain\WEBTRWATRADE\Models\DetailDistributorProjectRequest;
use AntChain\WEBTRWATRADE\Models\DetailDistributorProjectResponse;
use AntChain\WEBTRWATRADE\Models\DetailIssuerKeyRequest;
use AntChain\WEBTRWATRADE\Models\DetailIssuerKeyResponse;
use AntChain\WEBTRWATRADE\Models\DetailIssuerProjectRequest;
use AntChain\WEBTRWATRADE\Models\DetailIssuerProjectResponse;
use AntChain\WEBTRWATRADE\Models\DownloadDistributorReportRequest;
use AntChain\WEBTRWATRADE\Models\DownloadDistributorReportResponse;
use AntChain\WEBTRWATRADE\Models\DownloadIssuerReportRequest;
use AntChain\WEBTRWATRADE\Models\DownloadIssuerReportResponse;
use AntChain\WEBTRWATRADE\Models\EnableIssuerProjectRequest;
use AntChain\WEBTRWATRADE\Models\EnableIssuerProjectResponse;
use AntChain\WEBTRWATRADE\Models\IssueIssuerSubusertradeRequest;
use AntChain\WEBTRWATRADE\Models\IssueIssuerSubusertradeResponse;
use AntChain\WEBTRWATRADE\Models\ListDistributorDatasummaryRequest;
use AntChain\WEBTRWATRADE\Models\ListDistributorDatasummaryResponse;
use AntChain\WEBTRWATRADE\Models\ListDistributorReportRequest;
use AntChain\WEBTRWATRADE\Models\ListDistributorReportResponse;
use AntChain\WEBTRWATRADE\Models\ListIssuerDatasummaryRequest;
use AntChain\WEBTRWATRADE\Models\ListIssuerDatasummaryResponse;
use AntChain\WEBTRWATRADE\Models\ListIssuerInstitutionRequest;
use AntChain\WEBTRWATRADE\Models\ListIssuerInstitutionResponse;
use AntChain\WEBTRWATRADE\Models\ListIssuerNetvalueRequest;
use AntChain\WEBTRWATRADE\Models\ListIssuerNetvalueResponse;
use AntChain\WEBTRWATRADE\Models\ListIssuerProjectkeyRequest;
use AntChain\WEBTRWATRADE\Models\ListIssuerProjectkeyResponse;
use AntChain\WEBTRWATRADE\Models\ListIssuerReportRequest;
use AntChain\WEBTRWATRADE\Models\ListIssuerReportResponse;
use AntChain\WEBTRWATRADE\Models\PagequeryDistributorProjectRequest;
use AntChain\WEBTRWATRADE\Models\PagequeryDistributorProjectResponse;
use AntChain\WEBTRWATRADE\Models\PagequeryDistributorSubuserRequest;
use AntChain\WEBTRWATRADE\Models\PagequeryDistributorSubuserResponse;
use AntChain\WEBTRWATRADE\Models\PagequeryIssuerKeyRequest;
use AntChain\WEBTRWATRADE\Models\PagequeryIssuerKeyResponse;
use AntChain\WEBTRWATRADE\Models\PagequeryIssuerProjectkeyRequest;
use AntChain\WEBTRWATRADE\Models\PagequeryIssuerProjectkeyResponse;
use AntChain\WEBTRWATRADE\Models\PagequeryIssuerProjectRequest;
use AntChain\WEBTRWATRADE\Models\PagequeryIssuerProjectResponse;
use AntChain\WEBTRWATRADE\Models\PagequeryIssuerSubuserRequest;
use AntChain\WEBTRWATRADE\Models\PagequeryIssuerSubuserResponse;
use AntChain\WEBTRWATRADE\Models\PagequeryPlatformProjectRequest;
use AntChain\WEBTRWATRADE\Models\PagequeryPlatformProjectResponse;
use AntChain\WEBTRWATRADE\Models\PauseIssuerProjectRequest;
use AntChain\WEBTRWATRADE\Models\PauseIssuerProjectResponse;
use AntChain\WEBTRWATRADE\Models\PreviewDistributorReportRequest;
use AntChain\WEBTRWATRADE\Models\PreviewDistributorReportResponse;
use AntChain\WEBTRWATRADE\Models\PreviewIssuerReportRequest;
use AntChain\WEBTRWATRADE\Models\PreviewIssuerReportResponse;
use AntChain\WEBTRWATRADE\Models\QueryDistributorSubuserRequest;
use AntChain\WEBTRWATRADE\Models\QueryDistributorSubuserResponse;
use AntChain\WEBTRWATRADE\Models\QueryIssuerSubuserRequest;
use AntChain\WEBTRWATRADE\Models\QueryIssuerSubuserResponse;
use AntChain\WEBTRWATRADE\Models\RedeemIssuerSubusertradeRequest;
use AntChain\WEBTRWATRADE\Models\RedeemIssuerSubusertradeResponse;
use AntChain\WEBTRWATRADE\Models\TransferIssuerSubusertradeRequest;
use AntChain\WEBTRWATRADE\Models\TransferIssuerSubusertradeResponse;
use AntChain\WEBTRWATRADE\Models\UpdateDistributorSubuserRequest;
use AntChain\WEBTRWATRADE\Models\UpdateDistributorSubuserResponse;
use AntChain\WEBTRWATRADE\Models\UpdateIssuerNetvalueRequest;
use AntChain\WEBTRWATRADE\Models\UpdateIssuerNetvalueResponse;
use AntChain\WEBTRWATRADE\Models\UploadIssuerReportRequest;
use AntChain\WEBTRWATRADE\Models\UploadIssuerReportResponse;
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
            // 机构联系人信息
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
                    'sdk_version'      => '1.0.10',
                    '_prod_code'       => 'WEBTRWATRADE',
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
     * Description: 发行机构创建资产项目
     * Summary: 发行机构创建资产项目.
     *
     * @param CreateIssuerProjectRequest $request
     *
     * @return CreateIssuerProjectResponse
     */
    public function createIssuerProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createIssuerProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构创建资产项目
     * Summary: 发行机构创建资产项目.
     *
     * @param CreateIssuerProjectRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateIssuerProjectResponse
     */
    public function createIssuerProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateIssuerProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.project.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询发行机构持有的资产项目信息
     * Summary: 分页查询发行机构项目信息.
     *
     * @param PagequeryIssuerProjectRequest $request
     *
     * @return PagequeryIssuerProjectResponse
     */
    public function pagequeryIssuerProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryIssuerProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询发行机构持有的资产项目信息
     * Summary: 分页查询发行机构项目信息.
     *
     * @param PagequeryIssuerProjectRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PagequeryIssuerProjectResponse
     */
    public function pagequeryIssuerProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryIssuerProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.project.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询代销机构代销的资产项目信息
     * Summary: 分页查询代销机构项目信息.
     *
     * @param PagequeryDistributorProjectRequest $request
     *
     * @return PagequeryDistributorProjectResponse
     */
    public function pagequeryDistributorProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryDistributorProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询代销机构代销的资产项目信息
     * Summary: 分页查询代销机构项目信息.
     *
     * @param PagequeryDistributorProjectRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return PagequeryDistributorProjectResponse
     */
    public function pagequeryDistributorProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryDistributorProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.project.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构暂停项目
     * Summary: 发行机构暂停项目.
     *
     * @param PauseIssuerProjectRequest $request
     *
     * @return PauseIssuerProjectResponse
     */
    public function pauseIssuerProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pauseIssuerProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构暂停项目
     * Summary: 发行机构暂停项目.
     *
     * @param PauseIssuerProjectRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PauseIssuerProjectResponse
     */
    public function pauseIssuerProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PauseIssuerProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.project.pause', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构激活项目(使项目生效)
     * Summary: 发行机构激活项目.
     *
     * @param EnableIssuerProjectRequest $request
     *
     * @return EnableIssuerProjectResponse
     */
    public function enableIssuerProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->enableIssuerProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构激活项目(使项目生效)
     * Summary: 发行机构激活项目.
     *
     * @param EnableIssuerProjectRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return EnableIssuerProjectResponse
     */
    public function enableIssuerProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return EnableIssuerProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.project.enable', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构查询项目详情
     * Summary: 发行机构查询项目详情.
     *
     * @param DetailIssuerProjectRequest $request
     *
     * @return DetailIssuerProjectResponse
     */
    public function detailIssuerProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailIssuerProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构查询项目详情
     * Summary: 发行机构查询项目详情.
     *
     * @param DetailIssuerProjectRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DetailIssuerProjectResponse
     */
    public function detailIssuerProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailIssuerProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.project.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构查询项目详情
     * Summary: 代销机构查询项目详情.
     *
     * @param DetailDistributorProjectRequest $request
     *
     * @return DetailDistributorProjectResponse
     */
    public function detailDistributorProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailDistributorProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构查询项目详情
     * Summary: 代销机构查询项目详情.
     *
     * @param DetailDistributorProjectRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DetailDistributorProjectResponse
     */
    public function detailDistributorProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailDistributorProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.project.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 平台管理员分页查询所有项目
     * Summary: 平台管理分页查询项目.
     *
     * @param PagequeryPlatformProjectRequest $request
     *
     * @return PagequeryPlatformProjectResponse
     */
    public function pagequeryPlatformProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryPlatformProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 平台管理员分页查询所有项目
     * Summary: 平台管理分页查询项目.
     *
     * @param PagequeryPlatformProjectRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PagequeryPlatformProjectResponse
     */
    public function pagequeryPlatformProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryPlatformProjectResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.platform.project.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构获取总览统计数据项
     * Summary: 发行机构获取总览统计数据项.
     *
     * @param CountIssuerDatasummaryRequest $request
     *
     * @return CountIssuerDatasummaryResponse
     */
    public function countIssuerDatasummary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countIssuerDatasummaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构获取总览统计数据项
     * Summary: 发行机构获取总览统计数据项.
     *
     * @param CountIssuerDatasummaryRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CountIssuerDatasummaryResponse
     */
    public function countIssuerDatasummaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountIssuerDatasummaryResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.datasummary.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构获取总览统计数据项
     * Summary: 代销机构获取总览统计数据项.
     *
     * @param CountDistributorDatasummaryRequest $request
     *
     * @return CountDistributorDatasummaryResponse
     */
    public function countDistributorDatasummary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countDistributorDatasummaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构获取总览统计数据项
     * Summary: 代销机构获取总览统计数据项.
     *
     * @param CountDistributorDatasummaryRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return CountDistributorDatasummaryResponse
     */
    public function countDistributorDatasummaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountDistributorDatasummaryResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.datasummary.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构获取历史资产价值
     * Summary: 发行机构获取历史资产价值
     *
     * @param ListIssuerDatasummaryRequest $request
     *
     * @return ListIssuerDatasummaryResponse
     */
    public function listIssuerDatasummary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listIssuerDatasummaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构获取历史资产价值
     * Summary: 发行机构获取历史资产价值
     *
     * @param ListIssuerDatasummaryRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListIssuerDatasummaryResponse
     */
    public function listIssuerDatasummaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListIssuerDatasummaryResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.datasummary.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构获取历史资产价值
     * Summary: 代销机构获取历史资产价值
     *
     * @param ListDistributorDatasummaryRequest $request
     *
     * @return ListDistributorDatasummaryResponse
     */
    public function listDistributorDatasummary($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDistributorDatasummaryEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构获取历史资产价值
     * Summary: 代销机构获取历史资产价值
     *
     * @param ListDistributorDatasummaryRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return ListDistributorDatasummaryResponse
     */
    public function listDistributorDatasummaryEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDistributorDatasummaryResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.datasummary.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询代销机构列表
     * Summary: 查询代销机构列表.
     *
     * @param ListIssuerInstitutionRequest $request
     *
     * @return ListIssuerInstitutionResponse
     */
    public function listIssuerInstitution($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listIssuerInstitutionEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询代销机构列表
     * Summary: 查询代销机构列表.
     *
     * @param ListIssuerInstitutionRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListIssuerInstitutionResponse
     */
    public function listIssuerInstitutionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListIssuerInstitutionResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.institution.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询密钥
     * Summary: 分页查询密钥.
     *
     * @param PagequeryIssuerKeyRequest $request
     *
     * @return PagequeryIssuerKeyResponse
     */
    public function pagequeryIssuerKey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryIssuerKeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询密钥
     * Summary: 分页查询密钥.
     *
     * @param PagequeryIssuerKeyRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return PagequeryIssuerKeyResponse
     */
    public function pagequeryIssuerKeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryIssuerKeyResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.key.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询密钥详情
     * Summary: 查询密钥详情.
     *
     * @param DetailIssuerKeyRequest $request
     *
     * @return DetailIssuerKeyResponse
     */
    public function detailIssuerKey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->detailIssuerKeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询密钥详情
     * Summary: 查询密钥详情.
     *
     * @param DetailIssuerKeyRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DetailIssuerKeyResponse
     */
    public function detailIssuerKeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DetailIssuerKeyResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.key.detail', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建密钥
     * Summary: 创建密钥.
     *
     * @param CreateIssuerKeyRequest $request
     *
     * @return CreateIssuerKeyResponse
     */
    public function createIssuerKey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createIssuerKeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建密钥
     * Summary: 创建密钥.
     *
     * @param CreateIssuerKeyRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateIssuerKeyResponse
     */
    public function createIssuerKeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateIssuerKeyResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.key.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除密钥
     * Summary: 删除密钥.
     *
     * @param DeleteIssuerKeyRequest $request
     *
     * @return DeleteIssuerKeyResponse
     */
    public function deleteIssuerKey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteIssuerKeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除密钥
     * Summary: 删除密钥.
     *
     * @param DeleteIssuerKeyRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return DeleteIssuerKeyResponse
     */
    public function deleteIssuerKeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteIssuerKeyResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.key.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构添加项目密钥
     * Summary: 发行机构添加项目密钥.
     *
     * @param AddIssuerProjectkeyRequest $request
     *
     * @return AddIssuerProjectkeyResponse
     */
    public function addIssuerProjectkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->addIssuerProjectkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构添加项目密钥
     * Summary: 发行机构添加项目密钥.
     *
     * @param AddIssuerProjectkeyRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return AddIssuerProjectkeyResponse
     */
    public function addIssuerProjectkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AddIssuerProjectkeyResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.projectkey.add', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构删除项目密钥
     * Summary: 发行机构删除项目密钥.
     *
     * @param DeleteIssuerProjectkeyRequest $request
     *
     * @return DeleteIssuerProjectkeyResponse
     */
    public function deleteIssuerProjectkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteIssuerProjectkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构删除项目密钥
     * Summary: 发行机构删除项目密钥.
     *
     * @param DeleteIssuerProjectkeyRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return DeleteIssuerProjectkeyResponse
     */
    public function deleteIssuerProjectkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteIssuerProjectkeyResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.projectkey.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构获取项目密钥列表
     * Summary: 发行机构获取项目密钥列表.
     *
     * @param ListIssuerProjectkeyRequest $request
     *
     * @return ListIssuerProjectkeyResponse
     */
    public function listIssuerProjectkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listIssuerProjectkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构获取项目密钥列表
     * Summary: 发行机构获取项目密钥列表.
     *
     * @param ListIssuerProjectkeyRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ListIssuerProjectkeyResponse
     */
    public function listIssuerProjectkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListIssuerProjectkeyResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.projectkey.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构分页查询密钥关联的项目
     * Summary: 发行机构分页查询密钥关联的项目.
     *
     * @param PagequeryIssuerProjectkeyRequest $request
     *
     * @return PagequeryIssuerProjectkeyResponse
     */
    public function pagequeryIssuerProjectkey($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryIssuerProjectkeyEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构分页查询密钥关联的项目
     * Summary: 发行机构分页查询密钥关联的项目.
     *
     * @param PagequeryIssuerProjectkeyRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return PagequeryIssuerProjectkeyResponse
     */
    public function pagequeryIssuerProjectkeyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryIssuerProjectkeyResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.projectkey.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新项目净值
     * Summary: 更新项目净值
     *
     * @param UpdateIssuerNetvalueRequest $request
     *
     * @return UpdateIssuerNetvalueResponse
     */
    public function updateIssuerNetvalue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateIssuerNetvalueEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新项目净值
     * Summary: 更新项目净值
     *
     * @param UpdateIssuerNetvalueRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return UpdateIssuerNetvalueResponse
     */
    public function updateIssuerNetvalueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateIssuerNetvalueResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.netvalue.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取净值列表
     * Summary: 获取净值列表.
     *
     * @param ListIssuerNetvalueRequest $request
     *
     * @return ListIssuerNetvalueResponse
     */
    public function listIssuerNetvalue($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listIssuerNetvalueEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取净值列表
     * Summary: 获取净值列表.
     *
     * @param ListIssuerNetvalueRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return ListIssuerNetvalueResponse
     */
    public function listIssuerNetvalueEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListIssuerNetvalueResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.netvalue.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传项目报告
     * Summary: 上传项目报告.
     *
     * @param UploadIssuerReportRequest $request
     *
     * @return UploadIssuerReportResponse
     */
    public function uploadIssuerReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadIssuerReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传项目报告
     * Summary: 上传项目报告.
     *
     * @param UploadIssuerReportRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return UploadIssuerReportResponse
     */
    public function uploadIssuerReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UploadIssuerReportResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.report.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构获取历史报告列表
     * Summary: 发行机构获取历史报告列表.
     *
     * @param ListIssuerReportRequest $request
     *
     * @return ListIssuerReportResponse
     */
    public function listIssuerReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listIssuerReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构获取历史报告列表
     * Summary: 发行机构获取历史报告列表.
     *
     * @param ListIssuerReportRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ListIssuerReportResponse
     */
    public function listIssuerReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListIssuerReportResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.report.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构获取历史项目报告
     * Summary: 代销机构获取历史项目报告.
     *
     * @param ListDistributorReportRequest $request
     *
     * @return ListDistributorReportResponse
     */
    public function listDistributorReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listDistributorReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构获取历史项目报告
     * Summary: 代销机构获取历史项目报告.
     *
     * @param ListDistributorReportRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ListDistributorReportResponse
     */
    public function listDistributorReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListDistributorReportResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.report.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构获取报告文件下载URL
     * Summary: 发行机构获取报告文件下载URL.
     *
     * @param DownloadIssuerReportRequest $request
     *
     * @return DownloadIssuerReportResponse
     */
    public function downloadIssuerReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadIssuerReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构获取报告文件下载URL
     * Summary: 发行机构获取报告文件下载URL.
     *
     * @param DownloadIssuerReportRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DownloadIssuerReportResponse
     */
    public function downloadIssuerReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadIssuerReportResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.report.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行机构获取报告文件预览URL
     * Summary: 发行机构获取报告文件预览URL.
     *
     * @param PreviewIssuerReportRequest $request
     *
     * @return PreviewIssuerReportResponse
     */
    public function previewIssuerReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->previewIssuerReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行机构获取报告文件预览URL
     * Summary: 发行机构获取报告文件预览URL.
     *
     * @param PreviewIssuerReportRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return PreviewIssuerReportResponse
     */
    public function previewIssuerReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PreviewIssuerReportResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.report.preview', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构获取报告文件下载URL
     * Summary: 代销机构获取报告文件下载URL.
     *
     * @param DownloadDistributorReportRequest $request
     *
     * @return DownloadDistributorReportResponse
     */
    public function downloadDistributorReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadDistributorReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构获取报告文件下载URL
     * Summary: 代销机构获取报告文件下载URL.
     *
     * @param DownloadDistributorReportRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return DownloadDistributorReportResponse
     */
    public function downloadDistributorReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadDistributorReportResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.report.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 代销机构获取报告文件预览URL
     * Summary: 代销机构获取报告文件预览URL.
     *
     * @param PreviewDistributorReportRequest $request
     *
     * @return PreviewDistributorReportResponse
     */
    public function previewDistributorReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->previewDistributorReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 代销机构获取报告文件预览URL
     * Summary: 代销机构获取报告文件预览URL.
     *
     * @param PreviewDistributorReportRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return PreviewDistributorReportResponse
     */
    public function previewDistributorReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PreviewDistributorReportResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.report.preview', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表.
     *
     * @param PagequeryIssuerSubuserRequest $request
     *
     * @return PagequeryIssuerSubuserResponse
     */
    public function pagequeryIssuerSubuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryIssuerSubuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表.
     *
     * @param PagequeryIssuerSubuserRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return PagequeryIssuerSubuserResponse
     */
    public function pagequeryIssuerSubuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryIssuerSubuserResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.subuser.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表.
     *
     * @param PagequeryDistributorSubuserRequest $request
     *
     * @return PagequeryDistributorSubuserResponse
     */
    public function pagequeryDistributorSubuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryDistributorSubuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表.
     *
     * @param PagequeryDistributorSubuserRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return PagequeryDistributorSubuserResponse
     */
    public function pagequeryDistributorSubuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryDistributorSubuserResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.subuser.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询单个二级用户
     * Summary: 查询单个二级用户.
     *
     * @param QueryIssuerSubuserRequest $request
     *
     * @return QueryIssuerSubuserResponse
     */
    public function queryIssuerSubuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIssuerSubuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询单个二级用户
     * Summary: 查询单个二级用户.
     *
     * @param QueryIssuerSubuserRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryIssuerSubuserResponse
     */
    public function queryIssuerSubuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIssuerSubuserResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.subuser.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询单个二级用户
     * Summary: 查询单个二级用户.
     *
     * @param QueryDistributorSubuserRequest $request
     *
     * @return QueryDistributorSubuserResponse
     */
    public function queryDistributorSubuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDistributorSubuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询单个二级用户
     * Summary: 查询单个二级用户.
     *
     * @param QueryDistributorSubuserRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryDistributorSubuserResponse
     */
    public function queryDistributorSubuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDistributorSubuserResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.subuser.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新二级用户
     * Summary: 更新二级用户.
     *
     * @param UpdateDistributorSubuserRequest $request
     *
     * @return UpdateDistributorSubuserResponse
     */
    public function updateDistributorSubuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDistributorSubuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新二级用户
     * Summary: 更新二级用户.
     *
     * @param UpdateDistributorSubuserRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return UpdateDistributorSubuserResponse
     */
    public function updateDistributorSubuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDistributorSubuserResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.subuser.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 添加二级用户
     * Summary: 添加二级用户.
     *
     * @param CreateDistributorSubuserRequest $request
     *
     * @return CreateDistributorSubuserResponse
     */
    public function createDistributorSubuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDistributorSubuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 添加二级用户
     * Summary: 添加二级用户.
     *
     * @param CreateDistributorSubuserRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateDistributorSubuserResponse
     */
    public function createDistributorSubuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDistributorSubuserResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.subuser.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除二级用户
     * Summary: 删除二级用户.
     *
     * @param DeleteDistributorSubuserRequest $request
     *
     * @return DeleteDistributorSubuserResponse
     */
    public function deleteDistributorSubuser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDistributorSubuserEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除二级用户
     * Summary: 删除二级用户.
     *
     * @param DeleteDistributorSubuserRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DeleteDistributorSubuserResponse
     */
    public function deleteDistributorSubuserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDistributorSubuserResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.subuser.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取二级用户配额
     * Summary: 获取二级用户配额.
     *
     * @param CountDistributorSubusertargetRequest $request
     *
     * @return CountDistributorSubusertargetResponse
     */
    public function countDistributorSubusertarget($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->countDistributorSubusertargetEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取二级用户配额
     * Summary: 获取二级用户配额.
     *
     * @param CountDistributorSubusertargetRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CountDistributorSubusertargetResponse
     */
    public function countDistributorSubusertargetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CountDistributorSubusertargetResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.distributor.subusertarget.count', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发行token
     * Summary: 发行token.
     *
     * @param IssueIssuerSubusertradeRequest $request
     *
     * @return IssueIssuerSubusertradeResponse
     */
    public function issueIssuerSubusertrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->issueIssuerSubusertradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 发行token
     * Summary: 发行token.
     *
     * @param IssueIssuerSubusertradeRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return IssueIssuerSubusertradeResponse
     */
    public function issueIssuerSubusertradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return IssueIssuerSubusertradeResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.subusertrade.issue', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 赎回token
     * Summary: 赎回token.
     *
     * @param RedeemIssuerSubusertradeRequest $request
     *
     * @return RedeemIssuerSubusertradeResponse
     */
    public function redeemIssuerSubusertrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->redeemIssuerSubusertradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 赎回token
     * Summary: 赎回token.
     *
     * @param RedeemIssuerSubusertradeRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return RedeemIssuerSubusertradeResponse
     */
    public function redeemIssuerSubusertradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RedeemIssuerSubusertradeResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.subusertrade.redeem', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 转移token
     * Summary: 转移token.
     *
     * @param TransferIssuerSubusertradeRequest $request
     *
     * @return TransferIssuerSubusertradeResponse
     */
    public function transferIssuerSubusertrade($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->transferIssuerSubusertradeEx($request, $headers, $runtime);
    }

    /**
     * Description: 转移token
     * Summary: 转移token.
     *
     * @param TransferIssuerSubusertradeRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return TransferIssuerSubusertradeResponse
     */
    public function transferIssuerSubusertradeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return TransferIssuerSubusertradeResponse::fromMap($this->doRequest('1.0', 'antdigital.webtrwatrade.issuer.subusertrade.transfer', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
