// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.TDM.Models;

namespace AntChain.SDK.TDM
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
                        {"sdk_version", "1.0.12"},
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
                        {"sdk_version", "1.0.12"},
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
         * Description: 公积金证明开具接口
         * Summary: 公积金证明开具接口
         */
        public OpenCpfCertResponse OpenCpfCert(OpenCpfCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenCpfCertEx(request, headers, runtime);
        }

        /**
         * Description: 公积金证明开具接口
         * Summary: 公积金证明开具接口
         */
        public async Task<OpenCpfCertResponse> OpenCpfCertAsync(OpenCpfCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenCpfCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 公积金证明开具接口
         * Summary: 公积金证明开具接口
         */
        public OpenCpfCertResponse OpenCpfCertEx(OpenCpfCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenCpfCertResponse>(DoRequest("1.0", "antchain.tdm.cpf.cert.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 公积金证明开具接口
         * Summary: 公积金证明开具接口
         */
        public async Task<OpenCpfCertResponse> OpenCpfCertExAsync(OpenCpfCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenCpfCertResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.cert.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证明列表查询接口
         * Summary: 证明列表查询接口
         */
        public ListCpfCertResponse ListCpfCert(ListCpfCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCpfCertEx(request, headers, runtime);
        }

        /**
         * Description: 证明列表查询接口
         * Summary: 证明列表查询接口
         */
        public async Task<ListCpfCertResponse> ListCpfCertAsync(ListCpfCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCpfCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 证明列表查询接口
         * Summary: 证明列表查询接口
         */
        public ListCpfCertResponse ListCpfCertEx(ListCpfCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCpfCertResponse>(DoRequest("1.0", "antchain.tdm.cpf.cert.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证明列表查询接口
         * Summary: 证明列表查询接口
         */
        public async Task<ListCpfCertResponse> ListCpfCertExAsync(ListCpfCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCpfCertResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.cert.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 扫码验真
         * Summary: 扫码验真
         */
        public CheckCpfCertResponse CheckCpfCert(CheckCpfCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCpfCertEx(request, headers, runtime);
        }

        /**
         * Description: 扫码验真
         * Summary: 扫码验真
         */
        public async Task<CheckCpfCertResponse> CheckCpfCertAsync(CheckCpfCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCpfCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 扫码验真
         * Summary: 扫码验真
         */
        public CheckCpfCertResponse CheckCpfCertEx(CheckCpfCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCpfCertResponse>(DoRequest("1.0", "antchain.tdm.cpf.cert.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 扫码验真
         * Summary: 扫码验真
         */
        public async Task<CheckCpfCertResponse> CheckCpfCertExAsync(CheckCpfCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCpfCertResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.cert.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证明使用记录保存
         * Summary: 证明使用记录保存
         */
        public SaveCpfCertuseResponse SaveCpfCertuse(SaveCpfCertuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveCpfCertuseEx(request, headers, runtime);
        }

        /**
         * Description: 证明使用记录保存
         * Summary: 证明使用记录保存
         */
        public async Task<SaveCpfCertuseResponse> SaveCpfCertuseAsync(SaveCpfCertuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveCpfCertuseExAsync(request, headers, runtime);
        }

        /**
         * Description: 证明使用记录保存
         * Summary: 证明使用记录保存
         */
        public SaveCpfCertuseResponse SaveCpfCertuseEx(SaveCpfCertuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveCpfCertuseResponse>(DoRequest("1.0", "antchain.tdm.cpf.certuse.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证明使用记录保存
         * Summary: 证明使用记录保存
         */
        public async Task<SaveCpfCertuseResponse> SaveCpfCertuseExAsync(SaveCpfCertuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveCpfCertuseResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.certuse.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构扫码用证
         * Summary: 扫码用证接口
         */
        public GetCpfCertuseResponse GetCpfCertuse(GetCpfCertuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCpfCertuseEx(request, headers, runtime);
        }

        /**
         * Description: 机构扫码用证
         * Summary: 扫码用证接口
         */
        public async Task<GetCpfCertuseResponse> GetCpfCertuseAsync(GetCpfCertuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCpfCertuseExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构扫码用证
         * Summary: 扫码用证接口
         */
        public GetCpfCertuseResponse GetCpfCertuseEx(GetCpfCertuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCpfCertuseResponse>(DoRequest("1.0", "antchain.tdm.cpf.certuse.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构扫码用证
         * Summary: 扫码用证接口
         */
        public async Task<GetCpfCertuseResponse> GetCpfCertuseExAsync(GetCpfCertuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCpfCertuseResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.certuse.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已开具证明查询
         * Summary: 已开具证明查询
         */
        public GetCpfCertResponse GetCpfCert(GetCpfCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCpfCertEx(request, headers, runtime);
        }

        /**
         * Description: 已开具证明查询
         * Summary: 已开具证明查询
         */
        public async Task<GetCpfCertResponse> GetCpfCertAsync(GetCpfCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCpfCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 已开具证明查询
         * Summary: 已开具证明查询
         */
        public GetCpfCertResponse GetCpfCertEx(GetCpfCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCpfCertResponse>(DoRequest("1.0", "antchain.tdm.cpf.cert.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已开具证明查询
         * Summary: 已开具证明查询
         */
        public async Task<GetCpfCertResponse> GetCpfCertExAsync(GetCpfCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCpfCertResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.cert.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证明使用记录查询
         * Summary: 证明使用记录查询
         */
        public ListCpfCertuseResponse ListCpfCertuse(ListCpfCertuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCpfCertuseEx(request, headers, runtime);
        }

        /**
         * Description: 证明使用记录查询
         * Summary: 证明使用记录查询
         */
        public async Task<ListCpfCertuseResponse> ListCpfCertuseAsync(ListCpfCertuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCpfCertuseExAsync(request, headers, runtime);
        }

        /**
         * Description: 证明使用记录查询
         * Summary: 证明使用记录查询
         */
        public ListCpfCertuseResponse ListCpfCertuseEx(ListCpfCertuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCpfCertuseResponse>(DoRequest("1.0", "antchain.tdm.cpf.certuse.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 证明使用记录查询
         * Summary: 证明使用记录查询
         */
        public async Task<ListCpfCertuseResponse> ListCpfCertuseExAsync(ListCpfCertuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCpfCertuseResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.certuse.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构获取用户公积金数据（授权、用数分离时接口）
         * Summary: 数据使用
         */
        public GetCpfDataResponse GetCpfData(GetCpfDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCpfDataEx(request, headers, runtime);
        }

        /**
         * Description: 机构获取用户公积金数据（授权、用数分离时接口）
         * Summary: 数据使用
         */
        public async Task<GetCpfDataResponse> GetCpfDataAsync(GetCpfDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCpfDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构获取用户公积金数据（授权、用数分离时接口）
         * Summary: 数据使用
         */
        public GetCpfDataResponse GetCpfDataEx(GetCpfDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCpfDataResponse>(DoRequest("1.0", "antchain.tdm.cpf.data.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构获取用户公积金数据（授权、用数分离时接口）
         * Summary: 数据使用
         */
        public async Task<GetCpfDataResponse> GetCpfDataExAsync(GetCpfDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCpfDataResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.data.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构用数记录查询
         * Summary: 数据使用记录查询
         */
        public ListCpfDatauseResponse ListCpfDatause(ListCpfDatauseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCpfDatauseEx(request, headers, runtime);
        }

        /**
         * Description: 机构用数记录查询
         * Summary: 数据使用记录查询
         */
        public async Task<ListCpfDatauseResponse> ListCpfDatauseAsync(ListCpfDatauseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCpfDatauseExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构用数记录查询
         * Summary: 数据使用记录查询
         */
        public ListCpfDatauseResponse ListCpfDatauseEx(ListCpfDatauseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCpfDatauseResponse>(DoRequest("1.0", "antchain.tdm.cpf.datause.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构用数记录查询
         * Summary: 数据使用记录查询
         */
        public async Task<ListCpfDatauseResponse> ListCpfDatauseExAsync(ListCpfDatauseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCpfDatauseResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.datause.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户在公积金中心的个人账户、贷款合同信息
         * Summary: 公积金中心用户信息查询
         */
        public QueryCpfUserResponse QueryCpfUser(QueryCpfUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCpfUserEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户在公积金中心的个人账户、贷款合同信息
         * Summary: 公积金中心用户信息查询
         */
        public async Task<QueryCpfUserResponse> QueryCpfUserAsync(QueryCpfUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCpfUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户在公积金中心的个人账户、贷款合同信息
         * Summary: 公积金中心用户信息查询
         */
        public QueryCpfUserResponse QueryCpfUserEx(QueryCpfUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCpfUserResponse>(DoRequest("1.0", "antchain.tdm.cpf.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户在公积金中心的个人账户、贷款合同信息
         * Summary: 公积金中心用户信息查询
         */
        public async Task<QueryCpfUserResponse> QueryCpfUserExAsync(QueryCpfUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCpfUserResponse>(await DoRequestAsync("1.0", "antchain.tdm.cpf.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信数据流转授权
         * Summary: 授权
         */
        public ExecAuthResponse ExecAuth(ExecAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAuthEx(request, headers, runtime);
        }

        /**
         * Description: 可信数据流转授权
         * Summary: 授权
         */
        public async Task<ExecAuthResponse> ExecAuthAsync(ExecAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信数据流转授权
         * Summary: 授权
         */
        public ExecAuthResponse ExecAuthEx(ExecAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAuthResponse>(DoRequest("1.0", "antchain.tdm.auth.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信数据流转授权
         * Summary: 授权
         */
        public async Task<ExecAuthResponse> ExecAuthExAsync(ExecAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAuthResponse>(await DoRequestAsync("1.0", "antchain.tdm.auth.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消授权
         * Summary: 取消授权
         */
        public CancelAuthResponse CancelAuth(CancelAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAuthEx(request, headers, runtime);
        }

        /**
         * Description: 取消授权
         * Summary: 取消授权
         */
        public async Task<CancelAuthResponse> CancelAuthAsync(CancelAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消授权
         * Summary: 取消授权
         */
        public CancelAuthResponse CancelAuthEx(CancelAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAuthResponse>(DoRequest("1.0", "antchain.tdm.auth.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消授权
         * Summary: 取消授权
         */
        public async Task<CancelAuthResponse> CancelAuthExAsync(CancelAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAuthResponse>(await DoRequestAsync("1.0", "antchain.tdm.auth.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用权
         * Summary: 用权
         */
        public QueryAuthResponse QueryAuth(QueryAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuthEx(request, headers, runtime);
        }

        /**
         * Description: 用权
         * Summary: 用权
         */
        public async Task<QueryAuthResponse> QueryAuthAsync(QueryAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 用权
         * Summary: 用权
         */
        public QueryAuthResponse QueryAuthEx(QueryAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthResponse>(DoRequest("1.0", "antchain.tdm.auth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用权
         * Summary: 用权
         */
        public async Task<QueryAuthResponse> QueryAuthExAsync(QueryAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthResponse>(await DoRequestAsync("1.0", "antchain.tdm.auth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权记录查询（个人授权记录查询）
         * Summary: 授权记录查询
         */
        public QueryAuthOwnerResponse QueryAuthOwner(QueryAuthOwnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuthOwnerEx(request, headers, runtime);
        }

        /**
         * Description: 授权记录查询（个人授权记录查询）
         * Summary: 授权记录查询
         */
        public async Task<QueryAuthOwnerResponse> QueryAuthOwnerAsync(QueryAuthOwnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuthOwnerExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权记录查询（个人授权记录查询）
         * Summary: 授权记录查询
         */
        public QueryAuthOwnerResponse QueryAuthOwnerEx(QueryAuthOwnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthOwnerResponse>(DoRequest("1.0", "antchain.tdm.auth.owner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权记录查询（个人授权记录查询）
         * Summary: 授权记录查询
         */
        public async Task<QueryAuthOwnerResponse> QueryAuthOwnerExAsync(QueryAuthOwnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthOwnerResponse>(await DoRequestAsync("1.0", "antchain.tdm.auth.owner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权使用记录查询（个人查询维度）
         * Summary: 授权使用记录查询
         */
        public QueryAuthuseOwnerResponse QueryAuthuseOwner(QueryAuthuseOwnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuthuseOwnerEx(request, headers, runtime);
        }

        /**
         * Description: 授权使用记录查询（个人查询维度）
         * Summary: 授权使用记录查询
         */
        public async Task<QueryAuthuseOwnerResponse> QueryAuthuseOwnerAsync(QueryAuthuseOwnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuthuseOwnerExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权使用记录查询（个人查询维度）
         * Summary: 授权使用记录查询
         */
        public QueryAuthuseOwnerResponse QueryAuthuseOwnerEx(QueryAuthuseOwnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthuseOwnerResponse>(DoRequest("1.0", "antchain.tdm.authuse.owner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权使用记录查询（个人查询维度）
         * Summary: 授权使用记录查询
         */
        public async Task<QueryAuthuseOwnerResponse> QueryAuthuseOwnerExAsync(QueryAuthuseOwnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthuseOwnerResponse>(await DoRequestAsync("1.0", "antchain.tdm.authuse.owner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权数据使用
         * Summary: 授权数据使用
         */
        public ExecAuthuseResponse ExecAuthuse(ExecAuthuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAuthuseEx(request, headers, runtime);
        }

        /**
         * Description: 授权数据使用
         * Summary: 授权数据使用
         */
        public async Task<ExecAuthuseResponse> ExecAuthuseAsync(ExecAuthuseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAuthuseExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权数据使用
         * Summary: 授权数据使用
         */
        public ExecAuthuseResponse ExecAuthuseEx(ExecAuthuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAuthuseResponse>(DoRequest("1.0", "antchain.tdm.authuse.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权数据使用
         * Summary: 授权数据使用
         */
        public async Task<ExecAuthuseResponse> ExecAuthuseExAsync(ExecAuthuseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAuthuseResponse>(await DoRequestAsync("1.0", "antchain.tdm.authuse.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public InitVerifyResponse InitVerify(InitVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public async Task<InitVerifyResponse> InitVerifyAsync(InitVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public InitVerifyResponse InitVerifyEx(InitVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitVerifyResponse>(DoRequest("1.0", "antchain.tdm.verify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public async Task<InitVerifyResponse> InitVerifyExAsync(InitVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitVerifyResponse>(await DoRequestAsync("1.0", "antchain.tdm.verify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
