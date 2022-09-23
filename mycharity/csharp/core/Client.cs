// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.MYCHARITY.Models;

namespace AntChain.SDK.MYCHARITY
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
                        {"sdk_version", "1.0.14"},
                        {"_prod_code", "MYCHARITY"},
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
                        {"sdk_version", "1.0.14"},
                        {"_prod_code", "MYCHARITY"},
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
         * Description: 待签约账号创建
         * Summary: 待签约账号创建
         */
        public CreateAlipaysignResponse CreateAlipaysign(CreateAlipaysignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAlipaysignEx(request, headers, runtime);
        }

        /**
         * Description: 待签约账号创建
         * Summary: 待签约账号创建
         */
        public async Task<CreateAlipaysignResponse> CreateAlipaysignAsync(CreateAlipaysignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAlipaysignExAsync(request, headers, runtime);
        }

        /**
         * Description: 待签约账号创建
         * Summary: 待签约账号创建
         */
        public CreateAlipaysignResponse CreateAlipaysignEx(CreateAlipaysignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlipaysignResponse>(DoRequest("1.0", "antchain.mycharity.alipaysign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 待签约账号创建
         * Summary: 待签约账号创建
         */
        public async Task<CreateAlipaysignResponse> CreateAlipaysignExAsync(CreateAlipaysignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAlipaysignResponse>(await DoRequestAsync("1.0", "antchain.mycharity.alipaysign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构下代扣账号签约状态查询
         * Summary: 机构下代扣账号签约状态查询
         */
        public QueryAlipaysignStateResponse QueryAlipaysignState(QueryAlipaysignStateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlipaysignStateEx(request, headers, runtime);
        }

        /**
         * Description: 机构下代扣账号签约状态查询
         * Summary: 机构下代扣账号签约状态查询
         */
        public async Task<QueryAlipaysignStateResponse> QueryAlipaysignStateAsync(QueryAlipaysignStateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlipaysignStateExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构下代扣账号签约状态查询
         * Summary: 机构下代扣账号签约状态查询
         */
        public QueryAlipaysignStateResponse QueryAlipaysignStateEx(QueryAlipaysignStateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlipaysignStateResponse>(DoRequest("1.0", "antchain.mycharity.alipaysign.state.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构下代扣账号签约状态查询
         * Summary: 机构下代扣账号签约状态查询
         */
        public async Task<QueryAlipaysignStateResponse> QueryAlipaysignStateExAsync(QueryAlipaysignStateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlipaysignStateResponse>(await DoRequestAsync("1.0", "antchain.mycharity.alipaysign.state.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账号签约二维码获取
         * Summary: 账号签约二维码获取
         */
        public QueryAlipaysignQrcodeResponse QueryAlipaysignQrcode(QueryAlipaysignQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlipaysignQrcodeEx(request, headers, runtime);
        }

        /**
         * Description: 账号签约二维码获取
         * Summary: 账号签约二维码获取
         */
        public async Task<QueryAlipaysignQrcodeResponse> QueryAlipaysignQrcodeAsync(QueryAlipaysignQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlipaysignQrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 账号签约二维码获取
         * Summary: 账号签约二维码获取
         */
        public QueryAlipaysignQrcodeResponse QueryAlipaysignQrcodeEx(QueryAlipaysignQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlipaysignQrcodeResponse>(DoRequest("1.0", "antchain.mycharity.alipaysign.qrcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账号签约二维码获取
         * Summary: 账号签约二维码获取
         */
        public async Task<QueryAlipaysignQrcodeResponse> QueryAlipaysignQrcodeExAsync(QueryAlipaysignQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlipaysignQrcodeResponse>(await DoRequestAsync("1.0", "antchain.mycharity.alipaysign.qrcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建人员并配置权限。如人员已经存在，则不创建。
         * Summary: 创建人员及配置权限
         */
        public CreatePersonPermissionResponse CreatePersonPermission(CreatePersonPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatePersonPermissionEx(request, headers, runtime);
        }

        /**
         * Description: 创建人员并配置权限。如人员已经存在，则不创建。
         * Summary: 创建人员及配置权限
         */
        public async Task<CreatePersonPermissionResponse> CreatePersonPermissionAsync(CreatePersonPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatePersonPermissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建人员并配置权限。如人员已经存在，则不创建。
         * Summary: 创建人员及配置权限
         */
        public CreatePersonPermissionResponse CreatePersonPermissionEx(CreatePersonPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePersonPermissionResponse>(DoRequest("1.0", "antchain.mycharity.person.permission.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建人员并配置权限。如人员已经存在，则不创建。
         * Summary: 创建人员及配置权限
         */
        public async Task<CreatePersonPermissionResponse> CreatePersonPermissionExAsync(CreatePersonPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePersonPermissionResponse>(await DoRequestAsync("1.0", "antchain.mycharity.person.permission.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 允许已授权的用户通过此接口删除人员权限。
         * Summary: 配置权限删除
         */
        public DeletePersonResponse DeletePerson(DeletePersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeletePersonEx(request, headers, runtime);
        }

        /**
         * Description: 允许已授权的用户通过此接口删除人员权限。
         * Summary: 配置权限删除
         */
        public async Task<DeletePersonResponse> DeletePersonAsync(DeletePersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeletePersonExAsync(request, headers, runtime);
        }

        /**
         * Description: 允许已授权的用户通过此接口删除人员权限。
         * Summary: 配置权限删除
         */
        public DeletePersonResponse DeletePersonEx(DeletePersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeletePersonResponse>(DoRequest("1.0", "antchain.mycharity.person.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 允许已授权的用户通过此接口删除人员权限。
         * Summary: 配置权限删除
         */
        public async Task<DeletePersonResponse> DeletePersonExAsync(DeletePersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeletePersonResponse>(await DoRequestAsync("1.0", "antchain.mycharity.person.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建批次
         * Summary: 创建批次
         */
        public InitBatchResponse InitBatch(InitBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitBatchEx(request, headers, runtime);
        }

        /**
         * Description: 创建批次
         * Summary: 创建批次
         */
        public async Task<InitBatchResponse> InitBatchAsync(InitBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitBatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建批次
         * Summary: 创建批次
         */
        public InitBatchResponse InitBatchEx(InitBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitBatchResponse>(DoRequest("1.0", "antchain.mycharity.batch.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建批次
         * Summary: 创建批次
         */
        public async Task<InitBatchResponse> InitBatchExAsync(InitBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitBatchResponse>(await DoRequestAsync("1.0", "antchain.mycharity.batch.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改批次状态
         * Summary: 修改批次状态
         */
        public UpdateBatchResponse UpdateBatch(UpdateBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBatchEx(request, headers, runtime);
        }

        /**
         * Description: 修改批次状态
         * Summary: 修改批次状态
         */
        public async Task<UpdateBatchResponse> UpdateBatchAsync(UpdateBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改批次状态
         * Summary: 修改批次状态
         */
        public UpdateBatchResponse UpdateBatchEx(UpdateBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBatchResponse>(DoRequest("1.0", "antchain.mycharity.batch.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改批次状态
         * Summary: 修改批次状态
         */
        public async Task<UpdateBatchResponse> UpdateBatchExAsync(UpdateBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBatchResponse>(await DoRequestAsync("1.0", "antchain.mycharity.batch.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除批次
         * Summary: 删除批次
         */
        public DeleteBatchResponse DeleteBatch(DeleteBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteBatchEx(request, headers, runtime);
        }

        /**
         * Description: 删除批次
         * Summary: 删除批次
         */
        public async Task<DeleteBatchResponse> DeleteBatchAsync(DeleteBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteBatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除批次
         * Summary: 删除批次
         */
        public DeleteBatchResponse DeleteBatchEx(DeleteBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBatchResponse>(DoRequest("1.0", "antchain.mycharity.batch.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除批次
         * Summary: 删除批次
         */
        public async Task<DeleteBatchResponse> DeleteBatchExAsync(DeleteBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBatchResponse>(await DoRequestAsync("1.0", "antchain.mycharity.batch.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建项目分期
         * Summary: 创建分期
         */
        public CreateStagesResponse CreateStages(CreateStagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateStagesEx(request, headers, runtime);
        }

        /**
         * Description: 创建项目分期
         * Summary: 创建分期
         */
        public async Task<CreateStagesResponse> CreateStagesAsync(CreateStagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateStagesExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建项目分期
         * Summary: 创建分期
         */
        public CreateStagesResponse CreateStagesEx(CreateStagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStagesResponse>(DoRequest("1.0", "antchain.mycharity.stages.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建项目分期
         * Summary: 创建分期
         */
        public async Task<CreateStagesResponse> CreateStagesExAsync(CreateStagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStagesResponse>(await DoRequestAsync("1.0", "antchain.mycharity.stages.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询批次
         * Summary: 查询批次
         */
        public QueryBatchResponse QueryBatch(QueryBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBatchEx(request, headers, runtime);
        }

        /**
         * Description: 查询批次
         * Summary: 查询批次
         */
        public async Task<QueryBatchResponse> QueryBatchAsync(QueryBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询批次
         * Summary: 查询批次
         */
        public QueryBatchResponse QueryBatchEx(QueryBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBatchResponse>(DoRequest("1.0", "antchain.mycharity.batch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询批次
         * Summary: 查询批次
         */
        public async Task<QueryBatchResponse> QueryBatchExAsync(QueryBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBatchResponse>(await DoRequestAsync("1.0", "antchain.mycharity.batch.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新项目分期
         * Summary: 更新分期
         */
        public UpdateStagesResponse UpdateStages(UpdateStagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateStagesEx(request, headers, runtime);
        }

        /**
         * Description: 更新项目分期
         * Summary: 更新分期
         */
        public async Task<UpdateStagesResponse> UpdateStagesAsync(UpdateStagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateStagesExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新项目分期
         * Summary: 更新分期
         */
        public UpdateStagesResponse UpdateStagesEx(UpdateStagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStagesResponse>(DoRequest("1.0", "antchain.mycharity.stages.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新项目分期
         * Summary: 更新分期
         */
        public async Task<UpdateStagesResponse> UpdateStagesExAsync(UpdateStagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateStagesResponse>(await DoRequestAsync("1.0", "antchain.mycharity.stages.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建机构
         * Summary: 创建机构
         */
        public CreateOrgResponse CreateOrg(CreateOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOrgEx(request, headers, runtime);
        }

        /**
         * Description: 创建机构
         * Summary: 创建机构
         */
        public async Task<CreateOrgResponse> CreateOrgAsync(CreateOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOrgExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建机构
         * Summary: 创建机构
         */
        public CreateOrgResponse CreateOrgEx(CreateOrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrgResponse>(DoRequest("1.0", "antchain.mycharity.org.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建机构
         * Summary: 创建机构
         */
        public async Task<CreateOrgResponse> CreateOrgExAsync(CreateOrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrgResponse>(await DoRequestAsync("1.0", "antchain.mycharity.org.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分期
         * Summary: 查询分期
         */
        public QueryStagesResponse QueryStages(QueryStagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStagesEx(request, headers, runtime);
        }

        /**
         * Description: 查询分期
         * Summary: 查询分期
         */
        public async Task<QueryStagesResponse> QueryStagesAsync(QueryStagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStagesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询分期
         * Summary: 查询分期
         */
        public QueryStagesResponse QueryStagesEx(QueryStagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStagesResponse>(DoRequest("1.0", "antchain.mycharity.stages.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分期
         * Summary: 查询分期
         */
        public async Task<QueryStagesResponse> QueryStagesExAsync(QueryStagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStagesResponse>(await DoRequestAsync("1.0", "antchain.mycharity.stages.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新机构
         * Summary: 更新机构
         */
        public UpdateOrgResponse UpdateOrg(UpdateOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateOrgEx(request, headers, runtime);
        }

        /**
         * Description: 更新机构
         * Summary: 更新机构
         */
        public async Task<UpdateOrgResponse> UpdateOrgAsync(UpdateOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateOrgExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新机构
         * Summary: 更新机构
         */
        public UpdateOrgResponse UpdateOrgEx(UpdateOrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOrgResponse>(DoRequest("1.0", "antchain.mycharity.org.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新机构
         * Summary: 更新机构
         */
        public async Task<UpdateOrgResponse> UpdateOrgExAsync(UpdateOrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOrgResponse>(await DoRequestAsync("1.0", "antchain.mycharity.org.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建实施内容
         * Summary: 创建实施内容
         */
        public CreateCombinationResponse CreateCombination(CreateCombinationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCombinationEx(request, headers, runtime);
        }

        /**
         * Description: 创建实施内容
         * Summary: 创建实施内容
         */
        public async Task<CreateCombinationResponse> CreateCombinationAsync(CreateCombinationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCombinationExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建实施内容
         * Summary: 创建实施内容
         */
        public CreateCombinationResponse CreateCombinationEx(CreateCombinationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCombinationResponse>(DoRequest("1.0", "antchain.mycharity.combination.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建实施内容
         * Summary: 创建实施内容
         */
        public async Task<CreateCombinationResponse> CreateCombinationExAsync(CreateCombinationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCombinationResponse>(await DoRequestAsync("1.0", "antchain.mycharity.combination.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构详情
         * Summary: 机构详情
         */
        public DetailOrgResponse DetailOrg(DetailOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailOrgEx(request, headers, runtime);
        }

        /**
         * Description: 机构详情
         * Summary: 机构详情
         */
        public async Task<DetailOrgResponse> DetailOrgAsync(DetailOrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailOrgExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构详情
         * Summary: 机构详情
         */
        public DetailOrgResponse DetailOrgEx(DetailOrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailOrgResponse>(DoRequest("1.0", "antchain.mycharity.org.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构详情
         * Summary: 机构详情
         */
        public async Task<DetailOrgResponse> DetailOrgExAsync(DetailOrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailOrgResponse>(await DoRequestAsync("1.0", "antchain.mycharity.org.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改实施内容
         * Summary: 修改实施内容
         */
        public UpdateCombinationResponse UpdateCombination(UpdateCombinationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCombinationEx(request, headers, runtime);
        }

        /**
         * Description: 修改实施内容
         * Summary: 修改实施内容
         */
        public async Task<UpdateCombinationResponse> UpdateCombinationAsync(UpdateCombinationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCombinationExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改实施内容
         * Summary: 修改实施内容
         */
        public UpdateCombinationResponse UpdateCombinationEx(UpdateCombinationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCombinationResponse>(DoRequest("1.0", "antchain.mycharity.combination.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改实施内容
         * Summary: 修改实施内容
         */
        public async Task<UpdateCombinationResponse> UpdateCombinationExAsync(UpdateCombinationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCombinationResponse>(await DoRequestAsync("1.0", "antchain.mycharity.combination.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建项目
         * Summary: 创建项目
         */
        public CreateProjectResponse CreateProject(CreateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateProjectEx(request, headers, runtime);
        }

        /**
         * Description: 创建项目
         * Summary: 创建项目
         */
        public async Task<CreateProjectResponse> CreateProjectAsync(CreateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建项目
         * Summary: 创建项目
         */
        public CreateProjectResponse CreateProjectEx(CreateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectResponse>(DoRequest("1.0", "antchain.mycharity.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建项目
         * Summary: 创建项目
         */
        public async Task<CreateProjectResponse> CreateProjectExAsync(CreateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectResponse>(await DoRequestAsync("1.0", "antchain.mycharity.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新项目
         * Summary: 更新项目
         */
        public UpdateProjectResponse UpdateProject(UpdateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateProjectEx(request, headers, runtime);
        }

        /**
         * Description: 更新项目
         * Summary: 更新项目
         */
        public async Task<UpdateProjectResponse> UpdateProjectAsync(UpdateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新项目
         * Summary: 更新项目
         */
        public UpdateProjectResponse UpdateProjectEx(UpdateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateProjectResponse>(DoRequest("1.0", "antchain.mycharity.project.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新项目
         * Summary: 更新项目
         */
        public async Task<UpdateProjectResponse> UpdateProjectExAsync(UpdateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateProjectResponse>(await DoRequestAsync("1.0", "antchain.mycharity.project.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 项目详情
         * Summary: 项目详情
         */
        public DetailProjectResponse DetailProject(DetailProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailProjectEx(request, headers, runtime);
        }

        /**
         * Description: 项目详情
         * Summary: 项目详情
         */
        public async Task<DetailProjectResponse> DetailProjectAsync(DetailProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 项目详情
         * Summary: 项目详情
         */
        public DetailProjectResponse DetailProjectEx(DetailProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailProjectResponse>(DoRequest("1.0", "antchain.mycharity.project.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 项目详情
         * Summary: 项目详情
         */
        public async Task<DetailProjectResponse> DetailProjectExAsync(DetailProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailProjectResponse>(await DoRequestAsync("1.0", "antchain.mycharity.project.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实施内容
         * Summary: 查询实施内容
         */
        public QueryCombinationResponse QueryCombination(QueryCombinationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCombinationEx(request, headers, runtime);
        }

        /**
         * Description: 查询实施内容
         * Summary: 查询实施内容
         */
        public async Task<QueryCombinationResponse> QueryCombinationAsync(QueryCombinationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCombinationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询实施内容
         * Summary: 查询实施内容
         */
        public QueryCombinationResponse QueryCombinationEx(QueryCombinationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCombinationResponse>(DoRequest("1.0", "antchain.mycharity.combination.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实施内容
         * Summary: 查询实施内容
         */
        public async Task<QueryCombinationResponse> QueryCombinationExAsync(QueryCombinationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCombinationResponse>(await DoRequestAsync("1.0", "antchain.mycharity.combination.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建执行记录
         * Summary: 批量创建执行记录
         */
        public BatchcreateRecordResponse BatchcreateRecord(BatchcreateRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateRecordEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建执行记录
         * Summary: 批量创建执行记录
         */
        public async Task<BatchcreateRecordResponse> BatchcreateRecordAsync(BatchcreateRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateRecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建执行记录
         * Summary: 批量创建执行记录
         */
        public BatchcreateRecordResponse BatchcreateRecordEx(BatchcreateRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateRecordResponse>(DoRequest("1.0", "antchain.mycharity.record.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建执行记录
         * Summary: 批量创建执行记录
         */
        public async Task<BatchcreateRecordResponse> BatchcreateRecordExAsync(BatchcreateRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateRecordResponse>(await DoRequestAsync("1.0", "antchain.mycharity.record.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建批次
         * Summary: 创建批次
         */
        public CreateBatchResponse CreateBatch(CreateBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBatchEx(request, headers, runtime);
        }

        /**
         * Description: 创建批次
         * Summary: 创建批次
         */
        public async Task<CreateBatchResponse> CreateBatchAsync(CreateBatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建批次
         * Summary: 创建批次
         */
        public CreateBatchResponse CreateBatchEx(CreateBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBatchResponse>(DoRequest("1.0", "antchain.mycharity.batch.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建批次
         * Summary: 创建批次
         */
        public async Task<CreateBatchResponse> CreateBatchExAsync(CreateBatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBatchResponse>(await DoRequestAsync("1.0", "antchain.mycharity.batch.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改执行记录状态
         * Summary: 修改执行记录状态
         */
        public UpdateRecordResponse UpdateRecord(UpdateRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRecordEx(request, headers, runtime);
        }

        /**
         * Description: 修改执行记录状态
         * Summary: 修改执行记录状态
         */
        public async Task<UpdateRecordResponse> UpdateRecordAsync(UpdateRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改执行记录状态
         * Summary: 修改执行记录状态
         */
        public UpdateRecordResponse UpdateRecordEx(UpdateRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRecordResponse>(DoRequest("1.0", "antchain.mycharity.record.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改执行记录状态
         * Summary: 修改执行记录状态
         */
        public async Task<UpdateRecordResponse> UpdateRecordExAsync(UpdateRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRecordResponse>(await DoRequestAsync("1.0", "antchain.mycharity.record.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建、修改、删除实施内容
         * Summary: 批量创建、修改、删除实施内容
         */
        public BatchcreateCombinationResponse BatchcreateCombination(BatchcreateCombinationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateCombinationEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建、修改、删除实施内容
         * Summary: 批量创建、修改、删除实施内容
         */
        public async Task<BatchcreateCombinationResponse> BatchcreateCombinationAsync(BatchcreateCombinationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateCombinationExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建、修改、删除实施内容
         * Summary: 批量创建、修改、删除实施内容
         */
        public BatchcreateCombinationResponse BatchcreateCombinationEx(BatchcreateCombinationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateCombinationResponse>(DoRequest("1.0", "antchain.mycharity.combination.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建、修改、删除实施内容
         * Summary: 批量创建、修改、删除实施内容
         */
        public async Task<BatchcreateCombinationResponse> BatchcreateCombinationExAsync(BatchcreateCombinationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateCombinationResponse>(await DoRequestAsync("1.0", "antchain.mycharity.combination.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
