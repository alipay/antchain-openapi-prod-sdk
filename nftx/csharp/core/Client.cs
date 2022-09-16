// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.NFTX.Models;

namespace AntChain.SDK.NFTX
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
                        {"sdk_version", "1.7.4"},
                        {"_prod_code", "NFTX"},
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
                        {"sdk_version", "1.7.4"},
                        {"_prod_code", "NFTX"},
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
         * Description: B端商户的NFT发行以及铸造
         * Summary: B端商户的NFT铸造 (废弃)
         */
        public ImportNftCreateResponse ImportNftCreate(ImportNftCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportNftCreateEx(request, headers, runtime);
        }

        /**
         * Description: B端商户的NFT发行以及铸造
         * Summary: B端商户的NFT铸造 (废弃)
         */
        public async Task<ImportNftCreateResponse> ImportNftCreateAsync(ImportNftCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportNftCreateExAsync(request, headers, runtime);
        }

        /**
         * Description: B端商户的NFT发行以及铸造
         * Summary: B端商户的NFT铸造 (废弃)
         */
        public ImportNftCreateResponse ImportNftCreateEx(ImportNftCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportNftCreateResponse>(DoRequest("1.0", "antchain.nftx.nft.create.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B端商户的NFT发行以及铸造
         * Summary: B端商户的NFT铸造 (废弃)
         */
        public async Task<ImportNftCreateResponse> ImportNftCreateExAsync(ImportNftCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportNftCreateResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.create.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
         * Summary: B端商户的NFT发行铸造后查询
         */
        public QueryNftCreateResponse QueryNftCreate(QueryNftCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNftCreateEx(request, headers, runtime);
        }

        /**
         * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
         * Summary: B端商户的NFT发行铸造后查询
         */
        public async Task<QueryNftCreateResponse> QueryNftCreateAsync(QueryNftCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNftCreateExAsync(request, headers, runtime);
        }

        /**
         * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
         * Summary: B端商户的NFT发行铸造后查询
         */
        public QueryNftCreateResponse QueryNftCreateEx(QueryNftCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftCreateResponse>(DoRequest("1.0", "antchain.nftx.nft.create.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
         * Summary: B端商户的NFT发行铸造后查询
         */
        public async Task<QueryNftCreateResponse> QueryNftCreateExAsync(QueryNftCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftCreateResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.create.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按商品编码（skuid）B2C发放NFT
         * Summary: 按商品编码B2C发放NFT
         */
        public ExecNftTransferResponse ExecNftTransfer(ExecNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecNftTransferEx(request, headers, runtime);
        }

        /**
         * Description: 按商品编码（skuid）B2C发放NFT
         * Summary: 按商品编码B2C发放NFT
         */
        public async Task<ExecNftTransferResponse> ExecNftTransferAsync(ExecNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecNftTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 按商品编码（skuid）B2C发放NFT
         * Summary: 按商品编码B2C发放NFT
         */
        public ExecNftTransferResponse ExecNftTransferEx(ExecNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecNftTransferResponse>(DoRequest("1.0", "antchain.nftx.nft.transfer.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按商品编码（skuid）B2C发放NFT
         * Summary: 按商品编码B2C发放NFT
         */
        public async Task<ExecNftTransferResponse> ExecNftTransferExAsync(ExecNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecNftTransferResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.transfer.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按项目表编码B2C发放NFT
         * Summary: 按项目表编码B2C发放NFT
         */
        public SendNftTransferResponse SendNftTransfer(SendNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendNftTransferEx(request, headers, runtime);
        }

        /**
         * Description: 按项目表编码B2C发放NFT
         * Summary: 按项目表编码B2C发放NFT
         */
        public async Task<SendNftTransferResponse> SendNftTransferAsync(SendNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendNftTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 按项目表编码B2C发放NFT
         * Summary: 按项目表编码B2C发放NFT
         */
        public SendNftTransferResponse SendNftTransferEx(SendNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendNftTransferResponse>(DoRequest("1.0", "antchain.nftx.nft.transfer.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按项目表编码B2C发放NFT
         * Summary: 按项目表编码B2C发放NFT
         */
        public async Task<SendNftTransferResponse> SendNftTransferExAsync(SendNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendNftTransferResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.transfer.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据nftId查询客户NFT资产
         * Summary: 根据nftId查询客户NFT资产
         */
        public QueryNftCustomerResponse QueryNftCustomer(QueryNftCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNftCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 根据nftId查询客户NFT资产
         * Summary: 根据nftId查询客户NFT资产
         */
        public async Task<QueryNftCustomerResponse> QueryNftCustomerAsync(QueryNftCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNftCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据nftId查询客户NFT资产
         * Summary: 根据nftId查询客户NFT资产
         */
        public QueryNftCustomerResponse QueryNftCustomerEx(QueryNftCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftCustomerResponse>(DoRequest("1.0", "antchain.nftx.nft.customer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据nftId查询客户NFT资产
         * Summary: 根据nftId查询客户NFT资产
         */
        public async Task<QueryNftCustomerResponse> QueryNftCustomerExAsync(QueryNftCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftCustomerResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.customer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据外部订单号查询该订单的NFT流水记录
         * Summary: 根据外部订单号查询该订单的NFT流水记录
         */
        public QueryNftOrderResponse QueryNftOrder(QueryNftOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNftOrderEx(request, headers, runtime);
        }

        /**
         * Description: 根据外部订单号查询该订单的NFT流水记录
         * Summary: 根据外部订单号查询该订单的NFT流水记录
         */
        public async Task<QueryNftOrderResponse> QueryNftOrderAsync(QueryNftOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNftOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据外部订单号查询该订单的NFT流水记录
         * Summary: 根据外部订单号查询该订单的NFT流水记录
         */
        public QueryNftOrderResponse QueryNftOrderEx(QueryNftOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftOrderResponse>(DoRequest("1.0", "antchain.nftx.nft.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据外部订单号查询该订单的NFT流水记录
         * Summary: 根据外部订单号查询该订单的NFT流水记录
         */
        public async Task<QueryNftOrderResponse> QueryNftOrderExAsync(QueryNftOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftOrderResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: NFT发行审核&铸造
         * Summary: NFT发行审核&铸造
         */
        public CreateNftIssuerResponse CreateNftIssuer(CreateNftIssuerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateNftIssuerEx(request, headers, runtime);
        }

        /**
         * Description: NFT发行审核&铸造
         * Summary: NFT发行审核&铸造
         */
        public async Task<CreateNftIssuerResponse> CreateNftIssuerAsync(CreateNftIssuerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateNftIssuerExAsync(request, headers, runtime);
        }

        /**
         * Description: NFT发行审核&铸造
         * Summary: NFT发行审核&铸造
         */
        public CreateNftIssuerResponse CreateNftIssuerEx(CreateNftIssuerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNftIssuerResponse>(DoRequest("1.0", "antchain.nftx.nft.issuer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: NFT发行审核&铸造
         * Summary: NFT发行审核&铸造
         */
        public async Task<CreateNftIssuerResponse> CreateNftIssuerExAsync(CreateNftIssuerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNftIssuerResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.issuer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B端用户资产列表查询
         * Summary: 用户资产列表查询
         */
        public PagequeryNftCustomerResponse PagequeryNftCustomer(PagequeryNftCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryNftCustomerEx(request, headers, runtime);
        }

        /**
         * Description: B端用户资产列表查询
         * Summary: 用户资产列表查询
         */
        public async Task<PagequeryNftCustomerResponse> PagequeryNftCustomerAsync(PagequeryNftCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryNftCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: B端用户资产列表查询
         * Summary: 用户资产列表查询
         */
        public PagequeryNftCustomerResponse PagequeryNftCustomerEx(PagequeryNftCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryNftCustomerResponse>(DoRequest("1.0", "antchain.nftx.nft.customer.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B端用户资产列表查询
         * Summary: 用户资产列表查询
         */
        public async Task<PagequeryNftCustomerResponse> PagequeryNftCustomerExAsync(PagequeryNftCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryNftCustomerResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.customer.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: NFT铸造, 带监制方和渠道租户
         * Summary: NFT铸造, 带监制方和渠道租户
         */
        public CreateNftPublishResponse CreateNftPublish(CreateNftPublishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateNftPublishEx(request, headers, runtime);
        }

        /**
         * Description: NFT铸造, 带监制方和渠道租户
         * Summary: NFT铸造, 带监制方和渠道租户
         */
        public async Task<CreateNftPublishResponse> CreateNftPublishAsync(CreateNftPublishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateNftPublishExAsync(request, headers, runtime);
        }

        /**
         * Description: NFT铸造, 带监制方和渠道租户
         * Summary: NFT铸造, 带监制方和渠道租户
         */
        public CreateNftPublishResponse CreateNftPublishEx(CreateNftPublishRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNftPublishResponse>(DoRequest("1.0", "antchain.nftx.nft.publish.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: NFT铸造, 带监制方和渠道租户
         * Summary: NFT铸造, 带监制方和渠道租户
         */
        public async Task<CreateNftPublishResponse> CreateNftPublishExAsync(CreateNftPublishRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNftPublishResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.publish.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按项目表编码B2C发放NFT,带渠道租户
         * Summary: 按项目表编码B2C发放NFT, (废弃)
         */
        public RunNftTransferResponse RunNftTransfer(RunNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunNftTransferEx(request, headers, runtime);
        }

        /**
         * Description: 按项目表编码B2C发放NFT,带渠道租户
         * Summary: 按项目表编码B2C发放NFT, (废弃)
         */
        public async Task<RunNftTransferResponse> RunNftTransferAsync(RunNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunNftTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 按项目表编码B2C发放NFT,带渠道租户
         * Summary: 按项目表编码B2C发放NFT, (废弃)
         */
        public RunNftTransferResponse RunNftTransferEx(RunNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunNftTransferResponse>(DoRequest("1.0", "antchain.nftx.nft.transfer.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按项目表编码B2C发放NFT,带渠道租户
         * Summary: 按项目表编码B2C发放NFT, (废弃)
         */
        public async Task<RunNftTransferResponse> RunNftTransferExAsync(RunNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunNftTransferResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.transfer.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按商品编码B2C发放NFT 带渠道租户
         * Summary: 按商品编码B2C发放NFT 带渠道租户
         */
        public ApplyNftTransferResponse ApplyNftTransfer(ApplyNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyNftTransferEx(request, headers, runtime);
        }

        /**
         * Description: 按商品编码B2C发放NFT 带渠道租户
         * Summary: 按商品编码B2C发放NFT 带渠道租户
         */
        public async Task<ApplyNftTransferResponse> ApplyNftTransferAsync(ApplyNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyNftTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 按商品编码B2C发放NFT 带渠道租户
         * Summary: 按商品编码B2C发放NFT 带渠道租户
         */
        public ApplyNftTransferResponse ApplyNftTransferEx(ApplyNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyNftTransferResponse>(DoRequest("1.0", "antchain.nftx.nft.transfer.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按商品编码B2C发放NFT 带渠道租户
         * Summary: 按商品编码B2C发放NFT 带渠道租户
         */
        public async Task<ApplyNftTransferResponse> ApplyNftTransferExAsync(ApplyNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyNftTransferResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.transfer.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按项目表编码B2C发放NFT,带渠道租户
         * Summary: 按项目表编码B2C发放NFT,带渠道租户
         */
        public ApplyNftTransferbyprojectwithchanneltenantResponse ApplyNftTransferbyprojectwithchanneltenant(ApplyNftTransferbyprojectwithchanneltenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyNftTransferbyprojectwithchanneltenantEx(request, headers, runtime);
        }

        /**
         * Description: 按项目表编码B2C发放NFT,带渠道租户
         * Summary: 按项目表编码B2C发放NFT,带渠道租户
         */
        public async Task<ApplyNftTransferbyprojectwithchanneltenantResponse> ApplyNftTransferbyprojectwithchanneltenantAsync(ApplyNftTransferbyprojectwithchanneltenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyNftTransferbyprojectwithchanneltenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 按项目表编码B2C发放NFT,带渠道租户
         * Summary: 按项目表编码B2C发放NFT,带渠道租户
         */
        public ApplyNftTransferbyprojectwithchanneltenantResponse ApplyNftTransferbyprojectwithchanneltenantEx(ApplyNftTransferbyprojectwithchanneltenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyNftTransferbyprojectwithchanneltenantResponse>(DoRequest("1.0", "antchain.nftx.nft.transferbyprojectwithchanneltenant.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按项目表编码B2C发放NFT,带渠道租户
         * Summary: 按项目表编码B2C发放NFT,带渠道租户
         */
        public async Task<ApplyNftTransferbyprojectwithchanneltenantResponse> ApplyNftTransferbyprojectwithchanneltenantExAsync(ApplyNftTransferbyprojectwithchanneltenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyNftTransferbyprojectwithchanneltenantResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.transferbyprojectwithchanneltenant.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
         * Summary: 校验藏品归属及查询相应藏品信息
         */
        public QueryNftAssetResponse QueryNftAsset(QueryNftAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNftAssetEx(request, headers, runtime);
        }

        /**
         * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
         * Summary: 校验藏品归属及查询相应藏品信息
         */
        public async Task<QueryNftAssetResponse> QueryNftAssetAsync(QueryNftAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNftAssetExAsync(request, headers, runtime);
        }

        /**
         * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
         * Summary: 校验藏品归属及查询相应藏品信息
         */
        public QueryNftAssetResponse QueryNftAssetEx(QueryNftAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftAssetResponse>(DoRequest("1.0", "antchain.nftx.nft.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
         * Summary: 校验藏品归属及查询相应藏品信息
         */
        public async Task<QueryNftAssetResponse> QueryNftAssetExAsync(QueryNftAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftAssetResponse>(await DoRequestAsync("1.0", "antchain.nftx.nft.asset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于直付通模式的开放订单支付接口
         * Summary: 开放订单支付接口
         */
        public PayOrderDataResponse PayOrderData(PayOrderDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PayOrderDataEx(request, headers, runtime);
        }

        /**
         * Description: 基于直付通模式的开放订单支付接口
         * Summary: 开放订单支付接口
         */
        public async Task<PayOrderDataResponse> PayOrderDataAsync(PayOrderDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PayOrderDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 基于直付通模式的开放订单支付接口
         * Summary: 开放订单支付接口
         */
        public PayOrderDataResponse PayOrderDataEx(PayOrderDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayOrderDataResponse>(DoRequest("1.0", "antchain.nftx.order.data.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于直付通模式的开放订单支付接口
         * Summary: 开放订单支付接口
         */
        public async Task<PayOrderDataResponse> PayOrderDataExAsync(PayOrderDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayOrderDataResponse>(await DoRequestAsync("1.0", "antchain.nftx.order.data.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
         * Summary: 外部订单数据同步
         */
        public SyncOrderDataResponse SyncOrderData(SyncOrderDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncOrderDataEx(request, headers, runtime);
        }

        /**
         * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
         * Summary: 外部订单数据同步
         */
        public async Task<SyncOrderDataResponse> SyncOrderDataAsync(SyncOrderDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncOrderDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
         * Summary: 外部订单数据同步
         */
        public SyncOrderDataResponse SyncOrderDataEx(SyncOrderDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncOrderDataResponse>(DoRequest("1.0", "antchain.nftx.order.data.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
         * Summary: 外部订单数据同步
         */
        public async Task<SyncOrderDataResponse> SyncOrderDataExAsync(SyncOrderDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncOrderDataResponse>(await DoRequestAsync("1.0", "antchain.nftx.order.data.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拿authcode换token
         * Summary: 拿authcode换token
         */
        public ApplyOauthTokenResponse ApplyOauthToken(ApplyOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyOauthTokenEx(request, headers, runtime);
        }

        /**
         * Description: 拿authcode换token
         * Summary: 拿authcode换token
         */
        public async Task<ApplyOauthTokenResponse> ApplyOauthTokenAsync(ApplyOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyOauthTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 拿authcode换token
         * Summary: 拿authcode换token
         */
        public ApplyOauthTokenResponse ApplyOauthTokenEx(ApplyOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyOauthTokenResponse>(DoRequest("1.0", "antchain.nftx.oauth.token.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拿authcode换token
         * Summary: 拿authcode换token
         */
        public async Task<ApplyOauthTokenResponse> ApplyOauthTokenExAsync(ApplyOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyOauthTokenResponse>(await DoRequestAsync("1.0", "antchain.nftx.oauth.token.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
