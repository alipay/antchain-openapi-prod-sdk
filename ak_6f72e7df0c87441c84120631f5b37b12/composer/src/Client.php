<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6f72e7df0c87441c84120631f5b37b12;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\ApplyBaasChainCertAntRequest;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\ApplyBaasChainCertAntResponse;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\CreateBaasChainCertAntRequest;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\CreateBaasChainCertAntResponse;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\DownloadBaasChainCertAntRequest;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\DownloadBaasChainCertAntResponse;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\QueryBaasChainCertAntRequest;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\QueryBaasChainCertAntResponse;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\ReinitBaasChainCertAntRequest;
use AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models\ReinitBaasChainCertAntResponse;
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
            'timeouted'               => 'retry',
            'readTimeout'             => Utils::defaultNumber($runtime->readTimeout, $this->_readTimeout),
            'connectTimeout'          => Utils::defaultNumber($runtime->connectTimeout, $this->_connectTimeout),
            'httpProxy'               => Utils::defaultString($runtime->httpProxy, $this->_httpProxy),
            'httpsProxy'              => Utils::defaultString($runtime->httpsProxy, $this->_httpsProxy),
            'noProxy'                 => Utils::defaultString($runtime->noProxy, $this->_noProxy),
            'maxIdleConns'            => Utils::defaultNumber($runtime->maxIdleConns, $this->_maxIdleConns),
            'maxIdleTimeMillis'       => $this->_maxIdleTimeMillis,
            'keepAliveDurationMillis' => $this->_keepAliveDurationMillis,
            'maxRequests'             => $this->_maxRequests,
            'maxRequestsPerHost'      => $this->_maxRequestsPerHost,
            'retry'                   => [
                'retryable'   => $runtime->autoretry,
                'maxAttempts' => Utils::defaultNumber($runtime->maxAttempts, 3),
            ],
            'backoff' => [
                'policy' => Utils::defaultString($runtime->backoffPolicy, 'no'),
                'period' => Utils::defaultNumber($runtime->backoffPeriod, 1),
            ],
            'ignoreSSL' => $runtime->ignoreSSL,
            // 分页属性
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
                    'sdk_version'      => '1.0.0',
                    '_prod_code'       => 'ak_6f72e7df0c87441c84120631f5b37b12',
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
     * Description: 自动申请区块链证书
     * Summary: 自动申请区块链证书.
     *
     * @param ApplyBaasChainCertAntRequest $request
     *
     * @return ApplyBaasChainCertAntResponse
     */
    public function applyBaasChainCertAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyBaasChainCertAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 自动申请区块链证书
     * Summary: 自动申请区块链证书.
     *
     * @param ApplyBaasChainCertAntRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return ApplyBaasChainCertAntResponse
     */
    public function applyBaasChainCertAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyBaasChainCertAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.cert.ant.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 手工创建区块链证书
     * Summary: 手工创建区块链证书.
     *
     * @param CreateBaasChainCertAntRequest $request
     *
     * @return CreateBaasChainCertAntResponse
     */
    public function createBaasChainCertAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBaasChainCertAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 手工创建区块链证书
     * Summary: 手工创建区块链证书.
     *
     * @param CreateBaasChainCertAntRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return CreateBaasChainCertAntResponse
     */
    public function createBaasChainCertAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBaasChainCertAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.cert.ant.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链证书下载
     * Summary: 区块链证书下载.
     *
     * @param DownloadBaasChainCertAntRequest $request
     *
     * @return DownloadBaasChainCertAntResponse
     */
    public function downloadBaasChainCertAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->downloadBaasChainCertAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链证书下载
     * Summary: 区块链证书下载.
     *
     * @param DownloadBaasChainCertAntRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return DownloadBaasChainCertAntResponse
     */
    public function downloadBaasChainCertAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DownloadBaasChainCertAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.cert.ant.download', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链证书查询
     * Summary: 区块链证书查询.
     *
     * @param QueryBaasChainCertAntRequest $request
     *
     * @return QueryBaasChainCertAntResponse
     */
    public function queryBaasChainCertAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryBaasChainCertAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链证书查询
     * Summary: 区块链证书查询.
     *
     * @param QueryBaasChainCertAntRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryBaasChainCertAntResponse
     */
    public function queryBaasChainCertAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryBaasChainCertAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.cert.ant.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 区块链证书重置
     * Summary: 区块链证书重置.
     *
     * @param ReinitBaasChainCertAntRequest $request
     *
     * @return ReinitBaasChainCertAntResponse
     */
    public function reinitBaasChainCertAnt($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->reinitBaasChainCertAntEx($request, $headers, $runtime);
    }

    /**
     * Description: 区块链证书重置
     * Summary: 区块链证书重置.
     *
     * @param ReinitBaasChainCertAntRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return ReinitBaasChainCertAntResponse
     */
    public function reinitBaasChainCertAntEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ReinitBaasChainCertAntResponse::fromMap($this->doRequest('1.0', 'baas.chain.cert.ant.reinit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
