<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\NFTX\Models\CreateNftIssuerRequest;
use AntChain\NFTX\Models\CreateNftIssuerResponse;
use AntChain\NFTX\Models\ExecNftTransferRequest;
use AntChain\NFTX\Models\ExecNftTransferResponse;
use AntChain\NFTX\Models\ImportNftCreateRequest;
use AntChain\NFTX\Models\ImportNftCreateResponse;
use AntChain\NFTX\Models\QueryNftCreateRequest;
use AntChain\NFTX\Models\QueryNftCreateResponse;
use AntChain\NFTX\Models\QueryNftCustomerRequest;
use AntChain\NFTX\Models\QueryNftCustomerResponse;
use AntChain\NFTX\Models\QueryNftOrderRequest;
use AntChain\NFTX\Models\QueryNftOrderResponse;
use AntChain\NFTX\Models\SendNftTransferRequest;
use AntChain\NFTX\Models\SendNftTransferResponse;
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
            // nft发行的文件
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
                    'sdk_version'      => '1.1.3',
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
     * Description: B端商户的NFT发行以及铸造
     * Summary: B端商户的NFT铸造.
     *
     * @param ImportNftCreateRequest $request
     *
     * @return ImportNftCreateResponse
     */
    public function importNftCreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importNftCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: B端商户的NFT发行以及铸造
     * Summary: B端商户的NFT铸造.
     *
     * @param ImportNftCreateRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ImportNftCreateResponse
     */
    public function importNftCreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportNftCreateResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.create.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
     * Summary: B端商户的NFT发行铸造后查询.
     *
     * @param QueryNftCreateRequest $request
     *
     * @return QueryNftCreateResponse
     */
    public function queryNftCreate($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNftCreateEx($request, $headers, $runtime);
    }

    /**
     * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
     * Summary: B端商户的NFT发行铸造后查询.
     *
     * @param QueryNftCreateRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryNftCreateResponse
     */
    public function queryNftCreateEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNftCreateResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.create.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按商品编码（skuid）B2C发放NFT
     * Summary: 按商品编码B2C发放NFT.
     *
     * @param ExecNftTransferRequest $request
     *
     * @return ExecNftTransferResponse
     */
    public function execNftTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execNftTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 按商品编码（skuid）B2C发放NFT
     * Summary: 按商品编码B2C发放NFT.
     *
     * @param ExecNftTransferRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecNftTransferResponse
     */
    public function execNftTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecNftTransferResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.transfer.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按项目表编码B2C发放NFT
     * Summary: 按项目表编码B2C发放NFT.
     *
     * @param SendNftTransferRequest $request
     *
     * @return SendNftTransferResponse
     */
    public function sendNftTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->sendNftTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 按项目表编码B2C发放NFT
     * Summary: 按项目表编码B2C发放NFT.
     *
     * @param SendNftTransferRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return SendNftTransferResponse
     */
    public function sendNftTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SendNftTransferResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.transfer.send', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据nftId查询客户NFT资产
     * Summary: 根据nftId查询客户NFT资产.
     *
     * @param QueryNftCustomerRequest $request
     *
     * @return QueryNftCustomerResponse
     */
    public function queryNftCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNftCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据nftId查询客户NFT资产
     * Summary: 根据nftId查询客户NFT资产.
     *
     * @param QueryNftCustomerRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryNftCustomerResponse
     */
    public function queryNftCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNftCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.customer.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 根据外部订单号查询该订单的NFT流水记录
     * Summary: 根据外部订单号查询该订单的NFT流水记录.
     *
     * @param QueryNftOrderRequest $request
     *
     * @return QueryNftOrderResponse
     */
    public function queryNftOrder($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNftOrderEx($request, $headers, $runtime);
    }

    /**
     * Description: 根据外部订单号查询该订单的NFT流水记录
     * Summary: 根据外部订单号查询该订单的NFT流水记录.
     *
     * @param QueryNftOrderRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryNftOrderResponse
     */
    public function queryNftOrderEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNftOrderResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.order.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: NFT发行审核&铸造
     * Summary: NFT发行审核&铸造.
     *
     * @param CreateNftIssuerRequest $request
     *
     * @return CreateNftIssuerResponse
     */
    public function createNftIssuer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createNftIssuerEx($request, $headers, $runtime);
    }

    /**
     * Description: NFT发行审核&铸造
     * Summary: NFT发行审核&铸造.
     *
     * @param CreateNftIssuerRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return CreateNftIssuerResponse
     */
    public function createNftIssuerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateNftIssuerResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.issuer.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
