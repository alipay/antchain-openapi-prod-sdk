// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.stlr.models.*;
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
                    new TeaPair("sdk_version", "1.3.0")
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
     * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
     * Summary: 查询当前活动资料信息
     */
    public DescribeAcarActivityResponse describeAcarActivity(DescribeAcarActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarActivityEx(request, headers, runtime);
    }

    /**
     * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
     * Summary: 查询当前活动资料信息
     */
    public DescribeAcarActivityResponse describeAcarActivityEx(DescribeAcarActivityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.activity.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarActivityResponse());
    }

    /**
     * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
     * Summary: 查询当前活动的每日碳排放量
     */
    public DescribeAcarDailyemissionsResponse describeAcarDailyemissions(DescribeAcarDailyemissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarDailyemissionsEx(request, headers, runtime);
    }

    /**
     * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
     * Summary: 查询当前活动的每日碳排放量
     */
    public DescribeAcarDailyemissionsResponse describeAcarDailyemissionsEx(DescribeAcarDailyemissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.dailyemissions.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarDailyemissionsResponse());
    }

    /**
     * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
     * Summary: 查询当前活动各范围的碳排放量
     */
    public DescribeAcarScopemissionResponse describeAcarScopemission(DescribeAcarScopemissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarScopemissionEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
     * Summary: 查询当前活动各范围的碳排放量
     */
    public DescribeAcarScopemissionResponse describeAcarScopemissionEx(DescribeAcarScopemissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.scopemission.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarScopemissionResponse());
    }

    /**
     * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
     * Summary: 获取减排情况
     */
    public DescribeAcarReductionemissionsResponse describeAcarReductionemissions(DescribeAcarReductionemissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarReductionemissionsEx(request, headers, runtime);
    }

    /**
     * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
     * Summary: 获取减排情况
     */
    public DescribeAcarReductionemissionsResponse describeAcarReductionemissionsEx(DescribeAcarReductionemissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.reductionemissions.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarReductionemissionsResponse());
    }

    /**
     * Description: 查询最近排放数据，返回最近排放数据信息
     * Summary: 查询最近排放数据
     */
    public DescribeAcarLastemissiondataResponse describeAcarLastemissiondata(DescribeAcarLastemissiondataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarLastemissiondataEx(request, headers, runtime);
    }

    /**
     * Description: 查询最近排放数据，返回最近排放数据信息
     * Summary: 查询最近排放数据
     */
    public DescribeAcarLastemissiondataResponse describeAcarLastemissiondataEx(DescribeAcarLastemissiondataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.lastemissiondata.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarLastemissiondataResponse());
    }

    /**
     * Description: 账户开通接口。开通协作平台和链上账户
     * Summary: 账户开通接口
     */
    public RegisterPdcpAccountResponse registerPdcpAccount(RegisterPdcpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerPdcpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 账户开通接口。开通协作平台和链上账户
     * Summary: 账户开通接口
     */
    public RegisterPdcpAccountResponse registerPdcpAccountEx(RegisterPdcpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.account.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterPdcpAccountResponse());
    }

    /**
     * Description: 存证接口
     * Summary: 存证接口
     */
    public PushPdcpBlockchainResponse pushPdcpBlockchain(PushPdcpBlockchainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushPdcpBlockchainEx(request, headers, runtime);
    }

    /**
     * Description: 存证接口
     * Summary: 存证接口
     */
    public PushPdcpBlockchainResponse pushPdcpBlockchainEx(PushPdcpBlockchainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.blockchain.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushPdcpBlockchainResponse());
    }

    /**
     * Description: 异步存证接口
     * Summary: 异步存证接口
     */
    public UploadPdcpBlockchainResponse uploadPdcpBlockchain(UploadPdcpBlockchainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadPdcpBlockchainEx(request, headers, runtime);
    }

    /**
     * Description: 异步存证接口
     * Summary: 异步存证接口
     */
    public UploadPdcpBlockchainResponse uploadPdcpBlockchainEx(UploadPdcpBlockchainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.blockchain.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadPdcpBlockchainResponse());
    }

    /**
     * Description: 查询异步存证结果
     * Summary: 查询异步存证结果
     */
    public GetPdcpBlockchainResponse getPdcpBlockchain(GetPdcpBlockchainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdcpBlockchainEx(request, headers, runtime);
    }

    /**
     * Description: 查询异步存证结果
     * Summary: 查询异步存证结果
     */
    public GetPdcpBlockchainResponse getPdcpBlockchainEx(GetPdcpBlockchainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.blockchain.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPdcpBlockchainResponse());
    }

    /**
     * Description: 新增排放活动数据
     * Summary: 新增排放活动数据
     */
    public AddEcarAvitivedataResponse addEcarAvitivedata(AddEcarAvitivedataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEcarAvitivedataEx(request, headers, runtime);
    }

    /**
     * Description: 新增排放活动数据
     * Summary: 新增排放活动数据
     */
    public AddEcarAvitivedataResponse addEcarAvitivedataEx(AddEcarAvitivedataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.avitivedata.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddEcarAvitivedataResponse());
    }

    /**
     * Description: 查询排放活动数据详情
     * Summary: 查询排放活动数据详情
     */
    public DetailEcarAvitivedataResponse detailEcarAvitivedata(DetailEcarAvitivedataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailEcarAvitivedataEx(request, headers, runtime);
    }

    /**
     * Description: 查询排放活动数据详情
     * Summary: 查询排放活动数据详情
     */
    public DetailEcarAvitivedataResponse detailEcarAvitivedataEx(DetailEcarAvitivedataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.avitivedata.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailEcarAvitivedataResponse());
    }

    /**
     * Description: 排放活动数据统计计算
     * Summary: 排放活动数据统计计算
     */
    public CountEcarActivedataResponse countEcarActivedata(CountEcarActivedataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countEcarActivedataEx(request, headers, runtime);
    }

    /**
     * Description: 排放活动数据统计计算
     * Summary: 排放活动数据统计计算
     */
    public CountEcarActivedataResponse countEcarActivedataEx(CountEcarActivedataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.activedata.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountEcarActivedataResponse());
    }

    /**
     * Description: 文件上传接口
     * Summary: 文件上传接口
     */
    public UploadEcarFileResponse uploadEcarFile(UploadEcarFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadEcarFileEx(request, headers, runtime);
    }

    /**
     * Description: 文件上传接口
     * Summary: 文件上传接口
     */
    public UploadEcarFileResponse uploadEcarFileEx(UploadEcarFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.carbon.ecar.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadEcarFileResponse uploadEcarFileResponse = UploadEcarFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadEcarFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadEcarFileResponse());
    }

    /**
     * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
     * Summary: 录入绿色行为数据
     */
    public AddEcarGreenoperationResponse addEcarGreenoperation(AddEcarGreenoperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEcarGreenoperationEx(request, headers, runtime);
    }

    /**
     * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
     * Summary: 录入绿色行为数据
     */
    public AddEcarGreenoperationResponse addEcarGreenoperationEx(AddEcarGreenoperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.greenoperation.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddEcarGreenoperationResponse());
    }

    /**
     * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
     * Summary: 统计绿色行为数据
     */
    public CountEcarGreenoperationResponse countEcarGreenoperation(CountEcarGreenoperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countEcarGreenoperationEx(request, headers, runtime);
    }

    /**
     * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
     * Summary: 统计绿色行为数据
     */
    public CountEcarGreenoperationResponse countEcarGreenoperationEx(CountEcarGreenoperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.greenoperation.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountEcarGreenoperationResponse());
    }

    /**
     * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
     * Summary: 查询最近的绿色行为数据
     */
    public ListEcarGreenoperationResponse listEcarGreenoperation(ListEcarGreenoperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcarGreenoperationEx(request, headers, runtime);
    }

    /**
     * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
     * Summary: 查询最近的绿色行为数据
     */
    public ListEcarGreenoperationResponse listEcarGreenoperationEx(ListEcarGreenoperationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.greenoperation.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListEcarGreenoperationResponse());
    }

    /**
     * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
     * Summary: 预览本年度排放统计
     */
    public PreviewEcarAvitivedataResponse previewEcarAvitivedata(PreviewEcarAvitivedataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewEcarAvitivedataEx(request, headers, runtime);
    }

    /**
     * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
     * Summary: 预览本年度排放统计
     */
    public PreviewEcarAvitivedataResponse previewEcarAvitivedataEx(PreviewEcarAvitivedataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.avitivedata.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewEcarAvitivedataResponse());
    }

    /**
     * Description: 三方平台调用此接口，查询用户的证书信息
     * Summary: 证书查询
     */
    public QueryThirdCertResponse queryThirdCert(QueryThirdCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThirdCertEx(request, headers, runtime);
    }

    /**
     * Description: 三方平台调用此接口，查询用户的证书信息
     * Summary: 证书查询
     */
    public QueryThirdCertResponse queryThirdCertEx(QueryThirdCertRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.third.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThirdCertResponse());
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
