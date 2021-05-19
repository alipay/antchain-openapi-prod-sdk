<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\TDM\Models\CancelAuthRequest;
use AntChain\TDM\Models\CancelAuthResponse;
use AntChain\TDM\Models\CheckCpfCertRequest;
use AntChain\TDM\Models\CheckCpfCertResponse;
use AntChain\TDM\Models\ExecAuthRequest;
use AntChain\TDM\Models\ExecAuthResponse;
use AntChain\TDM\Models\ExecAuthuseRequest;
use AntChain\TDM\Models\ExecAuthuseResponse;
use AntChain\TDM\Models\GetCpfCertRequest;
use AntChain\TDM\Models\GetCpfCertResponse;
use AntChain\TDM\Models\GetCpfCertuseRequest;
use AntChain\TDM\Models\GetCpfCertuseResponse;
use AntChain\TDM\Models\GetCpfDataRequest;
use AntChain\TDM\Models\GetCpfDataResponse;
use AntChain\TDM\Models\InitVerifyRequest;
use AntChain\TDM\Models\InitVerifyResponse;
use AntChain\TDM\Models\ListCpfCertRequest;
use AntChain\TDM\Models\ListCpfCertResponse;
use AntChain\TDM\Models\ListCpfCertuseRequest;
use AntChain\TDM\Models\ListCpfCertuseResponse;
use AntChain\TDM\Models\ListCpfDatauseRequest;
use AntChain\TDM\Models\ListCpfDatauseResponse;
use AntChain\TDM\Models\OpenCpfCertRequest;
use AntChain\TDM\Models\OpenCpfCertResponse;
use AntChain\TDM\Models\QueryAuthOwnerRequest;
use AntChain\TDM\Models\QueryAuthOwnerResponse;
use AntChain\TDM\Models\QueryAuthRequest;
use AntChain\TDM\Models\QueryAuthResponse;
use AntChain\TDM\Models\QueryAuthuseOwnerRequest;
use AntChain\TDM\Models\QueryAuthuseOwnerResponse;
use AntChain\TDM\Models\QueryCpfUserRequest;
use AntChain\TDM\Models\QueryCpfUserResponse;
use AntChain\TDM\Models\SaveCpfCertuseRequest;
use AntChain\TDM\Models\SaveCpfCertuseResponse;
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
            // 链的信息
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
                    'sdk_version'      => '1.0.15',
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
     * Description: 公积金证明开具接口
     * Summary: 公积金证明开具接口.
     *
     * @param OpenCpfCertRequest $request
     *
     * @return OpenCpfCertResponse
     */
    public function openCpfCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->openCpfCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 公积金证明开具接口
     * Summary: 公积金证明开具接口.
     *
     * @param OpenCpfCertRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return OpenCpfCertResponse
     */
    public function openCpfCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return OpenCpfCertResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.cert.open', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 证明列表查询接口
     * Summary: 证明列表查询接口.
     *
     * @param ListCpfCertRequest $request
     *
     * @return ListCpfCertResponse
     */
    public function listCpfCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCpfCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 证明列表查询接口
     * Summary: 证明列表查询接口.
     *
     * @param ListCpfCertRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ListCpfCertResponse
     */
    public function listCpfCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCpfCertResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.cert.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 扫码验真
     * Summary: 扫码验真
     *
     * @param CheckCpfCertRequest $request
     *
     * @return CheckCpfCertResponse
     */
    public function checkCpfCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->checkCpfCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 扫码验真
     * Summary: 扫码验真
     *
     * @param CheckCpfCertRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return CheckCpfCertResponse
     */
    public function checkCpfCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CheckCpfCertResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.cert.check', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 证明使用记录保存
     * Summary: 证明使用记录保存.
     *
     * @param SaveCpfCertuseRequest $request
     *
     * @return SaveCpfCertuseResponse
     */
    public function saveCpfCertuse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->saveCpfCertuseEx($request, $headers, $runtime);
    }

    /**
     * Description: 证明使用记录保存
     * Summary: 证明使用记录保存.
     *
     * @param SaveCpfCertuseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return SaveCpfCertuseResponse
     */
    public function saveCpfCertuseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SaveCpfCertuseResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.certuse.save', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构扫码用证
     * Summary: 扫码用证接口.
     *
     * @param GetCpfCertuseRequest $request
     *
     * @return GetCpfCertuseResponse
     */
    public function getCpfCertuse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCpfCertuseEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构扫码用证
     * Summary: 扫码用证接口.
     *
     * @param GetCpfCertuseRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return GetCpfCertuseResponse
     */
    public function getCpfCertuseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCpfCertuseResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.certuse.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 已开具证明查询
     * Summary: 已开具证明查询.
     *
     * @param GetCpfCertRequest $request
     *
     * @return GetCpfCertResponse
     */
    public function getCpfCert($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCpfCertEx($request, $headers, $runtime);
    }

    /**
     * Description: 已开具证明查询
     * Summary: 已开具证明查询.
     *
     * @param GetCpfCertRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetCpfCertResponse
     */
    public function getCpfCertEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCpfCertResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.cert.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 证明使用记录查询
     * Summary: 证明使用记录查询.
     *
     * @param ListCpfCertuseRequest $request
     *
     * @return ListCpfCertuseResponse
     */
    public function listCpfCertuse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCpfCertuseEx($request, $headers, $runtime);
    }

    /**
     * Description: 证明使用记录查询
     * Summary: 证明使用记录查询.
     *
     * @param ListCpfCertuseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListCpfCertuseResponse
     */
    public function listCpfCertuseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCpfCertuseResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.certuse.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构获取用户公积金数据（授权、用数分离时接口）
     * Summary: 数据使用.
     *
     * @param GetCpfDataRequest $request
     *
     * @return GetCpfDataResponse
     */
    public function getCpfData($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->getCpfDataEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构获取用户公积金数据（授权、用数分离时接口）
     * Summary: 数据使用.
     *
     * @param GetCpfDataRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return GetCpfDataResponse
     */
    public function getCpfDataEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return GetCpfDataResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.data.get', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 机构用数记录查询
     * Summary: 数据使用记录查询.
     *
     * @param ListCpfDatauseRequest $request
     *
     * @return ListCpfDatauseResponse
     */
    public function listCpfDatause($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->listCpfDatauseEx($request, $headers, $runtime);
    }

    /**
     * Description: 机构用数记录查询
     * Summary: 数据使用记录查询.
     *
     * @param ListCpfDatauseRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ListCpfDatauseResponse
     */
    public function listCpfDatauseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ListCpfDatauseResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.datause.list', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 查询用户在公积金中心的个人账户、贷款合同信息
     * Summary: 公积金中心用户信息查询.
     *
     * @param QueryCpfUserRequest $request
     *
     * @return QueryCpfUserResponse
     */
    public function queryCpfUser($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCpfUserEx($request, $headers, $runtime);
    }

    /**
     * Description: 查询用户在公积金中心的个人账户、贷款合同信息
     * Summary: 公积金中心用户信息查询.
     *
     * @param QueryCpfUserRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryCpfUserResponse
     */
    public function queryCpfUserEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCpfUserResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.cpf.user.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信数据流转授权
     * Summary: 授权.
     *
     * @param ExecAuthRequest $request
     *
     * @return ExecAuthResponse
     */
    public function execAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信数据流转授权
     * Summary: 授权.
     *
     * @param ExecAuthRequest $request
     * @param string[]        $headers
     * @param RuntimeOptions  $runtime
     *
     * @return ExecAuthResponse
     */
    public function execAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAuthResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.auth.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 取消授权
     * Summary: 取消授权.
     *
     * @param CancelAuthRequest $request
     *
     * @return CancelAuthResponse
     */
    public function cancelAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 取消授权
     * Summary: 取消授权.
     *
     * @param CancelAuthRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return CancelAuthResponse
     */
    public function cancelAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelAuthResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.auth.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 用权
     * Summary: 用权.
     *
     * @param QueryAuthRequest $request
     *
     * @return QueryAuthResponse
     */
    public function queryAuth($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuthEx($request, $headers, $runtime);
    }

    /**
     * Description: 用权
     * Summary: 用权.
     *
     * @param QueryAuthRequest $request
     * @param string[]         $headers
     * @param RuntimeOptions   $runtime
     *
     * @return QueryAuthResponse
     */
    public function queryAuthEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuthResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.auth.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权记录查询（个人授权记录查询）
     * Summary: 授权记录查询.
     *
     * @param QueryAuthOwnerRequest $request
     *
     * @return QueryAuthOwnerResponse
     */
    public function queryAuthOwner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuthOwnerEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权记录查询（个人授权记录查询）
     * Summary: 授权记录查询.
     *
     * @param QueryAuthOwnerRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return QueryAuthOwnerResponse
     */
    public function queryAuthOwnerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuthOwnerResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.auth.owner.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权使用记录查询（个人查询维度）
     * Summary: 授权使用记录查询.
     *
     * @param QueryAuthuseOwnerRequest $request
     *
     * @return QueryAuthuseOwnerResponse
     */
    public function queryAuthuseOwner($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAuthuseOwnerEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权使用记录查询（个人查询维度）
     * Summary: 授权使用记录查询.
     *
     * @param QueryAuthuseOwnerRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryAuthuseOwnerResponse
     */
    public function queryAuthuseOwnerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAuthuseOwnerResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.authuse.owner.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 授权数据使用
     * Summary: 授权数据使用.
     *
     * @param ExecAuthuseRequest $request
     *
     * @return ExecAuthuseResponse
     */
    public function execAuthuse($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execAuthuseEx($request, $headers, $runtime);
    }

    /**
     * Description: 授权数据使用
     * Summary: 授权数据使用.
     *
     * @param ExecAuthuseRequest $request
     * @param string[]           $headers
     * @param RuntimeOptions     $runtime
     *
     * @return ExecAuthuseResponse
     */
    public function execAuthuseEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecAuthuseResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.authuse.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 核身初始化接口
     * Summary: 核身初始化接口.
     *
     * @param InitVerifyRequest $request
     *
     * @return InitVerifyResponse
     */
    public function initVerify($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initVerifyEx($request, $headers, $runtime);
    }

    /**
     * Description: 核身初始化接口
     * Summary: 核身初始化接口.
     *
     * @param InitVerifyRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return InitVerifyResponse
     */
    public function initVerifyEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitVerifyResponse::fromMap($this->doRequest('1.0', 'antchain.tdm.verify.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
