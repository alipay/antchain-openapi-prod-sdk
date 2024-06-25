// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.STLR.Models;

namespace AntChain.SDK.STLR
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
                        {"sdk_version", "2.9.2"},
                        {"_prod_code", "STLR"},
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
                        {"sdk_version", "2.9.2"},
                        {"_prod_code", "STLR"},
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
         * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
         * Summary: 查询当前活动资料信息
         */
        public DescribeAcarActivityResponse DescribeAcarActivity(DescribeAcarActivityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeAcarActivityEx(request, headers, runtime);
        }

        /**
         * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
         * Summary: 查询当前活动资料信息
         */
        public async Task<DescribeAcarActivityResponse> DescribeAcarActivityAsync(DescribeAcarActivityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeAcarActivityExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
         * Summary: 查询当前活动资料信息
         */
        public DescribeAcarActivityResponse DescribeAcarActivityEx(DescribeAcarActivityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarActivityResponse>(DoRequest("1.0", "antchain.carbon.acar.activity.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
         * Summary: 查询当前活动资料信息
         */
        public async Task<DescribeAcarActivityResponse> DescribeAcarActivityExAsync(DescribeAcarActivityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarActivityResponse>(await DoRequestAsync("1.0", "antchain.carbon.acar.activity.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
         * Summary: 查询当前活动的每日碳排放量
         */
        public DescribeAcarDailyemissionsResponse DescribeAcarDailyemissions(DescribeAcarDailyemissionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeAcarDailyemissionsEx(request, headers, runtime);
        }

        /**
         * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
         * Summary: 查询当前活动的每日碳排放量
         */
        public async Task<DescribeAcarDailyemissionsResponse> DescribeAcarDailyemissionsAsync(DescribeAcarDailyemissionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeAcarDailyemissionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
         * Summary: 查询当前活动的每日碳排放量
         */
        public DescribeAcarDailyemissionsResponse DescribeAcarDailyemissionsEx(DescribeAcarDailyemissionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarDailyemissionsResponse>(DoRequest("1.0", "antchain.carbon.acar.dailyemissions.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
         * Summary: 查询当前活动的每日碳排放量
         */
        public async Task<DescribeAcarDailyemissionsResponse> DescribeAcarDailyemissionsExAsync(DescribeAcarDailyemissionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarDailyemissionsResponse>(await DoRequestAsync("1.0", "antchain.carbon.acar.dailyemissions.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
         * Summary: 查询当前活动各范围的碳排放量
         */
        public DescribeAcarScopemissionResponse DescribeAcarScopemission(DescribeAcarScopemissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeAcarScopemissionEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
         * Summary: 查询当前活动各范围的碳排放量
         */
        public async Task<DescribeAcarScopemissionResponse> DescribeAcarScopemissionAsync(DescribeAcarScopemissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeAcarScopemissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
         * Summary: 查询当前活动各范围的碳排放量
         */
        public DescribeAcarScopemissionResponse DescribeAcarScopemissionEx(DescribeAcarScopemissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarScopemissionResponse>(DoRequest("1.0", "antchain.carbon.acar.scopemission.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
         * Summary: 查询当前活动各范围的碳排放量
         */
        public async Task<DescribeAcarScopemissionResponse> DescribeAcarScopemissionExAsync(DescribeAcarScopemissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarScopemissionResponse>(await DoRequestAsync("1.0", "antchain.carbon.acar.scopemission.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
         * Summary: 获取减排情况
         */
        public DescribeAcarReductionemissionsResponse DescribeAcarReductionemissions(DescribeAcarReductionemissionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeAcarReductionemissionsEx(request, headers, runtime);
        }

        /**
         * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
         * Summary: 获取减排情况
         */
        public async Task<DescribeAcarReductionemissionsResponse> DescribeAcarReductionemissionsAsync(DescribeAcarReductionemissionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeAcarReductionemissionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
         * Summary: 获取减排情况
         */
        public DescribeAcarReductionemissionsResponse DescribeAcarReductionemissionsEx(DescribeAcarReductionemissionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarReductionemissionsResponse>(DoRequest("1.0", "antchain.carbon.acar.reductionemissions.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
         * Summary: 获取减排情况
         */
        public async Task<DescribeAcarReductionemissionsResponse> DescribeAcarReductionemissionsExAsync(DescribeAcarReductionemissionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarReductionemissionsResponse>(await DoRequestAsync("1.0", "antchain.carbon.acar.reductionemissions.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询最近排放数据，返回最近排放数据信息
         * Summary: 查询最近排放数据
         */
        public DescribeAcarLastemissiondataResponse DescribeAcarLastemissiondata(DescribeAcarLastemissiondataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeAcarLastemissiondataEx(request, headers, runtime);
        }

        /**
         * Description: 查询最近排放数据，返回最近排放数据信息
         * Summary: 查询最近排放数据
         */
        public async Task<DescribeAcarLastemissiondataResponse> DescribeAcarLastemissiondataAsync(DescribeAcarLastemissiondataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeAcarLastemissiondataExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询最近排放数据，返回最近排放数据信息
         * Summary: 查询最近排放数据
         */
        public DescribeAcarLastemissiondataResponse DescribeAcarLastemissiondataEx(DescribeAcarLastemissiondataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarLastemissiondataResponse>(DoRequest("1.0", "antchain.carbon.acar.lastemissiondata.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询最近排放数据，返回最近排放数据信息
         * Summary: 查询最近排放数据
         */
        public async Task<DescribeAcarLastemissiondataResponse> DescribeAcarLastemissiondataExAsync(DescribeAcarLastemissiondataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeAcarLastemissiondataResponse>(await DoRequestAsync("1.0", "antchain.carbon.acar.lastemissiondata.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳总量查询
         * Summary: 碳总量查询
         */
        public QueryEmissionTotalResponse QueryEmissionTotal(QueryEmissionTotalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEmissionTotalEx(request, headers, runtime);
        }

        /**
         * Description: 碳总量查询
         * Summary: 碳总量查询
         */
        public async Task<QueryEmissionTotalResponse> QueryEmissionTotalAsync(QueryEmissionTotalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEmissionTotalExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳总量查询
         * Summary: 碳总量查询
         */
        public QueryEmissionTotalResponse QueryEmissionTotalEx(QueryEmissionTotalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionTotalResponse>(DoRequest("1.0", "antchain.carbon.emission.total.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳总量查询
         * Summary: 碳总量查询
         */
        public async Task<QueryEmissionTotalResponse> QueryEmissionTotalExAsync(QueryEmissionTotalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionTotalResponse>(await DoRequestAsync("1.0", "antchain.carbon.emission.total.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳排放总量分类统计
         * Summary: 碳排放总量分类统计
         */
        public QueryEmissionGroupbycategoryResponse QueryEmissionGroupbycategory(QueryEmissionGroupbycategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEmissionGroupbycategoryEx(request, headers, runtime);
        }

        /**
         * Description: 碳排放总量分类统计
         * Summary: 碳排放总量分类统计
         */
        public async Task<QueryEmissionGroupbycategoryResponse> QueryEmissionGroupbycategoryAsync(QueryEmissionGroupbycategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEmissionGroupbycategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳排放总量分类统计
         * Summary: 碳排放总量分类统计
         */
        public QueryEmissionGroupbycategoryResponse QueryEmissionGroupbycategoryEx(QueryEmissionGroupbycategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionGroupbycategoryResponse>(DoRequest("1.0", "antchain.carbon.emission.groupbycategory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳排放总量分类统计
         * Summary: 碳排放总量分类统计
         */
        public async Task<QueryEmissionGroupbycategoryResponse> QueryEmissionGroupbycategoryExAsync(QueryEmissionGroupbycategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionGroupbycategoryResponse>(await DoRequestAsync("1.0", "antchain.carbon.emission.groupbycategory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳排放总量分单元统计
         * Summary: 碳排放总量分单元统计
         */
        public QueryEmissionGroupbylocationResponse QueryEmissionGroupbylocation(QueryEmissionGroupbylocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEmissionGroupbylocationEx(request, headers, runtime);
        }

        /**
         * Description: 碳排放总量分单元统计
         * Summary: 碳排放总量分单元统计
         */
        public async Task<QueryEmissionGroupbylocationResponse> QueryEmissionGroupbylocationAsync(QueryEmissionGroupbylocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEmissionGroupbylocationExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳排放总量分单元统计
         * Summary: 碳排放总量分单元统计
         */
        public QueryEmissionGroupbylocationResponse QueryEmissionGroupbylocationEx(QueryEmissionGroupbylocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionGroupbylocationResponse>(DoRequest("1.0", "antchain.carbon.emission.groupbylocation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳排放总量分单元统计
         * Summary: 碳排放总量分单元统计
         */
        public async Task<QueryEmissionGroupbylocationResponse> QueryEmissionGroupbylocationExAsync(QueryEmissionGroupbylocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionGroupbylocationResponse>(await DoRequestAsync("1.0", "antchain.carbon.emission.groupbylocation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳排放总量分城市统计
         * Summary: 碳排放总量分城市统计
         */
        public QueryEmissionGroupbycityResponse QueryEmissionGroupbycity(QueryEmissionGroupbycityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEmissionGroupbycityEx(request, headers, runtime);
        }

        /**
         * Description: 碳排放总量分城市统计
         * Summary: 碳排放总量分城市统计
         */
        public async Task<QueryEmissionGroupbycityResponse> QueryEmissionGroupbycityAsync(QueryEmissionGroupbycityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEmissionGroupbycityExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳排放总量分城市统计
         * Summary: 碳排放总量分城市统计
         */
        public QueryEmissionGroupbycityResponse QueryEmissionGroupbycityEx(QueryEmissionGroupbycityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionGroupbycityResponse>(DoRequest("1.0", "antchain.carbon.emission.groupbycity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳排放总量分城市统计
         * Summary: 碳排放总量分城市统计
         */
        public async Task<QueryEmissionGroupbycityResponse> QueryEmissionGroupbycityExAsync(QueryEmissionGroupbycityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionGroupbycityResponse>(await DoRequestAsync("1.0", "antchain.carbon.emission.groupbycity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 减排统计查询
         * Summary: 减排统计查询
         */
        public QueryEmissionReductionResponse QueryEmissionReduction(QueryEmissionReductionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEmissionReductionEx(request, headers, runtime);
        }

        /**
         * Description: 减排统计查询
         * Summary: 减排统计查询
         */
        public async Task<QueryEmissionReductionResponse> QueryEmissionReductionAsync(QueryEmissionReductionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEmissionReductionExAsync(request, headers, runtime);
        }

        /**
         * Description: 减排统计查询
         * Summary: 减排统计查询
         */
        public QueryEmissionReductionResponse QueryEmissionReductionEx(QueryEmissionReductionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionReductionResponse>(DoRequest("1.0", "antchain.carbon.emission.reduction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 减排统计查询
         * Summary: 减排统计查询
         */
        public async Task<QueryEmissionReductionResponse> QueryEmissionReductionExAsync(QueryEmissionReductionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionReductionResponse>(await DoRequestAsync("1.0", "antchain.carbon.emission.reduction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳抵消量统计
         * Summary: 碳抵消量统计
         */
        public QueryEmissionCounteractionResponse QueryEmissionCounteraction(QueryEmissionCounteractionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEmissionCounteractionEx(request, headers, runtime);
        }

        /**
         * Description: 碳抵消量统计
         * Summary: 碳抵消量统计
         */
        public async Task<QueryEmissionCounteractionResponse> QueryEmissionCounteractionAsync(QueryEmissionCounteractionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEmissionCounteractionExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳抵消量统计
         * Summary: 碳抵消量统计
         */
        public QueryEmissionCounteractionResponse QueryEmissionCounteractionEx(QueryEmissionCounteractionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionCounteractionResponse>(DoRequest("1.0", "antchain.carbon.emission.counteraction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳抵消量统计
         * Summary: 碳抵消量统计
         */
        public async Task<QueryEmissionCounteractionResponse> QueryEmissionCounteractionExAsync(QueryEmissionCounteractionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEmissionCounteractionResponse>(await DoRequestAsync("1.0", "antchain.carbon.emission.counteraction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账户开通接口。开通协作平台和链上账户
         * Summary: 账户开通接口
         */
        public RegisterPdcpAccountResponse RegisterPdcpAccount(RegisterPdcpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterPdcpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 账户开通接口。开通协作平台和链上账户
         * Summary: 账户开通接口
         */
        public async Task<RegisterPdcpAccountResponse> RegisterPdcpAccountAsync(RegisterPdcpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterPdcpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 账户开通接口。开通协作平台和链上账户
         * Summary: 账户开通接口
         */
        public RegisterPdcpAccountResponse RegisterPdcpAccountEx(RegisterPdcpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterPdcpAccountResponse>(DoRequest("1.0", "antchain.carbon.pdcp.account.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账户开通接口。开通协作平台和链上账户
         * Summary: 账户开通接口
         */
        public async Task<RegisterPdcpAccountResponse> RegisterPdcpAccountExAsync(RegisterPdcpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterPdcpAccountResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.account.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证接口
         * Summary: 存证接口
         */
        public PushPdcpBlockchainResponse PushPdcpBlockchain(PushPdcpBlockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushPdcpBlockchainEx(request, headers, runtime);
        }

        /**
         * Description: 存证接口
         * Summary: 存证接口
         */
        public async Task<PushPdcpBlockchainResponse> PushPdcpBlockchainAsync(PushPdcpBlockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushPdcpBlockchainExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证接口
         * Summary: 存证接口
         */
        public PushPdcpBlockchainResponse PushPdcpBlockchainEx(PushPdcpBlockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushPdcpBlockchainResponse>(DoRequest("1.0", "antchain.carbon.pdcp.blockchain.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证接口
         * Summary: 存证接口
         */
        public async Task<PushPdcpBlockchainResponse> PushPdcpBlockchainExAsync(PushPdcpBlockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushPdcpBlockchainResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.blockchain.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步存证接口
         * Summary: 异步存证接口
         */
        public UploadPdcpBlockchainResponse UploadPdcpBlockchain(UploadPdcpBlockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadPdcpBlockchainEx(request, headers, runtime);
        }

        /**
         * Description: 异步存证接口
         * Summary: 异步存证接口
         */
        public async Task<UploadPdcpBlockchainResponse> UploadPdcpBlockchainAsync(UploadPdcpBlockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadPdcpBlockchainExAsync(request, headers, runtime);
        }

        /**
         * Description: 异步存证接口
         * Summary: 异步存证接口
         */
        public UploadPdcpBlockchainResponse UploadPdcpBlockchainEx(UploadPdcpBlockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadPdcpBlockchainResponse>(DoRequest("1.0", "antchain.carbon.pdcp.blockchain.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步存证接口
         * Summary: 异步存证接口
         */
        public async Task<UploadPdcpBlockchainResponse> UploadPdcpBlockchainExAsync(UploadPdcpBlockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadPdcpBlockchainResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.blockchain.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询异步存证结果
         * Summary: 查询异步存证结果
         */
        public GetPdcpBlockchainResponse GetPdcpBlockchain(GetPdcpBlockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetPdcpBlockchainEx(request, headers, runtime);
        }

        /**
         * Description: 查询异步存证结果
         * Summary: 查询异步存证结果
         */
        public async Task<GetPdcpBlockchainResponse> GetPdcpBlockchainAsync(GetPdcpBlockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetPdcpBlockchainExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询异步存证结果
         * Summary: 查询异步存证结果
         */
        public GetPdcpBlockchainResponse GetPdcpBlockchainEx(GetPdcpBlockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPdcpBlockchainResponse>(DoRequest("1.0", "antchain.carbon.pdcp.blockchain.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询异步存证结果
         * Summary: 查询异步存证结果
         */
        public async Task<GetPdcpBlockchainResponse> GetPdcpBlockchainExAsync(GetPdcpBlockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPdcpBlockchainResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.blockchain.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上账户查询接口
         * Summary: 链上账户查询接口
         */
        public QueryPdcpAccountResponse QueryPdcpAccount(QueryPdcpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdcpAccountEx(request, headers, runtime);
        }

        /**
         * Description: 链上账户查询接口
         * Summary: 链上账户查询接口
         */
        public async Task<QueryPdcpAccountResponse> QueryPdcpAccountAsync(QueryPdcpAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdcpAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上账户查询接口
         * Summary: 链上账户查询接口
         */
        public QueryPdcpAccountResponse QueryPdcpAccountEx(QueryPdcpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpAccountResponse>(DoRequest("1.0", "antchain.carbon.pdcp.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上账户查询接口
         * Summary: 链上账户查询接口
         */
        public async Task<QueryPdcpAccountResponse> QueryPdcpAccountExAsync(QueryPdcpAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpAccountResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增授权接口
         * Summary: 新增授权接口
         */
        public AddPdcpAuthResponse AddPdcpAuth(AddPdcpAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddPdcpAuthEx(request, headers, runtime);
        }

        /**
         * Description: 新增授权接口
         * Summary: 新增授权接口
         */
        public async Task<AddPdcpAuthResponse> AddPdcpAuthAsync(AddPdcpAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddPdcpAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增授权接口
         * Summary: 新增授权接口
         */
        public AddPdcpAuthResponse AddPdcpAuthEx(AddPdcpAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPdcpAuthResponse>(DoRequest("1.0", "antchain.carbon.pdcp.auth.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增授权接口
         * Summary: 新增授权接口
         */
        public async Task<AddPdcpAuthResponse> AddPdcpAuthExAsync(AddPdcpAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPdcpAuthResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.auth.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权取消、授权审批接口
         * Summary: 授权接口变更
         */
        public UpdatePdcpAuthResponse UpdatePdcpAuth(UpdatePdcpAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdatePdcpAuthEx(request, headers, runtime);
        }

        /**
         * Description: 授权取消、授权审批接口
         * Summary: 授权接口变更
         */
        public async Task<UpdatePdcpAuthResponse> UpdatePdcpAuthAsync(UpdatePdcpAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdatePdcpAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权取消、授权审批接口
         * Summary: 授权接口变更
         */
        public UpdatePdcpAuthResponse UpdatePdcpAuthEx(UpdatePdcpAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdatePdcpAuthResponse>(DoRequest("1.0", "antchain.carbon.pdcp.auth.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权取消、授权审批接口
         * Summary: 授权接口变更
         */
        public async Task<UpdatePdcpAuthResponse> UpdatePdcpAuthExAsync(UpdatePdcpAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdatePdcpAuthResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.auth.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 路由账户查询接口
         * Summary: 路由账户查询接口
         */
        public QueryGatewayAccountResponse QueryGatewayAccount(QueryGatewayAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayAccountEx(request, headers, runtime);
        }

        /**
         * Description: 路由账户查询接口
         * Summary: 路由账户查询接口
         */
        public async Task<QueryGatewayAccountResponse> QueryGatewayAccountAsync(QueryGatewayAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 路由账户查询接口
         * Summary: 路由账户查询接口
         */
        public QueryGatewayAccountResponse QueryGatewayAccountEx(QueryGatewayAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayAccountResponse>(DoRequest("1.0", "antchain.carbon.gateway.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 路由账户查询接口
         * Summary: 路由账户查询接口
         */
        public async Task<QueryGatewayAccountResponse> QueryGatewayAccountExAsync(QueryGatewayAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayAccountResponse>(await DoRequestAsync("1.0", "antchain.carbon.gateway.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权记录查询
         * Summary: 授权记录查询
         */
        public QueryPdcpAuthResponse QueryPdcpAuth(QueryPdcpAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdcpAuthEx(request, headers, runtime);
        }

        /**
         * Description: 授权记录查询
         * Summary: 授权记录查询
         */
        public async Task<QueryPdcpAuthResponse> QueryPdcpAuthAsync(QueryPdcpAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdcpAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权记录查询
         * Summary: 授权记录查询
         */
        public QueryPdcpAuthResponse QueryPdcpAuthEx(QueryPdcpAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpAuthResponse>(DoRequest("1.0", "antchain.carbon.pdcp.auth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权记录查询
         * Summary: 授权记录查询
         */
        public async Task<QueryPdcpAuthResponse> QueryPdcpAuthExAsync(QueryPdcpAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpAuthResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.auth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权数据查询
         * Summary: 授权数据查询
         */
        public QueryPdcpDataResponse QueryPdcpData(QueryPdcpDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdcpDataEx(request, headers, runtime);
        }

        /**
         * Description: 授权数据查询
         * Summary: 授权数据查询
         */
        public async Task<QueryPdcpDataResponse> QueryPdcpDataAsync(QueryPdcpDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdcpDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权数据查询
         * Summary: 授权数据查询
         */
        public QueryPdcpDataResponse QueryPdcpDataEx(QueryPdcpDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpDataResponse>(DoRequest("1.0", "antchain.carbon.pdcp.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权数据查询
         * Summary: 授权数据查询
         */
        public async Task<QueryPdcpDataResponse> QueryPdcpDataExAsync(QueryPdcpDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpDataResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
         * Summary: 查询存证数据详情
         */
        public DetailPdcpDepositResponse DetailPdcpDeposit(DetailPdcpDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailPdcpDepositEx(request, headers, runtime);
        }

        /**
         * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
         * Summary: 查询存证数据详情
         */
        public async Task<DetailPdcpDepositResponse> DetailPdcpDepositAsync(DetailPdcpDepositRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailPdcpDepositExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
         * Summary: 查询存证数据详情
         */
        public DetailPdcpDepositResponse DetailPdcpDepositEx(DetailPdcpDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailPdcpDepositResponse>(DoRequest("1.0", "antchain.carbon.pdcp.deposit.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
         * Summary: 查询存证数据详情
         */
        public async Task<DetailPdcpDepositResponse> DetailPdcpDepositExAsync(DetailPdcpDepositRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailPdcpDepositResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.deposit.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询存证数据历史变更
         * Summary: 存证数据变更历史追溯查询
         */
        public QueryPdcpDtraceResponse QueryPdcpDtrace(QueryPdcpDtraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdcpDtraceEx(request, headers, runtime);
        }

        /**
         * Description: 查询存证数据历史变更
         * Summary: 存证数据变更历史追溯查询
         */
        public async Task<QueryPdcpDtraceResponse> QueryPdcpDtraceAsync(QueryPdcpDtraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdcpDtraceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询存证数据历史变更
         * Summary: 存证数据变更历史追溯查询
         */
        public QueryPdcpDtraceResponse QueryPdcpDtraceEx(QueryPdcpDtraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpDtraceResponse>(DoRequest("1.0", "antchain.carbon.pdcp.dtrace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询存证数据历史变更
         * Summary: 存证数据变更历史追溯查询
         */
        public async Task<QueryPdcpDtraceResponse> QueryPdcpDtraceExAsync(QueryPdcpDtraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpDtraceResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.dtrace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过链山存证内容校验存证数据可信性
         * Summary: 存证数据可信校验
         */
        public CheckPdcpDtraceResponse CheckPdcpDtrace(CheckPdcpDtraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckPdcpDtraceEx(request, headers, runtime);
        }

        /**
         * Description: 通过链山存证内容校验存证数据可信性
         * Summary: 存证数据可信校验
         */
        public async Task<CheckPdcpDtraceResponse> CheckPdcpDtraceAsync(CheckPdcpDtraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckPdcpDtraceExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过链山存证内容校验存证数据可信性
         * Summary: 存证数据可信校验
         */
        public CheckPdcpDtraceResponse CheckPdcpDtraceEx(CheckPdcpDtraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPdcpDtraceResponse>(DoRequest("1.0", "antchain.carbon.pdcp.dtrace.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过链山存证内容校验存证数据可信性
         * Summary: 存证数据可信校验
         */
        public async Task<CheckPdcpDtraceResponse> CheckPdcpDtraceExAsync(CheckPdcpDtraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPdcpDtraceResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.dtrace.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据授权方和被授权方授权关系批量查询授权数据
         * Summary: 批量查询授权数据
         */
        public BatchqueryPdcpDataResponse BatchqueryPdcpData(BatchqueryPdcpDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryPdcpDataEx(request, headers, runtime);
        }

        /**
         * Description: 根据授权方和被授权方授权关系批量查询授权数据
         * Summary: 批量查询授权数据
         */
        public async Task<BatchqueryPdcpDataResponse> BatchqueryPdcpDataAsync(BatchqueryPdcpDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryPdcpDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据授权方和被授权方授权关系批量查询授权数据
         * Summary: 批量查询授权数据
         */
        public BatchqueryPdcpDataResponse BatchqueryPdcpDataEx(BatchqueryPdcpDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryPdcpDataResponse>(DoRequest("1.0", "antchain.carbon.pdcp.data.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据授权方和被授权方授权关系批量查询授权数据
         * Summary: 批量查询授权数据
         */
        public async Task<BatchqueryPdcpDataResponse> BatchqueryPdcpDataExAsync(BatchqueryPdcpDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryPdcpDataResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.data.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户拥有的数据记录
         * Summary: 查询拥有的数据
         */
        public QueryPdcpOwndataResponse QueryPdcpOwndata(QueryPdcpOwndataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdcpOwndataEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户拥有的数据记录
         * Summary: 查询拥有的数据
         */
        public async Task<QueryPdcpOwndataResponse> QueryPdcpOwndataAsync(QueryPdcpOwndataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdcpOwndataExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户拥有的数据记录
         * Summary: 查询拥有的数据
         */
        public QueryPdcpOwndataResponse QueryPdcpOwndataEx(QueryPdcpOwndataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpOwndataResponse>(DoRequest("1.0", "antchain.carbon.pdcp.owndata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户拥有的数据记录
         * Summary: 查询拥有的数据
         */
        public async Task<QueryPdcpOwndataResponse> QueryPdcpOwndataExAsync(QueryPdcpOwndataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpOwndataResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.owndata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询数据资产
         * Summary: 数据资产
         */
        public QueryPdcpDataassetResponse QueryPdcpDataasset(QueryPdcpDataassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdcpDataassetEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询数据资产
         * Summary: 数据资产
         */
        public async Task<QueryPdcpDataassetResponse> QueryPdcpDataassetAsync(QueryPdcpDataassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdcpDataassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询数据资产
         * Summary: 数据资产
         */
        public QueryPdcpDataassetResponse QueryPdcpDataassetEx(QueryPdcpDataassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpDataassetResponse>(DoRequest("1.0", "antchain.carbon.pdcp.dataasset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询数据资产
         * Summary: 数据资产
         */
        public async Task<QueryPdcpDataassetResponse> QueryPdcpDataassetExAsync(QueryPdcpDataassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdcpDataassetResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.dataasset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册数据资产
         * Summary: 注册数据资产
         */
        public RegisterPdcpDataassetResponse RegisterPdcpDataasset(RegisterPdcpDataassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterPdcpDataassetEx(request, headers, runtime);
        }

        /**
         * Description: 注册数据资产
         * Summary: 注册数据资产
         */
        public async Task<RegisterPdcpDataassetResponse> RegisterPdcpDataassetAsync(RegisterPdcpDataassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterPdcpDataassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 注册数据资产
         * Summary: 注册数据资产
         */
        public RegisterPdcpDataassetResponse RegisterPdcpDataassetEx(RegisterPdcpDataassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterPdcpDataassetResponse>(DoRequest("1.0", "antchain.carbon.pdcp.dataasset.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册数据资产
         * Summary: 注册数据资产
         */
        public async Task<RegisterPdcpDataassetResponse> RegisterPdcpDataassetExAsync(RegisterPdcpDataassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterPdcpDataassetResponse>(await DoRequestAsync("1.0", "antchain.carbon.pdcp.dataasset.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加数据授权策略
         * Summary: 添加数据授权策略
         */
        public AddAuthAdminResponse AddAuthAdmin(AddAuthAdminRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddAuthAdminEx(request, headers, runtime);
        }

        /**
         * Description: 添加数据授权策略
         * Summary: 添加数据授权策略
         */
        public async Task<AddAuthAdminResponse> AddAuthAdminAsync(AddAuthAdminRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddAuthAdminExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加数据授权策略
         * Summary: 添加数据授权策略
         */
        public AddAuthAdminResponse AddAuthAdminEx(AddAuthAdminRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAuthAdminResponse>(DoRequest("1.0", "antchain.carbon.auth.admin.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加数据授权策略
         * Summary: 添加数据授权策略
         */
        public async Task<AddAuthAdminResponse> AddAuthAdminExAsync(AddAuthAdminRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAuthAdminResponse>(await DoRequestAsync("1.0", "antchain.carbon.auth.admin.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询数据授权策略
         * Summary: 分页查询数据授权策略
         */
        public PagequeryAuthAdminResponse PagequeryAuthAdmin(PagequeryAuthAdminRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryAuthAdminEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询数据授权策略
         * Summary: 分页查询数据授权策略
         */
        public async Task<PagequeryAuthAdminResponse> PagequeryAuthAdminAsync(PagequeryAuthAdminRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryAuthAdminExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询数据授权策略
         * Summary: 分页查询数据授权策略
         */
        public PagequeryAuthAdminResponse PagequeryAuthAdminEx(PagequeryAuthAdminRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAuthAdminResponse>(DoRequest("1.0", "antchain.carbon.auth.admin.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询数据授权策略
         * Summary: 分页查询数据授权策略
         */
        public async Task<PagequeryAuthAdminResponse> PagequeryAuthAdminExAsync(PagequeryAuthAdminRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAuthAdminResponse>(await DoRequestAsync("1.0", "antchain.carbon.auth.admin.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据授权策略
         * Summary: 查询数据授权策略
         */
        public QueryAuthAdminResponse QueryAuthAdmin(QueryAuthAdminRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuthAdminEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据授权策略
         * Summary: 查询数据授权策略
         */
        public async Task<QueryAuthAdminResponse> QueryAuthAdminAsync(QueryAuthAdminRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuthAdminExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据授权策略
         * Summary: 查询数据授权策略
         */
        public QueryAuthAdminResponse QueryAuthAdminEx(QueryAuthAdminRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthAdminResponse>(DoRequest("1.0", "antchain.carbon.auth.admin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据授权策略
         * Summary: 查询数据授权策略
         */
        public async Task<QueryAuthAdminResponse> QueryAuthAdminExAsync(QueryAuthAdminRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthAdminResponse>(await DoRequestAsync("1.0", "antchain.carbon.auth.admin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据资产添加数据类型
         * Summary: 添加数据类型
         */
        public AddDataassetTypeResponse AddDataassetType(AddDataassetTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDataassetTypeEx(request, headers, runtime);
        }

        /**
         * Description: 数据资产添加数据类型
         * Summary: 添加数据类型
         */
        public async Task<AddDataassetTypeResponse> AddDataassetTypeAsync(AddDataassetTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDataassetTypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据资产添加数据类型
         * Summary: 添加数据类型
         */
        public AddDataassetTypeResponse AddDataassetTypeEx(AddDataassetTypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDataassetTypeResponse>(DoRequest("1.0", "antchain.carbon.dataasset.type.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据资产添加数据类型
         * Summary: 添加数据类型
         */
        public async Task<AddDataassetTypeResponse> AddDataassetTypeExAsync(AddDataassetTypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDataassetTypeResponse>(await DoRequestAsync("1.0", "antchain.carbon.dataasset.type.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询数据资产类型
         * Summary: 分页查询数据资产类型
         */
        public PagequeryDataassetTypeResponse PagequeryDataassetType(PagequeryDataassetTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryDataassetTypeEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询数据资产类型
         * Summary: 分页查询数据资产类型
         */
        public async Task<PagequeryDataassetTypeResponse> PagequeryDataassetTypeAsync(PagequeryDataassetTypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryDataassetTypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询数据资产类型
         * Summary: 分页查询数据资产类型
         */
        public PagequeryDataassetTypeResponse PagequeryDataassetTypeEx(PagequeryDataassetTypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDataassetTypeResponse>(DoRequest("1.0", "antchain.carbon.dataasset.type.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询数据资产类型
         * Summary: 分页查询数据资产类型
         */
        public async Task<PagequeryDataassetTypeResponse> PagequeryDataassetTypeExAsync(PagequeryDataassetTypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDataassetTypeResponse>(await DoRequestAsync("1.0", "antchain.carbon.dataasset.type.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
         * Summary: 开始采集外部数据
         */
        public StartDatasetCollectingResponse StartDatasetCollecting(StartDatasetCollectingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartDatasetCollectingEx(request, headers, runtime);
        }

        /**
         * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
         * Summary: 开始采集外部数据
         */
        public async Task<StartDatasetCollectingResponse> StartDatasetCollectingAsync(StartDatasetCollectingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartDatasetCollectingExAsync(request, headers, runtime);
        }

        /**
         * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
         * Summary: 开始采集外部数据
         */
        public StartDatasetCollectingResponse StartDatasetCollectingEx(StartDatasetCollectingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartDatasetCollectingResponse>(DoRequest("1.0", "antchain.carbon.dataset.collecting.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
         * Summary: 开始采集外部数据
         */
        public async Task<StartDatasetCollectingResponse> StartDatasetCollectingExAsync(StartDatasetCollectingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartDatasetCollectingResponse>(await DoRequestAsync("1.0", "antchain.carbon.dataset.collecting.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询外部数据采集状态
         * Summary: 查询外部数据采集状态
         */
        public QueryDatasetCollectingResponse QueryDatasetCollecting(QueryDatasetCollectingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatasetCollectingEx(request, headers, runtime);
        }

        /**
         * Description: 查询外部数据采集状态
         * Summary: 查询外部数据采集状态
         */
        public async Task<QueryDatasetCollectingResponse> QueryDatasetCollectingAsync(QueryDatasetCollectingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatasetCollectingExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询外部数据采集状态
         * Summary: 查询外部数据采集状态
         */
        public QueryDatasetCollectingResponse QueryDatasetCollectingEx(QueryDatasetCollectingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatasetCollectingResponse>(DoRequest("1.0", "antchain.carbon.dataset.collecting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询外部数据采集状态
         * Summary: 查询外部数据采集状态
         */
        public async Task<QueryDatasetCollectingResponse> QueryDatasetCollectingExAsync(QueryDatasetCollectingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatasetCollectingResponse>(await DoRequestAsync("1.0", "antchain.carbon.dataset.collecting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增排放活动数据
         * Summary: 新增排放活动数据
         */
        public AddEcarAvitivedataResponse AddEcarAvitivedata(AddEcarAvitivedataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddEcarAvitivedataEx(request, headers, runtime);
        }

        /**
         * Description: 新增排放活动数据
         * Summary: 新增排放活动数据
         */
        public async Task<AddEcarAvitivedataResponse> AddEcarAvitivedataAsync(AddEcarAvitivedataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddEcarAvitivedataExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增排放活动数据
         * Summary: 新增排放活动数据
         */
        public AddEcarAvitivedataResponse AddEcarAvitivedataEx(AddEcarAvitivedataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEcarAvitivedataResponse>(DoRequest("1.0", "antchain.carbon.ecar.avitivedata.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增排放活动数据
         * Summary: 新增排放活动数据
         */
        public async Task<AddEcarAvitivedataResponse> AddEcarAvitivedataExAsync(AddEcarAvitivedataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEcarAvitivedataResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.avitivedata.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询排放活动数据详情
         * Summary: 查询排放活动数据详情
         */
        public DetailEcarAvitivedataResponse DetailEcarAvitivedata(DetailEcarAvitivedataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailEcarAvitivedataEx(request, headers, runtime);
        }

        /**
         * Description: 查询排放活动数据详情
         * Summary: 查询排放活动数据详情
         */
        public async Task<DetailEcarAvitivedataResponse> DetailEcarAvitivedataAsync(DetailEcarAvitivedataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailEcarAvitivedataExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询排放活动数据详情
         * Summary: 查询排放活动数据详情
         */
        public DetailEcarAvitivedataResponse DetailEcarAvitivedataEx(DetailEcarAvitivedataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailEcarAvitivedataResponse>(DoRequest("1.0", "antchain.carbon.ecar.avitivedata.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询排放活动数据详情
         * Summary: 查询排放活动数据详情
         */
        public async Task<DetailEcarAvitivedataResponse> DetailEcarAvitivedataExAsync(DetailEcarAvitivedataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailEcarAvitivedataResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.avitivedata.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 排放活动数据统计计算
         * Summary: 排放活动数据统计计算
         */
        public CountEcarActivedataResponse CountEcarActivedata(CountEcarActivedataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountEcarActivedataEx(request, headers, runtime);
        }

        /**
         * Description: 排放活动数据统计计算
         * Summary: 排放活动数据统计计算
         */
        public async Task<CountEcarActivedataResponse> CountEcarActivedataAsync(CountEcarActivedataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountEcarActivedataExAsync(request, headers, runtime);
        }

        /**
         * Description: 排放活动数据统计计算
         * Summary: 排放活动数据统计计算
         */
        public CountEcarActivedataResponse CountEcarActivedataEx(CountEcarActivedataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountEcarActivedataResponse>(DoRequest("1.0", "antchain.carbon.ecar.activedata.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 排放活动数据统计计算
         * Summary: 排放活动数据统计计算
         */
        public async Task<CountEcarActivedataResponse> CountEcarActivedataExAsync(CountEcarActivedataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountEcarActivedataResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.activedata.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件上传接口
         * Summary: 文件上传接口
         */
        public UploadEcarFileResponse UploadEcarFile(UploadEcarFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadEcarFileEx(request, headers, runtime);
        }

        /**
         * Description: 文件上传接口
         * Summary: 文件上传接口
         */
        public async Task<UploadEcarFileResponse> UploadEcarFileAsync(UploadEcarFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadEcarFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件上传接口
         * Summary: 文件上传接口
         */
        public UploadEcarFileResponse UploadEcarFileEx(UploadEcarFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.carbon.ecar.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadEcarFileResponse uploadEcarFileResponse = new UploadEcarFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadEcarFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadEcarFileResponse>(DoRequest("1.0", "antchain.carbon.ecar.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件上传接口
         * Summary: 文件上传接口
         */
        public async Task<UploadEcarFileResponse> UploadEcarFileExAsync(UploadEcarFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.carbon.ecar.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadEcarFileResponse uploadEcarFileResponse = new UploadEcarFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadEcarFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadEcarFileResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
         * Summary: 录入绿色行为数据
         */
        public AddEcarGreenoperationResponse AddEcarGreenoperation(AddEcarGreenoperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddEcarGreenoperationEx(request, headers, runtime);
        }

        /**
         * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
         * Summary: 录入绿色行为数据
         */
        public async Task<AddEcarGreenoperationResponse> AddEcarGreenoperationAsync(AddEcarGreenoperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddEcarGreenoperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
         * Summary: 录入绿色行为数据
         */
        public AddEcarGreenoperationResponse AddEcarGreenoperationEx(AddEcarGreenoperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEcarGreenoperationResponse>(DoRequest("1.0", "antchain.carbon.ecar.greenoperation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
         * Summary: 录入绿色行为数据
         */
        public async Task<AddEcarGreenoperationResponse> AddEcarGreenoperationExAsync(AddEcarGreenoperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEcarGreenoperationResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.greenoperation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
         * Summary: 统计绿色行为数据
         */
        public CountEcarGreenoperationResponse CountEcarGreenoperation(CountEcarGreenoperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountEcarGreenoperationEx(request, headers, runtime);
        }

        /**
         * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
         * Summary: 统计绿色行为数据
         */
        public async Task<CountEcarGreenoperationResponse> CountEcarGreenoperationAsync(CountEcarGreenoperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountEcarGreenoperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
         * Summary: 统计绿色行为数据
         */
        public CountEcarGreenoperationResponse CountEcarGreenoperationEx(CountEcarGreenoperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountEcarGreenoperationResponse>(DoRequest("1.0", "antchain.carbon.ecar.greenoperation.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
         * Summary: 统计绿色行为数据
         */
        public async Task<CountEcarGreenoperationResponse> CountEcarGreenoperationExAsync(CountEcarGreenoperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountEcarGreenoperationResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.greenoperation.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
         * Summary: 查询最近的绿色行为数据
         */
        public ListEcarGreenoperationResponse ListEcarGreenoperation(ListEcarGreenoperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListEcarGreenoperationEx(request, headers, runtime);
        }

        /**
         * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
         * Summary: 查询最近的绿色行为数据
         */
        public async Task<ListEcarGreenoperationResponse> ListEcarGreenoperationAsync(ListEcarGreenoperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListEcarGreenoperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
         * Summary: 查询最近的绿色行为数据
         */
        public ListEcarGreenoperationResponse ListEcarGreenoperationEx(ListEcarGreenoperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEcarGreenoperationResponse>(DoRequest("1.0", "antchain.carbon.ecar.greenoperation.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
         * Summary: 查询最近的绿色行为数据
         */
        public async Task<ListEcarGreenoperationResponse> ListEcarGreenoperationExAsync(ListEcarGreenoperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEcarGreenoperationResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.greenoperation.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
         * Summary: 预览本年度排放统计
         */
        public PreviewEcarAvitivedataResponse PreviewEcarAvitivedata(PreviewEcarAvitivedataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewEcarAvitivedataEx(request, headers, runtime);
        }

        /**
         * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
         * Summary: 预览本年度排放统计
         */
        public async Task<PreviewEcarAvitivedataResponse> PreviewEcarAvitivedataAsync(PreviewEcarAvitivedataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewEcarAvitivedataExAsync(request, headers, runtime);
        }

        /**
         * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
         * Summary: 预览本年度排放统计
         */
        public PreviewEcarAvitivedataResponse PreviewEcarAvitivedataEx(PreviewEcarAvitivedataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewEcarAvitivedataResponse>(DoRequest("1.0", "antchain.carbon.ecar.avitivedata.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
         * Summary: 预览本年度排放统计
         */
        public async Task<PreviewEcarAvitivedataResponse> PreviewEcarAvitivedataExAsync(PreviewEcarAvitivedataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewEcarAvitivedataResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.avitivedata.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
         * Summary: 机构会员注册
         */
        public RegisterEcarEnterprisememberResponse RegisterEcarEnterprisemember(RegisterEcarEnterprisememberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterEcarEnterprisememberEx(request, headers, runtime);
        }

        /**
         * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
         * Summary: 机构会员注册
         */
        public async Task<RegisterEcarEnterprisememberResponse> RegisterEcarEnterprisememberAsync(RegisterEcarEnterprisememberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterEcarEnterprisememberExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
         * Summary: 机构会员注册
         */
        public RegisterEcarEnterprisememberResponse RegisterEcarEnterprisememberEx(RegisterEcarEnterprisememberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterEcarEnterprisememberResponse>(DoRequest("1.0", "antchain.carbon.ecar.enterprisemember.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
         * Summary: 机构会员注册
         */
        public async Task<RegisterEcarEnterprisememberResponse> RegisterEcarEnterprisememberExAsync(RegisterEcarEnterprisememberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterEcarEnterprisememberResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.enterprisemember.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
         * Summary: 碳补偿数据采集
         */
        public AddEcarOffsetacquisitionResponse AddEcarOffsetacquisition(AddEcarOffsetacquisitionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddEcarOffsetacquisitionEx(request, headers, runtime);
        }

        /**
         * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
         * Summary: 碳补偿数据采集
         */
        public async Task<AddEcarOffsetacquisitionResponse> AddEcarOffsetacquisitionAsync(AddEcarOffsetacquisitionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddEcarOffsetacquisitionExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
         * Summary: 碳补偿数据采集
         */
        public AddEcarOffsetacquisitionResponse AddEcarOffsetacquisitionEx(AddEcarOffsetacquisitionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEcarOffsetacquisitionResponse>(DoRequest("1.0", "antchain.carbon.ecar.offsetacquisition.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
         * Summary: 碳补偿数据采集
         */
        public async Task<AddEcarOffsetacquisitionResponse> AddEcarOffsetacquisitionExAsync(AddEcarOffsetacquisitionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEcarOffsetacquisitionResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.offsetacquisition.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
         * Summary: 碳普惠减碳量转移
         */
        public AddEcarOffsettranslateResponse AddEcarOffsettranslate(AddEcarOffsettranslateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddEcarOffsettranslateEx(request, headers, runtime);
        }

        /**
         * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
         * Summary: 碳普惠减碳量转移
         */
        public async Task<AddEcarOffsettranslateResponse> AddEcarOffsettranslateAsync(AddEcarOffsettranslateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddEcarOffsettranslateExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
         * Summary: 碳普惠减碳量转移
         */
        public AddEcarOffsettranslateResponse AddEcarOffsettranslateEx(AddEcarOffsettranslateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEcarOffsettranslateResponse>(DoRequest("1.0", "antchain.carbon.ecar.offsettranslate.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
         * Summary: 碳普惠减碳量转移
         */
        public async Task<AddEcarOffsettranslateResponse> AddEcarOffsettranslateExAsync(AddEcarOffsettranslateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddEcarOffsettranslateResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.offsettranslate.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
         * Summary: 碳普惠数据授权
         */
        public AuthEcarOffsetdatumResponse AuthEcarOffsetdatum(AuthEcarOffsetdatumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthEcarOffsetdatumEx(request, headers, runtime);
        }

        /**
         * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
         * Summary: 碳普惠数据授权
         */
        public async Task<AuthEcarOffsetdatumResponse> AuthEcarOffsetdatumAsync(AuthEcarOffsetdatumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthEcarOffsetdatumExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
         * Summary: 碳普惠数据授权
         */
        public AuthEcarOffsetdatumResponse AuthEcarOffsetdatumEx(AuthEcarOffsetdatumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthEcarOffsetdatumResponse>(DoRequest("1.0", "antchain.carbon.ecar.offsetdatum.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
         * Summary: 碳普惠数据授权
         */
        public async Task<AuthEcarOffsetdatumResponse> AuthEcarOffsetdatumExAsync(AuthEcarOffsetdatumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthEcarOffsetdatumResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.offsetdatum.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
         * Summary: 碳普惠数据列表查询
         */
        public ListEcarOffsetdatumResponse ListEcarOffsetdatum(ListEcarOffsetdatumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListEcarOffsetdatumEx(request, headers, runtime);
        }

        /**
         * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
         * Summary: 碳普惠数据列表查询
         */
        public async Task<ListEcarOffsetdatumResponse> ListEcarOffsetdatumAsync(ListEcarOffsetdatumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListEcarOffsetdatumExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
         * Summary: 碳普惠数据列表查询
         */
        public ListEcarOffsetdatumResponse ListEcarOffsetdatumEx(ListEcarOffsetdatumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEcarOffsetdatumResponse>(DoRequest("1.0", "antchain.carbon.ecar.offsetdatum.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
         * Summary: 碳普惠数据列表查询
         */
        public async Task<ListEcarOffsetdatumResponse> ListEcarOffsetdatumExAsync(ListEcarOffsetdatumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEcarOffsetdatumResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.offsetdatum.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
         * Summary: 机构会员列表查询
         */
        public ListEcarEnterprisememberResponse ListEcarEnterprisemember(ListEcarEnterprisememberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListEcarEnterprisememberEx(request, headers, runtime);
        }

        /**
         * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
         * Summary: 机构会员列表查询
         */
        public async Task<ListEcarEnterprisememberResponse> ListEcarEnterprisememberAsync(ListEcarEnterprisememberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListEcarEnterprisememberExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
         * Summary: 机构会员列表查询
         */
        public ListEcarEnterprisememberResponse ListEcarEnterprisememberEx(ListEcarEnterprisememberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEcarEnterprisememberResponse>(DoRequest("1.0", "antchain.carbon.ecar.enterprisemember.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
         * Summary: 机构会员列表查询
         */
        public async Task<ListEcarEnterprisememberResponse> ListEcarEnterprisememberExAsync(ListEcarEnterprisememberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEcarEnterprisememberResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.enterprisemember.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
         * Summary: 碳普惠项目数据预览
         */
        public PreviewEcarOffsetdatumResponse PreviewEcarOffsetdatum(PreviewEcarOffsetdatumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewEcarOffsetdatumEx(request, headers, runtime);
        }

        /**
         * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
         * Summary: 碳普惠项目数据预览
         */
        public async Task<PreviewEcarOffsetdatumResponse> PreviewEcarOffsetdatumAsync(PreviewEcarOffsetdatumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewEcarOffsetdatumExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
         * Summary: 碳普惠项目数据预览
         */
        public PreviewEcarOffsetdatumResponse PreviewEcarOffsetdatumEx(PreviewEcarOffsetdatumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewEcarOffsetdatumResponse>(DoRequest("1.0", "antchain.carbon.ecar.offsetdatum.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
         * Summary: 碳普惠项目数据预览
         */
        public async Task<PreviewEcarOffsetdatumResponse> PreviewEcarOffsetdatumExAsync(PreviewEcarOffsetdatumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewEcarOffsetdatumResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.offsetdatum.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
         * Summary: 单个机构会员信息查询
         */
        public DetailEcarEnterprisememberResponse DetailEcarEnterprisemember(DetailEcarEnterprisememberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailEcarEnterprisememberEx(request, headers, runtime);
        }

        /**
         * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
         * Summary: 单个机构会员信息查询
         */
        public async Task<DetailEcarEnterprisememberResponse> DetailEcarEnterprisememberAsync(DetailEcarEnterprisememberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailEcarEnterprisememberExAsync(request, headers, runtime);
        }

        /**
         * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
         * Summary: 单个机构会员信息查询
         */
        public DetailEcarEnterprisememberResponse DetailEcarEnterprisememberEx(DetailEcarEnterprisememberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailEcarEnterprisememberResponse>(DoRequest("1.0", "antchain.carbon.ecar.enterprisemember.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
         * Summary: 单个机构会员信息查询
         */
        public async Task<DetailEcarEnterprisememberResponse> DetailEcarEnterprisememberExAsync(DetailEcarEnterprisememberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailEcarEnterprisememberResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.enterprisemember.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
         * Summary: 碳补偿项目账户查询
         */
        public QueryEcarOffsetaccountResponse QueryEcarOffsetaccount(QueryEcarOffsetaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEcarOffsetaccountEx(request, headers, runtime);
        }

        /**
         * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
         * Summary: 碳补偿项目账户查询
         */
        public async Task<QueryEcarOffsetaccountResponse> QueryEcarOffsetaccountAsync(QueryEcarOffsetaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEcarOffsetaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
         * Summary: 碳补偿项目账户查询
         */
        public QueryEcarOffsetaccountResponse QueryEcarOffsetaccountEx(QueryEcarOffsetaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEcarOffsetaccountResponse>(DoRequest("1.0", "antchain.carbon.ecar.offsetaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
         * Summary: 碳补偿项目账户查询
         */
        public async Task<QueryEcarOffsetaccountResponse> QueryEcarOffsetaccountExAsync(QueryEcarOffsetaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEcarOffsetaccountResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.offsetaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询碳补偿数据详情
         * Summary: 碳补偿数据详情
         */
        public DetailEcarOffsetdatumResponse DetailEcarOffsetdatum(DetailEcarOffsetdatumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailEcarOffsetdatumEx(request, headers, runtime);
        }

        /**
         * Description: 查询碳补偿数据详情
         * Summary: 碳补偿数据详情
         */
        public async Task<DetailEcarOffsetdatumResponse> DetailEcarOffsetdatumAsync(DetailEcarOffsetdatumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailEcarOffsetdatumExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询碳补偿数据详情
         * Summary: 碳补偿数据详情
         */
        public DetailEcarOffsetdatumResponse DetailEcarOffsetdatumEx(DetailEcarOffsetdatumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailEcarOffsetdatumResponse>(DoRequest("1.0", "antchain.carbon.ecar.offsetdatum.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询碳补偿数据详情
         * Summary: 碳补偿数据详情
         */
        public async Task<DetailEcarOffsetdatumResponse> DetailEcarOffsetdatumExAsync(DetailEcarOffsetdatumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailEcarOffsetdatumResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.offsetdatum.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询碳普惠减碳量转移记录详情
         * Summary: 碳普惠减碳量转移记录详情
         */
        public DetailEcarOffsettranslateResponse DetailEcarOffsettranslate(DetailEcarOffsettranslateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailEcarOffsettranslateEx(request, headers, runtime);
        }

        /**
         * Description: 查询碳普惠减碳量转移记录详情
         * Summary: 碳普惠减碳量转移记录详情
         */
        public async Task<DetailEcarOffsettranslateResponse> DetailEcarOffsettranslateAsync(DetailEcarOffsettranslateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailEcarOffsettranslateExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询碳普惠减碳量转移记录详情
         * Summary: 碳普惠减碳量转移记录详情
         */
        public DetailEcarOffsettranslateResponse DetailEcarOffsettranslateEx(DetailEcarOffsettranslateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailEcarOffsettranslateResponse>(DoRequest("1.0", "antchain.carbon.ecar.offsettranslate.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询碳普惠减碳量转移记录详情
         * Summary: 碳普惠减碳量转移记录详情
         */
        public async Task<DetailEcarOffsettranslateResponse> DetailEcarOffsettranslateExAsync(DetailEcarOffsettranslateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailEcarOffsettranslateResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.offsettranslate.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
         * Summary: 平台方LCA评估结果提交
         */
        public SubmitEcarLcaassementResponse SubmitEcarLcaassement(SubmitEcarLcaassementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitEcarLcaassementEx(request, headers, runtime);
        }

        /**
         * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
         * Summary: 平台方LCA评估结果提交
         */
        public async Task<SubmitEcarLcaassementResponse> SubmitEcarLcaassementAsync(SubmitEcarLcaassementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitEcarLcaassementExAsync(request, headers, runtime);
        }

        /**
         * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
         * Summary: 平台方LCA评估结果提交
         */
        public SubmitEcarLcaassementResponse SubmitEcarLcaassementEx(SubmitEcarLcaassementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitEcarLcaassementResponse>(DoRequest("1.0", "antchain.carbon.ecar.lcaassement.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
         * Summary: 平台方LCA评估结果提交
         */
        public async Task<SubmitEcarLcaassementResponse> SubmitEcarLcaassementExAsync(SubmitEcarLcaassementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitEcarLcaassementResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.lcaassement.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方平台文件上传
         * Summary: 三方平台文件上传
         */
        public UploadEcarPlaformfileResponse UploadEcarPlaformfile(UploadEcarPlaformfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadEcarPlaformfileEx(request, headers, runtime);
        }

        /**
         * Description: 三方平台文件上传
         * Summary: 三方平台文件上传
         */
        public async Task<UploadEcarPlaformfileResponse> UploadEcarPlaformfileAsync(UploadEcarPlaformfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadEcarPlaformfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 三方平台文件上传
         * Summary: 三方平台文件上传
         */
        public UploadEcarPlaformfileResponse UploadEcarPlaformfileEx(UploadEcarPlaformfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.carbon.ecar.plaformfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadEcarPlaformfileResponse uploadEcarPlaformfileResponse = new UploadEcarPlaformfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadEcarPlaformfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadEcarPlaformfileResponse>(DoRequest("1.0", "antchain.carbon.ecar.plaformfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方平台文件上传
         * Summary: 三方平台文件上传
         */
        public async Task<UploadEcarPlaformfileResponse> UploadEcarPlaformfileExAsync(UploadEcarPlaformfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.carbon.ecar.plaformfile.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadEcarPlaformfileResponse uploadEcarPlaformfileResponse = new UploadEcarPlaformfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadEcarPlaformfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadEcarPlaformfileResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.plaformfile.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方平台提交LCA订单，同时包括客户入驻信息
         * Summary: LCA订单提交(含客户入驻信息)
         */
        public SubmitEcarLcaorderwithcustomerResponse SubmitEcarLcaorderwithcustomer(SubmitEcarLcaorderwithcustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitEcarLcaorderwithcustomerEx(request, headers, runtime);
        }

        /**
         * Description: 三方平台提交LCA订单，同时包括客户入驻信息
         * Summary: LCA订单提交(含客户入驻信息)
         */
        public async Task<SubmitEcarLcaorderwithcustomerResponse> SubmitEcarLcaorderwithcustomerAsync(SubmitEcarLcaorderwithcustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitEcarLcaorderwithcustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 三方平台提交LCA订单，同时包括客户入驻信息
         * Summary: LCA订单提交(含客户入驻信息)
         */
        public SubmitEcarLcaorderwithcustomerResponse SubmitEcarLcaorderwithcustomerEx(SubmitEcarLcaorderwithcustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitEcarLcaorderwithcustomerResponse>(DoRequest("1.0", "antchain.carbon.ecar.lcaorderwithcustomer.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方平台提交LCA订单，同时包括客户入驻信息
         * Summary: LCA订单提交(含客户入驻信息)
         */
        public async Task<SubmitEcarLcaorderwithcustomerResponse> SubmitEcarLcaorderwithcustomerExAsync(SubmitEcarLcaorderwithcustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitEcarLcaorderwithcustomerResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.lcaorderwithcustomer.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方平台信登token获取
         * Summary: 三方平台获取信登token
         */
        public GetEcarPlaformauthtokenResponse GetEcarPlaformauthtoken(GetEcarPlaformauthtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetEcarPlaformauthtokenEx(request, headers, runtime);
        }

        /**
         * Description: 三方平台信登token获取
         * Summary: 三方平台获取信登token
         */
        public async Task<GetEcarPlaformauthtokenResponse> GetEcarPlaformauthtokenAsync(GetEcarPlaformauthtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetEcarPlaformauthtokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 三方平台信登token获取
         * Summary: 三方平台获取信登token
         */
        public GetEcarPlaformauthtokenResponse GetEcarPlaformauthtokenEx(GetEcarPlaformauthtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEcarPlaformauthtokenResponse>(DoRequest("1.0", "antchain.carbon.ecar.plaformauthtoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方平台信登token获取
         * Summary: 三方平台获取信登token
         */
        public async Task<GetEcarPlaformauthtokenResponse> GetEcarPlaformauthtokenExAsync(GetEcarPlaformauthtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEcarPlaformauthtokenResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.plaformauthtoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: LCA订单查询
         * Summary: LCA订单查询
         */
        public QueryEcarLcaorderResponse QueryEcarLcaorder(QueryEcarLcaorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEcarLcaorderEx(request, headers, runtime);
        }

        /**
         * Description: LCA订单查询
         * Summary: LCA订单查询
         */
        public async Task<QueryEcarLcaorderResponse> QueryEcarLcaorderAsync(QueryEcarLcaorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEcarLcaorderExAsync(request, headers, runtime);
        }

        /**
         * Description: LCA订单查询
         * Summary: LCA订单查询
         */
        public QueryEcarLcaorderResponse QueryEcarLcaorderEx(QueryEcarLcaorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEcarLcaorderResponse>(DoRequest("1.0", "antchain.carbon.ecar.lcaorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: LCA订单查询
         * Summary: LCA订单查询
         */
        public async Task<QueryEcarLcaorderResponse> QueryEcarLcaorderExAsync(QueryEcarLcaorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEcarLcaorderResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.lcaorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绿证发电量数据上报接口
         * Summary: 绿证发电量数据上报接口
         */
        public BatchcreateEcarGreencertificategenerationResponse BatchcreateEcarGreencertificategeneration(BatchcreateEcarGreencertificategenerationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateEcarGreencertificategenerationEx(request, headers, runtime);
        }

        /**
         * Description: 绿证发电量数据上报接口
         * Summary: 绿证发电量数据上报接口
         */
        public async Task<BatchcreateEcarGreencertificategenerationResponse> BatchcreateEcarGreencertificategenerationAsync(BatchcreateEcarGreencertificategenerationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateEcarGreencertificategenerationExAsync(request, headers, runtime);
        }

        /**
         * Description: 绿证发电量数据上报接口
         * Summary: 绿证发电量数据上报接口
         */
        public BatchcreateEcarGreencertificategenerationResponse BatchcreateEcarGreencertificategenerationEx(BatchcreateEcarGreencertificategenerationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateEcarGreencertificategenerationResponse>(DoRequest("1.0", "antchain.carbon.ecar.greencertificategeneration.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绿证发电量数据上报接口
         * Summary: 绿证发电量数据上报接口
         */
        public async Task<BatchcreateEcarGreencertificategenerationResponse> BatchcreateEcarGreencertificategenerationExAsync(BatchcreateEcarGreencertificategenerationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateEcarGreencertificategenerationResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.greencertificategeneration.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品碳足迹速算请求提交
         * Summary: 产品碳足迹速算请求提交
         */
        public SubmitEcarLcacalcResponse SubmitEcarLcacalc(SubmitEcarLcacalcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitEcarLcacalcEx(request, headers, runtime);
        }

        /**
         * Description: 产品碳足迹速算请求提交
         * Summary: 产品碳足迹速算请求提交
         */
        public async Task<SubmitEcarLcacalcResponse> SubmitEcarLcacalcAsync(SubmitEcarLcacalcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitEcarLcacalcExAsync(request, headers, runtime);
        }

        /**
         * Description: 产品碳足迹速算请求提交
         * Summary: 产品碳足迹速算请求提交
         */
        public SubmitEcarLcacalcResponse SubmitEcarLcacalcEx(SubmitEcarLcacalcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitEcarLcacalcResponse>(DoRequest("1.0", "antchain.carbon.ecar.lcacalc.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品碳足迹速算请求提交
         * Summary: 产品碳足迹速算请求提交
         */
        public async Task<SubmitEcarLcacalcResponse> SubmitEcarLcacalcExAsync(SubmitEcarLcacalcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitEcarLcacalcResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.lcacalc.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品碳足迹速算结果查询
         * Summary: 产品碳足迹速算结果查询
         */
        public QueryEcarLcacalcResponse QueryEcarLcacalc(QueryEcarLcacalcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEcarLcacalcEx(request, headers, runtime);
        }

        /**
         * Description: 产品碳足迹速算结果查询
         * Summary: 产品碳足迹速算结果查询
         */
        public async Task<QueryEcarLcacalcResponse> QueryEcarLcacalcAsync(QueryEcarLcacalcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEcarLcacalcExAsync(request, headers, runtime);
        }

        /**
         * Description: 产品碳足迹速算结果查询
         * Summary: 产品碳足迹速算结果查询
         */
        public QueryEcarLcacalcResponse QueryEcarLcacalcEx(QueryEcarLcacalcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEcarLcacalcResponse>(DoRequest("1.0", "antchain.carbon.ecar.lcacalc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品碳足迹速算结果查询
         * Summary: 产品碳足迹速算结果查询
         */
        public async Task<QueryEcarLcacalcResponse> QueryEcarLcacalcExAsync(QueryEcarLcacalcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEcarLcacalcResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.lcacalc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发电数据文件导入开放接口
         * Summary: 发电数据文件导入开放接口
         */
        public SubmitEcarGreencertificategenerationfileResponse SubmitEcarGreencertificategenerationfile(SubmitEcarGreencertificategenerationfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitEcarGreencertificategenerationfileEx(request, headers, runtime);
        }

        /**
         * Description: 发电数据文件导入开放接口
         * Summary: 发电数据文件导入开放接口
         */
        public async Task<SubmitEcarGreencertificategenerationfileResponse> SubmitEcarGreencertificategenerationfileAsync(SubmitEcarGreencertificategenerationfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitEcarGreencertificategenerationfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 发电数据文件导入开放接口
         * Summary: 发电数据文件导入开放接口
         */
        public SubmitEcarGreencertificategenerationfileResponse SubmitEcarGreencertificategenerationfileEx(SubmitEcarGreencertificategenerationfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.carbon.ecar.greencertificategenerationfile.submit",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    SubmitEcarGreencertificategenerationfileResponse submitEcarGreencertificategenerationfileResponse = new SubmitEcarGreencertificategenerationfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return submitEcarGreencertificategenerationfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitEcarGreencertificategenerationfileResponse>(DoRequest("1.0", "antchain.carbon.ecar.greencertificategenerationfile.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发电数据文件导入开放接口
         * Summary: 发电数据文件导入开放接口
         */
        public async Task<SubmitEcarGreencertificategenerationfileResponse> SubmitEcarGreencertificategenerationfileExAsync(SubmitEcarGreencertificategenerationfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.carbon.ecar.greencertificategenerationfile.submit",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    SubmitEcarGreencertificategenerationfileResponse submitEcarGreencertificategenerationfileResponse = new SubmitEcarGreencertificategenerationfileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return submitEcarGreencertificategenerationfileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitEcarGreencertificategenerationfileResponse>(await DoRequestAsync("1.0", "antchain.carbon.ecar.greencertificategenerationfile.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方平台调用此接口，查询用户的证书信息
         * Summary: 证书查询
         */
        public QueryThirdCertResponse QueryThirdCert(QueryThirdCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryThirdCertEx(request, headers, runtime);
        }

        /**
         * Description: 三方平台调用此接口，查询用户的证书信息
         * Summary: 证书查询
         */
        public async Task<QueryThirdCertResponse> QueryThirdCertAsync(QueryThirdCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryThirdCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 三方平台调用此接口，查询用户的证书信息
         * Summary: 证书查询
         */
        public QueryThirdCertResponse QueryThirdCertEx(QueryThirdCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThirdCertResponse>(DoRequest("1.0", "antchain.carbon.third.cert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方平台调用此接口，查询用户的证书信息
         * Summary: 证书查询
         */
        public async Task<QueryThirdCertResponse> QueryThirdCertExAsync(QueryThirdCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThirdCertResponse>(await DoRequestAsync("1.0", "antchain.carbon.third.cert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
