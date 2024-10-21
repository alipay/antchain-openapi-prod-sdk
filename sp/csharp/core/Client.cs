// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.SP.Models;

namespace AntChain.SDK.SP
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
                        {"sdk_version", "4.9.0"},
                        {"_prod_code", "SP"},
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
                        {"sdk_version", "4.9.0"},
                        {"_prod_code", "SP"},
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
         * Description: 更新链上账户余额
         * Summary: 更新链上账户余额
         */
        public UpdateAbilityChainAccountResponse UpdateAbilityChainAccount(UpdateAbilityChainAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAbilityChainAccountEx(request, headers, runtime);
        }

        /**
         * Description: 更新链上账户余额
         * Summary: 更新链上账户余额
         */
        public async Task<UpdateAbilityChainAccountResponse> UpdateAbilityChainAccountAsync(UpdateAbilityChainAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAbilityChainAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新链上账户余额
         * Summary: 更新链上账户余额
         */
        public UpdateAbilityChainAccountResponse UpdateAbilityChainAccountEx(UpdateAbilityChainAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAbilityChainAccountResponse>(DoRequest("1.0", "antcloudspi.ability.chain.account.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新链上账户余额
         * Summary: 更新链上账户余额
         */
        public async Task<UpdateAbilityChainAccountResponse> UpdateAbilityChainAccountExAsync(UpdateAbilityChainAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAbilityChainAccountResponse>(await DoRequestAsync("1.0", "antcloudspi.ability.chain.account.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上资产核销、确认核销成功
         * Summary: 链上资产核销确认
         */
        public UpdateAbilityChainAssetResponse UpdateAbilityChainAsset(UpdateAbilityChainAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAbilityChainAssetEx(request, headers, runtime);
        }

        /**
         * Description: 链上资产核销、确认核销成功
         * Summary: 链上资产核销确认
         */
        public async Task<UpdateAbilityChainAssetResponse> UpdateAbilityChainAssetAsync(UpdateAbilityChainAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAbilityChainAssetExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上资产核销、确认核销成功
         * Summary: 链上资产核销确认
         */
        public UpdateAbilityChainAssetResponse UpdateAbilityChainAssetEx(UpdateAbilityChainAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAbilityChainAssetResponse>(DoRequest("1.0", "antcloudspi.ability.chain.asset.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上资产核销、确认核销成功
         * Summary: 链上资产核销确认
         */
        public async Task<UpdateAbilityChainAssetResponse> UpdateAbilityChainAssetExAsync(UpdateAbilityChainAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAbilityChainAssetResponse>(await DoRequestAsync("1.0", "antcloudspi.ability.chain.asset.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
        停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
         * Summary: SPI-停止服务
         */
        public StopSpProductResponse StopSpProduct(StopSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopSpProductEx(request, headers, runtime);
        }

        /**
         * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
        停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
         * Summary: SPI-停止服务
         */
        public async Task<StopSpProductResponse> StopSpProductAsync(StopSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopSpProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
        停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
         * Summary: SPI-停止服务
         */
        public StopSpProductResponse StopSpProductEx(StopSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopSpProductResponse>(DoRequest("1.0", "antcloudspi.sp.product.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
        停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
         * Summary: SPI-停止服务
         */
        public async Task<StopSpProductResponse> StopSpProductExAsync(StopSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopSpProductResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
        恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
         * Summary: SPI-恢复服务
         */
        public ResumeSpProductResponse ResumeSpProduct(ResumeSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResumeSpProductEx(request, headers, runtime);
        }

        /**
         * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
        恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
         * Summary: SPI-恢复服务
         */
        public async Task<ResumeSpProductResponse> ResumeSpProductAsync(ResumeSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResumeSpProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
        恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
         * Summary: SPI-恢复服务
         */
        public ResumeSpProductResponse ResumeSpProductEx(ResumeSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeSpProductResponse>(DoRequest("1.0", "antcloudspi.sp.product.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
        恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
         * Summary: SPI-恢复服务
         */
        public async Task<ResumeSpProductResponse> ResumeSpProductExAsync(ResumeSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeSpProductResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
        创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
        异步接口，也支持通过参数指定同步返回。
        能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
        注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
         * Summary: SPI-创建产品实例
         */
        public ProvisionSpProductResponse ProvisionSpProduct(ProvisionSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ProvisionSpProductEx(request, headers, runtime);
        }

        /**
         * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
        创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
        异步接口，也支持通过参数指定同步返回。
        能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
        注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
         * Summary: SPI-创建产品实例
         */
        public async Task<ProvisionSpProductResponse> ProvisionSpProductAsync(ProvisionSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ProvisionSpProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
        创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
        异步接口，也支持通过参数指定同步返回。
        能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
        注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
         * Summary: SPI-创建产品实例
         */
        public ProvisionSpProductResponse ProvisionSpProductEx(ProvisionSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ProvisionSpProductResponse>(DoRequest("1.0", "antcloudspi.sp.product.provision", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
        创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
        异步接口，也支持通过参数指定同步返回。
        能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
        注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
         * Summary: SPI-创建产品实例
         */
        public async Task<ProvisionSpProductResponse> ProvisionSpProductExAsync(ProvisionSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ProvisionSpProductResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.provision", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对已有的实例进行规格变更操作。
        支持同步、异步返回结果
        1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
        2.如果变更过程立即生效，则通过sync=true进行返回
        中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
         * Summary: SPI-变更产品实例配置
         */
        public ModifySpProductResponse ModifySpProduct(ModifySpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ModifySpProductEx(request, headers, runtime);
        }

        /**
         * Description: 对已有的实例进行规格变更操作。
        支持同步、异步返回结果
        1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
        2.如果变更过程立即生效，则通过sync=true进行返回
        中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
         * Summary: SPI-变更产品实例配置
         */
        public async Task<ModifySpProductResponse> ModifySpProductAsync(ModifySpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ModifySpProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 对已有的实例进行规格变更操作。
        支持同步、异步返回结果
        1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
        2.如果变更过程立即生效，则通过sync=true进行返回
        中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
         * Summary: SPI-变更产品实例配置
         */
        public ModifySpProductResponse ModifySpProductEx(ModifySpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ModifySpProductResponse>(DoRequest("1.0", "antcloudspi.sp.product.modify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对已有的实例进行规格变更操作。
        支持同步、异步返回结果
        1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
        2.如果变更过程立即生效，则通过sync=true进行返回
        中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
         * Summary: SPI-变更产品实例配置
         */
        public async Task<ModifySpProductResponse> ModifySpProductExAsync(ModifySpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ModifySpProductResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.modify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
        释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
        注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
         * Summary: SPI-释放产品实例
         */
        public ReleaseSpProductResponse ReleaseSpProduct(ReleaseSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReleaseSpProductEx(request, headers, runtime);
        }

        /**
         * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
        释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
        注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
         * Summary: SPI-释放产品实例
         */
        public async Task<ReleaseSpProductResponse> ReleaseSpProductAsync(ReleaseSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReleaseSpProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
        释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
        注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
         * Summary: SPI-释放产品实例
         */
        public ReleaseSpProductResponse ReleaseSpProductEx(ReleaseSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseSpProductResponse>(DoRequest("1.0", "antcloudspi.sp.product.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
        释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
        注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
         * Summary: SPI-释放产品实例
         */
        public async Task<ReleaseSpProductResponse> ReleaseSpProductExAsync(ReleaseSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseSpProductResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
        注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
        接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
         * Summary: SPI-获取产品订单结果
         */
        public GetSpProductOrderResponse GetSpProductOrder(GetSpProductOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSpProductOrderEx(request, headers, runtime);
        }

        /**
         * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
        注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
        接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
         * Summary: SPI-获取产品订单结果
         */
        public async Task<GetSpProductOrderResponse> GetSpProductOrderAsync(GetSpProductOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSpProductOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
        注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
        接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
         * Summary: SPI-获取产品订单结果
         */
        public GetSpProductOrderResponse GetSpProductOrderEx(GetSpProductOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSpProductOrderResponse>(DoRequest("1.0", "antcloudspi.sp.product.order.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
        注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
        接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
         * Summary: SPI-获取产品订单结果
         */
        public async Task<GetSpProductOrderResponse> GetSpProductOrderExAsync(GetSpProductOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSpProductOrderResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.order.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
         * Summary: 从产品方加载购买页参数
         */
        public LoadSpProductOrderparameterResponse LoadSpProductOrderparameter(LoadSpProductOrderparameterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LoadSpProductOrderparameterEx(request, headers, runtime);
        }

        /**
         * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
         * Summary: 从产品方加载购买页参数
         */
        public async Task<LoadSpProductOrderparameterResponse> LoadSpProductOrderparameterAsync(LoadSpProductOrderparameterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LoadSpProductOrderparameterExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
         * Summary: 从产品方加载购买页参数
         */
        public LoadSpProductOrderparameterResponse LoadSpProductOrderparameterEx(LoadSpProductOrderparameterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadSpProductOrderparameterResponse>(DoRequest("1.0", "antcloudspi.sp.product.orderparameter.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
         * Summary: 从产品方加载购买页参数
         */
        public async Task<LoadSpProductOrderparameterResponse> LoadSpProductOrderparameterExAsync(LoadSpProductOrderparameterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadSpProductOrderparameterResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.orderparameter.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 交易结果通知
         * Summary: 交易结果通知
         */
        public SyncIndustryTradeResultResponse SyncIndustryTradeResult(SyncIndustryTradeResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncIndustryTradeResultEx(request, headers, runtime);
        }

        /**
         * Description: 交易结果通知
         * Summary: 交易结果通知
         */
        public async Task<SyncIndustryTradeResultResponse> SyncIndustryTradeResultAsync(SyncIndustryTradeResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncIndustryTradeResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 交易结果通知
         * Summary: 交易结果通知
         */
        public SyncIndustryTradeResultResponse SyncIndustryTradeResultEx(SyncIndustryTradeResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncIndustryTradeResultResponse>(DoRequest("1.0", "antcloudspi.industry.trade.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 交易结果通知
         * Summary: 交易结果通知
         */
        public async Task<SyncIndustryTradeResultResponse> SyncIndustryTradeResultExAsync(SyncIndustryTradeResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncIndustryTradeResultResponse>(await DoRequestAsync("1.0", "antcloudspi.industry.trade.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家注册结果通知
         * Summary: 商家注册结果通知
         */
        public SyncMerchantSignResultResponse SyncMerchantSignResult(SyncMerchantSignResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncMerchantSignResultEx(request, headers, runtime);
        }

        /**
         * Description: 商家注册结果通知
         * Summary: 商家注册结果通知
         */
        public async Task<SyncMerchantSignResultResponse> SyncMerchantSignResultAsync(SyncMerchantSignResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncMerchantSignResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家注册结果通知
         * Summary: 商家注册结果通知
         */
        public SyncMerchantSignResultResponse SyncMerchantSignResultEx(SyncMerchantSignResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncMerchantSignResultResponse>(DoRequest("1.0", "antcloudspi.merchant.sign.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家注册结果通知
         * Summary: 商家注册结果通知
         */
        public async Task<SyncMerchantSignResultResponse> SyncMerchantSignResultExAsync(SyncMerchantSignResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncMerchantSignResultResponse>(await DoRequestAsync("1.0", "antcloudspi.merchant.sign.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 签约状态变更通知
         * Summary: 签约状态变更通知
         */
        public SyncMerchantAgreementResultResponse SyncMerchantAgreementResult(SyncMerchantAgreementResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncMerchantAgreementResultEx(request, headers, runtime);
        }

        /**
         * Description: 签约状态变更通知
         * Summary: 签约状态变更通知
         */
        public async Task<SyncMerchantAgreementResultResponse> SyncMerchantAgreementResultAsync(SyncMerchantAgreementResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncMerchantAgreementResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 签约状态变更通知
         * Summary: 签约状态变更通知
         */
        public SyncMerchantAgreementResultResponse SyncMerchantAgreementResultEx(SyncMerchantAgreementResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncMerchantAgreementResultResponse>(DoRequest("1.0", "antcloudspi.merchant.agreement.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 签约状态变更通知
         * Summary: 签约状态变更通知
         */
        public async Task<SyncMerchantAgreementResultResponse> SyncMerchantAgreementResultExAsync(SyncMerchantAgreementResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncMerchantAgreementResultResponse>(await DoRequestAsync("1.0", "antcloudspi.merchant.agreement.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: pdf
         * Summary: test
         */
        public QueryDemoCccCccResponse QueryDemoCccCcc(QueryDemoCccCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoCccCccEx(request, headers, runtime);
        }

        /**
         * Description: pdf
         * Summary: test
         */
        public async Task<QueryDemoCccCccResponse> QueryDemoCccCccAsync(QueryDemoCccCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoCccCccExAsync(request, headers, runtime);
        }

        /**
         * Description: pdf
         * Summary: test
         */
        public QueryDemoCccCccResponse QueryDemoCccCccEx(QueryDemoCccCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoCccCccResponse>(DoRequest("1.0", "antcloudspi.demo.ccc.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: pdf
         * Summary: test
         */
        public async Task<QueryDemoCccCccResponse> QueryDemoCccCccExAsync(QueryDemoCccCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoCccCccResponse>(await DoRequestAsync("1.0", "antcloudspi.demo.ccc.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）项目签约结果通知
         * Summary: 合作方（伙伴、商家等）项目签约结果通知
         */
        public SyncAcpartnerProjectResultResponse SyncAcpartnerProjectResult(SyncAcpartnerProjectResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAcpartnerProjectResultEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）项目签约结果通知
         * Summary: 合作方（伙伴、商家等）项目签约结果通知
         */
        public async Task<SyncAcpartnerProjectResultResponse> SyncAcpartnerProjectResultAsync(SyncAcpartnerProjectResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAcpartnerProjectResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）项目签约结果通知
         * Summary: 合作方（伙伴、商家等）项目签约结果通知
         */
        public SyncAcpartnerProjectResultResponse SyncAcpartnerProjectResultEx(SyncAcpartnerProjectResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAcpartnerProjectResultResponse>(DoRequest("1.0", "antcloudspi.acpartner.project.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）项目签约结果通知
         * Summary: 合作方（伙伴、商家等）项目签约结果通知
         */
        public async Task<SyncAcpartnerProjectResultResponse> SyncAcpartnerProjectResultExAsync(SyncAcpartnerProjectResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAcpartnerProjectResultResponse>(await DoRequestAsync("1.0", "antcloudspi.acpartner.project.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻结果通知
         * Summary: 合作方（伙伴、商家等）入驻结果通知
         */
        public SyncAcpartnerSettleinResultResponse SyncAcpartnerSettleinResult(SyncAcpartnerSettleinResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAcpartnerSettleinResultEx(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻结果通知
         * Summary: 合作方（伙伴、商家等）入驻结果通知
         */
        public async Task<SyncAcpartnerSettleinResultResponse> SyncAcpartnerSettleinResultAsync(SyncAcpartnerSettleinResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAcpartnerSettleinResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻结果通知
         * Summary: 合作方（伙伴、商家等）入驻结果通知
         */
        public SyncAcpartnerSettleinResultResponse SyncAcpartnerSettleinResultEx(SyncAcpartnerSettleinResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAcpartnerSettleinResultResponse>(DoRequest("1.0", "antcloudspi.acpartner.settlein.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合作方（伙伴、商家等）入驻结果通知
         * Summary: 合作方（伙伴、商家等）入驻结果通知
         */
        public async Task<SyncAcpartnerSettleinResultResponse> SyncAcpartnerSettleinResultExAsync(SyncAcpartnerSettleinResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAcpartnerSettleinResultResponse>(await DoRequestAsync("1.0", "antcloudspi.acpartner.settlein.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 交易平台履约结果通知
         * Summary: 交易平台履约结果通知
         */
        public SyncTradeFulfillResultResponse SyncTradeFulfillResult(SyncTradeFulfillResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncTradeFulfillResultEx(request, headers, runtime);
        }

        /**
         * Description: 交易平台履约结果通知
         * Summary: 交易平台履约结果通知
         */
        public async Task<SyncTradeFulfillResultResponse> SyncTradeFulfillResultAsync(SyncTradeFulfillResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncTradeFulfillResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 交易平台履约结果通知
         * Summary: 交易平台履约结果通知
         */
        public SyncTradeFulfillResultResponse SyncTradeFulfillResultEx(SyncTradeFulfillResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeFulfillResultResponse>(DoRequest("1.0", "antcloudspi.trade.fulfill.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 交易平台履约结果通知
         * Summary: 交易平台履约结果通知
         */
        public async Task<SyncTradeFulfillResultResponse> SyncTradeFulfillResultExAsync(SyncTradeFulfillResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncTradeFulfillResultResponse>(await DoRequestAsync("1.0", "antcloudspi.trade.fulfill.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 目前仅通知商品上架状态变更事件
         * Summary: 商品状态变更通知
         */
        public SyncPccCommodityStatusResponse SyncPccCommodityStatus(SyncPccCommodityStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncPccCommodityStatusEx(request, headers, runtime);
        }

        /**
         * Description: 目前仅通知商品上架状态变更事件
         * Summary: 商品状态变更通知
         */
        public async Task<SyncPccCommodityStatusResponse> SyncPccCommodityStatusAsync(SyncPccCommodityStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncPccCommodityStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 目前仅通知商品上架状态变更事件
         * Summary: 商品状态变更通知
         */
        public SyncPccCommodityStatusResponse SyncPccCommodityStatusEx(SyncPccCommodityStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncPccCommodityStatusResponse>(DoRequest("1.0", "antcloudspi.pcc.commodity.status.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 目前仅通知商品上架状态变更事件
         * Summary: 商品状态变更通知
         */
        public async Task<SyncPccCommodityStatusResponse> SyncPccCommodityStatusExAsync(SyncPccCommodityStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncPccCommodityStatusResponse>(await DoRequestAsync("1.0", "antcloudspi.pcc.commodity.status.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi测试
         * Summary: spi测试
         */
        public QueryDemoEchoResponse QueryDemoEcho(QueryDemoEchoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoEchoEx(request, headers, runtime);
        }

        /**
         * Description: spi测试
         * Summary: spi测试
         */
        public async Task<QueryDemoEchoResponse> QueryDemoEchoAsync(QueryDemoEchoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoEchoExAsync(request, headers, runtime);
        }

        /**
         * Description: spi测试
         * Summary: spi测试
         */
        public QueryDemoEchoResponse QueryDemoEchoEx(QueryDemoEchoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoEchoResponse>(DoRequest("1.0", "antcloudspi.demo.echo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: spi测试
         * Summary: spi测试
         */
        public async Task<QueryDemoEchoResponse> QueryDemoEchoExAsync(QueryDemoEchoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoEchoResponse>(await DoRequestAsync("1.0", "antcloudspi.demo.echo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 逻辑实例创建成功后回调
         * Summary: 逻辑实例创建成功后回调
         */
        public CreateSpProductLogicinstanceResponse CreateSpProductLogicinstance(CreateSpProductLogicinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSpProductLogicinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 逻辑实例创建成功后回调
         * Summary: 逻辑实例创建成功后回调
         */
        public async Task<CreateSpProductLogicinstanceResponse> CreateSpProductLogicinstanceAsync(CreateSpProductLogicinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSpProductLogicinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 逻辑实例创建成功后回调
         * Summary: 逻辑实例创建成功后回调
         */
        public CreateSpProductLogicinstanceResponse CreateSpProductLogicinstanceEx(CreateSpProductLogicinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpProductLogicinstanceResponse>(DoRequest("1.0", "antcloudspi.sp.product.logicinstance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 逻辑实例创建成功后回调
         * Summary: 逻辑实例创建成功后回调
         */
        public async Task<CreateSpProductLogicinstanceResponse> CreateSpProductLogicinstanceExAsync(CreateSpProductLogicinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpProductLogicinstanceResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.logicinstance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品实例续费，支持已经创建的商品，延长生效时间
         * Summary: SPI-商品实例续费
         */
        public RenewSpProductResponse RenewSpProduct(RenewSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RenewSpProductEx(request, headers, runtime);
        }

        /**
         * Description: 商品实例续费，支持已经创建的商品，延长生效时间
         * Summary: SPI-商品实例续费
         */
        public async Task<RenewSpProductResponse> RenewSpProductAsync(RenewSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RenewSpProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品实例续费，支持已经创建的商品，延长生效时间
         * Summary: SPI-商品实例续费
         */
        public RenewSpProductResponse RenewSpProductEx(RenewSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenewSpProductResponse>(DoRequest("1.0", "antcloudspi.sp.product.renew", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品实例续费，支持已经创建的商品，延长生效时间
         * Summary: SPI-商品实例续费
         */
        public async Task<RenewSpProductResponse> RenewSpProductExAsync(RenewSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenewSpProductResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.renew", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
         * Summary: 购买页参数传递给产品方校验
         */
        public CheckSpProductOrderparameterResponse CheckSpProductOrderparameter(CheckSpProductOrderparameterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckSpProductOrderparameterEx(request, headers, runtime);
        }

        /**
         * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
         * Summary: 购买页参数传递给产品方校验
         */
        public async Task<CheckSpProductOrderparameterResponse> CheckSpProductOrderparameterAsync(CheckSpProductOrderparameterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckSpProductOrderparameterExAsync(request, headers, runtime);
        }

        /**
         * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
         * Summary: 购买页参数传递给产品方校验
         */
        public CheckSpProductOrderparameterResponse CheckSpProductOrderparameterEx(CheckSpProductOrderparameterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSpProductOrderparameterResponse>(DoRequest("1.0", "antcloudspi.sp.product.orderparameter.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
         * Summary: 购买页参数传递给产品方校验
         */
        public async Task<CheckSpProductOrderparameterResponse> CheckSpProductOrderparameterExAsync(CheckSpProductOrderparameterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSpProductOrderparameterResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.orderparameter.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通前通知
         * Summary: 开通前通知
         */
        public PreopenSpProductResponse PreopenSpProduct(PreopenSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreopenSpProductEx(request, headers, runtime);
        }

        /**
         * Description: 开通前通知
         * Summary: 开通前通知
         */
        public async Task<PreopenSpProductResponse> PreopenSpProductAsync(PreopenSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreopenSpProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 开通前通知
         * Summary: 开通前通知
         */
        public PreopenSpProductResponse PreopenSpProductEx(PreopenSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreopenSpProductResponse>(DoRequest("1.0", "antcloudspi.sp.product.preopen", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通前通知
         * Summary: 开通前通知
         */
        public async Task<PreopenSpProductResponse> PreopenSpProductExAsync(PreopenSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreopenSpProductResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.preopen", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
        开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
        目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
        注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
         * Summary: SPI-开通产品
         */
        public OpenSpProductResponse OpenSpProduct(OpenSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenSpProductEx(request, headers, runtime);
        }

        /**
         * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
        开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
        目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
        注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
         * Summary: SPI-开通产品
         */
        public async Task<OpenSpProductResponse> OpenSpProductAsync(OpenSpProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenSpProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
        开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
        目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
        注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
         * Summary: SPI-开通产品
         */
        public OpenSpProductResponse OpenSpProductEx(OpenSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenSpProductResponse>(DoRequest("1.0", "antcloudspi.sp.product.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
        开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
        目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
        注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
         * Summary: SPI-开通产品
         */
        public async Task<OpenSpProductResponse> OpenSpProductExAsync(OpenSpProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenSpProductResponse>(await DoRequestAsync("1.0", "antcloudspi.sp.product.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
