// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.FAIROPENNET.Models;

namespace AntChain.SDK.FAIROPENNET
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
                        {"sdk_version", "1.0.4"},
                        {"_prod_code", "FAIROPENNET"},
                        {"_prod_channel", "undefined"},
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
                        {"sdk_version", "1.0.4"},
                        {"_prod_code", "FAIROPENNET"},
                        {"_prod_channel", "undefined"},
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
         * Description: 测试用
         * Summary: 测试用
         */
        public StartTestResponse StartTest(StartTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartTestEx(request, headers, runtime);
        }

        /**
         * Description: 测试用
         * Summary: 测试用
         */
        public async Task<StartTestResponse> StartTestAsync(StartTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试用
         * Summary: 测试用
         */
        public StartTestResponse StartTestEx(StartTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartTestResponse>(DoRequest("1.0", "antchain.fairopennet.test.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试用
         * Summary: 测试用
         */
        public async Task<StartTestResponse> StartTestExAsync(StartTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartTestResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.test.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: 初始化客户端配置
         */
        public InitClientConfigResponse InitClientConfig(InitClientConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitClientConfigEx(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: 初始化客户端配置
         */
        public async Task<InitClientConfigResponse> InitClientConfigAsync(InitClientConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitClientConfigExAsync(request, headers, runtime);
        }

        /**
         * Description:  
         * Summary: 初始化客户端配置
         */
        public InitClientConfigResponse InitClientConfigEx(InitClientConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitClientConfigResponse>(DoRequest("1.0", "antchain.fairopennet.client.config.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  
         * Summary: 初始化客户端配置
         */
        public async Task<InitClientConfigResponse> InitClientConfigExAsync(InitClientConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitClientConfigResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.client.config.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动客户端，测试连接到FAIR节点
         * Summary: 启动客户端
         */
        public StartClientResponse StartClient(StartClientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartClientEx(request, headers, runtime);
        }

        /**
         * Description: 启动客户端，测试连接到FAIR节点
         * Summary: 启动客户端
         */
        public async Task<StartClientResponse> StartClientAsync(StartClientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartClientExAsync(request, headers, runtime);
        }

        /**
         * Description: 启动客户端，测试连接到FAIR节点
         * Summary: 启动客户端
         */
        public StartClientResponse StartClientEx(StartClientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartClientResponse>(DoRequest("1.0", "antchain.fairopennet.client.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动客户端，测试连接到FAIR节点
         * Summary: 启动客户端
         */
        public async Task<StartClientResponse> StartClientExAsync(StartClientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartClientResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.client.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取治理模块静态配置自启动协作网络的ID
         * Summary: 获取治理模块静态配置自启动协作网络的ID
         */
        public GetGovernancemoduleNetworkidResponse GetGovernancemoduleNetworkid(GetGovernancemoduleNetworkidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGovernancemoduleNetworkidEx(request, headers, runtime);
        }

        /**
         * Description: 获取治理模块静态配置自启动协作网络的ID
         * Summary: 获取治理模块静态配置自启动协作网络的ID
         */
        public async Task<GetGovernancemoduleNetworkidResponse> GetGovernancemoduleNetworkidAsync(GetGovernancemoduleNetworkidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGovernancemoduleNetworkidExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取治理模块静态配置自启动协作网络的ID
         * Summary: 获取治理模块静态配置自启动协作网络的ID
         */
        public GetGovernancemoduleNetworkidResponse GetGovernancemoduleNetworkidEx(GetGovernancemoduleNetworkidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGovernancemoduleNetworkidResponse>(DoRequest("1.0", "antchain.fairopennet.governancemodule.networkid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取治理模块静态配置自启动协作网络的ID
         * Summary: 获取治理模块静态配置自启动协作网络的ID
         */
        public async Task<GetGovernancemoduleNetworkidResponse> GetGovernancemoduleNetworkidExAsync(GetGovernancemoduleNetworkidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGovernancemoduleNetworkidResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.governancemodule.networkid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取协作网络状态
         * Summary: 获取协作网络状态
         */
        public GetNetworkStatusResponse GetNetworkStatus(GetNetworkStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetNetworkStatusEx(request, headers, runtime);
        }

        /**
         * Description: 获取协作网络状态
         * Summary: 获取协作网络状态
         */
        public async Task<GetNetworkStatusResponse> GetNetworkStatusAsync(GetNetworkStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetNetworkStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取协作网络状态
         * Summary: 获取协作网络状态
         */
        public GetNetworkStatusResponse GetNetworkStatusEx(GetNetworkStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNetworkStatusResponse>(DoRequest("1.0", "antchain.fairopennet.network.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取协作网络状态
         * Summary: 获取协作网络状态
         */
        public async Task<GetNetworkStatusResponse> GetNetworkStatusExAsync(GetNetworkStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNetworkStatusResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.network.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取cube节点信息
         * Summary: 获取cube节点信息
         */
        public GetMycubenodeInfoResponse GetMycubenodeInfo(GetMycubenodeInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMycubenodeInfoEx(request, headers, runtime);
        }

        /**
         * Description: 获取cube节点信息
         * Summary: 获取cube节点信息
         */
        public async Task<GetMycubenodeInfoResponse> GetMycubenodeInfoAsync(GetMycubenodeInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMycubenodeInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取cube节点信息
         * Summary: 获取cube节点信息
         */
        public GetMycubenodeInfoResponse GetMycubenodeInfoEx(GetMycubenodeInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMycubenodeInfoResponse>(DoRequest("1.0", "antchain.fairopennet.mycubenode.info.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取cube节点信息
         * Summary: 获取cube节点信息
         */
        public async Task<GetMycubenodeInfoResponse> GetMycubenodeInfoExAsync(GetMycubenodeInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMycubenodeInfoResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.mycubenode.info.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动添加cube节点
         * Summary: 手动添加cube节点
         */
        public AddTrustedcubenodeInfoResponse AddTrustedcubenodeInfo(AddTrustedcubenodeInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddTrustedcubenodeInfoEx(request, headers, runtime);
        }

        /**
         * Description: 手动添加cube节点
         * Summary: 手动添加cube节点
         */
        public async Task<AddTrustedcubenodeInfoResponse> AddTrustedcubenodeInfoAsync(AddTrustedcubenodeInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddTrustedcubenodeInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 手动添加cube节点
         * Summary: 手动添加cube节点
         */
        public AddTrustedcubenodeInfoResponse AddTrustedcubenodeInfoEx(AddTrustedcubenodeInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTrustedcubenodeInfoResponse>(DoRequest("1.0", "antchain.fairopennet.trustedcubenode.info.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动添加cube节点
         * Summary: 手动添加cube节点
         */
        public async Task<AddTrustedcubenodeInfoResponse> AddTrustedcubenodeInfoExAsync(AddTrustedcubenodeInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTrustedcubenodeInfoResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.trustedcubenode.info.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
         * Summary: 普通节点加入协作网络
         */
        public RegisterNormalNodeResponse RegisterNormalNode(RegisterNormalNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterNormalNodeEx(request, headers, runtime);
        }

        /**
         * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
         * Summary: 普通节点加入协作网络
         */
        public async Task<RegisterNormalNodeResponse> RegisterNormalNodeAsync(RegisterNormalNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterNormalNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
         * Summary: 普通节点加入协作网络
         */
        public RegisterNormalNodeResponse RegisterNormalNodeEx(RegisterNormalNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterNormalNodeResponse>(DoRequest("1.0", "antchain.fairopennet.normal.node.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
         * Summary: 普通节点加入协作网络
         */
        public async Task<RegisterNormalNodeResponse> RegisterNormalNodeExAsync(RegisterNormalNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterNormalNodeResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.normal.node.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
         * Summary: 新建协作空间
         */
        public CreateSpaceResponse CreateSpace(CreateSpaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSpaceEx(request, headers, runtime);
        }

        /**
         * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
         * Summary: 新建协作空间
         */
        public async Task<CreateSpaceResponse> CreateSpaceAsync(CreateSpaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSpaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
         * Summary: 新建协作空间
         */
        public CreateSpaceResponse CreateSpaceEx(CreateSpaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpaceResponse>(DoRequest("1.0", "antchain.fairopennet.space.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
         * Summary: 新建协作空间
         */
        public async Task<CreateSpaceResponse> CreateSpaceExAsync(CreateSpaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpaceResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.space.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加协作参与方到协作空间
         * Summary: 添加协作参与方到协作空间
         */
        public AddPartySpaceResponse AddPartySpace(AddPartySpaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddPartySpaceEx(request, headers, runtime);
        }

        /**
         * Description: 添加协作参与方到协作空间
         * Summary: 添加协作参与方到协作空间
         */
        public async Task<AddPartySpaceResponse> AddPartySpaceAsync(AddPartySpaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddPartySpaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加协作参与方到协作空间
         * Summary: 添加协作参与方到协作空间
         */
        public AddPartySpaceResponse AddPartySpaceEx(AddPartySpaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPartySpaceResponse>(DoRequest("1.0", "antchain.fairopennet.party.space.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加协作参与方到协作空间
         * Summary: 添加协作参与方到协作空间
         */
        public async Task<AddPartySpaceResponse> AddPartySpaceExAsync(AddPartySpaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPartySpaceResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.party.space.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
         * Summary: 获取协作网络快照
         */
        public GetNetworkSnapshotResponse GetNetworkSnapshot(GetNetworkSnapshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetNetworkSnapshotEx(request, headers, runtime);
        }

        /**
         * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
         * Summary: 获取协作网络快照
         */
        public async Task<GetNetworkSnapshotResponse> GetNetworkSnapshotAsync(GetNetworkSnapshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetNetworkSnapshotExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
         * Summary: 获取协作网络快照
         */
        public GetNetworkSnapshotResponse GetNetworkSnapshotEx(GetNetworkSnapshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNetworkSnapshotResponse>(DoRequest("1.0", "antchain.fairopennet.network.snapshot.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
         * Summary: 获取协作网络快照
         */
        public async Task<GetNetworkSnapshotResponse> GetNetworkSnapshotExAsync(GetNetworkSnapshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNetworkSnapshotResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.network.snapshot.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: shutdown client
         * Summary: shutdown client
         */
        public StopClientResponse StopClient(StopClientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopClientEx(request, headers, runtime);
        }

        /**
         * Description: shutdown client
         * Summary: shutdown client
         */
        public async Task<StopClientResponse> StopClientAsync(StopClientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopClientExAsync(request, headers, runtime);
        }

        /**
         * Description: shutdown client
         * Summary: shutdown client
         */
        public StopClientResponse StopClientEx(StopClientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopClientResponse>(DoRequest("1.0", "antchain.fairopennet.client.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: shutdown client
         * Summary: shutdown client
         */
        public async Task<StopClientResponse> StopClientExAsync(StopClientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopClientResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.client.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取普通节点自身的节点ID
         * Summary: 获取普通节点自身的节点ID
         */
        public GetNormalmoduleNodeidResponse GetNormalmoduleNodeid(GetNormalmoduleNodeidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetNormalmoduleNodeidEx(request, headers, runtime);
        }

        /**
         * Description: 获取普通节点自身的节点ID
         * Summary: 获取普通节点自身的节点ID
         */
        public async Task<GetNormalmoduleNodeidResponse> GetNormalmoduleNodeidAsync(GetNormalmoduleNodeidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetNormalmoduleNodeidExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取普通节点自身的节点ID
         * Summary: 获取普通节点自身的节点ID
         */
        public GetNormalmoduleNodeidResponse GetNormalmoduleNodeidEx(GetNormalmoduleNodeidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNormalmoduleNodeidResponse>(DoRequest("1.0", "antchain.fairopennet.normalmodule.nodeid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取普通节点自身的节点ID
         * Summary: 获取普通节点自身的节点ID
         */
        public async Task<GetNormalmoduleNodeidResponse> GetNormalmoduleNodeidExAsync(GetNormalmoduleNodeidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNormalmoduleNodeidResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.normalmodule.nodeid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
         * Summary: 添加协作参与方信息
         */
        public AddPartyResponse AddParty(AddPartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddPartyEx(request, headers, runtime);
        }

        /**
         * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
         * Summary: 添加协作参与方信息
         */
        public async Task<AddPartyResponse> AddPartyAsync(AddPartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddPartyExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
         * Summary: 添加协作参与方信息
         */
        public AddPartyResponse AddPartyEx(AddPartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPartyResponse>(DoRequest("1.0", "antchain.fairopennet.party.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
         * Summary: 添加协作参与方信息
         */
        public async Task<AddPartyResponse> AddPartyExAsync(AddPartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPartyResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.party.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取普通节点身份信息
         * Summary: 获取普通节点身份信息
         */
        public GetNormalnodeIdentityinfoResponse GetNormalnodeIdentityinfo(GetNormalnodeIdentityinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetNormalnodeIdentityinfoEx(request, headers, runtime);
        }

        /**
         * Description: 获取普通节点身份信息
         * Summary: 获取普通节点身份信息
         */
        public async Task<GetNormalnodeIdentityinfoResponse> GetNormalnodeIdentityinfoAsync(GetNormalnodeIdentityinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetNormalnodeIdentityinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取普通节点身份信息
         * Summary: 获取普通节点身份信息
         */
        public GetNormalnodeIdentityinfoResponse GetNormalnodeIdentityinfoEx(GetNormalnodeIdentityinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNormalnodeIdentityinfoResponse>(DoRequest("1.0", "antchain.fairopennet.normalnode.identityinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取普通节点身份信息
         * Summary: 获取普通节点身份信息
         */
        public async Task<GetNormalnodeIdentityinfoResponse> GetNormalnodeIdentityinfoExAsync(GetNormalnodeIdentityinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNormalnodeIdentityinfoResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.normalnode.identityinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
         * Summary: 普通节点加入网络
         */
        public AddNetworkNormalnodeResponse AddNetworkNormalnode(AddNetworkNormalnodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddNetworkNormalnodeEx(request, headers, runtime);
        }

        /**
         * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
         * Summary: 普通节点加入网络
         */
        public async Task<AddNetworkNormalnodeResponse> AddNetworkNormalnodeAsync(AddNetworkNormalnodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddNetworkNormalnodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
         * Summary: 普通节点加入网络
         */
        public AddNetworkNormalnodeResponse AddNetworkNormalnodeEx(AddNetworkNormalnodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddNetworkNormalnodeResponse>(DoRequest("1.0", "antchain.fairopennet.network.normalnode.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
         * Summary: 普通节点加入网络
         */
        public async Task<AddNetworkNormalnodeResponse> AddNetworkNormalnodeExAsync(AddNetworkNormalnodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddNetworkNormalnodeResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.network.normalnode.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有cube节点信息
         * Summary: 获取所有cube节点信息
         */
        public GetAllcubenodeInfoResponse GetAllcubenodeInfo(GetAllcubenodeInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAllcubenodeInfoEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有cube节点信息
         * Summary: 获取所有cube节点信息
         */
        public async Task<GetAllcubenodeInfoResponse> GetAllcubenodeInfoAsync(GetAllcubenodeInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAllcubenodeInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有cube节点信息
         * Summary: 获取所有cube节点信息
         */
        public GetAllcubenodeInfoResponse GetAllcubenodeInfoEx(GetAllcubenodeInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAllcubenodeInfoResponse>(DoRequest("1.0", "antchain.fairopennet.allcubenode.info.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有cube节点信息
         * Summary: 获取所有cube节点信息
         */
        public async Task<GetAllcubenodeInfoResponse> GetAllcubenodeInfoExAsync(GetAllcubenodeInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAllcubenodeInfoResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.allcubenode.info.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加协作参与方到一个区块链协作网络
         * Summary: 添加协作参与方到一个区块链协作网络
         */
        public ApplyPartyNetworkResponse ApplyPartyNetwork(ApplyPartyNetworkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyPartyNetworkEx(request, headers, runtime);
        }

        /**
         * Description: 添加协作参与方到一个区块链协作网络
         * Summary: 添加协作参与方到一个区块链协作网络
         */
        public async Task<ApplyPartyNetworkResponse> ApplyPartyNetworkAsync(ApplyPartyNetworkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyPartyNetworkExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加协作参与方到一个区块链协作网络
         * Summary: 添加协作参与方到一个区块链协作网络
         */
        public ApplyPartyNetworkResponse ApplyPartyNetworkEx(ApplyPartyNetworkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPartyNetworkResponse>(DoRequest("1.0", "antchain.fairopennet.party.network.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加协作参与方到一个区块链协作网络
         * Summary: 添加协作参与方到一个区块链协作网络
         */
        public async Task<ApplyPartyNetworkResponse> ApplyPartyNetworkExAsync(ApplyPartyNetworkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPartyNetworkResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.party.network.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个工作流
         * Summary: 创建一个工作流
         */
        public CreateFlowResponse CreateFlow(CreateFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFlowEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个工作流
         * Summary: 创建一个工作流
         */
        public async Task<CreateFlowResponse> CreateFlowAsync(CreateFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个工作流
         * Summary: 创建一个工作流
         */
        public CreateFlowResponse CreateFlowEx(CreateFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowResponse>(DoRequest("1.0", "antchain.fairopennet.flow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个工作流
         * Summary: 创建一个工作流
         */
        public async Task<CreateFlowResponse> CreateFlowExAsync(CreateFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.flow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运行工作流实例，提供动态配置
         * Summary: 运行工作流实例，提供动态配置
         */
        public RunFlowInstanceResponse RunFlowInstance(RunFlowInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunFlowInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 运行工作流实例，提供动态配置
         * Summary: 运行工作流实例，提供动态配置
         */
        public async Task<RunFlowInstanceResponse> RunFlowInstanceAsync(RunFlowInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunFlowInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 运行工作流实例，提供动态配置
         * Summary: 运行工作流实例，提供动态配置
         */
        public RunFlowInstanceResponse RunFlowInstanceEx(RunFlowInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunFlowInstanceResponse>(DoRequest("1.0", "antchain.fairopennet.flow.instance.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运行工作流实例，提供动态配置
         * Summary: 运行工作流实例，提供动态配置
         */
        public async Task<RunFlowInstanceResponse> RunFlowInstanceExAsync(RunFlowInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunFlowInstanceResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.flow.instance.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止运行中的工作流实例
         * Summary: 停止运行中的工作流实例
         */
        public StopFlowinstanceResponse StopFlowinstance(StopFlowinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopFlowinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 停止运行中的工作流实例
         * Summary: 停止运行中的工作流实例
         */
        public async Task<StopFlowinstanceResponse> StopFlowinstanceAsync(StopFlowinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopFlowinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 停止运行中的工作流实例
         * Summary: 停止运行中的工作流实例
         */
        public StopFlowinstanceResponse StopFlowinstanceEx(StopFlowinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopFlowinstanceResponse>(DoRequest("1.0", "antchain.fairopennet.flowinstance.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止运行中的工作流实例
         * Summary: 停止运行中的工作流实例
         */
        public async Task<StopFlowinstanceResponse> StopFlowinstanceExAsync(StopFlowinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopFlowinstanceResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.flowinstance.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询工作流实例状态
         * Summary: 查询工作流实例状态
         */
        public QueryFlowinstanceStatusResponse QueryFlowinstanceStatus(QueryFlowinstanceStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowinstanceStatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询工作流实例状态
         * Summary: 查询工作流实例状态
         */
        public async Task<QueryFlowinstanceStatusResponse> QueryFlowinstanceStatusAsync(QueryFlowinstanceStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowinstanceStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询工作流实例状态
         * Summary: 查询工作流实例状态
         */
        public QueryFlowinstanceStatusResponse QueryFlowinstanceStatusEx(QueryFlowinstanceStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowinstanceStatusResponse>(DoRequest("1.0", "antchain.fairopennet.flowinstance.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询工作流实例状态
         * Summary: 查询工作流实例状态
         */
        public async Task<QueryFlowinstanceStatusResponse> QueryFlowinstanceStatusExAsync(QueryFlowinstanceStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowinstanceStatusResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.flowinstance.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传文件
         * Summary: 上传文件
         */
        public UploadFileResponse UploadFile(UploadFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadFileEx(request, headers, runtime);
        }

        /**
         * Description: 上传文件
         * Summary: 上传文件
         */
        public async Task<UploadFileResponse> UploadFileAsync(UploadFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传文件
         * Summary: 上传文件
         */
        public UploadFileResponse UploadFileEx(UploadFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.fairopennet.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadFileResponse uploadFileResponse = new UploadFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadFileResponse>(DoRequest("1.0", "antchain.fairopennet.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传文件
         * Summary: 上传文件
         */
        public async Task<UploadFileResponse> UploadFileExAsync(UploadFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.fairopennet.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadFileResponse uploadFileResponse = new UploadFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadFileResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载文件
         * Summary: 下载文件
         */
        public DownloadFileResponse DownloadFile(DownloadFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadFileEx(request, headers, runtime);
        }

        /**
         * Description: 下载文件
         * Summary: 下载文件
         */
        public async Task<DownloadFileResponse> DownloadFileAsync(DownloadFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 下载文件
         * Summary: 下载文件
         */
        public DownloadFileResponse DownloadFileEx(DownloadFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.fairopennet.file.download",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    DownloadFileResponse downloadFileResponse = new DownloadFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return downloadFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadFileResponse>(DoRequest("1.0", "antchain.fairopennet.file.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载文件
         * Summary: 下载文件
         */
        public async Task<DownloadFileResponse> DownloadFileExAsync(DownloadFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.fairopennet.file.download",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    DownloadFileResponse downloadFileResponse = new DownloadFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return downloadFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadFileResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.file.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可用的fair节点nodeId
         * Summary: 查询fair node列表
         */
        public GetNodeListResponse GetNodeList(GetNodeListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetNodeListEx(request, headers, runtime);
        }

        /**
         * Description: 查询可用的fair节点nodeId
         * Summary: 查询fair node列表
         */
        public async Task<GetNodeListResponse> GetNodeListAsync(GetNodeListRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetNodeListExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可用的fair节点nodeId
         * Summary: 查询fair node列表
         */
        public GetNodeListResponse GetNodeListEx(GetNodeListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNodeListResponse>(DoRequest("1.0", "antchain.fairopennet.node.list.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可用的fair节点nodeId
         * Summary: 查询fair node列表
         */
        public async Task<GetNodeListResponse> GetNodeListExAsync(GetNodeListRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetNodeListResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.node.list.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册新用户
         * Summary: 注册新用户
         */
        public RegisterPartyResponse RegisterParty(RegisterPartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterPartyEx(request, headers, runtime);
        }

        /**
         * Description: 注册新用户
         * Summary: 注册新用户
         */
        public async Task<RegisterPartyResponse> RegisterPartyAsync(RegisterPartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterPartyExAsync(request, headers, runtime);
        }

        /**
         * Description: 注册新用户
         * Summary: 注册新用户
         */
        public RegisterPartyResponse RegisterPartyEx(RegisterPartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterPartyResponse>(DoRequest("1.0", "antchain.fairopennet.party.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册新用户
         * Summary: 注册新用户
         */
        public async Task<RegisterPartyResponse> RegisterPartyExAsync(RegisterPartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterPartyResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.party.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户是否注册成功
         * Summary: 查询用户注册进度
         */
        public QueryPartyRegisterstatusResponse QueryPartyRegisterstatus(QueryPartyRegisterstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPartyRegisterstatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户是否注册成功
         * Summary: 查询用户注册进度
         */
        public async Task<QueryPartyRegisterstatusResponse> QueryPartyRegisterstatusAsync(QueryPartyRegisterstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPartyRegisterstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户是否注册成功
         * Summary: 查询用户注册进度
         */
        public QueryPartyRegisterstatusResponse QueryPartyRegisterstatusEx(QueryPartyRegisterstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPartyRegisterstatusResponse>(DoRequest("1.0", "antchain.fairopennet.party.registerstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户是否注册成功
         * Summary: 查询用户注册进度
         */
        public async Task<QueryPartyRegisterstatusResponse> QueryPartyRegisterstatusExAsync(QueryPartyRegisterstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPartyRegisterstatusResponse>(await DoRequestAsync("1.0", "antchain.fairopennet.party.registerstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
