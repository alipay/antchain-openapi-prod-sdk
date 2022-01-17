// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.APIGATEWAY.Models;

namespace AntChain.SDK.APIGATEWAY
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
                {"keepAliveDurationMillis", _keepAliveDurationMillis},
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
                        {"sdk_version", "1.1.309"},
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
                {"keepAliveDurationMillis", _keepAliveDurationMillis},
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
                        {"sdk_version", "1.1.309"},
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
         * Description: 创建API分组
         * Summary: 创建API分组
         */
        public CreateApigroupResponse CreateApigroup(CreateApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApigroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建API分组
         * Summary: 创建API分组
         */
        public async Task<CreateApigroupResponse> CreateApigroupAsync(CreateApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApigroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建API分组
         * Summary: 创建API分组
         */
        public CreateApigroupResponse CreateApigroupEx(CreateApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApigroupResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建API分组
         * Summary: 创建API分组
         */
        public async Task<CreateApigroupResponse> CreateApigroupExAsync(CreateApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApigroupResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API分组列表
         * Summary: 查询API分组列表
         */
        public AllApigroupResponse AllApigroup(AllApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllApigroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询API分组列表
         * Summary: 查询API分组列表
         */
        public async Task<AllApigroupResponse> AllApigroupAsync(AllApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllApigroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询API分组列表
         * Summary: 查询API分组列表
         */
        public AllApigroupResponse AllApigroupEx(AllApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApigroupResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API分组列表
         * Summary: 查询API分组列表
         */
        public async Task<AllApigroupResponse> AllApigroupExAsync(AllApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApigroupResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API分组分页列表
         * Summary: 查询API分组分页列表
         */
        public ListApigroupResponse ListApigroup(ListApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApigroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询API分组分页列表
         * Summary: 查询API分组分页列表
         */
        public async Task<ListApigroupResponse> ListApigroupAsync(ListApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApigroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询API分组分页列表
         * Summary: 查询API分组分页列表
         */
        public ListApigroupResponse ListApigroupEx(ListApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApigroupResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API分组分页列表
         * Summary: 查询API分组分页列表
         */
        public async Task<ListApigroupResponse> ListApigroupExAsync(ListApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApigroupResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建后端集群
         * Summary: 创建后端集群
         */
        public CreateSysResponse CreateSys(CreateSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSysEx(request, headers, runtime);
        }

        /**
         * Description: 创建后端集群
         * Summary: 创建后端集群
         */
        public async Task<CreateSysResponse> CreateSysAsync(CreateSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSysExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建后端集群
         * Summary: 创建后端集群
         */
        public CreateSysResponse CreateSysEx(CreateSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSysResponse>(DoRequest("1.0", "sofa.apigateway.sys.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建后端集群
         * Summary: 创建后端集群
         */
        public async Task<CreateSysResponse> CreateSysExAsync(CreateSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSysResponse>(await DoRequestAsync("1.0", "sofa.apigateway.sys.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询后端集群列表
         * Summary: 查询后端集群列表
         */
        public AllSysResponse AllSys(AllSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllSysEx(request, headers, runtime);
        }

        /**
         * Description: 查询后端集群列表
         * Summary: 查询后端集群列表
         */
        public async Task<AllSysResponse> AllSysAsync(AllSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllSysExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询后端集群列表
         * Summary: 查询后端集群列表
         */
        public AllSysResponse AllSysEx(AllSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSysResponse>(DoRequest("1.0", "sofa.apigateway.sys.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询后端集群列表
         * Summary: 查询后端集群列表
         */
        public async Task<AllSysResponse> AllSysExAsync(AllSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSysResponse>(await DoRequestAsync("1.0", "sofa.apigateway.sys.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询后端集群分页列表
         * Summary: 查询后端集群分页列表
         */
        public ListSysResponse ListSys(ListSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSysEx(request, headers, runtime);
        }

        /**
         * Description: 查询后端集群分页列表
         * Summary: 查询后端集群分页列表
         */
        public async Task<ListSysResponse> ListSysAsync(ListSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSysExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询后端集群分页列表
         * Summary: 查询后端集群分页列表
         */
        public ListSysResponse ListSysEx(ListSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSysResponse>(DoRequest("1.0", "sofa.apigateway.sys.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询后端集群分页列表
         * Summary: 查询后端集群分页列表
         */
        public async Task<ListSysResponse> ListSysExAsync(ListSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSysResponse>(await DoRequestAsync("1.0", "sofa.apigateway.sys.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询API分组
         * Summary: 通过ID查询API分组
         */
        public GetApigroupResponse GetApigroup(GetApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApigroupEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询API分组
         * Summary: 通过ID查询API分组
         */
        public async Task<GetApigroupResponse> GetApigroupAsync(GetApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApigroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询API分组
         * Summary: 通过ID查询API分组
         */
        public GetApigroupResponse GetApigroupEx(GetApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApigroupResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询API分组
         * Summary: 通过ID查询API分组
         */
        public async Task<GetApigroupResponse> GetApigroupExAsync(GetApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApigroupResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新API分组
         * Summary: 更新API分组
         */
        public UpdateApigroupResponse UpdateApigroup(UpdateApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApigroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新API分组
         * Summary: 更新API分组
         */
        public async Task<UpdateApigroupResponse> UpdateApigroupAsync(UpdateApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApigroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新API分组
         * Summary: 更新API分组
         */
        public UpdateApigroupResponse UpdateApigroupEx(UpdateApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApigroupResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新API分组
         * Summary: 更新API分组
         */
        public async Task<UpdateApigroupResponse> UpdateApigroupExAsync(UpdateApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApigroupResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除API分组
         * Summary: 删除API分组
         */
        public DeleteApigroupResponse DeleteApigroup(DeleteApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApigroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除API分组
         * Summary: 删除API分组
         */
        public async Task<DeleteApigroupResponse> DeleteApigroupAsync(DeleteApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApigroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除API分组
         * Summary: 删除API分组
         */
        public DeleteApigroupResponse DeleteApigroupEx(DeleteApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApigroupResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除API分组
         * Summary: 删除API分组
         */
        public async Task<DeleteApigroupResponse> DeleteApigroupExAsync(DeleteApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApigroupResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建API信息
         * Summary: 创建API信息
         */
        public CreateApiResponse CreateApi(CreateApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApiEx(request, headers, runtime);
        }

        /**
         * Description: 创建API信息
         * Summary: 创建API信息
         */
        public async Task<CreateApiResponse> CreateApiAsync(CreateApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建API信息
         * Summary: 创建API信息
         */
        public CreateApiResponse CreateApiEx(CreateApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiResponse>(DoRequest("1.0", "sofa.apigateway.api.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建API信息
         * Summary: 创建API信息
         */
        public async Task<CreateApiResponse> CreateApiExAsync(CreateApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新API信息
         * Summary: 更新API信息
         */
        public UpdateApiResponse UpdateApi(UpdateApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApiEx(request, headers, runtime);
        }

        /**
         * Description: 更新API信息
         * Summary: 更新API信息
         */
        public async Task<UpdateApiResponse> UpdateApiAsync(UpdateApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新API信息
         * Summary: 更新API信息
         */
        public UpdateApiResponse UpdateApiEx(UpdateApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiResponse>(DoRequest("1.0", "sofa.apigateway.api.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新API信息
         * Summary: 更新API信息
         */
        public async Task<UpdateApiResponse> UpdateApiExAsync(UpdateApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API列表
         * Summary: 查询API列表
         */
        public AllApiResponse AllApi(AllApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllApiEx(request, headers, runtime);
        }

        /**
         * Description: 查询API列表
         * Summary: 查询API列表
         */
        public async Task<AllApiResponse> AllApiAsync(AllApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询API列表
         * Summary: 查询API列表
         */
        public AllApiResponse AllApiEx(AllApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApiResponse>(DoRequest("1.0", "sofa.apigateway.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API列表
         * Summary: 查询API列表
         */
        public async Task<AllApiResponse> AllApiExAsync(AllApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API分页列表
         * Summary: 查询API分页列表
         */
        public ListApiResponse ListApi(ListApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApiEx(request, headers, runtime);
        }

        /**
         * Description: 查询API分页列表
         * Summary: 查询API分页列表
         */
        public async Task<ListApiResponse> ListApiAsync(ListApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询API分页列表
         * Summary: 查询API分页列表
         */
        public ListApiResponse ListApiEx(ListApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApiResponse>(DoRequest("1.0", "sofa.apigateway.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API分页列表
         * Summary: 查询API分页列表
         */
        public async Task<ListApiResponse> ListApiExAsync(ListApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询API
         * Summary: 通过ID查询API
         */
        public GetApiResponse GetApi(GetApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询API
         * Summary: 通过ID查询API
         */
        public async Task<GetApiResponse> GetApiAsync(GetApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询API
         * Summary: 通过ID查询API
         */
        public GetApiResponse GetApiEx(GetApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiResponse>(DoRequest("1.0", "sofa.apigateway.api.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询API
         * Summary: 通过ID查询API
         */
        public async Task<GetApiResponse> GetApiExAsync(GetApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建App
         * Summary: 创建App
         */
        public CreateAppResponse CreateApp(CreateAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppEx(request, headers, runtime);
        }

        /**
         * Description: 创建App
         * Summary: 创建App
         */
        public async Task<CreateAppResponse> CreateAppAsync(CreateAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建App
         * Summary: 创建App
         */
        public CreateAppResponse CreateAppEx(CreateAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppResponse>(DoRequest("1.0", "sofa.apigateway.app.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建App
         * Summary: 创建App
         */
        public async Task<CreateAppResponse> CreateAppExAsync(CreateAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppResponse>(await DoRequestAsync("1.0", "sofa.apigateway.app.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新App信息
         * Summary: 更新App信息
         */
        public UpdateAppResponse UpdateApp(UpdateAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppEx(request, headers, runtime);
        }

        /**
         * Description: 更新App信息
         * Summary: 更新App信息
         */
        public async Task<UpdateAppResponse> UpdateAppAsync(UpdateAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新App信息
         * Summary: 更新App信息
         */
        public UpdateAppResponse UpdateAppEx(UpdateAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppResponse>(DoRequest("1.0", "sofa.apigateway.app.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新App信息
         * Summary: 更新App信息
         */
        public async Task<UpdateAppResponse> UpdateAppExAsync(UpdateAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppResponse>(await DoRequestAsync("1.0", "sofa.apigateway.app.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询App列表
         * Summary: 查询App列表
         */
        public AllAppResponse AllApp(AllAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllAppEx(request, headers, runtime);
        }

        /**
         * Description: 查询App列表
         * Summary: 查询App列表
         */
        public async Task<AllAppResponse> AllAppAsync(AllAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询App列表
         * Summary: 查询App列表
         */
        public AllAppResponse AllAppEx(AllAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAppResponse>(DoRequest("1.0", "sofa.apigateway.app.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询App列表
         * Summary: 查询App列表
         */
        public async Task<AllAppResponse> AllAppExAsync(AllAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAppResponse>(await DoRequestAsync("1.0", "sofa.apigateway.app.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询App分页列表
         * Summary: 查询App分页列表
         */
        public ListAppResponse ListApp(ListAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppEx(request, headers, runtime);
        }

        /**
         * Description: 查询App分页列表
         * Summary: 查询App分页列表
         */
        public async Task<ListAppResponse> ListAppAsync(ListAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询App分页列表
         * Summary: 查询App分页列表
         */
        public ListAppResponse ListAppEx(ListAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppResponse>(DoRequest("1.0", "sofa.apigateway.app.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询App分页列表
         * Summary: 查询App分页列表
         */
        public async Task<ListAppResponse> ListAppExAsync(ListAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppResponse>(await DoRequestAsync("1.0", "sofa.apigateway.app.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询App
         * Summary: 通过ID查询App
         */
        public GetAppResponse GetApp(GetAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询App
         * Summary: 通过ID查询App
         */
        public async Task<GetAppResponse> GetAppAsync(GetAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询App
         * Summary: 通过ID查询App
         */
        public GetAppResponse GetAppEx(GetAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppResponse>(DoRequest("1.0", "sofa.apigateway.app.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询App
         * Summary: 通过ID查询App
         */
        public async Task<GetAppResponse> GetAppExAsync(GetAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppResponse>(await DoRequestAsync("1.0", "sofa.apigateway.app.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建授权App
         * Summary: 创建授权App
         */
        public CreateAuthappResponse CreateAuthapp(CreateAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAuthappEx(request, headers, runtime);
        }

        /**
         * Description: 创建授权App
         * Summary: 创建授权App
         */
        public async Task<CreateAuthappResponse> CreateAuthappAsync(CreateAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建授权App
         * Summary: 创建授权App
         */
        public CreateAuthappResponse CreateAuthappEx(CreateAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAuthappResponse>(DoRequest("1.0", "sofa.apigateway.authapp.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建授权App
         * Summary: 创建授权App
         */
        public async Task<CreateAuthappResponse> CreateAuthappExAsync(CreateAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新授权App
         * Summary: 更新授权App
         */
        public UpdateAuthappResponse UpdateAuthapp(UpdateAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAuthappEx(request, headers, runtime);
        }

        /**
         * Description: 更新授权App
         * Summary: 更新授权App
         */
        public async Task<UpdateAuthappResponse> UpdateAuthappAsync(UpdateAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新授权App
         * Summary: 更新授权App
         */
        public UpdateAuthappResponse UpdateAuthappEx(UpdateAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAuthappResponse>(DoRequest("1.0", "sofa.apigateway.authapp.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新授权App
         * Summary: 更新授权App
         */
        public async Task<UpdateAuthappResponse> UpdateAuthappExAsync(UpdateAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除授权App
         * Summary: 删除授权App
         */
        public DeleteAuthappResponse DeleteAuthapp(DeleteAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAuthappEx(request, headers, runtime);
        }

        /**
         * Description: 删除授权App
         * Summary: 删除授权App
         */
        public async Task<DeleteAuthappResponse> DeleteAuthappAsync(DeleteAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除授权App
         * Summary: 删除授权App
         */
        public DeleteAuthappResponse DeleteAuthappEx(DeleteAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAuthappResponse>(DoRequest("1.0", "sofa.apigateway.authapp.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除授权App
         * Summary: 删除授权App
         */
        public async Task<DeleteAuthappResponse> DeleteAuthappExAsync(DeleteAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权App列表
         * Summary: 查询授权App列表
         */
        public AllAuthappResponse AllAuthapp(AllAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllAuthappEx(request, headers, runtime);
        }

        /**
         * Description: 查询授权App列表
         * Summary: 查询授权App列表
         */
        public async Task<AllAuthappResponse> AllAuthappAsync(AllAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询授权App列表
         * Summary: 查询授权App列表
         */
        public AllAuthappResponse AllAuthappEx(AllAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAuthappResponse>(DoRequest("1.0", "sofa.apigateway.authapp.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权App列表
         * Summary: 查询授权App列表
         */
        public async Task<AllAuthappResponse> AllAuthappExAsync(AllAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询获取授权App分页列表
         * Summary: 查询授权App分页列表
         */
        public ListAuthappResponse ListAuthapp(ListAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAuthappEx(request, headers, runtime);
        }

        /**
         * Description: 查询获取授权App分页列表
         * Summary: 查询授权App分页列表
         */
        public async Task<ListAuthappResponse> ListAuthappAsync(ListAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询获取授权App分页列表
         * Summary: 查询授权App分页列表
         */
        public ListAuthappResponse ListAuthappEx(ListAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthappResponse>(DoRequest("1.0", "sofa.apigateway.authapp.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询获取授权App分页列表
         * Summary: 查询授权App分页列表
         */
        public async Task<ListAuthappResponse> ListAuthappExAsync(ListAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询授权App
         * Summary: 通过ID查询授权App
         */
        public GetAuthappResponse GetAuthapp(GetAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAuthappEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询授权App
         * Summary: 通过ID查询授权App
         */
        public async Task<GetAuthappResponse> GetAuthappAsync(GetAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询授权App
         * Summary: 通过ID查询授权App
         */
        public GetAuthappResponse GetAuthappEx(GetAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAuthappResponse>(DoRequest("1.0", "sofa.apigateway.authapp.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询授权App
         * Summary: 通过ID查询授权App
         */
        public async Task<GetAuthappResponse> GetAuthappExAsync(GetAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建路由规则
         * Summary: 创建路由规则
         */
        public CreateRouterResponse CreateRouter(CreateRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRouterEx(request, headers, runtime);
        }

        /**
         * Description: 创建路由规则
         * Summary: 创建路由规则
         */
        public async Task<CreateRouterResponse> CreateRouterAsync(CreateRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建路由规则
         * Summary: 创建路由规则
         */
        public CreateRouterResponse CreateRouterEx(CreateRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRouterResponse>(DoRequest("1.0", "sofa.apigateway.router.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建路由规则
         * Summary: 创建路由规则
         */
        public async Task<CreateRouterResponse> CreateRouterExAsync(CreateRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRouterResponse>(await DoRequestAsync("1.0", "sofa.apigateway.router.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新路由规则
         * Summary: 更新路由规则
         */
        public UpdateRouterResponse UpdateRouter(UpdateRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRouterEx(request, headers, runtime);
        }

        /**
         * Description: 更新路由规则
         * Summary: 更新路由规则
         */
        public async Task<UpdateRouterResponse> UpdateRouterAsync(UpdateRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新路由规则
         * Summary: 更新路由规则
         */
        public UpdateRouterResponse UpdateRouterEx(UpdateRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRouterResponse>(DoRequest("1.0", "sofa.apigateway.router.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新路由规则
         * Summary: 更新路由规则
         */
        public async Task<UpdateRouterResponse> UpdateRouterExAsync(UpdateRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRouterResponse>(await DoRequestAsync("1.0", "sofa.apigateway.router.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除路由规则
         * Summary: 通过ID删除路由规则
         */
        public DeleteRouterResponse DeleteRouter(DeleteRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteRouterEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除路由规则
         * Summary: 通过ID删除路由规则
         */
        public async Task<DeleteRouterResponse> DeleteRouterAsync(DeleteRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除路由规则
         * Summary: 通过ID删除路由规则
         */
        public DeleteRouterResponse DeleteRouterEx(DeleteRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRouterResponse>(DoRequest("1.0", "sofa.apigateway.router.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除路由规则
         * Summary: 通过ID删除路由规则
         */
        public async Task<DeleteRouterResponse> DeleteRouterExAsync(DeleteRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRouterResponse>(await DoRequestAsync("1.0", "sofa.apigateway.router.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由信息列表
         * Summary: 查询路由信息列表
         */
        public AllRouterResponse AllRouter(AllRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllRouterEx(request, headers, runtime);
        }

        /**
         * Description: 查询路由信息列表
         * Summary: 查询路由信息列表
         */
        public async Task<AllRouterResponse> AllRouterAsync(AllRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询路由信息列表
         * Summary: 查询路由信息列表
         */
        public AllRouterResponse AllRouterEx(AllRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllRouterResponse>(DoRequest("1.0", "sofa.apigateway.router.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由信息列表
         * Summary: 查询路由信息列表
         */
        public async Task<AllRouterResponse> AllRouterExAsync(AllRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllRouterResponse>(await DoRequestAsync("1.0", "sofa.apigateway.router.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由规则分页列表
         * Summary: 查询路由规则分页列表
         */
        public ListRouterResponse ListRouter(ListRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRouterEx(request, headers, runtime);
        }

        /**
         * Description: 查询路由规则分页列表
         * Summary: 查询路由规则分页列表
         */
        public async Task<ListRouterResponse> ListRouterAsync(ListRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询路由规则分页列表
         * Summary: 查询路由规则分页列表
         */
        public ListRouterResponse ListRouterEx(ListRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRouterResponse>(DoRequest("1.0", "sofa.apigateway.router.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由规则分页列表
         * Summary: 查询路由规则分页列表
         */
        public async Task<ListRouterResponse> ListRouterExAsync(ListRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRouterResponse>(await DoRequestAsync("1.0", "sofa.apigateway.router.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询路由规则
         * Summary: 通过ID查询路由规则
         */
        public GetRouterResponse GetRouter(GetRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRouterEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询路由规则
         * Summary: 通过ID查询路由规则
         */
        public async Task<GetRouterResponse> GetRouterAsync(GetRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询路由规则
         * Summary: 通过ID查询路由规则
         */
        public GetRouterResponse GetRouterEx(GetRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRouterResponse>(DoRequest("1.0", "sofa.apigateway.router.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询路由规则
         * Summary: 通过ID查询路由规则
         */
        public async Task<GetRouterResponse> GetRouterExAsync(GetRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRouterResponse>(await DoRequestAsync("1.0", "sofa.apigateway.router.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新后端集群
         * Summary: 更新后端集群
         */
        public UpdateSysResponse UpdateSys(UpdateSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSysEx(request, headers, runtime);
        }

        /**
         * Description: 更新后端集群
         * Summary: 更新后端集群
         */
        public async Task<UpdateSysResponse> UpdateSysAsync(UpdateSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSysExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新后端集群
         * Summary: 更新后端集群
         */
        public UpdateSysResponse UpdateSysEx(UpdateSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSysResponse>(DoRequest("1.0", "sofa.apigateway.sys.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新后端集群
         * Summary: 更新后端集群
         */
        public async Task<UpdateSysResponse> UpdateSysExAsync(UpdateSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSysResponse>(await DoRequestAsync("1.0", "sofa.apigateway.sys.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除后端集群
         * Summary: 通过ID删除后端集群
         */
        public DeleteSysResponse DeleteSys(DeleteSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSysEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除后端集群
         * Summary: 通过ID删除后端集群
         */
        public async Task<DeleteSysResponse> DeleteSysAsync(DeleteSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSysExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除后端集群
         * Summary: 通过ID删除后端集群
         */
        public DeleteSysResponse DeleteSysEx(DeleteSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSysResponse>(DoRequest("1.0", "sofa.apigateway.sys.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除后端集群
         * Summary: 通过ID删除后端集群
         */
        public async Task<DeleteSysResponse> DeleteSysExAsync(DeleteSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSysResponse>(await DoRequestAsync("1.0", "sofa.apigateway.sys.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询后端集群
         * Summary: 通过ID查询后端集群
         */
        public GetSysResponse GetSys(GetSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSysEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询后端集群
         * Summary: 通过ID查询后端集群
         */
        public async Task<GetSysResponse> GetSysAsync(GetSysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSysExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询后端集群
         * Summary: 通过ID查询后端集群
         */
        public GetSysResponse GetSysEx(GetSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSysResponse>(DoRequest("1.0", "sofa.apigateway.sys.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询后端集群
         * Summary: 通过ID查询后端集群
         */
        public async Task<GetSysResponse> GetSysExAsync(GetSysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSysResponse>(await DoRequestAsync("1.0", "sofa.apigateway.sys.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过API分组ID查询API列表
         * Summary: 通过API分组ID查询API列表
         */
        public AllApigroupApiResponse AllApigroupApi(AllApigroupApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllApigroupApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过API分组ID查询API列表
         * Summary: 通过API分组ID查询API列表
         */
        public async Task<AllApigroupApiResponse> AllApigroupApiAsync(AllApigroupApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllApigroupApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过API分组ID查询API列表
         * Summary: 通过API分组ID查询API列表
         */
        public AllApigroupApiResponse AllApigroupApiEx(AllApigroupApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApigroupApiResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过API分组ID查询API列表
         * Summary: 通过API分组ID查询API列表
         */
        public async Task<AllApigroupApiResponse> AllApigroupApiExAsync(AllApigroupApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApigroupApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除App
         * Summary: 通过ID删除App
         */
        public DeleteAppResponse DeleteApp(DeleteAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除App
         * Summary: 通过ID删除App
         */
        public async Task<DeleteAppResponse> DeleteAppAsync(DeleteAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除App
         * Summary: 通过ID删除App
         */
        public DeleteAppResponse DeleteAppEx(DeleteAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppResponse>(DoRequest("1.0", "sofa.apigateway.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除App
         * Summary: 通过ID删除App
         */
        public async Task<DeleteAppResponse> DeleteAppExAsync(DeleteAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppResponse>(await DoRequestAsync("1.0", "sofa.apigateway.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除API
         * Summary: 通过ID删除API
         */
        public DeleteApiResponse DeleteApi(DeleteApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除API
         * Summary: 通过ID删除API
         */
        public async Task<DeleteApiResponse> DeleteApiAsync(DeleteApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除API
         * Summary: 通过ID删除API
         */
        public DeleteApiResponse DeleteApiEx(DeleteApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApiResponse>(DoRequest("1.0", "sofa.apigateway.api.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除API
         * Summary: 通过ID删除API
         */
        public async Task<DeleteApiResponse> DeleteApiExAsync(DeleteApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过API分组ID查询API分页列表
         * Summary: 通过API分组ID查询API分页列表
         */
        public ListApigroupApiResponse ListApigroupApi(ListApigroupApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApigroupApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过API分组ID查询API分页列表
         * Summary: 通过API分组ID查询API分页列表
         */
        public async Task<ListApigroupApiResponse> ListApigroupApiAsync(ListApigroupApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApigroupApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过API分组ID查询API分页列表
         * Summary: 通过API分组ID查询API分页列表
         */
        public ListApigroupApiResponse ListApigroupApiEx(ListApigroupApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApigroupApiResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过API分组ID查询API分页列表
         * Summary: 通过API分组ID查询API分页列表
         */
        public async Task<ListApigroupApiResponse> ListApigroupApiExAsync(ListApigroupApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApigroupApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过授权App ID查询API分页列表
         * Summary: 通过授权App ID查询API分页列表
         */
        public ListAuthappApiResponse ListAuthappApi(ListAuthappApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAuthappApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过授权App ID查询API分页列表
         * Summary: 通过授权App ID查询API分页列表
         */
        public async Task<ListAuthappApiResponse> ListAuthappApiAsync(ListAuthappApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAuthappApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过授权App ID查询API分页列表
         * Summary: 通过授权App ID查询API分页列表
         */
        public ListAuthappApiResponse ListAuthappApiEx(ListAuthappApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthappApiResponse>(DoRequest("1.0", "sofa.apigateway.authapp.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过授权App ID查询API分页列表
         * Summary: 通过授权App ID查询API分页列表
         */
        public async Task<ListAuthappApiResponse> ListAuthappApiExAsync(ListAuthappApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAuthappApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过后端集群ID查询API列表
         * Summary: 通过后端集群ID查询API列表
         */
        public AllSysApiResponse AllSysApi(AllSysApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllSysApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过后端集群ID查询API列表
         * Summary: 通过后端集群ID查询API列表
         */
        public async Task<AllSysApiResponse> AllSysApiAsync(AllSysApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllSysApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过后端集群ID查询API列表
         * Summary: 通过后端集群ID查询API列表
         */
        public AllSysApiResponse AllSysApiEx(AllSysApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSysApiResponse>(DoRequest("1.0", "sofa.apigateway.sys.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过后端集群ID查询API列表
         * Summary: 通过后端集群ID查询API列表
         */
        public async Task<AllSysApiResponse> AllSysApiExAsync(AllSysApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSysApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.sys.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过后端集群ID查询API分页列表
         * Summary: 通过后端集群ID查询API分页列表
         */
        public ListSysApiResponse ListSysApi(ListSysApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSysApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过后端集群ID查询API分页列表
         * Summary: 通过后端集群ID查询API分页列表
         */
        public async Task<ListSysApiResponse> ListSysApiAsync(ListSysApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSysApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过后端集群ID查询API分页列表
         * Summary: 通过后端集群ID查询API分页列表
         */
        public ListSysApiResponse ListSysApiEx(ListSysApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSysApiResponse>(DoRequest("1.0", "sofa.apigateway.sys.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过后端集群ID查询API分页列表
         * Summary: 通过后端集群ID查询API分页列表
         */
        public async Task<ListSysApiResponse> ListSysApiExAsync(ListSysApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSysApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.sys.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过路由规则ID查询API列表
         * Summary: 通过路由规则ID查询API列表
         */
        public AllRouterApiResponse AllRouterApi(AllRouterApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllRouterApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过路由规则ID查询API列表
         * Summary: 通过路由规则ID查询API列表
         */
        public async Task<AllRouterApiResponse> AllRouterApiAsync(AllRouterApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllRouterApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过路由规则ID查询API列表
         * Summary: 通过路由规则ID查询API列表
         */
        public AllRouterApiResponse AllRouterApiEx(AllRouterApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllRouterApiResponse>(DoRequest("1.0", "sofa.apigateway.router.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过路由规则ID查询API列表
         * Summary: 通过路由规则ID查询API列表
         */
        public async Task<AllRouterApiResponse> AllRouterApiExAsync(AllRouterApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllRouterApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.router.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过路由规则ID查询API分页列表
         * Summary: 通过路由规则ID查询API分页列表
         */
        public ListRouterApiResponse ListRouterApi(ListRouterApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRouterApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过路由规则ID查询API分页列表
         * Summary: 通过路由规则ID查询API分页列表
         */
        public async Task<ListRouterApiResponse> ListRouterApiAsync(ListRouterApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRouterApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过路由规则ID查询API分页列表
         * Summary: 通过路由规则ID查询API分页列表
         */
        public ListRouterApiResponse ListRouterApiEx(ListRouterApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRouterApiResponse>(DoRequest("1.0", "sofa.apigateway.router.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过路由规则ID查询API分页列表
         * Summary: 通过路由规则ID查询API分页列表
         */
        public async Task<ListRouterApiResponse> ListRouterApiExAsync(ListRouterApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRouterApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.router.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新API版本号
         * Summary: 更新API版本号
         */
        public UpdateApiVersionnoResponse UpdateApiVersionno(UpdateApiVersionnoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApiVersionnoEx(request, headers, runtime);
        }

        /**
         * Description: 更新API版本号
         * Summary: 更新API版本号
         */
        public async Task<UpdateApiVersionnoResponse> UpdateApiVersionnoAsync(UpdateApiVersionnoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApiVersionnoExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新API版本号
         * Summary: 更新API版本号
         */
        public UpdateApiVersionnoResponse UpdateApiVersionnoEx(UpdateApiVersionnoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiVersionnoResponse>(DoRequest("1.0", "sofa.apigateway.api.versionno.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新API版本号
         * Summary: 更新API版本号
         */
        public async Task<UpdateApiVersionnoResponse> UpdateApiVersionnoExAsync(UpdateApiVersionnoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiVersionnoResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.versionno.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下线API
         * Summary: 下线API
         */
        public OfflineApiResponse OfflineApi(OfflineApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineApiEx(request, headers, runtime);
        }

        /**
         * Description: 下线API
         * Summary: 下线API
         */
        public async Task<OfflineApiResponse> OfflineApiAsync(OfflineApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 下线API
         * Summary: 下线API
         */
        public OfflineApiResponse OfflineApiEx(OfflineApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineApiResponse>(DoRequest("1.0", "sofa.apigateway.api.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下线API
         * Summary: 下线API
         */
        public async Task<OfflineApiResponse> OfflineApiExAsync(OfflineApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过授权App ID查询API列表
         * Summary: 通过授权App ID查询API列表
         */
        public AllAuthappApiResponse AllAuthappApi(AllAuthappApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllAuthappApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过授权App ID查询API列表
         * Summary: 通过授权App ID查询API列表
         */
        public async Task<AllAuthappApiResponse> AllAuthappApiAsync(AllAuthappApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllAuthappApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过授权App ID查询API列表
         * Summary: 通过授权App ID查询API列表
         */
        public AllAuthappApiResponse AllAuthappApiEx(AllAuthappApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAuthappApiResponse>(DoRequest("1.0", "sofa.apigateway.authapp.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过授权App ID查询API列表
         * Summary: 通过授权App ID查询API列表
         */
        public async Task<AllAuthappApiResponse> AllAuthappApiExAsync(AllAuthappApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAuthappApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api挂载授权App
         * Summary: api挂载授权App
         */
        public MountApiAuthappResponse MountApiAuthapp(MountApiAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MountApiAuthappEx(request, headers, runtime);
        }

        /**
         * Description: api挂载授权App
         * Summary: api挂载授权App
         */
        public async Task<MountApiAuthappResponse> MountApiAuthappAsync(MountApiAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MountApiAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: api挂载授权App
         * Summary: api挂载授权App
         */
        public MountApiAuthappResponse MountApiAuthappEx(MountApiAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountApiAuthappResponse>(DoRequest("1.0", "sofa.apigateway.api.authapp.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api挂载授权App
         * Summary: api挂载授权App
         */
        public async Task<MountApiAuthappResponse> MountApiAuthappExAsync(MountApiAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountApiAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.authapp.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上线API
         * Summary: 上线API
         */
        public OnlineApiResponse OnlineApi(OnlineApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineApiEx(request, headers, runtime);
        }

        /**
         * Description: 上线API
         * Summary: 上线API
         */
        public async Task<OnlineApiResponse> OnlineApiAsync(OnlineApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 上线API
         * Summary: 上线API
         */
        public OnlineApiResponse OnlineApiEx(OnlineApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineApiResponse>(DoRequest("1.0", "sofa.apigateway.api.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上线API
         * Summary: 上线API
         */
        public async Task<OnlineApiResponse> OnlineApiExAsync(OnlineApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过API ID查询授权App列表
         * Summary: 通过API ID查询授权App列表
         */
        public AllApiAuthappResponse AllApiAuthapp(AllApiAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllApiAuthappEx(request, headers, runtime);
        }

        /**
         * Description: 通过API ID查询授权App列表
         * Summary: 通过API ID查询授权App列表
         */
        public async Task<AllApiAuthappResponse> AllApiAuthappAsync(AllApiAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllApiAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过API ID查询授权App列表
         * Summary: 通过API ID查询授权App列表
         */
        public AllApiAuthappResponse AllApiAuthappEx(AllApiAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApiAuthappResponse>(DoRequest("1.0", "sofa.apigateway.api.authapp.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过API ID查询授权App列表
         * Summary: 通过API ID查询授权App列表
         */
        public async Task<AllApiAuthappResponse> AllApiAuthappExAsync(AllApiAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApiAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.authapp.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过API ID查询授权App分页列表
         * Summary: 通过API ID查询授权App分页列表
         */
        public ListApiAuthappResponse ListApiAuthapp(ListApiAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApiAuthappEx(request, headers, runtime);
        }

        /**
         * Description: 通过API ID查询授权App分页列表
         * Summary: 通过API ID查询授权App分页列表
         */
        public async Task<ListApiAuthappResponse> ListApiAuthappAsync(ListApiAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApiAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过API ID查询授权App分页列表
         * Summary: 通过API ID查询授权App分页列表
         */
        public ListApiAuthappResponse ListApiAuthappEx(ListApiAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApiAuthappResponse>(DoRequest("1.0", "sofa.apigateway.api.authapp.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过API ID查询授权App分页列表
         * Summary: 通过API ID查询授权App分页列表
         */
        public async Task<ListApiAuthappResponse> ListApiAuthappExAsync(ListApiAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApiAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.authapp.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过App ID查询API列表
         * Summary: 通过App ID查询API列表
         */
        public AllAppApiResponse AllAppApi(AllAppApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllAppApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过App ID查询API列表
         * Summary: 通过App ID查询API列表
         */
        public async Task<AllAppApiResponse> AllAppApiAsync(AllAppApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllAppApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过App ID查询API列表
         * Summary: 通过App ID查询API列表
         */
        public AllAppApiResponse AllAppApiEx(AllAppApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAppApiResponse>(DoRequest("1.0", "sofa.apigateway.app.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过App ID查询API列表
         * Summary: 通过App ID查询API列表
         */
        public async Task<AllAppApiResponse> AllAppApiExAsync(AllAppApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAppApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.app.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过App ID查询API分页列表
         * Summary: 通过App ID查询API分页列表
         */
        public ListAppApiResponse ListAppApi(ListAppApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过App ID查询API分页列表
         * Summary: 通过App ID查询API分页列表
         */
        public async Task<ListAppApiResponse> ListAppApiAsync(ListAppApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过App ID查询API分页列表
         * Summary: 通过App ID查询API分页列表
         */
        public ListAppApiResponse ListAppApiEx(ListAppApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppApiResponse>(DoRequest("1.0", "sofa.apigateway.app.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过App ID查询API分页列表
         * Summary: 通过App ID查询API分页列表
         */
        public async Task<ListAppApiResponse> ListAppApiExAsync(ListAppApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.app.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取随机密钥
         * Summary: 获取随机密钥
         */
        public GetCommonRandomakskResponse GetCommonRandomaksk(GetCommonRandomakskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCommonRandomakskEx(request, headers, runtime);
        }

        /**
         * Description: 获取随机密钥
         * Summary: 获取随机密钥
         */
        public async Task<GetCommonRandomakskResponse> GetCommonRandomakskAsync(GetCommonRandomakskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCommonRandomakskExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取随机密钥
         * Summary: 获取随机密钥
         */
        public GetCommonRandomakskResponse GetCommonRandomakskEx(GetCommonRandomakskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCommonRandomakskResponse>(DoRequest("1.0", "sofa.apigateway.common.randomaksk.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取随机密钥
         * Summary: 获取随机密钥
         */
        public async Task<GetCommonRandomakskResponse> GetCommonRandomakskExAsync(GetCommonRandomakskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCommonRandomakskResponse>(await DoRequestAsync("1.0", "sofa.apigateway.common.randomaksk.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建联系方式
         * Summary: 创建联系方式
         */
        public CreateContactResponse CreateContact(CreateContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContactEx(request, headers, runtime);
        }

        /**
         * Description: 创建联系方式
         * Summary: 创建联系方式
         */
        public async Task<CreateContactResponse> CreateContactAsync(CreateContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContactExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建联系方式
         * Summary: 创建联系方式
         */
        public CreateContactResponse CreateContactEx(CreateContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContactResponse>(DoRequest("1.0", "sofa.apigateway.contact.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建联系方式
         * Summary: 创建联系方式
         */
        public async Task<CreateContactResponse> CreateContactExAsync(CreateContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContactResponse>(await DoRequestAsync("1.0", "sofa.apigateway.contact.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新联系方式
         * Summary: 更新联系方式
         */
        public UpdateContactResponse UpdateContact(UpdateContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContactEx(request, headers, runtime);
        }

        /**
         * Description: 更新联系方式
         * Summary: 更新联系方式
         */
        public async Task<UpdateContactResponse> UpdateContactAsync(UpdateContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContactExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新联系方式
         * Summary: 更新联系方式
         */
        public UpdateContactResponse UpdateContactEx(UpdateContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContactResponse>(DoRequest("1.0", "sofa.apigateway.contact.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新联系方式
         * Summary: 更新联系方式
         */
        public async Task<UpdateContactResponse> UpdateContactExAsync(UpdateContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContactResponse>(await DoRequestAsync("1.0", "sofa.apigateway.contact.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除联系方式
         * Summary: 删除联系方式
         */
        public DeleteContactResponse DeleteContact(DeleteContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteContactEx(request, headers, runtime);
        }

        /**
         * Description: 删除联系方式
         * Summary: 删除联系方式
         */
        public async Task<DeleteContactResponse> DeleteContactAsync(DeleteContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteContactExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除联系方式
         * Summary: 删除联系方式
         */
        public DeleteContactResponse DeleteContactEx(DeleteContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContactResponse>(DoRequest("1.0", "sofa.apigateway.contact.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除联系方式
         * Summary: 删除联系方式
         */
        public async Task<DeleteContactResponse> DeleteContactExAsync(DeleteContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContactResponse>(await DoRequestAsync("1.0", "sofa.apigateway.contact.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询联系方式
         * Summary: 通过ID查询联系方式
         */
        public GetContactResponse GetContact(GetContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContactEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询联系方式
         * Summary: 通过ID查询联系方式
         */
        public async Task<GetContactResponse> GetContactAsync(GetContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContactExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询联系方式
         * Summary: 通过ID查询联系方式
         */
        public GetContactResponse GetContactEx(GetContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContactResponse>(DoRequest("1.0", "sofa.apigateway.contact.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询联系方式
         * Summary: 通过ID查询联系方式
         */
        public async Task<GetContactResponse> GetContactExAsync(GetContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContactResponse>(await DoRequestAsync("1.0", "sofa.apigateway.contact.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询联系方式分页列表
         * Summary: 查询联系方式分页列表
         */
        public ListContactResponse ListContact(ListContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContactEx(request, headers, runtime);
        }

        /**
         * Description: 查询联系方式分页列表
         * Summary: 查询联系方式分页列表
         */
        public async Task<ListContactResponse> ListContactAsync(ListContactRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContactExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询联系方式分页列表
         * Summary: 查询联系方式分页列表
         */
        public ListContactResponse ListContactEx(ListContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContactResponse>(DoRequest("1.0", "sofa.apigateway.contact.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询联系方式分页列表
         * Summary: 查询联系方式分页列表
         */
        public async Task<ListContactResponse> ListContactExAsync(ListContactRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContactResponse>(await DoRequestAsync("1.0", "sofa.apigateway.contact.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过授权App ID查询联系方式列表
         * Summary: 通过授权App ID查询联系方式列表
         */
        public ListContactAuthappResponse ListContactAuthapp(ListContactAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContactAuthappEx(request, headers, runtime);
        }

        /**
         * Description: 通过授权App ID查询联系方式列表
         * Summary: 通过授权App ID查询联系方式列表
         */
        public async Task<ListContactAuthappResponse> ListContactAuthappAsync(ListContactAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContactAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过授权App ID查询联系方式列表
         * Summary: 通过授权App ID查询联系方式列表
         */
        public ListContactAuthappResponse ListContactAuthappEx(ListContactAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContactAuthappResponse>(DoRequest("1.0", "sofa.apigateway.contact.authapp.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过授权App ID查询联系方式列表
         * Summary: 通过授权App ID查询联系方式列表
         */
        public async Task<ListContactAuthappResponse> ListContactAuthappExAsync(ListContactAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContactAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.contact.authapp.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api解除授权App
         * Summary: api解除授权App
         */
        public UnmountApiAuthappResponse UnmountApiAuthapp(UnmountApiAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnmountApiAuthappEx(request, headers, runtime);
        }

        /**
         * Description: api解除授权App
         * Summary: api解除授权App
         */
        public async Task<UnmountApiAuthappResponse> UnmountApiAuthappAsync(UnmountApiAuthappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnmountApiAuthappExAsync(request, headers, runtime);
        }

        /**
         * Description: api解除授权App
         * Summary: api解除授权App
         */
        public UnmountApiAuthappResponse UnmountApiAuthappEx(UnmountApiAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountApiAuthappResponse>(DoRequest("1.0", "sofa.apigateway.api.authapp.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api解除授权App
         * Summary: api解除授权App
         */
        public async Task<UnmountApiAuthappResponse> UnmountApiAuthappExAsync(UnmountApiAuthappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountApiAuthappResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.authapp.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定版本的api
         * Summary: 获取指定版本的api
         */
        public GetApiVersionapiResponse GetApiVersionapi(GetApiVersionapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApiVersionapiEx(request, headers, runtime);
        }

        /**
         * Description: 获取指定版本的api
         * Summary: 获取指定版本的api
         */
        public async Task<GetApiVersionapiResponse> GetApiVersionapiAsync(GetApiVersionapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApiVersionapiExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取指定版本的api
         * Summary: 获取指定版本的api
         */
        public GetApiVersionapiResponse GetApiVersionapiEx(GetApiVersionapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiVersionapiResponse>(DoRequest("1.0", "sofa.apigateway.api.versionapi.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定版本的api
         * Summary: 获取指定版本的api
         */
        public async Task<GetApiVersionapiResponse> GetApiVersionapiExAsync(GetApiVersionapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiVersionapiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.versionapi.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建cors
         * Summary: 创建cors
         */
        public CreateCorsResponse CreateCors(CreateCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCorsEx(request, headers, runtime);
        }

        /**
         * Description: 创建cors
         * Summary: 创建cors
         */
        public async Task<CreateCorsResponse> CreateCorsAsync(CreateCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建cors
         * Summary: 创建cors
         */
        public CreateCorsResponse CreateCorsEx(CreateCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCorsResponse>(DoRequest("1.0", "sofa.apigateway.cors.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建cors
         * Summary: 创建cors
         */
        public async Task<CreateCorsResponse> CreateCorsExAsync(CreateCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCorsResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑cors
         * Summary: 编辑cors
         */
        public UpdateCorsResponse UpdateCors(UpdateCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCorsEx(request, headers, runtime);
        }

        /**
         * Description: 编辑cors
         * Summary: 编辑cors
         */
        public async Task<UpdateCorsResponse> UpdateCorsAsync(UpdateCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 编辑cors
         * Summary: 编辑cors
         */
        public UpdateCorsResponse UpdateCorsEx(UpdateCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCorsResponse>(DoRequest("1.0", "sofa.apigateway.cors.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑cors
         * Summary: 编辑cors
         */
        public async Task<UpdateCorsResponse> UpdateCorsExAsync(UpdateCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCorsResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除cors
         * Summary: 删除cors
         */
        public DeleteCorsResponse DeleteCors(DeleteCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteCorsEx(request, headers, runtime);
        }

        /**
         * Description: 删除cors
         * Summary: 删除cors
         */
        public async Task<DeleteCorsResponse> DeleteCorsAsync(DeleteCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteCorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除cors
         * Summary: 删除cors
         */
        public DeleteCorsResponse DeleteCorsEx(DeleteCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCorsResponse>(DoRequest("1.0", "sofa.apigateway.cors.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除cors
         * Summary: 删除cors
         */
        public async Task<DeleteCorsResponse> DeleteCorsExAsync(DeleteCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCorsResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询cors列表
         * Summary: 查询cors列表
         */
        public AllCorsResponse AllCors(AllCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllCorsEx(request, headers, runtime);
        }

        /**
         * Description: 查询cors列表
         * Summary: 查询cors列表
         */
        public async Task<AllCorsResponse> AllCorsAsync(AllCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllCorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询cors列表
         * Summary: 查询cors列表
         */
        public AllCorsResponse AllCorsEx(AllCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllCorsResponse>(DoRequest("1.0", "sofa.apigateway.cors.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询cors列表
         * Summary: 查询cors列表
         */
        public async Task<AllCorsResponse> AllCorsExAsync(AllCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllCorsResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询cors分页列表
         * Summary: 查询cors分页列表
         */
        public ListCorsResponse ListCors(ListCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCorsEx(request, headers, runtime);
        }

        /**
         * Description: 查询cors分页列表
         * Summary: 查询cors分页列表
         */
        public async Task<ListCorsResponse> ListCorsAsync(ListCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询cors分页列表
         * Summary: 查询cors分页列表
         */
        public ListCorsResponse ListCorsEx(ListCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCorsResponse>(DoRequest("1.0", "sofa.apigateway.cors.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询cors分页列表
         * Summary: 查询cors分页列表
         */
        public async Task<ListCorsResponse> ListCorsExAsync(ListCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCorsResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据ID查询cors
         * Summary: 根据ID查询cors
         */
        public GetCorsResponse GetCors(GetCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCorsEx(request, headers, runtime);
        }

        /**
         * Description: 根据ID查询cors
         * Summary: 根据ID查询cors
         */
        public async Task<GetCorsResponse> GetCorsAsync(GetCorsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCorsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据ID查询cors
         * Summary: 根据ID查询cors
         */
        public GetCorsResponse GetCorsEx(GetCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCorsResponse>(DoRequest("1.0", "sofa.apigateway.cors.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据ID查询cors
         * Summary: 根据ID查询cors
         */
        public async Task<GetCorsResponse> GetCorsExAsync(GetCorsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCorsResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据 cors ID 查询 API 列表
         * Summary: 根据 cors ID 查询 API 列表
         */
        public AllCorsApiResponse AllCorsApi(AllCorsApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllCorsApiEx(request, headers, runtime);
        }

        /**
         * Description: 根据 cors ID 查询 API 列表
         * Summary: 根据 cors ID 查询 API 列表
         */
        public async Task<AllCorsApiResponse> AllCorsApiAsync(AllCorsApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllCorsApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据 cors ID 查询 API 列表
         * Summary: 根据 cors ID 查询 API 列表
         */
        public AllCorsApiResponse AllCorsApiEx(AllCorsApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllCorsApiResponse>(DoRequest("1.0", "sofa.apigateway.cors.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据 cors ID 查询 API 列表
         * Summary: 根据 cors ID 查询 API 列表
         */
        public async Task<AllCorsApiResponse> AllCorsApiExAsync(AllCorsApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllCorsApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据cors ID查询API分页列表
         * Summary: 根据cors ID查询API分页列表
         */
        public ListCorsApiResponse ListCorsApi(ListCorsApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCorsApiEx(request, headers, runtime);
        }

        /**
         * Description: 根据cors ID查询API分页列表
         * Summary: 根据cors ID查询API分页列表
         */
        public async Task<ListCorsApiResponse> ListCorsApiAsync(ListCorsApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCorsApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据cors ID查询API分页列表
         * Summary: 根据cors ID查询API分页列表
         */
        public ListCorsApiResponse ListCorsApiEx(ListCorsApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCorsApiResponse>(DoRequest("1.0", "sofa.apigateway.cors.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据cors ID查询API分页列表
         * Summary: 根据cors ID查询API分页列表
         */
        public async Task<ListCorsApiResponse> ListCorsApiExAsync(ListCorsApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCorsApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据cors ID绑定API
         * Summary: 根据cors ID绑定API
         */
        public MountCorsApiResponse MountCorsApi(MountCorsApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MountCorsApiEx(request, headers, runtime);
        }

        /**
         * Description: 根据cors ID绑定API
         * Summary: 根据cors ID绑定API
         */
        public async Task<MountCorsApiResponse> MountCorsApiAsync(MountCorsApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MountCorsApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据cors ID绑定API
         * Summary: 根据cors ID绑定API
         */
        public MountCorsApiResponse MountCorsApiEx(MountCorsApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountCorsApiResponse>(DoRequest("1.0", "sofa.apigateway.cors.api.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据cors ID绑定API
         * Summary: 根据cors ID绑定API
         */
        public async Task<MountCorsApiResponse> MountCorsApiExAsync(MountCorsApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountCorsApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.api.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据cors ID 解绑API
         * Summary: 根据cors ID 解绑API
         */
        public UnmountCorsApiResponse UnmountCorsApi(UnmountCorsApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnmountCorsApiEx(request, headers, runtime);
        }

        /**
         * Description: 根据cors ID 解绑API
         * Summary: 根据cors ID 解绑API
         */
        public async Task<UnmountCorsApiResponse> UnmountCorsApiAsync(UnmountCorsApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnmountCorsApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据cors ID 解绑API
         * Summary: 根据cors ID 解绑API
         */
        public UnmountCorsApiResponse UnmountCorsApiEx(UnmountCorsApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountCorsApiResponse>(DoRequest("1.0", "sofa.apigateway.cors.api.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据cors ID 解绑API
         * Summary: 根据cors ID 解绑API
         */
        public async Task<UnmountCorsApiResponse> UnmountCorsApiExAsync(UnmountCorsApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountCorsApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.cors.api.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: API调试
         * Summary: API调试
         */
        public ExecTestHttpResponse ExecTestHttp(ExecTestHttpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecTestHttpEx(request, headers, runtime);
        }

        /**
         * Description: API调试
         * Summary: API调试
         */
        public async Task<ExecTestHttpResponse> ExecTestHttpAsync(ExecTestHttpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecTestHttpExAsync(request, headers, runtime);
        }

        /**
         * Description: API调试
         * Summary: API调试
         */
        public ExecTestHttpResponse ExecTestHttpEx(ExecTestHttpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecTestHttpResponse>(DoRequest("1.0", "sofa.apigateway.test.http.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: API调试
         * Summary: API调试
         */
        public async Task<ExecTestHttpResponse> ExecTestHttpExAsync(ExecTestHttpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecTestHttpResponse>(await DoRequestAsync("1.0", "sofa.apigateway.test.http.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新授权应用限流
         * Summary: 更新授权应用限流
         */
        public UpdateApiAuthapplimitResponse UpdateApiAuthapplimit(UpdateApiAuthapplimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApiAuthapplimitEx(request, headers, runtime);
        }

        /**
         * Description: 更新授权应用限流
         * Summary: 更新授权应用限流
         */
        public async Task<UpdateApiAuthapplimitResponse> UpdateApiAuthapplimitAsync(UpdateApiAuthapplimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApiAuthapplimitExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新授权应用限流
         * Summary: 更新授权应用限流
         */
        public UpdateApiAuthapplimitResponse UpdateApiAuthapplimitEx(UpdateApiAuthapplimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiAuthapplimitResponse>(DoRequest("1.0", "sofa.apigateway.api.authapplimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新授权应用限流
         * Summary: 更新授权应用限流
         */
        public async Task<UpdateApiAuthapplimitResponse> UpdateApiAuthapplimitExAsync(UpdateApiAuthapplimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiAuthapplimitResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.authapplimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权应用限制
         * Summary: 查询授权应用限制
         */
        public GetApiAuthapplimitResponse GetApiAuthapplimit(GetApiAuthapplimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApiAuthapplimitEx(request, headers, runtime);
        }

        /**
         * Description: 查询授权应用限制
         * Summary: 查询授权应用限制
         */
        public async Task<GetApiAuthapplimitResponse> GetApiAuthapplimitAsync(GetApiAuthapplimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApiAuthapplimitExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询授权应用限制
         * Summary: 查询授权应用限制
         */
        public GetApiAuthapplimitResponse GetApiAuthapplimitEx(GetApiAuthapplimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiAuthapplimitResponse>(DoRequest("1.0", "sofa.apigateway.api.authapplimit.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询授权应用限制
         * Summary: 查询授权应用限制
         */
        public async Task<GetApiAuthapplimitResponse> GetApiAuthapplimitExAsync(GetApiAuthapplimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiAuthapplimitResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.authapplimit.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑限流配置
         * Summary: 编辑限流配置
         */
        public UpdateApiLimitconfigResponse UpdateApiLimitconfig(UpdateApiLimitconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApiLimitconfigEx(request, headers, runtime);
        }

        /**
         * Description: 编辑限流配置
         * Summary: 编辑限流配置
         */
        public async Task<UpdateApiLimitconfigResponse> UpdateApiLimitconfigAsync(UpdateApiLimitconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApiLimitconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 编辑限流配置
         * Summary: 编辑限流配置
         */
        public UpdateApiLimitconfigResponse UpdateApiLimitconfigEx(UpdateApiLimitconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiLimitconfigResponse>(DoRequest("1.0", "sofa.apigateway.api.limitconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑限流配置
         * Summary: 编辑限流配置
         */
        public async Task<UpdateApiLimitconfigResponse> UpdateApiLimitconfigExAsync(UpdateApiLimitconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiLimitconfigResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.limitconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新缓存信息
         * Summary: 更新缓存信息
         */
        public UpdateApiCacheinfoResponse UpdateApiCacheinfo(UpdateApiCacheinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApiCacheinfoEx(request, headers, runtime);
        }

        /**
         * Description: 更新缓存信息
         * Summary: 更新缓存信息
         */
        public async Task<UpdateApiCacheinfoResponse> UpdateApiCacheinfoAsync(UpdateApiCacheinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApiCacheinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新缓存信息
         * Summary: 更新缓存信息
         */
        public UpdateApiCacheinfoResponse UpdateApiCacheinfoEx(UpdateApiCacheinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiCacheinfoResponse>(DoRequest("1.0", "sofa.apigateway.api.cacheinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新缓存信息
         * Summary: 更新缓存信息
         */
        public async Task<UpdateApiCacheinfoResponse> UpdateApiCacheinfoExAsync(UpdateApiCacheinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiCacheinfoResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.cacheinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询监控
         * Summary: 查询监控
         */
        public QueryMonitorResponse QueryMonitor(QueryMonitorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMonitorEx(request, headers, runtime);
        }

        /**
         * Description: 查询监控
         * Summary: 查询监控
         */
        public async Task<QueryMonitorResponse> QueryMonitorAsync(QueryMonitorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMonitorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询监控
         * Summary: 查询监控
         */
        public QueryMonitorResponse QueryMonitorEx(QueryMonitorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonitorResponse>(DoRequest("1.0", "sofa.apigateway.monitor.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询监控
         * Summary: 查询监控
         */
        public async Task<QueryMonitorResponse> QueryMonitorExAsync(QueryMonitorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMonitorResponse>(await DoRequestAsync("1.0", "sofa.apigateway.monitor.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询结果码
         * Summary: 查询结果码
         */
        public QueryResultcodeResponse QueryResultcode(QueryResultcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryResultcodeEx(request, headers, runtime);
        }

        /**
         * Description: 查询结果码
         * Summary: 查询结果码
         */
        public async Task<QueryResultcodeResponse> QueryResultcodeAsync(QueryResultcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryResultcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询结果码
         * Summary: 查询结果码
         */
        public QueryResultcodeResponse QueryResultcodeEx(QueryResultcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResultcodeResponse>(DoRequest("1.0", "sofa.apigateway.resultcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询结果码
         * Summary: 查询结果码
         */
        public async Task<QueryResultcodeResponse> QueryResultcodeExAsync(QueryResultcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResultcodeResponse>(await DoRequestAsync("1.0", "sofa.apigateway.resultcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上线指定版本api
         * Summary: 上线指定版本api
         */
        public OnlineApiVersionResponse OnlineApiVersion(OnlineApiVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineApiVersionEx(request, headers, runtime);
        }

        /**
         * Description: 上线指定版本api
         * Summary: 上线指定版本api
         */
        public async Task<OnlineApiVersionResponse> OnlineApiVersionAsync(OnlineApiVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineApiVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 上线指定版本api
         * Summary: 上线指定版本api
         */
        public OnlineApiVersionResponse OnlineApiVersionEx(OnlineApiVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineApiVersionResponse>(DoRequest("1.0", "sofa.apigateway.api.version.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上线指定版本api
         * Summary: 上线指定版本api
         */
        public async Task<OnlineApiVersionResponse> OnlineApiVersionExAsync(OnlineApiVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineApiVersionResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.version.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建LDC规则
         * Summary: 创建LDC规则
         */
        public CreateLdcResponse CreateLdc(CreateLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLdcEx(request, headers, runtime);
        }

        /**
         * Description: 创建LDC规则
         * Summary: 创建LDC规则
         */
        public async Task<CreateLdcResponse> CreateLdcAsync(CreateLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLdcExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建LDC规则
         * Summary: 创建LDC规则
         */
        public CreateLdcResponse CreateLdcEx(CreateLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLdcResponse>(DoRequest("1.0", "sofa.apigateway.ldc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建LDC规则
         * Summary: 创建LDC规则
         */
        public async Task<CreateLdcResponse> CreateLdcExAsync(CreateLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLdcResponse>(await DoRequestAsync("1.0", "sofa.apigateway.ldc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改 LDC规则
         * Summary: 修改 LDC规则
         */
        public UpdateLdcResponse UpdateLdc(UpdateLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLdcEx(request, headers, runtime);
        }

        /**
         * Description: 修改 LDC规则
         * Summary: 修改 LDC规则
         */
        public async Task<UpdateLdcResponse> UpdateLdcAsync(UpdateLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLdcExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改 LDC规则
         * Summary: 修改 LDC规则
         */
        public UpdateLdcResponse UpdateLdcEx(UpdateLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLdcResponse>(DoRequest("1.0", "sofa.apigateway.ldc.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改 LDC规则
         * Summary: 修改 LDC规则
         */
        public async Task<UpdateLdcResponse> UpdateLdcExAsync(UpdateLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLdcResponse>(await DoRequestAsync("1.0", "sofa.apigateway.ldc.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除LDC规则
         * Summary: 删除LDC规则
         */
        public DeleteLdcResponse DeleteLdc(DeleteLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteLdcEx(request, headers, runtime);
        }

        /**
         * Description: 删除LDC规则
         * Summary: 删除LDC规则
         */
        public async Task<DeleteLdcResponse> DeleteLdcAsync(DeleteLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteLdcExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除LDC规则
         * Summary: 删除LDC规则
         */
        public DeleteLdcResponse DeleteLdcEx(DeleteLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLdcResponse>(DoRequest("1.0", "sofa.apigateway.ldc.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除LDC规则
         * Summary: 删除LDC规则
         */
        public async Task<DeleteLdcResponse> DeleteLdcExAsync(DeleteLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteLdcResponse>(await DoRequestAsync("1.0", "sofa.apigateway.ldc.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询ldc规则
         * Summary: 查询ldc规则
         */
        public GetLdcResponse GetLdc(GetLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLdcEx(request, headers, runtime);
        }

        /**
         * Description: 查询ldc规则
         * Summary: 查询ldc规则
         */
        public async Task<GetLdcResponse> GetLdcAsync(GetLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLdcExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询ldc规则
         * Summary: 查询ldc规则
         */
        public GetLdcResponse GetLdcEx(GetLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLdcResponse>(DoRequest("1.0", "sofa.apigateway.ldc.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询ldc规则
         * Summary: 查询ldc规则
         */
        public async Task<GetLdcResponse> GetLdcExAsync(GetLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLdcResponse>(await DoRequestAsync("1.0", "sofa.apigateway.ldc.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存ldc规则
         * Summary: 保存ldc规则
         */
        public SaveLdcResponse SaveLdc(SaveLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveLdcEx(request, headers, runtime);
        }

        /**
         * Description: 保存ldc规则
         * Summary: 保存ldc规则
         */
        public async Task<SaveLdcResponse> SaveLdcAsync(SaveLdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveLdcExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存ldc规则
         * Summary: 保存ldc规则
         */
        public SaveLdcResponse SaveLdcEx(SaveLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveLdcResponse>(DoRequest("1.0", "sofa.apigateway.ldc.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存ldc规则
         * Summary: 保存ldc规则
         */
        public async Task<SaveLdcResponse> SaveLdcExAsync(SaveLdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveLdcResponse>(await DoRequestAsync("1.0", "sofa.apigateway.ldc.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权APP绑定API
         * Summary: 授权APP绑定API
         */
        public MountAuthappApiResponse MountAuthappApi(MountAuthappApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MountAuthappApiEx(request, headers, runtime);
        }

        /**
         * Description: 授权APP绑定API
         * Summary: 授权APP绑定API
         */
        public async Task<MountAuthappApiResponse> MountAuthappApiAsync(MountAuthappApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MountAuthappApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权APP绑定API
         * Summary: 授权APP绑定API
         */
        public MountAuthappApiResponse MountAuthappApiEx(MountAuthappApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountAuthappApiResponse>(DoRequest("1.0", "sofa.apigateway.authapp.api.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权APP绑定API
         * Summary: 授权APP绑定API
         */
        public async Task<MountAuthappApiResponse> MountAuthappApiExAsync(MountAuthappApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountAuthappApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.api.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权app解除绑定Api
         * Summary: 授权app解除绑定Api
         */
        public UnmountAuthappApiResponse UnmountAuthappApi(UnmountAuthappApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnmountAuthappApiEx(request, headers, runtime);
        }

        /**
         * Description: 授权app解除绑定Api
         * Summary: 授权app解除绑定Api
         */
        public async Task<UnmountAuthappApiResponse> UnmountAuthappApiAsync(UnmountAuthappApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnmountAuthappApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权app解除绑定Api
         * Summary: 授权app解除绑定Api
         */
        public UnmountAuthappApiResponse UnmountAuthappApiEx(UnmountAuthappApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountAuthappApiResponse>(DoRequest("1.0", "sofa.apigateway.authapp.api.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权app解除绑定Api
         * Summary: 授权app解除绑定Api
         */
        public async Task<UnmountAuthappApiResponse> UnmountAuthappApiExAsync(UnmountAuthappApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountAuthappApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.authapp.api.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入 API
         * Summary: 导入 API
         */
        public ImportApiResponse ImportApi(ImportApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportApiEx(request, headers, runtime);
        }

        /**
         * Description: 导入 API
         * Summary: 导入 API
         */
        public async Task<ImportApiResponse> ImportApiAsync(ImportApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入 API
         * Summary: 导入 API
         */
        public ImportApiResponse ImportApiEx(ImportApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportApiResponse>(DoRequest("1.0", "sofa.apigateway.api.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入 API
         * Summary: 导入 API
         */
        public async Task<ImportApiResponse> ImportApiExAsync(ImportApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api批量导出
         * Summary: api批量导出
         */
        public ExportApiResponse ExportApi(ExportApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportApiEx(request, headers, runtime);
        }

        /**
         * Description: api批量导出
         * Summary: api批量导出
         */
        public async Task<ExportApiResponse> ExportApiAsync(ExportApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportApiExAsync(request, headers, runtime);
        }

        /**
         * Description: api批量导出
         * Summary: api批量导出
         */
        public ExportApiResponse ExportApiEx(ExportApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportApiResponse>(DoRequest("1.0", "sofa.apigateway.api.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api批量导出
         * Summary: api批量导出
         */
        public async Task<ExportApiResponse> ExportApiExAsync(ExportApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据API分组ID导出API
         * Summary: 根据API分组ID导出API
         */
        public ExportApigroupApiResponse ExportApigroupApi(ExportApigroupApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportApigroupApiEx(request, headers, runtime);
        }

        /**
         * Description: 根据API分组ID导出API
         * Summary: 根据API分组ID导出API
         */
        public async Task<ExportApigroupApiResponse> ExportApigroupApiAsync(ExportApigroupApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportApigroupApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据API分组ID导出API
         * Summary: 根据API分组ID导出API
         */
        public ExportApigroupApiResponse ExportApigroupApiEx(ExportApigroupApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportApigroupApiResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.api.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据API分组ID导出API
         * Summary: 根据API分组ID导出API
         */
        public async Task<ExportApigroupApiResponse> ExportApigroupApiExAsync(ExportApigroupApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportApigroupApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.api.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建参数映射
         * Summary: 创建参数映射
         */
        public CreateParammappingResponse CreateParammapping(CreateParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateParammappingEx(request, headers, runtime);
        }

        /**
         * Description: 创建参数映射
         * Summary: 创建参数映射
         */
        public async Task<CreateParammappingResponse> CreateParammappingAsync(CreateParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateParammappingExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建参数映射
         * Summary: 创建参数映射
         */
        public CreateParammappingResponse CreateParammappingEx(CreateParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateParammappingResponse>(DoRequest("1.0", "sofa.apigateway.parammapping.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建参数映射
         * Summary: 创建参数映射
         */
        public async Task<CreateParammappingResponse> CreateParammappingExAsync(CreateParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateParammappingResponse>(await DoRequestAsync("1.0", "sofa.apigateway.parammapping.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  更新参数映射
         * Summary:  更新参数映射
         */
        public UpdateParammappingResponse UpdateParammapping(UpdateParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateParammappingEx(request, headers, runtime);
        }

        /**
         * Description:  更新参数映射
         * Summary:  更新参数映射
         */
        public async Task<UpdateParammappingResponse> UpdateParammappingAsync(UpdateParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateParammappingExAsync(request, headers, runtime);
        }

        /**
         * Description:  更新参数映射
         * Summary:  更新参数映射
         */
        public UpdateParammappingResponse UpdateParammappingEx(UpdateParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateParammappingResponse>(DoRequest("1.0", "sofa.apigateway.parammapping.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  更新参数映射
         * Summary:  更新参数映射
         */
        public async Task<UpdateParammappingResponse> UpdateParammappingExAsync(UpdateParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateParammappingResponse>(await DoRequestAsync("1.0", "sofa.apigateway.parammapping.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除参数映射
         * Summary: 删除参数映射
         */
        public DeleteParammappingResponse DeleteParammapping(DeleteParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteParammappingEx(request, headers, runtime);
        }

        /**
         * Description: 删除参数映射
         * Summary: 删除参数映射
         */
        public async Task<DeleteParammappingResponse> DeleteParammappingAsync(DeleteParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteParammappingExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除参数映射
         * Summary: 删除参数映射
         */
        public DeleteParammappingResponse DeleteParammappingEx(DeleteParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteParammappingResponse>(DoRequest("1.0", "sofa.apigateway.parammapping.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除参数映射
         * Summary: 删除参数映射
         */
        public async Task<DeleteParammappingResponse> DeleteParammappingExAsync(DeleteParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteParammappingResponse>(await DoRequestAsync("1.0", "sofa.apigateway.parammapping.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询参数映射分页列表
         * Summary: 查询参数映射分页列表
         */
        public ListParammappingResponse ListParammapping(ListParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListParammappingEx(request, headers, runtime);
        }

        /**
         * Description: 查询参数映射分页列表
         * Summary: 查询参数映射分页列表
         */
        public async Task<ListParammappingResponse> ListParammappingAsync(ListParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListParammappingExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询参数映射分页列表
         * Summary: 查询参数映射分页列表
         */
        public ListParammappingResponse ListParammappingEx(ListParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListParammappingResponse>(DoRequest("1.0", "sofa.apigateway.parammapping.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询参数映射分页列表
         * Summary: 查询参数映射分页列表
         */
        public async Task<ListParammappingResponse> ListParammappingExAsync(ListParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListParammappingResponse>(await DoRequestAsync("1.0", "sofa.apigateway.parammapping.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API列表
         * Summary: 查询API列表
         */
        public AllParammappingResponse AllParammapping(AllParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllParammappingEx(request, headers, runtime);
        }

        /**
         * Description: 查询API列表
         * Summary: 查询API列表
         */
        public async Task<AllParammappingResponse> AllParammappingAsync(AllParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllParammappingExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询API列表
         * Summary: 查询API列表
         */
        public AllParammappingResponse AllParammappingEx(AllParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllParammappingResponse>(DoRequest("1.0", "sofa.apigateway.parammapping.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询API列表
         * Summary: 查询API列表
         */
        public async Task<AllParammappingResponse> AllParammappingExAsync(AllParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllParammappingResponse>(await DoRequestAsync("1.0", "sofa.apigateway.parammapping.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过IDF查询参数映射
         * Summary: 通过IDF查询参数映射
         */
        public GetParammappingResponse GetParammapping(GetParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetParammappingEx(request, headers, runtime);
        }

        /**
         * Description: 通过IDF查询参数映射
         * Summary: 通过IDF查询参数映射
         */
        public async Task<GetParammappingResponse> GetParammappingAsync(GetParammappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetParammappingExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过IDF查询参数映射
         * Summary: 通过IDF查询参数映射
         */
        public GetParammappingResponse GetParammappingEx(GetParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetParammappingResponse>(DoRequest("1.0", "sofa.apigateway.parammapping.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过IDF查询参数映射
         * Summary: 通过IDF查询参数映射
         */
        public async Task<GetParammappingResponse> GetParammappingExAsync(GetParammappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetParammappingResponse>(await DoRequestAsync("1.0", "sofa.apigateway.parammapping.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据映射参数ID查询api分页列表
         * Summary: 根据映射参数ID查询api分页列表
         */
        public ListParammappingApiResponse ListParammappingApi(ListParammappingApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListParammappingApiEx(request, headers, runtime);
        }

        /**
         * Description: 根据映射参数ID查询api分页列表
         * Summary: 根据映射参数ID查询api分页列表
         */
        public async Task<ListParammappingApiResponse> ListParammappingApiAsync(ListParammappingApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListParammappingApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据映射参数ID查询api分页列表
         * Summary: 根据映射参数ID查询api分页列表
         */
        public ListParammappingApiResponse ListParammappingApiEx(ListParammappingApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListParammappingApiResponse>(DoRequest("1.0", "sofa.apigateway.parammapping.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据映射参数ID查询api分页列表
         * Summary: 根据映射参数ID查询api分页列表
         */
        public async Task<ListParammappingApiResponse> ListParammappingApiExAsync(ListParammappingApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListParammappingApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.parammapping.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型列表
         * Summary: 查询模型列表
         */
        public AllApimodelResponse AllApimodel(AllApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllApimodelEx(request, headers, runtime);
        }

        /**
         * Description: 查询模型列表
         * Summary: 查询模型列表
         */
        public async Task<AllApimodelResponse> AllApimodelAsync(AllApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllApimodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询模型列表
         * Summary: 查询模型列表
         */
        public AllApimodelResponse AllApimodelEx(AllApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApimodelResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型列表
         * Summary: 查询模型列表
         */
        public async Task<AllApimodelResponse> AllApimodelExAsync(AllApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApimodelResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api模板分页列表
         * Summary: 查询模型分页列表
         */
        public ListApimodelResponse ListApimodel(ListApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApimodelEx(request, headers, runtime);
        }

        /**
         * Description: 查询api模板分页列表
         * Summary: 查询模型分页列表
         */
        public async Task<ListApimodelResponse> ListApimodelAsync(ListApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApimodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询api模板分页列表
         * Summary: 查询模型分页列表
         */
        public ListApimodelResponse ListApimodelEx(ListApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApimodelResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api模板分页列表
         * Summary: 查询模型分页列表
         */
        public async Task<ListApimodelResponse> ListApimodelExAsync(ListApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApimodelResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建api模型
         * Summary: 创建api模型
         */
        public CreateApimodelResponse CreateApimodel(CreateApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApimodelEx(request, headers, runtime);
        }

        /**
         * Description: 创建api模型
         * Summary: 创建api模型
         */
        public async Task<CreateApimodelResponse> CreateApimodelAsync(CreateApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApimodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建api模型
         * Summary: 创建api模型
         */
        public CreateApimodelResponse CreateApimodelEx(CreateApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApimodelResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建api模型
         * Summary: 创建api模型
         */
        public async Task<CreateApimodelResponse> CreateApimodelExAsync(CreateApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApimodelResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除api模型
         * Summary: 删除api模型
         */
        public DeleteApimodelResponse DeleteApimodel(DeleteApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApimodelEx(request, headers, runtime);
        }

        /**
         * Description: 删除api模型
         * Summary: 删除api模型
         */
        public async Task<DeleteApimodelResponse> DeleteApimodelAsync(DeleteApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApimodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除api模型
         * Summary: 删除api模型
         */
        public DeleteApimodelResponse DeleteApimodelEx(DeleteApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApimodelResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除api模型
         * Summary: 删除api模型
         */
        public async Task<DeleteApimodelResponse> DeleteApimodelExAsync(DeleteApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApimodelResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据模型ID查询模型
         * Summary: 根据模型ID查询模型
         */
        public GetApimodelResponse GetApimodel(GetApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApimodelEx(request, headers, runtime);
        }

        /**
         * Description: 根据模型ID查询模型
         * Summary: 根据模型ID查询模型
         */
        public async Task<GetApimodelResponse> GetApimodelAsync(GetApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApimodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据模型ID查询模型
         * Summary: 根据模型ID查询模型
         */
        public GetApimodelResponse GetApimodelEx(GetApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApimodelResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据模型ID查询模型
         * Summary: 根据模型ID查询模型
         */
        public async Task<GetApimodelResponse> GetApimodelExAsync(GetApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApimodelResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型
         * Summary: 更新模型
         */
        public UpdateApimodelResponse UpdateApimodel(UpdateApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApimodelEx(request, headers, runtime);
        }

        /**
         * Description: 更新模型
         * Summary: 更新模型
         */
        public async Task<UpdateApimodelResponse> UpdateApimodelAsync(UpdateApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApimodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新模型
         * Summary: 更新模型
         */
        public UpdateApimodelResponse UpdateApimodelEx(UpdateApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApimodelResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型
         * Summary: 更新模型
         */
        public async Task<UpdateApimodelResponse> UpdateApimodelExAsync(UpdateApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApimodelResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模型ID查询使用的API列表
         * Summary: 通过模型ID查询使用的API列表
         */
        public AllApimodelApiResponse AllApimodelApi(AllApimodelApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllApimodelApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过模型ID查询使用的API列表
         * Summary: 通过模型ID查询使用的API列表
         */
        public async Task<AllApimodelApiResponse> AllApimodelApiAsync(AllApimodelApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllApimodelApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过模型ID查询使用的API列表
         * Summary: 通过模型ID查询使用的API列表
         */
        public AllApimodelApiResponse AllApimodelApiEx(AllApimodelApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApimodelApiResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模型ID查询使用的API列表
         * Summary: 通过模型ID查询使用的API列表
         */
        public async Task<AllApimodelApiResponse> AllApimodelApiExAsync(AllApimodelApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApimodelApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模型ID查询使用的API分页列表
         * Summary: 通过模型ID查询使用的API分页列表
         */
        public ListApimodelApiResponse ListApimodelApi(ListApimodelApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApimodelApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过模型ID查询使用的API分页列表
         * Summary: 通过模型ID查询使用的API分页列表
         */
        public async Task<ListApimodelApiResponse> ListApimodelApiAsync(ListApimodelApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApimodelApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过模型ID查询使用的API分页列表
         * Summary: 通过模型ID查询使用的API分页列表
         */
        public ListApimodelApiResponse ListApimodelApiEx(ListApimodelApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApimodelApiResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模型ID查询使用的API分页列表
         * Summary: 通过模型ID查询使用的API分页列表
         */
        public async Task<ListApimodelApiResponse> ListApimodelApiExAsync(ListApimodelApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApimodelApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建外部授权
         * Summary: 创建外部授权
         */
        public CreateExternalauthResponse CreateExternalauth(CreateExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateExternalauthEx(request, headers, runtime);
        }

        /**
         * Description: 创建外部授权
         * Summary: 创建外部授权
         */
        public async Task<CreateExternalauthResponse> CreateExternalauthAsync(CreateExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateExternalauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建外部授权
         * Summary: 创建外部授权
         */
        public CreateExternalauthResponse CreateExternalauthEx(CreateExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateExternalauthResponse>(DoRequest("1.0", "sofa.apigateway.externalauth.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建外部授权
         * Summary: 创建外部授权
         */
        public async Task<CreateExternalauthResponse> CreateExternalauthExAsync(CreateExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateExternalauthResponse>(await DoRequestAsync("1.0", "sofa.apigateway.externalauth.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新外部系统
         * Summary: 更新外部系统
         */
        public UpdateExternalauthResponse UpdateExternalauth(UpdateExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateExternalauthEx(request, headers, runtime);
        }

        /**
         * Description: 更新外部系统
         * Summary: 更新外部系统
         */
        public async Task<UpdateExternalauthResponse> UpdateExternalauthAsync(UpdateExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateExternalauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新外部系统
         * Summary: 更新外部系统
         */
        public UpdateExternalauthResponse UpdateExternalauthEx(UpdateExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateExternalauthResponse>(DoRequest("1.0", "sofa.apigateway.externalauth.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新外部系统
         * Summary: 更新外部系统
         */
        public async Task<UpdateExternalauthResponse> UpdateExternalauthExAsync(UpdateExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateExternalauthResponse>(await DoRequestAsync("1.0", "sofa.apigateway.externalauth.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除外部授权
         * Summary: 删除外部授权
         */
        public DeleteExternalauthResponse DeleteExternalauth(DeleteExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteExternalauthEx(request, headers, runtime);
        }

        /**
         * Description: 删除外部授权
         * Summary: 删除外部授权
         */
        public async Task<DeleteExternalauthResponse> DeleteExternalauthAsync(DeleteExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteExternalauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除外部授权
         * Summary: 删除外部授权
         */
        public DeleteExternalauthResponse DeleteExternalauthEx(DeleteExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteExternalauthResponse>(DoRequest("1.0", "sofa.apigateway.externalauth.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除外部授权
         * Summary: 删除外部授权
         */
        public async Task<DeleteExternalauthResponse> DeleteExternalauthExAsync(DeleteExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteExternalauthResponse>(await DoRequestAsync("1.0", "sofa.apigateway.externalauth.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询外部授权
         * Summary: 通过ID查询外部授权
         */
        public GetExternalauthResponse GetExternalauth(GetExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetExternalauthEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询外部授权
         * Summary: 通过ID查询外部授权
         */
        public async Task<GetExternalauthResponse> GetExternalauthAsync(GetExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetExternalauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询外部授权
         * Summary: 通过ID查询外部授权
         */
        public GetExternalauthResponse GetExternalauthEx(GetExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetExternalauthResponse>(DoRequest("1.0", "sofa.apigateway.externalauth.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询外部授权
         * Summary: 通过ID查询外部授权
         */
        public async Task<GetExternalauthResponse> GetExternalauthExAsync(GetExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetExternalauthResponse>(await DoRequestAsync("1.0", "sofa.apigateway.externalauth.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询外部授权分页列表
         * Summary: 查询外部授权分页列表
         */
        public ListExternalauthResponse ListExternalauth(ListExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListExternalauthEx(request, headers, runtime);
        }

        /**
         * Description: 查询外部授权分页列表
         * Summary: 查询外部授权分页列表
         */
        public async Task<ListExternalauthResponse> ListExternalauthAsync(ListExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListExternalauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询外部授权分页列表
         * Summary: 查询外部授权分页列表
         */
        public ListExternalauthResponse ListExternalauthEx(ListExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListExternalauthResponse>(DoRequest("1.0", "sofa.apigateway.externalauth.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询外部授权分页列表
         * Summary: 查询外部授权分页列表
         */
        public async Task<ListExternalauthResponse> ListExternalauthExAsync(ListExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListExternalauthResponse>(await DoRequestAsync("1.0", "sofa.apigateway.externalauth.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询外部系统列表
         * Summary:  查询外部系统列表
         */
        public AllExternalauthResponse AllExternalauth(AllExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllExternalauthEx(request, headers, runtime);
        }

        /**
         * Description:  查询外部系统列表
         * Summary:  查询外部系统列表
         */
        public async Task<AllExternalauthResponse> AllExternalauthAsync(AllExternalauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllExternalauthExAsync(request, headers, runtime);
        }

        /**
         * Description:  查询外部系统列表
         * Summary:  查询外部系统列表
         */
        public AllExternalauthResponse AllExternalauthEx(AllExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllExternalauthResponse>(DoRequest("1.0", "sofa.apigateway.externalauth.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询外部系统列表
         * Summary:  查询外部系统列表
         */
        public async Task<AllExternalauthResponse> AllExternalauthExAsync(AllExternalauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllExternalauthResponse>(await DoRequestAsync("1.0", "sofa.apigateway.externalauth.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部授权绑定api
         * Summary: 外部授权绑定api
         */
        public MountExternalauthApiResponse MountExternalauthApi(MountExternalauthApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MountExternalauthApiEx(request, headers, runtime);
        }

        /**
         * Description: 外部授权绑定api
         * Summary: 外部授权绑定api
         */
        public async Task<MountExternalauthApiResponse> MountExternalauthApiAsync(MountExternalauthApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MountExternalauthApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部授权绑定api
         * Summary: 外部授权绑定api
         */
        public MountExternalauthApiResponse MountExternalauthApiEx(MountExternalauthApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountExternalauthApiResponse>(DoRequest("1.0", "sofa.apigateway.externalauth.api.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部授权绑定api
         * Summary: 外部授权绑定api
         */
        public async Task<MountExternalauthApiResponse> MountExternalauthApiExAsync(MountExternalauthApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountExternalauthApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.externalauth.api.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部授权解绑api
         * Summary: 外部授权解绑api
         */
        public UnmountExternalauthApiResponse UnmountExternalauthApi(UnmountExternalauthApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnmountExternalauthApiEx(request, headers, runtime);
        }

        /**
         * Description: 外部授权解绑api
         * Summary: 外部授权解绑api
         */
        public async Task<UnmountExternalauthApiResponse> UnmountExternalauthApiAsync(UnmountExternalauthApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnmountExternalauthApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部授权解绑api
         * Summary: 外部授权解绑api
         */
        public UnmountExternalauthApiResponse UnmountExternalauthApiEx(UnmountExternalauthApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountExternalauthApiResponse>(DoRequest("1.0", "sofa.apigateway.externalauth.api.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部授权解绑api
         * Summary: 外部授权解绑api
         */
        public async Task<UnmountExternalauthApiResponse> UnmountExternalauthApiExAsync(UnmountExternalauthApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountExternalauthApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.externalauth.api.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型参数
         * Summary: 删除模型参数
         */
        public DeleteApimodelParamResponse DeleteApimodelParam(DeleteApimodelParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApimodelParamEx(request, headers, runtime);
        }

        /**
         * Description: 删除模型参数
         * Summary: 删除模型参数
         */
        public async Task<DeleteApimodelParamResponse> DeleteApimodelParamAsync(DeleteApimodelParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApimodelParamExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除模型参数
         * Summary: 删除模型参数
         */
        public DeleteApimodelParamResponse DeleteApimodelParamEx(DeleteApimodelParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApimodelParamResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.param.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型参数
         * Summary: 删除模型参数
         */
        public async Task<DeleteApimodelParamResponse> DeleteApimodelParamExAsync(DeleteApimodelParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApimodelParamResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.param.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型参数
         * Summary: 更新模型参数
         */
        public UpdateApimodelParamResponse UpdateApimodelParam(UpdateApimodelParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApimodelParamEx(request, headers, runtime);
        }

        /**
         * Description: 更新模型参数
         * Summary: 更新模型参数
         */
        public async Task<UpdateApimodelParamResponse> UpdateApimodelParamAsync(UpdateApimodelParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApimodelParamExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新模型参数
         * Summary: 更新模型参数
         */
        public UpdateApimodelParamResponse UpdateApimodelParamEx(UpdateApimodelParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApimodelParamResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.param.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型参数
         * Summary: 更新模型参数
         */
        public async Task<UpdateApimodelParamResponse> UpdateApimodelParamExAsync(UpdateApimodelParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApimodelParamResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.param.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增模型参数
         * Summary: 新增模型参数
         */
        public CreateApimodelParamResponse CreateApimodelParam(CreateApimodelParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApimodelParamEx(request, headers, runtime);
        }

        /**
         * Description: 新增模型参数
         * Summary: 新增模型参数
         */
        public async Task<CreateApimodelParamResponse> CreateApimodelParamAsync(CreateApimodelParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApimodelParamExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增模型参数
         * Summary: 新增模型参数
         */
        public CreateApimodelParamResponse CreateApimodelParamEx(CreateApimodelParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApimodelParamResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.param.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增模型参数
         * Summary: 新增模型参数
         */
        public async Task<CreateApimodelParamResponse> CreateApimodelParamExAsync(CreateApimodelParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApimodelParamResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.param.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过外部授权ID查询API分页列表
         * Summary: 通过外部授权ID查询API分页列表
         */
        public ListExternalauthApiResponse ListExternalauthApi(ListExternalauthApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListExternalauthApiEx(request, headers, runtime);
        }

        /**
         * Description: 通过外部授权ID查询API分页列表
         * Summary: 通过外部授权ID查询API分页列表
         */
        public async Task<ListExternalauthApiResponse> ListExternalauthApiAsync(ListExternalauthApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListExternalauthApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过外部授权ID查询API分页列表
         * Summary: 通过外部授权ID查询API分页列表
         */
        public ListExternalauthApiResponse ListExternalauthApiEx(ListExternalauthApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListExternalauthApiResponse>(DoRequest("1.0", "sofa.apigateway.externalauth.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过外部授权ID查询API分页列表
         * Summary: 通过外部授权ID查询API分页列表
         */
        public async Task<ListExternalauthApiResponse> ListExternalauthApiExAsync(ListExternalauthApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListExternalauthApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.externalauth.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校检 模型引用是否死循环
         * Summary: 校检 模型引用是否死循环
         */
        public CheckApimodelParamResponse CheckApimodelParam(CheckApimodelParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckApimodelParamEx(request, headers, runtime);
        }

        /**
         * Description: 校检 模型引用是否死循环
         * Summary: 校检 模型引用是否死循环
         */
        public async Task<CheckApimodelParamResponse> CheckApimodelParamAsync(CheckApimodelParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckApimodelParamExAsync(request, headers, runtime);
        }

        /**
         * Description: 校检 模型引用是否死循环
         * Summary: 校检 模型引用是否死循环
         */
        public CheckApimodelParamResponse CheckApimodelParamEx(CheckApimodelParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckApimodelParamResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.param.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校检 模型引用是否死循环
         * Summary: 校检 模型引用是否死循环
         */
        public async Task<CheckApimodelParamResponse> CheckApimodelParamExAsync(CheckApimodelParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckApimodelParamResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.param.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解析数据模型
         * Summary: 解析数据模型
         */
        public ResolveApimodelResponse ResolveApimodel(ResolveApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResolveApimodelEx(request, headers, runtime);
        }

        /**
         * Description: 解析数据模型
         * Summary: 解析数据模型
         */
        public async Task<ResolveApimodelResponse> ResolveApimodelAsync(ResolveApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResolveApimodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 解析数据模型
         * Summary: 解析数据模型
         */
        public ResolveApimodelResponse ResolveApimodelEx(ResolveApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResolveApimodelResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.resolve", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解析数据模型
         * Summary: 解析数据模型
         */
        public async Task<ResolveApimodelResponse> ResolveApimodelExAsync(ResolveApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResolveApimodelResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.resolve", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 侯志波
         * Summary: 导入数据模型
         */
        public ImportApimodelResponse ImportApimodel(ImportApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportApimodelEx(request, headers, runtime);
        }

        /**
         * Description: 侯志波
         * Summary: 导入数据模型
         */
        public async Task<ImportApimodelResponse> ImportApimodelAsync(ImportApimodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportApimodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 侯志波
         * Summary: 导入数据模型
         */
        public ImportApimodelResponse ImportApimodelEx(ImportApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportApimodelResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 侯志波
         * Summary: 导入数据模型
         */
        public async Task<ImportApimodelResponse> ImportApimodelExAsync(ImportApimodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportApimodelResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: mgs模型转换 为网关模型
         * Summary: （mgs模型数据迁移）转换 为网关模型
         */
        public ApplyApimodelMgsResponse ApplyApimodelMgs(ApplyApimodelMgsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyApimodelMgsEx(request, headers, runtime);
        }

        /**
         * Description: mgs模型转换 为网关模型
         * Summary: （mgs模型数据迁移）转换 为网关模型
         */
        public async Task<ApplyApimodelMgsResponse> ApplyApimodelMgsAsync(ApplyApimodelMgsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyApimodelMgsExAsync(request, headers, runtime);
        }

        /**
         * Description: mgs模型转换 为网关模型
         * Summary: （mgs模型数据迁移）转换 为网关模型
         */
        public ApplyApimodelMgsResponse ApplyApimodelMgsEx(ApplyApimodelMgsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyApimodelMgsResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.mgs.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: mgs模型转换 为网关模型
         * Summary: （mgs模型数据迁移）转换 为网关模型
         */
        public async Task<ApplyApimodelMgsResponse> ApplyApimodelMgsExAsync(ApplyApimodelMgsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyApimodelMgsResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.mgs.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询操作人分页列表
         * Summary: 查询操作人分页列表
         */
        public ListOperatorResponse ListOperator(ListOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 查询操作人分页列表
         * Summary: 查询操作人分页列表
         */
        public async Task<ListOperatorResponse> ListOperatorAsync(ListOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询操作人分页列表
         * Summary: 查询操作人分页列表
         */
        public ListOperatorResponse ListOperatorEx(ListOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListOperatorResponse>(DoRequest("1.0", "sofa.apigateway.operator.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询操作人分页列表
         * Summary: 查询操作人分页列表
         */
        public async Task<ListOperatorResponse> ListOperatorExAsync(ListOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListOperatorResponse>(await DoRequestAsync("1.0", "sofa.apigateway.operator.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新api分组授权用户配置
         * Summary: 更新api分组授权用户配置
         */
        public UpdateApigroupAuthuserconfigResponse UpdateApigroupAuthuserconfig(UpdateApigroupAuthuserconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApigroupAuthuserconfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新api分组授权用户配置
         * Summary: 更新api分组授权用户配置
         */
        public async Task<UpdateApigroupAuthuserconfigResponse> UpdateApigroupAuthuserconfigAsync(UpdateApigroupAuthuserconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApigroupAuthuserconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新api分组授权用户配置
         * Summary: 更新api分组授权用户配置
         */
        public UpdateApigroupAuthuserconfigResponse UpdateApigroupAuthuserconfigEx(UpdateApigroupAuthuserconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApigroupAuthuserconfigResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.authuserconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新api分组授权用户配置
         * Summary: 更新api分组授权用户配置
         */
        public async Task<UpdateApigroupAuthuserconfigResponse> UpdateApigroupAuthuserconfigExAsync(UpdateApigroupAuthuserconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApigroupAuthuserconfigResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.authuserconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api分组授权用户配置
         * Summary: 查询api分组授权用户配置
         */
        public GetApigroupAuthuserconfigResponse GetApigroupAuthuserconfig(GetApigroupAuthuserconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApigroupAuthuserconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询api分组授权用户配置
         * Summary: 查询api分组授权用户配置
         */
        public async Task<GetApigroupAuthuserconfigResponse> GetApigroupAuthuserconfigAsync(GetApigroupAuthuserconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApigroupAuthuserconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询api分组授权用户配置
         * Summary: 查询api分组授权用户配置
         */
        public GetApigroupAuthuserconfigResponse GetApigroupAuthuserconfigEx(GetApigroupAuthuserconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApigroupAuthuserconfigResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.authuserconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api分组授权用户配置
         * Summary: 查询api分组授权用户配置
         */
        public async Task<GetApigroupAuthuserconfigResponse> GetApigroupAuthuserconfigExAsync(GetApigroupAuthuserconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApigroupAuthuserconfigResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.authuserconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api分组添加用户
         * Summary: api分组添加用户
         */
        public AddApigroupAuthuserResponse AddApigroupAuthuser(AddApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddApigroupAuthuserEx(request, headers, runtime);
        }

        /**
         * Description: api分组添加用户
         * Summary: api分组添加用户
         */
        public async Task<AddApigroupAuthuserResponse> AddApigroupAuthuserAsync(AddApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddApigroupAuthuserExAsync(request, headers, runtime);
        }

        /**
         * Description: api分组添加用户
         * Summary: api分组添加用户
         */
        public AddApigroupAuthuserResponse AddApigroupAuthuserEx(AddApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddApigroupAuthuserResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.authuser.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api分组添加用户
         * Summary: api分组添加用户
         */
        public async Task<AddApigroupAuthuserResponse> AddApigroupAuthuserExAsync(AddApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddApigroupAuthuserResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.authuser.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  api分组授权用户使用权限
         * Summary:  api分组授权用户使用权限
         */
        public MountApigroupAuthuserResponse MountApigroupAuthuser(MountApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MountApigroupAuthuserEx(request, headers, runtime);
        }

        /**
         * Description:  api分组授权用户使用权限
         * Summary:  api分组授权用户使用权限
         */
        public async Task<MountApigroupAuthuserResponse> MountApigroupAuthuserAsync(MountApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MountApigroupAuthuserExAsync(request, headers, runtime);
        }

        /**
         * Description:  api分组授权用户使用权限
         * Summary:  api分组授权用户使用权限
         */
        public MountApigroupAuthuserResponse MountApigroupAuthuserEx(MountApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountApigroupAuthuserResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.authuser.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  api分组授权用户使用权限
         * Summary:  api分组授权用户使用权限
         */
        public async Task<MountApigroupAuthuserResponse> MountApigroupAuthuserExAsync(MountApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountApigroupAuthuserResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.authuser.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 
        api解除用户使用权限
         * Summary:  api解除用户使用权限
         */
        public UnmountApigroupAuthuserResponse UnmountApigroupAuthuser(UnmountApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnmountApigroupAuthuserEx(request, headers, runtime);
        }

        /**
         * Description: 
        api解除用户使用权限
         * Summary:  api解除用户使用权限
         */
        public async Task<UnmountApigroupAuthuserResponse> UnmountApigroupAuthuserAsync(UnmountApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnmountApigroupAuthuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 
        api解除用户使用权限
         * Summary:  api解除用户使用权限
         */
        public UnmountApigroupAuthuserResponse UnmountApigroupAuthuserEx(UnmountApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountApigroupAuthuserResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.authuser.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 
        api解除用户使用权限
         * Summary:  api解除用户使用权限
         */
        public async Task<UnmountApigroupAuthuserResponse> UnmountApigroupAuthuserExAsync(UnmountApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountApigroupAuthuserResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.authuser.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api分组授权用户分页列表
         * Summary: 查询api分组授权用户分页列表
         */
        public ListApigroupAuthuserResponse ListApigroupAuthuser(ListApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApigroupAuthuserEx(request, headers, runtime);
        }

        /**
         * Description: 查询api分组授权用户分页列表
         * Summary: 查询api分组授权用户分页列表
         */
        public async Task<ListApigroupAuthuserResponse> ListApigroupAuthuserAsync(ListApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApigroupAuthuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询api分组授权用户分页列表
         * Summary: 查询api分组授权用户分页列表
         */
        public ListApigroupAuthuserResponse ListApigroupAuthuserEx(ListApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApigroupAuthuserResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.authuser.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api分组授权用户分页列表
         * Summary: 查询api分组授权用户分页列表
         */
        public async Task<ListApigroupAuthuserResponse> ListApigroupAuthuserExAsync(ListApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApigroupAuthuserResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.authuser.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api分组删除用户
         * Summary: api分组删除用户
         */
        public DeleteApigroupAuthuserResponse DeleteApigroupAuthuser(DeleteApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApigroupAuthuserEx(request, headers, runtime);
        }

        /**
         * Description: api分组删除用户
         * Summary: api分组删除用户
         */
        public async Task<DeleteApigroupAuthuserResponse> DeleteApigroupAuthuserAsync(DeleteApigroupAuthuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApigroupAuthuserExAsync(request, headers, runtime);
        }

        /**
         * Description: api分组删除用户
         * Summary: api分组删除用户
         */
        public DeleteApigroupAuthuserResponse DeleteApigroupAuthuserEx(DeleteApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApigroupAuthuserResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.authuser.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api分组删除用户
         * Summary: api分组删除用户
         */
        public async Task<DeleteApigroupAuthuserResponse> DeleteApigroupAuthuserExAsync(DeleteApigroupAuthuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApigroupAuthuserResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.authuser.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验是否有api分组权限
         * Summary: 校验是否有api分组权限
         */
        public VerifyApiApigroupResponse VerifyApiApigroup(VerifyApiApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyApiApigroupEx(request, headers, runtime);
        }

        /**
         * Description: 校验是否有api分组权限
         * Summary: 校验是否有api分组权限
         */
        public async Task<VerifyApiApigroupResponse> VerifyApiApigroupAsync(VerifyApiApigroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyApiApigroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验是否有api分组权限
         * Summary: 校验是否有api分组权限
         */
        public VerifyApiApigroupResponse VerifyApiApigroupEx(VerifyApiApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyApiApigroupResponse>(DoRequest("1.0", "sofa.apigateway.api.apigroup.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验是否有api分组权限
         * Summary: 校验是否有api分组权限
         */
        public async Task<VerifyApiApigroupResponse> VerifyApiApigroupExAsync(VerifyApiApigroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyApiApigroupResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.apigroup.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改app绑定api加密状态
         * Summary: 修改app绑定api加密状态
         */
        public UpdateAppAuthapiResponse UpdateAppAuthapi(UpdateAppAuthapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppAuthapiEx(request, headers, runtime);
        }

        /**
         * Description: 修改app绑定api加密状态
         * Summary: 修改app绑定api加密状态
         */
        public async Task<UpdateAppAuthapiResponse> UpdateAppAuthapiAsync(UpdateAppAuthapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppAuthapiExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改app绑定api加密状态
         * Summary: 修改app绑定api加密状态
         */
        public UpdateAppAuthapiResponse UpdateAppAuthapiEx(UpdateAppAuthapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppAuthapiResponse>(DoRequest("1.0", "sofa.apigateway.app.authapi.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改app绑定api加密状态
         * Summary: 修改app绑定api加密状态
         */
        public async Task<UpdateAppAuthapiResponse> UpdateAppAuthapiExAsync(UpdateAppAuthapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppAuthapiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.app.authapi.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置zone
         * Summary: 全局配置zone
         */
        public CreateGwconfigResponse CreateGwconfig(CreateGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateGwconfigEx(request, headers, runtime);
        }

        /**
         * Description: 配置zone
         * Summary: 全局配置zone
         */
        public async Task<CreateGwconfigResponse> CreateGwconfigAsync(CreateGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateGwconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 配置zone
         * Summary: 全局配置zone
         */
        public CreateGwconfigResponse CreateGwconfigEx(CreateGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGwconfigResponse>(DoRequest("1.0", "sofa.apigateway.gwconfig.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置zone
         * Summary: 全局配置zone
         */
        public async Task<CreateGwconfigResponse> CreateGwconfigExAsync(CreateGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGwconfigResponse>(await DoRequestAsync("1.0", "sofa.apigateway.gwconfig.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全局网关配置
         * Summary: 查询全局网关配置
         */
        public GetGwconfigResponse GetGwconfig(GetGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGwconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询全局网关配置
         * Summary: 查询全局网关配置
         */
        public async Task<GetGwconfigResponse> GetGwconfigAsync(GetGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGwconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询全局网关配置
         * Summary: 查询全局网关配置
         */
        public GetGwconfigResponse GetGwconfigEx(GetGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGwconfigResponse>(DoRequest("1.0", "sofa.apigateway.gwconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全局网关配置
         * Summary: 查询全局网关配置
         */
        public async Task<GetGwconfigResponse> GetGwconfigExAsync(GetGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGwconfigResponse>(await DoRequestAsync("1.0", "sofa.apigateway.gwconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新全局网关配置
         * Summary: 更新全局网关配置
         */
        public UpdateGwconfigResponse UpdateGwconfig(UpdateGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGwconfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新全局网关配置
         * Summary: 更新全局网关配置
         */
        public async Task<UpdateGwconfigResponse> UpdateGwconfigAsync(UpdateGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGwconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新全局网关配置
         * Summary: 更新全局网关配置
         */
        public UpdateGwconfigResponse UpdateGwconfigEx(UpdateGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGwconfigResponse>(DoRequest("1.0", "sofa.apigateway.gwconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新全局网关配置
         * Summary: 更新全局网关配置
         */
        public async Task<UpdateGwconfigResponse> UpdateGwconfigExAsync(UpdateGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGwconfigResponse>(await DoRequestAsync("1.0", "sofa.apigateway.gwconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全局网关列表
         * Summary: 查询全局网关列表
         */
        public AllGwconfigResponse AllGwconfig(AllGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllGwconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询全局网关列表
         * Summary: 查询全局网关列表
         */
        public async Task<AllGwconfigResponse> AllGwconfigAsync(AllGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllGwconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询全局网关列表
         * Summary: 查询全局网关列表
         */
        public AllGwconfigResponse AllGwconfigEx(AllGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllGwconfigResponse>(DoRequest("1.0", "sofa.apigateway.gwconfig.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全局网关列表
         * Summary: 查询全局网关列表
         */
        public async Task<AllGwconfigResponse> AllGwconfigExAsync(AllGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllGwconfigResponse>(await DoRequestAsync("1.0", "sofa.apigateway.gwconfig.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询instance_id
         * Summary: 查询instance_id
         */
        public GetInstanceResponse GetInstance(GetInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 查询instance_id
         * Summary: 查询instance_id
         */
        public async Task<GetInstanceResponse> GetInstanceAsync(GetInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询instance_id
         * Summary: 查询instance_id
         */
        public GetInstanceResponse GetInstanceEx(GetInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInstanceResponse>(DoRequest("1.0", "sofa.apigateway.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询instance_id
         * Summary: 查询instance_id
         */
        public async Task<GetInstanceResponse> GetInstanceExAsync(GetInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInstanceResponse>(await DoRequestAsync("1.0", "sofa.apigateway.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除zone、网关效验
         * Summary: 删除zone、网关效验
         */
        public CheckGwconfigDeleteResponse CheckGwconfigDelete(CheckGwconfigDeleteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckGwconfigDeleteEx(request, headers, runtime);
        }

        /**
         * Description: 删除zone、网关效验
         * Summary: 删除zone、网关效验
         */
        public async Task<CheckGwconfigDeleteResponse> CheckGwconfigDeleteAsync(CheckGwconfigDeleteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckGwconfigDeleteExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除zone、网关效验
         * Summary: 删除zone、网关效验
         */
        public CheckGwconfigDeleteResponse CheckGwconfigDeleteEx(CheckGwconfigDeleteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckGwconfigDeleteResponse>(DoRequest("1.0", "sofa.apigateway.gwconfig.delete.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除zone、网关效验
         * Summary: 删除zone、网关效验
         */
        public async Task<CheckGwconfigDeleteResponse> CheckGwconfigDeleteExAsync(CheckGwconfigDeleteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckGwconfigDeleteResponse>(await DoRequestAsync("1.0", "sofa.apigateway.gwconfig.delete.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新zone、网关效验
         * Summary: 更新zone、网关效验
         */
        public CheckGwconfigUpdateResponse CheckGwconfigUpdate(CheckGwconfigUpdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckGwconfigUpdateEx(request, headers, runtime);
        }

        /**
         * Description: 更新zone、网关效验
         * Summary: 更新zone、网关效验
         */
        public async Task<CheckGwconfigUpdateResponse> CheckGwconfigUpdateAsync(CheckGwconfigUpdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckGwconfigUpdateExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新zone、网关效验
         * Summary: 更新zone、网关效验
         */
        public CheckGwconfigUpdateResponse CheckGwconfigUpdateEx(CheckGwconfigUpdateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckGwconfigUpdateResponse>(DoRequest("1.0", "sofa.apigateway.gwconfig.update.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新zone、网关效验
         * Summary: 更新zone、网关效验
         */
        public async Task<CheckGwconfigUpdateResponse> CheckGwconfigUpdateExAsync(CheckGwconfigUpdateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckGwconfigUpdateResponse>(await DoRequestAsync("1.0", "sofa.apigateway.gwconfig.update.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建跨云互通代理模式
         * Summary: 创建跨云互通代理模式
         */
        public CreateApiGwconfigResponse CreateApiGwconfig(CreateApiGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApiGwconfigEx(request, headers, runtime);
        }

        /**
         * Description: 创建跨云互通代理模式
         * Summary: 创建跨云互通代理模式
         */
        public async Task<CreateApiGwconfigResponse> CreateApiGwconfigAsync(CreateApiGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApiGwconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建跨云互通代理模式
         * Summary: 创建跨云互通代理模式
         */
        public CreateApiGwconfigResponse CreateApiGwconfigEx(CreateApiGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiGwconfigResponse>(DoRequest("1.0", "sofa.apigateway.api.gwconfig.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建跨云互通代理模式
         * Summary: 创建跨云互通代理模式
         */
        public async Task<CreateApiGwconfigResponse> CreateApiGwconfigExAsync(CreateApiGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiGwconfigResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.gwconfig.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新跨云互通API
         * Summary: 更新跨云互通API
         */
        public UpdateApiGwconfigResponse UpdateApiGwconfig(UpdateApiGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApiGwconfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新跨云互通API
         * Summary: 更新跨云互通API
         */
        public async Task<UpdateApiGwconfigResponse> UpdateApiGwconfigAsync(UpdateApiGwconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApiGwconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新跨云互通API
         * Summary: 更新跨云互通API
         */
        public UpdateApiGwconfigResponse UpdateApiGwconfigEx(UpdateApiGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiGwconfigResponse>(DoRequest("1.0", "sofa.apigateway.api.gwconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新跨云互通API
         * Summary: 更新跨云互通API
         */
        public async Task<UpdateApiGwconfigResponse> UpdateApiGwconfigExAsync(UpdateApiGwconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiGwconfigResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.gwconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 录入api时的参数效验
         * Summary: 录入api时的参数效验
         */
        public CheckApiResponse CheckApi(CheckApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckApiEx(request, headers, runtime);
        }

        /**
         * Description: 录入api时的参数效验
         * Summary: 录入api时的参数效验
         */
        public async Task<CheckApiResponse> CheckApiAsync(CheckApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 录入api时的参数效验
         * Summary: 录入api时的参数效验
         */
        public CheckApiResponse CheckApiEx(CheckApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckApiResponse>(DoRequest("1.0", "sofa.apigateway.api.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 录入api时的参数效验
         * Summary: 录入api时的参数效验
         */
        public async Task<CheckApiResponse> CheckApiExAsync(CheckApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 系统集群修改校验
         * Summary: 系统集群修改校验是否可修改
         */
        public CheckSysUpdateResponse CheckSysUpdate(CheckSysUpdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckSysUpdateEx(request, headers, runtime);
        }

        /**
         * Description: 系统集群修改校验
         * Summary: 系统集群修改校验是否可修改
         */
        public async Task<CheckSysUpdateResponse> CheckSysUpdateAsync(CheckSysUpdateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckSysUpdateExAsync(request, headers, runtime);
        }

        /**
         * Description: 系统集群修改校验
         * Summary: 系统集群修改校验是否可修改
         */
        public CheckSysUpdateResponse CheckSysUpdateEx(CheckSysUpdateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSysUpdateResponse>(DoRequest("1.0", "sofa.apigateway.sys.update.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 系统集群修改校验
         * Summary: 系统集群修改校验是否可修改
         */
        public async Task<CheckSysUpdateResponse> CheckSysUpdateExAsync(CheckSysUpdateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSysUpdateResponse>(await DoRequestAsync("1.0", "sofa.apigateway.sys.update.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api查看历史版本信息
         * Summary: api查看历史版本信息
         */
        public GetApiHistoryversionapiResponse GetApiHistoryversionapi(GetApiHistoryversionapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApiHistoryversionapiEx(request, headers, runtime);
        }

        /**
         * Description: api查看历史版本信息
         * Summary: api查看历史版本信息
         */
        public async Task<GetApiHistoryversionapiResponse> GetApiHistoryversionapiAsync(GetApiHistoryversionapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApiHistoryversionapiExAsync(request, headers, runtime);
        }

        /**
         * Description: api查看历史版本信息
         * Summary: api查看历史版本信息
         */
        public GetApiHistoryversionapiResponse GetApiHistoryversionapiEx(GetApiHistoryversionapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiHistoryversionapiResponse>(DoRequest("1.0", "sofa.apigateway.api.historyversionapi.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api查看历史版本信息
         * Summary: api查看历史版本信息
         */
        public async Task<GetApiHistoryversionapiResponse> GetApiHistoryversionapiExAsync(GetApiHistoryversionapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiHistoryversionapiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.historyversionapi.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询策略列表
         * Summary: 查询策略列表
         */
        public AllStrategyResponse AllStrategy(AllStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 查询策略列表
         * Summary: 查询策略列表
         */
        public async Task<AllStrategyResponse> AllStrategyAsync(AllStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询策略列表
         * Summary: 查询策略列表
         */
        public AllStrategyResponse AllStrategyEx(AllStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllStrategyResponse>(DoRequest("1.0", "sofa.apigateway.strategy.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询策略列表
         * Summary: 查询策略列表
         */
        public async Task<AllStrategyResponse> AllStrategyExAsync(AllStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllStrategyResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据strategyID查询API列表
         * Summary: 根据strategyID查询API列表
         */
        public AllStrategyApiResponse AllStrategyApi(AllStrategyApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllStrategyApiEx(request, headers, runtime);
        }

        /**
         * Description: 根据strategyID查询API列表
         * Summary: 根据strategyID查询API列表
         */
        public async Task<AllStrategyApiResponse> AllStrategyApiAsync(AllStrategyApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllStrategyApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据strategyID查询API列表
         * Summary: 根据strategyID查询API列表
         */
        public AllStrategyApiResponse AllStrategyApiEx(AllStrategyApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllStrategyApiResponse>(DoRequest("1.0", "sofa.apigateway.strategy.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据strategyID查询API列表
         * Summary: 根据strategyID查询API列表
         */
        public async Task<AllStrategyApiResponse> AllStrategyApiExAsync(AllStrategyApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllStrategyApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.api.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据strategyID查询API分页
         * Summary: 根据strategyID查询API分页
         */
        public ListStrategyApiResponse ListStrategyApi(ListStrategyApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListStrategyApiEx(request, headers, runtime);
        }

        /**
         * Description: 根据strategyID查询API分页
         * Summary: 根据strategyID查询API分页
         */
        public async Task<ListStrategyApiResponse> ListStrategyApiAsync(ListStrategyApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListStrategyApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据strategyID查询API分页
         * Summary: 根据strategyID查询API分页
         */
        public ListStrategyApiResponse ListStrategyApiEx(ListStrategyApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListStrategyApiResponse>(DoRequest("1.0", "sofa.apigateway.strategy.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据strategyID查询API分页
         * Summary: 根据strategyID查询API分页
         */
        public async Task<ListStrategyApiResponse> ListStrategyApiExAsync(ListStrategyApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListStrategyApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.api.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  根据strategy ID绑定API
         * Summary:  根据strategy ID绑定API
         */
        public MountStrategyApiResponse MountStrategyApi(MountStrategyApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MountStrategyApiEx(request, headers, runtime);
        }

        /**
         * Description:  根据strategy ID绑定API
         * Summary:  根据strategy ID绑定API
         */
        public async Task<MountStrategyApiResponse> MountStrategyApiAsync(MountStrategyApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MountStrategyApiExAsync(request, headers, runtime);
        }

        /**
         * Description:  根据strategy ID绑定API
         * Summary:  根据strategy ID绑定API
         */
        public MountStrategyApiResponse MountStrategyApiEx(MountStrategyApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountStrategyApiResponse>(DoRequest("1.0", "sofa.apigateway.strategy.api.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  根据strategy ID绑定API
         * Summary:  根据strategy ID绑定API
         */
        public async Task<MountStrategyApiResponse> MountStrategyApiExAsync(MountStrategyApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountStrategyApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.api.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据strategyID 解绑API
         * Summary: 根据strategyID 解绑API
         */
        public UnmountStrategyApiResponse UnmountStrategyApi(UnmountStrategyApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnmountStrategyApiEx(request, headers, runtime);
        }

        /**
         * Description: 根据strategyID 解绑API
         * Summary: 根据strategyID 解绑API
         */
        public async Task<UnmountStrategyApiResponse> UnmountStrategyApiAsync(UnmountStrategyApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnmountStrategyApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据strategyID 解绑API
         * Summary: 根据strategyID 解绑API
         */
        public UnmountStrategyApiResponse UnmountStrategyApiEx(UnmountStrategyApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountStrategyApiResponse>(DoRequest("1.0", "sofa.apigateway.strategy.api.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据strategyID 解绑API
         * Summary: 根据strategyID 解绑API
         */
        public async Task<UnmountStrategyApiResponse> UnmountStrategyApiExAsync(UnmountStrategyApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountStrategyApiResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.api.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  创建策略
         * Summary:  创建策略
         */
        public CreateStrategyResponse CreateStrategy(CreateStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateStrategyEx(request, headers, runtime);
        }

        /**
         * Description:  创建策略
         * Summary:  创建策略
         */
        public async Task<CreateStrategyResponse> CreateStrategyAsync(CreateStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description:  创建策略
         * Summary:  创建策略
         */
        public CreateStrategyResponse CreateStrategyEx(CreateStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStrategyResponse>(DoRequest("1.0", "sofa.apigateway.strategy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  创建策略
         * Summary:  创建策略
         */
        public async Task<CreateStrategyResponse> CreateStrategyExAsync(CreateStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStrategyResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除策略
         * Summary: 删除策略
         */
        public DeleteStrategyResponse DeleteStrategy(DeleteStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 删除策略
         * Summary: 删除策略
         */
        public async Task<DeleteStrategyResponse> DeleteStrategyAsync(DeleteStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除策略
         * Summary: 删除策略
         */
        public DeleteStrategyResponse DeleteStrategyEx(DeleteStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStrategyResponse>(DoRequest("1.0", "sofa.apigateway.strategy.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除策略
         * Summary: 删除策略
         */
        public async Task<DeleteStrategyResponse> DeleteStrategyExAsync(DeleteStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStrategyResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据ID查询strategy
         * Summary: 根据ID查询strategy
         */
        public GetStrategyResponse GetStrategy(GetStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 根据ID查询strategy
         * Summary: 根据ID查询strategy
         */
        public async Task<GetStrategyResponse> GetStrategyAsync(GetStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据ID查询strategy
         * Summary: 根据ID查询strategy
         */
        public GetStrategyResponse GetStrategyEx(GetStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStrategyResponse>(DoRequest("1.0", "sofa.apigateway.strategy.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据ID查询strategy
         * Summary: 根据ID查询strategy
         */
        public async Task<GetStrategyResponse> GetStrategyExAsync(GetStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStrategyResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询strategy分页列表
         * Summary: 查询strategy分页列表
         */
        public ListStrategyResponse ListStrategy(ListStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 查询strategy分页列表
         * Summary: 查询strategy分页列表
         */
        public async Task<ListStrategyResponse> ListStrategyAsync(ListStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询strategy分页列表
         * Summary: 查询strategy分页列表
         */
        public ListStrategyResponse ListStrategyEx(ListStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListStrategyResponse>(DoRequest("1.0", "sofa.apigateway.strategy.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询strategy分页列表
         * Summary: 查询strategy分页列表
         */
        public async Task<ListStrategyResponse> ListStrategyExAsync(ListStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListStrategyResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  编辑strategy
         * Summary:  编辑strategy
         */
        public UpdateStrategyResponse UpdateStrategy(UpdateStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateStrategyEx(request, headers, runtime);
        }

        /**
         * Description:  编辑strategy
         * Summary:  编辑strategy
         */
        public async Task<UpdateStrategyResponse> UpdateStrategyAsync(UpdateStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description:  编辑strategy
         * Summary:  编辑strategy
         */
        public UpdateStrategyResponse UpdateStrategyEx(UpdateStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStrategyResponse>(DoRequest("1.0", "sofa.apigateway.strategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  编辑strategy
         * Summary:  编辑strategy
         */
        public async Task<UpdateStrategyResponse> UpdateStrategyExAsync(UpdateStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStrategyResponse>(await DoRequestAsync("1.0", "sofa.apigateway.strategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数量
         * Summary: 查询数量
         */
        public GetHomeResponse GetHome(GetHomeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetHomeEx(request, headers, runtime);
        }

        /**
         * Description: 查询数量
         * Summary: 查询数量
         */
        public async Task<GetHomeResponse> GetHomeAsync(GetHomeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetHomeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数量
         * Summary: 查询数量
         */
        public GetHomeResponse GetHomeEx(GetHomeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetHomeResponse>(DoRequest("1.0", "sofa.apigateway.home.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数量
         * Summary: 查询数量
         */
        public async Task<GetHomeResponse> GetHomeExAsync(GetHomeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetHomeResponse>(await DoRequestAsync("1.0", "sofa.apigateway.home.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 录入域名时的效验
         * Summary: 录入域名时的效验
         */
        public CheckApigroupDomainResponse CheckApigroupDomain(CheckApigroupDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckApigroupDomainEx(request, headers, runtime);
        }

        /**
         * Description: 录入域名时的效验
         * Summary: 录入域名时的效验
         */
        public async Task<CheckApigroupDomainResponse> CheckApigroupDomainAsync(CheckApigroupDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckApigroupDomainExAsync(request, headers, runtime);
        }

        /**
         * Description: 录入域名时的效验
         * Summary: 录入域名时的效验
         */
        public CheckApigroupDomainResponse CheckApigroupDomainEx(CheckApigroupDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckApigroupDomainResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.domain.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 录入域名时的效验
         * Summary: 录入域名时的效验
         */
        public async Task<CheckApigroupDomainResponse> CheckApigroupDomainExAsync(CheckApigroupDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckApigroupDomainResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.domain.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询域名后缀
         * Summary: 查询域名后缀
         */
        public GetApigroupDomainResponse GetApigroupDomain(GetApigroupDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApigroupDomainEx(request, headers, runtime);
        }

        /**
         * Description: 查询域名后缀
         * Summary: 查询域名后缀
         */
        public async Task<GetApigroupDomainResponse> GetApigroupDomainAsync(GetApigroupDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApigroupDomainExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询域名后缀
         * Summary: 查询域名后缀
         */
        public GetApigroupDomainResponse GetApigroupDomainEx(GetApigroupDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApigroupDomainResponse>(DoRequest("1.0", "sofa.apigateway.apigroup.domain.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询域名后缀
         * Summary: 查询域名后缀
         */
        public async Task<GetApigroupDomainResponse> GetApigroupDomainExAsync(GetApigroupDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApigroupDomainResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apigroup.domain.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看api生成的swagger文档
         * Summary: 查看api生成的swagger文档
         */
        public GetApiSwaggerResponse GetApiSwagger(GetApiSwaggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApiSwaggerEx(request, headers, runtime);
        }

        /**
         * Description: 查看api生成的swagger文档
         * Summary: 查看api生成的swagger文档
         */
        public async Task<GetApiSwaggerResponse> GetApiSwaggerAsync(GetApiSwaggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApiSwaggerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查看api生成的swagger文档
         * Summary: 查看api生成的swagger文档
         */
        public GetApiSwaggerResponse GetApiSwaggerEx(GetApiSwaggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiSwaggerResponse>(DoRequest("1.0", "sofa.apigateway.api.swagger.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看api生成的swagger文档
         * Summary: 查看api生成的swagger文档
         */
        public async Task<GetApiSwaggerResponse> GetApiSwaggerExAsync(GetApiSwaggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiSwaggerResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.swagger.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api文档下载
         * Summary: api文档下载
         */
        public DownloadApiSwaggerResponse DownloadApiSwagger(DownloadApiSwaggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadApiSwaggerEx(request, headers, runtime);
        }

        /**
         * Description: api文档下载
         * Summary: api文档下载
         */
        public async Task<DownloadApiSwaggerResponse> DownloadApiSwaggerAsync(DownloadApiSwaggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadApiSwaggerExAsync(request, headers, runtime);
        }

        /**
         * Description: api文档下载
         * Summary: api文档下载
         */
        public DownloadApiSwaggerResponse DownloadApiSwaggerEx(DownloadApiSwaggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadApiSwaggerResponse>(DoRequest("1.0", "sofa.apigateway.api.swagger.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api文档下载
         * Summary: api文档下载
         */
        public async Task<DownloadApiSwaggerResponse> DownloadApiSwaggerExAsync(DownloadApiSwaggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadApiSwaggerResponse>(await DoRequestAsync("1.0", "sofa.apigateway.api.swagger.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代码生成
         * Summary: 代码生成
         */
        public DownloadApimodelCodegenResponse DownloadApimodelCodegen(DownloadApimodelCodegenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadApimodelCodegenEx(request, headers, runtime);
        }

        /**
         * Description: 代码生成
         * Summary: 代码生成
         */
        public async Task<DownloadApimodelCodegenResponse> DownloadApimodelCodegenAsync(DownloadApimodelCodegenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadApimodelCodegenExAsync(request, headers, runtime);
        }

        /**
         * Description: 代码生成
         * Summary: 代码生成
         */
        public DownloadApimodelCodegenResponse DownloadApimodelCodegenEx(DownloadApimodelCodegenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadApimodelCodegenResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.codegen.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代码生成
         * Summary: 代码生成
         */
        public async Task<DownloadApimodelCodegenResponse> DownloadApimodelCodegenExAsync(DownloadApimodelCodegenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadApimodelCodegenResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.codegen.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取双网模块开关
         * Summary: 获取双网模块开关
         */
        public GetGwconfigGatewayswitchResponse GetGwconfigGatewayswitch(GetGwconfigGatewayswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGwconfigGatewayswitchEx(request, headers, runtime);
        }

        /**
         * Description: 获取双网模块开关
         * Summary: 获取双网模块开关
         */
        public async Task<GetGwconfigGatewayswitchResponse> GetGwconfigGatewayswitchAsync(GetGwconfigGatewayswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGwconfigGatewayswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取双网模块开关
         * Summary: 获取双网模块开关
         */
        public GetGwconfigGatewayswitchResponse GetGwconfigGatewayswitchEx(GetGwconfigGatewayswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGwconfigGatewayswitchResponse>(DoRequest("1.0", "sofa.apigateway.gwconfig.gatewayswitch.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取双网模块开关
         * Summary: 获取双网模块开关
         */
        public async Task<GetGwconfigGatewayswitchResponse> GetGwconfigGatewayswitchExAsync(GetGwconfigGatewayswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGwconfigGatewayswitchResponse>(await DoRequestAsync("1.0", "sofa.apigateway.gwconfig.gatewayswitch.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册中心列表
         * Summary: 查询注册中心列表
         */
        public AllRegistryResponse AllRegistry(AllRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllRegistryEx(request, headers, runtime);
        }

        /**
         * Description: 查询注册中心列表
         * Summary: 查询注册中心列表
         */
        public async Task<AllRegistryResponse> AllRegistryAsync(AllRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllRegistryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询注册中心列表
         * Summary: 查询注册中心列表
         */
        public AllRegistryResponse AllRegistryEx(AllRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllRegistryResponse>(DoRequest("1.0", "sofa.apigateway.registry.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册中心列表
         * Summary: 查询注册中心列表
         */
        public async Task<AllRegistryResponse> AllRegistryExAsync(AllRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllRegistryResponse>(await DoRequestAsync("1.0", "sofa.apigateway.registry.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册中心绑定的集群列表
         * Summary: 查询注册中心绑定的集群列表
         */
        public AllRegistrySysResponse AllRegistrySys(AllRegistrySysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllRegistrySysEx(request, headers, runtime);
        }

        /**
         * Description: 查询注册中心绑定的集群列表
         * Summary: 查询注册中心绑定的集群列表
         */
        public async Task<AllRegistrySysResponse> AllRegistrySysAsync(AllRegistrySysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllRegistrySysExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询注册中心绑定的集群列表
         * Summary: 查询注册中心绑定的集群列表
         */
        public AllRegistrySysResponse AllRegistrySysEx(AllRegistrySysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllRegistrySysResponse>(DoRequest("1.0", "sofa.apigateway.registry.sys.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册中心绑定的集群列表
         * Summary: 查询注册中心绑定的集群列表
         */
        public async Task<AllRegistrySysResponse> AllRegistrySysExAsync(AllRegistrySysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllRegistrySysResponse>(await DoRequestAsync("1.0", "sofa.apigateway.registry.sys.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询注册中心绑定的集群列表
         * Summary: 分页查询注册中心绑定的集群列表
         */
        public ListRegistrySysResponse ListRegistrySys(ListRegistrySysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRegistrySysEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询注册中心绑定的集群列表
         * Summary: 分页查询注册中心绑定的集群列表
         */
        public async Task<ListRegistrySysResponse> ListRegistrySysAsync(ListRegistrySysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRegistrySysExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询注册中心绑定的集群列表
         * Summary: 分页查询注册中心绑定的集群列表
         */
        public ListRegistrySysResponse ListRegistrySysEx(ListRegistrySysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegistrySysResponse>(DoRequest("1.0", "sofa.apigateway.registry.sys.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询注册中心绑定的集群列表
         * Summary: 分页查询注册中心绑定的集群列表
         */
        public async Task<ListRegistrySysResponse> ListRegistrySysExAsync(ListRegistrySysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegistrySysResponse>(await DoRequestAsync("1.0", "sofa.apigateway.registry.sys.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建注册中心
         * Summary: 创建注册中心
         */
        public CreateRegistryResponse CreateRegistry(CreateRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRegistryEx(request, headers, runtime);
        }

        /**
         * Description: 创建注册中心
         * Summary: 创建注册中心
         */
        public async Task<CreateRegistryResponse> CreateRegistryAsync(CreateRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRegistryExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建注册中心
         * Summary: 创建注册中心
         */
        public CreateRegistryResponse CreateRegistryEx(CreateRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRegistryResponse>(DoRequest("1.0", "sofa.apigateway.registry.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建注册中心
         * Summary: 创建注册中心
         */
        public async Task<CreateRegistryResponse> CreateRegistryExAsync(CreateRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRegistryResponse>(await DoRequestAsync("1.0", "sofa.apigateway.registry.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  通过ID删除注册中心
         * Summary:  通过ID删除注册中心
         */
        public DeleteRegistryResponse DeleteRegistry(DeleteRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteRegistryEx(request, headers, runtime);
        }

        /**
         * Description:  通过ID删除注册中心
         * Summary:  通过ID删除注册中心
         */
        public async Task<DeleteRegistryResponse> DeleteRegistryAsync(DeleteRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteRegistryExAsync(request, headers, runtime);
        }

        /**
         * Description:  通过ID删除注册中心
         * Summary:  通过ID删除注册中心
         */
        public DeleteRegistryResponse DeleteRegistryEx(DeleteRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRegistryResponse>(DoRequest("1.0", "sofa.apigateway.registry.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  通过ID删除注册中心
         * Summary:  通过ID删除注册中心
         */
        public async Task<DeleteRegistryResponse> DeleteRegistryExAsync(DeleteRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRegistryResponse>(await DoRequestAsync("1.0", "sofa.apigateway.registry.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询注册中心
         * Summary: 通过ID查询注册中心
         */
        public GetRegistryResponse GetRegistry(GetRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRegistryEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询注册中心
         * Summary: 通过ID查询注册中心
         */
        public async Task<GetRegistryResponse> GetRegistryAsync(GetRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRegistryExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询注册中心
         * Summary: 通过ID查询注册中心
         */
        public GetRegistryResponse GetRegistryEx(GetRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRegistryResponse>(DoRequest("1.0", "sofa.apigateway.registry.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询注册中心
         * Summary: 通过ID查询注册中心
         */
        public async Task<GetRegistryResponse> GetRegistryExAsync(GetRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRegistryResponse>(await DoRequestAsync("1.0", "sofa.apigateway.registry.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询注册中心分页列表
         * Summary:  查询注册中心分页列表
         */
        public ListRegistryResponse ListRegistry(ListRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRegistryEx(request, headers, runtime);
        }

        /**
         * Description:  查询注册中心分页列表
         * Summary:  查询注册中心分页列表
         */
        public async Task<ListRegistryResponse> ListRegistryAsync(ListRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRegistryExAsync(request, headers, runtime);
        }

        /**
         * Description:  查询注册中心分页列表
         * Summary:  查询注册中心分页列表
         */
        public ListRegistryResponse ListRegistryEx(ListRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegistryResponse>(DoRequest("1.0", "sofa.apigateway.registry.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询注册中心分页列表
         * Summary:  查询注册中心分页列表
         */
        public async Task<ListRegistryResponse> ListRegistryExAsync(ListRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegistryResponse>(await DoRequestAsync("1.0", "sofa.apigateway.registry.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新注册中心
         * Summary: 更新注册中心
         */
        public UpdateRegistryResponse UpdateRegistry(UpdateRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRegistryEx(request, headers, runtime);
        }

        /**
         * Description: 更新注册中心
         * Summary: 更新注册中心
         */
        public async Task<UpdateRegistryResponse> UpdateRegistryAsync(UpdateRegistryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRegistryExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新注册中心
         * Summary: 更新注册中心
         */
        public UpdateRegistryResponse UpdateRegistryEx(UpdateRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRegistryResponse>(DoRequest("1.0", "sofa.apigateway.registry.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新注册中心
         * Summary: 更新注册中心
         */
        public async Task<UpdateRegistryResponse> UpdateRegistryExAsync(UpdateRegistryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRegistryResponse>(await DoRequestAsync("1.0", "sofa.apigateway.registry.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行流程编排
         * Summary: 执行流程编排
         */
        public ExecApiflowResponse ExecApiflow(ExecApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecApiflowEx(request, headers, runtime);
        }

        /**
         * Description: 执行流程编排
         * Summary: 执行流程编排
         */
        public async Task<ExecApiflowResponse> ExecApiflowAsync(ExecApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecApiflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行流程编排
         * Summary: 执行流程编排
         */
        public ExecApiflowResponse ExecApiflowEx(ExecApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecApiflowResponse>(DoRequest("1.0", "sofa.apigateway.apiflow.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行流程编排
         * Summary: 执行流程编排
         */
        public async Task<ExecApiflowResponse> ExecApiflowExAsync(ExecApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecApiflowResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apiflow.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除编排
         * Summary: 通过ID删除编排
         */
        public DeleteApiflowResponse DeleteApiflow(DeleteApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApiflowEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除编排
         * Summary: 通过ID删除编排
         */
        public async Task<DeleteApiflowResponse> DeleteApiflowAsync(DeleteApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApiflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID删除编排
         * Summary: 通过ID删除编排
         */
        public DeleteApiflowResponse DeleteApiflowEx(DeleteApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApiflowResponse>(DoRequest("1.0", "sofa.apigateway.apiflow.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID删除编排
         * Summary: 通过ID删除编排
         */
        public async Task<DeleteApiflowResponse> DeleteApiflowExAsync(DeleteApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApiflowResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apiflow.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全部编排列表
         * Summary: 查询全部编排列表
         */
        public AllApiflowResponse AllApiflow(AllApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllApiflowEx(request, headers, runtime);
        }

        /**
         * Description: 查询全部编排列表
         * Summary: 查询全部编排列表
         */
        public async Task<AllApiflowResponse> AllApiflowAsync(AllApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllApiflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询全部编排列表
         * Summary: 查询全部编排列表
         */
        public AllApiflowResponse AllApiflowEx(AllApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApiflowResponse>(DoRequest("1.0", "sofa.apigateway.apiflow.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全部编排列表
         * Summary: 查询全部编排列表
         */
        public async Task<AllApiflowResponse> AllApiflowExAsync(AllApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllApiflowResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apiflow.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询编排分页列表
         * Summary: 查询编排分页列表
         */
        public ListApiflowResponse ListApiflow(ListApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApiflowEx(request, headers, runtime);
        }

        /**
         * Description: 查询编排分页列表
         * Summary: 查询编排分页列表
         */
        public async Task<ListApiflowResponse> ListApiflowAsync(ListApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApiflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询编排分页列表
         * Summary: 查询编排分页列表
         */
        public ListApiflowResponse ListApiflowEx(ListApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApiflowResponse>(DoRequest("1.0", "sofa.apigateway.apiflow.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询编排分页列表
         * Summary: 查询编排分页列表
         */
        public async Task<ListApiflowResponse> ListApiflowExAsync(ListApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApiflowResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apiflow.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建API形式的编排
         * Summary: 创建API形式的编排
         */
        public CreateApiflowResponse CreateApiflow(CreateApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApiflowEx(request, headers, runtime);
        }

        /**
         * Description: 创建API形式的编排
         * Summary: 创建API形式的编排
         */
        public async Task<CreateApiflowResponse> CreateApiflowAsync(CreateApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApiflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建API形式的编排
         * Summary: 创建API形式的编排
         */
        public CreateApiflowResponse CreateApiflowEx(CreateApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiflowResponse>(DoRequest("1.0", "sofa.apigateway.apiflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建API形式的编排
         * Summary: 创建API形式的编排
         */
        public async Task<CreateApiflowResponse> CreateApiflowExAsync(CreateApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiflowResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apiflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询编排
         * Summary: 通过ID查询编排
         */
        public GetApiflowResponse GetApiflow(GetApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApiflowEx(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询编排
         * Summary: 通过ID查询编排
         */
        public async Task<GetApiflowResponse> GetApiflowAsync(GetApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApiflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过ID查询编排
         * Summary: 通过ID查询编排
         */
        public GetApiflowResponse GetApiflowEx(GetApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiflowResponse>(DoRequest("1.0", "sofa.apigateway.apiflow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过ID查询编排
         * Summary: 通过ID查询编排
         */
        public async Task<GetApiflowResponse> GetApiflowExAsync(GetApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApiflowResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apiflow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新编排信息
         * Summary: 更新编排信息
         */
        public UpdateApiflowResponse UpdateApiflow(UpdateApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApiflowEx(request, headers, runtime);
        }

        /**
         * Description: 更新编排信息
         * Summary: 更新编排信息
         */
        public async Task<UpdateApiflowResponse> UpdateApiflowAsync(UpdateApiflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApiflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新编排信息
         * Summary: 更新编排信息
         */
        public UpdateApiflowResponse UpdateApiflowEx(UpdateApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiflowResponse>(DoRequest("1.0", "sofa.apigateway.apiflow.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新编排信息
         * Summary: 更新编排信息
         */
        public async Task<UpdateApiflowResponse> UpdateApiflowExAsync(UpdateApiflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiflowResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apiflow.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据模型转json
         * Summary: 数据模型转json
         */
        public GetApimodelJsonResponse GetApimodelJson(GetApimodelJsonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApimodelJsonEx(request, headers, runtime);
        }

        /**
         * Description: 数据模型转json
         * Summary: 数据模型转json
         */
        public async Task<GetApimodelJsonResponse> GetApimodelJsonAsync(GetApimodelJsonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApimodelJsonExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据模型转json
         * Summary: 数据模型转json
         */
        public GetApimodelJsonResponse GetApimodelJsonEx(GetApimodelJsonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApimodelJsonResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.json.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据模型转json
         * Summary: 数据模型转json
         */
        public async Task<GetApimodelJsonResponse> GetApimodelJsonExAsync(GetApimodelJsonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApimodelJsonResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.json.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 替换成apiflow所需的json
         * Summary: 替换成apiflow所需的json
         */
        public ReplaceApimodelJsonResponse ReplaceApimodelJson(ReplaceApimodelJsonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReplaceApimodelJsonEx(request, headers, runtime);
        }

        /**
         * Description: 替换成apiflow所需的json
         * Summary: 替换成apiflow所需的json
         */
        public async Task<ReplaceApimodelJsonResponse> ReplaceApimodelJsonAsync(ReplaceApimodelJsonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReplaceApimodelJsonExAsync(request, headers, runtime);
        }

        /**
         * Description: 替换成apiflow所需的json
         * Summary: 替换成apiflow所需的json
         */
        public ReplaceApimodelJsonResponse ReplaceApimodelJsonEx(ReplaceApimodelJsonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceApimodelJsonResponse>(DoRequest("1.0", "sofa.apigateway.apimodel.json.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 替换成apiflow所需的json
         * Summary: 替换成apiflow所需的json
         */
        public async Task<ReplaceApimodelJsonResponse> ReplaceApimodelJsonExAsync(ReplaceApimodelJsonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceApimodelJsonResponse>(await DoRequestAsync("1.0", "sofa.apigateway.apimodel.json.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取triple协议开关
         * Summary: 获取triple协议开关
         */
        public GetGwconfigTripleswitchResponse GetGwconfigTripleswitch(GetGwconfigTripleswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGwconfigTripleswitchEx(request, headers, runtime);
        }

        /**
         * Description: 获取triple协议开关
         * Summary: 获取triple协议开关
         */
        public async Task<GetGwconfigTripleswitchResponse> GetGwconfigTripleswitchAsync(GetGwconfigTripleswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGwconfigTripleswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取triple协议开关
         * Summary: 获取triple协议开关
         */
        public GetGwconfigTripleswitchResponse GetGwconfigTripleswitchEx(GetGwconfigTripleswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGwconfigTripleswitchResponse>(DoRequest("1.0", "sofa.apigateway.gwconfig.tripleswitch.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取triple协议开关
         * Summary: 获取triple协议开关
         */
        public async Task<GetGwconfigTripleswitchResponse> GetGwconfigTripleswitchExAsync(GetGwconfigTripleswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGwconfigTripleswitchResponse>(await DoRequestAsync("1.0", "sofa.apigateway.gwconfig.tripleswitch.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 专有云triple查询开关
         * Summary: 专有云triple查询开关
         */
        public QueryGwconfigTripleswitchResponse QueryGwconfigTripleswitch(QueryGwconfigTripleswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGwconfigTripleswitchEx(request, headers, runtime);
        }

        /**
         * Description: 专有云triple查询开关
         * Summary: 专有云triple查询开关
         */
        public async Task<QueryGwconfigTripleswitchResponse> QueryGwconfigTripleswitchAsync(QueryGwconfigTripleswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGwconfigTripleswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 专有云triple查询开关
         * Summary: 专有云triple查询开关
         */
        public QueryGwconfigTripleswitchResponse QueryGwconfigTripleswitchEx(QueryGwconfigTripleswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGwconfigTripleswitchResponse>(DoRequest("1.0", "sofa.apigateway.gwconfig.tripleswitch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 专有云triple查询开关
         * Summary: 专有云triple查询开关
         */
        public async Task<QueryGwconfigTripleswitchResponse> QueryGwconfigTripleswitchExAsync(QueryGwconfigTripleswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGwconfigTripleswitchResponse>(await DoRequestAsync("1.0", "sofa.apigateway.gwconfig.tripleswitch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
