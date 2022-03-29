// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.MQ.Models;

namespace AntChain.SDK.MQ
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
                        {"sdk_version", "3.8.22"},
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
                        {"sdk_version", "3.8.22"},
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
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public StatusMqMessageUndeliveryResponse StatusMqMessageUndelivery(StatusMqMessageUndeliveryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StatusMqMessageUndeliveryEx(request, headers, runtime);
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public async Task<StatusMqMessageUndeliveryResponse> StatusMqMessageUndeliveryAsync(StatusMqMessageUndeliveryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StatusMqMessageUndeliveryExAsync(request, headers, runtime);
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public StatusMqMessageUndeliveryResponse StatusMqMessageUndeliveryEx(StatusMqMessageUndeliveryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StatusMqMessageUndeliveryResponse>(DoRequest("1.0", "mq.message.undelivery.status", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public async Task<StatusMqMessageUndeliveryResponse> StatusMqMessageUndeliveryExAsync(StatusMqMessageUndeliveryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StatusMqMessageUndeliveryResponse>(await DoRequestAsync("1.0", "mq.message.undelivery.status", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public UndeliverMessageStatusResponse UndeliverMessageStatus(UndeliverMessageStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UndeliverMessageStatusEx(request, headers, runtime);
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public async Task<UndeliverMessageStatusResponse> UndeliverMessageStatusAsync(UndeliverMessageStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UndeliverMessageStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public UndeliverMessageStatusResponse UndeliverMessageStatusEx(UndeliverMessageStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UndeliverMessageStatusResponse>(DoRequest("1.0", "sofa.mq.message.status.undeliver", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public async Task<UndeliverMessageStatusResponse> UndeliverMessageStatusExAsync(UndeliverMessageStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UndeliverMessageStatusResponse>(await DoRequestAsync("1.0", "sofa.mq.message.status.undeliver", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Add a message type.
         * Summary: add a message type
         */
        public AddMsgtypeResponse AddMsgtype(AddMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: Add a message type.
         * Summary: add a message type
         */
        public async Task<AddMsgtypeResponse> AddMsgtypeAsync(AddMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: Add a message type.
         * Summary: add a message type
         */
        public AddMsgtypeResponse AddMsgtypeEx(AddMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMsgtypeResponse>(DoRequest("1.0", "sofa.mq.msgtype.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Add a message type.
         * Summary: add a message type
         */
        public async Task<AddMsgtypeResponse> AddMsgtypeExAsync(AddMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMsgtypeResponse>(await DoRequestAsync("1.0", "sofa.mq.msgtype.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Update a message type.
         * Summary: update a message type
         */
        public UpdateMsgtypeResponse UpdateMsgtype(UpdateMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: Update a message type.
         * Summary: update a message type
         */
        public async Task<UpdateMsgtypeResponse> UpdateMsgtypeAsync(UpdateMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: Update a message type.
         * Summary: update a message type
         */
        public UpdateMsgtypeResponse UpdateMsgtypeEx(UpdateMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMsgtypeResponse>(DoRequest("1.0", "sofa.mq.msgtype.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Update a message type.
         * Summary: update a message type
         */
        public async Task<UpdateMsgtypeResponse> UpdateMsgtypeExAsync(UpdateMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMsgtypeResponse>(await DoRequestAsync("1.0", "sofa.mq.msgtype.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Delete a message type.
         * Summary: delete a message type
         */
        public DeleteMsgtypeResponse DeleteMsgtype(DeleteMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: Delete a message type.
         * Summary: delete a message type
         */
        public async Task<DeleteMsgtypeResponse> DeleteMsgtypeAsync(DeleteMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: Delete a message type.
         * Summary: delete a message type
         */
        public DeleteMsgtypeResponse DeleteMsgtypeEx(DeleteMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsgtypeResponse>(DoRequest("1.0", "sofa.mq.msgtype.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Delete a message type.
         * Summary: delete a message type
         */
        public async Task<DeleteMsgtypeResponse> DeleteMsgtypeExAsync(DeleteMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsgtypeResponse>(await DoRequestAsync("1.0", "sofa.mq.msgtype.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query the collection of message type.
         * Summary: query the collection of message type
         */
        public QueryMsgtypeResponse QueryMsgtype(QueryMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: Query the collection of message type.
         * Summary: query the collection of message type
         */
        public async Task<QueryMsgtypeResponse> QueryMsgtypeAsync(QueryMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: Query the collection of message type.
         * Summary: query the collection of message type
         */
        public QueryMsgtypeResponse QueryMsgtypeEx(QueryMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMsgtypeResponse>(DoRequest("1.0", "sofa.mq.msgtype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query the collection of message type.
         * Summary: query the collection of message type
         */
        public async Task<QueryMsgtypeResponse> QueryMsgtypeExAsync(QueryMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMsgtypeResponse>(await DoRequestAsync("1.0", "sofa.mq.msgtype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Add a binding.
         * Summary: add a binding
         */
        public AddBindingResponse AddBinding(AddBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddBindingEx(request, headers, runtime);
        }

        /**
         * Description: Add a binding.
         * Summary: add a binding
         */
        public async Task<AddBindingResponse> AddBindingAsync(AddBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: Add a binding.
         * Summary: add a binding
         */
        public AddBindingResponse AddBindingEx(AddBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBindingResponse>(DoRequest("1.0", "sofa.mq.binding.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Add a binding.
         * Summary: add a binding
         */
        public async Task<AddBindingResponse> AddBindingExAsync(AddBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBindingResponse>(await DoRequestAsync("1.0", "sofa.mq.binding.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Update a binding.
         * Summary: update a binding
         */
        public UpdateBindingResponse UpdateBinding(UpdateBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBindingEx(request, headers, runtime);
        }

        /**
         * Description: Update a binding.
         * Summary: update a binding
         */
        public async Task<UpdateBindingResponse> UpdateBindingAsync(UpdateBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: Update a binding.
         * Summary: update a binding
         */
        public UpdateBindingResponse UpdateBindingEx(UpdateBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBindingResponse>(DoRequest("1.0", "sofa.mq.binding.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Update a binding.
         * Summary: update a binding
         */
        public async Task<UpdateBindingResponse> UpdateBindingExAsync(UpdateBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBindingResponse>(await DoRequestAsync("1.0", "sofa.mq.binding.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Delete a binding.
         * Summary: delete a binding
         */
        public DeleteBindingResponse DeleteBinding(DeleteBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteBindingEx(request, headers, runtime);
        }

        /**
         * Description: Delete a binding.
         * Summary: delete a binding
         */
        public async Task<DeleteBindingResponse> DeleteBindingAsync(DeleteBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: Delete a binding.
         * Summary: delete a binding
         */
        public DeleteBindingResponse DeleteBindingEx(DeleteBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBindingResponse>(DoRequest("1.0", "sofa.mq.binding.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Delete a binding.
         * Summary: delete a binding
         */
        public async Task<DeleteBindingResponse> DeleteBindingExAsync(DeleteBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBindingResponse>(await DoRequestAsync("1.0", "sofa.mq.binding.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query the collection of binding.
         * Summary: query the collection of binding
         */
        public QueryBindingResponse QueryBinding(QueryBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBindingEx(request, headers, runtime);
        }

        /**
         * Description: Query the collection of binding.
         * Summary: query the collection of binding
         */
        public async Task<QueryBindingResponse> QueryBindingAsync(QueryBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: Query the collection of binding.
         * Summary: query the collection of binding
         */
        public QueryBindingResponse QueryBindingEx(QueryBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBindingResponse>(DoRequest("1.0", "sofa.mq.binding.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query the collection of binding.
         * Summary: query the collection of binding
         */
        public async Task<QueryBindingResponse> QueryBindingExAsync(QueryBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBindingResponse>(await DoRequestAsync("1.0", "sofa.mq.binding.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Queue switchover execute.
         * Summary: Queue switchover execute
         */
        public ExecuteSwitchoverResponse ExecuteSwitchover(ExecuteSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecuteSwitchoverEx(request, headers, runtime);
        }

        /**
         * Description: Queue switchover execute.
         * Summary: Queue switchover execute
         */
        public async Task<ExecuteSwitchoverResponse> ExecuteSwitchoverAsync(ExecuteSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecuteSwitchoverExAsync(request, headers, runtime);
        }

        /**
         * Description: Queue switchover execute.
         * Summary: Queue switchover execute
         */
        public ExecuteSwitchoverResponse ExecuteSwitchoverEx(ExecuteSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecuteSwitchoverResponse>(DoRequest("1.0", "sofa.mq.switchover.execute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Queue switchover execute.
         * Summary: Queue switchover execute
         */
        public async Task<ExecuteSwitchoverResponse> ExecuteSwitchoverExAsync(ExecuteSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecuteSwitchoverResponse>(await DoRequestAsync("1.0", "sofa.mq.switchover.execute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Queue switchover cancel.
         * Summary: Queue switchover cancel
         */
        public CancelSwitchoverResponse CancelSwitchover(CancelSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelSwitchoverEx(request, headers, runtime);
        }

        /**
         * Description: Queue switchover cancel.
         * Summary: Queue switchover cancel
         */
        public async Task<CancelSwitchoverResponse> CancelSwitchoverAsync(CancelSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelSwitchoverExAsync(request, headers, runtime);
        }

        /**
         * Description: Queue switchover cancel.
         * Summary: Queue switchover cancel
         */
        public CancelSwitchoverResponse CancelSwitchoverEx(CancelSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSwitchoverResponse>(DoRequest("1.0", "sofa.mq.switchover.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Queue switchover cancel.
         * Summary: Queue switchover cancel
         */
        public async Task<CancelSwitchoverResponse> CancelSwitchoverExAsync(CancelSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSwitchoverResponse>(await DoRequestAsync("1.0", "sofa.mq.switchover.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Queue switchover query.
         * Summary: Queue switchover query
         */
        public QuerySwitchoverResponse QuerySwitchover(QuerySwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySwitchoverEx(request, headers, runtime);
        }

        /**
         * Description: Queue switchover query.
         * Summary: Queue switchover query
         */
        public async Task<QuerySwitchoverResponse> QuerySwitchoverAsync(QuerySwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySwitchoverExAsync(request, headers, runtime);
        }

        /**
         * Description: Queue switchover query.
         * Summary: Queue switchover query
         */
        public QuerySwitchoverResponse QuerySwitchoverEx(QuerySwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySwitchoverResponse>(DoRequest("1.0", "sofa.mq.switchover.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Queue switchover query.
         * Summary: Queue switchover query
         */
        public async Task<QuerySwitchoverResponse> QuerySwitchoverExAsync(QuerySwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySwitchoverResponse>(await DoRequestAsync("1.0", "sofa.mq.switchover.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query the collection of message type.
         * Summary: query the collection of message type
         */
        public GetMsgtypeResponse GetMsgtype(GetMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: Query the collection of message type.
         * Summary: query the collection of message type
         */
        public async Task<GetMsgtypeResponse> GetMsgtypeAsync(GetMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: Query the collection of message type.
         * Summary: query the collection of message type
         */
        public GetMsgtypeResponse GetMsgtypeEx(GetMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMsgtypeResponse>(DoRequest("2.0", "sofa.mq.msgtype.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query the collection of message type.
         * Summary: query the collection of message type
         */
        public async Task<GetMsgtypeResponse> GetMsgtypeExAsync(GetMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMsgtypeResponse>(await DoRequestAsync("2.0", "sofa.mq.msgtype.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public UndeliveryMessageStatusResponse UndeliveryMessageStatus(UndeliveryMessageStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UndeliveryMessageStatusEx(request, headers, runtime);
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public async Task<UndeliveryMessageStatusResponse> UndeliveryMessageStatusAsync(UndeliveryMessageStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UndeliveryMessageStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public UndeliveryMessageStatusResponse UndeliveryMessageStatusEx(UndeliveryMessageStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UndeliveryMessageStatusResponse>(DoRequest("2.0", "sofa.mq.message.status.undelivery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query undelivery message status.
         * Summary: query undelivery message status
         */
        public async Task<UndeliveryMessageStatusResponse> UndeliveryMessageStatusExAsync(UndeliveryMessageStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UndeliveryMessageStatusResponse>(await DoRequestAsync("2.0", "sofa.mq.message.status.undelivery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query topics
         * Summary: query topics
         */
        public QueryTopicsResponse QueryTopics(QueryTopicsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTopicsEx(request, headers, runtime);
        }

        /**
         * Description: query topics
         * Summary: query topics
         */
        public async Task<QueryTopicsResponse> QueryTopicsAsync(QueryTopicsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTopicsExAsync(request, headers, runtime);
        }

        /**
         * Description: query topics
         * Summary: query topics
         */
        public QueryTopicsResponse QueryTopicsEx(QueryTopicsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTopicsResponse>(DoRequest("2.0", "sofa.mq.topics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query topics
         * Summary: query topics
         */
        public async Task<QueryTopicsResponse> QueryTopicsExAsync(QueryTopicsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTopicsResponse>(await DoRequestAsync("2.0", "sofa.mq.topics.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query topic
         * Summary: query topic
         */
        public IdTopicQueryResponse IdTopicQuery(IdTopicQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return IdTopicQueryEx(request, headers, runtime);
        }

        /**
         * Description: query topic
         * Summary: query topic
         */
        public async Task<IdTopicQueryResponse> IdTopicQueryAsync(IdTopicQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await IdTopicQueryExAsync(request, headers, runtime);
        }

        /**
         * Description: query topic
         * Summary: query topic
         */
        public IdTopicQueryResponse IdTopicQueryEx(IdTopicQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IdTopicQueryResponse>(DoRequest("2.0", "sofa.mq.topic.query.id", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query topic
         * Summary: query topic
         */
        public async Task<IdTopicQueryResponse> IdTopicQueryExAsync(IdTopicQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IdTopicQueryResponse>(await DoRequestAsync("2.0", "sofa.mq.topic.query.id", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: add topic
         * Summary: add topic
         */
        public AddTopicResponse AddTopic(AddTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddTopicEx(request, headers, runtime);
        }

        /**
         * Description: add topic
         * Summary: add topic
         */
        public async Task<AddTopicResponse> AddTopicAsync(AddTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddTopicExAsync(request, headers, runtime);
        }

        /**
         * Description: add topic
         * Summary: add topic
         */
        public AddTopicResponse AddTopicEx(AddTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTopicResponse>(DoRequest("2.0", "sofa.mq.topic.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: add topic
         * Summary: add topic
         */
        public async Task<AddTopicResponse> AddTopicExAsync(AddTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTopicResponse>(await DoRequestAsync("2.0", "sofa.mq.topic.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update topic
         * Summary: update topic
         */
        public UpdateTopicResponse UpdateTopic(UpdateTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTopicEx(request, headers, runtime);
        }

        /**
         * Description: update topic
         * Summary: update topic
         */
        public async Task<UpdateTopicResponse> UpdateTopicAsync(UpdateTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTopicExAsync(request, headers, runtime);
        }

        /**
         * Description: update topic
         * Summary: update topic
         */
        public UpdateTopicResponse UpdateTopicEx(UpdateTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTopicResponse>(DoRequest("2.0", "sofa.mq.topic.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update topic
         * Summary: update topic
         */
        public async Task<UpdateTopicResponse> UpdateTopicExAsync(UpdateTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTopicResponse>(await DoRequestAsync("2.0", "sofa.mq.topic.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete topic
         * Summary: delete topic
         */
        public DeleteTopicResponse DeleteTopic(DeleteTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTopicEx(request, headers, runtime);
        }

        /**
         * Description: delete topic
         * Summary: delete topic
         */
        public async Task<DeleteTopicResponse> DeleteTopicAsync(DeleteTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTopicExAsync(request, headers, runtime);
        }

        /**
         * Description: delete topic
         * Summary: delete topic
         */
        public DeleteTopicResponse DeleteTopicEx(DeleteTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTopicResponse>(DoRequest("2.0", "sofa.mq.topic.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete topic
         * Summary: delete topic
         */
        public async Task<DeleteTopicResponse> DeleteTopicExAsync(DeleteTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTopicResponse>(await DoRequestAsync("2.0", "sofa.mq.topic.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query bindings
         * Summary: query bindings
         */
        public QueryBindingsResponse QueryBindings(QueryBindingsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBindingsEx(request, headers, runtime);
        }

        /**
         * Description: query bindings
         * Summary: query bindings
         */
        public async Task<QueryBindingsResponse> QueryBindingsAsync(QueryBindingsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBindingsExAsync(request, headers, runtime);
        }

        /**
         * Description: query bindings
         * Summary: query bindings
         */
        public QueryBindingsResponse QueryBindingsEx(QueryBindingsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBindingsResponse>(DoRequest("2.0", "sofa.mq.bindings.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query bindings
         * Summary: query bindings
         */
        public async Task<QueryBindingsResponse> QueryBindingsExAsync(QueryBindingsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBindingsResponse>(await DoRequestAsync("2.0", "sofa.mq.bindings.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query binding
         * Summary: query binding
         */
        public IdBindingQueryResponse IdBindingQuery(IdBindingQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return IdBindingQueryEx(request, headers, runtime);
        }

        /**
         * Description: query binding
         * Summary: query binding
         */
        public async Task<IdBindingQueryResponse> IdBindingQueryAsync(IdBindingQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await IdBindingQueryExAsync(request, headers, runtime);
        }

        /**
         * Description: query binding
         * Summary: query binding
         */
        public IdBindingQueryResponse IdBindingQueryEx(IdBindingQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IdBindingQueryResponse>(DoRequest("2.0", "sofa.mq.binding.query.id", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query binding
         * Summary: query binding
         */
        public async Task<IdBindingQueryResponse> IdBindingQueryExAsync(IdBindingQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IdBindingQueryResponse>(await DoRequestAsync("2.0", "sofa.mq.binding.query.id", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定实例下 Topic 的信息列表。
         * Summary: 查询Topic列表
         */
        public ListSofamqTopicResponse ListSofamqTopic(ListSofamqTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqTopicEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定实例下 Topic 的信息列表。
         * Summary: 查询Topic列表
         */
        public async Task<ListSofamqTopicResponse> ListSofamqTopicAsync(ListSofamqTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqTopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定实例下 Topic 的信息列表。
         * Summary: 查询Topic列表
         */
        public ListSofamqTopicResponse ListSofamqTopicEx(ListSofamqTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqTopicResponse>(DoRequest("2.0", "sofa.mq.sofamq.topic.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定实例下 Topic 的信息列表。
         * Summary: 查询Topic列表
         */
        public async Task<ListSofamqTopicResponse> ListSofamqTopicExAsync(ListSofamqTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqTopicResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.topic.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
         * Summary: 创建Topic
         */
        public CreateSofamqTopicResponse CreateSofamqTopic(CreateSofamqTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqTopicEx(request, headers, runtime);
        }

        /**
         * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
         * Summary: 创建Topic
         */
        public async Task<CreateSofamqTopicResponse> CreateSofamqTopicAsync(CreateSofamqTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqTopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
         * Summary: 创建Topic
         */
        public CreateSofamqTopicResponse CreateSofamqTopicEx(CreateSofamqTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqTopicResponse>(DoRequest("2.0", "sofa.mq.sofamq.topic.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
         * Summary: 创建Topic
         */
        public async Task<CreateSofamqTopicResponse> CreateSofamqTopicExAsync(CreateSofamqTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqTopicResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.topic.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
         * Summary: 删除Topic
         */
        public DeleteSofamqTopicResponse DeleteSofamqTopic(DeleteSofamqTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqTopicEx(request, headers, runtime);
        }

        /**
         * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
         * Summary: 删除Topic
         */
        public async Task<DeleteSofamqTopicResponse> DeleteSofamqTopicAsync(DeleteSofamqTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqTopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
         * Summary: 删除Topic
         */
        public DeleteSofamqTopicResponse DeleteSofamqTopicEx(DeleteSofamqTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqTopicResponse>(DoRequest("2.0", "sofa.mq.sofamq.topic.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
         * Summary: 删除Topic
         */
        public async Task<DeleteSofamqTopicResponse> DeleteSofamqTopicExAsync(DeleteSofamqTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqTopicResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.topic.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定 Topic 的读写权限配置。
         * Summary: 更新Topic读写权限
         */
        public UpdateSofamqTopicResponse UpdateSofamqTopic(UpdateSofamqTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqTopicEx(request, headers, runtime);
        }

        /**
         * Description: 更新指定 Topic 的读写权限配置。
         * Summary: 更新Topic读写权限
         */
        public async Task<UpdateSofamqTopicResponse> UpdateSofamqTopicAsync(UpdateSofamqTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqTopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新指定 Topic 的读写权限配置。
         * Summary: 更新Topic读写权限
         */
        public UpdateSofamqTopicResponse UpdateSofamqTopicEx(UpdateSofamqTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqTopicResponse>(DoRequest("2.0", "sofa.mq.sofamq.topic.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定 Topic 的读写权限配置。
         * Summary: 更新Topic读写权限
         */
        public async Task<UpdateSofamqTopicResponse> UpdateSofamqTopicExAsync(UpdateSofamqTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqTopicResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.topic.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sofamq list instance
         * Summary: sofamq list instance
         */
        public ListSofamqInstanceResponse ListSofamqInstance(ListSofamqInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqInstanceEx(request, headers, runtime);
        }

        /**
         * Description: sofamq list instance
         * Summary: sofamq list instance
         */
        public async Task<ListSofamqInstanceResponse> ListSofamqInstanceAsync(ListSofamqInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: sofamq list instance
         * Summary: sofamq list instance
         */
        public ListSofamqInstanceResponse ListSofamqInstanceEx(ListSofamqInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqInstanceResponse>(DoRequest("2.0", "sofa.mq.sofamq.instance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sofamq list instance
         * Summary: sofamq list instance
         */
        public async Task<ListSofamqInstanceResponse> ListSofamqInstanceExAsync(ListSofamqInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqInstanceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.instance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sofamq instance create
         * Summary: instance create
         */
        public CreateSofamqInstanceResponse CreateSofamqInstance(CreateSofamqInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqInstanceEx(request, headers, runtime);
        }

        /**
         * Description: sofamq instance create
         * Summary: instance create
         */
        public async Task<CreateSofamqInstanceResponse> CreateSofamqInstanceAsync(CreateSofamqInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: sofamq instance create
         * Summary: instance create
         */
        public CreateSofamqInstanceResponse CreateSofamqInstanceEx(CreateSofamqInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqInstanceResponse>(DoRequest("2.0", "sofa.mq.sofamq.instance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sofamq instance create
         * Summary: instance create
         */
        public async Task<CreateSofamqInstanceResponse> CreateSofamqInstanceExAsync(CreateSofamqInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqInstanceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.instance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: instance delete
         * Summary: instance delete
         */
        public DeleteSofamqInstanceResponse DeleteSofamqInstance(DeleteSofamqInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqInstanceEx(request, headers, runtime);
        }

        /**
         * Description: instance delete
         * Summary: instance delete
         */
        public async Task<DeleteSofamqInstanceResponse> DeleteSofamqInstanceAsync(DeleteSofamqInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: instance delete
         * Summary: instance delete
         */
        public DeleteSofamqInstanceResponse DeleteSofamqInstanceEx(DeleteSofamqInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqInstanceResponse>(DoRequest("2.0", "sofa.mq.sofamq.instance.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: instance delete
         * Summary: instance delete
         */
        public async Task<DeleteSofamqInstanceResponse> DeleteSofamqInstanceExAsync(DeleteSofamqInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqInstanceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.instance.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用 InstanceUpdate 更新实例名称和描述
         * Summary: instance update
         */
        public UpdateSofamqInstanceResponse UpdateSofamqInstance(UpdateSofamqInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 使用 InstanceUpdate 更新实例名称和描述
         * Summary: instance update
         */
        public async Task<UpdateSofamqInstanceResponse> UpdateSofamqInstanceAsync(UpdateSofamqInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 使用 InstanceUpdate 更新实例名称和描述
         * Summary: instance update
         */
        public UpdateSofamqInstanceResponse UpdateSofamqInstanceEx(UpdateSofamqInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqInstanceResponse>(DoRequest("2.0", "sofa.mq.sofamq.instance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用 InstanceUpdate 更新实例名称和描述
         * Summary: instance update
         */
        public async Task<UpdateSofamqInstanceResponse> UpdateSofamqInstanceExAsync(UpdateSofamqInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqInstanceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.instance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
         * Summary: 创建Group
         */
        public CreateSofamqGroupResponse CreateSofamqGroup(CreateSofamqGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqGroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
         * Summary: 创建Group
         */
        public async Task<CreateSofamqGroupResponse> CreateSofamqGroupAsync(CreateSofamqGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
         * Summary: 创建Group
         */
        public CreateSofamqGroupResponse CreateSofamqGroupEx(CreateSofamqGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqGroupResponse>(DoRequest("2.0", "sofa.mq.sofamq.group.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
         * Summary: 创建Group
         */
        public async Task<CreateSofamqGroupResponse> CreateSofamqGroupExAsync(CreateSofamqGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqGroupResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.group.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定环境实例下 Group ID 资源的信息列表。
         * Summary: 查询Group列表
         */
        public ListSofamqGroupResponse ListSofamqGroup(ListSofamqGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqGroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定环境实例下 Group ID 资源的信息列表。
         * Summary: 查询Group列表
         */
        public async Task<ListSofamqGroupResponse> ListSofamqGroupAsync(ListSofamqGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定环境实例下 Group ID 资源的信息列表。
         * Summary: 查询Group列表
         */
        public ListSofamqGroupResponse ListSofamqGroupEx(ListSofamqGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqGroupResponse>(DoRequest("2.0", "sofa.mq.sofamq.group.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定环境实例下 Group ID 资源的信息列表。
         * Summary: 查询Group列表
         */
        public async Task<ListSofamqGroupResponse> ListSofamqGroupExAsync(ListSofamqGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqGroupResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.group.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定的 Group。
         * Summary: 删除Group
         */
        public DeleteSofamqGroupResponse DeleteSofamqGroup(DeleteSofamqGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqGroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除指定的 Group。
         * Summary: 删除Group
         */
        public async Task<DeleteSofamqGroupResponse> DeleteSofamqGroupAsync(DeleteSofamqGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除指定的 Group。
         * Summary: 删除Group
         */
        public DeleteSofamqGroupResponse DeleteSofamqGroupEx(DeleteSofamqGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqGroupResponse>(DoRequest("2.0", "sofa.mq.sofamq.group.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定的 Group。
         * Summary: 删除Group
         */
        public async Task<DeleteSofamqGroupResponse> DeleteSofamqGroupExAsync(DeleteSofamqGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqGroupResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.group.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定 Group 的读权限配置。
         * Summary: 更新Group读权限
         */
        public UpdateSofamqGroupResponse UpdateSofamqGroup(UpdateSofamqGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqGroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新指定 Group 的读权限配置。
         * Summary: 更新Group读权限
         */
        public async Task<UpdateSofamqGroupResponse> UpdateSofamqGroupAsync(UpdateSofamqGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新指定 Group 的读权限配置。
         * Summary: 更新Group读权限
         */
        public UpdateSofamqGroupResponse UpdateSofamqGroupEx(UpdateSofamqGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqGroupResponse>(DoRequest("2.0", "sofa.mq.sofamq.group.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定 Group 的读权限配置。
         * Summary: 更新Group读权限
         */
        public async Task<UpdateSofamqGroupResponse> UpdateSofamqGroupExAsync(UpdateSofamqGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqGroupResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.group.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
         * Summary: 查询Topic状态
         */
        public QuerySofamqTopicstatusResponse QuerySofamqTopicstatus(QuerySofamqTopicstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqTopicstatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
         * Summary: 查询Topic状态
         */
        public async Task<QuerySofamqTopicstatusResponse> QuerySofamqTopicstatusAsync(QuerySofamqTopicstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqTopicstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
         * Summary: 查询Topic状态
         */
        public QuerySofamqTopicstatusResponse QuerySofamqTopicstatusEx(QuerySofamqTopicstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTopicstatusResponse>(DoRequest("2.0", "sofa.mq.sofamq.topicstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
         * Summary: 查询Topic状态
         */
        public async Task<QuerySofamqTopicstatusResponse> QuerySofamqTopicstatusExAsync(QuerySofamqTopicstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTopicstatusResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.topicstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
         * Summary: 查看在线订阅组
         */
        public QuerySofamqTopicsubdetailResponse QuerySofamqTopicsubdetail(QuerySofamqTopicsubdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqTopicsubdetailEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
         * Summary: 查看在线订阅组
         */
        public async Task<QuerySofamqTopicsubdetailResponse> QuerySofamqTopicsubdetailAsync(QuerySofamqTopicsubdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqTopicsubdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
         * Summary: 查看在线订阅组
         */
        public QuerySofamqTopicsubdetailResponse QuerySofamqTopicsubdetailEx(QuerySofamqTopicsubdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTopicsubdetailResponse>(DoRequest("2.0", "sofa.mq.sofamq.topicsubdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
         * Summary: 查看在线订阅组
         */
        public async Task<QuerySofamqTopicsubdetailResponse> QuerySofamqTopicsubdetailExAsync(QuerySofamqTopicsubdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTopicsubdetailResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.topicsubdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: node list
         * Summary: node list
         */
        public ListSofamqNodeResponse ListSofamqNode(ListSofamqNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqNodeEx(request, headers, runtime);
        }

        /**
         * Description: node list
         * Summary: node list
         */
        public async Task<ListSofamqNodeResponse> ListSofamqNodeAsync(ListSofamqNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: node list
         * Summary: node list
         */
        public ListSofamqNodeResponse ListSofamqNodeEx(ListSofamqNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqNodeResponse>(DoRequest("2.0", "sofa.mq.sofamq.node.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: node list
         * Summary: node list
         */
        public async Task<ListSofamqNodeResponse> ListSofamqNodeExAsync(ListSofamqNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqNodeResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.node.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create node
         * Summary: create node
         */
        public CreateSofamqNodeResponse CreateSofamqNode(CreateSofamqNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqNodeEx(request, headers, runtime);
        }

        /**
         * Description: create node
         * Summary: create node
         */
        public async Task<CreateSofamqNodeResponse> CreateSofamqNodeAsync(CreateSofamqNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: create node
         * Summary: create node
         */
        public CreateSofamqNodeResponse CreateSofamqNodeEx(CreateSofamqNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqNodeResponse>(DoRequest("2.0", "sofa.mq.sofamq.node.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create node
         * Summary: create node
         */
        public async Task<CreateSofamqNodeResponse> CreateSofamqNodeExAsync(CreateSofamqNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqNodeResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.node.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: room create
         * Summary: room create
         */
        public CreateSofamqRoomResponse CreateSofamqRoom(CreateSofamqRoomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqRoomEx(request, headers, runtime);
        }

        /**
         * Description: room create
         * Summary: room create
         */
        public async Task<CreateSofamqRoomResponse> CreateSofamqRoomAsync(CreateSofamqRoomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqRoomExAsync(request, headers, runtime);
        }

        /**
         * Description: room create
         * Summary: room create
         */
        public CreateSofamqRoomResponse CreateSofamqRoomEx(CreateSofamqRoomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqRoomResponse>(DoRequest("2.0", "sofa.mq.sofamq.room.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: room create
         * Summary: room create
         */
        public async Task<CreateSofamqRoomResponse> CreateSofamqRoomExAsync(CreateSofamqRoomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqRoomResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.room.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create cell
         * Summary: create cell
         */
        public CreateSofamqCellResponse CreateSofamqCell(CreateSofamqCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqCellEx(request, headers, runtime);
        }

        /**
         * Description: create cell
         * Summary: create cell
         */
        public async Task<CreateSofamqCellResponse> CreateSofamqCellAsync(CreateSofamqCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqCellExAsync(request, headers, runtime);
        }

        /**
         * Description: create cell
         * Summary: create cell
         */
        public CreateSofamqCellResponse CreateSofamqCellEx(CreateSofamqCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqCellResponse>(DoRequest("2.0", "sofa.mq.sofamq.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create cell
         * Summary: create cell
         */
        public async Task<CreateSofamqCellResponse> CreateSofamqCellExAsync(CreateSofamqCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqCellResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create cluster
         * Summary: create cluster
         */
        public CreateSofamqClusterResponse CreateSofamqCluster(CreateSofamqClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqClusterEx(request, headers, runtime);
        }

        /**
         * Description: create cluster
         * Summary: create cluster
         */
        public async Task<CreateSofamqClusterResponse> CreateSofamqClusterAsync(CreateSofamqClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: create cluster
         * Summary: create cluster
         */
        public CreateSofamqClusterResponse CreateSofamqClusterEx(CreateSofamqClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqClusterResponse>(DoRequest("2.0", "sofa.mq.sofamq.cluster.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create cluster
         * Summary: create cluster
         */
        public async Task<CreateSofamqClusterResponse> CreateSofamqClusterExAsync(CreateSofamqClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqClusterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.cluster.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create namespace
         * Summary: create namespace
         */
        public CreateSofamqNamespaceResponse CreateSofamqNamespace(CreateSofamqNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: create namespace
         * Summary: create namespace
         */
        public async Task<CreateSofamqNamespaceResponse> CreateSofamqNamespaceAsync(CreateSofamqNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: create namespace
         * Summary: create namespace
         */
        public CreateSofamqNamespaceResponse CreateSofamqNamespaceEx(CreateSofamqNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqNamespaceResponse>(DoRequest("2.0", "sofa.mq.sofamq.namespace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create namespace
         * Summary: create namespace
         */
        public async Task<CreateSofamqNamespaceResponse> CreateSofamqNamespaceExAsync(CreateSofamqNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqNamespaceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.namespace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: room list
         * Summary: room list
         */
        public ListSofamqRoomResponse ListSofamqRoom(ListSofamqRoomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqRoomEx(request, headers, runtime);
        }

        /**
         * Description: room list
         * Summary: room list
         */
        public async Task<ListSofamqRoomResponse> ListSofamqRoomAsync(ListSofamqRoomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqRoomExAsync(request, headers, runtime);
        }

        /**
         * Description: room list
         * Summary: room list
         */
        public ListSofamqRoomResponse ListSofamqRoomEx(ListSofamqRoomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqRoomResponse>(DoRequest("2.0", "sofa.mq.sofamq.room.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: room list
         * Summary: room list
         */
        public async Task<ListSofamqRoomResponse> ListSofamqRoomExAsync(ListSofamqRoomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqRoomResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.room.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询cell列表
         * Summary: 查询cell列表
         */
        public ListSofamqCellResponse ListSofamqCell(ListSofamqCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询cell列表
         * Summary: 查询cell列表
         */
        public async Task<ListSofamqCellResponse> ListSofamqCellAsync(ListSofamqCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询cell列表
         * Summary: 查询cell列表
         */
        public ListSofamqCellResponse ListSofamqCellEx(ListSofamqCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqCellResponse>(DoRequest("2.0", "sofa.mq.sofamq.cell.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询cell列表
         * Summary: 查询cell列表
         */
        public async Task<ListSofamqCellResponse> ListSofamqCellExAsync(ListSofamqCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqCellResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.cell.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list cluster
         * Summary: list cluster
         */
        public ListSofamqClusterResponse ListSofamqCluster(ListSofamqClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqClusterEx(request, headers, runtime);
        }

        /**
         * Description: list cluster
         * Summary: list cluster
         */
        public async Task<ListSofamqClusterResponse> ListSofamqClusterAsync(ListSofamqClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: list cluster
         * Summary: list cluster
         */
        public ListSofamqClusterResponse ListSofamqClusterEx(ListSofamqClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqClusterResponse>(DoRequest("2.0", "sofa.mq.sofamq.cluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list cluster
         * Summary: list cluster
         */
        public async Task<ListSofamqClusterResponse> ListSofamqClusterExAsync(ListSofamqClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqClusterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.cluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
         * Summary: 查看在线订阅组
         */
        public QuerySofamqGroupsubdetailResponse QuerySofamqGroupsubdetail(QuerySofamqGroupsubdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqGroupsubdetailEx(request, headers, runtime);
        }

        /**
         * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
         * Summary: 查看在线订阅组
         */
        public async Task<QuerySofamqGroupsubdetailResponse> QuerySofamqGroupsubdetailAsync(QuerySofamqGroupsubdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqGroupsubdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
         * Summary: 查看在线订阅组
         */
        public QuerySofamqGroupsubdetailResponse QuerySofamqGroupsubdetailEx(QuerySofamqGroupsubdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqGroupsubdetailResponse>(DoRequest("2.0", "sofa.mq.sofamq.groupsubdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
         * Summary: 查看在线订阅组
         */
        public async Task<QuerySofamqGroupsubdetailResponse> QuerySofamqGroupsubdetailExAsync(QuerySofamqGroupsubdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqGroupsubdetailResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.groupsubdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实例基本信息和收发消息的接入点
         * Summary: 查询实例基本信息
         */
        public GetSofamqInstancebaseinfoResponse GetSofamqInstancebaseinfo(GetSofamqInstancebaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSofamqInstancebaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询实例基本信息和收发消息的接入点
         * Summary: 查询实例基本信息
         */
        public async Task<GetSofamqInstancebaseinfoResponse> GetSofamqInstancebaseinfoAsync(GetSofamqInstancebaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSofamqInstancebaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询实例基本信息和收发消息的接入点
         * Summary: 查询实例基本信息
         */
        public GetSofamqInstancebaseinfoResponse GetSofamqInstancebaseinfoEx(GetSofamqInstancebaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqInstancebaseinfoResponse>(DoRequest("2.0", "sofa.mq.sofamq.instancebaseinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实例基本信息和收发消息的接入点
         * Summary: 查询实例基本信息
         */
        public async Task<GetSofamqInstancebaseinfoResponse> GetSofamqInstancebaseinfoExAsync(GetSofamqInstancebaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqInstancebaseinfoResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.instancebaseinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
         * Summary: 重置消费位点
         */
        public ExecSofamqConsumerresetoffsetResponse ExecSofamqConsumerresetoffset(ExecSofamqConsumerresetoffsetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecSofamqConsumerresetoffsetEx(request, headers, runtime);
        }

        /**
         * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
         * Summary: 重置消费位点
         */
        public async Task<ExecSofamqConsumerresetoffsetResponse> ExecSofamqConsumerresetoffsetAsync(ExecSofamqConsumerresetoffsetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecSofamqConsumerresetoffsetExAsync(request, headers, runtime);
        }

        /**
         * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
         * Summary: 重置消费位点
         */
        public ExecSofamqConsumerresetoffsetResponse ExecSofamqConsumerresetoffsetEx(ExecSofamqConsumerresetoffsetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSofamqConsumerresetoffsetResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumerresetoffset.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
         * Summary: 重置消费位点
         */
        public async Task<ExecSofamqConsumerresetoffsetResponse> ExecSofamqConsumerresetoffsetExAsync(ExecSofamqConsumerresetoffsetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSofamqConsumerresetoffsetResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumerresetoffset.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
         * Summary: 消费者堆积查询
         */
        public QuerySofamqConsumeraccumulateResponse QuerySofamqConsumeraccumulate(QuerySofamqConsumeraccumulateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConsumeraccumulateEx(request, headers, runtime);
        }

        /**
         * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
         * Summary: 消费者堆积查询
         */
        public async Task<QuerySofamqConsumeraccumulateResponse> QuerySofamqConsumeraccumulateAsync(QuerySofamqConsumeraccumulateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConsumeraccumulateExAsync(request, headers, runtime);
        }

        /**
         * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
         * Summary: 消费者堆积查询
         */
        public QuerySofamqConsumeraccumulateResponse QuerySofamqConsumeraccumulateEx(QuerySofamqConsumeraccumulateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumeraccumulateResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumeraccumulate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
         * Summary: 消费者堆积查询
         */
        public async Task<QuerySofamqConsumeraccumulateResponse> QuerySofamqConsumeraccumulateExAsync(QuerySofamqConsumeraccumulateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumeraccumulateResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumeraccumulate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
         * Summary: 查询指定当前客户端的连接情况。
         */
        public QuerySofamqConsumerconnectionResponse QuerySofamqConsumerconnection(QuerySofamqConsumerconnectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConsumerconnectionEx(request, headers, runtime);
        }

        /**
         * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
         * Summary: 查询指定当前客户端的连接情况。
         */
        public async Task<QuerySofamqConsumerconnectionResponse> QuerySofamqConsumerconnectionAsync(QuerySofamqConsumerconnectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConsumerconnectionExAsync(request, headers, runtime);
        }

        /**
         * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
         * Summary: 查询指定当前客户端的连接情况。
         */
        public QuerySofamqConsumerconnectionResponse QuerySofamqConsumerconnectionEx(QuerySofamqConsumerconnectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumerconnectionResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumerconnection.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
         * Summary: 查询指定当前客户端的连接情况。
         */
        public async Task<QuerySofamqConsumerconnectionResponse> QuerySofamqConsumerconnectionExAsync(QuerySofamqConsumerconnectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumerconnectionResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumerconnection.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
         * Summary: 查询时间跨度
         */
        public QuerySofamqConsumertimespanResponse QuerySofamqConsumertimespan(QuerySofamqConsumertimespanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConsumertimespanEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
         * Summary: 查询时间跨度
         */
        public async Task<QuerySofamqConsumertimespanResponse> QuerySofamqConsumertimespanAsync(QuerySofamqConsumertimespanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConsumertimespanExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
         * Summary: 查询时间跨度
         */
        public QuerySofamqConsumertimespanResponse QuerySofamqConsumertimespanEx(QuerySofamqConsumertimespanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumertimespanResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumertimespan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
         * Summary: 查询时间跨度
         */
        public async Task<QuerySofamqConsumertimespanResponse> QuerySofamqConsumertimespanExAsync(QuerySofamqConsumertimespanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumertimespanResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumertimespan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
         * Summary: 判断目标消息是否曾被消费过
         */
        public QuerySofamqMessagetraceResponse QuerySofamqMessagetrace(QuerySofamqMessagetraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqMessagetraceEx(request, headers, runtime);
        }

        /**
         * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
         * Summary: 判断目标消息是否曾被消费过
         */
        public async Task<QuerySofamqMessagetraceResponse> QuerySofamqMessagetraceAsync(QuerySofamqMessagetraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqMessagetraceExAsync(request, headers, runtime);
        }

        /**
         * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
         * Summary: 判断目标消息是否曾被消费过
         */
        public QuerySofamqMessagetraceResponse QuerySofamqMessagetraceEx(QuerySofamqMessagetraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqMessagetraceResponse>(DoRequest("2.0", "sofa.mq.sofamq.messagetrace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
         * Summary: 判断目标消息是否曾被消费过
         */
        public async Task<QuerySofamqMessagetraceResponse> QuerySofamqMessagetraceExAsync(QuerySofamqMessagetraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqMessagetraceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.messagetrace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
         * Summary: 按Message ID查询消息
         */
        public GetSofamqMessagebymsgidResponse GetSofamqMessagebymsgid(GetSofamqMessagebymsgidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSofamqMessagebymsgidEx(request, headers, runtime);
        }

        /**
         * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
         * Summary: 按Message ID查询消息
         */
        public async Task<GetSofamqMessagebymsgidResponse> GetSofamqMessagebymsgidAsync(GetSofamqMessagebymsgidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSofamqMessagebymsgidExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
         * Summary: 按Message ID查询消息
         */
        public GetSofamqMessagebymsgidResponse GetSofamqMessagebymsgidEx(GetSofamqMessagebymsgidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqMessagebymsgidResponse>(DoRequest("2.0", "sofa.mq.sofamq.messagebymsgid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
         * Summary: 按Message ID查询消息
         */
        public async Task<GetSofamqMessagebymsgidResponse> GetSofamqMessagebymsgidExAsync(GetSofamqMessagebymsgidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqMessagebymsgidResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.messagebymsgid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
         * Summary: 按Message Key查询消息
         */
        public QuerySofamqMessagebykeyResponse QuerySofamqMessagebykey(QuerySofamqMessagebykeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqMessagebykeyEx(request, headers, runtime);
        }

        /**
         * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
         * Summary: 按Message Key查询消息
         */
        public async Task<QuerySofamqMessagebykeyResponse> QuerySofamqMessagebykeyAsync(QuerySofamqMessagebykeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqMessagebykeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
         * Summary: 按Message Key查询消息
         */
        public QuerySofamqMessagebykeyResponse QuerySofamqMessagebykeyEx(QuerySofamqMessagebykeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqMessagebykeyResponse>(DoRequest("2.0", "sofa.mq.sofamq.messagebykey.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
         * Summary: 按Message Key查询消息
         */
        public async Task<QuerySofamqMessagebykeyResponse> QuerySofamqMessagebykeyExAsync(QuerySofamqMessagebykeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqMessagebykeyResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.messagebykey.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
         * Summary: 通过MsgId创建轨迹查询任务
         */
        public GetSofamqTracebymsgidResponse GetSofamqTracebymsgid(GetSofamqTracebymsgidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSofamqTracebymsgidEx(request, headers, runtime);
        }

        /**
         * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
         * Summary: 通过MsgId创建轨迹查询任务
         */
        public async Task<GetSofamqTracebymsgidResponse> GetSofamqTracebymsgidAsync(GetSofamqTracebymsgidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSofamqTracebymsgidExAsync(request, headers, runtime);
        }

        /**
         * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
         * Summary: 通过MsgId创建轨迹查询任务
         */
        public GetSofamqTracebymsgidResponse GetSofamqTracebymsgidEx(GetSofamqTracebymsgidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqTracebymsgidResponse>(DoRequest("2.0", "sofa.mq.sofamq.tracebymsgid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
         * Summary: 通过MsgId创建轨迹查询任务
         */
        public async Task<GetSofamqTracebymsgidResponse> GetSofamqTracebymsgidExAsync(GetSofamqTracebymsgidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqTracebymsgidResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.tracebymsgid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
         * Summary: 通过MsgKey创建轨迹查询任务
         */
        public QuerySofamqTracebymsgkeyResponse QuerySofamqTracebymsgkey(QuerySofamqTracebymsgkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqTracebymsgkeyEx(request, headers, runtime);
        }

        /**
         * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
         * Summary: 通过MsgKey创建轨迹查询任务
         */
        public async Task<QuerySofamqTracebymsgkeyResponse> QuerySofamqTracebymsgkeyAsync(QuerySofamqTracebymsgkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqTracebymsgkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
         * Summary: 通过MsgKey创建轨迹查询任务
         */
        public QuerySofamqTracebymsgkeyResponse QuerySofamqTracebymsgkeyEx(QuerySofamqTracebymsgkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTracebymsgkeyResponse>(DoRequest("2.0", "sofa.mq.sofamq.tracebymsgkey.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
         * Summary: 通过MsgKey创建轨迹查询任务
         */
        public async Task<QuerySofamqTracebymsgkeyResponse> QuerySofamqTracebymsgkeyExAsync(QuerySofamqTracebymsgkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTracebymsgkeyResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.tracebymsgkey.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
         * Summary: 获取轨迹查询结果
         */
        public GetSofamqTraceresultResponse GetSofamqTraceresult(GetSofamqTraceresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSofamqTraceresultEx(request, headers, runtime);
        }

        /**
         * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
         * Summary: 获取轨迹查询结果
         */
        public async Task<GetSofamqTraceresultResponse> GetSofamqTraceresultAsync(GetSofamqTraceresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSofamqTraceresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
         * Summary: 获取轨迹查询结果
         */
        public GetSofamqTraceresultResponse GetSofamqTraceresultEx(GetSofamqTraceresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqTraceresultResponse>(DoRequest("2.0", "sofa.mq.sofamq.traceresult.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
         * Summary: 获取轨迹查询结果
         */
        public async Task<GetSofamqTraceresultResponse> GetSofamqTraceresultExAsync(GetSofamqTraceresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqTraceresultResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.traceresult.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
         * Summary: 查询一段时间写入报表数据
         */
        public QuerySofamqInputtpsResponse QuerySofamqInputtps(QuerySofamqInputtpsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqInputtpsEx(request, headers, runtime);
        }

        /**
         * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
         * Summary: 查询一段时间写入报表数据
         */
        public async Task<QuerySofamqInputtpsResponse> QuerySofamqInputtpsAsync(QuerySofamqInputtpsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqInputtpsExAsync(request, headers, runtime);
        }

        /**
         * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
         * Summary: 查询一段时间写入报表数据
         */
        public QuerySofamqInputtpsResponse QuerySofamqInputtpsEx(QuerySofamqInputtpsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqInputtpsResponse>(DoRequest("2.0", "sofa.mq.sofamq.inputtps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
         * Summary: 查询一段时间写入报表数据
         */
        public async Task<QuerySofamqInputtpsResponse> QuerySofamqInputtpsExAsync(QuerySofamqInputtpsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqInputtpsResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.inputtps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
        
        消费消息总量的统计曲线
        消费消息 TPS 的统计曲线
         * Summary: 查询一段时间内消费消息统计信息
         */
        public QuerySofamqOutputtpsResponse QuerySofamqOutputtps(QuerySofamqOutputtpsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqOutputtpsEx(request, headers, runtime);
        }

        /**
         * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
        
        消费消息总量的统计曲线
        消费消息 TPS 的统计曲线
         * Summary: 查询一段时间内消费消息统计信息
         */
        public async Task<QuerySofamqOutputtpsResponse> QuerySofamqOutputtpsAsync(QuerySofamqOutputtpsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqOutputtpsExAsync(request, headers, runtime);
        }

        /**
         * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
        
        消费消息总量的统计曲线
        消费消息 TPS 的统计曲线
         * Summary: 查询一段时间内消费消息统计信息
         */
        public QuerySofamqOutputtpsResponse QuerySofamqOutputtpsEx(QuerySofamqOutputtpsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqOutputtpsResponse>(DoRequest("2.0", "sofa.mq.sofamq.outputtps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
        
        消费消息总量的统计曲线
        消费消息 TPS 的统计曲线
         * Summary: 查询一段时间内消费消息统计信息
         */
        public async Task<QuerySofamqOutputtpsResponse> QuerySofamqOutputtpsExAsync(QuerySofamqOutputtpsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqOutputtpsResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.outputtps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
         * Summary: 按Message ID查询死信消息
         */
        public GetSofamqDlqbyidResponse GetSofamqDlqbyid(GetSofamqDlqbyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSofamqDlqbyidEx(request, headers, runtime);
        }

        /**
         * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
         * Summary: 按Message ID查询死信消息
         */
        public async Task<GetSofamqDlqbyidResponse> GetSofamqDlqbyidAsync(GetSofamqDlqbyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSofamqDlqbyidExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
         * Summary: 按Message ID查询死信消息
         */
        public GetSofamqDlqbyidResponse GetSofamqDlqbyidEx(GetSofamqDlqbyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqDlqbyidResponse>(DoRequest("2.0", "sofa.mq.sofamq.dlqbyid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
         * Summary: 按Message ID查询死信消息
         */
        public async Task<GetSofamqDlqbyidResponse> GetSofamqDlqbyidExAsync(GetSofamqDlqbyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqDlqbyidResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.dlqbyid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
        
        死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
         * Summary: 重新发送死信消息
         */
        public ExecSofamqDlqresendbyidResponse ExecSofamqDlqresendbyid(ExecSofamqDlqresendbyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecSofamqDlqresendbyidEx(request, headers, runtime);
        }

        /**
         * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
        
        死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
         * Summary: 重新发送死信消息
         */
        public async Task<ExecSofamqDlqresendbyidResponse> ExecSofamqDlqresendbyidAsync(ExecSofamqDlqresendbyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecSofamqDlqresendbyidExAsync(request, headers, runtime);
        }

        /**
         * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
        
        死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
         * Summary: 重新发送死信消息
         */
        public ExecSofamqDlqresendbyidResponse ExecSofamqDlqresendbyidEx(ExecSofamqDlqresendbyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSofamqDlqresendbyidResponse>(DoRequest("2.0", "sofa.mq.sofamq.dlqresendbyid.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
        
        死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
         * Summary: 重新发送死信消息
         */
        public async Task<ExecSofamqDlqresendbyidResponse> ExecSofamqDlqresendbyidExAsync(ExecSofamqDlqresendbyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSofamqDlqresendbyidResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.dlqresendbyid.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list ns
         * Summary: list ns
         */
        public ListSofamqNamespaceResponse ListSofamqNamespace(ListSofamqNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: list ns
         * Summary: list ns
         */
        public async Task<ListSofamqNamespaceResponse> ListSofamqNamespaceAsync(ListSofamqNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: list ns
         * Summary: list ns
         */
        public ListSofamqNamespaceResponse ListSofamqNamespaceEx(ListSofamqNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqNamespaceResponse>(DoRequest("2.0", "sofa.mq.sofamq.namespace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list ns
         * Summary: list ns
         */
        public async Task<ListSofamqNamespaceResponse> ListSofamqNamespaceExAsync(ListSofamqNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqNamespaceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.namespace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发送测试消息
         * Summary: 发送测试信息
         */
        public SendSofamqMessageResponse SendSofamqMessage(SendSofamqMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendSofamqMessageEx(request, headers, runtime);
        }

        /**
         * Description: 发送测试消息
         * Summary: 发送测试信息
         */
        public async Task<SendSofamqMessageResponse> SendSofamqMessageAsync(SendSofamqMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendSofamqMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: 发送测试消息
         * Summary: 发送测试信息
         */
        public SendSofamqMessageResponse SendSofamqMessageEx(SendSofamqMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendSofamqMessageResponse>(DoRequest("2.0", "sofa.mq.sofamq.message.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发送测试消息
         * Summary: 发送测试信息
         */
        public async Task<SendSofamqMessageResponse> SendSofamqMessageExAsync(SendSofamqMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendSofamqMessageResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.message.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费验证
         * Summary: 消费验证
         */
        public PushSofamqMessageResponse PushSofamqMessage(PushSofamqMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushSofamqMessageEx(request, headers, runtime);
        }

        /**
         * Description: 消费验证
         * Summary: 消费验证
         */
        public async Task<PushSofamqMessageResponse> PushSofamqMessageAsync(PushSofamqMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushSofamqMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: 消费验证
         * Summary: 消费验证
         */
        public PushSofamqMessageResponse PushSofamqMessageEx(PushSofamqMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSofamqMessageResponse>(DoRequest("2.0", "sofa.mq.sofamq.message.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费验证
         * Summary: 消费验证
         */
        public async Task<PushSofamqMessageResponse> PushSofamqMessageExAsync(PushSofamqMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSofamqMessageResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.message.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: getNodesByNamespaceId
         * Summary: get nodes by ns id
         */
        public QuerySofamqNodebynamespaceidResponse QuerySofamqNodebynamespaceid(QuerySofamqNodebynamespaceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqNodebynamespaceidEx(request, headers, runtime);
        }

        /**
         * Description: getNodesByNamespaceId
         * Summary: get nodes by ns id
         */
        public async Task<QuerySofamqNodebynamespaceidResponse> QuerySofamqNodebynamespaceidAsync(QuerySofamqNodebynamespaceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqNodebynamespaceidExAsync(request, headers, runtime);
        }

        /**
         * Description: getNodesByNamespaceId
         * Summary: get nodes by ns id
         */
        public QuerySofamqNodebynamespaceidResponse QuerySofamqNodebynamespaceidEx(QuerySofamqNodebynamespaceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqNodebynamespaceidResponse>(DoRequest("2.0", "sofa.mq.sofamq.nodebynamespaceid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: getNodesByNamespaceId
         * Summary: get nodes by ns id
         */
        public async Task<QuerySofamqNodebynamespaceidResponse> QuerySofamqNodebynamespaceidExAsync(QuerySofamqNodebynamespaceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqNodebynamespaceidResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.nodebynamespaceid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query room by ns
         * Summary: query room by ns
         */
        public QuerySofamqRoombynamespaceidResponse QuerySofamqRoombynamespaceid(QuerySofamqRoombynamespaceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqRoombynamespaceidEx(request, headers, runtime);
        }

        /**
         * Description: query room by ns
         * Summary: query room by ns
         */
        public async Task<QuerySofamqRoombynamespaceidResponse> QuerySofamqRoombynamespaceidAsync(QuerySofamqRoombynamespaceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqRoombynamespaceidExAsync(request, headers, runtime);
        }

        /**
         * Description: query room by ns
         * Summary: query room by ns
         */
        public QuerySofamqRoombynamespaceidResponse QuerySofamqRoombynamespaceidEx(QuerySofamqRoombynamespaceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqRoombynamespaceidResponse>(DoRequest("2.0", "sofa.mq.sofamq.roombynamespaceid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query room by ns
         * Summary: query room by ns
         */
        public async Task<QuerySofamqRoombynamespaceidResponse> QuerySofamqRoombynamespaceidExAsync(QuerySofamqRoombynamespaceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqRoombynamespaceidResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.roombynamespaceid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
         * Summary: 按Topic查询消息
         */
        public QuerySofamqMessagebytopicResponse QuerySofamqMessagebytopic(QuerySofamqMessagebytopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqMessagebytopicEx(request, headers, runtime);
        }

        /**
         * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
         * Summary: 按Topic查询消息
         */
        public async Task<QuerySofamqMessagebytopicResponse> QuerySofamqMessagebytopicAsync(QuerySofamqMessagebytopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqMessagebytopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
         * Summary: 按Topic查询消息
         */
        public QuerySofamqMessagebytopicResponse QuerySofamqMessagebytopicEx(QuerySofamqMessagebytopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqMessagebytopicResponse>(DoRequest("2.0", "sofa.mq.sofamq.messagebytopic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
         * Summary: 按Topic查询消息
         */
        public async Task<QuerySofamqMessagebytopicResponse> QuerySofamqMessagebytopicExAsync(QuerySofamqMessagebytopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqMessagebytopicResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.messagebytopic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
         * Summary: 按Group ID查询死信消息
         */
        public QuerySofamqDlqbygroupidResponse QuerySofamqDlqbygroupid(QuerySofamqDlqbygroupidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqDlqbygroupidEx(request, headers, runtime);
        }

        /**
         * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
         * Summary: 按Group ID查询死信消息
         */
        public async Task<QuerySofamqDlqbygroupidResponse> QuerySofamqDlqbygroupidAsync(QuerySofamqDlqbygroupidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqDlqbygroupidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
         * Summary: 按Group ID查询死信消息
         */
        public QuerySofamqDlqbygroupidResponse QuerySofamqDlqbygroupidEx(QuerySofamqDlqbygroupidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqDlqbygroupidResponse>(DoRequest("2.0", "sofa.mq.sofamq.dlqbygroupid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
         * Summary: 按Group ID查询死信消息
         */
        public async Task<QuerySofamqDlqbygroupidResponse> QuerySofamqDlqbygroupidExAsync(QuerySofamqDlqbygroupidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqDlqbygroupidResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.dlqbygroupid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
         * Summary: 查询消费状态
         */
        public GetSofamqConsumerstatusResponse GetSofamqConsumerstatus(GetSofamqConsumerstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSofamqConsumerstatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
         * Summary: 查询消费状态
         */
        public async Task<GetSofamqConsumerstatusResponse> GetSofamqConsumerstatusAsync(GetSofamqConsumerstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSofamqConsumerstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
         * Summary: 查询消费状态
         */
        public GetSofamqConsumerstatusResponse GetSofamqConsumerstatusEx(GetSofamqConsumerstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqConsumerstatusResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumerstatus.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
         * Summary: 查询消费状态
         */
        public async Task<GetSofamqConsumerstatusResponse> GetSofamqConsumerstatusExAsync(GetSofamqConsumerstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqConsumerstatusResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumerstatus.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定 Topic 的描述信息。
         * Summary: 更新Topic的描述
         */
        public UpdateSofamqTopicremarkResponse UpdateSofamqTopicremark(UpdateSofamqTopicremarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqTopicremarkEx(request, headers, runtime);
        }

        /**
         * Description: 更新指定 Topic 的描述信息。
         * Summary: 更新Topic的描述
         */
        public async Task<UpdateSofamqTopicremarkResponse> UpdateSofamqTopicremarkAsync(UpdateSofamqTopicremarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqTopicremarkExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新指定 Topic 的描述信息。
         * Summary: 更新Topic的描述
         */
        public UpdateSofamqTopicremarkResponse UpdateSofamqTopicremarkEx(UpdateSofamqTopicremarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqTopicremarkResponse>(DoRequest("2.0", "sofa.mq.sofamq.topicremark.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定 Topic 的描述信息。
         * Summary: 更新Topic的描述
         */
        public async Task<UpdateSofamqTopicremarkResponse> UpdateSofamqTopicremarkExAsync(UpdateSofamqTopicremarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqTopicremarkResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.topicremark.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datacenter list
         * Summary: datacenter
         */
        public CreateSofamqDatacenterResponse CreateSofamqDatacenter(CreateSofamqDatacenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqDatacenterEx(request, headers, runtime);
        }

        /**
         * Description: datacenter list
         * Summary: datacenter
         */
        public async Task<CreateSofamqDatacenterResponse> CreateSofamqDatacenterAsync(CreateSofamqDatacenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqDatacenterExAsync(request, headers, runtime);
        }

        /**
         * Description: datacenter list
         * Summary: datacenter
         */
        public CreateSofamqDatacenterResponse CreateSofamqDatacenterEx(CreateSofamqDatacenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqDatacenterResponse>(DoRequest("2.0", "sofa.mq.sofamq.datacenter.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datacenter list
         * Summary: datacenter
         */
        public async Task<CreateSofamqDatacenterResponse> CreateSofamqDatacenterExAsync(CreateSofamqDatacenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqDatacenterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.datacenter.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datacenter list
         * Summary: datacenter list
         */
        public ListSofamqDatacenterResponse ListSofamqDatacenter(ListSofamqDatacenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqDatacenterEx(request, headers, runtime);
        }

        /**
         * Description: datacenter list
         * Summary: datacenter list
         */
        public async Task<ListSofamqDatacenterResponse> ListSofamqDatacenterAsync(ListSofamqDatacenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqDatacenterExAsync(request, headers, runtime);
        }

        /**
         * Description: datacenter list
         * Summary: datacenter list
         */
        public ListSofamqDatacenterResponse ListSofamqDatacenterEx(ListSofamqDatacenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqDatacenterResponse>(DoRequest("2.0", "sofa.mq.sofamq.datacenter.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: datacenter list
         * Summary: datacenter list
         */
        public async Task<ListSofamqDatacenterResponse> ListSofamqDatacenterExAsync(ListSofamqDatacenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqDatacenterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.datacenter.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: config list
         * Summary: config list
         */
        public ListSofamqConfigResponse ListSofamqConfig(ListSofamqConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqConfigEx(request, headers, runtime);
        }

        /**
         * Description: config list
         * Summary: config list
         */
        public async Task<ListSofamqConfigResponse> ListSofamqConfigAsync(ListSofamqConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: config list
         * Summary: config list
         */
        public ListSofamqConfigResponse ListSofamqConfigEx(ListSofamqConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConfigResponse>(DoRequest("2.0", "sofa.mq.sofamq.config.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: config list
         * Summary: config list
         */
        public async Task<ListSofamqConfigResponse> ListSofamqConfigExAsync(ListSofamqConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConfigResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.config.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定 Group 的描述信息。
         * Summary: 更新Group的描述
         */
        public UpdateSofamqGroupremarkResponse UpdateSofamqGroupremark(UpdateSofamqGroupremarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqGroupremarkEx(request, headers, runtime);
        }

        /**
         * Description: 更新指定 Group 的描述信息。
         * Summary: 更新Group的描述
         */
        public async Task<UpdateSofamqGroupremarkResponse> UpdateSofamqGroupremarkAsync(UpdateSofamqGroupremarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqGroupremarkExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新指定 Group 的描述信息。
         * Summary: 更新Group的描述
         */
        public UpdateSofamqGroupremarkResponse UpdateSofamqGroupremarkEx(UpdateSofamqGroupremarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqGroupremarkResponse>(DoRequest("2.0", "sofa.mq.sofamq.groupremark.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定 Group 的描述信息。
         * Summary: 更新Group的描述
         */
        public async Task<UpdateSofamqGroupremarkResponse> UpdateSofamqGroupremarkExAsync(UpdateSofamqGroupremarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqGroupremarkResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.groupremark.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载消息
         * Summary: 下载消息
         */
        public DownloadSofamqMessageResponse DownloadSofamqMessage(DownloadSofamqMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadSofamqMessageEx(request, headers, runtime);
        }

        /**
         * Description: 下载消息
         * Summary: 下载消息
         */
        public async Task<DownloadSofamqMessageResponse> DownloadSofamqMessageAsync(DownloadSofamqMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadSofamqMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: 下载消息
         * Summary: 下载消息
         */
        public DownloadSofamqMessageResponse DownloadSofamqMessageEx(DownloadSofamqMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadSofamqMessageResponse>(DoRequest("2.0", "sofa.mq.sofamq.message.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载消息
         * Summary: 下载消息
         */
        public async Task<DownloadSofamqMessageResponse> DownloadSofamqMessageExAsync(DownloadSofamqMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadSofamqMessageResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.message.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定或全部的 Topic 资源监控统计信息。
         * Summary: 获取 topic 统计信息
         */
        public QueryMetricsTopicResponse QueryMetricsTopic(QueryMetricsTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetricsTopicEx(request, headers, runtime);
        }

        /**
         * Description: 获取指定或全部的 Topic 资源监控统计信息。
         * Summary: 获取 topic 统计信息
         */
        public async Task<QueryMetricsTopicResponse> QueryMetricsTopicAsync(QueryMetricsTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetricsTopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取指定或全部的 Topic 资源监控统计信息。
         * Summary: 获取 topic 统计信息
         */
        public QueryMetricsTopicResponse QueryMetricsTopicEx(QueryMetricsTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsTopicResponse>(DoRequest("2.0", "sofa.mq.metrics.topic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定或全部的 Topic 资源监控统计信息。
         * Summary: 获取 topic 统计信息
         */
        public async Task<QueryMetricsTopicResponse> QueryMetricsTopicExAsync(QueryMetricsTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsTopicResponse>(await DoRequestAsync("2.0", "sofa.mq.metrics.topic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定时间范围内的积压数据。
         * Summary: 查看积压数据
         */
        public QueryMetricsBacklogResponse QueryMetricsBacklog(QueryMetricsBacklogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetricsBacklogEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定时间范围内的积压数据。
         * Summary: 查看积压数据
         */
        public async Task<QueryMetricsBacklogResponse> QueryMetricsBacklogAsync(QueryMetricsBacklogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetricsBacklogExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定时间范围内的积压数据。
         * Summary: 查看积压数据
         */
        public QueryMetricsBacklogResponse QueryMetricsBacklogEx(QueryMetricsBacklogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsBacklogResponse>(DoRequest("2.0", "sofa.mq.metrics.backlog.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定时间范围内的积压数据。
         * Summary: 查看积压数据
         */
        public async Task<QueryMetricsBacklogResponse> QueryMetricsBacklogExAsync(QueryMetricsBacklogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsBacklogResponse>(await DoRequestAsync("2.0", "sofa.mq.metrics.backlog.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
         * Summary: 监控数据概览
         */
        public QueryMetricsOverviewResponse QueryMetricsOverview(QueryMetricsOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetricsOverviewEx(request, headers, runtime);
        }

        /**
         * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
         * Summary: 监控数据概览
         */
        public async Task<QueryMetricsOverviewResponse> QueryMetricsOverviewAsync(QueryMetricsOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetricsOverviewExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
         * Summary: 监控数据概览
         */
        public QueryMetricsOverviewResponse QueryMetricsOverviewEx(QueryMetricsOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsOverviewResponse>(DoRequest("2.0", "sofa.mq.metrics.overview.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
         * Summary: 监控数据概览
         */
        public async Task<QueryMetricsOverviewResponse> QueryMetricsOverviewExAsync(QueryMetricsOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsOverviewResponse>(await DoRequestAsync("2.0", "sofa.mq.metrics.overview.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消息路由列表信息。
         * Summary: 查询路由列表
         */
        public ListSofamqRouterResponse ListSofamqRouter(ListSofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqRouterEx(request, headers, runtime);
        }

        /**
         * Description: 查询消息路由列表信息。
         * Summary: 查询路由列表
         */
        public async Task<ListSofamqRouterResponse> ListSofamqRouterAsync(ListSofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询消息路由列表信息。
         * Summary: 查询路由列表
         */
        public ListSofamqRouterResponse ListSofamqRouterEx(ListSofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqRouterResponse>(DoRequest("2.0", "sofa.mq.sofamq.router.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消息路由列表信息。
         * Summary: 查询路由列表
         */
        public async Task<ListSofamqRouterResponse> ListSofamqRouterExAsync(ListSofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqRouterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.router.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个消息路由任务。
         * Summary: 创建路由
         */
        public CreateSofamqRouterResponse CreateSofamqRouter(CreateSofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqRouterEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个消息路由任务。
         * Summary: 创建路由
         */
        public async Task<CreateSofamqRouterResponse> CreateSofamqRouterAsync(CreateSofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个消息路由任务。
         * Summary: 创建路由
         */
        public CreateSofamqRouterResponse CreateSofamqRouterEx(CreateSofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqRouterResponse>(DoRequest("2.0", "sofa.mq.sofamq.router.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个消息路由任务。
         * Summary: 创建路由
         */
        public async Task<CreateSofamqRouterResponse> CreateSofamqRouterExAsync(CreateSofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqRouterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.router.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete node
         * Summary: delete node
         */
        public DeleteSofamqNodeResponse DeleteSofamqNode(DeleteSofamqNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqNodeEx(request, headers, runtime);
        }

        /**
         * Description: delete node
         * Summary: delete node
         */
        public async Task<DeleteSofamqNodeResponse> DeleteSofamqNodeAsync(DeleteSofamqNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: delete node
         * Summary: delete node
         */
        public DeleteSofamqNodeResponse DeleteSofamqNodeEx(DeleteSofamqNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqNodeResponse>(DoRequest("2.0", "sofa.mq.sofamq.node.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete node
         * Summary: delete node
         */
        public async Task<DeleteSofamqNodeResponse> DeleteSofamqNodeExAsync(DeleteSofamqNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqNodeResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.node.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete room
         * Summary: delete room
         */
        public DeleteSofamqRoomResponse DeleteSofamqRoom(DeleteSofamqRoomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqRoomEx(request, headers, runtime);
        }

        /**
         * Description: delete room
         * Summary: delete room
         */
        public async Task<DeleteSofamqRoomResponse> DeleteSofamqRoomAsync(DeleteSofamqRoomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqRoomExAsync(request, headers, runtime);
        }

        /**
         * Description: delete room
         * Summary: delete room
         */
        public DeleteSofamqRoomResponse DeleteSofamqRoomEx(DeleteSofamqRoomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqRoomResponse>(DoRequest("2.0", "sofa.mq.sofamq.room.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete room
         * Summary: delete room
         */
        public async Task<DeleteSofamqRoomResponse> DeleteSofamqRoomExAsync(DeleteSofamqRoomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqRoomResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.room.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: del cell
         * Summary: del cell
         */
        public DeleteSofamqCellResponse DeleteSofamqCell(DeleteSofamqCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqCellEx(request, headers, runtime);
        }

        /**
         * Description: del cell
         * Summary: del cell
         */
        public async Task<DeleteSofamqCellResponse> DeleteSofamqCellAsync(DeleteSofamqCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqCellExAsync(request, headers, runtime);
        }

        /**
         * Description: del cell
         * Summary: del cell
         */
        public DeleteSofamqCellResponse DeleteSofamqCellEx(DeleteSofamqCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqCellResponse>(DoRequest("2.0", "sofa.mq.sofamq.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: del cell
         * Summary: del cell
         */
        public async Task<DeleteSofamqCellResponse> DeleteSofamqCellExAsync(DeleteSofamqCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqCellResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: del cluster
         * Summary: del cluster
         */
        public DeleteSofamqClusterResponse DeleteSofamqCluster(DeleteSofamqClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqClusterEx(request, headers, runtime);
        }

        /**
         * Description: del cluster
         * Summary: del cluster
         */
        public async Task<DeleteSofamqClusterResponse> DeleteSofamqClusterAsync(DeleteSofamqClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: del cluster
         * Summary: del cluster
         */
        public DeleteSofamqClusterResponse DeleteSofamqClusterEx(DeleteSofamqClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqClusterResponse>(DoRequest("2.0", "sofa.mq.sofamq.cluster.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: del cluster
         * Summary: del cluster
         */
        public async Task<DeleteSofamqClusterResponse> DeleteSofamqClusterExAsync(DeleteSofamqClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqClusterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.cluster.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: del ns
         * Summary: del ns
         */
        public DeleteSofamqNamespaceResponse DeleteSofamqNamespace(DeleteSofamqNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: del ns
         * Summary: del ns
         */
        public async Task<DeleteSofamqNamespaceResponse> DeleteSofamqNamespaceAsync(DeleteSofamqNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: del ns
         * Summary: del ns
         */
        public DeleteSofamqNamespaceResponse DeleteSofamqNamespaceEx(DeleteSofamqNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqNamespaceResponse>(DoRequest("2.0", "sofa.mq.sofamq.namespace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: del ns
         * Summary: del ns
         */
        public async Task<DeleteSofamqNamespaceResponse> DeleteSofamqNamespaceExAsync(DeleteSofamqNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqNamespaceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.namespace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: del dc
         * Summary: del dc
         */
        public DeleteSofamqDatacenterResponse DeleteSofamqDatacenter(DeleteSofamqDatacenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqDatacenterEx(request, headers, runtime);
        }

        /**
         * Description: del dc
         * Summary: del dc
         */
        public async Task<DeleteSofamqDatacenterResponse> DeleteSofamqDatacenterAsync(DeleteSofamqDatacenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqDatacenterExAsync(request, headers, runtime);
        }

        /**
         * Description: del dc
         * Summary: del dc
         */
        public DeleteSofamqDatacenterResponse DeleteSofamqDatacenterEx(DeleteSofamqDatacenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqDatacenterResponse>(DoRequest("2.0", "sofa.mq.sofamq.datacenter.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: del dc
         * Summary: del dc
         */
        public async Task<DeleteSofamqDatacenterResponse> DeleteSofamqDatacenterExAsync(DeleteSofamqDatacenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqDatacenterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.datacenter.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定的消息路由任务。
         * Summary: 删除路由
         */
        public DeleteSofamqRouterResponse DeleteSofamqRouter(DeleteSofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqRouterEx(request, headers, runtime);
        }

        /**
         * Description: 删除指定的消息路由任务。
         * Summary: 删除路由
         */
        public async Task<DeleteSofamqRouterResponse> DeleteSofamqRouterAsync(DeleteSofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除指定的消息路由任务。
         * Summary: 删除路由
         */
        public DeleteSofamqRouterResponse DeleteSofamqRouterEx(DeleteSofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqRouterResponse>(DoRequest("2.0", "sofa.mq.sofamq.router.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定的消息路由任务。
         * Summary: 删除路由
         */
        public async Task<DeleteSofamqRouterResponse> DeleteSofamqRouterExAsync(DeleteSofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqRouterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.router.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create config
         * Summary: create config
         */
        public CreateSofamqConfigResponse CreateSofamqConfig(CreateSofamqConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqConfigEx(request, headers, runtime);
        }

        /**
         * Description: create config
         * Summary: create config
         */
        public async Task<CreateSofamqConfigResponse> CreateSofamqConfigAsync(CreateSofamqConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: create config
         * Summary: create config
         */
        public CreateSofamqConfigResponse CreateSofamqConfigEx(CreateSofamqConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqConfigResponse>(DoRequest("2.0", "sofa.mq.sofamq.config.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create config
         * Summary: create config
         */
        public async Task<CreateSofamqConfigResponse> CreateSofamqConfigExAsync(CreateSofamqConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqConfigResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.config.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query cells
         * Summary: query cells
         */
        public QuerySofamqCellResponse QuerySofamqCell(QuerySofamqCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqCellEx(request, headers, runtime);
        }

        /**
         * Description: query cells
         * Summary: query cells
         */
        public async Task<QuerySofamqCellResponse> QuerySofamqCellAsync(QuerySofamqCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqCellExAsync(request, headers, runtime);
        }

        /**
         * Description: query cells
         * Summary: query cells
         */
        public QuerySofamqCellResponse QuerySofamqCellEx(QuerySofamqCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqCellResponse>(DoRequest("2.0", "sofa.mq.sofamq.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query cells
         * Summary: query cells
         */
        public async Task<QuerySofamqCellResponse> QuerySofamqCellExAsync(QuerySofamqCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqCellResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由
         * Summary: 查询路由
         */
        public QuerySofamqRouterResponse QuerySofamqRouter(QuerySofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqRouterEx(request, headers, runtime);
        }

        /**
         * Description: 查询路由
         * Summary: 查询路由
         */
        public async Task<QuerySofamqRouterResponse> QuerySofamqRouterAsync(QuerySofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询路由
         * Summary: 查询路由
         */
        public QuerySofamqRouterResponse QuerySofamqRouterEx(QuerySofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqRouterResponse>(DoRequest("2.0", "sofa.mq.sofamq.router.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由
         * Summary: 查询路由
         */
        public async Task<QuerySofamqRouterResponse> QuerySofamqRouterExAsync(QuerySofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqRouterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.router.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get instance
         * Summary: get instance
         */
        public GetMiddlewareInstanceResponse GetMiddlewareInstance(GetMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMiddlewareInstanceEx(request, headers, runtime);
        }

        /**
         * Description: get instance
         * Summary: get instance
         */
        public async Task<GetMiddlewareInstanceResponse> GetMiddlewareInstanceAsync(GetMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMiddlewareInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: get instance
         * Summary: get instance
         */
        public GetMiddlewareInstanceResponse GetMiddlewareInstanceEx(GetMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareInstanceResponse>(DoRequest("2.0", "sofa.mq.middleware.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get instance
         * Summary: get instance
         */
        public async Task<GetMiddlewareInstanceResponse> GetMiddlewareInstanceExAsync(GetMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareInstanceResponse>(await DoRequestAsync("2.0", "sofa.mq.middleware.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get endpoint
         * Summary: get endpoint
         */
        public GetMiddlewareEndpointResponse GetMiddlewareEndpoint(GetMiddlewareEndpointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMiddlewareEndpointEx(request, headers, runtime);
        }

        /**
         * Description: get endpoint
         * Summary: get endpoint
         */
        public async Task<GetMiddlewareEndpointResponse> GetMiddlewareEndpointAsync(GetMiddlewareEndpointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMiddlewareEndpointExAsync(request, headers, runtime);
        }

        /**
         * Description: get endpoint
         * Summary: get endpoint
         */
        public GetMiddlewareEndpointResponse GetMiddlewareEndpointEx(GetMiddlewareEndpointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareEndpointResponse>(DoRequest("2.0", "sofa.mq.middleware.endpoint.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get endpoint
         * Summary: get endpoint
         */
        public async Task<GetMiddlewareEndpointResponse> GetMiddlewareEndpointExAsync(GetMiddlewareEndpointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareEndpointResponse>(await DoRequestAsync("2.0", "sofa.mq.middleware.endpoint.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: cellbytype
         * Summary: cellbytype
         */
        public QuerySofamqCellbytypeResponse QuerySofamqCellbytype(QuerySofamqCellbytypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqCellbytypeEx(request, headers, runtime);
        }

        /**
         * Description: cellbytype
         * Summary: cellbytype
         */
        public async Task<QuerySofamqCellbytypeResponse> QuerySofamqCellbytypeAsync(QuerySofamqCellbytypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqCellbytypeExAsync(request, headers, runtime);
        }

        /**
         * Description: cellbytype
         * Summary: cellbytype
         */
        public QuerySofamqCellbytypeResponse QuerySofamqCellbytypeEx(QuerySofamqCellbytypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqCellbytypeResponse>(DoRequest("2.0", "sofa.mq.sofamq.cellbytype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: cellbytype
         * Summary: cellbytype
         */
        public async Task<QuerySofamqCellbytypeResponse> QuerySofamqCellbytypeExAsync(QuerySofamqCellbytypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqCellbytypeResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.cellbytype.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定实例下的消息轨迹查询任务列表信息。
         * Summary: 查询trace请求列表
         */
        public ListSofamqTraceResponse ListSofamqTrace(ListSofamqTraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqTraceEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定实例下的消息轨迹查询任务列表信息。
         * Summary: 查询trace请求列表
         */
        public async Task<ListSofamqTraceResponse> ListSofamqTraceAsync(ListSofamqTraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqTraceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定实例下的消息轨迹查询任务列表信息。
         * Summary: 查询trace请求列表
         */
        public ListSofamqTraceResponse ListSofamqTraceEx(ListSofamqTraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqTraceResponse>(DoRequest("2.0", "sofa.mq.sofamq.trace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定实例下的消息轨迹查询任务列表信息。
         * Summary: 查询trace请求列表
         */
        public async Task<ListSofamqTraceResponse> ListSofamqTraceExAsync(ListSofamqTraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqTraceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.trace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定的消息轨迹查询任务。
         * Summary: 删除trace查询任务
         */
        public DeleteSofamqTraceResponse DeleteSofamqTrace(DeleteSofamqTraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqTraceEx(request, headers, runtime);
        }

        /**
         * Description: 删除指定的消息轨迹查询任务。
         * Summary: 删除trace查询任务
         */
        public async Task<DeleteSofamqTraceResponse> DeleteSofamqTraceAsync(DeleteSofamqTraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqTraceExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除指定的消息轨迹查询任务。
         * Summary: 删除trace查询任务
         */
        public DeleteSofamqTraceResponse DeleteSofamqTraceEx(DeleteSofamqTraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqTraceResponse>(DoRequest("2.0", "sofa.mq.sofamq.trace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定的消息轨迹查询任务。
         * Summary: 删除trace查询任务
         */
        public async Task<DeleteSofamqTraceResponse> DeleteSofamqTraceExAsync(DeleteSofamqTraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqTraceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.trace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
         * Summary: 通过Topic创建轨迹查询任务
         */
        public QuerySofamqTracebytopicResponse QuerySofamqTracebytopic(QuerySofamqTracebytopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqTracebytopicEx(request, headers, runtime);
        }

        /**
         * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
         * Summary: 通过Topic创建轨迹查询任务
         */
        public async Task<QuerySofamqTracebytopicResponse> QuerySofamqTracebytopicAsync(QuerySofamqTracebytopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqTracebytopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
         * Summary: 通过Topic创建轨迹查询任务
         */
        public QuerySofamqTracebytopicResponse QuerySofamqTracebytopicEx(QuerySofamqTracebytopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTracebytopicResponse>(DoRequest("2.0", "sofa.mq.sofamq.tracebytopic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
         * Summary: 通过Topic创建轨迹查询任务
         */
        public async Task<QuerySofamqTracebytopicResponse> QuerySofamqTracebytopicExAsync(QuerySofamqTracebytopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTracebytopicResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.tracebytopic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sofamq 支付后回调
         * Summary: sofamq 支付后回调
         */
        public PushSpiPaycallbackResponse PushSpiPaycallback(PushSpiPaycallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushSpiPaycallbackEx(request, headers, runtime);
        }

        /**
         * Description: sofamq 支付后回调
         * Summary: sofamq 支付后回调
         */
        public async Task<PushSpiPaycallbackResponse> PushSpiPaycallbackAsync(PushSpiPaycallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushSpiPaycallbackExAsync(request, headers, runtime);
        }

        /**
         * Description: sofamq 支付后回调
         * Summary: sofamq 支付后回调
         */
        public PushSpiPaycallbackResponse PushSpiPaycallbackEx(PushSpiPaycallbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSpiPaycallbackResponse>(DoRequest("2.0", "sofa.mq.spi.paycallback.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sofamq 支付后回调
         * Summary: sofamq 支付后回调
         */
        public async Task<PushSpiPaycallbackResponse> PushSpiPaycallbackExAsync(PushSpiPaycallbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSpiPaycallbackResponse>(await DoRequestAsync("2.0", "sofa.mq.spi.paycallback.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 补全商品信息
         * Summary: 补全商品信息
         */
        public PushSpiCompletecommodityResponse PushSpiCompletecommodity(PushSpiCompletecommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushSpiCompletecommodityEx(request, headers, runtime);
        }

        /**
         * Description: 补全商品信息
         * Summary: 补全商品信息
         */
        public async Task<PushSpiCompletecommodityResponse> PushSpiCompletecommodityAsync(PushSpiCompletecommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushSpiCompletecommodityExAsync(request, headers, runtime);
        }

        /**
         * Description: 补全商品信息
         * Summary: 补全商品信息
         */
        public PushSpiCompletecommodityResponse PushSpiCompletecommodityEx(PushSpiCompletecommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSpiCompletecommodityResponse>(DoRequest("2.0", "sofa.mq.spi.completecommodity.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 补全商品信息
         * Summary: 补全商品信息
         */
        public async Task<PushSpiCompletecommodityResponse> PushSpiCompletecommodityExAsync(PushSpiCompletecommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSpiCompletecommodityResponse>(await DoRequestAsync("2.0", "sofa.mq.spi.completecommodity.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单校验
         * Summary: 订单校验
         */
        public PushSpiOrderverifyResponse PushSpiOrderverify(PushSpiOrderverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushSpiOrderverifyEx(request, headers, runtime);
        }

        /**
         * Description: 订单校验
         * Summary: 订单校验
         */
        public async Task<PushSpiOrderverifyResponse> PushSpiOrderverifyAsync(PushSpiOrderverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushSpiOrderverifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单校验
         * Summary: 订单校验
         */
        public PushSpiOrderverifyResponse PushSpiOrderverifyEx(PushSpiOrderverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSpiOrderverifyResponse>(DoRequest("2.0", "sofa.mq.spi.orderverify.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单校验
         * Summary: 订单校验
         */
        public async Task<PushSpiOrderverifyResponse> PushSpiOrderverifyExAsync(PushSpiOrderverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSpiOrderverifyResponse>(await DoRequestAsync("2.0", "sofa.mq.spi.orderverify.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生命周期回调
         * Summary: 生命周期回调
         */
        public PushSpiOpencallbackResponse PushSpiOpencallback(PushSpiOpencallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushSpiOpencallbackEx(request, headers, runtime);
        }

        /**
         * Description: 生命周期回调
         * Summary: 生命周期回调
         */
        public async Task<PushSpiOpencallbackResponse> PushSpiOpencallbackAsync(PushSpiOpencallbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushSpiOpencallbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 生命周期回调
         * Summary: 生命周期回调
         */
        public PushSpiOpencallbackResponse PushSpiOpencallbackEx(PushSpiOpencallbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSpiOpencallbackResponse>(DoRequest("2.0", "sofa.mq.spi.opencallback.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生命周期回调
         * Summary: 生命周期回调
         */
        public async Task<PushSpiOpencallbackResponse> PushSpiOpencallbackExAsync(PushSpiOpencallbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushSpiOpencallbackResponse>(await DoRequestAsync("2.0", "sofa.mq.spi.opencallback.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: getldcbynamespace
         * Summary: getldcbynamespace
         */
        public GetSofamqLdcbynamespaceResponse GetSofamqLdcbynamespace(GetSofamqLdcbynamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSofamqLdcbynamespaceEx(request, headers, runtime);
        }

        /**
         * Description: getldcbynamespace
         * Summary: getldcbynamespace
         */
        public async Task<GetSofamqLdcbynamespaceResponse> GetSofamqLdcbynamespaceAsync(GetSofamqLdcbynamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSofamqLdcbynamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: getldcbynamespace
         * Summary: getldcbynamespace
         */
        public GetSofamqLdcbynamespaceResponse GetSofamqLdcbynamespaceEx(GetSofamqLdcbynamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqLdcbynamespaceResponse>(DoRequest("2.0", "sofa.mq.sofamq.ldcbynamespace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: getldcbynamespace
         * Summary: getldcbynamespace
         */
        public async Task<GetSofamqLdcbynamespaceResponse> GetSofamqLdcbynamespaceExAsync(GetSofamqLdcbynamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqLdcbynamespaceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.ldcbynamespace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定的消息路由任务的配置信息。
         * Summary: 更新路由配置
         */
        public UpdateSofamqRouterResponse UpdateSofamqRouter(UpdateSofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqRouterEx(request, headers, runtime);
        }

        /**
         * Description: 更新指定的消息路由任务的配置信息。
         * Summary: 更新路由配置
         */
        public async Task<UpdateSofamqRouterResponse> UpdateSofamqRouterAsync(UpdateSofamqRouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqRouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新指定的消息路由任务的配置信息。
         * Summary: 更新路由配置
         */
        public UpdateSofamqRouterResponse UpdateSofamqRouterEx(UpdateSofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqRouterResponse>(DoRequest("2.0", "sofa.mq.sofamq.router.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定的消息路由任务的配置信息。
         * Summary: 更新路由配置
         */
        public async Task<UpdateSofamqRouterResponse> UpdateSofamqRouterExAsync(UpdateSofamqRouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqRouterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.router.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
         * Summary: 批量重发死信消息
         */
        public ExecSofamqDlqresendbatchResponse ExecSofamqDlqresendbatch(ExecSofamqDlqresendbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecSofamqDlqresendbatchEx(request, headers, runtime);
        }

        /**
         * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
         * Summary: 批量重发死信消息
         */
        public async Task<ExecSofamqDlqresendbatchResponse> ExecSofamqDlqresendbatchAsync(ExecSofamqDlqresendbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecSofamqDlqresendbatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
         * Summary: 批量重发死信消息
         */
        public ExecSofamqDlqresendbatchResponse ExecSofamqDlqresendbatchEx(ExecSofamqDlqresendbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSofamqDlqresendbatchResponse>(DoRequest("2.0", "sofa.mq.sofamq.dlqresendbatch.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
         * Summary: 批量重发死信消息
         */
        public async Task<ExecSofamqDlqresendbatchResponse> ExecSofamqDlqresendbatchExAsync(ExecSofamqDlqresendbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSofamqDlqresendbatchResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.dlqresendbatch.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取报警规则列表信息。
         * Summary: 获取告警列表
         */
        public ListSofamqWarnResponse ListSofamqWarn(ListSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqWarnEx(request, headers, runtime);
        }

        /**
         * Description: 获取报警规则列表信息。
         * Summary: 获取告警列表
         */
        public async Task<ListSofamqWarnResponse> ListSofamqWarnAsync(ListSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqWarnExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取报警规则列表信息。
         * Summary: 获取告警列表
         */
        public ListSofamqWarnResponse ListSofamqWarnEx(ListSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqWarnResponse>(DoRequest("2.0", "sofa.mq.sofamq.warn.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取报警规则列表信息。
         * Summary: 获取告警列表
         */
        public async Task<ListSofamqWarnResponse> ListSofamqWarnExAsync(ListSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqWarnResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.warn.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一条报警规则。
         * Summary: 创建告警规则
         */
        public CreateSofamqWarnResponse CreateSofamqWarn(CreateSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqWarnEx(request, headers, runtime);
        }

        /**
         * Description: 创建一条报警规则。
         * Summary: 创建告警规则
         */
        public async Task<CreateSofamqWarnResponse> CreateSofamqWarnAsync(CreateSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqWarnExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一条报警规则。
         * Summary: 创建告警规则
         */
        public CreateSofamqWarnResponse CreateSofamqWarnEx(CreateSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqWarnResponse>(DoRequest("2.0", "sofa.mq.sofamq.warn.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一条报警规则。
         * Summary: 创建告警规则
         */
        public async Task<CreateSofamqWarnResponse> CreateSofamqWarnExAsync(CreateSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqWarnResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.warn.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入报警规则 ID，删除指定的报警规则。
         * Summary: 删除告警规则
         */
        public DeleteSofamqWarnResponse DeleteSofamqWarn(DeleteSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqWarnEx(request, headers, runtime);
        }

        /**
         * Description: 通过传入报警规则 ID，删除指定的报警规则。
         * Summary: 删除告警规则
         */
        public async Task<DeleteSofamqWarnResponse> DeleteSofamqWarnAsync(DeleteSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqWarnExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过传入报警规则 ID，删除指定的报警规则。
         * Summary: 删除告警规则
         */
        public DeleteSofamqWarnResponse DeleteSofamqWarnEx(DeleteSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqWarnResponse>(DoRequest("2.0", "sofa.mq.sofamq.warn.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入报警规则 ID，删除指定的报警规则。
         * Summary: 删除告警规则
         */
        public async Task<DeleteSofamqWarnResponse> DeleteSofamqWarnExAsync(DeleteSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqWarnResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.warn.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定报警规则的配置信息。
         * Summary: 更新告警规则
         */
        public UpdateSofamqWarnResponse UpdateSofamqWarn(UpdateSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqWarnEx(request, headers, runtime);
        }

        /**
         * Description: 更新指定报警规则的配置信息。
         * Summary: 更新告警规则
         */
        public async Task<UpdateSofamqWarnResponse> UpdateSofamqWarnAsync(UpdateSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqWarnExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新指定报警规则的配置信息。
         * Summary: 更新告警规则
         */
        public UpdateSofamqWarnResponse UpdateSofamqWarnEx(UpdateSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqWarnResponse>(DoRequest("2.0", "sofa.mq.sofamq.warn.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定报警规则的配置信息。
         * Summary: 更新告警规则
         */
        public async Task<UpdateSofamqWarnResponse> UpdateSofamqWarnExAsync(UpdateSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqWarnResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.warn.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入报警规则 ID，启用指定的报警规则。
         * Summary: 打开告警开关
         */
        public EnableSofamqWarnResponse EnableSofamqWarn(EnableSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSofamqWarnEx(request, headers, runtime);
        }

        /**
         * Description: 通过传入报警规则 ID，启用指定的报警规则。
         * Summary: 打开告警开关
         */
        public async Task<EnableSofamqWarnResponse> EnableSofamqWarnAsync(EnableSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSofamqWarnExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过传入报警规则 ID，启用指定的报警规则。
         * Summary: 打开告警开关
         */
        public EnableSofamqWarnResponse EnableSofamqWarnEx(EnableSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSofamqWarnResponse>(DoRequest("2.0", "sofa.mq.sofamq.warn.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入报警规则 ID，启用指定的报警规则。
         * Summary: 打开告警开关
         */
        public async Task<EnableSofamqWarnResponse> EnableSofamqWarnExAsync(EnableSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSofamqWarnResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.warn.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入报警规则 ID，禁用指定的报警规则。
         * Summary: 关闭告警开关
         */
        public DisableSofamqWarnResponse DisableSofamqWarn(DisableSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableSofamqWarnEx(request, headers, runtime);
        }

        /**
         * Description: 通过传入报警规则 ID，禁用指定的报警规则。
         * Summary: 关闭告警开关
         */
        public async Task<DisableSofamqWarnResponse> DisableSofamqWarnAsync(DisableSofamqWarnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableSofamqWarnExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过传入报警规则 ID，禁用指定的报警规则。
         * Summary: 关闭告警开关
         */
        public DisableSofamqWarnResponse DisableSofamqWarnEx(DisableSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSofamqWarnResponse>(DoRequest("2.0", "sofa.mq.sofamq.warn.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过传入报警规则 ID，禁用指定的报警规则。
         * Summary: 关闭告警开关
         */
        public async Task<DisableSofamqWarnResponse> DisableSofamqWarnExAsync(DisableSofamqWarnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSofamqWarnResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.warn.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
         * Summary: 查询告警日志
         */
        public ListSofamqWarnlogResponse ListSofamqWarnlog(ListSofamqWarnlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqWarnlogEx(request, headers, runtime);
        }

        /**
         * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
         * Summary: 查询告警日志
         */
        public async Task<ListSofamqWarnlogResponse> ListSofamqWarnlogAsync(ListSofamqWarnlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqWarnlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
         * Summary: 查询告警日志
         */
        public ListSofamqWarnlogResponse ListSofamqWarnlogEx(ListSofamqWarnlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqWarnlogResponse>(DoRequest("2.0", "sofa.mq.sofamq.warnlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
         * Summary: 查询告警日志
         */
        public async Task<ListSofamqWarnlogResponse> ListSofamqWarnlogExAsync(ListSofamqWarnlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqWarnlogResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.warnlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员查看topic
         * Summary: 管理员查看topic
         */
        public ListSofamqAdmintopicResponse ListSofamqAdmintopic(ListSofamqAdmintopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqAdmintopicEx(request, headers, runtime);
        }

        /**
         * Description: 管理员查看topic
         * Summary: 管理员查看topic
         */
        public async Task<ListSofamqAdmintopicResponse> ListSofamqAdmintopicAsync(ListSofamqAdmintopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqAdmintopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 管理员查看topic
         * Summary: 管理员查看topic
         */
        public ListSofamqAdmintopicResponse ListSofamqAdmintopicEx(ListSofamqAdmintopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAdmintopicResponse>(DoRequest("2.0", "sofa.mq.sofamq.admintopic.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员查看topic
         * Summary: 管理员查看topic
         */
        public async Task<ListSofamqAdmintopicResponse> ListSofamqAdmintopicExAsync(ListSofamqAdmintopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAdmintopicResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.admintopic.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 Topic、Group 实时的发送消费速度。
         * Summary: topicgroup实时的发送消费速度
         */
        public QueryMetricsTginstantResponse QueryMetricsTginstant(QueryMetricsTginstantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetricsTginstantEx(request, headers, runtime);
        }

        /**
         * Description: 查询 Topic、Group 实时的发送消费速度。
         * Summary: topicgroup实时的发送消费速度
         */
        public async Task<QueryMetricsTginstantResponse> QueryMetricsTginstantAsync(QueryMetricsTginstantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetricsTginstantExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询 Topic、Group 实时的发送消费速度。
         * Summary: topicgroup实时的发送消费速度
         */
        public QueryMetricsTginstantResponse QueryMetricsTginstantEx(QueryMetricsTginstantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsTginstantResponse>(DoRequest("2.0", "sofa.mq.metrics.tginstant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 Topic、Group 实时的发送消费速度。
         * Summary: topicgroup实时的发送消费速度
         */
        public async Task<QueryMetricsTginstantResponse> QueryMetricsTginstantExAsync(QueryMetricsTginstantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsTginstantResponse>(await DoRequestAsync("2.0", "sofa.mq.metrics.tginstant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
         * Summary: 获取 topic、group 的历史数据
         */
        public QueryMetricsTghistoryResponse QueryMetricsTghistory(QueryMetricsTghistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetricsTghistoryEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
         * Summary: 获取 topic、group 的历史数据
         */
        public async Task<QueryMetricsTghistoryResponse> QueryMetricsTghistoryAsync(QueryMetricsTghistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetricsTghistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
         * Summary: 获取 topic、group 的历史数据
         */
        public QueryMetricsTghistoryResponse QueryMetricsTghistoryEx(QueryMetricsTghistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsTghistoryResponse>(DoRequest("2.0", "sofa.mq.metrics.tghistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
         * Summary: 获取 topic、group 的历史数据
         */
        public async Task<QueryMetricsTghistoryResponse> QueryMetricsTghistoryExAsync(QueryMetricsTghistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsTghistoryResponse>(await DoRequestAsync("2.0", "sofa.mq.metrics.tghistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
         * Summary: 获取实例的基本信息
         */
        public QueryMetricsInstanceResponse QueryMetricsInstance(QueryMetricsInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetricsInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
         * Summary: 获取实例的基本信息
         */
        public async Task<QueryMetricsInstanceResponse> QueryMetricsInstanceAsync(QueryMetricsInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetricsInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
         * Summary: 获取实例的基本信息
         */
        public QueryMetricsInstanceResponse QueryMetricsInstanceEx(QueryMetricsInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsInstanceResponse>(DoRequest("2.0", "sofa.mq.metrics.instance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
         * Summary: 获取实例的基本信息
         */
        public async Task<QueryMetricsInstanceResponse> QueryMetricsInstanceExAsync(QueryMetricsInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsInstanceResponse>(await DoRequestAsync("2.0", "sofa.mq.metrics.instance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
         * Summary: 获取实例的历史统计数据
         */
        public QueryMetricsInstancehistoryResponse QueryMetricsInstancehistory(QueryMetricsInstancehistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetricsInstancehistoryEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
         * Summary: 获取实例的历史统计数据
         */
        public async Task<QueryMetricsInstancehistoryResponse> QueryMetricsInstancehistoryAsync(QueryMetricsInstancehistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetricsInstancehistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
         * Summary: 获取实例的历史统计数据
         */
        public QueryMetricsInstancehistoryResponse QueryMetricsInstancehistoryEx(QueryMetricsInstancehistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsInstancehistoryResponse>(DoRequest("2.0", "sofa.mq.metrics.instancehistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
         * Summary: 获取实例的历史统计数据
         */
        public async Task<QueryMetricsInstancehistoryResponse> QueryMetricsInstancehistoryExAsync(QueryMetricsInstancehistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetricsInstancehistoryResponse>(await DoRequestAsync("2.0", "sofa.mq.metrics.instancehistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定实例下 Topic 的统计列表信息。
         * Summary: 查询 topic 统计列表
         */
        public QueryStatsTopicResponse QueryStatsTopic(QueryStatsTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStatsTopicEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定实例下 Topic 的统计列表信息。
         * Summary: 查询 topic 统计列表
         */
        public async Task<QueryStatsTopicResponse> QueryStatsTopicAsync(QueryStatsTopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStatsTopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定实例下 Topic 的统计列表信息。
         * Summary: 查询 topic 统计列表
         */
        public QueryStatsTopicResponse QueryStatsTopicEx(QueryStatsTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStatsTopicResponse>(DoRequest("2.0", "sofa.mq.stats.topic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定实例下 Topic 的统计列表信息。
         * Summary: 查询 topic 统计列表
         */
        public async Task<QueryStatsTopicResponse> QueryStatsTopicExAsync(QueryStatsTopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStatsTopicResponse>(await DoRequestAsync("2.0", "sofa.mq.stats.topic.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定实例下 Group 的统计信息。
         * Summary: 获取当前实例的 group 统计信息
         */
        public QueryStatsGroupResponse QueryStatsGroup(QueryStatsGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStatsGroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取指定实例下 Group 的统计信息。
         * Summary: 获取当前实例的 group 统计信息
         */
        public async Task<QueryStatsGroupResponse> QueryStatsGroupAsync(QueryStatsGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStatsGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取指定实例下 Group 的统计信息。
         * Summary: 获取当前实例的 group 统计信息
         */
        public QueryStatsGroupResponse QueryStatsGroupEx(QueryStatsGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStatsGroupResponse>(DoRequest("2.0", "sofa.mq.stats.group.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定实例下 Group 的统计信息。
         * Summary: 获取当前实例的 group 统计信息
         */
        public async Task<QueryStatsGroupResponse> QueryStatsGroupExAsync(QueryStatsGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStatsGroupResponse>(await DoRequestAsync("2.0", "sofa.mq.stats.group.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员查看group
         * Summary: 管理员查看group
         */
        public ListSofamqAdmingroupResponse ListSofamqAdmingroup(ListSofamqAdmingroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqAdmingroupEx(request, headers, runtime);
        }

        /**
         * Description: 管理员查看group
         * Summary: 管理员查看group
         */
        public async Task<ListSofamqAdmingroupResponse> ListSofamqAdmingroupAsync(ListSofamqAdmingroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqAdmingroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 管理员查看group
         * Summary: 管理员查看group
         */
        public ListSofamqAdmingroupResponse ListSofamqAdmingroupEx(ListSofamqAdmingroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAdmingroupResponse>(DoRequest("2.0", "sofa.mq.sofamq.admingroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员查看group
         * Summary: 管理员查看group
         */
        public async Task<ListSofamqAdmingroupResponse> ListSofamqAdmingroupExAsync(ListSofamqAdmingroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAdmingroupResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.admingroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询kv配置
         * Summary: 查询kv配置
         */
        public ListSofamqKvconfigResponse ListSofamqKvconfig(ListSofamqKvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqKvconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询kv配置
         * Summary: 查询kv配置
         */
        public async Task<ListSofamqKvconfigResponse> ListSofamqKvconfigAsync(ListSofamqKvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqKvconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询kv配置
         * Summary: 查询kv配置
         */
        public ListSofamqKvconfigResponse ListSofamqKvconfigEx(ListSofamqKvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqKvconfigResponse>(DoRequest("2.0", "sofa.mq.sofamq.kvconfig.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询kv配置
         * Summary: 查询kv配置
         */
        public async Task<ListSofamqKvconfigResponse> ListSofamqKvconfigExAsync(ListSofamqKvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqKvconfigResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.kvconfig.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建kvconfig
         * Summary: 创建kvconfig
         */
        public CreateSofamqKvconfigResponse CreateSofamqKvconfig(CreateSofamqKvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqKvconfigEx(request, headers, runtime);
        }

        /**
         * Description: 创建kvconfig
         * Summary: 创建kvconfig
         */
        public async Task<CreateSofamqKvconfigResponse> CreateSofamqKvconfigAsync(CreateSofamqKvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqKvconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建kvconfig
         * Summary: 创建kvconfig
         */
        public CreateSofamqKvconfigResponse CreateSofamqKvconfigEx(CreateSofamqKvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqKvconfigResponse>(DoRequest("2.0", "sofa.mq.sofamq.kvconfig.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建kvconfig
         * Summary: 创建kvconfig
         */
        public async Task<CreateSofamqKvconfigResponse> CreateSofamqKvconfigExAsync(CreateSofamqKvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqKvconfigResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.kvconfig.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除kvconfig
         * Summary: 删除kvconfig
         */
        public DeleteSofamqKvconfigResponse DeleteSofamqKvconfig(DeleteSofamqKvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqKvconfigEx(request, headers, runtime);
        }

        /**
         * Description: 删除kvconfig
         * Summary: 删除kvconfig
         */
        public async Task<DeleteSofamqKvconfigResponse> DeleteSofamqKvconfigAsync(DeleteSofamqKvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqKvconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除kvconfig
         * Summary: 删除kvconfig
         */
        public DeleteSofamqKvconfigResponse DeleteSofamqKvconfigEx(DeleteSofamqKvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqKvconfigResponse>(DoRequest("2.0", "sofa.mq.sofamq.kvconfig.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除kvconfig
         * Summary: 删除kvconfig
         */
        public async Task<DeleteSofamqKvconfigResponse> DeleteSofamqKvconfigExAsync(DeleteSofamqKvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqKvconfigResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.kvconfig.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改kvconfig值
         * Summary: 修改kvconfig值
         */
        public UpdateSofamqKvconfigResponse UpdateSofamqKvconfig(UpdateSofamqKvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqKvconfigEx(request, headers, runtime);
        }

        /**
         * Description: 修改kvconfig值
         * Summary: 修改kvconfig值
         */
        public async Task<UpdateSofamqKvconfigResponse> UpdateSofamqKvconfigAsync(UpdateSofamqKvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqKvconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改kvconfig值
         * Summary: 修改kvconfig值
         */
        public UpdateSofamqKvconfigResponse UpdateSofamqKvconfigEx(UpdateSofamqKvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqKvconfigResponse>(DoRequest("2.0", "sofa.mq.sofamq.kvconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改kvconfig值
         * Summary: 修改kvconfig值
         */
        public async Task<UpdateSofamqKvconfigResponse> UpdateSofamqKvconfigExAsync(UpdateSofamqKvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqKvconfigResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.kvconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除config配置
         * Summary: 删除config配置
         */
        public DeleteSofamqConfigResponse DeleteSofamqConfig(DeleteSofamqConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqConfigEx(request, headers, runtime);
        }

        /**
         * Description: 删除config配置
         * Summary: 删除config配置
         */
        public async Task<DeleteSofamqConfigResponse> DeleteSofamqConfigAsync(DeleteSofamqConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除config配置
         * Summary: 删除config配置
         */
        public DeleteSofamqConfigResponse DeleteSofamqConfigEx(DeleteSofamqConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqConfigResponse>(DoRequest("2.0", "sofa.mq.sofamq.config.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除config配置
         * Summary: 删除config配置
         */
        public async Task<DeleteSofamqConfigResponse> DeleteSofamqConfigExAsync(DeleteSofamqConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqConfigResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.config.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新config配置
         * Summary: 更新config配置
         */
        public UpdateSofamqConfigResponse UpdateSofamqConfig(UpdateSofamqConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqConfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新config配置
         * Summary: 更新config配置
         */
        public async Task<UpdateSofamqConfigResponse> UpdateSofamqConfigAsync(UpdateSofamqConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新config配置
         * Summary: 更新config配置
         */
        public UpdateSofamqConfigResponse UpdateSofamqConfigEx(UpdateSofamqConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqConfigResponse>(DoRequest("2.0", "sofa.mq.sofamq.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新config配置
         * Summary: 更新config配置
         */
        public async Task<UpdateSofamqConfigResponse> UpdateSofamqConfigExAsync(UpdateSofamqConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqConfigResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update cluster
         * Summary: update cluster
         */
        public UpdateSofamqClusterResponse UpdateSofamqCluster(UpdateSofamqClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqClusterEx(request, headers, runtime);
        }

        /**
         * Description: update cluster
         * Summary: update cluster
         */
        public async Task<UpdateSofamqClusterResponse> UpdateSofamqClusterAsync(UpdateSofamqClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: update cluster
         * Summary: update cluster
         */
        public UpdateSofamqClusterResponse UpdateSofamqClusterEx(UpdateSofamqClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqClusterResponse>(DoRequest("2.0", "sofa.mq.sofamq.cluster.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update cluster
         * Summary: update cluster
         */
        public async Task<UpdateSofamqClusterResponse> UpdateSofamqClusterExAsync(UpdateSofamqClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqClusterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.cluster.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update dc
         * Summary: update dc
         */
        public UpdateSofamqDatacenterResponse UpdateSofamqDatacenter(UpdateSofamqDatacenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqDatacenterEx(request, headers, runtime);
        }

        /**
         * Description: update dc
         * Summary: update dc
         */
        public async Task<UpdateSofamqDatacenterResponse> UpdateSofamqDatacenterAsync(UpdateSofamqDatacenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqDatacenterExAsync(request, headers, runtime);
        }

        /**
         * Description: update dc
         * Summary: update dc
         */
        public UpdateSofamqDatacenterResponse UpdateSofamqDatacenterEx(UpdateSofamqDatacenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqDatacenterResponse>(DoRequest("2.0", "sofa.mq.sofamq.datacenter.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update dc
         * Summary: update dc
         */
        public async Task<UpdateSofamqDatacenterResponse> UpdateSofamqDatacenterExAsync(UpdateSofamqDatacenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqDatacenterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.datacenter.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update room
         * Summary: update room
         */
        public UpdateSofamqRoomResponse UpdateSofamqRoom(UpdateSofamqRoomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqRoomEx(request, headers, runtime);
        }

        /**
         * Description: update room
         * Summary: update room
         */
        public async Task<UpdateSofamqRoomResponse> UpdateSofamqRoomAsync(UpdateSofamqRoomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqRoomExAsync(request, headers, runtime);
        }

        /**
         * Description: update room
         * Summary: update room
         */
        public UpdateSofamqRoomResponse UpdateSofamqRoomEx(UpdateSofamqRoomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqRoomResponse>(DoRequest("2.0", "sofa.mq.sofamq.room.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update room
         * Summary: update room
         */
        public async Task<UpdateSofamqRoomResponse> UpdateSofamqRoomExAsync(UpdateSofamqRoomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqRoomResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.room.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update node
         * Summary: update node
         */
        public UpdateSofamqNodeResponse UpdateSofamqNode(UpdateSofamqNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqNodeEx(request, headers, runtime);
        }

        /**
         * Description: update node
         * Summary: update node
         */
        public async Task<UpdateSofamqNodeResponse> UpdateSofamqNodeAsync(UpdateSofamqNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: update node
         * Summary: update node
         */
        public UpdateSofamqNodeResponse UpdateSofamqNodeEx(UpdateSofamqNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqNodeResponse>(DoRequest("2.0", "sofa.mq.sofamq.node.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update node
         * Summary: update node
         */
        public async Task<UpdateSofamqNodeResponse> UpdateSofamqNodeExAsync(UpdateSofamqNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqNodeResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.node.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定的 Topic 的队列信息。
         * Summary: 查询topic的队列信息
         */
        public QuerySofamqTopicqueueResponse QuerySofamqTopicqueue(QuerySofamqTopicqueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqTopicqueueEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定的 Topic 的队列信息。
         * Summary: 查询topic的队列信息
         */
        public async Task<QuerySofamqTopicqueueResponse> QuerySofamqTopicqueueAsync(QuerySofamqTopicqueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqTopicqueueExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定的 Topic 的队列信息。
         * Summary: 查询topic的队列信息
         */
        public QuerySofamqTopicqueueResponse QuerySofamqTopicqueueEx(QuerySofamqTopicqueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTopicqueueResponse>(DoRequest("2.0", "sofa.mq.sofamq.topicqueue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定的 Topic 的队列信息。
         * Summary: 查询topic的队列信息
         */
        public async Task<QuerySofamqTopicqueueResponse> QuerySofamqTopicqueueExAsync(QuerySofamqTopicqueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTopicqueueResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.topicqueue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看在线订阅topic
         * Summary: 查看在线订阅topic
         */
        public QuerySofamqAdmingroupsubdetailResponse QuerySofamqAdmingroupsubdetail(QuerySofamqAdmingroupsubdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqAdmingroupsubdetailEx(request, headers, runtime);
        }

        /**
         * Description: 查看在线订阅topic
         * Summary: 查看在线订阅topic
         */
        public async Task<QuerySofamqAdmingroupsubdetailResponse> QuerySofamqAdmingroupsubdetailAsync(QuerySofamqAdmingroupsubdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqAdmingroupsubdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查看在线订阅topic
         * Summary: 查看在线订阅topic
         */
        public QuerySofamqAdmingroupsubdetailResponse QuerySofamqAdmingroupsubdetailEx(QuerySofamqAdmingroupsubdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqAdmingroupsubdetailResponse>(DoRequest("2.0", "sofa.mq.sofamq.admingroupsubdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看在线订阅topic
         * Summary: 查看在线订阅topic
         */
        public async Task<QuerySofamqAdmingroupsubdetailResponse> QuerySofamqAdmingroupsubdetailExAsync(QuerySofamqAdmingroupsubdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqAdmingroupsubdetailResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.admingroupsubdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员列表
         * Summary: 管理员列表
         */
        public ListSofamqAdminuserResponse ListSofamqAdminuser(ListSofamqAdminuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqAdminuserEx(request, headers, runtime);
        }

        /**
         * Description: 管理员列表
         * Summary: 管理员列表
         */
        public async Task<ListSofamqAdminuserResponse> ListSofamqAdminuserAsync(ListSofamqAdminuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqAdminuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 管理员列表
         * Summary: 管理员列表
         */
        public ListSofamqAdminuserResponse ListSofamqAdminuserEx(ListSofamqAdminuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAdminuserResponse>(DoRequest("2.0", "sofa.mq.sofamq.adminuser.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员列表
         * Summary: 管理员列表
         */
        public async Task<ListSofamqAdminuserResponse> ListSofamqAdminuserExAsync(ListSofamqAdminuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAdminuserResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.adminuser.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加用户
         * Summary: 添加用户
         */
        public CreateSofamqAdminuserResponse CreateSofamqAdminuser(CreateSofamqAdminuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqAdminuserEx(request, headers, runtime);
        }

        /**
         * Description: 添加用户
         * Summary: 添加用户
         */
        public async Task<CreateSofamqAdminuserResponse> CreateSofamqAdminuserAsync(CreateSofamqAdminuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqAdminuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加用户
         * Summary: 添加用户
         */
        public CreateSofamqAdminuserResponse CreateSofamqAdminuserEx(CreateSofamqAdminuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqAdminuserResponse>(DoRequest("2.0", "sofa.mq.sofamq.adminuser.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加用户
         * Summary: 添加用户
         */
        public async Task<CreateSofamqAdminuserResponse> CreateSofamqAdminuserExAsync(CreateSofamqAdminuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqAdminuserResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.adminuser.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除管理员用户
         * Summary: 删除管理员用户
         */
        public DeleteSofamqAdminuserResponse DeleteSofamqAdminuser(DeleteSofamqAdminuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqAdminuserEx(request, headers, runtime);
        }

        /**
         * Description: 删除管理员用户
         * Summary: 删除管理员用户
         */
        public async Task<DeleteSofamqAdminuserResponse> DeleteSofamqAdminuserAsync(DeleteSofamqAdminuserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqAdminuserExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除管理员用户
         * Summary: 删除管理员用户
         */
        public DeleteSofamqAdminuserResponse DeleteSofamqAdminuserEx(DeleteSofamqAdminuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqAdminuserResponse>(DoRequest("2.0", "sofa.mq.sofamq.adminuser.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除管理员用户
         * Summary: 删除管理员用户
         */
        public async Task<DeleteSofamqAdminuserResponse> DeleteSofamqAdminuserExAsync(DeleteSofamqAdminuserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqAdminuserResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.adminuser.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户侧接口列表
         * Summary: 查询用户侧接口列表
         */
        public ListSofamqAdminapiResponse ListSofamqAdminapi(ListSofamqAdminapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqAdminapiEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户侧接口列表
         * Summary: 查询用户侧接口列表
         */
        public async Task<ListSofamqAdminapiResponse> ListSofamqAdminapiAsync(ListSofamqAdminapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqAdminapiExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户侧接口列表
         * Summary: 查询用户侧接口列表
         */
        public ListSofamqAdminapiResponse ListSofamqAdminapiEx(ListSofamqAdminapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAdminapiResponse>(DoRequest("2.0", "sofa.mq.sofamq.adminapi.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户侧接口列表
         * Summary: 查询用户侧接口列表
         */
        public async Task<ListSofamqAdminapiResponse> ListSofamqAdminapiExAsync(ListSofamqAdminapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAdminapiResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.adminapi.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api权限更新
         * Summary: api权限更新
         */
        public SwitchSofamqAdminapiResponse SwitchSofamqAdminapi(SwitchSofamqAdminapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SwitchSofamqAdminapiEx(request, headers, runtime);
        }

        /**
         * Description: api权限更新
         * Summary: api权限更新
         */
        public async Task<SwitchSofamqAdminapiResponse> SwitchSofamqAdminapiAsync(SwitchSofamqAdminapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SwitchSofamqAdminapiExAsync(request, headers, runtime);
        }

        /**
         * Description: api权限更新
         * Summary: api权限更新
         */
        public SwitchSofamqAdminapiResponse SwitchSofamqAdminapiEx(SwitchSofamqAdminapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchSofamqAdminapiResponse>(DoRequest("2.0", "sofa.mq.sofamq.adminapi.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api权限更新
         * Summary: api权限更新
         */
        public async Task<SwitchSofamqAdminapiResponse> SwitchSofamqAdminapiExAsync(SwitchSofamqAdminapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchSofamqAdminapiResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.adminapi.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public AddDmsMsgtypeResponse AddDmsMsgtype(AddDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDmsMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<AddDmsMsgtypeResponse> AddDmsMsgtypeAsync(AddDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDmsMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public AddDmsMsgtypeResponse AddDmsMsgtypeEx(AddDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDmsMsgtypeResponse>(DoRequest("2.0", "sofa.mq.dms.msgtype.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<AddDmsMsgtypeResponse> AddDmsMsgtypeExAsync(AddDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDmsMsgtypeResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msgtype.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ListDmsMsgtypeResponse ListDmsMsgtype(ListDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDmsMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ListDmsMsgtypeResponse> ListDmsMsgtypeAsync(ListDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDmsMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ListDmsMsgtypeResponse ListDmsMsgtypeEx(ListDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDmsMsgtypeResponse>(DoRequest("2.0", "sofa.mq.dms.msgtype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ListDmsMsgtypeResponse> ListDmsMsgtypeExAsync(ListDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDmsMsgtypeResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msgtype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public CreateDmsBindingResponse CreateDmsBinding(CreateDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDmsBindingEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<CreateDmsBindingResponse> CreateDmsBindingAsync(CreateDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDmsBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public CreateDmsBindingResponse CreateDmsBindingEx(CreateDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDmsBindingResponse>(DoRequest("2.0", "sofa.mq.dms.binding.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<CreateDmsBindingResponse> CreateDmsBindingExAsync(CreateDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDmsBindingResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.binding.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ListDmsBindingResponse ListDmsBinding(ListDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDmsBindingEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ListDmsBindingResponse> ListDmsBindingAsync(ListDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDmsBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ListDmsBindingResponse ListDmsBindingEx(ListDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDmsBindingResponse>(DoRequest("2.0", "sofa.mq.dms.binding.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ListDmsBindingResponse> ListDmsBindingExAsync(ListDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDmsBindingResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.binding.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public DeleteDmsMsgtypeResponse DeleteDmsMsgtype(DeleteDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDmsMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<DeleteDmsMsgtypeResponse> DeleteDmsMsgtypeAsync(DeleteDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDmsMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public DeleteDmsMsgtypeResponse DeleteDmsMsgtypeEx(DeleteDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDmsMsgtypeResponse>(DoRequest("2.0", "sofa.mq.dms.msgtype.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<DeleteDmsMsgtypeResponse> DeleteDmsMsgtypeExAsync(DeleteDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDmsMsgtypeResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msgtype.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public DeleteDmsBindingResponse DeleteDmsBinding(DeleteDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDmsBindingEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<DeleteDmsBindingResponse> DeleteDmsBindingAsync(DeleteDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDmsBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public DeleteDmsBindingResponse DeleteDmsBindingEx(DeleteDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDmsBindingResponse>(DoRequest("2.0", "sofa.mq.dms.binding.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<DeleteDmsBindingResponse> DeleteDmsBindingExAsync(DeleteDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDmsBindingResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.binding.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public UpdateDmsMsgtypeResponse UpdateDmsMsgtype(UpdateDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDmsMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<UpdateDmsMsgtypeResponse> UpdateDmsMsgtypeAsync(UpdateDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDmsMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public UpdateDmsMsgtypeResponse UpdateDmsMsgtypeEx(UpdateDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDmsMsgtypeResponse>(DoRequest("2.0", "sofa.mq.dms.msgtype.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<UpdateDmsMsgtypeResponse> UpdateDmsMsgtypeExAsync(UpdateDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDmsMsgtypeResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msgtype.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public UpdateDmsBindingResponse UpdateDmsBinding(UpdateDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDmsBindingEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<UpdateDmsBindingResponse> UpdateDmsBindingAsync(UpdateDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDmsBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public UpdateDmsBindingResponse UpdateDmsBindingEx(UpdateDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDmsBindingResponse>(DoRequest("2.0", "sofa.mq.dms.binding.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<UpdateDmsBindingResponse> UpdateDmsBindingExAsync(UpdateDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDmsBindingResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.binding.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public QueryDmsMsgResponse QueryDmsMsg(QueryDmsMsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDmsMsgEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<QueryDmsMsgResponse> QueryDmsMsgAsync(QueryDmsMsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDmsMsgExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public QueryDmsMsgResponse QueryDmsMsgEx(QueryDmsMsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDmsMsgResponse>(DoRequest("2.0", "sofa.mq.dms.msg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<QueryDmsMsgResponse> QueryDmsMsgExAsync(QueryDmsMsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDmsMsgResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public BatchqueryDmsMsgResponse BatchqueryDmsMsg(BatchqueryDmsMsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryDmsMsgEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<BatchqueryDmsMsgResponse> BatchqueryDmsMsgAsync(BatchqueryDmsMsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryDmsMsgExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public BatchqueryDmsMsgResponse BatchqueryDmsMsgEx(BatchqueryDmsMsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryDmsMsgResponse>(DoRequest("2.0", "sofa.mq.dms.msg.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<BatchqueryDmsMsgResponse> BatchqueryDmsMsgExAsync(BatchqueryDmsMsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryDmsMsgResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msg.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public DeleteDmsMsgResponse DeleteDmsMsg(DeleteDmsMsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDmsMsgEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<DeleteDmsMsgResponse> DeleteDmsMsgAsync(DeleteDmsMsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDmsMsgExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public DeleteDmsMsgResponse DeleteDmsMsgEx(DeleteDmsMsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDmsMsgResponse>(DoRequest("2.0", "sofa.mq.dms.msg.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<DeleteDmsMsgResponse> DeleteDmsMsgExAsync(DeleteDmsMsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDmsMsgResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msg.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public BatchdeleteDmsMsgResponse BatchdeleteDmsMsg(BatchdeleteDmsMsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteDmsMsgEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<BatchdeleteDmsMsgResponse> BatchdeleteDmsMsgAsync(BatchdeleteDmsMsgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteDmsMsgExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public BatchdeleteDmsMsgResponse BatchdeleteDmsMsgEx(BatchdeleteDmsMsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteDmsMsgResponse>(DoRequest("2.0", "sofa.mq.dms.msg.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<BatchdeleteDmsMsgResponse> BatchdeleteDmsMsgExAsync(BatchdeleteDmsMsgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteDmsMsgResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msg.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ExportDmsMsgtypeResponse ExportDmsMsgtype(ExportDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportDmsMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ExportDmsMsgtypeResponse> ExportDmsMsgtypeAsync(ExportDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportDmsMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ExportDmsMsgtypeResponse ExportDmsMsgtypeEx(ExportDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportDmsMsgtypeResponse>(DoRequest("2.0", "sofa.mq.dms.msgtype.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ExportDmsMsgtypeResponse> ExportDmsMsgtypeExAsync(ExportDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportDmsMsgtypeResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msgtype.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ImportDmsMsgtypeResponse ImportDmsMsgtype(ImportDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportDmsMsgtypeEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ImportDmsMsgtypeResponse> ImportDmsMsgtypeAsync(ImportDmsMsgtypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportDmsMsgtypeExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ImportDmsMsgtypeResponse ImportDmsMsgtypeEx(ImportDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDmsMsgtypeResponse>(DoRequest("2.0", "sofa.mq.dms.msgtype.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ImportDmsMsgtypeResponse> ImportDmsMsgtypeExAsync(ImportDmsMsgtypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDmsMsgtypeResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msgtype.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ExportDmsBindingResponse ExportDmsBinding(ExportDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportDmsBindingEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ExportDmsBindingResponse> ExportDmsBindingAsync(ExportDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportDmsBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ExportDmsBindingResponse ExportDmsBindingEx(ExportDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportDmsBindingResponse>(DoRequest("2.0", "sofa.mq.dms.binding.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ExportDmsBindingResponse> ExportDmsBindingExAsync(ExportDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportDmsBindingResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.binding.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ImportDmsBindingResponse ImportDmsBinding(ImportDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportDmsBindingEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ImportDmsBindingResponse> ImportDmsBindingAsync(ImportDmsBindingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportDmsBindingExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ImportDmsBindingResponse ImportDmsBindingEx(ImportDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDmsBindingResponse>(DoRequest("2.0", "sofa.mq.dms.binding.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ImportDmsBindingResponse> ImportDmsBindingExAsync(ImportDmsBindingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDmsBindingResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.binding.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ListDmsWhitelistResponse ListDmsWhitelist(ListDmsWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDmsWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ListDmsWhitelistResponse> ListDmsWhitelistAsync(ListDmsWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDmsWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public ListDmsWhitelistResponse ListDmsWhitelistEx(ListDmsWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDmsWhitelistResponse>(DoRequest("2.0", "sofa.mq.dms.whitelist.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<ListDmsWhitelistResponse> ListDmsWhitelistExAsync(ListDmsWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDmsWhitelistResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.whitelist.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public AddDmsWhitelistResponse AddDmsWhitelist(AddDmsWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDmsWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<AddDmsWhitelistResponse> AddDmsWhitelistAsync(AddDmsWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDmsWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public AddDmsWhitelistResponse AddDmsWhitelistEx(AddDmsWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDmsWhitelistResponse>(DoRequest("2.0", "sofa.mq.dms.whitelist.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<AddDmsWhitelistResponse> AddDmsWhitelistExAsync(AddDmsWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDmsWhitelistResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.whitelist.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public DeleteDmsWhitelistResponse DeleteDmsWhitelist(DeleteDmsWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDmsWhitelistEx(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<DeleteDmsWhitelistResponse> DeleteDmsWhitelistAsync(DeleteDmsWhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDmsWhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public DeleteDmsWhitelistResponse DeleteDmsWhitelistEx(DeleteDmsWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDmsWhitelistResponse>(DoRequest("2.0", "sofa.mq.dms.whitelist.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dms
         * Summary: dms
         */
        public async Task<DeleteDmsWhitelistResponse> DeleteDmsWhitelistExAsync(DeleteDmsWhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDmsWhitelistResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.whitelist.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: admin
         * Summary: topics
         */
        public GetDmsTopicsResponse GetDmsTopics(GetDmsTopicsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDmsTopicsEx(request, headers, runtime);
        }

        /**
         * Description: admin
         * Summary: topics
         */
        public async Task<GetDmsTopicsResponse> GetDmsTopicsAsync(GetDmsTopicsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDmsTopicsExAsync(request, headers, runtime);
        }

        /**
         * Description: admin
         * Summary: topics
         */
        public GetDmsTopicsResponse GetDmsTopicsEx(GetDmsTopicsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDmsTopicsResponse>(DoRequest("2.0", "sofa.mq.dms.topics.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: admin
         * Summary: topics
         */
        public async Task<GetDmsTopicsResponse> GetDmsTopicsExAsync(GetDmsTopicsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDmsTopicsResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.topics.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消费者堆栈信息，便于定位问题。
         * Summary: 查询消费者堆栈信息
         */
        public GetSofamqConsumerjstackResponse GetSofamqConsumerjstack(GetSofamqConsumerjstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSofamqConsumerjstackEx(request, headers, runtime);
        }

        /**
         * Description: 查询消费者堆栈信息，便于定位问题。
         * Summary: 查询消费者堆栈信息
         */
        public async Task<GetSofamqConsumerjstackResponse> GetSofamqConsumerjstackAsync(GetSofamqConsumerjstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSofamqConsumerjstackExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询消费者堆栈信息，便于定位问题。
         * Summary: 查询消费者堆栈信息
         */
        public GetSofamqConsumerjstackResponse GetSofamqConsumerjstackEx(GetSofamqConsumerjstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqConsumerjstackResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumerjstack.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消费者堆栈信息，便于定位问题。
         * Summary: 查询消费者堆栈信息
         */
        public async Task<GetSofamqConsumerjstackResponse> GetSofamqConsumerjstackExAsync(GetSofamqConsumerjstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqConsumerjstackResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumerjstack.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: uploadurl
         * Summary: uploadurl
         */
        public QueryDmsUploadurlResponse QueryDmsUploadurl(QueryDmsUploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDmsUploadurlEx(request, headers, runtime);
        }

        /**
         * Description: uploadurl
         * Summary: uploadurl
         */
        public async Task<QueryDmsUploadurlResponse> QueryDmsUploadurlAsync(QueryDmsUploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDmsUploadurlExAsync(request, headers, runtime);
        }

        /**
         * Description: uploadurl
         * Summary: uploadurl
         */
        public QueryDmsUploadurlResponse QueryDmsUploadurlEx(QueryDmsUploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDmsUploadurlResponse>(DoRequest("2.0", "sofa.mq.dms.uploadurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: uploadurl
         * Summary: uploadurl
         */
        public async Task<QueryDmsUploadurlResponse> QueryDmsUploadurlExAsync(QueryDmsUploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDmsUploadurlResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.uploadurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: msgtypetemplate
         * Summary: msgtypetemplate
         */
        public GetDmsMsgtypetemplateResponse GetDmsMsgtypetemplate(GetDmsMsgtypetemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDmsMsgtypetemplateEx(request, headers, runtime);
        }

        /**
         * Description: msgtypetemplate
         * Summary: msgtypetemplate
         */
        public async Task<GetDmsMsgtypetemplateResponse> GetDmsMsgtypetemplateAsync(GetDmsMsgtypetemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDmsMsgtypetemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: msgtypetemplate
         * Summary: msgtypetemplate
         */
        public GetDmsMsgtypetemplateResponse GetDmsMsgtypetemplateEx(GetDmsMsgtypetemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDmsMsgtypetemplateResponse>(DoRequest("2.0", "sofa.mq.dms.msgtypetemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: msgtypetemplate
         * Summary: msgtypetemplate
         */
        public async Task<GetDmsMsgtypetemplateResponse> GetDmsMsgtypetemplateExAsync(GetDmsMsgtypetemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDmsMsgtypetemplateResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.msgtypetemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: template
         * Summary: template
         */
        public GetDmsBindingtemplateResponse GetDmsBindingtemplate(GetDmsBindingtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDmsBindingtemplateEx(request, headers, runtime);
        }

        /**
         * Description: template
         * Summary: template
         */
        public async Task<GetDmsBindingtemplateResponse> GetDmsBindingtemplateAsync(GetDmsBindingtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDmsBindingtemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: template
         * Summary: template
         */
        public GetDmsBindingtemplateResponse GetDmsBindingtemplateEx(GetDmsBindingtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDmsBindingtemplateResponse>(DoRequest("2.0", "sofa.mq.dms.bindingtemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: template
         * Summary: template
         */
        public async Task<GetDmsBindingtemplateResponse> GetDmsBindingtemplateExAsync(GetDmsBindingtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDmsBindingtemplateResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.bindingtemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询msgdump消息同步任务源端资源
         * Summary: 查询msgdump消息同步任务源端资源
         */
        public QueryMsgdumpSourceResponse QueryMsgdumpSource(QueryMsgdumpSourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMsgdumpSourceEx(request, headers, runtime);
        }

        /**
         * Description: 查询msgdump消息同步任务源端资源
         * Summary: 查询msgdump消息同步任务源端资源
         */
        public async Task<QueryMsgdumpSourceResponse> QueryMsgdumpSourceAsync(QueryMsgdumpSourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMsgdumpSourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询msgdump消息同步任务源端资源
         * Summary: 查询msgdump消息同步任务源端资源
         */
        public QueryMsgdumpSourceResponse QueryMsgdumpSourceEx(QueryMsgdumpSourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMsgdumpSourceResponse>(DoRequest("2.0", "sofa.mq.msgdump.source.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询msgdump消息同步任务源端资源
         * Summary: 查询msgdump消息同步任务源端资源
         */
        public async Task<QueryMsgdumpSourceResponse> QueryMsgdumpSourceExAsync(QueryMsgdumpSourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMsgdumpSourceResponse>(await DoRequestAsync("2.0", "sofa.mq.msgdump.source.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 msgdump 同步任务
         * Summary: 创建同步任务
         */
        public CreateMsgdumpTaskResponse CreateMsgdumpTask(CreateMsgdumpTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMsgdumpTaskEx(request, headers, runtime);
        }

        /**
         * Description: 创建 msgdump 同步任务
         * Summary: 创建同步任务
         */
        public async Task<CreateMsgdumpTaskResponse> CreateMsgdumpTaskAsync(CreateMsgdumpTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMsgdumpTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建 msgdump 同步任务
         * Summary: 创建同步任务
         */
        public CreateMsgdumpTaskResponse CreateMsgdumpTaskEx(CreateMsgdumpTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMsgdumpTaskResponse>(DoRequest("2.0", "sofa.mq.msgdump.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 msgdump 同步任务
         * Summary: 创建同步任务
         */
        public async Task<CreateMsgdumpTaskResponse> CreateMsgdumpTaskExAsync(CreateMsgdumpTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMsgdumpTaskResponse>(await DoRequestAsync("2.0", "sofa.mq.msgdump.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消息同步任务
         * Summary: 查询消息同步任务
         */
        public QueryMsgdumpTaskResponse QueryMsgdumpTask(QueryMsgdumpTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMsgdumpTaskEx(request, headers, runtime);
        }

        /**
         * Description: 查询消息同步任务
         * Summary: 查询消息同步任务
         */
        public async Task<QueryMsgdumpTaskResponse> QueryMsgdumpTaskAsync(QueryMsgdumpTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMsgdumpTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询消息同步任务
         * Summary: 查询消息同步任务
         */
        public QueryMsgdumpTaskResponse QueryMsgdumpTaskEx(QueryMsgdumpTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMsgdumpTaskResponse>(DoRequest("2.0", "sofa.mq.msgdump.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消息同步任务
         * Summary: 查询消息同步任务
         */
        public async Task<QueryMsgdumpTaskResponse> QueryMsgdumpTaskExAsync(QueryMsgdumpTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMsgdumpTaskResponse>(await DoRequestAsync("2.0", "sofa.mq.msgdump.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除 msgdump 任务
         * Summary: 删除 msgdump 任务
         */
        public DeleteMsgdumpTaskResponse DeleteMsgdumpTask(DeleteMsgdumpTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMsgdumpTaskEx(request, headers, runtime);
        }

        /**
         * Description: 删除 msgdump 任务
         * Summary: 删除 msgdump 任务
         */
        public async Task<DeleteMsgdumpTaskResponse> DeleteMsgdumpTaskAsync(DeleteMsgdumpTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMsgdumpTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除 msgdump 任务
         * Summary: 删除 msgdump 任务
         */
        public DeleteMsgdumpTaskResponse DeleteMsgdumpTaskEx(DeleteMsgdumpTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsgdumpTaskResponse>(DoRequest("2.0", "sofa.mq.msgdump.task.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除 msgdump 任务
         * Summary: 删除 msgdump 任务
         */
        public async Task<DeleteMsgdumpTaskResponse> DeleteMsgdumpTaskExAsync(DeleteMsgdumpTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsgdumpTaskResponse>(await DoRequestAsync("2.0", "sofa.mq.msgdump.task.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新msgdump任务状态
         * Summary: 更新msgdump任务状态
         */
        public EnableMsgdumpTaskResponse EnableMsgdumpTask(EnableMsgdumpTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableMsgdumpTaskEx(request, headers, runtime);
        }

        /**
         * Description: 更新msgdump任务状态
         * Summary: 更新msgdump任务状态
         */
        public async Task<EnableMsgdumpTaskResponse> EnableMsgdumpTaskAsync(EnableMsgdumpTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableMsgdumpTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新msgdump任务状态
         * Summary: 更新msgdump任务状态
         */
        public EnableMsgdumpTaskResponse EnableMsgdumpTaskEx(EnableMsgdumpTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableMsgdumpTaskResponse>(DoRequest("2.0", "sofa.mq.msgdump.task.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新msgdump任务状态
         * Summary: 更新msgdump任务状态
         */
        public async Task<EnableMsgdumpTaskResponse> EnableMsgdumpTaskExAsync(EnableMsgdumpTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableMsgdumpTaskResponse>(await DoRequestAsync("2.0", "sofa.mq.msgdump.task.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: schema metadata 分页查询
         * Summary: schema metadata 分页查询
         */
        public ListSchemaAdminmetadataResponse ListSchemaAdminmetadata(ListSchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSchemaAdminmetadataEx(request, headers, runtime);
        }

        /**
         * Description: schema metadata 分页查询
         * Summary: schema metadata 分页查询
         */
        public async Task<ListSchemaAdminmetadataResponse> ListSchemaAdminmetadataAsync(ListSchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSchemaAdminmetadataExAsync(request, headers, runtime);
        }

        /**
         * Description: schema metadata 分页查询
         * Summary: schema metadata 分页查询
         */
        public ListSchemaAdminmetadataResponse ListSchemaAdminmetadataEx(ListSchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSchemaAdminmetadataResponse>(DoRequest("2.0", "sofa.mq.schema.adminmetadata.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: schema metadata 分页查询
         * Summary: schema metadata 分页查询
         */
        public async Task<ListSchemaAdminmetadataResponse> ListSchemaAdminmetadataExAsync(ListSchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSchemaAdminmetadataResponse>(await DoRequestAsync("2.0", "sofa.mq.schema.adminmetadata.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增schema的metadata信息
         * Summary: 新增schema的metadata信息
         */
        public CreateSchemaAdminmetadataResponse CreateSchemaAdminmetadata(CreateSchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSchemaAdminmetadataEx(request, headers, runtime);
        }

        /**
         * Description: 新增schema的metadata信息
         * Summary: 新增schema的metadata信息
         */
        public async Task<CreateSchemaAdminmetadataResponse> CreateSchemaAdminmetadataAsync(CreateSchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSchemaAdminmetadataExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增schema的metadata信息
         * Summary: 新增schema的metadata信息
         */
        public CreateSchemaAdminmetadataResponse CreateSchemaAdminmetadataEx(CreateSchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSchemaAdminmetadataResponse>(DoRequest("2.0", "sofa.mq.schema.adminmetadata.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增schema的metadata信息
         * Summary: 新增schema的metadata信息
         */
        public async Task<CreateSchemaAdminmetadataResponse> CreateSchemaAdminmetadataExAsync(CreateSchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSchemaAdminmetadataResponse>(await DoRequestAsync("2.0", "sofa.mq.schema.adminmetadata.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新schema元信息
         * Summary: 更新schema元信息
         */
        public UpdateSchemaAdminmetadataResponse UpdateSchemaAdminmetadata(UpdateSchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSchemaAdminmetadataEx(request, headers, runtime);
        }

        /**
         * Description: 更新schema元信息
         * Summary: 更新schema元信息
         */
        public async Task<UpdateSchemaAdminmetadataResponse> UpdateSchemaAdminmetadataAsync(UpdateSchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSchemaAdminmetadataExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新schema元信息
         * Summary: 更新schema元信息
         */
        public UpdateSchemaAdminmetadataResponse UpdateSchemaAdminmetadataEx(UpdateSchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSchemaAdminmetadataResponse>(DoRequest("2.0", "sofa.mq.schema.adminmetadata.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新schema元信息
         * Summary: 更新schema元信息
         */
        public async Task<UpdateSchemaAdminmetadataResponse> UpdateSchemaAdminmetadataExAsync(UpdateSchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSchemaAdminmetadataResponse>(await DoRequestAsync("2.0", "sofa.mq.schema.adminmetadata.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除schema元信息
         * Summary: 删除schema元信息
         */
        public DeleteSchemaAdminmetadataResponse DeleteSchemaAdminmetadata(DeleteSchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSchemaAdminmetadataEx(request, headers, runtime);
        }

        /**
         * Description: 删除schema元信息
         * Summary: 删除schema元信息
         */
        public async Task<DeleteSchemaAdminmetadataResponse> DeleteSchemaAdminmetadataAsync(DeleteSchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSchemaAdminmetadataExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除schema元信息
         * Summary: 删除schema元信息
         */
        public DeleteSchemaAdminmetadataResponse DeleteSchemaAdminmetadataEx(DeleteSchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSchemaAdminmetadataResponse>(DoRequest("2.0", "sofa.mq.schema.adminmetadata.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除schema元信息
         * Summary: 删除schema元信息
         */
        public async Task<DeleteSchemaAdminmetadataResponse> DeleteSchemaAdminmetadataExAsync(DeleteSchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSchemaAdminmetadataResponse>(await DoRequestAsync("2.0", "sofa.mq.schema.adminmetadata.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查看schema详情
         * Summary: 分页查看schema详情
         */
        public ListSchemaAdmindetailResponse ListSchemaAdmindetail(ListSchemaAdmindetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSchemaAdmindetailEx(request, headers, runtime);
        }

        /**
         * Description: 分页查看schema详情
         * Summary: 分页查看schema详情
         */
        public async Task<ListSchemaAdmindetailResponse> ListSchemaAdmindetailAsync(ListSchemaAdmindetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSchemaAdmindetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查看schema详情
         * Summary: 分页查看schema详情
         */
        public ListSchemaAdmindetailResponse ListSchemaAdmindetailEx(ListSchemaAdmindetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSchemaAdmindetailResponse>(DoRequest("2.0", "sofa.mq.schema.admindetail.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查看schema详情
         * Summary: 分页查看schema详情
         */
        public async Task<ListSchemaAdmindetailResponse> ListSchemaAdmindetailExAsync(ListSchemaAdmindetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSchemaAdmindetailResponse>(await DoRequestAsync("2.0", "sofa.mq.schema.admindetail.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增schema详情
         * Summary: 新增schema详情
         */
        public CreateSchemaAdmindetailResponse CreateSchemaAdmindetail(CreateSchemaAdmindetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSchemaAdmindetailEx(request, headers, runtime);
        }

        /**
         * Description: 新增schema详情
         * Summary: 新增schema详情
         */
        public async Task<CreateSchemaAdmindetailResponse> CreateSchemaAdmindetailAsync(CreateSchemaAdmindetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSchemaAdmindetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增schema详情
         * Summary: 新增schema详情
         */
        public CreateSchemaAdmindetailResponse CreateSchemaAdmindetailEx(CreateSchemaAdmindetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSchemaAdmindetailResponse>(DoRequest("2.0", "sofa.mq.schema.admindetail.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增schema详情
         * Summary: 新增schema详情
         */
        public async Task<CreateSchemaAdmindetailResponse> CreateSchemaAdmindetailExAsync(CreateSchemaAdmindetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSchemaAdmindetailResponse>(await DoRequestAsync("2.0", "sofa.mq.schema.admindetail.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: admindetail
         * Summary: 删除schema详情
         */
        public DeleteSchemaAdmindetailResponse DeleteSchemaAdmindetail(DeleteSchemaAdmindetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSchemaAdmindetailEx(request, headers, runtime);
        }

        /**
         * Description: admindetail
         * Summary: 删除schema详情
         */
        public async Task<DeleteSchemaAdmindetailResponse> DeleteSchemaAdmindetailAsync(DeleteSchemaAdmindetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSchemaAdmindetailExAsync(request, headers, runtime);
        }

        /**
         * Description: admindetail
         * Summary: 删除schema详情
         */
        public DeleteSchemaAdmindetailResponse DeleteSchemaAdmindetailEx(DeleteSchemaAdmindetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSchemaAdmindetailResponse>(DoRequest("2.0", "sofa.mq.schema.admindetail.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: admindetail
         * Summary: 删除schema详情
         */
        public async Task<DeleteSchemaAdmindetailResponse> DeleteSchemaAdmindetailExAsync(DeleteSchemaAdmindetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSchemaAdmindetailResponse>(await DoRequestAsync("2.0", "sofa.mq.schema.admindetail.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询endpoint
         * Summary: 查询endpoint
         */
        public QuerySofamqEndpointResponse QuerySofamqEndpoint(QuerySofamqEndpointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqEndpointEx(request, headers, runtime);
        }

        /**
         * Description: 查询endpoint
         * Summary: 查询endpoint
         */
        public async Task<QuerySofamqEndpointResponse> QuerySofamqEndpointAsync(QuerySofamqEndpointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqEndpointExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询endpoint
         * Summary: 查询endpoint
         */
        public QuerySofamqEndpointResponse QuerySofamqEndpointEx(QuerySofamqEndpointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqEndpointResponse>(DoRequest("2.0", "sofa.mq.sofamq.endpoint.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询endpoint
         * Summary: 查询endpoint
         */
        public async Task<QuerySofamqEndpointResponse> QuerySofamqEndpointExAsync(QuerySofamqEndpointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqEndpointResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.endpoint.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按照条件查看schema元数据
         * Summary: 按照条件查看schema元数据
         */
        public QuerySchemaAdminmetadataResponse QuerySchemaAdminmetadata(QuerySchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySchemaAdminmetadataEx(request, headers, runtime);
        }

        /**
         * Description: 按照条件查看schema元数据
         * Summary: 按照条件查看schema元数据
         */
        public async Task<QuerySchemaAdminmetadataResponse> QuerySchemaAdminmetadataAsync(QuerySchemaAdminmetadataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySchemaAdminmetadataExAsync(request, headers, runtime);
        }

        /**
         * Description: 按照条件查看schema元数据
         * Summary: 按照条件查看schema元数据
         */
        public QuerySchemaAdminmetadataResponse QuerySchemaAdminmetadataEx(QuerySchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySchemaAdminmetadataResponse>(DoRequest("2.0", "sofa.mq.schema.adminmetadata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按照条件查看schema元数据
         * Summary: 按照条件查看schema元数据
         */
        public async Task<QuerySchemaAdminmetadataResponse> QuerySchemaAdminmetadataExAsync(QuerySchemaAdminmetadataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySchemaAdminmetadataResponse>(await DoRequestAsync("2.0", "sofa.mq.schema.adminmetadata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询schema的config配置
         * Summary: 查询schema的config配置
         */
        public QuerySchemaAdminconfigResponse QuerySchemaAdminconfig(QuerySchemaAdminconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySchemaAdminconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询schema的config配置
         * Summary: 查询schema的config配置
         */
        public async Task<QuerySchemaAdminconfigResponse> QuerySchemaAdminconfigAsync(QuerySchemaAdminconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySchemaAdminconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询schema的config配置
         * Summary: 查询schema的config配置
         */
        public QuerySchemaAdminconfigResponse QuerySchemaAdminconfigEx(QuerySchemaAdminconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySchemaAdminconfigResponse>(DoRequest("2.0", "sofa.mq.schema.adminconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询schema的config配置
         * Summary: 查询schema的config配置
         */
        public async Task<QuerySchemaAdminconfigResponse> QuerySchemaAdminconfigExAsync(QuerySchemaAdminconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySchemaAdminconfigResponse>(await DoRequestAsync("2.0", "sofa.mq.schema.adminconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询console页面的链接
         * Summary: 查询console页面的链接
         */
        public QuerySofamqLinkResponse QuerySofamqLink(QuerySofamqLinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqLinkEx(request, headers, runtime);
        }

        /**
         * Description: 查询console页面的链接
         * Summary: 查询console页面的链接
         */
        public async Task<QuerySofamqLinkResponse> QuerySofamqLinkAsync(QuerySofamqLinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqLinkExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询console页面的链接
         * Summary: 查询console页面的链接
         */
        public QuerySofamqLinkResponse QuerySofamqLinkEx(QuerySofamqLinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqLinkResponse>(DoRequest("2.0", "sofa.mq.sofamq.link.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询console页面的链接
         * Summary: 查询console页面的链接
         */
        public async Task<QuerySofamqLinkResponse> QuerySofamqLinkExAsync(QuerySofamqLinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqLinkResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.link.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全部topic名字
         * Summary: 查询全部topic名字
         */
        public QuerySofamqTopicnameResponse QuerySofamqTopicname(QuerySofamqTopicnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqTopicnameEx(request, headers, runtime);
        }

        /**
         * Description: 查询全部topic名字
         * Summary: 查询全部topic名字
         */
        public async Task<QuerySofamqTopicnameResponse> QuerySofamqTopicnameAsync(QuerySofamqTopicnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqTopicnameExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询全部topic名字
         * Summary: 查询全部topic名字
         */
        public QuerySofamqTopicnameResponse QuerySofamqTopicnameEx(QuerySofamqTopicnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTopicnameResponse>(DoRequest("2.0", "sofa.mq.sofamq.topicname.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全部topic名字
         * Summary: 查询全部topic名字
         */
        public async Task<QuerySofamqTopicnameResponse> QuerySofamqTopicnameExAsync(QuerySofamqTopicnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqTopicnameResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.topicname.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全部group名字
         * Summary: 查询全部group名字
         */
        public QuerySofamqGroupnameResponse QuerySofamqGroupname(QuerySofamqGroupnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqGroupnameEx(request, headers, runtime);
        }

        /**
         * Description: 查询全部group名字
         * Summary: 查询全部group名字
         */
        public async Task<QuerySofamqGroupnameResponse> QuerySofamqGroupnameAsync(QuerySofamqGroupnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqGroupnameExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询全部group名字
         * Summary: 查询全部group名字
         */
        public QuerySofamqGroupnameResponse QuerySofamqGroupnameEx(QuerySofamqGroupnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqGroupnameResponse>(DoRequest("2.0", "sofa.mq.sofamq.groupname.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询全部group名字
         * Summary: 查询全部group名字
         */
        public async Task<QuerySofamqGroupnameResponse> QuerySofamqGroupnameExAsync(QuerySofamqGroupnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqGroupnameResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.groupname.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员创建topic
         * Summary: 管理员创建topic
         */
        public CreateSofamqAdmintopicResponse CreateSofamqAdmintopic(CreateSofamqAdmintopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqAdmintopicEx(request, headers, runtime);
        }

        /**
         * Description: 管理员创建topic
         * Summary: 管理员创建topic
         */
        public async Task<CreateSofamqAdmintopicResponse> CreateSofamqAdmintopicAsync(CreateSofamqAdmintopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqAdmintopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 管理员创建topic
         * Summary: 管理员创建topic
         */
        public CreateSofamqAdmintopicResponse CreateSofamqAdmintopicEx(CreateSofamqAdmintopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqAdmintopicResponse>(DoRequest("2.0", "sofa.mq.sofamq.admintopic.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员创建topic
         * Summary: 管理员创建topic
         */
        public async Task<CreateSofamqAdmintopicResponse> CreateSofamqAdmintopicExAsync(CreateSofamqAdmintopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqAdmintopicResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.admintopic.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员创建group
         * Summary: 管理员创建group
         */
        public CreateSofamqAdmingroupResponse CreateSofamqAdmingroup(CreateSofamqAdmingroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqAdmingroupEx(request, headers, runtime);
        }

        /**
         * Description: 管理员创建group
         * Summary: 管理员创建group
         */
        public async Task<CreateSofamqAdmingroupResponse> CreateSofamqAdmingroupAsync(CreateSofamqAdmingroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqAdmingroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 管理员创建group
         * Summary: 管理员创建group
         */
        public CreateSofamqAdmingroupResponse CreateSofamqAdmingroupEx(CreateSofamqAdmingroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqAdmingroupResponse>(DoRequest("2.0", "sofa.mq.sofamq.admingroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员创建group
         * Summary: 管理员创建group
         */
        public async Task<CreateSofamqAdmingroupResponse> CreateSofamqAdmingroupExAsync(CreateSofamqAdmingroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqAdmingroupResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.admingroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询特定的连接任务详情
         * Summary: 查询特定的连接任务详情
         */
        public QuerySofamqConnectorResponse QuerySofamqConnector(QuerySofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectorEx(request, headers, runtime);
        }

        /**
         * Description: 查询特定的连接任务详情
         * Summary: 查询特定的连接任务详情
         */
        public async Task<QuerySofamqConnectorResponse> QuerySofamqConnectorAsync(QuerySofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询特定的连接任务详情
         * Summary: 查询特定的连接任务详情
         */
        public QuerySofamqConnectorResponse QuerySofamqConnectorEx(QuerySofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorResponse>(DoRequest("2.0", "sofa.mq.sofamq.connector.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询特定的连接任务详情
         * Summary: 查询特定的连接任务详情
         */
        public async Task<QuerySofamqConnectorResponse> QuerySofamqConnectorExAsync(QuerySofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connector.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增一个连接器任务
         * Summary: 新增一个连接器任务
         */
        public CreateSofamqConnectorResponse CreateSofamqConnector(CreateSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqConnectorEx(request, headers, runtime);
        }

        /**
         * Description: 新增一个连接器任务
         * Summary: 新增一个连接器任务
         */
        public async Task<CreateSofamqConnectorResponse> CreateSofamqConnectorAsync(CreateSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqConnectorExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增一个连接器任务
         * Summary: 新增一个连接器任务
         */
        public CreateSofamqConnectorResponse CreateSofamqConnectorEx(CreateSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqConnectorResponse>(DoRequest("2.0", "sofa.mq.sofamq.connector.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增一个连接器任务
         * Summary: 新增一个连接器任务
         */
        public async Task<CreateSofamqConnectorResponse> CreateSofamqConnectorExAsync(CreateSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqConnectorResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connector.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有的连接任务，允许携带查询条件
         * Summary: 查询连接任务
         */
        public ListSofamqConnectorResponse ListSofamqConnector(ListSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqConnectorEx(request, headers, runtime);
        }

        /**
         * Description: 查询所有的连接任务，允许携带查询条件
         * Summary: 查询连接任务
         */
        public async Task<ListSofamqConnectorResponse> ListSofamqConnectorAsync(ListSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqConnectorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询所有的连接任务，允许携带查询条件
         * Summary: 查询连接任务
         */
        public ListSofamqConnectorResponse ListSofamqConnectorEx(ListSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConnectorResponse>(DoRequest("2.0", "sofa.mq.sofamq.connector.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有的连接任务，允许携带查询条件
         * Summary: 查询连接任务
         */
        public async Task<ListSofamqConnectorResponse> ListSofamqConnectorExAsync(ListSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConnectorResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connector.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个连接器任务
         * Summary: 删除一个连接器任务
         */
        public DeleteSofamqConnectorResponse DeleteSofamqConnector(DeleteSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqConnectorEx(request, headers, runtime);
        }

        /**
         * Description: 删除一个连接器任务
         * Summary: 删除一个连接器任务
         */
        public async Task<DeleteSofamqConnectorResponse> DeleteSofamqConnectorAsync(DeleteSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqConnectorExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除一个连接器任务
         * Summary: 删除一个连接器任务
         */
        public DeleteSofamqConnectorResponse DeleteSofamqConnectorEx(DeleteSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqConnectorResponse>(DoRequest("2.0", "sofa.mq.sofamq.connector.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个连接器任务
         * Summary: 删除一个连接器任务
         */
        public async Task<DeleteSofamqConnectorResponse> DeleteSofamqConnectorExAsync(DeleteSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqConnectorResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connector.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动一个连接器的任务
         * Summary: 启动一个连接器的任务
         */
        public EnableSofamqConnectorResponse EnableSofamqConnector(EnableSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSofamqConnectorEx(request, headers, runtime);
        }

        /**
         * Description: 启动一个连接器的任务
         * Summary: 启动一个连接器的任务
         */
        public async Task<EnableSofamqConnectorResponse> EnableSofamqConnectorAsync(EnableSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSofamqConnectorExAsync(request, headers, runtime);
        }

        /**
         * Description: 启动一个连接器的任务
         * Summary: 启动一个连接器的任务
         */
        public EnableSofamqConnectorResponse EnableSofamqConnectorEx(EnableSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSofamqConnectorResponse>(DoRequest("2.0", "sofa.mq.sofamq.connector.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动一个连接器的任务
         * Summary: 启动一个连接器的任务
         */
        public async Task<EnableSofamqConnectorResponse> EnableSofamqConnectorExAsync(EnableSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSofamqConnectorResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connector.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止一个连接器任务
         * Summary: 停止一个连接器任务
         */
        public DisableSofamqConnectorResponse DisableSofamqConnector(DisableSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableSofamqConnectorEx(request, headers, runtime);
        }

        /**
         * Description: 停止一个连接器任务
         * Summary: 停止一个连接器任务
         */
        public async Task<DisableSofamqConnectorResponse> DisableSofamqConnectorAsync(DisableSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableSofamqConnectorExAsync(request, headers, runtime);
        }

        /**
         * Description: 停止一个连接器任务
         * Summary: 停止一个连接器任务
         */
        public DisableSofamqConnectorResponse DisableSofamqConnectorEx(DisableSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSofamqConnectorResponse>(DoRequest("2.0", "sofa.mq.sofamq.connector.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止一个连接器任务
         * Summary: 停止一个连接器任务
         */
        public async Task<DisableSofamqConnectorResponse> DisableSofamqConnectorExAsync(DisableSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSofamqConnectorResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connector.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出所有任务的调度类型
         * Summary: 列出所有任务的调度类型
         */
        public ListSofamqConnectorscheuletypeResponse ListSofamqConnectorscheuletype(ListSofamqConnectorscheuletypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqConnectorscheuletypeEx(request, headers, runtime);
        }

        /**
         * Description: 列出所有任务的调度类型
         * Summary: 列出所有任务的调度类型
         */
        public async Task<ListSofamqConnectorscheuletypeResponse> ListSofamqConnectorscheuletypeAsync(ListSofamqConnectorscheuletypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqConnectorscheuletypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出所有任务的调度类型
         * Summary: 列出所有任务的调度类型
         */
        public ListSofamqConnectorscheuletypeResponse ListSofamqConnectorscheuletypeEx(ListSofamqConnectorscheuletypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConnectorscheuletypeResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorscheuletype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出所有任务的调度类型
         * Summary: 列出所有任务的调度类型
         */
        public async Task<ListSofamqConnectorscheuletypeResponse> ListSofamqConnectorscheuletypeExAsync(ListSofamqConnectorscheuletypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConnectorscheuletypeResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorscheuletype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出所有支持的来源类型
         * Summary: 列出所有支持的来源类型
         */
        public ListSofamqConnectorsourcetypeResponse ListSofamqConnectorsourcetype(ListSofamqConnectorsourcetypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqConnectorsourcetypeEx(request, headers, runtime);
        }

        /**
         * Description: 列出所有支持的来源类型
         * Summary: 列出所有支持的来源类型
         */
        public async Task<ListSofamqConnectorsourcetypeResponse> ListSofamqConnectorsourcetypeAsync(ListSofamqConnectorsourcetypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqConnectorsourcetypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出所有支持的来源类型
         * Summary: 列出所有支持的来源类型
         */
        public ListSofamqConnectorsourcetypeResponse ListSofamqConnectorsourcetypeEx(ListSofamqConnectorsourcetypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConnectorsourcetypeResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorsourcetype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出所有支持的来源类型
         * Summary: 列出所有支持的来源类型
         */
        public async Task<ListSofamqConnectorsourcetypeResponse> ListSofamqConnectorsourcetypeExAsync(ListSofamqConnectorsourcetypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConnectorsourcetypeResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorsourcetype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出所有支持的去向类型
         * Summary: 列出所有支持的去向类型
         */
        public ListSofamqConnectorsinktypeResponse ListSofamqConnectorsinktype(ListSofamqConnectorsinktypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqConnectorsinktypeEx(request, headers, runtime);
        }

        /**
         * Description: 列出所有支持的去向类型
         * Summary: 列出所有支持的去向类型
         */
        public async Task<ListSofamqConnectorsinktypeResponse> ListSofamqConnectorsinktypeAsync(ListSofamqConnectorsinktypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqConnectorsinktypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出所有支持的去向类型
         * Summary: 列出所有支持的去向类型
         */
        public ListSofamqConnectorsinktypeResponse ListSofamqConnectorsinktypeEx(ListSofamqConnectorsinktypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConnectorsinktypeResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorsinktype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出所有支持的去向类型
         * Summary: 列出所有支持的去向类型
         */
        public async Task<ListSofamqConnectorsinktypeResponse> ListSofamqConnectorsinktypeExAsync(ListSofamqConnectorsinktypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqConnectorsinktypeResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorsinktype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
         * Summary: 加载不同数据来源和去向对应的前端配置
         */
        public LoadSofamqConnectorconfigsResponse LoadSofamqConnectorconfigs(LoadSofamqConnectorconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LoadSofamqConnectorconfigsEx(request, headers, runtime);
        }

        /**
         * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
         * Summary: 加载不同数据来源和去向对应的前端配置
         */
        public async Task<LoadSofamqConnectorconfigsResponse> LoadSofamqConnectorconfigsAsync(LoadSofamqConnectorconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LoadSofamqConnectorconfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
         * Summary: 加载不同数据来源和去向对应的前端配置
         */
        public LoadSofamqConnectorconfigsResponse LoadSofamqConnectorconfigsEx(LoadSofamqConnectorconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadSofamqConnectorconfigsResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorconfigs.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
         * Summary: 加载不同数据来源和去向对应的前端配置
         */
        public async Task<LoadSofamqConnectorconfigsResponse> LoadSofamqConnectorconfigsExAsync(LoadSofamqConnectorconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadSofamqConnectorconfigsResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorconfigs.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: connect按照时间段返回当前任务的执行记录
         * Summary: connect执行记录查询
         */
        public QuerySofamqConnectordateResponse QuerySofamqConnectordate(QuerySofamqConnectordateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectordateEx(request, headers, runtime);
        }

        /**
         * Description: connect按照时间段返回当前任务的执行记录
         * Summary: connect执行记录查询
         */
        public async Task<QuerySofamqConnectordateResponse> QuerySofamqConnectordateAsync(QuerySofamqConnectordateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectordateExAsync(request, headers, runtime);
        }

        /**
         * Description: connect按照时间段返回当前任务的执行记录
         * Summary: connect执行记录查询
         */
        public QuerySofamqConnectordateResponse QuerySofamqConnectordateEx(QuerySofamqConnectordateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectordateResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectordate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: connect按照时间段返回当前任务的执行记录
         * Summary: connect执行记录查询
         */
        public async Task<QuerySofamqConnectordateResponse> QuerySofamqConnectordateExAsync(QuerySofamqConnectordateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectordateResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectordate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据执行时间返回当前的任务记录执行详情
         * Summary: 根据执行时间返回当前的任务记录执行详情
         */
        public QuerySofamqConnectorrecordResponse QuerySofamqConnectorrecord(QuerySofamqConnectorrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectorrecordEx(request, headers, runtime);
        }

        /**
         * Description: 根据执行时间返回当前的任务记录执行详情
         * Summary: 根据执行时间返回当前的任务记录执行详情
         */
        public async Task<QuerySofamqConnectorrecordResponse> QuerySofamqConnectorrecordAsync(QuerySofamqConnectorrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectorrecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据执行时间返回当前的任务记录执行详情
         * Summary: 根据执行时间返回当前的任务记录执行详情
         */
        public QuerySofamqConnectorrecordResponse QuerySofamqConnectorrecordEx(QuerySofamqConnectorrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorrecordResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorrecord.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据执行时间返回当前的任务记录执行详情
         * Summary: 根据执行时间返回当前的任务记录执行详情
         */
        public async Task<QuerySofamqConnectorrecordResponse> QuerySofamqConnectorrecordExAsync(QuerySofamqConnectorrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorrecordResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorrecord.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 加载数据源对应的结构信息
         * Summary: 加载数据源对应的结构信息
         */
        public LoadSofamqConnectorsourceResponse LoadSofamqConnectorsource(LoadSofamqConnectorsourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LoadSofamqConnectorsourceEx(request, headers, runtime);
        }

        /**
         * Description: 加载数据源对应的结构信息
         * Summary: 加载数据源对应的结构信息
         */
        public async Task<LoadSofamqConnectorsourceResponse> LoadSofamqConnectorsourceAsync(LoadSofamqConnectorsourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LoadSofamqConnectorsourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 加载数据源对应的结构信息
         * Summary: 加载数据源对应的结构信息
         */
        public LoadSofamqConnectorsourceResponse LoadSofamqConnectorsourceEx(LoadSofamqConnectorsourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadSofamqConnectorsourceResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorsource.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 加载数据源对应的结构信息
         * Summary: 加载数据源对应的结构信息
         */
        public async Task<LoadSofamqConnectorsourceResponse> LoadSofamqConnectorsourceExAsync(LoadSofamqConnectorsourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadSofamqConnectorsourceResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorsource.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询队列详情信息以及分页信息
         * Summary: 查询队列详情
         */
        public QueryMeshQueueResponse QueryMeshQueue(QueryMeshQueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshQueueEx(request, headers, runtime);
        }

        /**
         * Description: 查询队列详情信息以及分页信息
         * Summary: 查询队列详情
         */
        public async Task<QueryMeshQueueResponse> QueryMeshQueueAsync(QueryMeshQueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshQueueExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询队列详情信息以及分页信息
         * Summary: 查询队列详情
         */
        public QueryMeshQueueResponse QueryMeshQueueEx(QueryMeshQueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueueResponse>(DoRequest("2.0", "sofa.mq.mesh.queue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询队列详情信息以及分页信息
         * Summary: 查询队列详情
         */
        public async Task<QueryMeshQueueResponse> QueryMeshQueueExAsync(QueryMeshQueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueueResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增队列
         * Summary: 新增队列
         */
        public ImportMeshQueueResponse ImportMeshQueue(ImportMeshQueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportMeshQueueEx(request, headers, runtime);
        }

        /**
         * Description: 新增队列
         * Summary: 新增队列
         */
        public async Task<ImportMeshQueueResponse> ImportMeshQueueAsync(ImportMeshQueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportMeshQueueExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增队列
         * Summary: 新增队列
         */
        public ImportMeshQueueResponse ImportMeshQueueEx(ImportMeshQueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMeshQueueResponse>(DoRequest("2.0", "sofa.mq.mesh.queue.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增队列
         * Summary: 新增队列
         */
        public async Task<ImportMeshQueueResponse> ImportMeshQueueExAsync(ImportMeshQueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMeshQueueResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queue.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除队列
         * Summary: 删除队列
         */
        public DeleteMeshQueueResponse DeleteMeshQueue(DeleteMeshQueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMeshQueueEx(request, headers, runtime);
        }

        /**
         * Description: 删除队列
         * Summary: 删除队列
         */
        public async Task<DeleteMeshQueueResponse> DeleteMeshQueueAsync(DeleteMeshQueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMeshQueueExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除队列
         * Summary: 删除队列
         */
        public DeleteMeshQueueResponse DeleteMeshQueueEx(DeleteMeshQueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueueResponse>(DoRequest("2.0", "sofa.mq.mesh.queue.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除队列
         * Summary: 删除队列
         */
        public async Task<DeleteMeshQueueResponse> DeleteMeshQueueExAsync(DeleteMeshQueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueueResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queue.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新队列
         * Summary: 更新队列
         */
        public UpdateMeshQueueResponse UpdateMeshQueue(UpdateMeshQueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeshQueueEx(request, headers, runtime);
        }

        /**
         * Description: 更新队列
         * Summary: 更新队列
         */
        public async Task<UpdateMeshQueueResponse> UpdateMeshQueueAsync(UpdateMeshQueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeshQueueExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新队列
         * Summary: 更新队列
         */
        public UpdateMeshQueueResponse UpdateMeshQueueEx(UpdateMeshQueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueueResponse>(DoRequest("2.0", "sofa.mq.mesh.queue.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新队列
         * Summary: 更新队列
         */
        public async Task<UpdateMeshQueueResponse> UpdateMeshQueueExAsync(UpdateMeshQueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueueResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queue.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询限流规则
         * Summary: 查询限流规则
         */
        public QueryMeshQueuelimitrulesResponse QueryMeshQueuelimitrules(QueryMeshQueuelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshQueuelimitrulesEx(request, headers, runtime);
        }

        /**
         * Description: 查询限流规则
         * Summary: 查询限流规则
         */
        public async Task<QueryMeshQueuelimitrulesResponse> QueryMeshQueuelimitrulesAsync(QueryMeshQueuelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshQueuelimitrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询限流规则
         * Summary: 查询限流规则
         */
        public QueryMeshQueuelimitrulesResponse QueryMeshQueuelimitrulesEx(QueryMeshQueuelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuelimitrulesResponse>(DoRequest("2.0", "sofa.mq.mesh.queuelimitrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询限流规则
         * Summary: 查询限流规则
         */
        public async Task<QueryMeshQueuelimitrulesResponse> QueryMeshQueuelimitrulesExAsync(QueryMeshQueuelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuelimitrulesResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuelimitrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改一个连接器任务
         * Summary: 修改一个连接器任务
         */
        public UpdateSofamqConnectorResponse UpdateSofamqConnector(UpdateSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqConnectorEx(request, headers, runtime);
        }

        /**
         * Description: 修改一个连接器任务
         * Summary: 修改一个连接器任务
         */
        public async Task<UpdateSofamqConnectorResponse> UpdateSofamqConnectorAsync(UpdateSofamqConnectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqConnectorExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改一个连接器任务
         * Summary: 修改一个连接器任务
         */
        public UpdateSofamqConnectorResponse UpdateSofamqConnectorEx(UpdateSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqConnectorResponse>(DoRequest("2.0", "sofa.mq.sofamq.connector.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改一个连接器任务
         * Summary: 修改一个连接器任务
         */
        public async Task<UpdateSofamqConnectorResponse> UpdateSofamqConnectorExAsync(UpdateSofamqConnectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqConnectorResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connector.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询限流规则域值
         * Summary: 查询限流规则域值
         */
        public QueryMeshQueuelimitvalueResponse QueryMeshQueuelimitvalue(QueryMeshQueuelimitvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshQueuelimitvalueEx(request, headers, runtime);
        }

        /**
         * Description: 查询限流规则域值
         * Summary: 查询限流规则域值
         */
        public async Task<QueryMeshQueuelimitvalueResponse> QueryMeshQueuelimitvalueAsync(QueryMeshQueuelimitvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshQueuelimitvalueExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询限流规则域值
         * Summary: 查询限流规则域值
         */
        public QueryMeshQueuelimitvalueResponse QueryMeshQueuelimitvalueEx(QueryMeshQueuelimitvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuelimitvalueResponse>(DoRequest("2.0", "sofa.mq.mesh.queuelimitvalue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询限流规则域值
         * Summary: 查询限流规则域值
         */
        public async Task<QueryMeshQueuelimitvalueResponse> QueryMeshQueuelimitvalueExAsync(QueryMeshQueuelimitvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuelimitvalueResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuelimitvalue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新限流规则
         * Summary: 更新限流规则
         */
        public UpdateMeshQueuelimitResponse UpdateMeshQueuelimit(UpdateMeshQueuelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeshQueuelimitEx(request, headers, runtime);
        }

        /**
         * Description: 更新限流规则
         * Summary: 更新限流规则
         */
        public async Task<UpdateMeshQueuelimitResponse> UpdateMeshQueuelimitAsync(UpdateMeshQueuelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeshQueuelimitExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新限流规则
         * Summary: 更新限流规则
         */
        public UpdateMeshQueuelimitResponse UpdateMeshQueuelimitEx(UpdateMeshQueuelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueuelimitResponse>(DoRequest("2.0", "sofa.mq.mesh.queuelimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新限流规则
         * Summary: 更新限流规则
         */
        public async Task<UpdateMeshQueuelimitResponse> UpdateMeshQueuelimitExAsync(UpdateMeshQueuelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueuelimitResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuelimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加限流规则
         * Summary: 添加限流规则
         */
        public ImportMeshQueuelimitResponse ImportMeshQueuelimit(ImportMeshQueuelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportMeshQueuelimitEx(request, headers, runtime);
        }

        /**
         * Description: 添加限流规则
         * Summary: 添加限流规则
         */
        public async Task<ImportMeshQueuelimitResponse> ImportMeshQueuelimitAsync(ImportMeshQueuelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportMeshQueuelimitExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加限流规则
         * Summary: 添加限流规则
         */
        public ImportMeshQueuelimitResponse ImportMeshQueuelimitEx(ImportMeshQueuelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMeshQueuelimitResponse>(DoRequest("2.0", "sofa.mq.mesh.queuelimit.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加限流规则
         * Summary: 添加限流规则
         */
        public async Task<ImportMeshQueuelimitResponse> ImportMeshQueuelimitExAsync(ImportMeshQueuelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMeshQueuelimitResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuelimit.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public DeleteMeshQueuelimitResponse DeleteMeshQueuelimit(DeleteMeshQueuelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMeshQueuelimitEx(request, headers, runtime);
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public async Task<DeleteMeshQueuelimitResponse> DeleteMeshQueuelimitAsync(DeleteMeshQueuelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMeshQueuelimitExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public DeleteMeshQueuelimitResponse DeleteMeshQueuelimitEx(DeleteMeshQueuelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueuelimitResponse>(DoRequest("2.0", "sofa.mq.mesh.queuelimit.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public async Task<DeleteMeshQueuelimitResponse> DeleteMeshQueuelimitExAsync(DeleteMeshQueuelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueuelimitResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuelimit.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流域值
         * Summary: 删除规则的限流域值
         */
        public DeleteMeshQueuelimitvalueResponse DeleteMeshQueuelimitvalue(DeleteMeshQueuelimitvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMeshQueuelimitvalueEx(request, headers, runtime);
        }

        /**
         * Description: 删除限流域值
         * Summary: 删除规则的限流域值
         */
        public async Task<DeleteMeshQueuelimitvalueResponse> DeleteMeshQueuelimitvalueAsync(DeleteMeshQueuelimitvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMeshQueuelimitvalueExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除限流域值
         * Summary: 删除规则的限流域值
         */
        public DeleteMeshQueuelimitvalueResponse DeleteMeshQueuelimitvalueEx(DeleteMeshQueuelimitvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueuelimitvalueResponse>(DoRequest("2.0", "sofa.mq.mesh.queuelimitvalue.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流域值
         * Summary: 删除规则的限流域值
         */
        public async Task<DeleteMeshQueuelimitvalueResponse> DeleteMeshQueuelimitvalueExAsync(DeleteMeshQueuelimitvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueuelimitvalueResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuelimitvalue.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由规则
         * Summary: 查询路由规则
         */
        public QueryMeshQueuerouterulesResponse QueryMeshQueuerouterules(QueryMeshQueuerouterulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshQueuerouterulesEx(request, headers, runtime);
        }

        /**
         * Description: 查询路由规则
         * Summary: 查询路由规则
         */
        public async Task<QueryMeshQueuerouterulesResponse> QueryMeshQueuerouterulesAsync(QueryMeshQueuerouterulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshQueuerouterulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询路由规则
         * Summary: 查询路由规则
         */
        public QueryMeshQueuerouterulesResponse QueryMeshQueuerouterulesEx(QueryMeshQueuerouterulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuerouterulesResponse>(DoRequest("2.0", "sofa.mq.mesh.queuerouterules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由规则
         * Summary: 查询路由规则
         */
        public async Task<QueryMeshQueuerouterulesResponse> QueryMeshQueuerouterulesExAsync(QueryMeshQueuerouterulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuerouterulesResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuerouterules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由版本
         * Summary: 查询路由版本
         */
        public QueryMeshQueuerouteeditionResponse QueryMeshQueuerouteedition(QueryMeshQueuerouteeditionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshQueuerouteeditionEx(request, headers, runtime);
        }

        /**
         * Description: 查询路由版本
         * Summary: 查询路由版本
         */
        public async Task<QueryMeshQueuerouteeditionResponse> QueryMeshQueuerouteeditionAsync(QueryMeshQueuerouteeditionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshQueuerouteeditionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询路由版本
         * Summary: 查询路由版本
         */
        public QueryMeshQueuerouteeditionResponse QueryMeshQueuerouteeditionEx(QueryMeshQueuerouteeditionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuerouteeditionResponse>(DoRequest("2.0", "sofa.mq.mesh.queuerouteedition.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由版本
         * Summary: 查询路由版本
         */
        public async Task<QueryMeshQueuerouteeditionResponse> QueryMeshQueuerouteeditionExAsync(QueryMeshQueuerouteeditionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuerouteeditionResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuerouteedition.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加路由规则
         * Summary: 添加路由规则
         */
        public ImportMeshQueuerouteResponse ImportMeshQueueroute(ImportMeshQueuerouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportMeshQueuerouteEx(request, headers, runtime);
        }

        /**
         * Description: 添加路由规则
         * Summary: 添加路由规则
         */
        public async Task<ImportMeshQueuerouteResponse> ImportMeshQueuerouteAsync(ImportMeshQueuerouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportMeshQueuerouteExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加路由规则
         * Summary: 添加路由规则
         */
        public ImportMeshQueuerouteResponse ImportMeshQueuerouteEx(ImportMeshQueuerouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMeshQueuerouteResponse>(DoRequest("2.0", "sofa.mq.mesh.queueroute.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加路由规则
         * Summary: 添加路由规则
         */
        public async Task<ImportMeshQueuerouteResponse> ImportMeshQueuerouteExAsync(ImportMeshQueuerouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMeshQueuerouteResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queueroute.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新路由规则
         * Summary: 更新路由规则
         */
        public UpdateMeshQueuerouteResponse UpdateMeshQueueroute(UpdateMeshQueuerouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeshQueuerouteEx(request, headers, runtime);
        }

        /**
         * Description: 更新路由规则
         * Summary: 更新路由规则
         */
        public async Task<UpdateMeshQueuerouteResponse> UpdateMeshQueuerouteAsync(UpdateMeshQueuerouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeshQueuerouteExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新路由规则
         * Summary: 更新路由规则
         */
        public UpdateMeshQueuerouteResponse UpdateMeshQueuerouteEx(UpdateMeshQueuerouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueuerouteResponse>(DoRequest("2.0", "sofa.mq.mesh.queueroute.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新路由规则
         * Summary: 更新路由规则
         */
        public async Task<UpdateMeshQueuerouteResponse> UpdateMeshQueuerouteExAsync(UpdateMeshQueuerouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueuerouteResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queueroute.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public DeleteMeshQueuerouteResponse DeleteMeshQueueroute(DeleteMeshQueuerouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMeshQueuerouteEx(request, headers, runtime);
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public async Task<DeleteMeshQueuerouteResponse> DeleteMeshQueuerouteAsync(DeleteMeshQueuerouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMeshQueuerouteExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public DeleteMeshQueuerouteResponse DeleteMeshQueuerouteEx(DeleteMeshQueuerouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueuerouteResponse>(DoRequest("2.0", "sofa.mq.mesh.queueroute.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public async Task<DeleteMeshQueuerouteResponse> DeleteMeshQueuerouteExAsync(DeleteMeshQueuerouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueuerouteResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queueroute.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除路由版本
         * Summary: 删除路由版本
         */
        public DeleteMeshQueuerouteeditionResponse DeleteMeshQueuerouteedition(DeleteMeshQueuerouteeditionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMeshQueuerouteeditionEx(request, headers, runtime);
        }

        /**
         * Description: 删除路由版本
         * Summary: 删除路由版本
         */
        public async Task<DeleteMeshQueuerouteeditionResponse> DeleteMeshQueuerouteeditionAsync(DeleteMeshQueuerouteeditionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMeshQueuerouteeditionExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除路由版本
         * Summary: 删除路由版本
         */
        public DeleteMeshQueuerouteeditionResponse DeleteMeshQueuerouteeditionEx(DeleteMeshQueuerouteeditionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueuerouteeditionResponse>(DoRequest("2.0", "sofa.mq.mesh.queuerouteedition.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除路由版本
         * Summary: 删除路由版本
         */
        public async Task<DeleteMeshQueuerouteeditionResponse> DeleteMeshQueuerouteeditionExAsync(DeleteMeshQueuerouteeditionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshQueuerouteeditionResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuerouteedition.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由规则应用
         * Summary: 查询路由规则应用
         */
        public QueryMeshQueuerouteappResponse QueryMeshQueuerouteapp(QueryMeshQueuerouteappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshQueuerouteappEx(request, headers, runtime);
        }

        /**
         * Description: 查询路由规则应用
         * Summary: 查询路由规则应用
         */
        public async Task<QueryMeshQueuerouteappResponse> QueryMeshQueuerouteappAsync(QueryMeshQueuerouteappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshQueuerouteappExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询路由规则应用
         * Summary: 查询路由规则应用
         */
        public QueryMeshQueuerouteappResponse QueryMeshQueuerouteappEx(QueryMeshQueuerouteappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuerouteappResponse>(DoRequest("2.0", "sofa.mq.mesh.queuerouteapp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由规则应用
         * Summary: 查询路由规则应用
         */
        public async Task<QueryMeshQueuerouteappResponse> QueryMeshQueuerouteappExAsync(QueryMeshQueuerouteappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuerouteappResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuerouteapp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据队列id查询队列详情
         * Summary: 根据队列id查询队列详情
         */
        public QueryMeshQueuebyidResponse QueryMeshQueuebyid(QueryMeshQueuebyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshQueuebyidEx(request, headers, runtime);
        }

        /**
         * Description: 根据队列id查询队列详情
         * Summary: 根据队列id查询队列详情
         */
        public async Task<QueryMeshQueuebyidResponse> QueryMeshQueuebyidAsync(QueryMeshQueuebyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshQueuebyidExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据队列id查询队列详情
         * Summary: 根据队列id查询队列详情
         */
        public QueryMeshQueuebyidResponse QueryMeshQueuebyidEx(QueryMeshQueuebyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuebyidResponse>(DoRequest("2.0", "sofa.mq.mesh.queuebyid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据队列id查询队列详情
         * Summary: 根据队列id查询队列详情
         */
        public async Task<QueryMeshQueuebyidResponse> QueryMeshQueuebyidExAsync(QueryMeshQueuebyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshQueuebyidResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuebyid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: zhaolei
         * Summary: 更新限流状态
         */
        public UpdateMeshQueuelimitstatusResponse UpdateMeshQueuelimitstatus(UpdateMeshQueuelimitstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeshQueuelimitstatusEx(request, headers, runtime);
        }

        /**
         * Description: zhaolei
         * Summary: 更新限流状态
         */
        public async Task<UpdateMeshQueuelimitstatusResponse> UpdateMeshQueuelimitstatusAsync(UpdateMeshQueuelimitstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeshQueuelimitstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: zhaolei
         * Summary: 更新限流状态
         */
        public UpdateMeshQueuelimitstatusResponse UpdateMeshQueuelimitstatusEx(UpdateMeshQueuelimitstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueuelimitstatusResponse>(DoRequest("2.0", "sofa.mq.mesh.queuelimitstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: zhaolei
         * Summary: 更新限流状态
         */
        public async Task<UpdateMeshQueuelimitstatusResponse> UpdateMeshQueuelimitstatusExAsync(UpdateMeshQueuelimitstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueuelimitstatusResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuelimitstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新路由规则状态
         * Summary: 更新路由规则状态
         */
        public UpdateMeshQueueroutestatusResponse UpdateMeshQueueroutestatus(UpdateMeshQueueroutestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeshQueueroutestatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新路由规则状态
         * Summary: 更新路由规则状态
         */
        public async Task<UpdateMeshQueueroutestatusResponse> UpdateMeshQueueroutestatusAsync(UpdateMeshQueueroutestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeshQueueroutestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新路由规则状态
         * Summary: 更新路由规则状态
         */
        public UpdateMeshQueueroutestatusResponse UpdateMeshQueueroutestatusEx(UpdateMeshQueueroutestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueueroutestatusResponse>(DoRequest("2.0", "sofa.mq.mesh.queueroutestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新路由规则状态
         * Summary: 更新路由规则状态
         */
        public async Task<UpdateMeshQueueroutestatusResponse> UpdateMeshQueueroutestatusExAsync(UpdateMeshQueueroutestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueueroutestatusResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queueroutestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员更新topic
         * Summary: 管理员更新topic
         */
        public UpdateSofamqAdmintopicResponse UpdateSofamqAdmintopic(UpdateSofamqAdmintopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqAdmintopicEx(request, headers, runtime);
        }

        /**
         * Description: 管理员更新topic
         * Summary: 管理员更新topic
         */
        public async Task<UpdateSofamqAdmintopicResponse> UpdateSofamqAdmintopicAsync(UpdateSofamqAdmintopicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqAdmintopicExAsync(request, headers, runtime);
        }

        /**
         * Description: 管理员更新topic
         * Summary: 管理员更新topic
         */
        public UpdateSofamqAdmintopicResponse UpdateSofamqAdmintopicEx(UpdateSofamqAdmintopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqAdmintopicResponse>(DoRequest("2.0", "sofa.mq.sofamq.admintopic.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员更新topic
         * Summary: 管理员更新topic
         */
        public async Task<UpdateSofamqAdmintopicResponse> UpdateSofamqAdmintopicExAsync(UpdateSofamqAdmintopicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqAdmintopicResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.admintopic.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员更新group
         * Summary: 管理员更新group
         */
        public UpdateSofamqAdmingroupResponse UpdateSofamqAdmingroup(UpdateSofamqAdmingroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqAdmingroupEx(request, headers, runtime);
        }

        /**
         * Description: 管理员更新group
         * Summary: 管理员更新group
         */
        public async Task<UpdateSofamqAdmingroupResponse> UpdateSofamqAdmingroupAsync(UpdateSofamqAdmingroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqAdmingroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 管理员更新group
         * Summary: 管理员更新group
         */
        public UpdateSofamqAdmingroupResponse UpdateSofamqAdmingroupEx(UpdateSofamqAdmingroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqAdmingroupResponse>(DoRequest("2.0", "sofa.mq.sofamq.admingroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 管理员更新group
         * Summary: 管理员更新group
         */
        public async Task<UpdateSofamqAdmingroupResponse> UpdateSofamqAdmingroupExAsync(UpdateSofamqAdmingroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqAdmingroupResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.admingroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动触发一次任务的执行
         * Summary: 手动触发一次任务的执行
         */
        public RunSofamqConnectorjobResponse RunSofamqConnectorjob(RunSofamqConnectorjobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunSofamqConnectorjobEx(request, headers, runtime);
        }

        /**
         * Description: 手动触发一次任务的执行
         * Summary: 手动触发一次任务的执行
         */
        public async Task<RunSofamqConnectorjobResponse> RunSofamqConnectorjobAsync(RunSofamqConnectorjobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunSofamqConnectorjobExAsync(request, headers, runtime);
        }

        /**
         * Description: 手动触发一次任务的执行
         * Summary: 手动触发一次任务的执行
         */
        public RunSofamqConnectorjobResponse RunSofamqConnectorjobEx(RunSofamqConnectorjobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunSofamqConnectorjobResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorjob.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动触发一次任务的执行
         * Summary: 手动触发一次任务的执行
         */
        public async Task<RunSofamqConnectorjobResponse> RunSofamqConnectorjobExAsync(RunSofamqConnectorjobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunSofamqConnectorjobResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorjob.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 暂停一个Connector任务
         * Summary: 暂停一个任务
         */
        public PauseSofamqConnectorjobResponse PauseSofamqConnectorjob(PauseSofamqConnectorjobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PauseSofamqConnectorjobEx(request, headers, runtime);
        }

        /**
         * Description: 暂停一个Connector任务
         * Summary: 暂停一个任务
         */
        public async Task<PauseSofamqConnectorjobResponse> PauseSofamqConnectorjobAsync(PauseSofamqConnectorjobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PauseSofamqConnectorjobExAsync(request, headers, runtime);
        }

        /**
         * Description: 暂停一个Connector任务
         * Summary: 暂停一个任务
         */
        public PauseSofamqConnectorjobResponse PauseSofamqConnectorjobEx(PauseSofamqConnectorjobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseSofamqConnectorjobResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorjob.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 暂停一个Connector任务
         * Summary: 暂停一个任务
         */
        public async Task<PauseSofamqConnectorjobResponse> PauseSofamqConnectorjobExAsync(PauseSofamqConnectorjobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseSofamqConnectorjobResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorjob.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复一个暂停的任务
         * Summary: 恢复一个暂停的任务
         */
        public ResumeSofamqConnectorjobResponse ResumeSofamqConnectorjob(ResumeSofamqConnectorjobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResumeSofamqConnectorjobEx(request, headers, runtime);
        }

        /**
         * Description: 恢复一个暂停的任务
         * Summary: 恢复一个暂停的任务
         */
        public async Task<ResumeSofamqConnectorjobResponse> ResumeSofamqConnectorjobAsync(ResumeSofamqConnectorjobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResumeSofamqConnectorjobExAsync(request, headers, runtime);
        }

        /**
         * Description: 恢复一个暂停的任务
         * Summary: 恢复一个暂停的任务
         */
        public ResumeSofamqConnectorjobResponse ResumeSofamqConnectorjobEx(ResumeSofamqConnectorjobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeSofamqConnectorjobResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorjob.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复一个暂停的任务
         * Summary: 恢复一个暂停的任务
         */
        public async Task<ResumeSofamqConnectorjobResponse> ResumeSofamqConnectorjobExAsync(ResumeSofamqConnectorjobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeSofamqConnectorjobResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorjob.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认覆盖路有规则状态
         * Summary: 确认覆盖路由规则状态
         */
        public UpdateMeshQueueroutestatusconfirmResponse UpdateMeshQueueroutestatusconfirm(UpdateMeshQueueroutestatusconfirmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeshQueueroutestatusconfirmEx(request, headers, runtime);
        }

        /**
         * Description: 确认覆盖路有规则状态
         * Summary: 确认覆盖路由规则状态
         */
        public async Task<UpdateMeshQueueroutestatusconfirmResponse> UpdateMeshQueueroutestatusconfirmAsync(UpdateMeshQueueroutestatusconfirmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeshQueueroutestatusconfirmExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认覆盖路有规则状态
         * Summary: 确认覆盖路由规则状态
         */
        public UpdateMeshQueueroutestatusconfirmResponse UpdateMeshQueueroutestatusconfirmEx(UpdateMeshQueueroutestatusconfirmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueueroutestatusconfirmResponse>(DoRequest("2.0", "sofa.mq.mesh.queueroutestatusconfirm.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认覆盖路有规则状态
         * Summary: 确认覆盖路由规则状态
         */
        public async Task<UpdateMeshQueueroutestatusconfirmResponse> UpdateMeshQueueroutestatusconfirmExAsync(UpdateMeshQueueroutestatusconfirmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueueroutestatusconfirmResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queueroutestatusconfirm.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更细限流状态
         * Summary: 更新限流状态
         */
        public UpdateMeshQueuelimitstatusconfirmResponse UpdateMeshQueuelimitstatusconfirm(UpdateMeshQueuelimitstatusconfirmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeshQueuelimitstatusconfirmEx(request, headers, runtime);
        }

        /**
         * Description: 更细限流状态
         * Summary: 更新限流状态
         */
        public async Task<UpdateMeshQueuelimitstatusconfirmResponse> UpdateMeshQueuelimitstatusconfirmAsync(UpdateMeshQueuelimitstatusconfirmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeshQueuelimitstatusconfirmExAsync(request, headers, runtime);
        }

        /**
         * Description: 更细限流状态
         * Summary: 更新限流状态
         */
        public UpdateMeshQueuelimitstatusconfirmResponse UpdateMeshQueuelimitstatusconfirmEx(UpdateMeshQueuelimitstatusconfirmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueuelimitstatusconfirmResponse>(DoRequest("2.0", "sofa.mq.mesh.queuelimitstatusconfirm.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更细限流状态
         * Summary: 更新限流状态
         */
        public async Task<UpdateMeshQueuelimitstatusconfirmResponse> UpdateMeshQueuelimitstatusconfirmExAsync(UpdateMeshQueuelimitstatusconfirmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshQueuelimitstatusconfirmResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.queuelimitstatusconfirm.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日切检查，验证是否可以完成日切
         * Summary: 日切检查
         */
        public ExecSofamqDailycheckResponse ExecSofamqDailycheck(ExecSofamqDailycheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecSofamqDailycheckEx(request, headers, runtime);
        }

        /**
         * Description: 日切检查，验证是否可以完成日切
         * Summary: 日切检查
         */
        public async Task<ExecSofamqDailycheckResponse> ExecSofamqDailycheckAsync(ExecSofamqDailycheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecSofamqDailycheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 日切检查，验证是否可以完成日切
         * Summary: 日切检查
         */
        public ExecSofamqDailycheckResponse ExecSofamqDailycheckEx(ExecSofamqDailycheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSofamqDailycheckResponse>(DoRequest("2.0", "sofa.mq.sofamq.dailycheck.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 日切检查，验证是否可以完成日切
         * Summary: 日切检查
         */
        public async Task<ExecSofamqDailycheckResponse> ExecSofamqDailycheckExAsync(ExecSofamqDailycheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecSofamqDailycheckResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.dailycheck.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用详情
         * Summary: 查询应用详情
         */
        public QueryMeshApplicationResponse QueryMeshApplication(QueryMeshApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用详情
         * Summary: 查询应用详情
         */
        public async Task<QueryMeshApplicationResponse> QueryMeshApplicationAsync(QueryMeshApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用详情
         * Summary: 查询应用详情
         */
        public QueryMeshApplicationResponse QueryMeshApplicationEx(QueryMeshApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationResponse>(DoRequest("2.0", "sofa.mq.mesh.application.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用详情
         * Summary: 查询应用详情
         */
        public async Task<QueryMeshApplicationResponse> QueryMeshApplicationExAsync(QueryMeshApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.application.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增应用
         * Summary: 新增应用
         */
        public ImportMeshApplicationResponse ImportMeshApplication(ImportMeshApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportMeshApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 新增应用
         * Summary: 新增应用
         */
        public async Task<ImportMeshApplicationResponse> ImportMeshApplicationAsync(ImportMeshApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportMeshApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增应用
         * Summary: 新增应用
         */
        public ImportMeshApplicationResponse ImportMeshApplicationEx(ImportMeshApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMeshApplicationResponse>(DoRequest("2.0", "sofa.mq.mesh.application.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增应用
         * Summary: 新增应用
         */
        public async Task<ImportMeshApplicationResponse> ImportMeshApplicationExAsync(ImportMeshApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportMeshApplicationResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.application.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用
         * Summary: 更新应用
         */
        public UpdateMeshApplicationResponse UpdateMeshApplication(UpdateMeshApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeshApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 更新应用
         * Summary: 更新应用
         */
        public async Task<UpdateMeshApplicationResponse> UpdateMeshApplicationAsync(UpdateMeshApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeshApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新应用
         * Summary: 更新应用
         */
        public UpdateMeshApplicationResponse UpdateMeshApplicationEx(UpdateMeshApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshApplicationResponse>(DoRequest("2.0", "sofa.mq.mesh.application.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用
         * Summary: 更新应用
         */
        public async Task<UpdateMeshApplicationResponse> UpdateMeshApplicationExAsync(UpdateMeshApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeshApplicationResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.application.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用
         * Summary: 删除应用
         */
        public DeleteMeshApplicationResponse DeleteMeshApplication(DeleteMeshApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMeshApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 删除应用
         * Summary: 删除应用
         */
        public async Task<DeleteMeshApplicationResponse> DeleteMeshApplicationAsync(DeleteMeshApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMeshApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除应用
         * Summary: 删除应用
         */
        public DeleteMeshApplicationResponse DeleteMeshApplicationEx(DeleteMeshApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshApplicationResponse>(DoRequest("2.0", "sofa.mq.mesh.application.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用
         * Summary: 删除应用
         */
        public async Task<DeleteMeshApplicationResponse> DeleteMeshApplicationExAsync(DeleteMeshApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMeshApplicationResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.application.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务id
         * Summary: 查询应用服务id
         */
        public QueryMeshApplicationserviceResponse QueryMeshApplicationservice(QueryMeshApplicationserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshApplicationserviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务id
         * Summary: 查询应用服务id
         */
        public async Task<QueryMeshApplicationserviceResponse> QueryMeshApplicationserviceAsync(QueryMeshApplicationserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshApplicationserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务id
         * Summary: 查询应用服务id
         */
        public QueryMeshApplicationserviceResponse QueryMeshApplicationserviceEx(QueryMeshApplicationserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationserviceResponse>(DoRequest("2.0", "sofa.mq.mesh.applicationservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务id
         * Summary: 查询应用服务id
         */
        public async Task<QueryMeshApplicationserviceResponse> QueryMeshApplicationserviceExAsync(QueryMeshApplicationserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationserviceResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.applicationservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用名查应用详情
         * Summary: 根据应用名查应用详情
         */
        public QueryMeshApplicationbynameResponse QueryMeshApplicationbyname(QueryMeshApplicationbynameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshApplicationbynameEx(request, headers, runtime);
        }

        /**
         * Description: 根据应用名查应用详情
         * Summary: 根据应用名查应用详情
         */
        public async Task<QueryMeshApplicationbynameResponse> QueryMeshApplicationbynameAsync(QueryMeshApplicationbynameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshApplicationbynameExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据应用名查应用详情
         * Summary: 根据应用名查应用详情
         */
        public QueryMeshApplicationbynameResponse QueryMeshApplicationbynameEx(QueryMeshApplicationbynameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationbynameResponse>(DoRequest("2.0", "sofa.mq.mesh.applicationbyname.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用名查应用详情
         * Summary: 根据应用名查应用详情
         */
        public async Task<QueryMeshApplicationbynameResponse> QueryMeshApplicationbynameExAsync(QueryMeshApplicationbynameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationbynameResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.applicationbyname.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询队列的应用列表
         * Summary: 查询队列的应用列表
         */
        public QueryMeshApplicationlistResponse QueryMeshApplicationlist(QueryMeshApplicationlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshApplicationlistEx(request, headers, runtime);
        }

        /**
         * Description: 查询队列的应用列表
         * Summary: 查询队列的应用列表
         */
        public async Task<QueryMeshApplicationlistResponse> QueryMeshApplicationlistAsync(QueryMeshApplicationlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshApplicationlistExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询队列的应用列表
         * Summary: 查询队列的应用列表
         */
        public QueryMeshApplicationlistResponse QueryMeshApplicationlistEx(QueryMeshApplicationlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationlistResponse>(DoRequest("2.0", "sofa.mq.mesh.applicationlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询队列的应用列表
         * Summary: 查询队列的应用列表
         */
        public async Task<QueryMeshApplicationlistResponse> QueryMeshApplicationlistExAsync(QueryMeshApplicationlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationlistResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.applicationlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用队列下拉框
         * Summary: 应用队列下拉框
         */
        public QueryMeshApplicationqueuenamesResponse QueryMeshApplicationqueuenames(QueryMeshApplicationqueuenamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshApplicationqueuenamesEx(request, headers, runtime);
        }

        /**
         * Description: 应用队列下拉框
         * Summary: 应用队列下拉框
         */
        public async Task<QueryMeshApplicationqueuenamesResponse> QueryMeshApplicationqueuenamesAsync(QueryMeshApplicationqueuenamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshApplicationqueuenamesExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用队列下拉框
         * Summary: 应用队列下拉框
         */
        public QueryMeshApplicationqueuenamesResponse QueryMeshApplicationqueuenamesEx(QueryMeshApplicationqueuenamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationqueuenamesResponse>(DoRequest("2.0", "sofa.mq.mesh.applicationqueuenames.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用队列下拉框
         * Summary: 应用队列下拉框
         */
        public async Task<QueryMeshApplicationqueuenamesResponse> QueryMeshApplicationqueuenamesExAsync(QueryMeshApplicationqueuenamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshApplicationqueuenamesResponse>(await DoRequestAsync("2.0", "sofa.mq.mesh.applicationqueuenames.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 暂停一个Connector执行计划
         * Summary: 暂停一个Connector执行计划
         */
        public PauseSofamqConnectorplanResponse PauseSofamqConnectorplan(PauseSofamqConnectorplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PauseSofamqConnectorplanEx(request, headers, runtime);
        }

        /**
         * Description: 暂停一个Connector执行计划
         * Summary: 暂停一个Connector执行计划
         */
        public async Task<PauseSofamqConnectorplanResponse> PauseSofamqConnectorplanAsync(PauseSofamqConnectorplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PauseSofamqConnectorplanExAsync(request, headers, runtime);
        }

        /**
         * Description: 暂停一个Connector执行计划
         * Summary: 暂停一个Connector执行计划
         */
        public PauseSofamqConnectorplanResponse PauseSofamqConnectorplanEx(PauseSofamqConnectorplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseSofamqConnectorplanResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorplan.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 暂停一个Connector执行计划
         * Summary: 暂停一个Connector执行计划
         */
        public async Task<PauseSofamqConnectorplanResponse> PauseSofamqConnectorplanExAsync(PauseSofamqConnectorplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseSofamqConnectorplanResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorplan.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复一个connector执行计划
         * Summary: 恢复一个connector执行计划
         */
        public ResumeSofamqConnectorplanResponse ResumeSofamqConnectorplan(ResumeSofamqConnectorplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResumeSofamqConnectorplanEx(request, headers, runtime);
        }

        /**
         * Description: 恢复一个connector执行计划
         * Summary: 恢复一个connector执行计划
         */
        public async Task<ResumeSofamqConnectorplanResponse> ResumeSofamqConnectorplanAsync(ResumeSofamqConnectorplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResumeSofamqConnectorplanExAsync(request, headers, runtime);
        }

        /**
         * Description: 恢复一个connector执行计划
         * Summary: 恢复一个connector执行计划
         */
        public ResumeSofamqConnectorplanResponse ResumeSofamqConnectorplanEx(ResumeSofamqConnectorplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeSofamqConnectorplanResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorplan.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复一个connector执行计划
         * Summary: 恢复一个connector执行计划
         */
        public async Task<ResumeSofamqConnectorplanResponse> ResumeSofamqConnectorplanExAsync(ResumeSofamqConnectorplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeSofamqConnectorplanResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorplan.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
         * Summary: 重启一个已有的connector任务计划
         */
        public RetrySofamqConnectorplanResponse RetrySofamqConnectorplan(RetrySofamqConnectorplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetrySofamqConnectorplanEx(request, headers, runtime);
        }

        /**
         * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
         * Summary: 重启一个已有的connector任务计划
         */
        public async Task<RetrySofamqConnectorplanResponse> RetrySofamqConnectorplanAsync(RetrySofamqConnectorplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetrySofamqConnectorplanExAsync(request, headers, runtime);
        }

        /**
         * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
         * Summary: 重启一个已有的connector任务计划
         */
        public RetrySofamqConnectorplanResponse RetrySofamqConnectorplanEx(RetrySofamqConnectorplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetrySofamqConnectorplanResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorplan.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
         * Summary: 重启一个已有的connector任务计划
         */
        public async Task<RetrySofamqConnectorplanResponse> RetrySofamqConnectorplanExAsync(RetrySofamqConnectorplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetrySofamqConnectorplanResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorplan.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
         * Summary: 查询任务不同来源去向的配置
         */
        public QuerySofamqConnectorconfigsResponse QuerySofamqConnectorconfigs(QuerySofamqConnectorconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectorconfigsEx(request, headers, runtime);
        }

        /**
         * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
         * Summary: 查询任务不同来源去向的配置
         */
        public async Task<QuerySofamqConnectorconfigsResponse> QuerySofamqConnectorconfigsAsync(QuerySofamqConnectorconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectorconfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
         * Summary: 查询任务不同来源去向的配置
         */
        public QuerySofamqConnectorconfigsResponse QuerySofamqConnectorconfigsEx(QuerySofamqConnectorconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorconfigsResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorconfigs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
         * Summary: 查询任务不同来源去向的配置
         */
        public async Task<QuerySofamqConnectorconfigsResponse> QuerySofamqConnectorconfigsExAsync(QuerySofamqConnectorconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorconfigsResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorconfigs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建消费限流规则
         * Summary: 创建消费限流规则
         */
        public CreateSofamqConsumelimiterResponse CreateSofamqConsumelimiter(CreateSofamqConsumelimiterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqConsumelimiterEx(request, headers, runtime);
        }

        /**
         * Description: 创建消费限流规则
         * Summary: 创建消费限流规则
         */
        public async Task<CreateSofamqConsumelimiterResponse> CreateSofamqConsumelimiterAsync(CreateSofamqConsumelimiterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqConsumelimiterExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建消费限流规则
         * Summary: 创建消费限流规则
         */
        public CreateSofamqConsumelimiterResponse CreateSofamqConsumelimiterEx(CreateSofamqConsumelimiterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqConsumelimiterResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumelimiter.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建消费限流规则
         * Summary: 创建消费限流规则
         */
        public async Task<CreateSofamqConsumelimiterResponse> CreateSofamqConsumelimiterExAsync(CreateSofamqConsumelimiterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqConsumelimiterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumelimiter.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新限流规则
         * Summary: 更新限流规则
         */
        public UpdateSofamqConsumelimiterResponse UpdateSofamqConsumelimiter(UpdateSofamqConsumelimiterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqConsumelimiterEx(request, headers, runtime);
        }

        /**
         * Description: 更新限流规则
         * Summary: 更新限流规则
         */
        public async Task<UpdateSofamqConsumelimiterResponse> UpdateSofamqConsumelimiterAsync(UpdateSofamqConsumelimiterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqConsumelimiterExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新限流规则
         * Summary: 更新限流规则
         */
        public UpdateSofamqConsumelimiterResponse UpdateSofamqConsumelimiterEx(UpdateSofamqConsumelimiterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqConsumelimiterResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumelimiter.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新限流规则
         * Summary: 更新限流规则
         */
        public async Task<UpdateSofamqConsumelimiterResponse> UpdateSofamqConsumelimiterExAsync(UpdateSofamqConsumelimiterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqConsumelimiterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumelimiter.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public DeleteSofamqConsumelimiterResponse DeleteSofamqConsumelimiter(DeleteSofamqConsumelimiterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqConsumelimiterEx(request, headers, runtime);
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public async Task<DeleteSofamqConsumelimiterResponse> DeleteSofamqConsumelimiterAsync(DeleteSofamqConsumelimiterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqConsumelimiterExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public DeleteSofamqConsumelimiterResponse DeleteSofamqConsumelimiterEx(DeleteSofamqConsumelimiterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqConsumelimiterResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumelimiter.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public async Task<DeleteSofamqConsumelimiterResponse> DeleteSofamqConsumelimiterExAsync(DeleteSofamqConsumelimiterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqConsumelimiterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumelimiter.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取限流规则
         * Summary: 限流规则获取
         */
        public QuerySofamqConsumelimiterResponse QuerySofamqConsumelimiter(QuerySofamqConsumelimiterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConsumelimiterEx(request, headers, runtime);
        }

        /**
         * Description: 获取限流规则
         * Summary: 限流规则获取
         */
        public async Task<QuerySofamqConsumelimiterResponse> QuerySofamqConsumelimiterAsync(QuerySofamqConsumelimiterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConsumelimiterExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取限流规则
         * Summary: 限流规则获取
         */
        public QuerySofamqConsumelimiterResponse QuerySofamqConsumelimiterEx(QuerySofamqConsumelimiterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumelimiterResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumelimiter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取限流规则
         * Summary: 限流规则获取
         */
        public async Task<QuerySofamqConsumelimiterResponse> QuerySofamqConsumelimiterExAsync(QuerySofamqConsumelimiterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumelimiterResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumelimiter.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dd
         * Summary: dd
         */
        public GetDmsInstanceResponse GetDmsInstance(GetDmsInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDmsInstanceEx(request, headers, runtime);
        }

        /**
         * Description: dd
         * Summary: dd
         */
        public async Task<GetDmsInstanceResponse> GetDmsInstanceAsync(GetDmsInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDmsInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: dd
         * Summary: dd
         */
        public GetDmsInstanceResponse GetDmsInstanceEx(GetDmsInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDmsInstanceResponse>(DoRequest("2.0", "sofa.mq.dms.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: dd
         * Summary: dd
         */
        public async Task<GetDmsInstanceResponse> GetDmsInstanceExAsync(GetDmsInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDmsInstanceResponse>(await DoRequestAsync("2.0", "sofa.mq.dms.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询标签
         * Summary: 查询标签
         */
        public QuerySofamqLabelsResponse QuerySofamqLabels(QuerySofamqLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqLabelsEx(request, headers, runtime);
        }

        /**
         * Description: 查询标签
         * Summary: 查询标签
         */
        public async Task<QuerySofamqLabelsResponse> QuerySofamqLabelsAsync(QuerySofamqLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqLabelsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询标签
         * Summary: 查询标签
         */
        public QuerySofamqLabelsResponse QuerySofamqLabelsEx(QuerySofamqLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqLabelsResponse>(DoRequest("2.0", "sofa.mq.sofamq.labels.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询标签
         * Summary: 查询标签
         */
        public async Task<QuerySofamqLabelsResponse> QuerySofamqLabelsExAsync(QuerySofamqLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqLabelsResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.labels.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: SofaMQ 创建资源标签
         * Summary: 创建资源标签
         */
        public CreateSofamqLabelsResponse CreateSofamqLabels(CreateSofamqLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqLabelsEx(request, headers, runtime);
        }

        /**
         * Description: SofaMQ 创建资源标签
         * Summary: 创建资源标签
         */
        public async Task<CreateSofamqLabelsResponse> CreateSofamqLabelsAsync(CreateSofamqLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqLabelsExAsync(request, headers, runtime);
        }

        /**
         * Description: SofaMQ 创建资源标签
         * Summary: 创建资源标签
         */
        public CreateSofamqLabelsResponse CreateSofamqLabelsEx(CreateSofamqLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqLabelsResponse>(DoRequest("2.0", "sofa.mq.sofamq.labels.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: SofaMQ 创建资源标签
         * Summary: 创建资源标签
         */
        public async Task<CreateSofamqLabelsResponse> CreateSofamqLabelsExAsync(CreateSofamqLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqLabelsResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.labels.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除资源标签
         * Summary: 删除资源标签
         */
        public DeleteSofamqLabelsResponse DeleteSofamqLabels(DeleteSofamqLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqLabelsEx(request, headers, runtime);
        }

        /**
         * Description: 删除资源标签
         * Summary: 删除资源标签
         */
        public async Task<DeleteSofamqLabelsResponse> DeleteSofamqLabelsAsync(DeleteSofamqLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqLabelsExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除资源标签
         * Summary: 删除资源标签
         */
        public DeleteSofamqLabelsResponse DeleteSofamqLabelsEx(DeleteSofamqLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqLabelsResponse>(DoRequest("2.0", "sofa.mq.sofamq.labels.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除资源标签
         * Summary: 删除资源标签
         */
        public async Task<DeleteSofamqLabelsResponse> DeleteSofamqLabelsExAsync(DeleteSofamqLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqLabelsResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.labels.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定Topic的Schema列表
         * Summary: 获取Topic的Schema列表
         */
        public ListSofamqSchemaResponse ListSofamqSchema(ListSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 获取特定Topic的Schema列表
         * Summary: 获取Topic的Schema列表
         */
        public async Task<ListSofamqSchemaResponse> ListSofamqSchemaAsync(ListSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取特定Topic的Schema列表
         * Summary: 获取Topic的Schema列表
         */
        public ListSofamqSchemaResponse ListSofamqSchemaEx(ListSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqSchemaResponse>(DoRequest("2.0", "sofa.mq.sofamq.schema.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定Topic的Schema列表
         * Summary: 获取Topic的Schema列表
         */
        public async Task<ListSofamqSchemaResponse> ListSofamqSchemaExAsync(ListSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqSchemaResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.schema.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建Topic的Schema
         * Summary: 创建Schema
         */
        public CreateSofamqSchemaResponse CreateSofamqSchema(CreateSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSofamqSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 创建Topic的Schema
         * Summary: 创建Schema
         */
        public async Task<CreateSofamqSchemaResponse> CreateSofamqSchemaAsync(CreateSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSofamqSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建Topic的Schema
         * Summary: 创建Schema
         */
        public CreateSofamqSchemaResponse CreateSofamqSchemaEx(CreateSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqSchemaResponse>(DoRequest("2.0", "sofa.mq.sofamq.schema.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建Topic的Schema
         * Summary: 创建Schema
         */
        public async Task<CreateSofamqSchemaResponse> CreateSofamqSchemaExAsync(CreateSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSofamqSchemaResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.schema.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定Topic特定版本的Schema
         * Summary: 获取Schema详情
         */
        public GetSofamqSchemaResponse GetSofamqSchema(GetSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSofamqSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 获取特定Topic特定版本的Schema
         * Summary: 获取Schema详情
         */
        public async Task<GetSofamqSchemaResponse> GetSofamqSchemaAsync(GetSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSofamqSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取特定Topic特定版本的Schema
         * Summary: 获取Schema详情
         */
        public GetSofamqSchemaResponse GetSofamqSchemaEx(GetSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqSchemaResponse>(DoRequest("2.0", "sofa.mq.sofamq.schema.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取特定Topic特定版本的Schema
         * Summary: 获取Schema详情
         */
        public async Task<GetSofamqSchemaResponse> GetSofamqSchemaExAsync(GetSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSofamqSchemaResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.schema.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据Schema生成对应的POJO代码
         * Summary: 获取schema对应的代码
         */
        public ExportSofamqSchemaResponse ExportSofamqSchema(ExportSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportSofamqSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 根据Schema生成对应的POJO代码
         * Summary: 获取schema对应的代码
         */
        public async Task<ExportSofamqSchemaResponse> ExportSofamqSchemaAsync(ExportSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportSofamqSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据Schema生成对应的POJO代码
         * Summary: 获取schema对应的代码
         */
        public ExportSofamqSchemaResponse ExportSofamqSchemaEx(ExportSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSofamqSchemaResponse>(DoRequest("2.0", "sofa.mq.sofamq.schema.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据Schema生成对应的POJO代码
         * Summary: 获取schema对应的代码
         */
        public async Task<ExportSofamqSchemaResponse> ExportSofamqSchemaExAsync(ExportSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSofamqSchemaResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.schema.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
         * Summary: 更新schema
         */
        public UpdateSofamqSchemaResponse UpdateSofamqSchema(UpdateSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSofamqSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
         * Summary: 更新schema
         */
        public async Task<UpdateSofamqSchemaResponse> UpdateSofamqSchemaAsync(UpdateSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSofamqSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
         * Summary: 更新schema
         */
        public UpdateSofamqSchemaResponse UpdateSofamqSchemaEx(UpdateSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqSchemaResponse>(DoRequest("2.0", "sofa.mq.sofamq.schema.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
         * Summary: 更新schema
         */
        public async Task<UpdateSofamqSchemaResponse> UpdateSofamqSchemaExAsync(UpdateSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSofamqSchemaResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.schema.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
         * Summary: 获取Schema的版本号列表
         */
        public AllSofamqSchemaResponse AllSofamqSchema(AllSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllSofamqSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
         * Summary: 获取Schema的版本号列表
         */
        public async Task<AllSofamqSchemaResponse> AllSofamqSchemaAsync(AllSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllSofamqSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
         * Summary: 获取Schema的版本号列表
         */
        public AllSofamqSchemaResponse AllSofamqSchemaEx(AllSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSofamqSchemaResponse>(DoRequest("2.0", "sofa.mq.sofamq.schema.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
         * Summary: 获取Schema的版本号列表
         */
        public async Task<AllSofamqSchemaResponse> AllSofamqSchemaExAsync(AllSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSofamqSchemaResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.schema.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据Schema解析消息体，查看消息体的详细数据
         * Summary: 查看消息内容
         */
        public ExportSofamqMessageResponse ExportSofamqMessage(ExportSofamqMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportSofamqMessageEx(request, headers, runtime);
        }

        /**
         * Description: 根据Schema解析消息体，查看消息体的详细数据
         * Summary: 查看消息内容
         */
        public async Task<ExportSofamqMessageResponse> ExportSofamqMessageAsync(ExportSofamqMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportSofamqMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据Schema解析消息体，查看消息体的详细数据
         * Summary: 查看消息内容
         */
        public ExportSofamqMessageResponse ExportSofamqMessageEx(ExportSofamqMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSofamqMessageResponse>(DoRequest("2.0", "sofa.mq.sofamq.message.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据Schema解析消息体，查看消息体的详细数据
         * Summary: 查看消息内容
         */
        public async Task<ExportSofamqMessageResponse> ExportSofamqMessageExAsync(ExportSofamqMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSofamqMessageResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.message.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取系统支持的兼容性策略
         * Summary: 获取系统支持的兼容性策略
         */
        public ListSofamqSchemacompatibilityResponse ListSofamqSchemacompatibility(ListSofamqSchemacompatibilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqSchemacompatibilityEx(request, headers, runtime);
        }

        /**
         * Description: 获取系统支持的兼容性策略
         * Summary: 获取系统支持的兼容性策略
         */
        public async Task<ListSofamqSchemacompatibilityResponse> ListSofamqSchemacompatibilityAsync(ListSofamqSchemacompatibilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqSchemacompatibilityExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取系统支持的兼容性策略
         * Summary: 获取系统支持的兼容性策略
         */
        public ListSofamqSchemacompatibilityResponse ListSofamqSchemacompatibilityEx(ListSofamqSchemacompatibilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqSchemacompatibilityResponse>(DoRequest("2.0", "sofa.mq.sofamq.schemacompatibility.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取系统支持的兼容性策略
         * Summary: 获取系统支持的兼容性策略
         */
        public async Task<ListSofamqSchemacompatibilityResponse> ListSofamqSchemacompatibilityExAsync(ListSofamqSchemacompatibilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqSchemacompatibilityResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.schemacompatibility.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取系统支持的序列化方式
         * Summary: 获取系统支持的序列化方式
         */
        public ListSofamqSchemaserializationResponse ListSofamqSchemaserialization(ListSofamqSchemaserializationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqSchemaserializationEx(request, headers, runtime);
        }

        /**
         * Description: 获取系统支持的序列化方式
         * Summary: 获取系统支持的序列化方式
         */
        public async Task<ListSofamqSchemaserializationResponse> ListSofamqSchemaserializationAsync(ListSofamqSchemaserializationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqSchemaserializationExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取系统支持的序列化方式
         * Summary: 获取系统支持的序列化方式
         */
        public ListSofamqSchemaserializationResponse ListSofamqSchemaserializationEx(ListSofamqSchemaserializationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqSchemaserializationResponse>(DoRequest("2.0", "sofa.mq.sofamq.schemaserialization.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取系统支持的序列化方式
         * Summary: 获取系统支持的序列化方式
         */
        public async Task<ListSofamqSchemaserializationResponse> ListSofamqSchemaserializationExAsync(ListSofamqSchemaserializationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqSchemaserializationResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.schemaserialization.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除特定的Schema
         * Summary: 删除特定的Schema
         */
        public DeleteSofamqSchemaResponse DeleteSofamqSchema(DeleteSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 删除特定的Schema
         * Summary: 删除特定的Schema
         */
        public async Task<DeleteSofamqSchemaResponse> DeleteSofamqSchemaAsync(DeleteSofamqSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除特定的Schema
         * Summary: 删除特定的Schema
         */
        public DeleteSofamqSchemaResponse DeleteSofamqSchemaEx(DeleteSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqSchemaResponse>(DoRequest("2.0", "sofa.mq.sofamq.schema.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除特定的Schema
         * Summary: 删除特定的Schema
         */
        public async Task<DeleteSofamqSchemaResponse> DeleteSofamqSchemaExAsync(DeleteSofamqSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqSchemaResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.schema.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Connector工单查询
         * Summary: Connector工单查询
         */
        public QuerySofamqConnectorprocessResponse QuerySofamqConnectorprocess(QuerySofamqConnectorprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectorprocessEx(request, headers, runtime);
        }

        /**
         * Description: Connector工单查询
         * Summary: Connector工单查询
         */
        public async Task<QuerySofamqConnectorprocessResponse> QuerySofamqConnectorprocessAsync(QuerySofamqConnectorprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectorprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: Connector工单查询
         * Summary: Connector工单查询
         */
        public QuerySofamqConnectorprocessResponse QuerySofamqConnectorprocessEx(QuerySofamqConnectorprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorprocessResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Connector工单查询
         * Summary: Connector工单查询
         */
        public async Task<QuerySofamqConnectorprocessResponse> QuerySofamqConnectorprocessExAsync(QuerySofamqConnectorprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorprocessResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Connector任务撤回审批
         * Summary: Connector任务撤回审批
         */
        public CancelSofamqConnectorprocessResponse CancelSofamqConnectorprocess(CancelSofamqConnectorprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelSofamqConnectorprocessEx(request, headers, runtime);
        }

        /**
         * Description: Connector任务撤回审批
         * Summary: Connector任务撤回审批
         */
        public async Task<CancelSofamqConnectorprocessResponse> CancelSofamqConnectorprocessAsync(CancelSofamqConnectorprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelSofamqConnectorprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: Connector任务撤回审批
         * Summary: Connector任务撤回审批
         */
        public CancelSofamqConnectorprocessResponse CancelSofamqConnectorprocessEx(CancelSofamqConnectorprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSofamqConnectorprocessResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorprocess.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Connector任务撤回审批
         * Summary: Connector任务撤回审批
         */
        public async Task<CancelSofamqConnectorprocessResponse> CancelSofamqConnectorprocessExAsync(CancelSofamqConnectorprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSofamqConnectorprocessResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorprocess.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Connector重新提交工单
         * Summary: Connector重新提交工单
         */
        public ResumeSofamqConnectorprocessResponse ResumeSofamqConnectorprocess(ResumeSofamqConnectorprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResumeSofamqConnectorprocessEx(request, headers, runtime);
        }

        /**
         * Description: Connector重新提交工单
         * Summary: Connector重新提交工单
         */
        public async Task<ResumeSofamqConnectorprocessResponse> ResumeSofamqConnectorprocessAsync(ResumeSofamqConnectorprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResumeSofamqConnectorprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: Connector重新提交工单
         * Summary: Connector重新提交工单
         */
        public ResumeSofamqConnectorprocessResponse ResumeSofamqConnectorprocessEx(ResumeSofamqConnectorprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeSofamqConnectorprocessResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorprocess.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Connector重新提交工单
         * Summary: Connector重新提交工单
         */
        public async Task<ResumeSofamqConnectorprocessResponse> ResumeSofamqConnectorprocessExAsync(ResumeSofamqConnectorprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeSofamqConnectorprocessResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorprocess.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验一个connector的操作是否合法
         * Summary: 校验一个connector的操作是否合法
         */
        public VerifySofamqConnectoroperationResponse VerifySofamqConnectoroperation(VerifySofamqConnectoroperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifySofamqConnectoroperationEx(request, headers, runtime);
        }

        /**
         * Description: 校验一个connector的操作是否合法
         * Summary: 校验一个connector的操作是否合法
         */
        public async Task<VerifySofamqConnectoroperationResponse> VerifySofamqConnectoroperationAsync(VerifySofamqConnectoroperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifySofamqConnectoroperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验一个connector的操作是否合法
         * Summary: 校验一个connector的操作是否合法
         */
        public VerifySofamqConnectoroperationResponse VerifySofamqConnectoroperationEx(VerifySofamqConnectoroperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifySofamqConnectoroperationResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectoroperation.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验一个connector的操作是否合法
         * Summary: 校验一个connector的操作是否合法
         */
        public async Task<VerifySofamqConnectoroperationResponse> VerifySofamqConnectoroperationExAsync(VerifySofamqConnectoroperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifySofamqConnectoroperationResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectoroperation.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看操作审计
         * Summary: 查看操作审计
         */
        public ListSofamqAuditorResponse ListSofamqAuditor(ListSofamqAuditorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofamqAuditorEx(request, headers, runtime);
        }

        /**
         * Description: 查看操作审计
         * Summary: 查看操作审计
         */
        public async Task<ListSofamqAuditorResponse> ListSofamqAuditorAsync(ListSofamqAuditorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofamqAuditorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查看操作审计
         * Summary: 查看操作审计
         */
        public ListSofamqAuditorResponse ListSofamqAuditorEx(ListSofamqAuditorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAuditorResponse>(DoRequest("2.0", "sofa.mq.sofamq.auditor.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看操作审计
         * Summary: 查看操作审计
         */
        public async Task<ListSofamqAuditorResponse> ListSofamqAuditorExAsync(ListSofamqAuditorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofamqAuditorResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.auditor.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: connector任务对应的应用名称查询
         * Summary: connector任务对应的应用名称查询
         */
        public QuerySofamqConnectorjobappResponse QuerySofamqConnectorjobapp(QuerySofamqConnectorjobappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectorjobappEx(request, headers, runtime);
        }

        /**
         * Description: connector任务对应的应用名称查询
         * Summary: connector任务对应的应用名称查询
         */
        public async Task<QuerySofamqConnectorjobappResponse> QuerySofamqConnectorjobappAsync(QuerySofamqConnectorjobappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectorjobappExAsync(request, headers, runtime);
        }

        /**
         * Description: connector任务对应的应用名称查询
         * Summary: connector任务对应的应用名称查询
         */
        public QuerySofamqConnectorjobappResponse QuerySofamqConnectorjobappEx(QuerySofamqConnectorjobappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorjobappResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorjobapp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: connector任务对应的应用名称查询
         * Summary: connector任务对应的应用名称查询
         */
        public async Task<QuerySofamqConnectorjobappResponse> QuerySofamqConnectorjobappExAsync(QuerySofamqConnectorjobappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorjobappResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorjobapp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消Connector运行实例
         * Summary: 取消Connector运行实例
         */
        public CancelSofamqConnectorplanResponse CancelSofamqConnectorplan(CancelSofamqConnectorplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelSofamqConnectorplanEx(request, headers, runtime);
        }

        /**
         * Description: 取消Connector运行实例
         * Summary: 取消Connector运行实例
         */
        public async Task<CancelSofamqConnectorplanResponse> CancelSofamqConnectorplanAsync(CancelSofamqConnectorplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelSofamqConnectorplanExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消Connector运行实例
         * Summary: 取消Connector运行实例
         */
        public CancelSofamqConnectorplanResponse CancelSofamqConnectorplanEx(CancelSofamqConnectorplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSofamqConnectorplanResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorplan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消Connector运行实例
         * Summary: 取消Connector运行实例
         */
        public async Task<CancelSofamqConnectorplanResponse> CancelSofamqConnectorplanExAsync(CancelSofamqConnectorplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSofamqConnectorplanResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorplan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置任务实例位点
         * Summary: 重置任务实例位点
         */
        public SetSofamqConnectorplancheckpointResponse SetSofamqConnectorplancheckpoint(SetSofamqConnectorplancheckpointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetSofamqConnectorplancheckpointEx(request, headers, runtime);
        }

        /**
         * Description: 重置任务实例位点
         * Summary: 重置任务实例位点
         */
        public async Task<SetSofamqConnectorplancheckpointResponse> SetSofamqConnectorplancheckpointAsync(SetSofamqConnectorplancheckpointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetSofamqConnectorplancheckpointExAsync(request, headers, runtime);
        }

        /**
         * Description: 重置任务实例位点
         * Summary: 重置任务实例位点
         */
        public SetSofamqConnectorplancheckpointResponse SetSofamqConnectorplancheckpointEx(SetSofamqConnectorplancheckpointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetSofamqConnectorplancheckpointResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorplancheckpoint.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重置任务实例位点
         * Summary: 重置任务实例位点
         */
        public async Task<SetSofamqConnectorplancheckpointResponse> SetSofamqConnectorplancheckpointExAsync(SetSofamqConnectorplancheckpointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetSofamqConnectorplancheckpointResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorplancheckpoint.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 活跃的conenctor实例【常驻任务】
         * Summary: 活跃的conenctor实例
         */
        public QuerySofamqConnectorplansingletonResponse QuerySofamqConnectorplansingleton(QuerySofamqConnectorplansingletonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectorplansingletonEx(request, headers, runtime);
        }

        /**
         * Description: 活跃的conenctor实例【常驻任务】
         * Summary: 活跃的conenctor实例
         */
        public async Task<QuerySofamqConnectorplansingletonResponse> QuerySofamqConnectorplansingletonAsync(QuerySofamqConnectorplansingletonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectorplansingletonExAsync(request, headers, runtime);
        }

        /**
         * Description: 活跃的conenctor实例【常驻任务】
         * Summary: 活跃的conenctor实例
         */
        public QuerySofamqConnectorplansingletonResponse QuerySofamqConnectorplansingletonEx(QuerySofamqConnectorplansingletonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorplansingletonResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorplansingleton.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 活跃的conenctor实例【常驻任务】
         * Summary: 活跃的conenctor实例
         */
        public async Task<QuerySofamqConnectorplansingletonResponse> QuerySofamqConnectorplansingletonExAsync(QuerySofamqConnectorplansingletonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorplansingletonResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorplansingleton.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取延迟时间
         * Summary: 获取延迟时间
         */
        public QuerySofamqConnectorjobdelayResponse QuerySofamqConnectorjobdelay(QuerySofamqConnectorjobdelayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectorjobdelayEx(request, headers, runtime);
        }

        /**
         * Description: 获取延迟时间
         * Summary: 获取延迟时间
         */
        public async Task<QuerySofamqConnectorjobdelayResponse> QuerySofamqConnectorjobdelayAsync(QuerySofamqConnectorjobdelayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectorjobdelayExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取延迟时间
         * Summary: 获取延迟时间
         */
        public QuerySofamqConnectorjobdelayResponse QuerySofamqConnectorjobdelayEx(QuerySofamqConnectorjobdelayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorjobdelayResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorjobdelay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取延迟时间
         * Summary: 获取延迟时间
         */
        public async Task<QuerySofamqConnectorjobdelayResponse> QuerySofamqConnectorjobdelayExAsync(QuerySofamqConnectorjobdelayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorjobdelayResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorjobdelay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 常驻任务分区信息详情
         * Summary: 分区状态详情列名
         */
        public QuerySofamqConnectorjobpartitionstatuscolumnResponse QuerySofamqConnectorjobpartitionstatuscolumn(QuerySofamqConnectorjobpartitionstatuscolumnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectorjobpartitionstatuscolumnEx(request, headers, runtime);
        }

        /**
         * Description: 常驻任务分区信息详情
         * Summary: 分区状态详情列名
         */
        public async Task<QuerySofamqConnectorjobpartitionstatuscolumnResponse> QuerySofamqConnectorjobpartitionstatuscolumnAsync(QuerySofamqConnectorjobpartitionstatuscolumnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectorjobpartitionstatuscolumnExAsync(request, headers, runtime);
        }

        /**
         * Description: 常驻任务分区信息详情
         * Summary: 分区状态详情列名
         */
        public QuerySofamqConnectorjobpartitionstatuscolumnResponse QuerySofamqConnectorjobpartitionstatuscolumnEx(QuerySofamqConnectorjobpartitionstatuscolumnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorjobpartitionstatuscolumnResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorjobpartitionstatuscolumn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 常驻任务分区信息详情
         * Summary: 分区状态详情列名
         */
        public async Task<QuerySofamqConnectorjobpartitionstatuscolumnResponse> QuerySofamqConnectorjobpartitionstatuscolumnExAsync(QuerySofamqConnectorjobpartitionstatuscolumnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorjobpartitionstatuscolumnResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorjobpartitionstatuscolumn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分区状态分页查询
         * Summary: 分区状态分页查询
         */
        public QuerySofamqConnectorjobpartitionstatusResponse QuerySofamqConnectorjobpartitionstatus(QuerySofamqConnectorjobpartitionstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectorjobpartitionstatusEx(request, headers, runtime);
        }

        /**
         * Description: 分区状态分页查询
         * Summary: 分区状态分页查询
         */
        public async Task<QuerySofamqConnectorjobpartitionstatusResponse> QuerySofamqConnectorjobpartitionstatusAsync(QuerySofamqConnectorjobpartitionstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectorjobpartitionstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 分区状态分页查询
         * Summary: 分区状态分页查询
         */
        public QuerySofamqConnectorjobpartitionstatusResponse QuerySofamqConnectorjobpartitionstatusEx(QuerySofamqConnectorjobpartitionstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorjobpartitionstatusResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectorjobpartitionstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分区状态分页查询
         * Summary: 分区状态分页查询
         */
        public async Task<QuerySofamqConnectorjobpartitionstatusResponse> QuerySofamqConnectorjobpartitionstatusExAsync(QuerySofamqConnectorjobpartitionstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectorjobpartitionstatusResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectorjobpartitionstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动触发UI
         * Summary: 手动触发UI
         */
        public QuerySofamqConnectortriggerconfigsResponse QuerySofamqConnectortriggerconfigs(QuerySofamqConnectortriggerconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConnectortriggerconfigsEx(request, headers, runtime);
        }

        /**
         * Description: 手动触发UI
         * Summary: 手动触发UI
         */
        public async Task<QuerySofamqConnectortriggerconfigsResponse> QuerySofamqConnectortriggerconfigsAsync(QuerySofamqConnectortriggerconfigsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConnectortriggerconfigsExAsync(request, headers, runtime);
        }

        /**
         * Description: 手动触发UI
         * Summary: 手动触发UI
         */
        public QuerySofamqConnectortriggerconfigsResponse QuerySofamqConnectortriggerconfigsEx(QuerySofamqConnectortriggerconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectortriggerconfigsResponse>(DoRequest("2.0", "sofa.mq.sofamq.connectortriggerconfigs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动触发UI
         * Summary: 手动触发UI
         */
        public async Task<QuerySofamqConnectortriggerconfigsResponse> QuerySofamqConnectortriggerconfigsExAsync(QuerySofamqConnectortriggerconfigsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConnectortriggerconfigsResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.connectortriggerconfigs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清除消费进度
         * Summary: 清除消费进度
         */
        public DeleteSofamqOffsetResponse DeleteSofamqOffset(DeleteSofamqOffsetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofamqOffsetEx(request, headers, runtime);
        }

        /**
         * Description: 清除消费进度
         * Summary: 清除消费进度
         */
        public async Task<DeleteSofamqOffsetResponse> DeleteSofamqOffsetAsync(DeleteSofamqOffsetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofamqOffsetExAsync(request, headers, runtime);
        }

        /**
         * Description: 清除消费进度
         * Summary: 清除消费进度
         */
        public DeleteSofamqOffsetResponse DeleteSofamqOffsetEx(DeleteSofamqOffsetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqOffsetResponse>(DoRequest("2.0", "sofa.mq.sofamq.offset.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清除消费进度
         * Summary: 清除消费进度
         */
        public async Task<DeleteSofamqOffsetResponse> DeleteSofamqOffsetExAsync(DeleteSofamqOffsetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofamqOffsetResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.offset.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户端查询消费进度
         * Summary: 用户端查询消费进度
         */
        public QuerySofamqConsumptionResponse QuerySofamqConsumption(QuerySofamqConsumptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofamqConsumptionEx(request, headers, runtime);
        }

        /**
         * Description: 用户端查询消费进度
         * Summary: 用户端查询消费进度
         */
        public async Task<QuerySofamqConsumptionResponse> QuerySofamqConsumptionAsync(QuerySofamqConsumptionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofamqConsumptionExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户端查询消费进度
         * Summary: 用户端查询消费进度
         */
        public QuerySofamqConsumptionResponse QuerySofamqConsumptionEx(QuerySofamqConsumptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumptionResponse>(DoRequest("2.0", "sofa.mq.sofamq.consumption.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户端查询消费进度
         * Summary: 用户端查询消费进度
         */
        public async Task<QuerySofamqConsumptionResponse> QuerySofamqConsumptionExAsync(QuerySofamqConsumptionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofamqConsumptionResponse>(await DoRequestAsync("2.0", "sofa.mq.sofamq.consumption.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户端topic的queue信息
         * Summary: 查询用户端topic的queue信息
         */
        public QueryUserTopicqueueResponse QueryUserTopicqueue(QueryUserTopicqueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserTopicqueueEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户端topic的queue信息
         * Summary: 查询用户端topic的queue信息
         */
        public async Task<QueryUserTopicqueueResponse> QueryUserTopicqueueAsync(QueryUserTopicqueueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserTopicqueueExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户端topic的queue信息
         * Summary: 查询用户端topic的queue信息
         */
        public QueryUserTopicqueueResponse QueryUserTopicqueueEx(QueryUserTopicqueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserTopicqueueResponse>(DoRequest("2.0", "sofa.mq.user.topicqueue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户端topic的queue信息
         * Summary: 查询用户端topic的queue信息
         */
        public async Task<QueryUserTopicqueueResponse> QueryUserTopicqueueExAsync(QueryUserTopicqueueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserTopicqueueResponse>(await DoRequestAsync("2.0", "sofa.mq.user.topicqueue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update next delivery time
         * Summary: update delivery time
         */
        public UpdateMessageNextdeliverytimeResponse UpdateMessageNextdeliverytime(UpdateMessageNextdeliverytimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMessageNextdeliverytimeEx(request, headers, runtime);
        }

        /**
         * Description: update next delivery time
         * Summary: update delivery time
         */
        public async Task<UpdateMessageNextdeliverytimeResponse> UpdateMessageNextdeliverytimeAsync(UpdateMessageNextdeliverytimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMessageNextdeliverytimeExAsync(request, headers, runtime);
        }

        /**
         * Description: update next delivery time
         * Summary: update delivery time
         */
        public UpdateMessageNextdeliverytimeResponse UpdateMessageNextdeliverytimeEx(UpdateMessageNextdeliverytimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMessageNextdeliverytimeResponse>(DoRequest("2.0", "sofa.mq.message.nextdeliverytime.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update next delivery time
         * Summary: update delivery time
         */
        public async Task<UpdateMessageNextdeliverytimeResponse> UpdateMessageNextdeliverytimeExAsync(UpdateMessageNextdeliverytimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMessageNextdeliverytimeResponse>(await DoRequestAsync("2.0", "sofa.mq.message.nextdeliverytime.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 统计未投递消息数量
         * Summary: 统计未投递消息数量
         */
        public CountMessageUndeliveryResponse CountMessageUndelivery(CountMessageUndeliveryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountMessageUndeliveryEx(request, headers, runtime);
        }

        /**
         * Description: 统计未投递消息数量
         * Summary: 统计未投递消息数量
         */
        public async Task<CountMessageUndeliveryResponse> CountMessageUndeliveryAsync(CountMessageUndeliveryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountMessageUndeliveryExAsync(request, headers, runtime);
        }

        /**
         * Description: 统计未投递消息数量
         * Summary: 统计未投递消息数量
         */
        public CountMessageUndeliveryResponse CountMessageUndeliveryEx(CountMessageUndeliveryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountMessageUndeliveryResponse>(DoRequest("2.0", "sofa.mq.message.undelivery.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 统计未投递消息数量
         * Summary: 统计未投递消息数量
         */
        public async Task<CountMessageUndeliveryResponse> CountMessageUndeliveryExAsync(CountMessageUndeliveryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountMessageUndeliveryResponse>(await DoRequestAsync("2.0", "sofa.mq.message.undelivery.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 加载任务SLO配置页面
         * Summary: 任务SLO配置
         */
        public LoadConnectorjobSloviewResponse LoadConnectorjobSloview(LoadConnectorjobSloviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LoadConnectorjobSloviewEx(request, headers, runtime);
        }

        /**
         * Description: 加载任务SLO配置页面
         * Summary: 任务SLO配置
         */
        public async Task<LoadConnectorjobSloviewResponse> LoadConnectorjobSloviewAsync(LoadConnectorjobSloviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LoadConnectorjobSloviewExAsync(request, headers, runtime);
        }

        /**
         * Description: 加载任务SLO配置页面
         * Summary: 任务SLO配置
         */
        public LoadConnectorjobSloviewResponse LoadConnectorjobSloviewEx(LoadConnectorjobSloviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadConnectorjobSloviewResponse>(DoRequest("2.0", "sofa.mq.connectorjob.sloview.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 加载任务SLO配置页面
         * Summary: 任务SLO配置
         */
        public async Task<LoadConnectorjobSloviewResponse> LoadConnectorjobSloviewExAsync(LoadConnectorjobSloviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadConnectorjobSloviewResponse>(await DoRequestAsync("2.0", "sofa.mq.connectorjob.sloview.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
