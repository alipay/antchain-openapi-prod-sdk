// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.demo.models.*;
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
                    new TeaPair("sdk_version", "1.0.90")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "centre-openapi.antchain.antgroup.com")),
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
     * Description: 123
     * Summary: 123
     */
    public BindQweQweResponse bindQweQwe(BindQweQweRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindQweQweEx(request, headers, runtime);
    }

    /**
     * Description: 123
     * Summary: 123
     */
    public BindQweQweResponse bindQweQweEx(BindQweQweRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.qwe.qwe.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindQweQweResponse());
    }

    /**
     * Description: sdf
     * Summary: sdf
     */
    public BindSdfSssSssResponse bindSdfSssSss(BindSdfSssSssRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindSdfSssSssEx(request, headers, runtime);
    }

    /**
     * Description: sdf
     * Summary: sdf
     */
    public BindSdfSssSssResponse bindSdfSssSssEx(BindSdfSssSssRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.sdf.sss.sss.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindSdfSssSssResponse());
    }

    /**
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     */
    public StatusGatewayCheckResponse statusGatewayCheck(StatusGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.statusGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: Demo接口，返回当前服务器当前状态1
     * Summary: 检查服务状态
     */
    public StatusGatewayCheckResponse statusGatewayCheckEx(StatusGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StatusGatewayCheckResponse());
    }

    /**
     * Description: Demo接口，返回当输入的值
    测试下
     * Summary: 返回输入值
     */
    public EchoGatewayCheckResponse echoGatewayCheck(EchoGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.echoGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: Demo接口，返回当输入的值
    测试下
     * Summary: 返回输入值
     */
    public EchoGatewayCheckResponse echoGatewayCheckEx(EchoGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "demo.gateway.check.echo"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "OK")) {
                EchoGatewayCheckResponse echoGatewayCheckResponse = EchoGatewayCheckResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return echoGatewayCheckResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echo", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EchoGatewayCheckResponse());
    }

    /**
     * Description: ceshi
     * Summary: ss
     */
    public QueryGatewayCheckResponse queryGatewayCheck(QueryGatewayCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEx(request, headers, runtime);
    }

    /**
     * Description: ceshi
     * Summary: ss
     */
    public QueryGatewayCheckResponse queryGatewayCheckEx(QueryGatewayCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckResponse());
    }

    /**
     * Description: 测试用aaa
     * Summary: 测试001
     */
    public QueryGatewayTestResponse queryGatewayTest(QueryGatewayTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayTestEx(request, headers, runtime);
    }

    /**
     * Description: 测试用aaa
     * Summary: 测试001
     */
    public QueryGatewayTestResponse queryGatewayTestEx(QueryGatewayTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayTestResponse());
    }

    /**
     * Description: sss
     * Summary: ss
     */
    public BindSssSsSsResponse bindSssSsSs(BindSssSsSsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindSssSsSsEx(request, headers, runtime);
    }

    /**
     * Description: sss
     * Summary: ss
     */
    public BindSssSsSsResponse bindSssSsSsEx(BindSssSsSsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.sss.ss.ss.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindSssSsSsResponse());
    }

    /**
     * Description: aaa
     * Summary: 测试demo
     */
    public QueryGatewayMyResponse queryGatewayMy(QueryGatewayMyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayMyEx(request, headers, runtime);
    }

    /**
     * Description: aaa
     * Summary: 测试demo
     */
    public QueryGatewayMyResponse queryGatewayMyEx(QueryGatewayMyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.my.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayMyResponse());
    }

    /**
     * Description: s
     * Summary: ss
     */
    public BindDemoCheckEeeResponse bindDemoCheckEee(BindDemoCheckEeeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindDemoCheckEeeEx(request, headers, runtime);
    }

    /**
     * Description: s
     * Summary: ss
     */
    public BindDemoCheckEeeResponse bindDemoCheckEeeEx(BindDemoCheckEeeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.demo.check.eee.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindDemoCheckEeeResponse());
    }

    /**
     * Description: test
     * Summary: test
     */
    public BindGatewayAbcTestResponse bindGatewayAbcTest(BindGatewayAbcTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindGatewayAbcTestEx(request, headers, runtime);
    }

    /**
     * Description: test
     * Summary: test
     */
    public BindGatewayAbcTestResponse bindGatewayAbcTestEx(BindGatewayAbcTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.abc.test.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindGatewayAbcTestResponse());
    }

    /**
     * Description: testaaa
     * Summary: test
     */
    public BindTestTestTestResponse bindTestTestTest(BindTestTestTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindTestTestTestEx(request, headers, runtime);
    }

    /**
     * Description: testaaa
     * Summary: test
     */
    public BindTestTestTestResponse bindTestTestTestEx(BindTestTestTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.test.test.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindTestTestTestResponse());
    }

    /**
     * Description: 超时测试
     * Summary: 超时
     */
    public QueryGatewayCheckEchotimeoutResponse queryGatewayCheckEchotimeout(QueryGatewayCheckEchotimeoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotimeoutEx(request, headers, runtime);
    }

    /**
     * Description: 超时测试
     * Summary: 超时
     */
    public QueryGatewayCheckEchotimeoutResponse queryGatewayCheckEchotimeoutEx(QueryGatewayCheckEchotimeoutRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotimeoutResponse());
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s
     */
    public QueryGatewayCheckEchotenResponse queryGatewayCheckEchoten(QueryGatewayCheckEchotenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayCheckEchotenEx(request, headers, runtime);
    }

    /**
     * Description: 10  测测aa
     * Summary: 10s
     */
    public QueryGatewayCheckEchotenResponse queryGatewayCheckEchotenEx(QueryGatewayCheckEchotenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayCheckEchotenResponse());
    }

    /**
     * Description: asd
     * Summary: asd
     */
    public QueryAdAsdAsdResponse queryAdAsdAsd(QueryAdAsdAsdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAdAsdAsdEx(request, headers, runtime);
    }

    /**
     * Description: asd
     * Summary: asd
     */
    public QueryAdAsdAsdResponse queryAdAsdAsdEx(QueryAdAsdAsdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAdAsdAsdResponse());
    }

    /**
     * Description: asd
     * Summary: asd
     */
    public BindAsdAsdAsdResponse bindAsdAsdAsd(BindAsdAsdAsdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAsdAsdAsdEx(request, headers, runtime);
    }

    /**
     * Description: asd
     * Summary: asd
     */
    public BindAsdAsdAsdResponse bindAsdAsdAsdEx(BindAsdAsdAsdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.asd.asd.asd.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAsdAsdAsdResponse());
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点
     */
    public InitBbpInsuranceUserResponse initBbpInsuranceUser(InitBbpInsuranceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initBbpInsuranceUserEx(request, headers, runtime);
    }

    /**
     * Description: 保司用户埋点信息
     * Summary: 用户登陆页面埋点
     */
    public InitBbpInsuranceUserResponse initBbpInsuranceUserEx(InitBbpInsuranceUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitBbpInsuranceUserResponse());
    }

    /**
     * Description: 测试添加api
     * Summary: 测试用api
     */
    public QueryTestTestobjectBbbResponse queryTestTestobjectBbb(QueryTestTestobjectBbbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestTestobjectBbbEx(request, headers, runtime);
    }

    /**
     * Description: 测试添加api
     * Summary: 测试用api
     */
    public QueryTestTestobjectBbbResponse queryTestTestobjectBbbEx(QueryTestTestobjectBbbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.testobject.bbb.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestTestobjectBbbResponse());
    }

    /**
     * Description: 测试使用
     * Summary: 测试创建
     */
    public QueryTestGatewayTestResponse queryTestGatewayTest(QueryTestGatewayTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestGatewayTestEx(request, headers, runtime);
    }

    /**
     * Description: 测试使用
     * Summary: 测试创建
     */
    public QueryTestGatewayTestResponse queryTestGatewayTestEx(QueryTestGatewayTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.gateway.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestGatewayTestResponse());
    }

    /**
     * Description: 自动化测试创建，用于测试新建&修改功能
     * Summary: 自动化测试创建，用于测试新建&修改功能
     */
    public BindAaaBbbCccResponse bindAaaBbbCcc(BindAaaBbbCccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建，用于测试新建&修改功能
     * Summary: 自动化测试创建，用于测试新建&修改功能
     */
    public BindAaaBbbCccResponse bindAaaBbbCccEx(BindAaaBbbCccRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAaaBbbCccResponse());
    }

    /**
     * Description: 自动化测试创建1
     * Summary: 自动化测试创建（勿动）
     */
    public QueryAaaBbbCccResponse queryAaaBbbCcc(QueryAaaBbbCccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAaaBbbCccEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建1
     * Summary: 自动化测试创建（勿动）
     */
    public QueryAaaBbbCccResponse queryAaaBbbCccEx(QueryAaaBbbCccRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.aaa.bbb.ccc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAaaBbbCccResponse());
    }

    /**
     * Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动
     */
    public QueryAbcAbcAbcResponse queryAbcAbcAbc(QueryAbcAbcAbcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAbcAbcAbcEx(request, headers, runtime);
    }

    /**
     * Description: 自动化测试创建,用于测试API的修改
     * Summary: 自动化测试创建,用于测试API的修改勿动
     */
    public QueryAbcAbcAbcResponse queryAbcAbcAbcEx(QueryAbcAbcAbcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAbcAbcAbcResponse());
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
