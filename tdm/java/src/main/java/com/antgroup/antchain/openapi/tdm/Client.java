// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.tdm.models.*;
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
                    new TeaPair("sdk_version", "1.0.15")
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
     * Description: 公积金证明开具接口
     * Summary: 公积金证明开具接口
     */
    public OpenCpfCertResponse openCpfCert(OpenCpfCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openCpfCertEx(request, headers, runtime);
    }

    /**
     * Description: 公积金证明开具接口
     * Summary: 公积金证明开具接口
     */
    public OpenCpfCertResponse openCpfCertEx(OpenCpfCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.cert.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenCpfCertResponse());
    }

    /**
     * Description: 证明列表查询接口
     * Summary: 证明列表查询接口
     */
    public ListCpfCertResponse listCpfCert(ListCpfCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCpfCertEx(request, headers, runtime);
    }

    /**
     * Description: 证明列表查询接口
     * Summary: 证明列表查询接口
     */
    public ListCpfCertResponse listCpfCertEx(ListCpfCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.cert.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCpfCertResponse());
    }

    /**
     * Description: 扫码验真
     * Summary: 扫码验真
     */
    public CheckCpfCertResponse checkCpfCert(CheckCpfCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCpfCertEx(request, headers, runtime);
    }

    /**
     * Description: 扫码验真
     * Summary: 扫码验真
     */
    public CheckCpfCertResponse checkCpfCertEx(CheckCpfCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.cert.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCpfCertResponse());
    }

    /**
     * Description: 证明使用记录保存
     * Summary: 证明使用记录保存
     */
    public SaveCpfCertuseResponse saveCpfCertuse(SaveCpfCertuseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveCpfCertuseEx(request, headers, runtime);
    }

    /**
     * Description: 证明使用记录保存
     * Summary: 证明使用记录保存
     */
    public SaveCpfCertuseResponse saveCpfCertuseEx(SaveCpfCertuseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.certuse.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveCpfCertuseResponse());
    }

    /**
     * Description: 机构扫码用证
     * Summary: 扫码用证接口
     */
    public GetCpfCertuseResponse getCpfCertuse(GetCpfCertuseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCpfCertuseEx(request, headers, runtime);
    }

    /**
     * Description: 机构扫码用证
     * Summary: 扫码用证接口
     */
    public GetCpfCertuseResponse getCpfCertuseEx(GetCpfCertuseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.certuse.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCpfCertuseResponse());
    }

    /**
     * Description: 已开具证明查询
     * Summary: 已开具证明查询
     */
    public GetCpfCertResponse getCpfCert(GetCpfCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCpfCertEx(request, headers, runtime);
    }

    /**
     * Description: 已开具证明查询
     * Summary: 已开具证明查询
     */
    public GetCpfCertResponse getCpfCertEx(GetCpfCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.cert.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCpfCertResponse());
    }

    /**
     * Description: 证明使用记录查询
     * Summary: 证明使用记录查询
     */
    public ListCpfCertuseResponse listCpfCertuse(ListCpfCertuseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCpfCertuseEx(request, headers, runtime);
    }

    /**
     * Description: 证明使用记录查询
     * Summary: 证明使用记录查询
     */
    public ListCpfCertuseResponse listCpfCertuseEx(ListCpfCertuseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.certuse.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCpfCertuseResponse());
    }

    /**
     * Description: 机构获取用户公积金数据（授权、用数分离时接口）
     * Summary: 数据使用
     */
    public GetCpfDataResponse getCpfData(GetCpfDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCpfDataEx(request, headers, runtime);
    }

    /**
     * Description: 机构获取用户公积金数据（授权、用数分离时接口）
     * Summary: 数据使用
     */
    public GetCpfDataResponse getCpfDataEx(GetCpfDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.data.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCpfDataResponse());
    }

    /**
     * Description: 机构用数记录查询
     * Summary: 数据使用记录查询
     */
    public ListCpfDatauseResponse listCpfDatause(ListCpfDatauseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCpfDatauseEx(request, headers, runtime);
    }

    /**
     * Description: 机构用数记录查询
     * Summary: 数据使用记录查询
     */
    public ListCpfDatauseResponse listCpfDatauseEx(ListCpfDatauseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.datause.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCpfDatauseResponse());
    }

    /**
     * Description: 查询用户在公积金中心的个人账户、贷款合同信息
     * Summary: 公积金中心用户信息查询
     */
    public QueryCpfUserResponse queryCpfUser(QueryCpfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCpfUserEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户在公积金中心的个人账户、贷款合同信息
     * Summary: 公积金中心用户信息查询
     */
    public QueryCpfUserResponse queryCpfUserEx(QueryCpfUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.cpf.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCpfUserResponse());
    }

    /**
     * Description: 可信数据流转授权
     * Summary: 授权
     */
    public ExecAuthResponse execAuth(ExecAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAuthEx(request, headers, runtime);
    }

    /**
     * Description: 可信数据流转授权
     * Summary: 授权
     */
    public ExecAuthResponse execAuthEx(ExecAuthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.auth.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAuthResponse());
    }

    /**
     * Description: 取消授权
     * Summary: 取消授权
     */
    public CancelAuthResponse cancelAuth(CancelAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAuthEx(request, headers, runtime);
    }

    /**
     * Description: 取消授权
     * Summary: 取消授权
     */
    public CancelAuthResponse cancelAuthEx(CancelAuthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.auth.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAuthResponse());
    }

    /**
     * Description: 用权
     * Summary: 用权
     */
    public QueryAuthResponse queryAuth(QueryAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthEx(request, headers, runtime);
    }

    /**
     * Description: 用权
     * Summary: 用权
     */
    public QueryAuthResponse queryAuthEx(QueryAuthRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.auth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthResponse());
    }

    /**
     * Description: 授权记录查询（个人授权记录查询）
     * Summary: 授权记录查询
     */
    public QueryAuthOwnerResponse queryAuthOwner(QueryAuthOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthOwnerEx(request, headers, runtime);
    }

    /**
     * Description: 授权记录查询（个人授权记录查询）
     * Summary: 授权记录查询
     */
    public QueryAuthOwnerResponse queryAuthOwnerEx(QueryAuthOwnerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.auth.owner.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthOwnerResponse());
    }

    /**
     * Description: 授权使用记录查询（个人查询维度）
     * Summary: 授权使用记录查询
     */
    public QueryAuthuseOwnerResponse queryAuthuseOwner(QueryAuthuseOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthuseOwnerEx(request, headers, runtime);
    }

    /**
     * Description: 授权使用记录查询（个人查询维度）
     * Summary: 授权使用记录查询
     */
    public QueryAuthuseOwnerResponse queryAuthuseOwnerEx(QueryAuthuseOwnerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.authuse.owner.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthuseOwnerResponse());
    }

    /**
     * Description: 授权数据使用
     * Summary: 授权数据使用
     */
    public ExecAuthuseResponse execAuthuse(ExecAuthuseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAuthuseEx(request, headers, runtime);
    }

    /**
     * Description: 授权数据使用
     * Summary: 授权数据使用
     */
    public ExecAuthuseResponse execAuthuseEx(ExecAuthuseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.authuse.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAuthuseResponse());
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
        return TeaModel.toModel(this.doRequest("1.0", "antchain.tdm.verify.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitVerifyResponse());
    }
}
