<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\ApplyAntsaasStaffingcInsureSignurlRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\ApplyAntsaasStaffingcInsureSignurlResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\CreateAntcloudGatewayxFileUploadRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\CreateAntcloudGatewayxFileUploadResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\CreateAntsaasStaffingcEpcertificationAuthorizeRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\CreateAntsaasStaffingcEpcertificationAuthorizeResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\ListAntsaasStaffingcInsureProductRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\ListAntsaasStaffingcInsureProductResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcContractCaRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcContractCaResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcContractSignRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcContractSignResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcEpcertificationRiskRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcEpcertificationRiskResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcEpcertificationUrlRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcEpcertificationUrlResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcInsurePriceRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\QueryAntsaasStaffingcInsurePriceResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\SendAntsaasStaffingcInsureRefundRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\SendAntsaasStaffingcInsureRefundResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\SendAntsaasStaffingcInsureRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\SendAntsaasStaffingcInsureResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\SignAntsaasStaffingcContractCaRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\SignAntsaasStaffingcContractCaResponse;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\SignAntsaasStaffingcContractSendRequest;
use AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models\SignAntsaasStaffingcContractSendResponse;
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
            // CA电子签约正文章信息
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
                    'sdk_version'      => '2.2.0',
                    '_prod_code'       => 'ak_320bc483f2434f39a3af9ec9f04d3cc0',
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
     * Description: 发起签约调用接口
     * Summary: 发起签约.
     *
     * @param SignAntsaasStaffingcContractSendRequest $request
     *
     * @return SignAntsaasStaffingcContractSendResponse
     */
    public function signAntsaasStaffingcContractSend($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->signAntsaasStaffingcContractSendEx($request, $headers, $runtime);
    }

    /**
     * Description: 发起签约调用接口
     * Summary: 发起签约.
     *
     * @param SignAntsaasStaffingcContractSendRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return SignAntsaasStaffingcContractSendResponse
     */
    public function signAntsaasStaffingcContractSendEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antsaas.staffingc.contract.send.sign',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new SignAntsaasStaffingcContractSendResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return SignAntsaasStaffingcContractSendResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.contract.send.sign', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 签约结果查询
     * Summary: 查询签约结果.
     *
     * @param QueryAntsaasStaffingcContractSignRequest $request
     *
     * @return QueryAntsaasStaffingcContractSignResponse
     */
    public function queryAntsaasStaffingcContractSign($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntsaasStaffingcContractSignEx($request, $headers, $runtime);
    }

    /**
     * Description: 签约结果查询
     * Summary: 查询签约结果.
     *
     * @param QueryAntsaasStaffingcContractSignRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return QueryAntsaasStaffingcContractSignResponse
     */
    public function queryAntsaasStaffingcContractSignEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntsaasStaffingcContractSignResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.contract.sign.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证授权url查询接口
     * Summary: 企业认证授权url查询接口.
     *
     * @param QueryAntsaasStaffingcEpcertificationUrlRequest $request
     *
     * @return QueryAntsaasStaffingcEpcertificationUrlResponse
     */
    public function queryAntsaasStaffingcEpcertificationUrl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntsaasStaffingcEpcertificationUrlEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证授权url查询接口
     * Summary: 企业认证授权url查询接口.
     *
     * @param QueryAntsaasStaffingcEpcertificationUrlRequest $request
     * @param string[]                                       $headers
     * @param RuntimeOptions                                 $runtime
     *
     * @return QueryAntsaasStaffingcEpcertificationUrlResponse
     */
    public function queryAntsaasStaffingcEpcertificationUrlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntsaasStaffingcEpcertificationUrlResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.epcertification.url.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证创建接口
     * Summary: 企业认证创建接口.
     *
     * @param CreateAntsaasStaffingcEpcertificationAuthorizeRequest $request
     *
     * @return CreateAntsaasStaffingcEpcertificationAuthorizeResponse
     */
    public function createAntsaasStaffingcEpcertificationAuthorize($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createAntsaasStaffingcEpcertificationAuthorizeEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证创建接口
     * Summary: 企业认证创建接口.
     *
     * @param CreateAntsaasStaffingcEpcertificationAuthorizeRequest $request
     * @param string[]                                              $headers
     * @param RuntimeOptions                                        $runtime
     *
     * @return CreateAntsaasStaffingcEpcertificationAuthorizeResponse
     */
    public function createAntsaasStaffingcEpcertificationAuthorizeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateAntsaasStaffingcEpcertificationAuthorizeResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.epcertification.authorize.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 企业认证风险查询接口
     * Summary: 企业认证风险查询接口.
     *
     * @param QueryAntsaasStaffingcEpcertificationRiskRequest $request
     *
     * @return QueryAntsaasStaffingcEpcertificationRiskResponse
     */
    public function queryAntsaasStaffingcEpcertificationRisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntsaasStaffingcEpcertificationRiskEx($request, $headers, $runtime);
    }

    /**
     * Description: 企业认证风险查询接口
     * Summary: 企业认证风险查询接口.
     *
     * @param QueryAntsaasStaffingcEpcertificationRiskRequest $request
     * @param string[]                                        $headers
     * @param RuntimeOptions                                  $runtime
     *
     * @return QueryAntsaasStaffingcEpcertificationRiskResponse
     */
    public function queryAntsaasStaffingcEpcertificationRiskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntsaasStaffingcEpcertificationRiskResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.epcertification.risk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取保险签约认证连接
     * Summary: 获取保险签约认证连接.
     *
     * @param ApplyAntsaasStaffingcInsureSignurlRequest $request
     *
     * @return ApplyAntsaasStaffingcInsureSignurlResponse
     */
    public function applyAntsaasStaffingcInsureSignurl($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyAntsaasStaffingcInsureSignurlEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取保险签约认证连接
     * Summary: 获取保险签约认证连接.
     *
     * @param ApplyAntsaasStaffingcInsureSignurlRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return ApplyAntsaasStaffingcInsureSignurlResponse
     */
    public function applyAntsaasStaffingcInsureSignurlEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyAntsaasStaffingcInsureSignurlResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.insure.signurl.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询可投保的保险产品
     * Summary: 查询可投保的保险产品
     *
     * @param ListAntsaasStaffingcInsureProductRequest $request
     *
     * @return ListAntsaasStaffingcInsureProductResponse
     */
    public function listAntsaasStaffingcInsureProduct($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listAntsaasStaffingcInsureProductEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询可投保的保险产品
     * Summary: 查询可投保的保险产品
     *
     * @param ListAntsaasStaffingcInsureProductRequest $request
     * @param string[]                                 $headers
     * @param RuntimeOptions                           $runtime
     *
     * @return ListAntsaasStaffingcInsureProductResponse
     */
    public function listAntsaasStaffingcInsureProductEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListAntsaasStaffingcInsureProductResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.insure.product.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询保险产品价格相关信息
     * Summary: 查询保险产品价格相关信息.
     *
     * @param QueryAntsaasStaffingcInsurePriceRequest $request
     *
     * @return QueryAntsaasStaffingcInsurePriceResponse
     */
    public function queryAntsaasStaffingcInsurePrice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntsaasStaffingcInsurePriceEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询保险产品价格相关信息
     * Summary: 查询保险产品价格相关信息.
     *
     * @param QueryAntsaasStaffingcInsurePriceRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return QueryAntsaasStaffingcInsurePriceResponse
     */
    public function queryAntsaasStaffingcInsurePriceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntsaasStaffingcInsurePriceResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.insure.price.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 执行投保
     * Summary: 执行投保.
     *
     * @param SendAntsaasStaffingcInsureRequest $request
     *
     * @return SendAntsaasStaffingcInsureResponse
     */
    public function sendAntsaasStaffingcInsure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendAntsaasStaffingcInsureEx($request, $headers, $runtime);
    }

    /**
     * Description: 执行投保
     * Summary: 执行投保.
     *
     * @param SendAntsaasStaffingcInsureRequest $request
     * @param string[]                          $headers
     * @param RuntimeOptions                    $runtime
     *
     * @return SendAntsaasStaffingcInsureResponse
     */
    public function sendAntsaasStaffingcInsureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendAntsaasStaffingcInsureResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.insure.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 退保接口
     * Summary: 退保接口.
     *
     * @param SendAntsaasStaffingcInsureRefundRequest $request
     *
     * @return SendAntsaasStaffingcInsureRefundResponse
     */
    public function sendAntsaasStaffingcInsureRefund($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendAntsaasStaffingcInsureRefundEx($request, $headers, $runtime);
    }

    /**
     * Description: 退保接口
     * Summary: 退保接口.
     *
     * @param SendAntsaasStaffingcInsureRefundRequest $request
     * @param string[]                                $headers
     * @param RuntimeOptions                          $runtime
     *
     * @return SendAntsaasStaffingcInsureRefundResponse
     */
    public function sendAntsaasStaffingcInsureRefundEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendAntsaasStaffingcInsureRefundResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.insure.refund.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: CA电子签
     * Summary: CA电子签约.
     *
     * @param SignAntsaasStaffingcContractCaRequest $request
     *
     * @return SignAntsaasStaffingcContractCaResponse
     */
    public function signAntsaasStaffingcContractCa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->signAntsaasStaffingcContractCaEx($request, $headers, $runtime);
    }

    /**
     * Description: CA电子签
     * Summary: CA电子签约.
     *
     * @param SignAntsaasStaffingcContractCaRequest $request
     * @param string[]                              $headers
     * @param RuntimeOptions                        $runtime
     *
     * @return SignAntsaasStaffingcContractCaResponse
     */
    public function signAntsaasStaffingcContractCaEx($request, $headers, $runtime)
    {
        if (!Utils::isUnset($request->fileObject)) {
            $uploadReq = new CreateAntcloudGatewayxFileUploadRequest([
                'authToken' => $request->authToken,
                'apiCode'   => 'antsaas.staffingc.contract.ca.sign',
                'fileName'  => $request->fileObjectName,
            ]);
            $uploadResp = $this->createAntcloudGatewayxFileUploadEx($uploadReq, $headers, $runtime);
            if (!UtilClient::isSuccess($uploadResp->resultCode, 'ok')) {
                return new SignAntsaasStaffingcContractCaResponse([
                    'reqMsgId'   => $uploadResp->reqMsgId,
                    'resultCode' => $uploadResp->resultCode,
                    'resultMsg'  => $uploadResp->resultMsg,
                ]);
            }
            $uploadHeaders = UtilClient::parseUploadHeaders($uploadResp->uploadHeaders);
            UtilClient::putObject($request->fileObject, $uploadHeaders, $uploadResp->uploadUrl);
            $request->fileId = $uploadResp->fileId;
        }
        Utils::validateModel($request);

        return SignAntsaasStaffingcContractCaResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.contract.ca.sign', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询签约结果
     * Summary: 查询签约结果.
     *
     * @param QueryAntsaasStaffingcContractCaRequest $request
     *
     * @return QueryAntsaasStaffingcContractCaResponse
     */
    public function queryAntsaasStaffingcContractCa($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAntsaasStaffingcContractCaEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询签约结果
     * Summary: 查询签约结果.
     *
     * @param QueryAntsaasStaffingcContractCaRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return QueryAntsaasStaffingcContractCaResponse
     */
    public function queryAntsaasStaffingcContractCaEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAntsaasStaffingcContractCaResponse::fromMap($this->doRequest('1.0', 'antsaas.staffingc.contract.ca.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
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
