// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.BAASPLUS.Models;

namespace AntChain.SDK.BAASPLUS
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
                        {"sdk_version", "1.1.2"},
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
                        {"sdk_version", "1.1.2"},
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
         * Description: 链上交易移动端权限修改
         * Summary: 链上交易移动端权限修改
         */
        public UpdateBmpbrowserPrivilegeResponse UpdateBmpbrowserPrivilege(UpdateBmpbrowserPrivilegeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBmpbrowserPrivilegeEx(request, headers, runtime);
        }

        /**
         * Description: 链上交易移动端权限修改
         * Summary: 链上交易移动端权限修改
         */
        public async Task<UpdateBmpbrowserPrivilegeResponse> UpdateBmpbrowserPrivilegeAsync(UpdateBmpbrowserPrivilegeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBmpbrowserPrivilegeExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上交易移动端权限修改
         * Summary: 链上交易移动端权限修改
         */
        public UpdateBmpbrowserPrivilegeResponse UpdateBmpbrowserPrivilegeEx(UpdateBmpbrowserPrivilegeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBmpbrowserPrivilegeResponse>(DoRequest("1.0", "baas.plus.bmpbrowser.privilege.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上交易移动端权限修改
         * Summary: 链上交易移动端权限修改
         */
        public async Task<UpdateBmpbrowserPrivilegeResponse> UpdateBmpbrowserPrivilegeExAsync(UpdateBmpbrowserPrivilegeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBmpbrowserPrivilegeResponse>(await DoRequestAsync("1.0", "baas.plus.bmpbrowser.privilege.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
         * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
         */
        public QueryIndividualidInternalmaskResponse QueryIndividualidInternalmask(QueryIndividualidInternalmaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndividualidInternalmaskEx(request, headers, runtime);
        }

        /**
         * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
         * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
         */
        public async Task<QueryIndividualidInternalmaskResponse> QueryIndividualidInternalmaskAsync(QueryIndividualidInternalmaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndividualidInternalmaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
         * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
         */
        public QueryIndividualidInternalmaskResponse QueryIndividualidInternalmaskEx(QueryIndividualidInternalmaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidInternalmaskResponse>(DoRequest("1.0", "baas.plus.individualid.internalmask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
         * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
         */
        public async Task<QueryIndividualidInternalmaskResponse> QueryIndividualidInternalmaskExAsync(QueryIndividualidInternalmaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidInternalmaskResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.internalmask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素（数据来自数据枢纽）
         */
        public QueryEnterpriseidInternalfourmetaResponse QueryEnterpriseidInternalfourmeta(QueryEnterpriseidInternalfourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnterpriseidInternalfourmetaEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素（数据来自数据枢纽）
         */
        public async Task<QueryEnterpriseidInternalfourmetaResponse> QueryEnterpriseidInternalfourmetaAsync(QueryEnterpriseidInternalfourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnterpriseidInternalfourmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素（数据来自数据枢纽）
         */
        public QueryEnterpriseidInternalfourmetaResponse QueryEnterpriseidInternalfourmetaEx(QueryEnterpriseidInternalfourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidInternalfourmetaResponse>(DoRequest("1.0", "baas.plus.enterpriseid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素（数据来自数据枢纽）
         */
        public async Task<QueryEnterpriseidInternalfourmetaResponse> QueryEnterpriseidInternalfourmetaExAsync(QueryEnterpriseidInternalfourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidInternalfourmetaResponse>(await DoRequestAsync("1.0", "baas.plus.enterpriseid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素（数据来自数据枢纽）
         */
        public QueryEnterpriseidInternalthreemetaResponse QueryEnterpriseidInternalthreemeta(QueryEnterpriseidInternalthreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnterpriseidInternalthreemetaEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素（数据来自数据枢纽）
         */
        public async Task<QueryEnterpriseidInternalthreemetaResponse> QueryEnterpriseidInternalthreemetaAsync(QueryEnterpriseidInternalthreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnterpriseidInternalthreemetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素（数据来自数据枢纽）
         */
        public QueryEnterpriseidInternalthreemetaResponse QueryEnterpriseidInternalthreemetaEx(QueryEnterpriseidInternalthreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidInternalthreemetaResponse>(DoRequest("1.0", "baas.plus.enterpriseid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素（数据来自数据枢纽）
         */
        public async Task<QueryEnterpriseidInternalthreemetaResponse> QueryEnterpriseidInternalthreemetaExAsync(QueryEnterpriseidInternalthreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidInternalthreemetaResponse>(await DoRequestAsync("1.0", "baas.plus.enterpriseid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素（数据来自数据枢纽）
         */
        public QueryEnterpriseidInternaltwometaResponse QueryEnterpriseidInternaltwometa(QueryEnterpriseidInternaltwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnterpriseidInternaltwometaEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素（数据来自数据枢纽）
         */
        public async Task<QueryEnterpriseidInternaltwometaResponse> QueryEnterpriseidInternaltwometaAsync(QueryEnterpriseidInternaltwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnterpriseidInternaltwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素（数据来自数据枢纽）
         */
        public QueryEnterpriseidInternaltwometaResponse QueryEnterpriseidInternaltwometaEx(QueryEnterpriseidInternaltwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidInternaltwometaResponse>(DoRequest("1.0", "baas.plus.enterpriseid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素（数据来自数据枢纽）
         */
        public async Task<QueryEnterpriseidInternaltwometaResponse> QueryEnterpriseidInternaltwometaExAsync(QueryEnterpriseidInternaltwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidInternaltwometaResponse>(await DoRequestAsync("1.0", "baas.plus.enterpriseid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素-法人实人认证初始化
         * Summary: 企业认证四要素-法人实人认证初始化
         */
        public InitEnterpriseidFaceauthResponse InitEnterpriseidFaceauth(InitEnterpriseidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitEnterpriseidFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素-法人实人认证初始化
         * Summary: 企业认证四要素-法人实人认证初始化
         */
        public async Task<InitEnterpriseidFaceauthResponse> InitEnterpriseidFaceauthAsync(InitEnterpriseidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitEnterpriseidFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素-法人实人认证初始化
         * Summary: 企业认证四要素-法人实人认证初始化
         */
        public InitEnterpriseidFaceauthResponse InitEnterpriseidFaceauthEx(InitEnterpriseidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEnterpriseidFaceauthResponse>(DoRequest("1.0", "baas.plus.enterpriseid.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素-法人实人认证初始化
         * Summary: 企业认证四要素-法人实人认证初始化
         */
        public async Task<InitEnterpriseidFaceauthResponse> InitEnterpriseidFaceauthExAsync(InitEnterpriseidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEnterpriseidFaceauthResponse>(await DoRequestAsync("1.0", "baas.plus.enterpriseid.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业认证四要素—法人实人认证结果
         * Summary: 查询企业认证四要素—法人实人认证结果
         */
        public QueryEnterpriseidFaceauthResponse QueryEnterpriseidFaceauth(QueryEnterpriseidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnterpriseidFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 查询企业认证四要素—法人实人认证结果
         * Summary: 查询企业认证四要素—法人实人认证结果
         */
        public async Task<QueryEnterpriseidFaceauthResponse> QueryEnterpriseidFaceauthAsync(QueryEnterpriseidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnterpriseidFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询企业认证四要素—法人实人认证结果
         * Summary: 查询企业认证四要素—法人实人认证结果
         */
        public QueryEnterpriseidFaceauthResponse QueryEnterpriseidFaceauthEx(QueryEnterpriseidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidFaceauthResponse>(DoRequest("1.0", "baas.plus.enterpriseid.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业认证四要素—法人实人认证结果
         * Summary: 查询企业认证四要素—法人实人认证结果
         */
        public async Task<QueryEnterpriseidFaceauthResponse> QueryEnterpriseidFaceauthExAsync(QueryEnterpriseidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidFaceauthResponse>(await DoRequestAsync("1.0", "baas.plus.enterpriseid.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实名认证四要素
         * Summary: 个人实名认证四要素（数据来自蚁盾）
         */
        public QueryIndividualidInternalfourmetaResponse QueryIndividualidInternalfourmeta(QueryIndividualidInternalfourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndividualidInternalfourmetaEx(request, headers, runtime);
        }

        /**
         * Description: 个人实名认证四要素
         * Summary: 个人实名认证四要素（数据来自蚁盾）
         */
        public async Task<QueryIndividualidInternalfourmetaResponse> QueryIndividualidInternalfourmetaAsync(QueryIndividualidInternalfourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndividualidInternalfourmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实名认证四要素
         * Summary: 个人实名认证四要素（数据来自蚁盾）
         */
        public QueryIndividualidInternalfourmetaResponse QueryIndividualidInternalfourmetaEx(QueryIndividualidInternalfourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidInternalfourmetaResponse>(DoRequest("1.0", "baas.plus.individualid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实名认证四要素
         * Summary: 个人实名认证四要素（数据来自蚁盾）
         */
        public async Task<QueryIndividualidInternalfourmetaResponse> QueryIndividualidInternalfourmetaExAsync(QueryIndividualidInternalfourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidInternalfourmetaResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实名认证三要素
         * Summary: 个人实名认证三要素（数据来自蚁盾）
         */
        public QueryIndividualidInternalthreemetaResponse QueryIndividualidInternalthreemeta(QueryIndividualidInternalthreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndividualidInternalthreemetaEx(request, headers, runtime);
        }

        /**
         * Description: 个人实名认证三要素
         * Summary: 个人实名认证三要素（数据来自蚁盾）
         */
        public async Task<QueryIndividualidInternalthreemetaResponse> QueryIndividualidInternalthreemetaAsync(QueryIndividualidInternalthreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndividualidInternalthreemetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实名认证三要素
         * Summary: 个人实名认证三要素（数据来自蚁盾）
         */
        public QueryIndividualidInternalthreemetaResponse QueryIndividualidInternalthreemetaEx(QueryIndividualidInternalthreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidInternalthreemetaResponse>(DoRequest("1.0", "baas.plus.individualid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实名认证三要素
         * Summary: 个人实名认证三要素（数据来自蚁盾）
         */
        public async Task<QueryIndividualidInternalthreemetaResponse> QueryIndividualidInternalthreemetaExAsync(QueryIndividualidInternalthreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidInternalthreemetaResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实名认证二要素
         * Summary: 个人实名认证二要素
         */
        public QueryIndividualidInternaltwometaResponse QueryIndividualidInternaltwometa(QueryIndividualidInternaltwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndividualidInternaltwometaEx(request, headers, runtime);
        }

        /**
         * Description: 个人实名认证二要素
         * Summary: 个人实名认证二要素
         */
        public async Task<QueryIndividualidInternaltwometaResponse> QueryIndividualidInternaltwometaAsync(QueryIndividualidInternaltwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndividualidInternaltwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实名认证二要素
         * Summary: 个人实名认证二要素
         */
        public QueryIndividualidInternaltwometaResponse QueryIndividualidInternaltwometaEx(QueryIndividualidInternaltwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidInternaltwometaResponse>(DoRequest("1.0", "baas.plus.individualid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实名认证二要素
         * Summary: 个人实名认证二要素
         */
        public async Task<QueryIndividualidInternaltwometaResponse> QueryIndividualidInternaltwometaExAsync(QueryIndividualidInternaltwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidInternaltwometaResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起内容评估（BAI），仅内部调用
         * Summary: 发起内容评估
         */
        public CreateBaicorpInternalevaluationasyncResponse CreateBaicorpInternalevaluationasync(CreateBaicorpInternalevaluationasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaicorpInternalevaluationasyncEx(request, headers, runtime);
        }

        /**
         * Description: 发起内容评估（BAI），仅内部调用
         * Summary: 发起内容评估
         */
        public async Task<CreateBaicorpInternalevaluationasyncResponse> CreateBaicorpInternalevaluationasyncAsync(CreateBaicorpInternalevaluationasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaicorpInternalevaluationasyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起内容评估（BAI），仅内部调用
         * Summary: 发起内容评估
         */
        public CreateBaicorpInternalevaluationasyncResponse CreateBaicorpInternalevaluationasyncEx(CreateBaicorpInternalevaluationasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaicorpInternalevaluationasyncResponse>(DoRequest("1.0", "baas.plus.baicorp.internalevaluationasync.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起内容评估（BAI），仅内部调用
         * Summary: 发起内容评估
         */
        public async Task<CreateBaicorpInternalevaluationasyncResponse> CreateBaicorpInternalevaluationasyncExAsync(CreateBaicorpInternalevaluationasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaicorpInternalevaluationasyncResponse>(await DoRequestAsync("1.0", "baas.plus.baicorp.internalevaluationasync.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交内容监测任务
         * Summary: 提交内容监测任务接口
         */
        public CreateBaicorpInternalmonitorasyncResponse CreateBaicorpInternalmonitorasync(CreateBaicorpInternalmonitorasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaicorpInternalmonitorasyncEx(request, headers, runtime);
        }

        /**
         * Description: 提交内容监测任务
         * Summary: 提交内容监测任务接口
         */
        public async Task<CreateBaicorpInternalmonitorasyncResponse> CreateBaicorpInternalmonitorasyncAsync(CreateBaicorpInternalmonitorasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaicorpInternalmonitorasyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交内容监测任务
         * Summary: 提交内容监测任务接口
         */
        public CreateBaicorpInternalmonitorasyncResponse CreateBaicorpInternalmonitorasyncEx(CreateBaicorpInternalmonitorasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaicorpInternalmonitorasyncResponse>(DoRequest("1.0", "baas.plus.baicorp.internalmonitorasync.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交内容监测任务
         * Summary: 提交内容监测任务接口
         */
        public async Task<CreateBaicorpInternalmonitorasyncResponse> CreateBaicorpInternalmonitorasyncExAsync(CreateBaicorpInternalmonitorasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaicorpInternalmonitorasyncResponse>(await DoRequestAsync("1.0", "baas.plus.baicorp.internalmonitorasync.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询内容评估结果
         * Summary: 查询内容评估结果
         */
        public QueryBaicorpInternalevaluationasyncResponse QueryBaicorpInternalevaluationasync(QueryBaicorpInternalevaluationasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaicorpInternalevaluationasyncEx(request, headers, runtime);
        }

        /**
         * Description: 查询内容评估结果
         * Summary: 查询内容评估结果
         */
        public async Task<QueryBaicorpInternalevaluationasyncResponse> QueryBaicorpInternalevaluationasyncAsync(QueryBaicorpInternalevaluationasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaicorpInternalevaluationasyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询内容评估结果
         * Summary: 查询内容评估结果
         */
        public QueryBaicorpInternalevaluationasyncResponse QueryBaicorpInternalevaluationasyncEx(QueryBaicorpInternalevaluationasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaicorpInternalevaluationasyncResponse>(DoRequest("1.0", "baas.plus.baicorp.internalevaluationasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询内容评估结果
         * Summary: 查询内容评估结果
         */
        public async Task<QueryBaicorpInternalevaluationasyncResponse> QueryBaicorpInternalevaluationasyncExAsync(QueryBaicorpInternalevaluationasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaicorpInternalevaluationasyncResponse>(await DoRequestAsync("1.0", "baas.plus.baicorp.internalevaluationasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询内容监测任务结果
         * Summary: 查询内容监测任务结果
         */
        public QueryBaicorpInternalmonitorasyncResponse QueryBaicorpInternalmonitorasync(QueryBaicorpInternalmonitorasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaicorpInternalmonitorasyncEx(request, headers, runtime);
        }

        /**
         * Description: 查询内容监测任务结果
         * Summary: 查询内容监测任务结果
         */
        public async Task<QueryBaicorpInternalmonitorasyncResponse> QueryBaicorpInternalmonitorasyncAsync(QueryBaicorpInternalmonitorasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaicorpInternalmonitorasyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询内容监测任务结果
         * Summary: 查询内容监测任务结果
         */
        public QueryBaicorpInternalmonitorasyncResponse QueryBaicorpInternalmonitorasyncEx(QueryBaicorpInternalmonitorasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaicorpInternalmonitorasyncResponse>(DoRequest("1.0", "baas.plus.baicorp.internalmonitorasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询内容监测任务结果
         * Summary: 查询内容监测任务结果
         */
        public async Task<QueryBaicorpInternalmonitorasyncResponse> QueryBaicorpInternalmonitorasyncExAsync(QueryBaicorpInternalmonitorasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaicorpInternalmonitorasyncResponse>(await DoRequestAsync("1.0", "baas.plus.baicorp.internalmonitorasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素-法人实人认证开始
         * Summary: 企业认证四要素-法人实人认证开始
         */
        public CertifyEnterpriseidFaceauthResponse CertifyEnterpriseidFaceauth(CertifyEnterpriseidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyEnterpriseidFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素-法人实人认证开始
         * Summary: 企业认证四要素-法人实人认证开始
         */
        public async Task<CertifyEnterpriseidFaceauthResponse> CertifyEnterpriseidFaceauthAsync(CertifyEnterpriseidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyEnterpriseidFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素-法人实人认证开始
         * Summary: 企业认证四要素-法人实人认证开始
         */
        public CertifyEnterpriseidFaceauthResponse CertifyEnterpriseidFaceauthEx(CertifyEnterpriseidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyEnterpriseidFaceauthResponse>(DoRequest("1.0", "baas.plus.enterpriseid.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素-法人实人认证开始
         * Summary: 企业认证四要素-法人实人认证开始
         */
        public async Task<CertifyEnterpriseidFaceauthResponse> CertifyEnterpriseidFaceauthExAsync(CertifyEnterpriseidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyEnterpriseidFaceauthResponse>(await DoRequestAsync("1.0", "baas.plus.enterpriseid.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证——认证初始化
         * Summary: 个人实人刷脸认证-认证初始化
         */
        public InitIndividualidFaceauthResponse InitIndividualidFaceauth(InitIndividualidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitIndividualidFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证——认证初始化
         * Summary: 个人实人刷脸认证-认证初始化
         */
        public async Task<InitIndividualidFaceauthResponse> InitIndividualidFaceauthAsync(InitIndividualidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitIndividualidFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证——认证初始化
         * Summary: 个人实人刷脸认证-认证初始化
         */
        public InitIndividualidFaceauthResponse InitIndividualidFaceauthEx(InitIndividualidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIndividualidFaceauthResponse>(DoRequest("1.0", "baas.plus.individualid.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证——认证初始化
         * Summary: 个人实人刷脸认证-认证初始化
         */
        public async Task<InitIndividualidFaceauthResponse> InitIndividualidFaceauthExAsync(InitIndividualidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIndividualidFaceauthResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证——认证开始
         * Summary: 个人实人刷脸认证-认证开始
         */
        public CertifyIndividualidFaceauthResponse CertifyIndividualidFaceauth(CertifyIndividualidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyIndividualidFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证——认证开始
         * Summary: 个人实人刷脸认证-认证开始
         */
        public async Task<CertifyIndividualidFaceauthResponse> CertifyIndividualidFaceauthAsync(CertifyIndividualidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyIndividualidFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证——认证开始
         * Summary: 个人实人刷脸认证-认证开始
         */
        public CertifyIndividualidFaceauthResponse CertifyIndividualidFaceauthEx(CertifyIndividualidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIndividualidFaceauthResponse>(DoRequest("1.0", "baas.plus.individualid.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证——认证开始
         * Summary: 个人实人刷脸认证-认证开始
         */
        public async Task<CertifyIndividualidFaceauthResponse> CertifyIndividualidFaceauthExAsync(CertifyIndividualidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIndividualidFaceauthResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证——查询认证结果
         * Summary: 个人实人刷脸认证-查询认证结果
         */
        public QueryIndividualidFaceauthResponse QueryIndividualidFaceauth(QueryIndividualidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndividualidFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证——查询认证结果
         * Summary: 个人实人刷脸认证-查询认证结果
         */
        public async Task<QueryIndividualidFaceauthResponse> QueryIndividualidFaceauthAsync(QueryIndividualidFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndividualidFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证——查询认证结果
         * Summary: 个人实人刷脸认证-查询认证结果
         */
        public QueryIndividualidFaceauthResponse QueryIndividualidFaceauthEx(QueryIndividualidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidFaceauthResponse>(DoRequest("1.0", "baas.plus.individualid.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证——查询认证结果
         * Summary: 个人实人刷脸认证-查询认证结果
         */
        public async Task<QueryIndividualidFaceauthResponse> QueryIndividualidFaceauthExAsync(QueryIndividualidFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidFaceauthResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取区块链当前块高
         * Summary: 区块链数据服务-获取区块链当前块高
         */
        public GetDataserviceBlockchainheightResponse GetDataserviceBlockchainheight(GetDataserviceBlockchainheightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDataserviceBlockchainheightEx(request, headers, runtime);
        }

        /**
         * Description: 获取区块链当前块高
         * Summary: 区块链数据服务-获取区块链当前块高
         */
        public async Task<GetDataserviceBlockchainheightResponse> GetDataserviceBlockchainheightAsync(GetDataserviceBlockchainheightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDataserviceBlockchainheightExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取区块链当前块高
         * Summary: 区块链数据服务-获取区块链当前块高
         */
        public GetDataserviceBlockchainheightResponse GetDataserviceBlockchainheightEx(GetDataserviceBlockchainheightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataserviceBlockchainheightResponse>(DoRequest("1.0", "baas.plus.dataservice.blockchainheight.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取区块链当前块高
         * Summary: 区块链数据服务-获取区块链当前块高
         */
        public async Task<GetDataserviceBlockchainheightResponse> GetDataserviceBlockchainheightExAsync(GetDataserviceBlockchainheightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataserviceBlockchainheightResponse>(await DoRequestAsync("1.0", "baas.plus.dataservice.blockchainheight.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链交易总数
         * Summary: 区块链数据服务-获取链交易总数
         */
        public GetDataserviceTransactioncountResponse GetDataserviceTransactioncount(GetDataserviceTransactioncountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDataserviceTransactioncountEx(request, headers, runtime);
        }

        /**
         * Description: 获取链交易总数
         * Summary: 区块链数据服务-获取链交易总数
         */
        public async Task<GetDataserviceTransactioncountResponse> GetDataserviceTransactioncountAsync(GetDataserviceTransactioncountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDataserviceTransactioncountExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取链交易总数
         * Summary: 区块链数据服务-获取链交易总数
         */
        public GetDataserviceTransactioncountResponse GetDataserviceTransactioncountEx(GetDataserviceTransactioncountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataserviceTransactioncountResponse>(DoRequest("1.0", "baas.plus.dataservice.transactioncount.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链交易总数
         * Summary: 区块链数据服务-获取链交易总数
         */
        public async Task<GetDataserviceTransactioncountResponse> GetDataserviceTransactioncountExAsync(GetDataserviceTransactioncountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataserviceTransactioncountResponse>(await DoRequestAsync("1.0", "baas.plus.dataservice.transactioncount.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据交易hash获取交易详情
         * Summary: 区块链数据服务-获取交易详情
         */
        public GetDataserviceTransactioninfoResponse GetDataserviceTransactioninfo(GetDataserviceTransactioninfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDataserviceTransactioninfoEx(request, headers, runtime);
        }

        /**
         * Description: 根据交易hash获取交易详情
         * Summary: 区块链数据服务-获取交易详情
         */
        public async Task<GetDataserviceTransactioninfoResponse> GetDataserviceTransactioninfoAsync(GetDataserviceTransactioninfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDataserviceTransactioninfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据交易hash获取交易详情
         * Summary: 区块链数据服务-获取交易详情
         */
        public GetDataserviceTransactioninfoResponse GetDataserviceTransactioninfoEx(GetDataserviceTransactioninfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataserviceTransactioninfoResponse>(DoRequest("1.0", "baas.plus.dataservice.transactioninfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据交易hash获取交易详情
         * Summary: 区块链数据服务-获取交易详情
         */
        public async Task<GetDataserviceTransactioninfoResponse> GetDataserviceTransactioninfoExAsync(GetDataserviceTransactioninfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataserviceTransactioninfoResponse>(await DoRequestAsync("1.0", "baas.plus.dataservice.transactioninfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链最近n条块信息
         * Summary: 区块链数据服务-获取链最近n条块信息
         */
        public ListDataserviceLastblocksResponse ListDataserviceLastblocks(ListDataserviceLastblocksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDataserviceLastblocksEx(request, headers, runtime);
        }

        /**
         * Description: 获取链最近n条块信息
         * Summary: 区块链数据服务-获取链最近n条块信息
         */
        public async Task<ListDataserviceLastblocksResponse> ListDataserviceLastblocksAsync(ListDataserviceLastblocksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDataserviceLastblocksExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取链最近n条块信息
         * Summary: 区块链数据服务-获取链最近n条块信息
         */
        public ListDataserviceLastblocksResponse ListDataserviceLastblocksEx(ListDataserviceLastblocksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDataserviceLastblocksResponse>(DoRequest("1.0", "baas.plus.dataservice.lastblocks.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链最近n条块信息
         * Summary: 区块链数据服务-获取链最近n条块信息
         */
        public async Task<ListDataserviceLastblocksResponse> ListDataserviceLastblocksExAsync(ListDataserviceLastblocksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDataserviceLastblocksResponse>(await DoRequestAsync("1.0", "baas.plus.dataservice.lastblocks.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信时间服务——获取时间凭证
         * Summary: 可信时间凭证服务-获取时间凭证
         */
        public GetTasAttestationResponse GetTasAttestation(GetTasAttestationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTasAttestationEx(request, headers, runtime);
        }

        /**
         * Description: 可信时间服务——获取时间凭证
         * Summary: 可信时间凭证服务-获取时间凭证
         */
        public async Task<GetTasAttestationResponse> GetTasAttestationAsync(GetTasAttestationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTasAttestationExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信时间服务——获取时间凭证
         * Summary: 可信时间凭证服务-获取时间凭证
         */
        public GetTasAttestationResponse GetTasAttestationEx(GetTasAttestationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTasAttestationResponse>(DoRequest("1.0", "baas.plus.tas.attestation.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信时间服务——获取时间凭证
         * Summary: 可信时间凭证服务-获取时间凭证
         */
        public async Task<GetTasAttestationResponse> GetTasAttestationExAsync(GetTasAttestationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTasAttestationResponse>(await DoRequestAsync("1.0", "baas.plus.tas.attestation.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信时间 ——校验时间凭证接口
         * Summary: 可信时间凭证服务-校验时间凭证接口
         */
        public VerifyTasCtsrResponse VerifyTasCtsr(VerifyTasCtsrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyTasCtsrEx(request, headers, runtime);
        }

        /**
         * Description: 可信时间 ——校验时间凭证接口
         * Summary: 可信时间凭证服务-校验时间凭证接口
         */
        public async Task<VerifyTasCtsrResponse> VerifyTasCtsrAsync(VerifyTasCtsrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyTasCtsrExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信时间 ——校验时间凭证接口
         * Summary: 可信时间凭证服务-校验时间凭证接口
         */
        public VerifyTasCtsrResponse VerifyTasCtsrEx(VerifyTasCtsrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyTasCtsrResponse>(DoRequest("1.0", "baas.plus.tas.ctsr.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信时间 ——校验时间凭证接口
         * Summary: 可信时间凭证服务-校验时间凭证接口
         */
        public async Task<VerifyTasCtsrResponse> VerifyTasCtsrExAsync(VerifyTasCtsrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyTasCtsrResponse>(await DoRequestAsync("1.0", "baas.plus.tas.ctsr.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过sn下载时间凭证证书（pdf格式）
         * Summary: 可信时间凭证服务-下载时间凭证证书
         */
        public GetTasCertificateResponse GetTasCertificate(GetTasCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTasCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 通过sn下载时间凭证证书（pdf格式）
         * Summary: 可信时间凭证服务-下载时间凭证证书
         */
        public async Task<GetTasCertificateResponse> GetTasCertificateAsync(GetTasCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTasCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过sn下载时间凭证证书（pdf格式）
         * Summary: 可信时间凭证服务-下载时间凭证证书
         */
        public GetTasCertificateResponse GetTasCertificateEx(GetTasCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTasCertificateResponse>(DoRequest("1.0", "baas.plus.tas.certificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过sn下载时间凭证证书（pdf格式）
         * Summary: 可信时间凭证服务-下载时间凭证证书
         */
        public async Task<GetTasCertificateResponse> GetTasCertificateExAsync(GetTasCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTasCertificateResponse>(await DoRequestAsync("1.0", "baas.plus.tas.certificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信时间——获取带事务的时间凭证
         * Summary: 可信时间——获取带事务的时间凭证
         */
        public GetTasTransactionattestationResponse GetTasTransactionattestation(GetTasTransactionattestationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTasTransactionattestationEx(request, headers, runtime);
        }

        /**
         * Description: 可信时间——获取带事务的时间凭证
         * Summary: 可信时间——获取带事务的时间凭证
         */
        public async Task<GetTasTransactionattestationResponse> GetTasTransactionattestationAsync(GetTasTransactionattestationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTasTransactionattestationExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信时间——获取带事务的时间凭证
         * Summary: 可信时间——获取带事务的时间凭证
         */
        public GetTasTransactionattestationResponse GetTasTransactionattestationEx(GetTasTransactionattestationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTasTransactionattestationResponse>(DoRequest("1.0", "baas.plus.tas.transactionattestation.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信时间——获取带事务的时间凭证
         * Summary: 可信时间——获取带事务的时间凭证
         */
        public async Task<GetTasTransactionattestationResponse> GetTasTransactionattestationExAsync(GetTasTransactionattestationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTasTransactionattestationResponse>(await DoRequestAsync("1.0", "baas.plus.tas.transactionattestation.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素
         */
        public QueryEverifyFourmetaResponse QueryEverifyFourmeta(QueryEverifyFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEverifyFourmetaEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素
         */
        public async Task<QueryEverifyFourmetaResponse> QueryEverifyFourmetaAsync(QueryEverifyFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEverifyFourmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素
         */
        public QueryEverifyFourmetaResponse QueryEverifyFourmetaEx(QueryEverifyFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyFourmetaResponse>(DoRequest("1.0", "baas.plus.everify.fourmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素
         */
        public async Task<QueryEverifyFourmetaResponse> QueryEverifyFourmetaExAsync(QueryEverifyFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyFourmetaResponse>(await DoRequestAsync("1.0", "baas.plus.everify.fourmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素
         */
        public QueryEverifyThreemetaResponse QueryEverifyThreemeta(QueryEverifyThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEverifyThreemetaEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素
         */
        public async Task<QueryEverifyThreemetaResponse> QueryEverifyThreemetaAsync(QueryEverifyThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEverifyThreemetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素
         */
        public QueryEverifyThreemetaResponse QueryEverifyThreemetaEx(QueryEverifyThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyThreemetaResponse>(DoRequest("1.0", "baas.plus.everify.threemeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素
         */
        public async Task<QueryEverifyThreemetaResponse> QueryEverifyThreemetaExAsync(QueryEverifyThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyThreemetaResponse>(await DoRequestAsync("1.0", "baas.plus.everify.threemeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素
         */
        public QueryEverifyTwometaResponse QueryEverifyTwometa(QueryEverifyTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEverifyTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素
         */
        public async Task<QueryEverifyTwometaResponse> QueryEverifyTwometaAsync(QueryEverifyTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEverifyTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素
         */
        public QueryEverifyTwometaResponse QueryEverifyTwometaEx(QueryEverifyTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyTwometaResponse>(DoRequest("1.0", "baas.plus.everify.twometa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素
         */
        public async Task<QueryEverifyTwometaResponse> QueryEverifyTwometaExAsync(QueryEverifyTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyTwometaResponse>(await DoRequestAsync("1.0", "baas.plus.everify.twometa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容搜索查询接口
         * Summary: 内容搜索查询接口
         */
        public QueryBaicorpInternalsearchlibraryResponse QueryBaicorpInternalsearchlibrary(QueryBaicorpInternalsearchlibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaicorpInternalsearchlibraryEx(request, headers, runtime);
        }

        /**
         * Description: 内容搜索查询接口
         * Summary: 内容搜索查询接口
         */
        public async Task<QueryBaicorpInternalsearchlibraryResponse> QueryBaicorpInternalsearchlibraryAsync(QueryBaicorpInternalsearchlibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaicorpInternalsearchlibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: 内容搜索查询接口
         * Summary: 内容搜索查询接口
         */
        public QueryBaicorpInternalsearchlibraryResponse QueryBaicorpInternalsearchlibraryEx(QueryBaicorpInternalsearchlibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaicorpInternalsearchlibraryResponse>(DoRequest("1.0", "baas.plus.baicorp.internalsearchlibrary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容搜索查询接口
         * Summary: 内容搜索查询接口
         */
        public async Task<QueryBaicorpInternalsearchlibraryResponse> QueryBaicorpInternalsearchlibraryExAsync(QueryBaicorpInternalsearchlibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaicorpInternalsearchlibraryResponse>(await DoRequestAsync("1.0", "baas.plus.baicorp.internalsearchlibrary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新检索
         * Summary: 更新检索
         */
        public UpdateBaicorpInternalsearchlibraryResponse UpdateBaicorpInternalsearchlibrary(UpdateBaicorpInternalsearchlibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBaicorpInternalsearchlibraryEx(request, headers, runtime);
        }

        /**
         * Description: 更新检索
         * Summary: 更新检索
         */
        public async Task<UpdateBaicorpInternalsearchlibraryResponse> UpdateBaicorpInternalsearchlibraryAsync(UpdateBaicorpInternalsearchlibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBaicorpInternalsearchlibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新检索
         * Summary: 更新检索
         */
        public UpdateBaicorpInternalsearchlibraryResponse UpdateBaicorpInternalsearchlibraryEx(UpdateBaicorpInternalsearchlibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaicorpInternalsearchlibraryResponse>(DoRequest("1.0", "baas.plus.baicorp.internalsearchlibrary.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新检索
         * Summary: 更新检索
         */
        public async Task<UpdateBaicorpInternalsearchlibraryResponse> UpdateBaicorpInternalsearchlibraryExAsync(UpdateBaicorpInternalsearchlibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaicorpInternalsearchlibraryResponse>(await DoRequestAsync("1.0", "baas.plus.baicorp.internalsearchlibrary.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对公打款-总行查询
         * Summary: 对公打款-总行查询
         */
        public QueryEpayauthRootbankResponse QueryEpayauthRootbank(QueryEpayauthRootbankRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEpayauthRootbankEx(request, headers, runtime);
        }

        /**
         * Description: 对公打款-总行查询
         * Summary: 对公打款-总行查询
         */
        public async Task<QueryEpayauthRootbankResponse> QueryEpayauthRootbankAsync(QueryEpayauthRootbankRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEpayauthRootbankExAsync(request, headers, runtime);
        }

        /**
         * Description: 对公打款-总行查询
         * Summary: 对公打款-总行查询
         */
        public QueryEpayauthRootbankResponse QueryEpayauthRootbankEx(QueryEpayauthRootbankRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEpayauthRootbankResponse>(DoRequest("1.0", "baas.plus.epayauth.rootbank.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对公打款-总行查询
         * Summary: 对公打款-总行查询
         */
        public async Task<QueryEpayauthRootbankResponse> QueryEpayauthRootbankExAsync(QueryEpayauthRootbankRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEpayauthRootbankResponse>(await DoRequestAsync("1.0", "baas.plus.epayauth.rootbank.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
         * Summary: 业务申请保护
         */
        public QueryYdapplyprotEcapplyResponse QueryYdapplyprotEcapply(QueryYdapplyprotEcapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryYdapplyprotEcapplyEx(request, headers, runtime);
        }

        /**
         * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
         * Summary: 业务申请保护
         */
        public async Task<QueryYdapplyprotEcapplyResponse> QueryYdapplyprotEcapplyAsync(QueryYdapplyprotEcapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryYdapplyprotEcapplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
         * Summary: 业务申请保护
         */
        public QueryYdapplyprotEcapplyResponse QueryYdapplyprotEcapplyEx(QueryYdapplyprotEcapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdapplyprotEcapplyResponse>(DoRequest("1.0", "baas.plus.ydapplyprot.ecapply.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
         * Summary: 业务申请保护
         */
        public async Task<QueryYdapplyprotEcapplyResponse> QueryYdapplyprotEcapplyExAsync(QueryYdapplyprotEcapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdapplyprotEcapplyResponse>(await DoRequestAsync("1.0", "baas.plus.ydapplyprot.ecapply.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
         * Summary: 先享后付保护
         */
        public QueryYdpacprotEcpacResponse QueryYdpacprotEcpac(QueryYdpacprotEcpacRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryYdpacprotEcpacEx(request, headers, runtime);
        }

        /**
         * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
         * Summary: 先享后付保护
         */
        public async Task<QueryYdpacprotEcpacResponse> QueryYdpacprotEcpacAsync(QueryYdpacprotEcpacRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryYdpacprotEcpacExAsync(request, headers, runtime);
        }

        /**
         * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
         * Summary: 先享后付保护
         */
        public QueryYdpacprotEcpacResponse QueryYdpacprotEcpacEx(QueryYdpacprotEcpacRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdpacprotEcpacResponse>(DoRequest("1.0", "baas.plus.ydpacprot.ecpac.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
         * Summary: 先享后付保护
         */
        public async Task<QueryYdpacprotEcpacResponse> QueryYdpacprotEcpacExAsync(QueryYdpacprotEcpacRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdpacprotEcpacResponse>(await DoRequestAsync("1.0", "baas.plus.ydpacprot.ecpac.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public QueryYdauthprotTwometaResponse QueryYdauthprotTwometa(QueryYdauthprotTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryYdauthprotTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public async Task<QueryYdauthprotTwometaResponse> QueryYdauthprotTwometaAsync(QueryYdauthprotTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryYdauthprotTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public QueryYdauthprotTwometaResponse QueryYdauthprotTwometaEx(QueryYdauthprotTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdauthprotTwometaResponse>(DoRequest("1.0", "baas.plus.ydauthprot.twometa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public async Task<QueryYdauthprotTwometaResponse> QueryYdauthprotTwometaExAsync(QueryYdauthprotTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdauthprotTwometaResponse>(await DoRequestAsync("1.0", "baas.plus.ydauthprot.twometa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public QueryYdauthprotThreemetaResponse QueryYdauthprotThreemeta(QueryYdauthprotThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryYdauthprotThreemetaEx(request, headers, runtime);
        }

        /**
         * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public async Task<QueryYdauthprotThreemetaResponse> QueryYdauthprotThreemetaAsync(QueryYdauthprotThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryYdauthprotThreemetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public QueryYdauthprotThreemetaResponse QueryYdauthprotThreemetaEx(QueryYdauthprotThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdauthprotThreemetaResponse>(DoRequest("1.0", "baas.plus.ydauthprot.threemeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public async Task<QueryYdauthprotThreemetaResponse> QueryYdauthprotThreemetaExAsync(QueryYdauthprotThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdauthprotThreemetaResponse>(await DoRequestAsync("1.0", "baas.plus.ydauthprot.threemeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public QueryYdauthprotFourmetaResponse QueryYdauthprotFourmeta(QueryYdauthprotFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryYdauthprotFourmetaEx(request, headers, runtime);
        }

        /**
         * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public async Task<QueryYdauthprotFourmetaResponse> QueryYdauthprotFourmetaAsync(QueryYdauthprotFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryYdauthprotFourmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public QueryYdauthprotFourmetaResponse QueryYdauthprotFourmetaEx(QueryYdauthprotFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdauthprotFourmetaResponse>(DoRequest("1.0", "baas.plus.ydauthprot.fourmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
         * Summary: 身份认证保护
         */
        public async Task<QueryYdauthprotFourmetaResponse> QueryYdauthprotFourmetaExAsync(QueryYdauthprotFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdauthprotFourmetaResponse>(await DoRequestAsync("1.0", "baas.plus.ydauthprot.fourmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销保护
         * Summary: 营销保护
         */
        public QueryYdmktprotEcmarketcampaignResponse QueryYdmktprotEcmarketcampaign(QueryYdmktprotEcmarketcampaignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryYdmktprotEcmarketcampaignEx(request, headers, runtime);
        }

        /**
         * Description: 营销保护
         * Summary: 营销保护
         */
        public async Task<QueryYdmktprotEcmarketcampaignResponse> QueryYdmktprotEcmarketcampaignAsync(QueryYdmktprotEcmarketcampaignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryYdmktprotEcmarketcampaignExAsync(request, headers, runtime);
        }

        /**
         * Description: 营销保护
         * Summary: 营销保护
         */
        public QueryYdmktprotEcmarketcampaignResponse QueryYdmktprotEcmarketcampaignEx(QueryYdmktprotEcmarketcampaignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdmktprotEcmarketcampaignResponse>(DoRequest("1.0", "baas.plus.ydmktprot.ecmarketcampaign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 营销保护
         * Summary: 营销保护
         */
        public async Task<QueryYdmktprotEcmarketcampaignResponse> QueryYdmktprotEcmarketcampaignExAsync(QueryYdmktprotEcmarketcampaignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdmktprotEcmarketcampaignResponse>(await DoRequestAsync("1.0", "baas.plus.ydmktprot.ecmarketcampaign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册保护
         * Summary: 注册保护
         */
        public QueryYdregprotEcregisterResponse QueryYdregprotEcregister(QueryYdregprotEcregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryYdregprotEcregisterEx(request, headers, runtime);
        }

        /**
         * Description: 注册保护
         * Summary: 注册保护
         */
        public async Task<QueryYdregprotEcregisterResponse> QueryYdregprotEcregisterAsync(QueryYdregprotEcregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryYdregprotEcregisterExAsync(request, headers, runtime);
        }

        /**
         * Description: 注册保护
         * Summary: 注册保护
         */
        public QueryYdregprotEcregisterResponse QueryYdregprotEcregisterEx(QueryYdregprotEcregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdregprotEcregisterResponse>(DoRequest("1.0", "baas.plus.ydregprot.ecregister.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册保护
         * Summary: 注册保护
         */
        public async Task<QueryYdregprotEcregisterResponse> QueryYdregprotEcregisterExAsync(QueryYdregprotEcregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYdregprotEcregisterResponse>(await DoRequestAsync("1.0", "baas.plus.ydregprot.ecregister.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
         * Summary: 支行查询
         */
        public QueryEpayauthBranchbankResponse QueryEpayauthBranchbank(QueryEpayauthBranchbankRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEpayauthBranchbankEx(request, headers, runtime);
        }

        /**
         * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
         * Summary: 支行查询
         */
        public async Task<QueryEpayauthBranchbankResponse> QueryEpayauthBranchbankAsync(QueryEpayauthBranchbankRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEpayauthBranchbankExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
         * Summary: 支行查询
         */
        public QueryEpayauthBranchbankResponse QueryEpayauthBranchbankEx(QueryEpayauthBranchbankRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEpayauthBranchbankResponse>(DoRequest("1.0", "baas.plus.epayauth.branchbank.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
         * Summary: 支行查询
         */
        public async Task<QueryEpayauthBranchbankResponse> QueryEpayauthBranchbankExAsync(QueryEpayauthBranchbankRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEpayauthBranchbankResponse>(await DoRequestAsync("1.0", "baas.plus.epayauth.branchbank.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
         * Summary: 行政地区编码查询
         */
        public QueryEpayauthDistrictResponse QueryEpayauthDistrict(QueryEpayauthDistrictRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEpayauthDistrictEx(request, headers, runtime);
        }

        /**
         * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
         * Summary: 行政地区编码查询
         */
        public async Task<QueryEpayauthDistrictResponse> QueryEpayauthDistrictAsync(QueryEpayauthDistrictRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEpayauthDistrictExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
         * Summary: 行政地区编码查询
         */
        public QueryEpayauthDistrictResponse QueryEpayauthDistrictEx(QueryEpayauthDistrictRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEpayauthDistrictResponse>(DoRequest("1.0", "baas.plus.epayauth.district.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
         * Summary: 行政地区编码查询
         */
        public async Task<QueryEpayauthDistrictResponse> QueryEpayauthDistrictExAsync(QueryEpayauthDistrictRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEpayauthDistrictResponse>(await DoRequestAsync("1.0", "baas.plus.epayauth.district.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
         * Summary: 发起打款验证申请
         */
        public InitEpayauthVerifyResponse InitEpayauthVerify(InitEpayauthVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitEpayauthVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
         * Summary: 发起打款验证申请
         */
        public async Task<InitEpayauthVerifyResponse> InitEpayauthVerifyAsync(InitEpayauthVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitEpayauthVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
         * Summary: 发起打款验证申请
         */
        public InitEpayauthVerifyResponse InitEpayauthVerifyEx(InitEpayauthVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEpayauthVerifyResponse>(DoRequest("1.0", "baas.plus.epayauth.verify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
         * Summary: 发起打款验证申请
         */
        public async Task<InitEpayauthVerifyResponse> InitEpayauthVerifyExAsync(InitEpayauthVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEpayauthVerifyResponse>(await DoRequestAsync("1.0", "baas.plus.epayauth.verify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
         * Summary: 打款验证金额校验
         */
        public QueryEpayauthVerifyResponse QueryEpayauthVerify(QueryEpayauthVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEpayauthVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
         * Summary: 打款验证金额校验
         */
        public async Task<QueryEpayauthVerifyResponse> QueryEpayauthVerifyAsync(QueryEpayauthVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEpayauthVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
         * Summary: 打款验证金额校验
         */
        public QueryEpayauthVerifyResponse QueryEpayauthVerifyEx(QueryEpayauthVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEpayauthVerifyResponse>(DoRequest("1.0", "baas.plus.epayauth.verify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
         * Summary: 打款验证金额校验
         */
        public async Task<QueryEpayauthVerifyResponse> QueryEpayauthVerifyExAsync(QueryEpayauthVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEpayauthVerifyResponse>(await DoRequestAsync("1.0", "baas.plus.epayauth.verify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
         * Summary: 链上交易二维码生成
         */
        public QueryBmpbrowserTransactionqrcodeResponse QueryBmpbrowserTransactionqrcode(QueryBmpbrowserTransactionqrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBmpbrowserTransactionqrcodeEx(request, headers, runtime);
        }

        /**
         * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
         * Summary: 链上交易二维码生成
         */
        public async Task<QueryBmpbrowserTransactionqrcodeResponse> QueryBmpbrowserTransactionqrcodeAsync(QueryBmpbrowserTransactionqrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBmpbrowserTransactionqrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
         * Summary: 链上交易二维码生成
         */
        public QueryBmpbrowserTransactionqrcodeResponse QueryBmpbrowserTransactionqrcodeEx(QueryBmpbrowserTransactionqrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBmpbrowserTransactionqrcodeResponse>(DoRequest("1.0", "baas.plus.bmpbrowser.transactionqrcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
         * Summary: 链上交易二维码生成
         */
        public async Task<QueryBmpbrowserTransactionqrcodeResponse> QueryBmpbrowserTransactionqrcodeExAsync(QueryBmpbrowserTransactionqrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBmpbrowserTransactionqrcodeResponse>(await DoRequestAsync("1.0", "baas.plus.bmpbrowser.transactionqrcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
         * Summary: 批量开通 链上交易移动端查看权限
         */
        public AddBmpbrowserPrivilegeResponse AddBmpbrowserPrivilege(AddBmpbrowserPrivilegeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddBmpbrowserPrivilegeEx(request, headers, runtime);
        }

        /**
         * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
         * Summary: 批量开通 链上交易移动端查看权限
         */
        public async Task<AddBmpbrowserPrivilegeResponse> AddBmpbrowserPrivilegeAsync(AddBmpbrowserPrivilegeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddBmpbrowserPrivilegeExAsync(request, headers, runtime);
        }

        /**
         * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
         * Summary: 批量开通 链上交易移动端查看权限
         */
        public AddBmpbrowserPrivilegeResponse AddBmpbrowserPrivilegeEx(AddBmpbrowserPrivilegeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBmpbrowserPrivilegeResponse>(DoRequest("1.0", "baas.plus.bmpbrowser.privilege.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
         * Summary: 批量开通 链上交易移动端查看权限
         */
        public async Task<AddBmpbrowserPrivilegeResponse> AddBmpbrowserPrivilegeExAsync(AddBmpbrowserPrivilegeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBmpbrowserPrivilegeResponse>(await DoRequestAsync("1.0", "baas.plus.bmpbrowser.privilege.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份证信息识别
         * Summary: 身份证信息识别
         */
        public QueryIdcocrIdcardResponse QueryIdcocrIdcard(QueryIdcocrIdcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIdcocrIdcardEx(request, headers, runtime);
        }

        /**
         * Description: 身份证信息识别
         * Summary: 身份证信息识别
         */
        public async Task<QueryIdcocrIdcardResponse> QueryIdcocrIdcardAsync(QueryIdcocrIdcardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIdcocrIdcardExAsync(request, headers, runtime);
        }

        /**
         * Description: 身份证信息识别
         * Summary: 身份证信息识别
         */
        public QueryIdcocrIdcardResponse QueryIdcocrIdcardEx(QueryIdcocrIdcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIdcocrIdcardResponse>(DoRequest("1.0", "baas.plus.idcocr.idcard.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份证信息识别
         * Summary: 身份证信息识别
         */
        public async Task<QueryIdcocrIdcardResponse> QueryIdcocrIdcardExAsync(QueryIdcocrIdcardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIdcocrIdcardResponse>(await DoRequestAsync("1.0", "baas.plus.idcocr.idcard.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请证书
         * Summary: 申请证书
         */
        public InitCaCertificateResponse InitCaCertificate(InitCaCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitCaCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 申请证书
         * Summary: 申请证书
         */
        public async Task<InitCaCertificateResponse> InitCaCertificateAsync(InitCaCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitCaCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 申请证书
         * Summary: 申请证书
         */
        public InitCaCertificateResponse InitCaCertificateEx(InitCaCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCaCertificateResponse>(DoRequest("1.0", "baas.plus.ca.certificate.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请证书
         * Summary: 申请证书
         */
        public async Task<InitCaCertificateResponse> InitCaCertificateExAsync(InitCaCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCaCertificateResponse>(await DoRequestAsync("1.0", "baas.plus.ca.certificate.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
         * Summary: 内容风险识别接口服务
         */
        public InitContentriskInternalResponse InitContentriskInternal(InitContentriskInternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitContentriskInternalEx(request, headers, runtime);
        }

        /**
         * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
         * Summary: 内容风险识别接口服务
         */
        public async Task<InitContentriskInternalResponse> InitContentriskInternalAsync(InitContentriskInternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitContentriskInternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
         * Summary: 内容风险识别接口服务
         */
        public InitContentriskInternalResponse InitContentriskInternalEx(InitContentriskInternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitContentriskInternalResponse>(DoRequest("1.0", "baas.plus.contentrisk.internal.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
         * Summary: 内容风险识别接口服务
         */
        public async Task<InitContentriskInternalResponse> InitContentriskInternalExAsync(InitContentriskInternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitContentriskInternalResponse>(await DoRequestAsync("1.0", "baas.plus.contentrisk.internal.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
         * Summary: 内容风险识别结果查询接口服务
         */
        public QueryContentriskInternalResponse QueryContentriskInternal(QueryContentriskInternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContentriskInternalEx(request, headers, runtime);
        }

        /**
         * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
         * Summary: 内容风险识别结果查询接口服务
         */
        public async Task<QueryContentriskInternalResponse> QueryContentriskInternalAsync(QueryContentriskInternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContentriskInternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
         * Summary: 内容风险识别结果查询接口服务
         */
        public QueryContentriskInternalResponse QueryContentriskInternalEx(QueryContentriskInternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentriskInternalResponse>(DoRequest("1.0", "baas.plus.contentrisk.internal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
         * Summary: 内容风险识别结果查询接口服务
         */
        public async Task<QueryContentriskInternalResponse> QueryContentriskInternalExAsync(QueryContentriskInternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContentriskInternalResponse>(await DoRequestAsync("1.0", "baas.plus.contentrisk.internal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人认证服务端比对-认证开始
         * Summary: 个人实人认证服务端比对-认证开始
         */
        public InitIndividualidImageauthResponse InitIndividualidImageauth(InitIndividualidImageauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitIndividualidImageauthEx(request, headers, runtime);
        }

        /**
         * Description: 个人实人认证服务端比对-认证开始
         * Summary: 个人实人认证服务端比对-认证开始
         */
        public async Task<InitIndividualidImageauthResponse> InitIndividualidImageauthAsync(InitIndividualidImageauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitIndividualidImageauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实人认证服务端比对-认证开始
         * Summary: 个人实人认证服务端比对-认证开始
         */
        public InitIndividualidImageauthResponse InitIndividualidImageauthEx(InitIndividualidImageauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIndividualidImageauthResponse>(DoRequest("1.0", "baas.plus.individualid.imageauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人认证服务端比对-认证开始
         * Summary: 个人实人认证服务端比对-认证开始
         */
        public async Task<InitIndividualidImageauthResponse> InitIndividualidImageauthExAsync(InitIndividualidImageauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIndividualidImageauthResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.imageauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 访问账户生成
         * Summary: 访问账户生成
         */
        public AddIotcseAccountResponse AddIotcseAccount(AddIotcseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddIotcseAccountEx(request, headers, runtime);
        }

        /**
         * Description: 访问账户生成
         * Summary: 访问账户生成
         */
        public async Task<AddIotcseAccountResponse> AddIotcseAccountAsync(AddIotcseAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddIotcseAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 访问账户生成
         * Summary: 访问账户生成
         */
        public AddIotcseAccountResponse AddIotcseAccountEx(AddIotcseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddIotcseAccountResponse>(DoRequest("1.0", "baas.plus.iotcse.account.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 访问账户生成
         * Summary: 访问账户生成
         */
        public async Task<AddIotcseAccountResponse> AddIotcseAccountExAsync(AddIotcseAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddIotcseAccountResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.account.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证上链
         * Summary: 存证上链
         */
        public SaveIotcseEvidenceResponse SaveIotcseEvidence(SaveIotcseEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveIotcseEvidenceEx(request, headers, runtime);
        }

        /**
         * Description: 存证上链
         * Summary: 存证上链
         */
        public async Task<SaveIotcseEvidenceResponse> SaveIotcseEvidenceAsync(SaveIotcseEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveIotcseEvidenceExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证上链
         * Summary: 存证上链
         */
        public SaveIotcseEvidenceResponse SaveIotcseEvidenceEx(SaveIotcseEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveIotcseEvidenceResponse>(DoRequest("1.0", "baas.plus.iotcse.evidence.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证上链
         * Summary: 存证上链
         */
        public async Task<SaveIotcseEvidenceResponse> SaveIotcseEvidenceExAsync(SaveIotcseEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveIotcseEvidenceResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.evidence.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证上链查询
         * Summary: 存证上链查询
         */
        public QueryIotcseEvidenceResponse QueryIotcseEvidence(QueryIotcseEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotcseEvidenceEx(request, headers, runtime);
        }

        /**
         * Description: 存证上链查询
         * Summary: 存证上链查询
         */
        public async Task<QueryIotcseEvidenceResponse> QueryIotcseEvidenceAsync(QueryIotcseEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotcseEvidenceExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证上链查询
         * Summary: 存证上链查询
         */
        public QueryIotcseEvidenceResponse QueryIotcseEvidenceEx(QueryIotcseEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseEvidenceResponse>(DoRequest("1.0", "baas.plus.iotcse.evidence.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证上链查询
         * Summary: 存证上链查询
         */
        public async Task<QueryIotcseEvidenceResponse> QueryIotcseEvidenceExAsync(QueryIotcseEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseEvidenceResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.evidence.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代理创建企业did
         * Summary: 代理创建企业did
         */
        public CreateDidCorporatedidagentResponse CreateDidCorporatedidagent(CreateDidCorporatedidagentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDidCorporatedidagentEx(request, headers, runtime);
        }

        /**
         * Description: 代理创建企业did
         * Summary: 代理创建企业did
         */
        public async Task<CreateDidCorporatedidagentResponse> CreateDidCorporatedidagentAsync(CreateDidCorporatedidagentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDidCorporatedidagentExAsync(request, headers, runtime);
        }

        /**
         * Description: 代理创建企业did
         * Summary: 代理创建企业did
         */
        public CreateDidCorporatedidagentResponse CreateDidCorporatedidagentEx(CreateDidCorporatedidagentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidCorporatedidagentResponse>(DoRequest("1.0", "baas.plus.did.corporatedidagent.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代理创建企业did
         * Summary: 代理创建企业did
         */
        public async Task<CreateDidCorporatedidagentResponse> CreateDidCorporatedidagentExAsync(CreateDidCorporatedidagentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidCorporatedidagentResponse>(await DoRequestAsync("1.0", "baas.plus.did.corporatedidagent.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证-认证初始化
         * Summary: 个人实人刷脸认证-认证初始化
         */
        public InitIndividualidFaceauthinternalResponse InitIndividualidFaceauthinternal(InitIndividualidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitIndividualidFaceauthinternalEx(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证-认证初始化
         * Summary: 个人实人刷脸认证-认证初始化
         */
        public async Task<InitIndividualidFaceauthinternalResponse> InitIndividualidFaceauthinternalAsync(InitIndividualidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitIndividualidFaceauthinternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证-认证初始化
         * Summary: 个人实人刷脸认证-认证初始化
         */
        public InitIndividualidFaceauthinternalResponse InitIndividualidFaceauthinternalEx(InitIndividualidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIndividualidFaceauthinternalResponse>(DoRequest("1.0", "baas.plus.individualid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证-认证初始化
         * Summary: 个人实人刷脸认证-认证初始化
         */
        public async Task<InitIndividualidFaceauthinternalResponse> InitIndividualidFaceauthinternalExAsync(InitIndividualidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIndividualidFaceauthinternalResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证-认证开始
         * Summary: 个人实人刷脸认证-认证开始
         */
        public CertifyIndividualidFaceauthinternalResponse CertifyIndividualidFaceauthinternal(CertifyIndividualidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyIndividualidFaceauthinternalEx(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证-认证开始
         * Summary: 个人实人刷脸认证-认证开始
         */
        public async Task<CertifyIndividualidFaceauthinternalResponse> CertifyIndividualidFaceauthinternalAsync(CertifyIndividualidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyIndividualidFaceauthinternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证-认证开始
         * Summary: 个人实人刷脸认证-认证开始
         */
        public CertifyIndividualidFaceauthinternalResponse CertifyIndividualidFaceauthinternalEx(CertifyIndividualidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIndividualidFaceauthinternalResponse>(DoRequest("1.0", "baas.plus.individualid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证-认证开始
         * Summary: 个人实人刷脸认证-认证开始
         */
        public async Task<CertifyIndividualidFaceauthinternalResponse> CertifyIndividualidFaceauthinternalExAsync(CertifyIndividualidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIndividualidFaceauthinternalResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证-查询认证结果
         * Summary: 个人实人刷脸认证-查询认证结果
         */
        public QueryIndividualidFaceauthinternalResponse QueryIndividualidFaceauthinternal(QueryIndividualidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndividualidFaceauthinternalEx(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证-查询认证结果
         * Summary: 个人实人刷脸认证-查询认证结果
         */
        public async Task<QueryIndividualidFaceauthinternalResponse> QueryIndividualidFaceauthinternalAsync(QueryIndividualidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndividualidFaceauthinternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人实人刷脸认证-查询认证结果
         * Summary: 个人实人刷脸认证-查询认证结果
         */
        public QueryIndividualidFaceauthinternalResponse QueryIndividualidFaceauthinternalEx(QueryIndividualidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidFaceauthinternalResponse>(DoRequest("1.0", "baas.plus.individualid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人实人刷脸认证-查询认证结果
         * Summary: 个人实人刷脸认证-查询认证结果
         */
        public async Task<QueryIndividualidFaceauthinternalResponse> QueryIndividualidFaceauthinternalExAsync(QueryIndividualidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndividualidFaceauthinternalResponse>(await DoRequestAsync("1.0", "baas.plus.individualid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素-法人实人认证初始化
         * Summary: 企业认证四要素-法人实人认证初始化
         */
        public InitEnterpriseidFaceauthinternalResponse InitEnterpriseidFaceauthinternal(InitEnterpriseidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitEnterpriseidFaceauthinternalEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素-法人实人认证初始化
         * Summary: 企业认证四要素-法人实人认证初始化
         */
        public async Task<InitEnterpriseidFaceauthinternalResponse> InitEnterpriseidFaceauthinternalAsync(InitEnterpriseidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitEnterpriseidFaceauthinternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素-法人实人认证初始化
         * Summary: 企业认证四要素-法人实人认证初始化
         */
        public InitEnterpriseidFaceauthinternalResponse InitEnterpriseidFaceauthinternalEx(InitEnterpriseidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEnterpriseidFaceauthinternalResponse>(DoRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素-法人实人认证初始化
         * Summary: 企业认证四要素-法人实人认证初始化
         */
        public async Task<InitEnterpriseidFaceauthinternalResponse> InitEnterpriseidFaceauthinternalExAsync(InitEnterpriseidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEnterpriseidFaceauthinternalResponse>(await DoRequestAsync("1.0", "baas.plus.enterpriseid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素-法人实人认证开始
         * Summary: 企业认证四要素-法人实人认证开始
         */
        public CertifyEnterpriseidFaceauthinternalResponse CertifyEnterpriseidFaceauthinternal(CertifyEnterpriseidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyEnterpriseidFaceauthinternalEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素-法人实人认证开始
         * Summary: 企业认证四要素-法人实人认证开始
         */
        public async Task<CertifyEnterpriseidFaceauthinternalResponse> CertifyEnterpriseidFaceauthinternalAsync(CertifyEnterpriseidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyEnterpriseidFaceauthinternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素-法人实人认证开始
         * Summary: 企业认证四要素-法人实人认证开始
         */
        public CertifyEnterpriseidFaceauthinternalResponse CertifyEnterpriseidFaceauthinternalEx(CertifyEnterpriseidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyEnterpriseidFaceauthinternalResponse>(DoRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素-法人实人认证开始
         * Summary: 企业认证四要素-法人实人认证开始
         */
        public async Task<CertifyEnterpriseidFaceauthinternalResponse> CertifyEnterpriseidFaceauthinternalExAsync(CertifyEnterpriseidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyEnterpriseidFaceauthinternalResponse>(await DoRequestAsync("1.0", "baas.plus.enterpriseid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素
         */
        public QueryEverifyTwometainternalResponse QueryEverifyTwometainternal(QueryEverifyTwometainternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEverifyTwometainternalEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素
         */
        public async Task<QueryEverifyTwometainternalResponse> QueryEverifyTwometainternalAsync(QueryEverifyTwometainternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEverifyTwometainternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素
         */
        public QueryEverifyTwometainternalResponse QueryEverifyTwometainternalEx(QueryEverifyTwometainternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyTwometainternalResponse>(DoRequest("1.0", "baas.plus.everify.twometainternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证二要素
         * Summary: 企业认证二要素
         */
        public async Task<QueryEverifyTwometainternalResponse> QueryEverifyTwometainternalExAsync(QueryEverifyTwometainternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyTwometainternalResponse>(await DoRequestAsync("1.0", "baas.plus.everify.twometainternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素
         */
        public QueryEverifyThreemetainternalResponse QueryEverifyThreemetainternal(QueryEverifyThreemetainternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEverifyThreemetainternalEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素
         */
        public async Task<QueryEverifyThreemetainternalResponse> QueryEverifyThreemetainternalAsync(QueryEverifyThreemetainternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEverifyThreemetainternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素
         */
        public QueryEverifyThreemetainternalResponse QueryEverifyThreemetainternalEx(QueryEverifyThreemetainternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyThreemetainternalResponse>(DoRequest("1.0", "baas.plus.everify.threemetainternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证三要素
         * Summary: 企业认证三要素
         */
        public async Task<QueryEverifyThreemetainternalResponse> QueryEverifyThreemetainternalExAsync(QueryEverifyThreemetainternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyThreemetainternalResponse>(await DoRequestAsync("1.0", "baas.plus.everify.threemetainternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素
         */
        public QueryEverifyFourmetainternalResponse QueryEverifyFourmetainternal(QueryEverifyFourmetainternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEverifyFourmetainternalEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素
         */
        public async Task<QueryEverifyFourmetainternalResponse> QueryEverifyFourmetainternalAsync(QueryEverifyFourmetainternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEverifyFourmetainternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素
         */
        public QueryEverifyFourmetainternalResponse QueryEverifyFourmetainternalEx(QueryEverifyFourmetainternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyFourmetainternalResponse>(DoRequest("1.0", "baas.plus.everify.fourmetainternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证四要素
         * Summary: 企业认证四要素
         */
        public async Task<QueryEverifyFourmetainternalResponse> QueryEverifyFourmetainternalExAsync(QueryEverifyFourmetainternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEverifyFourmetainternalResponse>(await DoRequestAsync("1.0", "baas.plus.everify.fourmetainternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业认证四要素—法人实人认证结果
         * Summary: 查询企业认证四要素—法人实人认证结果
         */
        public QueryEnterpriseidFaceauthinternalResponse QueryEnterpriseidFaceauthinternal(QueryEnterpriseidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnterpriseidFaceauthinternalEx(request, headers, runtime);
        }

        /**
         * Description: 查询企业认证四要素—法人实人认证结果
         * Summary: 查询企业认证四要素—法人实人认证结果
         */
        public async Task<QueryEnterpriseidFaceauthinternalResponse> QueryEnterpriseidFaceauthinternalAsync(QueryEnterpriseidFaceauthinternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnterpriseidFaceauthinternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询企业认证四要素—法人实人认证结果
         * Summary: 查询企业认证四要素—法人实人认证结果
         */
        public QueryEnterpriseidFaceauthinternalResponse QueryEnterpriseidFaceauthinternalEx(QueryEnterpriseidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidFaceauthinternalResponse>(DoRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业认证四要素—法人实人认证结果
         * Summary: 查询企业认证四要素—法人实人认证结果
         */
        public async Task<QueryEnterpriseidFaceauthinternalResponse> QueryEnterpriseidFaceauthinternalExAsync(QueryEnterpriseidFaceauthinternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseidFaceauthinternalResponse>(await DoRequestAsync("1.0", "baas.plus.enterpriseid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份注册
         * Summary: 物联网区块链身份注册
         */
        public AddIotcseThingsdidResponse AddIotcseThingsdid(AddIotcseThingsdidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddIotcseThingsdidEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份注册
         * Summary: 物联网区块链身份注册
         */
        public async Task<AddIotcseThingsdidResponse> AddIotcseThingsdidAsync(AddIotcseThingsdidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddIotcseThingsdidExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份注册
         * Summary: 物联网区块链身份注册
         */
        public AddIotcseThingsdidResponse AddIotcseThingsdidEx(AddIotcseThingsdidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddIotcseThingsdidResponse>(DoRequest("1.0", "baas.plus.iotcse.thingsdid.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份注册
         * Summary: 物联网区块链身份注册
         */
        public async Task<AddIotcseThingsdidResponse> AddIotcseThingsdidExAsync(AddIotcseThingsdidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddIotcseThingsdidResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.thingsdid.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份更新
         * Summary: 物联网区块链身份更新
         */
        public UpdateIotcseThingsdidResponse UpdateIotcseThingsdid(UpdateIotcseThingsdidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIotcseThingsdidEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份更新
         * Summary: 物联网区块链身份更新
         */
        public async Task<UpdateIotcseThingsdidResponse> UpdateIotcseThingsdidAsync(UpdateIotcseThingsdidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIotcseThingsdidExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份更新
         * Summary: 物联网区块链身份更新
         */
        public UpdateIotcseThingsdidResponse UpdateIotcseThingsdidEx(UpdateIotcseThingsdidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotcseThingsdidResponse>(DoRequest("1.0", "baas.plus.iotcse.thingsdid.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份更新
         * Summary: 物联网区块链身份更新
         */
        public async Task<UpdateIotcseThingsdidResponse> UpdateIotcseThingsdidExAsync(UpdateIotcseThingsdidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotcseThingsdidResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.thingsdid.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份查询
         * Summary: 物联网区块链身份查询
         */
        public QueryIotcseThingsdidResponse QueryIotcseThingsdid(QueryIotcseThingsdidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotcseThingsdidEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份查询
         * Summary: 物联网区块链身份查询
         */
        public async Task<QueryIotcseThingsdidResponse> QueryIotcseThingsdidAsync(QueryIotcseThingsdidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotcseThingsdidExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份查询
         * Summary: 物联网区块链身份查询
         */
        public QueryIotcseThingsdidResponse QueryIotcseThingsdidEx(QueryIotcseThingsdidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseThingsdidResponse>(DoRequest("1.0", "baas.plus.iotcse.thingsdid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份查询
         * Summary: 物联网区块链身份查询
         */
        public async Task<QueryIotcseThingsdidResponse> QueryIotcseThingsdidExAsync(QueryIotcseThingsdidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseThingsdidResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.thingsdid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步轮询请求
        智能合约执行完后异步轮询
         * Summary: 异步轮询请求
         */
        public QueryIotcseAsyncprocessResponse QueryIotcseAsyncprocess(QueryIotcseAsyncprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotcseAsyncprocessEx(request, headers, runtime);
        }

        /**
         * Description: 异步轮询请求
        智能合约执行完后异步轮询
         * Summary: 异步轮询请求
         */
        public async Task<QueryIotcseAsyncprocessResponse> QueryIotcseAsyncprocessAsync(QueryIotcseAsyncprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotcseAsyncprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 异步轮询请求
        智能合约执行完后异步轮询
         * Summary: 异步轮询请求
         */
        public QueryIotcseAsyncprocessResponse QueryIotcseAsyncprocessEx(QueryIotcseAsyncprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseAsyncprocessResponse>(DoRequest("1.0", "baas.plus.iotcse.asyncprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步轮询请求
        智能合约执行完后异步轮询
         * Summary: 异步轮询请求
         */
        public async Task<QueryIotcseAsyncprocessResponse> QueryIotcseAsyncprocessExAsync(QueryIotcseAsyncprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseAsyncprocessResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.asyncprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份分组
         * Summary: 物联网区块链身份分组
         */
        public ExecIotcseGroupResponse ExecIotcseGroup(ExecIotcseGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecIotcseGroupEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份分组
         * Summary: 物联网区块链身份分组
         */
        public async Task<ExecIotcseGroupResponse> ExecIotcseGroupAsync(ExecIotcseGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecIotcseGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份分组
         * Summary: 物联网区块链身份分组
         */
        public ExecIotcseGroupResponse ExecIotcseGroupEx(ExecIotcseGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIotcseGroupResponse>(DoRequest("1.0", "baas.plus.iotcse.group.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份分组
         * Summary: 物联网区块链身份分组
         */
        public async Task<ExecIotcseGroupResponse> ExecIotcseGroupExAsync(ExecIotcseGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIotcseGroupResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.group.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链分组设备查询
         * Summary: 物联网区块链分组设备查询
         */
        public QueryIotcseGroupdeviceResponse QueryIotcseGroupdevice(QueryIotcseGroupdeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotcseGroupdeviceEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链分组设备查询
         * Summary: 物联网区块链分组设备查询
         */
        public async Task<QueryIotcseGroupdeviceResponse> QueryIotcseGroupdeviceAsync(QueryIotcseGroupdeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotcseGroupdeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链分组设备查询
         * Summary: 物联网区块链分组设备查询
         */
        public QueryIotcseGroupdeviceResponse QueryIotcseGroupdeviceEx(QueryIotcseGroupdeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseGroupdeviceResponse>(DoRequest("1.0", "baas.plus.iotcse.groupdevice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链分组设备查询
         * Summary: 物联网区块链分组设备查询
         */
        public async Task<QueryIotcseGroupdeviceResponse> QueryIotcseGroupdeviceExAsync(QueryIotcseGroupdeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseGroupdeviceResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.groupdevice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份设备分组查询
         * Summary: 物联网区块链身份设备分组查询
         */
        public QueryIotcseDevicegroupResponse QueryIotcseDevicegroup(QueryIotcseDevicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotcseDevicegroupEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份设备分组查询
         * Summary: 物联网区块链身份设备分组查询
         */
        public async Task<QueryIotcseDevicegroupResponse> QueryIotcseDevicegroupAsync(QueryIotcseDevicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotcseDevicegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份设备分组查询
         * Summary: 物联网区块链身份设备分组查询
         */
        public QueryIotcseDevicegroupResponse QueryIotcseDevicegroupEx(QueryIotcseDevicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseDevicegroupResponse>(DoRequest("1.0", "baas.plus.iotcse.devicegroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份设备分组查询
         * Summary: 物联网区块链身份设备分组查询
         */
        public async Task<QueryIotcseDevicegroupResponse> QueryIotcseDevicegroupExAsync(QueryIotcseDevicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseDevicegroupResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.devicegroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份租户设备查询
         * Summary: 物联网区块链身份租户设备查询
         */
        public QueryIotcseTenantdeviceResponse QueryIotcseTenantdevice(QueryIotcseTenantdeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotcseTenantdeviceEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份租户设备查询
         * Summary: 物联网区块链身份租户设备查询
         */
        public async Task<QueryIotcseTenantdeviceResponse> QueryIotcseTenantdeviceAsync(QueryIotcseTenantdeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotcseTenantdeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份租户设备查询
         * Summary: 物联网区块链身份租户设备查询
         */
        public QueryIotcseTenantdeviceResponse QueryIotcseTenantdeviceEx(QueryIotcseTenantdeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseTenantdeviceResponse>(DoRequest("1.0", "baas.plus.iotcse.tenantdevice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份租户设备查询
         * Summary: 物联网区块链身份租户设备查询
         */
        public async Task<QueryIotcseTenantdeviceResponse> QueryIotcseTenantdeviceExAsync(QueryIotcseTenantdeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseTenantdeviceResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.tenantdevice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份设备状态更新
         * Summary: 物联网区块链身份设备状态更新
         */
        public UpdateIotcseDevicestatusResponse UpdateIotcseDevicestatus(UpdateIotcseDevicestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIotcseDevicestatusEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份设备状态更新
         * Summary: 物联网区块链身份设备状态更新
         */
        public async Task<UpdateIotcseDevicestatusResponse> UpdateIotcseDevicestatusAsync(UpdateIotcseDevicestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIotcseDevicestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份设备状态更新
         * Summary: 物联网区块链身份设备状态更新
         */
        public UpdateIotcseDevicestatusResponse UpdateIotcseDevicestatusEx(UpdateIotcseDevicestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotcseDevicestatusResponse>(DoRequest("1.0", "baas.plus.iotcse.devicestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份设备状态更新
         * Summary: 物联网区块链身份设备状态更新
         */
        public async Task<UpdateIotcseDevicestatusResponse> UpdateIotcseDevicestatusExAsync(UpdateIotcseDevicestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotcseDevicestatusResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.devicestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份设备物模型查询
         * Summary: 物联网区块链身份设备物模型查询
         */
        public QueryIotcseDevicemodelResponse QueryIotcseDevicemodel(QueryIotcseDevicemodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotcseDevicemodelEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份设备物模型查询
         * Summary: 物联网区块链身份设备物模型查询
         */
        public async Task<QueryIotcseDevicemodelResponse> QueryIotcseDevicemodelAsync(QueryIotcseDevicemodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotcseDevicemodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份设备物模型查询
         * Summary: 物联网区块链身份设备物模型查询
         */
        public QueryIotcseDevicemodelResponse QueryIotcseDevicemodelEx(QueryIotcseDevicemodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseDevicemodelResponse>(DoRequest("1.0", "baas.plus.iotcse.devicemodel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份设备物模型查询
         * Summary: 物联网区块链身份设备物模型查询
         */
        public async Task<QueryIotcseDevicemodelResponse> QueryIotcseDevicemodelExAsync(QueryIotcseDevicemodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseDevicemodelResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.devicemodel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份设备空间关联
         * Summary: 物联网区块链身份设备空间关联
         */
        public UpdateIotcseDevicespaceResponse UpdateIotcseDevicespace(UpdateIotcseDevicespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIotcseDevicespaceEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份设备空间关联
         * Summary: 物联网区块链身份设备空间关联
         */
        public async Task<UpdateIotcseDevicespaceResponse> UpdateIotcseDevicespaceAsync(UpdateIotcseDevicespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIotcseDevicespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份设备空间关联
         * Summary: 物联网区块链身份设备空间关联
         */
        public UpdateIotcseDevicespaceResponse UpdateIotcseDevicespaceEx(UpdateIotcseDevicespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotcseDevicespaceResponse>(DoRequest("1.0", "baas.plus.iotcse.devicespace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份设备空间关联
         * Summary: 物联网区块链身份设备空间关联
         */
        public async Task<UpdateIotcseDevicespaceResponse> UpdateIotcseDevicespaceExAsync(UpdateIotcseDevicespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotcseDevicespaceResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.devicespace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份批量存证数据读取
         * Summary: 物联网区块链身份批量存证数据读取
         */
        public QueryIotcseEvidencebatchResponse QueryIotcseEvidencebatch(QueryIotcseEvidencebatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotcseEvidencebatchEx(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份批量存证数据读取
         * Summary: 物联网区块链身份批量存证数据读取
         */
        public async Task<QueryIotcseEvidencebatchResponse> QueryIotcseEvidencebatchAsync(QueryIotcseEvidencebatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotcseEvidencebatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 物联网区块链身份批量存证数据读取
         * Summary: 物联网区块链身份批量存证数据读取
         */
        public QueryIotcseEvidencebatchResponse QueryIotcseEvidencebatchEx(QueryIotcseEvidencebatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseEvidencebatchResponse>(DoRequest("1.0", "baas.plus.iotcse.evidencebatch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物联网区块链身份批量存证数据读取
         * Summary: 物联网区块链身份批量存证数据读取
         */
        public async Task<QueryIotcseEvidencebatchResponse> QueryIotcseEvidencebatchExAsync(QueryIotcseEvidencebatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotcseEvidencebatchResponse>(await DoRequestAsync("1.0", "baas.plus.iotcse.evidencebatch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI认知服务营业执照ocr服务
         * Summary: AI认知服务营业执照ocr服务
         */
        public QueryBlocrBusinesslicenseResponse QueryBlocrBusinesslicense(QueryBlocrBusinesslicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlocrBusinesslicenseEx(request, headers, runtime);
        }

        /**
         * Description: AI认知服务营业执照ocr服务
         * Summary: AI认知服务营业执照ocr服务
         */
        public async Task<QueryBlocrBusinesslicenseResponse> QueryBlocrBusinesslicenseAsync(QueryBlocrBusinesslicenseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlocrBusinesslicenseExAsync(request, headers, runtime);
        }

        /**
         * Description: AI认知服务营业执照ocr服务
         * Summary: AI认知服务营业执照ocr服务
         */
        public QueryBlocrBusinesslicenseResponse QueryBlocrBusinesslicenseEx(QueryBlocrBusinesslicenseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlocrBusinesslicenseResponse>(DoRequest("1.0", "baas.plus.blocr.businesslicense.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI认知服务营业执照ocr服务
         * Summary: AI认知服务营业执照ocr服务
         */
        public async Task<QueryBlocrBusinesslicenseResponse> QueryBlocrBusinesslicenseExAsync(QueryBlocrBusinesslicenseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlocrBusinesslicenseResponse>(await DoRequestAsync("1.0", "baas.plus.blocr.businesslicense.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI认知服务增值税发票ocr识别
         * Summary: AI认知服务增值税发票ocr识别
         */
        public QueryInvoicesocrVatinvoiceResponse QueryInvoicesocrVatinvoice(QueryInvoicesocrVatinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInvoicesocrVatinvoiceEx(request, headers, runtime);
        }

        /**
         * Description: AI认知服务增值税发票ocr识别
         * Summary: AI认知服务增值税发票ocr识别
         */
        public async Task<QueryInvoicesocrVatinvoiceResponse> QueryInvoicesocrVatinvoiceAsync(QueryInvoicesocrVatinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInvoicesocrVatinvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: AI认知服务增值税发票ocr识别
         * Summary: AI认知服务增值税发票ocr识别
         */
        public QueryInvoicesocrVatinvoiceResponse QueryInvoicesocrVatinvoiceEx(QueryInvoicesocrVatinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInvoicesocrVatinvoiceResponse>(DoRequest("1.0", "baas.plus.invoicesocr.vatinvoice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI认知服务增值税发票ocr识别
         * Summary: AI认知服务增值税发票ocr识别
         */
        public async Task<QueryInvoicesocrVatinvoiceResponse> QueryInvoicesocrVatinvoiceExAsync(QueryInvoicesocrVatinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInvoicesocrVatinvoiceResponse>(await DoRequestAsync("1.0", "baas.plus.invoicesocr.vatinvoice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户链上交易移动端查看权限
         * Summary: 查询用户链上交易移动端查看权限
         */
        public QueryBmpbrowserPrivilegeResponse QueryBmpbrowserPrivilege(QueryBmpbrowserPrivilegeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBmpbrowserPrivilegeEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户链上交易移动端查看权限
         * Summary: 查询用户链上交易移动端查看权限
         */
        public async Task<QueryBmpbrowserPrivilegeResponse> QueryBmpbrowserPrivilegeAsync(QueryBmpbrowserPrivilegeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBmpbrowserPrivilegeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户链上交易移动端查看权限
         * Summary: 查询用户链上交易移动端查看权限
         */
        public QueryBmpbrowserPrivilegeResponse QueryBmpbrowserPrivilegeEx(QueryBmpbrowserPrivilegeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBmpbrowserPrivilegeResponse>(DoRequest("1.0", "baas.plus.bmpbrowser.privilege.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户链上交易移动端查看权限
         * Summary: 查询用户链上交易移动端查看权限
         */
        public async Task<QueryBmpbrowserPrivilegeResponse> QueryBmpbrowserPrivilegeExAsync(QueryBmpbrowserPrivilegeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBmpbrowserPrivilegeResponse>(await DoRequestAsync("1.0", "baas.plus.bmpbrowser.privilege.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量取消 链上交易移动端查看权限
         * Summary: 批量取消 链上交易移动端查看权限
         */
        public CancelBmpbrowserPrivilegeResponse CancelBmpbrowserPrivilege(CancelBmpbrowserPrivilegeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelBmpbrowserPrivilegeEx(request, headers, runtime);
        }

        /**
         * Description: 批量取消 链上交易移动端查看权限
         * Summary: 批量取消 链上交易移动端查看权限
         */
        public async Task<CancelBmpbrowserPrivilegeResponse> CancelBmpbrowserPrivilegeAsync(CancelBmpbrowserPrivilegeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelBmpbrowserPrivilegeExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量取消 链上交易移动端查看权限
         * Summary: 批量取消 链上交易移动端查看权限
         */
        public CancelBmpbrowserPrivilegeResponse CancelBmpbrowserPrivilegeEx(CancelBmpbrowserPrivilegeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBmpbrowserPrivilegeResponse>(DoRequest("1.0", "baas.plus.bmpbrowser.privilege.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量取消 链上交易移动端查看权限
         * Summary: 批量取消 链上交易移动端查看权限
         */
        public async Task<CancelBmpbrowserPrivilegeResponse> CancelBmpbrowserPrivilegeExAsync(CancelBmpbrowserPrivilegeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBmpbrowserPrivilegeResponse>(await DoRequestAsync("1.0", "baas.plus.bmpbrowser.privilege.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
