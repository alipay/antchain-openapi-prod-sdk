// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.WEBTRWATRADE.Models;

namespace AntChain.SDK.WEBTRWATRADE
{
    public class Client 
    {
        protected string _endpoint;
        protected string _regionId;
        protected string _accessKeyId;
        protected string _accessKeySecret;
        protected string _protocol;
        protected string _userAgent;
        protected int? _readTimeout;
        protected int? _connectTimeout;
        protected string _httpProxy;
        protected string _httpsProxy;
        protected string _socks5Proxy;
        protected string _socks5NetWork;
        protected string _noProxy;
        protected int? _maxIdleConns;
        protected string _securityToken;
        protected int? _maxIdleTimeMillis;
        protected int? _keepAliveDurationMillis;
        protected int? _maxRequests;
        protected int? _maxRequestsPerHost;

        /**
         * Init client with Config
         * @param config config contains the necessary information to create a client
         */
        public Client(Config config)
        {
            if (AlibabaCloud.TeaUtil.Common.IsUnset(config.ToMap()))
            {
                throw new TeaException(new Dictionary<string, string>
                {
                    {"code", "ParameterMissing"},
                    {"message", "'config' can not be unset"},
                });
            }
            this._accessKeyId = config.AccessKeyId;
            this._accessKeySecret = config.AccessKeySecret;
            this._securityToken = config.SecurityToken;
            this._endpoint = config.Endpoint;
            this._protocol = config.Protocol;
            this._userAgent = config.UserAgent;
            this._readTimeout = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.ReadTimeout, 20000);
            this._connectTimeout = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.ConnectTimeout, 20000);
            this._httpProxy = config.HttpProxy;
            this._httpsProxy = config.HttpsProxy;
            this._noProxy = config.NoProxy;
            this._socks5Proxy = config.Socks5Proxy;
            this._socks5NetWork = config.Socks5NetWork;
            this._maxIdleConns = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.MaxIdleConns, 60000);
            this._maxIdleTimeMillis = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.MaxIdleTimeMillis, 5);
            this._keepAliveDurationMillis = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.KeepAliveDurationMillis, 5000);
            this._maxRequests = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.MaxRequests, 100);
            this._maxRequestsPerHost = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.MaxRequestsPerHost, 100);
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
        public Dictionary<string, object> DoRequest(string version, string action, string protocol, string method, string pathname, Dictionary<string, object> request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"timeouted", "retry"},
                {"readTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ReadTimeout, _readTimeout)},
                {"connectTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ConnectTimeout, _connectTimeout)},
                {"httpProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpProxy, _httpProxy)},
                {"httpsProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpsProxy, _httpsProxy)},
                {"noProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.NoProxy, _noProxy)},
                {"maxIdleConns", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxIdleConns, _maxIdleConns)},
                {"maxIdleTimeMillis", _maxIdleTimeMillis},
                {"keepAliveDuration", _keepAliveDurationMillis},
                {"maxRequests", _maxRequests},
                {"maxRequestsPerHost", _maxRequestsPerHost},
                {"retry", new Dictionary<string, object>
                {
                    {"retryable", runtime.Autoretry},
                    {"maxAttempts", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxAttempts, 3)},
                }},
                {"backoff", new Dictionary<string, object>
                {
                    {"policy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.BackoffPolicy, "no")},
                    {"period", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.BackoffPeriod, 1)},
                }},
                {"ignoreSSL", runtime.IgnoreSSL},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Protocol = AlibabaCloud.TeaUtil.Common.DefaultString(_protocol, protocol);
                    request_.Method = method;
                    request_.Pathname = pathname;
                    request_.Query = new Dictionary<string, string>
                    {
                        {"method", action},
                        {"version", version},
                        {"sign_type", "HmacSHA1"},
                        {"req_time", AntChain.AlipayUtil.AntchainUtils.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.AntchainUtils.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "1.0.26"},
                        {"_prod_code", "WEBTRWATRADE"},
                        {"_prod_channel", "default"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
                    }
                    request_.Headers = TeaConverter.merge<string>
                    (
                        new Dictionary<string, string>()
                        {
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "openapi.antchain.antgroup.com")},
                            {"user-agent", AlibabaCloud.TeaUtil.Common.GetUserAgent(_userAgent)},
                        },
                        headers
                    );
                    Dictionary<string, object> tmp = AlibabaCloud.TeaUtil.Common.AnyifyMapValue(AlibabaCloud.Commons.Common.Query(request));
                    request_.Body = TeaCore.BytesReadable(AlibabaCloud.TeaUtil.Common.ToFormString(tmp));
                    request_.Headers["content-type"] = "application/x-www-form-urlencoded";
                    Dictionary<string, string> signedParam = TeaConverter.merge<string>
                    (
                        request_.Query,
                        AlibabaCloud.Commons.Common.Query(request)
                    );
                    request_.Query["sign"] = AntChain.AlipayUtil.AntchainUtils.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = TeaCore.DoAction(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.AntchainUtils.HasError(raw, _accessKeySecret))
                    {
                        throw new TeaException(new Dictionary<string, object>
                        {
                            {"message", resp.Get("result_msg")},
                            {"data", resp},
                            {"code", resp.Get("result_code")},
                        });
                    }
                    return resp;
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
                        _lastException = e;
                        continue;
                    }
                    throw e;
                }
            }

            throw new TeaUnretryableException(_lastRequest, _lastException);
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
        public async Task<Dictionary<string, object>> DoRequestAsync(string version, string action, string protocol, string method, string pathname, Dictionary<string, object> request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"timeouted", "retry"},
                {"readTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ReadTimeout, _readTimeout)},
                {"connectTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ConnectTimeout, _connectTimeout)},
                {"httpProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpProxy, _httpProxy)},
                {"httpsProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpsProxy, _httpsProxy)},
                {"noProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.NoProxy, _noProxy)},
                {"maxIdleConns", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxIdleConns, _maxIdleConns)},
                {"maxIdleTimeMillis", _maxIdleTimeMillis},
                {"keepAliveDuration", _keepAliveDurationMillis},
                {"maxRequests", _maxRequests},
                {"maxRequestsPerHost", _maxRequestsPerHost},
                {"retry", new Dictionary<string, object>
                {
                    {"retryable", runtime.Autoretry},
                    {"maxAttempts", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxAttempts, 3)},
                }},
                {"backoff", new Dictionary<string, object>
                {
                    {"policy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.BackoffPolicy, "no")},
                    {"period", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.BackoffPeriod, 1)},
                }},
                {"ignoreSSL", runtime.IgnoreSSL},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Protocol = AlibabaCloud.TeaUtil.Common.DefaultString(_protocol, protocol);
                    request_.Method = method;
                    request_.Pathname = pathname;
                    request_.Query = new Dictionary<string, string>
                    {
                        {"method", action},
                        {"version", version},
                        {"sign_type", "HmacSHA1"},
                        {"req_time", AntChain.AlipayUtil.AntchainUtils.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.AntchainUtils.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "1.0.26"},
                        {"_prod_code", "WEBTRWATRADE"},
                        {"_prod_channel", "default"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
                    }
                    request_.Headers = TeaConverter.merge<string>
                    (
                        new Dictionary<string, string>()
                        {
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "openapi.antchain.antgroup.com")},
                            {"user-agent", AlibabaCloud.TeaUtil.Common.GetUserAgent(_userAgent)},
                        },
                        headers
                    );
                    Dictionary<string, object> tmp = AlibabaCloud.TeaUtil.Common.AnyifyMapValue(AlibabaCloud.Commons.Common.Query(request));
                    request_.Body = TeaCore.BytesReadable(AlibabaCloud.TeaUtil.Common.ToFormString(tmp));
                    request_.Headers["content-type"] = "application/x-www-form-urlencoded";
                    Dictionary<string, string> signedParam = TeaConverter.merge<string>
                    (
                        request_.Query,
                        AlibabaCloud.Commons.Common.Query(request)
                    );
                    request_.Query["sign"] = AntChain.AlipayUtil.AntchainUtils.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = await TeaCore.DoActionAsync(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.AntchainUtils.HasError(raw, _accessKeySecret))
                    {
                        throw new TeaException(new Dictionary<string, object>
                        {
                            {"message", resp.Get("result_msg")},
                            {"data", resp},
                            {"code", resp.Get("result_code")},
                        });
                    }
                    return resp;
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
                        _lastException = e;
                        continue;
                    }
                    throw e;
                }
            }

            throw new TeaUnretryableException(_lastRequest, _lastException);
        }

        /**
         * Description: 发行机构创建资产项目
         * Summary: 发行机构创建资产项目
         */
        public CreateIssuerProjectResponse CreateIssuerProject(CreateIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIssuerProjectEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构创建资产项目
         * Summary: 发行机构创建资产项目
         */
        public async Task<CreateIssuerProjectResponse> CreateIssuerProjectAsync(CreateIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIssuerProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构创建资产项目
         * Summary: 发行机构创建资产项目
         */
        public CreateIssuerProjectResponse CreateIssuerProjectEx(CreateIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIssuerProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构创建资产项目
         * Summary: 发行机构创建资产项目
         */
        public async Task<CreateIssuerProjectResponse> CreateIssuerProjectExAsync(CreateIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIssuerProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询发行机构持有的资产项目信息
         * Summary: 分页查询发行机构项目信息
         */
        public PagequeryIssuerProjectResponse PagequeryIssuerProject(PagequeryIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIssuerProjectEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询发行机构持有的资产项目信息
         * Summary: 分页查询发行机构项目信息
         */
        public async Task<PagequeryIssuerProjectResponse> PagequeryIssuerProjectAsync(PagequeryIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIssuerProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询发行机构持有的资产项目信息
         * Summary: 分页查询发行机构项目信息
         */
        public PagequeryIssuerProjectResponse PagequeryIssuerProjectEx(PagequeryIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIssuerProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.project.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询发行机构持有的资产项目信息
         * Summary: 分页查询发行机构项目信息
         */
        public async Task<PagequeryIssuerProjectResponse> PagequeryIssuerProjectExAsync(PagequeryIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIssuerProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.project.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询代销机构代销的资产项目信息
         * Summary: 分页查询代销机构项目信息
         */
        public PagequeryDistributorProjectResponse PagequeryDistributorProject(PagequeryDistributorProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryDistributorProjectEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询代销机构代销的资产项目信息
         * Summary: 分页查询代销机构项目信息
         */
        public async Task<PagequeryDistributorProjectResponse> PagequeryDistributorProjectAsync(PagequeryDistributorProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryDistributorProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询代销机构代销的资产项目信息
         * Summary: 分页查询代销机构项目信息
         */
        public PagequeryDistributorProjectResponse PagequeryDistributorProjectEx(PagequeryDistributorProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDistributorProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.project.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询代销机构代销的资产项目信息
         * Summary: 分页查询代销机构项目信息
         */
        public async Task<PagequeryDistributorProjectResponse> PagequeryDistributorProjectExAsync(PagequeryDistributorProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDistributorProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.project.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构暂停项目
         * Summary: 发行机构暂停项目
         */
        public PauseIssuerProjectResponse PauseIssuerProject(PauseIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PauseIssuerProjectEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构暂停项目
         * Summary: 发行机构暂停项目
         */
        public async Task<PauseIssuerProjectResponse> PauseIssuerProjectAsync(PauseIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PauseIssuerProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构暂停项目
         * Summary: 发行机构暂停项目
         */
        public PauseIssuerProjectResponse PauseIssuerProjectEx(PauseIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseIssuerProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.project.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构暂停项目
         * Summary: 发行机构暂停项目
         */
        public async Task<PauseIssuerProjectResponse> PauseIssuerProjectExAsync(PauseIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseIssuerProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.project.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构激活项目(使项目生效)
         * Summary: 发行机构激活项目
         */
        public EnableIssuerProjectResponse EnableIssuerProject(EnableIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableIssuerProjectEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构激活项目(使项目生效)
         * Summary: 发行机构激活项目
         */
        public async Task<EnableIssuerProjectResponse> EnableIssuerProjectAsync(EnableIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableIssuerProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构激活项目(使项目生效)
         * Summary: 发行机构激活项目
         */
        public EnableIssuerProjectResponse EnableIssuerProjectEx(EnableIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableIssuerProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.project.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构激活项目(使项目生效)
         * Summary: 发行机构激活项目
         */
        public async Task<EnableIssuerProjectResponse> EnableIssuerProjectExAsync(EnableIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableIssuerProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.project.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询项目详情
         * Summary: 发行机构查询项目详情
         */
        public DetailIssuerProjectResponse DetailIssuerProject(DetailIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailIssuerProjectEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询项目详情
         * Summary: 发行机构查询项目详情
         */
        public async Task<DetailIssuerProjectResponse> DetailIssuerProjectAsync(DetailIssuerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailIssuerProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询项目详情
         * Summary: 发行机构查询项目详情
         */
        public DetailIssuerProjectResponse DetailIssuerProjectEx(DetailIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailIssuerProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.project.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询项目详情
         * Summary: 发行机构查询项目详情
         */
        public async Task<DetailIssuerProjectResponse> DetailIssuerProjectExAsync(DetailIssuerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailIssuerProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.project.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询项目详情
         * Summary: 代销机构查询项目详情
         */
        public DetailDistributorProjectResponse DetailDistributorProject(DetailDistributorProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailDistributorProjectEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询项目详情
         * Summary: 代销机构查询项目详情
         */
        public async Task<DetailDistributorProjectResponse> DetailDistributorProjectAsync(DetailDistributorProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailDistributorProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询项目详情
         * Summary: 代销机构查询项目详情
         */
        public DetailDistributorProjectResponse DetailDistributorProjectEx(DetailDistributorProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailDistributorProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.project.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询项目详情
         * Summary: 代销机构查询项目详情
         */
        public async Task<DetailDistributorProjectResponse> DetailDistributorProjectExAsync(DetailDistributorProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailDistributorProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.project.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台管理员分页查询所有项目
         * Summary: 平台管理分页查询项目
         */
        public PagequeryPlatformProjectResponse PagequeryPlatformProject(PagequeryPlatformProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryPlatformProjectEx(request, headers, runtime);
        }

        /**
         * Description: 平台管理员分页查询所有项目
         * Summary: 平台管理分页查询项目
         */
        public async Task<PagequeryPlatformProjectResponse> PagequeryPlatformProjectAsync(PagequeryPlatformProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryPlatformProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 平台管理员分页查询所有项目
         * Summary: 平台管理分页查询项目
         */
        public PagequeryPlatformProjectResponse PagequeryPlatformProjectEx(PagequeryPlatformProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryPlatformProjectResponse>(DoRequest("1.0", "antdigital.webtrwatrade.platform.project.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台管理员分页查询所有项目
         * Summary: 平台管理分页查询项目
         */
        public async Task<PagequeryPlatformProjectResponse> PagequeryPlatformProjectExAsync(PagequeryPlatformProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryPlatformProjectResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.platform.project.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询项目及角色信息
         * Summary: 发行机构查询项目及角色信息
         */
        public DetailIssuerProjectwithroleResponse DetailIssuerProjectwithrole(DetailIssuerProjectwithroleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailIssuerProjectwithroleEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询项目及角色信息
         * Summary: 发行机构查询项目及角色信息
         */
        public async Task<DetailIssuerProjectwithroleResponse> DetailIssuerProjectwithroleAsync(DetailIssuerProjectwithroleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailIssuerProjectwithroleExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询项目及角色信息
         * Summary: 发行机构查询项目及角色信息
         */
        public DetailIssuerProjectwithroleResponse DetailIssuerProjectwithroleEx(DetailIssuerProjectwithroleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailIssuerProjectwithroleResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.projectwithrole.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询项目及角色信息
         * Summary: 发行机构查询项目及角色信息
         */
        public async Task<DetailIssuerProjectwithroleResponse> DetailIssuerProjectwithroleExAsync(DetailIssuerProjectwithroleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailIssuerProjectwithroleResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.projectwithrole.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public ListIssuerCrossaccountResponse ListIssuerCrossaccount(ListIssuerCrossaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListIssuerCrossaccountEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public async Task<ListIssuerCrossaccountResponse> ListIssuerCrossaccountAsync(ListIssuerCrossaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListIssuerCrossaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public ListIssuerCrossaccountResponse ListIssuerCrossaccountEx(ListIssuerCrossaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerCrossaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.crossaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构跨链账号明细
         * Summary: 发行机构跨链账号明细
         */
        public async Task<ListIssuerCrossaccountResponse> ListIssuerCrossaccountExAsync(ListIssuerCrossaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerCrossaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.crossaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public ListDistributorCrossaccountResponse ListDistributorCrossaccount(ListDistributorCrossaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDistributorCrossaccountEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public async Task<ListDistributorCrossaccountResponse> ListDistributorCrossaccountAsync(ListDistributorCrossaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDistributorCrossaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public ListDistributorCrossaccountResponse ListDistributorCrossaccountEx(ListDistributorCrossaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributorCrossaccountResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.crossaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构跨链账号明细
         * Summary: 代销机构跨链账号明细
         */
        public async Task<ListDistributorCrossaccountResponse> ListDistributorCrossaccountExAsync(ListDistributorCrossaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributorCrossaccountResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.crossaccount.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取总览统计数据项
         * Summary: 发行机构获取总览统计数据项
         */
        public CountIssuerDatasummaryResponse CountIssuerDatasummary(CountIssuerDatasummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountIssuerDatasummaryEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取总览统计数据项
         * Summary: 发行机构获取总览统计数据项
         */
        public async Task<CountIssuerDatasummaryResponse> CountIssuerDatasummaryAsync(CountIssuerDatasummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountIssuerDatasummaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取总览统计数据项
         * Summary: 发行机构获取总览统计数据项
         */
        public CountIssuerDatasummaryResponse CountIssuerDatasummaryEx(CountIssuerDatasummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountIssuerDatasummaryResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.datasummary.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取总览统计数据项
         * Summary: 发行机构获取总览统计数据项
         */
        public async Task<CountIssuerDatasummaryResponse> CountIssuerDatasummaryExAsync(CountIssuerDatasummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountIssuerDatasummaryResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.datasummary.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取总览统计数据项
         * Summary: 代销机构获取总览统计数据项
         */
        public CountDistributorDatasummaryResponse CountDistributorDatasummary(CountDistributorDatasummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountDistributorDatasummaryEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取总览统计数据项
         * Summary: 代销机构获取总览统计数据项
         */
        public async Task<CountDistributorDatasummaryResponse> CountDistributorDatasummaryAsync(CountDistributorDatasummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountDistributorDatasummaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取总览统计数据项
         * Summary: 代销机构获取总览统计数据项
         */
        public CountDistributorDatasummaryResponse CountDistributorDatasummaryEx(CountDistributorDatasummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDistributorDatasummaryResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.datasummary.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取总览统计数据项
         * Summary: 代销机构获取总览统计数据项
         */
        public async Task<CountDistributorDatasummaryResponse> CountDistributorDatasummaryExAsync(CountDistributorDatasummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDistributorDatasummaryResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.datasummary.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取历史资产价值
         * Summary: 发行机构获取历史资产价值
         */
        public ListIssuerDatasummaryResponse ListIssuerDatasummary(ListIssuerDatasummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListIssuerDatasummaryEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取历史资产价值
         * Summary: 发行机构获取历史资产价值
         */
        public async Task<ListIssuerDatasummaryResponse> ListIssuerDatasummaryAsync(ListIssuerDatasummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListIssuerDatasummaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取历史资产价值
         * Summary: 发行机构获取历史资产价值
         */
        public ListIssuerDatasummaryResponse ListIssuerDatasummaryEx(ListIssuerDatasummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerDatasummaryResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.datasummary.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取历史资产价值
         * Summary: 发行机构获取历史资产价值
         */
        public async Task<ListIssuerDatasummaryResponse> ListIssuerDatasummaryExAsync(ListIssuerDatasummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerDatasummaryResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.datasummary.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取历史资产价值
         * Summary: 代销机构获取历史资产价值
         */
        public ListDistributorDatasummaryResponse ListDistributorDatasummary(ListDistributorDatasummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDistributorDatasummaryEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取历史资产价值
         * Summary: 代销机构获取历史资产价值
         */
        public async Task<ListDistributorDatasummaryResponse> ListDistributorDatasummaryAsync(ListDistributorDatasummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDistributorDatasummaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取历史资产价值
         * Summary: 代销机构获取历史资产价值
         */
        public ListDistributorDatasummaryResponse ListDistributorDatasummaryEx(ListDistributorDatasummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributorDatasummaryResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.datasummary.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取历史资产价值
         * Summary: 代销机构获取历史资产价值
         */
        public async Task<ListDistributorDatasummaryResponse> ListDistributorDatasummaryExAsync(ListDistributorDatasummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributorDatasummaryResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.datasummary.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代销机构列表
         * Summary: 查询代销机构列表
         */
        public ListIssuerInstitutionResponse ListIssuerInstitution(ListIssuerInstitutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListIssuerInstitutionEx(request, headers, runtime);
        }

        /**
         * Description: 查询代销机构列表
         * Summary: 查询代销机构列表
         */
        public async Task<ListIssuerInstitutionResponse> ListIssuerInstitutionAsync(ListIssuerInstitutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListIssuerInstitutionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询代销机构列表
         * Summary: 查询代销机构列表
         */
        public ListIssuerInstitutionResponse ListIssuerInstitutionEx(ListIssuerInstitutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerInstitutionResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.institution.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代销机构列表
         * Summary: 查询代销机构列表
         */
        public async Task<ListIssuerInstitutionResponse> ListIssuerInstitutionExAsync(ListIssuerInstitutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerInstitutionResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.institution.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询密钥
         * Summary: 分页查询密钥
         */
        public PagequeryIssuerKeyResponse PagequeryIssuerKey(PagequeryIssuerKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIssuerKeyEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询密钥
         * Summary: 分页查询密钥
         */
        public async Task<PagequeryIssuerKeyResponse> PagequeryIssuerKeyAsync(PagequeryIssuerKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIssuerKeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询密钥
         * Summary: 分页查询密钥
         */
        public PagequeryIssuerKeyResponse PagequeryIssuerKeyEx(PagequeryIssuerKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIssuerKeyResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.key.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询密钥
         * Summary: 分页查询密钥
         */
        public async Task<PagequeryIssuerKeyResponse> PagequeryIssuerKeyExAsync(PagequeryIssuerKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIssuerKeyResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.key.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询密钥详情
         * Summary: 查询密钥详情
         */
        public DetailIssuerKeyResponse DetailIssuerKey(DetailIssuerKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailIssuerKeyEx(request, headers, runtime);
        }

        /**
         * Description: 查询密钥详情
         * Summary: 查询密钥详情
         */
        public async Task<DetailIssuerKeyResponse> DetailIssuerKeyAsync(DetailIssuerKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailIssuerKeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询密钥详情
         * Summary: 查询密钥详情
         */
        public DetailIssuerKeyResponse DetailIssuerKeyEx(DetailIssuerKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailIssuerKeyResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.key.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询密钥详情
         * Summary: 查询密钥详情
         */
        public async Task<DetailIssuerKeyResponse> DetailIssuerKeyExAsync(DetailIssuerKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailIssuerKeyResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.key.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建密钥
         * Summary: 创建密钥
         */
        public CreateIssuerKeyResponse CreateIssuerKey(CreateIssuerKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIssuerKeyEx(request, headers, runtime);
        }

        /**
         * Description: 创建密钥
         * Summary: 创建密钥
         */
        public async Task<CreateIssuerKeyResponse> CreateIssuerKeyAsync(CreateIssuerKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIssuerKeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建密钥
         * Summary: 创建密钥
         */
        public CreateIssuerKeyResponse CreateIssuerKeyEx(CreateIssuerKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIssuerKeyResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.key.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建密钥
         * Summary: 创建密钥
         */
        public async Task<CreateIssuerKeyResponse> CreateIssuerKeyExAsync(CreateIssuerKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIssuerKeyResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.key.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除密钥
         * Summary: 删除密钥
         */
        public DeleteIssuerKeyResponse DeleteIssuerKey(DeleteIssuerKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteIssuerKeyEx(request, headers, runtime);
        }

        /**
         * Description: 删除密钥
         * Summary: 删除密钥
         */
        public async Task<DeleteIssuerKeyResponse> DeleteIssuerKeyAsync(DeleteIssuerKeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteIssuerKeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除密钥
         * Summary: 删除密钥
         */
        public DeleteIssuerKeyResponse DeleteIssuerKeyEx(DeleteIssuerKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIssuerKeyResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.key.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除密钥
         * Summary: 删除密钥
         */
        public async Task<DeleteIssuerKeyResponse> DeleteIssuerKeyExAsync(DeleteIssuerKeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIssuerKeyResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.key.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public ListIssuerOperationlogResponse ListIssuerOperationlog(ListIssuerOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListIssuerOperationlogEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public async Task<ListIssuerOperationlogResponse> ListIssuerOperationlogAsync(ListIssuerOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListIssuerOperationlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public ListIssuerOperationlogResponse ListIssuerOperationlogEx(ListIssuerOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerOperationlogResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构查询登录登出操作日志
         * Summary: 发行机构查询登录登出操作日志
         */
        public async Task<ListIssuerOperationlogResponse> ListIssuerOperationlogExAsync(ListIssuerOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerOperationlogResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public ListDistributorOperationlogResponse ListDistributorOperationlog(ListDistributorOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDistributorOperationlogEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public async Task<ListDistributorOperationlogResponse> ListDistributorOperationlogAsync(ListDistributorOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDistributorOperationlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public ListDistributorOperationlogResponse ListDistributorOperationlogEx(ListDistributorOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributorOperationlogResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构查询登录登出操作日志
         * Summary: 代销机构查询登录登出操作日志
         */
        public async Task<ListDistributorOperationlogResponse> ListDistributorOperationlogExAsync(ListDistributorOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributorOperationlogResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构添加项目密钥
         * Summary: 发行机构添加项目密钥
         */
        public AddIssuerProjectkeyResponse AddIssuerProjectkey(AddIssuerProjectkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddIssuerProjectkeyEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构添加项目密钥
         * Summary: 发行机构添加项目密钥
         */
        public async Task<AddIssuerProjectkeyResponse> AddIssuerProjectkeyAsync(AddIssuerProjectkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddIssuerProjectkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构添加项目密钥
         * Summary: 发行机构添加项目密钥
         */
        public AddIssuerProjectkeyResponse AddIssuerProjectkeyEx(AddIssuerProjectkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddIssuerProjectkeyResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构添加项目密钥
         * Summary: 发行机构添加项目密钥
         */
        public async Task<AddIssuerProjectkeyResponse> AddIssuerProjectkeyExAsync(AddIssuerProjectkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddIssuerProjectkeyResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.projectkey.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构删除项目密钥
         * Summary: 发行机构删除项目密钥
         */
        public DeleteIssuerProjectkeyResponse DeleteIssuerProjectkey(DeleteIssuerProjectkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteIssuerProjectkeyEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构删除项目密钥
         * Summary: 发行机构删除项目密钥
         */
        public async Task<DeleteIssuerProjectkeyResponse> DeleteIssuerProjectkeyAsync(DeleteIssuerProjectkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteIssuerProjectkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构删除项目密钥
         * Summary: 发行机构删除项目密钥
         */
        public DeleteIssuerProjectkeyResponse DeleteIssuerProjectkeyEx(DeleteIssuerProjectkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIssuerProjectkeyResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构删除项目密钥
         * Summary: 发行机构删除项目密钥
         */
        public async Task<DeleteIssuerProjectkeyResponse> DeleteIssuerProjectkeyExAsync(DeleteIssuerProjectkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIssuerProjectkeyResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.projectkey.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取项目密钥列表
         * Summary: 发行机构获取项目密钥列表
         */
        public ListIssuerProjectkeyResponse ListIssuerProjectkey(ListIssuerProjectkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListIssuerProjectkeyEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取项目密钥列表
         * Summary: 发行机构获取项目密钥列表
         */
        public async Task<ListIssuerProjectkeyResponse> ListIssuerProjectkeyAsync(ListIssuerProjectkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListIssuerProjectkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取项目密钥列表
         * Summary: 发行机构获取项目密钥列表
         */
        public ListIssuerProjectkeyResponse ListIssuerProjectkeyEx(ListIssuerProjectkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerProjectkeyResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取项目密钥列表
         * Summary: 发行机构获取项目密钥列表
         */
        public async Task<ListIssuerProjectkeyResponse> ListIssuerProjectkeyExAsync(ListIssuerProjectkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerProjectkeyResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.projectkey.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构分页查询密钥关联的项目
         * Summary: 发行机构分页查询密钥关联的项目
         */
        public PagequeryIssuerProjectkeyResponse PagequeryIssuerProjectkey(PagequeryIssuerProjectkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIssuerProjectkeyEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构分页查询密钥关联的项目
         * Summary: 发行机构分页查询密钥关联的项目
         */
        public async Task<PagequeryIssuerProjectkeyResponse> PagequeryIssuerProjectkeyAsync(PagequeryIssuerProjectkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIssuerProjectkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构分页查询密钥关联的项目
         * Summary: 发行机构分页查询密钥关联的项目
         */
        public PagequeryIssuerProjectkeyResponse PagequeryIssuerProjectkeyEx(PagequeryIssuerProjectkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIssuerProjectkeyResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构分页查询密钥关联的项目
         * Summary: 发行机构分页查询密钥关联的项目
         */
        public async Task<PagequeryIssuerProjectkeyResponse> PagequeryIssuerProjectkeyExAsync(PagequeryIssuerProjectkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIssuerProjectkeyResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.projectkey.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新项目净值
         * Summary: 更新项目净值
         */
        public UpdateIssuerNetvalueResponse UpdateIssuerNetvalue(UpdateIssuerNetvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIssuerNetvalueEx(request, headers, runtime);
        }

        /**
         * Description: 更新项目净值
         * Summary: 更新项目净值
         */
        public async Task<UpdateIssuerNetvalueResponse> UpdateIssuerNetvalueAsync(UpdateIssuerNetvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIssuerNetvalueExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新项目净值
         * Summary: 更新项目净值
         */
        public UpdateIssuerNetvalueResponse UpdateIssuerNetvalueEx(UpdateIssuerNetvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIssuerNetvalueResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.netvalue.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新项目净值
         * Summary: 更新项目净值
         */
        public async Task<UpdateIssuerNetvalueResponse> UpdateIssuerNetvalueExAsync(UpdateIssuerNetvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIssuerNetvalueResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.netvalue.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取净值列表
         * Summary: 获取净值列表
         */
        public ListIssuerNetvalueResponse ListIssuerNetvalue(ListIssuerNetvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListIssuerNetvalueEx(request, headers, runtime);
        }

        /**
         * Description: 获取净值列表
         * Summary: 获取净值列表
         */
        public async Task<ListIssuerNetvalueResponse> ListIssuerNetvalueAsync(ListIssuerNetvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListIssuerNetvalueExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取净值列表
         * Summary: 获取净值列表
         */
        public ListIssuerNetvalueResponse ListIssuerNetvalueEx(ListIssuerNetvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerNetvalueResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.netvalue.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取净值列表
         * Summary: 获取净值列表
         */
        public async Task<ListIssuerNetvalueResponse> ListIssuerNetvalueExAsync(ListIssuerNetvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerNetvalueResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.netvalue.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传项目报告
         * Summary: 上传项目报告
         */
        public UploadIssuerReportResponse UploadIssuerReport(UploadIssuerReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadIssuerReportEx(request, headers, runtime);
        }

        /**
         * Description: 上传项目报告
         * Summary: 上传项目报告
         */
        public async Task<UploadIssuerReportResponse> UploadIssuerReportAsync(UploadIssuerReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadIssuerReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传项目报告
         * Summary: 上传项目报告
         */
        public UploadIssuerReportResponse UploadIssuerReportEx(UploadIssuerReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadIssuerReportResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.report.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传项目报告
         * Summary: 上传项目报告
         */
        public async Task<UploadIssuerReportResponse> UploadIssuerReportExAsync(UploadIssuerReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadIssuerReportResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.report.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取历史报告列表
         * Summary: 发行机构获取历史报告列表
         */
        public ListIssuerReportResponse ListIssuerReport(ListIssuerReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListIssuerReportEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取历史报告列表
         * Summary: 发行机构获取历史报告列表
         */
        public async Task<ListIssuerReportResponse> ListIssuerReportAsync(ListIssuerReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListIssuerReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取历史报告列表
         * Summary: 发行机构获取历史报告列表
         */
        public ListIssuerReportResponse ListIssuerReportEx(ListIssuerReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerReportResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.report.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取历史报告列表
         * Summary: 发行机构获取历史报告列表
         */
        public async Task<ListIssuerReportResponse> ListIssuerReportExAsync(ListIssuerReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIssuerReportResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.report.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取历史项目报告
         * Summary: 代销机构获取历史项目报告
         */
        public ListDistributorReportResponse ListDistributorReport(ListDistributorReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDistributorReportEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取历史项目报告
         * Summary: 代销机构获取历史项目报告
         */
        public async Task<ListDistributorReportResponse> ListDistributorReportAsync(ListDistributorReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDistributorReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取历史项目报告
         * Summary: 代销机构获取历史项目报告
         */
        public ListDistributorReportResponse ListDistributorReportEx(ListDistributorReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributorReportResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.report.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取历史项目报告
         * Summary: 代销机构获取历史项目报告
         */
        public async Task<ListDistributorReportResponse> ListDistributorReportExAsync(ListDistributorReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributorReportResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.report.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取报告文件下载URL
         * Summary: 发行机构获取报告文件下载URL
         */
        public DownloadIssuerReportResponse DownloadIssuerReport(DownloadIssuerReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadIssuerReportEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取报告文件下载URL
         * Summary: 发行机构获取报告文件下载URL
         */
        public async Task<DownloadIssuerReportResponse> DownloadIssuerReportAsync(DownloadIssuerReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadIssuerReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取报告文件下载URL
         * Summary: 发行机构获取报告文件下载URL
         */
        public DownloadIssuerReportResponse DownloadIssuerReportEx(DownloadIssuerReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadIssuerReportResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.report.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取报告文件下载URL
         * Summary: 发行机构获取报告文件下载URL
         */
        public async Task<DownloadIssuerReportResponse> DownloadIssuerReportExAsync(DownloadIssuerReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadIssuerReportResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.report.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取报告文件预览URL
         * Summary: 发行机构获取报告文件预览URL
         */
        public PreviewIssuerReportResponse PreviewIssuerReport(PreviewIssuerReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewIssuerReportEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取报告文件预览URL
         * Summary: 发行机构获取报告文件预览URL
         */
        public async Task<PreviewIssuerReportResponse> PreviewIssuerReportAsync(PreviewIssuerReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewIssuerReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取报告文件预览URL
         * Summary: 发行机构获取报告文件预览URL
         */
        public PreviewIssuerReportResponse PreviewIssuerReportEx(PreviewIssuerReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewIssuerReportResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.report.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取报告文件预览URL
         * Summary: 发行机构获取报告文件预览URL
         */
        public async Task<PreviewIssuerReportResponse> PreviewIssuerReportExAsync(PreviewIssuerReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewIssuerReportResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.report.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取报告文件下载URL
         * Summary: 代销机构获取报告文件下载URL
         */
        public DownloadDistributorReportResponse DownloadDistributorReport(DownloadDistributorReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadDistributorReportEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取报告文件下载URL
         * Summary: 代销机构获取报告文件下载URL
         */
        public async Task<DownloadDistributorReportResponse> DownloadDistributorReportAsync(DownloadDistributorReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadDistributorReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取报告文件下载URL
         * Summary: 代销机构获取报告文件下载URL
         */
        public DownloadDistributorReportResponse DownloadDistributorReportEx(DownloadDistributorReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadDistributorReportResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.report.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取报告文件下载URL
         * Summary: 代销机构获取报告文件下载URL
         */
        public async Task<DownloadDistributorReportResponse> DownloadDistributorReportExAsync(DownloadDistributorReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadDistributorReportResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.report.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取报告文件预览URL
         * Summary: 代销机构获取报告文件预览URL
         */
        public PreviewDistributorReportResponse PreviewDistributorReport(PreviewDistributorReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewDistributorReportEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取报告文件预览URL
         * Summary: 代销机构获取报告文件预览URL
         */
        public async Task<PreviewDistributorReportResponse> PreviewDistributorReportAsync(PreviewDistributorReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewDistributorReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取报告文件预览URL
         * Summary: 代销机构获取报告文件预览URL
         */
        public PreviewDistributorReportResponse PreviewDistributorReportEx(PreviewDistributorReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewDistributorReportResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.report.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取报告文件预览URL
         * Summary: 代销机构获取报告文件预览URL
         */
        public async Task<PreviewDistributorReportResponse> PreviewDistributorReportExAsync(PreviewDistributorReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewDistributorReportResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.report.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询二级用户列表
         * Summary: 分页查询二级用户列表
         */
        public PagequeryIssuerSubuserResponse PagequeryIssuerSubuser(PagequeryIssuerSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIssuerSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询二级用户列表
         * Summary: 分页查询二级用户列表
         */
        public async Task<PagequeryIssuerSubuserResponse> PagequeryIssuerSubuserAsync(PagequeryIssuerSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIssuerSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询二级用户列表
         * Summary: 分页查询二级用户列表
         */
        public PagequeryIssuerSubuserResponse PagequeryIssuerSubuserEx(PagequeryIssuerSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIssuerSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询二级用户列表
         * Summary: 分页查询二级用户列表
         */
        public async Task<PagequeryIssuerSubuserResponse> PagequeryIssuerSubuserExAsync(PagequeryIssuerSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIssuerSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.subuser.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询二级用户列表
         * Summary: 分页查询二级用户列表
         */
        public PagequeryDistributorSubuserResponse PagequeryDistributorSubuser(PagequeryDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryDistributorSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询二级用户列表
         * Summary: 分页查询二级用户列表
         */
        public async Task<PagequeryDistributorSubuserResponse> PagequeryDistributorSubuserAsync(PagequeryDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryDistributorSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询二级用户列表
         * Summary: 分页查询二级用户列表
         */
        public PagequeryDistributorSubuserResponse PagequeryDistributorSubuserEx(PagequeryDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDistributorSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询二级用户列表
         * Summary: 分页查询二级用户列表
         */
        public async Task<PagequeryDistributorSubuserResponse> PagequeryDistributorSubuserExAsync(PagequeryDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDistributorSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuser.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个二级用户
         * Summary: 查询单个二级用户
         */
        public QueryIssuerSubuserResponse QueryIssuerSubuser(QueryIssuerSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIssuerSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 查询单个二级用户
         * Summary: 查询单个二级用户
         */
        public async Task<QueryIssuerSubuserResponse> QueryIssuerSubuserAsync(QueryIssuerSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIssuerSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询单个二级用户
         * Summary: 查询单个二级用户
         */
        public QueryIssuerSubuserResponse QueryIssuerSubuserEx(QueryIssuerSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIssuerSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个二级用户
         * Summary: 查询单个二级用户
         */
        public async Task<QueryIssuerSubuserResponse> QueryIssuerSubuserExAsync(QueryIssuerSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIssuerSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.subuser.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个二级用户
         * Summary: 查询单个二级用户
         */
        public QueryDistributorSubuserResponse QueryDistributorSubuser(QueryDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDistributorSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 查询单个二级用户
         * Summary: 查询单个二级用户
         */
        public async Task<QueryDistributorSubuserResponse> QueryDistributorSubuserAsync(QueryDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDistributorSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询单个二级用户
         * Summary: 查询单个二级用户
         */
        public QueryDistributorSubuserResponse QueryDistributorSubuserEx(QueryDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDistributorSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个二级用户
         * Summary: 查询单个二级用户
         */
        public async Task<QueryDistributorSubuserResponse> QueryDistributorSubuserExAsync(QueryDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDistributorSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuser.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新二级用户
         * Summary: 更新二级用户
         */
        public UpdateDistributorSubuserResponse UpdateDistributorSubuser(UpdateDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDistributorSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 更新二级用户
         * Summary: 更新二级用户
         */
        public async Task<UpdateDistributorSubuserResponse> UpdateDistributorSubuserAsync(UpdateDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDistributorSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新二级用户
         * Summary: 更新二级用户
         */
        public UpdateDistributorSubuserResponse UpdateDistributorSubuserEx(UpdateDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDistributorSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新二级用户
         * Summary: 更新二级用户
         */
        public async Task<UpdateDistributorSubuserResponse> UpdateDistributorSubuserExAsync(UpdateDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDistributorSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuser.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加二级用户
         * Summary: 添加二级用户
         */
        public CreateDistributorSubuserResponse CreateDistributorSubuser(CreateDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDistributorSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 添加二级用户
         * Summary: 添加二级用户
         */
        public async Task<CreateDistributorSubuserResponse> CreateDistributorSubuserAsync(CreateDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDistributorSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加二级用户
         * Summary: 添加二级用户
         */
        public CreateDistributorSubuserResponse CreateDistributorSubuserEx(CreateDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributorSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加二级用户
         * Summary: 添加二级用户
         */
        public async Task<CreateDistributorSubuserResponse> CreateDistributorSubuserExAsync(CreateDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributorSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuser.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除二级用户
         * Summary: 删除二级用户
         */
        public DeleteDistributorSubuserResponse DeleteDistributorSubuser(DeleteDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDistributorSubuserEx(request, headers, runtime);
        }

        /**
         * Description: 删除二级用户
         * Summary: 删除二级用户
         */
        public async Task<DeleteDistributorSubuserResponse> DeleteDistributorSubuserAsync(DeleteDistributorSubuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDistributorSubuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除二级用户
         * Summary: 删除二级用户
         */
        public DeleteDistributorSubuserResponse DeleteDistributorSubuserEx(DeleteDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDistributorSubuserResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除二级用户
         * Summary: 删除二级用户
         */
        public async Task<DeleteDistributorSubuserResponse> DeleteDistributorSubuserExAsync(DeleteDistributorSubuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDistributorSubuserResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subuser.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取二级用户配额
         * Summary: 获取二级用户配额
         */
        public CountDistributorSubusertargetResponse CountDistributorSubusertarget(CountDistributorSubusertargetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountDistributorSubusertargetEx(request, headers, runtime);
        }

        /**
         * Description: 获取二级用户配额
         * Summary: 获取二级用户配额
         */
        public async Task<CountDistributorSubusertargetResponse> CountDistributorSubusertargetAsync(CountDistributorSubusertargetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountDistributorSubusertargetExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取二级用户配额
         * Summary: 获取二级用户配额
         */
        public CountDistributorSubusertargetResponse CountDistributorSubusertargetEx(CountDistributorSubusertargetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDistributorSubusertargetResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.subusertarget.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取二级用户配额
         * Summary: 获取二级用户配额
         */
        public async Task<CountDistributorSubusertargetResponse> CountDistributorSubusertargetExAsync(CountDistributorSubusertargetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountDistributorSubusertargetResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.subusertarget.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public QueryIssuerResponse QueryIssuer(QueryIssuerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIssuerEx(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public async Task<QueryIssuerResponse> QueryIssuerAsync(QueryIssuerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIssuerExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public QueryIssuerResponse QueryIssuerEx(QueryIssuerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIssuerResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行机构获取二级用户详情数据
         * Summary: 发行机构获取二级用户详情数据
         */
        public async Task<QueryIssuerResponse> QueryIssuerExAsync(QueryIssuerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIssuerResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public QueryDistributorResponse QueryDistributor(QueryDistributorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDistributorEx(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public async Task<QueryDistributorResponse> QueryDistributorAsync(QueryDistributorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDistributorExAsync(request, headers, runtime);
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public QueryDistributorResponse QueryDistributorEx(QueryDistributorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDistributorResponse>(DoRequest("1.0", "antdigital.webtrwatrade.distributor.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代销机构获取二级用户详情数据
         * Summary: 代销机构获取二级用户详情数据
         */
        public async Task<QueryDistributorResponse> QueryDistributorExAsync(QueryDistributorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDistributorResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.distributor.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行token
         * Summary: 发行token
         */
        public IssueIssuerSubusertradeResponse IssueIssuerSubusertrade(IssueIssuerSubusertradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return IssueIssuerSubusertradeEx(request, headers, runtime);
        }

        /**
         * Description: 发行token
         * Summary: 发行token
         */
        public async Task<IssueIssuerSubusertradeResponse> IssueIssuerSubusertradeAsync(IssueIssuerSubusertradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await IssueIssuerSubusertradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行token
         * Summary: 发行token
         */
        public IssueIssuerSubusertradeResponse IssueIssuerSubusertradeEx(IssueIssuerSubusertradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IssueIssuerSubusertradeResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.issue", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行token
         * Summary: 发行token
         */
        public async Task<IssueIssuerSubusertradeResponse> IssueIssuerSubusertradeExAsync(IssueIssuerSubusertradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IssueIssuerSubusertradeResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.subusertrade.issue", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 赎回token
         * Summary: 赎回token
         */
        public RedeemIssuerSubusertradeResponse RedeemIssuerSubusertrade(RedeemIssuerSubusertradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RedeemIssuerSubusertradeEx(request, headers, runtime);
        }

        /**
         * Description: 赎回token
         * Summary: 赎回token
         */
        public async Task<RedeemIssuerSubusertradeResponse> RedeemIssuerSubusertradeAsync(RedeemIssuerSubusertradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RedeemIssuerSubusertradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 赎回token
         * Summary: 赎回token
         */
        public RedeemIssuerSubusertradeResponse RedeemIssuerSubusertradeEx(RedeemIssuerSubusertradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RedeemIssuerSubusertradeResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.redeem", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 赎回token
         * Summary: 赎回token
         */
        public async Task<RedeemIssuerSubusertradeResponse> RedeemIssuerSubusertradeExAsync(RedeemIssuerSubusertradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RedeemIssuerSubusertradeResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.subusertrade.redeem", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转移token
         * Summary: 转移token
         */
        public TransferIssuerSubusertradeResponse TransferIssuerSubusertrade(TransferIssuerSubusertradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TransferIssuerSubusertradeEx(request, headers, runtime);
        }

        /**
         * Description: 转移token
         * Summary: 转移token
         */
        public async Task<TransferIssuerSubusertradeResponse> TransferIssuerSubusertradeAsync(TransferIssuerSubusertradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TransferIssuerSubusertradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 转移token
         * Summary: 转移token
         */
        public TransferIssuerSubusertradeResponse TransferIssuerSubusertradeEx(TransferIssuerSubusertradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferIssuerSubusertradeResponse>(DoRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转移token
         * Summary: 转移token
         */
        public async Task<TransferIssuerSubusertradeResponse> TransferIssuerSubusertradeExAsync(TransferIssuerSubusertradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferIssuerSubusertradeResponse>(await DoRequestAsync("1.0", "antdigital.webtrwatrade.issuer.subusertrade.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
