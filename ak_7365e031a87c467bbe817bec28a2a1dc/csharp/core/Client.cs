// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_7365e031a87c467bbe817bec28a2a1dc.Models;

namespace AntChain.SDK.Ak_7365e031a87c467bbe817bec28a2a1dc
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_7365e031a87c467bbe817bec28a2a1dc"},
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_7365e031a87c467bbe817bec28a2a1dc"},
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
         * Description: 修改导出任务状态（启动、暂停、删除）
         * Summary: 修改导出任务状态（启动、暂停、删除）
         */
        public UpdateBaasChainDataexportStatusResponse UpdateBaasChainDataexportStatus(UpdateBaasChainDataexportStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBaasChainDataexportStatusEx(request, headers, runtime);
        }

        /**
         * Description: 修改导出任务状态（启动、暂停、删除）
         * Summary: 修改导出任务状态（启动、暂停、删除）
         */
        public async Task<UpdateBaasChainDataexportStatusResponse> UpdateBaasChainDataexportStatusAsync(UpdateBaasChainDataexportStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBaasChainDataexportStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改导出任务状态（启动、暂停、删除）
         * Summary: 修改导出任务状态（启动、暂停、删除）
         */
        public UpdateBaasChainDataexportStatusResponse UpdateBaasChainDataexportStatusEx(UpdateBaasChainDataexportStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasChainDataexportStatusResponse>(DoRequest("1.0", "baas.chain.dataexport.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改导出任务状态（启动、暂停、删除）
         * Summary: 修改导出任务状态（启动、暂停、删除）
         */
        public async Task<UpdateBaasChainDataexportStatusResponse> UpdateBaasChainDataexportStatusExAsync(UpdateBaasChainDataexportStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasChainDataexportStatusResponse>(await DoRequestAsync("1.0", "baas.chain.dataexport.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云数据导出需求创建数据导出任务
         * Summary: 创建数据导出任务
         */
        public CreateBaasChainDataexportTaskResponse CreateBaasChainDataexportTask(CreateBaasChainDataexportTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaasChainDataexportTaskEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云数据导出需求创建数据导出任务
         * Summary: 创建数据导出任务
         */
        public async Task<CreateBaasChainDataexportTaskResponse> CreateBaasChainDataexportTaskAsync(CreateBaasChainDataexportTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaasChainDataexportTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云数据导出需求创建数据导出任务
         * Summary: 创建数据导出任务
         */
        public CreateBaasChainDataexportTaskResponse CreateBaasChainDataexportTaskEx(CreateBaasChainDataexportTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasChainDataexportTaskResponse>(DoRequest("1.0", "baas.chain.dataexport.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云数据导出需求创建数据导出任务
         * Summary: 创建数据导出任务
         */
        public async Task<CreateBaasChainDataexportTaskResponse> CreateBaasChainDataexportTaskExAsync(CreateBaasChainDataexportTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasChainDataexportTaskResponse>(await DoRequestAsync("1.0", "baas.chain.dataexport.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改导出任务（名称、描述、告警地址）
         * Summary: 修改导出任务（名称、描述、告警地址）
         */
        public UpdateBaasChainDataexportTaskResponse UpdateBaasChainDataexportTask(UpdateBaasChainDataexportTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBaasChainDataexportTaskEx(request, headers, runtime);
        }

        /**
         * Description: 修改导出任务（名称、描述、告警地址）
         * Summary: 修改导出任务（名称、描述、告警地址）
         */
        public async Task<UpdateBaasChainDataexportTaskResponse> UpdateBaasChainDataexportTaskAsync(UpdateBaasChainDataexportTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBaasChainDataexportTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改导出任务（名称、描述、告警地址）
         * Summary: 修改导出任务（名称、描述、告警地址）
         */
        public UpdateBaasChainDataexportTaskResponse UpdateBaasChainDataexportTaskEx(UpdateBaasChainDataexportTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasChainDataexportTaskResponse>(DoRequest("1.0", "baas.chain.dataexport.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改导出任务（名称、描述、告警地址）
         * Summary: 修改导出任务（名称、描述、告警地址）
         */
        public async Task<UpdateBaasChainDataexportTaskResponse> UpdateBaasChainDataexportTaskExAsync(UpdateBaasChainDataexportTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasChainDataexportTaskResponse>(await DoRequestAsync("1.0", "baas.chain.dataexport.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取区块链当前块高
         * Summary: 区块链数据服务-获取区块链当前块高
         */
        public GetBaasPlusDataserviceBlockchainheightResponse GetBaasPlusDataserviceBlockchainheight(GetBaasPlusDataserviceBlockchainheightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBaasPlusDataserviceBlockchainheightEx(request, headers, runtime);
        }

        /**
         * Description: 获取区块链当前块高
         * Summary: 区块链数据服务-获取区块链当前块高
         */
        public async Task<GetBaasPlusDataserviceBlockchainheightResponse> GetBaasPlusDataserviceBlockchainheightAsync(GetBaasPlusDataserviceBlockchainheightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBaasPlusDataserviceBlockchainheightExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取区块链当前块高
         * Summary: 区块链数据服务-获取区块链当前块高
         */
        public GetBaasPlusDataserviceBlockchainheightResponse GetBaasPlusDataserviceBlockchainheightEx(GetBaasPlusDataserviceBlockchainheightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBaasPlusDataserviceBlockchainheightResponse>(DoRequest("1.0", "baas.plus.dataservice.blockchainheight.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取区块链当前块高
         * Summary: 区块链数据服务-获取区块链当前块高
         */
        public async Task<GetBaasPlusDataserviceBlockchainheightResponse> GetBaasPlusDataserviceBlockchainheightExAsync(GetBaasPlusDataserviceBlockchainheightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBaasPlusDataserviceBlockchainheightResponse>(await DoRequestAsync("1.0", "baas.plus.dataservice.blockchainheight.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链最近n条块信息
         * Summary: 区块链数据服务-获取链最近n条块信息
         */
        public ListBaasPlusDataserviceLastblocksResponse ListBaasPlusDataserviceLastblocks(ListBaasPlusDataserviceLastblocksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBaasPlusDataserviceLastblocksEx(request, headers, runtime);
        }

        /**
         * Description: 获取链最近n条块信息
         * Summary: 区块链数据服务-获取链最近n条块信息
         */
        public async Task<ListBaasPlusDataserviceLastblocksResponse> ListBaasPlusDataserviceLastblocksAsync(ListBaasPlusDataserviceLastblocksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBaasPlusDataserviceLastblocksExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取链最近n条块信息
         * Summary: 区块链数据服务-获取链最近n条块信息
         */
        public ListBaasPlusDataserviceLastblocksResponse ListBaasPlusDataserviceLastblocksEx(ListBaasPlusDataserviceLastblocksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasPlusDataserviceLastblocksResponse>(DoRequest("1.0", "baas.plus.dataservice.lastblocks.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链最近n条块信息
         * Summary: 区块链数据服务-获取链最近n条块信息
         */
        public async Task<ListBaasPlusDataserviceLastblocksResponse> ListBaasPlusDataserviceLastblocksExAsync(ListBaasPlusDataserviceLastblocksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasPlusDataserviceLastblocksResponse>(await DoRequestAsync("1.0", "baas.plus.dataservice.lastblocks.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链交易总数
         * Summary: 区块链数据服务-获取链交易总数
         */
        public GetBaasPlusDataserviceTransactioncountResponse GetBaasPlusDataserviceTransactioncount(GetBaasPlusDataserviceTransactioncountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBaasPlusDataserviceTransactioncountEx(request, headers, runtime);
        }

        /**
         * Description: 获取链交易总数
         * Summary: 区块链数据服务-获取链交易总数
         */
        public async Task<GetBaasPlusDataserviceTransactioncountResponse> GetBaasPlusDataserviceTransactioncountAsync(GetBaasPlusDataserviceTransactioncountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBaasPlusDataserviceTransactioncountExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取链交易总数
         * Summary: 区块链数据服务-获取链交易总数
         */
        public GetBaasPlusDataserviceTransactioncountResponse GetBaasPlusDataserviceTransactioncountEx(GetBaasPlusDataserviceTransactioncountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBaasPlusDataserviceTransactioncountResponse>(DoRequest("1.0", "baas.plus.dataservice.transactioncount.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链交易总数
         * Summary: 区块链数据服务-获取链交易总数
         */
        public async Task<GetBaasPlusDataserviceTransactioncountResponse> GetBaasPlusDataserviceTransactioncountExAsync(GetBaasPlusDataserviceTransactioncountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBaasPlusDataserviceTransactioncountResponse>(await DoRequestAsync("1.0", "baas.plus.dataservice.transactioncount.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据交易hash获取交易详情
         * Summary: 区块链数据服务-获取交易详情
         */
        public GetBaasPlusDataserviceTransactioninfoResponse GetBaasPlusDataserviceTransactioninfo(GetBaasPlusDataserviceTransactioninfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBaasPlusDataserviceTransactioninfoEx(request, headers, runtime);
        }

        /**
         * Description: 根据交易hash获取交易详情
         * Summary: 区块链数据服务-获取交易详情
         */
        public async Task<GetBaasPlusDataserviceTransactioninfoResponse> GetBaasPlusDataserviceTransactioninfoAsync(GetBaasPlusDataserviceTransactioninfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBaasPlusDataserviceTransactioninfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据交易hash获取交易详情
         * Summary: 区块链数据服务-获取交易详情
         */
        public GetBaasPlusDataserviceTransactioninfoResponse GetBaasPlusDataserviceTransactioninfoEx(GetBaasPlusDataserviceTransactioninfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBaasPlusDataserviceTransactioninfoResponse>(DoRequest("1.0", "baas.plus.dataservice.transactioninfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据交易hash获取交易详情
         * Summary: 区块链数据服务-获取交易详情
         */
        public async Task<GetBaasPlusDataserviceTransactioninfoResponse> GetBaasPlusDataserviceTransactioninfoExAsync(GetBaasPlusDataserviceTransactioninfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBaasPlusDataserviceTransactioninfoResponse>(await DoRequestAsync("1.0", "baas.plus.dataservice.transactioninfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
