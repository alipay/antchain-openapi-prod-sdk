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
use AntChain\NFTX\Models\ApplyNftTransferbyprojectwithchanneltenantRequest;
use AntChain\NFTX\Models\ApplyNftTransferbyprojectwithchanneltenantResponse;
use AntChain\NFTX\Models\ApplyNftTransferRequest;
use AntChain\NFTX\Models\ApplyNftTransferResponse;
use AntChain\NFTX\Models\ApplyOauthTokenRequest;
use AntChain\NFTX\Models\ApplyOauthTokenResponse;
use AntChain\NFTX\Models\CreateNftIssuerRequest;
use AntChain\NFTX\Models\CreateNftIssuerResponse;
use AntChain\NFTX\Models\CreateNftPublishRequest;
use AntChain\NFTX\Models\CreateNftPublishResponse;
use AntChain\NFTX\Models\ExecNftTransferRequest;
use AntChain\NFTX\Models\ExecNftTransferResponse;
use AntChain\NFTX\Models\ImportNftCreateRequest;
use AntChain\NFTX\Models\ImportNftCreateResponse;
use AntChain\NFTX\Models\ImportResourceConsigneeinfoRequest;
use AntChain\NFTX\Models\ImportResourceConsigneeinfoResponse;
use AntChain\NFTX\Models\PagequeryNftCustomerRequest;
use AntChain\NFTX\Models\PagequeryNftCustomerResponse;
use AntChain\NFTX\Models\PayOrderDataRequest;
use AntChain\NFTX\Models\PayOrderDataResponse;
use AntChain\NFTX\Models\QueryNftAssetbyskuRequest;
use AntChain\NFTX\Models\QueryNftAssetbyskuResponse;
use AntChain\NFTX\Models\QueryNftAssetRequest;
use AntChain\NFTX\Models\QueryNftAssetResponse;
use AntChain\NFTX\Models\QueryNftCreateRequest;
use AntChain\NFTX\Models\QueryNftCreateResponse;
use AntChain\NFTX\Models\QueryNftCustomerRequest;
use AntChain\NFTX\Models\QueryNftCustomerResponse;
use AntChain\NFTX\Models\QueryNftOrderRequest;
use AntChain\NFTX\Models\QueryNftOrderResponse;
use AntChain\NFTX\Models\QueryOauthUserinfoRequest;
use AntChain\NFTX\Models\QueryOauthUserinfoResponse;
use AntChain\NFTX\Models\QueryResourceImageRequest;
use AntChain\NFTX\Models\QueryResourceImageResponse;
use AntChain\NFTX\Models\RunNftTransferRequest;
use AntChain\NFTX\Models\RunNftTransferResponse;
use AntChain\NFTX\Models\SendNftTransferRequest;
use AntChain\NFTX\Models\SendNftTransferResponse;
use AntChain\NFTX\Models\SyncOrderDataRequest;
use AntChain\NFTX\Models\SyncOrderDataResponse;
use AntChain\NFTX\Models\UpdateNftPropertyRequest;
use AntChain\NFTX\Models\UpdateNftPropertyResponse;
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
                    'sdk_version'      => '1.9.4',
                    '_prod_code'       => 'NFTX',
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
     * Description: B端商户的NFT发行以及铸造
     * Summary: B端商户的NFT铸造 (废弃).
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
     * Summary: B端商户的NFT铸造 (废弃).
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

    /**
     * Description: B端用户资产列表查询
     * Summary: 用户资产列表查询.
     *
     * @param PagequeryNftCustomerRequest $request
     *
     * @return PagequeryNftCustomerResponse
     */
    public function pagequeryNftCustomer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->pagequeryNftCustomerEx($request, $headers, $runtime);
    }

    /**
     * Description: B端用户资产列表查询
     * Summary: 用户资产列表查询.
     *
     * @param PagequeryNftCustomerRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return PagequeryNftCustomerResponse
     */
    public function pagequeryNftCustomerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PagequeryNftCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.customer.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: NFT铸造, 带监制方和渠道租户
     * Summary: NFT铸造, 带监制方和渠道租户.
     *
     * @param CreateNftPublishRequest $request
     *
     * @return CreateNftPublishResponse
     */
    public function createNftPublish($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createNftPublishEx($request, $headers, $runtime);
    }

    /**
     * Description: NFT铸造, 带监制方和渠道租户
     * Summary: NFT铸造, 带监制方和渠道租户.
     *
     * @param CreateNftPublishRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return CreateNftPublishResponse
     */
    public function createNftPublishEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateNftPublishResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.publish.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按项目表编码B2C发放NFT,带渠道租户
     * Summary: 按项目表编码B2C发放NFT, (废弃).
     *
     * @param RunNftTransferRequest $request
     *
     * @return RunNftTransferResponse
     */
    public function runNftTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->runNftTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 按项目表编码B2C发放NFT,带渠道租户
     * Summary: 按项目表编码B2C发放NFT, (废弃).
     *
     * @param RunNftTransferRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return RunNftTransferResponse
     */
    public function runNftTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RunNftTransferResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.transfer.run', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按商品编码B2C发放NFT 带渠道租户
     * Summary: 按商品编码B2C发放NFT 带渠道租户.
     *
     * @param ApplyNftTransferRequest $request
     *
     * @return ApplyNftTransferResponse
     */
    public function applyNftTransfer($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyNftTransferEx($request, $headers, $runtime);
    }

    /**
     * Description: 按商品编码B2C发放NFT 带渠道租户
     * Summary: 按商品编码B2C发放NFT 带渠道租户.
     *
     * @param ApplyNftTransferRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return ApplyNftTransferResponse
     */
    public function applyNftTransferEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyNftTransferResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.transfer.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 按项目表编码B2C发放NFT,带渠道租户
     * Summary: 按项目表编码B2C发放NFT,带渠道租户.
     *
     * @param ApplyNftTransferbyprojectwithchanneltenantRequest $request
     *
     * @return ApplyNftTransferbyprojectwithchanneltenantResponse
     */
    public function applyNftTransferbyprojectwithchanneltenant($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyNftTransferbyprojectwithchanneltenantEx($request, $headers, $runtime);
    }

    /**
     * Description: 按项目表编码B2C发放NFT,带渠道租户
     * Summary: 按项目表编码B2C发放NFT,带渠道租户.
     *
     * @param ApplyNftTransferbyprojectwithchanneltenantRequest $request
     * @param string[]                                          $headers
     * @param RuntimeOptions                                    $runtime
     *
     * @return ApplyNftTransferbyprojectwithchanneltenantResponse
     */
    public function applyNftTransferbyprojectwithchanneltenantEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyNftTransferbyprojectwithchanneltenantResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.transferbyprojectwithchanneltenant.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
     * Summary: 校验藏品归属及查询相应藏品信息.
     *
     * @param QueryNftAssetRequest $request
     *
     * @return QueryNftAssetResponse
     */
    public function queryNftAsset($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNftAssetEx($request, $headers, $runtime);
    }

    /**
     * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
     * Summary: 校验藏品归属及查询相应藏品信息.
     *
     * @param QueryNftAssetRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryNftAssetResponse
     */
    public function queryNftAssetEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNftAssetResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.asset.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于sku查询用户资产信息
     * Summary: 基于sku查询用户资产信息.
     *
     * @param QueryNftAssetbyskuRequest $request
     *
     * @return QueryNftAssetbyskuResponse
     */
    public function queryNftAssetbysku($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryNftAssetbyskuEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于sku查询用户资产信息
     * Summary: 基于sku查询用户资产信息.
     *
     * @param QueryNftAssetbyskuRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryNftAssetbyskuResponse
     */
    public function queryNftAssetbyskuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryNftAssetbyskuResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.assetbysku.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 基于直付通模式的开放订单支付接口
     * Summary: 开放订单支付接口.
     *
     * @param PayOrderDataRequest $request
     *
     * @return PayOrderDataResponse
     */
    public function payOrderData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->payOrderDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 基于直付通模式的开放订单支付接口
     * Summary: 开放订单支付接口.
     *
     * @param PayOrderDataRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return PayOrderDataResponse
     */
    public function payOrderDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PayOrderDataResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.order.data.pay', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
     * Summary: 外部订单数据同步.
     *
     * @param SyncOrderDataRequest $request
     *
     * @return SyncOrderDataResponse
     */
    public function syncOrderData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->syncOrderDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
     * Summary: 外部订单数据同步.
     *
     * @param SyncOrderDataRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return SyncOrderDataResponse
     */
    public function syncOrderDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SyncOrderDataResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.order.data.sync', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询实物定制图片
     * Summary: 查询实物定制图片.
     *
     * @param QueryResourceImageRequest $request
     *
     * @return QueryResourceImageResponse
     */
    public function queryResourceImage($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResourceImageEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询实物定制图片
     * Summary: 查询实物定制图片.
     *
     * @param QueryResourceImageRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryResourceImageResponse
     */
    public function queryResourceImageEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResourceImageResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.resource.image.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用户收货信息存档
     * Summary: 用户收货信息存档.
     *
     * @param ImportResourceConsigneeinfoRequest $request
     *
     * @return ImportResourceConsigneeinfoResponse
     */
    public function importResourceConsigneeinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->importResourceConsigneeinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 用户收货信息存档
     * Summary: 用户收货信息存档.
     *
     * @param ImportResourceConsigneeinfoRequest $request
     * @param string[]                           $headers
     * @param RuntimeOptions                     $runtime
     *
     * @return ImportResourceConsigneeinfoResponse
     */
    public function importResourceConsigneeinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ImportResourceConsigneeinfoResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.resource.consigneeinfo.import', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 资产属性更新开放接口
     * Summary: 资产属性更新.
     *
     * @param UpdateNftPropertyRequest $request
     *
     * @return UpdateNftPropertyResponse
     */
    public function updateNftProperty($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->updateNftPropertyEx($request, $headers, $runtime);
    }

    /**
     * Description: 资产属性更新开放接口
     * Summary: 资产属性更新.
     *
     * @param UpdateNftPropertyRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return UpdateNftPropertyResponse
     */
    public function updateNftPropertyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return UpdateNftPropertyResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.nft.property.update', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 拿authcode换token
     * Summary: 拿authcode换token.
     *
     * @param ApplyOauthTokenRequest $request
     *
     * @return ApplyOauthTokenResponse
     */
    public function applyOauthToken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyOauthTokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 拿authcode换token
     * Summary: 拿authcode换token.
     *
     * @param ApplyOauthTokenRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ApplyOauthTokenResponse
     */
    public function applyOauthTokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyOauthTokenResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.oauth.token.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取用户信息
     * Summary: 获取用户信息.
     *
     * @param QueryOauthUserinfoRequest $request
     *
     * @return QueryOauthUserinfoResponse
     */
    public function queryOauthUserinfo($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryOauthUserinfoEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取用户信息
     * Summary: 获取用户信息.
     *
     * @param QueryOauthUserinfoRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryOauthUserinfoResponse
     */
    public function queryOauthUserinfoEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryOauthUserinfoResponse::fromMap($this->doRequest('1.0', 'antchain.nftx.oauth.userinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
