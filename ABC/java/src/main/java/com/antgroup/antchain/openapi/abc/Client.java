// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.abc.models.*;

public class Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

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
     * <b>description</b> :
     * <p>Init client with Config</p>
     * 
     * @param config config contains the necessary information to create a client
     */
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(config)) {
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

    /**
     * <b>description</b> :
     * <p>Encapsulate the request and invoke the network</p>
     * 
     * @param action api name
     * @param protocol http or https
     * @param method e.g. GET
     * @param pathname pathname of every api
     * @param request which contains request params
     * @param runtime which controls some details of call api, such as retry times
     * @return the response
     */
    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
                    new TeaPair("sdk_version", "1.0.36"),
                    new TeaPair("_prod_code", "ABC"),
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
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

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

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public QueryAlltestOneResponse queryAlltestOne(QueryAlltestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlltestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public QueryAlltestOneResponse queryAlltestOneEx(QueryAlltestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.alltest.one.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlltestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ImportAlltestOneResponse importAlltestOne(ImportAlltestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importAlltestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ImportAlltestOneResponse importAlltestOneEx(ImportAlltestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.alltest.one.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportAlltestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public StabilizeAlltestOneResponse stabilizeAlltestOne(StabilizeAlltestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stabilizeAlltestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public StabilizeAlltestOneResponse stabilizeAlltestOneEx(StabilizeAlltestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.alltest.one.stabilize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StabilizeAlltestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public UnstabilizeAlltestOneResponse unstabilizeAlltestOne(UnstabilizeAlltestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unstabilizeAlltestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public UnstabilizeAlltestOneResponse unstabilizeAlltestOneEx(UnstabilizeAlltestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.alltest.one.unstabilize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnstabilizeAlltestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试AAA
     * Summary: 个人工作台测试AAA</p>
     */
    public QueryAlltestTwoResponse queryAlltestTwo(QueryAlltestTwoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlltestTwoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台测试AAA
     * Summary: 个人工作台测试AAA</p>
     */
    public QueryAlltestTwoResponse queryAlltestTwoEx(QueryAlltestTwoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.alltest.two.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAlltestTwoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 录入演示111
     * Summary: 录入演示API</p>
     */
    public PreviewDemoResponse previewDemo(PreviewDemoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewDemoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 录入演示111
     * Summary: 录入演示API</p>
     */
    public PreviewDemoResponse previewDemoEx(PreviewDemoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.abc.demo.preview"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                PreviewDemoResponse previewDemoResponse = PreviewDemoResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return previewDemoResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.demo.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewDemoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试导入api1
     * Summary: 测试导入api1</p>
     */
    public QueryGatewayResponse queryGateway(QueryGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试导入api1
     * Summary: 测试导入api1</p>
     */
    public QueryGatewayResponse queryGatewayEx(QueryGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.gateway.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调试a s dddd
     * Summary: 调试1</p>
     */
    public QueryAbcdaAbcddaaResponse queryAbcdaAbcddaa(QueryAbcdaAbcddaaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAbcdaAbcddaaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调试a s dddd
     * Summary: 调试1</p>
     */
    public QueryAbcdaAbcddaaResponse queryAbcdaAbcddaaEx(QueryAbcdaAbcddaaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.abcda.abcddaa.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAbcdaAbcddaaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试大安全接口
     * Summary: 测试大安全接口</p>
     */
    public MatchSecurityFaceResponse matchSecurityFace(MatchSecurityFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchSecurityFaceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试大安全接口
     * Summary: 测试大安全接口</p>
     */
    public MatchSecurityFaceResponse matchSecurityFaceEx(MatchSecurityFaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.security.face.match", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MatchSecurityFaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件上传测试接口
     * Summary: 文件上传测试接口</p>
     */
    public UploadTestFileResponse uploadTestFile(UploadTestFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadTestFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件上传测试接口
     * Summary: 文件上传测试接口</p>
     */
    public UploadTestFileResponse uploadTestFileEx(UploadTestFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.abc.test.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadTestFileResponse uploadTestFileResponse = UploadTestFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadTestFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadTestFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口1
     * Summary: 压测接口1</p>
     */
    public QueryTimeOneResponse queryTimeOne(QueryTimeOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTimeOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口1
     * Summary: 压测接口1</p>
     */
    public QueryTimeOneResponse queryTimeOneEx(QueryTimeOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.time.one.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTimeOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口2
     * Summary: 压测接口2</p>
     */
    public QueryTimeTwoResponse queryTimeTwo(QueryTimeTwoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTimeTwoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口2
     * Summary: 压测接口2</p>
     */
    public QueryTimeTwoResponse queryTimeTwoEx(QueryTimeTwoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.time.two.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTimeTwoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口3
     * Summary: 压测接口3</p>
     */
    public QueryTimeThreeResponse queryTimeThree(QueryTimeThreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTimeThreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口3
     * Summary: 压测接口3</p>
     */
    public QueryTimeThreeResponse queryTimeThreeEx(QueryTimeThreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.time.three.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTimeThreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口4
     * Summary: 压测接口4</p>
     */
    public QueryTimeFourResponse queryTimeFour(QueryTimeFourRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTimeFourEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口4
     * Summary: 压测接口4</p>
     */
    public QueryTimeFourResponse queryTimeFourEx(QueryTimeFourRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.time.four.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTimeFourResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口5
     * Summary: 压测接口5</p>
     */
    public QueryTimeFiveResponse queryTimeFive(QueryTimeFiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTimeFiveEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 压测接口5
     * Summary: 压测接口5</p>
     */
    public QueryTimeFiveResponse queryTimeFiveEx(QueryTimeFiveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.time.five.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTimeFiveResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aaa
     * Summary: aaa</p>
     */
    public CccAaaBbbResponse cccAaaBbb(CccAaaBbbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cccAaaBbbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aaa
     * Summary: aaa</p>
     */
    public CccAaaBbbResponse cccAaaBbbEx(CccAaaBbbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.aaa.bbb.ccc", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CccAaaBbbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 已有产品创建api
     * Summary: 已有产品创建api</p>
     */
    public CreateapiExistingProductsResponse createapiExistingProducts(CreateapiExistingProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createapiExistingProductsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 已有产品创建api
     * Summary: 已有产品创建api</p>
     */
    public CreateapiExistingProductsResponse createapiExistingProductsEx(CreateapiExistingProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.existing.products.createapi", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateapiExistingProductsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 已有产品下创建的api
     * Summary: 已有产品下创建的api</p>
     */
    public APreCreateApiResponse aPreCreateApi(APreCreateApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aPreCreateApiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 已有产品下创建的api
     * Summary: 已有产品下创建的api</p>
     */
    public APreCreateApiResponse aPreCreateApiEx(APreCreateApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.pre.create.api.a", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new APreCreateApiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用api
     * Summary: 测试使用api</p>
     */
    public ApiTestCreateResponse apiTestCreate(ApiTestCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiTestCreateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用api
     * Summary: 测试使用api</p>
     */
    public ApiTestCreateResponse apiTestCreateEx(ApiTestCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.create.api", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApiTestCreateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323</p>
     */
    public QueryApprovalTestResponse queryApprovalTest(QueryApprovalTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApprovalTestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于测试api评审接入SDL/修改后的评审/0323
     * Summary: 用于测试api评审接入SDL/修改后的评审/0323</p>
     */
    public QueryApprovalTestResponse queryApprovalTestEx(QueryApprovalTestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.approval.test.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApprovalTestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 1
     * Summary: 1</p>
     */
    public AzxdAzsxResponse azxdAzsx(AzxdAzsxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.azxdAzsxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 1
     * Summary: 1</p>
     */
    public AzxdAzsxResponse azxdAzsxEx(AzxdAzsxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.azsx.azxd", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AzxdAzsxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 钟忆个人工作台预发测试1
     * Summary: 钟忆个人工作台预发测试1</p>
     */
    public QueryTestOneResponse queryTestOne(QueryTestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 钟忆个人工作台预发测试1
     * Summary: 钟忆个人工作台预发测试1</p>
     */
    public QueryTestOneResponse queryTestOneEx(QueryTestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.one.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ImportTestOneResponse importTestOne(ImportTestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importTestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ImportTestOneResponse importTestOneEx(ImportTestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.one.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportTestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public StabilizeTestOneResponse stabilizeTestOne(StabilizeTestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stabilizeTestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public StabilizeTestOneResponse stabilizeTestOneEx(StabilizeTestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.one.stabilize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StabilizeTestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public CaptureTestOneResponse captureTestOne(CaptureTestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.captureTestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public CaptureTestOneResponse captureTestOneEx(CaptureTestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.one.capture", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CaptureTestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public MatchTestOneResponse matchTestOne(MatchTestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchTestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public MatchTestOneResponse matchTestOneEx(MatchTestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.one.match", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new MatchTestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public OperateTestOneResponse operateTestOne(OperateTestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateTestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public OperateTestOneResponse operateTestOneEx(OperateTestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.one.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateTestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台新增接口测试
     * Summary: 个人工作台新增接口测试</p>
     */
    public TimeTestOneResponse timeTestOne(TimeTestOneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.timeTestOneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台新增接口测试
     * Summary: 个人工作台新增接口测试</p>
     */
    public TimeTestOneResponse timeTestOneEx(TimeTestOneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.test.one.time", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TimeTestOneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
     * Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</p>
     */
    public QueryOneLimitResponse queryOneLimit(QueryOneLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOneLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
     * Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</p>
     */
    public QueryOneLimitResponse queryOneLimitEx(QueryOneLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.one.limit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOneLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ImportOneLimitResponse importOneLimit(ImportOneLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importOneLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ImportOneLimitResponse importOneLimitEx(ImportOneLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.one.limit.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportOneLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public StabilizeOneLimitResponse stabilizeOneLimit(StabilizeOneLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stabilizeOneLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public StabilizeOneLimitResponse stabilizeOneLimitEx(StabilizeOneLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.one.limit.stabilize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StabilizeOneLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口</p>
     */
    public UnstabilizeOneLimitResponse unstabilizeOneLimit(UnstabilizeOneLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unstabilizeOneLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期测试接口
     * Summary: 个人工作台二期测试接口</p>
     */
    public UnstabilizeOneLimitResponse unstabilizeOneLimitEx(UnstabilizeOneLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.one.limit.unstabilize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnstabilizeOneLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ResetOneLimitResponse resetOneLimit(ResetOneLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetOneLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public ResetOneLimitResponse resetOneLimitEx(ResetOneLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.one.limit.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetOneLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public WithdrawOneLimitResponse withdrawOneLimit(WithdrawOneLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.withdrawOneLimitEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人工作台二期预发测试
     * Summary: 个人工作台二期预发测试</p>
     */
    public WithdrawOneLimitResponse withdrawOneLimitEx(WithdrawOneLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.one.limit.withdraw", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new WithdrawOneLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于共享能力中心六期接入rasp回归验证
     * Summary: 用于共享能力中心六期接入rasp回归验证</p>
     */
    public QueryGongxiangTesttestResponse queryGongxiangTesttest(QueryGongxiangTesttestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGongxiangTesttestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于共享能力中心六期接入rasp回归验证
     * Summary: 用于共享能力中心六期接入rasp回归验证</p>
     */
    public QueryGongxiangTesttestResponse queryGongxiangTesttestEx(QueryGongxiangTesttestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.abc.gongxiang.testtest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGongxiangTesttestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
