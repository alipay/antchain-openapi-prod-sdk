// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_ba5301f7d07245d1bd01dc432d3de4b1.Models;

namespace AntChain.SDK.Ak_ba5301f7d07245d1bd01dc432d3de4b1
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
                        {"sdk_version", "1.0.4"},
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
                        {"sdk_version", "1.0.4"},
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
         * Description: 对账单执行
         * Summary: 对账单执行接口
         */
        public ExecAntchainBbpContractReconciliationResponse ExecAntchainBbpContractReconciliation(ExecAntchainBbpContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecAntchainBbpContractReconciliationEx(request, headers, runtime);
        }

        /**
         * Description: 对账单执行
         * Summary: 对账单执行接口
         */
        public async Task<ExecAntchainBbpContractReconciliationResponse> ExecAntchainBbpContractReconciliationAsync(ExecAntchainBbpContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecAntchainBbpContractReconciliationExAsync(request, headers, runtime);
        }

        /**
         * Description: 对账单执行
         * Summary: 对账单执行接口
         */
        public ExecAntchainBbpContractReconciliationResponse ExecAntchainBbpContractReconciliationEx(ExecAntchainBbpContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAntchainBbpContractReconciliationResponse>(DoRequest("1.0", "antchain.bbp.contract.reconciliation.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对账单执行
         * Summary: 对账单执行接口
         */
        public async Task<ExecAntchainBbpContractReconciliationResponse> ExecAntchainBbpContractReconciliationExAsync(ExecAntchainBbpContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecAntchainBbpContractReconciliationResponse>(await DoRequestAsync("1.0", "antchain.bbp.contract.reconciliation.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 结算单确认
         * Summary: 结算单确认
         */
        public ConfirmAntchainBbpContractReconciliationResponse ConfirmAntchainBbpContractReconciliation(ConfirmAntchainBbpContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmAntchainBbpContractReconciliationEx(request, headers, runtime);
        }

        /**
         * Description: 结算单确认
         * Summary: 结算单确认
         */
        public async Task<ConfirmAntchainBbpContractReconciliationResponse> ConfirmAntchainBbpContractReconciliationAsync(ConfirmAntchainBbpContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmAntchainBbpContractReconciliationExAsync(request, headers, runtime);
        }

        /**
         * Description: 结算单确认
         * Summary: 结算单确认
         */
        public ConfirmAntchainBbpContractReconciliationResponse ConfirmAntchainBbpContractReconciliationEx(ConfirmAntchainBbpContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmAntchainBbpContractReconciliationResponse>(DoRequest("1.0", "antchain.bbp.contract.reconciliation.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 结算单确认
         * Summary: 结算单确认
         */
        public async Task<ConfirmAntchainBbpContractReconciliationResponse> ConfirmAntchainBbpContractReconciliationExAsync(ConfirmAntchainBbpContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmAntchainBbpContractReconciliationResponse>(await DoRequestAsync("1.0", "antchain.bbp.contract.reconciliation.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public PublishDemoSaasTestTestcResponse PublishDemoSaasTestTestc(PublishDemoSaasTestTestcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishDemoSaasTestTestcEx(request, headers, runtime);
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public async Task<PublishDemoSaasTestTestcResponse> PublishDemoSaasTestTestcAsync(PublishDemoSaasTestTestcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishDemoSaasTestTestcExAsync(request, headers, runtime);
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public PublishDemoSaasTestTestcResponse PublishDemoSaasTestTestcEx(PublishDemoSaasTestTestcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDemoSaasTestTestcResponse>(DoRequest("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: testc
         * Summary: 测试用api
         */
        public async Task<PublishDemoSaasTestTestcResponse> PublishDemoSaasTestTestcExAsync(PublishDemoSaasTestTestcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDemoSaasTestTestcResponse>(await DoRequestAsync("1.0", "demo.saas.test.testc.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public ResetDemoSaasTestTestdResponse ResetDemoSaasTestTestd(ResetDemoSaasTestTestdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetDemoSaasTestTestdEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<ResetDemoSaasTestTestdResponse> ResetDemoSaasTestTestdAsync(ResetDemoSaasTestTestdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetDemoSaasTestTestdExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public ResetDemoSaasTestTestdResponse ResetDemoSaasTestTestdEx(ResetDemoSaasTestTestdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetDemoSaasTestTestdResponse>(DoRequest("1.0", "demo.saas.test.testd.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<ResetDemoSaasTestTestdResponse> ResetDemoSaasTestTestdExAsync(ResetDemoSaasTestTestdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetDemoSaasTestTestdResponse>(await DoRequestAsync("1.0", "demo.saas.test.testd.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public OperateDemoSaasTestTesteResponse OperateDemoSaasTestTeste(OperateDemoSaasTestTesteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateDemoSaasTestTesteEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<OperateDemoSaasTestTesteResponse> OperateDemoSaasTestTesteAsync(OperateDemoSaasTestTesteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateDemoSaasTestTesteExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public OperateDemoSaasTestTesteResponse OperateDemoSaasTestTesteEx(OperateDemoSaasTestTesteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDemoSaasTestTesteResponse>(DoRequest("1.0", "demo.saas.test.teste.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<OperateDemoSaasTestTesteResponse> OperateDemoSaasTestTesteExAsync(OperateDemoSaasTestTesteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDemoSaasTestTesteResponse>(await DoRequestAsync("1.0", "demo.saas.test.teste.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public BatchcreateDemoSaasTestTestfResponse BatchcreateDemoSaasTestTestf(BatchcreateDemoSaasTestTestfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateDemoSaasTestTestfEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<BatchcreateDemoSaasTestTestfResponse> BatchcreateDemoSaasTestTestfAsync(BatchcreateDemoSaasTestTestfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateDemoSaasTestTestfExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public BatchcreateDemoSaasTestTestfResponse BatchcreateDemoSaasTestTestfEx(BatchcreateDemoSaasTestTestfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateDemoSaasTestTestfResponse>(DoRequest("1.0", "demo.saas.test.testf.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<BatchcreateDemoSaasTestTestfResponse> BatchcreateDemoSaasTestTestfExAsync(BatchcreateDemoSaasTestTestfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateDemoSaasTestTestfResponse>(await DoRequestAsync("1.0", "demo.saas.test.testf.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public OpenDemoSaasTestTestgResponse OpenDemoSaasTestTestg(OpenDemoSaasTestTestgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenDemoSaasTestTestgEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<OpenDemoSaasTestTestgResponse> OpenDemoSaasTestTestgAsync(OpenDemoSaasTestTestgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenDemoSaasTestTestgExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public OpenDemoSaasTestTestgResponse OpenDemoSaasTestTestgEx(OpenDemoSaasTestTestgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenDemoSaasTestTestgResponse>(DoRequest("1.0", "demo.saas.test.testg.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<OpenDemoSaasTestTestgResponse> OpenDemoSaasTestTestgExAsync(OpenDemoSaasTestTestgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenDemoSaasTestTestgResponse>(await DoRequestAsync("1.0", "demo.saas.test.testg.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTesthResponse CreateDemoSaasTestTesth(CreateDemoSaasTestTesthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoSaasTestTesthEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTesthResponse> CreateDemoSaasTestTesthAsync(CreateDemoSaasTestTesthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoSaasTestTesthExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTesthResponse CreateDemoSaasTestTesthEx(CreateDemoSaasTestTesthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTesthResponse>(DoRequest("1.0", "demo.saas.test.testh.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTesthResponse> CreateDemoSaasTestTesthExAsync(CreateDemoSaasTestTesthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTesthResponse>(await DoRequestAsync("1.0", "demo.saas.test.testh.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTestiResponse CreateDemoSaasTestTesti(CreateDemoSaasTestTestiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoSaasTestTestiEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTestiResponse> CreateDemoSaasTestTestiAsync(CreateDemoSaasTestTestiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoSaasTestTestiExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public CreateDemoSaasTestTestiResponse CreateDemoSaasTestTestiEx(CreateDemoSaasTestTestiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTestiResponse>(DoRequest("1.0", "demo.saas.test.testi.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<CreateDemoSaasTestTestiResponse> CreateDemoSaasTestTestiExAsync(CreateDemoSaasTestTestiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoSaasTestTestiResponse>(await DoRequestAsync("1.0", "demo.saas.test.testi.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public ReplaceDemoSaasTestTestjResponse ReplaceDemoSaasTestTestj(ReplaceDemoSaasTestTestjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReplaceDemoSaasTestTestjEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<ReplaceDemoSaasTestTestjResponse> ReplaceDemoSaasTestTestjAsync(ReplaceDemoSaasTestTestjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReplaceDemoSaasTestTestjExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public ReplaceDemoSaasTestTestjResponse ReplaceDemoSaasTestTestjEx(ReplaceDemoSaasTestTestjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDemoSaasTestTestjResponse>(DoRequest("1.0", "demo.saas.test.testj.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<ReplaceDemoSaasTestTestjResponse> ReplaceDemoSaasTestTestjExAsync(ReplaceDemoSaasTestTestjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDemoSaasTestTestjResponse>(await DoRequestAsync("1.0", "demo.saas.test.testj.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public SendDemoSaasTestTestkResponse SendDemoSaasTestTestk(SendDemoSaasTestTestkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendDemoSaasTestTestkEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<SendDemoSaasTestTestkResponse> SendDemoSaasTestTestkAsync(SendDemoSaasTestTestkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendDemoSaasTestTestkExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public SendDemoSaasTestTestkResponse SendDemoSaasTestTestkEx(SendDemoSaasTestTestkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendDemoSaasTestTestkResponse>(DoRequest("1.0", "demo.saas.test.testk.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力租户流量测试
         * Summary: 共享能力租户流量测试
         */
        public async Task<SendDemoSaasTestTestkResponse> SendDemoSaasTestTestkExAsync(SendDemoSaasTestTestkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendDemoSaasTestTestkResponse>(await DoRequestAsync("1.0", "demo.saas.test.testk.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
