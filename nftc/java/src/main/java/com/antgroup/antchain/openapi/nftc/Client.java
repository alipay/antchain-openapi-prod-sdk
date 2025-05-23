// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.nftc.models.*;

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
     * Init client with Config
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
     * Encapsulate the request and invoke the network
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
                    new TeaPair("sdk_version", "1.0.35"),
                    new TeaPair("_prod_code", "NFTC"),
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
     * Description: ASO排重
     * Summary: ASO排重
     */
    public QueryAsoDistinctResponse queryAsoDistinct(QueryAsoDistinctRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAsoDistinctEx(request, headers, runtime);
    }

    /**
     * Description: ASO排重
     * Summary: ASO排重
     */
    public QueryAsoDistinctResponse queryAsoDistinctEx(QueryAsoDistinctRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.aso.distinct.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAsoDistinctResponse());
    }

    /**
     * Description: ASO点击数据上报
     * Summary: ASO点击
     */
    public SubmitAsoClickResponse submitAsoClick(SubmitAsoClickRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAsoClickEx(request, headers, runtime);
    }

    /**
     * Description: ASO点击数据上报
     * Summary: ASO点击
     */
    public SubmitAsoClickResponse submitAsoClickEx(SubmitAsoClickRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.aso.click.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAsoClickResponse());
    }

    /**
     * Description: 七麦安卓ASO接入
     * Summary: 七麦安卓ASO接入
     */
    public SubmitAsoAndroidclickResponse submitAsoAndroidclick(SubmitAsoAndroidclickRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAsoAndroidclickEx(request, headers, runtime);
    }

    /**
     * Description: 七麦安卓ASO接入
     * Summary: 七麦安卓ASO接入
     */
    public SubmitAsoAndroidclickResponse submitAsoAndroidclickEx(SubmitAsoAndroidclickRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.aso.androidclick.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAsoAndroidclickResponse());
    }

    /**
     * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
     * Summary: 查询当前数字人形象
     */
    public QueryAvatarProfileResponse queryAvatarProfile(QueryAvatarProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAvatarProfileEx(request, headers, runtime);
    }

    /**
     * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
     * Summary: 查询当前数字人形象
     */
    public QueryAvatarProfileResponse queryAvatarProfileEx(QueryAvatarProfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.avatar.profile.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAvatarProfileResponse());
    }

    /**
     * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
     * Summary: 查询用户助力活动信息
     */
    public QueryPromoteActivityResponse queryPromoteActivity(QueryPromoteActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPromoteActivityEx(request, headers, runtime);
    }

    /**
     * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
     * Summary: 查询用户助力活动信息
     */
    public QueryPromoteActivityResponse queryPromoteActivityEx(QueryPromoteActivityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.promote.activity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPromoteActivityResponse());
    }

    /**
     * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
     * Summary: 发起助力分享
     */
    public GetPromoteShareurlResponse getPromoteShareurl(GetPromoteShareurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPromoteShareurlEx(request, headers, runtime);
    }

    /**
     * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
     * Summary: 发起助力分享
     */
    public GetPromoteShareurlResponse getPromoteShareurlEx(GetPromoteShareurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.promote.shareurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPromoteShareurlResponse());
    }

    /**
     * Description: 确认奖励到账
     * Summary: 确认奖励到账
     */
    public ConfirmTaskRewardResponse confirmTaskReward(ConfirmTaskRewardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmTaskRewardEx(request, headers, runtime);
    }

    /**
     * Description: 确认奖励到账
     * Summary: 确认奖励到账
     */
    public ConfirmTaskRewardResponse confirmTaskRewardEx(ConfirmTaskRewardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.task.reward.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmTaskRewardResponse());
    }

    /**
     * Description: authcode换取token
     * Summary: authcode换取token
     */
    public ApplyOauthTokenResponse applyOauthToken(ApplyOauthTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyOauthTokenEx(request, headers, runtime);
    }

    /**
     * Description: authcode换取token
     * Summary: authcode换取token
     */
    public ApplyOauthTokenResponse applyOauthTokenEx(ApplyOauthTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.oauth.token.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyOauthTokenResponse());
    }

    /**
     * Description: token获取头像/昵称
     * Summary: token获取头像/昵称
     */
    public QueryOauthUserinfoResponse queryOauthUserinfo(QueryOauthUserinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOauthUserinfoEx(request, headers, runtime);
    }

    /**
     * Description: token获取头像/昵称
     * Summary: token获取头像/昵称
     */
    public QueryOauthUserinfoResponse queryOauthUserinfoEx(QueryOauthUserinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.oauth.userinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOauthUserinfoResponse());
    }

    /**
     * Description: 获取用户Token
     * Summary: 获取用户Token
     */
    public ApplyOauthUserinfotokenResponse applyOauthUserinfotoken(ApplyOauthUserinfotokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyOauthUserinfotokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取用户Token
     * Summary: 获取用户Token
     */
    public ApplyOauthUserinfotokenResponse applyOauthUserinfotokenEx(ApplyOauthUserinfotokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.oauth.userinfotoken.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyOauthUserinfotokenResponse());
    }

    /**
     * Description: token获取实名信息
     * Summary: token获取实名认证信息
     */
    public QueryOauthRealnameinfoResponse queryOauthRealnameinfo(QueryOauthRealnameinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOauthRealnameinfoEx(request, headers, runtime);
    }

    /**
     * Description: token获取实名信息
     * Summary: token获取实名认证信息
     */
    public QueryOauthRealnameinfoResponse queryOauthRealnameinfoEx(QueryOauthRealnameinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.oauth.realnameinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOauthRealnameinfoResponse());
    }

    /**
     * Description: 短信发送
     * Summary: 短信发送
     */
    public SendSmsMessageResponse sendSmsMessage(SendSmsMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendSmsMessageEx(request, headers, runtime);
    }

    /**
     * Description: 短信发送
     * Summary: 短信发送
     */
    public SendSmsMessageResponse sendSmsMessageEx(SendSmsMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.sms.message.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendSmsMessageResponse());
    }

    /**
     * Description: DIY藏品发放
     * Summary: DIY藏品发放
     */
    public PublishMerchantDiyskuResponse publishMerchantDiysku(PublishMerchantDiyskuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishMerchantDiyskuEx(request, headers, runtime);
    }

    /**
     * Description: DIY藏品发放
     * Summary: DIY藏品发放
     */
    public PublishMerchantDiyskuResponse publishMerchantDiyskuEx(PublishMerchantDiyskuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.merchant.diysku.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishMerchantDiyskuResponse());
    }

    /**
     * Description: DIY藏品发放查询
     * Summary: DIY藏品发放查询
     */
    public QueryMerchantDiyskuResponse queryMerchantDiysku(QueryMerchantDiyskuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantDiyskuEx(request, headers, runtime);
    }

    /**
     * Description: DIY藏品发放查询
     * Summary: DIY藏品发放查询
     */
    public QueryMerchantDiyskuResponse queryMerchantDiyskuEx(QueryMerchantDiyskuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.merchant.diysku.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantDiyskuResponse());
    }

    /**
     * Description: 提供ISV  ugc铸造图片查询的openapi服务
     * Summary: ugc铸造图片查询的openapi接口
     */
    public QueryMerchantUgcimagesResponse queryMerchantUgcimages(QueryMerchantUgcimagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantUgcimagesEx(request, headers, runtime);
    }

    /**
     * Description: 提供ISV  ugc铸造图片查询的openapi服务
     * Summary: ugc铸造图片查询的openapi接口
     */
    public QueryMerchantUgcimagesResponse queryMerchantUgcimagesEx(QueryMerchantUgcimagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.merchant.ugcimages.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantUgcimagesResponse());
    }

    /**
     * Description: 租户根据sku给用户发放藏品
     * Summary: 发放藏品
     */
    public ApplyNftTransferResponse applyNftTransfer(ApplyNftTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyNftTransferEx(request, headers, runtime);
    }

    /**
     * Description: 租户根据sku给用户发放藏品
     * Summary: 发放藏品
     */
    public ApplyNftTransferResponse applyNftTransferEx(ApplyNftTransferRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.nft.transfer.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyNftTransferResponse());
    }

    /**
     * Description: 调用租户分页查询用户该租户发行的sku的资产
     * Summary: 查询藏品
     */
    public PagequeryNftCustomerResponse pagequeryNftCustomer(PagequeryNftCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryNftCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 调用租户分页查询用户该租户发行的sku的资产
     * Summary: 查询藏品
     */
    public PagequeryNftCustomerResponse pagequeryNftCustomerEx(PagequeryNftCustomerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.nft.customer.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryNftCustomerResponse());
    }

    /**
     * Description: 查询支付结果
     * Summary: 查询支付结果
     */
    public QueryNftOrderResponse queryNftOrder(QueryNftOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNftOrderEx(request, headers, runtime);
    }

    /**
     * Description: 查询支付结果
     * Summary: 查询支付结果
     */
    public QueryNftOrderResponse queryNftOrderEx(QueryNftOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.nft.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNftOrderResponse());
    }

    /**
     * Description: 根据skuId维度查询藏品
     * Summary: 根据skuId维度查询藏品
     */
    public QueryNftAssetbyskuResponse queryNftAssetbysku(QueryNftAssetbyskuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNftAssetbyskuEx(request, headers, runtime);
    }

    /**
     * Description: 根据skuId维度查询藏品
     * Summary: 根据skuId维度查询藏品
     */
    public QueryNftAssetbyskuResponse queryNftAssetbyskuEx(QueryNftAssetbyskuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.nft.assetbysku.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryNftAssetbyskuResponse());
    }

    /**
     * Description: 根据skuId维度校验藏品是否已拥有
     * Summary: 根据skuId维度校验藏品是否已拥有
     */
    public CheckNftAssetbyskuResponse checkNftAssetbysku(CheckNftAssetbyskuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkNftAssetbyskuEx(request, headers, runtime);
    }

    /**
     * Description: 根据skuId维度校验藏品是否已拥有
     * Summary: 根据skuId维度校验藏品是否已拥有
     */
    public CheckNftAssetbyskuResponse checkNftAssetbyskuEx(CheckNftAssetbyskuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.nft.assetbysku.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckNftAssetbyskuResponse());
    }

    /**
     * Description: 支付宝海豚优惠券发放
     * Summary: 支付宝海豚优惠券发放
     */
    public SendPromoPrizeResponse sendPromoPrize(SendPromoPrizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendPromoPrizeEx(request, headers, runtime);
    }

    /**
     * Description: 支付宝海豚优惠券发放
     * Summary: 支付宝海豚优惠券发放
     */
    public SendPromoPrizeResponse sendPromoPrizeEx(SendPromoPrizeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.promo.prize.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendPromoPrizeResponse());
    }

    /**
     * Description: 创建通用资源
     * Summary: 创建通用资源
     */
    public CreateResourceGeneralresourceResponse createResourceGeneralresource(CreateResourceGeneralresourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceGeneralresourceEx(request, headers, runtime);
    }

    /**
     * Description: 创建通用资源
     * Summary: 创建通用资源
     */
    public CreateResourceGeneralresourceResponse createResourceGeneralresourceEx(CreateResourceGeneralresourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.resource.generalresource.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateResourceGeneralresourceResponse());
    }

    /**
     * Description: 绑定文件到通用资源ID
     * Summary: 绑定文件到通用资源ID
     */
    public BindResourceGeneralresourcefileResponse bindResourceGeneralresourcefile(BindResourceGeneralresourcefileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindResourceGeneralresourcefileEx(request, headers, runtime);
    }

    /**
     * Description: 绑定文件到通用资源ID
     * Summary: 绑定文件到通用资源ID
     */
    public BindResourceGeneralresourcefileResponse bindResourceGeneralresourcefileEx(BindResourceGeneralresourcefileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.resource.generalresourcefile.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindResourceGeneralresourcefileResponse());
    }

    /**
     * Description: 发布通用资源文件
     * Summary: 发布通用资源文件
     */
    public PublishResourceGeneralresourcefileResponse publishResourceGeneralresourcefile(PublishResourceGeneralresourcefileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishResourceGeneralresourcefileEx(request, headers, runtime);
    }

    /**
     * Description: 发布通用资源文件
     * Summary: 发布通用资源文件
     */
    public PublishResourceGeneralresourcefileResponse publishResourceGeneralresourcefileEx(PublishResourceGeneralresourcefileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.resource.generalresourcefile.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishResourceGeneralresourcefileResponse());
    }

    /**
     * Description: 查询资源文件差量包列表
     * Summary: 查询资源文件差量包列表
     */
    public QueryResourcePatchlistResponse queryResourcePatchlist(QueryResourcePatchlistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourcePatchlistEx(request, headers, runtime);
    }

    /**
     * Description: 查询资源文件差量包列表
     * Summary: 查询资源文件差量包列表
     */
    public QueryResourcePatchlistResponse queryResourcePatchlistEx(QueryResourcePatchlistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.resource.patchlist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryResourcePatchlistResponse());
    }

    /**
     * Description: 资源管理平台-申请文件上传token
     * Summary: 资源管理平台-申请文件上传token
     */
    public ApplyResourceFiletokenResponse applyResourceFiletoken(ApplyResourceFiletokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyResourceFiletokenEx(request, headers, runtime);
    }

    /**
     * Description: 资源管理平台-申请文件上传token
     * Summary: 资源管理平台-申请文件上传token
     */
    public ApplyResourceFiletokenResponse applyResourceFiletokenEx(ApplyResourceFiletokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.nftc.resource.filetoken.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyResourceFiletokenResponse());
    }
}
