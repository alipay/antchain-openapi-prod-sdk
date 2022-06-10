// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.bbp.models.*;
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
                    new TeaPair("sdk_version", "1.7.10")
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
     * Description: 对企业/个人进行身份认证
     * Summary: 统一客户认证接口
     */
    public AuthCustomerResponse authCustomer(AuthCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 对企业/个人进行身份认证
     * Summary: 统一客户认证接口
     */
    public AuthCustomerResponse authCustomerEx(AuthCustomerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.customer.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthCustomerResponse());
    }

    /**
     * Description: 智科统一客户注册
     * Summary: 统一客户注册接口
     */
    public CreateCustomerResponse createCustomer(CreateCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 智科统一客户注册
     * Summary: 统一客户注册接口
     */
    public CreateCustomerResponse createCustomerEx(CreateCustomerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.customer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCustomerResponse());
    }

    /**
     * Description: 客户信息查询
     * Summary: 客户信息查询
     */
    public QueryCustomerResponse queryCustomer(QueryCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 客户信息查询
     * Summary: 客户信息查询
     */
    public QueryCustomerResponse queryCustomerEx(QueryCustomerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.customer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCustomerResponse());
    }

    /**
     * Description: 核身初始化接口
     * Summary: 核身初始化接口
     */
    public InitVerifyResponse initVerify(InitVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initVerifyEx(request, headers, runtime);
    }

    /**
     * Description: 核身初始化接口
     * Summary: 核身初始化接口
     */
    public InitVerifyResponse initVerifyEx(InitVerifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.verify.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitVerifyResponse());
    }

    /**
     * Description: 核身产品渲染接口
     * Summary: 核身产品渲染接口
     */
    public StartVerifyResponse startVerify(StartVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startVerifyEx(request, headers, runtime);
    }

    /**
     * Description: 核身产品渲染接口
     * Summary: 核身产品渲染接口
     */
    public StartVerifyResponse startVerifyEx(StartVerifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.verify.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartVerifyResponse());
    }

    /**
     * Description: 核身结果查询
     * Summary: 核身结果查询
     */
    public CheckVerifyResponse checkVerify(CheckVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkVerifyEx(request, headers, runtime);
    }

    /**
     * Description: 核身结果查询
     * Summary: 核身结果查询
     */
    public CheckVerifyResponse checkVerifyEx(CheckVerifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.verify.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckVerifyResponse());
    }

    /**
     * Description: 对企业身份进行认证
     * Summary: 企业四要素认证
     */
    public VerifyMetaResponse verifyMeta(VerifyMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyMetaEx(request, headers, runtime);
    }

    /**
     * Description: 对企业身份进行认证
     * Summary: 企业四要素认证
     */
    public VerifyMetaResponse verifyMetaEx(VerifyMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.meta.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyMetaResponse());
    }

    /**
     * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
     * Summary: 外包薪资规则合约发布接口
     */
    public ApplyContractRuleResponse applyContractRule(ApplyContractRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyContractRuleEx(request, headers, runtime);
    }

    /**
     * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
     * Summary: 外包薪资规则合约发布接口
     */
    public ApplyContractRuleResponse applyContractRuleEx(ApplyContractRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.contract.rule.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyContractRuleResponse());
    }

    /**
     * Description: 调用链上合约接口，查询外包的薪资方案
    
     * Summary: 外包薪资规则合约查询接口
     */
    public GetContractRuleResponse getContractRule(GetContractRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractRuleEx(request, headers, runtime);
    }

    /**
     * Description: 调用链上合约接口，查询外包的薪资方案
    
     * Summary: 外包薪资规则合约查询接口
     */
    public GetContractRuleResponse getContractRuleEx(GetContractRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.contract.rule.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractRuleResponse());
    }

    /**
     * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
     * Summary: 长城汽车的考勤信息上传接口
     */
    public UploadStaffAttendanceResponse uploadStaffAttendance(UploadStaffAttendanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadStaffAttendanceEx(request, headers, runtime);
    }

    /**
     * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
     * Summary: 长城汽车的考勤信息上传接口
     */
    public UploadStaffAttendanceResponse uploadStaffAttendanceEx(UploadStaffAttendanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.staff.attendance.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadStaffAttendanceResponse());
    }

    /**
     * Description: 基于人的维度，入参：{用户id,考勤月份}
     * Summary: 长城汽车的考勤信息获取
     */
    public QueryStaffAttendanceResponse queryStaffAttendance(QueryStaffAttendanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStaffAttendanceEx(request, headers, runtime);
    }

    /**
     * Description: 基于人的维度，入参：{用户id,考勤月份}
     * Summary: 长城汽车的考勤信息获取
     */
    public QueryStaffAttendanceResponse queryStaffAttendanceEx(QueryStaffAttendanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.staff.attendance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStaffAttendanceResponse());
    }

    /**
     * Description: 长城汽车的考核信息
     * Summary: 长城汽车的考核信息
     */
    public UploadStaffAssessmentResponse uploadStaffAssessment(UploadStaffAssessmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadStaffAssessmentEx(request, headers, runtime);
    }

    /**
     * Description: 长城汽车的考核信息
     * Summary: 长城汽车的考核信息
     */
    public UploadStaffAssessmentResponse uploadStaffAssessmentEx(UploadStaffAssessmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.staff.assessment.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadStaffAssessmentResponse());
    }

    /**
     * Description: 考核信息查询
     * Summary: 考核信息查询
     */
    public QueryStaffAssessmentResponse queryStaffAssessment(QueryStaffAssessmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStaffAssessmentEx(request, headers, runtime);
    }

    /**
     * Description: 考核信息查询
     * Summary: 考核信息查询
     */
    public QueryStaffAssessmentResponse queryStaffAssessmentEx(QueryStaffAssessmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.staff.assessment.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStaffAssessmentResponse());
    }

    /**
     * Description: 对账单执行
     * Summary: 对账单执行接口
     */
    public ExecContractReconciliationResponse execContractReconciliation(ExecContractReconciliationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractReconciliationEx(request, headers, runtime);
    }

    /**
     * Description: 对账单执行
     * Summary: 对账单执行接口
     */
    public ExecContractReconciliationResponse execContractReconciliationEx(ExecContractReconciliationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.contract.reconciliation.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractReconciliationResponse());
    }

    /**
     * Description: 结算单确认
     * Summary: 结算单确认
     */
    public ConfirmContractReconciliationResponse confirmContractReconciliation(ConfirmContractReconciliationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmContractReconciliationEx(request, headers, runtime);
    }

    /**
     * Description: 结算单确认
     * Summary: 结算单确认
     */
    public ConfirmContractReconciliationResponse confirmContractReconciliationEx(ConfirmContractReconciliationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.contract.reconciliation.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmContractReconciliationResponse());
    }

    /**
     * Description: 查询结算单
     * Summary: 查询结算单
     */
    public QueryContractReconciliationResponse queryContractReconciliation(QueryContractReconciliationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractReconciliationEx(request, headers, runtime);
    }

    /**
     * Description: 查询结算单
     * Summary: 查询结算单
     */
    public QueryContractReconciliationResponse queryContractReconciliationEx(QueryContractReconciliationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.contract.reconciliation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractReconciliationResponse());
    }

    /**
     * Description: 记录用户登录保司小程序信息
     * Summary: 用户登陆页面埋点
     */
    public InitInsuranceUserResponse initInsuranceUser(InitInsuranceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initInsuranceUserEx(request, headers, runtime);
    }

    /**
     * Description: 记录用户登录保司小程序信息
     * Summary: 用户登陆页面埋点
     */
    public InitInsuranceUserResponse initInsuranceUserEx(InitInsuranceUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitInsuranceUserResponse());
    }

    /**
     * Description: 保司方获取授权信息
     * Summary: 获取授权信息
     */
    public QueryInsuranceResponse queryInsurance(QueryInsuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInsuranceEx(request, headers, runtime);
    }

    /**
     * Description: 保司方获取授权信息
     * Summary: 获取授权信息
     */
    public QueryInsuranceResponse queryInsuranceEx(QueryInsuranceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInsuranceResponse());
    }

    /**
     * Description: 保单信息上链，保单信息同步
     * Summary: 保单信息上链
     */
    public OperateInsuranceResponse operateInsurance(OperateInsuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateInsuranceEx(request, headers, runtime);
    }

    /**
     * Description: 保单信息上链，保单信息同步
     * Summary: 保单信息上链
     */
    public OperateInsuranceResponse operateInsuranceEx(OperateInsuranceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateInsuranceResponse());
    }

    /**
     * Description: 上传保单附件至阿里云OSS
     * Summary: 上传保单附件
     */
    public UploadInsuranceResponse uploadInsurance(UploadInsuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadInsuranceEx(request, headers, runtime);
    }

    /**
     * Description: 上传保单附件至阿里云OSS
     * Summary: 上传保单附件
     */
    public UploadInsuranceResponse uploadInsuranceEx(UploadInsuranceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.bbp.insurance.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadInsuranceResponse uploadInsuranceResponse = UploadInsuranceResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadInsuranceResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadInsuranceResponse());
    }

    /**
     * Description: 保险理赔受理信息同步到蚂蚁链
     * Summary: 理赔受理上链
     */
    public SyncInsuranceResponse syncInsurance(SyncInsuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInsuranceEx(request, headers, runtime);
    }

    /**
     * Description: 保险理赔受理信息同步到蚂蚁链
     * Summary: 理赔受理上链
     */
    public SyncInsuranceResponse syncInsuranceEx(SyncInsuranceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInsuranceResponse());
    }

    /**
     * Description: 同步用户退保信息上链
     * Summary: 保单退保接口
     */
    public CancelInsuranceResponse cancelInsurance(CancelInsuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelInsuranceEx(request, headers, runtime);
    }

    /**
     * Description: 同步用户退保信息上链
     * Summary: 保单退保接口
     */
    public CancelInsuranceResponse cancelInsuranceEx(CancelInsuranceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.bbp.insurance.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelInsuranceResponse());
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
