// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.CREATIVE.Models;

namespace AntChain.SDK.CREATIVE
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Init client with Config</para>
        /// </description>
        /// 
        /// <param name="config">
        /// config contains the necessary information to create a client
        /// </param>
        public Client(Config config)
        {
            if (AlibabaCloud.TeaUtil.Common.IsUnset(config))
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Encapsulate the request and invoke the network</para>
        /// </description>
        /// 
        /// <param name="action">
        /// api name
        /// </param>
        /// <param name="protocol">
        /// http or https
        /// </param>
        /// <param name="method">
        /// e.g. GET
        /// </param>
        /// <param name="pathname">
        /// pathname of every api
        /// </param>
        /// <param name="request">
        /// which contains request params
        /// </param>
        /// <param name="runtime">
        /// which controls some details of call api, such as retry times
        /// </param>
        /// 
        /// <returns>
        /// the response
        /// </returns>
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
                        {"sdk_version", "1.1.0"},
                        {"_prod_code", "CREATIVE"},
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Encapsulate the request and invoke the network</para>
        /// </description>
        /// 
        /// <param name="action">
        /// api name
        /// </param>
        /// <param name="protocol">
        /// http or https
        /// </param>
        /// <param name="method">
        /// e.g. GET
        /// </param>
        /// <param name="pathname">
        /// pathname of every api
        /// </param>
        /// <param name="request">
        /// which contains request params
        /// </param>
        /// <param name="runtime">
        /// which controls some details of call api, such as retry times
        /// </param>
        /// 
        /// <returns>
        /// the response
        /// </returns>
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
                        {"sdk_version", "1.1.0"},
                        {"_prod_code", "CREATIVE"},
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 内容创作平台-视频生成-推送
        /// Summary: 内容创作平台-视频生成-推送</para>
        /// </description>
        public PushVideogenerationResponse PushVideogeneration(PushVideogenerationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushVideogenerationEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 内容创作平台-视频生成-推送
        /// Summary: 内容创作平台-视频生成-推送</para>
        /// </description>
        public async Task<PushVideogenerationResponse> PushVideogenerationAsync(PushVideogenerationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushVideogenerationExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 内容创作平台-视频生成-推送
        /// Summary: 内容创作平台-视频生成-推送</para>
        /// </description>
        public PushVideogenerationResponse PushVideogenerationEx(PushVideogenerationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushVideogenerationResponse>(DoRequest("1.0", "antdigital.creative.videogeneration.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 内容创作平台-视频生成-推送
        /// Summary: 内容创作平台-视频生成-推送</para>
        /// </description>
        public async Task<PushVideogenerationResponse> PushVideogenerationExAsync(PushVideogenerationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushVideogenerationResponse>(await DoRequestAsync("1.0", "antdigital.creative.videogeneration.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 视频创作接口查询
        /// Summary: 视频创作接口查询</para>
        /// </description>
        public QueryVideogenerationResponse QueryVideogeneration(QueryVideogenerationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryVideogenerationEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 视频创作接口查询
        /// Summary: 视频创作接口查询</para>
        /// </description>
        public async Task<QueryVideogenerationResponse> QueryVideogenerationAsync(QueryVideogenerationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryVideogenerationExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 视频创作接口查询
        /// Summary: 视频创作接口查询</para>
        /// </description>
        public QueryVideogenerationResponse QueryVideogenerationEx(QueryVideogenerationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryVideogenerationResponse>(DoRequest("1.0", "antdigital.creative.videogeneration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 视频创作接口查询
        /// Summary: 视频创作接口查询</para>
        /// </description>
        public async Task<QueryVideogenerationResponse> QueryVideogenerationExAsync(QueryVideogenerationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryVideogenerationResponse>(await DoRequestAsync("1.0", "antdigital.creative.videogeneration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 资产上传接口
        /// Summary: 资产上传接口</para>
        /// </description>
        public UploadAssetResponse UploadAsset(UploadAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAssetEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 资产上传接口
        /// Summary: 资产上传接口</para>
        /// </description>
        public async Task<UploadAssetResponse> UploadAssetAsync(UploadAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAssetExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 资产上传接口
        /// Summary: 资产上传接口</para>
        /// </description>
        public UploadAssetResponse UploadAssetEx(UploadAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAssetResponse>(DoRequest("1.0", "antdigital.creative.asset.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 资产上传接口
        /// Summary: 资产上传接口</para>
        /// </description>
        public async Task<UploadAssetResponse> UploadAssetExAsync(UploadAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAssetResponse>(await DoRequestAsync("1.0", "antdigital.creative.asset.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 资产查询接口
        /// Summary: 资产查询接口</para>
        /// </description>
        public QueryAssetResponse QueryAsset(QueryAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAssetEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 资产查询接口
        /// Summary: 资产查询接口</para>
        /// </description>
        public async Task<QueryAssetResponse> QueryAssetAsync(QueryAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAssetExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 资产查询接口
        /// Summary: 资产查询接口</para>
        /// </description>
        public QueryAssetResponse QueryAssetEx(QueryAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAssetResponse>(DoRequest("1.0", "antdigital.creative.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 资产查询接口
        /// Summary: 资产查询接口</para>
        /// </description>
        public async Task<QueryAssetResponse> QueryAssetExAsync(QueryAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAssetResponse>(await DoRequestAsync("1.0", "antdigital.creative.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 上传资产
        /// Summary: 上传资产</para>
        /// </description>
        public UploadMaasAssetResponse UploadMaasAsset(UploadMaasAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadMaasAssetEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 上传资产
        /// Summary: 上传资产</para>
        /// </description>
        public async Task<UploadMaasAssetResponse> UploadMaasAssetAsync(UploadMaasAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadMaasAssetExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 上传资产
        /// Summary: 上传资产</para>
        /// </description>
        public UploadMaasAssetResponse UploadMaasAssetEx(UploadMaasAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadMaasAssetResponse>(DoRequest("1.0", "antdigital.creative.maas.asset.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 上传资产
        /// Summary: 上传资产</para>
        /// </description>
        public async Task<UploadMaasAssetResponse> UploadMaasAssetExAsync(UploadMaasAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadMaasAssetResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.asset.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询资产
        /// Summary: 查询资产</para>
        /// </description>
        public QueryMaasAssetResponse QueryMaasAsset(QueryMaasAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMaasAssetEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询资产
        /// Summary: 查询资产</para>
        /// </description>
        public async Task<QueryMaasAssetResponse> QueryMaasAssetAsync(QueryMaasAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMaasAssetExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询资产
        /// Summary: 查询资产</para>
        /// </description>
        public QueryMaasAssetResponse QueryMaasAssetEx(QueryMaasAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMaasAssetResponse>(DoRequest("1.0", "antdigital.creative.maas.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询资产
        /// Summary: 查询资产</para>
        /// </description>
        public async Task<QueryMaasAssetResponse> QueryMaasAssetExAsync(QueryMaasAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMaasAssetResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建视频任务
        /// Summary: 创建视频任务</para>
        /// </description>
        public PushMaasVideoResponse PushMaasVideo(PushMaasVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushMaasVideoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建视频任务
        /// Summary: 创建视频任务</para>
        /// </description>
        public async Task<PushMaasVideoResponse> PushMaasVideoAsync(PushMaasVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushMaasVideoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建视频任务
        /// Summary: 创建视频任务</para>
        /// </description>
        public PushMaasVideoResponse PushMaasVideoEx(PushMaasVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushMaasVideoResponse>(DoRequest("1.0", "antdigital.creative.maas.video.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建视频任务
        /// Summary: 创建视频任务</para>
        /// </description>
        public async Task<PushMaasVideoResponse> PushMaasVideoExAsync(PushMaasVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushMaasVideoResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.video.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询视频任务
        /// Summary: 查询视频任务</para>
        /// </description>
        public QueryMaasVideoResponse QueryMaasVideo(QueryMaasVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMaasVideoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询视频任务
        /// Summary: 查询视频任务</para>
        /// </description>
        public async Task<QueryMaasVideoResponse> QueryMaasVideoAsync(QueryMaasVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMaasVideoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询视频任务
        /// Summary: 查询视频任务</para>
        /// </description>
        public QueryMaasVideoResponse QueryMaasVideoEx(QueryMaasVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMaasVideoResponse>(DoRequest("1.0", "antdigital.creative.maas.video.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询视频任务
        /// Summary: 查询视频任务</para>
        /// </description>
        public async Task<QueryMaasVideoResponse> QueryMaasVideoExAsync(QueryMaasVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMaasVideoResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.video.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 生成图片
        /// Summary: 生成图片</para>
        /// </description>
        public PushMaasImageResponse PushMaasImage(PushMaasImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushMaasImageEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 生成图片
        /// Summary: 生成图片</para>
        /// </description>
        public async Task<PushMaasImageResponse> PushMaasImageAsync(PushMaasImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushMaasImageExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 生成图片
        /// Summary: 生成图片</para>
        /// </description>
        public PushMaasImageResponse PushMaasImageEx(PushMaasImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushMaasImageResponse>(DoRequest("1.0", "antdigital.creative.maas.image.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 生成图片
        /// Summary: 生成图片</para>
        /// </description>
        public async Task<PushMaasImageResponse> PushMaasImageExAsync(PushMaasImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushMaasImageResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.image.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询图片任务
        /// Summary: 查询图片任务</para>
        /// </description>
        public QueryMaasImageResponse QueryMaasImage(QueryMaasImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMaasImageEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询图片任务
        /// Summary: 查询图片任务</para>
        /// </description>
        public async Task<QueryMaasImageResponse> QueryMaasImageAsync(QueryMaasImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMaasImageExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询图片任务
        /// Summary: 查询图片任务</para>
        /// </description>
        public QueryMaasImageResponse QueryMaasImageEx(QueryMaasImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMaasImageResponse>(DoRequest("1.0", "antdigital.creative.maas.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询图片任务
        /// Summary: 查询图片任务</para>
        /// </description>
        public async Task<QueryMaasImageResponse> QueryMaasImageExAsync(QueryMaasImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMaasImageResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建音频任务
        /// Summary: 创建音频任务</para>
        /// </description>
        public PushMaasAudioResponse PushMaasAudio(PushMaasAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushMaasAudioEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建音频任务
        /// Summary: 创建音频任务</para>
        /// </description>
        public async Task<PushMaasAudioResponse> PushMaasAudioAsync(PushMaasAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushMaasAudioExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建音频任务
        /// Summary: 创建音频任务</para>
        /// </description>
        public PushMaasAudioResponse PushMaasAudioEx(PushMaasAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushMaasAudioResponse>(DoRequest("1.0", "antdigital.creative.maas.audio.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建音频任务
        /// Summary: 创建音频任务</para>
        /// </description>
        public async Task<PushMaasAudioResponse> PushMaasAudioExAsync(PushMaasAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushMaasAudioResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.audio.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询音频任务
        /// Summary: 查询音频任务</para>
        /// </description>
        public QueryMaasAudioResponse QueryMaasAudio(QueryMaasAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMaasAudioEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询音频任务
        /// Summary: 查询音频任务</para>
        /// </description>
        public async Task<QueryMaasAudioResponse> QueryMaasAudioAsync(QueryMaasAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMaasAudioExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询音频任务
        /// Summary: 查询音频任务</para>
        /// </description>
        public QueryMaasAudioResponse QueryMaasAudioEx(QueryMaasAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMaasAudioResponse>(DoRequest("1.0", "antdigital.creative.maas.audio.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询音频任务
        /// Summary: 查询音频任务</para>
        /// </description>
        public async Task<QueryMaasAudioResponse> QueryMaasAudioExAsync(QueryMaasAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMaasAudioResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.audio.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文本同步调用
        /// Summary: 文本同步调用</para>
        /// </description>
        public ExecMaasChatsyncResponse ExecMaasChatsync(ExecMaasChatsyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecMaasChatsyncEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文本同步调用
        /// Summary: 文本同步调用</para>
        /// </description>
        public async Task<ExecMaasChatsyncResponse> ExecMaasChatsyncAsync(ExecMaasChatsyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecMaasChatsyncExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文本同步调用
        /// Summary: 文本同步调用</para>
        /// </description>
        public ExecMaasChatsyncResponse ExecMaasChatsyncEx(ExecMaasChatsyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMaasChatsyncResponse>(DoRequest("1.0", "antdigital.creative.maas.chatsync.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文本同步调用
        /// Summary: 文本同步调用</para>
        /// </description>
        public async Task<ExecMaasChatsyncResponse> ExecMaasChatsyncExAsync(ExecMaasChatsyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMaasChatsyncResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.chatsync.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 价格试算
        /// Summary: 价格试算</para>
        /// </description>
        public ExecMaasPriceResponse ExecMaasPrice(ExecMaasPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecMaasPriceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 价格试算
        /// Summary: 价格试算</para>
        /// </description>
        public async Task<ExecMaasPriceResponse> ExecMaasPriceAsync(ExecMaasPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecMaasPriceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 价格试算
        /// Summary: 价格试算</para>
        /// </description>
        public ExecMaasPriceResponse ExecMaasPriceEx(ExecMaasPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMaasPriceResponse>(DoRequest("1.0", "antdigital.creative.maas.price.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 价格试算
        /// Summary: 价格试算</para>
        /// </description>
        public async Task<ExecMaasPriceResponse> ExecMaasPriceExAsync(ExecMaasPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMaasPriceResponse>(await DoRequestAsync("1.0", "antdigital.creative.maas.price.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
