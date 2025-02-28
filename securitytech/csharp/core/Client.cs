// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.SECURITYTECH.Models;

namespace AntChain.SDK.SECURITYTECH
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
                        {"sdk_version", "1.4.9"},
                        {"_prod_code", "SECURITYTECH"},
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
                        {"sdk_version", "1.4.9"},
                        {"_prod_code", "SECURITYTECH"},
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
         * Description: 安全科技网关通用运行接口
         * Summary: 安全科技网关通用运行接口
         */
        public RunGeneralResponse RunGeneral(RunGeneralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunGeneralEx(request, headers, runtime);
        }

        /**
         * Description: 安全科技网关通用运行接口
         * Summary: 安全科技网关通用运行接口
         */
        public async Task<RunGeneralResponse> RunGeneralAsync(RunGeneralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunGeneralExAsync(request, headers, runtime);
        }

        /**
         * Description: 安全科技网关通用运行接口
         * Summary: 安全科技网关通用运行接口
         */
        public RunGeneralResponse RunGeneralEx(RunGeneralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunGeneralResponse>(DoRequest("1.0", "antsecuritytech.gateway.general.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 安全科技网关通用运行接口
         * Summary: 安全科技网关通用运行接口
         */
        public async Task<RunGeneralResponse> RunGeneralExAsync(RunGeneralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunGeneralResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.general.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
         * Summary: 租赁住房保险产品，接口开放给租房平台
         */
        public ExecEkytInsureResponse ExecEkytInsure(ExecEkytInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecEkytInsureEx(request, headers, runtime);
        }

        /**
         * Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
         * Summary: 租赁住房保险产品，接口开放给租房平台
         */
        public async Task<ExecEkytInsureResponse> ExecEkytInsureAsync(ExecEkytInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecEkytInsureExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
         * Summary: 租赁住房保险产品，接口开放给租房平台
         */
        public ExecEkytInsureResponse ExecEkytInsureEx(ExecEkytInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecEkytInsureResponse>(DoRequest("1.0", "antsecuritytech.gateway.ekyt.insure.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁住房保险产品，开放接口
        调用方：上海远点网络科技有限公司
         * Summary: 租赁住房保险产品，接口开放给租房平台
         */
        public async Task<ExecEkytInsureResponse> ExecEkytInsureExAsync(ExecEkytInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecEkytInsureResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ekyt.insure.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取EKYT平台入驻的车队信息列表
         * Summary: 获取EKYT平台入驻的车队信息列表
         */
        public ListDcpResponse ListDcp(ListDcpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDcpEx(request, headers, runtime);
        }

        /**
         * Description: 获取EKYT平台入驻的车队信息列表
         * Summary: 获取EKYT平台入驻的车队信息列表
         */
        public async Task<ListDcpResponse> ListDcpAsync(ListDcpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDcpExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取EKYT平台入驻的车队信息列表
         * Summary: 获取EKYT平台入驻的车队信息列表
         */
        public ListDcpResponse ListDcpEx(ListDcpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDcpResponse>(DoRequest("1.0", "antsecuritytech.gateway.dcp.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取EKYT平台入驻的车队信息列表
         * Summary: 获取EKYT平台入驻的车队信息列表
         */
        public async Task<ListDcpResponse> ListDcpExAsync(ListDcpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDcpResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.dcp.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取EKYT平台入驻的司机灵工卡信息列表
         * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
         */
        public ListDcpAccountbookResponse ListDcpAccountbook(ListDcpAccountbookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDcpAccountbookEx(request, headers, runtime);
        }

        /**
         * Description: 获取EKYT平台入驻的司机灵工卡信息列表
         * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
         */
        public async Task<ListDcpAccountbookResponse> ListDcpAccountbookAsync(ListDcpAccountbookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDcpAccountbookExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取EKYT平台入驻的司机灵工卡信息列表
         * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
         */
        public ListDcpAccountbookResponse ListDcpAccountbookEx(ListDcpAccountbookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDcpAccountbookResponse>(DoRequest("1.0", "antsecuritytech.gateway.dcp.accountbook.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取EKYT平台入驻的司机灵工卡信息列表
         * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
         */
        public async Task<ListDcpAccountbookResponse> ListDcpAccountbookExAsync(ListDcpAccountbookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDcpAccountbookResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.dcp.accountbook.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业ETC入驻车辆查询
         * Summary: 企业ETC入驻车辆查询
         */
        public QueryEtcVehicleResponse QueryEtcVehicle(QueryEtcVehicleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEtcVehicleEx(request, headers, runtime);
        }

        /**
         * Description: 企业ETC入驻车辆查询
         * Summary: 企业ETC入驻车辆查询
         */
        public async Task<QueryEtcVehicleResponse> QueryEtcVehicleAsync(QueryEtcVehicleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEtcVehicleExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业ETC入驻车辆查询
         * Summary: 企业ETC入驻车辆查询
         */
        public QueryEtcVehicleResponse QueryEtcVehicleEx(QueryEtcVehicleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEtcVehicleResponse>(DoRequest("1.0", "antsecuritytech.gateway.etc.vehicle.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业ETC入驻车辆查询
         * Summary: 企业ETC入驻车辆查询
         */
        public async Task<QueryEtcVehicleResponse> QueryEtcVehicleExAsync(QueryEtcVehicleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEtcVehicleResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.etc.vehicle.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业ETC运单上传
         * Summary: 企业ETC运单上传
         */
        public UploadEtcWaybillResponse UploadEtcWaybill(UploadEtcWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadEtcWaybillEx(request, headers, runtime);
        }

        /**
         * Description: 企业ETC运单上传
         * Summary: 企业ETC运单上传
         */
        public async Task<UploadEtcWaybillResponse> UploadEtcWaybillAsync(UploadEtcWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadEtcWaybillExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业ETC运单上传
         * Summary: 企业ETC运单上传
         */
        public UploadEtcWaybillResponse UploadEtcWaybillEx(UploadEtcWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadEtcWaybillResponse>(DoRequest("1.0", "antsecuritytech.gateway.etc.waybill.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业ETC运单上传
         * Summary: 企业ETC运单上传
         */
        public async Task<UploadEtcWaybillResponse> UploadEtcWaybillExAsync(UploadEtcWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadEtcWaybillResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.etc.waybill.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业ETC车辆行程查询
         * Summary: 企业ETC车辆行程查询
         */
        public QueryEtcTripResponse QueryEtcTrip(QueryEtcTripRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEtcTripEx(request, headers, runtime);
        }

        /**
         * Description: 企业ETC车辆行程查询
         * Summary: 企业ETC车辆行程查询
         */
        public async Task<QueryEtcTripResponse> QueryEtcTripAsync(QueryEtcTripRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEtcTripExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业ETC车辆行程查询
         * Summary: 企业ETC车辆行程查询
         */
        public QueryEtcTripResponse QueryEtcTripEx(QueryEtcTripRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEtcTripResponse>(DoRequest("1.0", "antsecuritytech.gateway.etc.trip.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业ETC车辆行程查询
         * Summary: 企业ETC车辆行程查询
         */
        public async Task<QueryEtcTripResponse> QueryEtcTripExAsync(QueryEtcTripRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEtcTripResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.etc.trip.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机获取授权登录地址
         * Summary: 两轮车一体机获取授权登录地址
         */
        public InitSimLoginResponse InitSimLogin(InitSimLoginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitSimLoginEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机获取授权登录地址
         * Summary: 两轮车一体机获取授权登录地址
         */
        public async Task<InitSimLoginResponse> InitSimLoginAsync(InitSimLoginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitSimLoginExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机获取授权登录地址
         * Summary: 两轮车一体机获取授权登录地址
         */
        public InitSimLoginResponse InitSimLoginEx(InitSimLoginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSimLoginResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.login.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机获取授权登录地址
         * Summary: 两轮车一体机获取授权登录地址
         */
        public async Task<InitSimLoginResponse> InitSimLoginExAsync(InitSimLoginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSimLoginResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.login.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机查询登录结果
         * Summary: 两轮车一体机查询登录结果
         */
        public QuerySimLoginResponse QuerySimLogin(QuerySimLoginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySimLoginEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机查询登录结果
         * Summary: 两轮车一体机查询登录结果
         */
        public async Task<QuerySimLoginResponse> QuerySimLoginAsync(QuerySimLoginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySimLoginExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机查询登录结果
         * Summary: 两轮车一体机查询登录结果
         */
        public QuerySimLoginResponse QuerySimLoginEx(QuerySimLoginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySimLoginResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.login.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机查询登录结果
         * Summary: 两轮车一体机查询登录结果
         */
        public async Task<QuerySimLoginResponse> QuerySimLoginExAsync(QuerySimLoginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySimLoginResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.login.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机获取营销活动
         * Summary: 两轮车一体机获取营销活动
         */
        public ListSimCampaignResponse ListSimCampaign(ListSimCampaignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSimCampaignEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机获取营销活动
         * Summary: 两轮车一体机获取营销活动
         */
        public async Task<ListSimCampaignResponse> ListSimCampaignAsync(ListSimCampaignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSimCampaignExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机获取营销活动
         * Summary: 两轮车一体机获取营销活动
         */
        public ListSimCampaignResponse ListSimCampaignEx(ListSimCampaignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSimCampaignResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.campaign.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机获取营销活动
         * Summary: 两轮车一体机获取营销活动
         */
        public async Task<ListSimCampaignResponse> ListSimCampaignExAsync(ListSimCampaignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSimCampaignResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.campaign.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机查询车辆SKU
         * Summary: 两轮车一体机查询车辆SKU
         */
        public QuerySimSkuResponse QuerySimSku(QuerySimSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySimSkuEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机查询车辆SKU
         * Summary: 两轮车一体机查询车辆SKU
         */
        public async Task<QuerySimSkuResponse> QuerySimSkuAsync(QuerySimSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySimSkuExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机查询车辆SKU
         * Summary: 两轮车一体机查询车辆SKU
         */
        public QuerySimSkuResponse QuerySimSkuEx(QuerySimSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySimSkuResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.sku.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机查询车辆SKU
         * Summary: 两轮车一体机查询车辆SKU
         */
        public async Task<QuerySimSkuResponse> QuerySimSkuExAsync(QuerySimSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySimSkuResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.sku.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机列举车辆SKU
         * Summary: 两轮车一体机列举车辆SKU
         */
        public ListSimSkuResponse ListSimSku(ListSimSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSimSkuEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机列举车辆SKU
         * Summary: 两轮车一体机列举车辆SKU
         */
        public async Task<ListSimSkuResponse> ListSimSkuAsync(ListSimSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSimSkuExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机列举车辆SKU
         * Summary: 两轮车一体机列举车辆SKU
         */
        public ListSimSkuResponse ListSimSkuEx(ListSimSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSimSkuResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.sku.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机列举车辆SKU
         * Summary: 两轮车一体机列举车辆SKU
         */
        public async Task<ListSimSkuResponse> ListSimSkuExAsync(ListSimSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSimSkuResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.sku.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机创建订单信息
         * Summary: 两轮车一体机创建订单信息
         */
        public CreateSimOrderResponse CreateSimOrder(CreateSimOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSimOrderEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机创建订单信息
         * Summary: 两轮车一体机创建订单信息
         */
        public async Task<CreateSimOrderResponse> CreateSimOrderAsync(CreateSimOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSimOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机创建订单信息
         * Summary: 两轮车一体机创建订单信息
         */
        public CreateSimOrderResponse CreateSimOrderEx(CreateSimOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSimOrderResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机创建订单信息
         * Summary: 两轮车一体机创建订单信息
         */
        public async Task<CreateSimOrderResponse> CreateSimOrderExAsync(CreateSimOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSimOrderResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机查询订单信息
         * Summary: 两轮车一体机查询订单信息
         */
        public QuerySimOrderResponse QuerySimOrder(QuerySimOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySimOrderEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机查询订单信息
         * Summary: 两轮车一体机查询订单信息
         */
        public async Task<QuerySimOrderResponse> QuerySimOrderAsync(QuerySimOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySimOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机查询订单信息
         * Summary: 两轮车一体机查询订单信息
         */
        public QuerySimOrderResponse QuerySimOrderEx(QuerySimOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySimOrderResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机查询订单信息
         * Summary: 两轮车一体机查询订单信息
         */
        public async Task<QuerySimOrderResponse> QuerySimOrderExAsync(QuerySimOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySimOrderResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机列举订单信息
         * Summary: 两轮车一体机列举订单信息
         */
        public ListSimOrderResponse ListSimOrder(ListSimOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSimOrderEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机列举订单信息
         * Summary: 两轮车一体机列举订单信息
         */
        public async Task<ListSimOrderResponse> ListSimOrderAsync(ListSimOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSimOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机列举订单信息
         * Summary: 两轮车一体机列举订单信息
         */
        public ListSimOrderResponse ListSimOrderEx(ListSimOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSimOrderResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.order.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机列举订单信息
         * Summary: 两轮车一体机列举订单信息
         */
        public async Task<ListSimOrderResponse> ListSimOrderExAsync(ListSimOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSimOrderResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.order.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机取消订单信息
         * Summary: 两轮车一体机取消订单信息
         */
        public CancelSimOrderResponse CancelSimOrder(CancelSimOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelSimOrderEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机取消订单信息
         * Summary: 两轮车一体机取消订单信息
         */
        public async Task<CancelSimOrderResponse> CancelSimOrderAsync(CancelSimOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelSimOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机取消订单信息
         * Summary: 两轮车一体机取消订单信息
         */
        public CancelSimOrderResponse CancelSimOrderEx(CancelSimOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSimOrderResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.order.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机取消订单信息
         * Summary: 两轮车一体机取消订单信息
         */
        public async Task<CancelSimOrderResponse> CancelSimOrderExAsync(CancelSimOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSimOrderResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.order.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机拉取车辆SKU
         * Summary: 两轮车一体机拉取车辆SKU
         */
        public PullSimSkuResponse PullSimSku(PullSimSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullSimSkuEx(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机拉取车辆SKU
         * Summary: 两轮车一体机拉取车辆SKU
         */
        public async Task<PullSimSkuResponse> PullSimSkuAsync(PullSimSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullSimSkuExAsync(request, headers, runtime);
        }

        /**
         * Description: 两轮车一体机拉取车辆SKU
         * Summary: 两轮车一体机拉取车辆SKU
         */
        public PullSimSkuResponse PullSimSkuEx(PullSimSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullSimSkuResponse>(DoRequest("1.0", "antsecuritytech.gateway.sim.sku.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 两轮车一体机拉取车辆SKU
         * Summary: 两轮车一体机拉取车辆SKU
         */
        public async Task<PullSimSkuResponse> PullSimSkuExAsync(PullSimSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullSimSkuResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.sim.sku.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public CreateBssecpicResponse CreateBssecpic(CreateBssecpicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBssecpicEx(request, headers, runtime);
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public async Task<CreateBssecpicResponse> CreateBssecpicAsync(CreateBssecpicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBssecpicExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public CreateBssecpicResponse CreateBssecpicEx(CreateBssecpicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBssecpicResponse>(DoRequest("1.0", "antsecuritytech.gateway.bssecpic.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public async Task<CreateBssecpicResponse> CreateBssecpicExAsync(CreateBssecpicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBssecpicResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.bssecpic.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public CreateBlueshieldSecuritypictureResponse CreateBlueshieldSecuritypicture(CreateBlueshieldSecuritypictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBlueshieldSecuritypictureEx(request, headers, runtime);
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public async Task<CreateBlueshieldSecuritypictureResponse> CreateBlueshieldSecuritypictureAsync(CreateBlueshieldSecuritypictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBlueshieldSecuritypictureExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public CreateBlueshieldSecuritypictureResponse CreateBlueshieldSecuritypictureEx(CreateBlueshieldSecuritypictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlueshieldSecuritypictureResponse>(DoRequest("1.0", "antsecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝盾安全图片生成
         * Summary: 蓝盾安全图片生成
         */
        public async Task<CreateBlueshieldSecuritypictureResponse> CreateBlueshieldSecuritypictureExAsync(CreateBlueshieldSecuritypictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlueshieldSecuritypictureResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Native查询
         * Summary: 人脸盾Native查询
         */
        public QueryFaceshieldNativeResponse QueryFaceshieldNative(QueryFaceshieldNativeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceshieldNativeEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全人脸盾Native查询
         * Summary: 人脸盾Native查询
         */
        public async Task<QueryFaceshieldNativeResponse> QueryFaceshieldNativeAsync(QueryFaceshieldNativeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceshieldNativeExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全人脸盾Native查询
         * Summary: 人脸盾Native查询
         */
        public QueryFaceshieldNativeResponse QueryFaceshieldNativeEx(QueryFaceshieldNativeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldNativeResponse>(DoRequest("1.0", "antsecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Native查询
         * Summary: 人脸盾Native查询
         */
        public async Task<QueryFaceshieldNativeResponse> QueryFaceshieldNativeExAsync(QueryFaceshieldNativeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldNativeResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Web查询
         * Summary: 人脸盾Web查询
         */
        public QueryFaceshieldWebResponse QueryFaceshieldWeb(QueryFaceshieldWebRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFaceshieldWebEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全人脸盾Web查询
         * Summary: 人脸盾Web查询
         */
        public async Task<QueryFaceshieldWebResponse> QueryFaceshieldWebAsync(QueryFaceshieldWebRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFaceshieldWebExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全人脸盾Web查询
         * Summary: 人脸盾Web查询
         */
        public QueryFaceshieldWebResponse QueryFaceshieldWebEx(QueryFaceshieldWebRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldWebResponse>(DoRequest("1.0", "antsecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全人脸盾Web查询
         * Summary: 人脸盾Web查询
         */
        public async Task<QueryFaceshieldWebResponse> QueryFaceshieldWebExAsync(QueryFaceshieldWebRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFaceshieldWebResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备激活
         * Summary: 可信设备认证设备初始化，设备激活
         */
        public InitIifaaDeviceResponse InitIifaaDevice(InitIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitIifaaDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 设备激活
         * Summary: 可信设备认证设备初始化，设备激活
         */
        public async Task<InitIifaaDeviceResponse> InitIifaaDeviceAsync(InitIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitIifaaDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备激活
         * Summary: 可信设备认证设备初始化，设备激活
         */
        public InitIifaaDeviceResponse InitIifaaDeviceEx(InitIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIifaaDeviceResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.device.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备激活
         * Summary: 可信设备认证设备初始化，设备激活
         */
        public async Task<InitIifaaDeviceResponse> InitIifaaDeviceExAsync(InitIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIifaaDeviceResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.device.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证风险咨询，获取预认证数据
         * Summary: 可信设备认证风险咨询，获取预认证数据
         */
        public RecognizeIifaaDeviceResponse RecognizeIifaaDevice(RecognizeIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeIifaaDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证风险咨询，获取预认证数据
         * Summary: 可信设备认证风险咨询，获取预认证数据
         */
        public async Task<RecognizeIifaaDeviceResponse> RecognizeIifaaDeviceAsync(RecognizeIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeIifaaDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证风险咨询，获取预认证数据
         * Summary: 可信设备认证风险咨询，获取预认证数据
         */
        public RecognizeIifaaDeviceResponse RecognizeIifaaDeviceEx(RecognizeIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeIifaaDeviceResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.device.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证风险咨询，获取预认证数据
         * Summary: 可信设备认证风险咨询，获取预认证数据
         */
        public async Task<RecognizeIifaaDeviceResponse> RecognizeIifaaDeviceExAsync(RecognizeIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeIifaaDeviceResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.device.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，设备验证
         * Summary: 可信设备认证，设备验证
         */
        public VerifyIifaaDeviceResponse VerifyIifaaDevice(VerifyIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyIifaaDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，设备验证
         * Summary: 可信设备认证，设备验证
         */
        public async Task<VerifyIifaaDeviceResponse> VerifyIifaaDeviceAsync(VerifyIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyIifaaDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，设备验证
         * Summary: 可信设备认证，设备验证
         */
        public VerifyIifaaDeviceResponse VerifyIifaaDeviceEx(VerifyIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyIifaaDeviceResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.device.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，设备验证
         * Summary: 可信设备认证，设备验证
         */
        public async Task<VerifyIifaaDeviceResponse> VerifyIifaaDeviceExAsync(VerifyIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyIifaaDeviceResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.device.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，产商注册
         * Summary: 可信设备认证，产商注册
         */
        public RegisterIifaaCorpResponse RegisterIifaaCorp(RegisterIifaaCorpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterIifaaCorpEx(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，产商注册
         * Summary: 可信设备认证，产商注册
         */
        public async Task<RegisterIifaaCorpResponse> RegisterIifaaCorpAsync(RegisterIifaaCorpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterIifaaCorpExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，产商注册
         * Summary: 可信设备认证，产商注册
         */
        public RegisterIifaaCorpResponse RegisterIifaaCorpEx(RegisterIifaaCorpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterIifaaCorpResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.corp.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，产商注册
         * Summary: 可信设备认证，产商注册
         */
        public async Task<RegisterIifaaCorpResponse> RegisterIifaaCorpExAsync(RegisterIifaaCorpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterIifaaCorpResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.corp.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，擦除设备信息
         * Summary: 可信设备认证，擦除设备信息
         */
        public DeprecateIifaaDeviceResponse DeprecateIifaaDevice(DeprecateIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeprecateIifaaDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，擦除设备信息
         * Summary: 可信设备认证，擦除设备信息
         */
        public async Task<DeprecateIifaaDeviceResponse> DeprecateIifaaDeviceAsync(DeprecateIifaaDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeprecateIifaaDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信设备认证，擦除设备信息
         * Summary: 可信设备认证，擦除设备信息
         */
        public DeprecateIifaaDeviceResponse DeprecateIifaaDeviceEx(DeprecateIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeprecateIifaaDeviceResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.device.deprecate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信设备认证，擦除设备信息
         * Summary: 可信设备认证，擦除设备信息
         */
        public async Task<DeprecateIifaaDeviceResponse> DeprecateIifaaDeviceExAsync(DeprecateIifaaDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeprecateIifaaDeviceResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.device.deprecate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 巡检商业化
         * Summary: 巡检商业化
         */
        public RunXhunterSpiResponse RunXhunterSpi(RunXhunterSpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunXhunterSpiEx(request, headers, runtime);
        }

        /**
         * Description: 巡检商业化
         * Summary: 巡检商业化
         */
        public async Task<RunXhunterSpiResponse> RunXhunterSpiAsync(RunXhunterSpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunXhunterSpiExAsync(request, headers, runtime);
        }

        /**
         * Description: 巡检商业化
         * Summary: 巡检商业化
         */
        public RunXhunterSpiResponse RunXhunterSpiEx(RunXhunterSpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunXhunterSpiResponse>(DoRequest("1.0", "antsecuritytech.gateway.xhunter.spi.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 巡检商业化
         * Summary: 巡检商业化
         */
        public async Task<RunXhunterSpiResponse> RunXhunterSpiExAsync(RunXhunterSpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunXhunterSpiResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.xhunter.spi.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租凭住房保险产品，接口开放给租房平台
         * Summary: 租凭住房保险产品，接口开放给租房平台
         */
        public ExecIifaaInsureResponse ExecIifaaInsure(ExecIifaaInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecIifaaInsureEx(request, headers, runtime);
        }

        /**
         * Description: 租凭住房保险产品，接口开放给租房平台
         * Summary: 租凭住房保险产品，接口开放给租房平台
         */
        public async Task<ExecIifaaInsureResponse> ExecIifaaInsureAsync(ExecIifaaInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecIifaaInsureExAsync(request, headers, runtime);
        }

        /**
         * Description: 租凭住房保险产品，接口开放给租房平台
         * Summary: 租凭住房保险产品，接口开放给租房平台
         */
        public ExecIifaaInsureResponse ExecIifaaInsureEx(ExecIifaaInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIifaaInsureResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.insure.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租凭住房保险产品，接口开放给租房平台
         * Summary: 租凭住房保险产品，接口开放给租房平台
         */
        public async Task<ExecIifaaInsureResponse> ExecIifaaInsureExAsync(ExecIifaaInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIifaaInsureResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.insure.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容安全图片同步检测
         * Summary: 内容安全图片同步检测
         */
        public QueryCctPictureResponse QueryCctPicture(QueryCctPictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCctPictureEx(request, headers, runtime);
        }

        /**
         * Description: 内容安全图片同步检测
         * Summary: 内容安全图片同步检测
         */
        public async Task<QueryCctPictureResponse> QueryCctPictureAsync(QueryCctPictureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCctPictureExAsync(request, headers, runtime);
        }

        /**
         * Description: 内容安全图片同步检测
         * Summary: 内容安全图片同步检测
         */
        public QueryCctPictureResponse QueryCctPictureEx(QueryCctPictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCctPictureResponse>(DoRequest("1.0", "antsecuritytech.gateway.cct.picture.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容安全图片同步检测
         * Summary: 内容安全图片同步检测
         */
        public async Task<QueryCctPictureResponse> QueryCctPictureExAsync(QueryCctPictureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCctPictureResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.cct.picture.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容安全主站同步检测
         * Summary: 内容安全主站同步检测
         */
        public RecognizeCctAnalyzeResponse RecognizeCctAnalyze(RecognizeCctAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeCctAnalyzeEx(request, headers, runtime);
        }

        /**
         * Description: 内容安全主站同步检测
         * Summary: 内容安全主站同步检测
         */
        public async Task<RecognizeCctAnalyzeResponse> RecognizeCctAnalyzeAsync(RecognizeCctAnalyzeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeCctAnalyzeExAsync(request, headers, runtime);
        }

        /**
         * Description: 内容安全主站同步检测
         * Summary: 内容安全主站同步检测
         */
        public RecognizeCctAnalyzeResponse RecognizeCctAnalyzeEx(RecognizeCctAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeCctAnalyzeResponse>(DoRequest("1.0", "antsecuritytech.gateway.cct.analyze.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内容安全主站同步检测
         * Summary: 内容安全主站同步检测
         */
        public async Task<RecognizeCctAnalyzeResponse> RecognizeCctAnalyzeExAsync(RecognizeCctAnalyzeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeCctAnalyzeResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.cct.analyze.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: RAAS数据服务统一接口
         * Summary: RAAS数据服务统一接口
         */
        public QueryRiskGeneralResponse QueryRiskGeneral(QueryRiskGeneralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRiskGeneralEx(request, headers, runtime);
        }

        /**
         * Description: RAAS数据服务统一接口
         * Summary: RAAS数据服务统一接口
         */
        public async Task<QueryRiskGeneralResponse> QueryRiskGeneralAsync(QueryRiskGeneralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRiskGeneralExAsync(request, headers, runtime);
        }

        /**
         * Description: RAAS数据服务统一接口
         * Summary: RAAS数据服务统一接口
         */
        public QueryRiskGeneralResponse QueryRiskGeneralEx(QueryRiskGeneralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskGeneralResponse>(DoRequest("1.0", "antsecuritytech.gateway.risk.general.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: RAAS数据服务统一接口
         * Summary: RAAS数据服务统一接口
         */
        public async Task<QueryRiskGeneralResponse> QueryRiskGeneralExAsync(QueryRiskGeneralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskGeneralResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.risk.general.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备指纹查询
         * Summary: 设备指纹查询
         */
        public QueryDeviceriskFingerResponse QueryDeviceriskFinger(QueryDeviceriskFingerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceriskFingerEx(request, headers, runtime);
        }

        /**
         * Description: 设备指纹查询
         * Summary: 设备指纹查询
         */
        public async Task<QueryDeviceriskFingerResponse> QueryDeviceriskFingerAsync(QueryDeviceriskFingerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceriskFingerExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备指纹查询
         * Summary: 设备指纹查询
         */
        public QueryDeviceriskFingerResponse QueryDeviceriskFingerEx(QueryDeviceriskFingerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskFingerResponse>(DoRequest("1.0", "antsecuritytech.gateway.devicerisk.finger.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备指纹查询
         * Summary: 设备指纹查询
         */
        public async Task<QueryDeviceriskFingerResponse> QueryDeviceriskFingerExAsync(QueryDeviceriskFingerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskFingerResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.devicerisk.finger.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险标签查询
         * Summary: 风险标签查询
         */
        public QueryDeviceriskRisklabelResponse QueryDeviceriskRisklabel(QueryDeviceriskRisklabelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceriskRisklabelEx(request, headers, runtime);
        }

        /**
         * Description: 风险标签查询
         * Summary: 风险标签查询
         */
        public async Task<QueryDeviceriskRisklabelResponse> QueryDeviceriskRisklabelAsync(QueryDeviceriskRisklabelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceriskRisklabelExAsync(request, headers, runtime);
        }

        /**
         * Description: 风险标签查询
         * Summary: 风险标签查询
         */
        public QueryDeviceriskRisklabelResponse QueryDeviceriskRisklabelEx(QueryDeviceriskRisklabelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskRisklabelResponse>(DoRequest("1.0", "antsecuritytech.gateway.devicerisk.risklabel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 风险标签查询
         * Summary: 风险标签查询
         */
        public async Task<QueryDeviceriskRisklabelResponse> QueryDeviceriskRisklabelExAsync(QueryDeviceriskRisklabelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskRisklabelResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.devicerisk.risklabel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备风险查询
         * Summary: 设备风险查询
         */
        public QueryDeviceriskDeviceriskResponse QueryDeviceriskDevicerisk(QueryDeviceriskDeviceriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceriskDeviceriskEx(request, headers, runtime);
        }

        /**
         * Description: 设备风险查询
         * Summary: 设备风险查询
         */
        public async Task<QueryDeviceriskDeviceriskResponse> QueryDeviceriskDeviceriskAsync(QueryDeviceriskDeviceriskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceriskDeviceriskExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备风险查询
         * Summary: 设备风险查询
         */
        public QueryDeviceriskDeviceriskResponse QueryDeviceriskDeviceriskEx(QueryDeviceriskDeviceriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskDeviceriskResponse>(DoRequest("1.0", "antsecuritytech.gateway.devicerisk.devicerisk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备风险查询
         * Summary: 设备风险查询
         */
        public async Task<QueryDeviceriskDeviceriskResponse> QueryDeviceriskDeviceriskExAsync(QueryDeviceriskDeviceriskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceriskDeviceriskResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.devicerisk.devicerisk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备信息上报
         * Summary: 设备信息上报
         */
        public SubmitDeviceriskReportResponse SubmitDeviceriskReport(SubmitDeviceriskReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitDeviceriskReportEx(request, headers, runtime);
        }

        /**
         * Description: 设备信息上报
         * Summary: 设备信息上报
         */
        public async Task<SubmitDeviceriskReportResponse> SubmitDeviceriskReportAsync(SubmitDeviceriskReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitDeviceriskReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备信息上报
         * Summary: 设备信息上报
         */
        public SubmitDeviceriskReportResponse SubmitDeviceriskReportEx(SubmitDeviceriskReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDeviceriskReportResponse>(DoRequest("1.0", "antsecuritytech.gateway.devicerisk.report.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备信息上报
         * Summary: 设备信息上报
         */
        public async Task<SubmitDeviceriskReportResponse> SubmitDeviceriskReportExAsync(SubmitDeviceriskReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDeviceriskReportResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.devicerisk.report.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT风险评估服务-出行场景司机
         * Summary: eKYT风险评估服务-出行场景司机
         */
        public QueryEkytDriverResponse QueryEkytDriver(QueryEkytDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEkytDriverEx(request, headers, runtime);
        }

        /**
         * Description: eKYT风险评估服务-出行场景司机
         * Summary: eKYT风险评估服务-出行场景司机
         */
        public async Task<QueryEkytDriverResponse> QueryEkytDriverAsync(QueryEkytDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEkytDriverExAsync(request, headers, runtime);
        }

        /**
         * Description: eKYT风险评估服务-出行场景司机
         * Summary: eKYT风险评估服务-出行场景司机
         */
        public QueryEkytDriverResponse QueryEkytDriverEx(QueryEkytDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEkytDriverResponse>(DoRequest("1.0", "antsecuritytech.gateway.ekyt.driver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT风险评估服务-出行场景司机
         * Summary: eKYT风险评估服务-出行场景司机
         */
        public async Task<QueryEkytDriverResponse> QueryEkytDriverExAsync(QueryEkytDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEkytDriverResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ekyt.driver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请设备设备密钥
         * Summary: 申请设备设备密钥
         */
        public ApplyIifaaDevicekeyResponse ApplyIifaaDevicekey(ApplyIifaaDevicekeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyIifaaDevicekeyEx(request, headers, runtime);
        }

        /**
         * Description: 申请设备设备密钥
         * Summary: 申请设备设备密钥
         */
        public async Task<ApplyIifaaDevicekeyResponse> ApplyIifaaDevicekeyAsync(ApplyIifaaDevicekeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyIifaaDevicekeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 申请设备设备密钥
         * Summary: 申请设备设备密钥
         */
        public ApplyIifaaDevicekeyResponse ApplyIifaaDevicekeyEx(ApplyIifaaDevicekeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIifaaDevicekeyResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.devicekey.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请设备设备密钥
         * Summary: 申请设备设备密钥
         */
        public async Task<ApplyIifaaDevicekeyResponse> ApplyIifaaDevicekeyExAsync(ApplyIifaaDevicekeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyIifaaDevicekeyResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.devicekey.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备风险咨询
         * Summary: 设备风险咨询
         */
        public QueryDeviceplusRiskqueryResponse QueryDeviceplusRiskquery(QueryDeviceplusRiskqueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceplusRiskqueryEx(request, headers, runtime);
        }

        /**
         * Description: 设备风险咨询
         * Summary: 设备风险咨询
         */
        public async Task<QueryDeviceplusRiskqueryResponse> QueryDeviceplusRiskqueryAsync(QueryDeviceplusRiskqueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceplusRiskqueryExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备风险咨询
         * Summary: 设备风险咨询
         */
        public QueryDeviceplusRiskqueryResponse QueryDeviceplusRiskqueryEx(QueryDeviceplusRiskqueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceplusRiskqueryResponse>(DoRequest("1.0", "antsecuritytech.gateway.deviceplus.riskquery.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备风险咨询
         * Summary: 设备风险咨询
         */
        public async Task<QueryDeviceplusRiskqueryResponse> QueryDeviceplusRiskqueryExAsync(QueryDeviceplusRiskqueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceplusRiskqueryResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.deviceplus.riskquery.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备风险咨询mpaas
         * Summary: 设备风险咨询mpaas
         */
        public QueryDeviceplusMpaasResponse QueryDeviceplusMpaas(QueryDeviceplusMpaasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceplusMpaasEx(request, headers, runtime);
        }

        /**
         * Description: 设备风险咨询mpaas
         * Summary: 设备风险咨询mpaas
         */
        public async Task<QueryDeviceplusMpaasResponse> QueryDeviceplusMpaasAsync(QueryDeviceplusMpaasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceplusMpaasExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备风险咨询mpaas
         * Summary: 设备风险咨询mpaas
         */
        public QueryDeviceplusMpaasResponse QueryDeviceplusMpaasEx(QueryDeviceplusMpaasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceplusMpaasResponse>(DoRequest("1.0", "antsecuritytech.gateway.deviceplus.mpaas.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备风险咨询mpaas
         * Summary: 设备风险咨询mpaas
         */
        public async Task<QueryDeviceplusMpaasResponse> QueryDeviceplusMpaasExAsync(QueryDeviceplusMpaasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceplusMpaasResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.deviceplus.mpaas.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务(包月)
         * Summary: 启动加固任务(包月)
         */
        public SubmitAshieldPeriodhardeningtaskResponse SubmitAshieldPeriodhardeningtask(SubmitAshieldPeriodhardeningtaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAshieldPeriodhardeningtaskEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务(包月)
         * Summary: 启动加固任务(包月)
         */
        public async Task<SubmitAshieldPeriodhardeningtaskResponse> SubmitAshieldPeriodhardeningtaskAsync(SubmitAshieldPeriodhardeningtaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAshieldPeriodhardeningtaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务(包月)
         * Summary: 启动加固任务(包月)
         */
        public SubmitAshieldPeriodhardeningtaskResponse SubmitAshieldPeriodhardeningtaskEx(SubmitAshieldPeriodhardeningtaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAshieldPeriodhardeningtaskResponse>(DoRequest("1.0", "antsecuritytech.gateway.ashield.periodhardeningtask.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务(包月)
         * Summary: 启动加固任务(包月)
         */
        public async Task<SubmitAshieldPeriodhardeningtaskResponse> SubmitAshieldPeriodhardeningtaskExAsync(SubmitAshieldPeriodhardeningtaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAshieldPeriodhardeningtaskResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ashield.periodhardeningtask.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-获取上传文件的临时URL
         * Summary: 获取上传文件的临时URL
         */
        public GetAshieldFiletokenResponse GetAshieldFiletoken(GetAshieldFiletokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAshieldFiletokenEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-获取上传文件的临时URL
         * Summary: 获取上传文件的临时URL
         */
        public async Task<GetAshieldFiletokenResponse> GetAshieldFiletokenAsync(GetAshieldFiletokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAshieldFiletokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-获取上传文件的临时URL
         * Summary: 获取上传文件的临时URL
         */
        public GetAshieldFiletokenResponse GetAshieldFiletokenEx(GetAshieldFiletokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldFiletokenResponse>(DoRequest("1.0", "antsecuritytech.gateway.ashield.filetoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-获取上传文件的临时URL
         * Summary: 获取上传文件的临时URL
         */
        public async Task<GetAshieldFiletokenResponse> GetAshieldFiletokenExAsync(GetAshieldFiletokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldFiletokenResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ashield.filetoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务
         * Summary: 启动加固任务(按次计费)
         */
        public SubmitAshieldHardeningtaskResponse SubmitAshieldHardeningtask(SubmitAshieldHardeningtaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAshieldHardeningtaskEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务
         * Summary: 启动加固任务(按次计费)
         */
        public async Task<SubmitAshieldHardeningtaskResponse> SubmitAshieldHardeningtaskAsync(SubmitAshieldHardeningtaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAshieldHardeningtaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务
         * Summary: 启动加固任务(按次计费)
         */
        public SubmitAshieldHardeningtaskResponse SubmitAshieldHardeningtaskEx(SubmitAshieldHardeningtaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAshieldHardeningtaskResponse>(DoRequest("1.0", "antsecuritytech.gateway.ashield.hardeningtask.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-启动加固任务
         * Summary: 启动加固任务(按次计费)
         */
        public async Task<SubmitAshieldHardeningtaskResponse> SubmitAshieldHardeningtaskExAsync(SubmitAshieldHardeningtaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAshieldHardeningtaskResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ashield.hardeningtask.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固任务进度
         * Summary: 查询加固任务进度
         */
        public GetAshieldHardeningtaskprocessResponse GetAshieldHardeningtaskprocess(GetAshieldHardeningtaskprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAshieldHardeningtaskprocessEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固任务进度
         * Summary: 查询加固任务进度
         */
        public async Task<GetAshieldHardeningtaskprocessResponse> GetAshieldHardeningtaskprocessAsync(GetAshieldHardeningtaskprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAshieldHardeningtaskprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固任务进度
         * Summary: 查询加固任务进度
         */
        public GetAshieldHardeningtaskprocessResponse GetAshieldHardeningtaskprocessEx(GetAshieldHardeningtaskprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeningtaskprocessResponse>(DoRequest("1.0", "antsecuritytech.gateway.ashield.hardeningtaskprocess.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固任务进度
         * Summary: 查询加固任务进度
         */
        public async Task<GetAshieldHardeningtaskprocessResponse> GetAshieldHardeningtaskprocessExAsync(GetAshieldHardeningtaskprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeningtaskprocessResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ashield.hardeningtaskprocess.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
         * Summary: 查询加固后的产物下载链接
         */
        public GetAshieldHardeningresultResponse GetAshieldHardeningresult(GetAshieldHardeningresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAshieldHardeningresultEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
         * Summary: 查询加固后的产物下载链接
         */
        public async Task<GetAshieldHardeningresultResponse> GetAshieldHardeningresultAsync(GetAshieldHardeningresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAshieldHardeningresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
         * Summary: 查询加固后的产物下载链接
         */
        public GetAshieldHardeningresultResponse GetAshieldHardeningresultEx(GetAshieldHardeningresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeningresultResponse>(DoRequest("1.0", "antsecuritytech.gateway.ashield.hardeningresult.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
         * Summary: 查询加固后的产物下载链接
         */
        public async Task<GetAshieldHardeningresultResponse> GetAshieldHardeningresultExAsync(GetAshieldHardeningresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeningresultResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ashield.hardeningresult.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
         * Summary: 查询加固后的日志下载链接
         */
        public GetAshieldHardeninglogResponse GetAshieldHardeninglog(GetAshieldHardeninglogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAshieldHardeninglogEx(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
         * Summary: 查询加固后的日志下载链接
         */
        public async Task<GetAshieldHardeninglogResponse> GetAshieldHardeninglogAsync(GetAshieldHardeninglogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAshieldHardeninglogExAsync(request, headers, runtime);
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
         * Summary: 查询加固后的日志下载链接
         */
        public GetAshieldHardeninglogResponse GetAshieldHardeninglogEx(GetAshieldHardeninglogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeninglogResponse>(DoRequest("1.0", "antsecuritytech.gateway.ashield.hardeninglog.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
         * Summary: 查询加固后的日志下载链接
         */
        public async Task<GetAshieldHardeninglogResponse> GetAshieldHardeninglogExAsync(GetAshieldHardeninglogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAshieldHardeninglogResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ashield.hardeninglog.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT可信签约初始化
         * Summary: eKYT可信签约-初始化
         */
        public InitEkytTrustsignResponse InitEkytTrustsign(InitEkytTrustsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitEkytTrustsignEx(request, headers, runtime);
        }

        /**
         * Description: eKYT可信签约初始化
         * Summary: eKYT可信签约-初始化
         */
        public async Task<InitEkytTrustsignResponse> InitEkytTrustsignAsync(InitEkytTrustsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitEkytTrustsignExAsync(request, headers, runtime);
        }

        /**
         * Description: eKYT可信签约初始化
         * Summary: eKYT可信签约-初始化
         */
        public InitEkytTrustsignResponse InitEkytTrustsignEx(InitEkytTrustsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEkytTrustsignResponse>(DoRequest("1.0", "antsecuritytech.gateway.ekyt.trustsign.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT可信签约初始化
         * Summary: eKYT可信签约-初始化
         */
        public async Task<InitEkytTrustsignResponse> InitEkytTrustsignExAsync(InitEkytTrustsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEkytTrustsignResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ekyt.trustsign.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT可信签约签约单查询
         * Summary: eKYT可信签约-签约单查询
         */
        public QueryEkytTrustsignResponse QueryEkytTrustsign(QueryEkytTrustsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEkytTrustsignEx(request, headers, runtime);
        }

        /**
         * Description: eKYT可信签约签约单查询
         * Summary: eKYT可信签约-签约单查询
         */
        public async Task<QueryEkytTrustsignResponse> QueryEkytTrustsignAsync(QueryEkytTrustsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEkytTrustsignExAsync(request, headers, runtime);
        }

        /**
         * Description: eKYT可信签约签约单查询
         * Summary: eKYT可信签约-签约单查询
         */
        public QueryEkytTrustsignResponse QueryEkytTrustsignEx(QueryEkytTrustsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEkytTrustsignResponse>(DoRequest("1.0", "antsecuritytech.gateway.ekyt.trustsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT可信签约签约单查询
         * Summary: eKYT可信签约-签约单查询
         */
        public async Task<QueryEkytTrustsignResponse> QueryEkytTrustsignExAsync(QueryEkytTrustsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEkytTrustsignResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ekyt.trustsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT人脸核身初始化
         * Summary: eKYT人脸核身-初始化
         */
        public InitEkytFaceverifyResponse InitEkytFaceverify(InitEkytFaceverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitEkytFaceverifyEx(request, headers, runtime);
        }

        /**
         * Description: eKYT人脸核身初始化
         * Summary: eKYT人脸核身-初始化
         */
        public async Task<InitEkytFaceverifyResponse> InitEkytFaceverifyAsync(InitEkytFaceverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitEkytFaceverifyExAsync(request, headers, runtime);
        }

        /**
         * Description: eKYT人脸核身初始化
         * Summary: eKYT人脸核身-初始化
         */
        public InitEkytFaceverifyResponse InitEkytFaceverifyEx(InitEkytFaceverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEkytFaceverifyResponse>(DoRequest("1.0", "antsecuritytech.gateway.ekyt.faceverify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT人脸核身初始化
         * Summary: eKYT人脸核身-初始化
         */
        public async Task<InitEkytFaceverifyResponse> InitEkytFaceverifyExAsync(InitEkytFaceverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEkytFaceverifyResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ekyt.faceverify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT人脸核身结果查询
         * Summary: eKYT人脸核身-结果查询
         */
        public QueryEkytFaceverifyResponse QueryEkytFaceverify(QueryEkytFaceverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEkytFaceverifyEx(request, headers, runtime);
        }

        /**
         * Description: eKYT人脸核身结果查询
         * Summary: eKYT人脸核身-结果查询
         */
        public async Task<QueryEkytFaceverifyResponse> QueryEkytFaceverifyAsync(QueryEkytFaceverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEkytFaceverifyExAsync(request, headers, runtime);
        }

        /**
         * Description: eKYT人脸核身结果查询
         * Summary: eKYT人脸核身-结果查询
         */
        public QueryEkytFaceverifyResponse QueryEkytFaceverifyEx(QueryEkytFaceverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEkytFaceverifyResponse>(DoRequest("1.0", "antsecuritytech.gateway.ekyt.faceverify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT人脸核身结果查询
         * Summary: eKYT人脸核身-结果查询
         */
        public async Task<QueryEkytFaceverifyResponse> QueryEkytFaceverifyExAsync(QueryEkytFaceverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEkytFaceverifyResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ekyt.faceverify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 友活来了创建任务api
         * Summary: 友活来了创建任务api
         */
        public ImportYhllResponse ImportYhll(ImportYhllRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportYhllEx(request, headers, runtime);
        }

        /**
         * Description: 友活来了创建任务api
         * Summary: 友活来了创建任务api
         */
        public async Task<ImportYhllResponse> ImportYhllAsync(ImportYhllRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportYhllExAsync(request, headers, runtime);
        }

        /**
         * Description: 友活来了创建任务api
         * Summary: 友活来了创建任务api
         */
        public ImportYhllResponse ImportYhllEx(ImportYhllRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportYhllResponse>(DoRequest("1.0", "antsecuritytech.gateway.yhll.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 友活来了创建任务api
         * Summary: 友活来了创建任务api
         */
        public async Task<ImportYhllResponse> ImportYhllExAsync(ImportYhllRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportYhllResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.yhll.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 友活来了任务查询api
         * Summary: 友活来了任务查询api
         */
        public QueryYhllResponse QueryYhll(QueryYhllRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryYhllEx(request, headers, runtime);
        }

        /**
         * Description: 友活来了任务查询api
         * Summary: 友活来了任务查询api
         */
        public async Task<QueryYhllResponse> QueryYhllAsync(QueryYhllRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryYhllExAsync(request, headers, runtime);
        }

        /**
         * Description: 友活来了任务查询api
         * Summary: 友活来了任务查询api
         */
        public QueryYhllResponse QueryYhllEx(QueryYhllRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYhllResponse>(DoRequest("1.0", "antsecuritytech.gateway.yhll.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 友活来了任务查询api
         * Summary: 友活来了任务查询api
         */
        public async Task<QueryYhllResponse> QueryYhllExAsync(QueryYhllRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYhllResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.yhll.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天鉴ask接口
         * Summary: 天鉴ask接口
         */
        public QueryGuardAskResponse QueryGuardAsk(QueryGuardAskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardAskEx(request, headers, runtime);
        }

        /**
         * Description: 天鉴ask接口
         * Summary: 天鉴ask接口
         */
        public async Task<QueryGuardAskResponse> QueryGuardAskAsync(QueryGuardAskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardAskExAsync(request, headers, runtime);
        }

        /**
         * Description: 天鉴ask接口
         * Summary: 天鉴ask接口
         */
        public QueryGuardAskResponse QueryGuardAskEx(QueryGuardAskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAskResponse>(DoRequest("1.0", "antsecuritytech.gateway.guard.ask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天鉴ask接口
         * Summary: 天鉴ask接口
         */
        public async Task<QueryGuardAskResponse> QueryGuardAskExAsync(QueryGuardAskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAskResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.guard.ask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天鉴answer接口
         * Summary: 天鉴answer接口
         */
        public QueryGuardAnswerResponse QueryGuardAnswer(QueryGuardAnswerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardAnswerEx(request, headers, runtime);
        }

        /**
         * Description: 天鉴answer接口
         * Summary: 天鉴answer接口
         */
        public async Task<QueryGuardAnswerResponse> QueryGuardAnswerAsync(QueryGuardAnswerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardAnswerExAsync(request, headers, runtime);
        }

        /**
         * Description: 天鉴answer接口
         * Summary: 天鉴answer接口
         */
        public QueryGuardAnswerResponse QueryGuardAnswerEx(QueryGuardAnswerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAnswerResponse>(DoRequest("1.0", "antsecuritytech.gateway.guard.answer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 天鉴answer接口
         * Summary: 天鉴answer接口
         */
        public async Task<QueryGuardAnswerResponse> QueryGuardAnswerExAsync(QueryGuardAnswerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAnswerResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.guard.answer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开放给设备产商，删除数字钥匙
         * Summary: 删除数字钥匙
         */
        public DeleteIifaaDigitalkeyResponse DeleteIifaaDigitalkey(DeleteIifaaDigitalkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteIifaaDigitalkeyEx(request, headers, runtime);
        }

        /**
         * Description: 开放给设备产商，删除数字钥匙
         * Summary: 删除数字钥匙
         */
        public async Task<DeleteIifaaDigitalkeyResponse> DeleteIifaaDigitalkeyAsync(DeleteIifaaDigitalkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteIifaaDigitalkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 开放给设备产商，删除数字钥匙
         * Summary: 删除数字钥匙
         */
        public DeleteIifaaDigitalkeyResponse DeleteIifaaDigitalkeyEx(DeleteIifaaDigitalkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIifaaDigitalkeyResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.digitalkey.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开放给设备产商，删除数字钥匙
         * Summary: 删除数字钥匙
         */
        public async Task<DeleteIifaaDigitalkeyResponse> DeleteIifaaDigitalkeyExAsync(DeleteIifaaDigitalkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIifaaDigitalkeyResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.digitalkey.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 光鉴智能凭证
         * Summary: 光鉴智能凭证
         */
        public CheckOpticalIdentifyResponse CheckOpticalIdentify(CheckOpticalIdentifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckOpticalIdentifyEx(request, headers, runtime);
        }

        /**
         * Description: 光鉴智能凭证
         * Summary: 光鉴智能凭证
         */
        public async Task<CheckOpticalIdentifyResponse> CheckOpticalIdentifyAsync(CheckOpticalIdentifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckOpticalIdentifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 光鉴智能凭证
         * Summary: 光鉴智能凭证
         */
        public CheckOpticalIdentifyResponse CheckOpticalIdentifyEx(CheckOpticalIdentifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckOpticalIdentifyResponse>(DoRequest("1.0", "antsecuritytech.gateway.optical.identify.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 光鉴智能凭证
         * Summary: 光鉴智能凭证
         */
        public async Task<CheckOpticalIdentifyResponse> CheckOpticalIdentifyExAsync(CheckOpticalIdentifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckOpticalIdentifyResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.optical.identify.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
