<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\SECURITYTECH\Models\CreateBlueshieldSecuritypictureRequest;
use AntChain\SECURITYTECH\Models\CreateBlueshieldSecuritypictureResponse;
use AntChain\SECURITYTECH\Models\CreateBssecpicRequest;
use AntChain\SECURITYTECH\Models\CreateBssecpicResponse;
use AntChain\SECURITYTECH\Models\DeprecateIifaaDeviceRequest;
use AntChain\SECURITYTECH\Models\DeprecateIifaaDeviceResponse;
use AntChain\SECURITYTECH\Models\ExecEkytInsureRequest;
use AntChain\SECURITYTECH\Models\ExecEkytInsureResponse;
use AntChain\SECURITYTECH\Models\ExecIifaaInsureRequest;
use AntChain\SECURITYTECH\Models\ExecIifaaInsureResponse;
use AntChain\SECURITYTECH\Models\InitIifaaDeviceRequest;
use AntChain\SECURITYTECH\Models\InitIifaaDeviceResponse;
use AntChain\SECURITYTECH\Models\QueryCctPictureRequest;
use AntChain\SECURITYTECH\Models\QueryCctPictureResponse;
use AntChain\SECURITYTECH\Models\QueryDeviceriskDeviceriskRequest;
use AntChain\SECURITYTECH\Models\QueryDeviceriskDeviceriskResponse;
use AntChain\SECURITYTECH\Models\QueryDeviceriskFingerRequest;
use AntChain\SECURITYTECH\Models\QueryDeviceriskFingerResponse;
use AntChain\SECURITYTECH\Models\QueryDeviceriskRisklabelRequest;
use AntChain\SECURITYTECH\Models\QueryDeviceriskRisklabelResponse;
use AntChain\SECURITYTECH\Models\QueryEkytDriverRequest;
use AntChain\SECURITYTECH\Models\QueryEkytDriverResponse;
use AntChain\SECURITYTECH\Models\QueryFaceshieldNativeRequest;
use AntChain\SECURITYTECH\Models\QueryFaceshieldNativeResponse;
use AntChain\SECURITYTECH\Models\QueryFaceshieldWebRequest;
use AntChain\SECURITYTECH\Models\QueryFaceshieldWebResponse;
use AntChain\SECURITYTECH\Models\QueryRiskGeneralRequest;
use AntChain\SECURITYTECH\Models\QueryRiskGeneralResponse;
use AntChain\SECURITYTECH\Models\RecognizeCctAnalyzeRequest;
use AntChain\SECURITYTECH\Models\RecognizeCctAnalyzeResponse;
use AntChain\SECURITYTECH\Models\RecognizeIifaaDeviceRequest;
use AntChain\SECURITYTECH\Models\RecognizeIifaaDeviceResponse;
use AntChain\SECURITYTECH\Models\RegisterIifaaCorpRequest;
use AntChain\SECURITYTECH\Models\RegisterIifaaCorpResponse;
use AntChain\SECURITYTECH\Models\RunGeneralRequest;
use AntChain\SECURITYTECH\Models\RunGeneralResponse;
use AntChain\SECURITYTECH\Models\RunXhunterSpiRequest;
use AntChain\SECURITYTECH\Models\RunXhunterSpiResponse;
use AntChain\SECURITYTECH\Models\SubmitDeviceriskReportRequest;
use AntChain\SECURITYTECH\Models\SubmitDeviceriskReportResponse;
use AntChain\SECURITYTECH\Models\VerifyIifaaDeviceRequest;
use AntChain\SECURITYTECH\Models\VerifyIifaaDeviceResponse;
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
            // 风险数据
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
                    'sdk_version'      => '1.2.1',
                    '_prod_code'       => 'SECURITYTECH',
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
     * Description: 安全科技网关通用运行接口
     * Summary: 安全科技网关通用运行接口.
     *
     * @param RunGeneralRequest $request
     *
     * @return RunGeneralResponse
     */
    public function runGeneral($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->runGeneralEx($request, $headers, $runtime);
    }

    /**
     * Description: 安全科技网关通用运行接口
     * Summary: 安全科技网关通用运行接口.
     *
     * @param RunGeneralRequest $request
     * @param string[]          $headers
     * @param RuntimeOptions    $runtime
     *
     * @return RunGeneralResponse
     */
    public function runGeneralEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RunGeneralResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.general.run', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租赁住房保险产品，开放接口
     * 调用方：上海远点网络科技有限公司
     * Summary: 租赁住房保险产品，接口开放给租房平台.
     *
     * @param ExecEkytInsureRequest $request
     *
     * @return ExecEkytInsureResponse
     */
    public function execEkytInsure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execEkytInsureEx($request, $headers, $runtime);
    }

    /**
     * Description: 租赁住房保险产品，开放接口
     * 调用方：上海远点网络科技有限公司
     * Summary: 租赁住房保险产品，接口开放给租房平台.
     *
     * @param ExecEkytInsureRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return ExecEkytInsureResponse
     */
    public function execEkytInsureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecEkytInsureResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.ekyt.insure.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成.
     *
     * @param CreateBssecpicRequest $request
     *
     * @return CreateBssecpicResponse
     */
    public function createBssecpic($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBssecpicEx($request, $headers, $runtime);
    }

    /**
     * Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成.
     *
     * @param CreateBssecpicRequest $request
     * @param string[]              $headers
     * @param RuntimeOptions        $runtime
     *
     * @return CreateBssecpicResponse
     */
    public function createBssecpicEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBssecpicResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.bssecpic.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成.
     *
     * @param CreateBlueshieldSecuritypictureRequest $request
     *
     * @return CreateBlueshieldSecuritypictureResponse
     */
    public function createBlueshieldSecuritypicture($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createBlueshieldSecuritypictureEx($request, $headers, $runtime);
    }

    /**
     * Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成.
     *
     * @param CreateBlueshieldSecuritypictureRequest $request
     * @param string[]                               $headers
     * @param RuntimeOptions                         $runtime
     *
     * @return CreateBlueshieldSecuritypictureResponse
     */
    public function createBlueshieldSecuritypictureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateBlueshieldSecuritypictureResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.blueshield.securitypicture.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 终端安全人脸盾Native查询
     * Summary: 人脸盾Native查询.
     *
     * @param QueryFaceshieldNativeRequest $request
     *
     * @return QueryFaceshieldNativeResponse
     */
    public function queryFaceshieldNative($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceshieldNativeEx($request, $headers, $runtime);
    }

    /**
     * Description: 终端安全人脸盾Native查询
     * Summary: 人脸盾Native查询.
     *
     * @param QueryFaceshieldNativeRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryFaceshieldNativeResponse
     */
    public function queryFaceshieldNativeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceshieldNativeResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.faceshield.native.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 终端安全人脸盾Web查询
     * Summary: 人脸盾Web查询.
     *
     * @param QueryFaceshieldWebRequest $request
     *
     * @return QueryFaceshieldWebResponse
     */
    public function queryFaceshieldWeb($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryFaceshieldWebEx($request, $headers, $runtime);
    }

    /**
     * Description: 终端安全人脸盾Web查询
     * Summary: 人脸盾Web查询.
     *
     * @param QueryFaceshieldWebRequest $request
     * @param string[]                  $headers
     * @param RuntimeOptions            $runtime
     *
     * @return QueryFaceshieldWebResponse
     */
    public function queryFaceshieldWebEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryFaceshieldWebResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.faceshield.web.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备激活
     * Summary: 可信设备认证设备初始化，设备激活.
     *
     * @param InitIifaaDeviceRequest $request
     *
     * @return InitIifaaDeviceResponse
     */
    public function initIifaaDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->initIifaaDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备激活
     * Summary: 可信设备认证设备初始化，设备激活.
     *
     * @param InitIifaaDeviceRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return InitIifaaDeviceResponse
     */
    public function initIifaaDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return InitIifaaDeviceResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.iifaa.device.init', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信设备认证风险咨询，获取预认证数据
     * Summary: 可信设备认证风险咨询，获取预认证数据.
     *
     * @param RecognizeIifaaDeviceRequest $request
     *
     * @return RecognizeIifaaDeviceResponse
     */
    public function recognizeIifaaDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeIifaaDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信设备认证风险咨询，获取预认证数据
     * Summary: 可信设备认证风险咨询，获取预认证数据.
     *
     * @param RecognizeIifaaDeviceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return RecognizeIifaaDeviceResponse
     */
    public function recognizeIifaaDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RecognizeIifaaDeviceResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.iifaa.device.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信设备认证，设备验证
     * Summary: 可信设备认证，设备验证
     *
     * @param VerifyIifaaDeviceRequest $request
     *
     * @return VerifyIifaaDeviceResponse
     */
    public function verifyIifaaDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->verifyIifaaDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信设备认证，设备验证
     * Summary: 可信设备认证，设备验证
     *
     * @param VerifyIifaaDeviceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return VerifyIifaaDeviceResponse
     */
    public function verifyIifaaDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return VerifyIifaaDeviceResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.iifaa.device.verify', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信设备认证，产商注册
     * Summary: 可信设备认证，产商注册.
     *
     * @param RegisterIifaaCorpRequest $request
     *
     * @return RegisterIifaaCorpResponse
     */
    public function registerIifaaCorp($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->registerIifaaCorpEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信设备认证，产商注册
     * Summary: 可信设备认证，产商注册.
     *
     * @param RegisterIifaaCorpRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return RegisterIifaaCorpResponse
     */
    public function registerIifaaCorpEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RegisterIifaaCorpResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.iifaa.corp.register', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 可信设备认证，擦除设备信息
     * Summary: 可信设备认证，擦除设备信息.
     *
     * @param DeprecateIifaaDeviceRequest $request
     *
     * @return DeprecateIifaaDeviceResponse
     */
    public function deprecateIifaaDevice($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->deprecateIifaaDeviceEx($request, $headers, $runtime);
    }

    /**
     * Description: 可信设备认证，擦除设备信息
     * Summary: 可信设备认证，擦除设备信息.
     *
     * @param DeprecateIifaaDeviceRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return DeprecateIifaaDeviceResponse
     */
    public function deprecateIifaaDeviceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return DeprecateIifaaDeviceResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.iifaa.device.deprecate', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 巡检商业化
     * Summary: 巡检商业化.
     *
     * @param RunXhunterSpiRequest $request
     *
     * @return RunXhunterSpiResponse
     */
    public function runXhunterSpi($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->runXhunterSpiEx($request, $headers, $runtime);
    }

    /**
     * Description: 巡检商业化
     * Summary: 巡检商业化.
     *
     * @param RunXhunterSpiRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return RunXhunterSpiResponse
     */
    public function runXhunterSpiEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RunXhunterSpiResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.xhunter.spi.run', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 租凭住房保险产品，接口开放给租房平台
     * Summary: 租凭住房保险产品，接口开放给租房平台.
     *
     * @param ExecIifaaInsureRequest $request
     *
     * @return ExecIifaaInsureResponse
     */
    public function execIifaaInsure($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->execIifaaInsureEx($request, $headers, $runtime);
    }

    /**
     * Description: 租凭住房保险产品，接口开放给租房平台
     * Summary: 租凭住房保险产品，接口开放给租房平台.
     *
     * @param ExecIifaaInsureRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return ExecIifaaInsureResponse
     */
    public function execIifaaInsureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ExecIifaaInsureResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.iifaa.insure.exec', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内容安全图片同步检测
     * Summary: 内容安全图片同步检测.
     *
     * @param QueryCctPictureRequest $request
     *
     * @return QueryCctPictureResponse
     */
    public function queryCctPicture($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryCctPictureEx($request, $headers, $runtime);
    }

    /**
     * Description: 内容安全图片同步检测
     * Summary: 内容安全图片同步检测.
     *
     * @param QueryCctPictureRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryCctPictureResponse
     */
    public function queryCctPictureEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryCctPictureResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.cct.picture.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 内容安全主站同步检测
     * Summary: 内容安全主站同步检测.
     *
     * @param RecognizeCctAnalyzeRequest $request
     *
     * @return RecognizeCctAnalyzeResponse
     */
    public function recognizeCctAnalyze($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->recognizeCctAnalyzeEx($request, $headers, $runtime);
    }

    /**
     * Description: 内容安全主站同步检测
     * Summary: 内容安全主站同步检测.
     *
     * @param RecognizeCctAnalyzeRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return RecognizeCctAnalyzeResponse
     */
    public function recognizeCctAnalyzeEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return RecognizeCctAnalyzeResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.cct.analyze.recognize', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: RAAS数据服务统一接口
     * Summary: RAAS数据服务统一接口.
     *
     * @param QueryRiskGeneralRequest $request
     *
     * @return QueryRiskGeneralResponse
     */
    public function queryRiskGeneral($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryRiskGeneralEx($request, $headers, $runtime);
    }

    /**
     * Description: RAAS数据服务统一接口
     * Summary: RAAS数据服务统一接口.
     *
     * @param QueryRiskGeneralRequest $request
     * @param string[]                $headers
     * @param RuntimeOptions          $runtime
     *
     * @return QueryRiskGeneralResponse
     */
    public function queryRiskGeneralEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryRiskGeneralResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.risk.general.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备指纹查询
     * Summary: 设备指纹查询.
     *
     * @param QueryDeviceriskFingerRequest $request
     *
     * @return QueryDeviceriskFingerResponse
     */
    public function queryDeviceriskFinger($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceriskFingerEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备指纹查询
     * Summary: 设备指纹查询.
     *
     * @param QueryDeviceriskFingerRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QueryDeviceriskFingerResponse
     */
    public function queryDeviceriskFingerEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceriskFingerResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.devicerisk.finger.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 风险标签查询
     * Summary: 风险标签查询.
     *
     * @param QueryDeviceriskRisklabelRequest $request
     *
     * @return QueryDeviceriskRisklabelResponse
     */
    public function queryDeviceriskRisklabel($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceriskRisklabelEx($request, $headers, $runtime);
    }

    /**
     * Description: 风险标签查询
     * Summary: 风险标签查询.
     *
     * @param QueryDeviceriskRisklabelRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return QueryDeviceriskRisklabelResponse
     */
    public function queryDeviceriskRisklabelEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceriskRisklabelResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.devicerisk.risklabel.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备风险查询
     * Summary: 设备风险查询.
     *
     * @param QueryDeviceriskDeviceriskRequest $request
     *
     * @return QueryDeviceriskDeviceriskResponse
     */
    public function queryDeviceriskDevicerisk($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryDeviceriskDeviceriskEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备风险查询
     * Summary: 设备风险查询.
     *
     * @param QueryDeviceriskDeviceriskRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return QueryDeviceriskDeviceriskResponse
     */
    public function queryDeviceriskDeviceriskEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryDeviceriskDeviceriskResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.devicerisk.devicerisk.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 设备信息上报
     * Summary: 设备信息上报.
     *
     * @param SubmitDeviceriskReportRequest $request
     *
     * @return SubmitDeviceriskReportResponse
     */
    public function submitDeviceriskReport($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->submitDeviceriskReportEx($request, $headers, $runtime);
    }

    /**
     * Description: 设备信息上报
     * Summary: 设备信息上报.
     *
     * @param SubmitDeviceriskReportRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return SubmitDeviceriskReportResponse
     */
    public function submitDeviceriskReportEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return SubmitDeviceriskReportResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.devicerisk.report.submit', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机.
     *
     * @param QueryEkytDriverRequest $request
     *
     * @return QueryEkytDriverResponse
     */
    public function queryEkytDriver($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEkytDriverEx($request, $headers, $runtime);
    }

    /**
     * Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机.
     *
     * @param QueryEkytDriverRequest $request
     * @param string[]               $headers
     * @param RuntimeOptions         $runtime
     *
     * @return QueryEkytDriverResponse
     */
    public function queryEkytDriverEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEkytDriverResponse::fromMap($this->doRequest('1.0', 'antsecuritytech.gateway.ekyt.driver.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
