// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.arec.models.*;
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
                    new TeaPair("sdk_version", "1.4.10")
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
     * Description: 发起房产查询
     * Summary: 发起房产查询
     */
    public StartRcpHqResponse startRcpHq(StartRcpHqRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRcpHqEx(request, headers, runtime);
    }

    /**
     * Description: 发起房产查询
     * Summary: 发起房产查询
     */
    public StartRcpHqResponse startRcpHqEx(StartRcpHqRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.hq.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartRcpHqResponse());
    }

    /**
     * Description: 获取房产查询单信息
     * Summary: 获取房产查询单信息
     */
    public GetRcpHqResponse getRcpHq(GetRcpHqRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRcpHqEx(request, headers, runtime);
    }

    /**
     * Description: 获取房产查询单信息
     * Summary: 获取房产查询单信息
     */
    public GetRcpHqResponse getRcpHqEx(GetRcpHqRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.hq.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRcpHqResponse());
    }

    /**
     * Description: 发起解抵押(宁波模式)
     * Summary: 发起解抵押(宁波模式)
     */
    public StartRcpMgrResponse startRcpMgr(StartRcpMgrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRcpMgrEx(request, headers, runtime);
    }

    /**
     * Description: 发起解抵押(宁波模式)
     * Summary: 发起解抵押(宁波模式)
     */
    public StartRcpMgrResponse startRcpMgrEx(StartRcpMgrRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mgr.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartRcpMgrResponse());
    }

    /**
     * Description: 确认解抵押(宁波模式)
     * Summary: 确认解抵押(宁波模式)
     */
    public ConfirmRcpMgrResponse confirmRcpMgr(ConfirmRcpMgrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmRcpMgrEx(request, headers, runtime);
    }

    /**
     * Description: 确认解抵押(宁波模式)
     * Summary: 确认解抵押(宁波模式)
     */
    public ConfirmRcpMgrResponse confirmRcpMgrEx(ConfirmRcpMgrRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mgr.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmRcpMgrResponse());
    }

    /**
     * Description: 查询解抵押单(宁波模式)
     * Summary: 查询解抵押单(宁波模式)
     */
    public GetRcpMgrResponse getRcpMgr(GetRcpMgrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRcpMgrEx(request, headers, runtime);
    }

    /**
     * Description: 查询解抵押单(宁波模式)
     * Summary: 查询解抵押单(宁波模式)
     */
    public GetRcpMgrResponse getRcpMgrEx(GetRcpMgrRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mgr.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRcpMgrResponse());
    }

    /**
     * Description: 房屋抵押贷款业务，发起抵押登记服务
     * Summary: 发起抵押登记
     */
    public StartRcpMgResponse startRcpMg(StartRcpMgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRcpMgEx(request, headers, runtime);
    }

    /**
     * Description: 房屋抵押贷款业务，发起抵押登记服务
     * Summary: 发起抵押登记
     */
    public StartRcpMgResponse startRcpMgEx(StartRcpMgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mg.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartRcpMgResponse());
    }

    /**
     * Description: 根据抵押单号查询抵押单
     * Summary: 查询抵押单
     */
    public GetRcpMgResponse getRcpMg(GetRcpMgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRcpMgEx(request, headers, runtime);
    }

    /**
     * Description: 根据抵押单号查询抵押单
     * Summary: 查询抵押单
     */
    public GetRcpMgResponse getRcpMgEx(GetRcpMgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mg.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRcpMgResponse());
    }

    /**
     * Description: 房屋抵押登记业务，银行确认抵押登记服务
     * Summary: 确认抵押登记
     */
    public ConfirmRcpMgResponse confirmRcpMg(ConfirmRcpMgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmRcpMgEx(request, headers, runtime);
    }

    /**
     * Description: 房屋抵押登记业务，银行确认抵押登记服务
     * Summary: 确认抵押登记
     */
    public ConfirmRcpMgResponse confirmRcpMgEx(ConfirmRcpMgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mg.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmRcpMgResponse());
    }

    /**
     * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
     * Summary: 确认进行预抵押登记
     */
    public InitRcpMgResponse initRcpMg(InitRcpMgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initRcpMgEx(request, headers, runtime);
    }

    /**
     * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
     * Summary: 确认进行预抵押登记
     */
    public InitRcpMgResponse initRcpMgEx(InitRcpMgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mg.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitRcpMgResponse());
    }

    /**
     * Description: 发起抵押(宁波模式)
     * Summary: 发起抵押(宁波模式)
     */
    public StartRcpMgvtwoResponse startRcpMgvtwo(StartRcpMgvtwoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRcpMgvtwoEx(request, headers, runtime);
    }

    /**
     * Description: 发起抵押(宁波模式)
     * Summary: 发起抵押(宁波模式)
     */
    public StartRcpMgvtwoResponse startRcpMgvtwoEx(StartRcpMgvtwoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mgvtwo.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartRcpMgvtwoResponse());
    }

    /**
     * Description: 确认抵押(宁波模式)
     * Summary: 确认抵押(宁波模式)
     */
    public ConfirmRcpMgvtwoResponse confirmRcpMgvtwo(ConfirmRcpMgvtwoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmRcpMgvtwoEx(request, headers, runtime);
    }

    /**
     * Description: 确认抵押(宁波模式)
     * Summary: 确认抵押(宁波模式)
     */
    public ConfirmRcpMgvtwoResponse confirmRcpMgvtwoEx(ConfirmRcpMgvtwoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mgvtwo.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmRcpMgvtwoResponse());
    }

    /**
     * Description: 终止抵押(宁波模式)
     * Summary: 终止抵押(宁波模式)
     */
    public CloseRcpMgvtwoResponse closeRcpMgvtwo(CloseRcpMgvtwoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeRcpMgvtwoEx(request, headers, runtime);
    }

    /**
     * Description: 终止抵押(宁波模式)
     * Summary: 终止抵押(宁波模式)
     */
    public CloseRcpMgvtwoResponse closeRcpMgvtwoEx(CloseRcpMgvtwoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mgvtwo.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseRcpMgvtwoResponse());
    }

    /**
     * Description: 查询抵押单(宁波模式)
     * Summary: 查询抵押单(宁波模式)
     */
    public GetRcpMgvtwoResponse getRcpMgvtwo(GetRcpMgvtwoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRcpMgvtwoEx(request, headers, runtime);
    }

    /**
     * Description: 查询抵押单(宁波模式)
     * Summary: 查询抵押单(宁波模式)
     */
    public GetRcpMgvtwoResponse getRcpMgvtwoEx(GetRcpMgvtwoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.mgvtwo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRcpMgvtwoResponse());
    }

    /**
     * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
     * Summary: 接收不动产中心授权签约列表
     */
    public AuthRcpRtcResponse authRcpRtc(AuthRcpRtcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authRcpRtcEx(request, headers, runtime);
    }

    /**
     * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
     * Summary: 接收不动产中心授权签约列表
     */
    public AuthRcpRtcResponse authRcpRtcEx(AuthRcpRtcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.rtc.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthRcpRtcResponse());
    }

    /**
     * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
     * Summary: 接收不动产中心业务处理结果
     */
    public FinishRcpRtcResponse finishRcpRtc(FinishRcpRtcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishRcpRtcEx(request, headers, runtime);
    }

    /**
     * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
     * Summary: 接收不动产中心业务处理结果
     */
    public FinishRcpRtcResponse finishRcpRtcEx(FinishRcpRtcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.rtc.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishRcpRtcResponse());
    }

    /**
     * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
     * Summary: 通知抵押结果完成(宁波)
     */
    public FinishRcpNingboResponse finishRcpNingbo(FinishRcpNingboRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishRcpNingboEx(request, headers, runtime);
    }

    /**
     * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
     * Summary: 通知抵押结果完成(宁波)
     */
    public FinishRcpNingboResponse finishRcpNingboEx(FinishRcpNingboRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.ningbo.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishRcpNingboResponse());
    }

    /**
     * Description: 通知抵押驳回
     * Summary: 通知抵押驳回(宁波)
     */
    public RefuseRcpNingboResponse refuseRcpNingbo(RefuseRcpNingboRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseRcpNingboEx(request, headers, runtime);
    }

    /**
     * Description: 通知抵押驳回
     * Summary: 通知抵押驳回(宁波)
     */
    public RefuseRcpNingboResponse refuseRcpNingboEx(RefuseRcpNingboRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.rcp.ningbo.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseRcpNingboResponse());
    }

    /**
     * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
     * Summary: 注册企业账户
     */
    public CreateRealtytradeOrgResponse createRealtytradeOrg(CreateRealtytradeOrgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRealtytradeOrgEx(request, headers, runtime);
    }

    /**
     * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
     * Summary: 注册企业账户
     */
    public CreateRealtytradeOrgResponse createRealtytradeOrgEx(CreateRealtytradeOrgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.realtytrade.org.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRealtytradeOrgResponse());
    }

    /**
     * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
     * Summary: 创建企业印章
     */
    public CreateRealtytradeOrgsealResponse createRealtytradeOrgseal(CreateRealtytradeOrgsealRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRealtytradeOrgsealEx(request, headers, runtime);
    }

    /**
     * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
     * Summary: 创建企业印章
     */
    public CreateRealtytradeOrgsealResponse createRealtytradeOrgsealEx(CreateRealtytradeOrgsealRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.realtytrade.orgseal.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRealtytradeOrgsealResponse());
    }

    /**
     * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
     * Summary: 注册个人账户
     */
    public CreateRealtytradePersonalResponse createRealtytradePersonal(CreateRealtytradePersonalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRealtytradePersonalEx(request, headers, runtime);
    }

    /**
     * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
     * Summary: 注册个人账户
     */
    public CreateRealtytradePersonalResponse createRealtytradePersonalEx(CreateRealtytradePersonalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.realtytrade.personal.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRealtytradePersonalResponse());
    }

    /**
     * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
     * Summary: 创建个人图片印章
     */
    public CreateRealtytradePersonalsealResponse createRealtytradePersonalseal(CreateRealtytradePersonalsealRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRealtytradePersonalsealEx(request, headers, runtime);
    }

    /**
     * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
     * Summary: 创建个人图片印章
     */
    public CreateRealtytradePersonalsealResponse createRealtytradePersonalsealEx(CreateRealtytradePersonalsealRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.realtytrade.personalseal.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRealtytradePersonalsealResponse());
    }

    /**
     * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
     * Summary: 发起签署流程
     */
    public StartRealtytradeSigningResponse startRealtytradeSigning(StartRealtytradeSigningRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startRealtytradeSigningEx(request, headers, runtime);
    }

    /**
     * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
     * Summary: 发起签署流程
     */
    public StartRealtytradeSigningResponse startRealtytradeSigningEx(StartRealtytradeSigningRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.realtytrade.signing.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartRealtytradeSigningResponse());
    }

    /**
     * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
     * Summary: 查看签署流程
     */
    public QueryRealtytradeSigningResponse queryRealtytradeSigning(QueryRealtytradeSigningRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRealtytradeSigningEx(request, headers, runtime);
    }

    /**
     * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
     * Summary: 查看签署流程
     */
    public QueryRealtytradeSigningResponse queryRealtytradeSigningEx(QueryRealtytradeSigningRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.arec.realtytrade.signing.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRealtytradeSigningResponse());
    }
}
