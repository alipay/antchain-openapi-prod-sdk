// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.ENT.Models;

namespace AntChain.SDK.ENT
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
                        {"sdk_version", "1.4.5"},
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
                        {"sdk_version", "1.4.5"},
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
         * Description: 查询用户参与的所有项目
         * Summary: 用户参与的项目查询
         */
        public QueryCustomerProjectResponse QueryCustomerProject(QueryCustomerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCustomerProjectEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户参与的所有项目
         * Summary: 用户参与的项目查询
         */
        public async Task<QueryCustomerProjectResponse> QueryCustomerProjectAsync(QueryCustomerProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCustomerProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户参与的所有项目
         * Summary: 用户参与的项目查询
         */
        public QueryCustomerProjectResponse QueryCustomerProjectEx(QueryCustomerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerProjectResponse>(DoRequest("1.0", "antchain.ent.customer.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户参与的所有项目
         * Summary: 用户参与的项目查询
         */
        public async Task<QueryCustomerProjectResponse> QueryCustomerProjectExAsync(QueryCustomerProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerProjectResponse>(await DoRequestAsync("1.0", "antchain.ent.customer.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户数据的接口
         * Summary: 用户数据查询接口
         */
        public QueryCustomerDataResponse QueryCustomerData(QueryCustomerDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCustomerDataEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户数据的接口
         * Summary: 用户数据查询接口
         */
        public async Task<QueryCustomerDataResponse> QueryCustomerDataAsync(QueryCustomerDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCustomerDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户数据的接口
         * Summary: 用户数据查询接口
         */
        public QueryCustomerDataResponse QueryCustomerDataEx(QueryCustomerDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerDataResponse>(DoRequest("1.0", "antchain.ent.customer.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户数据的接口
         * Summary: 用户数据查询接口
         */
        public async Task<QueryCustomerDataResponse> QueryCustomerDataExAsync(QueryCustomerDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerDataResponse>(await DoRequestAsync("1.0", "antchain.ent.customer.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为用户创建分享码
         * Summary: 用户分享码创建接口
         */
        public GetUserSharecodeResponse GetUserSharecode(GetUserSharecodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUserSharecodeEx(request, headers, runtime);
        }

        /**
         * Description: 为用户创建分享码
         * Summary: 用户分享码创建接口
         */
        public async Task<GetUserSharecodeResponse> GetUserSharecodeAsync(GetUserSharecodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUserSharecodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 为用户创建分享码
         * Summary: 用户分享码创建接口
         */
        public GetUserSharecodeResponse GetUserSharecodeEx(GetUserSharecodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUserSharecodeResponse>(DoRequest("1.0", "antchain.ent.user.sharecode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为用户创建分享码
         * Summary: 用户分享码创建接口
         */
        public async Task<GetUserSharecodeResponse> GetUserSharecodeExAsync(GetUserSharecodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUserSharecodeResponse>(await DoRequestAsync("1.0", "antchain.ent.user.sharecode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发送用户的项目订单数据
         * Summary: 用户项目订单消息发送接口
         */
        public SendUserProjectordermsgResponse SendUserProjectordermsg(SendUserProjectordermsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendUserProjectordermsgEx(request, headers, runtime);
        }

        /**
         * Description: 发送用户的项目订单数据
         * Summary: 用户项目订单消息发送接口
         */
        public async Task<SendUserProjectordermsgResponse> SendUserProjectordermsgAsync(SendUserProjectordermsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendUserProjectordermsgExAsync(request, headers, runtime);
        }

        /**
         * Description: 发送用户的项目订单数据
         * Summary: 用户项目订单消息发送接口
         */
        public SendUserProjectordermsgResponse SendUserProjectordermsgEx(SendUserProjectordermsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendUserProjectordermsgResponse>(DoRequest("1.0", "antchain.ent.user.projectordermsg.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发送用户的项目订单数据
         * Summary: 用户项目订单消息发送接口
         */
        public async Task<SendUserProjectordermsgResponse> SendUserProjectordermsgExAsync(SendUserProjectordermsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendUserProjectordermsgResponse>(await DoRequestAsync("1.0", "antchain.ent.user.projectordermsg.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询项目信息查询
         * Summary: 项目信息查询接口
         */
        public QueryProjectInfoResponse QueryProjectInfo(QueryProjectInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryProjectInfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询项目信息查询
         * Summary: 项目信息查询接口
         */
        public async Task<QueryProjectInfoResponse> QueryProjectInfoAsync(QueryProjectInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryProjectInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询项目信息查询
         * Summary: 项目信息查询接口
         */
        public QueryProjectInfoResponse QueryProjectInfoEx(QueryProjectInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProjectInfoResponse>(DoRequest("1.0", "antchain.ent.project.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询项目信息查询
         * Summary: 项目信息查询接口
         */
        public async Task<QueryProjectInfoResponse> QueryProjectInfoExAsync(QueryProjectInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProjectInfoResponse>(await DoRequestAsync("1.0", "antchain.ent.project.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息
         * Summary: 用户信息查询接口
         */
        public QueryUserInfoResponse QueryUserInfo(QueryUserInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserInfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息
         * Summary: 用户信息查询接口
         */
        public async Task<QueryUserInfoResponse> QueryUserInfoAsync(QueryUserInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息
         * Summary: 用户信息查询接口
         */
        public QueryUserInfoResponse QueryUserInfoEx(QueryUserInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserInfoResponse>(DoRequest("1.0", "antchain.ent.user.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息
         * Summary: 用户信息查询接口
         */
        public async Task<QueryUserInfoResponse> QueryUserInfoExAsync(QueryUserInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserInfoResponse>(await DoRequestAsync("1.0", "antchain.ent.user.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户粉丝粒获得明细
         * Summary: 用户粉丝粒获得明细查询接口
         */
        public QueryUserTokenallocationdetailResponse QueryUserTokenallocationdetail(QueryUserTokenallocationdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserTokenallocationdetailEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户粉丝粒获得明细
         * Summary: 用户粉丝粒获得明细查询接口
         */
        public async Task<QueryUserTokenallocationdetailResponse> QueryUserTokenallocationdetailAsync(QueryUserTokenallocationdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserTokenallocationdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户粉丝粒获得明细
         * Summary: 用户粉丝粒获得明细查询接口
         */
        public QueryUserTokenallocationdetailResponse QueryUserTokenallocationdetailEx(QueryUserTokenallocationdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserTokenallocationdetailResponse>(DoRequest("1.0", "antchain.ent.user.tokenallocationdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户粉丝粒获得明细
         * Summary: 用户粉丝粒获得明细查询接口
         */
        public async Task<QueryUserTokenallocationdetailResponse> QueryUserTokenallocationdetailExAsync(QueryUserTokenallocationdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserTokenallocationdetailResponse>(await DoRequestAsync("1.0", "antchain.ent.user.tokenallocationdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户粉丝粒兑现明细
         * Summary: 用户粉丝粒兑现明细查询接口
         */
        public QueryUserTokenredeemdetailResponse QueryUserTokenredeemdetail(QueryUserTokenredeemdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserTokenredeemdetailEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户粉丝粒兑现明细
         * Summary: 用户粉丝粒兑现明细查询接口
         */
        public async Task<QueryUserTokenredeemdetailResponse> QueryUserTokenredeemdetailAsync(QueryUserTokenredeemdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserTokenredeemdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户粉丝粒兑现明细
         * Summary: 用户粉丝粒兑现明细查询接口
         */
        public QueryUserTokenredeemdetailResponse QueryUserTokenredeemdetailEx(QueryUserTokenredeemdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserTokenredeemdetailResponse>(DoRequest("1.0", "antchain.ent.user.tokenredeemdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户粉丝粒兑现明细
         * Summary: 用户粉丝粒兑现明细查询接口
         */
        public async Task<QueryUserTokenredeemdetailResponse> QueryUserTokenredeemdetailExAsync(QueryUserTokenredeemdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserTokenredeemdetailResponse>(await DoRequestAsync("1.0", "antchain.ent.user.tokenredeemdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上报事件
         * Summary: 事件上报
         */
        public ExecEventReportResponse ExecEventReport(ExecEventReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecEventReportEx(request, headers, runtime);
        }

        /**
         * Description: 上报事件
         * Summary: 事件上报
         */
        public async Task<ExecEventReportResponse> ExecEventReportAsync(ExecEventReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecEventReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 上报事件
         * Summary: 事件上报
         */
        public ExecEventReportResponse ExecEventReportEx(ExecEventReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecEventReportResponse>(DoRequest("1.0", "antchain.ent.event.report.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上报事件
         * Summary: 事件上报
         */
        public async Task<ExecEventReportResponse> ExecEventReportExAsync(ExecEventReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecEventReportResponse>(await DoRequestAsync("1.0", "antchain.ent.event.report.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询事件信息
         * Summary: 事件信息查询
         */
        public QueryEventInfoResponse QueryEventInfo(QueryEventInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEventInfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询事件信息
         * Summary: 事件信息查询
         */
        public async Task<QueryEventInfoResponse> QueryEventInfoAsync(QueryEventInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEventInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询事件信息
         * Summary: 事件信息查询
         */
        public QueryEventInfoResponse QueryEventInfoEx(QueryEventInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEventInfoResponse>(DoRequest("1.0", "antchain.ent.event.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询事件信息
         * Summary: 事件信息查询
         */
        public async Task<QueryEventInfoResponse> QueryEventInfoExAsync(QueryEventInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEventInfoResponse>(await DoRequestAsync("1.0", "antchain.ent.event.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里拍卖nft资产元数据导入
         * Summary: 阿里拍卖nft资产元数据导入
         */
        public ImportNftMetaResponse ImportNftMeta(ImportNftMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportNftMetaEx(request, headers, runtime);
        }

        /**
         * Description: 阿里拍卖nft资产元数据导入
         * Summary: 阿里拍卖nft资产元数据导入
         */
        public async Task<ImportNftMetaResponse> ImportNftMetaAsync(ImportNftMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportNftMetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里拍卖nft资产元数据导入
         * Summary: 阿里拍卖nft资产元数据导入
         */
        public ImportNftMetaResponse ImportNftMetaEx(ImportNftMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportNftMetaResponse>(DoRequest("1.0", "antchain.ent.nft.meta.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里拍卖nft资产元数据导入
         * Summary: 阿里拍卖nft资产元数据导入
         */
        public async Task<ImportNftMetaResponse> ImportNftMetaExAsync(ImportNftMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportNftMetaResponse>(await DoRequestAsync("1.0", "antchain.ent.nft.meta.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: nft资产订单落库，链上流转
         * Summary: nft资产流转
         */
        public ExecNftTransferResponse ExecNftTransfer(ExecNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecNftTransferEx(request, headers, runtime);
        }

        /**
         * Description: nft资产订单落库，链上流转
         * Summary: nft资产流转
         */
        public async Task<ExecNftTransferResponse> ExecNftTransferAsync(ExecNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecNftTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: nft资产订单落库，链上流转
         * Summary: nft资产流转
         */
        public ExecNftTransferResponse ExecNftTransferEx(ExecNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecNftTransferResponse>(DoRequest("1.0", "antchain.ent.nft.transfer.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: nft资产订单落库，链上流转
         * Summary: nft资产流转
         */
        public async Task<ExecNftTransferResponse> ExecNftTransferExAsync(ExecNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecNftTransferResponse>(await DoRequestAsync("1.0", "antchain.ent.nft.transfer.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部ISV获取分享码接口
         * Summary: 获得ISV分享码
         */
        public GetIsvSharecodeResponse GetIsvSharecode(GetIsvSharecodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetIsvSharecodeEx(request, headers, runtime);
        }

        /**
         * Description: 外部ISV获取分享码接口
         * Summary: 获得ISV分享码
         */
        public async Task<GetIsvSharecodeResponse> GetIsvSharecodeAsync(GetIsvSharecodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetIsvSharecodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部ISV获取分享码接口
         * Summary: 获得ISV分享码
         */
        public GetIsvSharecodeResponse GetIsvSharecodeEx(GetIsvSharecodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIsvSharecodeResponse>(DoRequest("1.0", "antchain.ent.isv.sharecode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部ISV获取分享码接口
         * Summary: 获得ISV分享码
         */
        public async Task<GetIsvSharecodeResponse> GetIsvSharecodeExAsync(GetIsvSharecodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIsvSharecodeResponse>(await DoRequestAsync("1.0", "antchain.ent.isv.sharecode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 备付金追加接口
         * Summary: 备付金追加接口
         */
        public AddProvisionResponse AddProvision(AddProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddProvisionEx(request, headers, runtime);
        }

        /**
         * Description: 备付金追加接口
         * Summary: 备付金追加接口
         */
        public async Task<AddProvisionResponse> AddProvisionAsync(AddProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddProvisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 备付金追加接口
         * Summary: 备付金追加接口
         */
        public AddProvisionResponse AddProvisionEx(AddProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddProvisionResponse>(DoRequest("1.0", "antchain.ent.provision.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 备付金追加接口
         * Summary: 备付金追加接口
         */
        public async Task<AddProvisionResponse> AddProvisionExAsync(AddProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddProvisionResponse>(await DoRequestAsync("1.0", "antchain.ent.provision.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 赎回链上多余备付金
         * Summary: 赎回链上多余备付金
         */
        public ReclaimProvisionExtraprovisionResponse ReclaimProvisionExtraprovision(ReclaimProvisionExtraprovisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReclaimProvisionExtraprovisionEx(request, headers, runtime);
        }

        /**
         * Description: 赎回链上多余备付金
         * Summary: 赎回链上多余备付金
         */
        public async Task<ReclaimProvisionExtraprovisionResponse> ReclaimProvisionExtraprovisionAsync(ReclaimProvisionExtraprovisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReclaimProvisionExtraprovisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 赎回链上多余备付金
         * Summary: 赎回链上多余备付金
         */
        public ReclaimProvisionExtraprovisionResponse ReclaimProvisionExtraprovisionEx(ReclaimProvisionExtraprovisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReclaimProvisionExtraprovisionResponse>(DoRequest("1.0", "antchain.ent.provision.extraprovision.reclaim", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 赎回链上多余备付金
         * Summary: 赎回链上多余备付金
         */
        public async Task<ReclaimProvisionExtraprovisionResponse> ReclaimProvisionExtraprovisionExAsync(ReclaimProvisionExtraprovisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReclaimProvisionExtraprovisionResponse>(await DoRequestAsync("1.0", "antchain.ent.provision.extraprovision.reclaim", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上Token兑现接口
         * Summary: 链上Token兑现接口
         */
        public ExecTokenRedeemResponse ExecTokenRedeem(ExecTokenRedeemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecTokenRedeemEx(request, headers, runtime);
        }

        /**
         * Description: 链上Token兑现接口
         * Summary: 链上Token兑现接口
         */
        public async Task<ExecTokenRedeemResponse> ExecTokenRedeemAsync(ExecTokenRedeemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecTokenRedeemExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上Token兑现接口
         * Summary: 链上Token兑现接口
         */
        public ExecTokenRedeemResponse ExecTokenRedeemEx(ExecTokenRedeemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecTokenRedeemResponse>(DoRequest("1.0", "antchain.ent.token.redeem.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上Token兑现接口
         * Summary: 链上Token兑现接口
         */
        public async Task<ExecTokenRedeemResponse> ExecTokenRedeemExAsync(ExecTokenRedeemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecTokenRedeemResponse>(await DoRequestAsync("1.0", "antchain.ent.token.redeem.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对淘票票的获取专属邀请码获取接口
         * Summary: 淘票票专属邀请码获取接口
         */
        public GetTppSharecodeResponse GetTppSharecode(GetTppSharecodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTppSharecodeEx(request, headers, runtime);
        }

        /**
         * Description: 针对淘票票的获取专属邀请码获取接口
         * Summary: 淘票票专属邀请码获取接口
         */
        public async Task<GetTppSharecodeResponse> GetTppSharecodeAsync(GetTppSharecodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTppSharecodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 针对淘票票的获取专属邀请码获取接口
         * Summary: 淘票票专属邀请码获取接口
         */
        public GetTppSharecodeResponse GetTppSharecodeEx(GetTppSharecodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTppSharecodeResponse>(DoRequest("1.0", "antchain.ent.tpp.sharecode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对淘票票的获取专属邀请码获取接口
         * Summary: 淘票票专属邀请码获取接口
         */
        public async Task<GetTppSharecodeResponse> GetTppSharecodeExAsync(GetTppSharecodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTppSharecodeResponse>(await DoRequestAsync("1.0", "antchain.ent.tpp.sharecode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对淘票票的查询全部必要信息的接口
         * Summary: 淘票票查询全部必要信息接口
         */
        public QueryTppAllinfoResponse QueryTppAllinfo(QueryTppAllinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTppAllinfoEx(request, headers, runtime);
        }

        /**
         * Description: 针对淘票票的查询全部必要信息的接口
         * Summary: 淘票票查询全部必要信息接口
         */
        public async Task<QueryTppAllinfoResponse> QueryTppAllinfoAsync(QueryTppAllinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTppAllinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 针对淘票票的查询全部必要信息的接口
         * Summary: 淘票票查询全部必要信息接口
         */
        public QueryTppAllinfoResponse QueryTppAllinfoEx(QueryTppAllinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTppAllinfoResponse>(DoRequest("1.0", "antchain.ent.tpp.allinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对淘票票的查询全部必要信息的接口
         * Summary: 淘票票查询全部必要信息接口
         */
        public async Task<QueryTppAllinfoResponse> QueryTppAllinfoExAsync(QueryTppAllinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTppAllinfoResponse>(await DoRequestAsync("1.0", "antchain.ent.tpp.allinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对淘票票的参与信息查询接口
         * Summary: 淘票票参与信息查询接口
         */
        public QueryTppParticipationinfoResponse QueryTppParticipationinfo(QueryTppParticipationinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTppParticipationinfoEx(request, headers, runtime);
        }

        /**
         * Description: 针对淘票票的参与信息查询接口
         * Summary: 淘票票参与信息查询接口
         */
        public async Task<QueryTppParticipationinfoResponse> QueryTppParticipationinfoAsync(QueryTppParticipationinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTppParticipationinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 针对淘票票的参与信息查询接口
         * Summary: 淘票票参与信息查询接口
         */
        public QueryTppParticipationinfoResponse QueryTppParticipationinfoEx(QueryTppParticipationinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTppParticipationinfoResponse>(DoRequest("1.0", "antchain.ent.tpp.participationinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对淘票票的参与信息查询接口
         * Summary: 淘票票参与信息查询接口
         */
        public async Task<QueryTppParticipationinfoResponse> QueryTppParticipationinfoExAsync(QueryTppParticipationinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTppParticipationinfoResponse>(await DoRequestAsync("1.0", "antchain.ent.tpp.participationinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
