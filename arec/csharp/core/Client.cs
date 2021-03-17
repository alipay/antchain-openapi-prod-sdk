// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.AREC.Models;

namespace AntChain.SDK.AREC
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
                        {"sdk_version", "1.4.10"},
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
                        {"sdk_version", "1.4.10"},
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
         * Description: 发起房产查询
         * Summary: 发起房产查询
         */
        public StartRcpHqResponse StartRcpHq(StartRcpHqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartRcpHqEx(request, headers, runtime);
        }

        /**
         * Description: 发起房产查询
         * Summary: 发起房产查询
         */
        public async Task<StartRcpHqResponse> StartRcpHqAsync(StartRcpHqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartRcpHqExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起房产查询
         * Summary: 发起房产查询
         */
        public StartRcpHqResponse StartRcpHqEx(StartRcpHqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcpHqResponse>(DoRequest("1.0", "blockchain.arec.rcp.hq.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起房产查询
         * Summary: 发起房产查询
         */
        public async Task<StartRcpHqResponse> StartRcpHqExAsync(StartRcpHqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcpHqResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.hq.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取房产查询单信息
         * Summary: 获取房产查询单信息
         */
        public GetRcpHqResponse GetRcpHq(GetRcpHqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRcpHqEx(request, headers, runtime);
        }

        /**
         * Description: 获取房产查询单信息
         * Summary: 获取房产查询单信息
         */
        public async Task<GetRcpHqResponse> GetRcpHqAsync(GetRcpHqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRcpHqExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取房产查询单信息
         * Summary: 获取房产查询单信息
         */
        public GetRcpHqResponse GetRcpHqEx(GetRcpHqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRcpHqResponse>(DoRequest("1.0", "blockchain.arec.rcp.hq.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取房产查询单信息
         * Summary: 获取房产查询单信息
         */
        public async Task<GetRcpHqResponse> GetRcpHqExAsync(GetRcpHqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRcpHqResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.hq.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起解抵押(宁波模式)
         * Summary: 发起解抵押(宁波模式)
         */
        public StartRcpMgrResponse StartRcpMgr(StartRcpMgrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartRcpMgrEx(request, headers, runtime);
        }

        /**
         * Description: 发起解抵押(宁波模式)
         * Summary: 发起解抵押(宁波模式)
         */
        public async Task<StartRcpMgrResponse> StartRcpMgrAsync(StartRcpMgrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartRcpMgrExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起解抵押(宁波模式)
         * Summary: 发起解抵押(宁波模式)
         */
        public StartRcpMgrResponse StartRcpMgrEx(StartRcpMgrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcpMgrResponse>(DoRequest("1.0", "blockchain.arec.rcp.mgr.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起解抵押(宁波模式)
         * Summary: 发起解抵押(宁波模式)
         */
        public async Task<StartRcpMgrResponse> StartRcpMgrExAsync(StartRcpMgrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcpMgrResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mgr.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认解抵押(宁波模式)
         * Summary: 确认解抵押(宁波模式)
         */
        public ConfirmRcpMgrResponse ConfirmRcpMgr(ConfirmRcpMgrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmRcpMgrEx(request, headers, runtime);
        }

        /**
         * Description: 确认解抵押(宁波模式)
         * Summary: 确认解抵押(宁波模式)
         */
        public async Task<ConfirmRcpMgrResponse> ConfirmRcpMgrAsync(ConfirmRcpMgrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmRcpMgrExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认解抵押(宁波模式)
         * Summary: 确认解抵押(宁波模式)
         */
        public ConfirmRcpMgrResponse ConfirmRcpMgrEx(ConfirmRcpMgrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRcpMgrResponse>(DoRequest("1.0", "blockchain.arec.rcp.mgr.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认解抵押(宁波模式)
         * Summary: 确认解抵押(宁波模式)
         */
        public async Task<ConfirmRcpMgrResponse> ConfirmRcpMgrExAsync(ConfirmRcpMgrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRcpMgrResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mgr.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解抵押单(宁波模式)
         * Summary: 查询解抵押单(宁波模式)
         */
        public GetRcpMgrResponse GetRcpMgr(GetRcpMgrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRcpMgrEx(request, headers, runtime);
        }

        /**
         * Description: 查询解抵押单(宁波模式)
         * Summary: 查询解抵押单(宁波模式)
         */
        public async Task<GetRcpMgrResponse> GetRcpMgrAsync(GetRcpMgrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRcpMgrExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询解抵押单(宁波模式)
         * Summary: 查询解抵押单(宁波模式)
         */
        public GetRcpMgrResponse GetRcpMgrEx(GetRcpMgrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRcpMgrResponse>(DoRequest("1.0", "blockchain.arec.rcp.mgr.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解抵押单(宁波模式)
         * Summary: 查询解抵押单(宁波模式)
         */
        public async Task<GetRcpMgrResponse> GetRcpMgrExAsync(GetRcpMgrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRcpMgrResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mgr.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 房屋抵押贷款业务，发起抵押登记服务
         * Summary: 发起抵押登记
         */
        public StartRcpMgResponse StartRcpMg(StartRcpMgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartRcpMgEx(request, headers, runtime);
        }

        /**
         * Description: 房屋抵押贷款业务，发起抵押登记服务
         * Summary: 发起抵押登记
         */
        public async Task<StartRcpMgResponse> StartRcpMgAsync(StartRcpMgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartRcpMgExAsync(request, headers, runtime);
        }

        /**
         * Description: 房屋抵押贷款业务，发起抵押登记服务
         * Summary: 发起抵押登记
         */
        public StartRcpMgResponse StartRcpMgEx(StartRcpMgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcpMgResponse>(DoRequest("1.0", "blockchain.arec.rcp.mg.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 房屋抵押贷款业务，发起抵押登记服务
         * Summary: 发起抵押登记
         */
        public async Task<StartRcpMgResponse> StartRcpMgExAsync(StartRcpMgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcpMgResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mg.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据抵押单号查询抵押单
         * Summary: 查询抵押单
         */
        public GetRcpMgResponse GetRcpMg(GetRcpMgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRcpMgEx(request, headers, runtime);
        }

        /**
         * Description: 根据抵押单号查询抵押单
         * Summary: 查询抵押单
         */
        public async Task<GetRcpMgResponse> GetRcpMgAsync(GetRcpMgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRcpMgExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据抵押单号查询抵押单
         * Summary: 查询抵押单
         */
        public GetRcpMgResponse GetRcpMgEx(GetRcpMgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRcpMgResponse>(DoRequest("1.0", "blockchain.arec.rcp.mg.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据抵押单号查询抵押单
         * Summary: 查询抵押单
         */
        public async Task<GetRcpMgResponse> GetRcpMgExAsync(GetRcpMgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRcpMgResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mg.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 房屋抵押登记业务，银行确认抵押登记服务
         * Summary: 确认抵押登记
         */
        public ConfirmRcpMgResponse ConfirmRcpMg(ConfirmRcpMgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmRcpMgEx(request, headers, runtime);
        }

        /**
         * Description: 房屋抵押登记业务，银行确认抵押登记服务
         * Summary: 确认抵押登记
         */
        public async Task<ConfirmRcpMgResponse> ConfirmRcpMgAsync(ConfirmRcpMgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmRcpMgExAsync(request, headers, runtime);
        }

        /**
         * Description: 房屋抵押登记业务，银行确认抵押登记服务
         * Summary: 确认抵押登记
         */
        public ConfirmRcpMgResponse ConfirmRcpMgEx(ConfirmRcpMgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRcpMgResponse>(DoRequest("1.0", "blockchain.arec.rcp.mg.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 房屋抵押登记业务，银行确认抵押登记服务
         * Summary: 确认抵押登记
         */
        public async Task<ConfirmRcpMgResponse> ConfirmRcpMgExAsync(ConfirmRcpMgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRcpMgResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mg.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
         * Summary: 确认进行预抵押登记
         */
        public InitRcpMgResponse InitRcpMg(InitRcpMgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitRcpMgEx(request, headers, runtime);
        }

        /**
         * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
         * Summary: 确认进行预抵押登记
         */
        public async Task<InitRcpMgResponse> InitRcpMgAsync(InitRcpMgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitRcpMgExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
         * Summary: 确认进行预抵押登记
         */
        public InitRcpMgResponse InitRcpMgEx(InitRcpMgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitRcpMgResponse>(DoRequest("1.0", "blockchain.arec.rcp.mg.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
         * Summary: 确认进行预抵押登记
         */
        public async Task<InitRcpMgResponse> InitRcpMgExAsync(InitRcpMgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitRcpMgResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mg.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起抵押(宁波模式)
         * Summary: 发起抵押(宁波模式)
         */
        public StartRcpMgvtwoResponse StartRcpMgvtwo(StartRcpMgvtwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartRcpMgvtwoEx(request, headers, runtime);
        }

        /**
         * Description: 发起抵押(宁波模式)
         * Summary: 发起抵押(宁波模式)
         */
        public async Task<StartRcpMgvtwoResponse> StartRcpMgvtwoAsync(StartRcpMgvtwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartRcpMgvtwoExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起抵押(宁波模式)
         * Summary: 发起抵押(宁波模式)
         */
        public StartRcpMgvtwoResponse StartRcpMgvtwoEx(StartRcpMgvtwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcpMgvtwoResponse>(DoRequest("1.0", "blockchain.arec.rcp.mgvtwo.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起抵押(宁波模式)
         * Summary: 发起抵押(宁波模式)
         */
        public async Task<StartRcpMgvtwoResponse> StartRcpMgvtwoExAsync(StartRcpMgvtwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcpMgvtwoResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mgvtwo.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认抵押(宁波模式)
         * Summary: 确认抵押(宁波模式)
         */
        public ConfirmRcpMgvtwoResponse ConfirmRcpMgvtwo(ConfirmRcpMgvtwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmRcpMgvtwoEx(request, headers, runtime);
        }

        /**
         * Description: 确认抵押(宁波模式)
         * Summary: 确认抵押(宁波模式)
         */
        public async Task<ConfirmRcpMgvtwoResponse> ConfirmRcpMgvtwoAsync(ConfirmRcpMgvtwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmRcpMgvtwoExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认抵押(宁波模式)
         * Summary: 确认抵押(宁波模式)
         */
        public ConfirmRcpMgvtwoResponse ConfirmRcpMgvtwoEx(ConfirmRcpMgvtwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRcpMgvtwoResponse>(DoRequest("1.0", "blockchain.arec.rcp.mgvtwo.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认抵押(宁波模式)
         * Summary: 确认抵押(宁波模式)
         */
        public async Task<ConfirmRcpMgvtwoResponse> ConfirmRcpMgvtwoExAsync(ConfirmRcpMgvtwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmRcpMgvtwoResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mgvtwo.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终止抵押(宁波模式)
         * Summary: 终止抵押(宁波模式)
         */
        public CloseRcpMgvtwoResponse CloseRcpMgvtwo(CloseRcpMgvtwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloseRcpMgvtwoEx(request, headers, runtime);
        }

        /**
         * Description: 终止抵押(宁波模式)
         * Summary: 终止抵押(宁波模式)
         */
        public async Task<CloseRcpMgvtwoResponse> CloseRcpMgvtwoAsync(CloseRcpMgvtwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloseRcpMgvtwoExAsync(request, headers, runtime);
        }

        /**
         * Description: 终止抵押(宁波模式)
         * Summary: 终止抵押(宁波模式)
         */
        public CloseRcpMgvtwoResponse CloseRcpMgvtwoEx(CloseRcpMgvtwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseRcpMgvtwoResponse>(DoRequest("1.0", "blockchain.arec.rcp.mgvtwo.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终止抵押(宁波模式)
         * Summary: 终止抵押(宁波模式)
         */
        public async Task<CloseRcpMgvtwoResponse> CloseRcpMgvtwoExAsync(CloseRcpMgvtwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseRcpMgvtwoResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mgvtwo.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询抵押单(宁波模式)
         * Summary: 查询抵押单(宁波模式)
         */
        public GetRcpMgvtwoResponse GetRcpMgvtwo(GetRcpMgvtwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRcpMgvtwoEx(request, headers, runtime);
        }

        /**
         * Description: 查询抵押单(宁波模式)
         * Summary: 查询抵押单(宁波模式)
         */
        public async Task<GetRcpMgvtwoResponse> GetRcpMgvtwoAsync(GetRcpMgvtwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRcpMgvtwoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询抵押单(宁波模式)
         * Summary: 查询抵押单(宁波模式)
         */
        public GetRcpMgvtwoResponse GetRcpMgvtwoEx(GetRcpMgvtwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRcpMgvtwoResponse>(DoRequest("1.0", "blockchain.arec.rcp.mgvtwo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询抵押单(宁波模式)
         * Summary: 查询抵押单(宁波模式)
         */
        public async Task<GetRcpMgvtwoResponse> GetRcpMgvtwoExAsync(GetRcpMgvtwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRcpMgvtwoResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.mgvtwo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
         * Summary: 接收不动产中心授权签约列表
         */
        public AuthRcpRtcResponse AuthRcpRtc(AuthRcpRtcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthRcpRtcEx(request, headers, runtime);
        }

        /**
         * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
         * Summary: 接收不动产中心授权签约列表
         */
        public async Task<AuthRcpRtcResponse> AuthRcpRtcAsync(AuthRcpRtcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthRcpRtcExAsync(request, headers, runtime);
        }

        /**
         * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
         * Summary: 接收不动产中心授权签约列表
         */
        public AuthRcpRtcResponse AuthRcpRtcEx(AuthRcpRtcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthRcpRtcResponse>(DoRequest("1.0", "blockchain.arec.rcp.rtc.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
         * Summary: 接收不动产中心授权签约列表
         */
        public async Task<AuthRcpRtcResponse> AuthRcpRtcExAsync(AuthRcpRtcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthRcpRtcResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.rtc.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
         * Summary: 接收不动产中心业务处理结果
         */
        public FinishRcpRtcResponse FinishRcpRtc(FinishRcpRtcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishRcpRtcEx(request, headers, runtime);
        }

        /**
         * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
         * Summary: 接收不动产中心业务处理结果
         */
        public async Task<FinishRcpRtcResponse> FinishRcpRtcAsync(FinishRcpRtcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishRcpRtcExAsync(request, headers, runtime);
        }

        /**
         * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
         * Summary: 接收不动产中心业务处理结果
         */
        public FinishRcpRtcResponse FinishRcpRtcEx(FinishRcpRtcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishRcpRtcResponse>(DoRequest("1.0", "blockchain.arec.rcp.rtc.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
         * Summary: 接收不动产中心业务处理结果
         */
        public async Task<FinishRcpRtcResponse> FinishRcpRtcExAsync(FinishRcpRtcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishRcpRtcResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.rtc.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
         * Summary: 通知抵押结果完成(宁波)
         */
        public FinishRcpNingboResponse FinishRcpNingbo(FinishRcpNingboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishRcpNingboEx(request, headers, runtime);
        }

        /**
         * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
         * Summary: 通知抵押结果完成(宁波)
         */
        public async Task<FinishRcpNingboResponse> FinishRcpNingboAsync(FinishRcpNingboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishRcpNingboExAsync(request, headers, runtime);
        }

        /**
         * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
         * Summary: 通知抵押结果完成(宁波)
         */
        public FinishRcpNingboResponse FinishRcpNingboEx(FinishRcpNingboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishRcpNingboResponse>(DoRequest("1.0", "blockchain.arec.rcp.ningbo.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
         * Summary: 通知抵押结果完成(宁波)
         */
        public async Task<FinishRcpNingboResponse> FinishRcpNingboExAsync(FinishRcpNingboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishRcpNingboResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.ningbo.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知抵押驳回
         * Summary: 通知抵押驳回(宁波)
         */
        public RefuseRcpNingboResponse RefuseRcpNingbo(RefuseRcpNingboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseRcpNingboEx(request, headers, runtime);
        }

        /**
         * Description: 通知抵押驳回
         * Summary: 通知抵押驳回(宁波)
         */
        public async Task<RefuseRcpNingboResponse> RefuseRcpNingboAsync(RefuseRcpNingboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseRcpNingboExAsync(request, headers, runtime);
        }

        /**
         * Description: 通知抵押驳回
         * Summary: 通知抵押驳回(宁波)
         */
        public RefuseRcpNingboResponse RefuseRcpNingboEx(RefuseRcpNingboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseRcpNingboResponse>(DoRequest("1.0", "blockchain.arec.rcp.ningbo.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知抵押驳回
         * Summary: 通知抵押驳回(宁波)
         */
        public async Task<RefuseRcpNingboResponse> RefuseRcpNingboExAsync(RefuseRcpNingboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseRcpNingboResponse>(await DoRequestAsync("1.0", "blockchain.arec.rcp.ningbo.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
         * Summary: 注册企业账户
         */
        public CreateRealtytradeOrgResponse CreateRealtytradeOrg(CreateRealtytradeOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRealtytradeOrgEx(request, headers, runtime);
        }

        /**
         * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
         * Summary: 注册企业账户
         */
        public async Task<CreateRealtytradeOrgResponse> CreateRealtytradeOrgAsync(CreateRealtytradeOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRealtytradeOrgExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
         * Summary: 注册企业账户
         */
        public CreateRealtytradeOrgResponse CreateRealtytradeOrgEx(CreateRealtytradeOrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealtytradeOrgResponse>(DoRequest("1.0", "blockchain.arec.realtytrade.org.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
         * Summary: 注册企业账户
         */
        public async Task<CreateRealtytradeOrgResponse> CreateRealtytradeOrgExAsync(CreateRealtytradeOrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealtytradeOrgResponse>(await DoRequestAsync("1.0", "blockchain.arec.realtytrade.org.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
         * Summary: 创建企业印章
         */
        public CreateRealtytradeOrgsealResponse CreateRealtytradeOrgseal(CreateRealtytradeOrgsealRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRealtytradeOrgsealEx(request, headers, runtime);
        }

        /**
         * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
         * Summary: 创建企业印章
         */
        public async Task<CreateRealtytradeOrgsealResponse> CreateRealtytradeOrgsealAsync(CreateRealtytradeOrgsealRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRealtytradeOrgsealExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
         * Summary: 创建企业印章
         */
        public CreateRealtytradeOrgsealResponse CreateRealtytradeOrgsealEx(CreateRealtytradeOrgsealRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealtytradeOrgsealResponse>(DoRequest("1.0", "blockchain.arec.realtytrade.orgseal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
         * Summary: 创建企业印章
         */
        public async Task<CreateRealtytradeOrgsealResponse> CreateRealtytradeOrgsealExAsync(CreateRealtytradeOrgsealRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealtytradeOrgsealResponse>(await DoRequestAsync("1.0", "blockchain.arec.realtytrade.orgseal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
         * Summary: 注册个人账户
         */
        public CreateRealtytradePersonalResponse CreateRealtytradePersonal(CreateRealtytradePersonalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRealtytradePersonalEx(request, headers, runtime);
        }

        /**
         * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
         * Summary: 注册个人账户
         */
        public async Task<CreateRealtytradePersonalResponse> CreateRealtytradePersonalAsync(CreateRealtytradePersonalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRealtytradePersonalExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
         * Summary: 注册个人账户
         */
        public CreateRealtytradePersonalResponse CreateRealtytradePersonalEx(CreateRealtytradePersonalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealtytradePersonalResponse>(DoRequest("1.0", "blockchain.arec.realtytrade.personal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
         * Summary: 注册个人账户
         */
        public async Task<CreateRealtytradePersonalResponse> CreateRealtytradePersonalExAsync(CreateRealtytradePersonalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealtytradePersonalResponse>(await DoRequestAsync("1.0", "blockchain.arec.realtytrade.personal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
         * Summary: 创建个人图片印章
         */
        public CreateRealtytradePersonalsealResponse CreateRealtytradePersonalseal(CreateRealtytradePersonalsealRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateRealtytradePersonalsealEx(request, headers, runtime);
        }

        /**
         * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
         * Summary: 创建个人图片印章
         */
        public async Task<CreateRealtytradePersonalsealResponse> CreateRealtytradePersonalsealAsync(CreateRealtytradePersonalsealRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateRealtytradePersonalsealExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
         * Summary: 创建个人图片印章
         */
        public CreateRealtytradePersonalsealResponse CreateRealtytradePersonalsealEx(CreateRealtytradePersonalsealRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealtytradePersonalsealResponse>(DoRequest("1.0", "blockchain.arec.realtytrade.personalseal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
         * Summary: 创建个人图片印章
         */
        public async Task<CreateRealtytradePersonalsealResponse> CreateRealtytradePersonalsealExAsync(CreateRealtytradePersonalsealRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateRealtytradePersonalsealResponse>(await DoRequestAsync("1.0", "blockchain.arec.realtytrade.personalseal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
         * Summary: 发起签署流程
         */
        public StartRealtytradeSigningResponse StartRealtytradeSigning(StartRealtytradeSigningRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartRealtytradeSigningEx(request, headers, runtime);
        }

        /**
         * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
         * Summary: 发起签署流程
         */
        public async Task<StartRealtytradeSigningResponse> StartRealtytradeSigningAsync(StartRealtytradeSigningRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartRealtytradeSigningExAsync(request, headers, runtime);
        }

        /**
         * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
         * Summary: 发起签署流程
         */
        public StartRealtytradeSigningResponse StartRealtytradeSigningEx(StartRealtytradeSigningRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRealtytradeSigningResponse>(DoRequest("1.0", "blockchain.arec.realtytrade.signing.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
         * Summary: 发起签署流程
         */
        public async Task<StartRealtytradeSigningResponse> StartRealtytradeSigningExAsync(StartRealtytradeSigningRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRealtytradeSigningResponse>(await DoRequestAsync("1.0", "blockchain.arec.realtytrade.signing.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
         * Summary: 查看签署流程
         */
        public QueryRealtytradeSigningResponse QueryRealtytradeSigning(QueryRealtytradeSigningRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRealtytradeSigningEx(request, headers, runtime);
        }

        /**
         * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
         * Summary: 查看签署流程
         */
        public async Task<QueryRealtytradeSigningResponse> QueryRealtytradeSigningAsync(QueryRealtytradeSigningRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRealtytradeSigningExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
         * Summary: 查看签署流程
         */
        public QueryRealtytradeSigningResponse QueryRealtytradeSigningEx(QueryRealtytradeSigningRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRealtytradeSigningResponse>(DoRequest("1.0", "blockchain.arec.realtytrade.signing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
         * Summary: 查看签署流程
         */
        public async Task<QueryRealtytradeSigningResponse> QueryRealtytradeSigningExAsync(QueryRealtytradeSigningRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRealtytradeSigningResponse>(await DoRequestAsync("1.0", "blockchain.arec.realtytrade.signing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
