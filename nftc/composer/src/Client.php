<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\NFTC\Models\ApplyNftTransferRequest;
use AntChain\NFTC\Models\ApplyNftTransferResponse;
use AntChain\NFTC\Models\ApplyOauthTokenRequest;
use AntChain\NFTC\Models\ApplyOauthTokenResponse;
use AntChain\NFTC\Models\ApplyOauthUserinfotokenRequest;
use AntChain\NFTC\Models\ApplyOauthUserinfotokenResponse;
use AntChain\NFTC\Models\BindResourceGeneralresourcefileRequest;
use AntChain\NFTC\Models\BindResourceGeneralresourcefileResponse;
use AntChain\NFTC\Models\CreateResourceGeneralresourceRequest;
use AntChain\NFTC\Models\CreateResourceGeneralresourceResponse;
use AntChain\NFTC\Models\PagequeryNftCustomerRequest;
use AntChain\NFTC\Models\PagequeryNftCustomerResponse;
use AntChain\NFTC\Models\PublishMerchantDiyskuRequest;
use AntChain\NFTC\Models\PublishMerchantDiyskuResponse;
use AntChain\NFTC\Models\PublishResourceGeneralresourcefileRequest;
use AntChain\NFTC\Models\PublishResourceGeneralresourcefileResponse;
use AntChain\NFTC\Models\QueryAvatarProfileRequest;
use AntChain\NFTC\Models\QueryAvatarProfileResponse;
use AntChain\NFTC\Models\QueryMerchantDiyskuRequest;
use AntChain\NFTC\Models\QueryMerchantDiyskuResponse;
use AntChain\NFTC\Models\QueryMerchantUgcimagesRequest;
use AntChain\NFTC\Models\QueryMerchantUgcimagesResponse;
use AntChain\NFTC\Models\QueryNftOrderRequest;
use AntChain\NFTC\Models\QueryNftOrderResponse;
use AntChain\NFTC\Models\QueryOauthUserinfoRequest;
use AntChain\NFTC\Models\QueryOauthUserinfoResponse;
use AntChain\NFTC\Models\QueryResourcePatchlistRequest;
use AntChain\NFTC\Models\QueryResourcePatchlistResponse;
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
            // 数字人部件素材对象
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
                    'sdk_version'      => '1.0.5',
                    '_prod_code'       => 'NFTC',
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
     * Description: DIY藏品发放
     * Summary: DIY藏品发放.
     *
     * @param PublishMerchantDiyskuRequest $request
     *
     * @return PublishMerchantDiyskuResponse
     */
    public function publishMerchantDiysku($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishMerchantDiyskuEx($request, $headers, $runtime);
    }

    /**
     * Description: DIY藏品发放
     * Summary: DIY藏品发放.
     *
     * @param PublishMerchantDiyskuRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return PublishMerchantDiyskuResponse
     */
    public function publishMerchantDiyskuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishMerchantDiyskuResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.merchant.diysku.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: DIY藏品发放查询
     * Summary: DIY藏品发放查询.
     *
     * @param QueryMerchantDiyskuRequest $request
     *
     * @return QueryMerchantDiyskuResponse
     */
    public function queryMerchantDiysku($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantDiyskuEx($request, $headers, $runtime);
    }

    /**
     * Description: DIY藏品发放查询
     * Summary: DIY藏品发放查询.
     *
     * @param QueryMerchantDiyskuRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryMerchantDiyskuResponse
     */
    public function queryMerchantDiyskuEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantDiyskuResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.merchant.diysku.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 提供ISV  ugc铸造图片查询的openapi服务
     * Summary: ugc铸造图片查询的openapi接口.
     *
     * @param QueryMerchantUgcimagesRequest $request
     *
     * @return QueryMerchantUgcimagesResponse
     */
    public function queryMerchantUgcimages($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryMerchantUgcimagesEx($request, $headers, $runtime);
    }

    /**
     * Description: 提供ISV  ugc铸造图片查询的openapi服务
     * Summary: ugc铸造图片查询的openapi接口.
     *
     * @param QueryMerchantUgcimagesRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryMerchantUgcimagesResponse
     */
    public function queryMerchantUgcimagesEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryMerchantUgcimagesResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.merchant.ugcimages.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
     * Summary: 查询当前数字人形象
     *
     * @param QueryAvatarProfileRequest $request
     *
     * @return QueryAvatarProfileResponse
     */
    public function queryAvatarProfile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAvatarProfileEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
     * Summary: 查询当前数字人形象
     *
     * @param QueryAvatarProfileRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryAvatarProfileResponse
     */
    public function queryAvatarProfileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAvatarProfileResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.avatar.profile.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: authcode换取token
     * Summary: authcode换取token.
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
     * Description: authcode换取token
     * Summary: authcode换取token.
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

        return ApplyOauthTokenResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.oauth.token.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: token获取头像/昵称
     * Summary: token获取头像/昵称.
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
     * Description: token获取头像/昵称
     * Summary: token获取头像/昵称.
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

        return QueryOauthUserinfoResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.oauth.userinfo.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 获取用户Token
     * Summary: 获取用户Token.
     *
     * @param ApplyOauthUserinfotokenRequest $request
     *
     * @return ApplyOauthUserinfotokenResponse
     */
    public function applyOauthUserinfotoken($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyOauthUserinfotokenEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取用户Token
     * Summary: 获取用户Token.
     *
     * @param ApplyOauthUserinfotokenRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return ApplyOauthUserinfotokenResponse
     */
    public function applyOauthUserinfotokenEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyOauthUserinfotokenResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.oauth.userinfotoken.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租户根据sku给用户发放藏品
     * Summary: 发放藏品
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
     * Description: 租户根据sku给用户发放藏品
     * Summary: 发放藏品
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

        return ApplyNftTransferResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.nft.transfer.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 调用租户分页查询用户该租户发行的sku的资产
     * Summary: 查询藏品
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
     * Description: 调用租户分页查询用户该租户发行的sku的资产
     * Summary: 查询藏品
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

        return PagequeryNftCustomerResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.nft.customer.pagequery', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询支付结果
     * Summary: 查询支付结果.
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
     * Description: 查询支付结果
     * Summary: 查询支付结果.
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

        return QueryNftOrderResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.nft.order.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 创建通用资源
     * Summary: 创建通用资源.
     *
     * @param CreateResourceGeneralresourceRequest $request
     *
     * @return CreateResourceGeneralresourceResponse
     */
    public function createResourceGeneralresource($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createResourceGeneralresourceEx($request, $headers, $runtime);
    }

    /**
     * Description: 创建通用资源
     * Summary: 创建通用资源.
     *
     * @param CreateResourceGeneralresourceRequest $request
     * @param string[]                             $headers
     * @param RuntimeOptions                       $runtime
     *
     * @return CreateResourceGeneralresourceResponse
     */
    public function createResourceGeneralresourceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateResourceGeneralresourceResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.resource.generalresource.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 绑定文件到通用资源ID
     * Summary: 绑定文件到通用资源ID.
     *
     * @param BindResourceGeneralresourcefileRequest $request
     *
     * @return BindResourceGeneralresourcefileResponse
     */
    public function bindResourceGeneralresourcefile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->bindResourceGeneralresourcefileEx($request, $headers, $runtime);
    }

    /**
     * Description: 绑定文件到通用资源ID
     * Summary: 绑定文件到通用资源ID.
     *
     * @param BindResourceGeneralresourcefileRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return BindResourceGeneralresourcefileResponse
     */
    public function bindResourceGeneralresourcefileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return BindResourceGeneralresourcefileResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.resource.generalresourcefile.bind', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 发布通用资源文件
     * Summary: 发布通用资源文件.
     *
     * @param PublishResourceGeneralresourcefileRequest $request
     *
     * @return PublishResourceGeneralresourcefileResponse
     */
    public function publishResourceGeneralresourcefile($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->publishResourceGeneralresourcefileEx($request, $headers, $runtime);
    }

    /**
     * Description: 发布通用资源文件
     * Summary: 发布通用资源文件.
     *
     * @param PublishResourceGeneralresourcefileRequest $request
     * @param string[]                                  $headers
     * @param RuntimeOptions                            $runtime
     *
     * @return PublishResourceGeneralresourcefileResponse
     */
    public function publishResourceGeneralresourcefileEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return PublishResourceGeneralresourcefileResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.resource.generalresourcefile.publish', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询资源文件差量包列表
     * Summary: 查询资源文件差量包列表.
     *
     * @param QueryResourcePatchlistRequest $request
     *
     * @return QueryResourcePatchlistResponse
     */
    public function queryResourcePatchlist($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryResourcePatchlistEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询资源文件差量包列表
     * Summary: 查询资源文件差量包列表.
     *
     * @param QueryResourcePatchlistRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryResourcePatchlistResponse
     */
    public function queryResourcePatchlistEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryResourcePatchlistResponse::fromMap($this->doRequest('1.0', 'antchain.nftc.resource.patchlist.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
