// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.ENERGENT.Models;

namespace AntChain.SDK.ENERGENT
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
                        {"sdk_version", "1.0.4"},
                        {"_prod_code", "ENERGENT"},
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
                        {"sdk_version", "1.0.4"},
                        {"_prod_code", "ENERGENT"},
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
        /// <para>Description: 知识库rag 检索
        /// Summary: 知识库rag 检索</para>
        /// </description>
        public QueryKnowledgeRagResponse QueryKnowledgeRag(QueryKnowledgeRagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryKnowledgeRagEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库rag 检索
        /// Summary: 知识库rag 检索</para>
        /// </description>
        public async Task<QueryKnowledgeRagResponse> QueryKnowledgeRagAsync(QueryKnowledgeRagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryKnowledgeRagExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库rag 检索
        /// Summary: 知识库rag 检索</para>
        /// </description>
        public QueryKnowledgeRagResponse QueryKnowledgeRagEx(QueryKnowledgeRagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKnowledgeRagResponse>(DoRequest("1.0", "antdigital.energent.knowledge.rag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库rag 检索
        /// Summary: 知识库rag 检索</para>
        /// </description>
        public async Task<QueryKnowledgeRagResponse> QueryKnowledgeRagExAsync(QueryKnowledgeRagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKnowledgeRagResponse>(await DoRequestAsync("1.0", "antdigital.energent.knowledge.rag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: rag检索
        /// Summary: rag检索</para>
        /// </description>
        public QueryEnergyknowledgeRagResponse QueryEnergyknowledgeRag(QueryEnergyknowledgeRagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnergyknowledgeRagEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: rag检索
        /// Summary: rag检索</para>
        /// </description>
        public async Task<QueryEnergyknowledgeRagResponse> QueryEnergyknowledgeRagAsync(QueryEnergyknowledgeRagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnergyknowledgeRagExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: rag检索
        /// Summary: rag检索</para>
        /// </description>
        public QueryEnergyknowledgeRagResponse QueryEnergyknowledgeRagEx(QueryEnergyknowledgeRagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnergyknowledgeRagResponse>(DoRequest("1.0", "antdigital.energent.energyknowledge.rag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: rag检索
        /// Summary: rag检索</para>
        /// </description>
        public async Task<QueryEnergyknowledgeRagResponse> QueryEnergyknowledgeRagExAsync(QueryEnergyknowledgeRagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnergyknowledgeRagResponse>(await DoRequestAsync("1.0", "antdigital.energent.energyknowledge.rag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱rag召回
        /// Summary: 知识图谱rag召回</para>
        /// </description>
        public QueryEnergyknowledgeRagrecallResponse QueryEnergyknowledgeRagrecall(QueryEnergyknowledgeRagrecallRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnergyknowledgeRagrecallEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱rag召回
        /// Summary: 知识图谱rag召回</para>
        /// </description>
        public async Task<QueryEnergyknowledgeRagrecallResponse> QueryEnergyknowledgeRagrecallAsync(QueryEnergyknowledgeRagrecallRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnergyknowledgeRagrecallExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱rag召回
        /// Summary: 知识图谱rag召回</para>
        /// </description>
        public QueryEnergyknowledgeRagrecallResponse QueryEnergyknowledgeRagrecallEx(QueryEnergyknowledgeRagrecallRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnergyknowledgeRagrecallResponse>(DoRequest("1.0", "antdigital.energent.energyknowledge.ragrecall.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱rag召回
        /// Summary: 知识图谱rag召回</para>
        /// </description>
        public async Task<QueryEnergyknowledgeRagrecallResponse> QueryEnergyknowledgeRagrecallExAsync(QueryEnergyknowledgeRagrecallRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnergyknowledgeRagrecallResponse>(await DoRequestAsync("1.0", "antdigital.energent.energyknowledge.ragrecall.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库列表
        /// Summary: 知识库列表</para>
        /// </description>
        public QueryKmKnowledgelistResponse QueryKmKnowledgelist(QueryKmKnowledgelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryKmKnowledgelistEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库列表
        /// Summary: 知识库列表</para>
        /// </description>
        public async Task<QueryKmKnowledgelistResponse> QueryKmKnowledgelistAsync(QueryKmKnowledgelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryKmKnowledgelistExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库列表
        /// Summary: 知识库列表</para>
        /// </description>
        public QueryKmKnowledgelistResponse QueryKmKnowledgelistEx(QueryKmKnowledgelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKmKnowledgelistResponse>(DoRequest("1.0", "antdigital.energent.km.knowledgelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库列表
        /// Summary: 知识库列表</para>
        /// </description>
        public async Task<QueryKmKnowledgelistResponse> QueryKmKnowledgelistExAsync(QueryKmKnowledgelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKmKnowledgelistResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.knowledgelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 删除目录树节点(级联子节点与挂载)
        /// Summary: 删除目录树节点(级联子节点与挂载)</para>
        /// </description>
        public DeleteKmNodeResponse DeleteKmNode(DeleteKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteKmNodeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 删除目录树节点(级联子节点与挂载)
        /// Summary: 删除目录树节点(级联子节点与挂载)</para>
        /// </description>
        public async Task<DeleteKmNodeResponse> DeleteKmNodeAsync(DeleteKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteKmNodeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 删除目录树节点(级联子节点与挂载)
        /// Summary: 删除目录树节点(级联子节点与挂载)</para>
        /// </description>
        public DeleteKmNodeResponse DeleteKmNodeEx(DeleteKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteKmNodeResponse>(DoRequest("1.0", "antdigital.energent.km.node.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 删除目录树节点(级联子节点与挂载)
        /// Summary: 删除目录树节点(级联子节点与挂载)</para>
        /// </description>
        public async Task<DeleteKmNodeResponse> DeleteKmNodeExAsync(DeleteKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteKmNodeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.node.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        /// Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)</para>
        /// </description>
        public DetailKmTreeResponse DetailKmTree(DetailKmTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailKmTreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        /// Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)</para>
        /// </description>
        public async Task<DetailKmTreeResponse> DetailKmTreeAsync(DetailKmTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailKmTreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        /// Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)</para>
        /// </description>
        public DetailKmTreeResponse DetailKmTreeEx(DetailKmTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailKmTreeResponse>(DoRequest("1.0", "antdigital.energent.km.tree.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
        /// Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)</para>
        /// </description>
        public async Task<DetailKmTreeResponse> DetailKmTreeExAsync(DetailKmTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailKmTreeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.tree.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 按OSS地址批量入库--
        /// Summary: 按OSS地址批量入库--</para>
        /// </description>
        public BatchimportKmDocumentResponse BatchimportKmDocument(BatchimportKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchimportKmDocumentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 按OSS地址批量入库--
        /// Summary: 按OSS地址批量入库--</para>
        /// </description>
        public async Task<BatchimportKmDocumentResponse> BatchimportKmDocumentAsync(BatchimportKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchimportKmDocumentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 按OSS地址批量入库--
        /// Summary: 按OSS地址批量入库--</para>
        /// </description>
        public BatchimportKmDocumentResponse BatchimportKmDocumentEx(BatchimportKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchimportKmDocumentResponse>(DoRequest("1.0", "antdigital.energent.km.document.batchimport", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 按OSS地址批量入库--
        /// Summary: 按OSS地址批量入库--</para>
        /// </description>
        public async Task<BatchimportKmDocumentResponse> BatchimportKmDocumentExAsync(BatchimportKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchimportKmDocumentResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.document.batchimport", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建知识库
        /// Summary: 创建知识库</para>
        /// </description>
        public CreateKmTreeResponse CreateKmTree(CreateKmTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateKmTreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建知识库
        /// Summary: 创建知识库</para>
        /// </description>
        public async Task<CreateKmTreeResponse> CreateKmTreeAsync(CreateKmTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateKmTreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建知识库
        /// Summary: 创建知识库</para>
        /// </description>
        public CreateKmTreeResponse CreateKmTreeEx(CreateKmTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKmTreeResponse>(DoRequest("1.0", "antdigital.energent.km.tree.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建知识库
        /// Summary: 创建知识库</para>
        /// </description>
        public async Task<CreateKmTreeResponse> CreateKmTreeExAsync(CreateKmTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKmTreeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.tree.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 编辑目录树节点槽位信息
        /// Summary: 编辑目录树节点槽位信息</para>
        /// </description>
        public UpdateKmNodeResponse UpdateKmNode(UpdateKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateKmNodeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 编辑目录树节点槽位信息
        /// Summary: 编辑目录树节点槽位信息</para>
        /// </description>
        public async Task<UpdateKmNodeResponse> UpdateKmNodeAsync(UpdateKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateKmNodeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 编辑目录树节点槽位信息
        /// Summary: 编辑目录树节点槽位信息</para>
        /// </description>
        public UpdateKmNodeResponse UpdateKmNodeEx(UpdateKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateKmNodeResponse>(DoRequest("1.0", "antdigital.energent.km.node.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 编辑目录树节点槽位信息
        /// Summary: 编辑目录树节点槽位信息</para>
        /// </description>
        public async Task<UpdateKmNodeResponse> UpdateKmNodeExAsync(UpdateKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateKmNodeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.node.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新知识库基础信息
        /// Summary: 更新知识库基础信息</para>
        /// </description>
        public UpdateKmTreeResponse UpdateKmTree(UpdateKmTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateKmTreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新知识库基础信息
        /// Summary: 更新知识库基础信息</para>
        /// </description>
        public async Task<UpdateKmTreeResponse> UpdateKmTreeAsync(UpdateKmTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateKmTreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新知识库基础信息
        /// Summary: 更新知识库基础信息</para>
        /// </description>
        public UpdateKmTreeResponse UpdateKmTreeEx(UpdateKmTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateKmTreeResponse>(DoRequest("1.0", "antdigital.energent.km.tree.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新知识库基础信息
        /// Summary: 更新知识库基础信息</para>
        /// </description>
        public async Task<UpdateKmTreeResponse> UpdateKmTreeExAsync(UpdateKmTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateKmTreeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.tree.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库图谱关系模板Schema
        /// Summary: 查询知识库图谱关系模板Schema</para>
        /// </description>
        public SchemaKmTreeResponse SchemaKmTree(SchemaKmTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SchemaKmTreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库图谱关系模板Schema
        /// Summary: 查询知识库图谱关系模板Schema</para>
        /// </description>
        public async Task<SchemaKmTreeResponse> SchemaKmTreeAsync(SchemaKmTreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SchemaKmTreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库图谱关系模板Schema
        /// Summary: 查询知识库图谱关系模板Schema</para>
        /// </description>
        public SchemaKmTreeResponse SchemaKmTreeEx(SchemaKmTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SchemaKmTreeResponse>(DoRequest("1.0", "antdigital.energent.km.tree.schema", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库图谱关系模板Schema
        /// Summary: 查询知识库图谱关系模板Schema</para>
        /// </description>
        public async Task<SchemaKmTreeResponse> SchemaKmTreeExAsync(SchemaKmTreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SchemaKmTreeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.tree.schema", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 目录树中创建节点(挂父节点槽位)
        /// Summary: 目录树中创建节点(挂父节点槽位)</para>
        /// </description>
        public CreateKmNodeResponse CreateKmNode(CreateKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateKmNodeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 目录树中创建节点(挂父节点槽位)
        /// Summary: 目录树中创建节点(挂父节点槽位)</para>
        /// </description>
        public async Task<CreateKmNodeResponse> CreateKmNodeAsync(CreateKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateKmNodeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 目录树中创建节点(挂父节点槽位)
        /// Summary: 目录树中创建节点(挂父节点槽位)</para>
        /// </description>
        public CreateKmNodeResponse CreateKmNodeEx(CreateKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKmNodeResponse>(DoRequest("1.0", "antdigital.energent.km.node.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 目录树中创建节点(挂父节点槽位)
        /// Summary: 目录树中创建节点(挂父节点槽位)</para>
        /// </description>
        public async Task<CreateKmNodeResponse> CreateKmNodeExAsync(CreateKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKmNodeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.node.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询节点下挂载的文档列表(含是否处理中标记)
        /// Summary: 查询节点下挂载的文档列表(含是否处理中标记)</para>
        /// </description>
        public ListKmDocumentResponse ListKmDocument(ListKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListKmDocumentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询节点下挂载的文档列表(含是否处理中标记)
        /// Summary: 查询节点下挂载的文档列表(含是否处理中标记)</para>
        /// </description>
        public async Task<ListKmDocumentResponse> ListKmDocumentAsync(ListKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListKmDocumentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询节点下挂载的文档列表(含是否处理中标记)
        /// Summary: 查询节点下挂载的文档列表(含是否处理中标记)</para>
        /// </description>
        public ListKmDocumentResponse ListKmDocumentEx(ListKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListKmDocumentResponse>(DoRequest("1.0", "antdigital.energent.km.document.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询节点下挂载的文档列表(含是否处理中标记)
        /// Summary: 查询节点下挂载的文档列表(含是否处理中标记)</para>
        /// </description>
        public async Task<ListKmDocumentResponse> ListKmDocumentExAsync(ListKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListKmDocumentResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.document.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 解除文档与节点的挂载关系(不删除文档记录)
        /// Summary: 解除文档与节点的挂载关系(不删除文档记录)</para>
        /// </description>
        public UnmountKmDocumentResponse UnmountKmDocument(UnmountKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnmountKmDocumentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 解除文档与节点的挂载关系(不删除文档记录)
        /// Summary: 解除文档与节点的挂载关系(不删除文档记录)</para>
        /// </description>
        public async Task<UnmountKmDocumentResponse> UnmountKmDocumentAsync(UnmountKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnmountKmDocumentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 解除文档与节点的挂载关系(不删除文档记录)
        /// Summary: 解除文档与节点的挂载关系(不删除文档记录)</para>
        /// </description>
        public UnmountKmDocumentResponse UnmountKmDocumentEx(UnmountKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountKmDocumentResponse>(DoRequest("1.0", "antdigital.energent.km.document.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 解除文档与节点的挂载关系(不删除文档记录)
        /// Summary: 解除文档与节点的挂载关系(不删除文档记录)</para>
        /// </description>
        public async Task<UnmountKmDocumentResponse> UnmountKmDocumentExAsync(UnmountKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnmountKmDocumentResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.document.unmount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询文档预览内容(MD正文)
        /// Summary: 查询文档预览内容(MD正文)</para>
        /// </description>
        public PreviewKmDocumentResponse PreviewKmDocument(PreviewKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewKmDocumentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询文档预览内容(MD正文)
        /// Summary: 查询文档预览内容(MD正文)</para>
        /// </description>
        public async Task<PreviewKmDocumentResponse> PreviewKmDocumentAsync(PreviewKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewKmDocumentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询文档预览内容(MD正文)
        /// Summary: 查询文档预览内容(MD正文)</para>
        /// </description>
        public PreviewKmDocumentResponse PreviewKmDocumentEx(PreviewKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewKmDocumentResponse>(DoRequest("1.0", "antdigital.energent.km.document.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询文档预览内容(MD正文)
        /// Summary: 查询文档预览内容(MD正文)</para>
        /// </description>
        public async Task<PreviewKmDocumentResponse> PreviewKmDocumentExAsync(PreviewKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewKmDocumentResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.document.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询文档段落切片列表(支持关键词过滤)
        /// Summary: 查询文档段落切片列表(支持关键词过滤)</para>
        /// </description>
        public SegmentsKmDocumentResponse SegmentsKmDocument(SegmentsKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SegmentsKmDocumentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询文档段落切片列表(支持关键词过滤)
        /// Summary: 查询文档段落切片列表(支持关键词过滤)</para>
        /// </description>
        public async Task<SegmentsKmDocumentResponse> SegmentsKmDocumentAsync(SegmentsKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SegmentsKmDocumentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询文档段落切片列表(支持关键词过滤)
        /// Summary: 查询文档段落切片列表(支持关键词过滤)</para>
        /// </description>
        public SegmentsKmDocumentResponse SegmentsKmDocumentEx(SegmentsKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SegmentsKmDocumentResponse>(DoRequest("1.0", "antdigital.energent.km.document.segments", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询文档段落切片列表(支持关键词过滤)
        /// Summary: 查询文档段落切片列表(支持关键词过滤)</para>
        /// </description>
        public async Task<SegmentsKmDocumentResponse> SegmentsKmDocumentExAsync(SegmentsKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SegmentsKmDocumentResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.document.segments", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 树内节点与文档统一搜索
        /// Summary: 树内节点与文档统一搜索</para>
        /// </description>
        public SearchKmDocumentResponse SearchKmDocument(SearchKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SearchKmDocumentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 树内节点与文档统一搜索
        /// Summary: 树内节点与文档统一搜索</para>
        /// </description>
        public async Task<SearchKmDocumentResponse> SearchKmDocumentAsync(SearchKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SearchKmDocumentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 树内节点与文档统一搜索
        /// Summary: 树内节点与文档统一搜索</para>
        /// </description>
        public SearchKmDocumentResponse SearchKmDocumentEx(SearchKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchKmDocumentResponse>(DoRequest("1.0", "antdigital.energent.km.document.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 树内节点与文档统一搜索
        /// Summary: 树内节点与文档统一搜索</para>
        /// </description>
        public async Task<SearchKmDocumentResponse> SearchKmDocumentExAsync(SearchKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchKmDocumentResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.document.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建并发布知识库新版本
        /// Summary: 创建并发布知识库新版本</para>
        /// </description>
        public CreateKmVersionResponse CreateKmVersion(CreateKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateKmVersionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建并发布知识库新版本
        /// Summary: 创建并发布知识库新版本</para>
        /// </description>
        public async Task<CreateKmVersionResponse> CreateKmVersionAsync(CreateKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateKmVersionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建并发布知识库新版本
        /// Summary: 创建并发布知识库新版本</para>
        /// </description>
        public CreateKmVersionResponse CreateKmVersionEx(CreateKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKmVersionResponse>(DoRequest("1.0", "antdigital.energent.km.version.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建并发布知识库新版本
        /// Summary: 创建并发布知识库新版本</para>
        /// </description>
        public async Task<CreateKmVersionResponse> CreateKmVersionExAsync(CreateKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateKmVersionResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.version.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库版本列表(分页)
        /// Summary: 查询知识库版本列表(分页)</para>
        /// </description>
        public ListKmVersionResponse ListKmVersion(ListKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListKmVersionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库版本列表(分页)
        /// Summary: 查询知识库版本列表(分页)</para>
        /// </description>
        public async Task<ListKmVersionResponse> ListKmVersionAsync(ListKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListKmVersionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库版本列表(分页)
        /// Summary: 查询知识库版本列表(分页)</para>
        /// </description>
        public ListKmVersionResponse ListKmVersionEx(ListKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListKmVersionResponse>(DoRequest("1.0", "antdigital.energent.km.version.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库版本列表(分页)
        /// Summary: 查询知识库版本列表(分页)</para>
        /// </description>
        public async Task<ListKmVersionResponse> ListKmVersionExAsync(ListKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListKmVersionResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.version.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询版本详情(含JSON快照)
        /// Summary: 查询版本详情(含JSON快照)</para>
        /// </description>
        public DetailKmVersionResponse DetailKmVersion(DetailKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailKmVersionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询版本详情(含JSON快照)
        /// Summary: 查询版本详情(含JSON快照)</para>
        /// </description>
        public async Task<DetailKmVersionResponse> DetailKmVersionAsync(DetailKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailKmVersionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询版本详情(含JSON快照)
        /// Summary: 查询版本详情(含JSON快照)</para>
        /// </description>
        public DetailKmVersionResponse DetailKmVersionEx(DetailKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailKmVersionResponse>(DoRequest("1.0", "antdigital.energent.km.version.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询版本详情(含JSON快照)
        /// Summary: 查询版本详情(含JSON快照)</para>
        /// </description>
        public async Task<DetailKmVersionResponse> DetailKmVersionExAsync(DetailKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailKmVersionResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.version.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库下一个可用版本号
        /// Summary: 查询知识库下一个可用版本号</para>
        /// </description>
        public NextKmVersionResponse NextKmVersion(NextKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NextKmVersionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库下一个可用版本号
        /// Summary: 查询知识库下一个可用版本号</para>
        /// </description>
        public async Task<NextKmVersionResponse> NextKmVersionAsync(NextKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NextKmVersionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库下一个可用版本号
        /// Summary: 查询知识库下一个可用版本号</para>
        /// </description>
        public NextKmVersionResponse NextKmVersionEx(NextKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NextKmVersionResponse>(DoRequest("1.0", "antdigital.energent.km.version.next", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询知识库下一个可用版本号
        /// Summary: 查询知识库下一个可用版本号</para>
        /// </description>
        public async Task<NextKmVersionResponse> NextKmVersionExAsync(NextKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NextKmVersionResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.version.next", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 激活知识库指定版本(回滚用)
        /// Summary: 激活知识库指定版本(回滚用)</para>
        /// </description>
        public ActivateKmVersionResponse ActivateKmVersion(ActivateKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ActivateKmVersionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 激活知识库指定版本(回滚用)
        /// Summary: 激活知识库指定版本(回滚用)</para>
        /// </description>
        public async Task<ActivateKmVersionResponse> ActivateKmVersionAsync(ActivateKmVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ActivateKmVersionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 激活知识库指定版本(回滚用)
        /// Summary: 激活知识库指定版本(回滚用)</para>
        /// </description>
        public ActivateKmVersionResponse ActivateKmVersionEx(ActivateKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ActivateKmVersionResponse>(DoRequest("1.0", "antdigital.energent.km.version.activate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 激活知识库指定版本(回滚用)
        /// Summary: 激活知识库指定版本(回滚用)</para>
        /// </description>
        public async Task<ActivateKmVersionResponse> ActivateKmVersionExAsync(ActivateKmVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ActivateKmVersionResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.version.activate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 图谱节点详情与邻域展开
        /// Summary: 图谱节点详情与邻域展开</para>
        /// </description>
        public NodeKgGraphResponse NodeKgGraph(NodeKgGraphRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NodeKgGraphEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 图谱节点详情与邻域展开
        /// Summary: 图谱节点详情与邻域展开</para>
        /// </description>
        public async Task<NodeKgGraphResponse> NodeKgGraphAsync(NodeKgGraphRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NodeKgGraphExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 图谱节点详情与邻域展开
        /// Summary: 图谱节点详情与邻域展开</para>
        /// </description>
        public NodeKgGraphResponse NodeKgGraphEx(NodeKgGraphRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NodeKgGraphResponse>(DoRequest("1.0", "antdigital.energent.kg.graph.node", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 图谱节点详情与邻域展开
        /// Summary: 图谱节点详情与邻域展开</para>
        /// </description>
        public async Task<NodeKgGraphResponse> NodeKgGraphExAsync(NodeKgGraphRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NodeKgGraphResponse>(await DoRequestAsync("1.0", "antdigital.energent.kg.graph.node", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 图谱节点分类与图例配置
        /// Summary: 图谱节点分类与图例配置</para>
        /// </description>
        public CategoriesKgGraphResponse CategoriesKgGraph(CategoriesKgGraphRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CategoriesKgGraphEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 图谱节点分类与图例配置
        /// Summary: 图谱节点分类与图例配置</para>
        /// </description>
        public async Task<CategoriesKgGraphResponse> CategoriesKgGraphAsync(CategoriesKgGraphRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CategoriesKgGraphExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 图谱节点分类与图例配置
        /// Summary: 图谱节点分类与图例配置</para>
        /// </description>
        public CategoriesKgGraphResponse CategoriesKgGraphEx(CategoriesKgGraphRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CategoriesKgGraphResponse>(DoRequest("1.0", "antdigital.energent.kg.graph.categories", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 图谱节点分类与图例配置
        /// Summary: 图谱节点分类与图例配置</para>
        /// </description>
        public async Task<CategoriesKgGraphResponse> CategoriesKgGraphExAsync(CategoriesKgGraphRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CategoriesKgGraphResponse>(await DoRequestAsync("1.0", "antdigital.energent.kg.graph.categories", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 重试失败的图谱编译任务
        /// Summary: 重试失败的图谱编译任务</para>
        /// </description>
        public RetryKgCompileResponse RetryKgCompile(RetryKgCompileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryKgCompileEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 重试失败的图谱编译任务
        /// Summary: 重试失败的图谱编译任务</para>
        /// </description>
        public async Task<RetryKgCompileResponse> RetryKgCompileAsync(RetryKgCompileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryKgCompileExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 重试失败的图谱编译任务
        /// Summary: 重试失败的图谱编译任务</para>
        /// </description>
        public RetryKgCompileResponse RetryKgCompileEx(RetryKgCompileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryKgCompileResponse>(DoRequest("1.0", "antdigital.energent.kg.compile.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 重试失败的图谱编译任务
        /// Summary: 重试失败的图谱编译任务</para>
        /// </description>
        public async Task<RetryKgCompileResponse> RetryKgCompileExAsync(RetryKgCompileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryKgCompileResponse>(await DoRequestAsync("1.0", "antdigital.energent.kg.compile.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询图谱编译任务列表(分页)
        /// Summary: 查询图谱编译任务列表(分页)</para>
        /// </description>
        public ListKgCompileResponse ListKgCompile(ListKgCompileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListKgCompileEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询图谱编译任务列表(分页)
        /// Summary: 查询图谱编译任务列表(分页)</para>
        /// </description>
        public async Task<ListKgCompileResponse> ListKgCompileAsync(ListKgCompileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListKgCompileExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询图谱编译任务列表(分页)
        /// Summary: 查询图谱编译任务列表(分页)</para>
        /// </description>
        public ListKgCompileResponse ListKgCompileEx(ListKgCompileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListKgCompileResponse>(DoRequest("1.0", "antdigital.energent.kg.compile.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询图谱编译任务列表(分页)
        /// Summary: 查询图谱编译任务列表(分页)</para>
        /// </description>
        public async Task<ListKgCompileResponse> ListKgCompileExAsync(ListKgCompileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListKgCompileResponse>(await DoRequestAsync("1.0", "antdigital.energent.kg.compile.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 基于已上传文件生成图谱本体Schema(不落库)
        /// Summary: 基于已上传文件生成图谱本体Schema(不落库)</para>
        /// </description>
        public ExtractschemaKmDocumentResponse ExtractschemaKmDocument(ExtractschemaKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExtractschemaKmDocumentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 基于已上传文件生成图谱本体Schema(不落库)
        /// Summary: 基于已上传文件生成图谱本体Schema(不落库)</para>
        /// </description>
        public async Task<ExtractschemaKmDocumentResponse> ExtractschemaKmDocumentAsync(ExtractschemaKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExtractschemaKmDocumentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 基于已上传文件生成图谱本体Schema(不落库)
        /// Summary: 基于已上传文件生成图谱本体Schema(不落库)</para>
        /// </description>
        public ExtractschemaKmDocumentResponse ExtractschemaKmDocumentEx(ExtractschemaKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExtractschemaKmDocumentResponse>(DoRequest("1.0", "antdigital.energent.km.document.extractschema", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 基于已上传文件生成图谱本体Schema(不落库)
        /// Summary: 基于已上传文件生成图谱本体Schema(不落库)</para>
        /// </description>
        public async Task<ExtractschemaKmDocumentResponse> ExtractschemaKmDocumentExAsync(ExtractschemaKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExtractschemaKmDocumentResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.document.extractschema", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点拖拽排序
        /// Summary: 同级目录树节点拖拽排序</para>
        /// </description>
        public RankKmNodeResponse RankKmNode(RankKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RankKmNodeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点拖拽排序
        /// Summary: 同级目录树节点拖拽排序</para>
        /// </description>
        public async Task<RankKmNodeResponse> RankKmNodeAsync(RankKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RankKmNodeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点拖拽排序
        /// Summary: 同级目录树节点拖拽排序</para>
        /// </description>
        public RankKmNodeResponse RankKmNodeEx(RankKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RankKmNodeResponse>(DoRequest("1.0", "antdigital.energent.km.node.rank", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点拖拽排序
        /// Summary: 同级目录树节点拖拽排序</para>
        /// </description>
        public async Task<RankKmNodeResponse> RankKmNodeExAsync(RankKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RankKmNodeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.node.rank", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点按序重排
        /// Summary: 同级目录树节点按序重排</para>
        /// </description>
        public ReorderKmNodeResponse ReorderKmNode(ReorderKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReorderKmNodeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点按序重排
        /// Summary: 同级目录树节点按序重排</para>
        /// </description>
        public async Task<ReorderKmNodeResponse> ReorderKmNodeAsync(ReorderKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReorderKmNodeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点按序重排
        /// Summary: 同级目录树节点按序重排</para>
        /// </description>
        public ReorderKmNodeResponse ReorderKmNodeEx(ReorderKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReorderKmNodeResponse>(DoRequest("1.0", "antdigital.energent.km.node.reorder", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点按序重排
        /// Summary: 同级目录树节点按序重排</para>
        /// </description>
        public async Task<ReorderKmNodeResponse> ReorderKmNodeExAsync(ReorderKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReorderKmNodeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.node.reorder", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱全图查询(节点与关系)
        /// Summary: 知识图谱全图查询(节点与关系)</para>
        /// </description>
        public RetrieveKgGraphResponse RetrieveKgGraph(RetrieveKgGraphRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetrieveKgGraphEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱全图查询(节点与关系)
        /// Summary: 知识图谱全图查询(节点与关系)</para>
        /// </description>
        public async Task<RetrieveKgGraphResponse> RetrieveKgGraphAsync(RetrieveKgGraphRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetrieveKgGraphExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱全图查询(节点与关系)
        /// Summary: 知识图谱全图查询(节点与关系)</para>
        /// </description>
        public RetrieveKgGraphResponse RetrieveKgGraphEx(RetrieveKgGraphRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetrieveKgGraphResponse>(DoRequest("1.0", "antdigital.energent.kg.graph.retrieve", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱全图查询(节点与关系)
        /// Summary: 知识图谱全图查询(节点与关系)</para>
        /// </description>
        public async Task<RetrieveKgGraphResponse> RetrieveKgGraphExAsync(RetrieveKgGraphRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetrieveKgGraphResponse>(await DoRequestAsync("1.0", "antdigital.energent.kg.graph.retrieve", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点按序重排
        /// Summary: 同级目录树节点按序重排</para>
        /// </description>
        public SortKmNodeResponse SortKmNode(SortKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SortKmNodeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点按序重排
        /// Summary: 同级目录树节点按序重排</para>
        /// </description>
        public async Task<SortKmNodeResponse> SortKmNodeAsync(SortKmNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SortKmNodeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点按序重排
        /// Summary: 同级目录树节点按序重排</para>
        /// </description>
        public SortKmNodeResponse SortKmNodeEx(SortKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SortKmNodeResponse>(DoRequest("1.0", "antdigital.energent.km.node.sort", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 同级目录树节点按序重排
        /// Summary: 同级目录树节点按序重排</para>
        /// </description>
        public async Task<SortKmNodeResponse> SortKmNodeExAsync(SortKmNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SortKmNodeResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.node.sort", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱全图查询(节点与关系)
        /// Summary: 知识图谱全图查询(节点与关系)</para>
        /// </description>
        public QueryKgGraphResponse QueryKgGraph(QueryKgGraphRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryKgGraphEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱全图查询(节点与关系)
        /// Summary: 知识图谱全图查询(节点与关系)</para>
        /// </description>
        public async Task<QueryKgGraphResponse> QueryKgGraphAsync(QueryKgGraphRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryKgGraphExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱全图查询(节点与关系)
        /// Summary: 知识图谱全图查询(节点与关系)</para>
        /// </description>
        public QueryKgGraphResponse QueryKgGraphEx(QueryKgGraphRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKgGraphResponse>(DoRequest("1.0", "antdigital.energent.kg.graph.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识图谱全图查询(节点与关系)
        /// Summary: 知识图谱全图查询(节点与关系)</para>
        /// </description>
        public async Task<QueryKgGraphResponse> QueryKgGraphExAsync(QueryKgGraphRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryKgGraphResponse>(await DoRequestAsync("1.0", "antdigital.energent.kg.graph.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库文件上传接入
        /// Summary: 知识库文件上传接入</para>
        /// </description>
        public FileuploadKmDocumentResponse FileuploadKmDocument(FileuploadKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FileuploadKmDocumentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库文件上传接入
        /// Summary: 知识库文件上传接入</para>
        /// </description>
        public async Task<FileuploadKmDocumentResponse> FileuploadKmDocumentAsync(FileuploadKmDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FileuploadKmDocumentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库文件上传接入
        /// Summary: 知识库文件上传接入</para>
        /// </description>
        public FileuploadKmDocumentResponse FileuploadKmDocumentEx(FileuploadKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.energent.km.document.fileupload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    FileuploadKmDocumentResponse fileuploadKmDocumentResponse = new FileuploadKmDocumentResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return fileuploadKmDocumentResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FileuploadKmDocumentResponse>(DoRequest("1.0", "antdigital.energent.km.document.fileupload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 知识库文件上传接入
        /// Summary: 知识库文件上传接入</para>
        /// </description>
        public async Task<FileuploadKmDocumentResponse> FileuploadKmDocumentExAsync(FileuploadKmDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.energent.km.document.fileupload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    FileuploadKmDocumentResponse fileuploadKmDocumentResponse = new FileuploadKmDocumentResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return fileuploadKmDocumentResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FileuploadKmDocumentResponse>(await DoRequestAsync("1.0", "antdigital.energent.km.document.fileupload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntcloudGatewayxFileUploadEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadAsync(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntcloudGatewayxFileUploadExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(DoRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadExAsync(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(await DoRequestAsync("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
