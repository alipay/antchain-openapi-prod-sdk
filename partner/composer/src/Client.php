<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER;

use AlibabaCloud\Tea\Exception\TeaError;
use AlibabaCloud\Tea\Exception\TeaUnableRetryError;
use AlibabaCloud\Tea\Request;
use AlibabaCloud\Tea\RpcUtils\RpcUtils;
use AlibabaCloud\Tea\Tea;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;
use AntChain\PARTNER\Models\ApplyPartnerSettleinRequest;
use AntChain\PARTNER\Models\ApplyPartnerSettleinResponse;
use AntChain\PARTNER\Models\CancelExpenditureProjectRequest;
use AntChain\PARTNER\Models\CancelExpenditureProjectResponse;
use AntChain\PARTNER\Models\CancelPartnerSettleinRequest;
use AntChain\PARTNER\Models\CancelPartnerSettleinResponse;
use AntChain\PARTNER\Models\ConfirmExpenditureProjectRequest;
use AntChain\PARTNER\Models\ConfirmExpenditureProjectResponse;
use AntChain\PARTNER\Models\CreateExpenditureProjectRequest;
use AntChain\PARTNER\Models\CreateExpenditureProjectResponse;
use AntChain\PARTNER\Models\QueryAreaCityRequest;
use AntChain\PARTNER\Models\QueryAreaCityResponse;
use AntChain\PARTNER\Models\QueryAreaProvinceRequest;
use AntChain\PARTNER\Models\QueryAreaProvinceResponse;
use AntChain\PARTNER\Models\QueryEcoCommodityRequest;
use AntChain\PARTNER\Models\QueryEcoCommodityResponse;
use AntChain\PARTNER\Models\QueryExpenditureProjectRequest;
use AntChain\PARTNER\Models\QueryExpenditureProjectResponse;
use AntChain\PARTNER\Models\QueryPartnerSettleinRequest;
use AntChain\PARTNER\Models\QueryPartnerSettleinResponse;
use AntChain\PARTNER\Models\QueryPbcInstitutionRequest;
use AntChain\PARTNER\Models\QueryPbcInstitutionResponse;
use AntChain\PARTNER\Models\QueryPbcNameRequest;
use AntChain\PARTNER\Models\QueryPbcNameResponse;
use AntChain\PARTNER\Models\QuerySettleinContractRequest;
use AntChain\PARTNER\Models\QuerySettleinContractResponse;
use AntChain\PARTNER\Models\QueryStandardAgreementRequest;
use AntChain\PARTNER\Models\QueryStandardAgreementResponse;
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
            // 支出配置单商品价格条件属性
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
                    'sdk_version'      => '1.0.19',
                    '_prod_code'       => 'PARTNER',
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
     * Description: 获取合作伙伴销售商品对应的政策ID
     * Summary: 获取合作伙伴销售商品对应的政策ID.
     *
     * @param QueryEcoCommodityRequest $request
     *
     * @return QueryEcoCommodityResponse
     */
    public function queryEcoCommodity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryEcoCommodityEx($request, $headers, $runtime);
    }

    /**
     * Description: 获取合作伙伴销售商品对应的政策ID
     * Summary: 获取合作伙伴销售商品对应的政策ID.
     *
     * @param QueryEcoCommodityRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryEcoCommodityResponse
     */
    public function queryEcoCommodityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryEcoCommodityResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.eco.commodity.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻申请
     * Summary: 合作方（伙伴、商家等）入驻申请.
     *
     * @param ApplyPartnerSettleinRequest $request
     *
     * @return ApplyPartnerSettleinResponse
     */
    public function applyPartnerSettlein($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->applyPartnerSettleinEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻申请
     * Summary: 合作方（伙伴、商家等）入驻申请.
     *
     * @param ApplyPartnerSettleinRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return ApplyPartnerSettleinResponse
     */
    public function applyPartnerSettleinEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ApplyPartnerSettleinResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.partner.settlein.apply', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻撤销
     * Summary: 合作方（伙伴、商家等）入驻撤销
     *
     * @param CancelPartnerSettleinRequest $request
     *
     * @return CancelPartnerSettleinResponse
     */
    public function cancelPartnerSettlein($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelPartnerSettleinEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻撤销
     * Summary: 合作方（伙伴、商家等）入驻撤销
     *
     * @param CancelPartnerSettleinRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return CancelPartnerSettleinResponse
     */
    public function cancelPartnerSettleinEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelPartnerSettleinResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.partner.settlein.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻申请结果查询
     * Summary: 合作方（伙伴、商家等）入驻申请结果查询.
     *
     * @param QueryPartnerSettleinRequest $request
     *
     * @return QueryPartnerSettleinResponse
     */
    public function queryPartnerSettlein($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPartnerSettleinEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻申请结果查询
     * Summary: 合作方（伙伴、商家等）入驻申请结果查询.
     *
     * @param QueryPartnerSettleinRequest $request
     * @param string[]                    $headers
     * @param RuntimeOptions              $runtime
     *
     * @return QueryPartnerSettleinResponse
     */
    public function queryPartnerSettleinEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPartnerSettleinResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.partner.settlein.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻标准合同查询
     * Summary: 合作方（伙伴、商家等）入驻标准合同查询.
     *
     * @param QuerySettleinContractRequest $request
     *
     * @return QuerySettleinContractResponse
     */
    public function querySettleinContract($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->querySettleinContractEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻标准合同查询
     * Summary: 合作方（伙伴、商家等）入驻标准合同查询.
     *
     * @param QuerySettleinContractRequest $request
     * @param string[]                     $headers
     * @param RuntimeOptions               $runtime
     *
     * @return QuerySettleinContractResponse
     */
    public function querySettleinContractEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QuerySettleinContractResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.settlein.contract.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目创建接口
     * Summary: 合作方（伙伴、商家等）支出项目创建接口.
     *
     * @param CreateExpenditureProjectRequest $request
     *
     * @return CreateExpenditureProjectResponse
     */
    public function createExpenditureProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->createExpenditureProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目创建接口
     * Summary: 合作方（伙伴、商家等）支出项目创建接口.
     *
     * @param CreateExpenditureProjectRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CreateExpenditureProjectResponse
     */
    public function createExpenditureProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CreateExpenditureProjectResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.expenditure.project.create', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目查询接口
     * Summary: 合作方（伙伴、商家等）支出项目查询接口.
     *
     * @param QueryExpenditureProjectRequest $request
     *
     * @return QueryExpenditureProjectResponse
     */
    public function queryExpenditureProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryExpenditureProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目查询接口
     * Summary: 合作方（伙伴、商家等）支出项目查询接口.
     *
     * @param QueryExpenditureProjectRequest $request
     * @param string[]                       $headers
     * @param RuntimeOptions                 $runtime
     *
     * @return QueryExpenditureProjectResponse
     */
    public function queryExpenditureProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryExpenditureProjectResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.expenditure.project.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目撤销接口
     * Summary: 合作方（伙伴、商家等）支出项目撤销接口.
     *
     * @param CancelExpenditureProjectRequest $request
     *
     * @return CancelExpenditureProjectResponse
     */
    public function cancelExpenditureProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->cancelExpenditureProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目撤销接口
     * Summary: 合作方（伙伴、商家等）支出项目撤销接口.
     *
     * @param CancelExpenditureProjectRequest $request
     * @param string[]                        $headers
     * @param RuntimeOptions                  $runtime
     *
     * @return CancelExpenditureProjectResponse
     */
    public function cancelExpenditureProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return CancelExpenditureProjectResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.expenditure.project.cancel', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 支出项目合同确认接口
     * Summary: 支出项目合同确认接口.
     *
     * @param ConfirmExpenditureProjectRequest $request
     *
     * @return ConfirmExpenditureProjectResponse
     */
    public function confirmExpenditureProject($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->confirmExpenditureProjectEx($request, $headers, $runtime);
    }

    /**
     * Description: 支出项目合同确认接口
     * Summary: 支出项目合同确认接口.
     *
     * @param ConfirmExpenditureProjectRequest $request
     * @param string[]                         $headers
     * @param RuntimeOptions                   $runtime
     *
     * @return ConfirmExpenditureProjectResponse
     */
    public function confirmExpenditureProjectEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return ConfirmExpenditureProjectResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.expenditure.project.confirm', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）标准额合同查询接口
     * Summary: 合作方（伙伴、商家等）标准额合同查询接口.
     *
     * @param QueryStandardAgreementRequest $request
     *
     * @return QueryStandardAgreementResponse
     */
    public function queryStandardAgreement($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryStandardAgreementEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）标准额合同查询接口
     * Summary: 合作方（伙伴、商家等）标准额合同查询接口.
     *
     * @param QueryStandardAgreementRequest $request
     * @param string[]                      $headers
     * @param RuntimeOptions                $runtime
     *
     * @return QueryStandardAgreementResponse
     */
    public function queryStandardAgreementEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryStandardAgreementResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.standard.agreement.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 生态伙伴区域省份查询接口
     * Summary: 生态伙伴区域省份查询接口.
     *
     * @param QueryAreaProvinceRequest $request
     *
     * @return QueryAreaProvinceResponse
     */
    public function queryAreaProvince($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAreaProvinceEx($request, $headers, $runtime);
    }

    /**
     * Description: 生态伙伴区域省份查询接口
     * Summary: 生态伙伴区域省份查询接口.
     *
     * @param QueryAreaProvinceRequest $request
     * @param string[]                 $headers
     * @param RuntimeOptions           $runtime
     *
     * @return QueryAreaProvinceResponse
     */
    public function queryAreaProvinceEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAreaProvinceResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.area.province.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
     * Summary: 合作方（伙伴、商家等）区域信息查询.
     *
     * @param QueryAreaCityRequest $request
     *
     * @return QueryAreaCityResponse
     */
    public function queryAreaCity($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryAreaCityEx($request, $headers, $runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
     * Summary: 合作方（伙伴、商家等）区域信息查询.
     *
     * @param QueryAreaCityRequest $request
     * @param string[]             $headers
     * @param RuntimeOptions       $runtime
     *
     * @return QueryAreaCityResponse
     */
    public function queryAreaCityEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryAreaCityResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.area.city.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 联行号关联银行机构信息查询
     * Summary: 联行号关联银行机构信息查询.
     *
     * @param QueryPbcInstitutionRequest $request
     *
     * @return QueryPbcInstitutionResponse
     */
    public function queryPbcInstitution($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPbcInstitutionEx($request, $headers, $runtime);
    }

    /**
     * Description: 联行号关联银行机构信息查询
     * Summary: 联行号关联银行机构信息查询.
     *
     * @param QueryPbcInstitutionRequest $request
     * @param string[]                   $headers
     * @param RuntimeOptions             $runtime
     *
     * @return QueryPbcInstitutionResponse
     */
    public function queryPbcInstitutionEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPbcInstitutionResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.pbc.institution.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }

    /**
     * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
     * Summary: 合作方（伙伴、商家等）支行信息查询.
     *
     * @param QueryPbcNameRequest $request
     *
     * @return QueryPbcNameResponse
     */
    public function queryPbcName($request)
    {
        $runtime = new RuntimeOptions([]);
        $headers = [];

        return $this->queryPbcNameEx($request, $headers, $runtime);
    }

    /**
     * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
     * Summary: 合作方（伙伴、商家等）支行信息查询.
     *
     * @param QueryPbcNameRequest $request
     * @param string[]            $headers
     * @param RuntimeOptions      $runtime
     *
     * @return QueryPbcNameResponse
     */
    public function queryPbcNameEx($request, $headers, $runtime)
    {
        Utils::validateModel($request);

        return QueryPbcNameResponse::fromMap($this->doRequest('1.0', 'antcloud.partner.pbc.name.query', 'HTTPS', 'POST', '/gateway.do', Tea::merge($request), $headers, $runtime));
    }
}
