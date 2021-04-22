// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ent.models.*;
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
                    new TeaPair("sdk_version", "1.4.6")
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
     * Description: 查询用户参与的所有项目
     * Summary: 用户参与的项目查询
     */
    public QueryCustomerProjectResponse queryCustomerProject(QueryCustomerProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCustomerProjectEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户参与的所有项目
     * Summary: 用户参与的项目查询
     */
    public QueryCustomerProjectResponse queryCustomerProjectEx(QueryCustomerProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.customer.project.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCustomerProjectResponse());
    }

    /**
     * Description: 查询用户数据的接口
     * Summary: 用户数据查询接口
     */
    public QueryCustomerDataResponse queryCustomerData(QueryCustomerDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCustomerDataEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户数据的接口
     * Summary: 用户数据查询接口
     */
    public QueryCustomerDataResponse queryCustomerDataEx(QueryCustomerDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.customer.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCustomerDataResponse());
    }

    /**
     * Description: 为用户创建分享码
     * Summary: 用户分享码创建接口
     */
    public GetUserSharecodeResponse getUserSharecode(GetUserSharecodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserSharecodeEx(request, headers, runtime);
    }

    /**
     * Description: 为用户创建分享码
     * Summary: 用户分享码创建接口
     */
    public GetUserSharecodeResponse getUserSharecodeEx(GetUserSharecodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.user.sharecode.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetUserSharecodeResponse());
    }

    /**
     * Description: 发送用户的项目订单数据
     * Summary: 用户项目订单消息发送接口
     */
    public SendUserProjectordermsgResponse sendUserProjectordermsg(SendUserProjectordermsgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendUserProjectordermsgEx(request, headers, runtime);
    }

    /**
     * Description: 发送用户的项目订单数据
     * Summary: 用户项目订单消息发送接口
     */
    public SendUserProjectordermsgResponse sendUserProjectordermsgEx(SendUserProjectordermsgRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.user.projectordermsg.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendUserProjectordermsgResponse());
    }

    /**
     * Description: 查询项目信息查询
     * Summary: 项目信息查询接口
     */
    public QueryProjectInfoResponse queryProjectInfo(QueryProjectInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProjectInfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询项目信息查询
     * Summary: 项目信息查询接口
     */
    public QueryProjectInfoResponse queryProjectInfoEx(QueryProjectInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.project.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryProjectInfoResponse());
    }

    /**
     * Description: 查询用户信息
     * Summary: 用户信息查询接口
     */
    public QueryUserInfoResponse queryUserInfo(QueryUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserInfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户信息
     * Summary: 用户信息查询接口
     */
    public QueryUserInfoResponse queryUserInfoEx(QueryUserInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.user.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserInfoResponse());
    }

    /**
     * Description: 查询用户粉丝粒获得明细
     * Summary: 用户粉丝粒获得明细查询接口
     */
    public QueryUserTokenallocationdetailResponse queryUserTokenallocationdetail(QueryUserTokenallocationdetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserTokenallocationdetailEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户粉丝粒获得明细
     * Summary: 用户粉丝粒获得明细查询接口
     */
    public QueryUserTokenallocationdetailResponse queryUserTokenallocationdetailEx(QueryUserTokenallocationdetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.user.tokenallocationdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserTokenallocationdetailResponse());
    }

    /**
     * Description: 查询用户粉丝粒兑现明细
     * Summary: 用户粉丝粒兑现明细查询接口
     */
    public QueryUserTokenredeemdetailResponse queryUserTokenredeemdetail(QueryUserTokenredeemdetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserTokenredeemdetailEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户粉丝粒兑现明细
     * Summary: 用户粉丝粒兑现明细查询接口
     */
    public QueryUserTokenredeemdetailResponse queryUserTokenredeemdetailEx(QueryUserTokenredeemdetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.user.tokenredeemdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserTokenredeemdetailResponse());
    }

    /**
     * Description: 上报事件
     * Summary: 事件上报
     */
    public ExecEventReportResponse execEventReport(ExecEventReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execEventReportEx(request, headers, runtime);
    }

    /**
     * Description: 上报事件
     * Summary: 事件上报
     */
    public ExecEventReportResponse execEventReportEx(ExecEventReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.event.report.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecEventReportResponse());
    }

    /**
     * Description: 查询事件信息
     * Summary: 事件信息查询
     */
    public QueryEventInfoResponse queryEventInfo(QueryEventInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEventInfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询事件信息
     * Summary: 事件信息查询
     */
    public QueryEventInfoResponse queryEventInfoEx(QueryEventInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.event.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEventInfoResponse());
    }

    /**
     * Description: 阿里拍卖nft资产元数据导入
     * Summary: 阿里拍卖nft资产元数据导入
     */
    public ImportNftMetaResponse importNftMeta(ImportNftMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importNftMetaEx(request, headers, runtime);
    }

    /**
     * Description: 阿里拍卖nft资产元数据导入
     * Summary: 阿里拍卖nft资产元数据导入
     */
    public ImportNftMetaResponse importNftMetaEx(ImportNftMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.nft.meta.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportNftMetaResponse());
    }

    /**
     * Description: nft资产订单落库，链上流转
     * Summary: nft资产流转
     */
    public ExecNftTransferResponse execNftTransfer(ExecNftTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execNftTransferEx(request, headers, runtime);
    }

    /**
     * Description: nft资产订单落库，链上流转
     * Summary: nft资产流转
     */
    public ExecNftTransferResponse execNftTransferEx(ExecNftTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.nft.transfer.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecNftTransferResponse());
    }

    /**
     * Description: 外部ISV获取分享码接口
     * Summary: 获得ISV分享码
     */
    public GetIsvSharecodeResponse getIsvSharecode(GetIsvSharecodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIsvSharecodeEx(request, headers, runtime);
    }

    /**
     * Description: 外部ISV获取分享码接口
     * Summary: 获得ISV分享码
     */
    public GetIsvSharecodeResponse getIsvSharecodeEx(GetIsvSharecodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.isv.sharecode.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetIsvSharecodeResponse());
    }

    /**
     * Description: 备付金追加接口
     * Summary: 备付金追加接口
     */
    public AddProvisionResponse addProvision(AddProvisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProvisionEx(request, headers, runtime);
    }

    /**
     * Description: 备付金追加接口
     * Summary: 备付金追加接口
     */
    public AddProvisionResponse addProvisionEx(AddProvisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.provision.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddProvisionResponse());
    }

    /**
     * Description: 赎回链上多余备付金
     * Summary: 赎回链上多余备付金
     */
    public ReclaimProvisionExtraprovisionResponse reclaimProvisionExtraprovision(ReclaimProvisionExtraprovisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reclaimProvisionExtraprovisionEx(request, headers, runtime);
    }

    /**
     * Description: 赎回链上多余备付金
     * Summary: 赎回链上多余备付金
     */
    public ReclaimProvisionExtraprovisionResponse reclaimProvisionExtraprovisionEx(ReclaimProvisionExtraprovisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.provision.extraprovision.reclaim", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReclaimProvisionExtraprovisionResponse());
    }

    /**
     * Description: 链上Token兑现接口
     * Summary: 链上Token兑现接口
     */
    public ExecTokenRedeemResponse execTokenRedeem(ExecTokenRedeemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execTokenRedeemEx(request, headers, runtime);
    }

    /**
     * Description: 链上Token兑现接口
     * Summary: 链上Token兑现接口
     */
    public ExecTokenRedeemResponse execTokenRedeemEx(ExecTokenRedeemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.token.redeem.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecTokenRedeemResponse());
    }

    /**
     * Description: 针对淘票票的获取专属邀请码获取接口
     * Summary: 淘票票专属邀请码获取接口
     */
    public GetTppSharecodeResponse getTppSharecode(GetTppSharecodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTppSharecodeEx(request, headers, runtime);
    }

    /**
     * Description: 针对淘票票的获取专属邀请码获取接口
     * Summary: 淘票票专属邀请码获取接口
     */
    public GetTppSharecodeResponse getTppSharecodeEx(GetTppSharecodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.tpp.sharecode.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTppSharecodeResponse());
    }

    /**
     * Description: 针对淘票票的查询全部必要信息的接口
     * Summary: 淘票票查询全部必要信息接口
     */
    public QueryTppAllinfoResponse queryTppAllinfo(QueryTppAllinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTppAllinfoEx(request, headers, runtime);
    }

    /**
     * Description: 针对淘票票的查询全部必要信息的接口
     * Summary: 淘票票查询全部必要信息接口
     */
    public QueryTppAllinfoResponse queryTppAllinfoEx(QueryTppAllinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.tpp.allinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTppAllinfoResponse());
    }

    /**
     * Description: 针对淘票票的参与信息查询接口
     * Summary: 淘票票参与信息查询接口
     */
    public QueryTppParticipationinfoResponse queryTppParticipationinfo(QueryTppParticipationinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTppParticipationinfoEx(request, headers, runtime);
    }

    /**
     * Description: 针对淘票票的参与信息查询接口
     * Summary: 淘票票参与信息查询接口
     */
    public QueryTppParticipationinfoResponse queryTppParticipationinfoEx(QueryTppParticipationinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.ent.tpp.participationinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTppParticipationinfoResponse());
    }
}
