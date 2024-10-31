<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\DAS\Models\AuthDasAuthresultRequest;
use AntChain\DAS\Models\AuthDasAuthresultResponse;
use AntChain\DAS\Models\AuthDasSmsRequest;
use AntChain\DAS\Models\AuthDasSmsResponse;
use AntChain\DAS\Models\CheckApplicationHascarRequest;
use AntChain\DAS\Models\CheckApplicationHascarResponse;
use AntChain\DAS\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\DAS\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\DAS\Models\CreateDasDatasourceRequest;
use AntChain\DAS\Models\CreateDasDatasourceResponse;
use AntChain\DAS\Models\DeleteDasDatasourceRequest;
use AntChain\DAS\Models\DeleteDasDatasourceResponse;
use AntChain\DAS\Models\GetApplicationFileentranceRequest;
use AntChain\DAS\Models\GetApplicationFileentranceResponse;
use AntChain\DAS\Models\GetDasEnterprisevcRequest;
use AntChain\DAS\Models\GetDasEnterprisevcResponse;
use AntChain\DAS\Models\GetDasIndividualvcRequest;
use AntChain\DAS\Models\GetDasIndividualvcResponse;
use AntChain\DAS\Models\GetDasLinkRequest;
use AntChain\DAS\Models\GetDasLinkResponse;
use AntChain\DAS\Models\GetDomesticTrademarklogoRequest;
use AntChain\DAS\Models\GetDomesticTrademarklogoResponse;
use AntChain\DAS\Models\InitUnifiedentranceAsyncRequest;
use AntChain\DAS\Models\InitUnifiedentranceAsyncResponse;
use AntChain\DAS\Models\QueryApplicationBasecarinfoRequest;
use AntChain\DAS\Models\QueryApplicationBasecarinfoResponse;
use AntChain\DAS\Models\QueryApplicationBatchqueryresultRequest;
use AntChain\DAS\Models\QueryApplicationBatchqueryresultResponse;
use AntChain\DAS\Models\QueryApplicationDataRequest;
use AntChain\DAS\Models\QueryApplicationDataResponse;
use AntChain\DAS\Models\QueryApplicationDetailcarinfoRequest;
use AntChain\DAS\Models\QueryApplicationDetailcarinfoResponse;
use AntChain\DAS\Models\QueryApplicationDriverlicensecertRequest;
use AntChain\DAS\Models\QueryApplicationDriverlicensecertResponse;
use AntChain\DAS\Models\QueryApplicationEducationstatusRequest;
use AntChain\DAS\Models\QueryApplicationEducationstatusResponse;
use AntChain\DAS\Models\QueryApplicationIpeRequest;
use AntChain\DAS\Models\QueryApplicationIpeResponse;
use AntChain\DAS\Models\QueryApplicationResumeRequest;
use AntChain\DAS\Models\QueryApplicationResumeResponse;
use AntChain\DAS\Models\QueryApplicationUnifiedentranceRequest;
use AntChain\DAS\Models\QueryApplicationUnifiedentranceResponse;
use AntChain\DAS\Models\QueryApplicationVehiclelicensecertRequest;
use AntChain\DAS\Models\QueryApplicationVehiclelicensecertResponse;
use AntChain\DAS\Models\QueryDasDatasourceRequest;
use AntChain\DAS\Models\QueryDasDatasourceResponse;
use AntChain\DAS\Models\QueryDetailcarinfoPesonandlicRequest;
use AntChain\DAS\Models\QueryDetailcarinfoPesonandlicResponse;
use AntChain\DAS\Models\QueryDomestictrademarkExtensioninfoRequest;
use AntChain\DAS\Models\QueryDomestictrademarkExtensioninfoResponse;
use AntChain\DAS\Models\QueryDomesticTrademarkRequest;
use AntChain\DAS\Models\QueryDomesticTrademarkResponse;
use AntChain\DAS\Models\QueryEncryptEnterpriseinfoRequest;
use AntChain\DAS\Models\QueryEncryptEnterpriseinfoResponse;
use AntChain\DAS\Models\QueryIdnumberEducationtaginfoRequest;
use AntChain\DAS\Models\QueryIdnumberEducationtaginfoResponse;
use AntChain\DAS\Models\QueryMainsiteUnifiedentranceRequest;
use AntChain\DAS\Models\QueryMainsiteUnifiedentranceResponse;
use AntChain\DAS\Models\QueryPhonenumberEducationinfoRequest;
use AntChain\DAS\Models\QueryPhonenumberEducationinfoResponse;
use AntChain\DAS\Models\QueryUnifiedentranceAsyncRequest;
use AntChain\DAS\Models\QueryUnifiedentranceAsyncResponse;
use AntChain\DAS\Models\SendDasSmsRequest;
use AntChain\DAS\Models\SendDasSmsResponse;
use AntChain\DAS\Models\SignApplicationResumeRequest;
use AntChain\DAS\Models\SignApplicationResumeResponse;
use AntChain\DAS\Models\UpdateDasDatasourceRequest;
use AntChain\DAS\Models\UpdateDasDatasourceResponse;
use AntChain\DAS\Models\UploadApplicationAuthfileRequest;
use AntChain\DAS\Models\UploadApplicationAuthfileResponse;
use AntChain\DAS\Models\UploadApplicationBatchqueryfileRequest;
use AntChain\DAS\Models\UploadApplicationBatchqueryfileResponse;
use AntChain\DAS\Models\UploadServiceAuthfileRequest;
use AntChain\DAS\Models\UploadServiceAuthfileResponse;
use AntChain\DAS\Models\VerifyDasAuthresultRequest;
use AntChain\DAS\Models\VerifyDasAuthresultResponse;
use AntChain\DAS\Models\VerifyDasEnterpriseRequest;
use AntChain\DAS\Models\VerifyDasEnterpriseResponse;
use AntChain\DAS\Models\VerifyDasIndividualRequest;
use AntChain\DAS\Models\VerifyDasIndividualResponse;
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
            // 主要人员
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
                    'sdk_version'      => '1.1.65',
                    '_prod_code'       => 'DAS',
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
     * Description: 上传批量查询数据文件
     * Summary: 上传批量查询数据文件.
     *
     * @param UploadApplicationBatchqueryfileRequest $request
     *
     * @return UploadApplicationBatchqueryfileResponse
     */
    public function uploadApplicationBatchqueryfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadApplicationBatchqueryfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传批量查询数据文件
     * Summary: 上传批量查询数据文件.
     *
     * @param UploadApplicationBatchqueryfileRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return UploadApplicationBatchqueryfileResponse
     */
    public function uploadApplicationBatchqueryfileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.das.application.batchqueryfile.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadApplicationBatchqueryfileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadApplicationBatchqueryfileResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.batchqueryfile.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取查询数据集任务结果
     * Summary: 获取查询数据集任务结果.
     *
     * @param QueryApplicationBatchqueryresultRequest $request
     *
     * @return QueryApplicationBatchqueryresultResponse
     */
    public function queryApplicationBatchqueryresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationBatchqueryresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取查询数据集任务结果
     * Summary: 获取查询数据集任务结果.
     *
     * @param QueryApplicationBatchqueryresultRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryApplicationBatchqueryresultResponse
     */
    public function queryApplicationBatchqueryresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationBatchqueryresultResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.batchqueryresult.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 实时获取数据源数据
     * Summary: 实时查询数据.
     *
     * @param QueryApplicationDataRequest $request
     *
     * @return QueryApplicationDataResponse
     */
    public function queryApplicationData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 实时获取数据源数据
     * Summary: 实时查询数据.
     *
     * @param QueryApplicationDataRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryApplicationDataResponse
     */
    public function queryApplicationDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationDataResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.data.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 知识产权实时接口
     * Summary: 知识产权实时接口.
     *
     * @param QueryApplicationIpeRequest $request
     *
     * @return QueryApplicationIpeResponse
     */
    public function queryApplicationIpe($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationIpeEx($request, $headers, $runtime);
    }

    /**
     * Description: 知识产权实时接口
     * Summary: 知识产权实时接口.
     *
     * @param QueryApplicationIpeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryApplicationIpeResponse
     */
    public function queryApplicationIpeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationIpeResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.ipe.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询国内商标数据
     * Summary: 查询国内商标数据.
     *
     * @param QueryDomesticTrademarkRequest $request
     *
     * @return QueryDomesticTrademarkResponse
     */
    public function queryDomesticTrademark($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDomesticTrademarkEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询国内商标数据
     * Summary: 查询国内商标数据.
     *
     * @param QueryDomesticTrademarkRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryDomesticTrademarkResponse
     */
    public function queryDomesticTrademarkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDomesticTrademarkResponse::fromMap($this->doRequest('1.0', 'antchain.das.domestic.trademark.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取国内商标LOGO文件
     * Summary: 获取国内商标LOGO文件.
     *
     * @param GetDomesticTrademarklogoRequest $request
     *
     * @return GetDomesticTrademarklogoResponse
     */
    public function getDomesticTrademarklogo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDomesticTrademarklogoEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取国内商标LOGO文件
     * Summary: 获取国内商标LOGO文件.
     *
     * @param GetDomesticTrademarklogoRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return GetDomesticTrademarklogoResponse
     */
    public function getDomesticTrademarklogoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDomesticTrademarklogoResponse::fromMap($this->doRequest('1.0', 'antchain.das.domestic.trademarklogo.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询加密的企业工商信息
     * Summary: 查询加密的企业工商信息.
     *
     * @param QueryEncryptEnterpriseinfoRequest $request
     *
     * @return QueryEncryptEnterpriseinfoResponse
     */
    public function queryEncryptEnterpriseinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEncryptEnterpriseinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询加密的企业工商信息
     * Summary: 查询加密的企业工商信息.
     *
     * @param QueryEncryptEnterpriseinfoRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return QueryEncryptEnterpriseinfoResponse
     */
    public function queryEncryptEnterpriseinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEncryptEnterpriseinfoResponse::fromMap($this->doRequest('1.0', 'antchain.das.encrypt.enterpriseinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 上传授权协议文件
     * Summary: 上传授权协议文件.
     *
     * @param UploadApplicationAuthfileRequest $request
     *
     * @return UploadApplicationAuthfileResponse
     */
    public function uploadApplicationAuthfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadApplicationAuthfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 上传授权协议文件
     * Summary: 上传授权协议文件.
     *
     * @param UploadApplicationAuthfileRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return UploadApplicationAuthfileResponse
     */
    public function uploadApplicationAuthfileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.das.application.authfile.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadApplicationAuthfileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadApplicationAuthfileResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.authfile.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验用户是否车
     * Summary: 校验用户是否车.
     *
     * @param CheckApplicationHascarRequest $request
     *
     * @return CheckApplicationHascarResponse
     */
    public function checkApplicationHascar($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkApplicationHascarEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验用户是否车
     * Summary: 校验用户是否车.
     *
     * @param CheckApplicationHascarRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CheckApplicationHascarResponse
     */
    public function checkApplicationHascarEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckApplicationHascarResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.hascar.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询车辆基础信息
     * Summary: 查询车辆基础信息.
     *
     * @param QueryApplicationBasecarinfoRequest $request
     *
     * @return QueryApplicationBasecarinfoResponse
     */
    public function queryApplicationBasecarinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationBasecarinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询车辆基础信息
     * Summary: 查询车辆基础信息.
     *
     * @param QueryApplicationBasecarinfoRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return QueryApplicationBasecarinfoResponse
     */
    public function queryApplicationBasecarinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationBasecarinfoResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.basecarinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询车辆详细信息
     * Summary: 查询车辆详细信息.
     *
     * @param QueryApplicationDetailcarinfoRequest $request
     *
     * @return QueryApplicationDetailcarinfoResponse
     */
    public function queryApplicationDetailcarinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationDetailcarinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询车辆详细信息
     * Summary: 查询车辆详细信息.
     *
     * @param QueryApplicationDetailcarinfoRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryApplicationDetailcarinfoResponse
     */
    public function queryApplicationDetailcarinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationDetailcarinfoResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.detailcarinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权简历查询服务
     * Summary: 授权简历查询服务
     *
     * @param SignApplicationResumeRequest $request
     *
     * @return SignApplicationResumeResponse
     */
    public function signApplicationResume($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->signApplicationResumeEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权简历查询服务
     * Summary: 授权简历查询服务
     *
     * @param SignApplicationResumeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return SignApplicationResumeResponse
     */
    public function signApplicationResumeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SignApplicationResumeResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.resume.sign', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询简历信息
     * Summary: 查询简历信息.
     *
     * @param QueryApplicationResumeRequest $request
     *
     * @return QueryApplicationResumeResponse
     */
    public function queryApplicationResume($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationResumeEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询简历信息
     * Summary: 查询简历信息.
     *
     * @param QueryApplicationResumeRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryApplicationResumeResponse
     */
    public function queryApplicationResumeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationResumeResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.resume.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 人车核验并查询车辆详细信息
     * Summary: 人车核验并查询车辆详细信息.
     *
     * @param QueryDetailcarinfoPesonandlicRequest $request
     *
     * @return QueryDetailcarinfoPesonandlicResponse
     */
    public function queryDetailcarinfoPesonandlic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDetailcarinfoPesonandlicEx($request, $headers, $runtime);
    }

    /**
     * Description: 人车核验并查询车辆详细信息
     * Summary: 人车核验并查询车辆详细信息.
     *
     * @param QueryDetailcarinfoPesonandlicRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryDetailcarinfoPesonandlicResponse
     */
    public function queryDetailcarinfoPesonandlicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDetailcarinfoPesonandlicResponse::fromMap($this->doRequest('1.0', 'antchain.das.detailcarinfo.pesonandlic.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 教育标签(姓名身份证)信息查询
     * Summary: 教育标签(姓名身份证)信息查询.
     *
     * @param QueryIdnumberEducationtaginfoRequest $request
     *
     * @return QueryIdnumberEducationtaginfoResponse
     */
    public function queryIdnumberEducationtaginfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryIdnumberEducationtaginfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 教育标签(姓名身份证)信息查询
     * Summary: 教育标签(姓名身份证)信息查询.
     *
     * @param QueryIdnumberEducationtaginfoRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryIdnumberEducationtaginfoResponse
     */
    public function queryIdnumberEducationtaginfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryIdnumberEducationtaginfoResponse::fromMap($this->doRequest('1.0', 'antchain.das.idnumber.educationtaginfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 教育信息查询（姓名手机号/姓名身份证）
     * Summary: 教育信息查询（姓名手机号/姓名身份证）.
     *
     * @param QueryPhonenumberEducationinfoRequest $request
     *
     * @return QueryPhonenumberEducationinfoResponse
     */
    public function queryPhonenumberEducationinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPhonenumberEducationinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 教育信息查询（姓名手机号/姓名身份证）
     * Summary: 教育信息查询（姓名手机号/姓名身份证）.
     *
     * @param QueryPhonenumberEducationinfoRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return QueryPhonenumberEducationinfoResponse
     */
    public function queryPhonenumberEducationinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPhonenumberEducationinfoResponse::fromMap($this->doRequest('1.0', 'antchain.das.phonenumber.educationinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据应用统一入口
     * Summary: 数据应用统一入口.
     *
     * @param QueryApplicationUnifiedentranceRequest $request
     *
     * @return QueryApplicationUnifiedentranceResponse
     */
    public function queryApplicationUnifiedentrance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationUnifiedentranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据应用统一入口
     * Summary: 数据应用统一入口.
     *
     * @param QueryApplicationUnifiedentranceRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryApplicationUnifiedentranceResponse
     */
    public function queryApplicationUnifiedentranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationUnifiedentranceResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.unifiedentrance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据姓名和身份证，返回驾驶证核验信息
     * Summary: 驾驶证核验信息查询.
     *
     * @param QueryApplicationDriverlicensecertRequest $request
     *
     * @return QueryApplicationDriverlicensecertResponse
     */
    public function queryApplicationDriverlicensecert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationDriverlicensecertEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据姓名和身份证，返回驾驶证核验信息
     * Summary: 驾驶证核验信息查询.
     *
     * @param QueryApplicationDriverlicensecertRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryApplicationDriverlicensecertResponse
     */
    public function queryApplicationDriverlicensecertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationDriverlicensecertResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.driverlicensecert.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据车牌号所有人等信息，返回行驶证核验结果
     * Summary: 行驶证核验信息查询.
     *
     * @param QueryApplicationVehiclelicensecertRequest $request
     *
     * @return QueryApplicationVehiclelicensecertResponse
     */
    public function queryApplicationVehiclelicensecert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationVehiclelicensecertEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据车牌号所有人等信息，返回行驶证核验结果
     * Summary: 行驶证核验信息查询.
     *
     * @param QueryApplicationVehiclelicensecertRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return QueryApplicationVehiclelicensecertResponse
     */
    public function queryApplicationVehiclelicensecertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationVehiclelicensecertResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.vehiclelicensecert.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据姓名身份证信息查询学籍信息
     * Summary: 根据姓名身份证信息查询学籍.
     *
     * @param QueryApplicationEducationstatusRequest $request
     *
     * @return QueryApplicationEducationstatusResponse
     */
    public function queryApplicationEducationstatus($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryApplicationEducationstatusEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据姓名身份证信息查询学籍信息
     * Summary: 根据姓名身份证信息查询学籍.
     *
     * @param QueryApplicationEducationstatusRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryApplicationEducationstatusResponse
     */
    public function queryApplicationEducationstatusEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryApplicationEducationstatusResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.educationstatus.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据服务授权文件上传
     * Summary: 数据服务授权文件上传.
     *
     * @param UploadServiceAuthfileRequest $request
     *
     * @return UploadServiceAuthfileResponse
     */
    public function uploadServiceAuthfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->uploadServiceAuthfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据服务授权文件上传
     * Summary: 数据服务授权文件上传.
     *
     * @param UploadServiceAuthfileRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return UploadServiceAuthfileResponse
     */
    public function uploadServiceAuthfileEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antchain.das.service.authfile.upload',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new UploadServiceAuthfileResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId     = $uploadResp->fileId;
            $request->fileObject = null;
        }
        Utils::validateModel($request);

        return UploadServiceAuthfileResponse::fromMap($this->doRequest('1.0', 'antchain.das.service.authfile.upload', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询国内商标扩展信息
     * Summary: 查询国内商标扩展信息.
     *
     * @param QueryDomestictrademarkExtensioninfoRequest $request
     *
     * @return QueryDomestictrademarkExtensioninfoResponse
     */
    public function queryDomestictrademarkExtensioninfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDomestictrademarkExtensioninfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询国内商标扩展信息
     * Summary: 查询国内商标扩展信息.
     *
     * @param QueryDomestictrademarkExtensioninfoRequest $request
     * @param string[]                                   $headers
     * @param RuntimeOptions                             $runtime
     *
     * @return QueryDomestictrademarkExtensioninfoResponse
     */
    public function queryDomestictrademarkExtensioninfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDomestictrademarkExtensioninfoResponse::fromMap($this->doRequest('1.0', 'antchain.das.domestictrademark.extensioninfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 文件类型数据服务统一接口
     * Summary: 文件类型服务统一接口.
     *
     * @param GetApplicationFileentranceRequest $request
     *
     * @return GetApplicationFileentranceResponse
     */
    public function getApplicationFileentrance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getApplicationFileentranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 文件类型数据服务统一接口
     * Summary: 文件类型服务统一接口.
     *
     * @param GetApplicationFileentranceRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return GetApplicationFileentranceResponse
     */
    public function getApplicationFileentranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetApplicationFileentranceResponse::fromMap($this->doRequest('1.0', 'antchain.das.application.fileentrance.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 万文
     * Summary: 异步入口--获取流水号.
     *
     * @param InitUnifiedentranceAsyncRequest $request
     *
     * @return InitUnifiedentranceAsyncResponse
     */
    public function initUnifiedentranceAsync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initUnifiedentranceAsyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 万文
     * Summary: 异步入口--获取流水号.
     *
     * @param InitUnifiedentranceAsyncRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return InitUnifiedentranceAsyncResponse
     */
    public function initUnifiedentranceAsyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitUnifiedentranceAsyncResponse::fromMap($this->doRequest('1.0', 'antchain.das.unifiedentrance.async.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取异步结果
     * Summary: 获取异步结果.
     *
     * @param QueryUnifiedentranceAsyncRequest $request
     *
     * @return QueryUnifiedentranceAsyncResponse
     */
    public function queryUnifiedentranceAsync($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryUnifiedentranceAsyncEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取异步结果
     * Summary: 获取异步结果.
     *
     * @param QueryUnifiedentranceAsyncRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryUnifiedentranceAsyncResponse
     */
    public function queryUnifiedentranceAsyncEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryUnifiedentranceAsyncResponse::fromMap($this->doRequest('1.0', 'antchain.das.unifiedentrance.async.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 数据应用统一入口，主站调用
     * Summary: 数据应用统一入口，主站调用.
     *
     * @param QueryMainsiteUnifiedentranceRequest $request
     *
     * @return QueryMainsiteUnifiedentranceResponse
     */
    public function queryMainsiteUnifiedentrance($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMainsiteUnifiedentranceEx($request, $headers, $runtime);
    }

    /**
     * Description: 数据应用统一入口，主站调用
     * Summary: 数据应用统一入口，主站调用.
     *
     * @param QueryMainsiteUnifiedentranceRequest $request
     * @param string[]                            $headers
     * @param RuntimeOptions                      $runtime
     *
     * @return QueryMainsiteUnifiedentranceResponse
     */
    public function queryMainsiteUnifiedentranceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMainsiteUnifiedentranceResponse::fromMap($this->doRequest('1.0', 'antchain.das.mainsite.unifiedentrance.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取授权H5页面链接
     * Summary: 获取授权H5页面链接.
     *
     * @param GetDasLinkRequest $request
     *
     * @return GetDasLinkResponse
     */
    public function getDasLink($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDasLinkEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取授权H5页面链接
     * Summary: 获取授权H5页面链接.
     *
     * @param GetDasLinkRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetDasLinkResponse
     */
    public function getDasLinkEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDasLinkResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.link.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取授权企业VC
     * Summary: 获取授权企业VC.
     *
     * @param GetDasEnterprisevcRequest $request
     *
     * @return GetDasEnterprisevcResponse
     */
    public function getDasEnterprisevc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDasEnterprisevcEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取授权企业VC
     * Summary: 获取授权企业VC.
     *
     * @param GetDasEnterprisevcRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetDasEnterprisevcResponse
     */
    public function getDasEnterprisevcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDasEnterprisevcResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.enterprisevc.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取个人VC
     * Summary: 获取个人VC.
     *
     * @param GetDasIndividualvcRequest $request
     *
     * @return GetDasIndividualvcResponse
     */
    public function getDasIndividualvc($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getDasIndividualvcEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取个人VC
     * Summary: 获取个人VC.
     *
     * @param GetDasIndividualvcRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return GetDasIndividualvcResponse
     */
    public function getDasIndividualvcEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetDasIndividualvcResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.individualvc.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发送短信验证码
     * Summary: 发送短信验证码
     *
     * @param SendDasSmsRequest $request
     *
     * @return SendDasSmsResponse
     */
    public function sendDasSms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendDasSmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 发送短信验证码
     * Summary: 发送短信验证码
     *
     * @param SendDasSmsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return SendDasSmsResponse
     */
    public function sendDasSmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendDasSmsResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.sms.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 通过短信验证码授权
     * Summary: 通过短信验证码授权.
     *
     * @param AuthDasSmsRequest $request
     *
     * @return AuthDasSmsResponse
     */
    public function authDasSms($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authDasSmsEx($request, $headers, $runtime);
    }

    /**
     * Description: 通过短信验证码授权
     * Summary: 通过短信验证码授权.
     *
     * @param AuthDasSmsRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return AuthDasSmsResponse
     */
    public function authDasSmsEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthDasSmsResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.sms.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
     * Summary: 企业信息核验.
     *
     * @param VerifyDasEnterpriseRequest $request
     *
     * @return VerifyDasEnterpriseResponse
     */
    public function verifyDasEnterprise($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyDasEnterpriseEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
     * Summary: 企业信息核验.
     *
     * @param VerifyDasEnterpriseRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return VerifyDasEnterpriseResponse
     */
    public function verifyDasEnterpriseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyDasEnterpriseResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.enterprise.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 个人信息核验
     * Summary: 个人信息核验.
     *
     * @param VerifyDasIndividualRequest $request
     *
     * @return VerifyDasIndividualResponse
     */
    public function verifyDasIndividual($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyDasIndividualEx($request, $headers, $runtime);
    }

    /**
     * Description: 个人信息核验
     * Summary: 个人信息核验.
     *
     * @param VerifyDasIndividualRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return VerifyDasIndividualResponse
     */
    public function verifyDasIndividualEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyDasIndividualResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.individual.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建数据源
     * Summary: 创建数据源.
     *
     * @param CreateDasDatasourceRequest $request
     *
     * @return CreateDasDatasourceResponse
     */
    public function createDasDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createDasDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建数据源
     * Summary: 创建数据源.
     *
     * @param CreateDasDatasourceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return CreateDasDatasourceResponse
     */
    public function createDasDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateDasDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.datasource.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 更新数据源
     * Summary: 更新数据源.
     *
     * @param UpdateDasDatasourceRequest $request
     *
     * @return UpdateDasDatasourceResponse
     */
    public function updateDasDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateDasDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 更新数据源
     * Summary: 更新数据源.
     *
     * @param UpdateDasDatasourceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return UpdateDasDatasourceResponse
     */
    public function updateDasDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateDasDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.datasource.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 删除数据源
     * Summary: 删除数据源.
     *
     * @param DeleteDasDatasourceRequest $request
     *
     * @return DeleteDasDatasourceResponse
     */
    public function deleteDasDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deleteDasDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 删除数据源
     * Summary: 删除数据源.
     *
     * @param DeleteDasDatasourceRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return DeleteDasDatasourceResponse
     */
    public function deleteDasDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeleteDasDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.datasource.delete', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询数据源信息
     * Summary: 查询数据源信息.
     *
     * @param QueryDasDatasourceRequest $request
     *
     * @return QueryDasDatasourceResponse
     */
    public function queryDasDatasource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDasDatasourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询数据源信息
     * Summary: 查询数据源信息.
     *
     * @param QueryDasDatasourceRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryDasDatasourceResponse
     */
    public function queryDasDatasourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDasDatasourceResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.datasource.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 校验授权结果
     * Summary: 校验授权结果.
     *
     * @param VerifyDasAuthresultRequest $request
     *
     * @return VerifyDasAuthresultResponse
     */
    public function verifyDasAuthresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyDasAuthresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 校验授权结果
     * Summary: 校验授权结果.
     *
     * @param VerifyDasAuthresultRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return VerifyDasAuthresultResponse
     */
    public function verifyDasAuthresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyDasAuthresultResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.authresult.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据授权三方信息做授权
     * Summary: 根据授权三方信息做授权.
     *
     * @param AuthDasAuthresultRequest $request
     *
     * @return AuthDasAuthresultResponse
     */
    public function authDasAuthresult($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->authDasAuthresultEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据授权三方信息做授权
     * Summary: 根据授权三方信息做授权.
     *
     * @param AuthDasAuthresultRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return AuthDasAuthresultResponse
     */
    public function authDasAuthresultEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return AuthDasAuthresultResponse::fromMap($this->doRequest('1.0', 'antchain.das.das.authresult.auth', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUpload($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntcloudGatewayxFileUploadEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建.
     *
     * @param CreateAntcloudGatewayxFileUploadRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
     */
    public function createAntcloudGatewayxFileUploadEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntcloudGatewayxFileUploadResponse::fromMap($this->doRequest('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
