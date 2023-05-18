// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.partner.models.*;
import com.antgroup.antchain.openapi.antchain.util.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;

public class Client {

    public String _endpoint;
    public String _regionId;
    public String _accessKeyId;
    public String _accessKeySecret;
    public String _protocol;
    public String _userAgent;
    public Number _readTimeout;
    public Number _connectTimeout;
    public String _httpProxy;
    public String _httpsProxy;
    public String _socks5Proxy;
    public String _socks5NetWork;
    public String _noProxy;
    public Number _maxIdleConns;
    public String _securityToken;
    public Number _maxIdleTimeMillis;
    public Number _keepAliveDurationMillis;
    public Number _maxRequests;
    public Number _maxRequestsPerHost;
    /**
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(config))) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "ParameterMissing"),
                new TeaPair("message", "'config' can not be unset")
            ));
        }

        this._accessKeyId = config.accessKeyId;
        this._accessKeySecret = config.accessKeySecret;
        this._securityToken = config.securityToken;
        this._endpoint = config.endpoint;
        this._protocol = config.protocol;
        this._userAgent = config.userAgent;
        this._readTimeout = com.aliyun.teautil.Common.defaultNumber(config.readTimeout, 20000);
        this._connectTimeout = com.aliyun.teautil.Common.defaultNumber(config.connectTimeout, 20000);
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = com.aliyun.teautil.Common.defaultNumber(config.maxIdleConns, 60000);
        this._maxIdleTimeMillis = com.aliyun.teautil.Common.defaultNumber(config.maxIdleTimeMillis, 5);
        this._keepAliveDurationMillis = com.aliyun.teautil.Common.defaultNumber(config.keepAliveDurationMillis, 5000);
        this._maxRequests = com.aliyun.teautil.Common.defaultNumber(config.maxRequests, 100);
        this._maxRequestsPerHost = com.aliyun.teautil.Common.defaultNumber(config.maxRequestsPerHost, 100);
    }

    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("maxIdleTimeMillis", _maxIdleTimeMillis),
            new TeaPair("keepAliveDuration", _keepAliveDurationMillis),
            new TeaPair("maxRequests", _maxRequests),
            new TeaPair("maxRequestsPerHost", _maxRequestsPerHost),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", runtime.ignoreSSL)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = com.aliyun.teautil.Common.defaultString(_protocol, protocol);
                request_.method = method;
                request_.pathname = pathname;
                request_.query = TeaConverter.buildMap(
                    new TeaPair("method", action),
                    new TeaPair("version", version),
                    new TeaPair("sign_type", "HmacSHA1"),
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "1.0.22"),
                    new TeaPair("_prod_code", "PARTNER"),
                    new TeaPair("_prod_channel", "undefined")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "openapi.antchain.antgroup.com")),
                        new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(_userAgent))
                    ),
                    headers
                );
                java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.anyifyMapValue(com.aliyun.common.Common.query(request));
                request_.body = Tea.toReadable(com.aliyun.teautil.Common.toFormString(tmp));
                request_.headers.put("content-type", "application/x-www-form-urlencoded");
                java.util.Map<String, String> signedParam = TeaConverter.merge(String.class,
                    request_.query,
                    com.aliyun.common.Common.query(request)
                );
                request_.query.put("sign", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                String raw = com.aliyun.teautil.Common.readAsString(response_.body);
                Object obj = com.aliyun.teautil.Common.parseJSON(raw);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.antgroup.antchain.openapi.antchain.util.AntchainUtils.hasError(raw, _accessKeySecret)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", resp.get("result_msg")),
                        new TeaPair("data", resp),
                        new TeaPair("code", resp.get("result_code"))
                    ));
                }

                return resp;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }

        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    /**
     * Description: 获取合作伙伴销售商品对应的政策ID
     * Summary: 获取合作伙伴销售商品对应的政策ID
     */
    public QueryEcoCommodityResponse queryEcoCommodity(QueryEcoCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEcoCommodityEx(request, headers, runtime);
    }

