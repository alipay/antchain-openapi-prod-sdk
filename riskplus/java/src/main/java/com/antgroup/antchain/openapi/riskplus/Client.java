// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.riskplus.models.*;
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
            new TeaPair("keepAliveDurationMillis", _keepAliveDurationMillis),
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
                    new TeaPair("sdk_version", "1.13.5")
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
     * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
     * Summary: 策略咨询服务输出
     */
    public QuerySecurityPolicyResponse querySecurityPolicy(QuerySecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySecurityPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
     * Summary: 策略咨询服务输出
     */
    public QuerySecurityPolicyResponse querySecurityPolicyEx(QuerySecurityPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySecurityPolicyResponse());
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据
     */
    public SendSecurityDataResponse sendSecurityData(SendSecurityDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendSecurityDataEx(request, headers, runtime);
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据
     */
    public SendSecurityDataResponse sendSecurityDataEx(SendSecurityDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.data.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendSecurityDataResponse());
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出
     */
    public ConfirmSecurityPolicyResponse confirmSecurityPolicy(ConfirmSecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出
     */
    public ConfirmSecurityPolicyResponse confirmSecurityPolicyEx(ConfirmSecurityPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.policy.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmSecurityPolicyResponse());
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出
     */
    public CheckSecurityRdsResponse checkSecurityRds(CheckSecurityRdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSecurityRdsEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出
     */
    public CheckSecurityRdsResponse checkSecurityRdsEx(CheckSecurityRdsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.rds.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSecurityRdsResponse());
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出
     */
    public QuerySecurityDataResponse querySecurityData(QuerySecurityDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySecurityDataEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出
     */
    public QuerySecurityDataResponse querySecurityDataEx(QuerySecurityDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySecurityDataResponse());
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验
     */
    public CheckSecurityDataResponse checkSecurityData(CheckSecurityDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSecurityDataEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验
     */
    public CheckSecurityDataResponse checkSecurityDataEx(CheckSecurityDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.data.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSecurityDataResponse());
    }

    /**
     * Description: 反欺诈风险数据服务请求执行
     * Summary: 反欺诈风险数据服务请求执行
     */
    public ExecSecurityRiskdataserviceResponse execSecurityRiskdataservice(ExecSecurityRiskdataserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execSecurityRiskdataserviceEx(request, headers, runtime);
    }

    /**
     * Description: 反欺诈风险数据服务请求执行
     * Summary: 反欺诈风险数据服务请求执行
     */
    public ExecSecurityRiskdataserviceResponse execSecurityRiskdataserviceEx(ExecSecurityRiskdataserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.riskdataservice.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecSecurityRiskdataserviceResponse());
    }

    /**
     * Description: 天枢信贷业务系统线下测试环境测试接口
     * Summary: 天枢信贷业务系统线下测试接口
     */
    public QueryDubheTestResponse queryDubheTest(QueryDubheTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheTestEx(request, headers, runtime);
    }

    /**
     * Description: 天枢信贷业务系统线下测试环境测试接口
     * Summary: 天枢信贷业务系统线下测试接口
     */
    public QueryDubheTestResponse queryDubheTestEx(QueryDubheTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheTestResponse());
    }

    /**
     * Description: 通过客户三要素信息查询资金方代码(资金路由)
     * Summary: 天枢系统资金方代码(资金路由)查询
     */
    public QueryDubheRouterFundrouterResponse queryDubheRouterFundrouter(QueryDubheRouterFundrouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheRouterFundrouterEx(request, headers, runtime);
    }

    /**
     * Description: 通过客户三要素信息查询资金方代码(资金路由)
     * Summary: 天枢系统资金方代码(资金路由)查询
     */
    public QueryDubheRouterFundrouterResponse queryDubheRouterFundrouterEx(QueryDubheRouterFundrouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.router.fundrouter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheRouterFundrouterResponse());
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口
     */
    public ApplyDubheCreditResponse applyDubheCredit(ApplyDubheCreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubheCreditEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口
     */
    public ApplyDubheCreditResponse applyDubheCreditEx(ApplyDubheCreditRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.credit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubheCreditResponse());
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口
     */
    public QueryDubheCreditStatusResponse queryDubheCreditStatus(QueryDubheCreditStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheCreditStatusEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口
     */
    public QueryDubheCreditStatusResponse queryDubheCreditStatusEx(QueryDubheCreditStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.credit.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheCreditStatusResponse());
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算
     */
    public CountDubheRepayReftrialResponse countDubheRepayReftrial(CountDubheRepayReftrialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDubheRepayReftrialEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算
     */
    public CountDubheRepayReftrialResponse countDubheRepayReftrialEx(CountDubheRepayReftrialRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.reftrial.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDubheRepayReftrialResponse());
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询
     */
    public QueryDubheRepayListResponse queryDubheRepayList(QueryDubheRepayListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheRepayListEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询
     */
    public QueryDubheRepayListResponse queryDubheRepayListEx(QueryDubheRepayListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheRepayListResponse());
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口
     */
    public ApplyDubheUsecreditResponse applyDubheUsecredit(ApplyDubheUsecreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubheUsecreditEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口
     */
    public ApplyDubheUsecreditResponse applyDubheUsecreditEx(ApplyDubheUsecreditRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.usecredit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubheUsecreditResponse());
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询
     */
    public QueryDubheUsecreditStatusResponse queryDubheUsecreditStatus(QueryDubheUsecreditStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheUsecreditStatusEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询
     */
    public QueryDubheUsecreditStatusResponse queryDubheUsecreditStatusEx(QueryDubheUsecreditStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.usecredit.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheUsecreditStatusResponse());
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算
     */
    public CountDubheRepayTrialResponse countDubheRepayTrial(CountDubheRepayTrialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDubheRepayTrialEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算
     */
    public CountDubheRepayTrialResponse countDubheRepayTrialEx(CountDubheRepayTrialRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.trial.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDubheRepayTrialResponse());
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口
     */
    public RepayDubheRepayCheckstandResponse repayDubheRepayCheckstand(RepayDubheRepayCheckstandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayDubheRepayCheckstandEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口
     */
    public RepayDubheRepayCheckstandResponse repayDubheRepayCheckstandEx(RepayDubheRepayCheckstandRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.checkstand.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayDubheRepayCheckstandResponse());
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询
     */
    public QueryDubheRepayInfoResponse queryDubheRepayInfo(QueryDubheRepayInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheRepayInfoEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询
     */
    public QueryDubheRepayInfoResponse queryDubheRepayInfoEx(QueryDubheRepayInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheRepayInfoResponse());
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口
     */
    public UpdateDubheCustomerInfoResponse updateDubheCustomerInfo(UpdateDubheCustomerInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubheCustomerInfoEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口
     */
    public UpdateDubheCustomerInfoResponse updateDubheCustomerInfoEx(UpdateDubheCustomerInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.customer.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubheCustomerInfoResponse());
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝
     * Summary: 天枢系统协议签约申请(支付宝)
     */
    public ApplyDubheCustomerAgreementsignResponse applyDubheCustomerAgreementsign(ApplyDubheCustomerAgreementsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubheCustomerAgreementsignEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝
     * Summary: 天枢系统协议签约申请(支付宝)
     */
    public ApplyDubheCustomerAgreementsignResponse applyDubheCustomerAgreementsignEx(ApplyDubheCustomerAgreementsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.customer.agreementsign.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubheCustomerAgreementsignResponse());
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝)
     */
    public QueryDubheCustomerAgreementsignResponse queryDubheCustomerAgreementsign(QueryDubheCustomerAgreementsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheCustomerAgreementsignEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝)
     */
    public QueryDubheCustomerAgreementsignResponse queryDubheCustomerAgreementsignEx(QueryDubheCustomerAgreementsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.customer.agreementsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheCustomerAgreementsignResponse());
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
     */
    public RepayDubheRepayWithholdResponse repayDubheRepayWithhold(RepayDubheRepayWithholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayDubheRepayWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
     */
    public RepayDubheRepayWithholdResponse repayDubheRepayWithholdEx(RepayDubheRepayWithholdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.repay.withhold.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayDubheRepayWithholdResponse());
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取
     */
    public QueryDubheSearchContractResponse queryDubheSearchContract(QueryDubheSearchContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheSearchContractEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取
     */
    public QueryDubheSearchContractResponse queryDubheSearchContractEx(QueryDubheSearchContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.search.contract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheSearchContractResponse());
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询
     */
    public QueryDubheReceiptOverdueResponse queryDubheReceiptOverdue(QueryDubheReceiptOverdueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubheReceiptOverdueEx(request, headers, runtime);
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询
     */
    public QueryDubheReceiptOverdueResponse queryDubheReceiptOverdueEx(QueryDubheReceiptOverdueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubhe.receipt.overdue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubheReceiptOverdueResponse());
    }

    /**
     * Description: 天枢发送短信接口，适用于一个模板相同参数
     * Summary: 天枢发送短信接口
     */
    public SendDubbridgeSmsResponse sendDubbridgeSms(SendDubbridgeSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendDubbridgeSmsEx(request, headers, runtime);
    }

    /**
     * Description: 天枢发送短信接口，适用于一个模板相同参数
     * Summary: 天枢发送短信接口
     */
    public SendDubbridgeSmsResponse sendDubbridgeSmsEx(SendDubbridgeSmsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.sms.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendDubbridgeSmsResponse());
    }

    /**
     * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
     * Summary: 天枢批量发送短信接口
     */
    public SendDubbridgeSmsBatchResponse sendDubbridgeSmsBatch(SendDubbridgeSmsBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendDubbridgeSmsBatchEx(request, headers, runtime);
    }

    /**
     * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
     * Summary: 天枢批量发送短信接口
     */
    public SendDubbridgeSmsBatchResponse sendDubbridgeSmsBatchEx(SendDubbridgeSmsBatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.sms.batch.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendDubbridgeSmsBatchResponse());
    }

    /**
     * Description: 资金路由接口，获取资金方编号
     * Summary: 天枢系统资金方代码(资金路由)查询
     */
    public QueryDubbridgeRouterFundrouterResponse queryDubbridgeRouterFundrouter(QueryDubbridgeRouterFundrouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRouterFundrouterEx(request, headers, runtime);
    }

    /**
     * Description: 资金路由接口，获取资金方编号
     * Summary: 天枢系统资金方代码(资金路由)查询
     */
    public QueryDubbridgeRouterFundrouterResponse queryDubbridgeRouterFundrouterEx(QueryDubbridgeRouterFundrouterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.router.fundrouter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRouterFundrouterResponse());
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口
     */
    public ApplyDubbridgeCreditResponse applyDubbridgeCredit(ApplyDubbridgeCreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubbridgeCreditEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统授信申请接口
     * Summary: 天枢系统授信申请接口
     */
    public ApplyDubbridgeCreditResponse applyDubbridgeCreditEx(ApplyDubbridgeCreditRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.credit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubbridgeCreditResponse());
    }

    /**
     * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
     * Summary: 天枢文件上传
     */
    public UploadDubbridgeFileResponse uploadDubbridgeFile(UploadDubbridgeFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDubbridgeFileEx(request, headers, runtime);
    }

    /**
     * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
     * Summary: 天枢文件上传
     */
    public UploadDubbridgeFileResponse uploadDubbridgeFileEx(UploadDubbridgeFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.dubbridge.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadDubbridgeFileResponse uploadDubbridgeFileResponse = UploadDubbridgeFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadDubbridgeFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadDubbridgeFileResponse());
    }

    /**
     * Description: 代扣签约绑卡接口
     * Summary: 代扣协议签约申请(银行卡绑卡)
     */
    public BindDubbridgeCustomerBankcardResponse bindDubbridgeCustomerBankcard(BindDubbridgeCustomerBankcardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDubbridgeCustomerBankcardEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约绑卡接口
     * Summary: 代扣协议签约申请(银行卡绑卡)
     */
    public BindDubbridgeCustomerBankcardResponse bindDubbridgeCustomerBankcardEx(BindDubbridgeCustomerBankcardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.bankcard.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDubbridgeCustomerBankcardResponse());
    }

    /**
     * Description: 代扣协议签约提交(银行卡绑卡)
     * Summary: 代扣协议签约校验(银行卡绑卡)
     */
    public VerifyDubbridgeCustomerBankcardResponse verifyDubbridgeCustomerBankcard(VerifyDubbridgeCustomerBankcardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyDubbridgeCustomerBankcardEx(request, headers, runtime);
    }

    /**
     * Description: 代扣协议签约提交(银行卡绑卡)
     * Summary: 代扣协议签约校验(银行卡绑卡)
     */
    public VerifyDubbridgeCustomerBankcardResponse verifyDubbridgeCustomerBankcardEx(VerifyDubbridgeCustomerBankcardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.bankcard.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyDubbridgeCustomerBankcardResponse());
    }

    /**
     * Description: 用于机构通道通用回调
     * Summary: 机构通道回调通用接口
     */
    public NotifyDubbridgeDefininnerchannelResponse notifyDubbridgeDefininnerchannel(NotifyDubbridgeDefininnerchannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyDubbridgeDefininnerchannelEx(request, headers, runtime);
    }

    /**
     * Description: 用于机构通道通用回调
     * Summary: 机构通道回调通用接口
     */
    public NotifyDubbridgeDefininnerchannelResponse notifyDubbridgeDefininnerchannelEx(NotifyDubbridgeDefininnerchannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.defininnerchannel.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyDubbridgeDefininnerchannelResponse());
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口
     */
    public QueryDubbridgeCreditStatusResponse queryDubbridgeCreditStatus(QueryDubbridgeCreditStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCreditStatusEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统授信额度查询接口
     * Summary: 天枢系统授信额度查询接口
     */
    public QueryDubbridgeCreditStatusResponse queryDubbridgeCreditStatusEx(QueryDubbridgeCreditStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.credit.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCreditStatusResponse());
    }

    /**
     * Description: 天枢系统企业小微分查询
     * Summary: 天枢系统企业小微分查询
     */
    public QueryDubbridgeRiskinfoEnterprisescoreResponse queryDubbridgeRiskinfoEnterprisescore(QueryDubbridgeRiskinfoEnterprisescoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRiskinfoEnterprisescoreEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统企业小微分查询
     * Summary: 天枢系统企业小微分查询
     */
    public QueryDubbridgeRiskinfoEnterprisescoreResponse queryDubbridgeRiskinfoEnterprisescoreEx(QueryDubbridgeRiskinfoEnterprisescoreRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.riskinfo.enterprisescore.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRiskinfoEnterprisescoreResponse());
    }

    /**
     * Description: 天枢系统风控信息通用查询
     * Summary: 天枢系统风控信息通用查询
     */
    public QueryDubbridgeRiskinfoCommonResponse queryDubbridgeRiskinfoCommon(QueryDubbridgeRiskinfoCommonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRiskinfoCommonEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统风控信息通用查询
     * Summary: 天枢系统风控信息通用查询
     */
    public QueryDubbridgeRiskinfoCommonResponse queryDubbridgeRiskinfoCommonEx(QueryDubbridgeRiskinfoCommonRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.riskinfo.common.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRiskinfoCommonResponse());
    }

    /**
     * Description: 额度、利率、状态调整
     * Summary: 调额申请
     */
    public UpdateDubbridgeInstitutionCreditResponse updateDubbridgeInstitutionCredit(UpdateDubbridgeInstitutionCreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubbridgeInstitutionCreditEx(request, headers, runtime);
    }

    /**
     * Description: 额度、利率、状态调整
     * Summary: 调额申请
     */
    public UpdateDubbridgeInstitutionCreditResponse updateDubbridgeInstitutionCreditEx(UpdateDubbridgeInstitutionCreditRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.institution.credit.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubbridgeInstitutionCreditResponse());
    }

    /**
     * Description: 天枢企业经营数据查询
     * Summary: 天枢企业经营数据查询
     */
    public QueryDubbridgeRiskinfoBusinessinfoResponse queryDubbridgeRiskinfoBusinessinfo(QueryDubbridgeRiskinfoBusinessinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRiskinfoBusinessinfoEx(request, headers, runtime);
    }

    /**
     * Description: 天枢企业经营数据查询
     * Summary: 天枢企业经营数据查询
     */
    public QueryDubbridgeRiskinfoBusinessinfoResponse queryDubbridgeRiskinfoBusinessinfoEx(QueryDubbridgeRiskinfoBusinessinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.riskinfo.businessinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRiskinfoBusinessinfoResponse());
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝）
     * Summary: 天枢系统协议签约申请(支付宝)
     */
    public ApplyDubbridgeCustomerAgreementsignResponse applyDubbridgeCustomerAgreementsign(ApplyDubbridgeCustomerAgreementsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubbridgeCustomerAgreementsignEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统协议签约申请(支付宝）
     * Summary: 天枢系统协议签约申请(支付宝)
     */
    public ApplyDubbridgeCustomerAgreementsignResponse applyDubbridgeCustomerAgreementsignEx(ApplyDubbridgeCustomerAgreementsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.agreementsign.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubbridgeCustomerAgreementsignResponse());
    }

    /**
     * Description: 天枢系统是否授信查询
     * Summary: 天枢系统是否授信查询
     */
    public QueryDubbridgeAccountStatusResponse queryDubbridgeAccountStatus(QueryDubbridgeAccountStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeAccountStatusEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统是否授信查询
     * Summary: 天枢系统是否授信查询
     */
    public QueryDubbridgeAccountStatusResponse queryDubbridgeAccountStatusEx(QueryDubbridgeAccountStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.account.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeAccountStatusResponse());
    }

    /**
     * Description: 天枢系统校验是否联登
     * Summary: 天枢系统校验是否联登
     */
    public QueryDubbridgeAccountCustomResponse queryDubbridgeAccountCustom(QueryDubbridgeAccountCustomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeAccountCustomEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统校验是否联登
     * Summary: 天枢系统校验是否联登
     */
    public QueryDubbridgeAccountCustomResponse queryDubbridgeAccountCustomEx(QueryDubbridgeAccountCustomRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.account.custom.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeAccountCustomResponse());
    }

    /**
     * Description: 天枢系统更新渠道
     * Summary: 天枢系统更新渠道
     */
    public UpdateDubbridgeAccountCustomResponse updateDubbridgeAccountCustom(UpdateDubbridgeAccountCustomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubbridgeAccountCustomEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统更新渠道
     * Summary: 天枢系统更新渠道
     */
    public UpdateDubbridgeAccountCustomResponse updateDubbridgeAccountCustomEx(UpdateDubbridgeAccountCustomRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.account.custom.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubbridgeAccountCustomResponse());
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝)
     */
    public QueryDubbridgeCustomerAgreementsignResponse queryDubbridgeCustomerAgreementsign(QueryDubbridgeCustomerAgreementsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCustomerAgreementsignEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统协议签约查询(支付宝)
     * Summary: 天枢系统协议签约查询(支付宝)
     */
    public QueryDubbridgeCustomerAgreementsignResponse queryDubbridgeCustomerAgreementsignEx(QueryDubbridgeCustomerAgreementsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.agreementsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCustomerAgreementsignResponse());
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口
     */
    public UpdateDubbridgeCustomerInfoResponse updateDubbridgeCustomerInfo(UpdateDubbridgeCustomerInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubbridgeCustomerInfoEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
     * Summary: 天枢系统客户信息变更接口
     */
    public UpdateDubbridgeCustomerInfoResponse updateDubbridgeCustomerInfoEx(UpdateDubbridgeCustomerInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubbridgeCustomerInfoResponse());
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询
     */
    public QueryDubbridgeReceiptOverdueResponse queryDubbridgeReceiptOverdue(QueryDubbridgeReceiptOverdueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeReceiptOverdueEx(request, headers, runtime);
    }

    /**
     * Description: 天枢逾期信息查询接口
     * Summary: 逾期信息查询
     */
    public QueryDubbridgeReceiptOverdueResponse queryDubbridgeReceiptOverdueEx(QueryDubbridgeReceiptOverdueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.receipt.overdue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeReceiptOverdueResponse());
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口
     */
    public RepayDubbridgeRepayCheckstandResponse repayDubbridgeRepayCheckstand(RepayDubbridgeRepayCheckstandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayDubbridgeRepayCheckstandEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统主动还款（收银台）接口
     * Summary: 天枢系统主动还款（收银台）接口
     */
    public RepayDubbridgeRepayCheckstandResponse repayDubbridgeRepayCheckstandEx(RepayDubbridgeRepayCheckstandRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.checkstand.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayDubbridgeRepayCheckstandResponse());
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询
     */
    public QueryDubbridgeRepayInfoResponse queryDubbridgeRepayInfo(QueryDubbridgeRepayInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRepayInfoEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统还款信息查询
     * Summary: 天枢系统还款信息查询
     */
    public QueryDubbridgeRepayInfoResponse queryDubbridgeRepayInfoEx(QueryDubbridgeRepayInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRepayInfoResponse());
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询
     */
    public QueryDubbridgeRepayListResponse queryDubbridgeRepayList(QueryDubbridgeRepayListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeRepayListEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
     * Summary: 天枢系统还款计划查询
     */
    public QueryDubbridgeRepayListResponse queryDubbridgeRepayListEx(QueryDubbridgeRepayListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeRepayListResponse());
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算
     */
    public CountDubbridgeRepayReftrialResponse countDubbridgeRepayReftrial(CountDubbridgeRepayReftrialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDubbridgeRepayReftrialEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
     * Summary: 天枢系统还款计划试算
     */
    public CountDubbridgeRepayReftrialResponse countDubbridgeRepayReftrialEx(CountDubbridgeRepayReftrialRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.reftrial.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDubbridgeRepayReftrialResponse());
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算
     */
    public CountDubbridgeRepayTrialResponse countDubbridgeRepayTrial(CountDubbridgeRepayTrialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDubbridgeRepayTrialEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统还款试算，根据借据号计算还款金额
     * Summary: 天枢系统还款试算
     */
    public CountDubbridgeRepayTrialResponse countDubbridgeRepayTrialEx(CountDubbridgeRepayTrialRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.trial.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDubbridgeRepayTrialResponse());
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
     */
    public RepayDubbridgeRepayWithholdResponse repayDubbridgeRepayWithhold(RepayDubbridgeRepayWithholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayDubbridgeRepayWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 天枢信贷业务系统主动还款（直接代扣）接口
     * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
     */
    public RepayDubbridgeRepayWithholdResponse repayDubbridgeRepayWithholdEx(RepayDubbridgeRepayWithholdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.repay.withhold.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayDubbridgeRepayWithholdResponse());
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取
     */
    public QueryDubbridgeSearchContractResponse queryDubbridgeSearchContract(QueryDubbridgeSearchContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeSearchContractEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统合同获取
     * Summary: 天枢系统合同获取
     */
    public QueryDubbridgeSearchContractResponse queryDubbridgeSearchContractEx(QueryDubbridgeSearchContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.search.contract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeSearchContractResponse());
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口
     */
    public ApplyDubbridgeUsecreditResponse applyDubbridgeUsecredit(ApplyDubbridgeUsecreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDubbridgeUsecreditEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统用信申请接口
     * Summary: 天枢系统用信申请接口
     */
    public ApplyDubbridgeUsecreditResponse applyDubbridgeUsecreditEx(ApplyDubbridgeUsecreditRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.usecredit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDubbridgeUsecreditResponse());
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询
     */
    public QueryDubbridgeUsecreditStatusResponse queryDubbridgeUsecreditStatus(QueryDubbridgeUsecreditStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeUsecreditStatusEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
     * Summary: 天枢系统用信申请状态查询
     */
    public QueryDubbridgeUsecreditStatusResponse queryDubbridgeUsecreditStatusEx(QueryDubbridgeUsecreditStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.usecredit.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeUsecreditStatusResponse());
    }

    /**
     * Description: 天枢系统是否结清
     * Summary: 天枢系统借款是否结清
     */
    public QueryDubbridgeReceiptStatusResponse queryDubbridgeReceiptStatus(QueryDubbridgeReceiptStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeReceiptStatusEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统是否结清
     * Summary: 天枢系统借款是否结清
     */
    public QueryDubbridgeReceiptStatusResponse queryDubbridgeReceiptStatusEx(QueryDubbridgeReceiptStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.receipt.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeReceiptStatusResponse());
    }

    /**
     * Description: 天枢系统协议签约查询(通用)
     * Summary: 天枢系统协议签约查询(通用)
     */
    public QueryDubbridgeCustomerCommonagreementsignResponse queryDubbridgeCustomerCommonagreementsign(QueryDubbridgeCustomerCommonagreementsignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCustomerCommonagreementsignEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统协议签约查询(通用)
     * Summary: 天枢系统协议签约查询(通用)
     */
    public QueryDubbridgeCustomerCommonagreementsignResponse queryDubbridgeCustomerCommonagreementsignEx(QueryDubbridgeCustomerCommonagreementsignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.customer.commonagreementsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCustomerCommonagreementsignResponse());
    }

    /**
     * Description: 根据关键字从第三方查询企业信息
     * Summary: 天枢系统企业搜索
     */
    public QueryDubbridgeCompanyItemsResponse queryDubbridgeCompanyItems(QueryDubbridgeCompanyItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCompanyItemsEx(request, headers, runtime);
    }

    /**
     * Description: 根据关键字从第三方查询企业信息
     * Summary: 天枢系统企业搜索
     */
    public QueryDubbridgeCompanyItemsResponse queryDubbridgeCompanyItemsEx(QueryDubbridgeCompanyItemsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.company.items.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCompanyItemsResponse());
    }

    /**
     * Description: 客户影像信息更新
     * Summary: 客户影像信息更新
     */
    public UpdateDubbridgeFileResponse updateDubbridgeFile(UpdateDubbridgeFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDubbridgeFileEx(request, headers, runtime);
    }

    /**
     * Description: 客户影像信息更新
     * Summary: 客户影像信息更新
     */
    public UpdateDubbridgeFileResponse updateDubbridgeFileEx(UpdateDubbridgeFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.file.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDubbridgeFileResponse());
    }

    /**
     * Description: 天枢系统获取授信H5地址
     * Summary: 天枢系统获取授信H5地址
     */
    public QueryDubbridgeCreditUrlResponse queryDubbridgeCreditUrl(QueryDubbridgeCreditUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeCreditUrlEx(request, headers, runtime);
    }

    /**
     * Description: 天枢系统获取授信H5地址
     * Summary: 天枢系统获取授信H5地址
     */
    public QueryDubbridgeCreditUrlResponse queryDubbridgeCreditUrlEx(QueryDubbridgeCreditUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.credit.url.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeCreditUrlResponse());
    }

    /**
     * Description: 根据关键字从第三方查询企业详情信息
     * Summary: 天枢系统企业详情信息查询
     */
    public QueryDubbridgeBusinessDetailResponse queryDubbridgeBusinessDetail(QueryDubbridgeBusinessDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDubbridgeBusinessDetailEx(request, headers, runtime);
    }

    /**
     * Description: 根据关键字从第三方查询企业详情信息
     * Summary: 天枢系统企业详情信息查询
     */
    public QueryDubbridgeBusinessDetailResponse queryDubbridgeBusinessDetailEx(QueryDubbridgeBusinessDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.business.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDubbridgeBusinessDetailResponse());
    }

    /**
     * Description: 天枢回调通用接口
     * Summary: 天枢回调通用接口
     */
    public NotifyDubbridgeCallbackResponse notifyDubbridgeCallback(NotifyDubbridgeCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyDubbridgeCallbackEx(request, headers, runtime);
    }

    /**
     * Description: 天枢回调通用接口
     * Summary: 天枢回调通用接口
     */
    public NotifyDubbridgeCallbackResponse notifyDubbridgeCallbackEx(NotifyDubbridgeCallbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.dubbridge.callback.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyDubbridgeCallbackResponse());
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口
     */
    public VerifyFinserviceZhimaIdentifyResponse verifyFinserviceZhimaIdentify(VerifyFinserviceZhimaIdentifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyFinserviceZhimaIdentifyEx(request, headers, runtime);
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口
     */
    public VerifyFinserviceZhimaIdentifyResponse verifyFinserviceZhimaIdentifyEx(VerifyFinserviceZhimaIdentifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.finservice.zhima.identify.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyFinserviceZhimaIdentifyResponse());
    }

    /**
     * Description:  
     * Summary: 芝麻四要素认证结果查询
     */
    public QueryFinserviceZhimaIdentifyResponse queryFinserviceZhimaIdentify(QueryFinserviceZhimaIdentifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFinserviceZhimaIdentifyEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: 芝麻四要素认证结果查询
     */
    public QueryFinserviceZhimaIdentifyResponse queryFinserviceZhimaIdentifyEx(QueryFinserviceZhimaIdentifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.finservice.zhima.identify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFinserviceZhimaIdentifyResponse());
    }

    /**
     * Description: 多源融合平台的数据服务查询接口
     * Summary: 多源融合平台的数据服务查询接口
     */
    public QueryMdipDataserviceResponse queryMdipDataservice(QueryMdipDataserviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMdipDataserviceEx(request, headers, runtime);
    }

    /**
     * Description: 多源融合平台的数据服务查询接口
     * Summary: 多源融合平台的数据服务查询接口
     */
    public QueryMdipDataserviceResponse queryMdipDataserviceEx(QueryMdipDataserviceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.mdip.dataservice.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMdipDataserviceResponse());
    }

    /**
     * Description: 接受op的文件id,支持外网多源文件上传
     * Summary: 接受op的文件id,支持外网多源文件上传
     */
    public ReceiveMdipParamsFileResponse receiveMdipParamsFile(ReceiveMdipParamsFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveMdipParamsFileEx(request, headers, runtime);
    }

    /**
     * Description: 接受op的文件id,支持外网多源文件上传
     * Summary: 接受op的文件id,支持外网多源文件上传
     */
    public ReceiveMdipParamsFileResponse receiveMdipParamsFileEx(ReceiveMdipParamsFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.mdip.params.file.receive"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                ReceiveMdipParamsFileResponse receiveMdipParamsFileResponse = ReceiveMdipParamsFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return receiveMdipParamsFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.mdip.params.file.receive", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReceiveMdipParamsFileResponse());
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】
     */
    public QueryRbbGenericInvokeResponse queryRbbGenericInvoke(QueryRbbGenericInvokeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbGenericInvokeEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】
     */
    public QueryRbbGenericInvokeResponse queryRbbGenericInvokeEx(QueryRbbGenericInvokeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.generic.invoke.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbGenericInvokeResponse());
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】
     */
    public CreateRbbTokenResponse createRbbToken(CreateRbbTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbTokenEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】
     */
    public CreateRbbTokenResponse createRbbTokenEx(CreateRbbTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.token.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbTokenResponse());
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】
     */
    public CreateRbbApiGwtokenResponse createRbbApiGwtoken(CreateRbbApiGwtokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbApiGwtokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】
     */
    public CreateRbbApiGwtokenResponse createRbbApiGwtokenEx(CreateRbbApiGwtokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.api.gwtoken.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbApiGwtokenResponse());
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI
     */
    public QueryRbbGeneralResponse queryRbbGeneral(QueryRbbGeneralRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbGeneralEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI
     */
    public QueryRbbGeneralResponse queryRbbGeneralEx(QueryRbbGeneralRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.general.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbGeneralResponse());
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token
     */
    public GetRbbLoginTokenResponse getRbbLoginToken(GetRbbLoginTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRbbLoginTokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token
     */
    public GetRbbLoginTokenResponse getRbbLoginTokenEx(GetRbbLoginTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.login.token.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRbbLoginTokenResponse());
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户
     */
    public CreateRbbTenantResponse createRbbTenant(CreateRbbTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbTenantEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户
     */
    public CreateRbbTenantResponse createRbbTenantEx(CreateRbbTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.tenant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbTenantResponse());
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户
     */
    public CreateRbbUserResponse createRbbUser(CreateRbbUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbUserEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户
     */
    public CreateRbbUserResponse createRbbUserEx(CreateRbbUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbUserResponse());
    }

    /**
     * Description: 企业准入接口
     * Summary: 企业准入
     */
    public ExecRbbCompanyGuardResponse execRbbCompanyGuard(ExecRbbCompanyGuardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRbbCompanyGuardEx(request, headers, runtime);
    }

    /**
     * Description: 企业准入接口
     * Summary: 企业准入
     */
    public ExecRbbCompanyGuardResponse execRbbCompanyGuardEx(ExecRbbCompanyGuardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.guard.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRbbCompanyGuardResponse());
    }

    /**
     * Description: 提交授信申请
     * Summary: 企业授信申请
     */
    public ApplyRbbCompanyCreditResponse applyRbbCompanyCredit(ApplyRbbCompanyCreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRbbCompanyCreditEx(request, headers, runtime);
    }

    /**
     * Description: 提交授信申请
     * Summary: 企业授信申请
     */
    public ApplyRbbCompanyCreditResponse applyRbbCompanyCreditEx(ApplyRbbCompanyCreditRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.credit.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRbbCompanyCreditResponse());
    }

    /**
     * Description: 查询企业授信结果
     * Summary: 企业授信结果查询
     */
    public QueryRbbCompanyCreditResponse queryRbbCompanyCredit(QueryRbbCompanyCreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbCompanyCreditEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业授信结果
     * Summary: 企业授信结果查询
     */
    public QueryRbbCompanyCreditResponse queryRbbCompanyCreditEx(QueryRbbCompanyCreditRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.credit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbCompanyCreditResponse());
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
     * Summary: 风险大脑-上交所数据离线同步数据准备状态
     */
    public QueryRbbRegdatasyncPreparedResponse queryRbbRegdatasyncPrepared(QueryRbbRegdatasyncPreparedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbRegdatasyncPreparedEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
     * Summary: 风险大脑-上交所数据离线同步数据准备状态
     */
    public QueryRbbRegdatasyncPreparedResponse queryRbbRegdatasyncPreparedEx(QueryRbbRegdatasyncPreparedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.regdatasync.prepared.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbRegdatasyncPreparedResponse());
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据开始通知标识
     * Summary: 风险大脑-上交所数据离线同步数据开始通知
     */
    public StartRbbRegdatasyncScheduleResponse startRbbRegdatasyncSchedule(StartRbbRegdatasyncScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRbbRegdatasyncScheduleEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据开始通知标识
     * Summary: 风险大脑-上交所数据离线同步数据开始通知
     */
    public StartRbbRegdatasyncScheduleResponse startRbbRegdatasyncScheduleEx(StartRbbRegdatasyncScheduleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.regdatasync.schedule.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartRbbRegdatasyncScheduleResponse());
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
     * Summary: 风险大脑-上交所数据离线同步数据完成记录
     */
    public FinishRbbRegdatasyncScheduleResponse finishRbbRegdatasyncSchedule(FinishRbbRegdatasyncScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishRbbRegdatasyncScheduleEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
     * Summary: 风险大脑-上交所数据离线同步数据完成记录
     */
    public FinishRbbRegdatasyncScheduleResponse finishRbbRegdatasyncScheduleEx(FinishRbbRegdatasyncScheduleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.regdatasync.schedule.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishRbbRegdatasyncScheduleResponse());
    }

    /**
     * Description: 提交准入规则的执行请求
     * Summary: 企业准入申请
     */
    public ApplyRbbCompanyGuardResponse applyRbbCompanyGuard(ApplyRbbCompanyGuardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRbbCompanyGuardEx(request, headers, runtime);
    }

    /**
     * Description: 提交准入规则的执行请求
     * Summary: 企业准入申请
     */
    public ApplyRbbCompanyGuardResponse applyRbbCompanyGuardEx(ApplyRbbCompanyGuardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.guard.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyRbbCompanyGuardResponse());
    }

    /**
     * Description: 企业准入结果查询
     * Summary: 企业准入结果查询
     */
    public QueryRbbCompanyGuardResponse queryRbbCompanyGuard(QueryRbbCompanyGuardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbCompanyGuardEx(request, headers, runtime);
    }

    /**
     * Description: 企业准入结果查询
     * Summary: 企业准入结果查询
     */
    public QueryRbbCompanyGuardResponse queryRbbCompanyGuardEx(QueryRbbCompanyGuardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.company.guard.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbCompanyGuardResponse());
    }

    /**
     * Description: 企业风控给上交所鹰眼使用的zsearch查询
     * Summary: 企业风控给鹰眼使用的zsearch查询
     */
    public QueryRbbObtsZsearchResponse queryRbbObtsZsearch(QueryRbbObtsZsearchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbObtsZsearchEx(request, headers, runtime);
    }

    /**
     * Description: 企业风控给上交所鹰眼使用的zsearch查询
     * Summary: 企业风控给鹰眼使用的zsearch查询
     */
    public QueryRbbObtsZsearchResponse queryRbbObtsZsearchEx(QueryRbbObtsZsearchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.obts.zsearch.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbObtsZsearchResponse());
    }

    /**
     * Description: 企业风控客户推送的企业信息
     * Summary: 企业风控客户推送的企业信息
     */
    public PushRbbCustomerCompanyinfoResponse pushRbbCustomerCompanyinfo(PushRbbCustomerCompanyinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRbbCustomerCompanyinfoEx(request, headers, runtime);
    }

    /**
     * Description: 企业风控客户推送的企业信息
     * Summary: 企业风控客户推送的企业信息
     */
    public PushRbbCustomerCompanyinfoResponse pushRbbCustomerCompanyinfoEx(PushRbbCustomerCompanyinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.customer.companyinfo.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRbbCustomerCompanyinfoResponse());
    }

    /**
     * Description: 获取签约接口
     * Summary: 获取签约接口
     */
    public QueryRpgwSignUrlResponse queryRpgwSignUrl(QueryRpgwSignUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRpgwSignUrlEx(request, headers, runtime);
    }

    /**
     * Description: 获取签约接口
     * Summary: 获取签约接口
     */
    public QueryRpgwSignUrlResponse queryRpgwSignUrlEx(QueryRpgwSignUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.sign.url.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRpgwSignUrlResponse());
    }

    /**
     * Description: 创建报税用户接口
     * Summary: 创建报税用户接口
     */
    public RegisterRpgwUserEinvoiceResponse registerRpgwUserEinvoice(RegisterRpgwUserEinvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerRpgwUserEinvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 创建报税用户接口
     * Summary: 创建报税用户接口
     */
    public RegisterRpgwUserEinvoiceResponse registerRpgwUserEinvoiceEx(RegisterRpgwUserEinvoiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.einvoice.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterRpgwUserEinvoiceResponse());
    }

    /**
     * Description: 查询签约接口
     * Summary: 获取签约接口
     */
    public QueryRpgwUserSignurlResponse queryRpgwUserSignurl(QueryRpgwUserSignurlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRpgwUserSignurlEx(request, headers, runtime);
    }

    /**
     * Description: 查询签约接口
     * Summary: 获取签约接口
     */
    public QueryRpgwUserSignurlResponse queryRpgwUserSignurlEx(QueryRpgwUserSignurlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.signurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRpgwUserSignurlResponse());
    }

    /**
     * Description: 提现
     * Summary: 提现
     */
    public WithdrawRpgwUserCommissionResponse withdrawRpgwUserCommission(WithdrawRpgwUserCommissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.withdrawRpgwUserCommissionEx(request, headers, runtime);
    }

    /**
     * Description: 提现
     * Summary: 提现
     */
    public WithdrawRpgwUserCommissionResponse withdrawRpgwUserCommissionEx(WithdrawRpgwUserCommissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.commission.withdraw", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new WithdrawRpgwUserCommissionResponse());
    }

    /**
     * Description: 信息同步
     * Summary: 下单等信息同步
     */
    public SyncRpgwUserOrderinfoResponse syncRpgwUserOrderinfo(SyncRpgwUserOrderinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncRpgwUserOrderinfoEx(request, headers, runtime);
    }

    /**
     * Description: 信息同步
     * Summary: 下单等信息同步
     */
    public SyncRpgwUserOrderinfoResponse syncRpgwUserOrderinfoEx(SyncRpgwUserOrderinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.orderinfo.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncRpgwUserOrderinfoResponse());
    }

    /**
     * Description: 签约结果通知
     * Summary: 签约结果通知
     */
    public NotifyRpgwUserSignresultResponse notifyRpgwUserSignresult(NotifyRpgwUserSignresultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyRpgwUserSignresultEx(request, headers, runtime);
    }

    /**
     * Description: 签约结果通知
     * Summary: 签约结果通知
     */
    public NotifyRpgwUserSignresultResponse notifyRpgwUserSignresultEx(NotifyRpgwUserSignresultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rpgw.user.signresult.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyRpgwUserSignresultResponse());
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表
     */
    public QueryRtopCompanyOpinionResponse queryRtopCompanyOpinion(QueryRtopCompanyOpinionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyOpinionEx(request, headers, runtime);
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表
     */
    public QueryRtopCompanyOpinionResponse queryRtopCompanyOpinionEx(QueryRtopCompanyOpinionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.opinion.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyOpinionResponse());
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息
     */
    public ListRtopCompanyOpinionsResponse listRtopCompanyOpinions(ListRtopCompanyOpinionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopCompanyOpinionsEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息
     */
    public ListRtopCompanyOpinionsResponse listRtopCompanyOpinionsEx(ListRtopCompanyOpinionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.opinions.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopCompanyOpinionsResponse());
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情
     */
    public GetRtopCompanyMonitorResponse getRtopCompanyMonitor(GetRtopCompanyMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRtopCompanyMonitorEx(request, headers, runtime);
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情
     */
    public GetRtopCompanyMonitorResponse getRtopCompanyMonitorEx(GetRtopCompanyMonitorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.monitor.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRtopCompanyMonitorResponse());
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息
     */
    public QueryRtopCrowdriskStatisticResponse queryRtopCrowdriskStatistic(QueryRtopCrowdriskStatisticRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCrowdriskStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息
     */
    public QueryRtopCrowdriskStatisticResponse queryRtopCrowdriskStatisticEx(QueryRtopCrowdriskStatisticRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.statistic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCrowdriskStatisticResponse());
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表
     */
    public ListRtopCrowdriskResponse listRtopCrowdrisk(ListRtopCrowdriskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopCrowdriskEx(request, headers, runtime);
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表
     */
    public ListRtopCrowdriskResponse listRtopCrowdriskEx(ListRtopCrowdriskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopCrowdriskResponse());
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息
     */
    public QueryRtopCrowdriskDetailResponse queryRtopCrowdriskDetail(QueryRtopCrowdriskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCrowdriskDetailEx(request, headers, runtime);
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息
     */
    public QueryRtopCrowdriskDetailResponse queryRtopCrowdriskDetailEx(QueryRtopCrowdriskDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCrowdriskDetailResponse());
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息
     */
    public QueryRtopRiskstormResponse queryRtopRiskstorm(QueryRtopRiskstormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRiskstormEx(request, headers, runtime);
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息
     */
    public QueryRtopRiskstormResponse queryRtopRiskstormEx(QueryRtopRiskstormRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.riskstorm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRiskstormResponse());
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额
     */
    public QueryRtopCrowdriskSumResponse queryRtopCrowdriskSum(QueryRtopCrowdriskSumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCrowdriskSumEx(request, headers, runtime);
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额
     */
    public QueryRtopCrowdriskSumResponse queryRtopCrowdriskSumEx(QueryRtopCrowdriskSumRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.sum.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCrowdriskSumResponse());
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取
     */
    public GetRtopCompanyDetailResponse getRtopCompanyDetail(GetRtopCompanyDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRtopCompanyDetailEx(request, headers, runtime);
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取
     */
    public GetRtopCompanyDetailResponse getRtopCompanyDetailEx(GetRtopCompanyDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.detail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRtopCompanyDetailResponse());
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口
     */
    public QueryRtopCompanyRiskinfoResponse queryRtopCompanyRiskinfo(QueryRtopCompanyRiskinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyRiskinfoEx(request, headers, runtime);
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口
     */
    public QueryRtopCompanyRiskinfoResponse queryRtopCompanyRiskinfoEx(QueryRtopCompanyRiskinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.riskinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyRiskinfoResponse());
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口
     */
    public ExecRtopGenericInvokeResponse execRtopGenericInvoke(ExecRtopGenericInvokeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRtopGenericInvokeEx(request, headers, runtime);
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口
     */
    public ExecRtopGenericInvokeResponse execRtopGenericInvokeEx(ExecRtopGenericInvokeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.generic.invoke.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRtopGenericInvokeResponse());
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token
     */
    public CreateRtopTokenResponse createRtopToken(CreateRtopTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRtopTokenEx(request, headers, runtime);
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token
     */
    public CreateRtopTokenResponse createRtopTokenEx(CreateRtopTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.token.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRtopTokenResponse());
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取
     */
    public QueryRtopRisklabelResponse queryRtopRisklabel(QueryRtopRisklabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRisklabelEx(request, headers, runtime);
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取
     */
    public QueryRtopRisklabelResponse queryRtopRisklabelEx(QueryRtopRisklabelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.risklabel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRisklabelResponse());
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取
     */
    public QueryRtopCompanyResponse queryRtopCompany(QueryRtopCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyEx(request, headers, runtime);
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取
     */
    public QueryRtopCompanyResponse queryRtopCompanyEx(QueryRtopCompanyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyResponse());
    }

    /**
     * Description: 标签配置全量信息获取
    rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取
     */
    public QueryRtopRisklabelFilterResponse queryRtopRisklabelFilter(QueryRtopRisklabelFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRisklabelFilterEx(request, headers, runtime);
    }

    /**
     * Description: 标签配置全量信息获取
    rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取
     */
    public QueryRtopRisklabelFilterResponse queryRtopRisklabelFilterEx(QueryRtopRisklabelFilterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.risklabel.filter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRisklabelFilterResponse());
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步
     */
    public PullRegtechNewsResponse pullRegtechNews(PullRegtechNewsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullRegtechNewsEx(request, headers, runtime);
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步
     */
    public PullRegtechNewsResponse pullRegtechNewsEx(PullRegtechNewsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.regtech.news.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullRegtechNewsResponse());
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈
     */
    public QueryRtopCompanyFeedbackResponse queryRtopCompanyFeedback(QueryRtopCompanyFeedbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyFeedbackEx(request, headers, runtime);
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈
     */
    public QueryRtopCompanyFeedbackResponse queryRtopCompanyFeedbackEx(QueryRtopCompanyFeedbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.feedback.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyFeedbackResponse());
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询
     */
    public QueryRtopCompanyAlarmResponse queryRtopCompanyAlarm(QueryRtopCompanyAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyAlarmEx(request, headers, runtime);
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询
     */
    public QueryRtopCompanyAlarmResponse queryRtopCompanyAlarmEx(QueryRtopCompanyAlarmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.alarm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyAlarmResponse());
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表
     */
    public QueryRtopCompanyRiskyResponse queryRtopCompanyRisky(QueryRtopCompanyRiskyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyRiskyEx(request, headers, runtime);
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表
     */
    public QueryRtopCompanyRiskyResponse queryRtopCompanyRiskyEx(QueryRtopCompanyRiskyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.risky.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyRiskyResponse());
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表
     */
    public QueryRtopCompanyListResponse queryRtopCompanyList(QueryRtopCompanyListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyListEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表
     */
    public QueryRtopCompanyListResponse queryRtopCompanyListEx(QueryRtopCompanyListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyListResponse());
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取
     */
    public QueryRtopRisklabelConfigResponse queryRtopRisklabelConfig(QueryRtopRisklabelConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRisklabelConfigEx(request, headers, runtime);
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取
     */
    public QueryRtopRisklabelConfigResponse queryRtopRisklabelConfigEx(QueryRtopRisklabelConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.risklabel.config.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRisklabelConfigResponse());
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询
     */
    public QueryRtopCompanyRiskResponse queryRtopCompanyRisk(QueryRtopCompanyRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyRiskEx(request, headers, runtime);
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询
     */
    public QueryRtopCompanyRiskResponse queryRtopCompanyRiskEx(QueryRtopCompanyRiskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyRiskResponse());
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业
     */
    public ListRtopCompanyRelatedResponse listRtopCompanyRelated(ListRtopCompanyRelatedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopCompanyRelatedEx(request, headers, runtime);
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业
     */
    public ListRtopCompanyRelatedResponse listRtopCompanyRelatedEx(ListRtopCompanyRelatedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.related.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopCompanyRelatedResponse());
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询
     */
    public QueryRtopTagImageResponse queryRtopTagImage(QueryRtopTagImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopTagImageEx(request, headers, runtime);
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询
     */
    public QueryRtopTagImageResponse queryRtopTagImageEx(QueryRtopTagImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.tag.image.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopTagImageResponse());
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表
     */
    public ListRtopStarCompanyResponse listRtopStarCompany(ListRtopStarCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopStarCompanyEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表
     */
    public ListRtopStarCompanyResponse listRtopStarCompanyEx(ListRtopStarCompanyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.star.company.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopStarCompanyResponse());
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas)
     */
    public QueryRpSecurityPolicyResponse queryRpSecurityPolicy(QueryRpSecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRpSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas)
     */
    public QueryRpSecurityPolicyResponse queryRpSecurityPolicyEx(QueryRpSecurityPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rp.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRpSecurityPolicyResponse());
    }

    /**
     * Description: 风控快照查询
     * Summary: 风控事件快照查询
     */
    public QuerySnapshotEventResponse querySnapshotEvent(QuerySnapshotEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySnapshotEventEx(request, headers, runtime);
    }

    /**
     * Description: 风控快照查询
     * Summary: 风控事件快照查询
     */
    public QuerySnapshotEventResponse querySnapshotEventEx(QuerySnapshotEventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.snapshot.event.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySnapshotEventResponse());
    }

    /**
     * Description: 营销盾批量参数文件上传接口
     * Summary: 营销盾参数文件上传
     */
    public UploadUmktParamsFileResponse uploadUmktParamsFile(UploadUmktParamsFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadUmktParamsFileEx(request, headers, runtime);
    }

    /**
     * Description: 营销盾批量参数文件上传接口
     * Summary: 营销盾参数文件上传
     */
    public UploadUmktParamsFileResponse uploadUmktParamsFileEx(UploadUmktParamsFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "riskplus.umkt.params.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadUmktParamsFileResponse uploadUmktParamsFileResponse = UploadUmktParamsFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadUmktParamsFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.params.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadUmktParamsFileResponse());
    }

    /**
     * Description: 营销盾实时营销服务，支持批量
     * Summary: 营销盾实时营销服务
     */
    public BatchqueryUmktRtMarketingResponse batchqueryUmktRtMarketing(BatchqueryUmktRtMarketingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktRtMarketingEx(request, headers, runtime);
    }

    /**
     * Description: 营销盾实时营销服务，支持批量
     * Summary: 营销盾实时营销服务
     */
    public BatchqueryUmktRtMarketingResponse batchqueryUmktRtMarketingEx(BatchqueryUmktRtMarketingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.marketing.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktRtMarketingResponse());
    }

    /**
     * Description: 梦网富信投放事件通知
     * Summary: 梦网富信投放事件通知
     */
    public SyncUmktRtEventresultResponse syncUmktRtEventresult(SyncUmktRtEventresultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncUmktRtEventresultEx(request, headers, runtime);
    }

    /**
     * Description: 梦网富信投放事件通知
     * Summary: 梦网富信投放事件通知
     */
    public SyncUmktRtEventresultResponse syncUmktRtEventresultEx(SyncUmktRtEventresultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.eventresult.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncUmktRtEventresultResponse());
    }

    /**
     * Description: 营销盾场景租户信息上传or更新
     * Summary: 营销盾场景租户信息上传or更新
     */
    public ImportUmktSceneUploadResponse importUmktSceneUpload(ImportUmktSceneUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importUmktSceneUploadEx(request, headers, runtime);
    }

    /**
     * Description: 营销盾场景租户信息上传or更新
     * Summary: 营销盾场景租户信息上传or更新
     */
    public ImportUmktSceneUploadResponse importUmktSceneUploadEx(ImportUmktSceneUploadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.scene.upload.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportUmktSceneUploadResponse());
    }

    /**
     * Description: 富信贴尾实时圈客
     * Summary: 富信贴尾实时圈客
     */
    public BatchqueryUmktRtTailmarketingResponse batchqueryUmktRtTailmarketing(BatchqueryUmktRtTailmarketingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryUmktRtTailmarketingEx(request, headers, runtime);
    }

    /**
     * Description: 富信贴尾实时圈客
     * Summary: 富信贴尾实时圈客
     */
    public BatchqueryUmktRtTailmarketingResponse batchqueryUmktRtTailmarketingEx(BatchqueryUmktRtTailmarketingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.tailmarketing.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryUmktRtTailmarketingResponse());
    }

    /**
     * Description: 实时圈客场景策略测试
     * Summary: 实时圈客场景策略测试功能
     */
    public QueryUmktScenestrategyTestResponse queryUmktScenestrategyTest(QueryUmktScenestrategyTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktScenestrategyTestEx(request, headers, runtime);
    }

    /**
     * Description: 实时圈客场景策略测试
     * Summary: 实时圈客场景策略测试功能
     */
    public QueryUmktScenestrategyTestResponse queryUmktScenestrategyTestEx(QueryUmktScenestrategyTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.scenestrategy.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktScenestrategyTestResponse());
    }

    /**
     * Description: 发起AI外呼
     * Summary: 发起AI外呼
     */
    public ApplyUmktRobotcallResponse applyUmktRobotcall(ApplyUmktRobotcallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyUmktRobotcallEx(request, headers, runtime);
    }

    /**
     * Description: 发起AI外呼
     * Summary: 发起AI外呼
     */
    public ApplyUmktRobotcallResponse applyUmktRobotcallEx(ApplyUmktRobotcallRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.robotcall.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyUmktRobotcallResponse());
    }

    /**
     * Description: 营销盾查询回执统计数据接口
     * Summary: 营销盾回执统计查询
     */
    public QueryUmktDataaccessStatisticResponse queryUmktDataaccessStatistic(QueryUmktDataaccessStatisticRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktDataaccessStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 营销盾查询回执统计数据接口
     * Summary: 营销盾回执统计查询
     */
    public QueryUmktDataaccessStatisticResponse queryUmktDataaccessStatisticEx(QueryUmktDataaccessStatisticRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.dataaccess.statistic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktDataaccessStatisticResponse());
    }

    /**
     * Description: 营销盾离线批量任务取消接口
     * Summary: 营销盾取消离线批量任务
     */
    public CancelUmktDataaccessOfflinetaskResponse cancelUmktDataaccessOfflinetask(CancelUmktDataaccessOfflinetaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelUmktDataaccessOfflinetaskEx(request, headers, runtime);
    }

    /**
     * Description: 营销盾离线批量任务取消接口
     * Summary: 营销盾取消离线批量任务
     */
    public CancelUmktDataaccessOfflinetaskResponse cancelUmktDataaccessOfflinetaskEx(CancelUmktDataaccessOfflinetaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.dataaccess.offlinetask.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelUmktDataaccessOfflinetaskResponse());
    }

    /**
     * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
     * Summary: 营销盾实时单一凭证营销接口
     */
    public QueryUmktRtMarketingResponse queryUmktRtMarketing(QueryUmktRtMarketingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktRtMarketingEx(request, headers, runtime);
    }

    /**
     * Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
     * Summary: 营销盾实时单一凭证营销接口
     */
    public QueryUmktRtMarketingResponse queryUmktRtMarketingEx(QueryUmktRtMarketingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.rt.marketing.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktRtMarketingResponse());
    }

    /**
     * Description: 营销盾业务回流事件推送
     * Summary: 营销盾回流事件推送
     */
    public PushUmktBackflowEventResponse pushUmktBackflowEvent(PushUmktBackflowEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushUmktBackflowEventEx(request, headers, runtime);
    }

    /**
     * Description: 营销盾业务回流事件推送
     * Summary: 营销盾回流事件推送
     */
    public PushUmktBackflowEventResponse pushUmktBackflowEventEx(PushUmktBackflowEventRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.backflow.event.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushUmktBackflowEventResponse());
    }

    /**
     * Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口
     */
    public SendUmktCardsmsBatchResponse sendUmktCardsmsBatch(SendUmktCardsmsBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendUmktCardsmsBatchEx(request, headers, runtime);
    }

    /**
     * Description: 卡片短信批量发送接口
     * Summary: 卡片短信批量发送接口
     */
    public SendUmktCardsmsBatchResponse sendUmktCardsmsBatchEx(SendUmktCardsmsBatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.cardsms.batch.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendUmktCardsmsBatchResponse());
    }

    /**
     * Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询
     */
    public QueryUmktCardsmsSupportResponse queryUmktCardsmsSupport(QueryUmktCardsmsSupportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUmktCardsmsSupportEx(request, headers, runtime);
    }

    /**
     * Description: 卡片短信支持能力查询
     * Summary: 卡片短信支持能力查询
     */
    public QueryUmktCardsmsSupportResponse queryUmktCardsmsSupportEx(QueryUmktCardsmsSupportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.umkt.cardsms.support.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUmktCardsmsSupportResponse());
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
