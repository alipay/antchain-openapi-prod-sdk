// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.BAASDIGITAL.Models;

namespace AntChain.SDK.BAASDIGITAL
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
                        {"sdk_version", "1.0.34"},
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
                        {"sdk_version", "1.0.34"},
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
         * Description: 检测账户名称是否已经在区块链注册
         * Summary: 检测账户名称是否已经在区块链注册
         */
        public CheckAccountResponse CheckAccount(CheckAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAccountEx(request, headers, runtime);
        }

        /**
         * Description: 检测账户名称是否已经在区块链注册
         * Summary: 检测账户名称是否已经在区块链注册
         */
        public async Task<CheckAccountResponse> CheckAccountAsync(CheckAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 检测账户名称是否已经在区块链注册
         * Summary: 检测账户名称是否已经在区块链注册
         */
        public CheckAccountResponse CheckAccountEx(CheckAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAccountResponse>(DoRequest("1.0", "antchain.baasdigital.account.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检测账户名称是否已经在区块链注册
         * Summary: 检测账户名称是否已经在区块链注册
         */
        public async Task<CheckAccountResponse> CheckAccountExAsync(CheckAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAccountResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.account.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建MyChain托管账户
         * Summary: 创建MyChain托管账户
         */
        public CreateAccountKmsResponse CreateAccountKms(CreateAccountKmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAccountKmsEx(request, headers, runtime);
        }

        /**
         * Description: 创建MyChain托管账户
         * Summary: 创建MyChain托管账户
         */
        public async Task<CreateAccountKmsResponse> CreateAccountKmsAsync(CreateAccountKmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAccountKmsExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建MyChain托管账户
         * Summary: 创建MyChain托管账户
         */
        public CreateAccountKmsResponse CreateAccountKmsEx(CreateAccountKmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAccountKmsResponse>(DoRequest("1.0", "antchain.baasdigital.account.kms.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建MyChain托管账户
         * Summary: 创建MyChain托管账户
         */
        public async Task<CreateAccountKmsResponse> CreateAccountKmsExAsync(CreateAccountKmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAccountKmsResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.account.kms.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建oss上传policy，客户端使用http方式自主上传文件
         * Summary: 创建资源上传规则url
         */
        public CreateResourcePolicyResponse CreateResourcePolicy(CreateResourcePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateResourcePolicyEx(request, headers, runtime);
        }

        /**
         * Description: 创建oss上传policy，客户端使用http方式自主上传文件
         * Summary: 创建资源上传规则url
         */
        public async Task<CreateResourcePolicyResponse> CreateResourcePolicyAsync(CreateResourcePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateResourcePolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建oss上传policy，客户端使用http方式自主上传文件
         * Summary: 创建资源上传规则url
         */
        public CreateResourcePolicyResponse CreateResourcePolicyEx(CreateResourcePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourcePolicyResponse>(DoRequest("1.0", "antchain.baasdigital.resource.policy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建oss上传policy，客户端使用http方式自主上传文件
         * Summary: 创建资源上传规则url
         */
        public async Task<CreateResourcePolicyResponse> CreateResourcePolicyExAsync(CreateResourcePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourcePolicyResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.resource.policy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传文件状态检测
         * Summary: 上传文件状态检测
         */
        public CheckResourceResponse CheckResource(CheckResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckResourceEx(request, headers, runtime);
        }

        /**
         * Description: 上传文件状态检测
         * Summary: 上传文件状态检测
         */
        public async Task<CheckResourceResponse> CheckResourceAsync(CheckResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传文件状态检测
         * Summary: 上传文件状态检测
         */
        public CheckResourceResponse CheckResourceEx(CheckResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckResourceResponse>(DoRequest("1.0", "antchain.baasdigital.resource.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传文件状态检测
         * Summary: 上传文件状态检测
         */
        public async Task<CheckResourceResponse> CheckResourceExAsync(CheckResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckResourceResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.resource.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 定义数字权证AssetUri，包括权证所需各种属性
         * Summary: 定义数字权证AssetUri
         */
        public CreateAsseturiResponse CreateAsseturi(CreateAsseturiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAsseturiEx(request, headers, runtime);
        }

        /**
         * Description: 定义数字权证AssetUri，包括权证所需各种属性
         * Summary: 定义数字权证AssetUri
         */
        public async Task<CreateAsseturiResponse> CreateAsseturiAsync(CreateAsseturiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAsseturiExAsync(request, headers, runtime);
        }

        /**
         * Description: 定义数字权证AssetUri，包括权证所需各种属性
         * Summary: 定义数字权证AssetUri
         */
        public CreateAsseturiResponse CreateAsseturiEx(CreateAsseturiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAsseturiResponse>(DoRequest("1.0", "antchain.baasdigital.asseturi.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 定义数字权证AssetUri，包括权证所需各种属性
         * Summary: 定义数字权证AssetUri
         */
        public async Task<CreateAsseturiResponse> CreateAsseturiExAsync(CreateAsseturiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAsseturiResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.asseturi.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询项目信息
         * Summary: 查询项目初始信息
         */
        public QueryProjectResponse QueryProject(QueryProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryProjectEx(request, headers, runtime);
        }

        /**
         * Description: 查询项目信息
         * Summary: 查询项目初始信息
         */
        public async Task<QueryProjectResponse> QueryProjectAsync(QueryProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询项目信息
         * Summary: 查询项目初始信息
         */
        public QueryProjectResponse QueryProjectEx(QueryProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProjectResponse>(DoRequest("1.0", "antchain.baasdigital.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询项目信息
         * Summary: 查询项目初始信息
         */
        public async Task<QueryProjectResponse> QueryProjectExAsync(QueryProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProjectResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数字权证项目
         * Summary: 创建数字权证项目
         */
        public CreateProjectResponse CreateProject(CreateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateProjectEx(request, headers, runtime);
        }

        /**
         * Description: 创建数字权证项目
         * Summary: 创建数字权证项目
         */
        public async Task<CreateProjectResponse> CreateProjectAsync(CreateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建数字权证项目
         * Summary: 创建数字权证项目
         */
        public CreateProjectResponse CreateProjectEx(CreateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectResponse>(DoRequest("1.0", "antchain.baasdigital.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数字权证项目
         * Summary: 创建数字权证项目
         */
        public async Task<CreateProjectResponse> CreateProjectExAsync(CreateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新数字权证项目信息
         * Summary: 更新数字权证项目信息
         */
        public UpdateProjectResponse UpdateProject(UpdateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateProjectEx(request, headers, runtime);
        }

        /**
         * Description: 更新数字权证项目信息
         * Summary: 更新数字权证项目信息
         */
        public async Task<UpdateProjectResponse> UpdateProjectAsync(UpdateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新数字权证项目信息
         * Summary: 更新数字权证项目信息
         */
        public UpdateProjectResponse UpdateProjectEx(UpdateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateProjectResponse>(DoRequest("1.0", "antchain.baasdigital.project.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新数字权证项目信息
         * Summary: 更新数字权证项目信息
         */
        public async Task<UpdateProjectResponse> UpdateProjectExAsync(UpdateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateProjectResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.project.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证签发(异步)
         * Summary: 数字权证签发(异步)
         */
        public ExecContractIssueResponse ExecContractIssue(ExecContractIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractIssueEx(request, headers, runtime);
        }

        /**
         * Description: 数字权证签发(异步)
         * Summary: 数字权证签发(异步)
         */
        public async Task<ExecContractIssueResponse> ExecContractIssueAsync(ExecContractIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractIssueExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字权证签发(异步)
         * Summary: 数字权证签发(异步)
         */
        public ExecContractIssueResponse ExecContractIssueEx(ExecContractIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractIssueResponse>(DoRequest("1.0", "antchain.baasdigital.contract.issue.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证签发(异步)
         * Summary: 数字权证签发(异步)
         */
        public async Task<ExecContractIssueResponse> ExecContractIssueExAsync(ExecContractIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractIssueResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.issue.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有项目ID列表
         * Summary: 查询所有项目ID列表
         */
        public ListProjectResponse ListProject(ListProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListProjectEx(request, headers, runtime);
        }

        /**
         * Description: 查询所有项目ID列表
         * Summary: 查询所有项目ID列表
         */
        public async Task<ListProjectResponse> ListProjectAsync(ListProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询所有项目ID列表
         * Summary: 查询所有项目ID列表
         */
        public ListProjectResponse ListProjectEx(ListProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListProjectResponse>(DoRequest("1.0", "antchain.baasdigital.project.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有项目ID列表
         * Summary: 查询所有项目ID列表
         */
        public async Task<ListProjectResponse> ListProjectExAsync(ListProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListProjectResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.project.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发送到链上的交易内容
         * Summary: 查询交易
         */
        public QueryContractTransactionResponse QueryContractTransaction(QueryContractTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractTransactionEx(request, headers, runtime);
        }

        /**
         * Description: 查询发送到链上的交易内容
         * Summary: 查询交易
         */
        public async Task<QueryContractTransactionResponse> QueryContractTransactionAsync(QueryContractTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractTransactionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发送到链上的交易内容
         * Summary: 查询交易
         */
        public QueryContractTransactionResponse QueryContractTransactionEx(QueryContractTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTransactionResponse>(DoRequest("1.0", "antchain.baasdigital.contract.transaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发送到链上的交易内容
         * Summary: 查询交易
         */
        public async Task<QueryContractTransactionResponse> QueryContractTransactionExAsync(QueryContractTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTransactionResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.transaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发送到链上的交易执行的结果
         * Summary: 查询交易执行回执
         */
        public QueryContractReceiptResponse QueryContractReceipt(QueryContractReceiptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractReceiptEx(request, headers, runtime);
        }

        /**
         * Description: 查询发送到链上的交易执行的结果
         * Summary: 查询交易执行回执
         */
        public async Task<QueryContractReceiptResponse> QueryContractReceiptAsync(QueryContractReceiptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractReceiptExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发送到链上的交易执行的结果
         * Summary: 查询交易执行回执
         */
        public QueryContractReceiptResponse QueryContractReceiptEx(QueryContractReceiptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractReceiptResponse>(DoRequest("1.0", "antchain.baasdigital.contract.receipt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发送到链上的交易执行的结果
         * Summary: 查询交易执行回执
         */
        public async Task<QueryContractReceiptResponse> QueryContractReceiptExAsync(QueryContractReceiptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractReceiptResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.receipt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证增发(异步)
         * Summary: 数字权证增发(异步)
         */
        public ExecContractAddsupplyResponse ExecContractAddsupply(ExecContractAddsupplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractAddsupplyEx(request, headers, runtime);
        }

        /**
         * Description: 数字权证增发(异步)
         * Summary: 数字权证增发(异步)
         */
        public async Task<ExecContractAddsupplyResponse> ExecContractAddsupplyAsync(ExecContractAddsupplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractAddsupplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字权证增发(异步)
         * Summary: 数字权证增发(异步)
         */
        public ExecContractAddsupplyResponse ExecContractAddsupplyEx(ExecContractAddsupplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractAddsupplyResponse>(DoRequest("1.0", "antchain.baasdigital.contract.addsupply.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证增发(异步)
         * Summary: 数字权证增发(异步)
         */
        public async Task<ExecContractAddsupplyResponse> ExecContractAddsupplyExAsync(ExecContractAddsupplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractAddsupplyResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.addsupply.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证转移(异步)
         * Summary: 数字权证转移(异步)
         */
        public ExecContractTransferResponse ExecContractTransfer(ExecContractTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractTransferEx(request, headers, runtime);
        }

        /**
         * Description: 数字权证转移(异步)
         * Summary: 数字权证转移(异步)
         */
        public async Task<ExecContractTransferResponse> ExecContractTransferAsync(ExecContractTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字权证转移(异步)
         * Summary: 数字权证转移(异步)
         */
        public ExecContractTransferResponse ExecContractTransferEx(ExecContractTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractTransferResponse>(DoRequest("1.0", "antchain.baasdigital.contract.transfer.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证转移(异步)
         * Summary: 数字权证转移(异步)
         */
        public async Task<ExecContractTransferResponse> ExecContractTransferExAsync(ExecContractTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractTransferResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.transfer.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证核销(异步)
         * Summary: 数字权证核销(异步)
         */
        public ExecContractWriteoffResponse ExecContractWriteoff(ExecContractWriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractWriteoffEx(request, headers, runtime);
        }

        /**
         * Description: 数字权证核销(异步)
         * Summary: 数字权证核销(异步)
         */
        public async Task<ExecContractWriteoffResponse> ExecContractWriteoffAsync(ExecContractWriteoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractWriteoffExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字权证核销(异步)
         * Summary: 数字权证核销(异步)
         */
        public ExecContractWriteoffResponse ExecContractWriteoffEx(ExecContractWriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractWriteoffResponse>(DoRequest("1.0", "antchain.baasdigital.contract.writeoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证核销(异步)
         * Summary: 数字权证核销(异步)
         */
        public async Task<ExecContractWriteoffResponse> ExecContractWriteoffExAsync(ExecContractWriteoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractWriteoffResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.writeoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证销毁(异步)
         * Summary: 数字权证销毁(异步)
         */
        public ExecContractBurnoffResponse ExecContractBurnoff(ExecContractBurnoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractBurnoffEx(request, headers, runtime);
        }

        /**
         * Description: 数字权证销毁(异步)
         * Summary: 数字权证销毁(异步)
         */
        public async Task<ExecContractBurnoffResponse> ExecContractBurnoffAsync(ExecContractBurnoffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractBurnoffExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字权证销毁(异步)
         * Summary: 数字权证销毁(异步)
         */
        public ExecContractBurnoffResponse ExecContractBurnoffEx(ExecContractBurnoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractBurnoffResponse>(DoRequest("1.0", "antchain.baasdigital.contract.burnoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字权证销毁(异步)
         * Summary: 数字权证销毁(异步)
         */
        public async Task<ExecContractBurnoffResponse> ExecContractBurnoffExAsync(ExecContractBurnoffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractBurnoffResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.burnoff.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询特定账户下的权证信息
         * Summary: 查询特定账户下的权证信息
         */
        public QueryContractAssetResponse QueryContractAsset(QueryContractAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractAssetEx(request, headers, runtime);
        }

        /**
         * Description: 查询特定账户下的权证信息
         * Summary: 查询特定账户下的权证信息
         */
        public async Task<QueryContractAssetResponse> QueryContractAssetAsync(QueryContractAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractAssetExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询特定账户下的权证信息
         * Summary: 查询特定账户下的权证信息
         */
        public QueryContractAssetResponse QueryContractAssetEx(QueryContractAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractAssetResponse>(DoRequest("1.0", "antchain.baasdigital.contract.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询特定账户下的权证信息
         * Summary: 查询特定账户下的权证信息
         */
        public async Task<QueryContractAssetResponse> QueryContractAssetExAsync(QueryContractAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractAssetResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询特定权证的uri meta信息
         * Summary: 查询特定权证的uri meta信息
         */
        public QueryContractAsseturiResponse QueryContractAsseturi(QueryContractAsseturiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractAsseturiEx(request, headers, runtime);
        }

        /**
         * Description: 查询特定权证的uri meta信息
         * Summary: 查询特定权证的uri meta信息
         */
        public async Task<QueryContractAsseturiResponse> QueryContractAsseturiAsync(QueryContractAsseturiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractAsseturiExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询特定权证的uri meta信息
         * Summary: 查询特定权证的uri meta信息
         */
        public QueryContractAsseturiResponse QueryContractAsseturiEx(QueryContractAsseturiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractAsseturiResponse>(DoRequest("1.0", "antchain.baasdigital.contract.asseturi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询特定权证的uri meta信息
         * Summary: 查询特定权证的uri meta信息
         */
        public async Task<QueryContractAsseturiResponse> QueryContractAsseturiExAsync(QueryContractAsseturiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractAsseturiResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.asseturi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权权证给某个账户
         * Summary: 数字权证授权(异步)
         */
        public ExecContractApproveResponse ExecContractApprove(ExecContractApproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractApproveEx(request, headers, runtime);
        }

        /**
         * Description: 授权权证给某个账户
         * Summary: 数字权证授权(异步)
         */
        public async Task<ExecContractApproveResponse> ExecContractApproveAsync(ExecContractApproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractApproveExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权权证给某个账户
         * Summary: 数字权证授权(异步)
         */
        public ExecContractApproveResponse ExecContractApproveEx(ExecContractApproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractApproveResponse>(DoRequest("1.0", "antchain.baasdigital.contract.approve.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权权证给某个账户
         * Summary: 数字权证授权(异步)
         */
        public async Task<ExecContractApproveResponse> ExecContractApproveExAsync(ExecContractApproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractApproveResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.approve.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消数字权证授权
         * Summary: 取消数字权证授权(异步)
         */
        public CancelContractApproveResponse CancelContractApprove(CancelContractApproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelContractApproveEx(request, headers, runtime);
        }

        /**
         * Description: 取消数字权证授权
         * Summary: 取消数字权证授权(异步)
         */
        public async Task<CancelContractApproveResponse> CancelContractApproveAsync(CancelContractApproveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelContractApproveExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消数字权证授权
         * Summary: 取消数字权证授权(异步)
         */
        public CancelContractApproveResponse CancelContractApproveEx(CancelContractApproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractApproveResponse>(DoRequest("1.0", "antchain.baasdigital.contract.approve.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消数字权证授权
         * Summary: 取消数字权证授权(异步)
         */
        public async Task<CancelContractApproveResponse> CancelContractApproveExAsync(CancelContractApproveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractApproveResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.approve.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
        同一个账户可具备多个角色，同一个角色可有多个账户。
         * Summary: 授权项目权证管理角色(异步)
         */
        public SetContractRoleResponse SetContractRole(SetContractRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetContractRoleEx(request, headers, runtime);
        }

        /**
         * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
        同一个账户可具备多个角色，同一个角色可有多个账户。
         * Summary: 授权项目权证管理角色(异步)
         */
        public async Task<SetContractRoleResponse> SetContractRoleAsync(SetContractRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetContractRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
        同一个账户可具备多个角色，同一个角色可有多个账户。
         * Summary: 授权项目权证管理角色(异步)
         */
        public SetContractRoleResponse SetContractRoleEx(SetContractRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetContractRoleResponse>(DoRequest("1.0", "antchain.baasdigital.contract.role.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
        同一个账户可具备多个角色，同一个角色可有多个账户。
         * Summary: 授权项目权证管理角色(异步)
         */
        public async Task<SetContractRoleResponse> SetContractRoleExAsync(SetContractRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetContractRoleResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.role.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
         * Summary: 取消项目管理角色(异步)
         */
        public CancelContractRoleResponse CancelContractRole(CancelContractRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelContractRoleEx(request, headers, runtime);
        }

        /**
         * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
         * Summary: 取消项目管理角色(异步)
         */
        public async Task<CancelContractRoleResponse> CancelContractRoleAsync(CancelContractRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelContractRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
         * Summary: 取消项目管理角色(异步)
         */
        public CancelContractRoleResponse CancelContractRoleEx(CancelContractRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractRoleResponse>(DoRequest("1.0", "antchain.baasdigital.contract.role.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
         * Summary: 取消项目管理角色(异步)
         */
        public async Task<CancelContractRoleResponse> CancelContractRoleExAsync(CancelContractRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractRoleResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.role.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享型项目批量发行权证到指定账户，非共享型项目无法使用此接口
         * Summary: 批量发行权证到指定账户(异步)
         */
        public ExecContractBatchissueResponse ExecContractBatchissue(ExecContractBatchissueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractBatchissueEx(request, headers, runtime);
        }

        /**
         * Description: 共享型项目批量发行权证到指定账户，非共享型项目无法使用此接口
         * Summary: 批量发行权证到指定账户(异步)
         */
        public async Task<ExecContractBatchissueResponse> ExecContractBatchissueAsync(ExecContractBatchissueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractBatchissueExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享型项目批量发行权证到指定账户，非共享型项目无法使用此接口
         * Summary: 批量发行权证到指定账户(异步)
         */
        public ExecContractBatchissueResponse ExecContractBatchissueEx(ExecContractBatchissueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractBatchissueResponse>(DoRequest("1.0", "antchain.baasdigital.contract.batchissue.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享型项目批量发行权证到指定账户，非共享型项目无法使用此接口
         * Summary: 批量发行权证到指定账户(异步)
         */
        public async Task<ExecContractBatchissueResponse> ExecContractBatchissueExAsync(ExecContractBatchissueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractBatchissueResponse>(await DoRequestAsync("1.0", "antchain.baasdigital.contract.batchissue.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
