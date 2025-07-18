// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75
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
                        {"sdk_version", "1.1.9"},
                        {"_prod_code", "ak_ed7107878c564eda98e507d7451aae75"},
                        {"_prod_channel", "saas"},
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
                        {"sdk_version", "1.1.9"},
                        {"_prod_code", "ak_ed7107878c564eda98e507d7451aae75"},
                        {"_prod_channel", "saas"},
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
         * Description: 数字人角色列表查询接口
         * Summary: 数字人角色列表查询接口
         */
        public ListUniversalsaasDigitalhumanHumanResponse ListUniversalsaasDigitalhumanHuman(ListUniversalsaasDigitalhumanHumanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
        }

        /**
         * Description: 数字人角色列表查询接口
         * Summary: 数字人角色列表查询接口
         */
        public async Task<ListUniversalsaasDigitalhumanHumanResponse> ListUniversalsaasDigitalhumanHumanAsync(ListUniversalsaasDigitalhumanHumanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUniversalsaasDigitalhumanHumanExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字人角色列表查询接口
         * Summary: 数字人角色列表查询接口
         */
        public ListUniversalsaasDigitalhumanHumanResponse ListUniversalsaasDigitalhumanHumanEx(ListUniversalsaasDigitalhumanHumanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanHumanResponse>(DoRequest("1.0", "universalsaas.digitalhuman.human.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人角色列表查询接口
         * Summary: 数字人角色列表查询接口
         */
        public async Task<ListUniversalsaasDigitalhumanHumanResponse> ListUniversalsaasDigitalhumanHumanExAsync(ListUniversalsaasDigitalhumanHumanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanHumanResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.human.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库列表查询接口
         * Summary: 知识库列表查询接口
         */
        public ListUniversalsaasDigitalhumanLibraryResponse ListUniversalsaasDigitalhumanLibrary(ListUniversalsaasDigitalhumanLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
        }

        /**
         * Description: 知识库列表查询接口
         * Summary: 知识库列表查询接口
         */
        public async Task<ListUniversalsaasDigitalhumanLibraryResponse> ListUniversalsaasDigitalhumanLibraryAsync(ListUniversalsaasDigitalhumanLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUniversalsaasDigitalhumanLibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: 知识库列表查询接口
         * Summary: 知识库列表查询接口
         */
        public ListUniversalsaasDigitalhumanLibraryResponse ListUniversalsaasDigitalhumanLibraryEx(ListUniversalsaasDigitalhumanLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanLibraryResponse>(DoRequest("1.0", "universalsaas.digitalhuman.library.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库列表查询接口
         * Summary: 知识库列表查询接口
         */
        public async Task<ListUniversalsaasDigitalhumanLibraryResponse> ListUniversalsaasDigitalhumanLibraryExAsync(ListUniversalsaasDigitalhumanLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanLibraryResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.library.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建知识库接口
         * Summary: 创建知识库接口
         */
        public AddUniversalsaasDigitalhumanLibraryResponse AddUniversalsaasDigitalhumanLibrary(AddUniversalsaasDigitalhumanLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
        }

        /**
         * Description: 创建知识库接口
         * Summary: 创建知识库接口
         */
        public async Task<AddUniversalsaasDigitalhumanLibraryResponse> AddUniversalsaasDigitalhumanLibraryAsync(AddUniversalsaasDigitalhumanLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddUniversalsaasDigitalhumanLibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建知识库接口
         * Summary: 创建知识库接口
         */
        public AddUniversalsaasDigitalhumanLibraryResponse AddUniversalsaasDigitalhumanLibraryEx(AddUniversalsaasDigitalhumanLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanLibraryResponse>(DoRequest("1.0", "universalsaas.digitalhuman.library.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建知识库接口
         * Summary: 创建知识库接口
         */
        public async Task<AddUniversalsaasDigitalhumanLibraryResponse> AddUniversalsaasDigitalhumanLibraryExAsync(AddUniversalsaasDigitalhumanLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanLibraryResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.library.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑知识库接口
         * Summary: 编辑知识库接口
         */
        public UpdateUniversalsaasDigitalhumanLibraryResponse UpdateUniversalsaasDigitalhumanLibrary(UpdateUniversalsaasDigitalhumanLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
        }

        /**
         * Description: 编辑知识库接口
         * Summary: 编辑知识库接口
         */
        public async Task<UpdateUniversalsaasDigitalhumanLibraryResponse> UpdateUniversalsaasDigitalhumanLibraryAsync(UpdateUniversalsaasDigitalhumanLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUniversalsaasDigitalhumanLibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: 编辑知识库接口
         * Summary: 编辑知识库接口
         */
        public UpdateUniversalsaasDigitalhumanLibraryResponse UpdateUniversalsaasDigitalhumanLibraryEx(UpdateUniversalsaasDigitalhumanLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanLibraryResponse>(DoRequest("1.0", "universalsaas.digitalhuman.library.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑知识库接口
         * Summary: 编辑知识库接口
         */
        public async Task<UpdateUniversalsaasDigitalhumanLibraryResponse> UpdateUniversalsaasDigitalhumanLibraryExAsync(UpdateUniversalsaasDigitalhumanLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanLibraryResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.library.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除知识库接口
         * Summary: 删除知识库接口
         */
        public DeleteUniversalsaasDigitalhumanLibraryResponse DeleteUniversalsaasDigitalhumanLibrary(DeleteUniversalsaasDigitalhumanLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUniversalsaasDigitalhumanLibraryEx(request, headers, runtime);
        }

        /**
         * Description: 删除知识库接口
         * Summary: 删除知识库接口
         */
        public async Task<DeleteUniversalsaasDigitalhumanLibraryResponse> DeleteUniversalsaasDigitalhumanLibraryAsync(DeleteUniversalsaasDigitalhumanLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUniversalsaasDigitalhumanLibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除知识库接口
         * Summary: 删除知识库接口
         */
        public DeleteUniversalsaasDigitalhumanLibraryResponse DeleteUniversalsaasDigitalhumanLibraryEx(DeleteUniversalsaasDigitalhumanLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanLibraryResponse>(DoRequest("1.0", "universalsaas.digitalhuman.library.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除知识库接口
         * Summary: 删除知识库接口
         */
        public async Task<DeleteUniversalsaasDigitalhumanLibraryResponse> DeleteUniversalsaasDigitalhumanLibraryExAsync(DeleteUniversalsaasDigitalhumanLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanLibraryResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.library.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增知识点接口
         * Summary: 新增知识点接口
         */
        public AddUniversalsaasDigitalhumanKnowledgeResponse AddUniversalsaasDigitalhumanKnowledge(AddUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
        }

        /**
         * Description: 新增知识点接口
         * Summary: 新增知识点接口
         */
        public async Task<AddUniversalsaasDigitalhumanKnowledgeResponse> AddUniversalsaasDigitalhumanKnowledgeAsync(AddUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddUniversalsaasDigitalhumanKnowledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增知识点接口
         * Summary: 新增知识点接口
         */
        public AddUniversalsaasDigitalhumanKnowledgeResponse AddUniversalsaasDigitalhumanKnowledgeEx(AddUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanKnowledgeResponse>(DoRequest("1.0", "universalsaas.digitalhuman.knowledge.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增知识点接口
         * Summary: 新增知识点接口
         */
        public async Task<AddUniversalsaasDigitalhumanKnowledgeResponse> AddUniversalsaasDigitalhumanKnowledgeExAsync(AddUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanKnowledgeResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.knowledge.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑知识点接口
         * Summary: 编辑知识点接口
         */
        public UpdateUniversalsaasDigitalhumanKnowledgeResponse UpdateUniversalsaasDigitalhumanKnowledge(UpdateUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
        }

        /**
         * Description: 编辑知识点接口
         * Summary: 编辑知识点接口
         */
        public async Task<UpdateUniversalsaasDigitalhumanKnowledgeResponse> UpdateUniversalsaasDigitalhumanKnowledgeAsync(UpdateUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUniversalsaasDigitalhumanKnowledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 编辑知识点接口
         * Summary: 编辑知识点接口
         */
        public UpdateUniversalsaasDigitalhumanKnowledgeResponse UpdateUniversalsaasDigitalhumanKnowledgeEx(UpdateUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanKnowledgeResponse>(DoRequest("1.0", "universalsaas.digitalhuman.knowledge.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑知识点接口
         * Summary: 编辑知识点接口
         */
        public async Task<UpdateUniversalsaasDigitalhumanKnowledgeResponse> UpdateUniversalsaasDigitalhumanKnowledgeExAsync(UpdateUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanKnowledgeResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.knowledge.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布知识点接口
         * Summary: 发布知识点接口
         */
        public OnlineUniversalsaasDigitalhumanKnowledgeResponse OnlineUniversalsaasDigitalhumanKnowledge(OnlineUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
        }

        /**
         * Description: 发布知识点接口
         * Summary: 发布知识点接口
         */
        public async Task<OnlineUniversalsaasDigitalhumanKnowledgeResponse> OnlineUniversalsaasDigitalhumanKnowledgeAsync(OnlineUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineUniversalsaasDigitalhumanKnowledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布知识点接口
         * Summary: 发布知识点接口
         */
        public OnlineUniversalsaasDigitalhumanKnowledgeResponse OnlineUniversalsaasDigitalhumanKnowledgeEx(OnlineUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineUniversalsaasDigitalhumanKnowledgeResponse>(DoRequest("1.0", "universalsaas.digitalhuman.knowledge.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布知识点接口
         * Summary: 发布知识点接口
         */
        public async Task<OnlineUniversalsaasDigitalhumanKnowledgeResponse> OnlineUniversalsaasDigitalhumanKnowledgeExAsync(OnlineUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineUniversalsaasDigitalhumanKnowledgeResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.knowledge.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下线知识点接口
         * Summary: 下线知识点接口
         */
        public OfflineUniversalsaasDigitalhumanKnowledgeResponse OfflineUniversalsaasDigitalhumanKnowledge(OfflineUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
        }

        /**
         * Description: 下线知识点接口
         * Summary: 下线知识点接口
         */
        public async Task<OfflineUniversalsaasDigitalhumanKnowledgeResponse> OfflineUniversalsaasDigitalhumanKnowledgeAsync(OfflineUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineUniversalsaasDigitalhumanKnowledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 下线知识点接口
         * Summary: 下线知识点接口
         */
        public OfflineUniversalsaasDigitalhumanKnowledgeResponse OfflineUniversalsaasDigitalhumanKnowledgeEx(OfflineUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineUniversalsaasDigitalhumanKnowledgeResponse>(DoRequest("1.0", "universalsaas.digitalhuman.knowledge.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下线知识点接口
         * Summary: 下线知识点接口
         */
        public async Task<OfflineUniversalsaasDigitalhumanKnowledgeResponse> OfflineUniversalsaasDigitalhumanKnowledgeExAsync(OfflineUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineUniversalsaasDigitalhumanKnowledgeResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.knowledge.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询大模型对话列表接口
         * Summary: 查询大模型对话列表接口
         */
        public ListUniversalsaasDigitalhumanLlmChatResponse ListUniversalsaasDigitalhumanLlmChat(ListUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
        }

        /**
         * Description: 查询大模型对话列表接口
         * Summary: 查询大模型对话列表接口
         */
        public async Task<ListUniversalsaasDigitalhumanLlmChatResponse> ListUniversalsaasDigitalhumanLlmChatAsync(ListUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUniversalsaasDigitalhumanLlmChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询大模型对话列表接口
         * Summary: 查询大模型对话列表接口
         */
        public ListUniversalsaasDigitalhumanLlmChatResponse ListUniversalsaasDigitalhumanLlmChatEx(ListUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanLlmChatResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.chat.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询大模型对话列表接口
         * Summary: 查询大模型对话列表接口
         */
        public async Task<ListUniversalsaasDigitalhumanLlmChatResponse> ListUniversalsaasDigitalhumanLlmChatExAsync(ListUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanLlmChatResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.chat.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增交互配置接口
         * Summary: 新增交互配置接口
         */
        public AddUniversalsaasDigitalhumanChatSettingResponse AddUniversalsaasDigitalhumanChatSetting(AddUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
        }

        /**
         * Description: 新增交互配置接口
         * Summary: 新增交互配置接口
         */
        public async Task<AddUniversalsaasDigitalhumanChatSettingResponse> AddUniversalsaasDigitalhumanChatSettingAsync(AddUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddUniversalsaasDigitalhumanChatSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增交互配置接口
         * Summary: 新增交互配置接口
         */
        public AddUniversalsaasDigitalhumanChatSettingResponse AddUniversalsaasDigitalhumanChatSettingEx(AddUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanChatSettingResponse>(DoRequest("1.0", "universalsaas.digitalhuman.chat.setting.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增交互配置接口
         * Summary: 新增交互配置接口
         */
        public async Task<AddUniversalsaasDigitalhumanChatSettingResponse> AddUniversalsaasDigitalhumanChatSettingExAsync(AddUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanChatSettingResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.chat.setting.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑交互配置接口
         * Summary: 编辑交互配置接口
         */
        public SetUniversalsaasDigitalhumanChatSettingResponse SetUniversalsaasDigitalhumanChatSetting(SetUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
        }

        /**
         * Description: 编辑交互配置接口
         * Summary: 编辑交互配置接口
         */
        public async Task<SetUniversalsaasDigitalhumanChatSettingResponse> SetUniversalsaasDigitalhumanChatSettingAsync(SetUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetUniversalsaasDigitalhumanChatSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 编辑交互配置接口
         * Summary: 编辑交互配置接口
         */
        public SetUniversalsaasDigitalhumanChatSettingResponse SetUniversalsaasDigitalhumanChatSettingEx(SetUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetUniversalsaasDigitalhumanChatSettingResponse>(DoRequest("1.0", "universalsaas.digitalhuman.chat.setting.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑交互配置接口
         * Summary: 编辑交互配置接口
         */
        public async Task<SetUniversalsaasDigitalhumanChatSettingResponse> SetUniversalsaasDigitalhumanChatSettingExAsync(SetUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetUniversalsaasDigitalhumanChatSettingResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.chat.setting.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除交互配置接口
         * Summary: 删除交互配置接口
         */
        public DeleteUniversalsaasDigitalhumanChatSettingResponse DeleteUniversalsaasDigitalhumanChatSetting(DeleteUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
        }

        /**
         * Description: 删除交互配置接口
         * Summary: 删除交互配置接口
         */
        public async Task<DeleteUniversalsaasDigitalhumanChatSettingResponse> DeleteUniversalsaasDigitalhumanChatSettingAsync(DeleteUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUniversalsaasDigitalhumanChatSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除交互配置接口
         * Summary: 删除交互配置接口
         */
        public DeleteUniversalsaasDigitalhumanChatSettingResponse DeleteUniversalsaasDigitalhumanChatSettingEx(DeleteUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanChatSettingResponse>(DoRequest("1.0", "universalsaas.digitalhuman.chat.setting.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除交互配置接口
         * Summary: 删除交互配置接口
         */
        public async Task<DeleteUniversalsaasDigitalhumanChatSettingResponse> DeleteUniversalsaasDigitalhumanChatSettingExAsync(DeleteUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanChatSettingResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.chat.setting.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布交互配置接口
         * Summary: 发布交互配置接口
         */
        public OnlineUniversalsaasDigitalhumanChatSettingResponse OnlineUniversalsaasDigitalhumanChatSetting(OnlineUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
        }

        /**
         * Description: 发布交互配置接口
         * Summary: 发布交互配置接口
         */
        public async Task<OnlineUniversalsaasDigitalhumanChatSettingResponse> OnlineUniversalsaasDigitalhumanChatSettingAsync(OnlineUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineUniversalsaasDigitalhumanChatSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布交互配置接口
         * Summary: 发布交互配置接口
         */
        public OnlineUniversalsaasDigitalhumanChatSettingResponse OnlineUniversalsaasDigitalhumanChatSettingEx(OnlineUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineUniversalsaasDigitalhumanChatSettingResponse>(DoRequest("1.0", "universalsaas.digitalhuman.chat.setting.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布交互配置接口
         * Summary: 发布交互配置接口
         */
        public async Task<OnlineUniversalsaasDigitalhumanChatSettingResponse> OnlineUniversalsaasDigitalhumanChatSettingExAsync(OnlineUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineUniversalsaasDigitalhumanChatSettingResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.chat.setting.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下线交互配置接口
         * Summary: 下线交互配置接口
         */
        public OfflineUniversalsaasDigitalhumanChatSettingResponse OfflineUniversalsaasDigitalhumanChatSetting(OfflineUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineUniversalsaasDigitalhumanChatSettingEx(request, headers, runtime);
        }

        /**
         * Description: 下线交互配置接口
         * Summary: 下线交互配置接口
         */
        public async Task<OfflineUniversalsaasDigitalhumanChatSettingResponse> OfflineUniversalsaasDigitalhumanChatSettingAsync(OfflineUniversalsaasDigitalhumanChatSettingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineUniversalsaasDigitalhumanChatSettingExAsync(request, headers, runtime);
        }

        /**
         * Description: 下线交互配置接口
         * Summary: 下线交互配置接口
         */
        public OfflineUniversalsaasDigitalhumanChatSettingResponse OfflineUniversalsaasDigitalhumanChatSettingEx(OfflineUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineUniversalsaasDigitalhumanChatSettingResponse>(DoRequest("1.0", "universalsaas.digitalhuman.chat.setting.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下线交互配置接口
         * Summary: 下线交互配置接口
         */
        public async Task<OfflineUniversalsaasDigitalhumanChatSettingResponse> OfflineUniversalsaasDigitalhumanChatSettingExAsync(OfflineUniversalsaasDigitalhumanChatSettingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineUniversalsaasDigitalhumanChatSettingResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.chat.setting.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人形象列表接口
         * Summary: 数字人形象列表接口
         */
        public ListUniversalsaasDigitalhumanModelResponse ListUniversalsaasDigitalhumanModel(ListUniversalsaasDigitalhumanModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUniversalsaasDigitalhumanModelEx(request, headers, runtime);
        }

        /**
         * Description: 数字人形象列表接口
         * Summary: 数字人形象列表接口
         */
        public async Task<ListUniversalsaasDigitalhumanModelResponse> ListUniversalsaasDigitalhumanModelAsync(ListUniversalsaasDigitalhumanModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUniversalsaasDigitalhumanModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字人形象列表接口
         * Summary: 数字人形象列表接口
         */
        public ListUniversalsaasDigitalhumanModelResponse ListUniversalsaasDigitalhumanModelEx(ListUniversalsaasDigitalhumanModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanModelResponse>(DoRequest("1.0", "universalsaas.digitalhuman.model.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人形象列表接口
         * Summary: 数字人形象列表接口
         */
        public async Task<ListUniversalsaasDigitalhumanModelResponse> ListUniversalsaasDigitalhumanModelExAsync(ListUniversalsaasDigitalhumanModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanModelResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.model.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人平台音色列表
         * Summary: 数字人平台音色列表
         */
        public ListUniversalsaasDigitalhumanVoiceResponse ListUniversalsaasDigitalhumanVoice(ListUniversalsaasDigitalhumanVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
        }

        /**
         * Description: 数字人平台音色列表
         * Summary: 数字人平台音色列表
         */
        public async Task<ListUniversalsaasDigitalhumanVoiceResponse> ListUniversalsaasDigitalhumanVoiceAsync(ListUniversalsaasDigitalhumanVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUniversalsaasDigitalhumanVoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字人平台音色列表
         * Summary: 数字人平台音色列表
         */
        public ListUniversalsaasDigitalhumanVoiceResponse ListUniversalsaasDigitalhumanVoiceEx(ListUniversalsaasDigitalhumanVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanVoiceResponse>(DoRequest("1.0", "universalsaas.digitalhuman.voice.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人平台音色列表
         * Summary: 数字人平台音色列表
         */
        public async Task<ListUniversalsaasDigitalhumanVoiceResponse> ListUniversalsaasDigitalhumanVoiceExAsync(ListUniversalsaasDigitalhumanVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanVoiceResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.voice.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人平台音色试听接口
         * Summary: 数字人平台音色试听接口
         */
        public PreviewUniversalsaasDigitalhumanVoiceResponse PreviewUniversalsaasDigitalhumanVoice(PreviewUniversalsaasDigitalhumanVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
        }

        /**
         * Description: 数字人平台音色试听接口
         * Summary: 数字人平台音色试听接口
         */
        public async Task<PreviewUniversalsaasDigitalhumanVoiceResponse> PreviewUniversalsaasDigitalhumanVoiceAsync(PreviewUniversalsaasDigitalhumanVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewUniversalsaasDigitalhumanVoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字人平台音色试听接口
         * Summary: 数字人平台音色试听接口
         */
        public PreviewUniversalsaasDigitalhumanVoiceResponse PreviewUniversalsaasDigitalhumanVoiceEx(PreviewUniversalsaasDigitalhumanVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewUniversalsaasDigitalhumanVoiceResponse>(DoRequest("1.0", "universalsaas.digitalhuman.voice.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人平台音色试听接口
         * Summary: 数字人平台音色试听接口
         */
        public async Task<PreviewUniversalsaasDigitalhumanVoiceResponse> PreviewUniversalsaasDigitalhumanVoiceExAsync(PreviewUniversalsaasDigitalhumanVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewUniversalsaasDigitalhumanVoiceResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.voice.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人平台角色创建与更新接口
         * Summary: 数字人平台角色创建与更新接口
         */
        public UpdateUniversalsaasDigitalhumanHumanResponse UpdateUniversalsaasDigitalhumanHuman(UpdateUniversalsaasDigitalhumanHumanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
        }

        /**
         * Description: 数字人平台角色创建与更新接口
         * Summary: 数字人平台角色创建与更新接口
         */
        public async Task<UpdateUniversalsaasDigitalhumanHumanResponse> UpdateUniversalsaasDigitalhumanHumanAsync(UpdateUniversalsaasDigitalhumanHumanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUniversalsaasDigitalhumanHumanExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字人平台角色创建与更新接口
         * Summary: 数字人平台角色创建与更新接口
         */
        public UpdateUniversalsaasDigitalhumanHumanResponse UpdateUniversalsaasDigitalhumanHumanEx(UpdateUniversalsaasDigitalhumanHumanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanHumanResponse>(DoRequest("1.0", "universalsaas.digitalhuman.human.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人平台角色创建与更新接口
         * Summary: 数字人平台角色创建与更新接口
         */
        public async Task<UpdateUniversalsaasDigitalhumanHumanResponse> UpdateUniversalsaasDigitalhumanHumanExAsync(UpdateUniversalsaasDigitalhumanHumanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanHumanResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.human.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除数字人角色接口
         * Summary: 删除数字人角色接口
         */
        public DeleteUniversalsaasDigitalhumanHumanResponse DeleteUniversalsaasDigitalhumanHuman(DeleteUniversalsaasDigitalhumanHumanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUniversalsaasDigitalhumanHumanEx(request, headers, runtime);
        }

        /**
         * Description: 删除数字人角色接口
         * Summary: 删除数字人角色接口
         */
        public async Task<DeleteUniversalsaasDigitalhumanHumanResponse> DeleteUniversalsaasDigitalhumanHumanAsync(DeleteUniversalsaasDigitalhumanHumanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUniversalsaasDigitalhumanHumanExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除数字人角色接口
         * Summary: 删除数字人角色接口
         */
        public DeleteUniversalsaasDigitalhumanHumanResponse DeleteUniversalsaasDigitalhumanHumanEx(DeleteUniversalsaasDigitalhumanHumanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanHumanResponse>(DoRequest("1.0", "universalsaas.digitalhuman.human.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除数字人角色接口
         * Summary: 删除数字人角色接口
         */
        public async Task<DeleteUniversalsaasDigitalhumanHumanResponse> DeleteUniversalsaasDigitalhumanHumanExAsync(DeleteUniversalsaasDigitalhumanHumanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanHumanResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.human.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除知识点接口
         * Summary: 删除知识点接口
         */
        public DeleteUniversalsaasDigitalhumanKnowledgeResponse DeleteUniversalsaasDigitalhumanKnowledge(DeleteUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
        }

        /**
         * Description: 删除知识点接口
         * Summary: 删除知识点接口
         */
        public async Task<DeleteUniversalsaasDigitalhumanKnowledgeResponse> DeleteUniversalsaasDigitalhumanKnowledgeAsync(DeleteUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUniversalsaasDigitalhumanKnowledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除知识点接口
         * Summary: 删除知识点接口
         */
        public DeleteUniversalsaasDigitalhumanKnowledgeResponse DeleteUniversalsaasDigitalhumanKnowledgeEx(DeleteUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanKnowledgeResponse>(DoRequest("1.0", "universalsaas.digitalhuman.knowledge.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除知识点接口
         * Summary: 删除知识点接口
         */
        public async Task<DeleteUniversalsaasDigitalhumanKnowledgeResponse> DeleteUniversalsaasDigitalhumanKnowledgeExAsync(DeleteUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanKnowledgeResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.knowledge.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建批量导入任务
         * Summary: 创建批量导入任务
         */
        public CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse CreateUniversalsaasDigitalhumanKnowledgeImporttask(CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUniversalsaasDigitalhumanKnowledgeImporttaskEx(request, headers, runtime);
        }

        /**
         * Description: 创建批量导入任务
         * Summary: 创建批量导入任务
         */
        public async Task<CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse> CreateUniversalsaasDigitalhumanKnowledgeImporttaskAsync(CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUniversalsaasDigitalhumanKnowledgeImporttaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建批量导入任务
         * Summary: 创建批量导入任务
         */
        public CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse CreateUniversalsaasDigitalhumanKnowledgeImporttaskEx(CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "universalsaas.digitalhuman.knowledge.importtask.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse createUniversalsaasDigitalhumanKnowledgeImporttaskResponse = new CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createUniversalsaasDigitalhumanKnowledgeImporttaskResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse>(DoRequest("1.0", "universalsaas.digitalhuman.knowledge.importtask.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建批量导入任务
         * Summary: 创建批量导入任务
         */
        public async Task<CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse> CreateUniversalsaasDigitalhumanKnowledgeImporttaskExAsync(CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "universalsaas.digitalhuman.knowledge.importtask.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse createUniversalsaasDigitalhumanKnowledgeImporttaskResponse = new CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createUniversalsaasDigitalhumanKnowledgeImporttaskResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.knowledge.importtask.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询批量导入任务
         * Summary: 查询批量导入任务
         */
        public QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse QueryUniversalsaasDigitalhumanKnowledgeImporttask(QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUniversalsaasDigitalhumanKnowledgeImporttaskEx(request, headers, runtime);
        }

        /**
         * Description: 查询批量导入任务
         * Summary: 查询批量导入任务
         */
        public async Task<QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse> QueryUniversalsaasDigitalhumanKnowledgeImporttaskAsync(QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUniversalsaasDigitalhumanKnowledgeImporttaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询批量导入任务
         * Summary: 查询批量导入任务
         */
        public QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse QueryUniversalsaasDigitalhumanKnowledgeImporttaskEx(QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse>(DoRequest("1.0", "universalsaas.digitalhuman.knowledge.importtask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询批量导入任务
         * Summary: 查询批量导入任务
         */
        public async Task<QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse> QueryUniversalsaasDigitalhumanKnowledgeImporttaskExAsync(QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.knowledge.importtask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识点批量导出
         * Summary: 知识点批量导出
         */
        public ExportUniversalsaasDigitalhumanKnowledgeResponse ExportUniversalsaasDigitalhumanKnowledge(ExportUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportUniversalsaasDigitalhumanKnowledgeEx(request, headers, runtime);
        }

        /**
         * Description: 知识点批量导出
         * Summary: 知识点批量导出
         */
        public async Task<ExportUniversalsaasDigitalhumanKnowledgeResponse> ExportUniversalsaasDigitalhumanKnowledgeAsync(ExportUniversalsaasDigitalhumanKnowledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportUniversalsaasDigitalhumanKnowledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 知识点批量导出
         * Summary: 知识点批量导出
         */
        public ExportUniversalsaasDigitalhumanKnowledgeResponse ExportUniversalsaasDigitalhumanKnowledgeEx(ExportUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportUniversalsaasDigitalhumanKnowledgeResponse>(DoRequest("1.0", "universalsaas.digitalhuman.knowledge.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识点批量导出
         * Summary: 知识点批量导出
         */
        public async Task<ExportUniversalsaasDigitalhumanKnowledgeResponse> ExportUniversalsaasDigitalhumanKnowledgeExAsync(ExportUniversalsaasDigitalhumanKnowledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportUniversalsaasDigitalhumanKnowledgeResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.knowledge.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取实时流列表接口
         * Summary: 获取实时流列表接口
         */
        public ListUniversalsaasDigitalhumanStreamResponse ListUniversalsaasDigitalhumanStream(ListUniversalsaasDigitalhumanStreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUniversalsaasDigitalhumanStreamEx(request, headers, runtime);
        }

        /**
         * Description: 获取实时流列表接口
         * Summary: 获取实时流列表接口
         */
        public async Task<ListUniversalsaasDigitalhumanStreamResponse> ListUniversalsaasDigitalhumanStreamAsync(ListUniversalsaasDigitalhumanStreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUniversalsaasDigitalhumanStreamExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取实时流列表接口
         * Summary: 获取实时流列表接口
         */
        public ListUniversalsaasDigitalhumanStreamResponse ListUniversalsaasDigitalhumanStreamEx(ListUniversalsaasDigitalhumanStreamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanStreamResponse>(DoRequest("1.0", "universalsaas.digitalhuman.stream.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取实时流列表接口
         * Summary: 获取实时流列表接口
         */
        public async Task<ListUniversalsaasDigitalhumanStreamResponse> ListUniversalsaasDigitalhumanStreamExAsync(ListUniversalsaasDigitalhumanStreamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanStreamResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.stream.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关闭实时流接口
         * Summary: 关闭实时流接口
         */
        public StopUniversalsaasDigitalhumanStreamResponse StopUniversalsaasDigitalhumanStream(StopUniversalsaasDigitalhumanStreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopUniversalsaasDigitalhumanStreamEx(request, headers, runtime);
        }

        /**
         * Description: 关闭实时流接口
         * Summary: 关闭实时流接口
         */
        public async Task<StopUniversalsaasDigitalhumanStreamResponse> StopUniversalsaasDigitalhumanStreamAsync(StopUniversalsaasDigitalhumanStreamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopUniversalsaasDigitalhumanStreamExAsync(request, headers, runtime);
        }

        /**
         * Description: 关闭实时流接口
         * Summary: 关闭实时流接口
         */
        public StopUniversalsaasDigitalhumanStreamResponse StopUniversalsaasDigitalhumanStreamEx(StopUniversalsaasDigitalhumanStreamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopUniversalsaasDigitalhumanStreamResponse>(DoRequest("1.0", "universalsaas.digitalhuman.stream.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关闭实时流接口
         * Summary: 关闭实时流接口
         */
        public async Task<StopUniversalsaasDigitalhumanStreamResponse> StopUniversalsaasDigitalhumanStreamExAsync(StopUniversalsaasDigitalhumanStreamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopUniversalsaasDigitalhumanStreamResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.stream.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大模型对话配置明细
         * Summary: 大模型对话配置明细
         */
        public DetailUniversalsaasDigitalhumanLlmChatResponse DetailUniversalsaasDigitalhumanLlmChat(DetailUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
        }

        /**
         * Description: 大模型对话配置明细
         * Summary: 大模型对话配置明细
         */
        public async Task<DetailUniversalsaasDigitalhumanLlmChatResponse> DetailUniversalsaasDigitalhumanLlmChatAsync(DetailUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailUniversalsaasDigitalhumanLlmChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 大模型对话配置明细
         * Summary: 大模型对话配置明细
         */
        public DetailUniversalsaasDigitalhumanLlmChatResponse DetailUniversalsaasDigitalhumanLlmChatEx(DetailUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailUniversalsaasDigitalhumanLlmChatResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.chat.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大模型对话配置明细
         * Summary: 大模型对话配置明细
         */
        public async Task<DetailUniversalsaasDigitalhumanLlmChatResponse> DetailUniversalsaasDigitalhumanLlmChatExAsync(DetailUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailUniversalsaasDigitalhumanLlmChatResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.chat.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增大模型对话配置
         * Summary: 新增大模型对话配置
         */
        public AddUniversalsaasDigitalhumanLlmChatResponse AddUniversalsaasDigitalhumanLlmChat(AddUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
        }

        /**
         * Description: 新增大模型对话配置
         * Summary: 新增大模型对话配置
         */
        public async Task<AddUniversalsaasDigitalhumanLlmChatResponse> AddUniversalsaasDigitalhumanLlmChatAsync(AddUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddUniversalsaasDigitalhumanLlmChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增大模型对话配置
         * Summary: 新增大模型对话配置
         */
        public AddUniversalsaasDigitalhumanLlmChatResponse AddUniversalsaasDigitalhumanLlmChatEx(AddUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanLlmChatResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.chat.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增大模型对话配置
         * Summary: 新增大模型对话配置
         */
        public async Task<AddUniversalsaasDigitalhumanLlmChatResponse> AddUniversalsaasDigitalhumanLlmChatExAsync(AddUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanLlmChatResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.chat.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新大模型对话配置
         * Summary: 更新大模型对话配置
         */
        public UpdateUniversalsaasDigitalhumanLlmChatResponse UpdateUniversalsaasDigitalhumanLlmChat(UpdateUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
        }

        /**
         * Description: 更新大模型对话配置
         * Summary: 更新大模型对话配置
         */
        public async Task<UpdateUniversalsaasDigitalhumanLlmChatResponse> UpdateUniversalsaasDigitalhumanLlmChatAsync(UpdateUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUniversalsaasDigitalhumanLlmChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新大模型对话配置
         * Summary: 更新大模型对话配置
         */
        public UpdateUniversalsaasDigitalhumanLlmChatResponse UpdateUniversalsaasDigitalhumanLlmChatEx(UpdateUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanLlmChatResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.chat.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新大模型对话配置
         * Summary: 更新大模型对话配置
         */
        public async Task<UpdateUniversalsaasDigitalhumanLlmChatResponse> UpdateUniversalsaasDigitalhumanLlmChatExAsync(UpdateUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanLlmChatResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.chat.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除大模型对话配置
         * Summary: 删除大模型对话配置
         */
        public DeleteUniversalsaasDigitalhumanLlmChatResponse DeleteUniversalsaasDigitalhumanLlmChat(DeleteUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUniversalsaasDigitalhumanLlmChatEx(request, headers, runtime);
        }

        /**
         * Description: 删除大模型对话配置
         * Summary: 删除大模型对话配置
         */
        public async Task<DeleteUniversalsaasDigitalhumanLlmChatResponse> DeleteUniversalsaasDigitalhumanLlmChatAsync(DeleteUniversalsaasDigitalhumanLlmChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUniversalsaasDigitalhumanLlmChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除大模型对话配置
         * Summary: 删除大模型对话配置
         */
        public DeleteUniversalsaasDigitalhumanLlmChatResponse DeleteUniversalsaasDigitalhumanLlmChatEx(DeleteUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanLlmChatResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.chat.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除大模型对话配置
         * Summary: 删除大模型对话配置
         */
        public async Task<DeleteUniversalsaasDigitalhumanLlmChatResponse> DeleteUniversalsaasDigitalhumanLlmChatExAsync(DeleteUniversalsaasDigitalhumanLlmChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanLlmChatResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.chat.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增模型配置
         * Summary: 新增模型配置
         */
        public AddUniversalsaasDigitalhumanLlmModelResponse AddUniversalsaasDigitalhumanLlmModel(AddUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
        }

        /**
         * Description: 新增模型配置
         * Summary: 新增模型配置
         */
        public async Task<AddUniversalsaasDigitalhumanLlmModelResponse> AddUniversalsaasDigitalhumanLlmModelAsync(AddUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddUniversalsaasDigitalhumanLlmModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增模型配置
         * Summary: 新增模型配置
         */
        public AddUniversalsaasDigitalhumanLlmModelResponse AddUniversalsaasDigitalhumanLlmModelEx(AddUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanLlmModelResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.model.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增模型配置
         * Summary: 新增模型配置
         */
        public async Task<AddUniversalsaasDigitalhumanLlmModelResponse> AddUniversalsaasDigitalhumanLlmModelExAsync(AddUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUniversalsaasDigitalhumanLlmModelResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.model.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型配置
         * Summary: 删除模型配置
         */
        public DeleteUniversalsaasDigitalhumanLlmModelResponse DeleteUniversalsaasDigitalhumanLlmModel(DeleteUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
        }

        /**
         * Description: 删除模型配置
         * Summary: 删除模型配置
         */
        public async Task<DeleteUniversalsaasDigitalhumanLlmModelResponse> DeleteUniversalsaasDigitalhumanLlmModelAsync(DeleteUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUniversalsaasDigitalhumanLlmModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除模型配置
         * Summary: 删除模型配置
         */
        public DeleteUniversalsaasDigitalhumanLlmModelResponse DeleteUniversalsaasDigitalhumanLlmModelEx(DeleteUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanLlmModelResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.model.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型配置
         * Summary: 删除模型配置
         */
        public async Task<DeleteUniversalsaasDigitalhumanLlmModelResponse> DeleteUniversalsaasDigitalhumanLlmModelExAsync(DeleteUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUniversalsaasDigitalhumanLlmModelResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.model.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型配置
         * Summary: 更新模型配置
         */
        public UpdateUniversalsaasDigitalhumanLlmModelResponse UpdateUniversalsaasDigitalhumanLlmModel(UpdateUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
        }

        /**
         * Description: 更新模型配置
         * Summary: 更新模型配置
         */
        public async Task<UpdateUniversalsaasDigitalhumanLlmModelResponse> UpdateUniversalsaasDigitalhumanLlmModelAsync(UpdateUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUniversalsaasDigitalhumanLlmModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新模型配置
         * Summary: 更新模型配置
         */
        public UpdateUniversalsaasDigitalhumanLlmModelResponse UpdateUniversalsaasDigitalhumanLlmModelEx(UpdateUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanLlmModelResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.model.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型配置
         * Summary: 更新模型配置
         */
        public async Task<UpdateUniversalsaasDigitalhumanLlmModelResponse> UpdateUniversalsaasDigitalhumanLlmModelExAsync(UpdateUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUniversalsaasDigitalhumanLlmModelResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.model.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模型配置列表
         * Summary: 获取模型配置列表
         */
        public ListUniversalsaasDigitalhumanLlmModelResponse ListUniversalsaasDigitalhumanLlmModel(ListUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
        }

        /**
         * Description: 获取模型配置列表
         * Summary: 获取模型配置列表
         */
        public async Task<ListUniversalsaasDigitalhumanLlmModelResponse> ListUniversalsaasDigitalhumanLlmModelAsync(ListUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUniversalsaasDigitalhumanLlmModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取模型配置列表
         * Summary: 获取模型配置列表
         */
        public ListUniversalsaasDigitalhumanLlmModelResponse ListUniversalsaasDigitalhumanLlmModelEx(ListUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanLlmModelResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.model.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模型配置列表
         * Summary: 获取模型配置列表
         */
        public async Task<ListUniversalsaasDigitalhumanLlmModelResponse> ListUniversalsaasDigitalhumanLlmModelExAsync(ListUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanLlmModelResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.model.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型配置明细
         * Summary: 查询模型配置明细
         */
        public DetailUniversalsaasDigitalhumanLlmModelResponse DetailUniversalsaasDigitalhumanLlmModel(DetailUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailUniversalsaasDigitalhumanLlmModelEx(request, headers, runtime);
        }

        /**
         * Description: 查询模型配置明细
         * Summary: 查询模型配置明细
         */
        public async Task<DetailUniversalsaasDigitalhumanLlmModelResponse> DetailUniversalsaasDigitalhumanLlmModelAsync(DetailUniversalsaasDigitalhumanLlmModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailUniversalsaasDigitalhumanLlmModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询模型配置明细
         * Summary: 查询模型配置明细
         */
        public DetailUniversalsaasDigitalhumanLlmModelResponse DetailUniversalsaasDigitalhumanLlmModelEx(DetailUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailUniversalsaasDigitalhumanLlmModelResponse>(DoRequest("1.0", "universalsaas.digitalhuman.llm.model.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型配置明细
         * Summary: 查询模型配置明细
         */
        public async Task<DetailUniversalsaasDigitalhumanLlmModelResponse> DetailUniversalsaasDigitalhumanLlmModelExAsync(DetailUniversalsaasDigitalhumanLlmModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailUniversalsaasDigitalhumanLlmModelResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.llm.model.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntcloudGatewayxFileUploadEx(request, headers, runtime);
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadAsync(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntcloudGatewayxFileUploadExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(DoRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadExAsync(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(await DoRequestAsync("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
