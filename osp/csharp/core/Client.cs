// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Osp.Models;

namespace AntChain.SDK.Osp
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
                        {"sdk_version", "1.2.0"},
                        {"_prod_code", "osp"},
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
                        {"sdk_version", "1.2.0"},
                        {"_prod_code", "osp"},
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
         * Description: 查询实例信息
         * Summary: 查询实例信息
         */
        public QueryInstancesResponse QueryInstances(QueryInstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInstancesEx(request, headers, runtime);
        }

        /**
         * Description: 查询实例信息
         * Summary: 查询实例信息
         */
        public async Task<QueryInstancesResponse> QueryInstancesAsync(QueryInstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInstancesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询实例信息
         * Summary: 查询实例信息
         */
        public QueryInstancesResponse QueryInstancesEx(QueryInstancesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstancesResponse>(DoRequest("2.0", "sofa.osp.instances.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实例信息
         * Summary: 查询实例信息
         */
        public async Task<QueryInstancesResponse> QueryInstancesExAsync(QueryInstancesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstancesResponse>(await DoRequestAsync("2.0", "sofa.osp.instances.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品信息
         * Summary: 查询产品信息
         */
        public QueryProductsResponse QueryProducts(QueryProductsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryProductsEx(request, headers, runtime);
        }

        /**
         * Description: 查询产品信息
         * Summary: 查询产品信息
         */
        public async Task<QueryProductsResponse> QueryProductsAsync(QueryProductsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryProductsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询产品信息
         * Summary: 查询产品信息
         */
        public QueryProductsResponse QueryProductsEx(QueryProductsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProductsResponse>(DoRequest("2.0", "sofa.osp.products.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品信息
         * Summary: 查询产品信息
         */
        public async Task<QueryProductsResponse> QueryProductsExAsync(QueryProductsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProductsResponse>(await DoRequestAsync("2.0", "sofa.osp.products.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取共享中间件参数信息
         * Summary: 获取共享中间件参数信息
         */
        public QueryEndpointsResponse QueryEndpoints(QueryEndpointsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEndpointsEx(request, headers, runtime);
        }

        /**
         * Description: 获取共享中间件参数信息
         * Summary: 获取共享中间件参数信息
         */
        public async Task<QueryEndpointsResponse> QueryEndpointsAsync(QueryEndpointsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEndpointsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取共享中间件参数信息
         * Summary: 获取共享中间件参数信息
         */
        public QueryEndpointsResponse QueryEndpointsEx(QueryEndpointsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEndpointsResponse>(DoRequest("2.0", "sofa.osp.endpoints.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取共享中间件参数信息
         * Summary: 获取共享中间件参数信息
         */
        public async Task<QueryEndpointsResponse> QueryEndpointsExAsync(QueryEndpointsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEndpointsResponse>(await DoRequestAsync("2.0", "sofa.osp.endpoints.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对 domain 进行扩容操作
         * Summary: 扩容接口
         */
        public ScaleoutClustersResponse ScaleoutClusters(ScaleoutClustersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ScaleoutClustersEx(request, headers, runtime);
        }

        /**
         * Description: 针对 domain 进行扩容操作
         * Summary: 扩容接口
         */
        public async Task<ScaleoutClustersResponse> ScaleoutClustersAsync(ScaleoutClustersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ScaleoutClustersExAsync(request, headers, runtime);
        }

        /**
         * Description: 针对 domain 进行扩容操作
         * Summary: 扩容接口
         */
        public ScaleoutClustersResponse ScaleoutClustersEx(ScaleoutClustersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleoutClustersResponse>(DoRequest("1.0", "sofa.osp.clusters.scaleout", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对 domain 进行扩容操作
         * Summary: 扩容接口
         */
        public async Task<ScaleoutClustersResponse> ScaleoutClustersExAsync(ScaleoutClustersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleoutClustersResponse>(await DoRequestAsync("1.0", "sofa.osp.clusters.scaleout", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对 domain 进行缩容
         * Summary: 缩容接口
         */
        public ScaleinClusterResponse ScaleinCluster(ScaleinClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ScaleinClusterEx(request, headers, runtime);
        }

        /**
         * Description: 针对 domain 进行缩容
         * Summary: 缩容接口
         */
        public async Task<ScaleinClusterResponse> ScaleinClusterAsync(ScaleinClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ScaleinClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 针对 domain 进行缩容
         * Summary: 缩容接口
         */
        public ScaleinClusterResponse ScaleinClusterEx(ScaleinClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleinClusterResponse>(DoRequest("1.0", "sofa.osp.cluster.scalein", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对 domain 进行缩容
         * Summary: 缩容接口
         */
        public async Task<ScaleinClusterResponse> ScaleinClusterExAsync(ScaleinClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleinClusterResponse>(await DoRequestAsync("1.0", "sofa.osp.cluster.scalein", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置节点是否生效（上下线）
         * Summary: 设置节点是否生效（上下线）
         */
        public SetClustersResponse SetClusters(SetClustersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetClustersEx(request, headers, runtime);
        }

        /**
         * Description: 设置节点是否生效（上下线）
         * Summary: 设置节点是否生效（上下线）
         */
        public async Task<SetClustersResponse> SetClustersAsync(SetClustersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetClustersExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置节点是否生效（上下线）
         * Summary: 设置节点是否生效（上下线）
         */
        public SetClustersResponse SetClustersEx(SetClustersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetClustersResponse>(DoRequest("1.0", "sofa.osp.clusters.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置节点是否生效（上下线）
         * Summary: 设置节点是否生效（上下线）
         */
        public async Task<SetClustersResponse> SetClustersExAsync(SetClustersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetClustersResponse>(await DoRequestAsync("1.0", "sofa.osp.clusters.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据instanceId获取对应的tenant和workspace的信息
         * Summary: 获取instance详情
         */
        public GetInstancesResponse GetInstances(GetInstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInstancesEx(request, headers, runtime);
        }

        /**
         * Description: 根据instanceId获取对应的tenant和workspace的信息
         * Summary: 获取instance详情
         */
        public async Task<GetInstancesResponse> GetInstancesAsync(GetInstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInstancesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据instanceId获取对应的tenant和workspace的信息
         * Summary: 获取instance详情
         */
        public GetInstancesResponse GetInstancesEx(GetInstancesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInstancesResponse>(DoRequest("1.0", "sofa.osp.instances.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据instanceId获取对应的tenant和workspace的信息
         * Summary: 获取instance详情
         */
        public async Task<GetInstancesResponse> GetInstancesExAsync(GetInstancesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInstancesResponse>(await DoRequestAsync("1.0", "sofa.osp.instances.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
         * Summary: 创建AK/SK的接口
         */
        public CreateAccesskeyResponse CreateAccesskey(CreateAccesskeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAccesskeyEx(request, headers, runtime);
        }

        /**
         * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
         * Summary: 创建AK/SK的接口
         */
        public async Task<CreateAccesskeyResponse> CreateAccesskeyAsync(CreateAccesskeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAccesskeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
         * Summary: 创建AK/SK的接口
         */
        public CreateAccesskeyResponse CreateAccesskeyEx(CreateAccesskeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAccesskeyResponse>(DoRequest("1.0", "sofa.osp.accesskey.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
         * Summary: 创建AK/SK的接口
         */
        public async Task<CreateAccesskeyResponse> CreateAccesskeyExAsync(CreateAccesskeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAccesskeyResponse>(await DoRequestAsync("1.0", "sofa.osp.accesskey.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据 instanceId 和 name获取AK/SK的接口
         * Summary: 获取AK/SK的接口
         */
        public GetAccesskeyResponse GetAccesskey(GetAccesskeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAccesskeyEx(request, headers, runtime);
        }

        /**
         * Description: 根据 instanceId 和 name获取AK/SK的接口
         * Summary: 获取AK/SK的接口
         */
        public async Task<GetAccesskeyResponse> GetAccesskeyAsync(GetAccesskeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAccesskeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据 instanceId 和 name获取AK/SK的接口
         * Summary: 获取AK/SK的接口
         */
        public GetAccesskeyResponse GetAccesskeyEx(GetAccesskeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAccesskeyResponse>(DoRequest("1.0", "sofa.osp.accesskey.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据 instanceId 和 name获取AK/SK的接口
         * Summary: 获取AK/SK的接口
         */
        public async Task<GetAccesskeyResponse> GetAccesskeyExAsync(GetAccesskeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAccesskeyResponse>(await DoRequestAsync("1.0", "sofa.osp.accesskey.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 中间件元数据获取
         * Summary: 中间件元数据获取
         */
        public GetMiddlewareMetaResponse GetMiddlewareMeta(GetMiddlewareMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMiddlewareMetaEx(request, headers, runtime);
        }

        /**
         * Description: 中间件元数据获取
         * Summary: 中间件元数据获取
         */
        public async Task<GetMiddlewareMetaResponse> GetMiddlewareMetaAsync(GetMiddlewareMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMiddlewareMetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 中间件元数据获取
         * Summary: 中间件元数据获取
         */
        public GetMiddlewareMetaResponse GetMiddlewareMetaEx(GetMiddlewareMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareMetaResponse>(DoRequest("1.0", "sofa.osp.middleware.meta.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 中间件元数据获取
         * Summary: 中间件元数据获取
         */
        public async Task<GetMiddlewareMetaResponse> GetMiddlewareMetaExAsync(GetMiddlewareMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareMetaResponse>(await DoRequestAsync("1.0", "sofa.osp.middleware.meta.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据workspaceGroup查询instanceId
         * Summary: 查询instanceId
         */
        public GetWorkspacegroupInstanceResponse GetWorkspacegroupInstance(GetWorkspacegroupInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWorkspacegroupInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 根据workspaceGroup查询instanceId
         * Summary: 查询instanceId
         */
        public async Task<GetWorkspacegroupInstanceResponse> GetWorkspacegroupInstanceAsync(GetWorkspacegroupInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWorkspacegroupInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据workspaceGroup查询instanceId
         * Summary: 查询instanceId
         */
        public GetWorkspacegroupInstanceResponse GetWorkspacegroupInstanceEx(GetWorkspacegroupInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspacegroupInstanceResponse>(DoRequest("1.0", "sofa.osp.workspacegroup.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据workspaceGroup查询instanceId
         * Summary: 查询instanceId
         */
        public async Task<GetWorkspacegroupInstanceResponse> GetWorkspacegroupInstanceExAsync(GetWorkspacegroupInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspacegroupInstanceResponse>(await DoRequestAsync("1.0", "sofa.osp.workspacegroup.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询中间件集群模式
         * Summary: 查询中间件集群模式
         */
        public QueryMiddlewareClustermodeResponse QueryMiddlewareClustermode(QueryMiddlewareClustermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMiddlewareClustermodeEx(request, headers, runtime);
        }

        /**
         * Description: 查询中间件集群模式
         * Summary: 查询中间件集群模式
         */
        public async Task<QueryMiddlewareClustermodeResponse> QueryMiddlewareClustermodeAsync(QueryMiddlewareClustermodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMiddlewareClustermodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询中间件集群模式
         * Summary: 查询中间件集群模式
         */
        public QueryMiddlewareClustermodeResponse QueryMiddlewareClustermodeEx(QueryMiddlewareClustermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiddlewareClustermodeResponse>(DoRequest("1.0", "sofa.osp.middleware.clustermode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询中间件集群模式
         * Summary: 查询中间件集群模式
         */
        public async Task<QueryMiddlewareClustermodeResponse> QueryMiddlewareClustermodeExAsync(QueryMiddlewareClustermodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiddlewareClustermodeResponse>(await DoRequestAsync("1.0", "sofa.osp.middleware.clustermode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询中间件集群列表
         * Summary: 查询中间件集群列表
         */
        public QueryMiddlewareClustersResponse QueryMiddlewareClusters(QueryMiddlewareClustersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMiddlewareClustersEx(request, headers, runtime);
        }

        /**
         * Description: 查询中间件集群列表
         * Summary: 查询中间件集群列表
         */
        public async Task<QueryMiddlewareClustersResponse> QueryMiddlewareClustersAsync(QueryMiddlewareClustersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMiddlewareClustersExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询中间件集群列表
         * Summary: 查询中间件集群列表
         */
        public QueryMiddlewareClustersResponse QueryMiddlewareClustersEx(QueryMiddlewareClustersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiddlewareClustersResponse>(DoRequest("1.0", "sofa.osp.middleware.clusters.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询中间件集群列表
         * Summary: 查询中间件集群列表
         */
        public async Task<QueryMiddlewareClustersResponse> QueryMiddlewareClustersExAsync(QueryMiddlewareClustersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMiddlewareClustersResponse>(await DoRequestAsync("1.0", "sofa.osp.middleware.clusters.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定中间件列表
         * Summary: 绑定中间件列表
         */
        public BindMiddlewareInstanceResponse BindMiddlewareInstance(BindMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindMiddlewareInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 绑定中间件列表
         * Summary: 绑定中间件列表
         */
        public async Task<BindMiddlewareInstanceResponse> BindMiddlewareInstanceAsync(BindMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindMiddlewareInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 绑定中间件列表
         * Summary: 绑定中间件列表
         */
        public BindMiddlewareInstanceResponse BindMiddlewareInstanceEx(BindMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindMiddlewareInstanceResponse>(DoRequest("1.0", "sofa.osp.middleware.instance.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定中间件列表
         * Summary: 绑定中间件列表
         */
        public async Task<BindMiddlewareInstanceResponse> BindMiddlewareInstanceExAsync(BindMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindMiddlewareInstanceResponse>(await DoRequestAsync("1.0", "sofa.osp.middleware.instance.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: paas 解绑中间件
         * Summary: 解绑中间件实例
         */
        public UnbindMiddlewareInstanceResponse UnbindMiddlewareInstance(UnbindMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindMiddlewareInstanceEx(request, headers, runtime);
        }

        /**
         * Description: paas 解绑中间件
         * Summary: 解绑中间件实例
         */
        public async Task<UnbindMiddlewareInstanceResponse> UnbindMiddlewareInstanceAsync(UnbindMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindMiddlewareInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: paas 解绑中间件
         * Summary: 解绑中间件实例
         */
        public UnbindMiddlewareInstanceResponse UnbindMiddlewareInstanceEx(UnbindMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindMiddlewareInstanceResponse>(DoRequest("1.0", "sofa.osp.middleware.instance.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: paas 解绑中间件
         * Summary: 解绑中间件实例
         */
        public async Task<UnbindMiddlewareInstanceResponse> UnbindMiddlewareInstanceExAsync(UnbindMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindMiddlewareInstanceResponse>(await DoRequestAsync("1.0", "sofa.osp.middleware.instance.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: licence 实时计量数据推送
         * Summary: licence 实时计量数据推送
         */
        public PushLicenceMeterdataResponse PushLicenceMeterdata(PushLicenceMeterdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushLicenceMeterdataEx(request, headers, runtime);
        }

        /**
         * Description: licence 实时计量数据推送
         * Summary: licence 实时计量数据推送
         */
        public async Task<PushLicenceMeterdataResponse> PushLicenceMeterdataAsync(PushLicenceMeterdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushLicenceMeterdataExAsync(request, headers, runtime);
        }

        /**
         * Description: licence 实时计量数据推送
         * Summary: licence 实时计量数据推送
         */
        public PushLicenceMeterdataResponse PushLicenceMeterdataEx(PushLicenceMeterdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushLicenceMeterdataResponse>(DoRequest("1.0", "sofa.osp.licence.meterdata.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: licence 实时计量数据推送
         * Summary: licence 实时计量数据推送
         */
        public async Task<PushLicenceMeterdataResponse> PushLicenceMeterdataExAsync(PushLicenceMeterdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushLicenceMeterdataResponse>(await DoRequestAsync("1.0", "sofa.osp.licence.meterdata.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询 license 的计量数据
         * Summary: 分页查询 license 的计量数据
         */
        public PagequeryLicenceMeterdataResponse PagequeryLicenceMeterdata(PagequeryLicenceMeterdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryLicenceMeterdataEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询 license 的计量数据
         * Summary: 分页查询 license 的计量数据
         */
        public async Task<PagequeryLicenceMeterdataResponse> PagequeryLicenceMeterdataAsync(PagequeryLicenceMeterdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryLicenceMeterdataExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询 license 的计量数据
         * Summary: 分页查询 license 的计量数据
         */
        public PagequeryLicenceMeterdataResponse PagequeryLicenceMeterdataEx(PagequeryLicenceMeterdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryLicenceMeterdataResponse>(DoRequest("1.0", "sofa.osp.licence.meterdata.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询 license 的计量数据
         * Summary: 分页查询 license 的计量数据
         */
        public async Task<PagequeryLicenceMeterdataResponse> PagequeryLicenceMeterdataExAsync(PagequeryLicenceMeterdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryLicenceMeterdataResponse>(await DoRequestAsync("1.0", "sofa.osp.licence.meterdata.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
