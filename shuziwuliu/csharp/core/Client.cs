// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.SHUZIWULIU.Models;

namespace AntChain.SDK.SHUZIWULIU
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
                        {"sdk_version", "1.7.22"},
                        {"_prod_code", "SHUZIWULIU"},
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
                        {"sdk_version", "1.7.22"},
                        {"_prod_code", "SHUZIWULIU"},
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
         * Description: 标准化应收账单
         * Summary: 标准化应收账单
         */
        public CreateReceivableBillResponse CreateReceivableBill(CreateReceivableBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateReceivableBillEx(request, headers, runtime);
        }

        /**
         * Description: 标准化应收账单
         * Summary: 标准化应收账单
         */
        public async Task<CreateReceivableBillResponse> CreateReceivableBillAsync(CreateReceivableBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateReceivableBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 标准化应收账单
         * Summary: 标准化应收账单
         */
        public CreateReceivableBillResponse CreateReceivableBillEx(CreateReceivableBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateReceivableBillResponse>(DoRequest("1.0", "digital.logistic.receivable.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标准化应收账单
         * Summary: 标准化应收账单
         */
        public async Task<CreateReceivableBillResponse> CreateReceivableBillExAsync(CreateReceivableBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateReceivableBillResponse>(await DoRequestAsync("1.0", "digital.logistic.receivable.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建凭证
         * Summary: 创建凭证
         */
        public CreateStandardVoucherResponse CreateStandardVoucher(CreateStandardVoucherRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateStandardVoucherEx(request, headers, runtime);
        }

        /**
         * Description: 创建凭证
         * Summary: 创建凭证
         */
        public async Task<CreateStandardVoucherResponse> CreateStandardVoucherAsync(CreateStandardVoucherRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateStandardVoucherExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建凭证
         * Summary: 创建凭证
         */
        public CreateStandardVoucherResponse CreateStandardVoucherEx(CreateStandardVoucherRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStandardVoucherResponse>(DoRequest("1.0", "digital.logistic.standard.voucher.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建凭证
         * Summary: 创建凭证
         */
        public async Task<CreateStandardVoucherResponse> CreateStandardVoucherExAsync(CreateStandardVoucherRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStandardVoucherResponse>(await DoRequestAsync("1.0", "digital.logistic.standard.voucher.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 无车承运平台为自身申请DIS分布式数字身份
         * Summary: 无车承运平台DIS分布式数字身份申请
         */
        public CreatePlatformDidResponse CreatePlatformDid(CreatePlatformDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatePlatformDidEx(request, headers, runtime);
        }

        /**
         * Description: 无车承运平台为自身申请DIS分布式数字身份
         * Summary: 无车承运平台DIS分布式数字身份申请
         */
        public async Task<CreatePlatformDidResponse> CreatePlatformDidAsync(CreatePlatformDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatePlatformDidExAsync(request, headers, runtime);
        }

        /**
         * Description: 无车承运平台为自身申请DIS分布式数字身份
         * Summary: 无车承运平台DIS分布式数字身份申请
         */
        public CreatePlatformDidResponse CreatePlatformDidEx(CreatePlatformDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePlatformDidResponse>(DoRequest("1.0", "digital.logistic.platform.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 无车承运平台为自身申请DIS分布式数字身份
         * Summary: 无车承运平台DIS分布式数字身份申请
         */
        public async Task<CreatePlatformDidResponse> CreatePlatformDidExAsync(CreatePlatformDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePlatformDidResponse>(await DoRequestAsync("1.0", "digital.logistic.platform.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
         * Summary: 无车承运平台DIS分布式数字身份代理申请
         */
        public CreateAgentDidResponse CreateAgentDid(CreateAgentDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAgentDidEx(request, headers, runtime);
        }

        /**
         * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
         * Summary: 无车承运平台DIS分布式数字身份代理申请
         */
        public async Task<CreateAgentDidResponse> CreateAgentDidAsync(CreateAgentDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAgentDidExAsync(request, headers, runtime);
        }

        /**
         * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
         * Summary: 无车承运平台DIS分布式数字身份代理申请
         */
        public CreateAgentDidResponse CreateAgentDidEx(CreateAgentDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAgentDidResponse>(DoRequest("1.0", "digital.logistic.agent.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
         * Summary: 无车承运平台DIS分布式数字身份代理申请
         */
        public async Task<CreateAgentDidResponse> CreateAgentDidExAsync(CreateAgentDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAgentDidResponse>(await DoRequestAsync("1.0", "digital.logistic.agent.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
         * Summary: 货主DIS分布式数字身份申请
         */
        public CreateConsignorDisResponse CreateConsignorDis(CreateConsignorDisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsignorDisEx(request, headers, runtime);
        }

        /**
         * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
         * Summary: 货主DIS分布式数字身份申请
         */
        public async Task<CreateConsignorDisResponse> CreateConsignorDisAsync(CreateConsignorDisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsignorDisExAsync(request, headers, runtime);
        }

        /**
         * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
         * Summary: 货主DIS分布式数字身份申请
         */
        public CreateConsignorDisResponse CreateConsignorDisEx(CreateConsignorDisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsignorDisResponse>(DoRequest("1.0", "digital.logistic.consignor.dis.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
         * Summary: 货主DIS分布式数字身份申请
         */
        public async Task<CreateConsignorDisResponse> CreateConsignorDisExAsync(CreateConsignorDisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsignorDisResponse>(await DoRequestAsync("1.0", "digital.logistic.consignor.dis.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
         * Summary: 司机DIS分布式数字身份申请
         */
        public CreateDriverDisResponse CreateDriverDis(CreateDriverDisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDriverDisEx(request, headers, runtime);
        }

        /**
         * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
         * Summary: 司机DIS分布式数字身份申请
         */
        public async Task<CreateDriverDisResponse> CreateDriverDisAsync(CreateDriverDisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDriverDisExAsync(request, headers, runtime);
        }

        /**
         * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
         * Summary: 司机DIS分布式数字身份申请
         */
        public CreateDriverDisResponse CreateDriverDisEx(CreateDriverDisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDriverDisResponse>(DoRequest("1.0", "digital.logistic.driver.dis.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
         * Summary: 司机DIS分布式数字身份申请
         */
        public async Task<CreateDriverDisResponse> CreateDriverDisExAsync(CreateDriverDisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDriverDisResponse>(await DoRequestAsync("1.0", "digital.logistic.driver.dis.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货源订单创建，货主发货给平台时的订单信息
         * Summary: 货源订单创建
         */
        public CreateCargoOrderResponse CreateCargoOrder(CreateCargoOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCargoOrderEx(request, headers, runtime);
        }

        /**
         * Description: 货源订单创建，货主发货给平台时的订单信息
         * Summary: 货源订单创建
         */
        public async Task<CreateCargoOrderResponse> CreateCargoOrderAsync(CreateCargoOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCargoOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 货源订单创建，货主发货给平台时的订单信息
         * Summary: 货源订单创建
         */
        public CreateCargoOrderResponse CreateCargoOrderEx(CreateCargoOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargoOrderResponse>(DoRequest("1.0", "digital.logistic.cargo.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货源订单创建，货主发货给平台时的订单信息
         * Summary: 货源订单创建
         */
        public async Task<CreateCargoOrderResponse> CreateCargoOrderExAsync(CreateCargoOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargoOrderResponse>(await DoRequestAsync("1.0", "digital.logistic.cargo.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货源支付订单创建,货源订单需存在。
         * Summary: 货源支付订单创建
         */
        public CreateCargoPayResponse CreateCargoPay(CreateCargoPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCargoPayEx(request, headers, runtime);
        }

        /**
         * Description: 货源支付订单创建,货源订单需存在。
         * Summary: 货源支付订单创建
         */
        public async Task<CreateCargoPayResponse> CreateCargoPayAsync(CreateCargoPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCargoPayExAsync(request, headers, runtime);
        }

        /**
         * Description: 货源支付订单创建,货源订单需存在。
         * Summary: 货源支付订单创建
         */
        public CreateCargoPayResponse CreateCargoPayEx(CreateCargoPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargoPayResponse>(DoRequest("1.0", "digital.logistic.cargo.pay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货源支付订单创建,货源订单需存在。
         * Summary: 货源支付订单创建
         */
        public async Task<CreateCargoPayResponse> CreateCargoPayExAsync(CreateCargoPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargoPayResponse>(await DoRequestAsync("1.0", "digital.logistic.cargo.pay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流平台将运单指派给下游（承运商、司机）时产生
         * Summary: 运单创建
         */
        public CreateWaybillOrderResponse CreateWaybillOrder(CreateWaybillOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWaybillOrderEx(request, headers, runtime);
        }

        /**
         * Description: 物流平台将运单指派给下游（承运商、司机）时产生
         * Summary: 运单创建
         */
        public async Task<CreateWaybillOrderResponse> CreateWaybillOrderAsync(CreateWaybillOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWaybillOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 物流平台将运单指派给下游（承运商、司机）时产生
         * Summary: 运单创建
         */
        public CreateWaybillOrderResponse CreateWaybillOrderEx(CreateWaybillOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWaybillOrderResponse>(DoRequest("1.0", "digital.logistic.waybill.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流平台将运单指派给下游（承运商、司机）时产生
         * Summary: 运单创建
         */
        public async Task<CreateWaybillOrderResponse> CreateWaybillOrderExAsync(CreateWaybillOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWaybillOrderResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建物流支付订单，运单需已存在并且未结束
         * Summary: 运单支付订单创建
         */
        public CreateWaybillPayResponse CreateWaybillPay(CreateWaybillPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWaybillPayEx(request, headers, runtime);
        }

        /**
         * Description: 创建物流支付订单，运单需已存在并且未结束
         * Summary: 运单支付订单创建
         */
        public async Task<CreateWaybillPayResponse> CreateWaybillPayAsync(CreateWaybillPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWaybillPayExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建物流支付订单，运单需已存在并且未结束
         * Summary: 运单支付订单创建
         */
        public CreateWaybillPayResponse CreateWaybillPayEx(CreateWaybillPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWaybillPayResponse>(DoRequest("1.0", "digital.logistic.waybill.pay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建物流支付订单，运单需已存在并且未结束
         * Summary: 运单支付订单创建
         */
        public async Task<CreateWaybillPayResponse> CreateWaybillPayExAsync(CreateWaybillPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWaybillPayResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.pay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
         * Summary: 第三方位置信息上报
         */
        public ImportWaybillLocationResponse ImportWaybillLocation(ImportWaybillLocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportWaybillLocationEx(request, headers, runtime);
        }

        /**
         * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
         * Summary: 第三方位置信息上报
         */
        public async Task<ImportWaybillLocationResponse> ImportWaybillLocationAsync(ImportWaybillLocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportWaybillLocationExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
         * Summary: 第三方位置信息上报
         */
        public ImportWaybillLocationResponse ImportWaybillLocationEx(ImportWaybillLocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportWaybillLocationResponse>(DoRequest("1.0", "digital.logistic.waybill.location.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
         * Summary: 第三方位置信息上报
         */
        public async Task<ImportWaybillLocationResponse> ImportWaybillLocationExAsync(ImportWaybillLocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportWaybillLocationResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.location.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发票订单创建
         * Summary: 发票订单创建
         */
        public CreateWaybillBillResponse CreateWaybillBill(CreateWaybillBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWaybillBillEx(request, headers, runtime);
        }

        /**
         * Description: 发票订单创建
         * Summary: 发票订单创建
         */
        public async Task<CreateWaybillBillResponse> CreateWaybillBillAsync(CreateWaybillBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWaybillBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 发票订单创建
         * Summary: 发票订单创建
         */
        public CreateWaybillBillResponse CreateWaybillBillEx(CreateWaybillBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWaybillBillResponse>(DoRequest("1.0", "digital.logistic.waybill.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发票订单创建
         * Summary: 发票订单创建
         */
        public async Task<CreateWaybillBillResponse> CreateWaybillBillExAsync(CreateWaybillBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWaybillBillResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询物流运单状态
         * Summary: 查询运单状态
         */
        public QueryWaybillStatusResponse QueryWaybillStatus(QueryWaybillStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWaybillStatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询物流运单状态
         * Summary: 查询运单状态
         */
        public async Task<QueryWaybillStatusResponse> QueryWaybillStatusAsync(QueryWaybillStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWaybillStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询物流运单状态
         * Summary: 查询运单状态
         */
        public QueryWaybillStatusResponse QueryWaybillStatusEx(QueryWaybillStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWaybillStatusResponse>(DoRequest("1.0", "digital.logistic.waybill.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询物流运单状态
         * Summary: 查询运单状态
         */
        public async Task<QueryWaybillStatusResponse> QueryWaybillStatusExAsync(QueryWaybillStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWaybillStatusResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
         * Summary: 运单完成
         */
        public FinishWaybillOrderResponse FinishWaybillOrder(FinishWaybillOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishWaybillOrderEx(request, headers, runtime);
        }

        /**
         * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
         * Summary: 运单完成
         */
        public async Task<FinishWaybillOrderResponse> FinishWaybillOrderAsync(FinishWaybillOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishWaybillOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
         * Summary: 运单完成
         */
        public FinishWaybillOrderResponse FinishWaybillOrderEx(FinishWaybillOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishWaybillOrderResponse>(DoRequest("1.0", "digital.logistic.waybill.order.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
         * Summary: 运单完成
         */
        public async Task<FinishWaybillOrderResponse> FinishWaybillOrderExAsync(FinishWaybillOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishWaybillOrderResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.order.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货源支付订单创建,货源订单需存在。
         * Summary: 货源支付订单创建
         */
        public CreateCargoPayorderResponse CreateCargoPayorder(CreateCargoPayorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCargoPayorderEx(request, headers, runtime);
        }

        /**
         * Description: 货源支付订单创建,货源订单需存在。
         * Summary: 货源支付订单创建
         */
        public async Task<CreateCargoPayorderResponse> CreateCargoPayorderAsync(CreateCargoPayorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCargoPayorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 货源支付订单创建,货源订单需存在。
         * Summary: 货源支付订单创建
         */
        public CreateCargoPayorderResponse CreateCargoPayorderEx(CreateCargoPayorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargoPayorderResponse>(DoRequest("1.0", "digital.logistic.cargo.payorder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货源支付订单创建,货源订单需存在。
         * Summary: 货源支付订单创建
         */
        public async Task<CreateCargoPayorderResponse> CreateCargoPayorderExAsync(CreateCargoPayorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargoPayorderResponse>(await DoRequestAsync("1.0", "digital.logistic.cargo.payorder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当货物到达目的地时，调用此接口
         * Summary: 运单运输完成
         */
        public SaveWaybillOrderResponse SaveWaybillOrder(SaveWaybillOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveWaybillOrderEx(request, headers, runtime);
        }

        /**
         * Description: 当货物到达目的地时，调用此接口
         * Summary: 运单运输完成
         */
        public async Task<SaveWaybillOrderResponse> SaveWaybillOrderAsync(SaveWaybillOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveWaybillOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 当货物到达目的地时，调用此接口
         * Summary: 运单运输完成
         */
        public SaveWaybillOrderResponse SaveWaybillOrderEx(SaveWaybillOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveWaybillOrderResponse>(DoRequest("1.0", "digital.logistic.waybill.order.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当货物到达目的地时，调用此接口
         * Summary: 运单运输完成
         */
        public async Task<SaveWaybillOrderResponse> SaveWaybillOrderExAsync(SaveWaybillOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveWaybillOrderResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.order.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运单关闭
         * Summary: 运单关闭
         */
        public CloseWaybillOrderResponse CloseWaybillOrder(CloseWaybillOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloseWaybillOrderEx(request, headers, runtime);
        }

        /**
         * Description: 运单关闭
         * Summary: 运单关闭
         */
        public async Task<CloseWaybillOrderResponse> CloseWaybillOrderAsync(CloseWaybillOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloseWaybillOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 运单关闭
         * Summary: 运单关闭
         */
        public CloseWaybillOrderResponse CloseWaybillOrderEx(CloseWaybillOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseWaybillOrderResponse>(DoRequest("1.0", "digital.logistic.waybill.order.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运单关闭
         * Summary: 运单关闭
         */
        public async Task<CloseWaybillOrderResponse> CloseWaybillOrderExAsync(CloseWaybillOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseWaybillOrderResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.order.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成物流运单
         * Summary: 完成物流运单
         */
        public FinishFinanceWaybillResponse FinishFinanceWaybill(FinishFinanceWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishFinanceWaybillEx(request, headers, runtime);
        }

        /**
         * Description: 完成物流运单
         * Summary: 完成物流运单
         */
        public async Task<FinishFinanceWaybillResponse> FinishFinanceWaybillAsync(FinishFinanceWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishFinanceWaybillExAsync(request, headers, runtime);
        }

        /**
         * Description: 完成物流运单
         * Summary: 完成物流运单
         */
        public FinishFinanceWaybillResponse FinishFinanceWaybillEx(FinishFinanceWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishFinanceWaybillResponse>(DoRequest("1.0", "digital.logistic.finance.waybill.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成物流运单
         * Summary: 完成物流运单
         */
        public async Task<FinishFinanceWaybillResponse> FinishFinanceWaybillExAsync(FinishFinanceWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishFinanceWaybillResponse>(await DoRequestAsync("1.0", "digital.logistic.finance.waybill.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运输完成
         * Summary: 运输完成
         */
        public FinishFinanceTransportResponse FinishFinanceTransport(FinishFinanceTransportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishFinanceTransportEx(request, headers, runtime);
        }

        /**
         * Description: 运输完成
         * Summary: 运输完成
         */
        public async Task<FinishFinanceTransportResponse> FinishFinanceTransportAsync(FinishFinanceTransportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishFinanceTransportExAsync(request, headers, runtime);
        }

        /**
         * Description: 运输完成
         * Summary: 运输完成
         */
        public FinishFinanceTransportResponse FinishFinanceTransportEx(FinishFinanceTransportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishFinanceTransportResponse>(DoRequest("1.0", "digital.logistic.finance.transport.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运输完成
         * Summary: 运输完成
         */
        public async Task<FinishFinanceTransportResponse> FinishFinanceTransportExAsync(FinishFinanceTransportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishFinanceTransportResponse>(await DoRequestAsync("1.0", "digital.logistic.finance.transport.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对运单信息项需更新时调用
         * Summary: 更新运单
         */
        public UpdateFinanceWaybillResponse UpdateFinanceWaybill(UpdateFinanceWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFinanceWaybillEx(request, headers, runtime);
        }

        /**
         * Description: 对运单信息项需更新时调用
         * Summary: 更新运单
         */
        public async Task<UpdateFinanceWaybillResponse> UpdateFinanceWaybillAsync(UpdateFinanceWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFinanceWaybillExAsync(request, headers, runtime);
        }

        /**
         * Description: 对运单信息项需更新时调用
         * Summary: 更新运单
         */
        public UpdateFinanceWaybillResponse UpdateFinanceWaybillEx(UpdateFinanceWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFinanceWaybillResponse>(DoRequest("1.0", "digital.logistic.finance.waybill.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对运单信息项需更新时调用
         * Summary: 更新运单
         */
        public async Task<UpdateFinanceWaybillResponse> UpdateFinanceWaybillExAsync(UpdateFinanceWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFinanceWaybillResponse>(await DoRequestAsync("1.0", "digital.logistic.finance.waybill.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当司机到达货主装货地后，调用此接口
         * Summary: 起运运单
         */
        public StartFinanceWaybillResponse StartFinanceWaybill(StartFinanceWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartFinanceWaybillEx(request, headers, runtime);
        }

        /**
         * Description: 当司机到达货主装货地后，调用此接口
         * Summary: 起运运单
         */
        public async Task<StartFinanceWaybillResponse> StartFinanceWaybillAsync(StartFinanceWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartFinanceWaybillExAsync(request, headers, runtime);
        }

        /**
         * Description: 当司机到达货主装货地后，调用此接口
         * Summary: 起运运单
         */
        public StartFinanceWaybillResponse StartFinanceWaybillEx(StartFinanceWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartFinanceWaybillResponse>(DoRequest("1.0", "digital.logistic.finance.waybill.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当司机到达货主装货地后，调用此接口
         * Summary: 起运运单
         */
        public async Task<StartFinanceWaybillResponse> StartFinanceWaybillExAsync(StartFinanceWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartFinanceWaybillResponse>(await DoRequestAsync("1.0", "digital.logistic.finance.waybill.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建承运商账户
         * Summary: 创建承运商账户
         */
        public CreateCaptainDisResponse CreateCaptainDis(CreateCaptainDisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCaptainDisEx(request, headers, runtime);
        }

        /**
         * Description: 创建承运商账户
         * Summary: 创建承运商账户
         */
        public async Task<CreateCaptainDisResponse> CreateCaptainDisAsync(CreateCaptainDisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCaptainDisExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建承运商账户
         * Summary: 创建承运商账户
         */
        public CreateCaptainDisResponse CreateCaptainDisEx(CreateCaptainDisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCaptainDisResponse>(DoRequest("1.0", "digital.logistic.captain.dis.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建承运商账户
         * Summary: 创建承运商账户
         */
        public async Task<CreateCaptainDisResponse> CreateCaptainDisExAsync(CreateCaptainDisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCaptainDisResponse>(await DoRequestAsync("1.0", "digital.logistic.captain.dis.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建货主账单
         * Summary: 货主账单创建
         */
        public CreateCargowaybillBillResponse CreateCargowaybillBill(CreateCargowaybillBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCargowaybillBillEx(request, headers, runtime);
        }

        /**
         * Description: 创建货主账单
         * Summary: 货主账单创建
         */
        public async Task<CreateCargowaybillBillResponse> CreateCargowaybillBillAsync(CreateCargowaybillBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCargowaybillBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建货主账单
         * Summary: 货主账单创建
         */
        public CreateCargowaybillBillResponse CreateCargowaybillBillEx(CreateCargowaybillBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargowaybillBillResponse>(DoRequest("1.0", "digital.logistic.cargowaybill.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建货主账单
         * Summary: 货主账单创建
         */
        public async Task<CreateCargowaybillBillResponse> CreateCargowaybillBillExAsync(CreateCargowaybillBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargowaybillBillResponse>(await DoRequestAsync("1.0", "digital.logistic.cargowaybill.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认货主账单
         * Summary: 货主账单确认
         */
        public ConfirmCargowaybillBillResponse ConfirmCargowaybillBill(ConfirmCargowaybillBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmCargowaybillBillEx(request, headers, runtime);
        }

        /**
         * Description: 确认货主账单
         * Summary: 货主账单确认
         */
        public async Task<ConfirmCargowaybillBillResponse> ConfirmCargowaybillBillAsync(ConfirmCargowaybillBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmCargowaybillBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认货主账单
         * Summary: 货主账单确认
         */
        public ConfirmCargowaybillBillResponse ConfirmCargowaybillBillEx(ConfirmCargowaybillBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmCargowaybillBillResponse>(DoRequest("1.0", "digital.logistic.cargowaybill.bill.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认货主账单
         * Summary: 货主账单确认
         */
        public async Task<ConfirmCargowaybillBillResponse> ConfirmCargowaybillBillExAsync(ConfirmCargowaybillBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmCargowaybillBillResponse>(await DoRequestAsync("1.0", "digital.logistic.cargowaybill.bill.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 结算货主账单
         * Summary: 货主账单结算
         */
        public CreateCargowaybillBillsettleResponse CreateCargowaybillBillsettle(CreateCargowaybillBillsettleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCargowaybillBillsettleEx(request, headers, runtime);
        }

        /**
         * Description: 结算货主账单
         * Summary: 货主账单结算
         */
        public async Task<CreateCargowaybillBillsettleResponse> CreateCargowaybillBillsettleAsync(CreateCargowaybillBillsettleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCargowaybillBillsettleExAsync(request, headers, runtime);
        }

        /**
         * Description: 结算货主账单
         * Summary: 货主账单结算
         */
        public CreateCargowaybillBillsettleResponse CreateCargowaybillBillsettleEx(CreateCargowaybillBillsettleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargowaybillBillsettleResponse>(DoRequest("1.0", "digital.logistic.cargowaybill.billsettle.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 结算货主账单
         * Summary: 货主账单结算
         */
        public async Task<CreateCargowaybillBillsettleResponse> CreateCargowaybillBillsettleExAsync(CreateCargowaybillBillsettleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCargowaybillBillsettleResponse>(await DoRequestAsync("1.0", "digital.logistic.cargowaybill.billsettle.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运单平台did更新
         * Summary: 运单平台did更新
         */
        public UpdateWaybillorderPlatformdidResponse UpdateWaybillorderPlatformdid(UpdateWaybillorderPlatformdidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateWaybillorderPlatformdidEx(request, headers, runtime);
        }

        /**
         * Description: 运单平台did更新
         * Summary: 运单平台did更新
         */
        public async Task<UpdateWaybillorderPlatformdidResponse> UpdateWaybillorderPlatformdidAsync(UpdateWaybillorderPlatformdidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateWaybillorderPlatformdidExAsync(request, headers, runtime);
        }

        /**
         * Description: 运单平台did更新
         * Summary: 运单平台did更新
         */
        public UpdateWaybillorderPlatformdidResponse UpdateWaybillorderPlatformdidEx(UpdateWaybillorderPlatformdidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWaybillorderPlatformdidResponse>(DoRequest("1.0", "digital.logistic.waybillorder.platformdid.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运单平台did更新
         * Summary: 运单平台did更新
         */
        public async Task<UpdateWaybillorderPlatformdidResponse> UpdateWaybillorderPlatformdidExAsync(UpdateWaybillorderPlatformdidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWaybillorderPlatformdidResponse>(await DoRequestAsync("1.0", "digital.logistic.waybillorder.platformdid.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新货主账单
         * Summary: 货主账单更新
         */
        public UpdateCargowaybillBillResponse UpdateCargowaybillBill(UpdateCargowaybillBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCargowaybillBillEx(request, headers, runtime);
        }

        /**
         * Description: 更新货主账单
         * Summary: 货主账单更新
         */
        public async Task<UpdateCargowaybillBillResponse> UpdateCargowaybillBillAsync(UpdateCargowaybillBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCargowaybillBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新货主账单
         * Summary: 货主账单更新
         */
        public UpdateCargowaybillBillResponse UpdateCargowaybillBillEx(UpdateCargowaybillBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCargowaybillBillResponse>(DoRequest("1.0", "digital.logistic.cargowaybill.bill.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新货主账单
         * Summary: 货主账单更新
         */
        public async Task<UpdateCargowaybillBillResponse> UpdateCargowaybillBillExAsync(UpdateCargowaybillBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCargowaybillBillResponse>(await DoRequestAsync("1.0", "digital.logistic.cargowaybill.bill.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
         * Summary: 分布式数字身份申请did集合
         */
        public CreateDisDidResponse CreateDisDid(CreateDisDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDisDidEx(request, headers, runtime);
        }

        /**
         * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
         * Summary: 分布式数字身份申请did集合
         */
        public async Task<CreateDisDidResponse> CreateDisDidAsync(CreateDisDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDisDidExAsync(request, headers, runtime);
        }

        /**
         * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
         * Summary: 分布式数字身份申请did集合
         */
        public CreateDisDidResponse CreateDisDidEx(CreateDisDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDisDidResponse>(DoRequest("1.0", "digital.logistic.dis.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
         * Summary: 分布式数字身份申请did集合
         */
        public async Task<CreateDisDidResponse> CreateDisDidExAsync(CreateDisDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDisDidResponse>(await DoRequestAsync("1.0", "digital.logistic.dis.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运输合同上传
         * Summary: 3PL运输合同上传
         */
        public UploadTransportContractResponse UploadTransportContract(UploadTransportContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadTransportContractEx(request, headers, runtime);
        }

        /**
         * Description: 3PL运输合同上传
         * Summary: 3PL运输合同上传
         */
        public async Task<UploadTransportContractResponse> UploadTransportContractAsync(UploadTransportContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadTransportContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 3PL运输合同上传
         * Summary: 3PL运输合同上传
         */
        public UploadTransportContractResponse UploadTransportContractEx(UploadTransportContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTransportContractResponse>(DoRequest("1.0", "digital.logistic.transport.contract.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运输合同上传
         * Summary: 3PL运输合同上传
         */
        public async Task<UploadTransportContractResponse> UploadTransportContractExAsync(UploadTransportContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTransportContractResponse>(await DoRequestAsync("1.0", "digital.logistic.transport.contract.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运输线路上传
         * Summary: 3PL运输线路上传
         */
        public UploadTransportRouteResponse UploadTransportRoute(UploadTransportRouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadTransportRouteEx(request, headers, runtime);
        }

        /**
         * Description: 3PL运输线路上传
         * Summary: 3PL运输线路上传
         */
        public async Task<UploadTransportRouteResponse> UploadTransportRouteAsync(UploadTransportRouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadTransportRouteExAsync(request, headers, runtime);
        }

        /**
         * Description: 3PL运输线路上传
         * Summary: 3PL运输线路上传
         */
        public UploadTransportRouteResponse UploadTransportRouteEx(UploadTransportRouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTransportRouteResponse>(DoRequest("1.0", "digital.logistic.transport.route.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运输线路上传
         * Summary: 3PL运输线路上传
         */
        public async Task<UploadTransportRouteResponse> UploadTransportRouteExAsync(UploadTransportRouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTransportRouteResponse>(await DoRequestAsync("1.0", "digital.logistic.transport.route.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运单创建
         * Summary: 3PL运单创建
         */
        public CreateTransportWaybillResponse CreateTransportWaybill(CreateTransportWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTransportWaybillEx(request, headers, runtime);
        }

        /**
         * Description: 3PL运单创建
         * Summary: 3PL运单创建
         */
        public async Task<CreateTransportWaybillResponse> CreateTransportWaybillAsync(CreateTransportWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTransportWaybillExAsync(request, headers, runtime);
        }

        /**
         * Description: 3PL运单创建
         * Summary: 3PL运单创建
         */
        public CreateTransportWaybillResponse CreateTransportWaybillEx(CreateTransportWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTransportWaybillResponse>(DoRequest("1.0", "digital.logistic.transport.waybill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运单创建
         * Summary: 3PL运单创建
         */
        public async Task<CreateTransportWaybillResponse> CreateTransportWaybillExAsync(CreateTransportWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTransportWaybillResponse>(await DoRequestAsync("1.0", "digital.logistic.transport.waybill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运单状态更新
         * Summary: 3PL运单状态更新
         */
        public UpdateWaybillActionResponse UpdateWaybillAction(UpdateWaybillActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateWaybillActionEx(request, headers, runtime);
        }

        /**
         * Description: 3PL运单状态更新
         * Summary: 3PL运单状态更新
         */
        public async Task<UpdateWaybillActionResponse> UpdateWaybillActionAsync(UpdateWaybillActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateWaybillActionExAsync(request, headers, runtime);
        }

        /**
         * Description: 3PL运单状态更新
         * Summary: 3PL运单状态更新
         */
        public UpdateWaybillActionResponse UpdateWaybillActionEx(UpdateWaybillActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWaybillActionResponse>(DoRequest("1.0", "digital.logistic.waybill.action.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运单状态更新
         * Summary: 3PL运单状态更新
         */
        public async Task<UpdateWaybillActionResponse> UpdateWaybillActionExAsync(UpdateWaybillActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWaybillActionResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.action.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运单修改
         * Summary: 3PL运单修改
         */
        public UpdateTransportWaybillResponse UpdateTransportWaybill(UpdateTransportWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTransportWaybillEx(request, headers, runtime);
        }

        /**
         * Description: 3PL运单修改
         * Summary: 3PL运单修改
         */
        public async Task<UpdateTransportWaybillResponse> UpdateTransportWaybillAsync(UpdateTransportWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTransportWaybillExAsync(request, headers, runtime);
        }

        /**
         * Description: 3PL运单修改
         * Summary: 3PL运单修改
         */
        public UpdateTransportWaybillResponse UpdateTransportWaybillEx(UpdateTransportWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTransportWaybillResponse>(DoRequest("1.0", "digital.logistic.transport.waybill.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL运单修改
         * Summary: 3PL运单修改
         */
        public async Task<UpdateTransportWaybillResponse> UpdateTransportWaybillExAsync(UpdateTransportWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTransportWaybillResponse>(await DoRequestAsync("1.0", "digital.logistic.transport.waybill.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL回单上传
         * Summary: 3PL回单上传
         */
        public UploadTransportReceiptResponse UploadTransportReceipt(UploadTransportReceiptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadTransportReceiptEx(request, headers, runtime);
        }

        /**
         * Description: 3PL回单上传
         * Summary: 3PL回单上传
         */
        public async Task<UploadTransportReceiptResponse> UploadTransportReceiptAsync(UploadTransportReceiptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadTransportReceiptExAsync(request, headers, runtime);
        }

        /**
         * Description: 3PL回单上传
         * Summary: 3PL回单上传
         */
        public UploadTransportReceiptResponse UploadTransportReceiptEx(UploadTransportReceiptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTransportReceiptResponse>(DoRequest("1.0", "digital.logistic.transport.receipt.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3PL回单上传
         * Summary: 3PL回单上传
         */
        public async Task<UploadTransportReceiptResponse> UploadTransportReceiptExAsync(UploadTransportReceiptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTransportReceiptResponse>(await DoRequestAsync("1.0", "digital.logistic.transport.receipt.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单创建
         * Summary: 应收账单创建
         */
        public CreateBillReceivablebillResponse CreateBillReceivablebill(CreateBillReceivablebillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBillReceivablebillEx(request, headers, runtime);
        }

        /**
         * Description: 应收账单创建
         * Summary: 应收账单创建
         */
        public async Task<CreateBillReceivablebillResponse> CreateBillReceivablebillAsync(CreateBillReceivablebillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBillReceivablebillExAsync(request, headers, runtime);
        }

        /**
         * Description: 应收账单创建
         * Summary: 应收账单创建
         */
        public CreateBillReceivablebillResponse CreateBillReceivablebillEx(CreateBillReceivablebillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBillReceivablebillResponse>(DoRequest("1.0", "digital.logistic.bill.receivablebill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单创建
         * Summary: 应收账单创建
         */
        public async Task<CreateBillReceivablebillResponse> CreateBillReceivablebillExAsync(CreateBillReceivablebillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBillReceivablebillResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.receivablebill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单状态更新
         * Summary: 应收账单状态更新
         */
        public UpdateReceivablebillStatusResponse UpdateReceivablebillStatus(UpdateReceivablebillStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateReceivablebillStatusEx(request, headers, runtime);
        }

        /**
         * Description: 应收账单状态更新
         * Summary: 应收账单状态更新
         */
        public async Task<UpdateReceivablebillStatusResponse> UpdateReceivablebillStatusAsync(UpdateReceivablebillStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateReceivablebillStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 应收账单状态更新
         * Summary: 应收账单状态更新
         */
        public UpdateReceivablebillStatusResponse UpdateReceivablebillStatusEx(UpdateReceivablebillStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateReceivablebillStatusResponse>(DoRequest("1.0", "digital.logistic.receivablebill.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单状态更新
         * Summary: 应收账单状态更新
         */
        public async Task<UpdateReceivablebillStatusResponse> UpdateReceivablebillStatusExAsync(UpdateReceivablebillStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateReceivablebillStatusResponse>(await DoRequestAsync("1.0", "digital.logistic.receivablebill.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单修改
         * Summary: 应收账单修改
         */
        public UpdateBillReceivablebillResponse UpdateBillReceivablebill(UpdateBillReceivablebillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBillReceivablebillEx(request, headers, runtime);
        }

        /**
         * Description: 应收账单修改
         * Summary: 应收账单修改
         */
        public async Task<UpdateBillReceivablebillResponse> UpdateBillReceivablebillAsync(UpdateBillReceivablebillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBillReceivablebillExAsync(request, headers, runtime);
        }

        /**
         * Description: 应收账单修改
         * Summary: 应收账单修改
         */
        public UpdateBillReceivablebillResponse UpdateBillReceivablebillEx(UpdateBillReceivablebillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillReceivablebillResponse>(DoRequest("1.0", "digital.logistic.bill.receivablebill.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单修改
         * Summary: 应收账单修改
         */
        public async Task<UpdateBillReceivablebillResponse> UpdateBillReceivablebillExAsync(UpdateBillReceivablebillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillReceivablebillResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.receivablebill.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 路运发票创建
         * Summary: 路运发票创建
         */
        public CreateHighwayInvoiceResponse CreateHighwayInvoice(CreateHighwayInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateHighwayInvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 路运发票创建
         * Summary: 路运发票创建
         */
        public async Task<CreateHighwayInvoiceResponse> CreateHighwayInvoiceAsync(CreateHighwayInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateHighwayInvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 路运发票创建
         * Summary: 路运发票创建
         */
        public CreateHighwayInvoiceResponse CreateHighwayInvoiceEx(CreateHighwayInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateHighwayInvoiceResponse>(DoRequest("1.0", "digital.logistic.highway.invoice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 路运发票创建
         * Summary: 路运发票创建
         */
        public async Task<CreateHighwayInvoiceResponse> CreateHighwayInvoiceExAsync(CreateHighwayInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateHighwayInvoiceResponse>(await DoRequestAsync("1.0", "digital.logistic.highway.invoice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询运单信息
         * Summary: 运单信息查询
         */
        public QueryWaybillInfoResponse QueryWaybillInfo(QueryWaybillInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWaybillInfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询运单信息
         * Summary: 运单信息查询
         */
        public async Task<QueryWaybillInfoResponse> QueryWaybillInfoAsync(QueryWaybillInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWaybillInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询运单信息
         * Summary: 运单信息查询
         */
        public QueryWaybillInfoResponse QueryWaybillInfoEx(QueryWaybillInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWaybillInfoResponse>(DoRequest("1.0", "digital.logistic.waybill.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询运单信息
         * Summary: 运单信息查询
         */
        public async Task<QueryWaybillInfoResponse> QueryWaybillInfoExAsync(QueryWaybillInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWaybillInfoResponse>(await DoRequestAsync("1.0", "digital.logistic.waybill.info.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单创建无明细版
         * Summary: 应收账单创建无明细版
         */
        public CreateBillReceivablebillnodetailResponse CreateBillReceivablebillnodetail(CreateBillReceivablebillnodetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBillReceivablebillnodetailEx(request, headers, runtime);
        }

        /**
         * Description: 应收账单创建无明细版
         * Summary: 应收账单创建无明细版
         */
        public async Task<CreateBillReceivablebillnodetailResponse> CreateBillReceivablebillnodetailAsync(CreateBillReceivablebillnodetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBillReceivablebillnodetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 应收账单创建无明细版
         * Summary: 应收账单创建无明细版
         */
        public CreateBillReceivablebillnodetailResponse CreateBillReceivablebillnodetailEx(CreateBillReceivablebillnodetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBillReceivablebillnodetailResponse>(DoRequest("1.0", "digital.logistic.bill.receivablebillnodetail.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单创建无明细版
         * Summary: 应收账单创建无明细版
         */
        public async Task<CreateBillReceivablebillnodetailResponse> CreateBillReceivablebillnodetailExAsync(CreateBillReceivablebillnodetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBillReceivablebillnodetailResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.receivablebillnodetail.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业信息上传/更新
         * Summary: 企业信息上传/更新
         */
        public SaveTrailerCorpResponse SaveTrailerCorp(SaveTrailerCorpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveTrailerCorpEx(request, headers, runtime);
        }

        /**
         * Description: 企业信息上传/更新
         * Summary: 企业信息上传/更新
         */
        public async Task<SaveTrailerCorpResponse> SaveTrailerCorpAsync(SaveTrailerCorpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveTrailerCorpExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业信息上传/更新
         * Summary: 企业信息上传/更新
         */
        public SaveTrailerCorpResponse SaveTrailerCorpEx(SaveTrailerCorpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveTrailerCorpResponse>(DoRequest("1.0", "digital.logistic.trailer.corp.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业信息上传/更新
         * Summary: 企业信息上传/更新
         */
        public async Task<SaveTrailerCorpResponse> SaveTrailerCorpExAsync(SaveTrailerCorpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveTrailerCorpResponse>(await DoRequestAsync("1.0", "digital.logistic.trailer.corp.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业运营数据上传/更新
         * Summary: 企业运营数据上传/更新
         */
        public SaveTrailerTransportResponse SaveTrailerTransport(SaveTrailerTransportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveTrailerTransportEx(request, headers, runtime);
        }

        /**
         * Description: 企业运营数据上传/更新
         * Summary: 企业运营数据上传/更新
         */
        public async Task<SaveTrailerTransportResponse> SaveTrailerTransportAsync(SaveTrailerTransportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveTrailerTransportExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业运营数据上传/更新
         * Summary: 企业运营数据上传/更新
         */
        public SaveTrailerTransportResponse SaveTrailerTransportEx(SaveTrailerTransportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveTrailerTransportResponse>(DoRequest("1.0", "digital.logistic.trailer.transport.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业运营数据上传/更新
         * Summary: 企业运营数据上传/更新
         */
        public async Task<SaveTrailerTransportResponse> SaveTrailerTransportExAsync(SaveTrailerTransportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveTrailerTransportResponse>(await DoRequestAsync("1.0", "digital.logistic.trailer.transport.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据实例id，查询实例状态
         * Summary: 实例状态查询
         */
        public QueryBusinessInstancestatusResponse QueryBusinessInstancestatus(QueryBusinessInstancestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBusinessInstancestatusEx(request, headers, runtime);
        }

        /**
         * Description: 根据实例id，查询实例状态
         * Summary: 实例状态查询
         */
        public async Task<QueryBusinessInstancestatusResponse> QueryBusinessInstancestatusAsync(QueryBusinessInstancestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBusinessInstancestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据实例id，查询实例状态
         * Summary: 实例状态查询
         */
        public QueryBusinessInstancestatusResponse QueryBusinessInstancestatusEx(QueryBusinessInstancestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessInstancestatusResponse>(DoRequest("1.0", "digital.logistic.business.instancestatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据实例id，查询实例状态
         * Summary: 实例状态查询
         */
        public async Task<QueryBusinessInstancestatusResponse> QueryBusinessInstancestatusExAsync(QueryBusinessInstancestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessInstancestatusResponse>(await DoRequestAsync("1.0", "digital.logistic.business.instancestatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 司机信用流转协议签署并开通流转能力
         * Summary: 司机信用流转协议签署并开通流转能力
         */
        public OpenCreditDriverResponse OpenCreditDriver(OpenCreditDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenCreditDriverEx(request, headers, runtime);
        }

        /**
         * Description: 司机信用流转协议签署并开通流转能力
         * Summary: 司机信用流转协议签署并开通流转能力
         */
        public async Task<OpenCreditDriverResponse> OpenCreditDriverAsync(OpenCreditDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenCreditDriverExAsync(request, headers, runtime);
        }

        /**
         * Description: 司机信用流转协议签署并开通流转能力
         * Summary: 司机信用流转协议签署并开通流转能力
         */
        public OpenCreditDriverResponse OpenCreditDriverEx(OpenCreditDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenCreditDriverResponse>(DoRequest("1.0", "digital.logistic.credit.driver.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 司机信用流转协议签署并开通流转能力
         * Summary: 司机信用流转协议签署并开通流转能力
         */
        public async Task<OpenCreditDriverResponse> OpenCreditDriverExAsync(OpenCreditDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenCreditDriverResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.driver.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询司机信用流转能力开通情况
         * Summary: 查询司机信用流转能力开通情况
         */
        public QueryCreditDriverResponse QueryCreditDriver(QueryCreditDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditDriverEx(request, headers, runtime);
        }

        /**
         * Description: 查询司机信用流转能力开通情况
         * Summary: 查询司机信用流转能力开通情况
         */
        public async Task<QueryCreditDriverResponse> QueryCreditDriverAsync(QueryCreditDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditDriverExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询司机信用流转能力开通情况
         * Summary: 查询司机信用流转能力开通情况
         */
        public QueryCreditDriverResponse QueryCreditDriverEx(QueryCreditDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditDriverResponse>(DoRequest("1.0", "digital.logistic.credit.driver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询司机信用流转能力开通情况
         * Summary: 查询司机信用流转能力开通情况
         */
        public async Task<QueryCreditDriverResponse> QueryCreditDriverExAsync(QueryCreditDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditDriverResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.driver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询货主信用流转能力开通情况
         * Summary: 查询货主信用流转能力开通情况
         */
        public QueryCreditConsignorResponse QueryCreditConsignor(QueryCreditConsignorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditConsignorEx(request, headers, runtime);
        }

        /**
         * Description: 查询货主信用流转能力开通情况
         * Summary: 查询货主信用流转能力开通情况
         */
        public async Task<QueryCreditConsignorResponse> QueryCreditConsignorAsync(QueryCreditConsignorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditConsignorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询货主信用流转能力开通情况
         * Summary: 查询货主信用流转能力开通情况
         */
        public QueryCreditConsignorResponse QueryCreditConsignorEx(QueryCreditConsignorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditConsignorResponse>(DoRequest("1.0", "digital.logistic.credit.consignor.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询货主信用流转能力开通情况
         * Summary: 查询货主信用流转能力开通情况
         */
        public async Task<QueryCreditConsignorResponse> QueryCreditConsignorExAsync(QueryCreditConsignorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditConsignorResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.consignor.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询货主信用流转额度
         * Summary: 查询货主信用流转额度
         */
        public QueryCreditBalanceResponse QueryCreditBalance(QueryCreditBalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditBalanceEx(request, headers, runtime);
        }

        /**
         * Description: 查询货主信用流转额度
         * Summary: 查询货主信用流转额度
         */
        public async Task<QueryCreditBalanceResponse> QueryCreditBalanceAsync(QueryCreditBalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditBalanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询货主信用流转额度
         * Summary: 查询货主信用流转额度
         */
        public QueryCreditBalanceResponse QueryCreditBalanceEx(QueryCreditBalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditBalanceResponse>(DoRequest("1.0", "digital.logistic.credit.balance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询货主信用流转额度
         * Summary: 查询货主信用流转额度
         */
        public async Task<QueryCreditBalanceResponse> QueryCreditBalanceExAsync(QueryCreditBalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditBalanceResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.balance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
         * Summary: 发行信用流转批次信息上传
         */
        public UploadCreditIssueResponse UploadCreditIssue(UploadCreditIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadCreditIssueEx(request, headers, runtime);
        }

        /**
         * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
         * Summary: 发行信用流转批次信息上传
         */
        public async Task<UploadCreditIssueResponse> UploadCreditIssueAsync(UploadCreditIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadCreditIssueExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
         * Summary: 发行信用流转批次信息上传
         */
        public UploadCreditIssueResponse UploadCreditIssueEx(UploadCreditIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditIssueResponse>(DoRequest("1.0", "digital.logistic.credit.issue.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
         * Summary: 发行信用流转批次信息上传
         */
        public async Task<UploadCreditIssueResponse> UploadCreditIssueExAsync(UploadCreditIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditIssueResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issue.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转批次状态查询
         * Summary: 信用流转批次状态查询
         */
        public QueryCreditIssuebatchstatusResponse QueryCreditIssuebatchstatus(QueryCreditIssuebatchstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditIssuebatchstatusEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转批次状态查询
         * Summary: 信用流转批次状态查询
         */
        public async Task<QueryCreditIssuebatchstatusResponse> QueryCreditIssuebatchstatusAsync(QueryCreditIssuebatchstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditIssuebatchstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转批次状态查询
         * Summary: 信用流转批次状态查询
         */
        public QueryCreditIssuebatchstatusResponse QueryCreditIssuebatchstatusEx(QueryCreditIssuebatchstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuebatchstatusResponse>(DoRequest("1.0", "digital.logistic.credit.issuebatchstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转批次状态查询
         * Summary: 信用流转批次状态查询
         */
        public async Task<QueryCreditIssuebatchstatusResponse> QueryCreditIssuebatchstatusExAsync(QueryCreditIssuebatchstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuebatchstatusResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuebatchstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付批次撤销
         * Summary: 支付批次撤销
         */
        public CancelCreditIssuebatchResponse CancelCreditIssuebatch(CancelCreditIssuebatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelCreditIssuebatchEx(request, headers, runtime);
        }

        /**
         * Description: 支付批次撤销
         * Summary: 支付批次撤销
         */
        public async Task<CancelCreditIssuebatchResponse> CancelCreditIssuebatchAsync(CancelCreditIssuebatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelCreditIssuebatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付批次撤销
         * Summary: 支付批次撤销
         */
        public CancelCreditIssuebatchResponse CancelCreditIssuebatchEx(CancelCreditIssuebatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelCreditIssuebatchResponse>(DoRequest("1.0", "digital.logistic.credit.issuebatch.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付批次撤销
         * Summary: 支付批次撤销
         */
        public async Task<CancelCreditIssuebatchResponse> CancelCreditIssuebatchExAsync(CancelCreditIssuebatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelCreditIssuebatchResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuebatch.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据id查询信用凭证信息
         * Summary: 根据id查询信用凭证信息
         */
        public QueryCreditIssuebyidResponse QueryCreditIssuebyid(QueryCreditIssuebyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditIssuebyidEx(request, headers, runtime);
        }

        /**
         * Description: 根据id查询信用凭证信息
         * Summary: 根据id查询信用凭证信息
         */
        public async Task<QueryCreditIssuebyidResponse> QueryCreditIssuebyidAsync(QueryCreditIssuebyidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditIssuebyidExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据id查询信用凭证信息
         * Summary: 根据id查询信用凭证信息
         */
        public QueryCreditIssuebyidResponse QueryCreditIssuebyidEx(QueryCreditIssuebyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuebyidResponse>(DoRequest("1.0", "digital.logistic.credit.issuebyid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据id查询信用凭证信息
         * Summary: 根据id查询信用凭证信息
         */
        public async Task<QueryCreditIssuebyidResponse> QueryCreditIssuebyidExAsync(QueryCreditIssuebyidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuebyidResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuebyid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据时间查询信用凭证信息
         * Summary: 根据时间查询信用凭证信息
         */
        public QueryCreditIssuebytimeResponse QueryCreditIssuebytime(QueryCreditIssuebytimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditIssuebytimeEx(request, headers, runtime);
        }

        /**
         * Description: 根据时间查询信用凭证信息
         * Summary: 根据时间查询信用凭证信息
         */
        public async Task<QueryCreditIssuebytimeResponse> QueryCreditIssuebytimeAsync(QueryCreditIssuebytimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditIssuebytimeExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据时间查询信用凭证信息
         * Summary: 根据时间查询信用凭证信息
         */
        public QueryCreditIssuebytimeResponse QueryCreditIssuebytimeEx(QueryCreditIssuebytimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuebytimeResponse>(DoRequest("1.0", "digital.logistic.credit.issuebytime.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据时间查询信用凭证信息
         * Summary: 根据时间查询信用凭证信息
         */
        public async Task<QueryCreditIssuebytimeResponse> QueryCreditIssuebytimeExAsync(QueryCreditIssuebytimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuebytimeResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuebytime.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户持有的信用凭证信息
         * Summary: 查询用户持有的信用凭证信息
         */
        public QueryCreditUserissueResponse QueryCreditUserissue(QueryCreditUserissueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditUserissueEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户持有的信用凭证信息
         * Summary: 查询用户持有的信用凭证信息
         */
        public async Task<QueryCreditUserissueResponse> QueryCreditUserissueAsync(QueryCreditUserissueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditUserissueExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户持有的信用凭证信息
         * Summary: 查询用户持有的信用凭证信息
         */
        public QueryCreditUserissueResponse QueryCreditUserissueEx(QueryCreditUserissueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditUserissueResponse>(DoRequest("1.0", "digital.logistic.credit.userissue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户持有的信用凭证信息
         * Summary: 查询用户持有的信用凭证信息
         */
        public async Task<QueryCreditUserissueResponse> QueryCreditUserissueExAsync(QueryCreditUserissueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditUserissueResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.userissue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信用流转流水记录
         * Summary: 查询用户信用流转流水记录
         */
        public QueryCreditStatementResponse QueryCreditStatement(QueryCreditStatementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditStatementEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户信用流转流水记录
         * Summary: 查询用户信用流转流水记录
         */
        public async Task<QueryCreditStatementResponse> QueryCreditStatementAsync(QueryCreditStatementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditStatementExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户信用流转流水记录
         * Summary: 查询用户信用流转流水记录
         */
        public QueryCreditStatementResponse QueryCreditStatementEx(QueryCreditStatementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditStatementResponse>(DoRequest("1.0", "digital.logistic.credit.statement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信用流转流水记录
         * Summary: 查询用户信用流转流水记录
         */
        public async Task<QueryCreditStatementResponse> QueryCreditStatementExAsync(QueryCreditStatementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditStatementResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.statement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证拆分转让申请
         * Summary: 信用凭证拆分转让申请
         */
        public CreateCreditIssuetransferResponse CreateCreditIssuetransfer(CreateCreditIssuetransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCreditIssuetransferEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证拆分转让申请
         * Summary: 信用凭证拆分转让申请
         */
        public async Task<CreateCreditIssuetransferResponse> CreateCreditIssuetransferAsync(CreateCreditIssuetransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCreditIssuetransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证拆分转让申请
         * Summary: 信用凭证拆分转让申请
         */
        public CreateCreditIssuetransferResponse CreateCreditIssuetransferEx(CreateCreditIssuetransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCreditIssuetransferResponse>(DoRequest("1.0", "digital.logistic.credit.issuetransfer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证拆分转让申请
         * Summary: 信用凭证拆分转让申请
         */
        public async Task<CreateCreditIssuetransferResponse> CreateCreditIssuetransferExAsync(CreateCreditIssuetransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCreditIssuetransferResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuetransfer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证拆分转让结果查询
         * Summary: 信用凭证拆分转让结果查询
         */
        public QueryCreditIssuetransferResponse QueryCreditIssuetransfer(QueryCreditIssuetransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditIssuetransferEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证拆分转让结果查询
         * Summary: 信用凭证拆分转让结果查询
         */
        public async Task<QueryCreditIssuetransferResponse> QueryCreditIssuetransferAsync(QueryCreditIssuetransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditIssuetransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证拆分转让结果查询
         * Summary: 信用凭证拆分转让结果查询
         */
        public QueryCreditIssuetransferResponse QueryCreditIssuetransferEx(QueryCreditIssuetransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuetransferResponse>(DoRequest("1.0", "digital.logistic.credit.issuetransfer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证拆分转让结果查询
         * Summary: 信用凭证拆分转让结果查询
         */
        public async Task<QueryCreditIssuetransferResponse> QueryCreditIssuetransferExAsync(QueryCreditIssuetransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuetransferResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuetransfer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证融资申请
         * Summary: 信用凭证融资申请
         */
        public CreateCreditIssuefinanceResponse CreateCreditIssuefinance(CreateCreditIssuefinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCreditIssuefinanceEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证融资申请
         * Summary: 信用凭证融资申请
         */
        public async Task<CreateCreditIssuefinanceResponse> CreateCreditIssuefinanceAsync(CreateCreditIssuefinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCreditIssuefinanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证融资申请
         * Summary: 信用凭证融资申请
         */
        public CreateCreditIssuefinanceResponse CreateCreditIssuefinanceEx(CreateCreditIssuefinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCreditIssuefinanceResponse>(DoRequest("1.0", "digital.logistic.credit.issuefinance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证融资申请
         * Summary: 信用凭证融资申请
         */
        public async Task<CreateCreditIssuefinanceResponse> CreateCreditIssuefinanceExAsync(CreateCreditIssuefinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCreditIssuefinanceResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuefinance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证融资结果查询
         * Summary: 信用凭证融资结果查询
         */
        public QueryCreditIssuefinanceResponse QueryCreditIssuefinance(QueryCreditIssuefinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditIssuefinanceEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证融资结果查询
         * Summary: 信用凭证融资结果查询
         */
        public async Task<QueryCreditIssuefinanceResponse> QueryCreditIssuefinanceAsync(QueryCreditIssuefinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditIssuefinanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证融资结果查询
         * Summary: 信用凭证融资结果查询
         */
        public QueryCreditIssuefinanceResponse QueryCreditIssuefinanceEx(QueryCreditIssuefinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuefinanceResponse>(DoRequest("1.0", "digital.logistic.credit.issuefinance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证融资结果查询
         * Summary: 信用凭证融资结果查询
         */
        public async Task<QueryCreditIssuefinanceResponse> QueryCreditIssuefinanceExAsync(QueryCreditIssuefinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuefinanceResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuefinance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证清分信息查询
         * Summary: 信用凭证清分信息查询
         */
        public QueryCreditIssuereceivableResponse QueryCreditIssuereceivable(QueryCreditIssuereceivableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditIssuereceivableEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证清分信息查询
         * Summary: 信用凭证清分信息查询
         */
        public async Task<QueryCreditIssuereceivableResponse> QueryCreditIssuereceivableAsync(QueryCreditIssuereceivableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditIssuereceivableExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证清分信息查询
         * Summary: 信用凭证清分信息查询
         */
        public QueryCreditIssuereceivableResponse QueryCreditIssuereceivableEx(QueryCreditIssuereceivableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuereceivableResponse>(DoRequest("1.0", "digital.logistic.credit.issuereceivable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证清分信息查询
         * Summary: 信用凭证清分信息查询
         */
        public async Task<QueryCreditIssuereceivableResponse> QueryCreditIssuereceivableExAsync(QueryCreditIssuereceivableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuereceivableResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuereceivable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证资产查询
         * Summary: 信用凭证资产查询
         */
        public QueryCreditIssueamountResponse QueryCreditIssueamount(QueryCreditIssueamountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditIssueamountEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证资产查询
         * Summary: 信用凭证资产查询
         */
        public async Task<QueryCreditIssueamountResponse> QueryCreditIssueamountAsync(QueryCreditIssueamountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditIssueamountExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证资产查询
         * Summary: 信用凭证资产查询
         */
        public QueryCreditIssueamountResponse QueryCreditIssueamountEx(QueryCreditIssueamountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssueamountResponse>(DoRequest("1.0", "digital.logistic.credit.issueamount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证资产查询
         * Summary: 信用凭证资产查询
         */
        public async Task<QueryCreditIssueamountResponse> QueryCreditIssueamountExAsync(QueryCreditIssueamountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssueamountResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issueamount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流金融统一回调接口
         * Summary: 物流金融统一回调接口
         */
        public CallbackCreditCommonResponse CallbackCreditCommon(CallbackCreditCommonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackCreditCommonEx(request, headers, runtime);
        }

        /**
         * Description: 物流金融统一回调接口
         * Summary: 物流金融统一回调接口
         */
        public async Task<CallbackCreditCommonResponse> CallbackCreditCommonAsync(CallbackCreditCommonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackCreditCommonExAsync(request, headers, runtime);
        }

        /**
         * Description: 物流金融统一回调接口
         * Summary: 物流金融统一回调接口
         */
        public CallbackCreditCommonResponse CallbackCreditCommonEx(CallbackCreditCommonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackCreditCommonResponse>(DoRequest("1.0", "digital.logistic.credit.common.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流金融统一回调接口
         * Summary: 物流金融统一回调接口
         */
        public async Task<CallbackCreditCommonResponse> CallbackCreditCommonExAsync(CallbackCreditCommonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackCreditCommonResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.common.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证主动清分
         * Summary: 信用凭证主动清分
         */
        public ApplyCreditIssueclearResponse ApplyCreditIssueclear(ApplyCreditIssueclearRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyCreditIssueclearEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证主动清分
         * Summary: 信用凭证主动清分
         */
        public async Task<ApplyCreditIssueclearResponse> ApplyCreditIssueclearAsync(ApplyCreditIssueclearRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyCreditIssueclearExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证主动清分
         * Summary: 信用凭证主动清分
         */
        public ApplyCreditIssueclearResponse ApplyCreditIssueclearEx(ApplyCreditIssueclearRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyCreditIssueclearResponse>(DoRequest("1.0", "digital.logistic.credit.issueclear.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证主动清分
         * Summary: 信用凭证主动清分
         */
        public async Task<ApplyCreditIssueclearResponse> ApplyCreditIssueclearExAsync(ApplyCreditIssueclearRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyCreditIssueclearResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issueclear.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流金融代理消息
         * Summary: 物流金融代理消息
         */
        public SendCreditProxyResponse SendCreditProxy(SendCreditProxyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendCreditProxyEx(request, headers, runtime);
        }

        /**
         * Description: 物流金融代理消息
         * Summary: 物流金融代理消息
         */
        public async Task<SendCreditProxyResponse> SendCreditProxyAsync(SendCreditProxyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendCreditProxyExAsync(request, headers, runtime);
        }

        /**
         * Description: 物流金融代理消息
         * Summary: 物流金融代理消息
         */
        public SendCreditProxyResponse SendCreditProxyEx(SendCreditProxyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCreditProxyResponse>(DoRequest("1.0", "digital.logistic.credit.proxy.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流金融代理消息
         * Summary: 物流金融代理消息
         */
        public async Task<SendCreditProxyResponse> SendCreditProxyExAsync(SendCreditProxyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCreditProxyResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.proxy.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运单信用流转核验结果查询
         * Summary: 运单信用流转核验结果查询
         */
        public CheckCreditWaybillResponse CheckCreditWaybill(CheckCreditWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCreditWaybillEx(request, headers, runtime);
        }

        /**
         * Description: 运单信用流转核验结果查询
         * Summary: 运单信用流转核验结果查询
         */
        public async Task<CheckCreditWaybillResponse> CheckCreditWaybillAsync(CheckCreditWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCreditWaybillExAsync(request, headers, runtime);
        }

        /**
         * Description: 运单信用流转核验结果查询
         * Summary: 运单信用流转核验结果查询
         */
        public CheckCreditWaybillResponse CheckCreditWaybillEx(CheckCreditWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCreditWaybillResponse>(DoRequest("1.0", "digital.logistic.credit.waybill.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 运单信用流转核验结果查询
         * Summary: 运单信用流转核验结果查询
         */
        public async Task<CheckCreditWaybillResponse> CheckCreditWaybillExAsync(CheckCreditWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCreditWaybillResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.waybill.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流金融信用流转司机换绑
         * Summary: 物流金融信用流转司机换绑
         */
        public ReopenCreditDriverResponse ReopenCreditDriver(ReopenCreditDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReopenCreditDriverEx(request, headers, runtime);
        }

        /**
         * Description: 物流金融信用流转司机换绑
         * Summary: 物流金融信用流转司机换绑
         */
        public async Task<ReopenCreditDriverResponse> ReopenCreditDriverAsync(ReopenCreditDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReopenCreditDriverExAsync(request, headers, runtime);
        }

        /**
         * Description: 物流金融信用流转司机换绑
         * Summary: 物流金融信用流转司机换绑
         */
        public ReopenCreditDriverResponse ReopenCreditDriverEx(ReopenCreditDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReopenCreditDriverResponse>(DoRequest("1.0", "digital.logistic.credit.driver.reopen", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流金融信用流转司机换绑
         * Summary: 物流金融信用流转司机换绑
         */
        public async Task<ReopenCreditDriverResponse> ReopenCreditDriverExAsync(ReopenCreditDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReopenCreditDriverResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.driver.reopen", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线下协议授权关系上传
         * Summary: 线下协议授权关系上传
         */
        public UploadCreditAuthorizationResponse UploadCreditAuthorization(UploadCreditAuthorizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadCreditAuthorizationEx(request, headers, runtime);
        }

        /**
         * Description: 线下协议授权关系上传
         * Summary: 线下协议授权关系上传
         */
        public async Task<UploadCreditAuthorizationResponse> UploadCreditAuthorizationAsync(UploadCreditAuthorizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadCreditAuthorizationExAsync(request, headers, runtime);
        }

        /**
         * Description: 线下协议授权关系上传
         * Summary: 线下协议授权关系上传
         */
        public UploadCreditAuthorizationResponse UploadCreditAuthorizationEx(UploadCreditAuthorizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditAuthorizationResponse>(DoRequest("1.0", "digital.logistic.credit.authorization.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线下协议授权关系上传
         * Summary: 线下协议授权关系上传
         */
        public async Task<UploadCreditAuthorizationResponse> UploadCreditAuthorizationExAsync(UploadCreditAuthorizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditAuthorizationResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.authorization.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线上应收转让确认关系
         * Summary: 线上应收转让确认关系
         */
        public UploadCreditConfirmResponse UploadCreditConfirm(UploadCreditConfirmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadCreditConfirmEx(request, headers, runtime);
        }

        /**
         * Description: 线上应收转让确认关系
         * Summary: 线上应收转让确认关系
         */
        public async Task<UploadCreditConfirmResponse> UploadCreditConfirmAsync(UploadCreditConfirmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadCreditConfirmExAsync(request, headers, runtime);
        }

        /**
         * Description: 线上应收转让确认关系
         * Summary: 线上应收转让确认关系
         */
        public UploadCreditConfirmResponse UploadCreditConfirmEx(UploadCreditConfirmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditConfirmResponse>(DoRequest("1.0", "digital.logistic.credit.confirm.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 线上应收转让确认关系
         * Summary: 线上应收转让确认关系
         */
        public async Task<UploadCreditConfirmResponse> UploadCreditConfirmExAsync(UploadCreditConfirmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditConfirmResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.confirm.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流信用流转凭证批量发行
         * Summary: 物流信用流转凭证批量发行
         */
        public BatchcreateCreditmodeIssueResponse BatchcreateCreditmodeIssue(BatchcreateCreditmodeIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateCreditmodeIssueEx(request, headers, runtime);
        }

        /**
         * Description: 物流信用流转凭证批量发行
         * Summary: 物流信用流转凭证批量发行
         */
        public async Task<BatchcreateCreditmodeIssueResponse> BatchcreateCreditmodeIssueAsync(BatchcreateCreditmodeIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateCreditmodeIssueExAsync(request, headers, runtime);
        }

        /**
         * Description: 物流信用流转凭证批量发行
         * Summary: 物流信用流转凭证批量发行
         */
        public BatchcreateCreditmodeIssueResponse BatchcreateCreditmodeIssueEx(BatchcreateCreditmodeIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateCreditmodeIssueResponse>(DoRequest("1.0", "digital.logistic.creditmode.issue.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流信用流转凭证批量发行
         * Summary: 物流信用流转凭证批量发行
         */
        public async Task<BatchcreateCreditmodeIssueResponse> BatchcreateCreditmodeIssueExAsync(BatchcreateCreditmodeIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateCreditmodeIssueResponse>(await DoRequestAsync("1.0", "digital.logistic.creditmode.issue.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流信用流转按模式主动清分
         * Summary: 物流信用流转按模式主动清分
         */
        public ApplyCreditmodeIssueclearResponse ApplyCreditmodeIssueclear(ApplyCreditmodeIssueclearRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyCreditmodeIssueclearEx(request, headers, runtime);
        }

        /**
         * Description: 物流信用流转按模式主动清分
         * Summary: 物流信用流转按模式主动清分
         */
        public async Task<ApplyCreditmodeIssueclearResponse> ApplyCreditmodeIssueclearAsync(ApplyCreditmodeIssueclearRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyCreditmodeIssueclearExAsync(request, headers, runtime);
        }

        /**
         * Description: 物流信用流转按模式主动清分
         * Summary: 物流信用流转按模式主动清分
         */
        public ApplyCreditmodeIssueclearResponse ApplyCreditmodeIssueclearEx(ApplyCreditmodeIssueclearRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyCreditmodeIssueclearResponse>(DoRequest("1.0", "digital.logistic.creditmode.issueclear.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流信用流转按模式主动清分
         * Summary: 物流信用流转按模式主动清分
         */
        public async Task<ApplyCreditmodeIssueclearResponse> ApplyCreditmodeIssueclearExAsync(ApplyCreditmodeIssueclearRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyCreditmodeIssueclearResponse>(await DoRequestAsync("1.0", "digital.logistic.creditmode.issueclear.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转发行信息上传SAAS版
         * Summary: 信用流转发行信息上传SAAS版
         */
        public UploadCreditIssuebysaasResponse UploadCreditIssuebysaas(UploadCreditIssuebysaasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadCreditIssuebysaasEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转发行信息上传SAAS版
         * Summary: 信用流转发行信息上传SAAS版
         */
        public async Task<UploadCreditIssuebysaasResponse> UploadCreditIssuebysaasAsync(UploadCreditIssuebysaasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadCreditIssuebysaasExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转发行信息上传SAAS版
         * Summary: 信用流转发行信息上传SAAS版
         */
        public UploadCreditIssuebysaasResponse UploadCreditIssuebysaasEx(UploadCreditIssuebysaasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditIssuebysaasResponse>(DoRequest("1.0", "digital.logistic.credit.issuebysaas.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转发行信息上传SAAS版
         * Summary: 信用流转发行信息上传SAAS版
         */
        public async Task<UploadCreditIssuebysaasResponse> UploadCreditIssuebysaasExAsync(UploadCreditIssuebysaasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditIssuebysaasResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuebysaas.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转B模式发行批次撤销SAAS版
         * Summary: 信用流转B模式发行批次撤销SAAS版
         */
        public CancelCreditIssuebatchbysaasResponse CancelCreditIssuebatchbysaas(CancelCreditIssuebatchbysaasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelCreditIssuebatchbysaasEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转B模式发行批次撤销SAAS版
         * Summary: 信用流转B模式发行批次撤销SAAS版
         */
        public async Task<CancelCreditIssuebatchbysaasResponse> CancelCreditIssuebatchbysaasAsync(CancelCreditIssuebatchbysaasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelCreditIssuebatchbysaasExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转B模式发行批次撤销SAAS版
         * Summary: 信用流转B模式发行批次撤销SAAS版
         */
        public CancelCreditIssuebatchbysaasResponse CancelCreditIssuebatchbysaasEx(CancelCreditIssuebatchbysaasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelCreditIssuebatchbysaasResponse>(DoRequest("1.0", "digital.logistic.credit.issuebatchbysaas.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转B模式发行批次撤销SAAS版
         * Summary: 信用流转B模式发行批次撤销SAAS版
         */
        public async Task<CancelCreditIssuebatchbysaasResponse> CancelCreditIssuebatchbysaasExAsync(CancelCreditIssuebatchbysaasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelCreditIssuebatchbysaasResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuebatchbysaas.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转可用额度查询SAAS版
         * Summary: 信用流转可用额度查询SAAS版
         */
        public QueryCreditBalancebysaasResponse QueryCreditBalancebysaas(QueryCreditBalancebysaasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditBalancebysaasEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转可用额度查询SAAS版
         * Summary: 信用流转可用额度查询SAAS版
         */
        public async Task<QueryCreditBalancebysaasResponse> QueryCreditBalancebysaasAsync(QueryCreditBalancebysaasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditBalancebysaasExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转可用额度查询SAAS版
         * Summary: 信用流转可用额度查询SAAS版
         */
        public QueryCreditBalancebysaasResponse QueryCreditBalancebysaasEx(QueryCreditBalancebysaasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditBalancebysaasResponse>(DoRequest("1.0", "digital.logistic.credit.balancebysaas.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转可用额度查询SAAS版
         * Summary: 信用流转可用额度查询SAAS版
         */
        public async Task<QueryCreditBalancebysaasResponse> QueryCreditBalancebysaasExAsync(QueryCreditBalancebysaasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditBalancebysaasResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.balancebysaas.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证电子回单获取
         * Summary: 信用凭证电子回单获取
         */
        public GetCreditIssuescpticketResponse GetCreditIssuescpticket(GetCreditIssuescpticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCreditIssuescpticketEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证电子回单获取
         * Summary: 信用凭证电子回单获取
         */
        public async Task<GetCreditIssuescpticketResponse> GetCreditIssuescpticketAsync(GetCreditIssuescpticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCreditIssuescpticketExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证电子回单获取
         * Summary: 信用凭证电子回单获取
         */
        public GetCreditIssuescpticketResponse GetCreditIssuescpticketEx(GetCreditIssuescpticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCreditIssuescpticketResponse>(DoRequest("1.0", "digital.logistic.credit.issuescpticket.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证电子回单获取
         * Summary: 信用凭证电子回单获取
         */
        public async Task<GetCreditIssuescpticketResponse> GetCreditIssuescpticketExAsync(GetCreditIssuescpticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCreditIssuescpticketResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuescpticket.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证电子回单获取结果查询接口
         * Summary: 信用凭证电子回单获取结果查询接口
         */
        public QueryCreditIssuescpticketresultResponse QueryCreditIssuescpticketresult(QueryCreditIssuescpticketresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditIssuescpticketresultEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证电子回单获取结果查询接口
         * Summary: 信用凭证电子回单获取结果查询接口
         */
        public async Task<QueryCreditIssuescpticketresultResponse> QueryCreditIssuescpticketresultAsync(QueryCreditIssuescpticketresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditIssuescpticketresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证电子回单获取结果查询接口
         * Summary: 信用凭证电子回单获取结果查询接口
         */
        public QueryCreditIssuescpticketresultResponse QueryCreditIssuescpticketresultEx(QueryCreditIssuescpticketresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuescpticketresultResponse>(DoRequest("1.0", "digital.logistic.credit.issuescpticketresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证电子回单获取结果查询接口
         * Summary: 信用凭证电子回单获取结果查询接口
         */
        public async Task<QueryCreditIssuescpticketresultResponse> QueryCreditIssuescpticketresultExAsync(QueryCreditIssuescpticketresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditIssuescpticketresultResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuescpticketresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转A+模式发行信息上传
         * Summary: 信用流转A+模式发行信息上传
         */
        public UploadCreditAplusissueResponse UploadCreditAplusissue(UploadCreditAplusissueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadCreditAplusissueEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转A+模式发行信息上传
         * Summary: 信用流转A+模式发行信息上传
         */
        public async Task<UploadCreditAplusissueResponse> UploadCreditAplusissueAsync(UploadCreditAplusissueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadCreditAplusissueExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转A+模式发行信息上传
         * Summary: 信用流转A+模式发行信息上传
         */
        public UploadCreditAplusissueResponse UploadCreditAplusissueEx(UploadCreditAplusissueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditAplusissueResponse>(DoRequest("1.0", "digital.logistic.credit.aplusissue.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转A+模式发行信息上传
         * Summary: 信用流转A+模式发行信息上传
         */
        public async Task<UploadCreditAplusissueResponse> UploadCreditAplusissueExAsync(UploadCreditAplusissueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditAplusissueResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.aplusissue.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转可用额度查询接口
         * Summary: 信用流转可用额度查询接口
         */
        public QueryCreditCreditamountResponse QueryCreditCreditamount(QueryCreditCreditamountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditCreditamountEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转可用额度查询接口
         * Summary: 信用流转可用额度查询接口
         */
        public async Task<QueryCreditCreditamountResponse> QueryCreditCreditamountAsync(QueryCreditCreditamountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditCreditamountExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转可用额度查询接口
         * Summary: 信用流转可用额度查询接口
         */
        public QueryCreditCreditamountResponse QueryCreditCreditamountEx(QueryCreditCreditamountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditCreditamountResponse>(DoRequest("1.0", "digital.logistic.credit.creditamount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转可用额度查询接口
         * Summary: 信用流转可用额度查询接口
         */
        public async Task<QueryCreditCreditamountResponse> QueryCreditCreditamountExAsync(QueryCreditCreditamountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditCreditamountResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.creditamount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转非授信通用签约接口
         * Summary: 信用流转非授信通用签约接口
         */
        public CreateCreditCommonsignResponse CreateCreditCommonsign(CreateCreditCommonsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCreditCommonsignEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转非授信通用签约接口
         * Summary: 信用流转非授信通用签约接口
         */
        public async Task<CreateCreditCommonsignResponse> CreateCreditCommonsignAsync(CreateCreditCommonsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCreditCommonsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转非授信通用签约接口
         * Summary: 信用流转非授信通用签约接口
         */
        public CreateCreditCommonsignResponse CreateCreditCommonsignEx(CreateCreditCommonsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCreditCommonsignResponse>(DoRequest("1.0", "digital.logistic.credit.commonsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转非授信通用签约接口
         * Summary: 信用流转非授信通用签约接口
         */
        public async Task<CreateCreditCommonsignResponse> CreateCreditCommonsignExAsync(CreateCreditCommonsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCreditCommonsignResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.commonsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转非授信通用签约查询接口
         * Summary: 信用流转非授信通用签约查询接口
         */
        public QueryCreditCommonsignResponse QueryCreditCommonsign(QueryCreditCommonsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCreditCommonsignEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转非授信通用签约查询接口
         * Summary: 信用流转非授信通用签约查询接口
         */
        public async Task<QueryCreditCommonsignResponse> QueryCreditCommonsignAsync(QueryCreditCommonsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCreditCommonsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转非授信通用签约查询接口
         * Summary: 信用流转非授信通用签约查询接口
         */
        public QueryCreditCommonsignResponse QueryCreditCommonsignEx(QueryCreditCommonsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditCommonsignResponse>(DoRequest("1.0", "digital.logistic.credit.commonsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转非授信通用签约查询接口
         * Summary: 信用流转非授信通用签约查询接口
         */
        public async Task<QueryCreditCommonsignResponse> QueryCreditCommonsignExAsync(QueryCreditCommonsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCreditCommonsignResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.commonsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转凭证合并发行接口
         * Summary: 信用流转凭证合并发行接口
         */
        public BatchcreateCreditIssueResponse BatchcreateCreditIssue(BatchcreateCreditIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateCreditIssueEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转凭证合并发行接口
         * Summary: 信用流转凭证合并发行接口
         */
        public async Task<BatchcreateCreditIssueResponse> BatchcreateCreditIssueAsync(BatchcreateCreditIssueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateCreditIssueExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转凭证合并发行接口
         * Summary: 信用流转凭证合并发行接口
         */
        public BatchcreateCreditIssueResponse BatchcreateCreditIssueEx(BatchcreateCreditIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateCreditIssueResponse>(DoRequest("1.0", "digital.logistic.credit.issue.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转凭证合并发行接口
         * Summary: 信用流转凭证合并发行接口
         */
        public async Task<BatchcreateCreditIssueResponse> BatchcreateCreditIssueExAsync(BatchcreateCreditIssueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateCreditIssueResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issue.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转凭证合并发行信息上传接口
         * Summary: 信用流转凭证合并发行信息上传接口
         */
        public UploadCreditIssuebatchResponse UploadCreditIssuebatch(UploadCreditIssuebatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadCreditIssuebatchEx(request, headers, runtime);
        }

        /**
         * Description: 信用流转凭证合并发行信息上传接口
         * Summary: 信用流转凭证合并发行信息上传接口
         */
        public async Task<UploadCreditIssuebatchResponse> UploadCreditIssuebatchAsync(UploadCreditIssuebatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadCreditIssuebatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用流转凭证合并发行信息上传接口
         * Summary: 信用流转凭证合并发行信息上传接口
         */
        public UploadCreditIssuebatchResponse UploadCreditIssuebatchEx(UploadCreditIssuebatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditIssuebatchResponse>(DoRequest("1.0", "digital.logistic.credit.issuebatch.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用流转凭证合并发行信息上传接口
         * Summary: 信用流转凭证合并发行信息上传接口
         */
        public async Task<UploadCreditIssuebatchResponse> UploadCreditIssuebatchExAsync(UploadCreditIssuebatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadCreditIssuebatchResponse>(await DoRequestAsync("1.0", "digital.logistic.credit.issuebatch.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
         * Summary: 信用凭证电子回单获取(新)
         */
        public GetIssueTransferfileResponse GetIssueTransferfile(GetIssueTransferfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetIssueTransferfileEx(request, headers, runtime);
        }

        /**
         * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
         * Summary: 信用凭证电子回单获取(新)
         */
        public async Task<GetIssueTransferfileResponse> GetIssueTransferfileAsync(GetIssueTransferfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetIssueTransferfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
         * Summary: 信用凭证电子回单获取(新)
         */
        public GetIssueTransferfileResponse GetIssueTransferfileEx(GetIssueTransferfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIssueTransferfileResponse>(DoRequest("1.0", "digital.logistic.issue.transferfile.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
         * Summary: 信用凭证电子回单获取(新)
         */
        public async Task<GetIssueTransferfileResponse> GetIssueTransferfileExAsync(GetIssueTransferfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIssueTransferfileResponse>(await DoRequestAsync("1.0", "digital.logistic.issue.transferfile.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
         * Summary: 投保接口-中华财险-承运人责任险
         */
        public ApplyInsurancepolicyZhonghuacaixianResponse ApplyInsurancepolicyZhonghuacaixian(ApplyInsurancepolicyZhonghuacaixianRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsurancepolicyZhonghuacaixianEx(request, headers, runtime);
        }

        /**
         * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
         * Summary: 投保接口-中华财险-承运人责任险
         */
        public async Task<ApplyInsurancepolicyZhonghuacaixianResponse> ApplyInsurancepolicyZhonghuacaixianAsync(ApplyInsurancepolicyZhonghuacaixianRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsurancepolicyZhonghuacaixianExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
         * Summary: 投保接口-中华财险-承运人责任险
         */
        public ApplyInsurancepolicyZhonghuacaixianResponse ApplyInsurancepolicyZhonghuacaixianEx(ApplyInsurancepolicyZhonghuacaixianRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsurancepolicyZhonghuacaixianResponse>(DoRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
         * Summary: 投保接口-中华财险-承运人责任险
         */
        public async Task<ApplyInsurancepolicyZhonghuacaixianResponse> ApplyInsurancepolicyZhonghuacaixianExAsync(ApplyInsurancepolicyZhonghuacaixianRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsurancepolicyZhonghuacaixianResponse>(await DoRequestAsync("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字物流保险，退保接口
         * Summary: 退保接口-中华财险-承运人责任险
         */
        public CancelInsurancepolicyZhonghuacaixianResponse CancelInsurancepolicyZhonghuacaixian(CancelInsurancepolicyZhonghuacaixianRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelInsurancepolicyZhonghuacaixianEx(request, headers, runtime);
        }

        /**
         * Description: 数字物流保险，退保接口
         * Summary: 退保接口-中华财险-承运人责任险
         */
        public async Task<CancelInsurancepolicyZhonghuacaixianResponse> CancelInsurancepolicyZhonghuacaixianAsync(CancelInsurancepolicyZhonghuacaixianRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelInsurancepolicyZhonghuacaixianExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字物流保险，退保接口
         * Summary: 退保接口-中华财险-承运人责任险
         */
        public CancelInsurancepolicyZhonghuacaixianResponse CancelInsurancepolicyZhonghuacaixianEx(CancelInsurancepolicyZhonghuacaixianRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelInsurancepolicyZhonghuacaixianResponse>(DoRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字物流保险，退保接口
         * Summary: 退保接口-中华财险-承运人责任险
         */
        public async Task<CancelInsurancepolicyZhonghuacaixianResponse> CancelInsurancepolicyZhonghuacaixianExAsync(CancelInsurancepolicyZhonghuacaixianRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelInsurancepolicyZhonghuacaixianResponse>(await DoRequestAsync("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险理赔通知
         * Summary: 保险理赔通知
         */
        public PushInsurancenotifyClaimResponse PushInsurancenotifyClaim(PushInsurancenotifyClaimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushInsurancenotifyClaimEx(request, headers, runtime);
        }

        /**
         * Description: 保险理赔通知
         * Summary: 保险理赔通知
         */
        public async Task<PushInsurancenotifyClaimResponse> PushInsurancenotifyClaimAsync(PushInsurancenotifyClaimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushInsurancenotifyClaimExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险理赔通知
         * Summary: 保险理赔通知
         */
        public PushInsurancenotifyClaimResponse PushInsurancenotifyClaimEx(PushInsurancenotifyClaimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushInsurancenotifyClaimResponse>(DoRequest("1.0", "digital.logistic.insurancenotify.claim.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险理赔通知
         * Summary: 保险理赔通知
         */
        public async Task<PushInsurancenotifyClaimResponse> PushInsurancenotifyClaimExAsync(PushInsurancenotifyClaimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushInsurancenotifyClaimResponse>(await DoRequestAsync("1.0", "digital.logistic.insurancenotify.claim.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
         * Summary: 上传文件链接申请
         */
        public ApplyInsuranceFileurlResponse ApplyInsuranceFileurl(ApplyInsuranceFileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceFileurlEx(request, headers, runtime);
        }

        /**
         * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
         * Summary: 上传文件链接申请
         */
        public async Task<ApplyInsuranceFileurlResponse> ApplyInsuranceFileurlAsync(ApplyInsuranceFileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceFileurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
         * Summary: 上传文件链接申请
         */
        public ApplyInsuranceFileurlResponse ApplyInsuranceFileurlEx(ApplyInsuranceFileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceFileurlResponse>(DoRequest("1.0", "digital.logistic.insurance.fileurl.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
         * Summary: 上传文件链接申请
         */
        public async Task<ApplyInsuranceFileurlResponse> ApplyInsuranceFileurlExAsync(ApplyInsuranceFileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceFileurlResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.fileurl.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
         * Summary: 投保接口-承运人平台责任险
         */
        public ApplyInsurancepolicyUniversalResponse ApplyInsurancepolicyUniversal(ApplyInsurancepolicyUniversalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsurancepolicyUniversalEx(request, headers, runtime);
        }

        /**
         * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
         * Summary: 投保接口-承运人平台责任险
         */
        public async Task<ApplyInsurancepolicyUniversalResponse> ApplyInsurancepolicyUniversalAsync(ApplyInsurancepolicyUniversalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsurancepolicyUniversalExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
         * Summary: 投保接口-承运人平台责任险
         */
        public ApplyInsurancepolicyUniversalResponse ApplyInsurancepolicyUniversalEx(ApplyInsurancepolicyUniversalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsurancepolicyUniversalResponse>(DoRequest("1.0", "digital.logistic.insurancepolicy.universal.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
         * Summary: 投保接口-承运人平台责任险
         */
        public async Task<ApplyInsurancepolicyUniversalResponse> ApplyInsurancepolicyUniversalExAsync(ApplyInsurancepolicyUniversalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsurancepolicyUniversalResponse>(await DoRequestAsync("1.0", "digital.logistic.insurancepolicy.universal.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字物流保险，退保接口
         * Summary: 退保接口-承运人平台责任险
         */
        public CancelInsurancepolicyUniversalResponse CancelInsurancepolicyUniversal(CancelInsurancepolicyUniversalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelInsurancepolicyUniversalEx(request, headers, runtime);
        }

        /**
         * Description: 数字物流保险，退保接口
         * Summary: 退保接口-承运人平台责任险
         */
        public async Task<CancelInsurancepolicyUniversalResponse> CancelInsurancepolicyUniversalAsync(CancelInsurancepolicyUniversalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelInsurancepolicyUniversalExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字物流保险，退保接口
         * Summary: 退保接口-承运人平台责任险
         */
        public CancelInsurancepolicyUniversalResponse CancelInsurancepolicyUniversalEx(CancelInsurancepolicyUniversalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelInsurancepolicyUniversalResponse>(DoRequest("1.0", "digital.logistic.insurancepolicy.universal.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字物流保险，退保接口
         * Summary: 退保接口-承运人平台责任险
         */
        public async Task<CancelInsurancepolicyUniversalResponse> CancelInsurancepolicyUniversalExAsync(CancelInsurancepolicyUniversalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelInsurancepolicyUniversalResponse>(await DoRequestAsync("1.0", "digital.logistic.insurancepolicy.universal.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 利用区块链智能合约进行离线保单存证
         * Summary: 离线保单存证推送
         */
        public PushInsuranceOlpResponse PushInsuranceOlp(PushInsuranceOlpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushInsuranceOlpEx(request, headers, runtime);
        }

        /**
         * Description: 利用区块链智能合约进行离线保单存证
         * Summary: 离线保单存证推送
         */
        public async Task<PushInsuranceOlpResponse> PushInsuranceOlpAsync(PushInsuranceOlpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushInsuranceOlpExAsync(request, headers, runtime);
        }

        /**
         * Description: 利用区块链智能合约进行离线保单存证
         * Summary: 离线保单存证推送
         */
        public PushInsuranceOlpResponse PushInsuranceOlpEx(PushInsuranceOlpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushInsuranceOlpResponse>(DoRequest("1.0", "digital.logistic.insurance.olp.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 利用区块链智能合约进行离线保单存证
         * Summary: 离线保单存证推送
         */
        public async Task<PushInsuranceOlpResponse> PushInsuranceOlpExAsync(PushInsuranceOlpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushInsuranceOlpResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.olp.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 利用区块链智能合约进行离线保单信息更新追踪
         * Summary: 离线保单更新
         */
        public UpdateInsuranceOlpResponse UpdateInsuranceOlp(UpdateInsuranceOlpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInsuranceOlpEx(request, headers, runtime);
        }

        /**
         * Description: 利用区块链智能合约进行离线保单信息更新追踪
         * Summary: 离线保单更新
         */
        public async Task<UpdateInsuranceOlpResponse> UpdateInsuranceOlpAsync(UpdateInsuranceOlpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInsuranceOlpExAsync(request, headers, runtime);
        }

        /**
         * Description: 利用区块链智能合约进行离线保单信息更新追踪
         * Summary: 离线保单更新
         */
        public UpdateInsuranceOlpResponse UpdateInsuranceOlpEx(UpdateInsuranceOlpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInsuranceOlpResponse>(DoRequest("1.0", "digital.logistic.insurance.olp.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 利用区块链智能合约进行离线保单信息更新追踪
         * Summary: 离线保单更新
         */
        public async Task<UpdateInsuranceOlpResponse> UpdateInsuranceOlpExAsync(UpdateInsuranceOlpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInsuranceOlpResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.olp.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 再保分保单推送接口
         * Summary: 再保分保单推送
         */
        public PushInsuranceReppolicyResponse PushInsuranceReppolicy(PushInsuranceReppolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushInsuranceReppolicyEx(request, headers, runtime);
        }

        /**
         * Description: 再保分保单推送接口
         * Summary: 再保分保单推送
         */
        public async Task<PushInsuranceReppolicyResponse> PushInsuranceReppolicyAsync(PushInsuranceReppolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushInsuranceReppolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 再保分保单推送接口
         * Summary: 再保分保单推送
         */
        public PushInsuranceReppolicyResponse PushInsuranceReppolicyEx(PushInsuranceReppolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushInsuranceReppolicyResponse>(DoRequest("1.0", "digital.logistic.insurance.reppolicy.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 再保分保单推送接口
         * Summary: 再保分保单推送
         */
        public async Task<PushInsuranceReppolicyResponse> PushInsuranceReppolicyExAsync(PushInsuranceReppolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushInsuranceReppolicyResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.reppolicy.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 再保批改单推送
         * Summary: 再保批改单推送
         */
        public PushInsuranceRepcorrectResponse PushInsuranceRepcorrect(PushInsuranceRepcorrectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushInsuranceRepcorrectEx(request, headers, runtime);
        }

        /**
         * Description: 再保批改单推送
         * Summary: 再保批改单推送
         */
        public async Task<PushInsuranceRepcorrectResponse> PushInsuranceRepcorrectAsync(PushInsuranceRepcorrectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushInsuranceRepcorrectExAsync(request, headers, runtime);
        }

        /**
         * Description: 再保批改单推送
         * Summary: 再保批改单推送
         */
        public PushInsuranceRepcorrectResponse PushInsuranceRepcorrectEx(PushInsuranceRepcorrectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushInsuranceRepcorrectResponse>(DoRequest("1.0", "digital.logistic.insurance.repcorrect.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 再保批改单推送
         * Summary: 再保批改单推送
         */
        public async Task<PushInsuranceRepcorrectResponse> PushInsuranceRepcorrectExAsync(PushInsuranceRepcorrectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushInsuranceRepcorrectResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.repcorrect.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跨境运费险投保申请
         * Summary: 跨境运费险投保
         */
        public ApplyInsuranceCbrfResponse ApplyInsuranceCbrf(ApplyInsuranceCbrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceCbrfEx(request, headers, runtime);
        }

        /**
         * Description: 跨境运费险投保申请
         * Summary: 跨境运费险投保
         */
        public async Task<ApplyInsuranceCbrfResponse> ApplyInsuranceCbrfAsync(ApplyInsuranceCbrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceCbrfExAsync(request, headers, runtime);
        }

        /**
         * Description: 跨境运费险投保申请
         * Summary: 跨境运费险投保
         */
        public ApplyInsuranceCbrfResponse ApplyInsuranceCbrfEx(ApplyInsuranceCbrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceCbrfResponse>(DoRequest("1.0", "digital.logistic.insurance.cbrf.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跨境运费险投保申请
         * Summary: 跨境运费险投保
         */
        public async Task<ApplyInsuranceCbrfResponse> ApplyInsuranceCbrfExAsync(ApplyInsuranceCbrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceCbrfResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.cbrf.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跨境运费险理赔
         * Summary: 跨境运费险理赔
         */
        public RepayInsuranceCbrfResponse RepayInsuranceCbrf(RepayInsuranceCbrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayInsuranceCbrfEx(request, headers, runtime);
        }

        /**
         * Description: 跨境运费险理赔
         * Summary: 跨境运费险理赔
         */
        public async Task<RepayInsuranceCbrfResponse> RepayInsuranceCbrfAsync(RepayInsuranceCbrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayInsuranceCbrfExAsync(request, headers, runtime);
        }

        /**
         * Description: 跨境运费险理赔
         * Summary: 跨境运费险理赔
         */
        public RepayInsuranceCbrfResponse RepayInsuranceCbrfEx(RepayInsuranceCbrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayInsuranceCbrfResponse>(DoRequest("1.0", "digital.logistic.insurance.cbrf.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跨境运费险理赔
         * Summary: 跨境运费险理赔
         */
        public async Task<RepayInsuranceCbrfResponse> RepayInsuranceCbrfExAsync(RepayInsuranceCbrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayInsuranceCbrfResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.cbrf.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跨境出口货运险投保
         * Summary: 跨境出口货运险投保
         */
        public ApplyInsuranceCbecResponse ApplyInsuranceCbec(ApplyInsuranceCbecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceCbecEx(request, headers, runtime);
        }

        /**
         * Description: 跨境出口货运险投保
         * Summary: 跨境出口货运险投保
         */
        public async Task<ApplyInsuranceCbecResponse> ApplyInsuranceCbecAsync(ApplyInsuranceCbecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceCbecExAsync(request, headers, runtime);
        }

        /**
         * Description: 跨境出口货运险投保
         * Summary: 跨境出口货运险投保
         */
        public ApplyInsuranceCbecResponse ApplyInsuranceCbecEx(ApplyInsuranceCbecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceCbecResponse>(DoRequest("1.0", "digital.logistic.insurance.cbec.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跨境出口货运险投保
         * Summary: 跨境出口货运险投保
         */
        public async Task<ApplyInsuranceCbecResponse> ApplyInsuranceCbecExAsync(ApplyInsuranceCbecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceCbecResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.cbec.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货物入库申报
         * Summary: 货物入库申报
         */
        public ApplyInsuranceStockinResponse ApplyInsuranceStockin(ApplyInsuranceStockinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceStockinEx(request, headers, runtime);
        }

        /**
         * Description: 货物入库申报
         * Summary: 货物入库申报
         */
        public async Task<ApplyInsuranceStockinResponse> ApplyInsuranceStockinAsync(ApplyInsuranceStockinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceStockinExAsync(request, headers, runtime);
        }

        /**
         * Description: 货物入库申报
         * Summary: 货物入库申报
         */
        public ApplyInsuranceStockinResponse ApplyInsuranceStockinEx(ApplyInsuranceStockinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceStockinResponse>(DoRequest("1.0", "digital.logistic.insurance.stockin.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货物入库申报
         * Summary: 货物入库申报
         */
        public async Task<ApplyInsuranceStockinResponse> ApplyInsuranceStockinExAsync(ApplyInsuranceStockinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceStockinResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.stockin.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货物库存申报
         * Summary: 货物库存申报
         */
        public ApplyInsuranceInventoryResponse ApplyInsuranceInventory(ApplyInsuranceInventoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceInventoryEx(request, headers, runtime);
        }

        /**
         * Description: 货物库存申报
         * Summary: 货物库存申报
         */
        public async Task<ApplyInsuranceInventoryResponse> ApplyInsuranceInventoryAsync(ApplyInsuranceInventoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceInventoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 货物库存申报
         * Summary: 货物库存申报
         */
        public ApplyInsuranceInventoryResponse ApplyInsuranceInventoryEx(ApplyInsuranceInventoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceInventoryResponse>(DoRequest("1.0", "digital.logistic.insurance.inventory.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 货物库存申报
         * Summary: 货物库存申报
         */
        public async Task<ApplyInsuranceInventoryResponse> ApplyInsuranceInventoryExAsync(ApplyInsuranceInventoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceInventoryResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.inventory.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海外邮包险投保api
         * Summary: 海外邮包险投保
         */
        public ApplyInsuranceOspiResponse ApplyInsuranceOspi(ApplyInsuranceOspiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceOspiEx(request, headers, runtime);
        }

        /**
         * Description: 海外邮包险投保api
         * Summary: 海外邮包险投保
         */
        public async Task<ApplyInsuranceOspiResponse> ApplyInsuranceOspiAsync(ApplyInsuranceOspiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceOspiExAsync(request, headers, runtime);
        }

        /**
         * Description: 海外邮包险投保api
         * Summary: 海外邮包险投保
         */
        public ApplyInsuranceOspiResponse ApplyInsuranceOspiEx(ApplyInsuranceOspiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceOspiResponse>(DoRequest("1.0", "digital.logistic.insurance.ospi.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海外邮包险投保api
         * Summary: 海外邮包险投保
         */
        public async Task<ApplyInsuranceOspiResponse> ApplyInsuranceOspiExAsync(ApplyInsuranceOspiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceOspiResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.ospi.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海外、跨境邮包险、平台责任险的理赔报案
         * Summary: 海外、跨境邮包险、平台责任险报案
         */
        public ApplyInsuranceOspireportResponse ApplyInsuranceOspireport(ApplyInsuranceOspireportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceOspireportEx(request, headers, runtime);
        }

        /**
         * Description: 海外、跨境邮包险、平台责任险的理赔报案
         * Summary: 海外、跨境邮包险、平台责任险报案
         */
        public async Task<ApplyInsuranceOspireportResponse> ApplyInsuranceOspireportAsync(ApplyInsuranceOspireportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceOspireportExAsync(request, headers, runtime);
        }

        /**
         * Description: 海外、跨境邮包险、平台责任险的理赔报案
         * Summary: 海外、跨境邮包险、平台责任险报案
         */
        public ApplyInsuranceOspireportResponse ApplyInsuranceOspireportEx(ApplyInsuranceOspireportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceOspireportResponse>(DoRequest("1.0", "digital.logistic.insurance.ospireport.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海外、跨境邮包险、平台责任险的理赔报案
         * Summary: 海外、跨境邮包险、平台责任险报案
         */
        public async Task<ApplyInsuranceOspireportResponse> ApplyInsuranceOspireportExAsync(ApplyInsuranceOspireportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceOspireportResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.ospireport.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海外、跨境邮包险、平台责任险案件结果通知
         * Summary: 海外、跨境邮包险、平台责任险案件结果通知
         */
        public NotifyInsuranceOspireportResponse NotifyInsuranceOspireport(NotifyInsuranceOspireportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyInsuranceOspireportEx(request, headers, runtime);
        }

        /**
         * Description: 海外、跨境邮包险、平台责任险案件结果通知
         * Summary: 海外、跨境邮包险、平台责任险案件结果通知
         */
        public async Task<NotifyInsuranceOspireportResponse> NotifyInsuranceOspireportAsync(NotifyInsuranceOspireportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyInsuranceOspireportExAsync(request, headers, runtime);
        }

        /**
         * Description: 海外、跨境邮包险、平台责任险案件结果通知
         * Summary: 海外、跨境邮包险、平台责任险案件结果通知
         */
        public NotifyInsuranceOspireportResponse NotifyInsuranceOspireportEx(NotifyInsuranceOspireportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInsuranceOspireportResponse>(DoRequest("1.0", "digital.logistic.insurance.ospireport.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海外、跨境邮包险、平台责任险案件结果通知
         * Summary: 海外、跨境邮包险、平台责任险案件结果通知
         */
        public async Task<NotifyInsuranceOspireportResponse> NotifyInsuranceOspireportExAsync(NotifyInsuranceOspireportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInsuranceOspireportResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.ospireport.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 驿站宝投保
         * Summary: 驿站宝投保
         */
        public ApplyInsuranceYzbResponse ApplyInsuranceYzb(ApplyInsuranceYzbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceYzbEx(request, headers, runtime);
        }

        /**
         * Description: 驿站宝投保
         * Summary: 驿站宝投保
         */
        public async Task<ApplyInsuranceYzbResponse> ApplyInsuranceYzbAsync(ApplyInsuranceYzbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceYzbExAsync(request, headers, runtime);
        }

        /**
         * Description: 驿站宝投保
         * Summary: 驿站宝投保
         */
        public ApplyInsuranceYzbResponse ApplyInsuranceYzbEx(ApplyInsuranceYzbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceYzbResponse>(DoRequest("1.0", "digital.logistic.insurance.yzb.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 驿站宝投保
         * Summary: 驿站宝投保
         */
        public async Task<ApplyInsuranceYzbResponse> ApplyInsuranceYzbExAsync(ApplyInsuranceYzbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceYzbResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.yzb.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跨境邮包险、平台责任险投保
         * Summary: 跨境邮包险、平台责任险投保
         */
        public ApplyInsuranceCbpiResponse ApplyInsuranceCbpi(ApplyInsuranceCbpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceCbpiEx(request, headers, runtime);
        }

        /**
         * Description: 跨境邮包险、平台责任险投保
         * Summary: 跨境邮包险、平台责任险投保
         */
        public async Task<ApplyInsuranceCbpiResponse> ApplyInsuranceCbpiAsync(ApplyInsuranceCbpiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceCbpiExAsync(request, headers, runtime);
        }

        /**
         * Description: 跨境邮包险、平台责任险投保
         * Summary: 跨境邮包险、平台责任险投保
         */
        public ApplyInsuranceCbpiResponse ApplyInsuranceCbpiEx(ApplyInsuranceCbpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceCbpiResponse>(DoRequest("1.0", "digital.logistic.insurance.cbpi.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跨境邮包险、平台责任险投保
         * Summary: 跨境邮包险、平台责任险投保
         */
        public async Task<ApplyInsuranceCbpiResponse> ApplyInsuranceCbpiExAsync(ApplyInsuranceCbpiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceCbpiResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.cbpi.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 驿站宝报案
         * Summary: 驿站宝报案
         */
        public ApplyInsuranceYzbreportResponse ApplyInsuranceYzbreport(ApplyInsuranceYzbreportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceYzbreportEx(request, headers, runtime);
        }

        /**
         * Description: 驿站宝报案
         * Summary: 驿站宝报案
         */
        public async Task<ApplyInsuranceYzbreportResponse> ApplyInsuranceYzbreportAsync(ApplyInsuranceYzbreportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceYzbreportExAsync(request, headers, runtime);
        }

        /**
         * Description: 驿站宝报案
         * Summary: 驿站宝报案
         */
        public ApplyInsuranceYzbreportResponse ApplyInsuranceYzbreportEx(ApplyInsuranceYzbreportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceYzbreportResponse>(DoRequest("1.0", "digital.logistic.insurance.yzbreport.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 驿站宝报案
         * Summary: 驿站宝报案
         */
        public async Task<ApplyInsuranceYzbreportResponse> ApplyInsuranceYzbreportExAsync(ApplyInsuranceYzbreportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceYzbreportResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.yzbreport.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 驿站宝案件进度查询
         * Summary: 驿站宝案件进度查询
         */
        public QueryInsuranceYzbreportResponse QueryInsuranceYzbreport(QueryInsuranceYzbreportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInsuranceYzbreportEx(request, headers, runtime);
        }

        /**
         * Description: 驿站宝案件进度查询
         * Summary: 驿站宝案件进度查询
         */
        public async Task<QueryInsuranceYzbreportResponse> QueryInsuranceYzbreportAsync(QueryInsuranceYzbreportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInsuranceYzbreportExAsync(request, headers, runtime);
        }

        /**
         * Description: 驿站宝案件进度查询
         * Summary: 驿站宝案件进度查询
         */
        public QueryInsuranceYzbreportResponse QueryInsuranceYzbreportEx(QueryInsuranceYzbreportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceYzbreportResponse>(DoRequest("1.0", "digital.logistic.insurance.yzbreport.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 驿站宝案件进度查询
         * Summary: 驿站宝案件进度查询
         */
        public async Task<QueryInsuranceYzbreportResponse> QueryInsuranceYzbreportExAsync(QueryInsuranceYzbreportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceYzbreportResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.yzbreport.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 零担快运运单上链存证接口
         * Summary: 零担快运运单上链存证接口
         */
        public SaveInsuranceWaybillResponse SaveInsuranceWaybill(SaveInsuranceWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveInsuranceWaybillEx(request, headers, runtime);
        }

        /**
         * Description: 零担快运运单上链存证接口
         * Summary: 零担快运运单上链存证接口
         */
        public async Task<SaveInsuranceWaybillResponse> SaveInsuranceWaybillAsync(SaveInsuranceWaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveInsuranceWaybillExAsync(request, headers, runtime);
        }

        /**
         * Description: 零担快运运单上链存证接口
         * Summary: 零担快运运单上链存证接口
         */
        public SaveInsuranceWaybillResponse SaveInsuranceWaybillEx(SaveInsuranceWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInsuranceWaybillResponse>(DoRequest("1.0", "digital.logistic.insurance.waybill.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 零担快运运单上链存证接口
         * Summary: 零担快运运单上链存证接口
         */
        public async Task<SaveInsuranceWaybillResponse> SaveInsuranceWaybillExAsync(SaveInsuranceWaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveInsuranceWaybillResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.waybill.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险电子保单查询
         * Summary: 保险电子保单查询
         */
        public QueryInsuranceEpolicyResponse QueryInsuranceEpolicy(QueryInsuranceEpolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInsuranceEpolicyEx(request, headers, runtime);
        }

        /**
         * Description: 保险电子保单查询
         * Summary: 保险电子保单查询
         */
        public async Task<QueryInsuranceEpolicyResponse> QueryInsuranceEpolicyAsync(QueryInsuranceEpolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInsuranceEpolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险电子保单查询
         * Summary: 保险电子保单查询
         */
        public QueryInsuranceEpolicyResponse QueryInsuranceEpolicyEx(QueryInsuranceEpolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceEpolicyResponse>(DoRequest("1.0", "digital.logistic.insurance.epolicy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险电子保单查询
         * Summary: 保险电子保单查询
         */
        public async Task<QueryInsuranceEpolicyResponse> QueryInsuranceEpolicyExAsync(QueryInsuranceEpolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceEpolicyResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.epolicy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报案案件结果通知（内部）
         * Summary: 报案案件结果通知（内部）
         */
        public NotifyInsuranceReportresultResponse NotifyInsuranceReportresult(NotifyInsuranceReportresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyInsuranceReportresultEx(request, headers, runtime);
        }

        /**
         * Description: 报案案件结果通知（内部）
         * Summary: 报案案件结果通知（内部）
         */
        public async Task<NotifyInsuranceReportresultResponse> NotifyInsuranceReportresultAsync(NotifyInsuranceReportresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyInsuranceReportresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 报案案件结果通知（内部）
         * Summary: 报案案件结果通知（内部）
         */
        public NotifyInsuranceReportresultResponse NotifyInsuranceReportresultEx(NotifyInsuranceReportresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInsuranceReportresultResponse>(DoRequest("1.0", "digital.logistic.insurance.reportresult.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报案案件结果通知（内部）
         * Summary: 报案案件结果通知（内部）
         */
        public async Task<NotifyInsuranceReportresultResponse> NotifyInsuranceReportresultExAsync(NotifyInsuranceReportresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInsuranceReportresultResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.reportresult.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 不可达项目投保接口
         * Summary: 跨境退货运费险-不可达项目投保接口
         */
        public ApplyCbrfInsureResponse ApplyCbrfInsure(ApplyCbrfInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyCbrfInsureEx(request, headers, runtime);
        }

        /**
         * Description: 不可达项目投保接口
         * Summary: 跨境退货运费险-不可达项目投保接口
         */
        public async Task<ApplyCbrfInsureResponse> ApplyCbrfInsureAsync(ApplyCbrfInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyCbrfInsureExAsync(request, headers, runtime);
        }

        /**
         * Description: 不可达项目投保接口
         * Summary: 跨境退货运费险-不可达项目投保接口
         */
        public ApplyCbrfInsureResponse ApplyCbrfInsureEx(ApplyCbrfInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyCbrfInsureResponse>(DoRequest("1.0", "digital.logistic.cbrf.insure.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 不可达项目投保接口
         * Summary: 跨境退货运费险-不可达项目投保接口
         */
        public async Task<ApplyCbrfInsureResponse> ApplyCbrfInsureExAsync(ApplyCbrfInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyCbrfInsureResponse>(await DoRequestAsync("1.0", "digital.logistic.cbrf.insure.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 不可达项目理赔接口
         * Summary: 跨境退货运费险-不可达项目理赔接口
         */
        public RepayCbrfClaimResponse RepayCbrfClaim(RepayCbrfClaimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayCbrfClaimEx(request, headers, runtime);
        }

        /**
         * Description: 不可达项目理赔接口
         * Summary: 跨境退货运费险-不可达项目理赔接口
         */
        public async Task<RepayCbrfClaimResponse> RepayCbrfClaimAsync(RepayCbrfClaimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayCbrfClaimExAsync(request, headers, runtime);
        }

        /**
         * Description: 不可达项目理赔接口
         * Summary: 跨境退货运费险-不可达项目理赔接口
         */
        public RepayCbrfClaimResponse RepayCbrfClaimEx(RepayCbrfClaimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayCbrfClaimResponse>(DoRequest("1.0", "digital.logistic.cbrf.claim.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 不可达项目理赔接口
         * Summary: 跨境退货运费险-不可达项目理赔接口
         */
        public async Task<RepayCbrfClaimResponse> RepayCbrfClaimExAsync(RepayCbrfClaimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayCbrfClaimResponse>(await DoRequestAsync("1.0", "digital.logistic.cbrf.claim.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大保单批单
         * Summary: 大保单批单申请接口
         */
        public ApplyInsuranceEndorsementResponse ApplyInsuranceEndorsement(ApplyInsuranceEndorsementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsuranceEndorsementEx(request, headers, runtime);
        }

        /**
         * Description: 大保单批单
         * Summary: 大保单批单申请接口
         */
        public async Task<ApplyInsuranceEndorsementResponse> ApplyInsuranceEndorsementAsync(ApplyInsuranceEndorsementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsuranceEndorsementExAsync(request, headers, runtime);
        }

        /**
         * Description: 大保单批单
         * Summary: 大保单批单申请接口
         */
        public ApplyInsuranceEndorsementResponse ApplyInsuranceEndorsementEx(ApplyInsuranceEndorsementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceEndorsementResponse>(DoRequest("1.0", "digital.logistic.insurance.endorsement.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大保单批单
         * Summary: 大保单批单申请接口
         */
        public async Task<ApplyInsuranceEndorsementResponse> ApplyInsuranceEndorsementExAsync(ApplyInsuranceEndorsementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsuranceEndorsementResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.endorsement.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大保单批单查询接口
         * Summary: 大保单批单查询接口
         */
        public QueryInsuranceEndorsementResponse QueryInsuranceEndorsement(QueryInsuranceEndorsementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInsuranceEndorsementEx(request, headers, runtime);
        }

        /**
         * Description: 大保单批单查询接口
         * Summary: 大保单批单查询接口
         */
        public async Task<QueryInsuranceEndorsementResponse> QueryInsuranceEndorsementAsync(QueryInsuranceEndorsementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInsuranceEndorsementExAsync(request, headers, runtime);
        }

        /**
         * Description: 大保单批单查询接口
         * Summary: 大保单批单查询接口
         */
        public QueryInsuranceEndorsementResponse QueryInsuranceEndorsementEx(QueryInsuranceEndorsementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceEndorsementResponse>(DoRequest("1.0", "digital.logistic.insurance.endorsement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大保单批单查询接口
         * Summary: 大保单批单查询接口
         */
        public async Task<QueryInsuranceEndorsementResponse> QueryInsuranceEndorsementExAsync(QueryInsuranceEndorsementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceEndorsementResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.endorsement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海外、跨境邮包险预报案
         * Summary: 海外、跨境邮包险预报案
         */
        public ApplyInsurancePiprereportResponse ApplyInsurancePiprereport(ApplyInsurancePiprereportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsurancePiprereportEx(request, headers, runtime);
        }

        /**
         * Description: 海外、跨境邮包险预报案
         * Summary: 海外、跨境邮包险预报案
         */
        public async Task<ApplyInsurancePiprereportResponse> ApplyInsurancePiprereportAsync(ApplyInsurancePiprereportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsurancePiprereportExAsync(request, headers, runtime);
        }

        /**
         * Description: 海外、跨境邮包险预报案
         * Summary: 海外、跨境邮包险预报案
         */
        public ApplyInsurancePiprereportResponse ApplyInsurancePiprereportEx(ApplyInsurancePiprereportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsurancePiprereportResponse>(DoRequest("1.0", "digital.logistic.insurance.piprereport.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海外、跨境邮包险预报案
         * Summary: 海外、跨境邮包险预报案
         */
        public async Task<ApplyInsurancePiprereportResponse> ApplyInsurancePiprereportExAsync(ApplyInsurancePiprereportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsurancePiprereportResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.piprereport.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险案件材料更新
         * Summary: 保险案件材料更新
         */
        public UpdateInsuranceMaterialResponse UpdateInsuranceMaterial(UpdateInsuranceMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInsuranceMaterialEx(request, headers, runtime);
        }

        /**
         * Description: 保险案件材料更新
         * Summary: 保险案件材料更新
         */
        public async Task<UpdateInsuranceMaterialResponse> UpdateInsuranceMaterialAsync(UpdateInsuranceMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInsuranceMaterialExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险案件材料更新
         * Summary: 保险案件材料更新
         */
        public UpdateInsuranceMaterialResponse UpdateInsuranceMaterialEx(UpdateInsuranceMaterialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInsuranceMaterialResponse>(DoRequest("1.0", "digital.logistic.insurance.material.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险案件材料更新
         * Summary: 保险案件材料更新
         */
        public async Task<UpdateInsuranceMaterialResponse> UpdateInsuranceMaterialExAsync(UpdateInsuranceMaterialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInsuranceMaterialResponse>(await DoRequestAsync("1.0", "digital.logistic.insurance.material.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 动力电池投保保司回传保单信息接口
         * Summary: 动力电池投保保司回传保单信息接口
         */
        public NotifyBcliPolicyResponse NotifyBcliPolicy(NotifyBcliPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyBcliPolicyEx(request, headers, runtime);
        }

        /**
         * Description: 动力电池投保保司回传保单信息接口
         * Summary: 动力电池投保保司回传保单信息接口
         */
        public async Task<NotifyBcliPolicyResponse> NotifyBcliPolicyAsync(NotifyBcliPolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyBcliPolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 动力电池投保保司回传保单信息接口
         * Summary: 动力电池投保保司回传保单信息接口
         */
        public NotifyBcliPolicyResponse NotifyBcliPolicyEx(NotifyBcliPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyBcliPolicyResponse>(DoRequest("1.0", "digital.logistic.bcli.policy.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 动力电池投保保司回传保单信息接口
         * Summary: 动力电池投保保司回传保单信息接口
         */
        public async Task<NotifyBcliPolicyResponse> NotifyBcliPolicyExAsync(NotifyBcliPolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyBcliPolicyResponse>(await DoRequestAsync("1.0", "digital.logistic.bcli.policy.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 动力电池投保接口
         * Summary: 动力电池投保接口
         */
        public ApplyBcliInsuranceResponse ApplyBcliInsurance(ApplyBcliInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyBcliInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 动力电池投保接口
         * Summary: 动力电池投保接口
         */
        public async Task<ApplyBcliInsuranceResponse> ApplyBcliInsuranceAsync(ApplyBcliInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyBcliInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 动力电池投保接口
         * Summary: 动力电池投保接口
         */
        public ApplyBcliInsuranceResponse ApplyBcliInsuranceEx(ApplyBcliInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBcliInsuranceResponse>(DoRequest("1.0", "digital.logistic.bcli.insurance.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 动力电池投保接口
         * Summary: 动力电池投保接口
         */
        public async Task<ApplyBcliInsuranceResponse> ApplyBcliInsuranceExAsync(ApplyBcliInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBcliInsuranceResponse>(await DoRequestAsync("1.0", "digital.logistic.bcli.insurance.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权签署信息推送
         * Summary: 授权签署信息推送
         */
        public PushAuthSigninfoResponse PushAuthSigninfo(PushAuthSigninfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushAuthSigninfoEx(request, headers, runtime);
        }

        /**
         * Description: 授权签署信息推送
         * Summary: 授权签署信息推送
         */
        public async Task<PushAuthSigninfoResponse> PushAuthSigninfoAsync(PushAuthSigninfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushAuthSigninfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权签署信息推送
         * Summary: 授权签署信息推送
         */
        public PushAuthSigninfoResponse PushAuthSigninfoEx(PushAuthSigninfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushAuthSigninfoResponse>(DoRequest("1.0", "digital.logistic.auth.signinfo.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权签署信息推送
         * Summary: 授权签署信息推送
         */
        public async Task<PushAuthSigninfoResponse> PushAuthSigninfoExAsync(PushAuthSigninfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushAuthSigninfoResponse>(await DoRequestAsync("1.0", "digital.logistic.auth.signinfo.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资委托支付入账查询
         * Summary: 委托支付入账查询
         */
        public QueryPfPaymentResponse QueryPfPayment(QueryPfPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPfPaymentEx(request, headers, runtime);
        }

        /**
         * Description: 池融资委托支付入账查询
         * Summary: 委托支付入账查询
         */
        public async Task<QueryPfPaymentResponse> QueryPfPaymentAsync(QueryPfPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPfPaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资委托支付入账查询
         * Summary: 委托支付入账查询
         */
        public QueryPfPaymentResponse QueryPfPaymentEx(QueryPfPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfPaymentResponse>(DoRequest("1.0", "digital.logistic.pf.payment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资委托支付入账查询
         * Summary: 委托支付入账查询
         */
        public async Task<QueryPfPaymentResponse> QueryPfPaymentExAsync(QueryPfPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfPaymentResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.payment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资借据信息查询
         * Summary: 借据信息查询
         */
        public QueryPfIouResponse QueryPfIou(QueryPfIouRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPfIouEx(request, headers, runtime);
        }

        /**
         * Description: 池融资借据信息查询
         * Summary: 借据信息查询
         */
        public async Task<QueryPfIouResponse> QueryPfIouAsync(QueryPfIouRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPfIouExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资借据信息查询
         * Summary: 借据信息查询
         */
        public QueryPfIouResponse QueryPfIouEx(QueryPfIouRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfIouResponse>(DoRequest("1.0", "digital.logistic.pf.iou.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资借据信息查询
         * Summary: 借据信息查询
         */
        public async Task<QueryPfIouResponse> QueryPfIouExAsync(QueryPfIouRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfIouResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.iou.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资授信额度查询
         * Summary: 授信额度查询
         */
        public QueryPfQuotaResponse QueryPfQuota(QueryPfQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPfQuotaEx(request, headers, runtime);
        }

        /**
         * Description: 池融资授信额度查询
         * Summary: 授信额度查询
         */
        public async Task<QueryPfQuotaResponse> QueryPfQuotaAsync(QueryPfQuotaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPfQuotaExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资授信额度查询
         * Summary: 授信额度查询
         */
        public QueryPfQuotaResponse QueryPfQuotaEx(QueryPfQuotaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfQuotaResponse>(DoRequest("1.0", "digital.logistic.pf.quota.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资授信额度查询
         * Summary: 授信额度查询
         */
        public async Task<QueryPfQuotaResponse> QueryPfQuotaExAsync(QueryPfQuotaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfQuotaResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.quota.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资支用申请
         * Summary: 池融资支用申请
         */
        public ApplyPfWaybillfinancingResponse ApplyPfWaybillfinancing(ApplyPfWaybillfinancingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyPfWaybillfinancingEx(request, headers, runtime);
        }

        /**
         * Description: 池融资支用申请
         * Summary: 池融资支用申请
         */
        public async Task<ApplyPfWaybillfinancingResponse> ApplyPfWaybillfinancingAsync(ApplyPfWaybillfinancingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyPfWaybillfinancingExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资支用申请
         * Summary: 池融资支用申请
         */
        public ApplyPfWaybillfinancingResponse ApplyPfWaybillfinancingEx(ApplyPfWaybillfinancingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPfWaybillfinancingResponse>(DoRequest("1.0", "digital.logistic.pf.waybillfinancing.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资支用申请
         * Summary: 池融资支用申请
         */
        public async Task<ApplyPfWaybillfinancingResponse> ApplyPfWaybillfinancingExAsync(ApplyPfWaybillfinancingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPfWaybillfinancingResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.waybillfinancing.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资账单质押，用于入池
         * Summary: 池融资账单质押
         */
        public PushPfPledgeResponse PushPfPledge(PushPfPledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushPfPledgeEx(request, headers, runtime);
        }

        /**
         * Description: 池融资账单质押，用于入池
         * Summary: 池融资账单质押
         */
        public async Task<PushPfPledgeResponse> PushPfPledgeAsync(PushPfPledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushPfPledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资账单质押，用于入池
         * Summary: 池融资账单质押
         */
        public PushPfPledgeResponse PushPfPledgeEx(PushPfPledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushPfPledgeResponse>(DoRequest("1.0", "digital.logistic.pf.pledge.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资账单质押，用于入池
         * Summary: 池融资账单质押
         */
        public async Task<PushPfPledgeResponse> PushPfPledgeExAsync(PushPfPledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushPfPledgeResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.pledge.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 入池账单质押状态查询
         * Summary: 质押状态查询
         */
        public QueryPfPledgeResponse QueryPfPledge(QueryPfPledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPfPledgeEx(request, headers, runtime);
        }

        /**
         * Description: 入池账单质押状态查询
         * Summary: 质押状态查询
         */
        public async Task<QueryPfPledgeResponse> QueryPfPledgeAsync(QueryPfPledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPfPledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 入池账单质押状态查询
         * Summary: 质押状态查询
         */
        public QueryPfPledgeResponse QueryPfPledgeEx(QueryPfPledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfPledgeResponse>(DoRequest("1.0", "digital.logistic.pf.pledge.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 入池账单质押状态查询
         * Summary: 质押状态查询
         */
        public async Task<QueryPfPledgeResponse> QueryPfPledgeExAsync(QueryPfPledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfPledgeResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.pledge.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资融资支用状态查询
         * Summary: 池融资融资支用状态查询
         */
        public QueryPfFinancingResponse QueryPfFinancing(QueryPfFinancingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPfFinancingEx(request, headers, runtime);
        }

        /**
         * Description: 池融资融资支用状态查询
         * Summary: 池融资融资支用状态查询
         */
        public async Task<QueryPfFinancingResponse> QueryPfFinancingAsync(QueryPfFinancingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPfFinancingExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资融资支用状态查询
         * Summary: 池融资融资支用状态查询
         */
        public QueryPfFinancingResponse QueryPfFinancingEx(QueryPfFinancingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfFinancingResponse>(DoRequest("1.0", "digital.logistic.pf.financing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资融资支用状态查询
         * Summary: 池融资融资支用状态查询
         */
        public async Task<QueryPfFinancingResponse> QueryPfFinancingExAsync(QueryPfFinancingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfFinancingResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.financing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资凭证核验结果查询
         * Summary: 池融资凭证核验结果查询
         */
        public CheckPfVoucherResponse CheckPfVoucher(CheckPfVoucherRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckPfVoucherEx(request, headers, runtime);
        }

        /**
         * Description: 池融资凭证核验结果查询
         * Summary: 池融资凭证核验结果查询
         */
        public async Task<CheckPfVoucherResponse> CheckPfVoucherAsync(CheckPfVoucherRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckPfVoucherExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资凭证核验结果查询
         * Summary: 池融资凭证核验结果查询
         */
        public CheckPfVoucherResponse CheckPfVoucherEx(CheckPfVoucherRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPfVoucherResponse>(DoRequest("1.0", "digital.logistic.pf.voucher.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资凭证核验结果查询
         * Summary: 池融资凭证核验结果查询
         */
        public async Task<CheckPfVoucherResponse> CheckPfVoucherExAsync(CheckPfVoucherRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPfVoucherResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.voucher.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资提款确认书申请
         * Summary: 提款确认书申请
         */
        public ApplyPfConfirmationResponse ApplyPfConfirmation(ApplyPfConfirmationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyPfConfirmationEx(request, headers, runtime);
        }

        /**
         * Description: 池融资提款确认书申请
         * Summary: 提款确认书申请
         */
        public async Task<ApplyPfConfirmationResponse> ApplyPfConfirmationAsync(ApplyPfConfirmationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyPfConfirmationExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资提款确认书申请
         * Summary: 提款确认书申请
         */
        public ApplyPfConfirmationResponse ApplyPfConfirmationEx(ApplyPfConfirmationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPfConfirmationResponse>(DoRequest("1.0", "digital.logistic.pf.confirmation.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资提款确认书申请
         * Summary: 提款确认书申请
         */
        public async Task<ApplyPfConfirmationResponse> ApplyPfConfirmationExAsync(ApplyPfConfirmationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPfConfirmationResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.confirmation.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资融资资格申请
         * Summary: 池融资融资资格申请
         */
        public ApplyPfFinancingqualificationResponse ApplyPfFinancingqualification(ApplyPfFinancingqualificationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyPfFinancingqualificationEx(request, headers, runtime);
        }

        /**
         * Description: 池融资融资资格申请
         * Summary: 池融资融资资格申请
         */
        public async Task<ApplyPfFinancingqualificationResponse> ApplyPfFinancingqualificationAsync(ApplyPfFinancingqualificationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyPfFinancingqualificationExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资融资资格申请
         * Summary: 池融资融资资格申请
         */
        public ApplyPfFinancingqualificationResponse ApplyPfFinancingqualificationEx(ApplyPfFinancingqualificationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPfFinancingqualificationResponse>(DoRequest("1.0", "digital.logistic.pf.financingqualification.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资融资资格申请
         * Summary: 池融资融资资格申请
         */
        public async Task<ApplyPfFinancingqualificationResponse> ApplyPfFinancingqualificationExAsync(ApplyPfFinancingqualificationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPfFinancingqualificationResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.financingqualification.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资融资资格申请结果查询
         * Summary: 池融资融资资格申请结果查询
         */
        public QueryPfFinancingqualificationResponse QueryPfFinancingqualification(QueryPfFinancingqualificationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPfFinancingqualificationEx(request, headers, runtime);
        }

        /**
         * Description: 池融资融资资格申请结果查询
         * Summary: 池融资融资资格申请结果查询
         */
        public async Task<QueryPfFinancingqualificationResponse> QueryPfFinancingqualificationAsync(QueryPfFinancingqualificationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPfFinancingqualificationExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资融资资格申请结果查询
         * Summary: 池融资融资资格申请结果查询
         */
        public QueryPfFinancingqualificationResponse QueryPfFinancingqualificationEx(QueryPfFinancingqualificationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfFinancingqualificationResponse>(DoRequest("1.0", "digital.logistic.pf.financingqualification.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资融资资格申请结果查询
         * Summary: 池融资融资资格申请结果查询
         */
        public async Task<QueryPfFinancingqualificationResponse> QueryPfFinancingqualificationExAsync(QueryPfFinancingqualificationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfFinancingqualificationResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.financingqualification.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资主站回调金融云接口
         * Summary: 池融资主站回调金融云接口
         */
        public CallbackPfDefinpfResponse CallbackPfDefinpf(CallbackPfDefinpfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackPfDefinpfEx(request, headers, runtime);
        }

        /**
         * Description: 池融资主站回调金融云接口
         * Summary: 池融资主站回调金融云接口
         */
        public async Task<CallbackPfDefinpfResponse> CallbackPfDefinpfAsync(CallbackPfDefinpfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackPfDefinpfExAsync(request, headers, runtime);
        }

        /**
         * Description: 池融资主站回调金融云接口
         * Summary: 池融资主站回调金融云接口
         */
        public CallbackPfDefinpfResponse CallbackPfDefinpfEx(CallbackPfDefinpfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackPfDefinpfResponse>(DoRequest("1.0", "digital.logistic.pf.definpf.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 池融资主站回调金融云接口
         * Summary: 池融资主站回调金融云接口
         */
        public async Task<CallbackPfDefinpfResponse> CallbackPfDefinpfExAsync(CallbackPfDefinpfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackPfDefinpfResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.definpf.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于查询可提款额度
         * Summary: 可提款额度查询
         */
        public QueryPfWithdrawResponse QueryPfWithdraw(QueryPfWithdrawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPfWithdrawEx(request, headers, runtime);
        }

        /**
         * Description: 用于查询可提款额度
         * Summary: 可提款额度查询
         */
        public async Task<QueryPfWithdrawResponse> QueryPfWithdrawAsync(QueryPfWithdrawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPfWithdrawExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于查询可提款额度
         * Summary: 可提款额度查询
         */
        public QueryPfWithdrawResponse QueryPfWithdrawEx(QueryPfWithdrawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfWithdrawResponse>(DoRequest("1.0", "digital.logistic.pf.withdraw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于查询可提款额度
         * Summary: 可提款额度查询
         */
        public async Task<QueryPfWithdrawResponse> QueryPfWithdrawExAsync(QueryPfWithdrawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPfWithdrawResponse>(await DoRequestAsync("1.0", "digital.logistic.pf.withdraw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建货代did
         * Summary: 创建货代did
         */
        public CreateDidForwarderResponse CreateDidForwarder(CreateDidForwarderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDidForwarderEx(request, headers, runtime);
        }

        /**
         * Description: 创建货代did
         * Summary: 创建货代did
         */
        public async Task<CreateDidForwarderResponse> CreateDidForwarderAsync(CreateDidForwarderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDidForwarderExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建货代did
         * Summary: 创建货代did
         */
        public CreateDidForwarderResponse CreateDidForwarderEx(CreateDidForwarderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidForwarderResponse>(DoRequest("1.0", "digital.logistic.did.forwarder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建货代did
         * Summary: 创建货代did
         */
        public async Task<CreateDidForwarderResponse> CreateDidForwarderExAsync(CreateDidForwarderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidForwarderResponse>(await DoRequestAsync("1.0", "digital.logistic.did.forwarder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建saas平台did
         * Summary: 创建saas平台did
         */
        public CreateDidSaasplatformResponse CreateDidSaasplatform(CreateDidSaasplatformRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDidSaasplatformEx(request, headers, runtime);
        }

        /**
         * Description: 创建saas平台did
         * Summary: 创建saas平台did
         */
        public async Task<CreateDidSaasplatformResponse> CreateDidSaasplatformAsync(CreateDidSaasplatformRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDidSaasplatformExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建saas平台did
         * Summary: 创建saas平台did
         */
        public CreateDidSaasplatformResponse CreateDidSaasplatformEx(CreateDidSaasplatformRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidSaasplatformResponse>(DoRequest("1.0", "digital.logistic.did.saasplatform.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建saas平台did
         * Summary: 创建saas平台did
         */
        public async Task<CreateDidSaasplatformResponse> CreateDidSaasplatformExAsync(CreateDidSaasplatformRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidSaasplatformResponse>(await DoRequestAsync("1.0", "digital.logistic.did.saasplatform.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建直客did
         * Summary: 创建直客did
         */
        public CreateDidClientResponse CreateDidClient(CreateDidClientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDidClientEx(request, headers, runtime);
        }

        /**
         * Description: 创建直客did
         * Summary: 创建直客did
         */
        public async Task<CreateDidClientResponse> CreateDidClientAsync(CreateDidClientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDidClientExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建直客did
         * Summary: 创建直客did
         */
        public CreateDidClientResponse CreateDidClientEx(CreateDidClientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidClientResponse>(DoRequest("1.0", "digital.logistic.did.client.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建直客did
         * Summary: 创建直客did
         */
        public async Task<CreateDidClientResponse> CreateDidClientExAsync(CreateDidClientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidClientResponse>(await DoRequestAsync("1.0", "digital.logistic.did.client.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存订单
         * Summary: 保存订单
         */
        public SaveBizOrderResponse SaveBizOrder(SaveBizOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizOrderEx(request, headers, runtime);
        }

        /**
         * Description: 保存订单
         * Summary: 保存订单
         */
        public async Task<SaveBizOrderResponse> SaveBizOrderAsync(SaveBizOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存订单
         * Summary: 保存订单
         */
        public SaveBizOrderResponse SaveBizOrderEx(SaveBizOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizOrderResponse>(DoRequest("1.0", "digital.logistic.biz.order.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存订单
         * Summary: 保存订单
         */
        public async Task<SaveBizOrderResponse> SaveBizOrderExAsync(SaveBizOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizOrderResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.order.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存托单文件
         * Summary: 保存托单文件
         */
        public SaveBizConsignorderResponse SaveBizConsignorder(SaveBizConsignorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizConsignorderEx(request, headers, runtime);
        }

        /**
         * Description: 保存托单文件
         * Summary: 保存托单文件
         */
        public async Task<SaveBizConsignorderResponse> SaveBizConsignorderAsync(SaveBizConsignorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizConsignorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存托单文件
         * Summary: 保存托单文件
         */
        public SaveBizConsignorderResponse SaveBizConsignorderEx(SaveBizConsignorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizConsignorderResponse>(DoRequest("1.0", "digital.logistic.biz.consignorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存托单文件
         * Summary: 保存托单文件
         */
        public async Task<SaveBizConsignorderResponse> SaveBizConsignorderExAsync(SaveBizConsignorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizConsignorderResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.consignorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存货物
         * Summary: 保存货物
         */
        public SaveBizGoodsResponse SaveBizGoods(SaveBizGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 保存货物
         * Summary: 保存货物
         */
        public async Task<SaveBizGoodsResponse> SaveBizGoodsAsync(SaveBizGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存货物
         * Summary: 保存货物
         */
        public SaveBizGoodsResponse SaveBizGoodsEx(SaveBizGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizGoodsResponse>(DoRequest("1.0", "digital.logistic.biz.goods.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存货物
         * Summary: 保存货物
         */
        public async Task<SaveBizGoodsResponse> SaveBizGoodsExAsync(SaveBizGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizGoodsResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.goods.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存SO入货通知
         * Summary: 保存SO入货通知
         */
        public SaveBizSonotifyResponse SaveBizSonotify(SaveBizSonotifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizSonotifyEx(request, headers, runtime);
        }

        /**
         * Description: 保存SO入货通知
         * Summary: 保存SO入货通知
         */
        public async Task<SaveBizSonotifyResponse> SaveBizSonotifyAsync(SaveBizSonotifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizSonotifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存SO入货通知
         * Summary: 保存SO入货通知
         */
        public SaveBizSonotifyResponse SaveBizSonotifyEx(SaveBizSonotifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizSonotifyResponse>(DoRequest("1.0", "digital.logistic.biz.sonotify.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存SO入货通知
         * Summary: 保存SO入货通知
         */
        public async Task<SaveBizSonotifyResponse> SaveBizSonotifyExAsync(SaveBizSonotifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizSonotifyResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.sonotify.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存订舱单
         * Summary: 保存订舱单
         */
        public SaveBizBookingorderResponse SaveBizBookingorder(SaveBizBookingorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizBookingorderEx(request, headers, runtime);
        }

        /**
         * Description: 保存订舱单
         * Summary: 保存订舱单
         */
        public async Task<SaveBizBookingorderResponse> SaveBizBookingorderAsync(SaveBizBookingorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizBookingorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存订舱单
         * Summary: 保存订舱单
         */
        public SaveBizBookingorderResponse SaveBizBookingorderEx(SaveBizBookingorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizBookingorderResponse>(DoRequest("1.0", "digital.logistic.biz.bookingorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存订舱单
         * Summary: 保存订舱单
         */
        public async Task<SaveBizBookingorderResponse> SaveBizBookingorderExAsync(SaveBizBookingorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizBookingorderResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.bookingorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存集装箱
         * Summary: 保存集装箱
         */
        public SaveBizContainerResponse SaveBizContainer(SaveBizContainerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizContainerEx(request, headers, runtime);
        }

        /**
         * Description: 保存集装箱
         * Summary: 保存集装箱
         */
        public async Task<SaveBizContainerResponse> SaveBizContainerAsync(SaveBizContainerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizContainerExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存集装箱
         * Summary: 保存集装箱
         */
        public SaveBizContainerResponse SaveBizContainerEx(SaveBizContainerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizContainerResponse>(DoRequest("1.0", "digital.logistic.biz.container.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存集装箱
         * Summary: 保存集装箱
         */
        public async Task<SaveBizContainerResponse> SaveBizContainerExAsync(SaveBizContainerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizContainerResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.container.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存报关单
         * Summary: 保存报关单
         */
        public SaveBizCustomsorderResponse SaveBizCustomsorder(SaveBizCustomsorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizCustomsorderEx(request, headers, runtime);
        }

        /**
         * Description: 保存报关单
         * Summary: 保存报关单
         */
        public async Task<SaveBizCustomsorderResponse> SaveBizCustomsorderAsync(SaveBizCustomsorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizCustomsorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存报关单
         * Summary: 保存报关单
         */
        public SaveBizCustomsorderResponse SaveBizCustomsorderEx(SaveBizCustomsorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizCustomsorderResponse>(DoRequest("1.0", "digital.logistic.biz.customsorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存报关单
         * Summary: 保存报关单
         */
        public async Task<SaveBizCustomsorderResponse> SaveBizCustomsorderExAsync(SaveBizCustomsorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizCustomsorderResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.customsorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存拖车单
         * Summary: 保存拖车单
         */
        public SaveBizVehicleResponse SaveBizVehicle(SaveBizVehicleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizVehicleEx(request, headers, runtime);
        }

        /**
         * Description: 保存拖车单
         * Summary: 保存拖车单
         */
        public async Task<SaveBizVehicleResponse> SaveBizVehicleAsync(SaveBizVehicleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizVehicleExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存拖车单
         * Summary: 保存拖车单
         */
        public SaveBizVehicleResponse SaveBizVehicleEx(SaveBizVehicleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizVehicleResponse>(DoRequest("1.0", "digital.logistic.biz.vehicle.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存拖车单
         * Summary: 保存拖车单
         */
        public async Task<SaveBizVehicleResponse> SaveBizVehicleExAsync(SaveBizVehicleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizVehicleResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.vehicle.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存master提单
         * Summary: 保存master提单
         */
        public SaveBizMasterblResponse SaveBizMasterbl(SaveBizMasterblRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizMasterblEx(request, headers, runtime);
        }

        /**
         * Description: 保存master提单
         * Summary: 保存master提单
         */
        public async Task<SaveBizMasterblResponse> SaveBizMasterblAsync(SaveBizMasterblRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizMasterblExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存master提单
         * Summary: 保存master提单
         */
        public SaveBizMasterblResponse SaveBizMasterblEx(SaveBizMasterblRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizMasterblResponse>(DoRequest("1.0", "digital.logistic.biz.masterbl.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存master提单
         * Summary: 保存master提单
         */
        public async Task<SaveBizMasterblResponse> SaveBizMasterblExAsync(SaveBizMasterblRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizMasterblResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.masterbl.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内审完成
         * Summary: 内审完成
         */
        public FinishBizAuditResponse FinishBizAudit(FinishBizAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishBizAuditEx(request, headers, runtime);
        }

        /**
         * Description: 内审完成
         * Summary: 内审完成
         */
        public async Task<FinishBizAuditResponse> FinishBizAuditAsync(FinishBizAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishBizAuditExAsync(request, headers, runtime);
        }

        /**
         * Description: 内审完成
         * Summary: 内审完成
         */
        public FinishBizAuditResponse FinishBizAuditEx(FinishBizAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishBizAuditResponse>(DoRequest("1.0", "digital.logistic.biz.audit.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内审完成
         * Summary: 内审完成
         */
        public async Task<FinishBizAuditResponse> FinishBizAuditExAsync(FinishBizAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishBizAuditResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.audit.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存house提单
         * Summary: 保存house提单
         */
        public SaveBizHouseblResponse SaveBizHousebl(SaveBizHouseblRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizHouseblEx(request, headers, runtime);
        }

        /**
         * Description: 保存house提单
         * Summary: 保存house提单
         */
        public async Task<SaveBizHouseblResponse> SaveBizHouseblAsync(SaveBizHouseblRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizHouseblExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存house提单
         * Summary: 保存house提单
         */
        public SaveBizHouseblResponse SaveBizHouseblEx(SaveBizHouseblRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizHouseblResponse>(DoRequest("1.0", "digital.logistic.biz.housebl.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存house提单
         * Summary: 保存house提单
         */
        public async Task<SaveBizHouseblResponse> SaveBizHouseblExAsync(SaveBizHouseblRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizHouseblResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.housebl.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应付账单
         * Summary: 创建应付账单(已下)
         */
        public CreateBillPaybillorderResponse CreateBillPaybillorder(CreateBillPaybillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBillPaybillorderEx(request, headers, runtime);
        }

        /**
         * Description: 创建应付账单
         * Summary: 创建应付账单(已下)
         */
        public async Task<CreateBillPaybillorderResponse> CreateBillPaybillorderAsync(CreateBillPaybillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBillPaybillorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建应付账单
         * Summary: 创建应付账单(已下)
         */
        public CreateBillPaybillorderResponse CreateBillPaybillorderEx(CreateBillPaybillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBillPaybillorderResponse>(DoRequest("1.0", "digital.logistic.bill.paybillorder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应付账单
         * Summary: 创建应付账单(已下)
         */
        public async Task<CreateBillPaybillorderResponse> CreateBillPaybillorderExAsync(CreateBillPaybillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBillPaybillorderResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.paybillorder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应收账单
         * Summary: 创建应收账单(已下)
         */
        public CreateBillReceiptbillorderResponse CreateBillReceiptbillorder(CreateBillReceiptbillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBillReceiptbillorderEx(request, headers, runtime);
        }

        /**
         * Description: 创建应收账单
         * Summary: 创建应收账单(已下)
         */
        public async Task<CreateBillReceiptbillorderResponse> CreateBillReceiptbillorderAsync(CreateBillReceiptbillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBillReceiptbillorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建应收账单
         * Summary: 创建应收账单(已下)
         */
        public CreateBillReceiptbillorderResponse CreateBillReceiptbillorderEx(CreateBillReceiptbillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBillReceiptbillorderResponse>(DoRequest("1.0", "digital.logistic.bill.receiptbillorder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应收账单
         * Summary: 创建应收账单(已下)
         */
        public async Task<CreateBillReceiptbillorderResponse> CreateBillReceiptbillorderExAsync(CreateBillReceiptbillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBillReceiptbillorderResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.receiptbillorder.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存应付资费项
         * Summary: 保存应付资费项
         */
        public SaveBillPaybilltariffResponse SaveBillPaybilltariff(SaveBillPaybilltariffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBillPaybilltariffEx(request, headers, runtime);
        }

        /**
         * Description: 保存应付资费项
         * Summary: 保存应付资费项
         */
        public async Task<SaveBillPaybilltariffResponse> SaveBillPaybilltariffAsync(SaveBillPaybilltariffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBillPaybilltariffExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存应付资费项
         * Summary: 保存应付资费项
         */
        public SaveBillPaybilltariffResponse SaveBillPaybilltariffEx(SaveBillPaybilltariffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBillPaybilltariffResponse>(DoRequest("1.0", "digital.logistic.bill.paybilltariff.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存应付资费项
         * Summary: 保存应付资费项
         */
        public async Task<SaveBillPaybilltariffResponse> SaveBillPaybilltariffExAsync(SaveBillPaybilltariffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBillPaybilltariffResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.paybilltariff.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存应收资费项
         * Summary: 保存应收资费项
         */
        public SaveBillReceiptbilltariffResponse SaveBillReceiptbilltariff(SaveBillReceiptbilltariffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBillReceiptbilltariffEx(request, headers, runtime);
        }

        /**
         * Description: 保存应收资费项
         * Summary: 保存应收资费项
         */
        public async Task<SaveBillReceiptbilltariffResponse> SaveBillReceiptbilltariffAsync(SaveBillReceiptbilltariffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBillReceiptbilltariffExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存应收资费项
         * Summary: 保存应收资费项
         */
        public SaveBillReceiptbilltariffResponse SaveBillReceiptbilltariffEx(SaveBillReceiptbilltariffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBillReceiptbilltariffResponse>(DoRequest("1.0", "digital.logistic.bill.receiptbilltariff.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存应收资费项
         * Summary: 保存应收资费项
         */
        public async Task<SaveBillReceiptbilltariffResponse> SaveBillReceiptbilltariffExAsync(SaveBillReceiptbilltariffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBillReceiptbilltariffResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.receiptbilltariff.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销应付资费项
         * Summary: 核销应付资费项
         */
        public VerifyBillPaybillResponse VerifyBillPaybill(VerifyBillPaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyBillPaybillEx(request, headers, runtime);
        }

        /**
         * Description: 核销应付资费项
         * Summary: 核销应付资费项
         */
        public async Task<VerifyBillPaybillResponse> VerifyBillPaybillAsync(VerifyBillPaybillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyBillPaybillExAsync(request, headers, runtime);
        }

        /**
         * Description: 核销应付资费项
         * Summary: 核销应付资费项
         */
        public VerifyBillPaybillResponse VerifyBillPaybillEx(VerifyBillPaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyBillPaybillResponse>(DoRequest("1.0", "digital.logistic.bill.paybill.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销应付资费项
         * Summary: 核销应付资费项
         */
        public async Task<VerifyBillPaybillResponse> VerifyBillPaybillExAsync(VerifyBillPaybillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyBillPaybillResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.paybill.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销应收资费项
         * Summary: 核销应收资费项
         */
        public VerifyBillReceiptbillorderResponse VerifyBillReceiptbillorder(VerifyBillReceiptbillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyBillReceiptbillorderEx(request, headers, runtime);
        }

        /**
         * Description: 核销应收资费项
         * Summary: 核销应收资费项
         */
        public async Task<VerifyBillReceiptbillorderResponse> VerifyBillReceiptbillorderAsync(VerifyBillReceiptbillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyBillReceiptbillorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 核销应收资费项
         * Summary: 核销应收资费项
         */
        public VerifyBillReceiptbillorderResponse VerifyBillReceiptbillorderEx(VerifyBillReceiptbillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyBillReceiptbillorderResponse>(DoRequest("1.0", "digital.logistic.bill.receiptbillorder.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销应收资费项
         * Summary: 核销应收资费项
         */
        public async Task<VerifyBillReceiptbillorderResponse> VerifyBillReceiptbillorderExAsync(VerifyBillReceiptbillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyBillReceiptbillorderResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.receiptbillorder.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应付账单
         * Summary: 更新应付账单
         */
        public UpdateBillPaybillorderResponse UpdateBillPaybillorder(UpdateBillPaybillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBillPaybillorderEx(request, headers, runtime);
        }

        /**
         * Description: 更新应付账单
         * Summary: 更新应付账单
         */
        public async Task<UpdateBillPaybillorderResponse> UpdateBillPaybillorderAsync(UpdateBillPaybillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBillPaybillorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新应付账单
         * Summary: 更新应付账单
         */
        public UpdateBillPaybillorderResponse UpdateBillPaybillorderEx(UpdateBillPaybillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillPaybillorderResponse>(DoRequest("1.0", "digital.logistic.bill.paybillorder.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应付账单
         * Summary: 更新应付账单
         */
        public async Task<UpdateBillPaybillorderResponse> UpdateBillPaybillorderExAsync(UpdateBillPaybillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillPaybillorderResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.paybillorder.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应收账单
         * Summary: 更新应收账单
         */
        public UpdateBillReceiptbillorderResponse UpdateBillReceiptbillorder(UpdateBillReceiptbillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBillReceiptbillorderEx(request, headers, runtime);
        }

        /**
         * Description: 更新应收账单
         * Summary: 更新应收账单
         */
        public async Task<UpdateBillReceiptbillorderResponse> UpdateBillReceiptbillorderAsync(UpdateBillReceiptbillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBillReceiptbillorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新应收账单
         * Summary: 更新应收账单
         */
        public UpdateBillReceiptbillorderResponse UpdateBillReceiptbillorderEx(UpdateBillReceiptbillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillReceiptbillorderResponse>(DoRequest("1.0", "digital.logistic.bill.receiptbillorder.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应收账单
         * Summary: 更新应收账单
         */
        public async Task<UpdateBillReceiptbillorderResponse> UpdateBillReceiptbillorderExAsync(UpdateBillReceiptbillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillReceiptbillorderResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.receiptbillorder.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存应付发票
         * Summary: 保存应付发票
         */
        public SaveBillPayinvoiceResponse SaveBillPayinvoice(SaveBillPayinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBillPayinvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 保存应付发票
         * Summary: 保存应付发票
         */
        public async Task<SaveBillPayinvoiceResponse> SaveBillPayinvoiceAsync(SaveBillPayinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBillPayinvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存应付发票
         * Summary: 保存应付发票
         */
        public SaveBillPayinvoiceResponse SaveBillPayinvoiceEx(SaveBillPayinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBillPayinvoiceResponse>(DoRequest("1.0", "digital.logistic.bill.payinvoice.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存应付发票
         * Summary: 保存应付发票
         */
        public async Task<SaveBillPayinvoiceResponse> SaveBillPayinvoiceExAsync(SaveBillPayinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBillPayinvoiceResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.payinvoice.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存应收发票
         * Summary: 保存应收发票
         */
        public SaveBillReceiptinvoiceResponse SaveBillReceiptinvoice(SaveBillReceiptinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBillReceiptinvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 保存应收发票
         * Summary: 保存应收发票
         */
        public async Task<SaveBillReceiptinvoiceResponse> SaveBillReceiptinvoiceAsync(SaveBillReceiptinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBillReceiptinvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存应收发票
         * Summary: 保存应收发票
         */
        public SaveBillReceiptinvoiceResponse SaveBillReceiptinvoiceEx(SaveBillReceiptinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBillReceiptinvoiceResponse>(DoRequest("1.0", "digital.logistic.bill.receiptinvoice.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存应收发票
         * Summary: 保存应收发票
         */
        public async Task<SaveBillReceiptinvoiceResponse> SaveBillReceiptinvoiceExAsync(SaveBillReceiptinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBillReceiptinvoiceResponse>(await DoRequestAsync("1.0", "digital.logistic.bill.receiptinvoice.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传历史数据
         * Summary: 上传历史数据
         */
        public UploadBizFinancingResponse UploadBizFinancing(UploadBizFinancingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadBizFinancingEx(request, headers, runtime);
        }

        /**
         * Description: 上传历史数据
         * Summary: 上传历史数据
         */
        public async Task<UploadBizFinancingResponse> UploadBizFinancingAsync(UploadBizFinancingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadBizFinancingExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传历史数据
         * Summary: 上传历史数据
         */
        public UploadBizFinancingResponse UploadBizFinancingEx(UploadBizFinancingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBizFinancingResponse>(DoRequest("1.0", "digital.logistic.biz.financing.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传历史数据
         * Summary: 上传历史数据
         */
        public async Task<UploadBizFinancingResponse> UploadBizFinancingExAsync(UploadBizFinancingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBizFinancingResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.financing.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传订单
         * Summary: 上传订单
         */
        public UploadBizOrderResponse UploadBizOrder(UploadBizOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadBizOrderEx(request, headers, runtime);
        }

        /**
         * Description: 上传订单
         * Summary: 上传订单
         */
        public async Task<UploadBizOrderResponse> UploadBizOrderAsync(UploadBizOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadBizOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传订单
         * Summary: 上传订单
         */
        public UploadBizOrderResponse UploadBizOrderEx(UploadBizOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBizOrderResponse>(DoRequest("1.0", "digital.logistic.biz.order.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传订单
         * Summary: 上传订单
         */
        public async Task<UploadBizOrderResponse> UploadBizOrderExAsync(UploadBizOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBizOrderResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.order.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建船公司did账户
         * Summary: 创建船公司did账户
         */
        public CreateDidCarrierResponse CreateDidCarrier(CreateDidCarrierRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDidCarrierEx(request, headers, runtime);
        }

        /**
         * Description: 创建船公司did账户
         * Summary: 创建船公司did账户
         */
        public async Task<CreateDidCarrierResponse> CreateDidCarrierAsync(CreateDidCarrierRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDidCarrierExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建船公司did账户
         * Summary: 创建船公司did账户
         */
        public CreateDidCarrierResponse CreateDidCarrierEx(CreateDidCarrierRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidCarrierResponse>(DoRequest("1.0", "digital.logistic.did.carrier.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建船公司did账户
         * Summary: 创建船公司did账户
         */
        public async Task<CreateDidCarrierResponse> CreateDidCarrierExAsync(CreateDidCarrierRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidCarrierResponse>(await DoRequestAsync("1.0", "digital.logistic.did.carrier.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  货代授权
         * Summary:  货代授权
         */
        public AuthSysForwarderResponse AuthSysForwarder(AuthSysForwarderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthSysForwarderEx(request, headers, runtime);
        }

        /**
         * Description:  货代授权
         * Summary:  货代授权
         */
        public async Task<AuthSysForwarderResponse> AuthSysForwarderAsync(AuthSysForwarderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthSysForwarderExAsync(request, headers, runtime);
        }

        /**
         * Description:  货代授权
         * Summary:  货代授权
         */
        public AuthSysForwarderResponse AuthSysForwarderEx(AuthSysForwarderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthSysForwarderResponse>(DoRequest("1.0", "digital.logistic.sys.forwarder.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  货代授权
         * Summary:  货代授权
         */
        public async Task<AuthSysForwarderResponse> AuthSysForwarderExAsync(AuthSysForwarderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthSysForwarderResponse>(await DoRequestAsync("1.0", "digital.logistic.sys.forwarder.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: master提单信息查询
         * Summary: master提单信息查询
         */
        public QueryBizMasterblResponse QueryBizMasterbl(QueryBizMasterblRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBizMasterblEx(request, headers, runtime);
        }

        /**
         * Description: master提单信息查询
         * Summary: master提单信息查询
         */
        public async Task<QueryBizMasterblResponse> QueryBizMasterblAsync(QueryBizMasterblRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBizMasterblExAsync(request, headers, runtime);
        }

        /**
         * Description: master提单信息查询
         * Summary: master提单信息查询
         */
        public QueryBizMasterblResponse QueryBizMasterblEx(QueryBizMasterblRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBizMasterblResponse>(DoRequest("1.0", "digital.logistic.biz.masterbl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: master提单信息查询
         * Summary: master提单信息查询
         */
        public async Task<QueryBizMasterblResponse> QueryBizMasterblExAsync(QueryBizMasterblRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBizMasterblResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.masterbl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应付发票文件上传接口
         * Summary: 应付发票文件上传接口
         */
        public SaveBizPayinvoicefileResponse SaveBizPayinvoicefile(SaveBizPayinvoicefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBizPayinvoicefileEx(request, headers, runtime);
        }

        /**
         * Description: 应付发票文件上传接口
         * Summary: 应付发票文件上传接口
         */
        public async Task<SaveBizPayinvoicefileResponse> SaveBizPayinvoicefileAsync(SaveBizPayinvoicefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBizPayinvoicefileExAsync(request, headers, runtime);
        }

        /**
         * Description: 应付发票文件上传接口
         * Summary: 应付发票文件上传接口
         */
        public SaveBizPayinvoicefileResponse SaveBizPayinvoicefileEx(SaveBizPayinvoicefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizPayinvoicefileResponse>(DoRequest("1.0", "digital.logistic.biz.payinvoicefile.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应付发票文件上传接口
         * Summary: 应付发票文件上传接口
         */
        public async Task<SaveBizPayinvoicefileResponse> SaveBizPayinvoicefileExAsync(SaveBizPayinvoicefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBizPayinvoicefileResponse>(await DoRequestAsync("1.0", "digital.logistic.biz.payinvoicefile.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 托运订单保存接口
         * Summary: 托运订单保存接口
         */
        public SaveBiznewOrderResponse SaveBiznewOrder(SaveBiznewOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBiznewOrderEx(request, headers, runtime);
        }

        /**
         * Description: 托运订单保存接口
         * Summary: 托运订单保存接口
         */
        public async Task<SaveBiznewOrderResponse> SaveBiznewOrderAsync(SaveBiznewOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBiznewOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 托运订单保存接口
         * Summary: 托运订单保存接口
         */
        public SaveBiznewOrderResponse SaveBiznewOrderEx(SaveBiznewOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewOrderResponse>(DoRequest("1.0", "digital.logistic.biznew.order.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 托运订单保存接口
         * Summary: 托运订单保存接口
         */
        public async Task<SaveBiznewOrderResponse> SaveBiznewOrderExAsync(SaveBiznewOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewOrderResponse>(await DoRequestAsync("1.0", "digital.logistic.biznew.order.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订舱单创建接口
         * Summary: 订舱单创建接口
         */
        public SaveBiznewBookingResponse SaveBiznewBooking(SaveBiznewBookingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBiznewBookingEx(request, headers, runtime);
        }

        /**
         * Description: 订舱单创建接口
         * Summary: 订舱单创建接口
         */
        public async Task<SaveBiznewBookingResponse> SaveBiznewBookingAsync(SaveBiznewBookingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBiznewBookingExAsync(request, headers, runtime);
        }

        /**
         * Description: 订舱单创建接口
         * Summary: 订舱单创建接口
         */
        public SaveBiznewBookingResponse SaveBiznewBookingEx(SaveBiznewBookingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewBookingResponse>(DoRequest("1.0", "digital.logistic.biznew.booking.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订舱单创建接口
         * Summary: 订舱单创建接口
         */
        public async Task<SaveBiznewBookingResponse> SaveBiznewBookingExAsync(SaveBiznewBookingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewBookingResponse>(await DoRequestAsync("1.0", "digital.logistic.biznew.booking.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拖车单保存接口
         * Summary: 拖车单保存接口
         */
        public SaveBiznewVehicleResponse SaveBiznewVehicle(SaveBiznewVehicleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBiznewVehicleEx(request, headers, runtime);
        }

        /**
         * Description: 拖车单保存接口
         * Summary: 拖车单保存接口
         */
        public async Task<SaveBiznewVehicleResponse> SaveBiznewVehicleAsync(SaveBiznewVehicleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBiznewVehicleExAsync(request, headers, runtime);
        }

        /**
         * Description: 拖车单保存接口
         * Summary: 拖车单保存接口
         */
        public SaveBiznewVehicleResponse SaveBiznewVehicleEx(SaveBiznewVehicleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewVehicleResponse>(DoRequest("1.0", "digital.logistic.biznew.vehicle.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拖车单保存接口
         * Summary: 拖车单保存接口
         */
        public async Task<SaveBiznewVehicleResponse> SaveBiznewVehicleExAsync(SaveBiznewVehicleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewVehicleResponse>(await DoRequestAsync("1.0", "digital.logistic.biznew.vehicle.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报关单保存接口
         * Summary: 报关单保存接口
         */
        public SaveBiznewCustomsResponse SaveBiznewCustoms(SaveBiznewCustomsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBiznewCustomsEx(request, headers, runtime);
        }

        /**
         * Description: 报关单保存接口
         * Summary: 报关单保存接口
         */
        public async Task<SaveBiznewCustomsResponse> SaveBiznewCustomsAsync(SaveBiznewCustomsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBiznewCustomsExAsync(request, headers, runtime);
        }

        /**
         * Description: 报关单保存接口
         * Summary: 报关单保存接口
         */
        public SaveBiznewCustomsResponse SaveBiznewCustomsEx(SaveBiznewCustomsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewCustomsResponse>(DoRequest("1.0", "digital.logistic.biznew.customs.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报关单保存接口
         * Summary: 报关单保存接口
         */
        public async Task<SaveBiznewCustomsResponse> SaveBiznewCustomsExAsync(SaveBiznewCustomsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewCustomsResponse>(await DoRequestAsync("1.0", "digital.logistic.biznew.customs.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 航运提单保存接口
         * Summary: 航运提单保存接口
         */
        public SaveBiznewMasterResponse SaveBiznewMaster(SaveBiznewMasterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBiznewMasterEx(request, headers, runtime);
        }

        /**
         * Description: 航运提单保存接口
         * Summary: 航运提单保存接口
         */
        public async Task<SaveBiznewMasterResponse> SaveBiznewMasterAsync(SaveBiznewMasterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBiznewMasterExAsync(request, headers, runtime);
        }

        /**
         * Description: 航运提单保存接口
         * Summary: 航运提单保存接口
         */
        public SaveBiznewMasterResponse SaveBiznewMasterEx(SaveBiznewMasterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewMasterResponse>(DoRequest("1.0", "digital.logistic.biznew.master.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 航运提单保存接口
         * Summary: 航运提单保存接口
         */
        public async Task<SaveBiznewMasterResponse> SaveBiznewMasterExAsync(SaveBiznewMasterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewMasterResponse>(await DoRequestAsync("1.0", "digital.logistic.biznew.master.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应付账单保存接口
         * Summary: 应付账单保存接口
         */
        public SaveBiznewPaybillorderResponse SaveBiznewPaybillorder(SaveBiznewPaybillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBiznewPaybillorderEx(request, headers, runtime);
        }

        /**
         * Description: 应付账单保存接口
         * Summary: 应付账单保存接口
         */
        public async Task<SaveBiznewPaybillorderResponse> SaveBiznewPaybillorderAsync(SaveBiznewPaybillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBiznewPaybillorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 应付账单保存接口
         * Summary: 应付账单保存接口
         */
        public SaveBiznewPaybillorderResponse SaveBiznewPaybillorderEx(SaveBiznewPaybillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewPaybillorderResponse>(DoRequest("1.0", "digital.logistic.biznew.paybillorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应付账单保存接口
         * Summary: 应付账单保存接口
         */
        public async Task<SaveBiznewPaybillorderResponse> SaveBiznewPaybillorderExAsync(SaveBiznewPaybillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewPaybillorderResponse>(await DoRequestAsync("1.0", "digital.logistic.biznew.paybillorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单保存接口
         * Summary: 应收账单保存接口
         */
        public SaveBiznewReceiptbillorderResponse SaveBiznewReceiptbillorder(SaveBiznewReceiptbillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBiznewReceiptbillorderEx(request, headers, runtime);
        }

        /**
         * Description: 应收账单保存接口
         * Summary: 应收账单保存接口
         */
        public async Task<SaveBiznewReceiptbillorderResponse> SaveBiznewReceiptbillorderAsync(SaveBiznewReceiptbillorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBiznewReceiptbillorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 应收账单保存接口
         * Summary: 应收账单保存接口
         */
        public SaveBiznewReceiptbillorderResponse SaveBiznewReceiptbillorderEx(SaveBiznewReceiptbillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewReceiptbillorderResponse>(DoRequest("1.0", "digital.logistic.biznew.receiptbillorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应收账单保存接口
         * Summary: 应收账单保存接口
         */
        public async Task<SaveBiznewReceiptbillorderResponse> SaveBiznewReceiptbillorderExAsync(SaveBiznewReceiptbillorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewReceiptbillorderResponse>(await DoRequestAsync("1.0", "digital.logistic.biznew.receiptbillorder.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 航运发票保存接口
         * Summary: 航运发票保存接口
         */
        public SaveBiznewInvoiceResponse SaveBiznewInvoice(SaveBiznewInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBiznewInvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 航运发票保存接口
         * Summary: 航运发票保存接口
         */
        public async Task<SaveBiznewInvoiceResponse> SaveBiznewInvoiceAsync(SaveBiznewInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBiznewInvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 航运发票保存接口
         * Summary: 航运发票保存接口
         */
        public SaveBiznewInvoiceResponse SaveBiznewInvoiceEx(SaveBiznewInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewInvoiceResponse>(DoRequest("1.0", "digital.logistic.biznew.invoice.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 航运发票保存接口
         * Summary: 航运发票保存接口
         */
        public async Task<SaveBiznewInvoiceResponse> SaveBiznewInvoiceExAsync(SaveBiznewInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBiznewInvoiceResponse>(await DoRequestAsync("1.0", "digital.logistic.biznew.invoice.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传电子提单
         * Summary: 上传电子提单
         */
        public UploadShippingEblResponse UploadShippingEbl(UploadShippingEblRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadShippingEblEx(request, headers, runtime);
        }

        /**
         * Description: 上传电子提单
         * Summary: 上传电子提单
         */
        public async Task<UploadShippingEblResponse> UploadShippingEblAsync(UploadShippingEblRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadShippingEblExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传电子提单
         * Summary: 上传电子提单
         */
        public UploadShippingEblResponse UploadShippingEblEx(UploadShippingEblRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadShippingEblResponse>(DoRequest("1.0", "digital.logistic.shipping.ebl.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传电子提单
         * Summary: 上传电子提单
         */
        public async Task<UploadShippingEblResponse> UploadShippingEblExAsync(UploadShippingEblRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadShippingEblResponse>(await DoRequestAsync("1.0", "digital.logistic.shipping.ebl.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子提单批次上传，一个I批次下传递多个提单
         * Summary: 电子提单批次上传
         */
        public UploadShippingEblbatchResponse UploadShippingEblbatch(UploadShippingEblbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadShippingEblbatchEx(request, headers, runtime);
        }

        /**
         * Description: 电子提单批次上传，一个I批次下传递多个提单
         * Summary: 电子提单批次上传
         */
        public async Task<UploadShippingEblbatchResponse> UploadShippingEblbatchAsync(UploadShippingEblbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadShippingEblbatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子提单批次上传，一个I批次下传递多个提单
         * Summary: 电子提单批次上传
         */
        public UploadShippingEblbatchResponse UploadShippingEblbatchEx(UploadShippingEblbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadShippingEblbatchResponse>(DoRequest("1.0", "digital.logistic.shipping.eblbatch.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子提单批次上传，一个I批次下传递多个提单
         * Summary: 电子提单批次上传
         */
        public async Task<UploadShippingEblbatchResponse> UploadShippingEblbatchExAsync(UploadShippingEblbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadShippingEblbatchResponse>(await DoRequestAsync("1.0", "digital.logistic.shipping.eblbatch.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 感知收货人提单状态的变更
         * Summary: 电子提单批次状态变更
         */
        public UpdateShippingEblbatchstatusResponse UpdateShippingEblbatchstatus(UpdateShippingEblbatchstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateShippingEblbatchstatusEx(request, headers, runtime);
        }

        /**
         * Description: 感知收货人提单状态的变更
         * Summary: 电子提单批次状态变更
         */
        public async Task<UpdateShippingEblbatchstatusResponse> UpdateShippingEblbatchstatusAsync(UpdateShippingEblbatchstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateShippingEblbatchstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 感知收货人提单状态的变更
         * Summary: 电子提单批次状态变更
         */
        public UpdateShippingEblbatchstatusResponse UpdateShippingEblbatchstatusEx(UpdateShippingEblbatchstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateShippingEblbatchstatusResponse>(DoRequest("1.0", "digital.logistic.shipping.eblbatchstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 感知收货人提单状态的变更
         * Summary: 电子提单批次状态变更
         */
        public async Task<UpdateShippingEblbatchstatusResponse> UpdateShippingEblbatchstatusExAsync(UpdateShippingEblbatchstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateShippingEblbatchstatusResponse>(await DoRequestAsync("1.0", "digital.logistic.shipping.eblbatchstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