    /**
     * Description: 获取合作伙伴销售商品对应的政策ID
     * Summary: 获取合作伙伴销售商品对应的政策ID
     */
    public QueryEcoCommodityResponse queryEcoCommodityEx(QueryEcoCommodityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.eco.commodity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEcoCommodityResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻申请
     * Summary: 合作方（伙伴、商家等）入驻申请
     */
    public ApplyPartnerSettleinResponse applyPartnerSettlein(ApplyPartnerSettleinRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyPartnerSettleinEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻申请
     * Summary: 合作方（伙伴、商家等）入驻申请
     */
    public ApplyPartnerSettleinResponse applyPartnerSettleinEx(ApplyPartnerSettleinRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.partner.settlein.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyPartnerSettleinResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻撤销
     * Summary: 合作方（伙伴、商家等）入驻撤销
     */
    public CancelPartnerSettleinResponse cancelPartnerSettlein(CancelPartnerSettleinRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelPartnerSettleinEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻撤销
     * Summary: 合作方（伙伴、商家等）入驻撤销
     */
    public CancelPartnerSettleinResponse cancelPartnerSettleinEx(CancelPartnerSettleinRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.partner.settlein.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelPartnerSettleinResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻申请结果查询
     * Summary: 合作方（伙伴、商家等）入驻申请结果查询
     */
    public QueryPartnerSettleinResponse queryPartnerSettlein(QueryPartnerSettleinRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPartnerSettleinEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻申请结果查询
     * Summary: 合作方（伙伴、商家等）入驻申请结果查询
     */
    public QueryPartnerSettleinResponse queryPartnerSettleinEx(QueryPartnerSettleinRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.partner.settlein.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPartnerSettleinResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻标准合同查询
     * Summary: 合作方（伙伴、商家等）入驻标准合同查询
     */
    public QuerySettleinContractResponse querySettleinContract(QuerySettleinContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySettleinContractEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻标准合同查询
     * Summary: 合作方（伙伴、商家等）入驻标准合同查询
     */
    public QuerySettleinContractResponse querySettleinContractEx(QuerySettleinContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.settlein.contract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySettleinContractResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目创建接口
     * Summary: 合作方（伙伴、商家等）支出项目创建接口
     */
    public CreateExpenditureProjectResponse createExpenditureProject(CreateExpenditureProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExpenditureProjectEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目创建接口
     * Summary: 合作方（伙伴、商家等）支出项目创建接口
     */
    public CreateExpenditureProjectResponse createExpenditureProjectEx(CreateExpenditureProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.expenditure.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateExpenditureProjectResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目查询接口
     * Summary: 合作方（伙伴、商家等）支出项目查询接口
     */
    public QueryExpenditureProjectResponse queryExpenditureProject(QueryExpenditureProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryExpenditureProjectEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目查询接口
     * Summary: 合作方（伙伴、商家等）支出项目查询接口
     */
    public QueryExpenditureProjectResponse queryExpenditureProjectEx(QueryExpenditureProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.expenditure.project.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryExpenditureProjectResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目撤销接口
     * Summary: 合作方（伙伴、商家等）支出项目撤销接口
     */
    public CancelExpenditureProjectResponse cancelExpenditureProject(CancelExpenditureProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelExpenditureProjectEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）支出项目撤销接口
     * Summary: 合作方（伙伴、商家等）支出项目撤销接口
     */
    public CancelExpenditureProjectResponse cancelExpenditureProjectEx(CancelExpenditureProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.expenditure.project.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelExpenditureProjectResponse());
    }

    /**
     * Description: 支出项目合同确认接口
     * Summary: 支出项目合同确认接口
     */
    public ConfirmExpenditureProjectResponse confirmExpenditureProject(ConfirmExpenditureProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmExpenditureProjectEx(request, headers, runtime);
    }

    /**
     * Description: 支出项目合同确认接口
     * Summary: 支出项目合同确认接口
     */
    public ConfirmExpenditureProjectResponse confirmExpenditureProjectEx(ConfirmExpenditureProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.expenditure.project.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmExpenditureProjectResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）标准额合同查询接口
     * Summary: 合作方（伙伴、商家等）标准额合同查询接口
     */
    public QueryStandardAgreementResponse queryStandardAgreement(QueryStandardAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStandardAgreementEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）标准额合同查询接口
     * Summary: 合作方（伙伴、商家等）标准额合同查询接口
     */
    public QueryStandardAgreementResponse queryStandardAgreementEx(QueryStandardAgreementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.standard.agreement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStandardAgreementResponse());
    }

    /**
     * Description: 生态伙伴区域省份查询接口
     * Summary: 生态伙伴区域省份查询接口
     */
    public QueryAreaProvinceResponse queryAreaProvince(QueryAreaProvinceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAreaProvinceEx(request, headers, runtime);
    }

    /**
     * Description: 生态伙伴区域省份查询接口
     * Summary: 生态伙伴区域省份查询接口
     */
    public QueryAreaProvinceResponse queryAreaProvinceEx(QueryAreaProvinceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.area.province.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAreaProvinceResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
     * Summary: 合作方（伙伴、商家等）区域信息查询
     */
    public QueryAreaCityResponse queryAreaCity(QueryAreaCityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAreaCityEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
     * Summary: 合作方（伙伴、商家等）区域信息查询
     */
    public QueryAreaCityResponse queryAreaCityEx(QueryAreaCityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.area.city.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAreaCityResponse());
    }

    /**
     * Description: 联行号关联银行机构信息查询
     * Summary: 联行号关联银行机构信息查询
     */
    public QueryPbcInstitutionResponse queryPbcInstitution(QueryPbcInstitutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPbcInstitutionEx(request, headers, runtime);
    }

    /**
     * Description: 联行号关联银行机构信息查询
     * Summary: 联行号关联银行机构信息查询
     */
    public QueryPbcInstitutionResponse queryPbcInstitutionEx(QueryPbcInstitutionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.pbc.institution.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPbcInstitutionResponse());
    }

    /**
     * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
     * Summary: 合作方（伙伴、商家等）支行信息查询
     */
    public QueryPbcNameResponse queryPbcName(QueryPbcNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPbcNameEx(request, headers, runtime);
    }

    /**
     * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
     * Summary: 合作方（伙伴、商家等）支行信息查询
     */
    public QueryPbcNameResponse queryPbcNameEx(QueryPbcNameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.partner.pbc.name.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPbcNameResponse());
    }
}
