// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.INTELLICAR.Models;

namespace AntChain.SDK.INTELLICAR
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
                        {"sdk_version", "1.0.34"},
                        {"_prod_code", "INTELLICAR"},
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
                        {"sdk_version", "1.0.34"},
                        {"_prod_code", "INTELLICAR"},
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

        /**
         * Description: 推送星贷车信息
         * Summary: 推送星贷车信息
         */
        public PushCarloanResponse PushCarloan(PushCarloanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushCarloanEx(request, headers, runtime);
        }

        /**
         * Description: 推送星贷车信息
         * Summary: 推送星贷车信息
         */
        public async Task<PushCarloanResponse> PushCarloanAsync(PushCarloanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushCarloanExAsync(request, headers, runtime);
        }

        /**
         * Description: 推送星贷车信息
         * Summary: 推送星贷车信息
         */
        public PushCarloanResponse PushCarloanEx(PushCarloanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushCarloanResponse>(DoRequest("1.0", "antdigital.intellicar.carloan.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送星贷车信息
         * Summary: 推送星贷车信息
         */
        public async Task<PushCarloanResponse> PushCarloanExAsync(PushCarloanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushCarloanResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.carloan.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车主信息提交
         * Summary:  车主信息提交
         */
        public RegisterCarownerResponse RegisterCarowner(RegisterCarownerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterCarownerEx(request, headers, runtime);
        }

        /**
         * Description: 车主信息提交
         * Summary:  车主信息提交
         */
        public async Task<RegisterCarownerResponse> RegisterCarownerAsync(RegisterCarownerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterCarownerExAsync(request, headers, runtime);
        }

        /**
         * Description: 车主信息提交
         * Summary:  车主信息提交
         */
        public RegisterCarownerResponse RegisterCarownerEx(RegisterCarownerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterCarownerResponse>(DoRequest("1.0", "antdigital.intellicar.carowner.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车主信息提交
         * Summary:  车主信息提交
         */
        public async Task<RegisterCarownerResponse> RegisterCarownerExAsync(RegisterCarownerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterCarownerResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.carowner.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新车线索批量提交
         * Summary: 新车线索批量提交
         */
        public BatchcreateNewcarResponse BatchcreateNewcar(BatchcreateNewcarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateNewcarEx(request, headers, runtime);
        }

        /**
         * Description: 新车线索批量提交
         * Summary: 新车线索批量提交
         */
        public async Task<BatchcreateNewcarResponse> BatchcreateNewcarAsync(BatchcreateNewcarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateNewcarExAsync(request, headers, runtime);
        }

        /**
         * Description: 新车线索批量提交
         * Summary: 新车线索批量提交
         */
        public BatchcreateNewcarResponse BatchcreateNewcarEx(BatchcreateNewcarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateNewcarResponse>(DoRequest("1.0", "antdigital.intellicar.newcar.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新车线索批量提交
         * Summary: 新车线索批量提交
         */
        public async Task<BatchcreateNewcarResponse> BatchcreateNewcarExAsync(BatchcreateNewcarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateNewcarResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.newcar.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交新车线索
         * Summary:  提交新车线索
         */
        public SubmitNewcarResponse SubmitNewcar(SubmitNewcarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitNewcarEx(request, headers, runtime);
        }

        /**
         * Description: 提交新车线索
         * Summary:  提交新车线索
         */
        public async Task<SubmitNewcarResponse> SubmitNewcarAsync(SubmitNewcarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitNewcarExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交新车线索
         * Summary:  提交新车线索
         */
        public SubmitNewcarResponse SubmitNewcarEx(SubmitNewcarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitNewcarResponse>(DoRequest("1.0", "antdigital.intellicar.newcar.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交新车线索
         * Summary:  提交新车线索
         */
        public async Task<SubmitNewcarResponse> SubmitNewcarExAsync(SubmitNewcarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitNewcarResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.newcar.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 常岳线索推送接口
         * Summary: 常岳线索推送
         */
        public RegisterCarownerCyResponse RegisterCarownerCy(RegisterCarownerCyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterCarownerCyEx(request, headers, runtime);
        }

        /**
         * Description: 常岳线索推送接口
         * Summary: 常岳线索推送
         */
        public async Task<RegisterCarownerCyResponse> RegisterCarownerCyAsync(RegisterCarownerCyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterCarownerCyExAsync(request, headers, runtime);
        }

        /**
         * Description: 常岳线索推送接口
         * Summary: 常岳线索推送
         */
        public RegisterCarownerCyResponse RegisterCarownerCyEx(RegisterCarownerCyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterCarownerCyResponse>(DoRequest("1.0", "antdigital.intellicar.carowner.cy.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 常岳线索推送接口
         * Summary: 常岳线索推送
         */
        public async Task<RegisterCarownerCyResponse> RegisterCarownerCyExAsync(RegisterCarownerCyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterCarownerCyResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.carowner.cy.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车辆价格查询
         * Summary: 车辆价格查询
         */
        public QueryCarPriceResponse QueryCarPrice(QueryCarPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCarPriceEx(request, headers, runtime);
        }

        /**
         * Description: 车辆价格查询
         * Summary: 车辆价格查询
         */
        public async Task<QueryCarPriceResponse> QueryCarPriceAsync(QueryCarPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCarPriceExAsync(request, headers, runtime);
        }

        /**
         * Description: 车辆价格查询
         * Summary: 车辆价格查询
         */
        public QueryCarPriceResponse QueryCarPriceEx(QueryCarPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarPriceResponse>(DoRequest("1.0", "antdigital.intellicar.car.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车辆价格查询
         * Summary: 车辆价格查询
         */
        public async Task<QueryCarPriceResponse> QueryCarPriceExAsync(QueryCarPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarPriceResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.car.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件引入
         * Summary: 文件引入
         */
        public ImportCarFileResponse ImportCarFile(ImportCarFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportCarFileEx(request, headers, runtime);
        }

        /**
         * Description: 文件引入
         * Summary: 文件引入
         */
        public async Task<ImportCarFileResponse> ImportCarFileAsync(ImportCarFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportCarFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件引入
         * Summary: 文件引入
         */
        public ImportCarFileResponse ImportCarFileEx(ImportCarFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.intellicar.car.file.import",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ImportCarFileResponse importCarFileResponse = new ImportCarFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importCarFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCarFileResponse>(DoRequest("1.0", "antdigital.intellicar.car.file.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件引入
         * Summary: 文件引入
         */
        public async Task<ImportCarFileResponse> ImportCarFileExAsync(ImportCarFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.intellicar.car.file.import",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ImportCarFileResponse importCarFileResponse = new ImportCarFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importCarFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCarFileResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.car.file.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汽车之家区域接口
         * Summary: 汽车之家区域接口
         */
        public QueryUsedcarResponse QueryUsedcar(QueryUsedcarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUsedcarEx(request, headers, runtime);
        }

        /**
         * Description: 汽车之家区域接口
         * Summary: 汽车之家区域接口
         */
        public async Task<QueryUsedcarResponse> QueryUsedcarAsync(QueryUsedcarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUsedcarExAsync(request, headers, runtime);
        }

        /**
         * Description: 汽车之家区域接口
         * Summary: 汽车之家区域接口
         */
        public QueryUsedcarResponse QueryUsedcarEx(QueryUsedcarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarResponse>(DoRequest("1.0", "antdigital.intellicar.usedcar.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汽车之家区域接口
         * Summary: 汽车之家区域接口
         */
        public async Task<QueryUsedcarResponse> QueryUsedcarExAsync(QueryUsedcarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.usedcar.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 逸安启回调接口
         * Summary: 逸安启回调接口
         */
        public SubmitIonchiResponse SubmitIonchi(SubmitIonchiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitIonchiEx(request, headers, runtime);
        }

        /**
         * Description: 逸安启回调接口
         * Summary: 逸安启回调接口
         */
        public async Task<SubmitIonchiResponse> SubmitIonchiAsync(SubmitIonchiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitIonchiExAsync(request, headers, runtime);
        }

        /**
         * Description: 逸安启回调接口
         * Summary: 逸安启回调接口
         */
        public SubmitIonchiResponse SubmitIonchiEx(SubmitIonchiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitIonchiResponse>(DoRequest("1.0", "antdigital.intellicar.ionchi.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 逸安启回调接口
         * Summary: 逸安启回调接口
         */
        public async Task<SubmitIonchiResponse> SubmitIonchiExAsync(SubmitIonchiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitIonchiResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.ionchi.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对接高德，查询潜客流向以及重叠的数据
         * Summary: 【高德】流向与重叠数据
         */
        public QueryGdFlowResponse QueryGdFlow(QueryGdFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGdFlowEx(request, headers, runtime);
        }

        /**
         * Description: 对接高德，查询潜客流向以及重叠的数据
         * Summary: 【高德】流向与重叠数据
         */
        public async Task<QueryGdFlowResponse> QueryGdFlowAsync(QueryGdFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGdFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 对接高德，查询潜客流向以及重叠的数据
         * Summary: 【高德】流向与重叠数据
         */
        public QueryGdFlowResponse QueryGdFlowEx(QueryGdFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGdFlowResponse>(DoRequest("1.0", "antdigital.intellicar.gd.flow.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对接高德，查询潜客流向以及重叠的数据
         * Summary: 【高德】流向与重叠数据
         */
        public async Task<QueryGdFlowResponse> QueryGdFlowExAsync(QueryGdFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGdFlowResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.gd.flow.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电池衰退权益报告查询接口
         * Summary: 电池衰退权益报告查询接口
         */
        public QueryBatteryReportResponse QueryBatteryReport(QueryBatteryReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBatteryReportEx(request, headers, runtime);
        }

        /**
         * Description: 电池衰退权益报告查询接口
         * Summary: 电池衰退权益报告查询接口
         */
        public async Task<QueryBatteryReportResponse> QueryBatteryReportAsync(QueryBatteryReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBatteryReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 电池衰退权益报告查询接口
         * Summary: 电池衰退权益报告查询接口
         */
        public QueryBatteryReportResponse QueryBatteryReportEx(QueryBatteryReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBatteryReportResponse>(DoRequest("1.0", "antdigital.intellicar.battery.report.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电池衰退权益报告查询接口
         * Summary: 电池衰退权益报告查询接口
         */
        public async Task<QueryBatteryReportResponse> QueryBatteryReportExAsync(QueryBatteryReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBatteryReportResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.battery.report.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用来查询汽车之家车型和城市列表
         * Summary: 用来查询汽车之家车型和城市列表
         */
        public QueryNewcarQczjResponse QueryNewcarQczj(QueryNewcarQczjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNewcarQczjEx(request, headers, runtime);
        }

        /**
         * Description: 用来查询汽车之家车型和城市列表
         * Summary: 用来查询汽车之家车型和城市列表
         */
        public async Task<QueryNewcarQczjResponse> QueryNewcarQczjAsync(QueryNewcarQczjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNewcarQczjExAsync(request, headers, runtime);
        }

        /**
         * Description: 用来查询汽车之家车型和城市列表
         * Summary: 用来查询汽车之家车型和城市列表
         */
        public QueryNewcarQczjResponse QueryNewcarQczjEx(QueryNewcarQczjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNewcarQczjResponse>(DoRequest("1.0", "antdigital.intellicar.newcar.qczj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用来查询汽车之家车型和城市列表
         * Summary: 用来查询汽车之家车型和城市列表
         */
        public async Task<QueryNewcarQczjResponse> QueryNewcarQczjExAsync(QueryNewcarQczjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNewcarQczjResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.newcar.qczj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 【高德】查询店铺基本信息
         * Summary: 【高德】查询店铺基本信息
         */
        public QueryGdStoreResponse QueryGdStore(QueryGdStoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGdStoreEx(request, headers, runtime);
        }

        /**
         * Description: 【高德】查询店铺基本信息
         * Summary: 【高德】查询店铺基本信息
         */
        public async Task<QueryGdStoreResponse> QueryGdStoreAsync(QueryGdStoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGdStoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 【高德】查询店铺基本信息
         * Summary: 【高德】查询店铺基本信息
         */
        public QueryGdStoreResponse QueryGdStoreEx(QueryGdStoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGdStoreResponse>(DoRequest("1.0", "antdigital.intellicar.gd.store.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 【高德】查询店铺基本信息
         * Summary: 【高德】查询店铺基本信息
         */
        public async Task<QueryGdStoreResponse> QueryGdStoreExAsync(QueryGdStoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGdStoreResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.gd.store.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 【高德】潜客指数数据
         * Summary: 【高德】潜客指数数据
         */
        public QueryGdPoentialResponse QueryGdPoential(QueryGdPoentialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGdPoentialEx(request, headers, runtime);
        }

        /**
         * Description: 【高德】潜客指数数据
         * Summary: 【高德】潜客指数数据
         */
        public async Task<QueryGdPoentialResponse> QueryGdPoentialAsync(QueryGdPoentialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGdPoentialExAsync(request, headers, runtime);
        }

        /**
         * Description: 【高德】潜客指数数据
         * Summary: 【高德】潜客指数数据
         */
        public QueryGdPoentialResponse QueryGdPoentialEx(QueryGdPoentialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGdPoentialResponse>(DoRequest("1.0", "antdigital.intellicar.gd.poential.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 【高德】潜客指数数据
         * Summary: 【高德】潜客指数数据
         */
        public async Task<QueryGdPoentialResponse> QueryGdPoentialExAsync(QueryGdPoentialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGdPoentialResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.gd.poential.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对接车道山前擦碰无忧接口
         * Summary: 对接车道山前擦碰无忧接口
         */
        public RegisterCdsqScratchesResponse RegisterCdsqScratches(RegisterCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterCdsqScratchesEx(request, headers, runtime);
        }

        /**
         * Description: 对接车道山前擦碰无忧接口
         * Summary: 对接车道山前擦碰无忧接口
         */
        public async Task<RegisterCdsqScratchesResponse> RegisterCdsqScratchesAsync(RegisterCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterCdsqScratchesExAsync(request, headers, runtime);
        }

        /**
         * Description: 对接车道山前擦碰无忧接口
         * Summary: 对接车道山前擦碰无忧接口
         */
        public RegisterCdsqScratchesResponse RegisterCdsqScratchesEx(RegisterCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterCdsqScratchesResponse>(DoRequest("1.0", "antdigital.intellicar.cdsq.scratches.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对接车道山前擦碰无忧接口
         * Summary: 对接车道山前擦碰无忧接口
         */
        public async Task<RegisterCdsqScratchesResponse> RegisterCdsqScratchesExAsync(RegisterCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterCdsqScratchesResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.cdsq.scratches.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车到山前查询权益接口
         * Summary: 车到山前查询权益接口
         */
        public QueryCdsqScratchesResponse QueryCdsqScratches(QueryCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCdsqScratchesEx(request, headers, runtime);
        }

        /**
         * Description: 车到山前查询权益接口
         * Summary: 车到山前查询权益接口
         */
        public async Task<QueryCdsqScratchesResponse> QueryCdsqScratchesAsync(QueryCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCdsqScratchesExAsync(request, headers, runtime);
        }

        /**
         * Description: 车到山前查询权益接口
         * Summary: 车到山前查询权益接口
         */
        public QueryCdsqScratchesResponse QueryCdsqScratchesEx(QueryCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCdsqScratchesResponse>(DoRequest("1.0", "antdigital.intellicar.cdsq.scratches.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车到山前查询权益接口
         * Summary: 车到山前查询权益接口
         */
        public async Task<QueryCdsqScratchesResponse> QueryCdsqScratchesExAsync(QueryCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCdsqScratchesResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.cdsq.scratches.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车到山前权益退保接口
         * Summary: 车到山前权益退保接口
         */
        public DeleteCdsqScratchesResponse DeleteCdsqScratches(DeleteCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteCdsqScratchesEx(request, headers, runtime);
        }

        /**
         * Description: 车到山前权益退保接口
         * Summary: 车到山前权益退保接口
         */
        public async Task<DeleteCdsqScratchesResponse> DeleteCdsqScratchesAsync(DeleteCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteCdsqScratchesExAsync(request, headers, runtime);
        }

        /**
         * Description: 车到山前权益退保接口
         * Summary: 车到山前权益退保接口
         */
        public DeleteCdsqScratchesResponse DeleteCdsqScratchesEx(DeleteCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCdsqScratchesResponse>(DoRequest("1.0", "antdigital.intellicar.cdsq.scratches.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车到山前权益退保接口
         * Summary: 车到山前权益退保接口
         */
        public async Task<DeleteCdsqScratchesResponse> DeleteCdsqScratchesExAsync(DeleteCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCdsqScratchesResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.cdsq.scratches.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车到山前权益退保回调接口
         * Summary: 车到山前权益退保回调接口
         */
        public CallbackCdsqScratchesResponse CallbackCdsqScratches(CallbackCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackCdsqScratchesEx(request, headers, runtime);
        }

        /**
         * Description: 车到山前权益退保回调接口
         * Summary: 车到山前权益退保回调接口
         */
        public async Task<CallbackCdsqScratchesResponse> CallbackCdsqScratchesAsync(CallbackCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackCdsqScratchesExAsync(request, headers, runtime);
        }

        /**
         * Description: 车到山前权益退保回调接口
         * Summary: 车到山前权益退保回调接口
         */
        public CallbackCdsqScratchesResponse CallbackCdsqScratchesEx(CallbackCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackCdsqScratchesResponse>(DoRequest("1.0", "antdigital.intellicar.cdsq.scratches.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车到山前权益退保回调接口
         * Summary: 车到山前权益退保回调接口
         */
        public async Task<CallbackCdsqScratchesResponse> CallbackCdsqScratchesExAsync(CallbackCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackCdsqScratchesResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.cdsq.scratches.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车到山前权益状态查询
         * Summary: 车到山前权益状态查询
         */
        public SaveCdsqScratchesResponse SaveCdsqScratches(SaveCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveCdsqScratchesEx(request, headers, runtime);
        }

        /**
         * Description: 车到山前权益状态查询
         * Summary: 车到山前权益状态查询
         */
        public async Task<SaveCdsqScratchesResponse> SaveCdsqScratchesAsync(SaveCdsqScratchesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveCdsqScratchesExAsync(request, headers, runtime);
        }

        /**
         * Description: 车到山前权益状态查询
         * Summary: 车到山前权益状态查询
         */
        public SaveCdsqScratchesResponse SaveCdsqScratchesEx(SaveCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveCdsqScratchesResponse>(DoRequest("1.0", "antdigital.intellicar.cdsq.scratches.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车到山前权益状态查询
         * Summary: 车到山前权益状态查询
         */
        public async Task<SaveCdsqScratchesResponse> SaveCdsqScratchesExAsync(SaveCdsqScratchesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveCdsqScratchesResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.cdsq.scratches.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 常岳车贷线索预判接口
         * Summary: 常岳车贷线索预判接口
         */
        public QueryCarVinResponse QueryCarVin(QueryCarVinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCarVinEx(request, headers, runtime);
        }

        /**
         * Description: 常岳车贷线索预判接口
         * Summary: 常岳车贷线索预判接口
         */
        public async Task<QueryCarVinResponse> QueryCarVinAsync(QueryCarVinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCarVinExAsync(request, headers, runtime);
        }

        /**
         * Description: 常岳车贷线索预判接口
         * Summary: 常岳车贷线索预判接口
         */
        public QueryCarVinResponse QueryCarVinEx(QueryCarVinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarVinResponse>(DoRequest("1.0", "antdigital.intellicar.car.vin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 常岳车贷线索预判接口
         * Summary: 常岳车贷线索预判接口
         */
        public async Task<QueryCarVinResponse> QueryCarVinExAsync(QueryCarVinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarVinResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.car.vin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长安画像标签授权接口
         * Summary: 长安画像标签授权接口
         */
        public RegisterTagChanganResponse RegisterTagChangan(RegisterTagChanganRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterTagChanganEx(request, headers, runtime);
        }

        /**
         * Description: 长安画像标签授权接口
         * Summary: 长安画像标签授权接口
         */
        public async Task<RegisterTagChanganResponse> RegisterTagChanganAsync(RegisterTagChanganRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterTagChanganExAsync(request, headers, runtime);
        }

        /**
         * Description: 长安画像标签授权接口
         * Summary: 长安画像标签授权接口
         */
        public RegisterTagChanganResponse RegisterTagChanganEx(RegisterTagChanganRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterTagChanganResponse>(DoRequest("1.0", "antdigital.intellicar.tag.changan.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长安画像标签授权接口
         * Summary: 长安画像标签授权接口
         */
        public async Task<RegisterTagChanganResponse> RegisterTagChanganExAsync(RegisterTagChanganRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterTagChanganResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.tag.changan.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长安画像标签用户id标签查询1
         * Summary: 长安画像标签用户id标签查询1
         */
        public QueryTagChanganResponse QueryTagChangan(QueryTagChanganRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTagChanganEx(request, headers, runtime);
        }

        /**
         * Description: 长安画像标签用户id标签查询1
         * Summary: 长安画像标签用户id标签查询1
         */
        public async Task<QueryTagChanganResponse> QueryTagChanganAsync(QueryTagChanganRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTagChanganExAsync(request, headers, runtime);
        }

        /**
         * Description: 长安画像标签用户id标签查询1
         * Summary: 长安画像标签用户id标签查询1
         */
        public QueryTagChanganResponse QueryTagChanganEx(QueryTagChanganRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTagChanganResponse>(DoRequest("1.0", "antdigital.intellicar.tag.changan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长安画像标签用户id标签查询1
         * Summary: 长安画像标签用户id标签查询1
         */
        public async Task<QueryTagChanganResponse> QueryTagChanganExAsync(QueryTagChanganRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTagChanganResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.tag.changan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汽车之家区域接口
         * Summary: 汽车之家区域接口
         */
        public QueryUsedcarAreaResponse QueryUsedcarArea(QueryUsedcarAreaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUsedcarAreaEx(request, headers, runtime);
        }

        /**
         * Description: 汽车之家区域接口
         * Summary: 汽车之家区域接口
         */
        public async Task<QueryUsedcarAreaResponse> QueryUsedcarAreaAsync(QueryUsedcarAreaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUsedcarAreaExAsync(request, headers, runtime);
        }

        /**
         * Description: 汽车之家区域接口
         * Summary: 汽车之家区域接口
         */
        public QueryUsedcarAreaResponse QueryUsedcarAreaEx(QueryUsedcarAreaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarAreaResponse>(DoRequest("1.0", "antdigital.intellicar.usedcar.area.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汽车之家区域接口
         * Summary: 汽车之家区域接口
         */
        public async Task<QueryUsedcarAreaResponse> QueryUsedcarAreaExAsync(QueryUsedcarAreaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarAreaResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.usedcar.area.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取汽车之家品牌信息
         * Summary: 获取汽车之家品牌信息
         */
        public QueryUsedcarBrandsResponse QueryUsedcarBrands(QueryUsedcarBrandsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUsedcarBrandsEx(request, headers, runtime);
        }

        /**
         * Description: 获取汽车之家品牌信息
         * Summary: 获取汽车之家品牌信息
         */
        public async Task<QueryUsedcarBrandsResponse> QueryUsedcarBrandsAsync(QueryUsedcarBrandsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUsedcarBrandsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取汽车之家品牌信息
         * Summary: 获取汽车之家品牌信息
         */
        public QueryUsedcarBrandsResponse QueryUsedcarBrandsEx(QueryUsedcarBrandsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarBrandsResponse>(DoRequest("1.0", "antdigital.intellicar.usedcar.brands.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取汽车之家品牌信息
         * Summary: 获取汽车之家品牌信息
         */
        public async Task<QueryUsedcarBrandsResponse> QueryUsedcarBrandsExAsync(QueryUsedcarBrandsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarBrandsResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.usedcar.brands.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汽车之家车系接口
         * Summary: 汽车之家车系接口
         */
        public QueryUsedcarSeriesResponse QueryUsedcarSeries(QueryUsedcarSeriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUsedcarSeriesEx(request, headers, runtime);
        }

        /**
         * Description: 汽车之家车系接口
         * Summary: 汽车之家车系接口
         */
        public async Task<QueryUsedcarSeriesResponse> QueryUsedcarSeriesAsync(QueryUsedcarSeriesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUsedcarSeriesExAsync(request, headers, runtime);
        }

        /**
         * Description: 汽车之家车系接口
         * Summary: 汽车之家车系接口
         */
        public QueryUsedcarSeriesResponse QueryUsedcarSeriesEx(QueryUsedcarSeriesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarSeriesResponse>(DoRequest("1.0", "antdigital.intellicar.usedcar.series.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汽车之家车系接口
         * Summary: 汽车之家车系接口
         */
        public async Task<QueryUsedcarSeriesResponse> QueryUsedcarSeriesExAsync(QueryUsedcarSeriesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarSeriesResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.usedcar.series.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汽车之家车型接口
         * Summary: 汽车之家车型接口
         */
        public QueryUsedcarProductsResponse QueryUsedcarProducts(QueryUsedcarProductsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUsedcarProductsEx(request, headers, runtime);
        }

        /**
         * Description: 汽车之家车型接口
         * Summary: 汽车之家车型接口
         */
        public async Task<QueryUsedcarProductsResponse> QueryUsedcarProductsAsync(QueryUsedcarProductsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUsedcarProductsExAsync(request, headers, runtime);
        }

        /**
         * Description: 汽车之家车型接口
         * Summary: 汽车之家车型接口
         */
        public QueryUsedcarProductsResponse QueryUsedcarProductsEx(QueryUsedcarProductsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarProductsResponse>(DoRequest("1.0", "antdigital.intellicar.usedcar.products.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汽车之家车型接口
         * Summary: 汽车之家车型接口
         */
        public async Task<QueryUsedcarProductsResponse> QueryUsedcarProductsExAsync(QueryUsedcarProductsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUsedcarProductsResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.usedcar.products.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取二手车线索状态
         * Summary: 获取二手车线索状态
         */
        public SyncUsedcarResponse SyncUsedcar(SyncUsedcarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncUsedcarEx(request, headers, runtime);
        }

        /**
         * Description: 获取二手车线索状态
         * Summary: 获取二手车线索状态
         */
        public async Task<SyncUsedcarResponse> SyncUsedcarAsync(SyncUsedcarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncUsedcarExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取二手车线索状态
         * Summary: 获取二手车线索状态
         */
        public SyncUsedcarResponse SyncUsedcarEx(SyncUsedcarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncUsedcarResponse>(DoRequest("1.0", "antdigital.intellicar.usedcar.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取二手车线索状态
         * Summary: 获取二手车线索状态
         */
        public async Task<SyncUsedcarResponse> SyncUsedcarExAsync(SyncUsedcarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncUsedcarResponse>(await DoRequestAsync("1.0", "antdigital.intellicar.usedcar.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
